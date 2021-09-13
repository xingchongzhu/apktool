package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;
import p010b.p011a.C0502a;
import p010b.p011a.p014l.p015a.DrawableWrapper;
import p010b.p034g.p043k.ViewPropertyAnimatorCompat;

/* renamed from: androidx.appcompat.widget.g0 */
class DropDownListView extends ListView {

    /* renamed from: a */
    private final Rect f1015a = new Rect();

    /* renamed from: b */
    private int f1016b = 0;

    /* renamed from: c */
    private int f1017c = 0;

    /* renamed from: d */
    private int f1018d = 0;

    /* renamed from: e */
    private int f1019e = 0;

    /* renamed from: f */
    private int f1020f;

    /* renamed from: g */
    private Field f1021g;

    /* renamed from: h */
    private C0167a f1022h;

    /* renamed from: i */
    private boolean f1023i;

    /* renamed from: j */
    private boolean f1024j;

    /* renamed from: k */
    private boolean f1025k;

    /* renamed from: l */
    private ViewPropertyAnimatorCompat f1026l;

    /* renamed from: m */
    private ListViewAutoScrollHelper f1027m;

    /* renamed from: n */
    C0168b f1028n;

    /* renamed from: androidx.appcompat.widget.g0$a */
    /* compiled from: DropDownListView */
    private static class C0167a extends DrawableWrapper {

        /* renamed from: b */
        private boolean f1029b = true;

        C0167a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo1470c(boolean z) {
            this.f1029b = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1029b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1029b) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1029b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1029b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1029b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$b */
    /* compiled from: DropDownListView */
    private class C0168b implements Runnable {
        C0168b() {
        }

        /* renamed from: a */
        public void mo1476a() {
            DropDownListView g0Var = DropDownListView.this;
            g0Var.f1028n = null;
            g0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1477b() {
            DropDownListView.this.post(this);
        }

        public void run() {
            DropDownListView g0Var = DropDownListView.this;
            g0Var.f1028n = null;
            g0Var.drawableStateChanged();
        }
    }

    DropDownListView(Context context, boolean z) {
        super(context, null, C0502a.f3303z);
        this.f1024j = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1021g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1124a() {
        this.f1025k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1020f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat a0Var = this.f1026l;
        if (a0Var != null) {
            a0Var.mo4959b();
            this.f1026l = null;
        }
    }

    /* renamed from: b */
    private void m1125b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m1126c(Canvas canvas) {
        if (!this.f1015a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f1015a);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: f */
    private void m1127f(int i, View view) {
        Rect rect = this.f1015a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1016b;
        rect.top -= this.f1017c;
        rect.right += this.f1018d;
        rect.bottom += this.f1019e;
        try {
            boolean z = this.f1021g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1021g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m1128g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1127f(i, view);
        if (z2) {
            Rect rect = this.f1015a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            DrawableCompat.m1852k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1129h(int i, View view, float f, float f2) {
        m1128g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            DrawableCompat.m1852k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m1130i(View view, int i, float f, float f2) {
        this.f1025k = true;
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f1020f;
        if (i3 != -1) {
            View childAt = getChildAt(i3 - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f1020f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (i2 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1129h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1131j() {
        return this.f1025k;
    }

    /* renamed from: k */
    private void m1132k() {
        Drawable selector = getSelector();
        if (selector != null && m1131j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0167a aVar = this.f1022h;
        if (aVar != null) {
            aVar.mo1470c(z);
        }
    }

    /* renamed from: d */
    public int mo1457d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i10 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                if (i5 >= 0 && i10 > i5 && i9 > 0 && i7 != i4) {
                    i4 = i9;
                }
                return i4;
            }
            if (i5 >= 0 && i10 >= i5) {
                i9 = i7;
            }
        }
        return i7;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1126c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1028n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1132k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1460e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1130i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m1125b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1124a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f1027m
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f1027m = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f1027m
            r9.mo2316m(r2)
            androidx.core.widget.f r9 = r7.f1027m
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f1027m
            if (r8 == 0) goto L_0x006c
            r8.mo2316m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DropDownListView.mo1460e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f1024j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1024j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1024j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1024j && this.f1023i) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1028n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1028n == null) {
            C0168b bVar = new C0168b();
            this.f1028n = bVar;
            bVar.mo1477b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1132k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1020f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0168b bVar = this.f1028n;
        if (bVar != null) {
            bVar.mo1476a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f1023i = z;
    }

    public void setSelector(Drawable drawable) {
        C0167a aVar = drawable != null ? new C0167a(drawable) : null;
        this.f1022h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1016b = rect.left;
        this.f1017c = rect.top;
        this.f1018d = rect.right;
        this.f1019e = rect.bottom;
    }
}
