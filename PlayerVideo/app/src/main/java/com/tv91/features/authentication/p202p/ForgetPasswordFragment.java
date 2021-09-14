package com.tv91.features.authentication.p202p;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.C2148e;
import com.tv91.features.authentication.ForgetPasswordScreen;
import com.tv91.features.authentication.p203q.ResetPasswordUseCase;
import com.tv91.features.authentication.p203q.SendForgetPasswordEmailUseCase;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewForgetPasswordBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;

/* renamed from: com.tv91.features.authentication.p.v */
public final class ForgetPasswordFragment extends Hilt_ForgetPasswordFragment {

    /* renamed from: h0 */
    SendForgetPasswordEmailUseCase f13759h0;

    /* renamed from: i0 */
    ResetPasswordUseCase f13760i0;

    /* renamed from: j0 */
    private final ViewSupplier<C2148e> f13761j0 = new ViewSupplier<>(this, C2228l.f13747a);

    /* renamed from: k0 */
    private Navigator f13762k0;

    /* renamed from: l0 */
    private String f13763l0;

    /* renamed from: com.tv91.features.authentication.p.v$a */
    /* compiled from: ForgetPasswordFragment */
    public static final class C2238a extends FragmentKey {
        public static final Creator<C2238a> CREATOR = new C2239a();

        /* renamed from: com.tv91.features.authentication.p.v$a$a */
        /* compiled from: ForgetPasswordFragment */
        static class C2239a implements Creator<C2238a> {
            C2239a() {
            }

            /* renamed from: a */
            public C2238a createFromParcel(Parcel parcel) {
                return new C2238a(parcel);
            }

            /* renamed from: b */
            public C2238a[] newArray(int i) {
                return new C2238a[i];
            }
        }

        public C2238a() {
            super("忘記密碼頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new ForgetPasswordFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_bottom);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_bottom, 0);
        }

        protected C2238a(Parcel parcel) {
            super(parcel);
        }
    }

    public ForgetPasswordFragment() {
        super(R.layout.view_forget_password);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo16646B2() {
        this.f13762k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo16647D2() {
        this.f13762k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo16648F2(CharSequence charSequence) {
        mo16657V2(charSequence.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo16649H2(ForgetPasswordScreen dVar) {
        mo16656U2(this.f13763l0, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo16650J2(ErrorBundle cVar) {
        mo16658q2(cVar, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo16651L2() {
        ((C2148e) this.f13761j0.mo4947a()).mo16493x();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void mo16652N2() {
        ((C2148e) this.f13761j0.mo4947a()).mo16492s(new C2230n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void mo16653P2() {
        ((C2148e) this.f13761j0.mo4947a()).mo16494z0();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void mo16654R2(String str) {
        this.f13763l0 = str;
        ((C2148e) this.f13761j0.mo4947a()).mo16491p0();
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void mo16655T2(ErrorBundle cVar) {
        mo16658q2(cVar, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo16659s2(ErrorBundle cVar) {
        ((C2148e) this.f13761j0.mo4947a()).mo16484Q(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo16660u2(Integer num) {
        ((C2148e) this.f13761j0.mo4947a()).mo16487e2(mo2443i0(num.intValue()));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo16661w2(ErrorBundle cVar) {
        ((C2148e) this.f13761j0.mo4947a()).mo16490k1(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo16662y2(Integer num) {
        ((C2148e) this.f13761j0.mo4947a()).mo16489j1(mo2443i0(num.intValue()));
    }

    /* renamed from: z2 */
    static /* synthetic */ C2148e m16988z2(View view) {
        return new ForgetPasswordView(ViewForgetPasswordBinding.m17733b(view));
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f13762k0 = Navigator.m20631b(this);
    }

    /* renamed from: U2 */
    public void mo16656U2(String str, ForgetPasswordScreen dVar) {
        this.f13760i0.mo16701v(new C2217a(this)).mo16702w(new C2224h(this)).mo16700u(new C2220d(this)).mo16696o(str, dVar.f13622a, dVar.f13623b, dVar.f13624c);
    }

    /* renamed from: V2 */
    public void mo16657V2(String str) {
        this.f13759h0.mo16708v(new C2227k(this)).mo16709w(new C2231o(this)).mo16707u(new C2226j(this)).mo16703o(str);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2148e) this.f13761j0.mo4947a()).mo16486d(new C2218b(this));
        ((C2148e) this.f13761j0.mo4947a()).mo16488f(new C2225i(this));
        ((C2148e) this.f13761j0.mo4947a()).mo16485U0(new C2221e(this));
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f13759h0.mo17051a();
        this.f13760i0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo16658q2(ErrorBundle cVar, boolean z) {
        if (z) {
            ErrorHandler.m17647d(new C2222f(this)).mo17047e(new C2219c(this)).mo4887a(cVar);
        } else {
            ErrorHandler.m17647d(new C2229m(this)).mo17047e(new C2223g(this)).mo4887a(cVar);
        }
    }
}
