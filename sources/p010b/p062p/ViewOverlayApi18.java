package p010b.p062p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: b.p.a0 */
class ViewOverlayApi18 implements ViewOverlayImpl {

    /* renamed from: a */
    private final ViewOverlay f4963a;

    ViewOverlayApi18(View view) {
        this.f4963a = view.getOverlay();
    }

    /* renamed from: b */
    public void mo5302b(Drawable drawable) {
        this.f4963a.add(drawable);
    }

    /* renamed from: d */
    public void mo5303d(Drawable drawable) {
        this.f4963a.remove(drawable);
    }
}
