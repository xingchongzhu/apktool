package com.p259uc.crashsdk;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.p259uc.crashsdk.export.LogType;
import com.p259uc.crashsdk.p260a.C3075a;
import com.p259uc.crashsdk.p260a.C3076b;
import com.p259uc.crashsdk.p260a.C3077c;
import com.p259uc.crashsdk.p260a.C3078d;
import com.p259uc.crashsdk.p260a.C3079e;
import com.p259uc.crashsdk.p260a.C3080f;
import com.p259uc.crashsdk.p260a.C3081g;
import com.p259uc.crashsdk.p260a.C3082h;
import com.umeng.analytics.pro.UContent;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.uc.crashsdk.e */
/* compiled from: ProGuard */
public class C3087e implements UncaughtExceptionHandler {

    /* renamed from: A */
    private static Map<String, Integer> f16377A = null;

    /* renamed from: B */
    private static String f16378B = null;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static int f16379C = -1;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static int f16380D = -1;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static int f16381E = -1;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static int f16382F = -1;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static int f16383G = -1;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static int f16384H = -1;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static int f16385I = -1;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static String f16386J = "?";
    /* access modifiers changed from: private */

    /* renamed from: K */
    public static boolean f16387K = false;

    /* renamed from: L */
    private static boolean f16388L = false;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public static int f16389M = 0;

    /* renamed from: N */
    private static int f16390N = 0;

    /* renamed from: O */
    private static boolean f16391O = false;

    /* renamed from: P */
    private static C3079e f16392P = new C3079e(405);

    /* renamed from: Q */
    private static C3090c f16393Q = new C3090c(0);

    /* renamed from: R */
    private static boolean f16394R = false;

    /* renamed from: S */
    private static final C3079e f16395S = new C3079e(412);

    /* renamed from: T */
    private static UncaughtExceptionHandler f16396T = null;

    /* renamed from: U */
    private static Throwable f16397U = null;

    /* renamed from: V */
    private static boolean f16398V = false;

    /* renamed from: W */
    private static boolean f16399W = false;

    /* renamed from: X */
    private static Runnable f16400X = null;

    /* renamed from: Y */
    private static final Object f16401Y = new Object();

    /* renamed from: Z */
    private static int f16402Z = 101;

    /* renamed from: a */
    static final /* synthetic */ boolean f16403a = true;

    /* renamed from: aa */
    private static Runnable f16404aa = new C3079e(407);

    /* renamed from: ab */
    private static final Object f16405ab = new Object();

    /* renamed from: ac */
    private static boolean f16406ac = false;

    /* renamed from: ad */
    private static ParcelFileDescriptor f16407ad = null;

    /* renamed from: ae */
    private static boolean f16408ae = false;

    /* renamed from: af */
    private static boolean f16409af = false;

    /* renamed from: b */
    private static long f16410b;

    /* renamed from: c */
    private static final AtomicBoolean f16411c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f16412d = false;

    /* renamed from: f */
    private static long f16413f = 0;

    /* renamed from: g */
    private static long f16414g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static boolean f16415h = true;

    /* renamed from: i */
    private static String f16416i;

    /* renamed from: j */
    private static String f16417j = "";

    /* renamed from: k */
    private static String f16418k = null;

    /* renamed from: l */
    private static String f16419l = null;

    /* renamed from: m */
    private static String f16420m = null;

    /* renamed from: n */
    private static final Object f16421n = new Object();

    /* renamed from: o */
    private static final Object f16422o = new Object();

    /* renamed from: p */
    private static final Object f16423p = new Object();

    /* renamed from: q */
    private static final Object f16424q = new Object();

    /* renamed from: r */
    private static final ArrayList<String> f16425r = new ArrayList<>();

    /* renamed from: s */
    private static int f16426s = 0;

    /* renamed from: t */
    private static String f16427t = null;

    /* renamed from: u */
    private static boolean f16428u = false;

    /* renamed from: v */
    private static String f16429v = null;

    /* renamed from: w */
    private static String f16430w = null;

    /* renamed from: x */
    private static String f16431x = null;

    /* renamed from: y */
    private static final Object f16432y = new Object();

    /* renamed from: z */
    private static final Object f16433z = new Object();

    /* renamed from: e */
    private final List<FileInputStream> f16434e = new ArrayList();

    /* renamed from: com.uc.crashsdk.e$a */
    /* compiled from: ProGuard */
    private static class C3088a extends OutputStream {

        /* renamed from: a */
        private final long f16435a;

        /* renamed from: b */
        private final OutputStream f16436b;

        /* renamed from: c */
        private int f16437c = 0;

        /* renamed from: d */
        private int f16438d = 0;

        /* renamed from: e */
        private boolean f16439e = false;

