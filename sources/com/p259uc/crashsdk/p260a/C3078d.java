package com.p259uc.crashsdk.p260a;

import com.fasterxml.jackson.core.JsonLocation;
import com.p259uc.crashsdk.C3084b;
import com.p259uc.crashsdk.C3087e;
import com.p259uc.crashsdk.C3093g;
import com.p259uc.crashsdk.ProGuard;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* renamed from: com.uc.crashsdk.a.d */
/* compiled from: ProGuard */
public class C3078d {

    /* renamed from: a */
    static final /* synthetic */ boolean f16257a = true;

    /* renamed from: b */
    private static boolean f16258b = true;

    /* renamed from: c */
    private static final Object f16259c = new Object();

    /* renamed from: d */
    private static boolean f16260d = false;

    /* renamed from: e */
    private static String f16261e = "hsdk";

    /* renamed from: f */
    private static String f16262f = "alid ";

    /* renamed from: g */
    private static String f16263g;

    /* renamed from: h */
    private static final Object f16264h = new Object();

    /* renamed from: i */
    private static String f16265i;

    /* renamed from: a */
    public static void m21000a() {
        C3080f.m21014a(0, new C3079e(JsonLocation.MAX_CONTENT_SNIPPET), C3084b.m21106E() ? 900000 : 90000);
    }

