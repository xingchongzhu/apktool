package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.util.Formatter;
import java.util.Locale;

public class MLog {
    public static boolean DEBUG = false;
    private static final int LEVEL_DEBUG = 2;
    private static final int LEVEL_ERROR = 5;
    private static final int LEVEL_INFO = 3;
    private static final int LEVEL_VERBOSE = 1;
    private static final int LEVEL_WARN = 4;
    private static int LOG_MAXLENGTH = 2000;
    private static String TAG = "MobclickAgent";

    private MLog() {
    }

    /* renamed from: d */
    public static void m22442d(Locale locale, String str, Object... objArr) {
        try {
            m22438d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* renamed from: e */
    public static void m22448e(Locale locale, String str, Object... objArr) {
        try {
            m22444e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[SYNTHETIC, Splitter:B:18:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getStackTrace(java.lang.Throwable r3) {
        /*
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x0022 }
            r1.<init>()     // Catch:{ all -> 0x0022 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x001f }
            r2.<init>(r1)     // Catch:{ all -> 0x001f }
            r3.printStackTrace(r2)     // Catch:{ all -> 0x0020 }
            r2.flush()     // Catch:{ all -> 0x0020 }
            r1.flush()     // Catch:{ all -> 0x0020 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0020 }
            r1.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2.close()
            goto L_0x0031
        L_0x001f:
            r2 = r0
        L_0x0020:
            r0 = r1
            goto L_0x0023
        L_0x0022:
            r2 = r0
        L_0x0023:
            if (r0 == 0) goto L_0x002a
            r0.close()     // Catch:{ all -> 0x0029 }
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            if (r2 == 0) goto L_0x002f
            r2.close()
        L_0x002f:
            java.lang.String r3 = ""
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.MLog.getStackTrace(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: i */
    public static void m22454i(Locale locale, String str, Object... objArr) {
        try {
            m22450i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    private static void print(int i, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i2 = LOG_MAXLENGTH;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= 100) {
                    break;
                } else if (length > i2) {
                    if (i == 1) {
                        Log.v(str, str2.substring(i4, i2));
                    } else if (i == 2) {
                        Log.d(str, str2.substring(i4, i2));
                    } else if (i == 3) {
                        Log.i(str, str2.substring(i4, i2));
                    } else if (i == 4) {
                        Log.w(str, str2.substring(i4, i2));
                    } else if (i == 5) {
                        Log.e(str, str2.substring(i4, i2));
                    }
                    i3++;
                    i4 = i2;
                    i2 = LOG_MAXLENGTH + i2;
                } else if (i == 1) {
                    Log.v(str, str2.substring(i4, length));
                } else if (i == 2) {
                    Log.d(str, str2.substring(i4, length));
                } else if (i == 3) {
                    Log.i(str, str2.substring(i4, length));
                } else if (i == 4) {
                    Log.w(str, str2.substring(i4, length));
                } else if (i == 5) {
                    Log.e(str, str2.substring(i4, length));
                }
            }
        }
        if (th != null) {
            String stackTrace = getStackTrace(th);
            if (TextUtils.isEmpty(stackTrace)) {
                return;
            }
            if (i == 1) {
                Log.v(str, stackTrace);
            } else if (i == 2) {
                Log.d(str, stackTrace);
            } else if (i == 3) {
                Log.i(str, stackTrace);
            } else if (i == 4) {
                Log.w(str, stackTrace);
            } else if (i == 5) {
                Log.e(str, stackTrace);
            }
        }
    }

    /* renamed from: v */
    public static void m22460v(Locale locale, String str, Object... objArr) {
        try {
            m22456v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* renamed from: w */
    public static void m22466w(Locale locale, String str, Object... objArr) {
        try {
            m22462w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* renamed from: d */
    public static void m22440d(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m22438d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m22438d(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* renamed from: e */
    public static void m22446e(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m22444e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m22444e(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* renamed from: i */
    public static void m22452i(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m22450i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m22450i(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* renamed from: v */
    public static void m22458v(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m22456v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m22456v(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* renamed from: w */
    public static void m22464w(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m22462w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m22462w(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m22447e(th);
        }
    }

    /* renamed from: d */
    public static void m22441d(Throwable th) {
        m22438d(TAG, (String) null, th);
    }

    /* renamed from: e */
    public static void m22447e(Throwable th) {
        m22444e(TAG, (String) null, th);
    }

    /* renamed from: i */
    public static void m22453i(Throwable th) {
        m22450i(TAG, (String) null, th);
    }

    /* renamed from: v */
    public static void m22459v(Throwable th) {
        m22456v(TAG, (String) null, th);
    }

    /* renamed from: w */
    public static void m22465w(Throwable th) {
        m22462w(TAG, (String) null, th);
    }

    /* renamed from: d */
    public static void m22439d(String str, Throwable th) {
        m22438d(TAG, str, th);
    }

    /* renamed from: e */
    public static void m22445e(String str, Throwable th) {
        m22444e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m22451i(String str, Throwable th) {
        m22450i(TAG, str, th);
    }

    /* renamed from: v */
    public static void m22457v(String str, Throwable th) {
        m22456v(TAG, str, th);
    }

    /* renamed from: w */
    public static void m22463w(String str, Throwable th) {
        m22462w(TAG, str, th);
    }

    /* renamed from: d */
    public static void m22437d(String str) {
        m22438d(TAG, str, (Throwable) null);
    }

    /* renamed from: e */
    public static void m22443e(String str) {
        m22444e(TAG, str, (Throwable) null);
    }

    /* renamed from: i */
    public static void m22449i(String str) {
        m22450i(TAG, str, (Throwable) null);
    }

    /* renamed from: v */
    public static void m22455v(String str) {
        m22456v(TAG, str, (Throwable) null);
    }

    /* renamed from: w */
    public static void m22461w(String str) {
        m22462w(TAG, str, (Throwable) null);
    }

    /* renamed from: d */
    public static void m22438d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m22444e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m22450i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m22456v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m22462w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }
}
