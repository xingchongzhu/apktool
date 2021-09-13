package p010b.p034g.p042j;

/* renamed from: b.g.j.d */
public class Pair<F, S> {

    /* renamed from: a */
    public final F f4587a;

    /* renamed from: b */
    public final S f4588b;

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair dVar = (Pair) obj;
        if (ObjectsCompat.m5175a(dVar.f4587a, this.f4587a) && ObjectsCompat.m5175a(dVar.f4588b, this.f4588b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        F f = this.f4587a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f4588b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(this.f4587a);
        sb.append(" ");
        sb.append(this.f4588b);
        sb.append("}");
        return sb.toString();
    }
}
