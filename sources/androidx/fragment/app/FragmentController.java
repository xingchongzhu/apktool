package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import p010b.p034g.p042j.Preconditions;

/* renamed from: androidx.fragment.app.i */
public class FragmentController {

    /* renamed from: a */
    private final FragmentHostCallback<?> f2382a;

    private FragmentController(FragmentHostCallback<?> kVar) {
        this.f2382a = kVar;
    }

    /* renamed from: b */
    public static FragmentController m2353b(FragmentHostCallback<?> kVar) {
        return new FragmentController((FragmentHostCallback) Preconditions.m5189f(kVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo2696a(Fragment fragment) {
        FragmentHostCallback<?> kVar = this.f2382a;
        kVar.f2388e.mo2804k(kVar, kVar, fragment);
    }

    /* renamed from: c */
    public void mo2697c() {
        this.f2382a.f2388e.mo2829z();
    }

    /* renamed from: d */
    public void mo2698d(Configuration configuration) {
        this.f2382a.f2388e.mo2744B(configuration);
    }

    /* renamed from: e */
    public boolean mo2699e(MenuItem menuItem) {
        return this.f2382a.f2388e.mo2746C(menuItem);
    }

    /* renamed from: f */
    public void mo2700f() {
        this.f2382a.f2388e.mo2748D();
    }

    /* renamed from: g */
    public boolean mo2701g(Menu menu, MenuInflater menuInflater) {
        return this.f2382a.f2388e.mo2750E(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo2702h() {
        this.f2382a.f2388e.mo2752F();
    }

    /* renamed from: i */
    public void mo2703i() {
        this.f2382a.f2388e.mo2755H();
    }

    /* renamed from: j */
    public void mo2704j(boolean z) {
        this.f2382a.f2388e.mo2756I(z);
    }

    /* renamed from: k */
    public boolean mo2705k(MenuItem menuItem) {
        return this.f2382a.f2388e.mo2760K(menuItem);
    }

    /* renamed from: l */
    public void mo2706l(Menu menu) {
        this.f2382a.f2388e.mo2762L(menu);
    }

    /* renamed from: m */
    public void mo2707m() {
        this.f2382a.f2388e.mo2765N();
    }

    /* renamed from: n */
    public void mo2708n(boolean z) {
        this.f2382a.f2388e.mo2766O(z);
    }

    /* renamed from: o */
    public boolean mo2709o(Menu menu) {
        return this.f2382a.f2388e.mo2768P(menu);
    }

    /* renamed from: p */
    public void mo2710p() {
        this.f2382a.f2388e.mo2772R();
    }

    /* renamed from: q */
    public void mo2711q() {
        this.f2382a.f2388e.mo2774S();
    }

    /* renamed from: r */
    public void mo2712r() {
        this.f2382a.f2388e.mo2777U();
    }

    /* renamed from: s */
    public boolean mo2713s() {
        return this.f2382a.f2388e.mo2786b0(true);
    }

    /* renamed from: t */
    public FragmentManager mo2714t() {
        return this.f2382a.f2388e;
    }

    /* renamed from: u */
    public void mo2715u() {
        this.f2382a.f2388e.mo2775S0();
    }

    /* renamed from: v */
    public View mo2716v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2382a.f2388e.mo2823v0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void mo2717w(Parcelable parcelable) {
        FragmentHostCallback<?> kVar = this.f2382a;
        if (kVar instanceof ViewModelStoreOwner) {
            kVar.f2388e.mo2795g1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable mo2718x() {
        return this.f2382a.f2388e.mo2800i1();
    }
}
