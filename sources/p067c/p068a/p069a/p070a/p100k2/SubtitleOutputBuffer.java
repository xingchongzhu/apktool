package p067c.p068a.p069a.p070a.p100k2;

import java.util.List;
import p067c.p068a.p069a.p070a.p073c2.OutputBuffer;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.k2.k */
public abstract class SubtitleOutputBuffer extends OutputBuffer implements Subtitle {

    /* renamed from: d */
    private Subtitle f7744d;

    /* renamed from: e */
    private long f7745e;

    /* renamed from: a */
    public int mo7060a(long j) {
        return ((Subtitle) Assertions.m10153e(this.f7744d)).mo7060a(j - this.f7745e);
    }

    /* renamed from: b */
    public long mo7061b(int i) {
        return ((Subtitle) Assertions.m10153e(this.f7744d)).mo7061b(i) + this.f7745e;
    }

    /* renamed from: c */
    public List<Cue> mo7062c(long j) {
        return ((Subtitle) Assertions.m10153e(this.f7744d)).mo7062c(j - this.f7745e);
    }

    /* renamed from: d */
    public int mo7063d() {
        return ((Subtitle) Assertions.m10153e(this.f7744d)).mo7063d();
    }

    /* renamed from: f */
    public void mo5947f() {
        super.mo5947f();
        this.f7744d = null;
    }

    /* renamed from: o */
    public void mo7066o(long j, Subtitle fVar, long j2) {
        this.f5757b = j;
        this.f7744d = fVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f7745e = j;
    }
}
