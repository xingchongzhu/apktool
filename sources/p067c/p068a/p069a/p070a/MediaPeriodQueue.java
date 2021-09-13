package p067c.p068a.p069a.p070a;

import android.os.Handler;
import android.util.Pair;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.Timeline.C1257c;
import p067c.p068a.p069a.p070a.p071a2.AnalyticsCollector;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableList.C1378a;

/* renamed from: c.a.a.a.d1 */
final class MediaPeriodQueue {

    /* renamed from: a */
    private final C1256b f5777a = new C1256b();

    /* renamed from: b */
    private final C1257c f5778b = new C1257c();

    /* renamed from: c */
    private final AnalyticsCollector f5779c;

    /* renamed from: d */
    private final Handler f5780d;

    /* renamed from: e */
    private long f5781e;

    /* renamed from: f */
    private int f5782f;

    /* renamed from: g */
    private boolean f5783g;

    /* renamed from: h */
    private MediaPeriodHolder f5784h;

    /* renamed from: i */
    private MediaPeriodHolder f5785i;

    /* renamed from: j */
    private MediaPeriodHolder f5786j;

    /* renamed from: k */
    private int f5787k;

    /* renamed from: l */
    private Object f5788l;

    /* renamed from: m */
    private long f5789m;

    public MediaPeriodQueue(AnalyticsCollector c1Var, Handler handler) {
        this.f5779c = c1Var;
        this.f5780d = handler;
    }

    /* renamed from: A */
    private static C1081a m6959A(Timeline x1Var, Object obj, long j, long j2, C1256b bVar) {
        x1Var.mo5991h(obj, bVar);
        int e = bVar.mo7749e(j);
        if (e == -1) {
            return new C1081a(obj, j2, bVar.mo7748d(j));
        }
        C1081a aVar = new C1081a(obj, e, bVar.mo7755i(e), j2);
        return aVar;
    }

    /* renamed from: B */
    private long m6960B(Timeline x1Var, Object obj) {
        int i = x1Var.mo5991h(obj, this.f5777a).f8952c;
        Object obj2 = this.f5788l;
        if (obj2 != null) {
            int b = x1Var.mo5987b(obj2);
            if (b != -1 && x1Var.mo7738f(b, this.f5777a).f8952c == i) {
                return this.f5789m;
            }
        }
        for (MediaPeriodHolder b1Var = this.f5784h; b1Var != null; b1Var = b1Var.mo5749j()) {
            if (b1Var.f5397b.equals(obj)) {
                return b1Var.f5401f.f5711a.f7394d;
            }
        }
        for (MediaPeriodHolder b1Var2 = this.f5784h; b1Var2 != null; b1Var2 = b1Var2.mo5749j()) {
            int b2 = x1Var.mo5987b(b1Var2.f5397b);
            if (b2 != -1 && x1Var.mo7738f(b2, this.f5777a).f8952c == i) {
                return b1Var2.f5401f.f5711a.f7394d;
            }
        }
        long j = this.f5781e;
        this.f5781e = 1 + j;
        if (this.f5784h == null) {
            this.f5788l = obj;
            this.f5789m = j;
        }
        return j;
    }

    /* renamed from: D */
    private boolean m6961D(Timeline x1Var) {
        MediaPeriodHolder b1Var = this.f5784h;
        if (b1Var == null) {
            return true;
        }
        int b = x1Var.mo5987b(b1Var.f5397b);
        while (true) {
            b = x1Var.mo7736d(b, this.f5777a, this.f5778b, this.f5782f, this.f5783g);
            while (b1Var.mo5749j() != null && !b1Var.f5401f.f5716f) {
                b1Var = b1Var.mo5749j();
            }
            MediaPeriodHolder j = b1Var.mo5749j();
            if (b == -1 || j == null || x1Var.mo5987b(j.f5397b) != b) {
                boolean y = mo6016y(b1Var);
                b1Var.f5401f = mo6012p(x1Var, b1Var.f5401f);
            } else {
                b1Var = j;
            }
        }
        boolean y2 = mo6016y(b1Var);
        b1Var.f5401f = mo6012p(x1Var, b1Var.f5401f);
        return !y2;
    }

