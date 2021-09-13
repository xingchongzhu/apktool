package p067c.p068a.p069a.p114b.p119m;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: c.a.a.b.m.e */
public class DrawableAlphaProperty extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f9618a = new DrawableAlphaProperty();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f9619b = new WeakHashMap<>();

    private DrawableAlphaProperty() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f9619b.containsKey(drawable)) {
            return (Integer) this.f9619b.get(drawable);
        }
        return Integer.valueOf(255);
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (VERSION.SDK_INT < 19) {
            this.f9619b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
