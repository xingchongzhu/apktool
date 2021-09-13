package p067c.p068a.p069a.p114b.p126s;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p010b.p034g.p035d.ColorUtils;
import p067c.p068a.p069a.p114b.p133z.MaterialAttributes;

/* renamed from: c.a.a.b.s.a */
public class MaterialColors {
    /* renamed from: a */
    public static int m11573a(Context context, int i, int i2) {
        TypedValue a = MaterialAttributes.m11596a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: b */
    public static int m11574b(Context context, int i, String str) {
        return MaterialAttributes.m11598c(context, i, str);
    }

    /* renamed from: c */
    public static int m11575c(View view, int i) {
        return MaterialAttributes.m11599d(view, i);
    }

    /* renamed from: d */
    public static int m11576d(View view, int i, int i2) {
        return m11573a(view.getContext(), i, i2);
    }

    /* renamed from: e */
    public static int m11577e(int i, int i2) {
        return ColorUtils.m4968b(i2, i);
    }

    /* renamed from: f */
    public static int m11578f(int i, int i2, float f) {
        return m11577e(i, ColorUtils.m4970d(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: g */
    public static int m11579g(View view, int i, int i2, float f) {
        return m11578f(m11575c(view, i), m11575c(view, i2), f);
    }
}
