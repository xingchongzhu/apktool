package com.efs.sdk.base.p176a.p178b;

import com.efs.sdk.base.p176a.p187h.C1728d;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.b.b */
public final class C1661b {

    /* renamed from: a */
    private ConcurrentHashMap<Byte, C1665e> f11289a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final C1665e mo9626a(byte b) {
        if (!this.f11289a.containsKey(Byte.valueOf(b))) {
            if (b == 1) {
                this.f11289a.putIfAbsent(Byte.valueOf(b), new C1667g());
            } else if (b != 2) {
                String str = "efs.cache";
                C1728d.m14308a(str, "Cache module not support protocol ".concat(String.valueOf(b)), null);
            } else {
                this.f11289a.putIfAbsent(Byte.valueOf(b), new C1664d());
            }
        }
        return (C1665e) this.f11289a.get(Byte.valueOf(b));
    }
}
