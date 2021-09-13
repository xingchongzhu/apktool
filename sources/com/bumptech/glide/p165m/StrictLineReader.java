package com.bumptech.glide.p165m;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.m.b */
class StrictLineReader implements Closeable {

    /* renamed from: a */
    private final InputStream f11017a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Charset f11018b;

    /* renamed from: c */
    private byte[] f11019c;

    /* renamed from: d */
    private int f11020d;

    /* renamed from: e */
    private int f11021e;

    /* renamed from: com.bumptech.glide.m.b$a */
    /* compiled from: StrictLineReader */
    class C1612a extends ByteArrayOutputStream {
        C1612a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, StrictLineReader.this.f11018b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public StrictLineReader(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: C */
    private void m13649C() throws IOException {
        InputStream inputStream = this.f11017a;
        byte[] bArr = this.f11019c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f11020d = 0;
            this.f11021e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: D */
    public boolean mo9344D() {
        return this.f11021e == -1;
    }

    /* renamed from: E */
    public String mo9345E() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f11017a) {
            if (this.f11019c != null) {
                if (this.f11020d >= this.f11021e) {
                    m13649C();
                }
                for (int i3 = this.f11020d; i3 != this.f11021e; i3++) {
                    byte[] bArr2 = this.f11019c;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.f11020d) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.f11019c;
                                int i4 = this.f11020d;
                                String str = new String(bArr3, i4, i2 - i4, this.f11018b.name());
                                this.f11020d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.f11019c;
                        int i42 = this.f11020d;
                        String str2 = new String(bArr32, i42, i2 - i42, this.f11018b.name());
                        this.f11020d = i3 + 1;
                        return str2;
                    }
                }
                C1612a aVar = new C1612a((this.f11021e - this.f11020d) + 80);
                loop1:
                while (true) {
                    byte[] bArr4 = this.f11019c;
                    int i5 = this.f11020d;
                    aVar.write(bArr4, i5, this.f11021e - i5);
                    this.f11021e = -1;
                    m13649C();
                    i = this.f11020d;
                    while (true) {
                        if (i != this.f11021e) {
                            bArr = this.f11019c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f11020d;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f11020d = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.f11017a) {
            if (this.f11019c != null) {
                this.f11019c = null;
                this.f11017a.close();
            }
        }
    }

    public StrictLineReader(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C1613c.f11023a)) {
            this.f11017a = inputStream;
            this.f11018b = charset;
            this.f11019c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
