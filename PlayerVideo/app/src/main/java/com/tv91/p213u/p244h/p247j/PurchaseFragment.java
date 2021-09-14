package com.tv91.p213u.p244h.p247j;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.PurchasePackage;
import com.tv91.model.PurchaseType;
import com.tv91.model.User;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewPurchaseBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p244h.PurchaseScreen;
import com.tv91.p213u.p244h.p248k.GetPurchasePackageUseCase;
import com.tv91.p213u.p244h.p248k.PurchaseMovieUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.C3060h;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tv91.u.h.j.r */
public final class PurchaseFragment extends Hilt_PurchaseFragment {

    /* renamed from: h0 */
    C3060h f16015h0;

    /* renamed from: i0 */
    GetPurchasePackageUseCase f16016i0;

    /* renamed from: j0 */
    PurchaseMovieUseCase f16017j0;

    /* renamed from: k0 */
    private final ViewSupplier<PurchaseScreen> f16018k0 = new ViewSupplier<>(this, C3024k.f16005a);

    /* renamed from: l0 */
    private Navigator f16019l0;

    /* renamed from: m0 */
    private User f16020m0;

    /* renamed from: com.tv91.u.h.j.r$a */
    /* compiled from: PurchaseFragment */
    public static final class C3030a extends FragmentKey {
        public static final Creator<C3030a> CREATOR = new C3031a();

        /* renamed from: com.tv91.u.h.j.r$a$a */
        /* compiled from: PurchaseFragment */
        static class C3031a implements Creator<C3030a> {
            C3031a() {
            }

            /* renamed from: a */
            public C3030a createFromParcel(Parcel parcel) {
                return new C3030a(parcel);
            }

            /* renamed from: b */
            public C3030a[] newArray(int i) {
                return new C3030a[i];
            }
        }

        public C3030a() {
            super("購買影片頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new PurchaseFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_right);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_right, 0);
        }

        protected C3030a(Parcel parcel) {
            super(parcel);
        }
    }

    public PurchaseFragment() {
        super(R.layout.view_purchase);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo18493C2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((PurchasePackage) it.next()).type == PurchaseType.SINGLE) {
                it.remove();
            }
        }
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18395c2(list);
    }

    /* renamed from: D2 */
    static /* synthetic */ PurchaseScreen m20424D2(View view) {
        return new PurchaseView(ViewPurchaseBinding.m17808b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo18494F2() {
        this.f16019l0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo18496J2() {
        this.f16019l0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo18497L2() {
        this.f16019l0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void mo18498N2(PurchasePackage purchasePackage) {
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18396m1(purchasePackage.point, new C3014a(this, purchasePackage));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void mo18499P2() {
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18389F0(this.f16020m0.point);
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18390K1(new C3026m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void mo18500R2() {
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18393a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void mo18501T2() {
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18393a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo18505s2(ErrorBundle cVar, ErrorBundle cVar2) {
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo18506u2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C3018e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo18507w2(ErrorBundle cVar) {
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18392S1(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo18508y2() {
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18393a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo18492A2() {
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18393a(false);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f16019l0 = Navigator.m20631b(this);
        this.f16020m0 = this.f16015h0.mo18615e();
    }

    /* renamed from: U2 */
    public void mo18502U2() {
        this.f16016i0.mo18559w(new C3023j(this)).mo18558v(new C3015b(this)).mo18560x(new C3016c(this)).mo18557u(new C3029p(this)).mo18553o();
    }

    /* renamed from: V2 */
    public void m20426G2(PurchasePackage purchasePackage) {
        this.f16017j0.mo18567w(new C3025l(this)).mo18566v(new C3017d(this)).mo18568x(new C3021h(this)).mo18565u(new C3029p(this)).mo18561o(null, purchasePackage);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18394b(new C3022i(this));
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18391M0(new C3028o(this));
        ((PurchaseScreen) this.f16018k0.mo4947a()).mo18389F0(this.f16020m0.point);
        mo18502U2();
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f16016i0.mo17051a();
        this.f16017j0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo18504q2(ErrorBundle cVar) {
        String str = "C000013";
        ErrorHandler.m17647d(new C3020g(this, cVar)).mo17046c("0000001", new C3027n(this)).mo17046c(str, new C3019f(this)).mo4887a(cVar);
    }
}
