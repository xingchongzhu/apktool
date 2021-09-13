package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.UMInternalConfig;
import com.umeng.commonsdk.internal.UMInternalData;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.NetWorkManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.umeng.commonsdk.framework.a */
class UMNetWorkSender implements UMImprintChangeCallback {

    /* renamed from: a */
    private static HandlerThread f17464a = null;

    /* renamed from: b */
    private static Handler f17465b = null;

    /* renamed from: c */
    private static Handler f17466c = null;

    /* renamed from: d */
    private static final int f17467d = 200;

    /* renamed from: e */
    private static final int f17468e = 273;

    /* renamed from: f */
    private static final int f17469f = 274;

    /* renamed from: g */
    private static final int f17470g = 512;

    /* renamed from: h */
    private static final int f17471h = 769;

    /* renamed from: i */
    private static C3195a f17472i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static ConnectivityManager f17473j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static NetworkInfo f17474k = null;

    /* renamed from: l */
    private static IntentFilter f17475l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static boolean f17476m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static ArrayList<UMSenderStateNotify> f17477n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static Object f17478o = new Object();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static ReentrantLock f17479p = new ReentrantLock();

    /* renamed from: q */
    private static final String f17480q = "report_policy";

    /* renamed from: r */
    private static final String f17481r = "report_interval";

    /* renamed from: s */
    private static boolean f17482s = false;

    /* renamed from: t */
    private static final int f17483t = 15;

    /* renamed from: u */
    private static final int f17484u = 3;

    /* renamed from: v */
    private static final int f17485v = 90;

    /* renamed from: w */
    private static int f17486w = 15;

    /* renamed from: x */
    private static Object f17487x = new Object();

