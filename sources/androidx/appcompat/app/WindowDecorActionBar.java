package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar.C0058b;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.C0102a;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.C0119d;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p010b.p011a.C0502a;
import p010b.p011a.C0507f;
import p010b.p011a.C0511j;
import p010b.p011a.p017n.ActionBarPolicy;
import p010b.p011a.p017n.ActionMode;
import p010b.p011a.p017n.ActionMode.C0527a;
import p010b.p011a.p017n.SupportMenuInflater;
import p010b.p011a.p017n.ViewPropertyAnimatorCompatSet;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorListener;
import p010b.p034g.p043k.ViewPropertyAnimatorListenerAdapter;
import p010b.p034g.p043k.ViewPropertyAnimatorUpdateListener;

/* renamed from: androidx.appcompat.app.m */
public class WindowDecorActionBar extends ActionBar implements C0119d {

    /* renamed from: a */
    private static final Interpolator f415a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final Interpolator f416b = new DecelerateInterpolator();

    /* renamed from: A */
    ViewPropertyAnimatorCompatSet f417A;

    /* renamed from: B */
    private boolean f418B;

    /* renamed from: C */
    boolean f419C;

    /* renamed from: D */
    final ViewPropertyAnimatorListener f420D = new C0090a();

    /* renamed from: E */
    final ViewPropertyAnimatorListener f421E = new C0091b();

    /* renamed from: F */
    final ViewPropertyAnimatorUpdateListener f422F = new C0092c();

    /* renamed from: c */
    Context f423c;

    /* renamed from: d */
    private Context f424d;

    /* renamed from: e */
    private Activity f425e;

    /* renamed from: f */
    ActionBarOverlayLayout f426f;

    /* renamed from: g */
    ActionBarContainer f427g;

    /* renamed from: h */
    DecorToolbar f428h;

    /* renamed from: i */
    ActionBarContextView f429i;

    /* renamed from: j */
    View f430j;

    /* renamed from: k */
    ScrollingTabContainerView f431k;

    /* renamed from: l */
    private ArrayList<?> f432l = new ArrayList<>();

    /* renamed from: m */
    private int f433m = -1;

    /* renamed from: n */
    private boolean f434n;

    /* renamed from: o */
    C0093d f435o;

    /* renamed from: p */
    ActionMode f436p;

    /* renamed from: q */
    C0527a f437q;

    /* renamed from: r */
    private boolean f438r;

    /* renamed from: s */
    private ArrayList<C0058b> f439s = new ArrayList<>();

    /* renamed from: t */
    private boolean f440t;

    /* renamed from: u */
    private int f441u = 0;

    /* renamed from: v */
    boolean f442v = true;

    /* renamed from: w */
    boolean f443w;

    /* renamed from: x */
    boolean f444x;

    /* renamed from: y */
    private boolean f445y;

    /* renamed from: z */
    private boolean f446z = true;

    /* renamed from: androidx.appcompat.app.m$a */
    /* compiled from: WindowDecorActionBar */
    class C0090a extends ViewPropertyAnimatorListenerAdapter {
        C0090a() {
        }

