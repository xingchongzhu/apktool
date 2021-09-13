package p010b.p023c.p024a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: b.c.a.h */
class RoundRectDrawableWithShadow extends Drawable {

    /* renamed from: a */
    private static final double f3899a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    static C0543a f3900b;

    /* renamed from: c */
    private final int f3901c;

    /* renamed from: d */
    private Paint f3902d;

    /* renamed from: e */
    private Paint f3903e;

    /* renamed from: f */
    private Paint f3904f;

    /* renamed from: g */
    private final RectF f3905g;

    /* renamed from: h */
    private float f3906h;

    /* renamed from: i */
    private Path f3907i;

    /* renamed from: j */
    private float f3908j;

    /* renamed from: k */
    private float f3909k;

    /* renamed from: l */
    private float f3910l;

    /* renamed from: m */
    private ColorStateList f3911m;

    /* renamed from: n */
    private boolean f3912n;

    /* renamed from: o */
    private final int f3913o;

    /* renamed from: p */
    private final int f3914p;

    /* renamed from: q */
    private boolean f3915q;

    /* renamed from: r */
    private boolean f3916r;

    /* renamed from: b.c.a.h$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface C0543a {
        /* renamed from: a */
        void mo4322a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* renamed from: a */
    private void m4408a(Rect rect) {
        float f = this.f3908j;
        float f2 = 1.5f * f;
        this.f3905g.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m4409b();
    }

    /* renamed from: b */
    private void m4409b() {
        float f = this.f3906h;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f3909k;
        rectF2.inset(-f2, -f2);
        Path path = this.f3907i;
        if (path == null) {
            this.f3907i = new Path();
        } else {
            path.reset();
        }
        this.f3907i.setFillType(FillType.EVEN_ODD);
        this.f3907i.moveTo(-this.f3906h, 0.0f);
        this.f3907i.rLineTo(-this.f3909k, 0.0f);
        this.f3907i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f3907i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f3907i.close();
        float f3 = this.f3906h;
        float f4 = f3 / (this.f3909k + f3);
        Paint paint = this.f3903e;
        float f5 = this.f3906h + this.f3909k;
        int i = this.f3913o;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f3914p}, new float[]{0.0f, f4, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f3904f;
        float f6 = this.f3906h;
        float f7 = -f6;
        float f8 = this.f3909k;
        float f9 = f7 + f8;
        float f10 = (-f6) - f8;
        int i2 = this.f3913o;
        LinearGradient linearGradient = new LinearGradient(0.0f, f9, 0.0f, f10, new int[]{i2, i2, this.f3914p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f3904f.setAntiAlias(false);
    }

    /* renamed from: c */
    static float m4410c(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f3899a;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: d */
    static float m4411d(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f3899a;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: e */
    private void m4412e(Canvas canvas) {
        float f = this.f3906h;
        float f2 = (-f) - this.f3909k;
        float f3 = f + ((float) this.f3901c) + (this.f3910l / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f3905g.width() - f4 > 0.0f;
        boolean z2 = this.f3905g.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f3905g;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f3907i, this.f3903e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f3905g.width() - f4, -this.f3906h, this.f3904f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f3905g;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f3907i, this.f3903e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f3905g.width() - f4, (-this.f3906h) + this.f3909k, this.f3904f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f3905g;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f3907i, this.f3903e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f3905g.height() - f4, -this.f3906h, this.f3904f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f3905g;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f3907i, this.f3903e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f3905g.height() - f4, -this.f3906h, this.f3904f);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m4413n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3911m = colorStateList;
        this.f3902d.setColor(colorStateList.getColorForState(getState(), this.f3911m.getDefaultColor()));
    }

    /* renamed from: s */
    private void m4414s(float f, float f2) {
        String str = ". Must be >= 0";
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            float t = (float) m4415t(f);
            float t2 = (float) m4415t(f2);
            if (t > t2) {
                if (!this.f3916r) {
                    this.f3916r = true;
                }
                t = t2;
            }
            if (this.f3910l != t || this.f3908j != t2) {
                this.f3910l = t;
                this.f3908j = t2;
                this.f3909k = (float) ((int) ((t * 1.5f) + ((float) this.f3901c) + 0.5f));
                this.f3912n = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: t */
    private int m4415t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public void draw(Canvas canvas) {
        if (this.f3912n) {
            m4408a(getBounds());
            this.f3912n = false;
        }
        canvas.translate(0.0f, this.f3910l / 2.0f);
        m4412e(canvas);
        canvas.translate(0.0f, (-this.f3910l) / 2.0f);
        f3900b.mo4322a(canvas, this.f3905g, this.f3906h, this.f3902d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ColorStateList mo4360f() {
        return this.f3911m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public float mo4361g() {
        return this.f3906h;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m4411d(this.f3908j, this.f3906h, this.f3915q));
        int ceil2 = (int) Math.ceil((double) m4410c(this.f3908j, this.f3906h, this.f3915q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4364h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public float mo4365i() {
        return this.f3908j;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f3911m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public float mo4367j() {
        float f = this.f3908j;
        return (Math.max(f, this.f3906h + ((float) this.f3901c) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f3908j * 1.5f) + ((float) this.f3901c)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public float mo4368k() {
        float f = this.f3908j;
        return (Math.max(f, this.f3906h + ((float) this.f3901c) + (f / 2.0f)) * 2.0f) + ((this.f3908j + ((float) this.f3901c)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public float mo4369l() {
        return this.f3910l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo4370m(boolean z) {
        this.f3915q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo4371o(ColorStateList colorStateList) {
        m4413n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3912n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f3911m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f3902d.getColor() == colorForState) {
            return false;
        }
        this.f3902d.setColor(colorForState);
        this.f3912n = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo4374p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f3906h != f2) {
                this.f3906h = f2;
                this.f3912n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo4375q(float f) {
        m4414s(this.f3910l, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo4376r(float f) {
        m4414s(f, this.f3908j);
    }

    public void setAlpha(int i) {
        this.f3902d.setAlpha(i);
        this.f3903e.setAlpha(i);
        this.f3904f.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3902d.setColorFilter(colorFilter);
    }
}
