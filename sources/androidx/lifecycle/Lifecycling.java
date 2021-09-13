package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.l */
public class Lifecycling {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f2650a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> f2651b = new HashMap();

    /* renamed from: a */
    private static GeneratedAdapter m2775a(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            return (GeneratedAdapter) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends GeneratedAdapter> m2776b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m2777c(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(c);
                c = sb.toString();
            }
            Constructor<? extends GeneratedAdapter> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m2777c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* renamed from: d */
    private static int m2778d(Class<?> cls) {
        Integer num = (Integer) f2650a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m2781g(cls);
        f2650a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m2779e(Class<?> cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static LifecycleEventObserver m2780f(Object obj) {
        boolean z = obj instanceof LifecycleEventObserver;
        boolean z2 = obj instanceof FullLifecycleObserver;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj, (LifecycleEventObserver) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj, null);
        }
        if (z) {
            return (LifecycleEventObserver) obj;
        }
        Class cls = obj.getClass();
        if (m2778d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f2651b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m2775a((Constructor) list.get(0), obj));
        }
        GeneratedAdapter[] eVarArr = new GeneratedAdapter[list.size()];
        for (int i = 0; i < list.size(); i++) {
            eVarArr[i] = m2775a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(eVarArr);
    }

    /* renamed from: g */
    private static int m2781g(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b = m2776b(cls);
        if (b != null) {
            f2651b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (ClassesInfoCache.f2624a.mo2987d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m2779e(superclass)) {
                if (m2778d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f2651b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m2779e(cls2)) {
                    if (m2778d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f2651b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2651b.put(cls, arrayList);
            return 2;
        }
    }
}
