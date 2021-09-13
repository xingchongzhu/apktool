package p067c.p068a.p069a.p070a.p112n2;

import android.view.Surface;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecDecoderException;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo;

/* renamed from: c.a.a.a.n2.p */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* renamed from: c */
    public final int f8565c;

    /* renamed from: d */
    public final boolean f8566d;

    public MediaCodecVideoDecoderException(Throwable th, MediaCodecInfo sVar, Surface surface) {
        super(th, sVar);
        this.f8565c = System.identityHashCode(surface);
        this.f8566d = surface == null || surface.isValid();
    }
}
