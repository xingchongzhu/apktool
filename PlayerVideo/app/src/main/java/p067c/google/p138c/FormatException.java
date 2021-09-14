package p067c.google.p138c;

/* renamed from: c.a.c.d */
public final class FormatException extends ReaderException {

    /* renamed from: c */
    private static final FormatException f9955c;

    static {
        FormatException dVar = new FormatException();
        f9955c = dVar;
        dVar.setStackTrace(ReaderException.f9958b);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m12051a() {
        return ReaderException.f9957a ? new FormatException() : f9955c;
    }
}
