package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView.C0112a;
import androidx.appcompat.widget.LinearLayoutCompat.C0173a;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.p007c.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import p010b.p011a.C0502a;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1290e;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C0112a {

    /* renamed from: v */
    private static final int[] f13091v = {16842912};

    /* renamed from: A */
    private FrameLayout f13092A;

    /* renamed from: B */
    private MenuItemImpl f13093B;

    /* renamed from: C */
    private ColorStateList f13094C;

    /* renamed from: D */
    private boolean f13095D;

    /* renamed from: G */
    private Drawable f13096G;

    /* renamed from: H */
    private final AccessibilityDelegateCompat f13097H;

    /* renamed from: w */
    private int f13098w;

    /* renamed from: x */
    private boolean f13099x;

    /* renamed from: y */
    boolean f13100y;

    /* renamed from: z */
    private final CheckedTextView f13101z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C2046a extends AccessibilityDelegateCompat {
        C2046a() {
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            cVar.mo5049V(NavigationMenuItemView.this.f13100y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private void m16124B() {
        if (m16126D()) {
            this.f13101z.setVisibility(8);
            FrameLayout frameLayout = this.f13092A;
            if (frameLayout != null) {
                C0173a aVar = (C0173a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f13092A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f13101z.setVisibility(0);
        FrameLayout frameLayout2 = this.f13092A;
        if (frameLayout2 != null) {
            C0173a aVar2 = (C0173a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f13092A.setLayoutParams(aVar2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m16125C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0502a.f3299v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f13091v, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: D */
    private boolean m16126D() {
        return this.f13093B.getTitle() == null && this.f13093B.getIcon() == null && this.f13093B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f13092A == null) {
                this.f13092A = (FrameLayout) ((ViewStub) findViewById(C1291f.design_menu_item_action_area_stub)).inflate();
            }
            this.f13092A.removeAllViews();
            this.f13092A.addView(view);
        }
    }

    /* renamed from: d */
    public boolean mo487d() {
        return false;
    }

    /* renamed from: e */
    public void mo488e(MenuItemImpl iVar, int i) {
        this.f13093B = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.m5579r0(this, m16125C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        TooltipCompat.m1498a(this, iVar.getTooltipText());
        m16124B();
    }

    public MenuItemImpl getItemData() {
        return this.f13093B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl iVar = this.f13093B;
        if (iVar != null && iVar.isCheckable() && this.f13093B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f13091v);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f13100y != z) {
            this.f13100y = z;
            this.f13097H.mo3884l(this.f13101z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f13101z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f13095D) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.m1859r(drawable).mutate();
                DrawableCompat.m1856o(drawable, this.f13094C);
            }
            int i = this.f13098w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f13099x) {
            if (this.f13096G == null) {
                Drawable a = ResourcesCompat.m1811a(getResources(), C1290e.navigation_empty_icon, getContext().getTheme());
                this.f13096G = a;
                if (a != null) {
                    int i2 = this.f13098w;
                    a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f13096G;
        }
        TextViewCompat.m1983l(this.f13101z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f13101z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f13098w = i;
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f13094C = colorStateList;
        this.f13095D = colorStateList != null;
        MenuItemImpl iVar = this.f13093B;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f13101z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f13099x = z;
    }

    public void setTextAppearance(int i) {
        TextViewCompat.m1988q(this.f13101z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f13101z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f13101z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C2046a aVar = new C2046a();
        this.f13097H = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1293h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1288d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C1291f.design_menu_item_text);
        this.f13101z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.m5573o0(checkedTextView, aVar);
    }
}
