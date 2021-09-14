package com.tv91.p213u.p214a.p218p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.authentication.p199m.ChangePasswordFragment.C2166a;
import com.tv91.features.authentication.p203q.LoadUserInfoUseCase;
import com.tv91.features.authentication.p203q.LogoutUseCase;
import com.tv91.features.authentication.p204r.VerifyFragment.C2284a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.User;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewProfileBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p214a.BottomBarFragment;
import com.tv91.p213u.p214a.C2358k;
import com.tv91.p213u.p214a.Dashboard;
import com.tv91.p213u.p214a.ProfileScreen;
import com.tv91.p213u.p221b.DownloadFragment.C2486c;
import com.tv91.p213u.p223c.p225g.FavoriteFragment.C2696a;
import com.tv91.p213u.p223c.p228j.MovieSearchFragment.C2773a;
import com.tv91.p213u.p230d.NewsFragment.C2795a;
import com.tv91.p213u.p237f.p238c.FeedbackListFragment.C2889a;
import com.tv91.p213u.p244h.C2955c;
import com.tv91.p213u.p244h.p245h.HistoryFragment.C2975b;
import com.tv91.p213u.p244h.p246i.PaymentFragment.C3012a;
import com.tv91.p213u.p244h.p247j.PurchaseFragment.C3030a;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.utils.Dates;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tv91.u.a.p.v */
public final class ProfileFragment extends BottomBarFragment<C2358k> {

    /* renamed from: k0 */
    LoadUserInfoUseCase f14871k0;

    /* renamed from: l0 */
    LogoutUseCase f14872l0;

    /* renamed from: m0 */
    private final ViewSupplier<C2358k> f14873m0 = new ViewSupplier<>(this, C2408c.f14846a);

    /* renamed from: n0 */
    private Navigator f14874n0;

    /* renamed from: o0 */
    private User f14875o0;

    /* renamed from: p0 */
    private boolean f14876p0;

    /* renamed from: q0 */
    private boolean f14877q0;

    /* renamed from: com.tv91.u.a.p.v$a */
    /* compiled from: ProfileFragment */
    static /* synthetic */ class C2428a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14878a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tv91.u.a.j[] r0 = com.tv91.p213u.p214a.ProfileScreen.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14878a = r0
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.OPEN_VIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.VERIFICATION_OFF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.DEPOSIT_HISTORY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.FAVORITE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.PURCHASE_HISTORY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.PURCHASE_HISTORY_EXTERNAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.MOVIE_DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.NEWS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.CUSTOMER_SERVICE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.MODIFY_PASSWORD     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f14878a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.tv91.u.a.j r1 = com.tv91.p213u.p214a.ProfileScreen.LOGOUT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p214a.p218p.ProfileFragment.C2428a.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.u.a.p.v$b */
    /* compiled from: ProfileFragment */
    public static final class C2429b extends FragmentKey {
        public static final Creator<C2429b> CREATOR = new C2430a();

        /* renamed from: com.tv91.u.a.p.v$b$a */
        /* compiled from: ProfileFragment */
        static class C2430a implements Creator<C2429b> {
            C2430a() {
            }

            /* renamed from: a */
            public C2429b createFromParcel(Parcel parcel) {
                return new C2429b(parcel);
            }

            /* renamed from: b */
            public C2429b[] newArray(int i) {
                return new C2429b[i];
            }
        }

        public C2429b() {
            super("我的");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new ProfileFragment();
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

        protected C2429b(Parcel parcel) {
            super(parcel);
        }
    }

