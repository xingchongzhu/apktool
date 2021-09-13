package com.tv91.p213u.p237f.p238c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.UmengObserver;
import com.tv91.model.Feedback;
import com.tv91.p210r.ViewFeedbackDetailBinding;
import com.tv91.p213u.p237f.p239d.FeedbackModel;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.KeyedFragment;
import com.tv91.p252x.Navigator;
import com.tv91.utils.Dates;

/* renamed from: com.tv91.u.f.c.p */
public final class FeedbackDetailFragment extends KeyedFragment {

    /* renamed from: d0 */
    private FeedbackModel f15728d0;

    /* renamed from: e0 */
    private ViewFeedbackDetailBinding f15729e0;

    /* renamed from: com.tv91.u.f.c.p$a */
    /* compiled from: FeedbackDetailFragment */
    public static final class C2887a extends FragmentKey {
        public static final Creator<C2887a> CREATOR = new C2888a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final FeedbackModel f15730b;

        /* renamed from: com.tv91.u.f.c.p$a$a */
        /* compiled from: FeedbackDetailFragment */
        static class C2888a implements Creator<C2887a> {
            C2888a() {
            }

            /* renamed from: a */
            public C2887a createFromParcel(Parcel parcel) {
                return new C2887a(parcel);
            }

            /* renamed from: b */
            public C2887a[] newArray(int i) {
                return new C2887a[i];
            }
        }

        public C2887a(Feedback feedback) {
            super("客服回覆頁面");
            this.f15730b = new FeedbackModel(feedback);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new FeedbackDetailFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(0, R.anim.exit_to_right);
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            xVar.mo2944r(R.anim.enter_from_right, 0);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f15730b, 1);
        }

        protected C2887a(Parcel parcel) {
            super(parcel);
            this.f15730b = (FeedbackModel) parcel.readParcelable(FeedbackModel.class.getClassLoader());
        }
    }

    public FeedbackDetailFragment() {
        super(R.layout.view_feedback_detail);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ void mo18201n2() {
        Navigator.m20631b(this).mo18587d();
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        C2887a aVar = (C2887a) mo18584l2();
        mo132b().mo2999a(new UmengObserver(aVar.mo18581m()));
        this.f15728d0 = aVar.f15730b;
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        String str = "yyyy/MM/dd";
        this.f15729e0.f14373e.setText(Dates.m20557b(this.f15728d0.f15750c, str));
        int indexOf = this.f15728d0.f15749b.indexOf(":\n");
        if (indexOf == -1) {
            this.f15729e0.f14372d.setText(this.f15728d0.f15749b);
        } else {
            this.f15729e0.f14372d.setText(this.f15728d0.f15749b.substring(indexOf + 2));
        }
        this.f15729e0.f14375g.setText(Dates.m20557b(this.f15728d0.f15752e, str));
        this.f15729e0.f14374f.setText(this.f15728d0.f15751d);
    }

    /* renamed from: i1 */
    public void mo2444i1(View view, Bundle bundle) {
        super.mo2444i1(view, bundle);
        ViewFeedbackDetailBinding b = ViewFeedbackDetailBinding.m17719b(view);
        this.f15729e0 = b;
        Toolbar gVar = new Toolbar(b.f14378j);
        gVar.mo16828p(R.string.feedback_detail_title);
        gVar.mo16821i(new C2872a(this));
        this.f15729e0.f14372d.setMovementMethod(new ScrollingMovementMethod());
        this.f15729e0.f14374f.setMovementMethod(new ScrollingMovementMethod());
    }
}
