package com.tv91.p213u.p223c.p225g;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.Recyclers;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.C2310i;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.model.Movie;
import com.tv91.p210r.AdapterMoviesFavoriteBinding;
import com.tv91.p210r.ViewFavoriteBinding;
import com.tv91.p213u.p223c.FavoriteScreen;
import com.tv91.p250v.ResourceEntry;
import com.tv91.utils.C3052g;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.g.v */
final class FavoriteView extends BasicView implements FavoriteScreen {

    /* renamed from: e */
    private final ViewFavoriteBinding f15335e;

    /* renamed from: f */
    private final Toolbar f15336f;

    /* renamed from: g */
    private final C2699b f15337g;

    /* renamed from: com.tv91.u.c.g.v$b */
    /* compiled from: FavoriteView */
    private static class C2699b extends RecyclerAdapter<Movie, C2700c> {

        /* renamed from: e */
        private boolean f15338e;

        /* renamed from: f */
        private Consumer<Movie> f15339f;

        private C2699b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: O */
        public /* synthetic */ void mo17811P(C2700c cVar, View view) {
            Consumer<Movie> aVar = this.f15339f;
            if (aVar != null) {
                aVar.mo4887a(mo16833B(cVar.mo3369j()));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: R */
        public void m19181R(Consumer<Movie> aVar) {
            this.f15339f = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: S */
        public void m19182S() {
            this.f15338e = !this.f15338e;
            mo3414h();
        }

        /* access modifiers changed from: protected */
        /* renamed from: N */
        public C2700c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            C2700c cVar = new C2700c(AdapterMoviesFavoriteBinding.m17723d(layoutInflater, viewGroup, false));
            cVar.f15340w.f14381b.setOnClickListener(Clicks.m17391a(new C2695r(this, cVar)));
            return cVar;
        }

        /* renamed from: Q */
        public void mo3419m(C2700c cVar, int i) {
            Movie movie = (Movie) mo16833B(i);
            if (movie != null) {
                cVar.m19190V(movie, this.f15338e);
            }
        }
    }

    /* renamed from: com.tv91.u.c.g.v$c */
    /* compiled from: FavoriteView */
    private static class C2700c extends ViewHolder<Movie> {
        /* access modifiers changed from: private */

        /* renamed from: w */
        public final AdapterMoviesFavoriteBinding f15340w;

        /* access modifiers changed from: private */
        /* renamed from: V */
        public void m19190V(Movie movie, boolean z) {
            this.f13991v.mo18692b(C3052g.m20586g(movie.poster) ? movie.image : movie.poster).mo18695e(R.drawable.photo_poster_medium).mo18693c(R.drawable.photo_poster_medium).mo18697g(this.f15340w.f14382c);
            this.f15340w.f14385f.setText(movie.name);
            int i = 0;
            this.f15340w.f14384e.setText(mo16849R(R.string.movie_create_date, movie.createTime));
            if (z) {
                this.f15340w.f14383d.startAnimation(ResourceEntry.m20604a(this.f13990u).mo16914a());
            } else {
                this.f15340w.f14383d.clearAnimation();
            }
            FrameLayout frameLayout = this.f15340w.f14381b;
            if (!z) {
                i = 8;
            }
            frameLayout.setVisibility(i);
        }

        private C2700c(AdapterMoviesFavoriteBinding hVar) {
            super(hVar);
            this.f15340w = hVar;
        }
    }

    FavoriteView(ViewFavoriteBinding e0Var) {
        super(e0Var);
        this.f15335e = e0Var;
        Toolbar gVar = new Toolbar(e0Var.f14349e);
        this.f15336f = gVar;
        C2699b bVar = new C2699b();
        this.f15337g = bVar;
        gVar.mo16828p(R.string.favorite_title);
        gVar.mo16819c(R.menu.menu_favorite_edit);
        e0Var.f14348d.setAdapter(bVar);
        e0Var.f14348d.setLayoutManager(new GridLayoutManager(this.f13974b, 2));
    }

    /* renamed from: H1 */
    public void mo17589H1(List<Movie> list) {
        this.f15337g.mo16842x(list);
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f15336f.mo16817a();
        Recyclers.m17374d(this.f15335e.f14348d, bundle);
    }

    /* renamed from: L */
    public void mo17590L() {
        this.f15337g.m19182S();
    }

    /* renamed from: Q0 */
    public void mo17591Q0(String str, Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.favorite_dialog_remove_title).mo16900n(mo16815o2(R.string.favorite_dialog_remove_message, str)).mo16909w(R.string.dialog_button_remove, runnable).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: W */
    public void mo17592W(Movie movie) {
        this.f15337g.mo16839I(movie);
        Toast.makeText(this.f13974b, R.string.favorite_remove_success, 0).show();
    }

    /* renamed from: a */
    public void mo17593a(boolean z) {
        this.f15335e.f14347c.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo17594b(Runnable runnable) {
        this.f15336f.mo16821i(runnable);
    }

    /* renamed from: c */
    public void mo17595c(Runnable runnable) {
        this.f15335e.f14348d.mo3254k(C2310i.REACH_BOTTOM.mo16855c(10, runnable));
    }

    /* renamed from: e */
    public void mo17596e(Consumer<Movie> aVar) {
        this.f15337g.mo16838H(aVar);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15336f.mo16818b();
        Recyclers.m17376f(this.f15335e.f14348d, bundle);
        this.f15335e.f14348d.mo3313t();
        this.f15337g.mo16843z(false);
        this.f15337g.mo16838H(null);
        this.f15337g.m19181R(null);
    }

    /* renamed from: n */
    public void mo17597n(Consumer<Movie> aVar) {
        this.f15337g.m19181R(aVar);
    }

    /* renamed from: o */
    public void mo17598o(Runnable runnable) {
        this.f15336f.mo16825m(runnable);
    }
}
