package p067c.p068a.p069a.p070a.p076f2.p083k0;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p076f2.GaplessInfoHolder;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p094n.MdtaMetadataEntry;
import p067c.p068a.p069a.p070a.p088h2.p094n.SmtaMetadataEntry;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p069a.p070a.p112n2.AvcConfig;
import p067c.p068a.p069a.p070a.p112n2.DolbyVisionConfig;
import p067c.p068a.p069a.p070a.p112n2.HevcConfig;
import p067c.p068a.p134b.p135a.C1319e;
import p067c.p068a.p134b.p136b.ImmutableList;

/* renamed from: c.a.a.a.f2.k0.f */
final class AtomParsers {

    /* renamed from: a */
    private static final byte[] f6338a = Util.m10290g0("OpusHead");

    /* renamed from: c.a.a.a.f2.k0.f$a */
    /* compiled from: AtomParsers */
    private static final class C0948a {

        /* renamed from: a */
        public final int f6339a;

        /* renamed from: b */
        public int f6340b;

        /* renamed from: c */
        public int f6341c;

        /* renamed from: d */
        public long f6342d;

        /* renamed from: e */
        private final boolean f6343e;

        /* renamed from: f */
        private final ParsableByteArray f6344f;

        /* renamed from: g */
        private final ParsableByteArray f6345g;

        /* renamed from: h */
        private int f6346h;

        /* renamed from: i */
        private int f6347i;

        public C0948a(ParsableByteArray a0Var, ParsableByteArray a0Var2, boolean z) {
            this.f6345g = a0Var;
            this.f6344f = a0Var2;
            this.f6343e = z;
            a0Var2.mo7374P(12);
            this.f6339a = a0Var2.mo7366H();
            a0Var.mo7374P(12);
            this.f6347i = a0Var.mo7366H();
            boolean z2 = true;
            if (a0Var.mo7389n() != 1) {
                z2 = false;
            }
            Assertions.m10155g(z2, "first_chunk must be 1");
            this.f6340b = -1;
        }

        /* renamed from: a */
        public boolean mo6264a() {
            long j;
            int i = this.f6340b + 1;
            this.f6340b = i;
            if (i == this.f6339a) {
                return false;
            }
            if (this.f6343e) {
                j = this.f6344f.mo7367I();
            } else {
                j = this.f6344f.mo7364F();
            }
            this.f6342d = j;
            if (this.f6340b == this.f6346h) {
                this.f6341c = this.f6345g.mo7366H();
                this.f6345g.mo7375Q(4);
                int i2 = this.f6347i - 1;
                this.f6347i = i2;
                this.f6346h = i2 > 0 ? this.f6345g.mo7366H() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: c.a.a.a.f2.k0.f$b */
    /* compiled from: AtomParsers */
    private interface C0949b {
        /* renamed from: a */
        int mo6265a();

        /* renamed from: b */
        int mo6266b();

        /* renamed from: c */
        int mo6267c();
    }

    /* renamed from: c.a.a.a.f2.k0.f$c */
    /* compiled from: AtomParsers */
    private static final class C0950c {

        /* renamed from: a */
        public final TrackEncryptionBox[] f6348a;

        /* renamed from: b */
        public Format f6349b;

        /* renamed from: c */
        public int f6350c;

        /* renamed from: d */
        public int f6351d = 0;

        public C0950c(int i) {
            this.f6348a = new TrackEncryptionBox[i];
        }
    }

    /* renamed from: c.a.a.a.f2.k0.f$d */
    /* compiled from: AtomParsers */
    static final class C0951d implements C0949b {

        /* renamed from: a */
        private final int f6352a;

        /* renamed from: b */
        private final int f6353b;

        /* renamed from: c */
        private final ParsableByteArray f6354c;

        public C0951d(C0947b bVar, Format u0Var) {
            ParsableByteArray a0Var = bVar.f6337b;
            this.f6354c = a0Var;
            a0Var.mo7374P(12);
            int H = a0Var.mo7366H();
            if ("audio/raw".equals(u0Var.f8814l)) {
                int X = Util.m10274X(u0Var.f8797A, u0Var.f8827y);
                if (H == 0 || H % X != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(X);
                    sb.append(", stsz sample size: ");
                    sb.append(H);
                    Log.m10386h("AtomParsers", sb.toString());
                    H = X;
                }
            }
            if (H == 0) {
                H = -1;
            }
            this.f6352a = H;
            this.f6353b = a0Var.mo7366H();
        }

        /* renamed from: a */
        public int mo6265a() {
            return this.f6352a;
        }

        /* renamed from: b */
        public int mo6266b() {
            return this.f6353b;
        }

        /* renamed from: c */
        public int mo6267c() {
            int i = this.f6352a;
            return i == -1 ? this.f6354c.mo7366H() : i;
        }
    }

    /* renamed from: c.a.a.a.f2.k0.f$e */
    /* compiled from: AtomParsers */
    static final class C0952e implements C0949b {

        /* renamed from: a */
        private final ParsableByteArray f6355a;

        /* renamed from: b */
        private final int f6356b;

        /* renamed from: c */
        private final int f6357c;

        /* renamed from: d */
        private int f6358d;

        /* renamed from: e */
        private int f6359e;

        public C0952e(C0947b bVar) {
            ParsableByteArray a0Var = bVar.f6337b;
            this.f6355a = a0Var;
            a0Var.mo7374P(12);
            this.f6357c = a0Var.mo7366H() & 255;
            this.f6356b = a0Var.mo7366H();
        }

        /* renamed from: a */
        public int mo6265a() {
            return -1;
        }

        /* renamed from: b */
        public int mo6266b() {
            return this.f6356b;
        }

        /* renamed from: c */
        public int mo6267c() {
            int i = this.f6357c;
            if (i == 8) {
                return this.f6355a.mo7362D();
            }
            if (i == 16) {
                return this.f6355a.mo7368J();
            }
            int i2 = this.f6358d;
            this.f6358d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f6359e & 15;
            }
            int D = this.f6355a.mo7362D();
            this.f6359e = D;
            return (D & 240) >> 4;
        }
    }

    /* renamed from: c.a.a.a.f2.k0.f$f */
    /* compiled from: AtomParsers */
    private static final class C0953f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f6360a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f6361b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f6362c;

        public C0953f(int i, long j, int i2) {
            this.f6360a = i;
            this.f6361b = j;
            this.f6362c = i2;
        }
    }

    /* renamed from: A */
    public static Pair<Metadata, Metadata> m7682A(C0947b bVar) {
        ParsableByteArray a0Var = bVar.f6337b;
        a0Var.mo7374P(8);
        Metadata aVar = null;
        Object obj = null;
        while (a0Var.mo7376a() >= 8) {
            int e = a0Var.mo7380e();
            int n = a0Var.mo7389n();
            int n2 = a0Var.mo7389n();
            if (n2 == 1835365473) {
                a0Var.mo7374P(e);
                aVar = m7683B(a0Var, e + n);
            } else if (n2 == 1936553057) {
                a0Var.mo7374P(e);
                obj = m7704t(a0Var, e + n);
            }
            a0Var.mo7374P(e + n);
        }
        return Pair.create(aVar, obj);
    }

    /* renamed from: B */
    private static Metadata m7683B(ParsableByteArray a0Var, int i) {
        a0Var.mo7375Q(8);
        m7688d(a0Var);
        while (a0Var.mo7380e() < i) {
            int e = a0Var.mo7380e();
            int n = a0Var.mo7389n();
            if (a0Var.mo7389n() == 1768715124) {
                a0Var.mo7374P(e);
                return m7695k(a0Var, e + n);
            }
            a0Var.mo7374P(e + n);
        }
        return null;
    }

