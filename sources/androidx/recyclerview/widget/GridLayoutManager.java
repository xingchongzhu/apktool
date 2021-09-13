package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0421o.C0424c;
import androidx.recyclerview.widget.RecyclerView.C0426p;
import androidx.recyclerview.widget.RecyclerView.C0433v;
import java.util.Arrays;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0636c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f2675I = false;

    /* renamed from: J */
    int f2676J = -1;

    /* renamed from: K */
    int[] f2677K;

    /* renamed from: L */
    View[] f2678L;

    /* renamed from: M */
    final SparseIntArray f2679M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f2680N = new SparseIntArray();

    /* renamed from: O */
    C0394c f2681O = new C0392a();

    /* renamed from: P */
    final Rect f2682P = new Rect();

    /* renamed from: Q */
    private boolean f2683Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0392a extends C0394c {
        /* renamed from: e */
        public int mo3091e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo3092f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0393b extends C0426p {

        /* renamed from: e */
        int f2684e = -1;

        /* renamed from: f */
        int f2685f = 0;

        public C0393b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public int mo3093e() {
            return this.f2684e;
        }

        /* renamed from: f */
        public int mo3094f() {
            return this.f2685f;
        }

        public C0393b(int i, int i2) {
            super(i, i2);
        }

        public C0393b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0393b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0394c {

        /* renamed from: a */
        final SparseIntArray f2686a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f2687b = new SparseIntArray();

        /* renamed from: c */
        private boolean f2688c = false;

        /* renamed from: d */
        private boolean f2689d = false;

        /* renamed from: a */
        static int m2881a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3095b(int i, int i2) {
            if (!this.f2689d) {
                return mo3097d(i, i2);
            }
            int i3 = this.f2687b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo3097d(i, i2);
            this.f2687b.put(i, d);
            return d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo3096c(int i, int i2) {
            if (!this.f2688c) {
                return mo3091e(i, i2);
            }
            int i3 = this.f2686a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo3091e(i, i2);
            this.f2686a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3097d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f2689d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f2687b
                int r0 = m2881a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f2687b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo3096c(r0, r8)
                int r0 = r6.mo3092f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo3092f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo3092f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C0394c.mo3097d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo3091e(int i, int i2);

        /* renamed from: f */
        public abstract int mo3092f(int i);

        /* renamed from: g */
        public void mo3098g() {
            this.f2687b.clear();
        }

        /* renamed from: h */
        public void mo3099h() {
            this.f2686a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3079g3(C0421o.m3264i0(context, attributeSet, i, i2).f2895b);
    }

    /* renamed from: P2 */
    private void m2830P2(C0433v vVar, C0401a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f2678L[i3];
            C0393b bVar = (C0393b) view.getLayoutParams();
            int c3 = m2841c3(vVar, a0Var, mo3533h0(view));
            bVar.f2685f = c3;
            bVar.f2684e = i4;
            i4 += c3;
            i3 += i2;
        }
    }

    /* renamed from: Q2 */
    private void m2831Q2() {
        int J = mo3493J();
        for (int i = 0; i < J; i++) {
            C0393b bVar = (C0393b) mo3492I(i).getLayoutParams();
            int a = bVar.mo3573a();
            this.f2679M.put(a, bVar.mo3094f());
            this.f2680N.put(a, bVar.mo3093e());
        }
    }

    /* renamed from: R2 */
    private void m2832R2(int i) {
        this.f2677K = m2833S2(this.f2677K, this.f2676J, i);
    }

    /* renamed from: S2 */
    static int[] m2833S2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: T2 */
    private void m2834T2() {
        this.f2679M.clear();
        this.f2680N.clear();
    }

    /* renamed from: U2 */
    private int m2835U2(C0401a0 a0Var) {
        int i;
        if (!(mo3493J() == 0 || a0Var.mo3331b() == 0)) {
            mo3112T1();
            boolean t2 = mo3136t2();
            View Z1 = mo3116Z1(!t2, true);
            View Y1 = mo3115Y1(!t2, true);
            if (!(Z1 == null || Y1 == null)) {
                int b = this.f2681O.mo3095b(mo3533h0(Z1), this.f2676J);
                int b2 = this.f2681O.mo3095b(mo3533h0(Y1), this.f2676J);
                int min = Math.min(b, b2);
                int max = Math.max(b, b2);
                int b3 = this.f2681O.mo3095b(a0Var.mo3331b() - 1, this.f2676J) + 1;
                if (this.f2703x) {
                    i = Math.max(0, (b3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!t2) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f2700u.mo3858d(Y1) - this.f2700u.mo3861g(Z1))) / ((float) ((this.f2681O.mo3095b(mo3533h0(Y1), this.f2676J) - this.f2681O.mo3095b(mo3533h0(Z1), this.f2676J)) + 1)))) + ((float) (this.f2700u.mo3867m() - this.f2700u.mo3861g(Z1))));
            }
        }
        return 0;
    }

    /* renamed from: V2 */
    private int m2836V2(C0401a0 a0Var) {
        if (!(mo3493J() == 0 || a0Var.mo3331b() == 0)) {
            mo3112T1();
            View Z1 = mo3116Z1(!mo3136t2(), true);
            View Y1 = mo3115Y1(!mo3136t2(), true);
            if (!(Z1 == null || Y1 == null)) {
                if (!mo3136t2()) {
                    return this.f2681O.mo3095b(a0Var.mo3331b() - 1, this.f2676J) + 1;
                }
                int d = this.f2700u.mo3858d(Y1) - this.f2700u.mo3861g(Z1);
                int b = this.f2681O.mo3095b(mo3533h0(Z1), this.f2676J);
                return (int) ((((float) d) / ((float) ((this.f2681O.mo3095b(mo3533h0(Y1), this.f2676J) - b) + 1))) * ((float) (this.f2681O.mo3095b(a0Var.mo3331b() - 1, this.f2676J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: W2 */
    private void m2837W2(C0433v vVar, C0401a0 a0Var, C0395a aVar, int i) {
        boolean z = i == 1;
        int b3 = m2840b3(vVar, a0Var, aVar.f2707b);
        if (z) {
            while (b3 > 0) {
                int i2 = aVar.f2707b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f2707b = i3;
                    b3 = m2840b3(vVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = a0Var.mo3331b() - 1;
        int i4 = aVar.f2707b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int b32 = m2840b3(vVar, a0Var, i5);
            if (b32 <= b3) {
                break;
            }
            i4 = i5;
            b3 = b32;
        }
        aVar.f2707b = i4;
    }

    /* renamed from: X2 */
    private void m2838X2() {
        View[] viewArr = this.f2678L;
        if (viewArr == null || viewArr.length != this.f2676J) {
            this.f2678L = new View[this.f2676J];
        }
    }

    /* renamed from: a3 */
    private int m2839a3(C0433v vVar, C0401a0 a0Var, int i) {
        if (!a0Var.mo3334e()) {
            return this.f2681O.mo3095b(i, this.f2676J);
        }
        int f = vVar.mo3612f(i);
        if (f != -1) {
            return this.f2681O.mo3095b(f, this.f2676J);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: b3 */
    private int m2840b3(C0433v vVar, C0401a0 a0Var, int i) {
        if (!a0Var.mo3334e()) {
            return this.f2681O.mo3096c(i, this.f2676J);
        }
        int i2 = this.f2680N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo3612f(i);
        if (f != -1) {
            return this.f2681O.mo3096c(f, this.f2676J);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: c3 */
    private int m2841c3(C0433v vVar, C0401a0 a0Var, int i) {
        if (!a0Var.mo3334e()) {
            return this.f2681O.mo3092f(i);
        }
        int i2 = this.f2679M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo3612f(i);
        if (f != -1) {
            return this.f2681O.mo3092f(f);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    /* renamed from: d3 */
    private void m2842d3(float f, int i) {
        m2832R2(Math.max(Math.round(f * ((float) this.f2676J)), i));
    }

    /* renamed from: e3 */
    private void m2843e3(View view, int i, boolean z) {
        int i2;
        int i3;
        C0393b bVar = (C0393b) view.getLayoutParams();
        Rect rect = bVar.f2899b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int Y2 = mo3077Y2(bVar.f2684e, bVar.f2685f);
        if (this.f2698s == 1) {
            i2 = C0421o.m3261K(Y2, i, i5, bVar.width, false);
            i3 = C0421o.m3261K(this.f2700u.mo3868n(), mo3512X(), i4, bVar.height, true);
        } else {
            int K = C0421o.m3261K(Y2, i, i4, bVar.height, false);
            int K2 = C0421o.m3261K(this.f2700u.mo3868n(), mo3549p0(), i5, bVar.width, true);
            i3 = K;
            i2 = K2;
        }
        m2844f3(view, i2, i3, z);
    }

    /* renamed from: f3 */
    private void m2844f3(View view, int i, int i2, boolean z) {
        boolean z2;
        C0426p pVar = (C0426p) view.getLayoutParams();
        if (z) {
            z2 = mo3491H1(view, i, i2, pVar);
        } else {
            z2 = mo3486F1(view, i, i2, pVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: h3 */
    private void m2845h3() {
        int i;
        int i2;
        if (mo3132r2() == 1) {
            i2 = mo3547o0() - mo3528f0();
            i = mo3526e0();
        } else {
            i2 = mo3511W() - mo3524d0();
            i = mo3530g0();
        }
        m2832R2(i2 - i);
    }

    /* renamed from: C1 */
    public void mo3060C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2677K == null) {
            super.mo3060C1(rect, i, i2);
        }
        int e0 = mo3526e0() + mo3528f0();
        int g0 = mo3530g0() + mo3524d0();
        if (this.f2698s == 1) {
            i4 = C0421o.m3265n(i2, rect.height() + g0, mo3519b0());
            int[] iArr = this.f2677K;
            i3 = C0421o.m3265n(i, iArr[iArr.length - 1] + e0, mo3522c0());
        } else {
            i3 = C0421o.m3265n(i, rect.width() + e0, mo3522c0());
            int[] iArr2 = this.f2677K;
            i4 = C0421o.m3265n(i2, iArr2[iArr2.length - 1] + g0, mo3519b0());
        }
        mo3479B1(i3, i4);
    }

    /* renamed from: D */
    public C0426p mo3061D() {
        if (this.f2698s == 0) {
            return new C0393b(-2, -1);
        }
        return new C0393b(-1, -2);
    }

    /* renamed from: E */
    public C0426p mo3062E(Context context, AttributeSet attributeSet) {
        return new C0393b(context, attributeSet);
    }

    /* renamed from: F */
    public C0426p mo3063F(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0393b((MarginLayoutParams) layoutParams);
        }
        return new C0393b(layoutParams);
    }

    /* renamed from: G2 */
    public void mo3064G2(boolean z) {
        if (!z) {
            super.mo3064G2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3065J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0433v r26, androidx.recyclerview.widget.RecyclerView.C0401a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo3477B(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0393b) r5
            int r6 = r5.f2684e
            int r5 = r5.f2685f
            int r5 = r5 + r6
            android.view.View r7 = super.mo3065J0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo3110R1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f2703x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo3493J()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo3493J()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f2698s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo3134s2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m2839a3(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m2839a3(r1, r2, r10)
            android.view.View r1 = r0.mo3492I(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C0393b) r9
            int r2 = r9.f2684e
            r18 = r3
            int r3 = r9.f2685f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo3563y0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f2684e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f2684e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3065J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    /* renamed from: L1 */
    public boolean mo3066L1() {
        return this.f2693D == null && !this.f2675I;
    }

    /* renamed from: N */
    public int mo3067N(C0433v vVar, C0401a0 a0Var) {
        if (this.f2698s == 1) {
            return this.f2676J;
        }
        if (a0Var.mo3331b() < 1) {
            return 0;
        }
        return m2839a3(vVar, a0Var, a0Var.mo3331b() - 1) + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N1 */
    public void mo3068N1(C0401a0 a0Var, C0397c cVar, C0424c cVar2) {
        int i = this.f2676J;
        for (int i2 = 0; i2 < this.f2676J && cVar.mo3147c(a0Var) && i > 0; i2++) {
            int i3 = cVar.f2718d;
            cVar2.mo3572a(i3, Math.max(0, cVar.f2721g));
            i -= this.f2681O.mo3092f(i3);
            cVar.f2718d += cVar.f2719e;
        }
    }

    /* renamed from: P0 */
    public void mo3069P0(C0433v vVar, C0401a0 a0Var, View view, AccessibilityNodeInfoCompat cVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0393b)) {
            super.mo3501O0(view, cVar);
            return;
        }
        C0393b bVar = (C0393b) layoutParams;
        int a3 = m2839a3(vVar, a0Var, bVar.mo3573a());
        if (this.f2698s == 0) {
            cVar.mo5055a0(C0636c.m5416a(bVar.mo3093e(), bVar.mo3094f(), a3, 1, false, false));
        } else {
            cVar.mo5055a0(C0636c.m5416a(a3, 1, bVar.mo3093e(), bVar.mo3094f(), false, false));
        }
    }

    /* renamed from: R0 */
    public void mo3070R0(RecyclerView recyclerView, int i, int i2) {
        this.f2681O.mo3099h();
        this.f2681O.mo3098g();
    }

    /* renamed from: S0 */
    public void mo3071S0(RecyclerView recyclerView) {
        this.f2681O.mo3099h();
        this.f2681O.mo3098g();
    }

    /* renamed from: T0 */
    public void mo3072T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f2681O.mo3099h();
        this.f2681O.mo3098g();
    }

    /* renamed from: U0 */
    public void mo3073U0(RecyclerView recyclerView, int i, int i2) {
        this.f2681O.mo3099h();
        this.f2681O.mo3098g();
    }

    /* renamed from: W0 */
    public void mo3074W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f2681O.mo3099h();
        this.f2681O.mo3098g();
    }

    /* renamed from: X0 */
    public void mo3075X0(C0433v vVar, C0401a0 a0Var) {
        if (a0Var.mo3334e()) {
            m2831Q2();
        }
        super.mo3075X0(vVar, a0Var);
        m2834T2();
    }

    /* renamed from: Y0 */
    public void mo3076Y0(C0401a0 a0Var) {
        super.mo3076Y0(a0Var);
        this.f2675I = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y2 */
    public int mo3077Y2(int i, int i2) {
        if (this.f2698s != 1 || !mo3134s2()) {
            int[] iArr = this.f2677K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2677K;
        int i3 = this.f2676J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: Z2 */
    public int mo3078Z2() {
        return this.f2676J;
    }

    /* renamed from: g3 */
    public void mo3079g3(int i) {
        if (i != this.f2676J) {
            this.f2675I = true;
            if (i >= 1) {
                this.f2676J = i;
                this.f2681O.mo3099h();
                mo3556t1();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
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
            if (h0 >= 0 && h0 < i3 && m2840b3(vVar, a0Var, h0) == 0) {
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

    /* renamed from: k0 */
    public int mo3081k0(C0433v vVar, C0401a0 a0Var) {
        if (this.f2698s == 0) {
            return this.f2676J;
        }
        if (a0Var.mo3331b() < 1) {
            return 0;
        }
        return m2839a3(vVar, a0Var, a0Var.mo3331b() - 1) + 1;
    }

    /* renamed from: m */
    public boolean mo3082m(C0426p pVar) {
        return pVar instanceof C0393b;
    }

    /* renamed from: r */
    public int mo3083r(C0401a0 a0Var) {
        if (this.f2683Q) {
            return m2835U2(a0Var);
        }
        return super.mo3083r(a0Var);
    }

    /* renamed from: s */
    public int mo3084s(C0401a0 a0Var) {
        if (this.f2683Q) {
            return m2836V2(a0Var);
        }
        return super.mo3084s(a0Var);
    }

    /* renamed from: u */
    public int mo3085u(C0401a0 a0Var) {
        if (this.f2683Q) {
            return m2835U2(a0Var);
        }
        return super.mo3085u(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u2 */
    public void mo3086u2(C0433v vVar, C0401a0 a0Var, C0397c cVar, C0396b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C0433v vVar2 = vVar;
        C0401a0 a0Var2 = a0Var;
        C0397c cVar2 = cVar;
        C0396b bVar2 = bVar;
        int l = this.f2700u.mo3866l();
        boolean z = false;
        boolean z2 = l != 1073741824;
        int i11 = mo3493J() > 0 ? this.f2677K[this.f2676J] : 0;
        if (z2) {
            m2845h3();
        }
        boolean z3 = cVar2.f2719e == 1;
        int i12 = this.f2676J;
        if (!z3) {
            i12 = m2840b3(vVar2, a0Var2, cVar2.f2718d) + m2841c3(vVar2, a0Var2, cVar2.f2718d);
        }
        int i13 = 0;
        while (i13 < this.f2676J && cVar2.mo3147c(a0Var2) && i12 > 0) {
            int i14 = cVar2.f2718d;
            int c3 = m2841c3(vVar2, a0Var2, i14);
            if (c3 <= this.f2676J) {
                i12 -= c3;
                if (i12 < 0) {
                    break;
                }
                View d = cVar2.mo3148d(vVar2);
                if (d == null) {
                    break;
                }
                this.f2678L[i13] = d;
                i13++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i14);
                sb.append(" requires ");
                sb.append(c3);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f2676J);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i13 == 0) {
            bVar2.f2712b = true;
            return;
        }
        float f = 0.0f;
        m2830P2(vVar2, a0Var2, i13, z3);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.f2678L[i15];
            if (cVar2.f2726l == null) {
                if (z3) {
                    mo3523d(view);
                } else {
                    mo3525e(view, z);
                }
            } else if (z3) {
                mo3518b(view);
            } else {
                mo3521c(view, z ? 1 : 0);
            }
            mo3537j(view, this.f2682P);
            m2843e3(view, l, z);
            int e = this.f2700u.mo3859e(view);
            if (e > i16) {
                i16 = e;
            }
            float f2 = (((float) this.f2700u.mo3860f(view)) * 1.0f) / ((float) ((C0393b) view.getLayoutParams()).f2685f);
            if (f2 > f) {
                f = f2;
            }
            i15++;
            z = false;
        }
        if (z2) {
            m2842d3(f, i11);
            i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                View view2 = this.f2678L[i17];
                m2843e3(view2, 1073741824, true);
                int e2 = this.f2700u.mo3859e(view2);
                if (e2 > i16) {
                    i16 = e2;
                }
            }
        }
        for (int i18 = 0; i18 < i13; i18++) {
            View view3 = this.f2678L[i18];
            if (this.f2700u.mo3859e(view3) != i16) {
                C0393b bVar3 = (C0393b) view3.getLayoutParams();
                Rect rect = bVar3.f2899b;
                int i19 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i20 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int Y2 = mo3077Y2(bVar3.f2684e, bVar3.f2685f);
                if (this.f2698s == 1) {
                    i10 = C0421o.m3261K(Y2, 1073741824, i20, bVar3.width, false);
                    i9 = MeasureSpec.makeMeasureSpec(i16 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    i9 = C0421o.m3261K(Y2, 1073741824, i19, bVar3.height, false);
                    i10 = makeMeasureSpec;
                }
                m2844f3(view3, i10, i9, true);
            }
        }
        int i21 = 0;
        bVar2.f2711a = i16;
        if (this.f2698s == 1) {
            if (cVar2.f2720f == -1) {
                i4 = cVar2.f2716b;
                i2 = i4 - i16;
            } else {
                int i22 = cVar2.f2716b;
                i2 = i22;
                i4 = i16 + i22;
            }
            i3 = 0;
            i = 0;
        } else if (cVar2.f2720f == -1) {
            int i23 = cVar2.f2716b;
            i = i23 - i16;
            i2 = 0;
            i3 = i23;
            i4 = 0;
        } else {
            int i24 = cVar2.f2716b;
            i3 = i16 + i24;
            i = i24;
            i4 = 0;
            i2 = 0;
        }
        while (i21 < i13) {
            View view4 = this.f2678L[i21];
            C0393b bVar4 = (C0393b) view4.getLayoutParams();
            if (this.f2698s != 1) {
                int g0 = mo3530g0() + this.f2677K[bVar4.f2684e];
                i6 = g0;
                i7 = i3;
                i8 = this.f2700u.mo3860f(view4) + g0;
            } else if (mo3134s2()) {
                int e0 = mo3526e0() + this.f2677K[this.f2676J - bVar4.f2684e];
                i = e0 - this.f2700u.mo3860f(view4);
                i8 = i4;
                i7 = e0;
                i6 = i2;
            } else {
                int e02 = mo3526e0() + this.f2677K[bVar4.f2684e];
                i8 = i4;
                i5 = e02;
                i6 = i2;
                i7 = this.f2700u.mo3860f(view4) + e02;
                mo3565z0(view4, i5, i6, i7, i8);
                if (!bVar4.mo3575c() || bVar4.mo3574b()) {
                    bVar2.f2713c = true;
                }
                bVar2.f2714d |= view4.hasFocusable();
                i21++;
                i4 = i8;
                i3 = i7;
                i2 = i6;
                i = i5;
            }
            i5 = i;
            mo3565z0(view4, i5, i6, i7, i8);
            if (!bVar4.mo3575c()) {
            }
            bVar2.f2713c = true;
            bVar2.f2714d |= view4.hasFocusable();
            i21++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.f2678L, null);
    }

    /* renamed from: v */
    public int mo3087v(C0401a0 a0Var) {
        if (this.f2683Q) {
            return m2836V2(a0Var);
        }
        return super.mo3087v(a0Var);
    }

    /* renamed from: w1 */
    public int mo3088w1(int i, C0433v vVar, C0401a0 a0Var) {
        m2845h3();
        m2838X2();
        return super.mo3088w1(i, vVar, a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w2 */
    public void mo3089w2(C0433v vVar, C0401a0 a0Var, C0395a aVar, int i) {
        super.mo3089w2(vVar, a0Var, aVar, i);
        m2845h3();
        if (a0Var.mo3331b() > 0 && !a0Var.mo3334e()) {
            m2837W2(vVar, a0Var, aVar, i);
        }
        m2838X2();
    }

    /* renamed from: y1 */
    public int mo3090y1(int i, C0433v vVar, C0401a0 a0Var) {
        m2845h3();
        m2838X2();
        return super.mo3090y1(i, vVar, a0Var);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo3079g3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo3079g3(i);
    }
}
