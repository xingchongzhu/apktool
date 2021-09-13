package p067c.p068a.p069a.p070a.p087g2;

import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1021b;

/* renamed from: c.a.a.a.g2.i */
/* compiled from: lambda */
public final /* synthetic */ class C1013i implements OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ SynchronousMediaCodecAdapter f7035a;

    /* renamed from: b */
    public final /* synthetic */ C1021b f7036b;

    public /* synthetic */ C1013i(SynchronousMediaCodecAdapter xVar, C1021b bVar) {
        this.f7035a = xVar;
        this.f7036b = bVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f7035a.mo6509q(this.f7036b, mediaCodec, j, j2);
    }
}
