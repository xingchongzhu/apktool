package p067c.p068a.p069a.p070a;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p067c.p068a.p069a.p070a.C1227p1.C1228a;
import p067c.p068a.p069a.p070a.DefaultMediaClock.C1203a;
import p067c.p068a.p069a.p070a.MediaItem.C1265f;
import p067c.p068a.p069a.p070a.MediaSourceList.C0908d;
import p067c.p068a.p069a.p070a.PlayerMessage.C1182a;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.Timeline.C1257c;
import p067c.p068a.p069a.p070a.p071a2.AnalyticsCollector;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod.C1076a;
import p067c.p068a.p069a.p070a.p097j2.SampleStream;
import p067c.p068a.p069a.p070a.p097j2.ShuffleOrder;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p100k2.TextRenderer;
import p067c.p068a.p069a.p070a.p110l2.C1174h;
import p067c.p068a.p069a.p070a.p110l2.TrackSelector;
import p067c.p068a.p069a.p070a.p110l2.TrackSelector.C1180a;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectorResult;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Clock;
import p067c.p068a.p069a.p070a.p111m2.HandlerWrapper;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p135a.C1325k;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableList.C1378a;

/* renamed from: c.a.a.a.r0 */
final class ExoPlayerImplInternal implements Callback, C1076a, C1180a, C0908d, C1203a, C1182a {

    /* renamed from: A */
    private boolean f8717A;

    /* renamed from: B */
    private boolean f8718B;

    /* renamed from: C */
    private boolean f8719C;

    /* renamed from: D */
    private int f8720D;

    /* renamed from: G */
    private boolean f8721G;

    /* renamed from: H */
    private boolean f8722H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f8723I;

    /* renamed from: J */
    private boolean f8724J;

    /* renamed from: K */
    private int f8725K;

    /* renamed from: L */
    private C1239h f8726L;

    /* renamed from: M */
    private long f8727M;

    /* renamed from: N */
    private int f8728N;

    /* renamed from: O */
    private boolean f8729O;

    /* renamed from: P */
    private ExoPlaybackException f8730P;

    /* renamed from: Q */
    private long f8731Q;

    /* renamed from: a */
    private final C1227p1[] f8732a;

    /* renamed from: b */
    private final C1240r1[] f8733b;

    /* renamed from: c */
    private final TrackSelector f8734c;

    /* renamed from: d */
    private final TrackSelectorResult f8735d;

    /* renamed from: e */
    private final LoadControl f8736e;

    /* renamed from: f */
    private final BandwidthMeter f8737f;

    /* renamed from: g */
    private final HandlerWrapper f8738g;

    /* renamed from: h */
    private final HandlerThread f8739h;

    /* renamed from: i */
    private final Looper f8740i;

    /* renamed from: j */
    private final C1257c f8741j;

    /* renamed from: k */
    private final C1256b f8742k;

    /* renamed from: l */
    private final long f8743l;

    /* renamed from: m */
    private final boolean f8744m;

    /* renamed from: n */
    private final DefaultMediaClock f8745n;

    /* renamed from: o */
    private final ArrayList<C1235d> f8746o;

    /* renamed from: p */
    private final Clock f8747p;

    /* renamed from: q */
    private final C1237f f8748q;

    /* renamed from: r */
    private final MediaPeriodQueue f8749r;

    /* renamed from: s */
    private final MediaSourceList f8750s;

    /* renamed from: t */
    private final LivePlaybackSpeedControl f8751t;

    /* renamed from: u */
    private final long f8752u;

    /* renamed from: v */
    private SeekParameters f8753v;

    /* renamed from: w */
    private PlaybackInfo f8754w;

    /* renamed from: x */
    private C1236e f8755x;

    /* renamed from: y */
    private boolean f8756y;

    /* renamed from: z */
    private boolean f8757z;

    /* renamed from: c.a.a.a.r0$a */
    /* compiled from: ExoPlayerImplInternal */
    class C1232a implements C1228a {
        C1232a() {
        }

        /* renamed from: a */
        public void mo7631a(long j) {
            if (j >= 2000) {
                ExoPlayerImplInternal.this.f8723I = true;
            }
        }
    }

    /* renamed from: c.a.a.a.r0$b */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C1233b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C0907c> f8759a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ShuffleOrder f8760b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f8761c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f8762d;

        /* synthetic */ C1233b(List list, ShuffleOrder n0Var, int i, long j, C1232a aVar) {
            this(list, n0Var, i, j);
        }

