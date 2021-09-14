package p067c.google.android.p114b.p119m;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p010b.p054l.p055a.p056a.FastOutLinearInInterpolator;
import p010b.p054l.p055a.p056a.FastOutSlowInInterpolator;
import p010b.p054l.p055a.p056a.LinearOutSlowInInterpolator;

/* renamed from: c.a.a.b.m.a */
public class AnimationUtils {

    /* renamed from: a */
    public static final TimeInterpolator f9611a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f9612b = new FastOutSlowInInterpolator();

    /* renamed from: c */
    public static final TimeInterpolator f9613c = new FastOutLinearInInterpolator();

    /* renamed from: d */
    public static final TimeInterpolator f9614d = new LinearOutSlowInInterpolator();

    /* renamed from: e */
    public static final TimeInterpolator f9615e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m11472a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static int m11473b(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
