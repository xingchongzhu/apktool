package p010b.p011a.p017n;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: b.a.n.b */
public abstract class ActionMode {

    /* renamed from: a */
    private Object f3782a;

    /* renamed from: b */
    private boolean f3783b;

    /* renamed from: b.a.n.b$a */
    /* compiled from: ActionMode */
    public interface C0527a {
        /* renamed from: a */
        boolean mo391a(ActionMode bVar, Menu menu);

        /* renamed from: b */
        void mo392b(ActionMode bVar);

        /* renamed from: c */
        boolean mo393c(ActionMode bVar, MenuItem menuItem);

        /* renamed from: d */
        boolean mo394d(ActionMode bVar, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo470c();

    /* renamed from: d */
    public abstract View mo471d();

    /* renamed from: e */
    public abstract Menu mo472e();

    /* renamed from: f */
    public abstract MenuInflater mo473f();

    /* renamed from: g */
    public abstract CharSequence mo474g();

    /* renamed from: h */
    public Object mo4199h() {
        return this.f3782a;
    }

    /* renamed from: i */
    public abstract CharSequence mo475i();

    /* renamed from: j */
    public boolean mo4200j() {
        return this.f3783b;
    }

    /* renamed from: k */
    public abstract void mo476k();

    /* renamed from: l */
    public abstract boolean mo477l();

    /* renamed from: m */
    public abstract void mo478m(View view);

    /* renamed from: n */
    public abstract void mo479n(int i);

    /* renamed from: o */
    public abstract void mo480o(CharSequence charSequence);

    /* renamed from: p */
    public void mo4201p(Object obj) {
        this.f3782a = obj;
    }

    /* renamed from: q */
    public abstract void mo481q(int i);

    /* renamed from: r */
    public abstract void mo482r(CharSequence charSequence);

    /* renamed from: s */
    public void mo483s(boolean z) {
        this.f3783b = z;
    }
}
