package com.p259uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import com.p259uc.crashsdk.p260a.C3075a;
import com.p259uc.crashsdk.p260a.C3079e;
import com.p259uc.crashsdk.p260a.C3080f;
import com.p259uc.crashsdk.p260a.C3081g;
import com.p259uc.crashsdk.p260a.C3082h;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.uc.crashsdk.b */
/* compiled from: ProGuard */
public class C3084b {

    /* renamed from: A */
    private static boolean f16306A = false;

    /* renamed from: B */
    private static boolean f16307B = false;

    /* renamed from: C */
    private static boolean f16308C = false;

    /* renamed from: D */
    private static boolean f16309D = false;

    /* renamed from: E */
    private static boolean f16310E = false;

    /* renamed from: F */
    private static final Object f16311F = new Object();

    /* renamed from: G */
    private static String f16312G = null;

    /* renamed from: H */
    private static int f16313H = 0;

    /* renamed from: I */
    private static boolean f16314I = false;

    /* renamed from: J */
    private static boolean f16315J = false;

    /* renamed from: K */
    private static boolean f16316K = true;

    /* renamed from: L */
    private static RandomAccessFile f16317L = null;

    /* renamed from: M */
    private static boolean f16318M = false;

    /* renamed from: N */
    private static final Object f16319N = new Object();

    /* renamed from: O */
    private static String f16320O = null;

    /* renamed from: P */
    private static boolean f16321P = false;

    /* renamed from: Q */
    private static volatile Object[] f16322Q = null;

    /* renamed from: R */
    private static Runnable f16323R = new C3079e(101);

    /* renamed from: S */
    private static boolean f16324S = false;

    /* renamed from: T */
    private static long f16325T = 0;

    /* renamed from: U */
    private static final Object f16326U = new Object();

    /* renamed from: V */
    private static long f16327V = 0;

    /* renamed from: W */
    private static boolean f16328W = false;

    /* renamed from: X */
    private static boolean f16329X = false;

    /* renamed from: Y */
    private static boolean f16330Y = false;

    /* renamed from: Z */
    private static long f16331Z = 0;

    /* renamed from: a */
    public static boolean f16332a = false;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public static final WeakHashMap<Activity, Integer> f16333aa = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public static boolean f16334ab = false;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public static String f16335ac = null;

    /* renamed from: ad */
    private static boolean f16336ad = false;

    /* renamed from: ae */
    private static boolean f16337ae = false;

    /* renamed from: af */
    private static boolean f16338af = false;

    /* renamed from: ag */
    private static boolean f16339ag = false;

    /* renamed from: ah */
    private static boolean f16340ah = false;

    /* renamed from: ai */
    private static final Object f16341ai = new Object();

    /* renamed from: aj */
    private static PendingIntent f16342aj = null;

    /* renamed from: b */
    public static boolean f16343b = false;

    /* renamed from: c */
    public static boolean f16344c = false;

    /* renamed from: d */
    public static boolean f16345d = false;

    /* renamed from: e */
    public static final Object f16346e = new Object();

    /* renamed from: f */
    public static boolean f16347f = false;

    /* renamed from: g */
    public static boolean f16348g = true;

    /* renamed from: h */
    public static boolean f16349h = false;

    /* renamed from: i */
    static final /* synthetic */ boolean f16350i = true;

    /* renamed from: j */
    private static String f16351j = null;

    /* renamed from: k */
    private static String f16352k = null;

    /* renamed from: l */
    private static String f16353l = null;

    /* renamed from: m */
    private static String f16354m = null;

    /* renamed from: n */
    private static String f16355n = null;

    /* renamed from: o */
    private static String f16356o = null;

    /* renamed from: p */
    private static String f16357p = null;

    /* renamed from: q */
    private static String f16358q = null;

    /* renamed from: r */
    private static String f16359r = null;

    /* renamed from: s */
    private static String f16360s = null;

    /* renamed from: t */
    private static String f16361t = null;

