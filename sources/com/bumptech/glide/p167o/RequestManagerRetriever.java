package com.bumptech.glide.p167o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder.C1409d;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.p158p.p159d.HardwareConfigState;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p010b.p025d.ArrayMap;

/* renamed from: com.bumptech.glide.o.p */
public class RequestManagerRetriever implements Callback {

    /* renamed from: a */
    private static final C1620b f11090a = new C1619a();

    /* renamed from: b */
    private volatile RequestManager f11091b;

    /* renamed from: c */
    final Map<FragmentManager, RequestManagerFragment> f11092c = new HashMap();

    /* renamed from: d */
    final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f11093d = new HashMap();

    /* renamed from: e */
    private final Handler f11094e;

    /* renamed from: f */
    private final C1620b f11095f;

    /* renamed from: g */
    private final ArrayMap<View, Fragment> f11096g = new ArrayMap<>();

    /* renamed from: h */
    private final ArrayMap<View, android.app.Fragment> f11097h = new ArrayMap<>();

    /* renamed from: i */
    private final Bundle f11098i = new Bundle();

    /* renamed from: j */
    private final FrameWaiter f11099j;

    /* renamed from: com.bumptech.glide.o.p$a */
    /* compiled from: RequestManagerRetriever */
    class C1619a implements C1620b {
        C1619a() {
        }