    /* renamed from: y */
    private static BroadcastReceiver f17488y = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context appContext = UMModuleRegister.getAppContext();
                try {
                    if (UMNetWorkSender.f17473j != null) {
                        UMNetWorkSender.f17474k = UMNetWorkSender.f17473j.getActiveNetworkInfo();
                        if (UMNetWorkSender.f17474k == null || !UMNetWorkSender.f17474k.isAvailable()) {
                            ULog.m22479i("--->>> network disconnected.");
                            UMNetWorkSender.f17476m = false;
                            return;
                        }
                        ULog.m22479i("--->>> network isAvailable, check if there are any files to send.");
                        UMNetWorkSender.f17476m = true;
                        synchronized (UMNetWorkSender.f17478o) {
                            if (UMNetWorkSender.f17477n != null) {
                                int size = UMNetWorkSender.f17477n.size();
                                if (size > 0) {
                                    for (int i = 0; i < size; i++) {
                                        ((UMSenderStateNotify) UMNetWorkSender.f17477n.get(i)).onConnectionAvailable();
                                    }
                                }
                            }
                        }
                        UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
                        UMNetWorkSender.m22250d();
                        if (UMNetWorkSender.f17474k.getType() == 1 && context != null) {
                            try {
                                if (!UMWorkDispatch.eventHasExist(UMInternalConfig.f17503k)) {
                                    UMWorkDispatch.sendEvent(context, UMInternalConfig.f17503k, UMInternalData.m22265a(context).mo19254a(), null);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
        }
    };

    /* renamed from: com.umeng.commonsdk.framework.a$a */
    /* compiled from: UMNetWorkSender */
    static class C3195a extends FileObserver {
        public C3195a(String str) {
            super(str);
        }

        public void onEvent(int i, String str) {
            if ((i & 8) == 8) {
                StringBuilder sb = new StringBuilder();
                String str2 = "--->>> envelope file created >>> ";
                sb.append(str2);
                sb.append(str);
                ULog.m22467d(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                UMRTLog.m22229i(UMRTLog.RTLOG_TAG, sb2.toString());
                UMNetWorkSender.m22249c(273);
            }
        }
    }

    public UMNetWorkSender(Context context, Handler handler) {
        Context appContext = UMModuleRegister.getAppContext();
        f17473j = (ConnectivityManager) appContext.getSystemService("connectivity");
        f17466c = handler;
        try {
            if (f17464a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f17464a = handlerThread;
                handlerThread.start();
                if (f17472i == null) {
                    C3195a aVar = new C3195a(UMFrUtils.getEnvelopeDirPath(context));
                    f17472i = aVar;
                    aVar.startWatching();
                    ULog.m22467d("--->>> FileMonitor has already started!");
                }
                if (DeviceConfig.checkPermission(appContext, "android.permission.ACCESS_NETWORK_STATE") && f17473j != null && f17475l == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    f17475l = intentFilter;
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    BroadcastReceiver broadcastReceiver = f17488y;
                    if (broadcastReceiver != null) {
                        appContext.registerReceiver(broadcastReceiver, f17475l);
                    }
                }
                m22260n();
                if (f17465b == null) {
                    f17465b = new Handler(f17464a.getLooper()) {
                        /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|16) */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void handleMessage(android.os.Message r4) {
                            /*
                                r3 = this;
                                int r4 = r4.what
                                r0 = 273(0x111, float:3.83E-43)
                                if (r4 == r0) goto L_0x0017
                                r0 = 274(0x112, float:3.84E-43)
                                if (r4 == r0) goto L_0x0013
                                r0 = 512(0x200, float:7.175E-43)
                                if (r4 == r0) goto L_0x000f
                                goto L_0x0031
                            L_0x000f:
                                com.umeng.commonsdk.framework.UMNetWorkSender.m22263q()
                                goto L_0x0031
                            L_0x0013:
                                com.umeng.commonsdk.framework.UMNetWorkSender.m22262p()
                                goto L_0x0031
                            L_0x0017:
                                java.lang.String r4 = "--->>> handleMessage: recv MSG_PROCESS_NEXT msg."
                                com.umeng.commonsdk.statistics.common.ULog.m22467d(r4)
                                java.util.concurrent.locks.ReentrantLock r4 = com.umeng.commonsdk.framework.UMNetWorkSender.f17479p     // Catch:{ all -> 0x0031 }
                                r0 = 1
                                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0031 }
                                r4.tryLock(r0, r2)     // Catch:{ all -> 0x0031 }
                                com.umeng.commonsdk.framework.UMNetWorkSender.m22264r()     // Catch:{ all -> 0x002a }
                            L_0x002a:
                                java.util.concurrent.locks.ReentrantLock r4 = com.umeng.commonsdk.framework.UMNetWorkSender.f17479p     // Catch:{ all -> 0x0031 }
                                r4.unlock()     // Catch:{ all -> 0x0031 }
                            L_0x0031:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMNetWorkSender.C31942.handleMessage(android.os.Message):void");
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f17480q, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f17481r, this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: b */
    public static int m22246b() {
        int i;
        synchronized (f17487x) {
            i = f17486w;
        }
        return i;
    }

    /* renamed from: c */
    public static void m22248c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m22249c(int i) {
        if (f17476m) {
            Handler handler = f17465b;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i;
                f17465b.sendMessage(obtainMessage);
            }
        }
    }

    /* renamed from: d */
    public static void m22250d() {
        if (f17479p.tryLock()) {
            try {
                m22247b(273);
            } finally {
                f17479p.unlock();
            }
        }
    }

    /* renamed from: e */
    public static void m22251e() {
        m22241a((int) f17469f, 3000);
    }

    /* renamed from: n */
    private void m22260n() {
        synchronized (f17487x) {
            if ("11".equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f17480q, ""))) {
                UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f17482s = true;
                f17486w = 15;
                int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f17481r, "15")).intValue();
                String str = UMRTLog.RTLOG_TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("--->>> set report_interval value to: ");
                sb.append(intValue);
                UMRTLog.m22229i(str, sb.toString());
                if (intValue >= 3) {
                    if (intValue <= 90) {
                        f17486w = intValue * 1000;
                    }
                }
                f17486w = 15;
            } else {
                f17482s = false;
            }
        }
    }

    /* renamed from: o */
    private static void m22261o() {
        if (f17464a != null) {
            f17464a = null;
        }
        if (f17465b != null) {
            f17465b = null;
        }
        if (f17466c != null) {
            f17466c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static void m22262p() {
        synchronized (f17478o) {
            ArrayList<UMSenderStateNotify> arrayList = f17477n;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        ((UMSenderStateNotify) f17477n.get(i)).onSenderIdle();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m22263q() {
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m22264r() {
        String str = "].";
        ULog.m22467d("--->>> handleProcessNext: Enter...");
        if (f17476m) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                    ULog.m22467d("--->>> The envelope file exists.");
                    if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                        ULog.m22467d("--->>> Number of envelope files is greater than 200, remove old files first.");
                        UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                    }
                    File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                    if (envelopeFile != null) {
                        String path = envelopeFile.getPath();
                        StringBuilder sb = new StringBuilder();
                        sb.append("--->>> Ready to send envelope file [");
                        sb.append(path);
                        sb.append(str);
                        ULog.m22467d(sb.toString());
                        String str2 = UMRTLog.RTLOG_TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("--->>> send envelope file [ ");
                        sb2.append(path);
                        sb2.append(str);
                        UMRTLog.m22229i(str2, sb2.toString());
                        if (new NetWorkManager(appContext).mo19296a(envelopeFile)) {
                            ULog.m22467d("--->>> Send envelope file success, delete it.");
                            if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                                ULog.m22467d("--->>> Failed to delete already processed file. We try again after delete failed.");
                                UMFrUtils.removeEnvelopeFile(envelopeFile);
                            }
                            m22249c(273);
                            return;
                        }
                        ULog.m22467d("--->>> Send envelope file failed, abandon and wait next trigger!");
                        return;
                    }
                }
                m22251e();
            } catch (Throwable th) {
                UMCrashManager.reportCrash(appContext, th);
            }
        }
    }

    public void onImprintValueChanged(String str, String str2) {
        synchronized (f17487x) {
            if (f17480q.equals(str)) {
                if ("11".equals(str2)) {
                    UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f17482s = true;
                } else {
                    f17482s = false;
                }
            }
            if (f17481r.equals(str)) {
                int intValue = Integer.valueOf(str2).intValue();
                String str3 = UMRTLog.RTLOG_TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("--->>> set report_interval value to: ");
                sb.append(intValue);
                UMRTLog.m22229i(str3, sb.toString());
                if (intValue >= 3) {
                    if (intValue <= 90) {
                        f17486w = intValue * 1000;
                        String str4 = UMRTLog.RTLOG_TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("--->>> really set report_interval value to: ");
                        sb2.append(f17486w);
                        UMRTLog.m22229i(str4, sb2.toString());
                    }
                }
                f17486w = 15000;
                String str42 = UMRTLog.RTLOG_TAG;
                StringBuilder sb22 = new StringBuilder();
                sb22.append("--->>> really set report_interval value to: ");
                sb22.append(f17486w);
                UMRTLog.m22229i(str42, sb22.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m22243a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f17478o) {
            try {
                if (f17477n == null) {
                    f17477n = new ArrayList<>();
                }
                if (uMSenderStateNotify != null) {
                    for (int i = 0; i < f17477n.size(); i++) {
                        if (uMSenderStateNotify == f17477n.get(i)) {
                            UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f17477n.add(uMSenderStateNotify);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    /* renamed from: b */
    private static void m22247b(int i) {
        if (f17476m) {
            Handler handler = f17465b;
            if (handler != null && !handler.hasMessages(i)) {
                Message obtainMessage = f17465b.obtainMessage();
                obtainMessage.what = i;
                f17465b.sendMessage(obtainMessage);
            }
        }
    }

    /* renamed from: a */
    public static boolean m22244a() {
        boolean z;
        synchronized (f17487x) {
            z = f17482s;
        }
        return z;
    }

    /* renamed from: a */
    private static void m22242a(int i, long j) {
        if (f17476m) {
            Handler handler = f17465b;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i;
                StringBuilder sb = new StringBuilder();
                sb.append("--->>> sendMsgDelayed: ");
                sb.append(j);
                UMRTLog.m22229i(UMRTLog.RTLOG_TAG, sb.toString());
                f17465b.sendMessageDelayed(obtainMessage, j);
            }
        }
    }

    /* renamed from: a */
    private static void m22241a(int i, int i2) {
        if (f17476m) {
            Handler handler = f17465b;
            if (handler != null) {
                handler.removeMessages(i);
                Message obtainMessage = f17465b.obtainMessage();
                obtainMessage.what = i;
                f17465b.sendMessageDelayed(obtainMessage, (long) i2);
            }
        }
    }
}
