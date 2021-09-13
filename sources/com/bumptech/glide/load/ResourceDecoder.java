package com.bumptech.glide.load;

import com.bumptech.glide.load.p152n.Resource;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.k */
public interface ResourceDecoder<T, Z> {
    /* renamed from: a */
    Resource<Z> mo8839a(T t, int i, int i2, Options iVar) throws IOException;

    /* renamed from: b */
    boolean mo8840b(T t, Options iVar) throws IOException;
}