    public ProfileFragment() {
        super(R.layout.view_profile);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo17262B2() {
        ((C2358k) this.f14873m0.mo4947a()).mo17152a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo17263D2(User user) {
        this.f14876p0 = true;
        C2358k kVar = (C2358k) this.f14873m0.mo4947a();
        this.f14875o0 = user;
        kVar.mo17157y0(user, m18118a3());
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo17264F2() {
        this.f14876p0 = false;
        ((C2358k) this.f14873m0.mo4947a()).mo17157y0(null, m18119u2());
    }

    /* renamed from: G2 */
    static /* synthetic */ C2358k m18108G2(View view) {
        return new ProfileView(ViewProfileBinding.m17775b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void mo17265I2() {
        this.f14874n0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void mo17266K2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2410e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void mo17267M2(ErrorBundle cVar) {
        ((C2358k) this.f14873m0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void mo17268O2(ErrorBundle cVar) {
        ((C2358k) this.f14873m0.mo4947a()).mo17157y0(null, m18119u2());
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void mo17269Q2() {
        this.f14874n0.mo18588e(this.f14876p0 ? new C3012a() : new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void mo17270S2() {
        this.f14874n0.mo18588e(new C2773a());
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void mo17271U2() {
        if (!this.f14876p0) {
            this.f14877q0 = true;
            this.f14874n0.mo18588e(new C2145a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void mo17272W2() {
        if (this.f14876p0) {
            this.f14877q0 = true;
            this.f14874n0.mo18588e(new C3030a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public void m18117Z2(ProfileScreen jVar) {
        switch (C2428a.f14878a[jVar.ordinal()]) {
            case 1:
                this.f14874n0.mo18588e(this.f14876p0 ? new C3012a() : new C2145a());
                return;
            case 2:
                this.f14877q0 = true;
                this.f14874n0.mo18588e(this.f14876p0 ? new C2284a() : new C2145a());
                return;
            case 3:
                this.f14874n0.mo18588e(new C2975b(C2955c.PAYMENT));
                return;
            case 4:
                this.f14874n0.mo18588e(new C2696a());
                return;
            case 5:
                this.f14874n0.mo18588e(new C2975b(C2955c.PURCHASE));
                return;
            case 6:
                this.f14874n0.mo18588e(new C2975b(C2955c.PURCHASE_EXTERNAL));
                return;
            case 7:
                this.f14874n0.mo18588e(new C2486c());
                return;
            case 8:
                this.f14874n0.mo18588e(new C2795a(false));
                return;
            case 9:
                this.f14874n0.mo18588e(this.f14876p0 ? new C2889a() : new C2145a());
                return;
            case 10:
                this.f14874n0.mo18588e(new C2166a());
                return;
            case 11:
                if (this.f14876p0) {
                    User user = this.f14875o0;
                    if (user.isQuick && !user.isCertified) {
                        ((C2358k) this.f14873m0.mo4947a()).mo17151U(new C2406a(this));
                        return;
                    }
                }
                mo17274Y2();
                return;
            default:
                return;
        }
    }

    /* renamed from: a3 */
    private List<ProfileScreen> m18118a3() {
        ProfileScreen jVar;
        ProfileScreen jVar2;
        Context O1 = mo2385O1();
        ArrayList arrayList = new ArrayList();
        ProfileScreen jVar3 = ProfileScreen.GAP;
        arrayList.add(jVar3);
        User user = this.f14875o0;
        if (user.isVip) {
            jVar = ProfileScreen.VIP.mo17149b(O1, Dates.m20557b(user.vipDate, "yyyy/MM/dd"));
        } else {
            jVar = ProfileScreen.OPEN_VIP.mo17149b(O1, new Object[0]);
        }
        arrayList.add(jVar);
        User user2 = this.f14875o0;
        if (user2.isCertified) {
            jVar2 = ProfileScreen.VERIFICATION_ON.mo17149b(O1, user2.phone);
        } else {
            jVar2 = ProfileScreen.VERIFICATION_OFF.mo17149b(O1, new Object[0]);
        }
        arrayList.add(jVar2);
        arrayList.add(ProfileScreen.DEPOSIT_HISTORY.mo17149b(O1, new Object[0]));
        arrayList.add(jVar3);
        arrayList.add(ProfileScreen.FAVORITE.mo17149b(O1, new Object[0]));
        arrayList.add(ProfileScreen.PURCHASE_HISTORY.mo17149b(O1, new Object[0]));
        arrayList.add(ProfileScreen.PURCHASE_HISTORY_EXTERNAL.mo17149b(O1, new Object[0]));
        arrayList.add(ProfileScreen.MOVIE_DOWNLOAD.mo17149b(O1, new Object[0]));
        arrayList.add(jVar3);
        arrayList.add(ProfileScreen.NEWS.mo17149b(O1, new Object[0]));
        arrayList.add(ProfileScreen.CUSTOMER_SERVICE.mo17149b(O1, new Object[0]));
        arrayList.add(ProfileScreen.MODIFY_PASSWORD.mo17149b(O1, new Object[0]));
        arrayList.add(ProfileScreen.LOGOUT.mo17149b(O1, new Object[0]));
        return arrayList;
    }

    /* renamed from: u2 */
    private List<ProfileScreen> m18119u2() {
        Context O1 = mo2385O1();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProfileScreen.OPEN_VIP.mo17149b(O1, new Object[0]));
        arrayList.add(ProfileScreen.GAP);
        arrayList.add(ProfileScreen.NEWS.mo17149b(O1, new Object[0]));
        arrayList.add(ProfileScreen.CUSTOMER_SERVICE.mo17149b(O1, new Object[0]));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo17275x2(ErrorBundle cVar) {
        this.f14876p0 = false;
        String str = "0000001";
        ErrorHandler.m17647d(new C2415j(this)).mo17046c("NotLogin", new C2421p(this)).mo17046c(str, new C2411f(this)).mo4887a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo17276z2() {
        ((C2358k) this.f14873m0.mo4947a()).mo17152a(true);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f14874n0 = Navigator.m20631b(this);
    }

    /* renamed from: X2 */
    public void mo17273X2() {
        this.f14871k0.mo16739w(new C2416k(this)).mo16738v(new C2418m(this)).mo16740x(new C2420o(this)).mo16737u(new C2409d(this)).mo16733o();
    }

    /* renamed from: Y2 */
    public void mo17274Y2() {
        this.f14872l0.mo16752u(new C2422q(this)).mo16748o();
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2358k) this.f14873m0.mo4947a()).mo17155i(new C2419n(this));
        ((C2358k) this.f14873m0.mo4947a()).mo17154h(new C2413h(this));
        ((C2358k) this.f14873m0.mo4947a()).mo17156v0(new C2417l(this));
        ((C2358k) this.f14873m0.mo4947a()).mo17153f2(new C2412g(this));
        ((C2358k) this.f14873m0.mo4947a()).mo17150B(new C2414i(this));
        if (this.f14877q0 || this.f14875o0 == null) {
            this.f14877q0 = false;
            mo17273X2();
            return;
        }
        ((C2358k) this.f14873m0.mo4947a()).mo17157y0(this.f14875o0, m18118a3());
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f14871k0.mo17051a();
        this.f14872l0.mo17051a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public Dashboard mo17132n2() {
        return Dashboard.PROFILE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public ViewSupplier<C2358k> mo17133o2() {
        return this.f14873m0;
    }
}
