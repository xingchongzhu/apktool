package com.bumptech.glide.load.p156o;

import com.bumptech.glide.p174t.C1636g;
import com.bumptech.glide.p174t.C1639k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.o.m */
public class ModelCache<A, B> {

    /* renamed from: a */
    private final C1636g<C1534b<A>, B> f10729a;

    /* renamed from: com.bumptech.glide.load.o.m$a */
    /* compiled from: ModelCache */
    class C1533a extends C1636g<C1534b<A>, B> {
        C1533a(long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo8926j(C1534b<A> bVar, B b) {
            bVar.mo9141c();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.m$b */
    /* compiled from: ModelCache */
    static final class C1534b<A> {

        /* renamed from: a */
        private static final Queue<C1534b<?>> f10731a = C1639k.m14087e(0);

        /* renamed from: b */
        private int f10732b;

        /* renamed from: c */
        private int f10733c;

        /* renamed from: d */
        private A f10734d;

        private C1534b() {
        }

        /* renamed from: a */
        static <A> C1534b<A> m13133a(A a, int i, int i2) {
            C1534b<A> bVar;
            Queue<C1534b<?>> queue = f10731a;
            synchronized (queue) {
                bVar = (C1534b) queue.poll();
            }
            if (bVar == null) {
                bVar = new C1534b<>();
            }
            bVar.m13134b(a, i, i2);
            return bVar;
        }

        /* renamed from: b */
        private void m13134b(A a, int i, int i2) {
            this.f10734d = a;
            this.f10733c = i;
            this.f10732b = i2;
        }

        /* renamed from: c */
        public void mo9141c() {
            Queue<C1534b<?>> queue = f10731a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1534b)) {
                return false;
            }
            C1534b bVar = (C1534b) obj;
            if (this.f10733c == bVar.f10733c && this.f10732b == bVar.f10732b && this.f10734d.equals(bVar.f10734d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f10732b * 31) + this.f10733c) * 31) + this.f10734d.hashCode();
        }
    }

    public ModelCache(long j) {
        this.f10729a = new C1533a(j);
    }

    /* renamed from: a */
    public B mo9138a(A a, int i, int i2) {
        C1534b a2 = C1534b.m13133a(a, i, i2);
        B g = this.f10729a.mo9569g(a2);
        a2.mo9141c();
        return g;
    }

    /* renamed from: b */
    public void mo9139b(A a, int i, int i2, B b) {
        this.f10729a.mo9571k(C1534b.m13133a(a, i, i2), b);
    }
}
