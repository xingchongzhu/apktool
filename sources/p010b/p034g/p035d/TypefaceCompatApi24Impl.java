package p010b.p034g.p035d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p007c.FontResourcesParserCompat.C0253b;
import androidx.core.content.p007c.FontResourcesParserCompat.C0254c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p040h.FontsContractCompat.C0594b;

/* renamed from: b.g.d.f */
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {

    /* renamed from: b */
    private static final Class<?> f4472b;

    /* renamed from: c */
    private static final Constructor<?> f4473c;

    /* renamed from: d */
    private static final Method f4474d;

    /* renamed from: e */
    private static final Method f4475e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f4473c = constructor;
        f4472b = cls;
        f4474d = method;
        f4475e = method2;
    }

    TypefaceCompatApi24Impl() {
    }

    /* renamed from: k */
    private static boolean m5008k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f4474d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m5009l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4472b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4475e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m5010m() {
        Method method = f4474d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    private static Object m5011n() {
        try {
            return f4473c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo4850b(Context context, C0253b bVar, Resources resources, int i) {
        C0254c[] a;
        Object n = m5011n();
        if (n == null) {
            return null;
        }
        for (C0254c cVar : bVar.mo2168a()) {
            ByteBuffer b = TypefaceCompatUtil.m5059b(context, resources, cVar.mo2170b());
            if (b == null || !m5008k(n, b, cVar.mo2171c(), cVar.mo2173e(), cVar.mo2174f())) {
                return null;
            }
        }
        return m5009l(n);
    }

    /* renamed from: c */
    public Typeface mo4851c(Context context, CancellationSignal cancellationSignal, C0594b[] bVarArr, int i) {
        Object n = m5011n();
        if (n == null) {
            return null;
        }
        SimpleArrayMap gVar = new SimpleArrayMap();
        for (C0594b bVar : bVarArr) {
            Uri d = bVar.mo4897d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = TypefaceCompatUtil.m5063f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m5008k(n, byteBuffer, bVar.mo4896c(), bVar.mo4898e(), bVar.mo4899f())) {
                return null;
            }
        }
        Typeface l = m5009l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
