package com.tv91.features.authentication.p201o;

import android.os.Bundle;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.C2151j;
import com.tv91.features.authentication.RegisterScreen;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.p206i.Editors;
import com.tv91.p210r.ViewRegisterBinding;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.o.q */
final class RegisterView extends BasicView implements C2151j {

    /* renamed from: e */
    private final ViewRegisterBinding f13734e;

    /* renamed from: f */
    private final Toolbar f13735f;

    RegisterView(ViewRegisterBinding v0Var) {
        super(v0Var);
        this.f13734e = v0Var;
        Toolbar gVar = new Toolbar(v0Var.f14659j);
        this.f13735f = gVar;
        gVar.mo16828p(R.string.register_title);
        gVar.mo16819c(R.menu.menu_cancel);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo16636r2(Consumer aVar) {
        aVar.mo4887a(new RegisterScreen(this.f13734e.f14653d.getText(), this.f13734e.f14656g.getText(), this.f13734e.f14657h.getText(), this.f13734e.f14654e.getText()));
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f13735f.mo16817a();
    }

    /* renamed from: d */
    public void mo16515d(Runnable runnable) {
        this.f13735f.mo16822j(runnable);
    }

    /* renamed from: g */
    public void mo16516g(String str) {
        this.f13734e.f14655f.setText(str);
        this.f13734e.f14651b.setEnabled(true);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f13735f.mo16818b();
        this.f13734e.f14654e.setOnEditorActionListener(null);
        this.f13734e.f14651b.setOnClickListener(null);
    }

    /* renamed from: j */
    public void mo16517j() {
        this.f13734e.f14655f.setText(null);
        this.f13734e.f14651b.setEnabled(false);
    }

    /* renamed from: p1 */
    public void mo16518p1(Consumer<RegisterScreen> aVar) {
        C2213k kVar = new C2213k(this, aVar);
        this.f13734e.f14654e.setOnEditorActionListener(Editors.m17395c(new C2211i(kVar)));
        this.f13734e.f14651b.setOnClickListener(Clicks.m17391a(new C2212j(kVar)));
    }

    /* renamed from: r0 */
    public void mo16519r0(String str) {
        this.f13734e.f14655f.setText(str);
        this.f13734e.f14651b.setEnabled(true);
    }
}
