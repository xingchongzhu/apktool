package p067c.p068a.p069a.p070a.p111m2;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p067c.p068a.p069a.p070a.p111m2.MutableFlags;
import p067c.p068a.p134b.p135a.C1325k;

/* renamed from: c.a.a.a.m2.s */
public final class ListenerSet<T, E extends MutableFlags> {

    /* renamed from: a */
    private final Clock f8418a;

    /* renamed from: b */
    private final HandlerWrapper f8419b;

    /* renamed from: c */
    private final C1325k<E> f8420c;

    /* renamed from: d */
    private final C1196b<T, E> f8421d;

    /* renamed from: e */
    private final CopyOnWriteArraySet<C1197c<T, E>> f8422e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f8423f;

    /* renamed from: g */
    private final ArrayDeque<Runnable> f8424g;

    /* renamed from: h */
    private boolean f8425h;

    /* renamed from: c.a.a.a.m2.s$a */
    /* compiled from: ListenerSet */
    public interface C1195a<T> {
        /* renamed from: a */
        void mo5605a(T t);
    }

    /* renamed from: c.a.a.a.m2.s$b */
    /* compiled from: ListenerSet */
    public interface C1196b<T, E extends MutableFlags> {
        /* renamed from: a */
        void mo5611a(T t, E e);
    }

    /* renamed from: c.a.a.a.m2.s$c */
    /* compiled from: ListenerSet */
    private static final class C1197c<T, E extends MutableFlags> {

        /* renamed from: a */
        public final T f8426a;

        /* renamed from: b */
        private E f8427b;

        /* renamed from: c */
        private boolean f8428c;

        /* renamed from: d */
        private boolean f8429d;

        public C1197c(T t, C1325k<E> kVar) {
            this.f8426a = t;
            this.f8427b = (MutableFlags) kVar.mo5610a();
        }

        /* renamed from: a */
        public void mo7476a(int i, C1195a<T> aVar) {
            if (!this.f8429d) {
                if (i != -1) {
                    this.f8427b.mo7485a(i);
                }
                this.f8428c = true;
                aVar.mo5605a(this.f8426a);
            }
        }

        /* renamed from: b */
        public void mo7477b(C1325k<E> kVar, C1196b<T, E> bVar) {
            if (!this.f8429d && this.f8428c) {
                E e = this.f8427b;
                this.f8427b = (MutableFlags) kVar.mo5610a();
                this.f8428c = false;
                bVar.mo5611a(this.f8426a, e);
            }
        }

        /* renamed from: c */
        public void mo7478c(C1196b<T, E> bVar) {
            this.f8429d = true;
            if (this.f8428c) {
                bVar.mo5611a(this.f8426a, this.f8427b);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1197c.class != obj.getClass()) {
                return false;
            }
            return this.f8426a.equals(((C1197c) obj).f8426a);
        }

        public int hashCode() {
            return this.f8426a.hashCode();
        }
    }

    public ListenerSet(Looper looper, Clock gVar, C1325k<E> kVar, C1196b<T, E> bVar) {
        this(new CopyOnWriteArraySet(), looper, gVar, kVar, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m10363d(Message message) {
        int i = message.what;
        if (i == 0) {
            Iterator it = this.f8422e.iterator();
            while (it.hasNext()) {
                ((C1197c) it.next()).mo7477b(this.f8420c, this.f8421d);
                if (this.f8419b.mo7426a(0)) {
                    break;
                }
            }
        } else if (i == 1) {
            mo7475k(message.arg1, (C1195a) message.obj);
            mo7473i();
        }
        return true;
    }

    /* renamed from: f */
    static /* synthetic */ void m10365f(CopyOnWriteArraySet copyOnWriteArraySet, int i, C1195a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C1197c) it.next()).mo7476a(i, aVar);
        }
    }

    /* renamed from: a */
    public void mo7468a(T t) {
        if (!this.f8425h) {
            Assertions.m10153e(t);
            this.f8422e.add(new C1197c(t, this.f8420c));
        }
    }

    /* renamed from: b */
    public ListenerSet<T, E> mo7469b(Looper looper, C1196b<T, E> bVar) {
        ListenerSet sVar = new ListenerSet(this.f8422e, looper, this.f8418a, this.f8420c, bVar);
        return sVar;
    }

    /* renamed from: c */
    public void mo7470c() {
        if (!this.f8424g.isEmpty()) {
            if (!this.f8419b.mo7426a(0)) {
                this.f8419b.mo7435j(0).sendToTarget();
            }
            boolean z = !this.f8423f.isEmpty();
            this.f8423f.addAll(this.f8424g);
            this.f8424g.clear();
            if (!z) {
                while (!this.f8423f.isEmpty()) {
                    ((Runnable) this.f8423f.peekFirst()).run();
                    this.f8423f.removeFirst();
                }
            }
        }
    }

    /* renamed from: g */
    public void mo7471g(int i, C1195a<T> aVar) {
        this.f8419b.mo7429d(1, i, 0, aVar).sendToTarget();
    }

    /* renamed from: h */
    public void mo7472h(int i, C1195a<T> aVar) {
        this.f8424g.add(new C1184a(new CopyOnWriteArraySet(this.f8422e), i, aVar));
    }

    /* renamed from: i */
    public void mo7473i() {
        Iterator it = this.f8422e.iterator();
        while (it.hasNext()) {
            ((C1197c) it.next()).mo7478c(this.f8421d);
        }
        this.f8422e.clear();
        this.f8425h = true;
    }

    /* renamed from: j */
    public void mo7474j(T t) {
        Iterator it = this.f8422e.iterator();
        while (it.hasNext()) {
            C1197c cVar = (C1197c) it.next();
            if (cVar.f8426a.equals(t)) {
                cVar.mo7478c(this.f8421d);
                this.f8422e.remove(cVar);
            }
        }
    }

    /* renamed from: k */
    public void mo7475k(int i, C1195a<T> aVar) {
        mo7472h(i, aVar);
        mo7470c();
    }

    private ListenerSet(CopyOnWriteArraySet<C1197c<T, E>> copyOnWriteArraySet, Looper looper, Clock gVar, C1325k<E> kVar, C1196b<T, E> bVar) {
        this.f8418a = gVar;
        this.f8422e = copyOnWriteArraySet;
        this.f8420c = kVar;
        this.f8421d = bVar;
        this.f8423f = new ArrayDeque<>();
        this.f8424g = new ArrayDeque<>();
        this.f8419b = gVar.mo7424b(looper, new C1185b(this));
    }
}
