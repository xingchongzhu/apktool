package com.bumptech.glide.load.p158p.p163h;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.p166n.GifDecoder.C1614a;

/* renamed from: com.bumptech.glide.load.p.h.b */
public final class GifBitmapProvider implements C1614a {

    /* renamed from: a */
    private final BitmapPool f10929a;

    /* renamed from: b */
    private final ArrayPool f10930b;

    public GifBitmapProvider(BitmapPool eVar, ArrayPool bVar) {
        this.f10929a = eVar;
        this.f10930b = bVar;
    }

    /* renamed from: a */
    public Bitmap mo9270a(int i, int i2, Config config) {
        return this.f10929a.mo8884e(i, i2, config);
    }

    /* renamed from: b */
    public void mo9271b(byte[] bArr) {
        ArrayPool bVar = this.f10930b;
        if (bVar != null) {
            bVar.mo8861d(bArr);
        }
    }

    /* renamed from: c */
    public byte[] mo9272c(int i) {
        ArrayPool bVar = this.f10930b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo8862e(i, byte[].class);
    }

    /* renamed from: d */
    public void mo9273d(int[] iArr) {
        ArrayPool bVar = this.f10930b;
        if (bVar != null) {
            bVar.mo8861d(iArr);
        }
    }

    /* renamed from: e */
    public int[] mo9274e(int i) {
        ArrayPool bVar = this.f10930b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo8862e(i, int[].class);
    }

    /* renamed from: f */
    public void mo9275f(Bitmap bitmap) {
        this.f10929a.mo8883d(bitmap);
    }
}
