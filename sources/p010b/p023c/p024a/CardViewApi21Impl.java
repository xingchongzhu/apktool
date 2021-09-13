package p010b.p023c.p024a;

import android.content.res.ColorStateList;

/* renamed from: b.c.a.c */
class CardViewApi21Impl implements CardViewImpl {
    CardViewApi21Impl() {
    }

    /* renamed from: n */
    private RoundRectDrawable m4349n(CardViewDelegate eVar) {
        return (RoundRectDrawable) eVar.mo4342f();
    }

    /* renamed from: a */
    public float mo4323a(CardViewDelegate eVar) {
        return m4349n(eVar).mo4344c();
    }

    /* renamed from: b */
    public ColorStateList mo4324b(CardViewDelegate eVar) {
        return m4349n(eVar).mo4343b();
    }

    /* renamed from: c */
    public void mo4325c(CardViewDelegate eVar, float f) {
        m4349n(eVar).mo4351h(f);
    }

    /* renamed from: d */
    public float mo4326d(CardViewDelegate eVar) {
        return eVar.mo4338b().getElevation();
    }

    /* renamed from: e */
    public void mo4321e() {
    }

    /* renamed from: f */
    public float mo4327f(CardViewDelegate eVar) {
        return m4349n(eVar).mo4345d();
    }

    /* renamed from: g */
    public float mo4328g(CardViewDelegate eVar) {
        return mo4327f(eVar) * 2.0f;
    }

    /* renamed from: h */
    public float mo4329h(CardViewDelegate eVar) {
        return mo4327f(eVar) * 2.0f;
    }

    /* renamed from: i */
    public void mo4330i(CardViewDelegate eVar) {
        mo4334m(eVar, mo4323a(eVar));
    }

    /* renamed from: j */
    public void mo4331j(CardViewDelegate eVar, float f) {
        eVar.mo4338b().setElevation(f);
    }

    /* renamed from: k */
    public void mo4332k(CardViewDelegate eVar) {
        mo4334m(eVar, mo4323a(eVar));
    }

    /* renamed from: l */
    public void mo4333l(CardViewDelegate eVar, ColorStateList colorStateList) {
        m4349n(eVar).mo4347f(colorStateList);
    }

    /* renamed from: m */
    public void mo4334m(CardViewDelegate eVar, float f) {
        m4349n(eVar).mo4348g(f, eVar.mo4341e(), eVar.mo4340d());
        mo4335o(eVar);
    }

    /* renamed from: o */
    public void mo4335o(CardViewDelegate eVar) {
        if (!eVar.mo4341e()) {
            eVar.mo4337a(0, 0, 0, 0);
            return;
        }
        float a = mo4323a(eVar);
        float f = mo4327f(eVar);
        int ceil = (int) Math.ceil((double) RoundRectDrawableWithShadow.m4410c(a, f, eVar.mo4340d()));
        int ceil2 = (int) Math.ceil((double) RoundRectDrawableWithShadow.m4411d(a, f, eVar.mo4340d()));
        eVar.mo4337a(ceil, ceil2, ceil, ceil2);
    }
}
