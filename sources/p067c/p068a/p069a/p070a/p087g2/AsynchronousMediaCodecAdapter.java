package p067c.p068a.p069a.p070a.p087g2;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Objects;
import p067c.p068a.p069a.p070a.p073c2.CryptoInfo;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1020a;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1021b;
import p067c.p068a.p134b.p135a.C1325k;

/* renamed from: c.a.a.a.g2.l */
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* renamed from: a */
    private final MediaCodec f7039a;

    /* renamed from: b */
    private final AsynchronousMediaCodecCallback f7040b;

    /* renamed from: c */
    private final AsynchronousMediaCodecBufferEnqueuer f7041c;

    /* renamed from: d */
    private final boolean f7042d;

    /* renamed from: e */
    private boolean f7043e;

    /* renamed from: f */
    private int f7044f;

    /* renamed from: c.a.a.a.g2.l$b */
    /* compiled from: AsynchronousMediaCodecAdapter */
    public static final class C1017b implements C1020a {

        /* renamed from: b */
        private final C1325k<HandlerThread> f7045b;

        /* renamed from: c */
        private final C1325k<HandlerThread> f7046c;

        /* renamed from: d */
        private final boolean f7047d;

        /* renamed from: e */
        private final boolean f7048e;

        public C1017b(int i, boolean z, boolean z2) {
            this(new C1005a(i), new C1006b(i), z, z2);
        }

        /* renamed from: c */
        static /* synthetic */ HandlerThread m8370c(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.m8349r(i));
        }

        /* renamed from: d */
        static /* synthetic */ HandlerThread m8371d(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.m8350s(i));
        }

        /* renamed from: b */
        public AsynchronousMediaCodecAdapter mo6432a(MediaCodec mediaCodec) {
            AsynchronousMediaCodecAdapter lVar = new AsynchronousMediaCodecAdapter(mediaCodec, (HandlerThread) this.f7045b.mo5610a(), (HandlerThread) this.f7046c.mo5610a(), this.f7047d, this.f7048e);
            return lVar;
        }

        C1017b(C1325k<HandlerThread> kVar, C1325k<HandlerThread> kVar2, boolean z, boolean z2) {
            this.f7045b = kVar;
            this.f7046c = kVar2;
            this.f7047d = z;
            this.f7048e = z2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static String m8349r(int i) {
        return m8351t(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static String m8350s(int i) {
        return m8351t(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: t */
    private static String m8351t(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void mo6431v(C1021b bVar, MediaCodec mediaCodec, long j, long j2) {
        bVar.mo6462a(this, j, j2);
    }

    /* renamed from: w */
    private void m8353w() {
        if (this.f7042d) {
            try {
                this.f7041c.mo6440t();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    public void mo6414a() {
        try {
            if (this.f7044f == 2) {
                this.f7041c.mo6438r();
            }
            int i = this.f7044f;
            if (i == 1 || i == 2) {
                this.f7040b.mo6453q();
            }
            this.f7044f = 3;
        } finally {
            if (!this.f7043e) {
                this.f7039a.release();
                this.f7043e = true;
            }
        }
    }

    /* renamed from: b */
    public int mo6415b(BufferInfo bufferInfo) {
        return this.f7040b.mo6444c(bufferInfo);
    }

    /* renamed from: c */
    public void mo6416c(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f7040b.mo6447g(this.f7039a);
        this.f7039a.configure(mediaFormat, surface, mediaCrypto, i);
        this.f7044f = 1;
    }

    /* renamed from: d */
    public void mo6417d(C1021b bVar, Handler handler) {
        m8353w();
        this.f7039a.setOnFrameRenderedListener(new C1007c(this, bVar), handler);
    }

    /* renamed from: e */
    public void mo6418e(int i, boolean z) {
        this.f7039a.releaseOutputBuffer(i, z);
    }

    /* renamed from: f */
    public void mo6419f(int i, int i2, CryptoInfo bVar, long j, int i3) {
        this.f7041c.mo6436o(i, i2, bVar, j, i3);
    }

    public void flush() {
        this.f7041c.mo6434i();
        this.f7039a.flush();
        AsynchronousMediaCodecCallback nVar = this.f7040b;
        MediaCodec mediaCodec = this.f7039a;
        Objects.requireNonNull(mediaCodec);
        nVar.mo6445d(new C1014j(mediaCodec));
    }

    /* renamed from: g */
    public void mo6421g(int i) {
        m8353w();
        this.f7039a.setVideoScalingMode(i);
    }

    /* renamed from: h */
    public MediaFormat mo6422h() {
        return this.f7040b.mo6446f();
    }

    /* renamed from: i */
    public ByteBuffer mo6423i(int i) {
        return this.f7039a.getInputBuffer(i);
    }

    /* renamed from: j */
    public void mo6424j(Surface surface) {
        m8353w();
        this.f7039a.setOutputSurface(surface);
    }

    /* renamed from: k */
    public void mo6425k(int i, int i2, int i3, long j, int i4) {
        this.f7041c.mo6435n(i, i2, i3, j, i4);
    }

    /* renamed from: l */
    public void mo6426l(Bundle bundle) {
        m8353w();
        this.f7039a.setParameters(bundle);
    }

    /* renamed from: m */
    public ByteBuffer mo6427m(int i) {
        return this.f7039a.getOutputBuffer(i);
    }

    /* renamed from: n */
    public void mo6428n(int i, long j) {
        this.f7039a.releaseOutputBuffer(i, j);
    }

    /* renamed from: o */
    public int mo6429o() {
        return this.f7040b.mo6443b();
    }

    public void start() {
        this.f7041c.mo6439s();
        this.f7039a.start();
        this.f7044f = 2;
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f7039a = mediaCodec;
        this.f7040b = new AsynchronousMediaCodecCallback(handlerThread);
        this.f7041c = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, handlerThread2, z);
        this.f7042d = z2;
        this.f7044f = 0;
    }
}
