package com.tv91.p213u.p214a;

import android.os.Build.VERSION;
import com.tv91.model.Actor;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.c */
public interface ActorScreen {

    /* renamed from: a */
    public static final int f14727a = (VERSION.SDK_INT < 21 ? 30 : 90);

    /* renamed from: com.tv91.u.a.c$a */
    /* compiled from: ActorScreen */
    public interface C2357a extends DashboardView {
        /* renamed from: a */
        void mo17127a(boolean z);

        /* renamed from: c */
        void mo17128c(Runnable runnable);

        /* renamed from: d0 */
        void mo17129d0(List<Actor> list);

        /* renamed from: h */
        void mo17130h(Runnable runnable);

        /* renamed from: p */
        void mo17131p(Consumer<Actor> aVar);
    }
}
