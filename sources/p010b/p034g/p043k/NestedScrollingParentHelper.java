package p010b.p034g.p043k;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.g.k.p */
public class NestedScrollingParentHelper {

    /* renamed from: a */
    private int f4730a;

    /* renamed from: b */
    private int f4731b;

    public NestedScrollingParentHelper(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo5142a() {
        return this.f4730a | this.f4731b;
    }

    /* renamed from: b */
    public void mo5143b(View view, View view2, int i) {
        mo5144c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo5144c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f4731b = i;
        } else {
            this.f4730a = i;
        }
    }

    /* renamed from: d */
    public void mo5145d(View view, int i) {
        if (i == 1) {
            this.f4731b = 0;
        } else {
            this.f4730a = 0;
        }
    }
}
