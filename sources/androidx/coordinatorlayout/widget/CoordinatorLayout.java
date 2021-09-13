package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.p259uc.crashsdk.export.LogType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p010b.p033f.C0572a;
import p010b.p033f.C0573b;
import p010b.p033f.C0574c;
import p010b.p034g.p042j.C0610e;
import p010b.p034g.p042j.C0612g;
import p010b.p034g.p042j.ObjectsCompat;
import p010b.p034g.p043k.GravityCompat;
import p010b.p034g.p043k.NestedScrollingParent2;
import p010b.p034g.p043k.NestedScrollingParent3;
import p010b.p034g.p043k.NestedScrollingParentHelper;
import p010b.p034g.p043k.OnApplyWindowInsetsListener;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.WindowInsetsCompat;
import p010b.p048i.p049a.AbsSavedState;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {

    /* renamed from: a */
    static final String f1893a;

    /* renamed from: b */
    static final Class<?>[] f1894b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<C0229c>>> f1895c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f1896d;

    /* renamed from: e */
    private static final C0610e<Rect> f1897e = new C0612g(12);

    /* renamed from: f */
    private final List<View> f1898f;

    /* renamed from: g */
    private final DirectedAcyclicGraph<View> f1899g;

    /* renamed from: h */
    private final List<View> f1900h;

    /* renamed from: i */
    private final List<View> f1901i;

    /* renamed from: j */
    private Paint f1902j;

    /* renamed from: k */
    private final int[] f1903k;

    /* renamed from: l */
    private final int[] f1904l;

    /* renamed from: m */
    private boolean f1905m;

    /* renamed from: n */
    private boolean f1906n;

    /* renamed from: o */
    private int[] f1907o;

    /* renamed from: p */
    private View f1908p;

    /* renamed from: q */
    private View f1909q;

    /* renamed from: r */
    private C0233g f1910r;

    /* renamed from: s */
    private boolean f1911s;

    /* renamed from: t */
    private WindowInsetsCompat f1912t;

    /* renamed from: u */
    private boolean f1913u;

    /* renamed from: v */
    private Drawable f1914v;

    /* renamed from: w */
    OnHierarchyChangeListener f1915w;

    /* renamed from: x */
    private OnApplyWindowInsetsListener f1916x;

    /* renamed from: y */
    private final NestedScrollingParentHelper f1917y;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0227a implements OnApplyWindowInsetsListener {
        C0227a() {
        }

        /* renamed from: a */
        public WindowInsetsCompat mo382a(View view, WindowInsetsCompat e0Var) {
            return CoordinatorLayout.this.mo2010W(e0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0228b {
        C0229c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0229c<V extends View> {
        public C0229c() {
        }

        /* renamed from: A */
        public boolean mo2055A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2084z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void mo2056B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo2057C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2056B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo2058D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2059a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2062d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo2060b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo2061c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo2062d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2063e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public WindowInsetsCompat mo2064f(CoordinatorLayout coordinatorLayout, V v, WindowInsetsCompat e0Var) {
            return e0Var;
        }

        /* renamed from: g */
        public void mo2065g(C0232f fVar) {
        }

        /* renamed from: h */
        public boolean mo2066h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo2067i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo2068j() {
        }

        /* renamed from: k */
        public boolean mo2069k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo2070l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo2071m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo2072n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo2073o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void mo2074p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo2075q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2074p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo2076r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo2077s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2076r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo2078t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo2077s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void mo2079u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void mo2080v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo2079u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo2081w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo2082x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo2083y(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo2084z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public C0229c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0230d {
        Class<? extends C0229c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0231e implements OnHierarchyChangeListener {
        C0231e() {
        }

        public void onChildViewAdded(View view, View view2) {
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1915w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2005H(2);
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1915w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0232f extends MarginLayoutParams {

        /* renamed from: a */
        C0229c f1920a;

        /* renamed from: b */
        boolean f1921b = false;

        /* renamed from: c */
        public int f1922c = 0;

        /* renamed from: d */
        public int f1923d = 0;

        /* renamed from: e */
        public int f1924e = -1;

        /* renamed from: f */
        int f1925f = -1;

        /* renamed from: g */
        public int f1926g = 0;

        /* renamed from: h */
        public int f1927h = 0;

        /* renamed from: i */
        int f1928i;

        /* renamed from: j */
        int f1929j;

        /* renamed from: k */
        View f1930k;

        /* renamed from: l */
        View f1931l;

        /* renamed from: m */
        private boolean f1932m;

        /* renamed from: n */
        private boolean f1933n;

        /* renamed from: o */
        private boolean f1934o;

        /* renamed from: p */
        private boolean f1935p;

        /* renamed from: q */
        final Rect f1936q = new Rect();

        /* renamed from: r */
        Object f1937r;

        public C0232f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: n */
        private void m1668n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1925f);
            this.f1930k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f1931l = null;
                            this.f1930k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1931l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f1931l = null;
                    this.f1930k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f1931l = null;
                this.f1930k = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f1925f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: s */
        private boolean m1669s(View view, int i) {
            int b = GravityCompat.m5245b(((C0232f) view.getLayoutParams()).f1926g, i);
            return b != 0 && (GravityCompat.m5245b(this.f1927h, i) & b) == b;
        }

        /* renamed from: t */
        private boolean m1670t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1930k.getId() != this.f1925f) {
                return false;
            }
            View view2 = this.f1930k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1931l = null;
                    this.f1930k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1931l = view2;
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2088a() {
            return this.f1930k == null && this.f1925f != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2089b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 != this.f1931l && !m1669s(view2, ViewCompat.m5514C(coordinatorLayout))) {
                C0229c cVar = this.f1920a;
                if (cVar == null || !cVar.mo2063e(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo2090c() {
            if (this.f1920a == null) {
                this.f1932m = false;
            }
            return this.f1932m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public View mo2091d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1925f == -1) {
                this.f1931l = null;
                this.f1930k = null;
                return null;
            }
            if (this.f1930k == null || !m1670t(view, coordinatorLayout)) {
                m1668n(view, coordinatorLayout);
            }
            return this.f1930k;
        }

        /* renamed from: e */
        public int mo2092e() {
            return this.f1925f;
        }

        /* renamed from: f */
        public C0229c mo2093f() {
            return this.f1920a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo2094g() {
            return this.f1935p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public Rect mo2095h() {
            return this.f1936q;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public boolean mo2096i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1932m;
            if (z) {
                return true;
            }
            C0229c cVar = this.f1920a;
            boolean a = (cVar != null ? cVar.mo2059a(coordinatorLayout, view) : false) | z;
            this.f1932m = a;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo2097j(int i) {
            if (i == 0) {
                return this.f1933n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1934o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo2098k() {
            this.f1935p = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo2099l(int i) {
            mo2104r(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo2100m() {
            this.f1932m = false;
        }

        /* renamed from: o */
        public void mo2101o(C0229c cVar) {
            C0229c cVar2 = this.f1920a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo2068j();
                }
                this.f1920a = cVar;
                this.f1937r = null;
                this.f1921b = true;
                if (cVar != null) {
                    cVar.mo2065g(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public void mo2102p(boolean z) {
            this.f1935p = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo2103q(Rect rect) {
            this.f1936q.set(rect);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public void mo2104r(int i, boolean z) {
            if (i == 0) {
                this.f1933n = z;
            } else if (i == 1) {
                this.f1934o = z;
            }
        }

        C0232f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0574c.f4361e);
            this.f1922c = obtainStyledAttributes.getInteger(C0574c.f4362f, 0);
            this.f1925f = obtainStyledAttributes.getResourceId(C0574c.f4363g, -1);
            this.f1923d = obtainStyledAttributes.getInteger(C0574c.f4364h, 0);
            this.f1924e = obtainStyledAttributes.getInteger(C0574c.f4368l, -1);
            this.f1926g = obtainStyledAttributes.getInt(C0574c.f4367k, 0);
            this.f1927h = obtainStyledAttributes.getInt(C0574c.f4366j, 0);
            int i = C0574c.f4365i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f1921b = hasValue;
            if (hasValue) {
                this.f1920a = CoordinatorLayout.m1592K(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            C0229c cVar = this.f1920a;
            if (cVar != null) {
                cVar.mo2065g(this);
            }
        }

        public C0232f(C0232f fVar) {
            super(fVar);
        }

        public C0232f(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0232f(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0233g implements OnPreDrawListener {
        C0233g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2005H(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C0234h extends AbsSavedState {
        public static final Creator<C0234h> CREATOR = new C0235a();

        /* renamed from: c */
        SparseArray<Parcelable> f1939c;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C0235a implements ClassLoaderCreator<C0234h> {
            C0235a() {
            }

            /* renamed from: a */
            public C0234h createFromParcel(Parcel parcel) {
                return new C0234h(parcel, null);
            }

            /* renamed from: b */
            public C0234h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0234h(parcel, classLoader);
            }

            /* renamed from: c */
            public C0234h[] newArray(int i) {
                return new C0234h[i];
            }
        }

        public C0234h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1939c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1939c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1939c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1939c.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f1939c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public C0234h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0236i implements Comparator<View> {
        C0236i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float N = ViewCompat.m5531N(view);
            float N2 = ViewCompat.m5531N(view2);
            if (N > N2) {
                return -1;
            }
            return N < N2 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f1893a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f1896d = new C0236i();
        } else {
            f1896d = null;
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0572a.coordinatorLayoutStyle);
    }

    /* renamed from: A */
    private boolean m1587A(View view) {
        return this.f1899g.mo2121j(view);
    }

    /* renamed from: C */
    private void m1588C(View view, int i) {
        C0232f fVar = (C0232f) view.getLayoutParams();
        Rect a = m1603a();
        a.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f1912t != null && ViewCompat.m5594z(this) && !ViewCompat.m5594z(view)) {
            a.left += this.f1912t.mo4992g();
            a.top += this.f1912t.mo4995i();
            a.right -= this.f1912t.mo4993h();
            a.bottom -= this.f1912t.mo4991f();
        }
        Rect a2 = m1603a();
        GravityCompat.m5244a(m1598S(fVar.f1922c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m1595O(a);
        m1595O(a2);
    }

    /* renamed from: D */
    private void m1589D(View view, View view2, int i) {
        Rect a = m1603a();
        Rect a2 = m1603a();
        try {
            mo2049t(view2, a);
            mo2050u(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m1595O(a);
            m1595O(a2);
        }
    }

    /* renamed from: E */
    private void m1590E(View view, int i, int i2) {
        C0232f fVar = (C0232f) view.getLayoutParams();
        int b = GravityCompat.m5245b(m1599T(fVar.f1922c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int w = m1608w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            w += measuredWidth / 2;
        } else if (i3 == 5) {
            w += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(w, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f7  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1591F(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
            r8 = this;
            boolean r0 = p010b.p034g.p043k.ViewCompat.m5537T(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x00fd
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x00fd
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.mo2093f()
            android.graphics.Rect r2 = m1603a()
            android.graphics.Rect r3 = m1603a()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r1.mo2060b(r8, r9, r2)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0070:
            r2.set(r3)
        L_0x0073:
            m1595O(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0080
            m1595O(r2)
            return
        L_0x0080:
            int r1 = r0.f1927h
            int r11 = p010b.p034g.p043k.GravityCompat.m5245b(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x00a0
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f1929j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x00a0
            int r3 = r3 - r1
            r8.m1601V(r9, r3)
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00bd
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f1929j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00bd
            int r3 = r3 - r6
            r8.m1601V(r9, r3)
            r1 = 1
        L_0x00bd:
            if (r1 != 0) goto L_0x00c2
            r8.m1601V(r9, r5)
        L_0x00c2:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00d9
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f1928i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00d9
            int r3 = r3 - r1
            r8.m1600U(r9, r3)
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00f4
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f1928i
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto L_0x00f4
            int r11 = r11 - r10
            r8.m1600U(r9, r11)
            goto L_0x00f5
        L_0x00f4:
            r4 = r1
        L_0x00f5:
            if (r4 != 0) goto L_0x00fa
            r8.m1600U(r9, r5)
        L_0x00fa:
            m1595O(r2)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1591F(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: K */
    static C0229c m1592K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0) {
            String str2 = f1893a;
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append('.');
                sb2.append(str);
                str = sb2.toString();
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<C0229c>>> threadLocal = f1895c;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1894b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0229c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* renamed from: L */
    private boolean m1593L(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1900h;
        m1609z(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C0232f fVar = (C0232f) view.getLayoutParams();
            C0229c f = fVar.mo2093f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo2069k(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo2058D(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f1908p = view;
                    }
                }
                boolean c = fVar.mo2090c();
                boolean i4 = fVar.mo2096i(this, view);
                z2 = i4 && !c;
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo2069k(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo2058D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: M */
    private void m1594M() {
        this.f1898f.clear();
        this.f1899g.mo2116c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0232f y = mo2053y(childAt);
            y.mo2091d(this, childAt);
            this.f1899g.mo2115b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (y.mo2089b(this, childAt, childAt2)) {
                        if (!this.f1899g.mo2117d(childAt2)) {
                            this.f1899g.mo2115b(childAt2);
                        }
                        this.f1899g.mo2114a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1898f.addAll(this.f1899g.mo2120i());
        Collections.reverse(this.f1898f);
    }

    /* renamed from: O */
    private static void m1595O(Rect rect) {
        rect.setEmpty();
        f1897e.mo4945a(rect);
    }

    /* renamed from: Q */
    private void m1596Q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0229c f = ((C0232f) childAt.getLayoutParams()).mo2093f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo2069k(this, childAt, obtain);
                } else {
                    f.mo2058D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0232f) getChildAt(i2).getLayoutParams()).mo2100m();
        }
        this.f1908p = null;
        this.f1905m = false;
    }

    /* renamed from: R */
    private static int m1597R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: S */
    private static int m1598S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: T */
    private static int m1599T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: U */
    private void m1600U(View view, int i) {
        C0232f fVar = (C0232f) view.getLayoutParams();
        int i2 = fVar.f1928i;
        if (i2 != i) {
            ViewCompat.m5542Y(view, i - i2);
            fVar.f1928i = i;
        }
    }

    /* renamed from: V */
    private void m1601V(View view, int i) {
        C0232f fVar = (C0232f) view.getLayoutParams();
        int i2 = fVar.f1929j;
        if (i2 != i) {
            ViewCompat.m5543Z(view, i - i2);
            fVar.f1929j = i;
        }
    }

    /* renamed from: X */
    private void m1602X() {
        if (VERSION.SDK_INT >= 21) {
            if (ViewCompat.m5594z(this)) {
                if (this.f1916x == null) {
                    this.f1916x = new C0227a();
                }
                ViewCompat.m5595z0(this, this.f1916x);
                setSystemUiVisibility(LogType.UNEXP_ANR);
            } else {
                ViewCompat.m5595z0(this, null);
            }
        }
    }

    /* renamed from: a */
    private static Rect m1603a() {
        Rect rect = (Rect) f1897e.mo4946b();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: c */
    private static int m1604c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: d */
    private void m1605d(C0232f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: e */
    private WindowInsetsCompat m1606e(WindowInsetsCompat e0Var) {
        if (e0Var.mo4997l()) {
            return e0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.m5594z(childAt)) {
                C0229c f = ((C0232f) childAt.getLayoutParams()).mo2093f();
                if (f != null) {
                    e0Var = f.mo2064f(this, childAt, e0Var);
                    if (e0Var.mo4997l()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return e0Var;
    }

    /* renamed from: v */
    private void m1607v(View view, int i, Rect rect, Rect rect2, C0232f fVar, int i2, int i3) {
        int i4;
        int i5;
        int b = GravityCompat.m5245b(m1597R(fVar.f1922c), i);
        int b2 = GravityCompat.m5245b(m1598S(fVar.f1923d), i);
        int i6 = b & 7;
        int i7 = b & 112;
        int i8 = b2 & 7;
        int i9 = b2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: w */
    private int m1608w(int i) {
        int[] iArr = this.f1907o;
        String str = "CoordinatorLayout";
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e(str, sb.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e(str, sb2.toString());
            return 0;
        }
    }

    /* renamed from: z */
    private void m1609z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        Comparator<View> comparator = f1896d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public boolean mo2003B(View view, int i, int i2) {
        Rect a = m1603a();
        mo2049t(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m1595O(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo2004G(View view, int i) {
        View view2 = view;
        C0232f fVar = (C0232f) view.getLayoutParams();
        if (fVar.f1930k != null) {
            Rect a = m1603a();
            Rect a2 = m1603a();
            Rect a3 = m1603a();
            mo2049t(fVar.f1930k, a);
            boolean z = false;
            mo2038q(view2, false, a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m1607v(view, i, a, a3, fVar, measuredWidth, measuredHeight);
            if (!(a3.left == a2.left && a3.top == a2.top)) {
                z = true;
            }
            m1605d(fVar, a3, measuredWidth, i2);
            int i3 = a3.left - a2.left;
            int i4 = a3.top - a2.top;
            if (i3 != 0) {
                ViewCompat.m5542Y(view2, i3);
            }
            if (i4 != 0) {
                ViewCompat.m5543Z(view2, i4);
            }
            if (z) {
                C0229c f = fVar.mo2093f();
                if (f != null) {
                    f.mo2066h(this, view2, fVar.f1930k);
                }
            }
            m1595O(a);
            m1595O(a2);
            m1595O(a3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public final void mo2005H(int i) {
        boolean z;
        int i2 = i;
        int C = ViewCompat.m5514C(this);
        int size = this.f1898f.size();
        Rect a = m1603a();
        Rect a2 = m1603a();
        Rect a3 = m1603a();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f1898f.get(i3);
            C0232f fVar = (C0232f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f1931l == ((View) this.f1898f.get(i4))) {
                        mo2004G(view, C);
                    }
                }
                mo2038q(view, true, a2);
                if (fVar.f1926g != 0 && !a2.isEmpty()) {
                    int b = GravityCompat.m5245b(fVar.f1926g, C);
                    int i5 = b & 112;
                    if (i5 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i5 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i6 = b & 7;
                    if (i6 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i6 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar.f1927h != 0 && view.getVisibility() == 0) {
                    m1591F(view, a, C);
                }
                if (i2 != 2) {
                    mo2052x(view, a3);
                    if (!a3.equals(a2)) {
                        mo2008N(view, a2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f1898f.get(i7);
                    C0232f fVar2 = (C0232f) view2.getLayoutParams();
                    C0229c f = fVar2.mo2093f();
                    if (f != null && f.mo2063e(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo2094g()) {
                            if (i2 != 2) {
                                z = f.mo2066h(this, view2, view);
                            } else {
                                f.mo2067i(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo2102p(z);
                            }
                        } else {
                            fVar2.mo2098k();
                        }
                    }
                }
            }
        }
        m1595O(a);
        m1595O(a2);
        m1595O(a3);
    }

    /* renamed from: I */
    public void mo2006I(View view, int i) {
        C0232f fVar = (C0232f) view.getLayoutParams();
        if (!fVar.mo2088a()) {
            View view2 = fVar.f1930k;
            if (view2 != null) {
                m1589D(view, view2, i);
                return;
            }
            int i2 = fVar.f1924e;
            if (i2 >= 0) {
                m1590E(view, i2, i);
            } else {
                m1588C(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: J */
    public void mo2007J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo2008N(View view, Rect rect) {
        ((C0232f) view.getLayoutParams()).mo2103q(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public void mo2009P() {
        if (this.f1906n && this.f1910r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1910r);
        }
        this.f1911s = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W */
    public final WindowInsetsCompat mo2010W(WindowInsetsCompat e0Var) {
        if (ObjectsCompat.m5175a(this.f1912t, e0Var)) {
            return e0Var;
        }
        this.f1912t = e0Var;
        boolean z = true;
        boolean z2 = e0Var != null && e0Var.mo4995i() > 0;
        this.f1913u = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        WindowInsetsCompat e = m1606e(e0Var);
        requestLayout();
        return e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2011b() {
        if (this.f1906n) {
            if (this.f1910r == null) {
                this.f1910r = new C0233g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1910r);
        }
        this.f1911s = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0232f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0232f fVar = (C0232f) view.getLayoutParams();
        C0229c cVar = fVar.f1920a;
        if (cVar != null) {
            float d = cVar.mo2062d(this, view);
            if (d > 0.0f) {
                if (this.f1902j == null) {
                    this.f1902j = new Paint();
                }
                this.f1902j.setColor(fVar.f1920a.mo2061c(this, view));
                this.f1902j.setAlpha(m1604c(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1902j);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1914v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void mo2015f(View view) {
        List g = this.f1899g.mo2118g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                C0229c f = ((C0232f) view2.getLayoutParams()).mo2093f();
                if (f != null) {
                    f.mo2066h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2016g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1587A(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f1911s) {
            return;
        }
        if (z) {
            mo2011b();
        } else {
            mo2009P();
        }
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        m1594M();
        return Collections.unmodifiableList(this.f1898f);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f1912t;
    }

    public int getNestedScrollAxes() {
        return this.f1917y.mo5142a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1914v;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    public void mo975h(View view, View view2, int i, int i2) {
        this.f1917y.mo5144c(view, view2, i, i2);
        this.f1909q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0232f fVar = (C0232f) childAt.getLayoutParams();
            if (fVar.mo2097j(i2)) {
                C0229c f = fVar.mo2093f();
                if (f != null) {
                    f.mo2080v(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo976i(View view, int i) {
        this.f1917y.mo5145d(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0232f fVar = (C0232f) childAt.getLayoutParams();
            if (fVar.mo2097j(i)) {
                C0229c f = fVar.mo2093f();
                if (f != null) {
                    f.mo2057C(this, childAt, view, i);
                }
                fVar.mo2099l(i);
                fVar.mo2098k();
            }
        }
        this.f1909q = null;
    }

    /* renamed from: j */
    public void mo977j(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0232f fVar = (C0232f) childAt.getLayoutParams();
                if (fVar.mo2097j(i3)) {
                    C0229c f = fVar.mo2093f();
                    if (f != null) {
                        int[] iArr2 = this.f1903k;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        f.mo2075q(this, childAt, view, i, i2, iArr2, i3);
                        int[] iArr3 = this.f1903k;
                        if (i > 0) {
                            i4 = Math.max(i6, iArr3[0]);
                        } else {
                            i4 = Math.min(i6, iArr3[0]);
                        }
                        i6 = i4;
                        int[] iArr4 = this.f1903k;
                        if (i2 > 0) {
                            i5 = Math.max(i7, iArr4[1]);
                        } else {
                            i5 = Math.min(i7, iArr4[1]);
                        }
                        i7 = i5;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo2005H(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0232f generateDefaultLayoutParams() {
        return new C0232f(-2, -2);
    }

    /* renamed from: l */
    public C0232f generateLayoutParams(AttributeSet attributeSet) {
        return new C0232f(getContext(), attributeSet);
    }

    /* renamed from: m */
    public void mo980m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0232f fVar = (C0232f) childAt.getLayoutParams();
                if (fVar.mo2097j(i5)) {
                    C0229c f = fVar.mo2093f();
                    if (f != null) {
                        int[] iArr2 = this.f1903k;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        f.mo2078t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                        int[] iArr3 = this.f1903k;
                        if (i3 > 0) {
                            i6 = Math.max(i8, iArr3[0]);
                        } else {
                            i6 = Math.min(i8, iArr3[0]);
                        }
                        i8 = i6;
                        if (i4 > 0) {
                            i7 = Math.max(i9, this.f1903k[1]);
                        } else {
                            i7 = Math.min(i9, this.f1903k[1]);
                        }
                        i9 = i7;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo2005H(1);
        }
    }

    /* renamed from: n */
    public void mo981n(View view, int i, int i2, int i3, int i4, int i5) {
        mo980m(view, i, i2, i3, i4, 0, this.f1904l);
    }

    /* renamed from: o */
    public boolean mo982o(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0232f fVar = (C0232f) childAt.getLayoutParams();
                C0229c f = fVar.mo2093f();
                if (f != null) {
                    boolean A = f.mo2055A(this, childAt, view, view2, i, i2);
                    z |= A;
                    fVar.mo2104r(i3, A);
                } else {
                    fVar.mo2104r(i3, false);
                }
            }
        }
        return z;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1596Q(false);
        if (this.f1911s) {
            if (this.f1910r == null) {
                this.f1910r = new C0233g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1910r);
        }
        if (this.f1912t == null && ViewCompat.m5594z(this)) {
            ViewCompat.m5567l0(this);
        }
        this.f1906n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1596Q(false);
        if (this.f1911s && this.f1910r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1910r);
        }
        View view = this.f1909q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1906n = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1913u && this.f1914v != null) {
            WindowInsetsCompat e0Var = this.f1912t;
            int i = e0Var != null ? e0Var.mo4995i() : 0;
            if (i > 0) {
                this.f1914v.setBounds(0, 0, getWidth(), i);
                this.f1914v.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1596Q(true);
        }
        boolean L = m1593L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1596Q(true);
        }
        return L;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int C = ViewCompat.m5514C(this);
        int size = this.f1898f.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f1898f.get(i5);
            if (view.getVisibility() != 8) {
                C0229c f = ((C0232f) view.getLayoutParams()).mo2093f();
                if (f == null || !f.mo2070l(this, view, C)) {
                    mo2006I(view, C);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo2071m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m1594M()
            r30.mo2016g()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p010b.p034g.p043k.ViewCompat.m5514C(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            b.g.k.e0 r3 = r7.f1912t
            if (r3 == 0) goto L_0x004b
            boolean r3 = p010b.p034g.p043k.ViewCompat.m5594z(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1898f
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f1898f
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f) r1
            int r0 = r1.f1924e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m1608w(r0)
            int r11 = r1.f1922c
            int r11 = m1599T(r11)
            int r11 = p010b.p034g.p043k.GravityCompat.m5245b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = p010b.p034g.p043k.ViewCompat.m5594z(r20)
            if (r0 != 0) goto L_0x00f1
            b.g.k.e0 r0 = r7.f1912t
            int r0 = r0.mo4992g()
            b.g.k.e0 r2 = r7.f1912t
            int r2 = r2.mo4993h()
            int r0 = r0 + r2
            b.g.k.e0 r2 = r7.f1912t
            int r2 = r2.mo4995i()
            b.g.k.e0 r11 = r7.f1912t
            int r11 = r11.mo4991f()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo2093f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo2071m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2007J(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0232f fVar = (C0232f) childAt.getLayoutParams();
                if (fVar.mo2097j(0)) {
                    C0229c f3 = fVar.mo2093f();
                    if (f3 != null) {
                        z2 |= f3.mo2072n(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            mo2005H(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0232f fVar = (C0232f) childAt.getLayoutParams();
                if (fVar.mo2097j(0)) {
                    C0229c f3 = fVar.mo2093f();
                    if (f3 != null) {
                        z |= f3.mo2073o(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo977j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo981n(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo975h(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0234h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0234h hVar = (C0234h) parcelable;
        super.onRestoreInstanceState(hVar.mo5193l());
        SparseArray<Parcelable> sparseArray = hVar.f1939c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0229c f = mo2053y(childAt).mo2093f();
            if (!(id == -1 || f == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    f.mo2082x(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0234h hVar = new C0234h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0229c f = ((C0232f) childAt.getLayoutParams()).mo2093f();
            if (!(id == -1 || f == null)) {
                Parcelable y = f.mo2083y(this, childAt);
                if (y != null) {
                    sparseArray.append(id, y);
                }
            }
        }
        hVar.f1939c = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo982o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo976i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1908p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m1593L(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1908p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo2093f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f1908p
            boolean r6 = r6.mo2058D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f1908p
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m1596Q(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C0232f generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0232f) {
            return new C0232f((C0232f) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0232f((MarginLayoutParams) layoutParams);
        }
        return new C0232f(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo2038q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            mo2049t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> mo2039r(View view) {
        List h = this.f1899g.mo2119h(view);
        this.f1901i.clear();
        if (h != null) {
            this.f1901i.addAll(h);
        }
        return this.f1901i;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0229c f = ((C0232f) view.getLayoutParams()).mo2093f();
        if (f == null || !f.mo2081w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1905m) {
            m1596Q(false);
            this.f1905m = true;
        }
    }

    /* renamed from: s */
    public List<View> mo2042s(View view) {
        List g = this.f1899g.mo2118g(view);
        this.f1901i.clear();
        if (g != null) {
            this.f1901i.addAll(g);
        }
        return this.f1901i;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1602X();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1915w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1914v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1914v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1914v.setState(getDrawableState());
                }
                DrawableCompat.m1854m(this.f1914v, ViewCompat.m5514C(this));
                this.f1914v.setVisible(getVisibility() == 0, false);
                this.f1914v.setCallback(this);
            }
            ViewCompat.m5555f0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? ContextCompat.m1758d(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1914v;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1914v.setVisible(z, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo2049t(View view, Rect rect) {
        ViewGroupUtils.m1703a(this, view, rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo2050u(View view, int i, Rect rect, Rect rect2) {
        C0232f fVar = (C0232f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1607v(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m1605d(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1914v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo2052x(View view, Rect rect) {
        rect.set(((C0232f) view.getLayoutParams()).mo2095h());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public C0232f mo2053y(View view) {
        C0232f fVar = (C0232f) view.getLayoutParams();
        if (!fVar.f1921b) {
            String str = "CoordinatorLayout";
            if (view instanceof C0228b) {
                C0229c behavior = ((C0228b) view).getBehavior();
                if (behavior == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                fVar.mo2101o(behavior);
                fVar.f1921b = true;
            } else {
                C0230d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0230d) cls.getAnnotation(C0230d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo2101o((C0229c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(dVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e(str, sb.toString(), e);
                    }
                }
                fVar.f1921b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f1898f = new ArrayList();
        this.f1899g = new DirectedAcyclicGraph<>();
        this.f1900h = new ArrayList();
        this.f1901i = new ArrayList();
        this.f1903k = new int[2];
        this.f1904l = new int[2];
        this.f1917y = new NestedScrollingParentHelper(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C0574c.f4358b, 0, C0573b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C0574c.f4358b, i, 0);
        }
        if (VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C0574c.f4358b, attributeSet, typedArray, 0, C0573b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C0574c.f4358b, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C0574c.f4359c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1907o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1907o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1907o;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f1914v = typedArray.getDrawable(C0574c.f4360d);
        typedArray.recycle();
        m1602X();
        super.setOnHierarchyChangeListener(new C0231e());
        if (ViewCompat.m5510A(this) == 0) {
            ViewCompat.m5591x0(this, 1);
        }
    }
}
