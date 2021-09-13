package com.tv91.p253y;

import android.content.SharedPreferences;
import com.tv91.utils.C3052g;

/* renamed from: com.tv91.y.d */
public final class SystemPreference implements SystemRepository {

    /* renamed from: a */
    private final SharedPreferences f16089a;

    public SystemPreference(SharedPreferences sharedPreferences) {
        this.f16089a = sharedPreferences;
    }

    /* renamed from: a */
    public void mo18604a(String str) {
        this.f16089a.edit().putString("pref_novel_url", !C3052g.m20586g(str) ? str.toLowerCase() : "").apply();
    }

    /* renamed from: b */
    public void mo18605b(String str) {
        this.f16089a.edit().putString("pref_domain", str).apply();
    }

    /* renamed from: c */
    public int mo18606c() {
        return this.f16089a.getInt("pref_sid", -1);
    }

    /* renamed from: d */
    public void mo18607d(int i) {
        this.f16089a.edit().putInt("pref_sid", i).apply();
    }

    /* renamed from: e */
    public String mo18608e() {
        return this.f16089a.getString("pref_domain", "");
    }

    /* renamed from: f */
    public void mo18609f(String str) {
        this.f16089a.edit().putString("pref_imei", str).apply();
    }

    /* renamed from: g */
    public String mo18610g() {
        return this.f16089a.getString("pref_imei", "000000000000000");
    }
}
