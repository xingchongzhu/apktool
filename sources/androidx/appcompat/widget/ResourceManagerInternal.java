package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p010b.p011a.p014l.p015a.AnimatedStateListDrawableCompat;
import p010b.p011a.p016m.C0525a;
import p010b.p025d.LongSparseArray;
import p010b.p025d.LruCache;
import p010b.p025d.SimpleArrayMap;
import p010b.p025d.SparseArrayCompat;
import p010b.p063q.p064a.p065a.AnimatedVectorDrawableCompat;
import p010b.p063q.p064a.p065a.VectorDrawableCompat;

/* renamed from: androidx.appcompat.widget.n0 */
public final class ResourceManagerInternal {

    /* renamed from: a */
    private static final Mode f1132a = Mode.SRC_IN;

    /* renamed from: b */
    private static ResourceManagerInternal f1133b;

    /* renamed from: c */
    private static final C0184c f1134c = new C0184c(6);

    /* renamed from: d */
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> f1135d;

    /* renamed from: e */
    private SimpleArrayMap<String, C0186e> f1136e;

    /* renamed from: f */
    private SparseArrayCompat<String> f1137f;

    /* renamed from: g */
    private final WeakHashMap<Context, LongSparseArray<WeakReference<ConstantState>>> f1138g = new WeakHashMap<>(0);

    /* renamed from: h */
    private TypedValue f1139h;

    /* renamed from: i */
    private boolean f1140i;

    /* renamed from: j */
    private C0187f f1141j;

    /* renamed from: androidx.appcompat.widget.n0$a */
    /* compiled from: ResourceManagerInternal */
    static class C0182a implements C0186e {
        C0182a() {
        }

        /* renamed from: a */
        public Drawable mo1633a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.m4147m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$b */
    /* compiled from: ResourceManagerInternal */
    private static class C0183b implements C0186e {
        C0183b() {
        }

        /* renamed from: a */
        public Drawable mo1633a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.m6138a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$c */
    /* compiled from: ResourceManagerInternal */
    private static class C0184c extends LruCache<Integer, PorterDuffColorFilter> {
        public C0184c(int i) {
            super(i);
        }

