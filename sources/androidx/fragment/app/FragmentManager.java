package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.IntentSenderRequest.C0040b;
import androidx.activity.result.p006f.ActivityResultContract;
import androidx.fragment.app.Fragment.C0286l;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.ViewModelStore;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p025d.ArraySet;
import p010b.p034g.p039g.CancellationSignal;
import p010b.p053k.C0688b;

/* renamed from: androidx.fragment.app.n */
public abstract class FragmentManager {

    /* renamed from: a */
    private static boolean f2396a = false;

    /* renamed from: b */
    static boolean f2397b = true;

    /* renamed from: A */
    private SpecialEffectsControllerFactory f2398A = new C0335f();

    /* renamed from: B */
    private ActivityResultLauncher<Intent> f2399B;

    /* renamed from: C */
    private ActivityResultLauncher<IntentSenderRequest> f2400C;

    /* renamed from: D */
    private ActivityResultLauncher<String[]> f2401D;

    /* renamed from: E */
    ArrayDeque<C0342m> f2402E = new ArrayDeque<>();

    /* renamed from: F */
    private boolean f2403F;

    /* renamed from: G */
    private boolean f2404G;

    /* renamed from: H */
    private boolean f2405H;

    /* renamed from: I */
    private boolean f2406I;

    /* renamed from: J */
    private boolean f2407J;

    /* renamed from: K */
    private ArrayList<BackStackRecord> f2408K;

    /* renamed from: L */
    private ArrayList<Boolean> f2409L;

    /* renamed from: M */
    private ArrayList<Fragment> f2410M;

    /* renamed from: N */
    private ArrayList<C0347q> f2411N;

    /* renamed from: O */
    private FragmentManagerViewModel f2412O;

    /* renamed from: P */
    private Runnable f2413P = new C0336g();

    /* renamed from: c */
    private final ArrayList<C0345o> f2414c = new ArrayList<>();

    /* renamed from: d */
    private boolean f2415d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final FragmentStore f2416e = new FragmentStore();

    /* renamed from: f */
    ArrayList<BackStackRecord> f2417f;

    /* renamed from: g */
    private ArrayList<Fragment> f2418g;

    /* renamed from: h */
    private final FragmentLayoutInflaterFactory f2419h = new FragmentLayoutInflaterFactory(this);

    /* renamed from: i */
    private OnBackPressedDispatcher f2420i;

    /* renamed from: j */
    private final OnBackPressedCallback f2421j = new C0332c(false);

    /* renamed from: k */
    private final AtomicInteger f2422k = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Map<String, Bundle> f2423l = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<String, ?> f2424m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private ArrayList<C0344n> f2425n;

    /* renamed from: o */
    private Map<Fragment, HashSet<CancellationSignal>> f2426o = Collections.synchronizedMap(new HashMap());

    /* renamed from: p */
    private final C0360g f2427p = new C0333d();

    /* renamed from: q */
    private final FragmentLifecycleCallbacksDispatcher f2428q = new FragmentLifecycleCallbacksDispatcher(this);

    /* renamed from: r */
    private final CopyOnWriteArrayList<FragmentOnAttachListener> f2429r = new CopyOnWriteArrayList<>();

    /* renamed from: s */
    int f2430s = -1;

    /* renamed from: t */
    private FragmentHostCallback<?> f2431t;

    /* renamed from: u */
    private FragmentContainer f2432u;

    /* renamed from: v */
    private Fragment f2433v;

    /* renamed from: w */
    Fragment f2434w;

    /* renamed from: x */
    private FragmentFactory f2435x = null;

    /* renamed from: y */
    private FragmentFactory f2436y = new C0334e();

    /* renamed from: z */
    private SpecialEffectsControllerFactory f2437z = null;

    /* renamed from: androidx.fragment.app.n$a */
    /* compiled from: FragmentManager */
    class C0330a implements ActivityResultCallback<ActivityResult> {
        C0330a() {
        }

        /* renamed from: b */
        public void mo193a(ActivityResult aVar) {
            C0342m mVar = (C0342m) FragmentManager.this.f2402E.pollFirst();
            String str = "FragmentManager";
            if (mVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
                Log.w(str, sb.toString());
                return;
            }
            String str2 = mVar.f2452a;
            int i = mVar.f2453b;
            Fragment i2 = FragmentManager.this.f2416e.mo2919i(str2);
            if (i2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Intent Sender result delivered for unknown Fragment ");
                sb2.append(str2);
                Log.w(str, sb2.toString());
                return;
            }
            i2.mo2356E0(i, aVar.mo186m(), aVar.mo185l());
        }
    }

