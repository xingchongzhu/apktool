package p010b.p034g.p035d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p007c.FontResourcesParserCompat.C0253b;
import androidx.core.content.p007c.FontResourcesParserCompat.C0254c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010b.p034g.p040h.FontsContractCompat.C0594b;

/* renamed from: b.g.d.e */
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {

    /* renamed from: b */
    private static Class<?> f4467b = null;

    /* renamed from: c */
    private static Constructor<?> f4468c = null;

    /* renamed from: d */
    private static Method f4469d = null;

    /* renamed from: e */
    private static Method f4470e = null;

    /* renamed from: f */
    private static boolean f4471f = false;

    TypefaceCompatApi21Impl() {
    }

    /* renamed from: k */
    private static boolean m5001k(Object obj, String str, int i, boolean z) {
        m5004n();
        try {
            return ((Boolean) f4469d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface mo4854l(Object obj) {
        m5004n();
        try {
            Object newInstance = Array.newInstance(f4467b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4470e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m5003m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m5004n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f4471f) {
            f4471f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f4468c = constructor;
            f4467b = cls;
            f4469d = method;
            f4470e = method2;
        }
    }

    /* renamed from: o */
    private static Object m5005o() {
        m5004n();
        try {
            return f4468c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo4850b(Context context, C0253b bVar, Resources resources, int i) {
        Object o = m5005o();
        C0254c[] a = bVar.mo2168a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0254c cVar = a[i2];
            File e = TypefaceCompatUtil.m5062e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!TypefaceCompatUtil.m5060c(e, resources, cVar.mo2170b())) {
                    e.delete();
                    return null;
                } else if (!m5001k(o, e.getPath(), cVar.mo2173e(), cVar.mo2174f())) {
                    return null;
                } else {
                    e.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo4854l(o);
    }

    /* renamed from: c */
    public Typeface mo4851c(Context context, CancellationSignal cancellationSignal, C0594b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        C0594b h = mo4862h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo4897d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m = m5003m(openFileDescriptor);
                if (m != null) {
                    if (m.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d = super.mo4861d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
