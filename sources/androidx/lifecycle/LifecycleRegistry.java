package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import p010b.p018b.p019a.p020a.ArchTaskExecutor;
import p010b.p018b.p019a.p021b.FastSafeIterableMap;

/* renamed from: androidx.lifecycle.j */
public class LifecycleRegistry extends Lifecycle {

    /* renamed from: b */
    private FastSafeIterableMap<LifecycleObserver, C0379a> f2640b;

    /* renamed from: c */
    private C0378c f2641c;

    /* renamed from: d */
    private final WeakReference<LifecycleOwner> f2642d;

    /* renamed from: e */
    private int f2643e;

    /* renamed from: f */
    private boolean f2644f;

    /* renamed from: g */
    private boolean f2645g;

    /* renamed from: h */
    private ArrayList<C0378c> f2646h;

    /* renamed from: i */
    private final boolean f2647i;

    /* renamed from: androidx.lifecycle.j$a */
    /* compiled from: LifecycleRegistry */
    static class C0379a {

        /* renamed from: a */
        C0378c f2648a;

        /* renamed from: b */
        LifecycleEventObserver f2649b;

        C0379a(LifecycleObserver hVar, C0378c cVar) {
            this.f2649b = Lifecycling.m2780f(hVar);
            this.f2648a = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3007a(LifecycleOwner iVar, C0377b bVar) {
            C0378c b = bVar.mo3002b();
            this.f2648a = LifecycleRegistry.m2762k(this.f2648a, b);
            this.f2649b.mo154c(iVar, bVar);
            this.f2648a = b;
        }
    }

    public LifecycleRegistry(LifecycleOwner iVar) {
        this(iVar, true);
    }

    /* renamed from: d */
    private void m2757d(LifecycleOwner iVar) {
        Iterator descendingIterator = this.f2640b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f2645g) {
            Entry entry = (Entry) descendingIterator.next();
            C0379a aVar = (C0379a) entry.getValue();
            while (aVar.f2648a.compareTo(this.f2641c) > 0 && !this.f2645g && this.f2640b.contains(entry.getKey())) {
                C0377b a = C0377b.m2751a(aVar.f2648a);
                if (a != null) {
                    m2765n(a.mo3002b());
                    aVar.mo3007a(iVar, a);
                    m2764m();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("no event down from ");
                    sb.append(aVar.f2648a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: e */
    private C0378c m2758e(LifecycleObserver hVar) {
        Entry i = this.f2640b.mo4273i(hVar);
        C0378c cVar = null;
        C0378c cVar2 = i != null ? ((C0379a) i.getValue()).f2648a : null;
        if (!this.f2646h.isEmpty()) {
            ArrayList<C0378c> arrayList = this.f2646h;
            cVar = (C0378c) arrayList.get(arrayList.size() - 1);
        }
        return m2762k(m2762k(this.f2641c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m2759f(String str) {
        if (this.f2647i && !ArchTaskExecutor.m4313d().mo4264b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(str);
            sb.append(" must be called on the main thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: g */
    private void m2760g(LifecycleOwner iVar) {
        C0538d d = this.f2640b.mo4275d();
        while (d.hasNext() && !this.f2645g) {
            Entry entry = (Entry) d.next();
            C0379a aVar = (C0379a) entry.getValue();
            while (aVar.f2648a.compareTo(this.f2641c) < 0 && !this.f2645g && this.f2640b.contains(entry.getKey())) {
                m2765n(aVar.f2648a);
                C0377b c = C0377b.m2752c(aVar.f2648a);
                if (c != null) {
                    aVar.mo3007a(iVar, c);
                    m2764m();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("no event up from ");
                    sb.append(aVar.f2648a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m2761i() {
        boolean z = true;
        if (this.f2640b.size() == 0) {
            return true;
        }
        C0378c cVar = ((C0379a) this.f2640b.mo4274b().getValue()).f2648a;
        C0378c cVar2 = ((C0379a) this.f2640b.mo4277e().getValue()).f2648a;
        if (!(cVar == cVar2 && this.f2641c == cVar2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: k */
    static C0378c m2762k(C0378c cVar, C0378c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m2763l(C0378c cVar) {
        if (this.f2641c != cVar) {
            this.f2641c = cVar;
            if (this.f2644f || this.f2643e != 0) {
                this.f2645g = true;
                return;
            }
            this.f2644f = true;
            m2766p();
            this.f2644f = false;
        }
    }

    /* renamed from: m */
    private void m2764m() {
        ArrayList<C0378c> arrayList = this.f2646h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m2765n(C0378c cVar) {
        this.f2646h.add(cVar);
    }

    /* renamed from: p */
    private void m2766p() {
        LifecycleOwner iVar = (LifecycleOwner) this.f2642d.get();
        if (iVar != null) {
            while (!m2761i()) {
                this.f2645g = false;
                if (this.f2641c.compareTo(((C0379a) this.f2640b.mo4274b().getValue()).f2648a) < 0) {
                    m2757d(iVar);
                }
                Entry e = this.f2640b.mo4277e();
                if (!this.f2645g && e != null && this.f2641c.compareTo(((C0379a) e.getValue()).f2648a) > 0) {
                    m2760g(iVar);
                }
            }
            this.f2645g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: a */
    public void mo2999a(LifecycleObserver hVar) {
        m2759f("addObserver");
        C0378c cVar = this.f2641c;
        C0378c cVar2 = C0378c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C0378c.INITIALIZED;
        }
        C0379a aVar = new C0379a(hVar, cVar2);
        if (((C0379a) this.f2640b.mo4271g(hVar, aVar)) == null) {
            LifecycleOwner iVar = (LifecycleOwner) this.f2642d.get();
            if (iVar != null) {
                boolean z = this.f2643e != 0 || this.f2644f;
                C0378c e = m2758e(hVar);
                this.f2643e++;
                while (aVar.f2648a.compareTo(e) < 0 && this.f2640b.contains(hVar)) {
                    m2765n(aVar.f2648a);
                    C0377b c = C0377b.m2752c(aVar.f2648a);
                    if (c != null) {
                        aVar.mo3007a(iVar, c);
                        m2764m();
                        e = m2758e(hVar);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("no event up from ");
                        sb.append(aVar.f2648a);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                if (!z) {
                    m2766p();
                }
                this.f2643e--;
            }
        }
    }

    /* renamed from: b */
    public C0378c mo3000b() {
        return this.f2641c;
    }

    /* renamed from: c */
    public void mo3001c(LifecycleObserver hVar) {
        m2759f("removeObserver");
        this.f2640b.mo4272h(hVar);
    }

    /* renamed from: h */
    public void mo3004h(C0377b bVar) {
        m2759f("handleLifecycleEvent");
        m2763l(bVar.mo3002b());
    }

    @Deprecated
    /* renamed from: j */
    public void mo3005j(C0378c cVar) {
        m2759f("markState");
        mo3006o(cVar);
    }

    /* renamed from: o */
    public void mo3006o(C0378c cVar) {
        m2759f("setCurrentState");
        m2763l(cVar);
    }

    private LifecycleRegistry(LifecycleOwner iVar, boolean z) {
        this.f2640b = new FastSafeIterableMap<>();
        this.f2643e = 0;
        this.f2644f = false;
        this.f2645g = false;
        this.f2646h = new ArrayList<>();
        this.f2642d = new WeakReference<>(iVar);
        this.f2641c = C0378c.INITIALIZED;
        this.f2647i = z;
    }
}
