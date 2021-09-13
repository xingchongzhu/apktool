package p271e.p272f0.p278j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.f0.j.f */
class OptionalMethod<T> {

    /* renamed from: a */
    private final Class<?> f18431a;

    /* renamed from: b */
    private final String f18432b;

    /* renamed from: c */
    private final Class[] f18433c;

    OptionalMethod(Class<?> cls, String str, Class... clsArr) {
        this.f18431a = cls;
        this.f18432b = str;
        this.f18433c = clsArr;
    }

    /* renamed from: a */
    private Method m23482a(Class<?> cls) {
        String str = this.f18432b;
        if (str == null) {
            return null;
        }
        Method b = m23483b(cls, str, this.f18433c);
        if (b != null) {
            Class<?> cls2 = this.f18431a;
            if (cls2 != null && !cls2.isAssignableFrom(b.getReturnType())) {
                return null;
            }
        }
        return b;
    }

    /* renamed from: b */
    private static Method m23483b(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object mo19955c(T t, Object... objArr) throws InvocationTargetException {
        Method a = m23482a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpectedly could not call: ");
                sb.append(a);
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Method ");
            sb2.append(this.f18432b);
            sb2.append(" not supported for object ");
            sb2.append(t);
            throw new AssertionError(sb2.toString());
        }
    }

    /* renamed from: d */
    public Object mo19956d(T t, Object... objArr) throws InvocationTargetException {
        Method a = m23482a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object mo19957e(T t, Object... objArr) {
        try {
            return mo19956d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object mo19958f(T t, Object... objArr) {
        try {
            return mo19955c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean mo19959g(T t) {
        return m23482a(t.getClass()) != null;
    }
}
