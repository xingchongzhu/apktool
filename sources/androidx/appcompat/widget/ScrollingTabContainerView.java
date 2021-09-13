package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar.C0059c;
import androidx.appcompat.widget.LinearLayoutCompat.C0173a;
import p010b.p011a.C0502a;
import p010b.p011a.p017n.ActionBarPolicy;

/* renamed from: androidx.appcompat.widget.q0 */
public class ScrollingTabContainerView extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: a */
    private static final Interpolator f1158a = new DecelerateInterpolator();

    /* renamed from: b */
    Runnable f1159b;

    /* renamed from: c */
    private C0191c f1160c;

    /* renamed from: d */
    LinearLayoutCompat f1161d;

    /* renamed from: e */
    private Spinner f1162e;

    /* renamed from: f */
    private boolean f1163f;

    /* renamed from: g */
    int f1164g;

    /* renamed from: h */
    int f1165h;

    /* renamed from: i */
    private int f1166i;

    /* renamed from: j */
    private int f1167j;

    /* renamed from: androidx.appcompat.widget.q0$a */
    /* compiled from: ScrollingTabContainerView */
    class C0189a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1168a;

        C0189a(View view) {
            this.f1168a = view;
        }

        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f1168a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f1168a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f1159b = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$b */
    /* compiled from: ScrollingTabContainerView */
    private class C0190b extends BaseAdapter {
        C0190b() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.f1161d.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0192d) ScrollingTabContainerView.this.f1161d.getChildAt(i)).mo1722b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.mo1705c((C0059c) getItem(i), true);
            }
            ((C0192d) view).mo1721a((C0059c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$c */
    /* compiled from: ScrollingTabContainerView */
    private class C0191c implements OnClickListener {
        C0191c() {
        }

        public void onClick(View view) {
            ((C0192d) view).mo1722b().mo271e();
            int childCount = ScrollingTabContainerView.this.f1161d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f1161d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$d */
    /* compiled from: ScrollingTabContainerView */
    private class C0192d extends LinearLayout {

        /* renamed from: a */
        private final int[] f1172a;

        /* renamed from: b */
        private C0059c f1173b;

        /* renamed from: c */
        private TextView f1174c;

        /* renamed from: d */
        private ImageView f1175d;

        /* renamed from: e */
        private View f1176e;

        public C0192d(Context context, C0059c cVar, boolean z) {
            int i = C0502a.f3281d;
            super(context, null, i);
            int[] iArr = {16842964};
            this.f1172a = iArr;
            this.f1173b = cVar;
            TintTypedArray v = TintTypedArray.m1406v(context, null, iArr, i, 0);
            if (v.mo1850s(0)) {
                setBackgroundDrawable(v.mo1838g(0));
            }
            v.mo1851w();
            if (z) {
                setGravity(8388627);
            }
            mo1723c();
        }

        /* renamed from: a */
        public void mo1721a(C0059c cVar) {
            this.f1173b = cVar;
            mo1723c();
        }

        /* renamed from: b */
        public C0059c mo1722b() {
            return this.f1173b;
        }

        /* renamed from: c */
        public void mo1723c() {
            C0059c cVar = this.f1173b;
            View b = cVar.mo268b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1176e = b;
                TextView textView = this.f1174c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1175d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1175d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1176e;
            if (view != null) {
                removeView(view);
                this.f1176e = null;
            }
            Drawable c = cVar.mo269c();
            CharSequence d = cVar.mo270d();
            if (c != null) {
                if (this.f1175d == null) {
                    AppCompatImageView oVar = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f1175d = oVar;
                }
                this.f1175d.setImageDrawable(c);
                this.f1175d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1175d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1175d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1174c == null) {
                    AppCompatTextView a0Var = new AppCompatTextView(getContext(), null, C0502a.f3282e);
                    a0Var.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    a0Var.setLayoutParams(layoutParams2);
                    addView(a0Var);
                    this.f1174c = a0Var;
                }
                this.f1174c.setText(d);
                this.f1174c.setVisibility(0);
            } else {
                TextView textView2 = this.f1174c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1174c.setText(null);
                }
            }
            ImageView imageView3 = this.f1175d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo267a());
            }
            if (!z) {
                charSequence = cVar.mo267a();
            }
            TooltipCompat.m1498a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f1164g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f1164g;
                if (measuredWidth > i3) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m1306b() {
        AppCompatSpinner xVar = new AppCompatSpinner(getContext(), null, C0502a.f3285h);
        xVar.setLayoutParams(new C0173a(-2, -1));
        xVar.setOnItemSelectedListener(this);
        return xVar;
    }

    /* renamed from: d */
    private boolean m1307d() {
        Spinner spinner = this.f1162e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m1308e() {
        if (!m1307d()) {
            if (this.f1162e == null) {
                this.f1162e = m1306b();
            }
            removeView(this.f1161d);
            addView(this.f1162e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1162e.getAdapter() == null) {
                this.f1162e.setAdapter(new C0190b());
            }
            Runnable runnable = this.f1159b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1159b = null;
            }
            this.f1162e.setSelection(this.f1167j);
        }
    }

    /* renamed from: f */
    private boolean m1309f() {
        if (!m1307d()) {
            return false;
        }
        removeView(this.f1162e);
        addView(this.f1161d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1162e.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo1704a(int i) {
        View childAt = this.f1161d.getChildAt(i);
        Runnable runnable = this.f1159b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0189a aVar = new C0189a(childAt);
        this.f1159b = aVar;
        post(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0192d mo1705c(C0059c cVar, boolean z) {
        C0192d dVar = new C0192d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1166i));
        } else {
            dVar.setFocusable(true);
            if (this.f1160c == null) {
                this.f1160c = new C0191c();
            }
            dVar.setOnClickListener(this.f1160c);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1159b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy b = ActionBarPolicy.m4231b(getContext());
        setContentHeight(b.mo4196f());
        this.f1165h = b.mo4195e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1159b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0192d) view).mo1722b().mo271e();
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1161d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1164g = -1;
        } else {
            if (childCount > 2) {
                this.f1164g = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1164g = MeasureSpec.getSize(i) / 2;
            }
            this.f1164g = Math.min(this.f1164g, this.f1165h);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1166i, 1073741824);
        if (z2 || !this.f1163f) {
            z = false;
        }
        if (z) {
            this.f1161d.measure(0, makeMeasureSpec);
            if (this.f1161d.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m1308e();
            } else {
                m1309f();
            }
        } else {
            m1309f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1167j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1163f = z;
    }

    public void setContentHeight(int i) {
        this.f1166i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1167j = i;
        int childCount = this.f1161d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1161d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo1704a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1162e;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
