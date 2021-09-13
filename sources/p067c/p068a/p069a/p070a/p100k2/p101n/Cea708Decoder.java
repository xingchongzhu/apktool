package p067c.p068a.p069a.p070a.p100k2.p101n;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException;
import p067c.p068a.p069a.p070a.p100k2.SubtitleInputBuffer;
import p067c.p068a.p069a.p070a.p100k2.SubtitleOutputBuffer;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.CodecSpecificDataUtil;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.k2.n.d */
public final class Cea708Decoder extends CeaDecoder {

    /* renamed from: g */
    private final ParsableByteArray f7800g = new ParsableByteArray();

    /* renamed from: h */
    private final ParsableBitArray f7801h = new ParsableBitArray();

    /* renamed from: i */
    private int f7802i = -1;

    /* renamed from: j */
    private final boolean f7803j;

    /* renamed from: k */
    private final int f7804k;

    /* renamed from: l */
    private final C1126b[] f7805l;

    /* renamed from: m */
    private C1126b f7806m;

    /* renamed from: n */
    private List<Cue> f7807n;

    /* renamed from: o */
    private List<Cue> f7808o;

    /* renamed from: p */
    private C1127c f7809p;

    /* renamed from: q */
    private int f7810q;

    /* renamed from: c.a.a.a.k2.n.d$a */
    /* compiled from: Cea708Decoder */
    private static final class C1125a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Comparator<C1125a> f7811a = C1121a.f7761a;

        /* renamed from: b */
        public final Cue f7812b;

        /* renamed from: c */
        public final int f7813c;

