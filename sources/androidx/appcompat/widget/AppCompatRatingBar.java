package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p010b.p011a.C0502a;

/* renamed from: androidx.appcompat.widget.t */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    private final AppCompatProgressBarHelper f1213a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3271G);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1213a.mo1728b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        AppCompatProgressBarHelper rVar = new AppCompatProgressBarHelper(this);
        this.f1213a = rVar;
        rVar.mo1729c(attributeSet, i);
    }
}
