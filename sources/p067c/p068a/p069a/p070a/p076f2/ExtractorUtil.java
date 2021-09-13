package p067c.p068a.p069a.p070a.p076f2;

import java.io.IOException;

/* renamed from: c.a.a.a.f2.m */
final class ExtractorUtil {
    /* renamed from: a */
    public static int m7938a(ExtractorInput kVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int f = kVar.mo6198f(bArr, i + i3, i2 - i3);
            if (f == -1) {
                break;
            }
            i3 += f;
        }
        return i3;
    }
}
