package com.tv91.features.authentication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.p200n.LoginFragment.C2184a;
import com.tv91.p252x.ActivityKey;
import com.tv91.p252x.Navigator;

public final class AuthActivity extends Hilt_AuthActivity {

    /* renamed from: u */
    private Navigator f13618u;

    /* renamed from: v */
    private int f13619v;

    /* renamed from: com.tv91.features.authentication.AuthActivity$a */
    public static class C2145a extends ActivityKey {
        public static final Creator<C2145a> CREATOR = new C2146a();

        /* renamed from: com.tv91.features.authentication.AuthActivity$a$a */
        static class C2146a implements Creator<C2145a> {
            C2146a() {
            }

            /* renamed from: a */
            public C2145a createFromParcel(Parcel parcel) {
                return new C2145a(parcel);
            }

            /* renamed from: b */
            public C2145a[] newArray(int i) {
                return new C2145a[i];
            }
        }

        public C2145a() {
        }

        /* renamed from: n */
        public Intent mo16474n(Context context) {
            return new Intent(context, AuthActivity.class);
        }

        protected C2145a(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: R */
    private int m16693R() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(this.f13619v);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        setContentView((View) frameLayout);
        return this.f13619v;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.enter_fade, R.anim.exit_to_bottom);
    }

    public void onBackPressed() {
        if (!this.f13618u.mo18587d()) {
            this.f13618u.mo18585a();
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (bundle == null) {
            i = View.generateViewId();
        } else {
            i = bundle.getInt("key-container-id");
        }
        this.f13619v = i;
        this.f13618u = Navigator.m20632f(this, m16693R(), new C2184a());
        overridePendingTransition(R.anim.enter_from_bottom, R.anim.exit_fade);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key-container-id", this.f13619v);
    }
}
