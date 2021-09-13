package p010b.p034g.p043k;

import android.view.MotionEvent;

/* renamed from: b.g.k.j */
public final class MotionEventCompat {
    /* renamed from: a */
    public static boolean m5474a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
