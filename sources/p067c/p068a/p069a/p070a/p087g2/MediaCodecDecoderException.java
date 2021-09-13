package p067c.p068a.p069a.p070a.p087g2;

import android.media.MediaCodec.CodecException;
import p067c.p068a.p069a.p070a.p073c2.DecoderException;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.g2.r */
public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: a */
    public final MediaCodecInfo f7085a;

    /* renamed from: b */
    public final String f7086b;

    public MediaCodecDecoderException(Throwable th, MediaCodecInfo sVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        String str = null;
        sb.append(sVar == null ? null : sVar.f7087a);
        super(sb.toString(), th);
        this.f7085a = sVar;
        if (Util.f8398a >= 21) {
            str = m8440a(th);
        }
        this.f7086b = str;
    }

    /* renamed from: a */
    private static String m8440a(Throwable th) {
        if (th instanceof CodecException) {
            return ((CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
