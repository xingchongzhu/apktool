package com.efs.sdk.base.p176a.p187h;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.h.g */
public final class C1731g {

    /* renamed from: a */
    private static String f11411a = null;

    /* renamed from: b */
    private static List<Integer> f11412b = null;

    /* renamed from: c */
    private static long f11413c = -1;

    /* renamed from: a */
    public static int m14316a() {
        return Process.myPid();
    }

    /* renamed from: b */
    public static String m14319b() {
        String str = f11411a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a = m14317a(Process.myPid());
        f11411a = a;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050 A[SYNTHETIC, Splitter:B:20:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14317a(int r6) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0046 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0046 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ all -> 0x0046 }
            r4.append(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = "/cmdline"
            r4.append(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0046 }
            r3.<init>(r6)     // Catch:{ all -> 0x0046 }
            r2.<init>(r3)     // Catch:{ all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r6.<init>()     // Catch:{ all -> 0x0043 }
        L_0x0028:
            int r0 = r1.read()     // Catch:{ all -> 0x0043 }
            if (r0 <= 0) goto L_0x0033
            char r0 = (char) r0     // Catch:{ all -> 0x0043 }
            r6.append(r0)     // Catch:{ all -> 0x0043 }
            goto L_0x0028
        L_0x0033:
            r6.trimToSize()     // Catch:{ all -> 0x0043 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0043 }
            r1.close()     // Catch:{ all -> 0x003e }
            goto L_0x005a
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x005a
        L_0x0043:
            r6 = move-exception
            r0 = r1
            goto L_0x0047
        L_0x0046:
            r6 = move-exception
        L_0x0047:
            java.lang.String r1 = "efs.base"
            java.lang.String r2 = "get process name error"
            com.efs.sdk.base.p176a.p187h.C1728d.m14309b(r1, r2, r6)     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0058:
            java.lang.String r6 = ""
        L_0x005a:
            return r6
        L_0x005b:
            r6 = move-exception
            if (r0 == 0) goto L_0x0066
            r0.close()     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0066:
            goto L_0x0068
        L_0x0067:
            throw r6
        L_0x0068:
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p176a.p187h.C1731g.m14317a(int):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m14318a(Context context, String str) {
        try {
            int parseInt = Integer.parseInt(str);
            List<Integer> list = f11412b;
            boolean z = false;
            if (list != null) {
                if (!list.isEmpty()) {
                    if (f11413c > 0) {
                        if (System.currentTimeMillis() - f11413c <= 600000) {
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                List<Integer> list2 = f11412b;
                if (list2 != null) {
                    list2.clear();
                } else {
                    f11412b = new ArrayList();
                }
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        f11412b.add(Integer.valueOf(runningAppProcessInfo.pid));
                    }
                }
                f11413c = System.currentTimeMillis();
            }
            return f11412b.contains(Integer.valueOf(parseInt));
        } catch (Throwable th) {
            C1728d.m14309b("efs.base", "Process exist judge error", th);
            return true;
        }
    }
}
