package com.tv91.p213u.p223c.p224f;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.Button;
import android.widget.Toast;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.features.shared.widget.NoScrollGridLayoutManager;
import com.tv91.model.Actor;
import com.tv91.model.Category;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.model.Movie;
import com.tv91.p210r.AdapterActorBinding;
import com.tv91.p210r.AdapterMoviesBinding;
import com.tv91.p210r.ViewMovieBinding;
import com.tv91.p213u.p223c.MovieScreen;
import com.tv91.utils.FragmentUtils;
import java.util.Collections;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.f.b2 */
final class MovieView extends BasicView implements MovieScreen {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ViewMovieBinding f15187e;

    /* renamed from: f */
    private final Toolbar f15188f;

    /* renamed from: g */
    private final C2602b f15189g;

    /* renamed from: h */
    private final C2604d f15190h;

    /* renamed from: i */
    private final Actor f15191i = new Actor(-1, 0, mo16815o2(R.string.actor_anonymous, new Object[0]), null);

    /* renamed from: j */
    private C2606f f15192j;

    /* renamed from: k */
    private Runnable f15193k = C2633k1.f15233a;

    /* renamed from: l */
    private Runnable f15194l = C2642n1.f15243a;

    /* renamed from: m */
    private Runnable f15195m = C2639m1.f15240a;

    /* renamed from: n */
    private Runnable f15196n = C2660t1.f15261a;

    /* renamed from: o */
    private Runnable f15197o = C2636l1.f15237a;

    /* renamed from: p */
    private Runnable f15198p = C2666v1.f15267a;

    /* renamed from: q */
    private Runnable f15199q = C2654r1.f15255a;

    /* renamed from: com.tv91.u.c.f.b2$a */
    /* compiled from: MovieView */
    static /* synthetic */ class C2601a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15200a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tv91.model.a$a[] r0 = com.tv91.model.DownloadRecord.C2335a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15200a = r0
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15200a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.PAUSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15200a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.DONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15200a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.MOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15200a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.MISSING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p223c.p224f.MovieView.C2601a.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.u.c.f.b2$b */
    /* compiled from: MovieView */
    private static class C2602b extends RecyclerAdapter<Actor, C2603c> {
        private C2602b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2603c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2603c(AdapterActorBinding.m17674d(layoutInflater, viewGroup, false), null);
        }

        /* renamed from: x */
        public void mo16842x(List<Actor> list) {
            if (list.size() >= 10) {
                super.mo16842x(list.subList(0, 9));
            } else {
                super.mo16842x(list);
            }
        }

