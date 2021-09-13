package com.p259uc.crashsdk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.p259uc.crashsdk.export.CrashStatKey;
import com.p259uc.crashsdk.p260a.C3075a;
import com.p259uc.crashsdk.p260a.C3079e;
import com.p259uc.crashsdk.p260a.C3080f;
import com.p259uc.crashsdk.p260a.C3081g;
import com.p259uc.crashsdk.p260a.C3082h;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.uc.crashsdk.f */
/* compiled from: ProGuard */
public class C3092f {

    /* renamed from: a */
    static final /* synthetic */ boolean f16451a = true;

    /* renamed from: b */
    private static final Map<String, SparseIntArray> f16452b = new HashMap();

    /* renamed from: c */
    private static final Object f16453c = new Object();

    /* renamed from: d */
    private static final SparseArray<String> f16454d = new SparseArray<>();

    /* renamed from: e */
    private static final Object f16455e = new Object();

    /* renamed from: f */
    private static boolean f16456f = false;

    /* renamed from: a */
    static void m21329a(int i) {
        m21330a(i, 1);
    }

    /* renamed from: b */
    private static boolean m21340b(int i, int i2) {
        try {
            C3084b.m21164u();
        } catch (Throwable th) {
            C3081g.m21027a(th);
        }
        try {
            String c = m21342c(i);
            if (c == null) {
                StringBuilder sb = new StringBuilder("Stat type not exists: ");
                sb.append(i);
                C3075a.m20977a("crashsdk", sb.toString(), null);
                return false;
            }
            File file = new File(C3084b.m21143c());
            if (!file.exists()) {
                file.createNewFile();
            }
            StringBuffer a = m21328a(file);
            if (C3081g.m21033a(a)) {
                if (a == null) {
                    a = new StringBuffer();
                }
                a.append("[");
                a.append(C3087e.m21281h());
                a.append("]\n");
            }
            m21331a(a, c, m21326a(a, c) + i2);
            return m21333a(file, a);
        } catch (Throwable th2) {
            C3081g.m21027a(th2);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m21345c(String str) {
        SparseIntArray sparseIntArray = (SparseIntArray) f16452b.get(str);
        if (sparseIntArray == null) {
            return false;
        }
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            C3086d.m21175a(str, keyAt, sparseIntArray.get(keyAt));
        }
        return f16451a;
    }

    /* renamed from: d */
    private static char[] m21347d() {
        char[] cArr = null;
        int i = 1024;
        while (cArr == null && i > 0) {
            try {
                cArr = new char[i];
            } catch (Throwable unused) {
                i /= 2;
                if (i < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    /* renamed from: e */
    private static void m21348e() {
        SparseArray<String> sparseArray = f16454d;
        synchronized (sparseArray) {
            if (sparseArray.size() == 0) {
                sparseArray.put(100, "start_pv");
                sparseArray.put(102, "start_hpv");
                sparseArray.put(1, "all_all");
                sparseArray.put(2, "all_fg");
                sparseArray.put(101, "all_bg");
                sparseArray.put(3, "java_fg");
                sparseArray.put(4, "java_bg");
                sparseArray.put(7, "native_fg");
                sparseArray.put(8, "native_bg");
                sparseArray.put(27, "native_anr_fg");
                sparseArray.put(28, "native_anr_bg");
                sparseArray.put(9, "native_ok");
                sparseArray.put(10, "unexp_anr");
                sparseArray.put(29, "unexp_lowmem");
                sparseArray.put(30, "unexp_killed");
                sparseArray.put(31, "unexp_exit");
                sparseArray.put(32, "unexp_restart");
                sparseArray.put(11, "unexp_fg");
                sparseArray.put(12, "unexp_bg");
                sparseArray.put(40, "anr_fg");
                sparseArray.put(41, "anr_bg");
                sparseArray.put(42, "anr_cr_fg");
                sparseArray.put(43, "anr_cr_bg");
                sparseArray.put(13, "log_up_succ");
                sparseArray.put(14, "log_up_fail");
                sparseArray.put(15, "log_empty");
                sparseArray.put(CrashStatKey.LOG_LEGACY_TMP_FILE, "log_tmp");
                sparseArray.put(16, "log_abd_all");
                sparseArray.put(22, "log_abd_builtin");
                sparseArray.put(23, "log_abd_custom");
                sparseArray.put(17, "log_large");
                sparseArray.put(18, "log_up_all");
                sparseArray.put(19, "log_up_bytes");
                sparseArray.put(20, "log_up_crash");
                sparseArray.put(21, "log_up_custom");
                sparseArray.put(24, "log_zipped");
                sparseArray.put(CrashStatKey.LOG_UPLOAD_ENCRYPT_COUNT, "log_enced");
                sparseArray.put(25, "log_renamed");
                sparseArray.put(26, "log_safe_skip");
            }
        }
    }

    /* renamed from: f */
    private static File[] m21349f() {
        File[] listFiles = new File(C3093g.m21370U()).listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            if (file.getPath().endsWith(".st")) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    /* renamed from: a */
    static void m21330a(int i, int i2) {
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder("Add stat for type ");
            sb.append(i);
            sb.append(" with count 0!");
            C3075a.m20978b(sb.toString());
            return;
        }
        m21335a(C3084b.m21143c(), new C3079e(751, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m21346d(boolean r3) {
        /*
            boolean r0 = f16456f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = f16455e
            monitor-enter(r0)
            boolean r1 = f16456f     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x000e:
            java.lang.String r1 = "crash detail"
            boolean r3 = com.p259uc.crashsdk.p260a.C3082h.m21070a(r3, r1)     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0018:
            r3 = 0
            boolean r1 = com.p259uc.crashsdk.C3084b.m21159p()     // Catch:{ all -> 0x0056 }
            r2 = 1
            if (r1 == 0) goto L_0x0031
            r3 = 2
            m21330a(r3, r2)     // Catch:{ all -> 0x0056 }
            boolean r3 = com.p259uc.crashsdk.C3084b.m21158o()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x002f
            r3 = 42
            m21330a(r3, r2)     // Catch:{ all -> 0x0056 }
        L_0x002f:
            r3 = 1
            goto L_0x0048
        L_0x0031:
            boolean r1 = com.p259uc.crashsdk.C3084b.m21160q()     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0048
            r3 = 101(0x65, float:1.42E-43)
            m21330a(r3, r2)     // Catch:{ all -> 0x0056 }
            boolean r3 = com.p259uc.crashsdk.C3084b.m21158o()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x002f
            r3 = 43
            m21330a(r3, r2)     // Catch:{ all -> 0x0056 }
            goto L_0x002f
        L_0x0048:
            if (r3 == 0) goto L_0x004d
            m21330a(r2, r2)     // Catch:{ all -> 0x0056 }
        L_0x004d:
            r3 = 100
            m21330a(r3, r2)     // Catch:{ all -> 0x0056 }
            f16456f = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0056:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x005a
        L_0x0059:
            throw r3
        L_0x005a:
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3092f.m21346d(boolean):void");
    }

    /* renamed from: c */
    private static String m21342c(int i) {
        String str;
        m21348e();
        SparseArray<String> sparseArray = f16454d;
        synchronized (sparseArray) {
            str = (String) sparseArray.get(i);
        }
        return str;
    }

    /* renamed from: a */
    private static StringBuffer m21328a(File file) {
        FileReader fileReader = null;
        if (!file.exists()) {
            return null;
        }
        char[] d = m21347d();
        if (d == null) {
            C3075a.m20977a("crashsdk", "readCrashStatData alloc buffer failed!", null);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                int read = fileReader2.read(d);
                if (read > 0) {
                    stringBuffer.append(d, 0, read);
                }
                C3081g.m21025a((Closeable) fileReader2);
            } catch (Exception e) {
                e = e;
                fileReader = fileReader2;
                try {
                    C3081g.m21027a((Throwable) e);
                    C3081g.m21025a((Closeable) fileReader);
                    return stringBuffer;
                } catch (Throwable th) {
                    th = th;
                    C3081g.m21025a((Closeable) fileReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileReader = fileReader2;
                C3081g.m21025a((Closeable) fileReader);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C3081g.m21027a((Throwable) e);
            C3081g.m21025a((Closeable) fileReader);
            return stringBuffer;
        }
        return stringBuffer;
    }

    /* renamed from: c */
    static void m21344c(boolean z) {
        if (C3093g.m21364O() && !C3084b.m21110I()) {
            C3087e.m21287j();
            if (!C3082h.m21083e()) {
                C3082h.m21067a(z);
            }
            if (C3084b.m21104C()) {
                m21346d(z);
                m21336a(C3084b.m21143c(), z);
                C3082h.m21075b(z);
            }
        }
    }

    /* renamed from: a */
    private static int m21326a(StringBuffer stringBuffer, String str) {
        int indexOf = stringBuffer.indexOf(str);
        int i = 0;
        if (indexOf < 0) {
            return 0;
        }
        int indexOf2 = stringBuffer.indexOf("=", indexOf + str.length());
        if (indexOf2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" line not contain '='!");
            C3075a.m20978b(sb.toString());
            return 0;
        }
        int i2 = indexOf2 + 1;
        int indexOf3 = stringBuffer.indexOf("\n", i2);
        if (indexOf3 < 0) {
            indexOf3 = stringBuffer.length();
        }
        try {
            int parseInt = Integer.parseInt(stringBuffer.substring(i2, indexOf3));
            if (parseInt >= 0) {
                i = parseInt;
            }
        } catch (NumberFormatException e) {
            C3081g.m21027a((Throwable) e);
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r6 == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        m21333a(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        return f16451a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21341b(java.lang.String r13) {
        /*
            m21348e()
            android.util.SparseArray<java.lang.String> r0 = f16454d
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0093 }
            r1.<init>(r13)     // Catch:{ all -> 0x0093 }
            java.lang.StringBuffer r13 = m21328a(r1)     // Catch:{ all -> 0x0093 }
            boolean r2 = com.p259uc.crashsdk.p260a.C3081g.m21033a(r13)     // Catch:{ all -> 0x0093 }
            r3 = 0
            if (r2 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r3
        L_0x0018:
            java.lang.String r2 = "["
            int r2 = r13.indexOf(r2)     // Catch:{ all -> 0x0093 }
            r4 = 0
            if (r2 >= 0) goto L_0x002a
            java.lang.String r13 = "Can not found process name start!"
            java.lang.String r1 = "crashsdk"
            com.p259uc.crashsdk.p260a.C3075a.m20977a(r1, r13, r4)     // Catch:{ all -> 0x0093 }
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r3
        L_0x002a:
            r5 = 1
            int r2 = r2 + r5
            java.lang.String r6 = "]"
            int r6 = r13.indexOf(r6, r2)     // Catch:{ all -> 0x0093 }
            if (r6 >= 0) goto L_0x003d
            java.lang.String r13 = "Can not found process name end!"
            java.lang.String r1 = "crashsdk"
            com.p259uc.crashsdk.p260a.C3075a.m20977a(r1, r13, r4)     // Catch:{ all -> 0x0093 }
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r3
        L_0x003d:
            java.lang.String r2 = r13.substring(r2, r6)     // Catch:{ all -> 0x0093 }
            r4 = 0
            r6 = 0
        L_0x0043:
            android.util.SparseArray<java.lang.String> r7 = f16454d     // Catch:{ all -> 0x008c }
            int r8 = r7.size()     // Catch:{ all -> 0x008c }
            if (r4 >= r8) goto L_0x0085
            int r8 = r7.keyAt(r4)     // Catch:{ all -> 0x008c }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x008c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x008c }
            int r9 = m21326a(r13, r7)     // Catch:{ all -> 0x008c }
            if (r9 <= 0) goto L_0x0082
            com.p259uc.crashsdk.p260a.C3082h.m21063a(r2, r8, r9)     // Catch:{ all -> 0x008c }
            java.util.Map<java.lang.String, android.util.SparseIntArray> r10 = f16452b     // Catch:{ all -> 0x008c }
            monitor-enter(r10)     // Catch:{ all -> 0x008c }
            java.lang.Object r11 = r10.get(r2)     // Catch:{ all -> 0x007f }
            android.util.SparseIntArray r11 = (android.util.SparseIntArray) r11     // Catch:{ all -> 0x007f }
            if (r11 != 0) goto L_0x0071
            android.util.SparseIntArray r11 = new android.util.SparseIntArray     // Catch:{ all -> 0x007f }
            r11.<init>()     // Catch:{ all -> 0x007f }
            r10.put(r2, r11)     // Catch:{ all -> 0x007f }
        L_0x0071:
            int r12 = r11.get(r8, r3)     // Catch:{ all -> 0x007f }
            int r12 = r12 + r9
            r11.put(r8, r12)     // Catch:{ all -> 0x007f }
            monitor-exit(r10)     // Catch:{ all -> 0x007f }
            m21331a(r13, r7, r3)     // Catch:{ all -> 0x008c }
            r6 = 1
            goto L_0x0082
        L_0x007f:
            r2 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007f }
            throw r2     // Catch:{ all -> 0x008c }
        L_0x0082:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0085:
            if (r6 == 0) goto L_0x008a
            m21333a(r1, r13)     // Catch:{ all -> 0x0093 }
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r5
        L_0x008c:
            r2 = move-exception
            if (r6 == 0) goto L_0x0092
            m21333a(r1, r13)     // Catch:{ all -> 0x0093 }
        L_0x0092:
            throw r2     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0096:
            throw r13
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3092f.m21341b(java.lang.String):boolean");
    }

    /* renamed from: c */
    static void m21343c() {
        C3080f.m21014a(1, new C3079e(700), 3000);
    }

    /* renamed from: a */
    private static void m21331a(StringBuffer stringBuffer, String str, int i) {
        int indexOf = stringBuffer.indexOf(str);
        String str2 = "=";
        String str3 = "\n";
        if (indexOf >= 0) {
            int indexOf2 = stringBuffer.indexOf(str3, indexOf);
            if (indexOf2 < 0) {
                indexOf2 = stringBuffer.length();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(String.valueOf(i));
            stringBuffer.replace(indexOf, indexOf2, sb.toString());
        } else if (i > 0) {
            stringBuffer.append(str);
            stringBuffer.append(str2);
            stringBuffer.append(i);
            stringBuffer.append(str3);
        }
    }

    /* renamed from: a */
    private static boolean m21333a(File file, StringBuffer stringBuffer) {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                String stringBuffer2 = stringBuffer.toString();
                fileWriter2.write(stringBuffer2, 0, stringBuffer2.length());
                C3081g.m21025a((Closeable) fileWriter2);
                return f16451a;
            } catch (Exception e) {
                e = e;
                fileWriter = fileWriter2;
                try {
                    C3081g.m21027a((Throwable) e);
                    C3081g.m21025a((Closeable) fileWriter);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    C3081g.m21025a((Closeable) fileWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter2;
                C3081g.m21025a((Closeable) fileWriter);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C3081g.m21027a((Throwable) e);
            C3081g.m21025a((Closeable) fileWriter);
            return false;
        }
    }

    /* renamed from: a */
    static int m21327a(boolean z) {
        int i;
        Map<String, SparseIntArray> map = f16452b;
        synchronized (map) {
            if (z) {
                try {
                    String h = C3087e.m21281h();
                    i = m21345c(h);
                    map.remove(h);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                i = 0;
                for (String c : map.keySet()) {
                    if (m21345c(c)) {
                        i++;
                    }
                }
                f16452b.clear();
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m21335a(String str, C3079e eVar) {
        return C3084b.m21135a(f16453c, str, eVar);
    }

    /* renamed from: a */
    static boolean m21336a(String str, boolean z) {
        if (C3082h.m21070a(z, "crash detail report")) {
            return false;
        }
        return m21335a(str, new C3079e(752, new Object[]{str}));
    }

    /* renamed from: a */
    static int m21325a() {
        File[] f = m21349f();
        if (f == null) {
            return 0;
        }
        int i = 0;
        for (File absolutePath : f) {
            if (m21336a(absolutePath.getAbsolutePath(), false)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m21338b(boolean z) {
        int i;
        Map<String, SparseIntArray> map = f16452b;
        synchronized (map) {
            if (z) {
                try {
                    String h = C3087e.m21281h();
                    if (map.containsKey(h)) {
                        map.remove(h);
                        i = 1;
                    } else {
                        i = 0;
                    }
                } finally {
                }
            } else {
                i = map.size();
                map.clear();
            }
        }
        return i;
    }

    /* renamed from: a */
    static boolean m21334a(String str) {
        return m21335a(str, new C3079e(753, new Object[]{str}));
    }

    /* renamed from: a */
    public static boolean m21332a(int i, Object[] objArr) {
        switch (i) {
            case 751:
                if (f16451a || objArr != null) {
                    return m21340b(objArr[0].intValue(), objArr[1].intValue());
                }
                throw new AssertionError();
            case 752:
                if (f16451a || objArr != null) {
                    return m21341b(objArr[0]);
                }
                throw new AssertionError();
            case 753:
                if (f16451a || objArr != null) {
                    File file = new File(objArr[0]);
                    if (!file.exists()) {
                        return false;
                    }
                    file.delete();
                    return f16451a;
                }
                throw new AssertionError();
            default:
                return false;
        }
    }

    /* renamed from: b */
    static int m21337b() {
        File[] f = m21349f();
        if (f == null) {
            return 0;
        }
        int i = 0;
        for (File absolutePath : f) {
            if (m21334a(absolutePath.getAbsolutePath())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m21339b(int i) {
        if (i == 700) {
            m21346d(false);
        }
    }
}
