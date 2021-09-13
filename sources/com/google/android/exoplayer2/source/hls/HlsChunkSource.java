package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1842b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1844d;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1845e;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DataSpec.C1919b;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p097j2.BehindLiveWindowException;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.p099t0.BaseMediaChunkIterator;
import p067c.p068a.p069a.p070a.p097j2.p099t0.Chunk;
import p067c.p068a.p069a.p070a.p097j2.p099t0.DataChunk;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunk;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunkIterator;
import p067c.p068a.p069a.p070a.p110l2.BaseTrackSelection;
import p067c.p068a.p069a.p070a.p110l2.C1174h;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.UriUtil;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.Iterables;
import p067c.p068a.p134b.p137c.Ints;

/* renamed from: com.google.android.exoplayer2.source.hls.i */
class HlsChunkSource {

    /* renamed from: a */
    private final HlsExtractorFactory f11576a;

    /* renamed from: b */
    private final C1916m f11577b;

    /* renamed from: c */
    private final C1916m f11578c;

    /* renamed from: d */
    private final TimestampAdjusterProvider f11579d;

    /* renamed from: e */
    private final Uri[] f11580e;

    /* renamed from: f */
    private final Format[] f11581f;

    /* renamed from: g */
    private final HlsPlaylistTracker f11582g;

    /* renamed from: h */
    private final TrackGroup f11583h;

    /* renamed from: i */
    private final List<Format> f11584i;

    /* renamed from: j */
    private final FullSegmentEncryptionKeyCache f11585j = new FullSegmentEncryptionKeyCache(4);

    /* renamed from: k */
    private boolean f11586k;

    /* renamed from: l */
    private byte[] f11587l = Util.f8403f;

    /* renamed from: m */
    private IOException f11588m;

    /* renamed from: n */
    private Uri f11589n;

    /* renamed from: o */
    private boolean f11590o;

    /* renamed from: p */
    private C1174h f11591p;

    /* renamed from: q */
    private long f11592q = -9223372036854775807L;

    /* renamed from: r */
    private boolean f11593r;

    /* renamed from: com.google.android.exoplayer2.source.hls.i$a */
    /* compiled from: HlsChunkSource */
    private static final class C1824a extends DataChunk {

        /* renamed from: l */
        private byte[] f11594l;

