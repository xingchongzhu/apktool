package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C0377b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: androidx.lifecycle.a */
final class ClassesInfoCache {

    /* renamed from: a */
    static ClassesInfoCache f2624a = new ClassesInfoCache();

    /* renamed from: b */
    private final Map<Class<?>, C0373a> f2625b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, Boolean> f2626c = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    /* compiled from: ClassesInfoCache */
    static class C0373a {

        /* renamed from: a */
        final Map<C0377b, List<C0374b>> f2627a = new HashMap();

        /* renamed from: b */
        final Map<C0374b, C0377b> f2628b;

        C0373a(Map<C0374b, C0377b> map) {
            this.f2628b = map;
            for (Entry entry : map.entrySet()) {
                C0377b bVar = (C0377b) entry.getValue();
                List list = (List) this.f2627a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2627a.put(bVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m2735b(List<C0374b> list, LifecycleOwner iVar, C0377b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0374b) list.get(size)).mo2989a(iVar, bVar, obj);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2988a(LifecycleOwner iVar, C0377b bVar, Object obj) {
            m2735b((List) this.f2627a.get(bVar), iVar, bVar, obj);
            m2735b((List) this.f2627a.get(C0377b.ON_ANY), iVar, bVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    /* compiled from: ClassesInfoCache */
    static final class C0374b {

        /* renamed from: a */
        final int f2629a;

        /* renamed from: b */
        final Method f2630b;

        C0374b(int i, Method method) {
            this.f2629a = i;
            this.f2630b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2989a(LifecycleOwner iVar, C0377b bVar, Object obj) {
            try {
                int i = this.f2629a;
                if (i == 0) {
                    this.f2630b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2630b.invoke(obj, new Object[]{iVar});
                } else if (i == 2) {
                    this.f2630b.invoke(obj, new Object[]{iVar, bVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0374b)) {
                return false;
            }
            C0374b bVar = (C0374b) obj;
            if (this.f2629a != bVar.f2629a || !this.f2630b.getName().equals(bVar.f2630b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f2629a * 31) + this.f2630b.getName().hashCode();
        }
    }

    ClassesInfoCache() {
    }

    /* renamed from: a */
    private C0373a m2730a(Class<?> cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0373a c = mo2986c(superclass);
            if (c != null) {
                hashMap.putAll(c.f2628b);
            }
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Entry entry : mo2986c(c2).f2628b.entrySet()) {
                m2732e(hashMap, (C0374b) entry.getKey(), (C0377b) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m2731b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent pVar = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (pVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0377b value = pVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0377b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0377b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m2732e(hashMap, new C0374b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0373a aVar = new C0373a(hashMap);
        this.f2625b.put(cls, aVar);
        this.f2626c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m2731b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m2732e(Map<C0374b, C0377b> map, C0374b bVar, C0377b bVar2, Class<?> cls) {
        C0377b bVar3 = (C0377b) map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f2630b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(bVar3);
            sb.append(", new value ");
            sb.append(bVar2);
            throw new IllegalArgumentException(sb.toString());
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0373a mo2986c(Class<?> cls) {
        C0373a aVar = (C0373a) this.f2625b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m2730a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo2987d(Class<?> cls) {
        Boolean bool = (Boolean) this.f2626c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m2731b(cls);
        for (Method annotation : b) {
            if (((OnLifecycleEvent) annotation.getAnnotation(OnLifecycleEvent.class)) != null) {
                m2730a(cls, b);
                return true;
            }
        }
        this.f2626c.put(cls, Boolean.FALSE);
        return false;
    }
}
