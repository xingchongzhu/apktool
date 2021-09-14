package p067c.google.android.p114b.p129v;

import android.content.Context;
import android.graphics.Color;
import p010b.p034g.p035d.ColorUtils;
import p067c.google.android.p114b.C1270b;
import p067c.google.android.p114b.p126s.MaterialColors;
import p067c.google.android.p114b.p133z.MaterialAttributes;

/* renamed from: c.a.a.b.v.a */
public class ElevationOverlayProvider {

    /* renamed from: a */
    private final boolean f9696a;

    /* renamed from: b */
    private final int f9697b;

    /* renamed from: c */
    private final int f9698c;

    /* renamed from: d */
    private final float f9699d;

    public ElevationOverlayProvider(Context context) {
        this.f9696a = MaterialAttributes.m11597b(context, C1270b.elevationOverlayEnabled, false);
        this.f9697b = MaterialColors.m11573a(context, C1270b.elevationOverlayColor, 0);
        this.f9698c = MaterialColors.m11573a(context, C1270b.colorSurface, 0);
        this.f9699d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m11581e(int i) {
        return ColorUtils.m4970d(i, 255) == this.f9698c;
    }

    /* renamed from: a */
    public float mo8078a(float f) {
        float f2 = this.f9699d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo8079b(int i, float f) {
        float a = mo8078a(f);
        return ColorUtils.m4970d(MaterialColors.m11578f(ColorUtils.m4970d(i, 255), this.f9697b, a), Color.alpha(i));
    }

    /* renamed from: c */
    public int mo8080c(int i, float f) {
        return (!this.f9696a || !m11581e(i)) ? i : mo8079b(i, f);
    }

    /* renamed from: d */
    public boolean mo8081d() {
        return this.f9696a;
    }
}
