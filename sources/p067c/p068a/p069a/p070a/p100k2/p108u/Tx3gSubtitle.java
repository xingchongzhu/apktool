package p067c.p068a.p069a.p070a.p100k2.p108u;

import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.k2.u.b */
final class Tx3gSubtitle implements Subtitle {

    /* renamed from: a */
    public static final Tx3gSubtitle f8053a = new Tx3gSubtitle();

    /* renamed from: b */
    private final List<Cue> f8054b;

    public Tx3gSubtitle(Cue cVar) {
        this.f8054b = Collections.singletonList(cVar);
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
        return j >= 0 ? this.f8054b : Collections.emptyList();
    }

    /* renamed from: d */
    public int mo7063d() {
        return 1;
    }

    private Tx3gSubtitle() {
        this.f8054b = Collections.emptyList();
    }
}
