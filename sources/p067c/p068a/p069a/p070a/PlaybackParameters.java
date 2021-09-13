package p067c.p068a.p069a.p070a;

import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.i1 */
public final class PlaybackParameters {

    /* renamed from: a */
    public static final PlaybackParameters f7375a = new PlaybackParameters(1.0f);

    /* renamed from: b */
    public final float f7376b;

    /* renamed from: c */
    public final float f7377c;

    /* renamed from: d */
    private final int f7378d;

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    /* renamed from: a */
    public long mo6775a(long j) {
        return j * ((long) this.f7378d);
    }

    /* renamed from: b */
    public PlaybackParameters mo6776b(float f) {
        return new PlaybackParameters(f, this.f7377c);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters i1Var = (PlaybackParameters) obj;
        if (!(this.f7376b == i1Var.f7376b && this.f7377c == i1Var.f7377c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f7376b)) * 31) + Float.floatToRawIntBits(this.f7377c);
    }

    public String toString() {
        return Util.m10237A("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f7376b), Float.valueOf(this.f7377c));
    }

    public PlaybackParameters(float f, float f2) {
        boolean z = true;
        Assertions.m10149a(f > 0.0f);
        if (f2 <= 0.0f) {
            z = false;
        }
        Assertions.m10149a(z);
        this.f7376b = f;
        this.f7377c = f2;
        this.f7378d = Math.round(f * 1000.0f);
    }
}
