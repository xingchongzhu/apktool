package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1297l;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a */
    private TextView f13208a;

    /* renamed from: b */
    private Button f13209b;

    /* renamed from: c */
    private int f13210c;

    /* renamed from: d */
    private int f13211d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9424c4);
        this.f13210c = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9432d4, -1);
        this.f13211d = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9488k4, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m16241a(View view, int i, int i2) {
        if (ViewCompat.m5539V(view)) {
            ViewCompat.m5511A0(view, ViewCompat.m5526I(view), i, ViewCompat.m5524H(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: b */
    private boolean m16242b(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f13208a.getPaddingTop() == i2 && this.f13208a.getPaddingBottom() == i3) {
            return z;
        }
        m16241a(this.f13208a, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f13209b;
    }

    public TextView getMessageView() {
        return this.f13208a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13208a = (TextView) findViewById(C1291f.snackbar_text);
        this.f13209b = (Button) findViewById(C1291f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m16242b(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m16242b(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f13210c
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f13210c
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p067c.p068a.p069a.p114b.C1288d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p067c.p068a.p069a.p114b.C1288d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f13208a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f13211d
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f13209b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f13211d
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m16242b(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m16242b(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f13211d = i;
    }
}