        /* synthetic */ C2602b(C2601a aVar) {
            this();
        }
    }

    /* renamed from: com.tv91.u.c.f.b2$c */
    /* compiled from: MovieView */
    private static class C2603c extends ViewHolder<Actor> {

        /* renamed from: w */
        private final AdapterActorBinding f15201w;

        /* synthetic */ C2603c(AdapterActorBinding aVar, C2601a aVar2) {
            this(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Actor actor) {
            this.f13991v.mo18692b(actor.avatar).mo18695e(R.drawable.photo_woman).mo18693c(R.drawable.photo_woman).mo18697g(this.f15201w.f14284b);
            LayoutParams layoutParams = this.f15201w.f14286d.getLayoutParams();
            layoutParams.width = this.f15201w.f14284b.getLayoutParams().width;
            this.f15201w.f14286d.setText(actor.name);
            this.f15201w.f14286d.setEllipsize(TruncateAt.END);
            this.f15201w.f14286d.setMaxLines(1);
            this.f15201w.f14286d.setLayoutParams(layoutParams);
            this.f15201w.f14286d.setGravity(1);
            this.f15201w.f14285c.setVisibility(8);
        }

        private C2603c(AdapterActorBinding aVar) {
            super(aVar);
            this.f15201w = aVar;
        }
    }

    /* renamed from: com.tv91.u.c.f.b2$d */
    /* compiled from: MovieView */
    private static class C2604d extends RecyclerAdapter<Movie, C2605e> {
        private C2604d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2605e mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2605e(AdapterMoviesBinding.m17716d(layoutInflater, viewGroup, false), null);
        }

        /* synthetic */ C2604d(C2601a aVar) {
            this();
        }
    }

    /* renamed from: com.tv91.u.c.f.b2$e */
    /* compiled from: MovieView */
    private static class C2605e extends ViewHolder<Movie> {

        /* renamed from: w */
        private final AdapterMoviesBinding f15202w;

        /* synthetic */ C2605e(AdapterMoviesBinding gVar, C2601a aVar) {
            this(gVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Movie movie) {
            this.f13991v.mo18692b(FragmentUtils.m20586g(movie.poster) ? movie.image : movie.poster).mo18695e(R.drawable.photo_poster_medium).mo18693c(R.drawable.photo_poster_medium).mo18697g(this.f15202w.f14366b);
            this.f15202w.f14368d.setText(movie.name);
            this.f15202w.f14367c.setText(mo16849R(R.string.movie_create_date, movie.createTime));
        }

        private C2605e(AdapterMoviesBinding gVar) {
            super(gVar);
            this.f15202w = gVar;
        }
    }

    /* renamed from: com.tv91.u.c.f.b2$f */
    /* compiled from: MovieView */
    private class C2606f implements OnScrollChangedListener {

        /* renamed from: a */
        private final Runnable f15203a;

        /* synthetic */ C2606f(MovieView b2Var, Runnable runnable, C2601a aVar) {
            this(runnable);
        }

        public void onScrollChanged() {
            Rect rect = new Rect();
            MovieView.this.f15187e.f14461q.getHitRect(rect);
            if (MovieView.this.f15187e.f14441B.getLocalVisibleRect(rect)) {
                MovieView.this.f15187e.f14461q.getViewTreeObserver().removeOnScrollChangedListener(this);
                this.f15203a.run();
            }
        }

        private C2606f(Runnable runnable) {
            this.f15203a = runnable;
        }
    }

    MovieView(ViewMovieBinding k0Var) {
        super(k0Var);
        this.f15187e = k0Var;
        this.f15188f = new Toolbar(k0Var.f14443D);
        C2602b bVar = new C2602b(null);
        this.f15189g = bVar;
        C2604d dVar = new C2604d(null);
        this.f15190h = dVar;
        k0Var.f14450f.setAdapter(bVar);
        k0Var.f14450f.setLayoutManager(new NoScrollGridLayoutManager(this.f13974b, 3));
        k0Var.f14451g.setAdapter(dVar);
        k0Var.f14451g.setLayoutManager(new NoScrollGridLayoutManager(this.f13974b, 2));
    }

    /* renamed from: r2 */
    static /* synthetic */ void m18874r2() {
    }

    /* renamed from: s2 */
    static /* synthetic */ void m18875s2() {
    }

    /* renamed from: t2 */
    static /* synthetic */ void m18876t2() {
    }

    /* renamed from: u2 */
    static /* synthetic */ void m18877u2() {
    }

    /* renamed from: v2 */
    static /* synthetic */ void m18878v2() {
    }

    /* renamed from: w2 */
    static /* synthetic */ void m18879w2() {
    }

    /* renamed from: x2 */
    static /* synthetic */ void m18880x2() {
    }

    /* renamed from: C */
    public void mo17607C(Runnable runnable) {
        this.f15187e.f14449e.setOnClickListener(Clicks.m17391a(new C2648p1(runnable)));
    }

    /* renamed from: C0 */
    public void mo17608C0(String str) {
        new C2317a(this.f13974b).mo16900n(str).mo16909w(R.string.dialog_button_purchase, this.f15194l).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: E */
    public void mo17609E(Runnable runnable) {
        this.f15197o = runnable;
    }

    /* renamed from: E0 */
    public void mo17610E0(Runnable runnable) {
        this.f15187e.f14448d.setOnClickListener(Clicks.m17391a(new C2657s1(runnable)));
    }

    /* renamed from: F1 */
    public void mo17611F1(Runnable runnable) {
        this.f15193k = runnable;
    }

    /* renamed from: J0 */
    public void mo17612J0(DownloadRecord aVar, int i) {
        Button button = this.f15187e.f14447c;
        if (aVar != null) {
            C2335a aVar2 = aVar.f14104f;
            if (!(aVar2 == C2335a.DELETED || aVar2 == C2335a.EXPIRED)) {
                button.setTextColor(mo16812l2(R.color.white));
                button.setBackground(mo16814n2(R.drawable.bg_solid_light_orange));
                int i2 = C2601a.f15200a[aVar.f14104f.ordinal()];
                if (i2 == 1) {
                    button.setText(mo16815o2(R.string.movie_button_downloading, Integer.valueOf(i)));
                } else if (i2 == 2) {
                    button.setText(R.string.movie_button_download_pause);
                } else if (i2 == 3 || i2 == 4) {
                    button.setText(R.string.movie_button_download_done);
                } else if (i2 == 5) {
                    button.setText(R.string.movie_button_download_missing);
                }
                return;
            }
        }
        button.setText(R.string.movie_button_download);
        button.setTextColor(mo16812l2(R.color.light_orange));
        button.setBackground(mo16814n2(R.drawable.bg_border_light_orange));
    }

    /* renamed from: J1 */
    public void mo17613J1(Runnable runnable) {
        this.f15194l = runnable;
    }

    /* renamed from: L1 */
    public void mo17614L1() {
        Toast.makeText(this.f13974b, R.string.favorite_remove_success, 0).show();
    }

    /* renamed from: M */
    public void mo17615M(Movie movie) {
        String str;
        this.f13975c.mo18692b(movie.poster).mo18697g(this.f15187e.f14455k);
        this.f15187e.f14469y.setText(mo16815o2(R.string.movie_id, Integer.valueOf(movie.f14083id)));
        this.f15187e.f14440A.setVisibility(0);
        int i = movie.point;
        if (i == 0) {
            str = mo16815o2(R.string.movie_point_free, new Object[0]);
        } else {
            str = mo16815o2(R.string.movie_point, Integer.valueOf(i));
        }
        this.f15187e.f14440A.setText(str);
        this.f15187e.f14442C.setText(mo16815o2(R.string.movie_play_count, FragmentUtils.m20583d(Integer.valueOf(movie.playCount))));
        this.f15187e.f14463s.setVisibility(8);
        this.f15187e.f14470z.setText(movie.name);
        this.f15187e.f14466v.setVisibility(8);
        this.f15187e.f14467w.setVisibility(8);
        this.f15187e.f14465u.setVisibility(8);
        this.f15187e.f14441B.setText(R.string.movie_similar_movies_empty);
        this.f15187e.f14449e.setVisibility(8);
        this.f15187e.f14448d.setVisibility(8);
        this.f15187e.f14447c.setVisibility(8);
        this.f15189g.mo16842x(Collections.singletonList(this.f15191i));
    }

    /* renamed from: M1 */
    public void mo17616M1(Runnable runnable) {
        this.f15198p = runnable;
    }

    /* renamed from: N1 */
    public void mo17617N1(List<Movie> list) {
        this.f15190h.mo16840J(list);
    }

    /* renamed from: O1 */
    public void mo17618O1() {
        Toast.makeText(this.f13974b, R.string.movie_add_to_favorite, 0).show();
    }

    /* renamed from: Z */
    public void mo17619Z(Runnable runnable) {
        this.f15196n = runnable;
    }

    /* renamed from: Z0 */
    public void mo17620Z0(Runnable runnable) {
        this.f15195m = runnable;
    }

    /* renamed from: a1 */
    public void mo17621a1(Runnable runnable) {
        this.f15187e.f14454j.setOnClickListener(Clicks.m17391a(new C2645o1(runnable)));
    }

    /* renamed from: b */
    public void mo17622b(Runnable runnable) {
        this.f15188f.mo16821i(runnable);
    }

    /* renamed from: c */
    public void mo17623c(Runnable runnable) {
        this.f15192j = new C2606f(this, runnable, null);
        this.f15187e.f14461q.getViewTreeObserver().addOnScrollChangedListener(this.f15192j);
    }

    /* renamed from: c0 */
    public void mo17624c0(long j) {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_error_title).mo16900n(mo16815o2(R.string.E_disk_space_not_enough, Formatter.formatFileSize(this.f13974b, j), Formatter.formatFileSize(this.f13974b, j + 209715200))).mo16903q(R.string.dialog_button_close).mo16912z();
    }

    /* renamed from: d2 */
    public void mo17625d2(boolean z) {
        this.f15187e.f14459o.setVisibility(z ? 0 : 8);
    }

    /* renamed from: e */
    public void mo17626e(Consumer<Movie> aVar) {
        this.f15190h.mo16838H(aVar);
    }

    /* renamed from: f0 */
    public void mo17627f0() {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_title).mo16899m(R.string.E_no_wifi_download_warning).mo16909w(R.string.dialog_button_yes, this.f15193k).mo16901o(R.string.dialog_button_no).mo16912z();
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: g1 */
    public void mo17628g1(Runnable runnable) {
        this.f15187e.f14446b.setOnClickListener(Clicks.m17391a(new C2651q1(runnable)));
    }

    /* renamed from: h1 */
    public void mo17629h1(int i, long j) {
        new C2317a(this.f13974b).mo16900n(mo16815o2(R.string.movie_dialog_purchase_download_message, Integer.valueOf(i), Formatter.formatFileSize(this.f13974b, j))).mo16909w(R.string.dialog_button_purchase, this.f15198p).mo16904r(R.string.dialog_button_download_statement, this.f15197o).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15188f.mo16818b();
        this.f15187e.f14461q.getViewTreeObserver().removeOnScrollChangedListener(this.f15192j);
        this.f15187e.f14454j.setOnClickListener(null);
        this.f15187e.f14448d.setOnClickListener(null);
        this.f15187e.f14447c.setOnClickListener(null);
        this.f15187e.f14446b.setOnClickListener(null);
        this.f15189g.mo16838H(null);
        this.f15190h.mo16838H(null);
    }

    /* renamed from: i0 */
    public void mo17630i0(boolean z) {
        this.f15187e.f14460p.setVisibility(z ? 0 : 8);
    }

    /* renamed from: m */
    public void mo17631m(Runnable runnable) {
        this.f15187e.f14447c.setOnClickListener(Clicks.m17391a(new C2663u1(runnable)));
    }

    /* renamed from: m0 */
    public void mo17632m0() {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_error_title).mo16899m(R.string.E_download_corrupt).mo16909w(R.string.dialog_button_remove_and_download, this.f15195m).mo16904r(R.string.dialog_button_remove, this.f15196n).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: o1 */
    public void mo17633o1(String str, Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.favorite_dialog_remove_title).mo16900n(mo16815o2(R.string.favorite_dialog_remove_message, str)).mo16909w(R.string.dialog_button_remove, runnable).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: p */
    public void mo17634p(Consumer<Actor> aVar) {
        this.f15189g.mo16838H(aVar);
    }

    /* renamed from: q0 */
    public void mo17635q0(DownloadRecord aVar, int i) {
        if (aVar == null) {
            this.f15187e.f14458n.setVisibility(8);
            this.f15187e.f14446b.setVisibility(8);
            return;
        }
        this.f15187e.f14458n.setVisibility(0);
        this.f15187e.f14458n.setProgress(i);
        this.f15187e.f14446b.setVisibility(0);
        this.f15187e.f14468x.setText(aVar.f14101c.name);
        int i2 = C2601a.f15200a[aVar.f14104f.ordinal()];
        if (i2 == 1) {
            this.f15187e.f14462r.setText(R.string.movie_downloadbar_downloading);
        } else if (i2 == 2) {
            this.f15187e.f14462r.setText(R.string.movie_downloadbar_pause);
        } else if (i2 == 3) {
            this.f15187e.f14462r.setText(R.string.movie_downloadbar_done);
        }
    }

    /* renamed from: q1 */
    public void mo17636q1() {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_error_title).mo16899m(R.string.E_download_expired).mo16909w(R.string.dialog_button_purchase, this.f15198p).mo16903q(R.string.dialog_button_close).mo16902p(R.string.movie_dialog_download_remove, this.f15196n).mo16912z();
    }

    /* renamed from: r1 */
    public void mo17637r1(String str) {
        new C2317a(this.f13974b).mo16910x(R.string.purchase_dialog_failure_title).mo16900n(str).mo16909w(R.string.dialog_button_deposit, this.f15199q).mo16912z();
    }

    /* renamed from: s1 */
    public void mo17638s1(String str) {
        new C2317a(this.f13974b).mo16900n(str).mo16903q(R.string.dialog_button_close).mo16912z();
    }

    /* renamed from: u */
    public void mo17639u(Movie movie) {
        this.f13975c.mo18692b(movie.poster).mo18697g(this.f15187e.f14455k);
        this.f15187e.f14469y.setText(mo16815o2(R.string.movie_id, Integer.valueOf(movie.f14083id)));
        this.f15187e.f14440A.setVisibility(8);
        this.f15187e.f14442C.setText(mo16815o2(R.string.movie_play_count, FragmentUtils.m20583d(Integer.valueOf(movie.playCount))));
        this.f15187e.f14463s.setText(FragmentUtils.m20583d(Integer.valueOf(movie.favoriteCount)));
        this.f15187e.f14470z.setText(movie.name);
        this.f15187e.f14466v.setText(mo16815o2(R.string.movie_channel, movie.channel.value));
        this.f15187e.f14467w.setText(mo16815o2(R.string.movie_create_date, movie.createTime));
        if (!movie.categories.isEmpty()) {
            StringBuilder sb = new StringBuilder(((Category) movie.categories.get(0)).value);
            int size = movie.categories.size();
            for (int i = 1; i < size; i++) {
                sb.append(", ");
                sb.append(((Category) movie.categories.get(i)).value);
            }
            this.f15187e.f14465u.setText(mo16815o2(R.string.movie_category, sb.toString()));
            this.f15187e.f14441B.setText(R.string.movie_similar_movies);
            this.f15187e.f14449e.setVisibility(0);
        } else {
            this.f15187e.f14465u.setText(mo16815o2(R.string.movie_category, ""));
            this.f15187e.f14441B.setText(R.string.movie_similar_movies_empty);
            this.f15187e.f14449e.setVisibility(8);
        }
        mo17640y1(movie.favorite);
        if (movie.fileSize <= 0 || movie.download < 0) {
            this.f15187e.f14447c.setVisibility(8);
        }
        if (movie.actors.isEmpty()) {
            this.f15189g.mo16842x(Collections.singletonList(this.f15191i));
        }
        this.f15189g.mo16842x(movie.actors);
    }

    /* renamed from: y1 */
    public void mo17640y1(boolean z) {
        if (z) {
            this.f15187e.f14448d.setText(R.string.movie_button_favorite_cancel);
            this.f15187e.f14448d.setTextColor(mo16812l2(R.color.white));
            this.f15187e.f14448d.setBackground(mo16814n2(R.drawable.bg_solid_accent));
            return;
        }
        this.f15187e.f14448d.setText(R.string.movie_button_favorite);
        this.f15187e.f14448d.setTextColor(mo16812l2(R.color.color_accent));
        this.f15187e.f14448d.setBackground(mo16814n2(R.drawable.bg_border_accent));
    }

    /* renamed from: z */
    public void mo17641z(int i) {
        new C2317a(this.f13974b).mo16900n(mo16815o2(R.string.movie_dialog_already_download_message, Integer.valueOf(i))).mo16909w(R.string.dialog_button_purchase, this.f15198p).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: z1 */
    public void mo17642z1(Runnable runnable) {
        this.f15199q = runnable;
    }
}
