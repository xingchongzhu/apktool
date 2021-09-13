package p281f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: f.m */
final class RealBufferedSink implements BufferedSink {

    /* renamed from: a */
    public final C3383c f18775a = new C3383c();

    /* renamed from: b */
    public final Sink f18776b;

    /* renamed from: c */
    boolean f18777c;

    RealBufferedSink(Sink rVar) {
        Objects.requireNonNull(rVar, "sink == null");
        this.f18776b = rVar;
    }

    /* renamed from: c */
    public C3383c mo20196c() {
        return this.f18775a;
    }

    public void close() throws IOException {
        if (!this.f18777c) {
            Throwable th = null;
            try {
                C3383c cVar = this.f18775a;
                long j = cVar.f18751c;
                if (j > 0) {
                    this.f18776b.mo19789f(cVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f18776b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f18777c = true;
            if (th != null) {
                C3388u.m24011e(th);
            }
        }
    }

    /* renamed from: d */
    public Timeout mo19824d() {
        return this.f18776b.mo19824d();
    }

    /* renamed from: e */
    public BufferedSink mo20200e(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f18777c) {
            this.f18775a.mo20200e(bArr, i, i2);
            return mo20228s();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public void mo19789f(C3383c cVar, long j) throws IOException {
        if (!this.f18777c) {
            this.f18775a.mo19789f(cVar, j);
            mo20228s();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public void flush() throws IOException {
        if (!this.f18777c) {
            C3383c cVar = this.f18775a;
            long j = cVar.f18751c;
            if (j > 0) {
                this.f18776b.mo19789f(cVar, j);
            }
            this.f18776b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: g */
    public BufferedSink mo20204g(long j) throws IOException {
        if (!this.f18777c) {
            this.f18775a.mo20204g(j);
            return mo20228s();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: h */
    public BufferedSink mo20206h() throws IOException {
        if (!this.f18777c) {
            long Q = this.f18775a.mo20186Q();
            if (Q > 0) {
                this.f18776b.mo19789f(this.f18775a, Q);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: i */
    public BufferedSink mo20209i(int i) throws IOException {
        if (!this.f18777c) {
            this.f18775a.mo20209i(i);
            return mo20228s();
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f18777c;
    }

    /* renamed from: j */
    public BufferedSink mo20212j(int i) throws IOException {
        if (!this.f18777c) {
            this.f18775a.mo20212j(i);
            return mo20228s();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: n */
    public BufferedSink mo20218n(int i) throws IOException {
        if (!this.f18777c) {
            this.f18775a.mo20218n(i);
            return mo20228s();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: p */
    public BufferedSink mo20220p(byte[] bArr) throws IOException {
        if (!this.f18777c) {
            this.f18775a.mo20220p(bArr);
            return mo20228s();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: s */
    public BufferedSink mo20228s() throws IOException {
        if (!this.f18777c) {
            long D = this.f18775a.mo20173D();
            if (D > 0) {
                this.f18776b.mo19789f(this.f18775a, D);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f18776b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: w */
    public BufferedSink mo20232w(String str) throws IOException {
        if (!this.f18777c) {
            this.f18775a.mo20232w(str);
            return mo20228s();
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f18777c) {
            int write = this.f18775a.write(byteBuffer);
            mo20228s();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
