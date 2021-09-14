package p067c.google.p138c.p139i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.Writer;
import p067c.google.p138c.p139i.p140b.AztecCode;
import p067c.google.p138c.p139i.p140b.Encoder;
import p067c.google.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.i.a */
public final class AztecWriter implements Writer {
    /* renamed from: b */
    private static BitMatrix m12054b(String str, BarcodeFormat aVar, int i, int i2, Charset charset, int i3, int i4) {
        if (aVar == BarcodeFormat.AZTEC) {
            return m12055c(Encoder.m12067d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: c */
    private static BitMatrix m12055c(AztecCode aVar, int i, int i2) {
        BitMatrix a = aVar.mo8528a();
        if (a != null) {
            int f = a.mo8572f();
            int e = a.mo8570e();
            int max = Math.max(i, f);
            int max2 = Math.max(i2, e);
            int min = Math.min(max / f, max2 / e);
            int i3 = (max - (f * min)) / 2;
            int i4 = (max2 - (e * min)) / 2;
            BitMatrix bVar = new BitMatrix(max, max2);
            int i5 = 0;
            while (i5 < e) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < f) {
                    if (a.mo8569d(i7, i5)) {
                        bVar.mo8574h(i6, i4, min, min);
                    }
                    i7++;
                    i6 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) {
        int i3;
        int i4;
        Charset charset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i5 = 33;
        if (map != null) {
            EncodeHintType cVar = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset2 = Charset.forName(map.get(cVar).toString());
            }
            EncodeHintType cVar2 = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(cVar2)) {
                i5 = Integer.parseInt(map.get(cVar2).toString());
            }
            EncodeHintType cVar3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                charset = charset2;
                i4 = i5;
                i3 = Integer.parseInt(map.get(cVar3).toString());
                return m12054b(str, aVar, i, i2, charset, i4, i3);
            }
            charset = charset2;
            i4 = i5;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i3 = 0;
        return m12054b(str, aVar, i, i2, charset, i4, i3);
    }
}
