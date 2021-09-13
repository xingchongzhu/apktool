package com.bumptech.glide.load.p158p.p164i;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p158p.p160e.BytesResource;
import com.bumptech.glide.load.p158p.p163h.GifDrawable;
import com.bumptech.glide.p174t.ByteBufferUtil;

/* renamed from: com.bumptech.glide.load.p.i.d */
public class GifDrawableBytesTranscoder implements ResourceTranscoder<GifDrawable, byte[]> {
    /* renamed from: a */
    public Resource<byte[]> mo9323a(Resource<GifDrawable> vVar, Options iVar) {
        return new BytesResource(ByteBufferUtil.m14050d(((GifDrawable) vVar.mo9056a()).mo9277c()));
    }
}
