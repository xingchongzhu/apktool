package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;
import java.util.List;
import p010b.p011a.C0505d;
import p010b.p011a.C0508g;
import p010b.p034g.p043k.GravityCompat;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.view.menu.d */
final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, OnKeyListener, OnDismissListener {

    /* renamed from: b */
    private static final int f520b = C0508g.f3409e;

    /* renamed from: A */
    private OnDismissListener f521A;

    /* renamed from: B */
    boolean f522B;

    /* renamed from: c */
    private final Context f523c;

    /* renamed from: d */
    private final int f524d;

    /* renamed from: e */
    private final int f525e;

    /* renamed from: f */
    private final int f526f;

    /* renamed from: g */
    private final boolean f527g;

    /* renamed from: h */
    final Handler f528h;

    /* renamed from: i */
    private final List<MenuBuilder> f529i = new ArrayList();

    /* renamed from: j */
    final List<C0100d> f530j = new ArrayList();

    /* renamed from: k */
    final OnGlobalLayoutListener f531k = new C0096a();

    /* renamed from: l */
    private final OnAttachStateChangeListener f532l = new C0097b();

    /* renamed from: m */
    private final MenuItemHoverListener f533m = new C0098c();

    /* renamed from: n */
    private int f534n = 0;

    /* renamed from: o */
    private int f535o = 0;

    /* renamed from: p */
    private View f536p;

    /* renamed from: q */
    View f537q;

    /* renamed from: r */
    private int f538r;

    /* renamed from: s */
    private boolean f539s;

    /* renamed from: t */
    private boolean f540t;

    /* renamed from: u */
    private int f541u;

    /* renamed from: v */
    private int f542v;

    /* renamed from: w */
    private boolean f543w;

    /* renamed from: x */
    private boolean f544x;

    /* renamed from: y */
    private C0111a f545y;

    /* renamed from: z */
    ViewTreeObserver f546z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* compiled from: CascadingMenuPopup */
    class C0096a implements OnGlobalLayoutListener {
        C0096a() {
        }

        public void onGlobalLayout() {
            if (CascadingMenuPopup.this.mo602c() && CascadingMenuPopup.this.f530j.size() > 0 && !((C0100d) CascadingMenuPopup.this.f530j.get(0)).f554a.mo1560B()) {
                View view = CascadingMenuPopup.this.f537q;
                if (view == null || !view.isShown()) {
                    CascadingMenuPopup.this.dismiss();
                    return;
                }
                for (C0100d dVar : CascadingMenuPopup.this.f530j) {
                    dVar.f554a.mo604e();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* compiled from: CascadingMenuPopup */
    class C0097b implements OnAttachStateChangeListener {
        C0097b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f546z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f546z = view.getViewTreeObserver();
                }
                CascadingMenuPopup dVar = CascadingMenuPopup.this;
                dVar.f546z.removeGlobalOnLayoutListener(dVar.f531k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* compiled from: CascadingMenuPopup */
    class C0098c implements MenuItemHoverListener {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* compiled from: CascadingMenuPopup */
        class C0099a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0100d f550a;

            /* renamed from: b */
            final /* synthetic */ MenuItem f551b;

            /* renamed from: c */
            final /* synthetic */ MenuBuilder f552c;

            C0099a(C0100d dVar, MenuItem menuItem, MenuBuilder gVar) {
                this.f550a = dVar;
                this.f551b = menuItem;
                this.f552c = gVar;
            }

            public void run() {
                C0100d dVar = this.f550a;
                if (dVar != null) {
                    CascadingMenuPopup.this.f522B = true;
                    dVar.f555b.mo686e(false);
                    CascadingMenuPopup.this.f522B = false;
                }
                if (this.f551b.isEnabled() && this.f551b.hasSubMenu()) {
                    this.f552c.mo654L(this.f551b, 4);
                }
            }
        }

        C0098c() {
        }

        /* renamed from: a */
        public void mo621a(MenuBuilder gVar, MenuItem menuItem) {
            C0100d dVar = null;
            CascadingMenuPopup.this.f528h.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f530j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == ((C0100d) CascadingMenuPopup.this.f530j.get(i)).f555b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < CascadingMenuPopup.this.f530j.size()) {
                    dVar = (C0100d) CascadingMenuPopup.this.f530j.get(i2);
                }
                CascadingMenuPopup.this.f528h.postAtTime(new C0099a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: f */
        public void mo622f(MenuBuilder gVar, MenuItem menuItem) {
            CascadingMenuPopup.this.f528h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* compiled from: CascadingMenuPopup */
    private static class C0100d {

        /* renamed from: a */
        public final MenuPopupWindow f554a;

        /* renamed from: b */
        public final MenuBuilder f555b;

        /* renamed from: c */
        public final int f556c;

        public C0100d(MenuPopupWindow m0Var, MenuBuilder gVar, int i) {
            this.f554a = m0Var;
            this.f555b = gVar;
            this.f556c = i;
        }

        /* renamed from: a */
        public ListView mo624a() {
            return this.f554a.mo606h();
        }
    }

    public CascadingMenuPopup(Context context, View view, int i, int i2, boolean z) {
        this.f523c = context;
        this.f536p = view;
        this.f525e = i;
        this.f526f = i2;
        this.f527g = z;
        this.f543w = false;
        this.f538r = m570D();
        Resources resources = context.getResources();
        this.f524d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0505d.f3314d));
        this.f528h = new Handler();
    }

    /* renamed from: A */
    private int m567A(MenuBuilder gVar) {
        int size = this.f530j.size();
        for (int i = 0; i < size; i++) {
            if (gVar == ((C0100d) this.f530j.get(i)).f555b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B */
    private MenuItem m568B(MenuBuilder gVar, MenuBuilder gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: C */
    private View m569C(C0100d dVar, MenuBuilder gVar) {
        int i;
        MenuAdapter fVar;
        MenuItem B = m568B(dVar.f555b, gVar);
        if (B == null) {
            return null;
        }
        ListView a = dVar.mo624a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (MenuAdapter) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (B == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a.getChildCount()) {
            return null;
        }
        return a.getChildAt(firstVisiblePosition);
    }

    /* renamed from: D */
    private int m570D() {
        return ViewCompat.m5514C(this.f536p) == 1 ? 0 : 1;
    }

    /* renamed from: E */
    private int m571E(int i) {
        List<C0100d> list = this.f530j;
        ListView a = ((C0100d) list.get(list.size() - 1)).mo624a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f537q.getWindowVisibleDisplayFrame(rect);
        if (this.f538r == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: F */
    private void m572F(MenuBuilder gVar) {
        View view;
        C0100d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f523c);
        MenuAdapter fVar = new MenuAdapter(gVar, from, this.f527g, f520b);
        if (!mo602c() && this.f543w) {
            fVar.mo638d(true);
        } else if (mo602c()) {
            fVar.mo638d(MenuPopup.m714x(gVar));
        }
        int o = MenuPopup.m713o(fVar, null, this.f523c, this.f524d);
        MenuPopupWindow z = m573z();
        z.mo1580p(fVar);
        z.mo1563F(o);
        z.mo1564G(this.f535o);
        if (this.f530j.size() > 0) {
            List<C0100d> list = this.f530j;
            dVar = (C0100d) list.get(list.size() - 1);
            view = m569C(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z.mo1614U(false);
            z.mo1611R(null);
            int E = m571E(o);
            boolean z2 = E == 1;
            this.f538r = E;
            if (VERSION.SDK_INT >= 26) {
                z.mo1561D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f536p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f535o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f536p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f535o & 5) != 5) {
                if (z2) {
                    o = view.getWidth();
                }
                i3 = i - o;
                z.mo1578l(i3);
                z.mo1570M(true);
                z.mo1577j(i2);
            } else if (!z2) {
                o = view.getWidth();
                i3 = i - o;
                z.mo1578l(i3);
                z.mo1570M(true);
                z.mo1577j(i2);
            }
            i3 = i + o;
            z.mo1578l(i3);
            z.mo1570M(true);
            z.mo1577j(i2);
        } else {
            if (this.f539s) {
                z.mo1578l(this.f541u);
            }
            if (this.f540t) {
                z.mo1577j(this.f542v);
            }
            z.mo1565H(mo852n());
        }
        this.f530j.add(new C0100d(z, gVar, this.f538r));
        z.mo604e();
        ListView h = z.mo606h();
        h.setOnKeyListener(this);
        if (dVar == null && this.f544x && gVar.mo715x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0508g.f3416l, h, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(gVar.mo715x());
            h.addHeaderView(frameLayout, null, false);
            z.mo604e();
        }
    }

    /* renamed from: z */
    private MenuPopupWindow m573z() {
        MenuPopupWindow m0Var = new MenuPopupWindow(this.f523c, null, this.f525e, this.f526f);
        m0Var.mo1613T(this.f533m);
        m0Var.mo1569L(this);
        m0Var.mo1568K(this);
        m0Var.mo1561D(this.f536p);
        m0Var.mo1564G(this.f535o);
        m0Var.mo1567J(true);
        m0Var.mo1566I(2);
        return m0Var;
    }

    /* renamed from: a */
    public void mo581a(MenuBuilder gVar, boolean z) {
        int A = m567A(gVar);
        if (A >= 0) {
            int i = A + 1;
            if (i < this.f530j.size()) {
                ((C0100d) this.f530j.get(i)).f555b.mo686e(false);
            }
            C0100d dVar = (C0100d) this.f530j.remove(A);
            dVar.f555b.mo656O(this);
            if (this.f522B) {
                dVar.f554a.mo1612S(null);
                dVar.f554a.mo1562E(0);
            }
            dVar.f554a.dismiss();
            int size = this.f530j.size();
            if (size > 0) {
                this.f538r = ((C0100d) this.f530j.get(size - 1)).f556c;
            } else {
                this.f538r = m570D();
            }
            if (size == 0) {
                dismiss();
                C0111a aVar = this.f545y;
                if (aVar != null) {
                    aVar.mo389a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f546z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f546z.removeGlobalOnLayoutListener(this.f531k);
                    }
                    this.f546z = null;
                }
                this.f537q.removeOnAttachStateChangeListener(this.f532l);
                this.f521A.onDismiss();
            } else if (z) {
                ((C0100d) this.f530j.get(0)).f555b.mo686e(false);
            }
        }
    }

    /* renamed from: c */
    public boolean mo602c() {
        return this.f530j.size() > 0 && ((C0100d) this.f530j.get(0)).f554a.mo602c();
    }

    /* renamed from: d */
    public boolean mo584d(SubMenuBuilder rVar) {
        for (C0100d dVar : this.f530j) {
            if (rVar == dVar.f555b) {
                dVar.mo624a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo607l(rVar);
        C0111a aVar = this.f545y;
        if (aVar != null) {
            aVar.mo390b(rVar);
        }
        return true;
    }

    public void dismiss() {
        int size = this.f530j.size();
        if (size > 0) {
            C0100d[] dVarArr = (C0100d[]) this.f530j.toArray(new C0100d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0100d dVar = dVarArr[i];
                if (dVar.f554a.mo602c()) {
                    dVar.f554a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public void mo604e() {
        if (!mo602c()) {
            for (MenuBuilder F : this.f529i) {
                m572F(F);
            }
            this.f529i.clear();
            View view = this.f536p;
            this.f537q = view;
            if (view != null) {
                boolean z = this.f546z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f546z = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f531k);
                }
                this.f537q.addOnAttachStateChangeListener(this.f532l);
            }
        }
    }

    /* renamed from: f */
    public void mo586f(boolean z) {
        for (C0100d a : this.f530j) {
            MenuPopup.m715y(a.mo624a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public boolean mo605g() {
        return false;
    }

    /* renamed from: h */
    public ListView mo606h() {
        if (this.f530j.isEmpty()) {
            return null;
        }
        List<C0100d> list = this.f530j;
        return ((C0100d) list.get(list.size() - 1)).mo624a();
    }

    /* renamed from: k */
    public void mo590k(C0111a aVar) {
        this.f545y = aVar;
    }

    /* renamed from: l */
    public void mo607l(MenuBuilder gVar) {
        gVar.mo679c(this, this.f523c);
        if (mo602c()) {
            m572F(gVar);
        } else {
            this.f529i.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo608m() {
        return false;
    }

    public void onDismiss() {
        C0100d dVar;
        int size = this.f530j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C0100d) this.f530j.get(i);
            if (!dVar.f554a.mo602c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f555b.mo686e(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo611p(View view) {
        if (this.f536p != view) {
            this.f536p = view;
            this.f535o = GravityCompat.m5245b(this.f534n, ViewCompat.m5514C(view));
        }
    }

    /* renamed from: r */
    public void mo612r(boolean z) {
        this.f543w = z;
    }

    /* renamed from: s */
    public void mo613s(int i) {
        if (this.f534n != i) {
            this.f534n = i;
            this.f535o = GravityCompat.m5245b(i, ViewCompat.m5514C(this.f536p));
        }
    }

    /* renamed from: t */
    public void mo614t(int i) {
        this.f539s = true;
        this.f541u = i;
    }

    /* renamed from: u */
    public void mo615u(OnDismissListener onDismissListener) {
        this.f521A = onDismissListener;
    }

    /* renamed from: v */
    public void mo616v(boolean z) {
        this.f544x = z;
    }

    /* renamed from: w */
    public void mo617w(int i) {
        this.f540t = true;
        this.f542v = i;
    }
}
