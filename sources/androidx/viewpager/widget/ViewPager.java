package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.OnApplyWindowInsetsListener;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.WindowInsetsCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p048i.p049a.AbsSavedState;

public class ViewPager extends ViewGroup {

    /* renamed from: a */
    static final int[] f3182a = {16842931};

    /* renamed from: b */
    private static final Comparator<C0492f> f3183b = new C0487a();

    /* renamed from: c */
    private static final Interpolator f3184c = new C0488b();

    /* renamed from: d */
    private static final C0501n f3185d = new C0501n();

    /* renamed from: A */
    private boolean f3186A;

    /* renamed from: B */
    private int f3187B = 1;

    /* renamed from: C */
    private boolean f3188C;

    /* renamed from: D */
    private boolean f3189D;

    /* renamed from: G */
    private int f3190G;

    /* renamed from: H */
    private int f3191H;

    /* renamed from: I */
    private int f3192I;

    /* renamed from: J */
    private float f3193J;

    /* renamed from: K */
    private float f3194K;

    /* renamed from: L */
    private float f3195L;

    /* renamed from: M */
    private float f3196M;

    /* renamed from: N */
    private int f3197N = -1;

    /* renamed from: O */
    private VelocityTracker f3198O;

    /* renamed from: P */
    private int f3199P;

    /* renamed from: Q */
    private int f3200Q;

    /* renamed from: R */
    private int f3201R;

    /* renamed from: S */
    private int f3202S;

    /* renamed from: T */
    private boolean f3203T;

    /* renamed from: U */
    private EdgeEffect f3204U;

    /* renamed from: V */
    private EdgeEffect f3205V;

    /* renamed from: W */
    private boolean f3206W = true;

    /* renamed from: a0 */
    private boolean f3207a0 = false;

    /* renamed from: b0 */
    private boolean f3208b0;

    /* renamed from: c0 */
    private int f3209c0;

    /* renamed from: d0 */
    private List<C0496j> f3210d0;

    /* renamed from: e */
    private int f3211e;

    /* renamed from: e0 */
    private C0496j f3212e0;

    /* renamed from: f */
    private final ArrayList<C0492f> f3213f = new ArrayList<>();

    /* renamed from: f0 */
    private C0496j f3214f0;

    /* renamed from: g */
    private final C0492f f3215g = new C0492f();

    /* renamed from: g0 */
    private List<C0495i> f3216g0;

    /* renamed from: h */
    private final Rect f3217h = new Rect();

    /* renamed from: h0 */
    private C0497k f3218h0;

    /* renamed from: i */
    PagerAdapter f3219i;

    /* renamed from: i0 */
    private int f3220i0;

    /* renamed from: j */
    int f3221j;

    /* renamed from: j0 */
    private int f3222j0;

    /* renamed from: k */
    private int f3223k = -1;

    /* renamed from: k0 */
    private ArrayList<View> f3224k0;

    /* renamed from: l */
    private Parcelable f3225l = null;

    /* renamed from: l0 */
    private final Runnable f3226l0 = new C0489c();

    /* renamed from: m */
    private ClassLoader f3227m = null;

    /* renamed from: m0 */
    private int f3228m0 = 0;

    /* renamed from: n */
    private Scroller f3229n;

    /* renamed from: o */
    private boolean f3230o;

    /* renamed from: p */
    private C0498l f3231p;

    /* renamed from: q */
    private int f3232q;

    /* renamed from: r */
    private Drawable f3233r;

    /* renamed from: s */
    private int f3234s;

    /* renamed from: t */
    private int f3235t;

    /* renamed from: u */
    private float f3236u = -3.4028235E38f;

    /* renamed from: v */
    private float f3237v = Float.MAX_VALUE;

    /* renamed from: w */
    private int f3238w;

    /* renamed from: x */
    private int f3239x;

    /* renamed from: y */
    private boolean f3240y;

