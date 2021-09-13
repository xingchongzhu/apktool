package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.widget.TextView;
import p010b.p034g.p042j.Preconditions;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

/* renamed from: com.google.android.material.datepicker.b */
final class CalendarItemStyle {

    /* renamed from: a */
    private final Rect f12842a;

    /* renamed from: b */
    private final ColorStateList f12843b;

    /* renamed from: c */
    private final ColorStateList f12844c;

    /* renamed from: d */
    private final ColorStateList f12845d;

    /* renamed from: e */
    private final int f12846e;

    /* renamed from: f */
    private final ShapeAppearanceModel f12847f;

    private CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel kVar, Rect rect) {
        Preconditions.m5186c(rect.left);
        Preconditions.m5186c(rect.top);
        Preconditions.m5186c(rect.right);
        Preconditions.m5186c(rect.bottom);
        this.f12842a = rect;
        this.f12843b = colorStateList2;
        this.f12844c = colorStateList;
        this.f12845d = colorStateList3;
        this.f12846e = i;
        this.f12847f = kVar;
    }

    /* renamed from: a */
    static CalendarItemStyle m15791a(Context context, int i) {
        Preconditions.m5184a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1297l.f9225B2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C1297l.f9233C2, 0), obtainStyledAttributes.getDimensionPixelOffset(C1297l.f9249E2, 0), obtainStyledAttributes.getDimensionPixelOffset(C1297l.f9241D2, 0), obtainStyledAttributes.getDimensionPixelOffset(C1297l.f9257F2, 0));
        ColorStateList a = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9265G2);
        ColorStateList a2 = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9301L2);
        ColorStateList a3 = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9287J2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9294K2, 0);
        ShapeAppearanceModel m = ShapeAppearanceModel.m11342b(context, obtainStyledAttributes.getResourceId(C1297l.f9273H2, 0), obtainStyledAttributes.getResourceId(C1297l.f9280I2, 0)).mo7905m();
        obtainStyledAttributes.recycle();
        CalendarItemStyle bVar = new CalendarItemStyle(a, a2, a3, dimensionPixelSize, m, rect);
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo15608b() {
        return this.f12842a.bottom;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo15609c() {
        return this.f12842a.top;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo15610d(TextView textView) {
        MaterialShapeDrawable gVar = new MaterialShapeDrawable();
        MaterialShapeDrawable gVar2 = new MaterialShapeDrawable();
        gVar.setShapeAppearanceModel(this.f12847f);
        gVar2.setShapeAppearanceModel(this.f12847f);
        gVar.mo7843X(this.f12844c);
        gVar.mo7849d0((float) this.f12846e, this.f12845d);
        textView.setTextColor(this.f12843b);
        Drawable rippleDrawable = VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f12843b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f12842a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        ViewCompat.m5579r0(textView, insetDrawable);
    }
}
