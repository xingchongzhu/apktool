package p067c.p068a.p069a.p114b.p124r;

import android.os.Build.VERSION;

/* renamed from: c.a.a.b.r.c */
public class CircularRevealHelper {

    /* renamed from: a */
    public static final int f9683a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f9683a = 2;
        } else if (i >= 18) {
            f9683a = 1;
        } else {
            f9683a = 0;
        }
    }
}
