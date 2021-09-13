package p010b.p011a.p017n;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import java.util.ArrayList;
import p010b.p011a.p017n.ActionMode.C0527a;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p036e.p037a.SupportMenu;
import p010b.p034g.p036e.p037a.SupportMenuItem;

/* renamed from: b.a.n.f */
public class SupportActionModeWrapper extends ActionMode {

    /* renamed from: a */
    final Context f3796a;

    /* renamed from: b */
    final ActionMode f3797b;

    /* renamed from: b.a.n.f$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C0528a implements C0527a {

        /* renamed from: a */
        final Callback f3798a;

        /* renamed from: b */
        final Context f3799b;

        /* renamed from: c */
        final ArrayList<SupportActionModeWrapper> f3800c = new ArrayList<>();

        /* renamed from: d */
        final SimpleArrayMap<Menu, Menu> f3801d = new SimpleArrayMap<>();

        public C0528a(Context context, Callback callback) {
            this.f3799b = context;
            this.f3798a = callback;
        }

        /* renamed from: f */
        private Menu m4283f(Menu menu) {
            Menu menu2 = (Menu) this.f3801d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuWrapperICS oVar = new MenuWrapperICS(this.f3799b, (SupportMenu) menu);
            this.f3801d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public boolean mo391a(ActionMode bVar, Menu menu) {
            return this.f3798a.onPrepareActionMode(mo4228e(bVar), m4283f(menu));
        }

        /* renamed from: b */
        public void mo392b(ActionMode bVar) {
            this.f3798a.onDestroyActionMode(mo4228e(bVar));
        }

        /* renamed from: c */
        public boolean mo393c(ActionMode bVar, MenuItem menuItem) {
            return this.f3798a.onActionItemClicked(mo4228e(bVar), new MenuItemWrapperICS(this.f3799b, (SupportMenuItem) menuItem));
        }

        /* renamed from: d */
        public boolean mo394d(ActionMode bVar, Menu menu) {
            return this.f3798a.onCreateActionMode(mo4228e(bVar), m4283f(menu));
        }

        /* renamed from: e */
        public ActionMode mo4228e(ActionMode bVar) {
            int size = this.f3800c.size();
            for (int i = 0; i < size; i++) {
                SupportActionModeWrapper fVar = (SupportActionModeWrapper) this.f3800c.get(i);
                if (fVar != null && fVar.f3797b == bVar) {
                    return fVar;
                }
            }
            SupportActionModeWrapper fVar2 = new SupportActionModeWrapper(this.f3799b, bVar);
            this.f3800c.add(fVar2);
            return fVar2;
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode bVar) {
        this.f3796a = context;
        this.f3797b = bVar;
    }

    public void finish() {
        this.f3797b.mo470c();
    }

    public View getCustomView() {
        return this.f3797b.mo471d();
    }

    public Menu getMenu() {
        return new MenuWrapperICS(this.f3796a, (SupportMenu) this.f3797b.mo472e());
    }

    public MenuInflater getMenuInflater() {
        return this.f3797b.mo473f();
    }

    public CharSequence getSubtitle() {
        return this.f3797b.mo474g();
    }

    public Object getTag() {
        return this.f3797b.mo4199h();
    }

    public CharSequence getTitle() {
        return this.f3797b.mo475i();
    }

    public boolean getTitleOptionalHint() {
        return this.f3797b.mo4200j();
    }

    public void invalidate() {
        this.f3797b.mo476k();
    }

    public boolean isTitleOptional() {
        return this.f3797b.mo477l();
    }

    public void setCustomView(View view) {
        this.f3797b.mo478m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3797b.mo480o(charSequence);
    }

    public void setTag(Object obj) {
        this.f3797b.mo4201p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3797b.mo482r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f3797b.mo483s(z);
    }

    public void setSubtitle(int i) {
        this.f3797b.mo479n(i);
    }

    public void setTitle(int i) {
        this.f3797b.mo481q(i);
    }
}
