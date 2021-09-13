package p010b.p062p;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: b.p.i */
class PropertyValuesHolderUtils {
    /* renamed from: a */
    static PropertyValuesHolder m5969a(Property<?, PointF> property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, null, path);
        }
        return PropertyValuesHolder.ofFloat(new PathProperty(property, path), new float[]{0.0f, 1.0f});
    }
}
