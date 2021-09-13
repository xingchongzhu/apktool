package p271e;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import com.umeng.analytics.pro.TType;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p271e.p272f0.C3310c;
import p281f.C3383c;

/* renamed from: e.t */
public final class HttpUrl {

    /* renamed from: a */
    private static final char[] f18627a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    final String f18628b;

    /* renamed from: c */
    private final String f18629c;

    /* renamed from: d */
    private final String f18630d;

    /* renamed from: e */
    final String f18631e;

    /* renamed from: f */
    final int f18632f;

    /* renamed from: g */
    private final List<String> f18633g;

    /* renamed from: h */
    private final List<String> f18634h;

    /* renamed from: i */
    private final String f18635i;

    /* renamed from: j */
    private final String f18636j;

    /* renamed from: e.t$a */
    /* compiled from: HttpUrl */
    public static final class C3372a {

        /* renamed from: a */
        String f18637a;

        /* renamed from: b */
        String f18638b;

        /* renamed from: c */
        String f18639c;

        /* renamed from: d */
        String f18640d;

        /* renamed from: e */
        int f18641e = -1;

        /* renamed from: f */
        final List<String> f18642f;

        /* renamed from: g */
        List<String> f18643g;

        /* renamed from: h */
        String f18644h;

        public C3372a() {
            String str = "";
            this.f18638b = str;
            this.f18639c = str;
            ArrayList arrayList = new ArrayList();
            this.f18642f = arrayList;
            arrayList.add(str);
        }

        /* renamed from: c */
        private static String m23659c(String str, int i, int i2) {
            return C3310c.m23050d(HttpUrl.m23638t(str, i, i2, false));
        }

