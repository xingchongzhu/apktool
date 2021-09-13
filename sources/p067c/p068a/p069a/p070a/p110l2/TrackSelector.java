package p067c.p068a.p069a.p070a.p110l2;

import com.google.android.exoplayer2.upstream.BandwidthMeter;
import p067c.p068a.p069a.p070a.C1240r1;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.l2.n */
public abstract class TrackSelector {

    /* renamed from: a */
    private C1180a f8301a;

    /* renamed from: b */
    private BandwidthMeter f8302b;

    /* renamed from: c.a.a.a.l2.n$a */
    /* compiled from: TrackSelector */
    public interface C1180a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final BandwidthMeter mo7328a() {
        return (BandwidthMeter) Assertions.m10153e(this.f8302b);
    }

    /* renamed from: b */
    public final void mo7329b(C1180a aVar, BandwidthMeter gVar) {
        this.f8301a = aVar;
        this.f8302b = gVar;
    }

    /* renamed from: c */
    public abstract void mo7313c(Object obj);

    /* renamed from: d */
    public abstract TrackSelectorResult mo7314d(C1240r1[] r1VarArr, TrackGroupArray q0Var, C1081a aVar, Timeline x1Var) throws ExoPlaybackException;
}
