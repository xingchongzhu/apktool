package com.tv91.features.authentication.p202p;

import android.os.Bundle;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.C2148e;
import com.tv91.features.authentication.ForgetPasswordScreen;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.p206i.Editors;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.p210r.ViewForgetPasswordBinding;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.p.y */
final class ForgetPasswordView extends BasicView implements C2148e {

    /* renamed from: e */
    private final ViewForgetPasswordBinding f13764e;

    /* renamed from: f */
    private final Toolbar f13765f;

    ForgetPasswordView(ViewForgetPasswordBinding i0Var) {
        super(i0Var);
        this.f13764e = i0Var;
        Toolbar gVar = new Toolbar(i0Var.f14411m);
        this.f13765f = gVar;
        gVar.mo16828p(R.string.reset_password_title);
        gVar.mo16819c(R.menu.menu_cancel);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo16668r2(Consumer aVar) {
        aVar.mo4887a(new ForgetPasswordScreen(this.f13764e.f14410l.getText(), this.f13764e.f14409k.getText(), this.f13764e.f14408j.getText()));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo16669v2(Consumer aVar) {
        aVar.mo4887a(this.f13764e.f14407i.getText());
    }

    /* renamed from: y2 */
    private void m17023y2(boolean z) {
        this.f13764e.f14410l.setEnabled(z);
        this.f13764e.f14409k.setEnabled(z);
        this.f13764e.f14408j.setEnabled(z);
        this.f13764e.f14400b.setEnabled(z);
    }

    /* renamed from: z2 */
    private void m17024z2(boolean z) {
        this.f13764e.f14407i.setEnabled(z);
        this.f13764e.f14401c.setEnabled(z);
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f13765f.mo16817a();
    }

    /* renamed from: Q */
    public void mo16484Q(String str) {
        m17024z2(true);
        this.f13764e.f14404f.setText(str);
    }

    /* renamed from: U0 */
    public void mo16485U0(Consumer<ForgetPasswordScreen> aVar) {
        C2233q qVar = new C2233q(this, aVar);
        this.f13764e.f14408j.setOnEditorActionListener(Editors.m17393a(new C2235s(qVar)));
        this.f13764e.f14400b.setOnClickListener(Clicks.m17391a(new C2232p(qVar)));
    }

    /* renamed from: d */
    public void mo16486d(Runnable runnable) {
        this.f13765f.mo16822j(runnable);
    }

    /* renamed from: e2 */
    public void mo16487e2(String str) {
        this.f13764e.f14404f.setText(str);
        m17024z2(true);
    }

    /* renamed from: f */
    public void mo16488f(Consumer<CharSequence> aVar) {
        C2237u uVar = new C2237u(this, aVar);
        this.f13764e.f14407i.setOnEditorActionListener(Editors.m17395c(new C2236t(uVar)));
        this.f13764e.f14401c.setOnClickListener(Clicks.m17391a(new C2234r(uVar)));
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f13765f.mo16818b();
        this.f13764e.f14407i.setOnEditorActionListener(null);
        this.f13764e.f14401c.setOnClickListener(null);
        this.f13764e.f14408j.setOnEditorActionListener(null);
        this.f13764e.f14400b.setOnClickListener(null);
    }

    /* renamed from: j1 */
    public void mo16489j1(String str) {
        this.f13764e.f14405g.setText(str);
        m17023y2(true);
    }

    /* renamed from: k1 */
    public void mo16490k1(String str) {
        m17024z2(true);
        m17023y2(false);
        this.f13764e.f14405g.setText(str);
    }

    /* renamed from: p0 */
    public void mo16491p0() {
        m17023y2(true);
        new C2317a(this.f13974b).mo16910x(R.string.reset_password_title).mo16899m(R.string.reset_password_dialog_send_verification_mail_success).mo16908v(R.string.dialog_button_confirm).mo16912z();
    }

    /* renamed from: s */
    public void mo16492s(Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.reset_password_title).mo16899m(R.string.reset_password_dialog_reset_password_success).mo16908v(R.string.dialog_button_confirm).mo16906t(runnable).mo16912z();
    }

    /* renamed from: x */
    public void mo16493x() {
        m17023y2(false);
        this.f13764e.f14405g.setText(null);
    }

    /* renamed from: z0 */
    public void mo16494z0() {
        m17024z2(false);
        this.f13764e.f14404f.setText(null);
    }
}
