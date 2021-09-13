package androidx.core.content.p007c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010b.p034g.p042j.Preconditions;

/* renamed from: androidx.core.content.c.f */
public final class ResourcesCompat {

    /* renamed from: androidx.core.content.c.f$a */
    /* compiled from: ResourcesCompat */
    public static abstract class C0257a {

        /* renamed from: androidx.core.content.c.f$a$a */
        /* compiled from: ResourcesCompat */
        class C0258a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Typeface f2007a;

            C0258a(Typeface typeface) {
                this.f2007a = typeface;
            }

            public void run() {
                C0257a.this.mo1887e(this.f2007a);
            }
        }

        /* renamed from: androidx.core.content.c.f$a$b */
        /* compiled from: ResourcesCompat */
        class C0259b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f2009a;

            C0259b(int i) {
                this.f2009a = i;
            }

            public void run() {
                C0257a.this.mo1886d(this.f2009a);
            }
        }

        /* renamed from: c */
        public static Handler m1817c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void mo2179a(int i, Handler handler) {
            m1817c(handler).post(new C0259b(i));
        }

        /* renamed from: b */
        public final void mo2180b(Typeface typeface, Handler handler) {
            m1817c(handler).post(new C0258a(typeface));
        }

        /* renamed from: d */
        public abstract void mo1886d(int i);

        /* renamed from: e */
        public abstract void mo1887e(Typeface typeface);
    }

    /* renamed from: androidx.core.content.c.f$b */
    /* compiled from: ResourcesCompat */
    public static final class C0260b {

        /* renamed from: androidx.core.content.c.f$b$a */
        /* compiled from: ResourcesCompat */
        static class C0261a {

            /* renamed from: a */
            private static final Object f2011a = new Object();

            /* renamed from: b */
            private static Method f2012b;

            /* renamed from: c */
            private static boolean f2013c;

            /* renamed from: a */
            static void m1823a(Theme theme) {
                synchronized (f2011a) {
                    if (!f2013c) {
                        try {
                            Method declaredMethod = Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2012b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f2013c = true;
                    }
                    Method method = f2012b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f2012b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.c.f$b$b */
        /* compiled from: ResourcesCompat */
        static class C0262b {
            /* renamed from: a */
            static void m1824a(Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m1822a(Theme theme) {
            int i = VERSION.SDK_INT;
            if (i >= 29) {
                C0262b.m1824a(theme);
            } else if (i >= 23) {
                C0261a.m1823a(theme);
            }
        }
    }

    /* renamed from: a */
    public static Drawable m1811a(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: b */
    public static Typeface m1812b(Context context, int i) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m1815e(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: c */
    public static Typeface m1813c(Context context, int i, TypedValue typedValue, int i2, C0257a aVar) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m1815e(context, i, typedValue, i2, aVar, null, true, false);
    }

    /* renamed from: d */
    public static void m1814d(Context context, int i, C0257a aVar, Handler handler) throws NotFoundException {
        Preconditions.m5188e(aVar);
        if (context.isRestricted()) {
            aVar.mo2179a(-4, handler);
            return;
        }
        m1815e(context, i, new TypedValue(), 0, aVar, handler, false, false);
    }

    /* renamed from: e */
    private static Typeface m1815e(Context context, int i, TypedValue typedValue, int i2, C0257a aVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        TypedValue typedValue2 = typedValue;
        resources.getValue(i, typedValue, true);
        Typeface f = m1816f(context, resources, typedValue2, i, i2, aVar, handler, z, z2);
        if (f != null || aVar != null || z2) {
            return f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m1816f(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p007c.ResourcesCompat.C0257a r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00aa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo2179a(r13, r10)
        L_0x0025:
            return r14
        L_0x0026:
            android.graphics.Typeface r1 = p010b.p034g.p035d.TypefaceCompat.m4996f(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo2180b(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            if (r23 == 0) goto L_0x0035
            return r14
        L_0x0035:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r1 == 0) goto L_0x0068
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            androidx.core.content.c.c$a r2 = androidx.core.content.p007c.FontResourcesParserCompat.m1786b(r1, r0)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r2 != 0) goto L_0x0056
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r9 == 0) goto L_0x0055
            r9.mo2179a(r13, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
        L_0x0055:
            return r14
        L_0x0056:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p010b.p034g.p035d.TypefaceCompat.m4993c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            return r0
        L_0x0068:
            r1 = r15
            android.graphics.Typeface r0 = p010b.p034g.p035d.TypefaceCompat.m4994d(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r9 == 0) goto L_0x0078
            if (r0 == 0) goto L_0x0075
            r9.mo2180b(r0, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            goto L_0x0078
        L_0x0075:
            r9.mo2179a(r13, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
        L_0x0078:
            return r0
        L_0x0079:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00a4
        L_0x008f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00a4:
            if (r9 == 0) goto L_0x00a9
            r9.mo2179a(r13, r10)
        L_0x00a9:
            return r14
        L_0x00aa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p007c.ResourcesCompat.m1816f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.c.f$a, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
