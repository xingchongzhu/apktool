package com.bumptech.glide.load.p158p.p159d;

import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.d.x */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    private volatile byte[] f10906a;

    /* renamed from: b */
    private int f10907b;

    /* renamed from: c */
    private int f10908c;

    /* renamed from: d */
    private int f10909d;

    /* renamed from: e */
    private int f10910e;

    /* renamed from: f */
    private final ArrayPool f10911f;

    /* renamed from: com.bumptech.glide.load.p.d.x$a */
    /* compiled from: RecyclableBufferedInputStream */
    static class C1597a extends IOException {
        C1597a(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, ArrayPool bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: B */
    private int m13466B(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f10909d;
        if (i != -1) {
            int i2 = this.f10910e - i;
            int i3 = this.f10908c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f10907b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f10911f.mo8862e(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f10906a = bArr2;
                    this.f10911f.mo8861d(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f10910e - this.f10909d;
                this.f10910e = i4;
                this.f10909d = 0;
                this.f10907b = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.f10910e;
                if (read > 0) {
                    i5 += read;
                }
                this.f10907b = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f10909d = -1;
            this.f10910e = 0;
            this.f10907b = read2;
        }
        return read2;
    }

    /* renamed from: E */
    private static IOException m13467E() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: C */
    public synchronized void mo9243C() {
        this.f10908c = this.f10906a.length;
    }

    /* renamed from: D */
    public synchronized void mo9244D() {
        if (this.f10906a != null) {
            this.f10911f.mo8861d(this.f10906a);
            this.f10906a = null;
        }
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f10906a == null || inputStream == null) {
            throw m13467E();
        }
        return (this.f10907b - this.f10910e) + inputStream.available();
    }

    public void close() throws IOException {
        if (this.f10906a != null) {
            this.f10911f.mo8861d(this.f10906a);
            this.f10906a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f10908c = Math.max(this.f10908c, i);
        this.f10909d = this.f10910e;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f10906a     // Catch:{ all -> 0x003e }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r2 = r5.f10910e     // Catch:{ all -> 0x003e }
            int r3 = r5.f10907b     // Catch:{ all -> 0x003e }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.m13466B(r1, r0)     // Catch:{ all -> 0x003e }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f10906a     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f10906a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m13467E()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0026:
            int r1 = r5.f10907b     // Catch:{ all -> 0x003e }
            int r2 = r5.f10910e     // Catch:{ all -> 0x003e }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r5.f10910e = r1     // Catch:{ all -> 0x003e }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0037:
            monitor-exit(r5)
            return r4
        L_0x0039:
            java.io.IOException r0 = m13467E()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p158p.p159d.RecyclableBufferedInputStream.read():int");
    }

    public synchronized void reset() throws IOException {
        if (this.f10906a != null) {
            int i = this.f10909d;
            if (-1 != i) {
                this.f10910e = i;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Mark has been invalidated, pos: ");
                sb.append(this.f10910e);
                sb.append(" markLimit: ");
                sb.append(this.f10908c);
                throw new C1597a(sb.toString());
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f10906a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f10907b;
                int i2 = this.f10910e;
                if (((long) (i - i2)) >= j) {
                    this.f10910e = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f10910e = i;
                if (this.f10909d == -1 || j > ((long) this.f10908c)) {
                    long skip = inputStream.skip(j - j2);
                    if (skip > 0) {
                        this.f10909d = -1;
                    }
                    return j2 + skip;
                } else if (m13466B(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f10907b;
                    int i4 = this.f10910e;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f10910e = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f10910e = i3;
                    return j3;
                }
            } else {
                throw m13467E();
            }
        } else {
            throw m13467E();
        }
    }

    RecyclableBufferedInputStream(InputStream inputStream, ArrayPool bVar, int i) {
        super(inputStream);
        this.f10909d = -1;
        this.f10911f = bVar;
        this.f10906a = (byte[]) bVar.mo8862e(i, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f10906a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x000a
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            int r2 = r6.f10910e     // Catch:{ all -> 0x0090 }
            int r3 = r6.f10907b     // Catch:{ all -> 0x0090 }
            if (r2 >= r3) goto L_0x0032
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r2 = r6.f10910e     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r3
            r6.f10910e = r2     // Catch:{ all -> 0x0090 }
            if (r3 == r9) goto L_0x0030
            int r2 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0033
        L_0x0030:
            monitor-exit(r6)
            return r3
        L_0x0032:
            r2 = r9
        L_0x0033:
            int r3 = r6.f10909d     // Catch:{ all -> 0x0090 }
            r4 = -1
            if (r3 != r4) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0048
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0076
            if (r2 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r4 = r9 - r2
        L_0x0046:
            monitor-exit(r6)
            return r4
        L_0x0048:
            int r3 = r6.m13466B(r1, r0)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0055
            if (r2 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r4 = r9 - r2
        L_0x0053:
            monitor-exit(r6)
            return r4
        L_0x0055:
            byte[] r3 = r6.f10906a     // Catch:{ all -> 0x0090 }
            if (r0 == r3) goto L_0x0063
            byte[] r0 = r6.f10906a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.io.IOException r7 = m13467E()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r3 = r6.f10907b     // Catch:{ all -> 0x0090 }
            int r4 = r6.f10910e     // Catch:{ all -> 0x0090 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006d
            r3 = r2
            goto L_0x006e
        L_0x006d:
            int r3 = r3 - r4
        L_0x006e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r4 = r6.f10910e     // Catch:{ all -> 0x0090 }
            int r4 = r4 + r3
            r6.f10910e = r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007b
            monitor-exit(r6)
            return r9
        L_0x007b:
            int r4 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x0084
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0084:
            int r8 = r8 + r3
            goto L_0x0033
        L_0x0086:
            java.io.IOException r7 = m13467E()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x008b:
            java.io.IOException r7 = m13467E()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0094
        L_0x0093:
            throw r7
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p158p.p159d.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }
}
