package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p010b.p026e.p030b.p031k.C0563k;

/* renamed from: androidx.constraintlayout.widget.j */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: j */
    private boolean f1891j;

    /* renamed from: k */
    private boolean f1892k;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo1891h(AttributeSet attributeSet) {
        super.mo1891h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0226i.f1727a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0226i.f1741c1) {
                    this.f1891j = true;
                } else if (index == C0226i.f1776h1) {
                    this.f1892k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    public void mo2000o(C0563k kVar, int i, int i2) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1891j || this.f1892k) {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i = 0; i < this.f1428b; i++) {
                    View i2 = constraintLayout.mo1914i(this.f1427a[i]);
                    if (i2 != null) {
                        if (this.f1891j) {
                            i2.setVisibility(visibility);
                        }
                        if (this.f1892k && elevation > 0.0f && VERSION.SDK_INT >= 21) {
                            i2.setTranslationZ(i2.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo1949d();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo1949d();
    }
}
