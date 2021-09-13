package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import p010b.p011a.C0502a;
import p010b.p011a.p017n.ActionMode;
import p010b.p011a.p017n.ActionMode.C0527a;
import p010b.p034g.p043k.KeyEventDispatcher;
import p010b.p034g.p043k.KeyEventDispatcher.C0633a;

/* renamed from: androidx.appcompat.app.g */
public class AppCompatDialog extends Dialog implements AppCompatCallback {

    /* renamed from: a */
    private AppCompatDelegate f380a;

    /* renamed from: b */
    private final C0633a f381b = new C0087a();

    /* renamed from: androidx.appcompat.app.g$a */
    /* compiled from: AppCompatDialog */
    class C0087a implements C0633a {
        C0087a() {
        }

        /* renamed from: e */
        public boolean mo432e(KeyEvent keyEvent) {
            return AppCompatDialog.this.mo421c(keyEvent);
        }
    }

    public AppCompatDialog(Context context, int i) {
        super(context, m419b(context, i));
        AppCompatDelegate a = mo419a();
        a.mo327D(m419b(context, i));
        a.mo339q(null);
    }

    /* renamed from: b */
    private static int m419b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0502a.f3302y, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public AppCompatDelegate mo419a() {
        if (this.f380a == null) {
            this.f380a = AppCompatDelegate.m268h(this, this);
        }
        return this.f380a;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo419a().mo329d(view, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo421c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean mo422d(int i) {
        return mo419a().mo346z(i);
    }

    public void dismiss() {
        super.dismiss();
        mo419a().mo340r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.m5329e(this.f381b, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: f */
    public void mo301f(ActionMode bVar) {
    }

    public <T extends View> T findViewById(int i) {
        return mo419a().mo332i(i);
    }

    /* renamed from: h */
    public void mo305h(ActionMode bVar) {
    }

    public void invalidateOptionsMenu() {
        mo419a().mo337o();
    }

    /* renamed from: l */
    public ActionMode mo308l(C0527a aVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo419a().mo336n();
        super.onCreate(bundle);
        mo419a().mo339q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo419a().mo345w();
    }

    public void setContentView(int i) {
        mo419a().mo324A(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo419a().mo328E(charSequence);
    }

    public void setContentView(View view) {
        mo419a().mo325B(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo419a().mo326C(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo419a().mo328E(getContext().getString(i));
    }
}
