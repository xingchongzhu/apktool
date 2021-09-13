package p067c.p068a.p069a.p070a.p111m2;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: c.a.a.a.m2.h */
public final class CodecSpecificDataUtil {

    /* renamed from: a */
    private static final byte[] f8369a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f8370b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m10170a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: b */
    public static List<byte[]> m10171b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m10172c(ParsableNalUnitBitArray b0Var) {
        b0Var.mo7411l(24);
        int e = b0Var.mo7406e(2);
        boolean d = b0Var.mo7405d();
        int e2 = b0Var.mo7406e(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (b0Var.mo7405d()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = b0Var.mo7406e(8);
        }
        int e3 = b0Var.mo7406e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f8370b[e];
        objArr[1] = Integer.valueOf(e2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(d ? 'H' : 'L');
        objArr[4] = Integer.valueOf(e3);
        StringBuilder sb = new StringBuilder(Util.m10237A("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i5])}));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static byte[] m10173d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f8369a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: e */
    public static Pair<Integer, Integer> m10174e(byte[] bArr) {
        ParsableByteArray a0Var = new ParsableByteArray(bArr);
        a0Var.mo7374P(9);
        int D = a0Var.mo7362D();
        a0Var.mo7374P(20);
        return Pair.create(Integer.valueOf(a0Var.mo7366H()), Integer.valueOf(D));
    }

    /* renamed from: f */
    public static boolean m10175f(List<byte[]> list) {
        if (list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1) {
            return true;
        }
        return false;
    }
}
