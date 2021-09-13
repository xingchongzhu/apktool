package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.material.button.MaterialButton.C1973a;
import com.google.android.material.internal.C2053k;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.MarginLayoutParamsCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0635b;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0636c;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.AbsoluteCornerSize;
import p067c.p068a.p069a.p114b.p117c0.CornerSize;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel.C1276b;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: a */
    private static final String f12686a = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: b */
    private static final int f12687b = C1296k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: c */
    private final List<C1980d> f12688c;

    /* renamed from: d */
    private final C1979c f12689d;

    /* renamed from: e */
    private final C1982f f12690e;

    /* renamed from: f */
    private final LinkedHashSet<C1981e> f12691f;

    /* renamed from: g */
    private final Comparator<MaterialButton> f12692g;

    /* renamed from: h */
    private Integer[] f12693h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f12694i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f12695j;

    /* renamed from: k */
    private boolean f12696k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f12697l;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    class C1977a implements Comparator<MaterialButton> {
        C1977a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    class C1978b extends AccessibilityDelegateCompat {
        C1978b() {
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            cVar.mo5055a0(C0636c.m5416a(0, 1, MaterialButtonToggleGroup.this.m15517n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    private class C1979c implements C1973a {
        private C1979c() {
        }

        /* renamed from: a */
        public void mo15230a(MaterialButton materialButton, boolean z) {
            if (!MaterialButtonToggleGroup.this.f12694i) {
                if (MaterialButtonToggleGroup.this.f12695j) {
                    MaterialButtonToggleGroup.this.f12697l = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.m15523u(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.m15515l(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }

        /* synthetic */ C1979c(MaterialButtonToggleGroup materialButtonToggleGroup, C1977a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    private static class C1980d {

        /* renamed from: a */
        private static final CornerSize f12701a = new AbsoluteCornerSize(0.0f);

        /* renamed from: b */
        CornerSize f12702b;

        /* renamed from: c */
        CornerSize f12703c;

        /* renamed from: d */
        CornerSize f12704d;

        /* renamed from: e */
        CornerSize f12705e;

        C1980d(CornerSize cVar, CornerSize cVar2, CornerSize cVar3, CornerSize cVar4) {
            this.f12702b = cVar;
            this.f12703c = cVar3;
            this.f12704d = cVar4;
            this.f12705e = cVar2;
        }

        /* renamed from: a */
        public static C1980d m15532a(C1980d dVar) {
            CornerSize cVar = f12701a;
            return new C1980d(cVar, dVar.f12705e, cVar, dVar.f12704d);
        }

        /* renamed from: b */
        public static C1980d m15533b(C1980d dVar, View view) {
            return C2053k.m16233d(view) ? m15534c(dVar) : m15535d(dVar);
        }

        /* renamed from: c */
        public static C1980d m15534c(C1980d dVar) {
            CornerSize cVar = dVar.f12702b;
            CornerSize cVar2 = dVar.f12705e;
            CornerSize cVar3 = f12701a;
            return new C1980d(cVar, cVar2, cVar3, cVar3);
        }

        /* renamed from: d */
        public static C1980d m15535d(C1980d dVar) {
            CornerSize cVar = f12701a;
            return new C1980d(cVar, cVar, dVar.f12703c, dVar.f12704d);
        }

        /* renamed from: e */
        public static C1980d m15536e(C1980d dVar, View view) {
            return C2053k.m16233d(view) ? m15535d(dVar) : m15534c(dVar);
        }

        /* renamed from: f */
        public static C1980d m15537f(C1980d dVar) {
            CornerSize cVar = dVar.f12702b;
            CornerSize cVar2 = f12701a;
            return new C1980d(cVar, cVar2, dVar.f12703c, cVar2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public interface C1981e {
        /* renamed from: a */
        void mo15257a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    private class C1982f implements C1974b {
        private C1982f() {
        }

        /* renamed from: a */
        public void mo15231a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C1982f(MaterialButtonToggleGroup materialButtonToggleGroup, C1977a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m15519p(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m15519p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m15519p(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private void m15512h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton m = m15516m(i);
                int min = Math.min(m.getStrokeWidth(), m15516m(i - 1).getStrokeWidth());
                LayoutParams i2 = m15513i(m);
                if (getOrientation() == 0) {
                    MarginLayoutParamsCompat.m5465c(i2, 0);
                    MarginLayoutParamsCompat.m5466d(i2, -min);
                    i2.topMargin = 0;
                } else {
                    i2.bottomMargin = 0;
                    i2.topMargin = -min;
                    MarginLayoutParamsCompat.m5466d(i2, 0);
                }
                m.setLayoutParams(i2);
            }
            m15520r(firstVisibleChildIndex);
        }
    }

    /* renamed from: i */
    private LayoutParams m15513i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return (LayoutParams) layoutParams;
        }
        return new LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: j */
    private void m15514j(int i) {
        m15521s(i, true);
        m15523u(i, true);
        setCheckedId(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m15515l(int i, boolean z) {
        Iterator it = this.f12691f.iterator();
        while (it.hasNext()) {
            ((C1981e) it.next()).mo15257a(this, i, z);
        }
    }

    /* renamed from: m */
    private MaterialButton m15516m(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public int m15517n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m15519p(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private C1980d m15518o(int i, int i2, int i3) {
        C1980d dVar = (C1980d) this.f12688c.get(i);
        if (i2 == i3) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? C1980d.m15536e(dVar, this) : C1980d.m15537f(dVar);
        } else if (i != i3) {
            return null;
        } else {
            return z ? C1980d.m15533b(dVar, this) : C1980d.m15532a(dVar);
        }
    }

    /* renamed from: p */
    private boolean m15519p(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: r */
    private void m15520r(int i) {
        if (!(getChildCount() == 0 || i == -1)) {
            LayoutParams layoutParams = (LayoutParams) m15516m(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            MarginLayoutParamsCompat.m5465c(layoutParams, 0);
            MarginLayoutParamsCompat.m5466d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: s */
    private void m15521s(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f12694i = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f12694i = false;
        }
    }

    private void setCheckedId(int i) {
        this.f12697l = i;
        m15515l(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.m5564k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.mo15175a(this.f12689d);
        materialButton.setOnPressedChangeListenerInternal(this.f12690e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: t */
    private static void m15522t(C1276b bVar, C1980d dVar) {
        if (dVar == null) {
            bVar.mo7906o(0.0f);
        } else {
            bVar.mo7900B(dVar.f12702b).mo7911t(dVar.f12705e).mo7904F(dVar.f12703c).mo7915x(dVar.f12704d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public boolean m15523u(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f12696k || !checkedButtonIds.isEmpty()) {
            if (z && this.f12695j) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    m15521s(intValue2, false);
                    m15515l(intValue2, false);
                }
            }
            return true;
        }
        m15521s(i, true);
        this.f12697l = i;
        return false;
    }

    /* renamed from: v */
    private void m15524v() {
        TreeMap treeMap = new TreeMap(this.f12692g);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m15516m(i), Integer.valueOf(i));
        }
        this.f12693h = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f12686a, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m15523u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f12688c.add(new C1980d(shapeAppearanceModel.mo7891r(), shapeAppearanceModel.mo7884j(), shapeAppearanceModel.mo7893t(), shapeAppearanceModel.mo7886l()));
        ViewCompat.m5573o0(materialButton, new C1978b());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m15524v();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void mo15240g(C1981e eVar) {
        this.f12691f.add(eVar);
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f12695j) {
            return this.f12697l;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = m15516m(i);
            if (m.isChecked()) {
                arrayList.add(Integer.valueOf(m.getId()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f12693h;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f12686a, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: k */
    public void mo15245k() {
        this.f12694i = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = m15516m(i);
            m.setChecked(false);
            m15515l(m.getId(), false);
        }
        this.f12694i = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f12697l;
        if (i != -1) {
            m15514j(i);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m5349y0(accessibilityNodeInfo).mo5053Z(C0635b.m5415a(1, getVisibleButtonCount(), false, mo15250q() ? 1 : 2));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo15254w();
        m15512h();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.mo15192h(this.f12689d);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f12688c.remove(indexOfChild);
        }
        mo15254w();
        m15512h();
    }

    /* renamed from: q */
    public boolean mo15250q() {
        return this.f12695j;
    }

    public void setSelectionRequired(boolean z) {
        this.f12696k = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f12695j != z) {
            this.f12695j = z;
            mo15245k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo15254w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m = m15516m(i);
            if (m.getVisibility() != 8) {
                C1276b v = m.getShapeAppearanceModel().mo7895v();
                m15522t(v, m15518o(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m.setShapeAppearanceModel(v.mo7905m());
            }
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12687b;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        this.f12688c = new ArrayList();
        this.f12689d = new C1979c(this, null);
        this.f12690e = new C1982f(this, null);
        this.f12691f = new LinkedHashSet<>();
        this.f12692g = new C1977a();
        this.f12694i = false;
        TypedArray h = ThemeEnforcement.m16228h(getContext(), attributeSet, C1297l.f9518o2, i, i2, new int[0]);
        setSingleSelection(h.getBoolean(C1297l.f9542r2, false));
        this.f12697l = h.getResourceId(C1297l.f9526p2, -1);
        this.f12696k = h.getBoolean(C1297l.f9534q2, false);
        setChildrenDrawingOrderEnabled(true);
        h.recycle();
        ViewCompat.m5591x0(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
