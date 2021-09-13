package p010b.p011a.p014l.p015a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.SparseArray;
import androidx.core.graphics.drawable.DrawableCompat;

/* renamed from: b.a.l.a.b */
class DrawableContainer extends Drawable implements Callback {

    /* renamed from: a */
    private C0523d f3705a;

    /* renamed from: b */
    private Rect f3706b;

    /* renamed from: c */
    private Drawable f3707c;

    /* renamed from: d */
    private Drawable f3708d;

    /* renamed from: e */
    private int f3709e = 255;

    /* renamed from: f */
    private boolean f3710f;

    /* renamed from: g */
    private int f3711g = -1;

    /* renamed from: h */
    private boolean f3712h;

    /* renamed from: i */
    private Runnable f3713i;

    /* renamed from: j */
    private long f3714j;

    /* renamed from: k */
    private long f3715k;

    /* renamed from: l */
    private C0522c f3716l;

    /* renamed from: b.a.l.a.b$a */
    /* compiled from: DrawableContainer */
    class C0520a implements Runnable {
        C0520a() {
        }

        public void run() {
            DrawableContainer.this.mo4123a(true);
            DrawableContainer.this.invalidateSelf();
        }
    }

    /* renamed from: b.a.l.a.b$b */
    /* compiled from: DrawableContainer */
    private static class C0521b {
        /* renamed from: a */
        public static boolean m4191a(ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m4192b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m4193c(Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: b.a.l.a.b$c */
    /* compiled from: DrawableContainer */
    static class C0522c implements Callback {

        /* renamed from: a */
        private Callback f3718a;

        C0522c() {
        }

        /* renamed from: a */
        public Callback mo4131a() {
            Callback callback = this.f3718a;
            this.f3718a = null;
            return callback;
        }

        /* renamed from: b */
        public C0522c mo4132b(Callback callback) {
            this.f3718a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.f3718a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.f3718a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: b.a.l.a.b$d */
    /* compiled from: DrawableContainer */
    static abstract class C0523d extends ConstantState {

        /* renamed from: A */
        int f3719A = 0;

        /* renamed from: B */
        int f3720B = 0;

        /* renamed from: C */
        boolean f3721C;

        /* renamed from: D */
        ColorFilter f3722D;

        /* renamed from: E */
        boolean f3723E;

        /* renamed from: F */
        ColorStateList f3724F;

        /* renamed from: G */
        Mode f3725G;

        /* renamed from: H */
        boolean f3726H;

        /* renamed from: I */
        boolean f3727I;

        /* renamed from: a */
        final DrawableContainer f3728a;

        /* renamed from: b */
        Resources f3729b;

        /* renamed from: c */
        int f3730c;

        /* renamed from: d */
        int f3731d;

        /* renamed from: e */
        int f3732e;

        /* renamed from: f */
        SparseArray<ConstantState> f3733f;

        /* renamed from: g */
        Drawable[] f3734g;

        /* renamed from: h */
        int f3735h;

        /* renamed from: i */
        boolean f3736i = false;

        /* renamed from: j */
        boolean f3737j;

        /* renamed from: k */
        Rect f3738k;

        /* renamed from: l */
        boolean f3739l = false;

        /* renamed from: m */
        boolean f3740m;

        /* renamed from: n */
        int f3741n;

        /* renamed from: o */
        int f3742o;

        /* renamed from: p */
        int f3743p;

        /* renamed from: q */
        int f3744q;

        /* renamed from: r */
        boolean f3745r;

        /* renamed from: s */
        int f3746s;

        /* renamed from: t */
        boolean f3747t;

        /* renamed from: u */
        boolean f3748u;

        /* renamed from: v */
        boolean f3749v;

        /* renamed from: w */
        boolean f3750w;

        /* renamed from: x */
        boolean f3751x = true;

        /* renamed from: y */
        boolean f3752y;

        /* renamed from: z */
        int f3753z;

        C0523d(C0523d dVar, DrawableContainer bVar, Resources resources) {
            this.f3728a = bVar;
            Rect rect = null;
            Resources resources2 = resources != null ? resources : dVar != null ? dVar.f3729b : null;
            this.f3729b = resources2;
            int f = DrawableContainer.m4184f(resources, dVar != null ? dVar.f3730c : 0);
            this.f3730c = f;
            if (dVar != null) {
                this.f3731d = dVar.f3731d;
                this.f3732e = dVar.f3732e;
                this.f3749v = true;
                this.f3750w = true;
                this.f3736i = dVar.f3736i;
                this.f3739l = dVar.f3739l;
                this.f3751x = dVar.f3751x;
                this.f3752y = dVar.f3752y;
                this.f3753z = dVar.f3753z;
                this.f3719A = dVar.f3719A;
                this.f3720B = dVar.f3720B;
                this.f3721C = dVar.f3721C;
                this.f3722D = dVar.f3722D;
                this.f3723E = dVar.f3723E;
                this.f3724F = dVar.f3724F;
                this.f3725G = dVar.f3725G;
                this.f3726H = dVar.f3726H;
                this.f3727I = dVar.f3727I;
                if (dVar.f3730c == f) {
                    if (dVar.f3737j) {
                        if (dVar.f3738k != null) {
                            rect = new Rect(dVar.f3738k);
                        }
                        this.f3738k = rect;
                        this.f3737j = true;
                    }
                    if (dVar.f3740m) {
                        this.f3741n = dVar.f3741n;
                        this.f3742o = dVar.f3742o;
                        this.f3743p = dVar.f3743p;
                        this.f3744q = dVar.f3744q;
                        this.f3740m = true;
                    }
                }
                if (dVar.f3745r) {
                    this.f3746s = dVar.f3746s;
                    this.f3745r = true;
                }
                if (dVar.f3747t) {
                    this.f3748u = dVar.f3748u;
                    this.f3747t = true;
                }
                Drawable[] drawableArr = dVar.f3734g;
                this.f3734g = new Drawable[drawableArr.length];
                this.f3735h = dVar.f3735h;
                SparseArray<ConstantState> sparseArray = dVar.f3733f;
                if (sparseArray != null) {
                    this.f3733f = sparseArray.clone();
                } else {
                    this.f3733f = new SparseArray<>(this.f3735h);
                }
                int i = this.f3735h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f3733f.put(i2, constantState);
                        } else {
                            this.f3734g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f3734g = new Drawable[10];
            this.f3735h = 0;
        }

        /* renamed from: e */
        private void m4196e() {
            SparseArray<ConstantState> sparseArray = this.f3733f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f3734g[this.f3733f.keyAt(i)] = m4197s(((ConstantState) this.f3733f.valueAt(i)).newDrawable(this.f3729b));
                }
                this.f3733f = null;
            }
        }

        /* renamed from: s */
        private Drawable m4197s(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                DrawableCompat.m1854m(drawable, this.f3753z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f3728a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo4136a(Drawable drawable) {
            int i = this.f3735h;
            if (i >= this.f3734g.length) {
                mo4151o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f3728a);
            this.f3734g[i] = drawable;
            this.f3735h++;
            this.f3732e = drawable.getChangingConfigurations() | this.f3732e;
            mo4152p();
            this.f3738k = null;
            this.f3737j = false;
            this.f3740m = false;
            this.f3749v = false;
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo4137b(Theme theme) {
            if (theme != null) {
                m4196e();
                int i = this.f3735h;
                Drawable[] drawableArr = this.f3734g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && DrawableCompat.m1843b(drawableArr[i2])) {
                        DrawableCompat.m1842a(drawableArr[i2], theme);
                        this.f3732e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo4159y(C0521b.m4193c(theme));
            }
        }

        /* renamed from: c */
        public boolean mo4138c() {
            if (this.f3749v) {
                return this.f3750w;
            }
            m4196e();
            this.f3749v = true;
            int i = this.f3735h;
            Drawable[] drawableArr = this.f3734g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f3750w = false;
                    return false;
                }
            }
            this.f3750w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f3735h;
            Drawable[] drawableArr = this.f3734g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f3733f.get(i2);
                    if (constantState != null && C0521b.m4191a(constantState)) {
                        return true;
                    }
                } else if (DrawableCompat.m1843b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo4140d() {
            this.f3740m = true;
            m4196e();
            int i = this.f3735h;
            Drawable[] drawableArr = this.f3734g;
            this.f3742o = -1;
            this.f3741n = -1;
            this.f3744q = 0;
            this.f3743p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f3741n) {
                    this.f3741n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f3742o) {
                    this.f3742o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f3743p) {
                    this.f3743p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f3744q) {
                    this.f3744q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final int mo4141f() {
            return this.f3734g.length;
        }

        /* renamed from: g */
        public final Drawable mo4142g(int i) {
            Drawable drawable = this.f3734g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.f3733f;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable s = m4197s(((ConstantState) this.f3733f.valueAt(indexOfKey)).newDrawable(this.f3729b));
                    this.f3734g[i] = s;
                    this.f3733f.removeAt(indexOfKey);
                    if (this.f3733f.size() == 0) {
                        this.f3733f = null;
                    }
                    return s;
                }
            }
            return null;
        }

        public int getChangingConfigurations() {
            return this.f3731d | this.f3732e;
        }

        /* renamed from: h */
        public final int mo4144h() {
            return this.f3735h;
        }

        /* renamed from: i */
        public final int mo4145i() {
            if (!this.f3740m) {
                mo4140d();
            }
            return this.f3742o;
        }

        /* renamed from: j */
        public final int mo4146j() {
            if (!this.f3740m) {
                mo4140d();
            }
            return this.f3744q;
        }

        /* renamed from: k */
        public final int mo4147k() {
            if (!this.f3740m) {
                mo4140d();
            }
            return this.f3743p;
        }

        /* renamed from: l */
        public final Rect mo4148l() {
            Rect rect = null;
            if (this.f3736i) {
                return null;
            }
            Rect rect2 = this.f3738k;
            if (rect2 != null || this.f3737j) {
                return rect2;
            }
            m4196e();
            Rect rect3 = new Rect();
            int i = this.f3735h;
            Drawable[] drawableArr = this.f3734g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f3737j = true;
            this.f3738k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo4149m() {
            if (!this.f3740m) {
                mo4140d();
            }
            return this.f3741n;
        }

        /* renamed from: n */
        public final int mo4150n() {
            if (this.f3745r) {
                return this.f3746s;
            }
            m4196e();
            int i = this.f3735h;
            Drawable[] drawableArr = this.f3734g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f3746s = opacity;
            this.f3745r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo4151o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f3734g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f3734g = drawableArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public void mo4152p() {
            this.f3745r = false;
            this.f3747t = false;
        }

        /* renamed from: q */
        public final boolean mo4153q() {
            return this.f3739l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public abstract void mo4117r();

        /* renamed from: t */
        public final void mo4154t(boolean z) {
            this.f3739l = z;
        }

        /* renamed from: u */
        public final void mo4155u(int i) {
            this.f3719A = i;
        }

        /* renamed from: v */
        public final void mo4156v(int i) {
            this.f3720B = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public final boolean mo4157w(int i, int i2) {
            int i3 = this.f3735h;
            Drawable[] drawableArr = this.f3734g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m = VERSION.SDK_INT >= 23 ? DrawableCompat.m1854m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.f3753z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo4158x(boolean z) {
            this.f3736i = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: y */
        public final void mo4159y(Resources resources) {
            if (resources != null) {
                this.f3729b = resources;
                int f = DrawableContainer.m4184f(resources, this.f3730c);
                int i = this.f3730c;
                this.f3730c = f;
                if (i != f) {
                    this.f3740m = false;
                    this.f3737j = false;
                }
            }
        }
    }

    DrawableContainer() {
    }

    /* renamed from: d */
    private void m4182d(Drawable drawable) {
        if (this.f3716l == null) {
            this.f3716l = new C0522c();
        }
        drawable.setCallback(this.f3716l.mo4132b(drawable.getCallback()));
        try {
            if (this.f3705a.f3719A <= 0 && this.f3710f) {
                drawable.setAlpha(this.f3709e);
            }
            C0523d dVar = this.f3705a;
            if (dVar.f3723E) {
                drawable.setColorFilter(dVar.f3722D);
            } else {
                if (dVar.f3726H) {
                    DrawableCompat.m1856o(drawable, dVar.f3724F);
                }
                C0523d dVar2 = this.f3705a;
                if (dVar2.f3727I) {
                    DrawableCompat.m1857p(drawable, dVar2.f3725G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3705a.f3751x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = VERSION.SDK_INT;
            if (i >= 23) {
                DrawableCompat.m1854m(drawable, DrawableCompat.m1847f(this));
            }
            if (i >= 19) {
                DrawableCompat.m1851j(drawable, this.f3705a.f3721C);
            }
            Rect rect = this.f3706b;
            if (i >= 21 && rect != null) {
                DrawableCompat.m1853l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f3716l.mo4131a());
        }
    }

    /* renamed from: e */
    private boolean m4183e() {
        if (!isAutoMirrored() || DrawableCompat.m1847f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    static int m4184f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4123a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f3710f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f3707c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f3714j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f3709e
            r3.setAlpha(r9)
            r13.f3714j = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            b.a.l.a.b$d r9 = r13.f3705a
            int r9 = r9.f3719A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f3709e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f3714j = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f3708d
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f3715k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f3708d = r0
            r13.f3715k = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            b.a.l.a.b$d r4 = r13.f3705a
            int r4 = r4.f3720B
            int r3 = r3 / r4
            int r4 = r13.f3709e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f3715k = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f3713i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p011a.p014l.p015a.DrawableContainer.mo4123a(boolean):void");
    }

    public void applyTheme(Theme theme) {
        this.f3705a.mo4137b(theme);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0523d mo4072b() {
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo4124c() {
        return this.f3711g;
    }

    public boolean canApplyTheme() {
        return this.f3705a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3707c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f3708d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4125g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f3711g
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            b.a.l.a.b$d r0 = r9.f3705a
            int r0 = r0.f3720B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f3708d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f3707c
            if (r0 == 0) goto L_0x0029
            r9.f3708d = r0
            b.a.l.a.b$d r0 = r9.f3705a
            int r0 = r0.f3720B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f3715k = r0
            goto L_0x0035
        L_0x0029:
            r9.f3708d = r4
            r9.f3715k = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f3707c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            b.a.l.a.b$d r0 = r9.f3705a
            int r1 = r0.f3735h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo4142g(r10)
            r9.f3707c = r0
            r9.f3711g = r10
            if (r0 == 0) goto L_0x005a
            b.a.l.a.b$d r10 = r9.f3705a
            int r10 = r10.f3719A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f3714j = r2
        L_0x0051:
            r9.m4182d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f3707c = r4
            r10 = -1
            r9.f3711g = r10
        L_0x005a:
            long r0 = r9.f3714j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f3715k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f3713i
            if (r0 != 0) goto L_0x0073
            b.a.l.a.b$a r0 = new b.a.l.a.b$a
            r0.<init>()
            r9.f3713i = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo4123a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p011a.p014l.p015a.DrawableContainer.mo4125g(int):boolean");
    }

    public int getAlpha() {
        return this.f3709e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3705a.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.f3705a.mo4138c()) {
            return null;
        }
        this.f3705a.f3731d = getChangingConfigurations();
        return this.f3705a;
    }

    public Drawable getCurrent() {
        return this.f3707c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3706b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f3705a.mo4153q()) {
            return this.f3705a.mo4145i();
        }
        Drawable drawable = this.f3707c;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        if (this.f3705a.mo4153q()) {
            return this.f3705a.mo4149m();
        }
        Drawable drawable = this.f3707c;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getMinimumHeight() {
        if (this.f3705a.mo4153q()) {
            return this.f3705a.mo4146j();
        }
        Drawable drawable = this.f3707c;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public int getMinimumWidth() {
        if (this.f3705a.mo4153q()) {
            return this.f3705a.mo4147k();
        }
        Drawable drawable = this.f3707c;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f3707c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f3705a.mo4150n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f3707c;
        if (drawable != null) {
            C0521b.m4192b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f3705a.mo4148l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f3707c;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m4183e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4086h(C0523d dVar) {
        this.f3705a = dVar;
        int i = this.f3711g;
        if (i >= 0) {
            Drawable g = dVar.mo4142g(i);
            this.f3707c = g;
            if (g != null) {
                m4182d(g);
            }
        }
        this.f3708d = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo4127i(Resources resources) {
        this.f3705a.mo4159y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C0523d dVar = this.f3705a;
        if (dVar != null) {
            dVar.mo4152p();
        }
        if (drawable == this.f3707c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f3705a.f3721C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f3708d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f3708d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f3707c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3710f) {
                this.f3707c.setAlpha(this.f3709e);
            }
        }
        if (this.f3715k != 0) {
            this.f3715k = 0;
            z = true;
        }
        if (this.f3714j != 0) {
            this.f3714j = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f3712h && super.mutate() == this) {
            C0523d b = mo4072b();
            b.mo4117r();
            mo4086h(b);
            this.f3712h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3708d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3707c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f3705a.mo4157w(i, mo4124c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3708d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f3707c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3708d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f3707c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f3707c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f3710f || this.f3709e != i) {
            this.f3710f = true;
            this.f3709e = i;
            Drawable drawable = this.f3707c;
            if (drawable == null) {
                return;
            }
            if (this.f3714j == 0) {
                drawable.setAlpha(i);
            } else {
                mo4123a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C0523d dVar = this.f3705a;
        if (dVar.f3721C != z) {
            dVar.f3721C = z;
            Drawable drawable = this.f3707c;
            if (drawable != null) {
                DrawableCompat.m1851j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0523d dVar = this.f3705a;
        dVar.f3723E = true;
        if (dVar.f3722D != colorFilter) {
            dVar.f3722D = colorFilter;
            Drawable drawable = this.f3707c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C0523d dVar = this.f3705a;
        if (dVar.f3751x != z) {
            dVar.f3751x = z;
            Drawable drawable = this.f3707c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f3707c;
        if (drawable != null) {
            DrawableCompat.m1852k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f3706b;
        if (rect == null) {
            this.f3706b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f3707c;
        if (drawable != null) {
            DrawableCompat.m1853l(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C0523d dVar = this.f3705a;
        dVar.f3726H = true;
        if (dVar.f3724F != colorStateList) {
            dVar.f3724F = colorStateList;
            DrawableCompat.m1856o(this.f3707c, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        C0523d dVar = this.f3705a;
        dVar.f3727I = true;
        if (dVar.f3725G != mode) {
            dVar.f3725G = mode;
            DrawableCompat.m1857p(this.f3707c, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f3708d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f3707c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f3707c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
