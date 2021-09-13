package com.bumptech.glide.load.p158p.p163h;

import com.bumptech.glide.load.p152n.Initializable;
import com.bumptech.glide.load.p158p.p161f.DrawableResource;

/* renamed from: com.bumptech.glide.load.p.h.e */
public class GifDrawableResource extends DrawableResource<GifDrawable> implements Initializable {
    public GifDrawableResource(GifDrawable cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public void mo9079b() {
        ((GifDrawable) this.f10919a).mo9279e().prepareToDraw();
    }

    /* renamed from: c */
    public int mo9058c() {
        return ((GifDrawable) this.f10919a).mo9286i();
    }

    /* renamed from: e */
    public Class<GifDrawable> mo9060e() {
        return GifDrawable.class;
    }

    /* renamed from: f */
    public void mo9061f() {
        ((GifDrawable) this.f10919a).stop();
        ((GifDrawable) this.f10919a).mo9288k();
    }
}
