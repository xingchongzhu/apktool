package p067c.p068a.p069a.p070a.p076f2;

/* renamed from: c.a.a.a.f2.z */
public final class SeekPoint {

    /* renamed from: a */
    public static final SeekPoint f7020a = new SeekPoint(0, 0);

    /* renamed from: b */
    public final long f7021b;

    /* renamed from: c */
    public final long f7022c;

    public SeekPoint(long j, long j2) {
        this.f7021b = j;
        this.f7022c = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekPoint.class != obj.getClass()) {
            return false;
        }
        SeekPoint zVar = (SeekPoint) obj;
        if (!(this.f7021b == zVar.f7021b && this.f7022c == zVar.f7022c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((int) this.f7021b) * 31) + ((int) this.f7022c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[timeUs=");
        sb.append(this.f7021b);
        sb.append(", position=");
        sb.append(this.f7022c);
        sb.append("]");
        return sb.toString();
    }
}
