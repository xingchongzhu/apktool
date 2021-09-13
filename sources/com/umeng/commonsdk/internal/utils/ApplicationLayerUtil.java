package com.umeng.commonsdk.internal.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.umeng.commonsdk.internal.utils.a */
public class ApplicationLayerUtil {

    /* renamed from: com.umeng.commonsdk.internal.utils.a$a */
    /* compiled from: ApplicationLayerUtil */
    public static class C3201a {

        /* renamed from: a */
        public String f17537a;

        /* renamed from: b */
        public String f17538b;
    }

    /* renamed from: com.umeng.commonsdk.internal.utils.a$b */
    /* compiled from: ApplicationLayerUtil */
    public static class C3202b {

        /* renamed from: a */
        public int f17539a;

        /* renamed from: b */
        public String f17540b;

        /* renamed from: c */
        public String f17541c;

        /* renamed from: d */
        public int f17542d;

        /* renamed from: e */
        public int f17543e;

        /* renamed from: f */
        public int f17544f;

        /* renamed from: g */
        public int f17545g;

        /* renamed from: h */
        public String f17546h;

        /* renamed from: i */
        public int f17547i;

        /* renamed from: j */
        public int f17548j;

        /* renamed from: k */
        public int f17549k;

        /* renamed from: l */
        public long f17550l;
    }

    /* renamed from: a */
    public static long m22302a(Context context, String str) {
        long j = 0;
        if (context == null) {
            return j;
        }
        try {
            j = context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (NameNotFoundException e) {
            UMCrashManager.reportCrash(context, e);
            StringBuilder sb = new StringBuilder();
            sb.append("getAppFirstInstallTime");
            sb.append(e.getMessage());
            ULog.m22473e(sb.toString());
        }
        return j;
    }

    /* renamed from: b */
    public static long m22304b(Context context, String str) {
        long j = 0;
        if (context == null) {
            return j;
        }
        try {
            j = context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (NameNotFoundException e) {
            UMCrashManager.reportCrash(context, e);
            StringBuilder sb = new StringBuilder();
            sb.append("getAppLastUpdateTime:");
            sb.append(e.getMessage());
            ULog.m22473e(sb.toString());
        }
        return j;
    }

    /* renamed from: c */
    public static String m22308c(Context context, String str) {
        try {
            return context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            StringBuilder sb = new StringBuilder();
            sb.append("getAppInstaller:");
            sb.append(e.getMessage());
            ULog.m22473e(sb.toString());
            return null;
        }
    }

    /* renamed from: d */
    public static int m22310d(Context context, String str) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (applicationInfo != null) {
                i = applicationInfo.uid;
            }
            return i;
        } catch (NameNotFoundException e) {
            UMCrashManager.reportCrash(context, e);
            StringBuilder sb = new StringBuilder();
            sb.append("getAppUid:");
            sb.append(e.getMessage());
            ULog.m22473e(sb.toString());
            return 0;
        }
    }

    /* renamed from: e */
    public static void m22315e(Context context) {
        if (context != null) {
            InfoPreference.m22349b(context);
        }
    }

