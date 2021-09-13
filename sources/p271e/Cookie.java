package p271e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p271e.p272f0.C3310c;
import p271e.p272f0.p275g.HttpDate;

/* renamed from: e.l */
public final class Cookie {

    /* renamed from: a */
    private static final Pattern f18591a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: b */
    private static final Pattern f18592b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c */
    private static final Pattern f18593c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: d */
    private static final Pattern f18594d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: e */
    private final String f18595e;

    /* renamed from: f */
    private final String f18596f;

    /* renamed from: g */
    private final long f18597g;

    /* renamed from: h */
    private final String f18598h;

    /* renamed from: i */
    private final String f18599i;

    /* renamed from: j */
    private final boolean f18600j;

    /* renamed from: k */
    private final boolean f18601k;

    /* renamed from: l */
    private final boolean f18602l;

    /* renamed from: m */
    private final boolean f18603m;

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f18595e = str;
        this.f18596f = str2;
        this.f18597g = j;
        this.f18598h = str3;
        this.f18599i = str4;
        this.f18600j = z;
        this.f18601k = z2;
        this.f18603m = z3;
        this.f18602l = z4;
    }

    /* renamed from: a */
    private static int m23553a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    private static boolean m23554b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || C3310c.m23046I(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0128  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p271e.Cookie m23555d(long r23, p271e.HttpUrl r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = p271e.p272f0.C3310c.m23059m(r0, r2, r1, r3)
            r5 = 61
            int r6 = p271e.p272f0.C3310c.m23059m(r0, r2, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = p271e.p272f0.C3310c.m23045H(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0135
            int r8 = p271e.p272f0.C3310c.m23069w(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0135
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = p271e.p272f0.C3310c.m23045H(r0, r6, r4)
            int r11 = p271e.p272f0.C3310c.m23069w(r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r14 = r8
            r19 = r10
            r21 = r12
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
        L_0x004c:
            if (r4 >= r1) goto L_0x00ba
            int r7 = p271e.p272f0.C3310c.m23059m(r0, r4, r1, r3)
            int r3 = p271e.p272f0.C3310c.m23059m(r0, r4, r7, r5)
            java.lang.String r4 = p271e.p272f0.C3310c.m23045H(r0, r4, r3)
            if (r3 >= r7) goto L_0x0063
            int r3 = r3 + 1
            java.lang.String r3 = p271e.p272f0.C3310c.m23045H(r0, r3, r7)
            goto L_0x0065
        L_0x0063:
            java.lang.String r3 = ""
        L_0x0065:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            long r21 = m23559h(r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            goto L_0x0082
        L_0x0076:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            long r19 = m23560i(r3)     // Catch:{  }
        L_0x0082:
            r18 = 1
            goto L_0x00b2
        L_0x0085:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r14 = m23558g(r3)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r17 = 0
            goto L_0x00b2
        L_0x0094:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x009e
            r8 = r3
            goto L_0x00b2
        L_0x009e:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00a8
            r15 = 1
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00b2
            r16 = 1
        L_0x00b2:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L_0x004c
        L_0x00ba:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            r11 = r0
            goto L_0x00e7
        L_0x00c2:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00d4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00d9
        L_0x00d4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d9:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c0
        L_0x00e3:
            r11 = r12
            goto L_0x00e7
        L_0x00e5:
            r11 = r21
        L_0x00e7:
            java.lang.String r0 = r25.mo20075m()
            if (r14 != 0) goto L_0x00f0
            r13 = r0
            r1 = 0
            goto L_0x00fa
        L_0x00f0:
            boolean r1 = m23554b(r0, r14)
            if (r1 != 0) goto L_0x00f8
            r1 = 0
            return r1
        L_0x00f8:
            r1 = 0
            r13 = r14
        L_0x00fa:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L_0x010f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m24068c()
            java.lang.String r0 = r0.mo20311d(r13)
            if (r0 != 0) goto L_0x010f
            return r1
        L_0x010f:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x011c
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r14 = r8
            goto L_0x012d
        L_0x011c:
            java.lang.String r1 = r25.mo20070h()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L_0x012c
            java.lang.String r0 = r1.substring(r2, r3)
        L_0x012c:
            r14 = r0
        L_0x012d:
            e.l r0 = new e.l
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0135:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.Cookie.m23555d(long, e.t, java.lang.String):e.l");
    }

    /* renamed from: e */
    public static Cookie m23556e(HttpUrl tVar, String str) {
        return m23555d(System.currentTimeMillis(), tVar, str);
    }

    /* renamed from: f */
    public static List<Cookie> m23557f(HttpUrl tVar, C3370s sVar) {
        List i = sVar.mo20055i("Set-Cookie");
        int size = i.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            Cookie e = m23556e(tVar, (String) i.get(i2));
            if (e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: g */
    private static String m23558g(String str) {
        String str2 = ".";
        if (!str.endsWith(str2)) {
            if (str.startsWith(str2)) {
                str = str.substring(1);
            }
            String d = C3310c.m23050d(str);
            if (d != null) {
                return d;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static long m23559h(String str, int i, int i2) {
        int a = m23553a(str, i, i2, false);
        Matcher matcher = f18594d.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m23553a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f18594d).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(f18593c).matches()) {
                if (i6 == -1) {
                    Pattern pattern = f18592b;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f18591a).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a = m23553a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C3310c.f18101p);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* renamed from: i */
    private static long m23560i(String str) {
        long j = Long.MIN_VALUE;
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                j = parseLong;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                if (!str.startsWith("-")) {
                    j = Long.MAX_VALUE;
                }
                return j;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public String mo20004c() {
        return this.f18595e;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie lVar = (Cookie) obj;
        if (lVar.f18595e.equals(this.f18595e) && lVar.f18596f.equals(this.f18596f) && lVar.f18598h.equals(this.f18598h) && lVar.f18599i.equals(this.f18599i) && lVar.f18597g == this.f18597g && lVar.f18600j == this.f18600j && lVar.f18601k == this.f18601k && lVar.f18602l == this.f18602l && lVar.f18603m == this.f18603m) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f18595e.hashCode()) * 31) + this.f18596f.hashCode()) * 31) + this.f18598h.hashCode()) * 31) + this.f18599i.hashCode()) * 31;
        long j = this.f18597g;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.f18600j ^ true ? 1 : 0)) * 31) + (this.f18601k ^ true ? 1 : 0)) * 31) + (this.f18602l ^ true ? 1 : 0)) * 31) + (this.f18603m ^ true ? 1 : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public String mo20007j(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18595e);
        sb.append('=');
        sb.append(this.f18596f);
        if (this.f18602l) {
            if (this.f18597g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(HttpDate.m23166a(new Date(this.f18597g)));
            }
        }
        if (!this.f18603m) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f18598h);
        }
        sb.append("; path=");
        sb.append(this.f18599i);
        if (this.f18600j) {
            sb.append("; secure");
        }
        if (this.f18601k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: k */
    public String mo20008k() {
        return this.f18596f;
    }

    public String toString() {
        return mo20007j(false);
    }
}
