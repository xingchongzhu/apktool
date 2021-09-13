package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.j */
class ResourcesFlusher {

    /* renamed from: a */
    private static Field f393a;

    /* renamed from: b */
    private static boolean f394b;

    /* renamed from: c */
    private static Class<?> f395c;

    /* renamed from: d */
    private static boolean f396d;

    /* renamed from: e */
    private static Field f397e;

    /* renamed from: f */
    private static boolean f398f;

    /* renamed from: g */
    private static Field f399g;

    /* renamed from: h */
    private static boolean f400h;

    /* renamed from: a */
    static void m453a(Resources resources) {
        int i = VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m456d(resources);
            } else if (i >= 23) {
                m455c(resources);
            } else if (i >= 21) {
                m454b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m454b(Resources resources) {
        String str = "ResourcesFlusher";
        if (!f394b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f393a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f394b = true;
        }
        Field field = f393a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m455c(Resources resources) {
        String str = "ResourcesFlusher";
        if (!f394b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f393a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f394b = true;
        }
        Object obj = null;
        Field field = f393a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m457e(obj);
        }
    }

    /* renamed from: d */
    private static void m456d(Resources resources) {
        Object obj;
        String str = "ResourcesFlusher";
        if (!f400h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f399g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f400h = true;
        }
        Field field = f399g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f394b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f393a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e(str, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f394b = true;
                }
                Field field2 = f393a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e(str, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m457e(obj2);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m457e(Object obj) {
        String str = "ResourcesFlusher";
        if (!f396d) {
            try {
                f395c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(str, "Could not find ThemedResourceCache class", e);
            }
            f396d = true;
        }
        Class<?> cls = f395c;
        if (cls != null) {
            if (!f398f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f397e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e(str, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f398f = true;
            }
            Field field = f397e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e(str, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
