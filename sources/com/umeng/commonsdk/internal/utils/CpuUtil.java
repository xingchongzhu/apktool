package com.umeng.commonsdk.internal.utils;

import java.io.InputStream;

/* renamed from: com.umeng.commonsdk.internal.utils.d */
public class CpuUtil {

    /* renamed from: com.umeng.commonsdk.internal.utils.d$a */
    /* compiled from: CpuUtil */
    public static class C3207a {

        /* renamed from: a */
        public String f17564a;

        /* renamed from: b */
        public String f17565b;

        /* renamed from: c */
        public int f17566c;

        /* renamed from: d */
        public String f17567d;

        /* renamed from: e */
        public String f17568e;

        /* renamed from: f */
        public String f17569f;

        /* renamed from: g */
        public String f17570g;

        /* renamed from: h */
        public String f17571h;

        /* renamed from: i */
        public String f17572i;

        /* renamed from: j */
        public String f17573j;

        /* renamed from: k */
        public String f17574k;

        /* renamed from: l */
        public String f17575l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0122, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0123, code lost:
        r3 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0133, code lost:
        r2 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0118, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0111 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0122 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0002] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0128 A[SYNTHETIC, Splitter:B:110:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x012f A[SYNTHETIC, Splitter:B:114:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0137 A[SYNTHETIC, Splitter:B:121:0x0137] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x013e A[SYNTHETIC, Splitter:B:125:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0118 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0013] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.umeng.commonsdk.internal.utils.CpuUtil.C3207a m22341a() {
        /*
            r0 = 0
            r1 = 0
            com.umeng.commonsdk.internal.utils.d$a r2 = new com.umeng.commonsdk.internal.utils.d$a     // Catch:{ Exception -> 0x0133, all -> 0x0122 }
            r2.<init>()     // Catch:{ Exception -> 0x0133, all -> 0x0122 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x011d, all -> 0x011a }
            r4.<init>(r3)     // Catch:{ Exception -> 0x011d, all -> 0x011a }
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x011e, all -> 0x0118 }
            r5 = 1
            r6 = 0
            r7 = 1
            r8 = 0
        L_0x001b:
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r9 != 0) goto L_0x010e
            int r6 = r6 + r5
            r9 = 30
            if (r6 < r9) goto L_0x0028
            goto L_0x010e
        L_0x0028:
            java.lang.String r9 = ":\\s+"
            r10 = 2
            java.lang.String[] r0 = r0.split(r9, r10)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r7 == 0) goto L_0x003b
            if (r0 == 0) goto L_0x003b
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r9 <= r5) goto L_0x003b
            r7 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17564a = r7     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r7 = 0
        L_0x003b:
            if (r0 == 0) goto L_0x004c
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r9 <= r5) goto L_0x004c
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r10 = "processor"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r9 == 0) goto L_0x004c
            int r8 = r8 + 1
        L_0x004c:
            if (r0 == 0) goto L_0x005f
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r9 <= r5) goto L_0x005f
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r10 = "Features"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r9 == 0) goto L_0x005f
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17567d = r9     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x005f:
            java.lang.String r9 = "implementer"
            if (r0 == 0) goto L_0x0072
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x0072
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            boolean r10 = r10.contains(r9)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 == 0) goto L_0x0072
            r10 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17568e = r10     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x0072:
            if (r0 == 0) goto L_0x0085
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x0085
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r11 = "architecture"
            boolean r10 = r10.contains(r11)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 == 0) goto L_0x0085
            r10 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17569f = r10     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x0085:
            if (r0 == 0) goto L_0x0098
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x0098
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r11 = "variant"
            boolean r10 = r10.contains(r11)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 == 0) goto L_0x0098
            r10 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17570g = r10     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x0098:
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x00ab
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r11 = "part"
            boolean r10 = r10.contains(r11)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 == 0) goto L_0x00ab
            r10 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17571h = r10     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x00ab:
            if (r0 == 0) goto L_0x00be
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x00be
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r11 = "revision"
            boolean r10 = r10.contains(r11)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 == 0) goto L_0x00be
            r10 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17572i = r10     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x00be:
            if (r0 == 0) goto L_0x00d1
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x00d1
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r11 = "Hardware"
            boolean r10 = r10.contains(r11)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 == 0) goto L_0x00d1
            r10 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17573j = r10     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x00d1:
            if (r0 == 0) goto L_0x00e4
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x00e4
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r11 = "Revision"
            boolean r10 = r10.contains(r11)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 == 0) goto L_0x00e4
            r10 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17574k = r10     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x00e4:
            if (r0 == 0) goto L_0x00f7
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x00f7
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            java.lang.String r11 = "Serial"
            boolean r10 = r10.contains(r11)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 == 0) goto L_0x00f7
            r10 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17575l = r10     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x00f7:
            if (r0 == 0) goto L_0x0108
            int r10 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r10 <= r5) goto L_0x0108
            r10 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            boolean r9 = r10.contains(r9)     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            if (r9 == 0) goto L_0x0108
            r0 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            r2.f17568e = r0     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
        L_0x0108:
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x0115, all -> 0x0118 }
            goto L_0x001b
        L_0x010e:
            r3.close()     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            r4.close()     // Catch:{ IOException -> 0x0142 }
            goto L_0x0142
        L_0x0115:
            r0 = r3
            r1 = r8
            goto L_0x0135
        L_0x0118:
            r0 = move-exception
            goto L_0x0126
        L_0x011a:
            r1 = move-exception
            r4 = r0
            goto L_0x0125
        L_0x011d:
            r4 = r0
        L_0x011e:
            r0 = r3
            goto L_0x0135
        L_0x0120:
            r4 = r0
            goto L_0x0135
        L_0x0122:
            r1 = move-exception
            r3 = r0
            r4 = r3
        L_0x0125:
            r0 = r1
        L_0x0126:
            if (r3 == 0) goto L_0x012d
            r3.close()     // Catch:{ IOException -> 0x012c }
            goto L_0x012d
        L_0x012c:
        L_0x012d:
            if (r4 == 0) goto L_0x0132
            r4.close()     // Catch:{ IOException -> 0x0132 }
        L_0x0132:
            throw r0
        L_0x0133:
            r2 = r0
            r4 = r2
        L_0x0135:
            if (r0 == 0) goto L_0x013c
            r0.close()     // Catch:{ IOException -> 0x013b }
            goto L_0x013c
        L_0x013b:
        L_0x013c:
            if (r4 == 0) goto L_0x0141
            r4.close()     // Catch:{ IOException -> 0x0141 }
        L_0x0141:
            r8 = r1
        L_0x0142:
            r2.f17566c = r8
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.CpuUtil.m22341a():com.umeng.commonsdk.internal.utils.d$a");
    }

    /* renamed from: b */
    public static String m22342b() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder(new String[]{"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"}).start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(new String(bArr));
                str = sb.toString();
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* renamed from: c */
    public static String m22343c() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder(new String[]{"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"}).start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(new String(bArr));
                str = sb.toString();
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[SYNTHETIC, Splitter:B:13:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[SYNTHETIC, Splitter:B:19:0x0028] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22344d() {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0026, all -> 0x001d }
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0026, all -> 0x001d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0026, all -> 0x001d }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0026, all -> 0x001d }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x001b, all -> 0x0019 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x001b, all -> 0x0019 }
            r2.close()     // Catch:{ all -> 0x002d }
            goto L_0x002d
        L_0x0019:
            r0 = move-exception
            goto L_0x0020
        L_0x001b:
            r0 = r2
            goto L_0x0026
        L_0x001d:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0020:
            if (r2 == 0) goto L_0x0025
            r2.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            java.lang.String r0 = ""
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.CpuUtil.m22344d():java.lang.String");
    }
}
