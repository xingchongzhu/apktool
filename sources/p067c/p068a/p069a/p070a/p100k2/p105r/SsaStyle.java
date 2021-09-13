package p067c.p068a.p069a.p070a.p100k2.p105r;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p137c.Ints;

/* renamed from: c.a.a.a.k2.r.c */
final class SsaStyle {

    /* renamed from: a */
    public final String f7948a;

    /* renamed from: b */
    public final int f7949b;

    /* renamed from: c */
    public final Integer f7950c;

    /* renamed from: d */
    public final float f7951d;

    /* renamed from: e */
    public final boolean f7952e;

    /* renamed from: f */
    public final boolean f7953f;

    /* renamed from: c.a.a.a.k2.r.c$a */
    /* compiled from: SsaStyle */
    static final class C1140a {

        /* renamed from: a */
        public final int f7954a;

        /* renamed from: b */
        public final int f7955b;

        /* renamed from: c */
        public final int f7956c;

        /* renamed from: d */
        public final int f7957d;

        /* renamed from: e */
        public final int f7958e;

        /* renamed from: f */
        public final int f7959f;

        /* renamed from: g */
        public final int f7960g;

        private C1140a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f7954a = i;
            this.f7955b = i2;
            this.f7956c = i3;
            this.f7957d = i4;
            this.f7958e = i5;
            this.f7959f = i6;
            this.f7960g = i7;
        }

        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p067c.p068a.p069a.p070a.p100k2.p105r.SsaStyle.C1140a m9624a(java.lang.String r11) {
            /*
                r0 = 7
                java.lang.String r11 = r11.substring(r0)
                java.lang.String r0 = ","
                java.lang.String[] r11 = android.text.TextUtils.split(r11, r0)
                r0 = 0
                r1 = -1
                r2 = 0
                r4 = -1
                r5 = -1
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
            L_0x0014:
                int r3 = r11.length
                if (r2 >= r3) goto L_0x0080
                r3 = r11[r2]
                java.lang.String r3 = r3.trim()
                java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r3)
                r3.hashCode()
                int r10 = r3.hashCode()
                switch(r10) {
                    case -1178781136: goto L_0x0064;
                    case -70925746: goto L_0x0059;
                    case 3029637: goto L_0x004e;
                    case 3373707: goto L_0x0043;
                    case 366554320: goto L_0x0038;
                    case 1767875043: goto L_0x002d;
                    default: goto L_0x002b;
                }
            L_0x002b:
                r3 = -1
                goto L_0x006e
            L_0x002d:
                java.lang.String r10 = "alignment"
                boolean r3 = r3.equals(r10)
                if (r3 != 0) goto L_0x0036
                goto L_0x002b
            L_0x0036:
                r3 = 5
                goto L_0x006e
            L_0x0038:
                java.lang.String r10 = "fontsize"
                boolean r3 = r3.equals(r10)
                if (r3 != 0) goto L_0x0041
                goto L_0x002b
            L_0x0041:
                r3 = 4
                goto L_0x006e
            L_0x0043:
                java.lang.String r10 = "name"
                boolean r3 = r3.equals(r10)
                if (r3 != 0) goto L_0x004c
                goto L_0x002b
            L_0x004c:
                r3 = 3
                goto L_0x006e
            L_0x004e:
                java.lang.String r10 = "bold"
                boolean r3 = r3.equals(r10)
                if (r3 != 0) goto L_0x0057
                goto L_0x002b
            L_0x0057:
                r3 = 2
                goto L_0x006e
            L_0x0059:
                java.lang.String r10 = "primarycolour"
                boolean r3 = r3.equals(r10)
                if (r3 != 0) goto L_0x0062
                goto L_0x002b
            L_0x0062:
                r3 = 1
                goto L_0x006e
            L_0x0064:
                java.lang.String r10 = "italic"
                boolean r3 = r3.equals(r10)
                if (r3 != 0) goto L_0x006d
                goto L_0x002b
            L_0x006d:
                r3 = 0
            L_0x006e:
                switch(r3) {
                    case 0: goto L_0x007c;
                    case 1: goto L_0x007a;
                    case 2: goto L_0x0078;
                    case 3: goto L_0x0076;
                    case 4: goto L_0x0074;
                    case 5: goto L_0x0072;
                    default: goto L_0x0071;
                }
            L_0x0071:
                goto L_0x007d
            L_0x0072:
                r5 = r2
                goto L_0x007d
            L_0x0074:
                r7 = r2
                goto L_0x007d
            L_0x0076:
                r4 = r2
                goto L_0x007d
            L_0x0078:
                r8 = r2
                goto L_0x007d
            L_0x007a:
                r6 = r2
                goto L_0x007d
            L_0x007c:
                r9 = r2
            L_0x007d:
                int r2 = r2 + 1
                goto L_0x0014
            L_0x0080:
                if (r4 == r1) goto L_0x008a
                c.a.a.a.k2.r.c$a r0 = new c.a.a.a.k2.r.c$a
                int r10 = r11.length
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p105r.SsaStyle.C1140a.m9624a(java.lang.String):c.a.a.a.k2.r.c$a");
        }
    }

    /* renamed from: c.a.a.a.k2.r.c$b */
    /* compiled from: SsaStyle */
    static final class C1141b {

        /* renamed from: a */
        private static final Pattern f7961a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b */
        private static final Pattern f7962b;

        /* renamed from: c */
        private static final Pattern f7963c;

        /* renamed from: d */
        private static final Pattern f7964d = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: e */
        public final int f7965e;

        /* renamed from: f */
        public final PointF f7966f;

        static {
            String str = "\\s*\\d+(?:\\.\\d+)?\\s*";
            f7962b = Pattern.compile(Util.m10237A("\\\\pos\\((%1$s),(%1$s)\\)", str));
            f7963c = Pattern.compile(Util.m10237A("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", str));
        }

        private C1141b(int i, PointF pointF) {
            this.f7965e = i;
            this.f7966f = pointF;
        }

        /* renamed from: a */
        private static int m9625a(String str) {
            Matcher matcher = f7964d.matcher(str);
            if (matcher.find()) {
                return SsaStyle.m9620d((String) Assertions.m10153e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p067c.p068a.p069a.p070a.p100k2.p105r.SsaStyle.C1141b m9626b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f7961a
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x002b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = m9627c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = m9625a(r3)     // Catch:{ RuntimeException -> 0x0029 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                goto L_0x0009
            L_0x002b:
                c.a.a.a.k2.r.c$b r5 = new c.a.a.a.k2.r.c$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p105r.SsaStyle.C1141b.m9626b(java.lang.String):c.a.a.a.k2.r.c$b");
        }

        /* renamed from: c */
        private static PointF m9627c(String str) {
            String str2;
            String str3;
            Matcher matcher = f7962b.matcher(str);
            Matcher matcher2 = f7963c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    Log.m10384f("SsaStyle.Overrides", sb.toString());
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.m10153e(str2)).trim()), Float.parseFloat(((String) Assertions.m10153e(str3)).trim()));
        }

        /* renamed from: d */
        public static String m9628d(String str) {
            return f7961a.matcher(str).replaceAll("");
        }
    }

