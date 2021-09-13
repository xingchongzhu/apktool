package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import p010b.p011a.C0502a;
import p010b.p011a.C0507f;
import p010b.p011a.C0508g;
import p010b.p011a.C0511j;
import p010b.p011a.p017n.ActionMode;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorCompat;

public class ActionBarContextView extends AbsActionBarView {

    /* renamed from: i */
    private CharSequence f699i;

    /* renamed from: j */
    private CharSequence f700j;

    /* renamed from: k */
    private View f701k;

    /* renamed from: l */
    private View f702l;

    /* renamed from: m */
    private View f703m;

    /* renamed from: n */
    private LinearLayout f704n;

    /* renamed from: o */
    private TextView f705o;

    /* renamed from: p */
    private TextView f706p;

    /* renamed from: q */
    private int f707q;

    /* renamed from: r */
    private int f708r;

    /* renamed from: s */
    private boolean f709s;

    /* renamed from: t */
    private int f710t;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0115a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActionMode f711a;

        C0115a(ActionMode bVar) {
            this.f711a = bVar;
        }

        public void onClick(View view) {
            this.f711a.mo470c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m789i() {
        if (this.f704n == null) {
            LayoutInflater.from(getContext()).inflate(C0508g.f3405a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f704n = linearLayout;
            this.f705o = (TextView) linearLayout.findViewById(C0507f.f3383e);
            this.f706p = (TextView) this.f704n.findViewById(C0507f.f3382d);
            if (this.f707q != 0) {
                this.f705o.setTextAppearance(getContext(), this.f707q);
            }
            if (this.f708r != 0) {
                this.f706p.setTextAppearance(getContext(), this.f708r);
            }
        }
        this.f705o.setText(this.f699i);
        this.f706p.setText(this.f700j);
        boolean z = !TextUtils.isEmpty(this.f699i);
        boolean z2 = !TextUtils.isEmpty(this.f700j);
        int i = 0;
        this.f706p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f704n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f704n.getParent() == null) {
            addView(this.f704n);
        }
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat mo933f(int i, long j) {
        return super.mo933f(i, j);
    }

    /* renamed from: g */
    public void mo934g() {
        if (this.f701k == null) {
            mo943k();
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f700j;
    }

    public CharSequence getTitle() {
        return this.f699i;
    }

    /* renamed from: h */
    public void mo941h(ActionMode bVar) {
        View view = this.f701k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f710t, this, false);
            this.f701k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f701k);
        }
        View findViewById = this.f701k.findViewById(C0507f.f3387i);
        this.f702l = findViewById;
        findViewById.setOnClickListener(new C0115a(bVar));
        MenuBuilder gVar = (MenuBuilder) bVar.mo472e();
        ActionMenuPresenter cVar = this.f915d;
        if (cVar != null) {
            cVar.mo1372y();
        }
        ActionMenuPresenter cVar2 = new ActionMenuPresenter(getContext());
        this.f915d = cVar2;
        cVar2.mo1370J(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        gVar.mo679c(this.f915d, this.f913b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f915d.mo594o(this);
        this.f914c = actionMenuView;
        ViewCompat.m5579r0(actionMenuView, null);
        addView(this.f914c, layoutParams);
    }

    /* renamed from: j */
    public boolean mo942j() {
        return this.f709s;
    }

    /* renamed from: k */
    public void mo943k() {
        removeAllViews();
        this.f703m = null;
        this.f914c = null;
        this.f915d = null;
        View view = this.f702l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean mo944l() {
        ActionMenuPresenter cVar = this.f915d;
        if (cVar != null) {
            return cVar.mo1371K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter cVar = this.f915d;
        if (cVar != null) {
            cVar.mo1362B();
            this.f915d.mo1363C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f699i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = ViewUtils.m1084b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f701k;
        if (!(view == null || view.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f701k.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = AbsActionBarView.m973d(paddingRight, i5, b);
            paddingRight = AbsActionBarView.m973d(d + mo1281e(this.f701k, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f704n;
        if (!(linearLayout == null || this.f703m != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1281e(this.f704n, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f703m;
        if (view2 != null) {
            mo1281e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f914c;
        if (actionMenuView != null) {
            mo1281e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            int i4 = this.f916e;
            if (i4 <= 0) {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f701k;
            if (view != null) {
                int c = mo1280c(view, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f701k.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f914c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1280c(this.f914c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f704n;
            if (linearLayout != null && this.f703m == null) {
                if (this.f709s) {
                    this.f704n.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f704n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f704n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1280c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f703m;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f703m.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i7), MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f916e <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f916e = i;
    }

    public void setCustomView(View view) {
        View view2 = this.f703m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f703m = view;
        if (view != null) {
            LinearLayout linearLayout = this.f704n;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f704n = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f700j = charSequence;
        m789i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f699i = charSequence;
        m789i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f709s) {
            requestLayout();
        }
        this.f709s = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3287j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray v = TintTypedArray.m1406v(context, attributeSet, C0511j.f3675y, i, 0);
        ViewCompat.m5579r0(this, v.mo1838g(C0511j.f3680z));
        this.f707q = v.mo1845n(C0511j.f3455D, 0);
        this.f708r = v.mo1845n(C0511j.f3450C, 0);
        this.f916e = v.mo1844m(C0511j.f3445B, 0);
        this.f710t = v.mo1845n(C0511j.f3440A, C0508g.f3408d);
        v.mo1851w();
    }
}
