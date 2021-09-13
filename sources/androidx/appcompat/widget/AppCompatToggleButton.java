package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p010b.p034g.p043k.TintableBackgroundView;

/* renamed from: androidx.appcompat.widget.c0 */
public class AppCompatToggleButton extends ToggleButton implements TintableBackgroundView {

    /* renamed from: a */
    private final AppCompatBackgroundHelper f992a;

    /* renamed from: b */
    private final AppCompatTextHelper f993b;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper eVar = this.f992a;
        if (eVar != null) {
            eVar.mo1388b();
        }
        AppCompatTextHelper zVar = this.f993b;
        if (zVar != null) {
            zVar.mo1864b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper eVar = this.f992a;
        if (eVar != null) {
            return eVar.mo1389c();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper eVar = this.f992a;
        if (eVar != null) {
            return eVar.mo1390d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper eVar = this.f992a;
        if (eVar != null) {
            eVar.mo1392f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper eVar = this.f992a;
        if (eVar != null) {
            eVar.mo1393g(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper eVar = this.f992a;
        if (eVar != null) {
            eVar.mo1395i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        AppCompatBackgroundHelper eVar = this.f992a;
        if (eVar != null) {
            eVar.mo1396j(mode);
        }
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        AppCompatBackgroundHelper eVar = new AppCompatBackgroundHelper(this);
        this.f992a = eVar;
        eVar.mo1391e(attributeSet, i);
        AppCompatTextHelper zVar = new AppCompatTextHelper(this);
        this.f993b = zVar;
        zVar.mo1874m(attributeSet, i);
    }
}
