package com.tv91.features.authentication.p199m;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.authentication.C2147c;
import com.tv91.features.authentication.ChangePasswordScreen;
import com.tv91.features.authentication.p203q.LogoutUseCase;
import com.tv91.features.authentication.p203q.ModifyPasswordUseCase;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewChangePasswordBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;

/* renamed from: com.tv91.features.authentication.m.n */
public final class ChangePasswordFragment extends Hilt_ChangePasswordFragment {

    /* renamed from: h0 */
    ModifyPasswordUseCase f13652h0;

    /* renamed from: i0 */
    LogoutUseCase f13653i0;

    /* renamed from: j0 */
    private final ViewSupplier<C2147c> f13654j0 = new ViewSupplier<>(this, C2158f.f13642a);

    /* renamed from: k0 */
    private Navigator f13655k0;

    /* renamed from: com.tv91.features.authentication.m.n$a */
    /* compiled from: ChangePasswordFragment */
    public static final class C2166a extends FragmentKey {
        public static final Creator<C2166a> CREATOR = new C2167a();

        /* renamed from: com.tv91.features.authentication.m.n$a$a */
        /* compiled from: ChangePasswordFragment */
        static class C2167a implements Creator<C2166a> {
            C2167a() {
            }

            /* renamed from: a */
            public C2166a createFromParcel(Parcel parcel) {
                return new C2166a(parcel);
            }

            /* renamed from: b */
            public C2166a[] newArray(int i) {
                return new C2166a[i];
            }
        }

        public C2166a() {
            super("修改密碼頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new ChangePasswordFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_right);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_right, 0);
        }

        protected C2166a(Parcel parcel) {
            super(parcel);
        }
    }

    public ChangePasswordFragment() {
        super(R.layout.view_change_password);
    }

    /* renamed from: B2 */
    static /* synthetic */ C2147c m16754B2(View view) {
        return new ChangePasswordView(ViewChangePasswordBinding.m17684b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo16535D2() {
        this.f13655k0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo16536F2() {
        this.f13655k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo16540s2(ErrorBundle cVar) {
        ((C2147c) this.f13654j0.mo4947a()).mo16552g0(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo16541u2(Integer num) {
        ((C2147c) this.f13654j0.mo4947a()).mo16483g(mo2443i0(num.intValue()));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo16542w2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2159g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo16543y2() {
        this.f13655k0.mo18588e(new C2145a());
        this.f13655k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo16534A2() {
        ((C2147c) this.f13654j0.mo4947a()).mo16481R0(new C2163k(this));
    }

    /* renamed from: G2 */
    public void mo16537G2() {
        this.f13653i0.mo16752u(new C2155c(this)).mo16748o();
    }

    /* renamed from: H2 */
    public void mo16538H2(ChangePasswordScreen bVar) {
        this.f13652h0.mo16679v(new C2156d(this)).mo16678u(new C2165m(this)).mo16674o(bVar.f13620a, bVar.f13621b);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f13655k0 = Navigator.m20631b(this);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2147c) this.f13654j0.mo4947a()).mo16482b(new C2154b(this));
        ((C2147c) this.f13654j0.mo4947a()).mo16480C1(new C2164l(this));
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f13652h0.mo17051a();
        this.f13653i0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo16539q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2153a(this)).mo17047e(new C2157e(this)).mo17046c("0000001", new C2160h(this)).mo4887a(cVar);
    }
}
