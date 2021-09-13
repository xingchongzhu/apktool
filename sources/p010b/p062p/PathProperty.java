package p010b.p062p;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: b.p.h */
class PathProperty<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f5027a;

    /* renamed from: b */
    private final PathMeasure f5028b;

    /* renamed from: c */
    private final float f5029c;

    /* renamed from: d */
    private final float[] f5030d = new float[2];

    /* renamed from: e */
    private final PointF f5031e = new PointF();

    /* renamed from: f */
    private float f5032f;

    PathProperty(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f5027a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f5028b = pathMeasure;
        this.f5029c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f5032f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f5032f = f.floatValue();
        this.f5028b.getPosTan(this.f5029c * f.floatValue(), this.f5030d, null);
        PointF pointF = this.f5031e;
        float[] fArr = this.f5030d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f5027a.set(t, pointF);
    }
}
