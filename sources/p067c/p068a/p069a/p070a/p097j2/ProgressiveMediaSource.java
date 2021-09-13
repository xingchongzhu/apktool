package p067c.p068a.p069a.p070a.p097j2;

import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.C1916m.C1917a;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.p259uc.crashsdk.export.LogType;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.MediaItem.C1266g;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.Timeline.C1257c;
import p067c.p068a.p069a.p070a.p075e2.C0900y;
import p067c.p068a.p069a.p070a.p075e2.DefaultDrmSessionManagerProvider;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionManagerProvider;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.DefaultExtractorsFactory;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.j2.i0 */
public final class ProgressiveMediaSource extends BaseMediaSource implements C1090b {

    /* renamed from: g */
    private final MediaItem f7489g;

    /* renamed from: h */
    private final C1266g f7490h;

    /* renamed from: i */
    private final C1917a f7491i;

    /* renamed from: j */
    private final C0998o f7492j;

    /* renamed from: k */
    private final C0900y f7493k;

    /* renamed from: l */
    private final LoadErrorHandlingPolicy f7494l;

    /* renamed from: m */
    private final int f7495m;

    /* renamed from: n */
    private boolean f7496n = true;

    /* renamed from: o */
    private long f7497o = -9223372036854775807L;

    /* renamed from: p */
    private boolean f7498p;

    /* renamed from: q */
    private boolean f7499q;

    /* renamed from: r */
    private TransferListener f7500r;

    /* renamed from: c.a.a.a.j2.i0$a */
    /* compiled from: ProgressiveMediaSource */
    class C1095a extends ForwardingTimeline {
        C1095a(Timeline x1Var) {
            super(x1Var);
        }

        /* renamed from: o */
        public C1257c mo5994o(int i, C1257c cVar, long j) {
            super.mo5994o(i, cVar, j);
            cVar.f8969n = true;
            return cVar;
        }
    }

    /* renamed from: c.a.a.a.j2.i0$b */
    /* compiled from: ProgressiveMediaSource */
    public static final class C1096b implements MediaSourceFactory {

        /* renamed from: a */
        private final C1917a f7502a;

        /* renamed from: b */
        private C0998o f7503b;

        /* renamed from: c */
        private DrmSessionManagerProvider f7504c;

        /* renamed from: d */
        private LoadErrorHandlingPolicy f7505d;

        /* renamed from: e */
        private int f7506e;

        /* renamed from: f */
        private String f7507f;

        /* renamed from: g */
        private Object f7508g;

        public C1096b(C1917a aVar) {
            this(aVar, new DefaultExtractorsFactory());
        }

        /* renamed from: a */
        public ProgressiveMediaSource mo6906a(MediaItem z0Var) {
            Assertions.m10153e(z0Var.f8985b);
            C1266g gVar = z0Var.f8985b;
            boolean z = true;
            boolean z2 = gVar.f9045h == null && this.f7508g != null;
            if (gVar.f9043f != null || this.f7507f == null) {
                z = false;
            }
            if (z2 && z) {
                z0Var = z0Var.mo7775a().mo7785f(this.f7508g).mo7781b(this.f7507f).mo7780a();
            } else if (z2) {
                z0Var = z0Var.mo7775a().mo7785f(this.f7508g).mo7780a();
            } else if (z) {
                z0Var = z0Var.mo7775a().mo7781b(this.f7507f).mo7780a();
            }
            MediaItem z0Var2 = z0Var;
            ProgressiveMediaSource i0Var = new ProgressiveMediaSource(z0Var2, this.f7502a, this.f7503b, this.f7504c.mo6094a(z0Var2), this.f7505d, this.f7506e);
            return i0Var;
        }

        public C1096b(C1917a aVar, C0998o oVar) {
            this.f7502a = aVar;
            this.f7503b = oVar;
            this.f7504c = new DefaultDrmSessionManagerProvider();
            this.f7505d = new DefaultLoadErrorHandlingPolicy();
            this.f7506e = LogType.ANR;
        }
    }

    ProgressiveMediaSource(MediaItem z0Var, C1917a aVar, C0998o oVar, C0900y yVar, LoadErrorHandlingPolicy a0Var, int i) {
        this.f7490h = (C1266g) Assertions.m10153e(z0Var.f8985b);
        this.f7489g = z0Var;
        this.f7491i = aVar;
        this.f7492j = oVar;
        this.f7493k = yVar;
        this.f7494l = a0Var;
        this.f7495m = i;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [c.a.a.a.j2.i0$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9038z() {
        /*
            r9 = this;
            c.a.a.a.j2.o0 r8 = new c.a.a.a.j2.o0
            long r1 = r9.f7497o
            boolean r3 = r9.f7498p
            boolean r5 = r9.f7499q
            c.a.a.a.z0 r7 = r9.f7489g
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f7496n
            if (r0 == 0) goto L_0x001a
            c.a.a.a.j2.i0$a r0 = new c.a.a.a.j2.i0$a
            r0.<init>(r8)
            r8 = r0
        L_0x001a:
            r9.mo6926x(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.ProgressiveMediaSource.m9038z():void");
    }

    /* renamed from: a */
    public MediaItem mo6827a() {
        return this.f7489g;
    }

    /* renamed from: c */
    public void mo6829c() {
    }

    /* renamed from: d */
    public MediaPeriod mo6830d(C1081a aVar, Allocator eVar, long j) {
        C1916m a = this.f7491i.mo14939a();
        TransferListener e0Var = this.f7500r;
        if (e0Var != null) {
            a.mo7017k(e0Var);
        }
        ProgressiveMediaPeriod h0Var = new ProgressiveMediaPeriod(this.f7490h.f9038a, a, this.f7492j, this.f7493k, mo6920q(aVar), this.f7494l, mo6922s(aVar), this, eVar, this.f7490h.f9043f, this.f7495m);
        return h0Var;
    }

    /* renamed from: f */
    public void mo6832f(MediaPeriod a0Var) {
        ((ProgressiveMediaPeriod) a0Var).mo6886c0();
    }

    /* renamed from: o */
    public void mo6896o(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f7497o;
        }
        if (this.f7496n || this.f7497o != j || this.f7498p != z || this.f7499q != z2) {
            this.f7497o = j;
            this.f7498p = z;
            this.f7499q = z2;
            this.f7496n = false;
            m9038z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo6904w(TransferListener e0Var) {
        this.f7500r = e0Var;
        this.f7493k.mo6086d();
        m9038z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo6905y() {
        this.f7493k.mo6083a();
    }
}
