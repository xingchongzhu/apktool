package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.ResourceManagerInternal.C0187f;
import p010b.p011a.C0502a;
import p010b.p011a.C0504c;
import p010b.p011a.C0505d;
import p010b.p011a.C0506e;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p035d.ColorUtils;

/* renamed from: androidx.appcompat.widget.j */
public final class AppCompatDrawableManager {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Mode f1050a = Mode.SRC_IN;

    /* renamed from: b */
    private static AppCompatDrawableManager f1051b;

    /* renamed from: c */
    private ResourceManagerInternal f1052c;

    /* renamed from: androidx.appcompat.widget.j$a */
    /* compiled from: AppCompatDrawableManager */
    class C0172a implements C0187f {

        /* renamed from: a */
        private final int[] f1053a = {C0506e.f3335R, C0506e.f3333P, C0506e.f3337a};

        /* renamed from: b */
        private final int[] f1054b = {C0506e.f3351o, C0506e.f3324B, C0506e.f3356t, C0506e.f3352p, C0506e.f3353q, C0506e.f3355s, C0506e.f3354r};

        /* renamed from: c */
        private final int[] f1055c = {C0506e.f3332O, C0506e.f3334Q, C0506e.f3347k, C0506e.f3331K, C0506e.abc_text_select_handle_left_mtrl, C0506e.abc_text_select_handle_middle_mtrl, C0506e.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        private final int[] f1056d = {C0506e.f3359w, C0506e.f3345i, C0506e.f3358v};

        /* renamed from: e */
        private final int[] f1057e = {C0506e.f3330J, C0506e.f3336S};

        /* renamed from: f */
        private final int[] f1058f = {C0506e.f3339c, C0506e.f3343g, C0506e.f3340d, C0506e.f3344h};

        C0172a() {
        }

        /* renamed from: f */
        private boolean m1166f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1167g(Context context) {
            return m1168h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1168h(Context context, int i) {
            int c = ThemeUtils.m1345c(context, C0502a.f3299v);
            return new ColorStateList(new int[][]{ThemeUtils.f1204b, ThemeUtils.f1207e, ThemeUtils.f1205c, ThemeUtils.f1211i}, new int[]{ThemeUtils.m1344b(context, C0502a.f3297t), ColorUtils.m4968b(c, i), ColorUtils.m4968b(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m1169i(Context context) {
            return m1168h(context, ThemeUtils.m1345c(context, C0502a.f3296s));
        }

        /* renamed from: j */
        private ColorStateList m1170j(Context context) {
            return m1168h(context, ThemeUtils.m1345c(context, C0502a.f3297t));
        }

        /* renamed from: k */
        private ColorStateList m1171k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C0502a.f3301x;
            ColorStateList e = ThemeUtils.m1347e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = ThemeUtils.f1204b;
                iArr2[0] = ThemeUtils.m1344b(context, i);
                iArr[1] = ThemeUtils.f1208f;
                iArr2[1] = ThemeUtils.m1345c(context, C0502a.f3298u);
                iArr[2] = ThemeUtils.f1211i;
                iArr2[2] = ThemeUtils.m1345c(context, i);
            } else {
                iArr[0] = ThemeUtils.f1204b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = ThemeUtils.f1208f;
                iArr2[1] = ThemeUtils.m1345c(context, C0502a.f3298u);
                iArr[2] = ThemeUtils.f1211i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m1172l(ResourceManagerInternal n0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = n0Var.mo1625j(context, C0506e.abc_star_black_48dp);
            Drawable j2 = n0Var.mo1625j(context, C0506e.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m1173m(Drawable drawable, int i, Mode mode) {
            if (DrawableUtils.m1120a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = AppCompatDrawableManager.f1050a;
            }
            drawable.setColorFilter(AppCompatDrawableManager.m1159e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1502a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.f1050a
                int[] r1 = r6.f1053a
                boolean r1 = r6.m1166f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p010b.p011a.C0502a.f3300w
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1055c
                boolean r1 = r6.m1166f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p010b.p011a.C0502a.f3298u
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1056d
                boolean r1 = r6.m1166f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p010b.p011a.C0506e.f3357u
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p010b.p011a.C0506e.f3348l
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.DrawableUtils.m1120a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.ThemeUtils.m1345c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.AppCompatDrawableManager.m1159e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.C0172a.mo1502a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public Mode mo1503b(int i) {
            if (i == C0506e.f3328H) {
                return Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public Drawable mo1504c(ResourceManagerInternal n0Var, Context context, int i) {
            if (i == C0506e.f3346j) {
                return new LayerDrawable(new Drawable[]{n0Var.mo1625j(context, C0506e.f3345i), n0Var.mo1625j(context, C0506e.f3347k)});
            } else if (i == C0506e.f3361y) {
                return m1172l(n0Var, context, C0505d.abc_star_big);
            } else {
                if (i == C0506e.f3360x) {
                    return m1172l(n0Var, context, C0505d.abc_star_medium);
                }
                if (i == C0506e.f3362z) {
                    return m1172l(n0Var, context, C0505d.abc_star_small);
                }
                return null;
            }
        }

        /* renamed from: d */
        public ColorStateList mo1505d(Context context, int i) {
            if (i == C0506e.f3349m) {
                return AppCompatResources.m4142c(context, C0504c.f3307e);
            }
            if (i == C0506e.f3329I) {
                return AppCompatResources.m4142c(context, C0504c.f3310h);
            }
            if (i == C0506e.f3328H) {
                return m1171k(context);
            }
            if (i == C0506e.f3342f) {
                return m1170j(context);
            }
            if (i == C0506e.f3338b) {
                return m1167g(context);
            }
            if (i == C0506e.f3341e) {
                return m1169i(context);
            }
            if (i == C0506e.f3326D || i == C0506e.f3327E) {
                return AppCompatResources.m4142c(context, C0504c.f3309g);
            }
            if (m1166f(this.f1054b, i)) {
                return ThemeUtils.m1347e(context, C0502a.f3300w);
            }
            if (m1166f(this.f1057e, i)) {
                return AppCompatResources.m4142c(context, C0504c.f3306d);
            }
            if (m1166f(this.f1058f, i)) {
                return AppCompatResources.m4142c(context, C0504c.f3305c);
            }
            if (i == C0506e.f3323A) {
                return AppCompatResources.m4142c(context, C0504c.f3308f);
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo1506e(Context context, int i, Drawable drawable) {
            if (i == C0506e.f3325C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C0502a.f3300w;
                m1173m(findDrawableByLayerId, ThemeUtils.m1345c(context, i2), AppCompatDrawableManager.f1050a);
                m1173m(layerDrawable.findDrawableByLayerId(16908303), ThemeUtils.m1345c(context, i2), AppCompatDrawableManager.f1050a);
                m1173m(layerDrawable.findDrawableByLayerId(16908301), ThemeUtils.m1345c(context, C0502a.f3298u), AppCompatDrawableManager.f1050a);
                return true;
            } else if (i != C0506e.f3361y && i != C0506e.f3360x && i != C0506e.f3362z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1173m(layerDrawable2.findDrawableByLayerId(16908288), ThemeUtils.m1344b(context, C0502a.f3300w), AppCompatDrawableManager.f1050a);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C0502a.f3298u;
                m1173m(findDrawableByLayerId2, ThemeUtils.m1345c(context, i3), AppCompatDrawableManager.f1050a);
                m1173m(layerDrawable2.findDrawableByLayerId(16908301), ThemeUtils.m1345c(context, i3), AppCompatDrawableManager.f1050a);
                return true;
            }
        }
    }

    /* renamed from: b */
    public static synchronized AppCompatDrawableManager m1158b() {
        AppCompatDrawableManager jVar;
        synchronized (AppCompatDrawableManager.class) {
            if (f1051b == null) {
                m1160h();
            }
            jVar = f1051b;
        }
        return jVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1159e(int i, Mode mode) {
        PorterDuffColorFilter l;
        synchronized (AppCompatDrawableManager.class) {
            l = ResourceManagerInternal.m1269l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m1160h() {
        synchronized (AppCompatDrawableManager.class) {
            if (f1051b == null) {
                AppCompatDrawableManager jVar = new AppCompatDrawableManager();
                f1051b = jVar;
                jVar.f1052c = ResourceManagerInternal.m1267h();
                f1051b.f1052c.mo1631u(new C0172a());
            }
        }
    }

    /* renamed from: i */
    static void m1161i(Drawable drawable, TintInfo v0Var, int[] iArr) {
        ResourceManagerInternal.m1275w(drawable, v0Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo1498c(Context context, int i) {
        return this.f1052c.mo1625j(context, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized Drawable mo1499d(Context context, int i, boolean z) {
        return this.f1052c.mo1626k(context, i, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public synchronized ColorStateList mo1500f(Context context, int i) {
        return this.f1052c.mo1627m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo1501g(Context context) {
        this.f1052c.mo1629s(context);
    }
}
