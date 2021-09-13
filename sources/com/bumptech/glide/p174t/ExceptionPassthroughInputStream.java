package com.bumptech.glide.p174t;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.t.d */
public final class ExceptionPassthroughInputStream extends InputStream {

    /* renamed from: a */
    private static final Queue<ExceptionPassthroughInputStream> f11242a = C1639k.m14087e(0);

    /* renamed from: b */
    private InputStream f11243b;

    /* renamed from: c */
    private IOException f11244c;

    ExceptionPassthroughInputStream() {
    }

    /* renamed from: C */
    public static ExceptionPassthroughInputStream m14058C(InputStream inputStream) {
        ExceptionPassthroughInputStream dVar;
        Queue<ExceptionPassthroughInputStream> queue = f11242a;
        synchronized (queue) {
            dVar = (ExceptionPassthroughInputStream) queue.poll();
        }
        if (dVar == null) {
            dVar = new ExceptionPassthroughInputStream();
        }
        dVar.mo9556E(inputStream);
        return dVar;
    }

    /* renamed from: B */
    public IOException mo9554B() {
        return this.f11244c;
    }

    /* renamed from: D */
    public void mo9555D() {
        this.f11244c = null;
        this.f11243b = null;
        Queue<ExceptionPassthroughInputStream> queue = f11242a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public void mo9556E(InputStream inputStream) {
        this.f11243b = inputStream;
    }

    public int available() throws IOException {
        return this.f11243b.available();
    }

    public void close() throws IOException {
        this.f11243b.close();
    }

    public void mark(int i) {
        this.f11243b.mark(i);
    }

    public boolean markSupported() {
        return this.f11243b.markSupported();
    }

    public int read() throws IOException {
        try {
            return this.f11243b.read();
        } catch (IOException e) {
            this.f11244c = e;
            throw e;
        }
    }

    public synchronized void reset() throws IOException {
        this.f11243b.reset();
    }

    public long skip(long j) throws IOException {
        try {
            return this.f11243b.skip(j);
        } catch (IOException e) {
            this.f11244c = e;
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f11243b.read(bArr);
        } catch (IOException e) {
            this.f11244c = e;
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f11243b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f11244c = e;
            throw e;
        }
    }
}
