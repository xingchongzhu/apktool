package com.tv91.p213u.p231e.p234i;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.tv91.model.PromotionReport;
import com.tv91.p213u.p231e.p234i.PromotionReportFragment.C2840a;
import java.util.List;

/* renamed from: com.tv91.u.e.i.n */
class PromotionPageAdapter extends FragmentStatePagerAdapter {

    /* renamed from: j */
    private final List<PromotionReport> f15634j;

    PromotionPageAdapter(FragmentManager nVar, List<PromotionReport> list) {
        super(nVar, 1);
        this.f15634j = list;
    }

    /* renamed from: c */
    public int mo4064c() {
        return this.f15634j.size();
    }

    /* renamed from: e */
    public CharSequence mo4066e(int i) {
        return ((PromotionReport) this.f15634j.get(i)).name;
    }

    /* renamed from: p */
    public Fragment mo2910p(int i) {
        return new C2840a((PromotionReport) this.f15634j.get(i)).createFragment();
    }
}
