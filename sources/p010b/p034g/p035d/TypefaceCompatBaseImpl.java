package p010b.p034g.p035d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p007c.FontResourcesParserCompat.C0253b;
import androidx.core.content.p007c.FontResourcesParserCompat.C0254c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p010b.p034g.p040h.FontsContractCompat.C0594b;

/* renamed from: b.g.d.j */
class TypefaceCompatBaseImpl {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0253b> f4483a = new ConcurrentHashMap<>();

    /* renamed from: b.g.d.j$a */
    /* compiled from: TypefaceCompatBaseImpl */
    class C0581a implements C0583c<C0594b> {
        C0581a() {
        }

        /* renamed from: c */
        public int mo4864a(C0594b bVar) {
            return bVar.mo4898e();
        }

        /* renamed from: d */
        public boolean mo4865b(C0594b bVar) {
            return bVar.mo4899f();
        }
    }

    /* renamed from: b.g.d.j$b */
    /* compiled from: TypefaceCompatBaseImpl */
    class C0582b implements C0583c<C0254c> {
        C0582b() {
        }

        /* renamed from: c */
        public int mo4864a(C0254c cVar) {
            return cVar.mo2173e();
        }

        /* renamed from: d */
        public boolean mo4865b(C0254c cVar) {
            return cVar.mo2174f();
        }
    }

    /* renamed from: b.g.d.j$c */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface C0583c<T> {
        /* renamed from: a */
        int mo4864a(T t);

        /* renamed from: b */
        boolean mo4865b(T t);
    }

    TypefaceCompatBaseImpl() {
    }

    /* renamed from: a */
    private void m5038a(Typeface typeface, C0253b bVar) {
        long j = m5041j(typeface);
        if (j != 0) {
            this.f4483a.put(Long.valueOf(j), bVar);
        }
    }

    /* renamed from: f */
    private C0254c m5039f(C0253b bVar, int i) {
        return (C0254c) m5040g(bVar.mo2168a(), i, new C0582b());
    }

    /* renamed from: g */
    private static <T> T m5040g(T[] tArr, int i, C0583c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo4864a(t2) - i2) * 2) + (cVar.mo4865b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m5041j(Typeface typeface) {
        String str = "Could not retrieve font from family.";
        String str2 = "TypefaceCompatBaseImpl";
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return 0;
        }
    }

    /* renamed from: b */
    public Typeface mo4850b(Context context, C0253b bVar, Resources resources, int i) {
        C0254c f = m5039f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = TypefaceCompat.m4994d(context, resources, f.mo2170b(), f.mo2169a(), i);
        m5038a(d, bVar);
        return d;
    }

    /* renamed from: c */
    public Typeface mo4851c(Context context, CancellationSignal cancellationSignal, C0594b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo4862h(bVarArr, i).mo4897d());
            try {
                Typeface d = mo4861d(context, inputStream);
                TypefaceCompatUtil.m5058a(inputStream);
                return d;
            } catch (IOException unused) {
                TypefaceCompatUtil.m5058a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                TypefaceCompatUtil.m5058a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            TypefaceCompatUtil.m5058a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            TypefaceCompatUtil.m5058a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo4861d(Context context, InputStream inputStream) {
        File e = TypefaceCompatUtil.m5062e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.m5061d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo4853e(Context context, Resources resources, int i, String str, int i2) {
        File e = TypefaceCompatUtil.m5062e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.m5060c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0594b mo4862h(C0594b[] bVarArr, int i) {
        return (C0594b) m5040g(bVarArr, i, new C0581a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C0253b mo4863i(Typeface typeface) {
        long j = m5041j(typeface);
        if (j == 0) {
            return null;
        }
        return (C0253b) this.f4483a.get(Long.valueOf(j));
    }
}
