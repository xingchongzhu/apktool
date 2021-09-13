package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.widget.Toolbar.C0149e;
import p010b.p011a.C0502a;
import p010b.p011a.C0506e;
import p010b.p011a.C0507f;
import p010b.p011a.C0509h;
import p010b.p011a.C0511j;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorListenerAdapter;

/* renamed from: androidx.appcompat.widget.y0 */
public class ToolbarWidgetWrapper implements DecorToolbar {

    /* renamed from: a */
    Toolbar f1265a;

    /* renamed from: b */
    private int f1266b;

    /* renamed from: c */
    private View f1267c;

    /* renamed from: d */
    private View f1268d;

    /* renamed from: e */
    private Drawable f1269e;

    /* renamed from: f */
    private Drawable f1270f;

    /* renamed from: g */
    private Drawable f1271g;

    /* renamed from: h */
    private boolean f1272h;

    /* renamed from: i */
    CharSequence f1273i;

    /* renamed from: j */
    private CharSequence f1274j;

    /* renamed from: k */
    private CharSequence f1275k;

    /* renamed from: l */
    Callback f1276l;

    /* renamed from: m */
    boolean f1277m;

    /* renamed from: n */
    private ActionMenuPresenter f1278n;

    /* renamed from: o */
    private int f1279o;

    /* renamed from: p */
    private int f1280p;

    /* renamed from: q */
    private Drawable f1281q;

    /* renamed from: androidx.appcompat.widget.y0$a */
    /* compiled from: ToolbarWidgetWrapper */
    class C0207a implements OnClickListener {

        /* renamed from: a */
        final ActionMenuItem f1282a;

        C0207a() {
            ActionMenuItem aVar = new ActionMenuItem(ToolbarWidgetWrapper.this.f1265a.getContext(), 0, 16908332, 0, 0, ToolbarWidgetWrapper.this.f1273i);
            this.f1282a = aVar;
        }

        public void onClick(View view) {
            ToolbarWidgetWrapper y0Var = ToolbarWidgetWrapper.this;
            Callback callback = y0Var.f1276l;
            if (callback != null && y0Var.f1277m) {
                callback.onMenuItemSelected(0, this.f1282a);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y0$b */
    /* compiled from: ToolbarWidgetWrapper */
    class C0208b extends ViewPropertyAnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f1284a = false;

        /* renamed from: b */
        final /* synthetic */ int f1285b;

        C0208b(int i) {
            this.f1285b = i;
        }

        /* renamed from: a */
        public void mo1283a(View view) {
            this.f1284a = true;
        }

        /* renamed from: b */
        public void mo387b(View view) {
            if (!this.f1284a) {
                ToolbarWidgetWrapper.this.f1265a.setVisibility(this.f1285b);
            }
        }

        /* renamed from: c */
        public void mo388c(View view) {
            ToolbarWidgetWrapper.this.f1265a.setVisibility(0);
        }
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0509h.f3425a, C0506e.f3350n);
    }

    /* renamed from: F */
    private void m1429F(CharSequence charSequence) {
        this.f1273i = charSequence;
        if ((this.f1266b & 8) != 0) {
            this.f1265a.setTitle(charSequence);
        }
    }

    /* renamed from: G */
    private void m1430G() {
        if ((this.f1266b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1275k)) {
            this.f1265a.setNavigationContentDescription(this.f1280p);
        } else {
            this.f1265a.setNavigationContentDescription(this.f1275k);
        }
    }

