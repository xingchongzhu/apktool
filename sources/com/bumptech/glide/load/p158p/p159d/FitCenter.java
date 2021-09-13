package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.r */
public class FitCenter extends BitmapTransformation {

    /* renamed from: b */
    private static final byte[] f10884b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(Key.f10343a);

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        messageDigest.update(f10884b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo9210c(BitmapPool eVar, Bitmap bitmap, int i, int i2) {
        return TransformationUtils.m13275f(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof FitCenter;
    }

    public int hashCode() {
        return 1572326941;
    }
}
