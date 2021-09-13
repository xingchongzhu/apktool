package p010b.p023c.p024a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: b.c.a.b */
class CardViewApi17Impl extends CardViewBaseImpl {

    /* renamed from: b.c.a.b$a */
    /* compiled from: CardViewApi17Impl */
    class C0541a implements C0543a {
        C0541a() {
        }

        /* renamed from: a */
        public void mo4322a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    CardViewApi17Impl() {
    }

    /* renamed from: e */
    public void mo4321e() {
        RoundRectDrawableWithShadow.f3900b = new C0541a();
    }
}
