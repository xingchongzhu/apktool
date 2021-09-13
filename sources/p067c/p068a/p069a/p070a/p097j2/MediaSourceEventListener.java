package p067c.p068a.p069a.p070a.p097j2;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.e0 */
public interface MediaSourceEventListener {

    /* renamed from: c.a.a.a.j2.e0$a */
    /* compiled from: MediaSourceEventListener */
    public static class C1084a {

        /* renamed from: a */
        public final int f7409a;

        /* renamed from: b */
        public final C1081a f7410b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C1085a> f7411c;

        /* renamed from: d */
        private final long f7412d;

        /* renamed from: c.a.a.a.j2.e0$a$a */
        /* compiled from: MediaSourceEventListener */
        private static final class C1085a {

            /* renamed from: a */
            public Handler f7413a;

            /* renamed from: b */
            public MediaSourceEventListener f7414b;

            public C1085a(Handler handler, MediaSourceEventListener e0Var) {
                this.f7413a = handler;
                this.f7414b = e0Var;
            }
        }

        public C1084a() {
            this(new CopyOnWriteArrayList(), 0, null, 0);
        }

        /* renamed from: b */
        private long m8923b(long j) {
            long d = C.m8861d(j);
            if (d == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f7412d + d;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void mo6851f(MediaSourceEventListener e0Var, MediaLoadData zVar) {
            e0Var.mo5667s(this.f7409a, this.f7410b, zVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void mo6852h(MediaSourceEventListener e0Var, LoadEventInfo wVar, MediaLoadData zVar) {
            e0Var.mo5668t(this.f7409a, this.f7410b, wVar, zVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void mo6853j(MediaSourceEventListener e0Var, LoadEventInfo wVar, MediaLoadData zVar) {
            e0Var.mo5620I(this.f7409a, this.f7410b, wVar, zVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void mo6854l(MediaSourceEventListener e0Var, LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, boolean z) {
            e0Var.mo5633V(this.f7409a, this.f7410b, wVar, zVar, iOException, z);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void mo6855n(MediaSourceEventListener e0Var, LoadEventInfo wVar, MediaLoadData zVar) {
            e0Var.mo5617F(this.f7409a, this.f7410b, wVar, zVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void mo6856p(MediaSourceEventListener e0Var, C1081a aVar, MediaLoadData zVar) {
            e0Var.mo5670v(this.f7409a, aVar, zVar);
        }

        /* renamed from: A */
        public void mo6842A(LoadEventInfo wVar, int i, int i2, Format u0Var, int i3, Object obj, long j, long j2) {
            MediaLoadData zVar = new MediaLoadData(i, i2, u0Var, i3, obj, m8923b(j), m8923b(j2));
            LoadEventInfo wVar2 = wVar;
            mo6843B(wVar, zVar);
        }

        /* renamed from: B */
        public void mo6843B(LoadEventInfo wVar, MediaLoadData zVar) {
            Iterator it = this.f7411c.iterator();
            while (it.hasNext()) {
                C1085a aVar = (C1085a) it.next();
                Util.m10326y0(aVar.f7413a, new C1086f(this, aVar.f7414b, wVar, zVar));
            }
        }

        /* renamed from: C */
        public void mo6844C(MediaSourceEventListener e0Var) {
            Iterator it = this.f7411c.iterator();
            while (it.hasNext()) {
                C1085a aVar = (C1085a) it.next();
                if (aVar.f7414b == e0Var) {
                    this.f7411c.remove(aVar);
                }
            }
        }

        /* renamed from: D */
        public void mo6845D(int i, long j, long j2) {
            long j3 = j;
            MediaLoadData zVar = new MediaLoadData(1, i, null, 3, null, m8923b(j), m8923b(j2));
            mo6846E(zVar);
        }

        /* renamed from: E */
        public void mo6846E(MediaLoadData zVar) {
            C1081a aVar = (C1081a) Assertions.m10153e(this.f7410b);
            Iterator it = this.f7411c.iterator();
            while (it.hasNext()) {
                C1085a aVar2 = (C1085a) it.next();
                Util.m10326y0(aVar2.f7413a, new C1077b(this, aVar2.f7414b, aVar, zVar));
            }
        }

        /* renamed from: F */
        public C1084a mo6847F(int i, C1081a aVar, long j) {
            C1084a aVar2 = new C1084a(this.f7411c, i, aVar, j);
            return aVar2;
        }

        /* renamed from: a */
        public void mo6848a(Handler handler, MediaSourceEventListener e0Var) {
            Assertions.m10153e(handler);
            Assertions.m10153e(e0Var);
            this.f7411c.add(new C1085a(handler, e0Var));
        }

        /* renamed from: c */
        public void mo6849c(int i, Format u0Var, int i2, Object obj, long j) {
            MediaLoadData zVar = new MediaLoadData(1, i, u0Var, i2, obj, m8923b(j), -9223372036854775807L);
            mo6850d(zVar);
        }

        /* renamed from: d */
        public void mo6850d(MediaLoadData zVar) {
            Iterator it = this.f7411c.iterator();
            while (it.hasNext()) {
                C1085a aVar = (C1085a) it.next();
                Util.m10326y0(aVar.f7413a, new C1083e(this, aVar.f7414b, zVar));
            }
        }

        /* renamed from: q */
        public void mo6857q(LoadEventInfo wVar, int i) {
            mo6858r(wVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: r */
        public void mo6858r(LoadEventInfo wVar, int i, int i2, Format u0Var, int i3, Object obj, long j, long j2) {
            MediaLoadData zVar = new MediaLoadData(i, i2, u0Var, i3, obj, m8923b(j), m8923b(j2));
            LoadEventInfo wVar2 = wVar;
            mo6859s(wVar, zVar);
        }

        /* renamed from: s */
        public void mo6859s(LoadEventInfo wVar, MediaLoadData zVar) {
            Iterator it = this.f7411c.iterator();
            while (it.hasNext()) {
                C1085a aVar = (C1085a) it.next();
                Util.m10326y0(aVar.f7413a, new C1087g(this, aVar.f7414b, wVar, zVar));
            }
        }

        /* renamed from: t */
        public void mo6860t(LoadEventInfo wVar, int i) {
            mo6861u(wVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: u */
        public void mo6861u(LoadEventInfo wVar, int i, int i2, Format u0Var, int i3, Object obj, long j, long j2) {
            MediaLoadData zVar = new MediaLoadData(i, i2, u0Var, i3, obj, m8923b(j), m8923b(j2));
            LoadEventInfo wVar2 = wVar;
            mo6862v(wVar, zVar);
        }

        /* renamed from: v */
        public void mo6862v(LoadEventInfo wVar, MediaLoadData zVar) {
            Iterator it = this.f7411c.iterator();
            while (it.hasNext()) {
                C1085a aVar = (C1085a) it.next();
                Util.m10326y0(aVar.f7413a, new C1079d(this, aVar.f7414b, wVar, zVar));
            }
        }

        /* renamed from: w */
        public void mo6863w(LoadEventInfo wVar, int i, int i2, Format u0Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            MediaLoadData zVar = new MediaLoadData(i, i2, u0Var, i3, obj, m8923b(j), m8923b(j2));
            LoadEventInfo wVar2 = wVar;
            mo6865y(wVar, zVar, iOException, z);
        }

        /* renamed from: x */
        public void mo6864x(LoadEventInfo wVar, int i, IOException iOException, boolean z) {
            mo6863w(wVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* renamed from: y */
        public void mo6865y(LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, boolean z) {
            Iterator it = this.f7411c.iterator();
            while (it.hasNext()) {
                C1085a aVar = (C1085a) it.next();
                MediaSourceEventListener e0Var = aVar.f7414b;
                Handler handler = aVar.f7413a;
                C1078c cVar = new C1078c(this, e0Var, wVar, zVar, iOException, z);
                Util.m10326y0(handler, cVar);
            }
        }

        /* renamed from: z */
        public void mo6866z(LoadEventInfo wVar, int i) {
            mo6842A(wVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        private C1084a(CopyOnWriteArrayList<C1085a> copyOnWriteArrayList, int i, C1081a aVar, long j) {
            this.f7411c = copyOnWriteArrayList;
            this.f7409a = i;
            this.f7410b = aVar;
            this.f7412d = j;
        }
    }

    /* renamed from: F */
    void mo5617F(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar);

    /* renamed from: I */
    void mo5620I(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar);

    /* renamed from: V */
    void mo5633V(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, boolean z);

    /* renamed from: s */
    void mo5667s(int i, C1081a aVar, MediaLoadData zVar);

    /* renamed from: t */
    void mo5668t(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar);

    /* renamed from: v */
    void mo5670v(int i, C1081a aVar, MediaLoadData zVar);
}
