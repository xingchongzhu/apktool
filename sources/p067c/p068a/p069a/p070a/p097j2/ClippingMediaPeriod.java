package p067c.p068a.p069a.p070a.p097j2;

import java.io.IOException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.SeekParameters;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod.C1076a;
import p067c.p068a.p069a.p070a.p110l2.C1174h;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.n */
public final class ClippingMediaPeriod implements MediaPeriod, C1076a {

    /* renamed from: a */
    public final MediaPeriod f7569a;

    /* renamed from: b */
    private C1076a f7570b;

    /* renamed from: c */
    private C1102a[] f7571c = new C1102a[0];

    /* renamed from: d */
    private long f7572d;

    /* renamed from: e */
    long f7573e;

    /* renamed from: f */
    long f7574f;

    /* renamed from: c.a.a.a.j2.n$a */
    /* compiled from: ClippingMediaPeriod */
    private final class C1102a implements SampleStream {

        /* renamed from: a */
        public final SampleStream f7575a;

        /* renamed from: b */
        private boolean f7576b;

        public C1102a(SampleStream l0Var) {
            this.f7575a = l0Var;
        }

        /* renamed from: a */
        public int mo6897a(FormatHolder v0Var, DecoderInputBuffer fVar, boolean z) {
            if (ClippingMediaPeriod.this.mo6955i()) {
                return -3;
            }
            if (this.f7576b) {
                fVar.mo5954m(4);
                return -4;
            }
            int a = this.f7575a.mo6897a(v0Var, fVar, z);
            if (a == -5) {
                Format u0Var = (Format) Assertions.m10153e(v0Var.f8869b);
                int i = u0Var.f8798B;
                if (!(i == 0 && u0Var.f8799C == 0)) {
                    ClippingMediaPeriod nVar = ClippingMediaPeriod.this;
                    int i2 = 0;
                    if (nVar.f7573e != 0) {
                        i = 0;
                    }
                    if (nVar.f7574f == Long.MIN_VALUE) {
                        i2 = u0Var.f8799C;
                    }
                    v0Var.f8869b = u0Var.mo7668l().mo7687M(i).mo7688N(i2).mo7679E();
                }
                return -5;
            }
            ClippingMediaPeriod nVar2 = ClippingMediaPeriod.this;
            long j = nVar2.f7574f;
            if (j == Long.MIN_VALUE || ((a != -4 || fVar.f5746e < j) && (a != -3 || nVar2.mo6808c() != Long.MIN_VALUE || fVar.f5745d))) {
                return a;
            }
            fVar.mo5947f();
            fVar.mo5954m(4);
            this.f7576b = true;
            return -4;
        }

        /* renamed from: b */
        public void mo6898b() throws IOException {
            this.f7575a.mo6898b();
        }

        /* renamed from: c */
        public int mo6899c(long j) {
            if (ClippingMediaPeriod.this.mo6955i()) {
                return -3;
            }
            return this.f7575a.mo6899c(j);
        }

        /* renamed from: d */
        public void mo6957d() {
            this.f7576b = false;
        }

        /* renamed from: e */
        public boolean mo6900e() {
            return !ClippingMediaPeriod.this.mo6955i() && this.f7575a.mo6900e();
        }
    }

    public ClippingMediaPeriod(MediaPeriod a0Var, boolean z, long j, long j2) {
        this.f7569a = a0Var;
        this.f7572d = z ? j : -9223372036854775807L;
        this.f7573e = j;
        this.f7574f = j2;
    }

