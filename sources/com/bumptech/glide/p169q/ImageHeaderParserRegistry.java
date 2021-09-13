package com.bumptech.glide.p169q;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.b */
public final class ImageHeaderParserRegistry {

    /* renamed from: a */
    private final List<ImageHeaderParser> f11115a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo9431a(ImageHeaderParser imageHeaderParser) {
        this.f11115a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo9432b() {
        return this.f11115a;
    }
}
