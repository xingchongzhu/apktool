package com.umeng.umcrash;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.p259uc.crashsdk.export.CrashApi;
import com.p259uc.crashsdk.export.CustomLogInfo;
import com.p259uc.crashsdk.export.ICrashClient;
import com.p259uc.crashsdk.export.LogType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class UMCrash {
    public static final String KEY_APM_DEFAULT_SECRET = "NEej8y@anWa*8hep";
    public static final String KEY_APM_ROOT_NAME = "UApm";
    public static final String KEY_CALLBACK_PAGE_ACTION = "um_action_log";
    public static final String KEY_CALLBACK_UMID = "um_umid";
    private static final String KEY_CALLBACK_USER_STRING = "um_user_string";
    public static final String KEY_HEADER_APPKEY = "um_app_key";
    public static final String KEY_HEADER_CARRIER = "um_app_carrier";
    public static final String KEY_HEADER_CHANNEL = "um_app_channel";
    public static final String KEY_HEADER_CRASH_VERSION = "um_crash_sdk_version";
    public static final String KEY_HEADER_OS = "um_os";
    public static final String KEY_HEADER_PROVIDER = "um_app_provider";
    public static final String KEY_HEADER_PUID = "um_app_puid";
    public static final String KEY_HEADER_START_TIME = "um_app_start_time";
    public static final String KEY_HEADER_UMID = "um_umid_header";
    private static final int KEY_MAX_LENGTH = 256;
    /* access modifiers changed from: private */
    public static final String TAG = "UMCrash";
    private static String crashSdkVersion = "1.2.0";
    private static boolean enableANRLog = true;
    private static boolean enableNativeLog = true;
    private static boolean enableUnexpLog = false;
    /* access modifiers changed from: private */
    public static boolean isDebug = true;
    private static boolean isEncrypt = false;
    private static boolean isIntl = false;
    private static boolean isPA = false;
    private static boolean isZip = true;
    /* access modifiers changed from: private */
    public static ArrayList<String> mArrayList = new ArrayList<>(10);
    /* access modifiers changed from: private */
    public static Context mContext;
    /* access modifiers changed from: private */
    public static UMCrashCallback mUMCrashCallback;
    /* access modifiers changed from: private */
    public static Object pageArrayLock = new Object();
    public static EfsReporter sReporter;

    private static class CrashClientImpl implements ICrashClient {
        private CrashClientImpl() {
        }

        public void onAddCrashStats(String str, int i, int i2) {
        }

        public File onBeforeUploadLog(File file) {
            return file;
        }

        public void onClientProcessLogGenerated(String str, File file, String str2) {
        }

        public void onCrashRestarting(boolean z) {
        }

        public String onGetCallbackInfo(String str, boolean z) {
            String str2 = null;
            if (UMCrash.KEY_CALLBACK_PAGE_ACTION.equals(str)) {
                try {
                    synchronized (UMCrash.pageArrayLock) {
                        if (UMCrash.mArrayList != null && UMCrash.mArrayList.size() > 0) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("source", 0);
                            jSONObject.put("action_name", "page_view");
                            JSONArray jSONArray = new JSONArray();
                            for (int i = 0; i < UMCrash.mArrayList.size(); i++) {
                                String str3 = (String) UMCrash.mArrayList.get(i);
                                if (str3 != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("name", str3);
                                    jSONArray.put(jSONObject2);
                                }
                            }
                            jSONObject.put("action_parameter", jSONArray);
                            str2 = jSONObject.toString();
                            if (UMCrash.isDebug) {
                                String access$300 = UMCrash.TAG;
                                StringBuilder sb = new StringBuilder();
                                sb.append("page json is ");
                                sb.append(str2);
                                Log.i(access$300, sb.toString());
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                return str2;
            } else if (UMCrash.KEY_CALLBACK_UMID.equals(str)) {
                return UMCrash.getUMID(UMCrash.mContext);
            } else {
                if (!UMCrash.KEY_CALLBACK_USER_STRING.equals(str) || UMCrash.mUMCrashCallback == null) {
                    return null;
                }
                String onCallback = UMCrash.mUMCrashCallback.onCallback();
                if (onCallback == null) {
                    return null;
                }
                if (onCallback.trim().getBytes().length > 256) {
                    onCallback = UMCrashUtils.splitByByte(onCallback, 256);
                }
                return onCallback;
            }
        }

        public void onLogGenerated(File file, String str) {
        }
    }

    public static void enableANRLog(boolean z) {
        enableANRLog = z;
    }

    public static void enableNativeLog(boolean z) {
        enableNativeLog = z;
    }

    public static void enableUnexpLog(boolean z) {
        enableUnexpLog = z;
    }

    public static void generateCustomLog(Throwable th, String str) {
        if (th == null || TextUtils.isEmpty(str)) {
            Log.e(TAG, "generate custom log failed ! e is null or type is empty");
            return;
        }
        try {
            CustomLogInfo build = new UMCustomLogInfoBuilder(str).stack(th).build();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(KEY_CALLBACK_UMID);
            arrayList.add(KEY_CALLBACK_PAGE_ACTION);
            build.mCallbacks = arrayList;
            CrashApi instance = CrashApi.getInstance();
            if (instance == null) {
                Log.e(TAG, "CrashApi is null, not init .");
            } else {
                instance.generateCustomLog(build);
            }
        } catch (Throwable unused) {
        }
    }

    public static String getUMAPMFlag() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 0);
            jSONObject.put("crash", 1);
            String str = "crashNative";
            if (enableNativeLog) {
                jSONObject.put(str, 1);
            } else {
                jSONObject.put(str, 0);
            }
            boolean z = enableANRLog;
            String str2 = LogType.ANR_TYPE;
            if (z) {
                jSONObject.put(str2, 1);
            } else {
                jSONObject.put(str2, 0);
            }
            String str3 = "pa";
            if (isPA) {
                jSONObject.put(str3, 1);
            } else {
                jSONObject.put(str3, 0);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String getUMID(android.content.Context r8) {
        /*
            java.lang.Class<com.umeng.umcrash.UMCrash> r0 = com.umeng.umcrash.UMCrash.class
            monitor-enter(r0)
            r1 = 0
            if (r8 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            java.lang.String r2 = "com.umeng.commonsdk.UMConfigure"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0011, all -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r8 = move-exception
            goto L_0x0036
        L_0x0011:
            r2 = r1
        L_0x0012:
            if (r2 == 0) goto L_0x0038
            r3 = 0
            r4 = 1
            java.lang.String r5 = "getUMIDString"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0023, all -> 0x000f }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ NoSuchMethodException -> 0x0023, all -> 0x000f }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0023, all -> 0x000f }
            goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            if (r2 == 0) goto L_0x0038
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0038, all -> 0x000f }
            r4[r3] = r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0038, all -> 0x000f }
            java.lang.Object r8 = r2.invoke(r1, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0038, all -> 0x000f }
            if (r8 == 0) goto L_0x0038
            java.lang.String r8 = r8.toString()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0038, all -> 0x000f }
            r1 = r8
            goto L_0x0038
        L_0x0036:
            monitor-exit(r0)
            throw r8
        L_0x0038:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umcrash.UMCrash.getUMID(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|(6:7|8|9|(1:13)|16|(1:18)(1:19))(1:20)|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r9.addHeaderInfo(r2, r1);
        r9.addHeaderInfo(r0, r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x008c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00c5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(android.content.Context r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "um_app_provider"
            java.lang.String r1 = ""
            java.lang.String r2 = "um_app_puid"
            java.lang.String r3 = "android"
            java.lang.String r4 = "um_os"
            java.lang.String r5 = "um_app_carrier"
            java.lang.String r6 = "um_app_channel"
            java.lang.String r7 = "um_umid_header"
            if (r13 == 0) goto L_0x0133
            if (r14 != 0) goto L_0x0016
            goto L_0x0133
        L_0x0016:
            mContext = r13
            r8 = 1
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r9.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "mDebug"
            boolean r11 = isDebug     // Catch:{ all -> 0x00c5 }
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "mEncryptLog"
            boolean r11 = isEncrypt     // Catch:{ all -> 0x00c5 }
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "mZipLog"
            boolean r11 = isZip     // Catch:{ all -> 0x00c5 }
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "enableNativeLog"
            boolean r11 = enableNativeLog     // Catch:{ all -> 0x00c5 }
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "enableANRLog"
            boolean r11 = enableANRLog     // Catch:{ all -> 0x00c5 }
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "enableUnexpLog"
            boolean r11 = enableUnexpLog     // Catch:{ all -> 0x00c5 }
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "mIsInternational"
            boolean r11 = isIntl     // Catch:{ all -> 0x00c5 }
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x00c5 }
            boolean r10 = isDebug     // Catch:{ all -> 0x00c5 }
            com.umeng.umcrash.UMCrash$CrashClientImpl r11 = new com.umeng.umcrash.UMCrash$CrashClientImpl     // Catch:{ all -> 0x00c5 }
            r12 = 0
            r11.<init>()     // Catch:{ all -> 0x00c5 }
            com.uc.crashsdk.export.CrashApi r9 = com.p259uc.crashsdk.export.CrashApi.createInstanceEx(r13, r14, r10, r9, r11)     // Catch:{ all -> 0x00c5 }
            if (r9 == 0) goto L_0x00be
            java.lang.String r10 = "um_app_key"
            r9.addHeaderInfo(r10, r14)     // Catch:{ all -> 0x00c5 }
            r9.addHeaderInfo(r6, r15)     // Catch:{ all -> 0x00c5 }
            r9.addHeaderInfo(r4, r3)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "um_crash_sdk_version"
            java.lang.String r11 = crashSdkVersion     // Catch:{ all -> 0x00c5 }
            r9.addHeaderInfo(r10, r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = getUMID(r13)     // Catch:{ all -> 0x00c5 }
            r9.addHeaderInfo(r7, r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String[] r10 = com.umeng.umcrash.UMCrashUtils.getActiveUser(r13)     // Catch:{ all -> 0x008c }
            if (r10 == 0) goto L_0x0092
            int r11 = r10.length     // Catch:{ all -> 0x008c }
            r12 = 2
            if (r11 != r12) goto L_0x0092
            r11 = 0
            r11 = r10[r11]     // Catch:{ all -> 0x008c }
            r9.addHeaderInfo(r2, r11)     // Catch:{ all -> 0x008c }
            r10 = r10[r8]     // Catch:{ all -> 0x008c }
            r9.addHeaderInfo(r0, r10)     // Catch:{ all -> 0x008c }
            goto L_0x0092
        L_0x008c:
            r9.addHeaderInfo(r2, r1)     // Catch:{ all -> 0x00c5 }
            r9.addHeaderInfo(r0, r1)     // Catch:{ all -> 0x00c5 }
        L_0x0092:
            java.lang.String r0 = com.umeng.umcrash.UMCrashUtils.getNetworkOperatorName(r13)     // Catch:{ all -> 0x00c5 }
            r9.addHeaderInfo(r5, r0)     // Catch:{ all -> 0x00c5 }
            boolean r0 = r13 instanceof android.app.Application     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00b6
            r0 = r13
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x00c5 }
            com.umeng.umcrash.UMCrash$1 r1 = new com.umeng.umcrash.UMCrash$1     // Catch:{ all -> 0x00c5 }
            r1.<init>()     // Catch:{ all -> 0x00c5 }
            r0.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x00c5 }
            r0 = 1048593(0x100011, float:1.469392E-39)
            java.lang.String r1 = "um_umid"
            r9.registerInfoCallback(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "um_action_log"
            r9.registerInfoCallback(r1, r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c5
        L_0x00b6:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "context not instanceof application."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c5
        L_0x00be:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "create CrashAPI is null."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0132 }
            r0.<init>(r8)     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = getUMID(r13)     // Catch:{ all -> 0x0132 }
            r0.put(r7, r1)     // Catch:{ all -> 0x0132 }
            r0.put(r6, r15)     // Catch:{ all -> 0x0132 }
            java.lang.String r15 = com.umeng.umcrash.UMCrashUtils.getNetworkOperatorName(r13)     // Catch:{ all -> 0x0132 }
            r0.put(r5, r15)     // Catch:{ all -> 0x0132 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0132 }
            com.efs.sdk.base.EfsReporter$Builder r15 = new com.efs.sdk.base.EfsReporter$Builder     // Catch:{ all -> 0x0132 }
            android.content.Context r1 = r13.getApplicationContext()     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = "NEej8y@anWa*8hep"
            r15.<init>(r1, r14, r2)     // Catch:{ all -> 0x0132 }
            boolean r14 = isDebug     // Catch:{ all -> 0x0132 }
            com.efs.sdk.base.EfsReporter$Builder r14 = r15.debug(r14)     // Catch:{ all -> 0x0132 }
            java.lang.String r15 = "UApm"
            com.efs.sdk.base.EfsReporter$Builder r14 = r14.efsDirRootName(r15)     // Catch:{ all -> 0x0132 }
            boolean r15 = isDebug     // Catch:{ all -> 0x0132 }
            com.efs.sdk.base.EfsReporter$Builder r14 = r14.printLogDetail(r15)     // Catch:{ all -> 0x0132 }
            boolean r15 = isIntl     // Catch:{ all -> 0x0132 }
            com.efs.sdk.base.EfsReporter$Builder r14 = r14.intl(r15)     // Catch:{ all -> 0x0132 }
            com.efs.sdk.base.EfsReporter r14 = r14.build()     // Catch:{ all -> 0x0132 }
            sReporter = r14     // Catch:{ all -> 0x0132 }
            r14.addPublicParams(r0)     // Catch:{ all -> 0x0132 }
            com.efs.sdk.pa.PAFactory$Builder r14 = new com.efs.sdk.pa.PAFactory$Builder     // Catch:{ all -> 0x0132 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ all -> 0x0132 }
            com.umeng.umcrash.UMCrash$2 r15 = new com.umeng.umcrash.UMCrash$2     // Catch:{ all -> 0x0132 }
            r15.<init>()     // Catch:{ all -> 0x0132 }
            r14.<init>(r13, r15)     // Catch:{ all -> 0x0132 }
            com.efs.sdk.pa.config.PackageLevel r13 = com.efs.sdk.p192pa.config.PackageLevel.RELEASE     // Catch:{ all -> 0x0132 }
            r14.packageLevel(r13)     // Catch:{ all -> 0x0132 }
            com.efs.sdk.pa.PAFactory r13 = r14.build()     // Catch:{ all -> 0x0132 }
            com.efs.sdk.pa.PA r14 = r13.getPaInstance()     // Catch:{ all -> 0x0132 }
            r14.start()     // Catch:{ all -> 0x0132 }
            com.efs.sdk.pa.config.ConfigManager r13 = r13.getConfigManager()     // Catch:{ all -> 0x0132 }
            boolean r13 = r13.enableTracer()     // Catch:{ all -> 0x0132 }
            isPA = r13     // Catch:{ all -> 0x0132 }
        L_0x0132:
            return
        L_0x0133:
            java.lang.String r13 = TAG
            java.lang.String r14 = "context is null or appkey is null, init failed."
            android.util.Log.e(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umcrash.UMCrash.init(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void registerUMCrashCallback(UMCrashCallback uMCrashCallback) {
        if (uMCrashCallback != null) {
            mUMCrashCallback = uMCrashCallback;
            if (CrashApi.getInstance() != null) {
                CrashApi.getInstance().registerInfoCallback(KEY_CALLBACK_USER_STRING, 1048593);
            } else {
                Log.e(TAG, "callback error, instance is null.");
            }
        } else {
            Log.e(TAG, "callback error.");
        }
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    private static void useIntlServices(boolean z) {
        isIntl = z;
        if (isDebug) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("useIntlServices is ");
            sb.append(isIntl);
            Log.i(str, sb.toString());
        }
    }

    public static void generateCustomLog(String str, String str2) {
        String str3;
        String str4 = "exception";
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "generate custom log failed ! e is null or type is empty");
            return;
        }
        try {
            CustomLogInfo customLogInfo = new CustomLogInfo(null, str4);
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(KEY_CALLBACK_UMID);
            arrayList.add(KEY_CALLBACK_PAGE_ACTION);
            customLogInfo.mCallbacks = arrayList;
            HashMap hashMap = new HashMap(20);
            hashMap.put(UMCustomLogInfoBuilder.LOG_KEY_CT, str4);
            hashMap.put(UMCustomLogInfoBuilder.LOG_KEY_AC, str2);
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                str3 = "\n";
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                stringBuffer.append((String) entry.getKey());
                stringBuffer.append(":");
                stringBuffer.append((String) entry.getValue());
                stringBuffer.append(str3);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Exception message:\nBack traces starts.\n");
            sb.append(str);
            sb.append(str3);
            sb.append("Back traces ends.");
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                stringBuffer.append(sb2);
                stringBuffer.append(str3);
            }
            customLogInfo.mData = stringBuffer;
            CrashApi instance = CrashApi.getInstance();
            if (instance == null) {
                Log.e(TAG, "CrashApi is null, not init .");
            } else {
                instance.generateCustomLog(customLogInfo);
            }
        } catch (Throwable unused) {
        }
    }
}
