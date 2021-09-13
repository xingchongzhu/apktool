package p067c.p068a.p069a.p070a;

import java.util.List;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectorResult;
import p067c.p068a.p134b.p136b.ImmutableList;

/* renamed from: c.a.a.a.h1 */
final class PlaybackInfo {

    /* renamed from: a */
    private static final C1081a f7202a = new C1081a(new Object());

    /* renamed from: b */
    public final Timeline f7203b;

    /* renamed from: c */
    public final C1081a f7204c;

    /* renamed from: d */
    public final long f7205d;

    /* renamed from: e */
    public final int f7206e;

    /* renamed from: f */
    public final ExoPlaybackException f7207f;

    /* renamed from: g */
    public final boolean f7208g;

    /* renamed from: h */
    public final TrackGroupArray f7209h;

    /* renamed from: i */
    public final TrackSelectorResult f7210i;

    /* renamed from: j */
    public final List<Metadata> f7211j;

    /* renamed from: k */
    public final C1081a f7212k;

    /* renamed from: l */
    public final boolean f7213l;

    /* renamed from: m */
    public final int f7214m;

    /* renamed from: n */
    public final PlaybackParameters f7215n;

    /* renamed from: o */
    public final boolean f7216o;

    /* renamed from: p */
    public final boolean f7217p;

    /* renamed from: q */
    public volatile long f7218q;

    /* renamed from: r */
    public volatile long f7219r;

    /* renamed from: s */
    public volatile long f7220s;

    public PlaybackInfo(Timeline x1Var, C1081a aVar, long j, int i, ExoPlaybackException p0Var, boolean z, TrackGroupArray q0Var, TrackSelectorResult oVar, List<Metadata> list, C1081a aVar2, boolean z2, int i2, PlaybackParameters i1Var, long j2, long j3, long j4, boolean z3, boolean z4) {
        this.f7203b = x1Var;
        this.f7204c = aVar;
        this.f7205d = j;
        this.f7206e = i;
        this.f7207f = p0Var;
        this.f7208g = z;
        this.f7209h = q0Var;
        this.f7210i = oVar;
        this.f7211j = list;
        this.f7212k = aVar2;
        this.f7213l = z2;
        this.f7214m = i2;
        this.f7215n = i1Var;
        this.f7218q = j2;
        this.f7219r = j3;
        this.f7220s = j4;
        this.f7216o = z3;
        this.f7217p = z4;
    }

    /* renamed from: k */
    public static PlaybackInfo m8677k(TrackSelectorResult oVar) {
        TrackSelectorResult oVar2 = oVar;
        Timeline x1Var = Timeline.f8949a;
        C1081a aVar = f7202a;
        PlaybackInfo h1Var = new PlaybackInfo(x1Var, aVar, -9223372036854775807L, 1, null, false, TrackGroupArray.f7609a, oVar2, ImmutableList.m11917p(), aVar, false, 0, PlaybackParameters.f7375a, 0, 0, 0, false, false);
        return h1Var;
    }

    /* renamed from: l */
    public static C1081a m8678l() {
        return f7202a;
    }

