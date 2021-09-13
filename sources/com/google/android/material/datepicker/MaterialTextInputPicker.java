package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.k */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* renamed from: e0 */
    private int f12920e0;

    /* renamed from: f0 */
    private DateSelector<S> f12921f0;

    /* renamed from: g0 */
    private CalendarConstraints f12922g0;

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* compiled from: MaterialTextInputPicker */
    class C2013a extends OnSelectionChangedListener<S> {
        C2013a() {
        }

        /* renamed from: a */
        public void mo15650a(S s) {
            Iterator it = MaterialTextInputPicker.this.f12946d0.iterator();
            while (it.hasNext()) {
                ((OnSelectionChangedListener) it.next()).mo15650a(s);
            }
        }
    }

    /* renamed from: n2 */
    static <T> MaterialTextInputPicker<T> m15875n2(DateSelector<T> dVar, int i, CalendarConstraints aVar) {
        MaterialTextInputPicker<T> kVar = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.mo2407W1(bundle);
        return kVar;
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        if (bundle == null) {
            bundle = mo2361G();
        }
        this.f12920e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f12921f0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f12922g0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* renamed from: N0 */
    public View mo2381N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f12921f0.mo15618k(layoutInflater.cloneInContext(new ContextThemeWrapper(mo2367I(), this.f12920e0)), viewGroup, bundle, this.f12922g0, new C2013a());
    }

    /* renamed from: f1 */
    public void mo2434f1(Bundle bundle) {
        super.mo2434f1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f12920e0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f12921f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12922g0);
    }
}
