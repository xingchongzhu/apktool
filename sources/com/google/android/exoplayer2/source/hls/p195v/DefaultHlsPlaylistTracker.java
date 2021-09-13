package com.google.android.exoplayer2.source.hls.p195v;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist.C1840b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1842b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1843c;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1844d;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1846f;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistParser.C1847a;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1849a;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1850b;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1851c;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1852d;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1853e;
import com.google.android.exoplayer2.upstream.C1898b0;
import com.google.android.exoplayer2.upstream.C1898b0.C1900b;
import com.google.android.exoplayer2.upstream.C1898b0.C1901c;
import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.C1926y.C1931e;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.C1896a;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p097j2.MediaLoadData;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.Iterables;

/* renamed from: com.google.android.exoplayer2.source.hls.v.d */
public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, C1900b<ParsingLoadable<HlsPlaylist>> {

    /* renamed from: a */
    public static final C1849a f11744a = C1837b.f11743a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final HlsDataSourceFactory f11745b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HlsPlaylistParserFactory f11746c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final LoadErrorHandlingPolicy f11747d;

    /* renamed from: e */
    private final HashMap<Uri, C1838a> f11748e;

    /* renamed from: f */
    private final List<C1850b> f11749f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final double f11750g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1084a f11751h;

    /* renamed from: i */
    private C1898b0 f11752i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f11753j;

    /* renamed from: k */
    private C1853e f11754k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public HlsMasterPlaylist f11755l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Uri f11756m;

    /* renamed from: n */
    private HlsMediaPlaylist f11757n;

    /* renamed from: o */
    private boolean f11758o;

    /* renamed from: p */
    private long f11759p;

    /* renamed from: com.google.android.exoplayer2.source.hls.v.d$a */
    /* compiled from: DefaultHlsPlaylistTracker */
    private final class C1838a implements C1900b<ParsingLoadable<HlsPlaylist>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Uri f11760a;

        /* renamed from: b */
        private final C1898b0 f11761b = new C1898b0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        private final C1916m f11762c;

        /* renamed from: d */
        private HlsMediaPlaylist f11763d;

        /* renamed from: e */
        private long f11764e;

        /* renamed from: f */
        private long f11765f;

        /* renamed from: g */
        private long f11766g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f11767h;

        /* renamed from: i */
        private boolean f11768i;

        /* renamed from: j */
        private IOException f11769j;

        public C1838a(Uri uri) {
            this.f11760a = uri;
            this.f11762c = DefaultHlsPlaylistTracker.this.f11745b.mo14572a(4);
        }

        /* renamed from: e */
        private boolean m14622e(long j) {
            this.f11767h = SystemClock.elapsedRealtime() + j;
            return this.f11760a.equals(DefaultHlsPlaylistTracker.this.f11756m) && !DefaultHlsPlaylistTracker.this.m14585H();
        }

        /* renamed from: f */
        private Uri m14623f() {
            HlsMediaPlaylist gVar = this.f11763d;
            if (gVar != null) {
                C1846f fVar = gVar.f11810t;
                if (fVar.f11829a != -9223372036854775807L || fVar.f11833e) {
                    Builder buildUpon = this.f11760a.buildUpon();
                    HlsMediaPlaylist gVar2 = this.f11763d;
                    if (gVar2.f11810t.f11833e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f11799i + ((long) gVar2.f11806p.size())));
                        HlsMediaPlaylist gVar3 = this.f11763d;
                        if (gVar3.f11802l != -9223372036854775807L) {
                            List<C1842b> list = gVar3.f11807q;
                            int size = list.size();
                            if (!list.isEmpty() && ((C1842b) Iterables.m12008c(list)).f11812m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C1846f fVar2 = this.f11763d.f11810t;
                    if (fVar2.f11829a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f11830b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f11760a;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void mo14675k(Uri uri) {
            this.f11768i = false;
            m14625m(uri);
        }

        /* renamed from: m */
        private void m14625m(Uri uri) {
            ParsingLoadable c0Var = new ParsingLoadable(this.f11762c, uri, 4, DefaultHlsPlaylistTracker.this.f11746c.mo14656a(DefaultHlsPlaylistTracker.this.f11755l, this.f11763d));
            long n = this.f11761b.mo14902n(c0Var, this, DefaultHlsPlaylistTracker.this.f11747d.mo14892d(c0Var.f12295c));
            C1084a v = DefaultHlsPlaylistTracker.this.f11751h;
            LoadEventInfo wVar = new LoadEventInfo(c0Var.f12293a, c0Var.f12294b, n);
            v.mo6866z(wVar, c0Var.f12295c);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m14626n(Uri uri) {
            this.f11767h = 0;
            if (!this.f11768i && !this.f11761b.mo14897i() && !this.f11761b.mo14896h()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f11766g) {
                    this.f11768i = true;
                    DefaultHlsPlaylistTracker.this.f11753j.postDelayed(new C1836a(this, uri), this.f11766g - elapsedRealtime);
                    return;
                }
                m14625m(uri);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public void m14627u(HlsMediaPlaylist gVar, LoadEventInfo wVar) {
            HlsMediaPlaylist gVar2 = this.f11763d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f11764e = elapsedRealtime;
            HlsMediaPlaylist n = DefaultHlsPlaylistTracker.this.m14580C(gVar2, gVar);
            this.f11763d = n;
            boolean z = true;
            if (n != gVar2) {
                this.f11769j = null;
                this.f11765f = elapsedRealtime;
                DefaultHlsPlaylistTracker.this.m14588N(this.f11760a, n);
            } else if (!n.f11803m) {
                long size = gVar.f11799i + ((long) gVar.f11806p.size());
                HlsMediaPlaylist gVar3 = this.f11763d;
                if (size < gVar3.f11799i) {
                    this.f11769j = new C1851c(this.f11760a);
                    DefaultHlsPlaylistTracker.this.m14587J(this.f11760a, -9223372036854775807L);
                } else {
                    double d = (double) (elapsedRealtime - this.f11765f);
                    double d2 = (double) C.m8861d(gVar3.f11801k);
                    double q = DefaultHlsPlaylistTracker.this.f11750g;
                    Double.isNaN(d2);
                    if (d > d2 * q) {
                        this.f11769j = new C1852d(this.f11760a);
                        long c = DefaultHlsPlaylistTracker.this.f11747d.mo14891c(new C1896a(wVar, new MediaLoadData(4), this.f11769j, 1));
                        DefaultHlsPlaylistTracker.this.m14587J(this.f11760a, c);
                        if (c != -9223372036854775807L) {
                            m14622e(c);
                        }
                    }
                }
            }
            long j = 0;
            HlsMediaPlaylist gVar4 = this.f11763d;
            if (!gVar4.f11810t.f11833e) {
                if (gVar4 != gVar2) {
                    j = gVar4.f11801k;
                } else {
                    j = gVar4.f11801k / 2;
                }
            }
            this.f11766g = elapsedRealtime + C.m8861d(j);
            if (this.f11763d.f11802l == -9223372036854775807L && !this.f11760a.equals(DefaultHlsPlaylistTracker.this.f11756m)) {
                z = false;
            }
            if (z && !this.f11763d.f11803m) {
                m14626n(m14623f());
            }
        }

        /* renamed from: g */
        public HlsMediaPlaylist mo14673g() {
            return this.f11763d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
            if ((r10.f11764e + r4) <= r2) goto L_0x002e;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo14674h() {
            /*
                r10 = this;
                com.google.android.exoplayer2.source.hls.v.g r0 = r10.f11763d
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                long r2 = android.os.SystemClock.elapsedRealtime()
                r4 = 30000(0x7530, double:1.4822E-319)
                com.google.android.exoplayer2.source.hls.v.g r0 = r10.f11763d
                long r6 = r0.f11809s
                long r6 = p067c.p068a.p069a.p070a.C.m8861d(r6)
                long r4 = java.lang.Math.max(r4, r6)
                com.google.android.exoplayer2.source.hls.v.g r0 = r10.f11763d
                boolean r6 = r0.f11803m
                r7 = 1
                if (r6 != 0) goto L_0x002d
                int r0 = r0.f11794d
                r6 = 2
                if (r0 == r6) goto L_0x002d
                if (r0 == r7) goto L_0x002d
                long r8 = r10.f11764e
                long r8 = r8 + r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.p195v.DefaultHlsPlaylistTracker.C1838a.mo14674h():boolean");
        }

        /* renamed from: l */
        public void mo14676l() {
            m14626n(this.f11760a);
        }

        /* renamed from: o */
        public void mo14677o() throws IOException {
            this.f11761b.mo14898j();
            IOException iOException = this.f11769j;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: q */
        public void mo6889j(ParsingLoadable<HlsPlaylist> c0Var, long j, long j2, boolean z) {
            ParsingLoadable<HlsPlaylist> c0Var2 = c0Var;
            LoadEventInfo wVar = new LoadEventInfo(c0Var2.f12293a, c0Var2.f12294b, c0Var.mo14913f(), c0Var.mo14911d(), j, j2, c0Var.mo14910b());
            DefaultHlsPlaylistTracker.this.f11747d.mo14889a(c0Var2.f12293a);
            DefaultHlsPlaylistTracker.this.f11751h.mo6857q(wVar, 4);
        }

        /* renamed from: s */
        public void mo6892r(ParsingLoadable<HlsPlaylist> c0Var, long j, long j2) {
            ParsingLoadable<HlsPlaylist> c0Var2 = c0Var;
            HlsPlaylist hVar = (HlsPlaylist) c0Var.mo14912e();
            LoadEventInfo wVar = new LoadEventInfo(c0Var2.f12293a, c0Var2.f12294b, c0Var.mo14913f(), c0Var.mo14911d(), j, j2, c0Var.mo14910b());
            if (hVar instanceof HlsMediaPlaylist) {
                m14627u((HlsMediaPlaylist) hVar, wVar);
                DefaultHlsPlaylistTracker.this.f11751h.mo6860t(wVar, 4);
            } else {
                this.f11769j = new ParserException("Loaded playlist has unexpected type.");
                DefaultHlsPlaylistTracker.this.f11751h.mo6864x(wVar, 4, this.f11769j, true);
            }
            DefaultHlsPlaylistTracker.this.f11747d.mo14889a(c0Var2.f12293a);
        }

        /* renamed from: t */
        public C1901c mo6891p(ParsingLoadable<HlsPlaylist> c0Var, long j, long j2, IOException iOException, int i) {
            C1901c cVar;
            ParsingLoadable<HlsPlaylist> c0Var2 = c0Var;
            IOException iOException2 = iOException;
            LoadEventInfo wVar = new LoadEventInfo(c0Var2.f12293a, c0Var2.f12294b, c0Var.mo14913f(), c0Var.mo14911d(), j, j2, c0Var.mo14910b());
            boolean z = iOException2 instanceof C1847a;
            if ((c0Var.mo14913f().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = Integer.MAX_VALUE;
                if (iOException2 instanceof C1931e) {
                    i2 = ((C1931e) iOException2).f12452c;
                }
                if (z || i2 == 400 || i2 == 503) {
                    this.f11766g = SystemClock.elapsedRealtime();
                    mo14676l();
                    ((C1084a) Util.m10293i(DefaultHlsPlaylistTracker.this.f11751h)).mo6864x(wVar, c0Var2.f12295c, iOException2, true);
                    return C1898b0.f12274c;
                }
            }
            C1896a aVar = new C1896a(wVar, new MediaLoadData(c0Var2.f12295c), iOException2, i);
            long c = DefaultHlsPlaylistTracker.this.f11747d.mo14891c(aVar);
            boolean z2 = c != -9223372036854775807L;
            boolean z3 = DefaultHlsPlaylistTracker.this.m14587J(this.f11760a, c) || !z2;
            if (z2) {
                z3 |= m14622e(c);
            }
            if (z3) {
                long b = DefaultHlsPlaylistTracker.this.f11747d.mo14890b(aVar);
                if (b != -9223372036854775807L) {
                    cVar = C1898b0.m14995g(false, b);
                } else {
                    cVar = C1898b0.f12275d;
                }
            } else {
                cVar = C1898b0.f12274c;
            }
            boolean z4 = !cVar.mo14903c();
            DefaultHlsPlaylistTracker.this.f11751h.mo6864x(wVar, c0Var2.f12295c, iOException2, z4);
            if (z4) {
                DefaultHlsPlaylistTracker.this.f11747d.mo14889a(c0Var2.f12293a);
            }
            return cVar;
        }

        /* renamed from: v */
        public void mo14681v() {
            this.f11761b.mo14900l();
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory jVar, LoadErrorHandlingPolicy a0Var, HlsPlaylistParserFactory jVar2) {
        this(jVar, a0Var, jVar2, 3.5d);
    }

    /* renamed from: A */
    private void m14578A(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.f11748e.put(uri, new C1838a(uri));
        }
    }

    /* renamed from: B */
    private static C1844d m14579B(HlsMediaPlaylist gVar, HlsMediaPlaylist gVar2) {
        int i = (int) (gVar2.f11799i - gVar.f11799i);
        List<C1844d> list = gVar.f11806p;
        if (i < list.size()) {
            return (C1844d) list.get(i);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public HlsMediaPlaylist m14580C(HlsMediaPlaylist gVar, HlsMediaPlaylist gVar2) {
        if (gVar2.mo14688f(gVar)) {
            return gVar2.mo14685c(m14582E(gVar, gVar2), m14581D(gVar, gVar2));
        }
        if (gVar2.f11803m) {
            gVar = gVar.mo14686d();
        }
        return gVar;
    }

    /* renamed from: D */
    private int m14581D(HlsMediaPlaylist gVar, HlsMediaPlaylist gVar2) {
        if (gVar2.f11797g) {
            return gVar2.f11798h;
        }
        HlsMediaPlaylist gVar3 = this.f11757n;
        int i = gVar3 != null ? gVar3.f11798h : 0;
        if (gVar == null) {
            return i;
        }
        C1844d B = m14579B(gVar, gVar2);
        return B != null ? (gVar.f11798h + B.f11821d) - ((C1844d) gVar2.f11806p.get(0)).f11821d : i;
    }

    /* renamed from: E */
    private long m14582E(HlsMediaPlaylist gVar, HlsMediaPlaylist gVar2) {
        if (gVar2.f11804n) {
            return gVar2.f11796f;
        }
        HlsMediaPlaylist gVar3 = this.f11757n;
        long j = gVar3 != null ? gVar3.f11796f : 0;
        if (gVar == null) {
            return j;
        }
        int size = gVar.f11806p.size();
        C1844d B = m14579B(gVar, gVar2);
        if (B != null) {
            return gVar.f11796f + B.f11822e;
        }
        return ((long) size) == gVar2.f11799i - gVar.f11799i ? gVar.mo14687e() : j;
    }

    /* renamed from: F */
    private Uri m14583F(Uri uri) {
        HlsMediaPlaylist gVar = this.f11757n;
        if (gVar == null || !gVar.f11810t.f11833e) {
            return uri;
        }
        C1843c cVar = (C1843c) gVar.f11808r.get(uri);
        if (cVar == null) {
            return uri;
        }
        Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f11814b));
        int i = cVar.f11815c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    /* renamed from: G */
    private boolean m14584G(Uri uri) {
        List<C1840b> list = this.f11755l.f11775f;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((C1840b) list.get(i)).f11788a)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public boolean m14585H() {
        List<C1840b> list = this.f11755l.f11775f;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C1838a aVar = (C1838a) Assertions.m10153e((C1838a) this.f11748e.get(((C1840b) list.get(i)).f11788a));
            if (elapsedRealtime > aVar.f11767h) {
                Uri c = aVar.f11760a;
                this.f11756m = c;
                aVar.m14626n(m14583F(c));
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    private void m14586I(Uri uri) {
        if (!uri.equals(this.f11756m) && m14584G(uri)) {
            HlsMediaPlaylist gVar = this.f11757n;
            if (gVar == null || !gVar.f11803m) {
                this.f11756m = uri;
                ((C1838a) this.f11748e.get(uri)).m14626n(m14583F(uri));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public boolean m14587J(Uri uri, long j) {
        boolean z = false;
        for (int i = 0; i < this.f11749f.size(); i++) {
            z |= !((C1850b) this.f11749f.get(i)).mo14605i(uri, j);
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m14588N(Uri uri, HlsMediaPlaylist gVar) {
        if (uri.equals(this.f11756m)) {
            if (this.f11757n == null) {
                this.f11758o = !gVar.f11803m;
                this.f11759p = gVar.f11796f;
            }
            this.f11757n = gVar;
            this.f11754k.mo14559k(gVar);
        }
        int size = this.f11749f.size();
        for (int i = 0; i < size; i++) {
            ((C1850b) this.f11749f.get(i)).mo14604h();
        }
    }

    /* renamed from: K */
    public void mo6889j(ParsingLoadable<HlsPlaylist> c0Var, long j, long j2, boolean z) {
        ParsingLoadable<HlsPlaylist> c0Var2 = c0Var;
        LoadEventInfo wVar = new LoadEventInfo(c0Var2.f12293a, c0Var2.f12294b, c0Var.mo14913f(), c0Var.mo14911d(), j, j2, c0Var.mo14910b());
        this.f11747d.mo14889a(c0Var2.f12293a);
        this.f11751h.mo6857q(wVar, 4);
    }

    /* renamed from: L */
    public void mo6892r(ParsingLoadable<HlsPlaylist> c0Var, long j, long j2) {
        HlsMasterPlaylist fVar;
        ParsingLoadable<HlsPlaylist> c0Var2 = c0Var;
        HlsPlaylist hVar = (HlsPlaylist) c0Var.mo14912e();
        boolean z = hVar instanceof HlsMediaPlaylist;
        if (z) {
            fVar = HlsMasterPlaylist.m14644e(hVar.f11834a);
        } else {
            fVar = (HlsMasterPlaylist) hVar;
        }
        this.f11755l = fVar;
        this.f11756m = ((C1840b) fVar.f11775f.get(0)).f11788a;
        m14578A(fVar.f11774e);
        LoadEventInfo wVar = new LoadEventInfo(c0Var2.f12293a, c0Var2.f12294b, c0Var.mo14913f(), c0Var.mo14911d(), j, j2, c0Var.mo14910b());
        C1838a aVar = (C1838a) this.f11748e.get(this.f11756m);
        if (z) {
            aVar.m14627u((HlsMediaPlaylist) hVar, wVar);
        } else {
            aVar.mo14676l();
        }
        this.f11747d.mo14889a(c0Var2.f12293a);
        this.f11751h.mo6860t(wVar, 4);
    }

    /* renamed from: M */
    public C1901c mo6891p(ParsingLoadable<HlsPlaylist> c0Var, long j, long j2, IOException iOException, int i) {
        ParsingLoadable<HlsPlaylist> c0Var2 = c0Var;
        IOException iOException2 = iOException;
        LoadEventInfo wVar = new LoadEventInfo(c0Var2.f12293a, c0Var2.f12294b, c0Var.mo14913f(), c0Var.mo14911d(), j, j2, c0Var.mo14910b());
        long b = this.f11747d.mo14890b(new C1896a(wVar, new MediaLoadData(c0Var2.f12295c), iOException2, i));
        boolean z = b == -9223372036854775807L;
        this.f11751h.mo6864x(wVar, c0Var2.f12295c, iOException2, z);
        if (z) {
            this.f11747d.mo14889a(c0Var2.f12293a);
        }
        if (z) {
            return C1898b0.f12275d;
        }
        return C1898b0.m14995g(false, b);
    }

    /* renamed from: a */
    public boolean mo14661a() {
        return this.f11758o;
    }

    /* renamed from: b */
    public HlsMasterPlaylist mo14662b() {
        return this.f11755l;
    }

    /* renamed from: c */
    public boolean mo14663c(Uri uri) {
        return ((C1838a) this.f11748e.get(uri)).mo14674h();
    }

    /* renamed from: d */
    public void mo14664d(Uri uri, C1084a aVar, C1853e eVar) {
        this.f11753j = Util.m10319v();
        this.f11751h = aVar;
        this.f11754k = eVar;
        ParsingLoadable c0Var = new ParsingLoadable(this.f11745b.mo14572a(4), uri, 4, this.f11746c.mo14657b());
        Assertions.m10154f(this.f11752i == null);
        C1898b0 b0Var = new C1898b0("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f11752i = b0Var;
        LoadEventInfo wVar = new LoadEventInfo(c0Var.f12293a, c0Var.f12294b, b0Var.mo14902n(c0Var, this, this.f11747d.mo14892d(c0Var.f12295c)));
        aVar.mo6866z(wVar, c0Var.f12295c);
    }

    /* renamed from: e */
    public void mo14665e() throws IOException {
        C1898b0 b0Var = this.f11752i;
        if (b0Var != null) {
            b0Var.mo14898j();
        }
        Uri uri = this.f11756m;
        if (uri != null) {
            mo14667g(uri);
        }
    }

    /* renamed from: f */
    public void mo14666f(C1850b bVar) {
        this.f11749f.remove(bVar);
    }

    /* renamed from: g */
    public void mo14667g(Uri uri) throws IOException {
        ((C1838a) this.f11748e.get(uri)).mo14677o();
    }

    /* renamed from: h */
    public void mo14668h(Uri uri) {
        ((C1838a) this.f11748e.get(uri)).mo14676l();
    }

    /* renamed from: i */
    public void mo14669i(C1850b bVar) {
        Assertions.m10153e(bVar);
        this.f11749f.add(bVar);
    }

    /* renamed from: k */
    public HlsMediaPlaylist mo14670k(Uri uri, boolean z) {
        HlsMediaPlaylist g = ((C1838a) this.f11748e.get(uri)).mo14673g();
        if (g != null && z) {
            m14586I(uri);
        }
        return g;
    }

    /* renamed from: l */
    public long mo14671l() {
        return this.f11759p;
    }

    public void stop() {
        this.f11756m = null;
        this.f11757n = null;
        this.f11755l = null;
        this.f11759p = -9223372036854775807L;
        this.f11752i.mo14900l();
        this.f11752i = null;
        for (C1838a v : this.f11748e.values()) {
            v.mo14681v();
        }
        this.f11753j.removeCallbacksAndMessages(null);
        this.f11753j = null;
        this.f11748e.clear();
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory jVar, LoadErrorHandlingPolicy a0Var, HlsPlaylistParserFactory jVar2, double d) {
        this.f11745b = jVar;
        this.f11746c = jVar2;
        this.f11747d = a0Var;
        this.f11750g = d;
        this.f11749f = new ArrayList();
        this.f11748e = new HashMap<>();
        this.f11759p = -9223372036854775807L;
    }
}
