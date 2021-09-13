package p067c.p068a.p069a.p070a.p072b2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack.Builder;
import android.media.AudioTrack.StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.PlaybackParameters;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0831a;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0832b;
import p067c.p068a.p069a.p070a.p072b2.AudioSink.C0834a;
import p067c.p068a.p069a.p070a.p072b2.AudioSink.C0835b;
import p067c.p068a.p069a.p070a.p072b2.AudioSink.C0836c;
import p067c.p068a.p069a.p070a.p072b2.AudioSink.C0837d;
import p067c.p068a.p069a.p070a.p072b2.AudioTrackPositionTracker.C0839a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.y */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: a */
    public static boolean f5625a = false;

    /* renamed from: A */
    private long f5626A;

    /* renamed from: B */
    private long f5627B;

    /* renamed from: C */
    private long f5628C;

    /* renamed from: D */
    private long f5629D;

    /* renamed from: E */
    private int f5630E;

    /* renamed from: F */
    private boolean f5631F;

    /* renamed from: G */
    private boolean f5632G;

    /* renamed from: H */
    private long f5633H;

    /* renamed from: I */
    private float f5634I;

    /* renamed from: J */
    private AudioProcessor[] f5635J;

    /* renamed from: K */
    private ByteBuffer[] f5636K;

    /* renamed from: L */
    private ByteBuffer f5637L;

    /* renamed from: M */
    private int f5638M;

    /* renamed from: N */
    private ByteBuffer f5639N;

    /* renamed from: O */
    private byte[] f5640O;

    /* renamed from: P */
    private int f5641P;

    /* renamed from: Q */
    private int f5642Q;

    /* renamed from: R */
    private boolean f5643R;

    /* renamed from: S */
    private boolean f5644S;

    /* renamed from: T */
    private boolean f5645T;

    /* renamed from: U */
    private boolean f5646U;

    /* renamed from: V */
    private int f5647V;

    /* renamed from: W */
    private AuxEffectInfo f5648W;

    /* renamed from: X */
    private boolean f5649X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public long f5650Y;

    /* renamed from: Z */
    private boolean f5651Z;

    /* renamed from: a0 */
    private boolean f5652a0;

    /* renamed from: b */
    private final AudioCapabilities f5653b;

    /* renamed from: c */
    private final C0841b f5654c;

    /* renamed from: d */
    private final boolean f5655d;

    /* renamed from: e */
    private final ChannelMappingAudioProcessor f5656e;

    /* renamed from: f */
    private final TrimmingAudioProcessor f5657f;

    /* renamed from: g */
    private final AudioProcessor[] f5658g;

    /* renamed from: h */
    private final AudioProcessor[] f5659h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ConditionVariable f5660i;

    /* renamed from: j */
    private final AudioTrackPositionTracker f5661j;

    /* renamed from: k */
    private final ArrayDeque<C0845f> f5662k;

    /* renamed from: l */
    private final boolean f5663l;

    /* renamed from: m */
    private final boolean f5664m;

    /* renamed from: n */
    private C0848i f5665n;

    /* renamed from: o */
    private final C0846g<C0835b> f5666o;

    /* renamed from: p */
    private final C0846g<C0837d> f5667p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C0836c f5668q;

    /* renamed from: r */
    private C0842c f5669r;

    /* renamed from: s */
    private C0842c f5670s;

    /* renamed from: t */
    private AudioTrack f5671t;

    /* renamed from: u */
    private AudioAttributes f5672u;

    /* renamed from: v */
    private C0845f f5673v;

    /* renamed from: w */
    private C0845f f5674w;

    /* renamed from: x */
    private PlaybackParameters f5675x;

    /* renamed from: y */
    private ByteBuffer f5676y;

    /* renamed from: z */
    private int f5677z;

    /* renamed from: c.a.a.a.b2.y$a */
    /* compiled from: DefaultAudioSink */
    class C0840a extends Thread {

        /* renamed from: a */
        final /* synthetic */ AudioTrack f5678a;

        C0840a(String str, AudioTrack audioTrack) {
            this.f5678a = audioTrack;
            super(str);
        }

        public void run() {
            try {
                this.f5678a.flush();
                this.f5678a.release();
            } finally {
                DefaultAudioSink.this.f5660i.open();
            }
        }
    }

    /* renamed from: c.a.a.a.b2.y$b */
    /* compiled from: DefaultAudioSink */
    public interface C0841b {
        /* renamed from: a */
        PlaybackParameters mo5926a(PlaybackParameters i1Var);

        /* renamed from: b */
        long mo5927b();

        /* renamed from: c */
        boolean mo5928c(boolean z);

        /* renamed from: d */
        long mo5929d(long j);

        /* renamed from: e */
        AudioProcessor[] mo5930e();
    }

    /* renamed from: c.a.a.a.b2.y$c */
    /* compiled from: DefaultAudioSink */
    private static final class C0842c {

        /* renamed from: a */
        public final Format f5680a;

        /* renamed from: b */
        public final int f5681b;

        /* renamed from: c */
        public final int f5682c;

        /* renamed from: d */
        public final int f5683d;

        /* renamed from: e */
        public final int f5684e;

        /* renamed from: f */
        public final int f5685f;

        /* renamed from: g */
        public final int f5686g;

        /* renamed from: h */
        public final int f5687h;

        /* renamed from: i */
        public final AudioProcessor[] f5688i;

        public C0842c(Format u0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, AudioProcessor[] qVarArr) {
            this.f5680a = u0Var;
            this.f5681b = i;
            this.f5682c = i2;
            this.f5683d = i3;
            this.f5684e = i4;
            this.f5685f = i5;
            this.f5686g = i6;
            this.f5688i = qVarArr;
            this.f5687h = m6846c(i7, z);
        }

        /* renamed from: c */
        private int m6846c(int i, boolean z) {
            if (i != 0) {
                return i;
            }
            int i2 = this.f5682c;
            if (i2 == 0) {
                return m6854m(z ? 8.0f : 1.0f);
            } else if (i2 == 1) {
                return m6853l(50000000);
            } else {
                if (i2 == 2) {
                    return m6853l(250000);
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: d */
        private AudioTrack m6847d(boolean z, AudioAttributes nVar, int i) {
            int i2 = Util.f8398a;
            if (i2 >= 29) {
                return m6849f(z, nVar, i);
            }
            if (i2 >= 21) {
                return m6848e(z, nVar, i);
            }
            return m6850g(nVar, i);
        }

        /* renamed from: e */
        private AudioTrack m6848e(boolean z, AudioAttributes nVar, int i) {
            AudioTrack audioTrack = new AudioTrack(m6851j(nVar, z), DefaultAudioSink.m6781J(this.f5684e, this.f5685f, this.f5686g), this.f5687h, 1, i);
            return audioTrack;
        }

        /* renamed from: f */
        private AudioTrack m6849f(boolean z, AudioAttributes nVar, int i) {
            AudioFormat e = DefaultAudioSink.m6781J(this.f5684e, this.f5685f, this.f5686g);
            AudioAttributes j = m6851j(nVar, z);
            boolean z2 = true;
            Builder sessionId = new Builder().setAudioAttributes(j).setAudioFormat(e).setTransferMode(1).setBufferSizeInBytes(this.f5687h).setSessionId(i);
            if (this.f5682c != 1) {
                z2 = false;
            }
            return sessionId.setOffloadedPlayback(z2).build();
        }

        /* renamed from: g */
        private AudioTrack m6850g(AudioAttributes nVar, int i) {
            int Z = Util.m10276Z(nVar.f5545d);
            if (i == 0) {
                AudioTrack audioTrack = new AudioTrack(Z, this.f5684e, this.f5685f, this.f5686g, this.f5687h, 1);
                return audioTrack;
            }
            AudioTrack audioTrack2 = new AudioTrack(Z, this.f5684e, this.f5685f, this.f5686g, this.f5687h, 1, i);
            return audioTrack2;
        }

        /* renamed from: j */
        private static AudioAttributes m6851j(AudioAttributes nVar, boolean z) {
            if (z) {
                return m6852k();
            }
            return nVar.mo5838a();
        }

        /* renamed from: k */
        private static AudioAttributes m6852k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: l */
        private int m6853l(long j) {
            int x = DefaultAudioSink.m6787P(this.f5686g);
            if (this.f5686g == 5) {
                x *= 2;
            }
            return (int) ((j * ((long) x)) / 1000000);
        }

        /* renamed from: m */
        private int m6854m(float f) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f5684e, this.f5685f, this.f5686g);
            Assertions.m10154f(minBufferSize != -2);
            int p = Util.m10307p(minBufferSize * 4, ((int) mo5933h(250000)) * this.f5683d, Math.max(minBufferSize, ((int) mo5933h(750000)) * this.f5683d));
            return f != 1.0f ? Math.round(((float) p) * f) : p;
        }

        /* renamed from: a */
        public AudioTrack mo5931a(boolean z, AudioAttributes nVar, int i) throws C0835b {
            try {
                AudioTrack d = m6847d(z, nVar, i);
                int state = d.getState();
                if (state == 1) {
                    return d;
                }
                try {
                    d.release();
                } catch (Exception unused) {
                }
                C0835b bVar = new C0835b(state, this.f5684e, this.f5685f, this.f5687h, this.f5680a, mo5936o(), null);
                throw bVar;
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                C0835b bVar2 = new C0835b(0, this.f5684e, this.f5685f, this.f5687h, this.f5680a, mo5936o(), e);
                throw bVar2;
            }
        }

        /* renamed from: b */
        public boolean mo5932b(C0842c cVar) {
            return cVar.f5682c == this.f5682c && cVar.f5686g == this.f5686g && cVar.f5684e == this.f5684e && cVar.f5685f == this.f5685f && cVar.f5683d == this.f5683d;
        }

        /* renamed from: h */
        public long mo5933h(long j) {
            return (j * ((long) this.f5684e)) / 1000000;
        }

        /* renamed from: i */
        public long mo5934i(long j) {
            return (j * 1000000) / ((long) this.f5684e);
        }

        /* renamed from: n */
        public long mo5935n(long j) {
            return (j * 1000000) / ((long) this.f5680a.f8828z);
        }

        /* renamed from: o */
        public boolean mo5936o() {
            return this.f5682c == 1;
        }
    }

    /* renamed from: c.a.a.a.b2.y$d */
    /* compiled from: DefaultAudioSink */
    public static class C0843d implements C0841b {

        /* renamed from: a */
        private final AudioProcessor[] f5689a;

        /* renamed from: b */
        private final SilenceSkippingAudioProcessor f5690b;

        /* renamed from: c */
        private final SonicAudioProcessor f5691c;

        public C0843d(AudioProcessor... qVarArr) {
            this(qVarArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }

        /* renamed from: a */
        public PlaybackParameters mo5926a(PlaybackParameters i1Var) {
            this.f5691c.mo5831i(i1Var.f7376b);
            this.f5691c.mo5830h(i1Var.f7377c);
            return i1Var;
        }

        /* renamed from: b */
        public long mo5927b() {
            return this.f5690b.mo5814p();
        }

        /* renamed from: c */
        public boolean mo5928c(boolean z) {
            this.f5690b.mo5815v(z);
            return z;
        }

        /* renamed from: d */
        public long mo5929d(long j) {
            return this.f5691c.mo5829g(j);
        }

        /* renamed from: e */
        public AudioProcessor[] mo5930e() {
            return this.f5689a;
        }

        public C0843d(AudioProcessor[] qVarArr, SilenceSkippingAudioProcessor f0Var, SonicAudioProcessor h0Var) {
            AudioProcessor[] qVarArr2 = new AudioProcessor[(qVarArr.length + 2)];
            this.f5689a = qVarArr2;
            System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            this.f5690b = f0Var;
            this.f5691c = h0Var;
            qVarArr2[qVarArr.length] = f0Var;
            qVarArr2[qVarArr.length + 1] = h0Var;
        }
    }

    /* renamed from: c.a.a.a.b2.y$e */
    /* compiled from: DefaultAudioSink */
    public static final class C0844e extends RuntimeException {
        /* synthetic */ C0844e(String str, C0840a aVar) {
            this(str);
        }

        private C0844e(String str) {
            super(str);
        }
    }

    /* renamed from: c.a.a.a.b2.y$f */
    /* compiled from: DefaultAudioSink */
    private static final class C0845f {

        /* renamed from: a */
        public final PlaybackParameters f5692a;

        /* renamed from: b */
        public final boolean f5693b;

        /* renamed from: c */
        public final long f5694c;

        /* renamed from: d */
        public final long f5695d;

        /* synthetic */ C0845f(PlaybackParameters i1Var, boolean z, long j, long j2, C0840a aVar) {
            this(i1Var, z, j, j2);
        }

        private C0845f(PlaybackParameters i1Var, boolean z, long j, long j2) {
            this.f5692a = i1Var;
            this.f5693b = z;
            this.f5694c = j;
            this.f5695d = j2;
        }
    }

    /* renamed from: c.a.a.a.b2.y$g */
    /* compiled from: DefaultAudioSink */
    private static final class C0846g<T extends Exception> {

        /* renamed from: a */
        private final long f5696a;

        /* renamed from: b */
        private T f5697b;

        /* renamed from: c */
        private long f5698c;

        public C0846g(long j) {
            this.f5696a = j;
        }

        /* renamed from: a */
        public void mo5937a() {
            this.f5697b = null;
        }

        /* renamed from: b */
        public void mo5938b(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f5697b == null) {
                this.f5697b = t;
                this.f5698c = this.f5696a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f5698c) {
                T t2 = this.f5697b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f5697b;
                mo5937a();
                throw t3;
            }
        }
    }

    /* renamed from: c.a.a.a.b2.y$h */
    /* compiled from: DefaultAudioSink */
    private final class C0847h implements C0839a {
        private C0847h() {
        }

        /* renamed from: a */
        public void mo5914a(int i, long j) {
            if (DefaultAudioSink.this.f5668q != null) {
                DefaultAudioSink.this.f5668q.mo5804f(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f5650Y);
            }
        }

        /* renamed from: b */
        public void mo5915b(long j) {
            if (DefaultAudioSink.this.f5668q != null) {
                DefaultAudioSink.this.f5668q.mo5800b(j);
            }
        }

        /* renamed from: c */
        public void mo5916c(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            String str = ", ";
            sb.append(str);
            sb.append(j2);
            sb.append(str);
            sb.append(j3);
            sb.append(str);
            sb.append(j4);
            sb.append(str);
            sb.append(DefaultAudioSink.this.m6789S());
            sb.append(str);
            sb.append(DefaultAudioSink.this.m6790T());
            String sb2 = sb.toString();
            if (!DefaultAudioSink.f5625a) {
                Log.m10386h("DefaultAudioSink", sb2);
                return;
            }
            throw new C0844e(sb2, null);
        }

        /* renamed from: d */
        public void mo5917d(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            String str = ", ";
            sb.append(str);
            sb.append(j2);
            sb.append(str);
            sb.append(j3);
            sb.append(str);
            sb.append(j4);
            sb.append(str);
            sb.append(DefaultAudioSink.this.m6789S());
            sb.append(str);
            sb.append(DefaultAudioSink.this.m6790T());
            String sb2 = sb.toString();
            if (!DefaultAudioSink.f5625a) {
                Log.m10386h("DefaultAudioSink", sb2);
                return;
            }
            throw new C0844e(sb2, null);
        }

        /* renamed from: e */
        public void mo5918e(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
            Log.m10386h("DefaultAudioSink", sb.toString());
        }

        /* synthetic */ C0847h(DefaultAudioSink yVar, C0840a aVar) {
            this();
        }
    }

    /* renamed from: c.a.a.a.b2.y$i */
    /* compiled from: DefaultAudioSink */
    private final class C0848i {

        /* renamed from: a */
        private final Handler f5700a = new Handler();

        /* renamed from: b */
        private final StreamEventCallback f5701b;

        /* renamed from: c.a.a.a.b2.y$i$a */
        /* compiled from: DefaultAudioSink */
        class C0849a extends StreamEventCallback {

            /* renamed from: a */
            final /* synthetic */ DefaultAudioSink f5703a;

            C0849a(DefaultAudioSink yVar) {
                this.f5703a = yVar;
            }
        }

        public C0848i() {
            this.f5701b = new C0849a(DefaultAudioSink.this);
        }

        /* renamed from: a */
        public void mo5939a(AudioTrack audioTrack) {
            Handler handler = this.f5700a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new C0822j(handler), this.f5701b);
        }

        /* renamed from: b */
        public void mo5940b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f5701b);
            this.f5700a.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(AudioCapabilities oVar, C0841b bVar, boolean z, boolean z2, boolean z3) {
        this.f5653b = oVar;
        this.f5654c = (C0841b) Assertions.m10153e(bVar);
        int i = Util.f8398a;
        this.f5655d = i >= 21 && z;
        this.f5663l = i >= 23 && z2;
        this.f5664m = i >= 29 && z3;
        this.f5660i = new ConditionVariable(true);
        this.f5661j = new AudioTrackPositionTracker(new C0847h(this, null));
        ChannelMappingAudioProcessor xVar = new ChannelMappingAudioProcessor();
        this.f5656e = xVar;
        TrimmingAudioProcessor i0Var = new TrimmingAudioProcessor();
        this.f5657f = i0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new BaseAudioProcessor[]{new ResamplingAudioProcessor(), xVar, i0Var});
        Collections.addAll(arrayList, bVar.mo5930e());
        this.f5658g = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f5659h = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.f5634I = 1.0f;
        this.f5672u = AudioAttributes.f5542a;
        this.f5647V = 0;
        this.f5648W = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters i1Var = PlaybackParameters.f7375a;
        C0845f fVar = new C0845f(i1Var, false, 0, 0, null);
        this.f5674w = fVar;
        this.f5675x = i1Var;
        this.f5642Q = -1;
        this.f5635J = new AudioProcessor[0];
        this.f5636K = new ByteBuffer[0];
        this.f5662k = new ArrayDeque<>();
        this.f5666o = new C0846g<>(100);
        this.f5667p = new C0846g<>(100);
    }

    /* renamed from: D */
    private void m6775D(long j) {
        PlaybackParameters i1Var;
        if (m6810m0()) {
            i1Var = this.f5654c.mo5926a(m6782K());
        } else {
            i1Var = PlaybackParameters.f7375a;
        }
        PlaybackParameters i1Var2 = i1Var;
        boolean c = m6810m0() ? this.f5654c.mo5928c(mo5924R()) : false;
        ArrayDeque<C0845f> arrayDeque = this.f5662k;
        C0845f fVar = new C0845f(i1Var2, c, Math.max(0, j), this.f5670s.mo5934i(m6790T()), null);
        arrayDeque.add(fVar);
        m6809l0();
        C0836c cVar = this.f5668q;
        if (cVar != null) {
            cVar.mo5799a(c);
        }
    }

    /* renamed from: E */
    private long m6776E(long j) {
        while (!this.f5662k.isEmpty() && j >= ((C0845f) this.f5662k.getFirst()).f5695d) {
            this.f5674w = (C0845f) this.f5662k.remove();
        }
        C0845f fVar = this.f5674w;
        long j2 = j - fVar.f5695d;
        if (fVar.f5692a.equals(PlaybackParameters.f7375a)) {
            return this.f5674w.f5694c + j2;
        }
        if (this.f5662k.isEmpty()) {
            return this.f5674w.f5694c + this.f5654c.mo5929d(j2);
        }
        C0845f fVar2 = (C0845f) this.f5662k.getFirst();
        return fVar2.f5694c - Util.m10268R(fVar2.f5695d - j, this.f5674w.f5692a.f7376b);
    }

    /* renamed from: F */
    private long m6777F(long j) {
        return j + this.f5670s.mo5934i(this.f5654c.mo5927b());
    }

    /* renamed from: G */
    private AudioTrack m6778G() throws C0835b {
        try {
            return ((C0842c) Assertions.m10153e(this.f5670s)).mo5931a(this.f5649X, this.f5672u, this.f5647V);
        } catch (C0835b e) {
            m6798b0();
            C0836c cVar = this.f5668q;
            if (cVar != null) {
                cVar.mo5802d(e);
            }
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m6779H() throws p067c.p068a.p069a.p070a.p072b2.AudioSink.C0837d {
        /*
            r9 = this;
            int r0 = r9.f5642Q
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f5642Q = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f5642Q
            c.a.a.a.b2.q[] r5 = r9.f5635J
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo5826c()
        L_0x001f:
            r9.m6800d0(r7)
            boolean r0 = r4.mo5825b()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f5642Q
            int r0 = r0 + r2
            r9.f5642Q = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f5639N
            if (r0 == 0) goto L_0x003b
            r9.m6812o0(r0, r7)
            java.nio.ByteBuffer r0 = r9.f5639N
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f5642Q = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p072b2.DefaultAudioSink.m6779H():boolean");
    }

    /* renamed from: I */
    private void m6780I() {
        int i = 0;
        while (true) {
            AudioProcessor[] qVarArr = this.f5635J;
            if (i < qVarArr.length) {
                AudioProcessor qVar = qVarArr[i];
                qVar.flush();
                this.f5636K[i] = qVar.mo5824a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static AudioFormat m6781J(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* renamed from: K */
    private PlaybackParameters m6782K() {
        return m6788Q().f5692a;
    }

    /* renamed from: L */
    private static int m6783L(int i) {
        int i2 = Util.f8398a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26) {
            if ("fugu".equals(Util.f8399b) && i == 1) {
                i = 2;
            }
        }
        return Util.m10243D(i);
    }

    /* renamed from: M */
    private static Pair<Integer, Integer> m6784M(Format u0Var, AudioCapabilities oVar) {
        if (oVar == null) {
            return null;
        }
        int f = MimeTypes.m10400f((String) Assertions.m10153e(u0Var.f8814l), u0Var.f8811i);
        int i = 6;
        if (!(f == 5 || f == 6 || f == 18 || f == 17 || f == 7 || f == 8 || f == 14)) {
            return null;
        }
        if (f == 18 && !oVar.mo5843e(18)) {
            f = 6;
        } else if (f == 8 && !oVar.mo5843e(8)) {
            f = 7;
        }
        if (!oVar.mo5843e(f)) {
            return null;
        }
        if (f != 18) {
            i = u0Var.f8827y;
            if (i > oVar.mo5842d()) {
                return null;
            }
        } else if (Util.f8398a >= 29) {
            i = m6786O(18, u0Var.f8828z);
            if (i == 0) {
                Log.m10386h("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        }
        int L = m6783L(i);
        if (L == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f), Integer.valueOf(L));
    }

    /* renamed from: N */
    private static int m6785N(int i, ByteBuffer byteBuffer) {
        int i2;
        switch (i) {
            case 5:
            case 6:
            case 18:
                return Ac3Util.m6628d(byteBuffer);
            case 7:
            case 8:
                return DtsUtil.m6879e(byteBuffer);
            case 9:
                int m = MpegAudioUtil.m6549m(Util.m10245E(byteBuffer, byteBuffer.position()));
                if (m != -1) {
                    return m;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 14:
                int a = Ac3Util.m6625a(byteBuffer);
                if (a == -1) {
                    i2 = 0;
                } else {
                    i2 = Ac3Util.m6632h(byteBuffer, a) * 16;
                }
                return i2;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return Ac4Util.m6636c(byteBuffer);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected audio encoding: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: O */
    private static int m6786O(int i, int i2) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(Util.m10243D(i3)).build(), build)) {
                return i3;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static int m6787P(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: Q */
    private C0845f m6788Q() {
        C0845f fVar = this.f5673v;
        if (fVar != null) {
            return fVar;
        }
        if (!this.f5662k.isEmpty()) {
            return (C0845f) this.f5662k.getLast();
        }
        return this.f5674w;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public long m6789S() {
        C0842c cVar = this.f5670s;
        if (cVar.f5682c == 0) {
            return this.f5626A / ((long) cVar.f5681b);
        }
        return this.f5627B;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public long m6790T() {
        C0842c cVar = this.f5670s;
        if (cVar.f5682c == 0) {
            return this.f5628C / ((long) cVar.f5683d);
        }
        return this.f5629D;
    }

    /* renamed from: U */
    private void m6791U() throws C0835b {
        this.f5660i.block();
        AudioTrack G = m6778G();
        this.f5671t = G;
        if (m6795Y(G)) {
            m6802e0(this.f5671t);
            AudioTrack audioTrack = this.f5671t;
            Format u0Var = this.f5670s.f5680a;
            audioTrack.setOffloadDelayPadding(u0Var.f8798B, u0Var.f8799C);
        }
        this.f5647V = this.f5671t.getAudioSessionId();
        AudioTrackPositionTracker uVar = this.f5661j;
        AudioTrack audioTrack2 = this.f5671t;
        C0842c cVar = this.f5670s;
        uVar.mo5911t(audioTrack2, cVar.f5682c == 2, cVar.f5686g, cVar.f5683d, cVar.f5687h);
        m6806i0();
        int i = this.f5648W.f5614a;
        if (i != 0) {
            this.f5671t.attachAuxEffect(i);
            this.f5671t.setAuxEffectSendLevel(this.f5648W.f5615b);
        }
        this.f5632G = true;
    }

    /* renamed from: V */
    private static boolean m6792V(int i) {
        return (Util.f8398a >= 24 && i == -6) || i == -32;
    }

    /* renamed from: W */
    private boolean m6793W() {
        return this.f5671t != null;
    }

    /* renamed from: X */
    private static boolean m6794X() {
        return Util.f8398a >= 30 && Util.f8401d.startsWith("Pixel");
    }

    /* renamed from: Y */
    private static boolean m6795Y(AudioTrack audioTrack) {
        return Util.f8398a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: Z */
    private static boolean m6796Z(Format u0Var, AudioAttributes nVar) {
        boolean z = false;
        if (Util.f8398a < 29) {
            return false;
        }
        int f = MimeTypes.m10400f((String) Assertions.m10153e(u0Var.f8814l), u0Var.f8811i);
        if (f == 0) {
            return false;
        }
        int D = Util.m10243D(u0Var.f8827y);
        if (D == 0 || !AudioManager.isOffloadedPlaybackSupported(m6781J(u0Var.f8828z, D, f), nVar.mo5838a())) {
            return false;
        }
        if ((u0Var.f8798B == 0 && u0Var.f8799C == 0) || m6794X()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a0 */
    private static boolean m6797a0(Format u0Var, AudioCapabilities oVar) {
        return m6784M(u0Var, oVar) != null;
    }

    /* renamed from: b0 */
    private void m6798b0() {
        if (this.f5670s.mo5936o()) {
            this.f5651Z = true;
        }
    }

    /* renamed from: c0 */
    private void m6799c0() {
        if (!this.f5644S) {
            this.f5644S = true;
            this.f5661j.mo5904h(m6790T());
            this.f5671t.stop();
            this.f5677z = 0;
        }
    }

    /* renamed from: d0 */
    private void m6800d0(long j) throws C0837d {
        ByteBuffer byteBuffer;
        int length = this.f5635J.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f5636K[i - 1];
            } else {
                byteBuffer = this.f5637L;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f5556a;
                }
            }
            if (i == length) {
                m6812o0(byteBuffer, j);
            } else {
                AudioProcessor qVar = this.f5635J[i];
                if (i > this.f5642Q) {
                    qVar.mo5765e(byteBuffer);
                }
                ByteBuffer a = qVar.mo5824a();
                this.f5636K[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: e0 */
    private void m6802e0(AudioTrack audioTrack) {
        if (this.f5665n == null) {
            this.f5665n = new C0848i();
        }
        this.f5665n.mo5939a(audioTrack);
    }

    /* renamed from: f0 */
    private void m6803f0() {
        this.f5626A = 0;
        this.f5627B = 0;
        this.f5628C = 0;
        this.f5629D = 0;
        this.f5652a0 = false;
        this.f5630E = 0;
        C0845f fVar = new C0845f(m6782K(), mo5924R(), 0, 0, null);
        this.f5674w = fVar;
        this.f5633H = 0;
        this.f5673v = null;
        this.f5662k.clear();
        this.f5637L = null;
        this.f5638M = 0;
        this.f5639N = null;
        this.f5644S = false;
        this.f5643R = false;
        this.f5642Q = -1;
        this.f5676y = null;
        this.f5677z = 0;
        this.f5657f.mo5835n();
        m6780I();
    }

    /* renamed from: g0 */
    private void m6804g0(PlaybackParameters i1Var, boolean z) {
        C0845f Q = m6788Q();
        if (!i1Var.equals(Q.f5692a) || z != Q.f5693b) {
            C0845f fVar = new C0845f(i1Var, z, -9223372036854775807L, -9223372036854775807L, null);
            if (m6793W()) {
                this.f5673v = fVar;
            } else {
                this.f5674w = fVar;
            }
        }
    }

    /* renamed from: h0 */
    private void m6805h0(PlaybackParameters i1Var) {
        if (m6793W()) {
            try {
                this.f5671t.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(i1Var.f7376b).setPitch(i1Var.f7377c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                Log.m10387i("DefaultAudioSink", "Failed to set playback params", e);
            }
            i1Var = new PlaybackParameters(this.f5671t.getPlaybackParams().getSpeed(), this.f5671t.getPlaybackParams().getPitch());
            this.f5661j.mo5912u(i1Var.f7376b);
        }
        this.f5675x = i1Var;
    }

    /* renamed from: i0 */
    private void m6806i0() {
        if (m6793W()) {
            if (Util.f8398a >= 21) {
                m6807j0(this.f5671t, this.f5634I);
            } else {
                m6808k0(this.f5671t, this.f5634I);
            }
        }
    }

    /* renamed from: j0 */
    private static void m6807j0(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: k0 */
    private static void m6808k0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: l0 */
    private void m6809l0() {
        AudioProcessor[] qVarArr = this.f5670s.f5688i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor qVar : qVarArr) {
            if (qVar.mo5810d()) {
                arrayList.add(qVar);
            } else {
                qVar.flush();
            }
        }
        int size = arrayList.size();
        this.f5635J = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f5636K = new ByteBuffer[size];
        m6780I();
    }

    /* renamed from: m0 */
    private boolean m6810m0() {
        if (!this.f5649X) {
            if ("audio/raw".equals(this.f5670s.f5680a.f8814l) && !m6811n0(this.f5670s.f5680a.f8797A)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n0 */
    private boolean m6811n0(int i) {
        return this.f5655d && Util.m10294i0(i);
    }

    /* renamed from: o0 */
    private void m6812o0(ByteBuffer byteBuffer, long j) throws C0837d {
        int i;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f5639N;
            boolean z = true;
            if (byteBuffer2 != null) {
                Assertions.m10149a(byteBuffer2 == byteBuffer);
            } else {
                this.f5639N = byteBuffer;
                if (Util.f8398a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f5640O;
                    if (bArr == null || bArr.length < remaining) {
                        this.f5640O = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f5640O, 0, remaining);
                    byteBuffer.position(position);
                    this.f5641P = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (Util.f8398a < 21) {
                int c = this.f5661j.mo5901c(this.f5628C);
                if (c > 0) {
                    i = this.f5671t.write(this.f5640O, this.f5641P, Math.min(remaining2, c));
                    if (i > 0) {
                        this.f5641P += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else if (this.f5649X) {
                Assertions.m10154f(j != -9223372036854775807L);
                i = m6814q0(this.f5671t, byteBuffer, remaining2, j);
            } else {
                i = m6813p0(this.f5671t, byteBuffer, remaining2);
            }
            this.f5650Y = SystemClock.elapsedRealtime();
            if (i < 0) {
                boolean V = m6792V(i);
                if (V) {
                    m6798b0();
                }
                C0837d dVar = new C0837d(i, this.f5670s.f5680a, V);
                C0836c cVar = this.f5668q;
                if (cVar != null) {
                    cVar.mo5802d(dVar);
                }
                if (!dVar.f5569b) {
                    this.f5667p.mo5938b(dVar);
                    return;
                }
                throw dVar;
            }
            this.f5667p.mo5937a();
            if (m6795Y(this.f5671t)) {
                long j2 = this.f5629D;
                if (j2 > 0) {
                    this.f5652a0 = false;
                }
                if (this.f5645T && this.f5668q != null && i < remaining2 && !this.f5652a0) {
                    this.f5668q.mo5801c(this.f5661j.mo5903e(j2));
                }
            }
            int i2 = this.f5670s.f5682c;
            if (i2 == 0) {
                this.f5628C += (long) i;
            }
            if (i == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer != this.f5637L) {
                        z = false;
                    }
                    Assertions.m10154f(z);
                    this.f5629D += (long) (this.f5630E * this.f5638M);
                }
                this.f5639N = null;
            }
        }
    }

    /* renamed from: p0 */
    private static int m6813p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: q0 */
    private int m6814q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (Util.f8398a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f5676y == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f5676y = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f5676y.putInt(1431633921);
        }
        if (this.f5677z == 0) {
            this.f5676y.putInt(4, i);
            this.f5676y.putLong(8, j * 1000);
            this.f5676y.position(0);
            this.f5677z = i;
        }
        int remaining = this.f5676y.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f5676y, remaining, 1);
            if (write < 0) {
                this.f5677z = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int p0 = m6813p0(audioTrack, byteBuffer, i);
        if (p0 < 0) {
            this.f5677z = 0;
            return p0;
        }
        this.f5677z -= p0;
        return p0;
    }

    /* renamed from: R */
    public boolean mo5924R() {
        return m6788Q().f5693b;
    }

    /* renamed from: a */
    public boolean mo5867a(Format u0Var) {
        return mo5883q(u0Var) != 0;
    }

    /* renamed from: b */
    public boolean mo5868b() {
        return !m6793W() || (this.f5643R && !mo5875i());
    }

    /* renamed from: c */
    public PlaybackParameters mo5869c() {
        if (this.f5663l) {
            return this.f5675x;
        }
        return m6782K();
    }

    /* renamed from: d */
    public void mo5870d() {
        this.f5645T = false;
        if (m6793W() && this.f5661j.mo5909q()) {
            this.f5671t.pause();
        }
    }

    /* renamed from: f */
    public void mo5871f(PlaybackParameters i1Var) {
        PlaybackParameters i1Var2 = new PlaybackParameters(Util.m10305o(i1Var.f7376b, 0.1f, 8.0f), Util.m10305o(i1Var.f7377c, 0.1f, 8.0f));
        if (!this.f5663l || Util.f8398a < 23) {
            m6804g0(i1Var2, mo5924R());
        } else {
            m6805h0(i1Var2);
        }
    }

    public void flush() {
        if (m6793W()) {
            m6803f0();
            if (this.f5661j.mo5906j()) {
                this.f5671t.pause();
            }
            if (m6795Y(this.f5671t)) {
                ((C0848i) Assertions.m10153e(this.f5665n)).mo5940b(this.f5671t);
            }
            AudioTrack audioTrack = this.f5671t;
            this.f5671t = null;
            if (Util.f8398a < 21 && !this.f5646U) {
                this.f5647V = 0;
            }
            C0842c cVar = this.f5669r;
            if (cVar != null) {
                this.f5670s = cVar;
                this.f5669r = null;
            }
            this.f5661j.mo5910r();
            this.f5660i.close();
            new C0840a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f5667p.mo5937a();
        this.f5666o.mo5937a();
    }

    /* renamed from: g */
    public void mo5873g() {
        Assertions.m10154f(Util.f8398a >= 21);
        Assertions.m10154f(this.f5646U);
        if (!this.f5649X) {
            this.f5649X = true;
            flush();
        }
    }

    /* renamed from: h */
    public void mo5874h() throws C0837d {
        if (!this.f5643R && m6793W() && m6779H()) {
            m6799c0();
            this.f5643R = true;
        }
    }

    /* renamed from: i */
    public boolean mo5875i() {
        return m6793W() && this.f5661j.mo5905i(m6790T());
    }

    /* renamed from: j */
    public void mo5876j(int i) {
        if (this.f5647V != i) {
            this.f5647V = i;
            this.f5646U = i != 0;
            flush();
        }
    }

    /* renamed from: k */
    public void mo5877k() {
        this.f5645T = true;
        if (m6793W()) {
            this.f5661j.mo5913v();
            this.f5671t.play();
        }
    }

    /* renamed from: l */
    public boolean mo5878l(ByteBuffer byteBuffer, long j, int i) throws C0835b, C0837d {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        int i2 = i;
        ByteBuffer byteBuffer3 = this.f5637L;
        Assertions.m10149a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f5669r != null) {
            if (!m6779H()) {
                return false;
            }
            if (!this.f5669r.mo5932b(this.f5670s)) {
                m6799c0();
                if (mo5875i()) {
                    return false;
                }
                flush();
            } else {
                this.f5670s = this.f5669r;
                this.f5669r = null;
                if (m6795Y(this.f5671t)) {
                    this.f5671t.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f5671t;
                    Format u0Var = this.f5670s.f5680a;
                    audioTrack.setOffloadDelayPadding(u0Var.f8798B, u0Var.f8799C);
                    this.f5652a0 = true;
                }
            }
            m6775D(j2);
        }
        if (!m6793W()) {
            try {
                m6791U();
            } catch (C0835b e) {
                C0835b bVar = e;
                if (!bVar.f5566b) {
                    this.f5666o.mo5938b(bVar);
                    return false;
                }
                throw bVar;
            }
        }
        this.f5666o.mo5937a();
        if (this.f5632G) {
            this.f5633H = Math.max(0, j2);
            this.f5631F = false;
            this.f5632G = false;
            if (this.f5663l && Util.f8398a >= 23) {
                m6805h0(this.f5675x);
            }
            m6775D(j2);
            if (this.f5645T) {
                mo5877k();
            }
        }
        if (!this.f5661j.mo5908l(m6790T())) {
            return false;
        }
        String str = "DefaultAudioSink";
        if (this.f5637L == null) {
            Assertions.m10149a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C0842c cVar = this.f5670s;
            if (cVar.f5682c != 0 && this.f5630E == 0) {
                int N = m6785N(cVar.f5686g, byteBuffer2);
                this.f5630E = N;
                if (N == 0) {
                    return true;
                }
            }
            if (this.f5673v != null) {
                if (!m6779H()) {
                    return false;
                }
                m6775D(j2);
                this.f5673v = null;
            }
            long n = this.f5633H + this.f5670s.mo5935n(m6789S() - this.f5657f.mo5834m());
            if (!this.f5631F && Math.abs(n - j2) > 200000) {
                StringBuilder sb = new StringBuilder();
                sb.append("Discontinuity detected [expected ");
                sb.append(n);
                sb.append(", got ");
                sb.append(j2);
                sb.append("]");
                Log.m10381c(str, sb.toString());
                this.f5631F = true;
            }
            if (this.f5631F) {
                if (!m6779H()) {
                    return false;
                }
                long j3 = j2 - n;
                this.f5633H += j3;
                this.f5631F = false;
                m6775D(j2);
                C0836c cVar2 = this.f5668q;
                if (!(cVar2 == null || j3 == 0)) {
                    cVar2.mo5803e();
                }
            }
            if (this.f5670s.f5682c == 0) {
                this.f5626A += (long) byteBuffer.remaining();
            } else {
                this.f5627B += (long) (this.f5630E * i2);
            }
            this.f5637L = byteBuffer2;
            this.f5638M = i2;
        }
        m6800d0(j2);
        if (!this.f5637L.hasRemaining()) {
            this.f5637L = null;
            this.f5638M = 0;
            return true;
        } else if (!this.f5661j.mo5907k(m6790T())) {
            return false;
        } else {
            Log.m10386h(str, "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    /* renamed from: m */
    public long mo5879m(boolean z) {
        if (!m6793W() || this.f5632G) {
            return Long.MIN_VALUE;
        }
        return m6777F(m6776E(Math.min(this.f5661j.mo5902d(z), this.f5670s.mo5934i(m6790T()))));
    }

    /* renamed from: n */
    public void mo5880n() {
        if (this.f5649X) {
            this.f5649X = false;
            flush();
        }
    }

    /* renamed from: o */
    public void mo5881o(C0836c cVar) {
        this.f5668q = cVar;
    }

    /* renamed from: p */
    public void mo5882p(AudioAttributes nVar) {
        if (!this.f5672u.equals(nVar)) {
            this.f5672u = nVar;
            if (!this.f5649X) {
                flush();
            }
        }
    }

    /* renamed from: q */
    public int mo5883q(Format u0Var) {
        if (!"audio/raw".equals(u0Var.f8814l)) {
            return ((!this.f5664m || this.f5651Z || !m6796Z(u0Var, this.f5672u)) && !m6797a0(u0Var, this.f5653b)) ? 0 : 2;
        }
        if (!Util.m10296j0(u0Var.f8797A)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid PCM encoding: ");
            sb.append(u0Var.f8797A);
            Log.m10386h("DefaultAudioSink", sb.toString());
            return 0;
        }
        int i = u0Var.f8797A;
        if (i == 2 || (this.f5655d && i == 4)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: r */
    public void mo5884r(Format u0Var, int i, int[] iArr) throws C0834a {
        AudioProcessor[] qVarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AudioProcessor[] qVarArr2;
        int[] iArr2;
        Format u0Var2 = u0Var;
        if ("audio/raw".equals(u0Var2.f8814l)) {
            Assertions.m10149a(Util.m10296j0(u0Var2.f8797A));
            i7 = Util.m10274X(u0Var2.f8797A, u0Var2.f8827y);
            if (m6811n0(u0Var2.f8797A)) {
                qVarArr2 = this.f5659h;
            } else {
                qVarArr2 = this.f5658g;
            }
            this.f5657f.mo5836o(u0Var2.f8798B, u0Var2.f8799C);
            if (Util.f8398a < 21 && u0Var2.f8827y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.f5656e.mo5923m(iArr2);
            C0831a aVar = new C0831a(u0Var2.f8828z, u0Var2.f8827y, u0Var2.f8797A);
            int length = qVarArr2.length;
            int i9 = 0;
            while (i9 < length) {
                AudioProcessor qVar = qVarArr2[i9];
                try {
                    C0831a f = qVar.mo5827f(aVar);
                    if (qVar.mo5810d()) {
                        aVar = f;
                    }
                    i9++;
                } catch (C0832b e) {
                    throw new C0834a((Throwable) e, u0Var);
                }
            }
            int i10 = aVar.f5560d;
            i4 = aVar.f5558b;
            i3 = Util.m10243D(aVar.f5559c);
            qVarArr = qVarArr2;
            i2 = i10;
            i5 = Util.m10274X(i10, aVar.f5559c);
            i6 = 0;
        } else {
            AudioProcessor[] qVarArr3 = new AudioProcessor[0];
            int i11 = u0Var2.f8828z;
            if (!this.f5664m || !m6796Z(u0Var, this.f5672u)) {
                Pair M = m6784M(u0Var, this.f5653b);
                if (M != null) {
                    qVarArr = qVarArr3;
                    i2 = ((Integer) M.first).intValue();
                    i7 = -1;
                    i5 = -1;
                    i3 = ((Integer) M.second).intValue();
                    i4 = i11;
                    i6 = 2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(u0Var);
                    throw new C0834a(sb.toString(), u0Var);
                }
            } else {
                qVarArr = qVarArr3;
                i2 = MimeTypes.m10400f((String) Assertions.m10153e(u0Var2.f8814l), u0Var2.f8811i);
                i3 = Util.m10243D(u0Var2.f8827y);
                i7 = -1;
                i5 = -1;
                i4 = i11;
                i6 = 1;
            }
        }
        String str = ") for: ";
        if (i2 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i6);
            sb2.append(str);
            sb2.append(u0Var);
            throw new C0834a(sb2.toString(), u0Var);
        } else if (i3 != 0) {
            this.f5651Z = false;
            C0842c cVar = new C0842c(u0Var, i7, i6, i5, i4, i3, i2, i, this.f5663l, qVarArr);
            if (m6793W()) {
                this.f5669r = cVar;
            } else {
                this.f5670s = cVar;
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i6);
            sb3.append(str);
            sb3.append(u0Var);
            throw new C0834a(sb3.toString(), u0Var);
        }
    }

    public void reset() {
        flush();
        for (AudioProcessor reset : this.f5658g) {
            reset.reset();
        }
        for (AudioProcessor reset2 : this.f5659h) {
            reset2.reset();
        }
        this.f5645T = false;
        this.f5651Z = false;
    }

    /* renamed from: s */
    public void mo5886s() {
        if (Util.f8398a < 25) {
            flush();
            return;
        }
        this.f5667p.mo5937a();
        this.f5666o.mo5937a();
        if (m6793W()) {
            m6803f0();
            if (this.f5661j.mo5906j()) {
                this.f5671t.pause();
            }
            this.f5671t.flush();
            this.f5661j.mo5910r();
            AudioTrackPositionTracker uVar = this.f5661j;
            AudioTrack audioTrack = this.f5671t;
            C0842c cVar = this.f5670s;
            uVar.mo5911t(audioTrack, cVar.f5682c == 2, cVar.f5686g, cVar.f5683d, cVar.f5687h);
            this.f5632G = true;
        }
    }

    /* renamed from: t */
    public void mo5887t(boolean z) {
        m6804g0(m6782K(), z);
    }

    /* renamed from: u */
    public void mo5888u(AuxEffectInfo vVar) {
        if (!this.f5648W.equals(vVar)) {
            int i = vVar.f5614a;
            float f = vVar.f5615b;
            AudioTrack audioTrack = this.f5671t;
            if (audioTrack != null) {
                if (this.f5648W.f5614a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f5671t.setAuxEffectSendLevel(f);
                }
            }
            this.f5648W = vVar;
        }
    }

    /* renamed from: v */
    public void mo5889v() {
        this.f5631F = true;
    }

    /* renamed from: w */
    public void mo5890w(float f) {
        if (this.f5634I != f) {
            this.f5634I = f;
            m6806i0();
        }
    }
}
