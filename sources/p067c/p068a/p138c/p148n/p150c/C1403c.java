package p067c.p068a.p138c.p148n.p150c;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import p067c.p068a.p138c.WriterException;
import p067c.p068a.p138c.p141j.BitArray;
import p067c.p068a.p138c.p141j.CharacterSetECI;
import p067c.p068a.p138c.p141j.p142d.GenericGF;
import p067c.p068a.p138c.p141j.p142d.ReedSolomonEncoder;
import p067c.p068a.p138c.p148n.p149b.ErrorCorrectionLevel;
import p067c.p068a.p138c.p148n.p149b.Mode;
import p067c.p068a.p138c.p148n.p149b.Version;

/* renamed from: c.a.c.n.c.c */
/* compiled from: Encoder */
public final class C1403c {

    /* renamed from: a */
    private static final int[] f10166a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: c.a.c.n.c.c$a */
    /* compiled from: Encoder */
    static /* synthetic */ class C1404a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10167a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                c.a.c.n.b.b[] r0 = p067c.p068a.p138c.p148n.p149b.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10167a = r0
                c.a.c.n.b.b r1 = p067c.p068a.p138c.p148n.p149b.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10167a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.c.n.b.b r1 = p067c.p068a.p138c.p148n.p149b.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10167a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.a.c.n.b.b r1 = p067c.p068a.p138c.p148n.p149b.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10167a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.a.c.n.b.b r1 = p067c.p068a.p138c.p148n.p149b.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p138c.p148n.p150c.C1403c.C1404a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static void m12325a(String str, BitArray aVar, String str2) throws WriterException {
        try {
            for (byte c : str.getBytes(str2)) {
                aVar.mo8555c(c, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException((Throwable) e);
        }
    }

    /* renamed from: b */
    static void m12326b(CharSequence charSequence, BitArray aVar) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int p = m12340p(charSequence.charAt(i));
            if (p != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int p2 = m12340p(charSequence.charAt(i2));
                    if (p2 != -1) {
                        aVar.mo8555c((p * 45) + p2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.mo8555c(p, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    static void m12327c(String str, Mode bVar, BitArray aVar, String str2) throws WriterException {
        int i = C1404a.f10167a[bVar.ordinal()];
        if (i == 1) {
            m12332h(str, aVar);
        } else if (i == 2) {
            m12326b(str, aVar);
        } else if (i == 3) {
            m12325a(str, aVar, str2);
        } else if (i == 4) {
            m12329e(str, aVar);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(bVar)));
        }
    }

    /* renamed from: d */
    private static void m12328d(CharacterSetECI cVar, BitArray aVar) {
        aVar.mo8555c(Mode.ECI.mo8652a(), 4);
        aVar.mo8555c(cVar.mo8578b(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:6:0x000f->B:19:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m12329e(java.lang.String r6, p067c.p068a.p138c.p141j.BitArray r7) throws p067c.p068a.p138c.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x005c }
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0054
            int r0 = r6.length
            int r0 = r0 + -1
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0053
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x002b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x002b
        L_0x0029:
            int r2 = r2 - r3
            goto L_0x003a
        L_0x002b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0039
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0039
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0029
        L_0x0039:
            r2 = -1
        L_0x003a:
            if (r2 == r4) goto L_0x004b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo8555c(r3, r2)
            int r1 = r1 + 2
            goto L_0x000f
        L_0x004b:
            c.a.c.h r6 = new c.a.c.h
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x0053:
            return
        L_0x0054:
            c.a.c.h r6 = new c.a.c.h
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>(r7)
            throw r6
        L_0x005c:
            r6 = move-exception
            c.a.c.h r7 = new c.a.c.h
            r7.<init>(r6)
            goto L_0x0064
        L_0x0063:
            throw r7
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p138c.p148n.p150c.C1403c.m12329e(java.lang.String, c.a.c.j.a):void");
    }

    /* renamed from: f */
    static void m12330f(int i, Version cVar, Mode bVar, BitArray aVar) throws WriterException {
        int b = bVar.mo8653b(cVar);
        int i2 = 1 << b;
        if (i < i2) {
            aVar.mo8555c(i, b);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is bigger than ");
        sb.append(i2 - 1);
        throw new WriterException(sb.toString());
    }

    /* renamed from: g */
    static void m12331g(Mode bVar, BitArray aVar) {
        aVar.mo8555c(bVar.mo8652a(), 4);
    }

    /* renamed from: h */
    static void m12332h(CharSequence charSequence, BitArray aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo8555c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo8555c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo8555c(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m12333i(Mode bVar, BitArray aVar, BitArray aVar2, Version cVar) {
        return aVar.mo8560g() + bVar.mo8653b(cVar) + aVar2.mo8560g();
    }

    /* renamed from: j */
    private static int m12334j(ByteMatrix bVar) {
        return MaskUtil.m12347a(bVar) + MaskUtil.m12349c(bVar) + MaskUtil.m12350d(bVar) + MaskUtil.m12351e(bVar);
    }

    /* renamed from: k */
    private static int m12335k(BitArray aVar, ErrorCorrectionLevel aVar2, Version cVar, ByteMatrix bVar) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            MatrixUtil.m12355a(aVar, aVar2, cVar, i3, bVar);
            int j = m12334j(bVar);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private static Mode m12336l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m12343s(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m12340p(charAt) == -1) {
                return Mode.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        if (z2) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    /* renamed from: m */
    private static Version m12337m(int i, ErrorCorrectionLevel aVar) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            Version e = Version.m12305e(i2);
            if (m12346v(i, e, aVar)) {
                return e;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p067c.p068a.p138c.p148n.p150c.QRCode m12338n(java.lang.String r7, p067c.p068a.p138c.p148n.p149b.ErrorCorrectionLevel r8, java.util.Map<p067c.p068a.p138c.EncodeHintType, ?> r9) throws p067c.p068a.p138c.WriterException {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x000e
            c.a.c.c r2 = p067c.p068a.p138c.EncodeHintType.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x001c
            c.a.c.c r3 = p067c.p068a.p138c.EncodeHintType.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r3 = "ISO-8859-1"
        L_0x001e:
            c.a.c.n.b.b r4 = m12336l(r7, r3)
            c.a.c.j.a r5 = new c.a.c.j.a
            r5.<init>()
            c.a.c.n.b.b r6 = p067c.p068a.p138c.p148n.p149b.Mode.BYTE
            if (r4 != r6) goto L_0x0036
            if (r2 == 0) goto L_0x0036
            c.a.c.j.c r2 = p067c.p068a.p138c.p141j.CharacterSetECI.m12115a(r3)
            if (r2 == 0) goto L_0x0036
            m12328d(r2, r5)
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            c.a.c.c r2 = p067c.p068a.p138c.EncodeHintType.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x005d
            c.a.c.c r0 = p067c.p068a.p138c.EncodeHintType.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005d
            c.a.c.n.b.b r0 = p067c.p068a.p138c.p148n.p149b.Mode.FNC1_FIRST_POSITION
            m12331g(r0, r5)
        L_0x005d:
            m12331g(r4, r5)
            c.a.c.j.a r0 = new c.a.c.j.a
            r0.<init>()
            m12327c(r7, r4, r0, r3)
            if (r9 == 0) goto L_0x0095
            c.a.c.c r1 = p067c.p068a.p138c.EncodeHintType.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x0095
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            c.a.c.n.b.c r9 = p067c.p068a.p138c.p148n.p149b.Version.m12305e(r9)
            int r1 = m12333i(r4, r5, r0, r9)
            boolean r1 = m12346v(r1, r9, r8)
            if (r1 == 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            c.a.c.h r7 = new c.a.c.h
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>(r8)
            throw r7
        L_0x0095:
            c.a.c.n.b.c r9 = m12344t(r8, r4, r5, r0)
        L_0x0099:
            c.a.c.j.a r1 = new c.a.c.j.a
            r1.<init>()
            r1.mo8554b(r5)
            if (r4 != r6) goto L_0x00a8
            int r7 = r0.mo8561h()
            goto L_0x00ac
        L_0x00a8:
            int r7 = r7.length()
        L_0x00ac:
            m12330f(r7, r9, r4, r1)
            r1.mo8554b(r0)
            c.a.c.n.b.c$b r7 = r9.mo8655c(r8)
            int r0 = r9.mo8656d()
            int r2 = r7.mo8664d()
            int r0 = r0 - r2
            m12345u(r0, r1)
            int r2 = r9.mo8656d()
            int r7 = r7.mo8663c()
            c.a.c.j.a r7 = m12342r(r1, r2, r0, r7)
            c.a.c.n.c.f r0 = new c.a.c.n.c.f
            r0.<init>()
            r0.mo8676c(r8)
            r0.mo8679f(r4)
            r0.mo8680g(r9)
            int r1 = r9.mo8654b()
            c.a.c.n.c.b r2 = new c.a.c.n.c.b
            r2.<init>(r1, r1)
            int r1 = m12335k(r7, r8, r9, r2)
            r0.mo8677d(r1)
            p067c.p068a.p138c.p148n.p150c.MatrixUtil.m12355a(r7, r8, r9, r1, r2)
            r0.mo8678e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p138c.p148n.p150c.C1403c.m12338n(java.lang.String, c.a.c.n.b.a, java.util.Map):c.a.c.n.c.f");
    }

    /* renamed from: o */
    static byte[] m12339o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new ReedSolomonEncoder(GenericGF.f10024e).mo8596b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: p */
    static int m12340p(int i) {
        int[] iArr = f10166a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: q */
    static void m12341q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    /* renamed from: r */
    static BitArray m12342r(BitArray aVar, int i, int i2, int i3) throws WriterException {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo8561h() == i5) {
            ArrayList<BlockPair> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int[] iArr3 = iArr2;
                m12341q(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.mo8563j(i7 << 3, bArr, 0, i11);
                byte[] o = m12339o(bArr, iArr3[0]);
                arrayList.add(new BlockPair(bArr, o));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, o.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                BitArray aVar2 = new BitArray();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (BlockPair a : arrayList) {
                        byte[] a2 = a.mo8665a();
                        if (i12 < a2.length) {
                            aVar2.mo8555c(a2[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (BlockPair b : arrayList) {
                        byte[] b2 = b.mo8666b();
                        if (i13 < b2.length) {
                            aVar2.mo8555c(b2[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo8561h()) {
                    return aVar2;
                }
                StringBuilder sb = new StringBuilder("Interleaving error: ");
                sb.append(i4);
                sb.append(" and ");
                sb.append(aVar2.mo8561h());
                sb.append(" differ.");
                throw new WriterException(sb.toString());
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: s */
    private static boolean m12343s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static Version m12344t(ErrorCorrectionLevel aVar, Mode bVar, BitArray aVar2, BitArray aVar3) throws WriterException {
        return m12337m(m12333i(bVar, aVar2, aVar3, m12337m(m12333i(bVar, aVar2, aVar3, Version.m12305e(1)), aVar)), aVar);
    }

    /* renamed from: u */
    static void m12345u(int i, BitArray aVar) throws WriterException {
        int i2 = i << 3;
        if (aVar.mo8560g() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo8560g() < i2; i3++) {
                aVar.mo8553a(false);
            }
            int g = aVar.mo8560g() & 7;
            if (g > 0) {
                while (g < 8) {
                    aVar.mo8553a(false);
                    g++;
                }
            }
            int h = i - aVar.mo8561h();
            for (int i4 = 0; i4 < h; i4++) {
                aVar.mo8555c((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.mo8560g() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
        sb.append(aVar.mo8560g());
        sb.append(" > ");
        sb.append(i2);
        throw new WriterException(sb.toString());
    }

    /* renamed from: v */
    private static boolean m12346v(int i, Version cVar, ErrorCorrectionLevel aVar) {
        return cVar.mo8656d() - cVar.mo8655c(aVar).mo8664d() >= (i + 7) / 8;
    }
}
