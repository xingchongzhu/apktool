package com.tv91;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.content.ContextCompat;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.p213u.p242g.SplashFragment.C2919a;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.p253y.SystemRepository;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.Permissions;
import com.tv91.utils.Permissions.C3051b;
import com.tv91.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p295h.p296a.Timber;

public final class MainActivity extends Hilt_MainActivity implements C3051b {

    /* renamed from: u */
    SystemRepository f13610u;

    /* renamed from: v */
    private Navigator f13611v;

    /* renamed from: w */
    private int f13612w;

    /* renamed from: x */
    private final String[] f13613x = {"android.permission.READ_PHONE_STATE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: Q */
    private int m16685Q() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(this.f13612w);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        setContentView((View) frameLayout);
        return this.f13612w;
    }

    /* renamed from: R */
    private void m16686R(Navigator hVar) {
        Timber.m24039a("initNavigationHistory %s", Boolean.valueOf(hVar.mo18586c().isEmpty()));
        if (hVar.mo18586c().isEmpty()) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key-navigation-history");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                hVar.mo18588e(new C2919a());
            } else {
                hVar.mo18590i(parcelableArrayListExtra);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m16689U() {
        m16686R(this.f13611v);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m16690V() {
        Permissions.m20574b(this, this, this.f13613x);
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    /* renamed from: i */
    public void mo16467i(List<String> list, List<String> list2, List<String> list3) {
        if (!list3.isEmpty()) {
            new C2317a(this).mo16910x(R.string.perm_request_dialog_title).mo16899m(R.string.perm_rational_message).mo16909w(17039370, new C2143c(this)).mo16902p(17039360, new C2142b(this)).mo16912z();
            return;
        }
        if (list.contains("android.permission.READ_PHONE_STATE") && FragmentUtils.m20581b(this.f13610u.mo18610g(), "000000000000000")) {
            TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(this, TelephonyManager.class);
            if (telephonyManager != null) {
                try {
                    this.f13610u.mo18609f(telephonyManager.getDeviceId());
                } catch (Exception unused) {
                }
            }
        }
        m16686R(this.f13611v);
    }

    public void onBackPressed() {
        if (!this.f13611v.mo18587d()) {
            this.f13611v.mo18585a();
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
        this.f13612w = i;
        this.f13611v = Navigator.m20632f(this, m16685Q(), new FragmentKey[0]);
        if (Utils.m20596g(this)) {
            Permissions.m20574b(this, this, this.f13613x);
        } else {
            new C2317a(this).mo16910x(R.string.dialog_error_title).mo16899m(R.string.E_no_network).mo16908v(R.string.dialog_button_confirm).mo16896j(false).mo16897k(false).mo16906t(new C2144d(this)).mo16912z();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key-container-id", this.f13612w);
    }
}
