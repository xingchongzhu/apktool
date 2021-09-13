package p067c.p068a.p069a.p070a.p100k2.p103p;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.p259uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p100k2.SimpleSubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.p.a */
public final class PgsDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private final ParsableByteArray f7918o = new ParsableByteArray();

    /* renamed from: p */
    private final ParsableByteArray f7919p = new ParsableByteArray();

    /* renamed from: q */
    private final C1139a f7920q = new C1139a();

    /* renamed from: r */
    private Inflater f7921r;

    /* renamed from: c.a.a.a.k2.p.a$a */
    /* compiled from: PgsDecoder */
    private static final class C1139a {

        /* renamed from: a */
        private final ParsableByteArray f7922a = new ParsableByteArray();

        /* renamed from: b */
        private final int[] f7923b = new int[LogType.UNEXP];

        /* renamed from: c */
        private boolean f7924c;

        /* renamed from: d */
        private int f7925d;

        /* renamed from: e */
        private int f7926e;

        /* renamed from: f */
        private int f7927f;

        /* renamed from: g */
        private int f7928g;

        /* renamed from: h */
        private int f7929h;

        /* renamed from: i */
        private int f7930i;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m9593e(ParsableByteArray a0Var, int i) {
            if (i >= 4) {
                a0Var.mo7375Q(3);
                int i2 = i - 4;
                if ((a0Var.mo7362D() & 128) != 0) {
                    if (i2 >= 7) {
                        int G = a0Var.mo7365G();
                        if (G >= 4) {
                            this.f7929h = a0Var.mo7368J();
                            this.f7930i = a0Var.mo7368J();
                            this.f7922a.mo7370L(G - 4);
                            i2 -= 7;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int e = this.f7922a.mo7380e();
                int f = this.f7922a.mo7381f();
                if (e < f && i2 > 0) {
                    int min = Math.min(i2, f - e);
                    a0Var.mo7385j(this.f7922a.mo7379d(), e, min);
                    this.f7922a.mo7374P(e + min);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m9594f(ParsableByteArray a0Var, int i) {
            if (i >= 19) {
                this.f7925d = a0Var.mo7368J();
                this.f7926e = a0Var.mo7368J();
                a0Var.mo7375Q(11);
                this.f7927f = a0Var.mo7368J();
                this.f7928g = a0Var.mo7368J();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m9595g(ParsableByteArray a0Var, int i) {
            if (i % 5 == 2) {
                a0Var.mo7375Q(2);
                Arrays.fill(this.f7923b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int D = a0Var.mo7362D();
                    int D2 = a0Var.mo7362D();
                    int D3 = a0Var.mo7362D();
                    int D4 = a0Var.mo7362D();
                    int D5 = a0Var.mo7362D();
                    double d = (double) D2;
                    double d2 = (double) (D3 - 128);
                    Double.isNaN(d2);
                    double d3 = 1.402d * d2;
                    Double.isNaN(d);
                    int i4 = (int) (d3 + d);
                    int i5 = i3;
                    double d4 = (double) (D4 - 128);
                    Double.isNaN(d4);
                    double d5 = 0.34414d * d4;
                    Double.isNaN(d);
                    double d6 = d - d5;
                    Double.isNaN(d2);
                    int i6 = (int) (d6 - (d2 * 0.71414d));
                    Double.isNaN(d4);
                    double d7 = d4 * 1.772d;
                    Double.isNaN(d);
                    int i7 = (int) (d + d7);
                    this.f7923b[D] = Util.m10307p(i7, 0, 255) | (Util.m10307p(i6, 0, 255) << 8) | (D5 << 24) | (Util.m10307p(i4, 0, 255) << 16);
                    i3 = i5 + 1;
                }
                this.f7924c = true;
            }
        }

        /* renamed from: d */
        public Cue mo7110d() {
            int i;
            int i2;
            int i3;
            if (this.f7925d == 0 || this.f7926e == 0 || this.f7929h == 0 || this.f7930i == 0 || this.f7922a.mo7381f() == 0 || this.f7922a.mo7380e() != this.f7922a.mo7381f() || !this.f7924c) {
                return null;
            }
            this.f7922a.mo7374P(0);
            int i4 = this.f7929h * this.f7930i;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int D = this.f7922a.mo7362D();
                if (D != 0) {
                    i3 = i5 + 1;
                    iArr[i5] = this.f7923b[D];
                } else {
                    int D2 = this.f7922a.mo7362D();
                    if (D2 != 0) {
                        if ((D2 & 64) == 0) {
                            i = D2 & 63;
                        } else {
                            i = ((D2 & 63) << 8) | this.f7922a.mo7362D();
                        }
                        if ((D2 & 128) == 0) {
                            i2 = 0;
                        } else {
                            i2 = this.f7923b[this.f7922a.mo7362D()];
                        }
                        i3 = i + i5;
                        Arrays.fill(iArr, i5, i3, i2);
                    }
                }
                i5 = i3;
            }
            return new C1119b().mo7041f(Bitmap.createBitmap(iArr, this.f7929h, this.f7930i, Config.ARGB_8888)).mo7045j(((float) this.f7927f) / ((float) this.f7925d)).mo7046k(0).mo7043h(((float) this.f7928g) / ((float) this.f7926e), 0).mo7044i(0).mo7048m(((float) this.f7929h) / ((float) this.f7925d)).mo7042g(((float) this.f7930i) / ((float) this.f7926e)).mo7036a();
        }

        /* renamed from: h */
        public void mo7111h() {
            this.f7925d = 0;
            this.f7926e = 0;
            this.f7927f = 0;
            this.f7928g = 0;
            this.f7929h = 0;
            this.f7930i = 0;
            this.f7922a.mo7370L(0);
            this.f7924c = false;
        }
    }

    public PgsDecoder() {
        super("PgsDecoder");
    }

    /* renamed from: C */
    private void m9587C(ParsableByteArray a0Var) {
        if (a0Var.mo7376a() > 0 && a0Var.mo7383h() == 120) {
            if (this.f7921r == null) {
                this.f7921r = new Inflater();
            }
            if (Util.m10292h0(a0Var, this.f7919p, this.f7921r)) {
                a0Var.mo7372N(this.f7919p.mo7379d(), this.f7919p.mo7381f());
            }
        }
    }

    /* renamed from: D */
    private static Cue m9588D(ParsableByteArray a0Var, C1139a aVar) {
        int f = a0Var.mo7381f();
        int D = a0Var.mo7362D();
        int J = a0Var.mo7368J();
        int e = a0Var.mo7380e() + J;
        Cue cVar = null;
        if (e > f) {
            a0Var.mo7374P(f);
            return null;
        }
        if (D != 128) {
            switch (D) {
                case 20:
                    aVar.m9595g(a0Var, J);
                    break;
                case 21:
                    aVar.m9593e(a0Var, J);
                    break;
                case 22:
                    aVar.m9594f(a0Var, J);
                    break;
            }
        } else {
            cVar = aVar.mo7110d();
            aVar.mo7111h();
        }
        a0Var.mo7374P(e);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Subtitle mo7059z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f7918o.mo7372N(bArr, i);
        m9587C(this.f7918o);
        this.f7920q.mo7111h();
        ArrayList arrayList = new ArrayList();
        while (this.f7918o.mo7376a() >= 3) {
            Cue D = m9588D(this.f7918o, this.f7920q);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new PgsSubtitle(Collections.unmodifiableList(arrayList));
    }
}