        private C1233b(List<C0907c> list, ShuffleOrder n0Var, int i, long j) {
            this.f8759a = list;
            this.f8760b = n0Var;
            this.f8761c = i;
            this.f8762d = j;
        }
    }

    /* renamed from: c.a.a.a.r0$c */
    /* compiled from: ExoPlayerImplInternal */
    private static class C1234c {

        /* renamed from: a */
        public final int f8763a;

        /* renamed from: b */
        public final int f8764b;

        /* renamed from: c */
        public final int f8765c;

        /* renamed from: d */
        public final ShuffleOrder f8766d;
    }

    /* renamed from: c.a.a.a.r0$d */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C1235d implements Comparable<C1235d> {

        /* renamed from: a */
        public final PlayerMessage f8767a;

        /* renamed from: b */
        public int f8768b;

        /* renamed from: c */
        public long f8769c;

        /* renamed from: d */
        public Object f8770d;

        public C1235d(PlayerMessage m1Var) {
            this.f8767a = m1Var;
        }

        /* renamed from: a */
        public int compareTo(C1235d dVar) {
            Object obj = this.f8770d;
            int i = 1;
            if ((obj == null) != (dVar.f8770d == null)) {
                if (obj != null) {
                    i = -1;
                }
                return i;
            } else if (obj == null) {
                return 0;
            } else {
                int i2 = this.f8768b - dVar.f8768b;
                if (i2 != 0) {
                    return i2;
                }
                return Util.m10303n(this.f8769c, dVar.f8769c);
            }
        }

        /* renamed from: b */
        public void mo7656b(int i, long j, Object obj) {
            this.f8768b = i;
            this.f8769c = j;
            this.f8770d = obj;
        }
    }

    /* renamed from: c.a.a.a.r0$e */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C1236e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f8771a;

        /* renamed from: b */
        public PlaybackInfo f8772b;

        /* renamed from: c */
        public int f8773c;

        /* renamed from: d */
        public boolean f8774d;

        /* renamed from: e */
        public int f8775e;

        /* renamed from: f */
        public boolean f8776f;

        /* renamed from: g */
        public int f8777g;

        public C1236e(PlaybackInfo h1Var) {
            this.f8772b = h1Var;
        }

        /* renamed from: b */
        public void mo7658b(int i) {
            this.f8771a |= i > 0;
            this.f8773c += i;
        }

        /* renamed from: c */
        public void mo7659c(int i) {
            this.f8771a = true;
            this.f8776f = true;
            this.f8777g = i;
        }

        /* renamed from: d */
        public void mo7660d(PlaybackInfo h1Var) {
            this.f8771a |= this.f8772b != h1Var;
            this.f8772b = h1Var;
        }

        /* renamed from: e */
        public void mo7661e(int i) {
            boolean z = true;
            if (!this.f8774d || this.f8775e == 4) {
                this.f8771a = true;
                this.f8774d = true;
                this.f8775e = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            Assertions.m10149a(z);
        }
    }

    /* renamed from: c.a.a.a.r0$f */
    /* compiled from: ExoPlayerImplInternal */
    public interface C1237f {
        /* renamed from: a */
        void mo7620a(C1236e eVar);
    }

    /* renamed from: c.a.a.a.r0$g */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C1238g {

        /* renamed from: a */
        public final C1081a f8778a;

        /* renamed from: b */
        public final long f8779b;

        /* renamed from: c */
        public final long f8780c;

        /* renamed from: d */
        public final boolean f8781d;

        /* renamed from: e */
        public final boolean f8782e;

        /* renamed from: f */
        public final boolean f8783f;

        public C1238g(C1081a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f8778a = aVar;
            this.f8779b = j;
            this.f8780c = j2;
            this.f8781d = z;
            this.f8782e = z2;
            this.f8783f = z3;
        }
    }

    /* renamed from: c.a.a.a.r0$h */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C1239h {

        /* renamed from: a */
        public final Timeline f8784a;

        /* renamed from: b */
        public final int f8785b;

        /* renamed from: c */
        public final long f8786c;

        public C1239h(Timeline x1Var, int i, long j) {
            this.f8784a = x1Var;
            this.f8785b = i;
            this.f8786c = j;
        }
    }

    public ExoPlayerImplInternal(C1227p1[] p1VarArr, TrackSelector nVar, TrackSelectorResult oVar, LoadControl y0Var, BandwidthMeter gVar, int i, boolean z, AnalyticsCollector c1Var, SeekParameters u1Var, LivePlaybackSpeedControl x0Var, long j, boolean z2, Looper looper, Clock gVar2, C1237f fVar) {
        C1227p1[] p1VarArr2 = p1VarArr;
        TrackSelector nVar2 = nVar;
        BandwidthMeter gVar3 = gVar;
        AnalyticsCollector c1Var2 = c1Var;
        long j2 = j;
        Clock gVar4 = gVar2;
        this.f8748q = fVar;
        this.f8732a = p1VarArr2;
        this.f8734c = nVar2;
        this.f8735d = oVar;
        this.f8736e = y0Var;
        this.f8737f = gVar3;
        this.f8720D = i;
        this.f8721G = z;
        this.f8753v = u1Var;
        this.f8751t = x0Var;
        this.f8752u = j2;
        this.f8731Q = j2;
        this.f8757z = z2;
        this.f8747p = gVar4;
        this.f8743l = y0Var.mo7342n();
        this.f8744m = y0Var.mo7336h();
        PlaybackInfo k = PlaybackInfo.m8677k(oVar);
        this.f8754w = k;
        this.f8755x = new C1236e(k);
        this.f8733b = new C1240r1[p1VarArr2.length];
        for (int i2 = 0; i2 < p1VarArr2.length; i2++) {
            p1VarArr2[i2].mo6520h(i2);
            this.f8733b[i2] = p1VarArr2[i2].mo6533v();
        }
        this.f8745n = new DefaultMediaClock(this, gVar4);
        this.f8746o = new ArrayList<>();
        this.f8741j = new C1257c();
        this.f8742k = new C1256b();
        nVar.mo7329b(this, gVar3);
        this.f8729O = true;
        Handler handler = new Handler(looper);
        this.f8749r = new MediaPeriodQueue(c1Var2, handler);
        this.f8750s = new MediaSourceList(this, c1Var2, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f8739h = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f8740i = looper2;
        this.f8738g = gVar4.mo7424b(looper2, this);
    }

    /* renamed from: A */
    private void m10790A(MediaPeriod a0Var) {
        if (this.f8749r.mo6013t(a0Var)) {
            this.f8749r.mo6015x(this.f8727M);
            m10815P();
        }
    }

    /* renamed from: A0 */
    private void m10791A0(PlayerMessage m1Var) throws ExoPlaybackException {
        if (m1Var.mo7347e() == -9223372036854775807L) {
            m10793B0(m1Var);
        } else if (this.f8754w.f7203b.mo7743q()) {
            this.f8746o.add(new C1235d(m1Var));
        } else {
            C1235d dVar = new C1235d(m1Var);
            Timeline x1Var = this.f8754w.f7203b;
            if (m10866p0(dVar, x1Var, x1Var, this.f8720D, this.f8721G, this.f8741j, this.f8742k)) {
                this.f8746o.add(dVar);
                Collections.sort(this.f8746o);
                return;
            }
            m1Var.mo7353k(false);
        }
    }

    /* renamed from: B */
    private void m10792B(boolean z) {
        long j;
        MediaPeriodHolder i = this.f8749r.mo6008i();
        C1081a aVar = i == null ? this.f8754w.f7204c : i.f5401f.f5711a;
        boolean z2 = !this.f8754w.f7212k.equals(aVar);
        if (z2) {
            this.f8754w = this.f8754w.mo6537b(aVar);
        }
        PlaybackInfo h1Var = this.f8754w;
        if (i == null) {
            j = h1Var.f7220s;
        } else {
            j = i.mo5748i();
        }
        h1Var.f7218q = j;
        this.f8754w.f7219r = m10881y();
        if ((z2 || z) && i != null && i.f5399d) {
            m10848g1(i.mo5753n(), i.mo5754o());
        }
    }

    /* renamed from: B0 */
    private void m10793B0(PlayerMessage m1Var) throws ExoPlaybackException {
        if (m1Var.mo7345c() == this.f8740i) {
            m10849h(m1Var);
            int i = this.f8754w.f7206e;
            if (i == 3 || i == 2) {
                this.f8738g.mo7428c(2);
                return;
            }
            return;
        }
        this.f8738g.mo7432g(15, m1Var).sendToTarget();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012c  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10794C(p067c.p068a.p069a.p070a.Timeline r22) throws p067c.p068a.p069a.p070a.ExoPlaybackException {
        /*
            r21 = this;
            r8 = r21
            r7 = r22
            c.a.a.a.h1 r10 = r8.f8754w
            c.a.a.a.r0$h r11 = r8.f8726L
            c.a.a.a.d1 r12 = r8.f8749r
            int r13 = r8.f8720D
            boolean r14 = r8.f8721G
            c.a.a.a.x1$c r15 = r8.f8741j
            c.a.a.a.x1$b r0 = r8.f8742k
            r9 = r22
            r16 = r0
            c.a.a.a.r0$g r9 = m10870r0(r9, r10, r11, r12, r13, r14, r15, r16)
            c.a.a.a.j2.d0$a r10 = r9.f8778a
            long r11 = r9.f8780c
            boolean r0 = r9.f8781d
            long r13 = r9.f8779b
            c.a.a.a.h1 r1 = r8.f8754w
            c.a.a.a.j2.d0$a r1 = r1.f7204c
            boolean r1 = r1.equals(r10)
            r2 = 1
            r15 = 0
            if (r1 == 0) goto L_0x003a
            c.a.a.a.h1 r1 = r8.f8754w
            long r3 = r1.f7220s
            int r1 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            r16 = 0
            goto L_0x003c
        L_0x003a:
            r16 = 1
        L_0x003c:
            r5 = 0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r1 = r9.f8782e     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0053
            c.a.a.a.h1 r1 = r8.f8754w     // Catch:{ all -> 0x00e5 }
            int r1 = r1.f7206e     // Catch:{ all -> 0x00e5 }
            if (r1 == r2) goto L_0x0050
            r1 = 4
            r8.m10823T0(r1)     // Catch:{ all -> 0x00e5 }
        L_0x0050:
            r8.m10860l0(r15, r15, r15, r2)     // Catch:{ all -> 0x00e5 }
        L_0x0053:
            if (r16 != 0) goto L_0x006b
            c.a.a.a.d1 r1 = r8.f8749r     // Catch:{ all -> 0x00e5 }
            long r3 = r8.f8727M     // Catch:{ all -> 0x00e5 }
            long r19 = r21.m10877v()     // Catch:{ all -> 0x00e5 }
            r2 = r22
            r5 = r19
            boolean r0 = r1.mo6001E(r2, r3, r5)     // Catch:{ all -> 0x00e2 }
            if (r0 != 0) goto L_0x0097
            r8.m10879w0(r15)     // Catch:{ all -> 0x00e2 }
            goto L_0x0097
        L_0x006b:
            boolean r1 = r22.mo7743q()     // Catch:{ all -> 0x00e2 }
            if (r1 != 0) goto L_0x0097
            c.a.a.a.d1 r1 = r8.f8749r     // Catch:{ all -> 0x00e2 }
            c.a.a.a.b1 r1 = r1.mo6010n()     // Catch:{ all -> 0x00e2 }
        L_0x0077:
            if (r1 == 0) goto L_0x0092
            c.a.a.a.c1 r2 = r1.f5401f     // Catch:{ all -> 0x00e2 }
            c.a.a.a.j2.d0$a r2 = r2.f5711a     // Catch:{ all -> 0x00e2 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x008d
            c.a.a.a.d1 r2 = r8.f8749r     // Catch:{ all -> 0x00e2 }
            c.a.a.a.c1 r3 = r1.f5401f     // Catch:{ all -> 0x00e2 }
            c.a.a.a.c1 r2 = r2.mo6012p(r7, r3)     // Catch:{ all -> 0x00e2 }
            r1.f5401f = r2     // Catch:{ all -> 0x00e2 }
        L_0x008d:
            c.a.a.a.b1 r1 = r1.mo5749j()     // Catch:{ all -> 0x00e2 }
            goto L_0x0077
        L_0x0092:
            long r0 = r8.m10882y0(r10, r13, r0)     // Catch:{ all -> 0x00e2 }
            r13 = r0
        L_0x0097:
            c.a.a.a.h1 r0 = r8.f8754w
            c.a.a.a.x1 r4 = r0.f7203b
            c.a.a.a.j2.d0$a r5 = r0.f7204c
            boolean r0 = r9.f8783f
            if (r0 == 0) goto L_0x00a3
            r17 = r13
        L_0x00a3:
            r1 = r21
            r2 = r22
            r3 = r10
            r9 = r7
            r6 = r17
            r1.m10845f1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00b8
            c.a.a.a.h1 r0 = r8.f8754w
            long r0 = r0.f7205d
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00c3
        L_0x00b8:
            r1 = r21
            r2 = r10
            r3 = r13
            r5 = r11
            c.a.a.a.h1 r0 = r1.m10802G(r2, r3, r5)
            r8.f8754w = r0
        L_0x00c3:
            r21.m10861m0()
            c.a.a.a.h1 r0 = r8.f8754w
            c.a.a.a.x1 r0 = r0.f7203b
            r8.m10868q0(r9, r0)
            c.a.a.a.h1 r0 = r8.f8754w
            c.a.a.a.h1 r0 = r0.mo6545j(r9)
            r8.f8754w = r0
            boolean r0 = r22.mo7743q()
            if (r0 != 0) goto L_0x00de
            r6 = 0
            r8.f8726L = r6
        L_0x00de:
            r8.m10792B(r15)
            return
        L_0x00e2:
            r0 = move-exception
            r6 = 0
            goto L_0x00e7
        L_0x00e5:
            r0 = move-exception
            r6 = r5
        L_0x00e7:
            c.a.a.a.h1 r1 = r8.f8754w
            c.a.a.a.x1 r4 = r1.f7203b
            c.a.a.a.j2.d0$a r5 = r1.f7204c
            boolean r1 = r9.f8783f
            if (r1 == 0) goto L_0x00f3
            r17 = r13
        L_0x00f3:
            r1 = r21
            r2 = r22
            r3 = r10
            r15 = r6
            r9 = r7
            r6 = r17
            r1.m10845f1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x0109
            c.a.a.a.h1 r1 = r8.f8754w
            long r1 = r1.f7205d
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0114
        L_0x0109:
            r1 = r21
            r2 = r10
            r3 = r13
            r5 = r11
            c.a.a.a.h1 r1 = r1.m10802G(r2, r3, r5)
            r8.f8754w = r1
        L_0x0114:
            r21.m10861m0()
            c.a.a.a.h1 r1 = r8.f8754w
            c.a.a.a.x1 r1 = r1.f7203b
            r8.m10868q0(r9, r1)
            c.a.a.a.h1 r1 = r8.f8754w
            c.a.a.a.h1 r1 = r1.mo6545j(r9)
            r8.f8754w = r1
            boolean r1 = r22.mo7743q()
            if (r1 != 0) goto L_0x012e
            r8.f8726L = r15
        L_0x012e:
            r1 = 0
            r8.m10792B(r1)
            goto L_0x0134
        L_0x0133:
            throw r0
        L_0x0134:
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.ExoPlayerImplInternal.m10794C(c.a.a.a.x1):void");
    }

    /* renamed from: C0 */
    private void m10795C0(PlayerMessage m1Var) {
        Looper c = m1Var.mo7345c();
        if (!c.getThread().isAlive()) {
            Log.m10386h("TAG", "Trying to send message on a dead thread.");
            m1Var.mo7353k(false);
            return;
        }
        this.f8747p.mo7424b(c, null).mo7434i(new C1258y(this, m1Var));
    }

    /* renamed from: D */
    private void m10796D(MediaPeriod a0Var) throws ExoPlaybackException {
        if (this.f8749r.mo6013t(a0Var)) {
            MediaPeriodHolder i = this.f8749r.mo6008i();
            i.mo5755p(this.f8745n.mo5785c().f7376b, this.f8754w.f7203b);
            m10848g1(i.mo5753n(), i.mo5754o());
            if (i == this.f8749r.mo6010n()) {
                m10863n0(i.f5401f.f5712b);
                m10862n();
                PlaybackInfo h1Var = this.f8754w;
                this.f8754w = m10802G(h1Var.f7204c, i.f5401f.f5712b, h1Var.f7205d);
            }
            m10815P();
        }
    }

    /* renamed from: D0 */
    private void m10797D0(long j) {
        C1227p1[] p1VarArr;
        for (C1227p1 p1Var : this.f8732a) {
            if (p1Var.mo6523n() != null) {
                m10799E0(p1Var, j);
            }
        }
    }

    /* renamed from: E */
    private void m10798E(PlaybackParameters i1Var, float f, boolean z, boolean z2) throws ExoPlaybackException {
        C1227p1[] p1VarArr;
        if (z) {
            if (z2) {
                this.f8755x.mo7658b(1);
            }
            this.f8754w = this.f8754w.mo6542g(i1Var);
        }
        m10855j1(i1Var.f7376b);
        for (C1227p1 p1Var : this.f8732a) {
            if (p1Var != null) {
                p1Var.mo6498x(f, i1Var.f7376b);
            }
        }
    }

    /* renamed from: E0 */
    private void m10799E0(C1227p1 p1Var, long j) {
        p1Var.mo6525p();
        if (p1Var instanceof TextRenderer) {
            ((TextRenderer) p1Var).mo7068W(j);
        }
    }

    /* renamed from: F */
    private void m10800F(PlaybackParameters i1Var, boolean z) throws ExoPlaybackException {
        m10798E(i1Var, i1Var.f7376b, true, z);
    }

    /* renamed from: F0 */
    private void m10801F0(boolean z, AtomicBoolean atomicBoolean) {
        C1227p1[] p1VarArr;
        if (this.f8722H != z) {
            this.f8722H = z;
            if (!z) {
                for (C1227p1 p1Var : this.f8732a) {
                    if (!m10807J(p1Var)) {
                        p1Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: G */
    private PlaybackInfo m10802G(C1081a aVar, long j, long j2) {
        List<Metadata> list;
        TrackSelectorResult oVar;
        TrackGroupArray q0Var;
        TrackGroupArray q0Var2;
        TrackSelectorResult oVar2;
        C1081a aVar2 = aVar;
        long j3 = j2;
        this.f8729O = this.f8729O || j != this.f8754w.f7220s || !aVar.equals(this.f8754w.f7204c);
        m10861m0();
        PlaybackInfo h1Var = this.f8754w;
        TrackGroupArray q0Var3 = h1Var.f7209h;
        TrackSelectorResult oVar3 = h1Var.f7210i;
        List<Metadata> list2 = h1Var.f7211j;
        if (this.f8750s.mo6148r()) {
            MediaPeriodHolder n = this.f8749r.mo6010n();
            if (n == null) {
                q0Var2 = TrackGroupArray.f7609a;
            } else {
                q0Var2 = n.mo5753n();
            }
            if (n == null) {
                oVar2 = this.f8735d;
            } else {
                oVar2 = n.mo5754o();
            }
            ImmutableList r = m10869r(oVar2.f8305c);
            if (n != null) {
                MediaPeriodInfo c1Var = n.f5401f;
                if (c1Var.f5713c != j3) {
                    n.f5401f = c1Var.mo5942a(j3);
                }
            }
            q0Var = q0Var2;
            oVar = oVar2;
            list = r;
        } else if (!aVar.equals(this.f8754w.f7204c)) {
            q0Var = TrackGroupArray.f7609a;
            oVar = this.f8735d;
            list = ImmutableList.m11917p();
        } else {
            list = list2;
            q0Var = q0Var3;
            oVar = oVar3;
        }
        return this.f8754w.mo6538c(aVar, j, j2, m10881y(), q0Var, oVar, list);
    }

    /* renamed from: G0 */
    private void m10803G0(C1233b bVar) throws ExoPlaybackException {
        this.f8755x.mo7658b(1);
        if (bVar.f8761c != -1) {
            this.f8726L = new C1239h(new PlaylistTimeline(bVar.f8759a, bVar.f8760b), bVar.f8761c, bVar.f8762d);
        }
        m10794C(this.f8750s.mo6142C(bVar.f8759a, bVar.f8760b));
    }

    /* renamed from: H */
    private boolean m10804H() {
        MediaPeriodHolder o = this.f8749r.mo6011o();
        if (!o.f5399d) {
            return false;
        }
        int i = 0;
        while (true) {
            C1227p1[] p1VarArr = this.f8732a;
            if (i >= p1VarArr.length) {
                return true;
            }
            C1227p1 p1Var = p1VarArr[i];
            SampleStream l0Var = o.f5398c[i];
            if (p1Var.mo6523n() != l0Var || (l0Var != null && !p1Var.mo6521i())) {
                return false;
            }
            i++;
        }
        return false;
    }

    /* renamed from: I */
    private boolean m10805I() {
        MediaPeriodHolder i = this.f8749r.mo6008i();
        if (i == null || i.mo5750k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: I0 */
    private void m10806I0(boolean z) {
        if (z != this.f8724J) {
            this.f8724J = z;
            PlaybackInfo h1Var = this.f8754w;
            int i = h1Var.f7206e;
            if (z || i == 4 || i == 1) {
                this.f8754w = h1Var.mo6539d(z);
            } else {
                this.f8738g.mo7428c(2);
            }
        }
    }

    /* renamed from: J */
    private static boolean m10807J(C1227p1 p1Var) {
        return p1Var.getState() != 0;
    }

    /* renamed from: J0 */
    private void m10808J0(boolean z) throws ExoPlaybackException {
        this.f8757z = z;
        m10861m0();
        if (this.f8717A && this.f8749r.mo6011o() != this.f8749r.mo6010n()) {
            m10879w0(true);
            m10792B(false);
        }
    }

    /* renamed from: K */
    private boolean m10809K() {
        MediaPeriodHolder n = this.f8749r.mo6010n();
        long j = n.f5401f.f5715e;
        return n.f5399d && (j == -9223372036854775807L || this.f8754w.f7220s < j || !m10829W0());
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ Boolean mo7643M() {
        return Boolean.valueOf(this.f8756y);
    }

    /* renamed from: L0 */
    private void m10811L0(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.f8755x.mo7658b(z2 ? 1 : 0);
        this.f8755x.mo7659c(i2);
        this.f8754w = this.f8754w.mo6540e(z, i);
        this.f8718B = false;
        m10836a0(z);
        if (!m10829W0()) {
            m10842d1();
            m10853i1();
            return;
        }
        int i3 = this.f8754w.f7206e;
        if (i3 == 3) {
            m10837a1();
            this.f8738g.mo7428c(2);
        } else if (i3 == 2) {
            this.f8738g.mo7428c(2);
        }
    }

    /* renamed from: M0 */
    private void m10812M0(PlaybackParameters i1Var) throws ExoPlaybackException {
        this.f8745n.mo5787f(i1Var);
        m10800F(this.f8745n.mo5785c(), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void mo7645O(PlayerMessage m1Var) {
        try {
            m10849h(m1Var);
        } catch (ExoPlaybackException e) {
            Log.m10382d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: O0 */
    private void m10814O0(int i) throws ExoPlaybackException {
        this.f8720D = i;
        if (!this.f8749r.mo6002F(this.f8754w.f7203b, i)) {
            m10879w0(true);
        }
        m10792B(false);
    }

    /* renamed from: P */
    private void m10815P() {
        boolean V0 = m10827V0();
        this.f8719C = V0;
        if (V0) {
            this.f8749r.mo6008i().mo5747d(this.f8727M);
        }
        m10844e1();
    }

    /* renamed from: P0 */
    private void m10816P0(SeekParameters u1Var) {
        this.f8753v = u1Var;
    }

    /* renamed from: Q */
    private void m10817Q() {
        this.f8755x.mo7660d(this.f8754w);
        if (this.f8755x.f8771a) {
            this.f8748q.mo7620a(this.f8755x);
            this.f8755x = new C1236e(this.f8754w);
        }
    }

    /* renamed from: R */
    private boolean m10818R(long j, long j2) {
        if (this.f8724J && this.f8723I) {
            return false;
        }
        m10876u0(j, j2);
        return true;
    }

    /* renamed from: R0 */
    private void m10819R0(boolean z) throws ExoPlaybackException {
        this.f8721G = z;
        if (!this.f8749r.mo6003G(this.f8754w.f7203b, z)) {
            m10879w0(true);
        }
        m10792B(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[LOOP:1: B:24:0x0074->B:34:0x0090, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0062 A[EDGE_INSN: B:65:0x0062->B:20:0x0062 ?: BREAK  
EDGE_INSN: B:65:0x0062->B:20:0x0062 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0073 A[EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  
EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  
EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0073 A[EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  
EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  , SYNTHETIC] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10820S(long r8, long r10) throws p067c.p068a.p069a.p070a.ExoPlaybackException {
        /*
            r7 = this;
            java.util.ArrayList<c.a.a.a.r0$d> r0 = r7.f8746o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f7
            c.a.a.a.h1 r0 = r7.f8754w
            c.a.a.a.j2.d0$a r0 = r0.f7204c
            boolean r0 = r0.mo6822b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00f7
        L_0x0014:
            boolean r0 = r7.f8729O
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.f8729O = r0
        L_0x001e:
            c.a.a.a.h1 r0 = r7.f8754w
            c.a.a.a.x1 r1 = r0.f7203b
            c.a.a.a.j2.d0$a r0 = r0.f7204c
            java.lang.Object r0 = r0.f7391a
            int r0 = r1.mo5987b(r0)
            int r1 = r7.f8728N
            java.util.ArrayList<c.a.a.a.r0$d> r2 = r7.f8746o
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            c.a.a.a.r0$d r3 = (p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1235d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0062
            int r4 = r3.f8768b
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0062
            long r3 = r3.f8769c
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
        L_0x0053:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            c.a.a.a.r0$d r3 = (p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1235d) r3
            goto L_0x0045
        L_0x0062:
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            java.lang.Object r3 = r3.get(r1)
            c.a.a.a.r0$d r3 = (p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1235d) r3
            goto L_0x0074
        L_0x0073:
            r3 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x0099
            java.lang.Object r4 = r3.f8770d
            if (r4 == 0) goto L_0x0099
            int r4 = r3.f8768b
            if (r4 < r0) goto L_0x0086
            if (r4 != r0) goto L_0x0099
            long r4 = r3.f8769c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0099
        L_0x0086:
            int r1 = r1 + 1
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            java.lang.Object r3 = r3.get(r1)
            c.a.a.a.r0$d r3 = (p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1235d) r3
            goto L_0x0074
        L_0x0099:
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r4 = r3.f8770d
            if (r4 == 0) goto L_0x00f5
            int r4 = r3.f8768b
            if (r4 != r0) goto L_0x00f5
            long r4 = r3.f8769c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x00f5
            c.a.a.a.m1 r4 = r3.f8767a     // Catch:{ all -> 0x00de }
            r7.m10793B0(r4)     // Catch:{ all -> 0x00de }
            c.a.a.a.m1 r4 = r3.f8767a
            boolean r4 = r4.mo7344b()
            if (r4 != 0) goto L_0x00c6
            c.a.a.a.m1 r3 = r3.f8767a
            boolean r3 = r3.mo7352j()
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00c6:
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            r3.remove(r1)
        L_0x00cb:
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00dc
            java.util.ArrayList<c.a.a.a.r0$d> r3 = r7.f8746o
            java.lang.Object r3 = r3.get(r1)
            c.a.a.a.r0$d r3 = (p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1235d) r3
            goto L_0x0099
        L_0x00dc:
            r3 = r2
            goto L_0x0099
        L_0x00de:
            r8 = move-exception
            c.a.a.a.m1 r9 = r3.f8767a
            boolean r9 = r9.mo7344b()
            if (r9 != 0) goto L_0x00ef
            c.a.a.a.m1 r9 = r3.f8767a
            boolean r9 = r9.mo7352j()
            if (r9 == 0) goto L_0x00f4
        L_0x00ef:
            java.util.ArrayList<c.a.a.a.r0$d> r9 = r7.f8746o
            r9.remove(r1)
        L_0x00f4:
            throw r8
        L_0x00f5:
            r7.f8728N = r1
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.ExoPlayerImplInternal.m10820S(long, long):void");
    }

    /* renamed from: S0 */
    private void m10821S0(ShuffleOrder n0Var) throws ExoPlaybackException {
        this.f8755x.mo7658b(1);
        m10794C(this.f8750s.mo6143D(n0Var));
    }

    /* renamed from: T */
    private void m10822T() throws ExoPlaybackException {
        this.f8749r.mo6015x(this.f8727M);
        if (this.f8749r.mo6000C()) {
            MediaPeriodInfo m = this.f8749r.mo6009m(this.f8727M, this.f8754w);
            if (m != null) {
                MediaPeriodHolder f = this.f8749r.mo6007f(this.f8733b, this.f8734c, this.f8736e.mo7340l(), this.f8750s, m, this.f8735d);
                f.f5396a.mo6813l(this, m.f5712b);
                if (this.f8749r.mo6010n() == f) {
                    m10863n0(f.mo5752m());
                }
                m10792B(false);
            }
        }
        if (this.f8719C) {
            this.f8719C = m10805I();
            m10844e1();
            return;
        }
        m10815P();
    }

    /* renamed from: T0 */
    private void m10823T0(int i) {
        PlaybackInfo h1Var = this.f8754w;
        if (h1Var.f7206e != i) {
            this.f8754w = h1Var.mo6543h(i);
        }
    }

    /* renamed from: U */
    private void m10824U() throws ExoPlaybackException {
        boolean z = false;
        while (m10825U0()) {
            if (z) {
                m10817Q();
            }
            MediaPeriodHolder n = this.f8749r.mo6010n();
            MediaPeriodHolder a = this.f8749r.mo6004a();
            MediaPeriodInfo c1Var = a.f5401f;
            this.f8754w = m10802G(c1Var.f5711a, c1Var.f5712b, c1Var.f5713c);
            this.f8755x.mo7661e(n.f5401f.f5716f ? 0 : 3);
            Timeline x1Var = this.f8754w.f7203b;
            m10845f1(x1Var, a.f5401f.f5711a, x1Var, n.f5401f.f5711a, -9223372036854775807L);
            m10861m0();
            m10853i1();
            z = true;
        }
    }

    /* renamed from: U0 */
    private boolean m10825U0() {
        boolean z = false;
        if (!m10829W0() || this.f8717A) {
            return false;
        }
        MediaPeriodHolder n = this.f8749r.mo6010n();
        if (n == null) {
            return false;
        }
        MediaPeriodHolder j = n.mo5749j();
        if (j != null && this.f8727M >= j.mo5752m() && j.f5402g) {
            z = true;
        }
        return z;
    }

    /* renamed from: V */
    private void m10826V() {
        MediaPeriodHolder o = this.f8749r.mo6011o();
        if (o != null) {
            int i = 0;
            if (o.mo5749j() == null || this.f8717A) {
                if (o.f5401f.f5718h || this.f8717A) {
                    while (true) {
                        C1227p1[] p1VarArr = this.f8732a;
                        if (i >= p1VarArr.length) {
                            break;
                        }
                        C1227p1 p1Var = p1VarArr[i];
                        SampleStream l0Var = o.f5398c[i];
                        if (l0Var != null && p1Var.mo6523n() == l0Var && p1Var.mo6521i()) {
                            long j = o.f5401f.f5715e;
                            m10799E0(p1Var, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : o.mo5751l() + o.f5401f.f5715e);
                        }
                        i++;
                    }
                }
            } else if (m10804H()) {
                if (o.mo5749j().f5399d || this.f8727M >= o.mo5749j().mo5752m()) {
                    TrackSelectorResult o2 = o.mo5754o();
                    MediaPeriodHolder b = this.f8749r.mo6005b();
                    TrackSelectorResult o3 = b.mo5754o();
                    if (!b.f5399d || b.f5396a.mo6812k() == -9223372036854775807L) {
                        for (int i2 = 0; i2 < this.f8732a.length; i2++) {
                            boolean c = o2.mo7332c(i2);
                            boolean c2 = o3.mo7332c(i2);
                            if (c && !this.f8732a[i2].mo6532t()) {
                                boolean z = this.f8733b[i2].mo6518g() == 7;
                                RendererConfiguration s1Var = o2.f8304b[i2];
                                RendererConfiguration s1Var2 = o3.f8304b[i2];
                                if (!c2 || !s1Var2.equals(s1Var) || z) {
                                    m10799E0(this.f8732a[i2], b.mo5752m());
                                }
                            }
                        }
                        return;
                    }
                    m10797D0(b.mo5752m());
                }
            }
        }
    }

    /* renamed from: V0 */
    private boolean m10827V0() {
        long j;
        if (!m10805I()) {
            return false;
        }
        MediaPeriodHolder i = this.f8749r.mo6008i();
        long z = m10883z(i.mo5750k());
        if (i == this.f8749r.mo6010n()) {
            j = i.mo5762y(this.f8727M);
        } else {
            j = i.mo5762y(this.f8727M) - i.f5401f.f5712b;
        }
        return this.f8736e.mo7339k(j, z, this.f8745n.mo5785c().f7376b);
    }

    /* renamed from: W */
    private void m10828W() throws ExoPlaybackException {
        MediaPeriodHolder o = this.f8749r.mo6011o();
        if (o != null && this.f8749r.mo6010n() != o && !o.f5402g && m10854j0()) {
            m10862n();
        }
    }

    /* renamed from: W0 */
    private boolean m10829W0() {
        PlaybackInfo h1Var = this.f8754w;
        return h1Var.f7213l && h1Var.f7214m == 0;
    }

    /* renamed from: X */
    private void m10830X() throws ExoPlaybackException {
        m10794C(this.f8750s.mo6146h());
    }

    /* renamed from: X0 */
    private boolean m10831X0(boolean z) {
        if (this.f8725K == 0) {
            return m10809K();
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        PlaybackInfo h1Var = this.f8754w;
        if (!h1Var.f7208g) {
            return true;
        }
        long e = m10833Y0(h1Var.f7203b, this.f8749r.mo6010n().f5401f.f5711a) ? this.f8751t.mo7189e() : -9223372036854775807L;
        MediaPeriodHolder i = this.f8749r.mo6008i();
        boolean z3 = i.mo5756q() && i.f5401f.f5718h;
        boolean z4 = i.f5401f.f5711a.mo6822b() && !i.f5399d;
        if (z3 || z4 || this.f8736e.mo7338j(m10881y(), this.f8745n.mo5785c().f7376b, this.f8718B, e)) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: Y */
    private void m10832Y(C1234c cVar) throws ExoPlaybackException {
        this.f8755x.mo7658b(1);
        m10794C(this.f8750s.mo6150v(cVar.f8763a, cVar.f8764b, cVar.f8765c, cVar.f8766d));
    }

    /* renamed from: Y0 */
    private boolean m10833Y0(Timeline x1Var, C1081a aVar) {
        if (aVar.mo6822b() || x1Var.mo7743q()) {
            return false;
        }
        x1Var.mo7742n(x1Var.mo5991h(aVar.f7391a, this.f8742k).f8952c, this.f8741j);
        if (!this.f8741j.mo7768f()) {
            return false;
        }
        C1257c cVar = this.f8741j;
        if (!cVar.f8966k || cVar.f8963h == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    private void m10834Z() {
        C1174h[] hVarArr;
        for (MediaPeriodHolder n = this.f8749r.mo6010n(); n != null; n = n.mo5749j()) {
            for (C1174h hVar : n.mo5754o().f8305c) {
                if (hVar != null) {
                    hVar.mo7268q();
                }
            }
        }
    }

    /* renamed from: Z0 */
    private static boolean m10835Z0(PlaybackInfo h1Var, C1256b bVar, C1257c cVar) {
        C1081a aVar = h1Var.f7204c;
        Timeline x1Var = h1Var.f7203b;
        return aVar.mo6822b() || x1Var.mo7743q() || x1Var.mo7742n(x1Var.mo5991h(aVar.f7391a, bVar).f8952c, cVar).f8969n;
    }

    /* renamed from: a0 */
    private void m10836a0(boolean z) {
        C1174h[] hVarArr;
        for (MediaPeriodHolder n = this.f8749r.mo6010n(); n != null; n = n.mo5749j()) {
            for (C1174h hVar : n.mo5754o().f8305c) {
                if (hVar != null) {
                    hVar.mo7259c(z);
                }
            }
        }
    }

    /* renamed from: a1 */
    private void m10837a1() throws ExoPlaybackException {
        C1227p1[] p1VarArr;
        this.f8718B = false;
        this.f8745n.mo7510g();
        for (C1227p1 p1Var : this.f8732a) {
            if (m10807J(p1Var)) {
                p1Var.start();
            }
        }
    }

    /* renamed from: b0 */
    private void m10838b0() {
        C1174h[] hVarArr;
        for (MediaPeriodHolder n = this.f8749r.mo6010n(); n != null; n = n.mo5749j()) {
            for (C1174h hVar : n.mo5754o().f8305c) {
                if (hVar != null) {
                    hVar.mo7269r();
                }
            }
        }
    }

    /* renamed from: c1 */
    private void m10840c1(boolean z, boolean z2) {
        m10860l0(z || !this.f8722H, false, true, false);
        this.f8755x.mo7658b(z2 ? 1 : 0);
        this.f8736e.mo7341m();
        m10823T0(1);
    }

    /* renamed from: d */
    private void m10841d(C1233b bVar, int i) throws ExoPlaybackException {
        this.f8755x.mo7658b(1);
        MediaSourceList f1Var = this.f8750s;
        if (i == -1) {
            i = f1Var.mo6147p();
        }
        m10794C(f1Var.mo6144e(i, bVar.f8759a, bVar.f8760b));
    }

    /* renamed from: d1 */
    private void m10842d1() throws ExoPlaybackException {
        C1227p1[] p1VarArr;
        this.f8745n.mo7511h();
        for (C1227p1 p1Var : this.f8732a) {
            if (m10807J(p1Var)) {
                m10867q(p1Var);
            }
        }
    }

    /* renamed from: e0 */
    private void m10843e0() {
        this.f8755x.mo7658b(1);
        m10860l0(false, false, false, true);
        this.f8736e.mo7334f();
        m10823T0(this.f8754w.f7203b.mo7743q() ? 4 : 2);
        this.f8750s.mo6151w(this.f8737f.mo14927a());
        this.f8738g.mo7428c(2);
    }

    /* renamed from: e1 */
    private void m10844e1() {
        MediaPeriodHolder i = this.f8749r.mo6008i();
        boolean z = this.f8719C || (i != null && i.f5396a.mo6806a());
        PlaybackInfo h1Var = this.f8754w;
        if (z != h1Var.f7208g) {
            this.f8754w = h1Var.mo6536a(z);
        }
    }

    /* renamed from: f1 */
    private void m10845f1(Timeline x1Var, C1081a aVar, Timeline x1Var2, C1081a aVar2, long j) {
        if (x1Var.mo7743q() || !m10833Y0(x1Var, aVar)) {
            float f = this.f8745n.mo5785c().f7376b;
            PlaybackParameters i1Var = this.f8754w.f7215n;
            if (f != i1Var.f7376b) {
                this.f8745n.mo5787f(i1Var);
            }
            return;
        }
        x1Var.mo7742n(x1Var.mo5991h(aVar.f7391a, this.f8742k).f8952c, this.f8741j);
        this.f8751t.mo7186b((C1265f) Util.m10293i(this.f8741j.f8968m));
        if (j != -9223372036854775807L) {
            this.f8751t.mo7188d(m10875u(x1Var, aVar.f7391a, j));
        } else {
            Object obj = this.f8741j.f8958c;
            Object obj2 = null;
            if (!x1Var2.mo7743q()) {
                obj2 = x1Var2.mo7742n(x1Var2.mo5991h(aVar2.f7391a, this.f8742k).f8952c, this.f8741j).f8958c;
            }
            if (!Util.m10279b(obj2, obj)) {
                this.f8751t.mo7188d(-9223372036854775807L);
            }
        }
    }

    /* renamed from: g */
    private void m10846g(ExoPlaybackException p0Var) throws ExoPlaybackException {
        Assertions.m10149a(p0Var.f8682h && p0Var.f8675a == 1);
        try {
            m10879w0(true);
        } catch (Exception e) {
            p0Var.addSuppressed(e);
            throw p0Var;
        }
    }

    /* renamed from: g0 */
    private void m10847g0() {
        m10860l0(true, false, true, false);
        this.f8736e.mo7337i();
        m10823T0(1);
        this.f8739h.quit();
        synchronized (this) {
            this.f8756y = true;
            notifyAll();
        }
    }

    /* renamed from: g1 */
    private void m10848g1(TrackGroupArray q0Var, TrackSelectorResult oVar) {
        this.f8736e.mo7335g(this.f8732a, q0Var, oVar.f8305c);
    }

    /* renamed from: h */
    private void m10849h(PlayerMessage m1Var) throws ExoPlaybackException {
        if (!m1Var.mo7352j()) {
            try {
                m1Var.mo7348f().mo5791m(m1Var.mo7350h(), m1Var.mo7346d());
            } finally {
                m1Var.mo7353k(true);
            }
        }
    }

    /* renamed from: h0 */
    private void m10850h0(int i, int i2, ShuffleOrder n0Var) throws ExoPlaybackException {
        this.f8755x.mo7658b(1);
        m10794C(this.f8750s.mo6141A(i, i2, n0Var));
    }

    /* renamed from: h1 */
    private void m10851h1() throws ExoPlaybackException, IOException {
        if (!this.f8754w.f7203b.mo7743q() && this.f8750s.mo6148r()) {
            m10822T();
            m10826V();
            m10828W();
            m10824U();
        }
    }

    /* renamed from: i */
    private void m10852i(C1227p1 p1Var) throws ExoPlaybackException {
        if (m10807J(p1Var)) {
            this.f8745n.mo7507a(p1Var);
            m10867q(p1Var);
            p1Var.mo6517d();
            this.f8725K--;
        }
    }

    /* renamed from: i1 */
    private void m10853i1() throws ExoPlaybackException {
        MediaPeriodHolder n = this.f8749r.mo6010n();
        if (n != null) {
            long k = n.f5399d ? n.f5396a.mo6812k() : -9223372036854775807L;
            if (k != -9223372036854775807L) {
                m10863n0(k);
                if (k != this.f8754w.f7220s) {
                    PlaybackInfo h1Var = this.f8754w;
                    this.f8754w = m10802G(h1Var.f7204c, k, h1Var.f7205d);
                    this.f8755x.mo7661e(4);
                }
            } else {
                long i = this.f8745n.mo7512i(n != this.f8749r.mo6011o());
                this.f8727M = i;
                long y = n.mo5762y(i);
                m10820S(this.f8754w.f7220s, y);
                this.f8754w.f7220s = y;
            }
            this.f8754w.f7218q = this.f8749r.mo6008i().mo5748i();
            this.f8754w.f7219r = m10881y();
            PlaybackInfo h1Var2 = this.f8754w;
            if (h1Var2.f7213l && h1Var2.f7206e == 3 && m10833Y0(h1Var2.f7203b, h1Var2.f7204c) && this.f8754w.f7215n.f7376b == 1.0f) {
                float c = this.f8751t.mo7187c(m10871s(), m10881y());
                if (this.f8745n.mo5785c().f7376b != c) {
                    this.f8745n.mo5787f(this.f8754w.f7215n.mo6776b(c));
                    m10798E(this.f8754w.f7215n, this.f8745n.mo5785c().f7376b, false, false);
                }
            }
        }
    }

    /* renamed from: j0 */
    private boolean m10854j0() throws ExoPlaybackException {
        MediaPeriodHolder o = this.f8749r.mo6011o();
        TrackSelectorResult o2 = o.mo5754o();
        int i = 0;
        boolean z = false;
        while (true) {
            C1227p1[] p1VarArr = this.f8732a;
            if (i >= p1VarArr.length) {
                return !z;
            }
            C1227p1 p1Var = p1VarArr[i];
            if (m10807J(p1Var)) {
                boolean z2 = p1Var.mo6523n() != o.f5398c[i];
                if (!o2.mo7332c(i) || z2) {
                    if (!p1Var.mo6532t()) {
                        p1Var.mo6524o(m10873t(o2.f8305c[i]), o.f5398c[i], o.mo5752m(), o.mo5751l());
                    } else if (p1Var.mo5784b()) {
                        m10852i(p1Var);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    /* renamed from: j1 */
    private void m10855j1(float f) {
        C1174h[] hVarArr;
        for (MediaPeriodHolder n = this.f8749r.mo6010n(); n != null; n = n.mo5749j()) {
            for (C1174h hVar : n.mo5754o().f8305c) {
                if (hVar != null) {
                    hVar.mo7250o(f);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x01c1  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10856k() throws p067c.p068a.p069a.p070a.ExoPlaybackException, java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            c.a.a.a.m2.g r1 = r0.f8747p
            long r1 = r1.mo7423a()
            r16.m10851h1()
            c.a.a.a.h1 r3 = r0.f8754w
            int r3 = r3.f7206e
            r5 = 1
            if (r3 == r5) goto L_0x01cd
            r6 = 4
            if (r3 != r6) goto L_0x0017
            goto L_0x01cd
        L_0x0017:
            c.a.a.a.d1 r3 = r0.f8749r
            c.a.a.a.b1 r3 = r3.mo6010n()
            r7 = 10
            if (r3 != 0) goto L_0x0025
            r0.m10876u0(r1, r7)
            return
        L_0x0025:
            java.lang.String r9 = "doSomeWork"
            p067c.p068a.p069a.p070a.p111m2.TraceUtil.m10216a(r9)
            r16.m10853i1()
            boolean r9 = r3.f5399d
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto L_0x00a5
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            c.a.a.a.j2.a0 r9 = r3.f5396a
            c.a.a.a.h1 r15 = r0.f8754w
            long r10 = r15.f7220s
            long r7 = r0.f8743l
            long r10 = r10 - r7
            boolean r7 = r0.f8744m
            r9.mo6817t(r10, r7)
            r7 = 0
            r8 = 1
            r9 = 1
        L_0x004b:
            c.a.a.a.p1[] r10 = r0.f8732a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x00ac
            r10 = r10[r7]
            boolean r11 = m10807J(r10)
            if (r11 != 0) goto L_0x0059
            goto L_0x00a1
        L_0x0059:
            long r4 = r0.f8727M
            r10.mo6490l(r4, r13)
            if (r8 == 0) goto L_0x0068
            boolean r4 = r10.mo5784b()
            if (r4 == 0) goto L_0x0068
            r8 = 1
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            c.a.a.a.j2.l0[] r4 = r3.f5398c
            r4 = r4[r7]
            c.a.a.a.j2.l0 r5 = r10.mo6523n()
            if (r4 == r5) goto L_0x0075
            r4 = 1
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            if (r4 != 0) goto L_0x0080
            boolean r5 = r10.mo6521i()
            if (r5 == 0) goto L_0x0080
            r5 = 1
            goto L_0x0081
        L_0x0080:
            r5 = 0
        L_0x0081:
            if (r4 != 0) goto L_0x0094
            if (r5 != 0) goto L_0x0094
            boolean r4 = r10.mo5786e()
            if (r4 != 0) goto L_0x0094
            boolean r4 = r10.mo5784b()
            if (r4 == 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r4 = 0
            goto L_0x0095
        L_0x0094:
            r4 = 1
        L_0x0095:
            if (r9 == 0) goto L_0x009b
            if (r4 == 0) goto L_0x009b
            r9 = 1
            goto L_0x009c
        L_0x009b:
            r9 = 0
        L_0x009c:
            if (r4 != 0) goto L_0x00a1
            r10.mo6526q()
        L_0x00a1:
            int r7 = r7 + 1
            r5 = 1
            goto L_0x004b
        L_0x00a5:
            c.a.a.a.j2.a0 r4 = r3.f5396a
            r4.mo6816s()
            r8 = 1
            r9 = 1
        L_0x00ac:
            c.a.a.a.c1 r4 = r3.f5401f
            long r4 = r4.f5715e
            if (r8 == 0) goto L_0x00c9
            boolean r7 = r3.f5399d
            if (r7 == 0) goto L_0x00c9
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x00c7
            c.a.a.a.h1 r7 = r0.f8754w
            long r7 = r7.f7220s
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x00c9
        L_0x00c7:
            r4 = 1
            goto L_0x00ca
        L_0x00c9:
            r4 = 0
        L_0x00ca:
            if (r4 == 0) goto L_0x00da
            boolean r5 = r0.f8717A
            if (r5 == 0) goto L_0x00da
            r0.f8717A = r12
            c.a.a.a.h1 r5 = r0.f8754w
            int r5 = r5.f7214m
            r7 = 5
            r0.m10811L0(r12, r5, r12, r7)
        L_0x00da:
            r5 = 3
            if (r4 == 0) goto L_0x00ea
            c.a.a.a.c1 r4 = r3.f5401f
            boolean r4 = r4.f5718h
            if (r4 == 0) goto L_0x00ea
            r0.m10823T0(r6)
            r16.m10842d1()
            goto L_0x0133
        L_0x00ea:
            c.a.a.a.h1 r4 = r0.f8754w
            int r4 = r4.f7206e
            r7 = 2
            if (r4 != r7) goto L_0x0107
            boolean r4 = r0.m10831X0(r9)
            if (r4 == 0) goto L_0x0107
            r0.m10823T0(r5)
            r4 = 0
            r0.f8730P = r4
            boolean r4 = r16.m10829W0()
            if (r4 == 0) goto L_0x0133
            r16.m10837a1()
            goto L_0x0133
        L_0x0107:
            c.a.a.a.h1 r4 = r0.f8754w
            int r4 = r4.f7206e
            if (r4 != r5) goto L_0x0133
            int r4 = r0.f8725K
            if (r4 != 0) goto L_0x0118
            boolean r4 = r16.m10809K()
            if (r4 == 0) goto L_0x011a
            goto L_0x0133
        L_0x0118:
            if (r9 != 0) goto L_0x0133
        L_0x011a:
            boolean r4 = r16.m10829W0()
            r0.f8718B = r4
            r4 = 2
            r0.m10823T0(r4)
            boolean r4 = r0.f8718B
            if (r4 == 0) goto L_0x0130
            r16.m10838b0()
            c.a.a.a.x0 r4 = r0.f8751t
            r4.mo7185a()
        L_0x0130:
            r16.m10842d1()
        L_0x0133:
            c.a.a.a.h1 r4 = r0.f8754w
            int r4 = r4.f7206e
            r7 = 2
            if (r4 != r7) goto L_0x017e
            r4 = 0
        L_0x013b:
            c.a.a.a.p1[] r7 = r0.f8732a
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0160
            r7 = r7[r4]
            boolean r7 = m10807J(r7)
            if (r7 == 0) goto L_0x015d
            c.a.a.a.p1[] r7 = r0.f8732a
            r7 = r7[r4]
            c.a.a.a.j2.l0 r7 = r7.mo6523n()
            c.a.a.a.j2.l0[] r8 = r3.f5398c
            r8 = r8[r4]
            if (r7 != r8) goto L_0x015d
            c.a.a.a.p1[] r7 = r0.f8732a
            r7 = r7[r4]
            r7.mo6526q()
        L_0x015d:
            int r4 = r4 + 1
            goto L_0x013b
        L_0x0160:
            c.a.a.a.h1 r3 = r0.f8754w
            boolean r4 = r3.f7208g
            if (r4 != 0) goto L_0x017e
            long r3 = r3.f7219r
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x017e
            boolean r3 = r16.m10805I()
            if (r3 != 0) goto L_0x0176
            goto L_0x017e
        L_0x0176:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x017e:
            boolean r3 = r0.f8724J
            c.a.a.a.h1 r4 = r0.f8754w
            boolean r7 = r4.f7216o
            if (r3 == r7) goto L_0x018c
            c.a.a.a.h1 r3 = r4.mo6539d(r3)
            r0.f8754w = r3
        L_0x018c:
            boolean r3 = r16.m10829W0()
            if (r3 == 0) goto L_0x0198
            c.a.a.a.h1 r3 = r0.f8754w
            int r3 = r3.f7206e
            if (r3 == r5) goto L_0x019f
        L_0x0198:
            c.a.a.a.h1 r3 = r0.f8754w
            int r3 = r3.f7206e
            r4 = 2
            if (r3 != r4) goto L_0x01a8
        L_0x019f:
            r3 = 10
            boolean r1 = r0.m10818R(r1, r3)
            r2 = 1
            r1 = r1 ^ r2
            goto L_0x01bb
        L_0x01a8:
            int r4 = r0.f8725K
            if (r4 == 0) goto L_0x01b4
            if (r3 == r6) goto L_0x01b4
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.m10876u0(r1, r3)
            goto L_0x01ba
        L_0x01b4:
            c.a.a.a.m2.q r1 = r0.f8738g
            r2 = 2
            r1.mo7431f(r2)
        L_0x01ba:
            r1 = 0
        L_0x01bb:
            c.a.a.a.h1 r2 = r0.f8754w
            boolean r3 = r2.f7217p
            if (r3 == r1) goto L_0x01c7
            c.a.a.a.h1 r1 = r2.mo6544i(r1)
            r0.f8754w = r1
        L_0x01c7:
            r0.f8723I = r12
            p067c.p068a.p069a.p070a.p111m2.TraceUtil.m10218c()
            return
        L_0x01cd:
            c.a.a.a.m2.q r1 = r0.f8738g
            r2 = 2
            r1.mo7431f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.ExoPlayerImplInternal.m10856k():void");
    }

    /* renamed from: k0 */
    private void m10857k0() throws ExoPlaybackException {
        float f = this.f8745n.mo5785c().f7376b;
        MediaPeriodHolder n = this.f8749r.mo6010n();
        MediaPeriodHolder o = this.f8749r.mo6011o();
        boolean z = true;
        while (n != null && n.f5399d) {
            TrackSelectorResult v = n.mo5759v(f, this.f8754w.f7203b);
            int i = 0;
            if (!v.mo7330a(n.mo5754o())) {
                if (z) {
                    MediaPeriodHolder n2 = this.f8749r.mo6010n();
                    MediaPeriodHolder b1Var = n2;
                    boolean[] zArr = new boolean[this.f8732a.length];
                    long b = b1Var.mo5746b(v, this.f8754w.f7220s, this.f8749r.mo6016y(n2), zArr);
                    PlaybackInfo h1Var = this.f8754w;
                    MediaPeriodHolder b1Var2 = n2;
                    PlaybackInfo G = m10802G(h1Var.f7204c, b, h1Var.f7205d);
                    this.f8754w = G;
                    if (!(G.f7206e == 4 || b == G.f7220s)) {
                        this.f8755x.mo7661e(4);
                        m10863n0(b);
                    }
                    boolean[] zArr2 = new boolean[this.f8732a.length];
                    while (true) {
                        C1227p1[] p1VarArr = this.f8732a;
                        if (i >= p1VarArr.length) {
                            break;
                        }
                        C1227p1 p1Var = p1VarArr[i];
                        zArr2[i] = m10807J(p1Var);
                        SampleStream l0Var = b1Var2.f5398c[i];
                        if (zArr2[i]) {
                            if (l0Var != p1Var.mo6523n()) {
                                m10852i(p1Var);
                            } else if (zArr[i]) {
                                p1Var.mo6529s(this.f8727M);
                            }
                        }
                        i++;
                    }
                    m10864o(zArr2);
                } else {
                    this.f8749r.mo6016y(n);
                    if (n.f5399d) {
                        n.mo5745a(v, Math.max(n.f5401f.f5712b, n.mo5762y(this.f8727M)), false);
                    }
                }
                m10792B(true);
                if (this.f8754w.f7206e != 4) {
                    m10815P();
                    m10853i1();
                    this.f8738g.mo7428c(2);
                }
                return;
            }
            if (n == o) {
                z = false;
            }
            n = n.mo5749j();
        }
    }

    /* renamed from: k1 */
    private synchronized void m10858k1(C1325k<Boolean> kVar, long j) {
        long c = this.f8747p.mo7425c() + j;
        boolean z = false;
        while (!((Boolean) kVar.mo5610a()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = c - this.f8747p.mo7425c();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: l */
    private void m10859l(int i, boolean z) throws ExoPlaybackException {
        C1227p1 p1Var = this.f8732a[i];
        if (!m10807J(p1Var)) {
            MediaPeriodHolder o = this.f8749r.mo6011o();
            boolean z2 = o == this.f8749r.mo6010n();
            TrackSelectorResult o2 = o.mo5754o();
            RendererConfiguration s1Var = o2.f8304b[i];
            Format[] t = m10873t(o2.f8305c[i]);
            boolean z3 = m10829W0() && this.f8754w.f7206e == 3;
            boolean z4 = !z && z3;
            this.f8725K++;
            p1Var.mo6522j(s1Var, t, o.f5398c[i], this.f8727M, z4, z2, o.mo5752m(), o.mo5751l());
            p1Var.mo5791m(103, new C1232a());
            this.f8745n.mo7508b(p1Var);
            if (z3) {
                p1Var.start();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f4  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10860l0(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            r32 = this;
            r1 = r32
            c.a.a.a.m2.q r0 = r1.f8738g
            r2 = 2
            r0.mo7431f(r2)
            r2 = 0
            r1.f8718B = r2
            c.a.a.a.n0 r0 = r1.f8745n
            r0.mo7511h()
            r3 = 0
            r1.f8727M = r3
            c.a.a.a.p1[] r3 = r1.f8732a
            int r4 = r3.length
            r5 = 0
        L_0x0018:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x002d
            r0 = r3[r5]
            r1.m10852i(r0)     // Catch:{ p0 -> 0x0024, RuntimeException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            java.lang.String r7 = "Disable failed."
            p067c.p068a.p069a.p070a.p111m2.Log.m10382d(r6, r7, r0)
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            if (r33 == 0) goto L_0x0045
            c.a.a.a.p1[] r3 = r1.f8732a
            int r4 = r3.length
            r5 = 0
        L_0x0033:
            if (r5 >= r4) goto L_0x0045
            r0 = r3[r5]
            r0.reset()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            p067c.p068a.p069a.p070a.p111m2.Log.m10382d(r6, r0, r7)
        L_0x0042:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0045:
            r1.f8725K = r2
            c.a.a.a.h1 r0 = r1.f8754w
            c.a.a.a.j2.d0$a r3 = r0.f7204c
            long r4 = r0.f7220s
            c.a.a.a.h1 r0 = r1.f8754w
            c.a.a.a.x1$b r6 = r1.f8742k
            c.a.a.a.x1$c r7 = r1.f8741j
            boolean r0 = m10835Z0(r0, r6, r7)
            if (r0 == 0) goto L_0x005e
            c.a.a.a.h1 r0 = r1.f8754w
            long r6 = r0.f7205d
            goto L_0x0062
        L_0x005e:
            c.a.a.a.h1 r0 = r1.f8754w
            long r6 = r0.f7220s
        L_0x0062:
            r0 = 0
            if (r34 == 0) goto L_0x0097
            r1.f8726L = r0
            c.a.a.a.h1 r3 = r1.f8754w
            c.a.a.a.x1 r3 = r3.f7203b
            android.util.Pair r3 = r1.m10878w(r3)
            java.lang.Object r4 = r3.first
            c.a.a.a.j2.d0$a r4 = (p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a) r4
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            c.a.a.a.h1 r3 = r1.f8754w
            c.a.a.a.j2.d0$a r3 = r3.f7204c
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0091
            r3 = 1
            r20 = r4
            r28 = r5
            r12 = r7
            goto L_0x009d
        L_0x0091:
            r20 = r4
            r28 = r5
            r12 = r7
            goto L_0x009c
        L_0x0097:
            r20 = r3
            r28 = r4
            r12 = r6
        L_0x009c:
            r3 = 0
        L_0x009d:
            c.a.a.a.d1 r4 = r1.f8749r
            r4.mo6006e()
            r1.f8719C = r2
            c.a.a.a.h1 r2 = new c.a.a.a.h1
            c.a.a.a.h1 r4 = r1.f8754w
            c.a.a.a.x1 r10 = r4.f7203b
            int r14 = r4.f7206e
            if (r36 == 0) goto L_0x00b0
            r15 = r0
            goto L_0x00b3
        L_0x00b0:
            c.a.a.a.p0 r5 = r4.f7207f
            r15 = r5
        L_0x00b3:
            r16 = 0
            if (r3 == 0) goto L_0x00ba
            c.a.a.a.j2.q0 r5 = p067c.p068a.p069a.p070a.p097j2.TrackGroupArray.f7609a
            goto L_0x00bc
        L_0x00ba:
            c.a.a.a.j2.q0 r5 = r4.f7209h
        L_0x00bc:
            r17 = r5
            if (r3 == 0) goto L_0x00c3
            c.a.a.a.l2.o r5 = r1.f8735d
            goto L_0x00c5
        L_0x00c3:
            c.a.a.a.l2.o r5 = r4.f7210i
        L_0x00c5:
            r18 = r5
            if (r3 == 0) goto L_0x00ce
            c.a.b.b.r r3 = p067c.p068a.p134b.p136b.ImmutableList.m11917p()
            goto L_0x00d0
        L_0x00ce:
            java.util.List<c.a.a.a.h2.a> r3 = r4.f7211j
        L_0x00d0:
            r19 = r3
            c.a.a.a.h1 r3 = r1.f8754w
            boolean r4 = r3.f7213l
            r21 = r4
            int r4 = r3.f7214m
            r22 = r4
            c.a.a.a.i1 r3 = r3.f7215n
            r23 = r3
            r26 = 0
            boolean r3 = r1.f8724J
            r30 = r3
            r31 = 0
            r9 = r2
            r11 = r20
            r24 = r28
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31)
            r1.f8754w = r2
            if (r35 == 0) goto L_0x00f9
            c.a.a.a.f1 r2 = r1.f8750s
            r2.mo6152y()
        L_0x00f9:
            r1.f8730P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.ExoPlayerImplInternal.m10860l0(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: m0 */
    private void m10861m0() {
        MediaPeriodHolder n = this.f8749r.mo6010n();
        this.f8717A = n != null && n.f5401f.f5717g && this.f8757z;
    }

    /* renamed from: n */
    private void m10862n() throws ExoPlaybackException {
        m10864o(new boolean[this.f8732a.length]);
    }

    /* renamed from: n0 */
    private void m10863n0(long j) throws ExoPlaybackException {
        C1227p1[] p1VarArr;
        MediaPeriodHolder n = this.f8749r.mo6010n();
        if (n != null) {
            j = n.mo5763z(j);
        }
        this.f8727M = j;
        this.f8745n.mo7509d(j);
        for (C1227p1 p1Var : this.f8732a) {
            if (m10807J(p1Var)) {
                p1Var.mo6529s(this.f8727M);
            }
        }
        m10834Z();
    }

    /* renamed from: o */
    private void m10864o(boolean[] zArr) throws ExoPlaybackException {
        MediaPeriodHolder o = this.f8749r.mo6011o();
        TrackSelectorResult o2 = o.mo5754o();
        for (int i = 0; i < this.f8732a.length; i++) {
            if (!o2.mo7332c(i)) {
                this.f8732a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f8732a.length; i2++) {
            if (o2.mo7332c(i2)) {
                m10859l(i2, zArr[i2]);
            }
        }
        o.f5402g = true;
    }

    /* renamed from: o0 */
    private static void m10865o0(Timeline x1Var, C1235d dVar, C1257c cVar, C1256b bVar) {
        int i = x1Var.mo7742n(x1Var.mo5991h(dVar.f8770d, bVar).f8952c, cVar).f8971p;
        Object obj = x1Var.mo5990g(i, bVar, true).f8951b;
        long j = bVar.f8953d;
        dVar.mo7656b(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    /* renamed from: p0 */
    private static boolean m10866p0(C1235d dVar, Timeline x1Var, Timeline x1Var2, int i, boolean z, C1257c cVar, C1256b bVar) {
        long j;
        C1235d dVar2 = dVar;
        Timeline x1Var3 = x1Var;
        Timeline x1Var4 = x1Var2;
        C1257c cVar2 = cVar;
        C1256b bVar2 = bVar;
        Object obj = dVar2.f8770d;
        if (obj == null) {
            if (dVar2.f8767a.mo7347e() == Long.MIN_VALUE) {
                j = -9223372036854775807L;
            } else {
                j = C.m8860c(dVar2.f8767a.mo7347e());
            }
            Pair s0 = m10872s0(x1Var, new C1239h(dVar2.f8767a.mo7349g(), dVar2.f8767a.mo7351i(), j), false, i, z, cVar, bVar);
            if (s0 == null) {
                return false;
            }
            dVar.mo7656b(x1Var3.mo5987b(s0.first), ((Long) s0.second).longValue(), s0.first);
            if (dVar2.f8767a.mo7347e() == Long.MIN_VALUE) {
                m10865o0(x1Var3, dVar, cVar2, bVar2);
            }
            return true;
        }
        int b = x1Var3.mo5987b(obj);
        if (b == -1) {
            return false;
        }
        if (dVar2.f8767a.mo7347e() == Long.MIN_VALUE) {
            m10865o0(x1Var3, dVar, cVar2, bVar2);
            return true;
        }
        dVar2.f8768b = b;
        x1Var4.mo5991h(dVar2.f8770d, bVar2);
        if (x1Var4.mo7742n(bVar2.f8952c, cVar2).f8969n) {
            long l = dVar2.f8769c + bVar.mo7758l();
            Pair j2 = x1Var.mo7740j(cVar, bVar, x1Var3.mo5991h(dVar2.f8770d, bVar2).f8952c, l);
            dVar.mo7656b(x1Var3.mo5987b(j2.first), ((Long) j2.second).longValue(), j2.first);
        }
        return true;
    }

    /* renamed from: q */
    private void m10867q(C1227p1 p1Var) throws ExoPlaybackException {
        if (p1Var.getState() == 2) {
            p1Var.stop();
        }
    }

    /* renamed from: q0 */
    private void m10868q0(Timeline x1Var, Timeline x1Var2) {
        if (!x1Var.mo7743q() || !x1Var2.mo7743q()) {
            for (int size = this.f8746o.size() - 1; size >= 0; size--) {
                if (!m10866p0((C1235d) this.f8746o.get(size), x1Var, x1Var2, this.f8720D, this.f8721G, this.f8741j, this.f8742k)) {
                    ((C1235d) this.f8746o.get(size)).f8767a.mo7353k(false);
                    this.f8746o.remove(size);
                }
            }
            Collections.sort(this.f8746o);
        }
    }

    /* renamed from: r */
    private ImmutableList<Metadata> m10869r(C1174h[] hVarArr) {
        C1378a aVar = new C1378a();
        boolean z = false;
        for (C1174h hVar : hVarArr) {
            if (hVar != null) {
                Metadata aVar2 = hVar.mo7260e(0).f8812j;
                if (aVar2 == null) {
                    aVar.mo8440d(new Metadata(new C1034b[0]));
                } else {
                    aVar.mo8440d(aVar2);
                    z = true;
                }
            }
        }
        return z ? aVar.mo8441e() : ImmutableList.m11917p();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015e  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1238g m10870r0(p067c.p068a.p069a.p070a.Timeline r21, p067c.p068a.p069a.p070a.PlaybackInfo r22, p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1239h r23, p067c.p068a.p069a.p070a.MediaPeriodQueue r24, int r25, boolean r26, p067c.p068a.p069a.p070a.Timeline.C1257c r27, p067c.p068a.p069a.p070a.Timeline.C1256b r28) {
        /*
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r26
            r11 = r28
            boolean r0 = r21.mo7743q()
            if (r0 == 0) goto L_0x0025
            c.a.a.a.r0$g r0 = new c.a.a.a.r0$g
            c.a.a.a.j2.d0$a r2 = p067c.p068a.p069a.p070a.PlaybackInfo.m8678l()
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 1
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x0025:
            c.a.a.a.j2.d0$a r12 = r8.f7204c
            java.lang.Object r13 = r12.f7391a
            r14 = r27
            boolean r0 = m10835Z0(r8, r11, r14)
            if (r0 == 0) goto L_0x0034
            long r1 = r8.f7205d
            goto L_0x0036
        L_0x0034:
            long r1 = r8.f7220s
        L_0x0036:
            r15 = r1
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            r19 = 0
            r20 = 1
            if (r9 == 0) goto L_0x008d
            r2 = 1
            r0 = r21
            r1 = r23
            r3 = r25
            r4 = r26
            r5 = r27
            r14 = -1
            r6 = r28
            android.util.Pair r0 = m10872s0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x005f
            int r0 = r7.mo5986a(r10)
            r1 = 0
            r2 = 0
            r3 = 1
            goto L_0x0087
        L_0x005f:
            long r1 = r9.f8786c
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x006f
            java.lang.Object r0 = r0.first
            c.a.a.a.x1$b r0 = r7.mo5991h(r0, r11)
            int r6 = r0.f8952c
            r0 = 0
            goto L_0x007b
        L_0x006f:
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r15 = r0.longValue()
            r0 = 1
            r6 = -1
        L_0x007b:
            int r1 = r8.f7206e
            r2 = 4
            if (r1 != r2) goto L_0x0082
            r1 = 1
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            r2 = r1
            r3 = 0
            r1 = r0
            r0 = r6
        L_0x0087:
            r9 = r1
            r6 = r2
            r10 = r3
        L_0x008a:
            r3 = r0
            goto L_0x0104
        L_0x008d:
            r14 = -1
            c.a.a.a.x1 r1 = r8.f7203b
            boolean r1 = r1.mo7743q()
            if (r1 == 0) goto L_0x00a0
            int r0 = r7.mo5986a(r10)
        L_0x009a:
            r3 = r0
        L_0x009b:
            r6 = 0
            r9 = 0
        L_0x009d:
            r10 = 0
            goto L_0x0104
        L_0x00a0:
            int r1 = r7.mo5987b(r13)
            if (r1 != r14) goto L_0x00ca
            c.a.a.a.x1 r5 = r8.f7203b
            r0 = r27
            r1 = r28
            r2 = r25
            r3 = r26
            r4 = r13
            r6 = r21
            java.lang.Object r0 = m10874t0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00bf
            int r0 = r7.mo5986a(r10)
            r3 = 1
            goto L_0x00c6
        L_0x00bf:
            c.a.a.a.x1$b r0 = r7.mo5991h(r0, r11)
            int r0 = r0.f8952c
            r3 = 0
        L_0x00c6:
            r10 = r3
            r6 = 0
            r9 = 0
            goto L_0x008a
        L_0x00ca:
            if (r0 == 0) goto L_0x0102
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00d7
            c.a.a.a.x1$b r0 = r7.mo5991h(r13, r11)
            int r0 = r0.f8952c
            goto L_0x009a
        L_0x00d7:
            c.a.a.a.x1 r0 = r8.f7203b
            java.lang.Object r1 = r12.f7391a
            r0.mo5991h(r1, r11)
            long r0 = r28.mo7758l()
            long r4 = r15 + r0
            c.a.a.a.x1$b r0 = r7.mo5991h(r13, r11)
            int r3 = r0.f8952c
            r0 = r21
            r1 = r27
            r2 = r28
            android.util.Pair r0 = r0.mo7740j(r1, r2, r3, r4)
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r15 = r0.longValue()
            r3 = -1
            r6 = 0
            r9 = 1
            goto L_0x009d
        L_0x0102:
            r3 = -1
            goto L_0x009b
        L_0x0104:
            if (r3 == r14) goto L_0x0125
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r21
            r1 = r27
            r2 = r28
            android.util.Pair r0 = r0.mo7740j(r1, r2, r3, r4)
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r15 = r0.longValue()
            r2 = r24
            r0 = r15
            r4 = r17
            goto L_0x0129
        L_0x0125:
            r2 = r24
            r0 = r15
            r4 = r0
        L_0x0129:
            c.a.a.a.j2.d0$a r2 = r2.mo6017z(r7, r13, r0)
            int r3 = r2.f7395e
            if (r3 == r14) goto L_0x013c
            int r3 = r12.f7395e
            if (r3 == r14) goto L_0x013a
            int r14 = r2.f7392b
            if (r14 < r3) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r3 = 0
            goto L_0x013d
        L_0x013c:
            r3 = 1
        L_0x013d:
            java.lang.Object r14 = r12.f7391a
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x0155
            boolean r13 = r12.mo6822b()
            if (r13 != 0) goto L_0x0155
            boolean r13 = r2.mo6822b()
            if (r13 != 0) goto L_0x0155
            if (r3 == 0) goto L_0x0155
            r19 = 1
        L_0x0155:
            if (r19 == 0) goto L_0x0158
            r2 = r12
        L_0x0158:
            boolean r3 = r2.mo6822b()
            if (r3 == 0) goto L_0x017d
            boolean r0 = r2.equals(r12)
            if (r0 == 0) goto L_0x0167
            long r0 = r8.f7220s
            goto L_0x017d
        L_0x0167:
            java.lang.Object r0 = r2.f7391a
            r7.mo5991h(r0, r11)
            int r0 = r2.f7393c
            int r1 = r2.f7392b
            int r1 = r11.mo7755i(r1)
            if (r0 != r1) goto L_0x017b
            long r0 = r28.mo7752g()
            goto L_0x017d
        L_0x017b:
            r0 = 0
        L_0x017d:
            r7 = r0
            c.a.a.a.r0$g r11 = new c.a.a.a.r0$g
            r0 = r11
            r1 = r2
            r2 = r7
            r7 = r10
            r8 = r9
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.ExoPlayerImplInternal.m10870r0(c.a.a.a.x1, c.a.a.a.h1, c.a.a.a.r0$h, c.a.a.a.d1, int, boolean, c.a.a.a.x1$c, c.a.a.a.x1$b):c.a.a.a.r0$g");
    }

    /* renamed from: s */
    private long m10871s() {
        PlaybackInfo h1Var = this.f8754w;
        return m10875u(h1Var.f7203b, h1Var.f7204c.f7391a, h1Var.f7220s);
    }

    /* renamed from: s0 */
    private static Pair<Object, Long> m10872s0(Timeline x1Var, C1239h hVar, boolean z, int i, boolean z2, C1257c cVar, C1256b bVar) {
        Timeline x1Var2 = x1Var;
        C1239h hVar2 = hVar;
        C1256b bVar2 = bVar;
        Timeline x1Var3 = hVar2.f8784a;
        if (x1Var.mo7743q()) {
            return null;
        }
        Timeline x1Var4 = x1Var3.mo7743q() ? x1Var2 : x1Var3;
        try {
            Pair<Object, Long> j = x1Var4.mo7740j(cVar, bVar, hVar2.f8785b, hVar2.f8786c);
            if (x1Var.equals(x1Var4)) {
                return j;
            }
            if (x1Var.mo5987b(j.first) != -1) {
                x1Var4.mo5991h(j.first, bVar2);
                if (x1Var4.mo7742n(bVar2.f8952c, cVar).f8969n) {
                    j = x1Var.mo7740j(cVar, bVar, x1Var.mo5991h(j.first, bVar2).f8952c, hVar2.f8786c);
                }
                return j;
            }
            C1257c cVar2 = cVar;
            if (z) {
                Object t0 = m10874t0(cVar, bVar, i, z2, j.first, x1Var4, x1Var);
                if (t0 != null) {
                    return x1Var.mo7740j(cVar, bVar, x1Var.mo5991h(t0, bVar2).f8952c, -9223372036854775807L);
                }
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: t */
    private static Format[] m10873t(C1174h hVar) {
        int length = hVar != null ? hVar.length() : 0;
        Format[] u0VarArr = new Format[length];
        for (int i = 0; i < length; i++) {
            u0VarArr[i] = hVar.mo7260e(i);
        }
        return u0VarArr;
    }

    /* renamed from: t0 */
    static Object m10874t0(C1257c cVar, C1256b bVar, int i, boolean z, Object obj, Timeline x1Var, Timeline x1Var2) {
        int b = x1Var.mo5987b(obj);
        int i2 = x1Var.mo6972i();
        int i3 = b;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && i4 == -1; i5++) {
            i3 = x1Var.mo7736d(i3, bVar, cVar, i, z);
            if (i3 == -1) {
                break;
            }
            i4 = x1Var2.mo5987b(x1Var.mo5993m(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return x1Var2.mo5993m(i4);
    }

    /* renamed from: u */
    private long m10875u(Timeline x1Var, Object obj, long j) {
        x1Var.mo7742n(x1Var.mo5991h(obj, this.f8742k).f8952c, this.f8741j);
        C1257c cVar = this.f8741j;
        if (cVar.f8963h != -9223372036854775807L && cVar.mo7768f()) {
            C1257c cVar2 = this.f8741j;
            if (cVar2.f8966k) {
                return C.m8860c(cVar2.mo7762a() - this.f8741j.f8963h) - (j + this.f8742k.mo7758l());
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: u0 */
    private void m10876u0(long j, long j2) {
        this.f8738g.mo7431f(2);
        this.f8738g.mo7430e(2, j + j2);
    }

    /* renamed from: v */
    private long m10877v() {
        MediaPeriodHolder o = this.f8749r.mo6011o();
        if (o == null) {
            return 0;
        }
        long l = o.mo5751l();
        if (!o.f5399d) {
            return l;
        }
        int i = 0;
        while (true) {
            C1227p1[] p1VarArr = this.f8732a;
            if (i >= p1VarArr.length) {
                return l;
            }
            if (m10807J(p1VarArr[i]) && this.f8732a[i].mo6523n() == o.f5398c[i]) {
                long r = this.f8732a[i].mo6527r();
                if (r == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l = Math.max(r, l);
            }
            i++;
        }
    }

    /* renamed from: w */
    private Pair<C1081a, Long> m10878w(Timeline x1Var) {
        long j = 0;
        if (x1Var.mo7743q()) {
            return Pair.create(PlaybackInfo.m8678l(), Long.valueOf(0));
        }
        Timeline x1Var2 = x1Var;
        Pair j2 = x1Var2.mo7740j(this.f8741j, this.f8742k, x1Var.mo5986a(this.f8721G), -9223372036854775807L);
        C1081a z = this.f8749r.mo6017z(x1Var, j2.first, 0);
        long longValue = ((Long) j2.second).longValue();
        if (z.mo6822b()) {
            x1Var.mo5991h(z.f7391a, this.f8742k);
            if (z.f7393c == this.f8742k.mo7755i(z.f7392b)) {
                j = this.f8742k.mo7752g();
            }
            longValue = j;
        }
        return Pair.create(z, Long.valueOf(longValue));
    }

    /* renamed from: w0 */
    private void m10879w0(boolean z) throws ExoPlaybackException {
        C1081a aVar = this.f8749r.mo6010n().f5401f.f5711a;
        long z0 = m10884z0(aVar, this.f8754w.f7220s, true, false);
        if (z0 != this.f8754w.f7220s) {
            this.f8754w = m10802G(aVar, z0, this.f8754w.f7205d);
            if (z) {
                this.f8755x.mo7661e(4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4 A[Catch:{ all -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0166  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10880x0(p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1239h r19) throws p067c.p068a.p069a.p070a.ExoPlaybackException {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            c.a.a.a.r0$e r1 = r8.f8755x
            r9 = 1
            r1.mo7658b(r9)
            c.a.a.a.h1 r1 = r8.f8754w
            c.a.a.a.x1 r1 = r1.f7203b
            int r4 = r8.f8720D
            boolean r5 = r8.f8721G
            c.a.a.a.x1$c r6 = r8.f8741j
            c.a.a.a.x1$b r7 = r8.f8742k
            r3 = 1
            r2 = r19
            android.util.Pair r1 = m10872s0(r1, r2, r3, r4, r5, r6, r7)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x0044
            c.a.a.a.h1 r7 = r8.f8754w
            c.a.a.a.x1 r7 = r7.f7203b
            android.util.Pair r7 = r8.m10878w(r7)
            java.lang.Object r10 = r7.first
            c.a.a.a.j2.d0$a r10 = (p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a) r10
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            c.a.a.a.h1 r7 = r8.f8754w
            c.a.a.a.x1 r7 = r7.f7203b
            boolean r7 = r7.mo7743q()
            r7 = r7 ^ r9
            r13 = r4
            goto L_0x0096
        L_0x0044:
            java.lang.Object r7 = r1.first
            java.lang.Object r10 = r1.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r11 = r10.longValue()
            long r13 = r0.f8786c
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0056
            r13 = r4
            goto L_0x0057
        L_0x0056:
            r13 = r11
        L_0x0057:
            c.a.a.a.d1 r10 = r8.f8749r
            c.a.a.a.h1 r15 = r8.f8754w
            c.a.a.a.x1 r15 = r15.f7203b
            c.a.a.a.j2.d0$a r7 = r10.mo6017z(r15, r7, r11)
            boolean r10 = r7.mo6822b()
            if (r10 == 0) goto L_0x008b
            c.a.a.a.h1 r4 = r8.f8754w
            c.a.a.a.x1 r4 = r4.f7203b
            java.lang.Object r5 = r7.f7391a
            c.a.a.a.x1$b r10 = r8.f8742k
            r4.mo5991h(r5, r10)
            c.a.a.a.x1$b r4 = r8.f8742k
            int r5 = r7.f7392b
            int r4 = r4.mo7755i(r5)
            int r5 = r7.f7393c
            if (r4 != r5) goto L_0x0086
            c.a.a.a.x1$b r4 = r8.f8742k
            long r4 = r4.mo7752g()
            r11 = r4
            goto L_0x0088
        L_0x0086:
            r11 = 0
        L_0x0088:
            r10 = r7
            r7 = 1
            goto L_0x0096
        L_0x008b:
            long r2 = r0.f8786c
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0093
            r2 = 1
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            r10 = r7
            r7 = r2
        L_0x0096:
            r5 = 2
            c.a.a.a.h1 r2 = r8.f8754w     // Catch:{ all -> 0x0157 }
            c.a.a.a.x1 r2 = r2.f7203b     // Catch:{ all -> 0x0157 }
            boolean r2 = r2.mo7743q()     // Catch:{ all -> 0x0157 }
            if (r2 == 0) goto L_0x00a9
            r8.f8726L = r0     // Catch:{ all -> 0x00a4 }
            goto L_0x00b8
        L_0x00a4:
            r0 = move-exception
            r3 = r11
            r15 = 2
            goto L_0x015a
        L_0x00a9:
            r0 = 4
            if (r1 != 0) goto L_0x00bc
            c.a.a.a.h1 r1 = r8.f8754w     // Catch:{ all -> 0x00a4 }
            int r1 = r1.f7206e     // Catch:{ all -> 0x00a4 }
            if (r1 == r9) goto L_0x00b5
            r8.m10823T0(r0)     // Catch:{ all -> 0x00a4 }
        L_0x00b5:
            r8.m10860l0(r6, r9, r6, r9)     // Catch:{ all -> 0x00a4 }
        L_0x00b8:
            r3 = r11
            r15 = 2
            goto L_0x013e
        L_0x00bc:
            c.a.a.a.h1 r1 = r8.f8754w     // Catch:{ all -> 0x0157 }
            c.a.a.a.j2.d0$a r1 = r1.f7204c     // Catch:{ all -> 0x0157 }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x0116
            c.a.a.a.d1 r1 = r8.f8749r     // Catch:{ all -> 0x0157 }
            c.a.a.a.b1 r1 = r1.mo6010n()     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x00e1
            boolean r2 = r1.f5399d     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x00e1
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00e1
            c.a.a.a.j2.a0 r1 = r1.f5396a     // Catch:{ all -> 0x00a4 }
            c.a.a.a.u1 r2 = r8.f8753v     // Catch:{ all -> 0x00a4 }
            long r1 = r1.mo6811g(r11, r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x00e2
        L_0x00e1:
            r1 = r11
        L_0x00e2:
            long r3 = p067c.p068a.p069a.p070a.C.m8861d(r1)     // Catch:{ all -> 0x0157 }
            c.a.a.a.h1 r15 = r8.f8754w     // Catch:{ all -> 0x0157 }
            r16 = r1
            long r0 = r15.f7220s     // Catch:{ all -> 0x0157 }
            long r0 = p067c.p068a.p069a.p070a.C.m8861d(r0)     // Catch:{ all -> 0x0157 }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0112
            c.a.a.a.h1 r0 = r8.f8754w     // Catch:{ all -> 0x0157 }
            int r1 = r0.f7206e     // Catch:{ all -> 0x0157 }
            if (r1 == r5) goto L_0x00fd
            r2 = 3
            if (r1 != r2) goto L_0x0112
        L_0x00fd:
            long r3 = r0.f7220s     // Catch:{ all -> 0x0157 }
            r1 = r18
            r2 = r10
            r15 = 2
            r5 = r13
            c.a.a.a.h1 r0 = r1.m10802G(r2, r3, r5)
            r8.f8754w = r0
            if (r7 == 0) goto L_0x0111
            c.a.a.a.r0$e r0 = r8.f8755x
            r0.mo7661e(r15)
        L_0x0111:
            return
        L_0x0112:
            r15 = 2
            r1 = r16
            goto L_0x0118
        L_0x0116:
            r15 = 2
            r1 = r11
        L_0x0118:
            c.a.a.a.h1 r0 = r8.f8754w     // Catch:{ all -> 0x0155 }
            int r0 = r0.f7206e     // Catch:{ all -> 0x0155 }
            r3 = 4
            if (r0 != r3) goto L_0x0121
            r0 = 1
            goto L_0x0122
        L_0x0121:
            r0 = 0
        L_0x0122:
            long r16 = r8.m10882y0(r10, r1, r0)     // Catch:{ all -> 0x0155 }
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r9 = 0
        L_0x012c:
            r9 = r9 | r7
            c.a.a.a.h1 r0 = r8.f8754w     // Catch:{ all -> 0x0150 }
            c.a.a.a.x1 r4 = r0.f7203b     // Catch:{ all -> 0x0150 }
            c.a.a.a.j2.d0$a r5 = r0.f7204c     // Catch:{ all -> 0x0150 }
            r1 = r18
            r2 = r4
            r3 = r10
            r6 = r13
            r1.m10845f1(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0150 }
            r7 = r9
            r3 = r16
        L_0x013e:
            r1 = r18
            r2 = r10
            r5 = r13
            c.a.a.a.h1 r0 = r1.m10802G(r2, r3, r5)
            r8.f8754w = r0
            if (r7 == 0) goto L_0x014f
            c.a.a.a.r0$e r0 = r8.f8755x
            r0.mo7661e(r15)
        L_0x014f:
            return
        L_0x0150:
            r0 = move-exception
            r7 = r9
            r3 = r16
            goto L_0x015a
        L_0x0155:
            r0 = move-exception
            goto L_0x0159
        L_0x0157:
            r0 = move-exception
            r15 = 2
        L_0x0159:
            r3 = r11
        L_0x015a:
            r1 = r18
            r2 = r10
            r5 = r13
            c.a.a.a.h1 r1 = r1.m10802G(r2, r3, r5)
            r8.f8754w = r1
            if (r7 == 0) goto L_0x016b
            c.a.a.a.r0$e r1 = r8.f8755x
            r1.mo7661e(r15)
        L_0x016b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.ExoPlayerImplInternal.m10880x0(c.a.a.a.r0$h):void");
    }

    /* renamed from: y */
    private long m10881y() {
        return m10883z(this.f8754w.f7218q);
    }

    /* renamed from: y0 */
    private long m10882y0(C1081a aVar, long j, boolean z) throws ExoPlaybackException {
        return m10884z0(aVar, j, this.f8749r.mo6010n() != this.f8749r.mo6011o(), z);
    }

    /* renamed from: z */
    private long m10883z(long j) {
        MediaPeriodHolder i = this.f8749r.mo6008i();
        if (i == null) {
            return 0;
        }
        return Math.max(0, j - i.mo5762y(this.f8727M));
    }

    /* renamed from: z0 */
    private long m10884z0(C1081a aVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        m10842d1();
        this.f8718B = false;
        if (z2 || this.f8754w.f7206e == 3) {
            m10823T0(2);
        }
        MediaPeriodHolder n = this.f8749r.mo6010n();
        MediaPeriodHolder b1Var = n;
        while (b1Var != null && !aVar.equals(b1Var.f5401f.f5711a)) {
            b1Var = b1Var.mo5749j();
        }
        if (z || n != b1Var || (b1Var != null && b1Var.mo5763z(j) < 0)) {
            for (C1227p1 i : this.f8732a) {
                m10852i(i);
            }
            if (b1Var != null) {
                while (this.f8749r.mo6010n() != b1Var) {
                    this.f8749r.mo6004a();
                }
                this.f8749r.mo6016y(b1Var);
                b1Var.mo5761x(0);
                m10862n();
            }
        }
        if (b1Var != null) {
            this.f8749r.mo6016y(b1Var);
            if (!b1Var.f5399d) {
                b1Var.f5401f = b1Var.f5401f.mo5943b(j);
            } else {
                long j2 = b1Var.f5401f.f5715e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0, j2 - 1);
                }
                if (b1Var.f5400e) {
                    long u = b1Var.f5396a.mo6818u(j);
                    b1Var.f5396a.mo6817t(u - this.f8743l, this.f8744m);
                    j = u;
                }
            }
            m10863n0(j);
            m10815P();
        } else {
            this.f8749r.mo6006e();
            m10863n0(j);
        }
        m10792B(false);
        this.f8738g.mo7428c(2);
        return j;
    }

    /* renamed from: H0 */
    public void mo7641H0(List<C0907c> list, int i, long j, ShuffleOrder n0Var) {
        HandlerWrapper qVar = this.f8738g;
        C1233b bVar = new C1233b(list, n0Var, i, j, null);
        qVar.mo7432g(17, bVar).sendToTarget();
    }

    /* renamed from: K0 */
    public void mo7642K0(boolean z, int i) {
        this.f8738g.mo7427b(1, z ? 1 : 0, i).sendToTarget();
    }

    /* renamed from: N0 */
    public void mo7644N0(int i) {
        this.f8738g.mo7427b(11, i, 0).sendToTarget();
    }

    /* renamed from: Q0 */
    public void mo7646Q0(boolean z) {
        this.f8738g.mo7427b(12, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a */
    public synchronized void mo7357a(PlayerMessage m1Var) {
        if (!this.f8756y) {
            if (this.f8739h.isAlive()) {
                this.f8738g.mo7432g(14, m1Var).sendToTarget();
                return;
            }
        }
        Log.m10386h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        m1Var.mo7353k(false);
    }

    /* renamed from: b */
    public void mo6155b() {
        this.f8738g.mo7428c(22);
    }

    /* renamed from: b1 */
    public void mo7647b1() {
        this.f8738g.mo7435j(6).sendToTarget();
    }

    /* renamed from: c0 */
    public void mo6954p(MediaPeriod a0Var) {
        this.f8738g.mo7432g(9, a0Var).sendToTarget();
    }

    /* renamed from: d0 */
    public void mo7649d0() {
        this.f8738g.mo7435j(0).sendToTarget();
    }

    /* renamed from: e */
    public void mo7513e(PlaybackParameters i1Var) {
        this.f8738g.mo7432g(16, i1Var).sendToTarget();
    }

    /* renamed from: f0 */
    public synchronized boolean mo7650f0() {
        if (!this.f8756y) {
            if (this.f8739h.isAlive()) {
                this.f8738g.mo7428c(7);
                m10858k1(new C1254x(this), this.f8752u);
                return this.f8756y;
            }
        }
        return true;
    }

    public boolean handleMessage(Message message) {
        String str = "Playback error";
        String str2 = "ExoPlayerImplInternal";
        try {
            switch (message.what) {
                case 0:
                    m10843e0();
                    break;
                case 1:
                    m10811L0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m10856k();
                    break;
                case 3:
                    m10880x0((C1239h) message.obj);
                    break;
                case 4:
                    m10812M0((PlaybackParameters) message.obj);
                    break;
                case 5:
                    m10816P0((SeekParameters) message.obj);
                    break;
                case 6:
                    m10840c1(false, true);
                    break;
                case 7:
                    m10847g0();
                    return true;
                case 8:
                    m10796D((MediaPeriod) message.obj);
                    break;
                case 9:
                    m10790A((MediaPeriod) message.obj);
                    break;
                case 10:
                    m10857k0();
                    break;
                case 11:
                    m10814O0(message.arg1);
                    break;
                case 12:
                    m10819R0(message.arg1 != 0);
                    break;
                case 13:
                    m10801F0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m10791A0((PlayerMessage) message.obj);
                    break;
                case 15:
                    m10795C0((PlayerMessage) message.obj);
                    break;
                case 16:
                    m10800F((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    m10803G0((C1233b) message.obj);
                    break;
                case 18:
                    m10841d((C1233b) message.obj, message.arg1);
                    break;
                case 19:
                    m10832Y((C1234c) message.obj);
                    break;
                case 20:
                    m10850h0(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    m10821S0((ShuffleOrder) message.obj);
                    break;
                case 22:
                    m10830X();
                    break;
                case 23:
                    m10808J0(message.arg1 != 0);
                    break;
                case 24:
                    m10806I0(message.arg1 == 1);
                    break;
                case 25:
                    m10846g((ExoPlaybackException) message.obj);
                    break;
                default:
                    return false;
            }
            m10817Q();
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.f8675a == 1) {
                MediaPeriodHolder o = this.f8749r.mo6011o();
                if (o != null) {
                    e = e.mo7629a(o.f5401f.f5711a);
                }
            }
            if (!e.f8682h || this.f8730P != null) {
                ExoPlaybackException p0Var = this.f8730P;
                if (p0Var != null) {
                    e.addSuppressed(p0Var);
                    this.f8730P = null;
                }
                Log.m10382d(str2, str, e);
                m10840c1(true, false);
                this.f8754w = this.f8754w.mo6541f(e);
            } else {
                Log.m10387i(str2, "Recoverable playback error", e);
                this.f8730P = e;
                Message g = this.f8738g.mo7432g(25, e);
                g.getTarget().sendMessageAtFrontOfQueue(g);
            }
            m10817Q();
        } catch (IOException e2) {
            ExoPlaybackException d = ExoPlaybackException.m10680d(e2);
            MediaPeriodHolder n = this.f8749r.mo6010n();
            if (n != null) {
                d = d.mo7629a(n.f5401f.f5711a);
            }
            Log.m10382d(str2, str, d);
            m10840c1(false, false);
            this.f8754w = this.f8754w.mo6541f(d);
            m10817Q();
        } catch (RuntimeException e3) {
            ExoPlaybackException e4 = ExoPlaybackException.m10681e(e3);
            Log.m10382d(str2, str, e4);
            m10840c1(true, false);
            this.f8754w = this.f8754w.mo6541f(e4);
            m10817Q();
        }
        return true;
    }

    /* renamed from: i0 */
    public void mo7652i0(int i, int i2, ShuffleOrder n0Var) {
        this.f8738g.mo7429d(20, i, i2, n0Var).sendToTarget();
    }

    /* renamed from: m */
    public void mo6819m(MediaPeriod a0Var) {
        this.f8738g.mo7432g(8, a0Var).sendToTarget();
    }

    /* renamed from: v0 */
    public void mo7653v0(Timeline x1Var, int i, long j) {
        this.f8738g.mo7432g(3, new C1239h(x1Var, i, j)).sendToTarget();
    }

    /* renamed from: x */
    public Looper mo7654x() {
        return this.f8740i;
    }
}
