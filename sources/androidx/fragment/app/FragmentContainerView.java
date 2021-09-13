package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.WindowInsetsCompat;
import p010b.p053k.C0689c;

/* renamed from: androidx.fragment.app.h */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    private ArrayList<View> f2378a;

    /* renamed from: b */
    private ArrayList<View> f2379b;

    /* renamed from: c */
    private OnApplyWindowInsetsListener f2380c;

    /* renamed from: d */
    private boolean f2381d = true;

    FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager nVar) {
        String str;
        super(context, attributeSet);
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0689c.f4921h);
        if (classAttribute == null) {
            classAttribute = obtainStyledAttributes.getString(C0689c.f4922i);
        }
        String string = obtainStyledAttributes.getString(C0689c.f4923j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment h0 = nVar.mo2797h0(id);
        if (classAttribute != null && h0 == null) {
            if (id <= 0) {
                if (string != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(classAttribute);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            Fragment a = nVar.mo2817r0().mo2719a(context.getClassLoader(), classAttribute);
            a.mo2403V0(context, attributeSet, null);
            nVar.mo2808m().mo2946u(true).mo2937d(this, a, string).mo2519k();
        }
        nVar.mo2776T0(this);
    }

    /* renamed from: a */
    private void m2352a(View view) {
        ArrayList<View> arrayList = this.f2379b;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f2378a == null) {
                this.f2378a = new ArrayList<>();
            }
            this.f2378a.add(view);
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (FragmentManager.m2407A0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, LayoutParams layoutParams, boolean z) {
        if (FragmentManager.m2407A0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat e0Var;
        WindowInsetsCompat s = WindowInsetsCompat.m5247s(windowInsets);
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2380c;
        if (onApplyWindowInsetsListener != null) {
            e0Var = WindowInsetsCompat.m5247s(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            e0Var = ViewCompat.m5545a0(this, s);
        }
        if (!e0Var.mo4997l()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.m5558h(getChildAt(i), e0Var);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f2381d && this.f2378a != null) {
            for (int i = 0; i < this.f2378a.size(); i++) {
                super.drawChild(canvas, (View) this.f2378a.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f2381d) {
            ArrayList<View> arrayList = this.f2378a;
            if (arrayList != null && arrayList.size() > 0 && this.f2378a.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2379b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2378a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2381d = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m2352a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m2352a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        m2352a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        m2352a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        m2352a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m2352a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m2352a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f2381d = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2380c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2379b == null) {
                this.f2379b = new ArrayList<>();
            }
            this.f2379b.add(view);
        }
        super.startViewTransition(view);
    }
}
