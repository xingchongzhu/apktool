package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p133z.MaterialAttributes;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

/* renamed from: com.google.android.material.datepicker.c */
final class CalendarStyle {

    /* renamed from: a */
    final CalendarItemStyle f12848a;

    /* renamed from: b */
    final CalendarItemStyle f12849b;

    /* renamed from: c */
    final CalendarItemStyle f12850c;

    /* renamed from: d */
    final CalendarItemStyle f12851d;

    /* renamed from: e */
    final CalendarItemStyle f12852e;

    /* renamed from: f */
    final CalendarItemStyle f12853f;

    /* renamed from: g */
    final CalendarItemStyle f12854g;

    /* renamed from: h */
    final Paint f12855h;

    CalendarStyle(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.m11598c(context, C1270b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C1297l.f9550s2);
        this.f12848a = CalendarItemStyle.m15791a(context, obtainStyledAttributes.getResourceId(C1297l.f9574v2, 0));
        this.f12854g = CalendarItemStyle.m15791a(context, obtainStyledAttributes.getResourceId(C1297l.f9558t2, 0));
        this.f12849b = CalendarItemStyle.m15791a(context, obtainStyledAttributes.getResourceId(C1297l.f9566u2, 0));
        this.f12850c = CalendarItemStyle.m15791a(context, obtainStyledAttributes.getResourceId(C1297l.f9582w2, 0));
        ColorStateList a = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9590x2);
        this.f12851d = CalendarItemStyle.m15791a(context, obtainStyledAttributes.getResourceId(C1297l.f9606z2, 0));
        this.f12852e = CalendarItemStyle.m15791a(context, obtainStyledAttributes.getResourceId(C1297l.f9598y2, 0));
        this.f12853f = CalendarItemStyle.m15791a(context, obtainStyledAttributes.getResourceId(C1297l.f9217A2, 0));
        Paint paint = new Paint();
        this.f12855h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
