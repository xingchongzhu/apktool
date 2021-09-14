package com.tv91.p213u.p231e.p234i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.PromotionReport;
import com.tv91.p210r.FragmentPromotionReportBinding;
import com.tv91.p213u.p231e.StatementScreen;
import com.tv91.p213u.p231e.p233h.PromotionReportModel;
import com.tv91.p213u.p231e.p236k.PromotionWithdrawFragment.C2870a;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.KeyedFragment;
import com.tv91.p252x.Navigator;

/* renamed from: com.tv91.u.e.i.o */
public final class PromotionReportFragment extends KeyedFragment {

    /* renamed from: d0 */
    private final ViewSupplier<StatementScreen> f15635d0 = new ViewSupplier<>(this, C2829b.f15619a);

    /* renamed from: e0 */
    private Navigator f15636e0;

    /* renamed from: f0 */
    private PromotionReportModel f15637f0;

    /* renamed from: com.tv91.u.e.i.o$a */
    /* compiled from: PromotionReportFragment */
    public static class C2840a extends FragmentKey {
        public static final Creator<C2840a> CREATOR = new C2841a();

        /* renamed from: b */
        public final PromotionReportModel f15638b;

        /* renamed from: com.tv91.u.e.i.o$a$a */
        /* compiled from: PromotionReportFragment */
        static class C2841a implements Creator<C2840a> {
            C2841a() {
            }

            /* renamed from: a */
            public C2840a createFromParcel(Parcel parcel) {
                return new C2840a(parcel);
            }

            /* renamed from: b */
            public C2840a[] newArray(int i) {
                return new C2840a[i];
            }
        }

        public C2840a(PromotionReport promotionReport) {
            super(promotionReport.name);
            this.f15638b = new PromotionReportModel(promotionReport);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new PromotionReportFragment();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f15638b, 1);
        }

        protected C2840a(Parcel parcel) {
            super(parcel);
            this.f15638b = (PromotionReportModel) parcel.readParcelable(PromotionReportModel.class.getClassLoader());
        }
    }

    public PromotionReportFragment() {
        super(R.layout.fragment_promotion_report);
    }

    /* renamed from: m2 */
    static /* synthetic */ StatementScreen m19700m2(View view) {
        return new ReportView(FragmentPromotionReportBinding.m17799b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void mo18091o2() {
        this.f15636e0.mo18588e(new C2870a(this.f15637f0.f15611a));
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        this.f15636e0 = Navigator.m20631b(this);
        this.f15637f0 = ((C2840a) mo18584l2()).f15638b;
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((StatementScreen) this.f15635d0.mo4947a()).mo18021Q1(new C2830c(this));
        ((StatementScreen) this.f15635d0.mo4947a()).mo18022w1(this.f15637f0);
    }
}
