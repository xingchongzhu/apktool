package com.p259uc.crashsdk;

import android.os.Looper;
import android.os.Process;
import com.p259uc.crashsdk.export.LogType;
import com.p259uc.crashsdk.p260a.C3075a;
import com.p259uc.crashsdk.p260a.C3079e;
import com.p259uc.crashsdk.p260a.C3080f;
import com.p259uc.crashsdk.p260a.C3081g;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.File;
import java.util.Locale;

/* renamed from: com.uc.crashsdk.JNIBridge */
/* compiled from: ProGuard */
public class JNIBridge {
    private static int addCachedInfo(String str, String str2) {
        return ProGuard.m20955b(str, str2);
    }

    private static int addDumpFile(String str, String str2, boolean z, boolean z2, int i, boolean z3) {
        return ProGuard.m20942a(str, str2, z, z2, i, z3);
    }

    private static void addHeaderInfo(String str, String str2) {
        ProGuard.m20951a(str, str2);
    }

    public static long cmd(int i) {
        return nativeCmd(i, 0, null, null);
    }

    private static int createCachedInfo(String str, int i, int i2) {
        return ProGuard.m20940a(str, i, i2);
    }

    private static boolean generateCustomLog(String str, String str2, long j, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return C3087e.m21237a(stringBuffer, str2, j, ProGuard.m20961c(str3), ProGuard.m20961c(str4), ProGuard.m20961c(str5), str6);
    }

    protected static String getCallbackInfo(String str, boolean z) {
        return ProGuard.m20945a(str, z);
    }

    private static String getDatasForClientJavaLog(int i, String str) {
        boolean equals = "$all$".equals(str);
        if (i == 1) {
            if (equals) {
                return ProGuard.m20966h();
            }
            return ProGuard.m20944a(str);
        } else if (i == 2) {
            if (equals) {
                return ProGuard.m20968j();
            }
            return ProGuard.m20945a(str, true);
        } else if (i == 3) {
            if (equals) {
                return ProGuard.m20970l();
            }
            return ProGuard.m20957b(str);
        } else if (i == 4) {
            return C3087e.m21260c(str) ? SdkVersion.MINI_VERSION : "0";
        } else {
            return null;
        }
    }

    private static String getJavaStackTrace(Thread thread, int i) {
        if (i != 0 && i == Process.myPid()) {
            thread = Looper.getMainLooper().getThread();
        }
        if (thread != null) {
            return C3087e.m21217a(thread.getStackTrace(), "getJavaStackTrace").toString();
        }
        return null;
    }

    public static native boolean nativeAddCachedInfo(String str, String str2);

    public static native int nativeAddCallbackInfo(String str, int i, long j, int i2);

    public static native int nativeAddDumpFile(String str, String str2, boolean z, boolean z2, int i, boolean z3);

    public static native void nativeAddHeaderInfo(String str, String str2);

    public static native boolean nativeChangeState(String str, String str2, boolean z);

    public static native void nativeClientCloseConnection(long j);

    public static native long nativeClientCreateConnection(String str, String str2, String str3, int i);

    public static native int nativeClientWriteData(long j, String str);

    public static native void nativeCloseFile(int i);

    public static native long nativeCmd(int i, long j, String str, Object[] objArr);

    public static native void nativeCrash(int i, int i2);

    public static native int nativeCreateCachedInfo(String str, int i, int i2);

    public static native String nativeDumpThreads(String str, long j);

    public static native int nativeGenerateUnexpLog(long j, int i);

    public static native String nativeGet(int i, long j, String str);

    public static native String nativeGetCallbackInfo(String str, long j, int i, boolean z);

    public static native boolean nativeIsCrashing();

    public static native boolean nativeLockFile(int i, boolean z);

    public static native int nativeLog(int i, String str, String str2);

    public static native int nativeOpenFile(String str);

    public static native long nativeSet(int i, long j, String str, Object[] objArr);

    public static native void nativeSetForeground(boolean z);