        /* renamed from: b */
        public void mo387b(View view) {
            WindowDecorActionBar mVar = WindowDecorActionBar.this;
            if (mVar.f442v) {
                View view2 = mVar.f430j;
                if (view2 != null) {
                    view2.setTranslationY(0.0f);
                    WindowDecorActionBar.this.f427g.setTranslationY(0.0f);
                }
            }
            WindowDecorActionBar.this.f427g.setVisibility(8);
            WindowDecorActionBar.this.f427g.setTransitioning(false);
            WindowDecorActionBar mVar2 = WindowDecorActionBar.this;
            mVar2.f417A = null;
            mVar2.mo466x();
            ActionBarOverlayLayout actionBarOverlayLayout = WindowDecorActionBar.this.f426f;
            if (actionBarOverlayLayout != null) {
                ViewCompat.m5567l0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    /* compiled from: WindowDecorActionBar */
    class C0091b extends ViewPropertyAnimatorListenerAdapter {
        C0091b() {
        }

        /* renamed from: b */
        public void mo387b(View view) {
            WindowDecorActionBar mVar = WindowDecorActionBar.this;
            mVar.f417A = null;
            mVar.f427g.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    /* compiled from: WindowDecorActionBar */
    class C0092c implements ViewPropertyAnimatorUpdateListener {
        C0092c() {
        }

        /* renamed from: a */
        public void mo469a(View view) {
            ((View) WindowDecorActionBar.this.f427g.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    /* compiled from: WindowDecorActionBar */
    public class C0093d extends ActionMode implements C0102a {

        /* renamed from: c */
        private final Context f450c;

        /* renamed from: d */
        private final MenuBuilder f451d;

        /* renamed from: e */
        private C0527a f452e;

        /* renamed from: f */
        private WeakReference<View> f453f;

        public C0093d(Context context, C0527a aVar) {
            this.f450c = context;
            this.f452e = aVar;
            MenuBuilder S = new MenuBuilder(context).mo660S(1);
            this.f451d = S;
            S.mo659R(this);
        }

        /* renamed from: a */
        public boolean mo362a(MenuBuilder gVar, MenuItem menuItem) {
            C0527a aVar = this.f452e;
            if (aVar != null) {
                return aVar.mo393c(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo364b(MenuBuilder gVar) {
            if (this.f452e != null) {
                mo476k();
                WindowDecorActionBar.this.f429i.mo944l();
            }
        }

        /* renamed from: c */
        public void mo470c() {
            WindowDecorActionBar mVar = WindowDecorActionBar.this;
            if (mVar.f435o == this) {
                if (!WindowDecorActionBar.m473w(mVar.f443w, mVar.f444x, false)) {
                    WindowDecorActionBar mVar2 = WindowDecorActionBar.this;
                    mVar2.f436p = this;
                    mVar2.f437q = this.f452e;
                } else {
                    this.f452e.mo392b(this);
                }
                this.f452e = null;
                WindowDecorActionBar.this.mo465v(false);
                WindowDecorActionBar.this.f429i.mo934g();
                WindowDecorActionBar.this.f428h.mo1409k().sendAccessibilityEvent(32);
                WindowDecorActionBar mVar3 = WindowDecorActionBar.this;
                mVar3.f426f.setHideOnContentScrollEnabled(mVar3.f419C);
                WindowDecorActionBar.this.f435o = null;
            }
        }

        /* renamed from: d */
        public View mo471d() {
            WeakReference<View> weakReference = this.f453f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo472e() {
            return this.f451d;
        }

        /* renamed from: f */
        public MenuInflater mo473f() {
            return new SupportMenuInflater(this.f450c);
        }

        /* renamed from: g */
        public CharSequence mo474g() {
            return WindowDecorActionBar.this.f429i.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo475i() {
            return WindowDecorActionBar.this.f429i.getTitle();
        }

        /* renamed from: k */
        public void mo476k() {
            if (WindowDecorActionBar.this.f435o == this) {
                this.f451d.mo685d0();
                try {
                    this.f452e.mo391a(this, this.f451d);
                } finally {
                    this.f451d.mo680c0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo477l() {
            return WindowDecorActionBar.this.f429i.mo942j();
        }

        /* renamed from: m */
        public void mo478m(View view) {
            WindowDecorActionBar.this.f429i.setCustomView(view);
            this.f453f = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo479n(int i) {
            mo480o(WindowDecorActionBar.this.f423c.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo480o(CharSequence charSequence) {
            WindowDecorActionBar.this.f429i.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo481q(int i) {
            mo482r(WindowDecorActionBar.this.f423c.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo482r(CharSequence charSequence) {
            WindowDecorActionBar.this.f429i.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo483s(boolean z) {
            super.mo483s(z);
            WindowDecorActionBar.this.f429i.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo484t() {
            this.f451d.mo685d0();
            try {
                return this.f452e.mo394d(this, this.f451d);
            } finally {
                this.f451d.mo680c0();
            }
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z) {
        this.f425e = activity;
        View decorView = activity.getWindow().getDecorView();
        m468D(decorView);
        if (!z) {
            this.f430j = decorView.findViewById(16908290);
        }
    }

    /* renamed from: A */
    private DecorToolbar m466A(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: C */
    private void m467C() {
        if (this.f445y) {
            this.f445y = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f426f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m472M(false);
        }
    }

    /* renamed from: D */
    private void m468D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0507f.f3394p);
        this.f426f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f428h = m466A(view.findViewById(C0507f.f3379a));
        this.f429i = (ActionBarContextView) view.findViewById(C0507f.f3384f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0507f.f3381c);
        this.f427g = actionBarContainer;
        DecorToolbar e0Var = this.f428h;
        if (e0Var == null || this.f429i == null || actionBarContainer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(WindowDecorActionBar.class.getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f423c = e0Var.mo1411m();
        boolean z = (this.f428h.mo1414p() & 4) != 0;
        if (z) {
            this.f434n = true;
        }
        ActionBarPolicy b = ActionBarPolicy.m4231b(this.f423c);
        mo458J(b.mo4192a() || z);
        m469H(b.mo4197g());
        TypedArray obtainStyledAttributes = this.f423c.obtainStyledAttributes(null, C0511j.f3555a, C0502a.f3280c, 0);
        if (obtainStyledAttributes.getBoolean(C0511j.f3605k, false)) {
            mo457I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0511j.f3595i, 0);
        if (dimensionPixelSize != 0) {
            mo456G((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: H */
    private void m469H(boolean z) {
        this.f440t = z;
        if (!z) {
            this.f428h.mo1408j(null);
            this.f427g.setTabContainer(this.f431k);
        } else {
            this.f427g.setTabContainer(null);
            this.f428h.mo1408j(this.f431k);
        }
        boolean z2 = true;
        boolean z3 = mo453B() == 2;
        ScrollingTabContainerView q0Var = this.f431k;
        if (q0Var != null) {
            if (z3) {
                q0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f426f;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.m5567l0(actionBarOverlayLayout);
                }
            } else {
                q0Var.setVisibility(8);
            }
        }
        this.f428h.mo1424v(!this.f440t && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f426f;
        if (this.f440t || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: K */
    private boolean m470K() {
        return ViewCompat.m5537T(this.f427g);
    }

    /* renamed from: L */
    private void m471L() {
        if (!this.f445y) {
            this.f445y = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f426f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m472M(false);
        }
    }

    /* renamed from: M */
    private void m472M(boolean z) {
        if (m473w(this.f443w, this.f444x, this.f445y)) {
            if (!this.f446z) {
                this.f446z = true;
                mo468z(z);
            }
        } else if (this.f446z) {
            this.f446z = false;
            mo467y(z);
        }
    }

    /* renamed from: w */
    static boolean m473w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: B */
    public int mo453B() {
        return this.f428h.mo1416r();
    }

    /* renamed from: E */
    public void mo454E(boolean z) {
        mo455F(z ? 4 : 0, 4);
    }

    /* renamed from: F */
    public void mo455F(int i, int i2) {
        int p = this.f428h.mo1414p();
        if ((i2 & 4) != 0) {
            this.f434n = true;
        }
        this.f428h.mo1413o((i & i2) | ((i2 ^ -1) & p));
    }

    /* renamed from: G */
    public void mo456G(float f) {
        ViewCompat.m5587v0(this.f427g, f);
    }

    /* renamed from: I */
    public void mo457I(boolean z) {
        if (!z || this.f426f.mo1013w()) {
            this.f419C = z;
            this.f426f.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: J */
    public void mo458J(boolean z) {
        this.f428h.mo1410l(z);
    }

    /* renamed from: a */
    public void mo459a() {
        if (this.f444x) {
            this.f444x = false;
            m472M(true);
        }
    }

    /* renamed from: b */
    public void mo460b() {
        ViewPropertyAnimatorCompatSet hVar = this.f417A;
        if (hVar != null) {
            hVar.mo4238a();
            this.f417A = null;
        }
    }

    /* renamed from: c */
    public void mo461c(int i) {
        this.f441u = i;
    }

    /* renamed from: d */
    public void mo462d() {
    }

    /* renamed from: e */
    public void mo463e(boolean z) {
        this.f442v = z;
    }

    /* renamed from: f */
    public void mo464f() {
        if (!this.f444x) {
            this.f444x = true;
            m472M(true);
        }
    }

    /* renamed from: h */
    public boolean mo252h() {
        DecorToolbar e0Var = this.f428h;
        if (e0Var == null || !e0Var.mo1412n()) {
            return false;
        }
        this.f428h.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo253i(boolean z) {
        if (z != this.f438r) {
            this.f438r = z;
            int size = this.f439s.size();
            for (int i = 0; i < size; i++) {
                ((C0058b) this.f439s.get(i)).mo266a(z);
            }
        }
    }

    /* renamed from: j */
    public int mo254j() {
        return this.f428h.mo1414p();
    }

    /* renamed from: k */
    public Context mo255k() {
        if (this.f424d == null) {
            TypedValue typedValue = new TypedValue();
            this.f423c.getTheme().resolveAttribute(C0502a.f3284g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f424d = new ContextThemeWrapper(this.f423c, i);
            } else {
                this.f424d = this.f423c;
            }
        }
        return this.f424d;
    }

    /* renamed from: m */
    public void mo257m(Configuration configuration) {
        m469H(ActionBarPolicy.m4231b(this.f423c).mo4197g());
    }

    /* renamed from: o */
    public boolean mo259o(int i, KeyEvent keyEvent) {
        C0093d dVar = this.f435o;
        if (dVar == null) {
            return false;
        }
        Menu e = dVar.mo472e();
        if (e == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: r */
    public void mo262r(boolean z) {
        if (!this.f434n) {
            mo454E(z);
        }
    }

    /* renamed from: s */
    public void mo263s(boolean z) {
        this.f418B = z;
        if (!z) {
            ViewPropertyAnimatorCompatSet hVar = this.f417A;
            if (hVar != null) {
                hVar.mo4238a();
            }
        }
    }

    /* renamed from: t */
    public void mo264t(CharSequence charSequence) {
        this.f428h.setWindowTitle(charSequence);
    }

    /* renamed from: u */
    public ActionMode mo265u(C0527a aVar) {
        C0093d dVar = this.f435o;
        if (dVar != null) {
            dVar.mo470c();
        }
        this.f426f.setHideOnContentScrollEnabled(false);
        this.f429i.mo943k();
        C0093d dVar2 = new C0093d(this.f429i.getContext(), aVar);
        if (!dVar2.mo484t()) {
            return null;
        }
        this.f435o = dVar2;
        dVar2.mo476k();
        this.f429i.mo941h(dVar2);
        mo465v(true);
        this.f429i.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: v */
    public void mo465v(boolean z) {
        ViewPropertyAnimatorCompat a0Var;
        ViewPropertyAnimatorCompat a0Var2;
        if (z) {
            m471L();
        } else {
            m467C();
        }
        if (m470K()) {
            if (z) {
                a0Var = this.f428h.mo1417s(4, 100);
                a0Var2 = this.f429i.mo933f(0, 200);
            } else {
                a0Var2 = this.f428h.mo1417s(0, 200);
                a0Var = this.f429i.mo933f(8, 100);
            }
            ViewPropertyAnimatorCompatSet hVar = new ViewPropertyAnimatorCompatSet();
            hVar.mo4241d(a0Var, a0Var2);
            hVar.mo4245h();
        } else if (z) {
            this.f428h.mo1407i(4);
            this.f429i.setVisibility(0);
        } else {
            this.f428h.mo1407i(0);
            this.f429i.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo466x() {
        C0527a aVar = this.f437q;
        if (aVar != null) {
            aVar.mo392b(this.f436p);
            this.f436p = null;
            this.f437q = null;
        }
    }

    /* renamed from: y */
    public void mo467y(boolean z) {
        ViewPropertyAnimatorCompatSet hVar = this.f417A;
        if (hVar != null) {
            hVar.mo4238a();
        }
        if (this.f441u != 0 || (!this.f418B && !z)) {
            this.f420D.mo387b(null);
            return;
        }
        this.f427g.setAlpha(1.0f);
        this.f427g.setTransitioning(true);
        ViewPropertyAnimatorCompatSet hVar2 = new ViewPropertyAnimatorCompatSet();
        float f = (float) (-this.f427g.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f427g.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        ViewPropertyAnimatorCompat k = ViewCompat.m5550d(this.f427g).mo4967k(f);
        k.mo4965i(this.f422F);
        hVar2.mo4240c(k);
        if (this.f442v) {
            View view = this.f430j;
            if (view != null) {
                hVar2.mo4240c(ViewCompat.m5550d(view).mo4967k(f));
            }
        }
        hVar2.mo4243f(f415a);
        hVar2.mo4242e(250);
        hVar2.mo4244g(this.f420D);
        this.f417A = hVar2;
        hVar2.mo4245h();
    }

    /* renamed from: z */
    public void mo468z(boolean z) {
        ViewPropertyAnimatorCompatSet hVar = this.f417A;
        if (hVar != null) {
            hVar.mo4238a();
        }
        this.f427g.setVisibility(0);
        if (this.f441u != 0 || (!this.f418B && !z)) {
            this.f427g.setAlpha(1.0f);
            this.f427g.setTranslationY(0.0f);
            if (this.f442v) {
                View view = this.f430j;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            this.f421E.mo387b(null);
        } else {
            this.f427g.setTranslationY(0.0f);
            float f = (float) (-this.f427g.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f427g.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f427g.setTranslationY(f);
            ViewPropertyAnimatorCompatSet hVar2 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat k = ViewCompat.m5550d(this.f427g).mo4967k(0.0f);
            k.mo4965i(this.f422F);
            hVar2.mo4240c(k);
            if (this.f442v) {
                View view2 = this.f430j;
                if (view2 != null) {
                    view2.setTranslationY(f);
                    hVar2.mo4240c(ViewCompat.m5550d(this.f430j).mo4967k(0.0f));
                }
            }
            hVar2.mo4243f(f416b);
            hVar2.mo4242e(250);
            hVar2.mo4244g(this.f421E);
            this.f417A = hVar2;
            hVar2.mo4245h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f426f;
        if (actionBarOverlayLayout != null) {
            ViewCompat.m5567l0(actionBarOverlayLayout);
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        m468D(dialog.getWindow().getDecorView());
    }
}
