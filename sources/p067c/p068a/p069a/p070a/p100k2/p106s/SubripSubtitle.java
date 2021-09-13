package p067c.p068a.p069a.p070a.p100k2.p106s;

import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.s.b */
final class SubripSubtitle implements Subtitle {

    /* renamed from: a */
    private final Cue[] f7973a;

    /* renamed from: b */
    private final long[] f7974b;

    public SubripSubtitle(Cue[] cVarArr, long[] jArr) {
        this.f7973a = cVarArr;
        this.f7974b = jArr;
    }

    /* renamed from: a */
    public int mo7060a(long j) {
        int d = Util.m10283d(this.f7974b, j, false, false);
        if (d < this.f7974b.length) {
            return d;
        }
        return -1;
    }

    /* renamed from: b */
    public long mo7061b(int i) {
        boolean z = true;
        Assertions.m10149a(i >= 0);
        if (i >= this.f7974b.length) {
            z = false;
        }
        Assertions.m10149a(z);
        return this.f7974b[i];
    }

    /* renamed from: c */
    public List<Cue> mo7062c(long j) {
        int h = Util.m10291h(this.f7974b, j, true, false);
        if (h != -1) {
            Cue[] cVarArr = this.f7973a;
            if (cVarArr[h] != Cue.f7707a) {
                return Collections.singletonList(cVarArr[h]);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: d */
    public int mo7063d() {
        return this.f7974b.length;
    }
}
