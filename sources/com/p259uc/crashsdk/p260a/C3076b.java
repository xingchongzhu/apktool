package com.p259uc.crashsdk.p260a;

import com.umeng.umcrash.C3276R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.uc.crashsdk.a.b */
/* compiled from: ProGuard */
public final class C3076b {

    /* renamed from: a */
    private static final int[] f16252a = {126, 147, C3276R.styleable.AppCompatTheme_tooltipFrameBackground, 241, 101, 198, 215, 134};

    /* renamed from: b */
    private static final int[] f16253b = {125, 185, 233, 226, 129, 142, 151, 176};

    /* renamed from: c */
    private static final int[] f16254c = {238, 185, 233, 179, 129, 142, 151, 167};

    /* renamed from: a */
    public static String m20982a(String str) {
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[((int) file.length())];
                fileInputStream3.read(bArr);
                C3081g.m21025a((Closeable) fileInputStream3);
                byte[] a = m20985a(bArr, f16252a);
                if (a == null || a.length <= 0) {
                    C3081g.m21025a((Closeable) null);
                    return null;
                }
                int length = a.length - 1;
                String str2 = a[length] == 10 ? new String(a, 0, length) : new String(a);
                C3081g.m21025a((Closeable) null);
                return str2;
            } catch (Exception e) {
                Throwable th = e;
                fileInputStream = fileInputStream3;
                e = th;
                try {
                    C3081g.m21027a(e);
                    C3081g.m21025a((Closeable) fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    C3081g.m21025a((Closeable) fileInputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream2 = fileInputStream3;
                th = th3;
                C3081g.m21025a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C3081g.m21027a(e);
            C3081g.m21025a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            C3081g.m21025a((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* renamed from: b */
    private static byte[] m20986b(byte[] bArr, int[] iArr) {
        boolean z = false;
        if (!(bArr == null || iArr == null || iArr.length != 8)) {
            int length = bArr.length;
            try {
                byte[] bArr2 = new byte[(length + 2)];
                byte b = 0;
                for (int i = 0; i < length; i++) {
                    byte b2 = bArr[i];
                    bArr2[i] = (byte) (iArr[i % 8] ^ b2);
                    b = (byte) (b ^ b2);
                }
                bArr2[length] = (byte) (iArr[0] ^ b);
                bArr2[length + 1] = (byte) (iArr[1] ^ b);
                return bArr2;
            } catch (Exception e) {
                C3081g.m21027a((Throwable) e);
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0064 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m20983a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            if (r9 != 0) goto L_0x0003
            return r7
        L_0x0003:
            boolean r0 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r7)
            if (r0 == 0) goto L_0x000a
            return r7
        L_0x000a:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x00bf
            long r1 = r0.length()
            r3 = 3145728(0x300000, double:1.554196E-317)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0022
            goto L_0x00bf
        L_0x0022:
            byte[] r1 = com.p259uc.crashsdk.p260a.C3081g.m21045e(r0)
            if (r1 == 0) goto L_0x00bf
            int r2 = r1.length
            if (r2 > 0) goto L_0x002d
            goto L_0x00bf
        L_0x002d:
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L_0x0084
            r9 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x004a }
            r4.<init>()     // Catch:{ all -> 0x004a }
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0045 }
            r5.<init>(r4)     // Catch:{ all -> 0x0045 }
            r5.write(r1)     // Catch:{ all -> 0x0043 }
            r4.flush()     // Catch:{ all -> 0x0043 }
            goto L_0x0051
        L_0x0043:
            r9 = move-exception
            goto L_0x004e
        L_0x0045:
            r5 = move-exception
            r6 = r5
            r5 = r9
            r9 = r6
            goto L_0x004e
        L_0x004a:
            r4 = move-exception
            r5 = r9
            r9 = r4
            r4 = r5
        L_0x004e:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r9)     // Catch:{ all -> 0x007c }
        L_0x0051:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r4)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x005d }
            r9 = 1
            goto L_0x0062
        L_0x005d:
            r9 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r9)
            r9 = 0
        L_0x0062:
            if (r9 == 0) goto L_0x007b
            if (r1 == 0) goto L_0x007b
            int r9 = r1.length
            if (r9 > 0) goto L_0x006a
            goto L_0x007b
        L_0x006a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 1
            goto L_0x0086
        L_0x007b:
            return r7
        L_0x007c:
            r7 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r4)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)
            throw r7
        L_0x0084:
            r8 = r7
            r9 = 0
        L_0x0086:
            if (r9 == 0) goto L_0x00bf
            java.lang.String r9 = r0.getName()
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00a5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r4 = ".tmp"
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r4 = 1
            goto L_0x00a7
        L_0x00a5:
            r9 = r8
            r4 = 0
        L_0x00a7:
            java.io.File r5 = new java.io.File
            r5.<init>(r9)
            boolean r9 = com.p259uc.crashsdk.p260a.C3081g.m21031a(r5, r1)
            if (r9 != 0) goto L_0x00b4
            r2 = 0
            goto L_0x00bc
        L_0x00b4:
            if (r4 == 0) goto L_0x00bc
            r0.delete()
            r5.renameTo(r0)
        L_0x00bc:
            if (r2 == 0) goto L_0x00bf
            return r8
        L_0x00bf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.p260a.C3076b.m20983a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    private static byte[] m20985a(byte[] bArr, int[] iArr) {
        if (bArr.length - 0 >= 2 && iArr != null && iArr.length == 8) {
            int length = (bArr.length - 2) - 0;
            try {
                byte[] bArr2 = new byte[length];
                byte b = 0;
                for (int i = 0; i < length; i++) {
                    byte b2 = (byte) (bArr[i + 0] ^ iArr[i % 8]);
                    bArr2[i] = b2;
                    b = (byte) (b ^ b2);
                }
                if (bArr[length + 0] == ((byte) ((iArr[0] ^ b) & 255)) && bArr[length + 1 + 0] == ((byte) ((iArr[1] ^ b) & 255))) {
                    return bArr2;
                }
                return null;
            } catch (Exception e) {
                C3081g.m21027a((Throwable) e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m20984a(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            C3081g.m21027a(th);
            fileOutputStream = null;
        }
        boolean z = false;
        if (fileOutputStream == null) {
            return false;
        }
        byte[] b = m20986b(str2.getBytes(), f16252a);
        if (b == null) {
            C3081g.m21025a((Closeable) fileOutputStream);
            return false;
        }
        try {
            fileOutputStream.write(b);
            z = true;
        } catch (Throwable th2) {
            C3081g.m21025a((Closeable) fileOutputStream);
            throw th2;
        }
        C3081g.m21025a((Closeable) fileOutputStream);
        return z;
    }
}