    /* renamed from: C */
    private static void m7684C(ParsableByteArray a0Var, int i, int i2, int i3, int i4, int i5, DrmInitData tVar, C0950c cVar, int i6) throws ParserException {
        DrmInitData tVar2;
        List list;
        String str;
        List<byte[]> list2;
        String str2;
        String str3;
        ParsableByteArray a0Var2 = a0Var;
        int i7 = i2;
        int i8 = i3;
        DrmInitData tVar3 = tVar;
        C0950c cVar2 = cVar;
        a0Var2.mo7374P(i7 + 8 + 8);
        a0Var2.mo7375Q(16);
        int J = a0Var.mo7368J();
        int J2 = a0Var.mo7368J();
        a0Var2.mo7375Q(50);
        int e = a0Var.mo7380e();
        String str4 = null;
        int i9 = i;
        if (i9 == 1701733238) {
            Pair r = m7702r(a0Var2, i7, i8);
            if (r != null) {
                i9 = ((Integer) r.first).intValue();
                if (tVar3 == null) {
                    tVar3 = null;
                } else {
                    tVar3 = tVar3.mo6100n(((TrackEncryptionBox) r.second).f6478b);
                }
                cVar2.f6348a[i6] = (TrackEncryptionBox) r.second;
            }
            a0Var2.mo7374P(e);
        }
        List list3 = null;
        String str5 = i9 == 1831958048 ? "video/mpeg" : null;
        int i10 = -1;
        float f = 1.0f;
        boolean z = false;
        byte[] bArr = null;
        while (true) {
            if (e - i7 >= i8) {
                tVar2 = tVar3;
                list = list3;
                break;
            }
            a0Var2.mo7374P(e);
            int e2 = a0Var.mo7380e();
            tVar2 = tVar3;
            int n = a0Var.mo7389n();
            if (n == 0) {
                list = list3;
                if (a0Var.mo7380e() - i7 == i8) {
                    break;
                }
            } else {
                list = list3;
            }
            Assertions.m10155g(n > 0, "childAtomSize should be positive");
            int n2 = a0Var.mo7389n();
            if (n2 == 1635148611) {
                Assertions.m10154f(str5 == null);
                a0Var2.mo7374P(e2 + 8);
                AvcConfig b = AvcConfig.m10501b(a0Var);
                list2 = b.f8524a;
                cVar2.f6350c = b.f8525b;
                if (!z) {
                    f = b.f8528e;
                }
                str2 = b.f8529f;
                str = "video/avc";
            } else if (n2 == 1752589123) {
                Assertions.m10154f(str5 == null);
                a0Var2.mo7374P(e2 + 8);
                HevcConfig a = HevcConfig.m10526a(a0Var);
                list2 = a.f8562a;
                cVar2.f6350c = a.f8563b;
                str2 = a.f8564c;
                str = "video/hevc";
            } else {
                if (n2 == 1685480259 || n2 == 1685485123) {
                    DolbyVisionConfig a2 = DolbyVisionConfig.m10504a(a0Var);
                    if (a2 != null) {
                        str4 = a2.f8537c;
                        str5 = "video/dolby-vision";
                    }
                } else {
                    if (n2 == 1987076931) {
                        Assertions.m10154f(str5 == null);
                        str3 = i9 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (n2 == 1635135811) {
                        Assertions.m10154f(str5 == null);
                        str3 = "video/av01";
                    } else if (n2 == 1681012275) {
                        Assertions.m10154f(str5 == null);
                        str3 = "video/3gpp";
                    } else {
                        if (n2 == 1702061171) {
                            Assertions.m10154f(str5 == null);
                            Pair h = m7692h(a0Var2, e2);
                            String str6 = (String) h.first;
                            byte[] bArr2 = (byte[]) h.second;
                            list3 = bArr2 != null ? ImmutableList.m11918q(bArr2) : list;
                            str5 = str6;
                        } else if (n2 == 1885434736) {
                            list3 = list;
                            f = m7700p(a0Var2, e2);
                            z = true;
                        } else if (n2 == 1937126244) {
                            list3 = list;
                            bArr = m7701q(a0Var2, e2, n);
                        } else if (n2 == 1936995172) {
                            int D = a0Var.mo7362D();
                            a0Var2.mo7375Q(3);
                            if (D == 0) {
                                int D2 = a0Var.mo7362D();
                                if (D2 == 0) {
                                    list3 = list;
                                    i10 = 0;
                                } else if (D2 == 1) {
                                    list3 = list;
                                    i10 = 1;
                                } else if (D2 == 2) {
                                    list3 = list;
                                    i10 = 2;
                                } else if (D2 == 3) {
                                    list3 = list;
                                    i10 = 3;
                                }
                            }
                        }
                        e += n;
                        i7 = i2;
                        i8 = i3;
                        tVar3 = tVar2;
                    }
                    list3 = list;
                    str5 = str3;
                    e += n;
                    i7 = i2;
                    i8 = i3;
                    tVar3 = tVar2;
                }
                list3 = list;
                e += n;
                i7 = i2;
                i8 = i3;
                tVar3 = tVar2;
            }
            list3 = list2;
            str5 = str;
            str4 = str2;
            e += n;
            i7 = i2;
            i8 = i3;
            tVar3 = tVar2;
        }
        if (str5 != null) {
            cVar2.f6349b = new C1245b().mo7692R(i4).mo7705e0(str5).mo7683I(str4).mo7710j0(J).mo7691Q(J2).mo7701a0(f).mo7704d0(i5).mo7702b0(bArr).mo7708h0(i10).mo7694T(list).mo7686L(tVar2).mo7679E();
        }
    }

    /* renamed from: a */
    private static boolean m7685a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int p = Util.m10307p(4, 0, length);
        int p2 = Util.m10307p(jArr.length - 4, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[p] || jArr[p2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static int m7686b(ParsableByteArray a0Var, int i, int i2) {
        int e = a0Var.mo7380e();
        while (e - i < i2) {
            a0Var.mo7374P(e);
            int n = a0Var.mo7389n();
            Assertions.m10155g(n > 0, "childAtomSize should be positive");
            if (a0Var.mo7389n() == 1702061171) {
                return e;
            }
            e += n;
        }
        return -1;
    }

    /* renamed from: c */
    private static int m7687c(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: d */
    public static void m7688d(ParsableByteArray a0Var) {
        int e = a0Var.mo7380e();
        a0Var.mo7375Q(4);
        if (a0Var.mo7389n() != 1751411826) {
            e += 4;
        }
        a0Var.mo7374P(e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0136  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m7689e(p067c.p068a.p069a.p070a.p111m2.ParsableByteArray r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, p067c.p068a.p069a.p070a.p075e2.DrmInitData r27, p067c.p068a.p069a.p070a.p076f2.p083k0.AtomParsers.C0950c r28, int r29) throws p067c.p068a.p069a.p070a.ParserException {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r6 = r28
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.mo7374P(r7)
            r7 = 6
            if (r26 == 0) goto L_0x0021
            int r8 = r20.mo7368J()
            r0.mo7375Q(r7)
            goto L_0x0025
        L_0x0021:
            r0.mo7375Q(r8)
            r8 = 0
        L_0x0025:
            r10 = 16
            r11 = 2
            r12 = 1
            if (r8 == 0) goto L_0x0047
            if (r8 != r12) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            if (r8 != r11) goto L_0x0046
            r0.mo7375Q(r10)
            double r7 = r20.mo7387l()
            long r7 = java.lang.Math.round(r7)
            int r8 = (int) r7
            int r7 = r20.mo7366H()
            r10 = 20
            r0.mo7375Q(r10)
            goto L_0x0059
        L_0x0046:
            return
        L_0x0047:
            int r13 = r20.mo7368J()
            r0.mo7375Q(r7)
            int r7 = r20.mo7363E()
            if (r8 != r12) goto L_0x0057
            r0.mo7375Q(r10)
        L_0x0057:
            r8 = r7
            r7 = r13
        L_0x0059:
            int r10 = r20.mo7380e()
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r21
            if (r15 != r13) goto L_0x008f
            android.util.Pair r13 = m7702r(r0, r1, r2)
            if (r13 == 0) goto L_0x008a
            java.lang.Object r15 = r13.first
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r5 != 0) goto L_0x0076
            r14 = 0
            goto L_0x0081
        L_0x0076:
            java.lang.Object r14 = r13.second
            c.a.a.a.f2.k0.p r14 = (p067c.p068a.p069a.p070a.p076f2.p083k0.TrackEncryptionBox) r14
            java.lang.String r14 = r14.f6478b
            c.a.a.a.e2.t r5 = r5.mo6100n(r14)
            r14 = r5
        L_0x0081:
            c.a.a.a.f2.k0.p[] r5 = r6.f6348a
            java.lang.Object r13 = r13.second
            c.a.a.a.f2.k0.p r13 = (p067c.p068a.p069a.p070a.p076f2.p083k0.TrackEncryptionBox) r13
            r5[r29] = r13
            goto L_0x008b
        L_0x008a:
            r14 = r5
        L_0x008b:
            r0.mo7374P(r10)
            goto L_0x0090
        L_0x008f:
            r14 = r5
        L_0x0090:
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            r13 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r17 = "audio/raw"
            if (r15 != r5) goto L_0x009f
            java.lang.String r17 = "audio/ac3"
        L_0x009c:
            r5 = -1
            goto L_0x012d
        L_0x009f:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r15 != r5) goto L_0x00a7
            java.lang.String r17 = "audio/eac3"
            goto L_0x009c
        L_0x00a7:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r15 != r5) goto L_0x00af
            java.lang.String r17 = "audio/ac4"
            goto L_0x009c
        L_0x00af:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r15 != r5) goto L_0x00b7
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x009c
        L_0x00b7:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r15 == r5) goto L_0x0129
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r15 != r5) goto L_0x00c3
            goto L_0x0129
        L_0x00c3:
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r15 != r5) goto L_0x00cb
            java.lang.String r17 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009c
        L_0x00cb:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r15 != r5) goto L_0x00d3
            java.lang.String r17 = "audio/3gpp"
            goto L_0x009c
        L_0x00d3:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r15 != r5) goto L_0x00db
            java.lang.String r17 = "audio/amr-wb"
            goto L_0x009c
        L_0x00db:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r15 == r5) goto L_0x0127
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r15 != r5) goto L_0x00e6
            goto L_0x0127
        L_0x00e6:
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r15 != r5) goto L_0x00ee
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012d
        L_0x00ee:
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r15 == r5) goto L_0x0123
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r15 != r5) goto L_0x00f9
            goto L_0x0123
        L_0x00f9:
            if (r15 != r13) goto L_0x00fe
            java.lang.String r17 = "audio/alac"
            goto L_0x009c
        L_0x00fe:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r15 != r5) goto L_0x0106
            java.lang.String r17 = "audio/g711-alaw"
            goto L_0x009c
        L_0x0106:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r15 != r5) goto L_0x010e
            java.lang.String r17 = "audio/g711-mlaw"
            goto L_0x009c
        L_0x010e:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r15 != r5) goto L_0x0116
            java.lang.String r17 = "audio/opus"
            goto L_0x009c
        L_0x0116:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r15 != r5) goto L_0x011f
            java.lang.String r17 = "audio/flac"
            goto L_0x009c
        L_0x011f:
            r5 = -1
            r17 = 0
            goto L_0x012d
        L_0x0123:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x009c
        L_0x0127:
            r5 = 2
            goto L_0x012d
        L_0x0129:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x009c
        L_0x012d:
            r11 = r17
            r15 = 0
            r19 = 0
        L_0x0132:
            int r13 = r10 - r1
            if (r13 >= r2) goto L_0x0295
            r0.mo7374P(r10)
            int r13 = r20.mo7389n()
            if (r13 <= 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r12 = 0
        L_0x0141:
            java.lang.String r9 = "childAtomSize should be positive"
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10155g(r12, r9)
            int r9 = r20.mo7389n()
            r12 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r12) goto L_0x0258
            if (r26 == 0) goto L_0x015f
            r12 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r12) goto L_0x015f
            r1 = 1702061171(0x65736473, float:7.183675E22)
            r2 = 0
            r12 = 1
            r16 = 2
            goto L_0x025f
        L_0x015f:
            r12 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r12) goto L_0x017c
            int r9 = r10 + 8
            r0.mo7374P(r9)
            java.lang.String r9 = java.lang.Integer.toString(r24)
            c.a.a.a.u0 r9 = p067c.p068a.p069a.p070a.p072b2.Ac3Util.m6627c(r0, r9, r4, r14)
            r6.f6349b = r9
        L_0x0173:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = 0
            r12 = 1
            r16 = 2
            goto L_0x0256
        L_0x017c:
            r12 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r12) goto L_0x0191
            int r9 = r10 + 8
            r0.mo7374P(r9)
            java.lang.String r9 = java.lang.Integer.toString(r24)
            c.a.a.a.u0 r9 = p067c.p068a.p069a.p070a.p072b2.Ac3Util.m6631g(r0, r9, r4, r14)
            r6.f6349b = r9
            goto L_0x0173
        L_0x0191:
            r12 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r12) goto L_0x01a6
            int r9 = r10 + 8
            r0.mo7374P(r9)
            java.lang.String r9 = java.lang.Integer.toString(r24)
            c.a.a.a.u0 r9 = p067c.p068a.p069a.p070a.p072b2.Ac4Util.m6635b(r0, r9, r4, r14)
            r6.f6349b = r9
            goto L_0x0173
        L_0x01a6:
            r12 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 != r12) goto L_0x01cf
            c.a.a.a.u0$b r9 = new c.a.a.a.u0$b
            r9.<init>()
            c.a.a.a.u0$b r9 = r9.mo7692R(r3)
            c.a.a.a.u0$b r9 = r9.mo7705e0(r11)
            c.a.a.a.u0$b r9 = r9.mo7682H(r7)
            c.a.a.a.u0$b r9 = r9.mo7706f0(r8)
            c.a.a.a.u0$b r9 = r9.mo7686L(r14)
            c.a.a.a.u0$b r9 = r9.mo7696V(r4)
            c.a.a.a.u0 r9 = r9.mo7679E()
            r6.f6349b = r9
            goto L_0x0173
        L_0x01cf:
            r12 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r12) goto L_0x01f3
            int r9 = r13 + -8
            byte[] r12 = f6338a
            int r1 = r12.length
            int r1 = r1 + r9
            byte[] r1 = java.util.Arrays.copyOf(r12, r1)
            int r2 = r10 + 8
            r0.mo7374P(r2)
            int r2 = r12.length
            r0.mo7385j(r1, r2, r9)
            java.util.List r1 = p067c.p068a.p069a.p070a.p072b2.OpusUtil.m6551a(r1)
            r19 = r1
            r9 = -1
            r12 = 1
            r16 = 2
            goto L_0x028e
        L_0x01f3:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L_0x0223
            int r1 = r13 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r9 = 102(0x66, float:1.43E-43)
            r12 = 0
            r2[r12] = r9
            r9 = 76
            r12 = 1
            r2[r12] = r9
            r9 = 97
            r16 = 2
            r2[r16] = r9
            r9 = 3
            r18 = 67
            r2[r9] = r18
            int r9 = r10 + 12
            r0.mo7374P(r9)
            r9 = 4
            r0.mo7385j(r2, r9, r1)
            c.a.b.b.r r1 = p067c.p068a.p134b.p136b.ImmutableList.m11918q(r2)
            r19 = r1
            goto L_0x0256
        L_0x0223:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 1
            r16 = 2
            if (r9 != r1) goto L_0x0255
            int r2 = r13 + -12
            byte[] r7 = new byte[r2]
            int r8 = r10 + 12
            r0.mo7374P(r8)
            r9 = 0
            r0.mo7385j(r7, r9, r2)
            android.util.Pair r2 = p067c.p068a.p069a.p070a.p111m2.CodecSpecificDataUtil.m10174e(r7)
            java.lang.Object r8 = r2.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            c.a.b.b.r r7 = p067c.p068a.p134b.p136b.ImmutableList.m11918q(r7)
            r19 = r7
            r9 = -1
            r7 = r2
            goto L_0x028e
        L_0x0255:
            r9 = 0
        L_0x0256:
            r9 = -1
            goto L_0x028e
        L_0x0258:
            r2 = 0
            r12 = 1
            r16 = 2
            r1 = 1702061171(0x65736473, float:7.183675E22)
        L_0x025f:
            if (r9 != r1) goto L_0x0263
            r1 = r10
            goto L_0x0267
        L_0x0263:
            int r1 = m7686b(r0, r10, r13)
        L_0x0267:
            r9 = -1
            if (r1 == r9) goto L_0x028e
            android.util.Pair r1 = m7692h(r0, r1)
            java.lang.Object r11 = r1.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x028e
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x028a
            c.a.a.a.b2.k$b r2 = p067c.p068a.p069a.p070a.p072b2.AacUtil.m6623f(r1)
            int r8 = r2.f5521a
            int r7 = r2.f5522b
            java.lang.String r15 = r2.f5523c
        L_0x028a:
            c.a.b.b.r r19 = p067c.p068a.p134b.p136b.ImmutableList.m11918q(r1)
        L_0x028e:
            int r10 = r10 + r13
            r1 = r22
            r2 = r23
            goto L_0x0132
        L_0x0295:
            c.a.a.a.u0 r0 = r6.f6349b
            if (r0 != 0) goto L_0x02cc
            if (r11 == 0) goto L_0x02cc
            c.a.a.a.u0$b r0 = new c.a.a.a.u0$b
            r0.<init>()
            c.a.a.a.u0$b r0 = r0.mo7692R(r3)
            c.a.a.a.u0$b r0 = r0.mo7705e0(r11)
            c.a.a.a.u0$b r0 = r0.mo7683I(r15)
            c.a.a.a.u0$b r0 = r0.mo7682H(r7)
            c.a.a.a.u0$b r0 = r0.mo7706f0(r8)
            c.a.a.a.u0$b r0 = r0.mo7699Y(r5)
            r1 = r19
            c.a.a.a.u0$b r0 = r0.mo7694T(r1)
            c.a.a.a.u0$b r0 = r0.mo7686L(r14)
            c.a.a.a.u0$b r0 = r0.mo7696V(r4)
            c.a.a.a.u0 r0 = r0.mo7679E()
            r6.f6349b = r0
        L_0x02cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p083k0.AtomParsers.m7689e(c.a.a.a.m2.a0, int, int, int, int, java.lang.String, boolean, c.a.a.a.e2.t, c.a.a.a.f2.k0.f$c, int):void");
    }

    /* renamed from: f */
    static Pair<Integer, TrackEncryptionBox> m7690f(ParsableByteArray a0Var, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        String str = null;
        Object obj = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            a0Var.mo7374P(i3);
            int n = a0Var.mo7389n();
            int n2 = a0Var.mo7389n();
            if (n2 == 1718775137) {
                obj = Integer.valueOf(a0Var.mo7389n());
            } else if (n2 == 1935894637) {
                a0Var.mo7375Q(4);
                str = a0Var.mo7359A(4);
            } else if (n2 == 1935894633) {
                i4 = i3;
                i5 = n;
            }
            i3 += n;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        Assertions.m10157i(obj, "frma atom is mandatory");
        if (i4 != -1) {
            z = true;
        }
        Assertions.m10155g(z, "schi atom is mandatory");
        return Pair.create(obj, (TrackEncryptionBox) Assertions.m10157i(m7703s(a0Var, i4, i5, str), "tenc atom is mandatory"));
    }

    /* renamed from: g */
    private static Pair<long[], long[]> m7691g(C0946a aVar) {
        C0947b g = aVar.mo6263g(1701606260);
        if (g == null) {
            return null;
        }
        ParsableByteArray a0Var = g.f6337b;
        a0Var.mo7374P(8);
        int c = Atom.m7677c(a0Var.mo7389n());
        int H = a0Var.mo7366H();
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        int i = 0;
        while (i < H) {
            jArr[i] = c == 1 ? a0Var.mo7367I() : a0Var.mo7364F();
            jArr2[i] = c == 1 ? a0Var.mo7398w() : (long) a0Var.mo7389n();
            if (a0Var.mo7401z() == 1) {
                a0Var.mo7375Q(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: h */
    private static Pair<String, byte[]> m7692h(ParsableByteArray a0Var, int i) {
        a0Var.mo7374P(i + 8 + 4);
        a0Var.mo7375Q(1);
        m7693i(a0Var);
        a0Var.mo7375Q(2);
        int D = a0Var.mo7362D();
        if ((D & 128) != 0) {
            a0Var.mo7375Q(2);
        }
        if ((D & 64) != 0) {
            a0Var.mo7375Q(a0Var.mo7368J());
        }
        if ((D & 32) != 0) {
            a0Var.mo7375Q(2);
        }
        a0Var.mo7375Q(1);
        m7693i(a0Var);
        String h = MimeTypes.m10402h(a0Var.mo7362D());
        if ("audio/mpeg".equals(h) || "audio/vnd.dts".equals(h) || "audio/vnd.dts.hd".equals(h)) {
            return Pair.create(h, null);
        }
        a0Var.mo7375Q(12);
        a0Var.mo7375Q(1);
        int i2 = m7693i(a0Var);
        byte[] bArr = new byte[i2];
        a0Var.mo7385j(bArr, 0, i2);
        return Pair.create(h, bArr);
    }

    /* renamed from: i */
    private static int m7693i(ParsableByteArray a0Var) {
        int D = a0Var.mo7362D();
        int i = D & 127;
        while ((D & 128) == 128) {
            D = a0Var.mo7362D();
            i = (i << 7) | (D & 127);
        }
        return i;
    }

    /* renamed from: j */
    private static int m7694j(ParsableByteArray a0Var) {
        a0Var.mo7374P(16);
        return a0Var.mo7389n();
    }

    /* renamed from: k */
    private static Metadata m7695k(ParsableByteArray a0Var, int i) {
        a0Var.mo7375Q(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.mo7380e() < i) {
            C1034b c = MetadataUtil.m7783c(a0Var);
            if (c != null) {
                arrayList.add(c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends C1034b>) arrayList);
    }

    /* renamed from: l */
    private static Pair<Long, String> m7696l(ParsableByteArray a0Var) {
        int i = 8;
        a0Var.mo7374P(8);
        int c = Atom.m7677c(a0Var.mo7389n());
        a0Var.mo7375Q(c == 0 ? 8 : 16);
        long F = a0Var.mo7364F();
        if (c == 0) {
            i = 4;
        }
        a0Var.mo7375Q(i);
        int J = a0Var.mo7368J();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) (((J >> 10) & 31) + 96));
        sb.append((char) (((J >> 5) & 31) + 96));
        sb.append((char) ((J & 31) + 96));
        return Pair.create(Long.valueOf(F), sb.toString());
    }

    /* renamed from: m */
    public static Metadata m7697m(C0946a aVar) {
        C0947b g = aVar.mo6263g(1751411826);
        C0947b g2 = aVar.mo6263g(1801812339);
        C0947b g3 = aVar.mo6263g(1768715124);
        if (g == null || g2 == null || g3 == null || m7694j(g.f6337b) != 1835299937) {
            return null;
        }
        ParsableByteArray a0Var = g2.f6337b;
        a0Var.mo7374P(12);
        int n = a0Var.mo7389n();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            int n2 = a0Var.mo7389n();
            a0Var.mo7375Q(4);
            strArr[i] = a0Var.mo7359A(n2 - 8);
        }
        ParsableByteArray a0Var2 = g3.f6337b;
        a0Var2.mo7374P(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.mo7376a() > 8) {
            int e = a0Var2.mo7380e();
            int n3 = a0Var2.mo7389n();
            int n4 = a0Var2.mo7389n() - 1;
            if (n4 < 0 || n4 >= n) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(n4);
                Log.m10386h("AtomParsers", sb.toString());
            } else {
                MdtaMetadataEntry f = MetadataUtil.m7786f(a0Var2, e + n3, strArr[n4]);
                if (f != null) {
                    arrayList.add(f);
                }
            }
            a0Var2.mo7374P(e + n3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends C1034b>) arrayList);
    }

    /* renamed from: n */
    private static void m7698n(ParsableByteArray a0Var, int i, int i2, int i3, C0950c cVar) {
        a0Var.mo7374P(i2 + 8 + 8);
        if (i == 1835365492) {
            a0Var.mo7399x();
            String x = a0Var.mo7399x();
            if (x != null) {
                cVar.f6349b = new C1245b().mo7692R(i3).mo7705e0(x).mo7679E();
            }
        }
    }

    /* renamed from: o */
    private static long m7699o(ParsableByteArray a0Var) {
        int i = 8;
        a0Var.mo7374P(8);
        if (Atom.m7677c(a0Var.mo7389n()) != 0) {
            i = 16;
        }
        a0Var.mo7375Q(i);
        return a0Var.mo7364F();
    }

    /* renamed from: p */
    private static float m7700p(ParsableByteArray a0Var, int i) {
        a0Var.mo7374P(i + 8);
        return ((float) a0Var.mo7366H()) / ((float) a0Var.mo7366H());
    }

    /* renamed from: q */
    private static byte[] m7701q(ParsableByteArray a0Var, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            a0Var.mo7374P(i3);
            int n = a0Var.mo7389n();
            if (a0Var.mo7389n() == 1886547818) {
                return Arrays.copyOfRange(a0Var.mo7379d(), i3, n + i3);
            }
            i3 += n;
        }
        return null;
    }

    /* renamed from: r */
    private static Pair<Integer, TrackEncryptionBox> m7702r(ParsableByteArray a0Var, int i, int i2) {
        int e = a0Var.mo7380e();
        while (e - i < i2) {
            a0Var.mo7374P(e);
            int n = a0Var.mo7389n();
            Assertions.m10155g(n > 0, "childAtomSize should be positive");
            if (a0Var.mo7389n() == 1936289382) {
                Pair<Integer, TrackEncryptionBox> f = m7690f(a0Var, e, n);
                if (f != null) {
                    return f;
                }
            }
            e += n;
        }
        return null;
    }

    /* renamed from: s */
    private static TrackEncryptionBox m7703s(ParsableByteArray a0Var, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            a0Var.mo7374P(i5);
            int n = a0Var.mo7389n();
            if (a0Var.mo7389n() == 1952804451) {
                int c = Atom.m7677c(a0Var.mo7389n());
                a0Var.mo7375Q(1);
                if (c == 0) {
                    a0Var.mo7375Q(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int D = a0Var.mo7362D();
                    i3 = D & 15;
                    i4 = (D & 240) >> 4;
                }
                boolean z = a0Var.mo7362D() == 1;
                int D2 = a0Var.mo7362D();
                byte[] bArr2 = new byte[16];
                a0Var.mo7385j(bArr2, 0, 16);
                if (z && D2 == 0) {
                    int D3 = a0Var.mo7362D();
                    bArr = new byte[D3];
                    a0Var.mo7385j(bArr, 0, D3);
                }
                TrackEncryptionBox pVar = new TrackEncryptionBox(z, str, D2, bArr2, i4, i3, bArr);
                return pVar;
            }
            i5 += n;
        }
    }

    /* renamed from: t */
    private static Metadata m7704t(ParsableByteArray a0Var, int i) {
        a0Var.mo7375Q(12);
        while (a0Var.mo7380e() < i) {
            int e = a0Var.mo7380e();
            int n = a0Var.mo7389n();
            if (a0Var.mo7389n() != 1935766900) {
                a0Var.mo7374P(e + n);
            } else if (n < 14) {
                return null;
            } else {
                a0Var.mo7375Q(5);
                int D = a0Var.mo7362D();
                if (D != 12 && D != 13) {
                    return null;
                }
                float f = D == 12 ? 240.0f : 120.0f;
                a0Var.mo7375Q(1);
                return new Metadata(new SmtaMetadataEntry(f, a0Var.mo7362D()));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x042a A[EDGE_INSN: B:214:0x042a->B:166:0x042a ?: BREAK  
EDGE_INSN: B:214:0x042a->B:166:0x042a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.p076f2.p083k0.TrackSampleTable m7705u(p067c.p068a.p069a.p070a.p076f2.p083k0.Track r38, p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0946a r39, p067c.p068a.p069a.p070a.p076f2.GaplessInfoHolder r40) throws p067c.p068a.p069a.p070a.ParserException {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            c.a.a.a.f2.k0.e$b r3 = r0.mo6263g(r3)
            if (r3 == 0) goto L_0x0017
            c.a.a.a.f2.k0.f$d r4 = new c.a.a.a.f2.k0.f$d
            c.a.a.a.u0 r5 = r1.f6471f
            r4.<init>(r3, r5)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            c.a.a.a.f2.k0.e$b r3 = r0.mo6263g(r3)
            if (r3 == 0) goto L_0x050b
            c.a.a.a.f2.k0.f$e r4 = new c.a.a.a.f2.k0.f$e
            r4.<init>(r3)
        L_0x0025:
            int r3 = r4.mo6266b()
            r5 = 0
            if (r3 != 0) goto L_0x0043
            c.a.a.a.f2.k0.r r9 = new c.a.a.a.f2.k0.r
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r0 = r9
            r1 = r38
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0043:
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            c.a.a.a.f2.k0.e$b r6 = r0.mo6263g(r6)
            r7 = 1
            if (r6 != 0) goto L_0x005c
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            c.a.a.a.f2.k0.e$b r6 = r0.mo6263g(r6)
            java.lang.Object r6 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r6)
            c.a.a.a.f2.k0.e$b r6 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0947b) r6
            r8 = 1
            goto L_0x005d
        L_0x005c:
            r8 = 0
        L_0x005d:
            c.a.a.a.m2.a0 r6 = r6.f6337b
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            c.a.a.a.f2.k0.e$b r9 = r0.mo6263g(r9)
            java.lang.Object r9 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r9)
            c.a.a.a.f2.k0.e$b r9 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0947b) r9
            c.a.a.a.m2.a0 r9 = r9.f6337b
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            c.a.a.a.f2.k0.e$b r10 = r0.mo6263g(r10)
            java.lang.Object r10 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r10)
            c.a.a.a.f2.k0.e$b r10 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0947b) r10
            c.a.a.a.m2.a0 r10 = r10.f6337b
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            c.a.a.a.f2.k0.e$b r11 = r0.mo6263g(r11)
            if (r11 == 0) goto L_0x0089
            c.a.a.a.m2.a0 r11 = r11.f6337b
            goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            c.a.a.a.f2.k0.e$b r0 = r0.mo6263g(r13)
            if (r0 == 0) goto L_0x0096
            c.a.a.a.m2.a0 r0 = r0.f6337b
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            c.a.a.a.f2.k0.f$a r13 = new c.a.a.a.f2.k0.f$a
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo7374P(r6)
            int r8 = r10.mo7366H()
            int r8 = r8 - r7
            int r9 = r10.mo7366H()
            int r14 = r10.mo7366H()
            if (r0 == 0) goto L_0x00b8
            r0.mo7374P(r6)
            int r15 = r0.mo7366H()
            goto L_0x00b9
        L_0x00b8:
            r15 = 0
        L_0x00b9:
            r12 = -1
            if (r11 == 0) goto L_0x00ce
            r11.mo7374P(r6)
            int r6 = r11.mo7366H()
            if (r6 <= 0) goto L_0x00cc
            int r16 = r11.mo7366H()
            int r16 = r16 + -1
            goto L_0x00d1
        L_0x00cc:
            r11 = 0
            goto L_0x00cf
        L_0x00ce:
            r6 = 0
        L_0x00cf:
            r16 = -1
        L_0x00d1:
            int r5 = r4.mo6265a()
            c.a.a.a.u0 r7 = r1.f6471f
            java.lang.String r7 = r7.f8814l
            if (r5 == r12) goto L_0x00fe
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x00f3
            java.lang.String r12 = "audio/g711-mlaw"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x00f3
            java.lang.String r12 = "audio/g711-alaw"
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L_0x00fe
        L_0x00f3:
            if (r8 != 0) goto L_0x00fe
            if (r15 != 0) goto L_0x00fe
            if (r6 != 0) goto L_0x00fe
            r39 = r8
            r12 = r9
            r7 = 1
            goto L_0x0102
        L_0x00fe:
            r39 = r8
            r12 = r9
            r7 = 0
        L_0x0102:
            if (r7 == 0) goto L_0x0136
            int r0 = r13.f6339a
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L_0x010a:
            boolean r6 = r13.mo6264a()
            if (r6 == 0) goto L_0x011b
            int r6 = r13.f6340b
            long r10 = r13.f6342d
            r4[r6] = r10
            int r7 = r13.f6341c
            r0[r6] = r7
            goto L_0x010a
        L_0x011b:
            long r6 = (long) r14
            c.a.a.a.f2.k0.h$b r0 = p067c.p068a.p069a.p070a.p076f2.p083k0.FixedSampleSizeRechunker.m7724a(r5, r4, r0, r6)
            long[] r4 = r0.f6367a
            int[] r5 = r0.f6368b
            int r6 = r0.f6369c
            long[] r7 = r0.f6370d
            int[] r10 = r0.f6371e
            long r11 = r0.f6372f
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r10
            r13 = r11
            r11 = r1
            goto L_0x029f
        L_0x0136:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r8 = new long[r3]
            int[] r9 = new int[r3]
            r24 = r10
            r2 = r16
            r1 = 0
            r10 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r16 = r15
            r15 = r14
            r14 = r12
        L_0x0152:
            java.lang.String r12 = "AtomParsers"
            if (r1 >= r3) goto L_0x0219
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x015c:
            if (r27 != 0) goto L_0x0179
            boolean r22 = r13.mo6264a()
            if (r22 == 0) goto L_0x0179
            r30 = r14
            r31 = r15
            long r14 = r13.f6342d
            r32 = r3
            int r3 = r13.f6341c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x015c
        L_0x0179:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x019d
            java.lang.String r2 = "Unexpected end of chunk data"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r12, r2)
            long[] r5 = java.util.Arrays.copyOf(r5, r1)
            int[] r7 = java.util.Arrays.copyOf(r7, r1)
            long[] r8 = java.util.Arrays.copyOf(r8, r1)
            int[] r9 = java.util.Arrays.copyOf(r9, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x0221
        L_0x019d:
            if (r0 == 0) goto L_0x01b0
        L_0x019f:
            if (r23 != 0) goto L_0x01ae
            if (r16 <= 0) goto L_0x01ae
            int r23 = r0.mo7366H()
            int r21 = r0.mo7389n()
            int r16 = r16 + -1
            goto L_0x019f
        L_0x01ae:
            int r23 = r23 + -1
        L_0x01b0:
            r3 = r21
            r5[r1] = r28
            int r12 = r4.mo6267c()
            r7[r1] = r12
            r12 = r7[r1]
            if (r12 <= r10) goto L_0x01c0
            r10 = r7[r1]
        L_0x01c0:
            long r14 = (long) r3
            long r14 = r25 + r14
            r8[r1] = r14
            if (r11 != 0) goto L_0x01c9
            r12 = 1
            goto L_0x01ca
        L_0x01c9:
            r12 = 0
        L_0x01ca:
            r9[r1] = r12
            if (r1 != r2) goto L_0x01e0
            r12 = 1
            r9[r1] = r12
            int r6 = r6 + -1
            if (r6 <= 0) goto L_0x01e0
            java.lang.Object r2 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r11)
            c.a.a.a.m2.a0 r2 = (p067c.p068a.p069a.p070a.p111m2.ParsableByteArray) r2
            int r2 = r2.mo7366H()
            int r2 = r2 - r12
        L_0x01e0:
            r15 = r2
            r12 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01f8
            if (r39 <= 0) goto L_0x01f8
            int r2 = r24.mo7366H()
            int r3 = r24.mo7389n()
            int r14 = r39 + -1
            goto L_0x01fb
        L_0x01f8:
            r3 = r14
            r14 = r39
        L_0x01fb:
            r39 = r2
            r2 = r7[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r12
            r37 = r14
            r14 = r39
            r39 = r37
            goto L_0x0152
        L_0x0219:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x0221:
            long r13 = (long) r2
            long r13 = r25 + r13
            if (r0 == 0) goto L_0x0236
        L_0x0226:
            if (r16 <= 0) goto L_0x0236
            int r2 = r0.mo7366H()
            if (r2 == 0) goto L_0x0230
            r0 = 0
            goto L_0x0237
        L_0x0230:
            r0.mo7389n()
            int r16 = r16 + -1
            goto L_0x0226
        L_0x0236:
            r0 = 1
        L_0x0237:
            if (r6 != 0) goto L_0x0249
            if (r30 != 0) goto L_0x0249
            if (r1 != 0) goto L_0x0249
            if (r39 != 0) goto L_0x0249
            r2 = r23
            if (r2 != 0) goto L_0x024b
            if (r0 != 0) goto L_0x0246
            goto L_0x024b
        L_0x0246:
            r11 = r38
            goto L_0x0299
        L_0x0249:
            r2 = r23
        L_0x024b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "Inconsistent stbl box for track "
            r4.append(r11)
            r11 = r38
            int r15 = r11.f6466a
            r4.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r4.append(r15)
            r4.append(r6)
            java.lang.String r6 = ", remainingSamplesAtTimestampDelta "
            r4.append(r6)
            r6 = r30
            r4.append(r6)
            java.lang.String r6 = ", remainingSamplesInChunk "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r4.append(r1)
            r1 = r39
            r4.append(r1)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r4.append(r1)
            r4.append(r2)
            if (r0 != 0) goto L_0x028d
            java.lang.String r0 = ", ctts invalid"
            goto L_0x028f
        L_0x028d:
            java.lang.String r0 = ""
        L_0x028f:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r12, r0)
        L_0x0299:
            r0 = r3
            r2 = r5
            r3 = r7
            r5 = r8
            r6 = r9
            r4 = r10
        L_0x029f:
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r11.f6468c
            r21 = r13
            r25 = r7
            long r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r21, r23, r25)
            long[] r1 = r11.f6473h
            r9 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02c1
            long r0 = r11.f6468c
            p067c.p068a.p069a.p070a.p111m2.Util.m10242C0(r5, r9, r0)
            c.a.a.a.f2.k0.r r9 = new c.a.a.a.f2.k0.r
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02c1:
            int r1 = r1.length
            r7 = 1
            if (r1 != r7) goto L_0x035b
            int r1 = r11.f6467b
            if (r1 != r7) goto L_0x035b
            int r1 = r5.length
            r7 = 2
            if (r1 < r7) goto L_0x035b
            long[] r1 = r11.f6474i
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)
            long[] r1 = (long[]) r1
            r7 = 0
            r15 = r1[r7]
            long[] r1 = r11.f6473h
            r21 = r1[r7]
            long r7 = r11.f6468c
            long r9 = r11.f6469d
            r23 = r7
            r25 = r9
            long r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r21, r23, r25)
            long r7 = r7 + r15
            r21 = r5
            r22 = r13
            r24 = r15
            r26 = r7
            boolean r1 = m7685a(r21, r22, r24, r26)
            if (r1 == 0) goto L_0x035b
            long r21 = r13 - r7
            r1 = 0
            r7 = r5[r1]
            long r30 = r15 - r7
            c.a.a.a.u0 r1 = r11.f6471f
            int r1 = r1.f8828z
            long r7 = (long) r1
            long r9 = r11.f6468c
            r32 = r7
            r34 = r9
            long r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r30, r32, r34)
            c.a.a.a.u0 r1 = r11.f6471f
            int r1 = r1.f8828z
            long r9 = (long) r1
            r12 = r0
            long r0 = r11.f6468c
            r23 = r9
            r25 = r0
            long r0 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r21, r23, r25)
            r9 = 0
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x0327
            int r15 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x035c
        L_0x0327:
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 > 0) goto L_0x035c
            int r15 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r15 > 0) goto L_0x035c
            int r8 = (int) r7
            r7 = r40
            r7.f7008b = r8
            int r1 = (int) r0
            r7.f7009c = r1
            long r0 = r11.f6468c
            r7 = 1000000(0xf4240, double:4.940656E-318)
            p067c.p068a.p069a.p070a.p111m2.Util.m10242C0(r5, r7, r0)
            long[] r0 = r11.f6473h
            r1 = 0
            r12 = r0[r1]
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r11.f6469d
            r16 = r0
            long r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r12, r14, r16)
            c.a.a.a.f2.k0.r r9 = new c.a.a.a.f2.k0.r
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x035b:
            r12 = r0
        L_0x035c:
            long[] r0 = r11.f6473h
            int r1 = r0.length
            r7 = 1
            if (r1 != r7) goto L_0x03a3
            r1 = 0
            r7 = r0[r1]
            r9 = 0
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x03a3
            long[] r0 = r11.f6474i
            java.lang.Object r0 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r0)
            long[] r0 = (long[]) r0
            r7 = r0[r1]
            r0 = 0
        L_0x0376:
            int r1 = r5.length
            if (r0 >= r1) goto L_0x038d
            r9 = r5[r0]
            long r15 = r9 - r7
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r11.f6468c
            r19 = r9
            long r9 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r15, r17, r19)
            r5[r0] = r9
            int r0 = r0 + 1
            goto L_0x0376
        L_0x038d:
            long r15 = r13 - r7
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r11.f6468c
            r19 = r0
            long r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r15, r17, r19)
            c.a.a.a.f2.k0.r r9 = new c.a.a.a.f2.k0.r
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03a3:
            int r1 = r11.f6467b
            r7 = 1
            if (r1 != r7) goto L_0x03aa
            r1 = 1
            goto L_0x03ab
        L_0x03aa:
            r1 = 0
        L_0x03ab:
            int r7 = r0.length
            int[] r7 = new int[r7]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r8 = r11.f6474i
            java.lang.Object r8 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r8)
            long[] r8 = (long[]) r8
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
        L_0x03bd:
            long[] r15 = r11.f6473h
            r39 = r4
            int r4 = r15.length
            if (r9 >= r4) goto L_0x042a
            r16 = r3
            r3 = r8[r9]
            r21 = -1
            int r23 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r23 == 0) goto L_0x0419
            r24 = r15[r9]
            r21 = r14
            long r14 = r11.f6468c
            r22 = r12
            r40 = r13
            long r12 = r11.f6469d
            r26 = r14
            r28 = r12
            long r12 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r24, r26, r28)
            r14 = 1
            int r15 = p067c.p068a.p069a.p070a.p111m2.Util.m10291h(r5, r3, r14, r14)
            r7[r9] = r15
            long r3 = r3 + r12
            r12 = 0
            int r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10283d(r5, r3, r1, r12)
            r0[r9] = r3
        L_0x03f1:
            r3 = r7[r9]
            r4 = r0[r9]
            if (r3 >= r4) goto L_0x0404
            r3 = r7[r9]
            r3 = r6[r3]
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0404
            r3 = r7[r9]
            int r3 = r3 + r14
            r7[r9] = r3
            goto L_0x03f1
        L_0x0404:
            r3 = r0[r9]
            r4 = r7[r9]
            int r3 = r3 - r4
            int r13 = r40 + r3
            r3 = r7[r9]
            r4 = r21
            if (r4 == r3) goto L_0x0413
            r3 = 1
            goto L_0x0414
        L_0x0413:
            r3 = 0
        L_0x0414:
            r3 = r3 | r10
            r4 = r0[r9]
            r10 = r3
            goto L_0x0420
        L_0x0419:
            r22 = r12
            r40 = r13
            r4 = r14
            r12 = 0
            r14 = 1
        L_0x0420:
            int r9 = r9 + 1
            r14 = r4
            r3 = r16
            r12 = r22
            r4 = r39
            goto L_0x03bd
        L_0x042a:
            r16 = r3
            r3 = r12
            r12 = 0
            r14 = 1
            if (r13 == r3) goto L_0x0432
            goto L_0x0433
        L_0x0432:
            r14 = 0
        L_0x0433:
            r1 = r10 | r14
            if (r1 == 0) goto L_0x043a
            long[] r3 = new long[r13]
            goto L_0x043b
        L_0x043a:
            r3 = r2
        L_0x043b:
            if (r1 == 0) goto L_0x0440
            int[] r4 = new int[r13]
            goto L_0x0442
        L_0x0440:
            r4 = r16
        L_0x0442:
            if (r1 == 0) goto L_0x0446
            r8 = 0
            goto L_0x0448
        L_0x0446:
            r8 = r39
        L_0x0448:
            if (r1 == 0) goto L_0x044d
            int[] r9 = new int[r13]
            goto L_0x044e
        L_0x044d:
            r9 = r6
        L_0x044e:
            long[] r10 = new long[r13]
            r39 = r8
            r13 = 0
            r14 = 0
        L_0x0455:
            long[] r8 = r11.f6473h
            int r8 = r8.length
            if (r12 >= r8) goto L_0x04e8
            long[] r8 = r11.f6474i
            r17 = r8[r12]
            r8 = r7[r12]
            r27 = r7
            r7 = r0[r12]
            r28 = r0
            if (r1 == 0) goto L_0x0478
            int r0 = r7 - r8
            java.lang.System.arraycopy(r2, r8, r3, r13, r0)
            r29 = r2
            r2 = r16
            java.lang.System.arraycopy(r2, r8, r4, r13, r0)
            java.lang.System.arraycopy(r6, r8, r9, r13, r0)
            goto L_0x047c
        L_0x0478:
            r29 = r2
            r2 = r16
        L_0x047c:
            r0 = r39
        L_0x047e:
            if (r8 >= r7) goto L_0x04c6
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r6
            r40 = r7
            long r6 = r11.f6469d
            r21 = r14
            r25 = r6
            long r6 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r21, r23, r25)
            r21 = r5[r8]
            r23 = r14
            long r14 = r21 - r17
            r21 = r2
            r30 = r3
            r2 = 0
            long r31 = java.lang.Math.max(r2, r14)
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r11.f6468c
            r35 = r14
            long r14 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r31, r33, r35)
            long r6 = r6 + r14
            r10[r13] = r6
            if (r1 == 0) goto L_0x04b7
            r6 = r4[r13]
            if (r6 <= r0) goto L_0x04b7
            r0 = r21[r8]
        L_0x04b7:
            int r13 = r13 + 1
            int r8 = r8 + 1
            r7 = r40
            r6 = r16
            r2 = r21
            r14 = r23
            r3 = r30
            goto L_0x047e
        L_0x04c6:
            r21 = r2
            r30 = r3
            r16 = r6
            r23 = r14
            r2 = 0
            long[] r6 = r11.f6473h
            r7 = r6[r12]
            long r14 = r23 + r7
            int r12 = r12 + 1
            r39 = r0
            r6 = r16
            r16 = r21
            r7 = r27
            r0 = r28
            r2 = r29
            r3 = r30
            goto L_0x0455
        L_0x04e8:
            r30 = r3
            r23 = r14
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r11.f6469d
            r21 = r23
            r23 = r0
            r25 = r2
            long r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r21, r23, r25)
            c.a.a.a.f2.k0.r r12 = new c.a.a.a.f2.k0.r
            r0 = r12
            r1 = r38
            r2 = r30
            r3 = r4
            r4 = r39
            r5 = r10
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
        L_0x050b:
            c.a.a.a.g1 r0 = new c.a.a.a.g1
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            goto L_0x0514
        L_0x0513:
            throw r0
        L_0x0514:
            goto L_0x0513
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p083k0.AtomParsers.m7705u(c.a.a.a.f2.k0.o, c.a.a.a.f2.k0.e$a, c.a.a.a.f2.u):c.a.a.a.f2.k0.r");
    }

    /* renamed from: v */
    private static C0950c m7706v(ParsableByteArray a0Var, int i, int i2, String str, DrmInitData tVar, boolean z) throws ParserException {
        int i3;
        ParsableByteArray a0Var2 = a0Var;
        int i4 = i;
        a0Var2.mo7374P(12);
        int n = a0Var.mo7389n();
        C0950c cVar = new C0950c(n);
        for (int i5 = 0; i5 < n; i5++) {
            int e = a0Var.mo7380e();
            int n2 = a0Var.mo7389n();
            Assertions.m10155g(n2 > 0, "childAtomSize should be positive");
            int n3 = a0Var.mo7389n();
            if (n3 == 1635148593 || n3 == 1635148595 || n3 == 1701733238 || n3 == 1831958048 || n3 == 1836070006 || n3 == 1752589105 || n3 == 1751479857 || n3 == 1932670515 || n3 == 1987063864 || n3 == 1987063865 || n3 == 1635135537 || n3 == 1685479798 || n3 == 1685479729 || n3 == 1685481573 || n3 == 1685481521) {
                i3 = e;
                m7684C(a0Var, n3, i3, n2, i, i2, tVar, cVar, i5);
            } else if (n3 == 1836069985 || n3 == 1701733217 || n3 == 1633889587 || n3 == 1700998451 || n3 == 1633889588 || n3 == 1685353315 || n3 == 1685353317 || n3 == 1685353320 || n3 == 1685353324 || n3 == 1935764850 || n3 == 1935767394 || n3 == 1819304813 || n3 == 1936684916 || n3 == 1953984371 || n3 == 778924082 || n3 == 778924083 || n3 == 1634492771 || n3 == 1634492791 || n3 == 1970037111 || n3 == 1332770163 || n3 == 1716281667) {
                i3 = e;
                m7689e(a0Var, n3, e, n2, i, str, z, tVar, cVar, i5);
            } else {
                if (n3 == 1414810956 || n3 == 1954034535 || n3 == 2004251764 || n3 == 1937010800 || n3 == 1664495672) {
                    m7707w(a0Var, n3, e, n2, i, str, cVar);
                } else if (n3 == 1835365492) {
                    m7698n(a0Var2, n3, e, i4, cVar);
                } else if (n3 == 1667329389) {
                    cVar.f6349b = new C1245b().mo7692R(i4).mo7705e0("application/x-camera-motion").mo7679E();
                }
                i3 = e;
            }
            a0Var2.mo7374P(i3 + n2);
        }
        return cVar;
    }

    /* renamed from: w */
    private static void m7707w(ParsableByteArray a0Var, int i, int i2, int i3, int i4, String str, C0950c cVar) {
        a0Var.mo7374P(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        ImmutableList rVar = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                a0Var.mo7385j(bArr, 0, i5);
                rVar = ImmutableList.m11918q(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                cVar.f6351d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f6349b = new C1245b().mo7692R(i4).mo7705e0(str2).mo7696V(str).mo7709i0(j).mo7694T(rVar).mo7679E();
    }

    /* renamed from: x */
    private static C0953f m7708x(ParsableByteArray a0Var) {
        boolean z;
        int i = 8;
        a0Var.mo7374P(8);
        int c = Atom.m7677c(a0Var.mo7389n());
        a0Var.mo7375Q(c == 0 ? 8 : 16);
        int n = a0Var.mo7389n();
        a0Var.mo7375Q(4);
        int e = a0Var.mo7380e();
        if (c == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (a0Var.mo7379d()[e + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            a0Var.mo7375Q(i);
        } else {
            long F = c == 0 ? a0Var.mo7364F() : a0Var.mo7367I();
            if (F != 0) {
                j = F;
            }
        }
        a0Var.mo7375Q(16);
        int n2 = a0Var.mo7389n();
        int n3 = a0Var.mo7389n();
        a0Var.mo7375Q(4);
        int n4 = a0Var.mo7389n();
        int n5 = a0Var.mo7389n();
        if (n2 == 0 && n3 == 65536 && n4 == -65536 && n5 == 0) {
            i2 = 90;
        } else if (n2 == 0 && n3 == -65536 && n4 == 65536 && n5 == 0) {
            i2 = 270;
        } else if (n2 == -65536 && n3 == 0 && n4 == 0 && n5 == -65536) {
            i2 = 180;
        }
        return new C0953f(n, j, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00df  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.p076f2.p083k0.Track m7709y(p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0946a r18, p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0947b r19, long r20, p067c.p068a.p069a.p070a.p075e2.DrmInitData r22, boolean r23, boolean r24) throws p067c.p068a.p069a.p070a.ParserException {
        /*
            r0 = r18
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            c.a.a.a.f2.k0.e$a r1 = r0.mo6262f(r1)
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)
            c.a.a.a.f2.k0.e$a r1 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0946a) r1
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            c.a.a.a.f2.k0.e$b r2 = r1.mo6263g(r2)
            java.lang.Object r2 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r2)
            c.a.a.a.f2.k0.e$b r2 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0947b) r2
            c.a.a.a.m2.a0 r2 = r2.f6337b
            int r2 = m7694j(r2)
            int r5 = m7687c(r2)
            r2 = 0
            r3 = -1
            if (r5 != r3) goto L_0x002b
            return r2
        L_0x002b:
            r3 = 1953196132(0x746b6864, float:7.46037E31)
            c.a.a.a.f2.k0.e$b r3 = r0.mo6263g(r3)
            java.lang.Object r3 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r3)
            c.a.a.a.f2.k0.e$b r3 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0947b) r3
            c.a.a.a.m2.a0 r3 = r3.f6337b
            c.a.a.a.f2.k0.f$f r3 = m7708x(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x004f
            long r8 = r3.f6361b
            r4 = r19
            r10 = r8
            goto L_0x0053
        L_0x004f:
            r4 = r19
            r10 = r20
        L_0x0053:
            c.a.a.a.m2.a0 r4 = r4.f6337b
            long r8 = m7699o(r4)
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r8
            long r6 = p067c.p068a.p069a.p070a.p111m2.Util.m10240B0(r10, r12, r14)
        L_0x0066:
            r10 = r6
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            c.a.a.a.f2.k0.e$a r4 = r1.mo6262f(r4)
            java.lang.Object r4 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r4)
            c.a.a.a.f2.k0.e$a r4 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0946a) r4
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            c.a.a.a.f2.k0.e$a r4 = r4.mo6262f(r6)
            java.lang.Object r4 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r4)
            c.a.a.a.f2.k0.e$a r4 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0946a) r4
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            c.a.a.a.f2.k0.e$b r1 = r1.mo6263g(r6)
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)
            c.a.a.a.f2.k0.e$b r1 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0947b) r1
            c.a.a.a.m2.a0 r1 = r1.f6337b
            android.util.Pair r1 = m7696l(r1)
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            c.a.a.a.f2.k0.e$b r4 = r4.mo6263g(r6)
            java.lang.Object r4 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r4)
            c.a.a.a.f2.k0.e$b r4 = (p067c.p068a.p069a.p070a.p076f2.p083k0.Atom.C0947b) r4
            c.a.a.a.m2.a0 r12 = r4.f6337b
            int r13 = r3.f6360a
            int r14 = r3.f6362c
            java.lang.Object r4 = r1.second
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r16 = r22
            r17 = r24
            c.a.a.a.f2.k0.f$c r4 = m7706v(r12, r13, r14, r15, r16, r17)
            if (r23 != 0) goto L_0x00d6
            r6 = 1701082227(0x65647473, float:6.742798E22)
            c.a.a.a.f2.k0.e$a r0 = r0.mo6262f(r6)
            if (r0 == 0) goto L_0x00d6
            android.util.Pair r0 = m7691g(r0)
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r6 = r0.first
            long[] r6 = (long[]) r6
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r17 = r0
            r16 = r6
            goto L_0x00da
        L_0x00d6:
            r16 = r2
            r17 = r16
        L_0x00da:
            c.a.a.a.u0 r0 = r4.f6349b
            if (r0 != 0) goto L_0x00df
            goto L_0x00fa
        L_0x00df:
            c.a.a.a.f2.k0.o r2 = new c.a.a.a.f2.k0.o
            int r0 = r3.f6360a
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            c.a.a.a.u0 r12 = r4.f6349b
            int r13 = r4.f6351d
            c.a.a.a.f2.k0.p[] r14 = r4.f6348a
            int r15 = r4.f6350c
            r3 = r2
            r4 = r0
            r3.<init>(r4, r5, r6, r8, r10, r12, r13, r14, r15, r16, r17)
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p083k0.AtomParsers.m7709y(c.a.a.a.f2.k0.e$a, c.a.a.a.f2.k0.e$b, long, c.a.a.a.e2.t, boolean, boolean):c.a.a.a.f2.k0.o");
    }

    /* renamed from: z */
    public static List<TrackSampleTable> m7710z(C0946a aVar, GaplessInfoHolder uVar, long j, DrmInitData tVar, boolean z, boolean z2, C1319e<Track, Track> eVar) throws ParserException {
        C0946a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar2.f6336d.size(); i++) {
            C0946a aVar3 = (C0946a) aVar2.f6336d.get(i);
            if (aVar3.f6333a != 1953653099) {
                GaplessInfoHolder uVar2 = uVar;
                C1319e<Track, Track> eVar2 = eVar;
            } else {
                Track oVar = (Track) eVar.apply(m7709y(aVar3, (C0947b) Assertions.m10153e(aVar.mo6263g(1836476516)), j, tVar, z, z2));
                if (oVar == null) {
                    GaplessInfoHolder uVar3 = uVar;
                } else {
                    GaplessInfoHolder uVar4 = uVar;
                    arrayList.add(m7705u(oVar, (C0946a) Assertions.m10153e(((C0946a) Assertions.m10153e(((C0946a) Assertions.m10153e(aVar3.mo6262f(1835297121))).mo6262f(1835626086))).mo6262f(1937007212)), uVar));
                }
            }
        }
        return arrayList;
    }
}
