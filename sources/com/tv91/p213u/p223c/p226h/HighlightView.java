package com.tv91.p213u.p223c.p226h;

import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.model.ExternalSource;
import com.tv91.model.Highlight.Advertise;
import com.tv91.model.Highlight.MovieGroup;
import com.tv91.model.Highlight.Ranking;
import com.tv91.model.Highlight.Recommend;
import com.tv91.model.Highlight.Web;
import com.tv91.model.Movie;
import com.tv91.p210r.AdapterHighlightGroupBinding;
import com.tv91.p210r.AdapterMoviesHighlightBinding;
import com.tv91.p210r.LayoutHighlightBinding;
import com.tv91.p213u.p223c.HighlightScreen;
import com.tv91.utils.C3052g;
import com.tv91.utils.Utils;
import java.util.List;
import p010b.p034g.p042j.Consumer;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;

/* renamed from: com.tv91.u.c.h.u */
final class HighlightView extends BasicView implements HighlightScreen {

    /* renamed from: e */
    private final LayoutHighlightBinding f15373e;

    /* renamed from: f */
    private Consumer<ExternalSource> f15374f = C2710j.f15355a;

    /* renamed from: g */
    private Consumer<MovieGroup> f15375g = C2708h.f15352a;

    /* renamed from: h */
    private Consumer<Movie> f15376h = C2716p.f15366a;

    /* renamed from: com.tv91.u.c.h.u$a */
    /* compiled from: HighlightView */
    static /* synthetic */ class C2720a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15377a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tv91.u.c.h.u$d[] r0 = com.tv91.p213u.p223c.p226h.HighlightView.C2723d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15377a = r0
                com.tv91.u.c.h.u$d r1 = com.tv91.p213u.p223c.p226h.HighlightView.C2723d.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15377a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.u.c.h.u$d r1 = com.tv91.p213u.p223c.p226h.HighlightView.C2723d.MONTH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15377a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.u.c.h.u$d r1 = com.tv91.p213u.p223c.p226h.HighlightView.C2723d.YEAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p223c.p226h.HighlightView.C2720a.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.u.c.h.u$b */
    /* compiled from: HighlightView */
    private static class C2721b extends RecyclerAdapter<Movie, C2722c> {

        /* renamed from: e */
        private final int f15378e;

        /* renamed from: f */
        private final C2723d f15379f;

