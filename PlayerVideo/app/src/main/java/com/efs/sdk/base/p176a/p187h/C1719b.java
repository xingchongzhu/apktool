package com.efs.sdk.base.p176a.p187h;

import com.efs.sdk.base.p176a.p177a.C1651a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: com.efs.sdk.base.a.h.b */
public final class C1719b {

    /* renamed from: a */
    private static final Random f11398a = new Random();

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m14279a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m14276a((Closeable) fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                String str = "efs.util.file";
                try {
                    StringBuilder sb = new StringBuilder("write file error, filename is ");
                    sb.append(file.getName());
                    C1728d.m14309b(str, sb.toString(), th);
                    m14276a((Closeable) fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    m14276a((Closeable) fileOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            String str2 = "efs.util.file";
            StringBuilder sb2 = new StringBuilder("write file error, filename is ");
            sb2.append(file.getName());
            C1728d.m14309b(str2, sb2.toString(), th);
            m14276a((Closeable) fileOutputStream);
            return false;
        }
    }

    /* renamed from: b */
    public static void m14282b(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File b : listFiles) {
                        m14282b(b);
                    }
                }
            }
            file.delete();
        }
    }

    /* renamed from: c */
    public static long m14283c(File file) {
        long j = 0;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0;
            }
            for (File c : listFiles) {
                j += m14283c(c);
            }
        } else {
            j = 0 + file.length();
        }
        return j;
    }

    /* renamed from: d */
    public static List<File> m14284d(File file) {
        if (file.isFile()) {
            return Collections.emptyList();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(m14284d(file2));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private static String m14285e(File file) {
        String str = "";
        if (!file.exists()) {
            return str;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read));
                }
                str = sb.toString();
                m14276a((Closeable) fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    C1728d.m14309b("efs.util.file", "read file error", th);
                    return str;
                } finally {
                    m14276a((Closeable) fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C1728d.m14309b("efs.util.file", "read file error", th);
            return str;
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m14278a(File file, String str) {
        return m14279a(file, str.getBytes());
    }

    /* renamed from: a */
    public static String m14275a(File file) {
        return m14285e(file);
    }

    /* renamed from: b */
    public static C1698b m14281b(String str) {
        String[] split = str.split("_");
        if (split.length != 7) {
            C1728d.m14308a("efs.util.file", "File name error, name is ".concat(str), null);
            return null;
        }
        String str2 = split[0];
        String str3 = split[1];
        byte byteValue = Byte.valueOf(split[2]).byteValue();
        C1698b bVar = new C1698b(str2, Byte.valueOf(split[3]).byteValue());
        bVar.mo9669a(str3);
        bVar.mo9668a((int) byteValue);
        return bVar;
    }

    /* renamed from: a */
    public static byte[] m14280a(String str) {
        byte[] bArr = new byte[0];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                bArr = new byte[fileInputStream2.available()];
                fileInputStream2.read(bArr);
                m14276a((Closeable) fileInputStream2);
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C1728d.m14309b("efs.util.file", "read data error", e);
                    m14276a((Closeable) fileInputStream);
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    m14276a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                m14276a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C1728d.m14309b("efs.util.file", "read data error", e);
            m14276a((Closeable) fileInputStream);
            return bArr;
        }
        return bArr;
    }

    /* renamed from: a */
    public static void m14276a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                C1728d.m14309b("efs.util.file", "safe close error", th);
            }
        }
    }

    /* renamed from: a */
    public static String m14274a(C1698b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.f11378a.f11371a);
        String str = "_";
        sb.append(str);
        sb.append(bVar.f11378a.f11374d);
        sb.append(str);
        sb.append(bVar.f11378a.f11375e);
        sb.append(str);
        sb.append(bVar.f11378a.f11372b);
        sb.append(str);
        sb.append(C1731g.m14316a());
        sb.append(str);
        sb.append(f11398a.nextInt(10000));
        sb.append(str);
        C1651a.m14131a();
        sb.append(C1651a.m14134b());
        return sb.toString();
    }

    /* renamed from: a */
    public static void m14277a(File file, File file2) {
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
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        try {
                            C1728d.m14309b("efs.util.file", "error when copy", e);
                            m14276a((Closeable) fileInputStream);
                            m14276a((Closeable) fileOutputStream);
                            m14282b(file);
                        } catch (Throwable th) {
                            th = th;
                            m14276a((Closeable) fileInputStream);
                            m14276a((Closeable) fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        m14276a((Closeable) fileInputStream);
                        m14276a((Closeable) fileOutputStream);
                        throw th;
                    }
                }
                m14276a((Closeable) fileInputStream2);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                C1728d.m14309b("efs.util.file", "error when copy", e);
                m14276a((Closeable) fileInputStream);
                m14276a((Closeable) fileOutputStream);
                m14282b(file);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                m14276a((Closeable) fileInputStream);
                m14276a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
            C1728d.m14309b("efs.util.file", "error when copy", e);
            m14276a((Closeable) fileInputStream);
            m14276a((Closeable) fileOutputStream);
            m14282b(file);
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            m14276a((Closeable) fileInputStream);
            m14276a((Closeable) fileOutputStream);
            throw th;
        }
        m14276a((Closeable) fileOutputStream);
        m14282b(file);
    }
}
