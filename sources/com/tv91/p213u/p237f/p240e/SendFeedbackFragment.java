package com.tv91.p213u.p237f.p240e;

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
import com.tv91.model.FeedbackType;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewFeedbackFormBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p237f.SendFeedbackScreen;
import com.tv91.p213u.p237f.p241f.GetFeedbackTypeUseCase;
import com.tv91.p213u.p237f.p241f.SendFeedbackUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.utils.Utils;
import java.util.List;

/* renamed from: com.tv91.u.f.e.o */
public final class SendFeedbackFragment extends Hilt_SendFeedbackFragment {

    /* renamed from: h0 */
    GetFeedbackTypeUseCase f15771h0;

    /* renamed from: i0 */
    SendFeedbackUseCase f15772i0;

    /* renamed from: j0 */
    private final ViewSupplier<SendFeedbackScreen> f15773j0 = new ViewSupplier<>(this, C2898d.f15756a);

    /* renamed from: k0 */
    private Navigator f15774k0;

    /* renamed from: l0 */
    private List<FeedbackType> f15775l0;

    /* renamed from: m0 */
    private FeedbackType f15776m0;

    /* renamed from: com.tv91.u.f.e.o$a */
    /* compiled from: SendFeedbackFragment */
    public static final class C2908a extends FragmentKey {
        public static final Creator<C2908a> CREATOR = new C2909a();

        /* renamed from: com.tv91.u.f.e.o$a$a */
        /* compiled from: SendFeedbackFragment */
        static class C2909a implements Creator<C2908a> {
            C2909a() {
            }

            /* renamed from: a */
            public C2908a createFromParcel(Parcel parcel) {
                return new C2908a(parcel);
            }

            /* renamed from: b */
            public C2908a[] newArray(int i) {
                return new C2908a[i];
            }
        }

        public C2908a() {
            super("客服問題回報頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new SendFeedbackFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_bottom);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_bottom, 0);
        }

        protected C2908a(Parcel parcel) {
            super(parcel);
        }
    }

    public SendFeedbackFragment() {
        super(R.layout.view_feedback_form);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo18243C2() {
        this.f15774k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo18244E2(FeedbackType feedbackType) {
        this.f15776m0 = feedbackType;
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void mo18245G2(CharSequence charSequence) {
        String j0 = mo2446j0(R.string.report_feedback_content, Utils.m20594e(), Utils.m20590a(), Utils.m20593d(mo2385O1()), "3.3");
        FeedbackType feedbackType = this.f15776m0;
        StringBuilder sb = new StringBuilder();
        sb.append(j0);
        sb.append(charSequence);
        mo18249N2(feedbackType, sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void mo18246I2() {
        ((SendFeedbackScreen) this.f15773j0.mo4947a()).mo18187a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void mo18247K2() {
        ((SendFeedbackScreen) this.f15773j0.mo4947a()).mo18187a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void mo18248M2() {
        this.f15774k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo18252t2(List list) {
        this.f15776m0 = (FeedbackType) list.get(0);
        SendFeedbackScreen bVar = (SendFeedbackScreen) this.f15773j0.mo4947a();
        this.f15775l0 = list;
        bVar.mo18188a0(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo18253v2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2899e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo18254x2(ErrorBundle cVar) {
        ((SendFeedbackScreen) this.f15773j0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* renamed from: y2 */
    static /* synthetic */ SendFeedbackScreen m19972y2(View view) {
        return new SendFeedbackView(ViewFeedbackFormBinding.m17726b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo18242A2() {
        this.f15774k0.mo18588e(new C2145a());
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f15774k0 = Navigator.m20631b(this);
    }

    /* renamed from: N2 */
    public void mo18249N2(FeedbackType feedbackType, String str) {
        this.f15772i0.mo18286w(new C2905k(this)).mo18285v(new C2904j(this)).mo18287x(new C2903i(this)).mo18284u(new C2895a(this)).mo18280o(feedbackType, str);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((SendFeedbackScreen) this.f15773j0.mo4947a()).mo18189d(new C2902h(this));
        ((SendFeedbackScreen) this.f15773j0.mo4947a()).mo18191n1(new C2897c(this));
        ((SendFeedbackScreen) this.f15773j0.mo4947a()).mo18190f(new C2900f(this));
        if (this.f15775l0 == null) {
            mo18250q2();
        } else {
            ((SendFeedbackScreen) this.f15773j0.mo4947a()).mo18188a0(this.f15775l0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15771h0.mo17051a();
        this.f15772i0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo18250q2() {
        this.f15771h0.mo18271u(new C2901g(this)).mo18267o();
    }

    /* renamed from: r2 */
    public void mo18251r2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2896b(this)).mo17046c("0000001", new C2906l(this)).mo4887a(cVar);
    }
}
