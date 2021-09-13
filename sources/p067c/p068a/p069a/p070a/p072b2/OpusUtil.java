package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.a.a.b2.d0 */
public class OpusUtil {
    /* renamed from: a */
    public static List<byte[]> m6551a(byte[] bArr) {
        long e = m6555e((long) m6554d(bArr));
        long e2 = m6555e(3840);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m6552b(e));
        arrayList.add(m6552b(e2));
        return arrayList;
    }

    /* renamed from: b */
    private static byte[] m6552b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: c */
    public static int m6553c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    private static int m6554d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: e */
    private static long m6555e(long j) {
        return (j * 1000000000) / 48000;
    }
}
