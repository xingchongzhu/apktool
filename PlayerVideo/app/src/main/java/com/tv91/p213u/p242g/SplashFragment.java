package com.tv91.p213u.p242g;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.Url;
import com.tv91.model.Version;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewSplashBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p214a.p217o.ChannelFragment.C2402a;
import com.tv91.p213u.p242g.p243f0.CheckUpdateUseCase;
import com.tv91.p213u.p242g.p243f0.DownloadApkUseCase;
import com.tv91.p213u.p242g.p243f0.GetUrlUseCase;
import com.tv91.p213u.p242g.p243f0.ReportServerDownUseCase;
import com.tv91.p252x.BrowserKey;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.C3060h;
import com.tv91.p253y.SystemRepository;
import com.tv91.p255z.C3061b;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.Files;
import java.io.File;

/* renamed from: com.tv91.u.g.a0 */
public final class SplashFragment extends Hilt_SplashFragment {

    /* renamed from: h0 */
    C3061b f15806h0;

    /* renamed from: i0 */
    C3060h f15807i0;

    /* renamed from: j0 */
    SystemRepository f15808j0;

    /* renamed from: k0 */
    String f15809k0;

    /* renamed from: l0 */
    String f15810l0;

    /* renamed from: m0 */
    String f15811m0;

    /* renamed from: n0 */
    GetUrlUseCase f15812n0;

    /* renamed from: o0 */
    CheckUpdateUseCase f15813o0;

    /* renamed from: p0 */
    DownloadApkUseCase f15814p0;

    /* renamed from: q0 */
    ReportServerDownUseCase f15815q0;

    /* renamed from: r0 */
    private final String f15816r0 = "https://direct.lc.chat/11932596/";

    /* renamed from: s0 */
    private final ViewSupplier<SplashScreen> f15817s0 = new ViewSupplier<>(this, C2925f.f15832a);

    /* renamed from: t0 */
    private Navigator f15818t0;

    /* renamed from: u0 */
    private Url f15819u0;

    /* renamed from: v0 */
    private Version f15820v0;

    /* renamed from: w0 */
    private String f15821w0;

    /* renamed from: com.tv91.u.g.a0$a */
    /* compiled from: SplashFragment */
    public static final class C2919a extends FragmentKey {
        public static final Creator<C2919a> CREATOR = new C2920a();

        /* renamed from: com.tv91.u.g.a0$a$a */
        /* compiled from: SplashFragment */
        static class C2920a implements Creator<C2919a> {
            C2920a() {
            }

            /* renamed from: a */
            public C2919a createFromParcel(Parcel parcel) {
                return new C2919a(parcel);
            }

            /* renamed from: b */
            public C2919a[] newArray(int i) {
                return new C2919a[i];
            }
        }

        public C2919a() {
            super("啟動頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new SplashFragment();
        }

        protected C2919a(Parcel parcel) {
            super(parcel);
        }
    }

