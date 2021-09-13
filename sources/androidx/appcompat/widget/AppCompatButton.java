package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import p010b.p011a.C0502a;
import p010b.p034g.p043k.TintableBackgroundView;

/* renamed from: androidx.appcompat.widget.f */
public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView {

    /* renamed from: a */
    private final AppCompatBackgroundHelper f1006a;

    /* renamed from: b */
    private final AppCompatTextHelper f1007b;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3294q);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper eVar = this.f1006a;
        if (eVar != null) {
            eVar.mo1388b();
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            zVar.mo1864b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.f2108E) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            return zVar.mo1866e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AutoSizeableTextView.f2108E) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            return zVar.mo1867f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AutoSizeableTextView.f2108E) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            return zVar.mo1868g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AutoSizeableTextView.f2108E) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper zVar = this.f1007b;
        return zVar != null ? zVar.mo1869h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i = 0;
        if (AutoSizeableTextView.f2108E) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            return zVar.mo1870i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper eVar = this.f1006a;
        if (eVar != null) {
            return eVar.mo1389c();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper eVar = this.f1006a;
        if (eVar != null) {
            return eVar.mo1390d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1007b.mo1871j();
    }

    public Mode getSupportCompoundDrawablesTintMode() {
        return this.f1007b.mo1872k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            zVar.mo1876o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null && !AutoSizeableTextView.f2108E && zVar.mo1873l()) {
            this.f1007b.mo1865c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (AutoSizeableTextView.f2108E) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            zVar.mo1881t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (AutoSizeableTextView.f2108E) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            zVar.mo1882u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AutoSizeableTextView.f2108E) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            zVar.mo1883v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper eVar = this.f1006a;
        if (eVar != null) {
            eVar.mo1392f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper eVar = this.f1006a;
        if (eVar != null) {
            eVar.mo1393g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m1990s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            zVar.mo1880s(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper eVar = this.f1006a;
        if (eVar != null) {
            eVar.mo1395i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        AppCompatBackgroundHelper eVar = this.f1006a;
        if (eVar != null) {
            eVar.mo1396j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1007b.mo1884w(colorStateList);
        this.f1007b.mo1864b();
    }

    public void setSupportCompoundDrawablesTintMode(Mode mode) {
        this.f1007b.mo1885x(mode);
        this.f1007b.mo1864b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            zVar.mo1878q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (AutoSizeableTextView.f2108E) {
            super.setTextSize(i, f);
            return;
        }
        AppCompatTextHelper zVar = this.f1007b;
        if (zVar != null) {
            zVar.mo1863A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.m1357b(context), attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        AppCompatBackgroundHelper eVar = new AppCompatBackgroundHelper(this);
        this.f1006a = eVar;
        eVar.mo1391e(attributeSet, i);
        AppCompatTextHelper zVar = new AppCompatTextHelper(this);
        this.f1007b = zVar;
        zVar.mo1874m(attributeSet, i);
        zVar.mo1864b();
    }
}
