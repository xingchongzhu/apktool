package com.bumptech.glide.load.p158p.p159d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.p152n.Initializable;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.p174t.C1638j;

/* renamed from: com.bumptech.glide.load.p.d.v */
public final class LazyBitmapDrawableResource implements Resource<BitmapDrawable>, Initializable {

    /* renamed from: a */
    private final Resources f10903a;

    /* renamed from: b */
    private final Resource<Bitmap> f10904b;

    private LazyBitmapDrawableResource(Resources resources, Resource<Bitmap> vVar) {
        this.f10903a = (Resources) C1638j.m14081d(resources);
        this.f10904b = (Resource) C1638j.m14081d(vVar);
    }

    /* renamed from: g */
    public static Resource<BitmapDrawable> m13455g(Resources resources, Resource<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new LazyBitmapDrawableResource(resources, vVar);
    }

    /* renamed from: b */
    public void mo9079b() {
        Resource<Bitmap> vVar = this.f10904b;
        if (vVar instanceof Initializable) {
            ((Initializable) vVar).mo9079b();
        }
    }

    /* renamed from: c */
    public int mo9058c() {
        return this.f10904b.mo9058c();
    }

    /* renamed from: d */
    public BitmapDrawable mo9056a() {
        return new BitmapDrawable(this.f10903a, (Bitmap) this.f10904b.mo9056a());
    }

    /* renamed from: e */
    public Class<BitmapDrawable> mo9060e() {
        return BitmapDrawable.class;
    }

    /* renamed from: f */
    public void mo9061f() {
        this.f10904b.mo9061f();
    }
}
