package p067c.p068a.p069a.p070a;

import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Clock;
import p067c.p068a.p069a.p070a.p111m2.MediaClock;
import p067c.p068a.p069a.p070a.p111m2.StandaloneMediaClock;

/* renamed from: c.a.a.a.n0 */
final class DefaultMediaClock implements MediaClock {

    /* renamed from: a */
    private final StandaloneMediaClock f8467a;

    /* renamed from: b */
    private final C1203a f8468b;

    /* renamed from: c */
    private C1227p1 f8469c;

    /* renamed from: d */
    private MediaClock f8470d;

    /* renamed from: e */
    private boolean f8471e = true;

    /* renamed from: f */
    private boolean f8472f;

    /* renamed from: c.a.a.a.n0$a */
    /* compiled from: DefaultMediaClock */
    public interface C1203a {
        /* renamed from: e */
        void mo7513e(PlaybackParameters i1Var);
    }

    public DefaultMediaClock(C1203a aVar, Clock gVar) {
        this.f8468b = aVar;
        this.f8467a = new StandaloneMediaClock(gVar);
    }

    /* renamed from: e */
    private boolean m10449e(boolean z) {
        C1227p1 p1Var = this.f8469c;
        return p1Var == null || p1Var.mo5784b() || (!this.f8469c.mo5786e() && (z || this.f8469c.mo6521i()));
    }

    /* renamed from: j */
    private void m10450j(boolean z) {
        if (m10449e(z)) {
            this.f8471e = true;
            if (this.f8472f) {
                this.f8467a.mo7421b();
            }
            return;
        }
        MediaClock vVar = (MediaClock) Assertions.m10153e(this.f8470d);
        long w = vVar.mo5798w();
        if (this.f8471e) {
            if (w < this.f8467a.mo5798w()) {
                this.f8467a.mo7422d();
                return;
            }
            this.f8471e = false;
            if (this.f8472f) {
                this.f8467a.mo7421b();
            }
        }
        this.f8467a.mo7420a(w);
        PlaybackParameters c = vVar.mo5785c();
        if (!c.equals(this.f8467a.mo5785c())) {
            this.f8467a.mo5787f(c);
            this.f8468b.mo7513e(c);
        }
    }

    /* renamed from: a */
    public void mo7507a(C1227p1 p1Var) {
        if (p1Var == this.f8469c) {
            this.f8470d = null;
            this.f8469c = null;
            this.f8471e = true;
        }
    }

    /* renamed from: b */
    public void mo7508b(C1227p1 p1Var) throws ExoPlaybackException {
        MediaClock u = p1Var.mo5794u();
        if (u != null) {
            MediaClock vVar = this.f8470d;
            if (u == vVar) {
                return;
            }
            if (vVar == null) {
                this.f8470d = u;
                this.f8469c = p1Var;
                u.mo5787f(this.f8467a.mo5785c());
                return;
            }
            throw ExoPlaybackException.m10681e(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: c */
    public PlaybackParameters mo5785c() {
        MediaClock vVar = this.f8470d;
        if (vVar != null) {
            return vVar.mo5785c();
        }
        return this.f8467a.mo5785c();
    }

    /* renamed from: d */
    public void mo7509d(long j) {
        this.f8467a.mo7420a(j);
    }

    /* renamed from: f */
    public void mo5787f(PlaybackParameters i1Var) {
        MediaClock vVar = this.f8470d;
        if (vVar != null) {
            vVar.mo5787f(i1Var);
            i1Var = this.f8470d.mo5785c();
        }
        this.f8467a.mo5787f(i1Var);
    }

    /* renamed from: g */
    public void mo7510g() {
        this.f8472f = true;
        this.f8467a.mo7421b();
    }

    /* renamed from: h */
    public void mo7511h() {
        this.f8472f = false;
        this.f8467a.mo7422d();
    }

    /* renamed from: i */
    public long mo7512i(boolean z) {
        m10450j(z);
        return mo5798w();
    }

    /* renamed from: w */
    public long mo5798w() {
        if (this.f8471e) {
            return this.f8467a.mo5798w();
        }
        return ((MediaClock) Assertions.m10153e(this.f8470d)).mo5798w();
    }
}
