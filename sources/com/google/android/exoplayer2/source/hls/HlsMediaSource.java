package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.hls.p195v.DefaultHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.p195v.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.p195v.FilteringHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1844d;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1846f;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1849a;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1853e;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.C1916m.C1917a;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.ExoPlayerLibraryInfo;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.MediaItem.C1265f;
import p067c.p068a.p069a.p070a.MediaItem.C1266g;
import p067c.p068a.p069a.p070a.p075e2.C0900y;
import p067c.p068a.p069a.p070a.p075e2.DefaultDrmSessionManagerProvider;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionManagerProvider;
import p067c.p068a.p069a.p070a.p096i2.StreamKey;
import p067c.p068a.p069a.p070a.p097j2.BaseMediaSource;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.CompositeSequenceableLoaderFactory;
import p067c.p068a.p069a.p070a.p097j2.DefaultCompositeSequenceableLoaderFactory;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceFactory;
import p067c.p068a.p069a.p070a.p097j2.SinglePeriodTimeline;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

public final class HlsMediaSource extends BaseMediaSource implements C1853e {

    /* renamed from: g */
    private final HlsExtractorFactory f11531g;

    /* renamed from: h */
    private final C1266g f11532h;

    /* renamed from: i */
    private final HlsDataSourceFactory f11533i;

    /* renamed from: j */
    private final CompositeSequenceableLoaderFactory f11534j;

    /* renamed from: k */
    private final C0900y f11535k;

    /* renamed from: l */
    private final LoadErrorHandlingPolicy f11536l;

    /* renamed from: m */
    private final boolean f11537m;

    /* renamed from: n */
    private final int f11538n;

    /* renamed from: o */
    private final boolean f11539o;

    /* renamed from: p */
    private final HlsPlaylistTracker f11540p;

    /* renamed from: q */
    private final long f11541q;

    /* renamed from: r */
    private final MediaItem f11542r;

    /* renamed from: s */
    private C1265f f11543s;

    /* renamed from: t */
    private TransferListener f11544t;

    public static final class Factory implements MediaSourceFactory {

        /* renamed from: a */
        private final HlsDataSourceFactory f11545a;

        /* renamed from: b */
        private HlsExtractorFactory f11546b;

        /* renamed from: c */
        private HlsPlaylistParserFactory f11547c;

        /* renamed from: d */
        private C1849a f11548d;

        /* renamed from: e */
        private CompositeSequenceableLoaderFactory f11549e;

        /* renamed from: f */
        private DrmSessionManagerProvider f11550f;

        /* renamed from: g */
        private LoadErrorHandlingPolicy f11551g;

        /* renamed from: h */
        private boolean f11552h;

        /* renamed from: i */
        private int f11553i;

        /* renamed from: j */
        private boolean f11554j;

        /* renamed from: k */
        private List<StreamKey> f11555k;

        /* renamed from: l */
        private Object f11556l;

        /* renamed from: m */
        private long f11557m;

        public Factory(C1917a aVar) {
            this((HlsDataSourceFactory) new DefaultHlsDataSourceFactory(aVar));
        }

        /* renamed from: a */
        public HlsMediaSource mo14560a(MediaItem z0Var) {
            List<StreamKey> list;
            MediaItem z0Var2 = z0Var;
            Assertions.m10153e(z0Var2.f8985b);
            HlsPlaylistParserFactory jVar = this.f11547c;
            if (z0Var2.f8985b.f9042e.isEmpty()) {
                list = this.f11555k;
            } else {
                list = z0Var2.f8985b.f9042e;
            }
            if (!list.isEmpty()) {
                jVar = new FilteringHlsPlaylistParserFactory(jVar, list);
            }
            C1266g gVar = z0Var2.f8985b;
            boolean z = true;
            boolean z2 = gVar.f9045h == null && this.f11556l != null;
            if (!gVar.f9042e.isEmpty() || list.isEmpty()) {
                z = false;
            }
            if (z2 && z) {
                z0Var2 = z0Var.mo7775a().mo7785f(this.f11556l).mo7784e(list).mo7780a();
            } else if (z2) {
                z0Var2 = z0Var.mo7775a().mo7785f(this.f11556l).mo7780a();
            } else if (z) {
                z0Var2 = z0Var.mo7775a().mo7784e(list).mo7780a();
            }
            MediaItem z0Var3 = z0Var2;
            HlsDataSourceFactory jVar2 = this.f11545a;
            HlsExtractorFactory kVar = this.f11546b;
            CompositeSequenceableLoaderFactory qVar = this.f11549e;
            C0900y a = this.f11550f.mo6094a(z0Var3);
            LoadErrorHandlingPolicy a0Var = this.f11551g;
            HlsMediaSource hlsMediaSource = new HlsMediaSource(z0Var3, jVar2, kVar, qVar, a, a0Var, this.f11548d.mo14655a(this.f11545a, a0Var, jVar), this.f11557m, this.f11552h, this.f11553i, this.f11554j);
            return hlsMediaSource;
        }

        /* renamed from: b */
        public Factory mo14561b(HlsPlaylistParserFactory jVar) {
            if (jVar == null) {
                jVar = new DefaultHlsPlaylistParserFactory();
            }
            this.f11547c = jVar;
            return this;
        }

        public Factory(HlsDataSourceFactory jVar) {
            this.f11545a = (HlsDataSourceFactory) Assertions.m10153e(jVar);
            this.f11550f = new DefaultDrmSessionManagerProvider();
            this.f11547c = new DefaultHlsPlaylistParserFactory();
            this.f11548d = DefaultHlsPlaylistTracker.f11744a;
            this.f11546b = HlsExtractorFactory.f11606a;
            this.f11551g = new DefaultLoadErrorHandlingPolicy();
            this.f11549e = new DefaultCompositeSequenceableLoaderFactory();
            this.f11553i = 1;
            this.f11555k = Collections.emptyList();
            this.f11557m = -9223372036854775807L;
        }
    }

