package p067c.p068a.p069a.p070a.p111m2;

import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.PlaybackParameters;

/* renamed from: c.a.a.a.m2.f0 */
public final class StandaloneMediaClock implements MediaClock {

    /* renamed from: a */
    private final Clock f8363a;

    /* renamed from: b */
    private boolean f8364b;

    /* renamed from: c */
    private long f8365c;

    /* renamed from: d */
    private long f8366d;

    /* renamed from: e */
    private PlaybackParameters f8367e = PlaybackParameters.f7375a;

    public StandaloneMediaClock(Clock gVar) {
        this.f8363a = gVar;
    }

    /* renamed from: a */
    public void mo7420a(long j) {
        this.f8365c = j;
        if (this.f8364b) {
            this.f8366d = this.f8363a.mo7425c();
        }
    }

    /* renamed from: b */
    public void mo7421b() {
        if (!this.f8364b) {
            this.f8366d = this.f8363a.mo7425c();
            this.f8364b = true;
        }
    }

    /* renamed from: c */
    public PlaybackParameters mo5785c() {
        return this.f8367e;
    }

    /* renamed from: d */
    public void mo7422d() {
        if (this.f8364b) {
            mo7420a(mo5798w());
            this.f8364b = false;
        }
    }

    /* renamed from: f */
    public void mo5787f(PlaybackParameters i1Var) {
        if (this.f8364b) {
            mo7420a(mo5798w());
        }
        this.f8367e = i1Var;
    }

    /* renamed from: w */
    public long mo5798w() {
        long j;
        long j2 = this.f8365c;
        if (!this.f8364b) {
            return j2;
        }
        long c = this.f8363a.mo7425c() - this.f8366d;
        PlaybackParameters i1Var = this.f8367e;
        if (i1Var.f7376b == 1.0f) {
            j = C.m8860c(c);
        } else {
            j = i1Var.mo6775a(c);
        }
        return j2 + j;
    }
}
