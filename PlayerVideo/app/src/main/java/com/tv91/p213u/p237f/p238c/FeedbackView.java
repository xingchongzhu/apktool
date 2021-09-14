package com.tv91.p213u.p237f.p238c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C0420n;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.Recyclers;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.C2310i;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Feedback;
import com.tv91.p210r.AdapterFeedbackBinding;
import com.tv91.p210r.ViewFeedbackBinding;
import com.tv91.p213u.p237f.FeedbackScreen;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.Dates;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.f.c.t */
final class FeedbackView extends BasicView implements FeedbackScreen {

    /* renamed from: e */
    private final ViewFeedbackBinding f15740e;

    /* renamed from: f */
    private final Toolbar f15741f;

    /* renamed from: g */
    private final C2892b f15742g;

    /* renamed from: com.tv91.u.f.c.t$b */
    /* compiled from: FeedbackView */
    private static class C2892b extends RecyclerAdapter<Feedback, C2893c> {
        private C2892b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2893c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2893c(AdapterFeedbackBinding.m17695d(layoutInflater, viewGroup, false));
        }
    }

    /* renamed from: com.tv91.u.f.c.t$c */
    /* compiled from: FeedbackView */
    private static class C2893c extends ViewHolder<Feedback> {

        /* renamed from: w */
        private final AdapterFeedbackBinding f15743w;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Feedback feedback) {
            int indexOf = feedback.content.indexOf(":\n");
            if (indexOf > 0) {
                String substring = feedback.content.substring(indexOf + 2);
                String str = "\n";
                if (substring.contains(str)) {
                    substring = substring.replace(str, "");
                }
                this.f15743w.f14336d.setText(substring);
            } else {
                this.f15743w.f14336d.setText(feedback.content);
            }
            this.f15743w.f14337e.setText(Dates.m20557b(feedback.date, "yyyy/MM/dd"));
            this.f15743w.f14334b.setChecked(!FragmentUtils.m20586g(feedback.replyContent));
        }

        private C2893c(AdapterFeedbackBinding dVar) {
            super(dVar);
            this.f15743w = dVar;
        }
    }

    FeedbackView(ViewFeedbackBinding f0Var) {
        super(f0Var);
        this.f15740e = f0Var;
        Toolbar gVar = new Toolbar(f0Var.f14363h);
        this.f15741f = gVar;
        C2892b bVar = new C2892b();
        this.f15742g = bVar;
        gVar.mo16828p(R.string.customer_service_title);
        gVar.mo16819c(R.menu.menu_add);
        f0Var.f14360e.setAdapter(bVar);
        f0Var.f14360e.setLayoutManager(new LinearLayoutManager(this.f13974b));
        f0Var.f14360e.mo3244h(m19920q2());
    }

    /* renamed from: q2 */
    private C0420n m19920q2() {
        DividerItemDecoration dVar = new DividerItemDecoration(this.f13974b, 1);
        dVar.mo3817l(mo16814n2(R.drawable.widget_divider_inset));
        return dVar;
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f15741f.mo16817a();
        Recyclers.m17374d(this.f15740e.f14360e, bundle);
    }

    /* renamed from: V */
    public void mo18179V(Runnable runnable) {
        this.f15740e.f14362g.setOnClickListener(Clicks.m17391a(new C2884m(runnable)));
    }

    /* renamed from: a */
    public void mo18180a(boolean z) {
        this.f15740e.f14359d.setVisibility(z ? 0 : 8);
        if (z && this.f15742g.mo16835D()) {
            this.f15740e.f14358c.setVisibility(8);
            this.f15740e.f14361f.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo18181b(Runnable runnable) {
        this.f15741f.mo16821i(runnable);
    }

    /* renamed from: c */
    public void mo18182c(Runnable runnable) {
        this.f15740e.f14360e.mo3254k(C2310i.REACH_BOTTOM.mo16856d(runnable));
    }

    /* renamed from: d1 */
    public void mo18183d1(boolean z) {
        this.f15740e.f14362g.setVisibility(z ? 0 : 8);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15741f.mo16818b();
        Recyclers.m17376f(this.f15740e.f14360e, bundle);
        this.f15742g.mo16843z(false);
        this.f15742g.mo16838H(null);
        this.f15740e.f14360e.mo3313t();
        this.f15740e.f14362g.setOnClickListener(null);
    }

    /* renamed from: k0 */
    public void mo18184k0(List<Feedback> list) {
        if (list.isEmpty()) {
            this.f15740e.f14361f.setVisibility(0);
            return;
        }
        this.f15740e.f14358c.setVisibility(0);
        this.f15742g.mo16842x(list);
    }

    /* renamed from: t0 */
    public void mo18185t0(Consumer<Feedback> aVar) {
        this.f15742g.mo16838H(aVar);
    }

    /* renamed from: w0 */
    public void mo18186w0(Runnable runnable) {
        this.f15741f.mo16820h(runnable);
    }
}
