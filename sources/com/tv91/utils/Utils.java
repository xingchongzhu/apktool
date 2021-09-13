package com.tv91.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* renamed from: com.tv91.utils.h */
public final class Utils {
    /* renamed from: a */
    public static String m20590a() {
        switch (VERSION.SDK_INT) {
            case 14:
                return "Jelly Bean 4.0";
            case 16:
                return "Jelly Bean 4.1";
            case 17:
                return "Jelly Bean 4.2";
            case 18:
                return "Jelly Bean 4.3";
            case 19:
                return "Kitkat 4.4";
            case 21:
                return "Lollipop 5.0";
            case 22:
                return "Lollipop 5.1";
            case 23:
                return "Marshmallow 6.0";
            case 24:
                return "Nougat 7.0";
            case 25:
                return "Nougat 7.1";
            case 26:
                return "Oreo 8.0";
            case 27:
                return "Oreo 8.1";
            case 28:
                return "Android 9";
            case 29:
                return "Android 10";
            case 30:
                return "Android 11";
            default:
                return "Unknown";
        }
    }

    /* renamed from: b */
    public static String m20591b() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                        String hostAddress = inetAddress.getHostAddress();
                        if (!inetAddress.isLoopbackAddress() && !C3052g.m20586g(hostAddress)) {
                            if (inetAddress instanceof Inet4Address) {
                                return hostAddress;
                            }
                            if ((inetAddress instanceof Inet6Address) && ((Inet6Address) inetAddress).isIPv4CompatibleAddress()) {
                                int indexOf = hostAddress.indexOf("%");
                                return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                            }
                        }
                    }
                }
            }
        } catch (SocketException unused) {
        }
        return "127.0.0.1";
    }

    /* renamed from: c */
    private static int m20592c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return -1;
        }
        int type = activeNetworkInfo.getType();
        if (type == 7) {
            return 5;
        }
        if (type == 1) {
            return 4;
        }
        if (type != 0) {
            return 0;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 1;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 2;
            case 13:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    public static String m20593d(Context context) {
        int c = m20592c(context);
        if (c == -1) {
            return "Unavailable";
        }
        if (c == 1) {
            return "2G";
        }
        if (c == 2) {
            return "3G";
        }
        if (c != 3) {
            return c != 4 ? "Unknown" : "Wifi";
        }
        return "4G";
    }

    /* renamed from: e */
    public static String m20594e() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        return sb.toString();
    }

    /* renamed from: f */
    public static int m20595f(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* renamed from: g */
    public static boolean m20596g(Context context) {
        return m20592c(context) != -1;
    }

    /* renamed from: h */
    public static boolean m20597h(Context context) {
        return m20592c(context) == 4;
    }
}
