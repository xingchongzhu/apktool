package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;

/* renamed from: androidx.appcompat.widget.i */
class AppCompatCompoundButtonHelper {

    /* renamed from: a */
    private final CompoundButton f1033a;

    /* renamed from: b */
    private ColorStateList f1034b = null;

    /* renamed from: c */
    private Mode f1035c = null;

    /* renamed from: d */
    private boolean f1036d = false;

    /* renamed from: e */
    private boolean f1037e = false;

    /* renamed from: f */
    private boolean f1038f;

    AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.f1033a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1484a() {
        Drawable a = CompoundButtonCompat.m1956a(this.f1033a);
        if (a == null) {
            return;
        }
        if (this.f1036d || this.f1037e) {
            Drawable mutate = DrawableCompat.m1859r(a).mutate();
            if (this.f1036d) {
                DrawableCompat.m1856o(mutate, this.f1034b);
            }
            if (this.f1037e) {
                DrawableCompat.m1857p(mutate, this.f1035c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1033a.getDrawableState());
            }
            this.f1033a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1485b(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = CompoundButtonCompat.m1956a(this.f1033a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ColorStateList mo1486c() {
        return this.f1034b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Mode mo1487d() {
        return this.f1035c;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1488e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1033a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p010b.p011a.C0511j.f3520R0
            r8 = 0
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.TintTypedArray.m1406v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1033a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo1849r()
            r7 = 0
            r4 = r10
            r6 = r11
            p010b.p034g.p043k.ViewCompat.m5569m0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p010b.p011a.C0511j.f3528T0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1850s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo1845n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1033a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p010b.p011a.p012k.p013a.AppCompatResources.m4143d(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p010b.p011a.C0511j.f3524S0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1850s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo1845n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1033a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p010b.p011a.p012k.p013a.AppCompatResources.m4143d(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p010b.p011a.C0511j.f3532U0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1850s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1033a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo1834c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.CompoundButtonCompat.m1958c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p010b.p011a.C0511j.f3536V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1850s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1033a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo1842k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.m1123d(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.CompoundButtonCompat.m1959d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo1851w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo1851w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCompoundButtonHelper.mo1488e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1489f() {
        if (this.f1038f) {
            this.f1038f = false;
            return;
        }
        this.f1038f = true;
        mo1484a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1490g(ColorStateList colorStateList) {
        this.f1034b = colorStateList;
        this.f1036d = true;
        mo1484a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1491h(Mode mode) {
        this.f1035c = mode;
        this.f1037e = true;
        mo1484a();
    }
}
