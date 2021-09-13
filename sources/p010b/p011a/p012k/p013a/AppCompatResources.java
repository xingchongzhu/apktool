package p010b.p011a.p012k.p013a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;
import androidx.core.content.p007c.ColorStateListInflaterCompat;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.k.a.a */
public final class AppCompatResources {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3685a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0512a>> f3686b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3687c = new Object();

    /* renamed from: b.a.k.a.a$a */
    /* compiled from: AppCompatResources */
    private static class C0512a {

        /* renamed from: a */
        final ColorStateList f3688a;

        /* renamed from: b */
        final Configuration f3689b;

        C0512a(ColorStateList colorStateList, Configuration configuration) {
            this.f3688a = colorStateList;
            this.f3689b = configuration;
        }
    }

    /* renamed from: a */
    private static void m4140a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f3687c) {
            WeakHashMap<Context, SparseArray<C0512a>> weakHashMap = f3686b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C0512a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m4141b(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f3687c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<b.a.k.a.a$a>> r1 = f3686b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            b.a.k.a.a$a r2 = (p010b.p011a.p012k.p013a.AppCompatResources.C0512a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f3689b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f3688a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p011a.p012k.p013a.AppCompatResources.m4141b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m4142c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b = m4141b(context, i);
        if (b != null) {
            return b;
        }
        ColorStateList f = m4145f(context, i);
        if (f == null) {
            return ContextCompat.m1757c(context, i);
        }
        m4140a(context, i, f);
        return f;
    }

    /* renamed from: d */
    public static Drawable m4143d(Context context, int i) {
        return ResourceManagerInternal.m1267h().mo1625j(context, i);
    }

    /* renamed from: e */
    private static TypedValue m4144e() {
        ThreadLocal<TypedValue> threadLocal = f3685a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m4145f(Context context, int i) {
        if (m4146g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return ColorStateListInflaterCompat.m1767a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m4146g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = m4144e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }
}
