package com.bumptech.glide.load.p158p.p161f;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.p152n.Initializable;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p158p.p163h.GifDrawable;
import com.bumptech.glide.p174t.C1638j;

/* renamed from: com.bumptech.glide.load.p.f.b */
public abstract class DrawableResource<T extends Drawable> implements Resource<T>, Initializable {

    /* renamed from: a */
    protected final T f10919a;

    public DrawableResource(T t) {
        this.f10919a = (Drawable) C1638j.m14081d(t);
    }

    /* renamed from: b */
    public void mo9079b() {
        T t = this.f10919a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).mo9279e().prepareToDraw();
        }
    }

    /* renamed from: d */
    public final T mo9056a() {
        ConstantState constantState = this.f10919a.getConstantState();
        if (constantState == null) {
            return this.f10919a;
        }
        return constantState.newDrawable();
    }
}