    static {
        ExoPlayerLibraryInfo.m10920a("goog.exo.hls");
    }

    /* renamed from: A */
    private static long m14357A(HlsMediaPlaylist gVar, long j) {
        long j2;
        C1846f fVar = gVar.f11810t;
        long j3 = gVar.f11795e;
        if (j3 != -9223372036854775807L) {
            j2 = gVar.f11809s - j3;
        } else {
            long j4 = fVar.f11832d;
            if (j4 == -9223372036854775807L || gVar.f11802l == -9223372036854775807L) {
                long j5 = fVar.f11831c;
                if (j5 != -9223372036854775807L) {
                    j2 = j5;
                } else {
                    j2 = gVar.f11801k * 3;
                }
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    /* renamed from: B */
    private long m14358B(HlsMediaPlaylist gVar, long j) {
        List<C1844d> list = gVar.f11806p;
        int size = list.size() - 1;
        long c = (gVar.f11809s + j) - C.m8860c(this.f11543s.f9033b);
        while (size > 0 && ((C1844d) list.get(size)).f11822e > c) {
            size--;
        }
        return ((C1844d) list.get(size)).f11822e;
    }

    /* renamed from: C */
    private void m14359C(long j) {
        long d = C.m8861d(j);
        if (d != this.f11543s.f9033b) {
            this.f11543s = this.f11542r.mo7775a().mo7782c(d).mo7780a().f8986c;
        }
    }

    /* renamed from: z */
    private long m14360z(HlsMediaPlaylist gVar) {
        if (gVar.f11804n) {
            return C.m8860c(Util.m10271U(this.f11541q)) - gVar.mo14687e();
        }
        return 0;
    }

    /* renamed from: a */
    public MediaItem mo6827a() {
        return this.f11542r;
    }

    /* renamed from: c */
    public void mo6829c() throws IOException {
        this.f11540p.mo14665e();
    }

    /* renamed from: d */
    public MediaPeriod mo6830d(C1081a aVar, Allocator eVar, long j) {
        C1084a s = mo6922s(aVar);
        HlsMediaPeriod oVar = new HlsMediaPeriod(this.f11531g, this.f11540p, this.f11533i, this.f11544t, this.f11535k, mo6920q(aVar), this.f11536l, s, eVar, this.f11534j, this.f11537m, this.f11538n, this.f11539o);
        return oVar;
    }

    /* renamed from: f */
    public void mo6832f(MediaPeriod a0Var) {
        ((HlsMediaPeriod) a0Var).mo14602B();
    }

    /* renamed from: k */
    public void mo14559k(HlsMediaPlaylist gVar) {
        SinglePeriodTimeline o0Var;
        long j;
        HlsMediaPlaylist gVar2 = gVar;
        long d = gVar2.f11804n ? C.m8861d(gVar2.f11796f) : -9223372036854775807L;
        int i = gVar2.f11794d;
        long j2 = (i == 2 || i == 1) ? d : -9223372036854775807L;
        long j3 = gVar2.f11795e;
        HlsManifest lVar = new HlsManifest((HlsMasterPlaylist) Assertions.m10153e(this.f11540p.mo14662b()), gVar2);
        if (this.f11540p.mo14661a()) {
            long z = m14360z(gVar);
            long j4 = this.f11543s.f9033b;
            if (j4 != -9223372036854775807L) {
                j = C.m8860c(j4);
            } else {
                j = m14357A(gVar2, z);
            }
            m14359C(Util.m10309q(j, z, gVar2.f11809s + z));
            long l = gVar2.f11796f - this.f11540p.mo14671l();
            long j5 = gVar2.f11803m ? l + gVar2.f11809s : -9223372036854775807L;
            long j6 = !gVar2.f11806p.isEmpty() ? m14358B(gVar2, z) : j3 == -9223372036854775807L ? 0 : j3;
            o0Var = new SinglePeriodTimeline(j2, d, -9223372036854775807L, j5, gVar2.f11809s, l, j6, true, !gVar2.f11803m, lVar, this.f11542r, this.f11543s);
        } else {
            long j7 = j3 == -9223372036854775807L ? 0 : j3;
            long j8 = gVar2.f11809s;
            o0Var = new SinglePeriodTimeline(j2, d, -9223372036854775807L, j8, j8, 0, j7, true, false, lVar, this.f11542r, null);
        }
        mo6926x(o0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo6904w(TransferListener e0Var) {
        this.f11544t = e0Var;
        this.f11535k.mo6086d();
        this.f11540p.mo14664d(this.f11532h.f9038a, mo6922s(null), this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo6905y() {
        this.f11540p.stop();
        this.f11535k.mo6083a();
    }

    private HlsMediaSource(MediaItem z0Var, HlsDataSourceFactory jVar, HlsExtractorFactory kVar, CompositeSequenceableLoaderFactory qVar, C0900y yVar, LoadErrorHandlingPolicy a0Var, HlsPlaylistTracker kVar2, long j, boolean z, int i, boolean z2) {
        this.f11532h = (C1266g) Assertions.m10153e(z0Var.f8985b);
        this.f11542r = z0Var;
        this.f11543s = z0Var.f8986c;
        this.f11533i = jVar;
        this.f11531g = kVar;
        this.f11534j = qVar;
        this.f11535k = yVar;
        this.f11536l = a0Var;
        this.f11540p = kVar2;
        this.f11541q = j;
        this.f11537m = z;
        this.f11538n = i;
        this.f11539o = z2;
    }
}
