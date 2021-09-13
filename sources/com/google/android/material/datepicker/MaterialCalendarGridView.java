package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.internal.C2053k;
import java.util.Calendar;
import p010b.p034g.p042j.Pair;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p067c.p068a.p069a.p114b.C1291f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    private final Calendar f12827a;

    /* renamed from: b */
    private final boolean f12828b;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C1992a extends AccessibilityDelegateCompat {
        C1992a() {
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            cVar.mo5053Z(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m15770a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo15681i());
        } else if (i == 130) {
            setSelection(getAdapter().mo15671b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private static int m15771c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m15772d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter b = getAdapter();
        DateSelector<?> dVar = b.f12933c;
        CalendarStyle cVar = b.f12935e;
        Long c = b.getItem(b.mo15671b());
        Long c2 = b.getItem(b.mo15681i());
        for (Pair dVar2 : dVar.mo15613c()) {
            F f = dVar2.f4587a;
            if (f != null) {
                if (dVar2.f4588b != null) {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) dVar2.f4588b).longValue();
                    if (!m15772d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean d = C2053k.m16233d(this);
                        if (longValue < c.longValue()) {
                            i2 = b.mo15671b();
                            if (b.mo15674f(i2)) {
                                i = 0;
                            } else if (!d) {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f12827a.setTimeInMillis(longValue);
                            i2 = b.mo15670a(materialCalendarGridView.f12827a.get(5));
                            i = m15771c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = Math.min(b.mo15681i(), getChildCount() - 1);
                            if (b.mo15675g(i4)) {
                                i3 = getWidth();
                            } else if (!d) {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f12827a.setTimeInMillis(longValue2);
                            i4 = b.mo15670a(materialCalendarGridView.f12827a.get(5));
                            i3 = m15771c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + cVar.f12848a.mo15609c();
                            int bottom = childAt.getBottom() - cVar.f12848a.mo15608b();
                            if (!d) {
                                i6 = numColumns > i2 ? 0 : i;
                                i5 = i4 > numColumns2 ? getWidth() : i3;
                            } else {
                                int i7 = i4 > numColumns2 ? 0 : i3;
                                i5 = numColumns > i2 ? getWidth() : i;
                                i6 = i7;
                            }
                            MonthAdapter mVar = b;
                            canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, cVar.f12855h);
                            itemId++;
                            materialCalendarGridView = this;
                            b = mVar;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m15770a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo15671b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo15671b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f12828b) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo15671b()) {
            super.setSelection(getAdapter().mo15671b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12827a = UtcDates.m15935k();
        if (MaterialDatePicker.m15859P2(getContext())) {
            setNextFocusLeftId(C1291f.cancel_button);
            setNextFocusRightId(C1291f.confirm_button);
        }
        this.f12828b = MaterialDatePicker.m15860Q2(getContext());
        ViewCompat.m5573o0(this, new C1992a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()}));
        }
    }
}
