package p067c.p068a.p069a.p070a.p097j2;

import com.google.android.exoplayer2.upstream.Allocator;
import java.io.IOException;
import p067c.p068a.p069a.p070a.SeekParameters;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod.C1076a;
import p067c.p068a.p069a.p070a.p110l2.C1174h;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.x */
public final class MaskingMediaPeriod implements MediaPeriod, C1076a {

    /* renamed from: a */
    public final C1081a f7666a;

    /* renamed from: b */
    private final long f7667b;

    /* renamed from: c */
    private final Allocator f7668c;

    /* renamed from: d */
    private C1080d0 f7669d;

    /* renamed from: e */
    private MediaPeriod f7670e;

    /* renamed from: f */
    private C1076a f7671f;

    /* renamed from: g */
    private C1113a f7672g;

    /* renamed from: h */
    private boolean f7673h;

    /* renamed from: i */
    private long f7674i = -9223372036854775807L;

    /* renamed from: c.a.a.a.j2.x$a */
    /* compiled from: MaskingMediaPeriod */
    public interface C1113a {
        /* renamed from: a */
        void mo7026a(C1081a aVar, IOException iOException);

        /* renamed from: b */
        void mo7027b(C1081a aVar);
    }

    public MaskingMediaPeriod(C1081a aVar, Allocator eVar, long j) {
        this.f7666a = aVar;
        this.f7668c = eVar;
        this.f7667b = j;
    }

    /* renamed from: r */
    private long m9283r(long j) {
        long j2 = this.f7674i;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: a */
    public boolean mo6806a() {
        MediaPeriod a0Var = this.f7670e;
        return a0Var != null && a0Var.mo6806a();
    }

    /* renamed from: b */
    public long mo6807b() {
        return ((MediaPeriod) Util.m10293i(this.f7670e)).mo6807b();
    }

    /* renamed from: c */
    public long mo6808c() {
        return ((MediaPeriod) Util.m10293i(this.f7670e)).mo6808c();
    }

    /* renamed from: d */
    public boolean mo6809d(long j) {
        MediaPeriod a0Var = this.f7670e;
        return a0Var != null && a0Var.mo6809d(j);
    }

    /* renamed from: e */
    public void mo6810e(long j) {
        ((MediaPeriod) Util.m10293i(this.f7670e)).mo6810e(j);
    }

    /* renamed from: g */
    public long mo6811g(long j, SeekParameters u1Var) {
        return ((MediaPeriod) Util.m10293i(this.f7670e)).mo6811g(j, u1Var);
    }

    /* renamed from: h */
    public void mo7019h(C1081a aVar) {
        long r = m9283r(this.f7667b);
        MediaPeriod d = ((C1080d0) Assertions.m10153e(this.f7669d)).mo6830d(aVar, this.f7668c, r);
        this.f7670e = d;
        if (this.f7671f != null) {
            d.mo6813l(this, r);
        }
    }

    /* renamed from: i */
    public long mo7020i() {
        return this.f7674i;
    }

    /* renamed from: k */
    public long mo6812k() {
        return ((MediaPeriod) Util.m10293i(this.f7670e)).mo6812k();
    }

    /* renamed from: l */
    public void mo6813l(C1076a aVar, long j) {
        this.f7671f = aVar;
        MediaPeriod a0Var = this.f7670e;
        if (a0Var != null) {
            a0Var.mo6813l(this, m9283r(this.f7667b));
        }
    }

    /* renamed from: m */
    public void mo6819m(MediaPeriod a0Var) {
        ((C1076a) Util.m10293i(this.f7671f)).mo6819m(this);
        C1113a aVar = this.f7672g;
        if (aVar != null) {
            aVar.mo7027b(this.f7666a);
        }
    }

    /* renamed from: n */
    public long mo6814n(C1174h[] hVarArr, boolean[] zArr, SampleStream[] l0VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f7674i;
        if (j3 == -9223372036854775807L || j != this.f7667b) {
            j2 = j;
        } else {
            this.f7674i = -9223372036854775807L;
            j2 = j3;
        }
        return ((MediaPeriod) Util.m10293i(this.f7670e)).mo6814n(hVarArr, zArr, l0VarArr, zArr2, j2);
    }

    /* renamed from: o */
    public TrackGroupArray mo6815o() {
        return ((MediaPeriod) Util.m10293i(this.f7670e)).mo6815o();
    }

    /* renamed from: q */
    public long mo7021q() {
        return this.f7667b;
    }

    /* renamed from: s */
    public void mo6816s() throws IOException {
        try {
            MediaPeriod a0Var = this.f7670e;
            if (a0Var != null) {
                a0Var.mo6816s();
                return;
            }
            C1080d0 d0Var = this.f7669d;
            if (d0Var != null) {
                d0Var.mo6829c();
            }
        } catch (IOException e) {
            C1113a aVar = this.f7672g;
            if (aVar == null) {
                throw e;
            } else if (!this.f7673h) {
                this.f7673h = true;
                aVar.mo7026a(this.f7666a, e);
            }
        }
    }

    /* renamed from: t */
    public void mo6817t(long j, boolean z) {
        ((MediaPeriod) Util.m10293i(this.f7670e)).mo6817t(j, z);
    }

    /* renamed from: u */
    public long mo6818u(long j) {
        return ((MediaPeriod) Util.m10293i(this.f7670e)).mo6818u(j);
    }

    /* renamed from: v */
    public void mo6954p(MediaPeriod a0Var) {
        ((C1076a) Util.m10293i(this.f7671f)).mo6954p(this);
    }

    /* renamed from: w */
    public void mo7023w(long j) {
        this.f7674i = j;
    }

    /* renamed from: x */
    public void mo7024x() {
        if (this.f7670e != null) {
            ((C1080d0) Assertions.m10153e(this.f7669d)).mo6832f(this.f7670e);
        }
    }

    /* renamed from: y */
    public void mo7025y(C1080d0 d0Var) {
        Assertions.m10154f(this.f7669d == null);
        this.f7669d = d0Var;
    }
}
