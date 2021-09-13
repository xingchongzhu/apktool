package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.p007c.ResourcesCompat.C0257a;
import androidx.core.widget.AutoSizeableTextView;
import java.lang.ref.WeakReference;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p045g0.EditorInfoCompat;

/* renamed from: androidx.appcompat.widget.z */
class AppCompatTextHelper {

    /* renamed from: a */
    private final TextView f1287a;

    /* renamed from: b */
    private TintInfo f1288b;

    /* renamed from: c */
    private TintInfo f1289c;

    /* renamed from: d */
    private TintInfo f1290d;

    /* renamed from: e */
    private TintInfo f1291e;

    /* renamed from: f */
    private TintInfo f1292f;

    /* renamed from: g */
    private TintInfo f1293g;

    /* renamed from: h */
    private TintInfo f1294h;

    /* renamed from: i */
    private final AppCompatTextViewAutoSizeHelper f1295i;

    /* renamed from: j */
    private int f1296j = 0;

    /* renamed from: k */
    private int f1297k = -1;

    /* renamed from: l */
    private Typeface f1298l;

    /* renamed from: m */
    private boolean f1299m;

    /* renamed from: androidx.appcompat.widget.z$a */
    /* compiled from: AppCompatTextHelper */
    class C0209a extends C0257a {

        /* renamed from: a */
        final /* synthetic */ int f1300a;

        /* renamed from: b */
        final /* synthetic */ int f1301b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1302c;

        C0209a(int i, int i2, WeakReference weakReference) {
            this.f1300a = i;
            this.f1301b = i2;
            this.f1302c = weakReference;
        }

        /* renamed from: d */
        public void mo1886d(int i) {
        }

