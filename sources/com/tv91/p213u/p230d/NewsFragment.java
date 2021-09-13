package com.tv91.p213u.p230d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.WebViewHelper;
import com.tv91.p210r.DialogWebviewBinding;
import com.tv91.p210r.LayoutToolbarTextTitleBinding;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.SystemRepository;
import com.tv91.utils.C3052g;
import com.tv91.utils.Parcels;

/* renamed from: com.tv91.u.d.d */
public final class NewsFragment extends Hilt_NewsFragment {

    /* renamed from: A0 */
    private String f15552A0;

    /* renamed from: B0 */
    private boolean f15553B0;

    /* renamed from: x0 */
    SystemRepository f15554x0;

    /* renamed from: y0 */
    String f15555y0;

    /* renamed from: z0 */
    private Navigator f15556z0;

    /* renamed from: com.tv91.u.d.d$a */
    /* compiled from: NewsFragment */
    public static final class C2795a extends FragmentKey {
        public static final Creator<C2795a> CREATOR = new C2796a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f15557b;

        /* renamed from: com.tv91.u.d.d$a$a */
        /* compiled from: NewsFragment */
        static class C2796a implements Creator<C2795a> {
            C2796a() {
            }

            /* renamed from: a */
            public C2795a createFromParcel(Parcel parcel) {
                return new C2795a(parcel);
            }

            /* renamed from: b */
            public C2795a[] newArray(int i) {
                return new C2795a[i];
            }
        }

        public C2795a(boolean z) {
            super("最新消息頁面");
            this.f15557b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new NewsFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            if (!this.f15557b) {
                xVar.mo2944r(0, R.anim.exit_to_right);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (!this.f15557b) {
                xVar.mo2944r(R.anim.enter_from_right, 0);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            Parcels.m20571c(parcel, this.f15557b);
        }

        protected C2795a(Parcel parcel) {
            super(parcel);
            this.f15557b = Parcels.m20569a(parcel);
        }
    }

    /* renamed from: E2 */
    private String m19554E2() {
        return C3052g.m20586g(this.f15554x0.mo18608e()) ? this.f15555y0 : this.f15554x0.mo18608e();
    }

    /* renamed from: F2 */
    private C2795a m19555F2() {
        return (C2795a) mo2382N1().getParcelable("fragment-key-tag");
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo18005H2(View view) {
        mo2599o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo18006J2(View view) {
        this.f15556z0.mo18587d();
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        this.f15556z0 = Navigator.m20631b(this);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append(m19554E2());
        sb.append("news.html");
        this.f15552A0 = sb.toString();
        boolean r = m19555F2().f15557b;
        this.f15553B0 = r;
        if (r) {
            mo2608x2(false);
            return;
        }
        mo132b().mo2999a(new UmengObserver(m19555F2().mo18581m()));
        mo2609y2(1, R.style.AppTheme);
    }

    /* renamed from: N0 */
    public View mo2381N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DialogWebviewBinding d = DialogWebviewBinding.m17793d(layoutInflater, viewGroup, false);
        LayoutToolbarTextTitleBinding yVar = d.f14571c;
        WebViewHelper.m17452b(d.f14572d, this.f15552A0);
        if (this.f15553B0) {
            yVar.mo5604a().setTitle((int) R.string.news_title);
            yVar.mo5604a().setBackground(d.mo5604a().getBackground());
            d.f14570b.setOnClickListener(Clicks.m17391a(new C2793a(this)));
        } else {
            d.mo5604a().setPadding(0, 0, 0, 0);
            yVar.f14685b.setText(R.string.news_title);
            yVar.mo5604a().setNavigationIcon((int) R.drawable.ic_chevron_left_large);
            yVar.mo5604a().setNavigationContentDescription((int) R.string.toolbar_navigation_content);
            yVar.mo5604a().setNavigationOnClickListener(Clicks.m17391a(new C2794b(this)));
            d.f14570b.setVisibility(8);
        }
        return d.mo5604a();
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        if (this.f15553B0) {
            mo2602q2().getWindow().setLayout(-1, -1);
        }
    }

    /* renamed from: s2 */
    public Dialog mo2604s2(Bundle bundle) {
        Dialog s2 = super.mo2604s2(bundle);
        if (this.f15553B0 && VERSION.SDK_INT < 21) {
            s2.requestWindowFeature(1);
        }
        return s2;
    }
}
