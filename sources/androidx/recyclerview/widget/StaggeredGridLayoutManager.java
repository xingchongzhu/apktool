package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0421o.C0424c;
import androidx.recyclerview.widget.RecyclerView.C0421o.C0425d;
import androidx.recyclerview.widget.RecyclerView.C0426p;
import androidx.recyclerview.widget.RecyclerView.C0433v;
import androidx.recyclerview.widget.RecyclerView.C0438z.C0440b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0636c;

public class StaggeredGridLayoutManager extends C0421o implements C0440b {

    /* renamed from: A */
    boolean f2934A = false;

    /* renamed from: B */
    private BitSet f2935B;

    /* renamed from: C */
    int f2936C = -1;

    /* renamed from: D */
    int f2937D = Integer.MIN_VALUE;

    /* renamed from: E */
    C0444d f2938E = new C0444d();

    /* renamed from: F */
    private int f2939F = 2;

    /* renamed from: G */
    private boolean f2940G;

    /* renamed from: H */
    private boolean f2941H;

    /* renamed from: I */
    private C0447e f2942I;

    /* renamed from: J */
    private int f2943J;

    /* renamed from: K */
    private final Rect f2944K = new Rect();

    /* renamed from: L */
    private final C0442b f2945L = new C0442b();

    /* renamed from: M */
    private boolean f2946M = false;

    /* renamed from: N */
    private boolean f2947N = true;

    /* renamed from: O */
    private int[] f2948O;

    /* renamed from: P */
    private final Runnable f2949P = new C0441a();

    /* renamed from: s */
    private int f2950s = -1;

    /* renamed from: t */
    C0449f[] f2951t;

    /* renamed from: u */
    OrientationHelper f2952u;

    /* renamed from: v */
    OrientationHelper f2953v;

    /* renamed from: w */
    private int f2954w;

    /* renamed from: x */
    private int f2955x;

    /* renamed from: y */
    private final LayoutState f2956y;

