package com.tv91.p213u.p223c.p227i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.model.Channel;
import com.tv91.p210r.LayoutMoviesBinding;
import com.tv91.p213u.p223c.MoviesScreen;
import com.tv91.p213u.p223c.MoviesScreen.C2593a;
import com.tv91.p252x.FragmentKey;
import p010b.p018b.p019a.p022c.Function;

/* renamed from: com.tv91.u.c.i.b0 */
public final class MoviesByChannelFragment extends BaseMoviesFragment {

    /* renamed from: o0 */
    private int f15396o0;

    /* renamed from: com.tv91.u.c.i.b0$a */
    /* compiled from: MoviesByChannelFragment */
    public static final class C2728a extends FragmentKey {
        public static final Creator<C2728a> CREATOR = new C2729a();

        /* renamed from: b */
        public final int f15397b;

        /* renamed from: com.tv91.u.c.i.b0$a$a */
        /* compiled from: MoviesByChannelFragment */
        static class C2729a implements Creator<C2728a> {
            C2729a() {
            }

            /* renamed from: a */
            public C2728a createFromParcel(Parcel parcel) {
                return new C2728a(parcel);
            }

            /* renamed from: b */
            public C2728a[] newArray(int i) {
                return new C2728a[i];
            }
        }

        public C2728a(Channel channel) {
            super(channel.value);
            this.f15397b = channel.key;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new MoviesByChannelFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
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

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f15397b);
        }

        protected C2728a(Parcel parcel) {
            super(parcel);
            this.f15397b = parcel.readInt();
        }
    }

    public MoviesByChannelFragment() {
        super(R.layout.layout_movies);
    }

    /* renamed from: a3 */
    static /* synthetic */ C2593a m19292a3(View view) {
        return new C2740c(LayoutMoviesBinding.m17811b(view), null);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2728a aVar = (C2728a) mo18584l2();
        mo132b().mo2999a(new UmengObserver(aVar.mo18581m()));
        this.f15396o0 = aVar.f15397b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo17847T2() {
        mo17896W2(this.f15396o0, MoviesScreen.f15179b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public Function<View, C2593a> mo17848Z2() {
        return C2755r.f15434a;
    }
}
