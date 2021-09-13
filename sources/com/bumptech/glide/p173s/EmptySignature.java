package com.bumptech.glide.p173s;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.s.a */
public final class EmptySignature implements Key {

    /* renamed from: b */
    private static final EmptySignature f11231b = new EmptySignature();

    private EmptySignature() {
    }

    /* renamed from: c */
    public static EmptySignature m14044c() {
        return f11231b;
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
