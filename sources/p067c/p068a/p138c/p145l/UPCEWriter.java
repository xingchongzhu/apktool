package p067c.p068a.p138c.p145l;

import java.util.Map;
import p067c.p068a.p138c.BarcodeFormat;
import p067c.p068a.p138c.EncodeHintType;
import p067c.p068a.p138c.FormatException;
import p067c.p068a.p138c.WriterException;
import p067c.p068a.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.s */
public final class UPCEWriter extends UPCEANWriter {
    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (aVar == BarcodeFormat.UPC_E) {
            return super.mo8526a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo8634d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                int b = UPCEANReader.m12253b(UPCEReader.m12255c(str));
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(b);
                str = sb.toString();
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!UPCEANReader.m12252a(UPCEReader.m12255c(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        OneDimensionalCodeWriter.m12246c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = UPCEReader.f10099g[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b2 = OneDimensionalCodeWriter.m12245b(zArr, 0, UPCEANReader.f10093a, true) + 0;
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                b2 += OneDimensionalCodeWriter.m12245b(zArr, b2, UPCEANReader.f10097e[digit2], false);
            }
            OneDimensionalCodeWriter.m12245b(zArr, b2, UPCEANReader.f10095c, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
