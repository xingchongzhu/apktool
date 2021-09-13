package p067c.p068a.p069a.p070a.p110l2;

import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.p099t0.Chunk;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunk;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunkIterator;

/* renamed from: c.a.a.a.l2.h */
/* compiled from: ExoTrackSelection */
public interface C1174h extends TrackSelection {

    /* renamed from: c.a.a.a.l2.h$a */
    /* compiled from: ExoTrackSelection */
    public static final class C1175a {

        /* renamed from: a */
        public final TrackGroup f8270a;

        /* renamed from: b */
        public final int[] f8271b;

        /* renamed from: c */
        public final int f8272c;

        /* renamed from: d */
        public final Object f8273d;

        public C1175a(TrackGroup p0Var, int... iArr) {
            this(p0Var, iArr, 0, null);
        }

        public C1175a(TrackGroup p0Var, int[] iArr, int i, Object obj) {
            this.f8270a = p0Var;
            this.f8271b = iArr;
            this.f8272c = i;
            this.f8273d = obj;
        }
    }

    /* renamed from: c.a.a.a.l2.h$b */
    /* compiled from: ExoTrackSelection */
    public interface C1176b {
        /* renamed from: a */
        C1174h[] mo7255a(C1175a[] aVarArr, BandwidthMeter gVar, C1081a aVar, Timeline x1Var);
    }

    /* renamed from: a */
    boolean mo7257a(int i, long j);

    /* renamed from: b */
    boolean mo7258b(long j, Chunk bVar, List<? extends MediaChunk> list);

    /* renamed from: c */
    void mo7259c(boolean z);

    /* renamed from: d */
    void mo7244d();

    /* renamed from: f */
    void mo7245f();

    /* renamed from: h */
    int mo7246h(long j, List<? extends MediaChunk> list);

    /* renamed from: i */
    void mo7247i(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] eVarArr);

    /* renamed from: j */
    int mo7264j();

    /* renamed from: l */
    Format mo7266l();

    /* renamed from: m */
    int mo7248m();

    /* renamed from: n */
    int mo7249n();

    /* renamed from: o */
    void mo7250o(float f);

    /* renamed from: p */
    Object mo7251p();

    /* renamed from: q */
    void mo7268q();

    /* renamed from: r */
    void mo7269r();
}
