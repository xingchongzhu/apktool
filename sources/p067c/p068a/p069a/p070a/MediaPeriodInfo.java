package p067c.p068a.p069a.p070a;

import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.c1 */
final class MediaPeriodInfo {

    /* renamed from: a */
    public final C1081a f5711a;

    /* renamed from: b */
    public final long f5712b;

    /* renamed from: c */
    public final long f5713c;

    /* renamed from: d */
    public final long f5714d;

    /* renamed from: e */
    public final long f5715e;

    /* renamed from: f */
    public final boolean f5716f;

    /* renamed from: g */
    public final boolean f5717g;

    /* renamed from: h */
    public final boolean f5718h;

    MediaPeriodInfo(C1081a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f5711a = aVar;
        this.f5712b = j;
        this.f5713c = j2;
        this.f5714d = j3;
        this.f5715e = j4;
        this.f5716f = z;
        this.f5717g = z2;
        this.f5718h = z3;
    }

    /* renamed from: a */
    public MediaPeriodInfo mo5942a(long j) {
        if (j == this.f5713c) {
            return this;
        }
        MediaPeriodInfo c1Var = new MediaPeriodInfo(this.f5711a, this.f5712b, j, this.f5714d, this.f5715e, this.f5716f, this.f5717g, this.f5718h);
        return c1Var;
    }

    /* renamed from: b */
    public MediaPeriodInfo mo5943b(long j) {
        if (j == this.f5712b) {
            return this;
        }
        MediaPeriodInfo c1Var = new MediaPeriodInfo(this.f5711a, j, this.f5713c, this.f5714d, this.f5715e, this.f5716f, this.f5717g, this.f5718h);
        return c1Var;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaPeriodInfo.class != obj.getClass()) {
            return false;
        }
        MediaPeriodInfo c1Var = (MediaPeriodInfo) obj;
        if (!(this.f5712b == c1Var.f5712b && this.f5713c == c1Var.f5713c && this.f5714d == c1Var.f5714d && this.f5715e == c1Var.f5715e && this.f5716f == c1Var.f5716f && this.f5717g == c1Var.f5717g && this.f5718h == c1Var.f5718h && Util.m10279b(this.f5711a, c1Var.f5711a))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f5711a.hashCode()) * 31) + ((int) this.f5712b)) * 31) + ((int) this.f5713c)) * 31) + ((int) this.f5714d)) * 31) + ((int) this.f5715e)) * 31) + (this.f5716f ? 1 : 0)) * 31) + (this.f5717g ? 1 : 0)) * 31) + (this.f5718h ? 1 : 0);
    }
}
