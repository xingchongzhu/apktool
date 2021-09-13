package p067c.p068a.p069a.p070a;

/* renamed from: c.a.a.a.t0 */
public final class ExoTimeoutException extends Exception {

    /* renamed from: a */
    public final int f8795a;

    public ExoTimeoutException(int i) {
        super(m10922a(i));
        this.f8795a = i;
    }

    /* renamed from: a */
    private static String m10922a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
