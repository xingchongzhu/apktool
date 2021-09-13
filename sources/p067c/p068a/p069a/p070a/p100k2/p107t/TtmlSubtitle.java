package p067c.p068a.p069a.p070a.p100k2.p107t;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.t.h */
final class TtmlSubtitle implements Subtitle {

    /* renamed from: a */
    private final TtmlNode f8041a;

    /* renamed from: b */
    private final long[] f8042b;

    /* renamed from: c */
    private final Map<String, TtmlStyle> f8043c;

    /* renamed from: d */
    private final Map<String, TtmlRegion> f8044d;

    /* renamed from: e */
    private final Map<String, String> f8045e;

    public TtmlSubtitle(TtmlNode dVar, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        this.f8041a = dVar;
        this.f8044d = map2;
        this.f8045e = map3;
        this.f8043c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f8042b = dVar.mo7116j();
    }

    /* renamed from: a */
    public int mo7060a(long j) {
        int d = Util.m10283d(this.f8042b, j, false, false);
        if (d < this.f8042b.length) {
            return d;
        }
        return -1;
    }

    /* renamed from: b */
    public long mo7061b(int i) {
        return this.f8042b[i];
    }

    /* renamed from: c */
    public List<Cue> mo7062c(long j) {
        return this.f8041a.mo7115h(j, this.f8043c, this.f8044d, this.f8045e);
    }

    /* renamed from: d */
    public int mo7063d() {
        return this.f8042b.length;
    }
}
