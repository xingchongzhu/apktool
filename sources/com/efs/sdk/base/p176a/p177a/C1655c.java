package com.efs.sdk.base.p176a.p177a;

import android.text.TextUtils;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.C1730f;
import com.efs.sdk.base.p176a.p187h.p190c.C1726a;
import com.efs.sdk.base.p176a.p187h.p190c.C1727b;
import com.umeng.analytics.pro.UMCommonContent;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: com.efs.sdk.base.a.a.c */
public final class C1655c {

    /* renamed from: a */
    String f11271a;

    /* renamed from: b */
    String f11272b;

    /* renamed from: c */
    String f11273c;

    /* renamed from: d */
    public String f11274d;

    /* renamed from: e */
    public int f11275e;

    /* renamed from: f */
    public String f11276f;

    /* renamed from: g */
    public byte f11277g;

    /* renamed from: h */
    public String f11278h;

    /* renamed from: i */
    String f11279i;

    /* renamed from: j */
    String f11280j;

    /* renamed from: k */
    String f11281k;

    /* renamed from: l */
    public long f11282l = 0;

    /* renamed from: a */
    public static C1655c m14141a() {
        C1655c cVar = new C1655c();
        cVar.f11271a = C1682a.m14214a().f11297a;
        cVar.f11272b = C1682a.m14214a().f11298b;
        cVar.f11281k = C1682a.m14214a().f11304h;
        cVar.f11280j = BuildConfig.VERSION_NAME;
        cVar.f11273c = C1730f.m14314a(C1682a.m14214a().f11299c);
        cVar.f11279i = String.valueOf(C1674c.m14183a().f11324d.f11315a);
        return cVar;
    }

    /* renamed from: b */
    public final String mo9622b() {
        C1651a.m14131a();
        String valueOf = String.valueOf(C1651a.m14134b() / 1000);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11281k);
        sb.append(valueOf);
        String a = C1727b.m14304a(C1726a.m14300a(sb.toString(), this.f11272b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.f11271a);
        treeMap.put("sd", a);
        if (!TextUtils.isEmpty(this.f11274d)) {
            treeMap.put("cp", this.f11274d);
        }
        if (this.f11277g != 0) {
            treeMap.put("de", String.valueOf(this.f11275e));
            treeMap.put("type", this.f11278h);
            String str = this.f11276f;
            if (TextUtils.isEmpty(str)) {
                C1651a.m14131a();
                long b = C1651a.m14134b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", new Object[]{Long.valueOf(b), Integer.valueOf(new Random(b).nextInt(10000))});
            }
            treeMap.put("seq", str);
        }
        treeMap.put("cver", this.f11279i);
        treeMap.put(UMCommonContent.f16662x, "android");
        treeMap.put("sver", this.f11279i);
        treeMap.put("tm", valueOf);
        treeMap.put("ver", this.f11273c);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (Entry entry : treeMap.entrySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append((String) entry.getKey());
            sb4.append("=");
            sb4.append((String) entry.getValue());
            String sb5 = sb4.toString();
            sb3.append(sb5);
            sb2.append(sb5);
            sb2.append("&");
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb3.toString());
        sb6.append(this.f11272b);
        String a2 = C1727b.m14303a(sb6.toString());
        sb2.append("sign=");
        sb2.append(a2);
        return C1727b.m14305b(sb2.toString());
    }
}
