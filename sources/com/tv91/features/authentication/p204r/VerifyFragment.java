package com.tv91.features.authentication.p204r;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.authentication.C2152l;
import com.tv91.features.authentication.VerifyScreen;
import com.tv91.features.authentication.p203q.SendSMSUseCase;
import com.tv91.features.authentication.p203q.SendSMSUseCase.C2246a;
import com.tv91.features.authentication.p203q.VerifyMobileUseCase;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewVerifyBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;

/* renamed from: com.tv91.features.authentication.r.w */
public final class VerifyFragment extends Hilt_VerifyFragment {

    /* renamed from: h0 */
    SendSMSUseCase f13887h0;

    /* renamed from: i0 */
    VerifyMobileUseCase f13888i0;

    /* renamed from: j0 */
    private final ViewSupplier<C2152l> f13889j0 = new ViewSupplier<>(this, C2274l.f13871a);

    /* renamed from: k0 */
    private Navigator f13890k0;

    /* renamed from: com.tv91.features.authentication.r.w$a */
    /* compiled from: VerifyFragment */
    public static final class C2284a extends FragmentKey {
        public static final Creator<C2284a> CREATOR = new C2285a();

        /* renamed from: com.tv91.features.authentication.r.w$a$a */
        /* compiled from: VerifyFragment */
        static class C2285a implements Creator<C2284a> {
            C2285a() {
            }

            /* renamed from: a */
            public C2284a createFromParcel(Parcel parcel) {
                return new C2284a(parcel);
            }

            /* renamed from: b */
            public C2284a[] newArray(int i) {
                return new C2284a[i];
            }
        }

        public C2284a() {
            super("手機驗證頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new VerifyFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_right);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_right, 0);
        }

        protected C2284a(Parcel parcel) {
            super(parcel);
        }
    }

    public VerifyFragment() {
        super(R.layout.view_verify);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo16773B2() {
        this.f13890k0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo16774D2() {
        this.f13890k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo16775F2(CharSequence charSequence) {
        mo16781Q2(charSequence.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo16776H2() {
        ((C2152l) this.f13889j0.mo4947a()).mo16527t1(true);
        ((C2152l) this.f13889j0.mo4947a()).mo16524j();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo16777J2() {
        ((C2152l) this.f13889j0.mo4947a()).mo16526l();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo16778L2(ErrorBundle cVar) {
        ((C2152l) this.f13889j0.mo4947a()).mo16527t1(false);
        mo16783q2(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void mo16779N2() {
        ((C2152l) this.f13889j0.mo4947a()).mo16524j();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void mo16780P2() {
        this.f13890k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo16784s2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2270h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo16785u2(ErrorBundle cVar) {
        ((C2152l) this.f13889j0.mo4947a()).mo16525k(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo16786w2(ErrorBundle cVar) {
        ((C2152l) this.f13889j0.mo4947a()).mo16552g0(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo16787y2(Integer num) {
        ((C2152l) this.f13889j0.mo4947a()).mo16523g(mo2443i0(num.intValue()));
    }

    /* renamed from: z2 */
    static /* synthetic */ C2152l m17191z2(View view) {
        return new VerifyView(ViewVerifyBinding.m17832b(view));
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f13890k0 = Navigator.m20631b(this);
    }

    /* renamed from: Q2 */
    public void mo16781Q2(String str) {
        this.f13887h0.mo16716v(new C2268f(this)).mo16717w(new C2273k(this)).mo16715u(new C2267e(this)).mo16711o(C2246a.VERIFY, str);
    }

    /* renamed from: R2 */
    public void mo16782R2(VerifyScreen kVar) {
        this.f13888i0.mo16724v(new C2264b(this)).mo16725w(new C2271i(this)).mo16723u(new C2283u(this)).mo16719o(kVar.f13635a, kVar.f13636b);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2152l) this.f13889j0.mo4947a()).mo16520b(new C2265c(this));
        ((C2152l) this.f13889j0.mo4947a()).mo16522f(new C2266d(this));
        ((C2152l) this.f13889j0.mo4947a()).mo16521b1(new C2263a(this));
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f13887h0.mo17051a();
        this.f13888i0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo16783q2(ErrorBundle cVar) {
        String str = "A000073";
        ErrorHandler.m17647d(new C2276n(this)).mo17047e(new C2272j(this)).mo17046c("0000001", new C2275m(this)).mo17046c(str, new C2269g(this)).mo4887a(cVar);
    }
}
