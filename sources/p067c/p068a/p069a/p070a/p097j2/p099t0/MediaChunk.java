package p067c.p068a.p069a.p070a.p097j2.p099t0;

import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.DataSpec;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.j2.t0.d */
public abstract class MediaChunk extends Chunk {

    /* renamed from: j */
    public final long f7650j;

    public MediaChunk(C1916m mVar, DataSpec pVar, Format u0Var, int i, Object obj, long j, long j2, long j3) {
        super(mVar, pVar, 1, u0Var, i, obj, j, j2);
        Assertions.m10153e(u0Var);
        this.f7650j = j3;
    }

    /* renamed from: g */
    public long mo7013g() {
        long j = this.f7650j;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }
}
