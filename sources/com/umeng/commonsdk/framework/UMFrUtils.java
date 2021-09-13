package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.Iterator;
import java.util.List;

public class UMFrUtils {
    private static final String KEY_LAST_INSTANT_SUCC_BUILD_TIME = "last_instant_build_time";
    private static final String KEY_LAST_SUCC_BUILD_TIME = "last_successful_build_time";
    private static String mDefaultEnvelopeDir = "envelope";
    private static String mDefaultEnvelopeDirPath = null;
    private static Object mEnvelopeBuildTimeLock = new Object();
    private static Object mEnvelopeFileLock = new Object();
    private static String sCurrentProcessName = "";

    private static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", new Class[]{String.class}).invoke(context, new Object[]{str})).intValue() != 0) {
                    return false;
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(applicationContext, th);
                return false;
            }
        } else {
            try {
                if (applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName()) != 0) {
                    return false;
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(applicationContext, th2);
                return false;
            }
        }
        return true;
    }

    public static int envelopeFileNumber(Context context) {
        if (context != null) {
            try {
                File file = new File(getEnvelopeDirPath(context));
                synchronized (mEnvelopeFileLock) {
                    if (file.isDirectory()) {
                        String[] list = file.list();
                        if (list != null) {
                            int length = list.length;
                            return length;
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
        return 0;
    }

    public static String getCurrentProcessName(Context context) {
        if (TextUtils.isEmpty(sCurrentProcessName)) {
            try {
                int myPid = Process.myPid();
                String processName = getProcessName(myPid);
                if (!TextUtils.isEmpty(processName)) {
                    sCurrentProcessName = processName;
                } else {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager != null) {
                        List runningAppProcesses = activityManager.getRunningAppProcesses();
                        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
                            Iterator it = runningAppProcesses.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                                if (runningAppProcessInfo.pid == myPid) {
                                    sCurrentProcessName = runningAppProcessInfo.processName;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context.getApplicationContext(), th);
            }
        }
        return sCurrentProcessName;
    }

    private static long getDistanceDays(long j, long j2) {
        return (j < j2 ? j2 - j : j - j2) / 86400000;
    }

    public static String getEnvelopeDirPath(Context context) {
        String str;
        synchronized (mEnvelopeFileLock) {
            try {
                if (mDefaultEnvelopeDirPath == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getFilesDir().getAbsolutePath());
                    sb.append(File.separator);
                    sb.append(".");
                    sb.append(mDefaultEnvelopeDir);
                    mDefaultEnvelopeDirPath = sb.toString();
                }
                File file = new File(mDefaultEnvelopeDirPath);
                if (!file.exists() && !file.mkdir()) {
                    ULog.m22467d("--->>> Create Envelope Directory failed!!!");
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
            str = mDefaultEnvelopeDirPath;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File getEnvelopeFile(android.content.Context r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = getEnvelopeDirPath(r3)
            r1.<init>(r3)
            java.lang.Object r3 = mEnvelopeFileLock
            monitor-enter(r3)
            java.io.File[] r1 = r1.listFiles()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027
            int r2 = r1.length     // Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x001a
            goto L_0x0027
        L_0x001a:
            com.umeng.commonsdk.framework.UMFrUtils$2 r0 = new com.umeng.commonsdk.framework.UMFrUtils$2     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
            java.util.Arrays.sort(r1, r0)     // Catch:{ all -> 0x0029 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0027:
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.getEnvelopeFile(android.content.Context):java.io.File");
    }

    public static long getLastInstantBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, 0);
        }
        return j;
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_SUCC_BUILD_TIME, 0);
        }
        return j;
    }

    public static String getLegacyEnvelopeDir(Context context) {
        try {
            String processName = getProcessName(Process.myPid());
            String str = "--->>> getEnvelopeDir: use current process name as envelope directory.";
            if (!TextUtils.isEmpty(processName)) {
                String replace = processName.replace(':', '_');
                ULog.m22467d(str);
                return replace;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    ULog.m22467d("--->>> getEnvelopeDir: can't get process name, use default envelope directory.");
                    return mDefaultEnvelopeDir;
                } else if (runningAppProcesses.size() == 0) {
                    return mDefaultEnvelopeDir;
                } else {
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == Process.myPid()) {
                            String replace2 = runningAppProcessInfo.processName.replace(':', '_');
                            ULog.m22467d(str);
                            return replace2;
                        }
                    }
                }
            }
            return mDefaultEnvelopeDir;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC, Splitter:B:15:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getProcessName(int r5) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0033 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0033 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0033 }
            r3.<init>()     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch:{ all -> 0x0033 }
            r3.append(r5)     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = "/cmdline"
            r3.append(r5)     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0033 }
            r2.<init>(r5)     // Catch:{ all -> 0x0033 }
            r1.<init>(r2)     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r1.readLine()     // Catch:{ all -> 0x0034 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002f
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0034 }
        L_0x002f:
            r1.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            return r5
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.getProcessName(int):java.lang.String");
    }

    public static String getSubProcessName(Context context) {
        String str = "";
        try {
            String currentProcessName = getCurrentProcessName(context);
            int indexOf = currentProcessName.indexOf(":");
            if (indexOf >= 0) {
                str = currentProcessName.substring(indexOf + 1);
            }
            if (indexOf < 0) {
                String packageName = context.getPackageName();
                if (currentProcessName.length() > packageName.length()) {
                    return currentProcessName.substring(packageName.length() + 1, currentProcessName.length());
                }
                return currentProcessName;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean hasEnvelopeFile(android.content.Context r6, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r7) {
        /*
            java.lang.String r0 = "a"
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r1 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            if (r7 != r1) goto L_0x0008
            java.lang.String r0 = "i"
        L_0x0008:
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r1 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_ZeroEnv
            if (r7 != r1) goto L_0x000e
            java.lang.String r0 = "z"
        L_0x000e:
            java.lang.String r7 = getEnvelopeDirPath(r6)
            r1 = 0
            if (r7 == 0) goto L_0x0048
            java.io.File r2 = new java.io.File
            r2.<init>(r7)
            java.lang.Object r7 = mEnvelopeFileLock
            monitor-enter(r7)
            java.io.File[] r2 = r2.listFiles()     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003d
            int r3 = r2.length     // Catch:{ all -> 0x003f }
            if (r3 != 0) goto L_0x0027
            goto L_0x003d
        L_0x0027:
            int r3 = r2.length     // Catch:{ all -> 0x003f }
            r4 = 0
        L_0x0029:
            if (r4 >= r3) goto L_0x0043
            r5 = r2[r4]     // Catch:{ all -> 0x003f }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x003f }
            boolean r5 = r5.startsWith(r0)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x003a
            monitor-exit(r7)     // Catch:{ all -> 0x0045 }
            r6 = 1
            return r6
        L_0x003a:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x003d:
            monitor-exit(r7)     // Catch:{ all -> 0x0045 }
            return r1
        L_0x003f:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r0)     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r7)     // Catch:{ all -> 0x0045 }
            return r1
        L_0x0045:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0045 }
            throw r6
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(android.content.Context, com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType):boolean");
    }

    public static boolean isOnline(Context context) {
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnectedOrConnecting();
                    }
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
        }
        return false;
    }

    public static boolean removeEnvelopeFile(File file) {
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            if (file != null) {
                try {
                    if (file.exists()) {
                        boolean delete = file.delete();
                        return delete;
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void removeRedundantEnvelopeFiles(android.content.Context r5, int r6) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = getEnvelopeDirPath(r5)
            r0.<init>(r1)
            java.lang.Object r1 = mEnvelopeFileLock
            monitor-enter(r1)
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0050
            int r2 = r0.length     // Catch:{ all -> 0x0052 }
            if (r2 > r6) goto L_0x0016
            goto L_0x0050
        L_0x0016:
            com.umeng.commonsdk.framework.UMFrUtils$1 r2 = new com.umeng.commonsdk.framework.UMFrUtils$1     // Catch:{ all -> 0x0052 }
            r2.<init>()     // Catch:{ all -> 0x0052 }
            java.util.Arrays.sort(r0, r2)     // Catch:{ all -> 0x0052 }
            int r2 = r0.length     // Catch:{ all -> 0x0052 }
            if (r2 <= r6) goto L_0x004e
            r2 = 0
        L_0x0022:
            int r3 = r0.length     // Catch:{ all -> 0x004a }
            int r3 = r3 - r6
            if (r2 >= r3) goto L_0x004e
            r3 = r0[r2]     // Catch:{ all -> 0x004a }
            boolean r3 = r3.delete()     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0047
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r3.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "--->>> remove ["
            r3.append(r4)     // Catch:{ all -> 0x004a }
            r3.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "] file fail."
            r3.append(r4)     // Catch:{ all -> 0x004a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004a }
            com.umeng.commonsdk.statistics.common.ULog.m22467d(r3)     // Catch:{ all -> 0x004a }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x004a:
            r6 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch:{ all -> 0x0052 }
        L_0x004e:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            return
        L_0x0050:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0055:
            throw r5
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.removeRedundantEnvelopeFiles(android.content.Context, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[SYNTHETIC, Splitter:B:28:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[SYNTHETIC, Splitter:B:36:0x0068] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int saveEnvelopeFile(android.content.Context r5, java.lang.String r6, byte[] r7) {
        /*
            r0 = 101(0x65, float:1.42E-43)
            if (r7 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = getEnvelopeDirPath(r5)
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.Object r2 = mEnvelopeFileLock
            monitor-enter(r2)
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0056 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0056 }
            r4.write(r7)     // Catch:{ IOException -> 0x0051, all -> 0x004e }
            r4.close()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
            com.umeng.commonsdk.statistics.internal.a r7 = com.umeng.commonsdk.statistics.internal.HeaderHelper.m22599a(r5)     // Catch:{ all -> 0x0071 }
            boolean r7 = r7.mo19395a(r6)     // Catch:{ all -> 0x0071 }
            com.umeng.commonsdk.statistics.internal.a r0 = com.umeng.commonsdk.statistics.internal.HeaderHelper.m22599a(r5)     // Catch:{ all -> 0x0071 }
            boolean r6 = r0.mo19397b(r6)     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x0046
            updateLastSuccessfulBuildTime(r5)     // Catch:{ all -> 0x0071 }
        L_0x0046:
            if (r6 == 0) goto L_0x004b
            updateLastInstantBuildTime(r5)     // Catch:{ all -> 0x0071 }
        L_0x004b:
            r5 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            return r5
        L_0x004e:
            r6 = move-exception
            r3 = r4
            goto L_0x0066
        L_0x0051:
            r6 = move-exception
            r3 = r4
            goto L_0x0057
        L_0x0054:
            r6 = move-exception
            goto L_0x0066
        L_0x0056:
            r6 = move-exception
        L_0x0057:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0064
            r3.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r6 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch:{ all -> 0x0071 }
        L_0x0064:
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            return r0
        L_0x0066:
            if (r3 == 0) goto L_0x0070
            r3.close()     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r7)     // Catch:{ all -> 0x0071 }
        L_0x0070:
            throw r6     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.saveEnvelopeFile(android.content.Context, java.lang.String, byte[]):int");
    }

    public static void syncLegacyEnvelopeIfNeeded(Context context) {
        if (context != null) {
            try {
                String legacyEnvelopeDir = getLegacyEnvelopeDir(context);
                if (!TextUtils.isEmpty(legacyEnvelopeDir) && !legacyEnvelopeDir.equals(mDefaultEnvelopeDir)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getFilesDir().getAbsolutePath());
                    sb.append("/.");
                    sb.append(legacyEnvelopeDir);
                    File file = new File(sb.toString());
                    if (file.exists()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles == null || listFiles.length == 0) {
                            try {
                                if (file.isDirectory()) {
                                    file.delete();
                                }
                            } catch (Throwable th) {
                                UMCrashManager.reportCrash(context, th);
                            }
                            return;
                        }
                        String envelopeDirPath = getEnvelopeDirPath(context);
                        for (int i = 0; i < listFiles.length; i++) {
                            File file2 = listFiles[i];
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(envelopeDirPath);
                            sb2.append(File.separator);
                            sb2.append(listFiles[i].getName());
                            file2.renameTo(new File(sb2.toString()));
                        }
                        if (file.isDirectory()) {
                            file.delete();
                        }
                    }
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(context, th2);
            }
        }
    }

    public static byte[] toByteArray(String str) throws IOException {
        byte[] bArr;
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            FileChannel fileChannel = null;
            try {
                FileChannel channel = new RandomAccessFile(str, "r").getChannel();
                MappedByteBuffer load = channel.map(MapMode.READ_ONLY, 0, channel.size()).load();
                bArr = new byte[((int) channel.size())];
                if (load.remaining() > 0) {
                    load.get(bArr, 0, load.remaining());
                }
                channel.close();
            } catch (IOException e) {
                UMCrashManager.reportCrash(appContext, e);
                throw e;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(appContext, th);
            }
        }
        return bArr;
        throw th;
    }

    private static void updateLastInstantBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }

    private static void updateLastSuccessfulBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }
}