        /* synthetic */ C2721b(List list, C2723d dVar, C2720a aVar) {
            this(list, dVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: M */
        public /* synthetic */ void mo17840N(C2722c cVar, View view) {
            Consumer<ITEM> aVar = this.f13984d;
            if (aVar != null) {
                aVar.mo4887a(this.f13983c.get(cVar.mo3369j() % this.f15378e));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2722c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2722c(AdapterMoviesHighlightBinding.m17730d(layoutInflater, viewGroup, false), this.f15378e, this.f15379f, null);
        }

        /* renamed from: O */
        public void mo3419m(C2722c cVar, int i) {
            super.mo3419m(cVar, i % this.f15378e);
        }

        /* renamed from: P */
        public C2722c mo3421o(ViewGroup viewGroup, int i) {
            C2722c L = mo16832A(LayoutInflater.from(viewGroup.getContext()), viewGroup, i);
            L.f2841b.setOnClickListener(Clicks.m17391a(new C2709i(this, L)));
            return L;
        }

        /* renamed from: c */
        public int mo3409c() {
            return Integer.MAX_VALUE;
        }

        private C2721b(List<Movie> list, C2723d dVar) {
            super(list);
            this.f15378e = list.size();
            this.f15379f = dVar;
        }
    }

    /* renamed from: com.tv91.u.c.h.u$c */
    /* compiled from: HighlightView */
    private static class C2722c extends ViewHolder<Movie> {

        /* renamed from: w */
        private final AdapterMoviesHighlightBinding f15380w;

        /* renamed from: x */
        private final int f15381x;

        /* synthetic */ C2722c(AdapterMoviesHighlightBinding iVar, int i, C2723d dVar, C2720a aVar) {
            this(iVar, i, dVar);
        }

        /* renamed from: U */
        private PaintDrawable m19267U(C2723d dVar) {
            int i;
            int i2 = C2720a.f15377a[dVar.ordinal()];
            if (i2 == 2) {
                i = Color.parseColor("#2E3152");
            } else if (i2 != 3) {
                i = mo16846O(R.color.color_accent);
            } else {
                i = Color.parseColor("#AE2323");
            }
            PaintDrawable paintDrawable = new PaintDrawable(i);
            int N = mo16845N(5);
            float f = (float) N;
            float N2 = (float) mo16845N(42);
            paintDrawable.setCornerRadii(new float[]{f, f, 0.0f, 0.0f, N2, N2, 0.0f, 0.0f});
            return paintDrawable;
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Movie movie) {
            this.f13991v.mo18692b(movie.image).mo18697g(this.f15380w.f14396b);
            this.f15380w.f14397c.setText(movie.name);
            int j = (mo3369j() % this.f15381x) + 1;
            if (j < 10) {
                this.f15380w.f14398d.setPaddingRelative(mo16847P(R.dimen.spacing_normal), mo16847P(R.dimen.spacing_x_small), 0, 0);
            } else {
                this.f15380w.f14398d.setPaddingRelative(mo16847P(R.dimen.spacing_small), mo16847P(R.dimen.spacing_x_small), 0, 0);
            }
            this.f15380w.f14398d.setText(C3052g.m20582c("%d", Integer.valueOf(j)));
        }

        private C2722c(AdapterMoviesHighlightBinding iVar, int i, C2723d dVar) {
            super(iVar);
            this.f15380w = iVar;
            this.f15381x = i;
            iVar.f14398d.setBackground(m19267U(dVar));
        }
    }

    /* renamed from: com.tv91.u.c.h.u$d */
    /* compiled from: HighlightView */
    private enum C2723d {
        TOP,
        MONTH,
        YEAR
    }

    HighlightView(LayoutHighlightBinding tVar) {
        super(tVar);
        this.f15373e = tVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo17833B2(Movie movie, View view) {
        this.f15376h.mo4887a(movie);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo17834D2(Movie movie, View view) {
        this.f15376h.mo4887a(movie);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo17835F2(ExternalSource externalSource, View view) {
        this.f15374f.mo4887a(externalSource);
    }

    /* renamed from: q2 */
    private int m19235q2(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, this.f13974b.getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo17836s2(int i) {
        this.f15373e.f14604f.scrollTo(0, i);
    }

    /* renamed from: t2 */
    static /* synthetic */ void m19237t2(ExternalSource externalSource) {
    }

    /* renamed from: u2 */
    static /* synthetic */ void m19238u2(MovieGroup movieGroup) {
    }

    /* renamed from: v2 */
    static /* synthetic */ void m19239v2(Movie movie) {
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo17837x2(ExternalSource externalSource, View view) {
        this.f15374f.mo4887a(externalSource);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo17838z2(MovieGroup movieGroup, View view) {
        this.f15375g.mo4887a(movieGroup);
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        int i = bundle.getInt("key-scroll-position");
        if (i > 0) {
            this.f15373e.mo5604a().postDelayed(new C2713m(this, i), 50);
        }
    }

    /* renamed from: N */
    public void mo17599N(MovieGroup movieGroup) {
        int i;
        AdapterHighlightGroupBinding d = AdapterHighlightGroupBinding.m17709d(LayoutInflater.from(this.f13974b), this.f15373e.f14600b, false);
        d.f14355e.setText(movieGroup.title);
        d.f14352b.setVisibility(movieGroup.hasMore ? 0 : 8);
        d.f14352b.setOnClickListener(Clicks.m17391a(new C2715o(this, movieGroup)));
        int q2 = m19235q2(87);
        int q22 = m19235q2(125);
        int size = movieGroup.movies.size();
        for (int i2 = 0; i2 < size; i2++) {
            ShapeableImageView shapeableImageView = new ShapeableImageView(this.f13974b);
            shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel().mo7896w((float) m19235q2(5)));
            shapeableImageView.setScaleType(ScaleType.CENTER_CROP);
            shapeableImageView.setImageDrawable(mo16814n2(R.drawable.photo_poster_small));
            LayoutParams layoutParams = new LayoutParams(q2, q22);
            if (i2 == size - 1) {
                i = 0;
            } else {
                i = mo16813m2(R.dimen.spacing_normal);
            }
            layoutParams.setMarginEnd(i);
            d.f14353c.addView(shapeableImageView, layoutParams);
            Movie movie = (Movie) movieGroup.movies.get(i2);
            shapeableImageView.setOnClickListener(Clicks.m17391a(new C2711k(this, movie)));
            this.f13975c.mo18692b(movie.image).mo18697g(shapeableImageView);
        }
        this.f15373e.f14600b.addView(d.mo5604a());
    }

    /* renamed from: S */
    public void mo17600S(Advertise advertise) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        for (ExternalSource externalSource : advertise.advertises) {
            ImageView imageView = new ImageView(this.f13974b);
            imageView.setAdjustViewBounds(true);
            imageView.setOnClickListener(Clicks.m17391a(new C2717q(this, externalSource)));
            this.f15373e.f14603e.addView(imageView, layoutParams);
            this.f13975c.mo18692b(externalSource.image).mo18694d(0, 0).mo18697g(imageView);
        }
    }

    /* renamed from: b2 */
    public void mo17601b2(Consumer<ExternalSource> aVar) {
        this.f15374f = aVar;
    }

    /* renamed from: e */
    public void mo17602e(Consumer<Movie> aVar) {
        this.f15376h = aVar;
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        bundle.putInt("key-scroll-position", this.f15373e.f14604f.getScrollY());
    }

    /* renamed from: i1 */
    public void mo17603i1(Ranking ranking, Ranking ranking2, Ranking ranking3) {
        C2721b bVar = new C2721b(ranking.movies, C2723d.TOP, null);
        bVar.mo16838H(this.f15376h);
        this.f15373e.f14606h.setAdapter(bVar);
        C2721b bVar2 = new C2721b(ranking2.movies, C2723d.MONTH, null);
        bVar2.mo16838H(this.f15376h);
        this.f15373e.f14605g.setAdapter(bVar2);
        C2721b bVar3 = new C2721b(ranking3.movies, C2723d.YEAR, null);
        bVar3.mo16838H(this.f15376h);
        this.f15373e.f14607i.setAdapter(bVar3);
    }

    /* renamed from: o0 */
    public void mo17604o0(Consumer<MovieGroup> aVar) {
        this.f15375g = aVar;
    }

    /* renamed from: r */
    public void mo17605r(Web web) {
        int i;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int size = web.sources.size();
        for (int i2 = 0; i2 < size; i2++) {
            ShapeableImageView shapeableImageView = new ShapeableImageView(this.f13974b);
            shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel().mo7896w((float) m19235q2(5)));
            shapeableImageView.setScaleType(ScaleType.CENTER_CROP);
            shapeableImageView.setImageDrawable(mo16814n2(R.drawable.photo_poster_medium));
            TextView textView = new TextView(this.f13974b);
            textView.setTextColor(mo16812l2(R.color.white));
            textView.setTextSize(2, 16.0f);
            textView.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(this.f13974b);
            frameLayout.addView(shapeableImageView, layoutParams);
            frameLayout.addView(textView, layoutParams);
            LayoutParams layoutParams2 = new LayoutParams(0, m19235q2(80));
            layoutParams2.weight = 1.0f;
            if (i2 == size - 1) {
                i = 0;
            } else {
                i = mo16813m2(R.dimen.spacing_normal);
            }
            layoutParams2.setMarginEnd(i);
            this.f15373e.f14602d.addView(frameLayout, layoutParams2);
            ExternalSource externalSource = (ExternalSource) web.sources.get(i2);
            frameLayout.setOnClickListener(Clicks.m17391a(new C2712l(this, externalSource)));
            this.f13975c.mo18692b(externalSource.image).mo18694d(0, 0).mo18697g(shapeableImageView);
            textView.setText(externalSource.title);
        }
    }

    /* renamed from: y */
    public void mo17606y(Recommend recommend) {
        this.f15373e.f14611m.setText(recommend.title);
        int f = (Utils.m20595f(this.f13974b) - (mo16813m2(R.dimen.spacing_normal) * 3)) / 2;
        double d = (double) f;
        Double.isNaN(d);
        int i = (int) ((d * 9.0d) / 16.0d);
        int size = recommend.movies.size();
        for (int i2 = 0; i2 < size; i2++) {
            ShapeableImageView shapeableImageView = new ShapeableImageView(this.f13974b);
            shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel().mo7896w((float) m19235q2(5)));
            shapeableImageView.setScaleType(ScaleType.CENTER);
            shapeableImageView.setImageDrawable(mo16814n2(R.drawable.photo_poster_medium));
            shapeableImageView.setLayoutParams(new LayoutParams(f, i));
            TextView textView = new TextView(this.f13974b);
            textView.setTextColor(mo16812l2(R.color.white));
            textView.setTextSize(2, 14.0f);
            textView.setEllipsize(TruncateAt.END);
            textView.setMaxLines(2);
            textView.setLayoutParams(new LayoutParams(f, -2));
            LinearLayout linearLayout = new LinearLayout(this.f13974b);
            linearLayout.setOrientation(1);
            linearLayout.addView(shapeableImageView);
            linearLayout.addView(textView);
            int columnCount = this.f15373e.f14601c.getColumnCount();
            MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
            marginLayoutParams.topMargin = i2 / columnCount == 0 ? 0 : mo16813m2(R.dimen.spacing_normal);
            marginLayoutParams.setMarginEnd(i2 % size == 0 ? 0 : mo16813m2(R.dimen.spacing_normal));
            this.f15373e.f14601c.addView(linearLayout, new GridLayout.LayoutParams(marginLayoutParams));
            Movie movie = (Movie) recommend.movies.get(i2);
            linearLayout.setOnClickListener(Clicks.m17391a(new C2714n(this, movie)));
            this.f13975c.mo18692b(movie.image).mo18697g(shapeableImageView);
            textView.setText(movie.name);
        }
    }
}
