package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* renamed from: com.umeng.common.b */
public final class SPHelper {

    /* renamed from: a */
    private static SPHelper f17318a = null;

    /* renamed from: b */
    private static Context f17319b = null;

    /* renamed from: c */
    private static String f17320c = null;

    /* renamed from: d */
    private static final String f17321d = "mobclick_agent_user_";

    /* renamed from: com.umeng.common.b$a */
    /* compiled from: SPHelper */
    private static final class C3169a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final SPHelper f17322a = new SPHelper();

        private C3169a() {
        }
    }

    /* renamed from: a */
    public static synchronized SPHelper m22175a(Context context) {
        SPHelper a;
        synchronized (SPHelper.class) {
            if (f17319b == null && context != null) {
                f17319b = context.getApplicationContext();
            }
            if (f17319b != null) {
                f17320c = context.getPackageName();
            }
            a = C3169a.f17322a;
        }
        return a;
    }

    /* renamed from: e */
    private SharedPreferences m22176e() {
        Context context = f17319b;
        if (context == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f17321d);
        sb.append(f17320c);
        return context.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: b */
    public void mo19229b() {
        SharedPreferences e = m22176e();
        if (e != null) {
            e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    /* renamed from: c */
    public String mo19230c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17319b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* renamed from: d */
    public int mo19231d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17319b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo19227a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Editor edit = m22176e().edit();
            edit.putString("au_p", str);
            edit.putString("au_u", str2);
            edit.commit();
        }
    }

    /* renamed from: a */
    public String[] mo19228a() {
        SharedPreferences e = m22176e();
        if (e == null) {
            return null;
        }
        String string = e.getString("au_p", null);
        String string2 = e.getString("au_u", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        return new String[]{string, string2};
    }

    /* renamed from: a */
    public void mo19226a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17319b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void mo19225a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17319b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }
}
