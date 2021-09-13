package p067c.p068a.p069a.p070a.p097j2;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.HashMap;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1082b;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.o */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {

    /* renamed from: g */
    private final HashMap<T, C1105b> f7581g = new HashMap<>();

    /* renamed from: h */
    private Handler f7582h;

    /* renamed from: i */
    private TransferListener f7583i;

    /* renamed from: c.a.a.a.j2.o$a */
    /* compiled from: CompositeMediaSource */
    private final class C1104a implements MediaSourceEventListener, DrmSessionEventListener {

        /* renamed from: a */
        private final T f7584a;

        /* renamed from: b */
        private C1084a f7585b;

        /* renamed from: c */
        private C0898a f7586c;

        public C1104a(T t) {
            this.f7585b = CompositeMediaSource.this.mo6922s(null);
            this.f7586c = CompositeMediaSource.this.mo6920q(null);
            this.f7584a = t;
        }

        /* renamed from: a */
        private boolean m9206a(int i, C1081a aVar) {
            C1081a aVar2;
            if (aVar != null) {
                aVar2 = CompositeMediaSource.this.mo6971z(this.f7584a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int B = CompositeMediaSource.this.mo6967B(this.f7584a, i);
            C1084a aVar3 = this.f7585b;
            if (aVar3.f7409a != B || !Util.m10279b(aVar3.f7410b, aVar2)) {
                this.f7585b = CompositeMediaSource.this.mo6921r(B, aVar2, 0);
            }
            C0898a aVar4 = this.f7586c;
            if (aVar4.f5927a != B || !Util.m10279b(aVar4.f5928b, aVar2)) {
                this.f7586c = CompositeMediaSource.this.mo6919p(B, aVar2);
            }
            return true;
        }

        /* renamed from: b */
        private MediaLoadData m9207b(MediaLoadData zVar) {
            long A = CompositeMediaSource.this.mo6966A(this.f7584a, zVar.f7693f);
            long A2 = CompositeMediaSource.this.mo6966A(this.f7584a, zVar.f7694g);
            if (A == zVar.f7693f && A2 == zVar.f7694g) {
                return zVar;
            }
            MediaLoadData zVar2 = new MediaLoadData(zVar.f7688a, zVar.f7689b, zVar.f7690c, zVar.f7691d, zVar.f7692e, A, A2);
            return zVar2;
        }

        /* renamed from: C */
        public void mo5614C(int i, C1081a aVar, Exception exc) {
            if (m9206a(i, aVar)) {
                this.f7586c.mo6124f(exc);
            }
        }

        /* renamed from: E */
        public void mo5616E(int i, C1081a aVar) {
            if (m9206a(i, aVar)) {
                this.f7586c.mo6120b();
            }
        }

        /* renamed from: F */
        public void mo5617F(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
            if (m9206a(i, aVar)) {
                this.f7585b.mo6843B(wVar, m9207b(zVar));
            }
        }

        /* renamed from: I */
        public void mo5620I(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
            if (m9206a(i, aVar)) {
                this.f7585b.mo6862v(wVar, m9207b(zVar));
            }
        }

        /* renamed from: Q */
        public void mo5628Q(int i, C1081a aVar) {
            if (m9206a(i, aVar)) {
                this.f7586c.mo6125g();
            }
        }

        /* renamed from: V */
        public void mo5633V(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, boolean z) {
            if (m9206a(i, aVar)) {
                this.f7585b.mo6865y(wVar, m9207b(zVar), iOException, z);
            }
        }

        /* renamed from: Y */
        public void mo5636Y(int i, C1081a aVar) {
            if (m9206a(i, aVar)) {
                this.f7586c.mo6122d();
            }
        }

        /* renamed from: k */
        public void mo5652k(int i, C1081a aVar) {
            if (m9206a(i, aVar)) {
                this.f7586c.mo6121c();
            }
        }

        /* renamed from: s */
        public void mo5667s(int i, C1081a aVar, MediaLoadData zVar) {
            if (m9206a(i, aVar)) {
                this.f7585b.mo6850d(m9207b(zVar));
            }
        }

        /* renamed from: t */
        public void mo5668t(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
            if (m9206a(i, aVar)) {
                this.f7585b.mo6859s(wVar, m9207b(zVar));
            }
        }

        /* renamed from: v */
        public void mo5670v(int i, C1081a aVar, MediaLoadData zVar) {
            if (m9206a(i, aVar)) {
                this.f7585b.mo6846E(m9207b(zVar));
            }
        }

        /* renamed from: y */
        public void mo5673y(int i, C1081a aVar) {
            if (m9206a(i, aVar)) {
                this.f7586c.mo6123e();
            }
        }
    }

    /* renamed from: c.a.a.a.j2.o$b */
    /* compiled from: CompositeMediaSource */
    private static final class C1105b {

        /* renamed from: a */
        public final C1080d0 f7588a;

        /* renamed from: b */
        public final C1082b f7589b;

        /* renamed from: c */
        public final MediaSourceEventListener f7590c;

        public C1105b(C1080d0 d0Var, C1082b bVar, MediaSourceEventListener e0Var) {
            this.f7588a = d0Var;
            this.f7589b = bVar;
            this.f7590c = e0Var;
        }
    }

    protected CompositeMediaSource() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public long mo6966A(T t, long j) {
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo6967B(T t, int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void m9195C(T t, C1080d0 d0Var, Timeline x1Var);

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo6970F(T t, C1080d0 d0Var) {
        Assertions.m10149a(!this.f7581g.containsKey(t));
        C1075a aVar = new C1075a(this, t);
        C1104a aVar2 = new C1104a(t);
        this.f7581g.put(t, new C1105b(d0Var, aVar, aVar2));
        d0Var.mo6837l((Handler) Assertions.m10153e(this.f7582h), aVar2);
        d0Var.mo6828b((Handler) Assertions.m10153e(this.f7582h), aVar2);
        d0Var.mo6834h(aVar, this.f7583i);
        if (!mo6925v()) {
            d0Var.mo6839n(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo6923t() {
        for (C1105b bVar : this.f7581g.values()) {
            bVar.f7588a.mo6839n(bVar.f7589b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo6924u() {
        for (C1105b bVar : this.f7581g.values()) {
            bVar.f7588a.mo6835i(bVar.f7589b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo6904w(TransferListener e0Var) {
        this.f7583i = e0Var;
        this.f7582h = Util.m10319v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo6905y() {
        for (C1105b bVar : this.f7581g.values()) {
            bVar.f7588a.mo6836j(bVar.f7589b);
            bVar.f7588a.mo6838m(bVar.f7590c);
        }
        this.f7581g.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract C1081a mo6971z(T t, C1081a aVar);
}
