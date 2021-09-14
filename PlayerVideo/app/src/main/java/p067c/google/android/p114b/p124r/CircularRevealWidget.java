package p067c.google.android.p114b.p124r;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p067c.google.android.p114b.p131x.C1309a;

/* renamed from: c.a.a.b.r.d */
public interface CircularRevealWidget {

    /* renamed from: c.a.a.b.r.d$b */
    /* compiled from: CircularRevealWidget */
    public static class C1304b implements TypeEvaluator<C1307e> {

        /* renamed from: a */
        public static final TypeEvaluator<C1307e> f9684a = new C1304b();

        /* renamed from: b */
        private final C1307e f9685b = new C1307e();

        /* renamed from: a */
        public C1307e evaluate(float f, C1307e eVar, C1307e eVar2) {
            this.f9685b.mo8073a(C1309a.m11589c(eVar.f9688a, eVar2.f9688a, f), C1309a.m11589c(eVar.f9689b, eVar2.f9689b, f), C1309a.m11589c(eVar.f9690c, eVar2.f9690c, f));
            return this.f9685b;
        }
    }

    /* renamed from: c.a.a.b.r.d$c */
    /* compiled from: CircularRevealWidget */
    public static class C1305c extends Property<CircularRevealWidget, C1307e> {

        /* renamed from: a */
        public static final Property<CircularRevealWidget, C1307e> f9686a = new C1305c("circularReveal");

        private C1305c(String str) {
            super(C1307e.class, str);
        }

        /* renamed from: a */
        public C1307e get(CircularRevealWidget dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(CircularRevealWidget dVar, C1307e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: c.a.a.b.r.d$d */
    /* compiled from: CircularRevealWidget */
    public static class C1306d extends Property<CircularRevealWidget, Integer> {

        /* renamed from: a */
        public static final Property<CircularRevealWidget, Integer> f9687a = new C1306d("circularRevealScrimColor");

        private C1306d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(CircularRevealWidget dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(CircularRevealWidget dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: c.a.a.b.r.d$e */
    /* compiled from: CircularRevealWidget */
    public static class C1307e {

        /* renamed from: a */
        public float f9688a;

        /* renamed from: b */
        public float f9689b;

        /* renamed from: c */
        public float f9690c;

        /* renamed from: a */
        public void mo8073a(float f, float f2, float f3) {
            this.f9688a = f;
            this.f9689b = f2;
            this.f9690c = f3;
        }

        private C1307e() {
        }

        public C1307e(float f, float f2, float f3) {
            this.f9688a = f;
            this.f9689b = f2;
            this.f9690c = f3;
        }
    }

    /* renamed from: a */
    void mo8053a();

    /* renamed from: b */
    void mo8054b();

    int getCircularRevealScrimColor();

    C1307e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C1307e eVar);
}
