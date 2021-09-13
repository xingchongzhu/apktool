package p067c.p068a.p138c;

/* renamed from: c.a.c.b */
public final class Dimension {

    /* renamed from: a */
    private final int f9940a;

    /* renamed from: b */
    private final int f9941b;

    /* renamed from: a */
    public int mo8521a() {
        return this.f9941b;
    }

    /* renamed from: b */
    public int mo8522b() {
        return this.f9940a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dimension) {
            Dimension bVar = (Dimension) obj;
            if (this.f9940a == bVar.f9940a && this.f9941b == bVar.f9941b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f9940a * 32713) + this.f9941b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9940a);
        sb.append("x");
        sb.append(this.f9941b);
        return sb.toString();
    }
}
