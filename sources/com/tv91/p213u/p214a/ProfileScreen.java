package com.tv91.p213u.p214a;

import android.content.Context;
import com.chip.ninetyonetv.R;

/* renamed from: com.tv91.u.a.j */
public enum ProfileScreen {
    GAP(-1),
    ACCOUNT(R.string.profile_menu_account),
    OPEN_VIP(R.string.profile_menu_open_vip),
    VIP(R.string.profile_vip_date),
    VERIFICATION_OFF(R.string.profile_menu_mobile_verification_off),
    VERIFICATION_ON(R.string.profile_menu_mobile_verification_on),
    DEPOSIT_HISTORY(R.string.profile_menu_payment_history),
    FAVORITE(R.string.profile_menu_favorite),
    PURCHASE_HISTORY(R.string.profile_menu_purchase_history),
    PURCHASE_HISTORY_EXTERNAL(R.string.profile_menu_purchase_history_external),
    MOVIE_DOWNLOAD(R.string.profile_menu_download),
    NEWS(R.string.profile_menu_news),
    CUSTOMER_SERVICE(R.string.profile_menu_customer_service),
    MODIFY_PASSWORD(R.string.profile_menu_modify_password),
    LOGOUT(R.string.profile_menu_logout),
    VERSION(R.string.profile_menu_version);
    

    /* renamed from: r */
    private final int f14758r;

    /* renamed from: s */
    private String f14759s;

    private ProfileScreen(int i) {
        this.f14759s = "";
        this.f14758r = i;
    }

    /* renamed from: a */
    public String mo17148a() {
        return this.f14759s;
    }

    /* renamed from: b */
    public ProfileScreen mo17149b(Context context, Object... objArr) {
        this.f14759s = context.getString(this.f14758r, objArr);
        return this;
    }
}
