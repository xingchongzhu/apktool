package com.tv91.p255z.p256g;

import com.tv91.model.DownloadInfo;
import com.tv91.model.Highlight;
import com.tv91.model.Movie;
import com.tv91.model.Paging;
import com.tv91.model.Promotion;
import com.tv91.model.Url;
import com.tv91.model.User;
import com.tv91.model.Version;
import com.tv91.p255z.Api;
import com.tv91.p255z.C3061b;
import com.tv91.p255z.C3061b.C3062a;
import com.tv91.p255z.C3061b.C3063b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import p271e.OkHttpClient;

/* renamed from: com.tv91.z.g.d */
public final class WebApi implements C3061b {

    /* renamed from: a */
    private final OkHttpClient f16189a;

    /* renamed from: b */
    private final String f16190b;

    /* renamed from: c */
    private String[] f16191c;

    /* renamed from: d */
    private boolean f16192d;

    /* renamed from: e */
    private int f16193e;

    public WebApi(OkHttpClient wVar, String str) {
        this.f16189a = wVar;
        this.f16190b = str;
    }

    /* renamed from: b0 */
    private static String m20853b0(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
    }

    /* renamed from: A */
    public /* synthetic */ User mo18630A(String str, String str2) {
        return Api.m20722F(this, str, str2);
    }

    /* renamed from: B */
    public /* synthetic */ void mo18631B(String str) {
        Api.m20738V(this, str);
    }

    /* renamed from: C */
    public /* synthetic */ List mo18632C() {
        return Api.m20756p(this);
    }

    /* renamed from: D */
    public /* synthetic */ void mo18633D(String str, String str2, String str3) {
        Api.m20735S(this, str, str2, str3);
    }

    /* renamed from: E */
    public /* synthetic */ Paging mo18634E(String str, String str2, int i, int i2) {
        return Api.m20763w(this, str, str2, i, i2);
    }

