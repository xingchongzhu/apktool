package p067c.p068a.p069a.p070a.p076f2.p083k0;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p072b2.Ac4Util;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.GaplessInfoHolder;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p076f2.SeekPoint;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p094n.MotionPhotoMetadata;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.k0.k */
public final class Mp4Extractor implements Extractor, SeekMap {

    /* renamed from: a */
    public static final C0998o f6425a = C0944c.f6331b;

    /* renamed from: b */
    private final int f6426b;

    /* renamed from: c */
    private final ParsableByteArray f6427c;

    /* renamed from: d */
    private final ParsableByteArray f6428d;

    /* renamed from: e */
    private final ParsableByteArray f6429e;

    /* renamed from: f */
    private final ParsableByteArray f6430f;

    /* renamed from: g */
    private final ArrayDeque<C0946a> f6431g;

    /* renamed from: h */
    private final SefReader f6432h;

    /* renamed from: i */
    private final List<C1034b> f6433i;

    /* renamed from: j */
    private int f6434j;

    /* renamed from: k */
    private int f6435k;

    /* renamed from: l */
    private long f6436l;

    /* renamed from: m */
    private int f6437m;

    /* renamed from: n */
    private ParsableByteArray f6438n;

    /* renamed from: o */
    private int f6439o;

    /* renamed from: p */
    private int f6440p;

    /* renamed from: q */
    private int f6441q;

    /* renamed from: r */
    private int f6442r;

    /* renamed from: s */
    private ExtractorOutput f6443s;

    /* renamed from: t */
    private C0958a[] f6444t;

    /* renamed from: u */
    private long[][] f6445u;

    /* renamed from: v */
    private int f6446v;

    /* renamed from: w */
    private long f6447w;

    /* renamed from: x */
    private int f6448x;

    /* renamed from: y */
    private MotionPhotoMetadata f6449y;

    /* renamed from: c.a.a.a.f2.k0.k$a */
    /* compiled from: Mp4Extractor */
    private static final class C0958a {

        /* renamed from: a */
        public final Track f6450a;

        /* renamed from: b */
        public final TrackSampleTable f6451b;

        /* renamed from: c */
        public final C0916b0 f6452c;

        /* renamed from: d */
        public int f6453d;

        public C0958a(Track oVar, TrackSampleTable rVar, C0916b0 b0Var) {
            this.f6450a = oVar;
            this.f6451b = rVar;
            this.f6452c = b0Var;
        }
    }

    public Mp4Extractor() {
        this(0);
    }

