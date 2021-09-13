package p010b.p011a.p017n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.C0102a;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p010b.p011a.p017n.ActionMode.C0527a;

/* renamed from: b.a.n.e */
public class StandaloneActionMode extends ActionMode implements C0102a {

    /* renamed from: c */
    private Context f3789c;

    /* renamed from: d */
    private ActionBarContextView f3790d;

    /* renamed from: e */
    private C0527a f3791e;

    /* renamed from: f */
    private WeakReference<View> f3792f;

    /* renamed from: g */
    private boolean f3793g;

    /* renamed from: h */
    private boolean f3794h;

    /* renamed from: i */
    private MenuBuilder f3795i;

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, C0527a aVar, boolean z) {
        this.f3789c = context;
        this.f3790d = actionBarContextView;
        this.f3791e = aVar;
        MenuBuilder S = new MenuBuilder(actionBarContextView.getContext()).mo660S(1);
        this.f3795i = S;
        S.mo659R(this);
        this.f3794h = z;
    }

    /* renamed from: a */
    public boolean mo362a(MenuBuilder gVar, MenuItem menuItem) {
        return this.f3791e.mo393c(this, menuItem);
    }

    /* renamed from: b */
    public void mo364b(MenuBuilder gVar) {
        mo476k();
        this.f3790d.mo944l();
    }

    /* renamed from: c */
    public void mo470c() {
        if (!this.f3793g) {
            this.f3793g = true;
            this.f3790d.sendAccessibilityEvent(32);
            this.f3791e.mo392b(this);
        }
    }

    /* renamed from: d */
    public View mo471d() {
        WeakReference<View> weakReference = this.f3792f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo472e() {
        return this.f3795i;
    }

    /* renamed from: f */
    public MenuInflater mo473f() {
        return new SupportMenuInflater(this.f3790d.getContext());
    }

    /* renamed from: g */
    public CharSequence mo474g() {
        return this.f3790d.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo475i() {
        return this.f3790d.getTitle();
    }

    /* renamed from: k */
    public void mo476k() {
        this.f3791e.mo391a(this, this.f3795i);
    }

    /* renamed from: l */
    public boolean mo477l() {
        return this.f3790d.mo942j();
    }

    /* renamed from: m */
    public void mo478m(View view) {
        this.f3790d.setCustomView(view);
        this.f3792f = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: n */
    public void mo479n(int i) {
        mo480o(this.f3789c.getString(i));
    }

    /* renamed from: o */
    public void mo480o(CharSequence charSequence) {
        this.f3790d.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo481q(int i) {
        mo482r(this.f3789c.getString(i));
    }

    /* renamed from: r */
    public void mo482r(CharSequence charSequence) {
        this.f3790d.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo483s(boolean z) {
        super.mo483s(z);
        this.f3790d.setTitleOptional(z);
    }
}
