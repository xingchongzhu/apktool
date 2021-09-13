package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;

/* renamed from: com.google.android.material.textfield.g */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ListPopupWindow f13493d;

    /* renamed from: e */
    private final AccessibilityManager f13494e;

    /* renamed from: f */
    private final Rect f13495f;

    /* renamed from: com.google.android.material.textfield.g$a */
    /* compiled from: MaterialAutoCompleteTextView */
    class C2110a implements OnItemClickListener {
        C2110a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MaterialAutoCompleteTextView.this.m16566e(i < 0 ? MaterialAutoCompleteTextView.this.f13493d.mo1584v() : MaterialAutoCompleteTextView.this.getAdapter().getItem(i));
            OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f13493d.mo1587y();
                    i = MaterialAutoCompleteTextView.this.f13493d.mo1586x();
                    j = MaterialAutoCompleteTextView.this.f13493d.mo1585w();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f13493d.mo606h(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f13493d.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.f9067a);
    }

    /* renamed from: c */
    private TextInputLayout m16564c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m16565d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c = m16564c();
        int i = 0;
        if (adapter == null || c == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f13493d.mo1586x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable g = this.f13493d.mo1576g();
        if (g != null) {
            g.getPadding(this.f13495f);
            Rect rect = this.f13495f;
            i2 += rect.left + rect.right;
        }
        return i2 + c.getEndIconView().getMeasuredWidth();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m16566e(Object obj) {
        if (VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    public CharSequence getHint() {
        TextInputLayout c = m16564c();
        if (c == null || !c.mo16176O()) {
            return super.getHint();
        }
        return c.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = m16564c();
        if (c != null && c.mo16176O() && super.getHint() == null && ManufacturerUtils.m16194a()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m16565d()), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f13493d.mo1580p(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f13494e;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f13493d.mo604e();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, 0), attributeSet, i);
        this.f13495f = new Rect();
        Context context2 = getContext();
        TypedArray h = ThemeEnforcement.m16228h(context2, attributeSet, C1297l.f9349S1, i, C1296k.f9213e, new int[0]);
        int i2 = C1297l.f9356T1;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f13494e = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow k0Var = new ListPopupWindow(context2);
        this.f13493d = k0Var;
        k0Var.mo1567J(true);
        k0Var.mo1561D(this);
        k0Var.mo1566I(2);
        k0Var.mo1580p(getAdapter());
        k0Var.mo1569L(new C2110a());
        h.recycle();
    }
}
