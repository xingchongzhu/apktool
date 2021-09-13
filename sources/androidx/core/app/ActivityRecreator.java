package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
final class ActivityRecreator {

    /* renamed from: a */
    protected static final Class<?> f1957a;

    /* renamed from: b */
    protected static final Field f1958b = m1717b();

    /* renamed from: c */
    protected static final Field f1959c = m1721f();

    /* renamed from: d */
    protected static final Method f1960d;

    /* renamed from: e */
    protected static final Method f1961e;

    /* renamed from: f */
    protected static final Method f1962f;

    /* renamed from: g */
    private static final Handler f1963g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    /* compiled from: ActivityRecreator */
    class C0243a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0246d f1964a;

        /* renamed from: b */
        final /* synthetic */ Object f1965b;

        C0243a(C0246d dVar, Object obj) {
            this.f1964a = dVar;
            this.f1965b = obj;
        }

        public void run() {
            this.f1964a.f1970a = this.f1965b;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    /* compiled from: ActivityRecreator */
    class C0244b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Application f1966a;

        /* renamed from: b */
        final /* synthetic */ C0246d f1967b;

        C0244b(Application application, C0246d dVar) {
            this.f1966a = application;
            this.f1967b = dVar;
        }

        public void run() {
            this.f1966a.unregisterActivityLifecycleCallbacks(this.f1967b);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    /* compiled from: ActivityRecreator */
    class C0245c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f1968a;

        /* renamed from: b */
        final /* synthetic */ Object f1969b;

        C0245c(Object obj, Object obj2) {
            this.f1968a = obj;
            this.f1969b = obj2;
        }

        public void run() {
            try {
                Method method = ActivityRecreator.f1960d;
                if (method != null) {
                    method.invoke(this.f1968a, new Object[]{this.f1969b, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                ActivityRecreator.f1961e.invoke(this.f1968a, new Object[]{this.f1969b, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    /* compiled from: ActivityRecreator */
    private static final class C0246d implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f1970a;

        /* renamed from: b */
        private Activity f1971b;

        /* renamed from: c */
        private final int f1972c;

        /* renamed from: d */
        private boolean f1973d = false;

        /* renamed from: e */
        private boolean f1974e = false;

        /* renamed from: f */
        private boolean f1975f = false;

        C0246d(Activity activity) {
            this.f1971b = activity;
            this.f1972c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1971b == activity) {
                this.f1971b = null;
                this.f1974e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1974e && !this.f1975f && !this.f1973d && ActivityRecreator.m1723h(this.f1970a, this.f1972c, activity)) {
                this.f1975f = true;
                this.f1970a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1971b == activity) {
                this.f1973d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m1716a();
        f1957a = a;
        f1960d = m1719d(a);
        f1961e = m1718c(a);
        f1962f = m1720e(a);
    }

    /* renamed from: a */
    private static Class<?> m1716a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m1717b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m1718c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m1719d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m1720e(Class<?> cls) {
        if (m1722g() && cls != null) {
            String str = "requestRelaunchActivity";
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod(str, new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m1721f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m1722g() {
        int i = VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m1723h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f1959c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f1963g.postAtFrontOfQueue(new C0245c(f1958b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m1724i(Activity activity) {
        Application application;
        C0246d dVar;
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m1722g() && f1962f == null) {
            return false;
        } else {
            if (f1961e == null && f1960d == null) {
                return false;
            }
            try {
                Object obj = f1959c.get(activity);
                if (obj == null) {
                    return false;
                }
                Object obj2 = f1958b.get(activity);
                if (obj2 == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0246d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f1963g;
                handler.post(new C0243a(dVar, obj));
                if (m1722g()) {
                    Method method = f1962f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj2, new Object[]{obj, null, null, Integer.valueOf(0), bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C0244b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