    /* renamed from: H */
    private void m1431H() {
        if ((this.f1266b & 4) != 0) {
            Toolbar toolbar = this.f1265a;
            Drawable drawable = this.f1271g;
            if (drawable == null) {
                drawable = this.f1281q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1265a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: I */
    private void m1432I() {
        Drawable drawable;
        int i = this.f1266b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1270f;
            if (drawable == null) {
                drawable = this.f1269e;
            }
        } else {
            drawable = this.f1269e;
        }
        this.f1265a.setLogo(drawable);
    }

    /* renamed from: w */
    private int m1433w() {
        if (this.f1265a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1281q = this.f1265a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void mo1854A(int i) {
        mo1855B(i == 0 ? null : mo1411m().getString(i));
    }

    /* renamed from: B */
    public void mo1855B(CharSequence charSequence) {
        this.f1275k = charSequence;
        m1430G();
    }

    /* renamed from: C */
    public void mo1856C(Drawable drawable) {
        this.f1271g = drawable;
        m1431H();
    }

    /* renamed from: D */
    public void mo1857D(CharSequence charSequence) {
        this.f1274j = charSequence;
        if ((this.f1266b & 8) != 0) {
            this.f1265a.setSubtitle(charSequence);
        }
    }

    /* renamed from: E */
    public void mo1858E(CharSequence charSequence) {
        this.f1272h = true;
        m1429F(charSequence);
    }

    /* renamed from: a */
    public void mo1397a(Menu menu, C0111a aVar) {
        if (this.f1278n == null) {
            ActionMenuPresenter cVar = new ActionMenuPresenter(this.f1265a.getContext());
            this.f1278n = cVar;
            cVar.mo595p(C0507f.f3385g);
        }
        this.f1278n.mo590k(aVar);
        this.f1265a.mo1168I((MenuBuilder) menu, this.f1278n);
    }

    /* renamed from: b */
    public boolean mo1398b() {
        return this.f1265a.mo1165A();
    }

    /* renamed from: c */
    public void mo1399c() {
        this.f1277m = true;
    }

    public void collapseActionView() {
        this.f1265a.mo1175e();
    }

    /* renamed from: d */
    public boolean mo1401d() {
        return this.f1265a.mo1256z();
    }

    /* renamed from: e */
    public boolean mo1402e() {
        return this.f1265a.mo1254w();
    }

    /* renamed from: f */
    public boolean mo1403f() {
        return this.f1265a.mo1171N();
    }

    /* renamed from: g */
    public boolean mo1404g() {
        return this.f1265a.mo1174d();
    }

    public CharSequence getTitle() {
        return this.f1265a.getTitle();
    }

    /* renamed from: h */
    public void mo1406h() {
        this.f1265a.mo1176f();
    }

    /* renamed from: i */
    public void mo1407i(int i) {
        this.f1265a.setVisibility(i);
    }

    /* renamed from: j */
    public void mo1408j(ScrollingTabContainerView q0Var) {
        View view = this.f1267c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1265a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1267c);
            }
        }
        this.f1267c = q0Var;
        if (q0Var != null && this.f1279o == 2) {
            this.f1265a.addView(q0Var, 0);
            C0149e eVar = (C0149e) this.f1267c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f272a = 8388691;
            q0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: k */
    public ViewGroup mo1409k() {
        return this.f1265a;
    }

    /* renamed from: l */
    public void mo1410l(boolean z) {
    }

    /* renamed from: m */
    public Context mo1411m() {
        return this.f1265a.getContext();
    }

    /* renamed from: n */
    public boolean mo1412n() {
        return this.f1265a.mo1253v();
    }

    /* renamed from: o */
    public void mo1413o(int i) {
        int i2 = this.f1266b ^ i;
        this.f1266b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1430G();
                }
                m1431H();
            }
            if ((i2 & 3) != 0) {
                m1432I();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1265a.setTitle(this.f1273i);
                    this.f1265a.setSubtitle(this.f1274j);
                } else {
                    this.f1265a.setTitle((CharSequence) null);
                    this.f1265a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0) {
                View view = this.f1268d;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f1265a.addView(view);
                } else {
                    this.f1265a.removeView(view);
                }
            }
        }
    }

    /* renamed from: p */
    public int mo1414p() {
        return this.f1266b;
    }

    /* renamed from: q */
    public void mo1415q(int i) {
        mo1861z(i != 0 ? AppCompatResources.m4143d(mo1411m(), i) : null);
    }

    /* renamed from: r */
    public int mo1416r() {
        return this.f1279o;
    }

