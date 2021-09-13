package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.ce */
public class TTransportException extends TException {

    /* renamed from: a */
    public static final int f16957a = 0;

    /* renamed from: b */
    public static final int f16958b = 1;

    /* renamed from: c */
    public static final int f16959c = 2;

    /* renamed from: d */
    public static final int f16960d = 3;

    /* renamed from: e */
    public static final int f16961e = 4;

    /* renamed from: g */
    private static final long f16962g = 1;

    /* renamed from: f */
    protected int f16963f = 0;

    public TTransportException() {
    }

    /* renamed from: a */
    public int mo19082a() {
        return this.f16963f;
    }

    public TTransportException(int i) {
        this.f16963f = i;
    }

    public TTransportException(int i, String str) {
        super(str);
        this.f16963f = i;
    }

    public TTransportException(String str) {
        super(str);
    }

    public TTransportException(int i, Throwable th) {
        super(th);
        this.f16963f = i;
    }

    public TTransportException(Throwable th) {
        super(th);
    }

    public TTransportException(String str, Throwable th) {
        super(str, th);
    }

    public TTransportException(int i, String str, Throwable th) {
        super(str, th);
        this.f16963f = i;
    }
}