    /* renamed from: f */
    public static int m22316f(Context context) {
        int i = -1;
        if (context == null) {
            return -1;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                i = wifiManager.getWifiState();
            }
        }
        return i;
    }

    /* renamed from: g */
    public static int m22317g(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: h */
    public static int m22318h(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: i */
    public static DisplayMetrics m22319i(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
    }

    /* renamed from: j */
    public static List<InputMethodInfo> m22320j(Context context) {
        if (context == null) {
            return null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return null;
        }
        return inputMethodManager.getInputMethodList();
    }

    /* renamed from: k */
    public static List<C3201a> m22321k(Context context) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/Android/data/");
            File file = new File(sb.toString());
            if (file.isDirectory()) {
                String[] list = file.list();
                if (list != null && list.length > 0) {
                    for (String str : list) {
                        if (str != null && !str.startsWith(".")) {
                            C3201a aVar = new C3201a();
                            aVar.f17537a = str;
                            aVar.f17538b = m22314e(context, str);
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getAppList:");
            sb2.append(e.getMessage());
            ULog.m22473e(sb2.toString());
        }
        return arrayList;
    }

    /* renamed from: l */
    public static MemoryInfo m22322l(Context context) {
        if (context == null) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: m */
    public static String m22323m(Context context) {
        if (context == null) {
        }
        return null;
    }

    /* renamed from: n */
    public static String m22324n(Context context) {
        return null;
    }

    /* renamed from: e */
    private static String m22314e(Context context, String str) {
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                str2 = (String) applicationInfo.loadLabel(context.getPackageManager());
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getLabel:");
            sb.append(e.getMessage());
            ULog.m22473e(sb.toString());
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f A[Catch:{ Exception -> 0x00a3 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22309c(android.content.Context r8) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.net.wifi.WifiInfo r0 = m22305b(r8)
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            com.umeng.commonsdk.internal.utils.a$b r1 = new com.umeng.commonsdk.internal.utils.a$b
            r1.<init>()
            int r2 = r0.describeContents()
            r1.f17539a = r2
            java.lang.String r2 = r0.getBSSID()
            r1.f17540b = r2
            java.lang.String r2 = r0.getSSID()
            r1.f17541c = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x002e
            int r2 = r0.getFrequency()
            r1.f17542d = r2
            goto L_0x0031
        L_0x002e:
            r2 = -1
            r1.f17542d = r2
        L_0x0031:
            boolean r2 = r0.getHiddenSSID()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003c
            r1.f17543e = r3
            goto L_0x003e
        L_0x003c:
            r1.f17543e = r4
        L_0x003e:
            java.lang.String r2 = "header_local_ip"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)
            if (r2 == 0) goto L_0x004c
            int r2 = r0.getIpAddress()
            r1.f17544f = r2
        L_0x004c:
            int r2 = r0.getLinkSpeed()
            r1.f17545g = r2
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMac(r8)
            r1.f17546h = r2
            int r2 = r0.getNetworkId()
            r1.f17547i = r2
            int r0 = r0.getRssi()
            r1.f17548j = r0
            int r0 = m22316f(r8)
            r1.f17549k = r0
            long r5 = java.lang.System.currentTimeMillis()
            r1.f17550l = r5
            org.json.JSONArray r0 = com.umeng.commonsdk.internal.utils.InfoPreference.m22346a(r8)     // Catch:{ Exception -> 0x00a3 }
            if (r0 == 0) goto L_0x009c
            int r2 = r0.length()     // Catch:{ Exception -> 0x00a3 }
            if (r2 <= 0) goto L_0x009c
            r2 = 0
        L_0x007d:
            int r5 = r0.length()     // Catch:{ Exception -> 0x00a3 }
            if (r2 >= r5) goto L_0x009c
            org.json.JSONObject r5 = r0.optJSONObject(r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r6 = "ssid"
            r7 = 0
            java.lang.String r5 = r5.optString(r6, r7)     // Catch:{ Exception -> 0x00a3 }
            if (r5 == 0) goto L_0x0099
            java.lang.String r6 = r1.f17541c     // Catch:{ Exception -> 0x00a3 }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x00a3 }
            if (r5 == 0) goto L_0x0099
            goto L_0x009d
        L_0x0099:
            int r2 = r2 + 1
            goto L_0x007d
        L_0x009c:
            r3 = 0
        L_0x009d:
            if (r3 != 0) goto L_0x00bc
            com.umeng.commonsdk.internal.utils.InfoPreference.m22347a(r8, r1)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00bc
        L_0x00a3:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "wifiChange:"
            r0.append(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.umeng.commonsdk.statistics.common.ULog.m22473e(r8)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22309c(android.content.Context):void");
    }

    /* renamed from: a */
    public static boolean m22303a() {
        return Root.m22356a();
    }

    /* renamed from: b */
    public static String m22306b() {
        return new SimpleDateFormat().format(new Date());
    }

    /* renamed from: e */
    public static String m22313e() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            String obj = declaredMethod.invoke(null, new Object[]{"net.hostname"}).toString();
            if (obj == null || obj.equalsIgnoreCase("")) {
                return obj;
            }
            return HelperUtils.getUmengMD5(obj);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getHostName:");
            sb.append(e.getMessage());
            ULog.m22473e(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static float m22301a(Context context) {
        float f = 0.0f;
        if (context == null) {
            return f;
        }
        Configuration configuration = new Configuration();
        try {
            configuration.updateFrom(context.getResources().getConfiguration());
            f = configuration.fontScale;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getFontSize:");
            sb.append(e.getMessage());
            ULog.m22473e(sb.toString());
        }
        return f;
    }

    /* renamed from: d */
    public static JSONArray m22312d(Context context) {
        if (context == null) {
            return null;
        }
        return InfoPreference.m22346a(context);
    }

    /* renamed from: b */
    public static WifiInfo m22305b(Context context) {
        WifiInfo wifiInfo = null;
        if (context == null) {
            return null;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                wifiInfo = wifiManager.getConnectionInfo();
            }
        }
        return wifiInfo;
    }

    /* renamed from: d */
    public static long m22311d() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public static String m22307c() {
        return ProcessUtil.m22351a("df");
    }
}
