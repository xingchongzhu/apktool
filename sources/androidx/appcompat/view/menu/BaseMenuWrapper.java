package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p036e.p037a.SupportMenuItem;
import p010b.p034g.p036e.p037a.SupportSubMenu;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class BaseMenuWrapper {

    /* renamed from: a */
    final Context f517a;

    /* renamed from: b */
    private SimpleArrayMap<SupportMenuItem, MenuItem> f518b;

    /* renamed from: c */
    private SimpleArrayMap<SupportSubMenu, SubMenu> f519c;

    BaseMenuWrapper(Context context) {
        this.f517a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final MenuItem mo597c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem bVar = (SupportMenuItem) menuItem;
        if (this.f518b == null) {
            this.f518b = new SimpleArrayMap<>();
        }
        MenuItem menuItem2 = (MenuItem) this.f518b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS jVar = new MenuItemWrapperICS(this.f517a, bVar);
        this.f518b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final SubMenu mo598d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu cVar = (SupportSubMenu) subMenu;
        if (this.f519c == null) {
            this.f519c = new SimpleArrayMap<>();
        }
        SubMenu subMenu2 = (SubMenu) this.f519c.get(cVar);
        if (subMenu2 == null) {
            subMenu2 = new SubMenuWrapperICS(this.f517a, cVar);
            this.f519c.put(cVar, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo599e() {
        SimpleArrayMap<SupportMenuItem, MenuItem> gVar = this.f518b;
        if (gVar != null) {
            gVar.clear();
        }
        SimpleArrayMap<SupportSubMenu, SubMenu> gVar2 = this.f519c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo600f(int i) {
        if (this.f518b != null) {
            int i2 = 0;
            while (i2 < this.f518b.size()) {
                if (((SupportMenuItem) this.f518b.mo4508i(i2)).getGroupId() == i) {
                    this.f518b.mo4511k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo601g(int i) {
        if (this.f518b != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f518b.size()) {
                    break;
                } else if (((SupportMenuItem) this.f518b.mo4508i(i2)).getItemId() == i) {
                    this.f518b.mo4511k(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }
}
