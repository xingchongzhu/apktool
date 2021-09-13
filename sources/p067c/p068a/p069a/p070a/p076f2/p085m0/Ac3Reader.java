package p067c.p068a.p069a.p070a.p076f2.p085m0;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p072b2.Ac3Util;
import p067c.p068a.p069a.p070a.p072b2.Ac3Util.C0826b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.g */
public final class Ac3Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private final ParsableBitArray f6626a;

    /* renamed from: b */
    private final ParsableByteArray f6627b;

    /* renamed from: c */
    private final String f6628c;

    /* renamed from: d */
    private String f6629d;

    /* renamed from: e */
    private C0916b0 f6630e;

    /* renamed from: f */
    private int f6631f;

    /* renamed from: g */
    private int f6632g;

    /* renamed from: h */
    private boolean f6633h;

    /* renamed from: i */
    private long f6634i;

    /* renamed from: j */
    private Format f6635j;

    /* renamed from: k */
    private int f6636k;

    /* renamed from: l */
    private long f6637l;

    public Ac3Reader() {
        this(null);
    }

    /* renamed from: b */
    private boolean m7989b(ParsableByteArray a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo7376a(), i - this.f6632g);
        a0Var.mo7385j(bArr, this.f6632g, min);
        int i2 = this.f6632g + min;
        this.f6632g = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m7990g() {
        this.f6626a.mo7503p(0);
        C0826b e = Ac3Util.m6629e(this.f6626a);
        Format u0Var = this.f6635j;
        if (u0Var == null || e.f5533d != u0Var.f8827y || e.f5532c != u0Var.f8828z || !Util.m10279b(e.f5530a, u0Var.f8814l)) {
            Format E = new C1245b().mo7693S(this.f6629d).mo7705e0(e.f5530a).mo7682H(e.f5533d).mo7706f0(e.f5532c).mo7696V(this.f6628c).mo7679E();
            this.f6635j = E;
            this.f6630e.mo6177d(E);
        }
        this.f6636k = e.f5534e;
        this.f6634i = (((long) e.f5535f) * 1000000) / ((long) this.f6635j.f8828z);
    }

    /* renamed from: h */
    private boolean m7991h(ParsableByteArray a0Var) {
        while (true) {
            boolean z = false;
            if (a0Var.mo7376a() <= 0) {
                return false;
            }
            if (!this.f6633h) {
                if (a0Var.mo7362D() == 11) {
                    z = true;
                }
                this.f6633h = z;
            } else {
                int D = a0Var.mo7362D();
                if (D == 119) {
                    this.f6633h = false;
                    return true;
                }
                if (D == 11) {
                    z = true;
                }
                this.f6633h = z;
            }
        }
    }

    /* renamed from: a */
    public void mo6331a() {
        this.f6631f = 0;
        this.f6632g = 0;
        this.f6633h = false;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        Assertions.m10156h(this.f6630e);
        while (a0Var.mo7376a() > 0) {
            int i = this.f6631f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(a0Var.mo7376a(), this.f6636k - this.f6632g);
                        this.f6630e.mo6174a(a0Var, min);
                        int i2 = this.f6632g + min;
                        this.f6632g = i2;
                        int i3 = this.f6636k;
                        if (i2 == i3) {
                            this.f6630e.mo6176c(this.f6637l, 1, i3, 0, null);
                            this.f6637l += this.f6634i;
                            this.f6631f = 0;
                        }
                    }
                } else if (m7989b(a0Var, this.f6627b.mo7379d(), 128)) {
                    m7990g();
                    this.f6627b.mo7374P(0);
                    this.f6630e.mo6174a(this.f6627b, 128);
                    this.f6631f = 2;
                }
            } else if (m7991h(a0Var)) {
                this.f6631f = 1;
                this.f6627b.mo7379d()[0] = 11;
                this.f6627b.mo7379d()[1] = 119;
                this.f6632g = 2;
            }
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6637l = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6629d = dVar.mo6343b();
        this.f6630e = lVar.mo6218q(dVar.mo6344c(), 1);
    }

    public Ac3Reader(String str) {
        ParsableBitArray zVar = new ParsableBitArray(new byte[128]);
        this.f6626a = zVar;
        this.f6627b = new ParsableByteArray(zVar.f8462a);
        this.f6631f = 0;
        this.f6628c = str;
    }
}
