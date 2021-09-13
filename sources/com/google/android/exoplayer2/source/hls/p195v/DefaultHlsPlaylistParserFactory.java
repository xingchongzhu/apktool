package com.google.android.exoplayer2.source.hls.p195v;

import com.google.android.exoplayer2.upstream.ParsingLoadable.C1908a;

/* renamed from: com.google.android.exoplayer2.source.hls.v.c */
public final class DefaultHlsPlaylistParserFactory implements HlsPlaylistParserFactory {
    /* renamed from: a */
    public C1908a<HlsPlaylist> mo14656a(HlsMasterPlaylist fVar, HlsMediaPlaylist gVar) {
        return new HlsPlaylistParser(fVar, gVar);
    }

    /* renamed from: b */
    public C1908a<HlsPlaylist> mo14657b() {
        return new HlsPlaylistParser();
    }
}
