package p067c.p068a.p069a.p114b.p117c0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.a.a.b.c0.b */
public final class AdjustedCornerSize implements CornerSize {

    /* renamed from: a */
    private final CornerSize f9087a;

    /* renamed from: b */
    private final float f9088b;

    public AdjustedCornerSize(float f, CornerSize cVar) {
        while (cVar instanceof AdjustedCornerSize) {
            cVar = ((AdjustedCornerSize) cVar).f9087a;
            f += ((AdjustedCornerSize) cVar).f9088b;
        }
        this.f9087a = cVar;
        this.f9088b = f;
    }

    /* renamed from: a */
    public float mo7819a(RectF rectF) {
        return Math.max(0.0f, this.f9087a.mo7819a(rectF) + this.f9088b);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize bVar = (AdjustedCornerSize) obj;
        if (!this.f9087a.equals(bVar.f9087a) || this.f9088b != bVar.f9088b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9087a, Float.valueOf(this.f9088b)});
    }
}
