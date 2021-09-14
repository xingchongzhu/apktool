package p067c.google.p138c.p148n.p149b;

import com.umeng.umcrash.C3276R;

/* renamed from: c.a.c.n.b.c */
public final class Version {

    /* renamed from: a */
    private static final int[] f10151a = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: b */
    private static final Version[] f10152b = m12304a();

    /* renamed from: c */
    private final int f10153c;

    /* renamed from: d */
    private final int[] f10154d;

    /* renamed from: e */
    private final C1402b[] f10155e;

    /* renamed from: f */
    private final int f10156f;

    /* renamed from: c.a.c.n.b.c$a */
    /* compiled from: Version */
    public static final class C1401a {

        /* renamed from: a */
        private final int f10157a;

        /* renamed from: b */
        private final int f10158b;

        C1401a(int i, int i2) {
            this.f10157a = i;
            this.f10158b = i2;
        }

        /* renamed from: a */
        public int mo8659a() {
            return this.f10157a;
        }

        /* renamed from: b */
        public int mo8660b() {
            return this.f10158b;
        }
    }

    /* renamed from: c.a.c.n.b.c$b */
    /* compiled from: Version */
    public static final class C1402b {

        /* renamed from: a */
        private final int f10159a;

        /* renamed from: b */
        private final C1401a[] f10160b;

        C1402b(int i, C1401a... aVarArr) {
            this.f10159a = i;
            this.f10160b = aVarArr;
        }

        /* renamed from: a */
        public C1401a[] mo8661a() {
            return this.f10160b;
        }

        /* renamed from: b */
        public int mo8662b() {
            return this.f10159a;
        }

