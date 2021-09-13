package com.umeng.commonsdk.statistics.common;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.OaidTracking;
import com.umeng.commonsdk.utils.UMConstant;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;

public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    protected static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    private static DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.DEFAULT;
    private static String sImei;
    private static String sImsi;
    private static String sMeid;
    private static String sWifiMac;

    static {
        String str = "";
        sWifiMac = str;
        sImei = str;
        sMeid = str;
        sImsi = str;
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
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r6.getPackageManager().checkPermission(r7, r6.getPackageName()) == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (((java.lang.Integer) java.lang.Class.forName("android.content.Context").getMethod("checkSelfPermission", new java.lang.Class[]{java.lang.String.class}).invoke(r6, new java.lang.Object[]{r7})).intValue() == 0) goto L_0x003c;
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
            if (r1 < r2) goto L_0x002e
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x003d }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ all -> 0x003d }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x003d }
            r2[r0] = r7     // Catch:{ all -> 0x003d }
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch:{ all -> 0x003d }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x003d }
            int r6 = r6.intValue()     // Catch:{ all -> 0x003d }
            if (r6 != 0) goto L_0x003d
            goto L_0x003c
        L_0x002e:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static String getAndroidId(Context context) {
        if (FieldManager.allow(UMConstant.f17930i) && context != null) {
            try {
                return Secure.getString(context.getContentResolver(), "android_id");
            } catch (Exception unused) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m22461w("can't read android id");
                }
            }
        }
        return null;
    }

    public static String getAppHashKey(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures;
            if (signatureArr.length > 0) {
                Signature signature = signatureArr[0];
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(signature.toByteArray());
                return Base64.encodeToString(instance.digest(), 0).trim();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getAppMD5Signature(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            str = byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
        }
        return str;
    }

    public static String getAppName(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m22451i(LOG_TAG, th);
            }
        }
        return str;
    }

    public static String getAppSHA1Key(Context context) {
        try {
            return byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static String getApplicationLable(Context context) {
        return context == null ? "" : context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[Catch:{ all -> 0x001d, all -> 0x0025 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Properties getBuildProp() {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x001f }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x001f }
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch:{ all -> 0x001f }
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x001f }
            r2.<init>(r3)     // Catch:{ all -> 0x001f }
            r0.load(r2)     // Catch:{ all -> 0x001d }
            r2.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0025
        L_0x001d:
            r1 = r2
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            if (r1 == 0) goto L_0x0025
            r1.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getBuildProp():java.util.Properties");
    }

    public static String getCPU() {
        String str = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                str = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th) {
                MLog.m22444e(LOG_TAG, "Could not read from file /proc/cpuinfo", th);
            }
        } catch (FileNotFoundException e) {
            MLog.m22444e(LOG_TAG, "Could not open file /proc/cpuinfo", (Throwable) e);
        }
        return str != null ? str.substring(str.indexOf(58) + 1).trim() : "";
    }

    public static String getDBencryptID(Context context) {
        return UMUtils.genId();
    }

    public static String getDeviceId(Context context) {
        if (AnalyticsConstants.getDeviceType() == 2) {
            return getDeviceIdForBox(context);
        }
        return getDeviceIdForGeneral(context);
    }

    public static String getDeviceIdForBox(Context context) {
        String str = "";
        if (context == null) {
            return str;
        }
        try {
            int i = VERSION.SDK_INT;
            String str2 = "getDeviceId, ANDROID_ID: ";
            String str3 = "getDeviceId, MAC: ";
            String str4 = "android_id";
            String str5 = UMConstant.f17930i;
            if (i < 23) {
                if (FieldManager.allow(str5)) {
                    str = Secure.getString(context.getContentResolver(), str4);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str6 = LOG_TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(str);
                        MLog.m22452i(str6, sb.toString());
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    str = getMacBySystemInterface(context);
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str7 = LOG_TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append(str);
                        MLog.m22452i(str7, sb2.toString());
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = getSerialNo();
                        deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                        if (TextUtils.isEmpty(str)) {
                            str = getIMEI(context);
                            deviceTypeEnum = DeviceTypeEnum.IMEI;
                        }
                    }
                }
            } else if (i == 23) {
                if (FieldManager.allow(str5)) {
                    str = Secure.getString(context.getContentResolver(), str4);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str8 = LOG_TAG;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(str);
                        MLog.m22452i(str8, sb3.toString());
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    str = getMacByJavaAPI();
                    DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
                    deviceTypeEnum = deviceTypeEnum2;
                    if (TextUtils.isEmpty(str)) {
                        if (AnalyticsConstants.CHECK_DEVICE) {
                            str = getMacShell();
                            deviceTypeEnum = deviceTypeEnum2;
                        } else {
                            str = getMacBySystemInterface(context);
                            deviceTypeEnum = deviceTypeEnum2;
                        }
                    }
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str9 = LOG_TAG;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str3);
                        sb4.append(str);
                        MLog.m22452i(str9, sb4.toString());
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = getSerialNo();
                        deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                        if (TextUtils.isEmpty(str)) {
                            str = getIMEI(context);
                            deviceTypeEnum = DeviceTypeEnum.IMEI;
                        }
                    }
                }
            } else if (i >= 29) {
                str = getOaid(context);
                deviceTypeEnum = DeviceTypeEnum.OAID;
                if (TextUtils.isEmpty(str)) {
                    str = getIdfa(context);
                    deviceTypeEnum = DeviceTypeEnum.IDFA;
                    if (TextUtils.isEmpty(str)) {
                        str = getAndroidId(context);
                        deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                        if (TextUtils.isEmpty(str)) {
                            str = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            if (TextUtils.isEmpty(str)) {
                                str = getMacByJavaAPI();
                                DeviceTypeEnum deviceTypeEnum3 = DeviceTypeEnum.MAC;
                                deviceTypeEnum = deviceTypeEnum3;
                                if (TextUtils.isEmpty(str)) {
                                    str = getMacBySystemInterface(context);
                                    deviceTypeEnum = deviceTypeEnum3;
                                }
                            }
                        }
                    }
                }
            } else {
                if (FieldManager.allow(str5)) {
                    str = Secure.getString(context.getContentResolver(), str4);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str10 = LOG_TAG;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("getDeviceId: ANDROID_ID: ");
                        sb5.append(str);
                        MLog.m22452i(str10, sb5.toString());
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    str = getSerialNo();
                    deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                    if (TextUtils.isEmpty(str)) {
                        str = getIMEI(context);
                        deviceTypeEnum = DeviceTypeEnum.IMEI;
                        if (TextUtils.isEmpty(str)) {
                            str = getMacByJavaAPI();
                            DeviceTypeEnum deviceTypeEnum4 = DeviceTypeEnum.MAC;
                            deviceTypeEnum = deviceTypeEnum4;
                            if (TextUtils.isEmpty(str)) {
                                str = getMacBySystemInterface(context);
                                deviceTypeEnum = deviceTypeEnum4;
                                if (AnalyticsConstants.UM_DEBUG) {
                                    String str11 = LOG_TAG;
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(str3);
                                    sb6.append(str);
                                    MLog.m22452i(str11, sb6.toString());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public static String getDeviceIdForGeneral(Context context) {
        String str = "";
        if (context == null) {
            return str;
        }
        try {
            int i = VERSION.SDK_INT;
            String str2 = "getDeviceId, ANDROID_ID: ";
            String str3 = "android_id";
            String str4 = UMConstant.f17930i;
            if (i < 23) {
                str = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(str)) {
                    boolean z = AnalyticsConstants.UM_DEBUG;
                    if (z) {
                        MLog.m22464w(LOG_TAG, "No IMEI.");
                    }
                    str = getMacBySystemInterface(context);
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (TextUtils.isEmpty(str)) {
                        if (FieldManager.allow(str4)) {
                            str = Secure.getString(context.getContentResolver(), str3);
                            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                            if (z) {
                                String str5 = LOG_TAG;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(str);
                                MLog.m22452i(str5, sb.toString());
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                        }
                    }
                }
                return str;
            }
            String str6 = "getDeviceId, MAC: ";
            if (i == 23) {
                str = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(str)) {
                    str = getMacByJavaAPI();
                    DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
                    deviceTypeEnum = deviceTypeEnum2;
                    if (TextUtils.isEmpty(str)) {
                        if (AnalyticsConstants.CHECK_DEVICE) {
                            str = getMacShell();
                            deviceTypeEnum = deviceTypeEnum2;
                        } else {
                            str = getMacBySystemInterface(context);
                            deviceTypeEnum = deviceTypeEnum2;
                        }
                    }
                    boolean z2 = AnalyticsConstants.UM_DEBUG;
                    if (z2) {
                        String str7 = LOG_TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str6);
                        sb2.append(str);
                        MLog.m22452i(str7, sb2.toString());
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (FieldManager.allow(str4)) {
                            str = Secure.getString(context.getContentResolver(), str3);
                            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                            if (z2) {
                                String str8 = LOG_TAG;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str2);
                                sb3.append(str);
                                MLog.m22452i(str8, sb3.toString());
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                        }
                    }
                }
            } else if (i >= 29) {
                str = getOaid(context);
                deviceTypeEnum = DeviceTypeEnum.OAID;
                if (TextUtils.isEmpty(str)) {
                    str = getIdfa(context);
                    deviceTypeEnum = DeviceTypeEnum.IDFA;
                    if (TextUtils.isEmpty(str)) {
                        str = getAndroidId(context);
                        deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                        if (TextUtils.isEmpty(str)) {
                            str = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            if (TextUtils.isEmpty(str)) {
                                str = getMacByJavaAPI();
                                DeviceTypeEnum deviceTypeEnum3 = DeviceTypeEnum.MAC;
                                deviceTypeEnum = deviceTypeEnum3;
                                if (TextUtils.isEmpty(str)) {
                                    str = getMacBySystemInterface(context);
                                    deviceTypeEnum = deviceTypeEnum3;
                                }
                            }
                        }
                    }
                }
            } else {
                str = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(str)) {
                    str = getSerialNo();
                    deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                    if (TextUtils.isEmpty(str)) {
                        if (FieldManager.allow(str4)) {
                            str = Secure.getString(context.getContentResolver(), str3);
                            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                            if (AnalyticsConstants.UM_DEBUG) {
                                String str9 = LOG_TAG;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str2);
                                sb4.append(str);
                                MLog.m22452i(str9, sb4.toString());
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = getMacByJavaAPI();
                            DeviceTypeEnum deviceTypeEnum4 = DeviceTypeEnum.MAC;
                            deviceTypeEnum = deviceTypeEnum4;
                            if (TextUtils.isEmpty(str)) {
                                str = getMacBySystemInterface(context);
                                deviceTypeEnum = deviceTypeEnum4;
                                if (AnalyticsConstants.UM_DEBUG) {
                                    String str10 = LOG_TAG;
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(str6);
                                    sb5.append(str);
                                    MLog.m22452i(str10, sb5.toString());
                                }
                            }
                        }
                    }
                }
            }
            return str;
        } catch (Throwable unused) {
        }
    }

    public static String getDeviceIdType() {
        return deviceTypeEnum.getDeviceIdType();
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    public static String getDeviceType(Context context) {
        String str = "Phone";
        if (context == null) {
            return str;
        }
        try {
            if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                str = "Tablet";
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public static String getDisplayResolution(Context context) {
        String str = "";
        if (context == null) {
            return str;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(i2));
                sb.append("*");
                sb.append(String.valueOf(i));
                return sb.toString();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    private static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m22444e(LOG_TAG, "Could not read gpu infor:", th);
            }
            return new String[0];
        }
    }

    public static Activity getGlobleActivity(Context context) {
        Activity activity = null;
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object next : ((Map) declaredField.get(invoke)).values()) {
                Class cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(next);
                }
            }
        } catch (Throwable unused) {
        }
        return activity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getIMEI(android.content.Context r6) {
        /*
            java.lang.String r0 = sImei
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.String r6 = sImei
            return r6
        L_0x000b:
            java.lang.String r0 = ""
            java.lang.String r1 = "header_device_id_imei"
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r1)
            if (r1 == 0) goto L_0x0061
            if (r6 != 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L_0x0061
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r6 = checkPermission(r6, r2)     // Catch:{ all -> 0x0051 }
            if (r6 == 0) goto L_0x0061
            java.lang.String r6 = r1.getDeviceId()     // Catch:{ all -> 0x0051 }
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = LOG_TAG     // Catch:{ all -> 0x004f }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x004f }
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r3.<init>()     // Catch:{ all -> 0x004f }
            java.lang.String r4 = "getDeviceId, IMEI: "
            r3.append(r4)     // Catch:{ all -> 0x004f }
            r3.append(r6)     // Catch:{ all -> 0x004f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004f }
            r1[r2] = r3     // Catch:{ all -> 0x004f }
            com.umeng.commonsdk.statistics.common.MLog.m22452i(r0, r1)     // Catch:{ all -> 0x004f }
            goto L_0x0060
        L_0x004f:
            r0 = move-exception
            goto L_0x0055
        L_0x0051:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
        L_0x0055:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = LOG_TAG
            java.lang.String r2 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.m22462w(r1, r2, r0)
        L_0x0060:
            r0 = r6
        L_0x0061:
            sImei = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getIMEI(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014 A[Catch:{ SocketException -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getIPAddress(android.content.Context r7) {
        /*
            r7 = 0
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ SocketException -> 0x006a }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ SocketException -> 0x006a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ SocketException -> 0x006a }
            r1 = r7
        L_0x000e:
            boolean r2 = r0.hasNext()     // Catch:{ SocketException -> 0x0069 }
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r0.next()     // Catch:{ SocketException -> 0x0069 }
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch:{ SocketException -> 0x0069 }
            java.util.Enumeration r3 = r2.getInetAddresses()     // Catch:{ SocketException -> 0x0069 }
            java.util.ArrayList r3 = java.util.Collections.list(r3)     // Catch:{ SocketException -> 0x0069 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ SocketException -> 0x0069 }
        L_0x0026:
            boolean r4 = r3.hasNext()     // Catch:{ SocketException -> 0x0069 }
            if (r4 == 0) goto L_0x000e
            java.lang.Object r4 = r3.next()     // Catch:{ SocketException -> 0x0069 }
            java.net.InetAddress r4 = (java.net.InetAddress) r4     // Catch:{ SocketException -> 0x0069 }
            boolean r5 = r4.isLoopbackAddress()     // Catch:{ SocketException -> 0x0069 }
            java.lang.String r6 = "dummy"
            if (r5 != 0) goto L_0x004e
            boolean r5 = r4 instanceof java.net.Inet4Address     // Catch:{ SocketException -> 0x0069 }
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = r2.getDisplayName()     // Catch:{ SocketException -> 0x0069 }
            boolean r5 = r5.contains(r6)     // Catch:{ SocketException -> 0x0069 }
            if (r5 != 0) goto L_0x004e
            if (r7 != 0) goto L_0x004e
            java.lang.String r7 = r4.getHostAddress()     // Catch:{ SocketException -> 0x0069 }
        L_0x004e:
            boolean r5 = r4.isLoopbackAddress()     // Catch:{ SocketException -> 0x0069 }
            if (r5 != 0) goto L_0x0026
            boolean r5 = r4 instanceof java.net.Inet6Address     // Catch:{ SocketException -> 0x0069 }
            if (r5 == 0) goto L_0x0026
            java.lang.String r5 = r2.getDisplayName()     // Catch:{ SocketException -> 0x0069 }
            boolean r5 = r5.contains(r6)     // Catch:{ SocketException -> 0x0069 }
            if (r5 != 0) goto L_0x0026
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = r4.getHostAddress()     // Catch:{ SocketException -> 0x0069 }
            goto L_0x0026
        L_0x0069:
            r7 = r1
        L_0x006a:
            java.lang.String r0 = "SocketException"
            r1 = r7
            r7 = r0
        L_0x006e:
            if (r7 == 0) goto L_0x0071
            return r7
        L_0x0071:
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = "null"
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getIPAddress(android.content.Context):java.lang.String");
    }

    private static String getIdfa(Context context) {
        String str = "";
        try {
            return FieldManager.allow(UMConstant.f17944w) ? AdvertisingId.m22497a(context) : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String getImei(Context context) {
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String str = null;
        try {
            if (FieldManager.allow(UMConstant.f17928g) && context != null) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                    str = telephonyManager.getDeviceId();
                }
            }
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m22463w("No IMEI.", (Throwable) e);
            }
        }
        sImei = str;
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|18|19|20|(1:22)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[Catch:{ Exception -> 0x0058 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getImeiNew(android.content.Context r5) {
        /*
            java.lang.String r0 = sImei
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.String r5 = sImei
            return r5
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "header_device_id_imei"
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r1)     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x0062
            if (r5 == 0) goto L_0x0062
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r5.getSystemService(r1)     // Catch:{ Exception -> 0x0058 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x0062
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r5 = checkPermission(r5, r2)     // Catch:{ Exception -> 0x0058 }
            if (r5 == 0) goto L_0x0062
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0058 }
            r2 = 26
            if (r5 < r2) goto L_0x0053
            java.lang.Class r5 = r1.getClass()     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = "getImei"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0048 }
            java.lang.reflect.Method r5 = r5.getMethod(r2, r4)     // Catch:{ Exception -> 0x0048 }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0048 }
            java.lang.Object r5 = r5.invoke(r1, r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0048 }
            r0 = r5
        L_0x0048:
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0058 }
            if (r5 == 0) goto L_0x0062
            java.lang.String r0 = r1.getDeviceId()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0062
        L_0x0053:
            java.lang.String r0 = r1.getDeviceId()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0062
        L_0x0058:
            r5 = move-exception
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.m22463w(r1, r5)
        L_0x0062:
            sImei = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getImeiNew(android.content.Context):java.lang.String");
    }

    public static String getImsi(Context context) {
        if (!TextUtils.isEmpty(sImsi)) {
            return sImsi;
        }
        String str = null;
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (FieldManager.allow(UMConstant.f17918ai)) {
            try {
                if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                    str = telephonyManager.getSubscriberId();
                }
            } catch (Throwable unused) {
            }
        }
        sImsi = str;
        return str;
    }

    private static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            MLog.m22446e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return locale;
    }

    public static String[] getLocaleInfo(Context context) {
        String str = "Unknown";
        String[] strArr = {str, str};
        if (context == null) {
            return strArr;
        }
        try {
            Locale locale = getLocale(context);
            if (locale != null) {
                strArr[0] = locale.getCountry();
                strArr[1] = locale.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = str;
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = str;
            }
            return strArr;
        } catch (Throwable th) {
            MLog.m22444e(LOG_TAG, "error in getLocaleInfo", th);
            return strArr;
        }
    }

    public static String getMCCMNC(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (getImsi(context) == null) {
                return null;
            }
            int i = context.getResources().getConfiguration().mcc;
            int i2 = context.getResources().getConfiguration().mnc;
            if (i != 0) {
                String valueOf = String.valueOf(i2);
                if (i2 < 10) {
                    valueOf = String.format("%02d", new Object[]{Integer.valueOf(i2)});
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(String.valueOf(i));
                stringBuffer.append(valueOf);
                return stringBuffer.toString();
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public static String getMac(Context context) {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        String str = "";
        if (FieldManager.allow(UMConstant.f17929h)) {
            if (context == null) {
                return str;
            }
            int i = VERSION.SDK_INT;
            if (i < 23) {
                str = getMacBySystemInterface(context);
            } else if (i == 23) {
                str = getMacByJavaAPI();
                if (TextUtils.isEmpty(str)) {
                    if (AnalyticsConstants.CHECK_DEVICE) {
                        str = getMacShell();
                    } else {
                        str = getMacBySystemInterface(context);
                    }
                }
            } else {
                str = getMacByJavaAPI();
                if (TextUtils.isEmpty(str)) {
                    str = getMacBySystemInterface(context);
                }
            }
        }
        sWifiMac = str;
        return str;
    }

    private static String getMacByJavaAPI() {
        try {
            if (!FieldManager.allow(UMConstant.f17929h)) {
                return null;
            }
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) networkInterfaces.nextElement();
                if (!"wlan0".equals(networkInterface.getName())) {
                    if ("eth0".equals(networkInterface.getName())) {
                    }
                }
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    return null;
                }
                if (hardwareAddress.length == 0) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (byte valueOf : hardwareAddress) {
                    sb.append(String.format("%02X:", new Object[]{Byte.valueOf(valueOf)}));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString().toLowerCase(Locale.getDefault());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getMacBySystemInterface(Context context) {
        String str = "";
        if (context == null) {
            return str;
        }
        try {
            if (FieldManager.allow(UMConstant.f17929h)) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                    return wifiManager != null ? wifiManager.getConnectionInfo().getMacAddress() : str;
                }
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m22464w(LOG_TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
                }
            }
            return str;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = LOG_TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not get mac address.");
                sb.append(th.toString());
                MLog.m22464w(str2, sb.toString());
            }
            return str;
        }
    }

    private static String getMacShell() {
        try {
            if (FieldManager.allow(UMConstant.f17929h)) {
                String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"};
                for (int i = 0; i < 3; i++) {
                    String reaMac = reaMac(strArr[i]);
                    if (reaMac != null) {
                        return reaMac;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getMeid(Context context) {
        String str = null;
        if (context == null || ((TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        if (FieldManager.allow(UMConstant.f17919aj)) {
            try {
                if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                    if (VERSION.SDK_INT < 26) {
                        str = getIMEI(context);
                    } else {
                        str = meid(context);
                        if (TextUtils.isEmpty(str)) {
                            str = getIMEI(context);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static String[] getNetworkAccessMode(Context context) {
        String str = "";
        String[] strArr = {str, str};
        if (context == null) {
            return strArr;
        }
        try {
            if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                strArr[0] = str;
                return strArr;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                strArr[0] = str;
                return strArr;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo == null || networkInfo.getState() != State.CONNECTED) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null && networkInfo2.getState() == State.CONNECTED) {
                    strArr[0] = "2G/3G";
                    strArr[1] = networkInfo2.getSubtypeName();
                }
                return strArr;
            }
            strArr[0] = "Wi-Fi";
            return strArr;
        } catch (Throwable unused) {
        }
    }

    public static String getNetworkOperatorName(Context context) {
        String str = "";
        if (context == null) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public static int getNetworkType(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Exception unused) {
            return -100;
        }
    }

    public static String getOaid(Context context) {
        String str = "";
        if (!FieldManager.allow(UMConstant.f17889G)) {
            return str;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(OaidTracking.f17740a, 0);
            return sharedPreferences != null ? sharedPreferences.getString(OaidTracking.f17741b, str) : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String getPackageName(Context context) {
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static String getRegisteredOperator(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                str = telephonyManager.getNetworkOperator();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public static int[] getResolutionArray(Context context) {
        int i;
        int i2;
        if (context == null) {
            return null;
        }
        int[] iArr = new int[2];
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (VERSION.SDK_INT >= 17) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                try {
                    Method method = Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class});
                    if (method != null) {
                        method.invoke(defaultDisplay, new Object[]{displayMetrics});
                        int i3 = displayMetrics.widthPixels;
                        int i4 = displayMetrics.heightPixels;
                        if (i3 > i4) {
                            iArr[0] = i4;
                            iArr[1] = i3;
                        } else {
                            iArr[0] = i3;
                            iArr[1] = i4;
                        }
                        iArr[0] = i3;
                        iArr[1] = i4;
                        return iArr;
                    }
                } catch (Throwable unused) {
                    return null;
                }
            } else {
                try {
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics2);
                    if ((context.getApplicationInfo().flags & 8192) == 0) {
                        i = reflectMetrics(displayMetrics2, "noncompatWidthPixels");
                        i2 = reflectMetrics(displayMetrics2, "noncompatHeightPixels");
                    } else {
                        i = -1;
                        i2 = -1;
                    }
                    if (i == -1 || i2 == -1) {
                        i = displayMetrics2.widthPixels;
                        i2 = displayMetrics2.heightPixels;
                    }
                    if (i > i2) {
                        iArr[0] = i2;
                        iArr[1] = i;
                    } else {
                        iArr[0] = i;
                        iArr[1] = i2;
                    }
                    return iArr;
                } catch (Throwable unused2) {
                }
            }
        }
        return null;
    }

    public static String getSecondSimIMEi(Context context) {
        String str = null;
        if (context != null && FieldManager.allow(UMConstant.f17921al) && VERSION.SDK_INT >= 23 && UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return null;
                }
                Class cls = telephonyManager.getClass();
                if (((Integer) cls.getMethod("getPhoneCount", new Class[0]).invoke(telephonyManager, new Object[0])).intValue() == 2) {
                    str = (String) cls.getMethod("getDeviceId", new Class[]{Integer.TYPE}).invoke(telephonyManager, new Object[]{Integer.valueOf(2)});
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static String getSerial() {
        if (!FieldManager.allow(UMConstant.f17931j)) {
            return null;
        }
        int i = VERSION.SDK_INT;
        if (i < 9) {
            return null;
        }
        if (i < 26) {
            return Build.SERIAL;
        }
        try {
            Class cls = Class.forName("android.os.Build");
            return (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getSerialNo() {
        /*
            java.lang.String r0 = "header_device_id_serialNo"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002d
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 9
            if (r0 < r2) goto L_0x002d
            r2 = 26
            if (r0 < r2) goto L_0x002a
            java.lang.String r0 = "android.os.Build"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "getSerial"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x002d }
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch:{ all -> 0x002d }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002a:
            java.lang.String r0 = android.os.Build.SERIAL
            goto L_0x002f
        L_0x002d:
            java.lang.String r0 = ""
        L_0x002f:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L_0x004e
            java.lang.String r2 = LOG_TAG
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getDeviceId, serial no: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3[r1] = r4
            com.umeng.commonsdk.statistics.common.MLog.m22452i(r2, r3)
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getSerialNo():java.lang.String");
    }

    public static String getSimICCID(Context context) {
        String str = null;
        if (FieldManager.allow(UMConstant.f17922am) && context != null) {
            try {
                if (UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        return null;
                    }
                    str = telephonyManager.getSimSerialNumber();
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static String getSubOSName(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (!TextUtils.isEmpty(property)) {
                return "MIUI";
            }
            if (isFlyMe()) {
                return "Flyme";
            }
            if (isEmui(buildProp)) {
                return "Emui";
            }
            return !TextUtils.isEmpty(getYunOSVersion(buildProp)) ? "YunOS" : property;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            if (isFlyMe()) {
                try {
                    return getFlymeVersion(buildProp);
                } catch (Throwable unused) {
                    return property;
                }
            } else if (isEmui(buildProp)) {
                return getEmuiVersion(buildProp);
            } else {
                return getYunOSVersion(buildProp);
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int getTimeZone(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar instance = Calendar.getInstance(getLocale(context));
            if (instance != null) {
                return instance.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Throwable th) {
            MLog.m22450i(LOG_TAG, "error in getTimeZone", th);
        }
        return 8;
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

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isChineseAera(android.content.Context r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "country"
            java.lang.String r2 = ""
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r5, r1, r2)     // Catch:{ all -> 0x005e }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "cn"
            r4 = 1
            if (r2 != 0) goto L_0x001d
            boolean r5 = r1.equals(r3)     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x001c
            return r4
        L_0x001c:
            return r0
        L_0x001d:
            java.lang.String r1 = getImsi(r5)     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0036
            java.lang.String[] r5 = getLocaleInfo(r5)     // Catch:{ all -> 0x005e }
            r5 = r5[r0]     // Catch:{ all -> 0x005e }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x005e
            boolean r5 = r5.equalsIgnoreCase(r3)     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x005e
            return r4
        L_0x0036:
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ all -> 0x005e }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x005e }
            int r1 = r1.mcc     // Catch:{ all -> 0x005e }
            r2 = 460(0x1cc, float:6.45E-43)
            if (r1 == r2) goto L_0x005d
            r2 = 461(0x1cd, float:6.46E-43)
            if (r1 != r2) goto L_0x0049
            goto L_0x005d
        L_0x0049:
            if (r1 != 0) goto L_0x005e
            java.lang.String[] r5 = getLocaleInfo(r5)     // Catch:{ all -> 0x005e }
            r5 = r5[r0]     // Catch:{ all -> 0x005e }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x005e
            boolean r5 = r5.equalsIgnoreCase(r3)     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x005e
        L_0x005d:
            return r4
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.isChineseAera(android.content.Context):boolean");
    }

    private static boolean isEmui(Properties properties) {
        try {
            if (properties.getProperty(KEY_EMUI_VERSION_CODE, null) != null) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isOnline(Context context) {
        if (context == null) {
            return false;
        }
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
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    private static String meid(Context context) {
        if (TextUtils.isEmpty(sMeid)) {
            return sMeid;
        }
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            Object invoke = Class.forName("android.telephony.TelephonyManager").getMethod("getMeid", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null && (invoke instanceof String)) {
                str = (String) invoke;
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("meid:");
            sb.append(th.getMessage());
            ULog.m22473e(sb.toString());
        }
        sMeid = str;
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|3|4|5|6|7|8|9|10) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|(2:14|15)|(2:18|19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0026 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0023 A[SYNTHETIC, Splitter:B:18:0x0023] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:9:0x0014=Splitter:B:9:0x0014, B:20:0x0026=Splitter:B:20:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String reaMac(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0027 }
            r1.<init>(r3)     // Catch:{ all -> 0x0027 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x001a }
            r2 = 1024(0x400, float:1.435E-42)
            r3.<init>(r1, r2)     // Catch:{ all -> 0x001a }
            java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x0018 }
            r1.close()     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r3.close()     // Catch:{ all -> 0x0027 }
            goto L_0x0027
        L_0x0018:
            r2 = move-exception
            goto L_0x001c
        L_0x001a:
            r2 = move-exception
            r3 = r0
        L_0x001c:
            r1.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            if (r3 == 0) goto L_0x0026
            r3.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r2     // Catch:{ all -> 0x0027 }
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.reaMac(java.lang.String):java.lang.String");
    }

    private static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
