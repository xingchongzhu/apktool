package com.tv91.p213u.p214a;

import androidx.viewpager.widget.PagerAdapter;
import com.tv91.model.Channel;
import com.tv91.model.ExternalSource;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.g */
public interface ChannelScreen extends DashboardView {
    /* renamed from: K0 */
    void mo17143K0(PagerAdapter aVar, List<Channel> list);

    /* renamed from: P */
    void mo17144P(Consumer<ExternalSource> aVar);

    /* renamed from: W0 */
    void mo17145W0(List<ExternalSource> list);

    /* renamed from: h */
    void mo17146h(Runnable runnable);

    /* renamed from: i */
    void mo17147i(Runnable runnable);
}
