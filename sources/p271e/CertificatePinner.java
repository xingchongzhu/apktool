package p271e;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p271e.p272f0.C3310c;
import p271e.p272f0.p280l.CertificateChainCleaner;
import p281f.ByteString;

/* renamed from: e.g */
public final class CertificatePinner {

    /* renamed from: a */
    public static final CertificatePinner f18439a = new C3359a().mo19975a();

    /* renamed from: b */
    private final Set<C3360b> f18440b;

    /* renamed from: c */
    private final CertificateChainCleaner f18441c;

    /* renamed from: e.g$a */
    /* compiled from: CertificatePinner */
    public static final class C3359a {

        /* renamed from: a */
        private final List<C3360b> f18442a = new ArrayList();

        /* renamed from: a */
        public CertificatePinner mo19975a() {
            return new CertificatePinner(new LinkedHashSet(this.f18442a), null);
        }
    }

    /* renamed from: e.g$b */
    /* compiled from: CertificatePinner */
    static final class C3360b {

        /* renamed from: a */
        final String f18443a;

        /* renamed from: b */
        final String f18444b;

        /* renamed from: c */
        final String f18445c;

        /* renamed from: d */
        final ByteString f18446d;

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
            if (r11.regionMatches(false, r6, r7, 0, r7.length()) != false) goto L_0x0032;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo19976a(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = r10.f18443a
                java.lang.String r1 = "*."
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L_0x0033
                r0 = 46
                int r0 = r11.indexOf(r0)
                int r1 = r11.length()
                int r1 = r1 - r0
                r2 = 1
                int r1 = r1 - r2
                java.lang.String r3 = r10.f18444b
                int r3 = r3.length()
                if (r1 != r3) goto L_0x0031
                r5 = 0
                int r6 = r0 + 1
                java.lang.String r7 = r10.f18444b
                r8 = 0
                int r9 = r7.length()
                r4 = r11
                boolean r11 = r4.regionMatches(r5, r6, r7, r8, r9)
                if (r11 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r2 = 0
            L_0x0032:
                return r2
            L_0x0033:
                java.lang.String r0 = r10.f18444b
                boolean r11 = r11.equals(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.CertificatePinner.C3360b.mo19976a(java.lang.String):boolean");
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3360b) {
                C3360b bVar = (C3360b) obj;
                if (this.f18443a.equals(bVar.f18443a) && this.f18445c.equals(bVar.f18445c) && this.f18446d.equals(bVar.f18446d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f18443a.hashCode()) * 31) + this.f18445c.hashCode()) * 31) + this.f18446d.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f18445c);
            sb.append(this.f18446d.mo20237a());
            return sb.toString();
        }
    }

    CertificatePinner(Set<C3360b> set, CertificateChainCleaner cVar) {
        this.f18440b = set;
        this.f18441c = cVar;
    }

    /* renamed from: c */
    public static String m23521c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder();
            sb.append("sha256/");
            sb.append(m23523e((X509Certificate) certificate).mo20237a());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    static ByteString m23522d(X509Certificate x509Certificate) {
        return ByteString.m23879j(x509Certificate.getPublicKey().getEncoded()).mo20246m();
    }

    /* renamed from: e */
    static ByteString m23523e(X509Certificate x509Certificate) {
        return ByteString.m23879j(x509Certificate.getPublicKey().getEncoded()).mo20247n();
    }

    /* renamed from: a */
    public void mo19970a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        String str2;
        List b = mo19971b(str);
        if (!b.isEmpty()) {
            CertificateChainCleaner cVar = this.f18441c;
            if (cVar != null) {
                list = cVar.mo19944a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = b.size();
                ByteString fVar = null;
                ByteString fVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C3360b bVar = (C3360b) b.get(i2);
                    if (bVar.f18445c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = m23523e(x509Certificate);
                        }
                        if (bVar.f18446d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.f18445c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = m23522d(x509Certificate);
                        }
                        if (bVar.f18446d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported hashAlgorithm: ");
                        sb.append(bVar.f18445c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                str2 = "\n    ";
                if (i3 >= size3) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append(str2);
                sb2.append(m23521c(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
                i3++;
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = b.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C3360b bVar2 = (C3360b) b.get(i4);
                sb2.append(str2);
                sb2.append(bVar2);
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List<C3360b> mo19971b(String str) {
        List<C3360b> emptyList = Collections.emptyList();
        for (C3360b bVar : this.f18440b) {
            if (bVar.mo19976a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3.f18440b.equals(r4.f18440b) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof p271e.CertificatePinner
            if (r1 == 0) goto L_0x001f
            e.f0.l.c r1 = r3.f18441c
            e.g r4 = (p271e.CertificatePinner) r4
            e.f0.l.c r2 = r4.f18441c
            boolean r1 = p271e.p272f0.C3310c.m23062p(r1, r2)
            if (r1 == 0) goto L_0x001f
            java.util.Set<e.g$b> r1 = r3.f18440b
            java.util.Set<e.g$b> r4 = r4.f18440b
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.CertificatePinner.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public CertificatePinner mo19973f(CertificateChainCleaner cVar) {
        if (C3310c.m23062p(this.f18441c, cVar)) {
            return this;
        }
        return new CertificatePinner(this.f18440b, cVar);
    }

    public int hashCode() {
        CertificateChainCleaner cVar = this.f18441c;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f18440b.hashCode();
    }
}
