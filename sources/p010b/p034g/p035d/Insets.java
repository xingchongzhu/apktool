package p010b.p034g.p035d;

import android.graphics.Rect;

/* renamed from: b.g.d.b */
public final class Insets {

    /* renamed from: a */
    public static final Insets f4455a = new Insets(0, 0, 0, 0);

    /* renamed from: b */
    public final int f4456b;

    /* renamed from: c */
    public final int f4457c;

    /* renamed from: d */
    public final int f4458d;

    /* renamed from: e */
    public final int f4459e;

    private Insets(int i, int i2, int i3, int i4) {
        this.f4456b = i;
        this.f4457c = i2;
        this.f4458d = i3;
        this.f4459e = i4;
    }

    /* renamed from: a */
    public static Insets m4971a(Insets bVar, Insets bVar2) {
        return m4972b(Math.max(bVar.f4456b, bVar2.f4456b), Math.max(bVar.f4457c, bVar2.f4457c), Math.max(bVar.f4458d, bVar2.f4458d), Math.max(bVar.f4459e, bVar2.f4459e));
    }

    /* renamed from: b */
    public static Insets m4972b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f4455a;
        }
        return new Insets(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static Insets m4973c(Rect rect) {
        return m4972b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static Insets m4974d(android.graphics.Insets insets) {
        return m4972b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public android.graphics.Insets mo4843e() {
        return android.graphics.Insets.of(this.f4456b, this.f4457c, this.f4458d, this.f4459e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets bVar = (Insets) obj;
        return this.f4459e == bVar.f4459e && this.f4456b == bVar.f4456b && this.f4458d == bVar.f4458d && this.f4457c == bVar.f4457c;
    }

    public int hashCode() {
        return (((((this.f4456b * 31) + this.f4457c) * 31) + this.f4458d) * 31) + this.f4459e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Insets{left=");
        sb.append(this.f4456b);
        sb.append(", top=");
        sb.append(this.f4457c);
        sb.append(", right=");
        sb.append(this.f4458d);
        sb.append(", bottom=");
        sb.append(this.f4459e);
        sb.append('}');
        return sb.toString();
    }
}
