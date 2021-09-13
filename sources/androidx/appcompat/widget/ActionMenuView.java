package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.C0102a;
import androidx.appcompat.view.menu.MenuBuilder.C0103b;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat.C0173a;

public class ActionMenuView extends LinearLayoutCompat implements C0103b, MenuView {

    /* renamed from: A */
    C0125e f748A;

    /* renamed from: p */
    private MenuBuilder f749p;

    /* renamed from: q */
    private Context f750q;

    /* renamed from: r */
    private int f751r;

    /* renamed from: s */
    private boolean f752s;

    /* renamed from: t */
    private ActionMenuPresenter f753t;

    /* renamed from: u */
    private C0111a f754u;

    /* renamed from: v */
    C0102a f755v;

    /* renamed from: w */
    private boolean f756w;

    /* renamed from: x */
    private int f757x;

    /* renamed from: y */
    private int f758y;

    /* renamed from: z */
    private int f759z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0121a {
        /* renamed from: a */
        boolean mo485a();

        /* renamed from: b */
        boolean mo486b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0122b implements C0111a {
        C0122b() {
        }

        /* renamed from: a */
        public void mo389a(MenuBuilder gVar, boolean z) {
        }

        /* renamed from: b */
        public boolean mo390b(MenuBuilder gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0123c extends C0173a {
        @ExportedProperty

        /* renamed from: a */
        public boolean f760a;
        @ExportedProperty

        /* renamed from: b */
        public int f761b;
        @ExportedProperty

        /* renamed from: c */
        public int f762c;
        @ExportedProperty

        /* renamed from: d */
        public boolean f763d;
        @ExportedProperty

        /* renamed from: e */
        public boolean f764e;

        /* renamed from: f */
        boolean f765f;

        public C0123c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0123c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0123c(C0123c cVar) {
            super(cVar);
            this.f760a = cVar.f760a;
        }

        public C0123c(int i, int i2) {
            super(i, i2);
            this.f760a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0124d implements C0102a {
        C0124d() {
        }

        /* renamed from: a */
        public boolean mo362a(MenuBuilder gVar, MenuItem menuItem) {
            C0125e eVar = ActionMenuView.this.f748A;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: b */
        public void mo364b(MenuBuilder gVar) {
            C0102a aVar = ActionMenuView.this.f755v;
            if (aVar != null) {
                aVar.mo364b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0125e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: L */
    static int m830L(View view, int i, int i2, int i3, int i4) {
        C0123c cVar = (C0123c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo489f();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f760a || !z2) {
            z = false;
        }
        cVar.f763d = z;
        cVar.f761b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: M */
    private void m831M(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f758y;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f759z;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                C0123c cVar = (C0123c) childAt.getLayoutParams();
                cVar.f765f = z4;
                cVar.f762c = z4 ? 1 : 0;
                cVar.f761b = z4;
                cVar.f763d = z4;
                cVar.leftMargin = z4;
                cVar.rightMargin = z4;
                cVar.f764e = z6 && ((ActionMenuItemView) childAt).mo489f();
                int L = m830L(childAt, i11, cVar.f760a ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (cVar.f763d) {
                    i16++;
                }
                if (cVar.f760a) {
                    z5 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    C0123c cVar2 = (C0123c) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (cVar2.f763d) {
                        int i26 = cVar2.f761b;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    C0123c cVar3 = (C0123c) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f761b == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !cVar3.f764e || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f759z;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        cVar3.f761b++;
                        cVar3.f765f = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0123c) getChildAt(0).getLayoutParams()).f764e) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((C0123c) getChildAt(i32).getLayoutParams()).f764e) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0123c cVar4 = (C0123c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f762c = i33;
                        cVar4.f765f = true;
                        if (i34 == 0 && !cVar4.f764e) {
                            cVar4.leftMargin = (-i33) / 2;
                        }
                    } else if (cVar4.f760a) {
                        cVar4.f762c = i33;
                        cVar4.f765f = true;
                        cVar4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            cVar4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            cVar4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                C0123c cVar5 = (C0123c) childAt4.getLayoutParams();
                if (cVar5.f765f) {
                    childAt4.measure(MeasureSpec.makeMeasureSpec((cVar5.f761b * i11) + cVar5.f762c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    /* renamed from: B */
    public void mo1019B() {
        ActionMenuPresenter cVar = this.f753t;
        if (cVar != null) {
            cVar.mo1372y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C0123c mo1041m() {
        C0123c cVar = new C0123c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public C0123c mo1042n(AttributeSet attributeSet) {
        return new C0123c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C0123c mo1043o(LayoutParams layoutParams) {
        C0123c cVar;
        if (layoutParams == null) {
            return mo1041m();
        }
        if (layoutParams instanceof C0123c) {
            cVar = new C0123c((C0123c) layoutParams);
        } else {
            cVar = new C0123c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    /* renamed from: F */
    public C0123c mo1023F() {
        C0123c C = mo1041m();
        C.f760a = true;
        return C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo1024G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0121a)) {
            z = false | ((C0121a) childAt).mo485a();
        }
        if (i > 0 && (childAt2 instanceof C0121a)) {
            z |= ((C0121a) childAt2).mo486b();
        }
        return z;
    }

    /* renamed from: H */
    public boolean mo1025H() {
        ActionMenuPresenter cVar = this.f753t;
        return cVar != null && cVar.mo1362B();
    }

    /* renamed from: I */
    public boolean mo1026I() {
        ActionMenuPresenter cVar = this.f753t;
        return cVar != null && cVar.mo1364D();
    }

    /* renamed from: J */
    public boolean mo1027J() {
        ActionMenuPresenter cVar = this.f753t;
        return cVar != null && cVar.mo1365E();
    }

    /* renamed from: K */
    public boolean mo1028K() {
        return this.f752s;
    }

    /* renamed from: N */
    public MenuBuilder mo1029N() {
        return this.f749p;
    }

    /* renamed from: O */
    public void mo1030O(C0111a aVar, C0102a aVar2) {
        this.f754u = aVar;
        this.f755v = aVar2;
    }

    /* renamed from: P */
    public boolean mo1031P() {
        ActionMenuPresenter cVar = this.f753t;
        return cVar != null && cVar.mo1371K();
    }

    /* renamed from: a */
    public boolean mo507a(MenuItemImpl iVar) {
        return this.f749p.mo654L(iVar, 0);
    }

    /* renamed from: b */
    public void mo508b(MenuBuilder gVar) {
        this.f749p = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0123c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f749p == null) {
            Context context = getContext();
            MenuBuilder gVar = new MenuBuilder(context);
            this.f749p = gVar;
            gVar.mo659R(new C0124d());
            ActionMenuPresenter cVar = new ActionMenuPresenter(context);
            this.f753t = cVar;
            cVar.mo1370J(true);
            ActionMenuPresenter cVar2 = this.f753t;
            C0111a aVar = this.f754u;
            if (aVar == null) {
                aVar = new C0122b();
            }
            cVar2.mo590k(aVar);
            this.f749p.mo679c(this.f753t, this.f750q);
            this.f753t.mo1368H(this);
        }
        return this.f749p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f753t.mo1361A();
    }

    public int getPopupTheme() {
        return this.f751r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter cVar = this.f753t;
        if (cVar != null) {
            cVar.mo586f(false);
            if (this.f753t.mo1365E()) {
                this.f753t.mo1362B();
                this.f753t.mo1371K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1019B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f756w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = ViewUtils.m1084b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0123c cVar = (C0123c) childAt.getLayoutParams();
                if (cVar.f760a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1024G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo1024G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0123c cVar2 = (C0123c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f760a) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
        } else {
            int paddingLeft = getPaddingLeft();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt4 = getChildAt(i19);
                C0123c cVar3 = (C0123c) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !cVar3.f760a) {
                    int i20 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i21 = i7 - (measuredHeight4 / 2);
                    childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                    paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f756w;
        boolean z2 = MeasureSpec.getMode(i) == 1073741824;
        this.f756w = z2;
        if (z != z2) {
            this.f757x = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f756w) {
            MenuBuilder gVar = this.f749p;
            if (!(gVar == null || size == this.f757x)) {
                this.f757x = size;
                gVar.mo653K(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f756w || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0123c cVar = (C0123c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m831M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f753t.mo1367G(z);
    }

    public void setOnMenuItemClickListener(C0125e eVar) {
        this.f748A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f753t.mo1369I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f752s = z;
    }

    public void setPopupTheme(int i) {
        if (this.f751r != i) {
            this.f751r = i;
            if (i == 0) {
                this.f750q = getContext();
            } else {
                this.f750q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter cVar) {
        this.f753t = cVar;
        cVar.mo1368H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f758y = (int) (56.0f * f);
        this.f759z = (int) (f * 4.0f);
        this.f750q = context;
        this.f751r = 0;
    }
}
