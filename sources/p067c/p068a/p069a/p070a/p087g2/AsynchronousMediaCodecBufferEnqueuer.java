package p067c.p068a.p069a.p070a.p087g2;

import android.media.MediaCodec;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ConditionVariable;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.g2.m */
class AsynchronousMediaCodecBufferEnqueuer {

    /* renamed from: a */
    private static final ArrayDeque<C1019b> f7049a = new ArrayDeque<>();

    /* renamed from: b */
    private static final Object f7050b = new Object();

    /* renamed from: c */
    private final MediaCodec f7051c;

    /* renamed from: d */
    private final HandlerThread f7052d;

    /* renamed from: e */
    private Handler f7053e;

    /* renamed from: f */
    private final AtomicReference<RuntimeException> f7054f;

    /* renamed from: g */
    private final ConditionVariable f7055g;

    /* renamed from: h */
    private final boolean f7056h;

    /* renamed from: i */
    private boolean f7057i;

    /* renamed from: c.a.a.a.g2.m$a */
    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    class C1018a extends Handler {
        C1018a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            AsynchronousMediaCodecBufferEnqueuer.this.m8379f(message);
        }
    }

    /* renamed from: c.a.a.a.g2.m$b */
    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    private static class C1019b {

        /* renamed from: a */
        public int f7059a;

        /* renamed from: b */
        public int f7060b;

        /* renamed from: c */
        public int f7061c;

        /* renamed from: d */
        public final CryptoInfo f7062d = new CryptoInfo();

        /* renamed from: e */
        public long f7063e;

        /* renamed from: f */
        public int f7064f;

        C1019b() {
        }

        /* renamed from: a */
        public void mo6442a(int i, int i2, int i3, long j, int i4) {
            this.f7059a = i;
            this.f7060b = i2;
            this.f7061c = i3;
            this.f7063e = j;
            this.f7064f = i4;
        }
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new ConditionVariable());
    }

    /* renamed from: b */
    private void m8375b() throws InterruptedException {
        this.f7055g.mo7443b();
        ((Handler) Util.m10293i(this.f7053e)).obtainMessage(2).sendToTarget();
        this.f7055g.mo7442a();
    }

    /* renamed from: c */
    private static void m8376c(p067c.p068a.p069a.p070a.p073c2.CryptoInfo bVar, CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = bVar.f5725f;
        cryptoInfo.numBytesOfClearData = m8378e(bVar.f5723d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m8378e(bVar.f5724e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) Assertions.m10153e(m8377d(bVar.f5721b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) Assertions.m10153e(m8377d(bVar.f5720a, cryptoInfo.iv));
        cryptoInfo.mode = bVar.f5722c;
        if (Util.f8398a >= 24) {
            cryptoInfo.setPattern(new Pattern(bVar.f5726g, bVar.f5727h));
        }
    }

    /* renamed from: d */
    private static byte[] m8377d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: e */
    private static int[] m8378e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m8379f(Message message) {
        C1019b bVar;
        int i = message.what;
        if (i == 0) {
            bVar = (C1019b) message.obj;
            m8380g(bVar.f7059a, bVar.f7060b, bVar.f7061c, bVar.f7063e, bVar.f7064f);
        } else if (i != 1) {
            if (i != 2) {
                mo6437q(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f7055g.mo7445d();
            }
            bVar = null;
        } else {
            bVar = (C1019b) message.obj;
            m8381h(bVar.f7059a, bVar.f7060b, bVar.f7062d, bVar.f7063e, bVar.f7064f);
        }
        if (bVar != null) {
            m8386p(bVar);
        }
    }

    /* renamed from: g */
    private void m8380g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f7051c.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            mo6437q(e);
        }
    }

    /* renamed from: h */
    private void m8381h(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        try {
            if (this.f7056h) {
                synchronized (f7050b) {
                    this.f7051c.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
                }
                return;
            }
            this.f7051c.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
        } catch (RuntimeException e) {
            mo6437q(e);
        }
    }

    /* renamed from: j */
    private void m8382j() throws InterruptedException {
        ((Handler) Util.m10293i(this.f7053e)).removeCallbacksAndMessages(null);
        m8375b();
        m8384l();
    }

    /* renamed from: k */
    private static C1019b m8383k() {
        ArrayDeque<C1019b> arrayDeque = f7049a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                C1019b bVar = new C1019b();
                return bVar;
            }
            C1019b bVar2 = (C1019b) arrayDeque.removeFirst();
            return bVar2;
        }
    }

    /* renamed from: l */
    private void m8384l() {
        RuntimeException runtimeException = (RuntimeException) this.f7054f.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* renamed from: m */
    private static boolean m8385m() {
        String J0 = Util.m10256J0(Util.f8400c);
        return J0.contains("samsung") || J0.contains("motorola");
    }

    /* renamed from: p */
    private static void m8386p(C1019b bVar) {
        ArrayDeque<C1019b> arrayDeque = f7049a;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    /* renamed from: i */
    public void mo6434i() {
        if (this.f7057i) {
            try {
                m8382j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: n */
    public void mo6435n(int i, int i2, int i3, long j, int i4) {
        m8384l();
        C1019b k = m8383k();
        k.mo6442a(i, i2, i3, j, i4);
        ((Handler) Util.m10293i(this.f7053e)).obtainMessage(0, k).sendToTarget();
    }

    /* renamed from: o */
    public void mo6436o(int i, int i2, p067c.p068a.p069a.p070a.p073c2.CryptoInfo bVar, long j, int i3) {
        m8384l();
        C1019b k = m8383k();
        k.mo6442a(i, i2, 0, j, i3);
        m8376c(bVar, k.f7062d);
        ((Handler) Util.m10293i(this.f7053e)).obtainMessage(1, k).sendToTarget();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo6437q(RuntimeException runtimeException) {
        this.f7054f.set(runtimeException);
    }

    /* renamed from: r */
    public void mo6438r() {
        if (this.f7057i) {
            mo6434i();
            this.f7052d.quit();
        }
        this.f7057i = false;
    }

    /* renamed from: s */
    public void mo6439s() {
        if (!this.f7057i) {
            this.f7052d.start();
            this.f7053e = new C1018a(this.f7052d.getLooper());
            this.f7057i = true;
        }
    }

    /* renamed from: t */
    public void mo6440t() throws InterruptedException {
        m8375b();
    }

    AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, ConditionVariable jVar) {
        this.f7051c = mediaCodec;
        this.f7052d = handlerThread;
        this.f7055g = jVar;
        this.f7054f = new AtomicReference<>();
        this.f7056h = z || m8385m();
    }
}