        /* renamed from: g */
        private boolean m23660g(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: h */
        private boolean m23661h(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: j */
        private static int m23662j(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(HttpUrl.m23629a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: l */
        private void m23663l() {
            List<String> list = this.f18642f;
            String str = "";
            if (!((String) list.remove(list.size() - 1)).isEmpty() || this.f18642f.isEmpty()) {
                this.f18642f.add(str);
                return;
            }
            List<String> list2 = this.f18642f;
            list2.set(list2.size() - 1, str);
        }

        /* renamed from: n */
        private static int m23664n(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: o */
        private void m23665o(String str, int i, int i2, boolean z, boolean z2) {
            String a = HttpUrl.m23629a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (!m23660g(a)) {
                if (m23661h(a)) {
                    m23663l();
                    return;
                }
                List<String> list = this.f18642f;
                if (((String) list.get(list.size() - 1)).isEmpty()) {
                    List<String> list2 = this.f18642f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f18642f.add(a);
                }
                if (z) {
                    this.f18642f.add("");
                }
            }
        }

        /* renamed from: q */
        private void m23666q(String str) {
            for (int size = this.f18643g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f18643g.get(size))) {
                    this.f18643g.remove(size + 1);
                    this.f18643g.remove(size);
                    if (this.f18643g.isEmpty()) {
                        this.f18643g = null;
                        return;
                    }
                }
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: s */
        private void m23667s(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f18642f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f18642f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f18642f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p271e.p272f0.C3310c.m23060n(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m23665o(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.HttpUrl.C3372a.m23667s(java.lang.String, int, int):void");
        }

        /* renamed from: u */
        private static int m23668u(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: v */
        private static int m23669v(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: a */
        public C3372a mo20082a(String str, String str2) {
            String str3;
            Objects.requireNonNull(str, "name == null");
            if (this.f18643g == null) {
                this.f18643g = new ArrayList();
            }
            this.f18643g.add(HttpUrl.m23630b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            List<String> list = this.f18643g;
            if (str2 != null) {
                str3 = HttpUrl.m23630b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            } else {
                str3 = null;
            }
            list.add(str3);
            return this;
        }

        /* renamed from: b */
        public HttpUrl mo20083b() {
            if (this.f18637a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f18640d != null) {
                return new HttpUrl(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo20084d() {
            int i = this.f18641e;
            return i != -1 ? i : HttpUrl.m23633e(this.f18637a);
        }

        /* renamed from: e */
        public C3372a mo20085e(String str) {
            List<String> list;
            if (str != null) {
                list = HttpUrl.m23628A(HttpUrl.m23630b(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f18643g = list;
            return this;
        }

        /* renamed from: f */
        public C3372a mo20086f(String str) {
            Objects.requireNonNull(str, "host == null");
            String c = m23659c(str, 0, str.length());
            if (c != null) {
                this.f18640d = c;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected host: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public C3372a mo20087i(HttpUrl tVar, String str) {
            int n;
            int i;
            HttpUrl tVar2 = tVar;
            String str2 = str;
            int D = C3310c.m23041D(str2, 0, str.length());
            int E = C3310c.m23042E(str2, D, str.length());
            int u = m23668u(str2, D, E);
            if (u != -1) {
                if (str.regionMatches(true, D, "https:", 0, 6)) {
                    this.f18637a = "https";
                    D += 6;
                } else {
                    if (str.regionMatches(true, D, "http:", 0, 5)) {
                        this.f18637a = "http";
                        D += 5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        sb.append(str2.substring(0, u));
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (tVar2 != null) {
                this.f18637a = tVar2.f18628b;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int v = m23669v(str2, D, E);
            char c = '?';
            char c2 = '#';
            if (v >= 2 || tVar2 == null || !tVar2.f18628b.equals(this.f18637a)) {
                int i2 = D + v;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    n = C3310c.m23060n(str2, i2, E, "@/\\?#");
                    char charAt = n != E ? str2.charAt(n) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = n;
                        int n2 = m23664n(str2, i2, i3);
                        int i4 = n2 + 1;
                    } else {
                        if (charAt == '@') {
                            String str3 = "%40";
                            if (!z) {
                                int m = C3310c.m23059m(str2, i2, n, ':');
                                int i5 = m;
                                String str4 = str3;
                                i = n;
                                String a = HttpUrl.m23629a(str, i2, m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (z2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.f18638b);
                                    sb2.append(str4);
                                    sb2.append(a);
                                    a = sb2.toString();
                                }
                                this.f18638b = a;
                                if (i5 != i) {
                                    this.f18639c = HttpUrl.m23629a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                String str5 = str3;
                                i = n;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.f18639c);
                                sb3.append(str5);
                                sb3.append(HttpUrl.m23629a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                this.f18639c = sb3.toString();
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = n;
                int n22 = m23664n(str2, i2, i32);
                int i42 = n22 + 1;
                if (i42 < i32) {
                    this.f18640d = m23659c(str2, i2, n22);
                    int j = m23662j(str2, i42, i32);
                    this.f18641e = j;
                    if (j == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        sb4.append(str2.substring(i42, i32));
                        sb4.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    this.f18640d = m23659c(str2, i2, n22);
                    this.f18641e = HttpUrl.m23633e(this.f18637a);
                }
                if (this.f18640d != null) {
                    D = i32;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    sb5.append(str2.substring(i2, n22));
                    sb5.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                this.f18638b = tVar.mo20074k();
                this.f18639c = tVar.mo20069g();
                this.f18640d = tVar2.f18631e;
                this.f18641e = tVar2.f18632f;
                this.f18642f.clear();
                this.f18642f.addAll(tVar.mo20072i());
                if (D == E || str2.charAt(D) == '#') {
                    mo20085e(tVar.mo20073j());
                }
            }
            int n3 = C3310c.m23060n(str2, D, E, "?#");
            m23667s(str2, D, n3);
            if (n3 < E && str2.charAt(n3) == '?') {
                int m2 = C3310c.m23059m(str2, n3, E, '#');
                this.f18643g = HttpUrl.m23628A(HttpUrl.m23629a(str, n3 + 1, m2, " \"'<>#", true, false, true, true, null));
                n3 = m2;
            }
            if (n3 < E && str2.charAt(n3) == '#') {
                this.f18644h = HttpUrl.m23629a(str, 1 + n3, E, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: k */
        public C3372a mo20088k(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f18639c = HttpUrl.m23630b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: m */
        public C3372a mo20089m(int i) {
            if (i <= 0 || i > 65535) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected port: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f18641e = i;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public C3372a mo20090p() {
            int size = this.f18642f.size();
            for (int i = 0; i < size; i++) {
                this.f18642f.set(i, HttpUrl.m23630b((String) this.f18642f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f18643g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = (String) this.f18643g.get(i2);
                    if (str != null) {
                        this.f18643g.set(i2, HttpUrl.m23630b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f18644h;
            if (str2 != null) {
                this.f18644h = HttpUrl.m23630b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: r */
        public C3372a mo20091r(String str) {
            Objects.requireNonNull(str, "name == null");
            if (this.f18643g == null) {
                return this;
            }
            m23666q(HttpUrl.m23630b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        /* renamed from: t */
        public C3372a mo20092t(String str) {
            Objects.requireNonNull(str, "scheme == null");
            String str2 = "http";
            if (str.equalsIgnoreCase(str2)) {
                this.f18637a = str2;
            } else {
                String str3 = "https";
                if (str.equalsIgnoreCase(str3)) {
                    this.f18637a = str3;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected scheme: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f18637a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f18638b.isEmpty() || !this.f18639c.isEmpty()) {
                sb.append(this.f18638b);
                if (!this.f18639c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f18639c);
                }
                sb.append('@');
            }
            String str2 = this.f18640d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f18640d);
                    sb.append(']');
                } else {
                    sb.append(this.f18640d);
                }
            }
            if (!(this.f18641e == -1 && this.f18637a == null)) {
                int d = mo20084d();
                String str3 = this.f18637a;
                if (str3 == null || d != HttpUrl.m23633e(str3)) {
                    sb.append(':');
                    sb.append(d);
                }
            }
            HttpUrl.m23637s(sb, this.f18642f);
            if (this.f18643g != null) {
                sb.append('?');
                HttpUrl.m23635o(sb, this.f18643g);
            }
            if (this.f18644h != null) {
                sb.append('#');
                sb.append(this.f18644h);
            }
            return sb.toString();
        }

        /* renamed from: w */
        public C3372a mo20094w(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f18638b = HttpUrl.m23630b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
    }

    HttpUrl(C3372a aVar) {
        this.f18628b = aVar.f18637a;
        this.f18629c = m23639u(aVar.f18638b, false);
        this.f18630d = m23639u(aVar.f18639c, false);
        this.f18631e = aVar.f18640d;
        this.f18632f = aVar.mo20084d();
        this.f18633g = m23640v(aVar.f18642f, false);
        List<String> list = aVar.f18643g;
        String str = null;
        this.f18634h = list != null ? m23640v(list, true) : null;
        String str2 = aVar.f18644h;
        if (str2 != null) {
            str = m23639u(str2, false);
        }
        this.f18635i = str;
        this.f18636j = aVar.toString();
    }

    /* renamed from: A */
    static List<String> m23628A(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: a */
    static String m23629a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m23642x(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C3383c cVar = new C3383c();
            int i5 = i;
            cVar.mo20213j0(str, i, i4);
            m23632d(cVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return cVar.mo20183N();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: b */
    static String m23630b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m23629a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* renamed from: c */
    static String m23631c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m23629a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: d */
    static void m23632d(C3383c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C3383c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.mo20232w(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m23642x(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new C3383c();
                    }
                    if (charset == null || charset.equals(C3310c.f18095j)) {
                        cVar2.mo20215k0(codePointAt);
                    } else {
                        cVar2.mo20205g0(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!cVar2.mo20217m()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo20218n(37);
                        char[] cArr = f18627a;
                        cVar.mo20218n(cArr[(readByte >> 4) & 15]);
                        cVar.mo20218n(cArr[readByte & TType.f16864m]);
                    }
                } else {
                    cVar.mo20215k0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: e */
    public static int m23633e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: l */
    public static HttpUrl m23634l(String str) {
        return new C3372a().mo20087i(null, str).mo20083b();
    }

    /* renamed from: o */
    static void m23635o(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: r */
    public static HttpUrl m23636r(String str) {
        try {
            return m23634l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: s */
    static void m23637s(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(JsonPointer.SEPARATOR);
            sb.append((String) list.get(i));
        }
    }

    /* renamed from: t */
    static String m23638t(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C3383c cVar = new C3383c();
                cVar.mo20213j0(str, i, i3);
                m23641w(cVar, str, i3, i2, z);
                return cVar.mo20183N();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: u */
    static String m23639u(String str, boolean z) {
        return m23638t(str, 0, str.length(), z);
    }

    /* renamed from: v */
    private List<String> m23640v(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? m23639u(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: w */
    static void m23641w(C3383c cVar, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int j = C3310c.m23056j(str.charAt(i + 1));
                    int j2 = C3310c.m23056j(str.charAt(i3));
                    if (!(j == -1 || j2 == -1)) {
                        cVar.mo20218n((j << 4) + j2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    cVar.mo20215k0(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                cVar.mo20218n(32);
                i += Character.charCount(codePointAt);
            }
            cVar.mo20215k0(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: x */
    static boolean m23642x(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C3310c.m23056j(str.charAt(i + 1)) == -1 || C3310c.m23056j(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public String mo20063B() {
        String str = "";
        return mo20078q("/...").mo20094w(str).mo20088k(str).mo20083b().toString();
    }

    /* renamed from: C */
    public HttpUrl mo20064C(String str) {
        C3372a q = mo20078q(str);
        if (q != null) {
            return q.mo20083b();
        }
        return null;
    }

    /* renamed from: D */
    public String mo20065D() {
        return this.f18628b;
    }

    /* renamed from: E */
    public URI mo20066E() {
        String aVar = mo20077p().mo20090p().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).f18636j.equals(this.f18636j);
    }

    /* renamed from: f */
    public String mo20068f() {
        if (this.f18635i == null) {
            return null;
        }
        return this.f18636j.substring(this.f18636j.indexOf(35) + 1);
    }

    /* renamed from: g */
    public String mo20069g() {
        if (this.f18630d.isEmpty()) {
            return "";
        }
        return this.f18636j.substring(this.f18636j.indexOf(58, this.f18628b.length() + 3) + 1, this.f18636j.indexOf(64));
    }

    /* renamed from: h */
    public String mo20070h() {
        int indexOf = this.f18636j.indexOf(47, this.f18628b.length() + 3);
        String str = this.f18636j;
        return this.f18636j.substring(indexOf, C3310c.m23060n(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f18636j.hashCode();
    }

    /* renamed from: i */
    public List<String> mo20072i() {
        int indexOf = this.f18636j.indexOf(47, this.f18628b.length() + 3);
        String str = this.f18636j;
        int n = C3310c.m23060n(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < n) {
            int i = indexOf + 1;
            int m = C3310c.m23059m(this.f18636j, i, n, JsonPointer.SEPARATOR);
            arrayList.add(this.f18636j.substring(i, m));
            indexOf = m;
        }
        return arrayList;
    }

    /* renamed from: j */
    public String mo20073j() {
        if (this.f18634h == null) {
            return null;
        }
        int indexOf = this.f18636j.indexOf(63) + 1;
        String str = this.f18636j;
        return this.f18636j.substring(indexOf, C3310c.m23059m(str, indexOf, str.length(), '#'));
    }

    /* renamed from: k */
    public String mo20074k() {
        if (this.f18629c.isEmpty()) {
            return "";
        }
        int length = this.f18628b.length() + 3;
        String str = this.f18636j;
        return this.f18636j.substring(length, C3310c.m23060n(str, length, str.length(), ":@"));
    }

    /* renamed from: m */
    public String mo20075m() {
        return this.f18631e;
    }

    /* renamed from: n */
    public boolean mo20076n() {
        return this.f18628b.equals("https");
    }

    /* renamed from: p */
    public C3372a mo20077p() {
        C3372a aVar = new C3372a();
        aVar.f18637a = this.f18628b;
        aVar.f18638b = mo20074k();
        aVar.f18639c = mo20069g();
        aVar.f18640d = this.f18631e;
        aVar.f18641e = this.f18632f != m23633e(this.f18628b) ? this.f18632f : -1;
        aVar.f18642f.clear();
        aVar.f18642f.addAll(mo20072i());
        aVar.mo20085e(mo20073j());
        aVar.f18644h = mo20068f();
        return aVar;
    }

    /* renamed from: q */
    public C3372a mo20078q(String str) {
        try {
            return new C3372a().mo20087i(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f18636j;
    }

    /* renamed from: y */
    public int mo20080y() {
        return this.f18632f;
    }

    /* renamed from: z */
    public String mo20081z() {
        if (this.f18634h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m23635o(sb, this.f18634h);
        return sb.toString();
    }
}