        /* renamed from: a */
        public RequestManager mo9402a(Glide bVar, C1617l lVar, RequestManagerTreeNode qVar, Context context) {
            return new RequestManager(bVar, lVar, qVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.o.p$b */
    /* compiled from: RequestManagerRetriever */
    public interface C1620b {
        /* renamed from: a */
        RequestManager mo9402a(Glide bVar, C1617l lVar, RequestManagerTreeNode qVar, Context context);
    }

    public RequestManagerRetriever(C1620b bVar, GlideExperiments eVar) {
        if (bVar == null) {
            bVar = f11090a;
        }
        this.f11095f = bVar;
        this.f11094e = new Handler(Looper.getMainLooper(), this);
        this.f11099j = m13753b(eVar);
    }

    @TargetApi(17)
    /* renamed from: a */
    private static void m13752a(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static FrameWaiter m13753b(GlideExperiments eVar) {
        FrameWaiter kVar;
        if (!HardwareConfigState.f10886b || !HardwareConfigState.f10885a) {
            return new DoNothingFirstFrameWaiter();
        }
        if (eVar.mo8711a(C1409d.class)) {
            kVar = new FirstFrameAndAfterTrimMemoryWaiter();
        } else {
            kVar = new FirstFrameWaiter();
        }
        return kVar;
    }

    /* renamed from: c */
    private static Activity m13754c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m13754c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: d */
    private void m13755d(FragmentManager fragmentManager, ArrayMap<View, android.app.Fragment> aVar) {
        if (VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    m13755d(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        m13756e(fragmentManager, aVar);
    }

    @Deprecated
    /* renamed from: e */
    private void m13756e(FragmentManager fragmentManager, ArrayMap<View, android.app.Fragment> aVar) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            String str = "key";
            this.f11098i.putInt(str, i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f11098i, str);
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    if (VERSION.SDK_INT >= 17) {
                        m13755d(fragment.getChildFragmentManager(), aVar);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m13757f(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (!(fragment == null || fragment.mo2452l0() == null)) {
                    map.put(fragment.mo2452l0(), fragment);
                    m13757f(fragment.mo2364H().mo2819t0(), map);
                }
            }
        }
    }

    @Deprecated
    /* renamed from: g */
    private android.app.Fragment m13758g(View view, Activity activity) {
        this.f11097h.clear();
        m13755d(activity.getFragmentManager(), this.f11097h);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById)) {
            fragment = (android.app.Fragment) this.f11097h.get(view);
            if (fragment != null || !(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        this.f11097h.clear();
        return fragment;
    }

    /* renamed from: h */
    private Fragment m13759h(View view, FragmentActivity eVar) {
        this.f11096g.clear();
        m13757f(eVar.mo2656t().mo2819t0(), this.f11096g);
        View findViewById = eVar.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById)) {
            fragment = (Fragment) this.f11096g.get(view);
            if (fragment != null || !(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        this.f11096g.clear();
        return fragment;
    }

    @Deprecated
    /* renamed from: i */
    private RequestManager m13760i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        RequestManagerFragment r = m13762r(fragmentManager, fragment);
        RequestManager e = r.mo9382e();
        if (e == null) {
            e = this.f11095f.mo9402a(Glide.m12384c(context), r.mo9381c(), r.mo9383f(), context);
            if (z) {
                e.mo8741b();
            }
            r.mo9385k(e);
        }
        return e;
    }

    /* renamed from: p */
    private RequestManager m13761p(Context context) {
        if (this.f11091b == null) {
            synchronized (this) {
                if (this.f11091b == null) {
                    this.f11091b = this.f11095f.mo9402a(Glide.m12384c(context.getApplicationContext()), new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), context.getApplicationContext());
                }
            }
        }
        return this.f11091b;
    }

    /* renamed from: r */
    private RequestManagerFragment m13762r(FragmentManager fragmentManager, android.app.Fragment fragment) {
        String str = "com.bumptech.glide.manager";
        RequestManagerFragment oVar = (RequestManagerFragment) fragmentManager.findFragmentByTag(str);
        if (oVar != null) {
            return oVar;
        }
        RequestManagerFragment oVar2 = (RequestManagerFragment) this.f11092c.get(fragmentManager);
        if (oVar2 != null) {
            return oVar2;
        }
        RequestManagerFragment oVar3 = new RequestManagerFragment();
        oVar3.mo9384j(fragment);
        this.f11092c.put(fragmentManager, oVar3);
        fragmentManager.beginTransaction().add(oVar3, str).commitAllowingStateLoss();
        this.f11094e.obtainMessage(1, fragmentManager).sendToTarget();
        return oVar3;
    }

    /* renamed from: t */
    private SupportRequestManagerFragment m13763t(androidx.fragment.app.FragmentManager nVar, Fragment fragment) {
        String str = "com.bumptech.glide.manager";
        SupportRequestManagerFragment sVar = (SupportRequestManagerFragment) nVar.mo2799i0(str);
        if (sVar != null) {
            return sVar;
        }
        SupportRequestManagerFragment sVar2 = (SupportRequestManagerFragment) this.f11093d.get(nVar);
        if (sVar2 != null) {
            return sVar2;
        }
        SupportRequestManagerFragment sVar3 = new SupportRequestManagerFragment();
        sVar3.mo9415v2(fragment);
        this.f11093d.put(nVar, sVar3);
        nVar.mo2808m().mo2938e(sVar3, str).mo2517i();
        this.f11094e.obtainMessage(2, nVar).sendToTarget();
        return sVar3;
    }

    /* renamed from: u */
    private static boolean m13764u(Context context) {
        Activity c = m13754c(context);
        return c == null || !c.isFinishing();
    }

    /* renamed from: v */
    private RequestManager m13765v(Context context, androidx.fragment.app.FragmentManager nVar, Fragment fragment, boolean z) {
        SupportRequestManagerFragment t = m13763t(nVar, fragment);
        RequestManager p2 = t.mo9413p2();
        if (p2 == null) {
            p2 = this.f11095f.mo9402a(Glide.m12384c(context), t.mo9412n2(), t.mo9414q2(), context);
            if (z) {
                p2.mo8741b();
            }
            t.mo9416w2(p2);
        }
        return p2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            int r0 = r6.what
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0018
            r3 = 2
            if (r0 == r3) goto L_0x000c
            r2 = 0
            r6 = r1
            goto L_0x0026
        L_0x000c:
            java.lang.Object r6 = r6.obj
            r1 = r6
            androidx.fragment.app.n r1 = (androidx.fragment.app.FragmentManager) r1
            java.util.Map<androidx.fragment.app.n, com.bumptech.glide.o.s> r6 = r5.f11093d
            java.lang.Object r6 = r6.remove(r1)
            goto L_0x0023
        L_0x0018:
            java.lang.Object r6 = r6.obj
            r1 = r6
            android.app.FragmentManager r1 = (android.app.FragmentManager) r1
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.o.o> r6 = r5.f11092c
            java.lang.Object r6 = r6.remove(r1)
        L_0x0023:
            r4 = r1
            r1 = r6
            r6 = r4
        L_0x0026:
            if (r2 == 0) goto L_0x0047
            if (r1 != 0) goto L_0x0047
            r0 = 5
            java.lang.String r1 = "RMRetriever"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0047
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r1, r6)
        L_0x0047:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p167o.RequestManagerRetriever.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: j */
    public RequestManager mo9394j(Activity activity) {
        if (C1639k.m14099q()) {
            return mo9396l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return mo9399o((FragmentActivity) activity);
        }
        m13752a(activity);
        this.f11099j.mo9375a(activity);
        return m13760i(activity, activity.getFragmentManager(), null, m13764u(activity));
    }

    @TargetApi(17)
    @Deprecated
    /* renamed from: k */
    public RequestManager mo9395k(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C1639k.m14099q() || VERSION.SDK_INT < 17) {
            return mo9396l(fragment.getActivity().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                this.f11099j.mo9375a(fragment.getActivity());
            }
            return m13760i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    /* renamed from: l */
    public RequestManager mo9396l(Context context) {
        if (context != null) {
            if (C1639k.m14100r() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo9399o((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo9394j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo9396l(contextWrapper.getBaseContext());
                    }
                }
            }
            return m13761p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: m */
    public RequestManager mo9397m(View view) {
        if (C1639k.m14099q()) {
            return mo9396l(view.getContext().getApplicationContext());
        }
        C1638j.m14081d(view);
        C1638j.m14082e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = m13754c(view.getContext());
        if (c == null) {
            return mo9396l(view.getContext().getApplicationContext());
        }
        if (c instanceof FragmentActivity) {
            FragmentActivity eVar = (FragmentActivity) c;
            Fragment h = m13759h(view, eVar);
            return h != null ? mo9398n(h) : mo9399o(eVar);
        }
        android.app.Fragment g = m13758g(view, c);
        if (g == null) {
            return mo9394j(c);
        }
        return mo9395k(g);
    }

    /* renamed from: n */
    public RequestManager mo9398n(Fragment fragment) {
        C1638j.m14082e(fragment.mo2367I(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C1639k.m14099q()) {
            return mo9396l(fragment.mo2367I().getApplicationContext());
        }
        if (fragment.mo2346B() != null) {
            this.f11099j.mo9375a(fragment.mo2346B());
        }
        return m13765v(fragment.mo2367I(), fragment.mo2364H(), fragment, fragment.mo2347B0());
    }

    /* renamed from: o */
    public RequestManager mo9399o(FragmentActivity eVar) {
        if (C1639k.m14099q()) {
            return mo9396l(eVar.getApplicationContext());
        }
        m13752a(eVar);
        this.f11099j.mo9375a(eVar);
        return m13765v(eVar, eVar.mo2656t(), null, m13764u(eVar));
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: q */
    public RequestManagerFragment mo9400q(Activity activity) {
        return m13762r(activity.getFragmentManager(), null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public SupportRequestManagerFragment mo9401s(androidx.fragment.app.FragmentManager nVar) {
        return m13763t(nVar, null);
    }
}
