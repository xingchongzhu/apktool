package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0401a0;

/* renamed from: com.google.android.material.datepicker.q */
class SmoothCalendarLayoutManager extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.q$a */
    /* compiled from: SmoothCalendarLayoutManager */
    class C2017a extends LinearSmoothScroller {
        C2017a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo3851v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    SmoothCalendarLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: I1 */
    public void mo3107I1(RecyclerView recyclerView, C0401a0 a0Var, int i) {
        C2017a aVar = new C2017a(recyclerView.getContext());
        aVar.mo3655p(i);
        mo3494J1(aVar);
    }
}
