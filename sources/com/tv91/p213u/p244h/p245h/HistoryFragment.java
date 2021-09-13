package com.tv91.p213u.p244h.p245h;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Paging;
import com.tv91.model.PaymentHistory;
import com.tv91.model.PurchaseHistory;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewPaymentHistoryBinding;
import com.tv91.p210r.ViewPurchaseHistoryBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p223c.p224f.MovieFragment.C2674a;
import com.tv91.p213u.p244h.C2954b;
import com.tv91.p213u.p244h.C2955c;
import com.tv91.p213u.p244h.C2957e;
import com.tv91.p213u.p244h.HistoryScreen;
import com.tv91.p213u.p244h.p248k.GetPaymentHistoryUseCase;
import com.tv91.p213u.p244h.p248k.GetPurchaseHistoryUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tv91.u.h.h.r */
public final class HistoryFragment extends Hilt_HistoryFragment implements C2954b {

    /* renamed from: h0 */
    GetPurchaseHistoryUseCase f15911h0;

    /* renamed from: i0 */
    GetPaymentHistoryUseCase f15912i0;

    /* renamed from: j0 */
    private final ViewSupplier<C2957e> f15913j0 = new ViewSupplier<>(this, new C2962e(this));

    /* renamed from: k0 */
    private Navigator f15914k0;

    /* renamed from: l0 */
    private C2955c f15915l0;

    /* renamed from: m0 */
    private final List<PaymentHistory> f15916m0 = new ArrayList();

    /* renamed from: n0 */
    private final List<PurchaseHistory> f15917n0 = new ArrayList();

    /* renamed from: o0 */
    private int f15918o0 = 1;

    /* renamed from: p0 */
    private boolean f15919p0;

    /* renamed from: q0 */
    private boolean f15920q0 = true;

    /* renamed from: com.tv91.u.h.h.r$a */
    /* compiled from: HistoryFragment */
    static /* synthetic */ class C2974a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15921a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tv91.u.h.c[] r0 = com.tv91.p213u.p244h.C2955c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15921a = r0
                com.tv91.u.h.c r1 = com.tv91.p213u.p244h.C2955c.PURCHASE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15921a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.u.h.c r1 = com.tv91.p213u.p244h.C2955c.PURCHASE_EXTERNAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15921a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.u.h.c r1 = com.tv91.p213u.p244h.C2955c.PAYMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p244h.p245h.HistoryFragment.C2974a.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.u.h.h.r$b */
    /* compiled from: HistoryFragment */
    public static final class C2975b extends FragmentKey {
        public static final Creator<C2975b> CREATOR = new C2976a();

        /* renamed from: b */
        public final C2955c f15922b;

        /* renamed from: com.tv91.u.h.h.r$b$a */
        /* compiled from: HistoryFragment */
        static class C2976a implements Creator<C2975b> {
            C2976a() {
            }

            /* renamed from: a */
            public C2975b createFromParcel(Parcel parcel) {
                return new C2975b(parcel);
            }

            /* renamed from: b */
            public C2975b[] newArray(int i) {
                return new C2975b[i];
            }
        }

        public C2975b(C2955c cVar) {
            super(m20267r(cVar));
            this.f15922b = cVar;
        }

        /* renamed from: r */
        private static String m20267r(C2955c cVar) {
            int i = C2974a.f15921a[cVar.ordinal()];
            if (i == 1) {
                return "購買影片記錄頁面";
            }
            if (i != 2) {
                return i != 3 ? HistoryFragment.class.getName() : "儲值紀錄頁面";
            }
            return "購買其他影片記錄頁面";
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new HistoryFragment();
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

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f15922b.name());
        }

