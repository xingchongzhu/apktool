package p067c.p068a.p069a.p070a.p112n2;

import android.os.Handler;
import android.view.Surface;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p073c2.DecoderCounters;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.n2.z */
public interface VideoRendererEventListener {

    /* renamed from: c.a.a.a.n2.z$a */
    /* compiled from: VideoRendererEventListener */
    public static final class C1224a {

        /* renamed from: a */
        private final Handler f8660a;

        /* renamed from: b */
        private final VideoRendererEventListener f8661b;

        public C1224a(Handler handler, VideoRendererEventListener zVar) {
            this.f8660a = zVar != null ? (Handler) Assertions.m10153e(handler) : null;
            this.f8661b = zVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void mo7609h(String str, long j, long j2) {
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5662p(str, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void mo7610j(String str) {
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5656m(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void mo7611l(DecoderCounters dVar) {
            dVar.mo5964c();
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5624M(dVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void mo7612n(int i, long j) {
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5632U(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void mo7613p(DecoderCounters dVar) {
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5674z(dVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void mo7614r(Format u0Var, DecoderReuseEvaluation gVar) {
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5612A(u0Var, gVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void mo7615t(Surface surface) {
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5621J(surface);
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void mo7616v(long j, int i) {
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5635X(j, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void mo7617x(int i, int i2, int i3, float f) {
            ((VideoRendererEventListener) Util.m10293i(this.f8661b)).mo5640b(i, i2, i3, f);
        }

        /* renamed from: A */
        public void mo7602A(int i, int i2, int i3, float f) {
            Handler handler = this.f8660a;
            if (handler != null) {
                C1213h hVar = new C1213h(this, i, i2, i3, f);
                handler.post(hVar);
            }
        }

        /* renamed from: a */
        public void mo7603a(String str, long j, long j2) {
            Handler handler = this.f8660a;
            if (handler != null) {
                C1211f fVar = new C1211f(this, str, j, j2);
                handler.post(fVar);
            }
        }

        /* renamed from: b */
        public void mo7604b(String str) {
            Handler handler = this.f8660a;
            if (handler != null) {
                handler.post(new C1207b(this, str));
            }
        }

        /* renamed from: c */
        public void mo7605c(DecoderCounters dVar) {
            dVar.mo5964c();
            Handler handler = this.f8660a;
            if (handler != null) {
                handler.post(new C1204a(this, dVar));
            }
        }

        /* renamed from: d */
        public void mo7606d(int i, long j) {
            Handler handler = this.f8660a;
            if (handler != null) {
                handler.post(new C1210e(this, i, j));
            }
        }

        /* renamed from: e */
        public void mo7607e(DecoderCounters dVar) {
            Handler handler = this.f8660a;
            if (handler != null) {
                handler.post(new C1208c(this, dVar));
            }
        }

        /* renamed from: f */
        public void mo7608f(Format u0Var, DecoderReuseEvaluation gVar) {
            Handler handler = this.f8660a;
            if (handler != null) {
                handler.post(new C1212g(this, u0Var, gVar));
            }
        }

        /* renamed from: y */
        public void mo7618y(Surface surface) {
            Handler handler = this.f8660a;
            if (handler != null) {
                handler.post(new C1209d(this, surface));
            }
        }

        /* renamed from: z */
        public void mo7619z(long j, int i) {
            Handler handler = this.f8660a;
            if (handler != null) {
                handler.post(new C1214i(this, j, i));
            }
        }
    }

    /* renamed from: A */
    void mo5612A(Format u0Var, DecoderReuseEvaluation gVar);

    /* renamed from: J */
    void mo5621J(Surface surface);

    /* renamed from: M */
    void mo5624M(DecoderCounters dVar);

    /* renamed from: U */
    void mo5632U(int i, long j);

    /* renamed from: X */
    void mo5635X(long j, int i);

    /* renamed from: b */
    void mo5640b(int i, int i2, int i3, float f);

    /* renamed from: m */
    void mo5656m(String str);

    /* renamed from: p */
    void mo5662p(String str, long j, long j2);

    /* renamed from: z */
    void mo5674z(DecoderCounters dVar);
}
