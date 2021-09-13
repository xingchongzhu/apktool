package p067c.p068a.p069a.p114b.p119m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: c.a.a.b.m.g */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f9621a = new float[9];

    /* renamed from: b */
    private final float[] f9622b = new float[9];

    /* renamed from: c */
    private final Matrix f9623c = new Matrix();

    /* renamed from: a */
    public Matrix mo7956a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f9621a);
        matrix2.getValues(this.f9622b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f9622b;
            float f2 = fArr[i];
            float[] fArr2 = this.f9621a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f9623c.setValues(this.f9622b);
        return this.f9623c;
    }
}