        protected C2975b(Parcel parcel) {
            super(parcel);
            this.f15922b = C2955c.valueOf(parcel.readString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo18409C2() {
        this.f15919p0 = true;
        m20240T2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo18410E2() {
        this.f15919p0 = false;
        m20240T2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void mo18411G2(int i, Paging paging) {
        this.f15920q0 = paging.pageCount < i;
        this.f15917n0.addAll(paging.getData());
        m20239S2(this.f15917n0);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ C2957e mo18412I2(View view) {
        if (this.f15915l0.mo18374a()) {
            return new PurchaseHistoryView(ViewPurchaseHistoryBinding.m17814b(view), this.f15915l0);
        }
        return new PaymentHistoryView(ViewPaymentHistoryBinding.m17768b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void mo18413K2() {
        this.f15914k0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void mo18414M2() {
        this.f15914k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void mo18415O2() {
        mo18372e(this.f15918o0 + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void mo18416Q2(Object obj) {
        if (obj instanceof PurchaseHistory) {
            PurchaseHistory purchaseHistory = (PurchaseHistory) obj;
            int i = purchaseHistory.movieId;
            if (i != -1) {
                int i2 = purchaseHistory.sourceId;
                if (i2 <= 0) {
                    i2 = 1;
                }
                this.f15914k0.mo18588e(new C2674a(i, i2));
            }
        }
    }

    /* renamed from: S2 */
    private <T> void m20239S2(List<T> list) {
        ((C2957e) this.f15913j0.mo4947a()).mo18375H(list);
    }

    /* renamed from: T2 */
    private void m20240T2(boolean z) {
        ((C2957e) this.f15913j0.mo4947a()).mo18377a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo18419s2(ErrorBundle cVar) {
        ((C2957e) this.f15913j0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo18420u2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2960c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo18421w2() {
        m20240T2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo18422y2() {
        m20240T2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo18408A2(List list) {
        this.f15916m0.addAll(list);
        m20239S2(this.f15916m0);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2975b bVar = (C2975b) mo18584l2();
        mo132b().mo2999a(new UmengObserver(bVar.mo18581m()));
        this.f15914k0 = Navigator.m20631b(this);
        this.f15915l0 = bVar.f15922b;
    }

    /* renamed from: N0 */
    public View mo2381N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f15915l0.mo18374a()) {
            return layoutInflater.inflate(R.layout.view_purchase_history, viewGroup, false);
        }
        return layoutInflater.inflate(R.layout.view_payment_history, viewGroup, false);
    }

    /* renamed from: R2 */
    public void mo18417R2() {
        this.f15912i0.mo18535w(new C2959b(this)).mo18534v(new C2970m(this)).mo18536x(new C2967j(this)).mo18533u(new C2973p(this)).mo18529o();
    }

    /* renamed from: e */
    public /* synthetic */ void mo18372e(int i) {
        HistoryScreen.m20187a(this, i);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2957e) this.f15913j0.mo4947a()).mo18378b(new C2968k(this));
        ((C2957e) this.f15913j0.mo4947a()).mo18379s0(10, new C2971n(this));
        ((C2957e) this.f15913j0.mo4947a()).mo18376S0(new C2964g(this));
        int i = C2974a.f15921a[this.f15915l0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.f15916m0.isEmpty()) {
                        mo18417R2();
                    } else {
                        m20239S2(this.f15916m0);
                    }
                }
            } else if (this.f15917n0.isEmpty()) {
                mo18372e(this.f15918o0);
            } else {
                m20239S2(this.f15917n0);
            }
        } else if (this.f15917n0.isEmpty()) {
            mo18373j(this.f15918o0, 0);
        } else {
            m20239S2(this.f15917n0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15911h0.mo17051a();
        this.f15912i0.mo17051a();
    }

    /* renamed from: j */
    public void mo18373j(int i, int i2) {
        if (!this.f15919p0 && this.f15920q0) {
            this.f15918o0 = i;
            this.f15911h0.mo18551w(new C2963f(this)).mo18550v(new C2966i(this)).mo18552x(new C2969l(this, i)).mo18549u(new C2973p(this)).mo18545o(i, i2);
        }
    }

    /* renamed from: q2 */
    public void mo18418q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2961d(this)).mo17046c("0000001", new C2965h(this)).mo4887a(cVar);
    }
}
