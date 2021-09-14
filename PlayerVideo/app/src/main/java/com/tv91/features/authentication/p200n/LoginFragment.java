package com.tv91.features.authentication.p200n;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.C2150h;
import com.tv91.features.authentication.LoginScreen;
import com.tv91.features.authentication.p201o.RegisterFragment.C2215a;
import com.tv91.features.authentication.p202p.ForgetPasswordFragment.C2238a;
import com.tv91.features.authentication.p203q.LoginUseCase;
import com.tv91.features.authentication.p203q.MobileLoginUseCase;
import com.tv91.features.authentication.p203q.QuickRegisterUseCase;
import com.tv91.features.authentication.p203q.SendSMSUseCase;
import com.tv91.features.authentication.p203q.SendSMSUseCase.C2246a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.User;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewLoginBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.C3060h;

/* renamed from: com.tv91.features.authentication.n.i0 */
public final class LoginFragment extends Hilt_LoginFragment {

    /* renamed from: h0 */
    C3060h f13683h0;

    /* renamed from: i0 */
    LoginUseCase f13684i0;

    /* renamed from: j0 */
    SendSMSUseCase f13685j0;

    /* renamed from: k0 */
    MobileLoginUseCase f13686k0;

    /* renamed from: l0 */
    QuickRegisterUseCase f13687l0;

    /* renamed from: m0 */
    private final ViewSupplier<C2150h> f13688m0 = new ViewSupplier<>(this, C2170b.f13664a);

    /* renamed from: n0 */
    private Navigator f13689n0;

    /* renamed from: o0 */
    private String f13690o0;

    /* renamed from: p0 */
    private String f13691p0;

    /* renamed from: q0 */
    private boolean f13692q0;

    /* renamed from: com.tv91.features.authentication.n.i0$a */
    /* compiled from: LoginFragment */
    public static final class C2184a extends FragmentKey {
        public static final Creator<C2184a> CREATOR = new C2185a();

        /* renamed from: com.tv91.features.authentication.n.i0$a$a */
        /* compiled from: LoginFragment */
        static class C2185a implements Creator<C2184a> {
            C2185a() {
            }

            /* renamed from: a */
            public C2184a createFromParcel(Parcel parcel) {
                return new C2184a(parcel);
            }

            /* renamed from: b */
            public C2184a[] newArray(int i) {
                return new C2184a[i];
            }
        }

        public C2184a() {
            super("登入頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new LoginFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_fade, 0);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (!z) {
                xVar.mo2944r(0, R.anim.exit_fade);
            }
        }

        protected C2184a(Parcel parcel) {
            super(parcel);
        }
    }

    public LoginFragment() {
        super(R.layout.view_login);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo16573B2(ErrorBundle cVar) {
        ((C2150h) this.f13688m0.mo4947a()).mo16511k(cVar.mo17112b());
    }

    /* renamed from: C2 */
    static /* synthetic */ C2150h m16817C2(View view) {
        return new LoginView(ViewLoginBinding.m17740b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo16574E2() {
        this.f13689n0.mo18585a();
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void mo16575G2() {
        if (this.f13692q0) {
            this.f13692q0 = false;
            ((C2150h) this.f13688m0.mo4947a()).mo16506c1(this.f13690o0, this.f13691p0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void mo16576I2() {
        if (!this.f13692q0) {
            this.f13692q0 = true;
            ((C2150h) this.f13688m0.mo4947a()).mo16500B1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void mo16577K2(LoginScreen gVar) {
        if (this.f13692q0) {
            mo16587d3(gVar);
        } else {
            mo16590q2(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void mo16578M2(CharSequence charSequence) {
        mo16589f3(charSequence.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void mo16579O2() {
        this.f13689n0.mo18588e(new C2238a());
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void mo16580Q2() {
        this.f13689n0.mo18588e(new C2215a());
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void mo16581S2() {
        ((C2150h) this.f13688m0.mo4947a()).mo16510j();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void mo16582U2(User user) {
        this.f13689n0.mo18585a();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void mo16583W2() {
        ((C2150h) this.f13688m0.mo4947a()).mo16510j();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void mo16584Y2(User user) {
        this.f13689n0.mo18585a();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void mo16585a3() {
        ((C2150h) this.f13688m0.mo4947a()).mo16510j();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void mo16586c3() {
        ((C2150h) this.f13688m0.mo4947a()).mo16501D0();
        ((C2150h) this.f13688m0.mo4947a()).mo16512l();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo16592t2() {
        ((C2150h) this.f13688m0.mo4947a()).mo16510j();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo16593v2(User user) {
        this.f13689n0.mo18585a();
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo16594x2(ErrorBundle cVar) {
        ((C2150h) this.f13688m0.mo4947a()).mo16502G(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo16595z2(Integer num) {
        ((C2150h) this.f13688m0.mo4947a()).mo16509g(mo2443i0(num.intValue()));
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f13689n0 = Navigator.m20631b(this);
        this.f13690o0 = this.f13683h0.mo18611a();
        this.f13691p0 = this.f13683h0.mo18613c();
    }

    /* renamed from: d3 */
    public void mo16587d3(LoginScreen gVar) {
        this.f13686k0.mo16758v(new C2180g(this)).mo16759w(new C2178f(this)).mo16757u(new C2179f0(this)).mo16753o(gVar.f13629a, gVar.f13630b);
    }

    /* renamed from: e3 */
    public void mo16588e3() {
        this.f13687l0.mo16686v(new C2193q(this)).mo16687w(new C2186j(this)).mo16685u(new C2179f0(this)).mo16681o();
    }

    /* renamed from: f3 */
    public void mo16589f3(String str) {
        this.f13685j0.mo16716v(new C2168a(this)).mo16717w(new C2191o(this)).mo16715u(new C2179f0(this)).mo16711o(C2246a.LOGIN, str);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2150h) this.f13688m0.mo4947a()).mo16507d(new C2187k(this));
        ((C2150h) this.f13688m0.mo4947a()).mo16504X(new C2182h(this));
        ((C2150h) this.f13688m0.mo4947a()).mo16499A0(new C2188l(this));
        ((C2150h) this.f13688m0.mo4947a()).mo16505Z1(new C2183i(this));
        ((C2150h) this.f13688m0.mo4947a()).mo16508f(new C2172c(this));
        ((C2150h) this.f13688m0.mo4947a()).mo16513u0(new C2174d(this));
        ((C2150h) this.f13688m0.mo4947a()).mo16503I(new C2176e(this));
        ((C2150h) this.f13688m0.mo4947a()).mo16514v1(new C2181g0(this));
        if (this.f13692q0) {
            ((C2150h) this.f13688m0.mo4947a()).mo16500B1();
        } else {
            ((C2150h) this.f13688m0.mo4947a()).mo16506c1(this.f13690o0, this.f13691p0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f13684i0.mo17051a();
        this.f13685j0.mo17051a();
        this.f13686k0.mo17051a();
        this.f13687l0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo16590q2(LoginScreen gVar) {
        LoginUseCase u = this.f13684i0.mo16746v(new C2189m(this)).mo16747w(new C2192p(this)).mo16745u(new C2179f0(this));
        String str = gVar.f13629a;
        this.f13690o0 = str;
        String str2 = gVar.f13630b;
        this.f13691p0 = str2;
        u.mo16741o(str, str2);
    }

    /* renamed from: r2 */
    public void mo16591r2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2195s(this)).mo17047e(new C2190n(this)).mo17046c("A000073", new C2194r(this)).mo4887a(cVar);
    }
}
