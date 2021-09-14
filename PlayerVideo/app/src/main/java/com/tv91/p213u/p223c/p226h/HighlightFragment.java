package com.tv91.p213u.p223c.p226h;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.Category;
import com.tv91.model.ExternalSource;
import com.tv91.model.Highlight;
import com.tv91.model.Highlight.MovieGroup;
import com.tv91.model.Movie;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.LayoutHighlightBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p223c.HighlightScreen;
import com.tv91.p213u.p223c.p224f.MovieFragment.C2674a;
import com.tv91.p213u.p223c.p227i.MoviesBySourceFragment.C2735a;
import com.tv91.p213u.p223c.p229k.LoadHighlightUseCase;
import com.tv91.p252x.BrowserKey;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.utils.FragmentUtils;

/* renamed from: com.tv91.u.c.h.r */
public final class HighlightFragment extends Hilt_HighlightFragment {

    /* renamed from: h0 */
    LoadHighlightUseCase f15369h0;

    /* renamed from: i0 */
    private final ViewSupplier<HighlightScreen> f15370i0 = new ViewSupplier<>(this, C2704d.f15348a);

    /* renamed from: j0 */
    private Navigator f15371j0;

    /* renamed from: k0 */
    private Highlight f15372k0;

    /* renamed from: com.tv91.u.c.h.r$a */
    /* compiled from: HighlightFragment */
    public static final class C2718a extends FragmentKey {
        public static final Creator<C2718a> CREATOR = new C2719a();

        /* renamed from: com.tv91.u.c.h.r$a$a */
        /* compiled from: HighlightFragment */
        static class C2719a implements Creator<C2718a> {
            C2719a() {
            }

            /* renamed from: a */
            public C2718a createFromParcel(Parcel parcel) {
                return new C2718a(parcel);
            }

            /* renamed from: b */
            public C2718a[] newArray(int i) {
                return new C2718a[i];
            }
        }

        public C2718a() {
            super("精選");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new HighlightFragment();
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

        protected C2718a(Parcel parcel) {
            super(parcel);
        }
    }

    public HighlightFragment() {
        super(R.layout.layout_highlight);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public void m19209C2(Highlight highlight) {
        this.f15372k0 = highlight;
        ((HighlightScreen) this.f15370i0.mo4947a()).mo17600S(highlight.advertise);
        ((HighlightScreen) this.f15370i0.mo4947a()).mo17603i1(highlight.rankingTop, highlight.rankingMonth, highlight.rankingYear);
        for (MovieGroup movieGroup : highlight.groups) {
            if (!movieGroup.movies.isEmpty()) {
                ((HighlightScreen) this.f15370i0.mo4947a()).mo17599N(movieGroup);
            }
        }
        ((HighlightScreen) this.f15370i0.mo4947a()).mo17605r(highlight.web);
        ((HighlightScreen) this.f15370i0.mo4947a()).mo17606y(highlight.recommend);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo17826t2(ErrorBundle cVar) {
        ((HighlightScreen) this.f15370i0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* renamed from: u2 */
    static /* synthetic */ HighlightScreen m19212u2(View view) {
        return new HighlightView(LayoutHighlightBinding.m17805b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo17827w2(ExternalSource externalSource) {
        if (!FragmentUtils.m20586g(externalSource.url)) {
            this.f15371j0.mo18588e(new BrowserKey(externalSource.url));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo17828y2(MovieGroup movieGroup) {
        if (movieGroup.hasMore) {
            this.f15371j0.mo18588e(new C2735a(new Category(movieGroup.f14082id, movieGroup.title)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo17823A2(Movie movie) {
        this.f15371j0.mo18588e(new C2674a(movie.f14083id, movie.sourceId));
    }

    /* renamed from: B2 */
    public void mo17824B2() {
        Highlight highlight = this.f15372k0;
        if (highlight != null) {
            m19209C2(highlight);
        } else {
            this.f15369h0.mo17964v(new C2706f(this)).mo17963u(new C2701a(this)).mo17959o();
        }
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f15371j0 = Navigator.m20631b(this);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((HighlightScreen) this.f15370i0.mo4947a()).mo17601b2(new C2707g(this));
        ((HighlightScreen) this.f15370i0.mo4947a()).mo17604o0(new C2703c(this));
        ((HighlightScreen) this.f15370i0.mo4947a()).mo17602e(new C2702b(this));
        mo17824B2();
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15369h0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo17825q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2705e(this)).mo4887a(cVar);
    }
}