        C3088a(long j, OutputStream outputStream) {
            this.f16435a = j;
            this.f16436b = outputStream;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int m21313a(byte[] r7, int r8, int r9) {
            /*
                r6 = this;
                int r0 = r6.f16438d
                int r0 = r0 + r9
                r6.f16438d = r0
                boolean r0 = r6.f16439e
                if (r0 == 0) goto L_0x000b
                r7 = 0
                return r7
            L_0x000b:
                int r0 = com.p259uc.crashsdk.C3093g.m21408y()
                if (r0 <= 0) goto L_0x0019
                int r1 = r6.f16437c
                int r2 = r1 + r9
                if (r2 <= r0) goto L_0x0019
                int r0 = r0 - r1
                goto L_0x001a
            L_0x0019:
                r0 = r9
            L_0x001a:
                int r1 = r6.f16437c
                int r1 = r1 + r0
                r6.f16437c = r1
                long r1 = r6.f16435a
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0030
                java.lang.String r1 = new java.lang.String
                r1.<init>(r7, r8, r0)
                r6.m21314b(r1)
                goto L_0x0035
            L_0x0030:
                java.io.OutputStream r1 = r6.f16436b
                r1.write(r7, r8, r0)
            L_0x0035:
                if (r0 >= r9) goto L_0x003a
                r7 = 1
                r6.f16439e = r7
            L_0x003a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.C3088a.m21313a(byte[], int, int):int");
        }

        /* renamed from: b */
        private void m21314b(String str) {
            if (C3084b.f16345d) {
                JNIBridge.nativeClientWriteData(this.f16435a, str);
            }
        }

        public final void write(int i) {
            String str = "%c";
            if (C3087e.f16415h && C3087e.m21195N()) {
                C3075a.m20981d("DEBUG", String.format(Locale.US, str, new Object[]{Integer.valueOf(i)}));
            }
            if (this.f16435a != 0) {
                m21314b(String.format(Locale.US, str, new Object[]{Integer.valueOf(i)}));
            } else {
                this.f16436b.write(i);
            }
            this.f16437c++;
            this.f16438d++;
        }

        public final void write(byte[] bArr, int i, int i2) {
            if (C3087e.f16415h && C3087e.m21195N()) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                if (!(i2 == 1 && bArr2[0] == 10)) {
                    try {
                        C3075a.m20981d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            m21313a(bArr, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo18730a() {
            try {
                if (this.f16438d - this.f16437c > 0) {
                    mo18731a("\n");
                    mo18731a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                mo18731a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", new Object[]{Integer.valueOf(this.f16438d), Integer.valueOf(this.f16437c), Integer.valueOf(C3093g.m21408y()), Integer.valueOf(this.f16438d - this.f16437c)}));
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
        }

        public final void write(byte[] bArr) {
            if (C3087e.f16415h && C3087e.m21195N() && !(bArr.length == 1 && bArr[0] == 10)) {
                try {
                    C3075a.m20981d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            m21313a(bArr, 0, bArr.length);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo18731a(String str) {
            if (C3087e.f16415h && C3087e.m21195N()) {
                C3075a.m20981d("DEBUG", str);
            }
            if (this.f16435a != 0) {
                m21314b(str);
            } else {
                this.f16436b.write(str.getBytes("UTF-8"));
            }
        }
    }

    /* renamed from: com.uc.crashsdk.e$b */
    /* compiled from: ProGuard */
    private static class C3089b implements Comparator<File> {
        private C3089b() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            File file = (File) obj;
            File file2 = (File) obj2;
            if (file.lastModified() > file2.lastModified()) {
                return 1;
            }
            return file.lastModified() < file2.lastModified() ? -1 : 0;
        }

        /* synthetic */ C3089b(byte b) {
            this();
        }
    }

    /* renamed from: com.uc.crashsdk.e$c */
    /* compiled from: ProGuard */
    private static class C3090c extends BroadcastReceiver {
        private C3090c() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                C3087e.f16379C = intent.getIntExtra("level", -1);
                C3087e.f16380D = intent.getIntExtra("scale", -1);
                C3087e.f16381E = intent.getIntExtra("voltage", -1);
                C3087e.f16382F = intent.getIntExtra("health", -1);
                C3087e.f16383G = intent.getIntExtra("plugged", -1);
                C3087e.f16384H = intent.getIntExtra("status", -1);
                C3087e.f16385I = intent.getIntExtra("temperature", -1);
                C3087e.f16386J = intent.getStringExtra("technology");
                if (C3087e.m21190I() >= 2) {
                    C3087e.m21191J();
                    C3087e.f16389M = 0;
                }
            } else {
                String str = "android.intent.action.BATTERY_LOW";
                if (str.equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                    C3087e.f16387K = str.equals(action);
                    C3087e.m21191J();
                } else if ("android.intent.action.ANR".equals(action)) {
                    try {
                        C3087e.m21265d(context);
                    } catch (Throwable th) {
                        C3081g.m21027a(th);
                    }
                }
            }
        }

        /* synthetic */ C3090c(byte b) {
            this();
        }
    }

    /* renamed from: com.uc.crashsdk.e$d */
    /* compiled from: ProGuard */
    private static class C3091d {

        /* renamed from: a */
        long f16440a;

        /* renamed from: b */
        long f16441b;

        /* renamed from: c */
        int f16442c;

        /* renamed from: d */
        int f16443d;

        /* renamed from: e */
        boolean f16444e;

        /* renamed from: f */
        boolean f16445f;

        /* renamed from: g */
        boolean f16446g;

        private C3091d() {
            this.f16440a = 0;
            this.f16441b = 0;
            this.f16442c = 0;
            this.f16443d = 0;
            this.f16444e = false;
            this.f16445f = false;
            this.f16446g = false;
        }

        /* synthetic */ C3091d(byte b) {
            this();
        }
    }

    static {
        Class<C3087e> cls = C3087e.class;
    }

    public C3087e() {
        try {
            m21193L();
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
    }

    /* renamed from: A */
    public static void m21182A() {
        if (!f16406ac && !C3084b.m21110I()) {
            C3080f.m21014a(1, new C3079e(408), 1000);
        }
    }

    /* renamed from: B */
    static void m21183B() {
        C3080f.m21014a(1, new C3079e(409), 7000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if ((java.lang.System.currentTimeMillis() % 3) == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r0 == 1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21184C() {
        /*
            int r0 = com.p259uc.crashsdk.C3093g.m21361L()
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0013
            if (r0 == r2) goto L_0x0013
            if (r0 != r1) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            if (r0 != r3) goto L_0x0043
        L_0x0011:
            r3 = 0
            goto L_0x0043
        L_0x0013:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r5 < r6) goto L_0x0043
            r6 = 25
            if (r5 > r6) goto L_0x0043
            if (r0 != 0) goto L_0x0021
            r5 = 0
            goto L_0x0022
        L_0x0021:
            r5 = 1
        L_0x0022:
            r6 = 0
            if (r0 != r2) goto L_0x0034
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 10
            long r8 = r8 % r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r0 != r1) goto L_0x0042
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 3
            long r0 = r0 % r8
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0011
            goto L_0x0043
        L_0x0042:
            r3 = r5
        L_0x0043:
            if (r3 != 0) goto L_0x004c
            java.lang.String r0 = "crashsdk"
            java.lang.String r1 = "SIG 3 is disabled by settings"
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r0, r1)
        L_0x004c:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21110I()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L_0x0068
            if (r3 == 0) goto L_0x0068
            r1 = 2
            com.uc.crashsdk.a.e r2 = new com.uc.crashsdk.a.e
            r3 = 413(0x19d, float:5.79E-43)
            r2.<init>(r3)
            com.p259uc.crashsdk.p260a.C3080f.m21013a(r1, r2)
            goto L_0x0069
        L_0x0068:
            r4 = r3
        L_0x0069:
            r1 = 7
            long r2 = (long) r0
            r0 = 0
            com.p259uc.crashsdk.JNIBridge.nativeCmd(r1, r2, r0, r0)
            if (r4 == 0) goto L_0x0076
            r0 = 8
            com.p259uc.crashsdk.JNIBridge.cmd(r0)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21184C():void");
    }

    /* renamed from: D */
    public static ParcelFileDescriptor m21185D() {
        if (!C3084b.f16345d) {
            C3075a.m20981d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        ParcelFileDescriptor parcelFileDescriptor = f16407ad;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        int cmd = (int) JNIBridge.cmd(14);
        if (cmd == -1) {
            return null;
        }
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(cmd);
        f16407ad = adoptFd;
        f16408ae = true;
        return adoptFd;
    }

    /* renamed from: E */
    public static boolean m21186E() {
        return f16409af;
    }

    /* renamed from: F */
    public static void m21187F() {
        String V = C3093g.m21371V();
        File file = new File(V);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb = new StringBuilder("Ucebu can not list folder: ");
                sb.append(V);
                C3075a.m20978b(sb.toString());
                return;
            }
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (!file2.isFile() || !file2.getName().contains("ucebu")) {
                    i++;
                } else {
                    m21238a(false, false);
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    static /* synthetic */ int m21190I() {
        int i = f16389M + 1;
        f16389M = i;
        return i;
    }

    /* renamed from: J */
    static /* synthetic */ void m21191J() {
        if (C3084b.f16345d) {
            StringBuilder X = m21205X();
            if (X != null) {
                JNIBridge.set(125, X.toString());
            }
        }
        f16388L = true;
        m21206Y();
    }

    /* renamed from: L */
    private void m21193L() {
        int G = C3093g.m21356G();
        int i = 0;
        while (i < G) {
            try {
                this.f16434e.add(new FileInputStream("/dev/null"));
                i++;
            } catch (Exception e) {
                C3081g.m21027a((Throwable) e);
                return;
            }
        }
    }

    /* renamed from: M */
    private void m21194M() {
        for (FileInputStream a : this.f16434e) {
            C3081g.m21025a((Closeable) a);
        }
        this.f16434e.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static boolean m21195N() {
        if (C3093g.m21363N()) {
            return true;
        }
        return m21231a();
    }

    /* renamed from: O */
    private static String m21196O() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3093g.m21388e());
        sb.append("_");
        return sb.toString();
    }

    /* renamed from: P */
    private static String m21197P() {
        return C3084b.m21168y() ? "fg" : "bg";
    }

    /* renamed from: Q */
    private static byte[] m21198Q() {
        byte[] bArr = null;
        int i = 1024;
        while (bArr == null && i > 0) {
            try {
                bArr = new byte[i];
            } catch (Throwable unused) {
                i /= 2;
                if (i < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    /* renamed from: R */
    private static String m21199R() {
        return (!C3084b.m21104C() || f16412d) ? LogType.JAVA_TYPE : "ucebujava";
    }

    /* renamed from: S */
    private static void m21200S() {
        String str;
        BufferedReader bufferedReader;
        FileReader fileReader;
        Throwable th;
        String str2 = "-";
        try {
            str = Build.HARDWARE;
        } catch (Throwable th2) {
            C3081g.m21027a(th2);
            str = str2;
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, 512);
                int i = 0;
                do {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String str3 = ":";
                        if (readLine.startsWith("Hardware")) {
                            str = readLine.substring(readLine.indexOf(str3) + 1).trim();
                        } else if (readLine.startsWith("Processor")) {
                            str2 = readLine.substring(readLine.indexOf(str3) + 1).trim();
                        }
                        i++;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            C3081g.m21027a(th);
                            C3081g.m21025a((Closeable) fileReader);
                            C3081g.m21025a((Closeable) bufferedReader);
                            f16418k = str;
                            f16419l = str2;
                        } catch (Throwable th4) {
                            C3081g.m21025a((Closeable) fileReader);
                            C3081g.m21025a((Closeable) bufferedReader);
                            throw th4;
                        }
                    }
                } while (i < 2);
                C3081g.m21025a((Closeable) fileReader);
            } catch (Throwable th5) {
                Throwable th6 = th5;
                bufferedReader = null;
                th = th6;
                C3081g.m21027a(th);
                C3081g.m21025a((Closeable) fileReader);
                C3081g.m21025a((Closeable) bufferedReader);
                f16418k = str;
                f16419l = str2;
            }
        } catch (Throwable th7) {
            bufferedReader = null;
            th = th7;
            fileReader = null;
            C3081g.m21027a(th);
            C3081g.m21025a((Closeable) fileReader);
            C3081g.m21025a((Closeable) bufferedReader);
            f16418k = str;
            f16419l = str2;
        }
        C3081g.m21025a((Closeable) bufferedReader);
        f16418k = str;
        f16419l = str2;
    }

    /* renamed from: T */
    private static String m21201T() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3093g.m21370U());
        sb.append("bytes");
        return sb.toString();
    }

    /* renamed from: U */
    private static boolean m21202U() {
        return VERSION.SDK_INT < 29;
    }

    /* renamed from: V */
    private static void m21203V() {
        if (!f16391O && !C3084b.m21104C() && !C3084b.m21110I()) {
            JNIBridge.cmd(18);
        }
    }

    /* renamed from: W */
    private static void m21204W() {
        C3080f.m21014a(3, new C3079e(414), 1000);
    }

    /* renamed from: X */
    private static StringBuilder m21205X() {
        String str;
        String str2 = "\n";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(f16379C);
            sb.append(str2);
            sb.append("scale: ");
            sb.append(f16380D);
            sb.append(str2);
            String str3 = " (Unknown)";
            String str4 = " (?)";
            switch (f16382F) {
                case 1:
                    str = str3;
                    break;
                case 2:
                    str = " (Good)";
                    break;
                case 3:
                    str = " (Overheat)";
                    break;
                case 4:
                    str = " (Dead)";
                    break;
                case 5:
                    str = " (Over voltage)";
                    break;
                case 6:
                    str = " (Unspecified failure)";
                    break;
                case 7:
                    str = " (Cold)";
                    break;
                default:
                    str = str4;
                    break;
            }
            sb.append("health: ");
            sb.append(f16382F);
            sb.append(str);
            sb.append(str2);
            int i = f16383G;
            String str5 = i != 0 ? i != 1 ? i != 2 ? i != 4 ? str4 : " (Wireless)" : " (USB port)" : " (AC charger)" : " (None)";
            sb.append("pluged: ");
            sb.append(f16383G);
            sb.append(str5);
            sb.append(str2);
            int i2 = f16384H;
            if (i2 != 1) {
                str3 = i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? str4 : " (Full)" : " (Not charging)" : " (Discharging)" : " (Charging)";
            }
            sb.append("status: ");
            sb.append(f16384H);
            sb.append(str3);
            sb.append(str2);
            sb.append("voltage: ");
            sb.append(f16381E);
            sb.append(str2);
            sb.append("temperature: ");
            sb.append(f16385I);
            sb.append(str2);
            sb.append("technology: ");
            sb.append(f16386J);
            sb.append(str2);
            sb.append("battery low: ");
            sb.append(f16387K);
            sb.append(str2);
            return sb;
        } catch (Throwable th) {
            C3081g.m21027a(th);
            return null;
        }
    }

    /* renamed from: Y */
    private static void m21206Y() {
        if (C3084b.f16344c && f16388L && ProGuard.f16228c) {
            f16388L = false;
            if (!C3080f.m21016b(f16392P)) {
                C3080f.m21014a(0, f16392P, 2000);
            }
        }
    }

    /* renamed from: Z */
    private static boolean m21207Z() {
        return C3084b.f16345d && JNIBridge.nativeIsCrashing();
    }

    /* renamed from: a */
    public static boolean m21231a() {
        if (f16413f == 0) {
            f16413f = 2;
            if (m21278g(C3084b.m21130a("logs")) == 1) {
                f16413f = 1;
            }
        }
        return f16413f == 1;
    }

    /* renamed from: aa */
    private static void m21239aa() {
        int i;
        String W = C3093g.m21372W();
        File file = new File(W);
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 150) {
                    Arrays.sort(listFiles, new C3089b(0));
                    int length = listFiles.length - 150;
                    int i2 = length < 0 ? 0 : length;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i3 = 0;
                    int i4 = 0;
                    i = 0;
                    while (i3 < listFiles.length) {
                        File file2 = listFiles[i3];
                        boolean z = i3 < i2;
                        if (!z && currentTimeMillis - file2.lastModified() >= 432000000) {
                            z = true;
                        }
                        if (!z) {
                            break;
                        }
                        file2.delete();
                        i4++;
                        i = 0;
                        if (i >= 3) {
                            break;
                        }
                        i3++;
                    }
                    StringBuilder sb = new StringBuilder("Removed ");
                    sb.append(i4);
                    sb.append(" logs in ");
                    sb.append(W);
                    C3075a.m20975a(sb.toString());
                }
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
        }
    }

    /* renamed from: b */
    static long m21242b() {
        if (f16414g == -1) {
            f16414g = m21278g(C3084b.m21130a("local"));
        }
        return f16414g;
    }

    /* renamed from: d */
    public static String m21263d(boolean z) {
        return z ? "https://errlogos.umeng.com/upload" : "https://errlog.umeng.com/upload";
    }

    /* renamed from: j */
    private static String m21286j(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", new Object[]{m21262d(), m21292m(), m21197P(), str});
    }

    /* renamed from: k */
    private static String m21289k(String str) {
        if (!C3081g.m21037b(str)) {
            return "";
        }
        int indexOf = str.indexOf(0);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    /* renamed from: l */
    private static String m21290l(String str) {
        String a = C3076b.m20983a(str, C3093g.m21406w(), C3093g.m21405v());
        if (!str.equals(a)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r7.endsWith(r3) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        if (r7.indexOf(r4, r7.lastIndexOf(95)) != r7.lastIndexOf(r4)) goto L_0x005a;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean[] m21293m(java.lang.String r7) {
        /*
            boolean r0 = com.p259uc.crashsdk.C3093g.m21405v()
            boolean r1 = com.p259uc.crashsdk.C3093g.m21407x()
            r2 = 0
            if (r0 != 0) goto L_0x000d
            if (r1 == 0) goto L_0x006d
        L_0x000d:
            java.lang.String r3 = ".tmp"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L_0x006b
            java.lang.String r3 = ".ec"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x001e
            goto L_0x006b
        L_0x001e:
            char r3 = java.io.File.separatorChar
            int r3 = r7.lastIndexOf(r3)
            if (r3 >= 0) goto L_0x0027
            r3 = 0
        L_0x0027:
            r4 = 0
        L_0x0028:
            r5 = 95
            int r3 = r7.indexOf(r5, r3)
            if (r3 < 0) goto L_0x0034
            int r4 = r4 + 1
            int r3 = r3 + 1
        L_0x0034:
            if (r3 >= 0) goto L_0x0028
            r3 = 8
            if (r4 == r3) goto L_0x003b
            goto L_0x006b
        L_0x003b:
            java.lang.String r3 = com.p259uc.crashsdk.C3093g.m21406w()
            java.lang.String r4 = ".log"
            boolean r6 = r7.endsWith(r4)
            if (r6 != 0) goto L_0x0054
            boolean r0 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r3)
            if (r0 != 0) goto L_0x006b
            boolean r7 = r7.endsWith(r3)
            if (r7 != 0) goto L_0x005a
            goto L_0x006b
        L_0x0054:
            boolean r3 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r3)
            if (r3 == 0) goto L_0x005c
        L_0x005a:
            r0 = 0
            goto L_0x006d
        L_0x005c:
            int r3 = r7.lastIndexOf(r5)
            int r3 = r7.indexOf(r4, r3)
            int r7 = r7.lastIndexOf(r4)
            if (r3 == r7) goto L_0x006d
            goto L_0x005a
        L_0x006b:
            r0 = 0
            r1 = 0
        L_0x006d:
            r7 = 2
            boolean[] r7 = new boolean[r7]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21293m(java.lang.String):boolean[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        r11 = java.lang.Long.parseLong(r10.group(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        if ((r5 - r11) >= 86400000) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = java.lang.Integer.parseInt(r10.group(3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.p259uc.crashsdk.p260a.C3081g.m21027a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r13 = com.p259uc.crashsdk.C3093g.m21353D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r13 < 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r7.replace(r10.start(), r10.end(), java.lang.String.format(java.util.Locale.US, "%s %d %d", new java.lang.Object[]{r1, java.lang.Long.valueOf(r11), java.lang.Integer.valueOf(r0 + 1)}));
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae A[Catch:{ Exception -> 0x0071 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21295n(java.lang.String r17) {
        /*
            r1 = r17
            java.lang.Object r2 = f16424q
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r0.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = com.p259uc.crashsdk.C3093g.m21370U()     // Catch:{ all -> 0x00ee }
            r0.append(r3)     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = "customlog"
            r0.append(r3)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ee }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00ee }
            r3.<init>(r0)     // Catch:{ all -> 0x00ee }
            r0 = 1024(0x400, float:1.435E-42)
            r4 = 0
            java.lang.String r0 = com.p259uc.crashsdk.p260a.C3081g.m21019a(r3, r0, r4)     // Catch:{ all -> 0x00ee }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ee }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ all -> 0x00ee }
            r7.<init>()     // Catch:{ all -> 0x00ee }
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00aa
            r7.append(r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "([^\\n\\r\\t\\s]+) (\\d+) (\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x00ee }
            java.util.regex.Matcher r10 = r0.matcher(r7)     // Catch:{ all -> 0x00ee }
            r0 = 0
        L_0x0041:
            boolean r0 = r10.find(r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = r10.group(r9)     // Catch:{ all -> 0x00ee }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x0056
            int r0 = r10.end()     // Catch:{ all -> 0x00ee }
            goto L_0x0041
        L_0x0056:
            java.lang.String r0 = r10.group(r8)     // Catch:{ all -> 0x00ee }
            long r11 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x00ee }
            long r13 = r5 - r11
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            r8 = 3
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            java.lang.String r0 = r10.group(r8)     // Catch:{ Exception -> 0x0071 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0078
        L_0x0071:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x00ee }
            goto L_0x0077
        L_0x0076:
            r11 = r5
        L_0x0077:
            r0 = 0
        L_0x0078:
            int r13 = com.p259uc.crashsdk.C3093g.m21353D()     // Catch:{ all -> 0x00ee }
            if (r13 < 0) goto L_0x0082
            if (r0 < r13) goto L_0x0082
            r13 = 1
            goto L_0x0083
        L_0x0082:
            r13 = 0
        L_0x0083:
            int r0 = r0 + r9
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ all -> 0x00ee }
            java.lang.String r15 = "%s %d %d"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00ee }
            r8[r4] = r1     // Catch:{ all -> 0x00ee }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00ee }
            r8[r9] = r11     // Catch:{ all -> 0x00ee }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ee }
            r11 = 2
            r8[r11] = r0     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = java.lang.String.format(r14, r15, r8)     // Catch:{ all -> 0x00ee }
            int r8 = r10.start()     // Catch:{ all -> 0x00ee }
            int r10 = r10.end()     // Catch:{ all -> 0x00ee }
            r7.replace(r8, r10, r0)     // Catch:{ all -> 0x00ee }
            r0 = 1
            goto L_0x00ac
        L_0x00aa:
            r0 = 0
            r13 = 0
        L_0x00ac:
            if (r0 != 0) goto L_0x00c4
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x00ee }
            java.lang.String r8 = "%s %d 1\n"
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x00ee }
            r10[r4] = r1     // Catch:{ all -> 0x00ee }
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00ee }
            r10[r9] = r1     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = java.lang.String.format(r0, r8, r10)     // Catch:{ all -> 0x00ee }
            r7.append(r0)     // Catch:{ all -> 0x00ee }
        L_0x00c4:
            r1 = 0
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch:{ Exception -> 0x00e1 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            int r1 = r0.length()     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            r5.write(r0, r4, r1)     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)     // Catch:{ all -> 0x00ee }
            goto L_0x00e8
        L_0x00d9:
            r0 = move-exception
            r1 = r5
            goto L_0x00ea
        L_0x00dc:
            r0 = move-exception
            r1 = r5
            goto L_0x00e2
        L_0x00df:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e1:
            r0 = move-exception
        L_0x00e2:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x00df }
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r1)     // Catch:{ all -> 0x00ee }
        L_0x00e8:
            monitor-exit(r2)     // Catch:{ all -> 0x00ee }
            return r13
        L_0x00ea:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r1)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ee }
            goto L_0x00f2
        L_0x00f1:
            throw r0
        L_0x00f2:
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21295n(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21297o(java.lang.String r14) {
        /*
            java.lang.Object r0 = f16433z
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = f16377A     // Catch:{ all -> 0x0106 }
            r2 = 0
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = com.p259uc.crashsdk.C3084b.m21152i()     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "all:1"
            java.lang.String r1 = com.p259uc.crashsdk.p260a.C3081g.m21020a(r1, r3, r2)     // Catch:{ all -> 0x0106 }
            java.util.Map r1 = m21299p(r1)     // Catch:{ all -> 0x0106 }
            f16377A = r1     // Catch:{ all -> 0x0106 }
        L_0x0018:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "all"
            boolean r1 = r1.containsKey(r3)     // Catch:{ all -> 0x0106 }
            r3 = 1
            if (r1 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Integer> r14 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.String r1 = "all"
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0106 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0106 }
        L_0x002d:
            int r14 = r14.intValue()     // Catch:{ all -> 0x0106 }
            goto L_0x00ac
        L_0x0033:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = f16377A     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x0044
            java.util.Map<java.lang.String, java.lang.Integer> r1 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.Object r14 = r1.get(r14)     // Catch:{ all -> 0x0106 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0106 }
            goto L_0x002d
        L_0x0044:
            java.lang.String r1 = "java"
            boolean r1 = r1.equals(r14)     // Catch:{ all -> 0x0106 }
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "jni"
            boolean r1 = r1.equals(r14)     // Catch:{ all -> 0x0106 }
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "anr"
            boolean r1 = r1.equals(r14)     // Catch:{ all -> 0x0106 }
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "unexp"
            boolean r14 = r1.equals(r14)     // Catch:{ all -> 0x0106 }
            if (r14 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r14 = 0
            goto L_0x0068
        L_0x0067:
            r14 = 1
        L_0x0068:
            if (r14 == 0) goto L_0x007f
            java.util.Map<java.lang.String, java.lang.Integer> r1 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.String r4 = "crash"
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x007f
            java.util.Map<java.lang.String, java.lang.Integer> r14 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.String r1 = "crash"
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0106 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0106 }
            goto L_0x002d
        L_0x007f:
            if (r14 != 0) goto L_0x0096
            java.util.Map<java.lang.String, java.lang.Integer> r14 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.String r1 = "nocrash"
            boolean r14 = r14.containsKey(r1)     // Catch:{ all -> 0x0106 }
            if (r14 == 0) goto L_0x0096
            java.util.Map<java.lang.String, java.lang.Integer> r14 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.String r1 = "nocrash"
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0106 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0106 }
            goto L_0x002d
        L_0x0096:
            java.util.Map<java.lang.String, java.lang.Integer> r14 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.String r1 = "other"
            boolean r14 = r14.containsKey(r1)     // Catch:{ all -> 0x0106 }
            if (r14 == 0) goto L_0x00ab
            java.util.Map<java.lang.String, java.lang.Integer> r14 = f16377A     // Catch:{ all -> 0x0106 }
            java.lang.String r1 = "other"
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0106 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0106 }
            goto L_0x002d
        L_0x00ab:
            r14 = 1
        L_0x00ac:
            if (r14 == 0) goto L_0x0104
            long r4 = (long) r14     // Catch:{ all -> 0x0106 }
            r6 = 1
            r8 = 0
            int r14 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ef
            r10 = 30
            r12 = -2
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x00c2
            r10 = 7
            goto L_0x00d3
        L_0x00c2:
            r12 = -3
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x00cb
            r10 = 15
            goto L_0x00d3
        L_0x00cb:
            r12 = -4
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x00d3
            r10 = 60
        L_0x00d3:
            long r4 = com.p259uc.crashsdk.ProGuard.m20956b()     // Catch:{ all -> 0x0106 }
            int r14 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x00de
            r4 = -1
            goto L_0x00e8
        L_0x00de:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0106 }
            long r12 = r12 - r4
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r12 / r4
        L_0x00e8:
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 > 0) goto L_0x00ee
            r4 = r6
            goto L_0x00ef
        L_0x00ee:
            long r4 = r4 - r10
        L_0x00ef:
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x00f5
        L_0x00f3:
            r2 = 1
            goto L_0x0104
        L_0x00f5:
            int r14 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r14 > 0) goto L_0x00fa
            goto L_0x00f3
        L_0x00fa:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0106 }
            long r6 = r6 % r4
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0104
            goto L_0x00f3
        L_0x0104:
            monitor-exit(r0)     // Catch:{ all -> 0x0106 }
            return r2
        L_0x0106:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0106 }
            goto L_0x010a
        L_0x0109:
            throw r14
        L_0x010a:
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21297o(java.lang.String):boolean");
    }

    /* renamed from: p */
    private static Map<String, Integer> m21299p(String str) {
        HashMap hashMap = new HashMap();
        for (String split : str.split("\\|", 30)) {
            String[] split2 = split.split(":", 3);
            if (split2.length == 2) {
                String trim = split2[0].trim();
                if (!C3081g.m21032a(trim)) {
                    int i = 1;
                    try {
                        i = Integer.parseInt(split2[1].trim(), 10);
                    } catch (Throwable th) {
                        C3081g.m21027a(th);
                    }
                    hashMap.put(trim, Integer.valueOf(i));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: q */
    private static void m21301q(String str) {
        if (C3093g.m21400q()) {
            try {
                m21239aa();
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
            if (str != null && !"".equals(str)) {
                try {
                    File file = new File(C3093g.m21372W());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    StringBuilder sb = new StringBuilder("copy log to: ");
                    sb.append(file);
                    C3075a.m20976a("crashsdk", sb.toString());
                    C3081g.m21026a(new File(str), file);
                } catch (Throwable th2) {
                    C3081g.m21027a(th2);
                }
            }
        }
    }

    /* renamed from: r */
    private static String m21302r(String str) {
        return String.format("$^%s^$", new Object[]{str});
    }

    /* renamed from: s */
    public static void m21304s() {
        Thread.setDefaultUncaughtExceptionHandler(f16396T);
    }

    /* renamed from: t */
    static boolean m21305t() {
        return f16411c.get() || m21207Z();
    }

    /* renamed from: u */
    public static Throwable m21306u() {
        return f16397U;
    }

    /* renamed from: v */
    public static int m21307v() {
        if (C3084b.m21107F() == 5) {
            return f16402Z;
        }
        return 100;
    }

    /* renamed from: w */
    public static void m21308w() {
        long o = (long) C3093g.m21398o();
        if (o >= 0) {
            boolean z = C3084b.m21107F() == 5;
            C3080f.m21013a(0, (Runnable) new C3079e(401));
            if (z) {
                C3079e eVar = new C3079e(402);
                f16400X = eVar;
                C3080f.m21014a(0, eVar, o);
            }
        }
    }

    /* renamed from: x */
    static void m21309x() {
        if (C3084b.f16344c && ProGuard.f16228c && !C3080f.m21016b(f16404aa)) {
            C3080f.m21014a(0, f16404aa, 1000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        return false;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21310y() {
        /*
            java.lang.Object r0 = f16401Y
            monitor-enter(r0)
            java.lang.Runnable r1 = f16400X     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0014
            boolean r2 = f16399W     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0014
            com.p259uc.crashsdk.p260a.C3080f.m21012a(r1)     // Catch:{ all -> 0x0017 }
            r1 = 0
            f16400X = r1     // Catch:{ all -> 0x0017 }
            r1 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r1
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r0 = 0
            return r0
        L_0x0017:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21310y():boolean");
    }

    /* renamed from: z */
    public static void m21311z() {
        if (C3093g.m21400q()) {
            C3080f.m21014a(0, new C3079e(403), 10000);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        mo18728a(thread, th, false);
    }

    /* renamed from: d */
    static String m21262d() {
        String str = f16416i;
        if (str != null) {
            return str;
        }
        String i = m21284i((String) null);
        f16416i = i;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad A[Catch:{ all -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m21269e() {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = ","
            java.lang.String r2 = f16417j
            boolean r2 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r2)
            if (r2 != 0) goto L_0x000f
            java.lang.String r0 = f16417j
            return r0
        L_0x000f:
            r2 = 0
            r3 = 1
            r4 = 0
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x004e }
            r6 = 21
            if (r5 < r6) goto L_0x004f
            java.lang.Class<android.os.Build> r5 = android.os.Build.class
            java.lang.String r6 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ all -> 0x004e }
            r5.setAccessible(r3)     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x004f
            boolean r6 = r5 instanceof java.lang.String[]     // Catch:{ all -> 0x004e }
            if (r6 == 0) goto L_0x004f
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r6.<init>()     // Catch:{ all -> 0x004e }
            int r7 = r5.length     // Catch:{ all -> 0x004e }
            r8 = 0
            r9 = 1
        L_0x0037:
            if (r8 >= r7) goto L_0x0047
            r10 = r5[r8]     // Catch:{ all -> 0x004e }
            if (r9 != 0) goto L_0x0040
            r6.append(r1)     // Catch:{ all -> 0x004e }
        L_0x0040:
            r6.append(r10)     // Catch:{ all -> 0x004e }
            int r8 = r8 + 1
            r9 = 0
            goto L_0x0037
        L_0x0047:
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x004e }
            f16417j = r5     // Catch:{ all -> 0x004e }
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            java.lang.String r5 = f16417j
            boolean r5 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r5)
            if (r5 == 0) goto L_0x0098
            java.lang.String r5 = android.os.Build.CPU_ABI     // Catch:{ all -> 0x005c }
            java.lang.String r6 = android.os.Build.CPU_ABI2     // Catch:{ all -> 0x005d }
            goto L_0x005e
        L_0x005c:
            r5 = r4
        L_0x005d:
            r6 = r4
        L_0x005e:
            boolean r7 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r5)
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x0067
            f16417j = r5
        L_0x0067:
            boolean r5 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r6)
            if (r5 != 0) goto L_0x0098
            if (r7 == 0) goto L_0x0096
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = f16417j
            r5.append(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            f16417j = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = f16417j
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            f16417j = r5
            goto L_0x0098
        L_0x0096:
            f16417j = r6
        L_0x0098:
            java.lang.String r5 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x00d1 }
            java.lang.String r6 = "get"
            r7 = 2
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ all -> 0x00d1 }
            r8[r2] = r0     // Catch:{ all -> 0x00d1 }
            r8[r3] = r0     // Catch:{ all -> 0x00d1 }
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r6, r8)     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00cf
            r0.setAccessible(r3)     // Catch:{ all -> 0x00d1 }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x00d1 }
            java.lang.String r6 = "ro.product.cpu.abi"
            r5[r2] = r6     // Catch:{ all -> 0x00d1 }
            r5[r3] = r4     // Catch:{ all -> 0x00d1 }
            java.lang.Object r5 = r0.invoke(r4, r5)     // Catch:{ all -> 0x00d1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00d1 }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = "ro.product.cpu.abi2"
            r6[r2] = r7     // Catch:{ all -> 0x00cd }
            r6[r3] = r4     // Catch:{ all -> 0x00cd }
            java.lang.Object r0 = r0.invoke(r4, r6)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00cd }
            goto L_0x00d7
        L_0x00cd:
            r0 = move-exception
            goto L_0x00d3
        L_0x00cf:
            r0 = r4
            goto L_0x00d8
        L_0x00d1:
            r0 = move-exception
            r5 = r4
        L_0x00d3:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
            r0 = r4
        L_0x00d7:
            r4 = r5
        L_0x00d8:
            boolean r2 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r4)     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x010c
            java.lang.String r2 = f16417j     // Catch:{ all -> 0x0141 }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x010c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r2.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = f16417j     // Catch:{ all -> 0x0141 }
            r2.append(r3)     // Catch:{ all -> 0x0141 }
            r2.append(r1)     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0141 }
            f16417j = r2     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r2.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = f16417j     // Catch:{ all -> 0x0141 }
            r2.append(r3)     // Catch:{ all -> 0x0141 }
            r2.append(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0141 }
            f16417j = r2     // Catch:{ all -> 0x0141 }
        L_0x010c:
            boolean r2 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r0)     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x0145
            java.lang.String r2 = f16417j     // Catch:{ all -> 0x0141 }
            boolean r2 = r2.contains(r0)     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x0145
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r2.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = f16417j     // Catch:{ all -> 0x0141 }
            r2.append(r3)     // Catch:{ all -> 0x0141 }
            r2.append(r1)     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0141 }
            f16417j = r1     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r1.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = f16417j     // Catch:{ all -> 0x0141 }
            r1.append(r2)     // Catch:{ all -> 0x0141 }
            r1.append(r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0141 }
            f16417j = r0     // Catch:{ all -> 0x0141 }
            goto L_0x0145
        L_0x0141:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x0145:
            java.lang.String r0 = f16417j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21269e():java.lang.String");
    }

    /* renamed from: g */
    private static long m21278g(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", new Class[]{String.class, Long.TYPE});
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, new Object[]{str, Long.valueOf(0)})).longValue();
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        return 0;
    }

    /* renamed from: h */
    private static String m21282h(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", "-");
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: i */
    private static String m21284i(String str) {
        if (str == null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(new Random().nextInt(65536));
            str = sb.toString();
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", new Object[]{m21196O(), C3093g.m21367R(), C3093g.m21369T(), m21282h(Build.MODEL), m21282h(VERSION.RELEASE), str});
    }

    /* renamed from: r */
    public static void m21303r() {
        f16396T = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C3087e());
    }

    /* renamed from: c */
    static void m21256c() {
        f16416i = null;
    }

    /* renamed from: h */
    public static String m21281h() {
        String str = f16420m;
        if (str != null) {
            return str;
        }
        String a = m21211a(Process.myPid());
        f16420m = a;
        return a;
    }

    /* renamed from: b */
    public static boolean m21253b(int i, Object[] objArr) {
        if (i != 451) {
            if (i != 452) {
                if (f16403a) {
                    return false;
                }
                throw new AssertionError();
            } else if (f16403a || objArr != null) {
                String str = objArr[0];
                C3091d dVar = objArr[1];
                return C3081g.m21031a(new File(str), String.format(Locale.US, "%d %d %d %d", new Object[]{Long.valueOf(dVar.f16440a), Long.valueOf(dVar.f16441b), Integer.valueOf(dVar.f16442c), Integer.valueOf(dVar.f16443d)}).getBytes());
            } else {
                throw new AssertionError();
            }
        } else if (f16403a || objArr != null) {
            return m21235a(objArr[0], objArr[1]);
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    private static void m21257c(OutputStream outputStream) {
        String str = "UTF-8";
        if (C3084b.f16345d) {
            String l = C3084b.m21155l();
            f16415h = false;
            if (1 == JNIBridge.cmd(17, l)) {
                File file = new File(l);
                try {
                    byte[] e = C3081g.m21045e(file);
                    if (e != null) {
                        outputStream.write(e);
                    }
                } catch (Throwable th) {
                    m21228a(th, outputStream);
                }
                try {
                    file.delete();
                } catch (Throwable th2) {
                    m21228a(th2, outputStream);
                }
                f16415h = true;
                m21222a(outputStream);
            }
            f16415h = true;
            return;
        }
        File[] fileArr = null;
        int i = 900;
        try {
            i = C3093g.m21357H();
            fileArr = new File("/proc/self/fd").listFiles();
            if (fileArr != null) {
                outputStream.write(String.format(Locale.US, "opened file count: %d, write limit: %d.\n", new Object[]{Integer.valueOf(fileArr.length), Integer.valueOf(i)}).getBytes(str));
            } else {
                outputStream.write("[DEBUG] listFiles failed!\n".getBytes(str));
            }
        } catch (Throwable th3) {
            m21228a(th3, outputStream);
        }
        if (fileArr != null) {
            try {
                if (fileArr.length >= i) {
                    outputStream.write("opened files:\n".getBytes(str));
                    StringBuilder sb = new StringBuilder();
                    for (File file2 : fileArr) {
                        sb.append(file2.getName());
                        sb.append(" -> ");
                        sb.append(file2.getCanonicalPath());
                        sb.append("\n");
                    }
                    outputStream.write(sb.toString().getBytes(str));
                }
            } catch (Throwable th4) {
                m21228a(th4, outputStream);
            }
        }
        m21222a(outputStream);
    }

    /* renamed from: f */
    public static String m21273f() {
        if (C3081g.m21032a(f16418k)) {
            m21200S();
        }
        return f16418k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21264d(java.io.OutputStream r12) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            int r3 = com.p259uc.crashsdk.C3093g.m21358I()     // Catch:{ all -> 0x001c }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "/proc/self/task"
            r4.<init>(r5)     // Catch:{ all -> 0x001a }
            java.io.File[] r2 = r4.listFiles()     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x0016
            return
        L_0x0016:
            int r4 = r2.length     // Catch:{ all -> 0x001a }
            if (r4 >= r3) goto L_0x0023
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x001f
        L_0x001c:
            r4 = move-exception
            r3 = 300(0x12c, float:4.2E-43)
        L_0x001f:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r4)
            r4 = 0
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            java.lang.String r5 = "threads info:\n"
            byte[] r5 = r5.getBytes(r0)     // Catch:{ all -> 0x008e }
            r12.write(r5)     // Catch:{ all -> 0x008e }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "threads count: %d, dump limit: %d.\n"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x008e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x008e }
            r8[r1] = r4     // Catch:{ all -> 0x008e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x008e }
            r4 = 1
            r8[r4] = r3     // Catch:{ all -> 0x008e }
            java.lang.String r3 = java.lang.String.format(r5, r6, r8)     // Catch:{ all -> 0x008e }
            byte[] r3 = r3.getBytes(r0)     // Catch:{ all -> 0x008e }
            r12.write(r3)     // Catch:{ all -> 0x008e }
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r0)     // Catch:{ all -> 0x008e }
            r12.write(r3)     // Catch:{ all -> 0x008e }
            int r3 = r2.length     // Catch:{ all -> 0x008e }
            r5 = 0
        L_0x0059:
            if (r5 >= r3) goto L_0x0092
            r6 = r2[r5]     // Catch:{ all -> 0x008e }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x008e }
            java.lang.String r9 = r6.getPath()     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "comm"
            r8.<init>(r9, r10)     // Catch:{ all -> 0x008e }
            r9 = 128(0x80, float:1.794E-43)
            java.lang.String r8 = com.p259uc.crashsdk.p260a.C3081g.m21019a(r8, r9, r1)     // Catch:{ all -> 0x008e }
            java.lang.String r8 = m21289k(r8)     // Catch:{ all -> 0x008e }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "%5s %s\n"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x008e }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x008e }
            r11[r1] = r6     // Catch:{ all -> 0x008e }
            r11[r4] = r8     // Catch:{ all -> 0x008e }
            java.lang.String r6 = java.lang.String.format(r9, r10, r11)     // Catch:{ all -> 0x008e }
            byte[] r6 = r6.getBytes(r0)     // Catch:{ all -> 0x008e }
            r12.write(r6)     // Catch:{ all -> 0x008e }
            int r5 = r5 + 1
            goto L_0x0059
        L_0x008e:
            r0 = move-exception
            m21228a(r0, r12)
        L_0x0092:
            m21222a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21264d(java.io.OutputStream):void");
    }

    /* renamed from: j */
    public static void m21287j() {
        try {
            StrictMode.setThreadPolicy(new Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
    }

    /* renamed from: k */
    public static String m21288k() {
        if (C3081g.m21032a(f16430w)) {
            synchronized (f16432y) {
                f16430w = C3081g.m21020a(C3084b.m21149f(), f16431x, true);
            }
        }
        return f16430w;
    }

    /* JADX INFO: used method not loaded: com.uc.crashsdk.f.a(int):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x016e, code lost:
        if (com.p259uc.crashsdk.C3084b.m21157n() != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0174, code lost:
        if (com.p259uc.crashsdk.p260a.C3078d.m21005d() != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0176, code lost:
        com.p259uc.crashsdk.p260a.C3075a.m20980c("DEBUG", com.p259uc.crashsdk.p260a.C3078d.m21003b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x017f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0186, code lost:
        if (m21260c(com.p259uc.crashsdk.export.LogType.UNEXP_TYPE) != false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0188, code lost:
        com.p259uc.crashsdk.p260a.C3075a.m20981d("DEBUG", "unexp sample miss");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x018f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0190, code lost:
        r8 = com.p259uc.crashsdk.JNIBridge.nativeGenerateUnexpLog((long) com.p259uc.crashsdk.C3093g.m21398o(), com.p259uc.crashsdk.C3093g.m21399p());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x019d, code lost:
        if (r8 == 0) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x019f, code lost:
        com.p259uc.crashsdk.C3092f.m21329a(11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01a6, code lost:
        if ((r8 & 4352) == 0) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01a8, code lost:
        f16402Z = 105;
        r8 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ae, code lost:
        com.p259uc.crashsdk.C3092f.m21329a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01b4, code lost:
        if ((r8 & com.p259uc.crashsdk.export.LogType.UNEXP_EXIT) == 0) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01b6, code lost:
        f16402Z = 104;
        r8 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01bf, code lost:
        if ((r8 & com.p259uc.crashsdk.export.LogType.UNEXP_RESTART) == 0) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01c1, code lost:
        f16402Z = 106;
        r8 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01ca, code lost:
        if ((r8 & com.p259uc.crashsdk.export.LogType.UNEXP_ANR) == 0) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01cc, code lost:
        f16402Z = 103;
        com.p259uc.crashsdk.C3092f.m21329a(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01d6, code lost:
        if ((r8 & com.p259uc.crashsdk.export.LogType.UNEXP_LOW_MEMORY) == 0) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01d8, code lost:
        f16402Z = 107;
        com.p259uc.crashsdk.C3092f.m21329a(29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01e0, code lost:
        f16402Z = 102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01e4, code lost:
        m21230a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01e7, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        f16400X = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01ea, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x01ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x010e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21218a(int r7, java.lang.Object[] r8) {
        /*
            r0 = 29
            r1 = 0
            r2 = 10
            r3 = 0
            r4 = 1
            switch(r7) {
                case 401: goto L_0x01f3;
                case 402: goto L_0x015e;
                case 403: goto L_0x015a;
                case 404: goto L_0x000a;
                case 405: goto L_0x0141;
                case 406: goto L_0x011b;
                case 407: goto L_0x0112;
                case 408: goto L_0x00d6;
                case 409: goto L_0x00d2;
                case 410: goto L_0x00ce;
                case 411: goto L_0x00b5;
                case 412: goto L_0x007c;
                case 413: goto L_0x0076;
                case 414: goto L_0x004f;
                case 415: goto L_0x000f;
                case 416: goto L_0x004b;
                default: goto L_0x000a;
            }
        L_0x000a:
            boolean r7 = f16403a
            if (r7 == 0) goto L_0x0215
            return
        L_0x000f:
            boolean r7 = f16403a
            if (r7 != 0) goto L_0x001c
            if (r8 == 0) goto L_0x0016
            goto L_0x001c
        L_0x0016:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L_0x001c:
            r7 = r8[r3]
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r1 = r0.getTimeInMillis()
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x003f
            com.p259uc.crashsdk.p260a.C3082h.m21085g()
            r7 = 100
            com.p259uc.crashsdk.C3092f.m21329a(r7)
            m21241b(r4, r4)
            com.p259uc.crashsdk.p260a.C3082h.m21071b()
            goto L_0x0048
        L_0x003f:
            com.p259uc.crashsdk.p260a.C3082h.m21086h()
            com.p259uc.crashsdk.p260a.C3082h.m21087i()
            com.p259uc.crashsdk.p260a.C3082h.m21080c()
        L_0x0048:
            m21229a(r0)
        L_0x004b:
            m21203V()
            return
        L_0x004f:
            android.content.Context r7 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x0071 }
            boolean r7 = m21265d(r7)     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x005a
            return
        L_0x005a:
            int r7 = f16390N     // Catch:{ all -> 0x0071 }
            int r7 = r7 + r4
            f16390N = r7     // Catch:{ all -> 0x0071 }
            if (r7 < r2) goto L_0x006d
            boolean r7 = com.p259uc.crashsdk.C3084b.f16345d     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x006c
            r7 = 130(0x82, float:1.82E-43)
            java.lang.String r8 = "(get failed)"
            com.p259uc.crashsdk.JNIBridge.set(r7, r8)     // Catch:{ all -> 0x0071 }
        L_0x006c:
            return
        L_0x006d:
            m21204W()     // Catch:{ all -> 0x0071 }
            return
        L_0x0071:
            r7 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r7)
            return
        L_0x0076:
            r7 = 8
            com.p259uc.crashsdk.JNIBridge.cmd(r7)
            return
        L_0x007c:
            boolean r7 = f16394R
            if (r7 != 0) goto L_0x0094
            boolean r7 = com.p259uc.crashsdk.C3084b.m21168y()
            if (r7 == 0) goto L_0x0094
            boolean r7 = com.p259uc.crashsdk.C3093g.m21360K()
            if (r7 == 0) goto L_0x0094
            android.content.Context r7 = com.p259uc.crashsdk.p260a.C3081g.m21018a()
            m21245b(r7)
            return
        L_0x0094:
            boolean r7 = f16394R
            if (r7 == 0) goto L_0x00b4
            boolean r7 = com.p259uc.crashsdk.C3084b.m21168y()
            if (r7 == 0) goto L_0x00a4
            boolean r7 = com.p259uc.crashsdk.C3093g.m21360K()
            if (r7 != 0) goto L_0x00b4
        L_0x00a4:
            android.content.Context r7 = com.p259uc.crashsdk.p260a.C3081g.m21018a()
            com.uc.crashsdk.e$c r8 = f16393Q     // Catch:{ all -> 0x00b0 }
            r7.unregisterReceiver(r8)     // Catch:{ all -> 0x00b0 }
            f16394R = r3     // Catch:{ all -> 0x00b0 }
            return
        L_0x00b0:
            r7 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r7)
        L_0x00b4:
            return
        L_0x00b5:
            boolean r7 = com.p259uc.crashsdk.C3084b.f16345d
            if (r7 == 0) goto L_0x00cd
            java.lang.String r7 = "jni"
            boolean r7 = m21260c(r7)
            r8 = 28
            com.p259uc.crashsdk.JNIBridge.set(r8, r7)
            java.lang.String r7 = "anr"
            boolean r7 = m21260c(r7)
            com.p259uc.crashsdk.JNIBridge.set(r0, r7)
        L_0x00cd:
            return
        L_0x00ce:
            m21238a(r3, r4)
            return
        L_0x00d2:
            m21241b(r3, r3)
            return
        L_0x00d6:
            java.lang.Object r7 = f16405ab
            monitor-enter(r7)
            boolean r8 = f16406ac     // Catch:{ all -> 0x010f }
            if (r8 != 0) goto L_0x010d
            boolean r8 = com.p259uc.crashsdk.C3093g.m21364O()     // Catch:{ all -> 0x010f }
            if (r8 == 0) goto L_0x010d
            boolean r8 = com.p259uc.crashsdk.C3084b.m21166w()     // Catch:{ all -> 0x010f }
            if (r8 != 0) goto L_0x00ea
            goto L_0x010d
        L_0x00ea:
            com.p259uc.crashsdk.C3084b.m21159p()     // Catch:{ all -> 0x010f }
            com.p259uc.crashsdk.p260a.C3082h.m21084f()     // Catch:{ all -> 0x010f }
            com.p259uc.crashsdk.C3092f.m21343c()     // Catch:{ all -> 0x010f }
            boolean r8 = com.p259uc.crashsdk.C3084b.m21104C()     // Catch:{ all -> 0x010f }
            if (r8 == 0) goto L_0x00fc
            m21183B()     // Catch:{ all -> 0x010f }
        L_0x00fc:
            boolean r8 = com.p259uc.crashsdk.C3093g.m21364O()     // Catch:{ all -> 0x010f }
            if (r8 == 0) goto L_0x0109
            java.util.Calendar r8 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x010f }
            m21229a(r8)     // Catch:{ all -> 0x010f }
        L_0x0109:
            f16406ac = r4     // Catch:{ all -> 0x010f }
            monitor-exit(r7)     // Catch:{ all -> 0x010f }
            return
        L_0x010d:
            monitor-exit(r7)     // Catch:{ all -> 0x010f }
            return
        L_0x010f:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x010f }
            throw r8
        L_0x0112:
            com.p259uc.crashsdk.ProGuard.m20962d()     // Catch:{ all -> 0x0116 }
            return
        L_0x0116:
            r7 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r7)
            return
        L_0x011b:
            boolean r7 = f16403a
            if (r7 != 0) goto L_0x0128
            if (r8 == 0) goto L_0x0122
            goto L_0x0128
        L_0x0122:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L_0x0128:
            r7 = r8[r3]
            java.lang.String r7 = (java.lang.String) r7
            r0 = r8[r4]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 2
            r8 = r8[r1]
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            m21226a(r7, r0, r8)
            return
        L_0x0141:
            f16388L = r3
            java.lang.StringBuilder r7 = m21205X()
            java.lang.String r8 = com.p259uc.crashsdk.C3084b.m21146d()
            if (r7 == 0) goto L_0x0159
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            java.lang.String r7 = r7.toString()
            com.p259uc.crashsdk.p260a.C3081g.m21030a(r0, r7)
        L_0x0159:
            return
        L_0x015a:
            m21239aa()
            return
        L_0x015e:
            java.lang.Object r7 = f16401Y
            monitor-enter(r7)
            java.lang.Runnable r8 = f16400X     // Catch:{ all -> 0x01f0 }
            if (r8 != 0) goto L_0x0167
            monitor-exit(r7)     // Catch:{ all -> 0x01f0 }
            return
        L_0x0167:
            f16399W = r4     // Catch:{ all -> 0x01f0 }
            monitor-exit(r7)     // Catch:{ all -> 0x01f0 }
            boolean r8 = com.p259uc.crashsdk.C3084b.m21157n()
            if (r8 != 0) goto L_0x01ef
            boolean r8 = com.p259uc.crashsdk.p260a.C3078d.m21005d()
            if (r8 != 0) goto L_0x0180
            java.lang.String r7 = "DEBUG"
            java.lang.String r8 = com.p259uc.crashsdk.p260a.C3078d.m21003b()
            com.p259uc.crashsdk.p260a.C3075a.m20980c(r7, r8)
            return
        L_0x0180:
            java.lang.String r8 = "unexp"
            boolean r8 = m21260c(r8)
            if (r8 != 0) goto L_0x0190
            java.lang.String r7 = "DEBUG"
            java.lang.String r8 = "unexp sample miss"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r7, r8)
            return
        L_0x0190:
            int r8 = com.p259uc.crashsdk.C3093g.m21398o()
            long r5 = (long) r8
            int r8 = com.p259uc.crashsdk.C3093g.m21399p()
            int r8 = com.p259uc.crashsdk.JNIBridge.nativeGenerateUnexpLog(r5, r8)
            if (r8 == 0) goto L_0x01e7
            r3 = 11
            com.p259uc.crashsdk.C3092f.m21329a(r3)
            r3 = r8 & 4352(0x1100, float:6.098E-42)
            if (r3 == 0) goto L_0x01b2
            r8 = 105(0x69, float:1.47E-43)
            f16402Z = r8
            r8 = 30
        L_0x01ae:
            com.p259uc.crashsdk.C3092f.m21329a(r8)
            goto L_0x01e4
        L_0x01b2:
            r3 = r8 & 8448(0x2100, float:1.1838E-41)
            if (r3 == 0) goto L_0x01bd
            r8 = 104(0x68, float:1.46E-43)
            f16402Z = r8
            r8 = 31
            goto L_0x01ae
        L_0x01bd:
            r3 = r8 & 16640(0x4100, float:2.3318E-41)
            if (r3 == 0) goto L_0x01c8
            r8 = 106(0x6a, float:1.49E-43)
            f16402Z = r8
            r8 = 32
            goto L_0x01ae
        L_0x01c8:
            r3 = r8 & 1280(0x500, float:1.794E-42)
            if (r3 == 0) goto L_0x01d4
            r8 = 103(0x67, float:1.44E-43)
            f16402Z = r8
            com.p259uc.crashsdk.C3092f.m21329a(r2)
            goto L_0x01e4
        L_0x01d4:
            r8 = r8 & 2304(0x900, float:3.229E-42)
            if (r8 == 0) goto L_0x01e0
            r8 = 107(0x6b, float:1.5E-43)
            f16402Z = r8
            com.p259uc.crashsdk.C3092f.m21329a(r0)
            goto L_0x01e4
        L_0x01e0:
            r8 = 102(0x66, float:1.43E-43)
            f16402Z = r8
        L_0x01e4:
            m21230a(r4)
        L_0x01e7:
            monitor-enter(r7)
            f16400X = r1     // Catch:{ all -> 0x01ec }
            monitor-exit(r7)     // Catch:{ all -> 0x01ec }
            return
        L_0x01ec:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01ec }
            throw r8
        L_0x01ef:
            return
        L_0x01f0:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01f0 }
            throw r8
        L_0x01f3:
            int r7 = com.p259uc.crashsdk.C3084b.m21107F()
            r8 = 5
            if (r7 != r8) goto L_0x01fc
            r7 = 1
            goto L_0x01fd
        L_0x01fc:
            r7 = 0
        L_0x01fd:
            if (r7 == 0) goto L_0x0202
            r7 = 1
            goto L_0x0204
        L_0x0202:
            r7 = 0
        L_0x0204:
            com.p259uc.crashsdk.JNIBridge.nativeCmd(r2, r7, r1, r1)
            com.p259uc.crashsdk.ProGuard.f16228c = r4
            com.p259uc.crashsdk.ProGuard.m20954a(r3)
            f16388L = r4
            m21206Y()
            m21309x()
            return
        L_0x0215:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            goto L_0x021c
        L_0x021b:
            throw r7
        L_0x021c:
            goto L_0x021b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21218a(int, java.lang.Object[]):void");
    }

    /* renamed from: f */
    private static void m21275f(OutputStream outputStream) {
        String str;
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m21228a(th, outputStream);
        }
        try {
            if (f16409af) {
                str = m21302r("LASTVER");
            } else {
                str = ProGuard.m20971m();
            }
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", new Object[]{str}).getBytes("UTF-8"));
        } catch (Throwable th2) {
            m21228a(th2, outputStream);
        }
        try {
            ArrayList<String> arrayList = f16425r;
            synchronized (arrayList) {
                if (f16427t != null) {
                    outputStream.write(String.format(Locale.US, "generating log: %s\n", new Object[]{f16427t}).getBytes("UTF-8"));
                }
                if (f16426s > 0 || arrayList.size() > 0) {
                    outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", new Object[]{Integer.valueOf(f16426s)}).getBytes("UTF-8"));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        outputStream.write(String.format(Locale.US, "* %s\n", new Object[]{(String) it.next()}).getBytes("UTF-8"));
                    }
                }
            }
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "dumping all threads: %s\n", new Object[]{Boolean.valueOf(f16428u)}).getBytes("UTF-8"));
            String str2 = f16429v;
            if (str2 != null) {
                outputStream.write(String.format(locale, "dumping threads: %s\n", new Object[]{str2}).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            m21228a(th3, outputStream);
        }
        m21222a(outputStream);
    }

    /* renamed from: g */
    static String m21279g() {
        StringBuilder sb;
        String str = " kB\n";
        try {
            sb = new StringBuilder();
            sb.append("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / 1024);
            sb.append(str);
            sb.append("JavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / 1024);
            sb.append(str);
            sb.append("JavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / 1024);
            sb.append(str);
            sb.append("NativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / 1024);
            sb.append(str);
            sb.append("NativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / 1024);
            sb.append(str);
            sb.append("NativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / 1024);
            sb.append(str);
            ActivityManager activityManager = (ActivityManager) C3081g.m21018a().getSystemService("activity");
            if (activityManager != null) {
                MemoryInfo memoryInfo = new MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                sb.append("availMem:   ");
                sb.append(memoryInfo.availMem / 1024);
                sb.append(str);
                sb.append("threshold:  ");
                sb.append(memoryInfo.threshold / 1024);
                sb.append(str);
                sb.append("lowMemory:  ");
                sb.append(memoryInfo.lowMemory);
                sb.append("\n");
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
            return "";
        }
        return sb.toString();
    }

    /* renamed from: l */
    public static void m21291l() {
        if (!f16409af) {
            C3080f.m21014a(1, new C3079e(411), 1000);
        }
    }

    /* renamed from: i */
    static boolean m21285i() {
        return f16412d;
    }

    /* renamed from: o */
    public static void m21296o() {
        String str;
        Throwable th;
        if (C3081g.m21032a(f16378B)) {
            String str2 = null;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(C3093g.m21370U());
                sb.append("unique");
                File file = new File(sb.toString());
                if (file.exists()) {
                    str = C3081g.m21019a(file, 48, false);
                    if (str != null) {
                        try {
                            if (str.length() == 36) {
                                str2 = str.replaceAll("[^0-9a-zA-Z-]", "-");
                            }
                        } catch (Exception e) {
                            C3081g.m21027a((Throwable) e);
                        } catch (Throwable th2) {
                            th = th2;
                            C3081g.m21027a(th);
                            str2 = str;
                            f16378B = str2;
                        }
                    }
                    str2 = str;
                }
                if (C3081g.m21032a(str2)) {
                    C3084b.m21105D();
                    str2 = UUID.randomUUID().toString();
                    if (!C3081g.m21032a(str2)) {
                        C3081g.m21031a(file, str2.getBytes());
                    }
                }
            } catch (Throwable th3) {
                str = str2;
                th = th3;
                C3081g.m21027a(th);
                str2 = str;
                f16378B = str2;
            }
            f16378B = str2;
        }
    }

    /* renamed from: p */
    public static String m21298p() {
        return f16378B;
    }

    /* renamed from: q */
    static void m21300q() {
        f16391O = false;
        if (!C3084b.m21168y()) {
            C3080f.m21014a(3, new C3079e(416), 11000);
        }
        if (!m21202U()) {
            f16390N = 0;
            m21204W();
        }
    }

    /* renamed from: b */
    private static void m21248b(OutputStream outputStream, String str, String str2) {
        String str3;
        String str4;
        OutputStream outputStream2 = outputStream;
        String str5 = "\n";
        String str6 = "UTF-8";
        try {
            outputStream2.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes(str6));
        } catch (Throwable th) {
            m21228a(th, outputStream2);
        }
        try {
            Locale locale = Locale.US;
            outputStream2.write(String.format(locale, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", new Object[]{Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), m21292m()}).getBytes(str6));
            String str7 = "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n";
            Object[] objArr = new Object[3];
            objArr[0] = m21269e();
            if (C3081g.m21032a(f16419l)) {
                m21200S();
            }
            objArr[1] = f16419l;
            objArr[2] = m21273f();
            outputStream2.write(String.format(locale, str7, objArr).getBytes(str6));
        } catch (Throwable th2) {
            m21228a(th2, outputStream2);
        }
        try {
            Locale locale2 = Locale.US;
            outputStream2.write(String.format(locale2, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", new Object[]{Build.MODEL, VERSION.RELEASE, Integer.valueOf(VERSION.SDK_INT)}).getBytes(str6));
            StringBuilder sb = new StringBuilder("Build fingerprint: '");
            sb.append(Build.FINGERPRINT);
            sb.append("'\n");
            outputStream2.write(sb.toString().getBytes(str6));
            String str8 = "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n";
            Object[] objArr2 = new Object[4];
            objArr2[0] = m21216a(new Date(f16410b));
            objArr2[1] = Long.valueOf(Runtime.getRuntime().maxMemory());
            objArr2[2] = C3081g.m21041d();
            objArr2[3] = C3084b.m21168y() ? "fg" : "bg";
            outputStream2.write(String.format(locale2, str8, objArr2).getBytes(str6));
        } catch (Throwable th3) {
            m21228a(th3, outputStream2);
        }
        try {
            Locale locale3 = Locale.US;
            outputStream2.write(String.format(locale3, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", new Object[]{C3093g.m21367R(), C3093g.m21368S(), C3093g.m21369T(), Integer.valueOf(ProGuard.m20960c())}).getBytes(str6));
            String str9 = "0";
            String str10 = "";
            if (C3084b.f16345d) {
                String nativeGet = JNIBridge.nativeGet(1, 0, null);
                str4 = JNIBridge.nativeGet(2, 0, null);
                str9 = nativeGet;
            } else {
                str4 = str10;
            }
            outputStream2.write(String.format(locale3, "CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/arch: %s/target: %s'\n", new Object[]{"3.2.0.4", str9, "210105150455", str4, "release"}).getBytes(str6));
            if (str != null) {
                str10 = str;
            }
            int lastIndexOf = str10.lastIndexOf(47) + 1;
            StringBuilder sb2 = new StringBuilder("Report Name: ");
            sb2.append(str10.substring(lastIndexOf));
            sb2.append(str5);
            outputStream2.write(sb2.toString().getBytes(str6));
        } catch (Throwable th4) {
            m21228a(th4, outputStream2);
        }
        try {
            if (f16409af) {
                str3 = m21302r("UUID");
            } else {
                str3 = f16378B;
            }
            outputStream2.write(String.format("UUID: %s\n", new Object[]{str3}).getBytes(str6));
            StringBuilder sb3 = new StringBuilder("Log Type: ");
            sb3.append(str2);
            sb3.append(str5);
            outputStream2.write(sb3.toString().getBytes(str6));
        } catch (Throwable th5) {
            m21228a(th5, outputStream2);
        }
        try {
            String B = C3084b.m21103B();
            if (C3081g.m21032a(B)) {
                B = "(none)";
            }
            StringBuilder sb4 = new StringBuilder("Activity: ");
            sb4.append(B);
            sb4.append(str5);
            outputStream2.write(sb4.toString().getBytes(str6));
        } catch (Throwable th6) {
            m21228a(th6, outputStream2);
        }
        m21222a(outputStream);
        try {
            ProGuard.m20947a(outputStream2, str6);
            if (f16409af) {
                f16415h = false;
                outputStream2.write(m21302r("HEADER").getBytes(str6));
                f16415h = true;
            }
        } catch (Throwable th7) {
            m21228a(th7, outputStream2);
        }
        m21222a(outputStream);
    }

    /* renamed from: m */
    static String m21292m() {
        return m21216a(new Date());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m21265d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z = false;
        if (activityManager == null) {
            return false;
        }
        List processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState == null) {
            return false;
        }
        int myPid = Process.myPid();
        Iterator it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ProcessErrorStateInfo processErrorStateInfo = (ProcessErrorStateInfo) it.next();
            if (processErrorStateInfo.pid == myPid) {
                f16391O = true;
                if (m21195N()) {
                    StringBuilder sb = new StringBuilder("ANR occurred in process: ");
                    sb.append(processErrorStateInfo.processName);
                    C3075a.m20981d("crashsdk", sb.toString());
                }
                if (C3084b.f16345d) {
                    JNIBridge.set(130, processErrorStateInfo.longMsg);
                }
                z = true;
            }
        }
        if (!z && C3084b.f16345d) {
            m21203V();
        }
        return true;
    }

    /* renamed from: a */
    static void m21230a(boolean z) {
        try {
            if (C3084b.m21165v()) {
                File[] listFiles = new File(C3093g.m21371V()).listFiles();
                if (listFiles != null) {
                    int l = C3093g.m21395l();
                    int m = C3093g.m21396m();
                    if (listFiles.length >= Math.min(l, m)) {
                        int i = 0;
                        int i2 = 0;
                        for (File b : listFiles) {
                            if (m21254b(b)) {
                                i++;
                            } else {
                                i2++;
                            }
                        }
                        int i3 = (!z || i < l) ? 0 : (i - l) + 1;
                        int i4 = (z || i2 < m) ? 0 : (i2 - m) + 1;
                        if (i3 != 0 || i4 != 0) {
                            Arrays.sort(listFiles, new C3089b(0));
                            int i5 = i3;
                            int i6 = i4;
                            for (File file : listFiles) {
                                boolean b2 = m21254b(file);
                                String str = "crashsdk";
                                if (b2 && i5 > 0) {
                                    StringBuilder sb = new StringBuilder("Delete oldest crash log: ");
                                    sb.append(file.getPath());
                                    C3075a.m20976a(str, sb.toString());
                                    file.delete();
                                    i5--;
                                } else if (!b2 && i6 > 0) {
                                    StringBuilder sb2 = new StringBuilder("Delete oldest custom log: ");
                                    sb2.append(file.getPath());
                                    C3075a.m20976a(str, sb2.toString());
                                    file.delete();
                                    i6--;
                                }
                                if (i5 == 0 && i6 == 0) {
                                    break;
                                }
                            }
                            C3092f.m21330a(16, i3 + i4);
                            if (i3 > 0) {
                                C3092f.m21330a(22, i3);
                            }
                            if (i4 > 0) {
                                C3092f.m21330a(23, i4);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
    }

    /* renamed from: n */
    public static void m21294n() {
        f16410b = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[SYNTHETIC, Splitter:B:33:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b A[Catch:{ all -> 0x0096, all -> 0x00bd }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21271e(java.io.OutputStream r11) {
        /*
            java.lang.String r0 = "UTF-8"
            boolean r1 = com.p259uc.crashsdk.C3084b.f16345d
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r1 = "solib build id:\n"
            byte[] r1 = r1.getBytes(r0)     // Catch:{ all -> 0x0011 }
            r11.write(r1)     // Catch:{ all -> 0x0011 }
            goto L_0x0015
        L_0x0011:
            r1 = move-exception
            m21228a(r1, r11)
        L_0x0015:
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00c3 }
            r2.<init>()     // Catch:{ all -> 0x00c3 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x00c3 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "/proc/self/maps"
            r4.<init>(r5)     // Catch:{ all -> 0x00c3 }
            r3.<init>(r4)     // Catch:{ all -> 0x00c3 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00bf }
            r5 = 512(0x200, float:7.175E-43)
            r4.<init>(r3, r5)     // Catch:{ all -> 0x00bf }
        L_0x002e:
            java.lang.String r1 = r4.readLine()     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x00b9
            java.lang.String r5 = ".so"
            boolean r5 = r1.endsWith(r5)     // Catch:{ all -> 0x00bd }
            if (r5 == 0) goto L_0x002e
            r5 = 47
            int r5 = r1.indexOf(r5)     // Catch:{ all -> 0x00bd }
            r6 = -1
            if (r5 == r6) goto L_0x002e
            java.lang.String r1 = r1.substring(r5)     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = "/data/"
            boolean r5 = r1.contains(r5)     // Catch:{ all -> 0x00bd }
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x005e
            java.lang.String r5 = com.p259uc.crashsdk.ProGuard.f16226a     // Catch:{ all -> 0x00bd }
            boolean r5 = r1.contains(r5)     // Catch:{ all -> 0x00bd }
            if (r5 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r5 = 0
            goto L_0x005f
        L_0x005e:
            r5 = 1
        L_0x005f:
            if (r5 == 0) goto L_0x002e
            boolean r5 = r2.contains(r1)     // Catch:{ all -> 0x00bd }
            if (r5 != 0) goto L_0x002e
            r2.add(r1)     // Catch:{ all -> 0x00bd }
            boolean r5 = f16409af     // Catch:{ all -> 0x00bd }
            r8 = 2
            if (r5 == 0) goto L_0x009b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r5.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r9 = "SOBUILDID"
            java.lang.String r10 = "$^%s`%s^$"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0096 }
            r8[r6] = r9     // Catch:{ all -> 0x0096 }
            r8[r7] = r1     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = java.lang.String.format(r10, r8)     // Catch:{ all -> 0x0096 }
            r5.append(r1)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "\n"
            r5.append(r1)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0096 }
            byte[] r1 = r1.getBytes(r0)     // Catch:{ all -> 0x0096 }
            r11.write(r1)     // Catch:{ all -> 0x0096 }
            goto L_0x002e
        L_0x0096:
            r1 = move-exception
            m21228a(r1, r11)     // Catch:{ all -> 0x00bd }
            goto L_0x002e
        L_0x009b:
            r5 = 3
            r9 = 0
            java.lang.String r5 = com.p259uc.crashsdk.JNIBridge.nativeGet(r5, r9, r1)     // Catch:{ all -> 0x00bd }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x00bd }
            java.lang.String r10 = "%s: %s\n"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00bd }
            r8[r6] = r1     // Catch:{ all -> 0x00bd }
            r8[r7] = r5     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = java.lang.String.format(r9, r10, r8)     // Catch:{ all -> 0x00bd }
            byte[] r1 = r1.getBytes(r0)     // Catch:{ all -> 0x00bd }
            r11.write(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x002e
        L_0x00b9:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r3)
            goto L_0x00cb
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c1
        L_0x00bf:
            r0 = move-exception
            r4 = r1
        L_0x00c1:
            r1 = r3
            goto L_0x00c5
        L_0x00c3:
            r0 = move-exception
            r4 = r1
        L_0x00c5:
            m21228a(r0, r11)     // Catch:{ all -> 0x00d2 }
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r1)
        L_0x00cb:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r4)
            m21222a(r11)
            return
        L_0x00d2:
            r11 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r1)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r4)
            goto L_0x00db
        L_0x00da:
            throw r11
        L_0x00db:
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21271e(java.io.OutputStream):void");
    }

    /* renamed from: c */
    static boolean m21260c(String str) {
        if (f16409af) {
            return true;
        }
        try {
            return m21297o(str);
        } catch (Throwable th) {
            C3081g.m21027a(th);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m21266d(String str) {
        try {
            if (C3081g.m21037b(str) && str.startsWith("lib") && str.endsWith(".so")) {
                System.loadLibrary(str.substring(3, str.length() - 3));
                return true;
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        return false;
    }

    /* renamed from: c */
    static void m21258c(boolean z) {
        boolean z2 = true;
        if (!f16394R ? !z || !C3093g.m21360K() : z && C3093g.m21360K()) {
            z2 = false;
        }
        if (z2) {
            C3079e eVar = f16395S;
            if (C3080f.m21016b(eVar)) {
                C3080f.m21012a((Runnable) eVar);
            }
            C3080f.m21014a(0, eVar, 3000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r4.contains(r8) == false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[Catch:{ all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0036 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m21214a(java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0079 }
            r1 = 26
            java.lang.String r2 = "ps"
            if (r0 < r1) goto L_0x000f
            java.lang.String r0 = "-ef"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}     // Catch:{ all -> 0x0079 }
            goto L_0x0013
        L_0x000f:
            java.lang.String[] r0 = new java.lang.String[]{r2}     // Catch:{ all -> 0x0079 }
        L_0x0013:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0079 }
            java.lang.Process r0 = r1.exec(r0)     // Catch:{ all -> 0x0079 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0079 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0079 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ all -> 0x0079 }
            r2.<init>(r0)     // Catch:{ all -> 0x0079 }
            r1.<init>(r2)     // Catch:{ all -> 0x0079 }
            boolean r0 = com.p259uc.crashsdk.p260a.C3081g.m21037b(r8)     // Catch:{ all -> 0x0079 }
            boolean r2 = com.p259uc.crashsdk.p260a.C3081g.m21037b(r9)     // Catch:{ all -> 0x0079 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0079 }
            r3.<init>()     // Catch:{ all -> 0x0079 }
        L_0x0036:
            java.lang.String r4 = r1.readLine()     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = "UTF-8"
            if (r4 == 0) goto L_0x0074
            r6 = 1
            if (r0 == 0) goto L_0x0047
            boolean r7 = r4.contains(r8)     // Catch:{ all -> 0x0079 }
            if (r7 != 0) goto L_0x0061
        L_0x0047:
            if (r2 == 0) goto L_0x0050
            boolean r7 = r4.contains(r9)     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x0050
            goto L_0x0061
        L_0x0050:
            r7 = 47
            int r7 = r4.indexOf(r7)     // Catch:{ all -> 0x0079 }
            if (r7 >= 0) goto L_0x0060
            r7 = 46
            int r7 = r4.indexOf(r7)     // Catch:{ all -> 0x0079 }
            if (r7 > 0) goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            if (r6 == 0) goto L_0x0036
            byte[] r4 = r4.getBytes(r5)     // Catch:{ all -> 0x0079 }
            r3.write(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "\n"
            byte[] r4 = r4.getBytes(r5)     // Catch:{ all -> 0x0079 }
            r3.write(r4)     // Catch:{ all -> 0x0079 }
            goto L_0x0036
        L_0x0074:
            java.lang.String r8 = r3.toString(r5)     // Catch:{ all -> 0x0079 }
            return r8
        L_0x0079:
            r8 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r8)
            java.lang.String r8 = "exception exists."
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21214a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static BufferedReader m21210a(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i = 8192;
        while (bufferedReader == null && i > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i);
            } catch (Throwable unused) {
                i /= 2;
                if (i < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    /* renamed from: e */
    public static int m21268e(boolean z) {
        int i = z ? C3092f.m21334a(C3084b.m21143c()) ? 1 : 0 : C3092f.m21337b();
        int b = C3092f.m21338b(z);
        return b > i ? b : i;
    }

    /* renamed from: a */
    private static void m21222a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m21228a(th, outputStream);
        }
    }

    /* renamed from: a */
    private static String m21212a(File file) {
        String str;
        try {
            str = file.getCanonicalPath();
        } catch (Throwable unused) {
            str = null;
        }
        return C3081g.m21032a(str) ? file.getPath() : str;
    }

    /* renamed from: e */
    static StringBuilder m21270e(String str) {
        return m21217a(Thread.currentThread().getStackTrace(), str);
    }

    /* renamed from: a */
    private static long m21209a(StatFs statFs, String str, String str2) {
        try {
            if (VERSION.SDK_INT >= 18) {
                Method declaredMethod = StatFs.class.getDeclaredMethod(str, new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(statFs, new Object[0]);
                if (invoke != null && (invoke instanceof Long)) {
                    return ((Long) invoke).longValue();
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(statFs, new Object[0]);
            if (invoke2 != null && (invoke2 instanceof Integer)) {
                return (long) ((Integer) invoke2).intValue();
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        return 0;
    }

    /* renamed from: b */
    private static void m21247b(OutputStream outputStream) {
        String str = "-b";
        String str2 = "UTF-8";
        BufferedReader bufferedReader = null;
        try {
            outputStream.write("logcat:\n".getBytes(str2));
            if (C3093g.m21397n() <= 0) {
                outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes(str2));
                m21222a(outputStream);
                C3081g.m21025a((Closeable) null);
                return;
            }
            int n = C3093g.m21397n();
            bufferedReader = m21210a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", str, UContent.f16918ar, str, "main", "-v", "threadtime", "-t", String.valueOf(n)}).getInputStream()));
            if (bufferedReader == null) {
                try {
                    outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes(str2));
                } catch (Throwable th) {
                    m21228a(th, outputStream);
                }
                m21222a(outputStream);
                C3081g.m21025a((Closeable) bufferedReader);
                return;
            }
            f16415h = false;
            int i = 0;
            int i2 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    i++;
                    if (i2 < n && !readLine.contains(" I auditd ") && !readLine.contains(" I liblog ")) {
                        outputStream.write(readLine.getBytes(str2));
                        outputStream.write("\n".getBytes(str2));
                        i2++;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable th2) {
                        m21228a(th2, outputStream);
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}).getBytes(str2));
            f16415h = true;
            C3081g.m21025a((Closeable) bufferedReader);
            m21222a(outputStream);
        } catch (Throwable th3) {
            try {
                f16415h = true;
                m21228a(th3, outputStream);
            } catch (Throwable th4) {
                C3081g.m21025a((Closeable) bufferedReader);
                throw th4;
            }
        }
    }

    /* renamed from: a */
    private static void m21220a(C3088a aVar) {
        try {
            aVar.mo18731a(String.format(Locale.US, "log end: %s\n", new Object[]{m21292m()}));
        } catch (Throwable th) {
            m21228a(th, (OutputStream) aVar);
        }
    }

    /* renamed from: a */
    static int m21208a(OutputStream outputStream, String str, int i) {
        int i2 = 0;
        if (str == null) {
            m21222a(outputStream);
            return 0;
        }
        try {
            String a = C3076b.m20982a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder("file: '");
                sb.append(str);
                sb.append("' not found or decode failed!");
                a = sb.toString();
            }
            int length = a.length();
            if (length <= i + 32) {
                i = length;
            }
            String str2 = "UTF-8";
            if (i > 0) {
                try {
                    outputStream.write(a.getBytes(str2), 0, i);
                    outputStream.write("\n".getBytes(str2));
                } catch (Throwable th) {
                    th = th;
                    i2 = i;
                    m21228a(th, outputStream);
                    i = i2;
                    m21222a(outputStream);
                    return i;
                }
            }
            if (i < a.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", new Object[]{Integer.valueOf(a.length() - i)}).getBytes(str2));
            }
        } catch (Throwable th2) {
            th = th2;
            m21228a(th, outputStream);
            i = i2;
            m21222a(outputStream);
            return i;
        }
        m21222a(outputStream);
        return i;
    }

    /* renamed from: a */
    static String m21211a(int i) {
        try {
            String a = C3081g.m21019a(new File(String.format(Locale.US, "/proc/%d/cmdline", new Object[]{Integer.valueOf(i)})), 128, false);
            if (C3081g.m21037b(a)) {
                return m21289k(a);
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        return "unknown";
    }

    /* renamed from: b */
    private static void m21246b(C3088a aVar) {
        f16415h = false;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(m21302r("LOG_END"));
            sb.append("\n");
            aVar.write(sb.toString().getBytes("UTF-8"));
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        f16415h = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:228:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0380 A[SYNTHETIC, Splitter:B:234:0x0380] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0434 A[Catch:{ all -> 0x035d, all -> 0x0498 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0463 A[Catch:{ all -> 0x035d, all -> 0x0498 }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x04ba A[Catch:{ all -> 0x04cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x04c3 A[Catch:{ all -> 0x04cb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21215a(java.lang.Throwable r24, java.lang.String r25, long r26, boolean r28) {
        /*
            r1 = r24
            r2 = r25
            r3 = r26
            java.lang.String r5 = "\n"
            java.lang.String r6 = "'\n"
            java.lang.String r7 = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n"
            java.lang.String r8 = "UTF-8"
            r9 = 0
            r11 = 0
            boolean r0 = com.p259uc.crashsdk.C3084b.m21110I()     // Catch:{ all -> 0x049e }
            r12 = 1
            if (r0 != 0) goto L_0x0022
            com.p259uc.crashsdk.C3093g.m21378a()     // Catch:{ all -> 0x001f }
            m21230a(r12)     // Catch:{ all -> 0x001f }
            goto L_0x0022
        L_0x001f:
            r0 = move-exception
            goto L_0x04a0
        L_0x0022:
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x001f }
            r0.<init>(r2)     // Catch:{ all -> 0x001f }
            goto L_0x002d
        L_0x002c:
            r0 = r11
        L_0x002d:
            com.uc.crashsdk.e$a r13 = new com.uc.crashsdk.e$a     // Catch:{ all -> 0x049e }
            r13.<init>(r3, r0)     // Catch:{ all -> 0x049e }
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0040
            r0 = 126(0x7e, float:1.77E-43)
            com.p259uc.crashsdk.JNIBridge.set(r0, r2)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x049a }
        L_0x0040:
            java.lang.String r0 = m21199R()     // Catch:{ all -> 0x049a }
            m21248b(r13, r2, r0)     // Catch:{ all -> 0x049a }
            if (r28 == 0) goto L_0x0057
            r13.flush()     // Catch:{ all -> 0x004d }
            goto L_0x0057
        L_0x004d:
            r0 = move-exception
            r14 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r14)     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            r11 = r13
            goto L_0x04a0
        L_0x0057:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            java.lang.String r14 = "Process Name: '"
            r0.<init>(r14)     // Catch:{ all -> 0x0094 }
            java.lang.String r14 = m21281h()     // Catch:{ all -> 0x0094 }
            r0.append(r14)     // Catch:{ all -> 0x0094 }
            r0.append(r6)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0094 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0094 }
            r13.write(r0)     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            java.lang.String r14 = "Thread Name: '"
            r0.<init>(r14)     // Catch:{ all -> 0x0094 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0094 }
            java.lang.String r14 = r14.getName()     // Catch:{ all -> 0x0094 }
            r0.append(r14)     // Catch:{ all -> 0x0094 }
            r0.append(r6)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0094 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0094 }
            r13.write(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x049a }
        L_0x0098:
            java.lang.String r0 = "Back traces starts.\n"
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x00ed }
            r13.write(r0)     // Catch:{ all -> 0x00ed }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r6 = "detailMessage"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r6)     // Catch:{ all -> 0x00c0 }
            r0.setAccessible(r12)     // Catch:{ all -> 0x00c0 }
            java.lang.Object r6 = r0.get(r1)     // Catch:{ all -> 0x00c0 }
            if (r6 == 0) goto L_0x00c4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00c0 }
            java.lang.String r14 = "\n\t"
            java.lang.String r15 = "\n->  "
            java.lang.String r6 = r6.replaceAll(r14, r15)     // Catch:{ all -> 0x00c0 }
            r0.set(r1, r6)     // Catch:{ all -> 0x00c0 }
            goto L_0x00c4
        L_0x00c0:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x00ed }
        L_0x00c4:
            java.lang.String r0 = r24.getMessage()     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r6 = r24.getLocalizedMessage()     // Catch:{ all -> 0x00ed }
            boolean r6 = r0.equals(r6)     // Catch:{ all -> 0x00ed }
            if (r6 != 0) goto L_0x00f1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            java.lang.String r14 = "Message: "
            r6.<init>(r14)     // Catch:{ all -> 0x00ed }
            r6.append(r0)     // Catch:{ all -> 0x00ed }
            r6.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00ed }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x00ed }
            r13.write(r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00f1
        L_0x00ed:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x049a }
        L_0x00f1:
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{ all -> 0x00fa }
            r0.<init>(r13)     // Catch:{ all -> 0x00fa }
            r1.printStackTrace(r0)     // Catch:{ all -> 0x00fa }
            goto L_0x00fe
        L_0x00fa:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x049a }
        L_0x00fe:
            java.lang.String r0 = "Back traces ends.\n"
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0108 }
            r13.write(r0)     // Catch:{ all -> 0x0108 }
            goto L_0x010c
        L_0x0108:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x049a }
        L_0x010c:
            m21222a(r13)     // Catch:{ all -> 0x049a }
            r13.flush()     // Catch:{ all -> 0x0113 }
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            r1 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ all -> 0x049a }
        L_0x0118:
            com.p259uc.crashsdk.ProGuard.m20948a(r13, r8, r7)     // Catch:{ all -> 0x011c }
            goto L_0x0121
        L_0x011c:
            r0 = move-exception
            r1 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ all -> 0x049a }
        L_0x0121:
            if (r28 == 0) goto L_0x012c
            r13.flush()     // Catch:{ all -> 0x0127 }
            goto L_0x012c
        L_0x0127:
            r0 = move-exception
            r1 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ all -> 0x0053 }
        L_0x012c:
            r1 = 10240(0x2800, float:1.4349E-41)
            java.lang.String r0 = "/proc/meminfo"
            java.lang.String r6 = "meminfo:\n"
            byte[] r6 = r6.getBytes(r8)     // Catch:{ all -> 0x013d }
            r13.write(r6)     // Catch:{ all -> 0x013d }
            m21240b(r13, r0, r1)     // Catch:{ all -> 0x013d }
            goto L_0x0141
        L_0x013d:
            r0 = move-exception
            m21228a(r0, r13)     // Catch:{ all -> 0x049a }
        L_0x0141:
            r6 = 0
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0163 }
            java.lang.String r14 = "/proc/%d/status"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x0163 }
            int r16 = android.os.Process.myPid()     // Catch:{ all -> 0x0163 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0163 }
            r15[r6] = r16     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = java.lang.String.format(r0, r14, r15)     // Catch:{ all -> 0x0163 }
            java.lang.String r14 = "status:\n"
            byte[] r14 = r14.getBytes(r8)     // Catch:{ all -> 0x0163 }
            r13.write(r14)     // Catch:{ all -> 0x0163 }
            m21240b(r13, r0, r1)     // Catch:{ all -> 0x0163 }
            goto L_0x0167
        L_0x0163:
            r0 = move-exception
            m21228a(r0, r13)     // Catch:{ all -> 0x049a }
        L_0x0167:
            java.lang.String r0 = "memory info:\n"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r1.<init>()     // Catch:{ all -> 0x0184 }
            r1.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = m21279g()     // Catch:{ all -> 0x0184 }
            r1.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0184 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0184 }
            r13.write(r0)     // Catch:{ all -> 0x0184 }
            goto L_0x0188
        L_0x0184:
            r0 = move-exception
            m21228a(r0, r13)     // Catch:{ all -> 0x049a }
        L_0x0188:
            m21222a(r13)     // Catch:{ all -> 0x049a }
            m21275f(r13)     // Catch:{ all -> 0x049a }
            com.p259uc.crashsdk.ProGuard.m20950a(r13, r8, r11)     // Catch:{ all -> 0x0192 }
            goto L_0x0197
        L_0x0192:
            r0 = move-exception
            r1 = r0
            m21228a(r1, r13)     // Catch:{ all -> 0x049a }
        L_0x0197:
            boolean r0 = f16409af     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x01b1
            f16415h = r6     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "JAVADUMPFILES"
            java.lang.String r0 = m21302r(r0)     // Catch:{ all -> 0x01ab }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x01ab }
            r13.write(r0)     // Catch:{ all -> 0x01ab }
            goto L_0x01af
        L_0x01ab:
            r0 = move-exception
            m21228a(r0, r13)     // Catch:{ all -> 0x0053 }
        L_0x01af:
            f16415h = r12     // Catch:{ all -> 0x0053 }
        L_0x01b1:
            r13.flush()     // Catch:{ all -> 0x01b5 }
            goto L_0x01ba
        L_0x01b5:
            r0 = move-exception
            r1 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ all -> 0x049a }
        L_0x01ba:
            m21247b(r13)     // Catch:{ all -> 0x049a }
            r13.flush()     // Catch:{ all -> 0x01c1 }
            goto L_0x01c6
        L_0x01c1:
            r0 = move-exception
            r1 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ all -> 0x049a }
        L_0x01c6:
            java.lang.String r0 = "battery info:\n"
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x01d0 }
            r13.write(r0)     // Catch:{ all -> 0x01d0 }
            goto L_0x01d4
        L_0x01d0:
            r0 = move-exception
            m21228a(r0, r13)     // Catch:{ all -> 0x049a }
        L_0x01d4:
            boolean r0 = f16409af     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x01ea
            f16415h = r6     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "BATTERYINFO"
            java.lang.String r0 = m21302r(r0)     // Catch:{ all -> 0x01fc }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x01fc }
            r13.write(r0)     // Catch:{ all -> 0x01fc }
            f16415h = r12     // Catch:{ all -> 0x01fc }
            goto L_0x0200
        L_0x01ea:
            java.lang.StringBuilder r0 = m21205X()     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x0200
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01fc }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x01fc }
            r13.write(r0)     // Catch:{ all -> 0x01fc }
            goto L_0x0200
        L_0x01fc:
            r0 = move-exception
            m21228a(r0, r13)     // Catch:{ all -> 0x049a }
        L_0x0200:
            m21222a(r13)     // Catch:{ all -> 0x049a }
            java.lang.String r0 = "disk info:\n"
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x020d }
            r13.write(r0)     // Catch:{ all -> 0x020d }
            goto L_0x0211
        L_0x020d:
            r0 = move-exception
            m21228a(r0, r13)     // Catch:{ all -> 0x049a }
        L_0x0211:
            boolean r0 = f16409af     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x0230
            f16415h = r6     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "FSSTAT"
            java.lang.String r0 = m21302r(r0)     // Catch:{ all -> 0x0225 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0225 }
            r13.write(r0)     // Catch:{ all -> 0x0225 }
            goto L_0x0229
        L_0x0225:
            r0 = move-exception
            m21228a(r0, r13)     // Catch:{ all -> 0x0053 }
        L_0x0229:
            f16415h = r12     // Catch:{ all -> 0x0053 }
        L_0x022b:
            r21 = r7
            r4 = r13
            goto L_0x0350
        L_0x0230:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0349 }
            r0.<init>()     // Catch:{ all -> 0x0349 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0349 }
            java.lang.String r14 = com.p259uc.crashsdk.p260a.C3081g.m21034b()     // Catch:{ all -> 0x0349 }
            r1.<init>(r14)     // Catch:{ all -> 0x0349 }
            java.lang.String r1 = m21212a(r1)     // Catch:{ all -> 0x0349 }
            boolean r14 = com.p259uc.crashsdk.p260a.C3081g.m21032a(r1)     // Catch:{ all -> 0x0349 }
            if (r14 != 0) goto L_0x022b
            boolean r14 = r0.contains(r1)     // Catch:{ all -> 0x0349 }
            if (r14 != 0) goto L_0x022b
            java.lang.String r14 = "/storage/emulated"
            boolean r14 = r1.equals(r14)     // Catch:{ all -> 0x0349 }
            if (r14 == 0) goto L_0x0257
            goto L_0x022b
        L_0x0257:
            r0.add(r1)     // Catch:{ all -> 0x0349 }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ all -> 0x022b }
            r0.<init>(r1)     // Catch:{ all -> 0x022b }
            java.lang.String r14 = "getBlockCountLong"
            java.lang.String r15 = "getBlockCount"
            long r14 = m21209a(r0, r14, r15)     // Catch:{ all -> 0x0349 }
            java.lang.String r9 = "getBlockSizeLong"
            java.lang.String r10 = "getBlockSize"
            long r9 = m21209a(r0, r9, r10)     // Catch:{ all -> 0x0349 }
            r17 = 1024(0x400, double:5.06E-321)
            long r17 = r14 / r17
            long r17 = r17 * r9
            r19 = 10240(0x2800, double:5.059E-320)
            int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x022b
            java.lang.String r11 = "getAvailableBlocksLong"
            java.lang.String r6 = "getAvailableBlocks"
            r19 = r13
            long r12 = m21209a(r0, r11, r6)     // Catch:{ all -> 0x0343 }
            java.lang.String r6 = "getFreeBlocksLong"
            java.lang.String r11 = "getFreeBlocks"
            long r2 = m21209a(r0, r6, r11)     // Catch:{ all -> 0x0343 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0338 }
            java.lang.String r4 = "%s:\n"
            r6 = 1
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0338 }
            r6 = 0
            r11[r6] = r1     // Catch:{ all -> 0x0338 }
            java.lang.String r1 = java.lang.String.format(r0, r4, r11)     // Catch:{ all -> 0x0338 }
            byte[] r1 = r1.getBytes(r8)     // Catch:{ all -> 0x0338 }
            r4 = r19
            r4.write(r1)     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = "  total:      %d kB\n"
            r6 = 1
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0334 }
            double r14 = (double) r14
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r19
            r21 = r7
            double r6 = (double) r9
            java.lang.Double.isNaN(r6)
            double r14 = r14 * r6
            r22 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r14 = r14 / r22
            long r14 = (long) r14
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0332 }
            r15 = 0
            r11[r15] = r14     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = java.lang.String.format(r0, r1, r11)     // Catch:{ all -> 0x0332 }
            byte[] r1 = r1.getBytes(r8)     // Catch:{ all -> 0x0332 }
            r4.write(r1)     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = "  available:  %d kB\n"
            r11 = 1
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ all -> 0x0332 }
            double r11 = (double) r12
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r19
            java.lang.Double.isNaN(r6)
            double r11 = r11 * r6
            double r11 = r11 / r22
            long r11 = (long) r11
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0332 }
            r12 = 0
            r14[r12] = r11     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = java.lang.String.format(r0, r1, r14)     // Catch:{ all -> 0x0332 }
            byte[] r1 = r1.getBytes(r8)     // Catch:{ all -> 0x0332 }
            r4.write(r1)     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = "  free:       %d kB\n"
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x0332 }
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r19
            java.lang.Double.isNaN(r6)
            double r2 = r2 * r6
            double r2 = r2 / r22
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0332 }
            r3 = 0
            r12[r3] = r2     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = java.lang.String.format(r0, r1, r12)     // Catch:{ all -> 0x0332 }
            byte[] r1 = r1.getBytes(r8)     // Catch:{ all -> 0x0332 }
            r4.write(r1)     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = "  block size: %d B\n\n"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0332 }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0332 }
            r6 = 0
            r3[r6] = r2     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = java.lang.String.format(r0, r1, r3)     // Catch:{ all -> 0x0332 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0332 }
            r4.write(r0)     // Catch:{ all -> 0x0332 }
            goto L_0x0350
        L_0x0332:
            r0 = move-exception
            goto L_0x033d
        L_0x0334:
            r0 = move-exception
            r21 = r7
            goto L_0x033d
        L_0x0338:
            r0 = move-exception
            r21 = r7
            r4 = r19
        L_0x033d:
            m21228a(r0, r4)     // Catch:{ all -> 0x0341 }
            goto L_0x0350
        L_0x0341:
            r0 = move-exception
            goto L_0x034d
        L_0x0343:
            r0 = move-exception
            r21 = r7
            r4 = r19
            goto L_0x034d
        L_0x0349:
            r0 = move-exception
            r21 = r7
            r4 = r13
        L_0x034d:
            m21228a(r0, r4)     // Catch:{ all -> 0x0498 }
        L_0x0350:
            m21222a(r4)     // Catch:{ all -> 0x0498 }
            java.lang.String r0 = "device status:\n"
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x035d }
            r4.write(r0)     // Catch:{ all -> 0x035d }
            goto L_0x0361
        L_0x035d:
            r0 = move-exception
            m21228a(r0, r4)     // Catch:{ all -> 0x0498 }
        L_0x0361:
            boolean r0 = f16409af     // Catch:{ all -> 0x0498 }
            if (r0 == 0) goto L_0x0380
            r1 = 0
            f16415h = r1     // Catch:{ all -> 0x037a }
            java.lang.String r0 = "DEVICESTATUS"
            java.lang.String r0 = m21302r(r0)     // Catch:{ all -> 0x037a }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x037a }
            r4.write(r0)     // Catch:{ all -> 0x037a }
            r1 = 1
            f16415h = r1     // Catch:{ all -> 0x037a }
            goto L_0x041b
        L_0x037a:
            r0 = move-exception
        L_0x037b:
            m21228a(r0, r4)     // Catch:{ all -> 0x0498 }
            goto L_0x041b
        L_0x0380:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0418 }
            java.lang.String r1 = "has root: %s\n"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0418 }
            boolean r2 = com.p259uc.crashsdk.p260a.C3081g.m21044e()     // Catch:{ all -> 0x0418 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0418 }
            r6 = 0
            r3[r6] = r2     // Catch:{ all -> 0x0418 }
            java.lang.String r1 = java.lang.String.format(r0, r1, r3)     // Catch:{ all -> 0x0418 }
            byte[] r1 = r1.getBytes(r8)     // Catch:{ all -> 0x0418 }
            r4.write(r1)     // Catch:{ all -> 0x0418 }
            java.lang.String r1 = ""
            java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x0418 }
            if (r2 == 0) goto L_0x03a4
            r1 = r2
        L_0x03a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0418 }
            r2.<init>()     // Catch:{ all -> 0x0418 }
            java.lang.String r3 = "build tags: "
            r2.append(r3)     // Catch:{ all -> 0x0418 }
            r2.append(r1)     // Catch:{ all -> 0x0418 }
            boolean r1 = com.p259uc.crashsdk.p260a.C3081g.m21046f()     // Catch:{ all -> 0x0418 }
            if (r1 == 0) goto L_0x03bc
            java.lang.String r1 = " (default root)"
            r2.append(r1)     // Catch:{ all -> 0x0418 }
        L_0x03bc:
            r2.append(r5)     // Catch:{ all -> 0x0418 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0418 }
            byte[] r1 = r1.getBytes(r8)     // Catch:{ all -> 0x0418 }
            r4.write(r1)     // Catch:{ all -> 0x0418 }
            java.lang.String r1 = com.p259uc.crashsdk.p260a.C3081g.m21048h()     // Catch:{ all -> 0x0418 }
            boolean r2 = com.p259uc.crashsdk.p260a.C3081g.m21037b(r1)     // Catch:{ all -> 0x0418 }
            if (r2 == 0) goto L_0x041b
            java.lang.String r2 = "su binary: %s\n"
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0418 }
            r3 = 0
            r5[r3] = r1     // Catch:{ all -> 0x0418 }
            java.lang.String r0 = java.lang.String.format(r0, r2, r5)     // Catch:{ all -> 0x0418 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0418 }
            r4.write(r0)     // Catch:{ all -> 0x0418 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0418 }
            r0.<init>()     // Catch:{ all -> 0x0418 }
            java.lang.String r1 = "su permission: "
            r0.append(r1)     // Catch:{ all -> 0x0418 }
            boolean r1 = com.p259uc.crashsdk.p260a.C3081g.m21047g()     // Catch:{ all -> 0x0418 }
            if (r1 == 0) goto L_0x03fd
            java.lang.String r1 = "valid ("
        L_0x03f9:
            r0.append(r1)     // Catch:{ all -> 0x0418 }
            goto L_0x0400
        L_0x03fd:
            java.lang.String r1 = "invalid ("
            goto L_0x03f9
        L_0x0400:
            java.lang.String r1 = com.p259uc.crashsdk.p260a.C3081g.m21049i()     // Catch:{ all -> 0x0418 }
            r0.append(r1)     // Catch:{ all -> 0x0418 }
            java.lang.String r1 = ")\n"
            r0.append(r1)     // Catch:{ all -> 0x0418 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0418 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0418 }
            r4.write(r0)     // Catch:{ all -> 0x0418 }
            goto L_0x041b
        L_0x0418:
            r0 = move-exception
            goto L_0x037b
        L_0x041b:
            m21222a(r4)     // Catch:{ all -> 0x0498 }
            m21257c(r4)     // Catch:{ all -> 0x0498 }
            m21264d(r4)     // Catch:{ all -> 0x0498 }
            r1 = r21
            r2 = 0
            com.p259uc.crashsdk.ProGuard.m20959b(r4, r8, r1, r2)     // Catch:{ all -> 0x042b }
            goto L_0x0430
        L_0x042b:
            r0 = move-exception
            r2 = r0
            m21228a(r2, r4)     // Catch:{ all -> 0x0498 }
        L_0x0430:
            boolean r0 = f16409af     // Catch:{ all -> 0x0498 }
            if (r0 == 0) goto L_0x044c
            r2 = 0
            f16415h = r2     // Catch:{ all -> 0x0498 }
            java.lang.String r0 = "JAVACACHEDINFOS"
            java.lang.String r0 = m21302r(r0)     // Catch:{ all -> 0x0445 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0445 }
            r4.write(r0)     // Catch:{ all -> 0x0445 }
            goto L_0x0449
        L_0x0445:
            r0 = move-exception
            m21228a(r0, r4)     // Catch:{ all -> 0x0498 }
        L_0x0449:
            r2 = 1
            f16415h = r2     // Catch:{ all -> 0x0498 }
        L_0x044c:
            r4.flush()     // Catch:{ all -> 0x0450 }
            goto L_0x0455
        L_0x0450:
            r0 = move-exception
            r2 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r2)     // Catch:{ all -> 0x0498 }
        L_0x0455:
            r2 = 0
            com.p259uc.crashsdk.ProGuard.m20949a(r4, r8, r1, r2)     // Catch:{ all -> 0x045a }
            goto L_0x045f
        L_0x045a:
            r0 = move-exception
            r1 = r0
            m21228a(r1, r4)     // Catch:{ all -> 0x0498 }
        L_0x045f:
            boolean r0 = f16409af     // Catch:{ all -> 0x0498 }
            if (r0 == 0) goto L_0x047b
            r1 = 0
            f16415h = r1     // Catch:{ all -> 0x0498 }
            java.lang.String r0 = "JAVACALLBACKINFOS"
            java.lang.String r0 = m21302r(r0)     // Catch:{ all -> 0x0474 }
            byte[] r0 = r0.getBytes(r8)     // Catch:{ all -> 0x0474 }
            r4.write(r0)     // Catch:{ all -> 0x0474 }
            goto L_0x0478
        L_0x0474:
            r0 = move-exception
            m21228a(r0, r4)     // Catch:{ all -> 0x0498 }
        L_0x0478:
            r1 = 1
            f16415h = r1     // Catch:{ all -> 0x0498 }
        L_0x047b:
            r4.mo18730a()     // Catch:{ all -> 0x0498 }
            m21220a(r4)     // Catch:{ all -> 0x0498 }
            r4.flush()     // Catch:{ all -> 0x0487 }
        L_0x0484:
            r1 = 0
            goto L_0x048d
        L_0x0487:
            r0 = move-exception
            r1 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ all -> 0x0498 }
            goto L_0x0484
        L_0x048d:
            int r0 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0494
            m21246b(r4)
        L_0x0494:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r4)
            goto L_0x04af
        L_0x0498:
            r0 = move-exception
            goto L_0x049c
        L_0x049a:
            r0 = move-exception
            r4 = r13
        L_0x049c:
            r11 = r4
            goto L_0x04a0
        L_0x049e:
            r0 = move-exception
            r2 = r11
        L_0x04a0:
            m21228a(r0, r11)     // Catch:{ all -> 0x04d0 }
            r1 = 0
            int r0 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x04ac
            m21246b(r11)
        L_0x04ac:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r11)
        L_0x04af:
            boolean r0 = f16409af
            if (r0 != 0) goto L_0x04b6
            m21301q(r25)
        L_0x04b6:
            boolean r0 = f16409af     // Catch:{ all -> 0x04cb }
            if (r0 != 0) goto L_0x04c3
            java.lang.String r0 = m21290l(r25)     // Catch:{ all -> 0x04cb }
            java.lang.String r0 = m21213a(r0)     // Catch:{ all -> 0x04cb }
            goto L_0x04c5
        L_0x04c3:
            r0 = r25
        L_0x04c5:
            java.lang.String r1 = "java"
            m21250b(r0, r1)     // Catch:{ all -> 0x04cb }
            goto L_0x04cf
        L_0x04cb:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x04cf:
            return r25
        L_0x04d0:
            r0 = move-exception
            r1 = r0
            r2 = 0
            int r0 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x04db
            m21246b(r11)
        L_0x04db:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r11)
            goto L_0x04e0
        L_0x04df:
            throw r1
        L_0x04e0:
            goto L_0x04df
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21215a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    static int m21240b(OutputStream outputStream, String str, int i) {
        int i2;
        DataInputStream dataInputStream;
        int i3;
        DataInputStream dataInputStream2 = null;
        int i4 = 0;
        try {
            File file = new File(str);
            String str2 = "UTF-8";
            if (file.exists()) {
                byte[] Q = m21198Q();
                if (Q == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes(str2));
                    C3081g.m21025a((Closeable) null);
                    return 0;
                }
                dataInputStream = new DataInputStream(new FileInputStream(file));
                i3 = 0;
                i2 = 0;
                loop0:
                while (true) {
                    boolean z = false;
                    while (true) {
                        try {
                            int read = dataInputStream.read(Q);
                            if (read == -1) {
                                break loop0;
                            }
                            i3 += read;
                            int i5 = i - i2;
                            if (read <= i5 + 32) {
                                i5 = read;
                            }
                            if (i5 > 0 && !z) {
                                outputStream.write(Q, 0, i5);
                                i2 += i5;
                            }
                            if (!z) {
                                if (i5 < read || i2 >= i) {
                                    z = true;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i4 = i2;
                            dataInputStream2 = dataInputStream;
                            try {
                                m21228a(th, outputStream);
                                C3081g.m21025a((Closeable) dataInputStream2);
                                i2 = i4;
                                m21222a(outputStream);
                                return i2;
                            } catch (Throwable th2) {
                                C3081g.m21025a((Closeable) dataInputStream2);
                                throw th2;
                            }
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("file: '");
                sb.append(str);
                sb.append("' not exists!\n");
                outputStream.write(sb.toString().getBytes(str2));
                dataInputStream = null;
                i3 = 0;
                i2 = 0;
            }
            if (i2 > 0) {
                outputStream.write("\n".getBytes(str2));
            }
            if (i2 < i3) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", new Object[]{Integer.valueOf(i3 - i2)}).getBytes(str2));
            }
            C3081g.m21025a((Closeable) dataInputStream);
        } catch (Throwable th3) {
            th = th3;
            m21228a(th, outputStream);
            C3081g.m21025a((Closeable) dataInputStream2);
            i2 = i4;
            m21222a(outputStream);
            return i2;
        }
        m21222a(outputStream);
        return i2;
    }

    /* renamed from: b */
    static void m21252b(boolean z) {
        try {
            boolean z2 = C3093g.m21401r() && C3084b.m21104C() && !f16412d;
            if (!z2) {
                z2 = C3093g.m21402s();
            }
            if (z2) {
                if (z) {
                    String k = m21288k();
                    if (!C3081g.m21032a(k)) {
                        m21287j();
                        m21226a(k, false, false);
                    }
                    return;
                }
                m21238a(true, false);
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
    }

    /* renamed from: b */
    private static boolean m21254b(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(95);
        if (lastIndexOf <= 0) {
            return false;
        }
        int indexOf = name.indexOf(46, lastIndexOf);
        if (indexOf <= 0) {
            return false;
        }
        String substring = name.substring(lastIndexOf + 1, indexOf);
        if (LogType.JAVA_TYPE.equals(substring) || "ucebujava".equals(substring) || LogType.NATIVE_TYPE.equals(substring) || "ucebujni".equals(substring) || LogType.UNEXP_TYPE.equals(substring) || LogType.ANR_TYPE.equals(substring)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m21243b(String str, boolean z, boolean z2) {
        if (z) {
            try {
                str = m21290l(str);
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
        }
        if (!z2) {
            return str;
        }
        try {
            return m21213a(str);
        } catch (Throwable th2) {
            C3081g.m21027a(th2);
            return str;
        }
    }

    /* renamed from: b */
    static void m21251b(String str, String str2, boolean z) {
        C3082h.m21069a(str, str2, false, z);
    }

    /* renamed from: b */
    public static void m21249b(String str) {
        synchronized (f16433z) {
            String i = C3084b.m21152i();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n");
            C3076b.m20984a(i, sb.toString());
        }
    }

    /* renamed from: b */
    private static void m21250b(String str, String str2) {
        try {
            C3086d.m21176a(str, m21281h(), str2);
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
    }

    /* renamed from: b */
    public static void m21245b(Context context) {
        if (C3093g.m21360K()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(f16393Q, intentFilter, null, C3080f.m21009a(1));
                f16394R = true;
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m21244b(int i) {
        C3080f.m21014a(0, new C3079e(410), (long) (i * 1000));
    }

    /* renamed from: b */
    public static int m21241b(boolean z, boolean z2) {
        int i;
        if (z2 && !f16406ac) {
            C3092f.m21346d(false);
        }
        if (z) {
            i = C3092f.m21336a(C3084b.m21143c(), false);
            C3082h.m21087i();
        } else {
            i = C3092f.m21325a();
            C3082h.m21087i();
        }
        return z2 ? C3092f.m21327a(z) : i;
    }

    /* renamed from: a */
    static String m21213a(String str) {
        if (!C3093g.m21407x()) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf <= 0) {
            return str;
        }
        int indexOf = str.indexOf(95, lastIndexOf);
        if (indexOf <= lastIndexOf) {
            return str;
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(95, i);
        if (indexOf2 <= indexOf) {
            return str;
        }
        StringBuilder sb = new StringBuilder("CrashSDK");
        sb.append(str.substring(lastIndexOf + 1, indexOf));
        sb.append(str.substring(i, indexOf2));
        String d = C3081g.m21043d(sb.toString());
        if (d == null) {
            return str;
        }
        File file = new File(str);
        byte[] e = C3081g.m21045e(file);
        if (e == null || e.length <= 0) {
            return str;
        }
        byte[] bArr = null;
        try {
            bArr = C3077c.m20998b(e, d.substring(0, 16).getBytes());
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        if (bArr == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".ec");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb3);
        sb4.append(".tmp");
        File file2 = new File(sb4.toString());
        if (!C3081g.m21031a(file2, bArr)) {
            return str;
        }
        if (!file2.renameTo(new File(sb3))) {
            file2.delete();
            return str;
        }
        file.delete();
        return sb3;
    }

    /* renamed from: a */
    static void m21228a(Throwable th, OutputStream outputStream) {
        String str = "UTF-8";
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes(str));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes(str));
            } catch (Throwable th2) {
                C3081g.m21027a(th2);
            }
        }
        C3081g.m21027a(th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ad A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02e7 A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02f2 A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0348 A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03a1 A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03b9 A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d8 A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f0 A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f2 A[ADDED_TO_REGION, Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020d A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0223 A[Catch:{ all -> 0x0432, all -> 0x043f, all -> 0x043d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21226a(java.lang.String r31, boolean r32, boolean r33) {
        /*
            java.lang.String r0 = "crashsdk uploading logs"
            java.lang.String r1 = "crashsdk"
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r1, r0)
            java.lang.Object r1 = f16421n
            monitor-enter(r1)
            boolean r0 = com.p259uc.crashsdk.p260a.C3081g.m21037b(r31)     // Catch:{ all -> 0x0432 }
            if (r0 == 0) goto L_0x0423
            java.lang.String r0 = com.p259uc.crashsdk.C3093g.m21371V()     // Catch:{ all -> 0x0432 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0432 }
            r2.<init>(r0)     // Catch:{ all -> 0x0432 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0432 }
            if (r3 != 0) goto L_0x0034
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0432 }
            java.lang.String r3 = "Folder not exist: "
            r2.<init>(r3)     // Catch:{ all -> 0x0432 }
            r2.append(r0)     // Catch:{ all -> 0x0432 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0432 }
            java.lang.String r2 = "crashsdk"
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r2, r0)     // Catch:{ all -> 0x0432 }
            goto L_0x042a
        L_0x0034:
            java.io.File[] r2 = r2.listFiles()     // Catch:{ all -> 0x0432 }
            if (r2 != 0) goto L_0x004d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0432 }
            java.lang.String r3 = "List folder failed: "
            r2.<init>(r3)     // Catch:{ all -> 0x0432 }
            r2.append(r0)     // Catch:{ all -> 0x0432 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0432 }
            com.p259uc.crashsdk.p260a.C3075a.m20978b(r0)     // Catch:{ all -> 0x0432 }
            goto L_0x042a
        L_0x004d:
            int r3 = r2.length     // Catch:{ all -> 0x0432 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x005b:
            if (r5 >= r3) goto L_0x03c9
            r4 = r2[r5]     // Catch:{ all -> 0x0432 }
            boolean r0 = r4.isFile()     // Catch:{ all -> 0x0432 }
            r18 = r2
            if (r0 != 0) goto L_0x006d
            com.p259uc.crashsdk.p260a.C3081g.m21029a(r4)     // Catch:{ all -> 0x0432 }
        L_0x006a:
            r22 = r3
            goto L_0x00a5
        L_0x006d:
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0432 }
            java.lang.String r2 = ".tmp"
            boolean r2 = r0.endsWith(r2)     // Catch:{ all -> 0x0432 }
            r20 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00ae
            long r22 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0432 }
            long r24 = r4.lastModified()     // Catch:{ all -> 0x0432 }
            long r22 = r22 - r24
            long r22 = r22 / r20
            r19 = 30
            int r2 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0432 }
            r22 = r3
            java.lang.String r3 = "delete legacy tmp file: "
            r2.<init>(r3)     // Catch:{ all -> 0x0432 }
            r2.append(r0)     // Catch:{ all -> 0x0432 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0432 }
            com.p259uc.crashsdk.p260a.C3075a.m20978b(r0)     // Catch:{ all -> 0x0432 }
            int r7 = r7 + 1
            com.p259uc.crashsdk.p260a.C3081g.m21029a(r4)     // Catch:{ all -> 0x0432 }
        L_0x00a5:
            r26 = r8
            r23 = r14
        L_0x00a9:
            r14 = 0
            r8 = r31
            goto L_0x03bd
        L_0x00ae:
            r22 = r3
            long r2 = r4.length()     // Catch:{ all -> 0x0432 }
            r23 = r14
            r24 = r15
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00c8
            int r6 = r6 + 1
            com.p259uc.crashsdk.p260a.C3081g.m21029a(r4)     // Catch:{ all -> 0x0432 }
        L_0x00c3:
            r26 = r8
            r15 = r24
            goto L_0x00a9
        L_0x00c8:
            r2 = 3
            if (r32 == 0) goto L_0x0121
            long r25 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0432 }
            long r27 = r4.lastModified()     // Catch:{ all -> 0x0432 }
            long r25 = r25 - r27
            long r25 = r25 / r20
            int r0 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x00f6
            r20 = 2
            int r0 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e3
        L_0x00e1:
            r0 = 0
            goto L_0x00f7
        L_0x00e3:
            r20 = 5
            int r0 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f6
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0432 }
            java.lang.String r14 = ".log"
            boolean r0 = r0.endsWith(r14)     // Catch:{ all -> 0x0432 }
            if (r0 == 0) goto L_0x00f6
            goto L_0x00e1
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ all -> 0x0432 }
            java.lang.String r15 = "file: %s, modify interval: %d s, safe upload: %s"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0432 }
            java.lang.String r28 = r4.getName()     // Catch:{ all -> 0x0432 }
            r17 = 0
            r3[r17] = r28     // Catch:{ all -> 0x0432 }
            java.lang.Long r25 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0432 }
            r19 = 1
            r3[r19] = r25     // Catch:{ all -> 0x0432 }
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0432 }
            r26 = 2
            r3[r26] = r25     // Catch:{ all -> 0x0432 }
            java.lang.String r3 = java.lang.String.format(r14, r15, r3)     // Catch:{ all -> 0x0432 }
            com.p259uc.crashsdk.p260a.C3075a.m20975a(r3)     // Catch:{ all -> 0x0432 }
            if (r0 != 0) goto L_0x0121
            int r8 = r8 + 1
            goto L_0x00c3
        L_0x0121:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21394k()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "([^_]+)_([^_]+)_([^_]+)\\.crashsdk"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ all -> 0x01be }
            java.util.regex.Matcher r0 = r3.matcher(r0)     // Catch:{ all -> 0x01be }
            boolean r3 = r0.matches()     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x01b5
            r3 = 1
            java.lang.String r14 = r0.group(r3)     // Catch:{ all -> 0x01be }
            r3 = 2
            java.lang.String r15 = r0.group(r3)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = r0.group(r2)     // Catch:{ all -> 0x01be }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x01be }
            java.lang.String r2 = "%s%s_%s_%s.%s"
            r26 = r8
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b3 }
            java.lang.String r15 = m21284i(r15)     // Catch:{ all -> 0x01b3 }
            r17 = 0
            r8[r17] = r15     // Catch:{ all -> 0x01b3 }
            java.lang.String r15 = m21292m()     // Catch:{ all -> 0x01b3 }
            r19 = 1
            r8[r19] = r15     // Catch:{ all -> 0x01b3 }
            java.lang.String r15 = m21197P()     // Catch:{ all -> 0x01b3 }
            r27 = 2
            r8[r27] = r15     // Catch:{ all -> 0x01b3 }
            r15 = 3
            r8[r15] = r14     // Catch:{ all -> 0x01b3 }
            r14 = 4
            r8[r14] = r0     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = java.lang.String.format(r3, r2, r8)     // Catch:{ all -> 0x01b3 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01b3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b3 }
            r3.<init>()     // Catch:{ all -> 0x01b3 }
            java.lang.String r8 = com.p259uc.crashsdk.C3093g.m21371V()     // Catch:{ all -> 0x01b3 }
            r3.append(r8)     // Catch:{ all -> 0x01b3 }
            r3.append(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01b3 }
            r2.<init>(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = "File "
            r0.<init>(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = r4.getPath()     // Catch:{ all -> 0x01b3 }
            r0.append(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = " matches, rename to "
            r0.append(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = r2.getPath()     // Catch:{ all -> 0x01b3 }
            r0.append(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = "crashsdk"
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r3, r0)     // Catch:{ all -> 0x01b3 }
            r4.renameTo(r2)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b8
        L_0x01b3:
            r0 = move-exception
            goto L_0x01c1
        L_0x01b5:
            r26 = r8
            r2 = r4
        L_0x01b8:
            if (r2 == r4) goto L_0x01bc
            int r12 = r12 + 1
        L_0x01bc:
            r4 = r2
            goto L_0x01c4
        L_0x01be:
            r0 = move-exception
            r26 = r8
        L_0x01c1:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x0432 }
        L_0x01c4:
            java.lang.String r0 = r4.getPath()     // Catch:{ all -> 0x0432 }
            boolean[] r2 = m21293m(r0)     // Catch:{ all -> 0x0432 }
            r3 = 0
            boolean r8 = r2[r3]     // Catch:{ all -> 0x0432 }
            r14 = 1
            boolean r15 = r2[r14]     // Catch:{ all -> 0x0432 }
            java.lang.String r8 = m21243b(r0, r8, r15)     // Catch:{ all -> 0x0432 }
            if (r0 == r8) goto L_0x01ea
            boolean r0 = r2[r3]     // Catch:{ all -> 0x0432 }
            if (r0 == 0) goto L_0x01de
            int r11 = r11 + 1
        L_0x01de:
            r3 = 1
            boolean r0 = r2[r3]     // Catch:{ all -> 0x0432 }
            if (r0 == 0) goto L_0x01e5
            int r9 = r9 + 1
        L_0x01e5:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0432 }
            r4.<init>(r8)     // Catch:{ all -> 0x0432 }
        L_0x01ea:
            java.io.File r0 = com.p259uc.crashsdk.C3086d.m21172a(r4)     // Catch:{ all -> 0x0432 }
            if (r0 != 0) goto L_0x01f2
            r0 = 0
            goto L_0x020b
        L_0x01f2:
            if (r4 == r0) goto L_0x020b
            java.lang.String r3 = r4.getName()     // Catch:{ all -> 0x0432 }
            java.lang.String r8 = r0.getName()     // Catch:{ all -> 0x0432 }
            boolean r3 = r3.equals(r8)     // Catch:{ all -> 0x0432 }
            if (r3 != 0) goto L_0x020b
            boolean r3 = r4.exists()     // Catch:{ all -> 0x0432 }
            if (r3 == 0) goto L_0x020b
            r4.delete()     // Catch:{ all -> 0x0432 }
        L_0x020b:
            if (r0 != 0) goto L_0x0223
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0432 }
            java.lang.String r2 = "onBeforeUploadLog return null, skip upload: "
            r0.<init>(r2)     // Catch:{ all -> 0x0432 }
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ all -> 0x0432 }
            r0.append(r2)     // Catch:{ all -> 0x0432 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0432 }
            com.p259uc.crashsdk.p260a.C3075a.m20978b(r0)     // Catch:{ all -> 0x0432 }
            goto L_0x0237
        L_0x0223:
            int r3 = com.p259uc.crashsdk.C3093g.m21409z()     // Catch:{ all -> 0x0432 }
            if (r3 <= 0) goto L_0x023e
            long r14 = r0.length()     // Catch:{ all -> 0x0432 }
            long r3 = (long) r3     // Catch:{ all -> 0x0432 }
            int r8 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x023e
            int r10 = r10 + 1
            com.p259uc.crashsdk.p260a.C3081g.m21029a(r0)     // Catch:{ all -> 0x0432 }
        L_0x0237:
            r8 = r31
            r15 = r24
            r14 = 0
            goto L_0x03bd
        L_0x023e:
            com.uc.crashsdk.e$d r3 = new com.uc.crashsdk.e$d     // Catch:{ all -> 0x0432 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x0432 }
            r14 = 0
            r3.f16441b = r14     // Catch:{ all -> 0x0432 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0432 }
            r3.f16440a = r14     // Catch:{ all -> 0x0432 }
            java.lang.String r4 = m21201T()     // Catch:{ all -> 0x0432 }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0432 }
            r8.<init>(r4)     // Catch:{ all -> 0x0432 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x0432 }
            if (r8 == 0) goto L_0x0270
            com.uc.crashsdk.a.e r8 = new com.uc.crashsdk.a.e     // Catch:{ all -> 0x0432 }
            r14 = 451(0x1c3, float:6.32E-43)
            r15 = 2
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ all -> 0x0432 }
            r15 = 0
            r2[r15] = r4     // Catch:{ all -> 0x0432 }
            r15 = 1
            r2[r15] = r3     // Catch:{ all -> 0x0432 }
            r8.<init>(r14, r2)     // Catch:{ all -> 0x0432 }
            m21234a(r4, r8)     // Catch:{ all -> 0x0432 }
        L_0x0270:
            long r14 = com.p259uc.crashsdk.C3093g.m21350A()     // Catch:{ all -> 0x0432 }
            int r2 = com.p259uc.crashsdk.C3093g.m21351B()     // Catch:{ all -> 0x0432 }
            int r4 = com.p259uc.crashsdk.C3093g.m21352C()     // Catch:{ all -> 0x0432 }
            r20 = 0
            int r8 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r8 < 0) goto L_0x02a5
            r20 = r9
            long r8 = r3.f16441b     // Catch:{ all -> 0x0432 }
            long r29 = r0.length()     // Catch:{ all -> 0x0432 }
            long r8 = r8 + r29
            int r21 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r21 <= 0) goto L_0x02a7
            r8 = 1
            r3.f16444e = r8     // Catch:{ all -> 0x0432 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0432 }
            java.lang.String r4 = "Reach max upload bytes: "
            r2.<init>(r4)     // Catch:{ all -> 0x0432 }
            r2.append(r14)     // Catch:{ all -> 0x0432 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0432 }
        L_0x02a1:
            com.p259uc.crashsdk.p260a.C3075a.m20978b(r2)     // Catch:{ all -> 0x0432 }
            goto L_0x02e3
        L_0x02a5:
            r20 = r9
        L_0x02a7:
            boolean r8 = com.p259uc.crashsdk.C3093g.m21389f()     // Catch:{ all -> 0x0432 }
            if (r8 != 0) goto L_0x02e3
            boolean r8 = m21254b(r0)     // Catch:{ all -> 0x0432 }
            if (r8 == 0) goto L_0x02cb
            if (r2 < 0) goto L_0x02e3
            int r4 = r3.f16442c     // Catch:{ all -> 0x0432 }
            if (r4 < r2) goto L_0x02e3
            r4 = 1
            r3.f16446g = r4     // Catch:{ all -> 0x0432 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0432 }
            java.lang.String r8 = "Reach max upload builtin log count: "
            r4.<init>(r8)     // Catch:{ all -> 0x0432 }
            r4.append(r2)     // Catch:{ all -> 0x0432 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0432 }
            goto L_0x02a1
        L_0x02cb:
            if (r4 < 0) goto L_0x02e3
            int r2 = r3.f16443d     // Catch:{ all -> 0x0432 }
            if (r2 < r4) goto L_0x02e3
            r2 = 1
            r3.f16445f = r2     // Catch:{ all -> 0x0432 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0432 }
            java.lang.String r8 = "Reach max upload custom log count: "
            r2.<init>(r8)     // Catch:{ all -> 0x0432 }
            r2.append(r4)     // Catch:{ all -> 0x0432 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0432 }
            goto L_0x02a1
        L_0x02e3:
            boolean r2 = r3.f16444e     // Catch:{ all -> 0x0432 }
            if (r2 == 0) goto L_0x02f2
            r8 = r31
            r9 = r20
            r15 = r24
            r14 = 0
            r23 = 1
            goto L_0x03bd
        L_0x02f2:
            boolean r2 = r3.f16446g     // Catch:{ all -> 0x0432 }
            if (r2 == 0) goto L_0x02fe
            r8 = r31
            r9 = r20
            r14 = 0
            r15 = 1
            goto L_0x03bd
        L_0x02fe:
            boolean r2 = r3.f16445f     // Catch:{ all -> 0x0432 }
            if (r2 == 0) goto L_0x030d
            r8 = r31
            r9 = r20
            r15 = r24
            r14 = 0
            r16 = 1
            goto L_0x03bd
        L_0x030d:
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x0432 }
            java.lang.String r4 = m21196O()     // Catch:{ all -> 0x0432 }
            boolean r4 = r2.startsWith(r4)     // Catch:{ all -> 0x0432 }
            if (r4 == 0) goto L_0x032c
            java.lang.String r4 = "_"
            r8 = 10
            java.lang.String[] r2 = r2.split(r4, r8)     // Catch:{ all -> 0x0432 }
            int r4 = r2.length     // Catch:{ all -> 0x0432 }
            r8 = 9
            if (r4 != r8) goto L_0x032c
            r4 = 1
            r2 = r2[r4]     // Catch:{ all -> 0x0432 }
            goto L_0x032d
        L_0x032c:
            r2 = 0
        L_0x032d:
            if (r2 == 0) goto L_0x033b
            java.lang.String r4 = com.p259uc.crashsdk.C3093g.m21367R()     // Catch:{ all -> 0x0432 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0432 }
            if (r2 == 0) goto L_0x033b
            r2 = 1
            goto L_0x033c
        L_0x033b:
            r2 = 0
        L_0x033c:
            java.lang.String r4 = r0.getName()     // Catch:{ all -> 0x0432 }
            r8 = r31
            boolean r4 = com.p259uc.crashsdk.p260a.C3077c.m20988a(r0, r4, r8)     // Catch:{ all -> 0x0432 }
            if (r4 == 0) goto L_0x03a1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0432 }
            java.lang.String r9 = "Uploaded log: "
            r4.<init>(r9)     // Catch:{ all -> 0x0432 }
            java.lang.String r9 = r0.getName()     // Catch:{ all -> 0x0432 }
            r4.append(r9)     // Catch:{ all -> 0x0432 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0432 }
            java.lang.String r9 = "crashsdk"
            r13 = 0
            com.p259uc.crashsdk.p260a.C3075a.m20977a(r9, r4, r13)     // Catch:{ all -> 0x0432 }
            if (r2 == 0) goto L_0x0367
            r2 = 13
            com.p259uc.crashsdk.C3092f.m21329a(r2)     // Catch:{ all -> 0x0432 }
        L_0x0367:
            long r13 = r3.f16441b     // Catch:{ all -> 0x0432 }
            long r29 = r0.length()     // Catch:{ all -> 0x0432 }
            long r13 = r13 + r29
            r3.f16441b = r13     // Catch:{ all -> 0x0432 }
            boolean r2 = m21254b(r0)     // Catch:{ all -> 0x0432 }
            if (r2 == 0) goto L_0x037e
            int r2 = r3.f16442c     // Catch:{ all -> 0x0432 }
            r4 = 1
            int r2 = r2 + r4
            r3.f16442c = r2     // Catch:{ all -> 0x0432 }
            goto L_0x0384
        L_0x037e:
            r4 = 1
            int r2 = r3.f16443d     // Catch:{ all -> 0x0432 }
            int r2 = r2 + r4
            r3.f16443d = r2     // Catch:{ all -> 0x0432 }
        L_0x0384:
            java.lang.String r2 = m21201T()     // Catch:{ all -> 0x0432 }
            com.uc.crashsdk.a.e r4 = new com.uc.crashsdk.a.e     // Catch:{ all -> 0x0432 }
            r9 = 452(0x1c4, float:6.33E-43)
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0432 }
            r14 = 0
            r13[r14] = r2     // Catch:{ all -> 0x0432 }
            r15 = 1
            r13[r15] = r3     // Catch:{ all -> 0x0432 }
            r4.<init>(r9, r13)     // Catch:{ all -> 0x0432 }
            m21234a(r2, r4)     // Catch:{ all -> 0x0432 }
            r0.delete()     // Catch:{ all -> 0x0432 }
            r2 = 3
            r13 = 0
            goto L_0x03ac
        L_0x03a1:
            r14 = 0
            int r13 = r13 + 1
            if (r2 == 0) goto L_0x03ab
            r0 = 14
            com.p259uc.crashsdk.C3092f.m21329a(r0)     // Catch:{ all -> 0x0432 }
        L_0x03ab:
            r2 = 3
        L_0x03ac:
            if (r13 < r2) goto L_0x03b9
            java.lang.String r0 = "Upload failed 3 times continuously, abort upload!"
            java.lang.String r2 = "crashsdk"
            r3 = 0
            com.p259uc.crashsdk.p260a.C3075a.m20977a(r2, r0, r3)     // Catch:{ all -> 0x0432 }
            r9 = r20
            goto L_0x03cf
        L_0x03b9:
            r9 = r20
            r15 = r24
        L_0x03bd:
            int r5 = r5 + 1
            r2 = r18
            r3 = r22
            r14 = r23
            r8 = r26
            goto L_0x005b
        L_0x03c9:
            r26 = r8
            r23 = r14
            r24 = r15
        L_0x03cf:
            if (r7 <= 0) goto L_0x03d6
            r0 = 200(0xc8, float:2.8E-43)
            com.p259uc.crashsdk.C3092f.m21330a(r0, r7)     // Catch:{ all -> 0x0432 }
        L_0x03d6:
            if (r6 <= 0) goto L_0x03dd
            r0 = 15
            com.p259uc.crashsdk.C3092f.m21330a(r0, r6)     // Catch:{ all -> 0x0432 }
        L_0x03dd:
            if (r10 <= 0) goto L_0x03e4
            r0 = 17
            com.p259uc.crashsdk.C3092f.m21330a(r0, r10)     // Catch:{ all -> 0x0432 }
        L_0x03e4:
            if (r23 == 0) goto L_0x03eb
            r0 = 19
            com.p259uc.crashsdk.C3092f.m21329a(r0)     // Catch:{ all -> 0x0432 }
        L_0x03eb:
            if (r24 == 0) goto L_0x03f2
            r0 = 20
            com.p259uc.crashsdk.C3092f.m21329a(r0)     // Catch:{ all -> 0x0432 }
        L_0x03f2:
            if (r16 == 0) goto L_0x03f9
            r0 = 21
            com.p259uc.crashsdk.C3092f.m21329a(r0)     // Catch:{ all -> 0x0432 }
        L_0x03f9:
            if (r23 != 0) goto L_0x03ff
            if (r24 != 0) goto L_0x03ff
            if (r16 == 0) goto L_0x0404
        L_0x03ff:
            r0 = 18
            com.p259uc.crashsdk.C3092f.m21329a(r0)     // Catch:{ all -> 0x0432 }
        L_0x0404:
            if (r11 <= 0) goto L_0x040b
            r0 = 24
            com.p259uc.crashsdk.C3092f.m21330a(r0, r11)     // Catch:{ all -> 0x0432 }
        L_0x040b:
            if (r9 <= 0) goto L_0x0412
            r0 = 201(0xc9, float:2.82E-43)
            com.p259uc.crashsdk.C3092f.m21330a(r0, r9)     // Catch:{ all -> 0x0432 }
        L_0x0412:
            if (r12 <= 0) goto L_0x0419
            r0 = 25
            com.p259uc.crashsdk.C3092f.m21330a(r0, r12)     // Catch:{ all -> 0x0432 }
        L_0x0419:
            if (r26 <= 0) goto L_0x042a
            r0 = 26
            r4 = r26
            com.p259uc.crashsdk.C3092f.m21330a(r0, r4)     // Catch:{ all -> 0x0432 }
            goto L_0x042a
        L_0x0423:
            java.lang.String r0 = "upload url is empty!"
            java.lang.String r2 = "crashsdk"
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r2, r0)     // Catch:{ all -> 0x0432 }
        L_0x042a:
            if (r33 == 0) goto L_0x043b
            java.lang.Object r0 = f16421n     // Catch:{ all -> 0x043d }
        L_0x042e:
            r0.notify()     // Catch:{ all -> 0x043d }
            goto L_0x043b
        L_0x0432:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x043f }
            if (r33 == 0) goto L_0x043b
            java.lang.Object r0 = f16421n     // Catch:{ all -> 0x043d }
            goto L_0x042e
        L_0x043b:
            monitor-exit(r1)     // Catch:{ all -> 0x043d }
            return
        L_0x043d:
            r0 = move-exception
            goto L_0x0449
        L_0x043f:
            r0 = move-exception
            r2 = r0
            if (r33 == 0) goto L_0x0448
            java.lang.Object r0 = f16421n     // Catch:{ all -> 0x043d }
            r0.notify()     // Catch:{ all -> 0x043d }
        L_0x0448:
            throw r2     // Catch:{ all -> 0x043d }
        L_0x0449:
            monitor-exit(r1)     // Catch:{ all -> 0x043d }
            goto L_0x044c
        L_0x044b:
            throw r0
        L_0x044c:
            goto L_0x044b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21226a(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    public static boolean m21238a(boolean z, boolean z2) {
        if (!f16412d) {
            if (C3084b.f16345d) {
                JNIBridge.set(1, true);
            }
            f16412d = true;
        }
        try {
            String k = m21288k();
            if (C3081g.m21032a(k)) {
                C3075a.m20976a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            Object obj = f16421n;
            synchronized (obj) {
                if (C3080f.m21013a(z ? 1 : 0, (Runnable) new C3079e(406, new Object[]{k, Boolean.valueOf(z2), Boolean.valueOf(z)})) && z) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        C3081g.m21027a((Throwable) e);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            C3081g.m21027a(th);
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.nio.channels.FileChannel] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.nio.channels.FileLock] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.nio.channels.FileLock] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.nio.channels.FileChannel] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0057, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0058, code lost:
        r1 = 0;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.p259uc.crashsdk.p260a.C3081g.m21027a((java.lang.Throwable) r5);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0060, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0061, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v3
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], java.nio.channels.FileLock]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.nio.channels.FileLock, java.io.Closeable]
  mth insns count: 53
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
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:11:0x0018] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21234a(java.lang.String r5, com.p259uc.crashsdk.p260a.C3079e r6) {
        /*
            java.lang.Object r0 = f16422o
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0066 }
            r1.<init>(r5)     // Catch:{ all -> 0x0066 }
            boolean r5 = r1.exists()     // Catch:{ all -> 0x0066 }
            if (r5 != 0) goto L_0x0016
            r1.createNewFile()     // Catch:{ Exception -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            r5 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r5)     // Catch:{ all -> 0x0066 }
        L_0x0016:
            r5 = 0
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            java.lang.String r4 = "rw"
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            r6 = move-exception
            goto L_0x0062
        L_0x0026:
            r1 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ Exception -> 0x0057, all -> 0x0024 }
            r1 = r5
        L_0x002b:
            if (r1 == 0) goto L_0x0039
            java.nio.channels.FileLock r5 = r1.lock()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0039
        L_0x0032:
            r3 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0039
        L_0x0037:
            r5 = move-exception
            goto L_0x005a
        L_0x0039:
            boolean r2 = r6.mo18711a()     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x0047
            r5.release()     // Catch:{ Exception -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r5 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r5)     // Catch:{ Exception -> 0x0037 }
        L_0x0047:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r1)     // Catch:{ all -> 0x0066 }
            goto L_0x005e
        L_0x004b:
            r6 = move-exception
            if (r5 == 0) goto L_0x0056
            r5.release()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r5 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r5)     // Catch:{ Exception -> 0x0037 }
        L_0x0056:
            throw r6     // Catch:{ Exception -> 0x0037 }
        L_0x0057:
            r6 = move-exception
            r1 = r5
            r5 = r6
        L_0x005a:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r5)     // Catch:{ all -> 0x0060 }
            goto L_0x0047
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return r2
        L_0x0060:
            r6 = move-exception
            r5 = r1
        L_0x0062:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r5)     // Catch:{ all -> 0x0066 }
            throw r6     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r5
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21234a(java.lang.String, com.uc.crashsdk.a.e):boolean");
    }

    /* renamed from: a */
    private static boolean m21235a(String str, C3091d dVar) {
        String a = C3081g.m21019a(new File(str), 64, false);
        if (a == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(a);
            if (matcher.find()) {
                long parseLong = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - parseLong < 86400000) {
                    dVar.f16441b = Long.parseLong(matcher.group(2));
                    dVar.f16442c = Integer.parseInt(matcher.group(3));
                    dVar.f16443d = Integer.parseInt(matcher.group(4));
                    dVar.f16440a = parseLong;
                }
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m21237a(StringBuffer stringBuffer, String str, long j, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j2;
        boolean z;
        boolean a;
        boolean z2;
        String str3 = str;
        if (f16411c.get()) {
            StringBuilder sb = new StringBuilder("Processing java crash, skip generate custom log: ");
            sb.append(str3);
            C3075a.m20978b(sb.toString());
            return false;
        }
        boolean z3 = f16409af || C3084b.m21110I();
        if (!z3 && !C3078d.m21005d()) {
            C3075a.m20980c("DEBUG", C3078d.m21003b());
            return false;
        } else if (!m21260c(str)) {
            StringBuilder sb2 = new StringBuilder("custom log sample miss: ");
            sb2.append(str3);
            C3075a.m20981d("DEBUG", sb2.toString());
            return false;
        } else if (m21207Z()) {
            StringBuilder sb3 = new StringBuilder("Processing native crash, skip generate custom log: ");
            sb3.append(str3);
            C3075a.m20978b(sb3.toString());
            return false;
        } else if (stringBuffer == null || str3 == null) {
            return false;
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C3093g.m21371V());
            sb4.append(m21286j(str));
            String sb5 = sb4.toString();
            boolean z4 = (j & 32) != 0;
            if (z3) {
                long nativeClientCreateConnection = C3084b.f16345d ? JNIBridge.nativeClientCreateConnection(sb5, "custom", str3, z4 ? 1 : 0) : 0;
                if (nativeClientCreateConnection == 0) {
                    StringBuilder sb6 = new StringBuilder("skip custom log: ");
                    sb6.append(str3);
                    C3075a.m20981d("DEBUG", sb6.toString());
                    return false;
                }
                j2 = nativeClientCreateConnection;
            } else if (m21236a(m21281h(), str3, z4)) {
                return false;
            } else {
                C3093g.m21378a();
                m21230a(false);
                j2 = 0;
            }
            synchronized (f16423p) {
                z = z4;
                a = m21233a(sb5, j2, stringBuffer, str, j, arrayList, arrayList2, arrayList3, str2);
            }
            if (a && !z3) {
                m21251b(m21281h(), str3, z);
            }
            if (j2 != 0) {
                JNIBridge.nativeClientCloseConnection(j2);
            }
            if (!a) {
                return false;
            }
            if (!z3) {
                m21301q(sb5);
            }
            if (!z3) {
                sb5 = m21213a(m21290l(sb5));
            }
            m21250b(sb5, str3);
            if (!z || z3) {
                z2 = true;
            } else {
                z2 = true;
                try {
                    m21238a(true, false);
                } catch (Throwable th) {
                    C3081g.m21027a(th);
                }
            }
            return z2;
        }
    }

    /* renamed from: a */
    static boolean m21236a(String str, String str2, boolean z) {
        if (!m21295n(str2)) {
            return false;
        }
        C3082h.m21069a(str, str2, true, z);
        C3075a.m20978b(String.format(Locale.US, "Custom log '%s' has reach max count!", new Object[]{str2}));
        return true;
    }

    /* renamed from: a */
    private static void m21221a(C3088a aVar, String str, long j) {
        String str2;
        String str3 = "UTF-8";
        String str4 = null;
        if (C3084b.f16345d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
            str2 = JNIBridge.nativeDumpThreads(str, j);
            if (f16409af || str2 == null || str2.length() >= 512 || !str2.startsWith("/") || str2.indexOf(10) >= 0) {
                str4 = str2;
            } else {
                if (!new File(str2).exists()) {
                    StringBuilder sb = new StringBuilder("Can not found ");
                    sb.append(str2);
                    str4 = sb.toString();
                }
                String str5 = str4;
                str4 = str2;
                str2 = str5;
            }
        } else {
            str2 = "Native not initialized, skip dump!";
        }
        if (str2 != null) {
            try {
                aVar.write(str2.getBytes(str3));
                aVar.write("\n".getBytes(str3));
            } catch (Throwable th2) {
                C3081g.m21027a(th2);
            }
            m21222a((OutputStream) aVar);
        } else if (str4 != null && !f16409af) {
            m21240b((OutputStream) aVar, str4, (int) LogType.ANR);
            File file = new File(str4);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            C3081g.m21027a(th3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21233a(java.lang.String r17, long r18, java.lang.StringBuffer r20, java.lang.String r21, long r22, java.util.ArrayList<java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.lang.String r27) {
        /*
            r1 = r17
            r2 = r18
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = 0
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x001a }
            r0.<init>(r1)     // Catch:{ all -> 0x001a }
            r11 = r0
            goto L_0x001f
        L_0x001a:
            r0 = move-exception
            r11 = r8
            r12 = r11
            goto L_0x003d
        L_0x001e:
            r11 = r8
        L_0x001f:
            com.uc.crashsdk.e$a r12 = new com.uc.crashsdk.e$a     // Catch:{ all -> 0x003b }
            r12.<init>(r2, r11)     // Catch:{ all -> 0x003b }
            java.util.ArrayList<java.lang.String> r13 = f16425r     // Catch:{ all -> 0x0039 }
            monitor-enter(r13)     // Catch:{ all -> 0x0039 }
            f16427t = r1     // Catch:{ all -> 0x0036 }
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r14 = f16427t     // Catch:{ all -> 0x0036 }
            com.p259uc.crashsdk.JNIBridge.set(r0, r14)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r13)     // Catch:{ all -> 0x0036 }
            goto L_0x0040
        L_0x0036:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            goto L_0x003d
        L_0x003b:
            r0 = move-exception
            r12 = r8
        L_0x003d:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x0040:
            r13 = 0
            if (r12 != 0) goto L_0x0044
            return r13
        L_0x0044:
            r14 = 1
            long r14 = r22 & r14
            r16 = 1
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
            r14 = r21
            m21248b(r12, r1, r14)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            r0 = move-exception
            goto L_0x0137
        L_0x0057:
            java.lang.String r0 = r20.toString()     // Catch:{ all -> 0x0071 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0071 }
            r12.write(r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "\n"
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch:{ all -> 0x0071 }
            r12.write(r0)     // Catch:{ all -> 0x0071 }
            r12.flush()     // Catch:{ all -> 0x0071 }
            goto L_0x0075
        L_0x0071:
            r0 = move-exception
            m21228a(r0, r12)     // Catch:{ all -> 0x0054 }
        L_0x0075:
            m21222a(r12)     // Catch:{ all -> 0x0054 }
            r0 = 4
            long r0 = r22 & r0
            int r14 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x008c
            m21247b(r12)     // Catch:{ all -> 0x0054 }
            r12.flush()     // Catch:{ all -> 0x0087 }
            goto L_0x008c
        L_0x0087:
            r0 = move-exception
            r1 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r1)     // Catch:{ all -> 0x0054 }
        L_0x008c:
            if (r4 == 0) goto L_0x0099
            int r0 = r24.size()     // Catch:{ all -> 0x0054 }
            if (r0 <= 0) goto L_0x0099
            java.lang.String r0 = "UTF-8"
            com.p259uc.crashsdk.ProGuard.m20950a(r12, r0, r4)     // Catch:{ all -> 0x0054 }
        L_0x0099:
            if (r5 == 0) goto L_0x00a8
            int r0 = r25.size()     // Catch:{ all -> 0x0054 }
            if (r0 <= 0) goto L_0x00a8
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n"
            com.p259uc.crashsdk.ProGuard.m20949a(r12, r0, r1, r5)     // Catch:{ all -> 0x0054 }
        L_0x00a8:
            if (r6 == 0) goto L_0x00b7
            int r0 = r26.size()     // Catch:{ all -> 0x0054 }
            if (r0 <= 0) goto L_0x00b7
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n"
            com.p259uc.crashsdk.ProGuard.m20959b(r12, r0, r1, r6)     // Catch:{ all -> 0x0054 }
        L_0x00b7:
            if (r7 == 0) goto L_0x00e3
            r12.flush()     // Catch:{ all -> 0x00bd }
            goto L_0x00c2
        L_0x00bd:
            r0 = move-exception
            r1 = r0
            m21228a(r1, r12)     // Catch:{ all -> 0x0054 }
        L_0x00c2:
            java.lang.String r0 = "threads dump:\n"
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch:{ all -> 0x00ce }
            r12.write(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x00d2
        L_0x00ce:
            r0 = move-exception
            m21228a(r0, r12)     // Catch:{ all -> 0x0054 }
        L_0x00d2:
            f16415h = r13     // Catch:{ all -> 0x0054 }
            f16429v = r7     // Catch:{ all -> 0x0054 }
            m21221a(r12, r7, r2)     // Catch:{ all -> 0x00da }
            goto L_0x00df
        L_0x00da:
            r0 = move-exception
            r1 = r0
            m21228a(r1, r12)     // Catch:{ all -> 0x0054 }
        L_0x00df:
            f16429v = r8     // Catch:{ all -> 0x0054 }
            f16415h = r16     // Catch:{ all -> 0x0054 }
        L_0x00e3:
            r0 = 8
            long r0 = r22 & r0
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0116
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0116
            r12.flush()     // Catch:{ all -> 0x00f3 }
            goto L_0x00f8
        L_0x00f3:
            r0 = move-exception
            r1 = r0
            m21228a(r1, r12)     // Catch:{ all -> 0x0054 }
        L_0x00f8:
            java.lang.String r0 = "all threads dump:\n"
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch:{ all -> 0x0104 }
            r12.write(r0)     // Catch:{ all -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r0 = move-exception
            m21228a(r0, r12)     // Catch:{ all -> 0x0054 }
        L_0x0108:
            f16428u = r16     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "all"
            m21221a(r12, r0, r9)     // Catch:{ all -> 0x0110 }
            goto L_0x0114
        L_0x0110:
            r0 = move-exception
            m21228a(r0, r12)     // Catch:{ all -> 0x0054 }
        L_0x0114:
            f16428u = r13     // Catch:{ all -> 0x0054 }
        L_0x0116:
            r0 = 16
            long r0 = r22 & r0
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0121
            m21271e(r12)     // Catch:{ all -> 0x0054 }
        L_0x0121:
            r0 = 2
            long r0 = r22 & r0
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x012f
            r12.mo18730a()     // Catch:{ all -> 0x0054 }
            m21220a(r12)     // Catch:{ all -> 0x0054 }
        L_0x012f:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x013a
            m21246b(r12)     // Catch:{ all -> 0x0054 }
            goto L_0x013a
        L_0x0137:
            m21228a(r0, r12)     // Catch:{ all -> 0x017d }
        L_0x013a:
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r12)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r11)
            java.util.ArrayList<java.lang.String> r1 = f16425r     // Catch:{ all -> 0x0178 }
            monitor-enter(r1)     // Catch:{ all -> 0x0178 }
            int r0 = f16426s     // Catch:{ all -> 0x0175 }
            int r0 = r0 + 1
            f16426s = r0     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = f16427t     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0167
            r1.add(r0)     // Catch:{ all -> 0x0175 }
            int r0 = r1.size()     // Catch:{ all -> 0x0175 }
            r2 = 3
            if (r0 <= r2) goto L_0x015a
            r1.remove(r13)     // Catch:{ all -> 0x0175 }
        L_0x015a:
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0165
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r2 = f16427t     // Catch:{ all -> 0x0175 }
            com.p259uc.crashsdk.JNIBridge.set(r0, r2)     // Catch:{ all -> 0x0175 }
        L_0x0165:
            f16427t = r8     // Catch:{ all -> 0x0175 }
        L_0x0167:
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0173
            r0 = 25
            int r2 = f16426s     // Catch:{ all -> 0x0175 }
            long r2 = (long) r2     // Catch:{ all -> 0x0175 }
            com.p259uc.crashsdk.JNIBridge.set(r0, r2)     // Catch:{ all -> 0x0175 }
        L_0x0173:
            monitor-exit(r1)     // Catch:{ all -> 0x0175 }
            goto L_0x017c
        L_0x0175:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0178 }
        L_0x0178:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x017c:
            return r16
        L_0x017d:
            r0 = move-exception
            r1 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r12)
            com.p259uc.crashsdk.p260a.C3081g.m21025a(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.m21233a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static void m21225a(String str, boolean z) {
        if (z) {
            f16431x = str;
            return;
        }
        synchronized (f16432y) {
            f16430w = str;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n");
            C3076b.m20984a(C3084b.m21149f(), sb.toString());
        }
    }

    /* renamed from: a */
    private static String m21216a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", new Object[]{Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds())});
    }

    /* renamed from: a */
    static void m21224a(OutputStream outputStream, String str, String str2, int i, boolean z, boolean z2) {
        int i2 = 0;
        f16415h = false;
        try {
            Locale locale = Locale.US;
            String str3 = "$^%s`%s`%d`%d,%d^$";
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(i);
            objArr[3] = Integer.valueOf(z ? 1 : 0);
            if (z2) {
                i2 = 1;
            }
            objArr[4] = Integer.valueOf(i2);
            outputStream.write(String.format(locale, str3, objArr).getBytes("UTF-8"));
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        f16415h = true;
        m21222a(outputStream);
    }

    /* renamed from: a */
    static void m21223a(OutputStream outputStream, String str, String str2) {
        f16415h = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", new Object[]{str, str2}).getBytes("UTF-8"));
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        f16415h = true;
    }

    /* renamed from: a */
    public static void m21219a(Context context) {
        try {
            if (m21202U()) {
                context.registerReceiver(new C3090c(0), new IntentFilter("android.intent.action.ANR"), null, C3080f.m21009a(3));
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:365:0x048a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        com.p259uc.crashsdk.p260a.C3081g.m21027a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x052c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x054a, code lost:
        r0 = new java.lang.StringBuilder(r3);
        r0.append(r2);
        com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0.toString());
        m21227a(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:?, code lost:
        m21238a(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0577, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0579, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x057a, code lost:
        r3 = r0;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x057d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x057e, code lost:
        r3 = r0;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0580, code lost:
        com.p259uc.crashsdk.p260a.C3081g.m21027a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x059f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x05b1, code lost:
        r0 = f16396T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x05b3, code lost:
        if (r0 != null) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x05b5, code lost:
        r0.uncaughtException(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x05d5, code lost:
        android.os.Process.killProcess(android.os.Process.myPid());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:260:0x032e, B:363:0x0486] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01f3 A[SYNTHETIC, Splitter:B:144:0x01f3] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0257 A[Catch:{ all -> 0x0280 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0269 A[Catch:{ all -> 0x0280 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x02d2 A[Catch:{ all -> 0x02fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x02e4 A[Catch:{ all -> 0x02fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0372 A[Catch:{ all -> 0x039b }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0384 A[Catch:{ all -> 0x039b }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x03f1 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0403 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x045e A[Catch:{ all -> 0x048a, all -> 0x052c }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x04ba A[SYNTHETIC, Splitter:B:376:0x04ba] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x04ee A[Catch:{ all -> 0x0517 }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0500 A[Catch:{ all -> 0x0517 }] */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x054a A[Catch:{ all -> 0x05dd, all -> 0x05ff, all -> 0x05fc, all -> 0x0611, all -> 0x0649 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x056b A[SYNTHETIC, Splitter:B:431:0x056b] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x059f A[Catch:{ all -> 0x05c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x05b1 A[Catch:{ all -> 0x05c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0088 A[Catch:{ all -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a A[Catch:{ all -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0109 A[Catch:{ all -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b A[Catch:{ all -> 0x0132 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18728a(java.lang.Thread r20, java.lang.Throwable r21, boolean r22) {
        /*
            r19 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "original exception is: "
            java.lang.String r4 = "crashsdk"
            java.lang.String r5 = "Call java default handler: "
            java.lang.String r6 = "DEBUG"
            boolean r0 = f16409af
            r7 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0016
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d
            if (r0 != 0) goto L_0x001c
        L_0x0016:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21110I()
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r9 = 1
            goto L_0x001f
        L_0x001e:
            r9 = 0
        L_0x001f:
            java.util.concurrent.atomic.AtomicBoolean r0 = f16411c     // Catch:{ all -> 0x0530 }
            boolean r0 = r0.getAndSet(r7)     // Catch:{ all -> 0x0530 }
            r12 = 4
            if (r0 == 0) goto L_0x00c5
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0530 }
            if (r0 <= 0) goto L_0x00c5
            java.lang.String r0 = "another thread is generating java report!"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x0530 }
            java.lang.String r0 = "current thread exception is:"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x0530 }
            m21227a(r21)     // Catch:{ all -> 0x0530 }
            r13 = 0
        L_0x003c:
            boolean r0 = f16398V     // Catch:{ all -> 0x0530 }
            if (r0 != 0) goto L_0x004e
            r14 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r14)     // Catch:{ all -> 0x0046 }
            goto L_0x004b
        L_0x0046:
            r0 = move-exception
            r14 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r14)     // Catch:{ all -> 0x0530 }
        L_0x004b:
            int r13 = r13 + r7
            if (r13 < r12) goto L_0x003c
        L_0x004e:
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0530 }
            android.os.Process.killProcess(r0)     // Catch:{ all -> 0x0530 }
            if (r22 == 0) goto L_0x006d
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x006d
            if (r9 != 0) goto L_0x006d
            m21238a(r7, r8)     // Catch:{ all -> 0x0064 }
            r3 = 1
            goto L_0x006e
        L_0x0064:
            r0 = move-exception
            r3 = 1
            goto L_0x0069
        L_0x0067:
            r0 = move-exception
            r3 = 0
        L_0x0069:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
            goto L_0x006e
        L_0x006d:
            r3 = 0
        L_0x006e:
            if (r3 != 0) goto L_0x0075
            if (r9 != 0) goto L_0x0075
            m21252b(r8)
        L_0x0075:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x0079 }
            goto L_0x007e
        L_0x0079:
            r0 = move-exception
            r3 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
        L_0x007e:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x00b1 }
            boolean r3 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x00b1 }
            if (r3 != 0) goto L_0x0089
            r0 = 1
        L_0x0089:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r3.<init>(r5)     // Catch:{ all -> 0x00b1 }
            r3.append(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b1 }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r3)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a1
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a1
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00a1:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00b5
            if (r9 != 0) goto L_0x00b5
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x00b1 }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x00b5:
            f16398V = r7
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x00c4
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x00c4:
            return
        L_0x00c5:
            f16397U = r2     // Catch:{ all -> 0x0530 }
            if (r9 != 0) goto L_0x0146
            boolean r0 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x0530 }
            if (r0 != 0) goto L_0x0146
            java.lang.String r0 = com.p259uc.crashsdk.p260a.C3078d.m21003b()     // Catch:{ all -> 0x0530 }
            com.p259uc.crashsdk.p260a.C3075a.m20980c(r6, r0)     // Catch:{ all -> 0x0530 }
            if (r22 == 0) goto L_0x00ee
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00ee
            if (r9 != 0) goto L_0x00ee
            m21238a(r7, r8)     // Catch:{ all -> 0x00e5 }
            r3 = 1
            goto L_0x00ef
        L_0x00e5:
            r0 = move-exception
            r3 = 1
            goto L_0x00ea
        L_0x00e8:
            r0 = move-exception
            r3 = 0
        L_0x00ea:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            if (r3 != 0) goto L_0x00f6
            if (r9 != 0) goto L_0x00f6
            m21252b(r8)
        L_0x00f6:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x00fa }
            goto L_0x00ff
        L_0x00fa:
            r0 = move-exception
            r3 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
        L_0x00ff:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x0132 }
            boolean r3 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x0132 }
            if (r3 != 0) goto L_0x010a
            r0 = 1
        L_0x010a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r3.<init>(r5)     // Catch:{ all -> 0x0132 }
            r3.append(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0132 }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r3)     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0122
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0122
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x0132 }
        L_0x0122:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0136
            if (r9 != 0) goto L_0x0136
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x0132 }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x0132 }
            goto L_0x0136
        L_0x0132:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x0136:
            f16398V = r7
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x0145
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x0145:
            return
        L_0x0146:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0530 }
            java.lang.String r13 = "encryptLog: "
            r0.<init>(r13)     // Catch:{ all -> 0x0530 }
            boolean r13 = com.p259uc.crashsdk.C3093g.m21407x()     // Catch:{ all -> 0x0530 }
            r0.append(r13)     // Catch:{ all -> 0x0530 }
            java.lang.String r13 = ", zipCrashLog: "
            r0.append(r13)     // Catch:{ all -> 0x0530 }
            boolean r13 = com.p259uc.crashsdk.C3093g.m21407x()     // Catch:{ all -> 0x0530 }
            r0.append(r13)     // Catch:{ all -> 0x0530 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0530 }
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x0530 }
            java.lang.RuntimeException r0 = com.p259uc.crashsdk.C3093g.f16457a     // Catch:{ all -> 0x0530 }
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = "the set zip log to false stack is:"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x0530 }
            java.lang.RuntimeException r0 = com.p259uc.crashsdk.C3093g.f16457a     // Catch:{ all -> 0x0530 }
            r0.printStackTrace()     // Catch:{ all -> 0x0530 }
        L_0x0175:
            java.lang.RuntimeException r0 = com.p259uc.crashsdk.C3093g.f16458b     // Catch:{ all -> 0x0530 }
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = "the set encrypt to true stack is:"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x0530 }
            java.lang.RuntimeException r0 = com.p259uc.crashsdk.C3093g.f16458b     // Catch:{ all -> 0x0530 }
            r0.printStackTrace()     // Catch:{ all -> 0x0530 }
        L_0x0183:
            java.lang.String r0 = "begin to generate java report"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x0530 }
            r19.m21194M()     // Catch:{ all -> 0x018c }
            goto L_0x0191
        L_0x018c:
            r0 = move-exception
            r13 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r13)     // Catch:{ all -> 0x0530 }
        L_0x0191:
            boolean r14 = com.p259uc.crashsdk.C3093g.m21403t()     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = com.p259uc.crashsdk.C3093g.m21390g()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01a3
            java.lang.String r15 = ""
            boolean r15 = r0.equals(r15)     // Catch:{ all -> 0x01c1 }
            if (r15 == 0) goto L_0x01ab
        L_0x01a3:
            java.lang.String r0 = m21199R()     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = m21286j(r0)     // Catch:{ all -> 0x01c1 }
        L_0x01ab:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            r15.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r10 = com.p259uc.crashsdk.C3093g.m21371V()     // Catch:{ all -> 0x01c1 }
            r15.append(r10)     // Catch:{ all -> 0x01c1 }
            r15.append(r0)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x01c1 }
            r10 = r0
            r11 = 0
            goto L_0x01ed
        L_0x01c1:
            r0 = move-exception
            goto L_0x01c5
        L_0x01c3:
            r0 = move-exception
            r14 = 0
        L_0x01c5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0530 }
            java.lang.String r11 = "get java log name failed: "
            r10.<init>(r11)     // Catch:{ all -> 0x0530 }
            r10.append(r0)     // Catch:{ all -> 0x0530 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0530 }
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r10)     // Catch:{ all -> 0x0530 }
            m21227a(r0)     // Catch:{ all -> 0x0530 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0530 }
            r0.<init>(r3)     // Catch:{ all -> 0x0530 }
            r0.append(r2)     // Catch:{ all -> 0x0530 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0530 }
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x0530 }
            m21227a(r21)     // Catch:{ all -> 0x0530 }
            r10 = 0
            r11 = 1
        L_0x01ed:
            java.lang.String r15 = "omit java crash"
            java.lang.String r13 = "java"
            if (r9 != 0) goto L_0x0313
            com.p259uc.crashsdk.C3093g.m21378a()     // Catch:{ all -> 0x020a }
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x0201
            r0 = 3
            com.p259uc.crashsdk.C3092f.m21329a(r0)     // Catch:{ all -> 0x0205 }
            goto L_0x020e
        L_0x0201:
            com.p259uc.crashsdk.C3092f.m21329a(r12)     // Catch:{ all -> 0x0205 }
            goto L_0x020e
        L_0x0205:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x020a }
            goto L_0x020e
        L_0x020a:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x052e }
        L_0x020e:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x021b }
            java.lang.String r12 = com.p259uc.crashsdk.C3084b.m21138b()     // Catch:{ all -> 0x021b }
            r0.<init>(r12)     // Catch:{ all -> 0x021b }
            r0.createNewFile()     // Catch:{ all -> 0x021b }
            goto L_0x021f
        L_0x021b:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x052e }
        L_0x021f:
            if (r14 == 0) goto L_0x0294
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r15)     // Catch:{ all -> 0x052e }
            if (r22 == 0) goto L_0x023c
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x023c
            if (r9 != 0) goto L_0x023c
            m21238a(r7, r8)     // Catch:{ all -> 0x0233 }
            r3 = 1
            goto L_0x023d
        L_0x0233:
            r0 = move-exception
            r3 = 1
            goto L_0x0238
        L_0x0236:
            r0 = move-exception
            r3 = 0
        L_0x0238:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
            goto L_0x023d
        L_0x023c:
            r3 = 0
        L_0x023d:
            if (r3 != 0) goto L_0x0244
            if (r9 != 0) goto L_0x0244
            m21252b(r8)
        L_0x0244:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x0248 }
            goto L_0x024d
        L_0x0248:
            r0 = move-exception
            r3 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
        L_0x024d:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x0280 }
            boolean r3 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x0280 }
            if (r3 != 0) goto L_0x0258
            r0 = 1
        L_0x0258:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0280 }
            r3.<init>(r5)     // Catch:{ all -> 0x0280 }
            r3.append(r0)     // Catch:{ all -> 0x0280 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0280 }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r3)     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x0270
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x0270
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x0280 }
        L_0x0270:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x0284
            if (r9 != 0) goto L_0x0284
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x0280 }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x0280 }
            goto L_0x0284
        L_0x0280:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x0284:
            f16398V = r7
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x0293
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x0293:
            return
        L_0x0294:
            boolean r0 = m21260c(r13)     // Catch:{ all -> 0x052e }
            if (r0 != 0) goto L_0x030f
            java.lang.String r0 = "java log sample miss"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x052e }
            if (r22 == 0) goto L_0x02b7
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x02b7
            if (r9 != 0) goto L_0x02b7
            m21238a(r7, r8)     // Catch:{ all -> 0x02ae }
            r3 = 1
            goto L_0x02b8
        L_0x02ae:
            r0 = move-exception
            r3 = 1
            goto L_0x02b3
        L_0x02b1:
            r0 = move-exception
            r3 = 0
        L_0x02b3:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
            goto L_0x02b8
        L_0x02b7:
            r3 = 0
        L_0x02b8:
            if (r3 != 0) goto L_0x02bf
            if (r9 != 0) goto L_0x02bf
            m21252b(r8)
        L_0x02bf:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x02c3 }
            goto L_0x02c8
        L_0x02c3:
            r0 = move-exception
            r3 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
        L_0x02c8:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x02fb }
            boolean r3 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x02fb }
            if (r3 != 0) goto L_0x02d3
            r0 = 1
        L_0x02d3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fb }
            r3.<init>(r5)     // Catch:{ all -> 0x02fb }
            r3.append(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02fb }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r3)     // Catch:{ all -> 0x02fb }
            if (r0 == 0) goto L_0x02eb
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x02fb }
            if (r0 == 0) goto L_0x02eb
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x02fb }
        L_0x02eb:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x02fb }
            if (r0 == 0) goto L_0x02ff
            if (r9 != 0) goto L_0x02ff
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x02fb }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x02fb }
            goto L_0x02ff
        L_0x02fb:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x02ff:
            f16398V = r7
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x030e
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x030e:
            return
        L_0x030f:
            r12 = 0
            goto L_0x042e
        L_0x0313:
            if (r14 == 0) goto L_0x031a
            java.lang.String r10 = "omit"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r15)     // Catch:{ all -> 0x052e }
        L_0x031a:
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d     // Catch:{ all -> 0x052e }
            if (r0 == 0) goto L_0x0324
            r12 = 0
            long r12 = com.p259uc.crashsdk.JNIBridge.nativeClientCreateConnection(r10, r13, r12, r8)     // Catch:{ all -> 0x052e }
            goto L_0x0326
        L_0x0324:
            r12 = 0
        L_0x0326:
            r15 = 0
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x03af
            java.lang.String r0 = "skip java crash:"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x052c }
            m21227a(r21)     // Catch:{ all -> 0x052c }
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x033f
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d
            if (r0 == 0) goto L_0x033f
            com.p259uc.crashsdk.JNIBridge.nativeClientCloseConnection(r12)
        L_0x033f:
            if (r22 == 0) goto L_0x0357
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0357
            if (r9 != 0) goto L_0x0357
            m21238a(r7, r8)     // Catch:{ all -> 0x034e }
            r3 = 1
            goto L_0x0358
        L_0x034e:
            r0 = move-exception
            r3 = 1
            goto L_0x0353
        L_0x0351:
            r0 = move-exception
            r3 = 0
        L_0x0353:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
            goto L_0x0358
        L_0x0357:
            r3 = 0
        L_0x0358:
            if (r3 != 0) goto L_0x035f
            if (r9 != 0) goto L_0x035f
            m21252b(r8)
        L_0x035f:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x0363 }
            goto L_0x0368
        L_0x0363:
            r0 = move-exception
            r3 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
        L_0x0368:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x039b }
            boolean r3 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x039b }
            if (r3 != 0) goto L_0x0373
            r0 = 1
        L_0x0373:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x039b }
            r3.<init>(r5)     // Catch:{ all -> 0x039b }
            r3.append(r0)     // Catch:{ all -> 0x039b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x039b }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r3)     // Catch:{ all -> 0x039b }
            if (r0 == 0) goto L_0x038b
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x039b }
            if (r0 == 0) goto L_0x038b
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x039b }
        L_0x038b:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x039b }
            if (r0 == 0) goto L_0x039f
            if (r9 != 0) goto L_0x039f
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x039b }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x039b }
            goto L_0x039f
        L_0x039b:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x039f:
            f16398V = r7
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x03ae
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x03ae:
            return
        L_0x03af:
            if (r14 == 0) goto L_0x042e
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x03be
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d
            if (r0 == 0) goto L_0x03be
            com.p259uc.crashsdk.JNIBridge.nativeClientCloseConnection(r12)
        L_0x03be:
            if (r22 == 0) goto L_0x03d6
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x03d0 }
            if (r0 == 0) goto L_0x03d6
            if (r9 != 0) goto L_0x03d6
            m21238a(r7, r8)     // Catch:{ all -> 0x03cd }
            r3 = 1
            goto L_0x03d7
        L_0x03cd:
            r0 = move-exception
            r3 = 1
            goto L_0x03d2
        L_0x03d0:
            r0 = move-exception
            r3 = 0
        L_0x03d2:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
            goto L_0x03d7
        L_0x03d6:
            r3 = 0
        L_0x03d7:
            if (r3 != 0) goto L_0x03de
            if (r9 != 0) goto L_0x03de
            m21252b(r8)
        L_0x03de:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x03e2 }
            goto L_0x03e7
        L_0x03e2:
            r0 = move-exception
            r3 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
        L_0x03e7:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x041a }
            boolean r3 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x041a }
            if (r3 != 0) goto L_0x03f2
            r0 = 1
        L_0x03f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x041a }
            r3.<init>(r5)     // Catch:{ all -> 0x041a }
            r3.append(r0)     // Catch:{ all -> 0x041a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x041a }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r3)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x040a
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x040a
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x041a }
        L_0x040a:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x041e
            if (r9 != 0) goto L_0x041e
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x041a }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x041a }
            goto L_0x041e
        L_0x041a:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x041e:
            f16398V = r7
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x042d
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x042d:
            return
        L_0x042e:
            boolean r0 = r2 instanceof java.lang.OutOfMemoryError     // Catch:{ all -> 0x052c }
            m21215a(r2, r10, r12, r0)     // Catch:{ all -> 0x052c }
            java.lang.String r14 = "generate java report finished"
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r14)     // Catch:{ all -> 0x052c }
            boolean r14 = com.p259uc.crashsdk.C3084b.m21110I()     // Catch:{ all -> 0x052c }
            if (r14 != 0) goto L_0x04ab
            if (r0 == 0) goto L_0x04ab
            boolean r0 = com.p259uc.crashsdk.C3093g.m21393j()     // Catch:{ all -> 0x052c }
            if (r0 == 0) goto L_0x04ab
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x052c }
            r0.<init>(r10)     // Catch:{ all -> 0x052c }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x052c }
            java.lang.String r10 = com.p259uc.crashsdk.C3093g.m21372W()     // Catch:{ all -> 0x052c }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x052c }
            r14.<init>(r10)     // Catch:{ all -> 0x052c }
            boolean r15 = r14.exists()     // Catch:{ all -> 0x052c }
            if (r15 != 0) goto L_0x0461
            r14.mkdirs()     // Catch:{ all -> 0x052c }
        L_0x0461:
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ all -> 0x052c }
            java.lang.String r15 = "%s%s.hprof"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x052c }
            r7[r8] = r10     // Catch:{ all -> 0x052c }
            r10 = 1
            r7[r10] = r0     // Catch:{ all -> 0x052c }
            java.lang.String r0 = java.lang.String.format(r14, r15, r7)     // Catch:{ all -> 0x052c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x052c }
            java.lang.String r10 = "begin dump hprof: "
            r7.<init>(r10)     // Catch:{ all -> 0x052c }
            r7.append(r0)     // Catch:{ all -> 0x052c }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x052c }
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r7)     // Catch:{ all -> 0x052c }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x052c }
            android.os.Debug.dumpHprofData(r0)     // Catch:{ all -> 0x048a }
            goto L_0x048f
        L_0x048a:
            r0 = move-exception
            r7 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r7)     // Catch:{ all -> 0x052c }
        L_0x048f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x052c }
            java.lang.String r7 = "end dump hprof, use "
            r0.<init>(r7)     // Catch:{ all -> 0x052c }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x052c }
            long r14 = r17 - r14
            r0.append(r14)     // Catch:{ all -> 0x052c }
            java.lang.String r7 = " ms"
            r0.append(r7)     // Catch:{ all -> 0x052c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x052c }
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x052c }
        L_0x04ab:
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x04b8
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d
            if (r0 == 0) goto L_0x04b8
            com.p259uc.crashsdk.JNIBridge.nativeClientCloseConnection(r12)
        L_0x04b8:
            if (r22 == 0) goto L_0x04d3
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x04cc }
            if (r0 == 0) goto L_0x04d3
            if (r9 != 0) goto L_0x04d3
            r3 = 1
            m21238a(r3, r8)     // Catch:{ all -> 0x04c8 }
            r0 = 1
            goto L_0x04d4
        L_0x04c8:
            r0 = move-exception
            r3 = r0
            r0 = 1
            goto L_0x04cf
        L_0x04cc:
            r0 = move-exception
            r3 = r0
            r0 = 0
        L_0x04cf:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
            goto L_0x04d4
        L_0x04d3:
            r0 = 0
        L_0x04d4:
            if (r0 != 0) goto L_0x04db
            if (r9 != 0) goto L_0x04db
            m21252b(r8)
        L_0x04db:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x04df }
            goto L_0x04e4
        L_0x04df:
            r0 = move-exception
            r3 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
        L_0x04e4:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x0517 }
            boolean r3 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x0517 }
            if (r3 != 0) goto L_0x04ef
            r0 = 1
        L_0x04ef:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0517 }
            r3.<init>(r5)     // Catch:{ all -> 0x0517 }
            r3.append(r0)     // Catch:{ all -> 0x0517 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0517 }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r3)     // Catch:{ all -> 0x0517 }
            if (r0 == 0) goto L_0x0507
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x0517 }
            if (r0 == 0) goto L_0x0507
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x0517 }
        L_0x0507:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x0517 }
            if (r0 == 0) goto L_0x051b
            if (r9 != 0) goto L_0x051b
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x0517 }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x0517 }
            goto L_0x051b
        L_0x0517:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x051b:
            r1 = 1
            f16398V = r1
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x052b
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x052b:
            return
        L_0x052c:
            r0 = move-exception
            goto L_0x0534
        L_0x052e:
            r0 = move-exception
            goto L_0x0532
        L_0x0530:
            r0 = move-exception
            r11 = 0
        L_0x0532:
            r12 = 0
        L_0x0534:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x05dd }
            java.lang.String r10 = "exception occurs while java log: "
            r7.<init>(r10)     // Catch:{ all -> 0x05dd }
            r7.append(r0)     // Catch:{ all -> 0x05dd }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x05dd }
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r7)     // Catch:{ all -> 0x05dd }
            m21227a(r0)     // Catch:{ all -> 0x05dd }
            if (r11 != 0) goto L_0x055c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05dd }
            r0.<init>(r3)     // Catch:{ all -> 0x05dd }
            r0.append(r2)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05dd }
            com.p259uc.crashsdk.p260a.C3075a.m20981d(r6, r0)     // Catch:{ all -> 0x05dd }
            m21227a(r21)     // Catch:{ all -> 0x05dd }
        L_0x055c:
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0569
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d
            if (r0 == 0) goto L_0x0569
            com.p259uc.crashsdk.JNIBridge.nativeClientCloseConnection(r12)
        L_0x0569:
            if (r22 == 0) goto L_0x0584
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x0584
            if (r9 != 0) goto L_0x0584
            r3 = 1
            m21238a(r3, r8)     // Catch:{ all -> 0x0579 }
            r0 = 1
            goto L_0x0585
        L_0x0579:
            r0 = move-exception
            r3 = r0
            r0 = 1
            goto L_0x0580
        L_0x057d:
            r0 = move-exception
            r3 = r0
            r0 = 0
        L_0x0580:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
            goto L_0x0585
        L_0x0584:
            r0 = 0
        L_0x0585:
            if (r0 != 0) goto L_0x058c
            if (r9 != 0) goto L_0x058c
            m21252b(r8)
        L_0x058c:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x0590 }
            goto L_0x0595
        L_0x0590:
            r0 = move-exception
            r3 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r3)
        L_0x0595:
            boolean r0 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x05c8 }
            boolean r3 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x05c8 }
            if (r3 != 0) goto L_0x05a0
            r0 = 1
        L_0x05a0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c8 }
            r3.<init>(r5)     // Catch:{ all -> 0x05c8 }
            r3.append(r0)     // Catch:{ all -> 0x05c8 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x05c8 }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r3)     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x05b8
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x05b8
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x05c8 }
        L_0x05b8:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x05cc
            if (r9 != 0) goto L_0x05cc
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x05c8 }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x05c8 }
            goto L_0x05cc
        L_0x05c8:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x05cc:
            r1 = 1
            f16398V = r1
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x05dc
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x05dc:
            return
        L_0x05dd:
            r0 = move-exception
            r3 = r0
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x05ec
            boolean r0 = com.p259uc.crashsdk.C3084b.f16345d
            if (r0 == 0) goto L_0x05ec
            com.p259uc.crashsdk.JNIBridge.nativeClientCloseConnection(r12)
        L_0x05ec:
            if (r22 == 0) goto L_0x0605
            boolean r0 = com.p259uc.crashsdk.C3093g.m21401r()     // Catch:{ all -> 0x05ff }
            if (r0 == 0) goto L_0x0605
            if (r9 != 0) goto L_0x0605
            r6 = 1
            m21238a(r6, r8)     // Catch:{ all -> 0x05fc }
            r10 = 1
            goto L_0x0606
        L_0x05fc:
            r0 = move-exception
            r10 = 1
            goto L_0x0601
        L_0x05ff:
            r0 = move-exception
            r10 = 0
        L_0x0601:
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
            goto L_0x0606
        L_0x0605:
            r10 = 0
        L_0x0606:
            if (r10 != 0) goto L_0x060d
            if (r9 != 0) goto L_0x060d
            m21252b(r8)
        L_0x060d:
            com.p259uc.crashsdk.C3092f.m21344c(r8)     // Catch:{ all -> 0x0611 }
            goto L_0x0616
        L_0x0611:
            r0 = move-exception
            r6 = r0
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r6)
        L_0x0616:
            boolean r10 = com.p259uc.crashsdk.C3093g.m21392i()     // Catch:{ all -> 0x0649 }
            boolean r0 = com.p259uc.crashsdk.p260a.C3078d.m21005d()     // Catch:{ all -> 0x0649 }
            if (r0 != 0) goto L_0x0621
            r10 = 1
        L_0x0621:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0649 }
            r0.<init>(r5)     // Catch:{ all -> 0x0649 }
            r0.append(r10)     // Catch:{ all -> 0x0649 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0649 }
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r0)     // Catch:{ all -> 0x0649 }
            if (r10 == 0) goto L_0x0639
            java.lang.Thread$UncaughtExceptionHandler r0 = f16396T     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x0639
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x0649 }
        L_0x0639:
            boolean r0 = com.p259uc.crashsdk.C3084b.m21168y()     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x064d
            if (r9 != 0) goto L_0x064d
            android.content.Context r0 = com.p259uc.crashsdk.p260a.C3081g.m21018a()     // Catch:{ all -> 0x0649 }
            com.p259uc.crashsdk.C3084b.m21141b(r0)     // Catch:{ all -> 0x0649 }
            goto L_0x064d
        L_0x0649:
            r0 = move-exception
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)
        L_0x064d:
            r1 = 1
            f16398V = r1
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x065d
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x065d:
            goto L_0x065f
        L_0x065e:
            throw r3
        L_0x065f:
            goto L_0x065e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3087e.mo18728a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    /* renamed from: a */
    private static void m21227a(Throwable th) {
        try {
            C3075a.m20981d("DEBUG", m21217a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m21229a(Calendar calendar) {
        if (C3093g.m21366Q()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j = timeInMillis2 - timeInMillis;
            long j2 = 3600000;
            if (j <= 3600000) {
                j2 = 1000 + j;
            }
            C3080f.m21014a(0, new C3079e(415, new Object[]{Long.valueOf(timeInMillis2)}), j2);
        }
    }

    /* renamed from: a */
    static StringBuilder m21217a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z = str == null;
            int i2 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i2++;
                sb.append("  at ");
                sb.append(stackTraceElement.toString());
                sb.append("\n");
                if (!z && stackTraceElement.getMethodName().contains(str)) {
                    sb.delete(0, sb.length());
                    z = true;
                    i2 = 0;
                }
            }
            i = i2;
        }
        if (i == 0) {
            sb.append("  (no java stack)\n");
        }
        return sb;
    }

    /* renamed from: a */
    public static boolean m21232a(ParcelFileDescriptor parcelFileDescriptor) {
        String str = "crashsdk";
        if (f16408ae) {
            C3075a.m20981d(str, "Can not call setHostFd and getHostFd in the same process!");
            return false;
        } else if (!C3084b.f16345d) {
            C3075a.m20981d(str, "Crash so is not loaded!");
            return false;
        } else {
            if (f16407ad != null) {
                C3075a.m20980c(str, "Has already set host fd!");
            }
            f16407ad = parcelFileDescriptor;
            int fd = parcelFileDescriptor.getFd();
            int nativeCmd = (int) JNIBridge.nativeCmd(13, (long) fd, null, null);
            f16409af = nativeCmd != -1;
            if (fd == -1 || nativeCmd != -1) {
                return true;
            }
            return false;
        }
    }
}
