package com.tv91.p213u.p231e.p232g;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Toast;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.model.Promotion;
import com.tv91.p210r.ViewPromotionMemberBinding;
import com.tv91.p213u.p231e.C2797b;
import com.tv91.p213u.p231e.MemberScreen;
import com.tv91.utils.C3052g;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.e.g.a0 */
final class MemberView extends BasicView implements C2797b {

    /* renamed from: e */
    private final ViewPromotionMemberBinding f15568e;

    /* renamed from: f */
    private final Toolbar f15569f;

    MemberView(ViewPromotionMemberBinding q0Var) {
        super(q0Var);
        this.f15568e = q0Var;
        Toolbar gVar = new Toolbar(q0Var.f14568l);
        this.f15569f = gVar;
        gVar.mo16828p(R.string.promotion_member_title);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo18031r2(Consumer aVar, View view) {
        aVar.mo4887a(this.f15568e.f14558b.getText().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo18032t2(Consumer aVar) {
        aVar.mo4887a(new MemberScreen(this.f15568e.f14562f.getWidth(), this.f15568e.f14562f.getHeight()));
    }

    /* renamed from: F */
    public void mo18011F(Consumer<String> aVar) {
        this.f15568e.f14558b.setOnClickListener(Clicks.m17391a(new C2819t(this, aVar)));
    }

    /* renamed from: G0 */
    public void mo18012G0(Bitmap bitmap) {
        this.f15568e.f14562f.setImageBitmap(bitmap);
    }

    /* renamed from: R1 */
    public void mo18013R1(String str, Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_error_title).mo16900n(str).mo16909w(R.string.promotion_dialog_button_verification, runnable).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* renamed from: V0 */
    public void mo18014V0(Consumer<MemberScreen> aVar) {
        this.f15568e.f14562f.post(new C2818s(this, aVar));
    }

    /* renamed from: V1 */
    public void mo18015V1(Runnable runnable) {
        this.f15568e.f14560d.setOnClickListener(Clicks.m17391a(new C2820u(runnable)));
    }

    /* renamed from: X1 */
    public void mo18016X1(Runnable runnable) {
        this.f15568e.f14559c.setOnClickListener(Clicks.m17391a(new C2821v(runnable)));
    }

    /* renamed from: a */
    public void mo18017a(boolean z) {
        this.f15568e.f14564h.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo18018b(Runnable runnable) {
        this.f15569f.mo16821i(runnable);
    }

    /* renamed from: e1 */
    public void mo18019e1() {
        Toast.makeText(this.f13974b, R.string.promotion_member_text_link_copied, 0).show();
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15569f.mo16818b();
        this.f15568e.f14560d.setOnClickListener(null);
        this.f15568e.f14559c.setOnClickListener(null);
        this.f15568e.f14558b.setOnClickListener(null);
    }

    /* renamed from: i2 */
    public void mo18020i2(Promotion promotion) {
        this.f15568e.f14566j.setText(C3052g.m20588i(promotion.exchangeRule));
        this.f15568e.f14566j.setMovementMethod(new ScrollingMovementMethod());
    }
}
