package p067c.p068a.p069a.p070a.p111m2;

import android.util.SparseBooleanArray;

/* renamed from: c.a.a.a.m2.x */
public class MutableFlags {

    /* renamed from: a */
    private final SparseBooleanArray f8441a = new SparseBooleanArray();

    /* renamed from: a */
    public void mo7485a(int i) {
        this.f8441a.append(i, true);
    }

    /* renamed from: b */
    public boolean mo5741b(int i) {
        return this.f8441a.get(i);
    }

    /* renamed from: c */
    public boolean mo7223c(int... iArr) {
        for (int b : iArr) {
            if (mo5741b(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo5742d(int i) {
        Assertions.m10149a(i >= 0 && i < mo7486e());
        return this.f8441a.keyAt(i);
    }

    /* renamed from: e */
    public int mo7486e() {
        return this.f8441a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutableFlags)) {
            return false;
        }
        return this.f8441a.equals(((MutableFlags) obj).f8441a);
    }

    public int hashCode() {
        return this.f8441a.hashCode();
    }
}
