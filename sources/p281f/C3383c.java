package p281f;

import com.umeng.analytics.pro.TType;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: f.c */
/* compiled from: Buffer */
public final class C3383c implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* renamed from: a */
    private static final byte[] f18749a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    Segment f18750b;

    /* renamed from: c */
    long f18751c;

    /* renamed from: A */
    public String mo20170A(Charset charset) {
        try {
            return mo20182M(this.f18751c, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: B */
    public final void mo20171B() {
        try {
            mo20192a(this.f18751c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: C */
    public C3383c clone() {
        C3383c cVar = new C3383c();
        if (this.f18751c == 0) {
            return cVar;
        }
        Segment d = this.f18750b.mo20284d();
        cVar.f18750b = d;
        d.f18787g = d;
        d.f18786f = d;
        Segment oVar = this.f18750b;
        while (true) {
            oVar = oVar.f18786f;
            if (oVar != this.f18750b) {
                cVar.f18750b.f18787g.mo20283c(oVar.mo20284d());
            } else {
                cVar.f18751c = this.f18751c;
                return cVar;
            }
        }
    }

    /* renamed from: D */
    public final long mo20173D() {
        long j = this.f18751c;
        if (j == 0) {
            return 0;
        }
        Segment oVar = this.f18750b.f18787g;
        int i = oVar.f18783c;
        if (i < 8192 && oVar.f18785e) {
            j -= (long) (i - oVar.f18782b);
        }
        return j;
    }

    /* renamed from: E */
    public final C3383c mo20174E(C3383c cVar, long j, long j2) {
        if (cVar != null) {
            C3388u.m24008b(this.f18751c, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f18751c += j2;
            Segment oVar = this.f18750b;
            while (true) {
                int i = oVar.f18783c;
                int i2 = oVar.f18782b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                oVar = oVar.f18786f;
            }
            while (j2 > 0) {
                Segment d = oVar.mo20284d();
                int i3 = (int) (((long) d.f18782b) + j);
                d.f18782b = i3;
                d.f18783c = Math.min(i3 + ((int) j2), d.f18783c);
                Segment oVar2 = cVar.f18750b;
                if (oVar2 == null) {
                    d.f18787g = d;
                    d.f18786f = d;
                    cVar.f18750b = d;
                } else {
                    oVar2.f18787g.mo20283c(d);
                }
                j2 -= (long) (d.f18783c - d.f18782b);
                oVar = oVar.f18786f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: F */
    public C3383c mo20228s() {
        return this;
    }

    /* renamed from: G */
    public final byte mo20176G(long j) {
        int i;
        C3388u.m24008b(this.f18751c, j, 1);
        long j2 = this.f18751c;
        if (j2 - j > j) {
            Segment oVar = this.f18750b;
            while (true) {
                int i2 = oVar.f18783c;
                int i3 = oVar.f18782b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return oVar.f18781a[i3 + ((int) j)];
                }
                j -= j3;
                oVar = oVar.f18786f;
            }
        } else {
            long j4 = j - j2;
            Segment oVar2 = this.f18750b;
            do {
                oVar2 = oVar2.f18787g;
                int i4 = oVar2.f18783c;
                i = oVar2.f18782b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return oVar2.f18781a[i + ((int) j4)];
        }
    }

    /* renamed from: H */
    public long mo20177H(byte b, long j, long j2) {
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f18751c), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f18751c;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5) {
            return -1;
        }
        Segment oVar = this.f18750b;
        if (oVar == null) {
            return -1;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                oVar = oVar.f18787g;
                j4 -= (long) (oVar.f18783c - oVar.f18782b);
            }
        } else {
            while (true) {
                long j6 = ((long) (oVar.f18783c - oVar.f18782b)) + j3;
                if (j6 >= j) {
                    break;
                }
                oVar = oVar.f18786f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = oVar.f18781a;
            int min = (int) Math.min((long) oVar.f18783c, (((long) oVar.f18782b) + j5) - j4);
            for (int i = (int) ((((long) oVar.f18782b) + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - oVar.f18782b)) + j4;
                }
            }
            byte b2 = b;
            j4 += (long) (oVar.f18783c - oVar.f18782b);
            oVar = oVar.f18786f;
            j7 = j4;
        }
        return -1;
    }

    /* renamed from: I */
    public boolean mo20178I(long j, ByteString fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f18751c - j < ((long) i2) || fVar.mo20248o() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo20176G(((long) i3) + j) != fVar.mo20241h(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    public int mo20179J(byte[] bArr, int i, int i2) {
        C3388u.m24008b((long) bArr.length, (long) i, (long) i2);
        Segment oVar = this.f18750b;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i2, oVar.f18783c - oVar.f18782b);
        System.arraycopy(oVar.f18781a, oVar.f18782b, bArr, i, min);
        int i3 = oVar.f18782b + min;
        oVar.f18782b = i3;
        this.f18751c -= (long) min;
        if (i3 == oVar.f18783c) {
            this.f18750b = oVar.mo20282b();
            SegmentPool.m23975a(oVar);
        }
        return min;
    }

    /* renamed from: K */
    public byte[] mo20180K() {
        try {
            return mo20219o(this.f18751c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: L */
    public ByteString mo20181L() {
        return new ByteString(mo20180K());
    }

    /* renamed from: M */
    public String mo20182M(long j, Charset charset) throws EOFException {
        C3388u.m24008b(this.f18751c, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            Segment oVar = this.f18750b;
            if (((long) oVar.f18782b) + j > ((long) oVar.f18783c)) {
                return new String(mo20219o(j), charset);
            }
            String str = new String(oVar.f18781a, oVar.f18782b, (int) j, charset);
            int i = (int) (((long) oVar.f18782b) + j);
            oVar.f18782b = i;
            this.f18751c -= j;
            if (i == oVar.f18783c) {
                this.f18750b = oVar.mo20282b();
                SegmentPool.m23975a(oVar);
            }
            return str;
        }
    }

    /* renamed from: N */
    public String mo20183N() {
        try {
            return mo20182M(this.f18751c, C3388u.f18796a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: O */
    public String mo20184O(long j) throws EOFException {
        return mo20182M(j, C3388u.f18796a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public String mo20185P(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (mo20176G(j2) == 13) {
                String O = mo20184O(j2);
                mo20192a(2);
                return O;
            }
        }
        String O2 = mo20184O(j);
        mo20192a(1);
        return O2;
    }

    /* renamed from: Q */
    public final long mo20186Q() {
        return this.f18751c;
    }

    /* renamed from: R */
    public final ByteString mo20187R() {
        long j = this.f18751c;
        if (j <= 2147483647L) {
            return mo20188W((int) j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(this.f18751c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: W */
    public final ByteString mo20188W(int i) {
        if (i == 0) {
            return ByteString.f18753b;
        }
        return new SegmentedByteString(this, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public Segment mo20189X(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        Segment oVar = this.f18750b;
        if (oVar == null) {
            Segment b = SegmentPool.m23976b();
            this.f18750b = b;
            b.f18787g = b;
            b.f18786f = b;
            return b;
        }
        Segment oVar2 = oVar.f18787g;
        if (oVar2.f18783c + i > 8192 || !oVar2.f18785e) {
            oVar2 = oVar2.mo20283c(SegmentPool.m23976b());
        }
        return oVar2;
    }

    /* renamed from: Y */
    public C3383c mo20190Y(ByteString fVar) {
        if (fVar != null) {
            fVar.mo20255u(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: Z */
    public C3383c mo20220p(byte[] bArr) {
        if (bArr != null) {
            return mo20200e(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public void mo20192a(long j) throws EOFException {
        while (j > 0) {
            Segment oVar = this.f18750b;
            if (oVar != null) {
                int min = (int) Math.min(j, (long) (oVar.f18783c - oVar.f18782b));
                long j2 = (long) min;
                this.f18751c -= j2;
                j -= j2;
                Segment oVar2 = this.f18750b;
                int i = oVar2.f18782b + min;
                oVar2.f18782b = i;
                if (i == oVar2.f18783c) {
                    this.f18750b = oVar2.mo20282b();
                    SegmentPool.m23975a(oVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a0 */
    public C3383c mo20200e(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C3388u.m24008b((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                Segment X = mo20189X(1);
                int min = Math.min(i3 - i, 8192 - X.f18783c);
                System.arraycopy(bArr, i, X.f18781a, X.f18783c, min);
                i += min;
                X.f18783c += min;
            }
            this.f18751c += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public ByteString mo20194b(long j) throws EOFException {
        return new ByteString(mo20219o(j));
    }

    /* renamed from: b0 */
    public long mo20195b0(Source sVar) throws IOException {
        if (sVar != null) {
            long j = 0;
            while (true) {
                long t = sVar.mo19739t(this, 8192);
                if (t == -1) {
                    return j;
                }
                j += t;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: c */
    public C3383c mo20196c() {
        return this;
    }

    /* renamed from: c0 */
    public C3383c mo20218n(int i) {
        Segment X = mo20189X(1);
        byte[] bArr = X.f18781a;
        int i2 = X.f18783c;
        X.f18783c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f18751c++;
        return this;
    }

    public void close() {
    }

    /* renamed from: d */
    public Timeout mo19738d() {
        return Timeout.f18792a;
    }

    /* renamed from: d0 */
    public C3383c mo20204g(long j) {
        if (j == 0) {
            return mo20218n(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        Segment X = mo20189X(numberOfTrailingZeros);
        byte[] bArr = X.f18781a;
        int i = X.f18783c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f18749a[(int) (15 & j)];
            j >>>= 4;
        }
        X.f18783c += numberOfTrailingZeros;
        this.f18751c += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: e0 */
    public C3383c mo20212j(int i) {
        Segment X = mo20189X(4);
        byte[] bArr = X.f18781a;
        int i2 = X.f18783c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        X.f18783c = i6;
        this.f18751c += 4;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3383c)) {
            return false;
        }
        C3383c cVar = (C3383c) obj;
        long j = this.f18751c;
        if (j != cVar.f18751c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        Segment oVar = this.f18750b;
        Segment oVar2 = cVar.f18750b;
        int i = oVar.f18782b;
        int i2 = oVar2.f18782b;
        while (j2 < this.f18751c) {
            long min = (long) Math.min(oVar.f18783c - i, oVar2.f18783c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (oVar.f18781a[i] != oVar2.f18781a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == oVar.f18783c) {
                oVar = oVar.f18786f;
                i = oVar.f18782b;
            }
            if (i2 == oVar2.f18783c) {
                oVar2 = oVar2.f18786f;
                i2 = oVar2.f18782b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public void mo19789f(C3383c cVar, long j) {
        int i;
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            C3388u.m24008b(cVar.f18751c, 0, j);
            while (j > 0) {
                Segment oVar = cVar.f18750b;
                if (j < ((long) (oVar.f18783c - oVar.f18782b))) {
                    Segment oVar2 = this.f18750b;
                    Segment oVar3 = oVar2 != null ? oVar2.f18787g : null;
                    if (oVar3 != null && oVar3.f18785e) {
                        long j2 = ((long) oVar3.f18783c) + j;
                        if (oVar3.f18784d) {
                            i = 0;
                        } else {
                            i = oVar3.f18782b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            oVar.mo20286f(oVar3, (int) j);
                            cVar.f18751c -= j;
                            this.f18751c += j;
                            return;
                        }
                    }
                    cVar.f18750b = oVar.mo20285e((int) j);
                }
                Segment oVar4 = cVar.f18750b;
                long j3 = (long) (oVar4.f18783c - oVar4.f18782b);
                cVar.f18750b = oVar4.mo20282b();
                Segment oVar5 = this.f18750b;
                if (oVar5 == null) {
                    this.f18750b = oVar4;
                    oVar4.f18787g = oVar4;
                    oVar4.f18786f = oVar4;
                } else {
                    oVar5.f18787g.mo20283c(oVar4).mo20281a();
                }
                cVar.f18751c -= j3;
                this.f18751c += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: f0 */
    public C3383c mo20209i(int i) {
        Segment X = mo20189X(2);
        byte[] bArr = X.f18781a;
        int i2 = X.f18783c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        X.f18783c = i4;
        this.f18751c += 2;
        return this;
    }

    public void flush() {
    }

    /* renamed from: g0 */
    public C3383c mo20205g0(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalAccessError(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 > str.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C3388u.f18796a)) {
            return mo20213j0(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return mo20200e(bytes, 0, bytes.length);
        }
    }

    /* renamed from: h */
    public BufferedSink mo20206h() {
        return this;
    }

    /* renamed from: h0 */
    public C3383c mo20207h0(String str, Charset charset) {
        return mo20205g0(str, 0, str.length(), charset);
    }

    public int hashCode() {
        Segment oVar = this.f18750b;
        if (oVar == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = oVar.f18782b; i2 < oVar.f18783c; i2++) {
                i = (i * 31) + oVar.f18781a[i2];
            }
            oVar = oVar.f18786f;
        } while (oVar != this.f18750b);
        return i;
    }

    /* renamed from: i0 */
    public C3383c mo20232w(String str) {
        return mo20213j0(str, 0, str.length());
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public C3383c mo20213j0(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    Segment X = mo20189X(1);
                    byte[] bArr = X.f18781a;
                    int i3 = X.f18783c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        int i5 = i4 + 1;
                        bArr[i4 + i3] = (byte) charAt2;
                        i4 = i5;
                    }
                    int i6 = i3 + i4;
                    int i7 = X.f18783c;
                    int i8 = i6 - i7;
                    X.f18783c = i7 + i8;
                    this.f18751c += (long) i8;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        mo20218n((charAt >> 6) | 192);
                        mo20218n((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo20218n((charAt >> 12) | 224);
                        mo20218n(((charAt >> 6) & 63) | 128);
                        mo20218n((charAt & '?') | 128);
                    } else {
                        int i9 = i + 1;
                        char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            mo20218n(63);
                            i = i9;
                        } else {
                            int i10 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            mo20218n((i10 >> 18) | 240);
                            mo20218n(((i10 >> 12) & 63) | 128);
                            mo20218n(((i10 >> 6) & 63) | 128);
                            mo20218n((i10 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: k */
    public String mo20214k() throws EOFException {
        return mo20230u(Long.MAX_VALUE);
    }

    /* renamed from: k0 */
    public C3383c mo20215k0(int i) {
        if (i < 128) {
            mo20218n(i);
        } else if (i < 2048) {
            mo20218n((i >> 6) | 192);
            mo20218n((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                mo20218n((i >> 12) | 224);
                mo20218n(((i >> 6) & 63) | 128);
                mo20218n((i & 63) | 128);
            } else {
                mo20218n(63);
            }
        } else if (i <= 1114111) {
            mo20218n((i >> 18) | 240);
            mo20218n(((i >> 12) & 63) | 128);
            mo20218n(((i >> 6) & 63) | 128);
            mo20218n((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    /* renamed from: l */
    public int mo20216l() {
        return C3388u.m24009c(readInt());
    }

    /* renamed from: m */
    public boolean mo20217m() {
        return this.f18751c == 0;
    }

    /* renamed from: o */
    public byte[] mo20219o(long j) throws EOFException {
        C3388u.m24008b(this.f18751c, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: q */
    public short mo20221q() {
        return C3388u.m24010d(readShort());
    }

    /* renamed from: r */
    public String mo20222r() throws EOFException {
        long x = mo20234x(10);
        if (x != -1) {
            return mo20185P(x);
        }
        long j = this.f18751c;
        return j != 0 ? mo20184O(j) : null;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        Segment oVar = this.f18750b;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f18783c - oVar.f18782b);
        byteBuffer.put(oVar.f18781a, oVar.f18782b, min);
        int i = oVar.f18782b + min;
        oVar.f18782b = i;
        this.f18751c -= (long) min;
        if (i == oVar.f18783c) {
            this.f18750b = oVar.mo20282b();
            SegmentPool.m23975a(oVar);
        }
        return min;
    }

    public byte readByte() {
        long j = this.f18751c;
        if (j != 0) {
            Segment oVar = this.f18750b;
            int i = oVar.f18782b;
            int i2 = oVar.f18783c;
            int i3 = i + 1;
            byte b = oVar.f18781a[i];
            this.f18751c = j - 1;
            if (i3 == i2) {
                this.f18750b = oVar.mo20282b();
                SegmentPool.m23975a(oVar);
            } else {
                oVar.f18782b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int J = mo20179J(bArr, i, bArr.length - i);
            if (J != -1) {
                i += J;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.f18751c;
        if (j >= 4) {
            Segment oVar = this.f18750b;
            int i = oVar.f18782b;
            int i2 = oVar.f18783c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << TType.f16865n) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = oVar.f18781a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << TType.f16865n);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f18751c = j - 4;
            if (i6 == i2) {
                this.f18750b = oVar.mo20282b();
                SegmentPool.m23975a(oVar);
            } else {
                oVar.f18782b = i6;
            }
            return b3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 4: ");
        sb.append(this.f18751c);
        throw new IllegalStateException(sb.toString());
    }

    public short readShort() {
        long j = this.f18751c;
        if (j >= 2) {
            Segment oVar = this.f18750b;
            int i = oVar.f18782b;
            int i2 = oVar.f18783c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = oVar.f18781a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f18751c = j - 2;
            if (i4 == i2) {
                this.f18750b = oVar.mo20282b();
                SegmentPool.m23975a(oVar);
            } else {
                oVar.f18782b = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 2: ");
        sb.append(this.f18751c);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: t */
    public long mo19739t(C3383c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f18751c;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.mo19789f(this, j);
            return j;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public String toString() {
        return mo20187R().toString();
    }

    /* renamed from: u */
    public String mo20230u(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long H = mo20177H(10, 0, j2);
            if (H != -1) {
                return mo20185P(H);
            }
            if (j2 < mo20186Q() && mo20176G(j2 - 1) == 13 && mo20176G(j2) == 10) {
                return mo20185P(j2);
            }
            C3383c cVar = new C3383c();
            mo20174E(cVar, 0, Math.min(32, mo20186Q()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(mo20186Q(), j));
            sb.append(" content=");
            sb.append(cVar.mo20181L().mo20243i());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: v */
    public void mo20231v(long j) throws EOFException {
        if (this.f18751c < j) {
            throw new EOFException();
        }
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                Segment X = mo20189X(1);
                int min = Math.min(i, 8192 - X.f18783c);
                byteBuffer.get(X.f18781a, X.f18783c, min);
                i -= min;
                X.f18783c += min;
            }
            this.f18751c += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: x */
    public long mo20234x(byte b) {
        return mo20177H(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: y */
    public boolean mo20235y(long j, ByteString fVar) {
        return mo20178I(j, fVar, 0, fVar.mo20248o());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r15.f18750b = r6.mo20282b();
        p281f.SegmentPool.m23975a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.f18782b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo20236z() {
        /*
            r15 = this;
            long r0 = r15.f18751c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ac
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            f.o r6 = r15.f18750b
            byte[] r7 = r6.f18781a
            int r8 = r6.f18782b
            int r9 = r6.f18783c
        L_0x0013:
            if (r8 >= r9) goto L_0x0091
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0072
            r11 = 70
            if (r10 > r11) goto L_0x0072
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            f.c r0 = new f.c
            r0.<init>()
            f.c r0 = r0.mo20204g(r4)
            f.c r0 = r0.mo20218n(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo20183N()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0091
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            if (r8 != r9) goto L_0x009d
            f.o r7 = r6.mo20282b()
            r15.f18750b = r7
            p281f.SegmentPool.m23975a(r6)
            goto L_0x009f
        L_0x009d:
            r6.f18782b = r8
        L_0x009f:
            if (r1 != 0) goto L_0x00a5
            f.o r6 = r15.f18750b
            if (r6 != 0) goto L_0x000b
        L_0x00a5:
            long r1 = r15.f18751c
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f18751c = r1
            return r4
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00b5
        L_0x00b4:
            throw r0
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: p281f.C3383c.mo20236z():long");
    }
}
