package com.tv91.p213u.p223c.p224f;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.movie.play.MoviePlayActivity.C2288c;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Actor;
import com.tv91.model.Category;
import com.tv91.model.DownloadInfo;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.model.Movie;
import com.tv91.model.Paging;
import com.tv91.model.PurchasePackage;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewMovieBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p221b.DownloadFragment.C2486c;
import com.tv91.p213u.p221b.FileDownloadManager;
import com.tv91.p213u.p221b.FileDownloadManager.C2495c;
import com.tv91.p213u.p221b.p222x0.AddDownloadUseCase;
import com.tv91.p213u.p221b.p222x0.GetDownloadInfoUseCase;
import com.tv91.p213u.p221b.p222x0.GetDownloadStatementUseCase;
import com.tv91.p213u.p221b.p222x0.LoadDownloadRecordUseCase;
import com.tv91.p213u.p221b.p222x0.LoadDownloadRecordsUseCase;
import com.tv91.p213u.p221b.p222x0.StartDownloadUseCase;
import com.tv91.p213u.p223c.MovieScreen;
import com.tv91.p213u.p223c.p227i.MoviesByActorFragment.C2759a;
import com.tv91.p213u.p223c.p229k.AddFavoriteUseCase;
import com.tv91.p213u.p223c.p229k.LoadMovieUrlUseCase;
import com.tv91.p213u.p223c.p229k.LoadMovieUseCase;
import com.tv91.p213u.p223c.p229k.LoadMoviesUseCase;
import com.tv91.p213u.p223c.p229k.RemoveFavoriteUseCase;
import com.tv91.p213u.p244h.p246i.PaymentFragment.C3012a;
import com.tv91.p213u.p244h.p248k.PurchaseMovieUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.C3060h;
import com.tv91.utils.C3052g;
import com.tv91.utils.Files;
import com.tv91.utils.Utils;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p295h.p296a.Timber;

/* renamed from: com.tv91.u.c.f.y1 */
public final class MovieFragment extends Hilt_MovieFragment implements C2495c {

    /* renamed from: A0 */
    private DownloadRecord f15279A0;

    /* renamed from: B0 */
    private int f15280B0 = 0;

    /* renamed from: C0 */
    private boolean f15281C0 = false;

    /* renamed from: D0 */
    private int f15282D0;

    /* renamed from: E0 */
    private DownloadRecord f15283E0;

    /* renamed from: h0 */
    FileDownloadManager f15284h0;

    /* renamed from: i0 */
    C3060h f15285i0;

    /* renamed from: j0 */
    LoadMovieUseCase f15286j0;

    /* renamed from: k0 */
    LoadMoviesUseCase f15287k0;

    /* renamed from: l0 */
    LoadDownloadRecordUseCase f15288l0;

    /* renamed from: m0 */
    LoadDownloadRecordsUseCase f15289m0;

    /* renamed from: n0 */
    LoadMovieUrlUseCase f15290n0;

    /* renamed from: o0 */
    AddFavoriteUseCase f15291o0;

    /* renamed from: p0 */
    RemoveFavoriteUseCase f15292p0;

    /* renamed from: q0 */
    GetDownloadInfoUseCase f15293q0;

    /* renamed from: r0 */
    GetDownloadStatementUseCase f15294r0;

    /* renamed from: s0 */
    PurchaseMovieUseCase f15295s0;

    /* renamed from: t0 */
    private final ViewSupplier<MovieScreen> f15296t0 = new ViewSupplier<>(this, C2619g.f15218a);

    /* renamed from: u0 */
    private Navigator f15297u0;

    /* renamed from: v0 */
    private int f15298v0;

    /* renamed from: w0 */
    private int f15299w0;

    /* renamed from: x0 */
    private boolean f15300x0;

    /* renamed from: y0 */
    private boolean f15301y0;

    /* renamed from: z0 */
    private Movie f15302z0;

