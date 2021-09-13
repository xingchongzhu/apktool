package com.bumptech.glide.p174t;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.t.c */
public final class ContentLengthInputStream extends FilterInputStream {

    /* renamed from: a */
    private final long f11240a;

    /* renamed from: b */
    private int f11241b;

    private ContentLengthInputStream(InputStream inputStream, long j) {
        super(inputStream);
        this.f11240a = j;
    }

    /* renamed from: B */
    private int m14056B(int i) throws IOException {
        if (i >= 0) {
            this.f11241b += i;
        } else if (this.f11240a - ((long) this.f11241b) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read all expected data, expected: ");
            sb.append(this.f11240a);
            sb.append(", but read: ");
            sb.append(this.f11241b);
            throw new IOException(sb.toString());
        }
        return i;
    }

    /* renamed from: C */
    public static InputStream m14057C(InputStream inputStream, long j) {
        return new ContentLengthInputStream(inputStream, j);
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f11240a - ((long) this.f11241b), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m14056B(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m14056B(super.read(bArr, i, i2));
    }
}
