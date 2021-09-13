package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import androidx.recyclerview.widget.RecyclerView.C0415l;
import androidx.recyclerview.widget.RecyclerView.C0415l.C0418c;

/* renamed from: androidx.recyclerview.widget.n */
public abstract class SimpleItemAnimator extends C0415l {

    /* renamed from: g */
    boolean f3141g = true;

    /* renamed from: A */
    public final void mo3888A(C0407d0 d0Var) {
        mo3896I(d0Var);
        mo3449h(d0Var);
    }

    /* renamed from: B */
    public final void mo3889B(C0407d0 d0Var) {
        mo3897J(d0Var);
    }

    /* renamed from: C */
    public final void mo3890C(C0407d0 d0Var, boolean z) {
        mo3898K(d0Var, z);
        mo3449h(d0Var);
    }

    /* renamed from: D */
    public final void mo3891D(C0407d0 d0Var, boolean z) {
        mo3899L(d0Var, z);
    }

    /* renamed from: E */
    public final void mo3892E(C0407d0 d0Var) {
        mo3900M(d0Var);
        mo3449h(d0Var);
    }

    /* renamed from: F */
    public final void mo3893F(C0407d0 d0Var) {
        mo3901N(d0Var);
    }

    /* renamed from: G */
    public final void mo3894G(C0407d0 d0Var) {
        mo3902O(d0Var);
        mo3449h(d0Var);
    }

    /* renamed from: H */
    public final void mo3895H(C0407d0 d0Var) {
        mo3903P(d0Var);
    }

    /* renamed from: I */
    public void mo3896I(C0407d0 d0Var) {
    }

    /* renamed from: J */
    public void mo3897J(C0407d0 d0Var) {
    }

    /* renamed from: K */
    public void mo3898K(C0407d0 d0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo3899L(C0407d0 d0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo3900M(C0407d0 d0Var) {
    }

    /* renamed from: N */
    public void mo3901N(C0407d0 d0Var) {
    }

    /* renamed from: O */
    public void mo3902O(C0407d0 d0Var) {
    }

    /* renamed from: P */
    public void mo3903P(C0407d0 d0Var) {
    }

    /* renamed from: a */
    public boolean mo3443a(C0407d0 d0Var, C0418c cVar, C0418c cVar2) {
        if (cVar != null) {
            int i = cVar.f2869a;
            int i2 = cVar2.f2869a;
            if (!(i == i2 && cVar.f2870b == cVar2.f2870b)) {
                return mo3799y(d0Var, i, cVar.f2870b, i2, cVar2.f2870b);
            }
        }
        return mo3797w(d0Var);
    }

    /* renamed from: b */
    public boolean mo3444b(C0407d0 d0Var, C0407d0 d0Var2, C0418c cVar, C0418c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2869a;
        int i4 = cVar.f2870b;
        if (d0Var2.mo3358J()) {
            int i5 = cVar.f2869a;
            i = cVar.f2870b;
            i2 = i5;
        } else {
            i2 = cVar2.f2869a;
            i = cVar2.f2870b;
        }
        return mo3798x(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo3445c(C0407d0 d0Var, C0418c cVar, C0418c cVar2) {
        int i = cVar.f2869a;
        int i2 = cVar.f2870b;
        View view = d0Var.f2841b;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2869a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2870b;
        if (d0Var.mo3382v() || (i == left && i2 == top)) {
            return mo3800z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo3799y(d0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo3446d(C0407d0 d0Var, C0418c cVar, C0418c cVar2) {
        int i = cVar.f2869a;
        int i2 = cVar2.f2869a;
        if (i == i2 && cVar.f2870b == cVar2.f2870b) {
            mo3892E(d0Var);
            return false;
        }
        return mo3799y(d0Var, i, cVar.f2870b, i2, cVar2.f2870b);
    }

    /* renamed from: f */
    public boolean mo3447f(C0407d0 d0Var) {
        return !this.f3141g || d0Var.mo3379t();
    }

    /* renamed from: w */
    public abstract boolean mo3797w(C0407d0 d0Var);

    /* renamed from: x */
    public abstract boolean mo3798x(C0407d0 d0Var, C0407d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo3799y(C0407d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo3800z(C0407d0 d0Var);
}
