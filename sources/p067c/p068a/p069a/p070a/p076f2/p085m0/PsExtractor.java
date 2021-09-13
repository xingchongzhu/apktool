package p067c.p068a.p069a.p070a.p076f2.p085m0;

import android.util.SparseArray;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.TType;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: c.a.a.a.f2.m0.b0 */
public final class PsExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6587a = C0975d.f6608b;

    /* renamed from: b */
    private final TimestampAdjuster f6588b;

    /* renamed from: c */
    private final SparseArray<C0973a> f6589c;

    /* renamed from: d */
    private final ParsableByteArray f6590d;

    /* renamed from: e */
    private final PsDurationReader f6591e;

    /* renamed from: f */
    private boolean f6592f;

    /* renamed from: g */
    private boolean f6593g;

    /* renamed from: h */
    private boolean f6594h;

    /* renamed from: i */
    private long f6595i;

    /* renamed from: j */
    private PsBinarySearchSeeker f6596j;

    /* renamed from: k */
    private ExtractorOutput f6597k;

    /* renamed from: l */
    private boolean f6598l;

    /* renamed from: c.a.a.a.f2.m0.b0$a */
    /* compiled from: PsExtractor */
    private static final class C0973a {

        /* renamed from: a */
        private final ElementaryStreamReader f6599a;

        /* renamed from: b */
        private final TimestampAdjuster f6600b;

        /* renamed from: c */
        private final ParsableBitArray f6601c = new ParsableBitArray(new byte[64]);

        /* renamed from: d */
        private boolean f6602d;

        /* renamed from: e */
        private boolean f6603e;

        /* renamed from: f */
        private boolean f6604f;

        /* renamed from: g */
        private int f6605g;

        /* renamed from: h */
        private long f6606h;

        public C0973a(ElementaryStreamReader oVar, TimestampAdjuster j0Var) {
            this.f6599a = oVar;
            this.f6600b = j0Var;
        }

        /* renamed from: b */
        private void m7963b() {
            this.f6601c.mo7505r(8);
            this.f6602d = this.f6601c.mo7494g();
            this.f6603e = this.f6601c.mo7494g();
            this.f6601c.mo7505r(6);
            this.f6605g = this.f6601c.mo7495h(8);
        }

        /* renamed from: c */
        private void m7964c() {
            this.f6606h = 0;
            if (this.f6602d) {
                this.f6601c.mo7505r(4);
                long h = ((long) this.f6601c.mo7495h(3)) << 30;
                this.f6601c.mo7505r(1);
                long h2 = h | ((long) (this.f6601c.mo7495h(15) << 15));
                this.f6601c.mo7505r(1);
                long h3 = h2 | ((long) this.f6601c.mo7495h(15));
                this.f6601c.mo7505r(1);
                if (!this.f6604f && this.f6603e) {
                    this.f6601c.mo7505r(4);
                    long h4 = ((long) this.f6601c.mo7495h(3)) << 30;
                    this.f6601c.mo7505r(1);
                    long h5 = h4 | ((long) (this.f6601c.mo7495h(15) << 15));
                    this.f6601c.mo7505r(1);
                    long h6 = h5 | ((long) this.f6601c.mo7495h(15));
                    this.f6601c.mo7505r(1);
                    this.f6600b.mo7447b(h6);
                    this.f6604f = true;
                }
                this.f6606h = this.f6600b.mo7447b(h3);
            }
        }

        /* renamed from: a */
        public void mo6322a(ParsableByteArray a0Var) throws ParserException {
            a0Var.mo7385j(this.f6601c.f8462a, 0, 3);
            this.f6601c.mo7503p(0);
            m7963b();
            a0Var.mo7385j(this.f6601c.f8462a, 0, this.f6605g);
            this.f6601c.mo7503p(0);
            m7964c();
            this.f6599a.mo6334e(this.f6606h, 4);
            this.f6599a.mo6332c(a0Var);
            this.f6599a.mo6333d();
        }

        /* renamed from: d */
        public void mo6323d() {
            this.f6604f = false;
            this.f6599a.mo6331a();
        }
    }

    public PsExtractor() {
        this(new TimestampAdjuster(0));
    }

    /* renamed from: d */
    static /* synthetic */ Extractor[] m7956d() {
        return new Extractor[]{new PsExtractor()};
    }

    @RequiresNonNull({"output"})
    /* renamed from: f */
    private void m7957f(long j) {
        if (!this.f6598l) {
            this.f6598l = true;
            if (this.f6591e.mo6318c() != -9223372036854775807L) {
                PsBinarySearchSeeker zVar = new PsBinarySearchSeeker(this.f6591e.mo6319d(), this.f6591e.mo6318c(), j);
                this.f6596j = zVar;
                this.f6597k.mo6216f(zVar.mo6159b());
                return;
            }
            this.f6597k.mo6216f(new C1003b(this.f6591e.mo6318c()));
        }
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6597k = lVar;
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        if ((this.f6588b.mo7450e() == -9223372036854775807L) || !(this.f6588b.mo7448c() == 0 || this.f6588b.mo7448c() == j2)) {
            this.f6588b.mo7451g(j2);
        }
        PsBinarySearchSeeker zVar = this.f6596j;
        if (zVar != null) {
            zVar.mo6165h(j2);
        }
        for (int i = 0; i < this.f6589c.size(); i++) {
            ((C0973a) this.f6589c.valueAt(i)).mo6323d();
        }
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        byte[] bArr = new byte[14];
        boolean z = false;
        kVar.mo6204o(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << TType.f16865n) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        kVar.mo6205p(bArr[13] & 7);
        kVar.mo6204o(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << TType.f16865n) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        Assertions.m10156h(this.f6597k);
        long a = kVar.mo6194a();
        if ((a != -1) && !this.f6591e.mo6320e()) {
            return this.f6591e.mo6321g(kVar, xVar);
        }
        m7957f(a);
        PsBinarySearchSeeker zVar = this.f6596j;
        if (zVar != null && zVar.mo6161d()) {
            return this.f6596j.mo6160c(kVar, xVar);
        }
        kVar.mo6199h();
        long n = a != -1 ? a - kVar.mo6203n() : -1;
        if ((n != -1 && n < 4) || !kVar.mo6202m(this.f6590d.mo7379d(), 0, 4, true)) {
            return -1;
        }
        this.f6590d.mo7374P(0);
        int n2 = this.f6590d.mo7389n();
        if (n2 == 441) {
            return -1;
        }
        if (n2 == 442) {
            kVar.mo6204o(this.f6590d.mo7379d(), 0, 10);
            this.f6590d.mo7374P(9);
            kVar.mo6200i((this.f6590d.mo7362D() & 7) + 14);
            return 0;
        } else if (n2 == 443) {
            kVar.mo6204o(this.f6590d.mo7379d(), 0, 2);
            this.f6590d.mo7374P(0);
            kVar.mo6200i(this.f6590d.mo7368J() + 6);
            return 0;
        } else if (((n2 & -256) >> 8) != 1) {
            kVar.mo6200i(1);
            return 0;
        } else {
            int i = n2 & 255;
            C0973a aVar = (C0973a) this.f6589c.get(i);
            if (!this.f6592f) {
                if (aVar == null) {
                    ElementaryStreamReader oVar = null;
                    if (i == 189) {
                        oVar = new Ac3Reader();
                        this.f6593g = true;
                        this.f6595i = kVar.mo6206q();
                    } else if ((i & 224) == 192) {
                        oVar = new MpegAudioReader();
                        this.f6593g = true;
                        this.f6595i = kVar.mo6206q();
                    } else if ((i & 240) == 224) {
                        oVar = new H262Reader();
                        this.f6594h = true;
                        this.f6595i = kVar.mo6206q();
                    }
                    if (oVar != null) {
                        oVar.mo6335f(this.f6597k, new C0983d(i, LogType.UNEXP));
                        aVar = new C0973a(oVar, this.f6588b);
                        this.f6589c.put(i, aVar);
                    }
                }
                if (kVar.mo6206q() > ((!this.f6593g || !this.f6594h) ? 1048576 : this.f6595i + 8192)) {
                    this.f6592f = true;
                    this.f6597k.mo6217h();
                }
            }
            kVar.mo6204o(this.f6590d.mo7379d(), 0, 2);
            this.f6590d.mo7374P(0);
            int J = this.f6590d.mo7368J() + 6;
            if (aVar == null) {
                kVar.mo6200i(J);
            } else {
                this.f6590d.mo7370L(J);
                kVar.readFully(this.f6590d.mo7379d(), 0, J);
                this.f6590d.mo7374P(6);
                aVar.mo6322a(this.f6590d);
                ParsableByteArray a0Var = this.f6590d;
                a0Var.mo7373O(a0Var.mo7377b());
            }
            return 0;
        }
    }

    public PsExtractor(TimestampAdjuster j0Var) {
        this.f6588b = j0Var;
        this.f6590d = new ParsableByteArray(4096);
        this.f6589c = new SparseArray<>();
        this.f6591e = new PsDurationReader();
    }
}
