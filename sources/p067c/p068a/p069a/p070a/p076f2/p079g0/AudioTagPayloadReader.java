package p067c.p068a.p069a.p070a.p076f2.p079g0;

import java.util.Collections;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p072b2.AacUtil;
import p067c.p068a.p069a.p070a.p072b2.AacUtil.C0824b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.p079g0.TagPayloadReader.C0929a;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.g0.b */
final class AudioTagPayloadReader extends TagPayloadReader {

    /* renamed from: b */
    private static final int[] f6085b = {5512, 11025, 22050, 44100};

    /* renamed from: c */
    private boolean f6086c;

    /* renamed from: d */
    private boolean f6087d;

    /* renamed from: e */
    private int f6088e;

    public AudioTagPayloadReader(C0916b0 b0Var) {
        super(b0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6209b(ParsableByteArray a0Var) throws C0929a {
        if (!this.f6086c) {
            int D = a0Var.mo7362D();
            int i = (D >> 4) & 15;
            this.f6088e = i;
            if (i == 2) {
                this.f6109a.mo6177d(new C1245b().mo7705e0("audio/mpeg").mo7682H(1).mo7706f0(f6085b[(D >> 2) & 3]).mo7679E());
                this.f6087d = true;
            } else if (i == 7 || i == 8) {
                this.f6109a.mo6177d(new C1245b().mo7705e0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").mo7682H(1).mo7706f0(8000).mo7679E());
                this.f6087d = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder();
                sb.append("Audio format not supported: ");
                sb.append(this.f6088e);
                throw new C0929a(sb.toString());
            }
            this.f6086c = true;
        } else {
            a0Var.mo7375Q(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6210c(ParsableByteArray a0Var, long j) throws ParserException {
        if (this.f6088e == 2) {
            int a = a0Var.mo7376a();
            this.f6109a.mo6174a(a0Var, a);
            this.f6109a.mo6176c(j, 1, a, 0, null);
            return true;
        }
        int D = a0Var.mo7362D();
        if (D == 0 && !this.f6087d) {
            int a2 = a0Var.mo7376a();
            byte[] bArr = new byte[a2];
            a0Var.mo7385j(bArr, 0, a2);
            C0824b f = AacUtil.m6623f(bArr);
            this.f6109a.mo6177d(new C1245b().mo7705e0("audio/mp4a-latm").mo7683I(f.f5523c).mo7682H(f.f5522b).mo7706f0(f.f5521a).mo7694T(Collections.singletonList(bArr)).mo7679E());
            this.f6087d = true;
            return false;
        } else if (this.f6088e == 10 && D != 1) {
            return false;
        } else {
            int a3 = a0Var.mo7376a();
            this.f6109a.mo6174a(a0Var, a3);
            this.f6109a.mo6176c(j, 1, a3, 0, null);
            return true;
        }
    }
}
