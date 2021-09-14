package p067c.google.android.p114b.p117c0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build.VERSION;

/* renamed from: c.a.a.b.c0.l */
public class ShapeAppearancePathProvider {

    /* renamed from: a */
    private final ShapePath[] f9166a = new ShapePath[4];

    /* renamed from: b */
    private final Matrix[] f9167b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f9168c = new Matrix[4];

    /* renamed from: d */
    private final PointF f9169d = new PointF();

    /* renamed from: e */
    private final Path f9170e = new Path();

    /* renamed from: f */
    private final Path f9171f = new Path();

    /* renamed from: g */
    private final ShapePath f9172g = new ShapePath();

    /* renamed from: h */
    private final float[] f9173h = new float[2];

    /* renamed from: i */
    private final float[] f9174i = new float[2];

    /* renamed from: j */
    private final Path f9175j = new Path();

    /* renamed from: k */
    private final Path f9176k = new Path();

    /* renamed from: l */
    private boolean f9177l = true;

    /* renamed from: c.a.a.b.c0.l$a */
    /* compiled from: ShapeAppearancePathProvider */
    private static class C1278a {

        /* renamed from: a */
        static final ShapeAppearancePathProvider f9178a = new ShapeAppearancePathProvider();
    }

    /* renamed from: c.a.a.b.c0.l$b */
    /* compiled from: ShapeAppearancePathProvider */
    public interface C1279b {
        /* renamed from: a */
        void mo7875a(ShapePath mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo7876b(ShapePath mVar, Matrix matrix, int i);
    }

    /* renamed from: c.a.a.b.c0.l$c */
    /* compiled from: ShapeAppearancePathProvider */
    static final class C1280c {

        /* renamed from: a */
        public final ShapeAppearanceModel f9179a;

        /* renamed from: b */
        public final Path f9180b;

        /* renamed from: c */
        public final RectF f9181c;

        /* renamed from: d */
        public final C1279b f9182d;

        /* renamed from: e */
        public final float f9183e;

        C1280c(ShapeAppearanceModel kVar, float f, RectF rectF, C1279b bVar, Path path) {
            this.f9182d = bVar;
            this.f9179a = kVar;
            this.f9183e = f;
            this.f9181c = rectF;
            this.f9180b = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i = 0; i < 4; i++) {
            this.f9166a[i] = new ShapePath();
            this.f9167b[i] = new Matrix();
            this.f9168c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m11399a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m11400b(C1280c cVar, int i) {
        this.f9173h[0] = this.f9166a[i].mo7926k();
        this.f9173h[1] = this.f9166a[i].mo7927l();
        this.f9167b[i].mapPoints(this.f9173h);
        if (i == 0) {
            Path path = cVar.f9180b;
            float[] fArr = this.f9173h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f9180b;
            float[] fArr2 = this.f9173h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f9166a[i].mo7921d(this.f9167b[i], cVar.f9180b);
        C1279b bVar = cVar.f9182d;
        if (bVar != null) {
            bVar.mo7876b(this.f9166a[i], this.f9167b[i], i);
        }
    }

    /* renamed from: c */
    private void m11401c(C1280c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.f9173h[0] = this.f9166a[i].mo7924i();
        this.f9173h[1] = this.f9166a[i].mo7925j();
        this.f9167b[i].mapPoints(this.f9173h);
        this.f9174i[0] = this.f9166a[i2].mo7926k();
        this.f9174i[1] = this.f9166a[i2].mo7927l();
        this.f9167b[i2].mapPoints(this.f9174i);
        float[] fArr = this.f9173h;
        float f = fArr[0];
        float[] fArr2 = this.f9174i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m11405i(cVar.f9181c, i);
        this.f9172g.mo7929n(0.0f, 0.0f);
        EdgeTreatment j = m11406j(i, cVar.f9179a);
        j.mo7827b(max, i3, cVar.f9183e, this.f9172g);
        this.f9175j.reset();
        this.f9172g.mo7921d(this.f9168c[i], this.f9175j);
        if (!this.f9177l || VERSION.SDK_INT < 19 || (!j.mo7826a() && !m11408l(this.f9175j, i) && !m11408l(this.f9175j, i2))) {
            this.f9172g.mo7921d(this.f9168c[i], cVar.f9180b);
        } else {
            Path path = this.f9175j;
            path.op(path, this.f9171f, Op.DIFFERENCE);
            this.f9173h[0] = this.f9172g.mo7926k();
            this.f9173h[1] = this.f9172g.mo7927l();
            this.f9168c[i].mapPoints(this.f9173h);
            Path path2 = this.f9170e;
            float[] fArr3 = this.f9173h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f9172g.mo7921d(this.f9168c[i], this.f9170e);
        }
        C1279b bVar = cVar.f9182d;
        if (bVar != null) {
            bVar.mo7875a(this.f9172g, this.f9168c[i], i);
        }
    }

    /* renamed from: f */
    private void m11402f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private CornerSize m11403g(int i, ShapeAppearanceModel kVar) {
        if (i == 1) {
            return kVar.mo7886l();
        }
        if (i == 2) {
            return kVar.mo7884j();
        }
        if (i != 3) {
            return kVar.mo7893t();
        }
        return kVar.mo7891r();
    }

    /* renamed from: h */
    private CornerTreatment m11404h(int i, ShapeAppearanceModel kVar) {
        if (i == 1) {
            return kVar.mo7885k();
        }
        if (i == 2) {
            return kVar.mo7883i();
        }
        if (i != 3) {
            return kVar.mo7892s();
        }
        return kVar.mo7890q();
    }

    /* renamed from: i */
    private float m11405i(RectF rectF, int i) {
        float[] fArr = this.f9173h;
        ShapePath[] mVarArr = this.f9166a;
        fArr[0] = mVarArr[i].f9186c;
        fArr[1] = mVarArr[i].f9187d;
        this.f9167b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f9173h[0]);
        }
        return Math.abs(rectF.centerY() - this.f9173h[1]);
    }

