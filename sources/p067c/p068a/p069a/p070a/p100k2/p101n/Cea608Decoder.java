package p067c.p068a.p069a.p070a.p100k2.p101n;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.p259uc.crashsdk.export.CrashStatKey;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import com.umeng.analytics.pro.TType;
import com.umeng.umcrash.C3276R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException;
import p067c.p068a.p069a.p070a.p100k2.SubtitleInputBuffer;
import p067c.p068a.p069a.p070a.p100k2.SubtitleOutputBuffer;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.n.c */
public final class Cea608Decoder extends CeaDecoder {

    /* renamed from: g */
    private static final int[] f7763g = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: h */
    private static final int[] f7764h = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final int[] f7765i = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: j */
    private static final int[] f7766j = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, C3276R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: k */
    private static final int[] f7767k = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: l */
    private static final int[] f7768l = {193, CrashStatKey.LOG_UPLOAD_ENCRYPT_COUNT, 211, 218, 220, 252, 8216, 161, 42, 39, C3149a.f17183B, 169, 8480, 8226, 8220, 8221, 192, 194, 199, CrashStatKey.LOG_LEGACY_TMP_FILE, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: m */
    private static final int[] f7769m = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: n */
    private static final boolean[] f7770n;

    /* renamed from: A */
    private boolean f7771A;

    /* renamed from: B */
    private byte f7772B;

    /* renamed from: C */
    private byte f7773C;

    /* renamed from: D */
    private int f7774D = 0;

    /* renamed from: E */
    private boolean f7775E;

    /* renamed from: F */
    private long f7776F;

    /* renamed from: o */
    private final ParsableByteArray f7777o = new ParsableByteArray();

    /* renamed from: p */
    private final int f7778p;

    /* renamed from: q */
    private final int f7779q;

    /* renamed from: r */
    private final int f7780r;

    /* renamed from: s */
    private final long f7781s;

    /* renamed from: t */
    private final ArrayList<C1123a> f7782t = new ArrayList<>();

    /* renamed from: u */
    private C1123a f7783u = new C1123a(0, 4);

    /* renamed from: v */
    private List<Cue> f7784v;

    /* renamed from: w */
    private List<Cue> f7785w;

    /* renamed from: x */
    private int f7786x;

    /* renamed from: y */
    private int f7787y;

    /* renamed from: z */
    private boolean f7788z;

    /* renamed from: c.a.a.a.k2.n.c$a */
    /* compiled from: Cea608Decoder */
    private static final class C1123a {

        /* renamed from: a */
        private final List<C1124a> f7789a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f7790b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f7791c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f7792d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f7793e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f7794f;

        /* renamed from: g */
        private int f7795g;

        /* renamed from: h */
        private int f7796h;

        /* renamed from: c.a.a.a.k2.n.c$a$a */
        /* compiled from: Cea608Decoder */
        private static class C1124a {

            /* renamed from: a */
            public final int f7797a;

            /* renamed from: b */
            public final boolean f7798b;

            /* renamed from: c */
            public int f7799c;

            public C1124a(int i, boolean z, int i2) {
                this.f7797a = i;
                this.f7798b = z;
                this.f7799c = i2;
            }
        }

        public C1123a(int i, int i2) {
            mo7081j(i);
            this.f7796h = i2;
        }

        /* renamed from: h */
        private SpannableString m9483h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7791c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f7789a.size()) {
                C1124a aVar = (C1124a) this.f7789a.get(i);
                boolean z2 = aVar.f7798b;
                int i7 = aVar.f7797a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = Cea608Decoder.f7765i[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f7799c;
                i++;
                if (i8 != (i < this.f7789a.size() ? ((C1124a) this.f7789a.get(i)).f7799c : length)) {
                    if (i2 != -1 && !z2) {
                        m9486q(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        m9485o(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        m9484n(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                m9486q(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                m9485o(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                m9484n(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: n */
        private static void m9484n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        /* renamed from: o */
        private static void m9485o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: q */
        private static void m9486q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: e */
        public void mo7077e(char c) {
            if (this.f7791c.length() < 32) {
                this.f7791c.append(c);
            }
        }

        /* renamed from: f */
        public void mo7078f() {
            int length = this.f7791c.length();
            if (length > 0) {
                this.f7791c.delete(length - 1, length);
                int size = this.f7789a.size() - 1;
                while (size >= 0) {
                    C1124a aVar = (C1124a) this.f7789a.get(size);
                    int i = aVar.f7799c;
                    if (i == length) {
                        aVar.f7799c = i - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: g */
        public Cue mo7079g(int i) {
            float f;
            int i2 = this.f7793e + this.f7794f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f7790b.size(); i4++) {
                spannableStringBuilder.append(Util.m10262M0((CharSequence) this.f7790b.get(i4), i3));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(Util.m10262M0(m9483h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f7795g != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.f7795g != 2 || i5 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.f7792d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f7795g == 1) {
                i6 -= this.f7796h - 1;
            }
            return new C1119b().mo7049n(spannableStringBuilder).mo7050o(Alignment.ALIGN_NORMAL).mo7043h((float) i6, 1).mo7045j(f).mo7046k(i).mo7036a();
        }

        /* renamed from: i */
        public boolean mo7080i() {
            return this.f7789a.isEmpty() && this.f7790b.isEmpty() && this.f7791c.length() == 0;
        }

        /* renamed from: j */
        public void mo7081j(int i) {
            this.f7795g = i;
            this.f7789a.clear();
            this.f7790b.clear();
            this.f7791c.setLength(0);
            this.f7792d = 15;
            this.f7793e = 0;
            this.f7794f = 0;
        }

        /* renamed from: k */
        public void mo7082k() {
            this.f7790b.add(m9483h());
            this.f7791c.setLength(0);
            this.f7789a.clear();
            int min = Math.min(this.f7796h, this.f7792d);
            while (this.f7790b.size() >= min) {
                this.f7790b.remove(0);
            }
        }

        /* renamed from: l */
        public void mo7083l(int i) {
            this.f7795g = i;
        }

        /* renamed from: m */
        public void mo7084m(int i) {
            this.f7796h = i;
        }

        /* renamed from: p */
        public void mo7085p(int i, boolean z) {
            this.f7789a.add(new C1124a(i, z, this.f7791c.length()));
        }
    }

    static {
        boolean[] zArr = new boolean[LogType.UNEXP];
        // fill-array-data instruction
        zArr[0] = 0;
        zArr[1] = 1;
        zArr[2] = 1;
        zArr[3] = 0;
        zArr[4] = 1;
        zArr[5] = 0;
        zArr[6] = 0;
        zArr[7] = 1;
        zArr[8] = 1;
        zArr[9] = 0;
        zArr[10] = 0;
        zArr[11] = 1;
        zArr[12] = 0;
        zArr[13] = 1;
        zArr[14] = 1;
        zArr[15] = 0;
        zArr[16] = 1;
        zArr[17] = 0;
        zArr[18] = 0;
        zArr[19] = 1;
        zArr[20] = 0;
        zArr[21] = 1;
        zArr[22] = 1;
        zArr[23] = 0;
        zArr[24] = 0;
        zArr[25] = 1;
        zArr[26] = 1;
        zArr[27] = 0;
        zArr[28] = 1;
        zArr[29] = 0;
        zArr[30] = 0;
        zArr[31] = 1;
        zArr[32] = 1;
        zArr[33] = 0;
        zArr[34] = 0;
        zArr[35] = 1;
        zArr[36] = 0;
        zArr[37] = 1;
        zArr[38] = 1;
        zArr[39] = 0;
        zArr[40] = 0;
        zArr[41] = 1;
        zArr[42] = 1;
        zArr[43] = 0;
        zArr[44] = 1;
        zArr[45] = 0;
        zArr[46] = 0;
        zArr[47] = 1;
        zArr[48] = 0;
        zArr[49] = 1;
        zArr[50] = 1;
        zArr[51] = 0;
        zArr[52] = 1;
        zArr[53] = 0;
        zArr[54] = 0;
        zArr[55] = 1;
        zArr[56] = 1;
        zArr[57] = 0;
        zArr[58] = 0;
        zArr[59] = 1;
        zArr[60] = 0;
        zArr[61] = 1;
        zArr[62] = 1;
        zArr[63] = 0;
        zArr[64] = 1;
        zArr[65] = 0;
        zArr[66] = 0;
        zArr[67] = 1;
        zArr[68] = 0;
        zArr[69] = 1;
        zArr[70] = 1;
        zArr[71] = 0;
        zArr[72] = 0;
        zArr[73] = 1;
        zArr[74] = 1;
        zArr[75] = 0;
        zArr[76] = 1;
        zArr[77] = 0;
        zArr[78] = 0;
        zArr[79] = 1;
        zArr[80] = 0;
        zArr[81] = 1;
        zArr[82] = 1;
        zArr[83] = 0;
        zArr[84] = 1;
        zArr[85] = 0;
        zArr[86] = 0;
        zArr[87] = 1;
        zArr[88] = 1;
        zArr[89] = 0;
        zArr[90] = 0;
        zArr[91] = 1;
        zArr[92] = 0;
        zArr[93] = 1;
        zArr[94] = 1;
        zArr[95] = 0;
        zArr[96] = 0;
        zArr[97] = 1;
        zArr[98] = 1;
        zArr[99] = 0;
        zArr[100] = 1;
        zArr[101] = 0;
        zArr[102] = 0;
        zArr[103] = 1;
        zArr[104] = 1;
        zArr[105] = 0;
        zArr[106] = 0;
        zArr[107] = 1;
        zArr[108] = 0;
        zArr[109] = 1;
        zArr[110] = 1;
        zArr[111] = 0;
        zArr[112] = 1;
        zArr[113] = 0;
        zArr[114] = 0;
        zArr[115] = 1;
        zArr[116] = 0;
        zArr[117] = 1;
        zArr[118] = 1;
        zArr[119] = 0;
        zArr[120] = 0;
        zArr[121] = 1;
        zArr[122] = 1;
        zArr[123] = 0;
        zArr[124] = 1;
        zArr[125] = 0;
        zArr[126] = 0;
        zArr[127] = 1;
        zArr[128] = 1;
        zArr[129] = 0;
        zArr[130] = 0;
        zArr[131] = 1;
        zArr[132] = 0;
        zArr[133] = 1;
        zArr[134] = 1;
        zArr[135] = 0;
        zArr[136] = 0;
        zArr[137] = 1;
        zArr[138] = 1;
        zArr[139] = 0;
        zArr[140] = 1;
        zArr[141] = 0;
        zArr[142] = 0;
        zArr[143] = 1;
        zArr[144] = 0;
        zArr[145] = 1;
        zArr[146] = 1;
        zArr[147] = 0;
        zArr[148] = 1;
        zArr[149] = 0;
        zArr[150] = 0;
        zArr[151] = 1;
        zArr[152] = 1;
        zArr[153] = 0;
        zArr[154] = 0;
        zArr[155] = 1;
        zArr[156] = 0;
        zArr[157] = 1;
        zArr[158] = 1;
        zArr[159] = 0;
        zArr[160] = 0;
        zArr[161] = 1;
        zArr[162] = 1;
        zArr[163] = 0;
        zArr[164] = 1;
        zArr[165] = 0;
        zArr[166] = 0;
        zArr[167] = 1;
        zArr[168] = 1;
        zArr[169] = 0;
        zArr[170] = 0;
        zArr[171] = 1;
        zArr[172] = 0;
        zArr[173] = 1;
        zArr[174] = 1;
        zArr[175] = 0;
        zArr[176] = 1;
        zArr[177] = 0;
        zArr[178] = 0;
        zArr[179] = 1;
        zArr[180] = 0;
        zArr[181] = 1;
        zArr[182] = 1;
        zArr[183] = 0;
        zArr[184] = 0;
        zArr[185] = 1;
        zArr[186] = 1;
        zArr[187] = 0;
        zArr[188] = 1;
        zArr[189] = 0;
        zArr[190] = 0;
        zArr[191] = 1;
        zArr[192] = 0;
        zArr[193] = 1;
        zArr[194] = 1;
        zArr[195] = 0;
        zArr[196] = 1;
        zArr[197] = 0;
        zArr[198] = 0;
        zArr[199] = 1;
        zArr[200] = 1;
        zArr[201] = 0;
        zArr[202] = 0;
        zArr[203] = 1;
        zArr[204] = 0;
        zArr[205] = 1;
        zArr[206] = 1;
        zArr[207] = 0;
        zArr[208] = 1;
        zArr[209] = 0;
        zArr[210] = 0;
        zArr[211] = 1;
        zArr[212] = 0;
        zArr[213] = 1;
        zArr[214] = 1;
        zArr[215] = 0;
        zArr[216] = 0;
        zArr[217] = 1;
        zArr[218] = 1;
        zArr[219] = 0;
        zArr[220] = 1;
        zArr[221] = 0;
        zArr[222] = 0;
        zArr[223] = 1;
        zArr[224] = 1;
        zArr[225] = 0;
        zArr[226] = 0;
        zArr[227] = 1;
        zArr[228] = 0;
        zArr[229] = 1;
        zArr[230] = 1;
        zArr[231] = 0;
        zArr[232] = 0;
        zArr[233] = 1;
        zArr[234] = 1;
        zArr[235] = 0;
        zArr[236] = 1;
        zArr[237] = 0;
        zArr[238] = 0;
        zArr[239] = 1;
        zArr[240] = 0;
        zArr[241] = 1;
        zArr[242] = 1;
        zArr[243] = 0;
        zArr[244] = 1;
        zArr[245] = 0;
        zArr[246] = 0;
        zArr[247] = 1;
        zArr[248] = 1;
        zArr[249] = 0;
        zArr[250] = 0;
        zArr[251] = 1;
        zArr[252] = 0;
        zArr[253] = 1;
        zArr[254] = 1;
        zArr[255] = 0;
        f7770n = zArr;
    }

    public Cea608Decoder(String str, int i, long j) {
        this.f7781s = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f7778p = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f7780r = 0;
            this.f7779q = 0;
        } else if (i == 2) {
            this.f7780r = 1;
            this.f7779q = 0;
        } else if (i == 3) {
            this.f7780r = 0;
            this.f7779q = 1;
        } else if (i != 4) {
            Log.m10386h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f7780r = 0;
            this.f7779q = 0;
        } else {
            this.f7780r = 1;
            this.f7779q = 1;
        }
        m9455N(0);
        m9454M();
        this.f7775E = true;
        this.f7776F = -9223372036854775807L;
    }

    /* renamed from: A */
    private static boolean m9442A(byte b) {
        return (b & 224) == 0;
    }

    /* renamed from: B */
    private static boolean m9443B(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* renamed from: C */
    private static boolean m9444C(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: D */
    private static boolean m9445D(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: E */
    private static boolean m9446E(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: F */
    private static boolean m9447F(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: G */
    private boolean m9448G(boolean z, byte b, byte b2) {
        if (!z || !m9447F(b)) {
            this.f7771A = false;
        } else if (this.f7771A && this.f7772B == b && this.f7773C == b2) {
            this.f7771A = false;
            return true;
        } else {
            this.f7771A = true;
            this.f7772B = b;
            this.f7773C = b2;
        }
        return false;
    }

    /* renamed from: H */
    private static boolean m9449H(byte b) {
        return (b & 247) == 20;
    }

    /* renamed from: I */
    private static boolean m9450I(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* renamed from: J */
    private static boolean m9451J(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: K */
    private static boolean m9452K(byte b) {
        return 1 <= b && b <= 15;
    }

    /* renamed from: L */
    private void m9453L(byte b, byte b2) {
        if (m9452K(b)) {
            this.f7775E = false;
        } else if (m9449H(b)) {
            if (!(b2 == 32 || b2 == 47)) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f7775E = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f7775E = true;
        }
    }

    /* renamed from: M */
    private void m9454M() {
        this.f7783u.mo7081j(this.f7786x);
        this.f7782t.clear();
        this.f7782t.add(this.f7783u);
    }

    /* renamed from: N */
    private void m9455N(int i) {
        int i2 = this.f7786x;
        if (i2 != i) {
            this.f7786x = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f7782t.size(); i3++) {
                    ((C1123a) this.f7782t.get(i3)).mo7083l(i);
                }
                return;
            }
            m9454M();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f7784v = Collections.emptyList();
            }
        }
    }

    /* renamed from: O */
    private void m9456O(int i) {
        this.f7787y = i;
        this.f7783u.mo7084m(i);
    }

    /* renamed from: P */
    private boolean m9457P() {
        if (this.f7781s == -9223372036854775807L || this.f7776F == -9223372036854775807L || mo7102k() - this.f7776F < this.f7781s) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private boolean m9458Q(byte b) {
        if (m9442A(b)) {
            this.f7774D = m9461r(b);
        }
        return this.f7774D == this.f7780r;
    }

    /* renamed from: q */
    private static char m9460q(byte b) {
        return (char) f7766j[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: r */
    private static int m9461r(byte b) {
        return (b >> 3) & 1;
    }

    /* renamed from: s */
    private List<Cue> m9462s() {
        int size = this.f7782t.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            Cue g = ((C1123a) this.f7782t.get(i2)).mo7079g(Integer.MIN_VALUE);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.f7715i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Cue cVar = (Cue) arrayList.get(i3);
            if (cVar != null) {
                if (cVar.f7715i != i) {
                    cVar = (Cue) Assertions.m10153e(((C1123a) this.f7782t.get(i3)).mo7079g(i));
                }
                arrayList2.add(cVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: t */
    private static char m9463t(byte b) {
        return (char) f7768l[b & 31];
    }

    /* renamed from: u */
    private static char m9464u(byte b) {
        return (char) f7769m[b & 31];
    }

    /* renamed from: v */
    private static char m9465v(byte b, byte b2) {
        if ((b & 1) == 0) {
            return m9463t(b2);
        }
        return m9464u(b2);
    }

    /* renamed from: w */
    private static char m9466w(byte b) {
        return (char) f7767k[b & TType.f16864m];
    }

    /* renamed from: x */
    private void m9467x(byte b) {
        this.f7783u.mo7077e(' ');
        this.f7783u.mo7085p((b >> 1) & 7, (b & 1) == 1);
    }

    /* renamed from: y */
    private void m9468y(byte b) {
        if (b == 32) {
            m9455N(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    m9455N(1);
                    m9456O(2);
                    return;
                case 38:
                    m9455N(1);
                    m9456O(3);
                    return;
                case 39:
                    m9455N(1);
                    m9456O(4);
                    return;
                default:
                    int i = this.f7786x;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.f7784v = Collections.emptyList();
                                    int i2 = this.f7786x;
                                    if (i2 == 1 || i2 == 3) {
                                        m9454M();
                                        break;
                                    }
                                case 45:
                                    if (i == 1 && !this.f7783u.mo7080i()) {
                                        this.f7783u.mo7082k();
                                        break;
                                    }
                                case 46:
                                    m9454M();
                                    break;
                                case 47:
                                    this.f7784v = m9462s();
                                    m9454M();
                                    break;
                            }
                        } else {
                            this.f7783u.mo7078f();
                        }
                        return;
                    }
                    return;
            }
        } else {
            m9455N(3);
        }
    }

    /* renamed from: z */
    private void m9469z(byte b, byte b2) {
        int i = f7763g[b & 7];
        boolean z = false;
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f7783u.f7792d) {
            if (this.f7786x != 1 && !this.f7783u.mo7080i()) {
                C1123a aVar = new C1123a(this.f7786x, this.f7787y);
                this.f7783u = aVar;
                this.f7782t.add(aVar);
            }
            this.f7783u.f7792d = i;
        }
        boolean z2 = (b2 & TType.f16865n) == 16;
        if ((b2 & 1) == 1) {
            z = true;
        }
        int i2 = (b2 >> 1) & 7;
        this.f7783u.mo7085p(z2 ? 8 : i2, z);
        if (z2) {
            this.f7783u.f7793e = f7764h[i2];
        }
    }

    /* renamed from: a */
    public void mo5958a() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo7055b(long j) {
        super.mo7055b(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Subtitle mo7071f() {
        List<Cue> list = this.f7784v;
        this.f7785w = list;
        return new CeaSubtitle((List) Assertions.m10153e(list));
    }

    public void flush() {
        super.flush();
        this.f7784v = null;
        this.f7785w = null;
        m9455N(0);
        m9456O(4);
        m9454M();
        this.f7788z = false;
        this.f7771A = false;
        this.f7772B = 0;
        this.f7773C = 0;
        this.f7774D = 0;
        this.f7775E = true;
        this.f7776F = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0018 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7072g(p067c.p068a.p069a.p070a.p100k2.SubtitleInputBuffer r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f5744c
            java.lang.Object r10 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            c.a.a.a.m2.a0 r0 = r9.f7777o
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.mo7372N(r1, r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0018:
            c.a.a.a.m2.a0 r2 = r9.f7777o
            int r2 = r2.mo7376a()
            int r3 = r9.f7778p
            if (r2 < r3) goto L_0x00f6
            r2 = 2
            if (r3 != r2) goto L_0x0027
            r2 = -4
            goto L_0x002e
        L_0x0027:
            c.a.a.a.m2.a0 r2 = r9.f7777o
            int r2 = r2.mo7362D()
            byte r2 = (byte) r2
        L_0x002e:
            c.a.a.a.m2.a0 r3 = r9.f7777o
            int r3 = r3.mo7362D()
            c.a.a.a.m2.a0 r4 = r9.f7777o
            int r4 = r4.mo7362D()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0018
        L_0x003f:
            r5 = r2 & 1
            int r6 = r9.f7779q
            if (r5 == r6) goto L_0x0046
            goto L_0x0018
        L_0x0046:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            goto L_0x0018
        L_0x0051:
            boolean r7 = r9.f7788z
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0064
            boolean[] r2 = f7770n
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0064
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r9.f7788z = r2
            boolean r2 = r9.m9448G(r2, r5, r6)
            if (r2 == 0) goto L_0x006e
            goto L_0x0018
        L_0x006e:
            boolean r2 = r9.f7788z
            if (r2 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0018
            r9.m9454M()
        L_0x0077:
            r1 = 1
            goto L_0x0018
        L_0x0079:
            r9.m9453L(r5, r6)
            boolean r2 = r9.f7775E
            if (r2 != 0) goto L_0x0081
            goto L_0x0018
        L_0x0081:
            boolean r2 = r9.m9458Q(r5)
            if (r2 != 0) goto L_0x0088
            goto L_0x0018
        L_0x0088:
            boolean r1 = m9442A(r5)
            if (r1 == 0) goto L_0x00df
            boolean r1 = m9450I(r5, r6)
            if (r1 == 0) goto L_0x009e
            c.a.a.a.k2.n.c$a r1 = r9.f7783u
            char r2 = m9466w(r6)
            r1.mo7077e(r2)
            goto L_0x0077
        L_0x009e:
            boolean r1 = m9443B(r5, r6)
            if (r1 == 0) goto L_0x00b3
            c.a.a.a.k2.n.c$a r1 = r9.f7783u
            r1.mo7078f()
            c.a.a.a.k2.n.c$a r1 = r9.f7783u
            char r2 = m9465v(r5, r6)
            r1.mo7077e(r2)
            goto L_0x0077
        L_0x00b3:
            boolean r1 = m9444C(r5, r6)
            if (r1 == 0) goto L_0x00bd
            r9.m9467x(r6)
            goto L_0x0077
        L_0x00bd:
            boolean r1 = m9446E(r5, r6)
            if (r1 == 0) goto L_0x00c7
            r9.m9469z(r5, r6)
            goto L_0x0077
        L_0x00c7:
            boolean r1 = m9451J(r5, r6)
            if (r1 == 0) goto L_0x00d5
            c.a.a.a.k2.n.c$a r1 = r9.f7783u
            int r6 = r6 + -32
            r1.f7794f = r6
            goto L_0x0077
        L_0x00d5:
            boolean r1 = m9445D(r5, r6)
            if (r1 == 0) goto L_0x0077
            r9.m9468y(r6)
            goto L_0x0077
        L_0x00df:
            c.a.a.a.k2.n.c$a r1 = r9.f7783u
            char r2 = m9460q(r5)
            r1.mo7077e(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0077
            c.a.a.a.k2.n.c$a r1 = r9.f7783u
            char r2 = m9460q(r6)
            r1.mo7077e(r2)
            goto L_0x0077
        L_0x00f6:
            if (r1 == 0) goto L_0x010b
            int r10 = r9.f7786x
            if (r10 == r0) goto L_0x00ff
            r0 = 3
            if (r10 != r0) goto L_0x010b
        L_0x00ff:
            java.util.List r10 = r9.m9462s()
            r9.f7784v = r10
            long r0 = r9.mo7102k()
            r9.f7776F = r0
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p101n.Cea608Decoder.mo7072g(c.a.a.a.k2.j):void");
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ SubtitleInputBuffer mo7073h() throws SubtitleDecoderException {
        return super.mo5961e();
    }

    /* renamed from: i */
    public SubtitleOutputBuffer mo5960d() throws SubtitleDecoderException {
        SubtitleOutputBuffer i = super.mo5960d();
        if (i != null) {
            return i;
        }
        if (m9457P()) {
            SubtitleOutputBuffer j = mo7101j();
            if (j != null) {
                this.f7784v = Collections.emptyList();
                this.f7776F = -9223372036854775807L;
                SubtitleOutputBuffer kVar = j;
                kVar.mo7066o(mo7102k(), mo7071f(), Long.MAX_VALUE);
                return j;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo7075l() {
        return this.f7784v != this.f7785w;
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo7076m(SubtitleInputBuffer jVar) throws SubtitleDecoderException {
        super.mo5959c(jVar);
    }
}
