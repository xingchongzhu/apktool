package p067c.google.android.p114b.p133z;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: c.a.a.b.z.b */
public class MaterialAttributes {
    /* renamed from: a */
    public static TypedValue m11596a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m11597b(Context context, int i, boolean z) {
        TypedValue a = m11596a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }

    /* renamed from: c */
    public static int m11598c(Context context, int i, String str) {
        TypedValue a = m11596a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: d */
    public static int m11599d(View view, int i) {
        return m11598c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