        /* renamed from: c */
        public int mo8663c() {
            int i = 0;
            for (C1401a a : this.f10160b) {
                i += a.mo8659a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo8664d() {
            return this.f10159a * mo8663c();
        }
    }

    private Version(int i, int[] iArr, C1402b... bVarArr) {
        this.f10153c = i;
        this.f10154d = iArr;
        this.f10155e = bVarArr;
        int b = bVarArr[0].mo8662b();
        int i2 = 0;
        for (C1401a aVar : bVarArr[0].mo8661a()) {
            i2 += aVar.mo8659a() * (aVar.mo8660b() + b);
        }
        this.f10156f = i2;
    }

    /* renamed from: a */
    private static Version[] m12304a() {
        return new Version[]{new Version(1, new int[0], new C1402b(7, new C1401a(1, 19)), new C1402b(10, new C1401a(1, 16)), new C1402b(13, new C1401a(1, 13)), new C1402b(17, new C1401a(1, 9))), new Version(2, new int[]{6, 18}, new C1402b(10, new C1401a(1, 34)), new C1402b(16, new C1401a(1, 28)), new C1402b(22, new C1401a(1, 22)), new C1402b(28, new C1401a(1, 16))), new Version(3, new int[]{6, 22}, new C1402b(15, new C1401a(1, 55)), new C1402b(26, new C1401a(1, 44)), new C1402b(18, new C1401a(2, 17)), new C1402b(22, new C1401a(2, 13))), new Version(4, new int[]{6, 26}, new C1402b(20, new C1401a(1, 80)), new C1402b(18, new C1401a(2, 32)), new C1402b(26, new C1401a(2, 24)), new C1402b(16, new C1401a(4, 9))), new Version(5, new int[]{6, 30}, new C1402b(26, new C1401a(1, 108)), new C1402b(24, new C1401a(2, 43)), new C1402b(18, new C1401a(2, 15), new C1401a(2, 16)), new C1402b(22, new C1401a(2, 11), new C1401a(2, 12))), new Version(6, new int[]{6, 34}, new C1402b(18, new C1401a(2, 68)), new C1402b(16, new C1401a(4, 27)), new C1402b(24, new C1401a(4, 19)), new C1402b(28, new C1401a(4, 15))), new Version(7, new int[]{6, 22, 38}, new C1402b(20, new C1401a(2, 78)), new C1402b(18, new C1401a(4, 31)), new C1402b(18, new C1401a(2, 14), new C1401a(4, 15)), new C1402b(26, new C1401a(4, 13), new C1401a(1, 14))), new Version(8, new int[]{6, 24, 42}, new C1402b(24, new C1401a(2, 97)), new C1402b(22, new C1401a(2, 38), new C1401a(2, 39)), new C1402b(22, new C1401a(4, 18), new C1401a(2, 19)), new C1402b(26, new C1401a(4, 14), new C1401a(2, 15))), new Version(9, new int[]{6, 26, 46}, new C1402b(30, new C1401a(2, 116)), new C1402b(22, new C1401a(3, 36), new C1401a(2, 37)), new C1402b(20, new C1401a(4, 16), new C1401a(4, 17)), new C1402b(24, new C1401a(4, 12), new C1401a(4, 13))), new Version(10, new int[]{6, 28, 50}, new C1402b(18, new C1401a(2, 68), new C1401a(2, 69)), new C1402b(26, new C1401a(4, 43), new C1401a(1, 44)), new C1402b(24, new C1401a(6, 19), new C1401a(2, 20)), new C1402b(28, new C1401a(6, 15), new C1401a(2, 16))), new Version(11, new int[]{6, 30, 54}, new C1402b(20, new C1401a(4, 81)), new C1402b(30, new C1401a(1, 50), new C1401a(4, 51)), new C1402b(28, new C1401a(4, 22), new C1401a(4, 23)), new C1402b(24, new C1401a(3, 12), new C1401a(8, 13))), new Version(12, new int[]{6, 32, 58}, new C1402b(24, new C1401a(2, 92), new C1401a(2, 93)), new C1402b(22, new C1401a(6, 36), new C1401a(2, 37)), new C1402b(26, new C1401a(4, 20), new C1401a(6, 21)), new C1402b(28, new C1401a(7, 14), new C1401a(4, 15))), new Version(13, new int[]{6, 34, 62}, new C1402b(26, new C1401a(4, 107)), new C1402b(22, new C1401a(8, 37), new C1401a(1, 38)), new C1402b(24, new C1401a(8, 20), new C1401a(4, 21)), new C1402b(22, new C1401a(12, 11), new C1401a(4, 12))), new Version(14, new int[]{6, 26, 46, 66}, new C1402b(30, new C1401a(3, C3276R.styleable.AppCompatTheme_tooltipFrameBackground), new C1401a(1, 116)), new C1402b(24, new C1401a(4, 40), new C1401a(5, 41)), new C1402b(20, new C1401a(11, 16), new C1401a(5, 17)), new C1402b(24, new C1401a(11, 12), new C1401a(5, 13))), new Version(15, new int[]{6, 26, 48, 70}, new C1402b(22, new C1401a(5, 87), new C1401a(1, 88)), new C1402b(24, new C1401a(5, 41), new C1401a(5, 42)), new C1402b(30, new C1401a(5, 24), new C1401a(7, 25)), new C1402b(24, new C1401a(11, 12), new C1401a(7, 13))), new Version(16, new int[]{6, 26, 50, 74}, new C1402b(24, new C1401a(5, 98), new C1401a(1, 99)), new C1402b(28, new C1401a(7, 45), new C1401a(3, 46)), new C1402b(24, new C1401a(15, 19), new C1401a(2, 20)), new C1402b(30, new C1401a(3, 15), new C1401a(13, 16))), new Version(17, new int[]{6, 30, 54, 78}, new C1402b(28, new C1401a(1, 107), new C1401a(5, 108)), new C1402b(28, new C1401a(10, 46), new C1401a(1, 47)), new C1402b(28, new C1401a(1, 22), new C1401a(15, 23)), new C1402b(28, new C1401a(2, 14), new C1401a(17, 15))), new Version(18, new int[]{6, 30, 56, 82}, new C1402b(30, new C1401a(5, 120), new C1401a(1, 121)), new C1402b(26, new C1401a(9, 43), new C1401a(4, 44)), new C1402b(28, new C1401a(17, 22), new C1401a(1, 23)), new C1402b(28, new C1401a(2, 14), new C1401a(19, 15))), new Version(19, new int[]{6, 30, 58, 86}, new C1402b(28, new C1401a(3, 113), new C1401a(4, 114)), new C1402b(26, new C1401a(3, 44), new C1401a(11, 45)), new C1402b(26, new C1401a(17, 21), new C1401a(4, 22)), new C1402b(26, new C1401a(9, 13), new C1401a(16, 14))), new Version(20, new int[]{6, 34, 62, 90}, new C1402b(28, new C1401a(3, 107), new C1401a(5, 108)), new C1402b(26, new C1401a(3, 41), new C1401a(13, 42)), new C1402b(30, new C1401a(15, 24), new C1401a(5, 25)), new C1402b(28, new C1401a(15, 15), new C1401a(10, 16))), new Version(21, new int[]{6, 28, 50, 72, 94}, new C1402b(28, new C1401a(4, 116), new C1401a(4, 117)), new C1402b(26, new C1401a(17, 42)), new C1402b(28, new C1401a(17, 22), new C1401a(6, 23)), new C1402b(30, new C1401a(19, 16), new C1401a(6, 17))), new Version(22, new int[]{6, 26, 50, 74, 98}, new C1402b(28, new C1401a(2, 111), new C1401a(7, 112)), new C1402b(28, new C1401a(17, 46)), new C1402b(30, new C1401a(7, 24), new C1401a(16, 25)), new C1402b(24, new C1401a(34, 13))), new Version(23, new int[]{6, 30, 54, 78, 102}, new C1402b(30, new C1401a(4, 121), new C1401a(5, 122)), new C1402b(28, new C1401a(4, 47), new C1401a(14, 48)), new C1402b(30, new C1401a(11, 24), new C1401a(14, 25)), new C1402b(30, new C1401a(16, 15), new C1401a(14, 16))), new Version(24, new int[]{6, 28, 54, 80, 106}, new C1402b(30, new C1401a(6, 117), new C1401a(4, 118)), new C1402b(28, new C1401a(6, 45), new C1401a(14, 46)), new C1402b(30, new C1401a(11, 24), new C1401a(16, 25)), new C1402b(30, new C1401a(30, 16), new C1401a(2, 17))), new Version(25, new int[]{6, 32, 58, 84, 110}, new C1402b(26, new C1401a(8, 106), new C1401a(4, 107)), new C1402b(28, new C1401a(8, 47), new C1401a(13, 48)), new C1402b(30, new C1401a(7, 24), new C1401a(22, 25)), new C1402b(30, new C1401a(22, 15), new C1401a(13, 16))), new Version(26, new int[]{6, 30, 58, 86, 114}, new C1402b(28, new C1401a(10, 114), new C1401a(2, C3276R.styleable.AppCompatTheme_tooltipFrameBackground)), new C1402b(28, new C1401a(19, 46), new C1401a(4, 47)), new C1402b(28, new C1401a(28, 22), new C1401a(6, 23)), new C1402b(30, new C1401a(33, 16), new C1401a(4, 17))), new Version(27, new int[]{6, 34, 62, 90, 118}, new C1402b(30, new C1401a(8, 122), new C1401a(4, 123)), new C1402b(28, new C1401a(22, 45), new C1401a(3, 46)), new C1402b(30, new C1401a(8, 23), new C1401a(26, 24)), new C1402b(30, new C1401a(12, 15), new C1401a(28, 16))), new Version(28, new int[]{6, 26, 50, 74, 98, 122}, new C1402b(30, new C1401a(3, 117), new C1401a(10, 118)), new C1402b(28, new C1401a(3, 45), new C1401a(23, 46)), new C1402b(30, new C1401a(4, 24), new C1401a(31, 25)), new C1402b(30, new C1401a(11, 15), new C1401a(31, 16))), new Version(29, new int[]{6, 30, 54, 78, 102, 126}, new C1402b(30, new C1401a(7, 116), new C1401a(7, 117)), new C1402b(28, new C1401a(21, 45), new C1401a(7, 46)), new C1402b(30, new C1401a(1, 23), new C1401a(37, 24)), new C1402b(30, new C1401a(19, 15), new C1401a(26, 16))), new Version(30, new int[]{6, 26, 52, 78, 104, 130}, new C1402b(30, new C1401a(5, C3276R.styleable.AppCompatTheme_tooltipFrameBackground), new C1401a(10, 116)), new C1402b(28, new C1401a(19, 47), new C1401a(10, 48)), new C1402b(30, new C1401a(15, 24), new C1401a(25, 25)), new C1402b(30, new C1401a(23, 15), new C1401a(25, 16))), new Version(31, new int[]{6, 30, 56, 82, 108, 134}, new C1402b(30, new C1401a(13, C3276R.styleable.AppCompatTheme_tooltipFrameBackground), new C1401a(3, 116)), new C1402b(28, new C1401a(2, 46), new C1401a(29, 47)), new C1402b(30, new C1401a(42, 24), new C1401a(1, 25)), new C1402b(30, new C1401a(23, 15), new C1401a(28, 16))), new Version(32, new int[]{6, 34, 60, 86, 112, 138}, new C1402b(30, new C1401a(17, C3276R.styleable.AppCompatTheme_tooltipFrameBackground)), new C1402b(28, new C1401a(10, 46), new C1401a(23, 47)), new C1402b(30, new C1401a(10, 24), new C1401a(35, 25)), new C1402b(30, new C1401a(19, 15), new C1401a(35, 16))), new Version(33, new int[]{6, 30, 58, 86, 114, 142}, new C1402b(30, new C1401a(17, C3276R.styleable.AppCompatTheme_tooltipFrameBackground), new C1401a(1, 116)), new C1402b(28, new C1401a(14, 46), new C1401a(21, 47)), new C1402b(30, new C1401a(29, 24), new C1401a(19, 25)), new C1402b(30, new C1401a(11, 15), new C1401a(46, 16))), new Version(34, new int[]{6, 34, 62, 90, 118, 146}, new C1402b(30, new C1401a(13, C3276R.styleable.AppCompatTheme_tooltipFrameBackground), new C1401a(6, 116)), new C1402b(28, new C1401a(14, 46), new C1401a(23, 47)), new C1402b(30, new C1401a(44, 24), new C1401a(7, 25)), new C1402b(30, new C1401a(59, 16), new C1401a(1, 17))), new Version(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C1402b(30, new C1401a(12, 121), new C1401a(7, 122)), new C1402b(28, new C1401a(12, 47), new C1401a(26, 48)), new C1402b(30, new C1401a(39, 24), new C1401a(14, 25)), new C1402b(30, new C1401a(22, 15), new C1401a(41, 16))), new Version(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C1402b(30, new C1401a(6, 121), new C1401a(14, 122)), new C1402b(28, new C1401a(6, 47), new C1401a(34, 48)), new C1402b(30, new C1401a(46, 24), new C1401a(10, 25)), new C1402b(30, new C1401a(2, 15), new C1401a(64, 16))), new Version(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C1402b(30, new C1401a(17, 122), new C1401a(4, 123)), new C1402b(28, new C1401a(29, 46), new C1401a(14, 47)), new C1402b(30, new C1401a(49, 24), new C1401a(10, 25)), new C1402b(30, new C1401a(24, 15), new C1401a(46, 16))), new Version(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C1402b(30, new C1401a(4, 122), new C1401a(18, 123)), new C1402b(28, new C1401a(13, 46), new C1401a(32, 47)), new C1402b(30, new C1401a(48, 24), new C1401a(14, 25)), new C1402b(30, new C1401a(42, 15), new C1401a(32, 16))), new Version(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C1402b(30, new C1401a(20, 117), new C1401a(4, 118)), new C1402b(28, new C1401a(40, 47), new C1401a(7, 48)), new C1402b(30, new C1401a(43, 24), new C1401a(22, 25)), new C1402b(30, new C1401a(10, 15), new C1401a(67, 16))), new Version(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C1402b(30, new C1401a(19, 118), new C1401a(6, 119)), new C1402b(28, new C1401a(18, 47), new C1401a(31, 48)), new C1402b(30, new C1401a(34, 24), new C1401a(34, 25)), new C1402b(30, new C1401a(20, 15), new C1401a(61, 16)))};
    }

    /* renamed from: e */
    public static Version m12305e(int i) {
        if (i > 0 && i <= 40) {
            return f10152b[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo8654b() {
        return (this.f10153c * 4) + 17;
    }

    /* renamed from: c */
    public C1402b mo8655c(ErrorCorrectionLevel aVar) {
        return this.f10155e[aVar.ordinal()];
    }

    /* renamed from: d */
    public int mo8656d() {
        return this.f10156f;
    }

    /* renamed from: f */
    public int mo8657f() {
        return this.f10153c;
    }

    public String toString() {
        return String.valueOf(this.f10153c);
    }
}
