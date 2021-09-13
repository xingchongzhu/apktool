package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import p010b.p034g.p036e.p037a.SupportMenuItem;
import p010b.p034g.p043k.ActionProvider;

/* renamed from: androidx.appcompat.view.menu.a */
public class ActionMenuItem implements SupportMenuItem {

    /* renamed from: a */
    private final int f487a;

    /* renamed from: b */
    private final int f488b;

    /* renamed from: c */
    private final int f489c;

    /* renamed from: d */
    private CharSequence f490d;

    /* renamed from: e */
    private CharSequence f491e;

    /* renamed from: f */
    private Intent f492f;

    /* renamed from: g */
    private char f493g;

    /* renamed from: h */
    private int f494h = 4096;

    /* renamed from: i */
    private char f495i;

    /* renamed from: j */
    private int f496j = 4096;

    /* renamed from: k */
    private Drawable f497k;

    /* renamed from: l */
    private Context f498l;

    /* renamed from: m */
    private OnMenuItemClickListener f499m;

    /* renamed from: n */
    private CharSequence f500n;

    /* renamed from: o */
    private CharSequence f501o;

    /* renamed from: p */
    private ColorStateList f502p = null;

    /* renamed from: q */
    private Mode f503q = null;

    /* renamed from: r */
    private boolean f504r = false;

    /* renamed from: s */
    private boolean f505s = false;

    /* renamed from: t */
    private int f506t = 16;

    public ActionMenuItem(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f498l = context;
        this.f487a = i2;
        this.f488b = i;
        this.f489c = i4;
        this.f490d = charSequence;
    }

    /* renamed from: c */
    private void m540c() {
        Drawable drawable = this.f497k;
        if (drawable == null) {
            return;
        }
        if (this.f504r || this.f505s) {
            Drawable r = DrawableCompat.m1859r(drawable);
            this.f497k = r;
            Drawable mutate = r.mutate();
            this.f497k = mutate;
            if (this.f504r) {
                DrawableCompat.m1856o(mutate, this.f502p);
            }
            if (this.f505s) {
                DrawableCompat.m1857p(this.f497k, this.f503q);
            }
        }
    }

    /* renamed from: a */
    public SupportMenuItem mo522a(ActionProvider bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public ActionProvider mo523b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public SupportMenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public SupportMenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f496j;
    }

    public char getAlphabeticShortcut() {
        return this.f495i;
    }

    public CharSequence getContentDescription() {
        return this.f500n;
    }

    public int getGroupId() {
        return this.f488b;
    }

    public Drawable getIcon() {
        return this.f497k;
    }

    public ColorStateList getIconTintList() {
        return this.f502p;
    }

    public Mode getIconTintMode() {
        return this.f503q;
    }

    public Intent getIntent() {
        return this.f492f;
    }

    public int getItemId() {
        return this.f487a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f494h;
    }

    public char getNumericShortcut() {
        return this.f493g;
    }

    public int getOrder() {
        return this.f489c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f490d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f491e;
        return charSequence != null ? charSequence : this.f490d;
    }

    public CharSequence getTooltipText() {
        return this.f501o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f506t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f506t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f506t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f506t & 8) == 0;
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f495i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f506t = z | (this.f506t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f506t = (z ? 2 : 0) | (this.f506t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f506t = (z ? 16 : 0) | (this.f506t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f497k = drawable;
        m540c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f502p = colorStateList;
        this.f504r = true;
        m540c();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f503q = mode;
        this.f505s = true;
        m540c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f492f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f493g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f499m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f493g = c;
        this.f495i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f490d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f491e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f506t & 8;
        if (z) {
            i = 0;
        }
        this.f506t = i2 | i;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f495i = Character.toLowerCase(c);
        this.f496j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f500n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f493g = c;
        this.f494h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f490d = this.f498l.getResources().getString(i);
        return this;
    }

    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f501o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f497k = ContextCompat.m1758d(this.f498l, i);
        m540c();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f493g = c;
        this.f494h = KeyEvent.normalizeMetaState(i);
        this.f495i = Character.toLowerCase(c2);
        this.f496j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
