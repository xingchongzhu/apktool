package p067c.p068a.p069a.p070a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p067c.p068a.p069a.p070a.AudioBecomingNoisyManager.C0860b;
import p067c.p068a.p069a.p070a.AudioFocusManager.C0904b;
import p067c.p068a.p069a.p070a.C1155l1.C1156a;
import p067c.p068a.p069a.p070a.C1155l1.C1157b;
import p067c.p068a.p069a.p070a.C1155l1.C1158c;
import p067c.p068a.p069a.p070a.C1155l1.C1159d;
import p067c.p068a.p069a.p070a.DefaultLivePlaybackSpeedControl.C1154b;
import p067c.p068a.p069a.p070a.StreamVolumeManager.C1252b;
import p067c.p068a.p069a.p070a.p071a2.AnalyticsCollector;
import p067c.p068a.p069a.p070a.p072b2.AudioAttributes;
import p067c.p068a.p069a.p070a.p072b2.AudioListener;
import p067c.p068a.p069a.p070a.p072b2.AudioRendererEventListener;
import p067c.p068a.p069a.p070a.p073c2.DecoderCounters;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p074d2.DeviceInfo;
import p067c.p068a.p069a.p070a.p074d2.DeviceListener;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.DefaultExtractorsFactory;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.MetadataOutput;
import p067c.p068a.p069a.p070a.p097j2.C1080d0;
import p067c.p068a.p069a.p070a.p097j2.DefaultMediaSourceFactory;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceFactory;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.TextOutput;
import p067c.p068a.p069a.p070a.p110l2.DefaultTrackSelector;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionArray;
import p067c.p068a.p069a.p070a.p110l2.TrackSelector;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Clock;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.PriorityTaskManager;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p069a.p070a.p112n2.C1223y;
import p067c.p068a.p069a.p070a.p112n2.VideoDecoderGLSurfaceView;
import p067c.p068a.p069a.p070a.p112n2.VideoDecoderOutputBufferRenderer;
import p067c.p068a.p069a.p070a.p112n2.VideoFrameMetadataListener;
import p067c.p068a.p069a.p070a.p112n2.VideoRendererEventListener;
import p067c.p068a.p069a.p070a.p112n2.p113a0.CameraMotionListener;

/* renamed from: c.a.a.a.v1 */
public class SimpleExoPlayer extends BasePlayer implements C1155l1, C1159d, C1158c {

    /* renamed from: A */
    private int f8870A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public DecoderCounters f8871B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public DecoderCounters f8872C;

    /* renamed from: D */
    private int f8873D;

    /* renamed from: E */
    private AudioAttributes f8874E;

    /* renamed from: F */
    private float f8875F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f8876G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public List<Cue> f8877H;

    /* renamed from: I */
    private VideoFrameMetadataListener f8878I;

    /* renamed from: J */
    private CameraMotionListener f8879J;

    /* renamed from: K */
    private boolean f8880K;

    /* renamed from: L */
    private boolean f8881L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public PriorityTaskManager f8882M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f8883N;

    /* renamed from: O */
    private boolean f8884O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public DeviceInfo f8885P;

    /* renamed from: b */
    protected final C1227p1[] f8886b;

    /* renamed from: c */
    private final Context f8887c;

    /* renamed from: d */
    private final ExoPlayerImpl f8888d;

    /* renamed from: e */
    private final C1249c f8889e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CopyOnWriteArraySet<C1223y> f8890f = new CopyOnWriteArraySet<>();

    /* renamed from: g */
    private final CopyOnWriteArraySet<AudioListener> f8891g = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<TextOutput> f8892h = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final CopyOnWriteArraySet<MetadataOutput> f8893i = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final CopyOnWriteArraySet<DeviceListener> f8894j = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final AnalyticsCollector f8895k;

    /* renamed from: l */
    private final AudioBecomingNoisyManager f8896l;

    /* renamed from: m */
    private final AudioFocusManager f8897m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final StreamVolumeManager f8898n;

    /* renamed from: o */
    private final WakeLockManager f8899o;

    /* renamed from: p */
    private final WifiLockManager f8900p;

    /* renamed from: q */
    private final long f8901q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Format f8902r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Format f8903s;

    /* renamed from: t */
    private AudioTrack f8904t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Surface f8905u;

    /* renamed from: v */
    private boolean f8906v;

