package p010b.p034g.p043k;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

/* renamed from: b.g.k.u */
public final class PointerIconCompat {

    /* renamed from: a */
    private Object f4735a;

    private PointerIconCompat(Object obj) {
        this.f4735a = obj;
    }

    /* renamed from: b */
    public static PointerIconCompat m5508b(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new PointerIconCompat(PointerIcon.getSystemIcon(context, i));
        }
        return new PointerIconCompat(null);
    }

    /* renamed from: a */
    public Object mo5150a() {
        return this.f4735a;
    }
}
