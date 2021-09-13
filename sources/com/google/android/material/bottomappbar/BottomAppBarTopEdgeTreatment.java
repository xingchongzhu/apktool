package com.google.android.material.bottomappbar;

import p067c.p068a.p069a.p114b.p117c0.EdgeTreatment;
import p067c.p068a.p069a.p114b.p117c0.ShapePath;

/* renamed from: com.google.android.material.bottomappbar.a */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* renamed from: a */
    private float f12592a;

    /* renamed from: b */
    private float f12593b;

    /* renamed from: c */
    private float f12594c;

    /* renamed from: d */
    private float f12595d;

    /* renamed from: e */
    private float f12596e;

    /* renamed from: b */
    public void mo7827b(float f, float f2, float f3, ShapePath mVar) {
        float f4 = f;
        ShapePath mVar2 = mVar;
        float f5 = this.f12594c;
        if (f5 == 0.0f) {
            mVar2.mo7928m(f4, 0.0f);
            return;
        }
        float f6 = ((this.f12593b * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f12592a;
        float f8 = f2 + this.f12596e;
        float f9 = (this.f12595d * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar2.mo7928m(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        mVar2.mo7928m(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        mVar.mo7920a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.mo7920a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.mo7920a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        mVar2.mo7928m(f4, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo15125c() {
        return this.f12595d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo15126d() {
        return this.f12593b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo15127e() {
        return this.f12592a;
    }

    /* renamed from: f */
    public float mo15128f() {
        return this.f12594c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo15129g(float f) {
        if (f >= 0.0f) {
            this.f12595d = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo15130h(float f) {
        this.f12593b = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo15131i(float f) {
        this.f12592a = f;
    }

    /* renamed from: j */
    public void mo15132j(float f) {
        this.f12594c = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo15133k(float f) {
        this.f12596e = f;
    }
}
