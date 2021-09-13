package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0421o.C0424c;
import androidx.recyclerview.widget.RecyclerView.C0421o.C0425d;
import androidx.recyclerview.widget.RecyclerView.C0426p;
import androidx.recyclerview.widget.RecyclerView.C0433v;
import androidx.recyclerview.widget.RecyclerView.C0438z.C0440b;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import java.util.List;

public class LinearLayoutManager extends C0421o implements C0440b {

    /* renamed from: A */
    int f2690A;

    /* renamed from: B */
    int f2691B;

    /* renamed from: C */
    private boolean f2692C;

    /* renamed from: D */
    C0398d f2693D;

    /* renamed from: E */
    final C0395a f2694E;

    /* renamed from: F */
    private final C0396b f2695F;

    /* renamed from: G */
    private int f2696G;

    /* renamed from: H */
    private int[] f2697H;

    /* renamed from: s */
    int f2698s;

    /* renamed from: t */
    private C0397c f2699t;

    /* renamed from: u */
    OrientationHelper f2700u;

    /* renamed from: v */
    private boolean f2701v;

    /* renamed from: w */
    private boolean f2702w;

    /* renamed from: x */
    boolean f2703x;

    /* renamed from: y */
    private boolean f2704y;

    /* renamed from: z */
    private boolean f2705z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0395a {

        /* renamed from: a */
        OrientationHelper f2706a;

        /* renamed from: b */
        int f2707b;

        /* renamed from: c */
        int f2708c;

        /* renamed from: d */
        boolean f2709d;

        /* renamed from: e */
        boolean f2710e;

        C0395a() {
            mo3142e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3138a() {
            int i;
            if (this.f2709d) {
                i = this.f2706a.mo3863i();
            } else {
                i = this.f2706a.mo3867m();
            }
            this.f2708c = i;
        }

        /* renamed from: b */
        public void mo3139b(View view, int i) {
            if (this.f2709d) {
                this.f2708c = this.f2706a.mo3858d(view) + this.f2706a.mo3869o();
            } else {
                this.f2708c = this.f2706a.mo3861g(view);
            }
            this.f2707b = i;
        }

        /* renamed from: c */
        public void mo3140c(View view, int i) {
            int o = this.f2706a.mo3869o();
            if (o >= 0) {
                mo3139b(view, i);
                return;
            }
            this.f2707b = i;
            if (this.f2709d) {
                int i2 = (this.f2706a.mo3863i() - o) - this.f2706a.mo3858d(view);
                this.f2708c = this.f2706a.mo3863i() - i2;
                if (i2 > 0) {
                    int e = this.f2708c - this.f2706a.mo3859e(view);
                    int m = this.f2706a.mo3867m();
                    int min = e - (m + Math.min(this.f2706a.mo3861g(view) - m, 0));
                    if (min < 0) {
                        this.f2708c += Math.min(i2, -min);
                    }
                }
            } else {
                int g = this.f2706a.mo3861g(view);
                int m2 = g - this.f2706a.mo3867m();
                this.f2708c = g;
                if (m2 > 0) {
                    int i3 = (this.f2706a.mo3863i() - Math.min(0, (this.f2706a.mo3863i() - o) - this.f2706a.mo3858d(view))) - (g + this.f2706a.mo3859e(view));
                    if (i3 < 0) {
                        this.f2708c -= Math.min(m2, -i3);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo3141d(View view, C0401a0 a0Var) {
            C0426p pVar = (C0426p) view.getLayoutParams();
            return !pVar.mo3575c() && pVar.mo3573a() >= 0 && pVar.mo3573a() < a0Var.mo3331b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3142e() {
            this.f2707b = -1;
            this.f2708c = Integer.MIN_VALUE;
            this.f2709d = false;
            this.f2710e = false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.f2707b);
            sb.append(", mCoordinate=");
            sb.append(this.f2708c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f2709d);
            sb.append(", mValid=");
            sb.append(this.f2710e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0396b {

        /* renamed from: a */
        public int f2711a;

        /* renamed from: b */
        public boolean f2712b;

        /* renamed from: c */
        public boolean f2713c;

        /* renamed from: d */
        public boolean f2714d;

        protected C0396b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3144a() {
            this.f2711a = 0;
            this.f2712b = false;
            this.f2713c = false;
            this.f2714d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0397c {

        /* renamed from: a */
        boolean f2715a = true;

        /* renamed from: b */
        int f2716b;

        /* renamed from: c */
        int f2717c;

        /* renamed from: d */
        int f2718d;

        /* renamed from: e */
        int f2719e;

        /* renamed from: f */
        int f2720f;

        /* renamed from: g */
        int f2721g;

        /* renamed from: h */
        int f2722h = 0;

        /* renamed from: i */
        int f2723i = 0;

        /* renamed from: j */
        boolean f2724j = false;

        /* renamed from: k */
        int f2725k;

        /* renamed from: l */
        List<C0407d0> f2726l = null;

        /* renamed from: m */
        boolean f2727m;

        C0397c() {
        }

        /* renamed from: e */
        private View m2978e() {
            int size = this.f2726l.size();
            for (int i = 0; i < size; i++) {
                View view = ((C0407d0) this.f2726l.get(i)).f2841b;
                C0426p pVar = (C0426p) view.getLayoutParams();
                if (!pVar.mo3575c() && this.f2718d == pVar.mo3573a()) {
                    mo3146b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo3145a() {
            mo3146b(null);
        }

        /* renamed from: b */
        public void mo3146b(View view) {
            View f = mo3149f(view);
            if (f == null) {
                this.f2718d = -1;
            } else {
                this.f2718d = ((C0426p) f.getLayoutParams()).mo3573a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo3147c(C0401a0 a0Var) {
            int i = this.f2718d;
            return i >= 0 && i < a0Var.mo3331b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public View mo3148d(C0433v vVar) {
            if (this.f2726l != null) {
                return m2978e();
            }
            View o = vVar.mo3621o(this.f2718d);
            this.f2718d += this.f2719e;
            return o;
        }

        /* renamed from: f */
        public View mo3149f(View view) {
            int size = this.f2726l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C0407d0) this.f2726l.get(i2)).f2841b;
                C0426p pVar = (C0426p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo3575c()) {
                    int a = (pVar.mo3573a() - this.f2718d) * this.f2719e;
                    if (a >= 0 && a < i) {
                        view2 = view3;
                        if (a == 0) {
                            break;
                        }
                        i = a;
                    }
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0398d implements Parcelable {
        public static final Creator<C0398d> CREATOR = new C0399a();

        /* renamed from: a */
        int f2728a;

        /* renamed from: b */
        int f2729b;

        /* renamed from: c */
        boolean f2730c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C0399a implements Creator<C0398d> {
            C0399a() {
            }

            /* renamed from: a */
            public C0398d createFromParcel(Parcel parcel) {
                return new C0398d(parcel);
            }

            /* renamed from: b */
            public C0398d[] newArray(int i) {
                return new C0398d[i];
            }
        }

        public C0398d() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public boolean mo3151l() {
            return this.f2728a >= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo3152m() {
            this.f2728a = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2728a);
            parcel.writeInt(this.f2729b);
            parcel.writeInt(this.f2730c ? 1 : 0);
        }

        C0398d(Parcel parcel) {
            this.f2728a = parcel.readInt();
            this.f2729b = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f2730c = z;
        }

        public C0398d(C0398d dVar) {
            this.f2728a = dVar.f2728a;
            this.f2729b = dVar.f2729b;
            this.f2730c = dVar.f2730c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: A2 */
    private void m2889A2(C0433v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int J = mo3493J();
            if (!this.f2703x) {
                int i4 = 0;
                while (true) {
                    if (i4 >= J) {
                        break;
                    }
                    View I = mo3492I(i4);
                    if (this.f2700u.mo3858d(I) > i3 || this.f2700u.mo3870p(I) > i3) {
                        m2916y2(vVar, 0, i4);
                    } else {
                        i4++;
                    }
                }
            } else {
                int i5 = J - 1;
                for (int i6 = i5; i6 >= 0; i6--) {
                    View I2 = mo3492I(i6);
                    if (this.f2700u.mo3858d(I2) > i3 || this.f2700u.mo3870p(I2) > i3) {
                        m2916y2(vVar, i5, i6);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: C2 */
    private void m2890C2() {
        if (this.f2698s == 1 || !mo3134s2()) {
            this.f2703x = this.f2702w;
        } else {
            this.f2703x = !this.f2702w;
        }
    }

    /* renamed from: H2 */
    private boolean m2891H2(C0433v vVar, C0401a0 a0Var, C0395a aVar) {
        View view;
        int i;
        boolean z = false;
        if (mo3493J() == 0) {
            return false;
        }
        View V = mo3509V();
        if (V != null && aVar.mo3141d(V, a0Var)) {
            aVar.mo3140c(V, mo3533h0(V));
            return true;
        } else if (this.f2701v != this.f2704y) {
            return false;
        } else {
            if (aVar.f2709d) {
                view = m2908k2(vVar, a0Var);
            } else {
                view = m2909l2(vVar, a0Var);
            }
            if (view == null) {
                return false;
            }
            aVar.mo3139b(view, mo3533h0(view));
            if (!a0Var.mo3334e() && mo3066L1()) {
                if (this.f2700u.mo3861g(view) >= this.f2700u.mo3863i() || this.f2700u.mo3858d(view) < this.f2700u.mo3867m()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f2709d) {
                        i = this.f2700u.mo3863i();
                    } else {
                        i = this.f2700u.mo3867m();
                    }
                    aVar.f2708c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: I2 */
    private boolean m2892I2(C0401a0 a0Var, C0395a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.mo3334e()) {
            int i2 = this.f2690A;
            if (i2 != -1) {
                if (i2 < 0 || i2 >= a0Var.mo3331b()) {
                    this.f2690A = -1;
                    this.f2691B = Integer.MIN_VALUE;
                } else {
                    aVar.f2707b = this.f2690A;
                    C0398d dVar = this.f2693D;
                    if (dVar != null && dVar.mo3151l()) {
                        boolean z2 = this.f2693D.f2730c;
                        aVar.f2709d = z2;
                        if (z2) {
                            aVar.f2708c = this.f2700u.mo3863i() - this.f2693D.f2729b;
                        } else {
                            aVar.f2708c = this.f2700u.mo3867m() + this.f2693D.f2729b;
                        }
                        return true;
                    } else if (this.f2691B == Integer.MIN_VALUE) {
                        View C = mo3101C(this.f2690A);
                        if (C == null) {
                            if (mo3493J() > 0) {
                                if ((this.f2690A < mo3533h0(mo3492I(0))) == this.f2703x) {
                                    z = true;
                                }
                                aVar.f2709d = z;
                            }
                            aVar.mo3138a();
                        } else if (this.f2700u.mo3859e(C) > this.f2700u.mo3868n()) {
                            aVar.mo3138a();
                            return true;
                        } else if (this.f2700u.mo3861g(C) - this.f2700u.mo3867m() < 0) {
                            aVar.f2708c = this.f2700u.mo3867m();
                            aVar.f2709d = false;
                            return true;
                        } else if (this.f2700u.mo3863i() - this.f2700u.mo3858d(C) < 0) {
                            aVar.f2708c = this.f2700u.mo3863i();
                            aVar.f2709d = true;
                            return true;
                        } else {
                            if (aVar.f2709d) {
                                i = this.f2700u.mo3858d(C) + this.f2700u.mo3869o();
                            } else {
                                i = this.f2700u.mo3861g(C);
                            }
                            aVar.f2708c = i;
                        }
                        return true;
                    } else {
                        boolean z3 = this.f2703x;
                        aVar.f2709d = z3;
                        if (z3) {
                            aVar.f2708c = this.f2700u.mo3863i() - this.f2691B;
                        } else {
                            aVar.f2708c = this.f2700u.mo3867m() + this.f2691B;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: J2 */
    private void m2893J2(C0433v vVar, C0401a0 a0Var, C0395a aVar) {
        if (!m2892I2(a0Var, aVar) && !m2891H2(vVar, a0Var, aVar)) {
            aVar.mo3138a();
            aVar.f2707b = this.f2704y ? a0Var.mo3331b() - 1 : 0;
        }
    }

    /* renamed from: K2 */
    private void m2894K2(int i, int i2, boolean z, C0401a0 a0Var) {
        int i3;
        this.f2699t.f2727m = mo3100B2();
        this.f2699t.f2720f = i;
        int[] iArr = this.f2697H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo3109M1(a0Var, iArr);
        int max = Math.max(0, this.f2697H[0]);
        int max2 = Math.max(0, this.f2697H[1]);
        if (i == 1) {
            z2 = true;
        }
        C0397c cVar = this.f2699t;
        int i5 = z2 ? max2 : max;
        cVar.f2722h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f2723i = max;
        if (z2) {
            cVar.f2722h = i5 + this.f2700u.mo3864j();
            View o2 = m2912o2();
            C0397c cVar2 = this.f2699t;
            if (this.f2703x) {
                i4 = -1;
            }
            cVar2.f2719e = i4;
            int h0 = mo3533h0(o2);
            C0397c cVar3 = this.f2699t;
            cVar2.f2718d = h0 + cVar3.f2719e;
            cVar3.f2716b = this.f2700u.mo3858d(o2);
            i3 = this.f2700u.mo3858d(o2) - this.f2700u.mo3863i();
        } else {
            View p2 = m2913p2();
            this.f2699t.f2722h += this.f2700u.mo3867m();
            C0397c cVar4 = this.f2699t;
            if (!this.f2703x) {
                i4 = -1;
            }
            cVar4.f2719e = i4;
            int h02 = mo3533h0(p2);
            C0397c cVar5 = this.f2699t;
            cVar4.f2718d = h02 + cVar5.f2719e;
            cVar5.f2716b = this.f2700u.mo3861g(p2);
            i3 = (-this.f2700u.mo3861g(p2)) + this.f2700u.mo3867m();
        }
        C0397c cVar6 = this.f2699t;
        cVar6.f2717c = i2;
        if (z) {
            cVar6.f2717c = i2 - i3;
        }
        cVar6.f2721g = i3;
    }

    /* renamed from: L2 */
    private void m2895L2(int i, int i2) {
        this.f2699t.f2717c = this.f2700u.mo3863i() - i2;
        C0397c cVar = this.f2699t;
        cVar.f2719e = this.f2703x ? -1 : 1;
        cVar.f2718d = i;
        cVar.f2720f = 1;
        cVar.f2716b = i2;
        cVar.f2721g = Integer.MIN_VALUE;
    }

    /* renamed from: M2 */
    private void m2896M2(C0395a aVar) {
        m2895L2(aVar.f2707b, aVar.f2708c);
    }

    /* renamed from: N2 */
    private void m2897N2(int i, int i2) {
        this.f2699t.f2717c = i2 - this.f2700u.mo3867m();
        C0397c cVar = this.f2699t;
        cVar.f2718d = i;
        cVar.f2719e = this.f2703x ? 1 : -1;
        cVar.f2720f = -1;
        cVar.f2716b = i2;
        cVar.f2721g = Integer.MIN_VALUE;
    }

    /* renamed from: O1 */
    private int m2898O1(C0401a0 a0Var) {
        if (mo3493J() == 0) {
            return 0;
        }
        mo3112T1();
        OrientationHelper jVar = this.f2700u;
        View Z1 = mo3116Z1(!this.f2705z, true);
        return ScrollbarHelper.m3907a(a0Var, jVar, Z1, mo3115Y1(!this.f2705z, true), this, this.f2705z);
    }

    /* renamed from: O2 */
    private void m2899O2(C0395a aVar) {
        m2897N2(aVar.f2707b, aVar.f2708c);
    }

    /* renamed from: P1 */
    private int m2900P1(C0401a0 a0Var) {
        if (mo3493J() == 0) {
            return 0;
        }
        mo3112T1();
        OrientationHelper jVar = this.f2700u;
        View Z1 = mo3116Z1(!this.f2705z, true);
        return ScrollbarHelper.m3908b(a0Var, jVar, Z1, mo3115Y1(!this.f2705z, true), this, this.f2705z, this.f2703x);
    }

    /* renamed from: Q1 */
    private int m2901Q1(C0401a0 a0Var) {
        if (mo3493J() == 0) {
            return 0;
        }
        mo3112T1();
        OrientationHelper jVar = this.f2700u;
        View Z1 = mo3116Z1(!this.f2705z, true);
        return ScrollbarHelper.m3909c(a0Var, jVar, Z1, mo3115Y1(!this.f2705z, true), this, this.f2705z);
    }

    /* renamed from: W1 */
    private View m2902W1() {
        return mo3123f2(0, mo3493J());
    }

    /* renamed from: X1 */
    private View m2903X1(C0433v vVar, C0401a0 a0Var) {
        return mo3080j2(vVar, a0Var, 0, mo3493J(), a0Var.mo3331b());
    }

    /* renamed from: c2 */
    private View m2904c2() {
        return mo3123f2(mo3493J() - 1, -1);
    }

    /* renamed from: d2 */
    private View m2905d2(C0433v vVar, C0401a0 a0Var) {
        return mo3080j2(vVar, a0Var, mo3493J() - 1, -1, a0Var.mo3331b());
    }

    /* renamed from: h2 */
    private View m2906h2() {
        if (this.f2703x) {
            return m2902W1();
        }
        return m2904c2();
    }

    /* renamed from: i2 */
    private View m2907i2() {
        if (this.f2703x) {
            return m2904c2();
        }
        return m2902W1();
    }

    /* renamed from: k2 */
    private View m2908k2(C0433v vVar, C0401a0 a0Var) {
        if (this.f2703x) {
            return m2903X1(vVar, a0Var);
        }
        return m2905d2(vVar, a0Var);
    }

    /* renamed from: l2 */
    private View m2909l2(C0433v vVar, C0401a0 a0Var) {
        if (this.f2703x) {
            return m2905d2(vVar, a0Var);
        }
        return m2903X1(vVar, a0Var);
    }

    /* renamed from: m2 */
    private int m2910m2(int i, C0433v vVar, C0401a0 a0Var, boolean z) {
        int i2 = this.f2700u.mo3863i() - i;
        if (i2 <= 0) {
            return 0;
        }
        int i3 = -mo3102D2(-i2, vVar, a0Var);
        int i4 = i + i3;
        if (z) {
            int i5 = this.f2700u.mo3863i() - i4;
            if (i5 > 0) {
                this.f2700u.mo3872r(i5);
                return i5 + i3;
            }
        }
        return i3;
    }

    /* renamed from: n2 */
    private int m2911n2(int i, C0433v vVar, C0401a0 a0Var, boolean z) {
        int m = i - this.f2700u.mo3867m();
        if (m <= 0) {
            return 0;
        }
        int i2 = -mo3102D2(m, vVar, a0Var);
        int i3 = i + i2;
        if (z) {
            int m2 = i3 - this.f2700u.mo3867m();
            if (m2 > 0) {
                this.f2700u.mo3872r(-m2);
                i2 -= m2;
            }
        }
        return i2;
    }

    /* renamed from: o2 */
    private View m2912o2() {
        return mo3492I(this.f2703x ? 0 : mo3493J() - 1);
    }

    /* renamed from: p2 */
    private View m2913p2() {
        return mo3492I(this.f2703x ? mo3493J() - 1 : 0);
    }

    /* renamed from: v2 */
    private void m2914v2(C0433v vVar, C0401a0 a0Var, int i, int i2) {
        C0433v vVar2 = vVar;
        C0401a0 a0Var2 = a0Var;
        if (a0Var.mo3336g() && mo3493J() != 0 && !a0Var.mo3334e() && mo3066L1()) {
            List<C0407d0> k = vVar.mo3617k();
            int size = k.size();
            int h0 = mo3533h0(mo3492I(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0407d0 d0Var = (C0407d0) k.get(i5);
                if (!d0Var.mo3382v()) {
                    char c = 1;
                    if ((d0Var.mo3372m() < h0) != this.f2703x) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.f2700u.mo3859e(d0Var.f2841b);
                    } else {
                        i4 += this.f2700u.mo3859e(d0Var.f2841b);
                    }
                }
            }
            this.f2699t.f2726l = k;
            if (i3 > 0) {
                m2897N2(mo3533h0(m2913p2()), i);
                C0397c cVar = this.f2699t;
                cVar.f2722h = i3;
                cVar.f2717c = 0;
                cVar.mo3145a();
                mo3113U1(vVar2, this.f2699t, a0Var2, false);
            }
            if (i4 > 0) {
                m2895L2(mo3533h0(m2912o2()), i2);
                C0397c cVar2 = this.f2699t;
                cVar2.f2722h = i4;
                cVar2.f2717c = 0;
                cVar2.mo3145a();
                mo3113U1(vVar2, this.f2699t, a0Var2, false);
            }
            this.f2699t.f2726l = null;
        }
    }

    /* renamed from: x2 */
    private void m2915x2(C0433v vVar, C0397c cVar) {
        if (cVar.f2715a && !cVar.f2727m) {
            int i = cVar.f2721g;
            int i2 = cVar.f2723i;
            if (cVar.f2720f == -1) {
                m2917z2(vVar, i, i2);
            } else {
                m2889A2(vVar, i, i2);
            }
        }
    }

    /* renamed from: y2 */
    private void m2916y2(C0433v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo3546n1(i3, vVar);
                }
            } else {
                while (i > i2) {
                    mo3546n1(i, vVar);
                    i--;
                }
            }
        }
    }

    /* renamed from: z2 */
    private void m2917z2(C0433v vVar, int i, int i2) {
        int J = mo3493J();
        if (i >= 0) {
            int h = (this.f2700u.mo3862h() - i) + i2;
            if (this.f2703x) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I = mo3492I(i3);
                    if (this.f2700u.mo3861g(I) < h || this.f2700u.mo3871q(I) < h) {
                        m2916y2(vVar, 0, i3);
                        return;
                    }
                }
            } else {
                int i4 = J - 1;
                int i5 = i4;
                while (true) {
                    if (i5 < 0) {
                        break;
                    }
                    View I2 = mo3492I(i5);
                    if (this.f2700u.mo3861g(I2) < h || this.f2700u.mo3871q(I2) < h) {
                        m2916y2(vVar, i4, i5);
                    } else {
                        i5--;
                    }
                }
                m2916y2(vVar, i4, i5);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B2 */
    public boolean mo3100B2() {
        return this.f2700u.mo3865k() == 0 && this.f2700u.mo3862h() == 0;
    }

    /* renamed from: C */
    public View mo3101C(int i) {
        int J = mo3493J();
        if (J == 0) {
            return null;
        }
        int h0 = i - mo3533h0(mo3492I(0));
        if (h0 >= 0 && h0 < J) {
            View I = mo3492I(h0);
            if (mo3533h0(I) == i) {
                return I;
            }
        }
        return super.mo3101C(i);
    }

    /* renamed from: D */
    public C0426p mo3061D() {
        return new C0426p(-2, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D2 */
    public int mo3102D2(int i, C0433v vVar, C0401a0 a0Var) {
        if (mo3493J() == 0 || i == 0) {
            return 0;
        }
        mo3112T1();
        this.f2699t.f2715a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m2894K2(i2, abs, true, a0Var);
        C0397c cVar = this.f2699t;
        int U1 = cVar.f2721g + mo3113U1(vVar, cVar, a0Var, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i = i2 * U1;
        }
        this.f2700u.mo3872r(-i);
        this.f2699t.f2725k = i;
        return i;
    }

    /* renamed from: E2 */
    public void mo3103E2(int i) {
        if (i == 0 || i == 1) {
            mo3124g(null);
            if (i != this.f2698s || this.f2700u == null) {
                OrientationHelper b = OrientationHelper.m3831b(this, i);
                this.f2700u = b;
                this.f2694E.f2706a = b;
                this.f2698s = i;
                mo3556t1();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: F2 */
    public void mo3104F2(boolean z) {
        mo3124g(null);
        if (z != this.f2702w) {
            this.f2702w = z;
            mo3556t1();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G1 */
    public boolean mo3105G1() {
        return (mo3512X() == 1073741824 || mo3549p0() == 1073741824 || !mo3551q0()) ? false : true;
    }

    /* renamed from: G2 */
    public void mo3064G2(boolean z) {
        mo3124g(null);
        if (this.f2704y != z) {
            this.f2704y = z;
            mo3556t1();
        }
    }

    /* renamed from: I0 */
    public void mo3106I0(RecyclerView recyclerView, C0433v vVar) {
        super.mo3106I0(recyclerView, vVar);
        if (this.f2692C) {
            mo3540k1(vVar);
            vVar.mo3609c();
        }
    }

    /* renamed from: I1 */
    public void mo3107I1(RecyclerView recyclerView, C0401a0 a0Var, int i) {
        LinearSmoothScroller hVar = new LinearSmoothScroller(recyclerView.getContext());
        hVar.mo3655p(i);
        mo3494J1(hVar);
    }

    /* renamed from: J0 */
    public View mo3065J0(View view, int i, C0433v vVar, C0401a0 a0Var) {
        View view2;
        View view3;
        m2890C2();
        if (mo3493J() == 0) {
            return null;
        }
        int R1 = mo3110R1(i);
        if (R1 == Integer.MIN_VALUE) {
            return null;
        }
        mo3112T1();
        m2894K2(R1, (int) (((float) this.f2700u.mo3868n()) * 0.33333334f), false, a0Var);
        C0397c cVar = this.f2699t;
        cVar.f2721g = Integer.MIN_VALUE;
        cVar.f2715a = false;
        mo3113U1(vVar, cVar, a0Var, true);
        if (R1 == -1) {
            view2 = m2907i2();
        } else {
            view2 = m2906h2();
        }
        if (R1 == -1) {
            view3 = m2913p2();
        } else {
            view3 = m2912o2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: K0 */
    public void mo3108K0(AccessibilityEvent accessibilityEvent) {
        super.mo3108K0(accessibilityEvent);
        if (mo3493J() > 0) {
            accessibilityEvent.setFromIndex(mo3118a2());
            accessibilityEvent.setToIndex(mo3122e2());
        }
    }

    /* renamed from: L1 */
    public boolean mo3066L1() {
        return this.f2693D == null && this.f2701v == this.f2704y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public void mo3109M1(C0401a0 a0Var, int[] iArr) {
        int i;
        int q2 = mo3131q2(a0Var);
        if (this.f2699t.f2720f == -1) {
            i = 0;
        } else {
            i = q2;
            q2 = 0;
        }
        iArr[0] = q2;
        iArr[1] = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N1 */
    public void mo3068N1(C0401a0 a0Var, C0397c cVar, C0424c cVar2) {
        int i = cVar.f2718d;
        if (i >= 0 && i < a0Var.mo3331b()) {
            cVar2.mo3572a(i, Math.max(0, cVar.f2721g));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R1 */
    public int mo3110R1(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f2698s != 1 && mo3134s2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2698s != 1 && mo3134s2()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f2698s != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f2698s != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f2698s != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.f2698s != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S1 */
    public C0397c mo3111S1() {
        return new C0397c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T1 */
    public void mo3112T1() {
        if (this.f2699t == null) {
            this.f2699t = mo3111S1();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U1 */
    public int mo3113U1(C0433v vVar, C0397c cVar, C0401a0 a0Var, boolean z) {
        int i = cVar.f2717c;
        int i2 = cVar.f2721g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f2721g = i2 + i;
            }
            m2915x2(vVar, cVar);
        }
        int i3 = cVar.f2717c + cVar.f2722h;
        C0396b bVar = this.f2695F;
        while (true) {
            if ((!cVar.f2727m && i3 <= 0) || !cVar.mo3147c(a0Var)) {
                break;
            }
            bVar.mo3144a();
            mo3086u2(vVar, a0Var, cVar, bVar);
            if (!bVar.f2712b) {
                cVar.f2716b += bVar.f2711a * cVar.f2720f;
                if (!bVar.f2713c || cVar.f2726l != null || !a0Var.mo3334e()) {
                    int i4 = cVar.f2717c;
                    int i5 = bVar.f2711a;
                    cVar.f2717c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f2721g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f2711a;
                    cVar.f2721g = i7;
                    int i8 = cVar.f2717c;
                    if (i8 < 0) {
                        cVar.f2721g = i7 + i8;
                    }
                    m2915x2(vVar, cVar);
                }
                if (z && bVar.f2714d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2717c;
    }

    /* renamed from: V1 */
    public int mo3114V1() {
        View g2 = mo3125g2(0, mo3493J(), true, false);
        if (g2 == null) {
            return -1;
        }
        return mo3533h0(g2);
    }

    /* renamed from: X0 */
    public void mo3075X0(C0433v vVar, C0401a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = -1;
        if (!(this.f2693D == null && this.f2690A == -1) && a0Var.mo3331b() == 0) {
            mo3540k1(vVar);
            return;
        }
        C0398d dVar = this.f2693D;
        if (dVar != null && dVar.mo3151l()) {
            this.f2690A = this.f2693D.f2728a;
        }
        mo3112T1();
        this.f2699t.f2715a = false;
        m2890C2();
        View V = mo3509V();
        C0395a aVar = this.f2694E;
        if (!aVar.f2710e || this.f2690A != -1 || this.f2693D != null) {
            aVar.mo3142e();
            C0395a aVar2 = this.f2694E;
            aVar2.f2709d = this.f2703x ^ this.f2704y;
            m2893J2(vVar, a0Var, aVar2);
            this.f2694E.f2710e = true;
        } else if (V != null && (this.f2700u.mo3861g(V) >= this.f2700u.mo3863i() || this.f2700u.mo3858d(V) <= this.f2700u.mo3867m())) {
            this.f2694E.mo3140c(V, mo3533h0(V));
        }
        C0397c cVar = this.f2699t;
        cVar.f2720f = cVar.f2725k >= 0 ? 1 : -1;
        int[] iArr = this.f2697H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3109M1(a0Var, iArr);
        int max = Math.max(0, this.f2697H[0]) + this.f2700u.mo3867m();
        int max2 = Math.max(0, this.f2697H[1]) + this.f2700u.mo3864j();
        if (a0Var.mo3334e()) {
            int i9 = this.f2690A;
            if (!(i9 == -1 || this.f2691B == Integer.MIN_VALUE)) {
                View C = mo3101C(i9);
                if (C != null) {
                    if (this.f2703x) {
                        i6 = this.f2700u.mo3863i() - this.f2700u.mo3858d(C);
                        i7 = this.f2691B;
                    } else {
                        i7 = this.f2700u.mo3861g(C) - this.f2700u.mo3867m();
                        i6 = this.f2691B;
                    }
                    int i10 = i6 - i7;
                    if (i10 > 0) {
                        max += i10;
                    } else {
                        max2 -= i10;
                    }
                }
            }
        }
        C0395a aVar3 = this.f2694E;
        if (!aVar3.f2709d ? !this.f2703x : this.f2703x) {
            i8 = 1;
        }
        mo3089w2(vVar, a0Var, aVar3, i8);
        mo3560w(vVar);
        this.f2699t.f2727m = mo3100B2();
        this.f2699t.f2724j = a0Var.mo3334e();
        this.f2699t.f2723i = 0;
        C0395a aVar4 = this.f2694E;
        if (aVar4.f2709d) {
            m2899O2(aVar4);
            C0397c cVar2 = this.f2699t;
            cVar2.f2722h = max;
            mo3113U1(vVar, cVar2, a0Var, false);
            C0397c cVar3 = this.f2699t;
            i2 = cVar3.f2716b;
            int i11 = cVar3.f2718d;
            int i12 = cVar3.f2717c;
            if (i12 > 0) {
                max2 += i12;
            }
            m2896M2(this.f2694E);
            C0397c cVar4 = this.f2699t;
            cVar4.f2722h = max2;
            cVar4.f2718d += cVar4.f2719e;
            mo3113U1(vVar, cVar4, a0Var, false);
            C0397c cVar5 = this.f2699t;
            i = cVar5.f2716b;
            int i13 = cVar5.f2717c;
            if (i13 > 0) {
                m2897N2(i11, i2);
                C0397c cVar6 = this.f2699t;
                cVar6.f2722h = i13;
                mo3113U1(vVar, cVar6, a0Var, false);
                i2 = this.f2699t.f2716b;
            }
        } else {
            m2896M2(aVar4);
            C0397c cVar7 = this.f2699t;
            cVar7.f2722h = max2;
            mo3113U1(vVar, cVar7, a0Var, false);
            C0397c cVar8 = this.f2699t;
            i = cVar8.f2716b;
            int i14 = cVar8.f2718d;
            int i15 = cVar8.f2717c;
            if (i15 > 0) {
                max += i15;
            }
            m2899O2(this.f2694E);
            C0397c cVar9 = this.f2699t;
            cVar9.f2722h = max;
            cVar9.f2718d += cVar9.f2719e;
            mo3113U1(vVar, cVar9, a0Var, false);
            C0397c cVar10 = this.f2699t;
            i2 = cVar10.f2716b;
            int i16 = cVar10.f2717c;
            if (i16 > 0) {
                m2895L2(i14, i);
                C0397c cVar11 = this.f2699t;
                cVar11.f2722h = i16;
                mo3113U1(vVar, cVar11, a0Var, false);
                i = this.f2699t.f2716b;
            }
        }
        if (mo3493J() > 0) {
            if (this.f2703x ^ this.f2704y) {
                int m2 = m2910m2(i, vVar, a0Var, true);
                i4 = i2 + m2;
                i3 = i + m2;
                i5 = m2911n2(i4, vVar, a0Var, false);
            } else {
                int n2 = m2911n2(i2, vVar, a0Var, true);
                i4 = i2 + n2;
                i3 = i + n2;
                i5 = m2910m2(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m2914v2(vVar, a0Var, i2, i);
        if (!a0Var.mo3334e()) {
            this.f2700u.mo3873s();
        } else {
            this.f2694E.mo3142e();
        }
        this.f2701v = this.f2704y;
    }

    /* renamed from: Y0 */
    public void mo3076Y0(C0401a0 a0Var) {
        super.mo3076Y0(a0Var);
        this.f2693D = null;
        this.f2690A = -1;
        this.f2691B = Integer.MIN_VALUE;
        this.f2694E.mo3142e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y1 */
    public View mo3115Y1(boolean z, boolean z2) {
        if (this.f2703x) {
            return mo3125g2(0, mo3493J(), z, z2);
        }
        return mo3125g2(mo3493J() - 1, -1, z, z2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z1 */
    public View mo3116Z1(boolean z, boolean z2) {
        if (this.f2703x) {
            return mo3125g2(mo3493J() - 1, -1, z, z2);
        }
        return mo3125g2(0, mo3493J(), z, z2);
    }

    /* renamed from: a */
    public PointF mo3117a(int i) {
        if (mo3493J() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo3533h0(mo3492I(0))) {
            z = true;
        }
        if (z != this.f2703x) {
            i2 = -1;
        }
        if (this.f2698s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: a2 */
    public int mo3118a2() {
        View g2 = mo3125g2(0, mo3493J(), false, true);
        if (g2 == null) {
            return -1;
        }
        return mo3533h0(g2);
    }

    /* renamed from: b2 */
    public int mo3119b2() {
        View g2 = mo3125g2(mo3493J() - 1, -1, true, false);
        if (g2 == null) {
            return -1;
        }
        return mo3533h0(g2);
    }

    /* renamed from: c1 */
    public void mo3120c1(Parcelable parcelable) {
        if (parcelable instanceof C0398d) {
            this.f2693D = (C0398d) parcelable;
            mo3556t1();
        }
    }

    /* renamed from: d1 */
    public Parcelable mo3121d1() {
        if (this.f2693D != null) {
            return new C0398d(this.f2693D);
        }
        C0398d dVar = new C0398d();
        if (mo3493J() > 0) {
            mo3112T1();
            boolean z = this.f2701v ^ this.f2703x;
            dVar.f2730c = z;
            if (z) {
                View o2 = m2912o2();
                dVar.f2729b = this.f2700u.mo3863i() - this.f2700u.mo3858d(o2);
                dVar.f2728a = mo3533h0(o2);
            } else {
                View p2 = m2913p2();
                dVar.f2728a = mo3533h0(p2);
                dVar.f2729b = this.f2700u.mo3861g(p2) - this.f2700u.mo3867m();
            }
        } else {
            dVar.mo3152m();
        }
        return dVar;
    }

    /* renamed from: e2 */
    public int mo3122e2() {
        View g2 = mo3125g2(mo3493J() - 1, -1, false, true);
        if (g2 == null) {
            return -1;
        }
        return mo3533h0(g2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f2 */
    public View mo3123f2(int i, int i2) {
        int i3;
        int i4;
        View view;
        mo3112T1();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return mo3492I(i);
        }
        if (this.f2700u.mo3861g(mo3492I(i)) < this.f2700u.mo3867m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = C3149a.f17185a;
        }
        if (this.f2698s == 0) {
            view = this.f2878e.mo3907a(i, i2, i4, i3);
        } else {
            view = this.f2879f.mo3907a(i, i2, i4, i3);
        }
        return view;
    }

    /* renamed from: g */
    public void mo3124g(String str) {
        if (this.f2693D == null) {
            super.mo3124g(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g2 */
    public View mo3125g2(int i, int i2, boolean z, boolean z2) {
        mo3112T1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f2698s == 0) {
            return this.f2878e.mo3907a(i, i2, i4, i3);
        }
        return this.f2879f.mo3907a(i, i2, i4, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j2 */
    public View mo3080j2(C0433v vVar, C0401a0 a0Var, int i, int i2, int i3) {
        mo3112T1();
        int m = this.f2700u.mo3867m();
        int i4 = this.f2700u.mo3863i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = mo3492I(i);
            int h0 = mo3533h0(I);
            if (h0 >= 0 && h0 < i3) {
                if (((C0426p) I.getLayoutParams()).mo3575c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f2700u.mo3861g(I) < i4 && this.f2700u.mo3858d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i5;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: k */
    public boolean mo3126k() {
        return this.f2698s == 0;
    }

    /* renamed from: l */
    public boolean mo3127l() {
        return this.f2698s == 1;
    }

    /* renamed from: o */
    public void mo3128o(int i, int i2, C0401a0 a0Var, C0424c cVar) {
        if (this.f2698s != 0) {
            i = i2;
        }
        if (mo3493J() != 0 && i != 0) {
            mo3112T1();
            m2894K2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo3068N1(a0Var, this.f2699t, cVar);
        }
    }

    /* renamed from: p */
    public void mo3129p(int i, C0424c cVar) {
        boolean z;
        int i2;
        C0398d dVar = this.f2693D;
        int i3 = -1;
        if (dVar == null || !dVar.mo3151l()) {
            m2890C2();
            z = this.f2703x;
            i2 = this.f2690A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0398d dVar2 = this.f2693D;
            z = dVar2.f2730c;
            i2 = dVar2.f2728a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f2696G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo3572a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: q */
    public int mo3130q(C0401a0 a0Var) {
        return m2898O1(a0Var);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: q2 */
    public int mo3131q2(C0401a0 a0Var) {
        if (a0Var.mo3333d()) {
            return this.f2700u.mo3868n();
        }
        return 0;
    }

    /* renamed from: r */
    public int mo3083r(C0401a0 a0Var) {
        return m2900P1(a0Var);
    }

    /* renamed from: r2 */
    public int mo3132r2() {
        return this.f2698s;
    }

    /* renamed from: s */
    public int mo3084s(C0401a0 a0Var) {
        return m2901Q1(a0Var);
    }

    /* renamed from: s0 */
    public boolean mo3133s0() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public boolean mo3134s2() {
        return mo3514Z() == 1;
    }

    /* renamed from: t */
    public int mo3135t(C0401a0 a0Var) {
        return m2898O1(a0Var);
    }

    /* renamed from: t2 */
    public boolean mo3136t2() {
        return this.f2705z;
    }

    /* renamed from: u */
    public int mo3085u(C0401a0 a0Var) {
        return m2900P1(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u2 */
    public void mo3086u2(C0433v vVar, C0401a0 a0Var, C0397c cVar, C0396b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo3148d(vVar);
        if (d == null) {
            bVar.f2712b = true;
            return;
        }
        C0426p pVar = (C0426p) d.getLayoutParams();
        if (cVar.f2726l == null) {
            if (this.f2703x == (cVar.f2720f == -1)) {
                mo3523d(d);
            } else {
                mo3525e(d, 0);
            }
        } else {
            if (this.f2703x == (cVar.f2720f == -1)) {
                mo3518b(d);
            } else {
                mo3521c(d, 0);
            }
        }
        mo3475A0(d, 0, 0);
        bVar.f2711a = this.f2700u.mo3859e(d);
        if (this.f2698s == 1) {
            if (mo3134s2()) {
                i5 = mo3547o0() - mo3528f0();
                i4 = i5 - this.f2700u.mo3860f(d);
            } else {
                i4 = mo3526e0();
                i5 = this.f2700u.mo3860f(d) + i4;
            }
            if (cVar.f2720f == -1) {
                int i6 = cVar.f2716b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f2711a;
            } else {
                int i7 = cVar.f2716b;
                i3 = i7;
                i2 = i5;
                i = bVar.f2711a + i7;
            }
        } else {
            int g0 = mo3530g0();
            int f = this.f2700u.mo3860f(d) + g0;
            if (cVar.f2720f == -1) {
                int i8 = cVar.f2716b;
                i2 = i8;
                i3 = g0;
                i = f;
                i4 = i8 - bVar.f2711a;
            } else {
                int i9 = cVar.f2716b;
                i3 = g0;
                i2 = bVar.f2711a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo3565z0(d, i4, i3, i2, i);
        if (pVar.mo3575c() || pVar.mo3574b()) {
            bVar.f2713c = true;
        }
        bVar.f2714d = d.hasFocusable();
    }

    /* renamed from: v */
    public int mo3087v(C0401a0 a0Var) {
        return m2901Q1(a0Var);
    }

    /* renamed from: w1 */
    public int mo3088w1(int i, C0433v vVar, C0401a0 a0Var) {
        if (this.f2698s == 1) {
            return 0;
        }
        return mo3102D2(i, vVar, a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w2 */
    public void mo3089w2(C0433v vVar, C0401a0 a0Var, C0395a aVar, int i) {
    }

    /* renamed from: x1 */
    public void mo3137x1(int i) {
        this.f2690A = i;
        this.f2691B = Integer.MIN_VALUE;
        C0398d dVar = this.f2693D;
        if (dVar != null) {
            dVar.mo3152m();
        }
        mo3556t1();
    }

    /* renamed from: y1 */
    public int mo3090y1(int i, C0433v vVar, C0401a0 a0Var) {
        if (this.f2698s == 0) {
            return 0;
        }
        return mo3102D2(i, vVar, a0Var);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f2698s = 1;
        this.f2702w = false;
        this.f2703x = false;
        this.f2704y = false;
        this.f2705z = true;
        this.f2690A = -1;
        this.f2691B = Integer.MIN_VALUE;
        this.f2693D = null;
        this.f2694E = new C0395a();
        this.f2695F = new C0396b();
        this.f2696G = 2;
        this.f2697H = new int[2];
        mo3103E2(i);
        mo3104F2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2698s = 1;
        this.f2702w = false;
        this.f2703x = false;
        this.f2704y = false;
        this.f2705z = true;
        this.f2690A = -1;
        this.f2691B = Integer.MIN_VALUE;
        this.f2693D = null;
        this.f2694E = new C0395a();
        this.f2695F = new C0396b();
        this.f2696G = 2;
        this.f2697H = new int[2];
        C0425d i0 = C0421o.m3264i0(context, attributeSet, i, i2);
        mo3103E2(i0.f2894a);
        mo3104F2(i0.f2896c);
        mo3064G2(i0.f2897d);
    }
}
