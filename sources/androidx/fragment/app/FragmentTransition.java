package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p010b.p025d.ArrayMap;
import p010b.p034g.p039g.CancellationSignal;
import p010b.p034g.p043k.OneShotPreDrawListener;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.fragment.app.y */
class FragmentTransition {

    /* renamed from: a */
    private static final int[] f2535a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final FragmentTransitionImpl f2536b = (VERSION.SDK_INT >= 21 ? new FragmentTransitionCompat21() : null);

    /* renamed from: c */
    static final FragmentTransitionImpl f2537c = m2675w();

    /* renamed from: androidx.fragment.app.y$a */
    /* compiled from: FragmentTransition */
    class C0354a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0360g f2538a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2539b;

        /* renamed from: c */
        final /* synthetic */ CancellationSignal f2540c;

        C0354a(C0360g gVar, Fragment fragment, CancellationSignal bVar) {
            this.f2538a = gVar;
            this.f2539b = fragment;
            this.f2540c = bVar;
        }

        public void run() {
            this.f2538a.mo2833a(this.f2539b, this.f2540c);
        }
    }

    /* renamed from: androidx.fragment.app.y$b */
    /* compiled from: FragmentTransition */
    class C0355b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2541a;

        C0355b(ArrayList arrayList) {
            this.f2541a = arrayList;
        }

        public void run() {
            FragmentTransition.m2651A(this.f2541a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.y$c */
    /* compiled from: FragmentTransition */
    class C0356c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0360g f2542a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2543b;

        /* renamed from: c */
        final /* synthetic */ CancellationSignal f2544c;

        C0356c(C0360g gVar, Fragment fragment, CancellationSignal bVar) {
            this.f2542a = gVar;
            this.f2543b = fragment;
            this.f2544c = bVar;
        }

        public void run() {
            this.f2542a.mo2833a(this.f2543b, this.f2544c);
        }
    }

    /* renamed from: androidx.fragment.app.y$d */
    /* compiled from: FragmentTransition */
    class C0357d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f2545a;

        /* renamed from: b */
        final /* synthetic */ FragmentTransitionImpl f2546b;

        /* renamed from: c */
        final /* synthetic */ View f2547c;

        /* renamed from: d */
        final /* synthetic */ Fragment f2548d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f2549e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2550f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f2551g;

        /* renamed from: h */
        final /* synthetic */ Object f2552h;

        C0357d(Object obj, FragmentTransitionImpl a0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2545a = obj;
            this.f2546b = a0Var;
            this.f2547c = view;
            this.f2548d = fragment;
            this.f2549e = arrayList;
            this.f2550f = arrayList2;
            this.f2551g = arrayList3;
            this.f2552h = obj2;
        }

        public void run() {
            Object obj = this.f2545a;
            if (obj != null) {
                this.f2546b.mo2543p(obj, this.f2547c);
                this.f2550f.addAll(FragmentTransition.m2663k(this.f2546b, this.f2545a, this.f2548d, this.f2549e, this.f2547c));
            }
            if (this.f2551g != null) {
                if (this.f2552h != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2547c);
                    this.f2546b.mo2544q(this.f2552h, this.f2551g, arrayList);
                }
                this.f2551g.clear();
                this.f2551g.add(this.f2547c);
            }
        }
    }

    /* renamed from: androidx.fragment.app.y$e */
    /* compiled from: FragmentTransition */
    class C0358e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Fragment f2553a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2554b;

        /* renamed from: c */
        final /* synthetic */ boolean f2555c;

        /* renamed from: d */
        final /* synthetic */ ArrayMap f2556d;

        /* renamed from: e */
        final /* synthetic */ View f2557e;

        /* renamed from: f */
        final /* synthetic */ FragmentTransitionImpl f2558f;

        /* renamed from: g */
        final /* synthetic */ Rect f2559g;

        C0358e(Fragment fragment, Fragment fragment2, boolean z, ArrayMap aVar, View view, FragmentTransitionImpl a0Var, Rect rect) {
            this.f2553a = fragment;
            this.f2554b = fragment2;
            this.f2555c = z;
            this.f2556d = aVar;
            this.f2557e = view;
            this.f2558f = a0Var;
            this.f2559g = rect;
        }

        public void run() {
            FragmentTransition.m2658f(this.f2553a, this.f2554b, this.f2555c, this.f2556d, false);
            View view = this.f2557e;
            if (view != null) {
                this.f2558f.mo2539k(view, this.f2559g);
            }
        }
    }

    /* renamed from: androidx.fragment.app.y$f */
    /* compiled from: FragmentTransition */
    class C0359f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FragmentTransitionImpl f2560a;

        /* renamed from: b */
        final /* synthetic */ ArrayMap f2561b;

        /* renamed from: c */
        final /* synthetic */ Object f2562c;

        /* renamed from: d */
        final /* synthetic */ C0361h f2563d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f2564e;

        /* renamed from: f */
        final /* synthetic */ View f2565f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2566g;

        /* renamed from: h */
        final /* synthetic */ Fragment f2567h;

        /* renamed from: i */
        final /* synthetic */ boolean f2568i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2569j;

        /* renamed from: k */
        final /* synthetic */ Object f2570k;

        /* renamed from: l */
        final /* synthetic */ Rect f2571l;

        C0359f(FragmentTransitionImpl a0Var, ArrayMap aVar, Object obj, C0361h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2560a = a0Var;
            this.f2561b = aVar;
            this.f2562c = obj;
            this.f2563d = hVar;
            this.f2564e = arrayList;
            this.f2565f = view;
            this.f2566g = fragment;
            this.f2567h = fragment2;
            this.f2568i = z;
            this.f2569j = arrayList2;
            this.f2570k = obj2;
            this.f2571l = rect;
        }

        public void run() {
            ArrayMap h = FragmentTransition.m2660h(this.f2560a, this.f2561b, this.f2562c, this.f2563d);
            if (h != null) {
                this.f2564e.addAll(h.values());
                this.f2564e.add(this.f2565f);
            }
            FragmentTransition.m2658f(this.f2566g, this.f2567h, this.f2568i, h, false);
            Object obj = this.f2562c;
            if (obj != null) {
                this.f2560a.mo2530A(obj, this.f2569j, this.f2564e);
                View s = FragmentTransition.m2671s(h, this.f2563d, this.f2570k, this.f2568i);
                if (s != null) {
                    this.f2560a.mo2539k(s, this.f2571l);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.y$g */
    /* compiled from: FragmentTransition */
    interface C0360g {
        /* renamed from: a */
        void mo2833a(Fragment fragment, CancellationSignal bVar);

        /* renamed from: b */
        void mo2834b(Fragment fragment, CancellationSignal bVar);
    }

    /* renamed from: androidx.fragment.app.y$h */
    /* compiled from: FragmentTransition */
    static class C0361h {

        /* renamed from: a */
        public Fragment f2572a;

        /* renamed from: b */
        public boolean f2573b;

        /* renamed from: c */
        public BackStackRecord f2574c;

        /* renamed from: d */
        public Fragment f2575d;

        /* renamed from: e */
        public boolean f2576e;

        /* renamed from: f */
        public BackStackRecord f2577f;

        C0361h() {
        }
    }

    /* renamed from: A */
    static void m2651A(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: B */
    static void m2652B(Context context, FragmentContainer gVar, ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C0360g gVar2) {
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            BackStackRecord aVar = (BackStackRecord) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                m2657e(aVar, sparseArray, z);
            } else {
                m2655c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                ArrayMap d = m2656d(keyAt, arrayList, arrayList2, i, i2);
                C0361h hVar = (C0361h) sparseArray.valueAt(i4);
                if (gVar.mo2492g()) {
                    ViewGroup viewGroup = (ViewGroup) gVar.mo2491f(keyAt);
                    if (viewGroup != null) {
                        if (z) {
                            m2667o(viewGroup, hVar, view, d, gVar2);
                        } else {
                            m2666n(viewGroup, hVar, view, d, gVar2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2653a(ArrayList<View> arrayList, ArrayMap<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo4513m(size);
            if (collection.contains(ViewCompat.m5529L(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f2165m != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006c, code lost:
        if (r0.f2142R >= 0.0f) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0078, code lost:
        if (r0.f2127A == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.f2127A == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2654b(androidx.fragment.app.BackStackRecord r8, androidx.fragment.app.FragmentTransaction.C0353a r9, android.util.SparseArray<androidx.fragment.app.FragmentTransition.C0361h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f2528b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f2177y
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f2535a
            int r9 = r9.f2527a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f2527a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f2141Q
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.f2127A
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f2165m
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.f2127A
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f2141Q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2165m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2127A
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f2165m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2127A
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.f2165m
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f2135K
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f2142R
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.f2165m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2127A
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.f2140P
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.f2165m
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f2127A
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0092:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.y$h r5 = (androidx.fragment.app.FragmentTransition.C0361h) r5
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.y$h r5 = m2668p(r5, r10, r1)
            r5.f2572a = r0
            r5.f2573b = r11
            r5.f2574c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r3 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r3 = r5.f2575d
            if (r3 != r0) goto L_0x00b1
            r5.f2575d = r2
        L_0x00b1:
            boolean r3 = r8.f2525r
            if (r3 != 0) goto L_0x00c5
            androidx.fragment.app.n r3 = r8.f2224t
            androidx.fragment.app.u r6 = r3.mo2824w(r0)
            androidx.fragment.app.w r7 = r3.mo2818s0()
            r7.mo2926p(r6)
            r3.mo2771Q0(r0)
        L_0x00c5:
            if (r4 == 0) goto L_0x00d7
            if (r5 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r3 = r5.f2575d
            if (r3 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.y$h r5 = m2668p(r5, r10, r1)
            r5.f2575d = r0
            r5.f2576e = r11
            r5.f2577f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r9 == 0) goto L_0x00e3
            if (r5 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r5.f2572a
            if (r8 != r0) goto L_0x00e3
            r5.f2572a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentTransition.m2654b(androidx.fragment.app.a, androidx.fragment.app.x$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m2655c(BackStackRecord aVar, SparseArray<C0361h> sparseArray, boolean z) {
        int size = aVar.f2510c.size();
        for (int i = 0; i < size; i++) {
            m2654b(aVar, (C0353a) aVar.f2510c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static ArrayMap<String, String> m2656d(int i, ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        ArrayMap<String, String> aVar = new ArrayMap<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            BackStackRecord aVar2 = (BackStackRecord) arrayList.get(i4);
            if (aVar2.mo2509D(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2523p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2523p;
                        arrayList4 = aVar2.f2524q;
                    } else {
                        ArrayList arrayList6 = aVar2.f2523p;
                        arrayList3 = aVar2.f2524q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m2657e(BackStackRecord aVar, SparseArray<C0361h> sparseArray, boolean z) {
        if (aVar.f2224t.mo2813o0().mo2492g()) {
            for (int size = aVar.f2510c.size() - 1; size >= 0; size--) {
                m2654b(aVar, (C0353a) aVar.f2510c.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m2658f(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> aVar, boolean z2) {
        SharedElementCallback hVar;
        int i;
        if (z) {
            hVar = fragment2.mo2374L();
        } else {
            hVar = fragment.mo2374L();
        }
        if (hVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo4508i(i2));
                arrayList.add(aVar.mo4513m(i2));
            }
            if (z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: g */
    private static boolean m2659g(FragmentTransitionImpl a0Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a0Var.mo2535e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static ArrayMap<String, View> m2660h(FragmentTransitionImpl a0Var, ArrayMap<String, String> aVar, Object obj, C0361h hVar) {
        SharedElementCallback hVar2;
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f2572a;
        View l0 = fragment.mo2452l0();
        if (aVar.isEmpty() || obj == null || l0 == null) {
            aVar.clear();
            return null;
        }
        ArrayMap<String, View> aVar2 = new ArrayMap<>();
        a0Var.mo2538j(aVar2, l0);
        BackStackRecord aVar3 = hVar.f2574c;
        if (hVar.f2573b) {
            hVar2 = fragment.mo2383O();
            arrayList = aVar3.f2523p;
        } else {
            hVar2 = fragment.mo2374L();
            arrayList = aVar3.f2524q;
        }
        if (arrayList != null) {
            aVar2.mo4381o(arrayList);
            aVar2.mo4381o(aVar.values());
        }
        if (hVar2 == null) {
            m2676x(aVar, aVar2);
            return aVar2;
        }
        throw null;
    }

    /* renamed from: i */
    private static ArrayMap<String, View> m2661i(FragmentTransitionImpl a0Var, ArrayMap<String, String> aVar, Object obj, C0361h hVar) {
        SharedElementCallback hVar2;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2575d;
        ArrayMap<String, View> aVar2 = new ArrayMap<>();
        a0Var.mo2538j(aVar2, fragment.mo2388P1());
        BackStackRecord aVar3 = hVar.f2577f;
        if (hVar.f2576e) {
            hVar2 = fragment.mo2374L();
            arrayList = aVar3.f2524q;
        } else {
            hVar2 = fragment.mo2383O();
            arrayList = aVar3.f2523p;
        }
        if (arrayList != null) {
            aVar2.mo4381o(arrayList);
        }
        if (hVar2 == null) {
            aVar.mo4381o(aVar2.keySet());
            return aVar2;
        }
        throw null;
    }

    /* renamed from: j */
    private static FragmentTransitionImpl m2662j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object N = fragment.mo2380N();
            if (N != null) {
                arrayList.add(N);
            }
            Object d0 = fragment.mo2426d0();
            if (d0 != null) {
                arrayList.add(d0);
            }
            Object f0 = fragment.mo2433f0();
            if (f0 != null) {
                arrayList.add(f0);
            }
        }
        if (fragment2 != null) {
            Object K = fragment2.mo2372K();
            if (K != null) {
                arrayList.add(K);
            }
            Object b0 = fragment2.mo2420b0();
            if (b0 != null) {
                arrayList.add(b0);
            }
            Object e0 = fragment2.mo2429e0();
            if (e0 != null) {
                arrayList.add(e0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        FragmentTransitionImpl a0Var = f2536b;
        if (a0Var != null && m2659g(a0Var, arrayList)) {
            return a0Var;
        }
        FragmentTransitionImpl a0Var2 = f2537c;
        if (a0Var2 != null && m2659g(a0Var2, arrayList)) {
            return a0Var2;
        }
        if (a0Var == null && a0Var2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m2663k(FragmentTransitionImpl a0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View l0 = fragment.mo2452l0();
        if (l0 != null) {
            a0Var.mo2536f(arrayList2, l0);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        a0Var.mo2533b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m2664l(FragmentTransitionImpl a0Var, ViewGroup viewGroup, View view, ArrayMap<String, String> aVar, C0361h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        ArrayMap<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        FragmentTransitionImpl a0Var2 = a0Var;
        C0361h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f2572a;
        Fragment fragment2 = hVar2.f2575d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f2573b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m2672t(a0Var2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        ArrayMap i = m2661i(a0Var2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2658f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            a0Var2.mo2553z(obj4, view, arrayList3);
            m2678z(a0Var, obj4, obj2, i, hVar2.f2576e, hVar2.f2577f);
            if (obj5 != null) {
                a0Var2.mo2548u(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0359f fVar = r0;
        C0359f fVar2 = new C0359f(a0Var, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        OneShotPreDrawListener.m5506a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: m */
    private static Object m2665m(FragmentTransitionImpl a0Var, ViewGroup viewGroup, View view, ArrayMap<String, String> aVar, C0361h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        FragmentTransitionImpl a0Var2 = a0Var;
        View view3 = view;
        ArrayMap<String, String> aVar2 = aVar;
        C0361h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.f2572a;
        Fragment fragment2 = hVar2.f2575d;
        if (fragment != null) {
            fragment.mo2388P1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f2573b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m2672t(a0Var, fragment, fragment2, z);
        }
        ArrayMap i = m2661i(a0Var, aVar2, obj3, hVar2);
        ArrayMap h = m2660h(a0Var, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj4 = null;
        } else {
            m2653a(arrayList3, i, aVar.keySet());
            m2653a(arrayList4, h, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2658f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            a0Var.mo2553z(obj4, view3, arrayList3);
            m2678z(a0Var, obj4, obj2, i, hVar2.f2576e, hVar2.f2577f);
            Rect rect2 = new Rect();
            View s = m2671s(h, hVar2, obj5, z);
            if (s != null) {
                a0Var.mo2548u(obj5, rect2);
            }
            rect = rect2;
            view2 = s;
        } else {
            view2 = null;
            rect = null;
        }
        C0358e eVar = new C0358e(fragment, fragment2, z, h, view2, a0Var, rect);
        OneShotPreDrawListener.m5506a(viewGroup, eVar);
        return obj4;
    }

    /* renamed from: n */
    private static void m2666n(ViewGroup viewGroup, C0361h hVar, View view, ArrayMap<String, String> aVar, C0360g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        C0361h hVar2 = hVar;
        View view2 = view;
        ArrayMap<String, String> aVar2 = aVar;
        C0360g gVar2 = gVar;
        Fragment fragment = hVar2.f2572a;
        Fragment fragment2 = hVar2.f2575d;
        FragmentTransitionImpl j = m2662j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f2573b;
            boolean z2 = hVar2.f2576e;
            Object q = m2669q(j, fragment, z);
            Object r = m2670r(j, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r;
            Object obj3 = q;
            FragmentTransitionImpl a0Var = j;
            Object l = m2664l(j, viewGroup, view, aVar, hVar, arrayList, arrayList2, q, obj2);
            Object obj4 = obj3;
            if (obj4 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList k = m2663k(a0Var, obj, fragment2, arrayList4, view2);
            if (k == null || k.isEmpty()) {
                obj = null;
            }
            Object obj5 = obj;
            a0Var.mo2532a(obj4, view2);
            Object u = m2673u(a0Var, obj4, obj5, l, fragment, hVar2.f2573b);
            if (!(fragment2 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                CancellationSignal bVar = new CancellationSignal();
                gVar2.mo2834b(fragment2, bVar);
                a0Var.mo2550w(fragment2, u, bVar, new C0356c(gVar2, fragment2, bVar));
            }
            if (u != null) {
                ArrayList arrayList5 = new ArrayList();
                FragmentTransitionImpl a0Var2 = a0Var;
                a0Var2.mo2547t(u, obj4, arrayList5, obj5, k, l, arrayList2);
                m2677y(a0Var2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, k);
                ViewGroup viewGroup3 = viewGroup;
                FragmentTransitionImpl a0Var3 = a0Var;
                ArrayList arrayList6 = arrayList2;
                a0Var3.mo2551x(viewGroup3, arrayList6, aVar2);
                a0Var3.mo2534c(viewGroup3, u);
                a0Var3.mo2546s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    /* renamed from: o */
    private static void m2667o(ViewGroup viewGroup, C0361h hVar, View view, ArrayMap<String, String> aVar, C0360g gVar) {
        Object obj;
        C0361h hVar2 = hVar;
        View view2 = view;
        C0360g gVar2 = gVar;
        Fragment fragment = hVar2.f2572a;
        Fragment fragment2 = hVar2.f2575d;
        FragmentTransitionImpl j = m2662j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f2573b;
            boolean z2 = hVar2.f2576e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object q = m2669q(j, fragment, z);
            Object r = m2670r(j, fragment2, z2);
            Object obj2 = q;
            ArrayList arrayList3 = arrayList2;
            Object m = m2665m(j, viewGroup, view, aVar, hVar, arrayList2, arrayList, q, r);
            Object obj3 = obj2;
            if (obj3 == null && m == null) {
                obj = r;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r;
            }
            ArrayList k = m2663k(j, obj, fragment2, arrayList3, view2);
            ArrayList k2 = m2663k(j, obj3, fragment, arrayList, view2);
            m2651A(k2, 4);
            Fragment fragment3 = fragment;
            ArrayList arrayList4 = k;
            Object u = m2673u(j, obj3, obj, m, fragment3, z);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                CancellationSignal bVar = new CancellationSignal();
                C0360g gVar3 = gVar;
                gVar3.mo2834b(fragment2, bVar);
                j.mo2550w(fragment2, u, bVar, new C0354a(gVar3, fragment2, bVar));
            }
            if (u != null) {
                m2674v(j, obj, fragment2, arrayList4);
                ArrayList o = j.mo2542o(arrayList);
                FragmentTransitionImpl a0Var = j;
                a0Var.mo2547t(u, obj3, k2, obj, arrayList4, m, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j.mo2534c(viewGroup2, u);
                a0Var.mo2552y(viewGroup2, arrayList3, arrayList, o, aVar);
                m2651A(k2, 0);
                j.mo2530A(m, arrayList3, arrayList);
            }
        }
    }

    /* renamed from: p */
    private static C0361h m2668p(C0361h hVar, SparseArray<C0361h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C0361h hVar2 = new C0361h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m2669q(FragmentTransitionImpl a0Var, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo2420b0();
        } else {
            obj = fragment.mo2372K();
        }
        return a0Var.mo2537g(obj);
    }

    /* renamed from: r */
    private static Object m2670r(FragmentTransitionImpl a0Var, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo2426d0();
        } else {
            obj = fragment.mo2380N();
        }
        return a0Var.mo2537g(obj);
    }

    /* renamed from: s */
    static View m2671s(ArrayMap<String, View> aVar, C0361h hVar, Object obj, boolean z) {
        String str;
        BackStackRecord aVar2 = hVar.f2574c;
        if (!(obj == null || aVar == null)) {
            ArrayList<String> arrayList = aVar2.f2523p;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (z) {
                    str = (String) aVar2.f2523p.get(0);
                } else {
                    str = (String) aVar2.f2524q.get(0);
                }
                return (View) aVar.get(str);
            }
        }
        return null;
    }

    /* renamed from: t */
    private static Object m2672t(FragmentTransitionImpl a0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.mo2433f0();
        } else {
            obj = fragment.mo2429e0();
        }
        return a0Var.mo2531B(a0Var.mo2537g(obj));
    }

    /* renamed from: u */
    private static Object m2673u(FragmentTransitionImpl a0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo2352D() : fragment.mo2349C();
        if (z2) {
            return a0Var.mo2541n(obj2, obj, obj3);
        }
        return a0Var.mo2540m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m2674v(FragmentTransitionImpl a0Var, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2165m && fragment.f2127A && fragment.f2141Q) {
            fragment.mo2413Y1(true);
            a0Var.mo2545r(obj, fragment.mo2452l0(), arrayList);
            OneShotPreDrawListener.m5506a(fragment.f2134J, new C0355b(arrayList));
        }
    }

    /* renamed from: w */
    private static FragmentTransitionImpl m2675w() {
        try {
            return (FragmentTransitionImpl) Class.forName("b.p.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    static void m2676x(ArrayMap<String, String> aVar, ArrayMap<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.mo4513m(size))) {
                aVar.mo4511k(size);
            }
        }
    }

    /* renamed from: y */
    private static void m2677y(FragmentTransitionImpl a0Var, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        C0357d dVar = new C0357d(obj, a0Var, view, fragment, arrayList, arrayList2, arrayList3, obj2);
        ViewGroup viewGroup2 = viewGroup;
        OneShotPreDrawListener.m5506a(viewGroup, dVar);
    }

    /* renamed from: z */
    private static void m2678z(FragmentTransitionImpl a0Var, Object obj, Object obj2, ArrayMap<String, View> aVar, boolean z, BackStackRecord aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f2523p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = (String) aVar2.f2524q.get(0);
            } else {
                str = (String) aVar2.f2523p.get(0);
            }
            View view = (View) aVar.get(str);
            a0Var.mo2549v(obj, view);
            if (obj2 != null) {
                a0Var.mo2549v(obj2, view);
            }
        }
    }
}
