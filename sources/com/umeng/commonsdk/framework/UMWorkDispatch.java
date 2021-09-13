package com.umeng.commonsdk.framework;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.UMUtils;
import org.json.JSONObject;

public class UMWorkDispatch {
    public static final String GENERAL_CONTENT = "content";
    public static final String GENERAL_HEADER = "header";
    public static final String KEY_EXCEPTION = "exception";
    private static final int MSG_AUTO_PROCESS = 769;
    private static final int MSG_CHECKER_TIMER = 771;
    private static final int MSG_DELAY_PROCESS = 770;
    private static final int MSG_QUIT = 784;
    private static final int MSG_SEND_EVENT = 768;
    private static HandlerThread mNetTask;
    private static UMNetWorkSender mSender;
    private static Object mSenderInitLock = new Object();
    private static Handler mTaskHandler;

    private UMWorkDispatch() {
    }

    public static void Quit() {
        Handler handler = mTaskHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = MSG_QUIT;
            mTaskHandler.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: private */
    public static void delayProcess() {
        String str = "exception";
        String str2 = "--->>> delayProcess Enter...";
        ULog.m22467d(str2);
        String str3 = UMRTLog.RTLOG_TAG;
        UMRTLog.m22229i(str3, str2);
        Context appContext = UMModuleRegister.getAppContext();
        if (appContext != null && UMFrUtils.isOnline(appContext)) {
            long maxDataSpace = UMEnvelopeBuild.maxDataSpace(appContext);
            UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName("analytics");
            JSONObject jSONObject = null;
            if (callbackFromModuleName != null) {
                try {
                    jSONObject = callbackFromModuleName.setupReportData(maxDataSpace);
                    if (jSONObject == null) {
                        UMRTLog.m22229i(str3, "--->>> analyticsCB.setupReportData() return null");
                        return;
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.opt("header");
                JSONObject jSONObject3 = (JSONObject) jSONObject.opt("content");
                if (!(jSONObject2 == null || jSONObject3 == null)) {
                    JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(appContext, jSONObject2, jSONObject3);
                    if (buildEnvelopeWithExtHeader != null) {
                        try {
                            if (buildEnvelopeWithExtHeader.has(str)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("--->>> autoProcess: Build envelope error code: ");
                                sb.append(buildEnvelopeWithExtHeader.getInt(str));
                                UMRTLog.m22229i(str3, sb.toString());
                            }
                        } catch (Throwable unused) {
                        }
                        UMRTLog.m22229i(str3, "--->>> autoProcess: removeCacheData ... ");
                        callbackFromModuleName.removeCacheData(buildEnvelopeWithExtHeader);
                    }
                }
            }
        }
    }

    public static synchronized boolean eventHasExist(int i) {
        synchronized (UMWorkDispatch.class) {
            Handler handler = mTaskHandler;
            if (handler == null) {
                return false;
            }
            boolean hasMessages = handler.hasMessages(i);
            return hasMessages;
        }
    }

    /* access modifiers changed from: private */
    public static void handleEvent(Message message) {
        int i = message.arg1;
        Object obj = message.obj;
        UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName(UMModuleRegister.eventType2ModuleName(i));
        if (callbackFromModuleName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("--->>> dispatch:handleEvent: call back workEvent with msg type [ 0x");
            sb.append(Integer.toHexString(i));
            sb.append("]");
            ULog.m22467d(sb.toString());
            callbackFromModuleName.workEvent(obj, i);
        }
    }

    /* access modifiers changed from: private */
    public static void handleQuit() {
        if (mSender != null && mNetTask != null) {
            UMNetWorkSender.m22248c();
            ULog.m22467d("--->>> handleQuit: Quit dispatch thread.");
            mNetTask.quit();
            teardown();
        }
    }

    private static synchronized void init() {
        synchronized (UMWorkDispatch.class) {
            ULog.m22467d("--->>> Dispatch: init Enter...");
            try {
                if (mNetTask == null) {
                    HandlerThread handlerThread = new HandlerThread("work_thread");
                    mNetTask = handlerThread;
                    handlerThread.start();
                    if (mTaskHandler == null) {
                        mTaskHandler = new Handler(mNetTask.getLooper()) {
                            public void handleMessage(Message message) {
                                int i = message.what;
                                if (i == 768) {
                                    UMWorkDispatch.handleEvent(message);
                                } else if (i == UMWorkDispatch.MSG_QUIT) {
                                    UMWorkDispatch.handleQuit();
                                } else if (i == UMWorkDispatch.MSG_DELAY_PROCESS) {
                                    UMWorkDispatch.delayProcess();
                                } else if (i == UMWorkDispatch.MSG_CHECKER_TIMER) {
                                    UMWorkDispatch.handleEvent(message);
                                }
                            }
                        };
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
            ULog.m22467d("--->>> Dispatch: init Exit...");
        }
    }

    public static void registerConnStateObserver(UMSenderStateNotify uMSenderStateNotify) {
        if (mSender != null) {
            UMNetWorkSender.m22243a(uMSenderStateNotify);
        }
    }

    public static synchronized void removeEvent() {
        synchronized (UMWorkDispatch.class) {
            Handler handler = mTaskHandler;
            if (handler != null) {
                handler.removeMessages(MSG_CHECKER_TIMER);
            }
        }
    }

    public static void sendDelayProcessMsg(long j) {
        Handler handler = mTaskHandler;
        if (handler != null) {
            boolean hasMessages = handler.hasMessages(MSG_DELAY_PROCESS);
            String str = UMRTLog.RTLOG_TAG;
            if (hasMessages) {
                UMRTLog.m22229i(str, "--->>> MSG_DELAY_PROCESS has exist. do nothing.");
                return;
            }
            UMRTLog.m22229i(str, "--->>> MSG_DELAY_PROCESS not exist. send it.");
            Message obtainMessage = mTaskHandler.obtainMessage();
            obtainMessage.what = MSG_DELAY_PROCESS;
            mTaskHandler.sendMessageDelayed(obtainMessage, j);
        }
    }

    public static void sendEvent(Context context, int i, UMLogDataProtocol uMLogDataProtocol, Object obj) {
        sendEventInternal(context, 768, i, uMLogDataProtocol, obj, 0);
    }

    public static void sendEventEx(Context context, int i, UMLogDataProtocol uMLogDataProtocol, Object obj, long j) {
        sendEventInternal(context, MSG_CHECKER_TIMER, i, uMLogDataProtocol, obj, j);
    }

    public static void sendEventInternal(Context context, int i, int i2, UMLogDataProtocol uMLogDataProtocol, Object obj, long j) {
        if (context == null || uMLogDataProtocol == null) {
            ULog.m22467d("--->>> Context or UMLogDataProtocol parameter cannot be null!");
            return;
        }
        UMModuleRegister.registerAppContext(context.getApplicationContext());
        if (UMModuleRegister.registerCallback(i2, uMLogDataProtocol)) {
            if (mNetTask == null || mTaskHandler == null) {
                init();
            }
            try {
                if (mTaskHandler != null) {
                    if (UMUtils.isMainProgress(context)) {
                        synchronized (mSenderInitLock) {
                            if (mSender == null) {
                                UMFrUtils.syncLegacyEnvelopeIfNeeded(context);
                                mSender = new UMNetWorkSender(context, mTaskHandler);
                            }
                        }
                    }
                    Message obtainMessage = mTaskHandler.obtainMessage();
                    obtainMessage.what = i;
                    obtainMessage.arg1 = i2;
                    obtainMessage.obj = obj;
                    mTaskHandler.sendMessageDelayed(obtainMessage, j);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    private static void teardown() {
        if (mNetTask != null) {
            mNetTask = null;
        }
        if (mTaskHandler != null) {
            mTaskHandler = null;
        }
        if (mSender != null) {
            mSender = null;
        }
    }

    public static void sendEvent(Context context, int i, UMLogDataProtocol uMLogDataProtocol, Object obj, long j) {
        sendEventInternal(context, 768, i, uMLogDataProtocol, obj, j);
    }

    public static synchronized boolean eventHasExist() {
        synchronized (UMWorkDispatch.class) {
            Handler handler = mTaskHandler;
            if (handler == null) {
                return false;
            }
            boolean hasMessages = handler.hasMessages(MSG_CHECKER_TIMER);
            return hasMessages;
        }
    }
}
