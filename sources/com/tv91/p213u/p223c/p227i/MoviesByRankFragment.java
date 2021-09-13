package com.tv91.p213u.p223c.p227i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.model.RankType;
import com.tv91.p210r.LayoutMoviesBinding;
import com.tv91.p213u.p223c.MoviesScreen.C2593a;
import com.tv91.p252x.FragmentKey;
import p010b.p018b.p019a.p022c.Function;

/* renamed from: com.tv91.u.c.i.c0 */
public final class MoviesByRankFragment extends BaseMoviesFragment {

    /* renamed from: o0 */
    private RankType f15399o0;

    /* renamed from: p0 */
    private String f15400p0;

    /* renamed from: com.tv91.u.c.i.c0$a */
    /* compiled from: MoviesByRankFragment */
    static /* synthetic */ class C2731a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15401a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tv91.model.c[] r0 = com.tv91.model.RankType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15401a = r0
                com.tv91.model.c r1 = com.tv91.model.RankType.DAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15401a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.model.c r1 = com.tv91.model.RankType.MONTH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15401a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.model.c r1 = com.tv91.model.RankType.YEAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p223c.p227i.MoviesByRankFragment.C2731a.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.u.c.i.c0$b */
    /* compiled from: MoviesByRankFragment */
    public static final class C2732b extends FragmentKey {
        public static final Creator<C2732b> CREATOR = new C2733a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final RankType f15402b;

        /* renamed from: com.tv91.u.c.i.c0$b$a */
        /* compiled from: MoviesByRankFragment */
        static class C2733a implements Creator<C2732b> {
            C2733a() {
            }

            /* renamed from: a */
            public C2732b createFromParcel(Parcel parcel) {
                return new C2732b(parcel);
            }

            /* renamed from: b */
            public C2732b[] newArray(int i) {
                return new C2732b[i];
            }
        }

        public C2732b(RankType cVar) {
            super("排行榜影片清單頁面");
            this.f15402b = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new MoviesByRankFragment();
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
            parcel.writeInt(this.f15402b.mo17044b());
        }

        protected C2732b(Parcel parcel) {
            super(parcel);
            this.f15402b = RankType.m17633a(parcel.readInt());
        }
    }

    public MoviesByRankFragment() {
        super(R.layout.layout_movies);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ C2593a mo17860b3(View view) {
        return new C2741d(LayoutMoviesBinding.m17811b(view), this.f15400p0);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2732b bVar = (C2732b) mo18584l2();
        mo132b().mo2999a(new UmengObserver(bVar.mo18581m()));
        RankType r = bVar.f15402b;
        this.f15399o0 = r;
        int i = C2731a.f15401a[r.ordinal()];
        if (i == 1) {
            this.f15400p0 = mo2443i0(R.string.movies_ranking_today);
        } else if (i != 2) {
            this.f15400p0 = mo2443i0(R.string.movies_ranking_year);
        } else {
            this.f15400p0 = mo2443i0(R.string.movies_ranking_month);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo17847T2() {
        mo17897X2(this.f15399o0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public Function<View, C2593a> mo17848Z2() {
        return new C2756s(this);
    }
}
