package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import com.p259uc.crashsdk.export.LogType;
import p010b.p011a.C0502a;
import p010b.p011a.C0507f;
import p010b.p034g.p035d.Insets;
import p010b.p034g.p043k.NestedScrollingParent;
import p010b.p034g.p043k.NestedScrollingParent2;
import p010b.p034g.p043k.NestedScrollingParent3;
import p010b.p034g.p043k.NestedScrollingParentHelper;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.WindowInsetsCompat;
import p010b.p034g.p043k.WindowInsetsCompat.C0621b;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {

    /* renamed from: a */
    static final int[] f713a = {C0502a.f3279b, 16842841};

    /* renamed from: A */
    private OverScroller f714A;

    /* renamed from: B */
    ViewPropertyAnimator f715B;

    /* renamed from: C */
    final AnimatorListenerAdapter f716C;

    /* renamed from: D */
    private final Runnable f717D;

    /* renamed from: G */
    private final Runnable f718G;

    /* renamed from: H */
    private final NestedScrollingParentHelper f719H;

    /* renamed from: b */
    private int f720b;

    /* renamed from: c */
    private int f721c = 0;

    /* renamed from: d */
    private ContentFrameLayout f722d;

    /* renamed from: e */
    ActionBarContainer f723e;

    /* renamed from: f */
    private DecorToolbar f724f;

    /* renamed from: g */
    private Drawable f725g;

    /* renamed from: h */
    private boolean f726h;

    /* renamed from: i */
    private boolean f727i;

    /* renamed from: j */
    private boolean f728j;

    /* renamed from: k */
    private boolean f729k;

    /* renamed from: l */
    boolean f730l;

    /* renamed from: m */
    private int f731m;

    /* renamed from: n */
    private int f732n;

    /* renamed from: o */
    private final Rect f733o = new Rect();

    /* renamed from: p */
    private final Rect f734p = new Rect();

    /* renamed from: q */
    private final Rect f735q = new Rect();

    /* renamed from: r */
    private final Rect f736r = new Rect();

    /* renamed from: s */
    private final Rect f737s = new Rect();

    /* renamed from: t */
    private final Rect f738t = new Rect();

    /* renamed from: u */
    private final Rect f739u = new Rect();

    /* renamed from: v */
    private WindowInsetsCompat f740v;

    /* renamed from: w */
    private WindowInsetsCompat f741w;

    /* renamed from: x */
    private WindowInsetsCompat f742x;

    /* renamed from: y */
    private WindowInsetsCompat f743y;

    /* renamed from: z */
    private C0119d f744z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0116a extends AnimatorListenerAdapter {
        C0116a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f715B = null;
            actionBarOverlayLayout.f730l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f715B = null;
            actionBarOverlayLayout.f730l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0117b implements Runnable {
        C0117b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1012u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f715B = actionBarOverlayLayout.f723e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f716C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0118c implements Runnable {
        C0118c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1012u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f715B = actionBarOverlayLayout.f723e.animate().translationY((float) (-ActionBarOverlayLayout.this.f723e.getHeight())).setListener(ActionBarOverlayLayout.this.f716C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0119d {
        /* renamed from: a */
        void mo459a();

        /* renamed from: b */
        void mo460b();

        /* renamed from: c */
        void mo461c(int i);

        /* renamed from: d */
        void mo462d();

        /* renamed from: e */
        void mo463e(boolean z);

        /* renamed from: f */
        void mo464f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0120e extends MarginLayoutParams {
        public C0120e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0120e(int i, int i2) {
            super(i, i2);
        }

        public C0120e(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WindowInsetsCompat e0Var = WindowInsetsCompat.f4622a;
        this.f740v = e0Var;
        this.f741w = e0Var;
        this.f742x = e0Var;
        this.f743y = e0Var;
        this.f716C = new C0116a();
        this.f717D = new C0117b();
        this.f718G = new C0118c();
        m801v(context);
        this.f719H = new NestedScrollingParentHelper(this);
    }

    /* renamed from: A */
    private void m796A() {
        mo1012u();
        this.f717D.run();
    }

    /* renamed from: B */
    private boolean m797B(float f) {
        this.f714A.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f714A.getFinalY() > this.f723e.getHeight();
    }

    /* renamed from: p */
    private void m798p() {
        mo1012u();
        this.f718G.run();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m799q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0120e) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = 1
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = 1
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = 1
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            goto L_0x0036
        L_0x0035:
            r0 = r5
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m799q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: t */
    private DecorToolbar m800t(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: v */
    private void m801v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f713a);
        boolean z = false;
        this.f720b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f725g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f726h = z;
        this.f714A = new OverScroller(context);
    }

    /* renamed from: x */
    private void m802x() {
        mo1012u();
        postDelayed(this.f718G, 600);
    }

    /* renamed from: y */
    private void m803y() {
        mo1012u();
        postDelayed(this.f717D, 600);
    }

    /* renamed from: a */
    public void mo959a(Menu menu, C0111a aVar) {
        mo1014z();
        this.f724f.mo1397a(menu, aVar);
    }

    /* renamed from: b */
    public boolean mo960b() {
        mo1014z();
        return this.f724f.mo1398b();
    }

    /* renamed from: c */
    public void mo961c() {
        mo1014z();
        this.f724f.mo1399c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0120e;
    }

    /* renamed from: d */
    public boolean mo963d() {
        mo1014z();
        return this.f724f.mo1401d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f725g != null && !this.f726h) {
            int bottom = this.f723e.getVisibility() == 0 ? (int) (((float) this.f723e.getBottom()) + this.f723e.getTranslationY() + 0.5f) : 0;
            this.f725g.setBounds(0, bottom, getWidth(), this.f725g.getIntrinsicHeight() + bottom);
            this.f725g.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo965e() {
        mo1014z();
        return this.f724f.mo1402e();
    }

    /* renamed from: f */
    public boolean mo966f() {
        mo1014z();
        return this.f724f.mo1403f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo1014z();
        boolean q = m799q(this.f723e, rect, true, true, false, true);
        this.f736r.set(rect);
        ViewUtils.m1083a(this, this.f736r, this.f733o);
        if (!this.f737s.equals(this.f736r)) {
            this.f737s.set(this.f736r);
            q = true;
        }
        if (!this.f734p.equals(this.f733o)) {
            this.f734p.set(this.f733o);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo968g() {
        mo1014z();
        return this.f724f.mo1404g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f723e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f719H.mo5142a();
    }

    public CharSequence getTitle() {
        mo1014z();
        return this.f724f.getTitle();
    }

    /* renamed from: h */
    public void mo975h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: i */
    public void mo976i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: j */
    public void mo977j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: k */
    public void mo978k(int i) {
        mo1014z();
        if (i == 2) {
            this.f724f.mo1422t();
        } else if (i == 5) {
            this.f724f.mo1423u();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: l */
    public void mo979l() {
        mo1014z();
        this.f724f.mo1406h();
    }

    /* renamed from: m */
    public void mo980m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo981n(view, i, i2, i3, i4, i5);
    }

    /* renamed from: n */
    public void mo981n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: o */
    public boolean mo982o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1014z();
        WindowInsetsCompat t = WindowInsetsCompat.m5248t(windowInsets, this);
        boolean q = m799q(this.f723e, new Rect(t.mo4992g(), t.mo4995i(), t.mo4993h(), t.mo4991f()), true, true, false, true);
        ViewCompat.m5556g(this, t, this.f733o);
        Rect rect = this.f733o;
        WindowInsetsCompat j = t.mo4996j(rect.left, rect.top, rect.right, rect.bottom);
        this.f740v = j;
        boolean z = true;
        if (!this.f741w.equals(j)) {
            this.f741w = this.f740v;
            q = true;
        }
        if (!this.f734p.equals(this.f733o)) {
            this.f734p.set(this.f733o);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return t.mo4985a().mo4987c().mo4986b().mo5003r();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m801v(getContext());
        ViewCompat.m5567l0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1012u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0120e eVar = (C0120e) childAt.getLayoutParams();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo1014z();
        measureChildWithMargins(this.f723e, i, 0, i2, 0);
        C0120e eVar = (C0120e) this.f723e.getLayoutParams();
        int max = Math.max(0, this.f723e.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f723e.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f723e.getMeasuredState());
        boolean z = (ViewCompat.m5530M(this) & LogType.UNEXP) != 0;
        if (z) {
            i3 = this.f720b;
            if (this.f728j && this.f723e.getTabContainer() != null) {
                i3 += this.f720b;
            }
        } else {
            i3 = this.f723e.getVisibility() != 8 ? this.f723e.getMeasuredHeight() : 0;
        }
        this.f735q.set(this.f733o);
        int i4 = VERSION.SDK_INT;
        if (i4 >= 21) {
            this.f742x = this.f740v;
        } else {
            this.f738t.set(this.f736r);
        }
        if (!this.f727i && !z) {
            Rect rect = this.f735q;
            rect.top += i3;
            rect.bottom += 0;
            if (i4 >= 21) {
                this.f742x = this.f742x.mo4996j(0, i3, 0, 0);
            }
        } else if (i4 >= 21) {
            this.f742x = new C0621b(this.f742x).mo5006c(Insets.m4972b(this.f742x.mo4992g(), this.f742x.mo4995i() + i3, this.f742x.mo4993h(), this.f742x.mo4991f() + 0)).mo5004a();
        } else {
            Rect rect2 = this.f738t;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        m799q(this.f722d, this.f735q, true, true, true, true);
        if (i4 >= 21 && !this.f743y.equals(this.f742x)) {
            WindowInsetsCompat e0Var = this.f742x;
            this.f743y = e0Var;
            ViewCompat.m5558h(this.f722d, e0Var);
        } else if (i4 < 21 && !this.f739u.equals(this.f738t)) {
            this.f739u.set(this.f738t);
            this.f722d.mo1058a(this.f738t);
        }
        measureChildWithMargins(this.f722d, i, 0, i2, 0);
        C0120e eVar2 = (C0120e) this.f722d.getLayoutParams();
        int max3 = Math.max(max, this.f722d.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f722d.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f722d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f729k || !z) {
            return false;
        }
        if (m797B(f2)) {
            m798p();
        } else {
            m796A();
        }
        this.f730l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f731m + i2;
        this.f731m = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f719H.mo5143b(view, view2, i);
        this.f731m = getActionBarHideOffset();
        mo1012u();
        C0119d dVar = this.f744z;
        if (dVar != null) {
            dVar.mo460b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f723e.getVisibility() != 0) {
            return false;
        }
        return this.f729k;
    }

    public void onStopNestedScroll(View view) {
        if (this.f729k && !this.f730l) {
            if (this.f731m <= this.f723e.getHeight()) {
                m803y();
            } else {
                m802x();
            }
        }
        C0119d dVar = this.f744z;
        if (dVar != null) {
            dVar.mo462d();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1014z();
        int i2 = this.f732n ^ i;
        this.f732n = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & LogType.UNEXP) != 0) {
            z = true;
        }
        C0119d dVar = this.f744z;
        if (dVar != null) {
            dVar.mo463e(!z);
            if (z2 || !z) {
                this.f744z.mo459a();
            } else {
                this.f744z.mo464f();
            }
        }
        if ((i2 & LogType.UNEXP) != 0 && this.f744z != null) {
            ViewCompat.m5567l0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f721c = i;
        C0119d dVar = this.f744z;
        if (dVar != null) {
            dVar.mo461c(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0120e generateDefaultLayoutParams() {
        return new C0120e(-1, -1);
    }

    /* renamed from: s */
    public C0120e generateLayoutParams(AttributeSet attributeSet) {
        return new C0120e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        mo1012u();
        this.f723e.setTranslationY((float) (-Math.max(0, Math.min(i, this.f723e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0119d dVar) {
        this.f744z = dVar;
        if (getWindowToken() != null) {
            this.f744z.mo461c(this.f721c);
            int i = this.f732n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.m5567l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f728j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f729k) {
            this.f729k = z;
            if (!z) {
                mo1012u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1014z();
        this.f724f.setIcon(i);
    }

    public void setLogo(int i) {
        mo1014z();
        this.f724f.mo1415q(i);
    }

    public void setOverlayMode(boolean z) {
        this.f727i = z;
        this.f726h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        mo1014z();
        this.f724f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1014z();
        this.f724f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo1012u() {
        removeCallbacks(this.f717D);
        removeCallbacks(this.f718G);
        ViewPropertyAnimator viewPropertyAnimator = this.f715B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean mo1013w() {
        return this.f727i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo1014z() {
        if (this.f722d == null) {
            this.f722d = (ContentFrameLayout) findViewById(C0507f.f3380b);
            this.f723e = (ActionBarContainer) findViewById(C0507f.f3381c);
            this.f724f = m800t(findViewById(C0507f.f3379a));
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0120e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo1014z();
        this.f724f.setIcon(drawable);
    }
}