        /* renamed from: e */
        public void mo1887e(Typeface typeface) {
            if (VERSION.SDK_INT >= 28) {
                int i = this.f1300a;
                if (i != -1) {
                    typeface = Typeface.create(typeface, i, (this.f1301b & 2) != 0);
                }
            }
            AppCompatTextHelper.this.mo1875n(this.f1302c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    /* compiled from: AppCompatTextHelper */
    class C0210b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f1304a;

        /* renamed from: b */
        final /* synthetic */ Typeface f1305b;

        /* renamed from: c */
        final /* synthetic */ int f1306c;

        C0210b(TextView textView, Typeface typeface, int i) {
            this.f1304a = textView;
            this.f1305b = typeface;
            this.f1306c = i;
        }

        public void run() {
            this.f1304a.setTypeface(this.f1305b, this.f1306c);
        }
    }

    AppCompatTextHelper(TextView textView) {
        this.f1287a = textView;
        this.f1295i = new AppCompatTextViewAutoSizeHelper(textView);
    }

    /* renamed from: B */
    private void m1467B(int i, float f) {
        this.f1295i.mo1355y(i, f);
    }

    /* renamed from: C */
    private void m1468C(Context context, TintTypedArray x0Var) {
        this.f1296j = x0Var.mo1842k(C0511j.f3502M2, this.f1296j);
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int k = x0Var.mo1842k(C0511j.f3522R2, -1);
            this.f1297k = k;
            if (k != -1) {
                this.f1296j = (this.f1296j & 2) | 0;
            }
        }
        int i2 = C0511j.f3518Q2;
        if (x0Var.mo1850s(i2) || x0Var.mo1850s(C0511j.f3526S2)) {
            this.f1298l = null;
            int i3 = C0511j.f3526S2;
            if (x0Var.mo1850s(i3)) {
                i2 = i3;
            }
            int i4 = this.f1297k;
            int i5 = this.f1296j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = x0Var.mo1841j(i2, this.f1296j, new C0209a(i4, i5, new WeakReference(this.f1287a)));
                    if (j != null) {
                        if (i < 28 || this.f1297k == -1) {
                            this.f1298l = j;
                        } else {
                            this.f1298l = Typeface.create(Typeface.create(j, 0), this.f1297k, (this.f1296j & 2) != 0);
                        }
                    }
                    this.f1299m = this.f1298l == null;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1298l == null) {
                String o = x0Var.mo1846o(i2);
                if (o != null) {
                    if (VERSION.SDK_INT < 28 || this.f1297k == -1) {
                        this.f1298l = Typeface.create(o, this.f1296j);
                    } else {
                        Typeface create = Typeface.create(o, 0);
                        int i6 = this.f1297k;
                        if ((this.f1296j & 2) != 0) {
                            z = true;
                        }
                        this.f1298l = Typeface.create(create, i6, z);
                    }
                }
            }
            return;
        }
        int i7 = C0511j.f3498L2;
        if (x0Var.mo1850s(i7)) {
            this.f1299m = false;
            int k2 = x0Var.mo1842k(i7, 1);
            if (k2 == 1) {
                this.f1298l = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                this.f1298l = Typeface.SERIF;
            } else if (k2 == 3) {
                this.f1298l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    private void m1469a(Drawable drawable, TintInfo v0Var) {
        if (drawable != null && v0Var != null) {
            AppCompatDrawableManager.m1161i(drawable, v0Var, this.f1287a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static TintInfo m1470d(Context context, AppCompatDrawableManager jVar, int i) {
        ColorStateList f = jVar.mo1500f(context, i);
        if (f == null) {
            return null;
        }
        TintInfo v0Var = new TintInfo();
        v0Var.f1223d = true;
        v0Var.f1220a = f;
        return v0Var;
    }

    /* renamed from: y */
    private void m1471y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1287a.getCompoundDrawablesRelative();
            TextView textView = this.f1287a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            if (i >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1287a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1287a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1287a.getCompoundDrawables();
            TextView textView3 = this.f1287a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: z */
    private void m1472z() {
        TintInfo v0Var = this.f1294h;
        this.f1288b = v0Var;
        this.f1289c = v0Var;
        this.f1290d = v0Var;
        this.f1291e = v0Var;
        this.f1292f = v0Var;
        this.f1293g = v0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo1863A(int i, float f) {
        if (!AutoSizeableTextView.f2108E && !mo1873l()) {
            m1467B(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1864b() {
        if (!(this.f1288b == null && this.f1289c == null && this.f1290d == null && this.f1291e == null)) {
            Drawable[] compoundDrawables = this.f1287a.getCompoundDrawables();
            m1469a(compoundDrawables[0], this.f1288b);
            m1469a(compoundDrawables[1], this.f1289c);
            m1469a(compoundDrawables[2], this.f1290d);
            m1469a(compoundDrawables[3], this.f1291e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1292f != null || this.f1293g != null) {
            Drawable[] compoundDrawablesRelative = this.f1287a.getCompoundDrawablesRelative();
            m1469a(compoundDrawablesRelative[0], this.f1292f);
            m1469a(compoundDrawablesRelative[2], this.f1293g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1865c() {
        this.f1295i.mo1342b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo1866e() {
        return this.f1295i.mo1344j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo1867f() {
        return this.f1295i.mo1345k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo1868g() {
        return this.f1295i.mo1346l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int[] mo1869h() {
        return this.f1295i.mo1347m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo1870i() {
        return this.f1295i.mo1348n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public ColorStateList mo1871j() {
        TintInfo v0Var = this.f1294h;
        if (v0Var != null) {
            return v0Var.f1220a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Mode mo1872k() {
        TintInfo v0Var = this.f1294h;
        if (v0Var != null) {
            return v0Var.f1221b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo1873l() {
        return this.f1295i.mo1350s();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1874m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f1287a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.j r11 = androidx.appcompat.widget.AppCompatDrawableManager.m1158b()
            int[] r2 = p010b.p011a.C0511j.f3556a0
            r12 = 0
            androidx.appcompat.widget.x0 r13 = androidx.appcompat.widget.TintTypedArray.m1406v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1287a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo1849r()
            r6 = 0
            r3 = r24
            r5 = r25
            p010b.p034g.p043k.ViewCompat.m5569m0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p010b.p011a.C0511j.f3561b0
            r14 = -1
            int r0 = r13.mo1845n(r0, r14)
            int r1 = p010b.p011a.C0511j.f3576e0
            boolean r2 = r13.mo1850s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo1845n(r1, r12)
            androidx.appcompat.widget.v0 r1 = m1470d(r10, r11, r1)
            r7.f1288b = r1
        L_0x0042:
            int r1 = p010b.p011a.C0511j.f3566c0
            boolean r2 = r13.mo1850s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo1845n(r1, r12)
            androidx.appcompat.widget.v0 r1 = m1470d(r10, r11, r1)
            r7.f1289c = r1
        L_0x0054:
            int r1 = p010b.p011a.C0511j.f3581f0
            boolean r2 = r13.mo1850s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo1845n(r1, r12)
            androidx.appcompat.widget.v0 r1 = m1470d(r10, r11, r1)
            r7.f1290d = r1
        L_0x0066:
            int r1 = p010b.p011a.C0511j.f3571d0
            boolean r2 = r13.mo1850s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo1845n(r1, r12)
            androidx.appcompat.widget.v0 r1 = m1470d(r10, r11, r1)
            r7.f1291e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = p010b.p011a.C0511j.f3586g0
            boolean r3 = r13.mo1850s(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.mo1845n(r2, r12)
            androidx.appcompat.widget.v0 r2 = m1470d(r10, r11, r2)
            r7.f1292f = r2
        L_0x0090:
            int r2 = p010b.p011a.C0511j.f3591h0
            boolean r3 = r13.mo1850s(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.mo1845n(r2, r12)
            androidx.appcompat.widget.v0 r2 = m1470d(r10, r11, r2)
            r7.f1293g = r2
        L_0x00a2:
            r13.mo1851w()
            android.widget.TextView r2 = r7.f1287a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = p010b.p011a.C0511j.f3488J2
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.TintTypedArray.m1404t(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = p010b.p011a.C0511j.f3534U2
            boolean r15 = r0.mo1850s(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.mo1832a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = 0
            r15 = 0
        L_0x00cb:
            r7.m1468C(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = p010b.p011a.C0511j.f3506N2
            boolean r17 = r0.mo1850s(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.mo1834c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = p010b.p011a.C0511j.f3510O2
            boolean r18 = r0.mo1850s(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.mo1834c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = p010b.p011a.C0511j.f3514P2
            boolean r19 = r0.mo1850s(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.mo1834c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = p010b.p011a.C0511j.f3538V2
            boolean r20 = r0.mo1850s(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.mo1846o(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = p010b.p011a.C0511j.f3530T2
            boolean r21 = r0.mo1850s(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.mo1846o(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.mo1851w()
            goto L_0x0125
        L_0x011e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0125:
            int[] r0 = p010b.p011a.C0511j.f3488J2
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.TintTypedArray.m1406v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = p010b.p011a.C0511j.f3534U2
            boolean r22 = r0.mo1850s(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.mo1832a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = p010b.p011a.C0511j.f3506N2
            boolean r12 = r0.mo1850s(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.mo1834c(r3)
        L_0x0152:
            int r3 = p010b.p011a.C0511j.f3510O2
            boolean r12 = r0.mo1850s(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.mo1834c(r3)
        L_0x015e:
            int r3 = p010b.p011a.C0511j.f3514P2
            boolean r12 = r0.mo1850s(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.mo1834c(r3)
        L_0x016a:
            int r3 = p010b.p011a.C0511j.f3538V2
            boolean r12 = r0.mo1850s(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.mo1846o(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = p010b.p011a.C0511j.f3530T2
            boolean r12 = r0.mo1850s(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.mo1846o(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = p010b.p011a.C0511j.f3493K2
            boolean r16 = r0.mo1850s(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.mo1837f(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.f1287a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.m1468C(r10, r0)
            r0.mo1851w()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.f1287a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.f1287a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.f1287a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.mo1880s(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f1298l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f1297k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.f1287a
            int r4 = r7.f1296j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.f1287a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.f1287a
            r0.setFontVariationSettings(r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020f
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.f1287a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r5)
            r0.setTextLocales(r1)
            goto L_0x020f
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020f
            r0 = 44
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            android.widget.TextView r1 = r7.f1287a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x020f:
            androidx.appcompat.widget.b0 r0 = r7.f1295i
            r1 = r24
            r0.mo1351t(r1, r9)
            boolean r0 = androidx.core.widget.AutoSizeableTextView.f2108E
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.b0 r0 = r7.f1295i
            int r0 = r0.mo1348n()
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.b0 r0 = r7.f1295i
            int[] r0 = r0.mo1347m()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0257
            android.widget.TextView r2 = r7.f1287a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0251
            android.widget.TextView r0 = r7.f1287a
            androidx.appcompat.widget.b0 r2 = r7.f1295i
            int r2 = r2.mo1345k()
            androidx.appcompat.widget.b0 r3 = r7.f1295i
            int r3 = r3.mo1344j()
            androidx.appcompat.widget.b0 r4 = r7.f1295i
            int r4 = r4.mo1346l()
            r5 = 0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x0257
        L_0x0251:
            r5 = 0
            android.widget.TextView r2 = r7.f1287a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r0, r5)
        L_0x0257:
            int[] r0 = p010b.p011a.C0511j.f3596i0
            androidx.appcompat.widget.x0 r8 = androidx.appcompat.widget.TintTypedArray.m1405u(r10, r1, r0)
            int r0 = p010b.p011a.C0511j.f3636q0
            r1 = -1
            int r0 = r8.mo1845n(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026e
            android.graphics.drawable.Drawable r0 = r2.mo1498c(r10, r0)
            r3 = r0
            goto L_0x026f
        L_0x026e:
            r3 = 0
        L_0x026f:
            int r0 = p010b.p011a.C0511j.f3661v0
            int r0 = r8.mo1845n(r0, r1)
            if (r0 == r1) goto L_0x027d
            android.graphics.drawable.Drawable r0 = r2.mo1498c(r10, r0)
            r4 = r0
            goto L_0x027e
        L_0x027d:
            r4 = 0
        L_0x027e:
            int r0 = p010b.p011a.C0511j.f3641r0
            int r0 = r8.mo1845n(r0, r1)
            if (r0 == r1) goto L_0x028c
            android.graphics.drawable.Drawable r0 = r2.mo1498c(r10, r0)
            r5 = r0
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            int r0 = p010b.p011a.C0511j.f3626o0
            int r0 = r8.mo1845n(r0, r1)
            if (r0 == r1) goto L_0x029b
            android.graphics.drawable.Drawable r0 = r2.mo1498c(r10, r0)
            r6 = r0
            goto L_0x029c
        L_0x029b:
            r6 = 0
        L_0x029c:
            int r0 = p010b.p011a.C0511j.f3646s0
            int r0 = r8.mo1845n(r0, r1)
            if (r0 == r1) goto L_0x02aa
            android.graphics.drawable.Drawable r0 = r2.mo1498c(r10, r0)
            r9 = r0
            goto L_0x02ab
        L_0x02aa:
            r9 = 0
        L_0x02ab:
            int r0 = p010b.p011a.C0511j.f3631p0
            int r0 = r8.mo1845n(r0, r1)
            if (r0 == r1) goto L_0x02b9
            android.graphics.drawable.Drawable r0 = r2.mo1498c(r10, r0)
            r10 = r0
            goto L_0x02ba
        L_0x02b9:
            r10 = 0
        L_0x02ba:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.m1471y(r1, r2, r3, r4, r5, r6)
            int r0 = p010b.p011a.C0511j.f3651t0
            boolean r1 = r8.mo1850s(r0)
            if (r1 == 0) goto L_0x02d6
            android.content.res.ColorStateList r0 = r8.mo1834c(r0)
            android.widget.TextView r1 = r7.f1287a
            androidx.core.widget.TextViewCompat.m1981j(r1, r0)
        L_0x02d6:
            int r0 = p010b.p011a.C0511j.f3656u0
            boolean r1 = r8.mo1850s(r0)
            if (r1 == 0) goto L_0x02ee
            r1 = -1
            int r0 = r8.mo1842k(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.m1123d(r0, r2)
            android.widget.TextView r2 = r7.f1287a
            androidx.core.widget.TextViewCompat.m1982k(r2, r0)
            goto L_0x02ef
        L_0x02ee:
            r1 = -1
        L_0x02ef:
            int r0 = p010b.p011a.C0511j.f3666w0
            int r0 = r8.mo1837f(r0, r1)
            int r2 = p010b.p011a.C0511j.f3671x0
            int r2 = r8.mo1837f(r2, r1)
            int r3 = p010b.p011a.C0511j.f3676y0
            int r3 = r8.mo1837f(r3, r1)
            r8.mo1851w()
            if (r0 == r1) goto L_0x030b
            android.widget.TextView r4 = r7.f1287a
            androidx.core.widget.TextViewCompat.m1984m(r4, r0)
        L_0x030b:
            if (r2 == r1) goto L_0x0312
            android.widget.TextView r0 = r7.f1287a
            androidx.core.widget.TextViewCompat.m1985n(r0, r2)
        L_0x0312:
            if (r3 == r1) goto L_0x0319
            android.widget.TextView r0 = r7.f1287a
            androidx.core.widget.TextViewCompat.m1986o(r0, r3)
        L_0x0319:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.mo1874m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo1875n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1299m) {
            this.f1298l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (ViewCompat.m5536S(textView)) {
                textView.post(new C0210b(textView, typeface, this.f1296j));
            } else {
                textView.setTypeface(typeface, this.f1296j);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo1876o(boolean z, int i, int i2, int i3, int i4) {
        if (!AutoSizeableTextView.f2108E) {
            mo1865c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo1877p() {
        mo1864b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo1878q(Context context, int i) {
        TintTypedArray t = TintTypedArray.m1404t(context, i, C0511j.f3488J2);
        int i2 = C0511j.f3534U2;
        if (t.mo1850s(i2)) {
            mo1880s(t.mo1832a(i2, false));
        }
        int i3 = VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C0511j.f3506N2;
            if (t.mo1850s(i4)) {
                ColorStateList c = t.mo1834c(i4);
                if (c != null) {
                    this.f1287a.setTextColor(c);
                }
            }
            int i5 = C0511j.f3514P2;
            if (t.mo1850s(i5)) {
                ColorStateList c2 = t.mo1834c(i5);
                if (c2 != null) {
                    this.f1287a.setLinkTextColor(c2);
                }
            }
            int i6 = C0511j.f3510O2;
            if (t.mo1850s(i6)) {
                ColorStateList c3 = t.mo1834c(i6);
                if (c3 != null) {
                    this.f1287a.setHintTextColor(c3);
                }
            }
        }
        int i7 = C0511j.f3493K2;
        if (t.mo1850s(i7) && t.mo1837f(i7, -1) == 0) {
            this.f1287a.setTextSize(0, 0.0f);
        }
        m1468C(context, t);
        if (i3 >= 26) {
            int i8 = C0511j.f3530T2;
            if (t.mo1850s(i8)) {
                String o = t.mo1846o(i8);
                if (o != null) {
                    this.f1287a.setFontVariationSettings(o);
                }
            }
        }
        t.mo1851w();
        Typeface typeface = this.f1298l;
        if (typeface != null) {
            this.f1287a.setTypeface(typeface, this.f1296j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo1879r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.m5435f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo1880s(boolean z) {
        this.f1287a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo1881t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1295i.mo1352u(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo1882u(int[] iArr, int i) throws IllegalArgumentException {
        this.f1295i.mo1353v(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo1883v(int i) {
        this.f1295i.mo1354w(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo1884w(ColorStateList colorStateList) {
        if (this.f1294h == null) {
            this.f1294h = new TintInfo();
        }
        TintInfo v0Var = this.f1294h;
        v0Var.f1220a = colorStateList;
        v0Var.f1223d = colorStateList != null;
        m1472z();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo1885x(Mode mode) {
        if (this.f1294h == null) {
            this.f1294h = new TintInfo();
        }
        TintInfo v0Var = this.f1294h;
        v0Var.f1221b = mode;
        v0Var.f1222c = mode != null;
        m1472z();
    }
}
