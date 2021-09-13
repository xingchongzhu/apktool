package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment.C0286l;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.ViewModelStoreOwner;
import p010b.p034g.p043k.ViewCompat;
import p010b.p053k.C0688b;

/* renamed from: androidx.fragment.app.u */
class FragmentStateManager {

    /* renamed from: a */
    private final FragmentLifecycleCallbacksDispatcher f2490a;

    /* renamed from: b */
    private final FragmentStore f2491b;

    /* renamed from: c */
    private final Fragment f2492c;

    /* renamed from: d */
    private boolean f2493d = false;

    /* renamed from: e */
    private int f2494e = -1;

    /* renamed from: androidx.fragment.app.u$a */
    /* compiled from: FragmentStateManager */
    class C0351a implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f2495a;

        C0351a(View view) {
            this.f2495a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f2495a.removeOnAttachStateChangeListener(this);
            ViewCompat.m5567l0(this.f2495a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    /* compiled from: FragmentStateManager */
    static /* synthetic */ class C0352b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2497a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.f$c[] r0 = androidx.lifecycle.Lifecycle.C0378c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2497a = r0
                androidx.lifecycle.f$c r1 = androidx.lifecycle.Lifecycle.C0378c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2497a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.f$c r1 = androidx.lifecycle.Lifecycle.C0378c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2497a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.f$c r1 = androidx.lifecycle.Lifecycle.C0378c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2497a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.f$c r1 = androidx.lifecycle.Lifecycle.C0378c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentStateManager.C0352b.<clinit>():void");
        }
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher mVar, FragmentStore wVar, Fragment fragment) {
        this.f2490a = mVar;
        this.f2491b = wVar;
        this.f2492c = fragment;
    }

