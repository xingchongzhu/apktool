package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.umeng.analytics.pro.cb */
public class TIOStreamTransport extends TTransport {

    /* renamed from: a */
    protected InputStream f16952a = null;

    /* renamed from: b */
    protected OutputStream f16953b = null;

    protected TIOStreamTransport() {
    }

    /* renamed from: a */
    public int mo19066a(byte[] bArr, int i, int i2) throws TTransportException {
        InputStream inputStream = this.f16952a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new TTransportException(4);
            } catch (IOException e) {
                throw new TTransportException(0, (Throwable) e);
            }
        } else {
            throw new TTransportException(1, "Cannot read from null inputStream");
        }
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
        OutputStream outputStream = this.f16953b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException e) {
                throw new TTransportException(0, (Throwable) e);
            }
        } else {
            throw new TTransportException(1, "Cannot write to null outputStream");
        }
    }

    /* renamed from: c */
    public void mo19070c() {
        InputStream inputStream = this.f16952a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f16952a = null;
        }
        OutputStream outputStream = this.f16953b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.f16953b = null;
        }
    }

    /* renamed from: d */
    public void mo19071d() throws TTransportException {
        OutputStream outputStream = this.f16953b;
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException e) {
                throw new TTransportException(0, (Throwable) e);
            }
        } else {
            throw new TTransportException(1, "Cannot flush null outputStream");
        }
    }

    public TIOStreamTransport(InputStream inputStream) {
        this.f16952a = inputStream;
    }

    public TIOStreamTransport(OutputStream outputStream) {
        this.f16953b = outputStream;
    }

    public TIOStreamTransport(InputStream inputStream, OutputStream outputStream) {
        this.f16952a = inputStream;
        this.f16953b = outputStream;
    }
}
