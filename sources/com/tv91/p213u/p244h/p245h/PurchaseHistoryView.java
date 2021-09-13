package com.tv91.p213u.p244h.p245h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C0420n;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.Recyclers;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.C2310i;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.PurchaseHistory;
import com.tv91.p210r.AdapterMoviesBinding;
import com.tv91.p210r.AdapterPurchaseHistoryBinding;
import com.tv91.p210r.ViewPurchaseHistoryBinding;
import com.tv91.p213u.p244h.C2955c;
import com.tv91.p213u.p244h.C2957e;
import com.tv91.utils.Dates;
import com.tv91.utils.Utils;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.h.v */
final class PurchaseHistoryView extends BasicView implements C2957e<PurchaseHistory> {

    /* renamed from: e */
    private final boolean f15927e;

    /* renamed from: f */
    private final ViewPurchaseHistoryBinding f15928f;

    /* renamed from: g */
    private final Toolbar f15929g;

    /* renamed from: h */
    private final C2981b f15930h;

    /* renamed from: com.tv91.u.h.h.v$b */
    /* compiled from: PurchaseHistoryView */
    private static class C2981b extends RecyclerAdapter<PurchaseHistory, ViewHolder<PurchaseHistory>> {

        /* renamed from: e */
        private final boolean f15931e;

        public C2981b(boolean z) {
            this.f15931e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public ViewHolder<PurchaseHistory> mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            if (this.f15931e) {
                return new C2982c(AdapterMoviesBinding.m17716d(layoutInflater, viewGroup, false));
            }
            return new C2983d(AdapterPurchaseHistoryBinding.m17772d(layoutInflater, viewGroup, false));
        }
    }

    /* renamed from: com.tv91.u.h.h.v$c */
    /* compiled from: PurchaseHistoryView */
    private static class C2982c extends ViewHolder<PurchaseHistory> {

        /* renamed from: w */
        private final AdapterMoviesBinding f15932w;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(PurchaseHistory purchaseHistory) {
            this.f13991v.mo18692b(purchaseHistory.movieImg).mo18697g(this.f15932w.f14366b);
            this.f15932w.f14368d.setText(purchaseHistory.movieName);
            this.f15932w.f14367c.setText(mo16849R(R.string.movie_point, Integer.valueOf(purchaseHistory.point)));
        }

        private C2982c(AdapterMoviesBinding gVar) {
            super(gVar);
            this.f15932w = gVar;
            LayoutParams layoutParams = (LayoutParams) gVar.f14366b.getLayoutParams();
            int f = (Utils.m20595f(this.f13990u) - (mo16847P(R.dimen.spacing_normal) * 3)) / 2;
            layoutParams.width = f;
            double d = (double) f;
            Double.isNaN(d);
            layoutParams.height = (int) ((d * 9.0d) / 16.0d);
            gVar.f14366b.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tv91.u.h.h.v$d */
    /* compiled from: PurchaseHistoryView */
    private static class C2983d extends ViewHolder<PurchaseHistory> {

        /* renamed from: w */
        private final AdapterPurchaseHistoryBinding f15933w;

        /* access modifiers changed from: private */
        /* renamed from: U */
        public /* synthetic */ void mo18432V(String str, Bitmap bitmap) {
            this.f15933w.f14516d.setTopDrawable((Drawable) new BitmapDrawable(this.f13990u.getResources(), bitmap));
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(PurchaseHistory purchaseHistory) {
            this.f15933w.f14514b.setText(purchaseHistory.packageName);
            this.f15933w.f14517e.setText(String.valueOf(purchaseHistory.point));
            if (purchaseHistory.movieId == -1) {
                this.f15933w.f14516d.setText(purchaseHistory.movieName);
                this.f15933w.f14516d.setTopDrawable((Drawable) null);
            } else {
                this.f15933w.f14516d.setText(null);
                this.f15933w.f14516d.setTopDrawable(mo16848Q(R.drawable.photo_poster_small));
                this.f13991v.mo18692b(purchaseHistory.movieImg).mo18696f(new C2972o(this));
            }
            this.f15933w.f14518f.setText(Dates.m20556a(purchaseHistory.start));
            this.f15933w.f14515c.setText(Dates.m20556a(purchaseHistory.end));
        }

        private C2983d(AdapterPurchaseHistoryBinding oVar) {
            super(oVar);
            this.f15933w = oVar;
        }
    }

    PurchaseHistoryView(ViewPurchaseHistoryBinding u0Var, C2955c cVar) {
        super(u0Var);
        boolean z = cVar == C2955c.PURCHASE_EXTERNAL;
        this.f15927e = z;
        this.f15928f = u0Var;
        Toolbar gVar = new Toolbar(u0Var.f14641p);
        this.f15929g = gVar;
        C2981b bVar = new C2981b(z);
        this.f15930h = bVar;
        gVar.mo16828p(cVar == C2955c.PURCHASE ? R.string.purchase_history_title : R.string.purchase_history_external_title);
        u0Var.f14637l.setAdapter(bVar);
        if (z) {
            u0Var.f14633h.setVisibility(8);
            u0Var.f14632g.setVisibility(8);
            u0Var.f14634i.setVisibility(8);
            u0Var.f14636k.setVisibility(8);
            u0Var.f14635j.setVisibility(8);
            u0Var.f14637l.setLayoutManager(new GridLayoutManager(this.f13974b, 2));
            return;
        }
        u0Var.f14637l.setLayoutManager(new LinearLayoutManager(this.f13974b));
        if (u0Var.f14637l.getItemDecorationCount() == 0) {
            u0Var.f14637l.mo3244h(m20288q2());
        }
    }

    /* renamed from: q2 */
    private C0420n m20288q2() {
        DividerItemDecoration dVar = new DividerItemDecoration(this.f13974b, 1);
        dVar.mo3817l(mo16814n2(R.drawable.widget_divider_inset));
        return dVar;
    }

    /* renamed from: H */
    public void mo18375H(List<PurchaseHistory> list) {
        if (list.isEmpty()) {
            this.f15928f.f14633h.setVisibility(8);
            this.f15928f.f14632g.setVisibility(8);
            this.f15928f.f14634i.setVisibility(8);
            this.f15928f.f14636k.setVisibility(8);
            this.f15928f.f14635j.setVisibility(8);
            this.f15928f.f14639n.setVisibility(0);
            return;
        }
        if (!this.f15927e) {
            this.f15928f.f14633h.setVisibility(0);
            this.f15928f.f14632g.setVisibility(0);
            this.f15928f.f14634i.setVisibility(0);
            this.f15928f.f14636k.setVisibility(0);
            this.f15928f.f14635j.setVisibility(0);
        }
        this.f15930h.mo16842x(list);
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        Recyclers.m17374d(this.f15928f.f14637l, bundle);
    }

    /* renamed from: S0 */
    public void mo18376S0(Consumer<Object> aVar) {
        C2981b bVar = this.f15930h;
        aVar.getClass();
        bVar.mo16838H(new C2958a(aVar));
    }

    /* renamed from: a */
    public void mo18377a(boolean z) {
        this.f15928f.f14631f.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo18378b(Runnable runnable) {
        this.f15929g.mo16821i(runnable);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15929g.mo16818b();
        Recyclers.m17376f(this.f15928f.f14637l, bundle);
        this.f15930h.mo16843z(false);
        this.f15930h.mo16838H(null);
    }

    /* renamed from: s0 */
    public void mo18379s0(int i, Runnable runnable) {
        this.f15928f.f14637l.mo3254k(C2310i.REACH_BOTTOM.mo16855c(i, runnable));
    }
}
