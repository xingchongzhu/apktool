package com.p259uc.crashsdk.p260a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.p259uc.crashsdk.C3084b;
import com.p259uc.crashsdk.C3093g;
import com.p259uc.crashsdk.JNIBridge;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.TType;
import com.umeng.analytics.pro.UMCommonContent;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;

/* renamed from: com.uc.crashsdk.a.g */
/* compiled from: ProGuard */
public class C3081g {

    /* renamed from: a */
    static final /* synthetic */ boolean f16278a = true;

    /* renamed from: b */
    private static Context f16279b = null;

    /* renamed from: c */
    private static String f16280c = null;

    /* renamed from: d */
    private static String f16281d = null;

    /* renamed from: e */
    private static String f16282e = null;

    /* renamed from: f */
    private static String f16283f = null;

    /* renamed from: g */
    private static String f16284g = null;

    /* renamed from: h */
    private static boolean f16285h = false;

    /* renamed from: i */
    private static final Object f16286i = new Object();

    /* renamed from: j */
    private static final char[] f16287j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m21026a(File file, File file2) {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[524288];
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            m21025a((Closeable) fileInputStream2);
                            m21025a((Closeable) fileOutputStream);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        m21025a((Closeable) fileInputStream);
                        m21025a((Closeable) fileOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                m21025a((Closeable) fileInputStream);
                m21025a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            m21025a((Closeable) fileInputStream);
            m21025a((Closeable) fileOutputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public static void m21035b(File file) {
        m21030a(file, "");
    }

    /* renamed from: c */
    public static String m21040c(File file) {
        String str = "";
        if (!file.exists()) {
            return str;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[LogType.UNEXP];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read));
                }
                str = sb.toString();
                m21025a((Closeable) fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    m21028a(th, false);
                    return str;
                } finally {
                    m21025a((Closeable) fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            m21028a(th, false);
            return str;
        }
        return str;
    }

    /* renamed from: d */
    public static String m21042d(File file) {
        return m21019a(file, 64, (boolean) f16278a);
    }

    /* renamed from: e */
    public static byte[] m21045e(File file) {
        FileInputStream fileInputStream;
        byte[] bArr = null;
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] bArr2 = new byte[((int) file.length())];
            fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr2);
                m21025a((Closeable) fileInputStream);
                bArr = bArr2;
            } catch (Throwable th) {
                th = th;
                try {
                    m21028a(th, false);
                    return bArr;
                } finally {
                    m21025a((Closeable) fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            m21028a(th, false);
            return bArr;
        }
        return bArr;
    }

    /* renamed from: f */
    public static boolean m21046f() {
        String str = Build.TAGS;
        if (str == null || !str.contains("test-keys")) {
            return false;
        }
        return f16278a;
    }

    /* renamed from: g */
    public static boolean m21047g() {
        String i = m21049i();
        if (!m21032a(i)) {
            int indexOf = i.indexOf(" root ");
            if (indexOf > 0) {
                String substring = i.substring(0, indexOf);
                if (substring.contains("x") || substring.contains(UMCommonContent.f16628az)) {
                    return f16278a;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static String m21048h() {
        m21052l();
        if (m21032a(f16283f)) {
            return "";
        }
        return f16283f;
    }

    /* renamed from: i */
    public static String m21049i() {
        m21052l();
        if (m21032a(f16284g)) {
            return "";
        }
        return f16284g;
    }

    /* renamed from: j */
    public static void m21050j() {
        C3080f.m21014a(0, new C3079e(800), 15000);
    }

    /* renamed from: k */
    public static void m21051k() {
        if (C3084b.f16345d && f16285h) {
            JNIBridge.set(123, f16283f);
            JNIBridge.set(124, f16284g);
        }
    }

    /* renamed from: l */
    private static void m21052l() {
        if (!f16285h) {
            synchronized (f16286i) {
                if (!f16285h) {
                    String a = m21021a(new String[]{"sh", "-c", "type su"});
                    if (!m21032a(a)) {
                        String trim = a.trim();
                        int indexOf = trim.indexOf(32);
                        if (indexOf > 0 && trim.contains("/su")) {
                            int indexOf2 = trim.indexOf(47, indexOf + 1);
                            if (indexOf2 > 0) {
                                String substring = trim.substring(indexOf2);
                                f16283f = substring;
                                String a2 = m21021a(new String[]{"ls", "-l", substring});
                                if (!m21032a(a2)) {
                                    f16284g = a2.trim();
                                }
                            }
                        }
                    }
                    f16285h = f16278a;
                    m21051k();
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m21029a(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String file2 : list) {
                    if (!m21029a(new File(file, file2))) {
                        return false;
                    }
                }
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    public static boolean m21037b(String str) {
        if (!m21032a(str)) {
            return f16278a;
        }
        return false;
    }

    /* renamed from: d */
    public static String m21041d() {
        String str = f16282e;
        return str != null ? str : "";
    }

    /* renamed from: b */
    public static void m21036b(Throwable th) {
        m21028a(th, (boolean) f16278a);
    }

    /* renamed from: d */
    public static String m21043d(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bytes);
            byte[] digest = instance.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length * 2);
            int i = length + 0;
            for (int i2 = 0; i2 < i; i2++) {
                byte b = digest[i2];
                char[] cArr = f16287j;
                char c = cArr[(b & 240) >> 4];
                char c2 = cArr[b & TType.f16864m];
                sb.append(c);
                sb.append(c2);
            }
            return sb.toString();
        } catch (Exception e) {
            C3075a.m20977a("crashsdk", "getMD5: ", e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m21034b() {
        return f16280c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e A[SYNTHETIC, Splitter:B:13:0x001e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m21019a(java.io.File r4, int r5, boolean r6) {
        /*
            r0 = 0
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x001a }
            r2.<init>(r4)     // Catch:{ all -> 0x001a }
            byte[] r4 = new byte[r5]     // Catch:{ all -> 0x0018 }
            int r5 = r2.read(r4)     // Catch:{ all -> 0x0018 }
            if (r5 <= 0) goto L_0x0027
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0018 }
            r3.<init>(r4, r0, r5)     // Catch:{ all -> 0x0018 }
            m21025a(r2)
            return r3
        L_0x0018:
            r4 = move-exception
            goto L_0x001c
        L_0x001a:
            r4 = move-exception
            r2 = r1
        L_0x001c:
            if (r6 == 0) goto L_0x0027
            m21028a(r4, r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0027
        L_0x0022:
            r4 = move-exception
            m21025a(r2)
            throw r4
        L_0x0027:
            m21025a(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.p260a.C3081g.m21019a(java.io.File, int, boolean):java.lang.String");
    }

    /* renamed from: e */
    public static boolean m21044e() {
        if (m21047g()) {
            return f16278a;
        }
        return m21046f();
    }

    /* renamed from: c */
    public static long m21038c(String str) {
        if (m21032a(str)) {
            return 0;
        }
        try {
            long parseLong = Long.parseLong(str.trim());
            if (parseLong < 0) {
                return 0;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static String m21039c() {
        return f16281d;
    }

    /* renamed from: a */
    public static ArrayList<String> m21022a(File file, int i) {
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2, 512);
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                        i2++;
                        if (i > 0 && i2 >= i) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileReader = fileReader2;
                        try {
                            m21028a(th, false);
                            m21025a((Closeable) fileReader);
                            m21025a((Closeable) bufferedReader);
                            return arrayList;
                        } catch (Throwable th2) {
                            m21025a((Closeable) fileReader);
                            m21025a((Closeable) bufferedReader);
                            throw th2;
                        }
                    }
                }
                m21025a((Closeable) fileReader2);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                fileReader = fileReader2;
                m21028a(th, false);
                m21025a((Closeable) fileReader);
                m21025a((Closeable) bufferedReader);
                return arrayList;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            m21028a(th, false);
            m21025a((Closeable) fileReader);
            m21025a((Closeable) bufferedReader);
            return arrayList;
        }
        m21025a((Closeable) bufferedReader);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m21031a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m21025a((Closeable) fileOutputStream2);
                return f16278a;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    m21028a(th, false);
                    return false;
                } finally {
                    m21025a((Closeable) fileOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            m21028a(th, false);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m21030a(File file, String str) {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str, 0, str.length());
                m21025a((Closeable) fileWriter2);
                return f16278a;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                try {
                    m21028a(th, false);
                    return false;
                } finally {
                    m21025a((Closeable) fileWriter);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            m21028a(th, false);
            return false;
        }
    }

    /* renamed from: a */
    public static void m21025a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                m21028a(th, (boolean) f16278a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (r2.toLowerCase().startsWith("http") != false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m21020a(java.lang.String r2, java.lang.String r3, boolean r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = com.p259uc.crashsdk.p260a.C3076b.m20982a(r2)
            boolean r0 = m21032a(r2)
            if (r0 == 0) goto L_0x0017
            goto L_0x002a
        L_0x0017:
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = r2.trim()
            java.lang.String r4 = r2.toLowerCase()
            java.lang.String r0 = "http"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            if (r1 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r1
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.p260a.C3081g.m21020a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m21032a(String str) {
        if (str == null || str.trim().length() == 0) {
            return f16278a;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m21033a(StringBuffer stringBuffer) {
        if (stringBuffer == null || stringBuffer.length() == 0) {
            return f16278a;
        }
        return false;
    }

    /* renamed from: a */
    public static void m21027a(Throwable th) {
        m21028a(th, false);
    }

    /* renamed from: a */
    private static void m21028a(Throwable th, boolean z) {
        if (!z) {
            try {
                if (!C3093g.m21362M()) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        th.printStackTrace();
    }

    /* renamed from: a */
    public static void m21024a(Context context) {
        if (f16279b != null) {
            C3075a.m20978b("mContext is existed");
        }
        f16279b = context;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        f16280c = applicationInfo.dataDir;
        f16281d = applicationInfo.sourceDir;
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(f16278a);
            Object obj = declaredField.get(applicationInfo);
            if (obj != null && (obj instanceof String)) {
                f16282e = (String) obj;
            }
        } catch (Throwable th) {
            m21028a(th, false);
        }
    }

    /* renamed from: a */
    public static Context m21018a() {
        return f16279b;
    }

    /* renamed from: a */
    public static void m21023a(int i) {
        if (i == 800) {
            m21052l();
        } else if (!f16278a) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static String m21021a(String[] strArr) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader, 512);
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
                try {
                    m21028a(th, false);
                    return null;
                } finally {
                    m21025a((Closeable) bufferedReader);
                    m21025a((Closeable) inputStreamReader);
                }
            }
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String trim = sb.toString().trim();
                        m21025a((Closeable) bufferedReader);
                        m21025a((Closeable) inputStreamReader);
                        return trim;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                m21028a(th, false);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            inputStreamReader = null;
            m21028a(th, false);
            return null;
        }
    }
}