    /* renamed from: s */
    public ViewPropertyAnimatorCompat mo1417s(int i, long j) {
        return ViewCompat.m5550d(this.f1265a).mo4958a(i == 0 ? 1.0f : 0.0f).mo4961d(j).mo4963f(new C0208b(i));
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? AppCompatResources.m4143d(mo1411m(), i) : null);
    }

    public void setWindowCallback(Callback callback) {
        this.f1276l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1272h) {
            m1429F(charSequence);
        }
    }

    /* renamed from: t */
    public void mo1422t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: u */
    public void mo1423u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: v */
    public void mo1424v(boolean z) {
        this.f1265a.setCollapsible(z);
    }

    /* renamed from: x */
    public void mo1859x(View view) {
        View view2 = this.f1268d;
        if (!(view2 == null || (this.f1266b & 16) == 0)) {
            this.f1265a.removeView(view2);
        }
        this.f1268d = view;
        if (view != null && (this.f1266b & 16) != 0) {
            this.f1265a.addView(view);
        }
    }

    /* renamed from: y */
    public void mo1860y(int i) {
        if (i != this.f1280p) {
            this.f1280p = i;
            if (TextUtils.isEmpty(this.f1265a.getNavigationContentDescription())) {
                mo1854A(this.f1280p);
            }
        }
    }

    /* renamed from: z */
    public void mo1861z(Drawable drawable) {
        this.f1270f = drawable;
        m1432I();
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z, int i, int i2) {
        this.f1279o = 0;
        this.f1280p = 0;
        this.f1265a = toolbar;
        this.f1273i = toolbar.getTitle();
        this.f1274j = toolbar.getSubtitle();
        this.f1272h = this.f1273i != null;
        this.f1271g = toolbar.getNavigationIcon();
        TintTypedArray v = TintTypedArray.m1406v(toolbar.getContext(), null, C0511j.f3555a, C0502a.f3280c, 0);
        this.f1281q = v.mo1838g(C0511j.f3610l);
        if (z) {
            CharSequence p = v.mo1847p(C0511j.f3640r);
            if (!TextUtils.isEmpty(p)) {
                mo1858E(p);
            }
            CharSequence p2 = v.mo1847p(C0511j.f3630p);
            if (!TextUtils.isEmpty(p2)) {
                mo1857D(p2);
            }
            Drawable g = v.mo1838g(C0511j.f3620n);
            if (g != null) {
                mo1861z(g);
            }
            Drawable g2 = v.mo1838g(C0511j.f3615m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1271g == null) {
                Drawable drawable = this.f1281q;
                if (drawable != null) {
                    mo1856C(drawable);
                }
            }
            mo1413o(v.mo1842k(C0511j.f3590h, 0));
            int n = v.mo1845n(C0511j.f3585g, 0);
            if (n != 0) {
                mo1859x(LayoutInflater.from(this.f1265a.getContext()).inflate(n, this.f1265a, false));
                mo1413o(this.f1266b | 16);
            }
            int m = v.mo1844m(C0511j.f3600j, 0);
            if (m > 0) {
                LayoutParams layoutParams = this.f1265a.getLayoutParams();
                layoutParams.height = m;
                this.f1265a.setLayoutParams(layoutParams);
            }
            int e = v.mo1836e(C0511j.f3580f, -1);
            int e2 = v.mo1836e(C0511j.f3575e, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1265a.mo1167H(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo1845n(C0511j.f3645s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1265a;
                toolbar2.mo1170K(toolbar2.getContext(), n2);
            }
            int n3 = v.mo1845n(C0511j.f3635q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1265a;
                toolbar3.mo1169J(toolbar3.getContext(), n3);
            }
            int n4 = v.mo1845n(C0511j.f3625o, 0);
            if (n4 != 0) {
                this.f1265a.setPopupTheme(n4);
            }
        } else {
            this.f1266b = m1433w();
        }
        v.mo1851w();
        mo1860y(i);
        this.f1275k = this.f1265a.getNavigationContentDescription();
        this.f1265a.setNavigationOnClickListener(new C0207a());
    }

    public void setIcon(Drawable drawable) {
        this.f1269e = drawable;
        m1432I();
    }
}