    /* renamed from: A */
    private int m7793A(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        long q = kVar.mo6206q();
        if (this.f6439o == -1) {
            int o = m7802o(q);
            this.f6439o = o;
            if (o == -1) {
                return -1;
            }
        }
        C0958a aVar = ((C0958a[]) Util.m10293i(this.f6444t))[this.f6439o];
        C0916b0 b0Var = aVar.f6452c;
        int i = aVar.f6453d;
        TrackSampleTable rVar = aVar.f6451b;
        long j = rVar.f6503c[i];
        int i2 = rVar.f6504d[i];
        long j2 = (j - q) + ((long) this.f6440p);
        if (j2 < 0 || j2 >= 262144) {
            xVar.f7015a = j;
            return 1;
        }
        if (aVar.f6450a.f6472g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        kVar.mo6200i((int) j2);
        Track oVar = aVar.f6450a;
        if (oVar.f6475j == 0) {
            if ("audio/ac4".equals(oVar.f6471f.f8814l)) {
                if (this.f6441q == 0) {
                    Ac4Util.m6634a(i2, this.f6429e);
                    b0Var.mo6174a(this.f6429e, 7);
                    this.f6441q += 7;
                }
                i2 += 7;
            }
            while (true) {
                int i3 = this.f6441q;
                if (i3 >= i2) {
                    break;
                }
                int f = b0Var.mo6179f(kVar, i2 - i3, false);
                this.f6440p += f;
                this.f6441q += f;
                this.f6442r -= f;
            }
        } else {
            byte[] d = this.f6428d.mo7379d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i4 = aVar.f6450a.f6475j;
            int i5 = 4 - i4;
            while (this.f6441q < i2) {
                int i6 = this.f6442r;
                if (i6 == 0) {
                    kVar.readFully(d, i5, i4);
                    this.f6440p += i4;
                    this.f6428d.mo7374P(0);
                    int n = this.f6428d.mo7389n();
                    if (n >= 0) {
                        this.f6442r = n;
                        this.f6427c.mo7374P(0);
                        b0Var.mo6174a(this.f6427c, 4);
                        this.f6441q += 4;
                        i2 += i5;
                    } else {
                        throw new ParserException("Invalid NAL length");
                    }
                } else {
                    int f2 = b0Var.mo6179f(kVar, i6, false);
                    this.f6440p += f2;
                    this.f6441q += f2;
                    this.f6442r -= f2;
                }
            }
        }
        int i7 = i2;
        TrackSampleTable rVar2 = aVar.f6451b;
        b0Var.mo6176c(rVar2.f6506f[i], rVar2.f6507g[i], i7, 0, null);
        aVar.f6453d++;
        this.f6439o = -1;
        this.f6440p = 0;
        this.f6441q = 0;
        this.f6442r = 0;
        return 0;
    }

    /* renamed from: B */
    private int m7794B(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        int c = this.f6432h.mo6281c(kVar, xVar, this.f6433i);
        if (c == 1 && xVar.f7015a == 0) {
            m7800m();
        }
        return c;
    }

    /* renamed from: C */
    private static boolean m7795C(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* renamed from: D */
    private static boolean m7796D(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @RequiresNonNull({"tracks"})
    /* renamed from: E */
    private void m7797E(long j) {
        C0958a[] aVarArr;
        for (C0958a aVar : this.f6444t) {
            TrackSampleTable rVar = aVar.f6451b;
            int a = rVar.mo6291a(j);
            if (a == -1) {
                a = rVar.mo6292b(j);
            }
            aVar.f6453d = a;
        }
    }

    /* renamed from: k */
    private static int m7798k(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: l */
    private static long[][] m7799l(C0958a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f6451b.f6502b];
            jArr2[i] = aVarArr[i].f6451b.f6506f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) aVarArr[i3].f6451b.f6504d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].f6451b.f6506f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: m */
    private void m7800m() {
        this.f6434j = 0;
        this.f6437m = 0;
    }

    /* renamed from: n */
    private static int m7801n(TrackSampleTable rVar, long j) {
        int a = rVar.mo6291a(j);
        return a == -1 ? rVar.mo6292b(j) : a;
    }

    /* renamed from: o */
    private int m7802o(long j) {
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((C0958a[]) Util.m10293i(this.f6444t)).length; i3++) {
            C0958a aVar = this.f6444t[i3];
            int i4 = aVar.f6453d;
            TrackSampleTable rVar = aVar.f6451b;
            if (i4 != rVar.f6502b) {
                long j5 = rVar.f6503c[i4];
                long j6 = ((long[][]) Util.m10293i(this.f6445u))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* renamed from: p */
    static /* synthetic */ Track m7803p(Track oVar) {
        return oVar;
    }

    /* renamed from: q */
    static /* synthetic */ Extractor[] m7804q() {
        return new Extractor[]{new Mp4Extractor()};
    }

    /* renamed from: r */
    private static long m7805r(TrackSampleTable rVar, long j, long j2) {
        int n = m7801n(rVar, j);
        if (n == -1) {
            return j2;
        }
        return Math.min(rVar.f6503c[n], j2);
    }

    /* renamed from: s */
    private void m7806s(ExtractorInput kVar) throws IOException {
        this.f6429e.mo7370L(8);
        kVar.mo6204o(this.f6429e.mo7379d(), 0, 8);
        AtomParsers.m7688d(this.f6429e);
        kVar.mo6200i(this.f6429e.mo7380e());
        kVar.mo6199h();
    }

    /* renamed from: t */
    private void m7807t(long j) throws ParserException {
        while (!this.f6431g.isEmpty() && ((C0946a) this.f6431g.peek()).f6334b == j) {
            C0946a aVar = (C0946a) this.f6431g.pop();
            if (aVar.f6333a == 1836019574) {
                m7810w(aVar);
                this.f6431g.clear();
                this.f6434j = 2;
            } else if (!this.f6431g.isEmpty()) {
                ((C0946a) this.f6431g.peek()).mo6260d(aVar);
            }
        }
        if (this.f6434j != 2) {
            m7800m();
        }
    }

    /* renamed from: u */
    private void m7808u() {
        Metadata aVar;
        if (this.f6448x == 2 && (this.f6426b & 2) != 0) {
            ExtractorOutput lVar = (ExtractorOutput) Assertions.m10153e(this.f6443s);
            C0916b0 q = lVar.mo6218q(0, 4);
            if (this.f6449y == null) {
                aVar = null;
            } else {
                aVar = new Metadata(this.f6449y);
            }
            q.mo6177d(new C1245b().mo7698X(aVar).mo7679E());
            lVar.mo6217h();
            lVar.mo6216f(new C1003b(-9223372036854775807L));
        }
    }

    /* renamed from: v */
    private static int m7809v(ParsableByteArray a0Var) {
        a0Var.mo7374P(8);
        int k = m7798k(a0Var.mo7389n());
        if (k != 0) {
            return k;
        }
        a0Var.mo7375Q(4);
        while (a0Var.mo7376a() > 0) {
            int k2 = m7798k(a0Var.mo7389n());
            if (k2 != 0) {
                return k2;
            }
        }
        return 0;
    }

    /* renamed from: w */
    private void m7810w(C0946a aVar) throws ParserException {
        Metadata aVar2;
        Metadata aVar3;
        int i;
        List list;
        ArrayList arrayList;
        C0946a aVar4 = aVar;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f6448x == 1;
        GaplessInfoHolder uVar = new GaplessInfoHolder();
        C0947b g = aVar4.mo6263g(1969517665);
        if (g != null) {
            Pair A = AtomParsers.m7682A(g);
            Metadata aVar5 = (Metadata) A.first;
            Metadata aVar6 = (Metadata) A.second;
            if (aVar5 != null) {
                uVar.mo6390c(aVar5);
            }
            aVar3 = aVar6;
            aVar2 = aVar5;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        C0946a f = aVar4.mo6262f(1835365473);
        Metadata m = f != null ? AtomParsers.m7697m(f) : null;
        List z2 = AtomParsers.m7710z(aVar, uVar, -9223372036854775807L, null, (this.f6426b & 1) != 0, z, C0943b.f6330a);
        ExtractorOutput lVar = (ExtractorOutput) Assertions.m10153e(this.f6443s);
        int size = z2.size();
        int i2 = 0;
        int i3 = -1;
        long j = -9223372036854775807L;
        while (i2 < size) {
            TrackSampleTable rVar = (TrackSampleTable) z2.get(i2);
            if (rVar.f6502b == 0) {
                list = z2;
                i = size;
                arrayList = arrayList2;
            } else {
                Track oVar = rVar.f6501a;
                int i4 = i3;
                arrayList = arrayList2;
                long j2 = oVar.f6470e;
                if (j2 == -9223372036854775807L) {
                    j2 = rVar.f6508h;
                }
                long max = Math.max(j, j2);
                list = z2;
                i = size;
                C0958a aVar7 = new C0958a(oVar, rVar, lVar.mo6218q(i2, oVar.f6467b));
                int i5 = rVar.f6505e + 30;
                long j3 = max;
                C1245b l = oVar.f6471f.mo7668l();
                l.mo7697W(i5);
                if (oVar.f6467b == 2 && j2 > 0) {
                    int i6 = rVar.f6502b;
                    if (i6 > 1) {
                        l.mo7690P(((float) i6) / (((float) j2) / 1000000.0f));
                    }
                }
                MetadataUtil.m7791k(oVar.f6467b, uVar, l);
                int i7 = oVar.f6467b;
                Metadata[] aVarArr = new Metadata[2];
                aVarArr[0] = aVar3;
                aVarArr[1] = this.f6433i.isEmpty() ? null : new Metadata(this.f6433i);
                MetadataUtil.m7792l(i7, aVar2, m, l, aVarArr);
                aVar7.f6452c.mo6177d(l.mo7679E());
                int i8 = i4;
                if (oVar.f6467b == 2) {
                    if (i8 == -1) {
                        i3 = arrayList.size();
                        arrayList.add(aVar7);
                        j = j3;
                    }
                }
                i3 = i8;
                arrayList.add(aVar7);
                j = j3;
            }
            i2++;
            arrayList2 = arrayList;
            z2 = list;
            size = i;
        }
        ArrayList arrayList3 = arrayList2;
        this.f6446v = i3;
        this.f6447w = j;
        C0958a[] aVarArr2 = (C0958a[]) arrayList3.toArray(new C0958a[0]);
        this.f6444t = aVarArr2;
        this.f6445u = m7799l(aVarArr2);
        lVar.mo6217h();
        lVar.mo6216f(this);
    }

    /* renamed from: x */
    private void m7811x(long j) {
        if (this.f6435k == 1836086884) {
            int i = this.f6437m;
            MotionPhotoMetadata cVar = new MotionPhotoMetadata(0, j, -9223372036854775807L, j + ((long) i), this.f6436l - ((long) i));
            this.f6449y = cVar;
        }
    }

    /* renamed from: y */
    private boolean m7812y(ExtractorInput kVar) throws IOException {
        if (this.f6437m == 0) {
            if (!kVar.mo6197d(this.f6430f.mo7379d(), 0, 8, true)) {
                m7808u();
                return false;
            }
            this.f6437m = 8;
            this.f6430f.mo7374P(0);
            this.f6436l = this.f6430f.mo7364F();
            this.f6435k = this.f6430f.mo7389n();
        }
        long j = this.f6436l;
        if (j == 1) {
            kVar.readFully(this.f6430f.mo7379d(), 8, 8);
            this.f6437m += 8;
            this.f6436l = this.f6430f.mo7367I();
        } else if (j == 0) {
            long a = kVar.mo6194a();
            if (a == -1) {
                C0946a aVar = (C0946a) this.f6431g.peek();
                if (aVar != null) {
                    a = aVar.f6334b;
                }
            }
            if (a != -1) {
                this.f6436l = (a - kVar.mo6206q()) + ((long) this.f6437m);
            }
        }
        if (this.f6436l >= ((long) this.f6437m)) {
            if (m7795C(this.f6435k)) {
                long q = kVar.mo6206q();
                long j2 = this.f6436l;
                long j3 = q + j2;
                int i = this.f6437m;
                long j4 = j3 - ((long) i);
                if (j2 != ((long) i) && this.f6435k == 1835365473) {
                    m7806s(kVar);
                }
                this.f6431g.push(new C0946a(this.f6435k, j4));
                if (this.f6436l == ((long) this.f6437m)) {
                    m7807t(j4);
                } else {
                    m7800m();
                }
            } else if (m7796D(this.f6435k)) {
                Assertions.m10154f(this.f6437m == 8);
                Assertions.m10154f(this.f6436l <= 2147483647L);
                ParsableByteArray a0Var = new ParsableByteArray((int) this.f6436l);
                System.arraycopy(this.f6430f.mo7379d(), 0, a0Var.mo7379d(), 0, 8);
                this.f6438n = a0Var;
                this.f6434j = 1;
            } else {
                m7811x(kVar.mo6206q() - ((long) this.f6437m));
                this.f6438n = null;
                this.f6434j = 1;
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    /* renamed from: z */
    private boolean m7813z(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        boolean z;
        long j = this.f6436l - ((long) this.f6437m);
        long q = kVar.mo6206q() + j;
        ParsableByteArray a0Var = this.f6438n;
        if (a0Var != null) {
            kVar.readFully(a0Var.mo7379d(), this.f6437m, (int) j);
            if (this.f6435k == 1718909296) {
                this.f6448x = m7809v(a0Var);
            } else if (!this.f6431g.isEmpty()) {
                ((C0946a) this.f6431g.peek()).mo6261e(new C0947b(this.f6435k, a0Var));
            }
        } else if (j < 262144) {
            kVar.mo6200i((int) j);
        } else {
            xVar.f7015a = kVar.mo6206q() + j;
            z = true;
            m7807t(q);
            if (z || this.f6434j == 2) {
                return false;
            }
            return true;
        }
        z = false;
        m7807t(q);
        if (z) {
        }
        return false;
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6443s = lVar;
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        this.f6431g.clear();
        this.f6437m = 0;
        this.f6439o = -1;
        this.f6440p = 0;
        this.f6441q = 0;
        this.f6442r = 0;
        if (j == 0) {
            if (this.f6434j != 3) {
                m7800m();
                return;
            }
            this.f6432h.mo6282g();
            this.f6433i.clear();
        } else if (this.f6444t != null) {
            m7797E(j2);
        }
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        return C0961n.m7842d(kVar, (this.f6426b & 2) != 0);
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return true;
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        if (((C0958a[]) Assertions.m10153e(this.f6444t)).length == 0) {
            return new C1002a(SeekPoint.f7020a);
        }
        int i = this.f6446v;
        if (i != -1) {
            TrackSampleTable rVar = this.f6444t[i].f6451b;
            int n = m7801n(rVar, j);
            if (n == -1) {
                return new C1002a(SeekPoint.f7020a);
            }
            long j6 = rVar.f6506f[n];
            j2 = rVar.f6503c[n];
            if (j6 < j && n < rVar.f6502b - 1) {
                int b = rVar.mo6292b(j);
                if (!(b == -1 || b == n)) {
                    j4 = rVar.f6506f[b];
                    j5 = rVar.f6503c[b];
                    j3 = j5;
                    j = j6;
                }
            }
            j5 = -1;
            j4 = -9223372036854775807L;
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C0958a[] aVarArr = this.f6444t;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.f6446v) {
                TrackSampleTable rVar2 = aVarArr[i2].f6451b;
                long r = m7805r(rVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m7805r(rVar2, j4, j3);
                }
                j2 = r;
            }
            i2++;
        }
        SeekPoint zVar = new SeekPoint(j, j2);
        if (j4 == -9223372036854775807L) {
            return new C1002a(zVar);
        }
        return new C1002a(zVar, new SeekPoint(j4, j3));
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        while (true) {
            int i = this.f6434j;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m7793A(kVar, xVar);
                    }
                    if (i == 3) {
                        return m7794B(kVar, xVar);
                    }
                    throw new IllegalStateException();
                } else if (m7813z(kVar, xVar)) {
                    return 1;
                }
            } else if (!m7812y(kVar)) {
                return -1;
            }
        }
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6447w;
    }

    public Mp4Extractor(int i) {
        this.f6426b = i;
        this.f6434j = (i & 4) != 0 ? 3 : 0;
        this.f6432h = new SefReader();
        this.f6433i = new ArrayList();
        this.f6430f = new ParsableByteArray(16);
        this.f6431g = new ArrayDeque<>();
        this.f6427c = new ParsableByteArray(NalUnitUtil.f8442a);
        this.f6428d = new ParsableByteArray(4);
        this.f6429e = new ParsableByteArray();
        this.f6439o = -1;
    }
}
