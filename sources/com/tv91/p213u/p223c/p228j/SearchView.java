package com.tv91.p213u.p223c.p228j;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.Recyclers;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.C2310i;
import com.tv91.features.shared.p206i.Editors;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Movie;
import com.tv91.p210r.AdapterMoviesBinding;
import com.tv91.p210r.ViewMovieSearchBinding;
import com.tv91.p213u.p223c.SearchScreen.C2594a;
import com.tv91.utils.C3052g;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.j.q */
final class SearchView extends BasicView implements C2594a {

    /* renamed from: e */
    private final ViewMovieSearchBinding f15479e;

    /* renamed from: f */
    private final Toolbar f15480f;

    /* renamed from: g */
    private final C2776b f15481g;

    /* renamed from: com.tv91.u.c.j.q$b */
    /* compiled from: SearchView */
    private static class C2776b extends RecyclerAdapter<Movie, C2777c> {
        private C2776b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2777c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2777c(AdapterMoviesBinding.m17716d(layoutInflater, viewGroup, false));
        }
    }

    /* renamed from: com.tv91.u.c.j.q$c */
    /* compiled from: SearchView */
    private static class C2777c extends ViewHolder<Movie> {

        /* renamed from: w */
        private final AdapterMoviesBinding f15482w;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Movie movie) {
            this.f13991v.mo18692b(C3052g.m20586g(movie.poster) ? movie.image : movie.poster).mo18695e(R.drawable.photo_poster_medium).mo18693c(R.drawable.photo_poster_medium).mo18697g(this.f15482w.f14366b);
            this.f15482w.f14368d.setText(movie.name);
            this.f15482w.f14367c.setText(mo16849R(R.string.movie_create_date, movie.createTime));
        }

        private C2777c(AdapterMoviesBinding gVar) {
            super(gVar);
            this.f15482w = gVar;
        }
    }

    SearchView(ViewMovieSearchBinding l0Var) {
        super(l0Var);
        this.f15479e = l0Var;
        Toolbar gVar = new Toolbar(l0Var.f14482h);
        this.f15480f = gVar;
        C2776b bVar = new C2776b();
        this.f15481g = bVar;
        gVar.mo16828p(R.string.search_title);
        gVar.mo16819c(R.menu.menu_cancel);
        l0Var.f14478d.setAdapter(bVar);
        l0Var.f14478d.setLayoutManager(new GridLayoutManager(this.f13974b, 2));
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo17933r2(Consumer aVar, View view, boolean z) {
        if (!z) {
            mo16816p2(view);
            aVar.mo4887a(this.f15479e.f14479e.getText());
        }
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f15480f.mo16817a();
        Recyclers.m17374d(this.f15479e.f14478d, bundle);
    }

    /* renamed from: O */
    public void mo17648O(List<Movie> list, boolean z) {
        if (z) {
            this.f15481g.mo16840J(list);
        } else {
            this.f15481g.mo16842x(list);
        }
    }

    /* renamed from: Y1 */
    public void mo17649Y1(Consumer<CharSequence> aVar) {
        this.f15479e.f14479e.setOnFocusChangeListener(new C2770j(this, aVar));
        this.f15479e.f14479e.setOnEditorActionListener(Editors.m17394b(new C2771k(aVar)));
    }

    /* renamed from: a */
    public void mo17650a(boolean z) {
        this.f15479e.f14477c.setVisibility(z ? 0 : 8);
    }

    /* renamed from: c */
    public void mo17651c(Runnable runnable) {
        this.f15479e.f14478d.mo3254k(C2310i.REACH_BOTTOM.mo16855c(6, runnable));
    }

    /* renamed from: d */
    public void mo17652d(Runnable runnable) {
        this.f15480f.mo16822j(runnable);
    }

    /* renamed from: e */
    public void mo17653e(Consumer<Movie> aVar) {
        this.f15481g.mo16838H(aVar);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15480f.mo16818b();
        this.f15479e.f14479e.setOnFocusChangeListener(null);
        this.f15479e.f14479e.setOnEditorActionListener(null);
        Recyclers.m17376f(this.f15479e.f14478d, bundle);
        this.f15481g.mo16843z(false);
        this.f15481g.mo16838H(null);
        this.f15479e.f14478d.mo3313t();
    }
}