    /* renamed from: com.tv91.u.c.f.y1$a */
    /* compiled from: MovieFragment */
    public static final class C2674a extends FragmentKey {
        public static final Creator<C2674a> CREATOR = new C2675a();

        /* renamed from: b */
        public final int f15303b;

        /* renamed from: c */
        public final int f15304c;

        /* renamed from: com.tv91.u.c.f.y1$a$a */
        /* compiled from: MovieFragment */
        static class C2675a implements Creator<C2674a> {
            C2675a() {
            }

            /* renamed from: a */
            public C2674a createFromParcel(Parcel parcel) {
                return new C2674a(parcel);
            }

            /* renamed from: b */
            public C2674a[] newArray(int i) {
                return new C2674a[i];
            }
        }

        public C2674a(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("影片詳細資料頁面 ");
            sb.append(i);
            super(sb.toString());
            this.f15303b = i;
            this.f15304c = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new MovieFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_fade, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_to_bottom);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_from_bottom, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_fade);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f15303b);
            parcel.writeInt(this.f15304c);
        }

        protected C2674a(Parcel parcel) {
            super(parcel);
            this.f15303b = parcel.readInt();
            this.f15304c = parcel.readInt();
        }
    }

    public MovieFragment() {
        super(R.layout.view_movie);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void mo17711B3(ErrorBundle cVar) {
        m19016v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public /* synthetic */ void mo17712B4() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo17713C2() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void mo17714D3(ErrorBundle cVar) {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17632m0();
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public /* synthetic */ void mo17715D4(Movie movie) {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17614L1();
        ((MovieScreen) this.f15296t0.mo4947a()).mo17640y1(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo17716E2() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17618O1();
        ((MovieScreen) this.f15296t0.mo4947a()).mo17640y1(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void mo17717F3(ErrorBundle cVar) {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17641z(this.f15302z0.download);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void mo17719G2() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void mo17721H3(ErrorBundle cVar) {
        MovieScreen cVar2 = (MovieScreen) this.f15296t0.mo4947a();
        Movie movie = this.f15302z0;
        cVar2.mo17629h1(movie.download, movie.fileSize);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void mo17723I2() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void mo17724J3(ErrorBundle cVar) {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17636q1();
    }

    /* access modifiers changed from: private */
    /* renamed from: I4 */
    public void m18973I4(Movie movie) {
        if (this.f15299w0 == 1) {
            MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
            this.f15302z0 = movie;
            cVar.mo17639u(movie);
            if (this.f15301y0) {
                mo17718F4(movie);
            } else {
                ((MovieScreen) this.f15296t0.mo4947a()).mo17612J0(null, this.f15282D0);
            }
        } else {
            MovieScreen cVar2 = (MovieScreen) this.f15296t0.mo4947a();
            this.f15302z0 = movie;
            cVar2.mo17615M(movie);
        }
        mo17720G4();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void mo17726K2(Movie movie, DownloadInfo downloadInfo) {
        if (!this.f15284h0.mo17427i(movie.fileSize)) {
            ((MovieScreen) this.f15296t0.mo4947a()).mo17624c0(movie.fileSize);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15298v0);
        sb.append(".");
        sb.append(movie.extension);
        this.f15284h0.mo17423e(movie, downloadInfo, Uri.fromFile(new File(Files.m20564d(mo2385O1()), sb.toString())).toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public /* synthetic */ void mo17728L3(ErrorBundle cVar) {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17641z(this.f15302z0.download);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void mo17729M2(String str) {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17638s1(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: L4 */
    public void m18977L4() {
        if (!this.f15301y0) {
            this.f15297u0.mo18588e(new C2145a());
            return;
        }
        DownloadRecord aVar = this.f15279A0;
        if (aVar == null || !aVar.mo17036a()) {
            m19020w4(this.f15302z0);
        } else if (m19018w2(this.f15279A0)) {
            this.f15297u0.mo18588e(new C2288c(Uri.parse(this.f15279A0.f14103e)));
        } else {
            this.f15284h0.mo17434p(this.f15279A0.mo17040e(null, C2335a.MISSING));
            m19020w4(this.f15302z0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void mo17731N3() {
        this.f15297u0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void mo17734P2(ErrorBundle cVar) {
        m19016v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void mo17735P3() {
        Movie movie = this.f15302z0;
        if (movie.sourceId <= 1) {
            this.f15297u0.mo18588e(this.f15301y0 ? new C3012a() : new C2145a());
        } else {
            mo17732N4(movie);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public /* synthetic */ void mo17736R3() {
        this.f15284h0.mo17430l(this.f15279A0);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ void mo17737T3() {
        this.f15284h0.mo17429k(this.f15279A0);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void mo17738U2() {
        this.f15297u0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void mo17739V3() {
        mo17730M4(this.f15302z0);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void mo17740W2() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public /* synthetic */ void mo17741X3() {
        this.f15297u0.mo18588e(this.f15301y0 ? new C3012a() : new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void mo17742Y2() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public /* synthetic */ void mo17743Z3() {
        mo17727K4(this.f15302z0.categories);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void mo17744a3(DownloadRecord aVar) {
        if (aVar != null && !aVar.mo17036a()) {
            double length = (double) new File(Uri.parse(aVar.f14103e).getPath()).length();
            Double.isNaN(length);
            double d = length * 100.0d;
            double d2 = (double) aVar.f14101c.fileSize;
            Double.isNaN(d2);
            this.f15282D0 = (int) (d / d2);
        }
        MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
        this.f15279A0 = aVar;
        cVar.mo17612J0(aVar, this.f15282D0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public /* synthetic */ void mo17745b4() {
        Movie movie = this.f15302z0;
        if (movie.favorite) {
            ((MovieScreen) this.f15296t0.mo4947a()).mo17633o1(this.f15302z0.name, new C2611d0(this));
        } else {
            mo17760q2(movie);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void mo17746c3(List list) {
        int i = 0;
        if (!list.isEmpty()) {
            DownloadRecord aVar = (DownloadRecord) list.get(0);
            this.f15283E0 = aVar;
            if (!aVar.mo17036a() && m19018w2(this.f15283E0)) {
                double length = (double) new File(Uri.parse(this.f15283E0.f14103e).getPath()).length();
                Double.isNaN(length);
                double d = length * 100.0d;
                double d2 = (double) this.f15283E0.f14101c.fileSize;
                Double.isNaN(d2);
                i = (int) (d / d2);
            }
            ((MovieScreen) this.f15296t0.mo4947a()).mo17635q0(this.f15283E0, i);
            return;
        }
        ((MovieScreen) this.f15296t0.mo4947a()).mo17635q0(null, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public /* synthetic */ void mo17747d4(Actor actor) {
        this.f15297u0.mo18588e(new C2759a(actor));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void mo17748e3() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public /* synthetic */ void mo17749f4() {
        mo17727K4(this.f15302z0.categories);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public /* synthetic */ void mo17750g3() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public /* synthetic */ void mo17751h4(Movie movie) {
        this.f15297u0.mo18588e(new C2674a(movie.f14083id, movie.sourceId));
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public /* synthetic */ void mo17752i3() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public /* synthetic */ void mo17753j4() {
        this.f15297u0.mo18588e(new C2486c());
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void mo17754k3() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public /* synthetic */ void mo17755l4() {
        this.f15300x0 = true;
        m19011r2();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void mo17756m3(String str) {
        this.f15297u0.mo18588e(new C2288c(Uri.parse(str)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public /* synthetic */ void mo17757n4() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void mo17758o3() {
        MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
        this.f15281C0 = true;
        cVar.mo17630i0(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public /* synthetic */ void mo17759p4() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void mo17761q3() {
        MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
        this.f15281C0 = false;
        cVar.mo17630i0(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m19011r2() {
        if (!this.f15301y0) {
            this.f15297u0.mo18588e(new C2145a());
        } else if (this.f15300x0 || Utils.m20597h(mo2385O1())) {
            DownloadRecord aVar = this.f15279A0;
            if (aVar == null) {
                m19010q4(this.f15302z0);
                return;
            }
            if (aVar.f14104f == C2335a.DOWNLOADING) {
                this.f15284h0.mo17428j(aVar);
            } else if (aVar.mo17036a()) {
                m18977L4();
            } else {
                DownloadRecord aVar2 = this.f15279A0;
                C2335a aVar3 = aVar2.f14104f;
                if (aVar3 == C2335a.PAUSED || aVar3 == C2335a.QUEUED) {
                    this.f15284h0.mo17431m(aVar2);
                } else {
                    m19010q4(this.f15302z0);
                }
            }
        } else {
            ((MovieScreen) this.f15296t0.mo4947a()).mo17627f0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void mo17764s3(Paging paging) {
        int i = this.f15280B0;
        if (i == paging.pageCount) {
            i = 0;
        }
        this.f15280B0 = i;
        ((MovieScreen) this.f15296t0.mo4947a()).mo17617N1(paging.getMovies());
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public /* synthetic */ void mo17766t4() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void mo17768u3(ErrorBundle cVar) {
        Timber.m24041c(cVar.mo17113c());
        ((MovieScreen) this.f15296t0.mo4947a()).mo17617N1(Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public /* synthetic */ void mo17769v4() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* renamed from: v2 */
    private void m19016v2() {
        CustomDialog.m17424b(mo2379M1(), new C2599b0(this));
    }

    /* renamed from: v3 */
    static /* synthetic */ MovieScreen m19017v3(View view) {
        return new MovieView(ViewMovieBinding.m17747b(view));
    }

    /* renamed from: w2 */
    private boolean m19018w2(DownloadRecord aVar) {
        if (C3052g.m20586g(aVar.f14103e)) {
            return false;
        }
        Uri parse = Uri.parse(aVar.f14103e);
        if (!C3052g.m20581b("content", parse.getScheme())) {
            return new File(parse.getPath()).exists();
        }
        try {
            ParcelFileDescriptor openFileDescriptor = mo2385O1().getContentResolver().openFileDescriptor(parse, "r");
            boolean z = openFileDescriptor != null;
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void mo17770x3() {
        mo17733O4(this.f15302z0);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void mo17772z3(ErrorBundle cVar) {
        ((MovieScreen) this.f15296t0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public /* synthetic */ void mo17773z4() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo17710A2() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* renamed from: F4 */
    public void mo17718F4(Movie movie) {
        this.f15288l0.mo17499E(new C2623h0(this)).mo17498D(new C2609c1(this)).mo17500F(new C2637m(this)).mo17497C(new C2669w1(this)).mo17501o(movie);
    }

    /* renamed from: G4 */
    public void mo17720G4() {
        this.f15289m0.mo17517F(new C2632k0(this)).mo17514C(new C2669w1(this)).mo17518o(C2335a.DOWNLOADING);
    }

    /* renamed from: H4 */
    public void mo17722H4(int i, int i2) {
        this.f15286j0.mo17980x(new C2662u0(this)).mo17979w(new C2644o0(this)).mo17981y(new C2627i1(this)).mo17978v(new C2598b(this)).mo17974p(i, i2);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2674a aVar = (C2674a) mo18584l2();
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f15297u0 = Navigator.m20631b(this);
        this.f15298v0 = aVar.f15303b;
        this.f15299w0 = aVar.f15304c;
        this.f15301y0 = this.f15285i0.mo18615e() != null;
    }

    /* renamed from: J4 */
    public void m19020w4(Movie movie) {
        this.f15290n0.mo17971w(new C2667w(this)).mo17970v(new C2630j1(this)).mo17972x(new C2659t0(this)).mo17969u(new C2598b(this)).mo17965o(movie);
    }

    /* renamed from: K4 */
    public void mo17727K4(List<Category> list) {
        if (!this.f15281C0) {
            LoadMoviesUseCase y = this.f15287k0.mo17982A(new C2661u(this)).mo17991z(new C2596a0(this)).mo17983B(new C2613e(this)).mo17990y(new C2665v0(this));
            int i = this.f15280B0 + 1;
            this.f15280B0 = i;
            y.mo17985q(i, 8, list);
        }
    }

    /* renamed from: M4 */
    public void mo17730M4(Movie movie) {
        this.f15295s0.mo18567w(new C2653r0(this)).mo18566v(new C2621g1(this)).mo18568x(new C2635l0(this, movie)).mo18565u(new C2598b(this)).mo18561o(movie, PurchasePackage.download(movie.download));
    }

    /* renamed from: N4 */
    public void mo17732N4(Movie movie) {
        this.f15295s0.mo18567w(new C2617f0(this)).mo18566v(new C2640n(this)).mo18568x(new C2608c0(this, movie)).mo18565u(new C2598b(this)).mo18561o(movie, PurchasePackage.single(movie.point));
    }

    /* renamed from: O4 */
    public void mo17733O4(Movie movie) {
        this.f15292p0.mo17998w(new C2658t(this)).mo17997v(new C2641n0(this)).mo17999x(new C2655s(this)).mo17996u(new C2598b(this)).mo17992o(movie);
    }

    /* renamed from: a */
    public void mo17367a(ErrorBundle cVar) {
        String str = "Download-Corrupt";
        String str2 = "Download-000002";
        String str3 = "Download-000003";
        String str4 = "Download-Expired";
        String str5 = "666";
        ErrorHandler.m17647d(new C2664v(this)).mo17046c("0000001", new C2612d1(this)).mo17046c(str, new C2614e0(this)).mo17046c(str2, new C2626i0(this)).mo17046c(str3, new C2646p(this)).mo17046c(str4, new C2615e1(this)).mo17046c(str5, new C2676z(this)).mo4887a(cVar);
    }

    /* renamed from: f */
    public void mo17371f() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((MovieScreen) this.f15296t0.mo4947a()).mo17622b(new C2643o(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17623c(new C2607c(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17621a1(new C2649q(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17610E0(new C2600b1(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17631m(new C2628j(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17634p(new C2638m0(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17607C(new C2634l(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17626e(new C2672y(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17628g1(new C2629j0(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17611F1(new C2671x0(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17613J1(new C2625i(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17620Z0(new C2631k(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17619Z(new C2616f(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17609E(new C2595a(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17616M1(new C2624h1(this));
        ((MovieScreen) this.f15296t0.mo4947a()).mo17642z1(new C2668w0(this));
        this.f15284h0.mo17432n(this);
        Movie movie = this.f15302z0;
        if (movie == null) {
            mo17722H4(this.f15298v0, this.f15299w0);
        } else {
            m18973I4(movie);
        }
    }

    /* renamed from: h */
    public void mo17373h() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15284h0.mo17433o(this);
        this.f15286j0.mo17051a();
        this.f15287k0.mo17051a();
        this.f15288l0.mo17051a();
        this.f15289m0.mo17051a();
        this.f15290n0.mo17051a();
        this.f15291o0.mo17051a();
        this.f15292p0.mo17051a();
        this.f15293q0.mo17051a();
        this.f15294r0.mo17051a();
        this.f15295s0.mo17051a();
    }

    /* renamed from: i */
    public void mo17374i(DownloadRecord aVar) {
        MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
        this.f15279A0 = aVar;
        cVar.mo17612J0(aVar, this.f15282D0);
        if (this.f15283E0 == null) {
            ((MovieScreen) this.f15296t0.mo4947a()).mo17635q0(aVar, this.f15282D0);
        }
    }

    /* renamed from: k */
    public void mo17376k(DownloadRecord aVar, Number number) {
        if (number != null) {
            this.f15282D0 = (int) ((((float) number.longValue()) * 100.0f) / ((float) aVar.f14101c.fileSize));
            if (aVar.mo17041f(this.f15279A0)) {
                MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
                this.f15279A0 = aVar;
                cVar.mo17612J0(aVar, this.f15282D0);
                if (this.f15283E0 == null) {
                    ((MovieScreen) this.f15296t0.mo4947a()).mo17635q0(aVar, this.f15282D0);
                }
            }
            if (aVar.mo17041f(this.f15283E0)) {
                MovieScreen cVar2 = (MovieScreen) this.f15296t0.mo4947a();
                this.f15283E0 = aVar;
                cVar2.mo17635q0(aVar, this.f15282D0);
            }
        }
    }

    /* renamed from: l */
    public void mo17378l() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* renamed from: m */
    public void mo17379m() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(true);
    }

    /* renamed from: n */
    public void mo17381n(DownloadRecord aVar) {
        this.f15284h0.mo17425g(aVar.f14101c.fileSize);
        if (aVar.mo17041f(this.f15279A0)) {
            MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
            this.f15279A0 = aVar;
            cVar.mo17612J0(aVar, this.f15282D0);
        }
    }

    /* renamed from: o */
    public void mo17383o(DownloadRecord aVar) {
        this.f15284h0.mo17424f(this.f15302z0.fileSize);
        this.f15284h0.mo17431m(aVar);
        MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
        this.f15279A0 = aVar;
        cVar.mo17612J0(aVar, 0);
        MovieScreen cVar2 = (MovieScreen) this.f15296t0.mo4947a();
        this.f15283E0 = aVar;
        cVar2.mo17635q0(aVar, 0);
    }

    /* renamed from: q */
    public /* synthetic */ void mo17385q() {
        AddDownloadUseCase.m18475a(this);
    }

    /* renamed from: q2 */
    public void mo17760q2(Movie movie) {
        this.f15291o0.mo17949w(new C2650q0(this)).mo17948v(new C2647p0(this)).mo17950x(new C2677z0(this)).mo17947u(new C2598b(this)).mo17943o(movie);
    }

    /* renamed from: r */
    public void mo17387r() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* renamed from: s */
    public /* synthetic */ void mo17388s() {
        StartDownloadUseCase.m18738a(this);
    }

    /* renamed from: s2 */
    public void m19010q4(Movie movie) {
        this.f15293q0.mo17467E(new C2652r(this)).mo17466D(new C2610d(this)).mo17468F(new C2622h(this, movie)).mo17465C(new C2669w1(this)).mo17469o(movie);
    }

    /* renamed from: t */
    public void mo17389t() {
        ((MovieScreen) this.f15296t0.mo4947a()).mo17625d2(false);
    }

    /* renamed from: t2 */
    public void mo17765t2() {
        this.f15294r0.mo17483D(new C2670x(this)).mo17482C(new C2669w1(this)).mo17484o();
    }

    /* renamed from: u */
    public void mo17391u(DownloadRecord aVar, File file) {
        if (aVar.mo17041f(this.f15279A0)) {
            MovieScreen cVar = (MovieScreen) this.f15296t0.mo4947a();
            this.f15279A0 = aVar;
            cVar.mo17612J0(aVar, 100);
        }
        if (aVar.mo17041f(this.f15283E0)) {
            mo17720G4();
        }
    }

    /* renamed from: u2 */
    public void mo17767u2(ErrorBundle cVar) {
        MovieScreen cVar2 = (MovieScreen) this.f15296t0.mo4947a();
        String str = "C000002";
        String str2 = "C002002";
        ErrorHandler.m17647d(new C2673y0(cVar2)).mo17046c("0000001", new C2620g0(this)).mo17046c(str, new C2618f1(cVar2)).mo17046c(str2, new C2597a1(cVar2)).mo17046c("C000013", new C2656s0(cVar2)).mo4887a(cVar);
    }
}
