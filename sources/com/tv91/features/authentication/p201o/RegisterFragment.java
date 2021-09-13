package com.tv91.features.authentication.p201o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.C2151j;
import com.tv91.features.authentication.RegisterScreen;
import com.tv91.features.authentication.p203q.LoginUseCase;
import com.tv91.features.authentication.p203q.RegisterUseCase;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.User;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewRegisterBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;

/* renamed from: com.tv91.features.authentication.o.n */
public final class RegisterFragment extends Hilt_RegisterFragment {

    /* renamed from: h0 */
    RegisterUseCase f13730h0;

    /* renamed from: i0 */
    LoginUseCase f13731i0;

    /* renamed from: j0 */
    private final ViewSupplier<C2151j> f13732j0 = new ViewSupplier<>(this, C2207e.f13717a);

    /* renamed from: k0 */
    private Navigator f13733k0;

    /* renamed from: com.tv91.features.authentication.o.n$a */
    /* compiled from: RegisterFragment */
    public static final class C2215a extends FragmentKey {
        public static final Creator<C2215a> CREATOR = new C2216a();

        /* renamed from: com.tv91.features.authentication.o.n$a$a */
        /* compiled from: RegisterFragment */
        static class C2216a implements Creator<C2215a> {
            C2216a() {
            }

            /* renamed from: a */
            public C2215a createFromParcel(Parcel parcel) {
                return new C2215a(parcel);
            }

            /* renamed from: b */
            public C2215a[] newArray(int i) {
                return new C2215a[i];
            }
        }

        public C2215a() {
            super("註冊頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new RegisterFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_bottom);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_bottom, 0);
        }

        protected C2215a(Parcel parcel) {
            super(parcel);
        }
    }

    public RegisterFragment() {
        super(R.layout.view_register);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo16621B2() {
        ((C2151j) this.f13732j0.mo4947a()).mo16517j();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo16622D2(RegisterScreen iVar) {
        mo16623E2(iVar.f13631a, iVar.f13633c);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo16626s2(ErrorBundle cVar) {
        ((C2151j) this.f13732j0.mo4947a()).mo16519r0(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo16627u2(Integer num) {
        ((C2151j) this.f13732j0.mo4947a()).mo16516g(mo2443i0(num.intValue()));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo16628w2(User user) {
        this.f13733k0.mo18585a();
    }

    /* renamed from: x2 */
    static /* synthetic */ C2151j m16930x2(View view) {
        return new RegisterView(ViewRegisterBinding.m17821b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo16629z2() {
        this.f13733k0.mo18587d();
    }

    /* renamed from: E2 */
    public void mo16623E2(String str, String str2) {
        this.f13731i0.mo16747w(new C2205c(this)).mo16745u(new C2214l(this)).mo16741o(str, str2);
    }

    /* renamed from: F2 */
    public void mo16624F2(RegisterScreen iVar) {
        this.f13730h0.mo16694y(new C2208f(this)).mo16695z(new C2204b(this, iVar)).mo16693x(new C2214l(this)).mo16689r(iVar.f13631a, iVar.f13632b, iVar.f13633c, iVar.f13634d);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f13733k0 = Navigator.m20631b(this);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2151j) this.f13732j0.mo4947a()).mo16515d(new C2209g(this));
        ((C2151j) this.f13732j0.mo4947a()).mo16518p1(new C2203a(this));
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f13730h0.mo17051a();
        this.f13731i0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo16625q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2206d(this)).mo17047e(new C2210h(this)).mo4887a(cVar);
    }
}
