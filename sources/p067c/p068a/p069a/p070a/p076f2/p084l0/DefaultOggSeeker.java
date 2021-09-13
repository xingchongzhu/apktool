package p067c.p068a.p069a.p070a.p076f2.p084l0;

import java.io.EOFException;
import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekPoint;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.l0.b */
final class DefaultOggSeeker implements OggSeeker {

    /* renamed from: a */
    private final OggPageHeader f6511a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f6512b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f6513c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final StreamReader f6514d;

    /* renamed from: e */
    private int f6515e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f6516f;

    /* renamed from: g */
    private long f6517g;

    /* renamed from: h */
    private long f6518h;

    /* renamed from: i */
    private long f6519i;

    /* renamed from: j */
    private long f6520j;

    /* renamed from: k */
    private long f6521k;

    /* renamed from: l */
    private long f6522l;

    /* renamed from: c.a.a.a.f2.l0.b$b */
    /* compiled from: DefaultOggSeeker */
    private final class C0965b implements SeekMap {
        private C0965b() {
        }

        /* renamed from: f */
        public boolean mo6167f() {
            return true;
        }

        /* renamed from: h */
        public C1002a mo6168h(long j) {
            return new C1002a(new SeekPoint(j, Util.m10309q((DefaultOggSeeker.this.f6512b + ((DefaultOggSeeker.this.f6514d.mo6312c(j) * (DefaultOggSeeker.this.f6513c - DefaultOggSeeker.this.f6512b)) / DefaultOggSeeker.this.f6516f)) - 30000, DefaultOggSeeker.this.f6512b, DefaultOggSeeker.this.f6513c - 1)));
        }

        /* renamed from: j */
        public long mo6169j() {
            return DefaultOggSeeker.this.f6514d.mo6311b(DefaultOggSeeker.this.f6516f);
        }
    }

    public DefaultOggSeeker(StreamReader iVar, long j, long j2, long j3, long j4, boolean z) {
        Assertions.m10149a(j >= 0 && j2 > j);
        this.f6514d = iVar;
        this.f6512b = j;
        this.f6513c = j2;
        if (j3 == j2 - j || z) {
            this.f6516f = j4;
            this.f6515e = 4;
        } else {
            this.f6515e = 0;
        }
        this.f6511a = new OggPageHeader();
    }

    /* renamed from: i */
    private long m7866i(ExtractorInput kVar) throws IOException {
        if (this.f6519i == this.f6520j) {
            return -1;
        }
        long q = kVar.mo6206q();
        if (!this.f6511a.mo6310e(kVar, this.f6520j)) {
            long j = this.f6519i;
            if (j != q) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f6511a.mo6307b(kVar, false);
        kVar.mo6199h();
        long j2 = this.f6518h;
        OggPageHeader fVar = this.f6511a;
        long j3 = fVar.f6541c;
        long j4 = j2 - j3;
        int i = fVar.f6546h + fVar.f6547i;
        if (0 <= j4 && j4 < 72000) {
            return -1;
        }
        if (j4 < 0) {
            this.f6520j = q;
            this.f6522l = j3;
        } else {
            this.f6519i = kVar.mo6206q() + ((long) i);
            this.f6521k = this.f6511a.f6541c;
        }
        long j5 = this.f6520j;
        long j6 = this.f6519i;
        if (j5 - j6 < 100000) {
            this.f6520j = j6;
            return j6;
        }
        long q2 = kVar.mo6206q() - (((long) i) * (j4 <= 0 ? 2 : 1));
        long j7 = this.f6520j;
        long j8 = this.f6519i;
        return Util.m10309q(q2 + ((j4 * (j7 - j8)) / (this.f6522l - this.f6521k)), j8, j7 - 1);
    }

    /* renamed from: k */
    private void m7867k(ExtractorInput kVar) throws IOException {
        while (true) {
            this.f6511a.mo6309d(kVar);
            this.f6511a.mo6307b(kVar, false);
            OggPageHeader fVar = this.f6511a;
            if (fVar.f6541c > this.f6518h) {
                kVar.mo6199h();
                return;
            }
            kVar.mo6200i(fVar.f6546h + fVar.f6547i);
            this.f6519i = kVar.mo6206q();
            this.f6521k = this.f6511a.f6541c;
        }
    }

    /* renamed from: a */
    public long mo6293a(ExtractorInput kVar) throws IOException {
        int i = this.f6515e;
        if (i == 0) {
            long q = kVar.mo6206q();
            this.f6517g = q;
            this.f6515e = 1;
            long j = this.f6513c - 65307;
            if (j > q) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long i2 = m7866i(kVar);
                if (i2 != -1) {
                    return i2;
                }
                this.f6515e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            m7867k(kVar);
            this.f6515e = 4;
            return -(this.f6521k + 2);
        }
        this.f6516f = mo6297j(kVar);
        this.f6515e = 4;
        return this.f6517g;
    }

    /* renamed from: c */
    public void mo6295c(long j) {
        this.f6518h = Util.m10309q(j, 0, this.f6516f - 1);
        this.f6515e = 2;
        this.f6519i = this.f6512b;
        this.f6520j = this.f6513c;
        this.f6521k = 0;
        this.f6522l = this.f6516f;
    }

    /* renamed from: h */
    public C0965b mo6294b() {
        if (this.f6516f != 0) {
            return new C0965b();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public long mo6297j(ExtractorInput kVar) throws IOException {
        this.f6511a.mo6308c();
        if (this.f6511a.mo6309d(kVar)) {
            do {
                this.f6511a.mo6307b(kVar, false);
                OggPageHeader fVar = this.f6511a;
                kVar.mo6200i(fVar.f6546h + fVar.f6547i);
                OggPageHeader fVar2 = this.f6511a;
                if ((fVar2.f6540b & 4) == 4 || !fVar2.mo6309d(kVar)) {
                }
            } while (kVar.mo6206q() < this.f6513c);
            return this.f6511a.f6541c;
        }
        throw new EOFException();
    }
}
