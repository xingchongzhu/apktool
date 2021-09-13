package com.google.android.exoplayer2.source.hls.p195v;

import com.google.android.exoplayer2.upstream.ParsingLoadable.C1908a;
import java.util.List;
import p067c.p068a.p069a.p070a.p096i2.FilteringManifestParser;
import p067c.p068a.p069a.p070a.p096i2.StreamKey;

/* renamed from: com.google.android.exoplayer2.source.hls.v.e */
public final class FilteringHlsPlaylistParserFactory implements HlsPlaylistParserFactory {

    /* renamed from: a */
    private final HlsPlaylistParserFactory f11771a;

    /* renamed from: b */
    private final List<StreamKey> f11772b;

    public FilteringHlsPlaylistParserFactory(HlsPlaylistParserFactory jVar, List<StreamKey> list) {
        this.f11771a = jVar;
        this.f11772b = list;
    }

    /* renamed from: a */
    public C1908a<HlsPlaylist> mo14656a(HlsMasterPlaylist fVar, HlsMediaPlaylist gVar) {
        return new FilteringManifestParser(this.f11771a.mo14656a(fVar, gVar), this.f11772b);
    }

    /* renamed from: b */
    public C1908a<HlsPlaylist> mo14657b() {
        return new FilteringManifestParser(this.f11771a.mo14657b(), this.f11772b);
    }
}
