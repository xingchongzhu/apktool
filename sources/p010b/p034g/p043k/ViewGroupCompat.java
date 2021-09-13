package p010b.p034g.p043k;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import p010b.p034g.C0576b;

/* renamed from: b.g.k.y */
public final class ViewGroupCompat {
    /* renamed from: a */
    public static boolean m5650a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0576b.f4386Q);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ViewCompat.m5529L(viewGroup) == null) ? false : true;
    }
}