    /* renamed from: androidx.fragment.app.n$b */
    /* compiled from: FragmentManager */
    class C0331b implements ActivityResultCallback<Map<String, Boolean>> {
        C0331b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo193a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C0342m mVar = (C0342m) FragmentManager.this.f2402E.pollFirst();
            String str = "FragmentManager";
            if (mVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
                Log.w(str, sb.toString());
                return;
            }
            String str2 = mVar.f2452a;
            int i2 = mVar.f2453b;
            Fragment i3 = FragmentManager.this.f2416e.mo2919i(str2);
            if (i3 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Permission request result delivered for unknown Fragment ");
                sb2.append(str2);
                Log.w(str, sb2.toString());
                return;
            }
            i3.mo2427d1(i2, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.n$c */
    /* compiled from: FragmentManager */
    class C0332c extends OnBackPressedCallback {
        C0332c(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo164b() {
            FragmentManager.this.mo2747C0();
        }
    }

    /* renamed from: androidx.fragment.app.n$d */
    /* compiled from: FragmentManager */
    class C0333d implements C0360g {
        C0333d() {
        }

        /* renamed from: a */
        public void mo2833a(Fragment fragment, CancellationSignal bVar) {
            if (!bVar.mo4871b()) {
                FragmentManager.this.mo2787b1(fragment, bVar);
            }
        }

        /* renamed from: b */
        public void mo2834b(Fragment fragment, CancellationSignal bVar) {
            FragmentManager.this.mo2792f(fragment, bVar);
        }
    }

    /* renamed from: androidx.fragment.app.n$e */
    /* compiled from: FragmentManager */
    class C0334e extends FragmentFactory {
        C0334e() {
        }

        /* renamed from: a */
        public Fragment mo2719a(ClassLoader classLoader, String str) {
            return FragmentManager.this.mo2822u0().mo2677e(FragmentManager.this.mo2822u0().mo2721i(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.n$f */
    /* compiled from: FragmentManager */
    class C0335f implements SpecialEffectsControllerFactory {
        C0335f() {
        }

        /* renamed from: a */
        public SpecialEffectsController mo2668a(ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.n$g */
    /* compiled from: FragmentManager */
    class C0336g implements Runnable {
        C0336g() {
        }

        public void run() {
            FragmentManager.this.mo2786b0(true);
        }
    }

    /* renamed from: androidx.fragment.app.n$h */
    /* compiled from: FragmentManager */
    class C0337h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2445a;

        /* renamed from: b */
        final /* synthetic */ View f2446b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2447c;

        C0337h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2445a = viewGroup;
            this.f2446b = view;
            this.f2447c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2445a.endViewTransition(this.f2446b);
            animator.removeListener(this);
            Fragment fragment = this.f2447c;
            View view = fragment.f2135K;
            if (view != null && fragment.f2127A) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$i */
    /* compiled from: FragmentManager */
    class C0338i implements FragmentOnAttachListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f2449a;

        C0338i(Fragment fragment) {
            this.f2449a = fragment;
        }

        /* renamed from: a */
        public void mo2661a(FragmentManager nVar, Fragment fragment) {
            this.f2449a.mo2365H0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.n$j */
    /* compiled from: FragmentManager */
    class C0339j implements ActivityResultCallback<ActivityResult> {
        C0339j() {
        }

        /* renamed from: b */
        public void mo193a(ActivityResult aVar) {
            C0342m mVar = (C0342m) FragmentManager.this.f2402E.pollFirst();
            String str = "FragmentManager";
            if (mVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
                Log.w(str, sb.toString());
                return;
            }
            String str2 = mVar.f2452a;
            int i = mVar.f2453b;
            Fragment i2 = FragmentManager.this.f2416e.mo2919i(str2);
            if (i2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity result delivered for unknown Fragment ");
                sb2.append(str2);
                Log.w(str, sb2.toString());
                return;
            }
            i2.mo2356E0(i, aVar.mo186m(), aVar.mo185l());
        }
    }

    /* renamed from: androidx.fragment.app.n$k */
    /* compiled from: FragmentManager */
    static class C0340k extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        C0340k() {
        }

        /* renamed from: d */
        public Intent mo208a(Context context, IntentSenderRequest eVar) {
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent l = eVar.mo196l();
            if (l != null) {
                String str = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
                Bundle bundleExtra = l.getBundleExtra(str);
                if (bundleExtra != null) {
                    intent.putExtra(str, bundleExtra);
                    l.removeExtra(str);
                    if (l.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        eVar = new C0040b(eVar.mo199o()).mo206b(null).mo207c(eVar.mo198n(), eVar.mo197m()).mo205a();
                    }
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
                Log.v("FragmentManager", sb.toString());
            }
            return intent;
        }

        /* renamed from: e */
        public ActivityResult mo210c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.n$l */
    /* compiled from: FragmentManager */
    public static abstract class C0341l {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.n$m */
    /* compiled from: FragmentManager */
    static class C0342m implements Parcelable {
        public static final Creator<C0342m> CREATOR = new C0343a();

        /* renamed from: a */
        String f2452a;

        /* renamed from: b */
        int f2453b;

        /* renamed from: androidx.fragment.app.n$m$a */
        /* compiled from: FragmentManager */
        class C0343a implements Creator<C0342m> {
            C0343a() {
            }

            /* renamed from: a */
            public C0342m createFromParcel(Parcel parcel) {
                return new C0342m(parcel);
            }

            /* renamed from: b */
            public C0342m[] newArray(int i) {
                return new C0342m[i];
            }
        }

        C0342m(String str, int i) {
            this.f2452a = str;
            this.f2453b = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2452a);
            parcel.writeInt(this.f2453b);
        }

        C0342m(Parcel parcel) {
            this.f2452a = parcel.readString();
            this.f2453b = parcel.readInt();
        }
    }

    /* renamed from: androidx.fragment.app.n$n */
    /* compiled from: FragmentManager */
    public interface C0344n {
        /* renamed from: a */
        void mo2846a();
    }

    /* renamed from: androidx.fragment.app.n$o */
    /* compiled from: FragmentManager */
    interface C0345o {
        /* renamed from: a */
        boolean mo2515a(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.n$p */
    /* compiled from: FragmentManager */
    private class C0346p implements C0345o {

        /* renamed from: a */
        final String f2454a;

        /* renamed from: b */
        final int f2455b;

        /* renamed from: c */
        final int f2456c;

        C0346p(String str, int i, int i2) {
            this.f2454a = str;
            this.f2455b = i;
            this.f2456c = i2;
        }

        /* renamed from: a */
        public boolean mo2515a(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f2434w;
            if (fragment != null && this.f2455b < 0 && this.f2454a == null && fragment.mo2364H().mo2781W0()) {
                return false;
            }
            return FragmentManager.this.mo2783Y0(arrayList, arrayList2, this.f2454a, this.f2455b, this.f2456c);
        }
    }

    /* renamed from: androidx.fragment.app.n$q */
    /* compiled from: FragmentManager */
    static class C0347q implements C0285k {

        /* renamed from: a */
        final boolean f2458a;

        /* renamed from: b */
        final BackStackRecord f2459b;

        /* renamed from: c */
        private int f2460c;

        C0347q(BackStackRecord aVar, boolean z) {
            this.f2458a = z;
            this.f2459b = aVar;
        }

        /* renamed from: a */
        public void mo2496a() {
            int i = this.f2460c - 1;
            this.f2460c = i;
            if (i == 0) {
                this.f2459b.f2224t.mo2805k1();
            }
        }

        /* renamed from: b */
        public void mo2497b() {
            this.f2460c++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2847c() {
            BackStackRecord aVar = this.f2459b;
            aVar.f2224t.mo2821u(aVar, this.f2458a, false, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo2848d() {
            boolean z = this.f2460c > 0;
            for (Fragment fragment : this.f2459b.f2224t.mo2819t0()) {
                fragment.mo2425c2(null);
                if (z && fragment.mo2481x0()) {
                    fragment.mo2451k2();
                }
            }
            BackStackRecord aVar = this.f2459b;
            aVar.f2224t.mo2821u(aVar, this.f2458a, !z, true);
        }

        /* renamed from: e */
        public boolean mo2849e() {
            return this.f2460c == 0;
        }
    }

    /* renamed from: A0 */
    static Fragment m2407A0(View view) {
        Object tag = view.getTag(C0688b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: G0 */
    static boolean m2408G0(int i) {
        return f2396a || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: H0 */
    private boolean m2409H0(Fragment fragment) {
        return (fragment.f2131G && fragment.f2132H) || fragment.f2174v.mo2812o();
    }

    /* renamed from: M */
    private void m2410M(Fragment fragment) {
        if (fragment != null && fragment.equals(mo2794g0(fragment.f2159g))) {
            fragment.mo2351C1();
        }
    }

    /* renamed from: N0 */
    private void m2411N0(ArraySet<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.mo4402i(i);
            if (!fragment.f2165m) {
                View P1 = fragment.mo2388P1();
                fragment.f2142R = P1.getAlpha();
                P1.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: T */
    private void m2412T(int i) {
        try {
            this.f2415d = true;
            this.f2416e.mo2914d(i);
            mo2769P0(i, false);
            if (f2397b) {
                for (SpecialEffectsController j : m2438s()) {
                    j.mo2621j();
                }
            }
            this.f2415d = false;
            mo2786b0(true);
        } catch (Throwable th) {
            this.f2415d = false;
            throw th;
        }
    }

    /* renamed from: W */
    private void m2413W() {
        if (this.f2407J) {
            this.f2407J = false;
            m2436q1();
        }
    }

    /* renamed from: X0 */
    private boolean m2414X0(String str, int i, int i2) {
        mo2786b0(false);
        m2418a0(true);
        Fragment fragment = this.f2434w;
        if (fragment != null && i < 0 && str == null && fragment.mo2364H().mo2781W0()) {
            return true;
        }
        boolean Y0 = mo2783Y0(this.f2408K, this.f2409L, str, i, i2);
        if (Y0) {
            this.f2415d = true;
            try {
                m2423d1(this.f2408K, this.f2409L);
            } finally {
                m2434q();
            }
        }
        m2439s1();
        m2413W();
        this.f2416e.mo2912b();
        return Y0;
    }

    /* renamed from: Y */
    private void m2415Y() {
        if (f2397b) {
            for (SpecialEffectsController j : m2438s()) {
                j.mo2621j();
            }
        } else if (!this.f2426o.isEmpty()) {
            for (Fragment fragment : this.f2426o.keySet()) {
                m2430n(fragment);
                mo2771Q0(fragment);
            }
        }
    }

    /* renamed from: Z0 */
    private int m2416Z0(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, ArraySet<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            BackStackRecord aVar = (BackStackRecord) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (aVar.mo2511G() && !aVar.mo2510E(arrayList, i4 + 1, i2)) {
                if (this.f2411N == null) {
                    this.f2411N = new ArrayList<>();
                }
                C0347q qVar = new C0347q(aVar, booleanValue);
                this.f2411N.add(qVar);
                aVar.mo2513I(qVar);
                if (booleanValue) {
                    aVar.mo2529z();
                } else {
                    aVar.mo2506A(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m2421d(bVar);
            }
        }
        return i3;
    }

    /* renamed from: a0 */
    private void m2418a0(boolean z) {
        if (this.f2415d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2431t == null) {
            if (this.f2406I) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f2431t.mo2722k().getLooper()) {
            if (!z) {
                m2433p();
            }
            if (this.f2408K == null) {
                this.f2408K = new ArrayList<>();
                this.f2409L = new ArrayList<>();
            }
            this.f2415d = true;
            try {
                m2425f0(null, null);
            } finally {
                this.f2415d = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: d */
    private void m2421d(ArraySet<Fragment> bVar) {
        int i = this.f2430s;
        if (i >= 1) {
            int min = Math.min(i, 5);
            for (Fragment fragment : this.f2416e.mo2924n()) {
                if (fragment.f2152b < min) {
                    mo2773R0(fragment, min);
                    if (fragment.f2135K != null && !fragment.f2127A && fragment.f2140P) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: d0 */
    private static void m2422d0(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            BackStackRecord aVar = (BackStackRecord) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                aVar.mo2525v(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo2506A(z);
            } else {
                aVar.mo2525v(1);
                aVar.mo2529z();
            }
            i++;
        }
    }

    /* renamed from: d1 */
    private void m2423d1(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m2425f0(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((BackStackRecord) arrayList.get(i)).f2525r) {
                        if (i2 != i) {
                            m2424e0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((BackStackRecord) arrayList.get(i2)).f2525r) {
                                i2++;
                            }
                        }
                        m2424e0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m2424e0(arrayList, arrayList2, i2, size);
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2424e0(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.BackStackRecord) r0
            boolean r2 = r0.f2525r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f2410M
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f2410M = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f2410M
            androidx.fragment.app.w r1 = r6.f2416e
            java.util.List r1 = r1.mo2924n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.mo2828y0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.BackStackRecord) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f2410M
            androidx.fragment.app.Fragment r0 = r8.mo2507B(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f2410M
            androidx.fragment.app.Fragment r0 = r8.mo2514J(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f2516i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f2410M
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f2430s
            if (r0 < r14) goto L_0x00bd
            boolean r0 = f2397b
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.BackStackRecord) r1
            java.util.ArrayList<androidx.fragment.app.x$a> r1 = r1.f2510c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.x$a r7 = (androidx.fragment.app.FragmentTransaction.C0353a) r7
            androidx.fragment.app.Fragment r7 = r7.f2528b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.n r8 = r7.f2172t
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.u r7 = r6.mo2824w(r7)
            androidx.fragment.app.w r8 = r6.f2416e
            r8.mo2926p(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.k<?> r0 = r6.f2431t
            android.content.Context r7 = r0.mo2721i()
            androidx.fragment.app.g r8 = r6.f2432u
            r13 = 0
            androidx.fragment.app.y$g r0 = r6.f2427p
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.FragmentTransition.m2652B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            m2422d0(r18, r19, r20, r21)
            boolean r0 = f2397b
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.BackStackRecord) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.x$a> r8 = r7.f2510c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.x$a> r9 = r7.f2510c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.x$a r9 = (androidx.fragment.app.FragmentTransaction.C0353a) r9
            androidx.fragment.app.Fragment r9 = r9.f2528b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.u r9 = r6.mo2824w(r9)
            r9.mo2890m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.x$a> r7 = r7.f2510c
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.x$a r8 = (androidx.fragment.app.FragmentTransaction.C0353a) r8
            androidx.fragment.app.Fragment r8 = r8.f2528b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.u r8 = r6.mo2824w(r8)
            r8.mo2890m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f2430s
            r6.mo2769P0(r2, r1)
            java.util.Set r1 = r6.m2440t(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.d0 r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.mo2626r(r0)
            r2.mo2625p()
            r2.mo2620g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            b.d.b r7 = new b.d.b
            r7.<init>()
            r6.m2421d(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.m2416Z0(r1, r2, r3, r4, r5)
            r6.m2411N0(r7)
            goto L_0x016b
        L_0x0165:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f2430s
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.k<?> r1 = r6.f2431t
            android.content.Context r7 = r1.mo2721i()
            androidx.fragment.app.g r8 = r6.f2432u
            r1 = 1
            androidx.fragment.app.y$g r2 = r6.f2427p
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.FragmentTransition.m2652B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x0191:
            int r2 = r6.f2430s
            r6.mo2769P0(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.f2226v
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.f2226v = r4
        L_0x01b6:
            r2.mo2512H()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.m2426f1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m2424e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: f0 */
    private void m2425f0(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        ArrayList<C0347q> arrayList3 = this.f2411N;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0347q qVar = (C0347q) this.f2411N.get(i);
            if (arrayList != null && !qVar.f2458a) {
                int indexOf = arrayList.indexOf(qVar.f2459b);
                if (!(indexOf == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf)).booleanValue())) {
                    this.f2411N.remove(i);
                    i--;
                    size--;
                    qVar.mo2847c();
                    i++;
                }
            }
            if (qVar.mo2849e() || (arrayList != null && qVar.f2459b.mo2510E(arrayList, 0, arrayList.size()))) {
                this.f2411N.remove(i);
                i--;
                size--;
                if (arrayList != null && !qVar.f2458a) {
                    int indexOf2 = arrayList.indexOf(qVar.f2459b);
                    if (!(indexOf2 == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf2)).booleanValue())) {
                        qVar.mo2847c();
                    }
                }
                qVar.mo2848d();
            }
            i++;
        }
    }

    /* renamed from: f1 */
    private void m2426f1() {
        if (this.f2425n != null) {
            for (int i = 0; i < this.f2425n.size(); i++) {
                ((C0344n) this.f2425n.get(i)).mo2846a();
            }
        }
    }

    /* renamed from: h1 */
    static int m2427h1(int i) {
        if (i == 4097) {
            return C3149a.f17201q;
        }
        if (i == 4099) {
            return C3149a.f17187c;
        }
        if (i != 8194) {
            return 0;
        }
        return C3149a.f17185a;
    }

    /* renamed from: k0 */
    private void m2428k0() {
        if (f2397b) {
            for (SpecialEffectsController k : m2438s()) {
                k.mo2622k();
            }
        } else if (this.f2411N != null) {
            while (!this.f2411N.isEmpty()) {
                ((C0347q) this.f2411N.remove(0)).mo2848d();
            }
        }
    }

    /* renamed from: l0 */
    private boolean m2429l0(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2414c) {
            if (this.f2414c.isEmpty()) {
                return false;
            }
            boolean z = false;
            for (int i = 0; i < this.f2414c.size(); i++) {
                z |= ((C0345o) this.f2414c.get(i)).mo2515a(arrayList, arrayList2);
            }
            this.f2414c.clear();
            this.f2431t.mo2722k().removeCallbacks(this.f2413P);
            return z;
        }
    }

    /* renamed from: n */
    private void m2430n(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f2426o.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).mo4870a();
            }
            hashSet.clear();
            m2442x(fragment);
            this.f2426o.remove(fragment);
        }
    }

    /* renamed from: n0 */
    private FragmentManagerViewModel m2431n0(Fragment fragment) {
        return this.f2412O.mo2861h(fragment);
    }

    /* renamed from: o1 */
    private void m2432o1(Fragment fragment) {
        ViewGroup q0 = m2435q0(fragment);
        if (q0 != null && fragment.mo2369J() + fragment.mo2377M() + fragment.mo2411Y() + fragment.mo2414Z() > 0) {
            int i = C0688b.visible_removing_fragment_view_tag;
            if (q0.getTag(i) == null) {
                q0.setTag(i, fragment);
            }
            ((Fragment) q0.getTag(i)).mo2428d2(fragment.mo2408X());
        }
    }

    /* renamed from: p */
    private void m2433p() {
        if (mo2763L0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: q */
    private void m2434q() {
        this.f2415d = false;
        this.f2409L.clear();
        this.f2408K.clear();
    }

    /* renamed from: q0 */
    private ViewGroup m2435q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2134J;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f2177y > 0 && this.f2432u.mo2492g()) {
            View f = this.f2432u.mo2491f(fragment.f2177y);
            if (f instanceof ViewGroup) {
                return (ViewGroup) f;
            }
        }
        return null;
    }

    /* renamed from: q1 */
    private void m2436q1() {
        for (FragmentStateManager U0 : this.f2416e.mo2921k()) {
            mo2778U0(U0);
        }
    }

    /* renamed from: r1 */
    private void m2437r1(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter(str));
        FragmentHostCallback<?> kVar = this.f2431t;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (kVar != null) {
            try {
                kVar.mo2662l(str3, null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(str, str2, e);
            }
        } else {
            try {
                mo2782X(str3, null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(str, str2, e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: s */
    private Set<SpecialEffectsController> m2438s() {
        HashSet hashSet = new HashSet();
        for (FragmentStateManager k : this.f2416e.mo2921k()) {
            ViewGroup viewGroup = k.mo2889k().f2134J;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m2286o(viewGroup, mo2830z0()));
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo2809m0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo2759J0(r3.f2433v) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo168f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f2421j;
     */
    /* renamed from: s1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2439s1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n$o> r0 = r3.f2414c
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n$o> r1 = r3.f2414c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f2421j     // Catch:{ all -> 0x002a }
            r1.mo168f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f2421j
            int r1 = r3.mo2809m0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f2433v
            boolean r1 = r3.mo2759J0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo168f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m2439s1():void");
    }

    /* renamed from: t */
    private Set<SpecialEffectsController> m2440t(ArrayList<BackStackRecord> arrayList, int i, int i2) {
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((BackStackRecord) arrayList.get(i)).f2510c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((C0353a) it.next()).f2528b;
                if (fragment != null) {
                    ViewGroup viewGroup = fragment.f2134J;
                    if (viewGroup != null) {
                        hashSet.add(SpecialEffectsController.m2285n(viewGroup, this));
                    }
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: v */
    private void m2441v(Fragment fragment) {
        if (fragment.f2135K != null) {
            C0326d c = FragmentAnim.m2346c(this.f2431t.mo2721i(), fragment, !fragment.f2127A, fragment.mo2408X());
            if (c != null) {
                Animator animator = c.f2372b;
                if (animator != null) {
                    animator.setTarget(fragment.f2135K);
                    if (!fragment.f2127A) {
                        fragment.f2135K.setVisibility(0);
                    } else if (fragment.mo2472u0()) {
                        fragment.mo2413Y1(false);
                    } else {
                        ViewGroup viewGroup = fragment.f2134J;
                        View view = fragment.f2135K;
                        viewGroup.startViewTransition(view);
                        c.f2372b.addListener(new C0337h(viewGroup, view, fragment));
                    }
                    c.f2372b.start();
                }
            }
            if (c != null) {
                fragment.f2135K.startAnimation(c.f2371a);
                c.f2371a.start();
            }
            fragment.f2135K.setVisibility((!fragment.f2127A || fragment.mo2472u0()) ? 0 : 8);
            if (fragment.mo2472u0()) {
                fragment.mo2413Y1(false);
            }
        }
        mo2751E0(fragment);
        fragment.f2141Q = false;
        fragment.mo2397T0(fragment.f2127A);
    }

    /* renamed from: x */
    private void m2442x(Fragment fragment) {
        fragment.mo2468s1();
        this.f2428q.mo2742n(fragment, false);
        fragment.f2134J = null;
        fragment.f2135K = null;
        fragment.f2147W = null;
        fragment.f2148X.mo2977j(null);
        fragment.f2168p = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo2743A() {
        this.f2404G = false;
        this.f2405H = false;
        this.f2412O.mo2867n(false);
        m2412T(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo2744B(Configuration configuration) {
        for (Fragment fragment : this.f2416e.mo2924n()) {
            if (fragment != null) {
                fragment.mo2455m1(configuration);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B0 */
    public ViewModelStore mo2745B0(Fragment fragment) {
        return this.f2412O.mo2864k(fragment);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public boolean mo2746C(MenuItem menuItem) {
        if (this.f2430s < 1) {
            return false;
        }
        for (Fragment fragment : this.f2416e.mo2924n()) {
            if (fragment != null && fragment.mo2457n1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C0 */
    public void mo2747C0() {
        mo2786b0(true);
        if (this.f2421j.mo165c()) {
            mo2781W0();
        } else {
            this.f2420i.mo161c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo2748D() {
        this.f2404G = false;
        this.f2405H = false;
        this.f2412O.mo2867n(false);
        m2412T(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D0 */
    public void mo2749D0(Fragment fragment) {
        if (m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.f2127A) {
            fragment.f2127A = true;
            fragment.f2141Q = true ^ fragment.f2141Q;
            m2432o1(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public boolean mo2750E(Menu menu, MenuInflater menuInflater) {
        if (this.f2430s < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f2416e.mo2924n()) {
            if (fragment != null && mo2757I0(fragment) && fragment.mo2463p1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2418g != null) {
            for (int i = 0; i < this.f2418g.size(); i++) {
                Fragment fragment2 = (Fragment) this.f2418g.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.mo2387P0();
                }
            }
        }
        this.f2418g = arrayList;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E0 */
    public void mo2751E0(Fragment fragment) {
        if (fragment.f2165m && m2409H0(fragment)) {
            this.f2403F = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public void mo2752F() {
        this.f2406I = true;
        mo2786b0(true);
        m2415Y();
        m2412T(-1);
        this.f2431t = null;
        this.f2432u = null;
        this.f2433v = null;
        if (this.f2420i != null) {
            this.f2421j.mo166d();
            this.f2420i = null;
        }
        ActivityResultLauncher<Intent> cVar = this.f2399B;
        if (cVar != null) {
            cVar.mo181c();
            this.f2400C.mo181c();
            this.f2401D.mo181c();
        }
    }

    /* renamed from: F0 */
    public boolean mo2753F0() {
        return this.f2406I;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo2754G() {
        m2412T(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo2755H() {
        for (Fragment fragment : this.f2416e.mo2924n()) {
            if (fragment != null) {
                fragment.mo2476v1();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public void mo2756I(boolean z) {
        for (Fragment fragment : this.f2416e.mo2924n()) {
            if (fragment != null) {
                fragment.mo2479w1(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I0 */
    public boolean mo2757I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.mo2478w0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public void mo2758J(Fragment fragment) {
        Iterator it = this.f2429r.iterator();
        while (it.hasNext()) {
            ((FragmentOnAttachListener) it.next()).mo2661a(this, fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J0 */
    public boolean mo2759J0(Fragment fragment) {
        boolean z = true;
        if (fragment == null) {
            return true;
        }
        FragmentManager nVar = fragment.f2172t;
        if (!fragment.equals(nVar.mo2828y0()) || !mo2759J0(nVar.f2433v)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public boolean mo2760K(MenuItem menuItem) {
        if (this.f2430s < 1) {
            return false;
        }
        for (Fragment fragment : this.f2416e.mo2924n()) {
            if (fragment != null && fragment.mo2482x1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K0 */
    public boolean mo2761K0(int i) {
        return this.f2430s >= i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public void mo2762L(Menu menu) {
        if (this.f2430s >= 1) {
            for (Fragment fragment : this.f2416e.mo2924n()) {
                if (fragment != null) {
                    fragment.mo2484y1(menu);
                }
            }
        }
    }

    /* renamed from: L0 */
    public boolean mo2763L0() {
        return this.f2404G || this.f2405H;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M0 */
    public void mo2764M0(Fragment fragment, String[] strArr, int i) {
        if (this.f2401D != null) {
            this.f2402E.addLast(new C0342m(fragment.f2159g, i));
            this.f2401D.mo194a(strArr);
            return;
        }
        this.f2431t.mo2723o(fragment, strArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo2765N() {
        m2412T(5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public void mo2766O(boolean z) {
        for (Fragment fragment : this.f2416e.mo2924n()) {
            if (fragment != null) {
                fragment.mo2345A1(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O0 */
    public void mo2767O0(Fragment fragment) {
        if (!this.f2416e.mo2913c(fragment.f2159g)) {
            if (m2408G0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring moving ");
                sb.append(fragment);
                sb.append(" to state ");
                sb.append(this.f2430s);
                sb.append("since it is not added to ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            return;
        }
        mo2771Q0(fragment);
        View view = fragment.f2135K;
        if (!(view == null || !fragment.f2140P || fragment.f2134J == null)) {
            float f = fragment.f2142R;
            if (f > 0.0f) {
                view.setAlpha(f);
            }
            fragment.f2142R = 0.0f;
            fragment.f2140P = false;
            C0326d c = FragmentAnim.m2346c(this.f2431t.mo2721i(), fragment, true, fragment.mo2408X());
            if (c != null) {
                Animation animation = c.f2371a;
                if (animation != null) {
                    fragment.f2135K.startAnimation(animation);
                } else {
                    c.f2372b.setTarget(fragment.f2135K);
                    c.f2372b.start();
                }
            }
        }
        if (fragment.f2141Q) {
            m2441v(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public boolean mo2768P(Menu menu) {
        boolean z = false;
        if (this.f2430s < 1) {
            return false;
        }
        for (Fragment fragment : this.f2416e.mo2924n()) {
            if (fragment != null && mo2757I0(fragment) && fragment.mo2348B1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P0 */
    public void mo2769P0(int i, boolean z) {
        if (this.f2431t == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2430s) {
            this.f2430s = i;
            if (f2397b) {
                this.f2416e.mo2928r();
            } else {
                for (Fragment O0 : this.f2416e.mo2924n()) {
                    mo2767O0(O0);
                }
                for (FragmentStateManager uVar : this.f2416e.mo2921k()) {
                    Fragment k = uVar.mo2889k();
                    if (!k.f2140P) {
                        mo2767O0(k);
                    }
                    if (k.f2166n && !k.mo2475v0()) {
                        this.f2416e.mo2927q(uVar);
                    }
                }
            }
            m2436q1();
            if (this.f2403F) {
                FragmentHostCallback<?> kVar = this.f2431t;
                if (kVar != null && this.f2430s == 7) {
                    kVar.mo2666s();
                    this.f2403F = false;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public void mo2770Q() {
        m2439s1();
        m2410M(this.f2434w);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q0 */
    public void mo2771Q0(Fragment fragment) {
        mo2773R0(fragment, this.f2430s);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public void mo2772R() {
        this.f2404G = false;
        this.f2405H = false;
        this.f2412O.mo2867n(false);
        m2412T(7);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160  */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2773R0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            androidx.fragment.app.w r0 = r10.f2416e
            java.lang.String r1 = r11.f2159g
            androidx.fragment.app.u r0 = r0.mo2923m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.u r0 = new androidx.fragment.app.u
            androidx.fragment.app.m r2 = r10.f2428q
            androidx.fragment.app.w r3 = r10.f2416e
            r0.<init>(r2, r3, r11)
            r0.mo2897u(r1)
        L_0x0017:
            boolean r2 = r11.f2167o
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.f2168p
            if (r2 == 0) goto L_0x0028
            int r2 = r11.f2152b
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.mo2882d()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.f2152b
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<b.g.g.b>> r2 = r10.f2426o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.m2430n(r11)
        L_0x0047:
            int r2 = r11.f2152b
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0164
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.mo2881c()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.mo2883e()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.mo2888j()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.mo2884f()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.mo2879a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.mo2898v()
        L_0x0075:
            if (r12 <= r7) goto L_0x0164
            r0.mo2893p()
            goto L_0x0164
        L_0x007c:
            if (r2 <= r12) goto L_0x0164
            if (r2 == 0) goto L_0x015d
            if (r2 == r1) goto L_0x014f
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0164
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.mo2891n()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.mo2899w()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = m2408G0(r4)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x00b3:
            android.view.View r2 = r11.f2135K
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.k<?> r2 = r10.f2431t
            boolean r2 = r2.mo2665q(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.f2156d
            if (r2 != 0) goto L_0x00c6
            r0.mo2896t()
        L_0x00c6:
            if (r12 >= r3) goto L_0x014f
            r2 = 0
            android.view.View r7 = r11.f2135K
            if (r7 == 0) goto L_0x0144
            android.view.ViewGroup r8 = r11.f2134J
            if (r8 == 0) goto L_0x0144
            r8.endViewTransition(r7)
            android.view.View r7 = r11.f2135K
            r7.clearAnimation()
            boolean r7 = r11.mo2486z0()
            if (r7 != 0) goto L_0x0144
            int r7 = r10.f2430s
            r8 = 0
            if (r7 <= r6) goto L_0x0105
            boolean r6 = r10.f2406I
            if (r6 != 0) goto L_0x0105
            android.view.View r6 = r11.f2135K
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0105
            float r6 = r11.f2142R
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0105
            androidx.fragment.app.k<?> r2 = r10.f2431t
            android.content.Context r2 = r2.mo2721i()
            r6 = 0
            boolean r7 = r11.mo2408X()
            androidx.fragment.app.f$d r2 = androidx.fragment.app.FragmentAnim.m2346c(r2, r11, r6, r7)
        L_0x0105:
            r11.f2142R = r8
            android.view.ViewGroup r6 = r11.f2134J
            android.view.View r7 = r11.f2135K
            if (r2 == 0) goto L_0x0112
            androidx.fragment.app.y$g r8 = r10.f2427p
            androidx.fragment.app.FragmentAnim.m2344a(r11, r2, r8)
        L_0x0112:
            r6.removeView(r7)
            boolean r2 = m2408G0(r3)
            if (r2 == 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L_0x013f:
            android.view.ViewGroup r2 = r11.f2134J
            if (r6 == r2) goto L_0x0144
            return
        L_0x0144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<b.g.g.b>> r2 = r10.f2426o
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x014f
            r0.mo2886h()
        L_0x014f:
            if (r12 >= r1) goto L_0x015d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<b.g.g.b>> r2 = r10.f2426o
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            r0.mo2885g()
        L_0x015d:
            r1 = r12
        L_0x015e:
            if (r1 >= 0) goto L_0x0163
            r0.mo2887i()
        L_0x0163:
            r12 = r1
        L_0x0164:
            int r0 = r11.f2152b
            if (r0 == r12) goto L_0x0196
            boolean r0 = m2408G0(r4)
            if (r0 == 0) goto L_0x0194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.f2152b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x0194:
            r11.f2152b = r12
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo2773R0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S */
    public void mo2774S() {
        this.f2404G = false;
        this.f2405H = false;
        this.f2412O.mo2867n(false);
        m2412T(5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S0 */
    public void mo2775S0() {
        if (this.f2431t != null) {
            this.f2404G = false;
            this.f2405H = false;
            this.f2412O.mo2867n(false);
            for (Fragment fragment : this.f2416e.mo2924n()) {
                if (fragment != null) {
                    fragment.mo2350C0();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T0 */
    public void mo2776T0(FragmentContainerView hVar) {
        for (FragmentStateManager uVar : this.f2416e.mo2921k()) {
            Fragment k = uVar.mo2889k();
            if (k.f2177y == hVar.getId()) {
                View view = k.f2135K;
                if (view != null && view.getParent() == null) {
                    k.f2134J = hVar;
                    uVar.mo2880b();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo2777U() {
        this.f2405H = true;
        this.f2412O.mo2867n(true);
        m2412T(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U0 */
    public void mo2778U0(FragmentStateManager uVar) {
        Fragment k = uVar.mo2889k();
        if (k.f2136L) {
            if (this.f2415d) {
                this.f2407J = true;
                return;
            }
            k.f2136L = false;
            if (f2397b) {
                uVar.mo2890m();
            } else {
                mo2771Q0(k);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo2779V() {
        m2412T(2);
    }

    /* renamed from: V0 */
    public void mo2780V0(int i, int i2) {
        if (i >= 0) {
            mo2784Z(new C0346p(null, i, i2), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: W0 */
    public boolean mo2781W0() {
        return m2414X0(null, -1, 0);
    }

    /* renamed from: X */
    public void mo2782X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        this.f2416e.mo2915e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2418g;
        if (arrayList != null) {
            int size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.f2418g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        ArrayList<BackStackRecord> arrayList2 = this.f2417f;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i2 = 0; i2 < size2; i2++) {
                    BackStackRecord aVar = (BackStackRecord) this.f2417f.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo2527x(sb2, printWriter);
                }
            }
        }
        printWriter.print(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Back Stack Index: ");
        sb3.append(this.f2422k.get());
        printWriter.println(sb3.toString());
        synchronized (this.f2414c) {
            int size3 = this.f2414c.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    C0345o oVar = (C0345o) this.f2414c.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(oVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2431t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2432u);
        if (this.f2433v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2433v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2430s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2404G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2405H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2406I);
        if (this.f2403F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2403F);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y0 */
    public boolean mo2783Y0(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<BackStackRecord> arrayList3 = this.f2417f;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2417f.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    BackStackRecord aVar = (BackStackRecord) this.f2417f.get(size2);
                    if ((str != null && str.equals(aVar.mo2508C())) || (i >= 0 && i == aVar.f2226v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        BackStackRecord aVar2 = (BackStackRecord) this.f2417f.get(size2);
                        if ((str == null || !str.equals(aVar2.mo2508C())) && (i < 0 || i != aVar2.f2226v)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f2417f.size() - 1) {
                return false;
            }
            for (int size3 = this.f2417f.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2417f.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public void mo2784Z(C0345o oVar, boolean z) {
        if (!z) {
            if (this.f2431t != null) {
                m2433p();
            } else if (this.f2406I) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f2414c) {
            if (this.f2431t != null) {
                this.f2414c.add(oVar);
                mo2805k1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a1 */
    public void mo2785a1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f2172t != this) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m2437r1(new IllegalStateException(sb.toString()));
        }
        bundle.putString(str, fragment.f2159g);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: b0 */
    public boolean mo2786b0(boolean z) {
        m2418a0(z);
        boolean z2 = false;
        while (m2429l0(this.f2408K, this.f2409L)) {
            this.f2415d = true;
            try {
                m2423d1(this.f2408K, this.f2409L);
                m2434q();
                z2 = true;
            } catch (Throwable th) {
                m2434q();
                throw th;
            }
        }
        m2439s1();
        m2413W();
        this.f2416e.mo2912b();
        return z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b1 */
    public void mo2787b1(Fragment fragment, CancellationSignal bVar) {
        HashSet hashSet = (HashSet) this.f2426o.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f2426o.remove(fragment);
            if (fragment.f2152b < 5) {
                m2442x(fragment);
                mo2771Q0(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c0 */
    public void mo2788c0(C0345o oVar, boolean z) {
        if (!z || (this.f2431t != null && !this.f2406I)) {
            m2418a0(z);
            if (oVar.mo2515a(this.f2408K, this.f2409L)) {
                this.f2415d = true;
                try {
                    m2423d1(this.f2408K, this.f2409L);
                } finally {
                    m2434q();
                }
            }
            m2439s1();
            m2413W();
            this.f2416e.mo2912b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c1 */
    public void mo2789c1(Fragment fragment) {
        if (m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.f2171s);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !fragment.mo2475v0();
        if (!fragment.f2128B || z) {
            this.f2416e.mo2929s(fragment);
            if (m2409H0(fragment)) {
                this.f2403F = true;
            }
            fragment.f2166n = true;
            m2432o1(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2790e(BackStackRecord aVar) {
        if (this.f2417f == null) {
            this.f2417f = new ArrayList<>();
        }
        this.f2417f.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e1 */
    public void mo2791e1(Fragment fragment) {
        this.f2412O.mo2866m(fragment);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2792f(Fragment fragment, CancellationSignal bVar) {
        if (this.f2426o.get(fragment) == null) {
            this.f2426o.put(fragment, new HashSet());
        }
        ((HashSet) this.f2426o.get(fragment)).add(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public FragmentStateManager mo2793g(Fragment fragment) {
        if (m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        FragmentStateManager w = mo2824w(fragment);
        fragment.f2172t = this;
        this.f2416e.mo2926p(w);
        if (!fragment.f2128B) {
            this.f2416e.mo2911a(fragment);
            fragment.f2166n = false;
            if (fragment.f2135K == null) {
                fragment.f2141Q = false;
            }
            if (m2409H0(fragment)) {
                this.f2403F = true;
            }
        }
        return w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g0 */
    public Fragment mo2794g0(String str) {
        return this.f2416e.mo2916f(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g1 */
    public void mo2795g1(Parcelable parcelable) {
        String str;
        String str2;
        FragmentStateManager uVar;
        if (parcelable != null) {
            FragmentManagerState pVar = (FragmentManagerState) parcelable;
            if (pVar.f2461a != null) {
                this.f2416e.mo2930t();
                Iterator it = pVar.f2461a.iterator();
                while (true) {
                    str = "): ";
                    str2 = "FragmentManager";
                    if (!it.hasNext()) {
                        break;
                    }
                    FragmentState tVar = (FragmentState) it.next();
                    if (tVar != null) {
                        Fragment g = this.f2412O.mo2860g(tVar.f2478b);
                        if (g != null) {
                            if (m2408G0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("restoreSaveState: re-attaching retained ");
                                sb.append(g);
                                Log.v(str2, sb.toString());
                            }
                            uVar = new FragmentStateManager(this.f2428q, this.f2416e, g, tVar);
                        } else {
                            uVar = new FragmentStateManager(this.f2428q, this.f2416e, this.f2431t.mo2721i().getClassLoader(), mo2817r0(), tVar);
                        }
                        Fragment k = uVar.mo2889k();
                        k.f2172t = this;
                        if (m2408G0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("restoreSaveState: active (");
                            sb2.append(k.f2159g);
                            sb2.append(str);
                            sb2.append(k);
                            Log.v(str2, sb2.toString());
                        }
                        uVar.mo2892o(this.f2431t.mo2721i().getClassLoader());
                        this.f2416e.mo2926p(uVar);
                        uVar.mo2897u(this.f2430s);
                    }
                }
                for (Fragment fragment : this.f2412O.mo2863j()) {
                    if (!this.f2416e.mo2913c(fragment.f2159g)) {
                        if (m2408G0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Discarding retained Fragment ");
                            sb3.append(fragment);
                            sb3.append(" that was not found in the set of active Fragments ");
                            sb3.append(pVar.f2461a);
                            Log.v(str2, sb3.toString());
                        }
                        this.f2412O.mo2866m(fragment);
                        fragment.f2172t = this;
                        FragmentStateManager uVar2 = new FragmentStateManager(this.f2428q, this.f2416e, fragment);
                        uVar2.mo2897u(1);
                        uVar2.mo2890m();
                        fragment.f2166n = true;
                        uVar2.mo2890m();
                    }
                }
                this.f2416e.mo2931u(pVar.f2462b);
                if (pVar.f2463c != null) {
                    this.f2417f = new ArrayList<>(pVar.f2463c.length);
                    int i = 0;
                    while (true) {
                        BackStackState[] bVarArr = pVar.f2463c;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        BackStackRecord l = bVarArr[i].mo2558l(this);
                        if (m2408G0(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("restoreAllState: back stack #");
                            sb4.append(i);
                            sb4.append(" (index ");
                            sb4.append(l.f2226v);
                            sb4.append(str);
                            sb4.append(l);
                            Log.v(str2, sb4.toString());
                            PrintWriter printWriter = new PrintWriter(new LogWriter(str2));
                            l.mo2528y("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2417f.add(l);
                        i++;
                    }
                } else {
                    this.f2417f = null;
                }
                this.f2422k.set(pVar.f2464d);
                String str3 = pVar.f2465e;
                if (str3 != null) {
                    Fragment g0 = mo2794g0(str3);
                    this.f2434w = g0;
                    m2410M(g0);
                }
                ArrayList<String> arrayList = pVar.f2466f;
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Bundle bundle = (Bundle) pVar.f2467g.get(i2);
                        bundle.setClassLoader(this.f2431t.mo2721i().getClassLoader());
                        this.f2423l.put(arrayList.get(i2), bundle);
                    }
                }
                this.f2402E = new ArrayDeque<>(pVar.f2468h);
            }
        }
    }

    /* renamed from: h */
    public void mo2796h(FragmentOnAttachListener rVar) {
        this.f2429r.add(rVar);
    }

    /* renamed from: h0 */
    public Fragment mo2797h0(int i) {
        return this.f2416e.mo2917g(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo2798i(Fragment fragment) {
        this.f2412O.mo2857e(fragment);
    }

    /* renamed from: i0 */
    public Fragment mo2799i0(String str) {
        return this.f2416e.mo2918h(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i1 */
    public Parcelable mo2800i1() {
        m2428k0();
        m2415Y();
        mo2786b0(true);
        this.f2404G = true;
        this.f2412O.mo2867n(true);
        ArrayList<FragmentState> v = this.f2416e.mo2932v();
        String str = "FragmentManager";
        BackStackState[] bVarArr = null;
        if (v.isEmpty()) {
            if (m2408G0(2)) {
                Log.v(str, "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w = this.f2416e.mo2933w();
        ArrayList<BackStackRecord> arrayList = this.f2417f;
        if (arrayList != null) {
            int size = arrayList.size();
            if (size > 0) {
                bVarArr = new BackStackState[size];
                for (int i = 0; i < size; i++) {
                    bVarArr[i] = new BackStackState((BackStackRecord) this.f2417f.get(i));
                    if (m2408G0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(this.f2417f.get(i));
                        Log.v(str, sb.toString());
                    }
                }
            }
        }
        FragmentManagerState pVar = new FragmentManagerState();
        pVar.f2461a = v;
        pVar.f2462b = w;
        pVar.f2463c = bVarArr;
        pVar.f2464d = this.f2422k.get();
        Fragment fragment = this.f2434w;
        if (fragment != null) {
            pVar.f2465e = fragment.f2159g;
        }
        pVar.f2466f.addAll(this.f2423l.keySet());
        pVar.f2467g.addAll(this.f2423l.values());
        pVar.f2468h = new ArrayList<>(this.f2402E);
        return pVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo2801j() {
        return this.f2422k.getAndIncrement();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j0 */
    public Fragment mo2802j0(String str) {
        return this.f2416e.mo2919i(str);
    }

    /* renamed from: j1 */
    public C0286l mo2803j1(Fragment fragment) {
        FragmentStateManager m = this.f2416e.mo2923m(fragment.f2159g);
        if (m == null || !m.mo2889k().equals(fragment)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m2437r1(new IllegalStateException(sb.toString()));
        }
        return m.mo2894r();
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [androidx.lifecycle.i] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2804k(androidx.fragment.app.FragmentHostCallback<?> r3, androidx.fragment.app.FragmentContainer r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.k<?> r0 = r2.f2431t
            if (r0 != 0) goto L_0x0108
            r2.f2431t = r3
            r2.f2432u = r4
            r2.f2433v = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.n$i r4 = new androidx.fragment.app.n$i
            r4.<init>(r5)
            r2.mo2796h(r4)
            goto L_0x001f
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r4 == 0) goto L_0x001f
            r4 = r3
            androidx.fragment.app.r r4 = (androidx.fragment.app.FragmentOnAttachListener) r4
            r2.mo2796h(r4)
        L_0x001f:
            androidx.fragment.app.Fragment r4 = r2.f2433v
            if (r4 == 0) goto L_0x0026
            r2.m2439s1()
        L_0x0026:
            boolean r4 = r3 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r4 == 0) goto L_0x003b
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.OnBackPressedDispatcherOwner) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo133c()
            r2.f2420i = r0
            if (r5 == 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            androidx.activity.b r1 = r2.f2421j
            r0.mo159a(r4, r1)
        L_0x003b:
            if (r5 == 0) goto L_0x0046
            androidx.fragment.app.n r3 = r5.f2172t
            androidx.fragment.app.q r3 = r3.m2431n0(r5)
            r2.f2412O = r3
            goto L_0x005f
        L_0x0046:
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r4 == 0) goto L_0x0057
            androidx.lifecycle.u r3 = (androidx.lifecycle.ViewModelStoreOwner) r3
            androidx.lifecycle.t r3 = r3.mo144p()
            androidx.fragment.app.q r3 = androidx.fragment.app.FragmentManagerViewModel.m2558i(r3)
            r2.f2412O = r3
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.q r3 = new androidx.fragment.app.q
            r4 = 0
            r3.<init>(r4)
            r2.f2412O = r3
        L_0x005f:
            androidx.fragment.app.q r3 = r2.f2412O
            boolean r4 = r2.mo2763L0()
            r3.mo2867n(r4)
            androidx.fragment.app.w r3 = r2.f2416e
            androidx.fragment.app.q r4 = r2.f2412O
            r3.mo2934x(r4)
            androidx.fragment.app.k<?> r3 = r2.f2431t
            boolean r4 = r3 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r4 == 0) goto L_0x0107
            androidx.activity.result.d r3 = (androidx.activity.result.ActivityResultRegistryOwner) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.mo135j()
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.f2159g
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x0093
        L_0x0091:
            java.lang.String r4 = ""
        L_0x0093:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.activity.result.f.d r0 = new androidx.activity.result.f.d
            r0.<init>()
            androidx.fragment.app.n$j r1 = new androidx.fragment.app.n$j
            r1.<init>()
            androidx.activity.result.c r5 = r3.mo177i(r5, r0, r1)
            r2.f2399B = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.n$k r0 = new androidx.fragment.app.n$k
            r0.<init>()
            androidx.fragment.app.n$a r1 = new androidx.fragment.app.n$a
            r1.<init>()
            androidx.activity.result.c r5 = r3.mo177i(r5, r0, r1)
            r2.f2400C = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            androidx.activity.result.f.c r5 = new androidx.activity.result.f.c
            r5.<init>()
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>()
            androidx.activity.result.c r3 = r3.mo177i(r4, r5, r0)
            r2.f2401D = r3
        L_0x0107:
            return
        L_0x0108:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo2804k(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k1 */
    public void mo2805k1() {
        synchronized (this.f2414c) {
            ArrayList<C0347q> arrayList = this.f2411N;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f2414c.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f2431t.mo2722k().removeCallbacks(this.f2413P);
                this.f2431t.mo2722k().post(this.f2413P);
                m2439s1();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo2806l(Fragment fragment) {
        String str = "FragmentManager";
        if (m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
        if (fragment.f2128B) {
            fragment.f2128B = false;
            if (!fragment.f2165m) {
                this.f2416e.mo2911a(fragment);
                if (m2408G0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v(str, sb2.toString());
                }
                if (m2409H0(fragment)) {
                    this.f2403F = true;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l1 */
    public void mo2807l1(Fragment fragment, boolean z) {
        ViewGroup q0 = m2435q0(fragment);
        if (q0 != null && (q0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) q0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: m */
    public FragmentTransaction mo2808m() {
        return new BackStackRecord(this);
    }

    /* renamed from: m0 */
    public int mo2809m0() {
        ArrayList<BackStackRecord> arrayList = this.f2417f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m1 */
    public void mo2810m1(Fragment fragment, C0378c cVar) {
        if (!fragment.equals(mo2794g0(fragment.f2159g)) || !(fragment.f2173u == null || fragment.f2172t == this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        fragment.f2145U = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n1 */
    public void mo2811n1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo2794g0(fragment.f2159g)) && (fragment.f2173u == null || fragment.f2172t == this))) {
            Fragment fragment2 = this.f2434w;
            this.f2434w = fragment;
            m2410M(fragment2);
            m2410M(this.f2434w);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo2812o() {
        boolean z = false;
        for (Fragment fragment : this.f2416e.mo2922l()) {
            if (fragment != null) {
                z = m2409H0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o0 */
    public FragmentContainer mo2813o0() {
        return this.f2432u;
    }

    /* renamed from: p0 */
    public Fragment mo2814p0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment g0 = mo2794g0(string);
        if (g0 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            m2437r1(new IllegalStateException(sb.toString()));
        }
        return g0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p1 */
    public void mo2815p1(Fragment fragment) {
        if (m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.f2127A) {
            fragment.f2127A = false;
            fragment.f2141Q = !fragment.f2141Q;
        }
    }

    /* renamed from: r */
    public final void mo2816r(String str) {
        this.f2423l.remove(str);
    }

    /* renamed from: r0 */
    public FragmentFactory mo2817r0() {
        FragmentFactory jVar = this.f2435x;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f2433v;
        if (fragment != null) {
            return fragment.f2172t.mo2817r0();
        }
        return this.f2436y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s0 */
    public FragmentStore mo2818s0() {
        return this.f2416e;
    }

    /* renamed from: t0 */
    public List<Fragment> mo2819t0() {
        return this.f2416e.mo2924n();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2433v;
        String str = "}";
        String str2 = "{";
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append(str2);
            sb.append(Integer.toHexString(System.identityHashCode(this.f2433v)));
            sb.append(str);
        } else {
            FragmentHostCallback<?> kVar = this.f2431t;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append(str2);
                sb.append(Integer.toHexString(System.identityHashCode(this.f2431t)));
                sb.append(str);
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo2821u(BackStackRecord aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo2506A(z3);
        } else {
            aVar.mo2529z();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f2430s >= 1) {
            FragmentTransition.m2652B(this.f2431t.mo2721i(), this.f2432u, arrayList, arrayList2, 0, 1, true, this.f2427p);
        }
        if (z3) {
            mo2769P0(this.f2430s, true);
        }
        for (Fragment fragment : this.f2416e.mo2922l()) {
            if (fragment != null && fragment.f2135K != null && fragment.f2140P && aVar.mo2509D(fragment.f2177y)) {
                float f = fragment.f2142R;
                if (f > 0.0f) {
                    fragment.f2135K.setAlpha(f);
                }
                if (z3) {
                    fragment.f2142R = 0.0f;
                } else {
                    fragment.f2142R = -1.0f;
                    fragment.f2140P = false;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public FragmentHostCallback<?> mo2822u0() {
        return this.f2431t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v0 */
    public Factory2 mo2823v0() {
        return this.f2419h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public FragmentStateManager mo2824w(Fragment fragment) {
        FragmentStateManager m = this.f2416e.mo2923m(fragment.f2159g);
        if (m != null) {
            return m;
        }
        FragmentStateManager uVar = new FragmentStateManager(this.f2428q, this.f2416e, fragment);
        uVar.mo2892o(this.f2431t.mo2721i().getClassLoader());
        uVar.mo2897u(this.f2430s);
        return uVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w0 */
    public FragmentLifecycleCallbacksDispatcher mo2825w0() {
        return this.f2428q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x0 */
    public Fragment mo2826x0() {
        return this.f2433v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo2827y(Fragment fragment) {
        String str = "FragmentManager";
        if (m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
        if (!fragment.f2128B) {
            fragment.f2128B = true;
            if (fragment.f2165m) {
                if (m2408G0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v(str, sb2.toString());
                }
                this.f2416e.mo2929s(fragment);
                if (m2409H0(fragment)) {
                    this.f2403F = true;
                }
                m2432o1(fragment);
            }
        }
    }

    /* renamed from: y0 */
    public Fragment mo2828y0() {
        return this.f2434w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo2829z() {
        this.f2404G = false;
        this.f2405H = false;
        this.f2412O.mo2867n(false);
        m2412T(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z0 */
    public SpecialEffectsControllerFactory mo2830z0() {
        SpecialEffectsControllerFactory e0Var = this.f2437z;
        if (e0Var != null) {
            return e0Var;
        }
        Fragment fragment = this.f2433v;
        if (fragment != null) {
            return fragment.f2172t.mo2830z0();
        }
        return this.f2398A;
    }
}
