package com.tv91.p213u.p223c.p227i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.model.Category;
import com.tv91.p210r.LayoutMoviesBinding;
import com.tv91.p213u.p223c.MoviesScreen;
import com.tv91.p213u.p223c.MoviesScreen.C2593a;
import com.tv91.p252x.FragmentKey;
import p010b.p018b.p019a.p022c.Function;

/* renamed from: com.tv91.u.c.i.d0 */
public final class MoviesBySourceFragment extends BaseMoviesFragment {

    /* renamed from: o0 */
    private int f15404o0;

    /* renamed from: p0 */
    private String f15405p0;

    /* renamed from: com.tv91.u.c.i.d0$a */
    /* compiled from: MoviesBySourceFragment */
    public static final class C2735a extends FragmentKey {
        public static final Creator<C2735a> CREATOR = new C2736a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f15406b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f15407c;

        /* renamed from: com.tv91.u.c.i.d0$a$a */
        /* compiled from: MoviesBySourceFragment */
        static class C2736a implements Creator<C2735a> {
            C2736a() {
            }

            /* renamed from: a */
            public C2735a createFromParcel(Parcel parcel) {
                return new C2735a(parcel);
            }

            /* renamed from: b */
            public C2735a[] newArray(int i) {
                return new C2735a[i];
            }
        }

        public C2735a(Category category) {
            super("其他類別影片清單頁面");
            this.f15406b = category.key;
            this.f15407c = category.value;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new MoviesBySourceFragment();
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
            parcel.writeInt(this.f15406b);
            parcel.writeString(this.f15407c);
        }

        protected C2735a(Parcel parcel) {
            super(parcel);
            this.f15406b = parcel.readInt();
            this.f15407c = parcel.readString();
        }
    }

    public MoviesBySourceFragment() {
        super(R.layout.layout_movies);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ C2593a mo17866b3(View view) {
        return new C2741d(LayoutMoviesBinding.m17811b(view), this.f15405p0);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2735a aVar = (C2735a) mo18584l2();
        mo132b().mo2999a(new UmengObserver(aVar.mo18581m()));
        this.f15404o0 = aVar.f15406b;
        this.f15405p0 = aVar.f15407c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo17847T2() {
        mo17898Y2(this.f15404o0, MoviesScreen.f15178a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public Function<View, C2593a> mo17848Z2() {
        return new C2757t(this);
    }
}
