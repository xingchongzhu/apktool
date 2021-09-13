package com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.g */
public interface Key {

    /* renamed from: a */
    public static final Charset f10343a = Charset.forName("UTF-8");

    /* renamed from: b */
    void mo8826b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
