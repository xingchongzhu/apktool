package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p035d.TypefaceCompat;
import p010b.p034g.p041i.PrecomputedTextCompat;
import p010b.p034g.p041i.PrecomputedTextCompat.C0602a;
import p010b.p034g.p043k.TintableBackgroundView;

/* renamed from: androidx.appcompat.widget.a0 */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView {

    /* renamed from: a */
    private final AppCompatBackgroundHelper f923a;

    /* renamed from: b */
    private final AppCompatTextHelper f924b;

    /* renamed from: c */
    private final AppCompatTextClassifierHelper f925c;

    /* renamed from: d */
    private boolean f926d;

    /* renamed from: e */
    private Future<PrecomputedTextCompat> f927e;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m981c() {
        Future<PrecomputedTextCompat> future = this.f927e;
        if (future != null) {
            try {
                this.f927e = null;
                TextViewCompat.m1987p(this, (PrecomputedTextCompat) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper eVar = this.f923a;
        if (eVar != null) {
            eVar.mo1388b();
        }
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1864b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.f2108E) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            return zVar.mo1866e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AutoSizeableTextView.f2108E) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            return zVar.mo1867f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AutoSizeableTextView.f2108E) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            return zVar.mo1868g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AutoSizeableTextView.f2108E) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper zVar = this.f924b;
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
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            return zVar.mo1870i();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.m1973b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.m1974c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper eVar = this.f923a;
        if (eVar != null) {
            return eVar.mo1389c();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper eVar = this.f923a;
        if (eVar != null) {
            return eVar.mo1390d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f924b.mo1871j();
    }

    public Mode getSupportCompoundDrawablesTintMode() {
        return this.f924b.mo1872k();
    }

    public CharSequence getText() {
        m981c();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            AppCompatTextClassifierHelper yVar = this.f925c;
            if (yVar != null) {
                return yVar.mo1852a();
            }
        }
        return super.getTextClassifier();
    }

    public C0602a getTextMetricsParamsCompat() {
        return TextViewCompat.m1978g(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f924b.mo1879r(this, onCreateInputConnection, editorInfo);
        return AppCompatHintHelper.m1238a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1876o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m981c();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null && !AutoSizeableTextView.f2108E && zVar.mo1873l()) {
            this.f924b.mo1865c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (AutoSizeableTextView.f2108E) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1881t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (AutoSizeableTextView.f2108E) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1882u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AutoSizeableTextView.f2108E) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1883v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper eVar = this.f923a;
        if (eVar != null) {
            eVar.mo1392f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper eVar = this.f923a;
        if (eVar != null) {
            eVar.mo1393g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1877p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1877p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1877p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1877p();
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m1990s(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.m1984m(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.m1985n(this, i);
        }
    }

    public void setLineHeight(int i) {
        TextViewCompat.m1986o(this, i);
    }

    public void setPrecomputedText(PrecomputedTextCompat cVar) {
        TextViewCompat.m1987p(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper eVar = this.f923a;
        if (eVar != null) {
            eVar.mo1395i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        AppCompatBackgroundHelper eVar = this.f923a;
        if (eVar != null) {
            eVar.mo1396j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f924b.mo1884w(colorStateList);
        this.f924b.mo1864b();
    }

    public void setSupportCompoundDrawablesTintMode(Mode mode) {
        this.f924b.mo1885x(mode);
        this.f924b.mo1864b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1878q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            AppCompatTextClassifierHelper yVar = this.f925c;
            if (yVar != null) {
                yVar.mo1853b(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.f927e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0602a aVar) {
        TextViewCompat.m1989r(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (AutoSizeableTextView.f2108E) {
            super.setTextSize(i, f);
            return;
        }
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1863A(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.f926d) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = TypefaceCompat.m4991a(getContext(), typeface, i);
            }
            this.f926d = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f926d = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.m1357b(context), attributeSet, i);
        this.f926d = false;
        ThemeUtils.m1343a(this, getContext());
        AppCompatBackgroundHelper eVar = new AppCompatBackgroundHelper(this);
        this.f923a = eVar;
        eVar.mo1391e(attributeSet, i);
        AppCompatTextHelper zVar = new AppCompatTextHelper(this);
        this.f924b = zVar;
        zVar.mo1874m(attributeSet, i);
        zVar.mo1864b();
        this.f925c = new AppCompatTextClassifierHelper(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? AppCompatResources.m4143d(context, i) : null;
        Drawable d2 = i2 != 0 ? AppCompatResources.m4143d(context, i2) : null;
        Drawable d3 = i3 != 0 ? AppCompatResources.m4143d(context, i3) : null;
        if (i4 != 0) {
            drawable = AppCompatResources.m4143d(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d, d2, d3, drawable);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1877p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? AppCompatResources.m4143d(context, i) : null;
        Drawable d2 = i2 != 0 ? AppCompatResources.m4143d(context, i2) : null;
        Drawable d3 = i3 != 0 ? AppCompatResources.m4143d(context, i3) : null;
        if (i4 != 0) {
            drawable = AppCompatResources.m4143d(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(d, d2, d3, drawable);
        AppCompatTextHelper zVar = this.f924b;
        if (zVar != null) {
            zVar.mo1877p();
        }
    }
}
