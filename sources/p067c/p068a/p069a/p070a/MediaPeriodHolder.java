package p067c.p068a.p069a.p070a;

import com.google.android.exoplayer2.upstream.Allocator;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.ClippingMediaPeriod;
import p067c.p068a.p069a.p070a.p097j2.EmptySampleStream;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod;
import p067c.p068a.p069a.p070a.p097j2.SampleStream;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.C1174h;
import p067c.p068a.p069a.p070a.p110l2.TrackSelector;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectorResult;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;

/* renamed from: c.a.a.a.b1 */
final class MediaPeriodHolder {

    /* renamed from: a */
    public final MediaPeriod f5396a;

    /* renamed from: b */
    public final Object f5397b;

    /* renamed from: c */
    public final SampleStream[] f5398c;

    /* renamed from: d */
    public boolean f5399d;

    /* renamed from: e */
    public boolean f5400e;

    /* renamed from: f */
    public MediaPeriodInfo f5401f;

    /* renamed from: g */
    public boolean f5402g;

    /* renamed from: h */
    private final boolean[] f5403h;

    /* renamed from: i */
    private final C1240r1[] f5404i;

    /* renamed from: j */
    private final TrackSelector f5405j;

    /* renamed from: k */
    private final MediaSourceList f5406k;

    /* renamed from: l */
    private MediaPeriodHolder f5407l;

    /* renamed from: m */
    private TrackGroupArray f5408m = TrackGroupArray.f7609a;

    /* renamed from: n */
    private TrackSelectorResult f5409n;

    /* renamed from: o */
    private long f5410o;

    public MediaPeriodHolder(C1240r1[] r1VarArr, long j, TrackSelector nVar, Allocator eVar, MediaSourceList f1Var, MediaPeriodInfo c1Var, TrackSelectorResult oVar) {
        this.f5404i = r1VarArr;
        this.f5410o = j;
        this.f5405j = nVar;
        this.f5406k = f1Var;
        C1081a aVar = c1Var.f5711a;
        this.f5397b = aVar.f7391a;
        this.f5401f = c1Var;
        this.f5409n = oVar;
        this.f5398c = new SampleStream[r1VarArr.length];
        this.f5403h = new boolean[r1VarArr.length];
        this.f5396a = m6467e(aVar, f1Var, eVar, c1Var.f5712b, c1Var.f5714d);
    }

