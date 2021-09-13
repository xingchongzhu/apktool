package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.a */
public class BaseTransientBottomBar {

    /* renamed from: a */
    private C2063b f13212a;

    public BaseTransientBottomBar(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.mo15078K(0.1f);
        swipeDismissBehavior.mo15077J(0.6f);
        swipeDismissBehavior.mo15079L(0);
    }

    /* renamed from: a */
    public boolean mo16028a(View view) {
        return view instanceof C2060d;
    }

    /* renamed from: b */
    public void mo16029b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                SnackbarManager.m16248b().mo16045f(this.f13212a);
            }
        } else if (coordinatorLayout.mo2003B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            SnackbarManager.m16248b().mo16044e(this.f13212a);
        }
    }
}
