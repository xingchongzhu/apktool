package com.bumptech.glide.p167o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.o.o */
public class RequestManagerFragment extends Fragment {

    /* renamed from: a */
    private final ActivityFragmentLifecycle f11083a;

    /* renamed from: b */
    private final RequestManagerTreeNode f11084b;

    /* renamed from: c */
    private final Set<RequestManagerFragment> f11085c;

    /* renamed from: d */
    private RequestManager f11086d;

    /* renamed from: e */
    private RequestManagerFragment f11087e;

    /* renamed from: f */
    private Fragment f11088f;

    /* renamed from: com.bumptech.glide.o.o$a */
    /* compiled from: RequestManagerFragment */
    private class C1618a implements RequestManagerTreeNode {
        C1618a() {
        }

        /* renamed from: a */
        public Set<RequestManager> mo9376a() {
            Set<RequestManagerFragment> b = RequestManagerFragment.this.mo9380b();
            HashSet hashSet = new HashSet(b.size());
            for (RequestManagerFragment oVar : b) {
                if (oVar.mo9382e() != null) {
                    hashSet.add(oVar.mo9382e());
                }
            }
            return hashSet;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(RequestManagerFragment.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public RequestManagerFragment() {
        this(new ActivityFragmentLifecycle());
    }

    /* renamed from: a */
    private void m13739a(RequestManagerFragment oVar) {
        this.f11085c.add(oVar);
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m13740d() {
        Fragment parentFragment = VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f11088f;
    }

    @TargetApi(17)
    /* renamed from: g */
    private boolean m13741g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    private void m13742h(Activity activity) {
        m13744l();
        RequestManagerFragment q = Glide.m12384c(activity).mo8691k().mo9400q(activity);
        this.f11087e = q;
        if (!equals(q)) {
            this.f11087e.m13739a(this);
        }
    }

    /* renamed from: i */
    private void m13743i(RequestManagerFragment oVar) {
        this.f11085c.remove(oVar);
    }

    /* renamed from: l */
    private void m13744l() {
        RequestManagerFragment oVar = this.f11087e;
        if (oVar != null) {
            oVar.m13743i(this);
            this.f11087e = null;
        }
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(17)
    /* renamed from: b */
    public Set<RequestManagerFragment> mo9380b() {
        if (equals(this.f11087e)) {
            return Collections.unmodifiableSet(this.f11085c);
        }
        if (this.f11087e == null || VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment oVar : this.f11087e.mo9380b()) {
            if (m13741g(oVar.getParentFragment())) {
                hashSet.add(oVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ActivityFragmentLifecycle mo9381c() {
        return this.f11083a;
    }

    /* renamed from: e */
    public RequestManager mo9382e() {
        return this.f11086d;
    }

    /* renamed from: f */
    public RequestManagerTreeNode mo9383f() {
        return this.f11084b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo9384j(Fragment fragment) {
        this.f11088f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m13742h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo9385k(RequestManager kVar) {
        this.f11086d = kVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m13742h(activity);
        } catch (IllegalStateException e) {
            String str = "RMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11083a.mo9369c();
        m13744l();
    }

    public void onDetach() {
        super.onDetach();
        m13744l();
    }

    public void onStart() {
        super.onStart();
        this.f11083a.mo9370d();
    }

    public void onStop() {
        super.onStop();
        this.f11083a.mo9371e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m13740d());
        sb.append("}");
        return sb.toString();
    }

    @SuppressLint({"ValidFragment"})
    RequestManagerFragment(ActivityFragmentLifecycle aVar) {
        this.f11084b = new C1618a();
        this.f11085c = new HashSet();
        this.f11083a = aVar;
    }
}
