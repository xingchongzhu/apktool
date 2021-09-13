package p067c.p068a.p069a.p070a.p088h2.p093m;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.MetadataInputBuffer;
import p067c.p068a.p069a.p070a.p088h2.SimpleMetadataDecoder;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.h */
public final class Id3Decoder extends SimpleMetadataDecoder {

    /* renamed from: a */
    public static final C1050a f7294a = C1043a.f7270a;

    /* renamed from: b */
    private final C1050a f7295b;

    /* renamed from: c.a.a.a.h2.m.h$a */
    /* compiled from: Id3Decoder */
    public interface C1050a {
        /* renamed from: a */
        boolean mo6251a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: c.a.a.a.h2.m.h$b */
    /* compiled from: Id3Decoder */
    private static final class C1051b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f7296a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f7297b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f7298c;

        public C1051b(int i, boolean z, int i2) {
            this.f7296a = i;
            this.f7297b = z;
            this.f7298c = i2;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r10 & 128) != 0) goto L_0x008b;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m8765A(p067c.p068a.p069a.p070a.p111m2.ParsableByteArray r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo7380e()
        L_0x0008:
            int r3 = r18.mo7376a()     // Catch:{ all -> 0x00af }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo7389n()     // Catch:{ all -> 0x00af }
            long r8 = r18.mo7364F()     // Catch:{ all -> 0x00af }
            int r10 = r18.mo7368J()     // Catch:{ all -> 0x00af }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo7365G()     // Catch:{ all -> 0x00af }
            int r8 = r18.mo7365G()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo7374P(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.mo7374P(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007b
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r4 = 0
            goto L_0x008b
        L_0x007b:
            if (r0 != r3) goto L_0x0089
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0083:
            r3 = 0
        L_0x0084:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0089:
            r3 = 0
            goto L_0x0079
        L_0x008b:
            if (r4 == 0) goto L_0x008f
            int r3 = r3 + 4
        L_0x008f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0098
            r1.mo7374P(r2)
            return r6
        L_0x0098:
            int r3 = r18.mo7376a()     // Catch:{ all -> 0x00af }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
            r1.mo7374P(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.mo7375Q(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0008
        L_0x00ab:
            r1.mo7374P(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.mo7374P(r2)
            goto L_0x00b5
        L_0x00b4:
            throw r0
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder.m8765A(c.a.a.a.m2.a0, int, int, boolean):boolean");
    }

    /* renamed from: c */
    private static byte[] m8766c(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return Util.f8403f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: e */
    private static ApicFrame m8767e(ParsableByteArray a0Var, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int D = a0Var.mo7362D();
        String u = m8783u(D);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        a0Var.mo7385j(bArr, 0, i4);
        String str2 = "image/";
        String str3 = "ISO-8859-1";
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(Util.m10256J0(new String(bArr, 0, 3, str3)));
            str = sb.toString();
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m8786x(bArr, 0);
            String J0 = Util.m10256J0(new String(bArr, 0, i3, str3));
            if (J0.indexOf(47) == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(J0);
                str = sb2.toString();
            } else {
                str = J0;
            }
        }
        byte b = bArr[i3 + 1] & 255;
        int i5 = i3 + 2;
        int w = m8785w(bArr, i5, D);
        return new ApicFrame(str, new String(bArr, i5, w - i5, u), b, m8766c(bArr, w + m8782t(D), i4));
    }

    /* renamed from: f */
    private static BinaryFrame m8768f(ParsableByteArray a0Var, int i, String str) {
        byte[] bArr = new byte[i];
        a0Var.mo7385j(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: g */
    private static ChapterFrame m8769g(ParsableByteArray a0Var, int i, int i2, boolean z, int i3, C1050a aVar) throws UnsupportedEncodingException {
        ParsableByteArray a0Var2 = a0Var;
        int e = a0Var.mo7380e();
        int x = m8786x(a0Var.mo7379d(), e);
        String str = new String(a0Var.mo7379d(), e, x - e, "ISO-8859-1");
        a0Var.mo7374P(x + 1);
        int n = a0Var.mo7389n();
        int n2 = a0Var.mo7389n();
        long F = a0Var.mo7364F();
        long j = F == 4294967295L ? -1 : F;
        long F2 = a0Var.mo7364F();
        long j2 = F2 == 4294967295L ? -1 : F2;
        ArrayList arrayList = new ArrayList();
        int i4 = e + i;
        while (a0Var.mo7380e() < i4) {
            Id3Frame j3 = m8772j(i2, a0Var, z, i3, aVar);
            if (j3 != null) {
                arrayList.add(j3);
            }
        }
        ChapterFrame dVar = new ChapterFrame(str, n, n2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
        return dVar;
    }

    /* renamed from: h */
    private static ChapterTocFrame m8770h(ParsableByteArray a0Var, int i, int i2, boolean z, int i3, C1050a aVar) throws UnsupportedEncodingException {
        ParsableByteArray a0Var2 = a0Var;
        int e = a0Var.mo7380e();
        int x = m8786x(a0Var.mo7379d(), e);
        String str = "ISO-8859-1";
        String str2 = new String(a0Var.mo7379d(), e, x - e, str);
        a0Var2.mo7374P(x + 1);
        int D = a0Var.mo7362D();
        boolean z2 = (D & 2) != 0;
        boolean z3 = (D & 1) != 0;
        int D2 = a0Var.mo7362D();
        String[] strArr = new String[D2];
        for (int i4 = 0; i4 < D2; i4++) {
            int e2 = a0Var.mo7380e();
            int x2 = m8786x(a0Var.mo7379d(), e2);
            strArr[i4] = new String(a0Var.mo7379d(), e2, x2 - e2, str);
            a0Var2.mo7374P(x2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = e + i;
        while (a0Var.mo7380e() < i5) {
            Id3Frame j = m8772j(i2, a0Var2, z, i3, aVar);
            if (j != null) {
                arrayList.add(j);
            }
        }
        ChapterTocFrame eVar = new ChapterTocFrame(str2, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
        return eVar;
    }

    /* renamed from: i */
    private static CommentFrame m8771i(ParsableByteArray a0Var, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int D = a0Var.mo7362D();
        String u = m8783u(D);
        byte[] bArr = new byte[3];
        a0Var.mo7385j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        a0Var.mo7385j(bArr2, 0, i2);
        int w = m8785w(bArr2, 0, D);
        String str2 = new String(bArr2, 0, w, u);
        int t = w + m8782t(D);
        return new CommentFrame(str, str2, m8777o(bArr2, t, m8785w(bArr2, t, D), u));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.p088h2.p093m.Id3Frame m8772j(int r19, p067c.p068a.p069a.p070a.p111m2.ParsableByteArray r20, boolean r21, int r22, p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder.C1050a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.mo7362D()
            int r9 = r20.mo7362D()
            int r10 = r20.mo7362D()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.mo7362D()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.mo7366H()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.mo7366H()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.mo7365G()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.mo7368J()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.mo7381f()
            r7.mo7374P(r0)
            return r16
        L_0x0067:
            int r1 = r20.mo7380e()
            int r5 = r1 + r15
            int r1 = r20.mo7381f()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r4, r0)
            int r0 = r20.mo7381f()
            r7.mo7374P(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.mo6251a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.mo7374P(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0225
            if (r4 == 0) goto L_0x00f8
            goto L_0x0225
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.mo7375Q(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.mo7375Q(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = m8788z(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            c.a.a.a.h2.m.m r1 = m8779q(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = m8784v(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            c.a.a.a.h2.m.m r1 = m8778p(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x0221
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            c.a.a.a.h2.m.n r1 = m8781s(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = m8784v(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            c.a.a.a.h2.m.n r1 = m8780r(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            c.a.a.a.h2.m.l r1 = m8776n(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            c.a.a.a.h2.m.g r1 = m8773k(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            c.a.a.a.h2.m.b r1 = m8767e(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            c.a.a.a.h2.m.f r1 = m8771i(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            c.a.a.a.h2.m.d r1 = m8769g(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            c.a.a.a.h2.m.e r1 = m8770h(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            c.a.a.a.h2.m.k r1 = m8775m(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = m8784v(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            c.a.a.a.h2.m.c r1 = m8768f(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = m8784v(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x0214:
            r7.mo7374P(r14)
            return r1
        L_0x0218:
            java.lang.String r0 = "Unsupported character encoding"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r12, r0)     // Catch:{ all -> 0x012e }
            r7.mo7374P(r14)
            return r16
        L_0x0221:
            r7.mo7374P(r14)
            throw r0
        L_0x0225:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r12, r0)
            r7.mo7374P(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder.m8772j(int, c.a.a.a.m2.a0, boolean, int, c.a.a.a.h2.m.h$a):c.a.a.a.h2.m.i");
    }

    /* renamed from: k */
    private static GeobFrame m8773k(ParsableByteArray a0Var, int i) throws UnsupportedEncodingException {
        int D = a0Var.mo7362D();
        String u = m8783u(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        a0Var.mo7385j(bArr, 0, i2);
        int x = m8786x(bArr, 0);
        String str = new String(bArr, 0, x, "ISO-8859-1");
        int i3 = x + 1;
        int w = m8785w(bArr, i3, D);
        String o = m8777o(bArr, i3, w, u);
        int t = w + m8782t(D);
        int w2 = m8785w(bArr, t, D);
        return new GeobFrame(str, o, m8777o(bArr, t, w2, u), m8766c(bArr, w2 + m8782t(D), i2));
    }

    /* renamed from: l */
    private static C1051b m8774l(ParsableByteArray a0Var) {
        String str = "Id3Decoder";
        if (a0Var.mo7376a() < 10) {
            Log.m10386h(str, "Data too short to be an ID3 tag");
            return null;
        }
        int G = a0Var.mo7365G();
        boolean z = false;
        if (G != 4801587) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb.append(String.format("%06X", new Object[]{Integer.valueOf(G)}));
            Log.m10386h(str, sb.toString());
            return null;
        }
        int D = a0Var.mo7362D();
        a0Var.mo7375Q(1);
        int D2 = a0Var.mo7362D();
        int C = a0Var.mo7361C();
        if (D == 2) {
            if ((D2 & 64) != 0) {
                Log.m10386h(str, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (D == 3) {
            if ((D2 & 64) != 0) {
                int n = a0Var.mo7389n();
                a0Var.mo7375Q(n);
                C -= n + 4;
            }
        } else if (D == 4) {
            if ((D2 & 64) != 0) {
                int C2 = a0Var.mo7361C();
                a0Var.mo7375Q(C2 - 4);
                C -= C2;
            }
            if ((D2 & 16) != 0) {
                C -= 10;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipped ID3 tag with unsupported majorVersion=");
            sb2.append(D);
            Log.m10386h(str, sb2.toString());
            return null;
        }
        if (D < 4 && (D2 & 128) != 0) {
            z = true;
        }
        return new C1051b(D, z, C);
    }

    /* renamed from: m */
    private static MlltFrame m8775m(ParsableByteArray a0Var, int i) {
        int J = a0Var.mo7368J();
        int G = a0Var.mo7365G();
        int G2 = a0Var.mo7365G();
        int D = a0Var.mo7362D();
        int D2 = a0Var.mo7362D();
        ParsableBitArray zVar = new ParsableBitArray();
        zVar.mo7500m(a0Var);
        int i2 = ((i - 10) * 8) / (D + D2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = zVar.mo7495h(D);
            int h2 = zVar.mo7495h(D2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        MlltFrame kVar = new MlltFrame(J, G, G2, iArr, iArr2);
        return kVar;
    }

    /* renamed from: n */
    private static PrivFrame m8776n(ParsableByteArray a0Var, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        a0Var.mo7385j(bArr, 0, i);
        int x = m8786x(bArr, 0);
        return new PrivFrame(new String(bArr, 0, x, "ISO-8859-1"), m8766c(bArr, x + 1, i));
    }

    /* renamed from: o */
    private static String m8777o(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: p */
    private static TextInformationFrame m8778p(ParsableByteArray a0Var, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int D = a0Var.mo7362D();
        String u = m8783u(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        a0Var.mo7385j(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, m8785w(bArr, 0, D), u));
    }

    /* renamed from: q */
    private static TextInformationFrame m8779q(ParsableByteArray a0Var, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int D = a0Var.mo7362D();
        String u = m8783u(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        a0Var.mo7385j(bArr, 0, i2);
        int w = m8785w(bArr, 0, D);
        String str = new String(bArr, 0, w, u);
        int t = w + m8782t(D);
        return new TextInformationFrame("TXXX", str, m8777o(bArr, t, m8785w(bArr, t, D), u));
    }

    /* renamed from: r */
    private static UrlLinkFrame m8780r(ParsableByteArray a0Var, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        a0Var.mo7385j(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m8786x(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: s */
    private static UrlLinkFrame m8781s(ParsableByteArray a0Var, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int D = a0Var.mo7362D();
        String u = m8783u(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        a0Var.mo7385j(bArr, 0, i2);
        int w = m8785w(bArr, 0, D);
        String str = new String(bArr, 0, w, u);
        int t = w + m8782t(D);
        return new UrlLinkFrame("WXXX", str, m8777o(bArr, t, m8786x(bArr, t), "ISO-8859-1"));
    }

    /* renamed from: t */
    private static int m8782t(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: u */
    private static String m8783u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: v */
    private static String m8784v(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: w */
    private static int m8785w(byte[] bArr, int i, int i2) {
        int x = m8786x(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return x;
        }
        while (x < bArr.length - 1) {
            if (x % 2 == 0 && bArr[x + 1] == 0) {
                return x;
            }
            x = m8786x(bArr, x + 1);
        }
        return bArr.length;
    }

    /* renamed from: x */
    private static int m8786x(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: y */
    static /* synthetic */ boolean m8787y(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: z */
    private static int m8788z(ParsableByteArray a0Var, int i) {
        byte[] d = a0Var.mo7379d();
        int e = a0Var.mo7380e();
        int i2 = e;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= e + i) {
                return i;
            }
            if ((d[i2] & 255) == 255 && d[i3] == 0) {
                System.arraycopy(d, i2 + 2, d, i3, (i - (i2 - e)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Metadata mo6566b(MetadataInputBuffer eVar, ByteBuffer byteBuffer) {
        return mo6665d(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: d */
    public Metadata mo6665d(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray a0Var = new ParsableByteArray(bArr, i);
        C1051b l = m8774l(a0Var);
        if (l == null) {
            return null;
        }
        int e = a0Var.mo7380e();
        int i2 = l.f7296a == 2 ? 6 : 10;
        int b = l.f7298c;
        if (l.f7297b) {
            b = m8788z(a0Var, l.f7298c);
        }
        a0Var.mo7373O(e + b);
        boolean z = false;
        if (!m8765A(a0Var, l.f7296a, i2, false)) {
            if (l.f7296a != 4 || !m8765A(a0Var, 4, i2, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(l.f7296a);
                Log.m10386h("Id3Decoder", sb.toString());
                return null;
            }
            z = true;
        }
        while (a0Var.mo7376a() >= i2) {
            Id3Frame j = m8772j(l.f7296a, a0Var, z, i2, this.f7295b);
            if (j != null) {
                arrayList.add(j);
            }
        }
        return new Metadata((List<? extends C1034b>) arrayList);
    }

    public Id3Decoder(C1050a aVar) {
        this.f7295b = aVar;
    }
}
