package p067c.p068a.p069a.p070a.p100k2.p109v;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.umeng.analytics.pro.UMCommonContent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p100k2.p104q.HorizontalTextInVerticalContextSpan;
import p067c.p068a.p069a.p070a.p100k2.p104q.RubySpan;
import p067c.p068a.p069a.p070a.p100k2.p104q.SpanUtil;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.v.h */
public final class WebvttCueParser {

    /* renamed from: a */
    public static final Pattern f8082a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f8083b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f8084c;

    /* renamed from: d */
    private static final Map<String, Integer> f8085d;

    /* renamed from: c.a.a.a.k2.v.h$b */
    /* compiled from: WebvttCueParser */
    private static class C1148b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Comparator<C1148b> f8086a = C1145a.f8055a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1149c f8087b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f8088c;

        private C1148b(C1149c cVar, int i) {
            this.f8087b = cVar;
            this.f8088c = i;
        }
    }

    /* renamed from: c.a.a.a.k2.v.h$c */
    /* compiled from: WebvttCueParser */
    private static final class C1149c {

        /* renamed from: a */
        public final String f8089a;

        /* renamed from: b */
        public final int f8090b;

        /* renamed from: c */
        public final String f8091c;

        /* renamed from: d */
        public final Set<String> f8092d;

        private C1149c(String str, int i, String str2, Set<String> set) {
            this.f8090b = i;
            this.f8089a = str;
            this.f8091c = str2;
            this.f8092d = set;
        }

        /* renamed from: a */
        public static C1149c m9803a(String str, int i) {
            String str2;
            String trim = str.trim();
            Assertions.m10149a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] D0 = Util.m10244D0(trim, "\\.");
            String str3 = D0[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < D0.length; i2++) {
                hashSet.add(D0[i2]);
            }
            return new C1149c(str3, i, str2, hashSet);
        }

        /* renamed from: b */
        public static C1149c m9804b() {
            String str = "";
            return new C1149c(str, 0, str, Collections.emptySet());
        }
    }

    /* renamed from: c.a.a.a.k2.v.h$d */
    /* compiled from: WebvttCueParser */
    private static final class C1150d implements Comparable<C1150d> {

        /* renamed from: a */
        public final int f8093a;

        /* renamed from: b */
        public final WebvttCssStyle f8094b;

        public C1150d(int i, WebvttCssStyle fVar) {
            this.f8093a = i;
            this.f8094b = fVar;
        }

        /* renamed from: a */
        public int compareTo(C1150d dVar) {
            return Integer.compare(this.f8093a, dVar.f8093a);
        }
    }

    /* renamed from: c.a.a.a.k2.v.h$e */
    /* compiled from: WebvttCueParser */
    private static final class C1151e {

        /* renamed from: a */
        public long f8095a = 0;

        /* renamed from: b */
        public long f8096b = 0;

        /* renamed from: c */
        public CharSequence f8097c;

        /* renamed from: d */
        public int f8098d = 2;

        /* renamed from: e */
        public float f8099e = -3.4028235E38f;

        /* renamed from: f */
        public int f8100f = 1;

        /* renamed from: g */
        public int f8101g = 0;

        /* renamed from: h */
        public float f8102h = -3.4028235E38f;

        /* renamed from: i */
        public int f8103i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f8104j = 1.0f;

        /* renamed from: k */
        public int f8105k = Integer.MIN_VALUE;

        /* renamed from: b */
        private static float m9806b(float f, int i) {
            if (f == -3.4028235E38f || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        private static Alignment m9807c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown textAlignment: ");
                            sb.append(i);
                            Log.m10386h("WebvttCueParser", sb.toString());
                            return null;
                        }
                    }
                }
                return Alignment.ALIGN_OPPOSITE;
            }
            return Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        private static float m9808d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        /* renamed from: e */
        private static float m9809e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        private static int m9810f(int i) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return 1;
                        }
                    }
                }
                return 2;
            }
            return 0;
        }

        /* renamed from: a */
        public WebvttCueInfo mo7183a() {
            WebvttCueInfo gVar = new WebvttCueInfo(mo7184g().mo7036a(), this.f8095a, this.f8096b);
            return gVar;
        }

        /* renamed from: g */
        public C1119b mo7184g() {
            float f = this.f8102h;
            if (f == -3.4028235E38f) {
                f = m9809e(this.f8098d);
            }
            int i = this.f8103i;
            if (i == Integer.MIN_VALUE) {
                i = m9810f(this.f8098d);
            }
            C1119b q = new C1119b().mo7050o(m9807c(this.f8098d)).mo7043h(m9806b(this.f8099e, this.f8100f), this.f8100f).mo7044i(this.f8101g).mo7045j(f).mo7046k(i).mo7048m(Math.min(this.f8104j, m9808d(i, f))).mo7052q(this.f8105k);
            CharSequence charSequence = this.f8097c;
            if (charSequence != null) {
                q.mo7049n(charSequence);
            }
            return q;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8084c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8085d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m9776a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f8084c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f8085d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m9777b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("ignoring unsupported entity: '&");
                sb.append(str);
                sb.append(";'");
                Log.m10386h("WebvttCueParser", sb.toString());
                return;
        }
    }

    /* renamed from: c */
    private static void m9778c(SpannableStringBuilder spannableStringBuilder, String str, C1149c cVar, List<C1148b> list, List<WebvttCssStyle> list2) {
        int i = m9784i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C1148b.f8086a);
        int i2 = cVar.f8090b;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if ("rt".equals(((C1148b) arrayList.get(i4)).f8087b.f8089a)) {
                C1148b bVar = (C1148b) arrayList.get(i4);
                int g = m9782g(m9784i(list2, str, bVar.f8087b), i, 1);
                int i5 = bVar.f8087b.f8090b - i3;
                int c = bVar.f8088c - i3;
                CharSequence subSequence = spannableStringBuilder.subSequence(i5, c);
                spannableStringBuilder.delete(i5, c);
                spannableStringBuilder.setSpan(new RubySpan(subSequence.toString(), g), i2, i5, 33);
                i3 += subSequence.length();
                i2 = i5;
            }
        }
    }

    /* renamed from: d */
    private static void m9779d(String str, C1149c cVar, List<C1148b> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        int i = cVar.f8090b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f8089a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals(UMCommonContent.f16580aD)) {
                    c = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals(UMCommonContent.f16577aA)) {
                    c = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals(UMCommonContent.f16581aE)) {
                    c = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals(UMCommonContent.f16579aC)) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                m9776a(spannableStringBuilder, cVar.f8092d, i, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                m9778c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List h = m9783h(list2, str, cVar);
        for (int i2 = 0; i2 < h.size(); i2++) {
            m9780e(spannableStringBuilder, ((C1150d) h.get(i2)).f8094b, i, length);
        }
    }

    /* renamed from: e */
    private static void m9780e(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle fVar, int i, int i2) {
        if (fVar != null) {
            if (fVar.mo7164i() != -1) {
                SpanUtil.m9602a(spannableStringBuilder, new StyleSpan(fVar.mo7164i()), i, i2, 33);
            }
            if (fVar.mo7167l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (fVar.mo7168m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (fVar.mo7166k()) {
                SpanUtil.m9602a(spannableStringBuilder, new ForegroundColorSpan(fVar.mo7158c()), i, i2, 33);
            }
            if (fVar.mo7165j()) {
                SpanUtil.m9602a(spannableStringBuilder, new BackgroundColorSpan(fVar.mo7156a()), i, i2, 33);
            }
            if (fVar.mo7159d() != null) {
                SpanUtil.m9602a(spannableStringBuilder, new TypefaceSpan(fVar.mo7159d()), i, i2, 33);
            }
            int f = fVar.mo7161f();
            if (f == 1) {
                SpanUtil.m9602a(spannableStringBuilder, new AbsoluteSizeSpan((int) fVar.mo7160e(), true), i, i2, 33);
            } else if (f == 2) {
                SpanUtil.m9602a(spannableStringBuilder, new RelativeSizeSpan(fVar.mo7160e()), i, i2, 33);
            } else if (f == 3) {
                SpanUtil.m9602a(spannableStringBuilder, new RelativeSizeSpan(fVar.mo7160e() / 100.0f), i, i2, 33);
            }
            if (fVar.mo7157b()) {
                spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i, i2, 33);
            }
        }
    }

    /* renamed from: f */
    private static int m9781f(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: g */
    private static int m9782g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static List<C1150d> m9783h(List<WebvttCssStyle> list, String str, C1149c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle fVar = (WebvttCssStyle) list.get(i);
            int h = fVar.mo7163h(str, cVar.f8089a, cVar.f8092d, cVar.f8091c);
            if (h > 0) {
                arrayList.add(new C1150d(h, fVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static int m9784i(List<WebvttCssStyle> list, String str, C1149c cVar) {
        List h = m9783h(list, str, cVar);
        for (int i = 0; i < h.size(); i++) {
            WebvttCssStyle fVar = ((C1150d) h.get(i)).f8094b;
            if (fVar.mo7162g() != -1) {
                return fVar.mo7162g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static String m9785j(String str) {
        String trim = str.trim();
        Assertions.m10149a(!trim.isEmpty());
        return Util.m10246E0(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    private static boolean m9786k(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals(UMCommonContent.f16580aD)) {
                    c = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals(UMCommonContent.f16577aA)) {
                    c = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals(UMCommonContent.f16581aE)) {
                    c = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals(UMCommonContent.f16579aC)) {
                    c = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    static Cue m9787l(CharSequence charSequence) {
        C1151e eVar = new C1151e();
        eVar.f8097c = charSequence;
        return eVar.mo7184g().mo7036a();
    }

    /* renamed from: m */
    public static WebvttCueInfo m9788m(ParsableByteArray a0Var, List<WebvttCssStyle> list) {
        String p = a0Var.mo7391p();
        if (p == null) {
            return null;
        }
        Pattern pattern = f8082a;
        Matcher matcher = pattern.matcher(p);
        if (matcher.matches()) {
            return m9789n(null, matcher, a0Var, list);
        }
        String p2 = a0Var.mo7391p();
        if (p2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(p2);
        if (matcher2.matches()) {
            return m9789n(p.trim(), matcher2, a0Var, list);
        }
        return null;
    }

    /* renamed from: n */
    private static WebvttCueInfo m9789n(String str, Matcher matcher, ParsableByteArray a0Var, List<WebvttCssStyle> list) {
        C1151e eVar = new C1151e();
        try {
            eVar.f8095a = WebvttParserUtil.m9819d((String) Assertions.m10153e(matcher.group(1)));
            eVar.f8096b = WebvttParserUtil.m9819d((String) Assertions.m10153e(matcher.group(2)));
            m9791p((String) Assertions.m10153e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String p = a0Var.mo7391p();
            while (!TextUtils.isEmpty(p)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(p.trim());
                p = a0Var.mo7391p();
            }
            eVar.f8097c = m9792q(str, sb.toString(), list);
            return eVar.mo7183a();
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            Log.m10386h("WebvttCueParser", sb2.toString());
            return null;
        }
    }

    /* renamed from: o */
    static C1119b m9790o(String str) {
        C1151e eVar = new C1151e();
        m9791p(str, eVar);
        return eVar.mo7184g();
    }

    /* renamed from: p */
    private static void m9791p(String str, C1151e eVar) {
        String str2 = "WebvttCueParser";
        Matcher matcher = f8083b.matcher(str);
        while (matcher.find()) {
            String str3 = (String) Assertions.m10153e(matcher.group(1));
            String str4 = (String) Assertions.m10153e(matcher.group(2));
            try {
                if ("line".equals(str3)) {
                    m9794s(str4, eVar);
                } else if ("align".equals(str3)) {
                    eVar.f8098d = m9797v(str4);
                } else if ("position".equals(str3)) {
                    m9796u(str4, eVar);
                } else if ("size".equals(str3)) {
                    eVar.f8104j = WebvttParserUtil.m9818c(str4);
                } else if ("vertical".equals(str3)) {
                    eVar.f8105k = m9798w(str4);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cue setting ");
                    sb.append(str3);
                    sb.append(":");
                    sb.append(str4);
                    Log.m10386h(str2, sb.toString());
                }
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipping bad cue setting: ");
                sb2.append(matcher.group());
                Log.m10386h(str2, sb2.toString());
            }
        }
    }

    /* renamed from: q */
    static SpannedString m9792q(String str, String str2, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m9777b(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m9781f(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String j = m9785j(substring);
                        if (m9786k(j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C1149c cVar = (C1149c) arrayDeque.pop();
                                    m9779d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new C1148b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f8089a.equals(j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C1149c.m9803a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m9779d(str, (C1149c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m9779d(str, C1149c.m9804b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    private static int m9793r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid anchor value: ");
                sb.append(str);
                Log.m10386h("WebvttCueParser", sb.toString());
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: s */
    private static void m9794s(String str, C1151e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f8101g = m9793r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f8099e = WebvttParserUtil.m9818c(str);
            eVar.f8100f = 0;
            return;
        }
        eVar.f8099e = (float) Integer.parseInt(str);
        eVar.f8100f = 1;
    }

    /* renamed from: t */
    private static int m9795t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid anchor value: ");
                sb.append(str);
                Log.m10386h("WebvttCueParser", sb.toString());
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: u */
    private static void m9796u(String str, C1151e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f8103i = m9795t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f8102h = WebvttParserUtil.m9818c(str);
    }

    /* renamed from: v */
    private static int m9797v(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid alignment value: ");
                sb.append(str);
                Log.m10386h("WebvttCueParser", sb.toString());
                return 2;
        }
    }

    /* renamed from: w */
    private static int m9798w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid 'vertical' value: ");
        sb.append(str);
        Log.m10386h("WebvttCueParser", sb.toString());
        return Integer.MIN_VALUE;
    }
}
