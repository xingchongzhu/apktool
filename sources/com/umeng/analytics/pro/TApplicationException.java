package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.ap */
public class TApplicationException extends TException {

    /* renamed from: a */
    public static final int f16735a = 0;

    /* renamed from: b */
    public static final int f16736b = 1;

    /* renamed from: c */
    public static final int f16737c = 2;

    /* renamed from: d */
    public static final int f16738d = 3;

    /* renamed from: e */
    public static final int f16739e = 4;

    /* renamed from: f */
    public static final int f16740f = 5;

    /* renamed from: g */
    public static final int f16741g = 6;

    /* renamed from: h */
    public static final int f16742h = 7;

    /* renamed from: j */
    private static final TStruct f16743j = new TStruct("TApplicationException");

    /* renamed from: k */
    private static final TField f16744k = new TField("message", 11, 1);

    /* renamed from: l */
    private static final TField f16745l = new TField("type", 8, 2);

    /* renamed from: m */
    private static final long f16746m = 1;

    /* renamed from: i */
    protected int f16747i = 0;

    public TApplicationException() {
    }

    /* renamed from: a */
    public int mo18955a() {
        return this.f16747i;
    }

    /* renamed from: b */
    public void mo18956b(TProtocol bpVar) throws TException {
        bpVar.mo19020a(f16743j);
        if (getMessage() != null) {
            bpVar.mo19015a(f16744k);
            bpVar.mo19021a(getMessage());
            bpVar.mo19027c();
        }
        bpVar.mo19015a(f16745l);
        bpVar.mo19013a(this.f16747i);
        bpVar.mo19027c();
        bpVar.mo19029d();
        bpVar.mo19026b();
    }

    /* renamed from: a */
    public static TApplicationException m21625a(TProtocol bpVar) throws TException {
        bpVar.mo19036j();
        String str = null;
        int i = 0;
        while (true) {
            TField l = bpVar.mo19038l();
            byte b = l.f16825b;
            if (b == 0) {
                bpVar.mo19037k();
                return new TApplicationException(i, str);
            }
            short s = l.f16826c;
            if (s != 1) {
                if (s != 2) {
                    TProtocolUtil.m21871a(bpVar, b);
                } else if (b == 8) {
                    i = bpVar.mo19049w();
                } else {
                    TProtocolUtil.m21871a(bpVar, b);
                }
            } else if (b == 11) {
                str = bpVar.mo19052z();
            } else {
                TProtocolUtil.m21871a(bpVar, b);
            }
            bpVar.mo19039m();
        }
    }

    public TApplicationException(int i) {
        this.f16747i = i;
    }

    public TApplicationException(int i, String str) {
        super(str);
        this.f16747i = i;
    }

    public TApplicationException(String str) {
        super(str);
    }
}
