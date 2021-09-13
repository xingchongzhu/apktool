package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout.C0212b;

/* renamed from: androidx.constraintlayout.widget.e */
public class Constraints extends ViewGroup {

    /* renamed from: a */
    ConstraintSet f1552a;

    /* renamed from: androidx.constraintlayout.widget.e$a */
    /* compiled from: Constraints */
    public static class C0224a extends C0212b {

        /* renamed from: A0 */
        public float f1553A0;

        /* renamed from: B0 */
        public float f1554B0;

        /* renamed from: p0 */
        public float f1555p0;

        /* renamed from: q0 */
        public boolean f1556q0;

        /* renamed from: r0 */
        public float f1557r0;

        /* renamed from: s0 */
        public float f1558s0;

        /* renamed from: t0 */
        public float f1559t0;

        /* renamed from: u0 */
        public float f1560u0;

        /* renamed from: v0 */
        public float f1561v0;

        /* renamed from: w0 */
        public float f1562w0;

        /* renamed from: x0 */
        public float f1563x0;

        /* renamed from: y0 */
        public float f1564y0;

        /* renamed from: z0 */
        public float f1565z0;

        public C0224a(int i, int i2) {
            super(i, i2);
            this.f1555p0 = 1.0f;
            this.f1556q0 = false;
            this.f1557r0 = 0.0f;
            this.f1558s0 = 0.0f;
            this.f1559t0 = 0.0f;
            this.f1560u0 = 0.0f;
            this.f1561v0 = 1.0f;
            this.f1562w0 = 1.0f;
            this.f1563x0 = 0.0f;
            this.f1564y0 = 0.0f;
            this.f1565z0 = 0.0f;
            this.f1553A0 = 0.0f;
            this.f1554B0 = 0.0f;
        }

        public C0224a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1555p0 = 1.0f;
            this.f1556q0 = false;
            this.f1557r0 = 0.0f;
            this.f1558s0 = 0.0f;
            this.f1559t0 = 0.0f;
            this.f1560u0 = 0.0f;
            this.f1561v0 = 1.0f;
            this.f1562w0 = 1.0f;
            this.f1563x0 = 0.0f;
            this.f1564y0 = 0.0f;
            this.f1565z0 = 0.0f;
            this.f1553A0 = 0.0f;
            this.f1554B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0226i.f1828p2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0226i.f1834q2) {
                    this.f1555p0 = obtainStyledAttributes.getFloat(index, this.f1555p0);
                } else if (index == C0226i.f1578B2) {
                    if (VERSION.SDK_INT >= 21) {
                        this.f1557r0 = obtainStyledAttributes.getFloat(index, this.f1557r0);
                        this.f1556q0 = true;
                    }
                } else if (index == C0226i.f1882y2) {
                    this.f1559t0 = obtainStyledAttributes.getFloat(index, this.f1559t0);
                } else if (index == C0226i.f1888z2) {
                    this.f1560u0 = obtainStyledAttributes.getFloat(index, this.f1560u0);
                } else if (index == C0226i.f1876x2) {
                    this.f1558s0 = obtainStyledAttributes.getFloat(index, this.f1558s0);
                } else if (index == C0226i.f1864v2) {
                    this.f1561v0 = obtainStyledAttributes.getFloat(index, this.f1561v0);
                } else if (index == C0226i.f1870w2) {
                    this.f1562w0 = obtainStyledAttributes.getFloat(index, this.f1562w0);
                } else if (index == C0226i.f1840r2) {
                    this.f1563x0 = obtainStyledAttributes.getFloat(index, this.f1563x0);
                } else if (index == C0226i.f1846s2) {
                    this.f1564y0 = obtainStyledAttributes.getFloat(index, this.f1564y0);
                } else if (index == C0226i.f1852t2) {
                    this.f1565z0 = obtainStyledAttributes.getFloat(index, this.f1565z0);
                } else if (index == C0226i.f1858u2) {
                    this.f1553A0 = obtainStyledAttributes.getFloat(index, this.f1553A0);
                } else if (index == C0226i.f1572A2 && VERSION.SDK_INT >= 21) {
                    this.f1554B0 = obtainStyledAttributes.getFloat(index, this.f1554B0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0224a generateDefaultLayoutParams() {
        return new C0224a(-2, -2);
    }

    /* renamed from: b */
    public C0224a generateLayoutParams(AttributeSet attributeSet) {
        return new C0224a(getContext(), attributeSet);
    }

    public ConstraintSet getConstraintSet() {
        if (this.f1552a == null) {
            this.f1552a = new ConstraintSet();
        }
        this.f1552a.mo1971h(this);
        return this.f1552a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0212b(layoutParams);
    }
}
