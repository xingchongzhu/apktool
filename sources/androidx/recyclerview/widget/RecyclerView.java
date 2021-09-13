package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.C0475a;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010b.p034g.p039g.TraceCompat;
import p010b.p034g.p042j.Preconditions;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.MotionEventCompat;
import p010b.p034g.p043k.NestedScrollingChild;
import p010b.p034g.p043k.NestedScrollingChildHelper;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewConfigurationCompat;
import p010b.p034g.p043k.p044f0.AccessibilityEventCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0635b;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0636c;
import p010b.p048i.p049a.AbsSavedState;
import p010b.p060n.C0694a;
import p010b.p060n.C0695b;
import p010b.p060n.C0696c;

public class RecyclerView extends ViewGroup implements NestedScrollingChild {

    /* renamed from: a */
    private static final int[] f2731a = {16843830};

    /* renamed from: b */
    static final boolean f2732b;

    /* renamed from: c */
    static final boolean f2733c;

    /* renamed from: d */
    static final boolean f2734d;

    /* renamed from: e */
    static final boolean f2735e;

    /* renamed from: f */
    private static final boolean f2736f;

    /* renamed from: g */
    private static final boolean f2737g;

    /* renamed from: h */
    private static final Class<?>[] f2738h;

    /* renamed from: i */
    static final Interpolator f2739i = new C0404c();

    /* renamed from: A */
    boolean f2740A;

    /* renamed from: A0 */
    private C0413j f2741A0;

    /* renamed from: B */
    boolean f2742B;

    /* renamed from: B0 */
    private final int[] f2743B0;

    /* renamed from: C */
    boolean f2744C;

    /* renamed from: C0 */
    private NestedScrollingChildHelper f2745C0;

    /* renamed from: D */
    boolean f2746D;

    /* renamed from: D0 */
    private final int[] f2747D0;

    /* renamed from: E0 */
    private final int[] f2748E0;

    /* renamed from: F0 */
    final int[] f2749F0;

    /* renamed from: G */
    private int f2750G;

    /* renamed from: G0 */
    final List<C0407d0> f2751G0;

    /* renamed from: H */
    boolean f2752H;

    /* renamed from: H0 */
    private Runnable f2753H0;

    /* renamed from: I */
    boolean f2754I;

    /* renamed from: I0 */
    private final C0480b f2755I0;

    /* renamed from: J */
    private boolean f2756J;

    /* renamed from: K */
    private int f2757K;

    /* renamed from: L */
    boolean f2758L;

    /* renamed from: M */
    private final AccessibilityManager f2759M;

    /* renamed from: N */
    private List<C0427q> f2760N;

    /* renamed from: O */
    boolean f2761O;

    /* renamed from: P */
    boolean f2762P;

    /* renamed from: Q */
    private int f2763Q;

    /* renamed from: R */
    private int f2764R;

    /* renamed from: S */
    private C0414k f2765S;

    /* renamed from: T */
    private EdgeEffect f2766T;

    /* renamed from: U */
    private EdgeEffect f2767U;

    /* renamed from: V */
    private EdgeEffect f2768V;

    /* renamed from: W */
    private EdgeEffect f2769W;

    /* renamed from: a0 */
    C0415l f2770a0;

    /* renamed from: b0 */
    private int f2771b0;

    /* renamed from: c0 */
    private int f2772c0;

    /* renamed from: d0 */
    private VelocityTracker f2773d0;

    /* renamed from: e0 */
    private int f2774e0;

    /* renamed from: f0 */
    private int f2775f0;

    /* renamed from: g0 */
    private int f2776g0;

    /* renamed from: h0 */
    private int f2777h0;

    /* renamed from: i0 */
    private int f2778i0;

    /* renamed from: j */
    private final C0435x f2779j;

    /* renamed from: j0 */
    private C0428r f2780j0;

    /* renamed from: k */
    final C0433v f2781k;

    /* renamed from: k0 */
    private final int f2782k0;

    /* renamed from: l */
    private C0436y f2783l;

    /* renamed from: l0 */
    private final int f2784l0;

    /* renamed from: m */
    AdapterHelper f2785m;

    /* renamed from: m0 */
    private float f2786m0;

    /* renamed from: n */
    ChildHelper f2787n;

    /* renamed from: n0 */
    private float f2788n0;

    /* renamed from: o */
    final ViewInfoStore f2789o;

    /* renamed from: o0 */
    private boolean f2790o0;

    /* renamed from: p */
    boolean f2791p;

    /* renamed from: p0 */
    final C0405c0 f2792p0;

    /* renamed from: q */
    final Runnable f2793q;

    /* renamed from: q0 */
    GapWorker f2794q0;

    /* renamed from: r */
    final Rect f2795r;

    /* renamed from: r0 */
    C0469b f2796r0;

    /* renamed from: s */
    private final Rect f2797s;

    /* renamed from: s0 */
    final C0401a0 f2798s0;

    /* renamed from: t */
    final RectF f2799t;

    /* renamed from: t0 */
    private C0430t f2800t0;

    /* renamed from: u */
    C0410g f2801u;

    /* renamed from: u0 */
    private List<C0430t> f2802u0;

    /* renamed from: v */
    C0421o f2803v;

    /* renamed from: v0 */
    boolean f2804v0;

    /* renamed from: w */
    C0434w f2805w;

    /* renamed from: w0 */
    boolean f2806w0;

    /* renamed from: x */
    final ArrayList<C0420n> f2807x;

    /* renamed from: x0 */
    private C0417b f2808x0;

    /* renamed from: y */
    private final ArrayList<C0429s> f2809y;

    /* renamed from: y0 */
    boolean f2810y0;

    /* renamed from: z */
    private C0429s f2811z;

