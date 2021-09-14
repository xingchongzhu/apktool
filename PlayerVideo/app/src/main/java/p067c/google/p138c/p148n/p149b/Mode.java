package p067c.google.p138c.p148n.p149b;

/* renamed from: c.a.c.n.b.b */
public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: l */
    private final int[] f10149l;

    /* renamed from: m */
    private final int f10150m;

    private Mode(int[] iArr, int i) {
        this.f10149l = iArr;
        this.f10150m = i;
    }

    /* renamed from: a */
    public int mo8652a() {
        return this.f10150m;
    }

    /* renamed from: b */
    public int mo8653b(Version cVar) {
        int f = cVar.mo8657f();
        char c = f <= 9 ? 0 : f <= 26 ? (char) 1 : 2;
        return this.f10149l[c];
    }
}
