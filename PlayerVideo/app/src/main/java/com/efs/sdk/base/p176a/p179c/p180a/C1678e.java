package com.efs.sdk.base.p176a.p179c.p180a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.p176a.p179c.C1670a;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p183e.C1686b;
import com.efs.sdk.base.p176a.p183e.C1694f.C1696a;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p190c.C1727b;
import java.io.File;
import java.util.Map.Entry;

/* renamed from: com.efs.sdk.base.a.c.a.e */
public final class C1678e implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    volatile SharedPreferences f11332a;

    /* renamed from: b */
    static void m14205b() {
        File a = C1713a.m14261a(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a);
        if (a.exists()) {
            a.delete();
        }
    }

    /* renamed from: d */
    private void m14206d() {
        if (this.f11332a == null) {
            synchronized (C1686b.class) {
                if (this.f11332a == null) {
                    String str = C1682a.m14214a().f11297a;
                    StringBuilder sb = new StringBuilder("config_");
                    sb.append(str.toLowerCase());
                    this.f11332a = SharedPreferencesUtils.getSharedPreferences(C1682a.m14214a().f11299c, C1727b.m14304a(sb.toString().getBytes()));
                    this.f11332a.registerOnSharedPreferenceChangeListener(this);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo9647a(C1673b bVar) {
        mo9648c();
        if (this.f11332a == null) {
            return false;
        }
        Editor edit = this.f11332a.edit();
        edit.clear();
        edit.putInt("cver", bVar.f11315a);
        edit.putLong("last_refresh_time", System.currentTimeMillis());
        for (Entry entry : bVar.f11319e.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        edit.apply();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo9648c() {
        try {
            m14206d();
        } catch (Throwable th) {
            C1728d.m14309b("efs.config", "init sharedpreferences error", th);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!C1696a.f11370a.mo9665a()) {
            C1674c.m14183a().mo9642b();
        }
    }

    /* renamed from: a */
    static boolean m14204a() {
        C1670a a = C1682a.m14214a();
        File b = C1713a.m14263b(a.f11299c, a.f11297a);
        if (!b.exists()) {
            return false;
        }
        C1719b.m14282b(b);
        return true;
    }
}
