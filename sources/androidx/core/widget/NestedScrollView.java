package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.NestedScrollingChild;
import p010b.p034g.p043k.NestedScrollingChildHelper;
import p010b.p034g.p043k.NestedScrollingParent3;
import p010b.p034g.p043k.NestedScrollingParentHelper;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a;
import p010b.p034g.p043k.p044f0.AccessibilityRecordCompat;

public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild {

    /* renamed from: a */
    private static final C0265a f2049a = new C0265a();

    /* renamed from: b */
    private static final int[] f2050b = {16843130};

    /* renamed from: A */
    private float f2051A;

    /* renamed from: B */
    private C0266b f2052B;

    /* renamed from: c */
    private long f2053c;

    /* renamed from: d */
    private final Rect f2054d;

    /* renamed from: e */
    private OverScroller f2055e;

    /* renamed from: f */
    private EdgeEffect f2056f;

    /* renamed from: g */
    private EdgeEffect f2057g;

    /* renamed from: h */
    private int f2058h;

    /* renamed from: i */
    private boolean f2059i;

    /* renamed from: j */
    private boolean f2060j;

    /* renamed from: k */
    private View f2061k;

    /* renamed from: l */
    private boolean f2062l;

    /* renamed from: m */
    private VelocityTracker f2063m;

    /* renamed from: n */
    private boolean f2064n;

    /* renamed from: o */
    private boolean f2065o;

    /* renamed from: p */
    private int f2066p;

    /* renamed from: q */
    private int f2067q;

    /* renamed from: r */
    private int f2068r;

    /* renamed from: s */
    private int f2069s;

    /* renamed from: t */
    private final int[] f2070t;

    /* renamed from: u */
    private final int[] f2071u;

    /* renamed from: v */
    private int f2072v;

    /* renamed from: w */
    private int f2073w;

    /* renamed from: x */
    private C0267c f2074x;

    /* renamed from: y */
    private final NestedScrollingParentHelper f2075y;

    /* renamed from: z */
    private final NestedScrollingChildHelper f2076z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0265a extends AccessibilityDelegateCompat {
        C0265a() {
        }

        /* renamed from: f */
        public void mo2301f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2301f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AccessibilityRecordCompat.m5423a(accessibilityEvent, nestedScrollView.getScrollX());
            AccessibilityRecordCompat.m5424b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo5051X(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    cVar.mo5083q0(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        cVar.mo5056b(C0634a.f4693n);
                        cVar.mo5056b(C0634a.f4704y);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        cVar.mo5056b(C0634a.f4692m);
                        cVar.mo5056b(C0634a.f4667A);
                    }
                }
            }
        }

        /* renamed from: j */
        public boolean mo2303j(View view, int i, Bundle bundle) {
            if (super.mo2303j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo2240O(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo2240O(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0266b {
        /* renamed from: a */
        void mo236a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    static class C0267c extends BaseSavedState {
        public static final Creator<C0267c> CREATOR = new C0268a();

        /* renamed from: a */
        public int f2077a;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        class C0268a implements Creator<C0267c> {
            C0268a() {
            }

            /* renamed from: a */
            public C0267c createFromParcel(Parcel parcel) {
                return new C0267c(parcel);
            }

            /* renamed from: b */
            public C0267c[] newArray(int i) {
                return new C0267c[i];
            }
        }

        C0267c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f2077a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2077a);
        }

        C0267c(Parcel parcel) {
            super(parcel);
            this.f2077a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private static boolean m1872A(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m1872A((View) parent, view2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: B */
    private boolean m1873B(View view, int i, int i2) {
        view.getDrawingRect(this.f2054d);
        offsetDescendantRectToMyCoords(view, this.f2054d);
        return this.f2054d.bottom + i >= getScrollY() && this.f2054d.top - i <= getScrollY() + i2;
    }

    /* renamed from: C */
    private void m1874C(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2076z.mo5132e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: D */
    private void m1875D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2069s) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2058h = (int) motionEvent.getY(i);
            this.f2069s = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2063m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m1876G() {
        VelocityTracker velocityTracker = this.f2063m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2063m = null;
        }
    }

    /* renamed from: H */
    private void m1877H(boolean z) {
        if (z) {
            mo2241P(2, 1);
        } else {
            mo2242Q(1);
        }
        this.f2073w = getScrollY();
        ViewCompat.m5555f0(this);
    }

    /* renamed from: I */
    private boolean m1878I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View r = m1888r(z2, i2, i3);
        if (r == null) {
            r = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1885k(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (r != findFocus()) {
            r.requestFocus(i);
        }
        return z;
    }

    /* renamed from: J */
    private void m1879J(View view) {
        view.getDrawingRect(this.f2054d);
        offsetDescendantRectToMyCoords(view, this.f2054d);
        int e = mo2261e(this.f2054d);
        if (e != 0) {
            scrollBy(0, e);
        }
    }

    /* renamed from: K */
    private boolean m1880K(Rect rect, boolean z) {
        int e = mo2261e(rect);
        boolean z2 = e != 0;
        if (z2) {
            if (z) {
                scrollBy(0, e);
            } else {
                mo2238L(0, e);
            }
        }
        return z2;
    }

    /* renamed from: M */
    private void m1881M(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2053c > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f2055e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
                m1877H(z);
            } else {
                if (!this.f2055e.isFinished()) {
                    m1882a();
                }
                scrollBy(i, i2);
            }
            this.f2053c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    private void m1882a() {
        this.f2055e.abortAnimation();
        mo2242Q(1);
    }

    /* renamed from: c */
    private boolean m1883c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m1884d(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2051A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2051A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2051A;
    }

    /* renamed from: k */
    private void m1885k(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2065o) {
            mo2238L(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: l */
    private void m1886l() {
        this.f2062l = false;
        m1876G();
        mo2242Q(0);
        EdgeEffect edgeEffect = this.f2056f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2057g.onRelease();
        }
    }

    /* renamed from: p */
    private void m1887p() {
        if (getOverScrollMode() == 2) {
            this.f2056f = null;
            this.f2057g = null;
        } else if (this.f2056f == null) {
            Context context = getContext();
            this.f2056f = new EdgeEffect(context);
            this.f2057g = new EdgeEffect(context);
        }
    }

    /* renamed from: r */
    private View m1888r(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    private boolean m1889v(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private void m1890w() {
        VelocityTracker velocityTracker = this.f2063m;
        if (velocityTracker == null) {
            this.f2063m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m1891x() {
        this.f2055e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2066p = viewConfiguration.getScaledTouchSlop();
        this.f2067q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2068r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m1892y() {
        if (this.f2063m == null) {
            this.f2063m = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m1893z(View view) {
        return !m1873B(view, 0, getHeight());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2236E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo2300u(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f2055e
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo2236E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean mo2237F(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2054d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2054d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2054d.top = getScrollY() - height;
            Rect rect2 = this.f2054d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2054d;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m1878I(i, i2, i3);
    }

    /* renamed from: L */
    public final void mo2238L(int i, int i2) {
        m1881M(i, i2, 250, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo2239N(int i, int i2, int i3, boolean z) {
        m1881M(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public void mo2240O(int i, int i2, boolean z) {
        mo2239N(i, i2, 250, z);
    }

    /* renamed from: P */
    public boolean mo2241P(int i, int i2) {
        return this.f2076z.mo5139p(i, i2);
    }

    /* renamed from: Q */
    public void mo2242Q(int i) {
        this.f2076z.mo5141r(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo2247b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1873B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1885k(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2054d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2054d);
            m1885k(mo2261e(this.f2054d));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m1893z(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f2055e.isFinished()) {
            this.f2055e.computeScrollOffset();
            int currY = this.f2055e.getCurrY();
            int i = currY - this.f2073w;
            this.f2073w = currY;
            int[] iArr = this.f2071u;
            boolean z = false;
            iArr[1] = 0;
            mo2262f(0, i, iArr, null, 1);
            int i2 = i - this.f2071u[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo2236E(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f2071u;
                iArr2[1] = 0;
                mo2263g(0, scrollY2, 0, i3, this.f2070t, 1, iArr2);
                i2 = i3 - this.f2071u[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m1887p();
                    if (i2 < 0) {
                        if (this.f2056f.isFinished()) {
                            this.f2056f.onAbsorb((int) this.f2055e.getCurrVelocity());
                        }
                    } else if (this.f2057g.isFinished()) {
                        this.f2057g.onAbsorb((int) this.f2055e.getCurrVelocity());
                    }
                }
                m1882a();
            }
            if (!this.f2055e.isFinished()) {
                ViewCompat.m5555f0(this);
            } else {
                mo2242Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2285q(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2076z.mo5128a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2076z.mo5129b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2262f(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2076z.mo5133f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2056f != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f2056f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = VERSION.SDK_INT;
                if (i3 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f2056f.setSize(width, height);
                if (this.f2056f.draw(canvas)) {
                    ViewCompat.m5555f0(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2057g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                int i4 = VERSION.SDK_INT;
                if (i4 < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (i4 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f2057g.setSize(width2, height2);
                if (this.f2057g.draw(canvas)) {
                    ViewCompat.m5555f0(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo2261e(Rect rect) {
        int i;
        int i2;
        int i3 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i5;
            }
            i3 = Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top < scrollY && i6 < i5) {
            if (rect.height() > height) {
                i = 0 - (i5 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            i3 = Math.max(i, -getScrollY());
        }
        return i3;
    }

    /* renamed from: f */
    public boolean mo2262f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2076z.mo5131d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: g */
    public void mo2263g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2076z.mo5132e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2075y.mo5142a();
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void mo975h(View view, View view2, int i, int i2) {
        this.f2075y.mo5144c(view, view2, i, i2);
        mo2241P(2, i2);
    }

    public boolean hasNestedScrollingParent() {
        return mo2300u(0);
    }

    /* renamed from: i */
    public void mo976i(View view, int i) {
        this.f2075y.mo5145d(view, i);
        mo2242Q(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2076z.mo5136l();
    }

    /* renamed from: j */
    public void mo977j(View view, int i, int i2, int[] iArr, int i3) {
        mo2262f(i, i2, iArr, null, i3);
    }

    /* renamed from: m */
    public void mo980m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1874C(i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo981n(View view, int i, int i2, int i3, int i4, int i5) {
        m1874C(i4, i5, null);
    }

    /* renamed from: o */
    public boolean mo982o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2060j = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2062l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2062l) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2069s;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2058h) > this.f2066p && (2 & getNestedScrollAxes()) == 0) {
                                this.f2062l = true;
                                this.f2058h = y;
                                m1892y();
                                this.f2063m.addMovement(motionEvent);
                                this.f2072v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1875D(motionEvent);
                    }
                }
            }
            this.f2062l = false;
            this.f2069s = -1;
            m1876G();
            if (this.f2055e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.m5555f0(this);
            }
            mo2242Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m1889v((int) motionEvent.getX(), y2)) {
                this.f2062l = false;
                m1876G();
            } else {
                this.f2058h = y2;
                this.f2069s = motionEvent.getPointerId(0);
                m1890w();
                this.f2063m.addMovement(motionEvent);
                this.f2055e.computeScrollOffset();
                this.f2062l = !this.f2055e.isFinished();
                mo2241P(2, 0);
            }
        }
        return this.f2062l;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2059i = false;
        View view = this.f2061k;
        if (view != null && m1872A(view, this)) {
            m1879J(this.f2061k);
        }
        this.f2061k = null;
        if (!this.f2060j) {
            if (this.f2074x != null) {
                scrollTo(getScrollX(), this.f2074x.f2077a);
                this.f2074x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d = m1884d(scrollY, paddingTop, i5);
            if (d != scrollY) {
                scrollTo(getScrollX(), d);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2060j = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2064n && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo2290s((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo977j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1874C(i4, 0, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo975h(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m1893z(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0267c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0267c cVar = (C0267c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f2074x = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0267c cVar = new C0267c(super.onSaveInstanceState());
        cVar.f2077a = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0266b bVar = this.f2052B;
        if (bVar != null) {
            bVar.mo236a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1873B(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2054d);
            offsetDescendantRectToMyCoords(findFocus, this.f2054d);
            m1885k(mo2261e(this.f2054d));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo982o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo976i(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        m1892y();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2072v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f2072v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2063m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f2068r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2069s);
                if (Math.abs(yVelocity) >= this.f2067q) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo2290s(i);
                    }
                } else if (this.f2055e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m5555f0(this);
                }
                this.f2069s = -1;
                m1886l();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f2069s);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.f2069s);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f2058h - y;
                    if (!this.f2062l && Math.abs(i2) > this.f2066p) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2062l = true;
                        i2 = i2 > 0 ? i2 - this.f2066p : i2 + this.f2066p;
                    }
                    int i3 = i2;
                    if (this.f2062l) {
                        if (mo2262f(0, i3, this.f2071u, this.f2070t, 0)) {
                            i3 -= this.f2071u[1];
                            this.f2072v += this.f2070t[1];
                        }
                        int i4 = i3;
                        this.f2058h = y - this.f2070t[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i5 = scrollRange;
                        if (mo2236E(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !mo2300u(0)) {
                            this.f2063m.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int i6 = i4 - scrollY2;
                        int[] iArr = this.f2071u;
                        iArr[1] = 0;
                        mo2263g(0, scrollY2, 0, i6, this.f2070t, 0, iArr);
                        int i7 = this.f2058h;
                        int[] iArr2 = this.f2070t;
                        this.f2058h = i7 - iArr2[1];
                        this.f2072v += iArr2[1];
                        if (z) {
                            int i8 = i4 - this.f2071u[1];
                            m1887p();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                EdgeEffectCompat.m1960a(this.f2056f, ((float) i8) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f2057g.isFinished()) {
                                    this.f2057g.onRelease();
                                }
                            } else if (i9 > i5) {
                                EdgeEffectCompat.m1960a(this.f2057g, ((float) i8) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f2056f.isFinished()) {
                                    this.f2056f.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f2056f;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f2057g.isFinished())) {
                                ViewCompat.m5555f0(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2062l && getChildCount() > 0 && this.f2055e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m5555f0(this);
                }
                this.f2069s = -1;
                m1886l();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2058h = (int) motionEvent2.getY(actionIndex);
                this.f2069s = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1875D(motionEvent);
                this.f2058h = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f2069s));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f2055e.isFinished();
            this.f2062l = z2;
            if (z2) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (!this.f2055e.isFinished()) {
                m1882a();
            }
            this.f2058h = (int) motionEvent.getY();
            this.f2069s = motionEvent2.getPointerId(0);
            mo2241P(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f2063m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: q */
    public boolean mo2285q(KeyEvent keyEvent) {
        this.f2054d.setEmpty();
        boolean z = false;
        int i = 130;
        if (!m1883c()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130))) {
                    z = true;
                }
            }
            return z;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z = !keyEvent.isAltPressed() ? mo2247b(33) : mo2299t(33);
            } else if (keyCode == 20) {
                z = !keyEvent.isAltPressed() ? mo2247b(130) : mo2299t(130);
            } else if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo2237F(i);
            }
        }
        return z;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2059i) {
            m1879J(view2);
        } else {
            this.f2061k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1880K(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1876G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2059i = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void mo2290s(int i) {
        if (getChildCount() > 0) {
            this.f2055e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m1877H(true);
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int d = m1884d(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int d2 = m1884d(i2, height, height2);
            if (d != getScrollX() || d2 != getScrollY()) {
                super.scrollTo(d, d2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2064n) {
            this.f2064n = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2076z.mo5137m(z);
    }

    public void setOnScrollChangeListener(C0266b bVar) {
        this.f2052B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2065o = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2241P(i, 0);
    }

    public void stopNestedScroll() {
        mo2242Q(0);
    }

    /* renamed from: t */
    public boolean mo2299t(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2054d;
        rect.top = 0;
        rect.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f2054d.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.f2054d;
                rect2.top = rect2.bottom - height;
            }
        }
        Rect rect3 = this.f2054d;
        return m1878I(i, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean mo2300u(int i) {
        return this.f2076z.mo5135k(i);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2054d = new Rect();
        this.f2059i = true;
        this.f2060j = false;
        this.f2061k = null;
        this.f2062l = false;
        this.f2065o = true;
        this.f2069s = -1;
        this.f2070t = new int[2];
        this.f2071u = new int[2];
        m1891x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2050b, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2075y = new NestedScrollingParentHelper(this);
        this.f2076z = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m5573o0(this, f2049a);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
