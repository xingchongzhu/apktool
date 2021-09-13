package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;

/* renamed from: com.google.android.material.textfield.c */
class CutoutDrawable extends MaterialShapeDrawable {

    /* renamed from: A */
    private int f13432A;

    /* renamed from: y */
    private final Paint f13433y;

    /* renamed from: z */
    private final RectF f13434z;

    CutoutDrawable() {
        this(null);
    }

    /* renamed from: k0 */
    private void m16471k0(Canvas canvas) {
        if (!m16475r0(getCallback())) {
            canvas.restoreToCount(this.f13432A);
        }
    }

    /* renamed from: l0 */
    private void m16472l0(Canvas canvas) {
        Callback callback = getCallback();
        if (m16475r0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m16473n0(canvas);
    }

    /* renamed from: n0 */
    private void m16473n0(Canvas canvas) {
        if (VERSION.SDK_INT >= 21) {
            this.f13432A = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
            return;
        }
        this.f13432A = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    /* renamed from: q0 */
    private void m16474q0() {
        this.f13433y.setStyle(Style.FILL_AND_STROKE);
        this.f13433y.setColor(-1);
        this.f13433y.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }

    /* renamed from: r0 */
    private boolean m16475r0(Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        m16472l0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f13434z, this.f13433y);
        m16471k0(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j0 */
    public boolean mo16352j0() {
        return !this.f13434z.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m0 */
    public void mo16353m0() {
        mo16354o0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o0 */
    public void mo16354o0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f13434z;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p0 */
    public void mo16355p0(RectF rectF) {
        mo16354o0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    CutoutDrawable(ShapeAppearanceModel kVar) {
        if (kVar == null) {
            kVar = new ShapeAppearanceModel();
        }
        super(kVar);
        this.f13433y = new Paint(1);
        m16474q0();
        this.f13434z = new RectF();
    }
}
