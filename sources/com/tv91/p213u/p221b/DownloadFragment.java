package com.tv91.p213u.p221b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.p006f.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.movie.play.MoviePlayActivity.C2288c;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.model.Movie;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewDownloadBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p221b.FileDownloadManager.C2495c;
import com.tv91.p213u.p221b.p222x0.AddDownloadUseCase;
import com.tv91.p213u.p221b.p222x0.LoadDownloadRecordsUseCase;
import com.tv91.p213u.p221b.p222x0.MoveDownloadUseCase;
import com.tv91.p213u.p221b.p222x0.PauseDownloadUseCase;
import com.tv91.p213u.p221b.p222x0.RemoveDownloadUseCase;
import com.tv91.p213u.p221b.p222x0.StartDownloadUseCase;
import com.tv91.p213u.p223c.p224f.MovieFragment.C2674a;
import com.tv91.p213u.p223c.p229k.LoadMovieUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.utils.C3052g;
import com.tv91.utils.Utils;
import java.io.File;
import java.io.IOException;
import java.util.List;
import p295h.p296a.Timber;

/* renamed from: com.tv91.u.b.q0 */
public final class DownloadFragment extends Hilt_DownloadFragment implements C2495c {

    /* renamed from: h0 */
    FileDownloadManager f14983h0;

    /* renamed from: i0 */
    LoadDownloadRecordsUseCase f14984i0;

    /* renamed from: j0 */
    MoveDownloadUseCase f14985j0;

    /* renamed from: k0 */
    LoadMovieUseCase f14986k0;

    /* renamed from: l0 */
    private final ViewSupplier<DownloadScreen> f14987l0 = new ViewSupplier<>(this, C2480p.f14969a);

    /* renamed from: m0 */
    private Navigator f14988m0;

    /* renamed from: n0 */
    private ContentResolver f14989n0;

    /* renamed from: o0 */
    private boolean f14990o0;

    /* renamed from: p0 */
    private DownloadRecord f14991p0;

    /* renamed from: q0 */
    private DownloadRecord f14992q0;

    /* renamed from: r0 */
    private DownloadRecord f14993r0;

    /* renamed from: s0 */
    private final ActivityResultLauncher<String> f14994s0 = mo2371J1(new C2485b(null), new C2497x(this));

    /* renamed from: com.tv91.u.b.q0$a */
    /* compiled from: DownloadFragment */
    static /* synthetic */ class C2484a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14995a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tv91.model.a$a[] r0 = com.tv91.model.DownloadRecord.C2335a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14995a = r0
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14995a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.PAUSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14995a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.QUEUED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14995a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.DONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14995a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.MOVED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14995a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p221b.DownloadFragment.C2484a.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.u.b.q0$b */
    /* compiled from: DownloadFragment */
    private static class C2485b extends ActivityResultContracts {
        private C2485b() {
        }

        /* renamed from: d */
        public Intent mo208a(Context context, String str) {
            return super.mo212d(context, str).addCategory("android.intent.category.OPENABLE").addFlags(64).addFlags(1).addFlags(2).setType("video/*");
        }

        /* synthetic */ C2485b(C2484a aVar) {
            this();
        }
    }

    /* renamed from: com.tv91.u.b.q0$c */
    /* compiled from: DownloadFragment */
    public static final class C2486c extends FragmentKey {
        public static final Creator<C2486c> CREATOR = new C2487a();

        /* renamed from: com.tv91.u.b.q0$c$a */
        /* compiled from: DownloadFragment */
        static class C2487a implements Creator<C2486c> {
            C2487a() {
            }

            /* renamed from: a */
            public C2486c createFromParcel(Parcel parcel) {
                return new C2486c(parcel);
            }

            /* renamed from: b */
            public C2486c[] newArray(int i) {
                return new C2486c[i];
            }
        }

        public C2486c() {
            super("我的下載");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new DownloadFragment();
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

        protected C2486c(Parcel parcel) {
            super(parcel);
        }
    }

