package p271e.p272f0.p277i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p271e.p272f0.C3310c;
import p281f.BufferedSink;
import p281f.C3383c;

/* renamed from: e.f0.i.j */
final class Http2Writer implements Closeable {

    /* renamed from: a */
    private static final Logger f18390a = Logger.getLogger(Http2.class.getName());

    /* renamed from: b */
    private final BufferedSink f18391b;

    /* renamed from: c */
    private final boolean f18392c;

    /* renamed from: d */
    private final C3383c f18393d;

    /* renamed from: e */
    private int f18394e = 16384;

    /* renamed from: f */
    private boolean f18395f;

    /* renamed from: g */
    final C3329b f18396g;

    Http2Writer(BufferedSink dVar, boolean z) {
        this.f18391b = dVar;
        this.f18392c = z;
        C3383c cVar = new C3383c();
        this.f18393d = cVar;
        this.f18396g = new C3329b(cVar);
    }

    /* renamed from: P */
    private void m23405P(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f18394e, j);
            long j2 = (long) min;
            j -= j2;
            mo19905F(i, min, 9, j == 0 ? (byte) 4 : 0);
            this.f18391b.mo19789f(this.f18393d, j2);
        }
    }

    /* renamed from: Q */
    private static void m23406Q(BufferedSink dVar, int i) throws IOException {
        dVar.mo20218n((i >>> 16) & 255);
        dVar.mo20218n((i >>> 8) & 255);
        dVar.mo20218n(i & 255);
    }

    /* renamed from: B */
    public synchronized void mo19901B(Settings mVar) throws IOException {
        if (!this.f18395f) {
            this.f18394e = mVar.mo19929f(this.f18394e);
            if (mVar.mo19926c() != -1) {
                this.f18396g.mo19834e(mVar.mo19926c());
            }
            mo19905F(0, 0, 4, 1);
            this.f18391b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: C */
    public synchronized void mo19902C() throws IOException {
        if (this.f18395f) {
            throw new IOException("closed");
        } else if (this.f18392c) {
            Logger logger = f18390a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3310c.m23063q(">> CONNECTION %s", Http2.f18272a.mo20243i()));
            }
            this.f18391b.mo20220p(Http2.f18272a.mo20252s());
            this.f18391b.flush();
        }
    }

    /* renamed from: D */
    public synchronized void mo19903D(boolean z, int i, C3383c cVar, int i2) throws IOException {
        if (!this.f18395f) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo19904E(i, b, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public void mo19904E(int i, byte b, C3383c cVar, int i2) throws IOException {
        mo19905F(i, i2, 0, b);
        if (i2 > 0) {
            this.f18391b.mo19789f(cVar, (long) i2);
        }
    }

    /* renamed from: F */
    public void mo19905F(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f18390a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.m23267b(false, i, i2, b, b2));
        }
        int i3 = this.f18394e;
        if (i2 > i3) {
            throw Http2.m23268c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m23406Q(this.f18391b, i2);
            this.f18391b.mo20218n(b & 255);
            this.f18391b.mo20218n(b2 & 255);
            this.f18391b.mo20212j(i & Integer.MAX_VALUE);
        } else {
            throw Http2.m23268c("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: G */
    public synchronized void mo19906G(int i, ErrorCode bVar, byte[] bArr) throws IOException {
        if (this.f18395f) {
            throw new IOException("closed");
        } else if (bVar.f18242m != -1) {
            mo19905F(0, bArr.length + 8, 7, 0);
            this.f18391b.mo20212j(i);
            this.f18391b.mo20212j(bVar.f18242m);
            if (bArr.length > 0) {
                this.f18391b.mo20220p(bArr);
            }
            this.f18391b.flush();
        } else {
            throw Http2.m23268c("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo19907H(boolean z, int i, List<Header> list) throws IOException {
        if (!this.f18395f) {
            this.f18396g.mo19836g(list);
            long Q = this.f18393d.mo20186Q();
            int min = (int) Math.min((long) this.f18394e, Q);
            long j = (long) min;
            byte b = Q == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            mo19905F(i, min, 1, b);
            this.f18391b.mo19789f(this.f18393d, j);
            if (Q > j) {
                m23405P(i, Q - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: I */
    public int mo19908I() {
        return this.f18394e;
    }

    /* renamed from: J */
    public synchronized void mo19909J(boolean z, int i, int i2) throws IOException {
        if (!this.f18395f) {
            mo19905F(0, 8, 6, z ? (byte) 1 : 0);
            this.f18391b.mo20212j(i);
            this.f18391b.mo20212j(i2);
            this.f18391b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: K */
    public synchronized void mo19910K(int i, int i2, List<Header> list) throws IOException {
        if (!this.f18395f) {
            this.f18396g.mo19836g(list);
            long Q = this.f18393d.mo20186Q();
            int min = (int) Math.min((long) (this.f18394e - 4), Q);
            long j = (long) min;
            mo19905F(i, min + 4, 5, Q == j ? (byte) 4 : 0);
            this.f18391b.mo20212j(i2 & Integer.MAX_VALUE);
            this.f18391b.mo19789f(this.f18393d, j);
            if (Q > j) {
                m23405P(i, Q - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: L */
    public synchronized void mo19911L(int i, ErrorCode bVar) throws IOException {
        if (this.f18395f) {
            throw new IOException("closed");
        } else if (bVar.f18242m != -1) {
            mo19905F(i, 4, 3, 0);
            this.f18391b.mo20212j(bVar.f18242m);
            this.f18391b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: M */
    public synchronized void mo19912M(Settings mVar) throws IOException {
        if (!this.f18395f) {
            int i = 0;
            mo19905F(0, mVar.mo19933j() * 6, 4, 0);
            while (i < 10) {
                if (mVar.mo19930g(i)) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    this.f18391b.mo20209i(i2);
                    this.f18391b.mo20212j(mVar.mo19925b(i));
                }
                i++;
            }
            this.f18391b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: N */
    public synchronized void mo19913N(boolean z, int i, int i2, List<Header> list) throws IOException {
        if (!this.f18395f) {
            mo19907H(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: O */
    public synchronized void mo19914O(int i, long j) throws IOException {
        if (this.f18395f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw Http2.m23268c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            mo19905F(i, 4, 8, 0);
            this.f18391b.mo20212j((int) j);
            this.f18391b.flush();
        }
    }

    public synchronized void close() throws IOException {
        this.f18395f = true;
        this.f18391b.close();
    }

    public synchronized void flush() throws IOException {
        if (!this.f18395f) {
            this.f18391b.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
