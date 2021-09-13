package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InputStream;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: com.google.android.exoplayer2.upstream.o */
public final class DataSourceInputStream extends InputStream {

    /* renamed from: a */
    private final C1916m f12339a;

    /* renamed from: b */
    private final DataSpec f12340b;

    /* renamed from: c */
    private final byte[] f12341c;

    /* renamed from: d */
    private boolean f12342d = false;

    /* renamed from: e */
    private boolean f12343e = false;

    /* renamed from: f */
    private long f12344f;

    public DataSourceInputStream(C1916m mVar, DataSpec pVar) {
        this.f12339a = mVar;
        this.f12340b = pVar;
        this.f12341c = new byte[1];
    }

    /* renamed from: B */
    private void m15083B() throws IOException {
        if (!this.f12342d) {
            this.f12339a.mo7015e(this.f12340b);
            this.f12342d = true;
        }
    }

    /* renamed from: C */
    public void mo14940C() throws IOException {
        m15083B();
    }

    public void close() throws IOException {
        if (!this.f12343e) {
            this.f12339a.close();
            this.f12343e = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f12341c) == -1) {
            return -1;
        }
        return this.f12341c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        Assertions.m10154f(!this.f12343e);
        m15083B();
        int b = this.f12339a.mo6195b(bArr, i, i2);
        if (b == -1) {
            return -1;
        }
        this.f12344f += (long) b;
        return b;
    }
}
