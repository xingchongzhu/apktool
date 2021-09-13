package p067c.p068a.p069a.p070a.p076f2.p082j0;

import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekPoint;
import p067c.p068a.p069a.p070a.p111m2.LongArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.j0.d */
final class IndexSeeker implements Seeker {

    /* renamed from: a */
    private final long f6290a;

    /* renamed from: b */
    private final LongArray f6291b;

    /* renamed from: c */
    private final LongArray f6292c;

    /* renamed from: d */
    private long f6293d;

    public IndexSeeker(long j, long j2, long j3) {
        this.f6293d = j;
        this.f6290a = j3;
        LongArray uVar = new LongArray();
        this.f6291b = uVar;
        LongArray uVar2 = new LongArray();
        this.f6292c = uVar2;
        uVar.mo7481a(0);
        uVar2.mo7481a(j2);
    }

    /* renamed from: a */
    public boolean mo6254a(long j) {
        LongArray uVar = this.f6291b;
        return j - uVar.mo7482b(uVar.mo7483c() - 1) < 100000;
    }

    /* renamed from: b */
    public void mo6255b(long j, long j2) {
        if (!mo6254a(j)) {
            this.f6291b.mo7481a(j);
            this.f6292c.mo7481a(j2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6256c(long j) {
        this.f6293d = j;
    }

    /* renamed from: d */
    public long mo6252d() {
        return this.f6290a;
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return true;
    }

    /* renamed from: g */
    public long mo6253g(long j) {
        return this.f6291b.mo7482b(Util.m10285e(this.f6292c, j, true, true));
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        int e = Util.m10285e(this.f6291b, j, true, true);
        SeekPoint zVar = new SeekPoint(this.f6291b.mo7482b(e), this.f6292c.mo7482b(e));
        if (zVar.f7021b == j || e == this.f6291b.mo7483c() - 1) {
            return new C1002a(zVar);
        }
        int i = e + 1;
        return new C1002a(zVar, new SeekPoint(this.f6291b.mo7482b(i), this.f6292c.mo7482b(i)));
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6293d;
    }
}
