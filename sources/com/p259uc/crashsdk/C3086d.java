package com.p259uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.p259uc.crashsdk.export.ICrashClient;
import com.p259uc.crashsdk.p260a.C3075a;
import com.p259uc.crashsdk.p260a.C3081g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.uc.crashsdk.d */
/* compiled from: ProGuard */
public final class C3086d {

    /* renamed from: a */
    private static ICrashClient f16370a = null;

    /* renamed from: b */
    private static int f16371b = 3;

    /* renamed from: c */
    private static volatile List<ValueCallback<Bundle>> f16372c;

    /* renamed from: d */
    private static volatile List<ValueCallback<Bundle>> f16373d;

    /* renamed from: e */
    private static volatile List<ValueCallback<Bundle>> f16374e;

    /* renamed from: f */
    private static volatile List<ValueCallback<Bundle>> f16375f;

    /* renamed from: g */
    private static final Object f16376g = new Object();

    /* renamed from: a */
    public static void m21174a(ICrashClient iCrashClient) {
        f16370a = iCrashClient;
    }

    /* renamed from: b */
    public static boolean m21179b(ValueCallback<Bundle> valueCallback) {
        if (f16373d == null) {
            synchronized (f16376g) {
                if (f16373d == null) {
                    f16373d = new ArrayList();
                }
            }
        }
        synchronized (f16373d) {
            if (f16373d.size() >= f16371b) {
                return false;
            }
            f16373d.add(valueCallback);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m21180c(ValueCallback<Bundle> valueCallback) {
        if (f16374e == null) {
            synchronized (f16376g) {
                if (f16374e == null) {
                    f16374e = new ArrayList();
                }
            }
        }
        synchronized (f16374e) {
            if (f16374e.size() >= f16371b) {
                return false;
            }
            f16374e.add(valueCallback);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m21181d(ValueCallback<Bundle> valueCallback) {
        if (f16375f == null) {
            synchronized (f16376g) {
                if (f16375f == null) {
                    f16375f = new ArrayList();
                }
            }
        }
        synchronized (f16375f) {
            if (f16375f.size() >= f16371b) {
                return false;
            }
            f16375f.add(valueCallback);
            return true;
        }
    }

    /* renamed from: a */
    public static void m21176a(String str, String str2, String str3) {
        if (C3081g.m21032a(str)) {
            C3075a.m20977a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean equals = C3087e.m21281h().equals(str2);
        if (f16370a != null) {
            File file = new File(str);
            if (equals) {
                try {
                    f16370a.onLogGenerated(file, str3);
                } catch (Throwable th) {
                    C3081g.m21027a(th);
                }
            } else {
                f16370a.onClientProcessLogGenerated(str2, file, str3);
            }
        }
        List<ValueCallback<Bundle>> list = f16372c;
        if (!equals) {
            list = f16373d;
        }
        if (list != null) {
            synchronized (list) {
                for (ValueCallback valueCallback : list) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("filePathName", str);
                        if (!equals) {
                            bundle.putString("processName", str2);
                        }
                        bundle.putString("logType", str3);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C3081g.m21027a(th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static File m21172a(File file) {
        ICrashClient iCrashClient = f16370a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
        }
        return file;
    }

    /* renamed from: a */
    public static void m21177a(boolean z) {
        ICrashClient iCrashClient = f16370a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z);
            } catch (Throwable th) {
                C3081g.m21027a(th);
            }
        }
        if (f16374e != null) {
            synchronized (f16374e) {
                for (ValueCallback valueCallback : f16374e) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isJava", z);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C3081g.m21027a(th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m21175a(String str, int i, int i2) {
        ICrashClient iCrashClient = f16370a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i, i2);
        }
        if (f16375f != null) {
            synchronized (f16375f) {
                for (ValueCallback valueCallback : f16375f) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("processName", str);
                        bundle.putInt("key", i);
                        bundle.putInt("count", i2);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th) {
                        C3081g.m21027a(th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m21173a(String str, boolean z) {
        ICrashClient iCrashClient = f16370a;
        return iCrashClient != null ? iCrashClient.onGetCallbackInfo(str, z) : "";
    }

    /* renamed from: a */
    public static boolean m21178a(ValueCallback<Bundle> valueCallback) {
        if (f16372c == null) {
            synchronized (f16376g) {
                if (f16372c == null) {
                    f16372c = new ArrayList();
                }
            }
        }
        synchronized (f16372c) {
            if (f16372c.size() >= f16371b) {
                return false;
            }
            f16372c.add(valueCallback);
            return true;
        }
    }
}