        public C1125a(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C1119b m = new C1119b().mo7049n(charSequence).mo7050o(alignment).mo7043h(f, i).mo7044i(i2).mo7045j(f2).mo7046k(i3).mo7048m(f3);
            if (z) {
                m.mo7053r(i4);
            }
            this.f7812b = m.mo7036a();
            this.f7813c = i5;
        }
    }

    /* renamed from: c.a.a.a.k2.n.d$b */
    /* compiled from: Cea708Decoder */
    private static final class C1126b {

        /* renamed from: a */
        public static final int f7814a = m9524h(2, 2, 2, 0);

        /* renamed from: b */
        public static final int f7815b;

        /* renamed from: c */
        public static final int f7816c;

        /* renamed from: d */
        private static final int[] f7817d = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: e */
        private static final int[] f7818e = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: f */
        private static final int[] f7819f = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: g */
        private static final boolean[] f7820g = {false, false, false, true, true, true, false};

        /* renamed from: h */
        private static final int[] f7821h;

        /* renamed from: i */
        private static final int[] f7822i = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: j */
        private static final int[] f7823j = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: k */
        private static final int[] f7824k;

        /* renamed from: A */
        private int f7825A;

        /* renamed from: B */
        private int f7826B;

        /* renamed from: C */
        private int f7827C;

        /* renamed from: D */
        private int f7828D;

        /* renamed from: E */
        private int f7829E;

        /* renamed from: F */
        private int f7830F;

        /* renamed from: G */
        private int f7831G;

        /* renamed from: l */
        private final List<SpannableString> f7832l = new ArrayList();

        /* renamed from: m */
        private final SpannableStringBuilder f7833m = new SpannableStringBuilder();

        /* renamed from: n */
        private boolean f7834n;

        /* renamed from: o */
        private boolean f7835o;

        /* renamed from: p */
        private int f7836p;

        /* renamed from: q */
        private boolean f7837q;

        /* renamed from: r */
        private int f7838r;

        /* renamed from: s */
        private int f7839s;

        /* renamed from: t */
        private int f7840t;

        /* renamed from: u */
        private int f7841u;

        /* renamed from: v */
        private boolean f7842v;

        /* renamed from: w */
        private int f7843w;

        /* renamed from: x */
        private int f7844x;

        /* renamed from: y */
        private int f7845y;

        /* renamed from: z */
        private int f7846z;

        static {
            int h = m9524h(0, 0, 0, 0);
            f7815b = h;
            int h2 = m9524h(0, 0, 0, 3);
            f7816c = h2;
            f7821h = new int[]{h, h2, h, h, h2, h, h};
            f7824k = new int[]{h, h, h, h, h, h2, h2};
        }

        public C1126b() {
            mo7095l();
        }

        /* renamed from: g */
        public static int m9523g(int i, int i2, int i3) {
            return m9524h(i, i2, i3, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m9524h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p067c.p068a.p069a.p070a.p111m2.Assertions.m10151c(r4, r0, r1)
                p067c.p068a.p069a.p070a.p111m2.Assertions.m10151c(r5, r0, r1)
                p067c.p068a.p069a.p070a.p111m2.Assertions.m10151c(r6, r0, r1)
                p067c.p068a.p069a.p070a.p111m2.Assertions.m10151c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p101n.Cea708Decoder.C1126b.m9524h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void mo7086a(char c) {
            if (c == 10) {
                this.f7832l.add(mo7089d());
                this.f7833m.clear();
                if (this.f7825A != -1) {
                    this.f7825A = 0;
                }
                if (this.f7826B != -1) {
                    this.f7826B = 0;
                }
                if (this.f7827C != -1) {
                    this.f7827C = 0;
                }
                if (this.f7829E != -1) {
                    this.f7829E = 0;
                }
                while (true) {
                    if ((this.f7842v && this.f7832l.size() >= this.f7841u) || this.f7832l.size() >= 15) {
                        this.f7832l.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f7833m.append(c);
            }
        }

        /* renamed from: b */
        public void mo7087b() {
            int length = this.f7833m.length();
            if (length > 0) {
                this.f7833m.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p067c.p068a.p069a.p070a.p100k2.p101n.Cea708Decoder.C1125a mo7088c() {
            /*
                r15 = this;
                boolean r0 = r15.mo7093j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f7832l
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f7832l
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.mo7089d()
                r2.append(r1)
                int r1 = r15.f7843w
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f7843w
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f7837q
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f7839s
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f7838r
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f7839s
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f7838r
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f7840t
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x009a
            L_0x0093:
                int r8 = r1 / 3
                if (r8 != r5) goto L_0x0099
                r8 = 1
                goto L_0x009a
            L_0x0099:
                r8 = 2
            L_0x009a:
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x00a0
                r9 = 0
                goto L_0x00a6
            L_0x00a0:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a5
                r9 = 1
                goto L_0x00a6
            L_0x00a5:
                r9 = 2
            L_0x00a6:
                int r1 = r15.f7846z
                int r3 = f7815b
                if (r1 == r3) goto L_0x00ad
                r0 = 1
            L_0x00ad:
                c.a.a.a.k2.n.d$a r13 = new c.a.a.a.k2.n.d$a
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r15.f7846z
                int r14 = r15.f7836p
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p101n.Cea708Decoder.C1126b.mo7088c():c.a.a.a.k2.n.d$a");
        }

        /* renamed from: d */
        public SpannableString mo7089d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7833m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f7825A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f7825A, length, 33);
                }
                if (this.f7826B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7826B, length, 33);
                }
                if (this.f7827C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7828D), this.f7827C, length, 33);
                }
                if (this.f7829E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7830F), this.f7829E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void mo7090e() {
            this.f7832l.clear();
            this.f7833m.clear();
            this.f7825A = -1;
            this.f7826B = -1;
            this.f7827C = -1;
            this.f7829E = -1;
            this.f7831G = 0;
        }

        /* renamed from: f */
        public void mo7091f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f7834n = true;
            this.f7835o = z;
            this.f7842v = z5;
            this.f7836p = i;
            this.f7837q = z4;
            this.f7838r = i2;
            this.f7839s = i3;
            this.f7840t = i6;
            int i11 = i4 + 1;
            if (this.f7841u != i11) {
                this.f7841u = i11;
                while (true) {
                    if ((!z5 || this.f7832l.size() < this.f7841u) && this.f7832l.size() < 15) {
                        break;
                    }
                    this.f7832l.remove(0);
                }
            }
            if (!(i9 == 0 || this.f7844x == i9)) {
                this.f7844x = i9;
                int i12 = i9 - 1;
                mo7100q(f7821h[i12], f7816c, f7820g[i12], 0, f7818e[i12], f7819f[i12], f7817d[i12]);
            }
            if (i10 != 0 && this.f7845y != i10) {
                this.f7845y = i10;
                int i13 = i10 - 1;
                mo7096m(0, 1, 1, false, false, f7823j[i13], f7822i[i13]);
                mo7097n(f7814a, f7824k[i13], f7815b);
            }
        }

        /* renamed from: i */
        public boolean mo7092i() {
            return this.f7834n;
        }

        /* renamed from: j */
        public boolean mo7093j() {
            return !mo7092i() || (this.f7832l.isEmpty() && this.f7833m.length() == 0);
        }

        /* renamed from: k */
        public boolean mo7094k() {
            return this.f7835o;
        }

        /* renamed from: l */
        public void mo7095l() {
            mo7090e();
            this.f7834n = false;
            this.f7835o = false;
            this.f7836p = 4;
            this.f7837q = false;
            this.f7838r = 0;
            this.f7839s = 0;
            this.f7840t = 0;
            this.f7841u = 15;
            this.f7842v = true;
            this.f7843w = 0;
            this.f7844x = 0;
            this.f7845y = 0;
            int i = f7815b;
            this.f7846z = i;
            this.f7828D = f7814a;
            this.f7830F = i;
        }

        /* renamed from: m */
        public void mo7096m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f7825A != -1) {
                if (!z) {
                    this.f7833m.setSpan(new StyleSpan(2), this.f7825A, this.f7833m.length(), 33);
                    this.f7825A = -1;
                }
            } else if (z) {
                this.f7825A = this.f7833m.length();
            }
            if (this.f7826B != -1) {
                if (!z2) {
                    this.f7833m.setSpan(new UnderlineSpan(), this.f7826B, this.f7833m.length(), 33);
                    this.f7826B = -1;
                }
            } else if (z2) {
                this.f7826B = this.f7833m.length();
            }
        }

        /* renamed from: n */
        public void mo7097n(int i, int i2, int i3) {
            if (!(this.f7827C == -1 || this.f7828D == i)) {
                this.f7833m.setSpan(new ForegroundColorSpan(this.f7828D), this.f7827C, this.f7833m.length(), 33);
            }
            if (i != f7814a) {
                this.f7827C = this.f7833m.length();
                this.f7828D = i;
            }
            if (!(this.f7829E == -1 || this.f7830F == i2)) {
                this.f7833m.setSpan(new BackgroundColorSpan(this.f7830F), this.f7829E, this.f7833m.length(), 33);
            }
            if (i2 != f7815b) {
                this.f7829E = this.f7833m.length();
                this.f7830F = i2;
            }
        }

        /* renamed from: o */
        public void mo7098o(int i, int i2) {
            if (this.f7831G != i) {
                mo7086a(10);
            }
            this.f7831G = i;
        }

        /* renamed from: p */
        public void mo7099p(boolean z) {
            this.f7835o = z;
        }

        /* renamed from: q */
        public void mo7100q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f7846z = i;
            this.f7843w = i6;
        }
    }

    /* renamed from: c.a.a.a.k2.n.d$c */
    /* compiled from: Cea708Decoder */
    private static final class C1127c {

        /* renamed from: a */
        public final int f7847a;

        /* renamed from: b */
        public final int f7848b;

        /* renamed from: c */
        public final byte[] f7849c;

        /* renamed from: d */
        int f7850d = 0;

        public C1127c(int i, int i2) {
            this.f7847a = i;
            this.f7848b = i2;
            this.f7849c = new byte[((i2 * 2) - 1)];
        }
    }

    public Cea708Decoder(int i, List<byte[]> list) {
        boolean z = true;
        if (i == -1) {
            i = 1;
        }
        this.f7804k = i;
        if (list == null || !CodecSpecificDataUtil.m10175f(list)) {
            z = false;
        }
        this.f7803j = z;
        this.f7805l = new C1126b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f7805l[i2] = new C1126b();
        }
        this.f7806m = this.f7805l[0];
    }

    /* renamed from: A */
    private void m9496A() {
        this.f7806m.mo7096m(this.f7801h.mo7495h(4), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7494g(), this.f7801h.mo7494g(), this.f7801h.mo7495h(3), this.f7801h.mo7495h(3));
    }

    /* renamed from: B */
    private void m9497B() {
        int h = C1126b.m9524h(this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2));
        int h2 = C1126b.m9524h(this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2));
        this.f7801h.mo7505r(2);
        this.f7806m.mo7097n(h, h2, C1126b.m9523g(this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2)));
    }

    /* renamed from: C */
    private void m9498C() {
        this.f7801h.mo7505r(4);
        int h = this.f7801h.mo7495h(4);
        this.f7801h.mo7505r(2);
        this.f7806m.mo7098o(h, this.f7801h.mo7495h(6));
    }

    /* renamed from: D */
    private void m9499D() {
        int h = C1126b.m9524h(this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2));
        int h2 = this.f7801h.mo7495h(2);
        int g = C1126b.m9523g(this.f7801h.mo7495h(2), this.f7801h.mo7495h(2), this.f7801h.mo7495h(2));
        if (this.f7801h.mo7494g()) {
            h2 |= 4;
        }
        int i = h2;
        boolean g2 = this.f7801h.mo7494g();
        int h3 = this.f7801h.mo7495h(2);
        int h4 = this.f7801h.mo7495h(2);
        int h5 = this.f7801h.mo7495h(2);
        this.f7801h.mo7505r(8);
        this.f7806m.mo7100q(h, g, g2, i, h3, h4, h5);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    /* renamed from: E */
    private void m9500E() {
        C1127c cVar = this.f7809p;
        String str = "Cea708Decoder";
        if (cVar.f7850d != (cVar.f7848b * 2) - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append((this.f7809p.f7848b * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.f7809p.f7850d);
            sb.append(" (sequence number ");
            sb.append(this.f7809p.f7847a);
            sb.append(");");
            Log.m10380b(str, sb.toString());
        }
        ParsableBitArray zVar = this.f7801h;
        C1127c cVar2 = this.f7809p;
        zVar.mo7502o(cVar2.f7849c, cVar2.f7850d);
        int h = this.f7801h.mo7495h(3);
        int h2 = this.f7801h.mo7495h(5);
        if (h == 7) {
            this.f7801h.mo7505r(2);
            h = this.f7801h.mo7495h(6);
            if (h < 7) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid extended service number: ");
                sb2.append(h);
                Log.m10386h(str, sb2.toString());
            }
        }
        if (h2 == 0) {
            if (h != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("serviceNumber is non-zero (");
                sb3.append(h);
                sb3.append(") when blockSize is 0");
                Log.m10386h(str, sb3.toString());
            }
        } else if (h == this.f7804k) {
            boolean z = false;
            while (this.f7801h.mo7489b() > 0) {
                int h3 = this.f7801h.mo7495h(8);
                if (h3 == 16) {
                    int h4 = this.f7801h.mo7495h(8);
                    if (h4 <= 31) {
                        m9506t(h4);
                    } else if (h4 <= 127) {
                        m9511y(h4);
                    } else if (h4 <= 159) {
                        m9507u(h4);
                    } else if (h4 <= 255) {
                        m9512z(h4);
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid extended command: ");
                        sb4.append(h4);
                        Log.m10386h(str, sb4.toString());
                    }
                } else if (h3 <= 31) {
                    m9504r(h3);
                } else if (h3 <= 127) {
                    m9509w(h3);
                } else if (h3 <= 159) {
                    m9505s(h3);
                } else if (h3 <= 255) {
                    m9510x(h3);
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid base command: ");
                    sb5.append(h3);
                    Log.m10386h(str, sb5.toString());
                }
                z = true;
            }
            if (z) {
                this.f7807n = m9503q();
            }
        }
    }

    /* renamed from: F */
    private void m9501F() {
        for (int i = 0; i < 8; i++) {
            this.f7805l[i].mo7095l();
        }
    }

    /* renamed from: p */
    private void m9502p() {
        if (this.f7809p != null) {
            m9500E();
            this.f7809p = null;
        }
    }

    /* renamed from: q */
    private List<Cue> m9503q() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f7805l[i].mo7093j() && this.f7805l[i].mo7094k()) {
                C1125a c = this.f7805l[i].mo7088c();
                if (c != null) {
                    arrayList.add(c);
                }
            }
        }
        Collections.sort(arrayList, C1125a.f7811a);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C1125a) arrayList.get(i2)).f7812b);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: r */
    private void m9504r(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f7807n = m9503q();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    m9501F();
                    return;
                case 13:
                    this.f7806m.mo7086a(10);
                    return;
                case 14:
                    return;
                default:
                    String str = "Cea708Decoder";
                    if (i >= 17 && i <= 23) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(i);
                        Log.m10386h(str, sb.toString());
                        this.f7801h.mo7505r(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid C0 command: ");
                        sb2.append(i);
                        Log.m10386h(str, sb2.toString());
                        return;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Currently unsupported COMMAND_P16 Command: ");
                        sb3.append(i);
                        Log.m10386h(str, sb3.toString());
                        this.f7801h.mo7505r(16);
                        return;
                    }
            }
        } else {
            this.f7806m.mo7087b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f7801h.mo7494g() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f7805l[8 - r2].mo7095l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f7801h.mo7494g() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f7805l[8 - r2].mo7099p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f7801h.mo7494g() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f7805l[8 - r2].mo7090e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9505s(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x0109;
                case 129: goto L_0x0109;
                case 130: goto L_0x0109;
                case 131: goto L_0x0109;
                case 132: goto L_0x0109;
                case 133: goto L_0x0109;
                case 134: goto L_0x0109;
                case 135: goto L_0x0109;
                case 136: goto L_0x00f3;
                case 137: goto L_0x00dc;
                case 138: goto L_0x00c5;
                case 139: goto L_0x00a9;
                case 140: goto L_0x0093;
                case 141: goto L_0x008c;
                case 142: goto L_0x0117;
                case 143: goto L_0x0087;
                case 144: goto L_0x0073;
                case 145: goto L_0x005d;
                case 146: goto L_0x0049;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.m9508v(r5)
            int r0 = r4.f7810q
            if (r0 == r5) goto L_0x0117
            r4.f7810q = r5
            c.a.a.a.k2.n.d$b[] r0 = r4.f7805l
            r5 = r0[r5]
            r4.f7806m = r5
            goto L_0x0117
        L_0x0033:
            c.a.a.a.k2.n.d$b r5 = r4.f7806m
            boolean r5 = r5.mo7092i()
            if (r5 != 0) goto L_0x0044
            c.a.a.a.m2.z r5 = r4.f7801h
            r0 = 32
            r5.mo7505r(r0)
            goto L_0x0117
        L_0x0044:
            r4.m9499D()
            goto L_0x0117
        L_0x0049:
            c.a.a.a.k2.n.d$b r5 = r4.f7806m
            boolean r5 = r5.mo7092i()
            if (r5 != 0) goto L_0x0058
            c.a.a.a.m2.z r5 = r4.f7801h
            r5.mo7505r(r0)
            goto L_0x0117
        L_0x0058:
            r4.m9498C()
            goto L_0x0117
        L_0x005d:
            c.a.a.a.k2.n.d$b r5 = r4.f7806m
            boolean r5 = r5.mo7092i()
            if (r5 != 0) goto L_0x006e
            c.a.a.a.m2.z r5 = r4.f7801h
            r0 = 24
            r5.mo7505r(r0)
            goto L_0x0117
        L_0x006e:
            r4.m9497B()
            goto L_0x0117
        L_0x0073:
            c.a.a.a.k2.n.d$b r5 = r4.f7806m
            boolean r5 = r5.mo7092i()
            if (r5 != 0) goto L_0x0082
            c.a.a.a.m2.z r5 = r4.f7801h
            r5.mo7505r(r0)
            goto L_0x0117
        L_0x0082:
            r4.m9496A()
            goto L_0x0117
        L_0x0087:
            r4.m9501F()
            goto L_0x0117
        L_0x008c:
            c.a.a.a.m2.z r5 = r4.f7801h
            r5.mo7505r(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            c.a.a.a.m2.z r5 = r4.f7801h
            boolean r5 = r5.mo7494g()
            if (r5 == 0) goto L_0x00a6
            c.a.a.a.k2.n.d$b[] r5 = r4.f7805l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo7095l()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = 1
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            c.a.a.a.m2.z r0 = r4.f7801h
            boolean r0 = r0.mo7494g()
            if (r0 == 0) goto L_0x00c2
            c.a.a.a.k2.n.d$b[] r0 = r4.f7805l
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.mo7094k()
            r3 = r3 ^ r2
            r0.mo7099p(r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            c.a.a.a.m2.z r5 = r4.f7801h
            boolean r5 = r5.mo7494g()
            if (r5 == 0) goto L_0x00d9
            c.a.a.a.k2.n.d$b[] r5 = r4.f7805l
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.mo7099p(r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = 1
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            c.a.a.a.m2.z r0 = r4.f7801h
            boolean r0 = r0.mo7494g()
            if (r0 == 0) goto L_0x00f0
            c.a.a.a.k2.n.d$b[] r0 = r4.f7805l
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.mo7099p(r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            c.a.a.a.m2.z r5 = r4.f7801h
            boolean r5 = r5.mo7494g()
            if (r5 == 0) goto L_0x0106
            c.a.a.a.k2.n.d$b[] r5 = r4.f7805l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo7090e()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f7810q
            if (r0 == r5) goto L_0x0117
            r4.f7810q = r5
            c.a.a.a.k2.n.d$b[] r0 = r4.f7805l
            r5 = r0[r5]
            r4.f7806m = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p101n.Cea708Decoder.m9505s(int):void");
    }

    /* renamed from: t */
    private void m9506t(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f7801h.mo7505r(8);
            } else if (i <= 23) {
                this.f7801h.mo7505r(16);
            } else if (i <= 31) {
                this.f7801h.mo7505r(24);
            }
        }
    }

    /* renamed from: u */
    private void m9507u(int i) {
        if (i <= 135) {
            this.f7801h.mo7505r(32);
        } else if (i <= 143) {
            this.f7801h.mo7505r(40);
        } else if (i <= 159) {
            this.f7801h.mo7505r(2);
            this.f7801h.mo7505r(this.f7801h.mo7495h(6) * 8);
        }
    }

    /* renamed from: v */
    private void m9508v(int i) {
        C1126b bVar = this.f7805l[i];
        this.f7801h.mo7505r(2);
        boolean g = this.f7801h.mo7494g();
        boolean g2 = this.f7801h.mo7494g();
        boolean g3 = this.f7801h.mo7494g();
        int h = this.f7801h.mo7495h(3);
        boolean g4 = this.f7801h.mo7494g();
        int h2 = this.f7801h.mo7495h(7);
        int h3 = this.f7801h.mo7495h(8);
        int h4 = this.f7801h.mo7495h(4);
        int h5 = this.f7801h.mo7495h(4);
        this.f7801h.mo7505r(2);
        int h6 = this.f7801h.mo7495h(6);
        this.f7801h.mo7505r(2);
        bVar.mo7091f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.f7801h.mo7495h(3), this.f7801h.mo7495h(3));
    }

    /* renamed from: w */
    private void m9509w(int i) {
        if (i == 127) {
            this.f7806m.mo7086a(9835);
        } else {
            this.f7806m.mo7086a((char) (i & 255));
        }
    }

    /* renamed from: x */
    private void m9510x(int i) {
        this.f7806m.mo7086a((char) (i & 255));
    }

    /* renamed from: y */
    private void m9511y(int i) {
        if (i == 32) {
            this.f7806m.mo7086a(' ');
        } else if (i == 33) {
            this.f7806m.mo7086a(160);
        } else if (i == 37) {
            this.f7806m.mo7086a(8230);
        } else if (i == 42) {
            this.f7806m.mo7086a(352);
        } else if (i == 44) {
            this.f7806m.mo7086a(338);
        } else if (i == 63) {
            this.f7806m.mo7086a(376);
        } else if (i == 57) {
            this.f7806m.mo7086a(8482);
        } else if (i == 58) {
            this.f7806m.mo7086a(353);
        } else if (i == 60) {
            this.f7806m.mo7086a(339);
        } else if (i != 61) {
            switch (i) {
                case 48:
                    this.f7806m.mo7086a(9608);
                    return;
                case 49:
                    this.f7806m.mo7086a(8216);
                    return;
                case 50:
                    this.f7806m.mo7086a(8217);
                    return;
                case 51:
                    this.f7806m.mo7086a(8220);
                    return;
                case 52:
                    this.f7806m.mo7086a(8221);
                    return;
                case 53:
                    this.f7806m.mo7086a(8226);
                    return;
                default:
                    switch (i) {
                        case 118:
                            this.f7806m.mo7086a(8539);
                            return;
                        case 119:
                            this.f7806m.mo7086a(8540);
                            return;
                        case 120:
                            this.f7806m.mo7086a(8541);
                            return;
                        case 121:
                            this.f7806m.mo7086a(8542);
                            return;
                        case 122:
                            this.f7806m.mo7086a(9474);
                            return;
                        case 123:
                            this.f7806m.mo7086a(9488);
                            return;
                        case 124:
                            this.f7806m.mo7086a(9492);
                            return;
                        case 125:
                            this.f7806m.mo7086a(9472);
                            return;
                        case 126:
                            this.f7806m.mo7086a(9496);
                            return;
                        case 127:
                            this.f7806m.mo7086a(9484);
                            return;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid G2 character: ");
                            sb.append(i);
                            Log.m10386h("Cea708Decoder", sb.toString());
                            return;
                    }
            }
        } else {
            this.f7806m.mo7086a(8480);
        }
    }

    /* renamed from: z */
    private void m9512z(int i) {
        if (i == 160) {
            this.f7806m.mo7086a(13252);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid G3 character: ");
        sb.append(i);
        Log.m10386h("Cea708Decoder", sb.toString());
        this.f7806m.mo7086a('_');
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo5958a() {
        super.mo5958a();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo7055b(long j) {
        super.mo7055b(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Subtitle mo7071f() {
        List<Cue> list = this.f7807n;
        this.f7808o = list;
        return new CeaSubtitle((List) Assertions.m10153e(list));
    }

    public void flush() {
        super.flush();
        this.f7807n = null;
        this.f7808o = null;
        this.f7810q = 0;
        this.f7806m = this.f7805l[0];
        m9501F();
        this.f7809p = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7072g(SubtitleInputBuffer jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.m10153e(jVar.f5744c);
        this.f7800g.mo7372N(byteBuffer.array(), byteBuffer.limit());
        while (this.f7800g.mo7376a() >= 3) {
            int D = this.f7800g.mo7362D() & 7;
            int i = D & 3;
            boolean z = false;
            boolean z2 = (D & 4) == 4;
            byte D2 = (byte) this.f7800g.mo7362D();
            byte D3 = (byte) this.f7800g.mo7362D();
            if ((i == 2 || i == 3) && z2) {
                String str = "Cea708Decoder";
                if (i == 3) {
                    m9502p();
                    int i2 = (D2 & 192) >> 6;
                    int i3 = this.f7802i;
                    if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                        m9501F();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Sequence number discontinuity. previous=");
                        sb.append(this.f7802i);
                        sb.append(" current=");
                        sb.append(i2);
                        Log.m10386h(str, sb.toString());
                    }
                    this.f7802i = i2;
                    byte b = D2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    C1127c cVar = new C1127c(i2, b);
                    this.f7809p = cVar;
                    byte[] bArr = cVar.f7849c;
                    int i4 = cVar.f7850d;
                    cVar.f7850d = i4 + 1;
                    bArr[i4] = D3;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    Assertions.m10149a(z);
                    C1127c cVar2 = this.f7809p;
                    if (cVar2 == null) {
                        Log.m10381c(str, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f7849c;
                        int i5 = cVar2.f7850d;
                        int i6 = i5 + 1;
                        cVar2.f7850d = i6;
                        bArr2[i5] = D2;
                        cVar2.f7850d = i6 + 1;
                        bArr2[i6] = D3;
                    }
                }
                C1127c cVar3 = this.f7809p;
                if (cVar3.f7850d == (cVar3.f7848b * 2) - 1) {
                    m9502p();
                }
            }
        }
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ SubtitleInputBuffer mo7073h() throws SubtitleDecoderException {
        return super.mo5961e();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer mo7074i() throws SubtitleDecoderException {
        return super.mo5960d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo7075l() {
        return this.f7807n != this.f7808o;
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo7076m(SubtitleInputBuffer jVar) throws SubtitleDecoderException {
        super.mo5959c(jVar);
    }
}
