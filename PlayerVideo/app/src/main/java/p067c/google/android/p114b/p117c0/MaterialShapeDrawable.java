package p067c.google.android.p114b.p117c0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.TintAwareDrawable;
import java.util.BitSet;
import p010b.p034g.p042j.ObjectsCompat;
import p067c.google.android.p114b.C1270b;
import p067c.google.android.p114b.p116b0.ShadowRenderer;
import p067c.google.android.p114b.p117c0.ShapeAppearanceModel.C1277c;
import p067c.google.android.p114b.p117c0.ShapeAppearancePathProvider.C1279b;
import p067c.google.android.p114b.p126s.MaterialColors;
import p067c.google.android.p114b.p129v.ElevationOverlayProvider;

/* renamed from: c.a.a.b.c0.g */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {

    /* renamed from: a */
    private static final String f9090a = MaterialShapeDrawable.class.getSimpleName();

    /* renamed from: b */
    private static final Paint f9091b = new Paint(1);

    /* renamed from: c */
    private C1274c f9092c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1287g[] f9093d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1287g[] f9094e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final BitSet f9095f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f9096g;

    /* renamed from: h */
    private final Matrix f9097h;

    /* renamed from: i */
    private final Path f9098i;

    /* renamed from: j */
    private final Path f9099j;

    /* renamed from: k */
    private final RectF f9100k;

    /* renamed from: l */
    private final RectF f9101l;

    /* renamed from: m */
    private final Region f9102m;

    /* renamed from: n */
    private final Region f9103n;

    /* renamed from: o */
    private ShapeAppearanceModel f9104o;

    /* renamed from: p */
    private final Paint f9105p;

    /* renamed from: q */
    private final Paint f9106q;

    /* renamed from: r */
    private final ShadowRenderer f9107r;

    /* renamed from: s */
    private final C1279b f9108s;

    /* renamed from: t */
    private final ShapeAppearancePathProvider f9109t;

    /* renamed from: u */
    private PorterDuffColorFilter f9110u;

    /* renamed from: v */
    private PorterDuffColorFilter f9111v;

    /* renamed from: w */
    private final RectF f9112w;

    /* renamed from: x */
    private boolean f9113x;

    /* renamed from: c.a.a.b.c0.g$a */
    /* compiled from: MaterialShapeDrawable */
    class C1272a implements C1279b {
        C1272a() {
        }

        /* renamed from: a */
        public void mo7875a(ShapePath mVar, Matrix matrix, int i) {
            MaterialShapeDrawable.this.f9095f.set(i + 4, mVar.mo7922e());
            MaterialShapeDrawable.this.f9094e[i] = mVar.mo7923f(matrix);
        }

        /* renamed from: b */
        public void mo7876b(ShapePath mVar, Matrix matrix, int i) {
            MaterialShapeDrawable.this.f9095f.set(i, mVar.mo7922e());
            MaterialShapeDrawable.this.f9093d[i] = mVar.mo7923f(matrix);
        }
    }

    /* renamed from: c.a.a.b.c0.g$b */
    /* compiled from: MaterialShapeDrawable */
    class C1273b implements C1277c {

        /* renamed from: a */
        final /* synthetic */ float f9115a;

        C1273b(float f) {
            this.f9115a = f;
        }

        /* renamed from: a */
        public CornerSize mo7877a(CornerSize cVar) {
            return cVar instanceof RelativeCornerSize ? cVar : new AdjustedCornerSize(this.f9115a, cVar);
        }
    }

    /* renamed from: c.a.a.b.c0.g$c */
    /* compiled from: MaterialShapeDrawable */
    static final class C1274c extends ConstantState {

        /* renamed from: a */
        public ShapeAppearanceModel f9117a;

        /* renamed from: b */
        public ElevationOverlayProvider f9118b;

        /* renamed from: c */
        public ColorFilter f9119c;

        /* renamed from: d */
        public ColorStateList f9120d = null;

        /* renamed from: e */
        public ColorStateList f9121e = null;

        /* renamed from: f */
        public ColorStateList f9122f = null;

        /* renamed from: g */
        public ColorStateList f9123g = null;

        /* renamed from: h */
        public Mode f9124h = Mode.SRC_IN;

        /* renamed from: i */
        public Rect f9125i = null;

        /* renamed from: j */
        public float f9126j = 1.0f;

        /* renamed from: k */
        public float f9127k = 1.0f;

        /* renamed from: l */
        public float f9128l;

        /* renamed from: m */
        public int f9129m = 255;

        /* renamed from: n */
        public float f9130n = 0.0f;

        /* renamed from: o */
        public float f9131o = 0.0f;

        /* renamed from: p */
        public float f9132p = 0.0f;

        /* renamed from: q */
        public int f9133q = 0;

        /* renamed from: r */
        public int f9134r = 0;

        /* renamed from: s */
        public int f9135s = 0;

        /* renamed from: t */
        public int f9136t = 0;

        /* renamed from: u */
        public boolean f9137u = false;

        /* renamed from: v */
        public Style f9138v = Style.FILL_AND_STROKE;

        public C1274c(ShapeAppearanceModel kVar, ElevationOverlayProvider aVar) {
            this.f9117a = kVar;
            this.f9118b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            MaterialShapeDrawable gVar = new MaterialShapeDrawable(this, null);
            gVar.f9096g = true;
            return gVar;
        }

        public C1274c(C1274c cVar) {
            this.f9117a = cVar.f9117a;
            this.f9118b = cVar.f9118b;
            this.f9128l = cVar.f9128l;
            this.f9119c = cVar.f9119c;
            this.f9120d = cVar.f9120d;
            this.f9121e = cVar.f9121e;
            this.f9124h = cVar.f9124h;
            this.f9123g = cVar.f9123g;
            this.f9129m = cVar.f9129m;
            this.f9126j = cVar.f9126j;
            this.f9135s = cVar.f9135s;
            this.f9133q = cVar.f9133q;
            this.f9137u = cVar.f9137u;
            this.f9127k = cVar.f9127k;
            this.f9130n = cVar.f9130n;
            this.f9131o = cVar.f9131o;
            this.f9132p = cVar.f9132p;
            this.f9134r = cVar.f9134r;
            this.f9136t = cVar.f9136t;
            this.f9122f = cVar.f9122f;
            this.f9138v = cVar.f9138v;
            if (cVar.f9125i != null) {
                this.f9125i = new Rect(cVar.f9125i);
            }
        }
    }

    /* synthetic */ MaterialShapeDrawable(C1274c cVar, C1272a aVar) {
        this(cVar);
    }

    /* renamed from: D */
    private float m11270D() {
        if (m11273L()) {
            return this.f9106q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: J */
    private boolean m11271J() {
        C1274c cVar = this.f9092c;
        int i = cVar.f9133q;
        if (i == 1 || cVar.f9134r <= 0 || (i != 2 && !mo7839T())) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    private boolean m11272K() {
        Style style = this.f9092c.f9138v;
        return style == Style.FILL_AND_STROKE || style == Style.FILL;
    }

    /* renamed from: L */
    private boolean m11273L() {
        Style style = this.f9092c.f9138v;
        return (style == Style.FILL_AND_STROKE || style == Style.STROKE) && this.f9106q.getStrokeWidth() > 0.0f;
    }

    /* renamed from: N */
    private void m11274N() {
        super.invalidateSelf();
    }

    /* renamed from: Q */
    private void m11275Q(Canvas canvas) {
        if (m11271J()) {
            canvas.save();
            m11277S(canvas);
            if (!this.f9113x) {
                m11291n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f9112w.width() - ((float) getBounds().width()));
            int height = (int) (this.f9112w.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f9112w.width()) + (this.f9092c.f9134r * 2) + width, ((int) this.f9112w.height()) + (this.f9092c.f9134r * 2) + height, Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f9092c.f9134r) - width);
            float f2 = (float) ((getBounds().top - this.f9092c.f9134r) - height);
            canvas2.translate(-f, -f2);
            m11291n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: R */
    private static int m11276R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: S */
    private void m11277S(Canvas canvas) {
        int z = mo7874z();
        int A = mo7828A();
        if (VERSION.SDK_INT < 21 && this.f9113x) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f9092c.f9134r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(z, A);
            canvas.clipRect(clipBounds, Op.REPLACE);
        }
        canvas.translate((float) z, (float) A);
    }

    /* renamed from: f */
    private PorterDuffColorFilter m11282f(Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int l = mo7861l(color);
            if (l != color) {
                return new PorterDuffColorFilter(l, Mode.SRC_IN);
            }
        }
        return null;
    }

    /* renamed from: g */
    private void m11283g(RectF rectF, Path path) {
        mo7858h(rectF, path);
        if (this.f9092c.f9126j != 1.0f) {
            this.f9097h.reset();
            Matrix matrix = this.f9097h;
            float f = this.f9092c.f9126j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f9097h);
        }
        path.computeBounds(this.f9112w, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11284g0(int[] r5) {
        /*
            r4 = this;
            c.a.a.b.c0.g$c r0 = r4.f9092c
            android.content.res.ColorStateList r0 = r0.f9120d
            r1 = 1
            if (r0 == 0) goto L_0x001e
            android.graphics.Paint r0 = r4.f9105p
            int r0 = r0.getColor()
            c.a.a.b.c0.g$c r2 = r4.f9092c
            android.content.res.ColorStateList r2 = r2.f9120d
            int r2 = r2.getColorForState(r5, r0)
            if (r0 == r2) goto L_0x001e
            android.graphics.Paint r0 = r4.f9105p
            r0.setColor(r2)
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            c.a.a.b.c0.g$c r2 = r4.f9092c
            android.content.res.ColorStateList r2 = r2.f9121e
            if (r2 == 0) goto L_0x003b
            android.graphics.Paint r2 = r4.f9106q
            int r2 = r2.getColor()
            c.a.a.b.c0.g$c r3 = r4.f9092c
            android.content.res.ColorStateList r3 = r3.f9121e
            int r5 = r3.getColorForState(r5, r2)
            if (r2 == r5) goto L_0x003b
            android.graphics.Paint r0 = r4.f9106q
            r0.setColor(r5)
            goto L_0x003c
        L_0x003b:
            r1 = r0
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable.m11284g0(int[]):boolean");
    }

    /* renamed from: h0 */
    private boolean m11285h0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f9110u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f9111v;
        C1274c cVar = this.f9092c;
        this.f9110u = m11289k(cVar.f9123g, cVar.f9124h, this.f9105p, true);
        C1274c cVar2 = this.f9092c;
        this.f9111v = m11289k(cVar2.f9122f, cVar2.f9124h, this.f9106q, false);
        C1274c cVar3 = this.f9092c;
        if (cVar3.f9137u) {
            this.f9107r.mo7815d(cVar3.f9123g.getColorForState(getState(), 0));
        }
        if (!ObjectsCompat.m5175a(porterDuffColorFilter, this.f9110u) || !ObjectsCompat.m5175a(porterDuffColorFilter2, this.f9111v)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m11286i() {
        ShapeAppearanceModel y = mo7830C().mo7898y(new C1273b(-m11270D()));
        this.f9104o = y;
        this.f9109t.mo7918d(y, this.f9092c.f9127k, m11295v(), this.f9099j);
    }

    /* renamed from: i0 */
    private void m11287i0() {
        float I = mo7835I();
        this.f9092c.f9134r = (int) Math.ceil((double) (0.75f * I));
        this.f9092c.f9135s = (int) Math.ceil((double) (I * 0.25f));
        m11285h0();
        m11274N();
    }

    /* renamed from: j */
    private PorterDuffColorFilter m11288j(ColorStateList colorStateList, Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo7861l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m11289k(ColorStateList colorStateList, Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m11282f(paint, z);
        }
        return m11288j(colorStateList, mode, z);
    }

    /* renamed from: m */
    public static MaterialShapeDrawable m11290m(Context context, float f) {
        int b = MaterialColors.m11574b(context, C1270b.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        MaterialShapeDrawable gVar = new MaterialShapeDrawable();
        gVar.mo7836M(context);
        gVar.mo7843X(ColorStateList.valueOf(b));
        gVar.mo7842W(f);
        return gVar;
    }

    /* renamed from: n */
    private void m11291n(Canvas canvas) {
        if (this.f9095f.cardinality() > 0) {
            Log.w(f9090a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f9092c.f9135s != 0) {
            canvas.drawPath(this.f9098i, this.f9107r.mo7814c());
        }
        for (int i = 0; i < 4; i++) {
            this.f9093d[i].mo7934b(this.f9107r, this.f9092c.f9134r, canvas);
            this.f9094e[i].mo7934b(this.f9107r, this.f9092c.f9134r, canvas);
        }
        if (this.f9113x) {
            int z = mo7874z();
            int A = mo7828A();
            canvas.translate((float) (-z), (float) (-A));
            canvas.drawPath(this.f9098i, f9091b);
            canvas.translate((float) z, (float) A);
        }
    }

    /* renamed from: o */
    private void m11292o(Canvas canvas) {
        m11293q(canvas, this.f9105p, this.f9098i, this.f9092c.f9117a, mo7870u());
    }

    /* renamed from: q */
    private void m11293q(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel kVar, RectF rectF) {
        if (kVar.mo7894u(rectF)) {
            float a = kVar.mo7893t().mo7819a(rectF) * this.f9092c.f9127k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: r */
    private void m11294r(Canvas canvas) {
        m11293q(canvas, this.f9106q, this.f9099j, this.f9104o, m11295v());
    }

    /* renamed from: v */
    private RectF m11295v() {
        this.f9101l.set(mo7870u());
        float D = m11270D();
        this.f9101l.inset(D, D);
        return this.f9101l;
    }

    /* renamed from: A */
    public int mo7828A() {
        C1274c cVar = this.f9092c;
        double d = (double) cVar.f9135s;
        double cos = Math.cos(Math.toRadians((double) cVar.f9136t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* renamed from: B */
    public int mo7829B() {
        return this.f9092c.f9134r;
    }

    /* renamed from: C */
    public ShapeAppearanceModel mo7830C() {
        return this.f9092c.f9117a;
    }

    /* renamed from: E */
    public ColorStateList mo7831E() {
        return this.f9092c.f9123g;
    }

    /* renamed from: F */
    public float mo7832F() {
        return this.f9092c.f9117a.mo7891r().mo7819a(mo7870u());
    }

    /* renamed from: G */
    public float mo7833G() {
        return this.f9092c.f9117a.mo7893t().mo7819a(mo7870u());
    }

    /* renamed from: H */
    public float mo7834H() {
        return this.f9092c.f9132p;
    }

    /* renamed from: I */
    public float mo7835I() {
        return mo7871w() + mo7834H();
    }

    /* renamed from: M */
    public void mo7836M(Context context) {
        this.f9092c.f9118b = new ElevationOverlayProvider(context);
        m11287i0();
    }

    /* renamed from: O */
    public boolean mo7837O() {
        ElevationOverlayProvider aVar = this.f9092c.f9118b;
        return aVar != null && aVar.mo8081d();
    }

    /* renamed from: P */
    public boolean mo7838P() {
        return this.f9092c.f9117a.mo7894u(mo7870u());
    }

    /* renamed from: T */
    public boolean mo7839T() {
        int i = VERSION.SDK_INT;
        return i < 21 || (!mo7838P() && !this.f9098i.isConvex() && i < 29);
    }

    /* renamed from: U */
    public void mo7840U(float f) {
        setShapeAppearanceModel(this.f9092c.f9117a.mo7896w(f));
    }

    /* renamed from: V */
    public void mo7841V(CornerSize cVar) {
        setShapeAppearanceModel(this.f9092c.f9117a.mo7897x(cVar));
    }

    /* renamed from: W */
    public void mo7842W(float f) {
        C1274c cVar = this.f9092c;
        if (cVar.f9131o != f) {
            cVar.f9131o = f;
            m11287i0();
        }
    }

    /* renamed from: X */
    public void mo7843X(ColorStateList colorStateList) {
        C1274c cVar = this.f9092c;
        if (cVar.f9120d != colorStateList) {
            cVar.f9120d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void mo7844Y(float f) {
        C1274c cVar = this.f9092c;
        if (cVar.f9127k != f) {
            cVar.f9127k = f;
            this.f9096g = true;
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void mo7845Z(int i, int i2, int i3, int i4) {
        C1274c cVar = this.f9092c;
        if (cVar.f9125i == null) {
            cVar.f9125i = new Rect();
        }
        this.f9092c.f9125i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void mo7846a0(float f) {
        C1274c cVar = this.f9092c;
        if (cVar.f9130n != f) {
            cVar.f9130n = f;
            m11287i0();
        }
    }

    /* renamed from: b0 */
    public void mo7847b0(int i) {
        C1274c cVar = this.f9092c;
        if (cVar.f9136t != i) {
            cVar.f9136t = i;
            m11274N();
        }
    }

    /* renamed from: c0 */
    public void mo7848c0(float f, int i) {
        mo7852f0(f);
        mo7851e0(ColorStateList.valueOf(i));
    }

    /* renamed from: d0 */
    public void mo7849d0(float f, ColorStateList colorStateList) {
        mo7852f0(f);
        mo7851e0(colorStateList);
    }

    public void draw(Canvas canvas) {
        this.f9105p.setColorFilter(this.f9110u);
        int alpha = this.f9105p.getAlpha();
        this.f9105p.setAlpha(m11276R(alpha, this.f9092c.f9129m));
        this.f9106q.setColorFilter(this.f9111v);
        this.f9106q.setStrokeWidth(this.f9092c.f9128l);
        int alpha2 = this.f9106q.getAlpha();
        this.f9106q.setAlpha(m11276R(alpha2, this.f9092c.f9129m));
        if (this.f9096g) {
            m11286i();
            m11283g(mo7870u(), this.f9098i);
            this.f9096g = false;
        }
        m11275Q(canvas);
        if (m11272K()) {
            m11292o(canvas);
        }
        if (m11273L()) {
            m11294r(canvas);
        }
        this.f9105p.setAlpha(alpha);
        this.f9106q.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void mo7851e0(ColorStateList colorStateList) {
        C1274c cVar = this.f9092c;
        if (cVar.f9121e != colorStateList) {
            cVar.f9121e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: f0 */
    public void mo7852f0(float f) {
        this.f9092c.f9128l = f;
        invalidateSelf();
    }

    public ConstantState getConstantState() {
        return this.f9092c;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f9092c.f9133q != 2) {
            if (mo7838P()) {
                outline.setRoundRect(getBounds(), mo7832F() * this.f9092c.f9127k);
                return;
            }
            m11283g(mo7870u(), this.f9098i);
            if (this.f9098i.isConvex() || VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f9098i);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f9092c.f9125i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f9102m.set(getBounds());
        m11283g(mo7870u(), this.f9098i);
        this.f9103n.setPath(this.f9098i, this.f9102m);
        this.f9102m.op(this.f9103n, Op.DIFFERENCE);
        return this.f9102m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo7858h(RectF rectF, Path path) {
        ShapeAppearancePathProvider lVar = this.f9109t;
        C1274c cVar = this.f9092c;
        ShapeAppearanceModel kVar = cVar.f9117a;
        float f = cVar.f9127k;
        lVar.mo7919e(kVar, f, rectF, this.f9108s, path);
    }

    public void invalidateSelf() {
        this.f9096g = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f9092c.f9123g;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.f9092c.f9122f;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f9092c.f9121e;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.f9092c.f9120d;
                        if (colorStateList4 == null || !colorStateList4.isStateful()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo7861l(int i) {
        float I = mo7835I() + mo7873y();
        ElevationOverlayProvider aVar = this.f9092c.f9118b;
        return aVar != null ? aVar.mo8080c(i, I) : i;
    }

    public Drawable mutate() {
        this.f9092c = new C1274c(this.f9092c);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f9096g = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m11284g0(iArr) || m11285h0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo7865p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m11293q(canvas, paint, path, this.f9092c.f9117a, rectF);
    }

    /* renamed from: s */
    public float mo7866s() {
        return this.f9092c.f9117a.mo7884j().mo7819a(mo7870u());
    }

    public void setAlpha(int i) {
        C1274c cVar = this.f9092c;
        if (cVar.f9129m != i) {
            cVar.f9129m = i;
            m11274N();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9092c.f9119c = colorFilter;
        m11274N();
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel kVar) {
        this.f9092c.f9117a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f9092c.f9123g = colorStateList;
        m11285h0();
        m11274N();
    }

    public void setTintMode(Mode mode) {
        C1274c cVar = this.f9092c;
        if (cVar.f9124h != mode) {
            cVar.f9124h = mode;
            m11285h0();
            m11274N();
        }
    }

    /* renamed from: t */
    public float mo7869t() {
        return this.f9092c.f9117a.mo7886l().mo7819a(mo7870u());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public RectF mo7870u() {
        this.f9100k.set(getBounds());
        return this.f9100k;
    }

    /* renamed from: w */
    public float mo7871w() {
        return this.f9092c.f9131o;
    }

    /* renamed from: x */
    public ColorStateList mo7872x() {
        return this.f9092c.f9120d;
    }

    /* renamed from: y */
    public float mo7873y() {
        return this.f9092c.f9130n;
    }

    /* renamed from: z */
    public int mo7874z() {
        C1274c cVar = this.f9092c;
        double d = (double) cVar.f9135s;
        double sin = Math.sin(Math.toRadians((double) cVar.f9136t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ShapeAppearanceModel.m11345e(context, attributeSet, i, i2).mo7905m());
    }

    public MaterialShapeDrawable(ShapeAppearanceModel kVar) {
        this(new C1274c(kVar, null));
    }

    private MaterialShapeDrawable(C1274c cVar) {
        this.f9093d = new C1287g[4];
        this.f9094e = new C1287g[4];
        this.f9095f = new BitSet(8);
        this.f9097h = new Matrix();
        this.f9098i = new Path();
        this.f9099j = new Path();
        this.f9100k = new RectF();
        this.f9101l = new RectF();
        this.f9102m = new Region();
        this.f9103n = new Region();
        Paint paint = new Paint(1);
        this.f9105p = paint;
        Paint paint2 = new Paint(1);
        this.f9106q = paint2;
        this.f9107r = new ShadowRenderer();
        this.f9109t = Looper.getMainLooper().getThread() == Thread.currentThread() ? ShapeAppearancePathProvider.m11407k() : new ShapeAppearancePathProvider();
        this.f9112w = new RectF();
        this.f9113x = true;
        this.f9092c = cVar;
        paint2.setStyle(Style.STROKE);
        paint.setStyle(Style.FILL);
        Paint paint3 = f9091b;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        m11285h0();
        m11284g0(getState());
        this.f9108s = new C1272a();
    }
}