    /* renamed from: c */
    private boolean m6962c(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* renamed from: d */
    private boolean m6963d(MediaPeriodInfo c1Var, MediaPeriodInfo c1Var2) {
        return c1Var.f5712b == c1Var2.f5712b && c1Var.f5711a.equals(c1Var2.f5711a);
    }

    /* renamed from: g */
    private MediaPeriodInfo m6964g(PlaybackInfo h1Var) {
        return m6966j(h1Var.f7203b, h1Var.f7204c, h1Var.f7205d, h1Var.f7220s);
    }

    /* renamed from: h */
    private MediaPeriodInfo m6965h(Timeline x1Var, MediaPeriodHolder b1Var, long j) {
        long j2;
        Timeline x1Var2 = x1Var;
        MediaPeriodInfo c1Var = b1Var.f5401f;
        long l = (b1Var.mo5751l() + c1Var.f5715e) - j;
        if (c1Var.f5716f) {
            int b = x1Var2.mo5987b(c1Var.f5711a.f7391a);
            C1256b bVar = this.f5777a;
            C1257c cVar = this.f5778b;
            int i = this.f5782f;
            long j3 = 0;
            int d = x1Var.mo7736d(b, bVar, cVar, i, this.f5783g);
            if (d == -1) {
                return null;
            }
            int i2 = x1Var2.mo5990g(d, this.f5777a, true).f8952c;
            Object obj = this.f5777a.f8951b;
            long j4 = c1Var.f5711a.f7394d;
            if (x1Var2.mo7742n(i2, this.f5778b).f8970o == d) {
                Pair k = x1Var.mo7741k(this.f5778b, this.f5777a, i2, -9223372036854775807L, Math.max(0, l));
                if (k == null) {
                    return null;
                }
                obj = k.first;
                long longValue = ((Long) k.second).longValue();
                MediaPeriodHolder j5 = b1Var.mo5749j();
                if (j5 == null || !j5.f5397b.equals(obj)) {
                    j4 = this.f5781e;
                    this.f5781e = 1 + j4;
                } else {
                    j4 = j5.f5401f.f5711a.f7394d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return m6966j(x1Var, m6959A(x1Var, obj, j2, j4, this.f5777a), j3, j2);
        }
        C1081a aVar = c1Var.f5711a;
        x1Var2.mo5991h(aVar.f7391a, this.f5777a);
        if (aVar.mo6822b()) {
            int i3 = aVar.f7392b;
            int a = this.f5777a.mo7745a(i3);
            if (a == -1) {
                return null;
            }
            int j6 = this.f5777a.mo7756j(i3, aVar.f7393c);
            if (j6 < a) {
                return m6967k(x1Var, aVar.f7391a, i3, j6, c1Var.f5713c, aVar.f7394d);
            }
            long j7 = c1Var.f5713c;
            if (j7 == -9223372036854775807L) {
                C1257c cVar2 = this.f5778b;
                C1256b bVar2 = this.f5777a;
                Pair k2 = x1Var.mo7741k(cVar2, bVar2, bVar2.f8952c, -9223372036854775807L, Math.max(0, l));
                if (k2 == null) {
                    return null;
                }
                j7 = ((Long) k2.second).longValue();
            }
            long j8 = j7;
            return m6968l(x1Var, aVar.f7391a, j8, c1Var.f5713c, aVar.f7394d);
        }
        int e = this.f5777a.mo7749e(c1Var.f5714d);
        if (e == -1) {
            Object obj2 = aVar.f7391a;
            long j9 = c1Var.f5715e;
            return m6968l(x1Var, obj2, j9, j9, aVar.f7394d);
        }
        return m6967k(x1Var, aVar.f7391a, e, this.f5777a.mo7755i(e), c1Var.f5715e, aVar.f7394d);
    }

    /* renamed from: j */
    private MediaPeriodInfo m6966j(Timeline x1Var, C1081a aVar, long j, long j2) {
        C1081a aVar2 = aVar;
        Timeline x1Var2 = x1Var;
        x1Var.mo5991h(aVar2.f7391a, this.f5777a);
        if (aVar.mo6822b()) {
            return m6967k(x1Var, aVar2.f7391a, aVar2.f7392b, aVar2.f7393c, j, aVar2.f7394d);
        }
        return m6968l(x1Var, aVar2.f7391a, j2, j, aVar2.f7394d);
    }

    /* renamed from: k */
    private MediaPeriodInfo m6967k(Timeline x1Var, Object obj, int i, int i2, long j, long j2) {
        int i3 = i2;
        C1081a aVar = new C1081a(obj, i, i3, j2);
        long b = x1Var.mo5991h(aVar.f7391a, this.f5777a).mo7746b(aVar.f7392b, aVar.f7393c);
        long g = i3 == this.f5777a.mo7755i(i) ? this.f5777a.mo7752g() : 0;
        MediaPeriodInfo c1Var = new MediaPeriodInfo(aVar, (b == -9223372036854775807L || g < b) ? g : Math.max(0, b - 1), j, -9223372036854775807L, b, false, false, false);
        return c1Var;
    }

    /* renamed from: l */
    private MediaPeriodInfo m6968l(Timeline x1Var, Object obj, long j, long j2, long j3) {
        long j4;
        Timeline x1Var2 = x1Var;
        Object obj2 = obj;
        long j5 = j;
        x1Var2.mo5991h(obj2, this.f5777a);
        int d = this.f5777a.mo7748d(j5);
        C1081a aVar = new C1081a(obj2, j3, d);
        boolean q = m6969q(aVar);
        boolean s = m6971s(x1Var2, aVar);
        boolean r = m6970r(x1Var2, aVar, q);
        long f = d != -1 ? this.f5777a.mo7751f(d) : -9223372036854775807L;
        if (f == -9223372036854775807L || f == Long.MIN_VALUE) {
            j4 = this.f5777a.f8953d;
        } else {
            j4 = f;
        }
        if (j4 != -9223372036854775807L && j5 >= j4) {
            j5 = Math.max(0, j4 - 1);
        }
        MediaPeriodInfo c1Var = new MediaPeriodInfo(aVar, j5, j2, f, j4, q, s, r);
        return c1Var;
    }

    /* renamed from: q */
    private boolean m6969q(C1081a aVar) {
        return !aVar.mo6822b() && aVar.f7395e == -1;
    }

    /* renamed from: r */
    private boolean m6970r(Timeline x1Var, C1081a aVar, boolean z) {
        int b = x1Var.mo5987b(aVar.f7391a);
        if (!x1Var.mo7742n(x1Var.mo7738f(b, this.f5777a).f8952c, this.f5778b).f8966k) {
            if (x1Var.mo7744r(b, this.f5777a, this.f5778b, this.f5782f, this.f5783g) && z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    private boolean m6971s(Timeline x1Var, C1081a aVar) {
        boolean z = false;
        if (!m6969q(aVar)) {
            return false;
        }
        int i = x1Var.mo5991h(aVar.f7391a, this.f5777a).f8952c;
        if (x1Var.mo7742n(i, this.f5778b).f8971p == x1Var.mo5987b(aVar.f7391a)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void mo6014v(C1378a aVar, C1081a aVar2) {
        this.f5779c.mo5665q1(aVar.mo8441e(), aVar2);
    }

    /* renamed from: w */
    private void m6973w() {
        if (this.f5779c != null) {
            C1378a k = ImmutableList.m11914k();
            for (MediaPeriodHolder b1Var = this.f5784h; b1Var != null; b1Var = b1Var.mo5749j()) {
                k.mo8440d(b1Var.f5401f.f5711a);
            }
            MediaPeriodHolder b1Var2 = this.f5785i;
            this.f5780d.post(new C1259z(this, k, b1Var2 == null ? null : b1Var2.f5401f.f5711a));
        }
    }

    /* renamed from: C */
    public boolean mo6000C() {
        MediaPeriodHolder b1Var = this.f5786j;
        return b1Var == null || (!b1Var.f5401f.f5718h && b1Var.mo5756q() && this.f5786j.f5401f.f5715e != -9223372036854775807L && this.f5787k < 100);
    }

    /* renamed from: E */
    public boolean mo6001E(Timeline x1Var, long j, long j2) {
        MediaPeriodInfo c1Var;
        long j3;
        MediaPeriodHolder b1Var = this.f5784h;
        MediaPeriodHolder b1Var2 = null;
        while (true) {
            boolean z = true;
            if (b1Var == null) {
                return true;
            }
            MediaPeriodInfo c1Var2 = b1Var.f5401f;
            if (b1Var2 == null) {
                c1Var = mo6012p(x1Var, c1Var2);
            } else {
                MediaPeriodInfo h = m6965h(x1Var, b1Var2, j);
                if (h == null) {
                    return !mo6016y(b1Var2);
                }
                if (!m6963d(c1Var2, h)) {
                    return !mo6016y(b1Var2);
                }
                c1Var = h;
            }
            b1Var.f5401f = c1Var.mo5942a(c1Var2.f5713c);
            if (!m6962c(c1Var2.f5715e, c1Var.f5715e)) {
                long j4 = c1Var.f5715e;
                if (j4 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = b1Var.mo5763z(j4);
                }
                boolean z2 = b1Var == this.f5785i && (j2 == Long.MIN_VALUE || j2 >= j3);
                if (mo6016y(b1Var) || z2) {
                    z = false;
                }
                return z;
            }
            b1Var2 = b1Var;
            b1Var = b1Var.mo5749j();
        }
    }

    /* renamed from: F */
    public boolean mo6002F(Timeline x1Var, int i) {
        this.f5782f = i;
        return m6961D(x1Var);
    }

    /* renamed from: G */
    public boolean mo6003G(Timeline x1Var, boolean z) {
        this.f5783g = z;
        return m6961D(x1Var);
    }

    /* renamed from: a */
    public MediaPeriodHolder mo6004a() {
        MediaPeriodHolder b1Var = this.f5784h;
        if (b1Var == null) {
            return null;
        }
        if (b1Var == this.f5785i) {
            this.f5785i = b1Var.mo5749j();
        }
        this.f5784h.mo5758t();
        int i = this.f5787k - 1;
        this.f5787k = i;
        if (i == 0) {
            this.f5786j = null;
            MediaPeriodHolder b1Var2 = this.f5784h;
            this.f5788l = b1Var2.f5397b;
            this.f5789m = b1Var2.f5401f.f5711a.f7394d;
        }
        this.f5784h = this.f5784h.mo5749j();
        m6973w();
        return this.f5784h;
    }

    /* renamed from: b */
    public MediaPeriodHolder mo6005b() {
        MediaPeriodHolder b1Var = this.f5785i;
        Assertions.m10154f((b1Var == null || b1Var.mo5749j() == null) ? false : true);
        this.f5785i = this.f5785i.mo5749j();
        m6973w();
        return this.f5785i;
    }

    /* renamed from: e */
    public void mo6006e() {
        if (this.f5787k != 0) {
            MediaPeriodHolder b1Var = (MediaPeriodHolder) Assertions.m10156h(this.f5784h);
            this.f5788l = b1Var.f5397b;
            this.f5789m = b1Var.f5401f.f5711a.f7394d;
            while (b1Var != null) {
                b1Var.mo5758t();
                b1Var = b1Var.mo5749j();
            }
            this.f5784h = null;
            this.f5786j = null;
            this.f5785i = null;
            this.f5787k = 0;
            m6973w();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != -9223372036854775807L) goto L_0x002c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p067c.p068a.p069a.p070a.MediaPeriodHolder mo6007f(p067c.p068a.p069a.p070a.C1240r1[] r12, p067c.p068a.p069a.p070a.p110l2.TrackSelector r13, com.google.android.exoplayer2.upstream.Allocator r14, p067c.p068a.p069a.p070a.MediaSourceList r15, p067c.p068a.p069a.p070a.MediaPeriodInfo r16, p067c.p068a.p069a.p070a.p110l2.TrackSelectorResult r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            c.a.a.a.b1 r1 = r0.f5786j
            if (r1 != 0) goto L_0x001e
            c.a.a.a.j2.d0$a r1 = r8.f5711a
            boolean r1 = r1.mo6822b()
            if (r1 == 0) goto L_0x001b
            long r1 = r8.f5713c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            r1 = 0
            goto L_0x002c
        L_0x001e:
            long r1 = r1.mo5751l()
            c.a.a.a.b1 r3 = r0.f5786j
            c.a.a.a.c1 r3 = r3.f5401f
            long r3 = r3.f5715e
            long r1 = r1 + r3
            long r3 = r8.f5712b
            long r1 = r1 - r3
        L_0x002c:
            r3 = r1
            c.a.a.a.b1 r10 = new c.a.a.a.b1
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            c.a.a.a.b1 r1 = r0.f5786j
            if (r1 == 0) goto L_0x0043
            r1.mo5760w(r10)
            goto L_0x0047
        L_0x0043:
            r0.f5784h = r10
            r0.f5785i = r10
        L_0x0047:
            r1 = 0
            r0.f5788l = r1
            r0.f5786j = r10
            int r1 = r0.f5787k
            int r1 = r1 + 1
            r0.f5787k = r1
            r11.m6973w()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.MediaPeriodQueue.mo6007f(c.a.a.a.r1[], c.a.a.a.l2.n, com.google.android.exoplayer2.upstream.e, c.a.a.a.f1, c.a.a.a.c1, c.a.a.a.l2.o):c.a.a.a.b1");
    }

    /* renamed from: i */
    public MediaPeriodHolder mo6008i() {
        return this.f5786j;
    }

    /* renamed from: m */
    public MediaPeriodInfo mo6009m(long j, PlaybackInfo h1Var) {
        MediaPeriodHolder b1Var = this.f5786j;
        if (b1Var == null) {
            return m6964g(h1Var);
        }
        return m6965h(h1Var.f7203b, b1Var, j);
    }

    /* renamed from: n */
    public MediaPeriodHolder mo6010n() {
        return this.f5784h;
    }

    /* renamed from: o */
    public MediaPeriodHolder mo6011o() {
        return this.f5785i;
    }

    /* renamed from: p */
    public MediaPeriodInfo mo6012p(Timeline x1Var, MediaPeriodInfo c1Var) {
        long j;
        C1081a aVar = c1Var.f5711a;
        boolean q = m6969q(aVar);
        boolean s = m6971s(x1Var, aVar);
        boolean r = m6970r(x1Var, aVar, q);
        x1Var.mo5991h(c1Var.f5711a.f7391a, this.f5777a);
        if (aVar.mo6822b()) {
            j = this.f5777a.mo7746b(aVar.f7392b, aVar.f7393c);
        } else {
            j = c1Var.f5714d;
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                j = this.f5777a.mo7753h();
            }
        }
        MediaPeriodInfo c1Var2 = new MediaPeriodInfo(aVar, c1Var.f5712b, c1Var.f5713c, c1Var.f5714d, j, q, s, r);
        return c1Var2;
    }

    /* renamed from: t */
    public boolean mo6013t(MediaPeriod a0Var) {
        MediaPeriodHolder b1Var = this.f5786j;
        return b1Var != null && b1Var.f5396a == a0Var;
    }

    /* renamed from: x */
    public void mo6015x(long j) {
        MediaPeriodHolder b1Var = this.f5786j;
        if (b1Var != null) {
            b1Var.mo5757s(j);
        }
    }

    /* renamed from: y */
    public boolean mo6016y(MediaPeriodHolder b1Var) {
        boolean z = false;
        Assertions.m10154f(b1Var != null);
        if (b1Var.equals(this.f5786j)) {
            return false;
        }
        this.f5786j = b1Var;
        while (b1Var.mo5749j() != null) {
            b1Var = b1Var.mo5749j();
            if (b1Var == this.f5785i) {
                this.f5785i = this.f5784h;
                z = true;
            }
            b1Var.mo5758t();
            this.f5787k--;
        }
        this.f5786j.mo5760w(null);
        m6973w();
        return z;
    }

    /* renamed from: z */
    public C1081a mo6017z(Timeline x1Var, Object obj, long j) {
        return m6959A(x1Var, obj, j, m6960B(x1Var, obj), this.f5777a);
    }
}
