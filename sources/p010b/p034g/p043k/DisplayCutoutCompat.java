package p010b.p034g.p043k;

import p010b.p034g.p042j.ObjectsCompat;

/* renamed from: b.g.k.d */
public final class DisplayCutoutCompat {

    /* renamed from: a */
    private final Object f4621a;

    private DisplayCutoutCompat(Object obj) {
        this.f4621a = obj;
    }

    /* renamed from: a */
    static DisplayCutoutCompat m5242a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new DisplayCutoutCompat(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.m5175a(this.f4621a, ((DisplayCutoutCompat) obj).f4621a);
    }

    public int hashCode() {
        Object obj = this.f4621a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisplayCutoutCompat{");
        sb.append(this.f4621a);
        sb.append("}");
        return sb.toString();
    }
}
