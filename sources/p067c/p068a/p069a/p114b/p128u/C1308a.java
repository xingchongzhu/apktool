package p067c.p068a.p069a.p114b.p128u;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: c.a.a.b.u.a */
/* compiled from: DrawableUtils */
public final class C1308a {
    /* renamed from: a */
    public static PorterDuffColorFilter m11580a(Drawable drawable, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
