package com.google.android.exoplayer2.p196ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final C1856c f11895a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1855b f11896b;

    /* renamed from: c */
    private float f11897c;

    /* renamed from: d */
    private int f11898d = 0;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public interface C1855b {
        /* renamed from: a */
        void mo14701a(float f, float f2, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    private final class C1856c implements Runnable {

        /* renamed from: a */
        private float f11899a;

        /* renamed from: b */
        private float f11900b;

        /* renamed from: c */
        private boolean f11901c;

        /* renamed from: d */
        private boolean f11902d;

        private C1856c() {
        }

        /* renamed from: a */
        public void mo14702a(float f, float f2, boolean z) {
            this.f11899a = f;
            this.f11900b = f2;
            this.f11901c = z;
            if (!this.f11902d) {
                this.f11902d = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f11902d = false;
            if (AspectRatioFrameLayout.this.f11896b != null) {
                AspectRatioFrameLayout.this.f11896b.mo14701a(this.f11899a, this.f11900b, this.f11901c);
            }
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1879q.f12099a, 0, 0);
            try {
                this.f11898d = obtainStyledAttributes.getInt(C1879q.f12100b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f11895a = new C1856c();
    }

    public int getResizeMode() {
        return this.f11898d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f11897c > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f3 = (float) measuredWidth;
            float f4 = (float) measuredHeight;
            float f5 = f3 / f4;
            float f6 = (this.f11897c / f5) - 1.0f;
            if (Math.abs(f6) <= 0.01f) {
                this.f11895a.mo14702a(this.f11897c, f5, false);
                return;
            }
            int i3 = this.f11898d;
            if (i3 != 0) {
                if (i3 == 1) {
                    f2 = this.f11897c;
                } else if (i3 != 2) {
                    if (i3 == 4) {
                        if (f6 > 0.0f) {
                            f = this.f11897c;
                        } else {
                            f2 = this.f11897c;
                        }
                    }
                    this.f11895a.mo14702a(this.f11897c, f5, true);
                    super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                } else {
                    f = this.f11897c;
                }
                measuredHeight = (int) (f3 / f2);
                this.f11895a.mo14702a(this.f11897c, f5, true);
                super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else if (f6 > 0.0f) {
                f2 = this.f11897c;
                measuredHeight = (int) (f3 / f2);
                this.f11895a.mo14702a(this.f11897c, f5, true);
                super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else {
                f = this.f11897c;
            }
            measuredWidth = (int) (f4 * f);
            this.f11895a.mo14702a(this.f11897c, f5, true);
            super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f) {
        if (this.f11897c != f) {
            this.f11897c = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(C1855b bVar) {
        this.f11896b = bVar;
    }

    public void setResizeMode(int i) {
        if (this.f11898d != i) {
            this.f11898d = i;
            requestLayout();
        }
    }
}
