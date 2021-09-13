package com.p259uc.crashsdk;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.p259uc.crashsdk.export.CrashStatKey;
import com.p259uc.crashsdk.export.CustomInfo;
import com.p259uc.crashsdk.export.VersionInfo;
import com.p259uc.crashsdk.p260a.C3075a;
import com.p259uc.crashsdk.p260a.C3081g;
import java.io.File;
import java.lang.reflect.Field;

/* renamed from: com.uc.crashsdk.g */
/* compiled from: ProGuard */
public class C3093g {

    /* renamed from: a */
    public static RuntimeException f16457a = null;

    /* renamed from: b */
    public static RuntimeException f16458b = null;

    /* renamed from: c */
    static final /* synthetic */ boolean f16459c = true;

    /* renamed from: d */
    private static CustomInfo f16460d;

    /* renamed from: e */
    private static VersionInfo f16461e;

    /* renamed from: f */
    private static final Object f16462f = new Object();

    /* renamed from: g */
    private static String f16463g;

    /* renamed from: h */
    private static String f16464h;

    /* renamed from: i */
    private static String f16465i;

    /* renamed from: j */
    private static String f16466j;

    /* renamed from: k */
    private static final Object f16467k = new Object();

    /* renamed from: A */
    static long m21350A() {
        return f16460d.mMaxUploadBytesPerDay;
    }

    /* renamed from: B */
    static int m21351B() {
        return f16460d.mMaxUploadBuiltinLogCountPerDay;
    }

    /* renamed from: C */
    static int m21352C() {
        return f16460d.mMaxUploadCustomLogCountPerDay;
    }

    /* renamed from: D */
    static int m21353D() {
        return f16460d.mMaxCustomLogCountPerTypePerDay;
    }

    /* renamed from: E */
    static int m21354E() {
        return f16460d.mInfoUpdateInterval;
    }

    /* renamed from: F */
    static int m21355F() {
        return f16460d.mInfoSaveFrequency;
    }

    /* renamed from: G */
    static int m21356G() {
        return f16460d.mReservedJavaFileHandleCount;
    }

    /* renamed from: H */
    static int m21357H() {
        return f16460d.mFdDumpMinLimit;
    }

    /* renamed from: I */
    static int m21358I() {
        return f16460d.mThreadsDumpMinLimit;
    }

    /* renamed from: J */
    static boolean m21359J() {
        return f16460d.mAutoDetectLifeCycle;
    }

    /* renamed from: K */
    static boolean m21360K() {
        return f16460d.mMonitorBattery;
    }

    /* renamed from: L */
    static int m21361L() {
        return f16460d.mAnrTraceStrategy;
    }

    /* renamed from: M */
    public static boolean m21362M() {
        CustomInfo customInfo = f16460d;
        if (customInfo == null || customInfo.mDebug) {
            return f16459c;
        }
        return false;
    }

    /* renamed from: N */
    static boolean m21363N() {
        CustomInfo customInfo = f16460d;
        if (customInfo == null || customInfo.mPrintStackInfos) {
            return f16459c;
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m21364O() {
        return f16460d.mEnableStatReport;
    }

    /* renamed from: P */
    public static boolean m21365P() {
        return f16460d.mIsInternational;
    }

    /* renamed from: Q */
    public static boolean m21366Q() {
        return f16460d.mAddPvForNewDay;
    }

    /* renamed from: R */
    public static String m21367R() {
        if (C3081g.m21032a(f16461e.mVersion)) {
            return ProGuard.m20943a();
        }
        return m21377a(f16461e.mVersion);
    }

    /* renamed from: S */
    public static String m21368S() {
        if (C3081g.m21032a(f16461e.mSubVersion)) {
            return "release";
        }
        return f16461e.mSubVersion;
    }

    /* renamed from: T */
    public static String m21369T() {
        if (C3081g.m21032a(f16461e.mBuildId)) {
            return m21373X();
        }
        return m21377a(f16461e.mBuildId);
    }

    /* renamed from: U */
    public static String m21370U() {
        if (f16464h == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3081g.m21034b());
            sb.append(File.separatorChar);
            sb.append(f16460d.mTagFilesFolderName);
            sb.append(File.separatorChar);
            f16464h = sb.toString();
        }
        return f16464h;
    }

    /* renamed from: V */
    static String m21371V() {
        if (f16465i == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3081g.m21034b());
            sb.append(File.separatorChar);
            sb.append(f16460d.mCrashLogsFolderName);
            sb.append(File.separatorChar);
            f16465i = sb.toString();
        }
        return f16465i;
    }

