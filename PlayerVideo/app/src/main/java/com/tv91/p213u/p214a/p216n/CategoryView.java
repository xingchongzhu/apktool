package com.tv91.p213u.p214a.p216n;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Category;
import com.tv91.p210r.LayoutToolbarBottomBinding;
import com.tv91.p210r.ViewCategoryBinding;
import com.tv91.p213u.p214a.BottomBarView;
import com.tv91.p213u.p214a.CategoryScreen;
import com.tv91.p213u.p214a.Dashboard;
import com.tv91.utils.FragmentUtils;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.n.r */
final class CategoryView extends BottomBarView implements CategoryScreen {

    /* renamed from: g */
    private final ViewCategoryBinding f14801g;

    /* renamed from: h */
    private final C2389b f14802h;

    /* renamed from: com.tv91.u.a.n.r$a */
    /* compiled from: CategoryView */
    class C2388a implements OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ Consumer f14803a;

        C2388a(Consumer aVar) {
            this.f14803a = aVar;
        }

        public boolean onQueryTextChange(String str) {
            this.f14803a.mo4887a(str);
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.tv91.u.a.n.r$b */
    /* compiled from: CategoryView */
    private static class C2389b extends RecyclerAdapter<Category, C2390c> {
        private C2389b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public C2390c mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            return new C2390c(new TextView(viewGroup.getContext()));
        }

        /* synthetic */ C2389b(C2388a aVar) {
            this();
        }
    }

    /* renamed from: com.tv91.u.a.n.r$c */
    /* compiled from: CategoryView */
    private static class C2390c extends ViewHolder<Category> {

        /* renamed from: w */
        private final TextView f14805w;

        C2390c(TextView textView) {
            super((View) textView);
            this.f14805w = textView;
            MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, mo16845N(40));
            marginLayoutParams.setMargins(mo16845N(5), mo16845N(5), mo16845N(5), mo16845N(5));
            textView.setLayoutParams(marginLayoutParams);
            textView.setBackground(mo16850S(R.color.white_translucent_12, mo16845N(6)));
            textView.setGravity(17);
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(Category category) {
            if (!FragmentUtils.m20586g(category.value)) {
                if (category.value.length() > 10) {
                    this.f14805w.setTextSize(2, 12.0f);
                } else if (category.value.length() > 6) {
                    this.f14805w.setTextSize(2, 14.0f);
                } else {
                    this.f14805w.setTextSize(2, 16.0f);
                }
            }
            this.f14805w.setText(category.value);
        }
    }

    CategoryView(ViewCategoryBinding a0Var) {
        super(Dashboard.CATEGORY, LayoutToolbarBottomBinding.m17824b(a0Var.f14289c));
        this.f14801g = a0Var;
        C2389b bVar = new C2389b(null);
        this.f14802h = bVar;
        a0Var.f14297k.f14685b.setText(R.string.bottom_menu_category);
        a0Var.f14295i.setAdapter(bVar);
        a0Var.f14295i.setLayoutManager(new GridLayoutManager(this.f13974b, 3));
        a0Var.f14295i.setHasFixedSize(true);
        SearchView searchView = a0Var.f14296j;
        searchView.getClass();
        searchView.post(new C2385n(searchView));
    }

    /* renamed from: A1 */
    public void mo17136A1(Runnable runnable) {
        this.f14801g.f14292f.setOnClickListener(Clicks.m17391a(new C2384m(runnable)));
    }

    /* renamed from: B0 */
    public void mo17137B0(List<Category> list) {
        this.f14802h.mo16840J(list);
    }

    /* renamed from: I0 */
    public void mo17138I0(Runnable runnable) {
        this.f14801g.f14293g.setOnClickListener(Clicks.m17391a(new C2383l(runnable)));
    }

    /* renamed from: L0 */
    public void mo17139L0(Runnable runnable) {
        this.f14801g.f14291e.setOnClickListener(Clicks.m17391a(new C2382k(runnable)));
    }

    /* renamed from: X0 */
    public void mo17140X0(Consumer<Category> aVar) {
        this.f14802h.mo16838H(aVar);
    }

    /* renamed from: a */
    public void mo17141a(boolean z) {
        this.f14801g.f14294h.setVisibility(z ? 0 : 8);
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h0 */
    public void mo17142h0(Consumer<String> aVar) {
        this.f14801g.f14296j.setOnQueryTextListener(new C2388a(aVar));
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        super.mo16553h2(bundle);
        this.f14801g.f14296j.setOnQueryTextListener(null);
        this.f14802h.mo16838H(null);
    }
}
