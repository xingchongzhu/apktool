package p067c.google.android.p114b.p119m;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: c.a.a.b.m.f */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f9620a = new Matrix();

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f9620a.set(imageView.getImageMatrix());
        return this.f9620a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
