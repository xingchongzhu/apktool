package p010b.p023c.p024a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: b.c.a.d */
class CardViewBaseImpl implements CardViewImpl {

    /* renamed from: a */
    final RectF f3886a = new RectF();

    /* renamed from: b.c.a.d$a */
    /* compiled from: CardViewBaseImpl */
    class C0542a implements C0543a {
        C0542a() {
        }

        /* renamed from: a */
        public void mo4322a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                CardViewBaseImpl.this.f3886a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(CardViewBaseImpl.this.f3886a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(CardViewBaseImpl.this.f3886a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(CardViewBaseImpl.this.f3886a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(CardViewBaseImpl.this.f3886a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = (rectF2.left + f3) - 1.0f;
                float f6 = rectF2.top;
                canvas.drawRect(f5, f6, (rectF2.right - f3) + 1.0f, f6 + f3, paint2);
                float f7 = (rectF2.left + f3) - 1.0f;
                float f8 = rectF2.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF2.right - f3) + 1.0f, f8, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    CardViewBaseImpl() {
    }

    /* renamed from: n */
    private RoundRectDrawableWithShadow m4364n(CardViewDelegate eVar) {
        return (RoundRectDrawableWithShadow) eVar.mo4342f();
    }

    /* renamed from: a */
    public float mo4323a(CardViewDelegate eVar) {
        return m4364n(eVar).mo4365i();
    }

    /* renamed from: b */
    public ColorStateList mo4324b(CardViewDelegate eVar) {
        return m4364n(eVar).mo4360f();
    }

    /* renamed from: c */
    public void mo4325c(CardViewDelegate eVar, float f) {
        m4364n(eVar).mo4374p(f);
        mo4336o(eVar);
    }

    /* renamed from: d */
    public float mo4326d(CardViewDelegate eVar) {
        return m4364n(eVar).mo4369l();
    }

    /* renamed from: e */
    public void mo4321e() {
        RoundRectDrawableWithShadow.f3900b = new C0542a();
    }

    /* renamed from: f */
    public float mo4327f(CardViewDelegate eVar) {
        return m4364n(eVar).mo4361g();
    }

    /* renamed from: g */
    public float mo4328g(CardViewDelegate eVar) {
        return m4364n(eVar).mo4367j();
    }

    /* renamed from: h */
    public float mo4329h(CardViewDelegate eVar) {
        return m4364n(eVar).mo4368k();
    }

    /* renamed from: i */
    public void mo4330i(CardViewDelegate eVar) {
    }

    /* renamed from: j */
    public void mo4331j(CardViewDelegate eVar, float f) {
        m4364n(eVar).mo4376r(f);
    }

    /* renamed from: k */
    public void mo4332k(CardViewDelegate eVar) {
        m4364n(eVar).mo4370m(eVar.mo4340d());
        mo4336o(eVar);
    }

    /* renamed from: l */
    public void mo4333l(CardViewDelegate eVar, ColorStateList colorStateList) {
        m4364n(eVar).mo4371o(colorStateList);
    }

    /* renamed from: m */
    public void mo4334m(CardViewDelegate eVar, float f) {
        m4364n(eVar).mo4375q(f);
        mo4336o(eVar);
    }

    /* renamed from: o */
    public void mo4336o(CardViewDelegate eVar) {
        Rect rect = new Rect();
        m4364n(eVar).mo4364h(rect);
        eVar.mo4339c((int) Math.ceil((double) mo4329h(eVar)), (int) Math.ceil((double) mo4328g(eVar)));
        eVar.mo4337a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
