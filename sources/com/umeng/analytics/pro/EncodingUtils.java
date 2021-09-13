package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.an */
public class EncodingUtils {
    /* renamed from: a */
    public static final void m21610a(int i, byte[] bArr) {
        m21611a(i, bArr, 0);
    }

    /* renamed from: a */
    public static final boolean m21613a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=long, for r4v0, types: [long, int] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m21614a(long r2, long r4) {
        /*
            r0 = 1
            long r0 = r0 << r4
            long r2 = r2 & r0
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.EncodingUtils.m21614a(long, int):boolean");
    }

    /* renamed from: b */
    public static final byte m21616b(byte b, int i) {
        return (byte) m21617b((int) b, i);
    }

    /* renamed from: b */
    public static final int m21617b(int i, int i2) {
        return i & ((1 << i2) ^ -1);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=long, for r6v0, types: [long, int] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m21618b(long r4, long r6) {
        /*
            r0 = 1
            long r0 = r0 << r6
            r2 = -1
            long r0 = r0 ^ r2
            long r4 = r4 & r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.EncodingUtils.m21618b(long, int):long");
    }

    /* renamed from: a */
    public static final void m21611a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* renamed from: b */
    public static final short m21619b(short s, int i) {
        return (short) m21617b((int) s, i);
    }

    /* renamed from: a */
    public static final int m21606a(byte[] bArr) {
        return m21607a(bArr, 0);
    }

    /* renamed from: a */
    public static final int m21607a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << TType.f16865n) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public static final boolean m21612a(byte b, int i) {
        return m21613a((int) b, i);
    }

    /* renamed from: a */
    public static final boolean m21615a(short s, int i) {
        return m21613a((int) s, i);
    }

    /* renamed from: a */
    public static final byte m21604a(byte b, int i, boolean z) {
        return (byte) m21605a((int) b, i, z);
    }

    /* renamed from: a */
    public static final short m21609a(short s, int i, boolean z) {
        return (short) m21605a((int) s, i, z);
    }

    /* renamed from: a */
    public static final int m21605a(int i, int i2, boolean z) {
        return z ? i | (1 << i2) : m21617b(i, i2);
    }

    /* renamed from: a */
    public static final long m21608a(long j, int i, boolean z) {
        return z ? j | (1 << i) : m21618b(j, i);
    }
}
