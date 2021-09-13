package com.google.android.exoplayer2.source.hls.p195v;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;

/* renamed from: com.google.android.exoplayer2.source.hls.v.k */
public interface HlsPlaylistTracker {

    /* renamed from: com.google.android.exoplayer2.source.hls.v.k$a */
    /* compiled from: HlsPlaylistTracker */
    public interface C1849a {
        /* renamed from: a */
        HlsPlaylistTracker mo14655a(HlsDataSourceFactory jVar, LoadErrorHandlingPolicy a0Var, HlsPlaylistParserFactory jVar2);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.k$b */
    /* compiled from: HlsPlaylistTracker */
    public interface C1850b {
        /* renamed from: h */
        void mo14604h();

        /* renamed from: i */
        boolean mo14605i(Uri uri, long j);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.k$c */
    /* compiled from: HlsPlaylistTracker */
    public static final class C1851c extends IOException {

        /* renamed from: a */
        public final Uri f11893a;

        public C1851c(Uri uri) {
            this.f11893a = uri;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.k$d */
    /* compiled from: HlsPlaylistTracker */
    public static final class C1852d extends IOException {

        /* renamed from: a */
        public final Uri f11894a;

        public C1852d(Uri uri) {
            this.f11894a = uri;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.k$e */
    /* compiled from: HlsPlaylistTracker */
    public interface C1853e {
        /* renamed from: k */
        void mo14559k(HlsMediaPlaylist gVar);
    }

    /* renamed from: a */
    boolean mo14661a();

    /* renamed from: b */
    HlsMasterPlaylist mo14662b();

    /* renamed from: c */
    boolean mo14663c(Uri uri);

    /* renamed from: d */
    void mo14664d(Uri uri, C1084a aVar, C1853e eVar);

    /* renamed from: e */
    void mo14665e() throws IOException;

    /* renamed from: f */
    void mo14666f(C1850b bVar);

    /* renamed from: g */
    void mo14667g(Uri uri) throws IOException;

    /* renamed from: h */
    void mo14668h(Uri uri);

    /* renamed from: i */
    void mo14669i(C1850b bVar);

    /* renamed from: k */
    HlsMediaPlaylist mo14670k(Uri uri, boolean z);

    /* renamed from: l */
    long mo14671l();

    void stop();
}
