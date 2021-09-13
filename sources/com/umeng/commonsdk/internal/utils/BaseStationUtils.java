package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.commonsdk.statistics.common.ULog;

/* renamed from: com.umeng.commonsdk.internal.utils.b */
public class BaseStationUtils {

    /* renamed from: b */
    private static final String f17551b = "BaseStationUtils";

    /* renamed from: c */
    private static boolean f17552c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Context f17553d;

    /* renamed from: a */
    PhoneStateListener f17554a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TelephonyManager f17555e;

    /* renamed from: com.umeng.commonsdk.internal.utils.b$a */
    /* compiled from: BaseStationUtils */
    private static class C3204a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final BaseStationUtils f17557a = new BaseStationUtils(BaseStationUtils.f17553d);

        private C3204a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m22330e() {
        String str = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) f17553d.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            String simOperator = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(simOperator)) {
                if (!simOperator.equals("46000")) {
                    if (!simOperator.equals("46002")) {
                        if (simOperator.equals("46001")) {
                            str = "中国联通";
                        } else if (simOperator.equals("46003")) {
                            str = "中国电信";
                        }
                    }
                }
                str = "中国移动";
            }
            return str;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public synchronized void mo19262c() {
        ULog.m22476e(f17551b, "base station unRegisterListener");
        try {
            TelephonyManager telephonyManager = this.f17555e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f17554a, 0);
            }
            f17552c = false;
        } catch (Throwable unused) {
        }
    }

    private BaseStationUtils(Context context) {
        this.f17554a = new PhoneStateListener() {
            /* JADX WARNING: Can't wrap try/catch for region: R(6:8|36|(2:38|39)|40|41|43) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0141 */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x012b A[SYNTHETIC, Splitter:B:38:0x012b] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSignalStrengthsChanged(android.telephony.SignalStrength r10) {
                /*
                    r9 = this;
                    super.onSignalStrengthsChanged(r10)
                    r0 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    java.lang.String r2 = "base station onSignalStrengthsChanged"
                    r3 = 0
                    r1[r3] = r2
                    java.lang.String r2 = "BaseStationUtils"
                    com.umeng.commonsdk.statistics.common.ULog.m22476e(r2, r1)
                    com.umeng.commonsdk.internal.utils.b r1 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    android.content.Context r4 = com.umeng.commonsdk.internal.utils.BaseStationUtils.f17553d     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r5 = "phone"
                    java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ Exception -> 0x0146 }
                    android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch:{ Exception -> 0x0146 }
                    r1.f17555e = r4     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r1 = r10.toString()     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r4 = " "
                    java.lang.String[] r1 = r1.split(r4)     // Catch:{ Exception -> 0x0146 }
                    r4 = 0
                    com.umeng.commonsdk.internal.utils.b r5 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    android.telephony.TelephonyManager r5 = r5.f17555e     // Catch:{ Exception -> 0x0146 }
                    r6 = 9
                    java.lang.String r7 = ""
                    if (r5 == 0) goto L_0x005d
                    com.umeng.commonsdk.internal.utils.b r5 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    android.telephony.TelephonyManager r5 = r5.f17555e     // Catch:{ Exception -> 0x0146 }
                    int r5 = r5.getNetworkType()     // Catch:{ Exception -> 0x0146 }
                    r8 = 13
                    if (r5 != r8) goto L_0x005d
                    r10 = r1[r6]     // Catch:{ Exception -> 0x0146 }
                    int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x0146 }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146 }
                    r1.<init>()     // Catch:{ Exception -> 0x0146 }
                    r1.append(r7)     // Catch:{ Exception -> 0x0146 }
                    r1.append(r10)     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0146 }
                    goto L_0x010d
                L_0x005d:
                    com.umeng.commonsdk.internal.utils.b r1 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    android.telephony.TelephonyManager r1 = r1.f17555e     // Catch:{ Exception -> 0x0146 }
                    if (r1 == 0) goto L_0x00f6
                    com.umeng.commonsdk.internal.utils.b r1 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    android.telephony.TelephonyManager r1 = r1.f17555e     // Catch:{ Exception -> 0x0146 }
                    int r1 = r1.getNetworkType()     // Catch:{ Exception -> 0x0146 }
                    r5 = 8
                    if (r1 == r5) goto L_0x009a
                    com.umeng.commonsdk.internal.utils.b r1 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    android.telephony.TelephonyManager r1 = r1.f17555e     // Catch:{ Exception -> 0x0146 }
                    int r1 = r1.getNetworkType()     // Catch:{ Exception -> 0x0146 }
                    r5 = 10
                    if (r1 == r5) goto L_0x009a
                    com.umeng.commonsdk.internal.utils.b r1 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    android.telephony.TelephonyManager r1 = r1.f17555e     // Catch:{ Exception -> 0x0146 }
                    int r1 = r1.getNetworkType()     // Catch:{ Exception -> 0x0146 }
                    if (r1 == r6) goto L_0x009a
                    com.umeng.commonsdk.internal.utils.b r1 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    android.telephony.TelephonyManager r1 = r1.f17555e     // Catch:{ Exception -> 0x0146 }
                    int r1 = r1.getNetworkType()     // Catch:{ Exception -> 0x0146 }
                    r5 = 3
                    if (r1 != r5) goto L_0x00f6
                L_0x009a:
                    com.umeng.commonsdk.internal.utils.b r1 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r1 = r1.m22330e()     // Catch:{ Exception -> 0x0146 }
                    boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0146 }
                    if (r5 != 0) goto L_0x00b1
                    java.lang.String r5 = "中国移动"
                    boolean r5 = r1.equals(r5)     // Catch:{ Exception -> 0x0146 }
                    if (r5 == 0) goto L_0x00b1
                    java.lang.String r4 = "0"
                    goto L_0x00f4
                L_0x00b1:
                    boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0146 }
                    if (r5 != 0) goto L_0x00d3
                    java.lang.String r5 = "中国联通"
                    boolean r5 = r1.equals(r5)     // Catch:{ Exception -> 0x0146 }
                    if (r5 == 0) goto L_0x00d3
                    int r10 = r10.getCdmaDbm()     // Catch:{ Exception -> 0x0146 }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146 }
                    r1.<init>()     // Catch:{ Exception -> 0x0146 }
                    r1.append(r10)     // Catch:{ Exception -> 0x0146 }
                    r1.append(r7)     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0146 }
                    goto L_0x00f4
                L_0x00d3:
                    boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0146 }
                    if (r5 != 0) goto L_0x00f4
                    java.lang.String r5 = "中国电信"
                    boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x0146 }
                    if (r1 == 0) goto L_0x00f4
                    int r10 = r10.getEvdoDbm()     // Catch:{ Exception -> 0x0146 }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146 }
                    r1.<init>()     // Catch:{ Exception -> 0x0146 }
                    r1.append(r10)     // Catch:{ Exception -> 0x0146 }
                    r1.append(r7)     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0146 }
                L_0x00f4:
                    r10 = r4
                    goto L_0x010d
                L_0x00f6:
                    int r10 = r10.getGsmSignalStrength()     // Catch:{ Exception -> 0x0146 }
                    int r10 = r10 * 2
                    int r10 = r10 + -113
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146 }
                    r1.<init>()     // Catch:{ Exception -> 0x0146 }
                    r1.append(r10)     // Catch:{ Exception -> 0x0146 }
                    r1.append(r7)     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0146 }
                L_0x010d:
                    java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0146 }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146 }
                    r1.<init>()     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r4 = "stationStrength is "
                    r1.append(r4)     // Catch:{ Exception -> 0x0146 }
                    r1.append(r10)     // Catch:{ Exception -> 0x0146 }
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0146 }
                    r0[r3] = r1     // Catch:{ Exception -> 0x0146 }
                    com.umeng.commonsdk.statistics.common.ULog.m22476e(r2, r0)     // Catch:{ Exception -> 0x0146 }
                    boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0146 }
                    if (r0 != 0) goto L_0x0141
                    android.content.Context r0 = com.umeng.commonsdk.internal.utils.BaseStationUtils.f17553d     // Catch:{ all -> 0x0141 }
                    r1 = 32772(0x8004, float:4.5923E-41)
                    android.content.Context r2 = com.umeng.commonsdk.internal.utils.BaseStationUtils.f17553d     // Catch:{ all -> 0x0141 }
                    com.umeng.commonsdk.internal.b r2 = com.umeng.commonsdk.internal.UMInternalData.m22265a(r2)     // Catch:{ all -> 0x0141 }
                    com.umeng.commonsdk.internal.c r2 = r2.mo19254a()     // Catch:{ all -> 0x0141 }
                    com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r1, r2, r10)     // Catch:{ all -> 0x0141 }
                L_0x0141:
                    com.umeng.commonsdk.internal.utils.b r10 = com.umeng.commonsdk.internal.utils.BaseStationUtils.this     // Catch:{ Exception -> 0x0146 }
                    r10.mo19262c()     // Catch:{ Exception -> 0x0146 }
                L_0x0146:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.BaseStationUtils.C32031.onSignalStrengthsChanged(android.telephony.SignalStrength):void");
            }
        };
        if (context != null) {
            try {
                this.f17555e = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo19261b() {
        ULog.m22476e(f17551b, "base station registerListener");
        try {
            TelephonyManager telephonyManager = this.f17555e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f17554a, LogType.UNEXP);
            }
            f17552c = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static BaseStationUtils m22327a(Context context) {
        if (f17553d == null && context != null) {
            f17553d = context.getApplicationContext();
        }
        return C3204a.f17557a;
    }

    /* renamed from: a */
    public synchronized boolean mo19260a() {
        return f17552c;
    }
}
