package com.tv91.p213u.p214a.p215m;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.Actor;
import com.tv91.model.Paging;
import com.tv91.p210r.ViewActorBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p214a.ActorScreen;
import com.tv91.p213u.p214a.ActorScreen.C2357a;
import com.tv91.p213u.p214a.BottomBarFragment;
import com.tv91.p213u.p214a.Dashboard;
import com.tv91.p213u.p214a.p220r.LoadActorsUseCase;
import com.tv91.p213u.p223c.p227i.MoviesByActorFragment.C2759a;
import com.tv91.p213u.p223c.p228j.MovieSearchFragment.C2773a;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import java.util.ArrayList;
import java.util.List;
import p295h.p296a.Timber;

/* renamed from: com.tv91.u.a.m.i */
public final class ActorFragment extends BottomBarFragment<C2357a> {

    /* renamed from: k0 */
    LoadActorsUseCase f14768k0;

    /* renamed from: l0 */
    private final ViewSupplier<C2357a> f14769l0 = new ViewSupplier<>(this, C2365g.f14766a);

    /* renamed from: m0 */
    private Navigator f14770m0;

    /* renamed from: n0 */
    private final List<Actor> f14771n0 = new ArrayList();

    /* renamed from: o0 */
    private int f14772o0 = 0;

    /* renamed from: p0 */
    private boolean f14773p0 = false;

    /* renamed from: q0 */
    private boolean f14774q0 = true;

    /* renamed from: com.tv91.u.a.m.i$a */
    /* compiled from: ActorFragment */
    public static final class C2367a extends FragmentKey {
        public static final Creator<C2367a> CREATOR = new C2368a();

        /* renamed from: com.tv91.u.a.m.i$a$a */
        /* compiled from: ActorFragment */
        static class C2368a implements Creator<C2367a> {
            C2368a() {
            }

            /* renamed from: a */
            public C2367a createFromParcel(Parcel parcel) {
                return new C2367a(parcel);
            }

            /* renamed from: b */
            public C2367a[] newArray(int i) {
                return new C2367a[i];
            }
        }

        public C2367a() {
            super("女優清單頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new ActorFragment();
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

        protected C2367a(Parcel parcel) {
            super(parcel);
        }
    }

    public ActorFragment() {
        super(R.layout.view_actor);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo17166B2(ErrorBundle cVar) {
        Timber.m24041c(cVar.mo17113c());
        ((C2357a) this.f14769l0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* renamed from: C2 */
    static /* synthetic */ C2357a m17902C2(View view) {
        return new ActorView(ViewActorBinding.m17838b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo17167E2() {
        this.f14770m0.mo18588e(new C2773a());
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void mo17168G2(Actor actor) {
        this.f14770m0.mo18588e(new C2759a(actor));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo17170v2() {
        C2357a aVar = (C2357a) this.f14769l0.mo4947a();
        this.f14773p0 = true;
        aVar.mo17127a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo17171x2() {
        C2357a aVar = (C2357a) this.f14769l0.mo4947a();
        this.f14773p0 = false;
        aVar.mo17127a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo17172z2(Paging paging) {
        this.f14774q0 = this.f14772o0 < paging.pageCount;
        this.f14771n0.addAll(paging.getData());
        ((C2357a) this.f14769l0.mo4947a()).mo17129d0(paging.getData());
    }

    /* renamed from: H2 */
    public void mo17169H2() {
        if (!this.f14773p0 && this.f14774q0) {
            LoadActorsUseCase u = this.f14768k0.mo17308w(new C2364f(this)).mo17307v(new C2361c(this)).mo17309x(new C2363e(this)).mo17306u(new C2362d(this));
            int i = this.f14772o0 + 1;
            this.f14772o0 = i;
            u.mo17302o(i, ActorScreen.f14727a);
        }
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f14770m0 = Navigator.m20631b(this);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2357a) this.f14769l0.mo4947a()).mo17130h(new C2366h(this));
        ((C2357a) this.f14769l0.mo4947a()).mo17131p(new C2360b(this));
        ((C2357a) this.f14769l0.mo4947a()).mo17128c(new C2359a(this));
        if (this.f14771n0.isEmpty()) {
            mo17169H2();
        } else {
            ((C2357a) this.f14769l0.mo4947a()).mo17129d0(this.f14771n0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f14768k0.mo17051a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public Dashboard mo17132n2() {
        return Dashboard.ACTOR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public ViewSupplier<C2357a> mo17133o2() {
        return this.f14769l0;
    }
}
