package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.widget.j0 */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private boolean f1059a;

    /* renamed from: b */
    private int f1060b;

    /* renamed from: c */
    private int f1061c;

    /* renamed from: d */
    private int f1062d;

    /* renamed from: e */
    private int f1063e;

    /* renamed from: f */
    private int f1064f;

    /* renamed from: g */
    private float f1065g;

    /* renamed from: h */
    private boolean f1066h;

    /* renamed from: i */
    private int[] f1067i;

    /* renamed from: j */
    private int[] f1068j;

    /* renamed from: k */
    private Drawable f1069k;

    /* renamed from: l */
    private int f1070l;

    /* renamed from: m */
    private int f1071m;

    /* renamed from: n */
    private int f1072n;

    /* renamed from: o */
    private int f1073o;

    /* renamed from: androidx.appcompat.widget.j0$a */
    /* compiled from: LinearLayoutCompat */
    public static class C0173a extends LayoutParams {
        public C0173a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0173a(int i, int i2) {
            super(i, i2);
        }

        public C0173a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m1179A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: k */
    private void m1180k(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View s = mo1527s(i3);
            if (s.getVisibility() != 8) {
                C0173a aVar = (C0173a) s.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = s.getMeasuredWidth();
                    measureChildWithMargins(s, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* renamed from: l */
    private void m1181l(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View s = mo1527s(i3);
            if (s.getVisibility() != 8) {
                C0173a aVar = (C0173a) s.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = s.getMeasuredHeight();
                    measureChildWithMargins(s, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0173a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1507g(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean b = ViewUtils.m1084b(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View s = mo1527s(i5);
            if (!(s == null || s.getVisibility() == 8 || !mo1540t(i5))) {
                C0173a aVar = (C0173a) s.getLayoutParams();
                if (b) {
                    i4 = s.getRight() + aVar.rightMargin;
                } else {
                    i4 = (s.getLeft() - aVar.leftMargin) - this.f1070l;
                }
                mo1520j(canvas, i4);
            }
        }
        if (mo1540t(virtualChildCount)) {
            View s2 = mo1527s(virtualChildCount - 1);
            if (s2 != null) {
                C0173a aVar2 = (C0173a) s2.getLayoutParams();
                if (b) {
                    i3 = s2.getLeft() - aVar2.leftMargin;
                    i2 = this.f1070l;
                } else {
                    i = s2.getRight() + aVar2.rightMargin;
                    mo1520j(canvas, i);
                }
            } else if (b) {
                i = getPaddingLeft();
                mo1520j(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.f1070l;
            }
            i = i3 - i2;
            mo1520j(canvas, i);
        }
    }

    public int getBaseline() {
        if (this.f1060b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f1060b;
        if (childCount > i) {
            View childAt = getChildAt(i);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i2 = this.f1061c;
                if (this.f1062d == 1) {
                    int i3 = this.f1063e & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1064f) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1064f;
                        }
                    }
                }
                return i2 + ((C0173a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1060b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1060b;
    }

    public Drawable getDividerDrawable() {
        return this.f1069k;
    }

    public int getDividerPadding() {
        return this.f1073o;
    }

    public int getDividerWidth() {
        return this.f1070l;
    }

    public int getGravity() {
        return this.f1063e;
    }

    public int getOrientation() {
        return this.f1062d;
    }

    public int getShowDividers() {
        return this.f1072n;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1065g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1518h(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View s = mo1527s(i2);
            if (!(s == null || s.getVisibility() == 8 || !mo1540t(i2))) {
                mo1519i(canvas, (s.getTop() - ((C0173a) s.getLayoutParams()).topMargin) - this.f1071m);
            }
        }
        if (mo1540t(virtualChildCount)) {
            View s2 = mo1527s(virtualChildCount - 1);
            if (s2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f1071m;
            } else {
                i = s2.getBottom() + ((C0173a) s2.getLayoutParams()).bottomMargin;
            }
            mo1519i(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo1519i(Canvas canvas, int i) {
        this.f1069k.setBounds(getPaddingLeft() + this.f1073o, i, (getWidth() - getPaddingRight()) - this.f1073o, this.f1071m + i);
        this.f1069k.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1520j(Canvas canvas, int i) {
        this.f1069k.setBounds(i, getPaddingTop() + this.f1073o, this.f1070l + i, (getHeight() - getPaddingBottom()) - this.f1073o);
        this.f1069k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0173a generateDefaultLayoutParams() {
        int i = this.f1062d;
        if (i == 0) {
            return new C0173a(-2, -2);
        }
        if (i == 1) {
            return new C0173a(-1, -2);
        }
        return null;
    }

    /* renamed from: n */
    public C0173a generateLayoutParams(AttributeSet attributeSet) {
        return new C0173a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0173a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0173a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f1069k != null) {
            if (this.f1062d == 1) {
                mo1518h(canvas);
            } else {
                mo1507g(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1062d == 1) {
            mo1542v(i, i2, i3, i4);
        } else {
            mo1541u(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1062d == 1) {
            mo1546z(i, i2);
        } else {
            mo1544x(i, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public int mo1524p(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public int mo1525q(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public int mo1526r(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public View mo1527s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f1059a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f1060b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1069k) {
            this.f1069k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1070l = drawable.getIntrinsicWidth();
                this.f1071m = drawable.getIntrinsicHeight();
            } else {
                this.f1070l = 0;
                this.f1071m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1073o = i;
    }

    public void setGravity(int i) {
        if (this.f1063e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1063e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1063e;
        if ((8388615 & i3) != i2) {
            this.f1063e = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1066h = z;
    }

    public void setOrientation(int i) {
        if (this.f1062d != i) {
            this.f1062d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1072n) {
            requestLayout();
        }
        this.f1072n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1063e;
        if ((i3 & 112) != i2) {
            this.f1063e = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1065g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo1540t(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f1072n & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.f1072n & 4) != 0) {
                z = true;
            }
            return z;
        } else {
            if ((this.f1072n & 2) != 0) {
                int i2 = i - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    } else if (getChildAt(i2).getVisibility() != 8) {
                        z = true;
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1541u(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.ViewUtils.m1084b(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f1063e
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f1059a
            int[] r13 = r6.f1067i
            int[] r14 = r6.f1068j
            int r1 = p010b.p034g.p043k.ViewCompat.m5514C(r24)
            int r1 = p010b.p034g.p043k.GravityCompat.m5245b(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f1064f
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f1064f
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x013f
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo1527s(r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.mo1545y(r2)
            int r1 = r1 + r0
            goto L_0x0129
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0127
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.j0$a r4 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a0
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a2
            int r10 = r0.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r10 = -1
        L_0x00a3:
            int r3 = r4.gravity
            if (r3 >= 0) goto L_0x00a8
            r3 = r11
        L_0x00a8:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto L_0x00e3
            r11 = 48
            if (r3 == r11) goto L_0x00d1
            r11 = 80
            if (r3 == r11) goto L_0x00bb
            r3 = r7
            r11 = -1
            goto L_0x00e0
        L_0x00bb:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto L_0x00e0
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto L_0x00e0
        L_0x00d1:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto L_0x00e0
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto L_0x00f1
        L_0x00e0:
            r21 = 1
            goto L_0x00f1
        L_0x00e3:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f1:
            boolean r10 = r6.mo1540t(r2)
            if (r10 == 0) goto L_0x00fa
            int r10 = r6.f1070l
            int r1 = r1 + r10
        L_0x00fa:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo1525q(r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m1179A(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo1526r(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo1524p(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0133
        L_0x0127:
            r18 = r3
        L_0x0129:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0133:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.mo1541u(int, int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1542v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1063e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1064f
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1064f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = 0
        L_0x0049:
            if (r12 >= r10) goto L_0x00c8
            android.view.View r13 = r6.mo1527s(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.mo1545y(r12)
            int r0 = r0 + r1
            goto L_0x00c5
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.j0$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = p010b.p034g.p043k.ViewCompat.m5514C(r17)
            int r1 = p010b.p034g.p043k.GravityCompat.m5245b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008d
            r2 = 5
            if (r1 == r2) goto L_0x0088
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0098
        L_0x0088:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L_0x0097
        L_0x008d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L_0x0097:
            int r1 = r1 - r2
        L_0x0098:
            r2 = r1
            boolean r1 = r6.mo1540t(r12)
            if (r1 == 0) goto L_0x00a2
            int r1 = r6.f1071m
            int r0 = r0 + r1
        L_0x00a2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.mo1525q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m1179A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.mo1526r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.mo1524p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        L_0x00c5:
            r1 = 1
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.mo1542v(int, int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo1543w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d4  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1544x(int r38, int r39) {
        /*
            r37 = this;
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = 0
            r7.f1064f = r10
            int r11 = r37.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r38)
            int r13 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r7.f1067i
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f1068j
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f1067i = r0
            int[] r0 = new int[r14]
            r7.f1068j = r0
        L_0x0026:
            int[] r15 = r7.f1067i
            int[] r6 = r7.f1068j
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f1059a
            boolean r3 = r7.f1066h
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
        L_0x0061:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x01fd
            android.view.View r6 = r7.mo1527s(r1)
            if (r6 != 0) goto L_0x007f
            int r5 = r7.f1064f
            int r6 = r7.mo1545y(r1)
            int r5 = r5 + r6
            r7.f1064f = r5
        L_0x0076:
            r2 = r1
            r32 = r3
            r36 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01ec
        L_0x007f:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008b
            int r5 = r7.mo1524p(r6, r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x008b:
            boolean r5 = r7.mo1540t(r1)
            if (r5 == 0) goto L_0x0098
            int r5 = r7.f1064f
            int r10 = r7.f1070l
            int r5 = r5 + r10
            r7.f1064f = r5
        L_0x0098:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.j0$a r10 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r10
            float r5 = r10.weight
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00ec
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ec
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            if (r19 == 0) goto L_0x00ba
            int r0 = r7.f1064f
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.f1064f = r0
            goto L_0x00c8
        L_0x00ba:
            int r0 = r7.f1064f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.f1064f = r0
        L_0x00c8:
            if (r4 == 0) goto L_0x00dd
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L_0x0166
        L_0x00dd:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r30 = -2
            goto L_0x0168
        L_0x00ec:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f9
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fc
        L_0x00f9:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fc:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            int r0 = r7.f1064f
            r29 = r0
            goto L_0x0107
        L_0x0105:
            r29 = 0
        L_0x0107:
            r33 = 0
            r0 = r37
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r38
            r36 = r4
            r4 = r29
            r9 = -1
            r29 = -2
            r5 = r39
            r29 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            r6 = r33
            r0.mo1543w(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x0130
            r10.width = r0
        L_0x0130:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L_0x0149
            int r1 = r7.f1064f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.mo1526r(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.f1064f = r1
            goto L_0x0160
        L_0x0149:
            r3 = r29
            int r1 = r7.f1064f
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo1526r(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f1064f = r1
        L_0x0160:
            if (r32 == 0) goto L_0x0166
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0166:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0168:
            if (r13 == r1) goto L_0x0173
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0173
            r0 = 1
            r27 = 1
            goto L_0x0174
        L_0x0173:
            r0 = 0
        L_0x0174:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L_0x01b1
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01b1
            int r6 = r10.gravity
            if (r6 >= 0) goto L_0x0197
            int r6 = r7.f1063e
        L_0x0197:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01b1:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01c1
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01c1
            r26 = 1
            goto L_0x01c3
        L_0x01c1:
            r26 = 0
        L_0x01c3:
            float r5 = r10.weight
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d4
            if (r0 == 0) goto L_0x01cc
            goto L_0x01cd
        L_0x01cc:
            r2 = r4
        L_0x01cd:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01e2
        L_0x01d4:
            r10 = r23
            if (r0 == 0) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r2 = r4
        L_0x01da:
            r4 = r22
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
        L_0x01e2:
            r10 = r34
            int r0 = r7.mo1524p(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r31
        L_0x01ec:
            int r2 = r2 + 1
            r9 = r39
            r1 = r2
            r6 = r28
            r3 = r32
            r4 = r36
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0061
        L_0x01fd:
            r32 = r3
            r36 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.f1064f
            if (r3 <= 0) goto L_0x0220
            boolean r3 = r7.mo1540t(r11)
            if (r3 == 0) goto L_0x0220
            int r3 = r7.f1064f
            int r1 = r7.f1070l
            int r3 = r3 + r1
            r7.f1064f = r3
        L_0x0220:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L_0x0237
            r1 = 0
            r5 = r15[r1]
            if (r5 != r3) goto L_0x0237
            r1 = r15[r17]
            if (r1 != r3) goto L_0x0237
            r1 = r15[r16]
            if (r1 == r3) goto L_0x0233
            goto L_0x0237
        L_0x0233:
            r1 = r2
            r23 = r6
            goto L_0x0268
        L_0x0237:
            r1 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r9 = r15[r18]
            r3 = r15[r17]
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = java.lang.Math.max(r5, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r23 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L_0x0268:
            if (r32 == 0) goto L_0x02cb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L_0x0270
            if (r12 != 0) goto L_0x02cb
        L_0x0270:
            r2 = 0
            r7.f1064f = r2
            r2 = 0
        L_0x0274:
            if (r2 >= r11) goto L_0x02cb
            android.view.View r3 = r7.mo1527s(r2)
            if (r3 != 0) goto L_0x0286
            int r3 = r7.f1064f
            int r5 = r7.mo1545y(r2)
            int r3 = r3 + r5
            r7.f1064f = r3
            goto L_0x0293
        L_0x0286:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0296
            int r3 = r7.mo1524p(r3, r2)
            int r2 = r2 + r3
        L_0x0293:
            r22 = r1
            goto L_0x02c6
        L_0x0296:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.j0$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r5
            if (r19 == 0) goto L_0x02af
            int r6 = r7.f1064f
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.mo1526r(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.f1064f = r6
            goto L_0x0293
        L_0x02af:
            int r6 = r7.f1064f
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo1526r(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f1064f = r1
        L_0x02c6:
            int r2 = r2 + 1
            r1 = r22
            goto L_0x0274
        L_0x02cb:
            r22 = r1
            int r1 = r7.f1064f
            int r2 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.f1064f = r1
            int r2 = r37.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.f1064f
            int r2 = r2 - r3
            if (r24 != 0) goto L_0x033c
            if (r2 == 0) goto L_0x02f8
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f8
            goto L_0x033c
        L_0x02f8:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L_0x0334
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0334
            r10 = 0
        L_0x0303:
            if (r10 >= r11) goto L_0x0334
            android.view.View r2 = r7.mo1527s(r10)
            if (r2 == 0) goto L_0x0331
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0314
            goto L_0x0331
        L_0x0314:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.j0$a r4 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r4
            float r4 = r4.weight
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0331
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L_0x0331:
            int r10 = r10 + 1
            goto L_0x0303
        L_0x0334:
            r2 = r39
            r25 = r11
            r3 = r22
            goto L_0x04d6
        L_0x033c:
            float r5 = r7.f1065g
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0343
            r0 = r5
        L_0x0343:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.f1064f = r6
            r6 = r4
            r9 = r23
            r4 = -1
            r10 = 0
        L_0x035c:
            if (r10 >= r11) goto L_0x047d
            android.view.View r14 = r7.mo1527s(r10)
            if (r14 == 0) goto L_0x046e
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L_0x036e
            goto L_0x046e
        L_0x036e:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.j0$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r5
            float r3 = r5.weight
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03d7
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r37.getPaddingTop()
            int r23 = r37.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r39
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L_0x03b5
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x03a9
            goto L_0x03b7
        L_0x03a9:
            if (r8 <= 0) goto L_0x03ac
            goto L_0x03ad
        L_0x03ac:
            r8 = 0
        L_0x03ad:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            goto L_0x03c7
        L_0x03b5:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x03b7:
            int r29 = r14.getMeasuredWidth()
            int r8 = r29 + r8
            if (r8 >= 0) goto L_0x03c0
            r8 = 0
        L_0x03c0:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
        L_0x03c7:
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L_0x03dd
        L_0x03d7:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r39
        L_0x03dd:
            if (r19 == 0) goto L_0x03fa
            int r8 = r7.f1064f
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo1526r(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f1064f = r8
            r23 = r0
            goto L_0x0414
        L_0x03fa:
            int r8 = r7.f1064f
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.mo1526r(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.f1064f = r0
        L_0x0414:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x041f
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L_0x041f
            r0 = 1
            goto L_0x0420
        L_0x041f:
            r0 = 0
        L_0x0420:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L_0x0431
            goto L_0x0432
        L_0x0431:
            r8 = r11
        L_0x0432:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L_0x043f
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L_0x0440
            r6 = 1
            goto L_0x0441
        L_0x043f:
            r8 = -1
        L_0x0440:
            r6 = 0
        L_0x0441:
            if (r36 == 0) goto L_0x0468
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L_0x0468
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x044f
            int r5 = r7.f1063e
        L_0x044f:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & -2
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L_0x0468:
            r26 = r6
            r6 = r0
            r0 = r23
            goto L_0x0473
        L_0x046e:
            r3 = r2
            r25 = r11
            r2 = r39
        L_0x0473:
            int r10 = r10 + 1
            r8 = r38
            r2 = r3
            r11 = r25
            r5 = -1
            goto L_0x035c
        L_0x047d:
            r2 = r39
            r25 = r11
            int r0 = r7.f1064f
            int r3 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.f1064f = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L_0x04a4
            r0 = 0
            r5 = r15[r0]
            if (r5 != r3) goto L_0x04a4
            r0 = r15[r17]
            if (r0 != r3) goto L_0x04a4
            r0 = r15[r16]
            if (r0 == r3) goto L_0x04a2
            goto L_0x04a4
        L_0x04a2:
            r0 = r4
            goto L_0x04d2
        L_0x04a4:
            r0 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r8 = r15[r18]
            r10 = r15[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r0 = java.lang.Math.max(r0, r5)
            r5 = r28[r16]
            r3 = r28[r3]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = java.lang.Math.max(r5, r3)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L_0x04d2:
            r3 = r0
            r0 = r6
            r23 = r9
        L_0x04d6:
            if (r26 != 0) goto L_0x04dd
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04dd
            goto L_0x04de
        L_0x04dd:
            r0 = r3
        L_0x04de:
            int r3 = r37.getPaddingTop()
            int r4 = r37.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r23 & r3
            r1 = r1 | r3
            int r3 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x0507
            r0 = r38
            r1 = r25
            r7.m1180k(r1, r0)
        L_0x0507:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.mo1544x(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public int mo1545y(int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0323  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1546z(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f1064f = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f1060b
            boolean r15 = r7.f1066h
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x0197
            android.view.View r4 = r7.mo1527s(r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f1064f
            int r10 = r7.mo1545y(r6)
            int r4 = r4 + r10
            r7.f1064f = r4
            r26 = r11
            r24 = r13
            r4 = r22
            goto L_0x018b
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005e
            int r1 = r7.mo1524p(r4, r6)
            int r6 = r6 + r1
            r26 = r11
            r4 = r22
            r1 = r24
            r24 = r13
            goto L_0x018b
        L_0x005e:
            boolean r1 = r7.mo1540t(r6)
            if (r1 == 0) goto L_0x006b
            int r1 = r7.f1064f
            int r10 = r7.f1071m
            int r1 = r1 + r10
            r7.f1064f = r1
        L_0x006b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.j0$a r10 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r10
            float r1 = r10.weight
            float r25 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x00a5
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a5
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            int r0 = r7.f1064f
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f1064f = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r8 = r24
            r29 = r26
            r18 = 1
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r6
            goto L_0x0113
        L_0x00a5:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b4
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b4
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b6
        L_0x00b4:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b6:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            int r0 = r7.f1064f
            r23 = r0
            goto L_0x00c3
        L_0x00c1:
            r23 = 0
        L_0x00c3:
            r28 = 1073741824(0x40000000, float:2.0)
            r0 = r33
            r8 = r24
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = 1073741824(0x40000000, float:2.0)
            r22 = r4
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r23
            r0.mo1543w(r1, r2, r3, r4, r5, r6)
            r0 = r30
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f0
            r10.height = r0
        L_0x00f0:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.f1064f
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r22
            int r4 = r7.mo1526r(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f1064f = r1
            if (r15 == 0) goto L_0x0112
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0113
        L_0x0112:
            r0 = r9
        L_0x0113:
            if (r14 < 0) goto L_0x011d
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x011d
            int r1 = r7.f1064f
            r7.f1061c = r1
        L_0x011d:
            if (r11 >= r14) goto L_0x012e
            float r1 = r10.weight
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0126
            goto L_0x012e
        L_0x0126:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x012e:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x013b
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x013b
            r1 = 1
            r20 = 1
            goto L_0x013c
        L_0x013b:
            r1 = 0
        L_0x013c:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x015e
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x015e
            r19 = 1
            goto L_0x0160
        L_0x015e:
            r19 = 0
        L_0x0160:
            float r8 = r10.weight
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0171
            if (r1 == 0) goto L_0x0169
            goto L_0x016a
        L_0x0169:
            r2 = r4
        L_0x016a:
            int r4 = java.lang.Math.max(r13, r2)
            r1 = r31
            goto L_0x017c
        L_0x0171:
            if (r1 == 0) goto L_0x0174
            goto L_0x0175
        L_0x0174:
            r2 = r4
        L_0x0175:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
            r4 = r13
        L_0x017c:
            int r2 = r7.mo1524p(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x018b:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r24
            r11 = r26
            goto L_0x002a
        L_0x0197:
            r8 = r1
            r9 = r3
            r1 = r5
            r26 = r11
            r24 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.f1064f
            if (r2 <= 0) goto L_0x01b5
            r2 = r26
            boolean r3 = r7.mo1540t(r2)
            if (r3 == 0) goto L_0x01b7
            int r3 = r7.f1064f
            int r4 = r7.f1071m
            int r3 = r3 + r4
            r7.f1064f = r3
            goto L_0x01b7
        L_0x01b5:
            r2 = r26
        L_0x01b7:
            r3 = r24
            if (r15 == 0) goto L_0x0206
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c1
            if (r3 != 0) goto L_0x0206
        L_0x01c1:
            r4 = 0
            r7.f1064f = r4
            r4 = 0
        L_0x01c5:
            if (r4 >= r2) goto L_0x0206
            android.view.View r6 = r7.mo1527s(r4)
            if (r6 != 0) goto L_0x01d7
            int r6 = r7.f1064f
            int r11 = r7.mo1545y(r4)
            int r6 = r6 + r11
            r7.f1064f = r6
            goto L_0x0201
        L_0x01d7:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e3
            int r6 = r7.mo1524p(r6, r4)
            int r4 = r4 + r6
            goto L_0x0201
        L_0x01e3:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.j0$a r11 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r11
            int r14 = r7.f1064f
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo1526r(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.f1064f = r6
        L_0x0201:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01c5
        L_0x0206:
            int r4 = r7.f1064f
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f1064f = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f1064f
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0275
            if (r9 == 0) goto L_0x0234
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0234
            goto L_0x0275
        L_0x0234:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0270
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0270
            r1 = 0
        L_0x023f:
            if (r1 >= r2) goto L_0x0270
            android.view.View r3 = r7.mo1527s(r1)
            if (r3 == 0) goto L_0x026d
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0250
            goto L_0x026d
        L_0x0250:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.j0$a r9 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r9
            float r9 = r9.weight
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x026d
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x026d:
            int r1 = r1 + 1
            goto L_0x023f
        L_0x0270:
            r11 = r34
            r1 = r8
            goto L_0x0368
        L_0x0275:
            float r10 = r7.f1065g
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x027c
            r0 = r10
        L_0x027c:
            r10 = 0
            r7.f1064f = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = 0
        L_0x0283:
            if (r8 >= r2) goto L_0x0357
            android.view.View r13 = r7.mo1527s(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0297
            r21 = r11
            r11 = r34
            goto L_0x0350
        L_0x0297:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.j0$a r14 = (androidx.appcompat.widget.LinearLayoutCompat.C0173a) r14
            float r10 = r14.weight
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02fa
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02db
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02cf
            goto L_0x02dd
        L_0x02cf:
            if (r15 <= 0) goto L_0x02d2
            goto L_0x02d3
        L_0x02d2:
            r15 = 0
        L_0x02d3:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            goto L_0x02ed
        L_0x02db:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02dd:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02e6
            r15 = 0
        L_0x02e6:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
        L_0x02ed:
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L_0x02ff
        L_0x02fa:
            r10 = r11
            r11 = r34
            r21 = r10
        L_0x02ff:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x031c
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L_0x031f
            r0 = 1
            goto L_0x0320
        L_0x031c:
            r23 = r1
            r1 = -1
        L_0x031f:
            r0 = 0
        L_0x0320:
            if (r0 == 0) goto L_0x0323
            goto L_0x0324
        L_0x0323:
            r10 = r15
        L_0x0324:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L_0x0330
            int r9 = r14.width
            if (r9 != r1) goto L_0x0330
            r9 = 1
            goto L_0x0331
        L_0x0330:
            r9 = 0
        L_0x0331:
            int r10 = r7.f1064f
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo1526r(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f1064f = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L_0x0350:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L_0x0283
        L_0x0357:
            r11 = r34
            int r0 = r7.f1064f
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.f1064f = r0
            r0 = r9
        L_0x0368:
            if (r19 != 0) goto L_0x036f
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x036f
            goto L_0x0370
        L_0x036f:
            r0 = r5
        L_0x0370:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x038e
            r7.m1181l(r2, r6)
        L_0x038e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.mo1546z(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1059a = true;
        this.f1060b = -1;
        this.f1061c = 0;
        this.f1063e = 8388659;
        int[] iArr = C0511j.f3572d1;
        TintTypedArray v = TintTypedArray.m1406v(context, attributeSet, iArr, i, 0);
        ViewCompat.m5569m0(this, context, iArr, attributeSet, v.mo1849r(), i, 0);
        int k = v.mo1842k(C0511j.f3582f1, -1);
        if (k >= 0) {
            setOrientation(k);
        }
        int k2 = v.mo1842k(C0511j.f3577e1, -1);
        if (k2 >= 0) {
            setGravity(k2);
        }
        boolean a = v.mo1832a(C0511j.f3587g1, true);
        if (!a) {
            setBaselineAligned(a);
        }
        this.f1065g = v.mo1840i(C0511j.f3597i1, -1.0f);
        this.f1060b = v.mo1842k(C0511j.f3592h1, -1);
        this.f1066h = v.mo1832a(C0511j.f3612l1, false);
        setDividerDrawable(v.mo1838g(C0511j.f3602j1));
        this.f1072n = v.mo1842k(C0511j.f3617m1, 0);
        this.f1073o = v.mo1837f(C0511j.f3607k1, 0);
        v.mo1851w();
    }
}
