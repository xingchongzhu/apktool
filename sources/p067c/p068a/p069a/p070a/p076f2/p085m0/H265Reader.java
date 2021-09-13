package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.CodecSpecificDataUtil;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableNalUnitBitArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.s */
public final class H265Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private final SeiReader f6856a;

    /* renamed from: b */
    private String f6857b;

    /* renamed from: c */
    private C0916b0 f6858c;

    /* renamed from: d */
    private C0990a f6859d;

    /* renamed from: e */
    private boolean f6860e;

    /* renamed from: f */
    private final boolean[] f6861f = new boolean[3];

    /* renamed from: g */
    private final NalUnitTargetBuffer f6862g = new NalUnitTargetBuffer(32, 128);

    /* renamed from: h */
    private final NalUnitTargetBuffer f6863h = new NalUnitTargetBuffer(33, 128);

    /* renamed from: i */
    private final NalUnitTargetBuffer f6864i = new NalUnitTargetBuffer(34, 128);

    /* renamed from: j */
    private final NalUnitTargetBuffer f6865j = new NalUnitTargetBuffer(39, 128);

    /* renamed from: k */
    private final NalUnitTargetBuffer f6866k = new NalUnitTargetBuffer(40, 128);

    /* renamed from: l */
    private long f6867l;

    /* renamed from: m */
    private long f6868m;

    /* renamed from: n */
    private final ParsableByteArray f6869n = new ParsableByteArray();

    /* renamed from: c.a.a.a.f2.m0.s$a */
    /* compiled from: H265Reader */
    private static final class C0990a {

        /* renamed from: a */
        private final C0916b0 f6870a;

        /* renamed from: b */
        private long f6871b;

        /* renamed from: c */
        private boolean f6872c;

        /* renamed from: d */
        private int f6873d;

        /* renamed from: e */
        private long f6874e;

        /* renamed from: f */
        private boolean f6875f;

        /* renamed from: g */
        private boolean f6876g;

        /* renamed from: h */
        private boolean f6877h;

        /* renamed from: i */
        private boolean f6878i;

        /* renamed from: j */
        private boolean f6879j;

        /* renamed from: k */
        private long f6880k;

        /* renamed from: l */
        private long f6881l;

        /* renamed from: m */
        private boolean f6882m;

        public C0990a(C0916b0 b0Var) {
            this.f6870a = b0Var;
        }

        /* renamed from: b */
        private static boolean m8181b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* renamed from: c */
        private static boolean m8182c(int i) {
            return i < 32 || i == 40;
        }

        /* renamed from: d */
        private void m8183d(int i) {
            int i2 = (int) (this.f6871b - this.f6880k);
            int i3 = i;
            this.f6870a.mo6176c(this.f6881l, this.f6882m ? 1 : 0, i2, i3, null);
        }

        /* renamed from: a */
        public void mo6369a(long j, int i, boolean z) {
            if (this.f6879j && this.f6876g) {
                this.f6882m = this.f6872c;
                this.f6879j = false;
            } else if (this.f6877h || this.f6876g) {
                if (z && this.f6878i) {
                    m8183d(i + ((int) (j - this.f6871b)));
                }
                this.f6880k = this.f6871b;
                this.f6881l = this.f6874e;
                this.f6882m = this.f6872c;
                this.f6878i = true;
            }
        }

        /* renamed from: e */
        public void mo6370e(byte[] bArr, int i, int i2) {
            if (this.f6875f) {
                int i3 = i + 2;
                int i4 = this.f6873d;
                int i5 = i3 - i4;
                if (i5 < i2) {
                    this.f6876g = (bArr[i5] & 128) != 0;
                    this.f6875f = false;
                    return;
                }
                this.f6873d = i4 + (i2 - i);
            }
        }

        /* renamed from: f */
        public void mo6371f() {
            this.f6875f = false;
            this.f6876g = false;
            this.f6877h = false;
            this.f6878i = false;
            this.f6879j = false;
        }

        /* renamed from: g */
        public void mo6372g(long j, int i, int i2, long j2, boolean z) {
            boolean z2 = false;
            this.f6876g = false;
            this.f6877h = false;
            this.f6874e = j2;
            this.f6873d = 0;
            this.f6871b = j;
            if (!m8182c(i2)) {
                if (this.f6878i && !this.f6879j) {
                    if (z) {
                        m8183d(i);
                    }
                    this.f6878i = false;
                }
                if (m8181b(i2)) {
                    this.f6877h = !this.f6879j;
                    this.f6879j = true;
                }
            }
            boolean z3 = i2 >= 16 && i2 <= 21;
            this.f6872c = z3;
            if (z3 || i2 <= 9) {
                z2 = true;
            }
            this.f6875f = z2;
        }
    }

    public H265Reader(SeiReader e0Var) {
        this.f6856a = e0Var;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* renamed from: b */
    private void m8169b() {
        Assertions.m10156h(this.f6858c);
        Util.m10293i(this.f6859d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* renamed from: g */
    private void m8170g(long j, int i, int i2, long j2) {
        this.f6859d.mo6369a(j, i, this.f6860e);
        if (!this.f6860e) {
            this.f6862g.mo6374b(i2);
            this.f6863h.mo6374b(i2);
            this.f6864i.mo6374b(i2);
            if (this.f6862g.mo6375c() && this.f6863h.mo6375c() && this.f6864i.mo6375c()) {
                this.f6858c.mo6177d(m8172i(this.f6857b, this.f6862g, this.f6863h, this.f6864i));
                this.f6860e = true;
            }
        }
        if (this.f6865j.mo6374b(i2)) {
            NalUnitTargetBuffer wVar = this.f6865j;
            this.f6869n.mo7372N(this.f6865j.f6925d, NalUnitUtil.m10428k(wVar.f6925d, wVar.f6926e));
            this.f6869n.mo7375Q(5);
            this.f6856a.mo6329a(j2, this.f6869n);
        }
        if (this.f6866k.mo6374b(i2)) {
            NalUnitTargetBuffer wVar2 = this.f6866k;
            this.f6869n.mo7372N(this.f6866k.f6925d, NalUnitUtil.m10428k(wVar2.f6925d, wVar2.f6926e));
            this.f6869n.mo7375Q(5);
            this.f6856a.mo6329a(j2, this.f6869n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: h */
    private void m8171h(byte[] bArr, int i, int i2) {
        this.f6859d.mo6370e(bArr, i, i2);
        if (!this.f6860e) {
            this.f6862g.mo6373a(bArr, i, i2);
            this.f6863h.mo6373a(bArr, i, i2);
            this.f6864i.mo6373a(bArr, i, i2);
        }
        this.f6865j.mo6373a(bArr, i, i2);
        this.f6866k.mo6373a(bArr, i, i2);
    }

    /* renamed from: i */
    private static Format m8172i(String str, NalUnitTargetBuffer wVar, NalUnitTargetBuffer wVar2, NalUnitTargetBuffer wVar3) {
        NalUnitTargetBuffer wVar4 = wVar;
        NalUnitTargetBuffer wVar5 = wVar2;
        NalUnitTargetBuffer wVar6 = wVar3;
        int i = wVar4.f6926e;
        byte[] bArr = new byte[(wVar5.f6926e + i + wVar6.f6926e)];
        System.arraycopy(wVar4.f6925d, 0, bArr, 0, i);
        System.arraycopy(wVar5.f6925d, 0, bArr, wVar4.f6926e, wVar5.f6926e);
        System.arraycopy(wVar6.f6925d, 0, bArr, wVar4.f6926e + wVar5.f6926e, wVar6.f6926e);
        ParsableNalUnitBitArray b0Var = new ParsableNalUnitBitArray(wVar5.f6925d, 0, wVar5.f6926e);
        b0Var.mo7411l(44);
        int e = b0Var.mo7406e(3);
        b0Var.mo7410k();
        b0Var.mo7411l(88);
        b0Var.mo7411l(8);
        int i2 = 0;
        for (int i3 = 0; i3 < e; i3++) {
            if (b0Var.mo7405d()) {
                i2 += 89;
            }
            if (b0Var.mo7405d()) {
                i2 += 8;
            }
        }
        b0Var.mo7411l(i2);
        if (e > 0) {
            b0Var.mo7411l((8 - e) * 2);
        }
        b0Var.mo7408h();
        int h = b0Var.mo7408h();
        if (h == 3) {
            b0Var.mo7410k();
        }
        int h2 = b0Var.mo7408h();
        int h3 = b0Var.mo7408h();
        if (b0Var.mo7405d()) {
            h2 -= ((h == 1 || h == 2) ? 2 : 1) * (b0Var.mo7408h() + b0Var.mo7408h());
            h3 -= (h == 1 ? 2 : 1) * (b0Var.mo7408h() + b0Var.mo7408h());
        }
        b0Var.mo7408h();
        b0Var.mo7408h();
        int h4 = b0Var.mo7408h();
        for (int i4 = b0Var.mo7405d() ? 0 : e; i4 <= e; i4++) {
            b0Var.mo7408h();
            b0Var.mo7408h();
            b0Var.mo7408h();
        }
        b0Var.mo7408h();
        b0Var.mo7408h();
        b0Var.mo7408h();
        b0Var.mo7408h();
        b0Var.mo7408h();
        b0Var.mo7408h();
        if (b0Var.mo7405d() && b0Var.mo7405d()) {
            m8173j(b0Var);
        }
        b0Var.mo7411l(2);
        if (b0Var.mo7405d()) {
            b0Var.mo7411l(8);
            b0Var.mo7408h();
            b0Var.mo7408h();
            b0Var.mo7410k();
        }
        m8174k(b0Var);
        if (b0Var.mo7405d()) {
            for (int i5 = 0; i5 < b0Var.mo7408h(); i5++) {
                b0Var.mo7411l(h4 + 4 + 1);
            }
        }
        b0Var.mo7411l(2);
        float f = 1.0f;
        if (b0Var.mo7405d()) {
            if (b0Var.mo7405d()) {
                int e2 = b0Var.mo7406e(8);
                if (e2 == 255) {
                    int e3 = b0Var.mo7406e(16);
                    int e4 = b0Var.mo7406e(16);
                    if (!(e3 == 0 || e4 == 0)) {
                        f = ((float) e3) / ((float) e4);
                    }
                } else {
                    float[] fArr = NalUnitUtil.f8443b;
                    if (e2 < fArr.length) {
                        f = fArr[e2];
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(e2);
                        Log.m10386h("H265Reader", sb.toString());
                    }
                }
            }
            if (b0Var.mo7405d()) {
                b0Var.mo7410k();
            }
            if (b0Var.mo7405d()) {
                b0Var.mo7411l(4);
                if (b0Var.mo7405d()) {
                    b0Var.mo7411l(24);
                }
            }
            if (b0Var.mo7405d()) {
                b0Var.mo7408h();
                b0Var.mo7408h();
            }
            b0Var.mo7410k();
            if (b0Var.mo7405d()) {
                h3 *= 2;
            }
        }
        b0Var.mo7409i(wVar5.f6925d, 0, wVar5.f6926e);
        b0Var.mo7411l(24);
        return new C1245b().mo7693S(str).mo7705e0("video/hevc").mo7683I(CodecSpecificDataUtil.m10172c(b0Var)).mo7710j0(h2).mo7691Q(h3).mo7701a0(f).mo7694T(Collections.singletonList(bArr)).mo7679E();
    }

    /* renamed from: j */
    private static void m8173j(ParsableNalUnitBitArray b0Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!b0Var.mo7405d()) {
                    b0Var.mo7408h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        b0Var.mo7407g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        b0Var.mo7407g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: k */
    private static void m8174k(ParsableNalUnitBitArray b0Var) {
        int h = b0Var.mo7408h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = b0Var.mo7405d();
            }
            if (z) {
                b0Var.mo7410k();
                b0Var.mo7408h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (b0Var.mo7405d()) {
                        b0Var.mo7410k();
                    }
                }
            } else {
                int h2 = b0Var.mo7408h();
                int h3 = b0Var.mo7408h();
                int i4 = h2 + h3;
                for (int i5 = 0; i5 < h2; i5++) {
                    b0Var.mo7408h();
                    b0Var.mo7410k();
                }
                for (int i6 = 0; i6 < h3; i6++) {
                    b0Var.mo7408h();
                    b0Var.mo7410k();
                }
                i = i4;
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: l */
    private void m8175l(long j, int i, int i2, long j2) {
        this.f6859d.mo6372g(j, i, i2, j2, this.f6860e);
        if (!this.f6860e) {
            this.f6862g.mo6377e(i2);
            this.f6863h.mo6377e(i2);
            this.f6864i.mo6377e(i2);
        }
        this.f6865j.mo6377e(i2);
        this.f6866k.mo6377e(i2);
    }

    /* renamed from: a */
    public void mo6331a() {
        this.f6867l = 0;
        NalUnitUtil.m10418a(this.f6861f);
        this.f6862g.mo6376d();
        this.f6863h.mo6376d();
        this.f6864i.mo6376d();
        this.f6865j.mo6376d();
        this.f6866k.mo6376d();
        C0990a aVar = this.f6859d;
        if (aVar != null) {
            aVar.mo6371f();
        }
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        m8169b();
        while (a0Var.mo7376a() > 0) {
            int e = a0Var.mo7380e();
            int f = a0Var.mo7381f();
            byte[] d = a0Var.mo7379d();
            this.f6867l += (long) a0Var.mo7376a();
            this.f6858c.mo6174a(a0Var, a0Var.mo7376a());
            while (true) {
                if (e < f) {
                    int c = NalUnitUtil.m10420c(d, e, f, this.f6861f);
                    if (c == f) {
                        m8171h(d, e, f);
                        return;
                    }
                    int e2 = NalUnitUtil.m10422e(d, c);
                    int i = c - e;
                    if (i > 0) {
                        m8171h(d, e, c);
                    }
                    int i2 = f - c;
                    long j = this.f6867l - ((long) i2);
                    int i3 = i < 0 ? -i : 0;
                    long j2 = j;
                    int i4 = i2;
                    m8170g(j2, i4, i3, this.f6868m);
                    m8175l(j2, i4, e2, this.f6868m);
                    e = c + 3;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6868m = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6857b = dVar.mo6343b();
        C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 2);
        this.f6858c = q;
        this.f6859d = new C0990a(q);
        this.f6856a.mo6330b(lVar, dVar);
    }
}
