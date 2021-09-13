package com.bumptech.glide.p174t;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.t.h */
public class MarkEnforcingInputStream extends FilterInputStream {

    /* renamed from: a */
    private int f11254a = Integer.MIN_VALUE;

    public MarkEnforcingInputStream(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: B */
    private long m14075B(long j) {
        int i = this.f11254a;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE && j > ((long) i)) {
            j = (long) i;
        }
        return j;
    }

    /* renamed from: C */
    private void m14076C(long j) {
        int i = this.f11254a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f11254a = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f11254a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f11254a = i;
    }

    public int read() throws IOException {
        if (m14075B(1) == -1) {
            return -1;
        }
        int read = super.read();
        m14076C(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f11254a = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long B = m14075B(j);
        if (B == -1) {
            return 0;
        }
        long skip = super.skip(B);
        m14076C(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int B = (int) m14075B((long) i2);
        if (B == -1) {
            return -1;
        }
        int read = super.read(bArr, i, B);
        m14076C((long) read);
        return read;
    }
}
