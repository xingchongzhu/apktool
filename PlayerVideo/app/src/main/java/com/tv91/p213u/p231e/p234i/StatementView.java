package com.tv91.p213u.p231e.p234i;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.PromotionReport;
import com.tv91.p210r.ViewPromotionStatementBinding;
import com.tv91.p213u.p231e.C2798d;
import java.util.List;

/* renamed from: com.tv91.u.e.i.t */
final class StatementView extends BasicView implements C2798d {

    /* renamed from: e */
    private final FragmentManager f15644e;

    /* renamed from: f */
    private final ViewPromotionStatementBinding f15645f;

    /* renamed from: g */
    private final Toolbar f15646g;

    StatementView(FragmentManager nVar, ViewPromotionStatementBinding r0Var) {
        super(r0Var);
        this.f15644e = nVar;
        this.f15645f = r0Var;
        Toolbar gVar = new Toolbar(r0Var.f14579g);
        this.f15646g = gVar;
        gVar.mo16828p(R.string.promotion_statement_title);
    }

    /* renamed from: T0 */
    public void mo18023T0(List<PromotionReport> list) {
        this.f15645f.f14575c.setAdapter(new PromotionPageAdapter(this.f15644e, list));
        ViewPromotionStatementBinding r0Var = this.f15645f;
        r0Var.f14577e.setupWithViewPager(r0Var.f14575c);
    }

    /* renamed from: a */
    public void mo18024a(boolean z) {
        this.f15645f.f14576d.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo18025b(Runnable runnable) {
        this.f15646g.mo16821i(runnable);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15646g.mo16818b();
    }
}
