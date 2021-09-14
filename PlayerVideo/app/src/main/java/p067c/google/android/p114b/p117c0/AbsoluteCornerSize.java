package p067c.google.android.p114b.p117c0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.a.a.b.c0.a */
public final class AbsoluteCornerSize implements CornerSize {

    /* renamed from: a */
    private final float f9086a;

    public AbsoluteCornerSize(float f) {
        this.f9086a = f;
    }

    /* renamed from: a */
    public float mo7819a(RectF rectF) {
        return this.f9086a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCornerSize)) {
            return false;
        }
        if (this.f9086a != ((AbsoluteCornerSize) obj).f9086a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9086a)});
    }
}
