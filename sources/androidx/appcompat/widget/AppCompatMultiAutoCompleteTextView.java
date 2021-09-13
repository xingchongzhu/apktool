package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p010b.p011a.C0502a;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.TintableBackgroundView;

/* renamed from: androidx.appcompat.widget.p */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements TintableBackgroundView {

    /* renamed from: a */
    private static final int[] f1145a = {16843126};

    /* renamed from: b */
    private final AppCompatBackgroundHelper f1146b;

    /* renamed from: c */
    private final AppCompatTextHelper f1147c;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3293p);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper eVar = this.f1146b;
        if (eVar != null) {
            eVar.mo1388b();
        }
        AppCompatTextHelper zVar = this.f1147c;
        if (zVar != null) {
            zVar.mo1864b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper eVar = this.f1146b;
        if (eVar != null) {
            return eVar.mo1389c();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper eVar = this.f1146b;
        if (eVar != null) {
            return eVar.mo1390d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AppCompatHintHelper.m1238a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper eVar = this.f1146b;
        if (eVar != null) {
            eVar.mo1392f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper eVar = this.f1146b;
        if (eVar != null) {
            eVar.mo1393g(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AppCompatResources.m4143d(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper eVar = this.f1146b;
        if (eVar != null) {
            eVar.mo1395i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        AppCompatBackgroundHelper eVar = this.f1146b;
        if (eVar != null) {
            eVar.mo1396j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper zVar = this.f1147c;
        if (zVar != null) {
            zVar.mo1878q(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.m1357b(context), attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        TintTypedArray v = TintTypedArray.m1406v(getContext(), attributeSet, f1145a, i, 0);
        if (v.mo1850s(0)) {
            setDropDownBackgroundDrawable(v.mo1838g(0));
        }
        v.mo1851w();
        AppCompatBackgroundHelper eVar = new AppCompatBackgroundHelper(this);
        this.f1146b = eVar;
        eVar.mo1391e(attributeSet, i);
        AppCompatTextHelper zVar = new AppCompatTextHelper(this);
        this.f1147c = zVar;
        zVar.mo1874m(attributeSet, i);
        zVar.mo1864b();
    }
}
