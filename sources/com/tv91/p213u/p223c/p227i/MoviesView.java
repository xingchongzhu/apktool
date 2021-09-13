package com.tv91.p213u.p223c.p227i;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.Recyclers;
import com.tv91.features.shared.p206i.C2310i;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Movie;
import com.tv91.p210r.LayoutMoviesBinding;
import com.tv91.p213u.p223c.MoviesScreen.C2593a;
import com.tv91.p255z.C3066f;
import com.tv91.p255z.ImageLoader;
import com.tv91.utils.C3052g;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.i.e0 */
class MoviesView extends BasicView implements C2593a {

    /* renamed from: e */
    private final LayoutMoviesBinding f15409e;

    /* renamed from: f */
    private final Toolbar f15410f;

    /* renamed from: g */
    private final C2738a f15411g;

    /* renamed from: h */
    private final int f15412h;

    /* renamed from: com.tv91.u.c.i.e0$a */
    /* compiled from: MoviesView */
    private static class C2738a extends RecyclerAdapter<Movie, C2739b> {

        /* renamed from: e */
        private final C2742e f15413e;

        C2738a(C2742e eVar) {
            this.f15413e = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2739b mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2739b(layoutInflater.inflate(i, viewGroup, false));
        }

        /* access modifiers changed from: protected */
        /* renamed from: M */
        public void mo16837G(C2739b bVar, Movie movie) {
            if (this.f15413e == C2742e.LARGE) {
                bVar.mo17874M(movie);
            } else {
                bVar.mo17875N(movie);
            }
        }

        /* renamed from: e */
        public int mo3411e(int i) {
            return this.f15413e == C2742e.LARGE ? R.layout.adapter_movies_home : R.layout.adapter_movies;
        }
    }

    /* renamed from: com.tv91.u.c.i.e0$b */
    /* compiled from: MoviesView */
    private static class C2739b extends C0407d0 {

        /* renamed from: t */
        private final Context f15414t;

        /* renamed from: u */
        private final C3066f f15415u;

        /* renamed from: v */
        private final ImageView f15416v;

        /* renamed from: w */
        private final TextView f15417w;

        /* renamed from: x */
        private final TextView f15418x;

        C2739b(View view) {
            super(view);
            this.f15414t = view.getContext();
            this.f15415u = ImageLoader.m20833e(view.getContext());
            this.f15416v = (ImageView) view.findViewById(R.id.image_movie_cover);
            this.f15417w = (TextView) view.findViewById(R.id.text_movie_name);
            this.f15418x = (TextView) view.findViewById(R.id.text_movie_date);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: M */
        public void mo17874M(Movie movie) {
            this.f15415u.mo18692b(C3052g.m20586g(movie.poster) ? movie.image : movie.poster).mo18695e(R.drawable.photo_poster_large).mo18693c(R.drawable.photo_poster_large).mo18697g(this.f15416v);
            this.f15417w.setText(movie.name);
            this.f15418x.setVisibility(movie.createTime != null ? 0 : 8);
            this.f15418x.setText(this.f15414t.getString(R.string.movie_create_date, new Object[]{movie.createTime}));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: N */
        public void mo17875N(Movie movie) {
            this.f15415u.mo18692b(C3052g.m20586g(movie.poster) ? movie.image : movie.poster).mo18695e(R.drawable.photo_poster_medium).mo18693c(R.drawable.photo_poster_medium).mo18697g(this.f15416v);
            this.f15417w.setText(movie.name);
            this.f15418x.setVisibility(movie.createTime != null ? 0 : 8);
            this.f15418x.setText(this.f15414t.getString(R.string.movie_create_date, new Object[]{movie.createTime}));
        }
    }

    /* renamed from: com.tv91.u.c.i.e0$c */
    /* compiled from: MoviesView */
    static final class C2740c extends MoviesView {
        public C2740c(LayoutMoviesBinding uVar, String str) {
            super(uVar, str, C2742e.LARGE, 5);
        }
    }

    /* renamed from: com.tv91.u.c.i.e0$d */
    /* compiled from: MoviesView */
    static final class C2741d extends MoviesView {
        public C2741d(LayoutMoviesBinding uVar, String str) {
            super(uVar, str, C2742e.NORMAL, 10);
        }
    }

    /* renamed from: com.tv91.u.c.i.e0$e */
    /* compiled from: MoviesView */
    enum C2742e {
        LARGE,
        NORMAL
    }

    MoviesView(LayoutMoviesBinding uVar, String str, C2742e eVar, int i) {
        super(uVar);
        this.f15409e = uVar;
        Toolbar gVar = new Toolbar(uVar.f14625e);
        this.f15410f = gVar;
        this.f15412h = i;
        gVar.mo16830r(!C3052g.m20586g(str));
        gVar.mo16829q(str);
        RecyclerView recyclerView = uVar.f14624d;
        C2738a aVar = new C2738a(eVar);
        this.f15411g = aVar;
        recyclerView.setAdapter(aVar);
        uVar.f14624d.setLayoutManager(eVar == C2742e.LARGE ? new LinearLayoutManager(this.f13974b) : new GridLayoutManager(this.f13974b, 2));
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        Recyclers.m17374d(this.f15409e.f14624d, bundle);
    }

    /* renamed from: T */
    public void mo17643T(List<Movie> list) {
        this.f15411g.mo16842x(list);
    }

    /* renamed from: a */
    public void mo17644a(boolean z) {
        this.f15409e.f14623c.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo17645b(Runnable runnable) {
        this.f15410f.mo16821i(runnable);
    }

    /* renamed from: c */
    public void mo17646c(Runnable runnable) {
        this.f15409e.f14624d.mo3254k(C2310i.REACH_BOTTOM.mo16855c(this.f15412h, runnable));
    }

    /* renamed from: e */
    public void mo17647e(Consumer<Movie> aVar) {
        this.f15411g.mo16838H(aVar);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15410f.mo16818b();
        Recyclers.m17376f(this.f15409e.f14624d, bundle);
        this.f15411g.mo16843z(false);
        this.f15411g.mo16838H(null);
        this.f15409e.f14624d.mo3313t();
    }
}
