package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.p */
abstract class PickerFragment<S> extends Fragment {

    /* renamed from: d0 */
    protected final LinkedHashSet<OnSelectionChangedListener<S>> f12946d0 = new LinkedHashSet<>();

    PickerFragment() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l2 */
    public boolean mo15636l2(OnSelectionChangedListener<S> oVar) {
        return this.f12946d0.add(oVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m2 */
    public void mo15691m2() {
        this.f12946d0.clear();
    }
}
