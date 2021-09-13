package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.p006f.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.SharedElementCallback;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider.C0382a;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p010b.p018b.p019a.p022c.Function;
import p010b.p034g.p043k.LayoutInflaterCompat;
import p010b.p057m.p058a.LoaderManager;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {

    /* renamed from: a */
    static final Object f2126a = new Object();

    /* renamed from: A */
    boolean f2127A;

    /* renamed from: B */
    boolean f2128B;

    /* renamed from: C */
    boolean f2129C;

    /* renamed from: D */
    boolean f2130D;

    /* renamed from: G */
    boolean f2131G;

    /* renamed from: H */
    boolean f2132H;

    /* renamed from: I */
    private boolean f2133I;

    /* renamed from: J */
    ViewGroup f2134J;

    /* renamed from: K */
    View f2135K;

    /* renamed from: L */
    boolean f2136L;

    /* renamed from: M */
    boolean f2137M;

    /* renamed from: N */
    C0282h f2138N;

    /* renamed from: O */
    Runnable f2139O;

    /* renamed from: P */
    boolean f2140P;

    /* renamed from: Q */
    boolean f2141Q;

    /* renamed from: R */
    float f2142R;

    /* renamed from: S */
    LayoutInflater f2143S;

    /* renamed from: T */
    boolean f2144T;

    /* renamed from: U */
    C0378c f2145U;

    /* renamed from: V */
    LifecycleRegistry f2146V;

    /* renamed from: W */
    FragmentViewLifecycleOwner f2147W;

    /* renamed from: X */
    MutableLiveData<LifecycleOwner> f2148X;

    /* renamed from: Y */
    C0382a f2149Y;

    /* renamed from: Z */
    SavedStateRegistryController f2150Z;

    /* renamed from: a0 */
    private int f2151a0;

    /* renamed from: b */
    int f2152b;

    /* renamed from: b0 */
    private final AtomicInteger f2153b0;

    /* renamed from: c */
    Bundle f2154c;

    /* renamed from: c0 */
    private final ArrayList<C0284j> f2155c0;

    /* renamed from: d */
    SparseArray<Parcelable> f2156d;

    /* renamed from: e */
    Bundle f2157e;

    /* renamed from: f */
    Boolean f2158f;

    /* renamed from: g */
    String f2159g;

    /* renamed from: h */
    Bundle f2160h;

    /* renamed from: i */
    Fragment f2161i;

    /* renamed from: j */
    String f2162j;

    /* renamed from: k */
    int f2163k;

    /* renamed from: l */
    private Boolean f2164l;

    /* renamed from: m */
    boolean f2165m;

    /* renamed from: n */
    boolean f2166n;

    /* renamed from: o */
    boolean f2167o;

    /* renamed from: p */
    boolean f2168p;

    /* renamed from: q */
    boolean f2169q;

    /* renamed from: r */
    boolean f2170r;

    /* renamed from: s */
    int f2171s;

    /* renamed from: t */
    FragmentManager f2172t;

    /* renamed from: u */
    FragmentHostCallback<?> f2173u;

    /* renamed from: v */
    FragmentManager f2174v;

    /* renamed from: w */
    Fragment f2175w;

    /* renamed from: x */
    int f2176x;

    /* renamed from: y */
    int f2177y;

    /* renamed from: z */
    String f2178z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0275a implements Runnable {
        C0275a() {
        }

        public void run() {
            Fragment.this.mo2451k2();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0276b implements Runnable {
        C0276b() {
        }

        public void run() {
            Fragment.this.mo2474v(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0277c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SpecialEffectsController f2182a;

        C0277c(SpecialEffectsController d0Var) {
            this.f2182a = d0Var;
        }

        public void run() {
            this.f2182a.mo2620g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C0278d extends FragmentContainer {
        C0278d() {
        }

        /* renamed from: f */
        public View mo2491f(int i) {
            View view = Fragment.this.f2135K;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(Fragment.this);
            sb.append(" does not have a view");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: g */
        public boolean mo2492g() {
            return Fragment.this.f2135K != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    class C0279e implements Function<Void, ActivityResultRegistry> {
        C0279e() {
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            Fragment fragment = Fragment.this;
            FragmentHostCallback<?> kVar = fragment.f2173u;
            if (kVar instanceof ActivityResultRegistryOwner) {
                return ((ActivityResultRegistryOwner) kVar).mo135j();
            }
            return fragment.mo2379M1().mo135j();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    class C0280f extends C0284j {

        /* renamed from: a */
        final /* synthetic */ Function f2186a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f2187b;

        /* renamed from: c */
        final /* synthetic */ ActivityResultContract f2188c;

        /* renamed from: d */
        final /* synthetic */ ActivityResultCallback f2189d;

        C0280f(Function aVar, AtomicReference atomicReference, ActivityResultContract aVar2, ActivityResultCallback bVar) {
            this.f2186a = aVar;
            this.f2187b = atomicReference;
            this.f2188c = aVar2;
            this.f2189d = bVar;
            super(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2495a() {
            ActivityResultRegistry activityResultRegistry = (ActivityResultRegistry) this.f2186a.apply(null);
            this.f2187b.set(activityResultRegistry.mo178j(Fragment.this.mo2343A(), Fragment.this, this.f2188c, this.f2189d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    class C0281g extends ActivityResultLauncher<I> {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f2191a;

        /* renamed from: b */
        final /* synthetic */ ActivityResultContract f2192b;

        C0281g(AtomicReference atomicReference, ActivityResultContract aVar) {
            this.f2191a = atomicReference;
            this.f2192b = aVar;
        }

        /* renamed from: b */
        public void mo180b(I i, ActivityOptionsCompat bVar) {
            ActivityResultLauncher cVar = (ActivityResultLauncher) this.f2191a.get();
            if (cVar != null) {
                cVar.mo180b(i, bVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        /* renamed from: c */
        public void mo181c() {
            ActivityResultLauncher cVar = (ActivityResultLauncher) this.f2191a.getAndSet(null);
            if (cVar != null) {
                cVar.mo181c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    static class C0282h {

        /* renamed from: a */
        View f2194a;

        /* renamed from: b */
        Animator f2195b;

        /* renamed from: c */
        boolean f2196c;

        /* renamed from: d */
        int f2197d;

        /* renamed from: e */
        int f2198e;

        /* renamed from: f */
        int f2199f;

        /* renamed from: g */
        int f2200g;

        /* renamed from: h */
        int f2201h;

        /* renamed from: i */
        ArrayList<String> f2202i;

        /* renamed from: j */
        ArrayList<String> f2203j;

        /* renamed from: k */
        Object f2204k = null;

        /* renamed from: l */
        Object f2205l;

        /* renamed from: m */
        Object f2206m;

        /* renamed from: n */
        Object f2207n;

        /* renamed from: o */
        Object f2208o;

        /* renamed from: p */
        Object f2209p;

        /* renamed from: q */
        Boolean f2210q;

        /* renamed from: r */
        Boolean f2211r;

        /* renamed from: s */
        SharedElementCallback f2212s;

        /* renamed from: t */
        SharedElementCallback f2213t;

        /* renamed from: u */
        float f2214u;

        /* renamed from: v */
        View f2215v;

        /* renamed from: w */
        boolean f2216w;

        /* renamed from: x */
        C0285k f2217x;

        /* renamed from: y */
        boolean f2218y;

        C0282h() {
            Object obj = Fragment.f2126a;
            this.f2205l = obj;
            this.f2206m = null;
            this.f2207n = obj;
            this.f2208o = null;
            this.f2209p = obj;
            this.f2214u = 1.0f;
            this.f2215v = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    public static class C0283i extends RuntimeException {
        public C0283i(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    private static abstract class C0284j {
        private C0284j() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo2495a();

        /* synthetic */ C0284j(C0275a aVar) {
            this();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    interface C0285k {
        /* renamed from: a */
        void mo2496a();

        /* renamed from: b */
        void mo2497b();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* renamed from: androidx.fragment.app.Fragment$l */
    public static class C0286l implements Parcelable {
        public static final Creator<C0286l> CREATOR = new C0287a();

        /* renamed from: a */
        final Bundle f2219a;

        /* renamed from: androidx.fragment.app.Fragment$l$a */
        class C0287a implements ClassLoaderCreator<C0286l> {
            C0287a() {
            }

            /* renamed from: a */
            public C0286l createFromParcel(Parcel parcel) {
                return new C0286l(parcel, null);
            }

            /* renamed from: b */
            public C0286l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0286l(parcel, classLoader);
            }

            /* renamed from: c */
            public C0286l[] newArray(int i) {
                return new C0286l[i];
            }
        }

        C0286l(Bundle bundle) {
            this.f2219a = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f2219a);
        }

        C0286l(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2219a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    public Fragment() {
        this.f2152b = -1;
        this.f2159g = UUID.randomUUID().toString();
        this.f2162j = null;
        this.f2164l = null;
        this.f2174v = new FragmentManagerImpl();
        this.f2132H = true;
        this.f2137M = true;
        this.f2139O = new C0275a();
        this.f2145U = C0378c.RESUMED;
        this.f2148X = new MutableLiveData<>();
        this.f2153b0 = new AtomicInteger();
        this.f2155c0 = new ArrayList<>();
        m2008o0();
    }

    /* renamed from: I1 */
    private <I, O> ActivityResultLauncher<I> m2004I1(ActivityResultContract<I, O> aVar, Function<Void, ActivityResultRegistry> aVar2, ActivityResultCallback<O> bVar) {
        if (this.f2152b <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            C0280f fVar = new C0280f(aVar2, atomicReference, aVar, bVar);
            m2005K1(fVar);
            return new C0281g(atomicReference, aVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: K1 */
    private void m2005K1(C0284j jVar) {
        if (this.f2152b >= 0) {
            jVar.mo2495a();
        } else {
            this.f2155c0.add(jVar);
        }
    }

    /* renamed from: R1 */
    private void m2006R1() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        if (this.f2135K != null) {
            mo2396S1(this.f2154c);
        }
        this.f2154c = null;
    }

    /* renamed from: T */
    private int m2007T() {
        C0378c cVar = this.f2145U;
        if (cVar == C0378c.INITIALIZED || this.f2175w == null) {
            return cVar.ordinal();
        }
        return Math.min(cVar.ordinal(), this.f2175w.m2007T());
    }

    /* renamed from: o0 */
    private void m2008o0() {
        this.f2146V = new LifecycleRegistry(this);
        this.f2150Z = SavedStateRegistryController.m3996a(this);
        this.f2149Y = null;
    }

    @Deprecated
    /* renamed from: q0 */
    public static Fragment m2009q0(Context context, String str, Bundle bundle) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            Fragment fragment = (Fragment) FragmentFactory.m2379d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo2407W1(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(str2);
            throw new C0283i(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            sb2.append(str2);
            throw new C0283i(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new C0283i(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new C0283i(sb4.toString(), e4);
        }
    }

    /* renamed from: y */
    private C0282h m2010y() {
        if (this.f2138N == null) {
            this.f2138N = new C0282h();
        }
        return this.f2138N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public String mo2343A() {
        StringBuilder sb = new StringBuilder();
        sb.append("fragment_");
        sb.append(this.f2159g);
        sb.append("_rq#");
        sb.append(this.f2153b0.getAndIncrement());
        return sb.toString();
    }

    /* renamed from: A0 */
    public final boolean mo2344A0() {
        FragmentManager nVar = this.f2172t;
        if (nVar == null) {
            return false;
        }
        return nVar.mo2763L0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A1 */
    public void mo2345A1(boolean z) {
        mo2418a1(z);
        this.f2174v.mo2766O(z);
    }

    /* renamed from: B */
    public final FragmentActivity mo2346B() {
        FragmentHostCallback<?> kVar = this.f2173u;
        if (kVar == null) {
            return null;
        }
        return (FragmentActivity) kVar.mo2720h();
    }

    /* renamed from: B0 */
    public final boolean mo2347B0() {
        if (mo2465r0() && !mo2469t0()) {
            View view = this.f2135K;
            if (!(view == null || view.getWindowToken() == null || this.f2135K.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B1 */
    public boolean mo2348B1(Menu menu) {
        boolean z = false;
        if (this.f2127A) {
            return false;
        }
        if (this.f2131G && this.f2132H) {
            z = true;
            mo2421b1(menu);
        }
        return z | this.f2174v.mo2768P(menu);
    }

    /* renamed from: C */
    public boolean mo2349C() {
        C0282h hVar = this.f2138N;
        if (hVar != null) {
            Boolean bool = hVar.f2211r;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C0 */
    public void mo2350C0() {
        this.f2174v.mo2775S0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C1 */
    public void mo2351C1() {
        boolean J0 = this.f2172t.mo2759J0(this);
        Boolean bool = this.f2164l;
        if (bool == null || bool.booleanValue() != J0) {
            this.f2164l = Boolean.valueOf(J0);
            mo2424c1(J0);
            this.f2174v.mo2770Q();
        }
    }

    /* renamed from: D */
    public boolean mo2352D() {
        C0282h hVar = this.f2138N;
        if (hVar != null) {
            Boolean bool = hVar.f2210q;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    @Deprecated
    /* renamed from: D0 */
    public void mo2353D0(Bundle bundle) {
        this.f2133I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D1 */
    public void mo2354D1() {
        this.f2174v.mo2775S0();
        this.f2174v.mo2786b0(true);
        this.f2152b = 7;
        this.f2133I = false;
        mo2430e1();
        if (this.f2133I) {
            LifecycleRegistry jVar = this.f2146V;
            C0377b bVar = C0377b.ON_RESUME;
            jVar.mo3004h(bVar);
            if (this.f2135K != null) {
                this.f2147W.mo2564a(bVar);
            }
            this.f2174v.mo2772R();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public View mo2355E() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        return hVar.f2194a;
    }

    @Deprecated
    /* renamed from: E0 */
    public void mo2356E0(int i, int i2, Intent intent) {
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E1 */
    public void mo2357E1(Bundle bundle) {
        mo2434f1(bundle);
        this.f2150Z.mo3938d(bundle);
        Parcelable i1 = this.f2174v.mo2800i1();
        if (i1 != null) {
            bundle.putParcelable("android:support:fragments", i1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public Animator mo2358F() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        return hVar.f2195b;
    }

    @Deprecated
    /* renamed from: F0 */
    public void mo2359F0(Activity activity) {
        this.f2133I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F1 */
    public void mo2360F1() {
        this.f2174v.mo2775S0();
        this.f2174v.mo2786b0(true);
        this.f2152b = 5;
        this.f2133I = false;
        mo2437g1();
        if (this.f2133I) {
            LifecycleRegistry jVar = this.f2146V;
            C0377b bVar = C0377b.ON_START;
            jVar.mo3004h(bVar);
            if (this.f2135K != null) {
                this.f2147W.mo2564a(bVar);
            }
            this.f2174v.mo2774S();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* renamed from: G */
    public final Bundle mo2361G() {
        return this.f2160h;
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        this.f2133I = true;
        FragmentHostCallback<?> kVar = this.f2173u;
        Activity h = kVar == null ? null : kVar.mo2720h();
        if (h != null) {
            this.f2133I = false;
            mo2359F0(h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G1 */
    public void mo2363G1() {
        this.f2174v.mo2777U();
        if (this.f2135K != null) {
            this.f2147W.mo2564a(C0377b.ON_STOP);
        }
        this.f2146V.mo3004h(C0377b.ON_STOP);
        this.f2152b = 4;
        this.f2133I = false;
        mo2440h1();
        if (!this.f2133I) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    /* renamed from: H */
    public final FragmentManager mo2364H() {
        if (this.f2173u != null) {
            return this.f2174v;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    /* renamed from: H0 */
    public void mo2365H0(Fragment fragment) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H1 */
    public void mo2366H1() {
        mo2444i1(this.f2135K, this.f2154c);
        this.f2174v.mo2779V();
    }

    /* renamed from: I */
    public Context mo2367I() {
        FragmentHostCallback<?> kVar = this.f2173u;
        if (kVar == null) {
            return null;
        }
        return kVar.mo2721i();
    }

    /* renamed from: I0 */
    public boolean mo2368I0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public int mo2369J() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return 0;
        }
        return hVar.f2197d;
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        this.f2133I = true;
        mo2391Q1(bundle);
        if (!this.f2174v.mo2761K0(1)) {
            this.f2174v.mo2748D();
        }
    }

    /* renamed from: J1 */
    public final <I, O> ActivityResultLauncher<I> mo2371J1(ActivityResultContract<I, O> aVar, ActivityResultCallback<O> bVar) {
        return m2004I1(aVar, new C0279e(), bVar);
    }

    /* renamed from: K */
    public Object mo2372K() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        return hVar.f2204k;
    }

    /* renamed from: K0 */
    public Animation mo2373K0(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public SharedElementCallback mo2374L() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        return hVar.f2212s;
    }

    /* renamed from: L0 */
    public Animator mo2375L0(int i, boolean z, int i2) {
        return null;
    }

    @Deprecated
    /* renamed from: L1 */
    public final void mo2376L1(String[] strArr, int i) {
        if (this.f2173u != null) {
            mo2405W().mo2764M0(this, strArr, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public int mo2377M() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return 0;
        }
        return hVar.f2198e;
    }

    /* renamed from: M0 */
    public void mo2378M0(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: M1 */
    public final FragmentActivity mo2379M1() {
        FragmentActivity B = mo2346B();
        if (B != null) {
            return B;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: N */
    public Object mo2380N() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        return hVar.f2206m;
    }

    /* renamed from: N0 */
    public View mo2381N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f2151a0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: N1 */
    public final Bundle mo2382N1() {
        Bundle G = mo2361G();
        if (G != null) {
            return G;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public SharedElementCallback mo2383O() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        return hVar.f2213t;
    }

    /* renamed from: O0 */
    public void mo2384O0() {
        this.f2133I = true;
    }

    /* renamed from: O1 */
    public final Context mo2385O1() {
        Context I = mo2367I();
        if (I != null) {
            return I;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public View mo2386P() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        return hVar.f2215v;
    }

    /* renamed from: P0 */
    public void mo2387P0() {
    }

    /* renamed from: P1 */
    public final View mo2388P1() {
        View l0 = mo2452l0();
        if (l0 != null) {
            return l0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    /* renamed from: Q */
    public final FragmentManager mo2389Q() {
        return this.f2172t;
    }

    /* renamed from: Q0 */
    public void mo2390Q0() {
        this.f2133I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q1 */
    public void mo2391Q1(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.f2174v.mo2795g1(parcelable);
                this.f2174v.mo2748D();
            }
        }
    }

    /* renamed from: R */
    public final Object mo2392R() {
        FragmentHostCallback<?> kVar = this.f2173u;
        if (kVar == null) {
            return null;
        }
        return kVar.mo2663m();
    }

    /* renamed from: R0 */
    public void mo2393R0() {
        this.f2133I = true;
    }

    @Deprecated
    /* renamed from: S */
    public LayoutInflater mo2394S(Bundle bundle) {
        FragmentHostCallback<?> kVar = this.f2173u;
        if (kVar != null) {
            LayoutInflater n = kVar.mo2664n();
            LayoutInflaterCompat.m5429b(n, this.f2174v.mo2823v0());
            return n;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: S0 */
    public LayoutInflater mo2395S0(Bundle bundle) {
        return mo2394S(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S1 */
    public final void mo2396S1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2156d;
        if (sparseArray != null) {
            this.f2135K.restoreHierarchyState(sparseArray);
            this.f2156d = null;
        }
        if (this.f2135K != null) {
            this.f2147W.mo2567g(this.f2157e);
            this.f2157e = null;
        }
        this.f2133I = false;
        mo2447j1(bundle);
        if (!this.f2133I) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new SuperNotCalledException(sb.toString());
        } else if (this.f2135K != null) {
            this.f2147W.mo2564a(C0377b.ON_CREATE);
        }
    }

    /* renamed from: T0 */
    public void mo2397T0(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T1 */
    public void mo2398T1(View view) {
        m2010y().f2194a = view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public int mo2399U() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return 0;
        }
        return hVar.f2201h;
    }

    @Deprecated
    /* renamed from: U0 */
    public void mo2400U0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2133I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U1 */
    public void mo2401U1(int i, int i2, int i3, int i4) {
        if (this.f2138N != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            m2010y().f2197d = i;
            m2010y().f2198e = i2;
            m2010y().f2199f = i3;
            m2010y().f2200g = i4;
        }
    }

    /* renamed from: V */
    public final Fragment mo2402V() {
        return this.f2175w;
    }

    /* renamed from: V0 */
    public void mo2403V0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2133I = true;
        FragmentHostCallback<?> kVar = this.f2173u;
        Activity h = kVar == null ? null : kVar.mo2720h();
        if (h != null) {
            this.f2133I = false;
            mo2400U0(h, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V1 */
    public void mo2404V1(Animator animator) {
        m2010y().f2195b = animator;
    }

    /* renamed from: W */
    public final FragmentManager mo2405W() {
        FragmentManager nVar = this.f2172t;
        if (nVar != null) {
            return nVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: W0 */
    public void mo2406W0(boolean z) {
    }

    /* renamed from: W1 */
    public void mo2407W1(Bundle bundle) {
        if (this.f2172t == null || !mo2344A0()) {
            this.f2160h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public boolean mo2408X() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return false;
        }
        return hVar.f2196c;
    }

    /* renamed from: X0 */
    public boolean mo2409X0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X1 */
    public void mo2410X1(View view) {
        m2010y().f2215v = view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public int mo2411Y() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return 0;
        }
        return hVar.f2199f;
    }

    /* renamed from: Y0 */
    public void mo2412Y0(Menu menu) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y1 */
    public void mo2413Y1(boolean z) {
        m2010y().f2218y = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public int mo2414Z() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return 0;
        }
        return hVar.f2200g;
    }

    /* renamed from: Z0 */
    public void mo2415Z0() {
        this.f2133I = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r2 != null) goto L_0x000c;
     */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2416Z1(androidx.fragment.app.Fragment.C0286l r2) {
        /*
            r1 = this;
            androidx.fragment.app.n r0 = r1.f2172t
            if (r0 != 0) goto L_0x000f
            if (r2 == 0) goto L_0x000b
            android.os.Bundle r2 = r2.f2219a
            if (r2 == 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.f2154c = r2
            return
        L_0x000f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo2416Z1(androidx.fragment.app.Fragment$l):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a0 */
    public float mo2417a0() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return 1.0f;
        }
        return hVar.f2214u;
    }

    /* renamed from: a1 */
    public void mo2418a1(boolean z) {
    }

    /* renamed from: a2 */
    public void mo2419a2(boolean z) {
        if (this.f2132H != z) {
            this.f2132H = z;
            if (this.f2131G && mo2465r0() && !mo2469t0()) {
                this.f2173u.mo2666s();
            }
        }
    }

    /* renamed from: b */
    public Lifecycle mo132b() {
        return this.f2146V;
    }

    /* renamed from: b0 */
    public Object mo2420b0() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f2207n;
        if (obj == f2126a) {
            obj = mo2380N();
        }
        return obj;
    }

    /* renamed from: b1 */
    public void mo2421b1(Menu menu) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b2 */
    public void mo2422b2(int i) {
        if (this.f2138N != null || i != 0) {
            m2010y();
            this.f2138N.f2201h = i;
        }
    }

    /* renamed from: c0 */
    public final Resources mo2423c0() {
        return mo2385O1().getResources();
    }

    /* renamed from: c1 */
    public void mo2424c1(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c2 */
    public void mo2425c2(C0285k kVar) {
        m2010y();
        C0282h hVar = this.f2138N;
        C0285k kVar2 = hVar.f2217x;
        if (kVar != kVar2) {
            if (kVar == null || kVar2 == null) {
                if (hVar.f2216w) {
                    hVar.f2217x = kVar;
                }
                if (kVar != null) {
                    kVar.mo2497b();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: d */
    public final SavedStateRegistry mo134d() {
        return this.f2150Z.mo3936b();
    }

    /* renamed from: d0 */
    public Object mo2426d0() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f2205l;
        if (obj == f2126a) {
            obj = mo2372K();
        }
        return obj;
    }

    @Deprecated
    /* renamed from: d1 */
    public void mo2427d1(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d2 */
    public void mo2428d2(boolean z) {
        if (this.f2138N != null) {
            m2010y().f2196c = z;
        }
    }

    /* renamed from: e0 */
    public Object mo2429e0() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        return hVar.f2208o;
    }

    /* renamed from: e1 */
    public void mo2430e1() {
        this.f2133I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e2 */
    public void mo2431e2(float f) {
        m2010y().f2214u = f;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public Object mo2433f0() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f2209p;
        if (obj == f2126a) {
            obj = mo2429e0();
        }
        return obj;
    }

    /* renamed from: f1 */
    public void mo2434f1(Bundle bundle) {
    }

    @Deprecated
    /* renamed from: f2 */
    public void mo2435f2(boolean z) {
        this.f2129C = z;
        FragmentManager nVar = this.f2172t;
        if (nVar == null) {
            this.f2130D = true;
        } else if (z) {
            nVar.mo2798i(this);
        } else {
            nVar.mo2791e1(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g0 */
    public ArrayList<String> mo2436g0() {
        C0282h hVar = this.f2138N;
        if (hVar != null) {
            ArrayList<String> arrayList = hVar.f2202i;
            if (arrayList != null) {
                return arrayList;
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        this.f2133I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g2 */
    public void mo2438g2(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m2010y();
        C0282h hVar = this.f2138N;
        hVar.f2202i = arrayList;
        hVar.f2203j = arrayList2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h0 */
    public ArrayList<String> mo2439h0() {
        C0282h hVar = this.f2138N;
        if (hVar != null) {
            ArrayList<String> arrayList = hVar.f2203j;
            if (arrayList != null) {
                return arrayList;
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        this.f2133I = true;
    }

    @Deprecated
    /* renamed from: h2 */
    public void mo2441h2(boolean z) {
        if (!this.f2137M && z && this.f2152b < 5 && this.f2172t != null && mo2465r0() && this.f2144T) {
            FragmentManager nVar = this.f2172t;
            nVar.mo2778U0(nVar.mo2824w(this));
        }
        this.f2137M = z;
        this.f2136L = this.f2152b < 5 && !z;
        if (this.f2154c != null) {
            this.f2158f = Boolean.valueOf(z);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public final String mo2443i0(int i) {
        return mo2423c0().getString(i);
    }

    /* renamed from: i1 */
    public void mo2444i1(View view, Bundle bundle) {
    }

    /* renamed from: i2 */
    public void mo2445i2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        mo2448j2(intent, null);
    }

    /* renamed from: j0 */
    public final String mo2446j0(int i, Object... objArr) {
        return mo2423c0().getString(i, objArr);
    }

    /* renamed from: j1 */
    public void mo2447j1(Bundle bundle) {
        this.f2133I = true;
    }

    /* renamed from: j2 */
    public void mo2448j2(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        FragmentHostCallback<?> kVar = this.f2173u;
        if (kVar != null) {
            kVar.mo2724r(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    /* renamed from: k0 */
    public final Fragment mo2449k0() {
        Fragment fragment = this.f2161i;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager nVar = this.f2172t;
        if (nVar != null) {
            String str = this.f2162j;
            if (str != null) {
                return nVar.mo2794g0(str);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k1 */
    public void mo2450k1(Bundle bundle) {
        this.f2174v.mo2775S0();
        this.f2152b = 3;
        this.f2133I = false;
        mo2353D0(bundle);
        if (this.f2133I) {
            m2006R1();
            this.f2174v.mo2829z();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* renamed from: k2 */
    public void mo2451k2() {
        if (this.f2138N != null && m2010y().f2216w) {
            if (this.f2173u == null) {
                m2010y().f2216w = false;
            } else if (Looper.myLooper() != this.f2173u.mo2722k().getLooper()) {
                this.f2173u.mo2722k().postAtFrontOfQueue(new C0276b());
            } else {
                mo2474v(true);
            }
        }
    }

    /* renamed from: l0 */
    public View mo2452l0() {
        return this.f2135K;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l1 */
    public void mo2453l1() {
        Iterator it = this.f2155c0.iterator();
        while (it.hasNext()) {
            ((C0284j) it.next()).mo2495a();
        }
        this.f2155c0.clear();
        this.f2174v.mo2804k(this.f2173u, mo2477w(), this);
        this.f2152b = 0;
        this.f2133I = false;
        mo2362G0(this.f2173u.mo2721i());
        if (this.f2133I) {
            this.f2172t.mo2758J(this);
            this.f2174v.mo2743A();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onAttach()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* renamed from: m0 */
    public LifecycleOwner mo2454m0() {
        FragmentViewLifecycleOwner b0Var = this.f2147W;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m1 */
    public void mo2455m1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2174v.mo2744B(configuration);
    }

    /* renamed from: n0 */
    public LiveData<LifecycleOwner> mo2456n0() {
        return this.f2148X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n1 */
    public boolean mo2457n1(MenuItem menuItem) {
        if (this.f2127A) {
            return false;
        }
        if (mo2368I0(menuItem)) {
            return true;
        }
        return this.f2174v.mo2746C(menuItem);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o1 */
    public void mo2458o1(Bundle bundle) {
        this.f2174v.mo2775S0();
        this.f2152b = 1;
        this.f2133I = false;
        if (VERSION.SDK_INT >= 19) {
            this.f2146V.mo2999a(new LifecycleEventObserver() {
                /* renamed from: c */
                public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                    if (bVar == C0377b.ON_STOP) {
                        View view = Fragment.this.f2135K;
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        this.f2150Z.mo3937c(bundle);
        mo2370J0(bundle);
        this.f2144T = true;
        if (this.f2133I) {
            this.f2146V.mo3004h(C0377b.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new SuperNotCalledException(sb.toString());
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2133I = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        mo2379M1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f2133I = true;
    }

    /* renamed from: p */
    public ViewModelStore mo144p() {
        if (this.f2172t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (m2007T() != C0378c.INITIALIZED.ordinal()) {
            return this.f2172t.mo2745B0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p0 */
    public void mo2462p0() {
        m2008o0();
        this.f2159g = UUID.randomUUID().toString();
        this.f2165m = false;
        this.f2166n = false;
        this.f2167o = false;
        this.f2168p = false;
        this.f2169q = false;
        this.f2171s = 0;
        this.f2172t = null;
        this.f2174v = new FragmentManagerImpl();
        this.f2173u = null;
        this.f2176x = 0;
        this.f2177y = 0;
        this.f2178z = null;
        this.f2127A = false;
        this.f2128B = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p1 */
    public boolean mo2463p1(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2127A) {
            return false;
        }
        if (this.f2131G && this.f2132H) {
            z = true;
            mo2378M0(menu, menuInflater);
        }
        return z | this.f2174v.mo2750E(menu, menuInflater);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q1 */
    public void mo2464q1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2174v.mo2775S0();
        this.f2170r = true;
        this.f2147W = new FragmentViewLifecycleOwner(this, mo144p());
        View N0 = mo2381N0(layoutInflater, viewGroup, bundle);
        this.f2135K = N0;
        if (N0 != null) {
            this.f2147W.mo2565e();
            ViewTreeLifecycleOwner.m2808a(this.f2135K, this.f2147W);
            ViewTreeViewModelStoreOwner.m2809a(this.f2135K, this.f2147W);
            ViewTreeSavedStateRegistryOwner.m4001a(this.f2135K, this.f2147W);
            this.f2148X.mo2977j(this.f2147W);
        } else if (!this.f2147W.mo2566f()) {
            this.f2147W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: r0 */
    public final boolean mo2465r0() {
        return this.f2173u != null && this.f2165m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r1 */
    public void mo2466r1() {
        this.f2174v.mo2752F();
        this.f2146V.mo3004h(C0377b.ON_DESTROY);
        this.f2152b = 0;
        this.f2133I = false;
        this.f2144T = false;
        mo2384O0();
        if (!this.f2133I) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroy()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    /* renamed from: s0 */
    public final boolean mo2467s0() {
        return this.f2128B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s1 */
    public void mo2468s1() {
        this.f2174v.mo2754G();
        if (this.f2135K != null && this.f2147W.mo132b().mo3000b().mo3003a(C0378c.CREATED)) {
            this.f2147W.mo2564a(C0377b.ON_DESTROY);
        }
        this.f2152b = 1;
        this.f2133I = false;
        mo2390Q0();
        if (this.f2133I) {
            LoaderManager.m5850b(this).mo5292c();
            this.f2170r = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* renamed from: t0 */
    public final boolean mo2469t0() {
        return this.f2127A;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t1 */
    public void mo2470t1() {
        this.f2152b = -1;
        this.f2133I = false;
        mo2393R0();
        this.f2143S = null;
        if (!this.f2133I) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new SuperNotCalledException(sb.toString());
        } else if (!this.f2174v.mo2753F0()) {
            this.f2174v.mo2752F();
            this.f2174v = new FragmentManagerImpl();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2159g);
        if (this.f2176x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2176x));
        }
        if (this.f2178z != null) {
            sb.append(" tag=");
            sb.append(this.f2178z);
        }
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public boolean mo2472u0() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return false;
        }
        return hVar.f2218y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u1 */
    public LayoutInflater mo2473u1(Bundle bundle) {
        LayoutInflater S0 = mo2395S0(bundle);
        this.f2143S = S0;
        return S0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo2474v(boolean z) {
        C0282h hVar = this.f2138N;
        C0285k kVar = null;
        if (hVar != null) {
            hVar.f2216w = false;
            C0285k kVar2 = hVar.f2217x;
            hVar.f2217x = null;
            kVar = kVar2;
        }
        if (kVar != null) {
            kVar.mo2496a();
        } else if (FragmentManager.f2397b && this.f2135K != null) {
            ViewGroup viewGroup = this.f2134J;
            if (viewGroup != null) {
                FragmentManager nVar = this.f2172t;
                if (nVar != null) {
                    SpecialEffectsController n = SpecialEffectsController.m2285n(viewGroup, nVar);
                    n.mo2625p();
                    if (z) {
                        this.f2173u.mo2722k().post(new C0277c(n));
                    } else {
                        n.mo2620g();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v0 */
    public final boolean mo2475v0() {
        return this.f2171s > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v1 */
    public void mo2476v1() {
        onLowMemory();
        this.f2174v.mo2755H();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public FragmentContainer mo2477w() {
        return new C0278d();
    }

    /* renamed from: w0 */
    public final boolean mo2478w0() {
        if (this.f2132H) {
            FragmentManager nVar = this.f2172t;
            if (nVar == null || nVar.mo2757I0(this.f2175w)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w1 */
    public void mo2479w1(boolean z) {
        mo2406W0(z);
        this.f2174v.mo2756I(z);
    }

    /* renamed from: x */
    public void mo2480x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2176x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2177y));
        printWriter.print(" mTag=");
        printWriter.println(this.f2178z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2152b);
        printWriter.print(" mWho=");
        printWriter.print(this.f2159g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2171s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2165m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2166n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2167o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2168p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2127A);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2128B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2132H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2131G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2129C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2137M);
        if (this.f2172t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2172t);
        }
        if (this.f2173u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2173u);
        }
        if (this.f2175w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2175w);
        }
        if (this.f2160h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2160h);
        }
        if (this.f2154c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2154c);
        }
        if (this.f2156d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2156d);
        }
        if (this.f2157e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2157e);
        }
        Fragment k0 = mo2449k0();
        if (k0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(k0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2163k);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(mo2408X());
        if (mo2369J() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(mo2369J());
        }
        if (mo2377M() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(mo2377M());
        }
        if (mo2411Y() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(mo2411Y());
        }
        if (mo2414Z() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(mo2414Z());
        }
        if (this.f2134J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2134J);
        }
        if (this.f2135K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2135K);
        }
        if (mo2355E() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo2355E());
        }
        if (mo2367I() != null) {
            LoaderManager.m5850b(this).mo5291a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.f2174v);
        sb.append(":");
        printWriter.println(sb.toString());
        FragmentManager nVar = this.f2174v;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        nVar.mo2782X(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x0 */
    public boolean mo2481x0() {
        C0282h hVar = this.f2138N;
        if (hVar == null) {
            return false;
        }
        return hVar.f2216w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x1 */
    public boolean mo2482x1(MenuItem menuItem) {
        if (this.f2127A) {
            return false;
        }
        if (!this.f2131G || !this.f2132H || !mo2409X0(menuItem)) {
            return this.f2174v.mo2760K(menuItem);
        }
        return true;
    }

    /* renamed from: y0 */
    public final boolean mo2483y0() {
        return this.f2166n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y1 */
    public void mo2484y1(Menu menu) {
        if (!this.f2127A) {
            if (this.f2131G && this.f2132H) {
                mo2412Y0(menu);
            }
            this.f2174v.mo2762L(menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public Fragment mo2485z(String str) {
        if (str.equals(this.f2159g)) {
            return this;
        }
        return this.f2174v.mo2802j0(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z0 */
    public final boolean mo2486z0() {
        Fragment V = mo2402V();
        return V != null && (V.mo2483y0() || V.mo2486z0());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z1 */
    public void mo2487z1() {
        this.f2174v.mo2765N();
        if (this.f2135K != null) {
            this.f2147W.mo2564a(C0377b.ON_PAUSE);
        }
        this.f2146V.mo3004h(C0377b.ON_PAUSE);
        this.f2152b = 6;
        this.f2133I = false;
        mo2415Z0();
        if (!this.f2133I) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    public Fragment(int i) {
        this();
        this.f2151a0 = i;
    }
}
