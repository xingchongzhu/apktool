package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.j */
public class CenterInside extends BitmapTransformation {

    /* renamed from: b */
    private static final byte[] f10848b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(Key.f10343a);

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        messageDigest.update(f10848b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo9210c(BitmapPool eVar, Bitmap bitmap, int i, int i2) {
        return TransformationUtils.m13272c(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof CenterInside;
    }

    public int hashCode() {
        return -670243078;
    }
}
