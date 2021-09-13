package p067c.p068a.p069a.p070a.p072b2;

/* renamed from: c.a.a.a.b2.v */
public final class AuxEffectInfo {

    /* renamed from: a */
    public final int f5614a;

    /* renamed from: b */
    public final float f5615b;

    public AuxEffectInfo(int i, float f) {
        this.f5614a = i;
        this.f5615b = f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || AuxEffectInfo.class != obj.getClass()) {
            return false;
        }
        AuxEffectInfo vVar = (AuxEffectInfo) obj;
        if (!(this.f5614a == vVar.f5614a && Float.compare(vVar.f5615b, this.f5615b) == 0)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.f5614a) * 31) + Float.floatToIntBits(this.f5615b);
    }
}
