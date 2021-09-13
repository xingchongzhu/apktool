package p067c.p068a.p069a.p070a.p087g2;

import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1021b;

/* renamed from: c.a.a.a.g2.c */
/* compiled from: lambda */
public final /* synthetic */ class C1007c implements OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ AsynchronousMediaCodecAdapter f7027a;

    /* renamed from: b */
    public final /* synthetic */ C1021b f7028b;

    public /* synthetic */ C1007c(AsynchronousMediaCodecAdapter lVar, C1021b bVar) {
        this.f7027a = lVar;
        this.f7028b = bVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f7027a.mo6431v(this.f7028b, mediaCodec, j, j2);
    }
}
