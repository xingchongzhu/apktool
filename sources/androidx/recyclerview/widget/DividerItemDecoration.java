package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0420n;

/* renamed from: androidx.recyclerview.widget.d */
public class DividerItemDecoration extends C0420n {

    /* renamed from: a */
    private static final int[] f3058a = {16843284};

    /* renamed from: b */
    private Drawable f3059b;

    /* renamed from: c */
    private int f3060c;

    /* renamed from: d */
    private final Rect f3061d = new Rect();

    public DividerItemDecoration(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3058a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f3059b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        mo3818m(i);
    }

    /* renamed from: j */
    private void m3757j(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo3502P(childAt, this.f3061d);
            int round = this.f3061d.right + Math.round(childAt.getTranslationX());
            this.f3059b.setBounds(round - this.f3059b.getIntrinsicWidth(), i2, round, i);
            this.f3059b.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: k */
    private void m3758k(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.mo3248i0(childAt, this.f3061d);
            int round = this.f3061d.bottom + Math.round(childAt.getTranslationY());
            this.f3059b.setBounds(i2, round - this.f3059b.getIntrinsicHeight(), i, round);
            this.f3059b.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: e */
    public void mo3469e(Rect rect, View view, RecyclerView recyclerView, C0401a0 a0Var) {
        Drawable drawable = this.f3059b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (this.f3060c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: g */
    public void mo3471g(Canvas canvas, RecyclerView recyclerView, C0401a0 a0Var) {
        if (recyclerView.getLayoutManager() != null && this.f3059b != null) {
            if (this.f3060c == 1) {
                m3758k(canvas, recyclerView);
            } else {
                m3757j(canvas, recyclerView);
            }
        }
    }

    /* renamed from: l */
    public void mo3817l(Drawable drawable) {
        if (drawable != null) {
            this.f3059b = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: m */
    public void mo3818m(int i) {
        if (i == 0 || i == 1) {
            this.f3060c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
}
