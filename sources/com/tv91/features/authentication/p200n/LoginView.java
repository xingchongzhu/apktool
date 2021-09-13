package com.tv91.features.authentication.p200n;

import android.os.Bundle;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.C2150h;
import com.tv91.features.authentication.LoginScreen;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.p206i.Editors;
import com.tv91.p210r.ViewLoginBinding;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.n.l0 */
final class LoginView extends BasicView implements C2150h {

    /* renamed from: e */
    private final ViewLoginBinding f13696e;

    LoginView(ViewLoginBinding j0Var) {
        super(j0Var);
        this.f13696e = j0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo16603B2(Consumer aVar) {
        aVar.mo4887a(this.f13696e.f14432m.getText());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo16604u2(Consumer aVar) {
        aVar.mo4887a(new LoginScreen(this.f13696e.f14432m.getText(), this.f13696e.f14434o.getText()));
    }

    /* renamed from: A0 */
    public void mo16499A0(Runnable runnable) {
        this.f13696e.f14423d.setOnClickListener(Clicks.m17391a(new C2171b0(runnable)));
    }

    /* renamed from: B1 */
    public void mo16500B1() {
        this.f13696e.f14422c.setBackgroundResource(R.drawable.fg_accent);
        this.f13696e.f14422c.setTextColor(mo16812l2(R.color.white_translucent_60));
        this.f13696e.f14423d.setBackgroundColor(mo16812l2(R.color.light_orange));
        this.f13696e.f14423d.setTextColor(mo16812l2(R.color.white));
        this.f13696e.f14432m.setInputType(3);
        this.f13696e.f14432m.setHint(R.string.login_hint_phone_number);
        this.f13696e.f14432m.setImeOptions(4);
        this.f13696e.f14432m.setText(null);
        this.f13696e.f14434o.setInputType(524289);
        this.f13696e.f14434o.setHint(R.string.login_hint_login_code);
        this.f13696e.f14434o.setEnabled(false);
        this.f13696e.f14434o.setText(null);
        this.f13696e.f14433n.setText(null);
        this.f13696e.f14421b.setVisibility(8);
        this.f13696e.f14426g.setVisibility(0);
        this.f13696e.f14431l.setVisibility(4);
    }

    /* renamed from: D0 */
    public void mo16501D0() {
        this.f13696e.f14426g.mo16857l();
    }

    /* renamed from: G */
    public void mo16502G(String str) {
        this.f13696e.f14433n.setText(str);
        this.f13696e.f14421b.setEnabled(true);
    }

    /* renamed from: I */
    public void mo16503I(Runnable runnable) {
        this.f13696e.f14425f.setOnClickListener(Clicks.m17391a(new C2196t(runnable)));
    }

    /* renamed from: X */
    public void mo16504X(Runnable runnable) {
        this.f13696e.f14422c.setOnClickListener(Clicks.m17391a(new C2197u(runnable)));
    }

    /* renamed from: Z1 */
    public void mo16505Z1(Consumer<LoginScreen> aVar) {
        C2177e0 e0Var = new C2177e0(this, aVar);
        this.f13696e.f14434o.setOnEditorActionListener(Editors.m17393a(new C2200x(e0Var)));
        this.f13696e.f14421b.setOnClickListener(Clicks.m17391a(new C2169a0(e0Var)));
    }

    /* renamed from: c1 */
    public void mo16506c1(String str, String str2) {
        this.f13696e.f14422c.setBackgroundColor(mo16812l2(R.color.color_accent));
        this.f13696e.f14422c.setTextColor(mo16812l2(R.color.white));
        this.f13696e.f14423d.setBackgroundResource(R.drawable.fg_light_orange);
        this.f13696e.f14423d.setTextColor(mo16812l2(R.color.white_translucent_60));
        this.f13696e.f14432m.setInputType(33);
        this.f13696e.f14432m.setHint(R.string.login_hint_account);
        this.f13696e.f14432m.setImeOptions(5);
        this.f13696e.f14432m.setText(str);
        this.f13696e.f14434o.setInputType(129);
        this.f13696e.f14434o.setHint(R.string.login_hint_password);
        this.f13696e.f14434o.setEnabled(true);
        this.f13696e.f14434o.setText(str2);
        this.f13696e.f14433n.setText(null);
        this.f13696e.f14421b.setVisibility(0);
        this.f13696e.f14426g.setVisibility(8);
        this.f13696e.f14431l.setVisibility(0);
    }

    /* renamed from: d */
    public void mo16507d(Runnable runnable) {
        this.f13696e.f14428i.setOnClickListener(Clicks.m17391a(new C2173c0(runnable)));
    }

    /* renamed from: f */
    public void mo16508f(Consumer<CharSequence> aVar) {
        C2199w wVar = new C2199w(this, aVar);
        this.f13696e.f14432m.setOnEditorActionListener(Editors.m17395c(new C2202z(wVar)));
        this.f13696e.f14426g.setOnClickListener(Clicks.m17391a(new C2201y(wVar)));
    }

    /* renamed from: g */
    public void mo16509g(String str) {
        this.f13696e.f14433n.setText(str);
        this.f13696e.f14426g.setClickable(true);
        this.f13696e.f14421b.setEnabled(true);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f13696e.f14428i.setOnClickListener(null);
        this.f13696e.f14422c.setOnClickListener(null);
        this.f13696e.f14423d.setOnClickListener(null);
        this.f13696e.f14432m.setOnEditorActionListener(null);
        this.f13696e.f14434o.setOnEditorActionListener(null);
        this.f13696e.f14421b.setOnClickListener(null);
        this.f13696e.f14426g.setOnClickListener(null);
        this.f13696e.f14431l.setOnClickListener(null);
        this.f13696e.f14425f.setOnClickListener(null);
        this.f13696e.f14424e.setOnClickListener(null);
    }

    /* renamed from: j */
    public void mo16510j() {
        this.f13696e.f14433n.setText(null);
        this.f13696e.f14426g.setClickable(false);
        this.f13696e.f14421b.setEnabled(false);
    }

    /* renamed from: k */
    public void mo16511k(String str) {
        this.f13696e.f14433n.setText(str);
        this.f13696e.f14422c.setEnabled(true);
    }

    /* renamed from: l */
    public void mo16512l() {
        this.f13696e.f14433n.setText(R.string.login_text_sms_sent);
        this.f13696e.f14434o.setEnabled(true);
        this.f13696e.f14421b.setEnabled(true);
        this.f13696e.f14421b.setVisibility(0);
        this.f13696e.f14422c.setEnabled(false);
    }

    /* renamed from: u0 */
    public void mo16513u0(Runnable runnable) {
        this.f13696e.f14431l.setOnClickListener(Clicks.m17391a(new C2175d0(runnable)));
    }

    /* renamed from: v1 */
    public void mo16514v1(Runnable runnable) {
        this.f13696e.f14424e.setOnClickListener(Clicks.m17391a(new C2198v(runnable)));
    }
}