    /* renamed from: c */
    private void m6466c(SampleStream[] l0VarArr) {
        int i = 0;
        while (true) {
            C1240r1[] r1VarArr = this.f5404i;
            if (i < r1VarArr.length) {
                if (r1VarArr[i].mo6518g() == 7 && this.f5409n.mo7332c(i)) {
                    l0VarArr[i] = new EmptySampleStream();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private static MediaPeriod m6467e(C1081a aVar, MediaSourceList f1Var, Allocator eVar, long j, long j2) {
        MediaPeriod g = f1Var.mo6145g(aVar, eVar, j);
        if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
            return g;
        }
        ClippingMediaPeriod nVar = new ClippingMediaPeriod(g, true, 0, j2);
        return nVar;
    }

    /* renamed from: f */
    private void m6468f() {
        if (m6471r()) {
            int i = 0;
            while (true) {
                TrackSelectorResult oVar = this.f5409n;
                if (i < oVar.f8303a) {
                    boolean c = oVar.mo7332c(i);
                    C1174h hVar = this.f5409n.f8305c[i];
                    if (c && hVar != null) {
                        hVar.mo7244d();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m6469g(SampleStream[] l0VarArr) {
        int i = 0;
        while (true) {
            C1240r1[] r1VarArr = this.f5404i;
            if (i < r1VarArr.length) {
                if (r1VarArr[i].mo6518g() == 7) {
                    l0VarArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private void m6470h() {
        if (m6471r()) {
            int i = 0;
            while (true) {
                TrackSelectorResult oVar = this.f5409n;
                if (i < oVar.f8303a) {
                    boolean c = oVar.mo7332c(i);
                    C1174h hVar = this.f5409n.f8305c[i];
                    if (c && hVar != null) {
                        hVar.mo7245f();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    private boolean m6471r() {
        return this.f5407l == null;
    }

    /* renamed from: u */
    private static void m6472u(long j, MediaSourceList f1Var, MediaPeriod a0Var) {
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            f1Var.mo6153z(a0Var);
            return;
        }
        try {
            f1Var.mo6153z(((ClippingMediaPeriod) a0Var).f7569a);
        } catch (RuntimeException e) {
            Log.m10382d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: a */
    public long mo5745a(TrackSelectorResult oVar, long j, boolean z) {
        return mo5746b(oVar, j, z, new boolean[this.f5404i.length]);
    }

    /* renamed from: b */
    public long mo5746b(TrackSelectorResult oVar, long j, boolean z, boolean[] zArr) {
        TrackSelectorResult oVar2 = oVar;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= oVar2.f8303a) {
                break;
            }
            boolean[] zArr2 = this.f5403h;
            if (z || !oVar.mo7331b(this.f5409n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m6469g(this.f5398c);
        m6468f();
        this.f5409n = oVar2;
        m6470h();
        long n = this.f5396a.mo6814n(oVar2.f8305c, this.f5403h, this.f5398c, zArr, j);
        m6466c(this.f5398c);
        this.f5400e = false;
        int i2 = 0;
        while (true) {
            SampleStream[] l0VarArr = this.f5398c;
            if (i2 >= l0VarArr.length) {
                return n;
            }
            if (l0VarArr[i2] != null) {
                Assertions.m10154f(oVar.mo7332c(i2));
                if (this.f5404i[i2].mo6518g() != 7) {
                    this.f5400e = true;
                }
            } else {
                Assertions.m10154f(oVar2.f8305c[i2] == null);
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void mo5747d(long j) {
        Assertions.m10154f(m6471r());
        this.f5396a.mo6809d(mo5762y(j));
    }

    /* renamed from: i */
    public long mo5748i() {
        if (!this.f5399d) {
            return this.f5401f.f5712b;
        }
        long c = this.f5400e ? this.f5396a.mo6808c() : Long.MIN_VALUE;
        if (c == Long.MIN_VALUE) {
            c = this.f5401f.f5715e;
        }
        return c;
    }

    /* renamed from: j */
    public MediaPeriodHolder mo5749j() {
        return this.f5407l;
    }

    /* renamed from: k */
    public long mo5750k() {
        if (!this.f5399d) {
            return 0;
        }
        return this.f5396a.mo6807b();
    }

    /* renamed from: l */
    public long mo5751l() {
        return this.f5410o;
    }

    /* renamed from: m */
    public long mo5752m() {
        return this.f5401f.f5712b + this.f5410o;
    }

    /* renamed from: n */
    public TrackGroupArray mo5753n() {
        return this.f5408m;
    }

    /* renamed from: o */
    public TrackSelectorResult mo5754o() {
        return this.f5409n;
    }

    /* renamed from: p */
    public void mo5755p(float f, Timeline x1Var) throws ExoPlaybackException {
        this.f5399d = true;
        this.f5408m = this.f5396a.mo6815o();
        TrackSelectorResult v = mo5759v(f, x1Var);
        MediaPeriodInfo c1Var = this.f5401f;
        long j = c1Var.f5712b;
        long j2 = c1Var.f5715e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long a = mo5745a(v, j, false);
        long j3 = this.f5410o;
        MediaPeriodInfo c1Var2 = this.f5401f;
        this.f5410o = j3 + (c1Var2.f5712b - a);
        this.f5401f = c1Var2.mo5943b(a);
    }

    /* renamed from: q */
    public boolean mo5756q() {
        return this.f5399d && (!this.f5400e || this.f5396a.mo6808c() == Long.MIN_VALUE);
    }

    /* renamed from: s */
    public void mo5757s(long j) {
        Assertions.m10154f(m6471r());
        if (this.f5399d) {
            this.f5396a.mo6810e(mo5762y(j));
        }
    }

    /* renamed from: t */
    public void mo5758t() {
        m6468f();
        m6472u(this.f5401f.f5714d, this.f5406k, this.f5396a);
    }

    /* renamed from: v */
    public TrackSelectorResult mo5759v(float f, Timeline x1Var) throws ExoPlaybackException {
        C1174h[] hVarArr;
        TrackSelectorResult d = this.f5405j.mo7314d(this.f5404i, mo5753n(), this.f5401f.f5711a, x1Var);
        for (C1174h hVar : d.f8305c) {
            if (hVar != null) {
                hVar.mo7250o(f);
            }
        }
        return d;
    }

    /* renamed from: w */
    public void mo5760w(MediaPeriodHolder b1Var) {
        if (b1Var != this.f5407l) {
            m6468f();
            this.f5407l = b1Var;
            m6470h();
        }
    }

    /* renamed from: x */
    public void mo5761x(long j) {
        this.f5410o = j;
    }

    /* renamed from: y */
    public long mo5762y(long j) {
        return j - mo5751l();
    }

    /* renamed from: z */
    public long mo5763z(long j) {
        return j + mo5751l();
    }
}
