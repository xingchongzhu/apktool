package p010b.p034g.p035d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p007c.FontResourcesParserCompat.C0252a;
import androidx.core.content.p007c.FontResourcesParserCompat.C0253b;
import androidx.core.content.p007c.FontResourcesParserCompat.C0255d;
import androidx.core.content.p007c.ResourcesCompat.C0257a;
import p010b.p025d.LruCache;
import p010b.p034g.p040h.FontsContractCompat;
import p010b.p034g.p040h.FontsContractCompat.C0594b;
import p010b.p034g.p040h.FontsContractCompat.C0595c;

@SuppressLint({"NewApi"})
/* renamed from: b.g.d.d */
public class TypefaceCompat {

    /* renamed from: a */
    private static final TypefaceCompatBaseImpl f4464a;

    /* renamed from: b */
    private static final LruCache<String, Typeface> f4465b = new LruCache<>(16);

    /* renamed from: b.g.d.d$a */
    /* compiled from: TypefaceCompat */
    public static class C0580a extends C0595c {

        /* renamed from: a */
        private C0257a f4466a;

        public C0580a(C0257a aVar) {
            this.f4466a = aVar;
        }

        /* renamed from: a */
        public void mo4848a(int i) {
            C0257a aVar = this.f4466a;
            if (aVar != null) {
                aVar.mo1886d(i);
            }
        }

        /* renamed from: b */
        public void mo4849b(Typeface typeface) {
            C0257a aVar = this.f4466a;
            if (aVar != null) {
                aVar.mo1887e(typeface);
            }
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            f4464a = new TypefaceCompatApi29Impl();
        } else if (i >= 28) {
            f4464a = new TypefaceCompatApi28Impl();
        } else if (i >= 26) {
            f4464a = new TypefaceCompatApi26Impl();
        } else if (i >= 24 && TypefaceCompatApi24Impl.m5010m()) {
            f4464a = new TypefaceCompatApi24Impl();
        } else if (i >= 21) {
            f4464a = new TypefaceCompatApi21Impl();
        } else {
            f4464a = new TypefaceCompatBaseImpl();
        }
    }

    /* renamed from: a */
    public static Typeface m4991a(Context context, Typeface typeface, int i) {
        if (context != null) {
            if (VERSION.SDK_INT < 21) {
                Typeface g = m4997g(context, typeface, i);
                if (g != null) {
                    return g;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m4992b(Context context, CancellationSignal cancellationSignal, C0594b[] bVarArr, int i) {
        return f4464a.mo4851c(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m4993c(Context context, C0252a aVar, Resources resources, int i, int i2, C0257a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        C0252a aVar3 = aVar;
        C0257a aVar4 = aVar2;
        Handler handler2 = handler;
        if (aVar3 instanceof C0255d) {
            C0255d dVar = (C0255d) aVar3;
            Typeface h = m4998h(dVar.mo2177c());
            if (h != null) {
                if (aVar4 != null) {
                    aVar4.mo2180b(h, handler2);
                }
                return h;
            }
            typeface = FontsContractCompat.m5108a(context, dVar.mo2176b(), i2, !z ? aVar4 == null : dVar.mo2175a() == 0, z ? dVar.mo2178d() : -1, C0257a.m1817c(handler), new C0580a(aVar4));
            Resources resources2 = resources;
            int i3 = i2;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f4464a.mo4850b(context, (C0253b) aVar3, resources, i2);
            if (aVar4 != null) {
                if (typeface != null) {
                    aVar4.mo2180b(typeface, handler2);
                } else {
                    aVar4.mo2179a(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f4465b.mo4430d(m4995e(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m4994d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = f4464a.mo4853e(context, resources, i, str, i2);
        if (e != null) {
            f4465b.mo4430d(m4995e(resources, i, i2), e);
        }
        return e;
    }

    /* renamed from: e */
    private static String m4995e(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: f */
    public static Typeface m4996f(Resources resources, int i, int i2) {
        return (Typeface) f4465b.mo4429c(m4995e(resources, i, i2));
    }

    /* renamed from: g */
    private static Typeface m4997g(Context context, Typeface typeface, int i) {
        TypefaceCompatBaseImpl jVar = f4464a;
        C0253b i2 = jVar.mo4863i(typeface);
        if (i2 == null) {
            return null;
        }
        return jVar.mo4850b(context, i2, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m4998h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
