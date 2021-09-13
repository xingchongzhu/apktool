package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import p010b.p011a.C0502a;
import p010b.p034g.p043k.ContentInfoCompat;
import p010b.p034g.p043k.OnReceiveContentViewBehavior;
import p010b.p034g.p043k.TintableBackgroundView;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p045g0.EditorInfoCompat;
import p010b.p034g.p043k.p045g0.InputConnectionCompat;

/* renamed from: androidx.appcompat.widget.k */
public class AppCompatEditText extends EditText implements TintableBackgroundView, OnReceiveContentViewBehavior {

    /* renamed from: a */
    private final AppCompatBackgroundHelper f1074a;

    /* renamed from: b */
    private final AppCompatTextHelper f1075b;

    /* renamed from: c */
    private final AppCompatTextClassifierHelper f1076c;

    /* renamed from: d */
    private final TextViewOnReceiveContentListener f1077d;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3265A);
    }

    /* renamed from: a */
    public ContentInfoCompat mo1547a(ContentInfoCompat cVar) {
        return this.f1077d.mo2342a(this, cVar);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper eVar = this.f1074a;
        if (eVar != null) {
            eVar.mo1388b();
        }
        AppCompatTextHelper zVar = this.f1075b;
        if (zVar != null) {
            zVar.mo1864b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper eVar = this.f1074a;
        if (eVar != null) {
            return eVar.mo1389c();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper eVar = this.f1074a;
        if (eVar != null) {
            return eVar.mo1390d();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            AppCompatTextClassifierHelper yVar = this.f1076c;
            if (yVar != null) {
                return yVar.mo1852a();
            }
        }
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1075b.mo1879r(this, onCreateInputConnection, editorInfo);
        InputConnection a = AppCompatHintHelper.m1238a(onCreateInputConnection, editorInfo, this);
        String[] F = ViewCompat.m5520F(this);
        if (a == null || F == null) {
            return a;
        }
        EditorInfoCompat.m5433d(editorInfo, F);
        return InputConnectionCompat.m5439a(a, editorInfo, AppCompatReceiveContentHelper.m1349a(this));
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (AppCompatReceiveContentHelper.m1350b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (AppCompatReceiveContentHelper.m1351c(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper eVar = this.f1074a;
        if (eVar != null) {
            eVar.mo1392f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper eVar = this.f1074a;
        if (eVar != null) {
            eVar.mo1393g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m1990s(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper eVar = this.f1074a;
        if (eVar != null) {
            eVar.mo1395i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        AppCompatBackgroundHelper eVar = this.f1074a;
        if (eVar != null) {
            eVar.mo1396j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper zVar = this.f1075b;
        if (zVar != null) {
            zVar.mo1878q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            AppCompatTextClassifierHelper yVar = this.f1076c;
            if (yVar != null) {
                yVar.mo1853b(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.m1357b(context), attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        AppCompatBackgroundHelper eVar = new AppCompatBackgroundHelper(this);
        this.f1074a = eVar;
        eVar.mo1391e(attributeSet, i);
        AppCompatTextHelper zVar = new AppCompatTextHelper(this);
        this.f1075b = zVar;
        zVar.mo1874m(attributeSet, i);
        zVar.mo1864b();
        this.f1076c = new AppCompatTextClassifierHelper(this);
        this.f1077d = new TextViewOnReceiveContentListener();
    }

    public Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
