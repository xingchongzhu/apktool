package com.tv91.p213u.p244h.p246i;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0212b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0420n;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CountdownTextView.C2312b;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.features.shared.widget.NoScrollGridLayoutManager;
import com.tv91.model.PaymentMethod;
import com.tv91.model.Product;
import com.tv91.model.ProductGroup;
import com.tv91.p210r.ViewPaymentBinding;
import com.tv91.p213u.p244h.PaymentScreen;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.i.e0 */
final class PaymentView extends BasicView implements PaymentScreen {

    /* renamed from: e */
    private final ViewPaymentBinding f15950e;

    /* renamed from: f */
    private final Toolbar f15951f;

    /* renamed from: g */
    private final PaymentProductAdapter f15952g;

    /* renamed from: h */
    private final PaymentProductAdapter f15953h;

    /* renamed from: i */
    private final ProgressDialog f15954i;

    /* renamed from: j */
    private C0420n f15955j;

    /* renamed from: com.tv91.u.h.i.e0$a */
    /* compiled from: PaymentView */
    class C2992a implements C2312b {

        /* renamed from: a */
        final /* synthetic */ ViewPaymentBinding f15956a;

        C2992a(ViewPaymentBinding m0Var) {
            this.f15956a = m0Var;
        }

        /* renamed from: a */
        public void mo16868a() {
            this.f15956a.f14494i.setVisibility(8);
        }

        /* renamed from: b */
        public void mo16869b(int i) {
            int i2 = i % 1000;
            int i3 = i / 1000;
            int i4 = i3 % 60;
            int i5 = i3 / 60;
            this.f15956a.f14494i.setText(PaymentView.this.mo16815o2(R.string.payment_countdown, Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i2)));
        }
    }

    /* renamed from: com.tv91.u.h.i.e0$b */
    /* compiled from: PaymentView */
    class C2993b extends C0420n {

        /* renamed from: a */
        final /* synthetic */ int f15958a;

        C2993b(int i) {
            this.f15958a = i;
        }

        /* renamed from: e */
        public void mo3469e(Rect rect, View view, RecyclerView recyclerView, C0401a0 a0Var) {
            int i = this.f15958a;
            rect.set(i, i, i, i);
        }
    }

    PaymentView(ViewPaymentBinding m0Var) {
        super(m0Var);
        this.f15950e = m0Var;
        Toolbar gVar = new Toolbar(m0Var.f14500o);
        this.f15951f = gVar;
        PaymentProductAdapter d0Var = new PaymentProductAdapter();
        this.f15952g = d0Var;
        PaymentProductAdapter d0Var2 = new PaymentProductAdapter();
        this.f15953h = d0Var2;
        ProgressDialog progressDialog = new ProgressDialog(this.f13974b);
        this.f15954i = progressDialog;
        gVar.mo16828p(R.string.payment_title);
        gVar.mo16819c(R.menu.menu_cancel);
        m0Var.f14489d.setLayoutManager(new NoScrollGridLayoutManager(this.f13974b, 2));
        m0Var.f14489d.setAdapter(d0Var);
        m0Var.f14489d.mo3244h(m20328r2());
        m0Var.f14488c.setLayoutManager(new NoScrollGridLayoutManager(this.f13974b, 2));
        m0Var.f14488c.setAdapter(d0Var2);
        m0Var.f14488c.mo3244h(m20328r2());
        m0Var.f14494i.setCompoundDrawablesRelativeWithIntrinsicBounds(mo16814n2(R.drawable.ic_clock), (Drawable) null, (Drawable) null, (Drawable) null);
        m0Var.f14494i.setCountDownListener(new C2992a(m0Var));
        progressDialog.setIndeterminate(true);
    }

    /* renamed from: r2 */
    private C0420n m20328r2() {
        if (this.f15955j == null) {
            this.f15955j = new C2993b(mo16813m2(R.dimen.spacing_normal));
        }
        return this.f15955j;
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo18445u2(String str, Bitmap bitmap) {
        C0212b bVar = (C0212b) this.f15950e.f14490e.getLayoutParams();
        StringBuilder sb = new StringBuilder();
        sb.append(bitmap.getWidth());
        sb.append(":");
        sb.append(bitmap.getHeight());
        bVar.f1336B = sb.toString();
        this.f15950e.f14490e.setLayoutParams(bVar);
        this.f15950e.f14490e.setImageBitmap(bitmap);
    }

    /* renamed from: D */
    public void mo18380D(boolean z) {
        if (z) {
            this.f15954i.show();
        } else {
            this.f15954i.dismiss();
        }
    }

    /* renamed from: E1 */
    public void mo18381E1(int i, int i2) {
        this.f15950e.f14494i.mo16858m(i, i2);
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f15951f.mo16817a();
    }

    /* renamed from: W1 */
    public void mo18382W1(Runnable runnable) {
        this.f15950e.f14490e.setOnClickListener(Clicks.m17391a(new C3008t(runnable)));
    }

    /* renamed from: a */
    public void mo18383a(boolean z) {
        this.f15950e.f14492g.setVisibility(z ? 0 : 8);
    }

    /* renamed from: d */
    public void mo18384d(Runnable runnable) {
        this.f15951f.mo16822j(runnable);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: g2 */
    public void mo18385g2(ProductGroup productGroup, ProductGroup productGroup2, ProductGroup productGroup3) {
        this.f15950e.f14498m.setText(productGroup.title);
        this.f15950e.f14499n.setText(productGroup.subTitle);
        this.f15952g.mo16842x(productGroup.products);
        this.f15950e.f14495j.setText(productGroup2.title);
        this.f15950e.f14496k.setText(productGroup2.subTitle);
        this.f15953h.mo16842x(productGroup2.products);
        this.f13975c.mo18692b(productGroup3.image).mo18694d(0, 0).mo18696f(new C3009u(this));
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15951f.mo16818b();
        this.f15952g.mo16838H(null);
        this.f15953h.mo16838H(null);
    }

    /* renamed from: u1 */
    public void mo18386u1(Product product, Consumer<PaymentMethod> aVar) {
        new PaymentMethodDialog(this.f13974b).mo18439r(product).mo18440s(aVar).show();
    }

    /* renamed from: v */
    public void mo18387v(Runnable runnable, Runnable runnable2) {
        new C2317a(this.f13974b).mo16910x(R.string.dialog_title).mo16899m(R.string.payment_verification_desc).mo16901o(R.string.dialog_button_cancel).mo16904r(R.string.payment_dialog_button_deposit, runnable2).mo16909w(R.string.payment_dialog_button_verification, runnable).mo16912z();
    }

    /* renamed from: x0 */
    public void mo18388x0(Consumer<Product> aVar) {
        this.f15952g.mo16838H(aVar);
        this.f15953h.mo16838H(aVar);
    }
}
