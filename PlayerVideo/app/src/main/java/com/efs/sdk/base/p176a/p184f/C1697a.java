package com.efs.sdk.base.p176a.p184f;

import com.efs.sdk.base.Constants;

/* renamed from: com.efs.sdk.base.a.f.a */
public final class C1697a {

    /* renamed from: a */
    public String f11371a;

    /* renamed from: b */
    public int f11372b = 2;

    /* renamed from: c */
    public int f11373c = 0;

    /* renamed from: d */
    public String f11374d = Constants.CP_NONE;

    /* renamed from: e */
    public int f11375e = 1;

    /* renamed from: f */
    long f11376f = 0;

    /* renamed from: g */
    int f11377g = 1;

    C1697a(String str, int b) {
        this.f11371a = str;
        if (b <= 0 || 3 < b) {
            throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf(b)));
        } else {
            this.f11372b = b;
        }
    }
}
