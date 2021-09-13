package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.C3202b;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.f */
public class InfoPreference {

    /* renamed from: a */
    private static final String f17579a = "info";

    /* renamed from: b */
    private static final String f17580b = "a_dc";

    /* renamed from: c */
    private static final String f17581c = "bssid";

    /* renamed from: d */
    private static final String f17582d = "ssid";

    /* renamed from: e */
    private static final String f17583e = "a_fcy";

    /* renamed from: f */
    private static final String f17584f = "a_hssid";

    /* renamed from: g */
    private static final String f17585g = "a_ip";

    /* renamed from: h */
    private static final String f17586h = "a_ls";

    /* renamed from: i */
    private static final String f17587i = "a_mac";

    /* renamed from: j */
    private static final String f17588j = "a_nid";

    /* renamed from: k */
    private static final String f17589k = "rssi";

    /* renamed from: l */
    private static final String f17590l = "sta";

    /* renamed from: m */
    private static final String f17591m = "ts";

    /* renamed from: n */
    private static final String f17592n = "wifiinfo";

    /* renamed from: o */
    private static final String f17593o = "ua";

    /* renamed from: a */
    public static JSONArray m22346a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17579a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            String string = sharedPreferences.getString(f17592n, null);
            if (string != null) {
                return new JSONArray(string);
            }
            return null;
        } catch (Exception e) {
            ULog.m22473e(e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static void m22349b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17579a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(f17592n).commit();
        }
    }

    /* renamed from: c */
    public static String m22350c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17579a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(f17593o, null);
        }
        return null;
    }

    /* renamed from: a */
    public static void m22347a(Context context, C3202b bVar) {
        JSONArray jSONArray;
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17579a, 0);
            String str = f17592n;
            String str2 = null;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(str, null);
                if (string == null) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(string);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f17580b, bVar.f17539a);
                jSONObject.put(f17581c, bVar.f17540b);
                jSONObject.put(f17582d, bVar.f17541c);
                jSONObject.put(f17583e, bVar.f17542d);
                jSONObject.put(f17584f, bVar.f17543e);
                jSONObject.put(f17585g, bVar.f17544f);
                jSONObject.put(f17586h, bVar.f17545g);
                jSONObject.put(f17587i, bVar.f17546h);
                jSONObject.put(f17588j, bVar.f17547i);
                jSONObject.put(f17589k, bVar.f17548j);
                jSONObject.put(f17590l, bVar.f17549k);
                jSONObject.put("ts", bVar.f17550l);
                jSONArray.put(jSONObject);
                str2 = jSONArray.toString();
            }
            if (str2 != null) {
                sharedPreferences.edit().putString(str, str2).commit();
            }
        } catch (Exception e) {
            ULog.m22473e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m22348a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17579a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(f17593o, str).commit();
        }
    }
}
