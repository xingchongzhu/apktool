package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: com.google.android.exoplayer2.source.hls.k */
public interface HlsExtractorFactory {

    /* renamed from: a */
    public static final HlsExtractorFactory f11606a = new DefaultHlsExtractorFactory();

    /* renamed from: a */
    HlsMediaChunkExtractor mo14573a(Uri uri, Format u0Var, List<Format> list, TimestampAdjuster j0Var, Map<String, List<String>> map, ExtractorInput kVar) throws IOException;
}
