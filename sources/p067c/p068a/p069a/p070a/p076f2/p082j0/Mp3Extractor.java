package p067c.p068a.p069a.p070a.p076f2.p082j0;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p072b2.MpegAudioUtil;
import p067c.p068a.p069a.p070a.p072b2.MpegAudioUtil.C0815a;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.DummyTrackOutput;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.GaplessInfoHolder;
import p067c.p068a.p069a.p070a.p076f2.Id3Peeker;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder.C1050a;
import p067c.p068a.p069a.p070a.p088h2.p093m.MlltFrame;
import p067c.p068a.p069a.p070a.p088h2.p093m.TextInformationFrame;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.j0.f */
public final class Mp3Extractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6297a = C0939a.f6288b;

    /* renamed from: b */
    private static final C1050a f6298b = C0940b.f6289a;

    /* renamed from: c */
    private final int f6299c;

    /* renamed from: d */
    private final long f6300d;

    /* renamed from: e */
    private final ParsableByteArray f6301e;

    /* renamed from: f */
    private final C0815a f6302f;

    /* renamed from: g */
    private final GaplessInfoHolder f6303g;

    /* renamed from: h */
    private final Id3Peeker f6304h;

    /* renamed from: i */
    private final C0916b0 f6305i;

    /* renamed from: j */
    private ExtractorOutput f6306j;

    /* renamed from: k */
    private C0916b0 f6307k;

    /* renamed from: l */
    private C0916b0 f6308l;

    /* renamed from: m */
    private int f6309m;

    /* renamed from: n */
    private Metadata f6310n;

    /* renamed from: o */
    private long f6311o;

    /* renamed from: p */
    private long f6312p;

    /* renamed from: q */
    private long f6313q;

    /* renamed from: r */
    private int f6314r;

    /* renamed from: s */
    private Seeker f6315s;

    /* renamed from: t */
    private boolean f6316t;

    /* renamed from: u */
    private boolean f6317u;

    /* renamed from: v */
    private long f6318v;

    public Mp3Extractor() {
        this(0);
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: d */
    private void m7620d() {
        Assertions.m10156h(this.f6307k);
        Util.m10293i(this.f6306j);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [c.a.a.a.f2.y, c.a.a.a.f2.j0.g] */
    /* JADX WARNING: type inference failed for: r1v1, types: [c.a.a.a.f2.y, c.a.a.a.f2.j0.g, c.a.a.a.f2.j0.e] */
    /* JADX WARNING: type inference failed for: r0v1, types: [c.a.a.a.f2.y] */
    /* JADX WARNING: type inference failed for: r0v2, types: [c.a.a.a.f2.j0.g] */
    /* JADX WARNING: type inference failed for: r0v3, types: [c.a.a.a.f2.j0.g] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r4v0, types: [c.a.a.a.f2.j0.d] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r4v1, types: [c.a.a.a.f2.j0.d] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [c.a.a.a.f2.y, c.a.a.a.f2.j0.g]
  assigns: [c.a.a.a.f2.j0.g, ?[OBJECT, ARRAY], c.a.a.a.f2.j0.d]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], c.a.a.a.f2.y, c.a.a.a.f2.j0.g, c.a.a.a.f2.j0.d]
  mth insns count: 39
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p067c.p068a.p069a.p070a.p076f2.p082j0.Seeker m7621f(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r12) throws java.io.IOException {
        /*
            r11 = this;
            c.a.a.a.f2.j0.g r0 = r11.m7630q(r12)
            c.a.a.a.h2.a r1 = r11.f6310n
            long r2 = r12.mo6206q()
            c.a.a.a.f2.j0.e r1 = m7629p(r1, r2)
            boolean r2 = r11.f6316t
            if (r2 == 0) goto L_0x0018
            c.a.a.a.f2.j0.g$a r12 = new c.a.a.a.f2.j0.g$a
            r12.<init>()
            return r12
        L_0x0018:
            r2 = 0
            int r3 = r11.f6299c
            r3 = r3 & 2
            if (r3 == 0) goto L_0x004c
            r2 = -1
            if (r1 == 0) goto L_0x002e
            long r2 = r1.mo6169j()
            long r0 = r1.mo6252d()
        L_0x002b:
            r9 = r0
            r5 = r2
            goto L_0x0041
        L_0x002e:
            if (r0 == 0) goto L_0x0039
            long r2 = r0.mo6169j()
            long r0 = r0.mo6252d()
            goto L_0x002b
        L_0x0039:
            c.a.a.a.h2.a r0 = r11.f6310n
            long r0 = m7624k(r0)
            r5 = r0
            r9 = r2
        L_0x0041:
            c.a.a.a.f2.j0.d r0 = new c.a.a.a.f2.j0.d
            long r7 = r12.mo6206q()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L_0x0054
        L_0x004c:
            if (r1 == 0) goto L_0x0050
            r0 = r1
            goto L_0x0054
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            if (r0 == 0) goto L_0x0062
            boolean r1 = r0.mo6167f()
            if (r1 != 0) goto L_0x0066
            int r1 = r11.f6299c
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0066
        L_0x0062:
            c.a.a.a.f2.j0.g r0 = r11.m7623j(r12)
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p082j0.Mp3Extractor.m7621f(c.a.a.a.f2.k):c.a.a.a.f2.j0.g");
    }

    /* renamed from: g */
    private long m7622g(long j) {
        return this.f6311o + ((j * 1000000) / ((long) this.f6302f.f5441d));
    }

    /* renamed from: j */
    private Seeker m7623j(ExtractorInput kVar) throws IOException {
        kVar.mo6204o(this.f6301e.mo7379d(), 0, 4);
        this.f6301e.mo7374P(0);
        this.f6302f.mo5806a(this.f6301e.mo7389n());
        ConstantBitrateSeeker cVar = new ConstantBitrateSeeker(kVar.mo6194a(), kVar.mo6206q(), this.f6302f);
        return cVar;
    }

    /* renamed from: k */
    private static long m7624k(Metadata aVar) {
        if (aVar != null) {
            int o = aVar.mo6552o();
            for (int i = 0; i < o; i++) {
                C1034b n = aVar.mo6551n(i);
                if (n instanceof TextInformationFrame) {
                    TextInformationFrame mVar = (TextInformationFrame) n;
                    if (mVar.f7299a.equals("TLEN")) {
                        return C.m8860c(Long.parseLong(mVar.f7311c));
                    }
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: l */
    private static int m7625l(ParsableByteArray a0Var, int i) {
        if (a0Var.mo7381f() >= i + 4) {
            a0Var.mo7374P(i);
            int n = a0Var.mo7389n();
            if (n == 1483304551 || n == 1231971951) {
                return n;
            }
        }
        if (a0Var.mo7381f() >= 40) {
            a0Var.mo7374P(36);
            if (a0Var.mo7389n() == 1447187017) {
                return 1447187017;
            }
        }
        return 0;
    }

    /* renamed from: m */
    private static boolean m7626m(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: n */
    static /* synthetic */ Extractor[] m7627n() {
        return new Extractor[]{new Mp3Extractor()};
    }

    /* renamed from: o */
    static /* synthetic */ boolean m7628o(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: p */
    private static MlltSeeker m7629p(Metadata aVar, long j) {
        if (aVar != null) {
            int o = aVar.mo6552o();
            for (int i = 0; i < o; i++) {
                C1034b n = aVar.mo6551n(i);
                if (n instanceof MlltFrame) {
                    return MlltSeeker.m7613a(j, (MlltFrame) n, m7624k(aVar));
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f A[ADDED_TO_REGION] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p067c.p068a.p069a.p070a.p076f2.p082j0.Seeker m7630q(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r11) throws java.io.IOException {
        /*
            r10 = this;
            c.a.a.a.m2.a0 r5 = new c.a.a.a.m2.a0
            c.a.a.a.b2.c0$a r0 = r10.f6302f
            int r0 = r0.f5440c
            r5.<init>(r0)
            byte[] r0 = r5.mo7379d()
            c.a.a.a.b2.c0$a r1 = r10.f6302f
            int r1 = r1.f5440c
            r6 = 0
            r11.mo6204o(r0, r6, r1)
            c.a.a.a.b2.c0$a r0 = r10.f6302f
            int r1 = r0.f5438a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            if (r1 == 0) goto L_0x0028
            int r0 = r0.f5442e
            if (r0 == r2) goto L_0x002c
            r3 = 36
            r7 = 36
            goto L_0x0033
        L_0x0028:
            int r0 = r0.f5442e
            if (r0 == r2) goto L_0x002f
        L_0x002c:
            r7 = 21
            goto L_0x0033
        L_0x002f:
            r3 = 13
            r7 = 13
        L_0x0033:
            int r8 = m7625l(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L_0x0062
            if (r8 != r9) goto L_0x0042
            goto L_0x0062
        L_0x0042:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L_0x005d
            long r0 = r11.mo6194a()
            long r2 = r11.mo6206q()
            c.a.a.a.b2.c0$a r4 = r10.f6302f
            c.a.a.a.f2.j0.h r0 = p067c.p068a.p069a.p070a.p076f2.p082j0.VbriSeeker.m7645a(r0, r2, r4, r5)
            c.a.a.a.b2.c0$a r1 = r10.f6302f
            int r1 = r1.f5440c
            r11.mo6200i(r1)
            goto L_0x00b2
        L_0x005d:
            r0 = 0
            r11.mo6199h()
            goto L_0x00b2
        L_0x0062:
            long r0 = r11.mo6194a()
            long r2 = r11.mo6206q()
            c.a.a.a.b2.c0$a r4 = r10.f6302f
            c.a.a.a.f2.j0.i r0 = p067c.p068a.p069a.p070a.p076f2.p082j0.XingSeeker.m7651a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x009c
            c.a.a.a.f2.u r1 = r10.f6303g
            boolean r1 = r1.mo6389a()
            if (r1 != 0) goto L_0x009c
            r11.mo6199h()
            int r7 = r7 + 141
            r11.mo6205p(r7)
            c.a.a.a.m2.a0 r1 = r10.f6301e
            byte[] r1 = r1.mo7379d()
            r2 = 3
            r11.mo6204o(r1, r6, r2)
            c.a.a.a.m2.a0 r1 = r10.f6301e
            r1.mo7374P(r6)
            c.a.a.a.f2.u r1 = r10.f6303g
            c.a.a.a.m2.a0 r2 = r10.f6301e
            int r2 = r2.mo7365G()
            r1.mo6391d(r2)
        L_0x009c:
            c.a.a.a.b2.c0$a r1 = r10.f6302f
            int r1 = r1.f5440c
            r11.mo6200i(r1)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r0.mo6167f()
            if (r1 != 0) goto L_0x00b2
            if (r8 != r9) goto L_0x00b2
            c.a.a.a.f2.j0.g r11 = r10.m7623j(r11)
            return r11
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p082j0.Mp3Extractor.m7630q(c.a.a.a.f2.k):c.a.a.a.f2.j0.g");
    }

    /* renamed from: r */
    private boolean m7631r(ExtractorInput kVar) throws IOException {
        Seeker gVar = this.f6315s;
        if (gVar != null) {
            long d = gVar.mo6252d();
            if (d != -1 && kVar.mo6203n() > d - 4) {
                return true;
            }
        }
        try {
            return !kVar.mo6202m(this.f6301e.mo7379d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: s */
    private int m7632s(ExtractorInput kVar) throws IOException {
        if (this.f6309m == 0) {
            try {
                m7634u(kVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f6315s == null) {
            Seeker f = m7621f(kVar);
            this.f6315s = f;
            this.f6306j.mo6216f(f);
            this.f6308l.mo6177d(new C1245b().mo7705e0(this.f6302f.f5439b).mo7697W(4096).mo7682H(this.f6302f.f5442e).mo7706f0(this.f6302f.f5441d).mo7687M(this.f6303g.f7008b).mo7688N(this.f6303g.f7009c).mo7698X((this.f6299c & 4) != 0 ? null : this.f6310n).mo7679E());
            this.f6313q = kVar.mo6206q();
        } else if (this.f6313q != 0) {
            long q = kVar.mo6206q();
            long j = this.f6313q;
            if (q < j) {
                kVar.mo6200i((int) (j - q));
            }
        }
        return m7633t(kVar);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    /* renamed from: t */
    private int m7633t(ExtractorInput kVar) throws IOException {
        if (this.f6314r == 0) {
            kVar.mo6199h();
            if (m7631r(kVar)) {
                return -1;
            }
            this.f6301e.mo7374P(0);
            int n = this.f6301e.mo7389n();
            if (!m7626m(n, (long) this.f6309m) || MpegAudioUtil.m6546j(n) == -1) {
                kVar.mo6200i(1);
                this.f6309m = 0;
                return 0;
            }
            this.f6302f.mo5806a(n);
            if (this.f6311o == -9223372036854775807L) {
                this.f6311o = this.f6315s.mo6253g(kVar.mo6206q());
                if (this.f6300d != -9223372036854775807L) {
                    this.f6311o += this.f6300d - this.f6315s.mo6253g(0);
                }
            }
            C0815a aVar = this.f6302f;
            this.f6314r = aVar.f5440c;
            Seeker gVar = this.f6315s;
            if (gVar instanceof IndexSeeker) {
                IndexSeeker dVar = (IndexSeeker) gVar;
                dVar.mo6255b(m7622g(this.f6312p + ((long) aVar.f5444g)), kVar.mo6206q() + ((long) this.f6302f.f5440c));
                if (this.f6317u && dVar.mo6254a(this.f6318v)) {
                    this.f6317u = false;
                    this.f6308l = this.f6307k;
                }
            }
        }
        int f = this.f6308l.mo6179f(kVar, this.f6314r, true);
        if (f == -1) {
            return -1;
        }
        int i = this.f6314r - f;
        this.f6314r = i;
        if (i > 0) {
            return 0;
        }
        this.f6308l.mo6176c(m7622g(this.f6312p), 1, this.f6302f.f5440c, 0, null);
        this.f6312p += (long) this.f6302f.f5444g;
        this.f6314r = 0;
        return 0;
    }

    /* renamed from: u */
    private boolean m7634u(ExtractorInput kVar, boolean z) throws IOException {
        int i;
        int i2;
        C1050a aVar;
        int i3 = z ? 32768 : 131072;
        kVar.mo6199h();
        if (kVar.mo6206q() == 0) {
            if ((this.f6299c & 4) == 0) {
                aVar = null;
            } else {
                aVar = f6298b;
            }
            Metadata a = this.f6304h.mo6392a(kVar, aVar);
            this.f6310n = a;
            if (a != null) {
                this.f6303g.mo6390c(a);
            }
            i = (int) kVar.mo6203n();
            if (!z) {
                kVar.mo6200i(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m7631r(kVar)) {
                this.f6301e.mo7374P(0);
                int n = this.f6301e.mo7389n();
                if (i2 == 0 || m7626m(n, (long) i2)) {
                    int j = MpegAudioUtil.m6546j(n);
                    if (j != -1) {
                        i4++;
                        if (i4 != 1) {
                            if (i4 == 4) {
                                break;
                            }
                        } else {
                            this.f6302f.mo5806a(n);
                            i2 = n;
                        }
                        kVar.mo6205p(j - 4);
                    }
                }
                int i6 = i5 + 1;
                if (i5 != i3) {
                    if (z) {
                        kVar.mo6199h();
                        kVar.mo6205p(i + i6);
                    } else {
                        kVar.mo6200i(1);
                    }
                    i5 = i6;
                    i2 = 0;
                    i4 = 0;
                } else if (z) {
                    return false;
                } else {
                    throw new ParserException("Searched too many bytes.");
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            kVar.mo6200i(i + i5);
        } else {
            kVar.mo6199h();
        }
        this.f6309m = i2;
        return true;
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6306j = lVar;
        C0916b0 q = lVar.mo6218q(0, 1);
        this.f6307k = q;
        this.f6308l = q;
        this.f6306j.mo6217h();
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        this.f6309m = 0;
        this.f6311o = -9223372036854775807L;
        this.f6312p = 0;
        this.f6314r = 0;
        this.f6318v = j2;
        Seeker gVar = this.f6315s;
        if ((gVar instanceof IndexSeeker) && !((IndexSeeker) gVar).mo6254a(j2)) {
            this.f6317u = true;
            this.f6308l = this.f6305i;
        }
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        return m7634u(kVar, true);
    }

    /* renamed from: h */
    public void mo6257h() {
        this.f6316t = true;
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        m7620d();
        int s = m7632s(kVar);
        if (s == -1 && (this.f6315s instanceof IndexSeeker)) {
            long g = m7622g(this.f6312p);
            if (this.f6315s.mo6169j() != g) {
                ((IndexSeeker) this.f6315s).mo6256c(g);
                this.f6306j.mo6216f(this.f6315s);
            }
        }
        return s;
    }

    public Mp3Extractor(int i) {
        this(i, -9223372036854775807L);
    }

    public Mp3Extractor(int i, long j) {
        this.f6299c = i;
        this.f6300d = j;
        this.f6301e = new ParsableByteArray(10);
        this.f6302f = new C0815a();
        this.f6303g = new GaplessInfoHolder();
        this.f6311o = -9223372036854775807L;
        this.f6304h = new Id3Peeker();
        DummyTrackOutput iVar = new DummyTrackOutput();
        this.f6305i = iVar;
        this.f6308l = iVar;
    }
}
