package p067c.p068a.p069a.p070a.p076f2.p085m0;

import android.util.Pair;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.p */
public final class H262Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private static final double[] f6759a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: b */
    private String f6760b;

    /* renamed from: c */
    private C0916b0 f6761c;

    /* renamed from: d */
    private final UserDataReader f6762d;

    /* renamed from: e */
    private final ParsableByteArray f6763e;

    /* renamed from: f */
    private final NalUnitTargetBuffer f6764f;

    /* renamed from: g */
    private final boolean[] f6765g;

    /* renamed from: h */
    private final C0984a f6766h;

    /* renamed from: i */
    private long f6767i;

    /* renamed from: j */
    private boolean f6768j;

    /* renamed from: k */
    private boolean f6769k;

    /* renamed from: l */
    private long f6770l;

    /* renamed from: m */
    private long f6771m;

    /* renamed from: n */
    private long f6772n;

    /* renamed from: o */
    private long f6773o;

    /* renamed from: p */
    private boolean f6774p;

    /* renamed from: q */
    private boolean f6775q;

    /* renamed from: c.a.a.a.f2.m0.p$a */
    /* compiled from: H262Reader */
    private static final class C0984a {

        /* renamed from: a */
        private static final byte[] f6776a = {0, 0, 1};

        /* renamed from: b */
        private boolean f6777b;

        /* renamed from: c */
        public int f6778c;

        /* renamed from: d */
        public int f6779d;

        /* renamed from: e */
        public byte[] f6780e;

        public C0984a(int i) {
            this.f6780e = new byte[i];
        }

        /* renamed from: a */
        public void mo6348a(byte[] bArr, int i, int i2) {
            if (this.f6777b) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f6780e;
                int length = bArr2.length;
                int i4 = this.f6778c;
                if (length < i4 + i3) {
                    this.f6780e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f6780e, this.f6778c, i3);
                this.f6778c += i3;
            }
        }

        /* renamed from: b */
        public boolean mo6349b(int i, int i2) {
            if (this.f6777b) {
                int i3 = this.f6778c - i2;
                this.f6778c = i3;
                if (this.f6779d == 0 && i == 181) {
                    this.f6779d = i3;
                } else {
                    this.f6777b = false;
                    return true;
                }
            } else if (i == 179) {
                this.f6777b = true;
            }
            byte[] bArr = f6776a;
            mo6348a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void mo6350c() {
            this.f6777b = false;
            this.f6778c = 0;
            this.f6779d = 0;
        }
    }

    public H262Reader() {
        this(null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<p067c.p068a.p069a.p070a.Format, java.lang.Long> m8124b(p067c.p068a.p069a.p070a.p076f2.p085m0.H262Reader.C0984a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f6780e
            int r1 = r8.f6778c
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            byte r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003d
            r7 = 3
            if (r6 == r7) goto L_0x0037
            if (r6 == r1) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0031:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0042
        L_0x0037:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0042
        L_0x003d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0042:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0044:
            c.a.a.a.u0$b r6 = new c.a.a.a.u0$b
            r6.<init>()
            c.a.a.a.u0$b r9 = r6.mo7693S(r9)
            java.lang.String r6 = "video/mpeg2"
            c.a.a.a.u0$b r9 = r9.mo7705e0(r6)
            c.a.a.a.u0$b r9 = r9.mo7710j0(r2)
            c.a.a.a.u0$b r9 = r9.mo7691Q(r4)
            c.a.a.a.u0$b r9 = r9.mo7701a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            c.a.a.a.u0$b r9 = r9.mo7694T(r1)
            c.a.a.a.u0 r9 = r9.mo7679E()
            r1 = 0
            byte r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x00a3
            double[] r5 = f6759a
            int r6 = r5.length
            if (r4 >= r6) goto L_0x00a3
            r1 = r5[r4]
            int r8 = r8.f6779d
            int r8 = r8 + 9
            byte r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            byte r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L_0x009c
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            java.lang.Double.isNaN(r5)
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x009c:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L_0x00a3:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p085m0.H262Reader.m8124b(c.a.a.a.f2.m0.p$a, java.lang.String):android.util.Pair");
    }

    /* renamed from: a */
    public void mo6331a() {
        NalUnitUtil.m10418a(this.f6765g);
        this.f6766h.mo6350c();
        NalUnitTargetBuffer wVar = this.f6764f;
        if (wVar != null) {
            wVar.mo6376d();
        }
        this.f6767i = 0;
        this.f6768j = false;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        int i;
        Assertions.m10156h(this.f6761c);
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        byte[] d = a0Var.mo7379d();
        this.f6767i += (long) a0Var.mo7376a();
        this.f6761c.mo6174a(a0Var, a0Var.mo7376a());
        while (true) {
            int c = NalUnitUtil.m10420c(d, e, f, this.f6765g);
            if (c == f) {
                break;
            }
            int i2 = c + 3;
            byte b = a0Var.mo7379d()[i2] & 255;
            int i3 = c - e;
            boolean z = false;
            if (!this.f6769k) {
                if (i3 > 0) {
                    this.f6766h.mo6348a(d, e, c);
                }
                if (this.f6766h.mo6349b(b, i3 < 0 ? -i3 : 0)) {
                    Pair b2 = m8124b(this.f6766h, (String) Assertions.m10153e(this.f6760b));
                    this.f6761c.mo6177d((Format) b2.first);
                    this.f6770l = ((Long) b2.second).longValue();
                    this.f6769k = true;
                }
            }
            NalUnitTargetBuffer wVar = this.f6764f;
            if (wVar != null) {
                if (i3 > 0) {
                    wVar.mo6373a(d, e, c);
                    i = 0;
                } else {
                    i = -i3;
                }
                if (this.f6764f.mo6374b(i)) {
                    NalUnitTargetBuffer wVar2 = this.f6764f;
                    ((ParsableByteArray) Util.m10293i(this.f6763e)).mo7372N(this.f6764f.f6925d, NalUnitUtil.m10428k(wVar2.f6925d, wVar2.f6926e));
                    ((UserDataReader) Util.m10293i(this.f6762d)).mo6346a(this.f6773o, this.f6763e);
                }
                if (b == 178 && a0Var.mo7379d()[c + 2] == 1) {
                    this.f6764f.mo6377e(b);
                }
            }
            if (b == 0 || b == 179) {
                int i4 = f - c;
                if (this.f6768j && this.f6775q && this.f6769k) {
                    this.f6761c.mo6176c(this.f6773o, this.f6774p ? 1 : 0, ((int) (this.f6767i - this.f6772n)) - i4, i4, null);
                }
                boolean z2 = this.f6768j;
                if (!z2 || this.f6775q) {
                    this.f6772n = this.f6767i - ((long) i4);
                    long j = this.f6771m;
                    if (j == -9223372036854775807L) {
                        j = z2 ? this.f6773o + this.f6770l : 0;
                    }
                    this.f6773o = j;
                    this.f6774p = false;
                    this.f6771m = -9223372036854775807L;
                    this.f6768j = true;
                }
                if (b == 0) {
                    z = true;
                }
                this.f6775q = z;
            } else if (b == 184) {
                this.f6774p = true;
            }
            e = i2;
        }
        if (!this.f6769k) {
            this.f6766h.mo6348a(d, e, f);
        }
        NalUnitTargetBuffer wVar3 = this.f6764f;
        if (wVar3 != null) {
            wVar3.mo6373a(d, e, f);
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6771m = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6760b = dVar.mo6343b();
        this.f6761c = lVar.mo6218q(dVar.mo6344c(), 2);
        UserDataReader k0Var = this.f6762d;
        if (k0Var != null) {
            k0Var.mo6347b(lVar, dVar);
        }
    }

    H262Reader(UserDataReader k0Var) {
        this.f6762d = k0Var;
        this.f6765g = new boolean[4];
        this.f6766h = new C0984a(128);
        if (k0Var != null) {
            this.f6764f = new NalUnitTargetBuffer(178, 128);
            this.f6763e = new ParsableByteArray();
            return;
        }
        this.f6764f = null;
        this.f6763e = null;
    }
}
