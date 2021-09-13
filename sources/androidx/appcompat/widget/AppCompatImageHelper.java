package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.ImageViewCompat;
import p010b.p011a.C0511j;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.widget.n */
public class AppCompatImageHelper {

    /* renamed from: a */
    private final ImageView f1128a;

    /* renamed from: b */
    private TintInfo f1129b;

    /* renamed from: c */
    private TintInfo f1130c;

    /* renamed from: d */
    private TintInfo f1131d;

    public AppCompatImageHelper(ImageView imageView) {
        this.f1128a = imageView;
    }

    /* renamed from: a */
    private boolean m1250a(Drawable drawable) {
        if (this.f1131d == null) {
            this.f1131d = new TintInfo();
        }
        TintInfo v0Var = this.f1131d;
        v0Var.mo1762a();
        ColorStateList a = ImageViewCompat.m1961a(this.f1128a);
        if (a != null) {
            v0Var.f1223d = true;
            v0Var.f1220a = a;
        }
        Mode b = ImageViewCompat.m1962b(this.f1128a);
        if (b != null) {
            v0Var.f1222c = true;
            v0Var.f1221b = b;
        }
        if (!v0Var.f1223d && !v0Var.f1222c) {
            return false;
        }
        AppCompatDrawableManager.m1161i(drawable, v0Var, this.f1128a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m1251j() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1129b == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1617b() {
        Drawable drawable = this.f1128a.getDrawable();
        if (drawable != null) {
            DrawableUtils.m1121b(drawable);
        }
        if (drawable != null && (!m1251j() || !m1250a(drawable))) {
            TintInfo v0Var = this.f1130c;
            if (v0Var != null) {
                AppCompatDrawableManager.m1161i(drawable, v0Var, this.f1128a.getDrawableState());
            } else {
                TintInfo v0Var2 = this.f1129b;
                if (v0Var2 != null) {
                    AppCompatDrawableManager.m1161i(drawable, v0Var2, this.f1128a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ColorStateList mo1618c() {
        TintInfo v0Var = this.f1130c;
        if (v0Var != null) {
            return v0Var.f1220a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Mode mo1619d() {
        TintInfo v0Var = this.f1130c;
        if (v0Var != null) {
            return v0Var.f1221b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo1620e() {
        return VERSION.SDK_INT < 21 || !(this.f1128a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void mo1621f(AttributeSet attributeSet, int i) {
        Context context = this.f1128a.getContext();
        int[] iArr = C0511j.f3519R;
        TintTypedArray v = TintTypedArray.m1406v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1128a;
        ViewCompat.m5569m0(imageView, imageView.getContext(), iArr, attributeSet, v.mo1849r(), i, 0);
        try {
            Drawable drawable = this.f1128a.getDrawable();
            if (drawable == null) {
                int n = v.mo1845n(C0511j.f3523S, -1);
                if (n != -1) {
                    drawable = AppCompatResources.m4143d(this.f1128a.getContext(), n);
                    if (drawable != null) {
                        this.f1128a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                DrawableUtils.m1121b(drawable);
            }
            int i2 = C0511j.f3527T;
            if (v.mo1850s(i2)) {
                ImageViewCompat.m1963c(this.f1128a, v.mo1834c(i2));
            }
            int i3 = C0511j.f3531U;
            if (v.mo1850s(i3)) {
                ImageViewCompat.m1964d(this.f1128a, DrawableUtils.m1123d(v.mo1842k(i3, -1), null));
            }
        } finally {
            v.mo1851w();
        }
    }

    /* renamed from: g */
    public void mo1622g(int i) {
        if (i != 0) {
            Drawable d = AppCompatResources.m4143d(this.f1128a.getContext(), i);
            if (d != null) {
                DrawableUtils.m1121b(d);
            }
            this.f1128a.setImageDrawable(d);
        } else {
            this.f1128a.setImageDrawable(null);
        }
        mo1617b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1623h(ColorStateList colorStateList) {
        if (this.f1130c == null) {
            this.f1130c = new TintInfo();
        }
        TintInfo v0Var = this.f1130c;
        v0Var.f1220a = colorStateList;
        v0Var.f1223d = true;
        mo1617b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo1624i(Mode mode) {
        if (this.f1130c == null) {
            this.f1130c = new TintInfo();
        }
        TintInfo v0Var = this.f1130c;
        v0Var.f1221b = mode;
        v0Var.f1222c = true;
        mo1617b();
    }
}
