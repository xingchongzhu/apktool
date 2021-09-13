package p067c.p068a.p069a.p114b.p117c0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p067c.p068a.p069a.p114b.p116b0.ShadowRenderer;

/* renamed from: c.a.a.b.c0.m */
public class ShapePath {
    @Deprecated

    /* renamed from: a */
    public float f9184a;
    @Deprecated

    /* renamed from: b */
    public float f9185b;
    @Deprecated

    /* renamed from: c */
    public float f9186c;
    @Deprecated

    /* renamed from: d */
    public float f9187d;
    @Deprecated

    /* renamed from: e */
    public float f9188e;
    @Deprecated

    /* renamed from: f */
    public float f9189f;

    /* renamed from: g */
    private final List<C1286f> f9190g = new ArrayList();

    /* renamed from: h */
    private final List<C1287g> f9191h = new ArrayList();

    /* renamed from: i */
    private boolean f9192i;

    /* renamed from: c.a.a.b.c0.m$a */
    /* compiled from: ShapePath */
    class C1281a extends C1287g {

        /* renamed from: b */
        final /* synthetic */ List f9193b;

        /* renamed from: c */
        final /* synthetic */ Matrix f9194c;

        C1281a(List list, Matrix matrix) {
            this.f9193b = list;
            this.f9194c = matrix;
        }

