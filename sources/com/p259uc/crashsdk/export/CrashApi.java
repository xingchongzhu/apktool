package com.p259uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.p259uc.crashsdk.C3084b;
import com.p259uc.crashsdk.C3086d;
import com.p259uc.crashsdk.C3087e;
import com.p259uc.crashsdk.C3093g;
import com.p259uc.crashsdk.JNIBridge;
import com.p259uc.crashsdk.ProGuard;
import com.p259uc.crashsdk.p260a.C3075a;
import com.p259uc.crashsdk.p260a.C3078d;
import com.p259uc.crashsdk.p260a.C3081g;
import com.p259uc.crashsdk.p260a.C3082h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.uc.crashsdk.export.CrashApi */
/* compiled from: ProGuard */
public class CrashApi {

    /* renamed from: a */
    private static CrashApi f16447a = null;

    /* renamed from: c */
    private static boolean f16448c = true;

    /* renamed from: d */
    private static boolean f16449d = false;

    /* renamed from: b */
    private boolean f16450b = false;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z, boolean z2, boolean z3) {
        Context a = m21317a(context);
        m21323b(a);
        C3084b.f16348g = z2;
        C3084b.f16349h = z3;
        if (C3084b.m21110I()) {
            m21323b(a);
            m21319a(a, customInfo, versionInfo, iCrashClient);
            if (z) {
                m21318a();
            }
            if (C3084b.f16348g && C3087e.m21266d("libcrashsdk.so")) {
                C3084b.f16347f = true;
                m21322b();
            }
            return;
        }
        String str = "crashsdk";
        if (customInfo == null || versionInfo == null) {
            C3075a.m20981d(str, "VersionInfo and CustomInfo can not be null!");
            throw null;
        }
        C3093g.m21379a(customInfo);
        try {
            C3087e.m21225a(C3087e.m21263d(customInfo.mIsInternational), true);
            m21319a(a, customInfo, versionInfo, iCrashClient);
        } catch (Throwable th) {
            m21320a(th);
        }
        if (z) {
            try {
                m21318a();
            } catch (Throwable th2) {
                m21320a(th2);
            }
        }
        try {
            C3084b.m21111J();
            C3082h.m21056a();
            C3078d.m21000a();
            C3081g.m21050j();
        } catch (Throwable th3) {
            C3081g.m21027a(th3);
        }
        try {
            if (!C3084b.m21134a(a)) {
                C3075a.m20981d(str, "registerLifecycleCallbacks failed!");
            }
        } catch (Throwable th4) {
            C3081g.m21027a(th4);
        }
        try {
            ProGuard.m20972n();
            C3087e.m21311z();
        } catch (Throwable th5) {
            C3081g.m21027a(th5);
        }
        C3087e.m21182A();
        try {
            if (C3093g.m21401r() && C3084b.m21104C() && !this.f16450b) {
                C3087e.m21187F();
                this.f16450b = true;
            }
        } catch (Throwable th6) {
            C3081g.m21036b(th6);
        }
    }

    /* renamed from: a */
    private static void m21318a() {
        if (C3084b.f16332a) {
            C3075a.m20978b("Has enabled java log!");
            return;
        }
        C3087e.m21303r();
        C3087e.m21294n();
        C3084b.f16332a = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21322b() {
        /*
            java.lang.Object r0 = com.p259uc.crashsdk.C3084b.f16346e
            monitor-enter(r0)
            boolean r1 = com.p259uc.crashsdk.C3084b.f16348g     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            boolean r1 = com.p259uc.crashsdk.C3084b.f16347f     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x000c
            goto L_0x0029
        L_0x000c:
            boolean r1 = com.p259uc.crashsdk.C3084b.f16343b     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = "Has enabled native log!"
            com.p259uc.crashsdk.p260a.C3075a.m20978b(r1)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0017:
            m21324c()     // Catch:{ all -> 0x002b }
            com.p259uc.crashsdk.C3087e.m21184C()     // Catch:{ all -> 0x002b }
            r1 = 1
            com.p259uc.crashsdk.C3084b.f16343b = r1     // Catch:{ all -> 0x002b }
            r1 = 6
            com.p259uc.crashsdk.JNIBridge.cmd(r1)     // Catch:{ all -> 0x002b }
            com.p259uc.crashsdk.C3093g.m21387d()     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.export.CrashApi.m21322b():void");
    }

    /* renamed from: c */
    private static void m21324c() {
        if (!C3084b.f16345d) {
            C3093g.m21384b();
            JNIBridge.cmd(5);
            C3093g.m21385c();
            C3084b.f16345d = true;
        }
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z, boolean z2, boolean z3) {
        CrashApi crashApi;
        synchronized (CrashApi.class) {
            if (f16447a == null) {
                CrashApi crashApi2 = new CrashApi(context, customInfo, versionInfo, iCrashClient, z, z2, z3);
                f16447a = crashApi2;
            }
            crashApi = f16447a;
        }
        return crashApi;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z) {
        return createInstanceEx(context, str, z, null);
    }

    public static CrashApi getInstance() {
        return f16447a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str != null && str2 != null) {
            return ProGuard.m20955b(str, str2);
        }
        throw null;
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        Objects.requireNonNull(dumpFileInfo);
        String str = dumpFileInfo.mCategory;
        if (str != null) {
            String str2 = dumpFileInfo.mFileTobeDump;
            if (str2 != null) {
                int i = dumpFileInfo.mLogType;
                if ((1048849 & i) == 0) {
                    return 0;
                }
                return ProGuard.m20942a(str, str2, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, i, dumpFileInfo.mDeleteAfterDump);
            }
        }
        throw null;
    }

    public void addHeaderInfo(String str, String str2) {
        Objects.requireNonNull(str);
        ProGuard.m20951a(str, str2);
    }

    public boolean addStatInfo(String str, String str2) {
        if (m21321a("addStatInfo")) {
            return false;
        }
        if (C3081g.m21032a(str)) {
            throw null;
        } else if (str.length() <= 24) {
            if (str2 != null && str2.length() > 512) {
                str2 = str2.substring(0, 512);
            }
            return C3082h.m21068a(str, str2);
        } else {
            throw new IllegalArgumentException("key is too long!");
        }
    }

    public void crashSoLoaded() {
        if (!m21321a("crashSoLoaded")) {
            C3084b.f16347f = true;
            m21322b();
            synchronized (C3084b.f16346e) {
                if (C3084b.f16349h) {
                    if (C3084b.f16347f) {
                        if (!C3084b.f16344c) {
                            if (!C3084b.f16345d) {
                                m21324c();
                                C3093g.m21387d();
                            }
                            C3087e.m21308w();
                            C3084b.f16344c = true;
                        }
                    }
                }
            }
            ProGuard.m20972n();
            C3087e.m21291l();
        }
    }

    public int createCachedInfo(String str, int i, int i2) {
        Objects.requireNonNull(str);
        if (i <= 0) {
            throw new IllegalArgumentException("capacity must > 0!");
        } else if ((1048849 & i2) == 0) {
            return 0;
        } else {
            return ProGuard.m20940a(str, i, i2);
        }
    }

    public void disableLog(int i) {
        synchronized (C3084b.f16346e) {
            C3084b.m21140b(i);
            if (LogType.isForJava(i) && C3084b.f16332a) {
                C3087e.m21304s();
                C3084b.f16332a = false;
            }
            if (LogType.isForNative(i)) {
                if (C3084b.f16343b) {
                    JNIBridge.cmd(9);
                    C3084b.f16343b = false;
                } else {
                    C3084b.f16348g = false;
                }
            }
            if (LogType.isForANR(i)) {
                C3084b.m21132a(false);
            }
            if (LogType.isForUnexp(i)) {
                if (!C3084b.f16344c) {
                    C3084b.f16349h = false;
                } else if (C3087e.m21310y()) {
                    C3084b.f16344c = false;
                }
            }
        }
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
        StringBuilder sb;
        Objects.requireNonNull(customLogInfo);
        if (customLogInfo.mData != null) {
            String str = customLogInfo.mLogType;
            if (str != null) {
                if (!str.contains("_")) {
                    String str2 = " ";
                    if (!customLogInfo.mLogType.contains(str2)) {
                        ArrayList<Integer> arrayList = customLogInfo.mDumpTids;
                        String str3 = null;
                        if (arrayList == null || arrayList.size() <= 0) {
                            sb = null;
                        } else {
                            sb = new StringBuilder();
                            Iterator it = customLogInfo.mDumpTids.iterator();
                            while (it.hasNext()) {
                                sb.append(((Integer) it.next()).intValue());
                                sb.append(str2);
                            }
                        }
                        long j = 0;
                        if (customLogInfo.mAddHeader) {
                            j = 1;
                        }
                        if (customLogInfo.mAddFooter) {
                            j |= 2;
                        }
                        if (customLogInfo.mAddLogcat) {
                            j |= 4;
                        }
                        if (customLogInfo.mAddThreadsDump) {
                            j |= 8;
                        }
                        if (customLogInfo.mAddBuildId) {
                            j |= 16;
                        }
                        if (customLogInfo.mUploadNow) {
                            j |= 32;
                        }
                        long j2 = j;
                        StringBuffer stringBuffer = customLogInfo.mData;
                        String str4 = customLogInfo.mLogType;
                        ArrayList<String> arrayList2 = customLogInfo.mDumpFiles;
                        ArrayList<String> arrayList3 = customLogInfo.mCallbacks;
                        ArrayList<String> arrayList4 = customLogInfo.mCachedInfos;
                        if (sb != null) {
                            str3 = sb.toString();
                        }
                        return C3087e.m21237a(stringBuffer, str4, j2, arrayList2, arrayList3, arrayList4, str3);
                    }
                }
                throw new IllegalArgumentException("mLogType can not contain char '_' and ' '");
            }
        }
        throw new NullPointerException("mData or mLogType is null!");
    }

    public boolean generateTraces(String str, long j) {
        if (m21321a("generateTraces")) {
            return false;
        }
        if (!C3084b.f16345d) {
            C3075a.m20981d("crashsdk", "Crash so is not loaded!");
            return false;
        } else if (JNIBridge.nativeCmd(12, j, str, null) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public String getCrashLogUploadUrl() {
        if (m21321a("getCrashLogUploadUrl")) {
            return null;
        }
        return C3087e.m21288k();
    }

    public ParcelFileDescriptor getHostFd() {
        return C3087e.m21185D();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return C3087e.m21185D();
    }

    public int getLastExitType() {
        if (m21321a("getLastExitType")) {
            return 1;
        }
        return C3084b.m21107F();
    }

    public int getLastExitTypeEx() {
        if (m21321a("getLastExitTypeEx")) {
            return 1;
        }
        return C3084b.m21108G();
    }

    public Throwable getUncaughtException() {
        return C3087e.m21306u();
    }

    public int getUnexpReason() {
        if (m21321a("getUnexpReason")) {
            return 100;
        }
        return C3087e.m21307v();
    }

    public void onExit() {
        C3084b.m21163t();
    }

    public boolean registerCallback(int i, ValueCallback<Bundle> valueCallback) {
        Objects.requireNonNull(valueCallback);
        if (i == 1) {
            return C3086d.m21178a(valueCallback);
        }
        if (i == 2) {
            return C3086d.m21180c(valueCallback);
        }
        if (i == 3) {
            return C3086d.m21181d(valueCallback);
        }
        if (i == 4) {
            return C3086d.m21179b(valueCallback);
        }
        StringBuilder sb = new StringBuilder("Unknown event type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public int registerInfoCallback(String str, int i) {
        Objects.requireNonNull(str);
        if ((1048849 & i) == 0) {
            return 0;
        }
        return ProGuard.m20941a(str, i, null, 0, 0);
    }

    public int registerThread(int i, String str) {
        return ProGuard.m20939a(i, str);
    }

    public int reportCrashStats(boolean z) {
        if (m21321a("reportCrashStats")) {
            return 0;
        }
        return C3087e.m21241b(z, true);
    }

    public int resetCrashStats(boolean z) {
        if (m21321a("resetCrashStats")) {
            return 0;
        }
        return C3087e.m21268e(z);
    }

    public void setForeground(boolean z) {
        C3084b.m21142b(z);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C3087e.m21232a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C3087e.m21232a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (!m21321a("setNewInstall")) {
            C3084b.m21162s();
        }
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        Objects.requireNonNull(customInfo);
        return C3093g.m21383b(customInfo);
    }

    public boolean updateUnexpInfo() {
        if (m21321a("updateUnexpInfo")) {
            return false;
        }
        return ProGuard.m20954a(true);
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        Objects.requireNonNull(versionInfo);
        C3093g.m21381a(versionInfo);
    }

    public void uploadCrashLogs() {
        if (!m21321a("uploadCrashLogs")) {
            C3087e.m21238a(false, true);
        }
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z, Bundle bundle) {
        return createInstanceEx(context, str, z, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z, Bundle bundle, ICrashClient iCrashClient) {
        CrashApi crashApi = f16447a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        f16448c = bundle.getBoolean("useApplicationContext", true);
        Context a = m21317a(context);
        m21323b(a);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = true;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z;
        CustomInfo a2 = C3093g.m21375a(customInfo, bundle);
        VersionInfo a3 = C3093g.m21376a(bundle);
        boolean z2 = bundle.getBoolean("enableJavaLog", true);
        boolean z3 = bundle.getBoolean("enableNativeLog", true);
        boolean z4 = bundle.getBoolean("enableUnexpLog", C3084b.m21104C());
        boolean z5 = bundle.getBoolean("enableANRLog", true);
        CrashApi createInstance = createInstance(a, a2, a3, iCrashClient, z2, z3, z4);
        C3084b.m21132a(z5);
        if (z3 || z4) {
            if (C3087e.m21266d("libcrashsdk.so")) {
                createInstance.crashSoLoaded();
            } else {
                C3075a.m20981d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i >= 0 && C3084b.m21104C()) {
            C3087e.m21244b(i);
        }
        return createInstance;
    }

    public int registerInfoCallback(String str, int i, Callable<String> callable) {
        if (str == null || callable == null) {
            throw null;
        } else if ((1048849 & i) == 0) {
            return 0;
        } else {
            return ProGuard.m20941a(str, i, callable, 0, 0);
        }
    }

    public int updateCustomInfo(Bundle bundle) {
        Objects.requireNonNull(bundle);
        return updateCustomInfo(C3093g.m21375a((CustomInfo) null, bundle));
    }

    public void updateVersionInfo(Bundle bundle) {
        Objects.requireNonNull(bundle);
        updateVersionInfo(C3093g.m21376a(bundle));
    }

    /* renamed from: a */
    private static void m21319a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        C3086d.m21174a(iCrashClient);
        C3093g.m21380a(customInfo, versionInfo);
        if (!C3084b.m21110I()) {
            C3087e.m21296o();
            C3087e.m21219a(context);
            C3087e.m21245b(context);
        }
    }

    public int addDumpFile(String str, String str2, int i, Bundle bundle) {
        DumpFileInfo dumpFileInfo = new DumpFileInfo(str, str2, i);
        if (bundle != null) {
            dumpFileInfo.mIsEncrypted = bundle.getBoolean("mIsEncrypted", dumpFileInfo.mIsEncrypted);
            dumpFileInfo.mWriteCategory = bundle.getBoolean("mWriteCategory", dumpFileInfo.mWriteCategory);
            dumpFileInfo.mDeleteAfterDump = bundle.getBoolean("mDeleteAfterDump", dumpFileInfo.mDeleteAfterDump);
        }
        return addDumpFile(dumpFileInfo);
    }

    /* renamed from: a */
    private static Context m21317a(Context context) {
        String str = "crashsdk";
        if (context != null) {
            if (f16448c && !(context instanceof Application)) {
                context = context.getApplicationContext();
                if (context == null || !(context instanceof Application)) {
                    String str2 = "Can not get Application context from given context!";
                    C3075a.m20981d(str, str2);
                    throw new IllegalArgumentException(str2);
                }
            }
            return context;
        }
        C3075a.m20981d(str, "context can not be null!");
        throw null;
    }

    /* renamed from: b */
    private static void m21323b(Context context) {
        try {
            if (!f16449d) {
                C3081g.m21024a(context);
                ProGuard.f16226a = context.getPackageName();
                f16449d = true;
            }
        } catch (Throwable th) {
            m21320a(th);
        }
    }

    /* renamed from: a */
    private static void m21320a(Throwable th) {
        new C3087e().mo18728a(Thread.currentThread(), th, true);
    }

    public boolean generateCustomLog(StringBuffer stringBuffer, String str, Bundle bundle) {
        CustomLogInfo customLogInfo = new CustomLogInfo(stringBuffer, str);
        if (bundle != null) {
            customLogInfo.mAddHeader = bundle.getBoolean("mAddHeader", customLogInfo.mAddHeader);
            customLogInfo.mAddFooter = bundle.getBoolean("mAddFooter", customLogInfo.mAddFooter);
            customLogInfo.mAddLogcat = bundle.getBoolean("mAddLogcat", customLogInfo.mAddLogcat);
            customLogInfo.mUploadNow = bundle.getBoolean("mUploadNow", customLogInfo.mUploadNow);
            customLogInfo.mAddThreadsDump = bundle.getBoolean("mAddThreadsDump", customLogInfo.mAddThreadsDump);
            customLogInfo.mAddBuildId = bundle.getBoolean("mAddBuildId", customLogInfo.mAddBuildId);
            customLogInfo.mDumpFiles = bundle.getStringArrayList("mDumpFiles");
            customLogInfo.mCallbacks = bundle.getStringArrayList("mCallbacks");
            customLogInfo.mCachedInfos = bundle.getStringArrayList("mCachedInfos");
            customLogInfo.mDumpTids = bundle.getIntegerArrayList("mDumpTids");
        }
        return generateCustomLog(customLogInfo);
    }

    /* renamed from: a */
    private static boolean m21321a(String str) {
        if (!C3084b.m21110I()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Can not call '");
        sb.append(str);
        sb.append("' in isolated process!");
        C3075a.m20981d("crashsdk", sb.toString());
        return true;
    }
}
