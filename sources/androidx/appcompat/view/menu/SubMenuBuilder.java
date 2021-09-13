package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder.C0102a;

/* renamed from: androidx.appcompat.view.menu.r */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {

    /* renamed from: B */
    private MenuBuilder f686B;

    /* renamed from: C */
    private MenuItemImpl f687C;

    public SubMenuBuilder(Context context, MenuBuilder gVar, MenuItemImpl iVar) {
        super(context);
        this.f686B = gVar;
        this.f687C = iVar;
    }

    /* renamed from: D */
    public MenuBuilder mo646D() {
        return this.f686B.mo646D();
    }

    /* renamed from: F */
    public boolean mo648F() {
        return this.f686B.mo648F();
    }

    /* renamed from: G */
    public boolean mo649G() {
        return this.f686B.mo649G();
    }

    /* renamed from: H */
    public boolean mo650H() {
        return this.f686B.mo650H();
    }

    /* renamed from: R */
    public void mo659R(C0102a aVar) {
        this.f686B.mo659R(aVar);
    }

    /* renamed from: e0 */
    public Menu mo897e0() {
        return this.f686B;
    }

    /* renamed from: f */
    public boolean mo687f(MenuItemImpl iVar) {
        return this.f686B.mo687f(iVar);
    }

    public MenuItem getItem() {
        return this.f687C;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo690h(MenuBuilder gVar, MenuItem menuItem) {
        return super.mo690h(gVar, menuItem) || this.f686B.mo690h(gVar, menuItem);
    }

    /* renamed from: k */
    public boolean mo693k(MenuItemImpl iVar) {
        return this.f686B.mo693k(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f686B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo663V(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo665Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo666Z(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f687C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f686B.setQwertyMode(z);
    }

    /* renamed from: t */
    public String mo711t() {
        MenuItemImpl iVar = this.f687C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo711t());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo662U(i);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo664X(i);
    }

    public SubMenu setIcon(int i) {
        this.f687C.setIcon(i);
        return this;
    }
}
