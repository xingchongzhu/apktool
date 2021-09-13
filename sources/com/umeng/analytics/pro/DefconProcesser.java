package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.q */
public class DefconProcesser {

    /* renamed from: a */
    private static final int f17224a = 0;

    /* renamed from: b */
    private static final int f17225b = 1;

    /* renamed from: c */
    private static final int f17226c = 2;

    /* renamed from: d */
    private static final int f17227d = 3;

    /* renamed from: e */
    private final long f17228e;

    /* renamed from: com.umeng.analytics.pro.q$a */
    /* compiled from: DefconProcesser */
    private static class C3154a {

        /* renamed from: a */
        public static final DefconProcesser f17229a = new DefconProcesser();

        private C3154a() {
        }
    }

    /* renamed from: a */
    public static DefconProcesser m22072a() {
        return C3154a.f17229a;
    }

    /* renamed from: c */
    private JSONArray m22075c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", SessionIdManager.m22133a().mo19196d(UMGlobalContext.getAppContext(null)));
            jSONObject.put(UContent.f16941p, currentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    /* renamed from: b */
    public void mo19163b(JSONObject jSONObject, Context context) {
        String str = UContent.f16922av;
        String str2 = UContent.f16921au;
        int a = mo19161a(context);
        String str3 = UContent.f16939n;
        String str4 = UContent.f16877L;
        if (a == 1) {
            if (jSONObject.has(str4)) {
                jSONObject.remove(str4);
            }
            if (jSONObject.has(str3)) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(str3);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has(str2)) {
                            jSONObject2.remove(str2);
                        }
                        if (jSONObject2.has(str)) {
                            jSONObject2.remove(str);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            UMStoreManager.m21939a(context).mo19094a(false, true);
        } else if (a == 2) {
            if (jSONObject.has(str4)) {
                jSONObject.remove(str4);
            }
            if (jSONObject.has(str3)) {
                jSONObject.remove(str3);
            }
            try {
                jSONObject.put(str3, m22075c());
            } catch (Exception unused2) {
            }
            UMStoreManager.m21939a(context).mo19094a(false, true);
        } else if (a == 3) {
            if (jSONObject.has(str4)) {
                jSONObject.remove(str4);
            }
            jSONObject.remove(str3);
            UMStoreManager.m21939a(context).mo19094a(false, true);
        }
    }

    private DefconProcesser() {
        this.f17228e = 60000;
    }

    /* renamed from: a */
    public int mo19161a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    /* renamed from: a */
    private void m22073a(JSONObject jSONObject, boolean z) {
        if (!z) {
            String str = UContent.f16939n;
            if (jSONObject.has(str)) {
                jSONObject.remove(str);
            }
        }
        String str2 = UContent.f16877L;
        if (jSONObject.has(str2)) {
            jSONObject.remove(str2);
        }
        String str3 = UContent.f16880O;
        if (jSONObject.has(str3)) {
            jSONObject.remove(str3);
        }
        String str4 = "ekv";
        if (jSONObject.has(str4)) {
            jSONObject.remove(str4);
        }
        String str5 = UContent.f16885T;
        if (jSONObject.has(str5)) {
            jSONObject.remove(str5);
        }
        if (jSONObject.has(str2)) {
            jSONObject.remove(str2);
        }
        String str6 = "userlevel";
        if (jSONObject.has(str6)) {
            jSONObject.remove(str6);
        }
    }

    /* renamed from: a */
    public void mo19162a(JSONObject jSONObject, Context context) {
        int a = mo19161a(context);
        if (a == 1) {
            m22073a(jSONObject, true);
            UMStoreManager.m21939a(context).mo19100b(false, true);
        } else if (a == 2) {
            String str = UContent.f16939n;
            jSONObject.remove(str);
            try {
                jSONObject.put(str, m22074b());
            } catch (Exception unused) {
            }
            m22073a(jSONObject, true);
            UMStoreManager.m21939a(context).mo19100b(false, true);
        } else if (a == 3) {
            m22073a(jSONObject, false);
            UMStoreManager.m21939a(context).mo19100b(false, true);
        }
    }

    /* renamed from: b */
    private JSONArray m22074b() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", SessionIdManager.m22133a().mo19188a(UMGlobalContext.getAppContext(null)));
            jSONObject.put(UContent.f16941p, currentTimeMillis);
            jSONObject.put(UContent.f16942q, currentTimeMillis + 60000);
            jSONObject.put("duration", 60000);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
