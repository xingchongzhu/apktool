package com.efs.sdk.base.p176a.p191i;

import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.i.g */
public final class C1740g extends C1733a {

    /* renamed from: b */
    private ConcurrentHashMap<String, C1741a> f11433b = new ConcurrentHashMap<>(10);

    /* renamed from: com.efs.sdk.base.a.i.g$a */
    static class C1741a {

        /* renamed from: a */
        String f11434a;

        /* renamed from: b */
        String f11435b;

        /* renamed from: c */
        String f11436c;

        /* renamed from: d */
        AtomicInteger f11437d = new AtomicInteger(0);

        C1741a(String str, String str2, String str3) {
            this.f11434a = str;
            this.f11435b = str2;
            this.f11436c = str3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9712a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str4 = "_";
        sb.append(str4);
        sb.append(str2);
        sb.append(str4);
        sb.append(str3.trim());
        String sb2 = sb.toString();
        if (!this.f11433b.containsKey(sb2) || this.f11433b.get(sb2) == null) {
            this.f11433b.putIfAbsent(sb2, new C1741a(str, str2, str3));
        }
        ((C1741a) this.f11433b.get(sb2)).f11437d.incrementAndGet();
    }

    /* renamed from: a */
    public final void mo9697a() {
        try {
            if (this.f11415a != null) {
                for (Entry value : this.f11433b.entrySet()) {
                    C1741a aVar = (C1741a) value.getValue();
                    int i = aVar.f11437d.get();
                    if (i > 0) {
                        C1682a aVar2 = this.f11415a;
                        String str = aVar.f11434a;
                        String str2 = aVar.f11435b;
                        String str3 = aVar.f11436c;
                        C1734b bVar = new C1734b("efs_core", "req_succ_rate", C1739a.f11432a.f11428a.f11422c);
                        bVar.put("rep_code", str);
                        bVar.put("px_code", str2);
                        bVar.put("path", str3);
                        bVar.put("cnt", Integer.valueOf(i));
                        aVar2.mo9654a(bVar);
                        aVar.f11437d.addAndGet(i * -1);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
