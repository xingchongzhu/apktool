package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import p010b.p026e.p030b.p031k.ConstraintWidget;

public class Barrier extends ConstraintHelper {

    /* renamed from: j */
    private int f1308j;

    /* renamed from: k */
    private int f1309k;

    /* renamed from: l */
    private p010b.p026e.p030b.p031k.Barrier f1310l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: p */
    private void m1499p(ConstraintWidget eVar, int i, boolean z) {
        this.f1309k = i;
        if (VERSION.SDK_INT < 17) {
            int i2 = this.f1308j;
            if (i2 == 5) {
                this.f1309k = 0;
            } else if (i2 == 6) {
                this.f1309k = 1;
            }
        } else if (z) {
            int i3 = this.f1308j;
            if (i3 == 5) {
                this.f1309k = 1;
            } else if (i3 == 6) {
                this.f1309k = 0;
            }
        } else {
            int i4 = this.f1308j;
            if (i4 == 5) {
                this.f1309k = 0;
            } else if (i4 == 6) {
                this.f1309k = 1;
            }
        }
        if (eVar instanceof p010b.p026e.p030b.p031k.Barrier) {
            ((p010b.p026e.p030b.p031k.Barrier) eVar).mo4633j1(this.f1309k);
        }
    }

    public int getMargin() {
        return this.f1310l.mo4627f1();
    }

    public int getType() {
        return this.f1308j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo1891h(AttributeSet attributeSet) {
        super.mo1891h(attributeSet);
        this.f1310l = new p010b.p026e.p030b.p031k.Barrier();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0226i.f1727a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0226i.f1790j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0226i.f1783i1) {
                    this.f1310l.mo4632i1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0226i.f1797k1) {
                    this.f1310l.mo4634k1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1430d = this.f1310l;
        mo1956n();
    }

    /* renamed from: i */
    public void mo1892i(ConstraintWidget eVar, boolean z) {
        m1499p(eVar, this.f1308j, z);
    }

    /* renamed from: o */
    public boolean mo1893o() {
        return this.f1310l.mo4623d1();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1310l.mo4632i1(z);
    }

    public void setDpMargin(int i) {
        this.f1310l.mo4634k1((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f1310l.mo4634k1(i);
    }

    public void setType(int i) {
        this.f1308j = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
