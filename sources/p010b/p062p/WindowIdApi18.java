package p010b.p062p;

import android.view.View;
import android.view.WindowId;

/* renamed from: b.p.l0 */
class WindowIdApi18 implements WindowIdImpl {

    /* renamed from: a */
    private final WindowId f5059a;

    WindowIdApi18(View view) {
        this.f5059a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof WindowIdApi18) && ((WindowIdApi18) obj).f5059a.equals(this.f5059a);
    }

    public int hashCode() {
        return this.f5059a.hashCode();
    }
}
