package p067c.p068a.p069a.p070a.p076f2.p085m0;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p072b2.MpegAudioUtil.C0815a;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.v */
public final class MpegAudioReader implements ElementaryStreamReader {

    /* renamed from: a */
    private final ParsableByteArray f6910a;

    /* renamed from: b */
    private final C0815a f6911b;

    /* renamed from: c */
    private final String f6912c;

    /* renamed from: d */
    private C0916b0 f6913d;

    /* renamed from: e */
    private String f6914e;

    /* renamed from: f */
    private int f6915f;

    /* renamed from: g */
    private int f6916g;

    /* renamed from: h */
    private boolean f6917h;

    /* renamed from: i */
    private boolean f6918i;

    /* renamed from: j */
    private long f6919j;

    /* renamed from: k */
    private int f6920k;

    /* renamed from: l */
    private long f6921l;

    public MpegAudioReader() {
        this(null);
    }

    /* renamed from: b */
    private void m8206b(ParsableByteArray a0Var) {
        byte[] d = a0Var.mo7379d();
        int f = a0Var.mo7381f();
        for (int e = a0Var.mo7380e(); e < f; e++) {
            boolean z = (d[e] & 255) == 255;
            boolean z2 = this.f6918i && (d[e] & 224) == 224;
            this.f6918i = z;
            if (z2) {
                a0Var.mo7374P(e + 1);
                this.f6918i = false;
                this.f6910a.mo7379d()[1] = d[e];
                this.f6916g = 2;
                this.f6915f = 1;
                return;
            }
        }
        a0Var.mo7374P(f);
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m8207g(ParsableByteArray a0Var) {
        int min = Math.min(a0Var.mo7376a(), this.f6920k - this.f6916g);
        this.f6913d.mo6174a(a0Var, min);
        int i = this.f6916g + min;
        this.f6916g = i;
        int i2 = this.f6920k;
        if (i >= i2) {
            this.f6913d.mo6176c(this.f6921l, 1, i2, 0, null);
            this.f6921l += this.f6919j;
            this.f6916g = 0;
            this.f6915f = 0;
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: h */
    private void m8208h(ParsableByteArray a0Var) {
        int min = Math.min(a0Var.mo7376a(), 4 - this.f6916g);
        a0Var.mo7385j(this.f6910a.mo7379d(), this.f6916g, min);
        int i = this.f6916g + min;
        this.f6916g = i;
        if (i >= 4) {
            this.f6910a.mo7374P(0);
            if (!this.f6911b.mo5806a(this.f6910a.mo7389n())) {
                this.f6916g = 0;
                this.f6915f = 1;
                return;
            }
            C0815a aVar = this.f6911b;
            this.f6920k = aVar.f5440c;
            if (!this.f6917h) {
                this.f6919j = (((long) aVar.f5444g) * 1000000) / ((long) aVar.f5441d);
                this.f6913d.mo6177d(new C1245b().mo7693S(this.f6914e).mo7705e0(this.f6911b.f5439b).mo7697W(4096).mo7682H(this.f6911b.f5442e).mo7706f0(this.f6911b.f5441d).mo7696V(this.f6912c).mo7679E());
                this.f6917h = true;
            }
            this.f6910a.mo7374P(0);
            this.f6913d.mo6174a(this.f6910a, 4);
            this.f6915f = 2;
        }
    }

    /* renamed from: a */
    public void mo6331a() {
        this.f6915f = 0;
        this.f6916g = 0;
        this.f6918i = false;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        Assertions.m10156h(this.f6913d);
        while (a0Var.mo7376a() > 0) {
            int i = this.f6915f;
            if (i == 0) {
                m8206b(a0Var);
            } else if (i == 1) {
                m8208h(a0Var);
            } else if (i == 2) {
                m8207g(a0Var);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6921l = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6914e = dVar.mo6343b();
        this.f6913d = lVar.mo6218q(dVar.mo6344c(), 1);
    }

    public MpegAudioReader(String str) {
        this.f6915f = 0;
        ParsableByteArray a0Var = new ParsableByteArray(4);
        this.f6910a = a0Var;
        a0Var.mo7379d()[0] = -1;
        this.f6911b = new C0815a();
        this.f6912c = str;
    }
}
