package p067c.google.p138c.p145l;

/* renamed from: c.a.c.l.a */
public final class CodaBarReader extends OneDReader {

    /* renamed from: a */
    static final char[] f10070a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b */
    static final int[] f10071b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c */
    private static final char[] f10072c = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    static boolean m12224a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