    private SsaStyle(String str, int i, Integer num, float f, boolean z, boolean z2) {
        this.f7948a = str;
        this.f7949b = i;
        this.f7950c = num;
        this.f7951d = f;
        this.f7952e = z;
        this.f7953f = z2;
    }

    /* renamed from: b */
    public static SsaStyle m9618b(String str, C1140a aVar) {
        Assertions.m10149a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i = aVar.f7960g;
        String str2 = "SsaStyle";
        if (length != i) {
            Log.m10386h(str2, Util.m10237A("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f7954a].trim();
            int i2 = aVar.f7955b;
            int d = i2 != -1 ? m9620d(split[i2].trim()) : -1;
            int i3 = aVar.f7956c;
            Integer f = i3 != -1 ? m9622f(split[i3].trim()) : null;
            int i4 = aVar.f7957d;
            float g = i4 != -1 ? m9623g(split[i4].trim()) : -3.4028235E38f;
            int i5 = aVar.f7958e;
            boolean e = i5 != -1 ? m9621e(split[i5].trim()) : false;
            int i6 = aVar.f7959f;
            SsaStyle cVar = new SsaStyle(trim, d, f, g, e, i6 != -1 ? m9621e(split[i6].trim()) : false);
            return cVar;
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Skipping malformed 'Style:' line: '");
            sb.append(str);
            sb.append("'");
            Log.m10387i(str2, sb.toString(), e2);
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m9619c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m9620d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m9619c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring unknown alignment: ");
        sb.append(str);
        Log.m10386h("SsaStyle", sb.toString());
        return -1;
    }

    /* renamed from: e */
    private static boolean m9621e(String str) {
        boolean z = false;
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1 || parseInt == -1) {
                z = true;
            }
            return z;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse bold/italic: '");
            sb.append(str);
            sb.append("'");
            Log.m10387i("SsaStyle", sb.toString(), e);
            return false;
        }
    }

    /* renamed from: f */
    public static Integer m9622f(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            Assertions.m10149a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.m12036c(((j >> 24) & 255) ^ 255), Ints.m12036c(j & 255), Ints.m12036c((j >> 8) & 255), Ints.m12036c((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            Log.m10387i("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: g */
    private static float m9623g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse font size: '");
            sb.append(str);
            sb.append("'");
            Log.m10387i("SsaStyle", sb.toString(), e);
            return -3.4028235E38f;
        }
    }
}
