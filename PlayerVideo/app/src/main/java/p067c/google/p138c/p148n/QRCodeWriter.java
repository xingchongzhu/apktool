package p067c.google.p138c.p148n;

import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.Writer;
import p067c.google.p138c.WriterException;
import p067c.google.p138c.p141j.BitMatrix;
import p067c.google.p138c.p148n.p149b.ErrorCorrectionLevel;
import p067c.google.p138c.p148n.p150c.ByteMatrix;
import p067c.google.p138c.p148n.p150c.C1403c;
import p067c.google.p138c.p148n.p150c.QRCode;

/* renamed from: c.a.c.n.a */
public final class QRCodeWriter implements Writer {
    /* renamed from: b */
    private static BitMatrix m12299b(QRCode fVar, int i, int i2, int i3) {
        ByteMatrix a = fVar.mo8675a();
        if (a != null) {
            int e = a.mo8671e();
            int d = a.mo8670d();
            int i4 = i3 << 1;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            BitMatrix bVar = new BitMatrix(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < e) {
                    if (a.mo8668b(i11, i9) == 1) {
                        bVar.mo8574h(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions are too small: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            ErrorCorrectionLevel aVar2 = ErrorCorrectionLevel.L;
            int i3 = 4;
            if (map != null) {
                EncodeHintType cVar = EncodeHintType.ERROR_CORRECTION;
                if (map.containsKey(cVar)) {
                    aVar2 = ErrorCorrectionLevel.valueOf(map.get(cVar).toString());
                }
                EncodeHintType cVar2 = EncodeHintType.MARGIN;
                if (map.containsKey(cVar2)) {
                    i3 = Integer.parseInt(map.get(cVar2).toString());
                }
            }
            return m12299b(C1403c.m12338n(str, aVar2, map), i, i2, i3);
        }
    }
}
