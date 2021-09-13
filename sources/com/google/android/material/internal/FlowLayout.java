package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p010b.p034g.p043k.MarginLayoutParamsCompat;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1297l;

/* renamed from: com.google.android.material.internal.c */
public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    private int f13161a;

    /* renamed from: b */
    private int f13162b;

    /* renamed from: c */
    private boolean f13163c;

    /* renamed from: d */
    private int f13164d;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m16190a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    /* renamed from: d */
    private void m16191d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1297l.f9557t1, 0, 0);
        this.f13161a = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9573v1, 0);
        this.f13162b = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9565u1, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int mo15974b(View view) {
        Object tag = view.getTag(C1291f.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo15429c() {
        return this.f13163c;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f13162b;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f13161a;
    }

    /* access modifiers changed from: protected */
    public int getRowCount() {
        return this.f13164d;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f13164d = 0;
            return;
        }
        this.f13164d = 1;
        boolean z2 = ViewCompat.m5514C(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C1291f.row_index_key, Integer.valueOf(-1));
            } else {
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i5 = MarginLayoutParamsCompat.m5464b(marginLayoutParams);
                    i6 = MarginLayoutParamsCompat.m5463a(marginLayoutParams);
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                if (!this.f13163c && measuredWidth > i7) {
                    i9 = this.f13161a + paddingTop;
                    this.f13164d++;
                    i8 = paddingRight;
                }
                childAt.setTag(C1291f.row_index_key, Integer.valueOf(this.f13164d - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f13162b;
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo15429c()) {
                    i5 = i12;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f13161a + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f13162b;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m16190a(size, mode, i8 + getPaddingRight()), m16190a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f13162b = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f13161a = i;
    }

    public void setSingleLine(boolean z) {
        this.f13163c = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13163c = false;
        m16191d(context, attributeSet);
    }
}
