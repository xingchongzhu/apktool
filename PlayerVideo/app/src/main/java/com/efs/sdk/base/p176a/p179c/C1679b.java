package com.efs.sdk.base.p176a.p179c;

import com.efs.sdk.base.p176a.p177a.C1651a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.c.b */
public final class C1679b {

    /* renamed from: a */
    public Map<String, Object> f11333a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void mo9651a(String str, Object obj) {
        this.f11333a.put(str, obj);
    }

    /* renamed from: b */
    public final Object mo9652b(String str, Object obj) {
        Object obj2 = this.f11333a.get(str);
        return (obj2 != null || this.f11333a.containsKey(str)) ? obj2 : obj;
    }

    /* renamed from: a */
    public final Map<String, Object> mo9650a() {
        HashMap hashMap = new HashMap(this.f11333a);
        C1651a.m14131a();
        hashMap.put("ctime", Long.valueOf(C1651a.m14134b() / 1000));
        C1651a.m14131a();
        hashMap.put("w_tm", Long.valueOf(C1651a.m14134b() / 1000));
        return hashMap;
    }
}