        /* renamed from: h */
        private static int m1286h(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public PorterDuffColorFilter mo1634i(int i, Mode mode) {
            return (PorterDuffColorFilter) mo4429c(Integer.valueOf(m1286h(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public PorterDuffColorFilter mo1635j(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo4430d(Integer.valueOf(m1286h(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$d */
    /* compiled from: ResourceManagerInternal */
    static class C0185d implements C0186e {
        C0185d() {
        }

        /* renamed from: a */
        public Drawable mo1633a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0185d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$e */
    /* compiled from: ResourceManagerInternal */
    private interface C0186e {
        /* renamed from: a */
        Drawable mo1633a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.n0$f */
    /* compiled from: ResourceManagerInternal */
    public interface C0187f {
        /* renamed from: a */
        boolean mo1502a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        Mode mo1503b(int i);

        /* renamed from: c */
        Drawable mo1504c(ResourceManagerInternal n0Var, Context context, int i);

        /* renamed from: d */
        ColorStateList mo1505d(Context context, int i);

        /* renamed from: e */
        boolean mo1506e(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.n0$g */
    /* compiled from: ResourceManagerInternal */
    private static class C0188g implements C0186e {
        C0188g() {
        }

        /* renamed from: a */
        public Drawable mo1633a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return VectorDrawableCompat.m6171c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m1260a(String str, C0186e eVar) {
        if (this.f1136e == null) {
            this.f1136e = new SimpleArrayMap<>();
        }
        this.f1136e.put(str, eVar);
    }

    /* renamed from: b */
    private synchronized boolean m1261b(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        LongSparseArray dVar = (LongSparseArray) this.f1138g.get(context);
        if (dVar == null) {
            dVar = new LongSparseArray();
            this.f1138g.put(context, dVar);
        }
        dVar.mo4421i(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: c */
    private void m1262c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1135d == null) {
            this.f1135d = new WeakHashMap<>();
        }
        SparseArrayCompat hVar = (SparseArrayCompat) this.f1135d.get(context);
        if (hVar == null) {
            hVar = new SparseArrayCompat();
            this.f1135d.put(context, hVar);
        }
        hVar.mo4522a(i, colorStateList);
    }

    /* renamed from: d */
    private void m1263d(Context context) {
        if (!this.f1140i) {
            this.f1140i = true;
            Drawable j = mo1625j(context, C0525a.f3758a);
            if (j == null || !m1272q(j)) {
                this.f1140i = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m1264e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m1265f(Context context, int i) {
        Drawable drawable;
        if (this.f1139h == null) {
            this.f1139h = new TypedValue();
        }
        TypedValue typedValue = this.f1139h;
        context.getResources().getValue(i, typedValue, true);
        long e = m1264e(typedValue);
        Drawable i2 = m1268i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0187f fVar = this.f1141j;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.mo1504c(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m1261b(context, e, drawable);
        }
        return drawable;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m1266g(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1269l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized ResourceManagerInternal m1267h() {
        ResourceManagerInternal n0Var;
        synchronized (ResourceManagerInternal.class) {
            if (f1133b == null) {
                ResourceManagerInternal n0Var2 = new ResourceManagerInternal();
                f1133b = n0Var2;
                m1271p(n0Var2);
            }
            n0Var = f1133b;
        }
        return n0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1268i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, b.d.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1138g     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            b.d.d r0 = (p010b.p025d.LongSparseArray) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo4417e(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo4422j(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.m1268i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m1269l(int i, Mode mode) {
        PorterDuffColorFilter i2;
        synchronized (ResourceManagerInternal.class) {
            C0184c cVar = f1134c;
            i2 = cVar.mo1634i(i, mode);
            if (i2 == null) {
                i2 = new PorterDuffColorFilter(i, mode);
                cVar.mo1635j(i, mode, i2);
            }
        }
        return i2;
    }

    /* renamed from: n */
    private ColorStateList m1270n(Context context, int i) {
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.f1135d;
        if (weakHashMap == null) {
            return null;
        }
        SparseArrayCompat hVar = (SparseArrayCompat) weakHashMap.get(context);
        if (hVar != null) {
            return (ColorStateList) hVar.mo4526e(i);
        }
        return null;
    }

    /* renamed from: p */
    private static void m1271p(ResourceManagerInternal n0Var) {
        if (VERSION.SDK_INT < 24) {
            n0Var.m1260a("vector", new C0188g());
            n0Var.m1260a("animated-vector", new C0183b());
            n0Var.m1260a("animated-selector", new C0182a());
            n0Var.m1260a("drawable", new C0185d());
        }
    }

    /* renamed from: q */
    private static boolean m1272q(Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1273r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            b.d.g<java.lang.String, androidx.appcompat.widget.n0$e> r0 = r10.f1136e
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            b.d.h<java.lang.String> r0 = r10.f1137f
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo4526e(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            b.d.g<java.lang.String, androidx.appcompat.widget.n0$e> r3 = r10.f1136e
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            b.d.h r0 = new b.d.h
            r0.<init>()
            r10.f1137f = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1139h
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1139h = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1139h
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1264e(r0)
            android.graphics.drawable.Drawable r6 = r10.m1268i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            b.d.h<java.lang.String> r8 = r10.f1137f     // Catch:{ Exception -> 0x00a2 }
            r8.mo4522a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            b.d.g<java.lang.String, androidx.appcompat.widget.n0$e> r8 = r10.f1136e     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.n0$e r3 = (androidx.appcompat.widget.ResourceManagerInternal.C0186e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo1633a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1261b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            b.d.h<java.lang.String> r11 = r10.f1137f
            r11.mo4522a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.m1273r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m1274v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo1627m(context, i);
        if (m != null) {
            if (DrawableUtils.m1120a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = DrawableCompat.m1859r(drawable);
            DrawableCompat.m1856o(r, m);
            Mode o = mo1628o(i);
            if (o == null) {
                return r;
            }
            DrawableCompat.m1857p(r, o);
            return r;
        }
        C0187f fVar = this.f1141j;
        if ((fVar == null || !fVar.mo1506e(context, i, drawable)) && !mo1632x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m1275w(Drawable drawable, TintInfo v0Var, int[] iArr) {
        if (!DrawableUtils.m1120a(drawable) || drawable.mutate() == drawable) {
            boolean z = v0Var.f1223d;
            if (z || v0Var.f1222c) {
                drawable.setColorFilter(m1266g(z ? v0Var.f1220a : null, v0Var.f1222c ? v0Var.f1221b : f1132a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: j */
    public synchronized Drawable mo1625j(Context context, int i) {
        return mo1626k(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public synchronized Drawable mo1626k(Context context, int i, boolean z) {
        Drawable r;
        m1263d(context);
        r = m1273r(context, i);
        if (r == null) {
            r = m1265f(context, i);
        }
        if (r == null) {
            r = ContextCompat.m1758d(context, i);
        }
        if (r != null) {
            r = m1274v(context, i, z, r);
        }
        if (r != null) {
            DrawableUtils.m1121b(r);
        }
        return r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public synchronized ColorStateList mo1627m(Context context, int i) {
        ColorStateList n;
        n = m1270n(context, i);
        if (n == null) {
            C0187f fVar = this.f1141j;
            n = fVar == null ? null : fVar.mo1505d(context, i);
            if (n != null) {
                m1262c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public Mode mo1628o(int i) {
        C0187f fVar = this.f1141j;
        if (fVar == null) {
            return null;
        }
        return fVar.mo1503b(i);
    }

    /* renamed from: s */
    public synchronized void mo1629s(Context context) {
        LongSparseArray dVar = (LongSparseArray) this.f1138g.get(context);
        if (dVar != null) {
            dVar.mo4414b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public synchronized Drawable mo1630t(Context context, VectorEnabledTintResources c1Var, int i) {
        Drawable r = m1273r(context, i);
        if (r == null) {
            r = c1Var.mo1380c(i);
        }
        if (r == null) {
            return null;
        }
        return m1274v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo1631u(C0187f fVar) {
        this.f1141j = fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public boolean mo1632x(Context context, int i, Drawable drawable) {
        C0187f fVar = this.f1141j;
        return fVar != null && fVar.mo1502a(context, i, drawable);
    }
}
