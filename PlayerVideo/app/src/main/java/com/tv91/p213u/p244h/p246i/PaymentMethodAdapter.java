package com.tv91.p213u.p244h.p246i;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.model.PaymentMethod;
import com.tv91.p210r.AdapterPaymentMethodBinding;

/* renamed from: com.tv91.u.h.i.b0 */
final class PaymentMethodAdapter extends RecyclerAdapter<PaymentMethod, C2986a> {

    /* renamed from: com.tv91.u.h.i.b0$a */
    /* compiled from: PaymentMethodAdapter */
    static class C2986a extends ViewHolder<PaymentMethod> {

        /* renamed from: w */
        private final AdapterPaymentMethodBinding f15936w;

        C2986a(AdapterPaymentMethodBinding lVar) {
            super(lVar);
            this.f15936w = lVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(PaymentMethod paymentMethod) {
            this.f13991v.mo18692b(paymentMethod.image).mo18697g(this.f15936w.f14473c);
            this.f15936w.f14474d.setText(paymentMethod.getName());
        }
    }

    PaymentMethodAdapter() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C2986a mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new C2986a(AdapterPaymentMethodBinding.m17751d(layoutInflater, viewGroup, false));
    }
}
