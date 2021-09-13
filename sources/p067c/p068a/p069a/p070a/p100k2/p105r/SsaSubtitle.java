package p067c.p068a.p069a.p070a.p100k2.p105r;

import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.r.d */
final class SsaSubtitle implements Subtitle {

    /* renamed from: a */
    private final List<List<Cue>> f7967a;

    /* renamed from: b */
    private final List<Long> f7968b;

    public SsaSubtitle(List<List<Cue>> list, List<Long> list2) {
        this.f7967a = list;
        this.f7968b = list2;
    }

    /* renamed from: a */
    public int mo7060a(long j) {
        int c = Util.m10281c(this.f7968b, Long.valueOf(j), false, false);
        if (c < this.f7968b.size()) {
            return c;
        }
        return -1;
    }

    /* renamed from: b */
    public long mo7061b(int i) {
        boolean z = true;
        Assertions.m10149a(i >= 0);
        if (i >= this.f7968b.size()) {
            z = false;
        }
        Assertions.m10149a(z);
        return ((Long) this.f7968b.get(i)).longValue();
    }

    /* renamed from: c */
    public List<Cue> mo7062c(long j) {
        int f = Util.m10287f(this.f7968b, Long.valueOf(j), true, false);
        if (f == -1) {
            return Collections.emptyList();
        }
        return (List) this.f7967a.get(f);
    }

    /* renamed from: d */
    public int mo7063d() {
        return this.f7968b.size();
    }
}
