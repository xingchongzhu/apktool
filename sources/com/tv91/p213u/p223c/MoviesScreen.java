package com.tv91.p213u.p223c;

import android.os.Build.VERSION;
import com.tv91.model.Movie;
import com.tv91.p207q.p208a.C2341f;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.d */
public interface MoviesScreen {

    /* renamed from: a */
    public static final int f15178a;

    /* renamed from: b */
    public static final int f15179b;

    /* renamed from: com.tv91.u.c.d$a */
    /* compiled from: MoviesScreen */
    public interface C2593a extends C2341f {
        /* renamed from: T */
        void mo17643T(List<Movie> list);

        /* renamed from: a */
        void mo17644a(boolean z);

        /* renamed from: b */
        void mo17645b(Runnable runnable);

        /* renamed from: c */
        void mo17646c(Runnable runnable);

        /* renamed from: e */
        void mo17647e(Consumer<Movie> aVar);
    }

    static {
        int i = VERSION.SDK_INT;
        f15178a = i < 21 ? 20 : 40;
        f15179b = i < 21 ? 15 : 30;
    }
}