    /* renamed from: z0 */
    RecyclerViewAccessibilityDelegate f2812z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C0400a implements Runnable {
        C0400a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2746D && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f2740A) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f2754I) {
                    recyclerView2.f2752H = true;
                } else {
                    recyclerView2.mo3319v();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0401a0 {

        /* renamed from: a */
        int f2814a = -1;

        /* renamed from: b */
        private SparseArray<Object> f2815b;

        /* renamed from: c */
        int f2816c = 0;

        /* renamed from: d */
        int f2817d = 0;

        /* renamed from: e */
        int f2818e = 1;

        /* renamed from: f */
        int f2819f = 0;

        /* renamed from: g */
        boolean f2820g = false;

        /* renamed from: h */
        boolean f2821h = false;

        /* renamed from: i */
        boolean f2822i = false;

        /* renamed from: j */
        boolean f2823j = false;

        /* renamed from: k */
        boolean f2824k = false;

        /* renamed from: l */
        boolean f2825l = false;

        /* renamed from: m */
        int f2826m;

        /* renamed from: n */
        long f2827n;

        /* renamed from: o */
        int f2828o;

        /* renamed from: p */
        int f2829p;

        /* renamed from: q */
        int f2830q;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3330a(int i) {
            if ((this.f2818e & i) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f2818e));
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: b */
        public int mo3331b() {
            return this.f2821h ? this.f2816c - this.f2817d : this.f2819f;
        }

        /* renamed from: c */
        public int mo3332c() {
            return this.f2814a;
        }

        /* renamed from: d */
        public boolean mo3333d() {
            return this.f2814a != -1;
        }

        /* renamed from: e */
        public boolean mo3334e() {
            return this.f2821h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo3335f(C0410g gVar) {
            this.f2818e = 1;
            this.f2819f = gVar.mo3409c();
            this.f2821h = false;
            this.f2822i = false;
            this.f2823j = false;
        }

        /* renamed from: g */
        public boolean mo3336g() {
            return this.f2825l;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.f2814a);
            sb.append(", mData=");
            sb.append(this.f2815b);
            sb.append(", mItemCount=");
            sb.append(this.f2819f);
            sb.append(", mIsMeasuring=");
            sb.append(this.f2823j);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f2816c);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f2817d);
            sb.append(", mStructureChanged=");
            sb.append(this.f2820g);
            sb.append(", mInPreLayout=");
            sb.append(this.f2821h);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f2824k);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f2825l);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C0402b implements Runnable {
        C0402b() {
        }

        public void run() {
            C0415l lVar = RecyclerView.this.f2770a0;
            if (lVar != null) {
                lVar.mo3462u();
            }
            RecyclerView.this.f2810y0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C0403b0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C0404c implements Interpolator {
        C0404c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C0405c0 implements Runnable {

        /* renamed from: a */
        private int f2832a;

        /* renamed from: b */
        private int f2833b;

        /* renamed from: c */
        OverScroller f2834c;

        /* renamed from: d */
        Interpolator f2835d;

        /* renamed from: e */
        private boolean f2836e = false;

        /* renamed from: f */
        private boolean f2837f = false;

        C0405c0() {
            Interpolator interpolator = RecyclerView.f2739i;
            this.f2835d = interpolator;
            this.f2834c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m3123a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float b = f2 + (m3124b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        private float m3124b(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: d */
        private void m3125d() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.m5557g0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void mo3340c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f2833b = 0;
            this.f2832a = 0;
            Interpolator interpolator = this.f2835d;
            Interpolator interpolator2 = RecyclerView.f2739i;
            if (interpolator != interpolator2) {
                this.f2835d = interpolator2;
                this.f2834c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f2834c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo3341e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3341e() {
            if (this.f2836e) {
                this.f2837f = true;
            } else {
                m3125d();
            }
        }

        /* renamed from: f */
        public void mo3342f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m3123a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f2739i;
            }
            if (this.f2835d != interpolator) {
                this.f2835d = interpolator;
                this.f2834c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2833b = 0;
            this.f2832a = 0;
            RecyclerView.this.setScrollState(2);
            this.f2834c.startScroll(0, 0, i, i2, i4);
            if (VERSION.SDK_INT < 23) {
                this.f2834c.computeScrollOffset();
            }
            mo3341e();
        }

        /* renamed from: g */
        public void mo3343g() {
            RecyclerView.this.removeCallbacks(this);
            this.f2834c.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2803v == null) {
                mo3343g();
                return;
            }
            this.f2837f = false;
            this.f2836e = true;
            recyclerView.mo3319v();
            OverScroller overScroller = this.f2834c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f2832a;
                int i4 = currY - this.f2833b;
                this.f2832a = currX;
                this.f2833b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f2749F0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo3166G(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f2749F0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo3316u(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f2801u != null) {
                    int[] iArr3 = recyclerView3.f2749F0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo3249i1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f2749F0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0438z zVar = recyclerView4.f2803v.f2880g;
                    if (zVar != null && !zVar.mo3646g() && zVar.mo3647h()) {
                        int b = RecyclerView.this.f2798s0.mo3331b();
                        if (b == 0) {
                            zVar.mo3657r();
                        } else if (zVar.mo3645f() >= b) {
                            zVar.mo3655p(b - 1);
                            zVar.mo3649j(i, i2);
                        } else {
                            zVar.mo3649j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f2807x.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f2749F0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo3168H(i, i2, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f2749F0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo3172J(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C0438z zVar2 = RecyclerView.this.f2803v.f2880g;
                if ((zVar2 != null && zVar2.mo3646g()) || !z) {
                    mo3341e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    GapWorker fVar = recyclerView7.f2794q0;
                    if (fVar != null) {
                        fVar.mo3832f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo3195a(i7, currVelocity);
                    }
                    if (RecyclerView.f2735e) {
                        RecyclerView.this.f2796r0.mo3838b();
                    }
                }
            }
            C0438z zVar3 = RecyclerView.this.f2803v.f2880g;
            if (zVar3 != null && zVar3.mo3646g()) {
                zVar3.mo3649j(0, 0);
            }
            this.f2836e = false;
            if (this.f2837f) {
                m3125d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.mo3321v1(1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0406d implements C0480b {
        C0406d() {
        }

        /* renamed from: a */
        public void mo3345a(C0407d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2803v.mo3544m1(d0Var.f2841b, recyclerView.f2781k);
        }

        /* renamed from: b */
        public void mo3346b(C0407d0 d0Var, C0418c cVar, C0418c cVar2) {
            RecyclerView.this.mo3255l(d0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo3347c(C0407d0 d0Var, C0418c cVar, C0418c cVar2) {
            RecyclerView.this.f2781k.mo3604J(d0Var);
            RecyclerView.this.mo3259n(d0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo3348d(C0407d0 d0Var, C0418c cVar, C0418c cVar2) {
            d0Var.mo3355G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2761O) {
                if (recyclerView.f2770a0.mo3444b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.mo3181O0();
                }
            } else if (recyclerView.f2770a0.mo3446d(d0Var, cVar, cVar2)) {
                RecyclerView.this.mo3181O0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C0407d0 {

        /* renamed from: a */
        private static final List<Object> f2840a = Collections.emptyList();

        /* renamed from: b */
        public final View f2841b;

        /* renamed from: c */
        WeakReference<RecyclerView> f2842c;

        /* renamed from: d */
        int f2843d = -1;

        /* renamed from: e */
        int f2844e = -1;

        /* renamed from: f */
        long f2845f = -1;

        /* renamed from: g */
        int f2846g = -1;

        /* renamed from: h */
        int f2847h = -1;

        /* renamed from: i */
        C0407d0 f2848i = null;

        /* renamed from: j */
        C0407d0 f2849j = null;

        /* renamed from: k */
        int f2850k;

        /* renamed from: l */
        List<Object> f2851l = null;

        /* renamed from: m */
        List<Object> f2852m = null;

        /* renamed from: n */
        private int f2853n = 0;

        /* renamed from: o */
        C0433v f2854o = null;

        /* renamed from: p */
        boolean f2855p = false;

        /* renamed from: q */
        private int f2856q = 0;

        /* renamed from: r */
        int f2857r = -1;

        /* renamed from: s */
        RecyclerView f2858s;

        public C0407d0(View view) {
            if (view != null) {
                this.f2841b = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m3134g() {
            if (this.f2851l == null) {
                ArrayList arrayList = new ArrayList();
                this.f2851l = arrayList;
                this.f2852m = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A */
        public void mo3349A(int i, boolean z) {
            if (this.f2844e == -1) {
                this.f2844e = this.f2843d;
            }
            if (this.f2847h == -1) {
                this.f2847h = this.f2843d;
            }
            if (z) {
                this.f2847h += i;
            }
            this.f2843d += i;
            if (this.f2841b.getLayoutParams() != null) {
                ((C0426p) this.f2841b.getLayoutParams()).f2900c = true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: B */
        public void mo3350B(RecyclerView recyclerView) {
            int i = this.f2857r;
            if (i != -1) {
                this.f2856q = i;
            } else {
                this.f2856q = ViewCompat.m5510A(this.f2841b);
            }
            recyclerView.mo3256l1(this, 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: C */
        public void mo3351C(RecyclerView recyclerView) {
            recyclerView.mo3256l1(this, this.f2856q);
            this.f2856q = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: D */
        public void mo3352D() {
            this.f2850k = 0;
            this.f2843d = -1;
            this.f2844e = -1;
            this.f2845f = -1;
            this.f2847h = -1;
            this.f2853n = 0;
            this.f2848i = null;
            this.f2849j = null;
            mo3364d();
            this.f2856q = 0;
            this.f2857r = -1;
            RecyclerView.m3021r(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: E */
        public void mo3353E() {
            if (this.f2844e == -1) {
                this.f2844e = this.f2843d;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: F */
        public void mo3354F(int i, int i2) {
            this.f2850k = (i & i2) | (this.f2850k & (i2 ^ -1));
        }

        /* renamed from: G */
        public final void mo3355G(boolean z) {
            int i = this.f2853n;
            int i2 = z ? i - 1 : i + 1;
            this.f2853n = i2;
            if (i2 < 0) {
                this.f2853n = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            } else if (!z && i2 == 1) {
                this.f2850k |= 16;
            } else if (z && i2 == 0) {
                this.f2850k &= -17;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: H */
        public void mo3356H(C0433v vVar, boolean z) {
            this.f2854o = vVar;
            this.f2855p = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: I */
        public boolean mo3357I() {
            return (this.f2850k & 16) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: J */
        public boolean mo3358J() {
            return (this.f2850k & 128) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: K */
        public void mo3359K() {
            this.f2854o.mo3604J(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: L */
        public boolean mo3360L() {
            return (this.f2850k & 32) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3361a(Object obj) {
            if (obj == null) {
                mo3362b(1024);
            } else if ((1024 & this.f2850k) == 0) {
                m3134g();
                this.f2851l.add(obj);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3362b(int i) {
            this.f2850k = i | this.f2850k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3363c() {
            this.f2844e = -1;
            this.f2847h = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3364d() {
            List<Object> list = this.f2851l;
            if (list != null) {
                list.clear();
            }
            this.f2850k &= -1025;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3365e() {
            this.f2850k &= -33;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo3366f() {
            this.f2850k &= -257;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public boolean mo3367h() {
            return (this.f2850k & 16) == 0 && ViewCompat.m5534Q(this.f2841b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo3368i(int i, int i2, boolean z) {
            mo3362b(8);
            mo3349A(i2, z);
            this.f2843d = i;
        }

        /* renamed from: j */
        public final int mo3369j() {
            RecyclerView recyclerView = this.f2858s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo3201c0(this);
        }

        /* renamed from: k */
        public final long mo3370k() {
            return this.f2845f;
        }

        /* renamed from: l */
        public final int mo3371l() {
            return this.f2846g;
        }

        /* renamed from: m */
        public final int mo3372m() {
            int i = this.f2847h;
            return i == -1 ? this.f2843d : i;
        }

        /* renamed from: n */
        public final int mo3373n() {
            return this.f2844e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public List<Object> mo3374o() {
            if ((this.f2850k & 1024) != 0) {
                return f2840a;
            }
            List<Object> list = this.f2851l;
            if (list == null || list.size() == 0) {
                return f2840a;
            }
            return this.f2852m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public boolean mo3375p(int i) {
            return (i & this.f2850k) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public boolean mo3376q() {
            return (this.f2850k & 512) != 0 || mo3379t();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public boolean mo3377r() {
            return (this.f2841b.getParent() == null || this.f2841b.getParent() == this.f2858s) ? false : true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public boolean mo3378s() {
            return (this.f2850k & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public boolean mo3379t() {
            return (this.f2850k & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.f2843d);
            sb.append(" id=");
            sb.append(this.f2845f);
            sb.append(", oldPos=");
            sb.append(this.f2844e);
            sb.append(", pLpos:");
            sb.append(this.f2847h);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (mo3383w()) {
                sb2.append(" scrap ");
                sb2.append(this.f2855p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo3379t()) {
                sb2.append(" invalid");
            }
            if (!mo3378s()) {
                sb2.append(" unbound");
            }
            if (mo3386z()) {
                sb2.append(" update");
            }
            if (mo3382v()) {
                sb2.append(" removed");
            }
            if (mo3358J()) {
                sb2.append(" ignored");
            }
            if (mo3384x()) {
                sb2.append(" tmpDetached");
            }
            if (!mo3381u()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.f2853n);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (mo3376q()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2841b.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* renamed from: u */
        public final boolean mo3381u() {
            return (this.f2850k & 16) == 0 && !ViewCompat.m5534Q(this.f2841b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public boolean mo3382v() {
            return (this.f2850k & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public boolean mo3383w() {
            return this.f2854o != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public boolean mo3384x() {
            return (this.f2850k & LogType.UNEXP) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: y */
        public boolean mo3385y() {
            return (this.f2850k & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public boolean mo3386z() {
            return (this.f2850k & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C0408e implements C0453b {
        C0408e() {
        }

        /* renamed from: a */
        public View mo3387a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public void mo3388b(View view) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (h0 != null) {
                h0.mo3350B(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public C0407d0 mo3389c(View view) {
            return RecyclerView.m3012h0(view);
        }

        /* renamed from: d */
        public void mo3390d(int i) {
            View a = mo3387a(i);
            if (a != null) {
                C0407d0 h0 = RecyclerView.m3012h0(a);
                if (h0 != null) {
                    if (!h0.mo3384x() || h0.mo3358J()) {
                        h0.mo3362b(LogType.UNEXP);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("called detach on an already detached child ");
                        sb.append(h0);
                        sb.append(RecyclerView.this.mo3183Q());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: e */
        public void mo3391e(View view) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (h0 != null) {
                h0.mo3351C(RecyclerView.this);
            }
        }

        /* renamed from: f */
        public void mo3392f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo3327z(view);
        }

        /* renamed from: g */
        public int mo3393g() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: h */
        public void mo3394h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo3158A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: i */
        public void mo3395i() {
            int g = mo3393g();
            for (int i = 0; i < g; i++) {
                View a = mo3387a(i);
                RecyclerView.this.mo3158A(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: j */
        public void mo3396j(View view, int i, LayoutParams layoutParams) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (h0 != null) {
                if (h0.mo3384x() || h0.mo3358J()) {
                    h0.mo3366f();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(h0);
                    sb.append(RecyclerView.this.mo3183Q());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: k */
        public int mo3397k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C0409f implements C0450a {
        C0409f() {
        }

        /* renamed from: a */
        public void mo3398a(int i, int i2) {
            RecyclerView.this.mo3164E0(i, i2);
            RecyclerView.this.f2804v0 = true;
        }

        /* renamed from: b */
        public void mo3399b(C0451b bVar) {
            mo3406i(bVar);
        }

        /* renamed from: c */
        public C0407d0 mo3400c(int i) {
            C0407d0 a0 = RecyclerView.this.mo3196a0(i, true);
            if (a0 != null && !RecyclerView.this.f2787n.mo3777n(a0.f2841b)) {
                return a0;
            }
            return null;
        }

        /* renamed from: d */
        public void mo3401d(int i, int i2) {
            RecyclerView.this.mo3165F0(i, i2, false);
            RecyclerView.this.f2804v0 = true;
        }

        /* renamed from: e */
        public void mo3402e(int i, int i2) {
            RecyclerView.this.mo3163D0(i, i2);
            RecyclerView.this.f2804v0 = true;
        }

        /* renamed from: f */
        public void mo3403f(int i, int i2) {
            RecyclerView.this.mo3165F0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2804v0 = true;
            recyclerView.f2798s0.f2817d += i2;
        }

        /* renamed from: g */
        public void mo3404g(C0451b bVar) {
            mo3406i(bVar);
        }

        /* renamed from: h */
        public void mo3405h(int i, int i2, Object obj) {
            RecyclerView.this.mo3326y1(i, i2, obj);
            RecyclerView.this.f2806w0 = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo3406i(C0451b bVar) {
            int i = bVar.f2998a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f2803v.mo3070R0(recyclerView, bVar.f2999b, bVar.f3001d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f2803v.mo3073U0(recyclerView2, bVar.f2999b, bVar.f3001d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f2803v.mo3074W0(recyclerView3, bVar.f2999b, bVar.f3001d, bVar.f3000c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f2803v.mo3072T0(recyclerView4, bVar.f2999b, bVar.f3001d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C0410g<VH extends C0407d0> {

        /* renamed from: a */
        private final C0411h f2861a = new C0411h();

        /* renamed from: b */
        private boolean f2862b = false;

        /* renamed from: a */
        public final void mo3407a(VH vh, int i) {
            vh.f2843d = i;
            if (mo3413g()) {
                vh.f2845f = mo3410d(i);
            }
            vh.mo3354F(1, 519);
            TraceCompat.m5076a("RV OnBindView");
            mo3420n(vh, i, vh.mo3374o());
            vh.mo3364d();
            LayoutParams layoutParams = vh.f2841b.getLayoutParams();
            if (layoutParams instanceof C0426p) {
                ((C0426p) layoutParams).f2900c = true;
            }
            TraceCompat.m5077b();
        }

        /* renamed from: b */
        public final VH mo3408b(ViewGroup viewGroup, int i) {
            try {
                TraceCompat.m5076a("RV CreateView");
                VH o = mo3421o(viewGroup, i);
                if (o.f2841b.getParent() == null) {
                    o.f2846g = i;
                    return o;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                TraceCompat.m5077b();
            }
        }

        /* renamed from: c */
        public abstract int mo3409c();

        /* renamed from: d */
        public long mo3410d(int i) {
            return -1;
        }

        /* renamed from: e */
        public int mo3411e(int i) {
            return 0;
        }

        /* renamed from: f */
        public final boolean mo3412f() {
            return this.f2861a.mo3430a();
        }

        /* renamed from: g */
        public final boolean mo3413g() {
            return this.f2862b;
        }

        /* renamed from: h */
        public final void mo3414h() {
            this.f2861a.mo3431b();
        }

        /* renamed from: i */
        public final void mo3415i(int i) {
            this.f2861a.mo3432c(i, 1);
        }

        /* renamed from: j */
        public final void mo3416j(int i, int i2) {
            this.f2861a.mo3434e(i, i2);
        }

        /* renamed from: k */
        public final void mo3417k(int i) {
            this.f2861a.mo3435f(i, 1);
        }

        /* renamed from: l */
        public void mo3418l(RecyclerView recyclerView) {
        }

        /* renamed from: m */
        public abstract void mo3419m(VH vh, int i);

        /* renamed from: n */
        public void mo3420n(VH vh, int i, List<Object> list) {
            mo3419m(vh, i);
        }

        /* renamed from: o */
        public abstract VH mo3421o(ViewGroup viewGroup, int i);

        /* renamed from: p */
        public void mo3422p(RecyclerView recyclerView) {
        }

        /* renamed from: q */
        public boolean mo3423q(VH vh) {
            return false;
        }

        /* renamed from: r */
        public void mo3424r(VH vh) {
        }

        /* renamed from: s */
        public void mo3425s(VH vh) {
        }

        /* renamed from: t */
        public void mo3426t(VH vh) {
        }

        /* renamed from: u */
        public void mo3427u(C0412i iVar) {
            this.f2861a.registerObserver(iVar);
        }

        /* renamed from: v */
        public void mo3428v(boolean z) {
            if (!mo3412f()) {
                this.f2862b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: w */
        public void mo3429w(C0412i iVar) {
            this.f2861a.unregisterObserver(iVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C0411h extends Observable<C0412i> {
        C0411h() {
        }

        /* renamed from: a */
        public boolean mo3430a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo3431b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0412i) this.mObservers.get(size)).mo3436a();
            }
        }

        /* renamed from: c */
        public void mo3432c(int i, int i2) {
            mo3433d(i, i2, null);
        }

        /* renamed from: d */
        public void mo3433d(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0412i) this.mObservers.get(size)).mo3438c(i, i2, obj);
            }
        }

        /* renamed from: e */
        public void mo3434e(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0412i) this.mObservers.get(size)).mo3439d(i, i2);
            }
        }

        /* renamed from: f */
        public void mo3435f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0412i) this.mObservers.get(size)).mo3440e(i, i2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0412i {
        /* renamed from: a */
        public void mo3436a() {
        }

        /* renamed from: b */
        public void mo3437b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo3438c(int i, int i2, Object obj) {
            mo3437b(i, i2);
        }

        /* renamed from: d */
        public void mo3439d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo3440e(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C0413j {
        /* renamed from: a */
        int mo3441a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0414k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo3442a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0415l {

        /* renamed from: a */
        private C0417b f2863a = null;

        /* renamed from: b */
        private ArrayList<C0416a> f2864b = new ArrayList<>();

        /* renamed from: c */
        private long f2865c = 120;

        /* renamed from: d */
        private long f2866d = 120;

        /* renamed from: e */
        private long f2867e = 250;

        /* renamed from: f */
        private long f2868f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C0416a {
            /* renamed from: a */
            void mo3464a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface C0417b {
            /* renamed from: a */
            void mo3465a(C0407d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C0418c {

            /* renamed from: a */
            public int f2869a;

            /* renamed from: b */
            public int f2870b;

            /* renamed from: c */
            public int f2871c;

            /* renamed from: d */
            public int f2872d;

            /* renamed from: a */
            public C0418c mo3466a(C0407d0 d0Var) {
                return mo3467b(d0Var, 0);
            }

            /* renamed from: b */
            public C0418c mo3467b(C0407d0 d0Var, int i) {
                View view = d0Var.f2841b;
                this.f2869a = view.getLeft();
                this.f2870b = view.getTop();
                this.f2871c = view.getRight();
                this.f2872d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m3228e(C0407d0 d0Var) {
            int i = d0Var.f2850k & 14;
            if (d0Var.mo3379t()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int n = d0Var.mo3373n();
                int j = d0Var.mo3369j();
                if (!(n == -1 || j == -1 || n == j)) {
                    i |= 2048;
                }
            }
            return i;
        }

        /* renamed from: a */
        public abstract boolean mo3443a(C0407d0 d0Var, C0418c cVar, C0418c cVar2);

        /* renamed from: b */
        public abstract boolean mo3444b(C0407d0 d0Var, C0407d0 d0Var2, C0418c cVar, C0418c cVar2);

        /* renamed from: c */
        public abstract boolean mo3445c(C0407d0 d0Var, C0418c cVar, C0418c cVar2);

        /* renamed from: d */
        public abstract boolean mo3446d(C0407d0 d0Var, C0418c cVar, C0418c cVar2);

        /* renamed from: f */
        public abstract boolean mo3447f(C0407d0 d0Var);

        /* renamed from: g */
        public boolean mo3448g(C0407d0 d0Var, List<Object> list) {
            return mo3447f(d0Var);
        }

        /* renamed from: h */
        public final void mo3449h(C0407d0 d0Var) {
            mo3459r(d0Var);
            C0417b bVar = this.f2863a;
            if (bVar != null) {
                bVar.mo3465a(d0Var);
            }
        }

        /* renamed from: i */
        public final void mo3450i() {
            int size = this.f2864b.size();
            for (int i = 0; i < size; i++) {
                ((C0416a) this.f2864b.get(i)).mo3464a();
            }
            this.f2864b.clear();
        }

        /* renamed from: j */
        public abstract void mo3451j(C0407d0 d0Var);

        /* renamed from: k */
        public abstract void mo3452k();

        /* renamed from: l */
        public long mo3453l() {
            return this.f2865c;
        }

        /* renamed from: m */
        public long mo3454m() {
            return this.f2868f;
        }

        /* renamed from: n */
        public long mo3455n() {
            return this.f2867e;
        }

        /* renamed from: o */
        public long mo3456o() {
            return this.f2866d;
        }

        /* renamed from: p */
        public abstract boolean mo3457p();

        /* renamed from: q */
        public C0418c mo3458q() {
            return new C0418c();
        }

        /* renamed from: r */
        public void mo3459r(C0407d0 d0Var) {
        }

        /* renamed from: s */
        public C0418c mo3460s(C0401a0 a0Var, C0407d0 d0Var) {
            return mo3458q().mo3466a(d0Var);
        }

        /* renamed from: t */
        public C0418c mo3461t(C0401a0 a0Var, C0407d0 d0Var, int i, List<Object> list) {
            return mo3458q().mo3466a(d0Var);
        }

        /* renamed from: u */
        public abstract void mo3462u();

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo3463v(C0417b bVar) {
            this.f2863a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C0419m implements C0417b {
        C0419m() {
        }

        /* renamed from: a */
        public void mo3465a(C0407d0 d0Var) {
            d0Var.mo3355G(true);
            if (d0Var.f2848i != null && d0Var.f2849j == null) {
                d0Var.f2848i = null;
            }
            d0Var.f2849j = null;
            if (!d0Var.mo3357I() && !RecyclerView.this.mo3190X0(d0Var.f2841b) && d0Var.mo3384x()) {
                RecyclerView.this.removeDetachedView(d0Var.f2841b, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0420n {
        @Deprecated
        /* renamed from: d */
        public void mo3468d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo3469e(Rect rect, View view, RecyclerView recyclerView, C0401a0 a0Var) {
            mo3468d(rect, ((C0426p) view.getLayoutParams()).mo3573a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void mo3470f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo3471g(Canvas canvas, RecyclerView recyclerView, C0401a0 a0Var) {
            mo3470f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo3472h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo3473i(Canvas canvas, RecyclerView recyclerView, C0401a0 a0Var) {
            mo3472h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0421o {

        /* renamed from: a */
        ChildHelper f2874a;

        /* renamed from: b */
        RecyclerView f2875b;

        /* renamed from: c */
        private final C0478b f2876c;

        /* renamed from: d */
        private final C0478b f2877d;

        /* renamed from: e */
        ViewBoundsCheck f2878e;

        /* renamed from: f */
        ViewBoundsCheck f2879f;

        /* renamed from: g */
        C0438z f2880g;

        /* renamed from: h */
        boolean f2881h = false;

        /* renamed from: i */
        boolean f2882i = false;

        /* renamed from: j */
        boolean f2883j = false;

        /* renamed from: k */
        private boolean f2884k = true;

        /* renamed from: l */
        private boolean f2885l = true;

        /* renamed from: m */
        int f2886m;

        /* renamed from: n */
        boolean f2887n;

        /* renamed from: o */
        private int f2888o;

        /* renamed from: p */
        private int f2889p;

        /* renamed from: q */
        private int f2890q;

        /* renamed from: r */
        private int f2891r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C0422a implements C0478b {
            C0422a() {
            }

            /* renamed from: a */
            public View mo3567a(int i) {
                return C0421o.this.mo3492I(i);
            }

            /* renamed from: b */
            public int mo3568b() {
                return C0421o.this.mo3547o0() - C0421o.this.mo3528f0();
            }

            /* renamed from: c */
            public int mo3569c(View view) {
                return C0421o.this.mo3503Q(view) - ((C0426p) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: d */
            public int mo3570d() {
                return C0421o.this.mo3526e0();
            }

            /* renamed from: e */
            public int mo3571e(View view) {
                return C0421o.this.mo3507T(view) + ((C0426p) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C0423b implements C0478b {
            C0423b() {
            }

            /* renamed from: a */
            public View mo3567a(int i) {
                return C0421o.this.mo3492I(i);
            }

            /* renamed from: b */
            public int mo3568b() {
                return C0421o.this.mo3511W() - C0421o.this.mo3524d0();
            }

            /* renamed from: c */
            public int mo3569c(View view) {
                return C0421o.this.mo3508U(view) - ((C0426p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: d */
            public int mo3570d() {
                return C0421o.this.mo3530g0();
            }

            /* renamed from: e */
            public int mo3571e(View view) {
                return C0421o.this.mo3500O(view) + ((C0426p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C0424c {
            /* renamed from: a */
            void mo3572a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C0425d {

            /* renamed from: a */
            public int f2894a;

            /* renamed from: b */
            public int f2895b;

            /* renamed from: c */
            public boolean f2896c;

            /* renamed from: d */
            public boolean f2897d;
        }

        public C0421o() {
            C0422a aVar = new C0422a();
            this.f2876c = aVar;
            C0423b bVar = new C0423b();
            this.f2877d = bVar;
            this.f2878e = new ViewBoundsCheck(aVar);
            this.f2879f = new ViewBoundsCheck(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m3261K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0421o.m3261K(int, int, int, int, boolean):int");
        }

        /* renamed from: L */
        private int[] m3262L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e0 = mo3526e0();
            int g0 = mo3530g0();
            int o0 = mo3547o0() - mo3528f0();
            int W = mo3511W() - mo3524d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - e0;
            int min = Math.min(0, i);
            int i2 = top - g0;
            int min2 = Math.min(0, i2);
            int i3 = width - o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - W);
            if (mo3514Z() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m3263f(View view, int i, boolean z) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (z || h0.mo3382v()) {
                this.f2875b.f2789o.mo3915b(h0);
            } else {
                this.f2875b.f2789o.mo3928p(h0);
            }
            C0426p pVar = (C0426p) view.getLayoutParams();
            if (h0.mo3360L() || h0.mo3383w()) {
                if (h0.mo3383w()) {
                    h0.mo3359K();
                } else {
                    h0.mo3365e();
                }
                this.f2874a.mo3768c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f2875b) {
                int m = this.f2874a.mo3776m(view);
                if (i == -1) {
                    i = this.f2874a.mo3772g();
                }
                if (m == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f2875b.indexOfChild(view));
                    sb.append(this.f2875b.mo3183Q());
                    throw new IllegalStateException(sb.toString());
                } else if (m != i) {
                    this.f2875b.f2803v.mo3478B0(m, i);
                }
            } else {
                this.f2874a.mo3766a(view, i, false);
                pVar.f2900c = true;
                C0438z zVar = this.f2880g;
                if (zVar != null && zVar.mo3647h()) {
                    this.f2880g.mo3650k(view);
                }
            }
            if (pVar.f2901d) {
                h0.f2841b.invalidate();
                pVar.f2901d = false;
            }
        }

        /* renamed from: i0 */
        public static C0425d m3264i0(Context context, AttributeSet attributeSet, int i, int i2) {
            C0425d dVar = new C0425d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0696c.f4948f, i, i2);
            dVar.f2894a = obtainStyledAttributes.getInt(C0696c.f4949g, 1);
            dVar.f2895b = obtainStyledAttributes.getInt(C0696c.f4959q, 1);
            dVar.f2896c = obtainStyledAttributes.getBoolean(C0696c.f4958p, false);
            dVar.f2897d = obtainStyledAttributes.getBoolean(C0696c.f4960r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: n */
        public static int m3265n(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                size = Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: t0 */
        private boolean m3266t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e0 = mo3526e0();
            int g0 = mo3530g0();
            int o0 = mo3547o0() - mo3528f0();
            int W = mo3511W() - mo3524d0();
            Rect rect = this.f2875b.f2795r;
            mo3502P(focusedChild, rect);
            if (rect.left - i >= o0 || rect.right - i <= e0 || rect.top - i2 >= W || rect.bottom - i2 <= g0) {
                return false;
            }
            return true;
        }

        /* renamed from: v1 */
        private void m3267v1(C0433v vVar, int i, View view) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (!h0.mo3358J()) {
                if (!h0.mo3379t() || h0.mo3382v() || this.f2875b.f2801u.mo3413g()) {
                    mo3561x(i);
                    vVar.mo3599D(view);
                    this.f2875b.f2789o.mo3924k(h0);
                } else {
                    mo3552q1(i);
                    vVar.mo3598C(h0);
                }
            }
        }

        /* renamed from: w0 */
        private static boolean m3268w0(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i) {
                    z = true;
                }
                return z;
            }
        }

        /* renamed from: y */
        private void m3269y(int i, View view) {
            this.f2874a.mo3769d(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A */
        public void mo3474A(RecyclerView recyclerView, C0433v vVar) {
            this.f2882i = false;
            mo3106I0(recyclerView, vVar);
        }

        /* renamed from: A0 */
        public void mo3475A0(View view, int i, int i2) {
            C0426p pVar = (C0426p) view.getLayoutParams();
            Rect m0 = this.f2875b.mo3257m0(view);
            int i3 = i2 + m0.top + m0.bottom;
            int K = m3261K(mo3547o0(), mo3549p0(), mo3526e0() + mo3528f0() + pVar.leftMargin + pVar.rightMargin + i + m0.left + m0.right, pVar.width, mo3126k());
            int K2 = m3261K(mo3511W(), mo3512X(), mo3530g0() + mo3524d0() + pVar.topMargin + pVar.bottomMargin + i3, pVar.height, mo3127l());
            if (mo3486F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A1 */
        public void mo3476A1(int i, int i2) {
            this.f2890q = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            this.f2888o = mode;
            if (mode == 0 && !RecyclerView.f2733c) {
                this.f2890q = 0;
            }
            this.f2891r = MeasureSpec.getSize(i2);
            int mode2 = MeasureSpec.getMode(i2);
            this.f2889p = mode2;
            if (mode2 == 0 && !RecyclerView.f2733c) {
                this.f2891r = 0;
            }
        }

        /* renamed from: B */
        public View mo3477B(View view) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView == null) {
                return null;
            }
            View S = recyclerView.mo3186S(view);
            if (S != null && !this.f2874a.mo3777n(S)) {
                return S;
            }
            return null;
        }

        /* renamed from: B0 */
        public void mo3478B0(int i, int i2) {
            View I = mo3492I(i);
            if (I != null) {
                mo3561x(i);
                mo3532h(I, i2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f2875b.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: B1 */
        public void mo3479B1(int i, int i2) {
            this.f2875b.setMeasuredDimension(i, i2);
        }

        /* renamed from: C */
        public View mo3101C(int i) {
            int J = mo3493J();
            for (int i2 = 0; i2 < J; i2++) {
                View I = mo3492I(i2);
                C0407d0 h0 = RecyclerView.m3012h0(I);
                if (h0 != null && h0.mo3372m() == i && !h0.mo3358J() && (this.f2875b.f2798s0.mo3334e() || !h0.mo3382v())) {
                    return I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo3480C0(int i) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                recyclerView.mo3160B0(i);
            }
        }

        /* renamed from: C1 */
        public void mo3060C1(Rect rect, int i, int i2) {
            mo3479B1(m3265n(i, rect.width() + mo3526e0() + mo3528f0(), mo3522c0()), m3265n(i2, rect.height() + mo3530g0() + mo3524d0(), mo3519b0()));
        }

        /* renamed from: D */
        public abstract C0426p mo3061D();

        /* renamed from: D0 */
        public void mo3481D0(int i) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                recyclerView.mo3162C0(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: D1 */
        public void mo3482D1(int i, int i2) {
            int J = mo3493J();
            if (J == 0) {
                this.f2875b.mo3324x(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < J; i7++) {
                View I = mo3492I(i7);
                Rect rect = this.f2875b.f2795r;
                mo3502P(I, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f2875b.f2795r.set(i5, i6, i3, i4);
            mo3060C1(this.f2875b.f2795r, i, i2);
        }

        /* renamed from: E */
        public C0426p mo3062E(Context context, AttributeSet attributeSet) {
            return new C0426p(context, attributeSet);
        }

        /* renamed from: E0 */
        public void mo3483E0(C0410g gVar, C0410g gVar2) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: E1 */
        public void mo3484E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f2875b = null;
                this.f2874a = null;
                this.f2890q = 0;
                this.f2891r = 0;
            } else {
                this.f2875b = recyclerView;
                this.f2874a = recyclerView.f2787n;
                this.f2890q = recyclerView.getWidth();
                this.f2891r = recyclerView.getHeight();
            }
            this.f2888o = 1073741824;
            this.f2889p = 1073741824;
        }

        /* renamed from: F */
        public C0426p mo3063F(LayoutParams layoutParams) {
            if (layoutParams instanceof C0426p) {
                return new C0426p((C0426p) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new C0426p((MarginLayoutParams) layoutParams);
            }
            return new C0426p(layoutParams);
        }

        /* renamed from: F0 */
        public boolean mo3485F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: F1 */
        public boolean mo3486F1(View view, int i, int i2, C0426p pVar) {
            return view.isLayoutRequested() || !this.f2884k || !m3268w0(view.getWidth(), i, pVar.width) || !m3268w0(view.getHeight(), i2, pVar.height);
        }

        /* renamed from: G */
        public int mo3487G() {
            return -1;
        }

        /* renamed from: G0 */
        public void mo3488G0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: G1 */
        public boolean mo3105G1() {
            return false;
        }

        /* renamed from: H */
        public int mo3489H(View view) {
            return ((C0426p) view.getLayoutParams()).f2899b.bottom;
        }

        @Deprecated
        /* renamed from: H0 */
        public void mo3490H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: H1 */
        public boolean mo3491H1(View view, int i, int i2, C0426p pVar) {
            return !this.f2884k || !m3268w0(view.getMeasuredWidth(), i, pVar.width) || !m3268w0(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: I */
        public View mo3492I(int i) {
            ChildHelper bVar = this.f2874a;
            if (bVar != null) {
                return bVar.mo3771f(i);
            }
            return null;
        }

        /* renamed from: I0 */
        public void mo3106I0(RecyclerView recyclerView, C0433v vVar) {
            mo3490H0(recyclerView);
        }

        /* renamed from: I1 */
        public void mo3107I1(RecyclerView recyclerView, C0401a0 a0Var, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: J */
        public int mo3493J() {
            ChildHelper bVar = this.f2874a;
            if (bVar != null) {
                return bVar.mo3772g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public View mo3065J0(View view, int i, C0433v vVar, C0401a0 a0Var) {
            return null;
        }

        /* renamed from: J1 */
        public void mo3494J1(C0438z zVar) {
            C0438z zVar2 = this.f2880g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo3647h())) {
                this.f2880g.mo3657r();
            }
            this.f2880g = zVar;
            zVar.mo3656q(this.f2875b, this);
        }

        /* renamed from: K0 */
        public void mo3108K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2875b;
            mo3496L0(recyclerView.f2781k, recyclerView.f2798s0, accessibilityEvent);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: K1 */
        public void mo3495K1() {
            C0438z zVar = this.f2880g;
            if (zVar != null) {
                zVar.mo3657r();
            }
        }

        /* renamed from: L0 */
        public void mo3496L0(C0433v vVar, C0401a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f2875b.canScrollVertically(-1) && !this.f2875b.canScrollHorizontally(-1) && !this.f2875b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0410g gVar = this.f2875b.f2801u;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo3409c());
                }
            }
        }

        /* renamed from: L1 */
        public boolean mo3066L1() {
            return false;
        }

        /* renamed from: M */
        public boolean mo3497M() {
            RecyclerView recyclerView = this.f2875b;
            return recyclerView != null && recyclerView.f2791p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: M0 */
        public void mo3498M0(AccessibilityNodeInfoCompat cVar) {
            RecyclerView recyclerView = this.f2875b;
            mo3499N0(recyclerView.f2781k, recyclerView.f2798s0, cVar);
        }

        /* renamed from: N */
        public int mo3067N(C0433v vVar, C0401a0 a0Var) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView == null || recyclerView.f2801u == null || !mo3126k()) {
                return 1;
            }
            return this.f2875b.f2801u.mo3409c();
        }

        /* renamed from: N0 */
        public void mo3499N0(C0433v vVar, C0401a0 a0Var, AccessibilityNodeInfoCompat cVar) {
            if (this.f2875b.canScrollVertically(-1) || this.f2875b.canScrollHorizontally(-1)) {
                cVar.mo5054a(8192);
                cVar.mo5083q0(true);
            }
            if (this.f2875b.canScrollVertically(1) || this.f2875b.canScrollHorizontally(1)) {
                cVar.mo5054a(4096);
                cVar.mo5083q0(true);
            }
            cVar.mo5053Z(C0635b.m5415a(mo3081k0(vVar, a0Var), mo3067N(vVar, a0Var), mo3559v0(vVar, a0Var), mo3541l0(vVar, a0Var)));
        }

        /* renamed from: O */
        public int mo3500O(View view) {
            return view.getBottom() + mo3489H(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: O0 */
        public void mo3501O0(View view, AccessibilityNodeInfoCompat cVar) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (h0 != null && !h0.mo3382v() && !this.f2874a.mo3777n(h0.f2841b)) {
                RecyclerView recyclerView = this.f2875b;
                mo3069P0(recyclerView.f2781k, recyclerView.f2798s0, view, cVar);
            }
        }

        /* renamed from: P */
        public void mo3502P(View view, Rect rect) {
            RecyclerView.m3013j0(view, rect);
        }

        /* renamed from: P0 */
        public void mo3069P0(C0433v vVar, C0401a0 a0Var, View view, AccessibilityNodeInfoCompat cVar) {
            cVar.mo5055a0(C0636c.m5416a(mo3127l() ? mo3533h0(view) : 0, 1, mo3126k() ? mo3533h0(view) : 0, 1, false, false));
        }

        /* renamed from: Q */
        public int mo3503Q(View view) {
            return view.getLeft() - mo3516a0(view);
        }

        /* renamed from: Q0 */
        public View mo3504Q0(View view, int i) {
            return null;
        }

        /* renamed from: R */
        public int mo3505R(View view) {
            Rect rect = ((C0426p) view.getLayoutParams()).f2899b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo3070R0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: S */
        public int mo3506S(View view) {
            Rect rect = ((C0426p) view.getLayoutParams()).f2899b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo3071S0(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public int mo3507T(View view) {
            return view.getRight() + mo3538j0(view);
        }

        /* renamed from: T0 */
        public void mo3072T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: U */
        public int mo3508U(View view) {
            return view.getTop() - mo3543m0(view);
        }

        /* renamed from: U0 */
        public void mo3073U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public View mo3509V() {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView == null) {
                return null;
            }
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.f2874a.mo3777n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void mo3510V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public int mo3511W() {
            return this.f2891r;
        }

        /* renamed from: W0 */
        public void mo3074W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo3510V0(recyclerView, i, i2);
        }

        /* renamed from: X */
        public int mo3512X() {
            return this.f2889p;
        }

        /* renamed from: X0 */
        public void mo3075X0(C0433v vVar, C0401a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Y */
        public int mo3513Y() {
            RecyclerView recyclerView = this.f2875b;
            C0410g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo3409c();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public void mo3076Y0(C0401a0 a0Var) {
        }

        /* renamed from: Z */
        public int mo3514Z() {
            return ViewCompat.m5514C(this.f2875b);
        }

        /* renamed from: Z0 */
        public void mo3515Z0(C0433v vVar, C0401a0 a0Var, int i, int i2) {
            this.f2875b.mo3324x(i, i2);
        }

        /* renamed from: a0 */
        public int mo3516a0(View view) {
            return ((C0426p) view.getLayoutParams()).f2899b.left;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean mo3517a1(RecyclerView recyclerView, View view, View view2) {
            return mo3562x0() || recyclerView.mo3322w0();
        }

        /* renamed from: b */
        public void mo3518b(View view) {
            mo3521c(view, -1);
        }

        /* renamed from: b0 */
        public int mo3519b0() {
            return ViewCompat.m5516D(this.f2875b);
        }

        /* renamed from: b1 */
        public boolean mo3520b1(RecyclerView recyclerView, C0401a0 a0Var, View view, View view2) {
            return mo3517a1(recyclerView, view, view2);
        }

        /* renamed from: c */
        public void mo3521c(View view, int i) {
            m3263f(view, i, true);
        }

        /* renamed from: c0 */
        public int mo3522c0() {
            return ViewCompat.m5518E(this.f2875b);
        }

        /* renamed from: c1 */
        public void mo3120c1(Parcelable parcelable) {
        }

        /* renamed from: d */
        public void mo3523d(View view) {
            mo3525e(view, -1);
        }

        /* renamed from: d0 */
        public int mo3524d0() {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: d1 */
        public Parcelable mo3121d1() {
            return null;
        }

        /* renamed from: e */
        public void mo3525e(View view, int i) {
            m3263f(view, i, false);
        }

        /* renamed from: e0 */
        public int mo3526e0() {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void mo3527e1(int i) {
        }

        /* renamed from: f0 */
        public int mo3528f0() {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f1 */
        public void mo3529f1(C0438z zVar) {
            if (this.f2880g == zVar) {
                this.f2880g = null;
            }
        }

        /* renamed from: g */
        public void mo3124g(String str) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                recyclerView.mo3261o(str);
            }
        }

        /* renamed from: g0 */
        public int mo3530g0() {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g1 */
        public boolean mo3531g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2875b;
            return mo3534h1(recyclerView.f2781k, recyclerView.f2798s0, i, bundle);
        }

        /* renamed from: h */
        public void mo3532h(View view, int i) {
            mo3535i(view, i, (C0426p) view.getLayoutParams());
        }

        /* renamed from: h0 */
        public int mo3533h0(View view) {
            return ((C0426p) view.getLayoutParams()).mo3573a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: h1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3534h1(androidx.recyclerview.widget.RecyclerView.C0433v r8, androidx.recyclerview.widget.RecyclerView.C0401a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f2875b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo3511W()
                int r11 = r7.mo3530g0()
                int r8 = r8 - r11
                int r11 = r7.mo3524d0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f2875b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo3547o0()
                int r11 = r7.mo3526e0()
                int r10 = r10 - r11
                int r11 = r7.mo3528f0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo3511W()
                int r10 = r7.mo3530g0()
                int r8 = r8 - r10
                int r10 = r7.mo3524d0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f2875b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo3547o0()
                int r11 = r7.mo3526e0()
                int r10 = r10 - r11
                int r11 = r7.mo3528f0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f2875b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo3279q1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0421o.mo3534h1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: i */
        public void mo3535i(View view, int i, C0426p pVar) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (h0.mo3382v()) {
                this.f2875b.f2789o.mo3915b(h0);
            } else {
                this.f2875b.f2789o.mo3928p(h0);
            }
            this.f2874a.mo3768c(view, i, pVar, h0.mo3382v());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i1 */
        public boolean mo3536i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2875b;
            return mo3539j1(recyclerView.f2781k, recyclerView.f2798s0, view, i, bundle);
        }

        /* renamed from: j */
        public void mo3537j(View view, Rect rect) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo3257m0(view));
            }
        }

        /* renamed from: j0 */
        public int mo3538j0(View view) {
            return ((C0426p) view.getLayoutParams()).f2899b.right;
        }

        /* renamed from: j1 */
        public boolean mo3539j1(C0433v vVar, C0401a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: k */
        public boolean mo3126k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo3081k0(C0433v vVar, C0401a0 a0Var) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView == null || recyclerView.f2801u == null || !mo3127l()) {
                return 1;
            }
            return this.f2875b.f2801u.mo3409c();
        }

        /* renamed from: k1 */
        public void mo3540k1(C0433v vVar) {
            for (int J = mo3493J() - 1; J >= 0; J--) {
                if (!RecyclerView.m3012h0(mo3492I(J)).mo3358J()) {
                    mo3546n1(J, vVar);
                }
            }
        }

        /* renamed from: l */
        public boolean mo3127l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo3541l0(C0433v vVar, C0401a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l1 */
        public void mo3542l1(C0433v vVar) {
            int j = vVar.mo3616j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.mo3620n(i);
                C0407d0 h0 = RecyclerView.m3012h0(n);
                if (!h0.mo3358J()) {
                    h0.mo3355G(false);
                    if (h0.mo3384x()) {
                        this.f2875b.removeDetachedView(n, false);
                    }
                    C0415l lVar = this.f2875b.f2770a0;
                    if (lVar != null) {
                        lVar.mo3451j(h0);
                    }
                    h0.mo3355G(true);
                    vVar.mo3629y(n);
                }
            }
            vVar.mo3611e();
            if (j > 0) {
                this.f2875b.invalidate();
            }
        }

        /* renamed from: m */
        public boolean mo3082m(C0426p pVar) {
            return pVar != null;
        }

        /* renamed from: m0 */
        public int mo3543m0(View view) {
            return ((C0426p) view.getLayoutParams()).f2899b.top;
        }

        /* renamed from: m1 */
        public void mo3544m1(View view, C0433v vVar) {
            mo3550p1(view);
            vVar.mo3597B(view);
        }

        /* renamed from: n0 */
        public void mo3545n0(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((C0426p) view.getLayoutParams()).f2899b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f2875b != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f2875b.f2799t;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: n1 */
        public void mo3546n1(int i, C0433v vVar) {
            View I = mo3492I(i);
            mo3552q1(i);
            vVar.mo3597B(I);
        }

        /* renamed from: o */
        public void mo3128o(int i, int i2, C0401a0 a0Var, C0424c cVar) {
        }

        /* renamed from: o0 */
        public int mo3547o0() {
            return this.f2890q;
        }

        /* renamed from: o1 */
        public boolean mo3548o1(Runnable runnable) {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: p */
        public void mo3129p(int i, C0424c cVar) {
        }

        /* renamed from: p0 */
        public int mo3549p0() {
            return this.f2888o;
        }

        /* renamed from: p1 */
        public void mo3550p1(View view) {
            this.f2874a.mo3779p(view);
        }

        /* renamed from: q */
        public int mo3130q(C0401a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q0 */
        public boolean mo3551q0() {
            int J = mo3493J();
            for (int i = 0; i < J; i++) {
                LayoutParams layoutParams = mo3492I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q1 */
        public void mo3552q1(int i) {
            if (mo3492I(i) != null) {
                this.f2874a.mo3780q(i);
            }
        }

        /* renamed from: r */
        public int mo3083r(C0401a0 a0Var) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean mo3553r0() {
            return this.f2882i;
        }

        /* renamed from: r1 */
        public boolean mo3554r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo3555s1(recyclerView, view, rect, z, false);
        }

        /* renamed from: s */
        public int mo3084s(C0401a0 a0Var) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo3133s0() {
            return this.f2883j;
        }

        /* renamed from: s1 */
        public boolean mo3555s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = m3262L(view, rect);
            int i = L[0];
            int i2 = L[1];
            if ((z2 && !m3266t0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo3260n1(i, i2);
            }
            return true;
        }

        /* renamed from: t */
        public int mo3135t(C0401a0 a0Var) {
            return 0;
        }

        /* renamed from: t1 */
        public void mo3556t1() {
            RecyclerView recyclerView = this.f2875b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: u */
        public int mo3085u(C0401a0 a0Var) {
            return 0;
        }

        /* renamed from: u0 */
        public final boolean mo3557u0() {
            return this.f2885l;
        }

        /* renamed from: u1 */
        public void mo3558u1() {
            this.f2881h = true;
        }

        /* renamed from: v */
        public int mo3087v(C0401a0 a0Var) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean mo3559v0(C0433v vVar, C0401a0 a0Var) {
            return false;
        }

        /* renamed from: w */
        public void mo3560w(C0433v vVar) {
            for (int J = mo3493J() - 1; J >= 0; J--) {
                m3267v1(vVar, J, mo3492I(J));
            }
        }

        /* renamed from: w1 */
        public int mo3088w1(int i, C0433v vVar, C0401a0 a0Var) {
            return 0;
        }

        /* renamed from: x */
        public void mo3561x(int i) {
            m3269y(i, mo3492I(i));
        }

        /* renamed from: x0 */
        public boolean mo3562x0() {
            C0438z zVar = this.f2880g;
            return zVar != null && zVar.mo3647h();
        }

        /* renamed from: x1 */
        public void mo3137x1(int i) {
        }

        /* renamed from: y0 */
        public boolean mo3563y0(View view, boolean z, boolean z2) {
            boolean z3 = this.f2878e.mo3908b(view, 24579) && this.f2879f.mo3908b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: y1 */
        public int mo3090y1(int i, C0433v vVar, C0401a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public void mo3564z(RecyclerView recyclerView) {
            this.f2882i = true;
            mo3488G0(recyclerView);
        }

        /* renamed from: z0 */
        public void mo3565z0(View view, int i, int i2, int i3, int i4) {
            C0426p pVar = (C0426p) view.getLayoutParams();
            Rect rect = pVar.f2899b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z1 */
        public void mo3566z1(RecyclerView recyclerView) {
            mo3476A1(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0426p extends MarginLayoutParams {

        /* renamed from: a */
        C0407d0 f2898a;

        /* renamed from: b */
        final Rect f2899b = new Rect();

        /* renamed from: c */
        boolean f2900c = true;

        /* renamed from: d */
        boolean f2901d = false;

        public C0426p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo3573a() {
            return this.f2898a.mo3372m();
        }

        /* renamed from: b */
        public boolean mo3574b() {
            return this.f2898a.mo3385y();
        }

        /* renamed from: c */
        public boolean mo3575c() {
            return this.f2898a.mo3382v();
        }

        /* renamed from: d */
        public boolean mo3576d() {
            return this.f2898a.mo3379t();
        }

        public C0426p(int i, int i2) {
            super(i, i2);
        }

        public C0426p(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0426p(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0426p(C0426p pVar) {
            super(pVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0427q {
        /* renamed from: a */
        void mo3577a(View view);

        /* renamed from: b */
        void mo3578b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0428r {
        /* renamed from: a */
        public abstract boolean mo3579a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0429s {
        /* renamed from: a */
        boolean mo3580a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo3581b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo3582c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0430t {
        /* renamed from: a */
        public void mo3583a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo3584b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0431u {

        /* renamed from: a */
        SparseArray<C0432a> f2902a = new SparseArray<>();

        /* renamed from: b */
        private int f2903b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C0432a {

            /* renamed from: a */
            final ArrayList<C0407d0> f2904a = new ArrayList<>();

            /* renamed from: b */
            int f2905b = 5;

            /* renamed from: c */
            long f2906c = 0;

            /* renamed from: d */
            long f2907d = 0;

            C0432a() {
            }
        }

        /* renamed from: g */
        private C0432a m3425g(int i) {
            C0432a aVar = (C0432a) this.f2902a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0432a aVar2 = new C0432a();
            this.f2902a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3585a() {
            this.f2903b++;
        }

        /* renamed from: b */
        public void mo3586b() {
            for (int i = 0; i < this.f2902a.size(); i++) {
                ((C0432a) this.f2902a.valueAt(i)).f2904a.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3587c() {
            this.f2903b--;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3588d(int i, long j) {
            C0432a g = m3425g(i);
            g.f2907d = mo3593j(g.f2907d, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3589e(int i, long j) {
            C0432a g = m3425g(i);
            g.f2906c = mo3593j(g.f2906c, j);
        }

        /* renamed from: f */
        public C0407d0 mo3590f(int i) {
            C0432a aVar = (C0432a) this.f2902a.get(i);
            if (aVar != null && !aVar.f2904a.isEmpty()) {
                ArrayList<C0407d0> arrayList = aVar.f2904a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((C0407d0) arrayList.get(size)).mo3377r()) {
                        return (C0407d0) arrayList.remove(size);
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo3591h(C0410g gVar, C0410g gVar2, boolean z) {
            if (gVar != null) {
                mo3587c();
            }
            if (!z && this.f2903b == 0) {
                mo3586b();
            }
            if (gVar2 != null) {
                mo3585a();
            }
        }

        /* renamed from: i */
        public void mo3592i(C0407d0 d0Var) {
            int l = d0Var.mo3371l();
            ArrayList<C0407d0> arrayList = m3425g(l).f2904a;
            if (((C0432a) this.f2902a.get(l)).f2905b > arrayList.size()) {
                d0Var.mo3352D();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public long mo3593j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo3594k(int i, long j, long j2) {
            long j3 = m3425g(i).f2907d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public boolean mo3595l(int i, long j, long j2) {
            long j3 = m3425g(i).f2906c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0433v {

        /* renamed from: a */
        final ArrayList<C0407d0> f2908a;

        /* renamed from: b */
        ArrayList<C0407d0> f2909b = null;

        /* renamed from: c */
        final ArrayList<C0407d0> f2910c = new ArrayList<>();

        /* renamed from: d */
        private final List<C0407d0> f2911d;

        /* renamed from: e */
        private int f2912e;

        /* renamed from: f */
        int f2913f;

        /* renamed from: g */
        C0431u f2914g;

        /* renamed from: h */
        private C0403b0 f2915h;

        public C0433v() {
            ArrayList<C0407d0> arrayList = new ArrayList<>();
            this.f2908a = arrayList;
            this.f2911d = Collections.unmodifiableList(arrayList);
            this.f2912e = 2;
            this.f2913f = 2;
        }

        /* renamed from: H */
        private boolean m3437H(C0407d0 d0Var, int i, int i2, long j) {
            d0Var.f2858s = RecyclerView.this;
            int l = d0Var.mo3371l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f2914g.mo3594k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f2801u.mo3407a(d0Var, i);
            this.f2914g.mo3588d(d0Var.mo3371l(), RecyclerView.this.getNanoTime() - nanoTime);
            m3438b(d0Var);
            if (RecyclerView.this.f2798s0.mo3334e()) {
                d0Var.f2847h = i2;
            }
            return true;
        }

        /* renamed from: b */
        private void m3438b(C0407d0 d0Var) {
            if (RecyclerView.this.mo3320v0()) {
                View view = d0Var.f2841b;
                if (ViewCompat.m5510A(view) == 0) {
                    ViewCompat.m5591x0(view, 1);
                }
                RecyclerViewAccessibilityDelegate lVar = RecyclerView.this.f2812z0;
                if (lVar != null) {
                    AccessibilityDelegateCompat n = lVar.mo3878n();
                    if (n instanceof C0475a) {
                        ((C0475a) n).mo3887o(view);
                    }
                    ViewCompat.m5573o0(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m3439q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m3439q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: r */
        private void m3440r(C0407d0 d0Var) {
            View view = d0Var.f2841b;
            if (view instanceof ViewGroup) {
                m3439q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A */
        public void mo3596A(int i) {
            mo3608a((C0407d0) this.f2910c.get(i), true);
            this.f2910c.remove(i);
        }

        /* renamed from: B */
        public void mo3597B(View view) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (h0.mo3384x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (h0.mo3383w()) {
                h0.mo3359K();
            } else if (h0.mo3360L()) {
                h0.mo3365e();
            }
            mo3598C(h0);
            if (RecyclerView.this.f2770a0 != null && !h0.mo3381u()) {
                RecyclerView.this.f2770a0.mo3451j(h0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: C */
        public void mo3598C(C0407d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.mo3383w() || d0Var.f2841b.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo3383w());
                sb.append(" isAttached:");
                if (d0Var.f2841b.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo3183Q());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo3384x()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(d0Var);
                sb2.append(RecyclerView.this.mo3183Q());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!d0Var.mo3358J()) {
                boolean h = d0Var.mo3367h();
                C0410g gVar = RecyclerView.this.f2801u;
                if ((gVar != null && h && gVar.mo3423q(d0Var)) || d0Var.mo3381u()) {
                    if (this.f2913f <= 0 || d0Var.mo3375p(526)) {
                        z = false;
                    } else {
                        int size = this.f2910c.size();
                        if (size >= this.f2913f && size > 0) {
                            mo3596A(0);
                            size--;
                        }
                        if (RecyclerView.f2735e && size > 0 && !RecyclerView.this.f2796r0.mo3840d(d0Var.f2843d)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f2796r0.mo3840d(((C0407d0) this.f2910c.get(i)).f2843d)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f2910c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo3608a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.f2789o.mo3929q(d0Var);
                        if (!z2 && !z3 && h) {
                            d0Var.f2858s = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f2789o.mo3929q(d0Var);
                if (!z2) {
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.mo3183Q());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: D */
        public void mo3599D(View view) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            if (!h0.mo3375p(12) && h0.mo3385y() && !RecyclerView.this.mo3276p(h0)) {
                if (this.f2909b == null) {
                    this.f2909b = new ArrayList<>();
                }
                h0.mo3356H(this, true);
                this.f2909b.add(h0);
            } else if (!h0.mo3379t() || h0.mo3382v() || RecyclerView.this.f2801u.mo3413g()) {
                h0.mo3356H(this, false);
                this.f2908a.add(h0);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.mo3183Q());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: E */
        public void mo3600E(C0431u uVar) {
            C0431u uVar2 = this.f2914g;
            if (uVar2 != null) {
                uVar2.mo3587c();
            }
            this.f2914g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f2914g.mo3585a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: F */
        public void mo3601F(C0403b0 b0Var) {
        }

        /* renamed from: G */
        public void mo3602G(int i) {
            this.f2912e = i;
            mo3605K();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01bf  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0407d0 mo3603I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01e2
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f2798s0
                int r1 = r1.mo3331b()
                if (r3 >= r1) goto L_0x01e2
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f2798s0
                boolean r1 = r1.mo3334e()
                r7 = 1
                r2 = 0
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo3614h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo3619m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo3606L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo3362b(r5)
                boolean r5 = r1.mo3383w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f2841b
                r5.removeDetachedView(r9, r8)
                r1.mo3359K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo3360L()
                if (r5 == 0) goto L_0x0057
                r1.mo3365e()
            L_0x0057:
                r6.mo3598C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0134
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f2785m
                int r5 = r5.mo3751m(r3)
                if (r5 < 0) goto L_0x00fc
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f2801u
                int r9 = r9.mo3409c()
                if (r5 >= r9) goto L_0x00fc
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f2801u
                int r9 = r9.mo3411e(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.f2801u
                boolean r10 = r10.mo3413g()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.f2801u
                long r10 = r1.mo3410d(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo3618l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f2843d = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x009e
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r6.f2915h
                if (r0 != 0) goto L_0x009d
                goto L_0x009e
            L_0x009d:
                throw r2
            L_0x009e:
                if (r1 != 0) goto L_0x00b5
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo3615i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.mo3590f(r9)
                if (r0 == 0) goto L_0x00b4
                r0.mo3352D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f2732b
                if (r1 == 0) goto L_0x00b4
                r6.m3440r(r0)
            L_0x00b4:
                r1 = r0
            L_0x00b5:
                if (r1 != 0) goto L_0x0134
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00d3
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f2914g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo3595l(r11, r12, r14)
                if (r5 != 0) goto L_0x00d3
                return r2
            L_0x00d3:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.f2801u
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.mo3408b(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f2735e
                if (r5 == 0) goto L_0x00ee
                android.view.View r5 = r2.f2841b
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m3001W(r5)
                if (r5 == 0) goto L_0x00ee
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f2842c = r10
            L_0x00ee:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f2914g
                long r10 = r10 - r0
                r5.mo3589e(r9, r10)
                r9 = r2
                goto L_0x0135
            L_0x00fc:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f2798s0
                int r2 = r2.mo3331b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo3183Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0134:
                r9 = r1
            L_0x0135:
                r10 = r4
                if (r10 == 0) goto L_0x016e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f2798s0
                boolean r0 = r0.mo3334e()
                if (r0 != 0) goto L_0x016e
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.mo3375p(r0)
                if (r1 == 0) goto L_0x016e
                r9.mo3354F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f2798s0
                boolean r0 = r0.f2824k
                if (r0 == 0) goto L_0x016e
                int r0 = androidx.recyclerview.widget.RecyclerView.C0415l.m3228e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.f2770a0
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f2798s0
                java.util.List r4 = r9.mo3374o()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.mo3461t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo3188T0(r9, r0)
            L_0x016e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f2798s0
                boolean r0 = r0.mo3334e()
                if (r0 == 0) goto L_0x0181
                boolean r0 = r9.mo3378s()
                if (r0 == 0) goto L_0x0181
                r9.f2847h = r3
                goto L_0x0194
            L_0x0181:
                boolean r0 = r9.mo3378s()
                if (r0 == 0) goto L_0x0196
                boolean r0 = r9.mo3386z()
                if (r0 != 0) goto L_0x0196
                boolean r0 = r9.mo3379t()
                if (r0 == 0) goto L_0x0194
                goto L_0x0196
            L_0x0194:
                r0 = 0
                goto L_0x01a9
            L_0x0196:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f2785m
                int r2 = r0.mo3751m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m3437H(r1, r2, r3, r4)
            L_0x01a9:
                android.view.View r1 = r9.f2841b
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01bf
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0426p) r1
                android.view.View r2 = r9.f2841b
                r2.setLayoutParams(r1)
                goto L_0x01d7
            L_0x01bf:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01d5
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0426p) r1
                android.view.View r2 = r9.f2841b
                r2.setLayoutParams(r1)
                goto L_0x01d7
            L_0x01d5:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0426p) r1
            L_0x01d7:
                r1.f2898a = r9
                if (r10 == 0) goto L_0x01de
                if (r0 == 0) goto L_0x01de
                goto L_0x01df
            L_0x01de:
                r7 = 0
            L_0x01df:
                r1.f2901d = r7
                return r9
            L_0x01e2:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f2798s0
                int r2 = r2.mo3331b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo3183Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0433v.mo3603I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: J */
        public void mo3604J(C0407d0 d0Var) {
            if (d0Var.f2855p) {
                this.f2909b.remove(d0Var);
            } else {
                this.f2908a.remove(d0Var);
            }
            d0Var.f2854o = null;
            d0Var.f2855p = false;
            d0Var.mo3365e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: K */
        public void mo3605K() {
            C0421o oVar = RecyclerView.this.f2803v;
            this.f2913f = this.f2912e + (oVar != null ? oVar.f2886m : 0);
            for (int size = this.f2910c.size() - 1; size >= 0 && this.f2910c.size() > this.f2913f; size--) {
                mo3596A(size);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: L */
        public boolean mo3606L(C0407d0 d0Var) {
            if (d0Var.mo3382v()) {
                return RecyclerView.this.f2798s0.mo3334e();
            }
            int i = d0Var.f2843d;
            if (i < 0 || i >= RecyclerView.this.f2801u.mo3409c()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(d0Var);
                sb.append(RecyclerView.this.mo3183Q());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z = false;
            if (!RecyclerView.this.f2798s0.mo3334e() && RecyclerView.this.f2801u.mo3411e(d0Var.f2843d) != d0Var.mo3371l()) {
                return false;
            }
            if (!RecyclerView.this.f2801u.mo3413g()) {
                return true;
            }
            if (d0Var.mo3370k() == RecyclerView.this.f2801u.mo3410d(d0Var.f2843d)) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: M */
        public void mo3607M(int i, int i2) {
            int i3 = i2 + i;
            for (int size = this.f2910c.size() - 1; size >= 0; size--) {
                C0407d0 d0Var = (C0407d0) this.f2910c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f2843d;
                    if (i4 >= i && i4 < i3) {
                        d0Var.mo3362b(2);
                        mo3596A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3608a(C0407d0 d0Var, boolean z) {
            RecyclerView.m3021r(d0Var);
            View view = d0Var.f2841b;
            RecyclerViewAccessibilityDelegate lVar = RecyclerView.this.f2812z0;
            if (lVar != null) {
                AccessibilityDelegateCompat n = lVar.mo3878n();
                ViewCompat.m5573o0(view, n instanceof C0475a ? ((C0475a) n).mo3886n(view) : null);
            }
            if (z) {
                mo3613g(d0Var);
            }
            d0Var.f2858s = null;
            mo3615i().mo3592i(d0Var);
        }

        /* renamed from: c */
        public void mo3609c() {
            this.f2908a.clear();
            mo3630z();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3610d() {
            int size = this.f2910c.size();
            for (int i = 0; i < size; i++) {
                ((C0407d0) this.f2910c.get(i)).mo3363c();
            }
            int size2 = this.f2908a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C0407d0) this.f2908a.get(i2)).mo3363c();
            }
            ArrayList<C0407d0> arrayList = this.f2909b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C0407d0) this.f2909b.get(i3)).mo3363c();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3611e() {
            this.f2908a.clear();
            ArrayList<C0407d0> arrayList = this.f2909b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo3612f(int i) {
            if (i < 0 || i >= RecyclerView.this.f2798s0.mo3331b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f2798s0.mo3331b());
                sb.append(RecyclerView.this.mo3183Q());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.f2798s0.mo3334e()) {
                return i;
            } else {
                return RecyclerView.this.f2785m.mo3751m(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo3613g(C0407d0 d0Var) {
            C0434w wVar = RecyclerView.this.f2805w;
            if (wVar != null) {
                wVar.mo3631a(d0Var);
            }
            C0410g gVar = RecyclerView.this.f2801u;
            if (gVar != null) {
                gVar.mo3426t(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2798s0 != null) {
                recyclerView.f2789o.mo3929q(d0Var);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public C0407d0 mo3614h(int i) {
            ArrayList<C0407d0> arrayList = this.f2909b;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C0407d0 d0Var = (C0407d0) this.f2909b.get(i3);
                        if (d0Var.mo3360L() || d0Var.mo3372m() != i) {
                            i3++;
                        } else {
                            d0Var.mo3362b(32);
                            return d0Var;
                        }
                    }
                    if (RecyclerView.this.f2801u.mo3413g()) {
                        int m = RecyclerView.this.f2785m.mo3751m(i);
                        if (m > 0 && m < RecyclerView.this.f2801u.mo3409c()) {
                            long d = RecyclerView.this.f2801u.mo3410d(m);
                            while (i2 < size) {
                                C0407d0 d0Var2 = (C0407d0) this.f2909b.get(i2);
                                if (d0Var2.mo3360L() || d0Var2.mo3370k() != d) {
                                    i2++;
                                } else {
                                    d0Var2.mo3362b(32);
                                    return d0Var2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public C0431u mo3615i() {
            if (this.f2914g == null) {
                this.f2914g = new C0431u();
            }
            return this.f2914g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo3616j() {
            return this.f2908a.size();
        }

        /* renamed from: k */
        public List<C0407d0> mo3617k() {
            return this.f2911d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public C0407d0 mo3618l(long j, int i, boolean z) {
            for (int size = this.f2908a.size() - 1; size >= 0; size--) {
                C0407d0 d0Var = (C0407d0) this.f2908a.get(size);
                if (d0Var.mo3370k() == j && !d0Var.mo3360L()) {
                    if (i == d0Var.mo3371l()) {
                        d0Var.mo3362b(32);
                        if (d0Var.mo3382v() && !RecyclerView.this.f2798s0.mo3334e()) {
                            d0Var.mo3354F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f2908a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f2841b, false);
                        mo3629y(d0Var.f2841b);
                    }
                }
            }
            int size2 = this.f2910c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0407d0 d0Var2 = (C0407d0) this.f2910c.get(size2);
                if (d0Var2.mo3370k() == j && !d0Var2.mo3377r()) {
                    if (i == d0Var2.mo3371l()) {
                        if (!z) {
                            this.f2910c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo3596A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public C0407d0 mo3619m(int i, boolean z) {
            int size = this.f2908a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0407d0 d0Var = (C0407d0) this.f2908a.get(i3);
                if (d0Var.mo3360L() || d0Var.mo3372m() != i || d0Var.mo3379t() || (!RecyclerView.this.f2798s0.f2821h && d0Var.mo3382v())) {
                    i3++;
                } else {
                    d0Var.mo3362b(32);
                    return d0Var;
                }
            }
            if (!z) {
                View e = RecyclerView.this.f2787n.mo3770e(i);
                if (e != null) {
                    C0407d0 h0 = RecyclerView.m3012h0(e);
                    RecyclerView.this.f2787n.mo3782s(e);
                    int m = RecyclerView.this.f2787n.mo3776m(e);
                    if (m != -1) {
                        RecyclerView.this.f2787n.mo3769d(m);
                        mo3599D(e);
                        h0.mo3362b(8224);
                        return h0;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("layout index should not be -1 after unhiding a view:");
                    sb.append(h0);
                    sb.append(RecyclerView.this.mo3183Q());
                    throw new IllegalStateException(sb.toString());
                }
            }
            int size2 = this.f2910c.size();
            while (i2 < size2) {
                C0407d0 d0Var2 = (C0407d0) this.f2910c.get(i2);
                if (d0Var2.mo3379t() || d0Var2.mo3372m() != i || d0Var2.mo3377r()) {
                    i2++;
                } else {
                    if (!z) {
                        this.f2910c.remove(i2);
                    }
                    return d0Var2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public View mo3620n(int i) {
            return ((C0407d0) this.f2908a.get(i)).f2841b;
        }

        /* renamed from: o */
        public View mo3621o(int i) {
            return mo3622p(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public View mo3622p(int i, boolean z) {
            return mo3603I(i, z, Long.MAX_VALUE).f2841b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public void mo3623s() {
            int size = this.f2910c.size();
            for (int i = 0; i < size; i++) {
                C0426p pVar = (C0426p) ((C0407d0) this.f2910c.get(i)).f2841b.getLayoutParams();
                if (pVar != null) {
                    pVar.f2900c = true;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public void mo3624t() {
            int size = this.f2910c.size();
            for (int i = 0; i < size; i++) {
                C0407d0 d0Var = (C0407d0) this.f2910c.get(i);
                if (d0Var != null) {
                    d0Var.mo3362b(6);
                    d0Var.mo3361a(null);
                }
            }
            C0410g gVar = RecyclerView.this.f2801u;
            if (gVar == null || !gVar.mo3413g()) {
                mo3630z();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public void mo3625u(int i, int i2) {
            int size = this.f2910c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0407d0 d0Var = (C0407d0) this.f2910c.get(i3);
                if (d0Var != null && d0Var.f2843d >= i) {
                    d0Var.mo3349A(i2, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo3626v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f2910c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0407d0 d0Var = (C0407d0) this.f2910c.get(i6);
                if (d0Var != null) {
                    int i7 = d0Var.f2843d;
                    if (i7 >= i4 && i7 <= i3) {
                        if (i7 == i) {
                            d0Var.mo3349A(i2 - i, false);
                        } else {
                            d0Var.mo3349A(i5, false);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public void mo3627w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2910c.size() - 1; size >= 0; size--) {
                C0407d0 d0Var = (C0407d0) this.f2910c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f2843d;
                    if (i4 >= i3) {
                        d0Var.mo3349A(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo3362b(8);
                        mo3596A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public void mo3628x(C0410g gVar, C0410g gVar2, boolean z) {
            mo3609c();
            mo3615i().mo3591h(gVar, gVar2, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: y */
        public void mo3629y(View view) {
            C0407d0 h0 = RecyclerView.m3012h0(view);
            h0.f2854o = null;
            h0.f2855p = false;
            h0.mo3365e();
            mo3598C(h0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public void mo3630z() {
            for (int size = this.f2910c.size() - 1; size >= 0; size--) {
                mo3596A(size);
            }
            this.f2910c.clear();
            if (RecyclerView.f2735e) {
                RecyclerView.this.f2796r0.mo3838b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C0434w {
        /* renamed from: a */
        void mo3631a(C0407d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C0435x extends C0412i {
        C0435x() {
        }

        /* renamed from: a */
        public void mo3436a() {
            RecyclerView.this.mo3261o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2798s0.f2820g = true;
            recyclerView.mo3185R0(true);
            if (!RecyclerView.this.f2785m.mo3754p()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        public void mo3438c(int i, int i2, Object obj) {
            RecyclerView.this.mo3261o(null);
            if (RecyclerView.this.f2785m.mo3756r(i, i2, obj)) {
                mo3632f();
            }
        }

        /* renamed from: d */
        public void mo3439d(int i, int i2) {
            RecyclerView.this.mo3261o(null);
            if (RecyclerView.this.f2785m.mo3757s(i, i2)) {
                mo3632f();
            }
        }

        /* renamed from: e */
        public void mo3440e(int i, int i2) {
            RecyclerView.this.mo3261o(null);
            if (RecyclerView.this.f2785m.mo3758t(i, i2)) {
                mo3632f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo3632f() {
            if (RecyclerView.f2734d) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2742B && recyclerView.f2740A) {
                    ViewCompat.m5557g0(recyclerView, recyclerView.f2793q);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f2758L = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0436y extends AbsSavedState {
        public static final Creator<C0436y> CREATOR = new C0437a();

        /* renamed from: c */
        Parcelable f2918c;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C0437a implements ClassLoaderCreator<C0436y> {
            C0437a() {
            }

            /* renamed from: a */
            public C0436y createFromParcel(Parcel parcel) {
                return new C0436y(parcel, null);
            }

            /* renamed from: b */
            public C0436y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0436y(parcel, classLoader);
            }

            /* renamed from: c */
            public C0436y[] newArray(int i) {
                return new C0436y[i];
            }
        }

        C0436y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0421o.class.getClassLoader();
            }
            this.f2918c = parcel.readParcelable(classLoader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo3633m(C0436y yVar) {
            this.f2918c = yVar.f2918c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f2918c, 0);
        }

        C0436y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0438z {

        /* renamed from: a */
        private int f2919a = -1;

        /* renamed from: b */
        private RecyclerView f2920b;

        /* renamed from: c */
        private C0421o f2921c;

        /* renamed from: d */
        private boolean f2922d;

        /* renamed from: e */
        private boolean f2923e;

        /* renamed from: f */
        private View f2924f;

        /* renamed from: g */
        private final C0439a f2925g = new C0439a(0, 0);

        /* renamed from: h */
        private boolean f2926h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C0439a {

            /* renamed from: a */
            private int f2927a;

            /* renamed from: b */
            private int f2928b;

            /* renamed from: c */
            private int f2929c;

            /* renamed from: d */
            private int f2930d;

            /* renamed from: e */
            private Interpolator f2931e;

            /* renamed from: f */
            private boolean f2932f;

            /* renamed from: g */
            private int f2933g;

            public C0439a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m3504e() {
                if (this.f2931e != null && this.f2929c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f2929c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo3658a() {
                return this.f2930d >= 0;
            }

            /* renamed from: b */
            public void mo3659b(int i) {
                this.f2930d = i;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public void mo3660c(RecyclerView recyclerView) {
                int i = this.f2930d;
                if (i >= 0) {
                    this.f2930d = -1;
                    recyclerView.mo3325y0(i);
                    this.f2932f = false;
                    return;
                }
                if (this.f2932f) {
                    m3504e();
                    recyclerView.f2792p0.mo3342f(this.f2927a, this.f2928b, this.f2929c, this.f2931e);
                    int i2 = this.f2933g + 1;
                    this.f2933g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2932f = false;
                } else {
                    this.f2933g = 0;
                }
            }

            /* renamed from: d */
            public void mo3661d(int i, int i2, int i3, Interpolator interpolator) {
                this.f2927a = i;
                this.f2928b = i2;
                this.f2929c = i3;
                this.f2931e = interpolator;
                this.f2932f = true;
            }

            public C0439a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2930d = -1;
                this.f2932f = false;
                this.f2933g = 0;
                this.f2927a = i;
                this.f2928b = i2;
                this.f2929c = i3;
                this.f2931e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C0440b {
            /* renamed from: a */
            PointF mo3117a(int i);
        }

        /* renamed from: a */
        public PointF mo3640a(int i) {
            C0421o e = mo3644e();
            if (e instanceof C0440b) {
                return ((C0440b) e).mo3117a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(C0440b.class.getCanonicalName());
            Log.w("RecyclerView", sb.toString());
            return null;
        }

        /* renamed from: b */
        public View mo3641b(int i) {
            return this.f2920b.f2803v.mo3101C(i);
        }

        /* renamed from: c */
        public int mo3642c() {
            return this.f2920b.f2803v.mo3493J();
        }

        /* renamed from: d */
        public int mo3643d(View view) {
            return this.f2920b.mo3220f0(view);
        }

        /* renamed from: e */
        public C0421o mo3644e() {
            return this.f2921c;
        }

        /* renamed from: f */
        public int mo3645f() {
            return this.f2919a;
        }

        /* renamed from: g */
        public boolean mo3646g() {
            return this.f2922d;
        }

        /* renamed from: h */
        public boolean mo3647h() {
            return this.f2923e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo3648i(PointF pointF) {
            float f = pointF.x;
            float f2 = f * f;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) (f2 + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo3649j(int i, int i2) {
            RecyclerView recyclerView = this.f2920b;
            if (this.f2919a == -1 || recyclerView == null) {
                mo3657r();
            }
            if (this.f2922d && this.f2924f == null && this.f2921c != null) {
                PointF a = mo3640a(this.f2919a);
                if (a != null) {
                    float f = a.x;
                    if (!(f == 0.0f && a.y == 0.0f)) {
                        recyclerView.mo3249i1((int) Math.signum(f), (int) Math.signum(a.y), null);
                    }
                }
            }
            this.f2922d = false;
            View view = this.f2924f;
            if (view != null) {
                if (mo3643d(view) == this.f2919a) {
                    mo3654o(this.f2924f, recyclerView.f2798s0, this.f2925g);
                    this.f2925g.mo3660c(recyclerView);
                    mo3657r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2924f = null;
                }
            }
            if (this.f2923e) {
                mo3651l(i, i2, recyclerView.f2798s0, this.f2925g);
                boolean a2 = this.f2925g.mo3658a();
                this.f2925g.mo3660c(recyclerView);
                if (a2 && this.f2923e) {
                    this.f2922d = true;
                    recyclerView.f2792p0.mo3341e();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo3650k(View view) {
            if (mo3643d(view) == mo3645f()) {
                this.f2924f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo3651l(int i, int i2, C0401a0 a0Var, C0439a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo3652m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo3653n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo3654o(View view, C0401a0 a0Var, C0439a aVar);

        /* renamed from: p */
        public void mo3655p(int i) {
            this.f2919a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo3656q(RecyclerView recyclerView, C0421o oVar) {
            recyclerView.f2792p0.mo3343g();
            if (this.f2926h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", sb.toString());
            }
            this.f2920b = recyclerView;
            this.f2921c = oVar;
            int i = this.f2919a;
            if (i != -1) {
                recyclerView.f2798s0.f2814a = i;
                this.f2923e = true;
                this.f2922d = true;
                this.f2924f = mo3641b(mo3645f());
                mo3652m();
                this.f2920b.f2792p0.mo3341e();
                this.f2926h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo3657r() {
            if (this.f2923e) {
                this.f2923e = false;
                mo3653n();
                this.f2920b.f2798s0.f2814a = -1;
                this.f2924f = null;
                this.f2919a = -1;
                this.f2922d = false;
                this.f2921c.mo3529f1(this);
                this.f2921c = null;
                this.f2920b = null;
            }
        }
    }

    static {
        int i = VERSION.SDK_INT;
        f2732b = i == 18 || i == 19 || i == 20;
        f2733c = i >= 23;
        f2734d = i >= 16;
        f2735e = i >= 21;
        f2736f = i <= 15;
        f2737g = i <= 15;
        Class cls = Integer.TYPE;
        f2738h = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0694a.recyclerViewStyle);
    }

    /* renamed from: B */
    private void m2988B() {
        int i = this.f2757K;
        this.f2757K = 0;
        if (i != 0 && mo3320v0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            AccessibilityEventCompat.m5333b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: D */
    private void m2989D() {
        boolean z = true;
        this.f2798s0.mo3330a(1);
        mo3184R(this.f2798s0);
        this.f2798s0.f2823j = false;
        mo3287s1();
        this.f2789o.mo3919f();
        mo3171I0();
        m2995Q0();
        m3010f1();
        C0401a0 a0Var = this.f2798s0;
        if (!a0Var.f2824k || !this.f2806w0) {
            z = false;
        }
        a0Var.f2822i = z;
        this.f2806w0 = false;
        this.f2804v0 = false;
        a0Var.f2821h = a0Var.f2825l;
        a0Var.f2819f = this.f2801u.mo3409c();
        m2999V(this.f2743B0);
        if (this.f2798s0.f2824k) {
            int g = this.f2787n.mo3772g();
            for (int i = 0; i < g; i++) {
                C0407d0 h0 = m3012h0(this.f2787n.mo3771f(i));
                if (!h0.mo3358J() && (!h0.mo3379t() || this.f2801u.mo3413g())) {
                    this.f2789o.mo3918e(h0, this.f2770a0.mo3461t(this.f2798s0, h0, C0415l.m3228e(h0), h0.mo3374o()));
                    if (this.f2798s0.f2822i && h0.mo3385y() && !h0.mo3382v() && !h0.mo3358J() && !h0.mo3379t()) {
                        this.f2789o.mo3916c(mo3209d0(h0), h0);
                    }
                }
            }
        }
        if (this.f2798s0.f2825l) {
            mo3223g1();
            C0401a0 a0Var2 = this.f2798s0;
            boolean z2 = a0Var2.f2820g;
            a0Var2.f2820g = false;
            this.f2803v.mo3075X0(this.f2781k, a0Var2);
            this.f2798s0.f2820g = z2;
            for (int i2 = 0; i2 < this.f2787n.mo3772g(); i2++) {
                C0407d0 h02 = m3012h0(this.f2787n.mo3771f(i2));
                if (!h02.mo3358J() && !this.f2789o.mo3922i(h02)) {
                    int e = C0415l.m3228e(h02);
                    boolean p = h02.mo3375p(8192);
                    if (!p) {
                        e |= 4096;
                    }
                    C0418c t = this.f2770a0.mo3461t(this.f2798s0, h02, e, h02.mo3374o());
                    if (p) {
                        mo3188T0(h02, t);
                    } else {
                        this.f2789o.mo3914a(h02, t);
                    }
                }
            }
            mo3286s();
        } else {
            mo3286s();
        }
        mo3173J0();
        mo3318u1(false);
        this.f2798s0.f2818e = 2;
    }

    /* renamed from: E */
    private void m2990E() {
        mo3287s1();
        mo3171I0();
        this.f2798s0.mo3330a(6);
        this.f2785m.mo3749j();
        this.f2798s0.f2819f = this.f2801u.mo3409c();
        C0401a0 a0Var = this.f2798s0;
        a0Var.f2817d = 0;
        a0Var.f2821h = false;
        this.f2803v.mo3075X0(this.f2781k, a0Var);
        C0401a0 a0Var2 = this.f2798s0;
        a0Var2.f2820g = false;
        this.f2783l = null;
        a0Var2.f2824k = a0Var2.f2824k && this.f2770a0 != null;
        a0Var2.f2818e = 4;
        mo3173J0();
        mo3318u1(false);
    }

    /* renamed from: F */
    private void m2991F() {
        this.f2798s0.mo3330a(4);
        mo3287s1();
        mo3171I0();
        C0401a0 a0Var = this.f2798s0;
        a0Var.f2818e = 1;
        if (a0Var.f2824k) {
            for (int g = this.f2787n.mo3772g() - 1; g >= 0; g--) {
                C0407d0 h0 = m3012h0(this.f2787n.mo3771f(g));
                if (!h0.mo3358J()) {
                    long d0 = mo3209d0(h0);
                    C0418c s = this.f2770a0.mo3460s(this.f2798s0, h0);
                    C0407d0 g2 = this.f2789o.mo3920g(d0);
                    if (g2 == null || g2.mo3358J()) {
                        this.f2789o.mo3917d(h0, s);
                    } else {
                        boolean h = this.f2789o.mo3921h(g2);
                        boolean h2 = this.f2789o.mo3921h(h0);
                        if (!h || g2 != h0) {
                            C0418c n = this.f2789o.mo3926n(g2);
                            this.f2789o.mo3917d(h0, s);
                            C0418c m = this.f2789o.mo3925m(h0);
                            if (n == null) {
                                m3018n0(d0, h0, g2);
                            } else {
                                m3017m(g2, h0, n, m, h, h2);
                            }
                        } else {
                            this.f2789o.mo3917d(h0, s);
                        }
                    }
                }
            }
            this.f2789o.mo3927o(this.f2755I0);
        }
        this.f2803v.mo3542l1(this.f2781k);
        C0401a0 a0Var2 = this.f2798s0;
        a0Var2.f2816c = a0Var2.f2819f;
        this.f2761O = false;
        this.f2762P = false;
        a0Var2.f2824k = false;
        a0Var2.f2825l = false;
        this.f2803v.f2881h = false;
        ArrayList<C0407d0> arrayList = this.f2781k.f2909b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0421o oVar = this.f2803v;
        if (oVar.f2887n) {
            oVar.f2886m = 0;
            oVar.f2887n = false;
            this.f2781k.mo3605K();
        }
        this.f2803v.mo3076Y0(this.f2798s0);
        mo3173J0();
        mo3318u1(false);
        this.f2789o.mo3919f();
        int[] iArr = this.f2743B0;
        if (m3027y(iArr[0], iArr[1])) {
            mo3172J(0, 0);
        }
        m2998U0();
        m3006d1();
    }

    /* renamed from: L */
    private boolean m2992L(MotionEvent motionEvent) {
        C0429s sVar = this.f2811z;
        if (sVar != null) {
            sVar.mo3581b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f2811z = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m2997U(motionEvent);
        }
    }

    /* renamed from: L0 */
    private void m2993L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2772c0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2772c0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f2776g0 = x;
            this.f2774e0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f2777h0 = y;
            this.f2775f0 = y;
        }
    }

    /* renamed from: P0 */
    private boolean m2994P0() {
        return this.f2770a0 != null && this.f2803v.mo3066L1();
    }

    /* renamed from: Q0 */
    private void m2995Q0() {
        boolean z;
        if (this.f2761O) {
            this.f2785m.mo3761x();
            if (this.f2762P) {
                this.f2803v.mo3071S0(this);
            }
        }
        if (m2994P0()) {
            this.f2785m.mo3759v();
        } else {
            this.f2785m.mo3749j();
        }
        boolean z2 = false;
        boolean z3 = this.f2804v0 || this.f2806w0;
        C0401a0 a0Var = this.f2798s0;
        if (this.f2746D && this.f2770a0 != null) {
            boolean z4 = this.f2761O;
            if ((z4 || z3 || this.f2803v.f2881h) && (!z4 || this.f2801u.mo3413g())) {
                z = true;
                a0Var.f2824k = z;
                C0401a0 a0Var2 = this.f2798s0;
                if (a0Var2.f2824k && z3 && !this.f2761O && m2994P0()) {
                    z2 = true;
                }
                a0Var2.f2825l = z2;
            }
        }
        z = false;
        a0Var.f2824k = z;
        C0401a0 a0Var22 = this.f2798s0;
        z2 = true;
        a0Var22.f2825l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2996S0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo3178N()
            android.widget.EdgeEffect r3 = r6.f2766T
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.EdgeEffectCompat.m1960a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.mo3180O()
            android.widget.EdgeEffect r3 = r6.f2768V
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.EdgeEffectCompat.m1960a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.mo3182P()
            android.widget.EdgeEffect r9 = r6.f2767U
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.EdgeEffectCompat.m1960a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.mo3176M()
            android.widget.EdgeEffect r9 = r6.f2769W
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.EdgeEffectCompat.m1960a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            p010b.p034g.p043k.ViewCompat.m5555f0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m2996S0(float, float, float, float):void");
    }

    /* renamed from: U */
    private boolean m2997U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f2809y.size();
        int i = 0;
        while (i < size) {
            C0429s sVar = (C0429s) this.f2809y.get(i);
            if (!sVar.mo3580a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f2811z = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: U0 */
    private void m2998U0() {
        if (this.f2790o0 && this.f2801u != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (!f2737g || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                    if (!this.f2787n.mo3777n(focusedChild)) {
                        return;
                    }
                } else if (this.f2787n.mo3772g() == 0) {
                    requestFocus();
                    return;
                }
            }
            View view = null;
            C0407d0 Z = (this.f2798s0.f2827n == -1 || !this.f2801u.mo3413g()) ? null : mo3193Z(this.f2798s0.f2827n);
            if (Z != null && !this.f2787n.mo3777n(Z.f2841b) && Z.f2841b.hasFocusable()) {
                view = Z.f2841b;
            } else if (this.f2787n.mo3772g() > 0) {
                view = m3002X();
            }
            if (view != null) {
                int i = this.f2798s0.f2828o;
                if (((long) i) != -1) {
                    View findViewById = view.findViewById(i);
                    if (findViewById != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                }
                view.requestFocus();
            }
        }
    }

    /* renamed from: V */
    private void m2999V(int[] iArr) {
        int g = this.f2787n.mo3772g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3771f(i3));
            if (!h0.mo3358J()) {
                int m = h0.mo3372m();
                if (m < i) {
                    i = m;
                }
                if (m > i2) {
                    i2 = m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: V0 */
    private void m3000V0() {
        boolean z;
        EdgeEffect edgeEffect = this.f2766T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f2766T.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f2767U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f2767U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2768V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f2768V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2769W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f2769W.isFinished();
        }
        if (z) {
            ViewCompat.m5555f0(this);
        }
    }

    /* renamed from: W */
    static RecyclerView m3001W(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView W = m3001W(viewGroup.getChildAt(i));
            if (W != null) {
                return W;
            }
        }
        return null;
    }

    /* renamed from: X */
    private View m3002X() {
        C0401a0 a0Var = this.f2798s0;
        int i = a0Var.f2826m;
        if (i == -1) {
            i = 0;
        }
        int b = a0Var.mo3331b();
        int i2 = i;
        while (i2 < b) {
            C0407d0 Y = mo3191Y(i2);
            if (Y == null) {
                break;
            } else if (Y.f2841b.hasFocusable()) {
                return Y.f2841b;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C0407d0 Y2 = mo3191Y(min);
            if (Y2 == null) {
                return null;
            }
            if (Y2.f2841b.hasFocusable()) {
                return Y2.f2841b;
            }
        }
    }

    /* renamed from: c1 */
    private void m3004c1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2795r.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0426p) {
            C0426p pVar = (C0426p) layoutParams;
            if (!pVar.f2900c) {
                Rect rect = pVar.f2899b;
                Rect rect2 = this.f2795r;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2795r);
            offsetRectIntoDescendantCoords(view, this.f2795r);
        }
        this.f2803v.mo3555s1(this, view, this.f2795r, !this.f2746D, view2 == null);
    }

    /* renamed from: d1 */
    private void m3006d1() {
        C0401a0 a0Var = this.f2798s0;
        a0Var.f2827n = -1;
        a0Var.f2826m = -1;
        a0Var.f2828o = -1;
    }

    /* renamed from: e1 */
    private void m3008e1() {
        VelocityTracker velocityTracker = this.f2773d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo3321v1(0);
        m3000V0();
    }

    /* renamed from: f1 */
    private void m3010f1() {
        int i;
        C0407d0 d0Var = null;
        View focusedChild = (!this.f2790o0 || !hasFocus() || this.f2801u == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = mo3187T(focusedChild);
        }
        if (d0Var == null) {
            m3006d1();
            return;
        }
        this.f2798s0.f2827n = this.f2801u.mo3413g() ? d0Var.mo3370k() : -1;
        C0401a0 a0Var = this.f2798s0;
        if (this.f2761O) {
            i = -1;
        } else if (d0Var.mo3382v()) {
            i = d0Var.f2844e;
        } else {
            i = d0Var.mo3369j();
        }
        a0Var.f2826m = i;
        this.f2798s0.f2828o = m3014k0(d0Var.f2841b);
    }

    /* renamed from: g */
    private void m3011g(C0407d0 d0Var) {
        View view = d0Var.f2841b;
        boolean z = view.getParent() == this;
        this.f2781k.mo3604J(mo3222g0(view));
        if (d0Var.mo3384x()) {
            this.f2787n.mo3768c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f2787n.mo3767b(view, true);
        } else {
            this.f2787n.mo3775k(view);
        }
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.f2745C0 == null) {
            this.f2745C0 = new NestedScrollingChildHelper(this);
        }
        return this.f2745C0;
    }

    /* renamed from: h0 */
    static C0407d0 m3012h0(View view) {
        if (view == null) {
            return null;
        }
        return ((C0426p) view.getLayoutParams()).f2898a;
    }

    /* renamed from: j0 */
    static void m3013j0(View view, Rect rect) {
        C0426p pVar = (C0426p) view.getLayoutParams();
        Rect rect2 = pVar.f2899b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    /* renamed from: k0 */
    private int m3014k0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: k1 */
    private void m3015k1(C0410g gVar, boolean z, boolean z2) {
        C0410g gVar2 = this.f2801u;
        if (gVar2 != null) {
            gVar2.mo3429w(this.f2779j);
            this.f2801u.mo3422p(this);
        }
        if (!z || z2) {
            mo3189W0();
        }
        this.f2785m.mo3761x();
        C0410g gVar3 = this.f2801u;
        this.f2801u = gVar;
        if (gVar != null) {
            gVar.mo3427u(this.f2779j);
            gVar.mo3418l(this);
        }
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            oVar.mo3483E0(gVar3, this.f2801u);
        }
        this.f2781k.mo3628x(gVar3, this.f2801u, z);
        this.f2798s0.f2820g = true;
    }

    /* renamed from: l0 */
    private String m3016l0(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* renamed from: m */
    private void m3017m(C0407d0 d0Var, C0407d0 d0Var2, C0418c cVar, C0418c cVar2, boolean z, boolean z2) {
        d0Var.mo3355G(false);
        if (z) {
            m3011g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                m3011g(d0Var2);
            }
            d0Var.f2848i = d0Var2;
            m3011g(d0Var);
            this.f2781k.mo3604J(d0Var);
            d0Var2.mo3355G(false);
            d0Var2.f2849j = d0Var;
        }
        if (this.f2770a0.mo3444b(d0Var, d0Var2, cVar, cVar2)) {
            mo3181O0();
        }
    }

    /* renamed from: n0 */
    private void m3018n0(long j, C0407d0 d0Var, C0407d0 d0Var2) {
        int g = this.f2787n.mo3772g();
        for (int i = 0; i < g; i++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3771f(i));
            if (h0 != d0Var && mo3209d0(h0) == j) {
                C0410g gVar = this.f2801u;
                String str = " \n View Holder 2:";
                if (gVar == null || !gVar.mo3413g()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(h0);
                    sb.append(str);
                    sb.append(d0Var);
                    sb.append(mo3183Q());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(h0);
                sb2.append(str);
                sb2.append(d0Var);
                sb2.append(mo3183Q());
                throw new IllegalStateException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(d0Var2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(d0Var);
        sb3.append(mo3183Q());
        Log.e("RecyclerView", sb3.toString());
    }

    /* renamed from: p0 */
    private boolean m3019p0() {
        int g = this.f2787n.mo3772g();
        for (int i = 0; i < g; i++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3771f(i));
            if (h0 != null && !h0.mo3358J() && h0.mo3385y()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private void m3020q() {
        m3008e1();
        setScrollState(0);
    }

    /* renamed from: r */
    static void m3021r(C0407d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f2842c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d0Var.f2841b) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.f2842c = null;
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: r0 */
    private void m3022r0() {
        if (ViewCompat.m5512B(this) == 0) {
            ViewCompat.m5593y0(this, 8);
        }
    }

    /* renamed from: s0 */
    private void m3023s0() {
        this.f2787n = new ChildHelper(new C0408e());
    }

    /* renamed from: w */
    private void m3024w(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        String str2 = ": Could not instantiate the LayoutManager: ";
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String l0 = m3016l0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(l0, false, classLoader).asSubclass(C0421o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f2738h);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0421o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(l0);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(l0);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(str2);
                    sb3.append(l0);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(str2);
                    sb4.append(l0);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(l0);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(l0);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    /* renamed from: x0 */
    private boolean m3025x0(View view, View view2, int i) {
        int i2;
        boolean z = false;
        if (!(view2 == null || view2 == this)) {
            if (mo3186S(view2) == null) {
                return false;
            }
            if (view == null || mo3186S(view) == null) {
                return true;
            }
            this.f2795r.set(0, 0, view.getWidth(), view.getHeight());
            this.f2797s.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.f2795r);
            offsetDescendantRectToMyCoords(view2, this.f2797s);
            char c = 65535;
            int i3 = this.f2803v.mo3514Z() == 1 ? -1 : 1;
            Rect rect = this.f2795r;
            int i4 = rect.left;
            Rect rect2 = this.f2797s;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                c = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                    c = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                        z = true;
                    }
                    return z;
                } else if (i == 17) {
                    if (i2 < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 33) {
                    if (c < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 66) {
                    if (i2 > 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 130) {
                    if (c > 0) {
                        z = true;
                    }
                    return z;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid direction: ");
                    sb.append(i);
                    sb.append(mo3183Q());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: x1 */
    private void m3026x1() {
        this.f2792p0.mo3343g();
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            oVar.mo3495K1();
        }
    }

    /* renamed from: y */
    private boolean m3027y(int i, int i2) {
        m2999V(this.f2743B0);
        int[] iArr = this.f2743B0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo3158A(View view) {
        C0407d0 h0 = m3012h0(view);
        mo3169H0(view);
        C0410g gVar = this.f2801u;
        if (!(gVar == null || h0 == null)) {
            gVar.mo3425s(h0);
        }
        List<C0427q> list = this.f2760N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0427q) this.f2760N.get(size)).mo3578b(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A0 */
    public void mo3159A0() {
        int j = this.f2787n.mo3774j();
        for (int i = 0; i < j; i++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i));
            if (h0 != null && !h0.mo3358J()) {
                h0.mo3362b(6);
            }
        }
        mo3328z0();
        this.f2781k.mo3624t();
    }

    /* renamed from: B0 */
    public void mo3160B0(int i) {
        int g = this.f2787n.mo3772g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f2787n.mo3771f(i2).offsetLeftAndRight(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo3161C() {
        String str = "RecyclerView";
        if (this.f2801u == null) {
            Log.e(str, "No adapter attached; skipping layout");
        } else if (this.f2803v == null) {
            Log.e(str, "No layout manager attached; skipping layout");
        } else {
            C0401a0 a0Var = this.f2798s0;
            a0Var.f2823j = false;
            if (a0Var.f2818e == 1) {
                m2989D();
                this.f2803v.mo3566z1(this);
                m2990E();
            } else if (!this.f2785m.mo3755q() && this.f2803v.mo3547o0() == getWidth() && this.f2803v.mo3511W() == getHeight()) {
                this.f2803v.mo3566z1(this);
            } else {
                this.f2803v.mo3566z1(this);
                m2990E();
            }
            m2991F();
        }
    }

    /* renamed from: C0 */
    public void mo3162C0(int i) {
        int g = this.f2787n.mo3772g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f2787n.mo3771f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D0 */
    public void mo3163D0(int i, int i2) {
        int j = this.f2787n.mo3774j();
        for (int i3 = 0; i3 < j; i3++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i3));
            if (h0 != null && !h0.mo3358J() && h0.f2843d >= i) {
                h0.mo3349A(i2, false);
                this.f2798s0.f2820g = true;
            }
        }
        this.f2781k.mo3625u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E0 */
    public void mo3164E0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int j = this.f2787n.mo3774j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i6 = 0; i6 < j; i6++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i6));
            if (h0 != null) {
                int i7 = h0.f2843d;
                if (i7 >= i4 && i7 <= i3) {
                    if (i7 == i) {
                        h0.mo3349A(i2 - i, false);
                    } else {
                        h0.mo3349A(i5, false);
                    }
                    this.f2798s0.f2820g = true;
                }
            }
        }
        this.f2781k.mo3626v(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F0 */
    public void mo3165F0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f2787n.mo3774j();
        for (int i4 = 0; i4 < j; i4++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i4));
            if (h0 != null && !h0.mo3358J()) {
                int i5 = h0.f2843d;
                if (i5 >= i3) {
                    h0.mo3349A(-i2, z);
                    this.f2798s0.f2820g = true;
                } else if (i5 >= i) {
                    h0.mo3368i(i - 1, -i2, z);
                    this.f2798s0.f2820g = true;
                }
            }
        }
        this.f2781k.mo3627w(i, i2, z);
        requestLayout();
    }

    /* renamed from: G */
    public boolean mo3166G(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo5131d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: G0 */
    public void mo3167G0(View view) {
    }

    /* renamed from: H */
    public final void mo3168H(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo5132e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: H0 */
    public void mo3169H0(View view) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public void mo3170I(int i) {
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            oVar.mo3527e1(i);
        }
        mo3177M0(i);
        C0430t tVar = this.f2800t0;
        if (tVar != null) {
            tVar.mo3583a(this, i);
        }
        List<C0430t> list = this.f2802u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0430t) this.f2802u0.get(size)).mo3583a(this, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I0 */
    public void mo3171I0() {
        this.f2763Q++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public void mo3172J(int i, int i2) {
        this.f2764R++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo3179N0(i, i2);
        C0430t tVar = this.f2800t0;
        if (tVar != null) {
            tVar.mo3584b(this, i, i2);
        }
        List<C0430t> list = this.f2802u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0430t) this.f2802u0.get(size)).mo3584b(this, i, i2);
            }
        }
        this.f2764R--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J0 */
    public void mo3173J0() {
        mo3175K0(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public void mo3174K() {
        for (int size = this.f2751G0.size() - 1; size >= 0; size--) {
            C0407d0 d0Var = (C0407d0) this.f2751G0.get(size);
            if (d0Var.f2841b.getParent() == this && !d0Var.mo3358J()) {
                int i = d0Var.f2857r;
                if (i != -1) {
                    ViewCompat.m5591x0(d0Var.f2841b, i);
                    d0Var.f2857r = -1;
                }
            }
        }
        this.f2751G0.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K0 */
    public void mo3175K0(boolean z) {
        int i = this.f2763Q - 1;
        this.f2763Q = i;
        if (i < 1) {
            this.f2763Q = 0;
            if (z) {
                m2988B();
                mo3174K();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public void mo3176M() {
        if (this.f2769W == null) {
            EdgeEffect a = this.f2765S.mo3442a(this, 3);
            this.f2769W = a;
            if (this.f2791p) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: M0 */
    public void mo3177M0(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo3178N() {
        if (this.f2766T == null) {
            EdgeEffect a = this.f2765S.mo3442a(this, 0);
            this.f2766T = a;
            if (this.f2791p) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: N0 */
    public void mo3179N0(int i, int i2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public void mo3180O() {
        if (this.f2768V == null) {
            EdgeEffect a = this.f2765S.mo3442a(this, 2);
            this.f2768V = a;
            if (this.f2791p) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O0 */
    public void mo3181O0() {
        if (!this.f2810y0 && this.f2740A) {
            ViewCompat.m5557g0(this, this.f2753H0);
            this.f2810y0 = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public void mo3182P() {
        if (this.f2767U == null) {
            EdgeEffect a = this.f2765S.mo3442a(this, 1);
            this.f2767U = a;
            if (this.f2791p) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public String mo3183Q() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.f2801u);
        sb.append(", layout:");
        sb.append(this.f2803v);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public final void mo3184R(C0401a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f2792p0.f2834c;
            a0Var.f2829p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f2830q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f2829p = 0;
        a0Var.f2830q = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R0 */
    public void mo3185R0(boolean z) {
        this.f2762P = z | this.f2762P;
        this.f2761O = true;
        mo3159A0();
    }

    /* renamed from: S */
    public View mo3186S(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: T */
    public C0407d0 mo3187T(View view) {
        View S = mo3186S(view);
        if (S == null) {
            return null;
        }
        return mo3222g0(S);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T0 */
    public void mo3188T0(C0407d0 d0Var, C0418c cVar) {
        d0Var.mo3354F(0, 8192);
        if (this.f2798s0.f2822i && d0Var.mo3385y() && !d0Var.mo3382v() && !d0Var.mo3358J()) {
            this.f2789o.mo3916c(mo3209d0(d0Var), d0Var);
        }
        this.f2789o.mo3918e(d0Var, cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W0 */
    public void mo3189W0() {
        C0415l lVar = this.f2770a0;
        if (lVar != null) {
            lVar.mo3452k();
        }
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            oVar.mo3540k1(this.f2781k);
            this.f2803v.mo3542l1(this.f2781k);
        }
        this.f2781k.mo3609c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X0 */
    public boolean mo3190X0(View view) {
        mo3287s1();
        boolean r = this.f2787n.mo3781r(view);
        if (r) {
            C0407d0 h0 = m3012h0(view);
            this.f2781k.mo3604J(h0);
            this.f2781k.mo3598C(h0);
        }
        mo3318u1(!r);
        return r;
    }

    /* renamed from: Y */
    public C0407d0 mo3191Y(int i) {
        C0407d0 d0Var = null;
        if (this.f2761O) {
            return null;
        }
        int j = this.f2787n.mo3774j();
        for (int i2 = 0; i2 < j; i2++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i2));
            if (h0 != null && !h0.mo3382v() && mo3201c0(h0) == i) {
                if (!this.f2787n.mo3777n(h0.f2841b)) {
                    return h0;
                }
                d0Var = h0;
            }
        }
        return d0Var;
    }

    /* renamed from: Y0 */
    public void mo3192Y0(C0420n nVar) {
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            oVar.mo3124g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f2807x.remove(nVar);
        if (this.f2807x.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo3328z0();
        requestLayout();
    }

    /* renamed from: Z */
    public C0407d0 mo3193Z(long j) {
        C0410g gVar = this.f2801u;
        C0407d0 d0Var = null;
        if (gVar != null && gVar.mo3413g()) {
            int j2 = this.f2787n.mo3774j();
            for (int i = 0; i < j2; i++) {
                C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i));
                if (h0 != null && !h0.mo3382v() && h0.mo3370k() == j) {
                    if (!this.f2787n.mo3777n(h0.f2841b)) {
                        return h0;
                    }
                    d0Var = h0;
                }
            }
        }
        return d0Var;
    }

    /* renamed from: Z0 */
    public void mo3194Z0(C0429s sVar) {
        this.f2809y.remove(sVar);
        if (this.f2811z == sVar) {
            this.f2811z = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3195a(int i, int i2) {
        if (i < 0) {
            mo3178N();
            if (this.f2766T.isFinished()) {
                this.f2766T.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo3180O();
            if (this.f2768V.isFinished()) {
                this.f2768V.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo3182P();
            if (this.f2767U.isFinished()) {
                this.f2767U.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo3176M();
            if (this.f2769W.isFinished()) {
                this.f2769W.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            ViewCompat.m5555f0(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a0 */
    public C0407d0 mo3196a0(int i, boolean z) {
        int j = this.f2787n.mo3774j();
        C0407d0 d0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i2));
            if (h0 != null && !h0.mo3382v()) {
                if (z) {
                    if (h0.f2843d != i) {
                        continue;
                    }
                } else if (h0.mo3372m() != i) {
                    continue;
                }
                if (!this.f2787n.mo3777n(h0.f2841b)) {
                    return h0;
                }
                d0Var = h0;
            }
        }
        return d0Var;
    }

    /* renamed from: a1 */
    public void mo3197a1(C0430t tVar) {
        List<C0430t> list = this.f2802u0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0421o oVar = this.f2803v;
        if (oVar == null || !oVar.mo3485F0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public boolean mo3199b0(int i, int i2) {
        C0421o oVar = this.f2803v;
        int i3 = 0;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f2754I) {
            return false;
        } else {
            boolean k = oVar.mo3126k();
            boolean l = this.f2803v.mo3127l();
            if (!k || Math.abs(i) < this.f2782k0) {
                i = 0;
            }
            if (!l || Math.abs(i2) < this.f2782k0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = k || l;
                dispatchNestedFling(f, f2, z);
                C0428r rVar = this.f2780j0;
                if (rVar != null && rVar.mo3579a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (k) {
                        i3 = 1;
                    }
                    if (l) {
                        i3 |= 2;
                    }
                    mo3315t1(i3, 1);
                    int i4 = this.f2784l0;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f2784l0;
                    this.f2792p0.mo3340c(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b1 */
    public void mo3200b1() {
        int g = this.f2787n.mo3772g();
        for (int i = 0; i < g; i++) {
            View f = this.f2787n.mo3771f(i);
            C0407d0 g0 = mo3222g0(f);
            if (g0 != null) {
                C0407d0 d0Var = g0.f2849j;
                if (d0Var != null) {
                    View view = d0Var.f2841b;
                    int left = f.getLeft();
                    int top = f.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c0 */
    public int mo3201c0(C0407d0 d0Var) {
        if (d0Var.mo3375p(524) || !d0Var.mo3378s()) {
            return -1;
        }
        return this.f2785m.mo3747e(d0Var.f2843d);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0426p) && this.f2803v.mo3082m((C0426p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0421o oVar = this.f2803v;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3126k()) {
            i = this.f2803v.mo3130q(this.f2798s0);
        }
        return i;
    }

    public int computeHorizontalScrollOffset() {
        C0421o oVar = this.f2803v;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3126k()) {
            i = this.f2803v.mo3083r(this.f2798s0);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        C0421o oVar = this.f2803v;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3126k()) {
            i = this.f2803v.mo3084s(this.f2798s0);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        C0421o oVar = this.f2803v;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3127l()) {
            i = this.f2803v.mo3135t(this.f2798s0);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        C0421o oVar = this.f2803v;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3127l()) {
            i = this.f2803v.mo3085u(this.f2798s0);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        C0421o oVar = this.f2803v;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3127l()) {
            i = this.f2803v.mo3087v(this.f2798s0);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d0 */
    public long mo3209d0(C0407d0 d0Var) {
        return this.f2801u.mo3413g() ? d0Var.mo3370k() : (long) d0Var.f2843d;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo5128a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo5129b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo5130c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo5133f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f2807x.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((C0420n) this.f2807x.get(i)).mo3473i(canvas, this, this.f2798s0);
        }
        EdgeEffect edgeEffect = this.f2766T;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2791p ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f2766T;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2767U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2791p) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2767U;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2768V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2791p ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f2768V;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2769W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2791p) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f2769W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f2770a0 == null || this.f2807x.size() <= 0 || !this.f2770a0.mo3457p()) {
            z3 = z;
        }
        if (z3) {
            ViewCompat.m5555f0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public int mo3219e0(View view) {
        C0407d0 h0 = m3012h0(view);
        if (h0 != null) {
            return h0.mo3369j();
        }
        return -1;
    }

    /* renamed from: f0 */
    public int mo3220f0(View view) {
        C0407d0 h0 = m3012h0(view);
        if (h0 != null) {
            return h0.mo3372m();
        }
        return -1;
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View Q0 = this.f2803v.mo3504Q0(view, i);
        if (Q0 != null) {
            return Q0;
        }
        boolean z2 = true;
        boolean z3 = this.f2801u != null && this.f2803v != null && !mo3322w0() && !this.f2754I;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                mo3319v();
                if (mo3186S(view) == null) {
                    return null;
                }
                mo3287s1();
                view2 = this.f2803v.mo3065J0(view, i, this.f2781k, this.f2798s0);
                mo3318u1(false);
            }
        } else {
            if (this.f2803v.mo3127l()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f2736f) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f2803v.mo3126k()) {
                int i3 = (this.f2803v.mo3514Z() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (f2736f) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                mo3319v();
                if (mo3186S(view) == null) {
                    return null;
                }
                mo3287s1();
                this.f2803v.mo3065J0(view, i, this.f2781k, this.f2798s0);
                mo3318u1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!m3025x0(view, view2, i)) {
                view2 = super.focusSearch(view, i);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m3004c1(view2, null);
            return view;
        }
    }

    /* renamed from: g0 */
    public C0407d0 mo3222g0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m3012h0(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g1 */
    public void mo3223g1() {
        int j = this.f2787n.mo3774j();
        for (int i = 0; i < j; i++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i));
            if (!h0.mo3358J()) {
                h0.mo3353E();
            }
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            return oVar.mo3061D();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo3183Q());
        throw new IllegalStateException(sb.toString());
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            return oVar.mo3062E(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo3183Q());
        throw new IllegalStateException(sb.toString());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0410g getAdapter() {
        return this.f2801u;
    }

    public int getBaseline() {
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            return oVar.mo3487G();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0413j jVar = this.f2741A0;
        if (jVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return jVar.mo3441a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f2791p;
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.f2812z0;
    }

    public C0414k getEdgeEffectFactory() {
        return this.f2765S;
    }

    public C0415l getItemAnimator() {
        return this.f2770a0;
    }

    public int getItemDecorationCount() {
        return this.f2807x.size();
    }

    public C0421o getLayoutManager() {
        return this.f2803v;
    }

    public int getMaxFlingVelocity() {
        return this.f2784l0;
    }

    public int getMinFlingVelocity() {
        return this.f2782k0;
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (f2735e) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0428r getOnFlingListener() {
        return this.f2780j0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2790o0;
    }

    public C0431u getRecycledViewPool() {
        return this.f2781k.mo3615i();
    }

    public int getScrollState() {
        return this.f2771b0;
    }

    /* renamed from: h */
    public void mo3244h(C0420n nVar) {
        mo3247i(nVar, -1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h1 */
    public boolean mo3245h1(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo3319v();
        if (this.f2801u != null) {
            int[] iArr = this.f2749F0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo3249i1(i7, i8, iArr);
            int[] iArr2 = this.f2749F0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f2807x.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f2749F0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo3168H(i5, i6, i4, i3, this.f2747D0, 0, iArr3);
        int[] iArr4 = this.f2749F0;
        int i11 = i4 - iArr4[0];
        int i12 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.f2776g0;
        int[] iArr5 = this.f2747D0;
        this.f2776g0 = i13 - iArr5[0];
        this.f2777h0 -= iArr5[1];
        int[] iArr6 = this.f2748E0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !MotionEventCompat.m5474a(motionEvent2, C3149a.f17201q)) {
                m2996S0(motionEvent.getX(), (float) i11, motionEvent.getY(), (float) i12);
            }
            mo3316u(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            mo3172J(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i5 == 0 && i6 == 0) {
            return false;
        }
        return true;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo5134j();
    }

    /* renamed from: i */
    public void mo3247i(C0420n nVar, int i) {
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            oVar.mo3124g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f2807x.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f2807x.add(nVar);
        } else {
            this.f2807x.add(i, nVar);
        }
        mo3328z0();
        requestLayout();
    }

    /* renamed from: i0 */
    public void mo3248i0(View view, Rect rect) {
        m3013j0(view, rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i1 */
    public void mo3249i1(int i, int i2, int[] iArr) {
        mo3287s1();
        mo3171I0();
        TraceCompat.m5076a("RV Scroll");
        mo3184R(this.f2798s0);
        int w1 = i != 0 ? this.f2803v.mo3088w1(i, this.f2781k, this.f2798s0) : 0;
        int y1 = i2 != 0 ? this.f2803v.mo3090y1(i2, this.f2781k, this.f2798s0) : 0;
        TraceCompat.m5077b();
        mo3200b1();
        mo3173J0();
        mo3318u1(false);
        if (iArr != null) {
            iArr[0] = w1;
            iArr[1] = y1;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f2740A;
    }

    public final boolean isLayoutSuppressed() {
        return this.f2754I;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo5136l();
    }

    /* renamed from: j */
    public void mo3252j(C0429s sVar) {
        this.f2809y.add(sVar);
    }

    /* renamed from: j1 */
    public void mo3253j1(int i) {
        if (!this.f2754I) {
            mo3323w1();
            C0421o oVar = this.f2803v;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo3137x1(i);
            awakenScrollBars();
        }
    }

    /* renamed from: k */
    public void mo3254k(C0430t tVar) {
        if (this.f2802u0 == null) {
            this.f2802u0 = new ArrayList();
        }
        this.f2802u0.add(tVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo3255l(C0407d0 d0Var, C0418c cVar, C0418c cVar2) {
        d0Var.mo3355G(false);
        if (this.f2770a0.mo3443a(d0Var, cVar, cVar2)) {
            mo3181O0();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l1 */
    public boolean mo3256l1(C0407d0 d0Var, int i) {
        if (mo3322w0()) {
            d0Var.f2857r = i;
            this.f2751G0.add(d0Var);
            return false;
        }
        ViewCompat.m5591x0(d0Var.f2841b, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m0 */
    public Rect mo3257m0(View view) {
        C0426p pVar = (C0426p) view.getLayoutParams();
        if (!pVar.f2900c) {
            return pVar.f2899b;
        }
        if (this.f2798s0.mo3334e() && (pVar.mo3574b() || pVar.mo3576d())) {
            return pVar.f2899b;
        }
        Rect rect = pVar.f2899b;
        rect.set(0, 0, 0, 0);
        int size = this.f2807x.size();
        for (int i = 0; i < size; i++) {
            this.f2795r.set(0, 0, 0, 0);
            ((C0420n) this.f2807x.get(i)).mo3469e(this.f2795r, view, this, this.f2798s0);
            int i2 = rect.left;
            Rect rect2 = this.f2795r;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f2900c = false;
        return rect;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m1 */
    public boolean mo3258m1(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!mo3322w0()) {
            return false;
        }
        int a = accessibilityEvent != null ? AccessibilityEventCompat.m5332a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.f2757K |= i;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo3259n(C0407d0 d0Var, C0418c cVar, C0418c cVar2) {
        m3011g(d0Var);
        d0Var.mo3355G(false);
        if (this.f2770a0.mo3445c(d0Var, cVar, cVar2)) {
            mo3181O0();
        }
    }

    /* renamed from: n1 */
    public void mo3260n1(int i, int i2) {
        mo3263o1(i, i2, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo3261o(String str) {
        if (mo3322w0()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(mo3183Q());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.f2764R > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(mo3183Q());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    /* renamed from: o0 */
    public boolean mo3262o0() {
        return !this.f2746D || this.f2761O || this.f2785m.mo3754p();
    }

    /* renamed from: o1 */
    public void mo3263o1(int i, int i2, Interpolator interpolator) {
        mo3277p1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2763Q = 0;
        boolean z = true;
        this.f2740A = true;
        if (!this.f2746D || isLayoutRequested()) {
            z = false;
        }
        this.f2746D = z;
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            oVar.mo3564z(this);
        }
        this.f2810y0 = false;
        if (f2735e) {
            ThreadLocal<GapWorker> threadLocal = GapWorker.f3098a;
            GapWorker fVar = (GapWorker) threadLocal.get();
            this.f2794q0 = fVar;
            if (fVar == null) {
                this.f2794q0 = new GapWorker();
                Display v = ViewCompat.m5586v(this);
                float f = 60.0f;
                if (!isInEditMode() && v != null) {
                    float refreshRate = v.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                GapWorker fVar2 = this.f2794q0;
                fVar2.f3102e = (long) (1.0E9f / f);
                threadLocal.set(fVar2);
            }
            this.f2794q0.mo3831a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0415l lVar = this.f2770a0;
        if (lVar != null) {
            lVar.mo3452k();
        }
        mo3323w1();
        this.f2740A = false;
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            oVar.mo3474A(this, this.f2781k);
        }
        this.f2751G0.clear();
        removeCallbacks(this.f2753H0);
        this.f2789o.mo3923j();
        if (f2735e) {
            GapWorker fVar = this.f2794q0;
            if (fVar != null) {
                fVar.mo3834j(this);
                this.f2794q0 = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f2807x.size();
        for (int i = 0; i < size; i++) {
            ((C0420n) this.f2807x.get(i)).mo3471g(canvas, this, this.f2798s0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f2803v != null && !this.f2754I && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2803v.mo3127l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2803v.mo3126k()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo3245h1((int) (f * this.f2786m0), (int) (f2 * this.f2788n0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2803v.mo3127l()) {
                        f2 = -axisValue;
                    } else if (this.f2803v.mo3126k()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo3245h1((int) (f * this.f2786m0), (int) (f2 * this.f2788n0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo3245h1((int) (f * this.f2786m0), (int) (f2 * this.f2788n0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.f2754I) {
            return false;
        }
        this.f2811z = null;
        if (m2997U(motionEvent)) {
            m3020q();
            return true;
        }
        C0421o oVar = this.f2803v;
        if (oVar == null) {
            return false;
        }
        boolean k = oVar.mo3126k();
        boolean l = this.f2803v.mo3127l();
        if (this.f2773d0 == null) {
            this.f2773d0 = VelocityTracker.obtain();
        }
        this.f2773d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2756J) {
                this.f2756J = false;
            }
            this.f2772c0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f2776g0 = x;
            this.f2774e0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f2777h0 = y;
            this.f2775f0 = y;
            if (this.f2771b0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo3321v1(1);
            }
            int[] iArr = this.f2748E0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l) {
                k |= true;
            }
            mo3315t1(k ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f2773d0.clear();
            mo3321v1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2772c0);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.f2772c0);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2771b0 != 1) {
                int i = x2 - this.f2774e0;
                int i2 = y2 - this.f2775f0;
                if (!k || Math.abs(i) <= this.f2778i0) {
                    z = false;
                } else {
                    this.f2776g0 = x2;
                    z = true;
                }
                if (l && Math.abs(i2) > this.f2778i0) {
                    this.f2777h0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m3020q();
        } else if (actionMasked == 5) {
            this.f2772c0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2776g0 = x3;
            this.f2774e0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2777h0 = y3;
            this.f2775f0 = y3;
        } else if (actionMasked == 6) {
            m2993L0(motionEvent);
        }
        if (this.f2771b0 == 1) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceCompat.m5076a("RV OnLayout");
        mo3161C();
        TraceCompat.m5077b();
        this.f2746D = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0421o oVar = this.f2803v;
        if (oVar == null) {
            mo3324x(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo3133s0()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f2803v.mo3515Z0(this.f2781k, this.f2798s0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f2801u != null) {
                if (this.f2798s0.f2818e == 1) {
                    m2989D();
                }
                this.f2803v.mo3476A1(i, i2);
                this.f2798s0.f2823j = true;
                m2990E();
                this.f2803v.mo3482D1(i, i2);
                if (this.f2803v.mo3105G1()) {
                    this.f2803v.mo3476A1(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f2798s0.f2823j = true;
                    m2990E();
                    this.f2803v.mo3482D1(i, i2);
                }
            }
        } else if (this.f2742B) {
            this.f2803v.mo3515Z0(this.f2781k, this.f2798s0, i, i2);
        } else {
            if (this.f2758L) {
                mo3287s1();
                mo3171I0();
                m2995Q0();
                mo3173J0();
                C0401a0 a0Var = this.f2798s0;
                if (a0Var.f2825l) {
                    a0Var.f2821h = true;
                } else {
                    this.f2785m.mo3749j();
                    this.f2798s0.f2821h = false;
                }
                this.f2758L = false;
                mo3318u1(false);
            } else if (this.f2798s0.f2825l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0410g gVar = this.f2801u;
            if (gVar != null) {
                this.f2798s0.f2819f = gVar.mo3409c();
            } else {
                this.f2798s0.f2819f = 0;
            }
            mo3287s1();
            this.f2803v.mo3515Z0(this.f2781k, this.f2798s0, i, i2);
            mo3318u1(false);
            this.f2798s0.f2821h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo3322w0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0436y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0436y yVar = (C0436y) parcelable;
        this.f2783l = yVar;
        super.onRestoreInstanceState(yVar.mo5193l());
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            Parcelable parcelable2 = this.f2783l.f2918c;
            if (parcelable2 != null) {
                oVar.mo3120c1(parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0436y yVar = new C0436y(super.onSaveInstanceState());
        C0436y yVar2 = this.f2783l;
        if (yVar2 != null) {
            yVar.mo3633m(yVar2);
        } else {
            C0421o oVar = this.f2803v;
            if (oVar != null) {
                yVar.f2918c = oVar.mo3121d1();
            } else {
                yVar.f2918c = null;
            }
        }
        return yVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo3317u0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f2754I
            r8 = 0
            if (r0 != 0) goto L_0x01df
            boolean r0 = r6.f2756J
            if (r0 == 0) goto L_0x000f
            goto L_0x01df
        L_0x000f:
            boolean r0 = r17.m2992L(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.m3020q()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f2803v
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo3126k()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f2803v
            boolean r11 = r0.mo3127l()
            android.view.VelocityTracker r0 = r6.f2773d0
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f2773d0 = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f2748E0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f2748E0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b3
            if (r0 == r9) goto L_0x0171
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d4
        L_0x0066:
            r17.m2993L0(r18)
            goto L_0x01d4
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f2772c0 = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f2776g0 = r0
            r6.f2774e0 = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f2777h0 = r0
            r6.f2775f0 = r0
            goto L_0x01d4
        L_0x0087:
            r17.m3020q()
            goto L_0x01d4
        L_0x008c:
            int r0 = r6.f2772c0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f2772c0
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f2776g0
            int r0 = r0 - r13
            int r1 = r6.f2777h0
            int r1 = r1 - r14
            int r2 = r6.f2771b0
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.f2778i0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.f2778i0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.f2778i0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.f2778i0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            r15 = r0
            r16 = r1
            int r0 = r6.f2771b0
            if (r0 != r9) goto L_0x01d4
            int[] r3 = r6.f2749F0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x010c
            r1 = r15
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r2 = r16
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            int[] r4 = r6.f2747D0
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo3166G(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0140
            int[] r0 = r6.f2749F0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f2748E0
            r1 = r0[r8]
            int[] r2 = r6.f2747D0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0140:
            r0 = r16
            int[] r1 = r6.f2747D0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f2776g0 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f2777h0 = r14
            if (r10 == 0) goto L_0x0152
            r1 = r15
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            r2 = r0
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            boolean r1 = r6.mo3245h1(r1, r2, r7)
            if (r1 == 0) goto L_0x0165
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0165:
            androidx.recyclerview.widget.f r1 = r6.f2794q0
            if (r1 == 0) goto L_0x01d4
            if (r15 != 0) goto L_0x016d
            if (r0 == 0) goto L_0x01d4
        L_0x016d:
            r1.mo3832f(r6, r15, r0)
            goto L_0x01d4
        L_0x0171:
            android.view.VelocityTracker r0 = r6.f2773d0
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f2773d0
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f2784l0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018d
            android.view.VelocityTracker r1 = r6.f2773d0
            int r2 = r6.f2772c0
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            if (r11 == 0) goto L_0x019a
            android.view.VelocityTracker r2 = r6.f2773d0
            int r3 = r6.f2772c0
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
        L_0x01a3:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo3199b0(r0, r1)
            if (r0 != 0) goto L_0x01ae
        L_0x01ab:
            r6.setScrollState(r8)
        L_0x01ae:
            r17.m3008e1()
            r8 = 1
            goto L_0x01d4
        L_0x01b3:
            int r0 = r7.getPointerId(r8)
            r6.f2772c0 = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f2776g0 = r0
            r6.f2774e0 = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f2777h0 = r0
            r6.f2775f0 = r0
            if (r11 == 0) goto L_0x01d1
            r10 = r10 | 2
        L_0x01d1:
            r6.mo3315t1(r10, r8)
        L_0x01d4:
            if (r8 != 0) goto L_0x01db
            android.view.VelocityTracker r0 = r6.f2773d0
            r0.addMovement(r12)
        L_0x01db:
            r12.recycle()
            return r9
        L_0x01df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo3276p(C0407d0 d0Var) {
        C0415l lVar = this.f2770a0;
        return lVar == null || lVar.mo3448g(d0Var, d0Var.mo3374o());
    }

    /* renamed from: p1 */
    public void mo3277p1(int i, int i2, Interpolator interpolator, int i3) {
        mo3279q1(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q0 */
    public void mo3278q0() {
        this.f2785m = new AdapterHelper(new C0409f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q1 */
    public void mo3279q1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0421o oVar = this.f2803v;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f2754I) {
            int i4 = 0;
            if (!oVar.mo3126k()) {
                i = 0;
            }
            if (!this.f2803v.mo3127l()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo3315t1(i4, 1);
                    }
                    this.f2792p0.mo3342f(i, i2, i3, interpolator);
                } else {
                    scrollBy(i, i2);
                }
            }
        }
    }

    /* renamed from: r1 */
    public void mo3280r1(int i) {
        if (!this.f2754I) {
            C0421o oVar = this.f2803v;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo3107I1(this, this.f2798s0, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0407d0 h0 = m3012h0(view);
        if (h0 != null) {
            if (h0.mo3384x()) {
                h0.mo3366f();
            } else if (!h0.mo3358J()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(h0);
                sb.append(mo3183Q());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        mo3158A(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2803v.mo3520b1(this, this.f2798s0, view, view2) && view2 != null) {
            m3004c1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f2803v.mo3554r1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f2809y.size();
        for (int i = 0; i < size; i++) {
            ((C0429s) this.f2809y.get(i)).mo3582c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f2750G != 0 || this.f2754I) {
            this.f2752H = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo3286s() {
        int j = this.f2787n.mo3774j();
        for (int i = 0; i < j; i++) {
            C0407d0 h0 = m3012h0(this.f2787n.mo3773i(i));
            if (!h0.mo3358J()) {
                h0.mo3363c();
            }
        }
        this.f2781k.mo3610d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s1 */
    public void mo3287s1() {
        int i = this.f2750G + 1;
        this.f2750G = i;
        if (i == 1 && !this.f2754I) {
            this.f2752H = false;
        }
    }

    public void scrollBy(int i, int i2) {
        C0421o oVar = this.f2803v;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f2754I) {
            boolean k = oVar.mo3126k();
            boolean l = this.f2803v.mo3127l();
            if (k || l) {
                if (!k) {
                    i = 0;
                }
                if (!l) {
                    i2 = 0;
                }
                mo3245h1(i, i2, null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo3258m1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate lVar) {
        this.f2812z0 = lVar;
        ViewCompat.m5573o0(this, lVar);
    }

    public void setAdapter(C0410g gVar) {
        setLayoutFrozen(false);
        m3015k1(gVar, false, true);
        mo3185R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0413j jVar) {
        if (jVar != this.f2741A0) {
            this.f2741A0 = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f2791p) {
            mo3317u0();
        }
        this.f2791p = z;
        super.setClipToPadding(z);
        if (this.f2746D) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0414k kVar) {
        Preconditions.m5188e(kVar);
        this.f2765S = kVar;
        mo3317u0();
    }

    public void setHasFixedSize(boolean z) {
        this.f2742B = z;
    }

    public void setItemAnimator(C0415l lVar) {
        C0415l lVar2 = this.f2770a0;
        if (lVar2 != null) {
            lVar2.mo3452k();
            this.f2770a0.mo3463v(null);
        }
        this.f2770a0 = lVar;
        if (lVar != null) {
            lVar.mo3463v(this.f2808x0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f2781k.mo3602G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0421o oVar) {
        if (oVar != this.f2803v) {
            mo3323w1();
            if (this.f2803v != null) {
                C0415l lVar = this.f2770a0;
                if (lVar != null) {
                    lVar.mo3452k();
                }
                this.f2803v.mo3540k1(this.f2781k);
                this.f2803v.mo3542l1(this.f2781k);
                this.f2781k.mo3609c();
                if (this.f2740A) {
                    this.f2803v.mo3474A(this, this.f2781k);
                }
                this.f2803v.mo3484E1(null);
                this.f2803v = null;
            } else {
                this.f2781k.mo3609c();
            }
            this.f2787n.mo3778o();
            this.f2803v = oVar;
            if (oVar != null) {
                if (oVar.f2875b == null) {
                    oVar.mo3484E1(this);
                    if (this.f2740A) {
                        this.f2803v.mo3564z(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(oVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(oVar.f2875b.mo3183Q());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f2781k.mo3605K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo5137m(z);
    }

    public void setOnFlingListener(C0428r rVar) {
        this.f2780j0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C0430t tVar) {
        this.f2800t0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f2790o0 = z;
    }

    public void setRecycledViewPool(C0431u uVar) {
        this.f2781k.mo3600E(uVar);
    }

    public void setRecyclerListener(C0434w wVar) {
        this.f2805w = wVar;
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.f2771b0) {
            this.f2771b0 = i;
            if (i != 2) {
                m3026x1();
            }
            mo3170I(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.f2778i0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2778i0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C0403b0 b0Var) {
        this.f2781k.mo3601F(b0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo5138o(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo5140q();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f2754I) {
            mo3261o("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f2754I = false;
                if (!(!this.f2752H || this.f2803v == null || this.f2801u == null)) {
                    requestLayout();
                }
                this.f2752H = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2754I = true;
            this.f2756J = true;
            mo3323w1();
        }
    }

    /* renamed from: t */
    public void mo3313t() {
        List<C0430t> list = this.f2802u0;
        if (list != null) {
            list.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t0 */
    public void mo3314t0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set fast scroller without both required drawables.");
            sb.append(mo3183Q());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0695b.fastscroll_default_thickness), resources.getDimensionPixelSize(C0695b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0695b.fastscroll_margin));
    }

    /* renamed from: t1 */
    public boolean mo3315t1(int i, int i2) {
        return getScrollingChildHelper().mo5139p(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo3316u(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f2766T;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f2766T.onRelease();
            z = this.f2766T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2768V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f2768V.onRelease();
            z |= this.f2768V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2767U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f2767U.onRelease();
            z |= this.f2767U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2769W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f2769W.onRelease();
            z |= this.f2769W.isFinished();
        }
        if (z) {
            ViewCompat.m5555f0(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public void mo3317u0() {
        this.f2769W = null;
        this.f2767U = null;
        this.f2768V = null;
        this.f2766T = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u1 */
    public void mo3318u1(boolean z) {
        if (this.f2750G < 1) {
            this.f2750G = 1;
        }
        if (!z && !this.f2754I) {
            this.f2752H = false;
        }
        if (this.f2750G == 1) {
            if (z && this.f2752H && !this.f2754I && this.f2803v != null && this.f2801u != null) {
                mo3161C();
            }
            if (!this.f2754I) {
                this.f2752H = false;
            }
        }
        this.f2750G--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo3319v() {
        String str = "RV FullInvalidate";
        if (!this.f2746D || this.f2761O) {
            TraceCompat.m5076a(str);
            mo3161C();
            TraceCompat.m5077b();
        } else if (this.f2785m.mo3754p()) {
            if (this.f2785m.mo3753o(4) && !this.f2785m.mo3753o(11)) {
                TraceCompat.m5076a("RV PartialInvalidate");
                mo3287s1();
                mo3171I0();
                this.f2785m.mo3759v();
                if (!this.f2752H) {
                    if (m3019p0()) {
                        mo3161C();
                    } else {
                        this.f2785m.mo3748i();
                    }
                }
                mo3318u1(true);
                mo3173J0();
                TraceCompat.m5077b();
            } else if (this.f2785m.mo3754p()) {
                TraceCompat.m5076a(str);
                mo3161C();
                TraceCompat.m5077b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v0 */
    public boolean mo3320v0() {
        AccessibilityManager accessibilityManager = this.f2759M;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: v1 */
    public void mo3321v1(int i) {
        getScrollingChildHelper().mo5141r(i);
    }

    /* renamed from: w0 */
    public boolean mo3322w0() {
        return this.f2763Q > 0;
    }

    /* renamed from: w1 */
    public void mo3323w1() {
        setScrollState(0);
        m3026x1();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo3324x(int i, int i2) {
        setMeasuredDimension(C0421o.m3265n(i, getPaddingLeft() + getPaddingRight(), ViewCompat.m5518E(this)), C0421o.m3265n(i2, getPaddingTop() + getPaddingBottom(), ViewCompat.m5516D(this)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y0 */
    public void mo3325y0(int i) {
        if (this.f2803v != null) {
            setScrollState(2);
            this.f2803v.mo3137x1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y1 */
    public void mo3326y1(int i, int i2, Object obj) {
        int j = this.f2787n.mo3774j();
        int i3 = i + i2;
        for (int i4 = 0; i4 < j; i4++) {
            View i5 = this.f2787n.mo3773i(i4);
            C0407d0 h0 = m3012h0(i5);
            if (h0 != null && !h0.mo3358J()) {
                int i6 = h0.f2843d;
                if (i6 >= i && i6 < i3) {
                    h0.mo3362b(2);
                    h0.mo3361a(obj);
                    ((C0426p) i5.getLayoutParams()).f2900c = true;
                }
            }
        }
        this.f2781k.mo3607M(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo3327z(View view) {
        C0407d0 h0 = m3012h0(view);
        mo3167G0(view);
        C0410g gVar = this.f2801u;
        if (!(gVar == null || h0 == null)) {
            gVar.mo3424r(h0);
        }
        List<C0427q> list = this.f2760N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0427q) this.f2760N.get(size)).mo3577a(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z0 */
    public void mo3328z0() {
        int j = this.f2787n.mo3774j();
        for (int i = 0; i < j; i++) {
            ((C0426p) this.f2787n.mo3773i(i).getLayoutParams()).f2900c = true;
        }
        this.f2781k.mo3623s();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        super(context, attributeSet, i);
        this.f2779j = new C0435x();
        this.f2781k = new C0433v();
        this.f2789o = new ViewInfoStore();
        this.f2793q = new C0400a();
        this.f2795r = new Rect();
        this.f2797s = new Rect();
        this.f2799t = new RectF();
        this.f2807x = new ArrayList<>();
        this.f2809y = new ArrayList<>();
        this.f2750G = 0;
        this.f2761O = false;
        this.f2762P = false;
        this.f2763Q = 0;
        this.f2764R = 0;
        this.f2765S = new C0414k();
        this.f2770a0 = new DefaultItemAnimator();
        this.f2771b0 = 0;
        this.f2772c0 = -1;
        this.f2786m0 = Float.MIN_VALUE;
        this.f2788n0 = Float.MIN_VALUE;
        boolean z = true;
        this.f2790o0 = true;
        this.f2792p0 = new C0405c0();
        this.f2796r0 = f2735e ? new C0469b() : null;
        this.f2798s0 = new C0401a0();
        this.f2804v0 = false;
        this.f2806w0 = false;
        this.f2808x0 = new C0419m();
        this.f2810y0 = false;
        this.f2743B0 = new int[2];
        this.f2747D0 = new int[2];
        this.f2748E0 = new int[2];
        this.f2749F0 = new int[2];
        this.f2751G0 = new ArrayList();
        this.f2753H0 = new C0402b();
        this.f2755I0 = new C0406d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2778i0 = viewConfiguration.getScaledTouchSlop();
        this.f2786m0 = ViewConfigurationCompat.m5646b(viewConfiguration, context2);
        this.f2788n0 = ViewConfigurationCompat.m5648d(viewConfiguration, context2);
        this.f2782k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2784l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2770a0.mo3463v(this.f2808x0);
        mo3278q0();
        m3023s0();
        m3022r0();
        if (ViewCompat.m5510A(this) == 0) {
            ViewCompat.m5591x0(this, 1);
        }
        this.f2759M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = C0696c.f4948f;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        int i3 = VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C0696c.f4957o);
        if (obtainStyledAttributes.getInt(C0696c.f4951i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2791p = obtainStyledAttributes.getBoolean(C0696c.f4950h, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C0696c.f4952j, false);
        this.f2744C = z2;
        if (z2) {
            mo3314t0((StateListDrawable) obtainStyledAttributes.getDrawable(C0696c.f4955m), obtainStyledAttributes.getDrawable(C0696c.f4956n), (StateListDrawable) obtainStyledAttributes.getDrawable(C0696c.f4953k), obtainStyledAttributes.getDrawable(C0696c.f4954l));
        }
        obtainStyledAttributes.recycle();
        m3024w(context, string, attributeSet, i, 0);
        if (i3 >= 21) {
            int[] iArr2 = f2731a;
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        C0421o oVar = this.f2803v;
        if (oVar != null) {
            return oVar.mo3063F(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo3183Q());
        throw new IllegalStateException(sb.toString());
    }
}
