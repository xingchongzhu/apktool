package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: androidx.core.graphics.drawable.d */
class WrappedDrawableApi14 extends Drawable implements Callback, WrappedDrawable, TintAwareDrawable {

    /* renamed from: a */
    static final Mode f2029a = Mode.SRC_IN;

    /* renamed from: b */
    private int f2030b;

    /* renamed from: c */
    private Mode f2031c;

    /* renamed from: d */
    private boolean f2032d;

    /* renamed from: e */
    WrappedDrawableState f2033e;

    /* renamed from: f */
    private boolean f2034f;

    /* renamed from: g */
    Drawable f2035g;

    WrappedDrawableApi14(WrappedDrawableState fVar, Resources resources) {
        this.f2033e = fVar;
        m1863e(resources);
    }

    /* renamed from: d */
    private WrappedDrawableState m1862d() {
        return new WrappedDrawableState(this.f2033e);
    }

    /* renamed from: e */
    private void m1863e(Resources resources) {
        WrappedDrawableState fVar = this.f2033e;
        if (fVar != null) {
            ConstantState constantState = fVar.f2038b;
            if (constantState != null) {
                mo2190a(constantState.newDrawable(resources));
            }
        }
    }

    /* renamed from: f */
    private boolean m1864f(int[] iArr) {
        if (!mo2192c()) {
            return false;
        }
        WrappedDrawableState fVar = this.f2033e;
        ColorStateList colorStateList = fVar.f2039c;
        Mode mode = fVar.f2040d;
        if (colorStateList == null || mode == null) {
            this.f2032d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2032d && colorForState == this.f2030b && mode == this.f2031c)) {
                setColorFilter(colorForState, mode);
                this.f2030b = colorForState;
                this.f2031c = mode;
                this.f2032d = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2190a(Drawable drawable) {
        Drawable drawable2 = this.f2035g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2035g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState fVar = this.f2033e;
            if (fVar != null) {
                fVar.f2038b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final Drawable mo2191b() {
        return this.f2035g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2192c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2035g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState fVar = this.f2033e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2035g.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        WrappedDrawableState fVar = this.f2033e;
        if (fVar == null || !fVar.mo2228a()) {
            return null;
        }
        this.f2033e.f2037a = getChangingConfigurations();
        return this.f2033e;
    }

    public Drawable getCurrent() {
        return this.f2035g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2035g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2035g.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return DrawableCompat.m1847f(this.f2035g);
    }

    public int getMinimumHeight() {
        return this.f2035g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2035g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2035g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2035g.getPadding(rect);
    }

    public int[] getState() {
        return this.f2035g.getState();
    }

    public Region getTransparentRegion() {
        return this.f2035g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return DrawableCompat.m1849h(this.f2035g);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (mo2192c()) {
            WrappedDrawableState fVar = this.f2033e;
            if (fVar != null) {
                colorStateList = fVar.f2039c;
                return (colorStateList == null && colorStateList.isStateful()) || this.f2035g.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public void jumpToCurrentState() {
        this.f2035g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2034f && super.mutate() == this) {
            this.f2033e = m1862d();
            Drawable drawable = this.f2035g;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState fVar = this.f2033e;
            if (fVar != null) {
                Drawable drawable2 = this.f2035g;
                fVar.f2038b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2034f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2035g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return DrawableCompat.m1854m(this.f2035g, i);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2035g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2035g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        DrawableCompat.m1851j(this.f2035g, z);
    }

    public void setChangingConfigurations(int i) {
        this.f2035g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2035g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2035g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2035g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1864f(iArr) || this.f2035g.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2033e.f2039c = colorStateList;
        m1864f(getState());
    }

    public void setTintMode(Mode mode) {
        this.f2033e.f2040d = mode;
        m1864f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2035g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    WrappedDrawableApi14(Drawable drawable) {
        this.f2033e = m1862d();
        mo2190a(drawable);
    }
}
