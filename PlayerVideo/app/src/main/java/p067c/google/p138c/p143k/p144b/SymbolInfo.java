package p067c.google.p138c.p143k.p144b;

import p067c.google.p138c.Dimension;

/* renamed from: c.a.c.k.b.k */
public class SymbolInfo {

    /* renamed from: a */
    static final SymbolInfo[] f10056a;

    /* renamed from: b */
    private static SymbolInfo[] f10057b;

    /* renamed from: c */
    private final boolean f10058c;

    /* renamed from: d */
    private final int f10059d;

    /* renamed from: e */
    private final int f10060e;

    /* renamed from: f */
    public final int f10061f;

    /* renamed from: g */
    public final int f10062g;

    /* renamed from: h */
    private final int f10063h;

    /* renamed from: i */
    private final int f10064i;

    /* renamed from: j */
    private final int f10065j;

    static {
        SymbolInfo kVar = new SymbolInfo(false, 3, 5, 8, 8, 1);
        SymbolInfo kVar2 = new SymbolInfo(false, 5, 7, 10, 10, 1);
        SymbolInfo kVar3 = new SymbolInfo(true, 5, 7, 16, 6, 1);
        SymbolInfo kVar4 = new SymbolInfo(false, 8, 10, 12, 12, 1);
        SymbolInfo kVar5 = new SymbolInfo(true, 10, 11, 14, 6, 2);
        SymbolInfo kVar6 = new SymbolInfo(false, 12, 12, 14, 14, 1);
        SymbolInfo kVar7 = new SymbolInfo(true, 16, 14, 24, 10, 1);
        SymbolInfo kVar8 = new SymbolInfo(false, 18, 14, 16, 16, 1);
        SymbolInfo kVar9 = new SymbolInfo(false, 22, 18, 18, 18, 1);
        SymbolInfo kVar10 = new SymbolInfo(true, 22, 18, 16, 10, 2);
        SymbolInfo kVar11 = new SymbolInfo(false, 30, 20, 20, 20, 1);
        SymbolInfo kVar12 = new SymbolInfo(true, 32, 24, 16, 14, 2);
        SymbolInfo kVar13 = new SymbolInfo(false, 36, 24, 22, 22, 1);
        SymbolInfo kVar14 = new SymbolInfo(false, 44, 28, 24, 24, 1);
        SymbolInfo kVar15 = new SymbolInfo(true, 49, 28, 22, 14, 2);
        SymbolInfo kVar16 = new SymbolInfo(false, 62, 36, 14, 14, 4);
        SymbolInfo kVar17 = new SymbolInfo(false, 86, 42, 16, 16, 4);
        SymbolInfo kVar18 = new SymbolInfo(false, 114, 48, 18, 18, 4);
        SymbolInfo kVar19 = new SymbolInfo(false, 144, 56, 20, 20, 4);
        SymbolInfo kVar20 = new SymbolInfo(false, 174, 68, 22, 22, 4);
        SymbolInfo kVar21 = new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42);
        SymbolInfo kVar22 = new SymbolInfo(false, 280, 112, 14, 14, 16, 140, 56);
        SymbolInfo kVar23 = new SymbolInfo(false, 368, 144, 16, 16, 16, 92, 36);
        SymbolInfo kVar24 = new SymbolInfo(false, 456, 192, 18, 18, 16, 114, 48);
        SymbolInfo kVar25 = new SymbolInfo(false, 576, 224, 20, 20, 16, 144, 56);
        SymbolInfo kVar26 = new SymbolInfo(false, 696, 272, 22, 22, 16, 174, 68);
        SymbolInfo kVar27 = new SymbolInfo(false, 816, 336, 24, 24, 16, 136, 56);
        SymbolInfo kVar28 = new SymbolInfo(false, 1050, 408, 18, 18, 36, 175, 68);
        SymbolInfo kVar29 = new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62);
        SymbolInfo[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20, kVar21, kVar22, kVar23, kVar24, kVar25, kVar26, kVar27, kVar28, kVar29, new DataMatrixSymbolInfo144()};
        f10056a = kVarArr;
        f10057b = kVarArr;
    }

    public SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: e */
    private int m12206e() {
        int i = this.f10063h;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: k */
    private int m12207k() {
        int i = this.f10063h;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: l */
    public static SymbolInfo m12208l(int i, SymbolShapeHint lVar, Dimension bVar, Dimension bVar2, boolean z) {
        SymbolInfo[] kVarArr;
        for (SymbolInfo kVar : f10057b) {
            if ((lVar != SymbolShapeHint.FORCE_SQUARE || !kVar.f10058c) && ((lVar != SymbolShapeHint.FORCE_RECTANGLE || kVar.f10058c) && ((bVar == null || (kVar.mo8632j() >= bVar.mo8522b() && kVar.mo8631i() >= bVar.mo8521a())) && ((bVar2 == null || (kVar.mo8632j() <= bVar2.mo8522b() && kVar.mo8631i() <= bVar2.mo8521a())) && i <= kVar.f10059d)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public final int mo8626a() {
        return this.f10059d;
    }

    /* renamed from: b */
    public int mo8603b(int i) {
        return this.f10064i;
    }

    /* renamed from: c */
    public final int mo8627c() {
        return this.f10060e;
    }

    /* renamed from: d */
    public final int mo8628d(int i) {
        return this.f10065j;
    }

    /* renamed from: f */
    public int mo8604f() {
        return this.f10059d / this.f10064i;
    }

    /* renamed from: g */
    public final int mo8629g() {
        return m12207k() * this.f10062g;
    }

    /* renamed from: h */
    public final int mo8630h() {
        return m12206e() * this.f10061f;
    }

    /* renamed from: i */
    public final int mo8631i() {
        return mo8629g() + (m12207k() << 1);
    }

    /* renamed from: j */
    public final int mo8632j() {
        return mo8630h() + (m12206e() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10058c ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f10061f);
        sb.append('x');
        sb.append(this.f10062g);
        sb.append(", symbol size ");
        sb.append(mo8632j());
        sb.append('x');
        sb.append(mo8631i());
        sb.append(", symbol data size ");
        sb.append(mo8630h());
        sb.append('x');
        sb.append(mo8629g());
        sb.append(", codewords ");
        sb.append(this.f10059d);
        sb.append('+');
        sb.append(this.f10060e);
        return sb.toString();
    }

    SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f10058c = z;
        this.f10059d = i;
        this.f10060e = i2;
        this.f10061f = i3;
        this.f10062g = i4;
        this.f10063h = i5;
        this.f10064i = i6;
        this.f10065j = i7;
    }
}
