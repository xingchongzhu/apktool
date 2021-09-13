package p010b.p034g.p043k.p044f0;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: b.g.k.f0.b */
public final class AccessibilityEventCompat {
    /* renamed from: a */
    public static int m5332a(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m5333b(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
