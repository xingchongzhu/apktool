package com.bumptech.glide.load.data;

import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.data.c */
public final class BufferedOutputStream extends OutputStream {

    /* renamed from: a */
    private final OutputStream f10296a;

    /* renamed from: b */
    private byte[] f10297b;

    /* renamed from: c */
    private ArrayPool f10298c;

    /* renamed from: d */
    private int f10299d;

    public BufferedOutputStream(OutputStream outputStream, ArrayPool bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: B */
    private void m12500B() throws IOException {
        int i = this.f10299d;
        if (i > 0) {
            this.f10296a.write(this.f10297b, 0, i);
            this.f10299d = 0;
        }
    }

    /* renamed from: C */
    private void m12501C() throws IOException {
        if (this.f10299d == this.f10297b.length) {
            m12500B();
        }
    }

    /* renamed from: D */
    private void m12502D() {
        byte[] bArr = this.f10297b;
        if (bArr != null) {
            this.f10298c.mo8861d(bArr);
            this.f10297b = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f10296a.close();
            m12502D();
        } catch (Throwable th) {
            this.f10296a.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        m12500B();
        this.f10296a.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f10297b;
        int i2 = this.f10299d;
        this.f10299d = i2 + 1;
        bArr[i2] = (byte) i;
        m12501C();
    }

    BufferedOutputStream(OutputStream outputStream, ArrayPool bVar, int i) {
        this.f10296a = outputStream;
        this.f10298c = bVar;
        this.f10297b = (byte[]) bVar.mo8862e(i, byte[].class);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f10299d;
            if (i6 != 0 || i4 < this.f10297b.length) {
                int min = Math.min(i4, this.f10297b.length - i6);
                System.arraycopy(bArr, i5, this.f10297b, this.f10299d, min);
                this.f10299d += min;
                i3 += min;
                m12501C();
            } else {
                this.f10296a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
