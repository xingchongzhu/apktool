package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0433v;

/* renamed from: androidx.recyclerview.widget.g */
class LayoutState {

    /* renamed from: a */
    boolean f3113a = true;

    /* renamed from: b */
    int f3114b;

    /* renamed from: c */
    int f3115c;

    /* renamed from: d */
    int f3116d;

    /* renamed from: e */
    int f3117e;

    /* renamed from: f */
    int f3118f = 0;

    /* renamed from: g */
    int f3119g = 0;

    /* renamed from: h */
    boolean f3120h;

    /* renamed from: i */
    boolean f3121i;

    LayoutState() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3843a(C0401a0 a0Var) {
        int i = this.f3115c;
        return i >= 0 && i < a0Var.mo3331b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo3844b(C0433v vVar) {
        View o = vVar.mo3621o(this.f3115c);
        this.f3115c += this.f3116d;
        return o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.f3114b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f3115c);
        sb.append(", mItemDirection=");
        sb.append(this.f3116d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f3117e);
        sb.append(", mStartLine=");
        sb.append(this.f3118f);
        sb.append(", mEndLine=");
        sb.append(this.f3119g);
        sb.append('}');
        return sb.toString();
    }
}
