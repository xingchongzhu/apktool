package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.MenuView.C0112a;
import androidx.core.graphics.drawable.DrawableCompat;
import p010b.p011a.C0509h;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p036e.p037a.SupportMenuItem;
import p010b.p034g.p043k.ActionProvider;
import p010b.p034g.p043k.ActionProvider.C0618b;

/* renamed from: androidx.appcompat.view.menu.i */
public final class MenuItemImpl implements SupportMenuItem {

    /* renamed from: A */
    private View f605A;

    /* renamed from: B */
    private ActionProvider f606B;

    /* renamed from: C */
    private OnActionExpandListener f607C;

    /* renamed from: D */
    private boolean f608D = false;

    /* renamed from: E */
    private ContextMenuInfo f609E;

    /* renamed from: a */
    private final int f610a;

    /* renamed from: b */
    private final int f611b;

    /* renamed from: c */
    private final int f612c;

    /* renamed from: d */
    private final int f613d;

    /* renamed from: e */
    private CharSequence f614e;

    /* renamed from: f */
    private CharSequence f615f;

    /* renamed from: g */
    private Intent f616g;

    /* renamed from: h */
    private char f617h;

    /* renamed from: i */
    private int f618i = 4096;

    /* renamed from: j */
    private char f619j;

    /* renamed from: k */
    private int f620k = 4096;

    /* renamed from: l */
    private Drawable f621l;

    /* renamed from: m */
    private int f622m = 0;

    /* renamed from: n */
    MenuBuilder f623n;

    /* renamed from: o */
    private SubMenuBuilder f624o;

    /* renamed from: p */
    private Runnable f625p;

    /* renamed from: q */
    private OnMenuItemClickListener f626q;

    /* renamed from: r */
    private CharSequence f627r;

    /* renamed from: s */
    private CharSequence f628s;

    /* renamed from: t */
    private ColorStateList f629t = null;

    /* renamed from: u */
    private Mode f630u = null;

    /* renamed from: v */
    private boolean f631v = false;

    /* renamed from: w */
    private boolean f632w = false;

    /* renamed from: x */
    private boolean f633x = false;

    /* renamed from: y */
    private int f634y = 16;

