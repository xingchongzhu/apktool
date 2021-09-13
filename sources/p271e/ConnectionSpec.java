package p271e;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p271e.p272f0.C3310c;

/* renamed from: e.k */
public final class ConnectionSpec {

    /* renamed from: a */
    private static final CipherSuite[] f18577a;

    /* renamed from: b */
    private static final CipherSuite[] f18578b;

    /* renamed from: c */
    public static final ConnectionSpec f18579c;

    /* renamed from: d */
    public static final ConnectionSpec f18580d;

    /* renamed from: e */
    public static final ConnectionSpec f18581e;

    /* renamed from: f */
    public static final ConnectionSpec f18582f = new C3363a(false).mo19998a();

    /* renamed from: g */
    final boolean f18583g;

    /* renamed from: h */
    final boolean f18584h;

    /* renamed from: i */
    final String[] f18585i;

    /* renamed from: j */
    final String[] f18586j;

    /* renamed from: e.k$a */
    /* compiled from: ConnectionSpec */
    public static final class C3363a {

        /* renamed from: a */
        boolean f18587a;

        /* renamed from: b */
        String[] f18588b;

        /* renamed from: c */
        String[] f18589c;

        /* renamed from: d */
        boolean f18590d;

        C3363a(boolean z) {
            this.f18587a = z;
        }

        /* renamed from: a */
        public ConnectionSpec mo19998a() {
            return new ConnectionSpec(this);
        }

        /* renamed from: b */
        public C3363a mo19999b(String... strArr) {
            if (!this.f18587a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f18588b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: c */
        public C3363a mo20000c(CipherSuite... hVarArr) {
            if (this.f18587a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].f18568r1;
                }
                return mo19999b(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: d */
        public C3363a mo20001d(boolean z) {
            if (this.f18587a) {
                this.f18590d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: e */
        public C3363a mo20002e(String... strArr) {
            if (!this.f18587a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f18589c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: f */
        public C3363a mo20003f(TlsVersion... e0VarArr) {
            if (this.f18587a) {
                String[] strArr = new String[e0VarArr.length];
                for (int i = 0; i < e0VarArr.length; i++) {
                    strArr[i] = e0VarArr[i].f18083g;
                }
                return mo20002e(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C3363a(ConnectionSpec kVar) {
            this.f18587a = kVar.f18583g;
            this.f18588b = kVar.f18585i;
            this.f18589c = kVar.f18586j;
            this.f18590d = kVar.f18584h;
        }
    }

    static {
        CipherSuite hVar = CipherSuite.f18537m1;
        CipherSuite hVar2 = CipherSuite.f18540n1;
        CipherSuite hVar3 = CipherSuite.f18543o1;
        CipherSuite hVar4 = CipherSuite.f18546p1;
        CipherSuite hVar5 = CipherSuite.f18549q1;
        CipherSuite hVar6 = CipherSuite.f18496Y0;
        CipherSuite hVar7 = CipherSuite.f18507c1;
        CipherSuite hVar8 = CipherSuite.f18498Z0;
        CipherSuite hVar9 = CipherSuite.f18510d1;
        CipherSuite hVar10 = CipherSuite.f18528j1;
        CipherSuite hVar11 = CipherSuite.f18525i1;
        CipherSuite[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11};
        f18577a = hVarArr;
        CipherSuite[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, CipherSuite.f18466J0, CipherSuite.f18468K0, CipherSuite.f18521h0, CipherSuite.f18524i0, CipherSuite.f18457F, CipherSuite.f18465J, CipherSuite.f18526j};
        f18578b = hVarArr2;
        C3363a c = new C3363a(true).mo20000c(hVarArr);
        TlsVersion e0Var = TlsVersion.TLS_1_3;
        TlsVersion e0Var2 = TlsVersion.TLS_1_2;
        f18579c = c.mo20003f(e0Var, e0Var2).mo20001d(true).mo19998a();
        C3363a c2 = new C3363a(true).mo20000c(hVarArr2);
        TlsVersion e0Var3 = TlsVersion.TLS_1_0;
        f18580d = c2.mo20003f(e0Var, e0Var2, TlsVersion.TLS_1_1, e0Var3).mo20001d(true).mo19998a();
        f18581e = new C3363a(true).mo20000c(hVarArr2).mo20003f(e0Var3).mo20001d(true).mo19998a();
    }

    ConnectionSpec(C3363a aVar) {
        this.f18583g = aVar.f18587a;
        this.f18585i = aVar.f18588b;
        this.f18586j = aVar.f18589c;
        this.f18584h = aVar.f18590d;
    }

    /* renamed from: e */
    private ConnectionSpec m23540e(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f18585i != null) {
            strArr = C3310c.m23071y(CipherSuite.f18499a, sSLSocket.getEnabledCipherSuites(), this.f18585i);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f18586j != null) {
            strArr2 = C3310c.m23071y(C3310c.f18102q, sSLSocket.getEnabledProtocols(), this.f18586j);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int v = C3310c.m23068v(CipherSuite.f18499a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && v != -1) {
            strArr = C3310c.m23054h(strArr, supportedCipherSuites[v]);
        }
        return new C3363a(this).mo19999b(strArr).mo20002e(strArr2).mo19998a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19989a(SSLSocket sSLSocket, boolean z) {
        ConnectionSpec e = m23540e(sSLSocket, z);
        String[] strArr = e.f18586j;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e.f18585i;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b */
    public List<CipherSuite> mo19990b() {
        String[] strArr = this.f18585i;
        if (strArr != null) {
            return CipherSuite.m23530b(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo19991c(SSLSocket sSLSocket) {
        if (!this.f18583g) {
            return false;
        }
        String[] strArr = this.f18586j;
        if (strArr != null && !C3310c.m23038A(C3310c.f18102q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f18585i;
        if (strArr2 == null || C3310c.m23038A(CipherSuite.f18499a, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo19992d() {
        return this.f18583g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec kVar = (ConnectionSpec) obj;
        boolean z = this.f18583g;
        if (z != kVar.f18583g) {
            return false;
        }
        return !z || (Arrays.equals(this.f18585i, kVar.f18585i) && Arrays.equals(this.f18586j, kVar.f18586j) && this.f18584h == kVar.f18584h);
    }

    /* renamed from: f */
    public boolean mo19994f() {
        return this.f18584h;
    }

    /* renamed from: g */
    public List<TlsVersion> mo19995g() {
        String[] strArr = this.f18586j;
        if (strArr != null) {
            return TlsVersion.m23023b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f18583g) {
            return ((((527 + Arrays.hashCode(this.f18585i)) * 31) + Arrays.hashCode(this.f18586j)) * 31) + (this.f18584h ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f18583g) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f18585i != null ? mo19990b().toString() : str;
        if (this.f18586j != null) {
            str = mo19995g().toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(cipherSuites=");
        sb.append(obj);
        sb.append(", tlsVersions=");
        sb.append(str);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f18584h);
        sb.append(")");
        return sb.toString();
    }
}
