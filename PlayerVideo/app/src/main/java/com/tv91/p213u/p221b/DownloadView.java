package com.tv91.p213u.p221b;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.p210r.ViewDownloadBinding;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.b.u0 */
final class DownloadView extends BasicView implements DownloadScreen {

    /* renamed from: e */
    private final Toolbar f15001e;

    /* renamed from: f */
    private final DownloadAdapter f15002f;

    /* renamed from: g */
    private final ProgressDialog f15003g;

    /* renamed from: h */
    private Consumer<DownloadRecord> f15004h = C2477n0.f14966a;

    /* renamed from: i */
    private Consumer<DownloadRecord> f15005i = C2467i0.f14951a;

    DownloadView(ViewDownloadBinding d0Var) {
        super(d0Var);
        Toolbar gVar = new Toolbar(d0Var.f14341d);
        this.f15001e = gVar;
        DownloadAdapter p0Var = new DownloadAdapter();
        this.f15002f = p0Var;
        ProgressDialog progressDialog = new ProgressDialog(this.f13974b);
        this.f15003g = progressDialog;
        gVar.mo16828p(R.string.download_content_title);
        gVar.mo16819c(R.menu.menu_edit);
        d0Var.f14340c.setAdapter(p0Var);
        d0Var.f14340c.setLayoutManager(new LinearLayoutManager(this.f13974b));
        d0Var.f14340c.setItemAnimator(null);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
    }

    /* renamed from: q2 */
    static /* synthetic */ void m18408q2(DownloadRecord aVar) {
    }

    /* renamed from: r2 */
    static /* synthetic */ void m18409r2(DownloadRecord aVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo17419t2(DownloadRecord aVar) {
        this.f15004h.mo4887a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo17420v2(DownloadRecord aVar) {
        this.f15005i.mo4887a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo17421x2(DownloadRecord aVar) {
        this.f15005i.mo4887a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo17422z2(DownloadRecord aVar) {
        this.f15005i.mo4887a(aVar);
    }

    /* renamed from: A */
    public void mo17400A(Consumer<DownloadRecord> aVar) {
        this.f15005i = aVar;
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f15001e.mo16817a();
    }

    /* renamed from: K */
    public void mo17401K(DownloadRecord aVar) {
        if (aVar.f14104f == C2335a.DELETED) {
            this.f15002f.mo16839I(aVar);
            return;
        }
        DownloadAdapter p0Var = this.f15002f;
        p0Var.mo16841K(p0Var.mo16834C(aVar), aVar);
    }

    /* renamed from: N0 */
    public void mo17402N0() {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_error_title).mo16899m(R.string.E_file_not_exist).mo16903q(R.string.dialog_button_close).mo16912z();
    }

    /* renamed from: O0 */
    public void mo17403O0(String str) {
        Toast.makeText(this.f13974b, str, 0).show();
    }

    /* renamed from: Y */
    public void mo17404Y(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: Y0 */
    public void mo17405Y0(DownloadRecord aVar) {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_error_title).mo16899m(R.string.E_download_corrupt).mo16909w(R.string.dialog_button_remove_and_download, new C2471k0(this, aVar)).mo16904r(R.string.dialog_button_remove, new C2469j0(this, aVar)).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: a */
    public void mo17406a(boolean z) {
        this.f15003g.setMessage("");
        if (z) {
            this.f15003g.show();
        } else {
            this.f15003g.dismiss();
        }
    }

    /* renamed from: a2 */
    public void mo17407a2(Consumer<DownloadRecord> aVar) {
        this.f15002f.mo17349V(aVar);
        this.f15002f.mo17353Z(aVar);
    }

    /* renamed from: b */
    public void mo17408b(Runnable runnable) {
        this.f15001e.mo16821i(runnable);
    }

    /* renamed from: b0 */
    public void mo17409b0(DownloadRecord aVar) {
        C2317a q = new C2317a(this.f13974b).mo16910x(R.string.dialog_error_title).mo16899m(R.string.E_download_expired).mo16903q(R.string.dialog_button_close);
        if (!(aVar == null || aVar.f14104f == C2335a.DELETED)) {
            q.mo16902p(R.string.movie_dialog_download_remove, new C2473l0(this, aVar));
        }
        q.mo16912z();
    }

    /* renamed from: e0 */
    public void mo17410e0(Consumer<DownloadRecord> aVar) {
        this.f15004h = aVar;
    }

    /* renamed from: f1 */
    public void mo17411f1(Consumer<DownloadRecord> aVar) {
        this.f15002f.mo17351X(aVar);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        Toast.makeText(this.f13974b, str, 0).show();
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15001e.mo16818b();
    }

    /* renamed from: k2 */
    public void mo17412k2() {
        this.f15002f.mo17354a0();
    }

    /* renamed from: l0 */
    public void mo17413l0(boolean z) {
        this.f15003g.setMessage(mo16815o2(R.string.download_content_moving_file_message, new Object[0]));
        if (z) {
            this.f15003g.show();
        } else {
            this.f15003g.dismiss();
        }
    }

    /* renamed from: l1 */
    public void mo17414l1(DownloadRecord aVar) {
        new C2317a(this.f13974b).mo16910x(R.string.download_content_dialog_remove_title).mo16900n(mo16815o2(R.string.download_content_dialog_remove_message, aVar.f14101c.name)).mo16909w(R.string.dialog_button_confirm, new C2475m0(this, aVar)).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: n */
    public void mo17415n(Consumer<DownloadRecord> aVar) {
        this.f15002f.mo17352Y(aVar);
    }

    /* renamed from: o */
    public void mo17416o(Runnable runnable) {
        this.f15001e.mo16824l(runnable);
    }

    /* renamed from: x1 */
    public void mo17417x1(List<DownloadRecord> list) {
        this.f15002f.mo16840J(list);
    }
}
