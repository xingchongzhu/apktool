package p067c.p068a.p069a.p070a.p112n2;

import java.util.ArrayList;
import java.util.List;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p111m2.CodecSpecificDataUtil;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.C1201b;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.n2.j */
public final class AvcConfig {

    /* renamed from: a */
    public final List<byte[]> f8524a;

    /* renamed from: b */
    public final int f8525b;

    /* renamed from: c */
    public final int f8526c;

    /* renamed from: d */
    public final int f8527d;

    /* renamed from: e */
    public final float f8528e;

    /* renamed from: f */
    public final String f8529f;

    private AvcConfig(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f8524a = list;
        this.f8525b = i;
        this.f8526c = i2;
        this.f8527d = i3;
        this.f8528e = f;
        this.f8529f = str;
    }

    /* renamed from: a */
    private static byte[] m10500a(ParsableByteArray a0Var) {
        int J = a0Var.mo7368J();
        int e = a0Var.mo7380e();
        a0Var.mo7375Q(J);
        return CodecSpecificDataUtil.m10173d(a0Var.mo7379d(), e, J);
    }

    /* renamed from: b */
    public static AvcConfig m10501b(ParsableByteArray a0Var) throws ParserException {
        String str;
        float f;
        int i;
        try {
            a0Var.mo7375Q(4);
            int D = (a0Var.mo7362D() & 3) + 1;
            if (D != 3) {
                ArrayList arrayList = new ArrayList();
                int D2 = a0Var.mo7362D() & 31;
                for (int i2 = 0; i2 < D2; i2++) {
                    arrayList.add(m10500a(a0Var));
                }
                int D3 = a0Var.mo7362D();
                for (int i3 = 0; i3 < D3; i3++) {
                    arrayList.add(m10500a(a0Var));
                }
                int i4 = -1;
                if (D2 > 0) {
                    C1201b i5 = NalUnitUtil.m10426i((byte[]) arrayList.get(0), D, ((byte[]) arrayList.get(0)).length);
                    int i6 = i5.f8453e;
                    int i7 = i5.f8454f;
                    float f2 = i5.f8455g;
                    str = CodecSpecificDataUtil.m10170a(i5.f8449a, i5.f8450b, i5.f8451c);
                    i4 = i6;
                    i = i7;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    f = 1.0f;
                }
                AvcConfig jVar = new AvcConfig(arrayList, D, i4, i, f, str);
                return jVar;
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing AVC config", e);
        }
    }
}
