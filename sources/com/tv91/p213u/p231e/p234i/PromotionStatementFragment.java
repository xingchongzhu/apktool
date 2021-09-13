package com.tv91.p213u.p231e.p234i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewPromotionStatementBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p231e.C2798d;
import com.tv91.p213u.p231e.p235j.LoadPromotionReportUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import java.util.List;

/* renamed from: com.tv91.u.e.i.p */
public final class PromotionStatementFragment extends Hilt_PromotionStatementFragment {

    /* renamed from: h0 */
    LoadPromotionReportUseCase f15639h0;

    /* renamed from: i0 */
    private final ViewSupplier<C2798d> f15640i0 = new ViewSupplier<>(this, new C2837j(this));

    /* renamed from: j0 */
    private Navigator f15641j0;

    /* renamed from: com.tv91.u.e.i.p$a */
    /* compiled from: PromotionStatementFragment */
    public static final class C2842a extends FragmentKey {
        public static final Creator<C2842a> CREATOR = new C2843a();

        /* renamed from: com.tv91.u.e.i.p$a$a */
        /* compiled from: PromotionStatementFragment */
        static class C2843a implements Creator<C2842a> {
            C2843a() {
            }

            /* renamed from: a */
            public C2842a createFromParcel(Parcel parcel) {
                return new C2842a(parcel);
            }

            /* renamed from: b */
            public C2842a[] newArray(int i) {
                return new C2842a[i];
            }
        }

        public C2842a() {
            super("兌換頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new PromotionStatementFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_fade, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_to_right);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_from_right, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_fade);
            }
        }

        protected C2842a(Parcel parcel) {
            super(parcel);
        }
    }

    public PromotionStatementFragment() {
        super(R.layout.view_promotion_statement);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ C2798d mo18097C2(View view) {
        return new StatementView(mo2364H(), ViewPromotionStatementBinding.m17796b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo18098E2() {
        this.f15641j0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void mo18099G2() {
        this.f15641j0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo18102s2(ErrorBundle cVar) {
        ((C2798d) this.f15640i0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo18103u2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2831d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo18104w2() {
        ((C2798d) this.f15640i0.mo4947a()).mo18024a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo18105y2() {
        ((C2798d) this.f15640i0.mo4947a()).mo18024a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo18096A2(List list) {
        ((C2798d) this.f15640i0.mo4947a()).mo18023T0(list);
    }

    /* renamed from: H2 */
    public void mo18100H2() {
        this.f15639h0.mo18130w(new C2835h(this)).mo18129v(new C2832e(this)).mo18131x(new C2836i(this)).mo18128u(new C2828a(this)).mo18124o();
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f15641j0 = Navigator.m20631b(this);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2798d) this.f15640i0.mo4947a()).mo18025b(new C2834g(this));
        mo18100H2();
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15639h0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo18101q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2833f(this)).mo17046c("0000001", new C2838k(this)).mo4887a(cVar);
    }
}
