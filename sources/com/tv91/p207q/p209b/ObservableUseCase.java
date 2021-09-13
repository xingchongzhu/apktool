package com.tv91.p207q.p209b;

import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.q.b.d */
public abstract class ObservableUseCase<OBSERVER> {

    /* renamed from: a */
    private static final Runnable f14273a = C2344c.f14272a;

    /* renamed from: b */
    private static final Consumer<Object> f14274b = C2343b.f14271a;

    /* renamed from: c */
    protected Runnable f14275c = m17659c();

    /* renamed from: d */
    protected Runnable f14276d = m17659c();

    /* renamed from: e */
    protected Consumer<ErrorBundle> f14277e = m17658b();

    /* renamed from: f */
    private final Schedulers f14278f;

    /* renamed from: g */
    private final Object f14279g = new Object();

    /* renamed from: h */
    private final Set<OBSERVER> f14280h = new CopyOnWriteArraySet();

    protected ObservableUseCase(Schedulers bVar) {
        this.f14278f = bVar;
    }

    /* renamed from: b */
    protected static <T> Consumer<T> m17658b() {
        return f14274b;
    }

    /* renamed from: c */
    protected static Runnable m17659c() {
        return f14273a;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void mo17053f(C2346f fVar) {
        for (Object next : mo17052d()) {
            if (next instanceof C2345e) {
                ((C2345e) next).mo16673a(fVar);
            }
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m17661g() {
    }

    /* renamed from: h */
    static /* synthetic */ void m17662h(Object obj) {
    }

    /* renamed from: a */
    public void mo17051a() {
        synchronized (this.f14279g) {
            this.f14280h.clear();
        }
    }

    /* renamed from: d */
    public Set<OBSERVER> mo17052d() {
        Set<OBSERVER> unmodifiableSet;
        synchronized (this.f14279g) {
            unmodifiableSet = Collections.unmodifiableSet(this.f14280h);
        }
        return unmodifiableSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo17054i(C2346f fVar) {
        this.f14278f.mo17120a().execute(new C2342a(this, fVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo17055j(Runnable runnable) {
        this.f14278f.mo17122c().execute(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo17056k(Runnable runnable) {
        this.f14278f.mo17121b().execute(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo17057l(Runnable runnable) {
        this.f14278f.mo17120a().execute(runnable);
    }

    /* renamed from: m */
    public void mo17058m(OBSERVER observer) {
        if (observer != null) {
            synchronized (this.f14279g) {
                this.f14280h.add(observer);
            }
        }
    }

    /* renamed from: n */
    public void mo17059n(OBSERVER observer) {
        if (observer != null) {
            synchronized (this.f14279g) {
                this.f14280h.remove(observer);
            }
        }
    }
}
