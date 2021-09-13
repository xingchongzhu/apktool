package p067c.p068a.p069a.p070a.p076f2.p085m0;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0980a;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0981b;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0982c;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.h0 */
public final class TsExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6651a = C0976e.f6615b;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f6652b;

    /* renamed from: c */
    private final int f6653c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<TimestampAdjuster> f6654d;

    /* renamed from: e */
    private final ParsableByteArray f6655e;

    /* renamed from: f */
    private final SparseIntArray f6656f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0982c f6657g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<TsPayloadReader> f6658h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final SparseBooleanArray f6659i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final SparseBooleanArray f6660j;

    /* renamed from: k */
    private final TsDurationReader f6661k;

    /* renamed from: l */
    private TsBinarySearchSeeker f6662l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ExtractorOutput f6663m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f6664n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f6665o;

    /* renamed from: p */
    private boolean f6666p;

    /* renamed from: q */
    private boolean f6667q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TsPayloadReader f6668r;

    /* renamed from: s */
    private int f6669s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f6670t;

    /* renamed from: c.a.a.a.f2.m0.h0$a */
    /* compiled from: TsExtractor */
    private class C0978a implements SectionPayloadReader {

        /* renamed from: a */
        private final ParsableBitArray f6671a = new ParsableBitArray(new byte[4]);

        public C0978a() {
        }

        /* renamed from: b */
        public void mo6324b(TimestampAdjuster j0Var, ExtractorOutput lVar, C0983d dVar) {
        }

        /* renamed from: c */
        public void mo6325c(ParsableByteArray a0Var) {
            if (a0Var.mo7362D() == 0 && (a0Var.mo7362D() & 128) != 0) {
                a0Var.mo7375Q(6);
                int a = a0Var.mo7376a() / 4;
                for (int i = 0; i < a; i++) {
                    a0Var.mo7384i(this.f6671a, 4);
                    int h = this.f6671a.mo7495h(16);
                    this.f6671a.mo7505r(3);
                    if (h == 0) {
                        this.f6671a.mo7505r(13);
                    } else {
                        int h2 = this.f6671a.mo7495h(13);
                        if (TsExtractor.this.f6658h.get(h2) == null) {
                            TsExtractor.this.f6658h.put(h2, new SectionReader(new C0979b(h2)));
                            TsExtractor.this.f6664n = TsExtractor.this.f6664n + 1;
                        }
                    }
                }
                if (TsExtractor.this.f6652b != 2) {
                    TsExtractor.this.f6658h.remove(0);
                }
            }
        }
    }

    /* renamed from: c.a.a.a.f2.m0.h0$b */
    /* compiled from: TsExtractor */
    private class C0979b implements SectionPayloadReader {

        /* renamed from: a */
        private final ParsableBitArray f6673a = new ParsableBitArray(new byte[5]);

        /* renamed from: b */
        private final SparseArray<TsPayloadReader> f6674b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f6675c = new SparseIntArray();

        /* renamed from: d */
        private final int f6676d;

        public C0979b(int i) {
            this.f6676d = i;
        }

        /* renamed from: a */
        private C0981b m8040a(ParsableByteArray a0Var, int i) {
            int e = a0Var.mo7380e();
            int i2 = i + e;
            String str = null;
            List list = null;
            int i3 = -1;
            while (a0Var.mo7380e() < i2) {
                int D = a0Var.mo7362D();
                int e2 = a0Var.mo7380e() + a0Var.mo7362D();
                if (e2 > i2) {
                    break;
                }
                if (D == 5) {
                    long F = a0Var.mo7364F();
                    if (F != 1094921523) {
                        if (F != 1161904947) {
                            if (F != 1094921524) {
                                if (F == 1212503619) {
                                    i3 = 36;
                                }
                                a0Var.mo7375Q(e2 - a0Var.mo7380e());
                            }
                        }
                        i3 = 135;
                        a0Var.mo7375Q(e2 - a0Var.mo7380e());
                    }
                    i3 = 129;
                    a0Var.mo7375Q(e2 - a0Var.mo7380e());
                } else {
                    if (D != 106) {
                        if (D != 122) {
                            if (D == 127) {
                                if (a0Var.mo7362D() != 21) {
                                }
                            } else if (D == 123) {
                                i3 = 138;
                            } else if (D == 10) {
                                str = a0Var.mo7359A(3).trim();
                            } else if (D == 89) {
                                list = new ArrayList();
                                while (a0Var.mo7380e() < e2) {
                                    String trim = a0Var.mo7359A(3).trim();
                                    int D2 = a0Var.mo7362D();
                                    byte[] bArr = new byte[4];
                                    a0Var.mo7385j(bArr, 0, 4);
                                    list.add(new C0980a(trim, D2, bArr));
                                }
                                i3 = 89;
                            } else if (D == 111) {
                                i3 = 257;
                            }
                            a0Var.mo7375Q(e2 - a0Var.mo7380e());
                        }
                        i3 = 135;
                        a0Var.mo7375Q(e2 - a0Var.mo7380e());
                    }
                    i3 = 129;
                    a0Var.mo7375Q(e2 - a0Var.mo7380e());
                }
                i3 = 172;
                a0Var.mo7375Q(e2 - a0Var.mo7380e());
            }
            a0Var.mo7374P(i2);
            return new C0981b(i3, str, list, Arrays.copyOfRange(a0Var.mo7379d(), e, i2));
        }

        /* renamed from: b */
        public void mo6324b(TimestampAdjuster j0Var, ExtractorOutput lVar, C0983d dVar) {
        }

        /* renamed from: c */
        public void mo6325c(ParsableByteArray a0Var) {
            TimestampAdjuster j0Var;
            TsPayloadReader i0Var;
            ParsableByteArray a0Var2 = a0Var;
            if (a0Var.mo7362D() == 2) {
                if (TsExtractor.this.f6652b == 1 || TsExtractor.this.f6652b == 2 || TsExtractor.this.f6664n == 1) {
                    j0Var = (TimestampAdjuster) TsExtractor.this.f6654d.get(0);
                } else {
                    j0Var = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.this.f6654d.get(0)).mo7448c());
                    TsExtractor.this.f6654d.add(j0Var);
                }
                if ((a0Var.mo7362D() & 128) != 0) {
                    a0Var2.mo7375Q(1);
                    int J = a0Var.mo7368J();
                    int i = 3;
                    a0Var2.mo7375Q(3);
                    a0Var2.mo7384i(this.f6673a, 2);
                    this.f6673a.mo7505r(3);
                    int i2 = 13;
                    TsExtractor.this.f6670t = this.f6673a.mo7495h(13);
                    a0Var2.mo7384i(this.f6673a, 2);
                    int i3 = 4;
                    this.f6673a.mo7505r(4);
                    a0Var2.mo7375Q(this.f6673a.mo7495h(12));
                    if (TsExtractor.this.f6652b == 2 && TsExtractor.this.f6668r == null) {
                        C0981b bVar = new C0981b(21, null, null, Util.f8403f);
                        TsExtractor h0Var = TsExtractor.this;
                        h0Var.f6668r = h0Var.f6657g.mo6341b(21, bVar);
                        TsExtractor.this.f6668r.mo6327b(j0Var, TsExtractor.this.f6663m, new C0983d(J, 21, 8192));
                    }
                    this.f6674b.clear();
                    this.f6675c.clear();
                    int a = a0Var.mo7376a();
                    while (a > 0) {
                        a0Var2.mo7384i(this.f6673a, 5);
                        int h = this.f6673a.mo7495h(8);
                        this.f6673a.mo7505r(i);
                        int h2 = this.f6673a.mo7495h(i2);
                        this.f6673a.mo7505r(i3);
                        int h3 = this.f6673a.mo7495h(12);
                        C0981b a2 = m8040a(a0Var2, h3);
                        if (h == 6 || h == 5) {
                            h = a2.f6694a;
                        }
                        a -= h3 + 5;
                        int i4 = TsExtractor.this.f6652b == 2 ? h : h2;
                        if (!TsExtractor.this.f6659i.get(i4)) {
                            if (TsExtractor.this.f6652b == 2 && h == 21) {
                                i0Var = TsExtractor.this.f6668r;
                            } else {
                                i0Var = TsExtractor.this.f6657g.mo6341b(h, a2);
                            }
                            if (TsExtractor.this.f6652b != 2 || h2 < this.f6675c.get(i4, 8192)) {
                                this.f6675c.put(i4, h2);
                                this.f6674b.put(i4, i0Var);
                            }
                        }
                        i = 3;
                        i3 = 4;
                        i2 = 13;
                    }
                    int size = this.f6675c.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        int keyAt = this.f6675c.keyAt(i5);
                        int valueAt = this.f6675c.valueAt(i5);
                        TsExtractor.this.f6659i.put(keyAt, true);
                        TsExtractor.this.f6660j.put(valueAt, true);
                        TsPayloadReader i0Var2 = (TsPayloadReader) this.f6674b.valueAt(i5);
                        if (i0Var2 != null) {
                            if (i0Var2 != TsExtractor.this.f6668r) {
                                i0Var2.mo6327b(j0Var, TsExtractor.this.f6663m, new C0983d(J, keyAt, 8192));
                            }
                            TsExtractor.this.f6658h.put(valueAt, i0Var2);
                        }
                    }
                    if (TsExtractor.this.f6652b != 2) {
                        TsExtractor.this.f6658h.remove(this.f6676d);
                        TsExtractor h0Var2 = TsExtractor.this;
                        h0Var2.f6664n = h0Var2.f6652b == 1 ? 0 : TsExtractor.this.f6664n - 1;
                        if (TsExtractor.this.f6664n == 0) {
                            TsExtractor.this.f6663m.mo6217h();
                            TsExtractor.this.f6665o = true;
                        }
                    } else if (!TsExtractor.this.f6665o) {
                        TsExtractor.this.f6663m.mo6217h();
                        TsExtractor.this.f6664n = 0;
                        TsExtractor.this.f6665o = true;
                    }
                }
            }
        }
    }

    public TsExtractor() {
        this(0);
    }

    /* renamed from: u */
    private boolean m8027u(ExtractorInput kVar) throws IOException {
        byte[] d = this.f6655e.mo7379d();
        if (9400 - this.f6655e.mo7380e() < 188) {
            int a = this.f6655e.mo7376a();
            if (a > 0) {
                System.arraycopy(d, this.f6655e.mo7380e(), d, 0, a);
            }
            this.f6655e.mo7372N(d, a);
        }
        while (this.f6655e.mo7376a() < 188) {
            int f = this.f6655e.mo7381f();
            int b = kVar.mo6195b(d, f, 9400 - f);
            if (b == -1) {
                return false;
            }
            this.f6655e.mo7373O(f + b);
        }
        return true;
    }

    /* renamed from: v */
    private int m8028v() throws ParserException {
        int e = this.f6655e.mo7380e();
        int f = this.f6655e.mo7381f();
        int a = TsUtil.m8071a(this.f6655e.mo7379d(), e, f);
        this.f6655e.mo7374P(a);
        int i = a + 188;
        if (i > f) {
            int i2 = this.f6669s + (a - e);
            this.f6669s = i2;
            if (this.f6652b == 2 && i2 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f6669s = 0;
        }
        return i;
    }

    /* renamed from: w */
    static /* synthetic */ Extractor[] m8029w() {
        return new Extractor[]{new TsExtractor()};
    }

    /* renamed from: x */
    private void m8030x(long j) {
        if (!this.f6666p) {
            this.f6666p = true;
            if (this.f6661k.mo6336b() != -9223372036854775807L) {
                TsBinarySearchSeeker f0Var = new TsBinarySearchSeeker(this.f6661k.mo6337c(), this.f6661k.mo6336b(), j, this.f6670t, this.f6653c);
                this.f6662l = f0Var;
                this.f6663m.mo6216f(f0Var.mo6159b());
                return;
            }
            this.f6663m.mo6216f(new C1003b(this.f6661k.mo6336b()));
        }
    }

    /* renamed from: y */
    private void m8031y() {
        this.f6659i.clear();
        this.f6658h.clear();
        SparseArray a = this.f6657g.mo6340a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f6658h.put(a.keyAt(i), (TsPayloadReader) a.valueAt(i));
        }
        this.f6658h.put(0, new SectionReader(new C0978a()));
        this.f6668r = null;
    }

    /* renamed from: z */
    private boolean m8032z(int i) {
        if (this.f6652b == 2 || this.f6665o || !this.f6660j.get(i, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6663m = lVar;
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        Assertions.m10154f(this.f6652b != 2);
        int size = this.f6654d.size();
        for (int i = 0; i < size; i++) {
            TimestampAdjuster j0Var = (TimestampAdjuster) this.f6654d.get(i);
            if ((j0Var.mo7450e() == -9223372036854775807L) || !(j0Var.mo7450e() == 0 || j0Var.mo7448c() == j2)) {
                j0Var.mo7451g(j2);
            }
        }
        if (j2 != 0) {
            TsBinarySearchSeeker f0Var = this.f6662l;
            if (f0Var != null) {
                f0Var.mo6165h(j2);
            }
        }
        this.f6655e.mo7370L(0);
        this.f6656f.clear();
        for (int i2 = 0; i2 < this.f6658h.size(); i2++) {
            ((TsPayloadReader) this.f6658h.valueAt(i2)).mo6326a();
        }
        this.f6669s = 0;
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        boolean z;
        byte[] d = this.f6655e.mo7379d();
        kVar.mo6204o(d, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (d[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                kVar.mo6200i(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        ExtractorInput kVar2 = kVar;
        PositionHolder xVar2 = xVar;
        long a = kVar.mo6194a();
        if (this.f6665o) {
            if (((a == -1 || this.f6652b == 2) ? false : true) && !this.f6661k.mo6338d()) {
                return this.f6661k.mo6339e(kVar2, xVar2, this.f6670t);
            }
            m8030x(a);
            if (this.f6667q) {
                this.f6667q = false;
                mo6190c(0, 0);
                if (kVar.mo6206q() != 0) {
                    xVar2.f7015a = 0;
                    return 1;
                }
            }
            TsBinarySearchSeeker f0Var = this.f6662l;
            if (f0Var != null && f0Var.mo6161d()) {
                return this.f6662l.mo6160c(kVar2, xVar2);
            }
        }
        if (!m8027u(kVar)) {
            return -1;
        }
        int v = m8028v();
        int f = this.f6655e.mo7381f();
        if (v > f) {
            return 0;
        }
        int n = this.f6655e.mo7389n();
        if ((8388608 & n) != 0) {
            this.f6655e.mo7374P(v);
            return 0;
        }
        int i = ((4194304 & n) != 0 ? 1 : 0) | 0;
        int i2 = (2096896 & n) >> 8;
        boolean z = (n & 32) != 0;
        TsPayloadReader i0Var = (n & 16) != 0 ? (TsPayloadReader) this.f6658h.get(i2) : null;
        if (i0Var == null) {
            this.f6655e.mo7374P(v);
            return 0;
        }
        if (this.f6652b != 2) {
            int i3 = n & 15;
            int i4 = this.f6656f.get(i2, i3 - 1);
            this.f6656f.put(i2, i3);
            if (i4 == i3) {
                this.f6655e.mo7374P(v);
                return 0;
            } else if (i3 != ((i4 + 1) & 15)) {
                i0Var.mo6326a();
            }
        }
        if (z) {
            i |= (this.f6655e.mo7362D() & 64) != 0 ? 2 : 0;
            this.f6655e.mo7375Q(this.f6655e.mo7362D() - 1);
        }
        boolean z2 = this.f6665o;
        if (m8032z(i2)) {
            this.f6655e.mo7373O(v);
            i0Var.mo6328c(this.f6655e, i);
            this.f6655e.mo7373O(f);
        }
        if (this.f6652b != 2 && !z2 && this.f6665o && a != -1) {
            this.f6667q = true;
        }
        this.f6655e.mo7374P(v);
        return 0;
    }

    public TsExtractor(int i) {
        this(1, i, 112800);
    }

    public TsExtractor(int i, int i2, int i3) {
        this(i, new TimestampAdjuster(0), new DefaultTsPayloadReaderFactory(i2), i3);
    }

    public TsExtractor(int i, TimestampAdjuster j0Var, C0982c cVar) {
        this(i, j0Var, cVar, 112800);
    }

    public TsExtractor(int i, TimestampAdjuster j0Var, C0982c cVar, int i2) {
        this.f6657g = (C0982c) Assertions.m10153e(cVar);
        this.f6653c = i2;
        this.f6652b = i;
        if (i == 1 || i == 2) {
            this.f6654d = Collections.singletonList(j0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f6654d = arrayList;
            arrayList.add(j0Var);
        }
        this.f6655e = new ParsableByteArray(new byte[9400], 0);
        this.f6659i = new SparseBooleanArray();
        this.f6660j = new SparseBooleanArray();
        this.f6658h = new SparseArray<>();
        this.f6656f = new SparseIntArray();
        this.f6661k = new TsDurationReader(i2);
        this.f6670t = -1;
        m8031y();
    }
}
