package p067c.google.p138c.p141j.p142d;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.c.j.d.c */
public final class ReedSolomonEncoder {

    /* renamed from: a */
    private final GenericGF f10037a;

    /* renamed from: b */
    private final List<GenericGFPoly> f10038b;

    public ReedSolomonEncoder(GenericGF aVar) {
        this.f10037a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f10038b = arrayList;
        arrayList.add(new GenericGFPoly(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private GenericGFPoly m12133a(int i) {
        if (i >= this.f10038b.size()) {
            List<GenericGFPoly> list = this.f10038b;
            GenericGFPoly bVar = (GenericGFPoly) list.get(list.size() - 1);
            for (int size = this.f10038b.size(); size <= i; size++) {
                GenericGF aVar = this.f10037a;
                bVar = bVar.mo8593g(new GenericGFPoly(aVar, new int[]{1, aVar.mo8580c((size - 1) + aVar.mo8581d())}));
                this.f10038b.add(bVar);
            }
        }
        return (GenericGFPoly) this.f10038b.get(i);
    }

    /* renamed from: b */
    public void mo8596b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                GenericGFPoly a = m12133a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] d = new GenericGFPoly(this.f10037a, iArr2).mo8594h(i, 1).mo8588b(a)[1].mo8590d();
                int length2 = i - d.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(d, 0, iArr, length + length2, d.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
