package p067c.p068a.p138c.p148n.p150c;

/* renamed from: c.a.c.n.c.d */
final class MaskUtil {
    /* renamed from: a */
    static int m12347a(ByteMatrix bVar) {
        return m12348b(bVar, true) + m12348b(bVar, false);
    }

    /* renamed from: b */
    private static int m12348b(ByteMatrix bVar, boolean z) {
        int d = z ? bVar.mo8670d() : bVar.mo8671e();
        int e = z ? bVar.mo8671e() : bVar.mo8670d();
        byte[][] c = bVar.mo8669c();
        int i = 0;
        int i2 = 0;
        while (i < d) {
            byte b = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < e) {
                byte b2 = z ? c[i][i3] : c[i3][i];
                if (b2 == b) {
                    i4++;
                } else {
                    if (i4 >= 5) {
                        i2 += (i4 - 5) + 3;
                    }
                    b = b2;
                    i4 = 1;
                }
                i3++;
            }
            if (i4 >= 5) {
                i2 += (i4 - 5) + 3;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: c */
    static int m12349c(ByteMatrix bVar) {
        byte[][] c = bVar.mo8669c();
        int e = bVar.mo8671e();
        int d = bVar.mo8670d();
        int i = 0;
        for (int i2 = 0; i2 < d - 1; i2++) {
            byte[] bArr = c[i2];
            int i3 = 0;
            while (i3 < e - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    int i5 = i2 + 1;
                    if (b == c[i5][i3] && b == c[i5][i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* renamed from: d */
    static int m12350d(ByteMatrix bVar) {
        byte[][] c = bVar.mo8669c();
        int e = bVar.mo8671e();
        int d = bVar.mo8670d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            for (int i3 = 0; i3 < e; i3++) {
                byte[] bArr = c[i2];
                int i4 = i3 + 6;
                if (i4 < e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m12353g(bArr, i3 - 4, i3) || m12353g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < d && c[i2][i3] == 1 && c[i2 + 1][i3] == 0 && c[i2 + 2][i3] == 1 && c[i2 + 3][i3] == 1 && c[i2 + 4][i3] == 1 && c[i2 + 5][i3] == 0 && c[i5][i3] == 1 && (m12354h(c, i3, i2 - 4, i2) || m12354h(c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* renamed from: e */
    static int m12351e(ByteMatrix bVar) {
        byte[][] c = bVar.mo8669c();
        int e = bVar.mo8671e();
        int d = bVar.mo8670d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            byte[] bArr = c[i2];
            for (int i3 = 0; i3 < e; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int d2 = bVar.mo8670d() * bVar.mo8671e();
        return ((Math.abs((i << 1) - d2) * 10) / d2) * 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r1 != 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r1 = r1 & 1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m12352f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L_0x003a;
                case 1: goto L_0x003b;
                case 2: goto L_0x0037;
                case 3: goto L_0x0033;
                case 4: goto L_0x002e;
                case 5: goto L_0x0026;
                case 6: goto L_0x001d;
                case 7: goto L_0x0014;
                default: goto L_0x0004;
            }
        L_0x0004:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0014:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L_0x0024
        L_0x001d:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L_0x0024:
            r1 = r1 & r0
            goto L_0x003d
        L_0x0026:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x003d
        L_0x002e:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L_0x003a
        L_0x0033:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x003d
        L_0x0037:
            int r1 = r2 % 3
            goto L_0x003d
        L_0x003a:
            int r3 = r3 + r2
        L_0x003b:
            r1 = r3 & 1
        L_0x003d:
            if (r1 != 0) goto L_0x0040
            return r0
        L_0x0040:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p138c.p148n.p150c.MaskUtil.m12352f(int, int, int):boolean");
    }

    /* renamed from: g */
    private static boolean m12353g(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m12354h(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