    /* renamed from: l */
    private boolean m2575l(View view) {
        if (view == this.f2492c.f2135K) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2492c.f2135K) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m2576q() {
        Bundle bundle = new Bundle();
        this.f2492c.mo2357E1(bundle);
        this.f2490a.mo2738j(this.f2492c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2492c.f2135K != null) {
            mo2896t();
        }
        if (this.f2492c.f2156d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2492c.f2156d);
        }
        if (this.f2492c.f2157e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2492c.f2157e);
        }
        if (!this.f2492c.f2137M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2492c.f2137M);
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2879a() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f2492c);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2492c;
        fragment.mo2450k1(fragment.f2154c);
        FragmentLifecycleCallbacksDispatcher mVar = this.f2490a;
        Fragment fragment2 = this.f2492c;
        mVar.mo2729a(fragment2, fragment2.f2154c, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2880b() {
        int j = this.f2491b.mo2920j(this.f2492c);
        Fragment fragment = this.f2492c;
        fragment.f2134J.addView(fragment.f2135K, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2881c() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f2492c);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2492c;
        Fragment fragment2 = fragment.f2161i;
        String str = " that does not belong to this FragmentManager!";
        String str2 = " declared target fragment ";
        String str3 = "Fragment ";
        FragmentStateManager uVar = null;
        if (fragment2 != null) {
            FragmentStateManager m = this.f2491b.mo2923m(fragment2.f2159g);
            if (m != null) {
                Fragment fragment3 = this.f2492c;
                fragment3.f2162j = fragment3.f2161i.f2159g;
                fragment3.f2161i = null;
                uVar = m;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(this.f2492c);
                sb2.append(str2);
                sb2.append(this.f2492c.f2161i);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        } else {
            String str4 = fragment.f2162j;
            if (str4 != null) {
                uVar = this.f2491b.mo2923m(str4);
                if (uVar == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str3);
                    sb3.append(this.f2492c);
                    sb3.append(str2);
                    sb3.append(this.f2492c.f2162j);
                    sb3.append(str);
                    throw new IllegalStateException(sb3.toString());
                }
            }
        }
        if (uVar != null && (FragmentManager.f2397b || uVar.mo2889k().f2152b < 1)) {
            uVar.mo2890m();
        }
        Fragment fragment4 = this.f2492c;
        fragment4.f2173u = fragment4.f2172t.mo2822u0();
        Fragment fragment5 = this.f2492c;
        fragment5.f2175w = fragment5.f2172t.mo2826x0();
        this.f2490a.mo2735g(this.f2492c, false);
        this.f2492c.mo2453l1();
        this.f2490a.mo2730b(this.f2492c, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo2882d() {
        Fragment fragment = this.f2492c;
        if (fragment.f2172t == null) {
            return fragment.f2152b;
        }
        int i = this.f2494e;
        int i2 = C0352b.f2497a[fragment.f2145U.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment2 = this.f2492c;
        if (fragment2.f2167o) {
            if (fragment2.f2168p) {
                i = Math.max(this.f2494e, 2);
                View view = this.f2492c.f2135K;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f2494e < 4 ? Math.min(i, fragment2.f2152b) : Math.min(i, 1);
            }
        }
        if (!this.f2492c.f2165m) {
            i = Math.min(i, 1);
        }
        C0317b bVar = null;
        if (FragmentManager.f2397b) {
            Fragment fragment3 = this.f2492c;
            ViewGroup viewGroup = fragment3.f2134J;
            if (viewGroup != null) {
                bVar = SpecialEffectsController.m2285n(viewGroup, fragment3.mo2405W()).mo2623l(this);
            }
        }
        if (bVar == C0317b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == C0317b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f2492c;
            if (fragment4.f2166n) {
                if (fragment4.mo2475v0()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f2492c;
        if (fragment5.f2136L && fragment5.f2152b < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.f2492c);
            Log.v("FragmentManager", sb.toString());
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2883e() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f2492c);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2492c;
        if (!fragment.f2144T) {
            this.f2490a.mo2736h(fragment, fragment.f2154c, false);
            Fragment fragment2 = this.f2492c;
            fragment2.mo2458o1(fragment2.f2154c);
            FragmentLifecycleCallbacksDispatcher mVar = this.f2490a;
            Fragment fragment3 = this.f2492c;
            mVar.mo2731c(fragment3, fragment3.f2154c, false);
            return;
        }
        fragment.mo2391Q1(fragment.f2154c);
        this.f2492c.f2152b = 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2884f() {
        String str;
        if (!this.f2492c.f2167o) {
            String str2 = "FragmentManager";
            if (FragmentManager.m2408G0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f2492c);
                Log.d(str2, sb.toString());
            }
            Fragment fragment = this.f2492c;
            LayoutInflater u1 = fragment.mo2473u1(fragment.f2154c);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f2492c;
            ViewGroup viewGroup2 = fragment2.f2134J;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.f2177y;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.f2172t.mo2813o0().mo2491f(this.f2492c.f2177y);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f2492c;
                            if (!fragment3.f2169q) {
                                try {
                                    str = fragment3.mo2423c0().getResourceName(this.f2492c.f2177y);
                                } catch (NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("No view found for id 0x");
                                sb2.append(Integer.toHexString(this.f2492c.f2177y));
                                sb2.append(" (");
                                sb2.append(str);
                                sb2.append(") for fragment ");
                                sb2.append(this.f2492c);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Cannot create fragment ");
                        sb3.append(this.f2492c);
                        sb3.append(" for a container view with no id");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
            }
            Fragment fragment4 = this.f2492c;
            fragment4.f2134J = viewGroup;
            fragment4.mo2464q1(u1, viewGroup, fragment4.f2154c);
            View view = this.f2492c.f2135K;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f2492c;
                fragment5.f2135K.setTag(C0688b.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    mo2880b();
                }
                Fragment fragment6 = this.f2492c;
                if (fragment6.f2127A) {
                    fragment6.f2135K.setVisibility(8);
                }
                if (ViewCompat.m5536S(this.f2492c.f2135K)) {
                    ViewCompat.m5567l0(this.f2492c.f2135K);
                } else {
                    View view2 = this.f2492c.f2135K;
                    view2.addOnAttachStateChangeListener(new C0351a(view2));
                }
                this.f2492c.mo2366H1();
                FragmentLifecycleCallbacksDispatcher mVar = this.f2490a;
                Fragment fragment7 = this.f2492c;
                mVar.mo2741m(fragment7, fragment7.f2135K, fragment7.f2154c, false);
                int visibility = this.f2492c.f2135K.getVisibility();
                float alpha = this.f2492c.f2135K.getAlpha();
                if (FragmentManager.f2397b) {
                    this.f2492c.mo2431e2(alpha);
                    Fragment fragment8 = this.f2492c;
                    if (fragment8.f2134J != null && visibility == 0) {
                        View findFocus = fragment8.f2135K.findFocus();
                        if (findFocus != null) {
                            this.f2492c.mo2410X1(findFocus);
                            if (FragmentManager.m2408G0(2)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("requestFocus: Saved focused view ");
                                sb4.append(findFocus);
                                sb4.append(" for Fragment ");
                                sb4.append(this.f2492c);
                                Log.v(str2, sb4.toString());
                            }
                        }
                        this.f2492c.f2135K.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f2492c;
                    if (visibility == 0 && fragment9.f2134J != null) {
                        z = true;
                    }
                    fragment9.f2140P = z;
                }
            }
            this.f2492c.f2152b = 2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2885g() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f2492c);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2492c;
        boolean z = true;
        boolean z2 = fragment.f2166n && !fragment.mo2475v0();
        if (z2 || this.f2491b.mo2925o().mo2868o(this.f2492c)) {
            FragmentHostCallback<?> kVar = this.f2492c.f2173u;
            if (kVar instanceof ViewModelStoreOwner) {
                z = this.f2491b.mo2925o().mo2865l();
            } else if (kVar.mo2721i() instanceof Activity) {
                z = true ^ ((Activity) kVar.mo2721i()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.f2491b.mo2925o().mo2859f(this.f2492c);
            }
            this.f2492c.mo2466r1();
            this.f2490a.mo2732d(this.f2492c, false);
            for (FragmentStateManager uVar : this.f2491b.mo2921k()) {
                if (uVar != null) {
                    Fragment k = uVar.mo2889k();
                    if (this.f2492c.f2159g.equals(k.f2162j)) {
                        k.f2161i = this.f2492c;
                        k.f2162j = null;
                    }
                }
            }
            Fragment fragment2 = this.f2492c;
            String str = fragment2.f2162j;
            if (str != null) {
                fragment2.f2161i = this.f2491b.mo2916f(str);
            }
            this.f2491b.mo2927q(this);
            return;
        }
        String str2 = this.f2492c.f2162j;
        if (str2 != null) {
            Fragment f = this.f2491b.mo2916f(str2);
            if (f != null && f.f2129C) {
                this.f2492c.f2161i = f;
            }
        }
        this.f2492c.f2152b = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2886h() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f2492c);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2492c;
        ViewGroup viewGroup = fragment.f2134J;
        if (viewGroup != null) {
            View view = fragment.f2135K;
            if (view != null) {
                viewGroup.removeView(view);
            }
        }
        this.f2492c.mo2468s1();
        this.f2490a.mo2742n(this.f2492c, false);
        Fragment fragment2 = this.f2492c;
        fragment2.f2134J = null;
        fragment2.f2135K = null;
        fragment2.f2147W = null;
        fragment2.f2148X.mo2977j(null);
        this.f2492c.f2168p = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo2887i() {
        String str = "FragmentManager";
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f2492c);
            Log.d(str, sb.toString());
        }
        this.f2492c.mo2470t1();
        boolean z = false;
        this.f2490a.mo2733e(this.f2492c, false);
        Fragment fragment = this.f2492c;
        fragment.f2152b = -1;
        fragment.f2173u = null;
        fragment.f2175w = null;
        fragment.f2172t = null;
        if (fragment.f2166n && !fragment.mo2475v0()) {
            z = true;
        }
        if (z || this.f2491b.mo2925o().mo2868o(this.f2492c)) {
            if (FragmentManager.m2408G0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f2492c);
                Log.d(str, sb2.toString());
            }
            this.f2492c.mo2462p0();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2888j() {
        Fragment fragment = this.f2492c;
        if (fragment.f2167o && fragment.f2168p && !fragment.f2170r) {
            if (FragmentManager.m2408G0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f2492c);
                Log.d("FragmentManager", sb.toString());
            }
            Fragment fragment2 = this.f2492c;
            fragment2.mo2464q1(fragment2.mo2473u1(fragment2.f2154c), null, this.f2492c.f2154c);
            View view = this.f2492c.f2135K;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2492c;
                fragment3.f2135K.setTag(C0688b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2492c;
                if (fragment4.f2127A) {
                    fragment4.f2135K.setVisibility(8);
                }
                this.f2492c.mo2366H1();
                FragmentLifecycleCallbacksDispatcher mVar = this.f2490a;
                Fragment fragment5 = this.f2492c;
                mVar.mo2741m(fragment5, fragment5.f2135K, fragment5.f2154c, false);
                this.f2492c.f2152b = 2;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Fragment mo2889k() {
        return this.f2492c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo2890m() {
        String str = "FragmentManager";
        if (this.f2493d) {
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(mo2889k());
                Log.v(str, sb.toString());
            }
            return;
        }
        try {
            this.f2493d = true;
            while (true) {
                int d = mo2882d();
                Fragment fragment = this.f2492c;
                int i = fragment.f2152b;
                if (d != i) {
                    if (d <= i) {
                        switch (i - 1) {
                            case -1:
                                mo2887i();
                                break;
                            case 0:
                                mo2885g();
                                break;
                            case 1:
                                mo2886h();
                                this.f2492c.f2152b = 1;
                                break;
                            case 2:
                                fragment.f2168p = false;
                                fragment.f2152b = 2;
                                break;
                            case 3:
                                if (FragmentManager.m2408G0(3)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("movefrom ACTIVITY_CREATED: ");
                                    sb2.append(this.f2492c);
                                    Log.d(str, sb2.toString());
                                }
                                Fragment fragment2 = this.f2492c;
                                if (fragment2.f2135K != null && fragment2.f2156d == null) {
                                    mo2896t();
                                }
                                Fragment fragment3 = this.f2492c;
                                if (fragment3.f2135K != null) {
                                    ViewGroup viewGroup = fragment3.f2134J;
                                    if (viewGroup != null) {
                                        SpecialEffectsController.m2285n(viewGroup, fragment3.mo2405W()).mo2618d(this);
                                    }
                                }
                                this.f2492c.f2152b = 3;
                                break;
                            case 4:
                                mo2899w();
                                break;
                            case 5:
                                fragment.f2152b = 5;
                                break;
                            case 6:
                                mo2891n();
                                break;
                        }
                    } else {
                        switch (i + 1) {
                            case 0:
                                mo2881c();
                                break;
                            case 1:
                                mo2883e();
                                break;
                            case 2:
                                mo2888j();
                                mo2884f();
                                break;
                            case 3:
                                mo2879a();
                                break;
                            case 4:
                                if (fragment.f2135K != null) {
                                    ViewGroup viewGroup2 = fragment.f2134J;
                                    if (viewGroup2 != null) {
                                        SpecialEffectsController.m2285n(viewGroup2, fragment.mo2405W()).mo2616b(C0318c.m2315b(this.f2492c.f2135K.getVisibility()), this);
                                    }
                                }
                                this.f2492c.f2152b = 4;
                                break;
                            case 5:
                                mo2898v();
                                break;
                            case 6:
                                fragment.f2152b = 6;
                                break;
                            case 7:
                                mo2893p();
                                break;
                        }
                    }
                } else {
                    if (FragmentManager.f2397b && fragment.f2141Q) {
                        if (fragment.f2135K != null) {
                            ViewGroup viewGroup3 = fragment.f2134J;
                            if (viewGroup3 != null) {
                                SpecialEffectsController n = SpecialEffectsController.m2285n(viewGroup3, fragment.mo2405W());
                                if (this.f2492c.f2127A) {
                                    n.mo2617c(this);
                                } else {
                                    n.mo2619e(this);
                                }
                            }
                        }
                        Fragment fragment4 = this.f2492c;
                        FragmentManager nVar = fragment4.f2172t;
                        if (nVar != null) {
                            nVar.mo2751E0(fragment4);
                        }
                        Fragment fragment5 = this.f2492c;
                        fragment5.f2141Q = false;
                        fragment5.mo2397T0(fragment5.f2127A);
                    }
                    return;
                }
            }
        } finally {
            this.f2493d = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo2891n() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f2492c);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2492c.mo2487z1();
        this.f2490a.mo2734f(this.f2492c, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo2892o(ClassLoader classLoader) {
        Bundle bundle = this.f2492c.f2154c;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f2492c;
            fragment.f2156d = fragment.f2154c.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f2492c;
            fragment2.f2157e = fragment2.f2154c.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f2492c;
            fragment3.f2162j = fragment3.f2154c.getString("android:target_state");
            Fragment fragment4 = this.f2492c;
            if (fragment4.f2162j != null) {
                fragment4.f2163k = fragment4.f2154c.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f2492c;
            Boolean bool = fragment5.f2158f;
            if (bool != null) {
                fragment5.f2137M = bool.booleanValue();
                this.f2492c.f2158f = null;
            } else {
                fragment5.f2137M = fragment5.f2154c.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f2492c;
            if (!fragment6.f2137M) {
                fragment6.f2136L = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo2893p() {
        String str = "FragmentManager";
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f2492c);
            Log.d(str, sb.toString());
        }
        View P = this.f2492c.mo2386P();
        if (P != null && m2575l(P)) {
            boolean requestFocus = P.requestFocus();
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(P);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f2492c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f2492c.f2135K.findFocus());
                Log.v(str, sb2.toString());
            }
        }
        this.f2492c.mo2410X1(null);
        this.f2492c.mo2354D1();
        this.f2490a.mo2737i(this.f2492c, false);
        Fragment fragment = this.f2492c;
        fragment.f2154c = null;
        fragment.f2156d = null;
        fragment.f2157e = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public C0286l mo2894r() {
        if (this.f2492c.f2152b <= -1) {
            return null;
        }
        Bundle q = m2576q();
        if (q != null) {
            return new C0286l(q);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public FragmentState mo2895s() {
        FragmentState tVar = new FragmentState(this.f2492c);
        Fragment fragment = this.f2492c;
        if (fragment.f2152b <= -1 || tVar.f2489m != null) {
            tVar.f2489m = fragment.f2154c;
        } else {
            Bundle q = m2576q();
            tVar.f2489m = q;
            if (this.f2492c.f2162j != null) {
                if (q == null) {
                    tVar.f2489m = new Bundle();
                }
                tVar.f2489m.putString("android:target_state", this.f2492c.f2162j);
                int i = this.f2492c.f2163k;
                if (i != 0) {
                    tVar.f2489m.putInt("android:target_req_state", i);
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo2896t() {
        if (this.f2492c.f2135K != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2492c.f2135K.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2492c.f2156d = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f2492c.f2147W.mo2568h(bundle);
            if (!bundle.isEmpty()) {
                this.f2492c.f2157e = bundle;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo2897u(int i) {
        this.f2494e = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo2898v() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f2492c);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2492c.mo2360F1();
        this.f2490a.mo2739k(this.f2492c, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo2899w() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f2492c);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2492c.mo2363G1();
        this.f2490a.mo2740l(this.f2492c, false);
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher mVar, FragmentStore wVar, ClassLoader classLoader, FragmentFactory jVar, FragmentState tVar) {
        this.f2490a = mVar;
        this.f2491b = wVar;
        Fragment a = jVar.mo2719a(classLoader, tVar.f2477a);
        this.f2492c = a;
        Bundle bundle = tVar.f2486j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo2407W1(tVar.f2486j);
        a.f2159g = tVar.f2478b;
        a.f2167o = tVar.f2479c;
        a.f2169q = true;
        a.f2176x = tVar.f2480d;
        a.f2177y = tVar.f2481e;
        a.f2178z = tVar.f2482f;
        a.f2129C = tVar.f2483g;
        a.f2166n = tVar.f2484h;
        a.f2128B = tVar.f2485i;
        a.f2127A = tVar.f2487k;
        a.f2145U = C0378c.values()[tVar.f2488l];
        Bundle bundle2 = tVar.f2489m;
        if (bundle2 != null) {
            a.f2154c = bundle2;
        } else {
            a.f2154c = new Bundle();
        }
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a);
            Log.v("FragmentManager", sb.toString());
        }
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher mVar, FragmentStore wVar, Fragment fragment, FragmentState tVar) {
        this.f2490a = mVar;
        this.f2491b = wVar;
        this.f2492c = fragment;
        fragment.f2156d = null;
        fragment.f2157e = null;
        fragment.f2171s = 0;
        fragment.f2168p = false;
        fragment.f2165m = false;
        Fragment fragment2 = fragment.f2161i;
        fragment.f2162j = fragment2 != null ? fragment2.f2159g : null;
        fragment.f2161i = null;
        Bundle bundle = tVar.f2489m;
        if (bundle != null) {
            fragment.f2154c = bundle;
        } else {
            fragment.f2154c = new Bundle();
        }
    }
}
