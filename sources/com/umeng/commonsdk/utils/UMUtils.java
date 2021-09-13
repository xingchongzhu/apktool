package com.umeng.commonsdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.UMInternalData;
import com.umeng.commonsdk.internal.UMInternalDataProtocol;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.EnvelopeManager;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.OaidTracking;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

public class UMUtils {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_APP_KEY = "appkey";
    private static final String KEY_CHANNEL = "channel";
    private static final String KEY_LAST_APP_KEY = "last_appkey";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_SESSION_ID = "session_id";
    private static final String KEY_SHARED_PREFERENCES_NAME = "umeng_common_config";
    public static final String MOBILE_NETWORK = "2G/3G";
    private static final String SD_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final String SP_FILE_NAME = "um_session_id";
    private static final String TAG = "UMUtils";
    public static final String UNKNOW = "";
    public static String VALUE_ABTEST_VERSION = null;
    public static String VALUE_ANALYTICS_VERSION = null;
    public static String VALUE_APM_VERSION = null;
    public static String VALUE_ASMS_VERSION = null;
    public static String VALUE_GAME_VERSION = null;
    public static String VALUE_LINK_VERSION = null;
    public static String VALUE_PUSH_VERSION = null;
    public static String VALUE_REC_VERSION_NAME = null;
    public static String VALUE_SHARE_VERSION = null;
    public static String VALUE_SMS_VERSION = null;
    public static String VALUE_VERIFY_VERSION = null;
    public static String VALUE_VISUAL_VERSION = null;
    public static final String WIFI = "Wi-Fi";
    private static final Pattern pattern = Pattern.compile("UTDID\">([^<]+)");
    private static Object spLock = new Object();

