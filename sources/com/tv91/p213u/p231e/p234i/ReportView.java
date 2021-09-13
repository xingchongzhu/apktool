package com.tv91.p213u.p231e.p234i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.p210r.AdapterPromotionDetailBinding;
import com.tv91.p210r.FragmentPromotionReportBinding;
import com.tv91.p213u.p231e.StatementScreen;
import com.tv91.p213u.p231e.p233h.PromotionDetailModel;
import com.tv91.p213u.p231e.p233h.PromotionReportModel;
import com.tv91.utils.Dates;
import java.util.List;

/* renamed from: com.tv91.u.e.i.s */
final class ReportView extends BasicView implements StatementScreen {

    /* renamed from: e */
    private final FragmentPromotionReportBinding f15642e;

    /* renamed from: com.tv91.u.e.i.s$b */
    /* compiled from: ReportView */
    private static class C2845b extends RecyclerAdapter<PromotionDetailModel, C2846c> {
        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2846c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2846c(AdapterPromotionDetailBinding.m17765d(layoutInflater, viewGroup, false));
        }

        private C2845b(List<PromotionDetailModel> list) {
            super(list);
        }
    }

    /* renamed from: com.tv91.u.e.i.s$c */
    /* compiled from: ReportView */
    private static class C2846c extends ViewHolder<PromotionDetailModel> {

        /* renamed from: w */
        private final AdapterPromotionDetailBinding f15643w;

        C2846c(AdapterPromotionDetailBinding nVar) {
            super(nVar);
            this.f15643w = nVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(PromotionDetailModel aVar) {
            this.f15643w.f14502b.setText(Dates.m20557b(aVar.f15609b, "yyyy/MM/dd"));
            this.f15643w.f14504d.setText(aVar.f15608a);
            this.f15643w.f14503c.setText(String.valueOf(aVar.f15610c));
        }
    }

    ReportView(FragmentPromotionReportBinding sVar) {
        super(sVar);
        this.f15642e = sVar;
    }

    /* renamed from: Q1 */
    public void mo18021Q1(Runnable runnable) {
        this.f15642e.f14581b.setOnClickListener(Clicks.m17391a(new C2839l(runnable)));
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15642e.f14581b.setOnClickListener(null);
    }

    /* renamed from: w1 */
    public void mo18022w1(PromotionReportModel bVar) {
        this.f15642e.f14583d.setAdapter(new C2845b(bVar.f15617g));
        this.f15642e.f14584e.setText(mo16815o2(R.string.promotion_report_text_bonus, Integer.valueOf(bVar.f15615e)));
        this.f15642e.f14581b.setText(mo16815o2(R.string.promotion_report_text_withdraw, Integer.valueOf(bVar.f15613c), Integer.valueOf(bVar.f15614d)));
        if (bVar.f15616f) {
            this.f15642e.f14581b.setEnabled(true);
            this.f15642e.f14581b.setTextColor(mo16812l2(R.color.light_orange));
            this.f15642e.f14581b.setBackgroundResource(R.drawable.bg_border_light_orange);
            return;
        }
        this.f15642e.f14581b.setEnabled(false);
        this.f15642e.f14581b.setTextColor(mo16812l2(R.color.light_orange_translucent_50));
        this.f15642e.f14581b.setBackgroundResource(R.drawable.bg_border_light_orange_disabled);
    }
}
