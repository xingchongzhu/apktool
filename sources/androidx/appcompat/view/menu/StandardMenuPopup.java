package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.widget.MenuPopupWindow;
import p010b.p011a.C0505d;
import p010b.p011a.C0508g;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.view.menu.q */
final class StandardMenuPopup extends MenuPopup implements OnDismissListener, OnItemClickListener, MenuPresenter, OnKeyListener {

    /* renamed from: b */
    private static final int f663b = C0508g.f3417m;

    /* renamed from: c */
    private final Context f664c;

    /* renamed from: d */
    private final MenuBuilder f665d;

    /* renamed from: e */
    private final MenuAdapter f666e;

    /* renamed from: f */
    private final boolean f667f;

    /* renamed from: g */
    private final int f668g;

    /* renamed from: h */
    private final int f669h;

    /* renamed from: i */
    private final int f670i;

    /* renamed from: j */
    final MenuPopupWindow f671j;

    /* renamed from: k */
    final OnGlobalLayoutListener f672k = new C0113a();

    /* renamed from: l */
    private final OnAttachStateChangeListener f673l = new C0114b();

    /* renamed from: m */
    private OnDismissListener f674m;

    /* renamed from: n */
    private View f675n;

    /* renamed from: o */
    View f676o;

    /* renamed from: p */
    private C0111a f677p;

    /* renamed from: q */
    ViewTreeObserver f678q;

    /* renamed from: r */
    private boolean f679r;

    /* renamed from: s */
    private boolean f680s;

    /* renamed from: t */
    private int f681t;

    /* renamed from: u */
    private int f682u = 0;

    /* renamed from: v */
    private boolean f683v;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* compiled from: StandardMenuPopup */
    class C0113a implements OnGlobalLayoutListener {
        C0113a() {
        }

        public void onGlobalLayout() {
            if (StandardMenuPopup.this.mo602c() && !StandardMenuPopup.this.f671j.mo1560B()) {
                View view = StandardMenuPopup.this.f676o;
                if (view == null || !view.isShown()) {
                    StandardMenuPopup.this.dismiss();
                } else {
                    StandardMenuPopup.this.f671j.mo604e();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* compiled from: StandardMenuPopup */
    class C0114b implements OnAttachStateChangeListener {
        C0114b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = StandardMenuPopup.this.f678q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    StandardMenuPopup.this.f678q = view.getViewTreeObserver();
                }
                StandardMenuPopup qVar = StandardMenuPopup.this;
                qVar.f678q.removeGlobalOnLayoutListener(qVar.f672k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public StandardMenuPopup(Context context, MenuBuilder gVar, View view, int i, int i2, boolean z) {
        this.f664c = context;
        this.f665d = gVar;
        this.f667f = z;
        this.f666e = new MenuAdapter(gVar, LayoutInflater.from(context), z, f663b);
        this.f669h = i;
        this.f670i = i2;
        Resources resources = context.getResources();
        this.f668g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0505d.f3314d));
        this.f675n = view;
        this.f671j = new MenuPopupWindow(context, null, i, i2);
        gVar.mo679c(this, context);
    }

    /* renamed from: z */
    private boolean m760z() {
        if (mo602c()) {
            return true;
        }
        if (!this.f679r) {
            View view = this.f675n;
            if (view != null) {
                this.f676o = view;
                this.f671j.mo1568K(this);
                this.f671j.mo1569L(this);
                this.f671j.mo1567J(true);
                View view2 = this.f676o;
                boolean z = this.f678q == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f678q = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f672k);
                }
                view2.addOnAttachStateChangeListener(this.f673l);
                this.f671j.mo1561D(view2);
                this.f671j.mo1564G(this.f682u);
                if (!this.f680s) {
                    this.f681t = MenuPopup.m713o(this.f666e, null, this.f664c, this.f668g);
                    this.f680s = true;
                }
                this.f671j.mo1563F(this.f681t);
                this.f671j.mo1566I(2);
                this.f671j.mo1565H(mo852n());
                this.f671j.mo604e();
                ListView h = this.f671j.mo606h();
                h.setOnKeyListener(this);
                if (this.f683v && this.f665d.mo715x() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f664c).inflate(C0508g.f3416l, h, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f665d.mo715x());
                    }
                    frameLayout.setEnabled(false);
                    h.addHeaderView(frameLayout, null, false);
                }
                this.f671j.mo1580p(this.f666e);
                this.f671j.mo604e();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo581a(MenuBuilder gVar, boolean z) {
        if (gVar == this.f665d) {
            dismiss();
            C0111a aVar = this.f677p;
            if (aVar != null) {
                aVar.mo389a(gVar, z);
            }
        }
    }

    /* renamed from: c */
    public boolean mo602c() {
        return !this.f679r && this.f671j.mo602c();
    }

    /* renamed from: d */
    public boolean mo584d(SubMenuBuilder rVar) {
        if (rVar.hasVisibleItems()) {
            MenuPopupHelper lVar = new MenuPopupHelper(this.f664c, rVar, this.f676o, this.f667f, this.f669h, this.f670i);
            lVar.mo863j(this.f677p);
            lVar.mo860g(MenuPopup.m714x(rVar));
            lVar.mo862i(this.f674m);
            this.f674m = null;
            this.f665d.mo686e(false);
            int d = this.f671j.mo1575d();
            int n = this.f671j.mo1579n();
            if ((Gravity.getAbsoluteGravity(this.f682u, ViewCompat.m5514C(this.f675n)) & 7) == 5) {
                d += this.f675n.getWidth();
            }
            if (lVar.mo866n(d, n)) {
                C0111a aVar = this.f677p;
                if (aVar != null) {
                    aVar.mo390b(rVar);
                }
                return true;
            }
        }
        return false;
    }

    public void dismiss() {
        if (mo602c()) {
            this.f671j.dismiss();
        }
    }

    /* renamed from: e */
    public void mo604e() {
        if (!m760z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public void mo586f(boolean z) {
        this.f680s = false;
        MenuAdapter fVar = this.f666e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public boolean mo605g() {
        return false;
    }

    /* renamed from: h */
    public ListView mo606h() {
        return this.f671j.mo606h();
    }

    /* renamed from: k */
    public void mo590k(C0111a aVar) {
        this.f677p = aVar;
    }

    /* renamed from: l */
    public void mo607l(MenuBuilder gVar) {
    }

    public void onDismiss() {
        this.f679r = true;
        this.f665d.close();
        ViewTreeObserver viewTreeObserver = this.f678q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f678q = this.f676o.getViewTreeObserver();
            }
            this.f678q.removeGlobalOnLayoutListener(this.f672k);
            this.f678q = null;
        }
        this.f676o.removeOnAttachStateChangeListener(this.f673l);
        OnDismissListener onDismissListener = this.f674m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f675n = view;
    }

    /* renamed from: r */
    public void mo612r(boolean z) {
        this.f666e.mo638d(z);
    }

    /* renamed from: s */
    public void mo613s(int i) {
        this.f682u = i;
    }

    /* renamed from: t */
    public void mo614t(int i) {
        this.f671j.mo1578l(i);
    }

    /* renamed from: u */
    public void mo615u(OnDismissListener onDismissListener) {
        this.f674m = onDismissListener;
    }

    /* renamed from: v */
    public void mo616v(boolean z) {
        this.f683v = z;
    }

    /* renamed from: w */
    public void mo617w(int i) {
        this.f671j.mo1577j(i);
    }
}
