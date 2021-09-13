package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p152n.Initializable;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;

/* renamed from: com.bumptech.glide.load.p.d.e */
public class BitmapResource implements Resource<Bitmap>, Initializable {

    /* renamed from: a */
    private final Bitmap f10843a;

    /* renamed from: b */
    private final BitmapPool f10844b;

    public BitmapResource(Bitmap bitmap, BitmapPool eVar) {
        this.f10843a = (Bitmap) C1638j.m14082e(bitmap, "Bitmap must not be null");
        this.f10844b = (BitmapPool) C1638j.m14082e(eVar, "BitmapPool must not be null");
    }

    /* renamed from: g */
    public static BitmapResource m13323g(Bitmap bitmap, BitmapPool eVar) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapResource(bitmap, eVar);
    }

    /* renamed from: b */
    public void mo9079b() {
        this.f10843a.prepareToDraw();
    }

    /* renamed from: c */
    public int mo9058c() {
        return C1639k.m14089g(this.f10843a);
    }

    /* renamed from: d */
    public Bitmap mo9056a() {
        return this.f10843a;
    }

    /* renamed from: e */
    public Class<Bitmap> mo9060e() {
        return Bitmap.class;
    }

    /* renamed from: f */
    public void mo9061f() {
        this.f10844b.mo8883d(this.f10843a);
    }
}
