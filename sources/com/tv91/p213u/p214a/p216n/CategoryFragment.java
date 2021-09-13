package com.tv91.p213u.p214a.p216n;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.Category;
import com.tv91.model.RankType;
import com.tv91.p210r.ViewCategoryBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p214a.BottomBarFragment;
import com.tv91.p213u.p214a.CategoryScreen;
import com.tv91.p213u.p214a.Dashboard;
import com.tv91.p213u.p214a.p220r.LoadCategoriesUseCase;
import com.tv91.p213u.p223c.p227i.MoviesByCategoryFragment.C2725a;
import com.tv91.p213u.p223c.p227i.MoviesByRankFragment.C2732b;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.utils.C3052g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p295h.p296a.Timber;

/* renamed from: com.tv91.u.a.n.o */
public final class CategoryFragment extends BottomBarFragment<CategoryScreen> {

    /* renamed from: k0 */
    LoadCategoriesUseCase f14797k0;

    /* renamed from: l0 */
    private final ViewSupplier<CategoryScreen> f14798l0 = new ViewSupplier<>(this, C2375d.f14786a);

    /* renamed from: m0 */
    private Navigator f14799m0;

    /* renamed from: n0 */
    private List<Category> f14800n0;

    /* renamed from: com.tv91.u.a.n.o$a */
    /* compiled from: CategoryFragment */
    public static final class C2386a extends FragmentKey {
        public static final Creator<C2386a> CREATOR = new C2387a();

        /* renamed from: com.tv91.u.a.n.o$a$a */
        /* compiled from: CategoryFragment */
        static class C2387a implements Creator<C2386a> {
            C2387a() {
            }

            /* renamed from: a */
            public C2386a createFromParcel(Parcel parcel) {
                return new C2386a(parcel);
            }

            /* renamed from: b */
            public C2386a[] newArray(int i) {
                return new C2386a[i];
            }
        }

        public C2386a() {
            super("影片類別頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new CategoryFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_fade, 0);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (!z) {
                xVar.mo2944r(0, R.anim.exit_fade);
            }
        }

        protected C2386a(Parcel parcel) {
            super(parcel);
        }
    }

    public CategoryFragment() {
        super(R.layout.view_category);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo17192C2(ErrorBundle cVar) {
        Timber.m24041c(cVar.mo17113c());
        ((CategoryScreen) this.f14798l0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* renamed from: D2 */
    static /* synthetic */ CategoryScreen m17953D2(View view) {
        return new CategoryView(ViewCategoryBinding.m17677b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo17193F2() {
        this.f14799m0.mo18588e(new C2732b(RankType.DAY));
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo17194H2() {
        this.f14799m0.mo18588e(new C2732b(RankType.MONTH));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo17195J2() {
        this.f14799m0.mo18588e(new C2732b(RankType.YEAR));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo17196L2(Category category) {
        this.f14799m0.mo18588e(new C2725a(category));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void mo17197N2(String str) {
        ((CategoryScreen) this.f14798l0.mo4947a()).mo17137B0(mo17199u2(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo17200w2() {
        ((CategoryScreen) this.f14798l0.mo4947a()).mo17141a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo17201y2() {
        ((CategoryScreen) this.f14798l0.mo4947a()).mo17141a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo17191A2(List list) {
        CategoryScreen fVar = (CategoryScreen) this.f14798l0.mo4947a();
        this.f14800n0 = list;
        fVar.mo17137B0(list);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f14799m0 = Navigator.m20631b(this);
    }

    /* renamed from: O2 */
    public void mo17198O2() {
        this.f14797k0.mo17322w(new C2374c(this)).mo17321v(new C2373b(this)).mo17323x(new C2381j(this)).mo17320u(new C2372a(this)).mo17316o();
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((CategoryScreen) this.f14798l0.mo4947a()).mo17139L0(new C2380i(this));
        ((CategoryScreen) this.f14798l0.mo4947a()).mo17136A1(new C2378g(this));
        ((CategoryScreen) this.f14798l0.mo4947a()).mo17138I0(new C2379h(this));
        ((CategoryScreen) this.f14798l0.mo4947a()).mo17140X0(new C2376e(this));
        ((CategoryScreen) this.f14798l0.mo4947a()).mo17142h0(new C2377f(this));
        if (this.f14800n0 == null) {
            mo17198O2();
        } else {
            ((CategoryScreen) this.f14798l0.mo4947a()).mo17137B0(this.f14800n0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f14797k0.mo17051a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public Dashboard mo17132n2() {
        return Dashboard.CATEGORY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public ViewSupplier<CategoryScreen> mo17133o2() {
        return this.f14798l0;
    }

    /* renamed from: u2 */
    public List<Category> mo17199u2(String str) {
        List<Category> list;
        List<Category> list2 = this.f14800n0;
        if (list2 == null || list2.isEmpty()) {
            return Collections.emptyList();
        }
        if (C3052g.m20586g(str)) {
            list = this.f14800n0;
        } else {
            List<Category> arrayList = new ArrayList<>();
            for (Category category : this.f14800n0) {
                if (category.value.contains(str.toLowerCase())) {
                    arrayList.add(category);
                }
            }
            list = arrayList;
        }
        return list;
    }
}
