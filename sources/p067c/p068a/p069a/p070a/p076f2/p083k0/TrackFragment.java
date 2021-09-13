package p067c.p068a.p069a.p070a.p076f2.p083k0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.k0.q */
final class TrackFragment {

    /* renamed from: a */
    public DefaultSampleValues f6482a;

    /* renamed from: b */
    public long f6483b;

    /* renamed from: c */
    public long f6484c;

    /* renamed from: d */
    public long f6485d;

    /* renamed from: e */
    public int f6486e;

    /* renamed from: f */
    public int f6487f;

    /* renamed from: g */
    public long[] f6488g = new long[0];

    /* renamed from: h */
    public int[] f6489h = new int[0];

    /* renamed from: i */
    public int[] f6490i = new int[0];

    /* renamed from: j */
    public int[] f6491j = new int[0];

    /* renamed from: k */
    public long[] f6492k = new long[0];

    /* renamed from: l */
    public boolean[] f6493l = new boolean[0];

    /* renamed from: m */
    public boolean f6494m;

    /* renamed from: n */
    public boolean[] f6495n = new boolean[0];

    /* renamed from: o */
    public TrackEncryptionBox f6496o;

    /* renamed from: p */
    public final ParsableByteArray f6497p = new ParsableByteArray();

    /* renamed from: q */
    public boolean f6498q;

    /* renamed from: r */
    public long f6499r;

    /* renamed from: s */
    public boolean f6500s;

    /* renamed from: a */
    public void mo6284a(ExtractorInput kVar) throws IOException {
        kVar.readFully(this.f6497p.mo7379d(), 0, this.f6497p.mo7381f());
        this.f6497p.mo7374P(0);
        this.f6498q = false;
    }

    /* renamed from: b */
    public void mo6285b(ParsableByteArray a0Var) {
        a0Var.mo7385j(this.f6497p.mo7379d(), 0, this.f6497p.mo7381f());
        this.f6497p.mo7374P(0);
        this.f6498q = false;
    }

    /* renamed from: c */
    public long mo6286c(int i) {
        return this.f6492k[i] + ((long) this.f6491j[i]);
    }

    /* renamed from: d */
    public void mo6287d(int i) {
        this.f6497p.mo7370L(i);
        this.f6494m = true;
        this.f6498q = true;
    }

    /* renamed from: e */
    public void mo6288e(int i, int i2) {
        this.f6486e = i;
        this.f6487f = i2;
        if (this.f6489h.length < i) {
            this.f6488g = new long[i];
            this.f6489h = new int[i];
        }
        if (this.f6490i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f6490i = new int[i3];
            this.f6491j = new int[i3];
            this.f6492k = new long[i3];
            this.f6493l = new boolean[i3];
            this.f6495n = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void mo6289f() {
        this.f6486e = 0;
        this.f6499r = 0;
        this.f6500s = false;
        this.f6494m = false;
        this.f6498q = false;
        this.f6496o = null;
    }

    /* renamed from: g */
    public boolean mo6290g(int i) {
        return this.f6494m && this.f6495n[i];
    }
}