    /* renamed from: w */
    private int f8907w;

    /* renamed from: x */
    private SurfaceHolder f8908x;

    /* renamed from: y */
    private TextureView f8909y;

    /* renamed from: z */
    private int f8910z;

    /* renamed from: c.a.a.a.v1$b */
    /* compiled from: SimpleExoPlayer */
    public static final class C1248b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Context f8911a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final RenderersFactory f8912b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Clock f8913c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public TrackSelector f8914d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public MediaSourceFactory f8915e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public LoadControl f8916f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public BandwidthMeter f8917g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public AnalyticsCollector f8918h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Looper f8919i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public PriorityTaskManager f8920j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public AudioAttributes f8921k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f8922l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f8923m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public boolean f8924n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public boolean f8925o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f8926p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public boolean f8927q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public SeekParameters f8928r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public LivePlaybackSpeedControl f8929s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public long f8930t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public long f8931u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public boolean f8932v;

        /* renamed from: w */
        private boolean f8933w;

        public C1248b(Context context) {
            this(context, new DefaultRenderersFactory(context), new DefaultExtractorsFactory());
        }

        /* renamed from: w */
        public SimpleExoPlayer mo7721w() {
            Assertions.m10154f(!this.f8933w);
            this.f8933w = true;
            return new SimpleExoPlayer(this);
        }

        public C1248b(Context context, RenderersFactory t1Var, C0998o oVar) {
            this(context, t1Var, new DefaultTrackSelector(context), new DefaultMediaSourceFactory(context, oVar), new DefaultLoadControl(), DefaultBandwidthMeter.m15112l(context), new AnalyticsCollector(Clock.f8368a));
        }