    /* renamed from: z */
    boolean f2957z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C0441a implements Runnable {
        C0441a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo3671S1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0442b {

        /* renamed from: a */
        int f2959a;

        /* renamed from: b */
        int f2960b;

        /* renamed from: c */
        boolean f2961c;

        /* renamed from: d */
        boolean f2962d;

        /* renamed from: e */
        boolean f2963e;

        /* renamed from: f */
        int[] f2964f;

        C0442b() {
            mo3688c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3686a() {
            int i;
            if (this.f2961c) {
                i = StaggeredGridLayoutManager.this.f2952u.mo3863i();
            } else {
                i = StaggeredGridLayoutManager.this.f2952u.mo3867m();
            }
            this.f2960b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3687b(int i) {
            if (this.f2961c) {
                this.f2960b = StaggeredGridLayoutManager.this.f2952u.mo3863i() - i;
            } else {
                this.f2960b = StaggeredGridLayoutManager.this.f2952u.mo3867m() + i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3688c() {
            this.f2959a = -1;
            this.f2960b = Integer.MIN_VALUE;
            this.f2961c = false;
            this.f2962d = false;
            this.f2963e = false;
            int[] iArr = this.f2964f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3689d(C0449f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f2964f;
            if (iArr == null || iArr.length < length) {
                this.f2964f = new int[StaggeredGridLayoutManager.this.f2951t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2964f[i] = fVarArr[i].mo3738s(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0443c extends C0426p {

        /* renamed from: e */
        C0449f f2966e;

        /* renamed from: f */
        boolean f2967f;

        public C0443c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final int mo3690e() {
            C0449f fVar = this.f2966e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2988e;
        }

        /* renamed from: f */
        public boolean mo3691f() {
            return this.f2967f;
        }

        public C0443c(int i, int i2) {
            super(i, i2);
        }

        public C0443c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0443c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C0444d {

        /* renamed from: a */
        int[] f2968a;

        /* renamed from: b */
        List<C0445a> f2969b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C0445a implements Parcelable {
            public static final Creator<C0445a> CREATOR = new C0446a();

            /* renamed from: a */
            int f2970a;

            /* renamed from: b */
            int f2971b;

            /* renamed from: c */
            int[] f2972c;

            /* renamed from: d */
            boolean f2973d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C0446a implements Creator<C0445a> {
                C0446a() {
                }

                /* renamed from: a */
                public C0445a createFromParcel(Parcel parcel) {
                    return new C0445a(parcel);
                }

                /* renamed from: b */
                public C0445a[] newArray(int i) {
                    return new C0445a[i];
                }
            }

            C0445a(Parcel parcel) {
                this.f2970a = parcel.readInt();
                this.f2971b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f2973d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2972c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: l */
            public int mo3705l(int i) {
                int[] iArr = this.f2972c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.f2970a);
                sb.append(", mGapDir=");
                sb.append(this.f2971b);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f2973d);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f2972c));
                sb.append('}');
                return sb.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2970a);
                parcel.writeInt(this.f2971b);
                parcel.writeInt(this.f2973d ? 1 : 0);
                int[] iArr = this.f2972c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2972c);
            }

            C0445a() {
            }
        }

        C0444d() {
        }

        /* renamed from: i */
        private int m3618i(int i) {
            if (this.f2969b == null) {
                return -1;
            }
            C0445a f = mo3697f(i);
            if (f != null) {
                this.f2969b.remove(f);
            }
            int size = this.f2969b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((C0445a) this.f2969b.get(i2)).f2970a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            C0445a aVar = (C0445a) this.f2969b.get(i2);
            this.f2969b.remove(i2);
            return aVar.f2970a;
        }

        /* renamed from: l */
        private void m3619l(int i, int i2) {
            List<C0445a> list = this.f2969b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0445a aVar = (C0445a) this.f2969b.get(size);
                    int i3 = aVar.f2970a;
                    if (i3 >= i) {
                        aVar.f2970a = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m3620m(int i, int i2) {
            List<C0445a> list = this.f2969b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0445a aVar = (C0445a) this.f2969b.get(size);
                    int i4 = aVar.f2970a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f2969b.remove(size);
                        } else {
                            aVar.f2970a = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo3692a(C0445a aVar) {
            if (this.f2969b == null) {
                this.f2969b = new ArrayList();
            }
            int size = this.f2969b.size();
            for (int i = 0; i < size; i++) {
                C0445a aVar2 = (C0445a) this.f2969b.get(i);
                if (aVar2.f2970a == aVar.f2970a) {
                    this.f2969b.remove(i);
                }
                if (aVar2.f2970a >= aVar.f2970a) {
                    this.f2969b.add(i, aVar);
                    return;
                }
            }
            this.f2969b.add(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3693b() {
            int[] iArr = this.f2968a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2969b = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3694c(int i) {
            int[] iArr = this.f2968a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f2968a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo3703o(i)];
                this.f2968a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2968a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo3695d(int i) {
            List<C0445a> list = this.f2969b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((C0445a) this.f2969b.get(size)).f2970a >= i) {
                        this.f2969b.remove(size);
                    }
                }
            }
            return mo3699h(i);
        }

        /* renamed from: e */
        public C0445a mo3696e(int i, int i2, int i3, boolean z) {
            List<C0445a> list = this.f2969b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0445a aVar = (C0445a) this.f2969b.get(i4);
                int i5 = aVar.f2970a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f2971b == i3 || (z && aVar.f2973d))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C0445a mo3697f(int i) {
            List<C0445a> list = this.f2969b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0445a aVar = (C0445a) this.f2969b.get(size);
                if (aVar.f2970a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public int mo3698g(int i) {
            int[] iArr = this.f2968a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public int mo3699h(int i) {
            int[] iArr = this.f2968a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m3618i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f2968a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2968a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.f2968a, i, i3, -1);
            return i3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo3700j(int i, int i2) {
            int[] iArr = this.f2968a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3694c(i3);
                int[] iArr2 = this.f2968a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2968a, i, i3, -1);
                m3619l(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo3701k(int i, int i2) {
            int[] iArr = this.f2968a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3694c(i3);
                int[] iArr2 = this.f2968a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2968a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m3620m(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo3702n(int i, C0449f fVar) {
            mo3694c(i);
            this.f2968a[i] = fVar.f2988e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public int mo3703o(int i) {
            int length = this.f2968a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0447e implements Parcelable {
        public static final Creator<C0447e> CREATOR = new C0448a();

        /* renamed from: a */
        int f2974a;

        /* renamed from: b */
        int f2975b;

        /* renamed from: c */
        int f2976c;

        /* renamed from: d */
        int[] f2977d;

        /* renamed from: e */
        int f2978e;

        /* renamed from: f */
        int[] f2979f;

        /* renamed from: g */
        List<C0445a> f2980g;

        /* renamed from: h */
        boolean f2981h;

        /* renamed from: i */
        boolean f2982i;

        /* renamed from: j */
        boolean f2983j;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C0448a implements Creator<C0447e> {
            C0448a() {
            }

            /* renamed from: a */
            public C0447e createFromParcel(Parcel parcel) {
                return new C0447e(parcel);
            }

            /* renamed from: b */
            public C0447e[] newArray(int i) {
                return new C0447e[i];
            }
        }

        public C0447e() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo3713l() {
            this.f2977d = null;
            this.f2976c = 0;
            this.f2974a = -1;
            this.f2975b = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo3714m() {
            this.f2977d = null;
            this.f2976c = 0;
            this.f2978e = 0;
            this.f2979f = null;
            this.f2980g = null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2974a);
            parcel.writeInt(this.f2975b);
            parcel.writeInt(this.f2976c);
            if (this.f2976c > 0) {
                parcel.writeIntArray(this.f2977d);
            }
            parcel.writeInt(this.f2978e);
            if (this.f2978e > 0) {
                parcel.writeIntArray(this.f2979f);
            }
            parcel.writeInt(this.f2981h ? 1 : 0);
            parcel.writeInt(this.f2982i ? 1 : 0);
            parcel.writeInt(this.f2983j ? 1 : 0);
            parcel.writeList(this.f2980g);
        }

        C0447e(Parcel parcel) {
            this.f2974a = parcel.readInt();
            this.f2975b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2976c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2977d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2978e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2979f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f2981h = parcel.readInt() == 1;
            this.f2982i = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f2983j = z;
            this.f2980g = parcel.readArrayList(C0445a.class.getClassLoader());
        }

        public C0447e(C0447e eVar) {
            this.f2976c = eVar.f2976c;
            this.f2974a = eVar.f2974a;
            this.f2975b = eVar.f2975b;
            this.f2977d = eVar.f2977d;
            this.f2978e = eVar.f2978e;
            this.f2979f = eVar.f2979f;
            this.f2981h = eVar.f2981h;
            this.f2982i = eVar.f2982i;
            this.f2983j = eVar.f2983j;
            this.f2980g = eVar.f2980g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C0449f {

        /* renamed from: a */
        ArrayList<View> f2984a = new ArrayList<>();

        /* renamed from: b */
        int f2985b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f2986c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f2987d = 0;

        /* renamed from: e */
        final int f2988e;

        C0449f(int i) {
            this.f2988e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3720a(View view) {
            C0443c q = mo3736q(view);
            q.f2966e = this;
            this.f2984a.add(view);
            this.f2986c = Integer.MIN_VALUE;
            if (this.f2984a.size() == 1) {
                this.f2985b = Integer.MIN_VALUE;
            }
            if (q.mo3575c() || q.mo3574b()) {
                this.f2987d += StaggeredGridLayoutManager.this.f2952u.mo3859e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3721b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo3734o(Integer.MIN_VALUE);
            } else {
                i2 = mo3738s(Integer.MIN_VALUE);
            }
            mo3724e();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.f2952u.mo3863i()) && (z || i2 <= StaggeredGridLayoutManager.this.f2952u.mo3867m())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f2986c = i2;
                    this.f2985b = i2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3722c() {
            ArrayList<View> arrayList = this.f2984a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C0443c q = mo3736q(view);
            this.f2986c = StaggeredGridLayoutManager.this.f2952u.mo3858d(view);
            if (q.f2967f) {
                C0445a f = StaggeredGridLayoutManager.this.f2938E.mo3697f(q.mo3573a());
                if (f != null && f.f2971b == 1) {
                    this.f2986c += f.mo3705l(this.f2988e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3723d() {
            View view = (View) this.f2984a.get(0);
            C0443c q = mo3736q(view);
            this.f2985b = StaggeredGridLayoutManager.this.f2952u.mo3861g(view);
            if (q.f2967f) {
                C0445a f = StaggeredGridLayoutManager.this.f2938E.mo3697f(q.mo3573a());
                if (f != null && f.f2971b == -1) {
                    this.f2985b -= f.mo3705l(this.f2988e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3724e() {
            this.f2984a.clear();
            mo3739t();
            this.f2987d = 0;
        }

        /* renamed from: f */
        public int mo3725f() {
            if (StaggeredGridLayoutManager.this.f2957z) {
                return mo3731l(this.f2984a.size() - 1, -1, true);
            }
            return mo3731l(0, this.f2984a.size(), true);
        }

        /* renamed from: g */
        public int mo3726g() {
            if (StaggeredGridLayoutManager.this.f2957z) {
                return mo3730k(this.f2984a.size() - 1, -1, true);
            }
            return mo3730k(0, this.f2984a.size(), true);
        }

        /* renamed from: h */
        public int mo3727h() {
            if (StaggeredGridLayoutManager.this.f2957z) {
                return mo3731l(0, this.f2984a.size(), true);
            }
            return mo3731l(this.f2984a.size() - 1, -1, true);
        }

        /* renamed from: i */
        public int mo3728i() {
            if (StaggeredGridLayoutManager.this.f2957z) {
                return mo3730k(0, this.f2984a.size(), true);
            }
            return mo3730k(this.f2984a.size() - 1, -1, true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo3729j(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f2952u.mo3867m();
            int i3 = StaggeredGridLayoutManager.this.f2952u.mo3863i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f2984a.get(i);
                int g = StaggeredGridLayoutManager.this.f2952u.mo3861g(view);
                int d = StaggeredGridLayoutManager.this.f2952u.mo3858d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo3533h0(view);
                        }
                        if (g < m || d > i3) {
                            return StaggeredGridLayoutManager.this.mo3533h0(view);
                        }
                    } else if (g >= m && d <= i3) {
                        return StaggeredGridLayoutManager.this.mo3533h0(view);
                    }
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public int mo3730k(int i, int i2, boolean z) {
            return mo3729j(i, i2, false, false, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public int mo3731l(int i, int i2, boolean z) {
            return mo3729j(i, i2, z, true, false);
        }

        /* renamed from: m */
        public int mo3732m() {
            return this.f2987d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public int mo3733n() {
            int i = this.f2986c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3722c();
            return this.f2986c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public int mo3734o(int i) {
            int i2 = this.f2986c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2984a.size() == 0) {
                return i;
            }
            mo3722c();
            return this.f2986c;
        }

        /* renamed from: p */
        public View mo3735p(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2984a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f2984a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2957z && staggeredGridLayoutManager.mo3533h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2957z && staggeredGridLayoutManager2.mo3533h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2984a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f2984a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2957z && staggeredGridLayoutManager3.mo3533h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2957z && staggeredGridLayoutManager4.mo3533h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public C0443c mo3736q(View view) {
            return (C0443c) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public int mo3737r() {
            int i = this.f2985b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3723d();
            return this.f2985b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public int mo3738s(int i) {
            int i2 = this.f2985b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2984a.size() == 0) {
                return i;
            }
            mo3723d();
            return this.f2985b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public void mo3739t() {
            this.f2985b = Integer.MIN_VALUE;
            this.f2986c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public void mo3740u(int i) {
            int i2 = this.f2985b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2985b = i2 + i;
            }
            int i3 = this.f2986c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2986c = i3 + i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo3741v() {
            int size = this.f2984a.size();
            View view = (View) this.f2984a.remove(size - 1);
            C0443c q = mo3736q(view);
            q.f2966e = null;
            if (q.mo3575c() || q.mo3574b()) {
                this.f2987d -= StaggeredGridLayoutManager.this.f2952u.mo3859e(view);
            }
            if (size == 1) {
                this.f2985b = Integer.MIN_VALUE;
            }
            this.f2986c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public void mo3742w() {
            View view = (View) this.f2984a.remove(0);
            C0443c q = mo3736q(view);
            q.f2966e = null;
            if (this.f2984a.size() == 0) {
                this.f2986c = Integer.MIN_VALUE;
            }
            if (q.mo3575c() || q.mo3574b()) {
                this.f2987d -= StaggeredGridLayoutManager.this.f2952u.mo3859e(view);
            }
            this.f2985b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public void mo3743x(View view) {
            C0443c q = mo3736q(view);
            q.f2966e = this;
            this.f2984a.add(0, view);
            this.f2985b = Integer.MIN_VALUE;
            if (this.f2984a.size() == 1) {
                this.f2986c = Integer.MIN_VALUE;
            }
            if (q.mo3575c() || q.mo3574b()) {
                this.f2987d += StaggeredGridLayoutManager.this.f2952u.mo3859e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: y */
        public void mo3744y(int i) {
            this.f2985b = i;
            this.f2986c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0425d i0 = C0421o.m3264i0(context, attributeSet, i, i2);
        mo3664L2(i0.f2894a);
        mo3666N2(i0.f2895b);
        mo3665M2(i0.f2896c);
        this.f2956y = new LayoutState();
        m3535a2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo3671S1() != false) goto L_0x015b;
     */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3510A2(androidx.recyclerview.widget.RecyclerView.C0433v r9, androidx.recyclerview.widget.RecyclerView.C0401a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f2945L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f2942I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f2936C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo3331b()
            if (r1 != 0) goto L_0x0018
            r8.mo3540k1(r9)
            r0.mo3688c()
            return
        L_0x0018:
            boolean r1 = r0.f2963e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f2936C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f2942I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo3688c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2942I
            if (r5 == 0) goto L_0x0037
            r8.m3520N1(r0)
            goto L_0x003e
        L_0x0037:
            r8.m3517I2()
            boolean r5 = r8.f2934A
            r0.f2961c = r5
        L_0x003e:
            r8.mo3670R2(r10, r0)
            r0.f2963e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2942I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f2936C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f2961c
            boolean r6 = r8.f2940G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo3684x2()
            boolean r6 = r8.f2941H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f2938E
            r5.mo3693b()
            r0.f2962d = r4
        L_0x0060:
            int r5 = r8.mo3493J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2942I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f2976c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f2962d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f2950s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2951t
            r5 = r5[r1]
            r5.mo3724e()
            int r5 = r0.f2960b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f2951t
            r6 = r6[r1]
            r6.mo3744y(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2945L
            int[] r1 = r1.f2964f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f2950s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2951t
            r5 = r5[r1]
            r5.mo3724e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f2945L
            int[] r6 = r6.f2964f
            r6 = r6[r1]
            r5.mo3744y(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f2950s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2951t
            r5 = r5[r1]
            boolean r6 = r8.f2934A
            int r7 = r0.f2960b
            r5.mo3721b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2945L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2951t
            r1.mo3689d(r5)
        L_0x00c9:
            r8.mo3560w(r9)
            androidx.recyclerview.widget.g r1 = r8.f2956y
            r1.f3113a = r3
            r8.f2946M = r3
            androidx.recyclerview.widget.j r1 = r8.f2953v
            int r1 = r1.mo3868n()
            r8.mo3672T2(r1)
            int r1 = r0.f2959a
            r8.m3525S2(r1, r10)
            boolean r1 = r0.f2961c
            if (r1 == 0) goto L_0x00fc
            r8.m3518K2(r2)
            androidx.recyclerview.widget.g r1 = r8.f2956y
            r8.m3536b2(r9, r1, r10)
            r8.m3518K2(r4)
            androidx.recyclerview.widget.g r1 = r8.f2956y
            int r2 = r0.f2959a
            int r5 = r1.f3116d
            int r2 = r2 + r5
            r1.f3115c = r2
            r8.m3536b2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.m3518K2(r4)
            androidx.recyclerview.widget.g r1 = r8.f2956y
            r8.m3536b2(r9, r1, r10)
            r8.m3518K2(r2)
            androidx.recyclerview.widget.g r1 = r8.f2956y
            int r2 = r0.f2959a
            int r5 = r1.f3116d
            int r2 = r2 + r5
            r1.f3115c = r2
            r8.m3536b2(r9, r1, r10)
        L_0x0113:
            r8.m3516H2()
            int r1 = r8.mo3493J()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f2934A
            if (r1 == 0) goto L_0x0127
            r8.m3539j2(r9, r10, r4)
            r8.m3540k2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.m3540k2(r9, r10, r4)
            r8.m3539j2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo3334e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f2939F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo3493J()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f2946M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo3682v2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f2949P
            r8.mo3548o1(r11)
            boolean r11 = r8.mo3671S1()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.mo3334e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2945L
            r11.mo3688c()
        L_0x0166:
            boolean r11 = r0.f2961c
            r8.f2940G = r11
            boolean r11 = r8.mo3684x2()
            r8.f2941H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2945L
            r11.mo3688c()
            r8.m3510A2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3510A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: B2 */
    private boolean m3511B2(int i) {
        boolean z = true;
        if (this.f2954w == 0) {
            if ((i == -1) == this.f2934A) {
                z = false;
            }
            return z;
        }
        if (((i == -1) == this.f2934A) != mo3684x2()) {
            z = false;
        }
        return z;
    }

    /* renamed from: D2 */
    private void m3512D2(View view) {
        for (int i = this.f2950s - 1; i >= 0; i--) {
            this.f2951t[i].mo3743x(view);
        }
    }

    /* renamed from: E2 */
    private void m3513E2(C0433v vVar, LayoutState gVar) {
        int i;
        int i2;
        if (gVar.f3113a && !gVar.f3121i) {
            if (gVar.f3114b == 0) {
                if (gVar.f3117e == -1) {
                    m3514F2(vVar, gVar.f3119g);
                } else {
                    m3515G2(vVar, gVar.f3118f);
                }
            } else if (gVar.f3117e == -1) {
                int i3 = gVar.f3118f;
                int o2 = i3 - m3542o2(i3);
                if (o2 < 0) {
                    i2 = gVar.f3119g;
                } else {
                    i2 = gVar.f3119g - Math.min(o2, gVar.f3114b);
                }
                m3514F2(vVar, i2);
            } else {
                int p2 = m3543p2(gVar.f3119g) - gVar.f3119g;
                if (p2 < 0) {
                    i = gVar.f3118f;
                } else {
                    i = Math.min(p2, gVar.f3114b) + gVar.f3118f;
                }
                m3515G2(vVar, i);
            }
        }
    }

    /* renamed from: F2 */
    private void m3514F2(C0433v vVar, int i) {
        for (int J = mo3493J() - 1; J >= 0; J--) {
            View I = mo3492I(J);
            if (this.f2952u.mo3861g(I) < i || this.f2952u.mo3871q(I) < i) {
                break;
            }
            C0443c cVar = (C0443c) I.getLayoutParams();
            if (cVar.f2967f) {
                int i2 = 0;
                while (i2 < this.f2950s) {
                    if (this.f2951t[i2].f2984a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2950s; i3++) {
                    this.f2951t[i3].mo3741v();
                }
            } else if (cVar.f2966e.f2984a.size() != 1) {
                cVar.f2966e.mo3741v();
            } else {
                return;
            }
            mo3544m1(I, vVar);
        }
    }

    /* renamed from: G2 */
    private void m3515G2(C0433v vVar, int i) {
        while (mo3493J() > 0) {
            View I = mo3492I(0);
            if (this.f2952u.mo3858d(I) > i || this.f2952u.mo3870p(I) > i) {
                break;
            }
            C0443c cVar = (C0443c) I.getLayoutParams();
            if (cVar.f2967f) {
                int i2 = 0;
                while (i2 < this.f2950s) {
                    if (this.f2951t[i2].f2984a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2950s; i3++) {
                    this.f2951t[i3].mo3742w();
                }
            } else if (cVar.f2966e.f2984a.size() != 1) {
                cVar.f2966e.mo3742w();
            } else {
                return;
            }
            mo3544m1(I, vVar);
        }
    }

    /* renamed from: H2 */
    private void m3516H2() {
        if (this.f2953v.mo3865k() != 1073741824) {
            float f = 0.0f;
            int J = mo3493J();
            for (int i = 0; i < J; i++) {
                View I = mo3492I(i);
                float e = (float) this.f2953v.mo3859e(I);
                if (e >= f) {
                    if (((C0443c) I.getLayoutParams()).mo3691f()) {
                        e = (e * 1.0f) / ((float) this.f2950s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f2955x;
            int round = Math.round(f * ((float) this.f2950s));
            if (this.f2953v.mo3865k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2953v.mo3868n());
            }
            mo3672T2(round);
            if (this.f2955x != i2) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I2 = mo3492I(i3);
                    C0443c cVar = (C0443c) I2.getLayoutParams();
                    if (!cVar.f2967f) {
                        if (!mo3684x2() || this.f2954w != 1) {
                            int i4 = cVar.f2966e.f2988e;
                            int i5 = this.f2955x * i4;
                            int i6 = i4 * i2;
                            if (this.f2954w == 1) {
                                I2.offsetLeftAndRight(i5 - i6);
                            } else {
                                I2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f2950s;
                            int i8 = i7 - 1;
                            int i9 = cVar.f2966e.f2988e;
                            I2.offsetLeftAndRight(((-(i8 - i9)) * this.f2955x) - ((-((i7 - 1) - i9)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: I2 */
    private void m3517I2() {
        if (this.f2954w == 1 || !mo3684x2()) {
            this.f2934A = this.f2957z;
        } else {
            this.f2934A = !this.f2957z;
        }
    }

    /* renamed from: K2 */
    private void m3518K2(int i) {
        LayoutState gVar = this.f2956y;
        gVar.f3117e = i;
        int i2 = 1;
        if (this.f2934A != (i == -1)) {
            i2 = -1;
        }
        gVar.f3116d = i2;
    }

    /* renamed from: M1 */
    private void m3519M1(View view) {
        for (int i = this.f2950s - 1; i >= 0; i--) {
            this.f2951t[i].mo3720a(view);
        }
    }

    /* renamed from: N1 */
    private void m3520N1(C0442b bVar) {
        int i;
        C0447e eVar = this.f2942I;
        int i2 = eVar.f2976c;
        if (i2 > 0) {
            if (i2 == this.f2950s) {
                for (int i3 = 0; i3 < this.f2950s; i3++) {
                    this.f2951t[i3].mo3724e();
                    C0447e eVar2 = this.f2942I;
                    int i4 = eVar2.f2977d[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (eVar2.f2982i) {
                            i = this.f2952u.mo3863i();
                        } else {
                            i = this.f2952u.mo3867m();
                        }
                        i4 += i;
                    }
                    this.f2951t[i3].mo3744y(i4);
                }
            } else {
                eVar.mo3714m();
                C0447e eVar3 = this.f2942I;
                eVar3.f2974a = eVar3.f2975b;
            }
        }
        C0447e eVar4 = this.f2942I;
        this.f2941H = eVar4.f2983j;
        mo3665M2(eVar4.f2981h);
        m3517I2();
        C0447e eVar5 = this.f2942I;
        int i5 = eVar5.f2974a;
        if (i5 != -1) {
            this.f2936C = i5;
            bVar.f2961c = eVar5.f2982i;
        } else {
            bVar.f2961c = this.f2934A;
        }
        if (eVar5.f2978e > 1) {
            C0444d dVar = this.f2938E;
            dVar.f2968a = eVar5.f2979f;
            dVar.f2969b = eVar5.f2980g;
        }
    }

    /* renamed from: O2 */
    private void m3521O2(int i, int i2) {
        for (int i3 = 0; i3 < this.f2950s; i3++) {
            if (!this.f2951t[i3].f2984a.isEmpty()) {
                m3528U2(this.f2951t[i3], i, i2);
            }
        }
    }

    /* renamed from: P2 */
    private boolean m3522P2(C0401a0 a0Var, C0442b bVar) {
        int i;
        if (this.f2940G) {
            i = m3538i2(a0Var.mo3331b());
        } else {
            i = m3537d2(a0Var.mo3331b());
        }
        bVar.f2959a = i;
        bVar.f2960b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: Q1 */
    private void m3523Q1(View view, C0443c cVar, LayoutState gVar) {
        if (gVar.f3117e == 1) {
            if (cVar.f2967f) {
                m3519M1(view);
            } else {
                cVar.f2966e.mo3720a(view);
            }
        } else if (cVar.f2967f) {
            m3512D2(view);
        } else {
            cVar.f2966e.mo3743x(view);
        }
    }

    /* renamed from: R1 */
    private int m3524R1(int i) {
        int i2 = -1;
        if (mo3493J() == 0) {
            if (this.f2934A) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < mo3678l2()) == this.f2934A) {
            i2 = 1;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: S2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3525S2(int r5, androidx.recyclerview.widget.RecyclerView.C0401a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.g r0 = r4.f2956y
            r1 = 0
            r0.f3114b = r1
            r0.f3115c = r5
            boolean r0 = r4.mo3562x0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo3332c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f2934A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.j r5 = r4.f2952u
            int r5 = r5.mo3868n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.j r5 = r4.f2952u
            int r5 = r5.mo3868n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo3497M()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.g r0 = r4.f2956y
            androidx.recyclerview.widget.j r3 = r4.f2952u
            int r3 = r3.mo3867m()
            int r3 = r3 - r6
            r0.f3118f = r3
            androidx.recyclerview.widget.g r6 = r4.f2956y
            androidx.recyclerview.widget.j r0 = r4.f2952u
            int r0 = r0.mo3863i()
            int r0 = r0 + r5
            r6.f3119g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.g r0 = r4.f2956y
            androidx.recyclerview.widget.j r3 = r4.f2952u
            int r3 = r3.mo3862h()
            int r3 = r3 + r5
            r0.f3119g = r3
            androidx.recyclerview.widget.g r5 = r4.f2956y
            int r6 = -r6
            r5.f3118f = r6
        L_0x005d:
            androidx.recyclerview.widget.g r5 = r4.f2956y
            r5.f3120h = r1
            r5.f3113a = r2
            androidx.recyclerview.widget.j r6 = r4.f2952u
            int r6 = r6.mo3865k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.j r6 = r4.f2952u
            int r6 = r6.mo3862h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f3121i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3525S2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: T1 */
    private boolean m3526T1(C0449f fVar) {
        if (this.f2934A) {
            if (fVar.mo3733n() < this.f2952u.mo3863i()) {
                ArrayList<View> arrayList = fVar.f2984a;
                return !fVar.mo3736q((View) arrayList.get(arrayList.size() - 1)).f2967f;
            }
        } else if (fVar.mo3737r() > this.f2952u.mo3867m()) {
            return !fVar.mo3736q((View) fVar.f2984a.get(0)).f2967f;
        }
        return false;
    }

    /* renamed from: U1 */
    private int m3527U1(C0401a0 a0Var) {
        if (mo3493J() == 0) {
            return 0;
        }
        return ScrollbarHelper.m3907a(a0Var, this.f2952u, mo3675f2(!this.f2947N), mo3674e2(!this.f2947N), this, this.f2947N);
    }

    /* renamed from: U2 */
    private void m3528U2(C0449f fVar, int i, int i2) {
        int m = fVar.mo3732m();
        if (i == -1) {
            if (fVar.mo3737r() + m <= i2) {
                this.f2935B.set(fVar.f2988e, false);
            }
        } else if (fVar.mo3733n() - m >= i2) {
            this.f2935B.set(fVar.f2988e, false);
        }
    }

    /* renamed from: V1 */
    private int m3529V1(C0401a0 a0Var) {
        if (mo3493J() == 0) {
            return 0;
        }
        return ScrollbarHelper.m3908b(a0Var, this.f2952u, mo3675f2(!this.f2947N), mo3674e2(!this.f2947N), this, this.f2947N, this.f2934A);
    }

    /* renamed from: V2 */
    private int m3530V2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: W1 */
    private int m3531W1(C0401a0 a0Var) {
        if (mo3493J() == 0) {
            return 0;
        }
        return ScrollbarHelper.m3909c(a0Var, this.f2952u, mo3675f2(!this.f2947N), mo3674e2(!this.f2947N), this, this.f2947N);
    }

    /* renamed from: X1 */
    private int m3532X1(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f2954w != 1 && mo3684x2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2954w != 1 && mo3684x2()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f2954w != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f2954w != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f2954w != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.f2954w != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* renamed from: Y1 */
    private C0445a m3533Y1(int i) {
        C0445a aVar = new C0445a();
        aVar.f2972c = new int[this.f2950s];
        for (int i2 = 0; i2 < this.f2950s; i2++) {
            aVar.f2972c[i2] = i - this.f2951t[i2].mo3734o(i);
        }
        return aVar;
    }

    /* renamed from: Z1 */
    private C0445a m3534Z1(int i) {
        C0445a aVar = new C0445a();
        aVar.f2972c = new int[this.f2950s];
        for (int i2 = 0; i2 < this.f2950s; i2++) {
            aVar.f2972c[i2] = this.f2951t[i2].mo3738s(i) - i;
        }
        return aVar;
    }

    /* renamed from: a2 */
    private void m3535a2() {
        this.f2952u = OrientationHelper.m3831b(this, this.f2954w);
        this.f2953v = OrientationHelper.m3831b(this, 1 - this.f2954w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [int, boolean]
  assigns: []
  uses: [boolean, int, ?[int, short, byte, char]]
  mth insns count: 221
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m3536b2(androidx.recyclerview.widget.RecyclerView.C0433v r17, androidx.recyclerview.widget.LayoutState r18, androidx.recyclerview.widget.RecyclerView.C0401a0 r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            java.util.BitSet r0 = r6.f2935B
            int r1 = r6.f2950s
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.g r0 = r6.f2956y
            boolean r0 = r0.f3121i
            if (r0 == 0) goto L_0x0025
            int r0 = r8.f3117e
            if (r0 != r10) goto L_0x0020
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0035
        L_0x0020:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0035
        L_0x0025:
            int r0 = r8.f3117e
            if (r0 != r10) goto L_0x002f
            int r0 = r8.f3119g
            int r1 = r8.f3114b
            int r0 = r0 + r1
            goto L_0x0034
        L_0x002f:
            int r0 = r8.f3118f
            int r1 = r8.f3114b
            int r0 = r0 - r1
        L_0x0034:
            r11 = r0
        L_0x0035:
            int r0 = r8.f3117e
            r6.m3521O2(r0, r11)
            boolean r0 = r6.f2934A
            if (r0 == 0) goto L_0x0045
            androidx.recyclerview.widget.j r0 = r6.f2952u
            int r0 = r0.mo3863i()
            goto L_0x004b
        L_0x0045:
            androidx.recyclerview.widget.j r0 = r6.f2952u
            int r0 = r0.mo3867m()
        L_0x004b:
            r12 = r0
            r0 = 0
        L_0x004d:
            boolean r1 = r18.mo3843a(r19)
            r2 = -1
            if (r1 == 0) goto L_0x01ce
            androidx.recyclerview.widget.g r1 = r6.f2956y
            boolean r1 = r1.f3121i
            if (r1 != 0) goto L_0x0062
            java.util.BitSet r1 = r6.f2935B
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ce
        L_0x0062:
            android.view.View r13 = r8.mo3844b(r7)
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r14 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0443c) r14
            int r0 = r14.mo3573a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f2938E
            int r1 = r1.mo3698g(r0)
            if (r1 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0091
            boolean r1 = r14.f2967f
            if (r1 == 0) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f2951t
            r1 = r1[r9]
            goto L_0x008b
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r1 = r6.m3545r2(r8)
        L_0x008b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2938E
            r4.mo3702n(r0, r1)
            goto L_0x0095
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r4 = r6.f2951t
            r1 = r4[r1]
        L_0x0095:
            r15 = r1
            r14.f2966e = r15
            int r1 = r8.f3117e
            if (r1 != r10) goto L_0x00a0
            r6.mo3523d(r13)
            goto L_0x00a3
        L_0x00a0:
            r6.mo3525e(r13, r9)
        L_0x00a3:
            r6.m3548z2(r13, r14, r9)
            int r1 = r8.f3117e
            if (r1 != r10) goto L_0x00d4
            boolean r1 = r14.f2967f
            if (r1 == 0) goto L_0x00b3
            int r1 = r6.m3541n2(r12)
            goto L_0x00b7
        L_0x00b3:
            int r1 = r15.mo3734o(r12)
        L_0x00b7:
            androidx.recyclerview.widget.j r4 = r6.f2952u
            int r4 = r4.mo3859e(r13)
            int r4 = r4 + r1
            if (r3 == 0) goto L_0x00d1
            boolean r5 = r14.f2967f
            if (r5 == 0) goto L_0x00d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = r6.m3533Y1(r1)
            r5.f2971b = r2
            r5.f2970a = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2938E
            r9.mo3692a(r5)
        L_0x00d1:
            r5 = r4
            r4 = r1
            goto L_0x00fd
        L_0x00d4:
            boolean r1 = r14.f2967f
            if (r1 == 0) goto L_0x00dd
            int r1 = r6.m3544q2(r12)
            goto L_0x00e1
        L_0x00dd:
            int r1 = r15.mo3738s(r12)
        L_0x00e1:
            androidx.recyclerview.widget.j r4 = r6.f2952u
            int r4 = r4.mo3859e(r13)
            int r4 = r1 - r4
            if (r3 == 0) goto L_0x00fc
            boolean r5 = r14.f2967f
            if (r5 == 0) goto L_0x00fc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = r6.m3534Z1(r1)
            r5.f2971b = r10
            r5.f2970a = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2938E
            r9.mo3692a(r5)
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            boolean r1 = r14.f2967f
            if (r1 == 0) goto L_0x0126
            int r1 = r8.f3116d
            if (r1 != r2) goto L_0x0126
            if (r3 == 0) goto L_0x010a
            r6.f2946M = r10
            goto L_0x0126
        L_0x010a:
            int r1 = r8.f3117e
            if (r1 != r10) goto L_0x0113
            boolean r1 = r16.mo3667O1()
            goto L_0x0117
        L_0x0113:
            boolean r1 = r16.mo3668P1()
        L_0x0117:
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x0126
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f2938E
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r1.mo3697f(r0)
            if (r0 == 0) goto L_0x0124
            r0.f2973d = r10
        L_0x0124:
            r6.f2946M = r10
        L_0x0126:
            r6.m3523Q1(r13, r14, r8)
            boolean r0 = r16.mo3684x2()
            if (r0 == 0) goto L_0x015a
            int r0 = r6.f2954w
            if (r0 != r10) goto L_0x015a
            boolean r0 = r14.f2967f
            if (r0 == 0) goto L_0x013e
            androidx.recyclerview.widget.j r0 = r6.f2953v
            int r0 = r0.mo3863i()
            goto L_0x014f
        L_0x013e:
            androidx.recyclerview.widget.j r0 = r6.f2953v
            int r0 = r0.mo3863i()
            int r1 = r6.f2950s
            int r1 = r1 - r10
            int r2 = r15.f2988e
            int r1 = r1 - r2
            int r2 = r6.f2955x
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x014f:
            androidx.recyclerview.widget.j r1 = r6.f2953v
            int r1 = r1.mo3859e(r13)
            int r1 = r0 - r1
            r9 = r0
            r3 = r1
            goto L_0x017b
        L_0x015a:
            boolean r0 = r14.f2967f
            if (r0 == 0) goto L_0x0165
            androidx.recyclerview.widget.j r0 = r6.f2953v
            int r0 = r0.mo3867m()
            goto L_0x0172
        L_0x0165:
            int r0 = r15.f2988e
            int r1 = r6.f2955x
            int r0 = r0 * r1
            androidx.recyclerview.widget.j r1 = r6.f2953v
            int r1 = r1.mo3867m()
            int r0 = r0 + r1
        L_0x0172:
            androidx.recyclerview.widget.j r1 = r6.f2953v
            int r1 = r1.mo3859e(r13)
            int r1 = r1 + r0
            r3 = r0
            r9 = r1
        L_0x017b:
            int r0 = r6.f2954w
            if (r0 != r10) goto L_0x0189
            r0 = r16
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r9
            r0.mo3565z0(r1, r2, r3, r4, r5)
            goto L_0x0192
        L_0x0189:
            r0 = r16
            r1 = r13
            r2 = r4
            r4 = r5
            r5 = r9
            r0.mo3565z0(r1, r2, r3, r4, r5)
        L_0x0192:
            boolean r0 = r14.f2967f
            if (r0 == 0) goto L_0x019e
            androidx.recyclerview.widget.g r0 = r6.f2956y
            int r0 = r0.f3117e
            r6.m3521O2(r0, r11)
            goto L_0x01a5
        L_0x019e:
            androidx.recyclerview.widget.g r0 = r6.f2956y
            int r0 = r0.f3117e
            r6.m3528U2(r15, r0, r11)
        L_0x01a5:
            androidx.recyclerview.widget.g r0 = r6.f2956y
            r6.m3513E2(r7, r0)
            androidx.recyclerview.widget.g r0 = r6.f2956y
            boolean r0 = r0.f3120h
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r14.f2967f
            if (r0 == 0) goto L_0x01c0
            java.util.BitSet r0 = r6.f2935B
            r0.clear()
            goto L_0x01c9
        L_0x01c0:
            java.util.BitSet r0 = r6.f2935B
            int r1 = r15.f2988e
            r3 = 0
            r0.set(r1, r3)
            goto L_0x01ca
        L_0x01c9:
            r3 = 0
        L_0x01ca:
            r0 = 1
            r9 = 0
            goto L_0x004d
        L_0x01ce:
            r3 = 0
            if (r0 != 0) goto L_0x01d6
            androidx.recyclerview.widget.g r0 = r6.f2956y
            r6.m3513E2(r7, r0)
        L_0x01d6:
            androidx.recyclerview.widget.g r0 = r6.f2956y
            int r0 = r0.f3117e
            if (r0 != r2) goto L_0x01ee
            androidx.recyclerview.widget.j r0 = r6.f2952u
            int r0 = r0.mo3867m()
            int r0 = r6.m3544q2(r0)
            androidx.recyclerview.widget.j r1 = r6.f2952u
            int r1 = r1.mo3867m()
            int r1 = r1 - r0
            goto L_0x0200
        L_0x01ee:
            androidx.recyclerview.widget.j r0 = r6.f2952u
            int r0 = r0.mo3863i()
            int r0 = r6.m3541n2(r0)
            androidx.recyclerview.widget.j r1 = r6.f2952u
            int r1 = r1.mo3863i()
            int r1 = r0 - r1
        L_0x0200:
            if (r1 <= 0) goto L_0x0209
            int r0 = r8.f3114b
            int r9 = java.lang.Math.min(r0, r1)
            goto L_0x020a
        L_0x0209:
            r9 = 0
        L_0x020a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3536b2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView$a0):int");
    }

    /* renamed from: d2 */
    private int m3537d2(int i) {
        int J = mo3493J();
        for (int i2 = 0; i2 < J; i2++) {
            int h0 = mo3533h0(mo3492I(i2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: i2 */
    private int m3538i2(int i) {
        for (int J = mo3493J() - 1; J >= 0; J--) {
            int h0 = mo3533h0(mo3492I(J));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: j2 */
    private void m3539j2(C0433v vVar, C0401a0 a0Var, boolean z) {
        int n2 = m3541n2(Integer.MIN_VALUE);
        if (n2 != Integer.MIN_VALUE) {
            int i = this.f2952u.mo3863i() - n2;
            if (i > 0) {
                int i2 = i - (-mo3663J2(-i, vVar, a0Var));
                if (z && i2 > 0) {
                    this.f2952u.mo3872r(i2);
                }
            }
        }
    }

    /* renamed from: k2 */
    private void m3540k2(C0433v vVar, C0401a0 a0Var, boolean z) {
        int q2 = m3544q2(Integer.MAX_VALUE);
        if (q2 != Integer.MAX_VALUE) {
            int m = q2 - this.f2952u.mo3867m();
            if (m > 0) {
                int J2 = m - mo3663J2(m, vVar, a0Var);
                if (z && J2 > 0) {
                    this.f2952u.mo3872r(-J2);
                }
            }
        }
    }

    /* renamed from: n2 */
    private int m3541n2(int i) {
        int o = this.f2951t[0].mo3734o(i);
        for (int i2 = 1; i2 < this.f2950s; i2++) {
            int o2 = this.f2951t[i2].mo3734o(i);
            if (o2 > o) {
                o = o2;
            }
        }
        return o;
    }

    /* renamed from: o2 */
    private int m3542o2(int i) {
        int s = this.f2951t[0].mo3738s(i);
        for (int i2 = 1; i2 < this.f2950s; i2++) {
            int s2 = this.f2951t[i2].mo3738s(i);
            if (s2 > s) {
                s = s2;
            }
        }
        return s;
    }

    /* renamed from: p2 */
    private int m3543p2(int i) {
        int o = this.f2951t[0].mo3734o(i);
        for (int i2 = 1; i2 < this.f2950s; i2++) {
            int o2 = this.f2951t[i2].mo3734o(i);
            if (o2 < o) {
                o = o2;
            }
        }
        return o;
    }

    /* renamed from: q2 */
    private int m3544q2(int i) {
        int s = this.f2951t[0].mo3738s(i);
        for (int i2 = 1; i2 < this.f2950s; i2++) {
            int s2 = this.f2951t[i2].mo3738s(i);
            if (s2 < s) {
                s = s2;
            }
        }
        return s;
    }

    /* renamed from: r2 */
    private C0449f m3545r2(LayoutState gVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m3511B2(gVar.f3117e)) {
            i2 = this.f2950s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f2950s;
            i = 1;
        }
        C0449f fVar = null;
        if (gVar.f3117e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f2952u.mo3867m();
            while (i2 != i3) {
                C0449f fVar2 = this.f2951t[i2];
                int o = fVar2.mo3734o(m);
                if (o < i4) {
                    fVar = fVar2;
                    i4 = o;
                }
                i2 += i;
            }
            return fVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f2952u.mo3863i();
        while (i2 != i3) {
            C0449f fVar3 = this.f2951t[i2];
            int s = fVar3.mo3738s(i6);
            if (s > i5) {
                fVar = fVar3;
                i5 = s;
            }
            i2 += i;
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: u2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3546u2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2934A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo3679m2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo3678l2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2938E
            r4.mo3699h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2938E
            r9.mo3701k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f2938E
            r7.mo3700j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2938E
            r9.mo3701k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2938E
            r9.mo3700j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f2934A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo3678l2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo3679m2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo3556t1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3546u2(int, int, int):void");
    }

    /* renamed from: y2 */
    private void m3547y2(View view, int i, int i2, boolean z) {
        boolean z2;
        mo3537j(view, this.f2944K);
        C0443c cVar = (C0443c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f2944K;
        int V2 = m3530V2(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f2944K;
        int V22 = m3530V2(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo3491H1(view, V2, V22, cVar);
        } else {
            z2 = mo3486F1(view, V2, V22, cVar);
        }
        if (z2) {
            view.measure(V2, V22);
        }
    }

    /* renamed from: z2 */
    private void m3548z2(View view, C0443c cVar, boolean z) {
        if (cVar.f2967f) {
            if (this.f2954w == 1) {
                m3547y2(view, this.f2943J, C0421o.m3261K(mo3511W(), mo3512X(), mo3530g0() + mo3524d0(), cVar.height, true), z);
            } else {
                m3547y2(view, C0421o.m3261K(mo3547o0(), mo3549p0(), mo3526e0() + mo3528f0(), cVar.width, true), this.f2943J, z);
            }
        } else if (this.f2954w == 1) {
            m3547y2(view, C0421o.m3261K(this.f2955x, mo3549p0(), 0, cVar.width, false), C0421o.m3261K(mo3511W(), mo3512X(), mo3530g0() + mo3524d0(), cVar.height, true), z);
        } else {
            m3547y2(view, C0421o.m3261K(mo3547o0(), mo3549p0(), mo3526e0() + mo3528f0(), cVar.width, true), C0421o.m3261K(this.f2955x, mo3512X(), 0, cVar.height, false), z);
        }
    }

    /* renamed from: C0 */
    public void mo3480C0(int i) {
        super.mo3480C0(i);
        for (int i2 = 0; i2 < this.f2950s; i2++) {
            this.f2951t[i2].mo3740u(i);
        }
    }

    /* renamed from: C1 */
    public void mo3060C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int e0 = mo3526e0() + mo3528f0();
        int g0 = mo3530g0() + mo3524d0();
        if (this.f2954w == 1) {
            i4 = C0421o.m3265n(i2, rect.height() + g0, mo3519b0());
            i3 = C0421o.m3265n(i, (this.f2955x * this.f2950s) + e0, mo3522c0());
        } else {
            i3 = C0421o.m3265n(i, rect.width() + e0, mo3522c0());
            i4 = C0421o.m3265n(i2, (this.f2955x * this.f2950s) + g0, mo3519b0());
        }
        mo3479B1(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C2 */
    public void mo3662C2(int i, C0401a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo3679m2();
            i2 = 1;
        } else {
            i3 = mo3678l2();
            i2 = -1;
        }
        this.f2956y.f3113a = true;
        m3525S2(i3, a0Var);
        m3518K2(i2);
        LayoutState gVar = this.f2956y;
        gVar.f3115c = i3 + gVar.f3116d;
        gVar.f3114b = Math.abs(i);
    }

    /* renamed from: D */
    public C0426p mo3061D() {
        if (this.f2954w == 0) {
            return new C0443c(-2, -1);
        }
        return new C0443c(-1, -2);
    }

    /* renamed from: D0 */
    public void mo3481D0(int i) {
        super.mo3481D0(i);
        for (int i2 = 0; i2 < this.f2950s; i2++) {
            this.f2951t[i2].mo3740u(i);
        }
    }

    /* renamed from: E */
    public C0426p mo3062E(Context context, AttributeSet attributeSet) {
        return new C0443c(context, attributeSet);
    }

    /* renamed from: F */
    public C0426p mo3063F(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0443c((MarginLayoutParams) layoutParams);
        }
        return new C0443c(layoutParams);
    }

    /* renamed from: I0 */
    public void mo3106I0(RecyclerView recyclerView, C0433v vVar) {
        super.mo3106I0(recyclerView, vVar);
        mo3548o1(this.f2949P);
        for (int i = 0; i < this.f2950s; i++) {
            this.f2951t[i].mo3724e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: I1 */
    public void mo3107I1(RecyclerView recyclerView, C0401a0 a0Var, int i) {
        LinearSmoothScroller hVar = new LinearSmoothScroller(recyclerView.getContext());
        hVar.mo3655p(i);
        mo3494J1(hVar);
    }

    /* renamed from: J0 */
    public View mo3065J0(View view, int i, C0433v vVar, C0401a0 a0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (mo3493J() == 0) {
            return null;
        }
        View B = mo3477B(view);
        if (B == null) {
            return null;
        }
        m3517I2();
        int X1 = m3532X1(i);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        C0443c cVar = (C0443c) B.getLayoutParams();
        boolean z = cVar.f2967f;
        C0449f fVar = cVar.f2966e;
        if (X1 == 1) {
            i2 = mo3679m2();
        } else {
            i2 = mo3678l2();
        }
        m3525S2(i2, a0Var);
        m3518K2(X1);
        LayoutState gVar = this.f2956y;
        gVar.f3115c = gVar.f3116d + i2;
        gVar.f3114b = (int) (((float) this.f2952u.mo3868n()) * 0.33333334f);
        LayoutState gVar2 = this.f2956y;
        gVar2.f3120h = true;
        gVar2.f3113a = false;
        m3536b2(vVar, gVar2, a0Var);
        this.f2940G = this.f2934A;
        if (!z) {
            View p = fVar.mo3735p(i2, X1);
            if (!(p == null || p == B)) {
                return p;
            }
        }
        if (m3511B2(X1)) {
            for (int i6 = this.f2950s - 1; i6 >= 0; i6--) {
                View p2 = this.f2951t[i6].mo3735p(i2, X1);
                if (p2 != null && p2 != B) {
                    return p2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f2950s; i7++) {
                View p3 = this.f2951t[i7].mo3735p(i2, X1);
                if (p3 != null && p3 != B) {
                    return p3;
                }
            }
        }
        boolean z2 = (this.f2957z ^ true) == (X1 == -1);
        if (!z) {
            if (z2) {
                i5 = fVar.mo3726g();
            } else {
                i5 = fVar.mo3728i();
            }
            View C = mo3101C(i5);
            if (!(C == null || C == B)) {
                return C;
            }
        }
        if (m3511B2(X1)) {
            for (int i8 = this.f2950s - 1; i8 >= 0; i8--) {
                if (i8 != fVar.f2988e) {
                    if (z2) {
                        i4 = this.f2951t[i8].mo3726g();
                    } else {
                        i4 = this.f2951t[i8].mo3728i();
                    }
                    View C2 = mo3101C(i4);
                    if (!(C2 == null || C2 == B)) {
                        return C2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f2950s; i9++) {
                if (z2) {
                    i3 = this.f2951t[i9].mo3726g();
                } else {
                    i3 = this.f2951t[i9].mo3728i();
                }
                View C3 = mo3101C(i3);
                if (C3 != null && C3 != B) {
                    return C3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J2 */
    public int mo3663J2(int i, C0433v vVar, C0401a0 a0Var) {
        if (mo3493J() == 0 || i == 0) {
            return 0;
        }
        mo3662C2(i, a0Var);
        int b2 = m3536b2(vVar, this.f2956y, a0Var);
        if (this.f2956y.f3114b >= b2) {
            i = i < 0 ? -b2 : b2;
        }
        this.f2952u.mo3872r(-i);
        this.f2940G = this.f2934A;
        LayoutState gVar = this.f2956y;
        gVar.f3114b = 0;
        m3513E2(vVar, gVar);
        return i;
    }

    /* renamed from: K0 */
    public void mo3108K0(AccessibilityEvent accessibilityEvent) {
        super.mo3108K0(accessibilityEvent);
        if (mo3493J() > 0) {
            View f2 = mo3675f2(false);
            View e2 = mo3674e2(false);
            if (f2 != null && e2 != null) {
                int h0 = mo3533h0(f2);
                int h02 = mo3533h0(e2);
                if (h0 < h02) {
                    accessibilityEvent.setFromIndex(h0);
                    accessibilityEvent.setToIndex(h02);
                    return;
                }
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h0);
            }
        }
    }

    /* renamed from: L1 */
    public boolean mo3066L1() {
        return this.f2942I == null;
    }

    /* renamed from: L2 */
    public void mo3664L2(int i) {
        if (i == 0 || i == 1) {
            mo3124g(null);
            if (i != this.f2954w) {
                this.f2954w = i;
                OrientationHelper jVar = this.f2952u;
                this.f2952u = this.f2953v;
                this.f2953v = jVar;
                mo3556t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: M2 */
    public void mo3665M2(boolean z) {
        mo3124g(null);
        C0447e eVar = this.f2942I;
        if (!(eVar == null || eVar.f2981h == z)) {
            eVar.f2981h = z;
        }
        this.f2957z = z;
        mo3556t1();
    }

    /* renamed from: N */
    public int mo3067N(C0433v vVar, C0401a0 a0Var) {
        if (this.f2954w == 1) {
            return this.f2950s;
        }
        return super.mo3067N(vVar, a0Var);
    }

    /* renamed from: N2 */
    public void mo3666N2(int i) {
        mo3124g(null);
        if (i != this.f2950s) {
            mo3683w2();
            this.f2950s = i;
            this.f2935B = new BitSet(this.f2950s);
            this.f2951t = new C0449f[this.f2950s];
            for (int i2 = 0; i2 < this.f2950s; i2++) {
                this.f2951t[i2] = new C0449f(i2);
            }
            mo3556t1();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O1 */
    public boolean mo3667O1() {
        int o = this.f2951t[0].mo3734o(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2950s; i++) {
            if (this.f2951t[i].mo3734o(Integer.MIN_VALUE) != o) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P0 */
    public void mo3069P0(C0433v vVar, C0401a0 a0Var, View view, AccessibilityNodeInfoCompat cVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0443c)) {
            super.mo3501O0(view, cVar);
            return;
        }
        C0443c cVar2 = (C0443c) layoutParams;
        if (this.f2954w == 0) {
            cVar.mo5055a0(C0636c.m5416a(cVar2.mo3690e(), cVar2.f2967f ? this.f2950s : 1, -1, -1, false, false));
        } else {
            cVar.mo5055a0(C0636c.m5416a(-1, -1, cVar2.mo3690e(), cVar2.f2967f ? this.f2950s : 1, false, false));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P1 */
    public boolean mo3668P1() {
        int s = this.f2951t[0].mo3738s(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2950s; i++) {
            if (this.f2951t[i].mo3738s(Integer.MIN_VALUE) != s) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q2 */
    public boolean mo3669Q2(C0401a0 a0Var, C0442b bVar) {
        int i;
        int i2;
        boolean z = false;
        if (!a0Var.mo3334e()) {
            int i3 = this.f2936C;
            if (i3 != -1) {
                if (i3 < 0 || i3 >= a0Var.mo3331b()) {
                    this.f2936C = -1;
                    this.f2937D = Integer.MIN_VALUE;
                } else {
                    C0447e eVar = this.f2942I;
                    if (eVar == null || eVar.f2974a == -1 || eVar.f2976c < 1) {
                        View C = mo3101C(this.f2936C);
                        if (C != null) {
                            if (this.f2934A) {
                                i = mo3679m2();
                            } else {
                                i = mo3678l2();
                            }
                            bVar.f2959a = i;
                            if (this.f2937D != Integer.MIN_VALUE) {
                                if (bVar.f2961c) {
                                    bVar.f2960b = (this.f2952u.mo3863i() - this.f2937D) - this.f2952u.mo3858d(C);
                                } else {
                                    bVar.f2960b = (this.f2952u.mo3867m() + this.f2937D) - this.f2952u.mo3861g(C);
                                }
                                return true;
                            } else if (this.f2952u.mo3859e(C) > this.f2952u.mo3868n()) {
                                if (bVar.f2961c) {
                                    i2 = this.f2952u.mo3863i();
                                } else {
                                    i2 = this.f2952u.mo3867m();
                                }
                                bVar.f2960b = i2;
                                return true;
                            } else {
                                int g = this.f2952u.mo3861g(C) - this.f2952u.mo3867m();
                                if (g < 0) {
                                    bVar.f2960b = -g;
                                    return true;
                                }
                                int i4 = this.f2952u.mo3863i() - this.f2952u.mo3858d(C);
                                if (i4 < 0) {
                                    bVar.f2960b = i4;
                                    return true;
                                }
                                bVar.f2960b = Integer.MIN_VALUE;
                            }
                        } else {
                            int i5 = this.f2936C;
                            bVar.f2959a = i5;
                            int i6 = this.f2937D;
                            if (i6 == Integer.MIN_VALUE) {
                                if (m3524R1(i5) == 1) {
                                    z = true;
                                }
                                bVar.f2961c = z;
                                bVar.mo3686a();
                            } else {
                                bVar.mo3687b(i6);
                            }
                            bVar.f2962d = true;
                        }
                    } else {
                        bVar.f2960b = Integer.MIN_VALUE;
                        bVar.f2959a = this.f2936C;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: R0 */
    public void mo3070R0(RecyclerView recyclerView, int i, int i2) {
        m3546u2(i, i2, 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R2 */
    public void mo3670R2(C0401a0 a0Var, C0442b bVar) {
        if (!mo3669Q2(a0Var, bVar) && !m3522P2(a0Var, bVar)) {
            bVar.mo3686a();
            bVar.f2959a = 0;
        }
    }

    /* renamed from: S0 */
    public void mo3071S0(RecyclerView recyclerView) {
        this.f2938E.mo3693b();
        mo3556t1();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S1 */
    public boolean mo3671S1() {
        int i;
        int i2;
        if (mo3493J() == 0 || this.f2939F == 0 || !mo3553r0()) {
            return false;
        }
        if (this.f2934A) {
            i2 = mo3679m2();
            i = mo3678l2();
        } else {
            i2 = mo3678l2();
            i = mo3679m2();
        }
        if (i2 == 0 && mo3682v2() != null) {
            this.f2938E.mo3693b();
            mo3558u1();
            mo3556t1();
            return true;
        } else if (!this.f2946M) {
            return false;
        } else {
            int i3 = this.f2934A ? -1 : 1;
            int i4 = i + 1;
            C0445a e = this.f2938E.mo3696e(i2, i4, i3, true);
            if (e == null) {
                this.f2946M = false;
                this.f2938E.mo3695d(i4);
                return false;
            }
            C0445a e2 = this.f2938E.mo3696e(i2, e.f2970a, i3 * -1, true);
            if (e2 == null) {
                this.f2938E.mo3695d(e.f2970a);
            } else {
                this.f2938E.mo3695d(e2.f2970a + 1);
            }
            mo3558u1();
            mo3556t1();
            return true;
        }
    }

    /* renamed from: T0 */
    public void mo3072T0(RecyclerView recyclerView, int i, int i2, int i3) {
        m3546u2(i, i2, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T2 */
    public void mo3672T2(int i) {
        this.f2955x = i / this.f2950s;
        this.f2943J = MeasureSpec.makeMeasureSpec(i, this.f2953v.mo3865k());
    }

    /* renamed from: U0 */
    public void mo3073U0(RecyclerView recyclerView, int i, int i2) {
        m3546u2(i, i2, 2);
    }

    /* renamed from: W0 */
    public void mo3074W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m3546u2(i, i2, 4);
    }

    /* renamed from: X0 */
    public void mo3075X0(C0433v vVar, C0401a0 a0Var) {
        m3510A2(vVar, a0Var, true);
    }

    /* renamed from: Y0 */
    public void mo3076Y0(C0401a0 a0Var) {
        super.mo3076Y0(a0Var);
        this.f2936C = -1;
        this.f2937D = Integer.MIN_VALUE;
        this.f2942I = null;
        this.f2945L.mo3688c();
    }

    /* renamed from: a */
    public PointF mo3117a(int i) {
        int R1 = m3524R1(i);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f2954w == 0) {
            pointF.x = (float) R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R1;
        }
        return pointF;
    }

    /* renamed from: c1 */
    public void mo3120c1(Parcelable parcelable) {
        if (parcelable instanceof C0447e) {
            this.f2942I = (C0447e) parcelable;
            mo3556t1();
        }
    }

    /* renamed from: c2 */
    public int[] mo3673c2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f2950s];
        } else if (iArr.length < this.f2950s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f2950s);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.f2950s; i++) {
            iArr[i] = this.f2951t[i].mo3725f();
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable mo3121d1() {
        /*
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r4.f2942I
            if (r0 == 0) goto L_0x000c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r4.f2942I
            r0.<init>(r1)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r0.<init>()
            boolean r1 = r4.f2957z
            r0.f2981h = r1
            boolean r1 = r4.f2940G
            r0.f2982i = r1
            boolean r1 = r4.f2941H
            r0.f2983j = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r4.f2938E
            r2 = 0
            if (r1 == 0) goto L_0x0030
            int[] r3 = r1.f2968a
            if (r3 == 0) goto L_0x0030
            r0.f2979f = r3
            int r3 = r3.length
            r0.f2978e = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r1.f2969b
            r0.f2980g = r1
            goto L_0x0032
        L_0x0030:
            r0.f2978e = r2
        L_0x0032:
            int r1 = r4.mo3493J()
            if (r1 <= 0) goto L_0x0088
            boolean r1 = r4.f2940G
            if (r1 == 0) goto L_0x0041
            int r1 = r4.mo3679m2()
            goto L_0x0045
        L_0x0041:
            int r1 = r4.mo3678l2()
        L_0x0045:
            r0.f2974a = r1
            int r1 = r4.mo3676g2()
            r0.f2975b = r1
            int r1 = r4.f2950s
            r0.f2976c = r1
            int[] r1 = new int[r1]
            r0.f2977d = r1
        L_0x0055:
            int r1 = r4.f2950s
            if (r2 >= r1) goto L_0x008f
            boolean r1 = r4.f2940G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0070
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2951t
            r1 = r1[r2]
            int r1 = r1.mo3734o(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.j r3 = r4.f2952u
            int r3 = r3.mo3863i()
            goto L_0x0080
        L_0x0070:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2951t
            r1 = r1[r2]
            int r1 = r1.mo3738s(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.j r3 = r4.f2952u
            int r3 = r3.mo3867m()
        L_0x0080:
            int r1 = r1 - r3
        L_0x0081:
            int[] r3 = r0.f2977d
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0088:
            r1 = -1
            r0.f2974a = r1
            r0.f2975b = r1
            r0.f2976c = r2
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo3121d1():android.os.Parcelable");
    }

    /* renamed from: e1 */
    public void mo3527e1(int i) {
        if (i == 0) {
            mo3671S1();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e2 */
    public View mo3674e2(boolean z) {
        int m = this.f2952u.mo3867m();
        int i = this.f2952u.mo3863i();
        View view = null;
        for (int J = mo3493J() - 1; J >= 0; J--) {
            View I = mo3492I(J);
            int g = this.f2952u.mo3861g(I);
            int d = this.f2952u.mo3858d(I);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f2 */
    public View mo3675f2(boolean z) {
        int m = this.f2952u.mo3867m();
        int i = this.f2952u.mo3863i();
        int J = mo3493J();
        View view = null;
        for (int i2 = 0; i2 < J; i2++) {
            View I = mo3492I(i2);
            int g = this.f2952u.mo3861g(I);
            if (this.f2952u.mo3858d(I) > m && g < i) {
                if (g >= m || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* renamed from: g */
    public void mo3124g(String str) {
        if (this.f2942I == null) {
            super.mo3124g(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g2 */
    public int mo3676g2() {
        View view;
        if (this.f2934A) {
            view = mo3674e2(true);
        } else {
            view = mo3675f2(true);
        }
        if (view == null) {
            return -1;
        }
        return mo3533h0(view);
    }

    /* renamed from: h2 */
    public int[] mo3677h2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f2950s];
        } else if (iArr.length < this.f2950s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f2950s);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.f2950s; i++) {
            iArr[i] = this.f2951t[i].mo3727h();
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean mo3126k() {
        return this.f2954w == 0;
    }

    /* renamed from: k0 */
    public int mo3081k0(C0433v vVar, C0401a0 a0Var) {
        if (this.f2954w == 0) {
            return this.f2950s;
        }
        return super.mo3081k0(vVar, a0Var);
    }

    /* renamed from: l */
    public boolean mo3127l() {
        return this.f2954w == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l2 */
    public int mo3678l2() {
        if (mo3493J() == 0) {
            return 0;
        }
        return mo3533h0(mo3492I(0));
    }

    /* renamed from: m */
    public boolean mo3082m(C0426p pVar) {
        return pVar instanceof C0443c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m2 */
    public int mo3679m2() {
        int J = mo3493J();
        if (J == 0) {
            return 0;
        }
        return mo3533h0(mo3492I(J - 1));
    }

    /* renamed from: o */
    public void mo3128o(int i, int i2, C0401a0 a0Var, C0424c cVar) {
        int i3;
        int i4;
        if (this.f2954w != 0) {
            i = i2;
        }
        if (mo3493J() != 0 && i != 0) {
            mo3662C2(i, a0Var);
            int[] iArr = this.f2948O;
            if (iArr == null || iArr.length < this.f2950s) {
                this.f2948O = new int[this.f2950s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2950s; i6++) {
                LayoutState gVar = this.f2956y;
                if (gVar.f3116d == -1) {
                    i4 = gVar.f3118f;
                    i3 = this.f2951t[i6].mo3738s(i4);
                } else {
                    i4 = this.f2951t[i6].mo3734o(gVar.f3119g);
                    i3 = this.f2956y.f3119g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f2948O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f2948O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f2956y.mo3843a(a0Var); i8++) {
                cVar.mo3572a(this.f2956y.f3115c, this.f2948O[i8]);
                LayoutState gVar2 = this.f2956y;
                gVar2.f3115c += gVar2.f3116d;
            }
        }
    }

    /* renamed from: q */
    public int mo3130q(C0401a0 a0Var) {
        return m3527U1(a0Var);
    }

    /* renamed from: r */
    public int mo3083r(C0401a0 a0Var) {
        return m3529V1(a0Var);
    }

    /* renamed from: s */
    public int mo3084s(C0401a0 a0Var) {
        return m3531W1(a0Var);
    }

    /* renamed from: s0 */
    public boolean mo3133s0() {
        return this.f2939F != 0;
    }

    /* renamed from: s2 */
    public int mo3680s2() {
        return this.f2954w;
    }

    /* renamed from: t */
    public int mo3135t(C0401a0 a0Var) {
        return m3527U1(a0Var);
    }

    /* renamed from: t2 */
    public int mo3681t2() {
        return this.f2950s;
    }

    /* renamed from: u */
    public int mo3085u(C0401a0 a0Var) {
        return m3529V1(a0Var);
    }

    /* renamed from: v */
    public int mo3087v(C0401a0 a0Var) {
        return m3531W1(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: v2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3682v2() {
        /*
            r12 = this;
            int r0 = r12.mo3493J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2950s
            r2.<init>(r3)
            int r3 = r12.f2950s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2954w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo3684x2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2934A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo3492I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0443c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2966e
            int r9 = r9.f2988e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2966e
            boolean r9 = r12.m3526T1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2966e
            int r9 = r9.f2988e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2967f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo3492I(r9)
            boolean r10 = r12.f2934A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.j r10 = r12.f2952u
            int r10 = r10.mo3858d(r7)
            androidx.recyclerview.widget.j r11 = r12.f2952u
            int r11 = r11.mo3858d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.j r10 = r12.f2952u
            int r10 = r10.mo3861g(r7)
            androidx.recyclerview.widget.j r11 = r12.f2952u
            int r11 = r11.mo3861g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0443c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2966e
            int r8 = r8.f2988e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2966e
            int r9 = r9.f2988e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo3682v2():android.view.View");
    }

    /* renamed from: w1 */
    public int mo3088w1(int i, C0433v vVar, C0401a0 a0Var) {
        return mo3663J2(i, vVar, a0Var);
    }

    /* renamed from: w2 */
    public void mo3683w2() {
        this.f2938E.mo3693b();
        mo3556t1();
    }

    /* renamed from: x1 */
    public void mo3137x1(int i) {
        C0447e eVar = this.f2942I;
        if (!(eVar == null || eVar.f2974a == i)) {
            eVar.mo3713l();
        }
        this.f2936C = i;
        this.f2937D = Integer.MIN_VALUE;
        mo3556t1();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x2 */
    public boolean mo3684x2() {
        return mo3514Z() == 1;
    }

    /* renamed from: y1 */
    public int mo3090y1(int i, C0433v vVar, C0401a0 a0Var) {
        return mo3663J2(i, vVar, a0Var);
    }
}
