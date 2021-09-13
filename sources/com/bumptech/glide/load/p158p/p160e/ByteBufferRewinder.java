package com.bumptech.glide.load.p158p.p160e;

import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinder.C1423a;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.e.a */
public class ByteBufferRewinder implements DataRewinder<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f10916a;

    /* renamed from: com.bumptech.glide.load.p.e.a$a */
    /* compiled from: ByteBufferRewinder */
    public static class C1598a implements C1423a<ByteBuffer> {
        /* renamed from: a */
        public Class<ByteBuffer> mo8777a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public DataRewinder<ByteBuffer> mo8778b(ByteBuffer byteBuffer) {
            return new ByteBufferRewinder(byteBuffer);
        }
    }

    public ByteBufferRewinder(ByteBuffer byteBuffer) {
        this.f10916a = byteBuffer;
    }

    /* renamed from: b */
    public void mo8774b() {
    }

    /* renamed from: c */
    public ByteBuffer mo8773a() {
        this.f10916a.position(0);
        return this.f10916a;
    }
}
