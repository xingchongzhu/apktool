package p067c.p068a.p069a.p070a.p076f2.p085m0;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: c.a.a.a.f2.m0.y */
public final class PesReader implements TsPayloadReader {

    /* renamed from: a */
    private final ElementaryStreamReader f6930a;

    /* renamed from: b */
    private final ParsableBitArray f6931b = new ParsableBitArray(new byte[10]);

    /* renamed from: c */
    private int f6932c = 0;

    /* renamed from: d */
    private int f6933d;

    /* renamed from: e */
    private TimestampAdjuster f6934e;

    /* renamed from: f */
    private boolean f6935f;

    /* renamed from: g */
    private boolean f6936g;

    /* renamed from: h */
    private boolean f6937h;

    /* renamed from: i */
    private int f6938i;

    /* renamed from: j */
    private int f6939j;

    /* renamed from: k */
    private boolean f6940k;

    /* renamed from: l */
    private long f6941l;

    public PesReader(ElementaryStreamReader oVar) {
        this.f6930a = oVar;
    }

    /* renamed from: d */
    private boolean m8222d(ParsableByteArray a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo7376a(), i - this.f6933d);
        boolean z = true;
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.mo7375Q(min);
        } else {
            a0Var.mo7385j(bArr, this.f6933d, min);
        }
        int i2 = this.f6933d + min;
        this.f6933d = i2;
        if (i2 != i) {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    private boolean m8223e() {
        this.f6931b.mo7503p(0);
        int h = this.f6931b.mo7495h(24);
        String str = "PesReader";
        if (h != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected start code prefix: ");
            sb.append(h);
            Log.m10386h(str, sb.toString());
            this.f6939j = -1;
            return false;
        }
        this.f6931b.mo7505r(8);
        int h2 = this.f6931b.mo7495h(16);
        this.f6931b.mo7505r(5);
        this.f6940k = this.f6931b.mo7494g();
        this.f6931b.mo7505r(2);
        this.f6935f = this.f6931b.mo7494g();
        this.f6936g = this.f6931b.mo7494g();
        this.f6931b.mo7505r(6);
        int h3 = this.f6931b.mo7495h(8);
        this.f6938i = h3;
        if (h2 == 0) {
            this.f6939j = -1;
        } else {
            int i = ((h2 + 6) - 9) - h3;
            this.f6939j = i;
            if (i < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Found negative packet payload size: ");
                sb2.append(this.f6939j);
                Log.m10386h(str, sb2.toString());
                this.f6939j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    /* renamed from: f */
    private void m8224f() {
        this.f6931b.mo7503p(0);
        this.f6941l = -9223372036854775807L;
        if (this.f6935f) {
            this.f6931b.mo7505r(4);
            long h = ((long) this.f6931b.mo7495h(3)) << 30;
            this.f6931b.mo7505r(1);
            long h2 = h | ((long) (this.f6931b.mo7495h(15) << 15));
            this.f6931b.mo7505r(1);
            long h3 = h2 | ((long) this.f6931b.mo7495h(15));
            this.f6931b.mo7505r(1);
            if (!this.f6937h && this.f6936g) {
                this.f6931b.mo7505r(4);
                long h4 = ((long) this.f6931b.mo7495h(3)) << 30;
                this.f6931b.mo7505r(1);
                long h5 = h4 | ((long) (this.f6931b.mo7495h(15) << 15));
                this.f6931b.mo7505r(1);
                long h6 = h5 | ((long) this.f6931b.mo7495h(15));
                this.f6931b.mo7505r(1);
                this.f6934e.mo7447b(h6);
                this.f6937h = true;
            }
            this.f6941l = this.f6934e.mo7447b(h3);
        }
    }

    /* renamed from: g */
    private void m8225g(int i) {
        this.f6932c = i;
        this.f6933d = 0;
    }

    /* renamed from: a */
    public final void mo6326a() {
        this.f6932c = 0;
        this.f6933d = 0;
        this.f6937h = false;
        this.f6930a.mo6331a();
    }

    /* renamed from: b */
    public void mo6327b(TimestampAdjuster j0Var, ExtractorOutput lVar, C0983d dVar) {
        this.f6934e = j0Var;
        this.f6930a.mo6335f(lVar, dVar);
    }

    /* renamed from: c */
    public final void mo6328c(ParsableByteArray a0Var, int i) throws ParserException {
        Assertions.m10156h(this.f6934e);
        if ((i & 1) != 0) {
            int i2 = this.f6932c;
            if (!(i2 == 0 || i2 == 1)) {
                String str = "PesReader";
                if (i2 == 2) {
                    Log.m10386h(str, "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.f6939j != -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(this.f6939j);
                        sb.append(" more bytes");
                        Log.m10386h(str, sb.toString());
                    }
                    this.f6930a.mo6333d();
                } else {
                    throw new IllegalStateException();
                }
            }
            m8225g(1);
        }
        while (a0Var.mo7376a() > 0) {
            int i3 = this.f6932c;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (m8222d(a0Var, this.f6931b.f8462a, Math.min(10, this.f6938i)) && m8222d(a0Var, null, this.f6938i)) {
                            m8224f();
                            if (this.f6940k) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.f6930a.mo6334e(this.f6941l, i);
                            m8225g(3);
                        }
                    } else if (i3 == 3) {
                        int a = a0Var.mo7376a();
                        int i5 = this.f6939j;
                        if (i5 != -1) {
                            i4 = a - i5;
                        }
                        if (i4 > 0) {
                            a -= i4;
                            a0Var.mo7373O(a0Var.mo7380e() + a);
                        }
                        this.f6930a.mo6332c(a0Var);
                        int i6 = this.f6939j;
                        if (i6 != -1) {
                            int i7 = i6 - a;
                            this.f6939j = i7;
                            if (i7 == 0) {
                                this.f6930a.mo6333d();
                                m8225g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m8222d(a0Var, this.f6931b.f8462a, 9)) {
                    if (m8223e()) {
                        i4 = 2;
                    }
                    m8225g(i4);
                }
            } else {
                a0Var.mo7375Q(a0Var.mo7376a());
            }
        }
    }
}
