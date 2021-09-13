package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: androidx.appcompat.widget.z0 */
public class TooltipCompat {
    /* renamed from: a */
    public static void m1498a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            TooltipCompatHandler.m986f(view, charSequence);
        }
    }
}
