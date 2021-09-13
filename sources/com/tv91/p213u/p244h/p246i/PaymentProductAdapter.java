package com.tv91.p213u.p244h.p246i;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.model.Product;
import com.tv91.p210r.AdapterPaymentBinding;
import com.tv91.utils.C3052g;

/* renamed from: com.tv91.u.h.i.d0 */
final class PaymentProductAdapter extends RecyclerAdapter<Product, C2990a> {

    /* renamed from: com.tv91.u.h.i.d0$a */
    /* compiled from: PaymentProductAdapter */
    static class C2990a extends ViewHolder<Product> {

        /* renamed from: w */
        private final AdapterPaymentBinding f15948w;

        C2990a(AdapterPaymentBinding jVar) {
            super(jVar);
            this.f15948w = jVar;
            jVar.mo5604a().setBackground(mo16850S(R.color.white_translucent_12, mo16845N(7)));
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Product product) {
            this.f15948w.f14416e.setText(product.getTitle());
            this.f15948w.f14417f.setText(product.description);
            this.f15948w.f14419h.setText(mo16849R(R.string.payment_price, Double.valueOf(product.price)));
            String titleExtra = product.getTitleExtra();
            if (!C3052g.m20586g(titleExtra)) {
                this.f15948w.f14415d.setText(titleExtra);
                this.f15948w.f14415d.setBackground(mo16850S(R.color.moderate_red, mo16845N(2)));
            }
        }
    }

    PaymentProductAdapter() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C2990a mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new C2990a(AdapterPaymentBinding.m17737d(layoutInflater, viewGroup, false));
    }
}
