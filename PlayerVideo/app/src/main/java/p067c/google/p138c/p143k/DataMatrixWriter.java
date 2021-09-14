package p067c.google.p138c.p143k;

import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.Dimension;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.Writer;
import p067c.google.p138c.p141j.BitMatrix;
import p067c.google.p138c.p143k.p144b.C1398j;
import p067c.google.p138c.p143k.p144b.DefaultPlacement;
import p067c.google.p138c.p143k.p144b.ErrorCorrection;
import p067c.google.p138c.p143k.p144b.SymbolInfo;
import p067c.google.p138c.p143k.p144b.SymbolShapeHint;
import p067c.google.p138c.p148n.p150c.ByteMatrix;

/* renamed from: c.a.c.k.a */
public final class DataMatrixWriter implements Writer {
    /* renamed from: b */
    private static BitMatrix m12135b(ByteMatrix bVar, int i, int i2) {
        BitMatrix bVar2;
        int e = bVar.mo8671e();
        int d = bVar.mo8670d();
        int max = Math.max(i, e);
        int max2 = Math.max(i2, d);
        int min = Math.min(max / e, max2 / d);
        int i3 = (max - (e * min)) / 2;
        int i4 = (max2 - (d * min)) / 2;
        if (i2 < d || i < e) {
            bVar2 = new BitMatrix(e, d);
            i3 = 0;
            i4 = 0;
        } else {
            bVar2 = new BitMatrix(i, i2);
        }
        bVar2.mo8566b();
        int i5 = 0;
        while (i5 < d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < e) {
                if (bVar.mo8668b(i7, i5) == 1) {
                    bVar2.mo8574h(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return bVar2;
    }

    /* renamed from: c */
    private static BitMatrix m12136c(DefaultPlacement eVar, SymbolInfo kVar, int i, int i2) {
        int h = kVar.mo8630h();
        int g = kVar.mo8629g();
        ByteMatrix bVar = new ByteMatrix(kVar.mo8632j(), kVar.mo8631i());
        int i3 = 0;
        for (int i4 = 0; i4 < g; i4++) {
            if (i4 % kVar.f10062g == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < kVar.mo8632j(); i6++) {
                    bVar.mo8673g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < h; i8++) {
                if (i8 % kVar.f10061f == 0) {
                    bVar.mo8673g(i7, i3, true);
                    i7++;
                }
                bVar.mo8673g(i7, i3, eVar.mo8605e(i8, i4));
                i7++;
                int i9 = kVar.f10061f;
                if (i8 % i9 == i9 - 1) {
                    bVar.mo8673g(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = kVar.f10062g;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < kVar.mo8632j(); i12++) {
                    bVar.mo8673g(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return m12135b(bVar, i, i2);
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) {
        Dimension bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions can't be negative: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            SymbolShapeHint lVar = SymbolShapeHint.FORCE_NONE;
            Dimension bVar2 = null;
            if (map != null) {
                SymbolShapeHint lVar2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                Dimension bVar3 = (Dimension) map.get(EncodeHintType.MIN_SIZE);
                if (bVar3 == null) {
                    bVar3 = null;
                }
                bVar = (Dimension) map.get(EncodeHintType.MAX_SIZE);
                if (bVar == null) {
                    bVar = null;
                }
                bVar2 = bVar3;
            } else {
                bVar = null;
            }
            String b = C1398j.m12192b(str, lVar, bVar2, bVar);
            SymbolInfo l = SymbolInfo.m12208l(b.length(), lVar, bVar2, bVar, true);
            DefaultPlacement eVar = new DefaultPlacement(ErrorCorrection.m12190c(b, l), l.mo8630h(), l.mo8629g());
            eVar.mo8606h();
            return m12136c(eVar, l, i, i2);
        }
    }
}
