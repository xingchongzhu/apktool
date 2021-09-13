package p067c.p068a.p069a.p070a.p076f2.p079g0;

import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.p079g0.TagPayloadReader.C0929a;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p112n2.AvcConfig;

/* renamed from: c.a.a.a.f2.g0.f */
final class VideoTagPayloadReader extends TagPayloadReader {

    /* renamed from: b */
    private final ParsableByteArray f6110b = new ParsableByteArray(NalUnitUtil.f8442a);

    /* renamed from: c */
    private final ParsableByteArray f6111c = new ParsableByteArray(4);

    /* renamed from: d */
    private int f6112d;

    /* renamed from: e */
    private boolean f6113e;

    /* renamed from: f */
    private boolean f6114f;

    /* renamed from: g */
    private int f6115g;

    public VideoTagPayloadReader(C0916b0 b0Var) {
        super(b0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6209b(ParsableByteArray a0Var) throws C0929a {
        int D = a0Var.mo7362D();
        int i = (D >> 4) & 15;
        int i2 = D & 15;
        if (i2 == 7) {
            this.f6115g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new C0929a(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6210c(ParsableByteArray a0Var, long j) throws ParserException {
        int D = a0Var.mo7362D();
        long o = j + (((long) a0Var.mo7390o()) * 1000);
        if (D == 0 && !this.f6113e) {
            ParsableByteArray a0Var2 = new ParsableByteArray(new byte[a0Var.mo7376a()]);
            a0Var.mo7385j(a0Var2.mo7379d(), 0, a0Var.mo7376a());
            AvcConfig b = AvcConfig.m10501b(a0Var2);
            this.f6112d = b.f8525b;
            this.f6109a.mo6177d(new C1245b().mo7705e0("video/avc").mo7683I(b.f8529f).mo7710j0(b.f8526c).mo7691Q(b.f8527d).mo7701a0(b.f8528e).mo7694T(b.f8524a).mo7679E());
            this.f6113e = true;
            return false;
        } else if (D != 1 || !this.f6113e) {
            return false;
        } else {
            int i = this.f6115g == 1 ? 1 : 0;
            if (!this.f6114f && i == 0) {
                return false;
            }
            byte[] d = this.f6111c.mo7379d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i2 = 4 - this.f6112d;
            int i3 = 0;
            while (a0Var.mo7376a() > 0) {
                a0Var.mo7385j(this.f6111c.mo7379d(), i2, this.f6112d);
                this.f6111c.mo7374P(0);
                int H = this.f6111c.mo7366H();
                this.f6110b.mo7374P(0);
                this.f6109a.mo6174a(this.f6110b, 4);
                int i4 = i3 + 4;
                this.f6109a.mo6174a(a0Var, H);
                i3 = i4 + H;
            }
            this.f6109a.mo6176c(o, i, i3, 0, null);
            this.f6114f = true;
            return true;
        }
    }
}
