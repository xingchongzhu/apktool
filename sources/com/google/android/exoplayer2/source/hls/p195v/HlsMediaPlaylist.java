package com.google.android.exoplayer2.source.hls.p195v;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p096i2.StreamKey;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableMap;
import p067c.p068a.p134b.p136b.Iterables;

/* renamed from: com.google.android.exoplayer2.source.hls.v.g */
public final class HlsMediaPlaylist extends HlsPlaylist {

    /* renamed from: d */
    public final int f11794d;

    /* renamed from: e */
    public final long f11795e;

    /* renamed from: f */
    public final long f11796f;

    /* renamed from: g */
    public final boolean f11797g;

    /* renamed from: h */
    public final int f11798h;

    /* renamed from: i */
    public final long f11799i;

    /* renamed from: j */
    public final int f11800j;

    /* renamed from: k */
    public final long f11801k;

    /* renamed from: l */
    public final long f11802l;

    /* renamed from: m */
    public final boolean f11803m;

    /* renamed from: n */
    public final boolean f11804n;

    /* renamed from: o */
    public final DrmInitData f11805o;

    /* renamed from: p */
    public final List<C1844d> f11806p;

    /* renamed from: q */
    public final List<C1842b> f11807q;

    /* renamed from: r */
    public final Map<Uri, C1843c> f11808r;

    /* renamed from: s */
    public final long f11809s;

    /* renamed from: t */
    public final C1846f f11810t;

    /* renamed from: com.google.android.exoplayer2.source.hls.v.g$b */
    /* compiled from: HlsMediaPlaylist */
    public static final class C1842b extends C1845e {

        /* renamed from: l */
        public final boolean f11811l;

        /* renamed from: m */
        public final boolean f11812m;

        public C1842b(String str, C1844d dVar, long j, int i, long j2, DrmInitData tVar, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j, i, j2, tVar, str2, str3, j3, j4, z);
            this.f11811l = z2;
            this.f11812m = z3;
        }

