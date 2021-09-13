package p010b.p054l.p055a.p056a;

import android.view.animation.Interpolator;

/* renamed from: b.l.a.a.d */
abstract class LookupTableInterpolator implements Interpolator {

    /* renamed from: a */
    private final float[] f4929a;

    /* renamed from: b */
    private final float f4930b;

    protected LookupTableInterpolator(float[] fArr) {
        this.f4929a = fArr;
        this.f4930b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4929a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.f4930b;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.f4929a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
