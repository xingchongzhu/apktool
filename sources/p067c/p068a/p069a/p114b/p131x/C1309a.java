package p067c.p068a.p069a.p114b.p131x;

/* renamed from: c.a.a.b.x.a */
/* compiled from: MathUtils */
public final class C1309a {
    /* renamed from: a */
    public static float m11587a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m11588b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m11590d(m11587a(f, f2, f3, f4), m11587a(f, f2, f5, f4), m11587a(f, f2, f5, f6), m11587a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m11589c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m11590d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
