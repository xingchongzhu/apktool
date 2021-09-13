package p067c.p068a.p069a.p070a.p112n2;

import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p111m2.CodecSpecificDataUtil;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableNalUnitBitArray;

/* renamed from: c.a.a.a.n2.o */
public final class HevcConfig {

    /* renamed from: a */
    public final List<byte[]> f8562a;

    /* renamed from: b */
    public final int f8563b;

    /* renamed from: c */
    public final String f8564c;

    private HevcConfig(List<byte[]> list, int i, String str) {
        this.f8562a = list;
        this.f8563b = i;
        this.f8564c = str;
    }

    /* renamed from: a */
    public static HevcConfig m10526a(ParsableByteArray a0Var) throws ParserException {
        List list;
        ParsableByteArray a0Var2 = a0Var;
        try {
            a0Var2.mo7375Q(21);
            int D = a0Var.mo7362D() & 3;
            int D2 = a0Var.mo7362D();
            int e = a0Var.mo7380e();
            int i = 0;
            for (int i2 = 0; i2 < D2; i2++) {
                a0Var2.mo7375Q(1);
                int J = a0Var.mo7368J();
                for (int i3 = 0; i3 < J; i3++) {
                    int J2 = a0Var.mo7368J();
                    i += J2 + 4;
                    a0Var2.mo7375Q(J2);
                }
            }
            a0Var2.mo7374P(e);
            byte[] bArr = new byte[i];
            String str = null;
            int i4 = 0;
            for (int i5 = 0; i5 < D2; i5++) {
                int D3 = a0Var.mo7362D() & 127;
                int J3 = a0Var.mo7368J();
                for (int i6 = 0; i6 < J3; i6++) {
                    int J4 = a0Var.mo7368J();
                    byte[] bArr2 = NalUnitUtil.f8442a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(a0Var.mo7379d(), a0Var.mo7380e(), bArr, length, J4);
                    if (D3 == 33 && i6 == 0) {
                        str = CodecSpecificDataUtil.m10172c(new ParsableNalUnitBitArray(bArr, length, length + J4));
                    }
                    i4 = length + J4;
                    a0Var2.mo7375Q(J4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new HevcConfig(list, D + 1, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ParserException("Error parsing HEVC config", e2);
        }
    }
}
