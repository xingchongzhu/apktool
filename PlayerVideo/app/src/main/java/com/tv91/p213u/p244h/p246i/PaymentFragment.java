package com.tv91.p213u.p244h.p246i;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.authentication.p204r.VerifyFragment.C2284a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.PaymentMethod;
import com.tv91.model.Product;
import com.tv91.model.ProductGroup;
import com.tv91.model.User;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewPaymentBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p244h.PaymentScreen;
import com.tv91.p213u.p244h.p248k.CreateOrderUseCase;
import com.tv91.p213u.p244h.p248k.GetProductGroupsUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.C3060h;
import com.tv91.utils.FragmentUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p295h.p296a.Timber;

/* renamed from: com.tv91.u.h.i.y */
public final class PaymentFragment extends Hilt_PaymentFragment {

    /* renamed from: h0 */
    C3060h f15985h0;

    /* renamed from: i0 */
    GetProductGroupsUseCase f15986i0;

    /* renamed from: j0 */
    CreateOrderUseCase f15987j0;

    /* renamed from: k0 */
    private final ViewSupplier<PaymentScreen> f15988k0 = new ViewSupplier<>(this, C2984a.f15934a);

    /* renamed from: l0 */
    private Navigator f15989l0;

    /* renamed from: m0 */
    private User f15990m0;

    /* renamed from: n0 */
    private ProductGroup f15991n0;

    /* renamed from: com.tv91.u.h.i.y$a */
    /* compiled from: PaymentFragment */
    public static final class C3012a extends FragmentKey {
        public static final Creator<C3012a> CREATOR = new C3013a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f15992b;

        /* renamed from: com.tv91.u.h.i.y$a$a */
        /* compiled from: PaymentFragment */
        static class C3013a implements Creator<C3012a> {
            C3013a() {
            }

            /* renamed from: a */
            public C3012a createFromParcel(Parcel parcel) {
                return new C3012a(parcel);
            }

            /* renamed from: b */
            public C3012a[] newArray(int i) {
                return new C3012a[i];
            }
        }

        public C3012a() {
            this(120, TimeUnit.SECONDS);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new PaymentFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_bottom);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_bottom, 0);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f15992b);
        }

        public C3012a(int i, TimeUnit timeUnit) {
            super("儲值點數頁面");
            this.f15992b = (int) TimeUnit.SECONDS.convert((long) i, timeUnit);
        }

        protected C3012a(Parcel parcel) {
            super(parcel);
            this.f15992b = parcel.readInt();
        }
    }

    public PaymentFragment() {
        super(R.layout.view_payment);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo18460C2() {
        this.f15989l0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo18461E2() {
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18383a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void mo18462G2() {
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18383a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void mo18463I2(List list) {
        Collections.sort(list, C3001m.f15967a);
        PaymentScreen fVar = (PaymentScreen) this.f15988k0.mo4947a();
        ProductGroup productGroup = (ProductGroup) list.get(0);
        ProductGroup productGroup2 = (ProductGroup) list.get(1);
        ProductGroup productGroup3 = (ProductGroup) list.get(2);
        this.f15991n0 = productGroup3;
        fVar.mo18385g2(productGroup, productGroup2, productGroup3);
    }

    /* renamed from: J2 */
    static /* synthetic */ PaymentScreen m20368J2(View view) {
        return new PaymentView(ViewPaymentBinding.m17761b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo18464L2(String str) {
        if (FragmentUtils.m20586g(str)) {
            Timber.m24041c(new IllegalArgumentException("Payment Info Not Available"));
            return;
        }
        mo2445i2(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void mo18465O2() {
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18380D(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void mo18466Q2() {
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18380D(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void mo18467S2() {
        this.f15989l0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void mo18468U2() {
        List<Product> list = this.f15991n0.products;
        if (list != null && !list.isEmpty()) {
            ((PaymentScreen) this.f15988k0.mo4947a()).mo18386u1((Product) this.f15991n0.products.get(0), new C3011w(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void mo18469W2(Product product) {
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18386u1(product, new C3011w(this));
    }

    /* renamed from: s2 */
    private void m20376s2() {
        CustomDialog.m17424b(mo2379M1(), new C2999k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo18473u2(PaymentMethod paymentMethod) {
        this.f15987j0.mo18527w(new C3002n(this)).mo18526v(new C3003o(this)).mo18528x(new C2994f(this)).mo18525u(new C3010v(this)).mo18521o(paymentMethod);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo18474w2() {
        this.f15989l0.mo18588e(new C2284a());
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo18475y2(ErrorBundle cVar) {
        ((PaymentScreen) this.f15988k0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo18459A2(ErrorBundle cVar) {
        m20376s2();
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f15989l0 = Navigator.m20631b(this);
        User e = this.f15985h0.mo18615e();
        this.f15990m0 = e;
        if (e == null) {
            m20376s2();
        }
    }

    /* renamed from: X2 */
    public void mo18470X2() {
        this.f15986i0.mo18543w(new C2995g(this)).mo18542v(new C2985b(this)).mo18544x(new C2989d(this)).mo18541u(new C3010v(this)).mo18537o();
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18384d(new C2987c(this));
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18382W1(new C2997i(this));
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18388x0(new C3000l(this));
        ((PaymentScreen) this.f15988k0.mo4947a()).mo18381E1(((C3012a) mo18584l2()).f15992b, 10);
        mo18470X2();
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15986i0.mo17051a();
        this.f15987j0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo18471q2(PaymentMethod paymentMethod) {
        C3004p pVar = new C3004p(this, paymentMethod);
        User user = this.f15990m0;
        if (!user.isQuick || user.isCertified) {
            pVar.run();
        } else {
            ((PaymentScreen) this.f15988k0.mo4947a()).mo18387v(new C2991e(this), pVar);
        }
    }

    /* renamed from: r2 */
    public void mo18472r2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2998j(this)).mo17046c("0000001", new C2996h(this)).mo4887a(cVar);
    }
}