    /* renamed from: h */
    private SeekParameters m9154h(long j, SeekParameters u1Var) {
        long q = Util.m10309q(u1Var.f8864f, 0, j - this.f7573e);
        long j2 = u1Var.f8865g;
        long j3 = this.f7574f;
        long q2 = Util.m10309q(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (q == u1Var.f8864f && q2 == u1Var.f8865g) {
            return u1Var;
        }
        return new SeekParameters(q, q2);
    }

    /* renamed from: r */
    private static boolean m9155r(long j, C1174h[] hVarArr) {
        if (j != 0) {
            for (C1174h hVar : hVarArr) {
                if (hVar != null) {
                    Format l = hVar.mo7266l();
                    if (!MimeTypes.m10395a(l.f8814l, l.f8811i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo6806a() {
        return this.f7569a.mo6806a();
    }

    /* renamed from: b */
    public long mo6807b() {
        long b = this.f7569a.mo6807b();
        if (b != Long.MIN_VALUE) {
            long j = this.f7574f;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: c */
    public long mo6808c() {
        long c = this.f7569a.mo6808c();
        if (c != Long.MIN_VALUE) {
            long j = this.f7574f;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: d */
    public boolean mo6809d(long j) {
        return this.f7569a.mo6809d(j);
    }

    /* renamed from: e */
    public void mo6810e(long j) {
        this.f7569a.mo6810e(j);
    }

    /* renamed from: g */
    public long mo6811g(long j, SeekParameters u1Var) {
        long j2 = this.f7573e;
        if (j == j2) {
            return j2;
        }
        return this.f7569a.mo6811g(j, m9154h(j, u1Var));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo6955i() {
        return this.f7572d != -9223372036854775807L;
    }

    /* renamed from: k */
    public long mo6812k() {
        if (mo6955i()) {
            long j = this.f7572d;
            this.f7572d = -9223372036854775807L;
            long k = mo6812k();
            if (k != -9223372036854775807L) {
                j = k;
            }
            return j;
        }
        long k2 = this.f7569a.mo6812k();
        if (k2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        Assertions.m10154f(k2 >= this.f7573e);
        long j2 = this.f7574f;
        if (j2 != Long.MIN_VALUE && k2 > j2) {
            z = false;
        }
        Assertions.m10154f(z);
        return k2;
    }

    /* renamed from: l */
    public void mo6813l(C1076a aVar, long j) {
        this.f7570b = aVar;
        this.f7569a.mo6813l(this, j);
    }

    /* renamed from: m */
    public void mo6819m(MediaPeriod a0Var) {
        ((C1076a) Assertions.m10153e(this.f7570b)).mo6819m(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo6814n(p067c.p068a.p069a.p070a.p110l2.C1174h[] r13, boolean[] r14, p067c.p068a.p069a.p070a.p097j2.SampleStream[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            c.a.a.a.j2.n$a[] r2 = new p067c.p068a.p069a.p070a.p097j2.ClippingMediaPeriod.C1102a[r2]
            r0.f7571c = r2
            int r2 = r1.length
            c.a.a.a.j2.l0[] r9 = new p067c.p068a.p069a.p070a.p097j2.SampleStream[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            c.a.a.a.j2.n$a[] r3 = r0.f7571c
            r4 = r1[r2]
            c.a.a.a.j2.n$a r4 = (p067c.p068a.p069a.p070a.p097j2.ClippingMediaPeriod.C1102a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            c.a.a.a.j2.l0 r11 = r3.f7575a
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            c.a.a.a.j2.a0 r2 = r0.f7569a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo6814n(r3, r4, r5, r6, r7)
            boolean r4 = r12.mo6955i()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.f7573e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = m9155r(r4, r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.f7572d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.f7573e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            long r4 = r0.f7574f
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0067
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0097
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            c.a.a.a.j2.n$a[] r4 = r0.f7571c
            r4[r10] = r11
            goto L_0x008e
        L_0x0077:
            c.a.a.a.j2.n$a[] r4 = r0.f7571c
            r5 = r4[r10]
            if (r5 == 0) goto L_0x0085
            r5 = r4[r10]
            c.a.a.a.j2.l0 r5 = r5.f7575a
            r6 = r9[r10]
            if (r5 == r6) goto L_0x008e
        L_0x0085:
            c.a.a.a.j2.n$a r5 = new c.a.a.a.j2.n$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x008e:
            c.a.a.a.j2.n$a[] r4 = r0.f7571c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.ClippingMediaPeriod.mo6814n(c.a.a.a.l2.h[], boolean[], c.a.a.a.j2.l0[], boolean[], long):long");
    }

    /* renamed from: o */
    public TrackGroupArray mo6815o() {
        return this.f7569a.mo6815o();
    }

    /* renamed from: q */
    public void mo6954p(MediaPeriod a0Var) {
        ((C1076a) Assertions.m10153e(this.f7570b)).mo6954p(this);
    }

    /* renamed from: s */
    public void mo6816s() throws IOException {
        this.f7569a.mo6816s();
    }

    /* renamed from: t */
    public void mo6817t(long j, boolean z) {
        this.f7569a.mo6817t(j, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo6818u(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f7572d = r0
            c.a.a.a.j2.n$a[] r0 = r6.f7571c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo6957d()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            c.a.a.a.j2.a0 r0 = r6.f7569a
            long r0 = r0.mo6818u(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f7573e
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f7574f
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.ClippingMediaPeriod.mo6818u(long):long");
    }
}
