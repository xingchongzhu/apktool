package com.tv91.p213u.p244h.p245h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C0420n;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.PaymentHistory;
import com.tv91.p210r.AdapterPaymentHistoryBinding;
import com.tv91.p210r.ViewPaymentHistoryBinding;
import com.tv91.p213u.p244h.C2956d;
import com.tv91.p213u.p244h.C2957e;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.h.u */
final class PaymentHistoryView extends BasicView implements C2957e<PaymentHistory> {

    /* renamed from: e */
    private final ViewPaymentHistoryBinding f15923e;

    /* renamed from: f */
    private final Toolbar f15924f;

    /* renamed from: g */
    private final C2978b f15925g;

    /* renamed from: com.tv91.u.h.h.u$b */
    /* compiled from: PaymentHistoryView */
    private static class C2978b extends RecyclerAdapter<PaymentHistory, C2979c> {
        private C2978b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2979c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2979c(AdapterPaymentHistoryBinding.m17744d(layoutInflater, viewGroup, false));
        }
    }

    /* renamed from: com.tv91.u.h.h.u$c */
    /* compiled from: PaymentHistoryView */
    private static class C2979c extends ViewHolder<PaymentHistory> {

        /* renamed from: w */
        private final AdapterPaymentHistoryBinding f15926w;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(PaymentHistory paymentHistory) {
            this.f15926w.f14437c.setText(paymentHistory.method);
            this.f15926w.f14439e.setText(mo16849R(R.string.payment_history_price_cny, Double.valueOf(paymentHistory.price)));
            this.f15926w.f14438d.setText(mo16849R(R.string.payment_history_point_format, Integer.valueOf(paymentHistory.point)));
            this.f15926w.f14436b.setText(paymentHistory.date);
        }

        private C2979c(AdapterPaymentHistoryBinding kVar) {
            super(kVar);
            this.f15926w = kVar;
        }
    }

    PaymentHistoryView(ViewPaymentHistoryBinding n0Var) {
        super(n0Var);
        this.f15923e = n0Var;
        Toolbar gVar = new Toolbar(n0Var.f14512g);
        this.f15924f = gVar;
        C2978b bVar = new C2978b();
        this.f15925g = bVar;
        gVar.mo16828p(R.string.payment_history_title);
        n0Var.f14510e.setAdapter(bVar);
        n0Var.f14510e.setLayoutManager(new LinearLayoutManager(this.f13974b));
        n0Var.f14510e.mo3244h(m20276q2());
    }

    /* renamed from: q2 */
    private C0420n m20276q2() {
        DividerItemDecoration dVar = new DividerItemDecoration(this.f13974b, 1);
        dVar.mo3817l(mo16814n2(R.drawable.widget_divider_inset));
        return dVar;
    }

    /* renamed from: H */
    public void mo18375H(List<PaymentHistory> list) {
        if (list.isEmpty()) {
            this.f15923e.f14511f.setVisibility(0);
        } else {
            this.f15925g.mo16842x(list);
        }
    }

    /* renamed from: S0 */
    public void mo18376S0(Consumer<Object> aVar) {
    }

    /* renamed from: a */
    public void mo18377a(boolean z) {
        this.f15923e.f14509d.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo18378b(Runnable runnable) {
        this.f15924f.mo16821i(runnable);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15924f.mo16818b();
    }

    /* renamed from: s0 */
    public /* synthetic */ void mo18379s0(int i, Runnable runnable) {
        C2956d.m20191a(this, i, runnable);
    }
}
