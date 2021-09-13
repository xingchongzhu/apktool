package com.google.android.exoplayer2.source.hls.p195v;

import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p096i2.FilterableManifest;

/* renamed from: com.google.android.exoplayer2.source.hls.v.h */
public abstract class HlsPlaylist implements FilterableManifest<HlsPlaylist> {

    /* renamed from: a */
    public final String f11834a;

    /* renamed from: b */
    public final List<String> f11835b;

    /* renamed from: c */
    public final boolean f11836c;

    protected HlsPlaylist(String str, List<String> list, boolean z) {
        this.f11834a = str;
        this.f11835b = Collections.unmodifiableList(list);
        this.f11836c = z;
    }
}
