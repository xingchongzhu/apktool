package com.bumptech.glide.load.p158p;

import android.content.Context;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.Resource;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.c */
public final class UnitTransformation<T> implements Transformation<T> {

    /* renamed from: b */
    private static final Transformation<?> f10813b = new UnitTransformation();

    private UnitTransformation() {
    }

    /* renamed from: c */
    public static <T> UnitTransformation<T> m13256c() {
        return (UnitTransformation) f10813b;
    }

    /* renamed from: a */
    public Resource<T> mo8842a(Context context, Resource<T> vVar, int i, int i2) {
        return vVar;
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
    }
}
