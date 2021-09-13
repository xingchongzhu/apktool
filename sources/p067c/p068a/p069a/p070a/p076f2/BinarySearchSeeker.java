package p067c.p068a.p069a.p070a.p076f2;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.b */
public abstract class BinarySearchSeeker {

    /* renamed from: a */
    protected final C0910a f5970a;

    /* renamed from: b */
    protected final C0915f f5971b;

    /* renamed from: c */
    protected C0912c f5972c;

    /* renamed from: d */
    private final int f5973d;

    /* renamed from: c.a.a.a.f2.b$a */
    /* compiled from: BinarySearchSeeker */
    public static class C0910a implements SeekMap {

        /* renamed from: a */
        private final C0913d f5974a;

        /* renamed from: b */
        private final long f5975b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f5976c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f5977d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long f5978e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final long f5979f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final long f5980g;

        public C0910a(C0913d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f5974a = dVar;
            this.f5975b = j;
            this.f5976c = j2;
            this.f5977d = j3;
            this.f5978e = j4;
            this.f5979f = j5;
            this.f5980g = j6;
        }

        /* renamed from: f */
        public boolean mo6167f() {
            return true;
        }

        /* renamed from: h */
        public C1002a mo6168h(long j) {
            return new C1002a(new SeekPoint(j, C0912c.m7311h(this.f5974a.mo6171a(j), this.f5976c, this.f5977d, this.f5978e, this.f5979f, this.f5980g)));
        }

        /* renamed from: j */
        public long mo6169j() {
            return this.f5975b;
        }

        /* renamed from: k */
        public long mo6170k(long j) {
            return this.f5974a.mo6171a(j);
        }
    }

    /* renamed from: c.a.a.a.f2.b$b */
    /* compiled from: BinarySearchSeeker */
    public static final class C0911b implements C0913d {
        /* renamed from: a */
        public long mo6171a(long j) {
            return j;
        }
    }

    /* renamed from: c.a.a.a.f2.b$c */
    /* compiled from: BinarySearchSeeker */
    protected static class C0912c {

        /* renamed from: a */
        private final long f5981a;

        /* renamed from: b */
        private final long f5982b;

        /* renamed from: c */
        private final long f5983c;

        /* renamed from: d */
        private long f5984d;

        /* renamed from: e */
        private long f5985e;

        /* renamed from: f */
        private long f5986f;

        /* renamed from: g */
        private long f5987g;

        /* renamed from: h */
        private long f5988h;

        protected C0912c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f5981a = j;
            this.f5982b = j2;
            this.f5984d = j3;
            this.f5985e = j4;
            this.f5986f = j5;
            this.f5987g = j6;
            this.f5983c = j7;
            this.f5988h = m7311h(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: h */
        protected static long m7311h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return Util.m10309q(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public long m7312i() {
            return this.f5987g;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public long m7313j() {
            return this.f5986f;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public long m7314k() {
            return this.f5988h;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public long m7315l() {
            return this.f5981a;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public long m7316m() {
            return this.f5982b;
        }

        /* renamed from: n */
        private void m7317n() {
            this.f5988h = m7311h(this.f5982b, this.f5984d, this.f5985e, this.f5986f, this.f5987g, this.f5983c);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public void m7318o(long j, long j2) {
            this.f5985e = j;
            this.f5987g = j2;
            m7317n();
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public void m7319p(long j, long j2) {
            this.f5984d = j;
            this.f5986f = j2;
            m7317n();
        }
    }

    /* renamed from: c.a.a.a.f2.b$d */
    /* compiled from: BinarySearchSeeker */
    protected interface C0913d {
        /* renamed from: a */
        long mo6171a(long j);
    }

    /* renamed from: c.a.a.a.f2.b$e */
    /* compiled from: BinarySearchSeeker */
    public static final class C0914e {

        /* renamed from: a */
        public static final C0914e f5989a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f5990b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f5991c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f5992d;

        static {
            C0914e eVar = new C0914e(-3, -9223372036854775807L, -1);
            f5989a = eVar;
        }

        private C0914e(int i, long j, long j2) {
            this.f5990b = i;
            this.f5991c = j;
            this.f5992d = j2;
        }

        /* renamed from: d */
        public static C0914e m7324d(long j, long j2) {
            C0914e eVar = new C0914e(-1, j, j2);
            return eVar;
        }

        /* renamed from: e */
        public static C0914e m7325e(long j) {
            C0914e eVar = new C0914e(0, -9223372036854775807L, j);
            return eVar;
        }

        /* renamed from: f */
        public static C0914e m7326f(long j, long j2) {
            C0914e eVar = new C0914e(-2, j, j2);
            return eVar;
        }
    }

    /* renamed from: c.a.a.a.f2.b$f */
    /* compiled from: BinarySearchSeeker */
    protected interface C0915f {
        /* renamed from: a */
        void mo6172a();

        /* renamed from: b */
        C0914e mo6173b(ExtractorInput kVar, long j) throws IOException;
    }

    protected BinarySearchSeeker(C0913d dVar, C0915f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f5971b = fVar;
        this.f5973d = i;
        C0910a aVar = new C0910a(dVar, j, j2, j3, j4, j5, j6);
        this.f5970a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0912c mo6158a(long j) {
        long j2 = j;
        C0912c cVar = new C0912c(j2, this.f5970a.mo6170k(j2), this.f5970a.f5976c, this.f5970a.f5977d, this.f5970a.f5978e, this.f5970a.f5979f, this.f5970a.f5980g);
        return cVar;
    }

    /* renamed from: b */
    public final SeekMap mo6159b() {
        return this.f5970a;
    }

    /* renamed from: c */
    public int mo6160c(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        while (true) {
            C0912c cVar = (C0912c) Assertions.m10156h(this.f5972c);
            long b = cVar.m7313j();
            long c = cVar.m7312i();
            long d = cVar.m7314k();
            if (c - b <= ((long) this.f5973d)) {
                mo6162e(false, b);
                return mo6164g(kVar, b, xVar);
            } else if (!mo6166i(kVar, d)) {
                return mo6164g(kVar, d, xVar);
            } else {
                kVar.mo6199h();
                C0914e b2 = this.f5971b.mo6173b(kVar, cVar.m7316m());
                int a = b2.f5990b;
                if (a == -3) {
                    mo6162e(false, d);
                    return mo6164g(kVar, d, xVar);
                } else if (a == -2) {
                    cVar.m7319p(b2.f5991c, b2.f5992d);
                } else if (a == -1) {
                    cVar.m7318o(b2.f5991c, b2.f5992d);
                } else if (a == 0) {
                    mo6166i(kVar, b2.f5992d);
                    mo6162e(true, b2.f5992d);
                    return mo6164g(kVar, b2.f5992d, xVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo6161d() {
        return this.f5972c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo6162e(boolean z, long j) {
        this.f5972c = null;
        this.f5971b.mo6172a();
        mo6163f(z, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo6163f(boolean z, long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo6164g(ExtractorInput kVar, long j, PositionHolder xVar) {
        if (j == kVar.mo6206q()) {
            return 0;
        }
        xVar.f7015a = j;
        return 1;
    }

    /* renamed from: h */
    public final void mo6165h(long j) {
        C0912c cVar = this.f5972c;
        if (cVar == null || cVar.m7315l() != j) {
            this.f5972c = mo6158a(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo6166i(ExtractorInput kVar, long j) throws IOException {
        long q = j - kVar.mo6206q();
        if (q < 0 || q > 262144) {
            return false;
        }
        kVar.mo6200i((int) q);
        return true;
    }
}
