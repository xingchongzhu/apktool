package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMRTLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.p */
public class DataSpliter {
    /* renamed from: a */
    public static JSONObject m22071a(Context context, long j, JSONObject jSONObject) {
        String str = UContent.f16880O;
        String str2 = UContent.f16885T;
        String str3 = "ekv";
        String str4 = "header";
        String str5 = "analytics";
        String str6 = "content";
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!jSONObject.has(str6)) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(str6);
            if (jSONObject3.has(str5)) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject(str5);
                if (jSONObject4.has(str3)) {
                    jSONObject4.remove(str3);
                }
                if (jSONObject4.has(str2)) {
                    jSONObject4.remove(str2);
                }
                if (jSONObject4.has(str)) {
                    jSONObject4.remove(str);
                }
                jSONObject3.put(str5, jSONObject4);
            }
            jSONObject2.put(str6, jSONObject3);
            if (jSONObject.has(str4)) {
                jSONObject2.put(str4, jSONObject.getJSONObject(str4));
            }
            if (m22070a(jSONObject2) <= j) {
                return jSONObject2;
            }
            UMStoreManager.m21939a(context).mo19109i();
            UMStoreManager.m21939a(context).mo19108h();
            UMStoreManager.m21939a(context).mo19100b(true, false);
            UMStoreManager.m21939a(context).mo19091a();
            UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> u-app packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public static long m22070a(JSONObject jSONObject) {
        return (long) jSONObject.toString().getBytes().length;
    }

    /* renamed from: a */
    public static long m22069a(JSONArray jSONArray) {
        return (long) jSONArray.toString().getBytes().length;
    }
}
