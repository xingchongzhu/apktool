package com.tv91.p213u.p214a.p219q;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.Promotion;
import com.tv91.p210r.ViewPromotionBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p214a.BottomBarFragment;
import com.tv91.p213u.p214a.Dashboard;
import com.tv91.p213u.p214a.PromotionScreen;
import com.tv91.p213u.p223c.p228j.MovieSearchFragment.C2773a;
import com.tv91.p213u.p231e.p232g.MemberPromotionFragment.C2824c;
import com.tv91.p213u.p231e.p235j.LoadPromotionsUseCase;
import com.tv91.p213u.p244h.p246i.PaymentFragment.C3012a;
import com.tv91.p252x.BrowserKey;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.C3060h;
import java.util.List;
import p295h.p296a.Timber;

/* renamed from: com.tv91.u.a.q.h */
public final class PromotionFragment extends BottomBarFragment<PromotionScreen> {

    /* renamed from: k0 */
    C3060h f14892k0;

    /* renamed from: l0 */
    LoadPromotionsUseCase f14893l0;

    /* renamed from: m0 */
    private final ViewSupplier<PromotionScreen> f14894m0 = new ViewSupplier<>(this, C2436f.f14887a);

    /* renamed from: n0 */
    private Navigator f14895n0;

    /* renamed from: o0 */
    private boolean f14896o0;

    /* renamed from: p0 */
    private List<Promotion> f14897p0;

    /* renamed from: com.tv91.u.a.q.h$a */
    /* compiled from: PromotionFragment */
    public static final class C2437a extends FragmentKey {
        public static final Creator<C2437a> CREATOR = new C2438a();

        /* renamed from: com.tv91.u.a.q.h$a$a */
        /* compiled from: PromotionFragment */
        static class C2438a implements Creator<C2437a> {
            C2438a() {
            }

            /* renamed from: a */
            public C2437a createFromParcel(Parcel parcel) {
                return new C2437a(parcel);
            }

            /* renamed from: b */
            public C2437a[] newArray(int i) {
                return new C2437a[i];
            }
        }

        public C2437a() {
            super("推廣頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new PromotionFragment();
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

        protected C2437a(Parcel parcel) {
            super(parcel);
        }
    }

    public PromotionFragment() {
        super(R.layout.view_promotion);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo17287C2() {
        this.f14895n0.mo18588e(new C2773a());
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo17288E2(Promotion promotion) {
        if (promotion.type == 1) {
            this.f14895n0.mo18588e(this.f14896o0 ? new C2824c() : new C2145a());
        } else {
            this.f14895n0.mo18588e(new BrowserKey(promotion.url));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo17290v2(List list) {
        PromotionScreen lVar = (PromotionScreen) this.f14894m0.mo4947a();
        this.f14897p0 = list;
        lVar.mo17159P1(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo17291x2(ErrorBundle cVar) {
        Timber.m24041c(cVar.mo17113c());
        ((PromotionScreen) this.f14894m0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* renamed from: y2 */
    static /* synthetic */ PromotionScreen m18180y2(View view) {
        return new PromotionView(ViewPromotionBinding.m17781b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo17286A2() {
        this.f14895n0.mo18588e(this.f14896o0 ? new C3012a() : new C2145a());
    }

    /* renamed from: F2 */
    public void mo17289F2() {
        this.f14893l0.mo18144v(new C2435e(this)).mo18143u(new C2432b(this)).mo18139o();
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f14895n0 = Navigator.m20631b(this);
        this.f14896o0 = this.f14892k0.mo18615e() != null;
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((PromotionScreen) this.f14894m0.mo4947a()).mo17161i(new C2433c(this));
        ((PromotionScreen) this.f14894m0.mo4947a()).mo17160h(new C2434d(this));
        ((PromotionScreen) this.f14894m0.mo4947a()).mo17158D1(new C2431a(this));
        if (this.f14897p0 == null) {
            mo17289F2();
        } else {
            ((PromotionScreen) this.f14894m0.mo4947a()).mo17159P1(this.f14897p0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f14893l0.mo17051a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public Dashboard mo17132n2() {
        return Dashboard.PROMOTION;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public ViewSupplier<PromotionScreen> mo17133o2() {
        return this.f14894m0;
    }
}
