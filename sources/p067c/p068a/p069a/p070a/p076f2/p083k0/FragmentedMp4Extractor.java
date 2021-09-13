package p067c.p068a.p069a.p070a.p076f2.p083k0;

import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p072b2.Ac4Util;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.CeaUtil;
import p067c.p068a.p069a.p070a.p076f2.ChunkIndex;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.GaplessInfoHolder;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p088h2.p090j.EventMessage;
import p067c.p068a.p069a.p070a.p088h2.p090j.EventMessageEncoder;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.k0.i */
public class FragmentedMp4Extractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6373a = C0942a.f6329b;

    /* renamed from: b */
    private static final byte[] f6374b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: c */
    private static final Format f6375c = new C1245b().mo7705e0("application/x-emsg").mo7679E();

    /* renamed from: A */
    private long f6376A;

    /* renamed from: B */
    private long f6377B;

    /* renamed from: C */
    private C0957b f6378C;

    /* renamed from: D */
    private int f6379D;

    /* renamed from: E */
    private int f6380E;

    /* renamed from: F */
    private int f6381F;

    /* renamed from: G */
    private boolean f6382G;

    /* renamed from: H */
    private ExtractorOutput f6383H;

    /* renamed from: I */
    private C0916b0[] f6384I;

    /* renamed from: J */
    private C0916b0[] f6385J;

    /* renamed from: K */
    private boolean f6386K;

    /* renamed from: d */
    private final int f6387d;

    /* renamed from: e */
    private final Track f6388e;

    /* renamed from: f */
    private final List<Format> f6389f;

    /* renamed from: g */
    private final SparseArray<C0957b> f6390g;

    /* renamed from: h */
    private final ParsableByteArray f6391h;

    /* renamed from: i */
    private final ParsableByteArray f6392i;

    /* renamed from: j */
    private final ParsableByteArray f6393j;

    /* renamed from: k */
    private final byte[] f6394k;

    /* renamed from: l */
    private final ParsableByteArray f6395l;

    /* renamed from: m */
    private final TimestampAdjuster f6396m;

    /* renamed from: n */
    private final EventMessageEncoder f6397n;

    /* renamed from: o */
    private final ParsableByteArray f6398o;

    /* renamed from: p */
    private final ArrayDeque<C0946a> f6399p;

    /* renamed from: q */
    private final ArrayDeque<C0956a> f6400q;

    /* renamed from: r */
    private final C0916b0 f6401r;

    /* renamed from: s */
    private int f6402s;

    /* renamed from: t */
    private int f6403t;

    /* renamed from: u */
    private long f6404u;

    /* renamed from: v */
    private int f6405v;

    /* renamed from: w */
    private ParsableByteArray f6406w;

    /* renamed from: x */
    private long f6407x;

    /* renamed from: y */
    private int f6408y;

    /* renamed from: z */
    private long f6409z;

    /* renamed from: c.a.a.a.f2.k0.i$a */
    /* compiled from: FragmentedMp4Extractor */
    private static final class C0956a {

        /* renamed from: a */
        public final long f6410a;

        /* renamed from: b */
        public final int f6411b;

        public C0956a(long j, int i) {
            this.f6410a = j;
            this.f6411b = i;
        }
    }

    /* renamed from: c.a.a.a.f2.k0.i$b */
    /* compiled from: FragmentedMp4Extractor */
    private static final class C0957b {

        /* renamed from: a */
        public final C0916b0 f6412a;

        /* renamed from: b */
        public final TrackFragment f6413b = new TrackFragment();

        /* renamed from: c */
        public final ParsableByteArray f6414c = new ParsableByteArray();

        /* renamed from: d */
        public TrackSampleTable f6415d;

        /* renamed from: e */
        public DefaultSampleValues f6416e;

        /* renamed from: f */
        public int f6417f;

        /* renamed from: g */
        public int f6418g;

        /* renamed from: h */
        public int f6419h;

        /* renamed from: i */
        public int f6420i;

        /* renamed from: j */
        private final ParsableByteArray f6421j = new ParsableByteArray(1);

        /* renamed from: k */
        private final ParsableByteArray f6422k = new ParsableByteArray();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f6423l;

        public C0957b(C0916b0 b0Var, TrackSampleTable rVar, DefaultSampleValues gVar) {
            this.f6412a = b0Var;
            this.f6415d = rVar;
            this.f6416e = gVar;
            mo6276j(rVar, gVar);
        }

        /* renamed from: c */
        public int mo6269c() {
            int i = !this.f6423l ? this.f6415d.f6507g[this.f6417f] : this.f6413b.f6493l[this.f6417f] ? 1 : 0;
            return mo6273g() != null ? i | 1073741824 : i;
        }

        /* renamed from: d */
        public long mo6270d() {
            if (!this.f6423l) {
                return this.f6415d.f6503c[this.f6417f];
            }
            return this.f6413b.f6488g[this.f6419h];
        }

        /* renamed from: e */
        public long mo6271e() {
            if (!this.f6423l) {
                return this.f6415d.f6506f[this.f6417f];
            }
            return this.f6413b.mo6286c(this.f6417f);
        }

        /* renamed from: f */
        public int mo6272f() {
            if (!this.f6423l) {
                return this.f6415d.f6504d[this.f6417f];
            }
            return this.f6413b.f6490i[this.f6417f];
        }

        /* renamed from: g */
        public TrackEncryptionBox mo6273g() {
            TrackEncryptionBox pVar = null;
            if (!this.f6423l) {
                return null;
            }
            int i = ((DefaultSampleValues) Util.m10293i(this.f6413b.f6482a)).f6363a;
            TrackEncryptionBox pVar2 = this.f6413b.f6496o;
            if (pVar2 == null) {
                pVar2 = this.f6415d.f6501a.mo6283a(i);
            }
            if (pVar2 != null && pVar2.f6477a) {
                pVar = pVar2;
            }
            return pVar;
        }

        /* renamed from: h */
        public boolean mo6274h() {
            this.f6417f++;
            if (!this.f6423l) {
                return false;
            }
            int i = this.f6418g + 1;
            this.f6418g = i;
            int[] iArr = this.f6413b.f6489h;
            int i2 = this.f6419h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f6419h = i2 + 1;
            this.f6418g = 0;
            return false;
        }

        /* renamed from: i */
        public int mo6275i(int i, int i2) {
            ParsableByteArray a0Var;
            TrackEncryptionBox g = mo6273g();
            if (g == null) {
                return 0;
            }
            int i3 = g.f6480d;
            if (i3 != 0) {
                a0Var = this.f6413b.f6497p;
            } else {
                byte[] bArr = (byte[]) Util.m10293i(g.f6481e);
                this.f6422k.mo7372N(bArr, bArr.length);
                ParsableByteArray a0Var2 = this.f6422k;
                i3 = bArr.length;
                a0Var = a0Var2;
            }
            boolean g2 = this.f6413b.mo6290g(this.f6417f);
            boolean z = g2 || i2 != 0;
            this.f6421j.mo7379d()[0] = (byte) ((z ? 128 : 0) | i3);
            this.f6421j.mo7374P(0);
            this.f6412a.mo6178e(this.f6421j, 1, 1);
            this.f6412a.mo6178e(a0Var, i3, 1);
            if (!z) {
                return i3 + 1;
            }
            if (!g2) {
                this.f6414c.mo7370L(8);
                byte[] d = this.f6414c.mo7379d();
                d[0] = 0;
                d[1] = 1;
                d[2] = (byte) ((i2 >> 8) & 255);
                d[3] = (byte) (i2 & 255);
                d[4] = (byte) ((i >> 24) & 255);
                d[5] = (byte) ((i >> 16) & 255);
                d[6] = (byte) ((i >> 8) & 255);
                d[7] = (byte) (i & 255);
                this.f6412a.mo6178e(this.f6414c, 8, 1);
                return i3 + 1 + 8;
            }
            ParsableByteArray a0Var3 = this.f6413b.f6497p;
            int J = a0Var3.mo7368J();
            a0Var3.mo7375Q(-2);
            int i4 = (J * 6) + 2;
            if (i2 != 0) {
                this.f6414c.mo7370L(i4);
                byte[] d2 = this.f6414c.mo7379d();
                a0Var3.mo7385j(d2, 0, i4);
                int i5 = (((d2[2] & 255) << 8) | (d2[3] & 255)) + i2;
                d2[2] = (byte) ((i5 >> 8) & 255);
                d2[3] = (byte) (i5 & 255);
                a0Var3 = this.f6414c;
            }
            this.f6412a.mo6178e(a0Var3, i4, 1);
            return i3 + 1 + i4;
        }

        /* renamed from: j */
        public void mo6276j(TrackSampleTable rVar, DefaultSampleValues gVar) {
            this.f6415d = rVar;
            this.f6416e = gVar;
            this.f6412a.mo6177d(rVar.f6501a.f6471f);
            mo6277k();
        }

        /* renamed from: k */
        public void mo6277k() {
            this.f6413b.mo6289f();
            this.f6417f = 0;
            this.f6419h = 0;
            this.f6418g = 0;
            this.f6420i = 0;
            this.f6423l = false;
        }

        /* renamed from: l */
        public void mo6278l(long j) {
            int i = this.f6417f;
            while (true) {
                TrackFragment qVar = this.f6413b;
                if (i < qVar.f6487f && qVar.mo6286c(i) < j) {
                    if (this.f6413b.f6493l[i]) {
                        this.f6420i = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: m */
        public void mo6279m() {
            TrackEncryptionBox g = mo6273g();
            if (g != null) {
                ParsableByteArray a0Var = this.f6413b.f6497p;
                int i = g.f6480d;
                if (i != 0) {
                    a0Var.mo7375Q(i);
                }
                if (this.f6413b.mo6290g(this.f6417f)) {
                    a0Var.mo7375Q(a0Var.mo7368J() * 6);
                }
            }
        }

        /* renamed from: n */
        public void mo6280n(DrmInitData tVar) {
            TrackEncryptionBox a = this.f6415d.f6501a.mo6283a(((DefaultSampleValues) Util.m10293i(this.f6413b.f6482a)).f6363a);
            this.f6412a.mo6177d(this.f6415d.f6501a.f6471f.mo7668l().mo7686L(tVar.mo6100n(a != null ? a.f6478b : null)).mo7679E());
        }
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    /* renamed from: A */
    private static void m7725A(ParsableByteArray a0Var, TrackFragment qVar) throws ParserException {
        m7760z(a0Var, 0, qVar);
    }

    /* renamed from: B */
    private static Pair<Long, ChunkIndex> m7726B(ParsableByteArray a0Var, long j) throws ParserException {
        long j2;
        long j3;
        ParsableByteArray a0Var2 = a0Var;
        a0Var2.mo7374P(8);
        int c = Atom.m7677c(a0Var.mo7389n());
        a0Var2.mo7375Q(4);
        long F = a0Var.mo7364F();
        if (c == 0) {
            j3 = a0Var.mo7364F();
            j2 = a0Var.mo7364F();
        } else {
            j3 = a0Var.mo7367I();
            j2 = a0Var.mo7367I();
        }
        long j4 = j3;
        long j5 = j + j2;
        long B0 = Util.m10240B0(j4, 1000000, F);
        a0Var2.mo7375Q(2);
        int J = a0Var.mo7368J();
        int[] iArr = new int[J];
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        long[] jArr3 = new long[J];
        long j6 = j4;
        long j7 = B0;
        int i = 0;
        while (i < J) {
            int n = a0Var.mo7389n();
            if ((n & Integer.MIN_VALUE) == 0) {
                long F2 = a0Var.mo7364F();
                iArr[i] = n & Integer.MAX_VALUE;
                jArr[i] = j5;
                jArr3[i] = j7;
                long j8 = j6 + F2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = J;
                int[] iArr2 = iArr;
                long[] jArr6 = jArr;
                long B02 = Util.m10240B0(j8, 1000000, F);
                jArr4[i] = B02 - jArr5[i];
                a0Var2.mo7375Q(4);
                j5 += (long) iArr2[i];
                i++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr6;
                J = i2;
                long j9 = B02;
                j6 = j8;
                j7 = j9;
            } else {
                throw new ParserException("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(B0), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: C */
    private static long m7727C(ParsableByteArray a0Var) {
        a0Var.mo7374P(8);
        return Atom.m7677c(a0Var.mo7389n()) == 1 ? a0Var.mo7367I() : a0Var.mo7364F();
    }

    /* renamed from: D */
    private static C0957b m7728D(ParsableByteArray a0Var, SparseArray<C0957b> sparseArray) {
        int i;
        int i2;
        int i3;
        int i4;
        a0Var.mo7374P(8);
        int b = Atom.m7676b(a0Var.mo7389n());
        C0957b k = m7746k(sparseArray, a0Var.mo7389n());
        if (k == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long I = a0Var.mo7367I();
            TrackFragment qVar = k.f6413b;
            qVar.f6484c = I;
            qVar.f6485d = I;
        }
        DefaultSampleValues gVar = k.f6416e;
        if ((b & 2) != 0) {
            i = a0Var.mo7389n() - 1;
        } else {
            i = gVar.f6363a;
        }
        if ((b & 8) != 0) {
            i2 = a0Var.mo7389n();
        } else {
            i2 = gVar.f6364b;
        }
        if ((b & 16) != 0) {
            i3 = a0Var.mo7389n();
        } else {
            i3 = gVar.f6365c;
        }
        if ((b & 32) != 0) {
            i4 = a0Var.mo7389n();
        } else {
            i4 = gVar.f6366d;
        }
        k.f6413b.f6482a = new DefaultSampleValues(i, i2, i3, i4);
        return k;
    }

    /* renamed from: E */
    private static void m7729E(C0946a aVar, SparseArray<C0957b> sparseArray, int i, byte[] bArr) throws ParserException {
        C0957b D = m7728D(((C0947b) Assertions.m10153e(aVar.mo6263g(1952868452))).f6337b, sparseArray);
        if (D != null) {
            TrackFragment qVar = D.f6413b;
            long j = qVar.f6499r;
            boolean z = qVar.f6500s;
            D.mo6277k();
            D.f6423l = true;
            C0947b g = aVar.mo6263g(1952867444);
            if (g == null || (i & 2) != 0) {
                qVar.f6499r = j;
                qVar.f6500s = z;
            } else {
                qVar.f6499r = m7727C(g.f6337b);
                qVar.f6500s = true;
            }
            m7732H(aVar, D, i);
            TrackEncryptionBox a = D.f6415d.f6501a.mo6283a(((DefaultSampleValues) Assertions.m10153e(qVar.f6482a)).f6363a);
            C0947b g2 = aVar.mo6263g(1935763834);
            if (g2 != null) {
                m7758x((TrackEncryptionBox) Assertions.m10153e(a), g2.f6337b, qVar);
            }
            C0947b g3 = aVar.mo6263g(1935763823);
            if (g3 != null) {
                m7757w(g3.f6337b, qVar);
            }
            C0947b g4 = aVar.mo6263g(1936027235);
            if (g4 != null) {
                m7725A(g4.f6337b, qVar);
            }
            m7759y(aVar, a != null ? a.f6478b : null, qVar);
            int size = aVar.f6335c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0947b bVar = (C0947b) aVar.f6335c.get(i2);
                if (bVar.f6333a == 1970628964) {
                    m7733I(bVar.f6337b, qVar, bArr);
                }
            }
        }
    }

    /* renamed from: F */
    private static Pair<Integer, DefaultSampleValues> m7730F(ParsableByteArray a0Var) {
        a0Var.mo7374P(12);
        return Pair.create(Integer.valueOf(a0Var.mo7389n()), new DefaultSampleValues(a0Var.mo7389n() - 1, a0Var.mo7389n(), a0Var.mo7389n(), a0Var.mo7389n()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m7731G(p067c.p068a.p069a.p070a.p076f2.p083k0.FragmentedMp4Extractor.C0957b r36, int r37, int r38, p067c.p068a.p069a.p070a.p111m2.ParsableByteArray r39, int r40) throws p067c.p068a.p069a.p070a.ParserException {
        /*
            r0 = r36
            r1 = 8
            r2 = r39
            r2.mo7374P(r1)
            int r1 = r39.mo7389n()
            int r1 = p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.m7676b(r1)
            c.a.a.a.f2.k0.r r3 = r0.f6415d
            c.a.a.a.f2.k0.o r3 = r3.f6501a
            c.a.a.a.f2.k0.q r4 = r0.f6413b
            c.a.a.a.f2.k0.g r5 = r4.f6482a
            java.lang.Object r5 = p067c.p068a.p069a.p070a.p111m2.Util.m10293i(r5)
            c.a.a.a.f2.k0.g r5 = (p067c.p068a.p069a.p070a.p076f2.p083k0.DefaultSampleValues) r5
            int[] r6 = r4.f6489h
            int r7 = r39.mo7366H()
            r6[r37] = r7
            long[] r6 = r4.f6488g
            long r7 = r4.f6484c
            r6[r37] = r7
            r7 = r1 & 1
            if (r7 == 0) goto L_0x003b
            r7 = r6[r37]
            int r9 = r39.mo7389n()
            long r9 = (long) r9
            long r7 = r7 + r9
            r6[r37] = r7
        L_0x003b:
            r6 = r1 & 4
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            int r9 = r5.f6366d
            if (r6 == 0) goto L_0x004c
            int r9 = r39.mo7389n()
        L_0x004c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0052
            r10 = 1
            goto L_0x0053
        L_0x0052:
            r10 = 0
        L_0x0053:
            r11 = r1 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0059
            r11 = 1
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0060
            r12 = 1
            goto L_0x0061
        L_0x0060:
            r12 = 0
        L_0x0061:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            long[] r13 = r3.f6473h
            if (r13 == 0) goto L_0x008d
            int r14 = r13.length
            if (r14 != r8) goto L_0x008d
            r14 = r13[r7]
            r16 = 0
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x008f
            long[] r13 = r3.f6474i
            java.lang.Object r13 = p067c.p068a.p069a.p070a.p111m2.Util.m10293i(r13)
            long[] r13 = (long[]) r13
            r14 = r13[r7]
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r3.f6468c
            r18 = r7
            long r14 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r14, r16, r18)
            goto L_0x0091
        L_0x008d:
            r16 = 0
        L_0x008f:
            r14 = r16
        L_0x0091:
            int[] r7 = r4.f6490i
            int[] r8 = r4.f6491j
            long[] r13 = r4.f6492k
            boolean[] r2 = r4.f6493l
            r17 = r9
            int r9 = r3.f6467b
            r18 = r2
            r2 = 2
            if (r9 != r2) goto L_0x00a9
            r2 = 1
            r9 = r38 & 1
            if (r9 == 0) goto L_0x00a9
            r2 = 1
            goto L_0x00aa
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            int[] r9 = r4.f6489h
            r9 = r9[r37]
            int r9 = r40 + r9
            r38 = r2
            long r2 = r3.f6468c
            r27 = r14
            r15 = r13
            long r13 = r4.f6499r
            r29 = r13
            r13 = r40
        L_0x00bd:
            if (r13 >= r9) goto L_0x0162
            if (r10 == 0) goto L_0x00c6
            int r14 = r39.mo7389n()
            goto L_0x00c8
        L_0x00c6:
            int r14 = r5.f6364b
        L_0x00c8:
            int r14 = m7741d(r14)
            if (r11 == 0) goto L_0x00d9
            int r19 = r39.mo7389n()
            r35 = r19
            r19 = r10
            r10 = r35
            goto L_0x00dd
        L_0x00d9:
            r19 = r10
            int r10 = r5.f6365c
        L_0x00dd:
            int r10 = m7741d(r10)
            if (r12 == 0) goto L_0x00ec
            int r21 = r39.mo7389n()
            r31 = r6
            r6 = r21
            goto L_0x00f9
        L_0x00ec:
            if (r13 != 0) goto L_0x00f5
            if (r6 == 0) goto L_0x00f5
            r31 = r6
            r6 = r17
            goto L_0x00f9
        L_0x00f5:
            r31 = r6
            int r6 = r5.f6366d
        L_0x00f9:
            if (r1 == 0) goto L_0x0112
            r32 = r1
            int r1 = r39.mo7389n()
            r33 = r11
            r34 = r12
            long r11 = (long) r1
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r21
            long r11 = r11 / r2
            int r1 = (int) r11
            r8[r13] = r1
            r16 = 0
            goto L_0x011c
        L_0x0112:
            r32 = r1
            r33 = r11
            r34 = r12
            r16 = 0
            r8[r13] = r16
        L_0x011c:
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r29
            r25 = r2
            long r11 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r21, r23, r25)
            long r11 = r11 - r27
            r15[r13] = r11
            boolean r1 = r4.f6500s
            if (r1 != 0) goto L_0x0138
            r11 = r15[r13]
            c.a.a.a.f2.k0.r r1 = r0.f6415d
            long r0 = r1.f6508h
            long r11 = r11 + r0
            r15[r13] = r11
        L_0x0138:
            r7[r13] = r10
            int r0 = r6 >> 16
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0146
            if (r38 == 0) goto L_0x0144
            if (r13 != 0) goto L_0x0146
        L_0x0144:
            r0 = 1
            goto L_0x0147
        L_0x0146:
            r0 = 0
        L_0x0147:
            r18[r13] = r0
            long r10 = (long) r14
            r20 = r2
            r1 = r29
            long r29 = r1 + r10
            int r13 = r13 + 1
            r0 = r36
            r10 = r19
            r2 = r20
            r6 = r31
            r1 = r32
            r11 = r33
            r12 = r34
            goto L_0x00bd
        L_0x0162:
            r1 = r29
            r4.f6499r = r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p083k0.FragmentedMp4Extractor.m7731G(c.a.a.a.f2.k0.i$b, int, int, c.a.a.a.m2.a0, int):int");
    }

    /* renamed from: H */
    private static void m7732H(C0946a aVar, C0957b bVar, int i) throws ParserException {
        List<C0947b> list = aVar.f6335c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0947b bVar2 = (C0947b) list.get(i4);
            if (bVar2.f6333a == 1953658222) {
                ParsableByteArray a0Var = bVar2.f6337b;
                a0Var.mo7374P(12);
                int H = a0Var.mo7366H();
                if (H > 0) {
                    i3 += H;
                    i2++;
                }
            }
        }
        bVar.f6419h = 0;
        bVar.f6418g = 0;
        bVar.f6417f = 0;
        bVar.f6413b.mo6288e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C0947b bVar3 = (C0947b) list.get(i7);
            if (bVar3.f6333a == 1953658222) {
                int i8 = i5 + 1;
                i6 = m7731G(bVar, i5, i, bVar3.f6337b, i6);
                i5 = i8;
            }
        }
    }

    /* renamed from: I */
    private static void m7733I(ParsableByteArray a0Var, TrackFragment qVar, byte[] bArr) throws ParserException {
        a0Var.mo7374P(8);
        a0Var.mo7385j(bArr, 0, 16);
        if (Arrays.equals(bArr, f6374b)) {
            m7760z(a0Var, 16, qVar);
        }
    }

    /* renamed from: J */
    private void m7734J(long j) throws ParserException {
        while (!this.f6399p.isEmpty() && ((C0946a) this.f6399p.peek()).f6334b == j) {
            m7749o((C0946a) this.f6399p.pop());
        }
        m7742f();
    }

    /* renamed from: K */
    private boolean m7735K(ExtractorInput kVar) throws IOException {
        if (this.f6405v == 0) {
            if (!kVar.mo6197d(this.f6398o.mo7379d(), 0, 8, true)) {
                return false;
            }
            this.f6405v = 8;
            this.f6398o.mo7374P(0);
            this.f6404u = this.f6398o.mo7364F();
            this.f6403t = this.f6398o.mo7389n();
        }
        long j = this.f6404u;
        if (j == 1) {
            kVar.readFully(this.f6398o.mo7379d(), 8, 8);
            this.f6405v += 8;
            this.f6404u = this.f6398o.mo7367I();
        } else if (j == 0) {
            long a = kVar.mo6194a();
            if (a == -1 && !this.f6399p.isEmpty()) {
                a = ((C0946a) this.f6399p.peek()).f6334b;
            }
            if (a != -1) {
                this.f6404u = (a - kVar.mo6206q()) + ((long) this.f6405v);
            }
        }
        if (this.f6404u >= ((long) this.f6405v)) {
            long q = kVar.mo6206q() - ((long) this.f6405v);
            int i = this.f6403t;
            if ((i == 1836019558 || i == 1835295092) && !this.f6386K) {
                this.f6383H.mo6216f(new C1003b(this.f6376A, q));
                this.f6386K = true;
            }
            if (this.f6403t == 1836019558) {
                int size = this.f6390g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TrackFragment qVar = ((C0957b) this.f6390g.valueAt(i2)).f6413b;
                    qVar.f6483b = q;
                    qVar.f6485d = q;
                    qVar.f6484c = q;
                }
            }
            int i3 = this.f6403t;
            if (i3 == 1835295092) {
                this.f6378C = null;
                this.f6407x = q + this.f6404u;
                this.f6402s = 2;
                return true;
            }
            if (m7739O(i3)) {
                long q2 = (kVar.mo6206q() + this.f6404u) - 8;
                this.f6399p.push(new C0946a(this.f6403t, q2));
                if (this.f6404u == ((long) this.f6405v)) {
                    m7734J(q2);
                } else {
                    m7742f();
                }
            } else if (m7740P(this.f6403t)) {
                if (this.f6405v == 8) {
                    long j2 = this.f6404u;
                    if (j2 <= 2147483647L) {
                        ParsableByteArray a0Var = new ParsableByteArray((int) j2);
                        System.arraycopy(this.f6398o.mo7379d(), 0, a0Var.mo7379d(), 0, 8);
                        this.f6406w = a0Var;
                        this.f6402s = 1;
                    } else {
                        throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f6404u <= 2147483647L) {
                this.f6406w = null;
                this.f6402s = 1;
            } else {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    /* renamed from: L */
    private void m7736L(ExtractorInput kVar) throws IOException {
        int i = ((int) this.f6404u) - this.f6405v;
        ParsableByteArray a0Var = this.f6406w;
        if (a0Var != null) {
            kVar.readFully(a0Var.mo7379d(), 8, i);
            m7751q(new C0947b(this.f6403t, a0Var), kVar.mo6206q());
        } else {
            kVar.mo6200i(i);
        }
        m7734J(kVar.mo6206q());
    }

    /* renamed from: M */
    private void m7737M(ExtractorInput kVar) throws IOException {
        int size = this.f6390g.size();
        C0957b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            TrackFragment qVar = ((C0957b) this.f6390g.valueAt(i)).f6413b;
            if (qVar.f6498q) {
                long j2 = qVar.f6485d;
                if (j2 < j) {
                    bVar = (C0957b) this.f6390g.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.f6402s = 3;
            return;
        }
        int q = (int) (j - kVar.mo6206q());
        if (q >= 0) {
            kVar.mo6200i(q);
            bVar.f6413b.mo6284a(kVar);
            return;
        }
        throw new ParserException("Offset to encryption data was negative.");
    }

    /* renamed from: N */
    private boolean m7738N(ExtractorInput kVar) throws IOException {
        int i;
        ExtractorInput kVar2 = kVar;
        C0957b bVar = this.f6378C;
        if (bVar == null) {
            bVar = m7745j(this.f6390g);
            if (bVar == null) {
                int q = (int) (this.f6407x - kVar.mo6206q());
                if (q >= 0) {
                    kVar2.mo6200i(q);
                    m7742f();
                    return false;
                }
                throw new ParserException("Offset to end of mdat was negative.");
            }
            int d = (int) (bVar.mo6270d() - kVar.mo6206q());
            if (d < 0) {
                Log.m10386h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d = 0;
            }
            kVar2.mo6200i(d);
            this.f6378C = bVar;
        }
        int i2 = 4;
        int i3 = 1;
        if (this.f6402s == 3) {
            int f = bVar.mo6272f();
            this.f6379D = f;
            if (bVar.f6417f < bVar.f6420i) {
                kVar2.mo6200i(f);
                bVar.mo6279m();
                if (!bVar.mo6274h()) {
                    this.f6378C = null;
                }
                this.f6402s = 3;
                return true;
            }
            if (bVar.f6415d.f6501a.f6472g == 1) {
                this.f6379D = f - 8;
                kVar2.mo6200i(8);
            }
            if ("audio/ac4".equals(bVar.f6415d.f6501a.f6471f.f8814l)) {
                this.f6380E = bVar.mo6275i(this.f6379D, 7);
                Ac4Util.m6634a(this.f6379D, this.f6395l);
                bVar.f6412a.mo6174a(this.f6395l, 7);
                this.f6380E += 7;
            } else {
                this.f6380E = bVar.mo6275i(this.f6379D, 0);
            }
            this.f6379D += this.f6380E;
            this.f6402s = 4;
            this.f6381F = 0;
        }
        Track oVar = bVar.f6415d.f6501a;
        C0916b0 b0Var = bVar.f6412a;
        long e = bVar.mo6271e();
        TimestampAdjuster j0Var = this.f6396m;
        if (j0Var != null) {
            e = j0Var.mo7446a(e);
        }
        long j = e;
        if (oVar.f6475j == 0) {
            while (true) {
                int i4 = this.f6380E;
                int i5 = this.f6379D;
                if (i4 >= i5) {
                    break;
                }
                this.f6380E += b0Var.mo6179f(kVar2, i5 - i4, false);
            }
        } else {
            byte[] d2 = this.f6392i.mo7379d();
            d2[0] = 0;
            d2[1] = 0;
            d2[2] = 0;
            int i6 = oVar.f6475j;
            int i7 = i6 + 1;
            int i8 = 4 - i6;
            while (this.f6380E < this.f6379D) {
                int i9 = this.f6381F;
                if (i9 == 0) {
                    kVar2.readFully(d2, i8, i7);
                    this.f6392i.mo7374P(0);
                    int n = this.f6392i.mo7389n();
                    if (n >= i3) {
                        this.f6381F = n - 1;
                        this.f6391h.mo7374P(0);
                        b0Var.mo6174a(this.f6391h, i2);
                        b0Var.mo6174a(this.f6392i, i3);
                        this.f6382G = this.f6385J.length > 0 && NalUnitUtil.m10424g(oVar.f6471f.f8814l, d2[i2]);
                        this.f6380E += 5;
                        this.f6379D += i8;
                    } else {
                        throw new ParserException("Invalid NAL length");
                    }
                } else {
                    if (this.f6382G) {
                        this.f6393j.mo7370L(i9);
                        kVar2.readFully(this.f6393j.mo7379d(), 0, this.f6381F);
                        b0Var.mo6174a(this.f6393j, this.f6381F);
                        i = this.f6381F;
                        int k = NalUnitUtil.m10428k(this.f6393j.mo7379d(), this.f6393j.mo7381f());
                        this.f6393j.mo7374P("video/hevc".equals(oVar.f6471f.f8814l) ? 1 : 0);
                        this.f6393j.mo7373O(k);
                        CeaUtil.m7341a(j, this.f6393j, this.f6385J);
                    } else {
                        i = b0Var.mo6179f(kVar2, i9, false);
                    }
                    this.f6380E += i;
                    this.f6381F -= i;
                    i2 = 4;
                    i3 = 1;
                }
            }
        }
        int c = bVar.mo6269c();
        TrackEncryptionBox g = bVar.mo6273g();
        long j2 = j;
        b0Var.mo6176c(j, c, this.f6379D, 0, g != null ? g.f6479c : null);
        m7754t(j2);
        if (!bVar.mo6274h()) {
            this.f6378C = null;
        }
        this.f6402s = 3;
        return true;
    }

    /* renamed from: O */
    private static boolean m7739O(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* renamed from: P */
    private static boolean m7740P(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* renamed from: d */
    private static int m7741d(int i) throws ParserException {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw new ParserException(sb.toString());
    }

    /* renamed from: f */
    private void m7742f() {
        this.f6402s = 0;
        this.f6405v = 0;
    }

    /* renamed from: g */
    private DefaultSampleValues m7743g(SparseArray<DefaultSampleValues> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (DefaultSampleValues) sparseArray.valueAt(0);
        }
        return (DefaultSampleValues) Assertions.m10153e((DefaultSampleValues) sparseArray.get(i));
    }

    /* renamed from: h */
    private static DrmInitData m7744h(List<C0947b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C0947b bVar = (C0947b) list.get(i);
            if (bVar.f6333a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d = bVar.f6337b.mo7379d();
                UUID f = PsshAtomUtil.m7827f(d);
                if (f == null) {
                    Log.m10386h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C0894b(f, "video/mp4", d));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((List<C0894b>) arrayList);
    }

    /* renamed from: j */
    private static C0957b m7745j(SparseArray<C0957b> sparseArray) {
        int size = sparseArray.size();
        C0957b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C0957b bVar2 = (C0957b) sparseArray.valueAt(i);
            if ((bVar2.f6423l || bVar2.f6417f != bVar2.f6415d.f6502b) && (!bVar2.f6423l || bVar2.f6419h != bVar2.f6413b.f6486e)) {
                long d = bVar2.mo6270d();
                if (d < j) {
                    bVar = bVar2;
                    j = d;
                }
            }
        }
        return bVar;
    }

    /* renamed from: k */
    private static C0957b m7746k(SparseArray<C0957b> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (C0957b) sparseArray.valueAt(0);
        }
        return (C0957b) sparseArray.get(i);
    }

    /* renamed from: l */
    private void m7747l() {
        int i;
        C0916b0[] b0VarArr = new C0916b0[2];
        this.f6384I = b0VarArr;
        C0916b0 b0Var = this.f6401r;
        int i2 = 0;
        if (b0Var != null) {
            b0VarArr[0] = b0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f6387d & 4) != 0) {
            int i4 = i + 1;
            b0VarArr[i] = this.f6383H.mo6218q(100, 5);
            i = i4;
            i3 = 101;
        }
        C0916b0[] b0VarArr2 = (C0916b0[]) Util.m10320v0(this.f6384I, i);
        this.f6384I = b0VarArr2;
        for (C0916b0 d : b0VarArr2) {
            d.mo6177d(f6375c);
        }
        this.f6385J = new C0916b0[this.f6389f.size()];
        while (i2 < this.f6385J.length) {
            int i5 = i3 + 1;
            C0916b0 q = this.f6383H.mo6218q(i3, 3);
            q.mo6177d((Format) this.f6389f.get(i2));
            this.f6385J[i2] = q;
            i2++;
            i3 = i5;
        }
    }

    /* renamed from: m */
    static /* synthetic */ Extractor[] m7748m() {
        return new Extractor[]{new FragmentedMp4Extractor()};
    }

    /* renamed from: o */
    private void m7749o(C0946a aVar) throws ParserException {
        int i = aVar.f6333a;
        if (i == 1836019574) {
            m7753s(aVar);
        } else if (i == 1836019558) {
            m7752r(aVar);
        } else if (!this.f6399p.isEmpty()) {
            ((C0946a) this.f6399p.peek()).mo6260d(aVar);
        }
    }

    /* renamed from: p */
    private void m7750p(ParsableByteArray a0Var) {
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        long j4;
        C0916b0[] b0VarArr;
        ParsableByteArray a0Var2 = a0Var;
        if (this.f6384I.length != 0) {
            a0Var2.mo7374P(8);
            int c = Atom.m7677c(a0Var.mo7389n());
            if (c == 0) {
                String str3 = (String) Assertions.m10153e(a0Var.mo7399x());
                String str4 = (String) Assertions.m10153e(a0Var.mo7399x());
                long F = a0Var.mo7364F();
                j4 = Util.m10240B0(a0Var.mo7364F(), 1000000, F);
                long j5 = this.f6377B;
                long j6 = j5 != -9223372036854775807L ? j5 + j4 : -9223372036854775807L;
                str2 = str3;
                j2 = Util.m10240B0(a0Var.mo7364F(), 1000, F);
                str = str4;
                j = a0Var.mo7364F();
                j3 = j6;
            } else if (c != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping unsupported emsg version: ");
                sb.append(c);
                Log.m10386h("FragmentedMp4Extractor", sb.toString());
                return;
            } else {
                long F2 = a0Var.mo7364F();
                j3 = Util.m10240B0(a0Var.mo7367I(), 1000000, F2);
                str2 = (String) Assertions.m10153e(a0Var.mo7399x());
                j2 = Util.m10240B0(a0Var.mo7364F(), 1000, F2);
                j = a0Var.mo7364F();
                str = (String) Assertions.m10153e(a0Var.mo7399x());
                j4 = -9223372036854775807L;
            }
            byte[] bArr = new byte[a0Var.mo7376a()];
            a0Var2.mo7385j(bArr, 0, a0Var.mo7376a());
            EventMessage aVar = new EventMessage(str2, str, j2, j, bArr);
            ParsableByteArray a0Var3 = new ParsableByteArray(this.f6397n.mo6584a(aVar));
            int a = a0Var3.mo7376a();
            for (C0916b0 b0Var : this.f6384I) {
                a0Var3.mo7374P(0);
                b0Var.mo6174a(a0Var3, a);
            }
            if (j3 == -9223372036854775807L) {
                this.f6400q.addLast(new C0956a(j4, a));
                this.f6408y += a;
            } else {
                TimestampAdjuster j0Var = this.f6396m;
                if (j0Var != null) {
                    j3 = j0Var.mo7446a(j3);
                }
                for (C0916b0 c2 : this.f6384I) {
                    c2.mo6176c(j3, 1, a, 0, null);
                }
            }
        }
    }

    /* renamed from: q */
    private void m7751q(C0947b bVar, long j) throws ParserException {
        if (!this.f6399p.isEmpty()) {
            ((C0946a) this.f6399p.peek()).mo6261e(bVar);
            return;
        }
        int i = bVar.f6333a;
        if (i == 1936286840) {
            Pair B = m7726B(bVar.f6337b, j);
            this.f6377B = ((Long) B.first).longValue();
            this.f6383H.mo6216f((SeekMap) B.second);
            this.f6386K = true;
        } else if (i == 1701671783) {
            m7750p(bVar.f6337b);
        }
    }

    /* renamed from: r */
    private void m7752r(C0946a aVar) throws ParserException {
        m7756v(aVar, this.f6390g, this.f6387d, this.f6394k);
        DrmInitData h = m7744h(aVar.f6335c);
        if (h != null) {
            int size = this.f6390g.size();
            for (int i = 0; i < size; i++) {
                ((C0957b) this.f6390g.valueAt(i)).mo6280n(h);
            }
        }
        if (this.f6409z != -9223372036854775807L) {
            int size2 = this.f6390g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C0957b) this.f6390g.valueAt(i2)).mo6278l(this.f6409z);
            }
            this.f6409z = -9223372036854775807L;
        }
    }

    /* renamed from: s */
    private void m7753s(C0946a aVar) throws ParserException {
        boolean z = true;
        int i = 0;
        Assertions.m10155g(this.f6388e == null, "Unexpected moov box.");
        DrmInitData h = m7744h(aVar.f6335c);
        C0946a aVar2 = (C0946a) Assertions.m10153e(aVar.mo6262f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f6335c.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            C0947b bVar = (C0947b) aVar2.f6335c.get(i2);
            int i3 = bVar.f6333a;
            if (i3 == 1953654136) {
                Pair F = m7730F(bVar.f6337b);
                sparseArray.put(((Integer) F.first).intValue(), (DefaultSampleValues) F.second);
            } else if (i3 == 1835362404) {
                j = m7755u(bVar.f6337b);
            }
        }
        List z2 = AtomParsers.m7710z(aVar, new GaplessInfoHolder(), j, h, (this.f6387d & 16) != 0, false, new C0945d(this));
        int size2 = z2.size();
        if (this.f6390g.size() == 0) {
            while (i < size2) {
                TrackSampleTable rVar = (TrackSampleTable) z2.get(i);
                Track oVar = rVar.f6501a;
                this.f6390g.put(oVar.f6466a, new C0957b(this.f6383H.mo6218q(i, oVar.f6467b), rVar, m7743g(sparseArray, oVar.f6466a)));
                this.f6376A = Math.max(this.f6376A, oVar.f6470e);
                i++;
            }
            this.f6383H.mo6217h();
            return;
        }
        if (this.f6390g.size() != size2) {
            z = false;
        }
        Assertions.m10154f(z);
        while (i < size2) {
            TrackSampleTable rVar2 = (TrackSampleTable) z2.get(i);
            Track oVar2 = rVar2.f6501a;
            ((C0957b) this.f6390g.get(oVar2.f6466a)).mo6276j(rVar2, m7743g(sparseArray, oVar2.f6466a));
            i++;
        }
    }

    /* renamed from: t */
    private void m7754t(long j) {
        while (!this.f6400q.isEmpty()) {
            C0956a aVar = (C0956a) this.f6400q.removeFirst();
            this.f6408y -= aVar.f6411b;
            long j2 = aVar.f6410a + j;
            TimestampAdjuster j0Var = this.f6396m;
            if (j0Var != null) {
                j2 = j0Var.mo7446a(j2);
            }
            for (C0916b0 c : this.f6384I) {
                c.mo6176c(j2, 1, aVar.f6411b, this.f6408y, null);
            }
        }
    }

    /* renamed from: u */
    private static long m7755u(ParsableByteArray a0Var) {
        a0Var.mo7374P(8);
        return Atom.m7677c(a0Var.mo7389n()) == 0 ? a0Var.mo7364F() : a0Var.mo7367I();
    }

    /* renamed from: v */
    private static void m7756v(C0946a aVar, SparseArray<C0957b> sparseArray, int i, byte[] bArr) throws ParserException {
        int size = aVar.f6336d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0946a aVar2 = (C0946a) aVar.f6336d.get(i2);
            if (aVar2.f6333a == 1953653094) {
                m7729E(aVar2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: w */
    private static void m7757w(ParsableByteArray a0Var, TrackFragment qVar) throws ParserException {
        a0Var.mo7374P(8);
        int n = a0Var.mo7389n();
        if ((Atom.m7676b(n) & 1) == 1) {
            a0Var.mo7375Q(8);
        }
        int H = a0Var.mo7366H();
        if (H == 1) {
            qVar.f6485d += Atom.m7677c(n) == 0 ? a0Var.mo7364F() : a0Var.mo7367I();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected saio entry count: ");
        sb.append(H);
        throw new ParserException(sb.toString());
    }

    /* renamed from: x */
    private static void m7758x(TrackEncryptionBox pVar, ParsableByteArray a0Var, TrackFragment qVar) throws ParserException {
        int i;
        int i2 = pVar.f6480d;
        a0Var.mo7374P(8);
        boolean z = true;
        if ((Atom.m7676b(a0Var.mo7389n()) & 1) == 1) {
            a0Var.mo7375Q(8);
        }
        int D = a0Var.mo7362D();
        int H = a0Var.mo7366H();
        if (H <= qVar.f6487f) {
            if (D == 0) {
                boolean[] zArr = qVar.f6495n;
                i = 0;
                for (int i3 = 0; i3 < H; i3++) {
                    int D2 = a0Var.mo7362D();
                    i += D2;
                    zArr[i3] = D2 > i2;
                }
            } else {
                if (D <= i2) {
                    z = false;
                }
                i = (D * H) + 0;
                Arrays.fill(qVar.f6495n, 0, H, z);
            }
            Arrays.fill(qVar.f6495n, H, qVar.f6487f, false);
            if (i > 0) {
                qVar.mo6287d(i);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Saiz sample count ");
        sb.append(H);
        sb.append(" is greater than fragment sample count");
        sb.append(qVar.f6487f);
        throw new ParserException(sb.toString());
    }

    /* renamed from: y */
    private static void m7759y(C0946a aVar, String str, TrackFragment qVar) throws ParserException {
        C0946a aVar2 = aVar;
        TrackFragment qVar2 = qVar;
        byte[] bArr = null;
        ParsableByteArray a0Var = null;
        ParsableByteArray a0Var2 = null;
        for (int i = 0; i < aVar2.f6335c.size(); i++) {
            C0947b bVar = (C0947b) aVar2.f6335c.get(i);
            ParsableByteArray a0Var3 = bVar.f6337b;
            int i2 = bVar.f6333a;
            if (i2 == 1935828848) {
                a0Var3.mo7374P(12);
                if (a0Var3.mo7389n() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i2 == 1936158820) {
                a0Var3.mo7374P(12);
                if (a0Var3.mo7389n() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var != null && a0Var2 != null) {
            a0Var.mo7374P(8);
            int c = Atom.m7677c(a0Var.mo7389n());
            a0Var.mo7375Q(4);
            if (c == 1) {
                a0Var.mo7375Q(4);
            }
            if (a0Var.mo7389n() == 1) {
                a0Var2.mo7374P(8);
                int c2 = Atom.m7677c(a0Var2.mo7389n());
                a0Var2.mo7375Q(4);
                if (c2 == 1) {
                    if (a0Var2.mo7364F() == 0) {
                        throw new ParserException("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c2 >= 2) {
                    a0Var2.mo7375Q(4);
                }
                if (a0Var2.mo7364F() == 1) {
                    a0Var2.mo7375Q(1);
                    int D = a0Var2.mo7362D();
                    int i3 = (D & 240) >> 4;
                    int i4 = D & 15;
                    boolean z = a0Var2.mo7362D() == 1;
                    if (z) {
                        int D2 = a0Var2.mo7362D();
                        byte[] bArr2 = new byte[16];
                        a0Var2.mo7385j(bArr2, 0, 16);
                        if (D2 == 0) {
                            int D3 = a0Var2.mo7362D();
                            bArr = new byte[D3];
                            a0Var2.mo7385j(bArr, 0, D3);
                        }
                        byte[] bArr3 = bArr;
                        qVar2.f6494m = true;
                        TrackEncryptionBox pVar = new TrackEncryptionBox(z, str, D2, bArr2, i3, i4, bArr3);
                        qVar2.f6496o = pVar;
                        return;
                    }
                    return;
                }
                throw new ParserException("Entry count in sgpd != 1 (unsupported).");
            }
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: z */
    private static void m7760z(ParsableByteArray a0Var, int i, TrackFragment qVar) throws ParserException {
        a0Var.mo7374P(i + 8);
        int b = Atom.m7676b(a0Var.mo7389n());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int H = a0Var.mo7366H();
            if (H == 0) {
                Arrays.fill(qVar.f6495n, 0, qVar.f6487f, false);
            } else if (H == qVar.f6487f) {
                Arrays.fill(qVar.f6495n, 0, H, z);
                qVar.mo6287d(a0Var.mo7376a());
                qVar.mo6285b(a0Var);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Senc sample count ");
                sb.append(H);
                sb.append(" is different from fragment sample count");
                sb.append(qVar.f6487f);
                throw new ParserException(sb.toString());
            }
        } else {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6383H = lVar;
        m7742f();
        m7747l();
        Track oVar = this.f6388e;
        if (oVar != null) {
            C0916b0 q = lVar.mo6218q(0, oVar.f6467b);
            TrackSampleTable rVar = new TrackSampleTable(this.f6388e, new long[0], new int[0], 0, new long[0], new int[0], 0);
            this.f6390g.put(0, new C0957b(q, rVar, new DefaultSampleValues(0, 0, 0, 0)));
            this.f6383H.mo6217h();
        }
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        int size = this.f6390g.size();
        for (int i = 0; i < size; i++) {
            ((C0957b) this.f6390g.valueAt(i)).mo6277k();
        }
        this.f6400q.clear();
        this.f6408y = 0;
        this.f6409z = j2;
        this.f6399p.clear();
        m7742f();
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        return C0961n.m7840b(kVar);
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        while (true) {
            int i = this.f6402s;
            if (i != 0) {
                if (i == 1) {
                    m7736L(kVar);
                } else if (i == 2) {
                    m7737M(kVar);
                } else if (m7738N(kVar)) {
                    return 0;
                }
            } else if (!m7735K(kVar)) {
                return -1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Track mo6268n(Track oVar) {
        return oVar;
    }

    public FragmentedMp4Extractor(int i) {
        this(i, null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster j0Var) {
        this(i, j0Var, null, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster j0Var, Track oVar, List<Format> list) {
        this(i, j0Var, oVar, list, null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster j0Var, Track oVar, List<Format> list, C0916b0 b0Var) {
        this.f6387d = i;
        this.f6396m = j0Var;
        this.f6388e = oVar;
        this.f6389f = Collections.unmodifiableList(list);
        this.f6401r = b0Var;
        this.f6397n = new EventMessageEncoder();
        this.f6398o = new ParsableByteArray(16);
        this.f6391h = new ParsableByteArray(NalUnitUtil.f8442a);
        this.f6392i = new ParsableByteArray(5);
        this.f6393j = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.f6394k = bArr;
        this.f6395l = new ParsableByteArray(bArr);
        this.f6399p = new ArrayDeque<>();
        this.f6400q = new ArrayDeque<>();
        this.f6390g = new SparseArray<>();
        this.f6376A = -9223372036854775807L;
        this.f6409z = -9223372036854775807L;
        this.f6377B = -9223372036854775807L;
        this.f6383H = ExtractorOutput.f6509F;
        this.f6384I = new C0916b0[0];
        this.f6385J = new C0916b0[0];
    }
}
