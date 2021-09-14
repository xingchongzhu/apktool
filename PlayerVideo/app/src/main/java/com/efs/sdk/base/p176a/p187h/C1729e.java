package com.efs.sdk.base.p176a.p187h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

/* renamed from: com.efs.sdk.base.a.h.e */
public final class C1729e {
    /* renamed from: a */
    public static NetworkInfo m14310a(Context context) {
        String str = "efs.base";
        NetworkInfo networkInfo = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                C1728d.m14308a(str, "get CONNECTIVITY_SERVICE is null", null);
                return null;
            }
            networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
                if (allNetworkInfo != null) {
                    int i = 0;
                    while (true) {
                        if (i < allNetworkInfo.length) {
                            if (allNetworkInfo[i] != null && allNetworkInfo[i].isConnected()) {
                                networkInfo = allNetworkInfo[i];
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
            }
            return networkInfo;
        } catch (Throwable th) {
            C1728d.m14309b(str, "get network info error", th);
        }
    }

    /* renamed from: b */
    public static String m14311b(Context context) {
        if (m14313d(context)) {
            return "denied";
        }
        NetworkInfo a = m14310a(context);
        if (a == null) {
            return "disconnected";
        }
        if (a.getType() == 1) {
            return "wifi";
        }
        int subtype = a.getSubtype();
        if (subtype == 20) {
            return "5g";
        }
        String str = "3g";
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2g";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return str;
            case 13:
                return "4g";
            default:
                String subtypeName = a.getSubtypeName();
                if (TextUtils.isEmpty(subtypeName)) {
                    return "unknown";
                }
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? str : subtypeName;
        }
    }

    /* renamed from: c */
    private static boolean m14312c(Context context) {
        try {
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m14313d(Context context) {
        return !m14312c(context);
    }
}
