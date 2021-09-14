package p067c.google.p138c.p141j.p142d;

/* renamed from: c.a.c.j.d.b */
final class GenericGFPoly {

    /* renamed from: a */
    private final GenericGF f10035a;

    /* renamed from: b */
    private final int[] f10036b;

    GenericGFPoly(GenericGF aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f10035a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f10036b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f10036b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f10036b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public GenericGFPoly mo8587a(GenericGFPoly bVar) {
        if (!this.f10035a.equals(bVar.f10035a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo8592f()) {
            return bVar;
        } else {
            if (bVar.mo8592f()) {
                return this;
            }
            int[] iArr = this.f10036b;
            int[] iArr2 = bVar.f10036b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = GenericGF.m12117a(iArr2[i - length], iArr[i]);
            }
            return new GenericGFPoly(this.f10035a, iArr4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public GenericGFPoly[] mo8588b(GenericGFPoly bVar) {
        if (!this.f10035a.equals(bVar.f10035a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo8592f()) {
            GenericGFPoly e = this.f10035a.mo8582e();
            int f = this.f10035a.mo8583f(bVar.mo8589c(bVar.mo8591e()));
            GenericGFPoly bVar2 = this;
            while (bVar2.mo8591e() >= bVar.mo8591e() && !bVar2.mo8592f()) {
                int e2 = bVar2.mo8591e() - bVar.mo8591e();
                int h = this.f10035a.mo8585h(bVar2.mo8589c(bVar2.mo8591e()), f);
                GenericGFPoly h2 = bVar.mo8594h(e2, h);
                e = e.mo8587a(this.f10035a.mo8579b(e2, h));
                bVar2 = bVar2.mo8587a(h2);
            }
            return new GenericGFPoly[]{e, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8589c(int i) {
        int[] iArr = this.f10036b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int[] mo8590d() {
        return this.f10036b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo8591e() {
        return this.f10036b.length - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo8592f() {
        return this.f10036b[0] == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public GenericGFPoly mo8593g(GenericGFPoly bVar) {
        if (!this.f10035a.equals(bVar.f10035a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo8592f() || bVar.mo8592f()) {
            return this.f10035a.mo8582e();
        } else {
            int[] iArr = this.f10036b;
            int length = iArr.length;
            int[] iArr2 = bVar.f10036b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = GenericGF.m12117a(iArr3[i4], this.f10035a.mo8585h(i2, iArr2[i3]));
                }
            }
            return new GenericGFPoly(this.f10035a, iArr3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public GenericGFPoly mo8594h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f10035a.mo8582e();
        } else {
            int length = this.f10036b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f10035a.mo8585h(this.f10036b[i3], i2);
            }
            return new GenericGFPoly(this.f10035a, iArr);
        }
    }

    public String toString() {
        if (mo8592f()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(mo8591e() * 8);
        for (int e = mo8591e(); e >= 0; e--) {
            int c = mo8589c(e);
            if (c != 0) {
                if (c < 0) {
                    if (e == mo8591e()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (e == 0 || c != 1) {
                    int g = this.f10035a.mo8584g(c);
                    if (g == 0) {
                        sb.append('1');
                    } else if (g == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(g);
                    }
                }
                if (e != 0) {
                    if (e == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(e);
                    }
                }
            }
        }
        return sb.toString();
    }
}
