package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.widget.e */
class AppCompatBackgroundHelper {

    /* renamed from: a */
    private final View f1000a;

    /* renamed from: b */
    private final AppCompatDrawableManager f1001b;

    /* renamed from: c */
    private int f1002c = -1;

    /* renamed from: d */
    private TintInfo f1003d;

    /* renamed from: e */
    private TintInfo f1004e;

    /* renamed from: f */
    private TintInfo f1005f;

    AppCompatBackgroundHelper(View view) {
        this.f1000a = view;
        this.f1001b = AppCompatDrawableManager.m1158b();
    }

    /* renamed from: a */
    private boolean m1086a(Drawable drawable) {
        if (this.f1005f == null) {
            this.f1005f = new TintInfo();
        }
        TintInfo v0Var = this.f1005f;
        v0Var.mo1762a();
        ColorStateList s = ViewCompat.m5580s(this.f1000a);
        if (s != null) {
            v0Var.f1223d = true;
            v0Var.f1220a = s;
        }
        Mode t = ViewCompat.m5582t(this.f1000a);
        if (t != null) {
            v0Var.f1222c = true;
            v0Var.f1221b = t;
        }
        if (!v0Var.f1223d && !v0Var.f1222c) {
            return false;
        }
        AppCompatDrawableManager.m1161i(drawable, v0Var, this.f1000a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1087k() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1003d == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1388b() {
        Drawable background = this.f1000a.getBackground();
        if (background != null && (!m1087k() || !m1086a(background))) {
            TintInfo v0Var = this.f1004e;
            if (v0Var != null) {
                AppCompatDrawableManager.m1161i(background, v0Var, this.f1000a.getDrawableState());
            } else {
                TintInfo v0Var2 = this.f1003d;
                if (v0Var2 != null) {
                    AppCompatDrawableManager.m1161i(background, v0Var2, this.f1000a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ColorStateList mo1389c() {
        TintInfo v0Var = this.f1004e;
        if (v0Var != null) {
            return v0Var.f1220a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Mode mo1390d() {
        TintInfo v0Var = this.f1004e;
        if (v0Var != null) {
            return v0Var.f1221b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1391e(AttributeSet attributeSet, int i) {
        Context context = this.f1000a.getContext();
        int[] iArr = C0511j.f3459D3;
        TintTypedArray v = TintTypedArray.m1406v(context, attributeSet, iArr, i, 0);
        View view = this.f1000a;
        ViewCompat.m5569m0(view, view.getContext(), iArr, attributeSet, v.mo1849r(), i, 0);
        try {
            int i2 = C0511j.f3464E3;
            if (v.mo1850s(i2)) {
                this.f1002c = v.mo1845n(i2, -1);
                ColorStateList f = this.f1001b.mo1500f(this.f1000a.getContext(), this.f1002c);
                if (f != null) {
                    mo1394h(f);
                }
            }
            int i3 = C0511j.f3469F3;
            if (v.mo1850s(i3)) {
                ViewCompat.m5581s0(this.f1000a, v.mo1834c(i3));
            }
            int i4 = C0511j.f3474G3;
            if (v.mo1850s(i4)) {
                ViewCompat.m5583t0(this.f1000a, DrawableUtils.m1123d(v.mo1842k(i4, -1), null));
            }
        } finally {
            v.mo1851w();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1392f(Drawable drawable) {
        this.f1002c = -1;
        mo1394h(null);
        mo1388b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1393g(int i) {
        this.f1002c = i;
        AppCompatDrawableManager jVar = this.f1001b;
        mo1394h(jVar != null ? jVar.mo1500f(this.f1000a.getContext(), i) : null);
        mo1388b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1394h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1003d == null) {
                this.f1003d = new TintInfo();
            }
            TintInfo v0Var = this.f1003d;
            v0Var.f1220a = colorStateList;
            v0Var.f1223d = true;
        } else {
            this.f1003d = null;
        }
        mo1388b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo1395i(ColorStateList colorStateList) {
        if (this.f1004e == null) {
            this.f1004e = new TintInfo();
        }
        TintInfo v0Var = this.f1004e;
        v0Var.f1220a = colorStateList;
        v0Var.f1223d = true;
        mo1388b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1396j(Mode mode) {
        if (this.f1004e == null) {
            this.f1004e = new TintInfo();
        }
        TintInfo v0Var = this.f1004e;
        v0Var.f1221b = mode;
        v0Var.f1222c = true;
        mo1388b();
    }
}
