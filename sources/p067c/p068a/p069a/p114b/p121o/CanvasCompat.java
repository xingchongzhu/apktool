package p067c.p068a.p069a.p114b.p121o;

import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: c.a.a.b.o.a */
public class CanvasCompat {
    /* renamed from: a */
    public static int m11553a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
