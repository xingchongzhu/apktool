package com.bumptech.glide.p174t.p175l;

/* renamed from: com.bumptech.glide.t.l.c */
public abstract class StateVerifier {

    /* renamed from: com.bumptech.glide.t.l.c$b */
    /* compiled from: StateVerifier */
    private static class C1649b extends StateVerifier {

        /* renamed from: a */
        private volatile boolean f11266a;

        C1649b() {
            super();
        }

        /* renamed from: b */
        public void mo9587b(boolean z) {
            this.f11266a = z;
        }

        /* renamed from: c */
        public void mo9588c() {
            if (this.f11266a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static StateVerifier m14126a() {
        return new C1649b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo9587b(boolean z);

    /* renamed from: c */
    public abstract void mo9588c();

    private StateVerifier() {
    }
}
