package com.p259uc.crashsdk.p260a;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.SparseArray;
import com.p259uc.crashsdk.C3084b;
import com.p259uc.crashsdk.C3087e;
import com.p259uc.crashsdk.C3093g;
import com.p259uc.crashsdk.JNIBridge;
import com.p259uc.crashsdk.ProGuard;
import com.p259uc.crashsdk.export.CrashStatKey;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.uc.crashsdk.a.h */
/* compiled from: ProGuard */
public class C3082h {

    /* renamed from: a */
    static final /* synthetic */ boolean f16288a = true;

    /* renamed from: b */
    private static final Object f16289b = new Object();

    /* renamed from: c */
    private static final Map<String, String> f16290c = new HashMap();

    /* renamed from: d */
    private static int f16291d = 0;

    /* renamed from: e */
    private static final Map<String, C3083a> f16292e = new HashMap();

    /* renamed from: f */
    private static final Object f16293f = new Object();

    /* renamed from: g */
    private static final Object f16294g = new Object();

    /* renamed from: h */
    private static final SparseArray<String> f16295h = new SparseArray<>();

    /* renamed from: i */
    private static boolean f16296i = false;

    /* renamed from: j */
    private static boolean f16297j = false;

    /* renamed from: k */
    private static final Object f16298k = new Object();

    /* renamed from: l */
    private static String f16299l = null;

    /* renamed from: com.uc.crashsdk.a.h$a */
    /* compiled from: ProGuard */
    private static class C3083a {

        /* renamed from: a */
        long f16300a = 0;

        /* renamed from: b */
        int f16301b = 0;

        /* renamed from: c */
        Map<String, String> f16302c = new HashMap();

        /* renamed from: d */
        private String f16303d;

        /* renamed from: e */
        private boolean f16304e = false;

        /* renamed from: f */
        private boolean f16305f = false;

        C3083a(String str, boolean z, boolean z2) {
            this.f16303d = str;
            this.f16304e = z;
            this.f16305f = z2;
        }

