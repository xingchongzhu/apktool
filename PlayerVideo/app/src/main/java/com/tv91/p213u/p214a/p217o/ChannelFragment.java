package com.tv91.p213u.p214a.p217o;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.crashsdk.export.CrashStatKey;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.Channel;
import com.tv91.model.ExternalSource;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewChannelBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p214a.BottomBarFragment;
import com.tv91.p213u.p214a.ChannelScreen;
import com.tv91.p213u.p214a.Dashboard;
import com.tv91.p213u.p214a.p220r.LoadAdvertiseUseCase;
import com.tv91.p213u.p214a.p220r.LoadChannelsUseCase;
import com.tv91.p213u.p223c.p228j.MovieSearchFragment.C2773a;
import com.tv91.p213u.p230d.NewsFragment.C2795a;
import com.tv91.p213u.p244h.p246i.PaymentFragment.C3012a;
import com.tv91.p252x.BrowserKey;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.C3060h;
import com.tv91.p253y.SystemRepository;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.Parcels;
import java.util.List;

/* renamed from: com.tv91.u.a.o.l */
public final class ChannelFragment extends BottomBarFragment<ChannelScreen> {

    /* renamed from: k0 */
    SystemRepository f14824k0;

    /* renamed from: l0 */
    C3060h f14825l0;

    /* renamed from: m0 */
    LoadAdvertiseUseCase f14826m0;

    /* renamed from: n0 */
    LoadChannelsUseCase f14827n0;

    /* renamed from: o0 */
    private final ViewSupplier<ChannelScreen> f14828o0 = new ViewSupplier<>(this, C2394d.f14813a);

    /* renamed from: p0 */
    private Navigator f14829p0;

    /* renamed from: q0 */
    private MoviesPageAdapter f14830q0;

    /* renamed from: com.tv91.u.a.o.l$a */
    /* compiled from: ChannelFragment */
    public static final class C2402a extends FragmentKey {
        public static final Creator<C2402a> CREATOR = new C2403a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f14831b;

        /* renamed from: com.tv91.u.a.o.l$a$a */
        /* compiled from: ChannelFragment */
        static class C2403a implements Creator<C2402a> {
            C2403a() {
            }

            /* renamed from: a */
            public C2402a createFromParcel(Parcel parcel) {
                return new C2402a(parcel);
            }

            /* renamed from: b */
            public C2402a[] newArray(int i) {
                return new C2402a[i];
            }
        }

        public C2402a() {
            super("首頁");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new ChannelFragment();
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

        /* renamed from: t */
        public C2402a mo17226t() {
            this.f14831b = true;
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            Parcels.m20571c(parcel, this.f14831b);
        }

        protected C2402a(Parcel parcel) {
            super(parcel);
            this.f14831b = Parcels.m20569a(parcel);
        }
    }

    public ChannelFragment() {
        super(R.layout.view_channel);
    }

    /* renamed from: B2 */
    static /* synthetic */ ChannelScreen m18016B2(View view) {
        return new ChannelView(ViewChannelBinding.m17691b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo17218D2() {
        this.f14829p0.mo18588e(this.f14825l0.mo18615e() != null ? new C3012a() : new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo17219F2() {
        this.f14829p0.mo18588e(new C2773a());
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo17220H2(ExternalSource externalSource) {
        this.f14829p0.mo18588e(new BrowserKey(FragmentUtils.m20582c("%s?sid=%s", externalSource.url, Integer.valueOf(this.f14824k0.mo18606c()))));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo17224w2(ErrorBundle cVar) {
        ((ChannelScreen) this.f14828o0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo17225y2(List list) {
        ((ChannelScreen) this.f14828o0.mo4947a()).mo17145W0(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo17217A2(List list) {
        list.add(0, new Channel(CrashStatKey.LOG_LEGACY_TMP_FILE, mo2443i0(R.string.channel_highlight)));
        this.f14830q0 = new MoviesPageAdapter(mo2364H(), list);
        ((ChannelScreen) this.f14828o0.mo4947a()).mo17143K0(this.f14830q0, list);
    }

    /* renamed from: I2 */
    public void mo17221I2() {
        this.f14826m0.mo17315v(new C2396f(this)).mo17314u(new C2401k(this)).mo17310o();
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        this.f14829p0 = Navigator.m20631b(this);
    }

    /* renamed from: J2 */
    public void mo17222J2() {
        this.f14827n0.mo17329v(new C2391a(this)).mo17328u(new C2401k(this)).mo17324o();
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((ChannelScreen) this.f14828o0.mo4947a()).mo17147i(new C2393c(this));
        ((ChannelScreen) this.f14828o0.mo4947a()).mo17146h(new C2392b(this));
        ((ChannelScreen) this.f14828o0.mo4947a()).mo17144P(new C2395e(this));
        if (this.f14830q0 == null) {
            mo17222J2();
        } else {
            ChannelScreen gVar = (ChannelScreen) this.f14828o0.mo4947a();
            MoviesPageAdapter qVar = this.f14830q0;
            gVar.mo17143K0(qVar, qVar.mo17237q());
        }
        C2402a aVar = (C2402a) mo18584l2();
        if (aVar.f14831b) {
            aVar.f14831b = false;
            C2795a aVar2 = new C2795a(true);
            mo2405W().mo2808m().mo2938e(aVar2.createFragment(), aVar2.getClassName()).mo2516h();
            mo17221I2();
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f14826m0.mo17051a();
        this.f14827n0.mo17051a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public Dashboard mo17132n2() {
        return Dashboard.HOME;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public ViewSupplier<ChannelScreen> mo17133o2() {
        return this.f14828o0;
    }

    /* renamed from: u2 */
    public void mo17223u2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2397g(this)).mo4887a(cVar);
    }
}
