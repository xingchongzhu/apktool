package com.tv91.features.authentication.p199m;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.C2147c;
import com.tv91.features.authentication.ChangePasswordScreen;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.p206i.Editors;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.p210r.ViewChangePasswordBinding;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.m.q */
final class ChangePasswordView extends BasicView implements C2147c {

    /* renamed from: e */
    private final ViewChangePasswordBinding f13656e;

    /* renamed from: f */
    private final Toolbar f13657f;

    ChangePasswordView(ViewChangePasswordBinding b0Var) {
        super(b0Var);
        this.f13656e = b0Var;
        Toolbar gVar = new Toolbar(b0Var.f14318g);
        this.f13657f = gVar;
        gVar.mo16828p(R.string.change_password_title);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo16554r2(Consumer aVar, TextView textView) {
        m16785u2(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo16555t2(Consumer aVar, View view) {
        m16785u2(aVar);
    }

    /* renamed from: u2 */
    private void m16785u2(Consumer<ChangePasswordScreen> aVar) {
        this.f13656e.f14315d.setText(null);
        this.f13656e.f14313b.setEnabled(false);
        aVar.mo4887a(new ChangePasswordScreen(this.f13656e.f14317f.getText(), this.f13656e.f14316e.getText()));
    }

    /* renamed from: C1 */
    public void mo16480C1(Consumer<ChangePasswordScreen> aVar) {
        this.f13656e.f14316e.setOnEditorActionListener(Editors.m17393a(new C2162j(this, aVar)));
        this.f13656e.f14313b.setOnClickListener(Clicks.m17391a(new C2161i(this, aVar)));
    }

    /* renamed from: R0 */
    public void mo16481R0(Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.change_password_dialog_title).mo16899m(R.string.change_password_dialog_success).mo16909w(R.string.dialog_button_logout, runnable).mo16896j(false).mo16897k(false).mo16912z();
    }

    /* renamed from: b */
    public void mo16482b(Runnable runnable) {
        this.f13657f.mo16821i(runnable);
    }

    /* renamed from: g */
    public void mo16483g(String str) {
        mo16552g0(str);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        this.f13656e.f14315d.setText(str);
        this.f13656e.f14313b.setEnabled(true);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f13657f.mo16818b();
        this.f13656e.f14316e.setOnEditorActionListener(null);
        this.f13656e.f14313b.setOnClickListener(null);
    }
}
