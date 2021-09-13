package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.k */
public class UMProbe {

    /* renamed from: a */
    public static final String f17600a = "UM_PROBE_DATA";

    /* renamed from: b */
    public static final String f17601b = "_dsk_s";

    /* renamed from: c */
    public static final String f17602c = "_thm_z";

    /* renamed from: d */
    public static final String f17603d = "_gdf_r";

    /* renamed from: e */
    private static Object f17604e = new Object();

    /* renamed from: b */
    public static void m22368b(final Context context) {
        if (!m22371c(context)) {
            String str = "unknown";
            final String[] strArr = {str, str, str};
            new Thread() {
                public void run() {
                    super.run();
                    try {
                        strArr[0] = UMProbe.m22370c();
                        strArr[1] = UMProbe.m22364a();
                        strArr[2] = UMProbe.m22367b();
                        StringBuilder sb = new StringBuilder();
                        sb.append("diskType = ");
                        sb.append(strArr[0]);
                        sb.append("; ThremalZone = ");
                        sb.append(strArr[1]);
                        sb.append("; GoldFishRc = ");
                        sb.append(strArr[2]);
                        ULog.m22479i(sb.toString());
                        UMProbe.m22369b(context, strArr);
                    } catch (Throwable th) {
                        UMCrashManager.reportCrash(context, th);
                    }
                }
            }.start();
        }
    }

    /* renamed from: c */
    public static boolean m22371c(Context context) {
        if (context == null) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17600a, 0);
        if (sharedPreferences == null || TextUtils.isEmpty(sharedPreferences.getString(f17601b, ""))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m22365a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17600a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            synchronized (f17604e) {
                jSONObject.put(f17601b, sharedPreferences.getString(f17601b, ""));
                jSONObject.put(f17602c, sharedPreferences.getString(f17602c, ""));
                jSONObject.put(f17603d, sharedPreferences.getString(f17603d, ""));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22369b(Context context, String[] strArr) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17600a, 0);
            if (sharedPreferences != null) {
                synchronized (f17604e) {
                    sharedPreferences.edit().putString(f17601b, strArr[0]).putString(f17602c, strArr[1]).putString(f17603d, strArr[2]).commit();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[SYNTHETIC, Splitter:B:22:0x0039] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22370c() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0034 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "/proc/diskstats"
            r2.<init>(r3)     // Catch:{ all -> 0x0034 }
            r1.<init>(r2)     // Catch:{ all -> 0x0034 }
        L_0x000d:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "mtd"
            java.lang.String r3 = "sda"
            java.lang.String r4 = "mmcblk"
            if (r0 == 0) goto L_0x0030
            boolean r5 = r0.contains(r4)     // Catch:{ all -> 0x0033 }
            if (r5 == 0) goto L_0x0021
            r2 = r4
            goto L_0x0037
        L_0x0021:
            boolean r4 = r0.contains(r3)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x0029
            r2 = r3
            goto L_0x0037
        L_0x0029:
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000d
            goto L_0x0037
        L_0x0030:
            java.lang.String r2 = "unknown"
            goto L_0x0037
        L_0x0033:
            r0 = r1
        L_0x0034:
            java.lang.String r2 = "noper"
            r1 = r0
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.UMProbe.m22370c():java.lang.String");
    }

    /* renamed from: b */
    public static String m22367b() {
        int i;
        String str = "goldfish";
        try {
            i = m22363a("ls /", str);
        } catch (Throwable unused) {
            i = -1;
        }
        if (i > 0) {
            return str;
        }
        return i < 0 ? "noper" : "unknown";
    }

    /* renamed from: a */
    public static int m22363a(String str, String str2) throws IOException {
        int i;
        int i2 = -1;
        if (VERSION.SDK_INT > 28) {
            return -1;
        }
        Process exec = Runtime.getRuntime().exec(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                if (readLine.contains(str2)) {
                    i = 1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        try {
            if (exec.waitFor() == 0) {
                i2 = i;
            }
        } catch (InterruptedException unused) {
        }
        return i2;
    }

    /* renamed from: a */
    public static String m22364a() {
        int i;
        String str = "thermal_zone";
        try {
            i = m22363a("ls /sys/class/thermal", str);
        } catch (Throwable unused) {
            i = -1;
        }
        if (i > 0) {
            return str;
        }
        return i < 0 ? "noper" : "unknown";
    }
}
