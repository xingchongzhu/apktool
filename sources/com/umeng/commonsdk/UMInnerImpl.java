package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.internal.UMInternalManager;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;

public class UMInnerImpl {
    private static boolean isInternal = false;

    public static synchronized void initAndSendInternal(final Context context) {
        synchronized (UMInnerImpl.class) {
            if (context != null) {
                try {
                    if (!isInternal) {
                        new Thread(new Runnable() {
                            /* JADX WARNING: Can't wrap try/catch for region: R(3:30|31|40) */
                            /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
                                com.umeng.commonsdk.statistics.common.ULog.m22476e(r1, "get station is null ");
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
                                return;
                             */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a1 */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public void run() {
                                /*
                                    r7 = this;
                                    java.lang.String r0 = "e is "
                                    java.lang.String r1 = "internal"
                                    android.content.Context r2 = r7     // Catch:{ all -> 0x00ab }
                                    java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.getCurrentProcessName(r2)     // Catch:{ all -> 0x00ab }
                                    android.content.Context r3 = r7     // Catch:{ all -> 0x00ab }
                                    java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x00ab }
                                    boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00ab }
                                    if (r4 != 0) goto L_0x00b1
                                    boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00ab }
                                    if (r4 != 0) goto L_0x00b1
                                    boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00ab }
                                    if (r2 == 0) goto L_0x00b1
                                    r2 = 0
                                    r3 = 1
                                    android.content.Context r4 = r7     // Catch:{ all -> 0x003a }
                                    com.umeng.commonsdk.internal.utils.c r4 = com.umeng.commonsdk.internal.utils.BatteryUtils.m22335a(r4)     // Catch:{ all -> 0x003a }
                                    boolean r4 = r4.mo19264a()     // Catch:{ all -> 0x003a }
                                    if (r4 != 0) goto L_0x0051
                                    android.content.Context r4 = r7     // Catch:{ all -> 0x003a }
                                    com.umeng.commonsdk.internal.utils.c r4 = com.umeng.commonsdk.internal.utils.BatteryUtils.m22335a(r4)     // Catch:{ all -> 0x003a }
                                    r4.mo19265b()     // Catch:{ all -> 0x003a }
                                    goto L_0x0051
                                L_0x003a:
                                    r4 = move-exception
                                    java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ab }
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
                                    r6.<init>()     // Catch:{ all -> 0x00ab }
                                    r6.append(r0)     // Catch:{ all -> 0x00ab }
                                    r6.append(r4)     // Catch:{ all -> 0x00ab }
                                    java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00ab }
                                    r5[r2] = r4     // Catch:{ all -> 0x00ab }
                                    com.umeng.commonsdk.statistics.common.ULog.m22476e(r1, r5)     // Catch:{ all -> 0x00ab }
                                L_0x0051:
                                    android.content.Context r4 = r7     // Catch:{ all -> 0x0057 }
                                    com.umeng.commonsdk.internal.utils.UMProbe.m22368b(r4)     // Catch:{ all -> 0x0057 }
                                    goto L_0x006e
                                L_0x0057:
                                    r4 = move-exception
                                    java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ab }
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
                                    r6.<init>()     // Catch:{ all -> 0x00ab }
                                    r6.append(r0)     // Catch:{ all -> 0x00ab }
                                    r6.append(r4)     // Catch:{ all -> 0x00ab }
                                    java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00ab }
                                    r5[r2] = r4     // Catch:{ all -> 0x00ab }
                                    com.umeng.commonsdk.statistics.common.ULog.m22476e(r1, r5)     // Catch:{ all -> 0x00ab }
                                L_0x006e:
                                    android.content.Context r4 = r7     // Catch:{ all -> 0x0074 }
                                    com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22309c(r4)     // Catch:{ all -> 0x0074 }
                                    goto L_0x008b
                                L_0x0074:
                                    r4 = move-exception
                                    java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ab }
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
                                    r6.<init>()     // Catch:{ all -> 0x00ab }
                                    r6.append(r0)     // Catch:{ all -> 0x00ab }
                                    r6.append(r4)     // Catch:{ all -> 0x00ab }
                                    java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00ab }
                                    r5[r2] = r0     // Catch:{ all -> 0x00ab }
                                    com.umeng.commonsdk.statistics.common.ULog.m22476e(r1, r5)     // Catch:{ all -> 0x00ab }
                                L_0x008b:
                                    android.content.Context r0 = r7     // Catch:{ all -> 0x00a1 }
                                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.BaseStationUtils.m22327a(r0)     // Catch:{ all -> 0x00a1 }
                                    boolean r0 = r0.mo19260a()     // Catch:{ all -> 0x00a1 }
                                    if (r0 != 0) goto L_0x00b1
                                    android.content.Context r0 = r7     // Catch:{ all -> 0x00a1 }
                                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.BaseStationUtils.m22327a(r0)     // Catch:{ all -> 0x00a1 }
                                    r0.mo19261b()     // Catch:{ all -> 0x00a1 }
                                    goto L_0x00b1
                                L_0x00a1:
                                    java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ab }
                                    java.lang.String r3 = "get station is null "
                                    r0[r2] = r3     // Catch:{ all -> 0x00ab }
                                    com.umeng.commonsdk.statistics.common.ULog.m22476e(r1, r0)     // Catch:{ all -> 0x00ab }
                                    goto L_0x00b1
                                L_0x00ab:
                                    r0 = move-exception
                                    android.content.Context r1 = r7
                                    com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
                                L_0x00b1:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMInnerImpl.C31772.run():void");
                            }
                        }).start();
                        isInternal = true;
                        sendInternal(context);
                    }
                } catch (Throwable th) {
                    String str = UMModuleRegister.INNER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("e is ");
                    sb.append(th.getMessage());
                    ULog.m22476e(str, sb.toString());
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
        return;
    }

    private static synchronized void sendInternal(final Context context) {
        synchronized (UMInnerImpl.class) {
            if (context != null) {
                try {
                    new Thread(new Runnable() {
                        public void run() {
                            try {
                                String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                String packageName = context.getPackageName();
                                if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                    UMInternalManager.m22289b(context);
                                }
                            } catch (Throwable th) {
                                UMCrashManager.reportCrash(context, th);
                            }
                        }
                    }).start();
                    isInternal = true;
                } catch (Throwable th) {
                    String str = UMModuleRegister.INNER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("e is ");
                    sb.append(th.getMessage());
                    ULog.m22476e(str, sb.toString());
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
        return;
    }
}
