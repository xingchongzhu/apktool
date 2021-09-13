package com.p259uc.crashsdk;

import android.content.pm.PackageInfo;
import android.util.SparseArray;
import com.p259uc.crashsdk.export.CrashStatKey;
import com.p259uc.crashsdk.export.LogType;
import com.p259uc.crashsdk.p260a.C3075a;
import com.p259uc.crashsdk.p260a.C3076b;
import com.p259uc.crashsdk.p260a.C3079e;
import com.p259uc.crashsdk.p260a.C3080f;
import com.p259uc.crashsdk.p260a.C3081g;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.uc.crashsdk.a */
public class ProGuard {

    /* renamed from: A */
    private static final HashMap<String, Object[]> f16217A = new HashMap<>();

    /* renamed from: B */
    private static final List<String> f16218B = new ArrayList();

    /* renamed from: C */
    private static int f16219C = 0;

    /* renamed from: D */
    private static int f16220D = 0;

    /* renamed from: E */
    private static int f16221E = 0;

    /* renamed from: F */
    private static Runnable f16222F = new C3079e(CrashStatKey.LOG_UPLOAD_ENCRYPT_COUNT);

    /* renamed from: G */
    private static boolean f16223G = false;

    /* renamed from: H */
    private static boolean f16224H = false;

    /* renamed from: I */
    private static boolean f16225I = false;

    /* renamed from: a */
    public static String f16226a = "";

    /* renamed from: b */
    public static String f16227b = "";

    /* renamed from: c */
    static boolean f16228c = false;

    /* renamed from: d */
    static final /* synthetic */ boolean f16229d = true;

    /* renamed from: e */
    private static final Map<String, String> f16230e = new HashMap();

    /* renamed from: f */
    private static final List<String> f16231f = new ArrayList();

    /* renamed from: g */
    private static String f16232g = "";

    /* renamed from: h */
    private static String f16233h = null;

    /* renamed from: i */
    private static int f16234i = -1;

    /* renamed from: j */
    private static long f16235j = 0;

    /* renamed from: k */
    private static final HashMap<String, Object[]> f16236k = new HashMap<>();

    /* renamed from: l */
    private static final List<String> f16237l = new ArrayList();

    /* renamed from: m */
    private static int f16238m = 0;

    /* renamed from: n */
    private static int f16239n = 0;

    /* renamed from: o */
    private static int f16240o = 0;

    /* renamed from: p */
    private static int f16241p = 0;

    /* renamed from: q */
    private static final HashMap<String, Object[]> f16242q = new HashMap<>();

    /* renamed from: r */
    private static final List<String> f16243r = new ArrayList();

    /* renamed from: s */
    private static int f16244s = 0;

    /* renamed from: t */
    private static int f16245t = 0;

    /* renamed from: u */
    private static int f16246u = 0;

    /* renamed from: v */
    private static int f16247v = 0;

    /* renamed from: w */
    private static int f16248w = 0;

    /* renamed from: x */
    private static int f16249x = 0;

    /* renamed from: y */
    private static final SparseArray<Object[]> f16250y = new SparseArray<>();

    /* renamed from: z */
    private static final List<Integer> f16251z = new ArrayList();

    /* renamed from: a */
    public static String m20943a() {
        String str = f16233h;
        if (str != null) {
            return str;
        }
        return m20973o() ? f16233h : "";
    }

    /* renamed from: b */
    static long m20956b() {
        return f16235j;
    }

    /* renamed from: c */
    static int m20960c() {
        if (f16234i == -1) {
            m20973o();
        }
        return f16234i;
    }

    /* renamed from: d */
    static void m20962d() {
        StringBuilder sb = new StringBuilder();
        synchronized (f16230e) {
            for (String str : f16231f) {
                String str2 = (String) f16230e.get(str);
                sb.append(str);
                sb.append(": ");
                if (str2 != null) {
                    sb.append(str2);
                }
                sb.append("\n");
            }
        }
        sb.append(String.format(Locale.US, "(saved at %s)\n", new Object[]{C3087e.m21292m()}));
        C3076b.m20984a(C3084b.m21148e(), sb.toString());
    }