    private static void onCrashLogGenerated(String str, String str2, String str3, boolean z) {
        boolean equals = C3087e.m21281h().equals(str2);
        boolean equals2 = LogType.NATIVE_TYPE.equals(str3);
        if (!C3087e.m21186E()) {
            if (equals && equals2) {
                try {
                    C3092f.m21344c(true);
                } catch (Throwable th) {
                    C3081g.m21027a(th);
                }
            }
            str = C3087e.m21213a(str);
        }
        C3086d.m21176a(str, str2, str3);
        if (!C3087e.m21186E()) {
            if (z || (!equals && C3093g.m21402s())) {
                C3087e.m21238a(false, false);
                return;
            }
            if (equals) {
                C3087e.m21252b(equals2);
            }
        }
    }

    private static void onCrashRestarting() {
        C3086d.m21177a(false);
        C3084b.m21112K();
    }

    private static void onKillProcess(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder("onKillProcess. SIG: ");
        sb.append(i2);
        String sb2 = sb.toString();
        String str2 = "crashsdk";
        if (C3087e.m21231a()) {
            C3075a.m20979b(str2, sb2);
        } else {
            C3075a.m20976a(str2, sb2);
        }
        StringBuilder e = C3087e.m21270e("onKillProcess");
        Locale locale = Locale.US;
        e.insert(0, String.format(locale, "State in disk: '%s'\n", new Object[]{C3084b.m21156m()}));
        e.insert(0, String.format(locale, "SIG: %d, fg: %s, exiting: %s, main process: %s, time: %s\n", new Object[]{Integer.valueOf(i2), Boolean.valueOf(C3084b.m21168y()), Boolean.valueOf(C3084b.m21161r()), Boolean.valueOf(C3084b.m21104C()), C3087e.m21292m()}));
        e.insert(0, String.format(locale, "Kill PID: %d (%s) by pid: %d (%s) tid: %d (%s)\n", new Object[]{Integer.valueOf(i), C3087e.m21211a(i), Integer.valueOf(Process.myPid()), C3087e.m21211a(Process.myPid()), Integer.valueOf(Process.myTid()), Thread.currentThread().getName()}));
        String sb3 = e.toString();
        if (C3087e.m21231a()) {
            C3075a.m20979b(str2, sb3);
        } else {
            C3075a.m20976a(str2, sb3);
        }
        if (!C3084b.m21110I()) {
            C3081g.m21031a(new File(str), sb3.getBytes());
        }
    }

    private static String onNativeEvent(int i, long j, Object[] objArr) {
        switch (i) {
            case 1:
                return String.valueOf(Runtime.getRuntime().maxMemory());
            case 2:
                return C3087e.m21262d();
            case 3:
                if (objArr == null || objArr.length != 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String)) {
                    return null;
                }
                return C3087e.m21214a(objArr[0], objArr[1]);
            case 4:
                return C3087e.m21279g();
            case 5:
                ProGuard.m20954a(true);
                break;
            case 6:
                return C3081g.m21041d();
            case 7:
                C3080f.m21014a(2, new C3079e(102), 8000);
                C3087e.m21300q();
                break;
        }
        return null;
    }

    private static int onPreClientCustomLog(String str, String str2, boolean z) {
        C3093g.m21378a();
        C3087e.m21230a(false);
        if (C3087e.m21236a(str, str2, z)) {
            return 0;
        }
        C3087e.m21251b(str, str2, z);
        return 1;
    }

    private static int registerCurrentThread(String str, int i) {
        return ProGuard.m20939a(i, str);
    }

    private static int registerInfoCallback(String str, int i, long j, int i2) {
        return ProGuard.m20941a(str, i, null, j, i2);
    }

    public static long set(int i, boolean z) {
        return nativeSet(i, z ? 1 : 0, null, null);
    }

    public static long cmd(int i, String str) {
        return nativeCmd(i, 0, str, null);
    }

    public static long set(int i, long j) {
        return nativeSet(i, j, null, null);
    }

    public static long set(int i, String str) {
        return nativeSet(i, 0, str, null);
    }
}
