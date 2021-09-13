package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    private final BaseTransientBottomBar f13207k = new BaseTransientBottomBar(this);

    /* renamed from: E */
    public boolean mo15076E(View view) {
        return this.f13207k.mo16028a(view);
    }

    /* renamed from: k */
    public boolean mo2069k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f13207k.mo16029b(coordinatorLayout, view, motionEvent);
        return super.mo2069k(coordinatorLayout, view, motionEvent);
    }
}