    /* renamed from: u */
    private static String f16362u = null;

    /* renamed from: v */
    private static String f16363v = null;

    /* renamed from: w */
    private static boolean f16364w = false;

    /* renamed from: x */
    private static boolean f16365x = false;

    /* renamed from: y */
    private static volatile boolean f16366y = false;

    /* renamed from: z */
    private static boolean f16367z = false;

    /* renamed from: A */
    static void m21102A() {
        if (f16345d) {
            String str = f16335ac;
            if (str != null) {
                JNIBridge.set(129, str);
            }
        }
    }

    /* renamed from: B */
    static String m21103B() {
        String str = f16335ac;
        return str == null ? "" : str;
    }

    /* renamed from: C */
    public static boolean m21104C() {
        if (!f16336ad) {
            if ((C3081g.m21032a(ProGuard.f16226a) || !ProGuard.f16226a.equals(C3087e.m21281h())) ? false : f16350i) {
                f16337ae = f16350i;
                if (f16345d) {
                    JNIBridge.set(2, (boolean) f16350i);
                }
            }
            f16336ad = f16350i;
        }
        return f16337ae;
    }

    /* renamed from: D */
    static void m21105D() {
        f16338af = f16350i;
        if (f16345d) {
            JNIBridge.set(34, (boolean) f16350i);
        }
    }

    /* renamed from: E */
    public static boolean m21106E() {
        return f16338af;
    }

    /* renamed from: F */
    public static int m21107F() {
        boolean R = m21119R();
        return m21160q() ? R ? 3 : 6 : m21159p() ? R ? 2 : 5 : R ? 4 : 1;
    }

    /* renamed from: G */
    public static int m21108G() {
        boolean S = m21120S();
        boolean T = m21121T();
        boolean U = m21122U();
        if (m21160q()) {
            if (S) {
                return 12;
            }
            if (T) {
                return 14;
            }
            return U ? 16 : 98;
        } else if (!m21159p()) {
            return 1;
        } else {
            if (S) {
                return 11;
            }
            if (T) {
                return 13;
            }
            return U ? 15 : 97;
        }
    }

    /* renamed from: H */
    static void m21109H() {
        if (f16345d) {
            JNIBridge.nativeSet(27, (long) f16313H, "12", null);
            JNIBridge.set(30, f16316K);
        }
    }

    /* renamed from: I */
    public static boolean m21110I() {
        if (!f16340ah) {
            synchronized (f16341ai) {
                if (!f16340ah) {
                    f16339ag = m21137ab();
                    f16340ah = f16350i;
                }
            }
        }
        return f16339ag;
    }

