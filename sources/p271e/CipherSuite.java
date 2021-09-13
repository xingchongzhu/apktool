package p271e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: e.h */
public final class CipherSuite {

    /* renamed from: A */
    public static final CipherSuite f18447A = m23531c("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* renamed from: A0 */
    public static final CipherSuite f18448A0 = m23531c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);

    /* renamed from: B */
    public static final CipherSuite f18449B = m23531c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* renamed from: B0 */
    public static final CipherSuite f18450B0 = m23531c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);

    /* renamed from: C */
    public static final CipherSuite f18451C = m23531c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* renamed from: C0 */
    public static final CipherSuite f18452C0 = m23531c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);

    /* renamed from: D */
    public static final CipherSuite f18453D = m23531c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* renamed from: D0 */
    public static final CipherSuite f18454D0 = m23531c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);

    /* renamed from: E */
    public static final CipherSuite f18455E = m23531c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* renamed from: E0 */
    public static final CipherSuite f18456E0 = m23531c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);

    /* renamed from: F */
    public static final CipherSuite f18457F = m23531c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: F0 */
    public static final CipherSuite f18458F0 = m23531c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);

    /* renamed from: G */
    public static final CipherSuite f18459G = m23531c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* renamed from: G0 */
    public static final CipherSuite f18460G0 = m23531c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);

    /* renamed from: H */
    public static final CipherSuite f18461H = m23531c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* renamed from: H0 */
    public static final CipherSuite f18462H0 = m23531c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);

    /* renamed from: I */
    public static final CipherSuite f18463I = m23531c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* renamed from: I0 */
    public static final CipherSuite f18464I0 = m23531c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);

    /* renamed from: J */
    public static final CipherSuite f18465J = m23531c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: J0 */
    public static final CipherSuite f18466J0 = m23531c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: K */
    public static final CipherSuite f18467K = m23531c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* renamed from: K0 */
    public static final CipherSuite f18468K0 = m23531c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: L */
    public static final CipherSuite f18469L = m23531c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* renamed from: L0 */
    public static final CipherSuite f18470L0 = m23531c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);

    /* renamed from: M */
    public static final CipherSuite f18471M = m23531c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* renamed from: M0 */
    public static final CipherSuite f18472M0 = m23531c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);

    /* renamed from: N */
    public static final CipherSuite f18473N = m23531c("TLS_RSA_WITH_NULL_SHA256", 59);

    /* renamed from: N0 */
    public static final CipherSuite f18474N0 = m23531c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);

    /* renamed from: O */
    public static final CipherSuite f18475O = m23531c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* renamed from: O0 */
    public static final CipherSuite f18476O0 = m23531c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);

    /* renamed from: P */
    public static final CipherSuite f18477P = m23531c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* renamed from: P0 */
    public static final CipherSuite f18478P0 = m23531c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);

    /* renamed from: Q */
    public static final CipherSuite f18479Q = m23531c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* renamed from: Q0 */
    public static final CipherSuite f18480Q0 = m23531c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);

    /* renamed from: R */
    public static final CipherSuite f18481R = m23531c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* renamed from: R0 */
    public static final CipherSuite f18482R0 = m23531c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);

    /* renamed from: S */
    public static final CipherSuite f18483S = m23531c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* renamed from: S0 */
    public static final CipherSuite f18484S0 = m23531c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);

    /* renamed from: T */
    public static final CipherSuite f18485T = m23531c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* renamed from: T0 */
    public static final CipherSuite f18486T0 = m23531c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);

    /* renamed from: U */
    public static final CipherSuite f18487U = m23531c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* renamed from: U0 */
    public static final CipherSuite f18488U0 = m23531c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);

    /* renamed from: V */
    public static final CipherSuite f18489V = m23531c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* renamed from: V0 */
    public static final CipherSuite f18490V0 = m23531c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);

    /* renamed from: W */
    public static final CipherSuite f18491W = m23531c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* renamed from: W0 */
    public static final CipherSuite f18492W0 = m23531c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);

    /* renamed from: X */
    public static final CipherSuite f18493X = m23531c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* renamed from: X0 */
    public static final CipherSuite f18494X0 = m23531c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);

    /* renamed from: Y */
    public static final CipherSuite f18495Y = m23531c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* renamed from: Y0 */
    public static final CipherSuite f18496Y0 = m23531c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: Z */
    public static final CipherSuite f18497Z = m23531c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: Z0 */
    public static final CipherSuite f18498Z0 = m23531c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: a */
    static final Comparator<String> f18499a = new C3361a();

    /* renamed from: a0 */
    public static final CipherSuite f18500a0 = m23531c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: a1 */
    public static final CipherSuite f18501a1 = m23531c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: b */
    private static final Map<String, CipherSuite> f18502b = new LinkedHashMap();

    /* renamed from: b0 */
    public static final CipherSuite f18503b0 = m23531c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: b1 */
    public static final CipherSuite f18504b1 = m23531c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: c */
    public static final CipherSuite f18505c = m23531c("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: c0 */
    public static final CipherSuite f18506c0 = m23531c("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: c1 */
    public static final CipherSuite f18507c1 = m23531c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: d */
    public static final CipherSuite f18508d = m23531c("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: d0 */
    public static final CipherSuite f18509d0 = m23531c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* renamed from: d1 */
    public static final CipherSuite f18510d1 = m23531c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: e */
    public static final CipherSuite f18511e = m23531c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: e0 */
    public static final CipherSuite f18512e0 = m23531c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* renamed from: e1 */
    public static final CipherSuite f18513e1 = m23531c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: f */
    public static final CipherSuite f18514f = m23531c("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: f0 */
    public static final CipherSuite f18515f0 = m23531c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* renamed from: f1 */
    public static final CipherSuite f18516f1 = m23531c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: g */
    public static final CipherSuite f18517g = m23531c("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: g0 */
    public static final CipherSuite f18518g0 = m23531c("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* renamed from: g1 */
    public static final CipherSuite f18519g1 = m23531c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: h */
    public static final CipherSuite f18520h = m23531c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: h0 */
    public static final CipherSuite f18521h0 = m23531c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h1 */
    public static final CipherSuite f18522h1 = m23531c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: i */
    public static final CipherSuite f18523i = m23531c("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: i0 */
    public static final CipherSuite f18524i0 = m23531c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i1 */
    public static final CipherSuite f18525i1 = m23531c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: j */
    public static final CipherSuite f18526j = m23531c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: j0 */
    public static final CipherSuite f18527j0 = m23531c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: j1 */
    public static final CipherSuite f18528j1 = m23531c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: k */
    public static final CipherSuite f18529k = m23531c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: k0 */
    public static final CipherSuite f18530k0 = m23531c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: k1 */
    public static final CipherSuite f18531k1 = m23531c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: l */
    public static final CipherSuite f18532l = m23531c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: l0 */
    public static final CipherSuite f18533l0 = m23531c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* renamed from: l1 */
    public static final CipherSuite f18534l1 = m23531c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: m */
    public static final CipherSuite f18535m = m23531c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: m0 */
    public static final CipherSuite f18536m0 = m23531c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: m1 */
    public static final CipherSuite f18537m1 = m23531c("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: n */
    public static final CipherSuite f18538n = m23531c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: n0 */
    public static final CipherSuite f18539n0 = m23531c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* renamed from: n1 */
    public static final CipherSuite f18540n1 = m23531c("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: o */
    public static final CipherSuite f18541o = m23531c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: o0 */
    public static final CipherSuite f18542o0 = m23531c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: o1 */
    public static final CipherSuite f18543o1 = m23531c("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: p */
    public static final CipherSuite f18544p = m23531c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: p0 */
    public static final CipherSuite f18545p0 = m23531c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: p1 */
    public static final CipherSuite f18546p1 = m23531c("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: q */
    public static final CipherSuite f18547q = m23531c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: q0 */
    public static final CipherSuite f18548q0 = m23531c("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: q1 */
    public static final CipherSuite f18549q1 = m23531c("TLS_AES_256_CCM_8_SHA256", 4869);

    /* renamed from: r */
    public static final CipherSuite f18550r = m23531c("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: r0 */
    public static final CipherSuite f18551r0 = m23531c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: s */
    public static final CipherSuite f18552s = m23531c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: s0 */
    public static final CipherSuite f18553s0 = m23531c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: t */
    public static final CipherSuite f18554t = m23531c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: t0 */
    public static final CipherSuite f18555t0 = m23531c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: u */
    public static final CipherSuite f18556u = m23531c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: u0 */
    public static final CipherSuite f18557u0 = m23531c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: v */
    public static final CipherSuite f18558v = m23531c("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: v0 */
    public static final CipherSuite f18559v0 = m23531c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: w */
    public static final CipherSuite f18560w = m23531c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: w0 */
    public static final CipherSuite f18561w0 = m23531c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: x */
    public static final CipherSuite f18562x = m23531c("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: x0 */
    public static final CipherSuite f18563x0 = m23531c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: y */
    public static final CipherSuite f18564y = m23531c("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* renamed from: y0 */
    public static final CipherSuite f18565y0 = m23531c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* renamed from: z */
    public static final CipherSuite f18566z = m23531c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* renamed from: z0 */
    public static final CipherSuite f18567z0 = m23531c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);

    /* renamed from: r1 */
    final String f18568r1;

    /* renamed from: e.h$a */
    /* compiled from: CipherSuite */
    class C3361a implements Comparator<String> {
        C3361a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (true) {
                int i2 = -1;
                if (i < min) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt != charAt2) {
                        if (charAt >= charAt2) {
                            i2 = 1;
                        }
                        return i2;
                    }
                    i++;
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length >= length2) {
                        i2 = 1;
                    }
                    return i2;
                }
            }
        }
    }

    private CipherSuite(String str) {
        Objects.requireNonNull(str);
        this.f18568r1 = str;
    }

    /* renamed from: a */
    public static synchronized CipherSuite m23529a(String str) {
        CipherSuite hVar;
        synchronized (CipherSuite.class) {
            Map<String, CipherSuite> map = f18502b;
            hVar = (CipherSuite) map.get(str);
            if (hVar == null) {
                hVar = (CipherSuite) map.get(m23532d(str));
                if (hVar == null) {
                    hVar = new CipherSuite(str);
                }
                map.put(str, hVar);
            }
        }
        return hVar;
    }

    /* renamed from: b */
    static List<CipherSuite> m23530b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m23529a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static CipherSuite m23531c(String str, int i) {
        CipherSuite hVar = new CipherSuite(str);
        f18502b.put(str, hVar);
        return hVar;
    }

    /* renamed from: d */
    private static String m23532d(String str) {
        String str2 = "TLS_";
        String str3 = "SSL_";
        if (str.startsWith(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str.substring(4));
            return sb.toString();
        }
        if (str.startsWith(str3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str.substring(4));
            str = sb2.toString();
        }
        return str;
    }

    public String toString() {
        return this.f18568r1;
    }
}