        public C1824a(C1916m mVar, DataSpec pVar, Format u0Var, int i, Object obj, byte[] bArr) {
            super(mVar, pVar, 3, u0Var, i, obj, bArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo7011g(byte[] bArr, int i) {
            this.f11594l = Arrays.copyOf(bArr, i);
        }

        /* renamed from: j */
        public byte[] mo14593j() {
            return this.f11594l;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.i$b */
    /* compiled from: HlsChunkSource */
    public static final class C1825b {

        /* renamed from: a */
        public Chunk f11595a;

        /* renamed from: b */
        public boolean f11596b;

        /* renamed from: c */
        public Uri f11597c;

        public C1825b() {
            mo14594a();
        }

        /* renamed from: a */
        public void mo14594a() {
            this.f11595a = null;
            this.f11596b = false;
            this.f11597c = null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.i$c */
    /* compiled from: HlsChunkSource */
    static final class C1826c extends BaseMediaChunkIterator {

        /* renamed from: e */
        private final List<C1845e> f11598e;

        /* renamed from: f */
        private final long f11599f;

        /* renamed from: g */
        private final String f11600g;

        public C1826c(String str, long j, List<C1845e> list) {
            super(0, (long) (list.size() - 1));
            this.f11600g = str;
            this.f11599f = j;
            this.f11598e = list;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.i$d */
    /* compiled from: HlsChunkSource */
    private static final class C1827d extends BaseTrackSelection {

        /* renamed from: g */
        private int f11601g;

        public C1827d(TrackGroup p0Var, int[] iArr) {
            super(p0Var, iArr);
            this.f11601g = mo7271t(p0Var.mo6977l(iArr[0]));
        }

        /* renamed from: i */
        public void mo7247i(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] eVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo7272u(this.f11601g, elapsedRealtime)) {
                for (int i = this.f8164b - 1; i >= 0; i--) {
                    if (!mo7272u(i, elapsedRealtime)) {
                        this.f11601g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: m */
        public int mo7248m() {
            return 0;
        }

        /* renamed from: n */
        public int mo7249n() {
            return this.f11601g;
        }

        /* renamed from: p */
        public Object mo7251p() {
            return null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.i$e */
    /* compiled from: HlsChunkSource */
    static final class C1828e {

        /* renamed from: a */
        public final C1845e f11602a;

        /* renamed from: b */
        public final long f11603b;

        /* renamed from: c */
        public final int f11604c;

        /* renamed from: d */
        public final boolean f11605d;

        public C1828e(C1845e eVar, long j, int i) {
            this.f11602a = eVar;
            this.f11603b = j;
            this.f11604c = i;
            this.f11605d = (eVar instanceof C1842b) && ((C1842b) eVar).f11812m;
        }
    }

    public HlsChunkSource(HlsExtractorFactory kVar, HlsPlaylistTracker kVar2, Uri[] uriArr, Format[] u0VarArr, HlsDataSourceFactory jVar, TransferListener e0Var, TimestampAdjusterProvider tVar, List<Format> list) {
        this.f11576a = kVar;
        this.f11582g = kVar2;
        this.f11580e = uriArr;
        this.f11581f = u0VarArr;
        this.f11579d = tVar;
        this.f11584i = list;
        C1916m a = jVar.mo14572a(1);
        this.f11577b = a;
        if (e0Var != null) {
            a.mo7017k(e0Var);
        }
        this.f11578c = jVar.mo14572a(3);
        this.f11583h = new TrackGroup(u0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((u0VarArr[i].f8807e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f11591p = new C1827d(this.f11583h, Ints.m12042i(arrayList));
    }

    /* renamed from: c */
    private static Uri m14394c(HlsMediaPlaylist gVar, C1845e eVar) {
        if (eVar != null) {
            String str = eVar.f11824g;
            if (str != null) {
                return UriUtil.m10226d(gVar.f11834a, str);
            }
        }
        return null;
    }

    /* renamed from: e */
    private Pair<Long, Integer> m14395e(HlsMediaChunk mVar, boolean z, HlsMediaPlaylist gVar, long j, long j2) {
        List<C1842b> list;
        Pair<Long, Integer> pair;
        long j3;
        int i = -1;
        if (mVar == null || z) {
            long j4 = gVar.f11809s + j;
            if (mVar != null && !this.f11590o) {
                j2 = mVar.f7645g;
            }
            if (!gVar.f11803m && j2 >= j4) {
                return new Pair<>(Long.valueOf(gVar.f11799i + ((long) gVar.f11806p.size())), Integer.valueOf(-1));
            }
            long j5 = j2 - j;
            int i2 = 0;
            int f = Util.m10287f(gVar.f11806p, Long.valueOf(j5), true, !this.f11582g.mo14661a() || mVar == null);
            long j6 = ((long) f) + gVar.f11799i;
            if (f >= 0) {
                C1844d dVar = (C1844d) gVar.f11806p.get(f);
                if (j5 < dVar.f11822e + dVar.f11820c) {
                    list = dVar.f11817m;
                } else {
                    list = gVar.f11807q;
                }
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    C1842b bVar = (C1842b) list.get(i2);
                    if (j5 >= bVar.f11822e + bVar.f11820c) {
                        i2++;
                    } else if (bVar.f11811l) {
                        j6 += list == gVar.f11807q ? 1 : 0;
                        i = i2;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j6), Integer.valueOf(i));
        }
        if (mVar.mo14598p()) {
            if (mVar.f11626p == -1) {
                j3 = mVar.mo7013g();
            } else {
                j3 = mVar.f7650j;
            }
            Long valueOf = Long.valueOf(j3);
            int i3 = mVar.f11626p;
            if (i3 != -1) {
                i = i3 + 1;
            }
            pair = new Pair<>(valueOf, Integer.valueOf(i));
        } else {
            pair = new Pair<>(Long.valueOf(mVar.f7650j), Integer.valueOf(mVar.f11626p));
        }
        return pair;
    }

    /* renamed from: f */
    private static C1828e m14396f(HlsMediaPlaylist gVar, long j, int i) {
        int i2 = (int) (j - gVar.f11799i);
        C1828e eVar = null;
        if (i2 == gVar.f11806p.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < gVar.f11807q.size()) {
                eVar = new C1828e((C1845e) gVar.f11807q.get(i), j, i);
            }
            return eVar;
        }
        C1844d dVar = (C1844d) gVar.f11806p.get(i2);
        if (i == -1) {
            return new C1828e(dVar, j, -1);
        }
        if (i < dVar.f11817m.size()) {
            return new C1828e((C1845e) dVar.f11817m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < gVar.f11806p.size()) {
            return new C1828e((C1845e) gVar.f11806p.get(i3), j + 1, -1);
        }
        if (!gVar.f11807q.isEmpty()) {
            return new C1828e((C1845e) gVar.f11807q.get(0), j + 1, 0);
        }
        return null;
    }

    /* renamed from: h */
    static List<C1845e> m14397h(HlsMediaPlaylist gVar, long j, int i) {
        int i2 = (int) (j - gVar.f11799i);
        if (i2 < 0 || gVar.f11806p.size() < i2) {
            return ImmutableList.m11917p();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (i2 < gVar.f11806p.size()) {
            if (i != -1) {
                C1844d dVar = (C1844d) gVar.f11806p.get(i2);
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i < dVar.f11817m.size()) {
                    List<C1842b> list = dVar.f11817m;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List<C1844d> list2 = gVar.f11806p;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (gVar.f11802l != -9223372036854775807L) {
            if (i != -1) {
                i3 = i;
            }
            if (i3 < gVar.f11807q.size()) {
                List<C1842b> list3 = gVar.f11807q;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: k */
    private Chunk m14398k(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] c = this.f11585j.mo14577c(uri);
        if (c != null) {
            this.f11585j.mo14576b(uri, c);
            return null;
        }
        C1824a aVar = new C1824a(this.f11578c, new C1919b().mo14959i(uri).mo14952b(1).mo14951a(), this.f11581f[i], this.f11591p.mo7248m(), this.f11591p.mo7251p(), this.f11587l);
        return aVar;
    }

    /* renamed from: q */
    private long m14399q(long j) {
        long j2 = this.f11592q;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: u */
    private void m14400u(HlsMediaPlaylist gVar) {
        long j;
        if (gVar.f11803m) {
            j = -9223372036854775807L;
        } else {
            j = gVar.mo14687e() - this.f11582g.mo14671l();
        }
        this.f11592q = j;
    }

    /* renamed from: a */
    public MediaChunkIterator[] mo14579a(HlsMediaChunk mVar, long j) {
        int i;
        HlsMediaChunk mVar2 = mVar;
        int m = mVar2 == null ? -1 : this.f11583h.mo6978m(mVar2.f7642d);
        int length = this.f11591p.length();
        MediaChunkIterator[] eVarArr = new MediaChunkIterator[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int g = this.f11591p.mo7262g(i2);
            Uri uri = this.f11580e[g];
            if (!this.f11582g.mo14663c(uri)) {
                eVarArr[i2] = MediaChunkIterator.f7651a;
                i = i2;
            } else {
                HlsMediaPlaylist k = this.f11582g.mo14670k(uri, z);
                Assertions.m10153e(k);
                long l = k.f11796f - this.f11582g.mo14671l();
                i = i2;
                long j2 = l;
                Pair e = m14395e(mVar, g != m, k, l, j);
                eVarArr[i] = new C1826c(k.f11834a, j2, m14397h(k, ((Long) e.first).longValue(), ((Integer) e.second).intValue()));
            }
            i2 = i + 1;
            z = false;
        }
        return eVarArr;
    }

    /* renamed from: b */
    public int mo14580b(HlsMediaChunk mVar) {
        List<C1842b> list;
        int i = 1;
        if (mVar.f11626p == -1) {
            return 1;
        }
        HlsMediaPlaylist gVar = (HlsMediaPlaylist) Assertions.m10153e(this.f11582g.mo14670k(this.f11580e[this.f11583h.mo6978m(mVar.f7642d)], false));
        int i2 = (int) (mVar.f7650j - gVar.f11799i);
        if (i2 < 0) {
            return 1;
        }
        if (i2 < gVar.f11806p.size()) {
            list = ((C1844d) gVar.f11806p.get(i2)).f11817m;
        } else {
            list = gVar.f11807q;
        }
        if (mVar.f11626p >= list.size()) {
            return 2;
        }
        C1842b bVar = (C1842b) list.get(mVar.f11626p);
        if (bVar.f11812m) {
            return 0;
        }
        if (!Util.m10279b(Uri.parse(UriUtil.m10225c(gVar.f11834a, bVar.f11818a)), mVar.f7640b.f12345a)) {
            i = 2;
        }
        return i;
    }

    /* renamed from: d */
    public void mo14581d(long j, long j2, List<HlsMediaChunk> list, boolean z, C1825b bVar) {
        int i;
        long j3;
        Uri uri;
        long j4 = j2;
        C1825b bVar2 = bVar;
        HlsMediaChunk mVar = list.isEmpty() ? null : (HlsMediaChunk) Iterables.m12008c(list);
        if (mVar == null) {
            i = -1;
        } else {
            i = this.f11583h.mo6978m(mVar.f7642d);
        }
        long j5 = j4 - j;
        long q = m14399q(j);
        if (mVar != null && !this.f11590o) {
            long d = mVar.mo7008d();
            j5 = Math.max(0, j5 - d);
            if (q != -9223372036854775807L) {
                q = Math.max(0, q - d);
            }
        }
        this.f11591p.mo7247i(j, j5, q, list, mo14579a(mVar, j4));
        int j6 = this.f11591p.mo7264j();
        boolean z2 = i != j6;
        Uri uri2 = this.f11580e[j6];
        if (!this.f11582g.mo14663c(uri2)) {
            bVar2.f11597c = uri2;
            this.f11593r &= uri2.equals(this.f11589n);
            this.f11589n = uri2;
            return;
        }
        HlsMediaPlaylist k = this.f11582g.mo14670k(uri2, true);
        Assertions.m10153e(k);
        this.f11590o = k.f11836c;
        m14400u(k);
        long l = k.f11796f - this.f11582g.mo14671l();
        HlsMediaPlaylist gVar = k;
        Uri uri3 = uri2;
        int i2 = j6;
        Pair e = m14395e(mVar, z2, k, l, j2);
        long longValue = ((Long) e.first).longValue();
        int intValue = ((Integer) e.second).intValue();
        if (longValue >= k.f11799i || mVar == null || !z2) {
            j3 = l;
            uri = uri3;
            i = i2;
        } else {
            Uri uri4 = this.f11580e[i];
            HlsMediaPlaylist k2 = this.f11582g.mo14670k(uri4, true);
            Assertions.m10153e(k2);
            j3 = k2.f11796f - this.f11582g.mo14671l();
            Uri uri5 = uri4;
            HlsMediaPlaylist gVar2 = k2;
            Pair e2 = m14395e(mVar, false, k2, j3, j2);
            longValue = ((Long) e2.first).longValue();
            intValue = ((Integer) e2.second).intValue();
            uri = uri5;
            k = gVar2;
        }
        if (longValue < k.f11799i) {
            this.f11588m = new BehindLiveWindowException();
            return;
        }
        C1828e f = m14396f(k, longValue, intValue);
        if (f == null) {
            if (!k.f11803m) {
                bVar2.f11597c = uri;
                this.f11593r &= uri.equals(this.f11589n);
                this.f11589n = uri;
                return;
            } else if (z || k.f11806p.isEmpty()) {
                bVar2.f11596b = true;
                return;
            } else {
                f = new C1828e((C1845e) Iterables.m12008c(k.f11806p), (k.f11799i + ((long) k.f11806p.size())) - 1, -1);
            }
        }
        this.f11593r = false;
        this.f11589n = null;
        Uri c = m14394c(k, f.f11602a.f11819b);
        Chunk k3 = m14398k(c, i);
        bVar2.f11595a = k3;
        if (k3 == null) {
            Uri c2 = m14394c(k, f.f11602a);
            Chunk k4 = m14398k(c2, i);
            bVar2.f11595a = k4;
            if (k4 == null) {
                bVar2.f11595a = HlsMediaChunk.m14425i(this.f11576a, this.f11577b, this.f11581f[i], j3, k, f, uri, this.f11584i, this.f11591p.mo7248m(), this.f11591p.mo7251p(), this.f11586k, this.f11579d, mVar, this.f11585j.mo14575a(c2), this.f11585j.mo14575a(c));
            }
        }
    }

    /* renamed from: g */
    public int mo14582g(long j, List<? extends MediaChunk> list) {
        if (this.f11588m != null || this.f11591p.length() < 2) {
            return list.size();
        }
        return this.f11591p.mo7246h(j, list);
    }

    /* renamed from: i */
    public TrackGroup mo14583i() {
        return this.f11583h;
    }

    /* renamed from: j */
    public C1174h mo14584j() {
        return this.f11591p;
    }

    /* renamed from: l */
    public boolean mo14585l(Chunk bVar, long j) {
        C1174h hVar = this.f11591p;
        return hVar.mo7257a(hVar.mo7270s(this.f11583h.mo6978m(bVar.f7642d)), j);
    }

    /* renamed from: m */
    public void mo14586m() throws IOException {
        IOException iOException = this.f11588m;
        if (iOException == null) {
            Uri uri = this.f11589n;
            if (uri != null && this.f11593r) {
                this.f11582g.mo14667g(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: n */
    public void mo14587n(Chunk bVar) {
        if (bVar instanceof C1824a) {
            C1824a aVar = (C1824a) bVar;
            this.f11587l = aVar.mo7012h();
            this.f11585j.mo14576b(aVar.f7640b.f12345a, (byte[]) Assertions.m10153e(aVar.mo14593j()));
        }
    }

    /* renamed from: o */
    public boolean mo14588o(Uri uri, long j) {
        boolean z = false;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f11580e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            } else if (uriArr[i].equals(uri)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return true;
        }
        int s = this.f11591p.mo7270s(i);
        if (s == -1) {
            return true;
        }
        this.f11593r = uri.equals(this.f11589n) | this.f11593r;
        if (j == -9223372036854775807L || this.f11591p.mo7257a(s, j)) {
            z = true;
        }
        return z;
    }

    /* renamed from: p */
    public void mo14589p() {
        this.f11588m = null;
    }

    /* renamed from: r */
    public void mo14590r(boolean z) {
        this.f11586k = z;
    }

    /* renamed from: s */
    public void mo14591s(C1174h hVar) {
        this.f11591p = hVar;
    }

    /* renamed from: t */
    public boolean mo14592t(long j, Chunk bVar, List<? extends MediaChunk> list) {
        if (this.f11588m != null) {
            return false;
        }
        return this.f11591p.mo7258b(j, bVar, list);
    }
}
