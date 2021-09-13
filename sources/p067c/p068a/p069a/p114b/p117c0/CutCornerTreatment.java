package p067c.p068a.p069a.p114b.p117c0;

/* renamed from: c.a.a.b.c0.e */
public class CutCornerTreatment extends CornerTreatment {

    /* renamed from: a */
    float f9089a = -1.0f;

    /* renamed from: a */
    public void mo7824a(ShapePath mVar, float f, float f2, float f3) {
        mVar.mo7930o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double sin = Math.sin(Math.toRadians((double) f));
        double d = (double) f3;
        Double.isNaN(d);
        double d2 = sin * d;
        double d3 = (double) f2;
        Double.isNaN(d3);
        float f4 = (float) (d2 * d3);
        double sin2 = Math.sin(Math.toRadians((double) (90.0f - f)));
        Double.isNaN(d);
        double d4 = sin2 * d;
        Double.isNaN(d3);
        mVar.mo7928m(f4, (float) (d4 * d3));
    }
}
