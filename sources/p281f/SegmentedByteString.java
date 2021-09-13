package p281f;

import java.util.Arrays;

/* renamed from: f.q */
final class SegmentedByteString extends ByteString {

    /* renamed from: f */
    final transient byte[][] f18790f;

    /* renamed from: g */
    final transient int[] f18791g;

    SegmentedByteString(C3383c cVar, int i) {
        super(null);
        C3388u.m24008b(cVar.f18751c, 0, (long) i);
        Segment oVar = cVar.f18750b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = oVar.f18783c;
            int i6 = oVar.f18782b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                oVar = oVar.f18786f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f18790f = new byte[i4][];
        this.f18791g = new int[(i4 * 2)];
        Segment oVar2 = cVar.f18750b;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f18790f;
            bArr[i7] = oVar2.f18781a;
            int i8 = oVar2.f18783c;
            int i9 = oVar2.f18782b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f18791g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            oVar2.f18784d = true;
            i7++;
            oVar2 = oVar2.f18786f;
        }
    }

    /* renamed from: v */
    private int m23977v(int i) {
        int binarySearch = Arrays.binarySearch(this.f18791g, 0, this.f18790f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    /* renamed from: w */
    private ByteString m23978w() {
        return new ByteString(mo20252s());
    }

    /* renamed from: a */
    public String mo20237a() {
        return m23978w().mo20237a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (mo20244k(0, r5, 0, mo20248o()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p281f.ByteString
            r2 = 0
            if (r1 == 0) goto L_0x0020
            f.f r5 = (p281f.ByteString) r5
            int r1 = r5.mo20248o()
            int r3 = r4.mo20248o()
            if (r1 != r3) goto L_0x0020
            int r1 = r4.mo20248o()
            boolean r5 = r4.mo20244k(r2, r5, r2, r1)
            if (r5 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p281f.SegmentedByteString.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public byte mo20241h(int i) {
        int i2;
        C3388u.m24008b((long) this.f18791g[this.f18790f.length - 1], (long) i, 1);
        int v = m23977v(i);
        if (v == 0) {
            i2 = 0;
        } else {
            i2 = this.f18791g[v - 1];
        }
        int[] iArr = this.f18791g;
        byte[][] bArr = this.f18790f;
        return bArr[v][(i - i2) + iArr[bArr.length + v]];
    }

    public int hashCode() {
        int i = this.f18755d;
        if (i != 0) {
            return i;
        }
        int length = this.f18790f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f18790f[i2];
            int[] iArr = this.f18791g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f18755d = i4;
        return i4;
    }

    /* renamed from: i */
    public String mo20243i() {
        return m23978w().mo20243i();
    }

    /* renamed from: k */
    public boolean mo20244k(int i, ByteString fVar, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo20248o() - i3) {
            return false;
        }
        int v = m23977v(i);
        while (i3 > 0) {
            if (v == 0) {
                i4 = 0;
            } else {
                i4 = this.f18791g[v - 1];
            }
            int min = Math.min(i3, ((this.f18791g[v] - i4) + i4) - i);
            int[] iArr = this.f18791g;
            byte[][] bArr = this.f18790f;
            if (!fVar.mo20245l(i2, bArr[v], (i - i4) + iArr[bArr.length + v], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            v++;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo20245l(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo20248o() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int v = m23977v(i);
        while (i3 > 0) {
            if (v == 0) {
                i4 = 0;
            } else {
                i4 = this.f18791g[v - 1];
            }
            int min = Math.min(i3, ((this.f18791g[v] - i4) + i4) - i);
            int[] iArr = this.f18791g;
            byte[][] bArr2 = this.f18790f;
            if (!C3388u.m24007a(bArr2[v], (i - i4) + iArr[bArr2.length + v], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            v++;
        }
        return true;
    }

    /* renamed from: m */
    public ByteString mo20246m() {
        return m23978w().mo20246m();
    }

    /* renamed from: n */
    public ByteString mo20247n() {
        return m23978w().mo20247n();
    }

    /* renamed from: o */
    public int mo20248o() {
        return this.f18791g[this.f18790f.length - 1];
    }

    /* renamed from: q */
    public ByteString mo20250q(int i, int i2) {
        return m23978w().mo20250q(i, i2);
    }

    /* renamed from: r */
    public ByteString mo20251r() {
        return m23978w().mo20251r();
    }

    /* renamed from: s */
    public byte[] mo20252s() {
        int[] iArr = this.f18791g;
        byte[][] bArr = this.f18790f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f18791g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f18790f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: t */
    public String mo20253t() {
        return m23978w().mo20253t();
    }

    public String toString() {
        return m23978w().toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo20255u(C3383c cVar) {
        int length = this.f18790f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f18791g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            Segment oVar = new Segment(this.f18790f[i], i3, (i3 + i4) - i2, true, false);
            Segment oVar2 = cVar.f18750b;
            if (oVar2 == null) {
                oVar.f18787g = oVar;
                oVar.f18786f = oVar;
                cVar.f18750b = oVar;
            } else {
                oVar2.f18787g.mo20283c(oVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f18751c += (long) i2;
    }
}
