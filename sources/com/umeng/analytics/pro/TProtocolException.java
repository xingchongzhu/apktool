package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.bq */
public class TProtocolException extends TException {

    /* renamed from: a */
    public static final int f16840a = 0;

    /* renamed from: b */
    public static final int f16841b = 1;

    /* renamed from: c */
    public static final int f16842c = 2;

    /* renamed from: d */
    public static final int f16843d = 3;

    /* renamed from: e */
    public static final int f16844e = 4;

    /* renamed from: f */
    public static final int f16845f = 5;

    /* renamed from: h */
    private static final long f16846h = 1;

    /* renamed from: g */
    protected int f16847g = 0;

    public TProtocolException() {
    }

    /* renamed from: a */
    public int mo19063a() {
        return this.f16847g;
    }

    public TProtocolException(int i) {
        this.f16847g = i;
    }

    public TProtocolException(int i, String str) {
        super(str);
        this.f16847g = i;
    }

    public TProtocolException(String str) {
        super(str);
    }

    public TProtocolException(int i, Throwable th) {
        super(th);
        this.f16847g = i;
    }

    public TProtocolException(Throwable th) {
        super(th);
    }

    public TProtocolException(String str, Throwable th) {
        super(str, th);
    }

    public TProtocolException(int i, String str, Throwable th) {
        super(str, th);
        this.f16847g = i;
    }
}
