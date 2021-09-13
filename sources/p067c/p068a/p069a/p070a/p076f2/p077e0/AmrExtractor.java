package p067c.p068a.p069a.p070a.p076f2.p077e0;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.ConstantBitrateSeekMap;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.e0.b */
public final class AmrExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6030a = C0923a.f6029b;

    /* renamed from: b */
    private static final int[] f6031b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f6032c;

    /* renamed from: d */
    private static final byte[] f6033d = Util.m10290g0("#!AMR\n");

    /* renamed from: e */
    private static final byte[] f6034e = Util.m10290g0("#!AMR-WB\n");

    /* renamed from: f */
    private static final int f6035f;

    /* renamed from: g */
    private final byte[] f6036g;

    /* renamed from: h */
    private final int f6037h;

    /* renamed from: i */
    private boolean f6038i;

    /* renamed from: j */
    private long f6039j;

    /* renamed from: k */
    private int f6040k;

    /* renamed from: l */
    private int f6041l;

    /* renamed from: m */
    private boolean f6042m;

    /* renamed from: n */
    private long f6043n;

    /* renamed from: o */
    private int f6044o;

    /* renamed from: p */
    private int f6045p;

    /* renamed from: q */
    private long f6046q;

    /* renamed from: r */
    private ExtractorOutput f6047r;

    /* renamed from: s */
    private C0916b0 f6048s;

    /* renamed from: t */
    private SeekMap f6049t;

    /* renamed from: u */
    private boolean f6050u;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f6032c = iArr;
        f6035f = iArr[8];
    }

    public AmrExtractor() {
        this(0);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: d */
    private void m7362d() {
        Assertions.m10156h(this.f6048s);
        Util.m10293i(this.f6047r);
    }

    /* renamed from: f */
    private static int m7363f(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }

    /* renamed from: g */
    private SeekMap m7364g(long j) {
        long j2 = j;
        ConstantBitrateSeekMap fVar = new ConstantBitrateSeekMap(j2, this.f6043n, m7363f(this.f6044o, 20000), this.f6044o);
        return fVar;
    }

    /* renamed from: h */
    private int m7365h(int i) throws ParserException {
        if (m7367k(i)) {
            return this.f6038i ? f6032c[i] : f6031b[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f6038i ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw new ParserException(sb.toString());
    }

    /* renamed from: j */
    private boolean m7366j(int i) {
        return !this.f6038i && (i < 12 || i > 14);
    }

    /* renamed from: k */
    private boolean m7367k(int i) {
        return i >= 0 && i <= 15 && (m7368l(i) || m7366j(i));
    }

    /* renamed from: l */
    private boolean m7368l(int i) {
        return this.f6038i && (i < 10 || i > 13);
    }

    /* renamed from: m */
    static /* synthetic */ Extractor[] m7369m() {
        return new Extractor[]{new AmrExtractor()};
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: n */
    private void m7370n() {
        if (!this.f6050u) {
            this.f6050u = true;
            boolean z = this.f6038i;
            this.f6048s.mo6177d(new C1245b().mo7705e0(z ? "audio/amr-wb" : "audio/3gpp").mo7697W(f6035f).mo7682H(1).mo7706f0(z ? 16000 : 8000).mo7679E());
        }
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: o */
    private void m7371o(long j, int i) {
        if (!this.f6042m) {
            if (!((this.f6037h & 1) == 0 || j == -1)) {
                int i2 = this.f6044o;
                if (i2 == -1 || i2 == this.f6040k) {
                    if (this.f6045p >= 20 || i == -1) {
                        SeekMap g = m7364g(j);
                        this.f6049t = g;
                        this.f6047r.mo6216f(g);
                        this.f6042m = true;
                    }
                }
            }
            C1003b bVar = new C1003b(-9223372036854775807L);
            this.f6049t = bVar;
            this.f6047r.mo6216f(bVar);
            this.f6042m = true;
        }
    }

    /* renamed from: p */
    private static boolean m7372p(ExtractorInput kVar, byte[] bArr) throws IOException {
        kVar.mo6199h();
        byte[] bArr2 = new byte[bArr.length];
        kVar.mo6204o(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: q */
    private int m7373q(ExtractorInput kVar) throws IOException {
        kVar.mo6199h();
        kVar.mo6204o(this.f6036g, 0, 1);
        byte b = this.f6036g[0];
        if ((b & 131) <= 0) {
            return m7365h((b >> 3) & 15);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid padding bits for frame header ");
        sb.append(b);
        throw new ParserException(sb.toString());
    }

    /* renamed from: r */
    private boolean m7374r(ExtractorInput kVar) throws IOException {
        byte[] bArr = f6033d;
        if (m7372p(kVar, bArr)) {
            this.f6038i = false;
            kVar.mo6200i(bArr.length);
            return true;
        }
        byte[] bArr2 = f6034e;
        if (!m7372p(kVar, bArr2)) {
            return false;
        }
        this.f6038i = true;
        kVar.mo6200i(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: s */
    private int m7375s(ExtractorInput kVar) throws IOException {
        if (this.f6041l == 0) {
            try {
                int q = m7373q(kVar);
                this.f6040k = q;
                this.f6041l = q;
                if (this.f6044o == -1) {
                    this.f6043n = kVar.mo6206q();
                    this.f6044o = this.f6040k;
                }
                if (this.f6044o == this.f6040k) {
                    this.f6045p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int f = this.f6048s.mo6179f(kVar, this.f6041l, true);
        if (f == -1) {
            return -1;
        }
        int i = this.f6041l - f;
        this.f6041l = i;
        if (i > 0) {
            return 0;
        }
        this.f6048s.mo6176c(this.f6046q + this.f6039j, 1, this.f6040k, 0, null);
        this.f6039j += 20000;
        return 0;
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6047r = lVar;
        this.f6048s = lVar.mo6218q(0, 1);
        lVar.mo6217h();
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        this.f6039j = 0;
        this.f6040k = 0;
        this.f6041l = 0;
        if (j != 0) {
            SeekMap yVar = this.f6049t;
            if (yVar instanceof ConstantBitrateSeekMap) {
                this.f6046q = ((ConstantBitrateSeekMap) yVar).mo6193b(j);
                return;
            }
        }
        this.f6046q = 0;
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        return m7374r(kVar);
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        m7362d();
        if (kVar.mo6206q() != 0 || m7374r(kVar)) {
            m7370n();
            int s = m7375s(kVar);
            m7371o(kVar.mo6194a(), s);
            return s;
        }
        throw new ParserException("Could not find AMR header.");
    }

    public AmrExtractor(int i) {
        this.f6037h = i;
        this.f6036g = new byte[1];
        this.f6044o = -1;
    }
}
