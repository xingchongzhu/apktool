package p067c.p068a.p069a.p070a.p100k2.p109v;

import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.k2.v.e */
final class Mp4WebvttSubtitle implements Subtitle {

    /* renamed from: a */
    private final List<Cue> f8061a;

    public Mp4WebvttSubtitle(List<Cue> list) {
        this.f8061a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public int mo7060a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: b */
    public long mo7061b(int i) {
        Assertions.m10149a(i == 0);
        return 0;
    }

    /* renamed from: c */
    public List<Cue> mo7062c(long j) {
        return j >= 0 ? this.f8061a : Collections.emptyList();
    }

    /* renamed from: d */
    public int mo7063d() {
        return 1;
    }
}
