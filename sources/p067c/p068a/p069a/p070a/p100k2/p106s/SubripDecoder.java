package p067c.p068a.p069a.p070a.p100k2.p106s;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.SimpleSubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.LongArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.k2.s.a */
public final class SubripDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private static final Pattern f7969o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p */
    private static final Pattern f7970p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: q */
    private final StringBuilder f7971q = new StringBuilder();

    /* renamed from: r */
    private final ArrayList<String> f7972r = new ArrayList<>();

    public SubripDecoder() {
        super("SubripDecoder");
    }

    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p067c.p068a.p069a.p070a.p100k2.Cue m9633C(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            c.a.a.a.k2.c$b r1 = new c.a.a.a.k2.c$b
            r1.<init>()
            r2 = r17
            c.a.a.a.k2.c$b r1 = r1.mo7049n(r2)
            if (r0 != 0) goto L_0x0014
            c.a.a.a.k2.c r0 = r1.mo7036a()
            return r0
        L_0x0014:
            int r2 = r18.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r2) {
                case -685620710: goto L_0x0073;
                case -685620679: goto L_0x006b;
                case -685620648: goto L_0x0063;
                case -685620617: goto L_0x005b;
                case -685620586: goto L_0x0053;
                case -685620555: goto L_0x004b;
                case -685620524: goto L_0x0043;
                case -685620493: goto L_0x003a;
                case -685620462: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x007b
        L_0x0032:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003a:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x007b
            r2 = 8
            goto L_0x007c
        L_0x0043:
            boolean r2 = r0.equals(r8)
            if (r2 == 0) goto L_0x007b
            r2 = 2
            goto L_0x007c
        L_0x004b:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 4
            goto L_0x007c
        L_0x0053:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = 7
            goto L_0x007c
        L_0x005b:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x0063:
            boolean r2 = r0.equals(r12)
            if (r2 == 0) goto L_0x007b
            r2 = 3
            goto L_0x007c
        L_0x006b:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0073:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x0091
            if (r2 == r3) goto L_0x0091
            if (r2 == r15) goto L_0x0091
            if (r2 == r5) goto L_0x008d
            if (r2 == r4) goto L_0x008d
            r4 = 5
            if (r2 == r4) goto L_0x008d
            r1.mo7046k(r3)
            goto L_0x0095
        L_0x008d:
            r1.mo7046k(r15)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.mo7046k(r2)
        L_0x0095:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto L_0x00de;
                case -685620679: goto L_0x00d6;
                case -685620648: goto L_0x00ce;
                case -685620617: goto L_0x00c6;
                case -685620586: goto L_0x00be;
                case -685620555: goto L_0x00b5;
                case -685620524: goto L_0x00ad;
                case -685620493: goto L_0x00a5;
                case -685620462: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e6
        L_0x009d:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00a5:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x00ad:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e6
            r0 = 3
            goto L_0x00e7
        L_0x00b5:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x00be:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00c6:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00ce:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e6
            r0 = 2
            goto L_0x00e7
        L_0x00d6:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = 1
            goto L_0x00e7
        L_0x00de:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00fe
            if (r0 == r3) goto L_0x00fe
            if (r0 == r15) goto L_0x00fe
            if (r0 == r5) goto L_0x00f9
            r2 = 4
            if (r0 == r2) goto L_0x00f9
            r2 = 5
            if (r0 == r2) goto L_0x00f9
            r1.mo7044i(r3)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.mo7044i(r0)
            goto L_0x0101
        L_0x00fe:
            r1.mo7044i(r15)
        L_0x0101:
            int r0 = r1.mo7039d()
            float r0 = m9634D(r0)
            c.a.a.a.k2.c$b r0 = r1.mo7045j(r0)
            int r1 = r1.mo7038c()
            float r1 = m9634D(r1)
            r2 = 0
            c.a.a.a.k2.c$b r0 = r0.mo7043h(r1, r2)
            c.a.a.a.k2.c r0 = r0.mo7036a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p106s.SubripDecoder.m9633C(android.text.Spanned, java.lang.String):c.a.a.a.k2.c");
    }

    /* renamed from: D */
    static float m9634D(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: E */
    private static long m9635E(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0) + (Long.parseLong((String) Assertions.m10153e(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) Assertions.m10153e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* renamed from: F */
    private String m9636F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f7970p.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Subtitle mo7059z(byte[] bArr, int i, boolean z) {
        String str = "SubripDecoder";
        ArrayList arrayList = new ArrayList();
        LongArray uVar = new LongArray();
        ParsableByteArray a0Var = new ParsableByteArray(bArr, i);
        while (true) {
            String p = a0Var.mo7391p();
            int i2 = 0;
            if (p == null) {
                break;
            } else if (p.length() != 0) {
                try {
                    Integer.parseInt(p);
                    String p2 = a0Var.mo7391p();
                    if (p2 == null) {
                        Log.m10386h(str, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f7969o.matcher(p2);
                    if (matcher.matches()) {
                        uVar.mo7481a(m9635E(matcher, 1));
                        uVar.mo7481a(m9635E(matcher, 6));
                        this.f7971q.setLength(0);
                        this.f7972r.clear();
                        for (String p3 = a0Var.mo7391p(); !TextUtils.isEmpty(p3); p3 = a0Var.mo7391p()) {
                            if (this.f7971q.length() > 0) {
                                this.f7971q.append("<br>");
                            }
                            this.f7971q.append(m9636F(p3, this.f7972r));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f7971q.toString());
                        String str2 = null;
                        while (true) {
                            if (i2 >= this.f7972r.size()) {
                                break;
                            }
                            String str3 = (String) this.f7972r.get(i2);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str3;
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(m9633C(fromHtml, str2));
                        arrayList.add(Cue.f7707a);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Skipping invalid timing: ");
                        sb.append(p2);
                        Log.m10386h(str, sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Skipping invalid index: ");
                    sb2.append(p);
                    Log.m10386h(str, sb2.toString());
                }
            }
        }
        return new SubripSubtitle((Cue[]) arrayList.toArray(new Cue[0]), uVar.mo7484d());
    }
}
