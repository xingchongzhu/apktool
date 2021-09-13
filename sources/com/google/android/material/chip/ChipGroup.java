package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0635b;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;

public class ChipGroup extends FlowLayout {

    /* renamed from: e */
    private static final int f12750e = C1296k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: f */
    private int f12751f;

    /* renamed from: g */
    private int f12752g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f12753h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f12754i;

    /* renamed from: j */
    private C1989d f12755j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1987b f12756k;

    /* renamed from: l */
    private C1990e f12757l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f12758m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f12759n;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C1987b implements OnCheckedChangeListener {
        private C1987b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f12759n) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f12754i) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f12758m == -1 || ChipGroup.this.f12758m == id || !ChipGroup.this.f12753h)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m15622r(chipGroup.f12758m, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f12758m == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                    return;
                }
                ChipGroup.this.m15622r(compoundButton.getId(), true);
                ChipGroup.this.m15621q(compoundButton.getId(), false);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C1988c extends MarginLayoutParams {
        public C1988c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1988c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1988c(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C1989d {
        /* renamed from: a */
        void mo15463a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class C1990e implements OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public OnHierarchyChangeListener f12761a;

        private C1990e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.m5564k());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).mo15438m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f12756k);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.f12761a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.f12761a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.chipGroupStyle);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m15621q(int i, boolean z) {
        this.f12758m = i;
        C1989d dVar = this.f12755j;
        if (dVar != null && this.f12753h && z) {
            dVar.mo15463a(this, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m15622r(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f12759n = true;
            ((Chip) findViewById).setChecked(z);
            this.f12759n = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        m15621q(i, true);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f12758m;
                if (i2 != -1 && this.f12753h) {
                    m15622r(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public boolean mo15429c() {
        return super.mo15429c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1988c);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C1988c(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1988c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f12753h) {
            return this.f12758m;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f12753h) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f12751f;
    }

    public int getChipSpacingVertical() {
        return this.f12752g;
    }

    /* renamed from: m */
    public void mo15438m(int i) {
        int i2 = this.f12758m;
        if (i != i2) {
            if (i2 != -1 && this.f12753h) {
                m15622r(i2, false);
            }
            if (i != -1) {
                m15622r(i, true);
            }
            setCheckedId(i);
        }
    }

    /* renamed from: n */
    public void mo15439n() {
        this.f12759n = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f12759n = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public int mo15440o(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f12758m;
        if (i != -1) {
            m15622r(i, true);
            setCheckedId(this.f12758m);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m5349y0(accessibilityNodeInfo).mo5053Z(C0635b.m5415a(getRowCount(), mo15429c() ? getChipCount() : -1, false, mo15443p() ? 1 : 2));
    }

    /* renamed from: p */
    public boolean mo15443p() {
        return this.f12753h;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f12751f != i) {
            this.f12751f = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f12752g != i) {
            this.f12752g = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C1989d dVar) {
        this.f12755j = dVar;
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f12757l.f12761a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f12754i = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f12753h != z) {
            this.f12753h = z;
            mo15439n();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12750e;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        this.f12756k = new C1987b();
        this.f12757l = new C1990e();
        this.f12758m = -1;
        this.f12759n = false;
        TypedArray h = ThemeEnforcement.m16228h(getContext(), attributeSet, C1297l.f9292K0, i, i2, new int[0]);
        int dimensionPixelOffset = h.getDimensionPixelOffset(C1297l.f9306M0, 0);
        setChipSpacingHorizontal(h.getDimensionPixelOffset(C1297l.f9313N0, dimensionPixelOffset));
        setChipSpacingVertical(h.getDimensionPixelOffset(C1297l.f9320O0, dimensionPixelOffset));
        setSingleLine(h.getBoolean(C1297l.f9334Q0, false));
        setSingleSelection(h.getBoolean(C1297l.f9341R0, false));
        setSelectionRequired(h.getBoolean(C1297l.f9327P0, false));
        int resourceId = h.getResourceId(C1297l.f9299L0, -1);
        if (resourceId != -1) {
            this.f12758m = resourceId;
        }
        h.recycle();
        super.setOnHierarchyChangeListener(this.f12757l);
        ViewCompat.m5591x0(this, 1);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C1988c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
