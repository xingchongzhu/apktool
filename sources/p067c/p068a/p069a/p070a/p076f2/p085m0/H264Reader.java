package p067c.p068a.p069a.p070a.p076f2.p085m0;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.CodecSpecificDataUtil;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.C1200a;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.C1201b;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableNalUnitBitArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.r */
public final class H264Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private final SeiReader f6807a;

    /* renamed from: b */
    private final boolean f6808b;

    /* renamed from: c */
    private final boolean f6809c;

    /* renamed from: d */
    private final NalUnitTargetBuffer f6810d = new NalUnitTargetBuffer(7, 128);

    /* renamed from: e */
    private final NalUnitTargetBuffer f6811e = new NalUnitTargetBuffer(8, 128);

    /* renamed from: f */
    private final NalUnitTargetBuffer f6812f = new NalUnitTargetBuffer(6, 128);

    /* renamed from: g */
    private long f6813g;

    /* renamed from: h */
    private final boolean[] f6814h = new boolean[3];

    /* renamed from: i */
    private String f6815i;

    /* renamed from: j */
    private C0916b0 f6816j;

    /* renamed from: k */
    private C0988b f6817k;

    /* renamed from: l */
    private boolean f6818l;

    /* renamed from: m */
    private long f6819m;

    /* renamed from: n */
    private boolean f6820n;

    /* renamed from: o */
    private final ParsableByteArray f6821o = new ParsableByteArray();

    /* renamed from: c.a.a.a.f2.m0.r$b */
    /* compiled from: H264Reader */
    private static final class C0988b {

        /* renamed from: a */
        private final C0916b0 f6822a;

        /* renamed from: b */
        private final boolean f6823b;

        /* renamed from: c */
        private final boolean f6824c;

        /* renamed from: d */
        private final SparseArray<C1201b> f6825d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C1200a> f6826e = new SparseArray<>();

        /* renamed from: f */
        private final ParsableNalUnitBitArray f6827f;

        /* renamed from: g */
        private byte[] f6828g;

        /* renamed from: h */
        private int f6829h;

        /* renamed from: i */
        private int f6830i;

        /* renamed from: j */
        private long f6831j;

        /* renamed from: k */
        private boolean f6832k;

        /* renamed from: l */
        private long f6833l;

        /* renamed from: m */
        private C0989a f6834m = new C0989a();

        /* renamed from: n */
        private C0989a f6835n = new C0989a();

        /* renamed from: o */
        private boolean f6836o;

        /* renamed from: p */
        private long f6837p;

        /* renamed from: q */
        private long f6838q;

        /* renamed from: r */
        private boolean f6839r;

        /* renamed from: c.a.a.a.f2.m0.r$b$a */
        /* compiled from: H264Reader */
        private static final class C0989a {

            /* renamed from: a */
            private boolean f6840a;

            /* renamed from: b */
            private boolean f6841b;

            /* renamed from: c */
            private C1201b f6842c;

            /* renamed from: d */
            private int f6843d;

            /* renamed from: e */
            private int f6844e;

            /* renamed from: f */
            private int f6845f;

            /* renamed from: g */
            private int f6846g;

            /* renamed from: h */
            private boolean f6847h;

            /* renamed from: i */
            private boolean f6848i;

            /* renamed from: j */
            private boolean f6849j;

            /* renamed from: k */
            private boolean f6850k;

            /* renamed from: l */
            private int f6851l;

            /* renamed from: m */
            private int f6852m;

            /* renamed from: n */
            private int f6853n;

            /* renamed from: o */
            private int f6854o;

            /* renamed from: p */
            private int f6855p;

            private C0989a() {
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
                if (r6.f6851l == r7.f6851l) goto L_0x007b;
             */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean m8164c(p067c.p068a.p069a.p070a.p076f2.p085m0.H264Reader.C0988b.C0989a r7) {
                /*
                    r6 = this;
                    boolean r0 = r6.f6840a
                    r1 = 0
                    if (r0 != 0) goto L_0x0006
                    return r1
                L_0x0006:
                    boolean r0 = r7.f6840a
                    r2 = 1
                    if (r0 != 0) goto L_0x000c
                    return r2
                L_0x000c:
                    c.a.a.a.m2.y$b r0 = r6.f6842c
                    java.lang.Object r0 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10156h(r0)
                    c.a.a.a.m2.y$b r0 = (p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.C1201b) r0
                    c.a.a.a.m2.y$b r3 = r7.f6842c
                    java.lang.Object r3 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10156h(r3)
                    c.a.a.a.m2.y$b r3 = (p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.C1201b) r3
                    int r4 = r6.f6845f
                    int r5 = r7.f6845f
                    if (r4 != r5) goto L_0x007a
                    int r4 = r6.f6846g
                    int r5 = r7.f6846g
                    if (r4 != r5) goto L_0x007a
                    boolean r4 = r6.f6847h
                    boolean r5 = r7.f6847h
                    if (r4 != r5) goto L_0x007a
                    boolean r4 = r6.f6848i
                    if (r4 == 0) goto L_0x003c
                    boolean r4 = r7.f6848i
                    if (r4 == 0) goto L_0x003c
                    boolean r4 = r6.f6849j
                    boolean r5 = r7.f6849j
                    if (r4 != r5) goto L_0x007a
                L_0x003c:
                    int r4 = r6.f6843d
                    int r5 = r7.f6843d
                    if (r4 == r5) goto L_0x0046
                    if (r4 == 0) goto L_0x007a
                    if (r5 == 0) goto L_0x007a
                L_0x0046:
                    int r0 = r0.f8459k
                    if (r0 != 0) goto L_0x005a
                    int r4 = r3.f8459k
                    if (r4 != 0) goto L_0x005a
                    int r4 = r6.f6852m
                    int r5 = r7.f6852m
                    if (r4 != r5) goto L_0x007a
                    int r4 = r6.f6853n
                    int r5 = r7.f6853n
                    if (r4 != r5) goto L_0x007a
                L_0x005a:
                    if (r0 != r2) goto L_0x006c
                    int r0 = r3.f8459k
                    if (r0 != r2) goto L_0x006c
                    int r0 = r6.f6854o
                    int r3 = r7.f6854o
                    if (r0 != r3) goto L_0x007a
                    int r0 = r6.f6855p
                    int r3 = r7.f6855p
                    if (r0 != r3) goto L_0x007a
                L_0x006c:
                    boolean r0 = r6.f6850k
                    boolean r3 = r7.f6850k
                    if (r0 != r3) goto L_0x007a
                    if (r0 == 0) goto L_0x007b
                    int r0 = r6.f6851l
                    int r7 = r7.f6851l
                    if (r0 == r7) goto L_0x007b
                L_0x007a:
                    r1 = 1
                L_0x007b:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p085m0.H264Reader.C0988b.C0989a.m8164c(c.a.a.a.f2.m0.r$b$a):boolean");
            }

            /* renamed from: b */
            public void mo6365b() {
                this.f6841b = false;
                this.f6840a = false;
            }

            /* renamed from: d */
            public boolean mo6366d() {
                if (this.f6841b) {
                    int i = this.f6844e;
                    if (i == 7 || i == 2) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: e */
            public void mo6367e(C1201b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f6842c = bVar;
                this.f6843d = i;
                this.f6844e = i2;
                this.f6845f = i3;
                this.f6846g = i4;
                this.f6847h = z;
                this.f6848i = z2;
                this.f6849j = z3;
                this.f6850k = z4;
                this.f6851l = i5;
                this.f6852m = i6;
                this.f6853n = i7;
                this.f6854o = i8;
                this.f6855p = i9;
                this.f6840a = true;
                this.f6841b = true;
            }

            /* renamed from: f */
            public void mo6368f(int i) {
                this.f6844e = i;
                this.f6841b = true;
            }
        }

        public C0988b(C0916b0 b0Var, boolean z, boolean z2) {
            this.f6822a = b0Var;
            this.f6823b = z;
            this.f6824c = z2;
            byte[] bArr = new byte[128];
            this.f6828g = bArr;
            this.f6827f = new ParsableNalUnitBitArray(bArr, 0, 0);
            mo6363g();
        }

        /* renamed from: d */
        private void m8155d(int i) {
            int i2 = (int) (this.f6831j - this.f6837p);
            int i3 = i;
            this.f6822a.mo6176c(this.f6838q, this.f6839r ? 1 : 0, i2, i3, null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo6358a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f6832k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f6828g
                int r4 = r3.length
                int r5 = r0.f6829h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f6828g = r3
            L_0x001e:
                byte[] r3 = r0.f6828g
                int r4 = r0.f6829h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f6829h
                int r1 = r1 + r2
                r0.f6829h = r1
                c.a.a.a.m2.b0 r2 = r0.f6827f
                byte[] r3 = r0.f6828g
                r4 = 0
                r2.mo7409i(r3, r4, r1)
                c.a.a.a.m2.b0 r1 = r0.f6827f
                r2 = 8
                boolean r1 = r1.mo7403b(r2)
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                c.a.a.a.m2.b0 r1 = r0.f6827f
                r1.mo7410k()
                c.a.a.a.m2.b0 r1 = r0.f6827f
                int r10 = r1.mo7406e(r7)
                c.a.a.a.m2.b0 r1 = r0.f6827f
                r2 = 5
                r1.mo7411l(r2)
                c.a.a.a.m2.b0 r1 = r0.f6827f
                boolean r1 = r1.mo7404c()
                if (r1 != 0) goto L_0x0059
                return
            L_0x0059:
                c.a.a.a.m2.b0 r1 = r0.f6827f
                r1.mo7408h()
                c.a.a.a.m2.b0 r1 = r0.f6827f
                boolean r1 = r1.mo7404c()
                if (r1 != 0) goto L_0x0067
                return
            L_0x0067:
                c.a.a.a.m2.b0 r1 = r0.f6827f
                int r11 = r1.mo7408h()
                boolean r1 = r0.f6824c
                if (r1 != 0) goto L_0x0079
                r0.f6832k = r4
                c.a.a.a.f2.m0.r$b$a r1 = r0.f6835n
                r1.mo6368f(r11)
                return
            L_0x0079:
                c.a.a.a.m2.b0 r1 = r0.f6827f
                boolean r1 = r1.mo7404c()
                if (r1 != 0) goto L_0x0082
                return
            L_0x0082:
                c.a.a.a.m2.b0 r1 = r0.f6827f
                int r13 = r1.mo7408h()
                android.util.SparseArray<c.a.a.a.m2.y$a> r1 = r0.f6826e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0093
                r0.f6832k = r4
                return
            L_0x0093:
                android.util.SparseArray<c.a.a.a.m2.y$a> r1 = r0.f6826e
                java.lang.Object r1 = r1.get(r13)
                c.a.a.a.m2.y$a r1 = (p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.C1200a) r1
                android.util.SparseArray<c.a.a.a.m2.y$b> r3 = r0.f6825d
                int r5 = r1.f8447b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                c.a.a.a.m2.y$b r9 = (p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.C1201b) r9
                boolean r3 = r9.f8456h
                if (r3 == 0) goto L_0x00b8
                c.a.a.a.m2.b0 r3 = r0.f6827f
                boolean r3 = r3.mo7403b(r7)
                if (r3 != 0) goto L_0x00b3
                return
            L_0x00b3:
                c.a.a.a.m2.b0 r3 = r0.f6827f
                r3.mo7411l(r7)
            L_0x00b8:
                c.a.a.a.m2.b0 r3 = r0.f6827f
                int r5 = r9.f8458j
                boolean r3 = r3.mo7403b(r5)
                if (r3 != 0) goto L_0x00c3
                return
            L_0x00c3:
                c.a.a.a.m2.b0 r3 = r0.f6827f
                int r5 = r9.f8458j
                int r12 = r3.mo7406e(r5)
                boolean r3 = r9.f8457i
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                c.a.a.a.m2.b0 r3 = r0.f6827f
                boolean r3 = r3.mo7403b(r5)
                if (r3 != 0) goto L_0x00d9
                return
            L_0x00d9:
                c.a.a.a.m2.b0 r3 = r0.f6827f
                boolean r3 = r3.mo7405d()
                if (r3 == 0) goto L_0x00f5
                c.a.a.a.m2.b0 r6 = r0.f6827f
                boolean r6 = r6.mo7403b(r5)
                if (r6 != 0) goto L_0x00ea
                return
            L_0x00ea:
                c.a.a.a.m2.b0 r6 = r0.f6827f
                boolean r6 = r6.mo7405d()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fb
            L_0x00f5:
                r14 = r3
                goto L_0x00f8
            L_0x00f7:
                r14 = 0
            L_0x00f8:
                r15 = 0
                r16 = 0
            L_0x00fb:
                int r3 = r0.f6830i
                if (r3 != r2) goto L_0x0102
                r17 = 1
                goto L_0x0104
            L_0x0102:
                r17 = 0
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                c.a.a.a.m2.b0 r2 = r0.f6827f
                boolean r2 = r2.mo7404c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                c.a.a.a.m2.b0 r2 = r0.f6827f
                int r2 = r2.mo7408h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = 0
            L_0x011a:
                int r2 = r9.f8459k
                if (r2 != 0) goto L_0x014e
                c.a.a.a.m2.b0 r2 = r0.f6827f
                int r3 = r9.f8460l
                boolean r2 = r2.mo7403b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                c.a.a.a.m2.b0 r2 = r0.f6827f
                int r3 = r9.f8460l
                int r2 = r2.mo7406e(r3)
                boolean r1 = r1.f8448c
                if (r1 == 0) goto L_0x014b
                if (r14 != 0) goto L_0x014b
                c.a.a.a.m2.b0 r1 = r0.f6827f
                boolean r1 = r1.mo7404c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                c.a.a.a.m2.b0 r1 = r0.f6827f
                int r1 = r1.mo7407g()
                r20 = r1
                r19 = r2
                goto L_0x018c
            L_0x014b:
                r19 = r2
                goto L_0x018a
            L_0x014e:
                if (r2 != r5) goto L_0x0188
                boolean r2 = r9.f8461m
                if (r2 != 0) goto L_0x0188
                c.a.a.a.m2.b0 r2 = r0.f6827f
                boolean r2 = r2.mo7404c()
                if (r2 != 0) goto L_0x015d
                return
            L_0x015d:
                c.a.a.a.m2.b0 r2 = r0.f6827f
                int r2 = r2.mo7407g()
                boolean r1 = r1.f8448c
                if (r1 == 0) goto L_0x0181
                if (r14 != 0) goto L_0x0181
                c.a.a.a.m2.b0 r1 = r0.f6827f
                boolean r1 = r1.mo7404c()
                if (r1 != 0) goto L_0x0172
                return
            L_0x0172:
                c.a.a.a.m2.b0 r1 = r0.f6827f
                int r1 = r1.mo7407g()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x0181:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x018e
            L_0x0188:
                r19 = 0
            L_0x018a:
                r20 = 0
            L_0x018c:
                r21 = 0
            L_0x018e:
                r22 = 0
            L_0x0190:
                c.a.a.a.f2.m0.r$b$a r8 = r0.f6835n
                r8.mo6367e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f6832k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p085m0.H264Reader.C0988b.mo6358a(byte[], int, int):void");
        }

        /* renamed from: b */
        public boolean mo6359b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f6830i == 9 || (this.f6824c && this.f6835n.m8164c(this.f6834m))) {
                if (z && this.f6836o) {
                    m8155d(i + ((int) (j - this.f6831j)));
                }
                this.f6837p = this.f6831j;
                this.f6838q = this.f6833l;
                this.f6839r = false;
                this.f6836o = true;
            }
            if (this.f6823b) {
                z2 = this.f6835n.mo6366d();
            }
            boolean z4 = this.f6839r;
            int i2 = this.f6830i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f6839r = z5;
            return z5;
        }

        /* renamed from: c */
        public boolean mo6360c() {
            return this.f6824c;
        }

        /* renamed from: e */
        public void mo6361e(C1200a aVar) {
            this.f6826e.append(aVar.f8446a, aVar);
        }

        /* renamed from: f */
        public void mo6362f(C1201b bVar) {
            this.f6825d.append(bVar.f8452d, bVar);
        }

        /* renamed from: g */
        public void mo6363g() {
            this.f6832k = false;
            this.f6836o = false;
            this.f6835n.mo6365b();
        }

        /* renamed from: h */
        public void mo6364h(long j, int i, long j2) {
            this.f6830i = i;
            this.f6833l = j2;
            this.f6831j = j;
            if (!this.f6823b || i != 1) {
                if (!this.f6824c) {
                    return;
                }
                if (!(i == 5 || i == 1 || i == 2)) {
                    return;
                }
            }
            C0989a aVar = this.f6834m;
            this.f6834m = this.f6835n;
            this.f6835n = aVar;
            aVar.mo6365b();
            this.f6829h = 0;
            this.f6832k = true;
        }
    }

    public H264Reader(SeiReader e0Var, boolean z, boolean z2) {
        this.f6807a = e0Var;
        this.f6808b = z;
        this.f6809c = z2;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* renamed from: b */
    private void m8146b() {
        Assertions.m10156h(this.f6816j);
        Util.m10293i(this.f6817k);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* renamed from: g */
    private void m8147g(long j, int i, int i2, long j2) {
        if (!this.f6818l || this.f6817k.mo6360c()) {
            this.f6810d.mo6374b(i2);
            this.f6811e.mo6374b(i2);
            if (!this.f6818l) {
                if (this.f6810d.mo6375c() && this.f6811e.mo6375c()) {
                    ArrayList arrayList = new ArrayList();
                    NalUnitTargetBuffer wVar = this.f6810d;
                    arrayList.add(Arrays.copyOf(wVar.f6925d, wVar.f6926e));
                    NalUnitTargetBuffer wVar2 = this.f6811e;
                    arrayList.add(Arrays.copyOf(wVar2.f6925d, wVar2.f6926e));
                    NalUnitTargetBuffer wVar3 = this.f6810d;
                    C1201b i3 = NalUnitUtil.m10426i(wVar3.f6925d, 3, wVar3.f6926e);
                    NalUnitTargetBuffer wVar4 = this.f6811e;
                    C1200a h = NalUnitUtil.m10425h(wVar4.f6925d, 3, wVar4.f6926e);
                    this.f6816j.mo6177d(new C1245b().mo7693S(this.f6815i).mo7705e0("video/avc").mo7683I(CodecSpecificDataUtil.m10170a(i3.f8449a, i3.f8450b, i3.f8451c)).mo7710j0(i3.f8453e).mo7691Q(i3.f8454f).mo7701a0(i3.f8455g).mo7694T(arrayList).mo7679E());
                    this.f6818l = true;
                    this.f6817k.mo6362f(i3);
                    this.f6817k.mo6361e(h);
                    this.f6810d.mo6376d();
                    this.f6811e.mo6376d();
                }
            } else if (this.f6810d.mo6375c()) {
                NalUnitTargetBuffer wVar5 = this.f6810d;
                this.f6817k.mo6362f(NalUnitUtil.m10426i(wVar5.f6925d, 3, wVar5.f6926e));
                this.f6810d.mo6376d();
            } else if (this.f6811e.mo6375c()) {
                NalUnitTargetBuffer wVar6 = this.f6811e;
                this.f6817k.mo6361e(NalUnitUtil.m10425h(wVar6.f6925d, 3, wVar6.f6926e));
                this.f6811e.mo6376d();
            }
        }
        if (this.f6812f.mo6374b(i2)) {
            NalUnitTargetBuffer wVar7 = this.f6812f;
            this.f6821o.mo7372N(this.f6812f.f6925d, NalUnitUtil.m10428k(wVar7.f6925d, wVar7.f6926e));
            this.f6821o.mo7374P(4);
            this.f6807a.mo6329a(j2, this.f6821o);
        }
        if (this.f6817k.mo6359b(j, i, this.f6818l, this.f6820n)) {
            this.f6820n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: h */
    private void m8148h(byte[] bArr, int i, int i2) {
        if (!this.f6818l || this.f6817k.mo6360c()) {
            this.f6810d.mo6373a(bArr, i, i2);
            this.f6811e.mo6373a(bArr, i, i2);
        }
        this.f6812f.mo6373a(bArr, i, i2);
        this.f6817k.mo6358a(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: i */
    private void m8149i(long j, int i, long j2) {
        if (!this.f6818l || this.f6817k.mo6360c()) {
            this.f6810d.mo6377e(i);
            this.f6811e.mo6377e(i);
        }
        this.f6812f.mo6377e(i);
        this.f6817k.mo6364h(j, i, j2);
    }

    /* renamed from: a */
    public void mo6331a() {
        this.f6813g = 0;
        this.f6820n = false;
        NalUnitUtil.m10418a(this.f6814h);
        this.f6810d.mo6376d();
        this.f6811e.mo6376d();
        this.f6812f.mo6376d();
        C0988b bVar = this.f6817k;
        if (bVar != null) {
            bVar.mo6363g();
        }
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        m8146b();
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        byte[] d = a0Var.mo7379d();
        this.f6813g += (long) a0Var.mo7376a();
        this.f6816j.mo6174a(a0Var, a0Var.mo7376a());
        while (true) {
            int c = NalUnitUtil.m10420c(d, e, f, this.f6814h);
            if (c == f) {
                m8148h(d, e, f);
                return;
            }
            int f2 = NalUnitUtil.m10423f(d, c);
            int i = c - e;
            if (i > 0) {
                m8148h(d, e, c);
            }
            int i2 = f - c;
            long j = this.f6813g - ((long) i2);
            m8147g(j, i2, i < 0 ? -i : 0, this.f6819m);
            m8149i(j, f2, this.f6819m);
            e = c + 3;
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6819m = j;
        this.f6820n |= (i & 2) != 0;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6815i = dVar.mo6343b();
        C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 2);
        this.f6816j = q;
        this.f6817k = new C0988b(q, this.f6808b, this.f6809c);
        this.f6807a.mo6330b(lVar, dVar);
    }
}
