package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p271e.p272f0.C3310c;
import p281f.BufferedSource;
import p281f.GzipSource;
import p281f.Okio;

public final class PublicSuffixDatabase {

    /* renamed from: a */
    private static final byte[] f18837a = {42};

    /* renamed from: b */
    private static final String[] f18838b = new String[0];

    /* renamed from: c */
    private static final String[] f18839c = {"*"};

    /* renamed from: d */
    private static final PublicSuffixDatabase f18840d = new PublicSuffixDatabase();

    /* renamed from: e */
    private final AtomicBoolean f18841e = new AtomicBoolean(false);

    /* renamed from: f */
    private final CountDownLatch f18842f = new CountDownLatch(1);

    /* renamed from: g */
    private byte[] f18843g;

    /* renamed from: h */
    private byte[] f18844h;

    /* renamed from: a */
    private static String m24066a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z2 = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z2) {
                    b = 46;
                    z = false;
                } else {
                    z = z2;
                    b = bArr4[i9][i10] & 255;
                }
                i3 = b - (bArr3[i6 + i11] & 255);
                if (i3 == 0) {
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr4[i9].length != i10) {
                        z2 = z;
                    } else if (i9 == bArr4.length - 1) {
                        break;
                    } else {
                        i9++;
                        z2 = true;
                        i10 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr3, i6, i8, C3310c.f18095j);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }

    /* renamed from: b */
    private String[] m24067b(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (this.f18841e.get() || !this.f18841e.compareAndSet(false, true)) {
            try {
                this.f18842f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m24070f();
        }
        synchronized (this) {
            if (this.f18843g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(C3310c.f18095j);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = m24066a(this.f18843g, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i4] = f18837a;
                str3 = m24066a(this.f18843g, bArr2, i4);
                if (str3 != null) {
                    break;
                }
                i4++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String a = m24066a(this.f18844h, bArr, i);
                if (a != null) {
                    str = a;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("!");
            sb.append(str);
            return sb.toString().split("\\.");
        } else if (str2 == null && str3 == null) {
            return f18839c;
        } else {
            if (str2 != null) {
                strArr2 = str2.split("\\.");
            } else {
                strArr2 = f18838b;
            }
            if (str3 != null) {
                strArr3 = str3.split("\\.");
            } else {
                strArr3 = f18838b;
            }
            if (strArr2.length <= strArr3.length) {
                strArr2 = strArr3;
            }
            return strArr2;
        }
    }

    /* renamed from: c */
    public static PublicSuffixDatabase m24068c() {
        return f18840d;
    }

    /* renamed from: e */
    private void m24069e() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            BufferedSource c = Okio.m23920c(new GzipSource(Okio.m23926i(resourceAsStream)));
            try {
                byte[] bArr = new byte[c.readInt()];
                c.readFully(bArr);
                byte[] bArr2 = new byte[c.readInt()];
                c.readFully(bArr2);
                synchronized (this) {
                    this.f18843g = bArr;
                    this.f18844h = bArr2;
                }
                this.f18842f.countDown();
            } finally {
                C3310c.m23052f(c);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0025 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24070f() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m24069e()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            e.f0.j.g r2 = p271e.p272f0.p278j.C3358g.m23494l()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.mo19942s(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            goto L_0x0035
        L_0x0034:
            throw r1
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m24070f():void");
    }

    /* renamed from: d */
    public String mo20311d(String str) {
        int i;
        int i2;
        Objects.requireNonNull(str, "domain == null");
        String str2 = "\\.";
        String[] split = IDN.toUnicode(str).split(str2);
        String[] b = m24067b(split);
        if (split.length == b.length && b[0].charAt(0) != '!') {
            return null;
        }
        if (b[0].charAt(0) == '!') {
            i2 = split.length;
            i = b.length;
        } else {
            i2 = split.length;
            i = b.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split(str2);
        for (int i3 = i2 - i; i3 < split2.length; i3++) {
            sb.append(split2[i3]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
