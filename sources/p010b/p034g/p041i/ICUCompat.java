package p010b.p034g.p041i;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: b.g.i.b */
public final class ICUCompat {

    /* renamed from: a */
    private static Method f4559a;

    /* renamed from: b */
    private static Method f4560b;

    static {
        Class<String> cls = String.class;
        String str = "libcore.icu.ICU";
        int i = VERSION.SDK_INT;
        String str2 = "addLikelySubtags";
        if (i < 21) {
            try {
                Class cls2 = Class.forName(str);
                f4559a = cls2.getMethod("getScript", new Class[]{cls});
                f4560b = cls2.getMethod(str2, new Class[]{cls});
            } catch (Exception e) {
                f4559a = null;
                f4560b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f4560b = Class.forName(str).getMethod(str2, new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m5146a(Locale locale) {
        String str = "ICUCompat";
        String locale2 = locale.toString();
        try {
            Method method = f4560b;
            if (method != null) {
                return (String) method.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w(str, e);
        } catch (InvocationTargetException e2) {
            Log.w(str, e2);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m5147b(String str) {
        String str2 = "ICUCompat";
        try {
            Method method = f4559a;
            if (method != null) {
                return (String) method.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w(str2, e);
        } catch (InvocationTargetException e2) {
            Log.w(str2, e2);
        }
        return null;
    }

    /* renamed from: c */
    public static String m5148c(Locale locale) {
        String str = "ICUCompat";
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f4560b.invoke(null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w(str, e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w(str, e2);
                return locale.getScript();
            }
        } else {
            String a = m5146a(locale);
            if (a != null) {
                return m5147b(a);
            }
            return null;
        }
    }
}