    /* renamed from: J */
    public static void m21111J() {
        if (!C3087e.m21186E() && !m21110I() && f16342aj == null && C3093g.m21391h() >= 0) {
            try {
                Context a = C3081g.m21018a();
                Intent launchIntentForPackage = a.getPackageManager().getLaunchIntentForPackage(a.getPackageName());
                launchIntentForPackage.addFlags(335544320);
                f16342aj = PendingIntent.getActivity(a, 0, launchIntentForPackage, 0);
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
        }
    }

    /* renamed from: K */
    static boolean m21112K() {
        if (f16342aj == null) {
            C3075a.m20978b("Restart intent is null!");
            return false;
        }
        try {
            C3075a.m20976a("crashsdk", "restarting ...");
            ((AlarmManager) C3081g.m21018a().getSystemService("alarm")).set(1, System.currentTimeMillis() + 200, f16342aj);
            return f16350i;
        } catch (Throwable th) {
            C3081g.m21027a(th);
            return false;
        }
    }

    /* renamed from: N */
    private static String m21115N() {
        if (f16351j == null) {
            f16351j = m21144c("ss");
        }
        return f16351j;
    }

    /* renamed from: O */
    private static String m21116O() {
        if (f16353l == null) {
            f16353l = m21144c("ctn");
        }
        return f16353l;
    }

    /* renamed from: P */
    private static String m21117P() {
        if (f16354m == null) {
            f16354m = m21144c("cta");
        }
        return f16354m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ all -> 0x0075 }] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21118Q() {
        /*
            boolean r0 = f16366y
            if (r0 != 0) goto L_0x0080
            boolean r0 = f16365x
            if (r0 == 0) goto L_0x000a
            goto L_0x0080
        L_0x000a:
            java.lang.Object r0 = f16311F
            monitor-enter(r0)
            boolean r1 = f16366y     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return
        L_0x0013:
            java.lang.String r1 = com.p259uc.crashsdk.C3093g.m21370U()     // Catch:{ all -> 0x007d }
            m21147d(r1)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = m21156m()     // Catch:{ all -> 0x007d }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x007d }
            java.lang.String r3 = m21138b()     // Catch:{ all -> 0x007d }
            r2.<init>(r3)     // Catch:{ all -> 0x007d }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x007d }
            java.lang.String r4 = m21116O()     // Catch:{ all -> 0x007d }
            r3.<init>(r4)     // Catch:{ all -> 0x007d }
            java.lang.String r4 = "f"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x007d }
            f16367z = r4     // Catch:{ all -> 0x007d }
            java.lang.String r4 = "b"
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x007d }
            f16306A = r1     // Catch:{ all -> 0x007d }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x007d }
            f16308C = r1     // Catch:{ all -> 0x007d }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x007d }
            f16309D = r1     // Catch:{ all -> 0x007d }
            boolean r2 = f16308C     // Catch:{ all -> 0x007d }
            r3 = 1
            if (r2 != 0) goto L_0x0056
            if (r1 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r1 = 0
            goto L_0x0057
        L_0x0056:
            r1 = 1
        L_0x0057:
            f16307B = r1     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x006b
            boolean r1 = f16367z     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x0063
            boolean r1 = f16306A     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x006b
        L_0x0063:
            boolean r1 = m21158o()     // Catch:{ all -> 0x007d }
            f16310E = r1     // Catch:{ all -> 0x007d }
            f16307B = r1     // Catch:{ all -> 0x007d }
        L_0x006b:
            boolean r1 = m21166w()     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0079
            m21124W()     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r1 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ all -> 0x007d }
        L_0x0079:
            f16366y = r3     // Catch:{ all -> 0x007d }
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return
        L_0x007d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            throw r1
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3084b.m21118Q():void");
    }

    /* renamed from: R */
    private static boolean m21119R() {
        m21118Q();
        return f16307B;
    }

    /* renamed from: S */
    private static boolean m21120S() {
        m21118Q();
        return f16308C;
    }

    /* renamed from: T */
    private static boolean m21121T() {
        m21118Q();
        return f16309D;
    }

    /* renamed from: U */
    private static boolean m21122U() {
        m21118Q();
        return f16310E;
    }

    /* renamed from: V */
    private static void m21123V() {
        if (f16345d) {
            JNIBridge.set(26, f16364w);
        }
    }

    /* renamed from: W */
    private static void m21124W() {
        if (!f16324S) {
            f16324S = f16350i;
            try {
                new File(m21138b()).delete();
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
            try {
                new File(m21116O()).delete();
            } catch (Throwable th2) {
                C3081g.m21027a(th2);
            }
            try {
                if (f16345d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(m21117P()).delete();
                }
            } catch (Throwable th3) {
                C3081g.m21027a(th3);
            }
        }
        Object[] Y = m21126Y();
        if (Y[0].equals(f16320O) || f16322Q != null) {
            f16321P = f16350i;
            m21125X();
            return;
        }
        m21133a(Y);
    }

    /* renamed from: X */
    private static void m21125X() {
        if (!C3080f.m21016b(f16323R)) {
            C3080f.m21013a(1, f16323R);
            return;
        }
        Object[] objArr = f16322Q;
        if (objArr == null || !m21126Y()[0].equals(objArr[0])) {
            C3080f.m21012a(f16323R);
            C3080f.m21013a(1, f16323R);
        }
    }

    /* renamed from: Y */
    private static Object[] m21126Y() {
        synchronized (f16326U) {
            long j = f16327V + 1;
            f16327V = j;
            if (f16364w) {
                Object[] objArr = {"e", Long.valueOf(j)};
                return objArr;
            } else if (m21168y()) {
                Object[] objArr2 = {"f", Long.valueOf(f16327V)};
                return objArr2;
            } else {
                Object[] objArr3 = {"b", Long.valueOf(f16327V)};
                return objArr3;
            }
        }
    }

    /* renamed from: Z */
    private static Object m21127Z() {
        Object a = m21128a((Object) (Application) C3081g.m21018a(), Application.class, "mLoadedApk");
        if (a != null) {
            Object a2 = m21128a(a, null, "mActivityThread");
            if (a2 != null) {
                return a2;
            }
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(f16350i);
                return declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        return null;
    }

    /* renamed from: a */
    static String m21129a() {
        String str = f16312G;
        if (str != null) {
            return str;
        }
        String h = C3087e.m21281h();
        if (C3081g.m21032a(h)) {
            f16312G = "LLUN";
        } else {
            int i = 0;
            if (h.length() > 48) {
                int length = h.length() - 48;
                h = h.substring(0, 48);
                i = length;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bytes = h.getBytes();
            for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                byte b = bytes[length2];
                if (b == 46) {
                    sb.append('0');
                } else if (b == 58) {
                    sb.append('1');
                } else if (b >= 97 && b <= 122) {
                    sb.append((char) ((b + 65) - 97));
                } else if (b >= 65 && b <= 90) {
                    sb.append((char) b);
                } else if (b < 48 || b > 57) {
                    sb.append('2');
                } else {
                    sb.append((char) b);
                }
            }
            if (i > 0) {
                sb.append(String.valueOf(i));
            }
            f16312G = sb.toString();
        }
        return f16312G;
    }

    /* renamed from: aa */
    private static boolean m21136aa() {
        String a = C3081g.m21019a(new File("/proc/self/cgroup"), 512, false);
        if (C3081g.m21032a(a)) {
            return false;
        }
        if (a.contains("/bg_non_interactive") || a.contains("/background")) {
            return f16350i;
        }
        return false;
    }

    /* renamed from: ab */
    private static boolean m21137ab() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(f16350i);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        int myUid = Process.myUid() % 100000;
        if (myUid < 99000 || myUid > 99999) {
            return false;
        }
        return f16350i;
    }

    /* renamed from: c */
    private static String m21144c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C3093g.m21370U());
        sb.append(m21129a());
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    static String m21146d() {
        if (f16362u == null) {
            f16362u = m21144c("bati");
        }
        return f16362u;
    }

    /* renamed from: e */
    static String m21148e() {
        if (f16363v == null) {
            f16363v = m21144c("hdr");
        }
        return f16363v;
    }

    /* renamed from: f */
    static String m21149f() {
        if (f16357p == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3093g.m21370U());
            sb.append("up");
            f16357p = sb.toString();
        }
        return f16357p;
    }