    /* renamed from: j */
    private EdgeTreatment m11406j(int i, ShapeAppearanceModel kVar) {
        if (i == 1) {
            return kVar.mo7882h();
        }
        if (i == 2) {
            return kVar.mo7887n();
        }
        if (i != 3) {
            return kVar.mo7888o();
        }
        return kVar.mo7889p();
    }

    /* renamed from: k */
    public static ShapeAppearancePathProvider m11407k() {
        return C1278a.f9178a;
    }

    /* renamed from: l */
    private boolean m11408l(Path path, int i) {
        this.f9176k.reset();
        this.f9166a[i].mo7921d(this.f9167b[i], this.f9176k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f9176k.computeBounds(rectF, true);
        path.op(this.f9176k, Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m11409m(C1280c cVar, int i) {
        m11404h(i, cVar.f9179a).mo7825b(this.f9166a[i], 90.0f, cVar.f9183e, cVar.f9181c, m11403g(i, cVar.f9179a));
        float a = m11399a(i);
        this.f9167b[i].reset();
        m11402f(i, cVar.f9181c, this.f9169d);
        Matrix matrix = this.f9167b[i];
        PointF pointF = this.f9169d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f9167b[i].preRotate(a);
    }

    /* renamed from: n */
    private void m11410n(int i) {
        this.f9173h[0] = this.f9166a[i].mo7924i();
        this.f9173h[1] = this.f9166a[i].mo7925j();
        this.f9167b[i].mapPoints(this.f9173h);
        float a = m11399a(i);
        this.f9168c[i].reset();
        Matrix matrix = this.f9168c[i];
        float[] fArr = this.f9173h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f9168c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo7918d(ShapeAppearanceModel kVar, float f, RectF rectF, Path path) {
        mo7919e(kVar, f, rectF, null, path);
    }

    /* renamed from: e */
    public void mo7919e(ShapeAppearanceModel kVar, float f, RectF rectF, C1279b bVar, Path path) {
        path.rewind();
        this.f9170e.rewind();
        this.f9171f.rewind();
        this.f9171f.addRect(rectF, Direction.CW);
        C1280c cVar = new C1280c(kVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m11409m(cVar, i);
            m11410n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m11400b(cVar, i2);
            m11401c(cVar, i2);
        }
        path.close();
        this.f9170e.close();
        if (VERSION.SDK_INT >= 19 && !this.f9170e.isEmpty()) {
            path.op(this.f9170e, Op.UNION);
        }
    }
}
