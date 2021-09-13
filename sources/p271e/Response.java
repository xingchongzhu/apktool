package p271e;

import java.io.Closeable;
import p271e.C3370s.C3371a;

/* renamed from: e.b0 */
public final class Response implements Closeable {

    /* renamed from: a */
    final C3378z f18023a;

    /* renamed from: b */
    final Protocol f18024b;

    /* renamed from: c */
    final int f18025c;

    /* renamed from: d */
    final String f18026d;

    /* renamed from: e */
    final Handshake f18027e;

    /* renamed from: f */
    final C3370s f18028f;

    /* renamed from: g */
    final ResponseBody f18029g;

    /* renamed from: h */
    final Response f18030h;

    /* renamed from: i */
    final Response f18031i;

    /* renamed from: j */
    final Response f18032j;

    /* renamed from: k */
    final long f18033k;

    /* renamed from: l */
    final long f18034l;

    /* renamed from: m */
    private volatile CacheControl f18035m;

    /* renamed from: e.b0$a */
    /* compiled from: Response */
    public static class C3306a {

        /* renamed from: a */
        C3378z f18036a;

        /* renamed from: b */
        Protocol f18037b;

        /* renamed from: c */
        int f18038c;

        /* renamed from: d */
        String f18039d;

        /* renamed from: e */
        Handshake f18040e;

        /* renamed from: f */
        C3371a f18041f;

        /* renamed from: g */
        ResponseBody f18042g;

        /* renamed from: h */
        Response f18043h;

        /* renamed from: i */
        Response f18044i;

        /* renamed from: j */
        Response f18045j;

        /* renamed from: k */
        long f18046k;

        /* renamed from: l */
        long f18047l;

        public C3306a() {
            this.f18038c = -1;
            this.f18041f = new C3371a();
        }

        /* renamed from: e */
        private void m22971e(Response b0Var) {
            if (b0Var.f18029g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        private void m22972f(String str, Response b0Var) {
            if (b0Var.f18029g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (b0Var.f18030h != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (b0Var.f18031i != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (b0Var.f18032j != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* renamed from: a */
        public C3306a mo19675a(String str, String str2) {
            this.f18041f.mo20057a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C3306a mo19676b(ResponseBody c0Var) {
            this.f18042g = c0Var;
            return this;
        }

        /* renamed from: c */
        public Response mo19677c() {
            if (this.f18036a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f18037b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f18038c < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("code < 0: ");
                sb.append(this.f18038c);
                throw new IllegalStateException(sb.toString());
            } else if (this.f18039d != null) {
                return new Response(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: d */
        public C3306a mo19678d(Response b0Var) {
            if (b0Var != null) {
                m22972f("cacheResponse", b0Var);
            }
            this.f18044i = b0Var;
            return this;
        }

        /* renamed from: g */
        public C3306a mo19679g(int i) {
            this.f18038c = i;
            return this;
        }

        /* renamed from: h */
        public C3306a mo19680h(Handshake rVar) {
            this.f18040e = rVar;
            return this;
        }

        /* renamed from: i */
        public C3306a mo19681i(String str, String str2) {
            this.f18041f.mo20062f(str, str2);
            return this;
        }

        /* renamed from: j */
        public C3306a mo19682j(C3370s sVar) {
            this.f18041f = sVar.mo20051f();
            return this;
        }

        /* renamed from: k */
        public C3306a mo19683k(String str) {
            this.f18039d = str;
            return this;
        }

        /* renamed from: l */
        public C3306a mo19684l(Response b0Var) {
            if (b0Var != null) {
                m22972f("networkResponse", b0Var);
            }
            this.f18043h = b0Var;
            return this;
        }

        /* renamed from: m */
        public C3306a mo19685m(Response b0Var) {
            if (b0Var != null) {
                m22971e(b0Var);
            }
            this.f18045j = b0Var;
            return this;
        }

        /* renamed from: n */
        public C3306a mo19686n(Protocol xVar) {
            this.f18037b = xVar;
            return this;
        }

        /* renamed from: o */
        public C3306a mo19687o(long j) {
            this.f18047l = j;
            return this;
        }

        /* renamed from: p */
        public C3306a mo19688p(C3378z zVar) {
            this.f18036a = zVar;
            return this;
        }

        /* renamed from: q */
        public C3306a mo19689q(long j) {
            this.f18046k = j;
            return this;
        }

        C3306a(Response b0Var) {
            this.f18038c = -1;
            this.f18036a = b0Var.f18023a;
            this.f18037b = b0Var.f18024b;
            this.f18038c = b0Var.f18025c;
            this.f18039d = b0Var.f18026d;
            this.f18040e = b0Var.f18027e;
            this.f18041f = b0Var.f18028f.mo20051f();
            this.f18042g = b0Var.f18029g;
            this.f18043h = b0Var.f18030h;
            this.f18044i = b0Var.f18031i;
            this.f18045j = b0Var.f18032j;
            this.f18046k = b0Var.f18033k;
            this.f18047l = b0Var.f18034l;
        }
    }

    Response(C3306a aVar) {
        this.f18023a = aVar.f18036a;
        this.f18024b = aVar.f18037b;
        this.f18025c = aVar.f18038c;
        this.f18026d = aVar.f18039d;
        this.f18027e = aVar.f18040e;
        this.f18028f = aVar.f18041f.mo20060d();
        this.f18029g = aVar.f18042g;
        this.f18030h = aVar.f18043h;
        this.f18031i = aVar.f18044i;
        this.f18032j = aVar.f18045j;
        this.f18033k = aVar.f18046k;
        this.f18034l = aVar.f18047l;
    }

    /* renamed from: B */
    public ResponseBody mo19659B() {
        return this.f18029g;
    }

    /* renamed from: C */
    public CacheControl mo19660C() {
        CacheControl dVar = this.f18035m;
        if (dVar != null) {
            return dVar;
        }
        CacheControl k = CacheControl.m23000k(this.f18028f);
        this.f18035m = k;
        return k;
    }

    /* renamed from: D */
    public int mo19661D() {
        return this.f18025c;
    }

    /* renamed from: E */
    public Handshake mo19662E() {
        return this.f18027e;
    }

    /* renamed from: F */
    public String mo19663F(String str) {
        return mo19664G(str, null);
    }

    /* renamed from: G */
    public String mo19664G(String str, String str2) {
        String c = this.f18028f.mo20048c(str);
        return c != null ? c : str2;
    }

    /* renamed from: H */
    public C3370s mo19665H() {
        return this.f18028f;
    }

    /* renamed from: I */
    public boolean mo19666I() {
        int i = this.f18025c;
        return i >= 200 && i < 300;
    }

    /* renamed from: J */
    public String mo19667J() {
        return this.f18026d;
    }

    /* renamed from: K */
    public C3306a mo19668K() {
        return new C3306a(this);
    }

    /* renamed from: L */
    public Response mo19669L() {
        return this.f18032j;
    }

    /* renamed from: M */
    public long mo19670M() {
        return this.f18034l;
    }

    /* renamed from: N */
    public C3378z mo19671N() {
        return this.f18023a;
    }

    /* renamed from: O */
    public long mo19672O() {
        return this.f18033k;
    }

    public void close() {
        ResponseBody c0Var = this.f18029g;
        if (c0Var != null) {
            c0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(this.f18024b);
        sb.append(", code=");
        sb.append(this.f18025c);
        sb.append(", message=");
        sb.append(this.f18026d);
        sb.append(", url=");
        sb.append(this.f18023a.mo20147i());
        sb.append('}');
        return sb.toString();
    }
}