    public DownloadFragment() {
        super(R.layout.view_download);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo17356B2(ErrorBundle cVar) {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17404Y(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo17357D2() {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17413l0(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo17358F2() {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17413l0(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo17359H2(DownloadRecord aVar) {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17401K(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo17360J2(ErrorBundle cVar) {
        Timber.m24041c(cVar.mo17113c());
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17403O0(cVar.mo17112b());
    }

    /* renamed from: L2 */
    static /* synthetic */ DownloadScreen m18307L2(View view) {
        return new DownloadView(ViewDownloadBinding.m17698b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void mo17361N2(Uri uri) {
        this.f14983h0.mo17432n(this);
        this.f14989n0.takePersistableUriPermission(uri, 3);
        mo17386q3(this.f14993r0, uri);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void mo17365W2(DownloadScreen t0Var, ErrorBundle cVar) {
        t0Var.mo17405Y0(this.f14991p0);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void mo17366Y2(DownloadScreen t0Var, ErrorBundle cVar) {
        t0Var.mo17409b0(this.f14991p0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void mo17368a3() {
        this.f14988m0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void mo17369c3() {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17412k2();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void mo17370e3(DownloadRecord aVar) {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17414l1(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public /* synthetic */ void mo17372g3(DownloadRecord aVar) {
        this.f14983h0.mo17430l(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public /* synthetic */ void mo17375i3(DownloadRecord aVar) {
        this.f14983h0.mo17429k(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void mo17377k3(DownloadRecord aVar) {
        this.f14983h0.mo17431m(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void mo17380m3(Runnable runnable) {
        this.f14990o0 = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public void m18322p3(DownloadRecord aVar) {
        Uri parse = C3052g.m20586g(aVar.f14103e) ? null : Uri.parse(aVar.f14103e);
        if (parse != null) {
            this.f14993r0 = aVar;
            this.f14994s0.mo194a(parse.getLastPathSegment());
            return;
        }
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17403O0("File Missing");
    }

    /* renamed from: q2 */
    private boolean m18323q2(DownloadRecord aVar) {
        if (C3052g.m20586g(aVar.f14103e)) {
            return false;
        }
        Uri parse = Uri.parse(aVar.f14103e);
        boolean z = true;
        Timber.m24039a("path = %s", parse);
        if (!C3052g.m20581b("content", parse.getScheme())) {
            return new File(parse.getPath()).exists();
        }
        try {
            ParcelFileDescriptor openFileDescriptor = this.f14989n0.openFileDescriptor(parse, "r");
            if (openFileDescriptor == null) {
                z = false;
            }
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public void m18311S2(List<DownloadRecord> list) {
        for (DownloadRecord aVar : list) {
            if (aVar.f14104f == C2335a.DOWNLOADING) {
                this.f14983h0.mo17428j(aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo17390t2(List list) {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17417x1(list);
        if (this.f14990o0 || Utils.m20597h(mo2385O1())) {
            new Handler(Looper.getMainLooper()).postDelayed(new C2451a0(this, list), 500);
        } else {
            m18328t3(new C2472l(this, list), new C2591y(this, list));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public void m18327s3(DownloadRecord aVar) {
        this.f14991p0 = aVar;
        switch (C2484a.f14995a[aVar.f14104f.ordinal()]) {
            case 1:
                this.f14983h0.mo17428j(aVar);
                return;
            case 2:
            case 3:
                if (this.f14990o0 || Utils.m20597h(mo2385O1())) {
                    this.f14983h0.mo17431m(aVar);
                    return;
                } else {
                    m18328t3(new C2491u(this, aVar), null);
                    return;
                }
            case 4:
            case 5:
                if (m18323q2(aVar)) {
                    Movie movie = aVar.f14101c;
                    if (movie.channel.key == -2) {
                        this.f14992q0 = aVar;
                        mo17384o3(movie.f14083id);
                        return;
                    }
                    this.f14988m0.mo18588e(new C2288c(Uri.parse(aVar.f14103e)));
                    return;
                }
                ((DownloadScreen) this.f14987l0.mo4947a()).mo17402N0();
                DownloadRecord e = aVar.mo17040e(null, C2335a.MISSING);
                this.f14983h0.mo17434p(e);
                ((DownloadScreen) this.f14987l0.mo4947a()).mo17401K(e);
                return;
            case 6:
                this.f14988m0.mo18588e(new C2674a(aVar.f14101c.f14083id, 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: t3 */
    private void m18328t3(Runnable runnable, Runnable runnable2) {
        new C2317a(mo2379M1()).mo16910x(R.string.dialog_title).mo16899m(R.string.E_no_wifi_warning).mo16909w(R.string.dialog_button_yes, new C2455c0(this, runnable)).mo16902p(R.string.dialog_button_no, runnable2).mo16905s(runnable2).mo16912z();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo17392v2() {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17406a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m18310Q2(List<DownloadRecord> list) {
        for (DownloadRecord aVar : list) {
            C2335a aVar2 = aVar.f14104f;
            if (aVar2 == C2335a.QUEUED || aVar2 == C2335a.PAUSED) {
                this.f14983h0.mo17431m(aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo17393x2() {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17406a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo17394z2(Movie movie) {
        this.f14983h0.mo17434p(this.f14992q0.mo17038c(this.f14992q0.f14101c.newBuilder().channel(movie.channel).build()));
        this.f14988m0.mo18588e(new C2288c(Uri.parse(this.f14992q0.f14103e)));
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f14988m0 = Navigator.m20631b(this);
        this.f14989n0 = mo2385O1().getContentResolver();
    }

    /* renamed from: Z0 */
    public void mo2415Z0() {
        super.mo2415Z0();
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17406a(false);
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17413l0(false);
    }

    /* renamed from: a */
    public void mo17367a(ErrorBundle cVar) {
        DownloadScreen t0Var = (DownloadScreen) this.f14987l0.mo4947a();
        ErrorHandler.m17647d(new C2468j(t0Var)).mo17046c("Download-Corrupt", new C2496w(this, t0Var)).mo17046c("Download-000003", new C2466i(this, t0Var)).mo4887a(cVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo17371f() {
        RemoveDownloadUseCase.m18718b(this);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17408b(new C2470k(this));
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17416o(new C2478o(this));
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17407a2(new C2490t(this));
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17415n(new C2483q(this));
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17411f1(new C2457d0(this));
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17410e0(new C2592z(this));
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17400A(new C2492v(this));
        this.f14983h0.mo17432n(this);
        mo17382n3();
    }

    /* renamed from: h */
    public /* synthetic */ void mo17373h() {
        AddDownloadUseCase.m18476b(this);
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f14983h0.mo17433o(this);
        this.f14984i0.mo17051a();
        this.f14985j0.mo17051a();
        this.f14986k0.mo17051a();
    }

    /* renamed from: i */
    public void mo17374i(DownloadRecord aVar) {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17401K(aVar);
    }

    /* renamed from: k */
    public void mo17376k(DownloadRecord aVar, Number number) {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17401K(aVar);
    }

    /* renamed from: l */
    public /* synthetic */ void mo17378l() {
        StartDownloadUseCase.m18739b(this);
    }

    /* renamed from: m */
    public /* synthetic */ void mo17379m() {
        PauseDownloadUseCase.m18698b(this);
    }

    /* renamed from: n */
    public void mo17381n(DownloadRecord aVar) {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17401K(aVar);
    }

    /* renamed from: n3 */
    public void mo17382n3() {
        this.f14984i0.mo17516E(new C2476n(this)).mo17515D(new C2489s(this)).mo17517F(new C2463g0(this)).mo17514C(new C2479o0(this)).mo17518o(null);
    }

    /* renamed from: o */
    public void mo17383o(DownloadRecord aVar) {
    }

    /* renamed from: o3 */
    public void mo17384o3(int i) {
        this.f14986k0.mo17981y(new C2453b0(this)).mo17978v(new C2459e0(this)).mo17973o(i);
    }

    /* renamed from: q */
    public /* synthetic */ void mo17385q() {
        AddDownloadUseCase.m18475a(this);
    }

    /* renamed from: q3 */
    public void mo17386q3(DownloadRecord aVar, Uri uri) {
        if (uri != null) {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f14989n0.openFileDescriptor(uri, "rw");
                if (openFileDescriptor != null) {
                    this.f14985j0.mo17529E(new C2461f0(this)).mo17528D(new C2474m(this)).mo17530F(new C2488r(this)).mo17527C(new C2465h0(this)).mo17531o(aVar, openFileDescriptor, uri.toString());
                }
            } catch (Exception e) {
                Timber.m24041c(e);
                ((DownloadScreen) this.f14987l0.mo4947a()).mo17403O0(e.getMessage());
            }
        }
    }

    /* renamed from: r */
    public /* synthetic */ void mo17387r() {
        RemoveDownloadUseCase.m18717a(this);
    }

    /* renamed from: s */
    public /* synthetic */ void mo17388s() {
        StartDownloadUseCase.m18738a(this);
    }

    /* renamed from: t */
    public /* synthetic */ void mo17389t() {
        PauseDownloadUseCase.m18697a(this);
    }

    /* renamed from: u */
    public void mo17391u(DownloadRecord aVar, File file) {
        ((DownloadScreen) this.f14987l0.mo4947a()).mo17401K(aVar);
    }
}
