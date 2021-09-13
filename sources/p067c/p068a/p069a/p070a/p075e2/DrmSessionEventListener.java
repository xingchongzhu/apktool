package p067c.p068a.p069a.p070a.p075e2;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.e2.w */
public interface DrmSessionEventListener {

    /* renamed from: c.a.a.a.e2.w$a */
    /* compiled from: DrmSessionEventListener */
    public static class C0898a {

        /* renamed from: a */
        public final int f5927a;

        /* renamed from: b */
        public final C1081a f5928b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0899a> f5929c;

        /* renamed from: c.a.a.a.e2.w$a$a */
        /* compiled from: DrmSessionEventListener */
        private static final class C0899a {

            /* renamed from: a */
            public Handler f5930a;

            /* renamed from: b */
            public DrmSessionEventListener f5931b;

            public C0899a(Handler handler, DrmSessionEventListener wVar) {
                this.f5930a = handler;
                this.f5931b = wVar;
            }
        }

        public C0898a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void mo6126i(DrmSessionEventListener wVar) {
            wVar.mo5616E(this.f5927a, this.f5928b);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void mo6127k(DrmSessionEventListener wVar) {
            wVar.mo5652k(this.f5927a, this.f5928b);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void mo6128m(DrmSessionEventListener wVar) {
            wVar.mo5636Y(this.f5927a, this.f5928b);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void mo6129o(DrmSessionEventListener wVar) {
            wVar.mo5673y(this.f5927a, this.f5928b);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void mo6130q(DrmSessionEventListener wVar, Exception exc) {
            wVar.mo5614C(this.f5927a, this.f5928b, exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void mo6131s(DrmSessionEventListener wVar) {
            wVar.mo5628Q(this.f5927a, this.f5928b);
        }

        /* renamed from: a */
        public void mo6119a(Handler handler, DrmSessionEventListener wVar) {
            Assertions.m10153e(handler);
            Assertions.m10153e(wVar);
            this.f5929c.add(new C0899a(handler, wVar));
        }

        /* renamed from: b */
        public void mo6120b() {
            Iterator it = this.f5929c.iterator();
            while (it.hasNext()) {
                C0899a aVar = (C0899a) it.next();
                Util.m10326y0(aVar.f5930a, new C0872h(this, aVar.f5931b));
            }
        }

        /* renamed from: c */
        public void mo6121c() {
            Iterator it = this.f5929c.iterator();
            while (it.hasNext()) {
                C0899a aVar = (C0899a) it.next();
                Util.m10326y0(aVar.f5930a, new C0871g(this, aVar.f5931b));
            }
        }

        /* renamed from: d */
        public void mo6122d() {
            Iterator it = this.f5929c.iterator();
            while (it.hasNext()) {
                C0899a aVar = (C0899a) it.next();
                Util.m10326y0(aVar.f5930a, new C0873i(this, aVar.f5931b));
            }
        }

        /* renamed from: e */
        public void mo6123e() {
            Iterator it = this.f5929c.iterator();
            while (it.hasNext()) {
                C0899a aVar = (C0899a) it.next();
                Util.m10326y0(aVar.f5930a, new C0869e(this, aVar.f5931b));
            }
        }

        /* renamed from: f */
        public void mo6124f(Exception exc) {
            Iterator it = this.f5929c.iterator();
            while (it.hasNext()) {
                C0899a aVar = (C0899a) it.next();
                Util.m10326y0(aVar.f5930a, new C0874j(this, aVar.f5931b, exc));
            }
        }

        /* renamed from: g */
        public void mo6125g() {
            Iterator it = this.f5929c.iterator();
            while (it.hasNext()) {
                C0899a aVar = (C0899a) it.next();
                Util.m10326y0(aVar.f5930a, new C0870f(this, aVar.f5931b));
            }
        }

        /* renamed from: t */
        public C0898a mo6132t(int i, C1081a aVar) {
            return new C0898a(this.f5929c, i, aVar);
        }

        private C0898a(CopyOnWriteArrayList<C0899a> copyOnWriteArrayList, int i, C1081a aVar) {
            this.f5929c = copyOnWriteArrayList;
            this.f5927a = i;
            this.f5928b = aVar;
        }
    }

    /* renamed from: C */
    void mo5614C(int i, C1081a aVar, Exception exc);

    /* renamed from: E */
    void mo5616E(int i, C1081a aVar);

    /* renamed from: Q */
    void mo5628Q(int i, C1081a aVar);

    /* renamed from: Y */
    void mo5636Y(int i, C1081a aVar);

    /* renamed from: k */
    void mo5652k(int i, C1081a aVar);

    /* renamed from: y */
    void mo5673y(int i, C1081a aVar);
}
