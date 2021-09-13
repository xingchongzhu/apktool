package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.DrawableCompat;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.widget.w */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {

    /* renamed from: d */
    private final SeekBar f1224d;

    /* renamed from: e */
    private Drawable f1225e;

    /* renamed from: f */
    private ColorStateList f1226f = null;

    /* renamed from: g */
    private Mode f1227g = null;

    /* renamed from: h */
    private boolean f1228h = false;

    /* renamed from: i */
    private boolean f1229i = false;

    AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.f1224d = seekBar;
    }

    /* renamed from: f */
    private void m1359f() {
        Drawable drawable = this.f1225e;
        if (drawable == null) {
            return;
        }
        if (this.f1228h || this.f1229i) {
            Drawable r = DrawableCompat.m1859r(drawable.mutate());
            this.f1225e = r;
            if (this.f1228h) {
                DrawableCompat.m1856o(r, this.f1226f);
            }
            if (this.f1229i) {
                DrawableCompat.m1857p(this.f1225e, this.f1227g);
            }
            if (this.f1225e.isStateful()) {
                this.f1225e.setState(this.f1224d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1729c(AttributeSet attributeSet, int i) {
        super.mo1729c(attributeSet, i);
        Context context = this.f1224d.getContext();
        int[] iArr = C0511j.f3535V;
        TintTypedArray v = TintTypedArray.m1406v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1224d;
        ViewCompat.m5569m0(seekBar, seekBar.getContext(), iArr, attributeSet, v.mo1849r(), i, 0);
        Drawable h = v.mo1839h(C0511j.f3539W);
        if (h != null) {
            this.f1224d.setThumb(h);
        }
        mo1766j(v.mo1838g(C0511j.f3543X));
        int i2 = C0511j.f3551Z;
        if (v.mo1850s(i2)) {
            this.f1227g = DrawableUtils.m1123d(v.mo1842k(i2, -1), this.f1227g);
            this.f1229i = true;
        }
        int i3 = C0511j.f3547Y;
        if (v.mo1850s(i3)) {
            this.f1226f = v.mo1834c(i3);
            this.f1228h = true;
        }
        v.mo1851w();
        m1359f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1763g(Canvas canvas) {
        if (this.f1225e != null) {
            int max = this.f1224d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1225e.getIntrinsicWidth();
                int intrinsicHeight = this.f1225e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1225e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1224d.getWidth() - this.f1224d.getPaddingLeft()) - this.f1224d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1224d.getPaddingLeft(), (float) (this.f1224d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1225e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1764h() {
        Drawable drawable = this.f1225e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1224d.getDrawableState())) {
            this.f1224d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo1765i() {
        Drawable drawable = this.f1225e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1766j(Drawable drawable) {
        Drawable drawable2 = this.f1225e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1225e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1224d);
            DrawableCompat.m1854m(drawable, ViewCompat.m5514C(this.f1224d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1224d.getDrawableState());
            }
            m1359f();
        }
        this.f1224d.invalidate();
    }
}
