package p067c.p068a.p069a.p070a.p076f2.p078f0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.FlacFrameReader;
import p067c.p068a.p069a.p070a.p076f2.FlacFrameReader.C0999a;
import p067c.p068a.p069a.p070a.p076f2.FlacMetadataReader;
import p067c.p068a.p069a.p070a.p076f2.FlacMetadataReader.C1000a;
import p067c.p068a.p069a.p070a.p076f2.FlacSeekTableSeekMap;
import p067c.p068a.p069a.p070a.p076f2.FlacStreamMetadata;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.f0.d */
public final class FlacExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6062a = C0924a.f6057b;

    /* renamed from: b */
    private final byte[] f6063b;

    /* renamed from: c */
    private final ParsableByteArray f6064c;

    /* renamed from: d */
    private final boolean f6065d;

    /* renamed from: e */
    private final C0999a f6066e;

    /* renamed from: f */
    private ExtractorOutput f6067f;

    /* renamed from: g */
    private C0916b0 f6068g;

    /* renamed from: h */
    private int f6069h;

    /* renamed from: i */
    private Metadata f6070i;

    /* renamed from: j */
    private FlacStreamMetadata f6071j;

    /* renamed from: k */
    private int f6072k;

    /* renamed from: l */
    private int f6073l;

    /* renamed from: m */
    private FlacBinarySearchSeeker f6074m;

    /* renamed from: n */
    private int f6075n;

    /* renamed from: o */
    private long f6076o;

    public FlacExtractor() {
        this(0);
    }

    /* renamed from: d */
    private long m7393d(ParsableByteArray a0Var, boolean z) {
        boolean z2;
        Assertions.m10153e(this.f6071j);
        int e = a0Var.mo7380e();
        while (e <= a0Var.mo7381f() - 16) {
            a0Var.mo7374P(e);
            if (FlacFrameReader.m8273d(a0Var, this.f6071j, this.f6073l, this.f6066e)) {
                a0Var.mo7374P(e);
                return this.f6066e.f6988a;
            }
            e++;
        }
        if (z) {
            while (e <= a0Var.mo7381f() - this.f6072k) {
                a0Var.mo7374P(e);
                boolean z3 = false;
                try {
                    z2 = FlacFrameReader.m8273d(a0Var, this.f6071j, this.f6073l, this.f6066e);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (a0Var.mo7380e() <= a0Var.mo7381f()) {
                    z3 = z2;
                }
                if (z3) {
                    a0Var.mo7374P(e);
                    return this.f6066e.f6988a;
                }
                e++;
            }
            a0Var.mo7374P(a0Var.mo7381f());
        } else {
            a0Var.mo7374P(e);
        }
        return -1;
    }

    /* renamed from: f */
    private void m7394f(ExtractorInput kVar) throws IOException {
        this.f6073l = FlacMetadataReader.m8281b(kVar);
        ((ExtractorOutput) Util.m10293i(this.f6067f)).mo6216f(m7395g(kVar.mo6206q(), kVar.mo6194a()));
        this.f6069h = 5;
    }

    /* renamed from: g */
    private SeekMap m7395g(long j, long j2) {
        Assertions.m10153e(this.f6071j);
        FlacStreamMetadata sVar = this.f6071j;
        if (sVar.f7002k != null) {
            return new FlacSeekTableSeekMap(sVar, j);
        }
        if (j2 == -1 || sVar.f7001j <= 0) {
            return new C1003b(sVar.mo6385g());
        }
        FlacBinarySearchSeeker cVar = new FlacBinarySearchSeeker(sVar, this.f6073l, j, j2);
        this.f6074m = cVar;
        return cVar.mo6159b();
    }

    /* renamed from: h */
    private void m7396h(ExtractorInput kVar) throws IOException {
        byte[] bArr = this.f6063b;
        kVar.mo6204o(bArr, 0, bArr.length);
        kVar.mo6199h();
        this.f6069h = 2;
    }

    /* renamed from: j */
    static /* synthetic */ Extractor[] m7397j() {
        return new Extractor[]{new FlacExtractor()};
    }

    /* renamed from: k */
    private void m7398k() {
        ((C0916b0) Util.m10293i(this.f6068g)).mo6176c((this.f6076o * 1000000) / ((long) ((FlacStreamMetadata) Util.m10293i(this.f6071j)).f6996e), 1, this.f6075n, 0, null);
    }

    /* renamed from: l */
    private int m7399l(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        boolean z;
        Assertions.m10153e(this.f6068g);
        Assertions.m10153e(this.f6071j);
        FlacBinarySearchSeeker cVar = this.f6074m;
        if (cVar != null && cVar.mo6161d()) {
            return this.f6074m.mo6160c(kVar, xVar);
        }
        if (this.f6076o == -1) {
            this.f6076o = FlacFrameReader.m8278i(kVar, this.f6071j);
            return 0;
        }
        int f = this.f6064c.mo7381f();
        if (f < 32768) {
            int b = kVar.mo6195b(this.f6064c.mo7379d(), f, 32768 - f);
            z = b == -1;
            if (!z) {
                this.f6064c.mo7373O(f + b);
            } else if (this.f6064c.mo7376a() == 0) {
                m7398k();
                return -1;
            }
        } else {
            z = false;
        }
        int e = this.f6064c.mo7380e();
        int i = this.f6075n;
        int i2 = this.f6072k;
        if (i < i2) {
            ParsableByteArray a0Var = this.f6064c;
            a0Var.mo7375Q(Math.min(i2 - i, a0Var.mo7376a()));
        }
        long d = m7393d(this.f6064c, z);
        int e2 = this.f6064c.mo7380e() - e;
        this.f6064c.mo7374P(e);
        this.f6068g.mo6174a(this.f6064c, e2);
        this.f6075n += e2;
        if (d != -1) {
            m7398k();
            this.f6075n = 0;
            this.f6076o = d;
        }
        if (this.f6064c.mo7376a() < 16) {
            int a = this.f6064c.mo7376a();
            System.arraycopy(this.f6064c.mo7379d(), this.f6064c.mo7380e(), this.f6064c.mo7379d(), 0, a);
            this.f6064c.mo7374P(0);
            this.f6064c.mo7373O(a);
        }
        return 0;
    }

    /* renamed from: m */
    private void m7400m(ExtractorInput kVar) throws IOException {
        this.f6070i = FlacMetadataReader.m8283d(kVar, !this.f6065d);
        this.f6069h = 1;
    }

    /* renamed from: n */
    private void m7401n(ExtractorInput kVar) throws IOException {
        C1000a aVar = new C1000a(this.f6071j);
        boolean z = false;
        while (!z) {
            z = FlacMetadataReader.m8284e(kVar, aVar);
            this.f6071j = (FlacStreamMetadata) Util.m10293i(aVar.f6989a);
        }
        Assertions.m10153e(this.f6071j);
        this.f6072k = Math.max(this.f6071j.f6994c, 6);
        ((C0916b0) Util.m10293i(this.f6068g)).mo6177d(this.f6071j.mo6386h(this.f6063b, this.f6070i));
        this.f6069h = 4;
    }

    /* renamed from: o */
    private void m7402o(ExtractorInput kVar) throws IOException {
        FlacMetadataReader.m8289j(kVar);
        this.f6069h = 3;
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6067f = lVar;
        this.f6068g = lVar.mo6218q(0, 1);
        lVar.mo6217h();
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f6069h = 0;
        } else {
            FlacBinarySearchSeeker cVar = this.f6074m;
            if (cVar != null) {
                cVar.mo6165h(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f6076o = j3;
        this.f6075n = 0;
        this.f6064c.mo7370L(0);
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        FlacMetadataReader.m8282c(kVar, false);
        return FlacMetadataReader.m8280a(kVar);
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        int i = this.f6069h;
        if (i == 0) {
            m7400m(kVar);
            return 0;
        } else if (i == 1) {
            m7396h(kVar);
            return 0;
        } else if (i == 2) {
            m7402o(kVar);
            return 0;
        } else if (i == 3) {
            m7401n(kVar);
            return 0;
        } else if (i == 4) {
            m7394f(kVar);
            return 0;
        } else if (i == 5) {
            return m7399l(kVar, xVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public FlacExtractor(int i) {
        this.f6063b = new byte[42];
        this.f6064c = new ParsableByteArray(new byte[32768], 0);
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f6065d = z;
        this.f6066e = new C0999a();
        this.f6069h = 0;
    }
}
