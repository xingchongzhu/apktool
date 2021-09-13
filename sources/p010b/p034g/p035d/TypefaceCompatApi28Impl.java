package p010b.p034g.p035d;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.g.d.h */
public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl {
    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo4854l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4476g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4482m.invoke(null, new Object[]{newInstance, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo4858x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
