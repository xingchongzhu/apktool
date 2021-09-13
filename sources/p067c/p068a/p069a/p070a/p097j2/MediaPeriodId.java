package p067c.p068a.p069a.p070a.p097j2;

/* renamed from: c.a.a.a.j2.b0 */
public class MediaPeriodId {

    /* renamed from: a */
    public final Object f7391a;

    /* renamed from: b */
    public final int f7392b;

    /* renamed from: c */
    public final int f7393c;

    /* renamed from: d */
    public final long f7394d;

    /* renamed from: e */
    public final int f7395e;

    public MediaPeriodId(Object obj) {
        this(obj, -1);
    }

    /* renamed from: a */
    public MediaPeriodId mo6821a(Object obj) {
        if (this.f7391a.equals(obj)) {
            return this;
        }
        MediaPeriodId b0Var = new MediaPeriodId(obj, this.f7392b, this.f7393c, this.f7394d, this.f7395e);
        return b0Var;
    }

    /* renamed from: b */
    public boolean mo6822b() {
        return this.f7392b != -1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPeriodId)) {
            return false;
        }
        MediaPeriodId b0Var = (MediaPeriodId) obj;
        if (!(this.f7391a.equals(b0Var.f7391a) && this.f7392b == b0Var.f7392b && this.f7393c == b0Var.f7393c && this.f7394d == b0Var.f7394d && this.f7395e == b0Var.f7395e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + this.f7391a.hashCode()) * 31) + this.f7392b) * 31) + this.f7393c) * 31) + ((int) this.f7394d)) * 31) + this.f7395e;
    }

    public MediaPeriodId(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public MediaPeriodId(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public MediaPeriodId(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    protected MediaPeriodId(MediaPeriodId b0Var) {
        this.f7391a = b0Var.f7391a;
        this.f7392b = b0Var.f7392b;
        this.f7393c = b0Var.f7393c;
        this.f7394d = b0Var.f7394d;
        this.f7395e = b0Var.f7395e;
    }

    private MediaPeriodId(Object obj, int i, int i2, long j, int i3) {
        this.f7391a = obj;
        this.f7392b = i;
        this.f7393c = i2;
        this.f7394d = j;
        this.f7395e = i3;
    }
}
