package p067c.p068a.p069a.p114b.p133z;

import android.graphics.Typeface;

/* renamed from: c.a.a.b.z.a */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* renamed from: a */
    private final Typeface f9704a;

    /* renamed from: b */
    private final C1310a f9705b;

    /* renamed from: c */
    private boolean f9706c;

    /* renamed from: c.a.a.b.z.a$a */
    /* compiled from: CancelableFontCallback */
    public interface C1310a {
        /* renamed from: a */
        void mo8088a(Typeface typeface);
    }

    public CancelableFontCallback(C1310a aVar, Typeface typeface) {
        this.f9704a = typeface;
        this.f9705b = aVar;
    }

    /* renamed from: d */
    private void m11591d(Typeface typeface) {
        if (!this.f9706c) {
            this.f9705b.mo8088a(typeface);
        }
    }

    /* renamed from: a */
    public void mo8085a(int i) {
        m11591d(this.f9704a);
    }

    /* renamed from: b */
    public void mo8086b(Typeface typeface, boolean z) {
        m11591d(typeface);
    }

    /* renamed from: c */
    public void mo8087c() {
        this.f9706c = true;
    }
}
