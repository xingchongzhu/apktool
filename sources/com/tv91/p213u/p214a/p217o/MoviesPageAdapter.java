package com.tv91.p213u.p214a.p217o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.tv91.model.Channel;
import com.tv91.p213u.p223c.p226h.HighlightFragment.C2718a;
import com.tv91.p213u.p223c.p227i.MoviesByChannelFragment.C2728a;
import java.util.List;

/* renamed from: com.tv91.u.a.o.q */
final class MoviesPageAdapter extends FragmentStatePagerAdapter {

    /* renamed from: j */
    private final List<Channel> f14842j;

    MoviesPageAdapter(FragmentManager nVar, List<Channel> list) {
        super(nVar, 1);
        this.f14842j = list;
    }

    /* renamed from: c */
    public int mo4064c() {
        return this.f14842j.size();
    }

    /* renamed from: e */
    public CharSequence mo4066e(int i) {
        return ((Channel) this.f14842j.get(i)).value;
    }

    /* renamed from: p */
    public Fragment mo2910p(int i) {
        Channel channel = (Channel) this.f14842j.get(i);
        if (channel.key == 200) {
            return new C2718a().mo18580l();
        }
        return new C2728a(channel).mo18580l();
    }

    /* renamed from: q */
    public List<Channel> mo17237q() {
        return this.f14842j;
    }
}
