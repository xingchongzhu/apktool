package com.p259uc.crashsdk.p260a;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.uc.crashsdk.a.c */
/* compiled from: ProGuard */
public class C3077c {

    /* renamed from: a */
    static final /* synthetic */ boolean f16255a = true;

    /* renamed from: b */
    private static String f16256b = "";

    /* renamed from: a */
    public static byte[] m20994a(byte[] bArr, byte[] bArr2) {
        return m20996a(bArr, bArr2, f16255a, false);
    }

    /* renamed from: b */
    public static byte[] m20998b(byte[] bArr, byte[] bArr2) {
        return m20996a(bArr, bArr2, f16255a, f16255a);
    }

    /* renamed from: a */
    public static byte[] m20995a(byte[] bArr, byte[] bArr2, boolean z) {
        return m20996a(bArr, bArr2, z, f16255a);
    }

    /* renamed from: b */
    private static boolean m20997b(File file, String str, String str2) {
        try {
            byte[] a = m20991a(file);
            if (a != null) {
                if (a.length != 0) {
                    return m20989a(a, str, str2);
                }
            }
            return false;
        } catch (Exception e) {
            C3081g.m21027a((Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m20996a(byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(z ? 1 : 2, secretKeySpec, ivParameterSpec);
        if (!z) {
            return instance.doFinal(bArr);
        }
        if (!z2) {
            bArr = m20993a(bArr);
        }
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    private static byte[] m20993a(byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + 16)];
        int length = bArr.length;
        bArr2[0] = (byte) ((length >> 0) & 255);
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) ((length >> 16) & 255);
        bArr2[3] = (byte) ((length >> 24) & 255);
        for (int i = 4; i < 16; i++) {
            bArr2[i] = 0;
        }
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m20990a() {
        return new byte[]{48, 25, 6, 55};
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094 A[SYNTHETIC, Splitter:B:42:0x0094] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m20992a(java.lang.String r7, byte[] r8) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0085 }
            r1.<init>(r7)     // Catch:{ all -> 0x0085 }
            java.net.URLConnection r7 = r1.openConnection()     // Catch:{ all -> 0x0085 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x0085 }
            r1 = 5000(0x1388, float:7.006E-42)
            r7.setConnectTimeout(r1)     // Catch:{ all -> 0x0083 }
            r7.setReadTimeout(r1)     // Catch:{ all -> 0x0083 }
            r1 = 1
            r7.setDoInput(r1)     // Catch:{ all -> 0x0083 }
            r7.setDoOutput(r1)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "POST"
            r7.setRequestMethod(r1)     // Catch:{ all -> 0x0083 }
            r1 = 0
            r7.setUseCaches(r1)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r2, r3)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "Content-Length"
            int r3 = r8.length     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0083 }
            r7.setRequestProperty(r2, r3)     // Catch:{ all -> 0x0083 }
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch:{ all -> 0x0083 }
            r2.write(r8)     // Catch:{ all -> 0x0080 }
            int r8 = r7.getResponseCode()     // Catch:{ all -> 0x0080 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r8 == r3) goto L_0x0051
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r2)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r0)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r0)
            r7.disconnect()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            return r0
        L_0x0051:
            java.io.InputStream r8 = r7.getInputStream()     // Catch:{ all -> 0x0080 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x007e }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x007e }
            int r5 = r8.available()     // Catch:{ all -> 0x007e }
            r4.<init>(r5)     // Catch:{ all -> 0x007e }
        L_0x0062:
            int r5 = r8.read(r3)     // Catch:{ all -> 0x0089 }
            r6 = -1
            if (r5 == r6) goto L_0x006d
            r4.write(r3, r1, r5)     // Catch:{ all -> 0x0089 }
            goto L_0x0062
        L_0x006d:
            byte[] r0 = r4.toByteArray()     // Catch:{ all -> 0x0089 }
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r2)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r8)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r4)
            r7.disconnect()     // Catch:{ all -> 0x007d }
        L_0x007d:
            return r0
        L_0x007e:
            r4 = r0
            goto L_0x0089
        L_0x0080:
            r8 = r0
            r4 = r8
            goto L_0x0089
        L_0x0083:
            r8 = r0
            goto L_0x0087
        L_0x0085:
            r7 = r0
            r8 = r7
        L_0x0087:
            r2 = r8
            r4 = r2
        L_0x0089:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r2)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r8)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r4)
            if (r7 == 0) goto L_0x0097
            r7.disconnect()     // Catch:{ all -> 0x0097 }
        L_0x0097:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.p260a.C3077c.m20992a(java.lang.String, byte[]):byte[]");
    }

    /* renamed from: a */
    public static void m20987a(byte[] bArr, int i, byte[] bArr2) {
        if (f16255a || bArr2.length == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[i2 + i] = bArr2[i2];
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private static byte[] m20991a(File file) {
        FileInputStream fileInputStream;
        byte[] bArr;
        byte[] bArr2;
        BufferedInputStream bufferedInputStream = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            int length = (int) file.length();
            fileInputStream = new FileInputStream(file);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream);
                try {
                    bArr = new byte[length];
                    int i = 0;
                    while (i < length) {
                        int read = bufferedInputStream2.read(bArr, i, length - i);
                        if (-1 == read) {
                            break;
                        }
                        i += read;
                    }
                    C3081g.m21025a((Closeable) bufferedInputStream2);
                    C3081g.m21025a((Closeable) fileInputStream);
                } catch (Exception e) {
                    e = e;
                    bufferedInputStream = bufferedInputStream2;
                    bArr2 = null;
                    try {
                        C3081g.m21036b((Throwable) e);
                        C3081g.m21025a((Closeable) bufferedInputStream);
                        C3081g.m21025a((Closeable) fileInputStream);
                        bArr = bArr2;
                        return bArr;
                    } catch (Throwable th) {
                        th = th;
                        C3081g.m21025a((Closeable) bufferedInputStream);
                        C3081g.m21025a((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    C3081g.m21025a((Closeable) bufferedInputStream);
                    C3081g.m21025a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                bArr2 = null;
                C3081g.m21036b((Throwable) e);
                C3081g.m21025a((Closeable) bufferedInputStream);
                C3081g.m21025a((Closeable) fileInputStream);
                bArr = bArr2;
                return bArr;
            }
        } catch (Exception e3) {
            e = e3;
            bArr2 = null;
            fileInputStream = null;
            C3081g.m21036b((Throwable) e);
            C3081g.m21025a((Closeable) bufferedInputStream);
            C3081g.m21025a((Closeable) fileInputStream);
            bArr = bArr2;
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            C3081g.m21025a((Closeable) bufferedInputStream);
            C3081g.m21025a((Closeable) fileInputStream);
            throw th;
        }
        return bArr;
    }

    /* renamed from: a */
    public static boolean m20988a(File file, String str, String str2) {
        for (int i = 0; i < 2; i++) {
            if (m20997b(file, str, str2)) {
                return f16255a;
            }
            StringBuilder sb = new StringBuilder("upload try again: ");
            sb.append(str);
            C3075a.m20976a("crashsdk", sb.toString());
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x013e A[SYNTHETIC, Splitter:B:51:0x013e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m20989a(byte[] r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "crashsdk"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Uploading to "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.p259uc.crashsdk.p260a.C3075a.m20975a(r1)
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ all -> 0x012c }
            r3.<init>(r12)     // Catch:{ all -> 0x012c }
            java.net.URLConnection r12 = r3.openConnection()     // Catch:{ all -> 0x012c }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ all -> 0x012c }
            r3 = 10000(0x2710, float:1.4013E-41)
            r12.setConnectTimeout(r3)     // Catch:{ all -> 0x0128 }
            r3 = 60000(0xea60, float:8.4078E-41)
            r12.setReadTimeout(r3)     // Catch:{ all -> 0x0128 }
            r3 = 1
            r12.setDoInput(r3)     // Catch:{ all -> 0x0128 }
            r12.setDoOutput(r3)     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = "POST"
            r12.setRequestMethod(r4)     // Catch:{ all -> 0x0128 }
            r12.setUseCaches(r1)     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r4.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "------------izQ290kHh6g3Yn2IeyJCoc\r\n"
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "Content-Disposition: form-data; name=\"file\";"
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = " filename=\""
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            r4.append(r11)     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "\"\r\n"
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "Content-Type: application/octet-stream\r\n"
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "\r\n"
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "\r\n------------izQ290kHh6g3Yn2IeyJCoc--\r\n"
            int r6 = r4.length()     // Catch:{ all -> 0x0128 }
            int r6 = r6 + 40
            int r7 = r10.length     // Catch:{ all -> 0x0128 }
            int r6 = r6 + r7
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "multipart/form-data; boundary=----------izQ290kHh6g3Yn2IeyJCoc"
            r12.setRequestProperty(r7, r8)     // Catch:{ all -> 0x0128 }
            java.lang.String r7 = "Content-Disposition"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = "form-data; name=\"file\"; filename="
            r8.<init>(r9)     // Catch:{ all -> 0x0128 }
            r8.append(r11)     // Catch:{ all -> 0x0128 }
            java.lang.String r11 = r8.toString()     // Catch:{ all -> 0x0128 }
            r12.setRequestProperty(r7, r11)     // Catch:{ all -> 0x0128 }
            java.lang.String r11 = "Content-Length"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0128 }
            r12.setRequestProperty(r11, r6)     // Catch:{ all -> 0x0128 }
            java.io.OutputStream r11 = r12.getOutputStream()     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0123 }
            byte[] r4 = r4.getBytes()     // Catch:{ all -> 0x0123 }
            r11.write(r4)     // Catch:{ all -> 0x0123 }
            r11.write(r10)     // Catch:{ all -> 0x0123 }
            byte[] r10 = r5.getBytes()     // Catch:{ all -> 0x0123 }
            r11.write(r10)     // Catch:{ all -> 0x0123 }
            int r10 = r12.getResponseCode()     // Catch:{ all -> 0x0123 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            java.lang.String r5 = "Response code: "
            r4.<init>(r5)     // Catch:{ all -> 0x0123 }
            r4.append(r10)     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0123 }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r0, r4)     // Catch:{ all -> 0x0123 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r10 == r4) goto L_0x00cc
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r11)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r2)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r2)
            r12.disconnect()     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            return r1
        L_0x00cc:
            java.io.InputStream r10 = r12.getInputStream()     // Catch:{ all -> 0x0123 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0120 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0120 }
            int r6 = r10.available()     // Catch:{ all -> 0x0120 }
            r5.<init>(r6)     // Catch:{ all -> 0x0120 }
        L_0x00dd:
            int r2 = r10.read(r4)     // Catch:{ all -> 0x011e }
            r6 = -1
            if (r2 == r6) goto L_0x00e8
            r5.write(r4, r1, r2)     // Catch:{ all -> 0x011e }
            goto L_0x00dd
        L_0x00e8:
            byte[] r2 = r5.toByteArray()     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x0111
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x011e }
            java.lang.String r6 = "Log upload response: "
            r4.<init>(r6)     // Catch:{ all -> 0x011e }
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x011e }
            r6.<init>(r2)     // Catch:{ all -> 0x011e }
            r4.append(r6)     // Catch:{ all -> 0x011e }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x011e }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r0, r2)     // Catch:{ all -> 0x011e }
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r11)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r10)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)
            r12.disconnect()     // Catch:{ all -> 0x0110 }
        L_0x0110:
            return r3
        L_0x0111:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r11)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r10)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)
            r12.disconnect()     // Catch:{ all -> 0x011d }
        L_0x011d:
            return r1
        L_0x011e:
            r0 = move-exception
            goto L_0x0126
        L_0x0120:
            r0 = move-exception
            r5 = r2
            goto L_0x0126
        L_0x0123:
            r0 = move-exception
            r10 = r2
            r5 = r10
        L_0x0126:
            r2 = r11
            goto L_0x0130
        L_0x0128:
            r0 = move-exception
            r10 = r2
            r5 = r10
            goto L_0x0130
        L_0x012c:
            r0 = move-exception
            r10 = r2
            r12 = r10
            r5 = r12
        L_0x0130:
            com.p259uc.crashsdk.p260a.C3081g.m21036b(r0)     // Catch:{ all -> 0x0142 }
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r2)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r10)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)
            if (r12 == 0) goto L_0x0141
            r12.disconnect()     // Catch:{ all -> 0x0141 }
        L_0x0141:
            return r1
        L_0x0142:
            r11 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r2)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r10)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)
            if (r12 == 0) goto L_0x0151
            r12.disconnect()     // Catch:{ all -> 0x0151 }
        L_0x0151:
            goto L_0x0153
        L_0x0152:
            throw r11
        L_0x0153:
            goto L_0x0152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.p260a.C3077c.m20989a(byte[], java.lang.String, java.lang.String):boolean");
    }
}
