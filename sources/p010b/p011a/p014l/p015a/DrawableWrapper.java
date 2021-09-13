package p010b.p011a.p014l.p015a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import androidx.core.graphics.drawable.DrawableCompat;

/* renamed from: b.a.l.a.c */
public class DrawableWrapper extends Drawable implements Callback {

    /* renamed from: a */
    private Drawable f3754a;

    public DrawableWrapper(Drawable drawable) {
        mo4161b(drawable);
    }

    /* renamed from: a */
    public Drawable mo4160a() {
        return this.f3754a;
    }

    /* renamed from: b */
    public void mo4161b(Drawable drawable) {
        Drawable drawable2 = this.f3754a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3754a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f3754a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f3754a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f3754a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3754a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3754a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3754a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3754a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3754a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f3754a.getPadding(rect);
    }

    public int[] getState() {
        return this.f3754a.getState();
    }

    public Region getTransparentRegion() {
        return this.f3754a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return DrawableCompat.m1849h(this.f3754a);
    }

    public boolean isStateful() {
        return this.f3754a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f3754a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f3754a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f3754a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f3754a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        DrawableCompat.m1851j(this.f3754a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f3754a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3754a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3754a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3754a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        DrawableCompat.m1852k(this.f3754a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        DrawableCompat.m1853l(this.f3754a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f3754a.setState(iArr);
    }

    public void setTint(int i) {
        DrawableCompat.m1855n(this.f3754a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        DrawableCompat.m1856o(this.f3754a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        DrawableCompat.m1857p(this.f3754a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3754a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
