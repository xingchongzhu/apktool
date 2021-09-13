package p067c.p068a.p069a.p070a.p110l2;

import java.util.List;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunk;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunkIterator;

/* renamed from: c.a.a.a.l2.i */
public final class FixedTrackSelection extends BaseTrackSelection {

    /* renamed from: g */
    private final int f8274g;

    /* renamed from: h */
    private final Object f8275h;

    public FixedTrackSelection(TrackGroup p0Var, int i, int i2, Object obj) {
        super(p0Var, i);
        this.f8274g = i2;
        this.f8275h = obj;
    }

    /* renamed from: i */
    public void mo7247i(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] eVarArr) {
    }

    /* renamed from: m */
    public int mo7248m() {
        return this.f8274g;
    }

    /* renamed from: n */
    public int mo7249n() {
        return 0;
    }

    /* renamed from: p */
    public Object mo7251p() {
        return this.f8275h;
    }
}
