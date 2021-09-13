package com.tv91.p213u.p214a;

import com.chip.ninetyonetv.R;

/* renamed from: com.tv91.u.a.h */
public enum Dashboard {
    HOME(R.id.bottom_menu_home, R.drawable.ic_home_full),
    CATEGORY(R.id.bottom_menu_category, R.drawable.ic_window_full),
    ACTOR(R.id.bottom_menu_actress, R.drawable.ic_woman_full),
    PROMOTION(R.id.bottom_menu_promotion, R.drawable.ic_star_full),
    PROFILE(R.id.bottom_menu_profile, R.drawable.ic_user_full);
    

    /* renamed from: g */
    public final int f14739g;

    /* renamed from: h */
    public final int f14740h;

    private Dashboard(int i, int i2) {
        this.f14739g = i;
        this.f14740h = i2;
    }

    /* renamed from: a */
    public static Dashboard m17882a(int i) {
        Dashboard[] values;
        for (Dashboard hVar : values()) {
            if (hVar.f14739g == i) {
                return hVar;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown id ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
