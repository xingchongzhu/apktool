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
import p067c.p068a.p069a.p070a.p087g2.SynchronousMediaCodecAdapter.C1031b;

/* renamed from: c.a.a.a.g2.q */
public interface MediaCodecAdapter {

    /* renamed from: c.a.a.a.g2.q$a */
    /* compiled from: MediaCodecAdapter */
    public interface C1020a {

        /* renamed from: a */
        public static final C1020a f7084a = new C1031b();

        /* renamed from: a */
        MediaCodecAdapter mo6432a(MediaCodec mediaCodec);
    }

    /* renamed from: c.a.a.a.g2.q$b */
    /* compiled from: MediaCodecAdapter */
    public interface C1021b {
        /* renamed from: a */
        void mo6462a(MediaCodecAdapter qVar, long j, long j2);
    }

    /* renamed from: a */
    void mo6414a();

    /* renamed from: b */
    int mo6415b(BufferInfo bufferInfo);

    /* renamed from: c */
    void mo6416c(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    /* renamed from: d */
    void mo6417d(C1021b bVar, Handler handler);

    /* renamed from: e */
    void mo6418e(int i, boolean z);

    /* renamed from: f */
    void mo6419f(int i, int i2, CryptoInfo bVar, long j, int i3);

    void flush();

    /* renamed from: g */
    void mo6421g(int i);

    /* renamed from: h */
    MediaFormat mo6422h();

    /* renamed from: i */
    ByteBuffer mo6423i(int i);

    /* renamed from: j */
    void mo6424j(Surface surface);

    /* renamed from: k */
    void mo6425k(int i, int i2, int i3, long j, int i4);

    /* renamed from: l */
    void mo6426l(Bundle bundle);

    /* renamed from: m */
    ByteBuffer mo6427m(int i);

    /* renamed from: n */
    void mo6428n(int i, long j);

    /* renamed from: o */
    int mo6429o();

    void start();
}
