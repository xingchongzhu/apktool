package p067c.p068a.p138c.p146m;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import p067c.p068a.p138c.BarcodeFormat;
import p067c.p068a.p138c.EncodeHintType;
import p067c.p068a.p138c.Writer;
import p067c.p068a.p138c.WriterException;
import p067c.p068a.p138c.p141j.BitMatrix;
import p067c.p068a.p138c.p146m.p147b.Compaction;
import p067c.p068a.p138c.p146m.p147b.Dimensions;
import p067c.p068a.p138c.p146m.p147b.PDF417;

/* renamed from: c.a.c.m.a */
public final class PDF417Writer implements Writer {
    /* renamed from: b */
    private static BitMatrix m12258b(byte[][] bArr, int i) {
        int i2 = i * 2;
        BitMatrix bVar = new BitMatrix(bArr[0].length + i2, bArr.length + i2);
        bVar.mo8566b();
        int e = (bVar.mo8570e() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    bVar.mo8573g(i4 + i, e);
                }
            }
            i3++;
            e--;
        }
        return bVar;
    }

    /* renamed from: c */
    private static BitMatrix m12259c(PDF417 eVar, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        eVar.mo8645e(str, i);
        byte[][] b = eVar.mo8646f().mo8637b(1, 4);
        if ((i3 > i2) != (b[0].length < b.length)) {
            b = m12260d(b);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / b[0].length;
        int length2 = i3 / b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m12258b(b, i4);
        }
        byte[][] b2 = eVar.mo8646f().mo8637b(length, length << 2);
        if (z) {
            b2 = m12260d(b2);
        }
        return m12258b(b2, i4);
    }

    /* renamed from: d */
    private static byte[][] m12260d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        int i3;
        int i4;
        if (aVar == BarcodeFormat.PDF_417) {
            PDF417 eVar = new PDF417();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                EncodeHintType cVar = EncodeHintType.PDF417_COMPACT;
                if (map.containsKey(cVar)) {
                    eVar.mo8647h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
                }
                EncodeHintType cVar2 = EncodeHintType.PDF417_COMPACTION;
                if (map.containsKey(cVar2)) {
                    eVar.mo8648i(Compaction.valueOf(map.get(cVar2).toString()));
                }
                EncodeHintType cVar3 = EncodeHintType.PDF417_DIMENSIONS;
                if (map.containsKey(cVar3)) {
                    Dimensions dVar = (Dimensions) map.get(cVar3);
                    eVar.mo8649j(dVar.mo8641a(), dVar.mo8643c(), dVar.mo8642b(), dVar.mo8644d());
                }
                EncodeHintType cVar4 = EncodeHintType.MARGIN;
                if (map.containsKey(cVar4)) {
                    i5 = Integer.parseInt(map.get(cVar4).toString());
                }
                EncodeHintType cVar5 = EncodeHintType.ERROR_CORRECTION;
                if (map.containsKey(cVar5)) {
                    i6 = Integer.parseInt(map.get(cVar5).toString());
                }
                EncodeHintType cVar6 = EncodeHintType.CHARACTER_SET;
                if (map.containsKey(cVar6)) {
                    eVar.mo8650k(Charset.forName(map.get(cVar6).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return m12259c(eVar, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
