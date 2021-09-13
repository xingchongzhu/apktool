package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewConfigurationCompat;

/* renamed from: androidx.appcompat.widget.a1 */
class TooltipCompatHandler implements OnLongClickListener, OnHoverListener, OnAttachStateChangeListener {

    /* renamed from: a */
    private static TooltipCompatHandler f928a;

    /* renamed from: b */
    private static TooltipCompatHandler f929b;

    /* renamed from: c */
    private final View f930c;

    /* renamed from: d */
    private final CharSequence f931d;

    /* renamed from: e */
    private final int f932e;

    /* renamed from: f */
    private final Runnable f933f = new C0155a();

    /* renamed from: g */
    private final Runnable f934g = new C0156b();

    /* renamed from: h */
    private int f935h;

    /* renamed from: i */
    private int f936i;

    /* renamed from: j */
    private TooltipPopup f937j;

    /* renamed from: k */
    private boolean f938k;

    /* renamed from: androidx.appcompat.widget.a1$a */
    /* compiled from: TooltipCompatHandler */
    class C0155a implements Runnable {
        C0155a() {
        }

        public void run() {
            TooltipCompatHandler.this.mo1330g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.a1$b */
    /* compiled from: TooltipCompatHandler */
    class C0156b implements Runnable {
        C0156b() {
        }

        public void run() {
            TooltipCompatHandler.this.mo1329c();
        }
    }

    private TooltipCompatHandler(View view, CharSequence charSequence) {
        this.f930c = view;
        this.f931d = charSequence;
        this.f932e = ViewConfigurationCompat.m5647c(ViewConfiguration.get(view.getContext()));
        m983b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m982a() {
        this.f930c.removeCallbacks(this.f933f);
    }

    /* renamed from: b */
    private void m983b() {
        this.f935h = Integer.MAX_VALUE;
        this.f936i = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m984d() {
        this.f930c.postDelayed(this.f933f, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m985e(TooltipCompatHandler a1Var) {
        TooltipCompatHandler a1Var2 = f928a;
        if (a1Var2 != null) {
            a1Var2.m982a();
        }
        f928a = a1Var;
        if (a1Var != null) {
            a1Var.m984d();
        }
    }

    /* renamed from: f */
    public static void m986f(View view, CharSequence charSequence) {
        TooltipCompatHandler a1Var = f928a;
        if (a1Var != null && a1Var.f930c == view) {
            m985e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            TooltipCompatHandler a1Var2 = f929b;
            if (a1Var2 != null && a1Var2.f930c == view) {
                a1Var2.mo1329c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new TooltipCompatHandler(view, charSequence);
    }

    /* renamed from: h */
    private boolean m987h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f935h) <= this.f932e && Math.abs(y - this.f936i) <= this.f932e) {
            return false;
        }
        this.f935h = x;
        this.f936i = y;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1329c() {
        if (f929b == this) {
            f929b = null;
            TooltipPopup b1Var = this.f937j;
            if (b1Var != null) {
                b1Var.mo1358c();
                this.f937j = null;
                m983b();
                this.f930c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f928a == this) {
            m985e(null);
        }
        this.f930c.removeCallbacks(this.f934g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1330g(boolean z) {
        long j;
        int i;
        long j2;
        if (ViewCompat.m5536S(this.f930c)) {
            m985e(null);
            TooltipCompatHandler a1Var = f929b;
            if (a1Var != null) {
                a1Var.mo1329c();
            }
            f929b = this;
            this.f938k = z;
            TooltipPopup b1Var = new TooltipPopup(this.f930c.getContext());
            this.f937j = b1Var;
            b1Var.mo1360e(this.f930c, this.f935h, this.f936i, this.f938k, this.f931d);
            this.f930c.addOnAttachStateChangeListener(this);
            if (this.f938k) {
                j = 2500;
            } else {
                if ((ViewCompat.m5530M(this.f930c) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f930c.removeCallbacks(this.f934g);
            this.f930c.postDelayed(this.f934g, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f937j != null && this.f938k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f930c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m983b();
                mo1329c();
            }
        } else if (this.f930c.isEnabled() && this.f937j == null && m987h(motionEvent)) {
            m985e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f935h = view.getWidth() / 2;
        this.f936i = view.getHeight() / 2;
        mo1330g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1329c();
    }
}