    /* renamed from: e */
    static void m20963e() {
        if (f16229d || C3084b.f16345d) {
            synchronized (f16230e) {
                for (String str : f16231f) {
                    JNIBridge.nativeAddHeaderInfo(str, (String) f16230e.get(str));
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    public static byte[] m20964f() {
        return new byte[]{24, 99, 121, 60};
    }

    /* renamed from: g */
    static void m20965g() {
        if (f16229d || C3084b.f16345d) {
            synchronized (f16236k) {
                for (String str : f16237l) {
                    Object[] objArr = (Object[]) f16236k.get(str);
                    int intValue = ((Integer) objArr[0]).intValue();
                    if ((1048833 & intValue) != 0) {
                        JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), intValue, ((Boolean) objArr[4]).booleanValue());
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: h */
    static String m20966h() {
        StringBuilder sb = new StringBuilder();
        synchronized (f16236k) {
            boolean z = f16229d;
            for (String str : f16237l) {
                if (LogType.isForJava(((Integer) ((Object[]) f16236k.get(str))[0]).intValue())) {
                    if (!z) {
                        sb.append("`");
                    }
                    sb.append(str);
                    z = false;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    static void m20967i() {
        if (f16229d || C3084b.f16345d) {
            synchronized (f16242q) {
                for (String str : f16243r) {
                    Object[] objArr = (Object[]) f16242q.get(str);
                    int intValue = ((Integer) objArr[0]).intValue();
                    if ((1048833 & intValue) != 0) {
                        JNIBridge.nativeAddCallbackInfo(str, intValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: j */
    static String m20968j() {
        String sb;
        synchronized (f16242q) {
            StringBuilder sb2 = new StringBuilder();
            List<String> list = f16243r;
            synchronized (list) {
                boolean z = f16229d;
                for (String str : list) {
                    if (LogType.isForJava(((Integer) ((Object[]) f16242q.get(str))[0]).intValue())) {
                        if (!z) {
                            sb2.append("`");
                        }
                        sb2.append(str);
                        z = false;
                    }
                }
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: k */
    static void m20969k() {
        if (f16229d || C3084b.f16345d) {
            synchronized (f16217A) {
                for (String str : f16218B) {
                    Object[] objArr = (Object[]) f16217A.get(str);
                    int intValue = ((Integer) objArr[0]).intValue();
                    int intValue2 = ((Integer) objArr[1]).intValue();
                    List list = (List) objArr[2];
                    if ((1048577 & intValue2) != 0 && JNIBridge.nativeCreateCachedInfo(str, intValue, intValue2) != 0) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!JNIBridge.nativeAddCachedInfo(str, (String) it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: l */
    static String m20970l() {
        StringBuilder sb = new StringBuilder();
        synchronized (f16217A) {
            boolean z = f16229d;
            for (String str : f16218B) {
                if (LogType.isForJava(((Integer) ((Object[]) f16217A.get(str))[1]).intValue())) {
                    if (!z) {
                        sb.append("`");
                    }
                    sb.append(str);
                    z = false;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: m */
    static String m20971m() {
        if (!f16223G) {
            String a = C3076b.m20982a(C3084b.m21153j());
            f16232g = a;
            f16223G = f16229d;
            if (a == null) {
                f16232g = "";
            }
        }
        return f16232g;
    }

    /* renamed from: n */
    public static void m20972n() {
        m20974p();
        if (f16224H) {
            if (C3084b.f16345d) {
                JNIBridge.set(128, f16232g);
            }
            return;
        }
        f16224H = f16229d;
        C3080f.m21013a(0, (Runnable) new C3079e(202));
    }

    /* renamed from: o */
    private static boolean m20973o() {
        try {
            PackageInfo packageInfo = C3081g.m21018a().getPackageManager().getPackageInfo(f16226a, 0);
            f16233h = packageInfo.versionName;
            f16235j = packageInfo.lastUpdateTime;
            f16234i = packageInfo.versionCode;
            return f16229d;
        } catch (Throwable th) {
            C3081g.m21036b(th);
            return false;
        }
    }

    /* renamed from: p */
    private static void m20974p() {
        if (!f16225I && C3087e.m21231a()) {
            if (C3084b.f16345d || !C3084b.f16348g) {
                String format = String.format(Locale.US, "%s/%s/%s", new Object[]{C3093g.m21367R(), C3093g.m21368S(), C3093g.m21369T()});
                StringBuilder sb = new StringBuilder("UUID: ");
                sb.append(C3087e.m21298p());
                String str = "crashsdk";
                C3075a.m20979b(str, sb.toString());
                StringBuilder sb2 = new StringBuilder("Version: ");
                sb2.append(format);
                C3075a.m20979b(str, sb2.toString());
                StringBuilder sb3 = new StringBuilder("Process Name: ");
                sb3.append(C3087e.m21281h());
                C3075a.m20979b(str, sb3.toString());
                f16225I = f16229d;
            }
        }
    }

    /* renamed from: b */
    private static StringBuilder m20958b(String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr = (Object[]) f16242q.get(str);
            if (objArr == null) {
                StringBuilder sb2 = new StringBuilder("Unknown callback: ");
                sb2.append(str);
                str2 = sb2.toString();
            } else {
                Callable callable = (Callable) objArr[1];
                if (callable != null) {
                    str2 = (String) callable.call();
                } else {
                    str2 = C3086d.m21173a(str, z);
                }
            }
            if (str2 != null) {
                sb.append(str2);
            }
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        try {
            if (sb.length() == 0) {
                sb.append("(data is null)\n");
            }
        } catch (Throwable th2) {
            C3081g.m21027a(th2);
        }
        return sb;
    }

    /* renamed from: a */
    public static void m20951a(String str, String str2) {
        Map<String, String> map = f16230e;
        synchronized (map) {
            if (!map.containsKey(str)) {
                f16231f.add(str);
            }
            map.put(str, str2);
            if (C3084b.f16345d) {
                JNIBridge.nativeAddHeaderInfo(str, str2);
            }
            C3087e.m21309x();
        }
    }

    /* renamed from: c */
    static ArrayList<String> m20961c(String str) {
        if (C3081g.m21032a(str)) {
            return null;
        }
        String[] split = str.split(";", 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (!C3081g.m21032a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static void m20947a(OutputStream outputStream, String str) {
        synchronized (f16230e) {
            for (String str2 : f16231f) {
                try {
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(str2);
                    sb.append(": ");
                    String str3 = (String) f16230e.get(str2);
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    sb.append("\n");
                    outputStream.write(sb.toString().getBytes(str));
                } catch (Throwable th) {
                    C3087e.m21228a(th, outputStream);
                }
            }
        }
    }

    /* renamed from: b */
    public static int m20955b(String str, String str2) {
        int i;
        int i2 = 0;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        HashMap<String, Object[]> hashMap = f16217A;
        synchronized (hashMap) {
            Object[] objArr = (Object[]) hashMap.get(str);
            if (objArr != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if (list.size() >= intValue) {
                    list.remove(0);
                }
                list.add(str2);
                if (LogType.isForJava(intValue2)) {
                    i2 = LogType.addType(0, 16);
                }
                if (!C3084b.f16345d) {
                    if (LogType.isForNative(intValue2)) {
                        i2 = LogType.addType(i2, 1);
                    }
                    if (LogType.isForANR(intValue2)) {
                        i2 = LogType.addType(i2, LogType.ANR);
                    }
                }
                i = i2;
                i2 = intValue2;
            } else {
                i = 0;
            }
            if (C3084b.f16345d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                if (LogType.isForNative(i2)) {
                    i = LogType.addType(i, 1);
                }
                if (LogType.isForANR(i2)) {
                    i = LogType.addType(i, LogType.ANR);
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m20942a(String str, String str2, boolean z, boolean z2, int i, boolean z3) {
        int i2;
        int i3;
        boolean z4;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            C3075a.m20977a("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        HashMap<String, Object[]> hashMap = f16236k;
        synchronized (hashMap) {
            if (hashMap.containsKey(str)) {
                i3 = ((Integer) ((Object[]) hashMap.get(str))[0]).intValue();
                i2 = LogType.addType(i3, i);
            } else {
                i2 = i;
                i3 = 0;
            }
            if (LogType.isForJava(i2) && !LogType.isForJava(i3)) {
                int i4 = f16238m;
                if (i4 >= 10) {
                    i2 = LogType.removeType(i2, 16);
                } else {
                    f16238m = i4 + 1;
                }
            }
            if (LogType.isForNative(i2) && !LogType.isForNative(i3)) {
                int i5 = f16239n;
                if (i5 >= 10) {
                    i2 = LogType.removeType(i2, 1);
                } else {
                    f16239n = i5 + 1;
                }
            }
            if (LogType.isForUnexp(i2) && !LogType.isForUnexp(i3)) {
                int i6 = f16240o;
                if (i6 >= 10) {
                    i2 = LogType.removeType(i2, LogType.UNEXP);
                } else {
                    f16240o = i6 + 1;
                }
            }
            if (LogType.isForANR(i2) && !LogType.isForANR(i3)) {
                int i7 = f16241p;
                if (i7 >= 10) {
                    i2 = LogType.removeType(i2, LogType.ANR);
                } else {
                    f16241p = i7 + 1;
                }
            }
            if ((1048849 & i2) == 0) {
                z4 = false;
            } else {
                if (i3 == 0) {
                    f16237l.add(str);
                }
                z4 = f16229d;
            }
            if (!z4) {
                return i2;
            }
            if (C3084b.f16345d && (1048833 & i) != 0) {
                int nativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z, z2, i, z3);
                if (!LogType.isForNative(nativeAddDumpFile)) {
                    i2 = LogType.removeType(i2, 1);
                }
                if (!LogType.isForUnexp(nativeAddDumpFile)) {
                    i2 = LogType.removeType(i2, LogType.UNEXP);
                }
                if (!LogType.isForANR(nativeAddDumpFile)) {
                    i2 = LogType.removeType(i2, LogType.ANR);
                }
            }
            hashMap.put(str, new Object[]{Integer.valueOf(i2), str2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)});
            return i2;
        }
    }

    /* renamed from: b */
    static void m20959b(OutputStream outputStream, String str, String str2, ArrayList<String> arrayList) {
        synchronized (f16217A) {
            for (String str3 : f16218B) {
                Object[] objArr = (Object[]) f16217A.get(str3);
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                List<String> list = (List) objArr[2];
                if (arrayList == null) {
                    if (!LogType.isForJava(intValue2)) {
                    }
                } else if (!m20953a((List<String>) arrayList, str3)) {
                    continue;
                }
                try {
                    outputStream.write(String.format(Locale.US, "%s (%d/%d)\n", new Object[]{str3, Integer.valueOf(list.size()), Integer.valueOf(intValue)}).getBytes(str));
                } catch (Throwable th) {
                    C3087e.m21228a(th, outputStream);
                }
                try {
                    for (String bytes : list) {
                        outputStream.write(bytes.getBytes(str));
                        outputStream.write("\n".getBytes(str));
                    }
                } catch (Throwable th2) {
                    C3087e.m21228a(th2, outputStream);
                }
                try {
                    outputStream.write("\n".getBytes(str));
                    outputStream.write(str2.getBytes(str));
                } catch (Throwable th3) {
                    C3087e.m21228a(th3, outputStream);
                }
            }
            if (arrayList != null && C3087e.m21186E()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    if (!m20953a(f16218B, str4)) {
                        C3087e.m21223a(outputStream, "CUSTOMCACHEDINFO", str4);
                    }
                }
            }
        }
        return;
    }

    /* renamed from: a */
    static void m20950a(OutputStream outputStream, String str, ArrayList<String> arrayList) {
        int i;
        OutputStream outputStream2 = outputStream;
        ArrayList<String> arrayList2 = arrayList;
        boolean z = arrayList2 == null ? f16229d : false;
        boolean E = C3087e.m21186E();
        synchronized (f16236k) {
            int i2 = 0;
            for (String str2 : f16237l) {
                try {
                    Object[] objArr = (Object[]) f16236k.get(str2);
                    if (arrayList2 == null) {
                        if (!LogType.isForJava(((Integer) objArr[0]).intValue())) {
                        }
                    } else if (!m20953a((List<String>) arrayList2, str2)) {
                    }
                    if (((Boolean) objArr[3]).booleanValue()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("\n");
                        try {
                            outputStream2.write(sb.toString().getBytes(str));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } else {
                        String str3 = str;
                    }
                    int i3 = i2 > 153600 ? 153600 : i2;
                    try {
                        int min = Math.min(20480, 153600 - i3);
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        String str4 = (String) objArr[1];
                        boolean booleanValue2 = ((Boolean) objArr[4]).booleanValue();
                        if (!E || str4.startsWith("/proc/")) {
                            if (booleanValue) {
                                i = C3087e.m21208a(outputStream2, str4, min);
                            } else {
                                i = C3087e.m21240b(outputStream2, str4, min);
                            }
                            i3 += i;
                        } else {
                            C3087e.m21224a(outputStream, "FILE", str4, min, booleanValue, booleanValue2);
                        }
                        i2 = i3;
                        if (booleanValue2 && z && !E) {
                            File file = new File(str4);
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = i3;
                        C3087e.m21228a(th, outputStream2);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    String str5 = str;
                    C3087e.m21228a(th, outputStream2);
                }
            }
            if (arrayList2 != null && E) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str6 = (String) it.next();
                    if (!m20953a(f16237l, str6)) {
                        C3087e.m21223a(outputStream2, "CUSTOMDUMPFILE", str6);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    static String m20957b(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object[]> hashMap = f16217A;
        synchronized (hashMap) {
            Object[] objArr = (Object[]) hashMap.get(str);
            int intValue = ((Integer) objArr[0]).intValue();
            List<String> list = (List) objArr[2];
            sb.append(String.format(Locale.US, "%s (%d/%d)\n", new Object[]{str, Integer.valueOf(list.size()), Integer.valueOf(intValue)}));
            for (String append : list) {
                sb.append(append);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static String m20944a(String str) {
        HashMap<String, Object[]> hashMap = f16236k;
        synchronized (hashMap) {
            Object[] objArr = (Object[]) hashMap.get(str);
            if (objArr == null) {
                return null;
            }
            int i = 1;
            String str2 = (String) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            Locale locale = Locale.US;
            String str3 = "%s%s%d%d";
            Object[] objArr2 = new Object[4];
            objArr2[0] = str2;
            objArr2[1] = "`";
            objArr2[2] = Integer.valueOf(booleanValue ? 1 : 0);
            if (!booleanValue2) {
                i = 0;
            }
            objArr2[3] = Integer.valueOf(i);
            String format = String.format(locale, str3, objArr2);
            return format;
        }
    }

    /* renamed from: a */
    private static boolean m20953a(List<String> list, String str) {
        if (C3081g.m21032a(str)) {
            return false;
        }
        for (String equals : list) {
            if (str.equals(equals)) {
                return f16229d;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ef  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m20941a(java.lang.String r16, int r17, java.util.concurrent.Callable<java.lang.String> r18, long r19, int r21) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r4 = 0
            if (r0 != 0) goto L_0x000a
            return r4
        L_0x000a:
            java.util.HashMap<java.lang.String, java.lang.Object[]> r5 = f16242q
            monitor-enter(r5)
            boolean r6 = r5.containsKey(r0)     // Catch:{ all -> 0x015a }
            if (r6 == 0) goto L_0x0029
            java.lang.Object r6 = r5.get(r0)     // Catch:{ all -> 0x015a }
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch:{ all -> 0x015a }
            r6 = r6[r4]     // Catch:{ all -> 0x015a }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x015a }
            int r6 = r6.intValue()     // Catch:{ all -> 0x015a }
            int r7 = com.p259uc.crashsdk.export.LogType.addType(r6, r1)     // Catch:{ all -> 0x015a }
            if (r6 != r7) goto L_0x002b
            monitor-exit(r5)     // Catch:{ all -> 0x015a }
            return r6
        L_0x0029:
            r7 = r1
            r6 = 0
        L_0x002b:
            boolean r8 = com.p259uc.crashsdk.export.LogType.isForJava(r7)     // Catch:{ all -> 0x015a }
            r9 = 0
            r11 = 6
            r12 = 1
            if (r8 == 0) goto L_0x0063
            boolean r8 = com.p259uc.crashsdk.export.LogType.isForJava(r6)     // Catch:{ all -> 0x015a }
            if (r8 != 0) goto L_0x0063
            int r8 = f16244s     // Catch:{ all -> 0x015a }
            r13 = 8
            if (r8 < r13) goto L_0x0043
        L_0x0041:
            r8 = 1
            goto L_0x005b
        L_0x0043:
            int r13 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x0050
            int r13 = f16248w     // Catch:{ all -> 0x015a }
            if (r13 < r11) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            int r13 = r13 + r12
            f16248w = r13     // Catch:{ all -> 0x015a }
            goto L_0x0057
        L_0x0050:
            int r13 = f16248w     // Catch:{ all -> 0x015a }
            int r13 = r8 - r13
            if (r13 < r11) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            int r8 = r8 + r12
            f16244s = r8     // Catch:{ all -> 0x015a }
            r8 = 0
        L_0x005b:
            if (r8 == 0) goto L_0x0063
            r8 = 16
            int r7 = com.p259uc.crashsdk.export.LogType.removeType(r7, r8)     // Catch:{ all -> 0x015a }
        L_0x0063:
            boolean r8 = com.p259uc.crashsdk.export.LogType.isForNative(r7)     // Catch:{ all -> 0x015a }
            r13 = 4
            if (r8 == 0) goto L_0x009f
            boolean r8 = com.p259uc.crashsdk.export.LogType.isForNative(r6)     // Catch:{ all -> 0x015a }
            if (r8 != 0) goto L_0x009f
            int r8 = f16245t     // Catch:{ all -> 0x015a }
            if (r8 < r11) goto L_0x0078
        L_0x0074:
            r8 = 1
            r9 = 0
        L_0x0076:
            r10 = 0
            goto L_0x0098
        L_0x0078:
            int r14 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x008b
            int r9 = f16249x     // Catch:{ all -> 0x015a }
            if (r9 < r13) goto L_0x0081
            goto L_0x0074
        L_0x0081:
            int r9 = r9 + r12
            f16249x = r9     // Catch:{ all -> 0x015a }
            int r8 = r8 + r12
            f16245t = r8     // Catch:{ all -> 0x015a }
            r8 = 0
            r9 = 1
            r10 = 1
            goto L_0x0098
        L_0x008b:
            int r9 = f16249x     // Catch:{ all -> 0x015a }
            int r9 = r8 - r9
            if (r9 < r13) goto L_0x0092
            goto L_0x0074
        L_0x0092:
            int r8 = r8 + r12
            f16245t = r8     // Catch:{ all -> 0x015a }
            r8 = 0
            r9 = 1
            goto L_0x0076
        L_0x0098:
            if (r8 == 0) goto L_0x00a1
            int r7 = com.p259uc.crashsdk.export.LogType.removeType(r7, r12)     // Catch:{ all -> 0x015a }
            goto L_0x00a1
        L_0x009f:
            r9 = 0
            r10 = 0
        L_0x00a1:
            boolean r8 = com.p259uc.crashsdk.export.LogType.isForANR(r7)     // Catch:{ all -> 0x015a }
            r14 = 1048576(0x100000, float:1.469368E-39)
            if (r8 == 0) goto L_0x00bd
            boolean r8 = com.p259uc.crashsdk.export.LogType.isForANR(r6)     // Catch:{ all -> 0x015a }
            if (r8 != 0) goto L_0x00bd
            int r8 = f16247v     // Catch:{ all -> 0x015a }
            if (r8 < r11) goto L_0x00b8
            int r7 = com.p259uc.crashsdk.export.LogType.removeType(r7, r14)     // Catch:{ all -> 0x015a }
            goto L_0x00bd
        L_0x00b8:
            int r8 = r8 + r12
            f16247v = r8     // Catch:{ all -> 0x015a }
            r8 = 1
            goto L_0x00be
        L_0x00bd:
            r8 = 0
        L_0x00be:
            boolean r15 = com.p259uc.crashsdk.export.LogType.isForUnexp(r7)     // Catch:{ all -> 0x015a }
            r4 = 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x00da
            boolean r15 = com.p259uc.crashsdk.export.LogType.isForUnexp(r6)     // Catch:{ all -> 0x015a }
            if (r15 != 0) goto L_0x00da
            int r15 = f16246u     // Catch:{ all -> 0x015a }
            if (r15 < r11) goto L_0x00d5
            int r7 = com.p259uc.crashsdk.export.LogType.removeType(r7, r4)     // Catch:{ all -> 0x015a }
            goto L_0x00da
        L_0x00d5:
            int r15 = r15 + r12
            f16246u = r15     // Catch:{ all -> 0x015a }
            r11 = 1
            goto L_0x00db
        L_0x00da:
            r11 = 0
        L_0x00db:
            r15 = 1048849(0x100111, float:1.46975E-39)
            r15 = r15 & r7
            if (r15 != 0) goto L_0x00e3
            r6 = 0
            goto L_0x00eb
        L_0x00e3:
            if (r6 != 0) goto L_0x00ea
            java.util.List<java.lang.String> r6 = f16243r     // Catch:{ all -> 0x015a }
            r6.add(r0)     // Catch:{ all -> 0x015a }
        L_0x00ea:
            r6 = 1
        L_0x00eb:
            if (r6 != 0) goto L_0x00ef
            monitor-exit(r5)     // Catch:{ all -> 0x015a }
            return r7
        L_0x00ef:
            boolean r6 = com.p259uc.crashsdk.C3084b.f16345d     // Catch:{ all -> 0x015a }
            if (r6 == 0) goto L_0x013a
            r6 = 1048833(0x100101, float:1.469728E-39)
            r6 = r6 & r1
            if (r6 == 0) goto L_0x013a
            r6 = r21
            int r1 = com.p259uc.crashsdk.JNIBridge.nativeAddCallbackInfo(r0, r1, r2, r6)     // Catch:{ all -> 0x015a }
            boolean r15 = com.p259uc.crashsdk.export.LogType.isForNative(r1)     // Catch:{ all -> 0x015a }
            if (r15 != 0) goto L_0x0117
            int r7 = com.p259uc.crashsdk.export.LogType.removeType(r7, r12)     // Catch:{ all -> 0x015a }
            if (r9 == 0) goto L_0x0110
            int r9 = f16245t     // Catch:{ all -> 0x015a }
            int r9 = r9 - r12
            f16245t = r9     // Catch:{ all -> 0x015a }
        L_0x0110:
            if (r10 == 0) goto L_0x0117
            int r9 = f16249x     // Catch:{ all -> 0x015a }
            int r9 = r9 - r12
            f16249x = r9     // Catch:{ all -> 0x015a }
        L_0x0117:
            boolean r9 = com.p259uc.crashsdk.export.LogType.isForANR(r1)     // Catch:{ all -> 0x015a }
            if (r9 != 0) goto L_0x0128
            int r7 = com.p259uc.crashsdk.export.LogType.removeType(r7, r14)     // Catch:{ all -> 0x015a }
            if (r8 == 0) goto L_0x0128
            int r8 = f16247v     // Catch:{ all -> 0x015a }
            int r8 = r8 - r12
            f16247v = r8     // Catch:{ all -> 0x015a }
        L_0x0128:
            boolean r1 = com.p259uc.crashsdk.export.LogType.isForUnexp(r1)     // Catch:{ all -> 0x015a }
            if (r1 != 0) goto L_0x013c
            int r7 = com.p259uc.crashsdk.export.LogType.removeType(r7, r4)     // Catch:{ all -> 0x015a }
            if (r11 == 0) goto L_0x013c
            int r1 = f16246u     // Catch:{ all -> 0x015a }
            int r1 = r1 - r12
            f16246u = r1     // Catch:{ all -> 0x015a }
            goto L_0x013c
        L_0x013a:
            r6 = r21
        L_0x013c:
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x015a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x015a }
            r8 = 0
            r1[r8] = r4     // Catch:{ all -> 0x015a }
            r1[r12] = r18     // Catch:{ all -> 0x015a }
            r4 = 2
            java.lang.Long r2 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x015a }
            r1[r4] = r2     // Catch:{ all -> 0x015a }
            r2 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x015a }
            r1[r2] = r3     // Catch:{ all -> 0x015a }
            r5.put(r0, r1)     // Catch:{ all -> 0x015a }
            monitor-exit(r5)     // Catch:{ all -> 0x015a }
            return r7
        L_0x015a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x015a }
            goto L_0x015e
        L_0x015d:
            throw r0
        L_0x015e:
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.ProGuard.m20941a(java.lang.String, int, java.util.concurrent.Callable, long, int):int");
    }

    /* renamed from: a */
    static void m20949a(OutputStream outputStream, String str, String str2, ArrayList<String> arrayList) {
        String str3;
        synchronized (f16242q) {
            for (String str4 : f16243r) {
                try {
                    Object[] objArr = (Object[]) f16242q.get(str4);
                    int intValue = ((Integer) objArr[0]).intValue();
                    if (arrayList == null) {
                        if (!LogType.isForJava(intValue)) {
                        }
                    } else if (!m20953a((List<String>) arrayList, str4)) {
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("\n");
                    outputStream.write(sb.toString().getBytes(str));
                    long longValue = ((Long) objArr[2]).longValue();
                    if (longValue != 0) {
                        str3 = JNIBridge.nativeGetCallbackInfo(str4, longValue, ((Integer) objArr[3]).intValue(), false);
                    } else {
                        str3 = m20958b(str4, false).toString();
                    }
                    if (str3 == null || str3.length() <= 0) {
                        outputStream.write("(data is null)\n".getBytes(str));
                    } else {
                        outputStream.write(str3.getBytes(str));
                    }
                } catch (Throwable th) {
                    C3087e.m21228a(th, outputStream);
                }
                try {
                    outputStream.write("\n".getBytes(str));
                    outputStream.write(str2.getBytes(str));
                } catch (Throwable th2) {
                    C3087e.m21228a(th2, outputStream);
                }
            }
            if (arrayList != null && C3087e.m21186E()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str5 = (String) it.next();
                    if (!m20953a(f16243r, str5)) {
                        C3087e.m21223a(outputStream, "CUSTOMCALLBACKINFO", str5);
                    }
                }
            }
        }
        return;
    }

    /* renamed from: a */
    static String m20945a(String str, boolean z) {
        String str2;
        HashMap<String, Object[]> hashMap = f16242q;
        synchronized (hashMap) {
            Object[] objArr = (Object[]) hashMap.get(str);
            long longValue = ((Long) objArr[2]).longValue();
            if (longValue != 0) {
                str2 = JNIBridge.nativeGetCallbackInfo(str, longValue, ((Integer) objArr[3]).intValue(), z);
            } else {
                str2 = m20958b(str, z).toString();
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static boolean m20952a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        SparseArray<Object[]> sparseArray = f16250y;
        synchronized (sparseArray) {
            int id = (int) thread.getId();
            if (((Object[]) sparseArray.get(id)) == null) {
                f16251z.add(Integer.valueOf(id));
            }
            sparseArray.put(id, new Object[]{new WeakReference(thread), str});
        }
        return f16229d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca A[Catch:{ all -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8 A[Catch:{ all -> 0x0100 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m20948a(java.io.OutputStream r13, java.lang.String r14, java.lang.String r15) {
        /*
            android.util.SparseArray<java.lang.Object[]> r0 = f16250y
            monitor-enter(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x011e }
            java.util.List<java.lang.Integer> r2 = f16251z     // Catch:{ all -> 0x011e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x011e }
        L_0x000d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x011e }
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x011e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x011e }
            int r3 = r3.intValue()     // Catch:{ all -> 0x011e }
            r4 = 0
            r5 = 1
            r6 = 0
            android.util.SparseArray<java.lang.Object[]> r7 = f16250y     // Catch:{ all -> 0x0064 }
            java.lang.Object r7 = r7.get(r3)     // Catch:{ all -> 0x0064 }
            java.lang.Object[] r7 = (java.lang.Object[]) r7     // Catch:{ all -> 0x0064 }
            if (r7 != 0) goto L_0x002b
            goto L_0x000d
        L_0x002b:
            r8 = r7[r6]     // Catch:{ all -> 0x0064 }
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8     // Catch:{ all -> 0x0064 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0064 }
            java.lang.Thread r8 = (java.lang.Thread) r8     // Catch:{ all -> 0x0064 }
            r7 = r7[r5]     // Catch:{ all -> 0x005f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x005f }
            if (r8 != 0) goto L_0x005c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            java.lang.String r9 = "Thread ("
            r4.<init>(r9)     // Catch:{ all -> 0x005a }
            r4.append(r7)     // Catch:{ all -> 0x005a }
            java.lang.String r9 = ", "
            r4.append(r9)     // Catch:{ all -> 0x005a }
            r4.append(r3)     // Catch:{ all -> 0x005a }
            java.lang.String r9 = ") has exited!"
            r4.append(r9)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x005a }
            com.p259uc.crashsdk.p260a.C3075a.m20978b(r4)     // Catch:{ all -> 0x005a }
            goto L_0x000d
        L_0x005a:
            r4 = move-exception
            goto L_0x0068
        L_0x005c:
            if (r1 == r8) goto L_0x000d
            goto L_0x006b
        L_0x005f:
            r7 = move-exception
            r12 = r7
            r7 = r4
            r4 = r12
            goto L_0x0068
        L_0x0064:
            r7 = move-exception
            r8 = r4
            r4 = r7
            r7 = r8
        L_0x0068:
            com.p259uc.crashsdk.C3087e.m21228a(r4, r13)     // Catch:{ all -> 0x011e }
        L_0x006b:
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x00bf }
            java.lang.String r9 = "Thread Name: '%s'\n"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x00bf }
            r10[r6] = r7     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = java.lang.String.format(r4, r9, r10)     // Catch:{ all -> 0x00bf }
            byte[] r7 = r7.getBytes(r14)     // Catch:{ all -> 0x00bf }
            r13.write(r7)     // Catch:{ all -> 0x00bf }
            boolean r7 = r8.isDaemon()     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0087
            java.lang.String r7 = " daemon"
            goto L_0x0089
        L_0x0087:
            java.lang.String r7 = ""
        L_0x0089:
            java.lang.String r9 = "\"%s\"%s prio=%d tid=%d %s\n"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x00bf }
            java.lang.String r11 = r8.getName()     // Catch:{ all -> 0x00bf }
            r10[r6] = r11     // Catch:{ all -> 0x00bf }
            r10[r5] = r7     // Catch:{ all -> 0x00bf }
            r7 = 2
            int r11 = r8.getPriority()     // Catch:{ all -> 0x00bf }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00bf }
            r10[r7] = r11     // Catch:{ all -> 0x00bf }
            r7 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00bf }
            r10[r7] = r3     // Catch:{ all -> 0x00bf }
            r3 = 4
            java.lang.Thread$State r7 = r8.getState()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00bf }
            r10[r3] = r7     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = java.lang.String.format(r4, r9, r10)     // Catch:{ all -> 0x00bf }
            byte[] r3 = r3.getBytes(r14)     // Catch:{ all -> 0x00bf }
            r13.write(r3)     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00bf:
            r3 = move-exception
            com.p259uc.crashsdk.C3087e.m21228a(r3, r13)     // Catch:{ all -> 0x011e }
        L_0x00c3:
            java.lang.StackTraceElement[] r3 = r8.getStackTrace()     // Catch:{ all -> 0x0100 }
            int r4 = r3.length     // Catch:{ all -> 0x0100 }
            if (r4 != 0) goto L_0x00d3
            java.lang.String r4 = "  (no stack frames)"
            byte[] r4 = r4.getBytes(r14)     // Catch:{ all -> 0x0100 }
            r13.write(r4)     // Catch:{ all -> 0x0100 }
        L_0x00d3:
            int r4 = r3.length     // Catch:{ all -> 0x0100 }
            r7 = 0
            r8 = 1
        L_0x00d6:
            if (r7 >= r4) goto L_0x0104
            r9 = r3[r7]     // Catch:{ all -> 0x0100 }
            if (r8 != 0) goto L_0x00e5
            java.lang.String r8 = "\n"
            byte[] r8 = r8.getBytes(r14)     // Catch:{ all -> 0x0100 }
            r13.write(r8)     // Catch:{ all -> 0x0100 }
        L_0x00e5:
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x0100 }
            java.lang.String r10 = "  at %s"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0100 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0100 }
            r11[r6] = r9     // Catch:{ all -> 0x0100 }
            java.lang.String r8 = java.lang.String.format(r8, r10, r11)     // Catch:{ all -> 0x0100 }
            byte[] r8 = r8.getBytes(r14)     // Catch:{ all -> 0x0100 }
            r13.write(r8)     // Catch:{ all -> 0x0100 }
            int r7 = r7 + 1
            r8 = 0
            goto L_0x00d6
        L_0x0100:
            r3 = move-exception
            com.p259uc.crashsdk.C3087e.m21228a(r3, r13)     // Catch:{ all -> 0x011e }
        L_0x0104:
            java.lang.String r3 = "\n"
            byte[] r3 = r3.getBytes(r14)     // Catch:{ all -> 0x0116 }
            r13.write(r3)     // Catch:{ all -> 0x0116 }
            byte[] r3 = r15.getBytes(r14)     // Catch:{ all -> 0x0116 }
            r13.write(r3)     // Catch:{ all -> 0x0116 }
            goto L_0x000d
        L_0x0116:
            r3 = move-exception
            com.p259uc.crashsdk.C3087e.m21228a(r3, r13)     // Catch:{ all -> 0x011e }
            goto L_0x000d
        L_0x011c:
            monitor-exit(r0)     // Catch:{ all -> 0x011e }
            return
        L_0x011e:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011e }
            goto L_0x0122
        L_0x0121:
            throw r13
        L_0x0122:
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.ProGuard.m20948a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static int m20940a(String str, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        if (str == null || i <= 0) {
            return 0;
        }
        if (i > 1500) {
            C3075a.m20977a("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        HashMap<String, Object[]> hashMap = f16217A;
        synchronized (hashMap) {
            if (hashMap.containsKey(str)) {
                i4 = ((Integer) ((Object[]) hashMap.get(str))[1]).intValue();
                i3 = LogType.addType(i4, i2);
            } else {
                i3 = i2;
                i4 = 0;
            }
            if (LogType.isForJava(i3) && !LogType.isForJava(i4)) {
                int i5 = f16219C;
                if (i5 >= 8) {
                    i3 = LogType.removeType(i3, 16);
                } else {
                    f16219C = i5 + 1;
                }
            }
            if (LogType.isForNative(i3) && !LogType.isForNative(i4)) {
                int i6 = f16220D;
                if (i6 >= 8) {
                    i3 = LogType.removeType(i3, 1);
                } else {
                    f16220D = i6 + 1;
                }
            }
            if (LogType.isForANR(i3) && !LogType.isForANR(i4)) {
                int i7 = f16221E;
                if (i7 >= 8) {
                    i3 = LogType.removeType(i3, LogType.ANR);
                } else {
                    f16221E = i7 + 1;
                }
            }
            if ((1048849 & i3) == 0) {
                z = false;
            } else {
                if (i4 == 0) {
                    f16218B.add(str);
                }
                z = f16229d;
            }
            if (!z) {
                return i3;
            }
            if (C3084b.f16345d && (i2 & 1048577) != 0) {
                int nativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i, i3);
                if (!LogType.isForNative(nativeCreateCachedInfo)) {
                    i3 = LogType.removeType(i3, 1);
                }
                if (!LogType.isForANR(nativeCreateCachedInfo)) {
                    i3 = LogType.removeType(i3, LogType.ANR);
                }
            }
            hashMap.put(str, new Object[]{Integer.valueOf(i), Integer.valueOf(i3), new ArrayList()});
            return i3;
        }
    }

    /* renamed from: a */
    public static int m20939a(int i, String str) {
        if (C3081g.m21032a(str)) {
            str = Thread.currentThread().getName();
        }
        boolean z = false;
        if (LogType.isForNative(i) || LogType.isForANR(i)) {
            if (C3084b.f16345d) {
                synchronized (f16250y) {
                    JNIBridge.nativeCmd(4, (long) i, str, null);
                }
                z = LogType.isForNative(i);
                if (LogType.isForANR(i)) {
                    z |= true;
                }
            } else {
                C3075a.m20977a("crashsdk", "crashsdk so has not loaded!", null);
            }
        }
        if (!LogType.isForJava(i)) {
            return z ? 1 : 0;
        }
        m20952a(str, Thread.currentThread());
        return z | true ? 1 : 0;
    }

    /* renamed from: a */
    public static boolean m20954a(boolean z) {
        int i;
        String str = "crashsdk";
        if (!C3084b.f16344c) {
            C3075a.m20976a(str, "Unexp log not enabled, skip update unexp info!");
            return false;
        } else if (C3087e.m21186E() || C3084b.m21110I()) {
            return false;
        } else {
            if (z) {
                C3080f.m21012a(f16222F);
                i = 0;
            } else if (!C3084b.m21168y()) {
                C3075a.m20976a(str, "Stop update unexp info in background!");
                return false;
            } else if (C3093g.m21354E() <= 0) {
                return false;
            } else {
                if (C3080f.m21016b(f16222F)) {
                    return f16229d;
                }
                i = C3093g.m21354E() * 1000;
            }
            C3080f.m21014a(0, f16222F, (long) i);
            return f16229d;
        }
    }

    /* renamed from: a */
    public static void m20946a(int i) {
        String str = "crashsdk";
        if (i == 201) {
            C3075a.m20976a(str, "Begin update info ...");
            long currentTimeMillis = System.currentTimeMillis();
            if (C3084b.f16345d && f16228c) {
                JNIBridge.nativeCmd(11, (long) C3093g.m21354E(), String.valueOf(C3093g.m21355F()), null);
            }
            StringBuilder sb = new StringBuilder("Update info took ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            C3075a.m20976a(str, sb.toString());
            m20954a(false);
        } else if (i == 202) {
            m20974p();
            Locale locale = Locale.US;
            String format = String.format(locale, "%s/%s/%s", new Object[]{C3093g.m21367R(), C3093g.m21368S(), C3093g.m21369T()});
            f16232g = m20971m();
            if (C3084b.f16345d) {
                JNIBridge.set(128, f16232g);
            }
            boolean equals = format.equals(f16232g) ^ f16229d;
            if (equals) {
                C3076b.m20984a(C3084b.m21153j(), format);
            }
            if (equals && C3093g.m21404u()) {
                C3075a.m20976a(str, String.format(locale, "Is new version ('%s' -> '%s'), deleting old stats data!", new Object[]{f16232g, format}));
                C3084b.m21162s();
            }
        } else if (!f16229d) {
            throw new AssertionError();
        }
    }
}
