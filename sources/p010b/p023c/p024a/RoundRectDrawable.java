package p010b.p023c.p024a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: b.c.a.g */
class RoundRectDrawable extends Drawable {

    /* renamed from: a */
    private float f3888a;

    /* renamed from: b */
    private final Paint f3889b;

    /* renamed from: c */
    private final RectF f3890c;

    /* renamed from: d */
    private final Rect f3891d;

    /* renamed from: e */
    private float f3892e;

    /* renamed from: f */
    private boolean f3893f;

    /* renamed from: g */
    private boolean f3894g;

    /* renamed from: h */
    private ColorStateList f3895h;

    /* renamed from: i */
    private PorterDuffColorFilter f3896i;

    /* renamed from: j */
    private ColorStateList f3897j;

    /* renamed from: k */
    private Mode f3898k;

    /* renamed from: a */
    private PorterDuffColorFilter m4399a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m4400e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3895h = colorStateList;
        this.f3889b.setColor(colorStateList.getColorForState(getState(), this.f3895h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m4401i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f3890c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f3891d.set(rect);
        if (this.f3893f) {
            float d = RoundRectDrawableWithShadow.m4411d(this.f3892e, this.f3888a, this.f3894g);
            this.f3891d.inset((int) Math.ceil((double) RoundRectDrawableWithShadow.m4410c(this.f3892e, this.f3888a, this.f3894g)), (int) Math.ceil((double) d));
            this.f3890c.set(this.f3891d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo4343b() {
        return this.f3895h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo4344c() {
        return this.f3892e;
    }

    /* renamed from: d */
    public float mo4345d() {
        return this.f3888a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f3889b;
        if (this.f3896i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f3896i);
            z = true;
        }
        RectF rectF = this.f3890c;
        float f = this.f3888a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void mo4347f(ColorStateList colorStateList) {
        m4400e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4348g(float f, boolean z, boolean z2) {
        if (f != this.f3892e || this.f3893f != z || this.f3894g != z2) {
            this.f3892e = f;
            this.f3893f = z;
            this.f3894g = z2;
            m4401i(null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f3891d, this.f3888a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4351h(float f) {
        if (f != this.f3888a) {
            this.f3888a = f;
            m4401i(null);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f3897j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f3895h;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4401i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f3895h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f3889b.getColor();
        if (z) {
            this.f3889b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3897j;
        if (colorStateList2 != null) {
            Mode mode = this.f3898k;
            if (mode != null) {
                this.f3896i = m4399a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public void setAlpha(int i) {
        this.f3889b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3889b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3897j = colorStateList;
        this.f3896i = m4399a(colorStateList, this.f3898k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f3898k = mode;
        this.f3896i = m4399a(this.f3897j, mode);
        invalidateSelf();
    }
}
