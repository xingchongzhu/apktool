package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p010b.p025d.ArrayMap;
import p010b.p034g.p039g.CancellationSignal;
import p010b.p034g.p039g.CancellationSignal.C0584a;
import p010b.p034g.p042j.Preconditions;
import p010b.p034g.p043k.OneShotPreDrawListener;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.fragment.app.c */
class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.c$a */
    /* compiled from: DefaultSpecialEffectsController */
    static /* synthetic */ class C0292a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2257a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.d0$e$c[] r0 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2257a = r0
                androidx.fragment.app.d0$e$c r1 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2257a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.d0$e$c r1 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2257a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.d0$e$c r1 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2257a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.d0$e$c r1 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.C0292a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* compiled from: DefaultSpecialEffectsController */
    class C0293b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f2258a;

        /* renamed from: b */
        final /* synthetic */ C0315e f2259b;

        C0293b(List list, C0315e eVar) {
            this.f2258a = list;
            this.f2259b = eVar;
        }

        public void run() {
            if (this.f2258a.contains(this.f2259b)) {
                this.f2258a.remove(this.f2259b);
                DefaultSpecialEffectsController.this.mo2571s(this.f2259b);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    /* compiled from: DefaultSpecialEffectsController */
    class C0294c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2261a;

        /* renamed from: b */
        final /* synthetic */ View f2262b;

        /* renamed from: c */
        final /* synthetic */ boolean f2263c;

        /* renamed from: d */
        final /* synthetic */ C0315e f2264d;

        /* renamed from: e */
        final /* synthetic */ C0303k f2265e;

        C0294c(ViewGroup viewGroup, View view, boolean z, C0315e eVar, C0303k kVar) {
            this.f2261a = viewGroup;
            this.f2262b = view;
            this.f2263c = z;
            this.f2264d = eVar;
            this.f2265e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2261a.endViewTransition(this.f2262b);
            if (this.f2263c) {
                this.f2264d.mo2634e().mo2642a(this.f2262b);
            }
            this.f2265e.mo2587a();
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    /* compiled from: DefaultSpecialEffectsController */
    class C0295d implements C0584a {

        /* renamed from: a */
        final /* synthetic */ Animator f2267a;

        C0295d(Animator animator) {
            this.f2267a = animator;
        }

        /* renamed from: a */
        public void mo2577a() {
            this.f2267a.end();
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    /* compiled from: DefaultSpecialEffectsController */
    class C0296e implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2269a;

        /* renamed from: b */
        final /* synthetic */ View f2270b;

        /* renamed from: c */
        final /* synthetic */ C0303k f2271c;

        /* renamed from: androidx.fragment.app.c$e$a */
        /* compiled from: DefaultSpecialEffectsController */
        class C0297a implements Runnable {
            C0297a() {
            }

            public void run() {
                C0296e eVar = C0296e.this;
                eVar.f2269a.endViewTransition(eVar.f2270b);
                C0296e.this.f2271c.mo2587a();
            }
        }

        C0296e(ViewGroup viewGroup, View view, C0303k kVar) {
            this.f2269a = viewGroup;
            this.f2270b = view;
            this.f2271c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2269a.post(new C0297a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$f */
    /* compiled from: DefaultSpecialEffectsController */
    class C0298f implements C0584a {

        /* renamed from: a */
        final /* synthetic */ View f2274a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f2275b;

        /* renamed from: c */
        final /* synthetic */ C0303k f2276c;

        C0298f(View view, ViewGroup viewGroup, C0303k kVar) {
            this.f2274a = view;
            this.f2275b = viewGroup;
            this.f2276c = kVar;
        }

        /* renamed from: a */
        public void mo2577a() {
            this.f2274a.clearAnimation();
            this.f2275b.endViewTransition(this.f2274a);
            this.f2276c.mo2587a();
        }
    }

    /* renamed from: androidx.fragment.app.c$g */
    /* compiled from: DefaultSpecialEffectsController */
    class C0299g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0315e f2278a;

        /* renamed from: b */
        final /* synthetic */ C0315e f2279b;

        /* renamed from: c */
        final /* synthetic */ boolean f2280c;

        /* renamed from: d */
        final /* synthetic */ ArrayMap f2281d;

        C0299g(C0315e eVar, C0315e eVar2, boolean z, ArrayMap aVar) {
            this.f2278a = eVar;
            this.f2279b = eVar2;
            this.f2280c = z;
            this.f2281d = aVar;
        }

        public void run() {
            FragmentTransition.m2658f(this.f2278a.mo2635f(), this.f2279b.mo2635f(), this.f2280c, this.f2281d, false);
        }
    }

    /* renamed from: androidx.fragment.app.c$h */
    /* compiled from: DefaultSpecialEffectsController */
    class C0300h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FragmentTransitionImpl f2283a;

        /* renamed from: b */
        final /* synthetic */ View f2284b;

        /* renamed from: c */
        final /* synthetic */ Rect f2285c;

        C0300h(FragmentTransitionImpl a0Var, View view, Rect rect) {
            this.f2283a = a0Var;
            this.f2284b = view;
            this.f2285c = rect;
        }

        public void run() {
            this.f2283a.mo2539k(this.f2284b, this.f2285c);
        }
    }

    /* renamed from: androidx.fragment.app.c$i */
    /* compiled from: DefaultSpecialEffectsController */
    class C0301i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2287a;

        C0301i(ArrayList arrayList) {
            this.f2287a = arrayList;
        }

        public void run() {
            FragmentTransition.m2651A(this.f2287a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.c$j */
    /* compiled from: DefaultSpecialEffectsController */
    class C0302j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0305m f2289a;

        C0302j(C0305m mVar) {
            this.f2289a = mVar;
        }

        public void run() {
            this.f2289a.mo2587a();
        }
    }

    /* renamed from: androidx.fragment.app.c$k */
    /* compiled from: DefaultSpecialEffectsController */
    private static class C0303k extends C0304l {

        /* renamed from: c */
        private boolean f2291c;

        /* renamed from: d */
        private boolean f2292d = false;

        /* renamed from: e */
        private C0326d f2293e;

        C0303k(C0315e eVar, CancellationSignal bVar, boolean z) {
            super(eVar, bVar);
            this.f2291c = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C0326d mo2586e(Context context) {
            if (this.f2292d) {
                return this.f2293e;
            }
            C0326d c = FragmentAnim.m2346c(context, mo2588b().mo2635f(), mo2588b().mo2634e() == C0318c.VISIBLE, this.f2291c);
            this.f2293e = c;
            this.f2292d = true;
            return c;
        }
    }

    /* renamed from: androidx.fragment.app.c$l */
    /* compiled from: DefaultSpecialEffectsController */
    private static class C0304l {

        /* renamed from: a */
        private final C0315e f2294a;

        /* renamed from: b */
        private final CancellationSignal f2295b;

        C0304l(C0315e eVar, CancellationSignal bVar) {
            this.f2294a = eVar;
            this.f2295b = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2587a() {
            this.f2294a.mo2633d(this.f2295b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0315e mo2588b() {
            return this.f2294a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public CancellationSignal mo2589c() {
            return this.f2295b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo2590d() {
            C0318c c = C0318c.m2316c(this.f2294a.mo2635f().f2135K);
            C0318c e = this.f2294a.mo2634e();
            if (c != e) {
                C0318c cVar = C0318c.VISIBLE;
                if (c == cVar || e == cVar) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.c$m */
    /* compiled from: DefaultSpecialEffectsController */
    private static class C0305m extends C0304l {

        /* renamed from: c */
        private final Object f2296c;

        /* renamed from: d */
        private final boolean f2297d;

        /* renamed from: e */
        private final Object f2298e;

        C0305m(C0315e eVar, CancellationSignal bVar, boolean z, boolean z2) {
            Object obj;
            Object obj2;
            boolean z3;
            super(eVar, bVar);
            if (eVar.mo2634e() == C0318c.VISIBLE) {
                if (z) {
                    obj2 = eVar.mo2635f().mo2420b0();
                } else {
                    obj2 = eVar.mo2635f().mo2372K();
                }
                this.f2296c = obj2;
                if (z) {
                    z3 = eVar.mo2635f().mo2352D();
                } else {
                    z3 = eVar.mo2635f().mo2349C();
                }
                this.f2297d = z3;
            } else {
                if (z) {
                    obj = eVar.mo2635f().mo2426d0();
                } else {
                    obj = eVar.mo2635f().mo2380N();
                }
                this.f2296c = obj;
                this.f2297d = true;
            }
            if (!z2) {
                this.f2298e = null;
            } else if (z) {
                this.f2298e = eVar.mo2635f().mo2433f0();
            } else {
                this.f2298e = eVar.mo2635f().mo2429e0();
            }
        }

        /* renamed from: f */
        private FragmentTransitionImpl m2245f(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl a0Var = FragmentTransition.f2536b;
            if (a0Var != null && a0Var.mo2535e(obj)) {
                return a0Var;
            }
            FragmentTransitionImpl a0Var2 = FragmentTransition.f2537c;
            if (a0Var2 != null && a0Var2.mo2535e(obj)) {
                return a0Var2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Transition ");
            sb.append(obj);
            sb.append(" for fragment ");
            sb.append(mo2588b().mo2635f());
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public FragmentTransitionImpl mo2591e() {
            FragmentTransitionImpl f = m2245f(this.f2296c);
            FragmentTransitionImpl f2 = m2245f(this.f2298e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            sb.append(mo2588b().mo2635f());
            sb.append(" returned Transition ");
            sb.append(this.f2296c);
            sb.append(" which uses a different Transition  type than its shared element transition ");
            sb.append(this.f2298e);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: g */
        public Object mo2592g() {
            return this.f2298e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public Object mo2593h() {
            return this.f2296c;
        }

        /* renamed from: i */
        public boolean mo2594i() {
            return this.f2298e != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo2595j() {
            return this.f2297d;
        }
    }

    DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m2231w(List<C0303k> list, List<C0315e> list2, boolean z, Map<C0315e, Boolean> map) {
        String str;
        ViewGroup m = mo2624m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            C0303k kVar = (C0303k) it.next();
            if (kVar.mo2590d()) {
                kVar.mo2587a();
            } else {
                C0326d e = kVar.mo2586e(context);
                if (e == null) {
                    kVar.mo2587a();
                } else {
                    Animator animator = e.f2372b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        C0315e b = kVar.mo2588b();
                        Fragment f = b.mo2635f();
                        if (Boolean.TRUE.equals(map.get(b))) {
                            if (FragmentManager.m2408G0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(f);
                                sb.append(" as this Fragment was involved in a Transition.");
                                Log.v(str, sb.toString());
                            }
                            kVar.mo2587a();
                        } else {
                            boolean z3 = b.mo2634e() == C0318c.GONE;
                            List<C0315e> list3 = list2;
                            if (z3) {
                                list3.remove(b);
                            }
                            View view = f.f2135K;
                            m.startViewTransition(view);
                            C0294c cVar = r0;
                            View view2 = view;
                            C0294c cVar2 = new C0294c(m, view, z3, b, kVar);
                            animator.addListener(cVar);
                            animator.setTarget(view2);
                            animator.start();
                            kVar.mo2589c().mo4872c(new C0295d(animator));
                            z2 = true;
                        }
                    }
                }
            }
            Map<C0315e, Boolean> map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0303k kVar2 = (C0303k) it2.next();
            C0315e b2 = kVar2.mo2588b();
            Fragment f2 = b2.mo2635f();
            String str2 = "Ignoring Animation set on ";
            if (z) {
                if (FragmentManager.m2408G0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(f2);
                    sb2.append(" as Animations cannot run alongside Transitions.");
                    Log.v(str, sb2.toString());
                }
                kVar2.mo2587a();
            } else if (z2) {
                if (FragmentManager.m2408G0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(f2);
                    sb3.append(" as Animations cannot run alongside Animators.");
                    Log.v(str, sb3.toString());
                }
                kVar2.mo2587a();
            } else {
                View view3 = f2.f2135K;
                Animation animation = (Animation) Preconditions.m5188e(((C0326d) Preconditions.m5188e(kVar2.mo2586e(context))).f2371a);
                if (b2.mo2634e() != C0318c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.mo2587a();
                } else {
                    m.startViewTransition(view3);
                    C0327e eVar = new C0327e(animation, m, view3);
                    eVar.setAnimationListener(new C0296e(m, view3, kVar2));
                    view3.startAnimation(eVar);
                }
                kVar2.mo2589c().mo4872c(new C0298f(view3, m, kVar2));
            }
        }
    }

    /* renamed from: x */
    private Map<C0315e, Boolean> m2232x(List<C0305m> list, List<C0315e> list2, boolean z, C0315e eVar, C0315e eVar2) {
        Iterator it;
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        Object obj;
        View view2;
        C0315e eVar3;
        C0315e eVar4;
        Object obj2;
        Object obj3;
        ArrayMap aVar;
        C0315e eVar5;
        FragmentTransitionImpl a0Var;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C0315e eVar6;
        SharedElementCallback hVar;
        SharedElementCallback hVar2;
        View view4;
        boolean z2 = z;
        C0315e eVar7 = eVar;
        C0315e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        FragmentTransitionImpl a0Var2 = null;
        for (C0305m mVar : list) {
            if (!mVar.mo2590d()) {
                FragmentTransitionImpl e = mVar.mo2591e();
                if (a0Var2 == null) {
                    a0Var2 = e;
                } else if (!(e == null || a0Var2 == e)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb.append(mVar.mo2588b().mo2635f());
                    sb.append(" returned Transition ");
                    sb.append(mVar.mo2593h());
                    sb.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        if (a0Var2 == null) {
            for (C0305m mVar2 : list) {
                hashMap.put(mVar2.mo2588b(), Boolean.FALSE);
                mVar2.mo2587a();
            }
            return hashMap;
        }
        View view5 = new View(mo2624m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayMap aVar2 = new ArrayMap();
        Object obj4 = null;
        View view6 = null;
        boolean z3 = false;
        for (C0305m mVar3 : list) {
            if (!mVar3.mo2594i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar6 = eVar7;
                arrayList3 = arrayList5;
                rect = rect2;
                a0Var = a0Var2;
                eVar5 = eVar8;
                view3 = view5;
                view6 = view6;
            } else {
                Object B = a0Var2.mo2531B(a0Var2.mo2537g(mVar3.mo2592g()));
                ArrayList g0 = eVar2.mo2635f().mo2436g0();
                ArrayList g02 = eVar.mo2635f().mo2436g0();
                ArrayList h0 = eVar.mo2635f().mo2439h0();
                Object obj5 = B;
                View view7 = view6;
                int i = 0;
                while (i < h0.size()) {
                    int indexOf = g0.indexOf(h0.get(i));
                    ArrayList arrayList7 = h0;
                    if (indexOf != -1) {
                        g0.set(indexOf, g02.get(i));
                    }
                    i++;
                    h0 = arrayList7;
                }
                ArrayList h02 = eVar2.mo2635f().mo2439h0();
                if (!z2) {
                    hVar2 = eVar.mo2635f().mo2383O();
                    hVar = eVar2.mo2635f().mo2374L();
                } else {
                    hVar2 = eVar.mo2635f().mo2374L();
                    hVar = eVar2.mo2635f().mo2383O();
                }
                int size = g0.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = size;
                    aVar2.put((String) g0.get(i2), (String) h02.get(i2));
                    i2++;
                    C0315e eVar9 = eVar;
                    size = i3;
                }
                ArrayMap aVar3 = new ArrayMap();
                mo2573u(aVar3, eVar.mo2635f().f2135K);
                aVar3.mo4381o(g0);
                if (hVar2 == null) {
                    aVar2.mo4381o(aVar3.keySet());
                    ArrayMap aVar4 = new ArrayMap();
                    mo2573u(aVar4, eVar2.mo2635f().f2135K);
                    aVar4.mo4381o(h02);
                    aVar4.mo4381o(aVar2.values());
                    if (hVar == null) {
                        FragmentTransition.m2676x(aVar2, aVar4);
                        mo2574v(aVar3, aVar2.keySet());
                        mo2574v(aVar4, aVar2.values());
                        if (aVar2.isEmpty()) {
                            arrayList5.clear();
                            arrayList6.clear();
                            eVar6 = eVar;
                            aVar = aVar2;
                            arrayList4 = arrayList6;
                            arrayList3 = arrayList5;
                            rect = rect2;
                            view3 = view5;
                            a0Var = a0Var2;
                            view6 = view7;
                            obj4 = null;
                            eVar5 = eVar2;
                        } else {
                            FragmentTransition.m2658f(eVar2.mo2635f(), eVar.mo2635f(), z2, aVar3, true);
                            ArrayList arrayList8 = g0;
                            HashMap hashMap2 = hashMap;
                            Object obj6 = obj5;
                            C0299g gVar = r0;
                            View view8 = view5;
                            View view9 = view7;
                            ViewGroup m = mo2624m();
                            Rect rect3 = rect2;
                            aVar = aVar2;
                            ArrayList arrayList9 = arrayList6;
                            C0299g gVar2 = new C0299g(eVar2, eVar, z, aVar4);
                            OneShotPreDrawListener.m5506a(m, gVar);
                            for (View t : aVar3.values()) {
                                mo2572t(arrayList5, t);
                            }
                            if (!arrayList8.isEmpty()) {
                                View view10 = (View) aVar3.get((String) arrayList8.get(0));
                                a0Var2.mo2549v(obj6, view10);
                                view6 = view10;
                            } else {
                                view6 = view9;
                            }
                            for (View t2 : aVar4.values()) {
                                mo2572t(arrayList9, t2);
                            }
                            arrayList4 = arrayList9;
                            if (!h02.isEmpty()) {
                                View view11 = (View) aVar4.get((String) h02.get(0));
                                if (view11 != null) {
                                    rect = rect3;
                                    OneShotPreDrawListener.m5506a(mo2624m(), new C0300h(a0Var2, view11, rect));
                                    view4 = view8;
                                    z3 = true;
                                    a0Var2.mo2553z(obj6, view4, arrayList5);
                                    arrayList3 = arrayList5;
                                    view3 = view4;
                                    a0Var = a0Var2;
                                    a0Var2.mo2547t(obj6, null, null, null, null, obj6, arrayList4);
                                    Boolean bool = Boolean.TRUE;
                                    eVar6 = eVar;
                                    hashMap = hashMap2;
                                    hashMap.put(eVar6, bool);
                                    eVar5 = eVar2;
                                    hashMap.put(eVar5, bool);
                                    obj4 = obj6;
                                }
                            }
                            rect = rect3;
                            view4 = view8;
                            a0Var2.mo2553z(obj6, view4, arrayList5);
                            arrayList3 = arrayList5;
                            view3 = view4;
                            a0Var = a0Var2;
                            a0Var2.mo2547t(obj6, null, null, null, null, obj6, arrayList4);
                            Boolean bool2 = Boolean.TRUE;
                            eVar6 = eVar;
                            hashMap = hashMap2;
                            hashMap.put(eVar6, bool2);
                            eVar5 = eVar2;
                            hashMap.put(eVar5, bool2);
                            obj4 = obj6;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            z2 = z;
            eVar7 = eVar6;
            arrayList5 = arrayList3;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar5;
            aVar2 = aVar;
            arrayList6 = arrayList4;
            a0Var2 = a0Var;
        }
        View view12 = view6;
        ArrayMap aVar5 = aVar2;
        ArrayList arrayList10 = arrayList6;
        C0315e eVar10 = eVar7;
        ArrayList arrayList11 = arrayList5;
        Rect rect4 = rect2;
        FragmentTransitionImpl a0Var3 = a0Var2;
        C0315e eVar11 = eVar8;
        View view13 = view5;
        ArrayList arrayList12 = new ArrayList();
        Iterator it2 = list.iterator();
        Object obj7 = null;
        Object obj8 = null;
        while (it2.hasNext()) {
            C0305m mVar4 = (C0305m) it2.next();
            if (mVar4.mo2590d()) {
                hashMap.put(mVar4.mo2588b(), Boolean.FALSE);
                mVar4.mo2587a();
            } else {
                Object g = a0Var3.mo2537g(mVar4.mo2593h());
                C0315e b = mVar4.mo2588b();
                boolean z4 = obj4 != null && (b == eVar10 || b == eVar11);
                if (g == null) {
                    if (!z4) {
                        hashMap.put(b, Boolean.FALSE);
                        mVar4.mo2587a();
                    }
                    List<C0315e> list3 = list2;
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    it = it2;
                    view = view13;
                    obj = obj7;
                    eVar3 = eVar11;
                    view2 = view12;
                } else {
                    it = it2;
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    mo2572t(arrayList13, b.mo2635f().f2135K);
                    if (z4) {
                        if (b == eVar10) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        a0Var3.mo2532a(g, view13);
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view13;
                        eVar4 = b;
                        obj3 = obj8;
                        eVar3 = eVar11;
                        obj2 = obj9;
                        List<C0315e> list4 = list2;
                    } else {
                        a0Var3.mo2533b(g, arrayList13);
                        view = view13;
                        C0315e eVar12 = b;
                        obj2 = obj9;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        eVar3 = eVar11;
                        a0Var3.mo2547t(g, g, arrayList13, null, null, null, null);
                        if (eVar12.mo2634e() == C0318c.GONE) {
                            eVar4 = eVar12;
                            list2.remove(eVar4);
                            a0Var3.mo2545r(g, eVar4.mo2635f().f2135K, arrayList13);
                            OneShotPreDrawListener.m5506a(mo2624m(), new C0301i(arrayList13));
                        } else {
                            List<C0315e> list5 = list2;
                            eVar4 = eVar12;
                        }
                    }
                    if (eVar4.mo2634e() == C0318c.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z3) {
                            a0Var3.mo2548u(g, rect4);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        a0Var3.mo2549v(g, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.mo2595j()) {
                        obj8 = a0Var3.mo2541n(obj3, g, null);
                        obj = obj2;
                    } else {
                        obj = a0Var3.mo2541n(obj2, g, null);
                        obj8 = obj3;
                    }
                }
                eVar11 = eVar3;
                view12 = view2;
                obj7 = obj;
                view13 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
                it2 = it;
            }
        }
        ArrayList arrayList14 = arrayList10;
        ArrayList arrayList15 = arrayList11;
        C0315e eVar13 = eVar11;
        Object m2 = a0Var3.mo2540m(obj8, obj7, obj4);
        for (C0305m mVar5 : list) {
            if (!mVar5.mo2590d()) {
                Object h = mVar5.mo2593h();
                C0315e b2 = mVar5.mo2588b();
                boolean z5 = obj4 != null && (b2 == eVar10 || b2 == eVar13);
                if (h != null || z5) {
                    if (!ViewCompat.m5537T(mo2624m())) {
                        if (FragmentManager.m2408G0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SpecialEffectsController: Container ");
                            sb2.append(mo2624m());
                            sb2.append(" has not been laid out. Completing operation ");
                            sb2.append(b2);
                            Log.v("FragmentManager", sb2.toString());
                        }
                        mVar5.mo2587a();
                    } else {
                        a0Var3.mo2550w(mVar5.mo2588b().mo2635f(), m2, mVar5.mo2589c(), new C0302j(mVar5));
                    }
                }
            }
        }
        if (!ViewCompat.m5537T(mo2624m())) {
            return hashMap;
        }
        FragmentTransition.m2651A(arrayList12, 4);
        ArrayList arrayList16 = arrayList14;
        ArrayList o = a0Var3.mo2542o(arrayList16);
        a0Var3.mo2534c(mo2624m(), m2);
        a0Var3.mo2552y(mo2624m(), arrayList15, arrayList16, o, aVar5);
        FragmentTransition.m2651A(arrayList12, 0);
        a0Var3.mo2530A(obj4, arrayList15, arrayList16);
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2570f(List<C0315e> list, boolean z) {
        C0315e eVar = null;
        C0315e eVar2 = null;
        for (C0315e eVar3 : list) {
            C0318c c = C0318c.m2316c(eVar3.mo2635f().f2135K);
            int i = C0292a.f2257a[eVar3.mo2634e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (c == C0318c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i == 4 && c != C0318c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0315e> arrayList3 = new ArrayList<>(list);
        for (C0315e eVar4 : list) {
            CancellationSignal bVar = new CancellationSignal();
            eVar4.mo2639j(bVar);
            arrayList.add(new C0303k(eVar4, bVar, z));
            CancellationSignal bVar2 = new CancellationSignal();
            eVar4.mo2639j(bVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new C0305m(eVar4, bVar2, z, z2));
                    eVar4.mo2631a(new C0293b(arrayList3, eVar4));
                }
            } else if (eVar4 != eVar2) {
                arrayList2.add(new C0305m(eVar4, bVar2, z, z2));
                eVar4.mo2631a(new C0293b(arrayList3, eVar4));
            }
            z2 = true;
            arrayList2.add(new C0305m(eVar4, bVar2, z, z2));
            eVar4.mo2631a(new C0293b(arrayList3, eVar4));
        }
        Map x = m2232x(arrayList2, arrayList3, z, eVar, eVar2);
        m2231w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (C0315e s : arrayList3) {
            mo2571s(s);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo2571s(C0315e eVar) {
        eVar.mo2634e().mo2642a(eVar.mo2635f().f2135K);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo2572t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            if (!arrayList.contains(view) && ViewCompat.m5529L(view) != null) {
                arrayList.add(view);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo2572t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo2573u(Map<String, View> map, View view) {
        String L = ViewCompat.m5529L(view);
        if (L != null) {
            map.put(L, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo2573u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo2574v(ArrayMap<String, View> aVar, Collection<String> collection) {
        Iterator it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.m5529L((View) ((Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
