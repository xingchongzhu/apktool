package com.bumptech.glide.p170r.p171j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p170r.p172k.C1630b;
import com.bumptech.glide.p170r.p172k.C1630b.C1631a;

/* renamed from: com.bumptech.glide.r.j.e */
public abstract class ImageViewTarget<Z> extends ViewTarget<ImageView, Z> implements C1631a {

    /* renamed from: h */
    private Animatable f11215h;

    public ImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: p */
    private void m13998p(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f11215h = animatable;
            animatable.start();
            return;
        }
        this.f11215h = null;
    }

    /* renamed from: s */
    private void m13999s(Z z) {
        mo9524r(z);
        m13998p(z);
    }

    /* renamed from: b */
    public void mo8741b() {
        Animatable animatable = this.f11215h;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: d */
    public void mo9313d(Z z, C1630b<? super Z> bVar) {
        if (bVar == null || !bVar.mo9539a(z, this)) {
            m13999s(z);
        } else {
            m13998p(z);
        }
    }

    /* renamed from: e */
    public void mo9522e(Drawable drawable) {
        super.mo9522e(drawable);
        m13999s(null);
        mo9531q(drawable);
    }

    /* renamed from: f */
    public void mo8742f() {
        Animatable animatable = this.f11215h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: g */
    public void mo9523g(Drawable drawable) {
        super.mo9523g(drawable);
        m13999s(null);
        mo9531q(drawable);
    }

    /* renamed from: h */
    public void mo9314h(Drawable drawable) {
        super.mo9314h(drawable);
        Animatable animatable = this.f11215h;
        if (animatable != null) {
            animatable.stop();
        }
        m13999s(null);
        mo9531q(drawable);
    }

    /* renamed from: q */
    public void mo9531q(Drawable drawable) {
        ((ImageView) this.f11218c).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo9524r(Z z);
}
