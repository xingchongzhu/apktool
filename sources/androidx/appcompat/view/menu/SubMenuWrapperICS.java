package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p010b.p034g.p036e.p037a.SupportSubMenu;

/* renamed from: androidx.appcompat.view.menu.s */
class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {

    /* renamed from: e */
    private final SupportSubMenu f688e;

    SubMenuWrapperICS(Context context, SupportSubMenu cVar) {
        super(context, cVar);
        this.f688e = cVar;
    }

    public void clearHeader() {
        this.f688e.clearHeader();
    }

    public MenuItem getItem() {
        return mo597c(this.f688e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f688e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f688e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f688e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f688e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f688e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f688e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f688e.setIcon(drawable);
        return this;
    }
}
