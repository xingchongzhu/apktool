package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.p0 */
class RtlSpacingHelper {

    /* renamed from: a */
    private int f1148a = 0;

    /* renamed from: b */
    private int f1149b = 0;

    /* renamed from: c */
    private int f1150c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1151d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1152e = 0;

    /* renamed from: f */
    private int f1153f = 0;

    /* renamed from: g */
    private boolean f1154g = false;

    /* renamed from: h */
    private boolean f1155h = false;

    RtlSpacingHelper() {
    }

    /* renamed from: a */
    public int mo1694a() {
        return this.f1154g ? this.f1148a : this.f1149b;
    }

    /* renamed from: b */
    public int mo1695b() {
        return this.f1148a;
    }

    /* renamed from: c */
    public int mo1696c() {
        return this.f1149b;
    }

    /* renamed from: d */
    public int mo1697d() {
        return this.f1154g ? this.f1149b : this.f1148a;
    }

    /* renamed from: e */
    public void mo1698e(int i, int i2) {
        this.f1155h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1152e = i;
            this.f1148a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1153f = i2;
            this.f1149b = i2;
        }
    }

    /* renamed from: f */
    public void mo1699f(boolean z) {
        if (z != this.f1154g) {
            this.f1154g = z;
            if (!this.f1155h) {
                this.f1148a = this.f1152e;
                this.f1149b = this.f1153f;
            } else if (z) {
                int i = this.f1151d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1152e;
                }
                this.f1148a = i;
                int i2 = this.f1150c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1153f;
                }
                this.f1149b = i2;
            } else {
                int i3 = this.f1150c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1152e;
                }
                this.f1148a = i3;
                int i4 = this.f1151d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1153f;
                }
                this.f1149b = i4;
            }
        }
    }

    /* renamed from: g */
    public void mo1700g(int i, int i2) {
        this.f1150c = i;
        this.f1151d = i2;
        this.f1155h = true;
        if (this.f1154g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1148a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1149b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1148a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1149b = i2;
        }
    }
}
