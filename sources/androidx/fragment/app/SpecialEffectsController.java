package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p010b.p034g.p039g.CancellationSignal;
import p010b.p034g.p039g.CancellationSignal.C0584a;
import p010b.p034g.p043k.ViewCompat;
import p010b.p053k.C0688b;

/* renamed from: androidx.fragment.app.d0 */
abstract class SpecialEffectsController {

    /* renamed from: a */
    private final ViewGroup f2323a;

    /* renamed from: b */
    final ArrayList<C0315e> f2324b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C0315e> f2325c = new ArrayList<>();

    /* renamed from: d */
    boolean f2326d = false;

    /* renamed from: e */
    boolean f2327e = false;

    /* renamed from: androidx.fragment.app.d0$a */
    /* compiled from: SpecialEffectsController */
    class C0311a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0314d f2328a;

        C0311a(C0314d dVar) {
            this.f2328a = dVar;
        }

        public void run() {
            if (SpecialEffectsController.this.f2324b.contains(this.f2328a)) {
                this.f2328a.mo2634e().mo2642a(this.f2328a.mo2635f().f2135K);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d0$b */
    /* compiled from: SpecialEffectsController */
    class C0312b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0314d f2330a;

        C0312b(C0314d dVar) {
            this.f2330a = dVar;
        }

        public void run() {
            SpecialEffectsController.this.f2324b.remove(this.f2330a);
            SpecialEffectsController.this.f2325c.remove(this.f2330a);
        }
    }

    /* renamed from: androidx.fragment.app.d0$c */
    /* compiled from: SpecialEffectsController */
    static /* synthetic */ class C0313c {

        /* renamed from: a */
        static final /* synthetic */ int[] f2332a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2333b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.d0$e$b[] r0 = androidx.fragment.app.SpecialEffectsController.C0315e.C0317b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2333b = r0
                r1 = 1
                androidx.fragment.app.d0$e$b r2 = androidx.fragment.app.SpecialEffectsController.C0315e.C0317b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2333b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.d0$e$b r3 = androidx.fragment.app.SpecialEffectsController.C0315e.C0317b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2333b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.d0$e$b r4 = androidx.fragment.app.SpecialEffectsController.C0315e.C0317b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.d0$e$c[] r3 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f2332a = r3
                androidx.fragment.app.d0$e$c r4 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f2332a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.d0$e$c r3 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f2332a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.d0$e$c r1 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f2332a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.d0$e$c r1 = androidx.fragment.app.SpecialEffectsController.C0315e.C0318c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.C0313c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.d0$d */
    /* compiled from: SpecialEffectsController */
    private static class C0314d extends C0315e {

        /* renamed from: h */
        private final FragmentStateManager f2334h;

        C0314d(C0318c cVar, C0317b bVar, FragmentStateManager uVar, CancellationSignal bVar2) {
            super(cVar, bVar, uVar.mo2889k(), bVar2);
            this.f2334h = uVar;
        }

        /* renamed from: c */
        public void mo2629c() {
            super.mo2629c();
            this.f2334h.mo2890m();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo2630l() {
            if (mo2636g() == C0317b.ADDING) {
                Fragment k = this.f2334h.mo2889k();
                View findFocus = k.f2135K.findFocus();
                if (findFocus != null) {
                    k.mo2410X1(findFocus);
                    if (FragmentManager.m2408G0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(k);
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                View P1 = mo2635f().mo2388P1();
                if (P1.getParent() == null) {
                    this.f2334h.mo2880b();
                    P1.setAlpha(0.0f);
                }
                if (P1.getAlpha() == 0.0f && P1.getVisibility() == 0) {
                    P1.setVisibility(4);
                }
                P1.setAlpha(k.mo2417a0());
            }
        }
    }

    /* renamed from: androidx.fragment.app.d0$e */
    /* compiled from: SpecialEffectsController */
    static class C0315e {

        /* renamed from: a */
        private C0318c f2335a;

        /* renamed from: b */
        private C0317b f2336b;

        /* renamed from: c */
        private final Fragment f2337c;

        /* renamed from: d */
        private final List<Runnable> f2338d = new ArrayList();

        /* renamed from: e */
        private final HashSet<CancellationSignal> f2339e = new HashSet<>();

        /* renamed from: f */
        private boolean f2340f = false;

        /* renamed from: g */
        private boolean f2341g = false;

        /* renamed from: androidx.fragment.app.d0$e$a */
        /* compiled from: SpecialEffectsController */
        class C0316a implements C0584a {
            C0316a() {
            }

            /* renamed from: a */
            public void mo2577a() {
                C0315e.this.mo2632b();
            }
        }

        /* renamed from: androidx.fragment.app.d0$e$b */
        /* compiled from: SpecialEffectsController */
        enum C0317b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.d0$e$c */
        /* compiled from: SpecialEffectsController */
        enum C0318c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            static C0318c m2315b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown visibility ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }

            /* renamed from: c */
            static C0318c m2316c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m2315b(view.getVisibility());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo2642a(View view) {
                int i = C0313c.f2332a[ordinal()];
                String str = "FragmentManager";
                if (i != 1) {
                    String str2 = "SpecialEffectsController: Setting view ";
                    if (i == 2) {
                        if (FragmentManager.m2408G0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(view);
                            sb.append(" to VISIBLE");
                            Log.v(str, sb.toString());
                        }
                        view.setVisibility(0);
                    } else if (i == 3) {
                        if (FragmentManager.m2408G0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(view);
                            sb2.append(" to GONE");
                            Log.v(str, sb2.toString());
                        }
                        view.setVisibility(8);
                    } else if (i == 4) {
                        if (FragmentManager.m2408G0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str2);
                            sb3.append(view);
                            sb3.append(" to INVISIBLE");
                            Log.v(str, sb3.toString());
                        }
                        view.setVisibility(4);
                    }
                } else {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m2408G0(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("SpecialEffectsController: Removing view ");
                            sb4.append(view);
                            sb4.append(" from container ");
                            sb4.append(viewGroup);
                            Log.v(str, sb4.toString());
                        }
                        viewGroup.removeView(view);
                    }
                }
            }
        }

        C0315e(C0318c cVar, C0317b bVar, Fragment fragment, CancellationSignal bVar2) {
            this.f2335a = cVar;
            this.f2336b = bVar;
            this.f2337c = fragment;
            bVar2.mo4872c(new C0316a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2631a(Runnable runnable) {
            this.f2338d.add(runnable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo2632b() {
            if (!mo2637h()) {
                this.f2340f = true;
                if (this.f2339e.isEmpty()) {
                    mo2629c();
                } else {
                    Iterator it = new ArrayList(this.f2339e).iterator();
                    while (it.hasNext()) {
                        ((CancellationSignal) it.next()).mo4870a();
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo2629c() {
            if (!this.f2341g) {
                if (FragmentManager.m2408G0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(this);
                    sb.append(" has called complete.");
                    Log.v("FragmentManager", sb.toString());
                }
                this.f2341g = true;
                for (Runnable run : this.f2338d) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo2633d(CancellationSignal bVar) {
            if (this.f2339e.remove(bVar) && this.f2339e.isEmpty()) {
                mo2629c();
            }
        }

        /* renamed from: e */
        public C0318c mo2634e() {
            return this.f2335a;
        }

        /* renamed from: f */
        public final Fragment mo2635f() {
            return this.f2337c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public C0317b mo2636g() {
            return this.f2336b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public final boolean mo2637h() {
            return this.f2340f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public final boolean mo2638i() {
            return this.f2341g;
        }

        /* renamed from: j */
        public final void mo2639j(CancellationSignal bVar) {
            mo2630l();
            this.f2339e.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public final void mo2640k(C0318c cVar, C0317b bVar) {
            int i = C0313c.f2333b[bVar.ordinal()];
            String str = "SpecialEffectsController: For fragment ";
            String str2 = "FragmentManager";
            if (i != 1) {
                String str3 = " mFinalState = ";
                if (i == 2) {
                    if (FragmentManager.m2408G0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(this.f2337c);
                        sb.append(str3);
                        sb.append(this.f2335a);
                        sb.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb.append(this.f2336b);
                        sb.append(" to REMOVING.");
                        Log.v(str2, sb.toString());
                    }
                    this.f2335a = C0318c.REMOVED;
                    this.f2336b = C0317b.REMOVING;
                } else if (i == 3 && this.f2335a != C0318c.REMOVED) {
                    if (FragmentManager.m2408G0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(this.f2337c);
                        sb2.append(str3);
                        sb2.append(this.f2335a);
                        sb2.append(" -> ");
                        sb2.append(cVar);
                        sb2.append(". ");
                        Log.v(str2, sb2.toString());
                    }
                    this.f2335a = cVar;
                }
            } else if (this.f2335a == C0318c.REMOVED) {
                if (FragmentManager.m2408G0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(this.f2337c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.f2336b);
                    sb3.append(" to ADDING.");
                    Log.v(str2, sb3.toString());
                }
                this.f2335a = C0318c.VISIBLE;
                this.f2336b = C0317b.ADDING;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo2630l() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Operation ");
            String str = "{";
            sb.append(str);
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            String str2 = "} ";
            sb.append(str2);
            sb.append(str);
            sb.append("mFinalState = ");
            sb.append(this.f2335a);
            sb.append(str2);
            sb.append(str);
            sb.append("mLifecycleImpact = ");
            sb.append(this.f2336b);
            sb.append(str2);
            sb.append(str);
            sb.append("mFragment = ");
            sb.append(this.f2337c);
            sb.append("}");
            return sb.toString();
        }
    }

    SpecialEffectsController(ViewGroup viewGroup) {
        this.f2323a = viewGroup;
    }

    /* renamed from: a */
    private void m2282a(C0318c cVar, C0317b bVar, FragmentStateManager uVar) {
        synchronized (this.f2324b) {
            CancellationSignal bVar2 = new CancellationSignal();
            C0315e h = m2283h(uVar.mo2889k());
            if (h != null) {
                h.mo2640k(cVar, bVar);
                return;
            }
            C0314d dVar = new C0314d(cVar, bVar, uVar, bVar2);
            this.f2324b.add(dVar);
            dVar.mo2631a(new C0311a(dVar));
            dVar.mo2631a(new C0312b(dVar));
        }
    }

    /* renamed from: h */
    private C0315e m2283h(Fragment fragment) {
        Iterator it = this.f2324b.iterator();
        while (it.hasNext()) {
            C0315e eVar = (C0315e) it.next();
            if (eVar.mo2635f().equals(fragment) && !eVar.mo2637h()) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C0315e m2284i(Fragment fragment) {
        Iterator it = this.f2325c.iterator();
        while (it.hasNext()) {
            C0315e eVar = (C0315e) it.next();
            if (eVar.mo2635f().equals(fragment) && !eVar.mo2637h()) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: n */
    static SpecialEffectsController m2285n(ViewGroup viewGroup, FragmentManager nVar) {
        return m2286o(viewGroup, nVar.mo2830z0());
    }

    /* renamed from: o */
    static SpecialEffectsController m2286o(ViewGroup viewGroup, SpecialEffectsControllerFactory e0Var) {
        int i = C0688b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController a = e0Var.mo2668a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: q */
    private void m2287q() {
        Iterator it = this.f2324b.iterator();
        while (it.hasNext()) {
            C0315e eVar = (C0315e) it.next();
            if (eVar.mo2636g() == C0317b.ADDING) {
                eVar.mo2640k(C0318c.m2315b(eVar.mo2635f().mo2388P1().getVisibility()), C0317b.NONE);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2616b(C0318c cVar, FragmentStateManager uVar) {
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(uVar.mo2889k());
            Log.v("FragmentManager", sb.toString());
        }
        m2282a(cVar, C0317b.ADDING, uVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2617c(FragmentStateManager uVar) {
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(uVar.mo2889k());
            Log.v("FragmentManager", sb.toString());
        }
        m2282a(C0318c.GONE, C0317b.NONE, uVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2618d(FragmentStateManager uVar) {
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(uVar.mo2889k());
            Log.v("FragmentManager", sb.toString());
        }
        m2282a(C0318c.REMOVED, C0317b.REMOVING, uVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2619e(FragmentStateManager uVar) {
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(uVar.mo2889k());
            Log.v("FragmentManager", sb.toString());
        }
        m2282a(C0318c.VISIBLE, C0317b.NONE, uVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract void mo2570f(List<C0315e> list, boolean z);

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2620g() {
        if (!this.f2327e) {
            if (!ViewCompat.m5536S(this.f2323a)) {
                mo2621j();
                this.f2326d = false;
                return;
            }
            synchronized (this.f2324b) {
                if (!this.f2324b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2325c);
                    this.f2325c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0315e eVar = (C0315e) it.next();
                        if (FragmentManager.m2408G0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(eVar);
                            Log.v("FragmentManager", sb.toString());
                        }
                        eVar.mo2632b();
                        if (!eVar.mo2638i()) {
                            this.f2325c.add(eVar);
                        }
                    }
                    m2287q();
                    ArrayList arrayList2 = new ArrayList(this.f2324b);
                    this.f2324b.clear();
                    this.f2325c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0315e) it2.next()).mo2630l();
                    }
                    mo2570f(arrayList2, this.f2326d);
                    this.f2326d = false;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2621j() {
        String str;
        String str2;
        boolean S = ViewCompat.m5536S(this.f2323a);
        synchronized (this.f2324b) {
            m2287q();
            Iterator it = this.f2324b.iterator();
            while (it.hasNext()) {
                ((C0315e) it.next()).mo2630l();
            }
            Iterator it2 = new ArrayList(this.f2325c).iterator();
            while (it2.hasNext()) {
                C0315e eVar = (C0315e) it2.next();
                if (FragmentManager.m2408G0(2)) {
                    String str3 = "FragmentManager";
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (S) {
                        str2 = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f2323a);
                        sb2.append(" is not attached to window. ");
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v(str3, sb.toString());
                }
                eVar.mo2632b();
            }
            Iterator it3 = new ArrayList(this.f2324b).iterator();
            while (it3.hasNext()) {
                C0315e eVar2 = (C0315e) it3.next();
                if (FragmentManager.m2408G0(2)) {
                    String str4 = "FragmentManager";
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (S) {
                        str = "";
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.f2323a);
                        sb4.append(" is not attached to window. ");
                        str = sb4.toString();
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v(str4, sb3.toString());
                }
                eVar2.mo2632b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2622k() {
        if (this.f2327e) {
            this.f2327e = false;
            mo2620g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C0317b mo2623l(FragmentStateManager uVar) {
        C0315e h = m2283h(uVar.mo2889k());
        if (h != null) {
            return h.mo2636g();
        }
        C0315e i = m2284i(uVar.mo2889k());
        if (i != null) {
            return i.mo2636g();
        }
        return null;
    }

    /* renamed from: m */
    public ViewGroup mo2624m() {
        return this.f2323a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo2625p() {
        synchronized (this.f2324b) {
            m2287q();
            this.f2327e = false;
            int size = this.f2324b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0315e eVar = (C0315e) this.f2324b.get(size);
                C0318c c = C0318c.m2316c(eVar.mo2635f().f2135K);
                C0318c e = eVar.mo2634e();
                C0318c cVar = C0318c.VISIBLE;
                if (e == cVar && c != cVar) {
                    this.f2327e = eVar.mo2635f().mo2481x0();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo2626r(boolean z) {
        this.f2326d = z;
    }
}
