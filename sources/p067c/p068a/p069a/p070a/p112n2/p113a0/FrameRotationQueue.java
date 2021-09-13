package p067c.p068a.p069a.p070a.p112n2.p113a0;

import android.opengl.Matrix;
import p067c.p068a.p069a.p070a.p111m2.TimedValueQueue;

/* renamed from: c.a.a.a.n2.a0.c */
public final class FrameRotationQueue {

    /* renamed from: a */
    private final float[] f8487a = new float[16];

    /* renamed from: b */
    private final float[] f8488b = new float[16];

    /* renamed from: c */
    private final TimedValueQueue<float[]> f8489c = new TimedValueQueue<>();

    /* renamed from: d */
    private boolean f8490d;

    /* renamed from: a */
    public static void m10483a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((double) ((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8])));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    /* renamed from: b */
    private static void m10484b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    /* renamed from: c */
    public boolean mo7518c(float[] fArr, long j) {
        float[] fArr2 = (float[]) this.f8489c.mo7440j(j);
        if (fArr2 == null) {
            return false;
        }
        m10484b(this.f8488b, fArr2);
        if (!this.f8490d) {
            m10483a(this.f8487a, this.f8488b);
            this.f8490d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f8487a, 0, this.f8488b, 0);
        return true;
    }

    /* renamed from: d */
    public void mo7519d() {
        this.f8489c.mo7437c();
        this.f8490d = false;
    }

    /* renamed from: e */
    public void mo7520e(long j, float[] fArr) {
        this.f8489c.mo7436a(j, fArr);
    }
}
