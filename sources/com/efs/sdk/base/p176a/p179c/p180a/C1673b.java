package com.efs.sdk.base.p176a.p179c.p180a;

import android.text.TextUtils;
import com.efs.sdk.base.p176a.p181d.C1682a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.efs.sdk.base.a.c.a.b */
public final class C1673b {

    /* renamed from: a */
    public int f11315a = -1;

    /* renamed from: b */
    String f11316b = "https://";

    /* renamed from: c */
    String f11317c = "errlog.umeng.com";

    /* renamed from: d */
    public Map<String, Double> f11318d = new HashMap();

    /* renamed from: e */
    public Map<String, String> f11319e = new HashMap();

    /* renamed from: f */
    private Boolean f11320f = null;

    private C1673b() {
    }

    /* renamed from: a */
    static C1673b m14181a() {
        C1673b bVar = new C1673b();
        if (C1682a.m14214a().f11305i) {
            bVar.f11317c = "errlogos.umeng.com";
        } else {
            bVar.f11317c = "errlog.umeng.com";
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9638a(Map<String, String> map) {
        String str = "gate_way";
        if (map.containsKey(str)) {
            String str2 = (String) map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                this.f11317c = str2;
            }
        }
        String str3 = "gate_way_https";
        if (map.containsKey(str3)) {
            String str4 = (String) map.get(str3);
            if (!TextUtils.isEmpty(str4)) {
                this.f11316b = Boolean.parseBoolean(str4) ? "https://" : "http://";
            }
        }
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = "data_sampling_rate_";
            String str7 = "file_sampling_rate_";
            if (str5.startsWith(str6) || str5.startsWith(str7)) {
                String str8 = "";
                String replace = str5.replace(str6, str8).replace(str7, str8);
                double d = 100.0d;
                try {
                    d = Double.parseDouble((String) entry.getValue());
                } catch (Throwable unused) {
                }
                hashMap.put(replace, Double.valueOf(d));
            }
        }
        this.f11318d = hashMap;
        this.f11319e = map;
    }
}
