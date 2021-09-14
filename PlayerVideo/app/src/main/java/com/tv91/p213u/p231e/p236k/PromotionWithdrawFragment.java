package com.tv91.p213u.p231e.p236k;

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
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewPromotionWithdrawBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p231e.C2799f;
import com.tv91.p213u.p231e.WithdrawScreen;
import com.tv91.p213u.p231e.p235j.WithdrawUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;

/* renamed from: com.tv91.u.e.k.o */
public final class PromotionWithdrawFragment extends Hilt_PromotionWithdrawFragment {

    /* renamed from: h0 */
    WithdrawUseCase f15706h0;

    /* renamed from: i0 */
    private final ViewSupplier<C2799f> f15707i0 = new ViewSupplier<>(this, C2865i.f15696a);

    /* renamed from: j0 */
    private Navigator f15708j0;

    /* renamed from: k0 */
    private int f15709k0;

    /* renamed from: com.tv91.u.e.k.o$a */
    /* compiled from: PromotionWithdrawFragment */
    public static final class C2870a extends FragmentKey {
        public static final Creator<C2870a> CREATOR = new C2871a();

        /* renamed from: b */
        public final int f15710b;

        /* renamed from: com.tv91.u.e.k.o$a$a */
        /* compiled from: PromotionWithdrawFragment */
        static class C2871a implements Creator<C2870a> {
            C2871a() {
            }

            /* renamed from: a */
            public C2870a createFromParcel(Parcel parcel) {
                return new C2870a(parcel);
            }

            /* renamed from: b */
            public C2870a[] newArray(int i) {
                return new C2870a[i];
            }
        }

        public C2870a(int i) {
            super("提領頁面");
            this.f15710b = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new PromotionWithdrawFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_right);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_right, 0);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f15710b);
        }

        protected C2870a(Parcel parcel) {
            super(parcel);
            this.f15710b = parcel.readInt();
        }
    }

    public PromotionWithdrawFragment() {
        super(R.layout.view_promotion_withdraw);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo18162B2() {
        this.f15708j0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo18163D2() {
        this.f15708j0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo18164F2(WithdrawScreen eVar) {
        mo18168M2(this.f15709k0, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo18165H2() {
        ((C2799f) this.f15707i0.mo4947a()).mo18029a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo18166J2() {
        ((C2799f) this.f15707i0.mo4947a()).mo18029a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo18167L2(String str) {
        ((C2799f) this.f15707i0.mo4947a()).mo18028T1(str, new C2857a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo18170s2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2866j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo18171u2(ErrorBundle cVar) {
        ((C2799f) this.f15707i0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo18172w2(Integer num) {
        ((C2799f) this.f15707i0.mo4947a()).mo18027R();
    }

    /* renamed from: x2 */
    static /* synthetic */ C2799f m19824x2(View view) {
        return new WithdrawView(ViewPromotionWithdrawBinding.m17802b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo18173z2() {
        this.f15708j0.mo18587d();
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2870a aVar = (C2870a) mo18584l2();
        mo132b().mo2999a(new UmengObserver(aVar.getClassName()));
        this.f15708j0 = Navigator.m20631b(this);
        this.f15709k0 = aVar.f15710b;
    }

    /* renamed from: M2 */
    public void mo18168M2(int i, WithdrawScreen eVar) {
        this.f15706h0.mo18151w(new C2863g(this)).mo18150v(new C2864h(this)).mo18152x(new C2860d(this)).mo18149u(new C2869m(this)).mo18145o(i, eVar.f15560a, eVar.f15561b, eVar.f15562c, eVar.f15563d, eVar.f15564e, eVar.f15565f, eVar.f15566g);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2799f) this.f15707i0.mo4947a()).mo18030b(new C2867k(this));
        ((C2799f) this.f15707i0.mo4947a()).mo18026H0(new C2859c(this));
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15706h0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo18169q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2861e(this)).mo17047e(new C2862f(this)).mo17046c("0000001", new C2858b(this)).mo4887a(cVar);
    }
}
