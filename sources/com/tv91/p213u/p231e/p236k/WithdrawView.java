package com.tv91.p213u.p231e.p236k;

import android.os.Bundle;
import android.view.View;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.p210r.ViewPromotionWithdrawBinding;
import com.tv91.p213u.p231e.C2799f;
import com.tv91.p213u.p231e.WithdrawScreen;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.e.k.r */
final class WithdrawView extends BasicView implements C2799f {

    /* renamed from: e */
    private final ViewPromotionWithdrawBinding f15711e;

    /* renamed from: f */
    private final Toolbar f15712f;

    WithdrawView(ViewPromotionWithdrawBinding s0Var) {
        super(s0Var);
        this.f15711e = s0Var;
        Toolbar gVar = new Toolbar(s0Var.f14598n);
        this.f15712f = gVar;
        gVar.mo16828p(R.string.promotion_withdraw_title);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo18178r2(Consumer aVar, View view) {
        WithdrawScreen eVar = new WithdrawScreen(this.f15711e.f14596l.getText(), this.f15711e.f14591g.getText(), this.f15711e.f14590f.getText(), this.f15711e.f14592h.getText(), this.f15711e.f14589e.getText(), this.f15711e.f14595k.getText(), this.f15711e.f14593i.getText());
        aVar.mo4887a(eVar);
    }

    /* renamed from: H0 */
    public void mo18026H0(Consumer<WithdrawScreen> aVar) {
        this.f15711e.f14586b.setOnClickListener(Clicks.m17391a(new C2868l(this, aVar)));
    }

    /* renamed from: R */
    public void mo18027R() {
        CustomDialog.m17423a(this.f13974b, mo16815o2(R.string.promotion_withdraw_error, new Object[0]));
    }

    /* renamed from: T1 */
    public void mo18028T1(String str, Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_title).mo16900n(str).mo16908v(R.string.dialog_button_confirm).mo16906t(runnable).mo16912z();
    }

    /* renamed from: a */
    public void mo18029a(boolean z) {
        this.f15711e.f14588d.setVisibility(z ? 0 : 8);
        this.f15711e.f14586b.setEnabled(!z);
    }

    /* renamed from: b */
    public void mo18030b(Runnable runnable) {
        this.f15712f.mo16821i(runnable);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15712f.mo16818b();
        this.f15711e.f14586b.setOnClickListener(null);
    }
}