    /* renamed from: z */
    private boolean f3241z;

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C0487a implements Comparator<C0492f> {
        C0487a() {
        }

        /* renamed from: a */
        public int compare(C0492f fVar, C0492f fVar2) {
            return fVar.f3246b - fVar2.f3246b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class C0488b implements Interpolator {
        C0488b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class C0489c implements Runnable {
        C0489c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo3984E();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C0490d implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        private final Rect f3243a = new Rect();

        C0490d() {
        }

        /* renamed from: a */
        public WindowInsetsCompat mo382a(View view, WindowInsetsCompat e0Var) {
            WindowInsetsCompat a0 = ViewCompat.m5545a0(view, e0Var);
            if (a0.mo4997l()) {
                return a0;
            }
            Rect rect = this.f3243a;
            rect.left = a0.mo4992g();
            rect.top = a0.mo4995i();
            rect.right = a0.mo4993h();
            rect.bottom = a0.mo4991f();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat h = ViewCompat.m5558h(ViewPager.this.getChildAt(i), a0);
                rect.left = Math.min(h.mo4992g(), rect.left);
                rect.top = Math.min(h.mo4995i(), rect.top);
                rect.right = Math.min(h.mo4993h(), rect.right);
                rect.bottom = Math.min(h.mo4991f(), rect.bottom);
            }
            return a0.mo4998m(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C0491e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C0492f {

        /* renamed from: a */
        Object f3245a;

        /* renamed from: b */
        int f3246b;

        /* renamed from: c */
        boolean f3247c;

        /* renamed from: d */
        float f3248d;

        /* renamed from: e */
        float f3249e;

        C0492f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C0493g extends LayoutParams {

        /* renamed from: a */
        public boolean f3250a;

        /* renamed from: b */
        public int f3251b;

        /* renamed from: c */
        float f3252c = 0.0f;

        /* renamed from: d */
        boolean f3253d;

        /* renamed from: e */
        int f3254e;

        /* renamed from: f */
        int f3255f;

        public C0493g() {
            super(-1, -1);
        }

        public C0493g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3182a);
            this.f3251b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    class C0494h extends AccessibilityDelegateCompat {
        C0494h() {
        }

        /* renamed from: n */
        private boolean m4109n() {
            PagerAdapter aVar = ViewPager.this.f3219i;
            return aVar != null && aVar.mo4064c() > 1;
        }

        /* renamed from: f */
        public void mo2301f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2301f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m4109n());
            if (accessibilityEvent.getEventType() == 4096) {
                PagerAdapter aVar = ViewPager.this.f3219i;
                if (aVar != null) {
                    accessibilityEvent.setItemCount(aVar.mo4064c());
                    accessibilityEvent.setFromIndex(ViewPager.this.f3221j);
                    accessibilityEvent.setToIndex(ViewPager.this.f3221j);
                }
            }
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            cVar.mo5051X(ViewPager.class.getName());
            cVar.mo5083q0(m4109n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.mo5054a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo5054a(8192);
            }
        }

        /* renamed from: j */
        public boolean mo2303j(View view, int i, Bundle bundle) {
            if (super.mo2303j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f3221j - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f3221j + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C0495i {
        /* renamed from: a */
        void mo4048a(ViewPager viewPager, PagerAdapter aVar, PagerAdapter aVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C0496j {
        /* renamed from: a */
        void mo4049a(int i, float f, int i2);

        /* renamed from: b */
        void mo4050b(int i);

        /* renamed from: c */
        void mo4051c(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public interface C0497k {
        /* renamed from: a */
        void mo4052a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    private class C0498l extends DataSetObserver {
        C0498l() {
        }

        public void onChanged() {
            ViewPager.this.mo4015h();
        }

        public void onInvalidated() {
            ViewPager.this.mo4015h();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C0499m extends AbsSavedState {
        public static final Creator<C0499m> CREATOR = new C0500a();

        /* renamed from: c */
        int f3258c;

        /* renamed from: d */
        Parcelable f3259d;

        /* renamed from: e */
        ClassLoader f3260e;

        /* renamed from: androidx.viewpager.widget.ViewPager$m$a */
        static class C0500a implements ClassLoaderCreator<C0499m> {
            C0500a() {
            }

            /* renamed from: a */
            public C0499m createFromParcel(Parcel parcel) {
                return new C0499m(parcel, null);
            }

            /* renamed from: b */
            public C0499m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0499m(parcel, classLoader);
            }

            /* renamed from: c */
            public C0499m[] newArray(int i) {
                return new C0499m[i];
            }
        }

        public C0499m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f3258c);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3258c);
            parcel.writeParcelable(this.f3259d, i);
        }

        C0499m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0499m.class.getClassLoader();
            }
            this.f3258c = parcel.readInt();
            this.f3259d = parcel.readParcelable(classLoader);
            this.f3260e = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    static class C0501n implements Comparator<View> {
        C0501n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C0493g gVar = (C0493g) view.getLayoutParams();
            C0493g gVar2 = (C0493g) view2.getLayoutParams();
            boolean z = gVar.f3250a;
            if (z == gVar2.f3250a) {
                return gVar.f3254e - gVar2.f3254e;
            }
            return z ? 1 : -1;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4041v();
    }

    /* renamed from: C */
    private boolean m4063C(int i) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.f3213f.size() != 0) {
            C0492f t = m4080t();
            int clientWidth = getClientWidth();
            int i2 = this.f3232q;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            float f2 = ((float) i2) / f;
            int i4 = t.f3246b;
            float f3 = ((((float) i) / f) - t.f3249e) / (t.f3248d + f2);
            int i5 = (int) (((float) i3) * f3);
            this.f3208b0 = false;
            mo4043y(i4, f3, i5);
            if (this.f3208b0) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.f3206W) {
            return false;
        } else {
            this.f3208b0 = false;
            mo4043y(0, 0.0f, 0);
            if (this.f3208b0) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: D */
    private boolean m4064D(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f3193J - f;
        this.f3193J = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f3236u * clientWidth;
        float f4 = this.f3237v * clientWidth;
        boolean z3 = false;
        C0492f fVar = (C0492f) this.f3213f.get(0);
        ArrayList<C0492f> arrayList = this.f3213f;
        C0492f fVar2 = (C0492f) arrayList.get(arrayList.size() - 1);
        if (fVar.f3246b != 0) {
            f3 = fVar.f3249e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f3246b != this.f3219i.mo4064c() - 1) {
            f4 = fVar2.f3249e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f3204U.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f3205V.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f3193J += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m4063C(i);
        return z3;
    }

    /* renamed from: G */
    private void m4065G(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f3213f.isEmpty()) {
            C0492f u = mo4040u(this.f3221j);
            int min = (int) ((u != null ? Math.min(u.f3249e, this.f3237v) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m4072g(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f3229n.isFinished()) {
            this.f3229n.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* renamed from: H */
    private void m4066H() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0493g) getChildAt(i).getLayoutParams()).f3250a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: K */
    private void m4067K(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: L */
    private boolean m4068L() {
        this.f3197N = -1;
        m4078o();
        this.f3204U.onRelease();
        this.f3205V.onRelease();
        return this.f3204U.isFinished() || this.f3205V.isFinished();
    }

    /* renamed from: M */
    private void m4069M(int i, boolean z, int i2, boolean z2) {
        C0492f u = mo4040u(i);
        int clientWidth = u != null ? (int) (((float) getClientWidth()) * Math.max(this.f3236u, Math.min(u.f3249e, this.f3237v))) : 0;
        if (z) {
            mo3991Q(clientWidth, 0, i2);
            if (z2) {
                m4075k(i);
                return;
            }
            return;
        }
        if (z2) {
            m4075k(i);
        }
        m4072g(false);
        scrollTo(clientWidth, 0);
        m4063C(clientWidth);
    }

    /* renamed from: R */
    private void m4070R() {
        if (this.f3222j0 != 0) {
            ArrayList<View> arrayList = this.f3224k0;
            if (arrayList == null) {
                this.f3224k0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f3224k0.add(getChildAt(i));
            }
            Collections.sort(this.f3224k0, f3185d);
        }
    }

    /* renamed from: e */
    private void m4071e(C0492f fVar, int i, C0492f fVar2) {
        int i2;
        int i3;
        C0492f fVar3;
        C0492f fVar4;
        int c = this.f3219i.mo4064c();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f3232q) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f3246b;
            int i5 = fVar.f3246b;
            if (i4 < i5) {
                float f2 = fVar2.f3249e + fVar2.f3248d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= fVar.f3246b && i7 < this.f3213f.size()) {
                    Object obj = this.f3213f.get(i7);
                    while (true) {
                        fVar4 = (C0492f) obj;
                        if (i6 > fVar4.f3246b && i7 < this.f3213f.size() - 1) {
                            i7++;
                            obj = this.f3213f.get(i7);
                        }
                    }
                    while (i6 < fVar4.f3246b) {
                        f2 += this.f3219i.mo4067f(i6) + f;
                        i6++;
                    }
                    fVar4.f3249e = f2;
                    f2 += fVar4.f3248d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f3213f.size() - 1;
                float f3 = fVar2.f3249e;
                while (true) {
                    i4--;
                    if (i4 < fVar.f3246b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f3213f.get(size);
                    while (true) {
                        fVar3 = (C0492f) obj2;
                        if (i4 < fVar3.f3246b && size > 0) {
                            size--;
                            obj2 = this.f3213f.get(size);
                        }
                    }
                    while (i4 > fVar3.f3246b) {
                        f3 -= this.f3219i.mo4067f(i4) + f;
                        i4--;
                    }
                    f3 -= fVar3.f3248d + f;
                    fVar3.f3249e = f3;
                }
            }
        }
        int size2 = this.f3213f.size();
        float f4 = fVar.f3249e;
        int i8 = fVar.f3246b;
        int i9 = i8 - 1;
        this.f3236u = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = c - 1;
        this.f3237v = i8 == i10 ? (fVar.f3248d + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C0492f fVar5 = (C0492f) this.f3213f.get(i11);
            while (true) {
                i3 = fVar5.f3246b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f3219i.mo4067f(i9) + f;
                i9--;
            }
            f4 -= fVar5.f3248d + f;
            fVar5.f3249e = f4;
            if (i3 == 0) {
                this.f3236u = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f3249e + fVar.f3248d + f;
        int i12 = fVar.f3246b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C0492f fVar6 = (C0492f) this.f3213f.get(i13);
            while (true) {
                i2 = fVar6.f3246b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f3219i.mo4067f(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f3237v = (fVar6.f3248d + f5) - 1.0f;
            }
            fVar6.f3249e = f5;
            f5 += fVar6.f3248d + f;
            i13++;
            i12++;
        }
        this.f3207a0 = false;
    }

    /* renamed from: g */
    private void m4072g(boolean z) {
        boolean z2 = this.f3228m0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f3229n.isFinished()) {
                this.f3229n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3229n.getCurrX();
                int currY = this.f3229n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m4063C(currX);
                    }
                }
            }
        }
        this.f3186A = false;
        for (int i = 0; i < this.f3213f.size(); i++) {
            C0492f fVar = (C0492f) this.f3213f.get(i);
            if (fVar.f3247c) {
                fVar.f3247c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ViewCompat.m5557g0(this, this.f3226l0);
        } else {
            this.f3226l0.run();
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private int m4073i(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f3201R || Math.abs(i2) <= this.f3199P) {
            i += (int) (f + (i >= this.f3221j ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f3213f.size() <= 0) {
            return i;
        }
        C0492f fVar = (C0492f) this.f3213f.get(0);
        ArrayList<C0492f> arrayList = this.f3213f;
        return Math.max(fVar.f3246b, Math.min(i, ((C0492f) arrayList.get(arrayList.size() - 1)).f3246b));
    }

    /* renamed from: j */
    private void m4074j(int i, float f, int i2) {
        C0496j jVar = this.f3212e0;
        if (jVar != null) {
            jVar.mo4049a(i, f, i2);
        }
        List<C0496j> list = this.f3210d0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0496j jVar2 = (C0496j) this.f3210d0.get(i3);
                if (jVar2 != null) {
                    jVar2.mo4049a(i, f, i2);
                }
            }
        }
        C0496j jVar3 = this.f3214f0;
        if (jVar3 != null) {
            jVar3.mo4049a(i, f, i2);
        }
    }

    /* renamed from: k */
    private void m4075k(int i) {
        C0496j jVar = this.f3212e0;
        if (jVar != null) {
            jVar.mo4051c(i);
        }
        List<C0496j> list = this.f3210d0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0496j jVar2 = (C0496j) this.f3210d0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo4051c(i);
                }
            }
        }
        C0496j jVar3 = this.f3214f0;
        if (jVar3 != null) {
            jVar3.mo4051c(i);
        }
    }

    /* renamed from: l */
    private void m4076l(int i) {
        C0496j jVar = this.f3212e0;
        if (jVar != null) {
            jVar.mo4050b(i);
        }
        List<C0496j> list = this.f3210d0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0496j jVar2 = (C0496j) this.f3210d0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo4050b(i);
                }
            }
        }
        C0496j jVar3 = this.f3214f0;
        if (jVar3 != null) {
            jVar3.mo4050b(i);
        }
    }

    /* renamed from: n */
    private void m4077n(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f3220i0 : 0, null);
        }
    }

    /* renamed from: o */
    private void m4078o() {
        this.f3188C = false;
        this.f3189D = false;
        VelocityTracker velocityTracker = this.f3198O;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3198O = null;
        }
    }

    /* renamed from: q */
    private Rect m4079q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f3241z != z) {
            this.f3241z = z;
        }
    }

    /* renamed from: t */
    private C0492f m4080t() {
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f3232q) / ((float) clientWidth) : 0.0f;
        C0492f fVar = null;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        boolean z = true;
        while (i2 < this.f3213f.size()) {
            C0492f fVar2 = (C0492f) this.f3213f.get(i2);
            if (!z) {
                int i3 = i + 1;
                if (fVar2.f3246b != i3) {
                    fVar2 = this.f3215g;
                    fVar2.f3249e = f + f3 + f2;
                    fVar2.f3246b = i3;
                    fVar2.f3248d = this.f3219i.mo4067f(i3);
                    i2--;
                }
            }
            f = fVar2.f3249e;
            float f4 = fVar2.f3248d + f + f2;
            if (!z && scrollX < f) {
                return fVar;
            }
            if (scrollX < f4 || i2 == this.f3213f.size() - 1) {
                return fVar2;
            }
            i = fVar2.f3246b;
            f3 = fVar2.f3248d;
            i2++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    /* renamed from: w */
    private static boolean m4081w(View view) {
        return view.getClass().getAnnotation(C0491e.class) != null;
    }

    /* renamed from: x */
    private boolean m4082x(float f, float f2) {
        return (f < ((float) this.f3191H) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f3191H)) && f2 < 0.0f);
    }

    /* renamed from: z */
    private void m4083z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3197N) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3193J = motionEvent.getX(i);
            this.f3197N = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3198O;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public boolean mo3982A() {
        int i = this.f3221j;
        if (i <= 0) {
            return false;
        }
        mo3988N(i - 1, true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public boolean mo3983B() {
        PagerAdapter aVar = this.f3219i;
        if (aVar == null || this.f3221j >= aVar.mo4064c() - 1) {
            return false;
        }
        mo3988N(this.f3221j + 1, true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public void mo3984E() {
        mo3985F(this.f3221j);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3985F(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f3221j
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo4040u(r2)
            r0.f3221j = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f3219i
            if (r1 != 0) goto L_0x0018
            r17.m4070R()
            return
        L_0x0018:
            boolean r1 = r0.f3186A
            if (r1 == 0) goto L_0x0020
            r17.m4070R()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f3219i
            r1.mo2909n(r0)
            int r1 = r0.f3187B
            int r4 = r0.f3221j
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f3219i
            int r6 = r6.mo4064c()
            int r7 = r6 + -1
            int r8 = r0.f3221j
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f3211e
            if (r6 != r7) goto L_0x020e
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f3213f
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f3213f
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C0492f) r8
            int r9 = r8.f3246b
            int r10 = r0.f3221j
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f3221j
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo3992a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019b
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f3213f
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C0492f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f3248d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f3221j
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r3 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fd
        L_0x00a8:
            int r5 = r11.f3246b
            if (r3 != r5) goto L_0x00f9
            boolean r5 = r11.f3247c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f3219i
            java.lang.Object r11 = r11.f3245a
            r5.mo2902a(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.f3246b
            if (r3 != r5) goto L_0x00e1
            float r5 = r11.f3248d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo3992a(r3, r5)
            float r5 = r5.f3248d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fd:
            float r3 = r8.f3248d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r10 = 0
            goto L_0x0123
        L_0x011b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0123:
            int r11 = r0.f3221j
        L_0x0125:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x018f
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0159
            if (r11 <= r1) goto L_0x0159
            if (r5 != 0) goto L_0x0132
            goto L_0x018f
        L_0x0132:
            int r12 = r5.f3246b
            if (r11 != r12) goto L_0x018e
            boolean r12 = r5.f3247c
            if (r12 != 0) goto L_0x018e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f3213f
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f3219i
            java.lang.Object r5 = r5.f3245a
            r12.mo2902a(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
            goto L_0x018e
        L_0x0157:
            r5 = 0
            goto L_0x018e
        L_0x0159:
            if (r5 == 0) goto L_0x0175
            int r12 = r5.f3246b
            if (r11 != r12) goto L_0x0175
            float r5 = r5.f3248d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
            goto L_0x018e
        L_0x0175:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo3992a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f3248d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
        L_0x018e:
            goto L_0x0125
        L_0x018f:
            r0.m4071e(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f3219i
            int r2 = r0.f3221j
            java.lang.Object r3 = r8.f3245a
            r1.mo2908l(r0, r2, r3)
        L_0x019b:
            androidx.viewpager.widget.a r1 = r0.f3219i
            r1.mo2903b(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a5:
            if (r2 >= r1) goto L_0x01ce
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.C0493g) r4
            r4.f3255f = r2
            boolean r5 = r4.f3250a
            if (r5 != 0) goto L_0x01cb
            float r5 = r4.f3252c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cb
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo4031s(r3)
            if (r3 == 0) goto L_0x01cb
            float r5 = r3.f3248d
            r4.f3252c = r5
            int r3 = r3.f3246b
            r4.f3254e = r3
        L_0x01cb:
            int r2 = r2 + 1
            goto L_0x01a5
        L_0x01ce:
            r17.m4070R()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e2
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo4029r(r1)
            goto L_0x01e3
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            if (r3 == 0) goto L_0x01eb
            int r1 = r3.f3246b
            int r2 = r0.f3221j
            if (r1 == r2) goto L_0x020d
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020d
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo4031s(r1)
            if (r2 == 0) goto L_0x020a
            int r2 = r2.f3246b
            int r3 = r0.f3221j
            if (r2 != r3) goto L_0x020a
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            int r5 = r5 + 1
            goto L_0x01ec
        L_0x020d:
            return
        L_0x020e:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021b }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021b }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021b }
            goto L_0x0223
        L_0x021b:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0223:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f3211e
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f3219i
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x0267
        L_0x0266:
            throw r2
        L_0x0267:
            goto L_0x0266
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo3985F(int):void");
    }

    /* renamed from: I */
    public void mo3986I(C0495i iVar) {
        List<C0495i> list = this.f3216g0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: J */
    public void mo3987J(C0496j jVar) {
        List<C0496j> list = this.f3210d0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* renamed from: N */
    public void mo3988N(int i, boolean z) {
        this.f3186A = false;
        mo3989O(i, z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public void mo3989O(int i, boolean z, boolean z2) {
        mo3990P(i, z, z2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public void mo3990P(int i, boolean z, boolean z2, int i2) {
        PagerAdapter aVar = this.f3219i;
        boolean z3 = false;
        if (aVar == null || aVar.mo4064c() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f3221j != i || this.f3213f.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f3219i.mo4064c()) {
                i = this.f3219i.mo4064c() - 1;
            }
            int i3 = this.f3187B;
            int i4 = this.f3221j;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f3213f.size(); i5++) {
                    ((C0492f) this.f3213f.get(i5)).f3247c = true;
                }
            }
            if (this.f3221j != i) {
                z3 = true;
            }
            if (this.f3206W) {
                this.f3221j = i;
                if (z3) {
                    m4075k(i);
                }
                requestLayout();
            } else {
                mo3985F(i);
                m4069M(i, z, i2, z3);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public void mo3991Q(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f3229n;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f3230o ? this.f3229n.getCurrX() : this.f3229n.getStartX();
            this.f3229n.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            m4072g(false);
            mo3984E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float m = f2 + (mo4016m(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(m / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f3219i.mo4067f(this.f3221j)) + ((float) this.f3232q))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f3230o = false;
        this.f3229n.startScroll(i6, scrollY, i7, i8, min);
        ViewCompat.m5555f0(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0492f mo3992a(int i, int i2) {
        C0492f fVar = new C0492f();
        fVar.f3246b = i;
        fVar.f3245a = this.f3219i.mo2904g(this, i);
        fVar.f3248d = this.f3219i.mo4067f(i);
        if (i2 < 0 || i2 >= this.f3213f.size()) {
            this.f3213f.add(fVar);
        } else {
            this.f3213f.add(i2, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0492f s = mo4031s(childAt);
                    if (s != null && s.f3246b == this.f3221j) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0492f s = mo4031s(childAt);
                if (s != null && s.f3246b == this.f3221j) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0493g gVar = (C0493g) layoutParams;
        boolean w = gVar.f3250a | m4081w(view);
        gVar.f3250a = w;
        if (!this.f3240y) {
            super.addView(view, i, layoutParams);
        } else if (!w) {
            gVar.f3253d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void mo3996b(C0495i iVar) {
        if (this.f3216g0 == null) {
            this.f3216g0 = new ArrayList();
        }
        this.f3216g0.add(iVar);
    }

    /* renamed from: c */
    public void mo3997c(C0496j jVar) {
        if (this.f3210d0 == null) {
            this.f3210d0 = new ArrayList();
        }
        this.f3210d0.add(jVar);
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.f3219i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f3236u))) {
                z = true;
            }
            return z;
        }
        if (i > 0 && scrollX < ((int) (((float) clientWidth) * this.f3237v))) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0493g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f3230o = true;
        if (this.f3229n.isFinished() || !this.f3229n.computeScrollOffset()) {
            m4072g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3229n.getCurrX();
        int currY = this.f3229n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m4063C(currX)) {
                this.f3229n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.m5555f0(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4001d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00ba
            if (r3 == r0) goto L_0x00ba
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f3217h
            android.graphics.Rect r1 = r6.m4079q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3217h
            android.graphics.Rect r2 = r6.m4079q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.mo3982A()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00cd
        L_0x009a:
            if (r7 != r4) goto L_0x00cd
            android.graphics.Rect r1 = r6.f3217h
            android.graphics.Rect r1 = r6.m4079q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3217h
            android.graphics.Rect r2 = r6.m4079q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b5
            if (r1 > r2) goto L_0x00b5
            boolean r0 = r6.mo3983B()
            goto L_0x0098
        L_0x00b5:
            boolean r0 = r3.requestFocus()
            goto L_0x0098
        L_0x00ba:
            if (r7 == r5) goto L_0x00c9
            if (r7 != r1) goto L_0x00bf
            goto L_0x00c9
        L_0x00bf:
            if (r7 == r4) goto L_0x00c4
            r0 = 2
            if (r7 != r0) goto L_0x00cd
        L_0x00c4:
            boolean r2 = r6.mo3983B()
            goto L_0x00cd
        L_0x00c9:
            boolean r2 = r6.mo3982A()
        L_0x00cd:
            if (r2 == 0) goto L_0x00d6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo4001d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo4028p(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0492f s = mo4031s(childAt);
                if (s != null && s.f3246b == this.f3221j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0.mo4064c() > 1) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r0 != r2) goto L_0x0018
            androidx.viewpager.widget.a r0 = r7.f3219i
            if (r0 == 0) goto L_0x0018
            int r0 = r0.mo4064c()
            if (r0 <= r2) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            android.widget.EdgeEffect r8 = r7.f3204U
            r8.finish()
            android.widget.EdgeEffect r8 = r7.f3205V
            r8.finish()
            goto L_0x00a9
        L_0x0024:
            android.widget.EdgeEffect r0 = r7.f3204U
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0065
            int r0 = r8.save()
            int r2 = r7.getHeight()
            int r3 = r7.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r7.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r7.getWidth()
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = -r2
            int r5 = r7.getPaddingTop()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r5 = r7.f3236u
            float r6 = (float) r3
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f3204U
            r4.setSize(r2, r3)
            android.widget.EdgeEffect r2 = r7.f3204U
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x0065:
            android.widget.EdgeEffect r0 = r7.f3205V
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00a9
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.f3237v
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f3205V
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.f3205V
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            p010b.p034g.p043k.ViewCompat.m5555f0(r7)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3233r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo4006f(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo4006f(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C0493g();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.f3219i;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f3222j0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0493g) ((View) this.f3224k0.get(i2)).getLayoutParams()).f3255f;
    }

    public int getCurrentItem() {
        return this.f3221j;
    }

    public int getOffscreenPageLimit() {
        return this.f3187B;
    }

    public int getPageMargin() {
        return this.f3232q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4015h() {
        int c = this.f3219i.mo4064c();
        this.f3211e = c;
        boolean z = this.f3213f.size() < (this.f3187B * 2) + 1 && this.f3213f.size() < c;
        int i = this.f3221j;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f3213f.size()) {
            C0492f fVar = (C0492f) this.f3213f.get(i2);
            int d = this.f3219i.mo4065d(fVar.f3245a);
            if (d != -1) {
                if (d == -2) {
                    this.f3213f.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f3219i.mo2909n(this);
                        z2 = true;
                    }
                    this.f3219i.mo2902a(this, fVar.f3246b, fVar.f3245a);
                    int i3 = this.f3221j;
                    if (i3 == fVar.f3246b) {
                        i = Math.max(0, Math.min(i3, c - 1));
                    }
                } else {
                    int i4 = fVar.f3246b;
                    if (i4 != d) {
                        if (i4 == this.f3221j) {
                            i = d;
                        }
                        fVar.f3246b = d;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f3219i.mo2903b(this);
        }
        Collections.sort(this.f3213f, f3183b);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0493g gVar = (C0493g) getChildAt(i5).getLayoutParams();
                if (!gVar.f3250a) {
                    gVar.f3252c = 0.0f;
                }
            }
            mo3989O(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public float mo4016m(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3206W = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3226l0);
        Scroller scroller = this.f3229n;
        if (scroller != null && !scroller.isFinished()) {
            this.f3229n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f3232q
            if (r1 <= 0) goto L_0x00aa
            android.graphics.drawable.Drawable r1 = r0.f3233r
            if (r1 == 0) goto L_0x00aa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f3213f
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00aa
            androidx.viewpager.widget.a r1 = r0.f3219i
            if (r1 == 0) goto L_0x00aa
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f3232q
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
            float r7 = r5.f3249e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f3213f
            int r8 = r8.size()
            int r9 = r5.f3246b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.f3213f
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.C0492f) r10
            int r10 = r10.f3246b
        L_0x0045:
            if (r9 >= r10) goto L_0x00aa
        L_0x0047:
            int r11 = r5.f3246b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3213f
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0492f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.f3249e
            float r11 = r5.f3248d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0071
        L_0x0065:
            androidx.viewpager.widget.a r11 = r0.f3219i
            float r11 = r11.mo4067f(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x0071:
            int r11 = r0.f3232q
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            android.graphics.drawable.Drawable r11 = r0.f3233r
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f3234s
            int r15 = r0.f3232q
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f3235t
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f3233r
            r11 = r18
            r3.draw(r11)
            goto L_0x009d
        L_0x0099:
            r11 = r18
            r16 = r3
        L_0x009d:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m4068L();
            return false;
        }
        if (action != 0) {
            if (this.f3188C) {
                return true;
            }
            if (this.f3189D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f3195L = x;
            this.f3193J = x;
            float y = motionEvent.getY();
            this.f3196M = y;
            this.f3194K = y;
            this.f3197N = motionEvent2.getPointerId(0);
            this.f3189D = false;
            this.f3230o = true;
            this.f3229n.computeScrollOffset();
            if (this.f3228m0 != 2 || Math.abs(this.f3229n.getFinalX() - this.f3229n.getCurrX()) <= this.f3202S) {
                m4072g(false);
                this.f3188C = false;
            } else {
                this.f3229n.abortAnimation();
                this.f3186A = false;
                mo3984E();
                this.f3188C = true;
                m4067K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f3197N;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f3193J;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f3196M);
                if (f != 0.0f && !m4082x(this.f3193J, f)) {
                    if (mo4006f(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f3193J = x2;
                        this.f3194K = y2;
                        this.f3189D = true;
                        return false;
                    }
                }
                int i2 = this.f3192I;
                if (abs > ((float) i2) && abs * 0.5f > abs2) {
                    this.f3188C = true;
                    m4067K(true);
                    setScrollState(1);
                    this.f3193J = f > 0.0f ? this.f3195L + ((float) this.f3192I) : this.f3195L - ((float) this.f3192I);
                    this.f3194K = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i2)) {
                    this.f3189D = true;
                }
                if (this.f3188C && m4064D(x2)) {
                    ViewCompat.m5555f0(this);
                }
            }
        } else if (action == 6) {
            m4083z(motionEvent);
        }
        if (this.f3198O == null) {
            this.f3198O = VelocityTracker.obtain();
        }
        this.f3198O.addMovement(motionEvent2);
        return this.f3188C;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r12 = (androidx.viewpager.widget.ViewPager.C0493g) r12
            boolean r14 = r12.f3250a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f3251b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0493g) r9
            boolean r10 = r9.f3250a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.mo4031s(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f3249e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f3253d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f3253d = r14
            float r9 = r9.f3252c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f3234s = r5
            int r3 = r3 - r7
            r0.f3235t = r3
            r0.f3209c0 = r11
            boolean r1 = r0.f3206W
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f3221j
            r2 = 0
            r0.m4069M(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f3206W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f3190G
            int r15 = java.lang.Math.min(r15, r1)
            r13.f3191H = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r3 = (androidx.viewpager.widget.ViewPager.C0493g) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f3250a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f3251b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r13.f3238w = r1
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f3239x = r15
            r13.f3240y = r4
            r13.mo3984E()
            r13.f3240y = r0
            int r15 = r13.getChildCount()
        L_0x00c9:
            if (r0 >= r15) goto L_0x00f3
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00f0
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r2 = (androidx.viewpager.widget.ViewPager.C0493g) r2
            if (r2 == 0) goto L_0x00e1
            boolean r4 = r2.f3250a
            if (r4 != 0) goto L_0x00f0
        L_0x00e1:
            float r4 = (float) r14
            float r2 = r2.f3252c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f3239x
            r1.measure(r2, r4)
        L_0x00f0:
            int r0 = r0 + 1
            goto L_0x00c9
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C0492f s = mo4031s(childAt);
                if (s != null && s.f3246b == this.f3221j && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0499m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0499m mVar = (C0499m) parcelable;
        super.onRestoreInstanceState(mVar.mo5193l());
        PagerAdapter aVar = this.f3219i;
        if (aVar != null) {
            aVar.mo2906j(mVar.f3259d, mVar.f3260e);
            mo3989O(mVar.f3258c, false, true);
        } else {
            this.f3223k = mVar.f3258c;
            this.f3225l = mVar.f3259d;
            this.f3227m = mVar.f3260e;
        }
    }

    public Parcelable onSaveInstanceState() {
        C0499m mVar = new C0499m(super.onSaveInstanceState());
        mVar.f3258c = this.f3221j;
        PagerAdapter aVar = this.f3219i;
        if (aVar != null) {
            mVar.f3259d = aVar.mo2907k();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f3232q;
            m4065G(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3203T) {
            return true;
        }
        boolean z = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        PagerAdapter aVar = this.f3219i;
        if (aVar == null || aVar.mo4064c() == 0) {
            return false;
        }
        if (this.f3198O == null) {
            this.f3198O = VelocityTracker.obtain();
        }
        this.f3198O.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f3229n.abortAnimation();
            this.f3186A = false;
            mo3984E();
            float x = motionEvent.getX();
            this.f3195L = x;
            this.f3193J = x;
            float y = motionEvent.getY();
            this.f3196M = y;
            this.f3194K = y;
            this.f3197N = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f3188C) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3197N);
                    if (findPointerIndex == -1) {
                        z = m4068L();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f3193J);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f3194K);
                        if (abs > ((float) this.f3192I) && abs > abs2) {
                            this.f3188C = true;
                            m4067K(true);
                            float f = this.f3195L;
                            this.f3193J = x2 - f > 0.0f ? f + ((float) this.f3192I) : f - ((float) this.f3192I);
                            this.f3194K = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f3188C) {
                    z = false | m4064D(motionEvent.getX(motionEvent.findPointerIndex(this.f3197N)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f3193J = motionEvent.getX(actionIndex);
                    this.f3197N = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m4083z(motionEvent);
                    this.f3193J = motionEvent.getX(motionEvent.findPointerIndex(this.f3197N));
                }
            } else if (this.f3188C) {
                m4069M(this.f3221j, true, 0, false);
                z = m4068L();
            }
        } else if (this.f3188C) {
            VelocityTracker velocityTracker = this.f3198O;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f3200Q);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f3197N);
            this.f3186A = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0492f t = m4080t();
            float f2 = (float) clientWidth;
            mo3990P(m4073i(t.f3246b, ((((float) scrollX) / f2) - t.f3249e) / (t.f3248d + (((float) this.f3232q) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3197N)) - this.f3195L)), true, true, xVelocity);
            z = m4068L();
        }
        if (z) {
            ViewCompat.m5555f0(this);
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo4028p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo4001d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo4001d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo3983B();
                } else {
                    return mo4001d(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo3982A();
            } else {
                return mo4001d(17);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public C0492f mo4029r(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo4031s(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    public void removeView(View view) {
        if (this.f3240y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public C0492f mo4031s(View view) {
        for (int i = 0; i < this.f3213f.size(); i++) {
            C0492f fVar = (C0492f) this.f3213f.get(i);
            if (this.f3219i.mo2905h(view, fVar.f3245a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(PagerAdapter aVar) {
        PagerAdapter aVar2 = this.f3219i;
        if (aVar2 != null) {
            aVar2.mo4069m(null);
            this.f3219i.mo2909n(this);
            for (int i = 0; i < this.f3213f.size(); i++) {
                C0492f fVar = (C0492f) this.f3213f.get(i);
                this.f3219i.mo2902a(this, fVar.f3246b, fVar.f3245a);
            }
            this.f3219i.mo2903b(this);
            this.f3213f.clear();
            m4066H();
            this.f3221j = 0;
            scrollTo(0, 0);
        }
        PagerAdapter aVar3 = this.f3219i;
        this.f3219i = aVar;
        this.f3211e = 0;
        if (aVar != null) {
            if (this.f3231p == null) {
                this.f3231p = new C0498l();
            }
            this.f3219i.mo4069m(this.f3231p);
            this.f3186A = false;
            boolean z = this.f3206W;
            this.f3206W = true;
            this.f3211e = this.f3219i.mo4064c();
            if (this.f3223k >= 0) {
                this.f3219i.mo2906j(this.f3225l, this.f3227m);
                mo3989O(this.f3223k, false, true);
                this.f3223k = -1;
                this.f3225l = null;
                this.f3227m = null;
            } else if (!z) {
                mo3984E();
            } else {
                requestLayout();
            }
        }
        List<C0495i> list = this.f3216g0;
        if (list != null && !list.isEmpty()) {
            int size = this.f3216g0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0495i) this.f3216g0.get(i2)).mo4048a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f3186A = false;
        mo3989O(i, !this.f3206W, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.f3187B) {
            this.f3187B = i;
            mo3984E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0496j jVar) {
        this.f3212e0 = jVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f3232q;
        this.f3232q = i;
        int width = getWidth();
        m4065G(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3233r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (this.f3228m0 != i) {
            this.f3228m0 = i;
            if (this.f3218h0 != null) {
                m4077n(i != 0);
            }
            m4076l(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public C0492f mo4040u(int i) {
        for (int i2 = 0; i2 < this.f3213f.size(); i2++) {
            C0492f fVar = (C0492f) this.f3213f.get(i2);
            if (fVar.f3246b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo4041v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3229n = new Scroller(context, f3184c);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3192I = viewConfiguration.getScaledPagingTouchSlop();
        this.f3199P = (int) (400.0f * f);
        this.f3200Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3204U = new EdgeEffect(context);
        this.f3205V = new EdgeEffect(context);
        this.f3201R = (int) (25.0f * f);
        this.f3202S = (int) (2.0f * f);
        this.f3190G = (int) (f * 16.0f);
        ViewCompat.m5573o0(this, new C0494h());
        if (ViewCompat.m5510A(this) == 0) {
            ViewCompat.m5591x0(this, 1);
        }
        ViewCompat.m5595z0(this, new C0490d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3233r;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4043y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f3209c0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0493g) r9
            boolean r10 = r9.f3250a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f3251b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.m4074j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f3218h0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C0493g) r0
            boolean r0 = r0.f3250a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f3218h0
            r3.mo4052a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f3208b0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo4043y(int, float, int):void");
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0493g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(ContextCompat.m1758d(getContext(), i));
    }
}
