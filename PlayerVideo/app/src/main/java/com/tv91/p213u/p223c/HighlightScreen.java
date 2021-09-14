package com.tv91.p213u.p223c;

import com.tv91.model.ExternalSource;
import com.tv91.model.Highlight.Advertise;
import com.tv91.model.Highlight.MovieGroup;
import com.tv91.model.Highlight.Ranking;
import com.tv91.model.Highlight.Recommend;
import com.tv91.model.Highlight.Web;
import com.tv91.model.Movie;
import com.tv91.p207q.p208a.C2341f;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.b */
public interface HighlightScreen extends C2341f {
    /* renamed from: N */
    void mo17599N(MovieGroup movieGroup);

    /* renamed from: S */
    void mo17600S(Advertise advertise);

    /* renamed from: b2 */
    void mo17601b2(Consumer<ExternalSource> aVar);

    /* renamed from: e */
    void mo17602e(Consumer<Movie> aVar);

    /* renamed from: i1 */
    void mo17603i1(Ranking ranking, Ranking ranking2, Ranking ranking3);

    /* renamed from: o0 */
    void mo17604o0(Consumer<MovieGroup> aVar);

    /* renamed from: r */
    void mo17605r(Web web);

    /* renamed from: y */
    void mo17606y(Recommend recommend);
}
