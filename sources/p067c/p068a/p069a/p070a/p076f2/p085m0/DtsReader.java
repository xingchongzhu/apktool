package p067c.p068a.p069a.p070a.p076f2.p085m0;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p072b2.DtsUtil;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.m */
public final class DtsReader implements ElementaryStreamReader {

    /* renamed from: a */
    private final ParsableByteArray f6742a = new ParsableByteArray(new byte[18]);

    /* renamed from: b */
    private final String f6743b;

    /* renamed from: c */
    private String f6744c;

    /* renamed from: d */
    private C0916b0 f6745d;

    /* renamed from: e */
    private int f6746e = 0;

    /* renamed from: f */
    private int f6747f;

    /* renamed from: g */
    private int f6748g;

    /* renamed from: h */
    private long f6749h;

    /* renamed from: i */
    private Format f6750i;

    /* renamed from: j */
    private int f6751j;

    /* renamed from: k */
    private long f6752k;

    public DtsReader(String str) {
        this.f6743b = str;
    }

    /* renamed from: b */
    private boolean m8105b(ParsableByteArray a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo7376a(), i - this.f6747f);
        a0Var.mo7385j(bArr, this.f6747f, min);
        int i2 = this.f6747f + min;
        this.f6747f = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m8106g() {
        byte[] d = this.f6742a.mo7379d();
        if (this.f6750i == null) {
            Format g = DtsUtil.m6881g(d, this.f6744c, this.f6743b, null);
            this.f6750i = g;
            this.f6745d.mo6177d(g);
        }
        this.f6751j = DtsUtil.m6875a(d);
        this.f6749h = (long) ((int) ((((long) DtsUtil.m6880f(d)) * 1000000) / ((long) this.f6750i.f8828z)));
    }

    /* renamed from: h */
    private boolean m8107h(ParsableByteArray a0Var) {
        while (a0Var.mo7376a() > 0) {
            int i = this.f6748g << 8;
            this.f6748g = i;
            int D = i | a0Var.mo7362D();
            this.f6748g = D;
            if (DtsUtil.m6878d(D)) {
                byte[] d = this.f6742a.mo7379d();
                int i2 = this.f6748g;
                d[0] = (byte) ((i2 >> 24) & 255);
                d[1] = (byte) ((i2 >> 16) & 255);
                d[2] = (byte) ((i2 >> 8) & 255);
                d[3] = (byte) (i2 & 255);
                this.f6747f = 4;
                this.f6748g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo6331a() {
        this.f6746e = 0;
        this.f6747f = 0;
        this.f6748g = 0;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        Assertions.m10156h(this.f6745d);
        while (a0Var.mo7376a() > 0) {
            int i = this.f6746e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(a0Var.mo7376a(), this.f6751j - this.f6747f);
                        this.f6745d.mo6174a(a0Var, min);
                        int i2 = this.f6747f + min;
                        this.f6747f = i2;
                        int i3 = this.f6751j;
                        if (i2 == i3) {
                            this.f6745d.mo6176c(this.f6752k, 1, i3, 0, null);
                            this.f6752k += this.f6749h;
                            this.f6746e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m8105b(a0Var, this.f6742a.mo7379d(), 18)) {
                    m8106g();
                    this.f6742a.mo7374P(0);
                    this.f6745d.mo6174a(this.f6742a, 18);
                    this.f6746e = 2;
                }
            } else if (m8107h(a0Var)) {
                this.f6746e = 1;
            }
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6752k = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6744c = dVar.mo6343b();
        this.f6745d = lVar.mo6218q(dVar.mo6344c(), 1);
    }
}
