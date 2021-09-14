package com.tv91.p213u.p223c.p227i;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.model.Category;
import com.tv91.p210r.LayoutMoviesBinding;
import com.tv91.p213u.p223c.MoviesScreen;
import com.tv91.p213u.p223c.MoviesScreen.MoviesScreenPlayer;
import com.tv91.p252x.FragmentKey;
import p010b.p018b.p019a.p022c.Function;

/* renamed from: com.tv91.u.c.i.a0 */
public final class MoviesByCategoryFragment extends BaseMoviesFragment {

    /* renamed from: o0 */
    private int f15391o0;

    /* renamed from: p0 */
    private String f15392p0;

    /* renamed from: com.tv91.u.c.i.a0$a */
    /* compiled from: MoviesByCategoryFragment */
    public static final class C2725a extends FragmentKey {
        public static final Creator<C2725a> CREATOR = new C2726a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f15393b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f15394c;

        /* renamed from: com.tv91.u.c.i.a0$a$a */
        /* compiled from: MoviesByCategoryFragment */
        static class C2726a implements Creator<C2725a> {
            C2726a() {
            }

            /* renamed from: a */
            public C2725a createFromParcel(Parcel parcel) {
                return new C2725a(parcel);
            }

            /* renamed from: b */
            public C2725a[] newArray(int i) {
                return new C2725a[i];
            }
        }

        public C2725a(Category category) {
            super("類別影片清單頁面");
            this.f15393b = category.key;
            this.f15394c = category.value;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new MoviesByCategoryFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
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
            parcel.writeInt(this.f15393b);
            parcel.writeString(this.f15394c);
        }

        protected C2725a(Parcel parcel) {
            super(parcel);
            this.f15393b = parcel.readInt();
            this.f15394c = parcel.readString();
        }
    }

    public MoviesByCategoryFragment() {
        super(R.layout.layout_movies);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ MoviesScreenPlayer mo17849b3(View view) {
        return new C2741d(LayoutMoviesBinding.m17811b(view), this.f15392p0);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2725a aVar = (C2725a) mo18584l2();
        mo132b().mo2999a(new UmengObserver(aVar.getClassName()));
        this.f15391o0 = aVar.f15393b;
        this.f15392p0 = aVar.f15394c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo17847T2() {
        mo17895V2(this.f15391o0, MoviesScreen.f15178a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public Function<View, MoviesScreenPlayer> mo17848Z2() {
        return new C2754q(this);
    }
}