    /* renamed from: z */
    private int f635z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* compiled from: MenuItemImpl */
    class C0104a implements C0618b {
        C0104a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            MenuItemImpl iVar = MenuItemImpl.this;
            iVar.f623n.mo652J(iVar);
        }
    }

    MenuItemImpl(MenuBuilder gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f623n = gVar;
        this.f610a = i2;
        this.f611b = i;
        this.f612c = i3;
        this.f613d = i4;
        this.f614e = charSequence;
        this.f635z = i5;
    }

    /* renamed from: d */
    private static void m673d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m674e(Drawable drawable) {
        if (drawable != null && this.f633x && (this.f631v || this.f632w)) {
            drawable = DrawableCompat.m1859r(drawable).mutate();
            if (this.f631v) {
                DrawableCompat.m1856o(drawable, this.f629t);
            }
            if (this.f632w) {
                DrawableCompat.m1857p(drawable, this.f630u);
            }
            this.f633x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public boolean mo723A() {
        return this.f623n.mo650H() && mo727g() != 0;
    }

    /* renamed from: B */
    public boolean mo724B() {
        return (this.f635z & 4) == 4;
    }

    /* renamed from: a */
    public SupportMenuItem mo522a(ActionProvider bVar) {
        ActionProvider bVar2 = this.f606B;
        if (bVar2 != null) {
            bVar2.mo4972h();
        }
        this.f605A = null;
        this.f606B = bVar;
        this.f623n.mo653K(true);
        ActionProvider bVar3 = this.f606B;
        if (bVar3 != null) {
            bVar3.mo844j(new C0104a());
        }
        return this;
    }

    /* renamed from: b */
    public ActionProvider mo523b() {
        return this.f606B;
    }

    /* renamed from: c */
    public void mo725c() {
        this.f623n.mo651I(this);
    }

    public boolean collapseActionView() {
        if ((this.f635z & 8) == 0) {
            return false;
        }
        if (this.f605A == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f607C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f623n.mo687f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo747j()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f607C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f623n.mo693k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo726f() {
        return this.f613d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public char mo727g() {
        return this.f623n.mo649G() ? this.f619j : this.f617h;
    }

    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f605A;
        if (view != null) {
            return view;
        }
        ActionProvider bVar = this.f606B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo842d(this);
        this.f605A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f620k;
    }

    public char getAlphabeticShortcut() {
        return this.f619j;
    }

    public CharSequence getContentDescription() {
        return this.f627r;
    }

    public int getGroupId() {
        return this.f611b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f621l;
        if (drawable != null) {
            return m674e(drawable);
        }
        if (this.f622m == 0) {
            return null;
        }
        Drawable d = AppCompatResources.m4143d(this.f623n.mo712u(), this.f622m);
        this.f622m = 0;
        this.f621l = d;
        return m674e(d);
    }

    public ColorStateList getIconTintList() {
        return this.f629t;
    }

    public Mode getIconTintMode() {
        return this.f630u;
    }

    public Intent getIntent() {
        return this.f616g;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f610a;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f609E;
    }

    public int getNumericModifiers() {
        return this.f618i;
    }

    public char getNumericShortcut() {
        return this.f617h;
    }

    public int getOrder() {
        return this.f612c;
    }

    public SubMenu getSubMenu() {
        return this.f624o;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f614e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f615f;
        if (charSequence == null) {
            charSequence = this.f614e;
        }
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f628s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo740h() {
        char g = mo727g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f623n.mo712u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f623n.mo712u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0509h.f3435k));
        }
        int i = this.f623n.mo649G() ? this.f620k : this.f618i;
        m673d(sb, i, 65536, resources.getString(C0509h.f3431g));
        m673d(sb, i, 4096, resources.getString(C0509h.f3427c));
        m673d(sb, i, 2, resources.getString(C0509h.f3426b));
        m673d(sb, i, 1, resources.getString(C0509h.f3432h));
        m673d(sb, i, 4, resources.getString(C0509h.f3434j));
        m673d(sb, i, 8, resources.getString(C0509h.f3430f));
        if (g == 8) {
            sb.append(resources.getString(C0509h.f3428d));
        } else if (g == 10) {
            sb.append(resources.getString(C0509h.f3429e));
        } else if (g != ' ') {
            sb.append(g);
        } else {
            sb.append(resources.getString(C0509h.f3433i));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f624o != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public CharSequence mo742i(C0112a aVar) {
        if (aVar == null || !aVar.mo487d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f608D;
    }

    public boolean isCheckable() {
        return (this.f634y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f634y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f634y & 16) != 0;
    }

    public boolean isVisible() {
        ActionProvider bVar = this.f606B;
        boolean z = true;
        if (bVar == null || !bVar.mo843g()) {
            if ((this.f634y & 8) != 0) {
                z = false;
            }
            return z;
        }
        if ((this.f634y & 8) != 0 || !this.f606B.mo841b()) {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo747j() {
        if ((this.f635z & 8) == 0) {
            return false;
        }
        if (this.f605A == null) {
            ActionProvider bVar = this.f606B;
            if (bVar != null) {
                this.f605A = bVar.mo842d(this);
            }
        }
        if (this.f605A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo748k() {
        OnMenuItemClickListener onMenuItemClickListener = this.f626q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        MenuBuilder gVar = this.f623n;
        if (gVar.mo690h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f625p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f616g != null) {
            try {
                this.f623n.mo712u().startActivity(this.f616g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        ActionProvider bVar = this.f606B;
        if (bVar == null || !bVar.mo839e()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo749l() {
        return (this.f634y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo750m() {
        return (this.f634y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo751n() {
        return (this.f635z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo752o() {
        return (this.f635z & 2) == 2;
    }

    /* renamed from: p */
    public SupportMenuItem setActionView(int i) {
        Context u = this.f623n.mo712u();
        setActionView(LayoutInflater.from(u).inflate(i, new LinearLayout(u), false));
        return this;
    }

    /* renamed from: q */
    public SupportMenuItem setActionView(View view) {
        this.f605A = view;
        this.f606B = null;
        if (view != null && view.getId() == -1) {
            int i = this.f610a;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f623n.mo651I(this);
        return this;
    }

    /* renamed from: r */
    public void mo755r(boolean z) {
        this.f608D = z;
        this.f623n.mo653K(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo756s(boolean z) {
        int i = this.f634y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f634y = i2;
        if (i != i2) {
            this.f623n.mo653K(false);
        }
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f619j == c) {
            return this;
        }
        this.f619j = Character.toLowerCase(c);
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f634y;
        boolean z2 = z | (i & true);
        this.f634y = z2 ? 1 : 0;
        if (i != z2) {
            this.f623n.mo653K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f634y & 4) != 0) {
            this.f623n.mo661T(this);
        } else {
            mo756s(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f634y |= 16;
        } else {
            this.f634y &= -17;
        }
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f622m = 0;
        this.f621l = drawable;
        this.f633x = true;
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f629t = colorStateList;
        this.f631v = true;
        this.f633x = true;
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f630u = mode;
        this.f632w = true;
        this.f633x = true;
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f616g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f617h == c) {
            return this;
        }
        this.f617h = c;
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f607C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f626q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f617h = c;
        this.f619j = Character.toLowerCase(c2);
        this.f623n.mo653K(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f635z = i;
            this.f623n.mo651I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f614e = charSequence;
        this.f623n.mo653K(false);
        SubMenuBuilder rVar = this.f624o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f615f = charSequence;
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo779y(z)) {
            this.f623n.mo652J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo773t(boolean z) {
        this.f634y = (z ? 4 : 0) | (this.f634y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f614e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo775u(boolean z) {
        if (z) {
            this.f634y |= 32;
        } else {
            this.f634y &= -33;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo776v(ContextMenuInfo contextMenuInfo) {
        this.f609E = contextMenuInfo;
    }

    /* renamed from: w */
    public SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo778x(SubMenuBuilder rVar) {
        this.f624o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public boolean mo779y(boolean z) {
        int i = this.f634y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f634y = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo780z() {
        return this.f623n.mo644A();
    }

    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f627r = charSequence;
        this.f623n.mo653K(false);
        return this;
    }

    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f628s = charSequence;
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f619j == c && this.f620k == i) {
            return this;
        }
        this.f619j = Character.toLowerCase(c);
        this.f620k = KeyEvent.normalizeMetaState(i);
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f617h == c && this.f618i == i) {
            return this;
        }
        this.f617h = c;
        this.f618i = KeyEvent.normalizeMetaState(i);
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f617h = c;
        this.f618i = KeyEvent.normalizeMetaState(i);
        this.f619j = Character.toLowerCase(c2);
        this.f620k = KeyEvent.normalizeMetaState(i2);
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f621l = null;
        this.f622m = i;
        this.f633x = true;
        this.f623n.mo653K(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f623n.mo712u().getString(i));
    }
}
