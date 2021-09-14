package p067c.google.p138c.p145l;

import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.FormatException;
import p067c.google.p138c.WriterException;
import p067c.google.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.k */
public final class EAN8Writer extends UPCEANWriter {
    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (aVar == BarcodeFormat.EAN_8) {
            return super.mo8526a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo8634d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                int b = UPCEANReader.m12253b(str);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(b);
                str = sb.toString();
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!UPCEANReader.m12252a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        OneDimensionalCodeWriter.m12246c(str);
        boolean[] zArr = new boolean[67];
        int b2 = OneDimensionalCodeWriter.m12245b(zArr, 0, UPCEANReader.f10093a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            b2 += OneDimensionalCodeWriter.m12245b(zArr, b2, UPCEANReader.f10096d[Character.digit(str.charAt(i), 10)], false);
        }
        int b3 = b2 + OneDimensionalCodeWriter.m12245b(zArr, b2, UPCEANReader.f10094b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            b3 += OneDimensionalCodeWriter.m12245b(zArr, b3, UPCEANReader.f10096d[Character.digit(str.charAt(i2), 10)], true);
        }
        OneDimensionalCodeWriter.m12245b(zArr, b3, UPCEANReader.f10093a, true);
        return zArr;
    }
}
