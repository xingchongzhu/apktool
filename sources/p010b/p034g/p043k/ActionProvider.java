package p010b.p034g.p043k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: b.g.k.b */
public abstract class ActionProvider {

    /* renamed from: a */
    private final Context f4608a;

    /* renamed from: b */
    private C0617a f4609b;

    /* renamed from: c */
    private C0618b f4610c;

    /* renamed from: b.g.k.b$a */
    /* compiled from: ActionProvider */
    public interface C0617a {
    }

    /* renamed from: b.g.k.b$b */
    /* compiled from: ActionProvider */
    public interface C0618b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public ActionProvider(Context context) {
        this.f4608a = context;
    }

    /* renamed from: a */
    public boolean mo837a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo841b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo838c();

    /* renamed from: d */
    public View mo842d(MenuItem menuItem) {
        return mo838c();
    }

    /* renamed from: e */
    public boolean mo839e() {
        return false;
    }

    /* renamed from: f */
    public void mo840f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo843g() {
        return false;
    }

    /* renamed from: h */
    public void mo4972h() {
        this.f4610c = null;
        this.f4609b = null;
    }

    /* renamed from: i */
    public void mo4973i(C0617a aVar) {
        this.f4609b = aVar;
    }

    /* renamed from: j */
    public void mo844j(C0618b bVar) {
        if (!(this.f4610c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.f4610c = bVar;
    }
}
