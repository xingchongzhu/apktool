package com.umeng.commonsdk.config;

/* renamed from: com.umeng.commonsdk.config.a */
public class BitUtils {
    /* renamed from: a */
    public static boolean m22204a(int i, int i2) {
        return i2 >= 0 && i2 <= 31 && (i & (1 << i2)) != 0;
    }

    /* renamed from: a */
    public static boolean m22205a(long j, int i) {
        return i >= 0 && i <= 63 && (j & (1 << i)) != 0;
    }

    /* renamed from: b */
    public static int m22206b(int i, int i2) {
        return i | (1 << i2);
    }

    /* renamed from: b */
    public static long m22207b(long j, int i) {
        return (i < 0 || i > 63) ? j : j | (1 << i);
    }

    /* renamed from: c */
    public static int m22208c(int i, int i2) {
        return i & ((1 << i2) ^ -1);
    }

    /* renamed from: c */
    public static long m22209c(long j, int i) {
        return (i < 0 || i > 63) ? j : j & ((1 << i) ^ -1);
    }
}
