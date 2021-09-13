package com.bumptech.glide.p166n;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.n.a */
public interface GifDecoder {

    /* renamed from: com.bumptech.glide.n.a$a */
    /* compiled from: GifDecoder */
    public interface C1614a {
        /* renamed from: a */
        Bitmap mo9270a(int i, int i2, Config config);

        /* renamed from: b */
        void mo9271b(byte[] bArr);

        /* renamed from: c */
        byte[] mo9272c(int i);

        /* renamed from: d */
        void mo9273d(int[] iArr);

        /* renamed from: e */
        int[] mo9274e(int i);

        /* renamed from: f */
        void mo9275f(Bitmap bitmap);
    }

    /* renamed from: a */
    int mo9348a();

    /* renamed from: b */
    Bitmap mo9349b();

    /* renamed from: c */
    void mo9350c();

    void clear();

    /* renamed from: d */
    int mo9352d();

    /* renamed from: e */
    int mo9353e();

    /* renamed from: f */
    int mo9354f();

    /* renamed from: g */
    void mo9355g(Config config);

    /* renamed from: h */
    ByteBuffer mo9356h();

    /* renamed from: i */
    void mo9357i();
}
