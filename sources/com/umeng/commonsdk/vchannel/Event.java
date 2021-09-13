package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.vchannel.b */
public class Event {

    /* renamed from: a */
    private String f17958a = "_$unknown";

    /* renamed from: b */
    private String f17959b;

    /* renamed from: c */
    private long f17960c = 0;

    /* renamed from: d */
    private long f17961d = 0;

    /* renamed from: e */
    private String f17962e = Constant.f17957j;

    /* renamed from: f */
    private Map<String, Object> f17963f;

    public Event(Context context) {
        this.f17959b = UMGlobalContext.getInstance(context).getProcessName(context);
        this.f17963f = null;
    }

    /* renamed from: a */
    public String mo19593a() {
        return this.f17958a;
    }

    /* renamed from: b */
    public long mo19597b() {
        return this.f17960c;
    }

    /* renamed from: c */
    public Map<String, Object> mo19598c() {
        return this.f17963f;
    }

    /* renamed from: d */
    public JSONObject mo19599d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f17958a);
            jSONObject.put("pn", this.f17959b);
            jSONObject.put("ds", this.f17961d);
            jSONObject.put("ts", this.f17960c);
            Map<String, Object> map = this.f17963f;
            if (map != null && map.size() > 0) {
                for (String str : this.f17963f.keySet()) {
                    jSONObject.put(str, this.f17963f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f17962e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id:");
        sb2.append(this.f17958a);
        String str2 = ",";
        sb2.append(str2);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("pn:");
        sb3.append(this.f17959b);
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("ts:");
        sb4.append(this.f17960c);
        sb4.append(str2);
        sb.append(sb4.toString());
        Map<String, Object> map = this.f17963f;
        if (map != null && map.size() > 0) {
            for (String str3 : this.f17963f.keySet()) {
                Object obj = this.f17963f.get(str3);
                if (obj == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str3);
                    sb5.append(": null");
                    sb5.append(str2);
                    str = sb5.toString();
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str3);
                    sb6.append(": ");
                    sb6.append(obj.toString());
                    sb6.append(str2);
                    str = sb6.toString();
                }
                sb.append(str);
            }
        }
        StringBuilder sb7 = new StringBuilder();
        sb7.append("ds:");
        sb7.append(this.f17961d);
        sb7.append("]");
        sb.append(sb7.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public void mo19595a(String str) {
        this.f17958a = str;
    }

    /* renamed from: a */
    public void mo19594a(long j) {
        this.f17960c = j;
    }

    /* renamed from: a */
    public void mo19596a(Map<String, Object> map) {
        this.f17963f = map;
    }
}
