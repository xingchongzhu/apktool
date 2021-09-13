package p067c.p068a.p069a.p070a.p073c2;

/* renamed from: c.a.a.a.c2.a */
public abstract class Buffer {

    /* renamed from: a */
    private int f5719a;

    /* renamed from: e */
    public final void mo5946e(int i) {
        this.f5719a = i | this.f5719a;
    }

    /* renamed from: f */
    public void mo5947f() {
        this.f5719a = 0;
    }

    /* renamed from: g */
    public final void mo5948g(int i) {
        this.f5719a = (i ^ -1) & this.f5719a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo5949h(int i) {
        return (this.f5719a & i) == i;
    }

    /* renamed from: i */
    public final boolean mo5950i() {
        return mo5949h(268435456);
    }

    /* renamed from: j */
    public final boolean mo5951j() {
        return mo5949h(Integer.MIN_VALUE);
    }

    /* renamed from: k */
    public final boolean mo5952k() {
        return mo5949h(4);
    }

    /* renamed from: l */
    public final boolean mo5953l() {
        return mo5949h(1);
    }

    /* renamed from: m */
    public final void mo5954m(int i) {
        this.f5719a = i;
    }
}
