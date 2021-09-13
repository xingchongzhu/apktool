package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.p174t.C1639k;

/* renamed from: com.bumptech.glide.load.p.d.c0 */
public final class UnitBitmapDecoder implements ResourceDecoder<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.p.d.c0$a */
    /* compiled from: UnitBitmapDecoder */
    private static final class C1570a implements Resource<Bitmap> {

        /* renamed from: a */
        private final Bitmap f10831a;

        C1570a(Bitmap bitmap) {
            this.f10831a = bitmap;
        }

        /* renamed from: b */
        public Bitmap mo9056a() {
            return this.f10831a;
        }

        /* renamed from: c */
        public int mo9058c() {
            return C1639k.m14089g(this.f10831a);
        }

        /* renamed from: e */
        public Class<Bitmap> mo9060e() {
            return Bitmap.class;
        }

        /* renamed from: f */
        public void mo9061f() {
        }
    }

    /* renamed from: c */
    public Resource<Bitmap> mo8839a(Bitmap bitmap, int i, int i2, Options iVar) {
        return new C1570a(bitmap);
    }

    /* renamed from: d */
    public boolean mo8840b(Bitmap bitmap, Options iVar) {
        return true;
    }
}