    /* renamed from: W */
    static String m21372W() {
        if (f16466j == null) {
            if (!C3081g.m21032a(f16460d.mLogsBackupPathName)) {
                String trim = f16460d.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!trim.endsWith(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(trim);
                    sb.append(str);
                    trim = sb.toString();
                }
                f16466j = trim;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C3081g.m21034b());
                sb2.append(File.separatorChar);
                sb2.append("msdb");
                sb2.append(File.separatorChar);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append(File.separatorChar);
                sb4.append(f16460d.mCrashLogsFolderName);
                sb4.append(File.separatorChar);
                f16466j = sb4.toString();
            }
        }
        return f16466j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047 A[SYNTHETIC, Splitter:B:18:0x0047] */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21373X() {
        /*
            java.lang.String r0 = f16463g
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ all -> 0x003a }
            java.lang.String r2 = com.p259uc.crashsdk.p260a.C3081g.m21039c()     // Catch:{ all -> 0x003a }
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r1.getEntry(r0)     // Catch:{ all -> 0x0038 }
            long r2 = r0.getCrc()     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = java.lang.Long.toHexString(r2)     // Catch:{ all -> 0x0038 }
            f16463g = r0     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "version unique build id: "
            r0.<init>(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = f16463g     // Catch:{ all -> 0x0038 }
            r0.append(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "crashsdk"
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r2, r0)     // Catch:{ all -> 0x0038 }
            r1.close()     // Catch:{ all -> 0x004a }
            goto L_0x004a
        L_0x0038:
            r0 = move-exception
            goto L_0x003e
        L_0x003a:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x003e:
            java.lang.String r2 = ""
            f16463g = r2     // Catch:{ all -> 0x004d }
            com.p259uc.crashsdk.p260a.C3081g.m21027a(r0)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            java.lang.String r0 = f16463g
            return r0
        L_0x004d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3093g.m21373X():java.lang.String");
    }

    /* renamed from: Y */
    private static void m21374Y() {
        if (C3084b.f16345d) {
            JNIBridge.nativeSet(24, 1, ProGuard.f16227b, null);
        }
    }

    /* renamed from: a */
    public static void m21380a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        f16460d = customInfo2;
        m21386c(customInfo2);
        if (!f16460d.mZipLog) {
            StringBuilder sb = new StringBuilder("initialize set mZipLog to false, info.mZipLog: ");
            sb.append(customInfo.mZipLog);
            f16457a = new RuntimeException(sb.toString());
        }
        if (f16460d.mEncryptLog) {
            StringBuilder sb2 = new StringBuilder("initialize set mEncryptLog to true, info.mEncryptLog: ");
            sb2.append(customInfo.mEncryptLog);
            f16458b = new RuntimeException(sb2.toString());
        }
        f16461e = new VersionInfo(versionInfo);
        if (!C3084b.m21110I()) {
            try {
                m21378a();
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m21384b() {
        JNIBridge.set(103, C3081g.m21034b());
        JNIBridge.set(104, f16460d.mTagFilesFolderName);
        JNIBridge.set(105, f16460d.mCrashLogsFolderName);
        JNIBridge.set(106, m21372W());
        JNIBridge.set(107, C3087e.m21281h());
        JNIBridge.set(108, C3084b.m21129a());
        JNIBridge.set(109, m21367R());
        JNIBridge.set(110, m21368S());
        JNIBridge.set(111, m21369T());
        JNIBridge.set(112, "210105150455");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, VERSION.RELEASE);
        JNIBridge.set(118, C3087e.m21298p());
        JNIBridge.set(5, f16460d.mCallNativeDefaultHandler);
        JNIBridge.set(6, f16460d.mDumpUserSolibBuildId);
        JNIBridge.set(7, f16460d.mReservedNativeMemoryBytes);
        JNIBridge.set(100, f16460d.mNativeCrashLogFileName);
        JNIBridge.set(101, f16460d.mUnexpCrashLogFileName);
        JNIBridge.set(102, f16460d.mAppId);
    }

    /* renamed from: c */
    private static void m21386c(CustomInfo customInfo) {
        if (customInfo.mZippedLogExtension == null) {
            customInfo.mZippedLogExtension = "";
        }
        if (!customInfo.mZippedLogExtension.equals(".tmp")) {
            if (customInfo.mOmitJavaCrash) {
                customInfo.mCallJavaDefaultHandler = false;
            }
            if (customInfo.mOmitNativeCrash) {
                customInfo.mCallNativeDefaultHandler = false;
            }
            long b = C3087e.m21242b();
            if (b >= 1) {
                customInfo.mMaxBuiltinLogFilesCount = CrashStatKey.LOG_LEGACY_TMP_FILE;
                customInfo.mMaxCustomLogFilesCount = 100;
                customInfo.mMaxUploadBytesPerDay = 268435456;
                customInfo.mMaxUploadBuiltinLogCountPerDay = 2000;
                customInfo.mMaxUploadCustomLogCountPerDay = 2000;
                customInfo.mMaxCustomLogCountPerTypePerDay = 100;
                customInfo.mMaxAnrLogCountPerProcess = 100;
                customInfo.mAnrTraceStrategy = 2;
                if (b >= 2) {
                    customInfo.mSyncUploadSetupCrashLogs = f16459c;
                    customInfo.mSyncUploadLogs = f16459c;
                    if (b >= 3) {
                        customInfo.mBackupLogs = f16459c;
                        customInfo.mPrintStackInfos = f16459c;
                        customInfo.mDebug = f16459c;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
    }

    /* renamed from: d */
    public static void m21387d() {
        JNIBridge.set(23, f16460d.mIsInternational);
        if (C3084b.m21106E()) {
            JNIBridge.set(34, (boolean) f16459c);
        }
        if (C3087e.m21285i()) {
            JNIBridge.set(1, (boolean) f16459c);
        }
        JNIBridge.set(10, (long) f16460d.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, (long) f16460d.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(C3084b.m21168y());
        JNIBridge.set(2, C3084b.m21104C());
        ProGuard.m20963e();
        ProGuard.m20965g();
        ProGuard.m20967i();
        ProGuard.m20969k();
        JNIBridge.set(113, ProGuard.f16226a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, (long) f16460d.mThreadsDumpMinLimit);
        JNIBridge.set(122, ProGuard.m20943a());
        JNIBridge.set(33, (long) ProGuard.m20960c());
        m21374Y();
        C3084b.m21109H();
        C3084b.m21102A();
        C3081g.m21051k();
    }

    /* renamed from: e */
    public static String m21388e() {
        return f16460d.mAppId;
    }

    /* renamed from: f */
    static boolean m21389f() {
        if (!C3081g.m21037b(f16460d.mJavaCrashLogFileName) && !C3081g.m21037b(f16460d.mNativeCrashLogFileName)) {
            return C3081g.m21037b(f16460d.mUnexpCrashLogFileName);
        }
        return f16459c;
    }

    /* renamed from: g */
    static String m21390g() {
        return f16460d.mJavaCrashLogFileName;
    }

    /* renamed from: h */
    static int m21391h() {
        return f16460d.mCrashRestartInterval;
    }

    /* renamed from: i */
    static boolean m21392i() {
        return f16460d.mCallJavaDefaultHandler;
    }

    /* renamed from: j */
    static boolean m21393j() {
        return f16460d.mDumpHprofDataForJavaOOM;
    }

    /* renamed from: k */
    static boolean m21394k() {
        return f16460d.mRenameFileToDefaultName;
    }

    /* renamed from: l */
    static int m21395l() {
        return f16460d.mMaxBuiltinLogFilesCount;
    }

    /* renamed from: m */
    static int m21396m() {
        return f16460d.mMaxCustomLogFilesCount;
    }

    /* renamed from: n */
    static int m21397n() {
        return f16460d.mMaxJavaLogcatLineCount;
    }

    /* renamed from: o */
    static int m21398o() {
        return f16460d.mUnexpDelayMillSeconds;
    }

    /* renamed from: p */
    static int m21399p() {
        return f16460d.mUnexpSubTypes;
    }

    /* renamed from: q */
    static boolean m21400q() {
        return f16460d.mBackupLogs;
    }

    /* renamed from: r */
    public static boolean m21401r() {
        return f16460d.mSyncUploadSetupCrashLogs;
    }

    /* renamed from: s */
    static boolean m21402s() {
        return f16460d.mSyncUploadLogs;
    }

    /* renamed from: t */
    static boolean m21403t() {
        return f16460d.mOmitJavaCrash;
    }

    /* renamed from: u */
    static boolean m21404u() {
        return f16460d.mAutoDeleteOldVersionStats;
    }

    /* renamed from: v */
    static boolean m21405v() {
        return f16460d.mZipLog;
    }

    /* renamed from: w */
    static String m21406w() {
        return f16460d.mZippedLogExtension;
    }

    /* renamed from: x */
    static boolean m21407x() {
        return f16460d.mEncryptLog;
    }

    /* renamed from: y */
    static int m21408y() {
        return f16460d.mLogMaxBytesLimit;
    }

    /* renamed from: z */
    static int m21409z() {
        return f16460d.mLogMaxUploadBytesLimit;
    }

    /* renamed from: a */
    public static void m21379a(CustomInfo customInfo) {
        boolean z = f16459c;
        if (!z && customInfo.mTagFilesFolderName == null) {
            throw new AssertionError();
        } else if (!z && customInfo.mCrashLogsFolderName == null) {
            throw new AssertionError();
        } else if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    /* renamed from: a */
    public static void m21381a(VersionInfo versionInfo) {
        synchronized (f16462f) {
            f16461e = new VersionInfo(versionInfo);
            C3087e.m21256c();
            if (C3084b.f16345d) {
                JNIBridge.set(109, m21367R());
                JNIBridge.set(110, m21368S());
                JNIBridge.set(111, m21369T());
                JNIBridge.set(112, "210105150455");
                JNIBridge.cmd(2);
            }
        }
    }

    /* renamed from: a */
    static void m21378a() {
        C3084b.m21165v();
        C3084b.m21164u();
        if (f16460d.mBackupLogs) {
            File file = new File(m21372W());
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    /* renamed from: b */
    public static int m21383b(CustomInfo customInfo) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        synchronized (f16467k) {
            i = 0;
            if (customInfo != null) {
                m21386c(customInfo);
                if (f16460d == null) {
                    f16460d = new CustomInfo();
                }
                CustomInfo customInfo2 = f16460d;
                boolean a = m21382a(customInfo.mAppId, customInfo2.mAppId);
                boolean z3 = f16459c;
                if (!a) {
                    String str = customInfo.mAppId;
                    customInfo2.mAppId = str;
                    if (C3084b.f16345d) {
                        JNIBridge.set(102, str);
                    }
                    i2 = 1;
                    z = f16459c;
                } else {
                    i2 = 0;
                    z = false;
                }
                if (!m21382a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                    customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                    i2++;
                }
                if (!m21382a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                    String str2 = customInfo.mNativeCrashLogFileName;
                    customInfo2.mNativeCrashLogFileName = str2;
                    if (C3084b.f16345d) {
                        JNIBridge.set(100, str2);
                    }
                    i2++;
                    z = f16459c;
                }
                if (!m21382a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                    String str3 = customInfo.mUnexpCrashLogFileName;
                    customInfo2.mUnexpCrashLogFileName = str3;
                    if (C3084b.f16345d) {
                        JNIBridge.set(101, str3);
                    }
                    i2++;
                    z = f16459c;
                }
                if (z) {
                    C3087e.m21256c();
                    if (C3084b.f16345d) {
                        JNIBridge.cmd(2);
                    }
                }
                boolean z4 = customInfo2.mPrintStackInfos;
                boolean z5 = customInfo.mPrintStackInfos;
                if (z4 != z5) {
                    customInfo2.mPrintStackInfos = z5;
                    if (C3084b.f16345d) {
                        JNIBridge.set(11, z5);
                    }
                    i2++;
                }
                boolean z6 = customInfo2.mDebug;
                boolean z7 = customInfo.mDebug;
                if (z6 != z7) {
                    customInfo2.mDebug = z7;
                    if (C3084b.f16345d) {
                        JNIBridge.set(18, z7);
                    }
                    i2++;
                }
                boolean z8 = customInfo2.mBackupLogs;
                boolean z9 = customInfo.mBackupLogs;
                if (z8 != z9) {
                    customInfo2.mBackupLogs = z9;
                    if (C3084b.f16345d) {
                        JNIBridge.set(12, z9);
                    }
                    i2++;
                }
                boolean z10 = customInfo2.mOmitNativeCrash;
                boolean z11 = customInfo.mOmitNativeCrash;
                if (z10 != z11) {
                    customInfo2.mOmitNativeCrash = z11;
                    if (C3084b.f16345d) {
                        JNIBridge.set(21, z11);
                    }
                    i2++;
                }
                int i3 = customInfo2.mCrashRestartInterval;
                int i4 = customInfo.mCrashRestartInterval;
                if (i3 != i4) {
                    customInfo2.mCrashRestartInterval = i4;
                    if (C3084b.f16345d) {
                        JNIBridge.set(13, (long) i4);
                    }
                    if (customInfo2.mCrashRestartInterval >= 0) {
                        C3084b.m21111J();
                    }
                    i2++;
                }
                int i5 = customInfo2.mMaxBuiltinLogFilesCount;
                int i6 = customInfo.mMaxBuiltinLogFilesCount;
                if (i5 != i6) {
                    customInfo2.mMaxBuiltinLogFilesCount = i6;
                    if (C3084b.f16345d) {
                        JNIBridge.set(14, (long) i6);
                    }
                    i2++;
                }
                int i7 = customInfo2.mMaxNativeLogcatLineCount;
                int i8 = customInfo.mMaxNativeLogcatLineCount;
                if (i7 != i8) {
                    customInfo2.mMaxNativeLogcatLineCount = i8;
                    if (C3084b.f16345d) {
                        JNIBridge.set(15, (long) i8);
                    }
                    i2++;
                }
                int i9 = customInfo2.mMaxJavaLogcatLineCount;
                int i10 = customInfo.mMaxJavaLogcatLineCount;
                if (i9 != i10) {
                    customInfo2.mMaxJavaLogcatLineCount = i10;
                    i2++;
                }
                int i11 = customInfo2.mMaxUnexpLogcatLineCount;
                int i12 = customInfo.mMaxUnexpLogcatLineCount;
                if (i11 != i12) {
                    customInfo2.mMaxUnexpLogcatLineCount = i12;
                    if (C3084b.f16345d) {
                        JNIBridge.set(16, (long) i12);
                    }
                    i2++;
                }
                int i13 = customInfo2.mMaxAnrLogcatLineCount;
                int i14 = customInfo.mMaxAnrLogcatLineCount;
                if (i13 != i14) {
                    customInfo2.mMaxAnrLogcatLineCount = i14;
                    if (C3084b.f16345d) {
                        JNIBridge.set(31, (long) i14);
                    }
                    i2++;
                }
                boolean z12 = customInfo2.mZipLog;
                boolean z13 = customInfo.mZipLog;
                if (z12 != z13) {
                    customInfo2.mZipLog = z13;
                    if (!z13) {
                        C3075a.m20981d("DEBUG", "updateCustomInfoImpl set mZipLog to false");
                        f16457a = new RuntimeException("updateCustomInfoImpl set mZipLog to false");
                    }
                    i2++;
                    z2 = f16459c;
                } else {
                    z2 = false;
                }
                if (!m21382a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                    customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                    i2++;
                } else {
                    z3 = z2;
                }
                if (z3 && C3084b.f16345d) {
                    JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1 : 0, customInfo2.mZippedLogExtension, null);
                }
                int i15 = customInfo2.mLogMaxBytesLimit;
                int i16 = customInfo.mLogMaxBytesLimit;
                if (i15 != i16) {
                    customInfo2.mLogMaxBytesLimit = i16;
                    if (C3084b.f16345d) {
                        JNIBridge.set(4, (long) i16);
                    }
                    i2++;
                }
                boolean z14 = customInfo2.mEncryptLog;
                boolean z15 = customInfo.mEncryptLog;
                if (z14 != z15) {
                    customInfo2.mEncryptLog = z15;
                    if (z15) {
                        C3075a.m20981d("DEBUG", "updateCustomInfoImpl set mEncryptLog to true");
                        f16458b = new RuntimeException("updateCustomInfoImpl set mEncryptLog to true");
                    }
                    i2++;
                }
                boolean z16 = customInfo2.mSyncUploadSetupCrashLogs;
                boolean z17 = customInfo.mSyncUploadSetupCrashLogs;
                if (z16 != z17) {
                    customInfo2.mSyncUploadSetupCrashLogs = z17;
                    i2++;
                }
                boolean z18 = customInfo2.mSyncUploadLogs;
                boolean z19 = customInfo.mSyncUploadLogs;
                if (z18 != z19) {
                    customInfo2.mSyncUploadLogs = z19;
                    i2++;
                }
                int i17 = customInfo2.mMaxCustomLogFilesCount;
                int i18 = customInfo.mMaxCustomLogFilesCount;
                if (i17 != i18) {
                    customInfo2.mMaxCustomLogFilesCount = i18;
                    i2++;
                }
                boolean z20 = customInfo2.mOmitJavaCrash;
                boolean z21 = customInfo.mOmitJavaCrash;
                if (z20 != z21) {
                    customInfo2.mOmitJavaCrash = z21;
                    i2++;
                }
                int i19 = customInfo2.mLogMaxUploadBytesLimit;
                int i20 = customInfo.mLogMaxUploadBytesLimit;
                if (i19 != i20) {
                    customInfo2.mLogMaxUploadBytesLimit = i20;
                    i2++;
                }
                long j = customInfo2.mMaxUploadBytesPerDay;
                long j2 = customInfo.mMaxUploadBytesPerDay;
                if (j != j2) {
                    customInfo2.mMaxUploadBytesPerDay = j2;
                    i2++;
                }
                int i21 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                int i22 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                if (i21 != i22) {
                    customInfo2.mMaxUploadBuiltinLogCountPerDay = i22;
                    i2++;
                }
                int i23 = customInfo2.mMaxUploadCustomLogCountPerDay;
                int i24 = customInfo.mMaxUploadCustomLogCountPerDay;
                if (i23 != i24) {
                    customInfo2.mMaxUploadCustomLogCountPerDay = i24;
                    i2++;
                }
                int i25 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                int i26 = customInfo.mMaxCustomLogCountPerTypePerDay;
                if (i25 != i26) {
                    customInfo2.mMaxCustomLogCountPerTypePerDay = i26;
                    i2++;
                }
                int i27 = customInfo2.mMaxAnrLogCountPerProcess;
                int i28 = customInfo.mMaxAnrLogCountPerProcess;
                if (i27 != i28) {
                    customInfo2.mMaxAnrLogCountPerProcess = i28;
                    if (C3084b.f16345d) {
                        JNIBridge.set(32, (long) f16460d.mMaxAnrLogCountPerProcess);
                    }
                    i2++;
                }
                boolean z22 = customInfo2.mCallJavaDefaultHandler;
                boolean z23 = customInfo.mCallJavaDefaultHandler;
                if (z22 != z23) {
                    customInfo2.mCallJavaDefaultHandler = z23;
                    i2++;
                }
                boolean z24 = customInfo2.mCallNativeDefaultHandler;
                boolean z25 = customInfo.mCallNativeDefaultHandler;
                if (z24 != z25) {
                    customInfo2.mCallNativeDefaultHandler = z25;
                    i2++;
                    if (C3084b.f16345d) {
                        JNIBridge.set(5, f16460d.mCallNativeDefaultHandler);
                    }
                }
                boolean z26 = customInfo2.mDumpUserSolibBuildId;
                boolean z27 = customInfo.mDumpUserSolibBuildId;
                if (z26 != z27) {
                    customInfo2.mDumpUserSolibBuildId = z27;
                    i2++;
                    if (C3084b.f16345d) {
                        JNIBridge.set(6, f16460d.mDumpUserSolibBuildId);
                    }
                }
                boolean z28 = customInfo2.mDumpHprofDataForJavaOOM;
                boolean z29 = customInfo.mDumpHprofDataForJavaOOM;
                if (z28 != z29) {
                    customInfo2.mDumpHprofDataForJavaOOM = z29;
                    i2++;
                }
                boolean z30 = customInfo2.mRenameFileToDefaultName;
                boolean z31 = customInfo.mRenameFileToDefaultName;
                if (z30 != z31) {
                    customInfo2.mRenameFileToDefaultName = z31;
                    i2++;
                }
                boolean z32 = customInfo2.mAutoDeleteOldVersionStats;
                boolean z33 = customInfo.mAutoDeleteOldVersionStats;
                if (z32 != z33) {
                    customInfo2.mAutoDeleteOldVersionStats = z33;
                    i2++;
                }
                int i29 = customInfo2.mFdDumpMinLimit;
                int i30 = customInfo.mFdDumpMinLimit;
                if (i29 != i30) {
                    customInfo2.mFdDumpMinLimit = i30;
                    if (C3084b.f16345d) {
                        JNIBridge.set(10, (long) i30);
                    }
                    i2++;
                }
                int i31 = customInfo2.mThreadsDumpMinLimit;
                int i32 = customInfo.mThreadsDumpMinLimit;
                if (i31 != i32) {
                    customInfo2.mThreadsDumpMinLimit = i32;
                    if (C3084b.f16345d) {
                        JNIBridge.set(22, (long) i32);
                    }
                    i2++;
                }
                int i33 = customInfo2.mInfoUpdateInterval;
                int i34 = customInfo.mInfoUpdateInterval;
                if (i33 != i34) {
                    if (i33 <= 0 && i34 > 0) {
                        ProGuard.m20954a(false);
                    }
                    customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                    i2++;
                }
                int i35 = customInfo2.mInfoSaveFrequency;
                int i36 = customInfo.mInfoSaveFrequency;
                if (i35 != i36) {
                    customInfo2.mInfoSaveFrequency = i36;
                    i2++;
                }
                long j3 = customInfo2.mDisableBackgroundSignals;
                long j4 = customInfo.mDisableBackgroundSignals;
                if (j3 != j4) {
                    customInfo2.mDisableBackgroundSignals = j4;
                    if (C3084b.f16345d) {
                        JNIBridge.set(9, j4);
                    }
                    i2++;
                }
                boolean z34 = customInfo2.mEnableStatReport;
                boolean z35 = customInfo.mEnableStatReport;
                if (z34 != z35) {
                    customInfo2.mEnableStatReport = z35;
                    if (z35) {
                        C3087e.m21182A();
                    }
                    i2++;
                }
                boolean z36 = customInfo2.mIsInternational;
                boolean z37 = customInfo.mIsInternational;
                if (z36 != z37) {
                    customInfo2.mIsInternational = z37;
                    if (C3084b.f16345d) {
                        JNIBridge.set(23, z37);
                    }
                    i2++;
                }
                boolean z38 = customInfo2.mAutoDetectLifeCycle;
                boolean z39 = customInfo.mAutoDetectLifeCycle;
                if (z38 != z39) {
                    customInfo2.mAutoDetectLifeCycle = z39;
                    if (z39) {
                        C3084b.m21169z();
                    }
                    i2++;
                }
                boolean z40 = customInfo2.mMonitorBattery;
                boolean z41 = customInfo.mMonitorBattery;
                if (z40 != z41) {
                    customInfo2.mMonitorBattery = z41;
                    C3087e.m21258c(C3084b.m21168y());
                    i2++;
                }
                int i37 = customInfo2.mUnexpSubTypes;
                int i38 = customInfo.mUnexpSubTypes;
                if (i37 != i38) {
                    customInfo2.mUnexpSubTypes = i38;
                    i2++;
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static void m21385c() {
        JNIBridge.set(11, m21363N());
        JNIBridge.set(12, f16460d.mBackupLogs);
        JNIBridge.set(13, (long) f16460d.mCrashRestartInterval);
        JNIBridge.set(14, (long) f16460d.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, (long) f16460d.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, (long) f16460d.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, (long) f16460d.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, m21362M());
        JNIBridge.set(20, (long) VERSION.SDK_INT);
        JNIBridge.set(21, f16460d.mOmitNativeCrash);
        JNIBridge.set(32, (long) f16460d.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, f16460d.mDisableSignals);
        JNIBridge.set(9, f16460d.mDisableBackgroundSignals);
        CustomInfo customInfo = f16460d;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1 : 0, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, (long) f16460d.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    /* renamed from: a */
    private static String m21377a(String str) {
        if (str == null) {
            return str;
        }
        String str2 = "_";
        return str.contains(str2) ? str.replaceAll(str2, "-") : str;
    }

    /* renamed from: a */
    public static CustomInfo m21375a(CustomInfo customInfo, Bundle bundle) {
        if (customInfo == null) {
            CustomInfo customInfo2 = f16460d;
            if (customInfo2 == null) {
                customInfo = new CustomInfo();
            } else {
                customInfo = new CustomInfo(customInfo2);
            }
        }
        Field[] fields = customInfo.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(customInfo, obj);
                    } catch (Exception e) {
                        C3081g.m21027a((Throwable) e);
                        StringBuilder sb = new StringBuilder("Field ");
                        sb.append(str);
                        sb.append(" must be a ");
                        sb.append(field.getType().getName());
                        sb.append(", but give a ");
                        sb.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return customInfo;
    }

    /* renamed from: a */
    public static VersionInfo m21376a(Bundle bundle) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2 = f16461e;
        if (versionInfo2 == null) {
            versionInfo = new VersionInfo();
        } else {
            versionInfo = new VersionInfo(versionInfo2);
        }
        String string = bundle.getString("mVersion");
        if (!C3081g.m21032a(string)) {
            versionInfo.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!C3081g.m21032a(string2)) {
            versionInfo.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!C3081g.m21032a(string3)) {
            versionInfo.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!C3081g.m21032a(string4)) {
            ProGuard.f16227b = string4;
            m21374Y();
        }
        return versionInfo;
    }

    /* renamed from: a */
    private static boolean m21382a(String str, String str2) {
        if (str == str2) {
            return f16459c;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
