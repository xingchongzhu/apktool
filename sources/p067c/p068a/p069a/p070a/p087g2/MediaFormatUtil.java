package p067c.p068a.p069a.p070a.p087g2;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p067c.p068a.p069a.p070a.p112n2.ColorInfo;

/* renamed from: c.a.a.a.g2.w */
public final class MediaFormatUtil {
    /* renamed from: a */
    public static void m8620a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m8621b(MediaFormat mediaFormat, ColorInfo kVar) {
        if (kVar != null) {
            m8623d(mediaFormat, "color-transfer", kVar.f8532c);
            m8623d(mediaFormat, "color-standard", kVar.f8530a);
            m8623d(mediaFormat, "color-range", kVar.f8531b);
            m8620a(mediaFormat, "hdr-static-info", kVar.f8533d);
        }
    }

    /* renamed from: c */
    public static void m8622c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: d */
    public static void m8623d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: e */
    public static void m8624e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
