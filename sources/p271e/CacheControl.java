package p271e;

import java.util.concurrent.TimeUnit;

/* renamed from: e.d */
public final class CacheControl {

    /* renamed from: a */
    public static final CacheControl f18051a = new C3309a().mo19707c().mo19705a();

    /* renamed from: b */
    public static final CacheControl f18052b = new C3309a().mo19708d().mo19706b(Integer.MAX_VALUE, TimeUnit.SECONDS).mo19705a();

    /* renamed from: c */
    private final boolean f18053c;

    /* renamed from: d */
    private final boolean f18054d;

    /* renamed from: e */
    private final int f18055e;

    /* renamed from: f */
    private final int f18056f;

    /* renamed from: g */
    private final boolean f18057g;

    /* renamed from: h */
    private final boolean f18058h;

    /* renamed from: i */
    private final boolean f18059i;

    /* renamed from: j */
    private final int f18060j;

    /* renamed from: k */
    private final int f18061k;

    /* renamed from: l */
    private final boolean f18062l;

    /* renamed from: m */
    private final boolean f18063m;

    /* renamed from: n */
    private final boolean f18064n;

    /* renamed from: o */
    String f18065o;

    /* renamed from: e.d$a */
    /* compiled from: CacheControl */
    public static final class C3309a {

        /* renamed from: a */
        boolean f18066a;

        /* renamed from: b */
        boolean f18067b;

        /* renamed from: c */
        int f18068c = -1;

        /* renamed from: d */
        int f18069d = -1;

        /* renamed from: e */
        int f18070e = -1;

        /* renamed from: f */
        boolean f18071f;

        /* renamed from: g */
        boolean f18072g;

        /* renamed from: h */
        boolean f18073h;

        /* renamed from: a */
        public CacheControl mo19705a() {
            return new CacheControl(this);
        }

        /* renamed from: b */
        public C3309a mo19706b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f18069d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: c */
        public C3309a mo19707c() {
            this.f18066a = true;
            return this;
        }

        /* renamed from: d */
        public C3309a mo19708d() {
            this.f18071f = true;
            return this;
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f18053c = z;
        this.f18054d = z2;
        this.f18055e = i;
        this.f18056f = i2;
        this.f18057g = z3;
        this.f18058h = z4;
        this.f18059i = z5;
        this.f18060j = i3;
        this.f18061k = i4;
        this.f18062l = z6;
        this.f18063m = z7;
        this.f18064n = z8;
        this.f18065o = str;
    }

    /* renamed from: a */
    private String m22999a() {
        StringBuilder sb = new StringBuilder();
        if (this.f18053c) {
            sb.append("no-cache, ");
        }
        if (this.f18054d) {
            sb.append("no-store, ");
        }
        String str = ", ";
        if (this.f18055e != -1) {
            sb.append("max-age=");
            sb.append(this.f18055e);
            sb.append(str);
        }
        if (this.f18056f != -1) {
            sb.append("s-maxage=");
            sb.append(this.f18056f);
            sb.append(str);
        }
        if (this.f18057g) {
            sb.append("private, ");
        }
        if (this.f18058h) {
            sb.append("public, ");
        }
        if (this.f18059i) {
            sb.append("must-revalidate, ");
        }
        if (this.f18060j != -1) {
            sb.append("max-stale=");
            sb.append(this.f18060j);
            sb.append(str);
        }
        if (this.f18061k != -1) {
            sb.append("min-fresh=");
            sb.append(this.f18061k);
            sb.append(str);
        }
        if (this.f18062l) {
            sb.append("only-if-cached, ");
        }
        if (this.f18063m) {
            sb.append("no-transform, ");
        }
        if (this.f18064n) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p271e.CacheControl m23000k(p271e.C3370s r22) {
        /*
            r0 = r22
            int r1 = r22.mo20052g()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x013f
            java.lang.String r2 = r0.mo20049e(r6)
            java.lang.String r4 = r0.mo20053h(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0138
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0138
            java.lang.String r3 = "=,;"
            int r3 = p271e.p272f0.p275g.HttpHeaders.m23174f(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = p271e.p272f0.p275g.HttpHeaders.m23175g(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p271e.p272f0.p275g.HttpHeaders.m23174f(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p271e.p272f0.p275g.HttpHeaders.m23174f(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x0133
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x0133
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c4
            r5 = -1
            int r11 = p271e.p272f0.p275g.HttpHeaders.m23172d(r0, r5)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r12 = p271e.p272f0.p275g.HttpHeaders.m23172d(r0, r5)
            goto L_0x0133
        L_0x00d2:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00dd
            r5 = -1
            r13 = 1
            goto L_0x0133
        L_0x00dd:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e8
            r5 = -1
            r14 = 1
            goto L_0x0133
        L_0x00e8:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f3
            r5 = -1
            r15 = 1
            goto L_0x0133
        L_0x00f3:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = p271e.p272f0.p275g.HttpHeaders.m23172d(r0, r2)
            r5 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0112
            r5 = -1
            int r17 = p271e.p272f0.p275g.HttpHeaders.m23172d(r0, r5)
            goto L_0x0133
        L_0x0112:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011e
            r18 = 1
            goto L_0x0133
        L_0x011e:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0129
            r19 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0133
            r20 = 1
        L_0x0133:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x0138:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x013f:
            if (r7 != 0) goto L_0x0144
            r21 = 0
            goto L_0x0146
        L_0x0144:
            r21 = r8
        L_0x0146:
            e.d r0 = new e.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.CacheControl.m23000k(e.s):e.d");
    }

    /* renamed from: b */
    public boolean mo19695b() {
        return this.f18057g;
    }

    /* renamed from: c */
    public boolean mo19696c() {
        return this.f18058h;
    }

    /* renamed from: d */
    public int mo19697d() {
        return this.f18055e;
    }

    /* renamed from: e */
    public int mo19698e() {
        return this.f18060j;
    }

    /* renamed from: f */
    public int mo19699f() {
        return this.f18061k;
    }

    /* renamed from: g */
    public boolean mo19700g() {
        return this.f18059i;
    }

    /* renamed from: h */
    public boolean mo19701h() {
        return this.f18053c;
    }

    /* renamed from: i */
    public boolean mo19702i() {
        return this.f18054d;
    }

    /* renamed from: j */
    public boolean mo19703j() {
        return this.f18062l;
    }

    public String toString() {
        String str = this.f18065o;
        if (str != null) {
            return str;
        }
        String a = m22999a();
        this.f18065o = a;
        return a;
    }

    CacheControl(C3309a aVar) {
        this.f18053c = aVar.f18066a;
        this.f18054d = aVar.f18067b;
        this.f18055e = aVar.f18068c;
        this.f18056f = -1;
        this.f18057g = false;
        this.f18058h = false;
        this.f18059i = false;
        this.f18060j = aVar.f18069d;
        this.f18061k = aVar.f18070e;
        this.f18062l = aVar.f18071f;
        this.f18063m = aVar.f18072g;
        this.f18064n = aVar.f18073h;
    }
}
