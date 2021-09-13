package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.TextViewCompat;
import p010b.p011a.p012k.p013a.AppCompatResources;

/* renamed from: androidx.appcompat.widget.h */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f1031a = {16843016};

    /* renamed from: b */
    private final AppCompatTextHelper f1032b;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper zVar = this.f1032b;
        if (zVar != null) {
            zVar.mo1864b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AppCompatHintHelper.m1238a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AppCompatResources.m4143d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m1990s(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper zVar = this.f1032b;
        if (zVar != null) {
            zVar.mo1878q(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.m1357b(context), attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        AppCompatTextHelper zVar = new AppCompatTextHelper(this);
        this.f1032b = zVar;
        zVar.mo1874m(attributeSet, i);
        zVar.mo1864b();
        TintTypedArray v = TintTypedArray.m1406v(getContext(), attributeSet, f1031a, i, 0);
        setCheckMarkDrawable(v.mo1838g(0));
        v.mo1851w();
    }
}
