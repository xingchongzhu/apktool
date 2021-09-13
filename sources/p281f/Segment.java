package p281f;

/* renamed from: f.o */
final class Segment {

    /* renamed from: a */
    final byte[] f18781a;

    /* renamed from: b */
    int f18782b;

    /* renamed from: c */
    int f18783c;

    /* renamed from: d */
    boolean f18784d;

    /* renamed from: e */
    boolean f18785e;

    /* renamed from: f */
    Segment f18786f;

    /* renamed from: g */
    Segment f18787g;

    Segment() {
        this.f18781a = new byte[8192];
        this.f18785e = true;
        this.f18784d = false;
    }

    /* renamed from: a */
    public final void mo20281a() {
        Segment oVar = this.f18787g;
        if (oVar == this) {
            throw new IllegalStateException();
        } else if (oVar.f18785e) {
            int i = this.f18783c - this.f18782b;
            if (i <= (8192 - oVar.f18783c) + (oVar.f18784d ? 0 : oVar.f18782b)) {
                mo20286f(oVar, i);
                mo20282b();
                SegmentPool.m23975a(this);
            }
        }
    }

    /* renamed from: b */
    public final Segment mo20282b() {
        Segment oVar = this.f18786f;
        Segment oVar2 = oVar != this ? oVar : null;
        Segment oVar3 = this.f18787g;
        oVar3.f18786f = oVar;
        this.f18786f.f18787g = oVar3;
        this.f18786f = null;
        this.f18787g = null;
        return oVar2;
    }

    /* renamed from: c */
    public final Segment mo20283c(Segment oVar) {
        oVar.f18787g = this;
        oVar.f18786f = this.f18786f;
        this.f18786f.f18787g = oVar;
        this.f18786f = oVar;
        return oVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Segment mo20284d() {
        this.f18784d = true;
        Segment oVar = new Segment(this.f18781a, this.f18782b, this.f18783c, true, false);
        return oVar;
    }

    /* renamed from: e */
    public final Segment mo20285e(int i) {
        Segment oVar;
        if (i <= 0 || i > this.f18783c - this.f18782b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            oVar = mo20284d();
        } else {
            oVar = SegmentPool.m23976b();
            System.arraycopy(this.f18781a, this.f18782b, oVar.f18781a, 0, i);
        }
        oVar.f18783c = oVar.f18782b + i;
        this.f18782b += i;
        this.f18787g.mo20283c(oVar);
        return oVar;
    }

    /* renamed from: f */
    public final void mo20286f(Segment oVar, int i) {
        if (oVar.f18785e) {
            int i2 = oVar.f18783c;
            if (i2 + i > 8192) {
                if (!oVar.f18784d) {
                    int i3 = i2 + i;
                    int i4 = oVar.f18782b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = oVar.f18781a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        oVar.f18783c -= oVar.f18782b;
                        oVar.f18782b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f18781a, this.f18782b, oVar.f18781a, oVar.f18783c, i);
            oVar.f18783c += i;
            this.f18782b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f18781a = bArr;
        this.f18782b = i;
        this.f18783c = i2;
        this.f18784d = z;
        this.f18785e = z2;
    }
}