        /* renamed from: d */
        private long m21094d(String str) {
            return C3081g.m21038c(mo18714a(str));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo18717a(String str, String str2) {
            this.f16302c.put(str, str2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final String mo18719b(String str) {
            String a = mo18714a(str);
            return a == null ? "" : a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo18720c(String str) {
            if (C3081g.m21032a(str)) {
                return false;
            }
            String str2 = null;
            long j = 0;
            HashMap hashMap = new HashMap();
            Map c = C3082h.m21079c(str);
            int i = 0;
            for (String str3 : c.keySet()) {
                String str4 = (String) c.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.f16304e && str3.equals("up")) {
                    j = C3081g.m21038c(str4);
                } else if (!this.f16304e || !str3.equals("pid")) {
                    hashMap.put(str3, str4);
                } else {
                    i = (int) C3081g.m21038c(str4);
                }
            }
            String str5 = this.f16303d;
            if (str5 != null && !str5.equals(str2)) {
                return false;
            }
            this.f16300a = j;
            this.f16301b = i;
            this.f16303d = str2;
            this.f16302c = hashMap;
            return C3082h.f16288a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo18716a(String str, long j) {
            long d = m21094d(str) + j;
            if (d <= 100) {
                j = d < 0 ? 0 : d;
            }
            mo18717a(str, String.valueOf(j));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo18718a(C3083a aVar) {
            if (!this.f16305f) {
                C3075a.m20977a("crashsdk", String.format(Locale.US, "WaItem '%s' is not mergable!", new Object[]{this.f16303d}), null);
                return false;
            }
            for (String str : aVar.f16302c.keySet()) {
                if (str.startsWith("c_")) {
                    mo18717a(str, aVar.mo18714a(str));
                } else {
                    long d = aVar.m21094d(str);
                    if (d == 0) {
                        mo18717a(str, aVar.mo18714a(str));
                    } else if (d < 100) {
                        mo18716a(str, d);
                    }
                }
            }
            return C3082h.f16288a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo18714a(String str) {
            return (String) this.f16302c.get(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo18715a(boolean z, boolean z2, boolean z3) {
            if (this.f16303d == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            String str = "\n";
            String str2 = "lt";
            if (z) {
                C3082h.m21074b(sb, str2, "uc");
                C3082h.m21074b(sb, "pre", C3093g.m21388e());
                C3082h.m21074b(sb, "pkg", ProGuard.f16226a);
                C3082h.m21074b(sb, "rom", VERSION.RELEASE);
                C3082h.m21074b(sb, "brd", Build.BRAND);
                C3082h.m21074b(sb, "model", Build.MODEL);
                C3082h.m21074b(sb, "sdk", String.valueOf((long) VERSION.SDK_INT));
                C3082h.m21074b(sb, UMCommonContent.f16661w, C3087e.m21269e());
                C3082h.m21074b(sb, "hdw", C3087e.m21273f());
                long k = C3082h.m21092n();
                C3082h.m21074b(sb, "ram", String.valueOf(k));
                C3082h.m21074b(sb, "aram", C3082h.m21053a(k));
                C3082h.m21074b(sb, "cver", "3.2.0.4");
                C3082h.m21074b(sb, "cseq", "210105150455");
                C3082h.m21074b(sb, "ctag", "release");
                C3082h.m21074b(sb, "aver", ProGuard.m20943a());
                C3082h.m21074b(sb, "ver", C3093g.m21367R());
                C3082h.m21074b(sb, "sver", C3093g.m21368S());
                C3082h.m21074b(sb, "seq", C3093g.m21369T());
                C3082h.m21074b(sb, "grd", C3084b.m21167x() ? "fg" : "bg");
                C3082h.m21074b(sb, UMCommonContent.f16662x, "android");
                sb.append(str);
            }
            C3082h.m21074b(sb, str2, this.f16303d);
            C3082h.m21066a(sb, (Map) this.f16302c);
            if (this.f16304e && !z2) {
                long j = this.f16300a;
                if (j != 0) {
                    C3082h.m21074b(sb, "up", String.valueOf(j));
                }
                String str3 = "%d";
                String str4 = "pid";
                if (z3) {
                    C3082h.m21074b(sb, str4, String.format(Locale.US, str3, new Object[]{Integer.valueOf(Process.myPid())}));
                } else {
                    int i = this.f16301b;
                    if (i != 0) {
                        C3082h.m21074b(sb, str4, String.format(Locale.US, str3, new Object[]{Integer.valueOf(i)}));
                    }
                }
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m21053a(long j) {
        if (j < 524288) {
            return "512M";
        }
        long j2 = ((j / 1024) + 512) / 1024;
        return String.format(Locale.US, "%dG", new Object[]{Long.valueOf(j2)});
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m21074b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: c */
    static /* synthetic */ Map m21079c(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("`")) {
            if (str2.length() > 1) {
                String[] split2 = str2.split("=", 3);
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static void m21081d() {
        m21072b(2, 2000);
        m21057a(1, 70000);
    }

    /* renamed from: e */
    public static boolean m21083e() {
        return f16297j;
    }

    /* renamed from: f */
    public static void m21084f() {
        m21072b(1, 2000);
    }

    /* renamed from: g */
    public static void m21085g() {
        m21072b(3, 0);
    }

    /* renamed from: h */
    public static void m21086h() {
        m21072b(4, 0);
    }

    /* renamed from: i */
    public static void m21087i() {
        if (C3093g.m21364O()) {
            C3080f.m21013a(1, (Runnable) new C3079e(303));
        }
    }

    /* renamed from: j */
    static byte[] m21088j() {
        return new byte[]{Byte.MAX_VALUE, 100, 110, 31};
    }

    /* renamed from: l */
    private static String m21090l() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3093g.m21370U());
        sb.append("pv.wa");
        return sb.toString();
    }

    /* renamed from: m */
    private static String m21091m() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3093g.m21370U());
        sb.append("cdt.wa");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static long m21092n() {
        Iterator it = C3081g.m21022a(new File("/proc/meminfo"), 2).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.contains("MemTotal:")) {
                try {
                    return Long.parseLong(str.replaceAll("\\D+", ""));
                } catch (NumberFormatException e) {
                    C3081g.m21027a((Throwable) e);
                }
            }
        }
        return 0;
    }

    /* renamed from: o */
    private static String m21093o() {
        if (C3081g.m21032a(f16299l)) {
            synchronized (f16298k) {
                String str = "https://errlog.umeng.com/api/crashsdk/logcollect";
                if (C3093g.m21365P()) {
                    str = "https://errlogos.umeng.com/api/crashsdk/logcollect";
                }
                f16299l = C3081g.m21020a(C3084b.m21151h(), str, (boolean) f16288a);
            }
        }
        return f16299l;
    }

    /* renamed from: b */
    public static void m21071b() {
        m21057a(2, 0);
    }

    /* renamed from: c */
    public static void m21080c() {
        m21057a(3, 0);
    }

    /* renamed from: b */
    private static void m21072b(int i, long j) {
        if (C3093g.m21364O()) {
            C3080f.m21014a(1, new C3079e(301, new Object[]{Integer.valueOf(i)}), j);
        }
    }

    /* renamed from: d */
    private static boolean m21082d(String str) {
        File file = new File(str);
        Iterator it = m21055a(file, "cst", 30).iterator();
        while (it.hasNext()) {
            C3083a aVar = (C3083a) it.next();
            String a = aVar.mo18714a("prc");
            if (!C3081g.m21032a(a)) {
                Map<String, C3083a> map = f16292e;
                C3083a aVar2 = (C3083a) map.get(a);
                if (aVar2 != null) {
                    aVar2.mo18718a(aVar);
                } else {
                    map.put(a, aVar);
                }
            }
        }
        Map<String, C3083a> map2 = f16292e;
        boolean b = m21077b(C3087e.m21298p(), m21054a((Iterable<C3083a>) map2.values(), (boolean) f16288a, false).toString());
        C3081g.m21035b(file);
        if (b || C3081g.m21030a(file, m21054a((Iterable<C3083a>) map2.values(), false, (boolean) f16288a).toString())) {
            map2.clear();
        }
        return f16288a;
    }

    /* renamed from: a */
    static /* synthetic */ void m21066a(StringBuilder sb, Map map) {
        for (String str : map.keySet()) {
            m21074b(sb, str, (String) map.get(str));
        }
    }

    /* renamed from: a */
    static void m21062a(String str) {
        synchronized (f16289b) {
            File file = new File(m21090l());
            C3083a aVar = new C3083a("pv", f16288a, f16288a);
            String c = C3081g.m21040c(file);
            if (!C3081g.m21032a(c)) {
                aVar.mo18720c(c);
            }
            aVar.mo18716a(str, 1);
            aVar.mo18716a("aujv", 1);
            C3081g.m21030a(file, aVar.mo18715a(false, false, false));
        }
    }

    /* renamed from: b */
    static boolean m21076b(int i, Object[] objArr) {
        switch (i) {
            case 351:
                if (f16288a || objArr != null) {
                    String str = objArr[0];
                    int intValue = objArr[1].intValue();
                    if (intValue == 1) {
                        if (f16297j) {
                            return false;
                        }
                        f16297j = f16288a;
                    }
                    File file = new File(str);
                    String str2 = "crp";
                    ArrayList a = m21055a(file, str2, 100);
                    if (intValue != 4) {
                        C3083a aVar = new C3083a(str2, false, false);
                        String str3 = "ete";
                        String str4 = "et";
                        String str5 = SdkVersion.MINI_VERSION;
                        if (intValue == 1) {
                            aVar.mo18717a(str4, String.valueOf(C3084b.m21107F()));
                            aVar.mo18717a(str3, String.valueOf(C3084b.m21108G()));
                        } else if (intValue == 3) {
                            aVar.mo18717a(str4, str5);
                            aVar.mo18717a(str3, str5);
                        } else if (intValue == 2) {
                            aVar.mo18717a("hpv", str5);
                        }
                        aVar.mo18717a("prc", C3087e.m21281h());
                        if (!C3084b.m21104C()) {
                            str5 = "0";
                        }
                        aVar.mo18717a("imp", str5);
                        m21061a(aVar);
                        a.add(0, aVar);
                    }
                    if (!a.isEmpty()) {
                        boolean b = m21077b(C3087e.m21298p(), m21054a((Iterable<C3083a>) a, (boolean) f16288a, false).toString());
                        C3081g.m21035b(file);
                        if (!b) {
                            C3081g.m21030a(file, m21054a((Iterable<C3083a>) a, false, (boolean) f16288a).toString());
                        }
                    }
                    return f16288a;
                }
                throw new AssertionError();
            case 352:
                if (f16288a || objArr != null) {
                    return m21082d(objArr[0]);
                }
                throw new AssertionError();
            case 353:
                if (f16288a || objArr != null) {
                    return m21078b(objArr[0], objArr[1], objArr[2].booleanValue(), objArr[3].booleanValue());
                }
                throw new AssertionError();
            case 354:
                if (f16288a || objArr != null) {
                    File file2 = new File(objArr[0]);
                    boolean b2 = m21077b(C3087e.m21298p(), m21054a((Iterable<C3083a>) m21055a(file2, "cst", 30), (boolean) f16288a, false).toString());
                    if (b2) {
                        C3081g.m21035b(file2);
                    }
                    return b2;
                }
                throw new AssertionError();
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m21056a() {
        m21057a(0, C3084b.m21106E() ? 700000 : 70000);
    }

    /* renamed from: a */
    private static void m21057a(int i, long j) {
        if (C3084b.m21104C()) {
            C3080f.m21014a(0, new C3079e(302, new Object[]{Integer.valueOf(i)}), j);
        }
    }

    /* renamed from: a */
    public static boolean m21068a(String str, String str2) {
        String str3;
        try {
            StringBuilder sb = new StringBuilder("c_");
            sb.append(str.replaceAll("[^0-9a-zA-Z-_]", "-"));
            String sb2 = sb.toString();
            if (C3081g.m21032a(str2)) {
                str3 = "";
            } else {
                str3 = str2.replaceAll("[`=]", "-");
            }
            Map<String, String> map = f16290c;
            synchronized (map) {
                if (map.get(sb2) == null) {
                    int i = f16291d;
                    if (i >= 20) {
                        return false;
                    }
                    f16291d = i + 1;
                }
                map.put(sb2, str3);
                return f16288a;
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
            return false;
        }
    }

    /* renamed from: b */
    public static void m21075b(boolean z) {
        if (!m21070a(z, "crash detail upload")) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3093g.m21370U());
            sb.append("dt.wa");
            String sb2 = sb.toString();
            C3084b.m21135a(f16293f, sb2, new C3079e(352, new Object[]{sb2}));
            String m = m21091m();
            C3084b.m21135a(f16294g, m, new C3079e(354, new Object[]{m}));
        }
    }

    /* renamed from: b */
    private static boolean m21078b(String str, String str2, boolean z, boolean z2) {
        String str3;
        String str4;
        C3083a aVar;
        File file = new File(m21091m());
        String str5 = "cst";
        ArrayList a = m21055a(file, str5, 30);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String sb2 = sb.toString();
        Iterator it = a.iterator();
        while (true) {
            str3 = "typ";
            str4 = "prc";
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (C3083a) it.next();
            String b = aVar.mo18719b(str4);
            String b2 = aVar.mo18719b(str3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(b);
            sb3.append(b2);
            if (sb2.equals(sb3.toString())) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new C3083a(str5, false, f16288a);
            aVar.mo18717a(str4, str);
            aVar.mo18717a(str3, str2);
            m21061a(aVar);
            a.add(aVar);
        }
        aVar.mo18716a("cnt", 1);
        if (z) {
            aVar.mo18716a("lim", 1);
        }
        if (z2) {
            aVar.mo18716a("syu", 1);
        }
        return C3081g.m21030a(file, m21054a((Iterable<C3083a>) a, false, false).toString());
    }

    /* renamed from: a */
    private static void m21061a(C3083a aVar) {
        Map<String, String> map = f16290c;
        synchronized (map) {
            for (String str : map.keySet()) {
                aVar.mo18717a(str, (String) f16290c.get(str));
            }
        }
    }

    /* renamed from: a */
    public static void m21067a(boolean z) {
        m21059a(1, z);
    }

    /* renamed from: a */
    public static boolean m21070a(boolean z, String str) {
        if (!C3084b.f16345d || z || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Native is crashing, skip stat for ");
        sb.append(str);
        C3075a.m20979b("crashsdk", sb.toString());
        return f16288a;
    }

    /* renamed from: a */
    private static void m21059a(int i, boolean z) {
        if (!m21070a(z, "crash rate")) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3093g.m21370U());
            sb.append("cr.wa");
            String sb2 = sb.toString();
            C3084b.m21135a(f16289b, sb2, new C3079e(351, new Object[]{sb2, Integer.valueOf(i)}));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21077b(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r10)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            byte[] r10 = r10.getBytes()
            r0 = 16
            r2 = 8
            r3 = 0
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x003b }
            byte[] r4 = com.p259uc.crashsdk.p260a.C3077c.m20990a()     // Catch:{ all -> 0x003b }
            com.p259uc.crashsdk.p260a.C3077c.m20987a(r0, r3, r4)     // Catch:{ all -> 0x003b }
            r4 = 4
            byte[] r5 = m21088j()     // Catch:{ all -> 0x003b }
            com.p259uc.crashsdk.p260a.C3077c.m20987a(r0, r4, r5)     // Catch:{ all -> 0x003b }
            byte[] r4 = com.p259uc.crashsdk.ProGuard.m20964f()     // Catch:{ all -> 0x003b }
            com.p259uc.crashsdk.p260a.C3077c.m20987a(r0, r2, r4)     // Catch:{ all -> 0x003b }
            r4 = 12
            byte[] r5 = com.p259uc.crashsdk.p260a.C3078d.m21004c()     // Catch:{ all -> 0x003b }
            com.p259uc.crashsdk.p260a.C3077c.m20987a(r0, r4, r5)     // Catch:{ all -> 0x003b }
            byte[] r0 = com.p259uc.crashsdk.p260a.C3077c.m20994a(r10, r0)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x003f
            r10 = r0
            r0 = 1
            goto L_0x0040
        L_0x003b:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r9 != 0) goto L_0x0044
            java.lang.String r9 = "unknown"
        L_0x0044:
            boolean r4 = com.p259uc.crashsdk.C3093g.m21365P()
            if (r4 == 0) goto L_0x004d
            java.lang.String r4 = "4ea4e41a3993"
            goto L_0x004f
        L_0x004d:
            java.lang.String r4 = "28ef1713347d"
        L_0x004f:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            r6.append(r5)
            java.lang.String r7 = "AppChk#2014"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = com.p259uc.crashsdk.p260a.C3081g.m21043d(r6)
            if (r6 != 0) goto L_0x0076
            r9 = 0
            goto L_0x00ba
        L_0x0076:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = m21093o()
            r7.append(r8)
            java.lang.String r8 = "?chk="
            r7.append(r8)
            int r8 = r6.length()
            int r8 = r8 - r2
            int r2 = r6.length()
            java.lang.String r2 = r6.substring(r8, r2)
            r7.append(r2)
            java.lang.String r2 = "&vno="
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = "&uuid="
            r7.append(r2)
            r7.append(r9)
            java.lang.String r9 = "&app="
            r7.append(r9)
            r7.append(r4)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r9 = "&enc=aes"
            r7.append(r9)
        L_0x00b6:
            java.lang.String r9 = r7.toString()
        L_0x00ba:
            if (r9 != 0) goto L_0x00bd
            return r3
        L_0x00bd:
            byte[] r9 = com.p259uc.crashsdk.p260a.C3077c.m20992a(r9, r10)
            if (r9 != 0) goto L_0x00c4
            return r3
        L_0x00c4:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9)
            java.lang.String r9 = "retcode=0"
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x00d2
            return r1
        L_0x00d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.p260a.C3082h.m21077b(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r3 == false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m21060a(int r9, java.lang.Object[] r10) {
        /*
            r0 = 0
            switch(r9) {
                case 301: goto L_0x00ce;
                case 302: goto L_0x000d;
                case 303: goto L_0x0009;
                default: goto L_0x0004;
            }
        L_0x0004:
            boolean r9 = f16288a
            if (r9 == 0) goto L_0x00e7
            return
        L_0x0009:
            m21075b(r0)
            return
        L_0x000d:
            boolean r9 = f16288a
            if (r9 != 0) goto L_0x001a
            if (r10 == 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x001a:
            java.lang.Object r9 = f16289b
            monitor-enter(r9)
            r10 = r10[r0]     // Catch:{ all -> 0x00cb }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x00cb }
            int r10 = r10.intValue()     // Catch:{ all -> 0x00cb }
            r1 = 1
            if (r10 != 0) goto L_0x002e
            boolean r2 = f16296i     // Catch:{ all -> 0x00cb }
            if (r2 != 0) goto L_0x00c9
            f16296i = r1     // Catch:{ all -> 0x00cb }
        L_0x002e:
            java.lang.String r2 = com.p259uc.crashsdk.ProGuard.f16227b     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = "2.0"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00cb }
            if (r2 == 0) goto L_0x0040
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r2 = com.p259uc.crashsdk.C3084b.m21145c(r2)     // Catch:{ all -> 0x00cb }
            if (r2 != 0) goto L_0x00c9
        L_0x0040:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = m21090l()     // Catch:{ all -> 0x00cb }
            r2.<init>(r3)     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = com.p259uc.crashsdk.p260a.C3081g.m21040c(r2)     // Catch:{ all -> 0x00cb }
            com.uc.crashsdk.a.h$a r4 = new com.uc.crashsdk.a.h$a     // Catch:{ all -> 0x00cb }
            java.lang.String r5 = "pv"
            r4.<init>(r5, r1, r1)     // Catch:{ all -> 0x00cb }
            boolean r5 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r3)     // Catch:{ all -> 0x00cb }
            if (r5 != 0) goto L_0x005d
            r4.mo18720c(r3)     // Catch:{ all -> 0x00cb }
        L_0x005d:
            if (r10 != 0) goto L_0x006c
            int r3 = r4.f16301b     // Catch:{ all -> 0x00cb }
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x00cb }
            if (r3 != r5) goto L_0x0069
            r3 = 1
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r3 != 0) goto L_0x00c9
        L_0x006c:
            r5 = 1
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "pv"
            r4.mo18716a(r10, r5)     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = "fjv"
        L_0x0077:
            r4.mo18716a(r10, r5)     // Catch:{ all -> 0x00cb }
            goto L_0x008b
        L_0x007b:
            if (r10 != r1) goto L_0x0080
            java.lang.String r10 = "hpv"
            goto L_0x0077
        L_0x0080:
            r3 = 2
            if (r10 != r3) goto L_0x008b
            java.lang.String r10 = "pv"
            r4.mo18716a(r10, r5)     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = "npv"
            goto L_0x0077
        L_0x008b:
            java.lang.String r10 = com.p259uc.crashsdk.C3087e.m21298p()     // Catch:{ all -> 0x00cb }
            long r5 = r4.f16300a     // Catch:{ all -> 0x00cb }
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x00a5
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00cb }
            long r7 = r7 - r5
            r5 = 28800000(0x1b77400, double:1.42290906E-316)
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a5
            r10 = 0
            goto L_0x00ad
        L_0x00a5:
            java.lang.String r3 = r4.mo18715a(r1, r1, r0)     // Catch:{ all -> 0x00cb }
            boolean r10 = m21077b(r10, r3)     // Catch:{ all -> 0x00cb }
        L_0x00ad:
            if (r10 == 0) goto L_0x00c2
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x00cb }
            r10.<init>()     // Catch:{ all -> 0x00cb }
            r4.f16302c = r10     // Catch:{ all -> 0x00cb }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00cb }
            r4.f16300a = r5     // Catch:{ all -> 0x00cb }
            int r10 = android.os.Process.myPid()     // Catch:{ all -> 0x00cb }
            r4.f16301b = r10     // Catch:{ all -> 0x00cb }
        L_0x00c2:
            java.lang.String r10 = r4.mo18715a(r0, r0, r1)     // Catch:{ all -> 0x00cb }
            com.p259uc.crashsdk.p260a.C3081g.m21030a(r2, r10)     // Catch:{ all -> 0x00cb }
        L_0x00c9:
            monitor-exit(r9)     // Catch:{ all -> 0x00cb }
            return
        L_0x00cb:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00cb }
            throw r10
        L_0x00ce:
            boolean r9 = f16288a
            if (r9 != 0) goto L_0x00db
            if (r10 == 0) goto L_0x00d5
            goto L_0x00db
        L_0x00d5:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x00db:
            r9 = r10[r0]
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            m21059a(r9, r0)
            return
        L_0x00e7:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            goto L_0x00ee
        L_0x00ed:
            throw r9
        L_0x00ee:
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.p260a.C3082h.m21060a(int, java.lang.Object[]):void");
    }

    /* renamed from: b */
    static void m21073b(String str) {
        synchronized (f16298k) {
            f16299l = str;
            String h = C3084b.m21151h();
            StringBuilder sb = new StringBuilder();
            sb.append(f16299l);
            sb.append("\n");
            C3076b.m20984a(h, sb.toString());
        }
    }

    /* renamed from: a */
    private static StringBuilder m21054a(Iterable<C3083a> iterable, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        boolean z3 = f16288a;
        for (C3083a aVar : iterable) {
            if (z3) {
                sb.append(aVar.mo18715a(z, z, z2));
                z3 = false;
            } else {
                sb.append(aVar.mo18715a(false, z, z2));
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static void m21063a(String str, int i, int i2) {
        if (C3093g.m21364O()) {
            synchronized (f16293f) {
                Map<String, C3083a> map = f16292e;
                C3083a aVar = (C3083a) map.get(str);
                if (aVar == null) {
                    aVar = new C3083a("cst", false, f16288a);
                    map.put(str, aVar);
                    m21061a(aVar);
                }
                SparseArray<String> sparseArray = f16295h;
                synchronized (sparseArray) {
                    if (sparseArray.size() == 0) {
                        m21058a(100, "pv");
                        m21058a(102, "hpv");
                        m21058a(1, "all");
                        m21058a(2, "afg");
                        m21058a(101, "abg");
                        m21058a(3, "jfg");
                        m21058a(4, "jbg");
                        m21058a(7, "nfg");
                        m21058a(8, "nbg");
                        m21058a(27, "nafg");
                        m21058a(28, "nabg");
                        m21058a(9, "nho");
                        m21058a(10, "uar");
                        m21058a(29, "ulm");
                        m21058a(30, "ukt");
                        m21058a(31, "uet");
                        m21058a(32, "urs");
                        m21058a(11, "ufg");
                        m21058a(12, "ubg");
                        m21058a(40, "anf");
                        m21058a(41, "anb");
                        m21058a(42, "ancf");
                        m21058a(43, "ancb");
                        m21058a(13, "lup");
                        m21058a(14, "luf");
                        m21058a(15, "lef");
                        m21058a((int) CrashStatKey.LOG_LEGACY_TMP_FILE, "ltf");
                        m21058a(16, "laf");
                        m21058a(22, "lac");
                        m21058a(23, "lau");
                        m21058a(17, "llf");
                        m21058a(18, "lul");
                        m21058a(19, "lub");
                        m21058a(20, "luc");
                        m21058a(21, "luu");
                        m21058a(24, "lzc");
                        m21058a((int) CrashStatKey.LOG_UPLOAD_ENCRYPT_COUNT, "lec");
                        m21058a(25, "lrc");
                        m21058a(26, "lss");
                    }
                }
                String str2 = (String) sparseArray.get(i);
                if (str2 == null) {
                    StringBuilder sb = new StringBuilder("map key is not set with: ");
                    sb.append(i);
                    C3075a.m20977a("crashsdk", sb.toString(), null);
                }
                aVar.mo18717a("prc", str);
                if (str2 != null) {
                    aVar.mo18717a(str2, String.valueOf(i2));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m21069a(String str, String str2, boolean z, boolean z2) {
        if (!C3093g.m21364O()) {
            return false;
        }
        String m = m21091m();
        return C3084b.m21135a(f16294g, m, new C3079e(353, new Object[]{str, str2, Boolean.valueOf(z), Boolean.valueOf(z2)}));
    }

    /* renamed from: a */
    private static void m21058a(int i, String str) {
        f16295h.put(i, str);
    }

    /* renamed from: a */
    private static ArrayList<C3083a> m21055a(File file, String str, int i) {
        ArrayList a = C3081g.m21022a(file, i);
        ArrayList<C3083a> arrayList = new ArrayList<>();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C3083a aVar = new C3083a(str, false, false);
            if (aVar.mo18720c(str2)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
