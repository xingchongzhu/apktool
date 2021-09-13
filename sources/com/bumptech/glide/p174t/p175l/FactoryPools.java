package com.bumptech.glide.p174t.p175l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p042j.C0610e;
import p010b.p034g.p042j.C0612g;

/* renamed from: com.bumptech.glide.t.l.a */
public final class FactoryPools {

    /* renamed from: a */
    private static final C1647g<Object> f11262a = new C1641a();

    /* renamed from: com.bumptech.glide.t.l.a$a */
    /* compiled from: FactoryPools */
    class C1641a implements C1647g<Object> {
        C1641a() {
        }

        /* renamed from: a */
        public void mo9584a(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$b */
    /* compiled from: FactoryPools */
    class C1642b implements C1644d<List<T>> {
        C1642b() {
        }

        /* renamed from: b */
        public List<T> mo8938a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$c */
    /* compiled from: FactoryPools */
    class C1643c implements C1647g<List<T>> {
        C1643c() {
        }

        /* renamed from: b */
        public void mo9584a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$d */
    /* compiled from: FactoryPools */
    public interface C1644d<T> {
        /* renamed from: a */
        T mo8938a();
    }

    /* renamed from: com.bumptech.glide.t.l.a$e */
    /* compiled from: FactoryPools */
    private static final class C1645e<T> implements C0610e<T> {

        /* renamed from: a */
        private final C1644d<T> f11263a;

        /* renamed from: b */
        private final C1647g<T> f11264b;

        /* renamed from: c */
        private final C0610e<T> f11265c;

        C1645e(C0610e<T> eVar, C1644d<T> dVar, C1647g<T> gVar) {
            this.f11265c = eVar;
            this.f11263a = dVar;
            this.f11264b = gVar;
        }

        /* renamed from: a */
        public boolean mo4945a(T t) {
            if (t instanceof C1646f) {
                ((C1646f) t).mo8940d().mo9587b(true);
            }
            this.f11264b.mo9584a(t);
            return this.f11265c.mo4945a(t);
        }

        /* renamed from: b */
        public T mo4946b() {
            T b = this.f11265c.mo4946b();
            if (b == null) {
                b = this.f11263a.mo8938a();
                String str = "FactoryPools";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(b.getClass());
                    Log.v(str, sb.toString());
                }
            }
            if (b instanceof C1646f) {
                ((C1646f) b).mo8940d().mo9587b(false);
            }
            return b;
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$f */
    /* compiled from: FactoryPools */
    public interface C1646f {
        /* renamed from: d */
        StateVerifier mo8940d();
    }

    /* renamed from: com.bumptech.glide.t.l.a$g */
    /* compiled from: FactoryPools */
    public interface C1647g<T> {
        /* renamed from: a */
        void mo9584a(T t);
    }

    /* renamed from: a */
    private static <T extends C1646f> C0610e<T> m14106a(C0610e<T> eVar, C1644d<T> dVar) {
        return m14107b(eVar, dVar, m14108c());
    }

    /* renamed from: b */
    private static <T> C0610e<T> m14107b(C0610e<T> eVar, C1644d<T> dVar, C1647g<T> gVar) {
        return new C1645e(eVar, dVar, gVar);
    }

    /* renamed from: c */
    private static <T> C1647g<T> m14108c() {
        return f11262a;
    }

    /* renamed from: d */
    public static <T extends C1646f> C0610e<T> m14109d(int i, C1644d<T> dVar) {
        return m14106a(new C0612g(i), dVar);
    }

    /* renamed from: e */
    public static <T> C0610e<List<T>> m14110e() {
        return m14111f(20);
    }

    /* renamed from: f */
    public static <T> C0610e<List<T>> m14111f(int i) {
        return m14107b(new C0612g(i), new C1642b(), new C1643c());
    }
}
