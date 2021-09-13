package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0212b;

public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0212b bVar = (C0212b) getLayoutParams();
        bVar.f1361a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        C0212b bVar = (C0212b) getLayoutParams();
        bVar.f1363b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        C0212b bVar = (C0212b) getLayoutParams();
        bVar.f1365c = f;
        setLayoutParams(bVar);
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
