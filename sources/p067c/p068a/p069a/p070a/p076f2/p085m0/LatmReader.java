package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p072b2.AacUtil;
import p067c.p068a.p069a.p070a.p072b2.AacUtil.C0824b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.u */
public final class LatmReader implements ElementaryStreamReader {

    /* renamed from: a */
    private final String f6889a;

    /* renamed from: b */
    private final ParsableByteArray f6890b;

    /* renamed from: c */
    private final ParsableBitArray f6891c;

    /* renamed from: d */
    private C0916b0 f6892d;

    /* renamed from: e */
    private String f6893e;

    /* renamed from: f */
    private Format f6894f;

    /* renamed from: g */
    private int f6895g;

    /* renamed from: h */
    private int f6896h;

    /* renamed from: i */
    private int f6897i;

    /* renamed from: j */
    private int f6898j;

    /* renamed from: k */
    private long f6899k;

    /* renamed from: l */
    private boolean f6900l;

    /* renamed from: m */
    private int f6901m;

    /* renamed from: n */
    private int f6902n;

    /* renamed from: o */
    private int f6903o;

    /* renamed from: p */
    private boolean f6904p;

    /* renamed from: q */
    private long f6905q;

    /* renamed from: r */
    private int f6906r;

    /* renamed from: s */
    private long f6907s;

    /* renamed from: t */
    private int f6908t;

    /* renamed from: u */
    private String f6909u;

    public LatmReader(String str) {
        this.f6889a = str;
        ParsableByteArray a0Var = new ParsableByteArray(1024);
        this.f6890b = a0Var;
        this.f6891c = new ParsableBitArray(a0Var.mo7379d());
    }

