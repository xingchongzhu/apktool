package com.tv91.p213u.p214a.p219q;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.Recyclers;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Promotion;
import com.tv91.p210r.AdapterPromotionBinding;
import com.tv91.p210r.LayoutToolbarBottomBinding;
import com.tv91.p210r.ViewPromotionBinding;
import com.tv91.p213u.p214a.BottomBarView;
import com.tv91.p213u.p214a.Dashboard;
import com.tv91.p213u.p214a.PromotionScreen;
import com.tv91.utils.Utils;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.q.k */
final class PromotionView extends BottomBarView implements PromotionScreen {

    /* renamed from: g */
    private final ViewPromotionBinding f14898g;

    /* renamed from: h */
    private final Toolbar f14899h;

    /* renamed from: i */
    private final C2440b f14900i;

    /* renamed from: com.tv91.u.a.q.k$b */
    /* compiled from: PromotionView */
    private static class C2440b extends RecyclerAdapter<Promotion, C2441c> {
        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2441c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2441c(AdapterPromotionBinding.m17758d(layoutInflater, viewGroup, false));
        }

        private C2440b() {
            if (VERSION.SDK_INT < 21) {
                mo3428v(true);
            }
        }
    }

    /* renamed from: com.tv91.u.a.q.k$c */
    /* compiled from: PromotionView */
    private static class C2441c extends ViewHolder<Promotion> {

        /* renamed from: w */
        private final AdapterPromotionBinding f14901w;

        /* renamed from: x */
        private final int f14902x;

        /* renamed from: y */
        private final int f14903y;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Promotion promotion) {
            this.f14901w.f14485c.setText(promotion.name);
            this.f13991v.mo18692b(promotion.image).mo18694d(this.f14902x, this.f14903y).mo18697g(this.f14901w.f14484b);
        }

        private C2441c(AdapterPromotionBinding mVar) {
            super(mVar);
            this.f14901w = mVar;
            int f = Utils.m20595f(this.f13990u);
            this.f14902x = f;
            double d = (double) f;
            Double.isNaN(d);
            int i = (int) (d * 0.5625d);
            this.f14903y = i;
            LayoutParams layoutParams = mVar.f14484b.getLayoutParams();
            layoutParams.height = i;
            mVar.f14484b.setLayoutParams(layoutParams);
        }
    }

    PromotionView(ViewPromotionBinding p0Var) {
        super(Dashboard.PROMOTION, LayoutToolbarBottomBinding.m17824b(p0Var.f14544c));
        this.f14898g = p0Var;
        Toolbar gVar = new Toolbar(p0Var.f14549h);
        this.f14899h = gVar;
        C2440b bVar = new C2440b();
        this.f14900i = bVar;
        gVar.mo16828p(R.string.promotion_title);
        gVar.mo16819c(R.menu.menu_search);
        p0Var.f14546e.setAdapter(bVar);
    }

    /* renamed from: D1 */
    public void mo17158D1(Consumer<Promotion> aVar) {
        this.f14900i.mo16838H(aVar);
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f14899h.mo16817a();
        Recyclers.m17374d(this.f14898g.f14546e, bundle);
    }

    /* renamed from: P1 */
    public void mo17159P1(List<Promotion> list) {
        this.f14898g.f14547f.setVisibility(list.isEmpty() ? 0 : 8);
        if (!list.isEmpty()) {
            this.f14900i.mo16842x(list);
        }
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h */
    public void mo17160h(Runnable runnable) {
        this.f14899h.mo16826n(runnable);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        super.mo16553h2(bundle);
        this.f14899h.mo16818b();
        Recyclers.m17376f(this.f14898g.f14546e, bundle);
        this.f14900i.mo16843z(false);
        this.f14900i.mo16838H(null);
    }

    /* renamed from: i */
    public void mo17161i(Runnable runnable) {
        this.f14899h.mo16823k(runnable);
    }
}
