package p010b.p062p;

import android.os.IBinder;

/* renamed from: b.p.k0 */
class WindowIdApi14 implements WindowIdImpl {

    /* renamed from: a */
    private final IBinder f5056a;

    WindowIdApi14(IBinder iBinder) {
        this.f5056a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof WindowIdApi14) && ((WindowIdApi14) obj).f5056a.equals(this.f5056a);
    }

    public int hashCode() {
        return this.f5056a.hashCode();
    }
}
