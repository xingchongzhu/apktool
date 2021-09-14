package p067c.google.p138c.p145l;

import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.FormatException;
import p067c.google.p138c.WriterException;
import p067c.google.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.j */
public final class EAN13Writer extends UPCEANWriter {
    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (aVar == BarcodeFormat.EAN_13) {
            return super.mo8526a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo8634d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                int b = UPCEANReader.m12253b(str);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(b);
                str = sb.toString();
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!UPCEANReader.m12252a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        OneDimensionalCodeWriter.m12246c(str);
        int i = EAN13Reader.f10087f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b2 = OneDimensionalCodeWriter.m12245b(zArr, 0, UPCEANReader.f10093a, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            b2 += OneDimensionalCodeWriter.m12245b(zArr, b2, UPCEANReader.f10097e[digit], false);
        }
        int b3 = b2 + OneDimensionalCodeWriter.m12245b(zArr, b2, UPCEANReader.f10094b, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            b3 += OneDimensionalCodeWriter.m12245b(zArr, b3, UPCEANReader.f10096d[Character.digit(str.charAt(i3), 10)], true);
        }
        OneDimensionalCodeWriter.m12245b(zArr, b3, UPCEANReader.f10093a, true);
        return zArr;
    }
}
