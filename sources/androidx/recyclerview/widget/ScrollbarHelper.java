package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0421o;

/* renamed from: androidx.recyclerview.widget.m */
class ScrollbarHelper {
    /* renamed from: a */
    static int m3907a(C0401a0 a0Var, OrientationHelper jVar, View view, View view2, C0421o oVar, boolean z) {
        if (oVar.mo3493J() == 0 || a0Var.mo3331b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo3533h0(view) - oVar.mo3533h0(view2)) + 1;
        }
        return Math.min(jVar.mo3868n(), jVar.mo3858d(view2) - jVar.mo3861g(view));
    }

    /* renamed from: b */
    static int m3908b(C0401a0 a0Var, OrientationHelper jVar, View view, View view2, C0421o oVar, boolean z, boolean z2) {
        int i;
        if (oVar.mo3493J() == 0 || a0Var.mo3331b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.mo3533h0(view), oVar.mo3533h0(view2));
        int max = Math.max(oVar.mo3533h0(view), oVar.mo3533h0(view2));
        if (z2) {
            i = Math.max(0, (a0Var.mo3331b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(jVar.mo3858d(view2) - jVar.mo3861g(view))) / ((float) (Math.abs(oVar.mo3533h0(view) - oVar.mo3533h0(view2)) + 1)))) + ((float) (jVar.mo3867m() - jVar.mo3861g(view))));
    }

    /* renamed from: c */
    static int m3909c(C0401a0 a0Var, OrientationHelper jVar, View view, View view2, C0421o oVar, boolean z) {
        if (oVar.mo3493J() == 0 || a0Var.mo3331b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo3331b();
        }
        return (int) ((((float) (jVar.mo3858d(view2) - jVar.mo3861g(view))) / ((float) (Math.abs(oVar.mo3533h0(view) - oVar.mo3533h0(view2)) + 1))) * ((float) a0Var.mo3331b()));
    }
}