        /* renamed from: a */
        public void mo7931a(Matrix matrix, ShadowRenderer aVar, int i, Canvas canvas) {
            for (C1287g a : this.f9193b) {
                a.mo7931a(this.f9194c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: c.a.a.b.c0.m$b */
    /* compiled from: ShapePath */
    static class C1282b extends C1287g {

        /* renamed from: b */
        private final C1284d f9196b;

        public C1282b(C1284d dVar) {
            this.f9196b = dVar;
        }

        /* renamed from: a */
        public void mo7931a(Matrix matrix, ShadowRenderer aVar, int i, Canvas canvas) {
            float h = this.f9196b.m11451m();
            float i2 = this.f9196b.m11452n();
            aVar.mo7812a(canvas, matrix, new RectF(this.f9196b.m11449k(), this.f9196b.m11453o(), this.f9196b.m11450l(), this.f9196b.m11448j()), i, h, i2);
        }
    }

    /* renamed from: c.a.a.b.c0.m$c */
    /* compiled from: ShapePath */
    static class C1283c extends C1287g {

        /* renamed from: b */
        private final C1285e f9197b;

        /* renamed from: c */
        private final float f9198c;

        /* renamed from: d */
        private final float f9199d;

        public C1283c(C1285e eVar, float f, float f2) {
            this.f9197b = eVar;
            this.f9198c = f;
            this.f9199d = f2;
        }

        /* renamed from: a */
        public void mo7931a(Matrix matrix, ShadowRenderer aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f9197b.f9208c - this.f9199d), (double) (this.f9197b.f9207b - this.f9198c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f9198c, this.f9199d);
            matrix2.preRotate(mo7932c());
            aVar.mo7813b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public float mo7932c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f9197b.f9208c - this.f9199d) / (this.f9197b.f9207b - this.f9198c))));
        }
    }

    /* renamed from: c.a.a.b.c0.m$d */
    /* compiled from: ShapePath */
    public static class C1284d extends C1286f {

        /* renamed from: b */
        private static final RectF f9200b = new RectF();
        @Deprecated

        /* renamed from: c */
        public float f9201c;
        @Deprecated

        /* renamed from: d */
        public float f9202d;
        @Deprecated

        /* renamed from: e */
        public float f9203e;
        @Deprecated

        /* renamed from: f */
        public float f9204f;
        @Deprecated

        /* renamed from: g */
        public float f9205g;
        @Deprecated

        /* renamed from: h */
        public float f9206h;

        public C1284d(float f, float f2, float f3, float f4) {
            m11455q(f);
            m11459u(f2);
            m11456r(f3);
            m11454p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m11448j() {
            return this.f9204f;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m11449k() {
            return this.f9201c;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m11450l() {
            return this.f9203e;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m11451m() {
            return this.f9205g;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m11452n() {
            return this.f9206h;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m11453o() {
            return this.f9202d;
        }

        /* renamed from: p */
        private void m11454p(float f) {
            this.f9204f = f;
        }

        /* renamed from: q */
        private void m11455q(float f) {
            this.f9201c = f;
        }

        /* renamed from: r */
        private void m11456r(float f) {
            this.f9203e = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m11457s(float f) {
            this.f9205g = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m11458t(float f) {
            this.f9206h = f;
        }

        /* renamed from: u */
        private void m11459u(float f) {
            this.f9202d = f;
        }

        /* renamed from: a */
        public void mo7933a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f9209a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f9200b;
            rectF.set(m11449k(), m11453o(), m11450l(), m11448j());
            path.arcTo(rectF, m11451m(), m11452n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: c.a.a.b.c0.m$e */
    /* compiled from: ShapePath */
    public static class C1285e extends C1286f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f9207b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f9208c;

        /* renamed from: a */
        public void mo7933a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f9209a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f9207b, this.f9208c);
            path.transform(matrix);
        }
    }

    /* renamed from: c.a.a.b.c0.m$f */
    /* compiled from: ShapePath */
    public static abstract class C1286f {

        /* renamed from: a */
        protected final Matrix f9209a = new Matrix();

        /* renamed from: a */
        public abstract void mo7933a(Matrix matrix, Path path);
    }

    /* renamed from: c.a.a.b.c0.m$g */
    /* compiled from: ShapePath */
    static abstract class C1287g {

        /* renamed from: a */
        static final Matrix f9210a = new Matrix();

        C1287g() {
        }

        /* renamed from: a */
        public abstract void mo7931a(Matrix matrix, ShadowRenderer aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo7934b(ShadowRenderer aVar, int i, Canvas canvas) {
            mo7931a(f9210a, aVar, i, canvas);
        }
    }

    public ShapePath() {
        mo7929n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m11415b(float f) {
        if (m11417g() != f) {
            float g = ((f - m11417g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C1284d dVar = new C1284d(mo7924i(), mo7925j(), mo7924i(), mo7925j());
                dVar.m11457s(m11417g());
                dVar.m11458t(g);
                this.f9191h.add(new C1282b(dVar));
                m11419p(f);
            }
        }
    }

    /* renamed from: c */
    private void m11416c(C1287g gVar, float f, float f2) {
        m11415b(f);
        this.f9191h.add(gVar);
        m11419p(f2);
    }

    /* renamed from: g */
    private float m11417g() {
        return this.f9188e;
    }

    /* renamed from: h */
    private float m11418h() {
        return this.f9189f;
    }

    /* renamed from: p */
    private void m11419p(float f) {
        this.f9188e = f;
    }

    /* renamed from: q */
    private void m11420q(float f) {
        this.f9189f = f;
    }

    /* renamed from: r */
    private void m11421r(float f) {
        this.f9186c = f;
    }

    /* renamed from: s */
    private void m11422s(float f) {
        this.f9187d = f;
    }

    /* renamed from: t */
    private void m11423t(float f) {
        this.f9184a = f;
    }

    /* renamed from: u */
    private void m11424u(float f) {
        this.f9185b = f;
    }

    /* renamed from: a */
    public void mo7920a(float f, float f2, float f3, float f4, float f5, float f6) {
        C1284d dVar = new C1284d(f, f2, f3, f4);
        dVar.m11457s(f5);
        dVar.m11458t(f6);
        this.f9190g.add(dVar);
        C1282b bVar = new C1282b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m11416c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m11421r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m11422s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo7921d(Matrix matrix, Path path) {
        int size = this.f9190g.size();
        for (int i = 0; i < size; i++) {
            ((C1286f) this.f9190g.get(i)).mo7933a(matrix, path);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo7922e() {
        return this.f9192i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C1287g mo7923f(Matrix matrix) {
        m11415b(m11418h());
        return new C1281a(new ArrayList(this.f9191h), new Matrix(matrix));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public float mo7924i() {
        return this.f9186c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public float mo7925j() {
        return this.f9187d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public float mo7926k() {
        return this.f9184a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public float mo7927l() {
        return this.f9185b;
    }

    /* renamed from: m */
    public void mo7928m(float f, float f2) {
        C1285e eVar = new C1285e();
        eVar.f9207b = f;
        eVar.f9208c = f2;
        this.f9190g.add(eVar);
        C1283c cVar = new C1283c(eVar, mo7924i(), mo7925j());
        m11416c(cVar, cVar.mo7932c() + 270.0f, cVar.mo7932c() + 270.0f);
        m11421r(f);
        m11422s(f2);
    }

    /* renamed from: n */
    public void mo7929n(float f, float f2) {
        mo7930o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void mo7930o(float f, float f2, float f3, float f4) {
        m11423t(f);
        m11424u(f2);
        m11421r(f);
        m11422s(f2);
        m11419p(f3);
        m11420q((f3 + f4) % 360.0f);
        this.f9190g.clear();
        this.f9191h.clear();
        this.f9192i = false;
    }
}
