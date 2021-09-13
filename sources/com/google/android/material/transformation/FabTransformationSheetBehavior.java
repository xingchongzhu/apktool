package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f;
import java.util.HashMap;
import java.util.Map;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1267a;
import p067c.p068a.p069a.p114b.p119m.MotionSpec;
import p067c.p068a.p069a.p114b.p119m.Positioning;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f13603i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m16676g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.f13603i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof C0232f) && (((C0232f) childAt.getLayoutParams()).mo2093f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f13603i;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.m5591x0(childAt, ((Integer) this.f13603i.get(childAt)).intValue());
                        }
                    } else {
                        if (VERSION.SDK_INT >= 16) {
                            this.f13603i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        ViewCompat.m5591x0(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f13603i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo16449H(View view, View view2, boolean z, boolean z2) {
        m16676g0(view2, z);
        return super.mo16449H(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public C2139e mo16453e0(Context context, boolean z) {
        int i;
        if (z) {
            i = C1267a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C1267a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        C2139e eVar = new C2139e();
        eVar.f13596a = MotionSpec.m11486c(context, i);
        eVar.f13597b = new Positioning(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
