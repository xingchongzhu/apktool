package com.tv91.p213u.p242g;

import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.p210r.ViewSplashBinding;

/* renamed from: com.tv91.u.g.e0 */
final class SplashView extends BasicView implements SplashScreen {

    /* renamed from: e */
    private final ViewSplashBinding f15826e;

    /* renamed from: f */
    private Runnable f15827f = C2950v.f15878a;

    /* renamed from: g */
    private Runnable f15828g = C2952x.f15880a;

    /* renamed from: h */
    private Runnable f15829h = C2949u.f15877a;

    /* renamed from: i */
    private Runnable f15830i = C2951w.f15879a;

    /* renamed from: j */
    private Runnable f15831j = C2953y.f15881a;

    SplashView(ViewSplashBinding w0Var) {
        super(w0Var);
        this.f15826e = w0Var;
        w0Var.f14670e.setVisibility(0);
    }

    /* renamed from: q2 */
    static /* synthetic */ void m20114q2() {
    }

    /* renamed from: r2 */
    static /* synthetic */ void m20115r2() {
    }

    /* renamed from: s2 */
    static /* synthetic */ void m20116s2() {
    }

    /* renamed from: t2 */
    static /* synthetic */ void m20117t2() {
    }

    /* renamed from: u2 */
    static /* synthetic */ void m20118u2() {
    }

    /* renamed from: G1 */
    public void mo18316G1(String str) {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_error_title).mo16900n(str).mo16909w(R.string.dialog_button_report, this.f15830i).mo16904r(R.string.dialog_button_contact, this.f15831j).mo16912z();
    }

    /* renamed from: I1 */
    public void mo18317I1(Runnable runnable) {
        this.f15831j = runnable;
    }

    /* renamed from: P0 */
    public void mo18318P0() {
        this.f15826e.f14671f.setText(R.string.main_navigate);
    }

    /* renamed from: U1 */
    public void mo18319U1(String str) {
        Spanned spanned;
        if (VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml(str, 0);
        } else {
            spanned = Html.fromHtml(str);
        }
        new C2317a(this.f13974b).mo16910x(R.string.main_api_version_outdated).mo16900n(spanned.toString()).mo16909w(R.string.main_dialog_button_update, this.f15827f).mo16904r(R.string.main_dialog_button_download, this.f15828g).mo16902p(R.string.dialog_button_cancel, this.f15829h).mo16905s(this.f15829h).mo16912z();
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: j0 */
    public void mo18320j0(Runnable runnable) {
        this.f15830i = runnable;
    }

    /* renamed from: j2 */
    public void mo18321j2(Runnable runnable) {
        this.f15827f = runnable;
    }

    /* renamed from: m */
    public void mo18322m(Runnable runnable) {
        this.f15828g = runnable;
    }

    /* renamed from: n0 */
    public void mo18323n0(Runnable runnable) {
        this.f15829h = runnable;
    }

    /* renamed from: q */
    public void mo18324q() {
        this.f15826e.f14671f.setText(R.string.main_check_api_version);
    }

    /* renamed from: w */
    public void mo18325w() {
        this.f15826e.f14671f.setText(R.string.main_downloading);
    }
}
