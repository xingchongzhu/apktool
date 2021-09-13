package com.tv91.p213u.p214a.p217o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.chip.ninetyonetv.R;
import com.google.android.material.tabs.TabLayout.C2068d;
import com.google.android.material.tabs.TabLayout.C2073g;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.model.Channel;
import com.tv91.model.ExternalSource;
import com.tv91.p210r.LayoutToolbarBottomBinding;
import com.tv91.p210r.ViewChannelBinding;
import com.tv91.p213u.p214a.BottomBarView;
import com.tv91.p213u.p214a.ChannelScreen;
import com.tv91.p213u.p214a.Dashboard;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.o.o */
final class ChannelView extends BottomBarView implements ChannelScreen {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ViewChannelBinding f14832g;

    /* renamed from: h */
    private final Toolbar f14833h;

    /* renamed from: i */
    private Consumer<ExternalSource> f14834i = C2400j.f14822a;

    /* renamed from: com.tv91.u.a.o.o$b */
    /* compiled from: ChannelView */
    private class C2405b implements C2068d {

        /* renamed from: a */
        private final int f14835a;

        /* renamed from: b */
        private final int f14836b;

        /* renamed from: a */
        public void mo16118a(C2073g gVar) {
        }

        /* renamed from: b */
        public void mo16119b(C2073g gVar) {
            View e = gVar.mo16134e();
            if (e instanceof TextView) {
                ((TextView) e).setTextColor(this.f14836b);
            }
        }

        /* renamed from: c */
        public void mo16120c(C2073g gVar) {
            ChannelView.this.f14832g.f14329e.setCurrentItem(gVar.mo16136g());
            View e = gVar.mo16134e();
            if (e instanceof TextView) {
                ((TextView) e).setTextColor(this.f14835a);
            }
        }

        private C2405b() {
            this.f14835a = ChannelView.this.mo16812l2(R.color.light_orange);
            this.f14836b = ChannelView.this.mo16812l2(R.color.light_orange_translucent_70);
        }
    }

    ChannelView(ViewChannelBinding c0Var) {
        super(Dashboard.HOME, LayoutToolbarBottomBinding.m17824b(c0Var.f14327c));
        this.f14832g = c0Var;
        Toolbar gVar = new Toolbar(c0Var.f14331g);
        this.f14833h = gVar;
        gVar.mo16827o(R.drawable.ic_logo_small);
        gVar.mo16819c(R.menu.menu_search);
        c0Var.f14330f.setupWithViewPager(c0Var.f14329e);
        c0Var.f14330f.setTabMode(0);
        c0Var.f14329e.setOffscreenPageLimit(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo17232B2(ExternalSource externalSource, ImageView imageView) {
        this.f13975c.mo18692b(externalSource.image).mo18697g(imageView);
    }

    /* renamed from: w2 */
    private void m18054w2(List<Channel> list) {
        int tabCount = this.f14832g.f14330f.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            Channel channel = (Channel) list.get(i);
            if (channel.key == 0) {
                C2073g y = this.f14832g.f14330f.mo16114y(i);
                if (y != null) {
                    TextView textView = new TextView(this.f13974b);
                    textView.setTextColor(mo16812l2(R.color.light_orange_translucent_70));
                    textView.setText(channel.value);
                    textView.setGravity(17);
                    y.mo16144o(textView);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: x2 */
    static /* synthetic */ void m18055x2(ExternalSource externalSource) {
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo17233z2(ExternalSource externalSource, View view) {
        this.f14834i.mo4887a(externalSource);
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        int i = bundle.getInt("key-selected-page", 0);
        if (i > 0) {
            this.f14832g.f14329e.setCurrentItem(i);
        }
        this.f14833h.mo16817a();
        this.f14832g.f14330f.mo16066d(new C2405b());
    }

    /* renamed from: K0 */
    public void mo17143K0(PagerAdapter aVar, List<Channel> list) {
        this.f14832g.f14329e.setAdapter(aVar);
        m18054w2(list);
    }

    /* renamed from: P */
    public void mo17144P(Consumer<ExternalSource> aVar) {
        this.f14834i = aVar;
    }

    /* renamed from: W0 */
    public void mo17145W0(List<ExternalSource> list) {
        if (!list.isEmpty()) {
            ExternalSource externalSource = (ExternalSource) list.get(0);
            ImageView imageView = new ImageView(this.f13974b);
            imageView.setLayoutParams(new LayoutParams(-1, -2));
            imageView.setOnClickListener(Clicks.m17391a(new C2398h(this, externalSource)));
            new C2317a(this.f13974b).mo16898l(imageView).mo16908v(R.string.dialog_button_close).mo16907u(new C2399i(this, externalSource, imageView)).mo16912z();
        }
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h */
    public void mo17146h(Runnable runnable) {
        this.f14833h.mo16826n(runnable);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        super.mo16553h2(bundle);
        bundle.putInt("key-selected-page", this.f14832g.f14329e.getCurrentItem());
        this.f14833h.mo16818b();
        this.f14832g.f14330f.mo16082o();
    }

    /* renamed from: i */
    public void mo17147i(Runnable runnable) {
        this.f14833h.mo16823k(runnable);
    }
}
