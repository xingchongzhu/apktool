package p271e.p272f0.p277i;

import com.p259uc.crashsdk.export.LogType;
import java.io.IOException;
import p271e.p272f0.C3310c;
import p281f.ByteString;

/* renamed from: e.f0.i.e */
public final class Http2 {

    /* renamed from: a */
    static final ByteString f18272a = ByteString.m23878g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f18273b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f18274c = new String[64];

    /* renamed from: d */
    static final String[] f18275d = new String[LogType.UNEXP];

    static {
        String str;
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f18275d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C3310c.m23063q("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f18274c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = 0;
        while (true) {
            str = "|PADDED";
            if (i3 >= 1) {
                break;
            }
            int i4 = iArr[i3];
            String[] strArr3 = f18274c;
            int i5 = i4 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i4]);
            sb.append(str);
            strArr3[i5] = sb.toString();
            i3++;
        }
        String[] strArr4 = f18274c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            for (int i8 = 0; i8 < 1; i8++) {
                int i9 = iArr[i8];
                String[] strArr5 = f18274c;
                int i10 = i9 | i7;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr5[i9]);
                sb2.append('|');
                sb2.append(strArr5[i7]);
                strArr5[i10] = sb2.toString();
                int i11 = i10 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strArr5[i9]);
                sb3.append('|');
                sb3.append(strArr5[i7]);
                sb3.append(str);
                strArr5[i11] = sb3.toString();
            }
        }
        while (true) {
            String[] strArr6 = f18274c;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f18275d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private Http2() {
    }

    /* renamed from: a */
    static String m23266a(byte b, byte b2) {
        String str;
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    str = "ACK";
                } else {
                    str = f18275d[b2];
                }
                return str;
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = f18274c;
                String str2 = b2 < strArr.length ? strArr[b2] : f18275d[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                }
                return str2.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f18275d[b2];
    }

    /* renamed from: b */
    static String m23267b(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f18273b;
        String q = b < strArr.length ? strArr[b] : C3310c.m23063q("0x%02x", Byte.valueOf(b));
        String a = m23266a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = q;
        objArr[4] = a;
        return C3310c.m23063q("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: c */
    static IllegalArgumentException m23268c(String str, Object... objArr) {
        throw new IllegalArgumentException(C3310c.m23063q(str, objArr));
    }

    /* renamed from: d */
    static IOException m23269d(String str, Object... objArr) throws IOException {
        throw new IOException(C3310c.m23063q(str, objArr));
    }
}
