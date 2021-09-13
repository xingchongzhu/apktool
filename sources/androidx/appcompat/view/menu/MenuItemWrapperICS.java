package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider.VisibilityListener;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p010b.p011a.p017n.CollapsibleActionView;
import p010b.p034g.p036e.p037a.SupportMenuItem;
import p010b.p034g.p043k.ActionProvider;
import p010b.p034g.p043k.ActionProvider.C0618b;

/* renamed from: androidx.appcompat.view.menu.j */
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {

    /* renamed from: d */
    private final SupportMenuItem f637d;

    /* renamed from: e */
    private Method f638e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* compiled from: MenuItemWrapperICS */
    private class C0105a extends ActionProvider {

        /* renamed from: d */
        final android.view.ActionProvider f639d;

        C0105a(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f639d = actionProvider;
        }

        /* renamed from: a */
        public boolean mo837a() {
            return this.f639d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo838c() {
            return this.f639d.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo839e() {
            return this.f639d.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo840f(SubMenu subMenu) {
            this.f639d.onPrepareSubMenu(MenuItemWrapperICS.this.mo598d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* compiled from: MenuItemWrapperICS */
    private class C0106b extends C0105a implements VisibilityListener {

        /* renamed from: f */
        private C0618b f641f;

        C0106b(Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo841b() {
            return this.f639d.isVisible();
        }

        /* renamed from: d */
        public View mo842d(MenuItem menuItem) {
            return this.f639d.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo843g() {
            return this.f639d.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo844j(C0618b bVar) {
            this.f641f = bVar;
            this.f639d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0618b bVar = this.f641f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* compiled from: MenuItemWrapperICS */
    static class C0107c extends FrameLayout implements CollapsibleActionView {

        /* renamed from: a */
        final android.view.CollapsibleActionView f643a;

        C0107c(View view) {
            super(view.getContext());
            this.f643a = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo846a() {
            return (View) this.f643a;
        }

        /* renamed from: c */
        public void mo847c() {
            this.f643a.onActionViewExpanded();
        }

        /* renamed from: f */
        public void mo848f() {
            this.f643a.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* compiled from: MenuItemWrapperICS */
    private class C0108d implements OnActionExpandListener {

        /* renamed from: a */
        private final OnActionExpandListener f644a;

        C0108d(OnActionExpandListener onActionExpandListener) {
            this.f644a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f644a.onMenuItemActionCollapse(MenuItemWrapperICS.this.mo597c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f644a.onMenuItemActionExpand(MenuItemWrapperICS.this.mo597c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* compiled from: MenuItemWrapperICS */
    private class C0109e implements OnMenuItemClickListener {

        /* renamed from: a */
        private final OnMenuItemClickListener f646a;

        C0109e(OnMenuItemClickListener onMenuItemClickListener) {
            this.f646a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f646a.onMenuItemClick(MenuItemWrapperICS.this.mo597c(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem bVar) {
        super(context);
        if (bVar != null) {
            this.f637d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f637d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f637d.expandActionView();
    }

    public android.view.ActionProvider getActionProvider() {
        ActionProvider b = this.f637d.mo523b();
        if (b instanceof C0105a) {
            return ((C0105a) b).f639d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f637d.getActionView();
        return actionView instanceof C0107c ? ((C0107c) actionView).mo846a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f637d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f637d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f637d.getContentDescription();
    }

    public int getGroupId() {
        return this.f637d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f637d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f637d.getIconTintList();
    }

    public Mode getIconTintMode() {
        return this.f637d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f637d.getIntent();
    }

    public int getItemId() {
        return this.f637d.getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f637d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f637d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f637d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f637d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo598d(this.f637d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f637d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f637d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f637d.getTooltipText();
    }

    /* renamed from: h */
    public void mo803h(boolean z) {
        try {
            if (this.f638e == null) {
                this.f638e = this.f637d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f638e.invoke(this.f637d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f637d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f637d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f637d.isCheckable();
    }

    public boolean isChecked() {
        return this.f637d.isChecked();
    }

    public boolean isEnabled() {
        return this.f637d.isEnabled();
    }

    public boolean isVisible() {
        return this.f637d.isVisible();
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProvider bVar;
        if (VERSION.SDK_INT >= 16) {
            bVar = new C0106b(this.f517a, actionProvider);
        } else {
            bVar = new C0105a(this.f517a, actionProvider);
        }
        SupportMenuItem bVar2 = this.f637d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo522a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new C0107c(view);
        }
        this.f637d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f637d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f637d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f637d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f637d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f637d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f637d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f637d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f637d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f637d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f637d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f637d.setOnActionExpandListener(onActionExpandListener != null ? new C0108d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f637d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0109e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f637d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f637d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f637d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f637d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f637d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f637d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f637d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f637d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f637d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f637d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f637d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f637d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f637d.setActionView(i);
        View actionView = this.f637d.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.f637d.setActionView((View) new C0107c(actionView));
        }
        return this;
    }
}
