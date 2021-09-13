package com.umeng.umcrash;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.p259uc.crashsdk.export.CrashApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UMCrashUtils {
    public static final String UNKNOW = "";

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
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umcrash.UMCrashUtils.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static String[] getActiveUser(Context context) {
        Class cls;
        Method method;
        String[] strArr = null;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.utils.UMUtils");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getActiveUser", new Class[]{Context.class});
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[]{context});
                    if (invoke != null) {
                        strArr = (String[]) invoke;
                    }
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                }
            }
        }
        return strArr;
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

    public static void setPuidAndProvider(String str, String str2) {
        if (CrashApi.getInstance() != null) {
            CrashApi.getInstance().addHeaderInfo(UMCrash.KEY_HEADER_PUID, str);
            CrashApi.getInstance().addHeaderInfo(UMCrash.KEY_HEADER_PROVIDER, str2);
        }
    }

    public static String splitByByte(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        try {
            int length = str.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                String valueOf = String.valueOf(str.charAt(i3));
                i2 += valueOf.getBytes().length;
                if (i < i2) {
                    break;
                }
                stringBuffer.append(valueOf);
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }
}
