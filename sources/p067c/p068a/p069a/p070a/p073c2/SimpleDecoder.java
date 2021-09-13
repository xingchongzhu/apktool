package p067c.p068a.p069a.p070a.p073c2;

import java.util.ArrayDeque;
import p067c.p068a.p069a.p070a.p073c2.DecoderException;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p073c2.OutputBuffer;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.c2.i */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {

    /* renamed from: a */
    private final Thread f5759a;

    /* renamed from: b */
    private final Object f5760b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f5761c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f5762d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f5763e;

    /* renamed from: f */
    private final O[] f5764f;

    /* renamed from: g */
    private int f5765g;

    /* renamed from: h */
    private int f5766h;

    /* renamed from: i */
    private I f5767i;

    /* renamed from: j */
    private E f5768j;

    /* renamed from: k */
    private boolean f5769k;

    /* renamed from: l */
    private boolean f5770l;

    /* renamed from: m */
    private int f5771m;

    /* renamed from: c.a.a.a.c2.i$a */
    /* compiled from: SimpleDecoder */
    class C0856a extends Thread {
        C0856a(String str) {
            super(str);
        }

        public void run() {
            SimpleDecoder.this.m6923u();
        }
    }

    protected SimpleDecoder(I[] iArr, O[] oArr) {
        this.f5763e = iArr;
        this.f5765g = iArr.length;
        for (int i = 0; i < this.f5765g; i++) {
            this.f5763e[i] = mo5974h();
        }
        this.f5764f = oArr;
        this.f5766h = oArr.length;
        for (int i2 = 0; i2 < this.f5766h; i2++) {
            this.f5764f[i2] = mo5975i();
        }
        C0856a aVar = new C0856a("ExoPlayer:SimpleDecoder");
        this.f5759a = aVar;
        aVar.start();
    }

    /* renamed from: g */
    private boolean m6917g() {
        return !this.f5761c.isEmpty() && this.f5766h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.mo5952k() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.mo5946e(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.mo5951j() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.mo5946e(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = mo5977k(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r0 = mo5976j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r0 = mo5976j(r0);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m6918l() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f5760b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f5770l     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.m6917g()     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f5760b     // Catch:{ all -> 0x0090 }
            r1.wait()     // Catch:{ all -> 0x0090 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f5770l     // Catch:{ all -> 0x0090 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f5761c     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0090 }
            c.a.a.a.c2.f r1 = (p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer) r1     // Catch:{ all -> 0x0090 }
            O[] r3 = r6.f5764f     // Catch:{ all -> 0x0090 }
            int r4 = r6.f5766h     // Catch:{ all -> 0x0090 }
            r5 = 1
            int r4 = r4 - r5
            r6.f5766h = r4     // Catch:{ all -> 0x0090 }
            r3 = r3[r4]     // Catch:{ all -> 0x0090 }
            boolean r4 = r6.f5769k     // Catch:{ all -> 0x0090 }
            r6.f5769k = r2     // Catch:{ all -> 0x0090 }
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            boolean r0 = r1.mo5952k()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.mo5946e(r0)
            goto L_0x0063
        L_0x003c:
            boolean r0 = r1.mo5951j()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo5946e(r0)
        L_0x0047:
            c.a.a.a.c2.e r0 = r6.mo5977k(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0052, OutOfMemoryError -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r0 = move-exception
            c.a.a.a.c2.e r0 = r6.mo5976j(r0)
            goto L_0x0057
        L_0x0052:
            r0 = move-exception
            c.a.a.a.c2.e r0 = r6.mo5976j(r0)
        L_0x0057:
            if (r0 == 0) goto L_0x0063
            java.lang.Object r4 = r6.f5760b
            monitor-enter(r4)
            r6.f5768j = r0     // Catch:{ all -> 0x0060 }
            monitor-exit(r4)     // Catch:{ all -> 0x0060 }
            return r2
        L_0x0060:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0060 }
            throw r0
        L_0x0063:
            java.lang.Object r4 = r6.f5760b
            monitor-enter(r4)
            boolean r0 = r6.f5769k     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006e
            r3.mo5972n()     // Catch:{ all -> 0x008d }
            goto L_0x0088
        L_0x006e:
            boolean r0 = r3.mo5951j()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x007d
            int r0 = r6.f5771m     // Catch:{ all -> 0x008d }
            int r0 = r0 + r5
            r6.f5771m = r0     // Catch:{ all -> 0x008d }
            r3.mo5972n()     // Catch:{ all -> 0x008d }
            goto L_0x0088
        L_0x007d:
            int r0 = r6.f5771m     // Catch:{ all -> 0x008d }
            r3.f5758c = r0     // Catch:{ all -> 0x008d }
            r6.f5771m = r2     // Catch:{ all -> 0x008d }
            java.util.ArrayDeque<O> r0 = r6.f5762d     // Catch:{ all -> 0x008d }
            r0.addLast(r3)     // Catch:{ all -> 0x008d }
        L_0x0088:
            r6.m6921r(r1)     // Catch:{ all -> 0x008d }
            monitor-exit(r4)     // Catch:{ all -> 0x008d }
            return r5
        L_0x008d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008d }
            throw r0
        L_0x0090:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0094
        L_0x0093:
            throw r1
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p073c2.SimpleDecoder.m6918l():boolean");
    }

    /* renamed from: o */
    private void m6919o() {
        if (m6917g()) {
            this.f5760b.notify();
        }
    }

    /* renamed from: p */
    private void m6920p() throws DecoderException {
        E e = this.f5768j;
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: r */
    private void m6921r(I i) {
        i.mo5947f();
        I[] iArr = this.f5763e;
        int i2 = this.f5765g;
        this.f5765g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: t */
    private void m6922t(O o) {
        o.mo5947f();
        O[] oArr = this.f5764f;
        int i = this.f5766h;
        this.f5766h = i + 1;
        oArr[i] = o;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m6923u() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m6918l());
    }

    /* renamed from: a */
    public void mo5958a() {
        synchronized (this.f5760b) {
            this.f5770l = true;
            this.f5760b.notify();
        }
        try {
            this.f5759a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void flush() {
        synchronized (this.f5760b) {
            this.f5769k = true;
            this.f5771m = 0;
            I i = this.f5767i;
            if (i != null) {
                m6921r(i);
                this.f5767i = null;
            }
            while (!this.f5761c.isEmpty()) {
                m6921r((DecoderInputBuffer) this.f5761c.removeFirst());
            }
            while (!this.f5762d.isEmpty()) {
                ((OutputBuffer) this.f5762d.removeFirst()).mo5972n();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract I mo5974h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract O mo5975i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract E mo5976j(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract E mo5977k(I i, O o, boolean z);

    /* renamed from: m */
    public final I mo5961e() throws DecoderException {
        I i;
        synchronized (this.f5760b) {
            m6920p();
            Assertions.m10154f(this.f5767i == null);
            int i2 = this.f5765g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f5763e;
                int i3 = i2 - 1;
                this.f5765g = i3;
                i = iArr[i3];
            }
            this.f5767i = i;
        }
        return i;
    }

    /* renamed from: n */
    public final O mo5960d() throws DecoderException {
        synchronized (this.f5760b) {
            m6920p();
            if (this.f5762d.isEmpty()) {
                return null;
            }
            O o = (OutputBuffer) this.f5762d.removeFirst();
            return o;
        }
    }

    /* renamed from: q */
    public final void mo5959c(I i) throws DecoderException {
        synchronized (this.f5760b) {
            m6920p();
            Assertions.m10149a(i == this.f5767i);
            this.f5761c.addLast(i);
            m6919o();
            this.f5767i = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo5981s(O o) {
        synchronized (this.f5760b) {
            m6922t(o);
            m6919o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo5982v(int i) {
        Assertions.m10154f(this.f5765g == this.f5763e.length);
        for (I o : this.f5763e) {
            o.mo5965o(i);
        }
    }
}
