package com.tv91.p213u.p214a.p218p;

import android.os.Bundle;
import android.widget.ListView;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.features.shared.widget.DrawableTextView;
import com.tv91.model.User;
import com.tv91.p210r.LayoutToolbarBottomBinding;
import com.tv91.p210r.ViewProfileBinding;
import com.tv91.p213u.p214a.BottomBarView;
import com.tv91.p213u.p214a.C2358k;
import com.tv91.p213u.p214a.Dashboard;
import com.tv91.p213u.p214a.ProfileScreen;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.Emojis;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.p.y */
final class ProfileView extends BottomBarView implements C2358k {

    /* renamed from: g */
    private final ViewProfileBinding f14879g;

    /* renamed from: h */
    private final Toolbar f14880h;

    /* renamed from: i */
    private final C2425u f14881i;

    ProfileView(ViewProfileBinding o0Var) {
        super(Dashboard.PROFILE, LayoutToolbarBottomBinding.m17824b(o0Var.f14521c));
        this.f14879g = o0Var;
        Toolbar gVar = new Toolbar(o0Var.f14535q);
        this.f14880h = gVar;
        C2425u uVar = new C2425u(this.f13974b);
        this.f14881i = uVar;
        gVar.mo16828p(R.string.profile_title);
        gVar.mo16819c(R.menu.menu_search);
        o0Var.f14526h.setAdapter(uVar);
    }

    /* renamed from: B */
    public void mo17150B(Consumer<ProfileScreen> aVar) {
        this.f14881i.mo17255d(aVar);
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f14880h.mo16817a();
    }

    /* renamed from: U */
    public void mo17151U(Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_title).mo16899m(R.string.profile_dialog_logout_description).mo16901o(R.string.dialog_button_no).mo16909w(R.string.dialog_button_yes, runnable).mo16912z();
    }

    /* renamed from: a */
    public void mo17152a(boolean z) {
        int i = 0;
        this.f14879g.f14527i.setVisibility(z ? 0 : 8);
        this.f14879g.f14525g.setVisibility(z ? 8 : 0);
        ListView listView = this.f14879g.f14526h;
        if (z) {
            i = 8;
        }
        listView.setVisibility(i);
    }

    /* renamed from: f2 */
    public void mo17153f2(Runnable runnable) {
        this.f14879g.f14528j.setOnClickListener(Clicks.m17391a(new C2423r(runnable)));
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h */
    public void mo17154h(Runnable runnable) {
        this.f14880h.mo16826n(runnable);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        super.mo16553h2(bundle);
        this.f14880h.mo16818b();
        this.f14879g.f14525g.setOnClickListener(null);
        this.f14879g.f14528j.setOnClickListener(null);
        this.f14881i.mo17255d(null);
    }

    /* renamed from: i */
    public void mo17155i(Runnable runnable) {
        this.f14880h.mo16823k(runnable);
    }

    /* renamed from: v0 */
    public void mo17156v0(Runnable runnable) {
        this.f14879g.f14525g.setOnClickListener(Clicks.m17391a(new C2424s(runnable)));
    }

    /* renamed from: y0 */
    public void mo17157y0(User user, List<ProfileScreen> list) {
        int i = 8;
        if (user == null) {
            this.f14879g.f14523e.setImageResource(R.drawable.ic_user);
            this.f14879g.f14530l.setText(null);
            this.f14879g.f14531m.setText(R.string.profile_anonymous_nickname);
            this.f14879g.f14532n.setText(R.string.profile_anonymous_nickname);
            this.f14879g.f14528j.setVisibility(8);
            this.f14879g.f14522d.setVisibility(8);
            this.f14879g.f14529k.setVisibility(8);
        } else {
            this.f14879g.f14523e.setImageResource(R.drawable.photo_man);
            this.f14879g.f14530l.setText(FragmentUtils.m20582c("(%s)", user.f14097id));
            this.f14879g.f14531m.setText(Emojis.m20560a(user.nickname));
            this.f14879g.f14532n.setText(mo16815o2(R.string.profile_point, Integer.valueOf(user.point)));
            DrawableTextView drawableTextView = this.f14879g.f14528j;
            if (user.point != 0) {
                i = 0;
            }
            drawableTextView.setVisibility(i);
            this.f14879g.f14522d.setVisibility(0);
            this.f14879g.f14529k.setVisibility(0);
            this.f14879g.f14529k.setText(user.account);
        }
        this.f14879g.f14533o.setText(FragmentUtils.m20582c("%s-%d", "3.3", Integer.valueOf(39)));
        this.f14881i.mo17256e(list);
    }
}
