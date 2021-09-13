package androidx.core.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.e */
public final class BundleCompat {

    /* renamed from: androidx.core.app.e$a */
    /* compiled from: BundleCompat */
    static class C0247a {

        /* renamed from: a */
        private static Method f1976a;

        /* renamed from: b */
        private static boolean f1977b;

        /* renamed from: a */
        public static IBinder m1728a(Bundle bundle, String str) {
            String str2 = "BundleCompatBaseImpl";
            if (!f1977b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1976a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve getIBinder method", e);
                }
                f1977b = true;
            }
            Method method2 = f1976a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke getIBinder via reflection", e2);
                    f1976a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m1727a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0247a.m1728a(bundle, str);
    }
}