    /* renamed from: F */
    public /* synthetic */ List mo18635F() {
        return Api.m20748h(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r4 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r0.addSuppressed(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        throw r1;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo18636G(java.lang.String r4) throws java.lang.Exception {
        /*
            r3 = this;
            e.z$a r0 = new e.z$a
            r0.<init>()
            e.z$a r4 = r0.mo20159k(r4)
            com.tv91.z.g.b r0 = new com.tv91.z.g.b
            r0.<init>()
            e.z$a r4 = r4.mo20158j(r0)
            e.z$a r4 = r4.mo20151c()
            e.z r4 = r4.mo20150b()
            e.w r0 = r3.f16189a
            e.e r4 = r0.mo20118q(r4)
            e.b0 r4 = r4.mo19718U()
            boolean r0 = r4.mo19666I()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0040
            e.c0 r0 = r4.mo19659B()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r0.mo19693I()     // Catch:{ all -> 0x004e }
            r4.close()
            return r0
        L_0x0038:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "response body is null"
            r0.<init>(r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x0040:
            com.tv91.s.g r0 = new com.tv91.s.g     // Catch:{ all -> 0x004e }
            int r1 = r4.mo19661D()     // Catch:{ all -> 0x004e }
            java.lang.String r2 = r4.mo19667J()     // Catch:{ all -> 0x004e }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            if (r4 == 0) goto L_0x005b
            r4.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r4 = move-exception
            r0.addSuppressed(r4)
        L_0x005b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tv91.p255z.p256g.WebApi.mo18636G(java.lang.String):java.lang.String");
    }

    /* renamed from: H */
    public /* synthetic */ User mo18637H(String str, String str2) {
        return Api.m20721E(this, str, str2);
    }

    /* renamed from: I */
    public /* synthetic */ Object mo18638I(String str, Class cls) {
        return Api.m20726J(this, str, cls);
    }

    /* renamed from: J */
    public /* synthetic */ User mo18639J(String str, String str2) {
        return Api.m20723G(this, str, str2);
    }

    /* renamed from: K */
    public /* synthetic */ void mo18640K(String str, String str2, String str3) {
        Api.m20724H(this, str, str2, str3);
    }

    /* renamed from: L */
    public /* synthetic */ List mo18641L(String str, String str2) {
        return Api.m20720D(this, str, str2);
    }

    /* renamed from: M */
    public /* synthetic */ List mo18642M() {
        return Api.m20760t(this);
    }

    /* renamed from: N */
    public /* synthetic */ String mo18643N(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return Api.m20740X(this, str, str2, i, str3, str4, str5, str6, str7, str8, str9);
    }

    /* renamed from: O */
    public /* synthetic */ List mo18644O(String str, Class cls) {
        return Api.m20727K(this, str, cls);
    }

    /* renamed from: P */
    public /* synthetic */ List mo18645P(String str, String str2) {
        return Api.m20750j(this, str, str2);
    }

    /* renamed from: Q */
    public /* synthetic */ List mo18646Q() {
        return Api.m20745e(this);
    }

    /* renamed from: R */
    public /* synthetic */ void mo18647R(String str, String str2, int i, int i2, int i3) {
        Api.m20729M(this, str, str2, i, i2, i3);
    }

    /* renamed from: S */
    public /* synthetic */ C3063b mo18648S(String str) {
        return Api.m20725I(this, str);
    }

    /* renamed from: T */
    public /* synthetic */ Paging mo18649T(String str, String str2, int i, int i2) {
        return Api.m20762v(this, str, str2, i, i2);
    }

    /* renamed from: U */
    public /* synthetic */ Highlight mo18650U() {
        return Api.m20764x(this);
    }

    /* renamed from: V */
    public /* synthetic */ void mo18651V(String str, String str2, String str3) {
        Api.m20734R(this, str, str2, str3);
    }

    /* renamed from: W */
    public /* synthetic */ DownloadInfo mo18652W(String str, String str2, int i) {
        return Api.m20746f(this, str, str2, i);
    }

    /* renamed from: X */
    public /* synthetic */ Url mo18653X(String str) {
        return Api.m20757q(this, str);
    }

    /* renamed from: Y */
    public /* synthetic */ Paging mo18654Y(int i, int i2, int i3, int[] iArr, String str) {
        return Api.m20718B(this, i, i2, i3, iArr, str);
    }

    /* renamed from: Z */
    public /* synthetic */ void mo18655Z(String str, String str2, String str3, int i) {
        Api.m20736T(this, str, str2, str3, i);
    }

    /* renamed from: a */
    public /* synthetic */ Paging mo18656a(String str, String str2, int i, int i2) {
        return Api.m20749i(this, str, str2, i, i2);
    }

    /* renamed from: a0 */
    public /* synthetic */ String mo18657a0(C3062a aVar) {
        return Api.m20739W(this, aVar);
    }

    /* renamed from: b */
    public /* synthetic */ Paging mo18658b(int i, int i2, int i3, int i4) {
        return Api.m20717A(this, i, i2, i3, i4);
    }

    /* renamed from: c */
    public /* synthetic */ Paging mo18659c(String str, Class cls) {
        return Api.m20728L(this, str, cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        if (r6 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r7.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d4, code lost:
        throw r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo18660d(com.tv91.p255z.C3061b.C3062a r6, java.util.Map<java.lang.String, java.lang.Object> r7) throws java.lang.Exception {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r6 = r6.f16173p0
            java.lang.String r1 = "Action"
            r0.put(r1, r6)
            if (r7 == 0) goto L_0x001b
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r7)
            goto L_0x001d
        L_0x001b:
            java.lang.String r6 = ""
        L_0x001d:
            java.lang.String r7 = "Message"
            r0.put(r7, r6)
            com.tv91.z.g.b r6 = new com.tv91.z.g.b
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            e.q$a r7 = new e.q$a
            r7.<init>()
            java.lang.String r0 = r6.f16187a
            java.lang.String r0 = m20853b0(r0)
            java.lang.String r1 = "data"
            e.q$a r7 = r7.mo20042a(r1, r0)
            e.q r7 = r7.mo20043b()
            java.lang.String[] r0 = r5.f16191c
            if (r0 == 0) goto L_0x0049
            int r1 = r5.f16193e
            r0 = r0[r1]
            goto L_0x004b
        L_0x0049:
            java.lang.String r0 = r5.f16190b
        L_0x004b:
            e.z$a r1 = new e.z$a
            r1.<init>()
            e.z$a r0 = r1.mo20159k(r0)
            java.lang.Class<com.tv91.z.g.b> r1 = com.tv91.p255z.p256g.RequestTag.class
            e.z$a r6 = r0.mo20157i(r1, r6)
            e.z$a r6 = r6.mo20155g(r7)
            e.z r6 = r6.mo20150b()
            e.w r7 = r5.f16189a
            e.e r6 = r7.mo20118q(r6)
            e.b0 r6 = r6.mo19718U()
            boolean r7 = r6.mo19666I()     // Catch:{ all -> 0x00c6 }
            if (r7 == 0) goto L_0x00b8
            e.c0 r7 = r6.mo19659B()     // Catch:{ all -> 0x00c6 }
            if (r7 == 0) goto L_0x00b0
            boolean r0 = r5.f16192d     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00a8
            e.w r0 = r5.f16189a     // Catch:{ all -> 0x00c6 }
            java.util.List r0 = r0.mo20115n()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x0086:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00c6 }
            e.u r1 = (p271e.Interceptor) r1     // Catch:{ all -> 0x00c6 }
            boolean r2 = r1 instanceof com.tv91.p255z.p256g.LogInterceptor     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x0086
            com.tv91.z.g.a r1 = (com.tv91.p255z.p256g.LogInterceptor) r1     // Catch:{ all -> 0x00c6 }
            long r0 = r1.mo18703b()     // Catch:{ all -> 0x00c6 }
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a8
            int r0 = r5.f16193e     // Catch:{ all -> 0x00c6 }
            r0 = r0 ^ 1
            r5.f16193e = r0     // Catch:{ all -> 0x00c6 }
        L_0x00a8:
            java.lang.String r7 = r7.mo19693I()     // Catch:{ all -> 0x00c6 }
            r6.close()
            return r7
        L_0x00b0:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "response body is null"
            r7.<init>(r0)     // Catch:{ all -> 0x00c6 }
            throw r7     // Catch:{ all -> 0x00c6 }
        L_0x00b8:
            com.tv91.s.g r7 = new com.tv91.s.g     // Catch:{ all -> 0x00c6 }
            int r0 = r6.mo19661D()     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = r6.mo19667J()     // Catch:{ all -> 0x00c6 }
            r7.<init>(r0, r1)     // Catch:{ all -> 0x00c6 }
            throw r7     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            if (r6 == 0) goto L_0x00d3
            r6.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r6 = move-exception
            r7.addSuppressed(r6)
        L_0x00d3:
            goto L_0x00d5
        L_0x00d4:
            throw r0
        L_0x00d5:
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tv91.p255z.p256g.WebApi.mo18660d(com.tv91.z.b$a, java.util.Map):java.lang.String");
    }

    /* renamed from: e */
    public /* synthetic */ List mo18661e(String str, String str2, int i) {
        return Api.m20755o(this, str, str2, i);
    }

    /* renamed from: f */
    public /* synthetic */ Version mo18662f(String str) {
        return Api.m20758r(this, str);
    }

    /* renamed from: g */
    public /* synthetic */ User mo18663g(int i) {
        return Api.m20730N(this, i);
    }

    /* renamed from: h */
    public /* synthetic */ void mo18664h(String str, String str2, int i) {
        Api.m20732P(this, str, str2, i);
    }

    /* renamed from: i */
    public /* synthetic */ void mo18665i(String str, String str2, int i) {
        Api.m20741a(this, str, str2, i);
    }

    /* renamed from: j */
    public /* synthetic */ List mo18666j(int i) {
        return Api.m20753m(this, i);
    }

    /* renamed from: k */
    public /* synthetic */ void mo18667k(String str, String str2, int i, int i2, String str3) {
        Api.m20743c(this, str, str2, i, i2, str3);
    }

    /* renamed from: l */
    public /* synthetic */ Promotion mo18668l(String str, String str2, int i) {
        return Api.m20752l(this, str, str2, i);
    }

    /* renamed from: m */
    public /* synthetic */ List mo18669m(int i) {
        return Api.m20719C(this, i);
    }

    /* renamed from: n */
    public /* synthetic */ Movie mo18670n(User user, int i, int i2) {
        return Api.m20765y(this, user, i, i2);
    }

    /* renamed from: o */
    public /* synthetic */ String mo18671o(String str, String str2, int i, int i2, int i3) {
        return Api.m20766z(this, str, str2, i, i2, i3);
    }

    /* renamed from: p */
    public /* synthetic */ Paging mo18672p(String str, String str2, int i, int i2) {
        return Api.m20754n(this, str, str2, i, i2);
    }

    /* renamed from: q */
    public /* synthetic */ String mo18673q() {
        return Api.m20747g(this);
    }

    /* renamed from: r */
    public /* synthetic */ List mo18674r(String str, String str2, String str3) {
        return Api.m20751k(this, str, str2, str3);
    }

    /* renamed from: s */
    public /* synthetic */ void mo18675s(String str, String str2, String str3, String str4) {
        Api.m20742b(this, str, str2, str3, str4);
    }

    /* renamed from: t */
    public /* synthetic */ String mo18676t(String str) {
        return Api.m20737U(this, str);
    }

    /* renamed from: u */
    public /* synthetic */ void mo18677u(int i, int i2, String str, String str2, String str3) {
        Api.m20731O(this, i, i2, str, str2, str3);
    }

    /* renamed from: v */
    public /* synthetic */ Paging mo18678v(int i, int i2) {
        return Api.m20759s(this, i, i2);
    }

    /* renamed from: w */
    public /* synthetic */ void mo18679w(String str, String str2) {
        Api.m20733Q(this, str, str2);
    }

    /* renamed from: x */
    public /* synthetic */ List mo18680x() {
        return Api.m20761u(this);
    }

    /* renamed from: y */
    public /* synthetic */ String mo18681y(String str, String str2, int i, String str3) {
        return Api.m20744d(this, str, str2, i, str3);
    }

    /* renamed from: z */
    public void mo18682z(String... strArr) {
        this.f16191c = strArr;
        boolean z = true;
        if (strArr.length <= 1) {
            z = false;
        }
        this.f16192d = z;
    }
}