        public C1248b(Context context, RenderersFactory t1Var, TrackSelector nVar, MediaSourceFactory f0Var, LoadControl y0Var, BandwidthMeter gVar, AnalyticsCollector c1Var) {
            this.f8911a = context;
            this.f8912b = t1Var;
            this.f8914d = nVar;
            this.f8915e = f0Var;
            this.f8916f = y0Var;
            this.f8917g = gVar;
            this.f8918h = c1Var;
            this.f8919i = Util.m10259L();
            this.f8921k = AudioAttributes.f5542a;
            this.f8923m = 0;
            this.f8926p = 1;
            this.f8927q = true;
            this.f8928r = SeekParameters.f8863e;
            this.f8929s = new C1154b().mo7190a();
            this.f8913c = Clock.f8368a;
            this.f8930t = 500;
            this.f8931u = 2000;
        }
    }

    /* renamed from: c.a.a.a.v1$c */
    /* compiled from: SimpleExoPlayer */
    private final class C1249c implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, Callback, SurfaceTextureListener, C0904b, C0860b, C1252b, C1156a {
        private C1249c() {
        }

        /* renamed from: A */
        public void mo5612A(Format u0Var, DecoderReuseEvaluation gVar) {
            SimpleExoPlayer.this.f8902r = u0Var;
            SimpleExoPlayer.this.f8895k.mo5612A(u0Var, gVar);
        }

        /* renamed from: B */
        public void mo5613B(long j) {
            SimpleExoPlayer.this.f8895k.mo5613B(j);
        }

        /* renamed from: C */
        public void mo6025C() {
            SimpleExoPlayer.this.m11010T0(false, -1, 3);
        }

        /* renamed from: D */
        public /* synthetic */ void mo5615D(Timeline x1Var, int i) {
            Player.m9370s(this, x1Var, i);
        }

        /* renamed from: E */
        public void mo6139E(float f) {
            SimpleExoPlayer.this.m11007O0();
        }

        /* renamed from: G */
        public void mo5618G(int i) {
            SimpleExoPlayer.this.m11011U0();
        }

        /* renamed from: H */
        public void mo5619H(boolean z, int i) {
            SimpleExoPlayer.this.m11011U0();
        }

        /* renamed from: J */
        public void mo5621J(Surface surface) {
            SimpleExoPlayer.this.f8895k.mo5621J(surface);
            if (SimpleExoPlayer.this.f8905u == surface) {
                Iterator it = SimpleExoPlayer.this.f8890f.iterator();
                while (it.hasNext()) {
                    ((C1223y) it.next()).mo7600d();
                }
            }
        }

        /* renamed from: L */
        public /* synthetic */ void mo5623L(TrackGroupArray q0Var, TrackSelectionArray lVar) {
            Player.m9372u(this, q0Var, lVar);
        }

        /* renamed from: M */
        public void mo5624M(DecoderCounters dVar) {
            SimpleExoPlayer.this.f8895k.mo5624M(dVar);
            SimpleExoPlayer.this.f8902r = null;
            SimpleExoPlayer.this.f8871B = null;
        }

        /* renamed from: N */
        public void mo5625N(String str) {
            SimpleExoPlayer.this.f8895k.mo5625N(str);
        }

        /* renamed from: O */
        public void mo5626O(String str, long j, long j2) {
            SimpleExoPlayer.this.f8895k.mo5626O(str, j, j2);
        }

        /* renamed from: P */
        public /* synthetic */ void mo5627P(boolean z) {
            Player.m9368q(this, z);
        }

        /* renamed from: R */
        public /* synthetic */ void mo5629R(C1155l1 l1Var, C1157b bVar) {
            Player.m9352a(this, l1Var, bVar);
        }

        /* renamed from: S */
        public /* synthetic */ void mo5630S(boolean z) {
            Player.m9353b(this, z);
        }

        /* renamed from: T */
        public void mo5631T(int i, long j, long j2) {
            SimpleExoPlayer.this.f8895k.mo5631T(i, j, j2);
        }

        /* renamed from: U */
        public void mo5632U(int i, long j) {
            SimpleExoPlayer.this.f8895k.mo5632U(i, j);
        }

        /* renamed from: W */
        public void mo5634W(boolean z) {
            SimpleExoPlayer.this.m11011U0();
        }

        /* renamed from: X */
        public void mo5635X(long j, int i) {
            SimpleExoPlayer.this.f8895k.mo5635X(j, i);
        }

        /* renamed from: Z */
        public /* synthetic */ void mo5637Z(boolean z) {
            Player.m9356e(this, z);
        }

        /* renamed from: a */
        public void mo5638a(boolean z) {
            if (SimpleExoPlayer.this.f8876G != z) {
                SimpleExoPlayer.this.f8876G = z;
                SimpleExoPlayer.this.m11004K0();
            }
        }

        /* renamed from: b */
        public void mo5640b(int i, int i2, int i3, float f) {
            SimpleExoPlayer.this.f8895k.mo5640b(i, i2, i3, f);
            Iterator it = SimpleExoPlayer.this.f8890f.iterator();
            while (it.hasNext()) {
                ((C1223y) it.next()).mo7599b(i, i2, i3, f);
            }
        }

        /* renamed from: c */
        public /* synthetic */ void mo5642c(int i) {
            Player.m9366o(this, i);
        }

        /* renamed from: d */
        public void mo5643d(Exception exc) {
            SimpleExoPlayer.this.f8895k.mo5643d(exc);
        }

        /* renamed from: e */
        public /* synthetic */ void mo5644e(PlaybackParameters i1Var) {
            Player.m9360i(this, i1Var);
        }

        /* renamed from: f */
        public /* synthetic */ void mo5645f(int i) {
            Player.m9362k(this, i);
        }

        /* renamed from: g */
        public /* synthetic */ void mo5646g(boolean z, int i) {
            Player.m9364m(this, z, i);
        }

        /* renamed from: h */
        public void mo5647h(Format u0Var, DecoderReuseEvaluation gVar) {
            SimpleExoPlayer.this.f8903s = u0Var;
            SimpleExoPlayer.this.f8895k.mo5647h(u0Var, gVar);
        }

        /* renamed from: i */
        public /* synthetic */ void mo5648i(boolean z) {
            Player.m9357f(this, z);
        }

        /* renamed from: j */
        public /* synthetic */ void mo5650j(int i) {
            Player.m9365n(this, i);
        }

        /* renamed from: k */
        public void mo6140k(int i) {
            boolean n = SimpleExoPlayer.this.mo7217n();
            SimpleExoPlayer.this.m11010T0(n, i, SimpleExoPlayer.m11001H0(n, i));
        }

        /* renamed from: l */
        public void mo5654l(DecoderCounters dVar) {
            SimpleExoPlayer.this.f8895k.mo5654l(dVar);
            SimpleExoPlayer.this.f8903s = null;
            SimpleExoPlayer.this.f8872C = null;
        }

        /* renamed from: m */
        public void mo5656m(String str) {
            SimpleExoPlayer.this.f8895k.mo5656m(str);
        }

        /* renamed from: n */
        public void mo5658n(DecoderCounters dVar) {
            SimpleExoPlayer.this.f8872C = dVar;
            SimpleExoPlayer.this.f8895k.mo5658n(dVar);
        }

        /* renamed from: o */
        public /* synthetic */ void mo5660o(List list) {
            Player.m9369r(this, list);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SimpleExoPlayer.this.m11009S0(new Surface(surfaceTexture), true);
            SimpleExoPlayer.this.m11003J0(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SimpleExoPlayer.this.m11009S0(null, true);
            SimpleExoPlayer.this.m11003J0(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SimpleExoPlayer.this.m11003J0(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        /* renamed from: p */
        public void mo5662p(String str, long j, long j2) {
            SimpleExoPlayer.this.f8895k.mo5662p(str, j, j2);
        }

        /* renamed from: q */
        public /* synthetic */ void mo5664q(Timeline x1Var, Object obj, int i) {
            Player.m9371t(this, x1Var, obj, i);
        }

        /* renamed from: r */
        public /* synthetic */ void mo5666r(ExoPlaybackException p0Var) {
            Player.m9363l(this, p0Var);
        }

        /* renamed from: s */
        public void mo7726s(int i, boolean z) {
            Iterator it = SimpleExoPlayer.this.f8894j.iterator();
            while (it.hasNext()) {
                ((DeviceListener) it.next()).mo6021b(i, z);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            SimpleExoPlayer.this.m11003J0(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.m11009S0(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.m11009S0(null, false);
            SimpleExoPlayer.this.m11003J0(0, 0);
        }

        /* renamed from: t */
        public void mo7067t(List<Cue> list) {
            SimpleExoPlayer.this.f8877H = list;
            Iterator it = SimpleExoPlayer.this.f8892h.iterator();
            while (it.hasNext()) {
                ((TextOutput) it.next()).mo7067t(list);
            }
        }

        /* renamed from: u */
        public void mo5669u(boolean z) {
            if (SimpleExoPlayer.this.f8882M == null) {
                return;
            }
            if (z && !SimpleExoPlayer.this.f8883N) {
                SimpleExoPlayer.this.f8882M.mo7413a(0);
                SimpleExoPlayer.this.f8883N = true;
            } else if (!z && SimpleExoPlayer.this.f8883N) {
                SimpleExoPlayer.this.f8882M.mo7414b(0);
                SimpleExoPlayer.this.f8883N = false;
            }
        }

        /* renamed from: v */
        public void mo7730v(int i) {
            DeviceInfo v0 = SimpleExoPlayer.m11000F0(SimpleExoPlayer.this.f8898n);
            if (!v0.equals(SimpleExoPlayer.this.f8885P)) {
                SimpleExoPlayer.this.f8885P = v0;
                Iterator it = SimpleExoPlayer.this.f8894j.iterator();
                while (it.hasNext()) {
                    ((DeviceListener) it.next()).mo6020a(v0);
                }
            }
        }

        /* renamed from: w */
        public /* synthetic */ void mo5671w() {
            Player.m9367p(this);
        }

        /* renamed from: x */
        public /* synthetic */ void mo5672x(MediaItem z0Var, int i) {
            Player.m9358g(this, z0Var, i);
        }

        /* renamed from: y */
        public void mo6564y(Metadata aVar) {
            SimpleExoPlayer.this.f8895k.mo5653k1(aVar);
            Iterator it = SimpleExoPlayer.this.f8893i.iterator();
            while (it.hasNext()) {
                ((MetadataOutput) it.next()).mo6564y(aVar);
            }
        }

        /* renamed from: z */
        public void mo5674z(DecoderCounters dVar) {
            SimpleExoPlayer.this.f8871B = dVar;
            SimpleExoPlayer.this.f8895k.mo5674z(dVar);
        }
    }

    protected SimpleExoPlayer(C1248b bVar) {
        Context applicationContext = bVar.f8911a.getApplicationContext();
        this.f8887c = applicationContext;
        AnalyticsCollector b = bVar.f8918h;
        this.f8895k = b;
        this.f8882M = bVar.f8920j;
        this.f8874E = bVar.f8921k;
        this.f8907w = bVar.f8926p;
        this.f8876G = bVar.f8925o;
        this.f8901q = bVar.f8931u;
        C1249c cVar = new C1249c();
        this.f8889e = cVar;
        Handler handler = new Handler(bVar.f8919i);
        C1227p1[] a = bVar.f8912b.mo7621a(handler, cVar, cVar, cVar, cVar);
        this.f8886b = a;
        this.f8875F = 1.0f;
        if (Util.f8398a < 21) {
            this.f8873D = m11002I0(0);
        } else {
            this.f8873D = C.m8858a(applicationContext);
        }
        this.f8877H = Collections.emptyList();
        this.f8880K = true;
        Handler handler2 = handler;
        ExoPlayerImpl q0Var = r0;
        C1249c cVar2 = cVar;
        ExoPlayerImpl q0Var2 = new ExoPlayerImpl(a, bVar.f8914d, bVar.f8915e, bVar.f8916f, bVar.f8917g, b, bVar.f8927q, bVar.f8928r, bVar.f8929s, bVar.f8930t, bVar.f8932v, bVar.f8913c, bVar.f8919i, this);
        ExoPlayerImpl q0Var3 = q0Var;
        this.f8888d = q0Var3;
        C1249c cVar3 = cVar2;
        q0Var3.mo7192C(cVar3);
        Handler handler3 = handler2;
        AudioBecomingNoisyManager e0Var = new AudioBecomingNoisyManager(bVar.f8911a, handler3, cVar3);
        this.f8896l = e0Var;
        e0Var.mo6022b(bVar.f8924n);
        AudioFocusManager f0Var = new AudioFocusManager(bVar.f8911a, handler3, cVar3);
        this.f8897m = f0Var;
        f0Var.mo6135m(bVar.f8922l ? this.f8874E : null);
        StreamVolumeManager w1Var = new StreamVolumeManager(bVar.f8911a, handler3, cVar3);
        this.f8898n = w1Var;
        w1Var.mo7734h(Util.m10276Z(this.f8874E.f5545d));
        WakeLockManager y1Var = new WakeLockManager(bVar.f8911a);
        this.f8899o = y1Var;
        y1Var.mo7772a(bVar.f8923m != 0);
        WifiLockManager z1Var = new WifiLockManager(bVar.f8911a);
        this.f8900p = z1Var;
        z1Var.mo7796a(bVar.f8923m == 2);
        this.f8885P = m11000F0(w1Var);
        m11006N0(1, 102, Integer.valueOf(this.f8873D));
        m11006N0(2, 102, Integer.valueOf(this.f8873D));
        m11006N0(1, 3, this.f8874E);
        m11006N0(2, 4, Integer.valueOf(this.f8907w));
        m11006N0(1, 101, Boolean.valueOf(this.f8876G));
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public static DeviceInfo m11000F0(StreamVolumeManager w1Var) {
        return new DeviceInfo(0, w1Var.mo7732d(), w1Var.mo7731c());
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public static int m11001H0(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: I0 */
    private int m11002I0(int i) {
        AudioTrack audioTrack = this.f8904t;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i)) {
            this.f8904t.release();
            this.f8904t = null;
        }
        if (this.f8904t == null) {
            AudioTrack audioTrack2 = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
            this.f8904t = audioTrack2;
        }
        return this.f8904t.getAudioSessionId();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public void m11003J0(int i, int i2) {
        if (i != this.f8910z || i2 != this.f8870A) {
            this.f8910z = i;
            this.f8870A = i2;
            this.f8895k.mo5655l1(i, i2);
            Iterator it = this.f8890f.iterator();
            while (it.hasNext()) {
                ((C1223y) it.next()).mo7601h(i, i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m11004K0() {
        this.f8895k.mo5638a(this.f8876G);
        Iterator it = this.f8891g.iterator();
        while (it.hasNext()) {
            ((AudioListener) it.next()).mo5847a(this.f8876G);
        }
    }

    /* renamed from: M0 */
    private void m11005M0() {
        TextureView textureView = this.f8909y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f8889e) {
                Log.m10386h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f8909y.setSurfaceTextureListener(null);
            }
            this.f8909y = null;
        }
        SurfaceHolder surfaceHolder = this.f8908x;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f8889e);
            this.f8908x = null;
        }
    }

    /* renamed from: N0 */
    private void m11006N0(int i, int i2, Object obj) {
        C1227p1[] p1VarArr;
        for (C1227p1 p1Var : this.f8886b) {
            if (p1Var.mo6518g() == i) {
                this.f8888d.mo7637e0(p1Var).mo7356n(i2).mo7355m(obj).mo7354l();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public void m11007O0() {
        m11006N0(1, 2, Float.valueOf(this.f8875F * this.f8897m.mo6133g()));
    }

    /* renamed from: Q0 */
    private void m11008Q0(VideoDecoderOutputBufferRenderer uVar) {
        m11006N0(2, 8, uVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public void m11009S0(Surface surface, boolean z) {
        C1227p1[] p1VarArr;
        ArrayList<PlayerMessage> arrayList = new ArrayList<>();
        for (C1227p1 p1Var : this.f8886b) {
            if (p1Var.mo6518g() == 2) {
                arrayList.add(this.f8888d.mo7637e0(p1Var).mo7356n(1).mo7355m(surface).mo7354l());
            }
        }
        Surface surface2 = this.f8905u;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (PlayerMessage a : arrayList) {
                    a.mo7343a(this.f8901q);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f8888d.mo7636S0(false, ExoPlaybackException.m10678b(new ExoTimeoutException(3)));
            }
            if (this.f8906v) {
                this.f8905u.release();
            }
        }
        this.f8905u = surface;
        this.f8906v = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public void m11010T0(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f8888d.mo7635R0(z2, i3, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public void m11011U0() {
        int q = mo7219q();
        boolean z = true;
        if (q != 1) {
            if (q == 2 || q == 3) {
                boolean G0 = mo7717G0();
                WakeLockManager y1Var = this.f8899o;
                if (!mo7217n() || G0) {
                    z = false;
                }
                y1Var.mo7773b(z);
                this.f8900p.mo7797b(mo7217n());
                return;
            } else if (q != 4) {
                throw new IllegalStateException();
            }
        }
        this.f8899o.mo7773b(false);
        this.f8900p.mo7797b(false);
    }

    /* renamed from: V0 */
    private void m11012V0() {
        if (Looper.myLooper() != mo7199N()) {
            String str = "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
            if (!this.f8880K) {
                Log.m10387i("SimpleExoPlayer", str, this.f8881L ? null : new IllegalStateException());
                this.f8881L = true;
                return;
            }
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: A */
    public void mo7191A(int i) {
        m11012V0();
        this.f8888d.mo7191A(i);
    }

    /* renamed from: C */
    public void mo7192C(C1156a aVar) {
        Assertions.m10153e(aVar);
        this.f8888d.mo7192C(aVar);
    }

    /* renamed from: D */
    public int mo7193D() {
        m11012V0();
        return this.f8888d.mo7193D();
    }

    /* renamed from: D0 */
    public void mo7715D0() {
        m11012V0();
        m11005M0();
        m11009S0(null, false);
        m11003J0(0, 0);
    }

    /* renamed from: E */
    public void mo7227E(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        m11012V0();
        if (surfaceView instanceof VideoDecoderGLSurfaceView) {
            VideoDecoderOutputBufferRenderer videoDecoderOutputBufferRenderer = ((VideoDecoderGLSurfaceView) surfaceView).getVideoDecoderOutputBufferRenderer();
            mo7715D0();
            this.f8908x = surfaceView.getHolder();
            m11008Q0(videoDecoderOutputBufferRenderer);
            return;
        }
        if (surfaceView == null) {
            surfaceHolder = null;
        } else {
            surfaceHolder = surfaceView.getHolder();
        }
        mo7720R0(surfaceHolder);
    }

    /* renamed from: E0 */
    public void mo7716E0(SurfaceHolder surfaceHolder) {
        m11012V0();
        if (surfaceHolder != null && surfaceHolder == this.f8908x) {
            mo7720R0(null);
        }
    }

    /* renamed from: F */
    public void mo7228F(SurfaceView surfaceView) {
        m11012V0();
        SurfaceHolder surfaceHolder = null;
        if (!(surfaceView instanceof VideoDecoderGLSurfaceView)) {
            if (surfaceView != null) {
                surfaceHolder = surfaceView.getHolder();
            }
            mo7716E0(surfaceHolder);
        } else if (surfaceView.getHolder() == this.f8908x) {
            m11008Q0(null);
            this.f8908x = null;
        }
    }

    /* renamed from: G */
    public void mo7224G(TextOutput lVar) {
        Assertions.m10153e(lVar);
        this.f8892h.add(lVar);
    }

    /* renamed from: G0 */
    public boolean mo7717G0() {
        m11012V0();
        return this.f8888d.mo7638g0();
    }

    /* renamed from: H */
    public int mo7194H() {
        m11012V0();
        return this.f8888d.mo7194H();
    }

    /* renamed from: I */
    public TrackGroupArray mo7195I() {
        m11012V0();
        return this.f8888d.mo7195I();
    }

    /* renamed from: J */
    public void mo7225J(TextOutput lVar) {
        this.f8892h.remove(lVar);
    }

    /* renamed from: K */
    public int mo7196K() {
        m11012V0();
        return this.f8888d.mo7196K();
    }

    /* renamed from: L */
    public long mo7197L() {
        m11012V0();
        return this.f8888d.mo7197L();
    }

    /* renamed from: L0 */
    public void mo7718L0() {
        m11012V0();
        if (Util.f8398a < 21) {
            AudioTrack audioTrack = this.f8904t;
            if (audioTrack != null) {
                audioTrack.release();
                this.f8904t = null;
            }
        }
        this.f8896l.mo6022b(false);
        this.f8898n.mo7733g();
        this.f8899o.mo7773b(false);
        this.f8900p.mo7797b(false);
        this.f8897m.mo6134i();
        this.f8888d.mo7632L0();
        this.f8895k.mo5657m1();
        m11005M0();
        Surface surface = this.f8905u;
        if (surface != null) {
            if (this.f8906v) {
                surface.release();
            }
            this.f8905u = null;
        }
        if (this.f8883N) {
            ((PriorityTaskManager) Assertions.m10153e(this.f8882M)).mo7414b(0);
            this.f8883N = false;
        }
        this.f8877H = Collections.emptyList();
        this.f8884O = true;
    }

    /* renamed from: M */
    public Timeline mo7198M() {
        m11012V0();
        return this.f8888d.mo7198M();
    }

    /* renamed from: N */
    public Looper mo7199N() {
        return this.f8888d.mo7199N();
    }

    /* renamed from: O */
    public boolean mo7200O() {
        m11012V0();
        return this.f8888d.mo7200O();
    }

    /* renamed from: P */
    public void mo7201P(C1156a aVar) {
        this.f8888d.mo7201P(aVar);
    }

    /* renamed from: P0 */
    public void mo7719P0(C1080d0 d0Var, boolean z) {
        m11012V0();
        this.f8895k.mo5659n1();
        this.f8888d.mo7633O0(d0Var, z);
    }

    /* renamed from: Q */
    public long mo7202Q() {
        m11012V0();
        return this.f8888d.mo7202Q();
    }

    /* renamed from: R */
    public int mo7203R() {
        m11012V0();
        return this.f8888d.mo7203R();
    }

    /* renamed from: R0 */
    public void mo7720R0(SurfaceHolder surfaceHolder) {
        m11012V0();
        m11005M0();
        if (surfaceHolder != null) {
            m11008Q0(null);
        }
        this.f8908x = surfaceHolder;
        if (surfaceHolder == null) {
            m11009S0(null, false);
            m11003J0(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f8889e);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m11009S0(null, false);
            m11003J0(0, 0);
            return;
        }
        m11009S0(surface, false);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        m11003J0(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: S */
    public void mo7229S(TextureView textureView) {
        m11012V0();
        m11005M0();
        if (textureView != null) {
            m11008Q0(null);
        }
        this.f8909y = textureView;
        if (textureView == null) {
            m11009S0(null, true);
            m11003J0(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            Log.m10386h("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f8889e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m11009S0(null, true);
            m11003J0(0, 0);
            return;
        }
        m11009S0(new Surface(surfaceTexture), true);
        m11003J0(textureView.getWidth(), textureView.getHeight());
    }

    /* renamed from: T */
    public TrackSelectionArray mo7204T() {
        m11012V0();
        return this.f8888d.mo7204T();
    }

    /* renamed from: U */
    public int mo7205U(int i) {
        m11012V0();
        return this.f8888d.mo7205U(i);
    }

    /* renamed from: V */
    public void mo7230V(C1223y yVar) {
        this.f8890f.remove(yVar);
    }

    /* renamed from: W */
    public long mo7206W() {
        m11012V0();
        return this.f8888d.mo7206W();
    }

    /* renamed from: X */
    public void mo7231X(C1223y yVar) {
        Assertions.m10153e(yVar);
        this.f8890f.add(yVar);
    }

    /* renamed from: Y */
    public C1158c mo7207Y() {
        return this;
    }

    /* renamed from: a */
    public void mo7232a(Surface surface) {
        m11012V0();
        m11005M0();
        if (surface != null) {
            m11008Q0(null);
        }
        int i = 0;
        m11009S0(surface, false);
        if (surface != null) {
            i = -1;
        }
        m11003J0(i, i);
    }

    /* renamed from: b */
    public void mo7233b(CameraMotionListener aVar) {
        m11012V0();
        this.f8879J = aVar;
        m11006N0(6, 7, aVar);
    }

    /* renamed from: c */
    public PlaybackParameters mo7208c() {
        m11012V0();
        return this.f8888d.mo7208c();
    }

    /* renamed from: d */
    public void mo7209d() {
        m11012V0();
        boolean n = mo7217n();
        int p = this.f8897m.mo6136p(n, 2);
        m11010T0(n, p, m11001H0(n, p));
        this.f8888d.mo7209d();
    }

    /* renamed from: e */
    public ExoPlaybackException mo7210e() {
        m11012V0();
        return this.f8888d.mo7210e();
    }

    /* renamed from: f */
    public void mo7211f(boolean z) {
        m11012V0();
        int p = this.f8897m.mo6136p(z, mo7219q());
        m11010T0(z, p, m11001H0(z, p));
    }

    /* renamed from: g */
    public C1159d mo7212g() {
        return this;
    }

    /* renamed from: h */
    public boolean mo7213h() {
        m11012V0();
        return this.f8888d.mo7213h();
    }

    /* renamed from: i */
    public long mo7214i() {
        m11012V0();
        return this.f8888d.mo7214i();
    }

    /* renamed from: j */
    public long mo7215j() {
        m11012V0();
        return this.f8888d.mo7215j();
    }

    /* renamed from: k */
    public void mo7216k(int i, long j) {
        m11012V0();
        this.f8895k.mo5651j1();
        this.f8888d.mo7216k(i, j);
    }

    /* renamed from: m */
    public void mo7234m(VideoFrameMetadataListener vVar) {
        m11012V0();
        this.f8878I = vVar;
        m11006N0(2, 6, vVar);
    }

    /* renamed from: n */
    public boolean mo7217n() {
        m11012V0();
        return this.f8888d.mo7217n();
    }

    /* renamed from: o */
    public void mo7235o(Surface surface) {
        m11012V0();
        if (surface != null && surface == this.f8905u) {
            mo7715D0();
        }
    }

    /* renamed from: p */
    public void mo7218p(boolean z) {
        m11012V0();
        this.f8888d.mo7218p(z);
    }

    /* renamed from: q */
    public int mo7219q() {
        m11012V0();
        return this.f8888d.mo7219q();
    }

    /* renamed from: r */
    public List<Metadata> mo7220r() {
        m11012V0();
        return this.f8888d.mo7220r();
    }

    /* renamed from: s */
    public void mo7236s(CameraMotionListener aVar) {
        m11012V0();
        if (this.f8879J == aVar) {
            m11006N0(6, 7, null);
        }
    }

    /* renamed from: u */
    public int mo7221u() {
        m11012V0();
        return this.f8888d.mo7221u();
    }

    /* renamed from: v */
    public List<Cue> mo7226v() {
        m11012V0();
        return this.f8877H;
    }

    /* renamed from: x */
    public void mo7237x(TextureView textureView) {
        m11012V0();
        if (textureView != null && textureView == this.f8909y) {
            mo7229S(null);
        }
    }

    /* renamed from: y */
    public void mo7238y(VideoFrameMetadataListener vVar) {
        m11012V0();
        if (this.f8878I == vVar) {
            m11006N0(2, 6, null);
        }
    }

    /* renamed from: z */
    public int mo7222z() {
        m11012V0();
        return this.f8888d.mo7222z();
    }
}
