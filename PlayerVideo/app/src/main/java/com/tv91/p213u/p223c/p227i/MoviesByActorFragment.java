package com.tv91.p213u.p223c.p227i;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.model.Actor;
import com.tv91.p210r.LayoutMoviesBinding;
import com.tv91.p213u.p223c.MoviesScreen;
import com.tv91.p213u.p223c.MoviesScreen.MoviesScreenPlayer;
import com.tv91.p252x.FragmentKey;
import p010b.p018b.p019a.p022c.Function;

/* renamed from: com.tv91.u.c.i.z */
public final class MoviesByActorFragment extends BaseMoviesFragment {

    /* renamed from: o0 */
    private int f15449o0;

    /* renamed from: p0 */
    private String f15450p0;

    /* renamed from: com.tv91.u.c.i.z$a */
    /* compiled from: MoviesByActorFragment */
    public static final class C2759a extends FragmentKey {
        public static final Creator<C2759a> CREATOR = new C2760a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f15451b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f15452c;

        /* renamed from: com.tv91.u.c.i.z$a$a */
        /* compiled from: MoviesByActorFragment */
        static class C2760a implements Creator<C2759a> {
            C2760a() {
            }

            /* renamed from: a */
            public C2759a createFromParcel(Parcel parcel) {
                return new C2759a(parcel);
            }

            /* renamed from: b */
            public C2759a[] newArray(int i) {
                return new C2759a[i];
            }
        }

        public C2759a(Actor actor) {
            this(actor.f14079id, actor.name);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new MoviesByActorFragment();
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
            parcel.writeInt(this.f15451b);
            parcel.writeString(this.f15452c);
        }

        public C2759a(int i, String str) {
            super("女優影片清單頁面");
            this.f15451b = i;
            this.f15452c = str;
        }

        protected C2759a(Parcel parcel) {
            super(parcel);
            this.f15451b = parcel.readInt();
            this.f15452c = parcel.readString();
        }
    }

    public MoviesByActorFragment() {
        super(R.layout.layout_movies);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ MoviesScreenPlayer mo17906b3(View view) {
        return new C2741d(LayoutMoviesBinding.m17811b(view), this.f15450p0);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2759a aVar = (C2759a) mo18584l2();
        mo132b().mo2999a(new UmengObserver(aVar.getClassName()));
        this.f15449o0 = aVar.f15451b;
        this.f15450p0 = aVar.f15452c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo17847T2() {
        mo17894U2(this.f15449o0, MoviesScreen.f15178a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public Function<View, MoviesScreenPlayer> mo17848Z2() {
        return new C2753p(this);
    }
}
