package com.tv91.p213u.p244h.p247j;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0420n;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.features.shared.widget.NoScrollGridLayoutManager;
import com.tv91.model.PurchasePackage;
import com.tv91.model.PurchaseType;
import com.tv91.p210r.LayoutPurchaseDetailBinding;
import com.tv91.p210r.ViewPurchaseBinding;
import com.tv91.p213u.p244h.PurchaseScreen;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.j.u */
final class PurchaseView extends BasicView implements PurchaseScreen {

    /* renamed from: e */
    private final ViewPurchaseBinding f16021e;

    /* renamed from: f */
    private final Toolbar f16022f;

    /* renamed from: g */
    private final C3034c f16023g;

    /* renamed from: com.tv91.u.h.j.u$a */
    /* compiled from: PurchaseView */
    class C3032a extends C0420n {

        /* renamed from: a */
        final /* synthetic */ int f16024a;

        C3032a(int i) {
            this.f16024a = i;
        }

        /* renamed from: e */
        public void mo3469e(Rect rect, View view, RecyclerView recyclerView, C0401a0 a0Var) {
            int i = this.f16024a;
            rect.set(i, i, i, i);
        }
    }

    /* renamed from: com.tv91.u.h.j.u$b */
    /* compiled from: PurchaseView */
    static /* synthetic */ class C3033b {

        /* renamed from: a */
        static final /* synthetic */ int[] f16026a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tv91.model.PurchaseType[] r0 = com.tv91.model.PurchaseType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16026a = r0
                com.tv91.model.PurchaseType r1 = com.tv91.model.PurchaseType.SINGLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16026a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.model.PurchaseType r1 = com.tv91.model.PurchaseType.WEEK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16026a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.model.PurchaseType r1 = com.tv91.model.PurchaseType.MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16026a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tv91.model.PurchaseType r1 = com.tv91.model.PurchaseType.DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16026a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tv91.model.PurchaseType r1 = com.tv91.model.PurchaseType.SEASON     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16026a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tv91.model.PurchaseType r1 = com.tv91.model.PurchaseType.YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p244h.p247j.PurchaseView.C3033b.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.u.h.j.u$c */
    /* compiled from: PurchaseView */
    private static class C3034c extends RecyclerAdapter<PurchasePackage, C3035d> {
        private C3034c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C3035d mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C3035d(LayoutPurchaseDetailBinding.m17818d(layoutInflater, viewGroup, false));
        }

        /* synthetic */ C3034c(C3032a aVar) {
            this();
        }
    }

    /* renamed from: com.tv91.u.h.j.u$d */
    /* compiled from: PurchaseView */
    private static class C3035d extends ViewHolder<PurchasePackage> {

        /* renamed from: w */
        private final LayoutPurchaseDetailBinding f16027w;

        C3035d(LayoutPurchaseDetailBinding vVar) {
            super(vVar);
            this.f16027w = vVar;
            vVar.mo5604a().setBackground(mo16850S(R.color.white_translucent_12, mo16845N(5)));
        }

        /* renamed from: U */
        private int m20481U(PurchaseType purchaseType) {
            switch (C3033b.f16026a[purchaseType.ordinal()]) {
                case 1:
                    return R.string.purchase_single_description;
                case 2:
                    return R.string.purchase_week_description;
                case 3:
                    return R.string.purchase_month_description;
                case 4:
                    return R.string.purchase_download_description;
                case 5:
                    return R.string.purchase_season_description;
                case 6:
                    return R.string.purchase_year_description;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown PurchaseType ");
                    sb.append(purchaseType.name());
                    throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(PurchasePackage purchasePackage) {
            this.f16027w.f14644c.setText(purchasePackage.name);
            this.f16027w.f14643b.setText(m20481U(purchasePackage.type));
            this.f16027w.f14645d.setText(mo16849R(R.string.purchase_point, Integer.valueOf(purchasePackage.point)));
            this.f16027w.f14647f.setText(mo16849R(R.string.purchase_deposit_price, Double.valueOf(purchasePackage.price)));
        }
    }

    PurchaseView(ViewPurchaseBinding t0Var) {
        super(t0Var);
        this.f16021e = t0Var;
        Toolbar gVar = new Toolbar(t0Var.f14620i);
        this.f16022f = gVar;
        C3034c cVar = new C3034c(null);
        this.f16023g = cVar;
        gVar.mo16828p(R.string.purchase_title);
        t0Var.f14613b.setLayoutManager(new NoScrollGridLayoutManager(this.f13974b, 2));
        t0Var.f14613b.setAdapter(cVar);
        t0Var.f14613b.mo3244h(m20467q2());
    }

    /* renamed from: q2 */
    private C0420n m20467q2() {
        return new C3032a(mo16813m2(R.dimen.spacing_normal));
    }

    /* renamed from: F0 */
    public void mo18389F0(int i) {
        this.f16021e.f14617f.setText(mo16815o2(R.string.profile_point, Integer.valueOf(i)));
    }

    /* renamed from: K1 */
    public void mo18390K1(Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.purchase_dialog_success_title).mo16899m(R.string.purchase_dialog_success_message).mo16908v(R.string.dialog_button_confirm).mo16906t(runnable).mo16912z();
    }

    /* renamed from: M0 */
    public void mo18391M0(Consumer<PurchasePackage> aVar) {
        this.f16023g.mo16838H(aVar);
    }

    /* renamed from: S1 */
    public void mo18392S1(String str) {
        new C2317a(this.f13974b).mo16910x(R.string.purchase_dialog_failure_title).mo16900n(str).mo16908v(R.string.dialog_button_confirm).mo16912z();
    }

    /* renamed from: a */
    public void mo18393a(boolean z) {
        this.f16021e.f14615d.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo18394b(Runnable runnable) {
        this.f16022f.mo16821i(runnable);
    }

    /* renamed from: c2 */
    public void mo18395c2(List<PurchasePackage> list) {
        this.f16023g.mo16842x(list);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        new C2317a(this.f13974b).mo16910x(R.string.purchase_dialog_failure_title).mo16900n(str).mo16908v(R.string.dialog_button_confirm).mo16912z();
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f16022f.mo16818b();
        this.f16023g.mo16838H(null);
    }

    /* renamed from: m1 */
    public void mo18396m1(int i, Runnable runnable) {
        new C2317a(this.f13974b).mo16910x(R.string.purchase_confirm_dialog_title).mo16900n(mo16815o2(R.string.purchase_confirm_dialog_message, Integer.valueOf(i))).mo16909w(R.string.dialog_button_confirm, runnable).mo16901o(R.string.dialog_button_cancel).mo16912z();
    }
}