    /* renamed from: g */
    public static String m21150g() {
        if (f16358q == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3093g.m21370U());
            sb.append("authu");
            f16358q = sb.toString();
        }
        return f16358q;
    }

    /* renamed from: h */
    public static String m21151h() {
        if (f16359r == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3093g.m21370U());
            sb.append("statu");
            f16359r = sb.toString();
        }
        return f16359r;
    }

    /* renamed from: i */
    static String m21152i() {
        if (f16360s == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3093g.m21370U());
            sb.append("poli");
            f16360s = sb.toString();
        }
        return f16360s;
    }

    /* renamed from: j */
    static String m21153j() {
        if (f16361t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3093g.m21370U());
            sb.append("ver");
            f16361t = sb.toString();
        }
        return f16361t;
    }

    /* renamed from: k */
    public static String m21154k() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3093g.m21370U());
        sb.append("bvu");
        return sb.toString();
    }

    /* renamed from: l */
    static String m21155l() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3093g.m21370U());
        sb.append("fds");
        return sb.toString();
    }

    /* renamed from: m */
    static String m21156m() {
        return C3081g.m21019a(new File(m21115N()), 8, false);
    }

    /* renamed from: n */
    static boolean m21157n() {
        return f16365x;
    }

    /* renamed from: o */
    static boolean m21158o() {
        if (!f16314I) {
            if (f16345d) {
                f16315J = JNIBridge.cmd(15) == 1 ? f16350i : false;
            } else {
                f16315J = new File(m21117P()).exists();
            }
            f16314I = f16350i;
        }
        return f16315J;
    }

    /* renamed from: p */
    static boolean m21159p() {
        m21118Q();
        return f16367z;
    }

    /* renamed from: q */
    static boolean m21160q() {
        m21118Q();
        return f16306A;
    }

    /* renamed from: r */
    static boolean m21161r() {
        return f16364w;
    }

    /* renamed from: s */
    public static void m21162s() {
        boolean z;
        m21147d(C3093g.m21370U());
        f16365x = f16350i;
        f16367z = false;
        f16306A = false;
        f16307B = false;
        f16308C = false;
        f16309D = false;
        f16310E = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {"up", "authu", "statu", "poli"};
        File[] listFiles = new File(C3093g.m21370U()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                int i = 0;
                while (true) {
                    if (i >= 7) {
                        z = false;
                        break;
                    } else if (name.endsWith(strArr[i])) {
                        z = f16350i;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 4) {
                            break;
                        } else if (name.equals(strArr2[i2])) {
                            z = f16350i;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z) {
                    StringBuilder sb = new StringBuilder("delete file: ");
                    sb.append(file.getPath());
                    C3075a.m20976a("crashsdk", sb.toString());
                    C3081g.m21029a(file);
                }
            }
        }
        m21124W();
    }

    /* renamed from: t */
    public static void m21163t() {
        if (!f16364w) {
            f16364w = f16350i;
            if (!m21110I() && !C3087e.m21305t()) {
                m21147d(C3093g.m21370U());
                m21123V();
                m21124W();
            }
        }
    }

    /* renamed from: u */
    static boolean m21164u() {
        return m21147d(C3093g.m21370U());
    }

    /* renamed from: v */
    static boolean m21165v() {
        return m21147d(C3093g.m21371V());
    }

    /* renamed from: w */
    static boolean m21166w() {
        if (f16328W || !m21136aa()) {
            return f16350i;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m21167x() {
        if (f16329X || !m21136aa()) {
            return f16350i;
        }
        return false;
    }

    /* renamed from: y */
    static boolean m21168y() {
        if (!f16329X || f16364w) {
            return false;
        }
        return f16350i;
    }

    /* renamed from: z */
    static void m21169z() {
        C3080f.m21013a(2, (Runnable) new C3079e(100));
    }

    /* renamed from: b */
    static String m21138b() {
        if (f16352k == null) {
            f16352k = m21144c("ctj");
        }
        return f16352k;
    }

    /* renamed from: c */
    static String m21143c() {
        if (f16355n == null) {
            f16355n = m21144c("st");
        }
        return f16355n;
    }

    /* renamed from: d */
    private static boolean m21147d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return f16350i;
        }
        C3075a.m20977a("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return f16350i;
    }

    /* renamed from: b */
    public static void m21142b(boolean z) {
        if (!C3087e.m21305t()) {
            if (z && f16364w) {
                if (C3093g.m21362M()) {
                    Log.v("crashsdk", "setForeground, reset sExited to false!!!");
                }
                f16364w = false;
                m21123V();
            }
            boolean z2 = (C3087e.m21186E() || m21110I()) ? f16350i : false;
            long currentTimeMillis = System.currentTimeMillis();
            if (f16328W && !f16329X && z) {
                long j = f16331Z;
                if (j != 0 && !z2 && currentTimeMillis - j > 1800000) {
                    C3080f.m21014a(1, new C3079e(104), 1000);
                }
            }
            f16331Z = currentTimeMillis;
            f16329X = z;
            if (z) {
                f16328W = f16350i;
            }
            if (f16345d) {
                JNIBridge.nativeSetForeground(z);
            }
            if (!f16364w && !z2) {
                m21118Q();
                m21124W();
                if (z) {
                    ProGuard.m20954a(false);
                    if (!f16330Y) {
                        C3087e.m21182A();
                        f16330Y = f16350i;
                    }
                }
                if (!f16318M) {
                    m21125X();
                }
                C3087e.m21258c(z);
            }
        }
    }

    /* renamed from: c */
    public static boolean m21145c(int i) {
        if ((i & f16313H) != 0) {
            return f16350i;
        }
        return false;
    }

    /* renamed from: a */
    public static void m21132a(boolean z) {
        f16316K = z;
        if (f16345d) {
            JNIBridge.set(30, z);
        }
    }

    /* renamed from: a */
    public static String m21130a(String str) {
        StringBuilder sb = new StringBuilder("debug.crs.");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m21133a(Object[] objArr) {
        f16322Q = objArr;
        synchronized (f16319N) {
            String str = objArr[0];
            long longValue = objArr[1].longValue();
            if (longValue < f16325T) {
                C3075a.m20980c("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", new Object[]{Long.valueOf(longValue), Long.valueOf(f16325T)}));
                return;
            }
            f16325T = longValue;
            String N = m21115N();
            if (f16345d) {
                RandomAccessFile randomAccessFile = f16317L;
                if (randomAccessFile != null) {
                    C3081g.m21025a((Closeable) randomAccessFile);
                    f16317L = null;
                }
                boolean nativeChangeState = JNIBridge.nativeChangeState(N, str, f16318M);
                f16318M = false;
                if (!nativeChangeState) {
                    StringBuilder sb = new StringBuilder("write state failed: ");
                    sb.append(str);
                    C3075a.m20978b(sb.toString());
                }
            } else {
                RandomAccessFile randomAccessFile2 = f16317L;
                if (randomAccessFile2 == null || f16318M) {
                    if (randomAccessFile2 != null) {
                        C3081g.m21025a((Closeable) randomAccessFile2);
                        f16317L = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(N, "rw");
                        f16317L = randomAccessFile3;
                        randomAccessFile3.seek(0);
                        f16318M = false;
                    } catch (Exception e) {
                        C3081g.m21027a((Throwable) e);
                    }
                }
                try {
                    f16317L.write(str.getBytes());
                    f16317L.seek(0);
                } catch (Exception e2) {
                    C3081g.m21027a((Throwable) e2);
                }
            }
            f16320O = str;
            f16322Q = null;
        }
    }

    /* renamed from: b */
    public static void m21140b(int i) {
        f16313H = i;
        m21109H();
    }

    /* renamed from: b */
    static void m21141b(Context context) {
        C3075a.m20975a("Restart APP");
        if (context != null) {
            if (f16356o == null) {
                f16356o = m21144c("rt");
            }
            File file = new File(f16356o);
            long j = -1;
            try {
                j = Long.parseLong(C3081g.m21042d(file));
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
            boolean z = false;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (C3093g.m21391h() >= 0 && (j <= 0 || currentTimeMillis - j > ((long) C3093g.m21391h()))) {
                m21147d(C3093g.m21370U());
                C3081g.m21030a(file, String.valueOf(currentTimeMillis));
                z = f16350i;
            }
            StringBuilder sb = new StringBuilder("lastTime: ");
            sb.append(j);
            sb.append(", currentTime: ");
            sb.append(currentTimeMillis);
            sb.append(", needRestart: ");
            sb.append(z);
            C3075a.m20975a(sb.toString());
            if (z) {
                try {
                    C3086d.m21177a((boolean) f16350i);
                } catch (Throwable th2) {
                    C3081g.m21027a(th2);
                }
                m21112K();
            }
        }
    }

    /* renamed from: a */
    public static boolean m21134a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new C3085c());
            if (C3093g.m21359J()) {
                m21169z();
            }
            return f16350i;
        } catch (Throwable th) {
            C3081g.m21027a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static void m21131a(int i) {
        int i2;
        boolean z = false;
        boolean z2 = f16350i;
        switch (i) {
            case 100:
                Object Z = m21127Z();
                if (Z != null) {
                    Object a = m21128a(Z, null, "mActivities");
                    if (a != null) {
                        try {
                            boolean z3 = false;
                            for (Entry value : ((Map) a).entrySet()) {
                                Object value2 = value.getValue();
                                if (value2 != null) {
                                    Activity activity = (Activity) m21128a(value2, null, "activity");
                                    if (activity != null) {
                                        boolean booleanValue = ((Boolean) m21128a(value2, null, "paused")).booleanValue();
                                        boolean booleanValue2 = ((Boolean) m21128a(value2, null, "stopped")).booleanValue();
                                        WeakHashMap<Activity, Integer> weakHashMap = f16333aa;
                                        synchronized (weakHashMap) {
                                            if (booleanValue || booleanValue2) {
                                                i2 = 2;
                                            } else {
                                                i2 = 1;
                                                z3 = f16350i;
                                            }
                                            weakHashMap.put(activity, Integer.valueOf(i2));
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z = f16350i;
                            }
                            if (z) {
                                m21142b(z3);
                            }
                            return;
                        } catch (Throwable th) {
                            C3081g.m21027a(th);
                            break;
                        }
                    }
                }
                break;
            case 101:
                try {
                    if (new File(m21115N()).exists()) {
                        z2 = false;
                    }
                    f16318M = z2;
                    if (z2 || f16321P) {
                        m21133a(m21126Y());
                        f16321P = false;
                    }
                    return;
                } catch (Throwable th2) {
                    C3081g.m21027a(th2);
                    return;
                }
            case 102:
                C3080f.m21013a(1, (Runnable) new C3079e(103));
                return;
            case 103:
                try {
                    C3081g.m21029a(new File(m21117P()));
                    return;
                } catch (Throwable th3) {
                    C3081g.m21027a(th3);
                    return;
                }
            case 104:
                C3082h.m21081d();
                C3092f.m21329a(102);
                if (m21104C()) {
                    C3087e.m21183B();
                    return;
                }
                break;
            default:
                if (!f16350i) {
                    throw new AssertionError();
                }
                break;
        }
    }

    /* renamed from: a */
    private static Object m21128a(Object obj, Class<?> cls, String str) {
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(f16350i);
            return declaredField.get(obj);
        } catch (Throwable th) {
            C3081g.m21027a(th);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.io.Closeable, java.nio.channels.FileChannel] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.nio.channels.FileLock] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.nio.channels.FileLock] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.nio.channels.FileChannel] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006f, code lost:
        r1 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        com.p259uc.crashsdk.p260a.C3081g.m21027a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0084, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        com.p259uc.crashsdk.p260a.C3081g.m21027a((java.lang.Throwable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        com.p259uc.crashsdk.p260a.C3081g.m21027a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], java.nio.channels.FileLock]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.nio.channels.FileLock, java.io.Closeable]
  mth insns count: 80
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006e A[ExcHandler: all (r6v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:43:0x0069] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0030=Splitter:B:17:0x0030, B:60:0x0088=Splitter:B:60:0x0088} */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21135a(java.lang.Object r4, java.lang.String r5, com.p259uc.crashsdk.p260a.C3079e r6) {
        /*
            monitor-enter(r4)
            boolean r0 = f16345d     // Catch:{ all -> 0x00a6 }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0041
            int r0 = com.p259uc.crashsdk.JNIBridge.nativeOpenFile(r5)     // Catch:{ all -> 0x00a6 }
            if (r0 >= 0) goto L_0x0022
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "Can not open file: "
            r6.<init>(r0)     // Catch:{ all -> 0x00a6 }
            r6.append(r5)     // Catch:{ all -> 0x00a6 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00a6 }
            java.lang.String r6 = "crashsdk"
            com.p259uc.crashsdk.p260a.C3075a.m20977a(r6, r5, r1)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a6 }
            return r2
        L_0x0022:
            r5 = 1
            boolean r5 = com.p259uc.crashsdk.JNIBridge.nativeLockFile(r0, r5)     // Catch:{ all -> 0x003c }
            boolean r6 = r6.mo18711a()     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0030
            com.p259uc.crashsdk.JNIBridge.nativeLockFile(r0, r2)     // Catch:{ all -> 0x003c }
        L_0x0030:
            com.p259uc.crashsdk.JNIBridge.nativeCloseFile(r0)     // Catch:{ all -> 0x00a6 }
            goto L_0x00a0
        L_0x0035:
            r6 = move-exception
            if (r5 == 0) goto L_0x003b
            com.p259uc.crashsdk.JNIBridge.nativeLockFile(r0, r2)     // Catch:{ all -> 0x003c }
        L_0x003b:
            throw r6     // Catch:{ all -> 0x003c }
        L_0x003c:
            r5 = move-exception
            com.p259uc.crashsdk.JNIBridge.nativeCloseFile(r0)     // Catch:{ all -> 0x00a6 }
            throw r5     // Catch:{ all -> 0x00a6 }
        L_0x0041:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00a6 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a6 }
            boolean r5 = r0.exists()     // Catch:{ all -> 0x00a6 }
            if (r5 != 0) goto L_0x0054
            r0.createNewFile()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r5 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r5)     // Catch:{ all -> 0x00a6 }
        L_0x0054:
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0062 }
            java.lang.String r3 = "rw"
            r5.<init>(r0, r3)     // Catch:{ Exception -> 0x0062 }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0067
        L_0x0060:
            r5 = move-exception
            goto L_0x00a2
        L_0x0062:
            r5 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r5)     // Catch:{ Exception -> 0x0098 }
            r5 = r1
        L_0x0067:
            if (r5 == 0) goto L_0x007a
            java.nio.channels.FileLock r1 = r5.lock()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            goto L_0x007a
        L_0x006e:
            r6 = move-exception
            r1 = r5
            r5 = r6
            goto L_0x00a2
        L_0x0072:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            goto L_0x007a
        L_0x0077:
            r6 = move-exception
            r1 = r5
            goto L_0x0099
        L_0x007a:
            boolean r2 = r6.mo18711a()     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x0088
            r1.release()     // Catch:{ Exception -> 0x0084, all -> 0x006e }
            goto L_0x0088
        L_0x0084:
            r6 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r6)     // Catch:{ Exception -> 0x0077, all -> 0x006e }
        L_0x0088:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)     // Catch:{ all -> 0x00a6 }
            goto L_0x009f
        L_0x008c:
            r6 = move-exception
            if (r1 == 0) goto L_0x0097
            r1.release()     // Catch:{ Exception -> 0x0093, all -> 0x006e }
            goto L_0x0097
        L_0x0093:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ Exception -> 0x0077, all -> 0x006e }
        L_0x0097:
            throw r6     // Catch:{ Exception -> 0x0077, all -> 0x006e }
        L_0x0098:
            r6 = move-exception
        L_0x0099:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r6)     // Catch:{ all -> 0x0060 }
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r1)     // Catch:{ all -> 0x00a6 }
        L_0x009f:
            r6 = r2
        L_0x00a0:
            monitor-exit(r4)     // Catch:{ all -> 0x00a6 }
            return r6
        L_0x00a2:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r1)     // Catch:{ all -> 0x00a6 }
            throw r5     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a6 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3084b.m21135a(java.lang.Object, java.lang.String, com.uc.crashsdk.a.e):boolean");
    }
}
