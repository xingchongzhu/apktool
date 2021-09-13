package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
class WrappedDrawableApi21 extends WrappedDrawableApi14 {

    /* renamed from: h */
    private static Method f2036h;

    WrappedDrawableApi21(Drawable drawable) {
        super(drawable);
        m1868g();
    }

    /* renamed from: g */
    private void m1868g() {
        if (f2036h == null) {
            try {
                f2036h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2192c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2035g;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f2035g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2035g.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f2035g.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2035g.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo2192c()) {
            super.setTint(i);
        } else {
            this.f2035g.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo2192c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2035g.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo2192c()) {
            super.setTintMode(mode);
        } else {
            this.f2035g.setTintMode(mode);
        }
    }

    WrappedDrawableApi21(WrappedDrawableState fVar, Resources resources) {
        super(fVar, resources);
        m1868g();
    }
}
