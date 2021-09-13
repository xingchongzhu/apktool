package p282g.p283a.p287b.p291b.p292a;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: g.a.b.b.a.a */
public class IdentifierManager {

    /* renamed from: a */
    private static Object f18807a;

    /* renamed from: b */
    private static Class<?> f18808b;

    /* renamed from: c */
    private static Method f18809c;

    /* renamed from: d */
    private static Method f18810d;

    /* renamed from: e */
    private static Method f18811e;

    /* renamed from: f */
    private static Method f18812f;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f18808b = cls;
            f18807a = cls.newInstance();
            f18809c = f18808b.getMethod("getUDID", new Class[]{Context.class});
            f18810d = f18808b.getMethod("getOAID", new Class[]{Context.class});
            f18811e = f18808b.getMethod("getVAID", new Class[]{Context.class});
            f18812f = f18808b.getMethod("getAAID", new Class[]{Context.class});
        } catch (Exception e) {
            Log.e("IdentifierManager", "reflect exception!", e);
        }
    }

    /* renamed from: a */
    private static String m24021a(Context context, Method method) {
        Object obj = f18807a;
        if (!(obj == null || method == null)) {
            try {
                Object invoke = method.invoke(obj, new Object[]{context});
                if (invoke != null) {
                    return (String) invoke;
                }
            } catch (Exception e) {
                Log.e("IdentifierManager", "invoke exception!", e);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m24022b() {
        return (f18808b == null || f18807a == null) ? false : true;
    }

    /* renamed from: c */
    public static String m24023c(Context context) {
        return m24021a(context, f18810d);
    }
}
