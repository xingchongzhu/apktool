package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.cd */
public abstract class TTransport {
    /* renamed from: a */
    public abstract int mo19066a(byte[] bArr, int i, int i2) throws TTransportException;

    /* renamed from: a */
    public void mo19072a(int i) {
    }

    /* renamed from: a */
    public abstract boolean mo19067a();

    /* renamed from: b */
    public abstract void mo19068b() throws TTransportException;

    /* renamed from: b */
    public void mo19079b(byte[] bArr) throws TTransportException {
        mo19069b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public abstract void mo19069b(byte[] bArr, int i, int i2) throws TTransportException;

    /* renamed from: c */
    public abstract void mo19070c();

    /* renamed from: d */
    public int mo19080d(byte[] bArr, int i, int i2) throws TTransportException {
        int i3 = 0;
        while (i3 < i2) {
            int a = mo19066a(bArr, i + i3, i2 - i3);
            if (a > 0) {
                i3 += a;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot read. Remote side has closed. Tried to read ");
                sb.append(i2);
                sb.append(" bytes, but only got ");
                sb.append(i3);
                sb.append(" bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
                throw new TTransportException(sb.toString());
            }
        }
        return i3;
    }

    /* renamed from: d */
    public void mo19071d() throws TTransportException {
    }

    /* renamed from: f */
    public byte[] mo19076f() {
        return null;
    }

    /* renamed from: g */
    public int mo19077g() {
        return 0;
    }

    /* renamed from: h */
    public int mo19078h() {
        return -1;
    }

    /* renamed from: i */
    public boolean mo19081i() {
        return mo19067a();
    }
}
