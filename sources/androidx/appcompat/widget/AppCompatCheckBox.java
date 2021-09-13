package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.TintableCompoundButton;
import p010b.p011a.C0502a;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.TintableBackgroundView;

/* renamed from: androidx.appcompat.widget.g */
public class AppCompatCheckBox extends CheckBox implements TintableCompoundButton, TintableBackgroundView {

    /* renamed from: a */
    private final AppCompatCompoundButtonHelper f1012a;

    /* renamed from: b */
    private final AppCompatBackgroundHelper f1013b;

    /* renamed from: c */
    private final AppCompatTextHelper f1014c;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3295r);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper eVar = this.f1013b;
        if (eVar != null) {
            eVar.mo1388b();
        }
        AppCompatTextHelper zVar = this.f1014c;
        if (zVar != null) {
            zVar.mo1864b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        AppCompatCompoundButtonHelper iVar = this.f1012a;
        return iVar != null ? iVar.mo1485b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper eVar = this.f1013b;
        if (eVar != null) {
            return eVar.mo1389c();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper eVar = this.f1013b;
        if (eVar != null) {
            return eVar.mo1390d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        AppCompatCompoundButtonHelper iVar = this.f1012a;
        if (iVar != null) {
            return iVar.mo1486c();
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        AppCompatCompoundButtonHelper iVar = this.f1012a;
        if (iVar != null) {
            return iVar.mo1487d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper eVar = this.f1013b;
        if (eVar != null) {
            eVar.mo1392f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper eVar = this.f1013b;
        if (eVar != null) {
            eVar.mo1393g(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        AppCompatCompoundButtonHelper iVar = this.f1012a;
        if (iVar != null) {
            iVar.mo1489f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper eVar = this.f1013b;
        if (eVar != null) {
            eVar.mo1395i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        AppCompatBackgroundHelper eVar = this.f1013b;
        if (eVar != null) {
            eVar.mo1396j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        AppCompatCompoundButtonHelper iVar = this.f1012a;
        if (iVar != null) {
            iVar.mo1490g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        AppCompatCompoundButtonHelper iVar = this.f1012a;
        if (iVar != null) {
            iVar.mo1491h(mode);
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.m1357b(context), attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        AppCompatCompoundButtonHelper iVar = new AppCompatCompoundButtonHelper(this);
        this.f1012a = iVar;
        iVar.mo1488e(attributeSet, i);
        AppCompatBackgroundHelper eVar = new AppCompatBackgroundHelper(this);
        this.f1013b = eVar;
        eVar.mo1391e(attributeSet, i);
        AppCompatTextHelper zVar = new AppCompatTextHelper(this);
        this.f1014c = zVar;
        zVar.mo1874m(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(AppCompatResources.m4143d(getContext(), i));
    }
}
