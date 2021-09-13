package p067c.p068a.p069a.p114b.p117c0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.a.a.b.c0.i */
public final class RelativeCornerSize implements CornerSize {

    /* renamed from: a */
    private final float f9139a;

    public RelativeCornerSize(float f) {
        this.f9139a = f;
    }

    /* renamed from: a */
    public float mo7819a(RectF rectF) {
        return this.f9139a * rectF.height();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativeCornerSize)) {
            return false;
        }
        if (this.f9139a != ((RelativeCornerSize) obj).f9139a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9139a)});
    }
}
