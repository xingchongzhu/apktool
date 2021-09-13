package p067c.p068a.p069a.p070a.p087g2;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p073c2.CryptoInfo;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1020a;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1021b;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.g2.x */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* renamed from: a */
    private final MediaCodec f7186a;

    /* renamed from: b */
    private ByteBuffer[] f7187b;

    /* renamed from: c */
    private ByteBuffer[] f7188c;

    /* renamed from: c.a.a.a.g2.x$b */
    /* compiled from: SynchronousMediaCodecAdapter */
    public static final class C1031b implements C1020a {
        /* renamed from: a */
        public MediaCodecAdapter mo6432a(MediaCodec mediaCodec) {
            return new SynchronousMediaCodecAdapter(mediaCodec);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo6509q(C1021b bVar, MediaCodec mediaCodec, long j, long j2) {
        bVar.mo6462a(this, j, j2);
    }

    /* renamed from: a */
    public void mo6414a() {
        this.f7187b = null;
        this.f7188c = null;
        this.f7186a.release();
    }

    /* renamed from: b */
    public int mo6415b(BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f7186a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && Util.f8398a < 21) {
                this.f7188c = this.f7186a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: c */
    public void mo6416c(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f7186a.configure(mediaFormat, surface, mediaCrypto, i);
    }

    /* renamed from: d */
    public void mo6417d(C1021b bVar, Handler handler) {
        this.f7186a.setOnFrameRenderedListener(new C1013i(this, bVar), handler);
    }

    /* renamed from: e */
    public void mo6418e(int i, boolean z) {
        this.f7186a.releaseOutputBuffer(i, z);
    }

    /* renamed from: f */
    public void mo6419f(int i, int i2, CryptoInfo bVar, long j, int i3) {
        this.f7186a.queueSecureInputBuffer(i, i2, bVar.mo5955a(), j, i3);
    }

    public void flush() {
        this.f7186a.flush();
    }

    /* renamed from: g */
    public void mo6421g(int i) {
        this.f7186a.setVideoScalingMode(i);
    }

    /* renamed from: h */
    public MediaFormat mo6422h() {
        return this.f7186a.getOutputFormat();
    }

    /* renamed from: i */
    public ByteBuffer mo6423i(int i) {
        if (Util.f8398a >= 21) {
            return this.f7186a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) Util.m10293i(this.f7187b))[i];
    }

    /* renamed from: j */
    public void mo6424j(Surface surface) {
        this.f7186a.setOutputSurface(surface);
    }

    /* renamed from: k */
    public void mo6425k(int i, int i2, int i3, long j, int i4) {
        this.f7186a.queueInputBuffer(i, i2, i3, j, i4);
    }

    /* renamed from: l */
    public void mo6426l(Bundle bundle) {
        this.f7186a.setParameters(bundle);
    }

    /* renamed from: m */
    public ByteBuffer mo6427m(int i) {
        if (Util.f8398a >= 21) {
            return this.f7186a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) Util.m10293i(this.f7188c))[i];
    }

    /* renamed from: n */
    public void mo6428n(int i, long j) {
        this.f7186a.releaseOutputBuffer(i, j);
    }

    /* renamed from: o */
    public int mo6429o() {
        return this.f7186a.dequeueInputBuffer(0);
    }

    public void start() {
        this.f7186a.start();
        if (Util.f8398a < 21) {
            this.f7187b = this.f7186a.getInputBuffers();
            this.f7188c = this.f7186a.getOutputBuffers();
        }
    }

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec) {
        this.f7186a = mediaCodec;
    }
}
