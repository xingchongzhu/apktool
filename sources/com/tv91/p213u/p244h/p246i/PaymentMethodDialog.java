package com.tv91.p213u.p244h.p246i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0420n;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import com.chip.ninetyonetv.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.model.PaymentMethod;
import com.tv91.model.Product;
import com.tv91.p210r.DialogPaymentOptionBinding;
import com.tv91.utils.C3052g;
import java.util.List;
import java.util.Objects;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.i.c0 */
final class PaymentMethodDialog extends BottomSheetDialog {

    /* renamed from: j */
    private final DialogPaymentOptionBinding f15938j;

    /* renamed from: k */
    private final PaymentMethodAdapter f15939k;

    /* renamed from: l */
    private final float f15940l;

    /* renamed from: m */
    private List<PaymentMethod> f15941m;

    /* renamed from: n */
    private String f15942n;

    /* renamed from: com.tv91.u.h.i.c0$a */
    /* compiled from: PaymentMethodDialog */
    private static class C2988a extends C0420n {

        /* renamed from: a */
        private final int f15943a;

        /* renamed from: b */
        private final int f15944b;

        /* renamed from: c */
        private final Rect f15945c = new Rect();

        /* renamed from: d */
        private final Paint f15946d;

        C2988a(int i, int i2) {
            Paint paint = new Paint(1);
            this.f15946d = paint;
            this.f15943a = i;
            this.f15944b = i2;
            paint.setColor(Color.parseColor("#3B3B3B"));
        }

        /* renamed from: e */
        public void mo3469e(Rect rect, View view, RecyclerView recyclerView, C0401a0 a0Var) {
            C0421o layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager);
            int Y = layoutManager.mo3513Y();
            int e0 = recyclerView.mo3219e0(view);
            int i = 0;
            rect.left = 0;
            int i2 = this.f15944b;
            rect.right = e0 % i2 == i2 + -1 ? 0 : this.f15943a;
            rect.top = 0;
            if (Y - e0 >= i2) {
                i = this.f15943a;
            }
            rect.bottom = i;
        }

        /* renamed from: g */
        public void mo3471g(Canvas canvas, RecyclerView recyclerView, C0401a0 a0Var) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                canvas.clipRect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
            }
            C0421o layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager);
            C0421o oVar = layoutManager;
            int childCount = recyclerView.getChildCount();
            int Y = oVar.mo3513Y();
            for (int i = 0; i < childCount; i++) {
                oVar.mo3502P(recyclerView.getChildAt(i), this.f15945c);
                int i2 = this.f15944b;
                if (i % i2 != i2 - 1) {
                    Rect rect = this.f15945c;
                    int i3 = rect.right;
                    float f = (float) i3;
                    float f2 = (float) rect.top;
                    int i4 = this.f15943a;
                    canvas.drawRect(f, f2, (float) (i3 + i4), (float) (rect.bottom + i4), this.f15946d);
                }
                if (Y - i >= this.f15944b) {
                    Rect rect2 = this.f15945c;
                    float f3 = (float) rect2.left;
                    int i5 = rect2.bottom;
                    canvas.drawRect(f3, (float) i5, (float) rect2.right, (float) (i5 + this.f15943a), this.f15946d);
                }
            }
            canvas.restore();
        }
    }

    PaymentMethodDialog(Context context) {
        this(context, 0);
    }

    /* renamed from: k */
    private String m20312k(Product product) {
        return getContext().getString(R.string.payment_dialog_title, new Object[]{product.getTitle()});
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void mo18437o(Consumer aVar, PaymentMethod paymentMethod) {
        if (C3052g.m20586g(paymentMethod.getNameExtra())) {
            dismiss();
            aVar.mo4887a(paymentMethod);
            return;
        }
        new C2317a(getContext()).mo16911y(paymentMethod.getName()).mo16900n(paymentMethod.getNameExtra()).mo16909w(R.string.dialog_button_confirm, new C3006r(aVar, paymentMethod)).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo18438q(View view) {
        dismiss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15938j.f14540d.setAdapter(this.f15939k);
        this.f15938j.f14540d.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f15938j.f14540d.mo3244h(new C2988a((int) this.f15940l, 3));
        this.f15938j.f14541e.setText(this.f15942n);
        this.f15939k.mo16842x(this.f15941m);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f15938j.f14539c.setOnClickListener(Clicks.m17391a(new C3005q(this)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public PaymentMethodDialog mo18439r(Product product) {
        this.f15941m = product.paymentMethods;
        this.f15942n = m20312k(product);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public PaymentMethodDialog mo18440s(Consumer<PaymentMethod> aVar) {
        this.f15939k.mo16838H(new C3007s(this, aVar));
        return this;
    }

    public void show() {
        List<PaymentMethod> list = this.f15941m;
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException();
        }
        super.show();
    }

    PaymentMethodDialog(Context context, int i) {
        super(context, i);
        setContentView((int) R.layout.dialog_payment_option);
        View findViewById = findViewById(R.id.dialog_payment_option);
        Objects.requireNonNull(findViewById);
        this.f15938j = DialogPaymentOptionBinding.m17778b(findViewById);
        this.f15939k = new PaymentMethodAdapter();
        this.f15940l = getContext().getResources().getDisplayMetrics().density;
    }
}
