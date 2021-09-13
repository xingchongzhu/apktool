package com.tv91.features.authentication.p204r;

import android.os.Bundle;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.C2152l;
import com.tv91.features.authentication.VerifyScreen;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.p206i.Editors;
import com.tv91.p210r.ViewVerifyBinding;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.r.z */
final class VerifyView extends BasicView implements C2152l {

    /* renamed from: e */
    private final ViewVerifyBinding f13891e;

    /* renamed from: f */
    private final Toolbar f13892f;

    VerifyView(ViewVerifyBinding x0Var) {
        super(x0Var);
        this.f13891e = x0Var;
        Toolbar gVar = new Toolbar(x0Var.f14683j);
        this.f13892f = gVar;
        gVar.mo16828p(R.string.mobile_verify_title);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo16793r2(Consumer aVar) {
        aVar.mo4887a(this.f13891e.f14681h.getText());
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo16794v2(Consumer aVar) {
        aVar.mo4887a(new VerifyScreen(this.f13891e.f14681h.getText(), this.f13891e.f14678e.getText()));
    }

    /* renamed from: b */
    public void mo16520b(Runnable runnable) {
        this.f13892f.mo16821i(runnable);
    }

    /* renamed from: b1 */
    public void mo16521b1(Consumer<VerifyScreen> aVar) {
        C2280r rVar = new C2280r(this, aVar);
        this.f13891e.f14678e.setOnEditorActionListener(Editors.m17393a(new C2281s(rVar)));
        this.f13891e.f14675b.setOnClickListener(Clicks.m17391a(new C2277o(rVar)));
    }

    /* renamed from: f */
    public void mo16522f(Consumer<CharSequence> aVar) {
        C2278p pVar = new C2278p(this, aVar);
        this.f13891e.f14681h.setOnEditorActionListener(Editors.m17395c(new C2282t(pVar)));
        this.f13891e.f14682i.setOnClickListener(Clicks.m17391a(new C2279q(pVar)));
    }

    /* renamed from: g */
    public void mo16523g(String str) {
        mo16552g0(str);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        this.f13891e.f14680g.setText(str);
        this.f13891e.f14682i.setClickable(true);
        this.f13891e.f14675b.setEnabled(true);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f13892f.mo16818b();
        this.f13891e.f14681h.setOnEditorActionListener(null);
        this.f13891e.f14682i.setOnClickListener(null);
        this.f13891e.f14678e.setOnEditorActionListener(null);
        this.f13891e.f14675b.setOnClickListener(null);
    }

    /* renamed from: j */
    public void mo16524j() {
        this.f13891e.f14680g.setText(null);
        this.f13891e.f14682i.setClickable(false);
        this.f13891e.f14675b.setEnabled(false);
    }

    /* renamed from: k */
    public void mo16525k(String str) {
        this.f13891e.f14680g.setText(str);
    }

    /* renamed from: l */
    public void mo16526l() {
        this.f13891e.f14680g.setText(R.string.mobile_verify_text_sms_sent);
        this.f13891e.f14678e.setEnabled(true);
        this.f13891e.f14675b.setEnabled(true);
    }

    /* renamed from: t1 */
    public void mo16527t1(boolean z) {
        if (z) {
            this.f13891e.f14682i.mo16857l();
        } else {
            this.f13891e.f14682i.mo16859n();
        }
    }
}