    public SplashFragment() {
        super(R.layout.view_splash);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo18288B2() {
        ((SplashScreen) this.f15817s0.mo4947a()).mo18325w();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo18289D2() {
        this.f15818t0.mo18585a();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo18290F2(File file) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (VERSION.SDK_INT > 23) {
            uri = FileProvider.m1747e(mo2385O1(), "com.chip.ninetyonetv.file.provider", file);
            intent.addFlags(1);
        } else {
            uri = Uri.fromFile(file);
        }
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.addFlags(268435456);
        mo2445i2(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo18291H2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2942n(this)).mo4887a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo18292J2() {
        mo18304q2("com.tv91", "3.3");
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo18293L2(Url url) {
        this.f15819u0 = url;
        this.f15806h0.mo18682z(url.apiUrl, url.apiUrl2);
        this.f15821w0 = FragmentUtils.m20582c("%s/update.html?sid=%d&pid=%d", url.webUrl, Integer.valueOf(this.f15808j0.mo18606c()), Integer.valueOf(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void mo18294N2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2936h(this, cVar)).mo4887a(cVar);
    }

    /* renamed from: O2 */
    static /* synthetic */ SplashScreen m20050O2(View view) {
        return new SplashView(ViewSplashBinding.m17826b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void mo18295Q2(ErrorBundle cVar) {
        ((SplashScreen) this.f15817s0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void mo18296S2(ErrorBundle cVar) {
        ((SplashScreen) this.f15817s0.mo4947a()).mo18316G1(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void mo18297U2(ErrorBundle cVar) {
        this.f15818t0.mo18588e(new BrowserKey(this.f15821w0));
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void mo18298W2(ErrorBundle cVar, ErrorBundle cVar2) {
        this.f15806h0.mo18682z(this.f15810l0);
        this.f15808j0.mo18605b(this.f15811m0);
        this.f15821w0 = FragmentUtils.m20582c("%s/update.html?sid=%d&pid=%d", this.f15811m0, Integer.valueOf(this.f15808j0.mo18606c()), Integer.valueOf(0));
        ((SplashScreen) this.f15817s0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void mo18299Y2() {
        mo18305r2(FragmentUtils.m20582c("%s?sid=%d&pid=%d", this.f15820v0.updateUrl, Integer.valueOf(this.f15808j0.mo18606c()), Integer.valueOf(0)), Files.m20562b(mo2385O1()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void mo18300a3() {
        this.f15818t0.mo18588e(new BrowserKey(FragmentUtils.m20582c("%s?sid=%d&pid=%d", this.f15820v0.downloadUrl, Integer.valueOf(this.f15808j0.mo18606c()), Integer.valueOf(0))));
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void mo18301c3() {
        mo18303g3(this.f15819u0.reportUrl);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void mo18302e3() {
        this.f15818t0.mo18588e(new BrowserKey("https://direct.lc.chat/11932596/"));
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public void m20059f3() {
        ((SplashScreen) this.f15817s0.mo4947a()).mo18318P0();
        this.f15818t0.mo18589h(new C2402a().mo17226t());
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo18307v2(Version version) {
        SplashScreen d0Var = (SplashScreen) this.f15817s0.mo4947a();
        this.f15820v0 = version;
        d0Var.mo18319U1(version.message);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo18308x2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2945q(this)).mo17048j(new C2946r(this)).mo4887a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo18309z2() {
        ((SplashScreen) this.f15817s0.mo4947a()).mo18324q();
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f15818t0 = Navigator.m20631b(this);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((SplashScreen) this.f15817s0.mo4947a()).mo18321j2(new C2938j(this));
        ((SplashScreen) this.f15817s0.mo4947a()).mo18322m(new C2939k(this));
        ((SplashScreen) this.f15817s0.mo4947a()).mo18323n0(new C2923d(this));
        ((SplashScreen) this.f15817s0.mo4947a()).mo18320j0(new C2922c(this));
        ((SplashScreen) this.f15817s0.mo4947a()).mo18317I1(new C2948t(this));
        mo18306s2(this.f15809k0);
    }

    /* renamed from: g3 */
    public void mo18303g3(String str) {
        this.f15815q0.mo18354o(str, this.f15807i0.mo18615e() != null ? this.f15807i0.mo18615e().f14097id : "");
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15812n0.mo17051a();
        this.f15813o0.mo17051a();
        this.f15814p0.mo17051a();
        this.f15815q0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo18304q2(String str, String str2) {
        this.f15813o0.mo18336v(new C2941m(this)).mo18338x(new C2918a(this)).mo18337w(new C2923d(this)).mo18335u(new C2944p(this)).mo18331o(str, str2);
    }

    /* renamed from: r2 */
    public void mo18305r2(String str, File file) {
        this.f15814p0.mo18345w(new C2924e(this)).mo18344v(new C2943o(this)).mo18346x(new C2937i(this)).mo18343u(new C2921b(this)).mo18339o(str, file);
    }

    /* renamed from: s2 */
    public void mo18306s2(String str) {
        this.f15812n0.mo18352w(new C2935g(this)).mo18353x(new C2947s(this)).mo18351v(new C2940l(this)).mo18347p(str);
    }
}
