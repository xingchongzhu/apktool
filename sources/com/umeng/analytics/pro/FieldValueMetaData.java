package com.umeng.analytics.pro;

import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.bd */
public class FieldValueMetaData implements Serializable {

    /* renamed from: a */
    private final boolean f16767a;

    /* renamed from: b */
    public final byte f16768b;

    /* renamed from: c */
    private final String f16769c;

    /* renamed from: d */
    private final boolean f16770d;

    public FieldValueMetaData(byte b, boolean z) {
        this.f16768b = b;
        this.f16767a = false;
        this.f16769c = null;
        this.f16770d = z;
    }

    /* renamed from: a */
    public boolean mo19004a() {
        return this.f16767a;
    }

    /* renamed from: b */
    public String mo19005b() {
        return this.f16769c;
    }

    /* renamed from: c */
    public boolean mo19006c() {
        return this.f16768b == 12;
    }

    /* renamed from: d */
    public boolean mo19007d() {
        byte b = this.f16768b;
        return b == 15 || b == 13 || b == 14;
    }

    /* renamed from: e */
    public boolean mo19008e() {
        return this.f16770d;
    }

    public FieldValueMetaData(byte b) {
        this(b, false);
    }

    public FieldValueMetaData(byte b, String str) {
        this.f16768b = b;
        this.f16767a = true;
        this.f16769c = str;
        this.f16770d = false;
    }
}
