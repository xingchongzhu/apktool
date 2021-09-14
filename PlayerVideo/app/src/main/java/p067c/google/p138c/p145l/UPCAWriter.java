package p067c.google.p138c.p145l;

import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.Writer;
import p067c.google.p138c.WriterException;
import p067c.google.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.o */
public final class UPCAWriter implements Writer {

    /* renamed from: a */
    private final EAN13Writer f10092a = new EAN13Writer();

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (aVar == BarcodeFormat.UPC_A) {
            return this.f10092a.mo8526a("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