    /* renamed from: a */
    public PlaybackInfo mo6536a(boolean z) {
        boolean z2 = z;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, this.f7204c, this.f7205d, this.f7206e, this.f7207f, z2, this.f7209h, this.f7210i, this.f7211j, this.f7212k, this.f7213l, this.f7214m, this.f7215n, this.f7218q, this.f7219r, this.f7220s, this.f7216o, this.f7217p);
        return h1Var;
    }

    /* renamed from: b */
    public PlaybackInfo mo6537b(C1081a aVar) {
        C1081a aVar2 = aVar;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, this.f7204c, this.f7205d, this.f7206e, this.f7207f, this.f7208g, this.f7209h, this.f7210i, this.f7211j, aVar2, this.f7213l, this.f7214m, this.f7215n, this.f7218q, this.f7219r, this.f7220s, this.f7216o, this.f7217p);
        return h1Var;
    }

    /* renamed from: c */
    public PlaybackInfo mo6538c(C1081a aVar, long j, long j2, long j3, TrackGroupArray q0Var, TrackSelectorResult oVar, List<Metadata> list) {
        C1081a aVar2 = aVar;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        TrackGroupArray q0Var2 = q0Var;
        TrackSelectorResult oVar2 = oVar;
        List<Metadata> list2 = list;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, aVar2, j5, this.f7206e, this.f7207f, this.f7208g, q0Var2, oVar2, list2, this.f7212k, this.f7213l, this.f7214m, this.f7215n, this.f7218q, j6, j4, this.f7216o, this.f7217p);
        return h1Var;
    }

    /* renamed from: d */
    public PlaybackInfo mo6539d(boolean z) {
        boolean z2 = z;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, this.f7204c, this.f7205d, this.f7206e, this.f7207f, this.f7208g, this.f7209h, this.f7210i, this.f7211j, this.f7212k, this.f7213l, this.f7214m, this.f7215n, this.f7218q, this.f7219r, this.f7220s, z2, this.f7217p);
        return h1Var;
    }

    /* renamed from: e */
    public PlaybackInfo mo6540e(boolean z, int i) {
        boolean z2 = z;
        int i2 = i;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, this.f7204c, this.f7205d, this.f7206e, this.f7207f, this.f7208g, this.f7209h, this.f7210i, this.f7211j, this.f7212k, z2, i2, this.f7215n, this.f7218q, this.f7219r, this.f7220s, this.f7216o, this.f7217p);
        return h1Var;
    }

    /* renamed from: f */
    public PlaybackInfo mo6541f(ExoPlaybackException p0Var) {
        ExoPlaybackException p0Var2 = p0Var;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, this.f7204c, this.f7205d, this.f7206e, p0Var2, this.f7208g, this.f7209h, this.f7210i, this.f7211j, this.f7212k, this.f7213l, this.f7214m, this.f7215n, this.f7218q, this.f7219r, this.f7220s, this.f7216o, this.f7217p);
        return h1Var;
    }

    /* renamed from: g */
    public PlaybackInfo mo6542g(PlaybackParameters i1Var) {
        PlaybackParameters i1Var2 = i1Var;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, this.f7204c, this.f7205d, this.f7206e, this.f7207f, this.f7208g, this.f7209h, this.f7210i, this.f7211j, this.f7212k, this.f7213l, this.f7214m, i1Var2, this.f7218q, this.f7219r, this.f7220s, this.f7216o, this.f7217p);
        return h1Var;
    }

    /* renamed from: h */
    public PlaybackInfo mo6543h(int i) {
        int i2 = i;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, this.f7204c, this.f7205d, i2, this.f7207f, this.f7208g, this.f7209h, this.f7210i, this.f7211j, this.f7212k, this.f7213l, this.f7214m, this.f7215n, this.f7218q, this.f7219r, this.f7220s, this.f7216o, this.f7217p);
        return h1Var;
    }

    /* renamed from: i */
    public PlaybackInfo mo6544i(boolean z) {
        boolean z2 = z;
        PlaybackInfo h1Var = new PlaybackInfo(this.f7203b, this.f7204c, this.f7205d, this.f7206e, this.f7207f, this.f7208g, this.f7209h, this.f7210i, this.f7211j, this.f7212k, this.f7213l, this.f7214m, this.f7215n, this.f7218q, this.f7219r, this.f7220s, this.f7216o, z2);
        return h1Var;
    }

    /* renamed from: j */
    public PlaybackInfo mo6545j(Timeline x1Var) {
        Timeline x1Var2 = x1Var;
        PlaybackInfo h1Var = new PlaybackInfo(x1Var, this.f7204c, this.f7205d, this.f7206e, this.f7207f, this.f7208g, this.f7209h, this.f7210i, this.f7211j, this.f7212k, this.f7213l, this.f7214m, this.f7215n, this.f7218q, this.f7219r, this.f7220s, this.f7216o, this.f7217p);
        return h1Var;
    }
}
