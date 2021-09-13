package p281f;

import com.umeng.analytics.pro.TType;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: f.f */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* renamed from: a */
    static final char[] f18752a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final ByteString f18753b = m23879j(new byte[0]);

    /* renamed from: c */
    final byte[] f18754c;

    /* renamed from: d */
    transient int f18755d;

    /* renamed from: e */
    transient String f18756e;

    ByteString(byte[] bArr) {
        this.f18754c = bArr;
    }

    /* renamed from: b */
    static int m23874b(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: d */
    public static ByteString m23875d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m23876e(str.charAt(i2)) << 4) + m23876e(str.charAt(i2 + 1)));
            }
            return m23879j(bArr);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected hex string: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e */
    private static int m23876e(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected hex digit: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: f */
    private ByteString m23877f(String str) {
        try {
            return m23879j(MessageDigest.getInstance(str).digest(this.f18754c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public static ByteString m23878g(String str) {
        if (str != null) {
            ByteString fVar = new ByteString(str.getBytes(C3388u.f18796a));
            fVar.f18756e = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: j */
    public static ByteString m23879j(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public String mo20237a() {
        return Base64.m23788a(this.f18754c);
    }

    /* renamed from: c */
    public int compareTo(ByteString fVar) {
        int o = mo20248o();
        int o2 = fVar.mo20248o();
        int min = Math.min(o, o2);
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i < min) {
                byte h = mo20241h(i) & 255;
                byte h2 = fVar.mo20241h(i) & 255;
                if (h == h2) {
                    i++;
                } else {
                    if (h >= h2) {
                        i2 = 1;
                    }
                    return i2;
                }
            } else if (o == o2) {
                return 0;
            } else {
                if (o >= o2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6.mo20245l(0, r3, 0, r3.length) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof p281f.ByteString
            r2 = 0
            if (r1 == 0) goto L_0x001c
            f.f r6 = (p281f.ByteString) r6
            int r1 = r6.mo20248o()
            byte[] r3 = r5.f18754c
            int r4 = r3.length
            if (r1 != r4) goto L_0x001c
            int r1 = r3.length
            boolean r6 = r6.mo20245l(r2, r3, r2, r1)
            if (r6 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p281f.ByteString.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public byte mo20241h(int i) {
        return this.f18754c[i];
    }

    public int hashCode() {
        int i = this.f18755d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f18754c);
        this.f18755d = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public String mo20243i() {
        byte[] bArr = this.f18754c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f18752a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & TType.f16864m];
        }
        return new String(cArr);
    }

    /* renamed from: k */
    public boolean mo20244k(int i, ByteString fVar, int i2, int i3) {
        return fVar.mo20245l(i2, this.f18754c, i, i3);
    }

    /* renamed from: l */
    public boolean mo20245l(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f18754c;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C3388u.m24007a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public ByteString mo20246m() {
        return m23877f("SHA-1");
    }

    /* renamed from: n */
    public ByteString mo20247n() {
        return m23877f("SHA-256");
    }

    /* renamed from: o */
    public int mo20248o() {
        return this.f18754c.length;
    }

    /* renamed from: p */
    public final boolean mo20249p(ByteString fVar) {
        return mo20244k(0, fVar, 0, fVar.mo20248o());
    }

    /* renamed from: q */
    public ByteString mo20250q(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f18754c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    return new ByteString(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > length(");
                sb.append(this.f18754c.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: r */
    public ByteString mo20251r() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f18754c;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(bArr2);
            }
        }
    }

    /* renamed from: s */
    public byte[] mo20252s() {
        return (byte[]) this.f18754c.clone();
    }

    /* renamed from: t */
    public String mo20253t() {
        String str = this.f18756e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f18754c, C3388u.f18796a);
        this.f18756e = str2;
        return str2;
    }

    public String toString() {
        String str;
        String str2;
        if (this.f18754c.length == 0) {
            return "[size=0]";
        }
        String t = mo20253t();
        int b = m23874b(t, 64);
        String str3 = "…]";
        String str4 = "[size=";
        String str5 = "]";
        if (b == -1) {
            if (this.f18754c.length <= 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[hex=");
                sb.append(mo20243i());
                sb.append(str5);
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(this.f18754c.length);
                sb2.append(" hex=");
                sb2.append(mo20250q(0, 64).mo20243i());
                sb2.append(str3);
                str2 = sb2.toString();
            }
            return str2;
        }
        String replace = t.substring(0, b).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (b < t.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(this.f18754c.length);
            sb3.append(" text=");
            sb3.append(replace);
            sb3.append(str3);
            str = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[text=");
            sb4.append(replace);
            sb4.append(str5);
            str = sb4.toString();
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo20255u(C3383c cVar) {
        byte[] bArr = this.f18754c;
        cVar.mo20200e(bArr, 0, bArr.length);
    }
}
