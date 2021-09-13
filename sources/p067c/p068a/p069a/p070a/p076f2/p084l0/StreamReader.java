package p067c.p068a.p069a.p070a.p076f2.p084l0;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.l0.i */
abstract class StreamReader {

    /* renamed from: a */
    private final OggPacket f6552a = new OggPacket();

    /* renamed from: b */
    private C0916b0 f6553b;

    /* renamed from: c */
    private ExtractorOutput f6554c;

    /* renamed from: d */
    private OggSeeker f6555d;

    /* renamed from: e */
    private long f6556e;

    /* renamed from: f */
    private long f6557f;

    /* renamed from: g */
    private long f6558g;

    /* renamed from: h */
    private int f6559h;

    /* renamed from: i */
    private int f6560i;

    /* renamed from: j */
    private C0968b f6561j = new C0968b();

    /* renamed from: k */
    private long f6562k;

    /* renamed from: l */
    private boolean f6563l;

    /* renamed from: m */
    private boolean f6564m;

    /* renamed from: c.a.a.a.f2.l0.i$b */
    /* compiled from: StreamReader */
    static class C0968b {

        /* renamed from: a */
        Format f6565a;

        /* renamed from: b */
        OggSeeker f6566b;

        C0968b() {
        }
    }

    /* renamed from: c.a.a.a.f2.l0.i$c */
    /* compiled from: StreamReader */
    private static final class C0969c implements OggSeeker {
        private C0969c() {
        }

        /* renamed from: a */
        public long mo6293a(ExtractorInput kVar) {
            return -1;
        }

        /* renamed from: b */
        public SeekMap mo6294b() {
            return new C1003b(-9223372036854775807L);
        }

        /* renamed from: c */
        public void mo6295c(long j) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    /* renamed from: a */
    private void m7913a() {
        Assertions.m10156h(this.f6553b);
        Util.m10293i(this.f6554c);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    /* renamed from: h */
    private boolean m7914h(ExtractorInput kVar) throws IOException {
        while (this.f6552a.mo6304d(kVar)) {
            this.f6562k = kVar.mo6206q() - this.f6557f;
            if (!mo6299i(this.f6552a.mo6303c(), this.f6557f, this.f6561j)) {
                return true;
            }
            this.f6557f = kVar.mo6206q();
        }
        this.f6559h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: j */
    private int m7915j(ExtractorInput kVar) throws IOException {
        if (!m7914h(kVar)) {
            return -1;
        }
        Format u0Var = this.f6561j.f6565a;
        this.f6560i = u0Var.f8828z;
        if (!this.f6564m) {
            this.f6553b.mo6177d(u0Var);
            this.f6564m = true;
        }
        OggSeeker gVar = this.f6561j.f6566b;
        if (gVar != null) {
            this.f6555d = gVar;
        } else if (kVar.mo6194a() == -1) {
            this.f6555d = new C0969c();
        } else {
            OggPageHeader b = this.f6552a.mo6302b();
            DefaultOggSeeker bVar = new DefaultOggSeeker(this, this.f6557f, kVar.mo6194a(), (long) (b.f6546h + b.f6547i), b.f6541c, (b.f6540b & 4) != 0);
            this.f6555d = bVar;
        }
        this.f6559h = 2;
        this.f6552a.mo6306f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /* renamed from: k */
    private int m7916k(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        ExtractorInput kVar2 = kVar;
        long a = this.f6555d.mo6293a(kVar2);
        if (a >= 0) {
            xVar.f7015a = a;
            return 1;
        }
        if (a < -1) {
            mo6314e(-(a + 2));
        }
        if (!this.f6563l) {
            this.f6554c.mo6216f((SeekMap) Assertions.m10156h(this.f6555d.mo6294b()));
            this.f6563l = true;
        }
        if (this.f6562k > 0 || this.f6552a.mo6304d(kVar2)) {
            this.f6562k = 0;
            ParsableByteArray c = this.f6552a.mo6303c();
            long f = mo6298f(c);
            if (f >= 0) {
                long j = this.f6558g;
                if (j + f >= this.f6556e) {
                    long b = mo6311b(j);
                    this.f6553b.mo6174a(c, c.mo7381f());
                    this.f6553b.mo6176c(b, 1, c.mo7381f(), 0, null);
                    this.f6556e = -1;
                }
            }
            this.f6558g += f;
            return 0;
        }
        this.f6559h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo6311b(long j) {
        return (j * 1000000) / ((long) this.f6560i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo6312c(long j) {
        return (((long) this.f6560i) * j) / 1000000;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo6313d(ExtractorOutput lVar, C0916b0 b0Var) {
        this.f6554c = lVar;
        this.f6553b = b0Var;
        mo6300l(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo6314e(long j) {
        this.f6558g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract long mo6298f(ParsableByteArray a0Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo6315g(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        m7913a();
        int i = this.f6559h;
        if (i == 0) {
            return m7915j(kVar);
        }
        if (i == 1) {
            kVar.mo6200i((int) this.f6557f);
            this.f6559h = 2;
            return 0;
        } else if (i == 2) {
            Util.m10293i(this.f6555d);
            return m7916k(kVar, xVar);
        } else if (i == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public abstract boolean mo6299i(ParsableByteArray a0Var, long j, C0968b bVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6300l(boolean z) {
        if (z) {
            this.f6561j = new C0968b();
            this.f6557f = 0;
            this.f6559h = 0;
        } else {
            this.f6559h = 1;
        }
        this.f6556e = -1;
        this.f6558g = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo6316m(long j, long j2) {
        this.f6552a.mo6305e();
        if (j == 0) {
            mo6300l(!this.f6563l);
        } else if (this.f6559h != 0) {
            this.f6556e = mo6312c(j2);
            ((OggSeeker) Util.m10293i(this.f6555d)).mo6295c(this.f6556e);
            this.f6559h = 2;
        }
    }
}
