package p281f;

import java.nio.charset.Charset;

/* renamed from: f.u */
/* compiled from: Util */
final class C3388u {

    /* renamed from: a */
    public static final Charset f18796a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static boolean m24007a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m24008b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    /* renamed from: c */
    public static int m24009c(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: d */
    public static short m24010d(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: e */
    public static void m24011e(Throwable th) {
        m24012f(th);
    }

    /* renamed from: f */
    private static <T extends Throwable> void m24012f(Throwable th) throws Throwable {
        throw th;
    }
}