    /* renamed from: b */
    public static String m21003b() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("inv");
            sb.append(f16262f);
            sb.append("cras");
            sb.append(f16261e);
            return sb.toString();
        } catch (Throwable th) {
            C3081g.m21036b(th);
            return "";
        }
    }

    /* renamed from: c */
    static byte[] m21004c() {
        return new byte[]{6, 0, 23, 8};
    }

    /* renamed from: d */
    public static boolean m21005d() {
        try {
            if (!C3087e.m21186E()) {
                if (!C3084b.m21110I()) {
                    m21002a((boolean) f16257a);
                    return f16258b;
                }
            }
            return f16257a;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private static String m21006e() {
        if (C3081g.m21032a(f16265i)) {
            synchronized (f16264h) {
                String str = "https://errlog.umeng.com";
                if (C3093g.m21365P()) {
                    str = "https://errlogos.umeng.com";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/api/crashsdk/validate");
                f16265i = C3081g.m21020a(C3084b.m21150g(), sb.toString(), (boolean) f16257a);
            }
        }
        return f16265i;
    }

    /* renamed from: f */
    private static String m21007f() {
        byte[] bArr;
        byte[] bArr2;
        StringBuilder sb = new StringBuilder();
        m20999a(sb, "platform", C3093g.m21388e());
        m20999a(sb, "pkgname", ProGuard.f16226a);
        m20999a(sb, UMModuleRegister.PROCESS, C3087e.m21281h());
        m20999a(sb, "version", ProGuard.m20943a());
        m20999a(sb, "cver", "3.2.0.4");
        m20999a(sb, "ctag", "release");
        m20999a(sb, "inter", C3093g.m21365P() ? "true" : "false");
        m20999a(sb, UMCommonContent.f16662x, "android");
        String sb2 = sb.toString();
        byte[] bArr3 = new byte[16];
        C3077c.m20987a(bArr3, 0, C3082h.m21088j());
        C3077c.m20987a(bArr3, 4, C3077c.m20990a());
        C3077c.m20987a(bArr3, 8, m21004c());
        C3077c.m20987a(bArr3, 12, ProGuard.m20964f());
        try {
            bArr = C3077c.m20995a(sb2.getBytes(), bArr3, (boolean) f16257a);
        } catch (Throwable th) {
            C3081g.m21027a(th);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        String e = m21006e();
        if (e == null) {
            return null;
        }
        byte[] a = C3077c.m20992a(e, bArr);
        if (a == null) {
            return null;
        }
        try {
            bArr2 = C3077c.m20995a(a, bArr3, false);
        } catch (Throwable th2) {
            C3081g.m21027a(th2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return new String(bArr2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m21001a(int i) {
        if (i == 500) {
            synchronized (f16259c) {
                f16263g = null;
                m21002a(!C3084b.m21104C() ? f16257a : false);
                if (C3081g.m21037b(f16263g)) {
                    C3082h.m21062a(f16263g);
                }
            }
        } else if (!f16257a) {
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21002a(boolean r12) {
        /*
            boolean r0 = f16260d
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = r12 ^ 1
            f16260d = r0
            java.lang.String r0 = com.p259uc.crashsdk.ProGuard.f16227b
            java.lang.String r2 = "2.0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001d
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r0 = com.p259uc.crashsdk.C3084b.m21145c(r0)
            if (r0 == 0) goto L_0x001d
            return r1
        L_0x001d:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21167x()
            if (r0 != 0) goto L_0x0024
            return r1
        L_0x0024:
            java.lang.String r0 = com.p259uc.crashsdk.C3084b.m21154k()
            java.lang.String r2 = com.p259uc.crashsdk.p260a.C3076b.m20982a(r0)
            r3 = 0
            r4 = 0
            boolean r6 = com.p259uc.crashsdk.p260a.C3081g.m21037b(r2)
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0052
            java.lang.String r6 = " "
            r10 = 4
            java.lang.String[] r2 = r2.split(r6, r10)
            int r6 = r2.length
            if (r6 != r7) goto L_0x0052
            r3 = r2[r1]
            r4 = r2[r9]
            long r4 = com.p259uc.crashsdk.p260a.C3081g.m21038c(r4)
            r2 = r2[r8]
            long r10 = com.p259uc.crashsdk.p260a.C3081g.m21038c(r2)
            int r2 = (int) r10
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            f16258b = r9
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r4
            r4 = 259200000(0xf731400, double:1.280618154E-315)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0080
            java.lang.String r4 = "o"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x006b
        L_0x0069:
            r4 = 0
            goto L_0x0081
        L_0x006b:
            java.lang.String r4 = "2"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0076
            f16258b = r1
            goto L_0x0069
        L_0x0076:
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0080
            f16258b = r1
        L_0x0080:
            r4 = 1
        L_0x0081:
            if (r4 == 0) goto L_0x018b
            if (r12 == 0) goto L_0x0087
            goto L_0x018b
        L_0x0087:
            int r12 = android.os.Process.myPid()
            if (r2 != r12) goto L_0x008e
            return r1
        L_0x008e:
            java.lang.String r12 = "per"
            f16263g = r12
            java.lang.String r12 = m21007f()
            if (r12 == 0) goto L_0x017f
            java.lang.String r2 = "retcode="
            boolean r2 = r12.contains(r2)
            if (r2 == 0) goto L_0x017f
            java.lang.String r2 = "retcode=0"
            boolean r2 = r12.contains(r2)
            if (r2 == 0) goto L_0x00b1
            f16258b = r9
            java.lang.String r2 = "o"
            java.lang.String r3 = "aus"
            f16263g = r3
            goto L_0x00c8
        L_0x00b1:
            f16258b = r1
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00c2
            java.lang.String r2 = "2"
            java.lang.String r3 = "auf2"
            f16263g = r3
            goto L_0x00c8
        L_0x00c2:
            java.lang.String r2 = "1"
            java.lang.String r3 = "auf1"
            f16263g = r3
        L_0x00c8:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "%s %d %d"
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r1] = r2
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r5[r9] = r2
            int r2 = android.os.Process.myPid()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r8] = r2
            java.lang.String r2 = java.lang.String.format(r3, r4, r5)
            com.p259uc.crashsdk.p260a.C3076b.m20984a(r0, r2)
            boolean r0 = com.p259uc.crashsdk.p260a.C3081g.m21037b(r12)
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = "`"
            r2 = 30
            java.lang.String[] r12 = r12.split(r0, r2)
            int r0 = r12.length
            r2 = 0
        L_0x00fb:
            if (r2 >= r0) goto L_0x017e
            r3 = r12[r2]
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4, r8)
            int r4 = r3.length
            if (r4 != r8) goto L_0x017a
            r4 = r3[r1]
            java.lang.String r4 = r4.trim()
            r3 = r3[r9]
            java.lang.String r3 = r3.trim()
            boolean r5 = com.p259uc.crashsdk.p260a.C3081g.m21037b(r3)
            if (r5 == 0) goto L_0x0124
            java.lang.String r5 = "http"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L_0x0124
            r5 = 1
            goto L_0x0125
        L_0x0124:
            r5 = 0
        L_0x0125:
            java.lang.String r6 = "logurl"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0133
            if (r5 == 0) goto L_0x017a
            com.p259uc.crashsdk.C3087e.m21225a(r3, r1)
            goto L_0x017a
        L_0x0133:
            java.lang.String r6 = "staturl"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0141
            if (r5 == 0) goto L_0x017a
            com.p259uc.crashsdk.p260a.C3082h.m21073b(r3)
            goto L_0x017a
        L_0x0141:
            java.lang.String r6 = "policyurl"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x016f
            if (r5 == 0) goto L_0x017a
            java.lang.Object r4 = f16264h
            monitor-enter(r4)
            f16265i = r3     // Catch:{ all -> 0x016c }
            java.lang.String r3 = com.p259uc.crashsdk.C3084b.m21150g()     // Catch:{ all -> 0x016c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            r5.<init>()     // Catch:{ all -> 0x016c }
            java.lang.String r6 = f16265i     // Catch:{ all -> 0x016c }
            r5.append(r6)     // Catch:{ all -> 0x016c }
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch:{ all -> 0x016c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x016c }
            com.p259uc.crashsdk.p260a.C3076b.m20984a(r3, r5)     // Catch:{ all -> 0x016c }
            monitor-exit(r4)     // Catch:{ all -> 0x016c }
            goto L_0x017a
        L_0x016c:
            r12 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x016c }
            throw r12
        L_0x016f:
            java.lang.String r5 = "logpolicy"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x017a
            com.p259uc.crashsdk.C3087e.m21249b(r3)
        L_0x017a:
            int r2 = r2 + 1
            goto L_0x00fb
        L_0x017e:
            return r9
        L_0x017f:
            if (r12 != 0) goto L_0x0186
            java.lang.String r12 = "ner"
            f16263g = r12
            goto L_0x018a
        L_0x0186:
            java.lang.String r12 = "ser"
            f16263g = r12
        L_0x018a:
            return r1
        L_0x018b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.p260a.C3078d.m21002a(boolean):boolean");
    }

    /* renamed from: a */
    private static StringBuilder m20999a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb;
    }
}
