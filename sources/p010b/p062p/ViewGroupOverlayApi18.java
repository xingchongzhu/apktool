package p010b.p062p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: b.p.v */
class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {

    /* renamed from: a */
    private final ViewGroupOverlay f5129a;

    ViewGroupOverlayApi18(ViewGroup viewGroup) {
        this.f5129a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo5442a(View view) {
        this.f5129a.add(view);
    }

    /* renamed from: b */
    public void mo5302b(Drawable drawable) {
        this.f5129a.add(drawable);
    }

    /* renamed from: c */
    public void mo5443c(View view) {
        this.f5129a.remove(view);
    }

    /* renamed from: d */
    public void mo5303d(Drawable drawable) {
        this.f5129a.remove(drawable);
    }
}
