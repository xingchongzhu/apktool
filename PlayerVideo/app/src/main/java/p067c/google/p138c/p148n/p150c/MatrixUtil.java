package p067c.google.p138c.p148n.p150c;

import com.fasterxml.jackson.core.JsonPointer;
import p067c.google.p138c.WriterException;
import p067c.google.p138c.p141j.BitArray;
import p067c.google.p138c.p148n.p149b.ErrorCorrectionLevel;
import p067c.google.p138c.p148n.p149b.Version;

/* renamed from: c.a.c.n.c.e */
final class MatrixUtil {

    /* renamed from: a */
    private static final int[][] f10168a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f10169b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f10170c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f10171d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static void m12355a(BitArray aVar, ErrorCorrectionLevel aVar2, Version cVar, int i, ByteMatrix bVar) throws WriterException {
        m12357c(bVar);
        m12358d(cVar, bVar);
        m12366l(aVar2, i, bVar);
        m12373s(cVar, bVar);
        m12360f(aVar, i, bVar);
    }

    /* renamed from: b */
    static int m12356b(int i, int i2) {
        if (i2 != 0) {
            int n = m12368n(i2);
            int i3 = i << (n - 1);
            while (m12368n(i3) >= n) {
                i3 ^= i2 << (m12368n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    static void m12357c(ByteMatrix bVar) {
        bVar.mo8667a(-1);
    }

    /* renamed from: d */
    static void m12358d(Version cVar, ByteMatrix bVar) throws WriterException {
        m12364j(bVar);
        m12359e(bVar);
        m12372r(cVar, bVar);
        m12365k(bVar);
    }

    /* renamed from: e */
    private static void m12359e(ByteMatrix bVar) throws WriterException {
        if (bVar.mo8668b(8, bVar.mo8670d() - 8) != 0) {
            bVar.mo8672f(8, bVar.mo8670d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: f */
    static void m12360f(BitArray aVar, int i, ByteMatrix bVar) throws WriterException {
        boolean z;
        int e = bVar.mo8671e() - 1;
        int d = bVar.mo8670d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d >= 0 && d < bVar.mo8670d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (m12369o(bVar.mo8668b(i5, d))) {
                        if (i2 < aVar.mo8560g()) {
                            z = aVar.mo8559f(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && MaskUtil.m12352f(i, i5, d)) {
                            z = !z;
                        }
                        bVar.mo8673g(i5, d, z);
                    }
                }
                d += i3;
            }
            i3 = -i3;
            d += i3;
            e -= 2;
        }
        if (i2 != aVar.mo8560g()) {
            StringBuilder sb = new StringBuilder("Not all bits consumed: ");
            sb.append(i2);
            sb.append(JsonPointer.SEPARATOR);
            sb.append(aVar.mo8560g());
            throw new WriterException(sb.toString());
        }
    }

    /* renamed from: g */
    private static void m12361g(int i, int i2, ByteMatrix bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m12369o(bVar.mo8668b(i4, i2))) {
                bVar.mo8672f(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: h */
    private static void m12362h(int i, int i2, ByteMatrix bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f10169b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo8672f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: i */
    private static void m12363i(int i, int i2, ByteMatrix bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f10168a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo8672f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: j */
    private static void m12364j(ByteMatrix bVar) throws WriterException {
        int length = f10168a[0].length;
        m12363i(0, 0, bVar);
        m12363i(bVar.mo8671e() - length, 0, bVar);
        m12363i(0, bVar.mo8671e() - length, bVar);
        m12361g(0, 7, bVar);
        m12361g(bVar.mo8671e() - 8, 7, bVar);
        m12361g(0, bVar.mo8671e() - 8, bVar);
        m12367m(7, 0, bVar);
        m12367m((bVar.mo8670d() - 7) - 1, 0, bVar);
        m12367m(7, bVar.mo8670d() - 7, bVar);
    }

    /* renamed from: k */
    private static void m12365k(ByteMatrix bVar) {
        int i = 8;
        while (i < bVar.mo8671e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m12369o(bVar.mo8668b(i, 6))) {
                bVar.mo8672f(i, 6, i3);
            }
            if (m12369o(bVar.mo8668b(6, i))) {
                bVar.mo8672f(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    static void m12366l(ErrorCorrectionLevel aVar, int i, ByteMatrix bVar) throws WriterException {
        BitArray aVar2 = new BitArray();
        m12370p(aVar, i, aVar2);
        for (int i2 = 0; i2 < aVar2.mo8560g(); i2++) {
            boolean f = aVar2.mo8559f((aVar2.mo8560g() - 1) - i2);
            int[] iArr = f10171d[i2];
            bVar.mo8673g(iArr[0], iArr[1], f);
            if (i2 < 8) {
                bVar.mo8673g((bVar.mo8671e() - i2) - 1, 8, f);
            } else {
                bVar.mo8673g(8, (bVar.mo8670d() - 7) + (i2 - 8), f);
            }
        }
    }

    /* renamed from: m */
    private static void m12367m(int i, int i2, ByteMatrix bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m12369o(bVar.mo8668b(i, i4))) {
                bVar.mo8672f(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: n */
    static int m12368n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    private static boolean m12369o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    static void m12370p(ErrorCorrectionLevel aVar, int i, BitArray aVar2) throws WriterException {
        if (QRCode.m12374b(i)) {
            int a = (aVar.mo8651a() << 3) | i;
            aVar2.mo8555c(a, 5);
            aVar2.mo8555c(m12356b(a, 1335), 10);
            BitArray aVar3 = new BitArray();
            aVar3.mo8555c(21522, 15);
            aVar2.mo8564k(aVar3);
            if (aVar2.mo8560g() != 15) {
                StringBuilder sb = new StringBuilder("should not happen but we got: ");
                sb.append(aVar2.mo8560g());
                throw new WriterException(sb.toString());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: q */
    static void m12371q(Version cVar, BitArray aVar) throws WriterException {
        aVar.mo8555c(cVar.mo8657f(), 6);
        aVar.mo8555c(m12356b(cVar.mo8657f(), 7973), 12);
        if (aVar.mo8560g() != 18) {
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(aVar.mo8560g());
            throw new WriterException(sb.toString());
        }
    }

    /* renamed from: r */
    private static void m12372r(Version cVar, ByteMatrix bVar) {
        if (cVar.mo8657f() >= 2) {
            int[] iArr = f10170c[cVar.mo8657f() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && m12369o(bVar.mo8668b(i2, i))) {
                            m12362h(i2 - 2, i - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    static void m12373s(Version cVar, ByteMatrix bVar) throws WriterException {
        if (cVar.mo8657f() >= 7) {
            BitArray aVar = new BitArray();
            m12371q(cVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean f = aVar.mo8559f(i);
                    i--;
                    bVar.mo8673g(i2, (bVar.mo8670d() - 11) + i3, f);
                    bVar.mo8673g((bVar.mo8670d() - 11) + i3, i2, f);
                }
            }
        }
    }
}
