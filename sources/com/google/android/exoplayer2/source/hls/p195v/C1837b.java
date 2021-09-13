package com.google.android.exoplayer2.source.hls.p195v;

import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1849a;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;

/* renamed from: com.google.android.exoplayer2.source.hls.v.b */
/* compiled from: lambda */
public final /* synthetic */ class C1837b implements C1849a {

    /* renamed from: a */
    public static final /* synthetic */ C1837b f11743a = new C1837b();

    private /* synthetic */ C1837b() {
    }

    /* renamed from: a */
    public final HlsPlaylistTracker mo14655a(HlsDataSourceFactory jVar, LoadErrorHandlingPolicy a0Var, HlsPlaylistParserFactory jVar2) {
        return new DefaultHlsPlaylistTracker(jVar, a0Var, jVar2);
    }
}
