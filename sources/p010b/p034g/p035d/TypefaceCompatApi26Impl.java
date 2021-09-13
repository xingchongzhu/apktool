package p010b.p034g.p035d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.p007c.FontResourcesParserCompat.C0253b;
import androidx.core.content.p007c.FontResourcesParserCompat.C0254c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p010b.p034g.p040h.FontsContractCompat.C0594b;

/* renamed from: b.g.d.g */
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {

    /* renamed from: g */
    protected final Class<?> f4476g;

    /* renamed from: h */
    protected final Constructor<?> f4477h;

    /* renamed from: i */
    protected final Method f4478i;

    /* renamed from: j */
    protected final Method f4479j;

    /* renamed from: k */
    protected final Method f4480k;

    /* renamed from: l */
    protected final Method f4481l;

    /* renamed from: m */
    protected final Method f4482m;

    public TypefaceCompatApi26Impl() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = mo4859y();
            constructor = mo4860z(y);
            method4 = mo4856v(y);
            method3 = mo4857w(y);
            method2 = mo4852A(y);
            method = mo4855u(y);
            Class<?> cls2 = y;
            method5 = mo4858x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4476g = cls;
        this.f4477h = constructor;
        this.f4478i = method4;
        this.f4479j = method3;
        this.f4480k = method2;
        this.f4481l = method;
        this.f4482m = method5;
    }

    /* renamed from: o */
    private Object m5014o() {
        try {
            return this.f4477h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m5015p(Object obj) {
        try {
            this.f4481l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m5016q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4478i.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m5017r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f4479j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m5018s(Object obj) {
        try {
            return ((Boolean) this.f4480k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m5019t() {
        if (this.f4478i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f4478i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Method mo4852A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: b */
    public Typeface mo4850b(Context context, C0253b bVar, Resources resources, int i) {
        C0254c[] a;
        if (!m5019t()) {
            return super.mo4850b(context, bVar, resources, i);
        }
        Object o = m5014o();
        if (o == null) {
            return null;
        }
        for (C0254c cVar : bVar.mo2168a()) {
            if (!m5016q(context, o, cVar.mo2169a(), cVar.mo2171c(), cVar.mo2173e(), cVar.mo2174f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo2172d()))) {
                m5015p(o);
                return null;
            }
        }
        if (!m5018s(o)) {
            return null;
        }
        return mo4854l(o);
    }

    /* renamed from: c */
    public Typeface mo4851c(Context context, CancellationSignal cancellationSignal, C0594b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m5019t()) {
            C0594b h = mo4862h(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo4897d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.mo4898e()).setItalic(h.mo4899f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map h2 = TypefaceCompatUtil.m5065h(context, bVarArr, cancellationSignal);
            Object o = m5014o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C0594b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) h2.get(bVar.mo4897d());
                if (byteBuffer != null) {
                    if (!m5017r(o, byteBuffer, bVar.mo4896c(), bVar.mo4898e(), bVar.mo4899f() ? 1 : 0)) {
                        m5015p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m5015p(o);
                return null;
            } else if (!m5018s(o)) {
                return null;
            } else {
                Typeface l = mo4854l(o);
                if (l == null) {
                    return null;
                }
                return Typeface.create(l, i);
            }
        }
        throw th;
    }

    /* renamed from: e */
    public Typeface mo4853e(Context context, Resources resources, int i, String str, int i2) {
        if (!m5019t()) {
            return super.mo4853e(context, resources, i, str, i2);
        }
        Object o = m5014o();
        if (o == null) {
            return null;
        }
        if (!m5016q(context, o, str, 0, -1, -1, null)) {
            m5015p(o);
            return null;
        } else if (!m5018s(o)) {
            return null;
        } else {
            return mo4854l(o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo4854l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4476g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4482m.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo4855u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Method mo4856v(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Method mo4857w(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo4858x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Class<?> mo4859y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Constructor<?> mo4860z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
