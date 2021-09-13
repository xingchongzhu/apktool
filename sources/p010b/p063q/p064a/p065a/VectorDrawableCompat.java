package p010b.p063q.p064a.p065a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.content.p007c.ComplexColorCompat;
import androidx.core.content.p007c.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p025d.ArrayMap;
import p010b.p034g.p035d.PathParser;
import p010b.p034g.p035d.PathParser.C0579b;

/* renamed from: b.q.a.a.i */
public class VectorDrawableCompat extends VectorDrawableCommon {

    /* renamed from: b */
    static final Mode f5173b = Mode.SRC_IN;

    /* renamed from: c */
    private C0746h f5174c;

    /* renamed from: d */
    private PorterDuffColorFilter f5175d;

    /* renamed from: e */
    private ColorFilter f5176e;

    /* renamed from: f */
    private boolean f5177f;

    /* renamed from: g */
    private boolean f5178g;

    /* renamed from: h */
    private ConstantState f5179h;

    /* renamed from: i */
    private final float[] f5180i;

    /* renamed from: j */
    private final Matrix f5181j;

    /* renamed from: k */
    private final Rect f5182k;

    /* renamed from: b.q.a.a.i$b */
    /* compiled from: VectorDrawableCompat */
    private static class C0740b extends C0744f {
        C0740b() {
        }

        /* renamed from: f */
        private void m6179f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5209b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5208a = PathParser.m4979d(string2);
            }
            this.f5210c = TypedArrayUtils.m1831g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo5537c() {
            return true;
        }

        /* renamed from: e */
        public void mo5538e(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (TypedArrayUtils.m1834j(xmlPullParser, "pathData")) {
                TypedArray k = TypedArrayUtils.m1835k(resources, theme, attributeSet, AndroidResources.f5146d);
                m6179f(k, xmlPullParser);
                k.recycle();
            }
        }

