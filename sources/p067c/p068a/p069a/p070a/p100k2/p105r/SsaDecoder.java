package p067c.p068a.p069a.p070a.p100k2.p105r;

import android.graphics.PointF;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p100k2.SimpleSubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.r.a */
public final class SsaDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private static final Pattern f7937o = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: p */
    private final boolean f7938p;

    /* renamed from: q */
    private final SsaDialogueFormat f7939q;

    /* renamed from: r */
    private Map<String, SsaStyle> f7940r;

    /* renamed from: s */
    private float f7941s = -3.4028235E38f;

    /* renamed from: t */
    private float f7942t = -3.4028235E38f;

    public SsaDecoder(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f7938p = false;
            this.f7939q = null;
            return;
        }
        this.f7938p = true;
        String B = Util.m10239B((byte[]) list.get(0));
        Assertions.m10149a(B.startsWith("Format:"));
        this.f7939q = (SsaDialogueFormat) Assertions.m10153e(SsaDialogueFormat.m9616a(B));
        m9608H(new ParsableByteArray((byte[]) list.get(1)));
    }

    /* renamed from: C */
    private static int m9603C(long j, List<Long> list, List<List<Cue>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (((Long) list.get(size)).longValue() == j) {
                return size;
            } else {
                if (((Long) list.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    /* renamed from: D */
    private static float m9604D(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* renamed from: E */
    private static Cue m9605E(String str, SsaStyle cVar, C1141b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        C1119b n = new C1119b().mo7049n(spannableString);
        if (cVar != null) {
            if (cVar.f7950c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f7950c.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = cVar.f7951d;
            if (!(f3 == -3.4028235E38f || f2 == -3.4028235E38f)) {
                n.mo7051p(f3 / f2, 1);
            }
            boolean z = cVar.f7952e;
            if (z && cVar.f7953f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f7953f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.f7965e;
        if (i == -1) {
            i = cVar != null ? cVar.f7949b : -1;
        }
        n.mo7050o(m9614N(i)).mo7046k(m9613M(i)).mo7044i(m9612L(i));
        PointF pointF = bVar.f7966f;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            n.mo7045j(m9604D(n.mo7039d()));
            n.mo7043h(m9604D(n.mo7038c()), 0);
        } else {
            n.mo7045j(pointF.x / f);
            n.mo7043h(bVar.f7966f.y / f2, 0);
        }
        return n.mo7036a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c3 A[LOOP:0: B:19:0x00c1->B:20:0x00c3, LOOP_END] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9606F(java.lang.String r11, p067c.p068a.p069a.p070a.p100k2.p105r.SsaDialogueFormat r12, java.util.List<java.util.List<p067c.p068a.p069a.p070a.p100k2.Cue>> r13, java.util.List<java.lang.Long> r14) {
        /*
            r10 = this;
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r11.startsWith(r0)
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10149a(r0)
            r0 = 9
            java.lang.String r0 = r11.substring(r0)
            int r1 = r12.f7947e
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2, r1)
            int r1 = r0.length
            int r2 = r12.f7947e
            java.lang.String r3 = "SsaDecoder"
            if (r1 == r2) goto L_0x0033
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Skipping dialogue line with fewer columns than format: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r11)
            return
        L_0x0033:
            int r1 = r12.f7943a
            r1 = r0[r1]
            long r1 = m9611K(r1)
            java.lang.String r4 = "Skipping invalid timing: "
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0059
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r11)
            return
        L_0x0059:
            int r7 = r12.f7944b
            r7 = r0[r7]
            long r7 = m9611K(r7)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0078
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r11)
            return
        L_0x0078:
            java.util.Map<java.lang.String, c.a.a.a.k2.r.c> r11 = r10.f7940r
            if (r11 == 0) goto L_0x008e
            int r3 = r12.f7945c
            r4 = -1
            if (r3 == r4) goto L_0x008e
            r3 = r0[r3]
            java.lang.String r3 = r3.trim()
            java.lang.Object r11 = r11.get(r3)
            c.a.a.a.k2.r.c r11 = (p067c.p068a.p069a.p070a.p100k2.p105r.SsaStyle) r11
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            int r12 = r12.f7946d
            r12 = r0[r12]
            c.a.a.a.k2.r.c$b r0 = p067c.p068a.p069a.p070a.p100k2.p105r.SsaStyle.C1141b.m9626b(r12)
            java.lang.String r12 = p067c.p068a.p069a.p070a.p100k2.p105r.SsaStyle.C1141b.m9628d(r12)
            java.lang.String r3 = "\\N"
            java.lang.String r4 = "\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\h"
            java.lang.String r4 = " "
            java.lang.String r12 = r12.replace(r3, r4)
            float r3 = r10.f7941s
            float r4 = r10.f7942t
            c.a.a.a.k2.c r11 = m9605E(r12, r11, r0, r3, r4)
            int r12 = m9603C(r1, r14, r13)
            int r14 = m9603C(r7, r14, r13)
        L_0x00c1:
            if (r12 >= r14) goto L_0x00cf
            java.lang.Object r0 = r13.get(r12)
            java.util.List r0 = (java.util.List) r0
            r0.add(r11)
            int r12 = r12 + 1
            goto L_0x00c1
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p105r.SsaDecoder.m9606F(java.lang.String, c.a.a.a.k2.r.b, java.util.List, java.util.List):void");
    }

    /* renamed from: G */
    private void m9607G(ParsableByteArray a0Var, List<List<Cue>> list, List<Long> list2) {
        SsaDialogueFormat bVar = this.f7938p ? this.f7939q : null;
        while (true) {
            String p = a0Var.mo7391p();
            if (p == null) {
                return;
            }
            if (p.startsWith("Format:")) {
                bVar = SsaDialogueFormat.m9616a(p);
            } else if (p.startsWith("Dialogue:")) {
                if (bVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Skipping dialogue line before complete format: ");
                    sb.append(p);
                    Log.m10386h("SsaDecoder", sb.toString());
                } else {
                    m9606F(p, bVar, list, list2);
                }
            }
        }
    }

    /* renamed from: H */
    private void m9608H(ParsableByteArray a0Var) {
        while (true) {
            String p = a0Var.mo7391p();
            if (p == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(p)) {
                m9609I(a0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(p)) {
                this.f7940r = m9610J(a0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(p)) {
                Log.m10384f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(p)) {
                return;
            }
        }
    }

    /* renamed from: I */
    private void m9609I(ParsableByteArray a0Var) {
        while (true) {
            String p = a0Var.mo7391p();
            if (p == null) {
                return;
            }
            if (a0Var.mo7376a() == 0 || a0Var.mo7383h() != 91) {
                String[] split = p.split(":");
                if (split.length == 2) {
                    String J0 = Util.m10256J0(split[0].trim());
                    J0.hashCode();
                    if (J0.equals("playresx")) {
                        this.f7941s = Float.parseFloat(split[1].trim());
                    } else if (J0.equals("playresy")) {
                        try {
                            this.f7942t = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: J */
    private static Map<String, SsaStyle> m9610J(ParsableByteArray a0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1140a aVar = null;
        while (true) {
            String p = a0Var.mo7391p();
            if (p == null || (a0Var.mo7376a() != 0 && a0Var.mo7383h() == 91)) {
                return linkedHashMap;
            }
            if (p.startsWith("Format:")) {
                aVar = C1140a.m9624a(p);
            } else if (p.startsWith("Style:")) {
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Skipping 'Style:' line before 'Format:' line: ");
                    sb.append(p);
                    Log.m10386h("SsaDecoder", sb.toString());
                } else {
                    SsaStyle b = SsaStyle.m9618b(p, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.f7948a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: K */
    private static long m9611K(String str) {
        Matcher matcher = f7937o.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) Util.m10293i(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) Util.m10293i(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) Util.m10293i(matcher.group(3))) * 1000000) + (Long.parseLong((String) Util.m10293i(matcher.group(4))) * 10000);
    }

    /* renamed from: L */
    private static int m9612L(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown alignment: ");
                sb.append(i);
                Log.m10386h("SsaDecoder", sb.toString());
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: M */
    private static int m9613M(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown alignment: ");
                sb.append(i);
                Log.m10386h("SsaDecoder", sb.toString());
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: N */
    private static Alignment m9614N(int i) {
        switch (i) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Alignment.ALIGN_OPPOSITE;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown alignment: ");
                sb.append(i);
                Log.m10386h("SsaDecoder", sb.toString());
                return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Subtitle mo7059z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray a0Var = new ParsableByteArray(bArr, i);
        if (!this.f7938p) {
            m9608H(a0Var);
        }
        m9607G(a0Var, arrayList, arrayList2);
        return new SsaSubtitle(arrayList, arrayList2);
    }
}
