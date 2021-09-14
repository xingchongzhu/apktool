package com.tv91.p213u.p237f.p238c;

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
import com.tv91.model.Feedback;
import com.tv91.model.Paging;
import com.tv91.model.User;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewFeedbackBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p237f.FeedbackScreen;
import com.tv91.p213u.p237f.p238c.FeedbackDetailFragment.C2887a;
import com.tv91.p213u.p237f.p240e.SendFeedbackFragment.C2908a;
import com.tv91.p213u.p237f.p241f.LoadFeedbackUseCase;
import com.tv91.p252x.BrowserKey;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.C3060h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tv91.u.f.c.q */
public final class FeedbackListFragment extends Hilt_FeedbackListFragment {

    /* renamed from: h0 */
    C3060h f15731h0;

    /* renamed from: i0 */
    LoadFeedbackUseCase f15732i0;

    /* renamed from: j0 */
    private final ViewSupplier<FeedbackScreen> f15733j0 = new ViewSupplier<>(this, C2873b.f15714a);

    /* renamed from: k0 */
    private Navigator f15734k0;

    /* renamed from: l0 */
    private User f15735l0;

    /* renamed from: m0 */
    private final List<Feedback> f15736m0 = new ArrayList();

    /* renamed from: n0 */
    private int f15737n0 = 0;

    /* renamed from: o0 */
    private boolean f15738o0 = false;

    /* renamed from: p0 */
    private boolean f15739p0 = true;

    /* renamed from: com.tv91.u.f.c.q$a */
    /* compiled from: FeedbackListFragment */
    public static final class C2889a extends FragmentKey {
        public static final Creator<C2889a> CREATOR = new C2890a();

        /* renamed from: com.tv91.u.f.c.q$a$a */
        /* compiled from: FeedbackListFragment */
        static class C2890a implements Creator<C2889a> {
            C2890a() {
            }

            /* renamed from: a */
            public C2889a createFromParcel(Parcel parcel) {
                return new C2889a(parcel);
            }

            /* renamed from: b */
            public C2889a[] newArray(int i) {
                return new C2889a[i];
            }
        }

        public C2889a() {
            super("客服問題清單頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new FeedbackListFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_fade, R.anim.exit_fade);
            } else {
                xVar.mo2944r(R.anim.enter_from_right, R.anim.exit_to_right);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_from_right, R.anim.exit_to_right);
            } else {
                xVar.mo2944r(R.anim.enter_fade, R.anim.exit_fade);
            }
        }

        protected C2889a(Parcel parcel) {
            super(parcel);
        }
    }

    public FeedbackListFragment() {
        super(R.layout.view_feedback);
    }

    /* renamed from: B2 */
    static /* synthetic */ FeedbackScreen m19886B2(View view) {
        return new FeedbackView(ViewFeedbackBinding.m17712b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo18207D2() {
        this.f15734k0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo18208F2() {
        this.f15734k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo18209H2() {
        this.f15736m0.clear();
        this.f15734k0.mo18588e(new C2908a());
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo18210J2(Feedback feedback) {
        this.f15734k0.mo18588e(new C2887a(feedback));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo18211L2() {
        this.f15734k0.mo18588e(new BrowserKey(this.f15735l0.onlineServiceUrl));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo18214s2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2880i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo18215u2(ErrorBundle cVar) {
        ((FeedbackScreen) this.f15733j0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo18216w2() {
        FeedbackScreen aVar = (FeedbackScreen) this.f15733j0.mo4947a();
        this.f15738o0 = true;
        aVar.mo18180a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo18217y2() {
        FeedbackScreen aVar = (FeedbackScreen) this.f15733j0.mo4947a();
        this.f15738o0 = false;
        aVar.mo18180a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo18206A2(Paging paging) {
        this.f15739p0 = this.f15737n0 < paging.pageCount;
        this.f15736m0.addAll(paging.getData());
        ((FeedbackScreen) this.f15733j0.mo4947a()).mo18184k0(paging.getData());
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f15734k0 = Navigator.m20631b(this);
        this.f15735l0 = this.f15731h0.mo18615e();
    }

    /* renamed from: M2 */
    public void mo18212M2() {
        if (!this.f15738o0 && this.f15739p0) {
            LoadFeedbackUseCase u = this.f15732i0.mo18278w(new C2879h(this)).mo18277v(new C2881j(this)).mo18279x(new C2883l(this)).mo18276u(new C2886o(this));
            int i = this.f15737n0 + 1;
            this.f15737n0 = i;
            u.mo18272o(i, 25);
        }
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((FeedbackScreen) this.f15733j0.mo4947a()).mo18181b(new C2877f(this));
        ((FeedbackScreen) this.f15733j0.mo4947a()).mo18186w0(new C2875d(this));
        ((FeedbackScreen) this.f15733j0.mo4947a()).mo18182c(new C2885n(this));
        ((FeedbackScreen) this.f15733j0.mo4947a()).mo18185t0(new C2882k(this));
        ((FeedbackScreen) this.f15733j0.mo4947a()).mo18179V(new C2876e(this));
        ((FeedbackScreen) this.f15733j0.mo4947a()).mo18183d1(this.f15735l0.onlineServiceAvailable);
        if (this.f15736m0.isEmpty()) {
            mo18212M2();
        } else {
            ((FeedbackScreen) this.f15733j0.mo4947a()).mo18184k0(this.f15736m0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15732i0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo18213q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2874c(this)).mo17046c("0000001", new C2878g(this)).mo4887a(cVar);
    }
}
