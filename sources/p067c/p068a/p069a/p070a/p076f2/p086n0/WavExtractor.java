package p067c.p068a.p069a.p070a.p076f2.p086n0;

import android.util.Pair;
import com.umeng.analytics.pro.TType;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p072b2.WavUtil;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.n0.b */
public final class WavExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6945a = C0993a.f6944b;

    /* renamed from: b */
    private ExtractorOutput f6946b;

    /* renamed from: c */
    private C0916b0 f6947c;

    /* renamed from: d */
    private C0995b f6948d;

    /* renamed from: e */
    private int f6949e = -1;

    /* renamed from: f */
    private long f6950f = -1;

    /* renamed from: c.a.a.a.f2.n0.b$a */
    /* compiled from: WavExtractor */
    private static final class C0994a implements C0995b {

        /* renamed from: a */
        private static final int[] f6951a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: b */
        private static final int[] f6952b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: c */
        private final ExtractorOutput f6953c;

        /* renamed from: d */
        private final C0916b0 f6954d;

        /* renamed from: e */
        private final WavHeader f6955e;

        /* renamed from: f */
        private final int f6956f;

        /* renamed from: g */
        private final byte[] f6957g;

        /* renamed from: h */
        private final ParsableByteArray f6958h;

        /* renamed from: i */
        private final int f6959i;

        /* renamed from: j */
        private final Format f6960j;

        /* renamed from: k */
        private int f6961k;

        /* renamed from: l */
        private long f6962l;

        /* renamed from: m */
        private int f6963m;

        /* renamed from: n */
        private long f6964n;

        public C0994a(ExtractorOutput lVar, C0916b0 b0Var, WavHeader cVar) throws ParserException {
            this.f6953c = lVar;
            this.f6954d = b0Var;
            this.f6955e = cVar;
            int max = Math.max(1, cVar.f6975c / 10);
            this.f6959i = max;
            ParsableByteArray a0Var = new ParsableByteArray(cVar.f6979g);
            a0Var.mo7397v();
            int v = a0Var.mo7397v();
            this.f6956f = v;
            int i = cVar.f6974b;
            int i2 = (((cVar.f6977e - (i * 4)) * 8) / (cVar.f6978f * i)) + 1;
            if (v == i2) {
                int k = Util.m10297k(max, v);
                this.f6957g = new byte[(cVar.f6977e * k)];
                this.f6958h = new ParsableByteArray(k * m8250h(v, i));
                int i3 = ((cVar.f6975c * cVar.f6977e) * 8) / v;
                this.f6960j = new C1245b().mo7705e0("audio/raw").mo7681G(i3).mo7700Z(i3).mo7697W(m8250h(max, i)).mo7682H(cVar.f6974b).mo7706f0(cVar.f6975c).mo7699Y(2).mo7679E();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(v);
            throw new ParserException(sb.toString());
        }

        /* renamed from: d */
        private void m8246d(byte[] bArr, int i, ParsableByteArray a0Var) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f6955e.f6974b; i3++) {
                    m8247e(bArr, i2, i3, a0Var.mo7379d());
                }
            }
            int g = m8249g(this.f6956f * i);
            a0Var.mo7374P(0);
            a0Var.mo7373O(g);
        }

        /* renamed from: e */
        private void m8247e(byte[] bArr, int i, int i2, byte[] bArr2) {
            WavHeader cVar = this.f6955e;
            int i3 = cVar.f6977e;
            int i4 = cVar.f6974b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = f6952b[min];
            int i10 = ((i * this.f6956f * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & 255);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                byte b = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)] & 255;
                int i12 = i11 % 2 == 0 ? b & TType.f16864m : b >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i9) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                i8 = Util.m10307p(i8 + i13, -32768, 32767);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & 255);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                int i14 = min + f6951a[i12];
                int[] iArr = f6952b;
                min = Util.m10307p(i14, 0, iArr.length - 1);
                i9 = iArr[min];
            }
        }

        /* renamed from: f */
        private int m8248f(int i) {
            return i / (this.f6955e.f6974b * 2);
        }

        /* renamed from: g */
        private int m8249g(int i) {
            return m8250h(i, this.f6955e.f6974b);
        }

        /* renamed from: h */
        private static int m8250h(int i, int i2) {
            return i * 2 * i2;
        }

        /* renamed from: i */
        private void m8251i(int i) {
            long B0 = this.f6962l + Util.m10240B0(this.f6964n, 1000000, (long) this.f6955e.f6975c);
            int g = m8249g(i);
            this.f6954d.mo6176c(B0, 1, g, this.f6963m - g, null);
            this.f6964n += (long) i;
            this.f6963m -= g;
        }

        /* renamed from: a */
        public void mo6378a(int i, long j) {
            ExtractorOutput lVar = this.f6953c;
            WavSeekMap eVar = new WavSeekMap(this.f6955e, this.f6956f, (long) i, j);
            lVar.mo6216f(eVar);
            this.f6954d.mo6177d(this.f6960j);
        }

        /* renamed from: b */
        public void mo6379b(long j) {
            this.f6961k = 0;
            this.f6962l = j;
            this.f6963m = 0;
            this.f6964n = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  
EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo6380c(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f6959i
                int r1 = r6.f6963m
                int r1 = r6.m8248f(r1)
                int r0 = r0 - r1
                int r1 = r6.f6956f
                int r0 = p067c.p068a.p069a.p070a.p111m2.Util.m10297k(r0, r1)
                c.a.a.a.f2.n0.c r1 = r6.f6955e
                int r1 = r1.f6977e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                if (r2 != 0) goto L_0x003f
                int r3 = r6.f6961k
                if (r3 >= r0) goto L_0x003f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f6957g
                int r5 = r6.f6961k
                int r3 = r7.mo6195b(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x0039
                goto L_0x001c
            L_0x0039:
                int r4 = r6.f6961k
                int r4 = r4 + r3
                r6.f6961k = r4
                goto L_0x001f
            L_0x003f:
                int r7 = r6.f6961k
                c.a.a.a.f2.n0.c r8 = r6.f6955e
                int r8 = r8.f6977e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0077
                byte[] r8 = r6.f6957g
                c.a.a.a.m2.a0 r9 = r6.f6958h
                r6.m8246d(r8, r7, r9)
                int r8 = r6.f6961k
                c.a.a.a.f2.n0.c r9 = r6.f6955e
                int r9 = r9.f6977e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f6961k = r8
                c.a.a.a.m2.a0 r7 = r6.f6958h
                int r7 = r7.mo7381f()
                c.a.a.a.f2.b0 r8 = r6.f6954d
                c.a.a.a.m2.a0 r9 = r6.f6958h
                r8.mo6174a(r9, r7)
                int r8 = r6.f6963m
                int r8 = r8 + r7
                r6.f6963m = r8
                int r7 = r6.m8248f(r8)
                int r8 = r6.f6959i
                if (r7 < r8) goto L_0x0077
                r6.m8251i(r8)
            L_0x0077:
                if (r2 == 0) goto L_0x0084
                int r7 = r6.f6963m
                int r7 = r6.m8248f(r7)
                if (r7 <= 0) goto L_0x0084
                r6.m8251i(r7)
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p086n0.WavExtractor.C0994a.mo6380c(c.a.a.a.f2.k, long):boolean");
        }
    }

    /* renamed from: c.a.a.a.f2.n0.b$b */
    /* compiled from: WavExtractor */
    private interface C0995b {
        /* renamed from: a */
        void mo6378a(int i, long j) throws ParserException;

        /* renamed from: b */
        void mo6379b(long j);

        /* renamed from: c */
        boolean mo6380c(ExtractorInput kVar, long j) throws IOException;
    }

    /* renamed from: c.a.a.a.f2.n0.b$c */
    /* compiled from: WavExtractor */
    private static final class C0996c implements C0995b {

        /* renamed from: a */
        private final ExtractorOutput f6965a;

        /* renamed from: b */
        private final C0916b0 f6966b;

        /* renamed from: c */
        private final WavHeader f6967c;

        /* renamed from: d */
        private final Format f6968d;

        /* renamed from: e */
        private final int f6969e;

        /* renamed from: f */
        private long f6970f;

        /* renamed from: g */
        private int f6971g;

        /* renamed from: h */
        private long f6972h;

        public C0996c(ExtractorOutput lVar, C0916b0 b0Var, WavHeader cVar, String str, int i) throws ParserException {
            this.f6965a = lVar;
            this.f6966b = b0Var;
            this.f6967c = cVar;
            int i2 = (cVar.f6974b * cVar.f6978f) / 8;
            if (cVar.f6977e == i2) {
                int i3 = cVar.f6975c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.f6969e = max;
                this.f6968d = new C1245b().mo7705e0(str).mo7681G(i4).mo7700Z(i4).mo7697W(max).mo7682H(cVar.f6974b).mo7706f0(cVar.f6975c).mo7699Y(i).mo7679E();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected block size: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(cVar.f6977e);
            throw new ParserException(sb.toString());
        }

        /* renamed from: a */
        public void mo6378a(int i, long j) {
            ExtractorOutput lVar = this.f6965a;
            WavSeekMap eVar = new WavSeekMap(this.f6967c, 1, (long) i, j);
            lVar.mo6216f(eVar);
            this.f6966b.mo6177d(this.f6968d);
        }

        /* renamed from: b */
        public void mo6379b(long j) {
            this.f6970f = j;
            this.f6971g = 0;
            this.f6972h = 0;
        }

        /* renamed from: c */
        public boolean mo6380c(ExtractorInput kVar, long j) throws IOException {
            long j2;
            long j3 = j;
            while (j3 > 0) {
                int i = this.f6971g;
                int i2 = this.f6969e;
                if (i >= i2) {
                    break;
                }
                int f = this.f6966b.mo6179f(kVar, (int) Math.min((long) (i2 - i), j3), true);
                if (f == -1) {
                    j3 = 0;
                } else {
                    this.f6971g += f;
                    j3 -= (long) f;
                }
            }
            WavHeader cVar = this.f6967c;
            int i3 = cVar.f6977e;
            int i4 = this.f6971g / i3;
            if (i4 > 0) {
                int i5 = i4 * i3;
                int i6 = this.f6971g - i5;
                this.f6966b.mo6176c(this.f6970f + Util.m10240B0(this.f6972h, 1000000, (long) cVar.f6975c), 1, i5, i6, null);
                this.f6972h += (long) i4;
                this.f6971g = i6;
                j2 = 0;
            } else {
                j2 = 0;
            }
            return j3 <= j2;
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: d */
    private void m8239d() {
        Assertions.m10156h(this.f6947c);
        Util.m10293i(this.f6946b);
    }

    /* renamed from: f */
    static /* synthetic */ Extractor[] m8240f() {
        return new Extractor[]{new WavExtractor()};
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6946b = lVar;
        this.f6947c = lVar.mo6218q(0, 1);
        lVar.mo6217h();
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        C0995b bVar = this.f6948d;
        if (bVar != null) {
            bVar.mo6379b(j2);
        }
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        return WavHeaderReader.m8261a(kVar) != null;
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        m8239d();
        if (this.f6948d == null) {
            WavHeader a = WavHeaderReader.m8261a(kVar);
            if (a != null) {
                int i = a.f6973a;
                if (i == 17) {
                    this.f6948d = new C0994a(this.f6946b, this.f6947c, a);
                } else if (i == 6) {
                    C0996c cVar = new C0996c(this.f6946b, this.f6947c, a, "audio/g711-alaw", -1);
                    this.f6948d = cVar;
                } else if (i == 7) {
                    C0996c cVar2 = new C0996c(this.f6946b, this.f6947c, a, "audio/g711-mlaw", -1);
                    this.f6948d = cVar2;
                } else {
                    int a2 = WavUtil.m6617a(i, a.f6978f);
                    if (a2 != 0) {
                        C0996c cVar3 = new C0996c(this.f6946b, this.f6947c, a, "audio/raw", a2);
                        this.f6948d = cVar3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported WAV format type: ");
                        sb.append(a.f6973a);
                        throw new ParserException(sb.toString());
                    }
                }
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (this.f6949e == -1) {
            Pair b = WavHeaderReader.m8262b(kVar);
            this.f6949e = ((Long) b.first).intValue();
            long longValue = ((Long) b.second).longValue();
            this.f6950f = longValue;
            this.f6948d.mo6378a(this.f6949e, longValue);
        } else if (kVar.mo6206q() == 0) {
            kVar.mo6200i(this.f6949e);
        }
        Assertions.m10154f(this.f6950f != -1);
        if (this.f6948d.mo6380c(kVar, this.f6950f - kVar.mo6206q())) {
            return -1;
        }
        return 0;
    }
}
