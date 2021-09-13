package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.util.Arrays;
import java.util.Collections;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.q */
public final class H263Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private static final float[] f6781a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: b */
    private final UserDataReader f6782b;

    /* renamed from: c */
    private final ParsableByteArray f6783c;

    /* renamed from: d */
    private final boolean[] f6784d = new boolean[4];

    /* renamed from: e */
    private final C0985a f6785e = new C0985a(128);

    /* renamed from: f */
    private final NalUnitTargetBuffer f6786f;

    /* renamed from: g */
    private C0986b f6787g;

    /* renamed from: h */
    private long f6788h;

    /* renamed from: i */
    private String f6789i;

    /* renamed from: j */
    private C0916b0 f6790j;

    /* renamed from: k */
    private boolean f6791k;

    /* renamed from: l */
    private long f6792l;

    /* renamed from: c.a.a.a.f2.m0.q$a */
    /* compiled from: H263Reader */
    private static final class C0985a {

        /* renamed from: a */
        private static final byte[] f6793a = {0, 0, 1};

        /* renamed from: b */
        private boolean f6794b;

        /* renamed from: c */
        private int f6795c;

        /* renamed from: d */
        public int f6796d;

        /* renamed from: e */
        public int f6797e;

        /* renamed from: f */
        public byte[] f6798f;

        public C0985a(int i) {
            this.f6798f = new byte[i];
        }

        /* renamed from: a */
        public void mo6351a(byte[] bArr, int i, int i2) {
            if (this.f6794b) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f6798f;
                int length = bArr2.length;
                int i4 = this.f6796d;
                if (length < i4 + i3) {
                    this.f6798f = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f6798f, this.f6796d, i3);
                this.f6796d += i3;
            }
        }

        /* renamed from: b */
        public boolean mo6352b(int i, int i2) {
            int i3 = this.f6795c;
            if (i3 != 0) {
                String str = "Unexpected start code value";
                String str2 = "H263Reader";
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            } else if (i == 179 || i == 181) {
                                this.f6796d -= i2;
                                this.f6794b = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            Log.m10386h(str2, str);
                            mo6353c();
                        } else {
                            this.f6797e = this.f6796d;
                            this.f6795c = 4;
                        }
                    } else if (i > 31) {
                        Log.m10386h(str2, str);
                        mo6353c();
                    } else {
                        this.f6795c = 3;
                    }
                } else if (i != 181) {
                    Log.m10386h(str2, str);
                    mo6353c();
                } else {
                    this.f6795c = 2;
                }
            } else if (i == 176) {
                this.f6795c = 1;
                this.f6794b = true;
            }
            byte[] bArr = f6793a;
            mo6351a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void mo6353c() {
            this.f6794b = false;
            this.f6796d = 0;
            this.f6795c = 0;
        }
    }

    /* renamed from: c.a.a.a.f2.m0.q$b */
    /* compiled from: H263Reader */
    private static final class C0986b {

        /* renamed from: a */
        private final C0916b0 f6799a;

        /* renamed from: b */
        private boolean f6800b;

        /* renamed from: c */
        private boolean f6801c;

        /* renamed from: d */
        private boolean f6802d;

        /* renamed from: e */
        private int f6803e;

        /* renamed from: f */
        private int f6804f;

        /* renamed from: g */
        private long f6805g;

        /* renamed from: h */
        private long f6806h;

        public C0986b(C0916b0 b0Var) {
            this.f6799a = b0Var;
        }

        /* renamed from: a */
        public void mo6354a(byte[] bArr, int i, int i2) {
            if (this.f6801c) {
                int i3 = i + 1;
                int i4 = this.f6804f;
                int i5 = i3 - i4;
                if (i5 < i2) {
                    this.f6802d = ((bArr[i5] & 192) >> 6) == 0;
                    this.f6801c = false;
                    return;
                }
                this.f6804f = i4 + (i2 - i);
            }
        }

        /* renamed from: b */
        public void mo6355b(long j, int i, boolean z) {
            if (this.f6803e == 182 && z && this.f6800b) {
                int i2 = i;
                this.f6799a.mo6176c(this.f6806h, this.f6802d ? 1 : 0, (int) (j - this.f6805g), i2, null);
            }
            if (this.f6803e != 179) {
                this.f6805g = j;
            }
        }

        /* renamed from: c */
        public void mo6356c(int i, long j) {
            this.f6803e = i;
            this.f6802d = false;
            boolean z = true;
            this.f6800b = i == 182 || i == 179;
            if (i != 182) {
                z = false;
            }
            this.f6801c = z;
            this.f6804f = 0;
            this.f6806h = j;
        }

        /* renamed from: d */
        public void mo6357d() {
            this.f6800b = false;
            this.f6801c = false;
            this.f6802d = false;
            this.f6803e = -1;
        }
    }

    H263Reader(UserDataReader k0Var) {
        this.f6782b = k0Var;
        if (k0Var != null) {
            this.f6786f = new NalUnitTargetBuffer(178, 128);
            this.f6783c = new ParsableByteArray();
            return;
        }
        this.f6786f = null;
        this.f6783c = null;
    }

    /* renamed from: b */
    private static Format m8133b(C0985a aVar, int i, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f6798f, aVar.f6796d);
        ParsableBitArray zVar = new ParsableBitArray(copyOf);
        zVar.mo7506s(i);
        zVar.mo7506s(4);
        zVar.mo7504q();
        zVar.mo7505r(8);
        if (zVar.mo7494g()) {
            zVar.mo7505r(4);
            zVar.mo7505r(3);
        }
        int h = zVar.mo7495h(4);
        float f = 1.0f;
        String str2 = "Invalid aspect ratio";
        String str3 = "H263Reader";
        if (h == 15) {
            int h2 = zVar.mo7495h(8);
            int h3 = zVar.mo7495h(8);
            if (h3 == 0) {
                Log.m10386h(str3, str2);
            } else {
                f = ((float) h2) / ((float) h3);
            }
        } else {
            float[] fArr = f6781a;
            if (h < fArr.length) {
                f = fArr[h];
            } else {
                Log.m10386h(str3, str2);
            }
        }
        if (zVar.mo7494g()) {
            zVar.mo7505r(2);
            zVar.mo7505r(1);
            if (zVar.mo7494g()) {
                zVar.mo7505r(15);
                zVar.mo7504q();
                zVar.mo7505r(15);
                zVar.mo7504q();
                zVar.mo7505r(15);
                zVar.mo7504q();
                zVar.mo7505r(3);
                zVar.mo7505r(11);
                zVar.mo7504q();
                zVar.mo7505r(15);
                zVar.mo7504q();
            }
        }
        if (zVar.mo7495h(2) != 0) {
            Log.m10386h(str3, "Unhandled video object layer shape");
        }
        zVar.mo7504q();
        int h4 = zVar.mo7495h(16);
        zVar.mo7504q();
        if (zVar.mo7494g()) {
            if (h4 == 0) {
                Log.m10386h(str3, "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                zVar.mo7505r(i2);
            }
        }
        zVar.mo7504q();
        int h5 = zVar.mo7495h(13);
        zVar.mo7504q();
        int h6 = zVar.mo7495h(13);
        zVar.mo7504q();
        zVar.mo7504q();
        return new C1245b().mo7693S(str).mo7705e0("video/mp4v-es").mo7710j0(h5).mo7691Q(h6).mo7701a0(f).mo7694T(Collections.singletonList(copyOf)).mo7679E();
    }

    /* renamed from: a */
    public void mo6331a() {
        NalUnitUtil.m10418a(this.f6784d);
        this.f6785e.mo6353c();
        C0986b bVar = this.f6787g;
        if (bVar != null) {
            bVar.mo6357d();
        }
        NalUnitTargetBuffer wVar = this.f6786f;
        if (wVar != null) {
            wVar.mo6376d();
        }
        this.f6788h = 0;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        Assertions.m10156h(this.f6787g);
        Assertions.m10156h(this.f6790j);
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        byte[] d = a0Var.mo7379d();
        this.f6788h += (long) a0Var.mo7376a();
        this.f6790j.mo6174a(a0Var, a0Var.mo7376a());
        while (true) {
            int c = NalUnitUtil.m10420c(d, e, f, this.f6784d);
            if (c == f) {
                break;
            }
            int i = c + 3;
            byte b = a0Var.mo7379d()[i] & 255;
            int i2 = c - e;
            int i3 = 0;
            if (!this.f6791k) {
                if (i2 > 0) {
                    this.f6785e.mo6351a(d, e, c);
                }
                if (this.f6785e.mo6352b(b, i2 < 0 ? -i2 : 0)) {
                    C0916b0 b0Var = this.f6790j;
                    C0985a aVar = this.f6785e;
                    b0Var.mo6177d(m8133b(aVar, aVar.f6797e, (String) Assertions.m10153e(this.f6789i)));
                    this.f6791k = true;
                }
            }
            this.f6787g.mo6354a(d, e, c);
            NalUnitTargetBuffer wVar = this.f6786f;
            if (wVar != null) {
                if (i2 > 0) {
                    wVar.mo6373a(d, e, c);
                } else {
                    i3 = -i2;
                }
                if (this.f6786f.mo6374b(i3)) {
                    NalUnitTargetBuffer wVar2 = this.f6786f;
                    ((ParsableByteArray) Util.m10293i(this.f6783c)).mo7372N(this.f6786f.f6925d, NalUnitUtil.m10428k(wVar2.f6925d, wVar2.f6926e));
                    ((UserDataReader) Util.m10293i(this.f6782b)).mo6346a(this.f6792l, this.f6783c);
                }
                if (b == 178 && a0Var.mo7379d()[c + 2] == 1) {
                    this.f6786f.mo6377e(b);
                }
            }
            int i4 = f - c;
            this.f6787g.mo6355b(this.f6788h - ((long) i4), i4, this.f6791k);
            this.f6787g.mo6356c(b, this.f6792l);
            e = i;
        }
        if (!this.f6791k) {
            this.f6785e.mo6351a(d, e, f);
        }
        this.f6787g.mo6354a(d, e, f);
        NalUnitTargetBuffer wVar3 = this.f6786f;
        if (wVar3 != null) {
            wVar3.mo6373a(d, e, f);
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6792l = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6789i = dVar.mo6343b();
        C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 2);
        this.f6790j = q;
        this.f6787g = new C0986b(q);
        UserDataReader k0Var = this.f6782b;
        if (k0Var != null) {
            k0Var.mo6347b(lVar, dVar);
        }
    }
}
