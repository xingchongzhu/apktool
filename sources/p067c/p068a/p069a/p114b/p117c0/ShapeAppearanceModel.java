package p067c.p068a.p069a.p114b.p117c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p067c.p068a.p069a.p114b.C1297l;

/* renamed from: c.a.a.b.c0.k */
public class ShapeAppearanceModel {

    /* renamed from: a */
    public static final CornerSize f9141a = new RelativeCornerSize(0.5f);

    /* renamed from: b */
    CornerTreatment f9142b;

    /* renamed from: c */
    CornerTreatment f9143c;

    /* renamed from: d */
    CornerTreatment f9144d;

    /* renamed from: e */
    CornerTreatment f9145e;

    /* renamed from: f */
    CornerSize f9146f;

    /* renamed from: g */
    CornerSize f9147g;

    /* renamed from: h */
    CornerSize f9148h;

    /* renamed from: i */
    CornerSize f9149i;

    /* renamed from: j */
    EdgeTreatment f9150j;

    /* renamed from: k */
    EdgeTreatment f9151k;

    /* renamed from: l */
    EdgeTreatment f9152l;

    /* renamed from: m */
    EdgeTreatment f9153m;

    /* renamed from: c.a.a.b.c0.k$b */
    /* compiled from: ShapeAppearanceModel */
    public static final class C1276b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public CornerTreatment f9154a = MaterialShapeUtils.m11334b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public CornerTreatment f9155b = MaterialShapeUtils.m11334b();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CornerTreatment f9156c = MaterialShapeUtils.m11334b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CornerTreatment f9157d = MaterialShapeUtils.m11334b();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public CornerSize f9158e = new AbsoluteCornerSize(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public CornerSize f9159f = new AbsoluteCornerSize(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public CornerSize f9160g = new AbsoluteCornerSize(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public CornerSize f9161h = new AbsoluteCornerSize(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public EdgeTreatment f9162i = MaterialShapeUtils.m11335c();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public EdgeTreatment f9163j = MaterialShapeUtils.m11335c();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public EdgeTreatment f9164k = MaterialShapeUtils.m11335c();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public EdgeTreatment f9165l = MaterialShapeUtils.m11335c();

        public C1276b() {
        }

        /* renamed from: n */
        private static float m11378n(CornerTreatment dVar) {
            if (dVar instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) dVar).f9140a;
            }
            if (dVar instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) dVar).f9089a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C1276b mo7899A(float f) {
            this.f9158e = new AbsoluteCornerSize(f);
            return this;
        }

        /* renamed from: B */
        public C1276b mo7900B(CornerSize cVar) {
            this.f9158e = cVar;
            return this;
        }

        /* renamed from: C */
        public C1276b mo7901C(int i, CornerSize cVar) {
            return mo7902D(MaterialShapeUtils.m11333a(i)).mo7904F(cVar);
        }

        /* renamed from: D */
        public C1276b mo7902D(CornerTreatment dVar) {
            this.f9155b = dVar;
            float n = m11378n(dVar);
            if (n != -1.0f) {
                mo7903E(n);
            }
            return this;
        }

        /* renamed from: E */
        public C1276b mo7903E(float f) {
            this.f9159f = new AbsoluteCornerSize(f);
            return this;
        }

        /* renamed from: F */
        public C1276b mo7904F(CornerSize cVar) {
            this.f9159f = cVar;
            return this;
        }

        /* renamed from: m */
        public ShapeAppearanceModel mo7905m() {
            return new ShapeAppearanceModel(this);
        }

        /* renamed from: o */
        public C1276b mo7906o(float f) {
            return mo7899A(f).mo7903E(f).mo7914w(f).mo7910s(f);
        }

        /* renamed from: p */
        public C1276b mo7907p(CornerSize cVar) {
            return mo7900B(cVar).mo7904F(cVar).mo7915x(cVar).mo7911t(cVar);
        }

        /* renamed from: q */
        public C1276b mo7908q(int i, CornerSize cVar) {
            return mo7909r(MaterialShapeUtils.m11333a(i)).mo7911t(cVar);
        }

        /* renamed from: r */
        public C1276b mo7909r(CornerTreatment dVar) {
            this.f9157d = dVar;
            float n = m11378n(dVar);
            if (n != -1.0f) {
                mo7910s(n);
            }
            return this;
        }

        /* renamed from: s */
        public C1276b mo7910s(float f) {
            this.f9161h = new AbsoluteCornerSize(f);
            return this;
        }

        /* renamed from: t */
        public C1276b mo7911t(CornerSize cVar) {
            this.f9161h = cVar;
            return this;
        }

        /* renamed from: u */
        public C1276b mo7912u(int i, CornerSize cVar) {
            return mo7913v(MaterialShapeUtils.m11333a(i)).mo7915x(cVar);
        }

        /* renamed from: v */
        public C1276b mo7913v(CornerTreatment dVar) {
            this.f9156c = dVar;
            float n = m11378n(dVar);
            if (n != -1.0f) {
                mo7914w(n);
            }
            return this;
        }

        /* renamed from: w */
        public C1276b mo7914w(float f) {
            this.f9160g = new AbsoluteCornerSize(f);
            return this;
        }

        /* renamed from: x */
        public C1276b mo7915x(CornerSize cVar) {
            this.f9160g = cVar;
            return this;
        }

        /* renamed from: y */
        public C1276b mo7916y(int i, CornerSize cVar) {
            return mo7917z(MaterialShapeUtils.m11333a(i)).mo7900B(cVar);
        }

        /* renamed from: z */
        public C1276b mo7917z(CornerTreatment dVar) {
            this.f9154a = dVar;
            float n = m11378n(dVar);
            if (n != -1.0f) {
                mo7899A(n);
            }
            return this;
        }

        public C1276b(ShapeAppearanceModel kVar) {
            this.f9154a = kVar.f9142b;
            this.f9155b = kVar.f9143c;
            this.f9156c = kVar.f9144d;
            this.f9157d = kVar.f9145e;
            this.f9158e = kVar.f9146f;
            this.f9159f = kVar.f9147g;
            this.f9160g = kVar.f9148h;
            this.f9161h = kVar.f9149i;
            this.f9162i = kVar.f9150j;
            this.f9163j = kVar.f9151k;
            this.f9164k = kVar.f9152l;
            this.f9165l = kVar.f9153m;
        }
    }

    /* renamed from: c.a.a.b.c0.k$c */
    /* compiled from: ShapeAppearanceModel */
    public interface C1277c {
        /* renamed from: a */
        CornerSize mo7877a(CornerSize cVar);
    }

    /* renamed from: a */
    public static C1276b m11341a() {
        return new C1276b();
    }

    /* renamed from: b */
    public static C1276b m11342b(Context context, int i, int i2) {
        return m11343c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C1276b m11343c(Context context, int i, int i2, int i3) {
        return m11344d(context, i, i2, new AbsoluteCornerSize((float) i3));
    }

    /* renamed from: d */
    private static C1276b m11344d(Context context, int i, int i2, CornerSize cVar) {
        if (i2 != 0) {
            Context contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1297l.f9258F3);
        try {
            int i3 = obtainStyledAttributes.getInt(C1297l.f9266G3, 0);
            int i4 = obtainStyledAttributes.getInt(C1297l.f9288J3, i3);
            int i5 = obtainStyledAttributes.getInt(C1297l.f9295K3, i3);
            int i6 = obtainStyledAttributes.getInt(C1297l.f9281I3, i3);
            int i7 = obtainStyledAttributes.getInt(C1297l.f9274H3, i3);
            CornerSize m = m11348m(obtainStyledAttributes, C1297l.f9302L3, cVar);
            CornerSize m2 = m11348m(obtainStyledAttributes, C1297l.f9323O3, m);
            CornerSize m3 = m11348m(obtainStyledAttributes, C1297l.f9330P3, m);
            CornerSize m4 = m11348m(obtainStyledAttributes, C1297l.f9316N3, m);
            return new C1276b().mo7916y(i4, m2).mo7901C(i5, m3).mo7912u(i6, m4).mo7908q(i7, m11348m(obtainStyledAttributes, C1297l.f9309M3, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C1276b m11345e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m11346f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C1276b m11346f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m11347g(context, attributeSet, i, i2, new AbsoluteCornerSize((float) i3));
    }

    /* renamed from: g */
    public static C1276b m11347g(Context context, AttributeSet attributeSet, int i, int i2, CornerSize cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9357T2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C1297l.f9364U2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C1297l.f9371V2, 0);
        obtainStyledAttributes.recycle();
        return m11344d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static CornerSize m11348m(TypedArray typedArray, int i, CornerSize cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new AbsoluteCornerSize((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: h */
    public EdgeTreatment mo7882h() {
        return this.f9152l;
    }

    /* renamed from: i */
    public CornerTreatment mo7883i() {
        return this.f9145e;
    }

    /* renamed from: j */
    public CornerSize mo7884j() {
        return this.f9149i;
    }

    /* renamed from: k */
    public CornerTreatment mo7885k() {
        return this.f9144d;
    }

    /* renamed from: l */
    public CornerSize mo7886l() {
        return this.f9148h;
    }

    /* renamed from: n */
    public EdgeTreatment mo7887n() {
        return this.f9153m;
    }

    /* renamed from: o */
    public EdgeTreatment mo7888o() {
        return this.f9151k;
    }

    /* renamed from: p */
    public EdgeTreatment mo7889p() {
        return this.f9150j;
    }

    /* renamed from: q */
    public CornerTreatment mo7890q() {
        return this.f9142b;
    }

    /* renamed from: r */
    public CornerSize mo7891r() {
        return this.f9146f;
    }

    /* renamed from: s */
    public CornerTreatment mo7892s() {
        return this.f9143c;
    }

    /* renamed from: t */
    public CornerSize mo7893t() {
        return this.f9147g;
    }

    /* renamed from: u */
    public boolean mo7894u(RectF rectF) {
        Class<EdgeTreatment> cls = EdgeTreatment.class;
        boolean z = this.f9153m.getClass().equals(cls) && this.f9151k.getClass().equals(cls) && this.f9150j.getClass().equals(cls) && this.f9152l.getClass().equals(cls);
        float a = this.f9146f.mo7819a(rectF);
        boolean z2 = this.f9147g.mo7819a(rectF) == a && this.f9149i.mo7819a(rectF) == a && this.f9148h.mo7819a(rectF) == a;
        boolean z3 = (this.f9143c instanceof RoundedCornerTreatment) && (this.f9142b instanceof RoundedCornerTreatment) && (this.f9144d instanceof RoundedCornerTreatment) && (this.f9145e instanceof RoundedCornerTreatment);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public C1276b mo7895v() {
        return new C1276b(this);
    }

    /* renamed from: w */
    public ShapeAppearanceModel mo7896w(float f) {
        return mo7895v().mo7906o(f).mo7905m();
    }

    /* renamed from: x */
    public ShapeAppearanceModel mo7897x(CornerSize cVar) {
        return mo7895v().mo7907p(cVar).mo7905m();
    }

    /* renamed from: y */
    public ShapeAppearanceModel mo7898y(C1277c cVar) {
        return mo7895v().mo7900B(cVar.mo7877a(mo7891r())).mo7904F(cVar.mo7877a(mo7893t())).mo7911t(cVar.mo7877a(mo7884j())).mo7915x(cVar.mo7877a(mo7886l())).mo7905m();
    }

    private ShapeAppearanceModel(C1276b bVar) {
        this.f9142b = bVar.f9154a;
        this.f9143c = bVar.f9155b;
        this.f9144d = bVar.f9156c;
        this.f9145e = bVar.f9157d;
        this.f9146f = bVar.f9158e;
        this.f9147g = bVar.f9159f;
        this.f9148h = bVar.f9160g;
        this.f9149i = bVar.f9161h;
        this.f9150j = bVar.f9162i;
        this.f9151k = bVar.f9163j;
        this.f9152l = bVar.f9164k;
        this.f9153m = bVar.f9165l;
    }

    public ShapeAppearanceModel() {
        this.f9142b = MaterialShapeUtils.m11334b();
        this.f9143c = MaterialShapeUtils.m11334b();
        this.f9144d = MaterialShapeUtils.m11334b();
        this.f9145e = MaterialShapeUtils.m11334b();
        this.f9146f = new AbsoluteCornerSize(0.0f);
        this.f9147g = new AbsoluteCornerSize(0.0f);
        this.f9148h = new AbsoluteCornerSize(0.0f);
        this.f9149i = new AbsoluteCornerSize(0.0f);
        this.f9150j = MaterialShapeUtils.m11335c();
        this.f9151k = MaterialShapeUtils.m11335c();
        this.f9152l = MaterialShapeUtils.m11335c();
        this.f9153m = MaterialShapeUtils.m11335c();
    }
}
