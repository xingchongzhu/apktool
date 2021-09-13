package com.tv91.p213u.p223c;

import android.os.Build.VERSION;
import com.tv91.model.Movie;
import com.tv91.p207q.p208a.C2341f;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.e */
public interface SearchScreen {

    /* renamed from: a */
    public static final int f15180a = (VERSION.SDK_INT < 21 ? 20 : 40);

    /* renamed from: com.tv91.u.c.e$a */
    /* compiled from: SearchScreen */
    public interface C2594a extends C2341f {
        /* renamed from: O */
        void mo17648O(List<Movie> list, boolean z);

        /* renamed from: Y1 */
        void mo17649Y1(Consumer<CharSequence> aVar);

        /* renamed from: a */
        void mo17650a(boolean z);

        /* renamed from: c */
        void mo17651c(Runnable runnable);

        /* renamed from: d */
        void mo17652d(Runnable runnable);

        /* renamed from: e */
        void mo17653e(Consumer<Movie> aVar);
    }
}