        C0740b(C0740b bVar) {
            super(bVar);
        }
    }

    /* renamed from: b.q.a.a.i$c */
    /* compiled from: VectorDrawableCompat */
    private static class C0741c extends C0744f {

        /* renamed from: e */
        private int[] f5183e;

        /* renamed from: f */
        ComplexColorCompat f5184f;

        /* renamed from: g */
        float f5185g = 0.0f;

        /* renamed from: h */
        ComplexColorCompat f5186h;

        /* renamed from: i */
        float f5187i = 1.0f;

        /* renamed from: j */
        float f5188j = 1.0f;

        /* renamed from: k */
        float f5189k = 0.0f;

        /* renamed from: l */
        float f5190l = 1.0f;

        /* renamed from: m */
        float f5191m = 0.0f;

        /* renamed from: n */
        Cap f5192n = Cap.BUTT;

        /* renamed from: o */
        Join f5193o = Join.MITER;

        /* renamed from: p */
        float f5194p = 4.0f;

        C0741c() {
        }

        /* renamed from: e */
        private Cap m6182e(int i, Cap cap) {
            if (i == 0) {
                return Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Cap.SQUARE;
            }
            return Cap.ROUND;
        }

        /* renamed from: f */
        private Join m6183f(int i, Join join) {
            if (i == 0) {
                return Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Join.BEVEL;
            }
            return Join.ROUND;
        }

        /* renamed from: h */
        private void m6184h(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f5183e = null;
            if (TypedArrayUtils.m1834j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f5209b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f5208a = PathParser.m4979d(string2);
                }
                Theme theme2 = theme;
                this.f5186h = TypedArrayUtils.m1829e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f5188j = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "fillAlpha", 12, this.f5188j);
                this.f5192n = m6182e(TypedArrayUtils.m1831g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5192n);
                this.f5193o = m6183f(TypedArrayUtils.m1831g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5193o);
                this.f5194p = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5194p);
                this.f5184f = TypedArrayUtils.m1829e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f5187i = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5187i);
                this.f5185g = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "strokeWidth", 4, this.f5185g);
                this.f5190l = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5190l);
                this.f5191m = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5191m);
                this.f5189k = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "trimPathStart", 5, this.f5189k);
                this.f5210c = TypedArrayUtils.m1831g(typedArray, xmlPullParser, "fillType", 13, this.f5210c);
            }
        }

        /* renamed from: a */
        public boolean mo5539a() {
            return this.f5186h.mo2164i() || this.f5184f.mo2164i();
        }

        /* renamed from: b */
        public boolean mo5540b(int[] iArr) {
            return this.f5184f.mo2165j(iArr) | this.f5186h.mo2165j(iArr);
        }

        /* renamed from: g */
        public void mo5541g(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = TypedArrayUtils.m1835k(resources, theme, attributeSet, AndroidResources.f5145c);
            m6184h(k, xmlPullParser, theme);
            k.recycle();
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.f5188j;
        }

        /* access modifiers changed from: 0000 */
        public int getFillColor() {
            return this.f5186h.mo2161e();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.f5187i;
        }

        /* access modifiers changed from: 0000 */
        public int getStrokeColor() {
            return this.f5184f.mo2161e();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f5185g;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.f5190l;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.f5191m;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.f5189k;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f) {
            this.f5188j = f;
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i) {
            this.f5186h.mo2166k(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f) {
            this.f5187i = f;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i) {
            this.f5184f.mo2166k(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f) {
            this.f5185g = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f) {
            this.f5190l = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f) {
            this.f5191m = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f) {
            this.f5189k = f;
        }

        C0741c(C0741c cVar) {
            super(cVar);
            this.f5183e = cVar.f5183e;
            this.f5184f = cVar.f5184f;
            this.f5185g = cVar.f5185g;
            this.f5187i = cVar.f5187i;
            this.f5186h = cVar.f5186h;
            this.f5210c = cVar.f5210c;
            this.f5188j = cVar.f5188j;
            this.f5189k = cVar.f5189k;
            this.f5190l = cVar.f5190l;
            this.f5191m = cVar.f5191m;
            this.f5192n = cVar.f5192n;
            this.f5193o = cVar.f5193o;
            this.f5194p = cVar.f5194p;
        }
    }

    /* renamed from: b.q.a.a.i$d */
    /* compiled from: VectorDrawableCompat */
    private static class C0742d extends C0743e {

        /* renamed from: a */
        final Matrix f5195a;

        /* renamed from: b */
        final ArrayList<C0743e> f5196b;

        /* renamed from: c */
        float f5197c;

        /* renamed from: d */
        private float f5198d;

        /* renamed from: e */
        private float f5199e;

        /* renamed from: f */
        private float f5200f;

        /* renamed from: g */
        private float f5201g;

        /* renamed from: h */
        private float f5202h;

        /* renamed from: i */
        private float f5203i;

        /* renamed from: j */
        final Matrix f5204j;

        /* renamed from: k */
        int f5205k;

        /* renamed from: l */
        private int[] f5206l;

        /* renamed from: m */
        private String f5207m;

        public C0742d(C0742d dVar, ArrayMap<String, Object> aVar) {
            C0744f fVar;
            super();
            this.f5195a = new Matrix();
            this.f5196b = new ArrayList<>();
            this.f5197c = 0.0f;
            this.f5198d = 0.0f;
            this.f5199e = 0.0f;
            this.f5200f = 1.0f;
            this.f5201g = 1.0f;
            this.f5202h = 0.0f;
            this.f5203i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5204j = matrix;
            this.f5207m = null;
            this.f5197c = dVar.f5197c;
            this.f5198d = dVar.f5198d;
            this.f5199e = dVar.f5199e;
            this.f5200f = dVar.f5200f;
            this.f5201g = dVar.f5201g;
            this.f5202h = dVar.f5202h;
            this.f5203i = dVar.f5203i;
            this.f5206l = dVar.f5206l;
            String str = dVar.f5207m;
            this.f5207m = str;
            this.f5205k = dVar.f5205k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f5204j);
            ArrayList<C0743e> arrayList = dVar.f5196b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0742d) {
                    this.f5196b.add(new C0742d((C0742d) obj, aVar));
                } else {
                    if (obj instanceof C0741c) {
                        fVar = new C0741c((C0741c) obj);
                    } else if (obj instanceof C0740b) {
                        fVar = new C0740b((C0740b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5196b.add(fVar);
                    String str2 = fVar.f5209b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m6188d() {
            this.f5204j.reset();
            this.f5204j.postTranslate(-this.f5198d, -this.f5199e);
            this.f5204j.postScale(this.f5200f, this.f5201g);
            this.f5204j.postRotate(this.f5197c, 0.0f, 0.0f);
            this.f5204j.postTranslate(this.f5202h + this.f5198d, this.f5203i + this.f5199e);
        }

        /* renamed from: e */
        private void m6189e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5206l = null;
            this.f5197c = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "rotation", 5, this.f5197c);
            this.f5198d = typedArray.getFloat(1, this.f5198d);
            this.f5199e = typedArray.getFloat(2, this.f5199e);
            this.f5200f = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "scaleX", 3, this.f5200f);
            this.f5201g = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "scaleY", 4, this.f5201g);
            this.f5202h = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "translateX", 6, this.f5202h);
            this.f5203i = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "translateY", 7, this.f5203i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5207m = string;
            }
            m6188d();
        }

        /* renamed from: a */
        public boolean mo5539a() {
            for (int i = 0; i < this.f5196b.size(); i++) {
                if (((C0743e) this.f5196b.get(i)).mo5539a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo5540b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5196b.size(); i++) {
                z |= ((C0743e) this.f5196b.get(i)).mo5540b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo5558c(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = TypedArrayUtils.m1835k(resources, theme, attributeSet, AndroidResources.f5144b);
            m6189e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.f5207m;
        }

        public Matrix getLocalMatrix() {
            return this.f5204j;
        }

        public float getPivotX() {
            return this.f5198d;
        }

        public float getPivotY() {
            return this.f5199e;
        }

        public float getRotation() {
            return this.f5197c;
        }

        public float getScaleX() {
            return this.f5200f;
        }

        public float getScaleY() {
            return this.f5201g;
        }

        public float getTranslateX() {
            return this.f5202h;
        }

        public float getTranslateY() {
            return this.f5203i;
        }

        public void setPivotX(float f) {
            if (f != this.f5198d) {
                this.f5198d = f;
                m6188d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5199e) {
                this.f5199e = f;
                m6188d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5197c) {
                this.f5197c = f;
                m6188d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5200f) {
                this.f5200f = f;
                m6188d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5201g) {
                this.f5201g = f;
                m6188d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5202h) {
                this.f5202h = f;
                m6188d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5203i) {
                this.f5203i = f;
                m6188d();
            }
        }

        public C0742d() {
            super();
            this.f5195a = new Matrix();
            this.f5196b = new ArrayList<>();
            this.f5197c = 0.0f;
            this.f5198d = 0.0f;
            this.f5199e = 0.0f;
            this.f5200f = 1.0f;
            this.f5201g = 1.0f;
            this.f5202h = 0.0f;
            this.f5203i = 0.0f;
            this.f5204j = new Matrix();
            this.f5207m = null;
        }
    }

    /* renamed from: b.q.a.a.i$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C0743e {
        private C0743e() {
        }

        /* renamed from: a */
        public boolean mo5539a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo5540b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: b.q.a.a.i$f */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C0744f extends C0743e {

        /* renamed from: a */
        protected C0579b[] f5208a = null;

        /* renamed from: b */
        String f5209b;

        /* renamed from: c */
        int f5210c = 0;

        /* renamed from: d */
        int f5211d;

        public C0744f() {
            super();
        }

        /* renamed from: c */
        public boolean mo5537c() {
            return false;
        }

        /* renamed from: d */
        public void mo5575d(Path path) {
            path.reset();
            C0579b[] bVarArr = this.f5208a;
            if (bVarArr != null) {
                C0579b.m4989e(bVarArr, path);
            }
        }

        public C0579b[] getPathData() {
            return this.f5208a;
        }

        public String getPathName() {
            return this.f5209b;
        }

        public void setPathData(C0579b[] bVarArr) {
            if (!PathParser.m4977b(this.f5208a, bVarArr)) {
                this.f5208a = PathParser.m4981f(bVarArr);
            } else {
                PathParser.m4985j(this.f5208a, bVarArr);
            }
        }

        public C0744f(C0744f fVar) {
            super();
            this.f5209b = fVar.f5209b;
            this.f5211d = fVar.f5211d;
            this.f5208a = PathParser.m4981f(fVar.f5208a);
        }
    }

    /* renamed from: b.q.a.a.i$g */
    /* compiled from: VectorDrawableCompat */
    private static class C0745g {

        /* renamed from: a */
        private static final Matrix f5212a = new Matrix();

        /* renamed from: b */
        private final Path f5213b;

        /* renamed from: c */
        private final Path f5214c;

        /* renamed from: d */
        private final Matrix f5215d;

        /* renamed from: e */
        Paint f5216e;

        /* renamed from: f */
        Paint f5217f;

        /* renamed from: g */
        private PathMeasure f5218g;

        /* renamed from: h */
        private int f5219h;

        /* renamed from: i */
        final C0742d f5220i;

        /* renamed from: j */
        float f5221j;

        /* renamed from: k */
        float f5222k;

        /* renamed from: l */
        float f5223l;

        /* renamed from: m */
        float f5224m;

        /* renamed from: n */
        int f5225n;

        /* renamed from: o */
        String f5226o;

        /* renamed from: p */
        Boolean f5227p;

        /* renamed from: q */
        final ArrayMap<String, Object> f5228q;

        public C0745g() {
            this.f5215d = new Matrix();
            this.f5221j = 0.0f;
            this.f5222k = 0.0f;
            this.f5223l = 0.0f;
            this.f5224m = 0.0f;
            this.f5225n = 255;
            this.f5226o = null;
            this.f5227p = null;
            this.f5228q = new ArrayMap<>();
            this.f5220i = new C0742d();
            this.f5213b = new Path();
            this.f5214c = new Path();
        }

        /* renamed from: a */
        private static float m6197a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m6198c(C0742d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f5195a.set(matrix);
            dVar.f5195a.preConcat(dVar.f5204j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f5196b.size(); i3++) {
                C0743e eVar = (C0743e) dVar.f5196b.get(i3);
                if (eVar instanceof C0742d) {
                    m6198c((C0742d) eVar, dVar.f5195a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C0744f) {
                    m6199d(dVar, (C0744f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m6199d(C0742d dVar, C0744f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f5223l;
            float f2 = ((float) i2) / this.f5224m;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f5195a;
            this.f5215d.set(matrix);
            this.f5215d.postScale(f, f2);
            float e = m6200e(matrix);
            if (e != 0.0f) {
                fVar.mo5575d(this.f5213b);
                Path path = this.f5213b;
                this.f5214c.reset();
                if (fVar.mo5537c()) {
                    this.f5214c.setFillType(fVar.f5210c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                    this.f5214c.addPath(path, this.f5215d);
                    canvas.clipPath(this.f5214c);
                } else {
                    C0741c cVar = (C0741c) fVar;
                    float f3 = cVar.f5189k;
                    if (!(f3 == 0.0f && cVar.f5190l == 1.0f)) {
                        float f4 = cVar.f5191m;
                        float f5 = (f3 + f4) % 1.0f;
                        float f6 = (cVar.f5190l + f4) % 1.0f;
                        if (this.f5218g == null) {
                            this.f5218g = new PathMeasure();
                        }
                        this.f5218g.setPath(this.f5213b, false);
                        float length = this.f5218g.getLength();
                        float f7 = f5 * length;
                        float f8 = f6 * length;
                        path.reset();
                        if (f7 > f8) {
                            this.f5218g.getSegment(f7, length, path, true);
                            this.f5218g.getSegment(0.0f, f8, path, true);
                        } else {
                            this.f5218g.getSegment(f7, f8, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f5214c.addPath(path, this.f5215d);
                    if (cVar.f5186h.mo2167l()) {
                        ComplexColorCompat bVar = cVar.f5186h;
                        if (this.f5217f == null) {
                            Paint paint = new Paint(1);
                            this.f5217f = paint;
                            paint.setStyle(Style.FILL);
                        }
                        Paint paint2 = this.f5217f;
                        if (bVar.mo2163h()) {
                            Shader f9 = bVar.mo2162f();
                            f9.setLocalMatrix(this.f5215d);
                            paint2.setShader(f9);
                            paint2.setAlpha(Math.round(cVar.f5188j * 255.0f));
                        } else {
                            paint2.setShader(null);
                            paint2.setAlpha(255);
                            paint2.setColor(VectorDrawableCompat.m6169a(bVar.mo2161e(), cVar.f5188j));
                        }
                        paint2.setColorFilter(colorFilter);
                        this.f5214c.setFillType(cVar.f5210c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f5214c, paint2);
                    }
                    if (cVar.f5184f.mo2167l()) {
                        ComplexColorCompat bVar2 = cVar.f5184f;
                        if (this.f5216e == null) {
                            Paint paint3 = new Paint(1);
                            this.f5216e = paint3;
                            paint3.setStyle(Style.STROKE);
                        }
                        Paint paint4 = this.f5216e;
                        Join join = cVar.f5193o;
                        if (join != null) {
                            paint4.setStrokeJoin(join);
                        }
                        Cap cap = cVar.f5192n;
                        if (cap != null) {
                            paint4.setStrokeCap(cap);
                        }
                        paint4.setStrokeMiter(cVar.f5194p);
                        if (bVar2.mo2163h()) {
                            Shader f10 = bVar2.mo2162f();
                            f10.setLocalMatrix(this.f5215d);
                            paint4.setShader(f10);
                            paint4.setAlpha(Math.round(cVar.f5187i * 255.0f));
                        } else {
                            paint4.setShader(null);
                            paint4.setAlpha(255);
                            paint4.setColor(VectorDrawableCompat.m6169a(bVar2.mo2161e(), cVar.f5187i));
                        }
                        paint4.setColorFilter(colorFilter);
                        paint4.setStrokeWidth(cVar.f5185g * min * e);
                        canvas.drawPath(this.f5214c, paint4);
                    }
                }
            }
        }

        /* renamed from: e */
        private float m6200e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m6197a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo5579b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m6198c(this.f5220i, f5212a, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo5580f() {
            if (this.f5227p == null) {
                this.f5227p = Boolean.valueOf(this.f5220i.mo5539a());
            }
            return this.f5227p.booleanValue();
        }

        /* renamed from: g */
        public boolean mo5581g(int[] iArr) {
            return this.f5220i.mo5540b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5225n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5225n = i;
        }

        public C0745g(C0745g gVar) {
            this.f5215d = new Matrix();
            this.f5221j = 0.0f;
            this.f5222k = 0.0f;
            this.f5223l = 0.0f;
            this.f5224m = 0.0f;
            this.f5225n = 255;
            this.f5226o = null;
            this.f5227p = null;
            ArrayMap<String, Object> aVar = new ArrayMap<>();
            this.f5228q = aVar;
            this.f5220i = new C0742d(gVar.f5220i, aVar);
            this.f5213b = new Path(gVar.f5213b);
            this.f5214c = new Path(gVar.f5214c);
            this.f5221j = gVar.f5221j;
            this.f5222k = gVar.f5222k;
            this.f5223l = gVar.f5223l;
            this.f5224m = gVar.f5224m;
            this.f5219h = gVar.f5219h;
            this.f5225n = gVar.f5225n;
            this.f5226o = gVar.f5226o;
            String str = gVar.f5226o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f5227p = gVar.f5227p;
        }
    }

    /* renamed from: b.q.a.a.i$h */
    /* compiled from: VectorDrawableCompat */
    private static class C0746h extends ConstantState {

        /* renamed from: a */
        int f5229a;

        /* renamed from: b */
        C0745g f5230b;

        /* renamed from: c */
        ColorStateList f5231c;

        /* renamed from: d */
        Mode f5232d;

        /* renamed from: e */
        boolean f5233e;

        /* renamed from: f */
        Bitmap f5234f;

        /* renamed from: g */
        ColorStateList f5235g;

        /* renamed from: h */
        Mode f5236h;

        /* renamed from: i */
        int f5237i;

        /* renamed from: j */
        boolean f5238j;

        /* renamed from: k */
        boolean f5239k;

        /* renamed from: l */
        Paint f5240l;

        public C0746h(C0746h hVar) {
            this.f5231c = null;
            this.f5232d = VectorDrawableCompat.f5173b;
            if (hVar != null) {
                this.f5229a = hVar.f5229a;
                C0745g gVar = new C0745g(hVar.f5230b);
                this.f5230b = gVar;
                if (hVar.f5230b.f5217f != null) {
                    gVar.f5217f = new Paint(hVar.f5230b.f5217f);
                }
                if (hVar.f5230b.f5216e != null) {
                    this.f5230b.f5216e = new Paint(hVar.f5230b.f5216e);
                }
                this.f5231c = hVar.f5231c;
                this.f5232d = hVar.f5232d;
                this.f5233e = hVar.f5233e;
            }
        }

        /* renamed from: a */
        public boolean mo5586a(int i, int i2) {
            return i == this.f5234f.getWidth() && i2 == this.f5234f.getHeight();
        }

        /* renamed from: b */
        public boolean mo5587b() {
            return !this.f5239k && this.f5235g == this.f5231c && this.f5236h == this.f5232d && this.f5238j == this.f5233e && this.f5237i == this.f5230b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo5588c(int i, int i2) {
            if (this.f5234f == null || !mo5586a(i, i2)) {
                this.f5234f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f5239k = true;
            }
        }

        /* renamed from: d */
        public void mo5589d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5234f, null, rect, mo5590e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo5590e(ColorFilter colorFilter) {
            if (!mo5591f() && colorFilter == null) {
                return null;
            }
            if (this.f5240l == null) {
                Paint paint = new Paint();
                this.f5240l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5240l.setAlpha(this.f5230b.getRootAlpha());
            this.f5240l.setColorFilter(colorFilter);
            return this.f5240l;
        }

        /* renamed from: f */
        public boolean mo5591f() {
            return this.f5230b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo5592g() {
            return this.f5230b.mo5580f();
        }

        public int getChangingConfigurations() {
            return this.f5229a;
        }

        /* renamed from: h */
        public boolean mo5594h(int[] iArr) {
            boolean g = this.f5230b.mo5581g(iArr);
            this.f5239k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo5595i() {
            this.f5235g = this.f5231c;
            this.f5236h = this.f5232d;
            this.f5237i = this.f5230b.getRootAlpha();
            this.f5238j = this.f5233e;
            this.f5239k = false;
        }

        /* renamed from: j */
        public void mo5596j(int i, int i2) {
            this.f5234f.eraseColor(0);
            this.f5230b.mo5579b(new Canvas(this.f5234f), i, i2, null);
        }

        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public C0746h() {
            this.f5231c = null;
            this.f5232d = VectorDrawableCompat.f5173b;
            this.f5230b = new C0745g();
        }
    }

    /* renamed from: b.q.a.a.i$i */
    /* compiled from: VectorDrawableCompat */
    private static class C0747i extends ConstantState {

        /* renamed from: a */
        private final ConstantState f5241a;

        public C0747i(ConstantState constantState) {
            this.f5241a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5241a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5241a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            VectorDrawableCompat iVar = new VectorDrawableCompat();
            iVar.f5172a = (VectorDrawable) this.f5241a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat iVar = new VectorDrawableCompat();
            iVar.f5172a = (VectorDrawable) this.f5241a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            VectorDrawableCompat iVar = new VectorDrawableCompat();
            iVar.f5172a = (VectorDrawable) this.f5241a.newDrawable(resources, theme);
            return iVar;
        }
    }

    VectorDrawableCompat() {
        this.f5178g = true;
        this.f5180i = new float[9];
        this.f5181j = new Matrix();
        this.f5182k = new Rect();
        this.f5174c = new C0746h();
    }

    /* renamed from: a */
    static int m6169a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p010b.p063q.p064a.p065a.VectorDrawableCompat m6170b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            b.q.a.a.i r0 = new b.q.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.p007c.ResourcesCompat.m1811a(r6, r7, r8)
            r0.f5172a = r6
            b.q.a.a.i$i r6 = new b.q.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f5172a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f5179h = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            b.q.a.a.i r6 = m6171c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p063q.p064a.p065a.VectorDrawableCompat.m6170b(android.content.res.Resources, int, android.content.res.Resources$Theme):b.q.a.a.i");
    }

    /* renamed from: c */
    public static VectorDrawableCompat m6171c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat iVar = new VectorDrawableCompat();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: e */
    private void m6172e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0746h hVar = this.f5174c;
        C0745g gVar = hVar.f5230b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f5220i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String str = "group";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0742d dVar = (C0742d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0741c cVar = new C0741c();
                    cVar.mo5541g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5196b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f5228q.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f5229a = cVar.f5211d | hVar.f5229a;
                } else if ("clip-path".equals(name)) {
                    C0740b bVar = new C0740b();
                    bVar.mo5538e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5196b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f5228q.put(bVar.getPathName(), bVar);
                    }
                    hVar.f5229a = bVar.f5211d | hVar.f5229a;
                } else if (str.equals(name)) {
                    C0742d dVar2 = new C0742d();
                    dVar2.mo5558c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5196b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f5228q.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f5229a = dVar2.f5205k | hVar.f5229a;
                }
            } else if (eventType == 3 && str.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m6173f() {
        if (VERSION.SDK_INT < 17 || !isAutoMirrored() || DrawableCompat.m1847f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static Mode m6174g(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m6175i(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) throws XmlPullParserException {
        C0746h hVar = this.f5174c;
        C0745g gVar = hVar.f5230b;
        hVar.f5232d = m6174g(TypedArrayUtils.m1831g(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList c = TypedArrayUtils.m1827c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f5231c = c;
        }
        hVar.f5233e = TypedArrayUtils.m1825a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5233e);
        gVar.f5223l = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f5223l);
        float f = TypedArrayUtils.m1830f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f5224m);
        gVar.f5224m = f;
        if (gVar.f5223l <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (f > 0.0f) {
            gVar.f5221j = typedArray.getDimension(3, gVar.f5221j);
            float dimension = typedArray.getDimension(2, gVar.f5222k);
            gVar.f5222k = dimension;
            if (gVar.f5221j <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (dimension > 0.0f) {
                gVar.setAlpha(TypedArrayUtils.m1830f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f5226o = string;
                    gVar.f5228q.put(string, gVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1843b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Object mo5512d(String str) {
        return this.f5174c.f5230b.f5228q.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5182k);
        if (this.f5182k.width() > 0 && this.f5182k.height() > 0) {
            ColorFilter colorFilter = this.f5176e;
            if (colorFilter == null) {
                colorFilter = this.f5175d;
            }
            canvas.getMatrix(this.f5181j);
            this.f5181j.getValues(this.f5180i);
            float abs = Math.abs(this.f5180i[0]);
            float abs2 = Math.abs(this.f5180i[4]);
            float abs3 = Math.abs(this.f5180i[1]);
            float abs4 = Math.abs(this.f5180i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f5182k.height()) * abs2);
            int min = Math.min(2048, (int) (((float) this.f5182k.width()) * abs));
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f5182k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m6173f()) {
                    canvas.translate((float) this.f5182k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f5182k.offsetTo(0, 0);
                this.f5174c.mo5588c(min, min2);
                if (!this.f5178g) {
                    this.f5174c.mo5596j(min, min2);
                } else if (!this.f5174c.mo5587b()) {
                    this.f5174c.mo5596j(min, min2);
                    this.f5174c.mo5595i();
                }
                this.f5174c.mo5589d(canvas, colorFilter, this.f5182k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return DrawableCompat.m1845d(drawable);
        }
        return this.f5174c.f5230b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5174c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return DrawableCompat.m1846e(drawable);
        }
        return this.f5176e;
    }

    public ConstantState getConstantState() {
        if (this.f5172a != null && VERSION.SDK_INT >= 24) {
            return new C0747i(this.f5172a.getConstantState());
        }
        this.f5174c.f5229a = getChangingConfigurations();
        return this.f5174c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f5174c.f5230b.f5222k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f5174c.f5230b.f5221j;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo5521h(boolean z) {
        this.f5178g = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return DrawableCompat.m1849h(drawable);
        }
        return this.f5174c.f5233e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.isStateful() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f5172a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            b.q.a.a.i$h r0 = r1.f5174c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo5592g()
            if (r0 != 0) goto L_0x0028
            b.q.a.a.i$h r0 = r1.f5174c
            android.content.res.ColorStateList r0 = r0.f5231c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p063q.p064a.p065a.VectorDrawableCompat.isStateful():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public PorterDuffColorFilter mo5527j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5177f && super.mutate() == this) {
            this.f5174c = new C0746h(this.f5174c);
            this.f5177f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0746h hVar = this.f5174c;
        ColorStateList colorStateList = hVar.f5231c;
        boolean z2 = true;
        if (colorStateList != null) {
            Mode mode = hVar.f5232d;
            if (mode != null) {
                this.f5175d = mo5527j(this.f5175d, colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (!hVar.mo5592g() || !hVar.mo5594h(iArr)) {
            z2 = z;
        } else {
            invalidateSelf();
        }
        return z2;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        if (this.f5174c.f5230b.getRootAlpha() != i) {
            this.f5174c.f5230b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1851j(drawable, z);
        } else {
            this.f5174c.f5233e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1855n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1856o(drawable, colorStateList);
            return;
        }
        C0746h hVar = this.f5174c;
        if (hVar.f5231c != colorStateList) {
            hVar.f5231c = colorStateList;
            this.f5175d = mo5527j(this.f5175d, colorStateList, hVar.f5232d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1857p(drawable, mode);
            return;
        }
        C0746h hVar = this.f5174c;
        if (hVar.f5232d != mode) {
            hVar.f5232d = mode;
            this.f5175d = mo5527j(this.f5175d, hVar.f5231c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5176e = colorFilter;
        invalidateSelf();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1848g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0746h hVar = this.f5174c;
        hVar.f5230b = new C0745g();
        TypedArray k = TypedArrayUtils.m1835k(resources, theme, attributeSet, AndroidResources.f5143a);
        m6175i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f5229a = getChangingConfigurations();
        hVar.f5239k = true;
        m6172e(resources, xmlPullParser, attributeSet, theme);
        this.f5175d = mo5527j(this.f5175d, hVar.f5231c, hVar.f5232d);
    }

    VectorDrawableCompat(C0746h hVar) {
        this.f5178g = true;
        this.f5180i = new float[9];
        this.f5181j = new Matrix();
        this.f5182k = new Rect();
        this.f5174c = hVar;
        this.f5175d = mo5527j(this.f5175d, hVar.f5231c, hVar.f5232d);
    }
}
