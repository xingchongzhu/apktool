package p010b.p034g.p041i;

import android.text.SpannableStringBuilder;
import com.umeng.analytics.pro.TType;
import java.util.Locale;

/* renamed from: b.g.i.a */
public final class BidiFormatter {

    /* renamed from: a */
    static final TextDirectionHeuristicCompat f4542a;

    /* renamed from: b */
    private static final String f4543b = Character.toString(8206);

    /* renamed from: c */
    private static final String f4544c = Character.toString(8207);

    /* renamed from: d */
    static final BidiFormatter f4545d;

    /* renamed from: e */
    static final BidiFormatter f4546e;

    /* renamed from: f */
    private final boolean f4547f;

    /* renamed from: g */
    private final int f4548g;

    /* renamed from: h */
    private final TextDirectionHeuristicCompat f4549h;

    /* renamed from: b.g.i.a$a */
    /* compiled from: BidiFormatter */
    public static final class C0600a {

        /* renamed from: a */
        private boolean f4550a;

        /* renamed from: b */
        private int f4551b;

        /* renamed from: c */
        private TextDirectionHeuristicCompat f4552c;

        public C0600a() {
            m5135c(BidiFormatter.m5126e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static BidiFormatter m5134b(boolean z) {
            return z ? BidiFormatter.f4546e : BidiFormatter.f4545d;
        }

        /* renamed from: c */
        private void m5135c(boolean z) {
            this.f4550a = z;
            this.f4552c = BidiFormatter.f4542a;
            this.f4551b = 2;
        }

        /* renamed from: a */
        public BidiFormatter mo4909a() {
            if (this.f4551b == 2 && this.f4552c == BidiFormatter.f4542a) {
                return m5134b(this.f4550a);
            }
            return new BidiFormatter(this.f4550a, this.f4551b, this.f4552c);
        }
    }

    /* renamed from: b.g.i.a$b */
    /* compiled from: BidiFormatter */
    private static class C0601b {

        /* renamed from: a */
        private static final byte[] f4553a = new byte[1792];

        /* renamed from: b */
        private final CharSequence f4554b;

        /* renamed from: c */
        private final boolean f4555c;

        /* renamed from: d */
        private final int f4556d;

        /* renamed from: e */
        private int f4557e;

        /* renamed from: f */
        private char f4558f;

        static {
            for (int i = 0; i < 1792; i++) {
                f4553a[i] = Character.getDirectionality(i);
            }
        }

        C0601b(CharSequence charSequence, boolean z) {
            this.f4554b = charSequence;
            this.f4555c = z;
            this.f4556d = charSequence.length();
        }

        /* renamed from: c */
        private static byte m5137c(char c) {
            return c < 1792 ? f4553a[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m5138f() {
            char charAt;
            int i = this.f4557e;
            do {
                int i2 = this.f4557e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4554b;
                int i3 = i2 - 1;
                this.f4557e = i3;
                charAt = charSequence.charAt(i3);
                this.f4558f = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f4557e = i;
            this.f4558f = ';';
            return TType.f16862k;
        }

        /* renamed from: g */
        private byte m5139g() {
            char charAt;
            do {
                int i = this.f4557e;
                if (i >= this.f4556d) {
                    break;
                }
                CharSequence charSequence = this.f4554b;
                this.f4557e = i + 1;
                charAt = charSequence.charAt(i);
                this.f4558f = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m5140h() {
            char charAt;
            int i = this.f4557e;
            while (true) {
                int i2 = this.f4557e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4554b;
                int i3 = i2 - 1;
                this.f4557e = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f4558f = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f4557e;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f4554b;
                        int i5 = i4 - 1;
                        this.f4557e = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f4558f = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f4557e = i;
            this.f4558f = '>';
            return TType.f16862k;
        }

        /* renamed from: i */
        private byte m5141i() {
            char charAt;
            int i = this.f4557e;
            while (true) {
                int i2 = this.f4557e;
                if (i2 < this.f4556d) {
                    CharSequence charSequence = this.f4554b;
                    this.f4557e = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f4558f = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f4557e;
                            if (i3 >= this.f4556d) {
                                break;
                            }
                            CharSequence charSequence2 = this.f4554b;
                            this.f4557e = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f4558f = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f4557e = i;
                    this.f4558f = '<';
                    return TType.f16862k;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public byte mo4910a() {
            char charAt = this.f4554b.charAt(this.f4557e - 1);
            this.f4558f = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f4554b, this.f4557e);
                this.f4557e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f4557e--;
            byte c = m5137c(this.f4558f);
            if (this.f4555c) {
                char c2 = this.f4558f;
                if (c2 == '>') {
                    c = m5140h();
                } else if (c2 == ';') {
                    c = m5138f();
                }
            }
            return c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public byte mo4911b() {
            char charAt = this.f4554b.charAt(this.f4557e);
            this.f4558f = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f4554b, this.f4557e);
                this.f4557e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f4557e++;
            byte c = m5137c(this.f4558f);
            if (this.f4555c) {
                char c2 = this.f4558f;
                if (c2 == '<') {
                    c = m5141i();
                } else if (c2 == '&') {
                    c = m5139g();
                }
            }
            return c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo4912d() {
            this.f4557e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f4557e < this.f4556d && i == 0) {
                byte b = mo4911b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f4557e > 0) {
                switch (mo4910a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4913e() {
            /*
                r7 = this;
                int r0 = r7.f4556d
                r7.f4557e = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f4557e
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo4910a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p034g.p041i.BidiFormatter.C0601b.mo4913e():int");
        }
    }

    static {
        TextDirectionHeuristicCompat dVar = TextDirectionHeuristicsCompat.f4576c;
        f4542a = dVar;
        f4545d = new BidiFormatter(false, 2, dVar);
        f4546e = new BidiFormatter(true, 2, dVar);
    }

    BidiFormatter(boolean z, int i, TextDirectionHeuristicCompat dVar) {
        this.f4547f = z;
        this.f4548g = i;
        this.f4549h = dVar;
    }

    /* renamed from: a */
    private static int m5123a(CharSequence charSequence) {
        return new C0601b(charSequence, false).mo4912d();
    }

    /* renamed from: b */
    private static int m5124b(CharSequence charSequence) {
        return new C0601b(charSequence, false).mo4913e();
    }

    /* renamed from: c */
    public static BidiFormatter m5125c() {
        return new C0600a().mo4909a();
    }

    /* renamed from: e */
    static boolean m5126e(Locale locale) {
        return TextUtilsCompat.m5172b(locale) == 1;
    }

    /* renamed from: f */
    private String m5127f(CharSequence charSequence, TextDirectionHeuristicCompat dVar) {
        boolean a = dVar.mo4939a(charSequence, 0, charSequence.length());
        if (this.f4547f || (!a && m5124b(charSequence) != 1)) {
            return (!this.f4547f || (a && m5124b(charSequence) != -1)) ? "" : f4544c;
        }
        return f4543b;
    }

    /* renamed from: g */
    private String m5128g(CharSequence charSequence, TextDirectionHeuristicCompat dVar) {
        boolean a = dVar.mo4939a(charSequence, 0, charSequence.length());
        if (this.f4547f || (!a && m5123a(charSequence) != 1)) {
            return (!this.f4547f || (a && m5123a(charSequence) != -1)) ? "" : f4544c;
        }
        return f4543b;
    }

    /* renamed from: d */
    public boolean mo4904d() {
        return (this.f4548g & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo4905h(CharSequence charSequence) {
        return mo4906i(charSequence, this.f4549h, true);
    }

    /* renamed from: i */
    public CharSequence mo4906i(CharSequence charSequence, TextDirectionHeuristicCompat dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo4939a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo4904d() && z) {
            spannableStringBuilder.append(m5128g(charSequence, a ? TextDirectionHeuristicsCompat.f4575b : TextDirectionHeuristicsCompat.f4574a));
        }
        if (a != this.f4547f) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m5127f(charSequence, a ? TextDirectionHeuristicsCompat.f4575b : TextDirectionHeuristicsCompat.f4574a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String mo4907j(String str) {
        return mo4908k(str, this.f4549h, true);
    }

    /* renamed from: k */
    public String mo4908k(String str, TextDirectionHeuristicCompat dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo4906i(str, dVar, z).toString();
    }
}
