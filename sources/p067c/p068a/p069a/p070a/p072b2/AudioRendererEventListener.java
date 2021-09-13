package p067c.p068a.p069a.p070a.p072b2;

import android.os.Handler;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p073c2.DecoderCounters;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.r */
public interface AudioRendererEventListener {

    /* renamed from: c.a.a.a.b2.r$a */
    /* compiled from: AudioRendererEventListener */
    public static final class C0833a {

        /* renamed from: a */
        private final Handler f5562a;

        /* renamed from: b */
        private final AudioRendererEventListener f5563b;

        public C0833a(Handler handler, AudioRendererEventListener rVar) {
            this.f5562a = rVar != null ? (Handler) Assertions.m10153e(handler) : null;
            this.f5563b = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void mo5856h(Exception exc) {
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5643d(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void mo5857j(String str, long j, long j2) {
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5626O(str, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void mo5858l(String str) {
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5625N(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void mo5859n(DecoderCounters dVar) {
            dVar.mo5964c();
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5654l(dVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void mo5860p(DecoderCounters dVar) {
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5658n(dVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void mo5861r(Format u0Var, DecoderReuseEvaluation gVar) {
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5647h(u0Var, gVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void mo5862t(long j) {
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5613B(j);
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void mo5863v(boolean z) {
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5638a(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void mo5864x(int i, long j, long j2) {
            ((AudioRendererEventListener) Util.m10293i(this.f5563b)).mo5631T(i, j, j2);
        }

        /* renamed from: A */
        public void mo5849A(int i, long j, long j2) {
            Handler handler = this.f5562a;
            if (handler != null) {
                C0820h hVar = new C0820h(this, i, j, j2);
                handler.post(hVar);
            }
        }

        /* renamed from: a */
        public void mo5850a(Exception exc) {
            Handler handler = this.f5562a;
            if (handler != null) {
                handler.post(new C0814c(this, exc));
            }
        }

        /* renamed from: b */
        public void mo5851b(String str, long j, long j2) {
            Handler handler = this.f5562a;
            if (handler != null) {
                C0817e eVar = new C0817e(this, str, j, j2);
                handler.post(eVar);
            }
        }

        /* renamed from: c */
        public void mo5852c(String str) {
            Handler handler = this.f5562a;
            if (handler != null) {
                handler.post(new C0818f(this, str));
            }
        }

        /* renamed from: d */
        public void mo5853d(DecoderCounters dVar) {
            dVar.mo5964c();
            Handler handler = this.f5562a;
            if (handler != null) {
                handler.post(new C0811b(this, dVar));
            }
        }

        /* renamed from: e */
        public void mo5854e(DecoderCounters dVar) {
            Handler handler = this.f5562a;
            if (handler != null) {
                handler.post(new C0821i(this, dVar));
            }
        }

        /* renamed from: f */
        public void mo5855f(Format u0Var, DecoderReuseEvaluation gVar) {
            Handler handler = this.f5562a;
            if (handler != null) {
                handler.post(new C0816d(this, u0Var, gVar));
            }
        }

        /* renamed from: y */
        public void mo5865y(long j) {
            Handler handler = this.f5562a;
            if (handler != null) {
                handler.post(new C0819g(this, j));
            }
        }

        /* renamed from: z */
        public void mo5866z(boolean z) {
            Handler handler = this.f5562a;
            if (handler != null) {
                handler.post(new C0810a(this, z));
            }
        }
    }

    /* renamed from: B */
    void mo5613B(long j);

    /* renamed from: N */
    void mo5625N(String str);

    /* renamed from: O */
    void mo5626O(String str, long j, long j2);

    /* renamed from: T */
    void mo5631T(int i, long j, long j2);

    /* renamed from: a */
    void mo5638a(boolean z);

    /* renamed from: d */
    void mo5643d(Exception exc);

    /* renamed from: h */
    void mo5647h(Format u0Var, DecoderReuseEvaluation gVar);

    /* renamed from: l */
    void mo5654l(DecoderCounters dVar);

    /* renamed from: n */
    void mo5658n(DecoderCounters dVar);
}
