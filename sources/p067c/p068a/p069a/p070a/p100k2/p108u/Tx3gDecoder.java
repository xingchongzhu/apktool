package p067c.p068a.p069a.p070a.p100k2.p108u;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.umeng.analytics.pro.TType;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p100k2.SimpleSubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p135a.Charsets;

/* renamed from: c.a.a.a.k2.u.a */
public final class Tx3gDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private final ParsableByteArray f8046o = new ParsableByteArray();

    /* renamed from: p */
    private final boolean f8047p;

    /* renamed from: q */
    private final int f8048q;

    /* renamed from: r */
    private final int f8049r;

    /* renamed from: s */
    private final String f8050s;

    /* renamed from: t */
    private final float f8051t;

    /* renamed from: u */
    private final int f8052u;

    public Tx3gDecoder(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = true;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f8048q = bArr[24];
            this.f8049r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << TType.f16865n) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            if ("Serif".equals(Util.m10241C(bArr, 43, bArr.length - 43))) {
                str = "serif";
            }
            this.f8050s = str;
            int i = bArr[25] * 20;
            this.f8052u = i;
            if ((bArr[0] & 32) == 0) {
                z = false;
            }
            this.f8047p = z;
            if (z) {
                this.f8051t = Util.m10305o(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.0f, 0.95f);
                return;
            }
            this.f8051t = 0.85f;
            return;
        }
        this.f8048q = 0;
        this.f8049r = -1;
        this.f8050s = str;
        this.f8047p = false;
        this.f8051t = 0.85f;
        this.f8052u = -1;
    }

    /* renamed from: C */
    private void m9720C(ParsableByteArray a0Var, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        int i;
        m9721D(a0Var.mo7376a() >= 12);
        int J = a0Var.mo7368J();
        int J2 = a0Var.mo7368J();
        a0Var.mo7375Q(2);
        int D = a0Var.mo7362D();
        a0Var.mo7375Q(1);
        int n = a0Var.mo7389n();
        String str = ").";
        String str2 = "Tx3gDecoder";
        if (J2 > spannableStringBuilder.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Truncating styl end (");
            sb.append(J2);
            sb.append(") to cueText.length() (");
            sb.append(spannableStringBuilder.length());
            sb.append(str);
            Log.m10386h(str2, sb.toString());
            i = spannableStringBuilder.length();
        } else {
            i = J2;
        }
        if (J >= i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring styl with start (");
            sb2.append(J);
            sb2.append(") >= end (");
            sb2.append(i);
            sb2.append(str);
            Log.m10386h(str2, sb2.toString());
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i2 = J;
        int i3 = i;
        m9723F(spannableStringBuilder2, D, this.f8048q, i2, i3, 0);
        m9722E(spannableStringBuilder2, n, this.f8049r, i2, i3, 0);
    }

    /* renamed from: D */
    private static void m9721D(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    /* renamed from: E */
    private static void m9722E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: F */
    private static void m9723F(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: G */
    private static void m9724G(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* renamed from: H */
    private static String m9725H(ParsableByteArray a0Var) throws SubtitleDecoderException {
        m9721D(a0Var.mo7376a() >= 2);
        int J = a0Var.mo7368J();
        if (J == 0) {
            return "";
        }
        if (a0Var.mo7376a() >= 2) {
            char g = a0Var.mo7382g();
            if (g == 65279 || g == 65534) {
                return a0Var.mo7360B(J, Charsets.f9746f);
            }
        }
        return a0Var.mo7360B(J, Charsets.f9743c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Subtitle mo7059z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f8046o.mo7372N(bArr, i);
        String H = m9725H(this.f8046o);
        if (H.isEmpty()) {
            return Tx3gSubtitle.f8053a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m9723F(spannableStringBuilder2, this.f8048q, 0, 0, spannableStringBuilder.length(), 16711680);
        m9722E(spannableStringBuilder2, this.f8049r, -1, 0, spannableStringBuilder.length(), 16711680);
        m9724G(spannableStringBuilder, this.f8050s, 0, spannableStringBuilder.length());
        float f = this.f8051t;
        while (this.f8046o.mo7376a() >= 8) {
            int e = this.f8046o.mo7380e();
            int n = this.f8046o.mo7389n();
            int n2 = this.f8046o.mo7389n();
            boolean z2 = true;
            if (n2 == 1937013100) {
                if (this.f8046o.mo7376a() < 2) {
                    z2 = false;
                }
                m9721D(z2);
                int J = this.f8046o.mo7368J();
                for (int i2 = 0; i2 < J; i2++) {
                    m9720C(this.f8046o, spannableStringBuilder);
                }
            } else if (n2 == 1952608120 && this.f8047p) {
                if (this.f8046o.mo7376a() < 2) {
                    z2 = false;
                }
                m9721D(z2);
                f = Util.m10305o(((float) this.f8046o.mo7368J()) / ((float) this.f8052u), 0.0f, 0.95f);
            }
            this.f8046o.mo7374P(e + n);
        }
        return new Tx3gSubtitle(new C1119b().mo7049n(spannableStringBuilder).mo7043h(f, 0).mo7044i(0).mo7036a());
    }
}
