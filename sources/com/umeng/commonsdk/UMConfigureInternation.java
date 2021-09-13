package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.UMInternalConfig;
import com.umeng.commonsdk.internal.UMInternalData;
import com.umeng.commonsdk.statistics.common.ULog;

public class UMConfigureInternation {
    private static boolean isInternal = false;

    public static void doSelfCheck(Context context) {
        try {
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                UMWorkDispatch.sendEvent(context, UMInternalConfig.f17518z, UMInternalData.m22265a(context).mo19254a(), null);
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void sendInternal(final Context context) {
        synchronized (UMConfigureInternation.class) {
            if (context != null) {
                try {
                    if (!isInternal) {
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                    String packageName = context.getPackageName();
                                    if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName) && UMEnvelopeBuild.isReadyBuild(context, UMBusinessType.U_INTERNAL)) {
                                        Context context = context;
                                        UMWorkDispatch.sendEvent(context, UMInternalConfig.f17506n, UMInternalData.m22265a(context).mo19254a(), null);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }).start();
                        isInternal = true;
                    }
                } catch (Throwable th) {
                    String str = UMModuleRegister.INNER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("e is ");
                    sb.append(th.getMessage());
                    ULog.m22476e(str, sb.toString());
                }
            }
        }
        return;
    }
}
