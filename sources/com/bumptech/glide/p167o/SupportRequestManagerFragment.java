package com.bumptech.glide.p167o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.o.s */
public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: d0 */
    private final ActivityFragmentLifecycle f11103d0;

    /* renamed from: e0 */
    private final RequestManagerTreeNode f11104e0;

    /* renamed from: f0 */
    private final Set<SupportRequestManagerFragment> f11105f0;

    /* renamed from: g0 */
    private SupportRequestManagerFragment f11106g0;

    /* renamed from: h0 */
    private RequestManager f11107h0;

    /* renamed from: i0 */
    private Fragment f11108i0;

    /* renamed from: com.bumptech.glide.o.s$a */
    /* compiled from: SupportRequestManagerFragment */
    private class C1621a implements RequestManagerTreeNode {
        C1621a() {
        }

        /* renamed from: a */
        public Set<RequestManager> mo9376a() {
            Set<SupportRequestManagerFragment> m2 = SupportRequestManagerFragment.this.mo9411m2();
            HashSet hashSet = new HashSet(m2.size());
            for (SupportRequestManagerFragment sVar : m2) {
                if (sVar.mo9413p2() != null) {
                    hashSet.add(sVar.mo9413p2());
                }
            }
            return hashSet;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(SupportRequestManagerFragment.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public SupportRequestManagerFragment() {
        this(new ActivityFragmentLifecycle());
    }

    /* renamed from: l2 */
    private void m13784l2(SupportRequestManagerFragment sVar) {
        this.f11105f0.add(sVar);
    }

    /* renamed from: o2 */
    private Fragment m13785o2() {
        Fragment V = mo2402V();
        return V != null ? V : this.f11108i0;
    }

    /* renamed from: r2 */
    private static FragmentManager m13786r2(Fragment fragment) {
        while (fragment.mo2402V() != null) {
            fragment = fragment.mo2402V();
        }
        return fragment.mo2389Q();
    }

    /* renamed from: s2 */
    private boolean m13787s2(Fragment fragment) {
        Fragment o2 = m13785o2();
        while (true) {
            Fragment V = fragment.mo2402V();
            if (V == null) {
                return false;
            }
            if (V.equals(o2)) {
                return true;
            }
            fragment = fragment.mo2402V();
        }
    }

    /* renamed from: t2 */
    private void m13788t2(Context context, FragmentManager nVar) {
        m13790x2();
        SupportRequestManagerFragment s = Glide.m12384c(context).mo8691k().mo9401s(nVar);
        this.f11106g0 = s;
        if (!equals(s)) {
            this.f11106g0.m13784l2(this);
        }
    }

    /* renamed from: u2 */
    private void m13789u2(SupportRequestManagerFragment sVar) {
        this.f11105f0.remove(sVar);
    }

    /* renamed from: x2 */
    private void m13790x2() {
        SupportRequestManagerFragment sVar = this.f11106g0;
        if (sVar != null) {
            sVar.m13789u2(this);
            this.f11106g0 = null;
        }
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        FragmentManager r2 = m13786r2(this);
        String str = "SupportRMFragment";
        if (r2 == null) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root, ancestor detached");
            }
            return;
        }
        try {
            m13788t2(mo2367I(), r2);
        } catch (IllegalStateException e) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    /* renamed from: O0 */
    public void mo2384O0() {
        super.mo2384O0();
        this.f11103d0.mo9369c();
        m13790x2();
    }

    /* renamed from: R0 */
    public void mo2393R0() {
        super.mo2393R0();
        this.f11108i0 = null;
        m13790x2();
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        this.f11103d0.mo9370d();
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f11103d0.mo9371e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m2 */
    public Set<SupportRequestManagerFragment> mo9411m2() {
        SupportRequestManagerFragment sVar = this.f11106g0;
        if (sVar == null) {
            return Collections.emptySet();
        }
        if (equals(sVar)) {
            return Collections.unmodifiableSet(this.f11105f0);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment sVar2 : this.f11106g0.mo9411m2()) {
            if (m13787s2(sVar2.m13785o2())) {
                hashSet.add(sVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n2 */
    public ActivityFragmentLifecycle mo9412n2() {
        return this.f11103d0;
    }

    /* renamed from: p2 */
    public RequestManager mo9413p2() {
        return this.f11107h0;
    }

    /* renamed from: q2 */
    public RequestManagerTreeNode mo9414q2() {
        return this.f11104e0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m13785o2());
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v2 */
    public void mo9415v2(Fragment fragment) {
        this.f11108i0 = fragment;
        if (!(fragment == null || fragment.mo2367I() == null)) {
            FragmentManager r2 = m13786r2(fragment);
            if (r2 != null) {
                m13788t2(fragment.mo2367I(), r2);
            }
        }
    }

    /* renamed from: w2 */
    public void mo9416w2(RequestManager kVar) {
        this.f11107h0 = kVar;
    }

    @SuppressLint({"ValidFragment"})
    public SupportRequestManagerFragment(ActivityFragmentLifecycle aVar) {
        this.f11104e0 = new C1621a();
        this.f11105f0 = new HashSet();
        this.f11103d0 = aVar;
    }
}
