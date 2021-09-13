package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.cc */
public final class TMemoryInputTransport extends TTransport {

    /* renamed from: a */
    private byte[] f16954a;

    /* renamed from: b */
    private int f16955b;

    /* renamed from: c */
    private int f16956c;

    public TMemoryInputTransport() {
    }

    /* renamed from: a */
    public void mo19073a(byte[] bArr) {
        mo19074c(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo19067a() {
        return true;
    }

    /* renamed from: b */
    public void mo19068b() throws TTransportException {
    }

    /* renamed from: b */
    public void mo19069b(byte[] bArr, int i, int i2) throws TTransportException {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    /* renamed from: c */
    public void mo19070c() {
    }

    /* renamed from: c */
    public void mo19074c(byte[] bArr, int i, int i2) {
        this.f16954a = bArr;
        this.f16955b = i;
        this.f16956c = i + i2;
    }

    /* renamed from: e */
    public void mo19075e() {
        this.f16954a = null;
    }

    /* renamed from: f */
    public byte[] mo19076f() {
        return this.f16954a;
    }

    /* renamed from: g */
    public int mo19077g() {
        return this.f16955b;
    }

    /* renamed from: h */
    public int mo19078h() {
        return this.f16956c - this.f16955b;
    }

    public TMemoryInputTransport(byte[] bArr) {
        mo19073a(bArr);
    }

    /* renamed from: a */
    public int mo19066a(byte[] bArr, int i, int i2) throws TTransportException {
        int h = mo19078h();
        if (i2 > h) {
            i2 = h;
        }
        if (i2 > 0) {
            System.arraycopy(this.f16954a, this.f16955b, bArr, i, i2);
            mo19072a(i2);
        }
        return i2;
    }

    public TMemoryInputTransport(byte[] bArr, int i, int i2) {
        mo19074c(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo19072a(int i) {
        this.f16955b += i;
    }
}