    static {
        String str = "";
        VALUE_ANALYTICS_VERSION = str;
        VALUE_GAME_VERSION = str;
        VALUE_PUSH_VERSION = str;
        VALUE_SHARE_VERSION = str;
        VALUE_APM_VERSION = str;
        VALUE_VERIFY_VERSION = str;
        VALUE_SMS_VERSION = str;
        VALUE_REC_VERSION_NAME = str;
        VALUE_VISUAL_VERSION = str;
        VALUE_ASMS_VERSION = str;
        VALUE_LINK_VERSION = str;
        VALUE_ABTEST_VERSION = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        return r10.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append(r0);
        r3.append(r10);
        android.util.Log.e(r1, r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042 A[ExcHandler: all (r10v4 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:3:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String MD5(java.lang.String r10) {
        /*
            java.lang.String r0 = "MD5 e is "
            java.lang.String r1 = "UMUtils"
            r2 = 0
            if (r10 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r3 = r10.getBytes()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r4.reset()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r4.update(r3)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            byte[] r3 = r4.digest()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r4.<init>()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r5 = 0
            r6 = 0
        L_0x0023:
            int r7 = r3.length     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            if (r6 >= r7) goto L_0x003d
            java.lang.String r7 = "%02X"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            byte r9 = r3[r6]     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r8[r5] = r9     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r4.append(r7)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            int r6 = r6 + 1
            goto L_0x0023
        L_0x003d:
            java.lang.String r10 = r4.toString()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            return r10
        L_0x0042:
            r10 = move-exception
            goto L_0x004d
        L_0x0044:
            java.lang.String r3 = "[^[a-z][A-Z][0-9][.][_]]"
            java.lang.String r4 = ""
            java.lang.String r10 = r10.replaceAll(r3, r4)     // Catch:{ Exception -> 0x0064, all -> 0x0042 }
            return r10
        L_0x004d:
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r3 == 0) goto L_0x0063
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            android.util.Log.e(r1, r10)
        L_0x0063:
            return r2
        L_0x0064:
            r10 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r3 == 0) goto L_0x007b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            android.util.Log.e(r1, r10)
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.MD5(java.lang.String):java.lang.String");
    }

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0");
                sb2.append(hexString);
                hexString = sb2.toString();
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    private static String bytes2Hex(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("0");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(hexString);
            str = sb2.toString();
        }
        return str;
    }

    public static boolean checkAndroidManifest(Context context, String str) {
        try {
            context.getApplicationContext().getPackageManager().getActivityInfo(new ComponentName(context.getApplicationContext().getPackageName(), str), 0);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkIntentFilterData(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            StringBuilder sb = new StringBuilder();
            sb.append("tencent");
            sb.append(str);
            sb.append(":");
            intent.setData(Uri.parse(sb.toString()));
            List<ResolveInfo> queryIntentActivities = context.getApplicationContext().getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities.size() > 0) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null && activityInfo.packageName.equals(context.getApplicationContext().getPackageName())) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean checkMetaData(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData.get(str) == null)) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean checkPath(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r6.getPackageManager().checkPermission(r7, r6.getPackageName()) == 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (((java.lang.Integer) java.lang.Class.forName("android.content.Context").getMethod("checkSelfPermission", new java.lang.Class[]{java.lang.String.class}).invoke(r6, new java.lang.Object[]{r7})).intValue() == 0) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkPermission(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L_0x0033
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x002e }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ Exception -> 0x002e }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Exception -> 0x002e }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x002e }
            r2[r0] = r7     // Catch:{ Exception -> 0x002e }
            java.lang.Object r7 = r1.invoke(r6, r2)     // Catch:{ Exception -> 0x002e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x002e }
            int r6 = r7.intValue()     // Catch:{ Exception -> 0x002e }
            if (r6 != 0) goto L_0x0042
            goto L_0x0041
        L_0x002e:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)
            goto L_0x0042
        L_0x0033:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L_0x0042
        L_0x0041:
            r0 = 1
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static boolean checkResource(Context context, String str, String str2) {
        try {
            if (context.getApplicationContext().getResources().getIdentifier(str, str2, context.getApplicationContext().getPackageName()) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append(r0);
        r3.append(r4);
        android.util.Log.e(r1, r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append(r0);
        r3.append(r4);
        android.util.Log.e(r1, r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[ExcHandler: all (r4v3 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encryptBySHA1(java.lang.String r4) {
        /*
            java.lang.String r0 = "encrypt by SHA1 e is "
            java.lang.String r1 = "UMUtils"
            r2 = 0
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0034, all -> 0x001c }
            java.lang.String r3 = "SHA1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x001b, all -> 0x001c }
            r3.update(r4)     // Catch:{ Exception -> 0x001b, all -> 0x001c }
            byte[] r4 = r3.digest()     // Catch:{ Exception -> 0x001b, all -> 0x001c }
            java.lang.String r4 = bytes2Hex(r4)     // Catch:{ Exception -> 0x001b, all -> 0x001c }
            return r4
        L_0x001b:
            return r2
        L_0x001c:
            r4 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r3 == 0) goto L_0x0033
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            android.util.Log.e(r1, r4)
        L_0x0033:
            return r2
        L_0x0034:
            r4 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r3 == 0) goto L_0x004b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            android.util.Log.e(r1, r4)
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.encryptBySHA1(java.lang.String):java.lang.String");
    }

    public static String genId() {
        return "1234567890";
    }

    public static String getApmFlag() {
        String str = "";
        try {
            Class cls = getClass("com.umeng.umcrash.UMCrash");
            if (cls == null) {
                return str;
            }
            Method declaredMethod = cls.getDeclaredMethod("getUMAPMFlag", new Class[0]);
            if (declaredMethod == null) {
                return str;
            }
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String getAppHashKey(Context context) {
        return DeviceConfig.getAppHashKey(context);
    }

    public static String getAppMD5Signature(Context context) {
        String str = "";
        try {
            String appMD5Signature = DeviceConfig.getAppMD5Signature(context);
            try {
                if (!TextUtils.isEmpty(appMD5Signature)) {
                    str = appMD5Signature.replace(":", str);
                    appMD5Signature = str.toLowerCase();
                }
                return appMD5Signature;
            } catch (Throwable unused) {
                str = appMD5Signature;
                return str;
            }
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static String getAppName(Context context) {
        String str = "get app name e is ";
        String str2 = TAG;
        String str3 = null;
        if (context == null) {
            return null;
        }
        try {
            str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
        }
        return str3;
    }

    public static String getAppSHA1Key(Context context) {
        return DeviceConfig.getAppSHA1Key(context);
    }

    public static String getAppVersinoCode(Context context, String str) {
        String str2 = "get app version code e is ";
        String str3 = TAG;
        String str4 = "";
        if (!(context == null || str == null)) {
            try {
                return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(e);
                    Log.e(str3, sb.toString());
                }
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(th);
                    Log.e(str3, sb2.toString());
                }
                return str4;
            }
        }
        return str4;
    }

    public static String getAppVersionCode(Context context) {
        String str = "get app version code e is ";
        String str2 = TAG;
        String str3 = "";
        if (context == null) {
            return str3;
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            return str3;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            return str3;
        }
    }

    public static String getAppVersionName(Context context) {
        String str = "get app version name e is ";
        String str2 = TAG;
        String str3 = "";
        if (context == null) {
            return str3;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            return str3;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            return str3;
        }
    }

    public static String getAppkey(Context context) {
        String str = "get app key e is ";
        String str2 = TAG;
        if (context == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(UMConfigure.sAppkey)) {
                return UMConfigure.sAppkey;
            }
            return getMultiProcessSP(context, "appkey");
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getAppkeyByXML(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                String string = applicationInfo.metaData.getString("UMENG_APPKEY");
                if (string != null) {
                    return string.trim();
                }
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m22452i(AnalyticsConstants.LOG_TAG, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.");
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[SYNTHETIC, Splitter:B:13:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[SYNTHETIC, Splitter:B:19:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Properties getBuildProp() {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            r0.load(r2)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x002f
        L_0x001d:
            r0 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r0
        L_0x0029:
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getBuildProp():java.util.Properties");
    }

    public static String getCPU() {
        String str = "Could not read from file /proc/cpuinfo, e is ";
        String str2 = "get cpu e is ";
        String str3 = "";
        String str4 = TAG;
        String str5 = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                str5 = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(e);
                    Log.e(str4, sb.toString());
                }
            }
        } catch (FileNotFoundException e2) {
            try {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(e2);
                    Log.e(str4, sb2.toString());
                }
            } catch (Exception e3) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(e3);
                    Log.e(str4, sb3.toString());
                }
                return str3;
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append(th);
                    Log.e(str4, sb4.toString());
                }
                return str3;
            }
        }
        return str5 != null ? str5.substring(str5.indexOf(58) + 1).trim() : str3;
    }

    public static String getChannel(Context context) {
        String str = "get channel e is ";
        String str2 = TAG;
        if (context == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(UMConfigure.sChannel)) {
                return UMConfigure.sChannel;
            }
            return getMultiProcessSP(context, "channel");
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getChannelByXML(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("UMENG_CHANNEL");
                    if (obj != null) {
                        String obj2 = obj.toString();
                        if (obj2 != null) {
                            return obj2.trim();
                        }
                        if (AnalyticsConstants.UM_DEBUG) {
                            MLog.m22452i(AnalyticsConstants.LOG_TAG, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.");
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getDeviceToken(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            Class cls = Class.forName("com.umeng.message.MessageSharedPrefs");
            Method method = cls.getMethod("getInstance", new Class[]{Context.class});
            if (method == null) {
                return null;
            }
            Object invoke = method.invoke(cls, new Object[]{applicationContext});
            if (invoke == null) {
                return null;
            }
            Method method2 = cls.getMethod("getDeviceToken", new Class[0]);
            if (method2 == null) {
                return null;
            }
            Object invoke2 = method2.invoke(invoke, new Object[0]);
            if (invoke2 == null || !(invoke2 instanceof String)) {
                return null;
            }
            return (String) invoke2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getDeviceType(Context context) {
        String str = "get device type e is ";
        String str2 = TAG;
        String str3 = "Phone";
        if (context == null) {
            return str3;
        }
        try {
            if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                str3 = "Tablet";
            }
            return str3;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getDisplayResolution(Context context) {
        String str = "get display resolution e is ";
        String str2 = TAG;
        String str3 = "";
        if (context == null) {
            return str3;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return str3;
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(i2));
            sb.append("*");
            sb.append(String.valueOf(i));
            return sb.toString();
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(e);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return str3;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(th);
                Log.e(str2, sb3.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return str3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append(r0);
        r2.append(r9);
        android.util.Log.e(r1, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append(r0);
        r2.append(r9);
        android.util.Log.e(r1, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[ExcHandler: all (r9v3 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileMD5(java.io.File r9) {
        /*
            java.lang.String r0 = "get file MD5 e is "
            java.lang.String r1 = "UMUtils"
            r2 = 1024(0x400, float:1.435E-42)
            r3 = 0
            byte[] r4 = new byte[r2]     // Catch:{ Exception -> 0x005a, all -> 0x0042 }
            boolean r5 = r9.isFile()     // Catch:{ Exception -> 0x0041, all -> 0x0042 }
            if (r5 != 0) goto L_0x0012
            java.lang.String r9 = ""
            return r9
        L_0x0012:
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch:{ Exception -> 0x0041, all -> 0x0042 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0041, all -> 0x0042 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x0041, all -> 0x0042 }
        L_0x001d:
            r9 = 0
            int r7 = r6.read(r4, r9, r2)     // Catch:{ Exception -> 0x0041, all -> 0x0042 }
            r8 = -1
            if (r7 == r8) goto L_0x0029
            r5.update(r4, r9, r7)     // Catch:{ Exception -> 0x0041, all -> 0x0042 }
            goto L_0x001d
        L_0x0029:
            r6.close()     // Catch:{ Exception -> 0x0041, all -> 0x0042 }
            java.math.BigInteger r2 = new java.math.BigInteger     // Catch:{ Exception -> 0x005a, all -> 0x0042 }
            byte[] r4 = r5.digest()     // Catch:{ Exception -> 0x005a, all -> 0x0042 }
            r5 = 1
            r2.<init>(r5, r4)     // Catch:{ Exception -> 0x005a, all -> 0x0042 }
            java.lang.String r4 = "%1$032x"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x005a, all -> 0x0042 }
            r5[r9] = r2     // Catch:{ Exception -> 0x005a, all -> 0x0042 }
            java.lang.String r9 = java.lang.String.format(r4, r5)     // Catch:{ Exception -> 0x005a, all -> 0x0042 }
            return r9
        L_0x0041:
            return r3
        L_0x0042:
            r9 = move-exception
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L_0x0059
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.util.Log.e(r1, r9)
        L_0x0059:
            return r3
        L_0x005a:
            r9 = move-exception
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L_0x0071
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.util.Log.e(r1, r9)
        L_0x0071:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getFileMD5(java.io.File):java.lang.String");
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String[] getGPU(GL10 gl10) {
        String str = "Could not read gpu infor, e is ";
        String str2 = TAG;
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            return new String[0];
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            return new String[0];
        }
    }

    public static String getLastAppkey(Context context) {
        String str = "get last app key e is ";
        String str2 = TAG;
        if (context == null) {
            return null;
        }
        try {
            return getMultiProcessSP(context, KEY_LAST_APP_KEY);
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("fail to read user config locale, e is ");
        r4.append(r3);
        android.util.Log.e(r1, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(r0);
        r4.append(r3);
        android.util.Log.e(r1, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0021;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001a A[ExcHandler: all (r3v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Locale getLocale(android.content.Context r6) {
        /*
            java.lang.String r0 = "get locale e is "
            java.lang.String r1 = "UMUtils"
            r2 = 0
            if (r6 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.content.res.Configuration r3 = new android.content.res.Configuration     // Catch:{ Exception -> 0x001c, all -> 0x001a }
            r3.<init>()     // Catch:{ Exception -> 0x001c, all -> 0x001a }
            r3.setToDefaults()     // Catch:{ Exception -> 0x001c, all -> 0x001a }
            android.content.ContentResolver r4 = r6.getContentResolver()     // Catch:{ Exception -> 0x001c, all -> 0x001a }
            android.provider.Settings.System.getConfiguration(r4, r3)     // Catch:{ Exception -> 0x001c, all -> 0x001a }
            java.util.Locale r3 = r3.locale     // Catch:{ Exception -> 0x001c, all -> 0x001a }
            goto L_0x0036
        L_0x001a:
            r3 = move-exception
            goto L_0x003d
        L_0x001c:
            r3 = move-exception
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ Exception -> 0x0057, all -> 0x001a }
            if (r4 == 0) goto L_0x0035
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057, all -> 0x001a }
            r4.<init>()     // Catch:{ Exception -> 0x0057, all -> 0x001a }
            java.lang.String r5 = "fail to read user config locale, e is "
            r4.append(r5)     // Catch:{ Exception -> 0x0057, all -> 0x001a }
            r4.append(r3)     // Catch:{ Exception -> 0x0057, all -> 0x001a }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0057, all -> 0x001a }
            android.util.Log.e(r1, r3)     // Catch:{ Exception -> 0x0057, all -> 0x001a }
        L_0x0035:
            r3 = r2
        L_0x0036:
            if (r3 != 0) goto L_0x003c
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0057, all -> 0x001a }
        L_0x003c:
            return r3
        L_0x003d:
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r4 == 0) goto L_0x0053
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r1, r0)
        L_0x0053:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3)
            return r2
        L_0x0057:
            r3 = move-exception
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r4 == 0) goto L_0x006e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r1, r0)
        L_0x006e:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getLocale(android.content.Context):java.util.Locale");
    }

    public static String getMac(Context context) {
        String str = "get mac e is ";
        String str2 = TAG;
        if (context == null) {
            return null;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return null;
            }
            if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                return wifiManager.getConnectionInfo().getMacAddress();
            }
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(str2, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
            }
            return "";
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMultiProcessSP(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 0
            java.lang.Object r1 = spLock     // Catch:{ Exception -> 0x0050 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0050 }
            if (r5 == 0) goto L_0x004b
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x000d
            goto L_0x004b
        L_0x000d:
            boolean r2 = isMainProgress(r5)     // Catch:{ all -> 0x004d }
            r3 = 0
            if (r2 == 0) goto L_0x001f
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "umeng_common_config"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x004d }
            goto L_0x0041
        L_0x001f:
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r5)     // Catch:{ all -> 0x004d }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r4.<init>()     // Catch:{ all -> 0x004d }
            r4.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "_"
            r4.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "umeng_common_config"
            r4.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x004d }
        L_0x0041:
            if (r5 == 0) goto L_0x0049
            java.lang.String r5 = r5.getString(r6, r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return r5
        L_0x0049:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return r0
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return r0
        L_0x004d:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            throw r5     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getMultiProcessSP(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String[] getNetworkAccessMode(Context context) {
        String str = "get network access mode e is ";
        String str2 = TAG;
        String str3 = "";
        String[] strArr = {str3, str3};
        if (context == null) {
            return strArr;
        }
        try {
            if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                strArr[0] = str3;
                return strArr;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                strArr[0] = str3;
                return strArr;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo == null || networkInfo.getState() != State.CONNECTED) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null && networkInfo2.getState() == State.CONNECTED) {
                    strArr[0] = "2G/3G";
                    strArr[1] = networkInfo2.getSubtypeName();
                    return strArr;
                }
                return strArr;
            }
            strArr[0] = "Wi-Fi";
            return strArr;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
        }
    }

    public static String getNetworkOperatorName(Context context) {
        String str = "get network operator e is ";
        String str2 = TAG;
        String str3 = "";
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
            return str3;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return str3;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return str3;
        }
    }

    public static String getOaidRequiredTime(Context context) {
        if (!FieldManager.allow(UMConstant.f17889G) || VERSION.SDK_INT <= 28) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(OaidTracking.f17740a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(OaidTracking.f17742c, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getOperator(Context context) {
        String str = "get get operator e is ";
        String str2 = TAG;
        String str3 = "Unknown";
        if (context == null) {
            return str3;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return str3;
            }
            return telephonyManager.getNetworkOperator();
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return str3;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return str3;
        }
    }

    public static String getRegisteredOperator(Context context) {
        String str = "get registered operator e is ";
        String str2 = TAG;
        String str3 = null;
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                str3 = telephonyManager.getNetworkOperator();
            }
            return str3;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(r0);
        r4.append(r3);
        android.util.Log.e(r1, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(r0);
        r4.append(r3);
        android.util.Log.e(r1, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[ExcHandler: all (r3v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSubOSName(android.content.Context r6) {
        /*
            java.lang.String r0 = "get sub os name e is "
            java.lang.String r1 = "UMUtils"
            r2 = 0
            if (r6 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.util.Properties r3 = getBuildProp()     // Catch:{ Exception -> 0x0054, all -> 0x0039 }
            java.lang.String r4 = "ro.miui.ui.version.name"
            java.lang.String r4 = r3.getProperty(r4)     // Catch:{ Exception -> 0x0034, all -> 0x0039 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0034, all -> 0x0039 }
            if (r5 == 0) goto L_0x0030
            boolean r5 = isFlyMe()     // Catch:{ Exception -> 0x0034, all -> 0x0039 }
            if (r5 == 0) goto L_0x0021
            java.lang.String r6 = "Flyme"
            goto L_0x0032
        L_0x0021:
            java.lang.String r3 = getYunOSVersion(r3)     // Catch:{ Exception -> 0x0034, all -> 0x0039 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0034, all -> 0x0039 }
            if (r3 != 0) goto L_0x002e
            java.lang.String r6 = "YunOS"
            goto L_0x0032
        L_0x002e:
            r2 = r4
            goto L_0x0038
        L_0x0030:
            java.lang.String r6 = "MIUI"
        L_0x0032:
            r2 = r6
            goto L_0x0038
        L_0x0034:
            r3 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3)     // Catch:{ Exception -> 0x0054, all -> 0x0039 }
        L_0x0038:
            return r2
        L_0x0039:
            r3 = move-exception
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r4 == 0) goto L_0x0050
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r1, r0)
        L_0x0050:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3)
            return r2
        L_0x0054:
            r3 = move-exception
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r4 == 0) goto L_0x006b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r1, r0)
        L_0x006b:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getSubOSName(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(r0);
        r4.append(r3);
        android.util.Log.e(r1, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(r0);
        r4.append(r3);
        android.util.Log.e(r1, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030 A[ExcHandler: all (r3v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSubOSVersion(android.content.Context r6) {
        /*
            java.lang.String r0 = "get sub os version e is "
            java.lang.String r1 = "UMUtils"
            r2 = 0
            if (r6 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.util.Properties r3 = getBuildProp()     // Catch:{ Exception -> 0x004b, all -> 0x0030 }
            java.lang.String r4 = "ro.miui.ui.version.name"
            java.lang.String r4 = r3.getProperty(r4)     // Catch:{ Exception -> 0x002b, all -> 0x0030 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x002b, all -> 0x0030 }
            if (r5 == 0) goto L_0x0029
            boolean r5 = isFlyMe()     // Catch:{ Exception -> 0x002b, all -> 0x0030 }
            if (r5 == 0) goto L_0x0023
            java.lang.String r6 = getFlymeVersion(r3)     // Catch:{ Exception -> 0x0029, all -> 0x0030 }
            goto L_0x0027
        L_0x0023:
            java.lang.String r6 = getYunOSVersion(r3)     // Catch:{ Exception -> 0x0029, all -> 0x0030 }
        L_0x0027:
            r2 = r6
            goto L_0x002f
        L_0x0029:
            r2 = r4
            goto L_0x002f
        L_0x002b:
            r3 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3)     // Catch:{ Exception -> 0x004b, all -> 0x0030 }
        L_0x002f:
            return r2
        L_0x0030:
            r3 = move-exception
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r4 == 0) goto L_0x0047
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r1, r0)
        L_0x0047:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3)
            return r2
        L_0x004b:
            r3 = move-exception
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r4 == 0) goto L_0x0062
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r1, r0)
        L_0x0062:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getSubOSVersion(android.content.Context):java.lang.String");
    }

    public static String getSystemProperty(String str, String str2) {
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke(null, new Object[]{str, str2});
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static int getTargetSdkVersion(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String getUMId(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return UMEnvelopeBuild.imprintProperty(context.getApplicationContext(), UMCommonContent.f16645g, null);
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    public static String getUUIDForZid(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(SP_FILE_NAME, 0);
        String str = "";
        return sharedPreferences != null ? sharedPreferences.getString("session_id", str) : str;
    }

    public static String getUmengToken(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return UMEnvelopeBuild.imprintProperty(context.getApplicationContext(), "ztoken", null);
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    private static String getYunOSVersion(Properties properties) {
        try {
            String property = properties.getProperty("ro.yunos.version");
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getZid(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!UMConfigure.needSendZcfgEnv(applicationContext)) {
            return UMInternalData.m22265a(applicationContext).mo19254a().mo19255a();
        }
        return null;
    }

    public static boolean isApplication(Context context) {
        try {
            String name = context.getApplicationContext().getClass().getSuperclass().getName();
            if (TextUtils.isEmpty(name) || !name.equals("android.app.Application")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isDebug(Context context) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return false;
        }
    }

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isMainProgress(Context context) {
        try {
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getApplicationContext().getPackageName();
            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSdCardWrittenable() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String parseId(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String readStreamToString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[1024];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    private static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void saveSDKComponent() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(UMCommonContent.f16622at);
        if (UMConfigure.isDebugLog()) {
            UMLog.mutlInfo(2, "统计SDK版本号: 9.3.8");
        }
        VALUE_ANALYTICS_VERSION = "9.3.8";
        String b = UMInternalDataProtocol.m22271b();
        if (!TextUtils.isEmpty(b)) {
            VALUE_ASMS_VERSION = b;
            if (UMConfigure.isDebugLog()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ZID SDK版本号: ");
                sb.append(b);
                UMLog.mutlInfo(2, sb.toString());
            }
        }
        Class cls = getClass("com.umeng.analytics.game.GameSdkVersion");
        String str = "SDK_VERSION";
        String str2 = "g";
        if (cls != null) {
            stringBuffer.append(str2);
            try {
                String str3 = (String) cls.getDeclaredField(str).get(cls);
                if (!TextUtils.isEmpty(str3)) {
                    VALUE_GAME_VERSION = str3;
                    if (UMConfigure.isDebugLog()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("游戏统计SDK版本号: ");
                        sb2.append(str3);
                        UMLog.mutlInfo(2, sb2.toString());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Class cls2 = getClass("com.umeng.vt.V");
        if (cls2 != null) {
            stringBuffer.append(UMCommonContent.f16579aC);
            try {
                String str4 = (String) cls2.getDeclaredField("VERSION").get(cls2);
                if (!TextUtils.isEmpty(str4)) {
                    VALUE_VISUAL_VERSION = str4;
                    if (UMConfigure.isDebugLog()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("可视化埋点SDK版本号: ");
                        sb3.append(str4);
                        UMLog.mutlInfo(2, sb3.toString());
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (getClass("com.umeng.message.PushAgent") != null) {
            stringBuffer.append(UMCommonContent.f16624av);
            Class cls3 = getClass("com.umeng.message.MsgConstant");
            if (cls3 != null) {
                try {
                    String str5 = (String) cls3.getDeclaredField(str).get(cls3);
                    if (!TextUtils.isEmpty(str5)) {
                        VALUE_PUSH_VERSION = str5;
                        if (UMConfigure.isDebugLog()) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("推送SDK版本号: ");
                            sb4.append(str5);
                            UMLog.mutlInfo(2, sb4.toString());
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        if (getClass("com.umeng.socialize.UMShareAPI") != null) {
            stringBuffer.append(UMCommonContent.f16628az);
            Class cls4 = getClass("com.umeng.a");
            if (cls4 != null) {
                try {
                    String str6 = (String) cls4.getDeclaredField(str2).get(cls4);
                    if (!TextUtils.isEmpty(str6) && UMConfigure.isDebugLog()) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("分享SDK版本号: ");
                        sb5.append(str6);
                        UMLog.mutlInfo(2, sb5.toString());
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        if (getClass("com.umeng.error.UMError") != null) {
            stringBuffer.append("e");
        }
        if (getClass("com.umeng.umzid.ZIDManager") != null) {
            stringBuffer.append(UMCommonContent.f16578aB);
        }
        stringBuffer.append(UMCommonContent.f16577aA);
        if (!(SdkVersion.SDK_TYPE == 1 || getClass("com.umeng.commonsdk.internal.UMOplus") == null)) {
            stringBuffer.append("o");
        }
        if (getClass("com.umeng.airec.RecAgent") != null) {
            stringBuffer.append(UMCommonContent.f16581aE);
            Class cls5 = getClass("com.umeng.airec.BuildConfig");
            if (cls5 != null) {
                try {
                    String str7 = (String) cls5.getDeclaredField("VERSION_NAME").get(cls5);
                    if (!TextUtils.isEmpty(str7)) {
                        VALUE_REC_VERSION_NAME = str7;
                        if (UMConfigure.isDebugLog()) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("智能推荐SDK版本号: ");
                            sb6.append(str7);
                            UMLog.mutlInfo(2, sb6.toString());
                        }
                    }
                } catch (Throwable unused5) {
                }
            }
        }
        if (getClass("com.umeng.umverify.UMVerifyHelper") != null) {
            stringBuffer.append("n");
        }
        Class cls6 = getClass("com.umeng.sms.UMSMS");
        String str8 = "getVersion";
        if (cls6 != null) {
            stringBuffer.append("m");
            try {
                Method declaredMethod = cls6.getDeclaredMethod(str8, new Class[0]);
                if (declaredMethod != null) {
                    String str9 = (String) declaredMethod.invoke(cls6, new Object[0]);
                    if (!TextUtils.isEmpty(str9)) {
                        VALUE_SMS_VERSION = str9;
                        if (UMConfigure.isDebugLog()) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("短信验证码SDK版本号: ");
                            sb7.append(str9);
                            UMLog.mutlInfo(2, sb7.toString());
                        }
                    }
                }
            } catch (Throwable unused6) {
            }
        }
        try {
            Class cls7 = getClass("com.umeng.umcrash.UMCrash");
            if (cls7 != null) {
                stringBuffer.append(UMCommonContent.f16580aD);
                Field declaredField = cls7.getDeclaredField("crashSdkVersion");
                declaredField.setAccessible(true);
                String str10 = (String) declaredField.get(cls7);
                if (!TextUtils.isEmpty(str10)) {
                    VALUE_APM_VERSION = str10;
                    if (UMConfigure.isDebugLog()) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("APM SDK版本号: ");
                        sb8.append(str10);
                        UMLog.mutlInfo(2, sb8.toString());
                    }
                }
            }
        } catch (Throwable unused7) {
        }
        Class cls8 = getClass("com.umeng.umlink.MobclickLink");
        if (cls8 != null) {
            stringBuffer.append("l");
            try {
                Method declaredMethod2 = cls8.getDeclaredMethod(str8, new Class[0]);
                if (declaredMethod2 != null) {
                    String str11 = (String) declaredMethod2.invoke(cls8, new Object[0]);
                    if (!TextUtils.isEmpty(str11)) {
                        VALUE_LINK_VERSION = str11;
                        if (UMConfigure.isDebugLog()) {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("ULink SDK版本号: ");
                            sb9.append(str11);
                            UMLog.mutlInfo(2, sb9.toString());
                        }
                    }
                }
            } catch (Throwable unused8) {
            }
        }
        Class cls9 = getClass("com.umeng.cconfig.UMRemoteConfig");
        if (cls9 != null) {
            try {
                Method declaredMethod3 = cls9.getDeclaredMethod(str8, new Class[0]);
                if (declaredMethod3 != null) {
                    stringBuffer.append(UMCommonContent.f16582aF);
                    String str12 = (String) declaredMethod3.invoke(cls9, new Object[0]);
                    if (!TextUtils.isEmpty(str12)) {
                        VALUE_ABTEST_VERSION = str12;
                        if (UMConfigure.isDebugLog()) {
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append("UABTEST SDK版本号: ");
                            sb10.append(str12);
                            UMLog.mutlInfo(2, sb10.toString());
                        }
                    }
                }
            } catch (Throwable unused9) {
            }
        }
        if (!TextUtils.isEmpty(stringBuffer)) {
            EnvelopeManager.f17646a = stringBuffer.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("module init:");
            sb11.append(EnvelopeManager.f17646a);
            Log.i(AnalyticsConstants.LOG_TAG, sb11.toString());
        }
    }

    public static void setAppkey(Context context, String str) {
        String str2 = "set app key e is ";
        String str3 = TAG;
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, "appkey", str);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(e);
                    Log.e(str3, sb.toString());
                }
                UMCrashManager.reportCrash(context, e);
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(th);
                    Log.e(str3, sb2.toString());
                }
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static void setChannel(Context context, String str) {
        String str2 = "set channel e is ";
        String str3 = TAG;
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, "channel", str);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(e);
                    Log.e(str3, sb.toString());
                }
                UMCrashManager.reportCrash(context, e);
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(th);
                    Log.e(str3, sb2.toString());
                }
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static void setLastAppkey(Context context, String str) {
        String str2 = "set last app key e is ";
        String str3 = TAG;
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, KEY_LAST_APP_KEY, str);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(e);
                    Log.e(str3, sb.toString());
                }
                UMCrashManager.reportCrash(context, e);
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(th);
                    Log.e(str3, sb2.toString());
                }
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setMultiProcessSP(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = spLock     // Catch:{ Exception -> 0x0056 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0056 }
            if (r4 == 0) goto L_0x0051
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x000e
            goto L_0x0051
        L_0x000e:
            boolean r1 = isMainProgress(r4)     // Catch:{ all -> 0x0053 }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "umeng_common_config"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0042
        L_0x0020:
            java.lang.String r1 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r4)     // Catch:{ all -> 0x0053 }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x0053 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
            r3.<init>()     // Catch:{ all -> 0x0053 }
            r3.append(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "_"
            r3.append(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "umeng_common_config"
            r3.append(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0053 }
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0053 }
        L_0x0042:
            if (r4 == 0) goto L_0x004f
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x0053 }
            android.content.SharedPreferences$Editor r4 = r4.putString(r5, r6)     // Catch:{ all -> 0x0053 }
            r4.commit()     // Catch:{ all -> 0x0053 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0056
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0053:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r4     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.setMultiProcessSP(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void setUUIDForZid(Context context) {
        String str;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(SP_FILE_NAME, 0);
        try {
            str = UUID.randomUUID().toString();
        } catch (Throwable unused) {
            str = "";
        }
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("session_id", str).commit();
        }
    }

    public static String getAppVersionName(Context context, String str) {
        String str2 = "get app version name e is ";
        String str3 = TAG;
        String str4 = "";
        if (!(context == null || str == null)) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (NameNotFoundException e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(e);
                    Log.e(str3, sb.toString());
                }
                UMCrashManager.reportCrash(context, e);
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(th);
                    Log.e(str3, sb2.toString());
                }
                UMCrashManager.reportCrash(context, th);
                return str4;
            }
        }
        return str4;
    }
}