        /* renamed from: b */
        public C1842b mo14689b(long j, int i) {
            int i2 = i;
            C1842b bVar = new C1842b(this.f11818a, this.f11819b, this.f11820c, i2, j, this.f11823f, this.f11824g, this.f11825h, this.f11826i, this.f11827j, this.f11828k, this.f11811l, this.f11812m);
            return bVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.g$c */
    /* compiled from: HlsMediaPlaylist */
    public static final class C1843c {

        /* renamed from: a */
        public final Uri f11813a;

        /* renamed from: b */
        public final long f11814b;

        /* renamed from: c */
        public final int f11815c;

        public C1843c(Uri uri, long j, int i) {
            this.f11813a = uri;
            this.f11814b = j;
            this.f11815c = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.g$d */
    /* compiled from: HlsMediaPlaylist */
    public static final class C1844d extends C1845e {

        /* renamed from: l */
        public final String f11816l;

        /* renamed from: m */
        public final List<C1842b> f11817m;

        public C1844d(String str, long j, long j2, String str2, String str3) {
            String str4 = "";
            this(str, null, str4, 0, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.m11917p());
        }

        /* renamed from: b */
        public C1844d mo14690b(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.f11817m.size(); i2++) {
                C1842b bVar = (C1842b) this.f11817m.get(i2);
                arrayList.add(bVar.mo14689b(j2, i));
                j2 += bVar.f11820c;
            }
            int i3 = i;
            ArrayList arrayList2 = arrayList;
            long j3 = j;
            C1844d dVar = new C1844d(this.f11818a, this.f11819b, this.f11816l, this.f11820c, i, j3, this.f11823f, this.f11824g, this.f11825h, this.f11826i, this.f11827j, this.f11828k, arrayList2);
            return dVar;
        }

        public C1844d(String str, C1844d dVar, String str2, long j, int i, long j2, DrmInitData tVar, String str3, String str4, long j3, long j4, boolean z, List<C1842b> list) {
            super(str, dVar, j, i, j2, tVar, str3, str4, j3, j4, z);
            this.f11816l = str2;
            this.f11817m = ImmutableList.m11916m(list);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.g$e */
    /* compiled from: HlsMediaPlaylist */
    public static class C1845e implements Comparable<Long> {

        /* renamed from: a */
        public final String f11818a;

        /* renamed from: b */
        public final C1844d f11819b;

        /* renamed from: c */
        public final long f11820c;

        /* renamed from: d */
        public final int f11821d;

        /* renamed from: e */
        public final long f11822e;

        /* renamed from: f */
        public final DrmInitData f11823f;

        /* renamed from: g */
        public final String f11824g;

        /* renamed from: h */
        public final String f11825h;

        /* renamed from: i */
        public final long f11826i;

        /* renamed from: j */
        public final long f11827j;

        /* renamed from: k */
        public final boolean f11828k;

        /* renamed from: a */
        public int compareTo(Long l) {
            if (this.f11822e > l.longValue()) {
                return 1;
            }
            return this.f11822e < l.longValue() ? -1 : 0;
        }

        private C1845e(String str, C1844d dVar, long j, int i, long j2, DrmInitData tVar, String str2, String str3, long j3, long j4, boolean z) {
            this.f11818a = str;
            this.f11819b = dVar;
            this.f11820c = j;
            this.f11821d = i;
            this.f11822e = j2;
            this.f11823f = tVar;
            this.f11824g = str2;
            this.f11825h = str3;
            this.f11826i = j3;
            this.f11827j = j4;
            this.f11828k = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.g$f */
    /* compiled from: HlsMediaPlaylist */
    public static final class C1846f {

        /* renamed from: a */
        public final long f11829a;

        /* renamed from: b */
        public final boolean f11830b;

        /* renamed from: c */
        public final long f11831c;

        /* renamed from: d */
        public final long f11832d;

        /* renamed from: e */
        public final boolean f11833e;

        public C1846f(long j, boolean z, long j2, long j3, boolean z2) {
            this.f11829a = j;
            this.f11830b = z;
            this.f11831c = j2;
            this.f11832d = j3;
            this.f11833e = z2;
        }
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, long j5, boolean z2, boolean z3, boolean z4, DrmInitData tVar, List<C1844d> list2, List<C1842b> list3, C1846f fVar, Map<Uri, C1843c> map) {
        String str2 = str;
        List<String> list4 = list;
        super(str, list, z2);
        this.f11794d = i;
        this.f11796f = j2;
        this.f11797g = z;
        this.f11798h = i2;
        this.f11799i = j3;
        this.f11800j = i3;
        this.f11801k = j4;
        this.f11802l = j5;
        this.f11803m = z3;
        this.f11804n = z4;
        this.f11805o = tVar;
        this.f11806p = ImmutableList.m11916m(list2);
        this.f11807q = ImmutableList.m11916m(list3);
        this.f11808r = ImmutableMap.m11962c(map);
        if (!list3.isEmpty()) {
            C1842b bVar = (C1842b) Iterables.m12008c(list3);
            this.f11809s = bVar.f11822e + bVar.f11820c;
        } else if (!list2.isEmpty()) {
            C1844d dVar = (C1844d) Iterables.m12008c(list2);
            this.f11809s = dVar.f11822e + dVar.f11820c;
        } else {
            this.f11809s = 0;
        }
        long j6 = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.f11809s + j;
        this.f11795e = j6;
        this.f11810t = fVar;
    }

    /* renamed from: b */
    public HlsMediaPlaylist mo6780a(List<StreamKey> list) {
        return this;
    }

    /* renamed from: c */
    public HlsMediaPlaylist mo14685c(long j, int i) {
        long j2 = j;
        int i2 = i;
        HlsMediaPlaylist gVar = new HlsMediaPlaylist(this.f11794d, this.f11834a, this.f11835b, this.f11795e, j2, true, i2, this.f11799i, this.f11800j, this.f11801k, this.f11802l, this.f11836c, this.f11803m, this.f11804n, this.f11805o, this.f11806p, this.f11807q, this.f11810t, this.f11808r);
        return gVar;
    }

    /* renamed from: d */
    public HlsMediaPlaylist mo14686d() {
        if (this.f11803m) {
            return this;
        }
        HlsMediaPlaylist gVar = r2;
        HlsMediaPlaylist gVar2 = new HlsMediaPlaylist(this.f11794d, this.f11834a, this.f11835b, this.f11795e, this.f11796f, this.f11797g, this.f11798h, this.f11799i, this.f11800j, this.f11801k, this.f11802l, this.f11836c, true, this.f11804n, this.f11805o, this.f11806p, this.f11807q, this.f11810t, this.f11808r);
        return gVar;
    }

    /* renamed from: e */
    public long mo14687e() {
        return this.f11796f + this.f11809s;
    }

    /* renamed from: f */
    public boolean mo14688f(HlsMediaPlaylist gVar) {
        boolean z = true;
        if (gVar != null) {
            long j = this.f11799i;
            long j2 = gVar.f11799i;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.f11806p.size() - gVar.f11806p.size();
                if (size != 0) {
                    if (size <= 0) {
                        z = false;
                    }
                    return z;
                }
                int size2 = this.f11807q.size();
                int size3 = gVar.f11807q.size();
                if (size2 <= size3 && (size2 != size3 || !this.f11803m || gVar.f11803m)) {
                    z = false;
                }
            }
        }
        return z;
    }
}