    /* renamed from: b */
    private static long m8193b(ParsableBitArray zVar) {
        return (long) zVar.mo7495h((zVar.mo7495h(2) + 1) * 8);
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m8194g(ParsableBitArray zVar) throws ParserException {
        if (!zVar.mo7494g()) {
            this.f6900l = true;
            m8199l(zVar);
        } else if (!this.f6900l) {
            return;
        }
        if (this.f6901m != 0) {
            throw new ParserException();
        } else if (this.f6902n == 0) {
            m8198k(zVar, m8197j(zVar));
            if (this.f6904p) {
                zVar.mo7505r((int) this.f6905q);
            }
        } else {
            throw new ParserException();
        }
    }

    /* renamed from: h */
    private int m8195h(ParsableBitArray zVar) throws ParserException {
        int b = zVar.mo7489b();
        C0824b e = AacUtil.m6622e(zVar, true);
        this.f6909u = e.f5523c;
        this.f6906r = e.f5521a;
        this.f6908t = e.f5522b;
        return b - zVar.mo7489b();
    }

    /* renamed from: i */
    private void m8196i(ParsableBitArray zVar) {
        int h = zVar.mo7495h(3);
        this.f6903o = h;
        if (h == 0) {
            zVar.mo7505r(8);
        } else if (h == 1) {
            zVar.mo7505r(9);
        } else if (h == 3 || h == 4 || h == 5) {
            zVar.mo7505r(6);
        } else if (h == 6 || h == 7) {
            zVar.mo7505r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    private int m8197j(ParsableBitArray zVar) throws ParserException {
        int h;
        if (this.f6903o == 0) {
            int i = 0;
            do {
                h = zVar.mo7495h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw new ParserException();
    }

    @RequiresNonNull({"output"})
    /* renamed from: k */
    private void m8198k(ParsableBitArray zVar, int i) {
        int e = zVar.mo7492e();
        if ((e & 7) == 0) {
            this.f6890b.mo7374P(e >> 3);
        } else {
            zVar.mo7496i(this.f6890b.mo7379d(), 0, i * 8);
            this.f6890b.mo7374P(0);
        }
        this.f6892d.mo6174a(this.f6890b, i);
        this.f6892d.mo6176c(this.f6899k, 1, i, 0, null);
        this.f6899k += this.f6907s;
    }

    @RequiresNonNull({"output"})
    /* renamed from: l */
    private void m8199l(ParsableBitArray zVar) throws ParserException {
        boolean g;
        int h = zVar.mo7495h(1);
        int h2 = h == 1 ? zVar.mo7495h(1) : 0;
        this.f6901m = h2;
        if (h2 == 0) {
            if (h == 1) {
                m8193b(zVar);
            }
            if (zVar.mo7494g()) {
                this.f6902n = zVar.mo7495h(6);
                int h3 = zVar.mo7495h(4);
                int h4 = zVar.mo7495h(3);
                if (h3 == 0 && h4 == 0) {
                    if (h == 0) {
                        int e = zVar.mo7492e();
                        int h5 = m8195h(zVar);
                        zVar.mo7503p(e);
                        byte[] bArr = new byte[((h5 + 7) / 8)];
                        zVar.mo7496i(bArr, 0, h5);
                        Format E = new C1245b().mo7693S(this.f6893e).mo7705e0("audio/mp4a-latm").mo7683I(this.f6909u).mo7682H(this.f6908t).mo7706f0(this.f6906r).mo7694T(Collections.singletonList(bArr)).mo7696V(this.f6889a).mo7679E();
                        if (!E.equals(this.f6894f)) {
                            this.f6894f = E;
                            this.f6907s = 1024000000 / ((long) E.f8828z);
                            this.f6892d.mo6177d(E);
                        }
                    } else {
                        zVar.mo7505r(((int) m8193b(zVar)) - m8195h(zVar));
                    }
                    m8196i(zVar);
                    boolean g2 = zVar.mo7494g();
                    this.f6904p = g2;
                    this.f6905q = 0;
                    if (g2) {
                        if (h == 1) {
                            this.f6905q = m8193b(zVar);
                        } else {
                            do {
                                g = zVar.mo7494g();
                                this.f6905q = (this.f6905q << 8) + ((long) zVar.mo7495h(8));
                            } while (g);
                        }
                    }
                    if (zVar.mo7494g()) {
                        zVar.mo7505r(8);
                        return;
                    }
                    return;
                }
                throw new ParserException();
            }
            throw new ParserException();
        }
        throw new ParserException();
    }

    /* renamed from: m */
    private void m8200m(int i) {
        this.f6890b.mo7370L(i);
        this.f6891c.mo7501n(this.f6890b.mo7379d());
    }

    /* renamed from: a */
    public void mo6331a() {
        this.f6895g = 0;
        this.f6900l = false;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) throws ParserException {
        Assertions.m10156h(this.f6892d);
        while (a0Var.mo7376a() > 0) {
            int i = this.f6895g;
            if (i != 0) {
                if (i == 1) {
                    int D = a0Var.mo7362D();
                    if ((D & 224) == 224) {
                        this.f6898j = D;
                        this.f6895g = 2;
                    } else if (D != 86) {
                        this.f6895g = 0;
                    }
                } else if (i == 2) {
                    int D2 = ((this.f6898j & -225) << 8) | a0Var.mo7362D();
                    this.f6897i = D2;
                    if (D2 > this.f6890b.mo7379d().length) {
                        m8200m(this.f6897i);
                    }
                    this.f6896h = 0;
                    this.f6895g = 3;
                } else if (i == 3) {
                    int min = Math.min(a0Var.mo7376a(), this.f6897i - this.f6896h);
                    a0Var.mo7385j(this.f6891c.f8462a, this.f6896h, min);
                    int i2 = this.f6896h + min;
                    this.f6896h = i2;
                    if (i2 == this.f6897i) {
                        this.f6891c.mo7503p(0);
                        m8194g(this.f6891c);
                        this.f6895g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (a0Var.mo7362D() == 86) {
                this.f6895g = 1;
            }
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6899k = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6892d = lVar.mo6218q(dVar.mo6344c(), 1);
        this.f6893e = dVar.mo6343b();
    }
}
