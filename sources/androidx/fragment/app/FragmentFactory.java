package androidx.fragment.app;

import androidx.fragment.app.Fragment.C0283i;
import p010b.p025d.SimpleArrayMap;

/* renamed from: androidx.fragment.app.j */
public class FragmentFactory {

    /* renamed from: a */
    private static final SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> f2383a = new SimpleArrayMap<>();

    /* renamed from: b */
    static boolean m2377b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m2378c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m2378c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> gVar = f2383a;
        SimpleArrayMap gVar2 = (SimpleArrayMap) gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new SimpleArrayMap();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m2379d(ClassLoader classLoader, String str) {
        String str2 = "Unable to instantiate fragment ";
        try {
            return m2378c(classLoader, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(": make sure class name exists");
            throw new C0283i(sb.toString(), e);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(": make sure class is a valid subclass of Fragment");
            throw new C0283i(sb2.toString(), e2);
        }
    }

    /* renamed from: a */
    public Fragment mo2719a(ClassLoader classLoader, String str) {
        throw null;
    }
}
