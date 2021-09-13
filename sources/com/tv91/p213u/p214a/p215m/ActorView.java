package com.tv91.p213u.p214a.p215m;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.Recyclers;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.C2310i;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Actor;
import com.tv91.p210r.AdapterActorBinding;
import com.tv91.p210r.LayoutToolbarBottomBinding;
import com.tv91.p210r.ViewActorBinding;
import com.tv91.p213u.p214a.ActorScreen.C2357a;
import com.tv91.p213u.p214a.BottomBarView;
import com.tv91.p213u.p214a.Dashboard;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.m.l */
final class ActorView extends BottomBarView implements C2357a {

    /* renamed from: g */
    private final ViewActorBinding f14775g;

    /* renamed from: h */
    private final Toolbar f14776h;

    /* renamed from: i */
    private final C2370b f14777i;

    /* renamed from: com.tv91.u.a.m.l$b */
    /* compiled from: ActorView */
    private static class C2370b extends RecyclerAdapter<Actor, C2371c> {
        private C2370b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2371c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2371c(AdapterActorBinding.m17674d(layoutInflater, viewGroup, false));
        }
    }

    /* renamed from: com.tv91.u.a.m.l$c */
    /* compiled from: ActorView */
    private static class C2371c extends ViewHolder<Actor> {

        /* renamed from: w */
        private final AdapterActorBinding f14778w;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Actor actor) {
            this.f13991v.mo18692b(actor.avatar).mo18695e(R.drawable.photo_woman).mo18693c(R.drawable.photo_woman).mo18697g(this.f14778w.f14284b);
            this.f14778w.f14286d.setText(actor.name);
            this.f14778w.f14285c.setText(String.valueOf(actor.count));
        }

        private C2371c(AdapterActorBinding aVar) {
            super(aVar);
            this.f14778w = aVar;
        }
    }

    ActorView(ViewActorBinding zVar) {
        super(Dashboard.ACTOR, LayoutToolbarBottomBinding.m17824b(zVar.f14688c));
        this.f14775g = zVar;
        Toolbar gVar = new Toolbar(zVar.f14692g);
        this.f14776h = gVar;
        C2370b bVar = new C2370b();
        this.f14777i = bVar;
        gVar.mo16828p(R.string.bottom_menu_actress);
        gVar.mo16819c(R.menu.menu_search);
        zVar.f14691f.setAdapter(bVar);
        zVar.f14691f.setLayoutManager(new GridLayoutManager(this.f13974b, 3));
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f14776h.mo16817a();
        Recyclers.m17374d(this.f14775g.f14691f, bundle);
    }

    /* renamed from: a */
    public void mo17127a(boolean z) {
        this.f14775g.f14690e.setVisibility(z ? 0 : 8);
    }

    /* renamed from: c */
    public void mo17128c(Runnable runnable) {
        this.f14775g.f14691f.mo3254k(C2310i.REACH_BOTTOM.mo16855c(15, runnable));
    }

    /* renamed from: d0 */
    public void mo17129d0(List<Actor> list) {
        this.f14777i.mo16842x(list);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h */
    public void mo17130h(Runnable runnable) {
        this.f14776h.mo16826n(runnable);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        super.mo16553h2(bundle);
        this.f14776h.mo16818b();
        Recyclers.m17376f(this.f14775g.f14691f, bundle);
        this.f14777i.mo16838H(null);
        this.f14777i.mo16843z(false);
        this.f14775g.f14691f.mo3313t();
    }

    /* renamed from: p */
    public void mo17131p(Consumer<Actor> aVar) {
        this.f14777i.mo16838H(aVar);
    }
}
