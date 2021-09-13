package p067c.p068a.p069a.p070a.p074d2;

/* renamed from: c.a.a.a.d2.a */
public final class DeviceInfo {

    /* renamed from: a */
    public static final DeviceInfo f5790a = new DeviceInfo(0, 0, 0);

    /* renamed from: b */
    public final int f5791b;

    /* renamed from: c */
    public final int f5792c;

    /* renamed from: d */
    public final int f5793d;

    public DeviceInfo(int i, int i2, int i3) {
        this.f5791b = i;
        this.f5792c = i2;
        this.f5793d = i3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo aVar = (DeviceInfo) obj;
        if (!(this.f5791b == aVar.f5791b && this.f5792c == aVar.f5792c && this.f5793d == aVar.f5793d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((527 + this.f5791b) * 31) + this.f5792c) * 31) + this.f5793d;
    }
}
