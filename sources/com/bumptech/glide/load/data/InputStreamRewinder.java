package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.DataRewinder.C1423a;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p158p.p159d.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.k */
public final class InputStreamRewinder implements DataRewinder<InputStream> {

    /* renamed from: a */
    private final RecyclableBufferedInputStream f10315a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    /* compiled from: InputStreamRewinder */
    public static final class C1428a implements C1423a<InputStream> {

        /* renamed from: a */
        private final ArrayPool f10316a;

        public C1428a(ArrayPool bVar) {
            this.f10316a = bVar;
        }

        /* renamed from: a */
        public Class<InputStream> mo8777a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public DataRewinder<InputStream> mo8778b(InputStream inputStream) {
            return new InputStreamRewinder(inputStream, this.f10316a);
        }
    }

    public InputStreamRewinder(InputStream inputStream, ArrayPool bVar) {
        RecyclableBufferedInputStream xVar = new RecyclableBufferedInputStream(inputStream, bVar);
        this.f10315a = xVar;
        xVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo8774b() {
        this.f10315a.mo9244D();
    }

    /* renamed from: c */
    public void mo8811c() {
        this.f10315a.mo9243C();
    }

    /* renamed from: d */
    public InputStream mo8773a() throws IOException {
        this.f10315a.reset();
        return this.f10315a;
    }
}
