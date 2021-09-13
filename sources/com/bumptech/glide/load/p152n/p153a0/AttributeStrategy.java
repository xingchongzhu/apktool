package com.bumptech.glide.load.p152n.p153a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p174t.C1639k;

/* renamed from: com.bumptech.glide.load.n.a0.c */
class AttributeStrategy implements LruPoolStrategy {

    /* renamed from: a */
    private final C1446b f10366a = new C1446b();

    /* renamed from: b */
    private final GroupedLinkedMap<C1445a, Bitmap> f10367b = new GroupedLinkedMap<>();

    /* renamed from: com.bumptech.glide.load.n.a0.c$a */
    /* compiled from: AttributeStrategy */
    static class C1445a implements Poolable {

        /* renamed from: a */
        private final C1446b f10368a;

        /* renamed from: b */
        private int f10369b;

        /* renamed from: c */
        private int f10370c;

        /* renamed from: d */
        private Config f10371d;

        public C1445a(C1446b bVar) {
            this.f10368a = bVar;
        }

        /* renamed from: a */
        public void mo8870a() {
            this.f10368a.mo8879c(this);
        }

        /* renamed from: b */
        public void mo8871b(int i, int i2, Config config) {
            this.f10369b = i;
            this.f10370c = i2;
            this.f10371d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1445a)) {
                return false;
            }
            C1445a aVar = (C1445a) obj;
            if (this.f10369b == aVar.f10369b && this.f10370c == aVar.f10370c && this.f10371d == aVar.f10371d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f10369b * 31) + this.f10370c) * 31;
            Config config = this.f10371d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return AttributeStrategy.m12637g(this.f10369b, this.f10370c, this.f10371d);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.c$b */
    /* compiled from: AttributeStrategy */
    static class C1446b extends BaseKeyPool<C1445a> {
        C1446b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1445a mo8875a() {
            return new C1445a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C1445a mo8877e(int i, int i2, Config config) {
            C1445a aVar = (C1445a) mo8878b();
            aVar.mo8871b(i, i2, config);
            return aVar;
        }
    }

    AttributeStrategy() {
    }

    /* renamed from: g */
    static String m12637g(int i, int i2, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("], ");
        sb.append(config);
        return sb.toString();
    }

    /* renamed from: h */
    private static String m12638h(Bitmap bitmap) {
        return m12637g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public String mo8863a(int i, int i2, Config config) {
        return m12637g(i, i2, config);
    }

    /* renamed from: b */
    public int mo8864b(Bitmap bitmap) {
        return C1639k.m14089g(bitmap);
    }

    /* renamed from: c */
    public Bitmap mo8865c(int i, int i2, Config config) {
        return (Bitmap) this.f10367b.mo8887a(this.f10366a.mo8877e(i, i2, config));
    }

    /* renamed from: d */
    public void mo8866d(Bitmap bitmap) {
        this.f10367b.mo8888d(this.f10366a.mo8877e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: e */
    public Bitmap mo8867e() {
        return (Bitmap) this.f10367b.mo8889f();
    }

    /* renamed from: f */
    public String mo8868f(Bitmap bitmap) {
        return m12638h(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeStrategy:\n  ");
        sb.append(this.f10367b);
        return sb.toString();
    }
}
