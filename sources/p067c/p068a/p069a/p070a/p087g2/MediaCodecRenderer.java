package p067c.p068a.p069a.p070a.p087g2;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.umeng.analytics.pro.TType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p067c.p068a.p069a.p070a.BaseRenderer;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.p073c2.DecoderCounters;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p075e2.C0896v;
import p067c.p068a.p069a.p070a.p075e2.DrmSession;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaCrypto;
import p067c.p068a.p069a.p070a.p075e2.FrameworkMediaCrypto;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1020a;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.C1025c;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.TimedValueQueue;
import p067c.p068a.p069a.p070a.p111m2.TraceUtil;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.g2.t */
public abstract class MediaCodecRenderer extends BaseRenderer {

    /* renamed from: m */
    private static final byte[] f7098m = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, TType.f16864m, 19, 32, 0, 0, 1, 101, -120, -124, TType.f16862k, -50, 113, 24, -96, 0, 47, ByteSourceJsonBootstrapper.UTF8_BOM_3, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private final long[] f7099A;

    /* renamed from: A0 */
    private boolean f7100A0;

    /* renamed from: B */
    private Format f7101B;

    /* renamed from: B0 */
    private boolean f7102B0;

    /* renamed from: C */
    private Format f7103C;

    /* renamed from: C0 */
    private boolean f7104C0;

    /* renamed from: D */
    private C0896v f7105D;

    /* renamed from: D0 */
    private boolean f7106D0;

    /* renamed from: E0 */
    private boolean f7107E0;

    /* renamed from: F0 */
    private ExoPlaybackException f7108F0;

    /* renamed from: G */
    private C0896v f7109G;

    /* renamed from: G0 */
    protected DecoderCounters f7110G0;

    /* renamed from: H */
    private MediaCrypto f7111H;

    /* renamed from: H0 */
    private long f7112H0;

    /* renamed from: I */
    private boolean f7113I;

    /* renamed from: I0 */
    private long f7114I0;

    /* renamed from: J */
    private long f7115J;

    /* renamed from: J0 */
    private int f7116J0;

    /* renamed from: K */
    private float f7117K;

    /* renamed from: L */
    private float f7118L;

    /* renamed from: M */
    private MediaCodecAdapter f7119M;

    /* renamed from: N */
    private Format f7120N;

    /* renamed from: O */
    private MediaFormat f7121O;

    /* renamed from: P */
    private boolean f7122P;

    /* renamed from: Q */
    private float f7123Q;

    /* renamed from: R */
    private ArrayDeque<MediaCodecInfo> f7124R;

    /* renamed from: S */
    private C1022a f7125S;

    /* renamed from: T */
    private MediaCodecInfo f7126T;

    /* renamed from: U */
    private int f7127U;

    /* renamed from: V */
    private boolean f7128V;

    /* renamed from: W */
    private boolean f7129W;

    /* renamed from: X */
    private boolean f7130X;

    /* renamed from: Y */
    private boolean f7131Y;

    /* renamed from: Z */
    private boolean f7132Z;

    /* renamed from: a0 */
    private boolean f7133a0;

    /* renamed from: b0 */
    private boolean f7134b0;

    /* renamed from: c0 */
    private boolean f7135c0;

    /* renamed from: d0 */
    private boolean f7136d0;

    /* renamed from: e0 */
    private boolean f7137e0;

    /* renamed from: f0 */
    private C2Mp3TimestampTracker f7138f0;

    /* renamed from: g0 */
    private long f7139g0;

    /* renamed from: h0 */
    private int f7140h0;

    /* renamed from: i0 */
    private int f7141i0;

    /* renamed from: j0 */
    private ByteBuffer f7142j0;

    /* renamed from: k0 */
    private boolean f7143k0;

    /* renamed from: l0 */
    private boolean f7144l0;

    /* renamed from: m0 */
    private boolean f7145m0;

    /* renamed from: n */
    private final C1020a f7146n;

    /* renamed from: n0 */
    private boolean f7147n0;

    /* renamed from: o */
    private final MediaCodecSelector f7148o;

    /* renamed from: o0 */
    private boolean f7149o0;

    /* renamed from: p */
    private final boolean f7150p;

    /* renamed from: p0 */
    private boolean f7151p0;

    /* renamed from: q */
    private final float f7152q;

    /* renamed from: q0 */
    private int f7153q0;

    /* renamed from: r */
    private final DecoderInputBuffer f7154r = DecoderInputBuffer.m6907s();

    /* renamed from: r0 */
    private int f7155r0;

    /* renamed from: s */
    private final DecoderInputBuffer f7156s = new DecoderInputBuffer(0);

    /* renamed from: s0 */
    private int f7157s0;

    /* renamed from: t */
    private final DecoderInputBuffer f7158t = new DecoderInputBuffer(2);

    /* renamed from: t0 */
    private boolean f7159t0;

    /* renamed from: u */
    private final BatchBuffer f7160u;

    /* renamed from: u0 */
    private boolean f7161u0;

    /* renamed from: v */
    private final TimedValueQueue<Format> f7162v;

    /* renamed from: v0 */
    private boolean f7163v0;

    /* renamed from: w */
    private final ArrayList<Long> f7164w;

    /* renamed from: w0 */
    private long f7165w0;

    /* renamed from: x */
    private final BufferInfo f7166x;

    /* renamed from: x0 */
    private long f7167x0;

    /* renamed from: y */
    private final long[] f7168y;

    /* renamed from: y0 */
    private boolean f7169y0;

    /* renamed from: z */
    private final long[] f7170z;

    /* renamed from: z0 */
    private boolean f7171z0;

    /* renamed from: c.a.a.a.g2.t$a */
    /* compiled from: MediaCodecRenderer */
    public static class C1022a extends Exception {

        /* renamed from: a */
        public final String f7172a;

        /* renamed from: b */
        public final boolean f7173b;

        /* renamed from: c */
        public final MediaCodecInfo f7174c;

        /* renamed from: d */
        public final String f7175d;

        /* renamed from: e */
        public final C1022a f7176e;

        public C1022a(Format u0Var, Throwable th, boolean z, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(u0Var);
            this(sb.toString(), th, u0Var.f8814l, z, null, m8560b(i), null);
        }

        /* renamed from: b */
        private static String m8560b(int i) {
            String str = i < 0 ? "neg_" : "";
            StringBuilder sb = new StringBuilder();
            sb.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb.append(str);
            sb.append(Math.abs(i));
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C1022a m8561c(C1022a aVar) {
            C1022a aVar2 = new C1022a(getMessage(), getCause(), this.f7172a, this.f7173b, this.f7174c, this.f7175d, aVar);
            return aVar2;
        }

        /* renamed from: d */
        private static String m8562d(Throwable th) {
            if (th instanceof CodecException) {
                return ((CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public C1022a(Format u0Var, Throwable th, boolean z, MediaCodecInfo sVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: ");
            sb.append(sVar.f7087a);
            sb.append(", ");
            sb.append(u0Var);
            this(sb.toString(), th, u0Var.f8814l, z, sVar, Util.f8398a >= 21 ? m8562d(th) : null, null);
        }

        private C1022a(String str, Throwable th, String str2, boolean z, MediaCodecInfo sVar, String str3, C1022a aVar) {
            super(str, th);
            this.f7172a = str2;
            this.f7173b = z;
            this.f7174c = sVar;
            this.f7175d = str3;
            this.f7176e = aVar;
        }
    }

    public MediaCodecRenderer(int i, C1020a aVar, MediaCodecSelector uVar, boolean z, float f) {
        super(i);
        this.f7146n = aVar;
        this.f7148o = (MediaCodecSelector) Assertions.m10153e(uVar);
        this.f7150p = z;
        this.f7152q = f;
        BatchBuffer oVar = new BatchBuffer();
        this.f7160u = oVar;
        this.f7162v = new TimedValueQueue<>();
        this.f7164w = new ArrayList<>();
        this.f7166x = new BufferInfo();
        this.f7117K = 1.0f;
        this.f7118L = 1.0f;
        this.f7115J = -9223372036854775807L;
        this.f7168y = new long[10];
        this.f7170z = new long[10];
        this.f7099A = new long[10];
        this.f7112H0 = -9223372036854775807L;
        this.f7114I0 = -9223372036854775807L;
        oVar.mo5965o(0);
        oVar.f5744c.order(ByteOrder.nativeOrder());
        mo6480Z0();
    }

    /* renamed from: A0 */
    private boolean m8468A0() {
        return this.f7141i0 >= 0;
    }

    /* renamed from: B0 */
    private void m8469B0(Format u0Var) {
        m8493c0();
        String str = u0Var.f8814l;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f7160u.mo6454A(32);
        } else {
            this.f7160u.mo6454A(1);
        }
        this.f7145m0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x010a  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8470C0(p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo r13, android.media.MediaCrypto r14) throws java.lang.Exception {
        /*
            r12 = this;
            java.lang.String r7 = r13.f7087a
            int r1 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r1 >= r3) goto L_0x000d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0019
        L_0x000d:
            float r4 = r12.f7118L
            c.a.a.a.u0 r5 = r12.f7101B
            c.a.a.a.u0[] r6 = r12.mo6513D()
            float r4 = r12.mo5792t0(r4, r5, r6)
        L_0x0019:
            float r5 = r12.f7152q
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0022
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0023
        L_0x0022:
            r8 = r4
        L_0x0023:
            r2 = 0
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0107 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107 }
            r4.<init>()     // Catch:{ Exception -> 0x0107 }
            java.lang.String r5 = "createCodec:"
            r4.append(r5)     // Catch:{ Exception -> 0x0107 }
            r4.append(r7)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0107 }
            p067c.p068a.p069a.p070a.p111m2.TraceUtil.m10216a(r4)     // Catch:{ Exception -> 0x0107 }
            android.media.MediaCodec r4 = android.media.MediaCodec.createByCodecName(r7)     // Catch:{ Exception -> 0x0107 }
            boolean r5 = r12.f7104C0     // Catch:{ Exception -> 0x0107 }
            if (r5 == 0) goto L_0x0058
            if (r1 < r3) goto L_0x0058
            c.a.a.a.g2.l$b r1 = new c.a.a.a.g2.l$b     // Catch:{ Exception -> 0x0107 }
            int r3 = r12.mo6518g()     // Catch:{ Exception -> 0x0107 }
            boolean r5 = r12.f7106D0     // Catch:{ Exception -> 0x0107 }
            boolean r6 = r12.f7107E0     // Catch:{ Exception -> 0x0107 }
            r1.<init>(r3, r5, r6)     // Catch:{ Exception -> 0x0107 }
            c.a.a.a.g2.l r1 = r1.mo6432a(r4)     // Catch:{ Exception -> 0x0107 }
            goto L_0x005e
        L_0x0058:
            c.a.a.a.g2.q$a r1 = r12.f7146n     // Catch:{ Exception -> 0x0107 }
            c.a.a.a.g2.q r1 = r1.mo6432a(r4)     // Catch:{ Exception -> 0x0107 }
        L_0x005e:
            r11 = r1
            p067c.p068a.p069a.p070a.p111m2.TraceUtil.m10218c()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = "configureCodec"
            p067c.p068a.p069a.p070a.p111m2.TraceUtil.m10216a(r1)     // Catch:{ Exception -> 0x0104 }
            c.a.a.a.u0 r4 = r12.f7101B     // Catch:{ Exception -> 0x0104 }
            r1 = r12
            r2 = r13
            r3 = r11
            r5 = r14
            r6 = r8
            r1.mo5783a0(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0104 }
            p067c.p068a.p069a.p070a.p111m2.TraceUtil.m10218c()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = "startCodec"
            p067c.p068a.p069a.p070a.p111m2.TraceUtil.m10216a(r1)     // Catch:{ Exception -> 0x0104 }
            r11.start()     // Catch:{ Exception -> 0x0104 }
            p067c.p068a.p069a.p070a.p111m2.TraceUtil.m10218c()     // Catch:{ Exception -> 0x0104 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0104 }
            r12.f7119M = r11
            r12.f7126T = r13
            r12.f7123Q = r8
            c.a.a.a.u0 r1 = r12.f7101B
            r12.f7120N = r1
            int r1 = r12.m8478R(r7)
            r12.f7127U = r1
            c.a.a.a.u0 r1 = r12.f7120N
            boolean r1 = m8480S(r7, r1)
            r12.f7128V = r1
            boolean r1 = m8488X(r7)
            r12.f7129W = r1
            boolean r1 = m8490Z(r7)
            r12.f7130X = r1
            boolean r1 = m8483U(r7)
            r12.f7131Y = r1
            boolean r1 = m8485V(r7)
            r12.f7132Z = r1
            boolean r1 = m8481T(r7)
            r12.f7133a0 = r1
            c.a.a.a.u0 r1 = r12.f7120N
            boolean r1 = m8489Y(r7, r1)
            r12.f7134b0 = r1
            boolean r1 = m8487W(r13)
            r2 = 1
            if (r1 != 0) goto L_0x00d1
            boolean r1 = r12.mo6496s0()
            if (r1 == 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            r1 = 0
            goto L_0x00d2
        L_0x00d1:
            r1 = 1
        L_0x00d2:
            r12.f7137e0 = r1
            java.lang.String r0 = r13.f7087a
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e5
            c.a.a.a.g2.p r0 = new c.a.a.a.g2.p
            r0.<init>()
            r12.f7138f0 = r0
        L_0x00e5:
            int r0 = r12.getState()
            r1 = 2
            if (r0 != r1) goto L_0x00f5
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r5
            r12.f7139g0 = r0
        L_0x00f5:
            c.a.a.a.c2.d r0 = r12.f7110G0
            int r1 = r0.f5732a
            int r1 = r1 + r2
            r0.f5732a = r1
            long r5 = r3 - r9
            r1 = r12
            r2 = r7
            r1.mo5774K0(r2, r3, r5)
            return
        L_0x0104:
            r0 = move-exception
            r2 = r11
            goto L_0x0108
        L_0x0107:
            r0 = move-exception
        L_0x0108:
            if (r2 == 0) goto L_0x010d
            r2.mo6414a()
        L_0x010d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecRenderer.m8470C0(c.a.a.a.g2.s, android.media.MediaCrypto):void");
    }

    /* renamed from: D0 */
    private boolean m8471D0(long j) {
        int size = this.f7164w.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.f7164w.get(i)).longValue() == j) {
                this.f7164w.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: E0 */
    private static boolean m8472E0(IllegalStateException illegalStateException) {
        boolean z = true;
        if (Util.f8398a >= 21 && m8473F0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            z = false;
        }
        return z;
    }

    /* renamed from: F0 */
    private static boolean m8473F0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof CodecException;
    }

    /* renamed from: I0 */
    private void m8474I0(MediaCrypto mediaCrypto, boolean z) throws C1022a {
        if (this.f7124R == null) {
            try {
                List p0 = m8507p0(z);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.f7124R = arrayDeque;
                if (this.f7150p) {
                    arrayDeque.addAll(p0);
                } else if (!p0.isEmpty()) {
                    this.f7124R.add((MediaCodecInfo) p0.get(0));
                }
                this.f7125S = null;
            } catch (C1025c e) {
                throw new C1022a(this.f7101B, (Throwable) e, z, -49998);
            }
        }
        if (!this.f7124R.isEmpty()) {
            while (this.f7119M == null) {
                MediaCodecInfo sVar = (MediaCodecInfo) this.f7124R.peekFirst();
                if (mo6485h1(sVar)) {
                    try {
                        m8470C0(sVar, mediaCrypto);
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to initialize decoder: ");
                        sb.append(sVar);
                        Log.m10387i("MediaCodecRenderer", sb.toString(), e2);
                        this.f7124R.removeFirst();
                        C1022a aVar = new C1022a(this.f7101B, (Throwable) e2, z, sVar);
                        if (this.f7125S == null) {
                            this.f7125S = aVar;
                        } else {
                            this.f7125S = this.f7125S.m8561c(aVar);
                        }
                        if (this.f7124R.isEmpty()) {
                            throw this.f7125S;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f7124R = null;
            return;
        }
        throw new C1022a(this.f7101B, (Throwable) null, z, -49999);
    }

    /* renamed from: J0 */
    private boolean m8475J0(FrameworkMediaCrypto e0Var, Format u0Var) {
        if (e0Var.f5816d) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(e0Var.f5814b, e0Var.f5815c);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(u0Var.f8814l);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* renamed from: O */
    private void m8476O() throws ExoPlaybackException {
        Assertions.m10154f(!this.f7169y0);
        FormatHolder B = mo6511B();
        this.f7158t.mo5947f();
        do {
            this.f7158t.mo5947f();
            int M = mo6515M(B, this.f7158t, false);
            if (M == -5) {
                mo5776M0(B);
                return;
            } else if (M != -4) {
                if (M != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f7158t.mo5952k()) {
                this.f7169y0 = true;
                return;
            } else {
                if (this.f7100A0) {
                    Format u0Var = (Format) Assertions.m10153e(this.f7101B);
                    this.f7103C = u0Var;
                    mo5777N0(u0Var, null);
                    this.f7100A0 = false;
                }
                this.f7158t.mo5966p();
            }
        } while (this.f7160u.mo6455u(this.f7158t));
        this.f7147n0 = true;
    }

    /* renamed from: P */
    private boolean m8477P(long j, long j2) throws ExoPlaybackException {
        Assertions.m10154f(!this.f7171z0);
        if (this.f7160u.mo6459z()) {
            BatchBuffer oVar = this.f7160u;
            if (!mo5781S0(j, j2, null, oVar.f5744c, this.f7141i0, 0, oVar.mo6458y(), this.f7160u.mo6456w(), this.f7160u.mo5951j(), this.f7160u.mo5952k(), this.f7103C)) {
                return false;
            }
            mo6477O0(this.f7160u.mo6457x());
            this.f7160u.mo5947f();
        }
        if (this.f7169y0) {
            this.f7171z0 = true;
            return false;
        }
        if (this.f7147n0) {
            Assertions.m10154f(this.f7160u.mo6455u(this.f7158t));
            this.f7147n0 = false;
        }
        if (this.f7149o0) {
            if (this.f7160u.mo6459z()) {
                return true;
            }
            m8493c0();
            this.f7149o0 = false;
            mo6475H0();
            if (!this.f7145m0) {
                return false;
            }
        }
        m8476O();
        if (this.f7160u.mo6459z()) {
            this.f7160u.mo5966p();
        }
        return this.f7160u.mo6459z() || this.f7169y0 || this.f7149o0;
    }

    /* renamed from: R */
    private int m8478R(String str) {
        int i = Util.f8398a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Util.f8401d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
            String str3 = Util.f8399b;
            if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                return 1;
            }
        }
        return 0;
    }

    @TargetApi(23)
    /* renamed from: R0 */
    private void m8479R0() throws ExoPlaybackException {
        int i = this.f7157s0;
        if (i == 1) {
            m8505m0();
        } else if (i == 2) {
            m8505m0();
            m8506m1();
        } else if (i != 3) {
            this.f7171z0 = true;
            mo5782X0();
        } else {
            m8486V0();
        }
    }

    /* renamed from: S */
    private static boolean m8480S(String str, Format u0Var) {
        return Util.f8398a < 21 && u0Var.f8816n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: T */
    private static boolean m8481T(String str) {
        if (Util.f8398a < 21 && "OMX.SEC.mp3.dec".equals(str)) {
            if ("samsung".equals(Util.f8400c)) {
                String str2 = Util.f8399b;
                if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: T0 */
    private void m8482T0() {
        this.f7163v0 = true;
        MediaFormat h = this.f7119M.mo6422h();
        if (this.f7127U != 0 && h.getInteger("width") == 32 && h.getInteger("height") == 32) {
            this.f7136d0 = true;
            return;
        }
        if (this.f7134b0) {
            h.setInteger("channel-count", 1);
        }
        this.f7121O = h;
        this.f7122P = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ("stvm8".equals(r0) == false) goto L_0x0036;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m8483U(java.lang.String r2) {
        /*
            int r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r1 = 23
            if (r0 > r1) goto L_0x000e
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0034
        L_0x000e:
            r1 = 19
            if (r0 > r1) goto L_0x0036
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            java.lang.String r1 = "hb2000"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = "stvm8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
        L_0x0024:
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecRenderer.m8483U(java.lang.String):boolean");
    }

    /* renamed from: U0 */
    private boolean m8484U0(boolean z) throws ExoPlaybackException {
        FormatHolder B = mo6511B();
        this.f7154r.mo5947f();
        int M = mo6515M(B, this.f7154r, z);
        if (M == -5) {
            mo5776M0(B);
            return true;
        }
        if (M == -4 && this.f7154r.mo5952k()) {
            this.f7169y0 = true;
            m8479R0();
        }
        return false;
    }

    /* renamed from: V */
    private static boolean m8485V(String str) {
        return Util.f8398a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: V0 */
    private void m8486V0() throws ExoPlaybackException {
        mo6478W0();
        mo6475H0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r3.f7093g != false) goto L_0x0048;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m8487W(p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo r3) {
        /*
            java.lang.String r0 = r3.f7087a
            int r1 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r2 = 25
            if (r1 > r2) goto L_0x0010
            java.lang.String r2 = "OMX.rk.video_decoder.avc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0048
        L_0x0010:
            r2 = 17
            if (r1 > r2) goto L_0x001c
            java.lang.String r2 = "OMX.allwinner.video.decoder.avc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0048
        L_0x001c:
            r2 = 29
            if (r1 > r2) goto L_0x0030
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0048
        L_0x0030:
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8400c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8401d
            java.lang.String r1 = "AFTS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            boolean r3 = r3.f7093g
            if (r3 == 0) goto L_0x004a
        L_0x0048:
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecRenderer.m8487W(c.a.a.a.g2.s):boolean");
    }

    /* renamed from: X */
    private static boolean m8488X(String str) {
        int i = Util.f8398a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && Util.f8401d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: Y */
    private static boolean m8489Y(String str, Format u0Var) {
        if (Util.f8398a > 18 || u0Var.f8827y != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    private static boolean m8490Z(String str) {
        return Util.f8398a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* renamed from: a1 */
    private void m8491a1() {
        this.f7140h0 = -1;
        this.f7156s.f5744c = null;
    }

    /* renamed from: b1 */
    private void m8492b1() {
        this.f7141i0 = -1;
        this.f7142j0 = null;
    }

    /* renamed from: c0 */
    private void m8493c0() {
        this.f7149o0 = false;
        this.f7160u.mo5947f();
        this.f7158t.mo5947f();
        this.f7147n0 = false;
        this.f7145m0 = false;
    }

    /* renamed from: c1 */
    private void m8494c1(C0896v vVar) {
        DrmSession.m7167a(this.f7105D, vVar);
        this.f7105D = vVar;
    }

    /* renamed from: d0 */
    private boolean m8495d0() {
        if (this.f7159t0) {
            this.f7155r0 = 1;
            if (this.f7129W || this.f7131Y) {
                this.f7157s0 = 3;
                return false;
            }
            this.f7157s0 = 1;
        }
        return true;
    }

    /* renamed from: e0 */
    private void m8496e0() throws ExoPlaybackException {
        if (this.f7159t0) {
            this.f7155r0 = 1;
            this.f7157s0 = 3;
            return;
        }
        m8486V0();
    }

    @TargetApi(23)
    /* renamed from: f0 */
    private boolean m8497f0() throws ExoPlaybackException {
        if (this.f7159t0) {
            this.f7155r0 = 1;
            if (this.f7129W || this.f7131Y) {
                this.f7157s0 = 3;
                return false;
            }
            this.f7157s0 = 2;
        } else {
            m8506m1();
        }
        return true;
    }

    /* renamed from: f1 */
    private void m8498f1(C0896v vVar) {
        DrmSession.m7167a(this.f7109G, vVar);
        this.f7109G = vVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f9  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8499g0(long r20, long r22) throws p067c.p068a.p069a.p070a.ExoPlaybackException {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.m8468A0()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r15.f7132Z
            if (r0 == 0) goto L_0x0028
            boolean r0 = r15.f7161u0
            if (r0 == 0) goto L_0x0028
            c.a.a.a.g2.q r0 = r15.f7119M     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.f7166x     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.mo6415b(r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x0030
        L_0x001c:
            r19.m8479R0()
            boolean r0 = r15.f7171z0
            if (r0 == 0) goto L_0x0027
            r19.mo6478W0()
        L_0x0027:
            return r14
        L_0x0028:
            c.a.a.a.g2.q r0 = r15.f7119M
            android.media.MediaCodec$BufferInfo r1 = r15.f7166x
            int r0 = r0.mo6415b(r1)
        L_0x0030:
            if (r0 >= 0) goto L_0x004a
            r1 = -2
            if (r0 != r1) goto L_0x0039
            r19.m8482T0()
            return r16
        L_0x0039:
            boolean r0 = r15.f7137e0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r15.f7169y0
            if (r0 != 0) goto L_0x0046
            int r0 = r15.f7155r0
            r1 = 2
            if (r0 != r1) goto L_0x0049
        L_0x0046:
            r19.m8479R0()
        L_0x0049:
            return r14
        L_0x004a:
            boolean r1 = r15.f7136d0
            if (r1 == 0) goto L_0x0056
            r15.f7136d0 = r14
            c.a.a.a.g2.q r1 = r15.f7119M
            r1.mo6418e(r0, r14)
            return r16
        L_0x0056:
            android.media.MediaCodec$BufferInfo r1 = r15.f7166x
            int r2 = r1.size
            if (r2 != 0) goto L_0x0066
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0066
            r19.m8479R0()
            return r14
        L_0x0066:
            r15.f7141i0 = r0
            c.a.a.a.g2.q r1 = r15.f7119M
            java.nio.ByteBuffer r0 = r1.mo6427m(r0)
            r15.f7142j0 = r0
            if (r0 == 0) goto L_0x0085
            android.media.MediaCodec$BufferInfo r1 = r15.f7166x
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f7142j0
            android.media.MediaCodec$BufferInfo r1 = r15.f7166x
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0085:
            boolean r0 = r15.f7133a0
            if (r0 == 0) goto L_0x00a6
            android.media.MediaCodec$BufferInfo r0 = r15.f7166x
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00a6
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00a6
            long r1 = r15.f7165w0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            r0.presentationTimeUs = r1
        L_0x00a6:
            android.media.MediaCodec$BufferInfo r0 = r15.f7166x
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.m8471D0(r0)
            r15.f7143k0 = r0
            long r0 = r15.f7167x0
            android.media.MediaCodec$BufferInfo r2 = r15.f7166x
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r15.f7144l0 = r0
            r15.mo6492n1(r2)
        L_0x00c2:
            boolean r0 = r15.f7132Z
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r15.f7161u0
            if (r0 == 0) goto L_0x00fd
            c.a.a.a.g2.q r5 = r15.f7119M     // Catch:{ IllegalStateException -> 0x00f0 }
            java.nio.ByteBuffer r6 = r15.f7142j0     // Catch:{ IllegalStateException -> 0x00f0 }
            int r7 = r15.f7141i0     // Catch:{ IllegalStateException -> 0x00f0 }
            android.media.MediaCodec$BufferInfo r0 = r15.f7166x     // Catch:{ IllegalStateException -> 0x00f0 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00f0 }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r12 = r15.f7143k0     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r13 = r15.f7144l0     // Catch:{ IllegalStateException -> 0x00f0 }
            c.a.a.a.u0 r3 = r15.f7103C     // Catch:{ IllegalStateException -> 0x00f0 }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = 0
            r14 = r17
            boolean r0 = r0.mo5781S0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00ee }
            goto L_0x011c
        L_0x00ee:
            goto L_0x00f2
        L_0x00f0:
            r18 = 0
        L_0x00f2:
            r19.m8479R0()
            boolean r0 = r15.f7171z0
            if (r0 == 0) goto L_0x00fc
            r19.mo6478W0()
        L_0x00fc:
            return r18
        L_0x00fd:
            r18 = 0
            c.a.a.a.g2.q r5 = r15.f7119M
            java.nio.ByteBuffer r6 = r15.f7142j0
            int r7 = r15.f7141i0
            android.media.MediaCodec$BufferInfo r0 = r15.f7166x
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f7143k0
            boolean r13 = r15.f7144l0
            c.a.a.a.u0 r14 = r15.f7103C
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.mo5781S0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x011c:
            if (r0 == 0) goto L_0x0139
            android.media.MediaCodec$BufferInfo r0 = r15.f7166x
            long r0 = r0.presentationTimeUs
            r15.mo6477O0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f7166x
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x012f
            r14 = 1
            goto L_0x0130
        L_0x012f:
            r14 = 0
        L_0x0130:
            r19.m8492b1()
            if (r14 != 0) goto L_0x0136
            return r16
        L_0x0136:
            r19.m8479R0()
        L_0x0139:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecRenderer.m8499g0(long, long):boolean");
    }

    /* renamed from: g1 */
    private boolean m8500g1(long j) {
        return this.f7115J == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f7115J;
    }

    /* renamed from: h0 */
    private boolean m8501h0(MediaCodecInfo sVar, Format u0Var, C0896v vVar, C0896v vVar2) throws ExoPlaybackException {
        if (vVar == vVar2) {
            return false;
        }
        if (vVar2 == null || vVar == null || Util.f8398a < 23) {
            return true;
        }
        UUID uuid = C.f7374e;
        if (!uuid.equals(vVar.mo6045e()) && !uuid.equals(vVar2.mo6045e())) {
            FrameworkMediaCrypto w0 = m8508w0(vVar2);
            if (w0 == null) {
                return true;
            }
            return !sVar.f7093g && m8475J0(w0, u0Var);
        }
        return true;
    }

    /* renamed from: k1 */
    protected static boolean m8502k1(Format u0Var) {
        Class<? extends ExoMediaCrypto> cls = u0Var.f8801G;
        return cls == null || FrameworkMediaCrypto.class.equals(cls);
    }

    /* renamed from: l0 */
    private boolean m8503l0() throws ExoPlaybackException {
        MediaCodecAdapter qVar = this.f7119M;
        if (qVar == null || this.f7155r0 == 2 || this.f7169y0) {
            return false;
        }
        if (this.f7140h0 < 0) {
            int o = qVar.mo6429o();
            this.f7140h0 = o;
            if (o < 0) {
                return false;
            }
            this.f7156s.f5744c = this.f7119M.mo6423i(o);
            this.f7156s.mo5947f();
        }
        if (this.f7155r0 == 1) {
            if (!this.f7137e0) {
                this.f7161u0 = true;
                this.f7119M.mo6425k(this.f7140h0, 0, 0, 0, 4);
                m8491a1();
            }
            this.f7155r0 = 2;
            return false;
        } else if (this.f7135c0) {
            this.f7135c0 = false;
            ByteBuffer byteBuffer = this.f7156s.f5744c;
            byte[] bArr = f7098m;
            byteBuffer.put(bArr);
            this.f7119M.mo6425k(this.f7140h0, 0, bArr.length, 0, 0);
            m8491a1();
            this.f7159t0 = true;
            return true;
        } else {
            if (this.f7153q0 == 1) {
                for (int i = 0; i < this.f7120N.f8816n.size(); i++) {
                    this.f7156s.f5744c.put((byte[]) this.f7120N.f8816n.get(i));
                }
                this.f7153q0 = 2;
            }
            int position = this.f7156s.f5744c.position();
            FormatHolder B = mo6511B();
            int M = mo6515M(B, this.f7156s, false);
            if (mo6521i()) {
                this.f7167x0 = this.f7165w0;
            }
            if (M == -3) {
                return false;
            }
            if (M == -5) {
                if (this.f7153q0 == 2) {
                    this.f7156s.mo5947f();
                    this.f7153q0 = 1;
                }
                mo5776M0(B);
                return true;
            } else if (this.f7156s.mo5952k()) {
                if (this.f7153q0 == 2) {
                    this.f7156s.mo5947f();
                    this.f7153q0 = 1;
                }
                this.f7169y0 = true;
                if (!this.f7159t0) {
                    m8479R0();
                    return false;
                }
                try {
                    if (!this.f7137e0) {
                        this.f7161u0 = true;
                        this.f7119M.mo6425k(this.f7140h0, 0, 0, 0, 4);
                        m8491a1();
                    }
                    return false;
                } catch (CryptoException e) {
                    throw mo6534y(e, this.f7101B);
                }
            } else if (this.f7159t0 || this.f7156s.mo5953l()) {
                boolean q = this.f7156s.mo5967q();
                if (q) {
                    this.f7156s.f5743b.mo5956b(position);
                }
                if (this.f7128V && !q) {
                    NalUnitUtil.m10419b(this.f7156s.f5744c);
                    if (this.f7156s.f5744c.position() == 0) {
                        return true;
                    }
                    this.f7128V = false;
                }
                DecoderInputBuffer fVar = this.f7156s;
                long j = fVar.f5746e;
                C2Mp3TimestampTracker pVar = this.f7138f0;
                if (pVar != null) {
                    j = pVar.mo6461c(this.f7101B, fVar);
                }
                long j2 = j;
                if (this.f7156s.mo5951j()) {
                    this.f7164w.add(Long.valueOf(j2));
                }
                if (this.f7100A0) {
                    this.f7162v.mo7436a(j2, this.f7101B);
                    this.f7100A0 = false;
                }
                if (this.f7138f0 != null) {
                    this.f7165w0 = Math.max(this.f7165w0, this.f7156s.f5746e);
                } else {
                    this.f7165w0 = Math.max(this.f7165w0, j2);
                }
                this.f7156s.mo5966p();
                if (this.f7156s.mo5950i()) {
                    mo6501z0(this.f7156s);
                }
                mo5780Q0(this.f7156s);
                if (q) {
                    try {
                        this.f7119M.mo6419f(this.f7140h0, 0, this.f7156s.f5743b, j2, 0);
                    } catch (CryptoException e2) {
                        throw mo6534y(e2, this.f7101B);
                    }
                } else {
                    this.f7119M.mo6425k(this.f7140h0, 0, this.f7156s.f5744c.limit(), j2, 0);
                }
                m8491a1();
                this.f7159t0 = true;
                this.f7153q0 = 0;
                this.f7110G0.f5734c++;
                return true;
            } else {
                this.f7156s.mo5947f();
                if (this.f7153q0 == 2) {
                    this.f7153q0 = 1;
                }
                return true;
            }
        }
    }

    /* renamed from: l1 */
    private boolean m8504l1(Format u0Var) throws ExoPlaybackException {
        if (Util.f8398a < 23) {
            return true;
        }
        float t0 = mo5792t0(this.f7118L, u0Var, mo6513D());
        float f = this.f7123Q;
        if (f == t0) {
            return true;
        }
        if (t0 == -1.0f) {
            m8496e0();
            return false;
        } else if (f == -1.0f && t0 <= this.f7152q) {
            return true;
        } else {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", t0);
            this.f7119M.mo6426l(bundle);
            this.f7123Q = t0;
            return true;
        }
    }

    /* renamed from: m0 */
    private void m8505m0() {
        try {
            this.f7119M.flush();
        } finally {
            mo6479Y0();
        }
    }

    /* renamed from: m1 */
    private void m8506m1() throws ExoPlaybackException {
        try {
            this.f7111H.setMediaDrmSession(m8508w0(this.f7109G).f5815c);
            m8494c1(this.f7109G);
            this.f7155r0 = 0;
            this.f7157s0 = 0;
        } catch (MediaCryptoException e) {
            throw mo6534y(e, this.f7101B);
        }
    }

    /* renamed from: p0 */
    private List<MediaCodecInfo> m8507p0(boolean z) throws C1025c {
        List<MediaCodecInfo> v0 = mo5796v0(this.f7148o, this.f7101B, z);
        if (v0.isEmpty() && z) {
            v0 = mo5796v0(this.f7148o, this.f7101B, false);
            if (!v0.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Drm session requires secure decoder for ");
                sb.append(this.f7101B.f8814l);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(v0);
                sb.append(".");
                Log.m10386h("MediaCodecRenderer", sb.toString());
            }
        }
        return v0;
    }

    /* renamed from: w0 */
    private FrameworkMediaCrypto m8508w0(C0896v vVar) throws ExoPlaybackException {
        ExoMediaCrypto f = vVar.mo6046f();
        if (f == null || (f instanceof FrameworkMediaCrypto)) {
            return (FrameworkMediaCrypto) f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expecting FrameworkMediaCrypto but found: ");
        sb.append(f);
        throw mo6534y(new IllegalArgumentException(sb.toString()), this.f7101B);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo5768F() {
        this.f7101B = null;
        this.f7112H0 = -9223372036854775807L;
        this.f7114I0 = -9223372036854775807L;
        this.f7116J0 = 0;
        if (this.f7109G == null && this.f7105D == null) {
            mo6493o0();
        } else {
            mo5771I();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo5769G(boolean z, boolean z2) throws ExoPlaybackException {
        this.f7110G0 = new DecoderCounters();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public boolean mo6474G0() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo5770H(long j, boolean z) throws ExoPlaybackException {
        this.f7169y0 = false;
        this.f7171z0 = false;
        this.f7102B0 = false;
        if (this.f7145m0) {
            this.f7160u.mo5947f();
            this.f7158t.mo5947f();
            this.f7147n0 = false;
        } else {
            mo6491n0();
        }
        if (this.f7162v.mo7441l() > 0) {
            this.f7100A0 = true;
        }
        this.f7162v.mo7437c();
        int i = this.f7116J0;
        if (i != 0) {
            this.f7114I0 = this.f7170z[i - 1];
            this.f7112H0 = this.f7168y[i - 1];
            this.f7116J0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public final void mo6475H0() throws ExoPlaybackException {
        if (this.f7119M == null && !this.f7145m0) {
            Format u0Var = this.f7101B;
            if (u0Var != null) {
                if (this.f7109G != null || !mo5789i1(u0Var)) {
                    m8494c1(this.f7109G);
                    String str = this.f7101B.f8814l;
                    C0896v vVar = this.f7105D;
                    if (vVar != null) {
                        if (this.f7111H == null) {
                            FrameworkMediaCrypto w0 = m8508w0(vVar);
                            if (w0 != null) {
                                try {
                                    MediaCrypto mediaCrypto = new MediaCrypto(w0.f5814b, w0.f5815c);
                                    this.f7111H = mediaCrypto;
                                    this.f7113I = !w0.f5816d && mediaCrypto.requiresSecureDecoderComponent(str);
                                } catch (MediaCryptoException e) {
                                    throw mo6534y(e, this.f7101B);
                                }
                            } else if (this.f7105D.mo6047g() == null) {
                                return;
                            }
                        }
                        if (FrameworkMediaCrypto.f5813a) {
                            int state = this.f7105D.getState();
                            if (state == 1) {
                                throw mo6534y(this.f7105D.mo6047g(), this.f7101B);
                            } else if (state != 4) {
                                return;
                            }
                        }
                    }
                    try {
                        m8474I0(this.f7111H, this.f7113I);
                    } catch (C1022a e2) {
                        throw mo6534y(e2, this.f7101B);
                    }
                } else {
                    m8469B0(this.f7101B);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo5771I() {
        try {
            m8493c0();
            mo6478W0();
        } finally {
            m8498f1(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo5772J() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo5773K() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public abstract void mo5774K0(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6476L(Format[] u0VarArr, long j, long j2) throws ExoPlaybackException {
        boolean z = true;
        if (this.f7114I0 == -9223372036854775807L) {
            if (this.f7112H0 != -9223372036854775807L) {
                z = false;
            }
            Assertions.m10154f(z);
            this.f7112H0 = j;
            this.f7114I0 = j2;
            return;
        }
        int i = this.f7116J0;
        if (i == this.f7170z.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(this.f7170z[this.f7116J0 - 1]);
            Log.m10386h("MediaCodecRenderer", sb.toString());
        } else {
            this.f7116J0 = i + 1;
        }
        long[] jArr = this.f7168y;
        int i2 = this.f7116J0;
        jArr[i2 - 1] = j;
        this.f7170z[i2 - 1] = j2;
        this.f7099A[i2 - 1] = this.f7165w0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public abstract void mo5775L0(String str);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (m8497f0() == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        if (m8497f0() == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d5, code lost:
        r7 = 2;
     */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation mo5776M0(p067c.p068a.p069a.p070a.FormatHolder r12) throws p067c.p068a.p069a.p070a.ExoPlaybackException {
        /*
            r11 = this;
            r0 = 1
            r11.f7100A0 = r0
            c.a.a.a.u0 r1 = r12.f8869b
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)
            r5 = r1
            c.a.a.a.u0 r5 = (p067c.p068a.p069a.p070a.Format) r5
            java.lang.String r1 = r5.f8814l
            if (r1 == 0) goto L_0x00f2
            c.a.a.a.e2.v r12 = r12.f8868a
            r11.m8498f1(r12)
            r11.f7101B = r5
            boolean r12 = r11.f7145m0
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.f7149o0 = r0
            return r1
        L_0x001f:
            c.a.a.a.g2.q r12 = r11.f7119M
            if (r12 != 0) goto L_0x002f
            boolean r12 = r11.mo6474G0()
            if (r12 != 0) goto L_0x002b
            r11.f7124R = r1
        L_0x002b:
            r11.mo6475H0()
            return r1
        L_0x002f:
            c.a.a.a.g2.s r1 = r11.f7126T
            c.a.a.a.u0 r4 = r11.f7120N
            c.a.a.a.e2.v r2 = r11.f7105D
            c.a.a.a.e2.v r3 = r11.f7109G
            boolean r2 = r11.m8501h0(r1, r5, r2, r3)
            if (r2 == 0) goto L_0x004c
            r11.m8496e0()
            c.a.a.a.c2.g r12 = new c.a.a.a.c2.g
            java.lang.String r3 = r1.f7087a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x004c:
            c.a.a.a.e2.v r2 = r11.f7109G
            c.a.a.a.e2.v r3 = r11.f7105D
            r6 = 0
            if (r2 == r3) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x0061
            int r3 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r7 = 23
            if (r3 < r7) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r3 = 0
            goto L_0x0062
        L_0x0061:
            r3 = 1
        L_0x0062:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r3)
            c.a.a.a.c2.g r3 = r11.mo5779Q(r1, r4, r5)
            int r7 = r3.f5755d
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00d7
            if (r7 == r0) goto L_0x00bb
            if (r7 == r10) goto L_0x008f
            if (r7 != r8) goto L_0x0089
            boolean r0 = r11.m8504l1(r5)
            if (r0 != 0) goto L_0x007e
            goto L_0x00c1
        L_0x007e:
            r11.f7120N = r5
            if (r2 == 0) goto L_0x00da
            boolean r0 = r11.m8497f0()
            if (r0 != 0) goto L_0x00da
            goto L_0x00d5
        L_0x0089:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x008f:
            boolean r7 = r11.m8504l1(r5)
            if (r7 != 0) goto L_0x0096
            goto L_0x00c1
        L_0x0096:
            r11.f7151p0 = r0
            r11.f7153q0 = r0
            int r7 = r11.f7127U
            if (r7 == r10) goto L_0x00ae
            if (r7 != r0) goto L_0x00ad
            int r7 = r5.f8819q
            int r9 = r4.f8819q
            if (r7 != r9) goto L_0x00ad
            int r7 = r5.f8820r
            int r9 = r4.f8820r
            if (r7 != r9) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            r11.f7135c0 = r0
            r11.f7120N = r5
            if (r2 == 0) goto L_0x00da
            boolean r0 = r11.m8497f0()
            if (r0 != 0) goto L_0x00da
            goto L_0x00d5
        L_0x00bb:
            boolean r0 = r11.m8504l1(r5)
            if (r0 != 0) goto L_0x00c4
        L_0x00c1:
            r7 = 16
            goto L_0x00db
        L_0x00c4:
            r11.f7120N = r5
            if (r2 == 0) goto L_0x00cf
            boolean r0 = r11.m8497f0()
            if (r0 != 0) goto L_0x00da
            goto L_0x00d5
        L_0x00cf:
            boolean r0 = r11.m8495d0()
            if (r0 != 0) goto L_0x00da
        L_0x00d5:
            r7 = 2
            goto L_0x00db
        L_0x00d7:
            r11.m8496e0()
        L_0x00da:
            r7 = 0
        L_0x00db:
            int r0 = r3.f5755d
            if (r0 == 0) goto L_0x00f1
            c.a.a.a.g2.q r0 = r11.f7119M
            if (r0 != r12) goto L_0x00e7
            int r12 = r11.f7157s0
            if (r12 != r8) goto L_0x00f1
        L_0x00e7:
            c.a.a.a.c2.g r12 = new c.a.a.a.c2.g
            java.lang.String r3 = r1.f7087a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00f1:
            return r3
        L_0x00f2:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            c.a.a.a.p0 r12 = r11.mo6534y(r12, r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecRenderer.mo5776M0(c.a.a.a.v0):c.a.a.a.c2.g");
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public abstract void mo5777N0(Format u0Var, MediaFormat mediaFormat) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo6477O0(long j) {
        while (true) {
            int i = this.f7116J0;
            if (i != 0 && j >= this.f7099A[0]) {
                long[] jArr = this.f7168y;
                this.f7112H0 = jArr[0];
                this.f7114I0 = this.f7170z[0];
                int i2 = i - 1;
                this.f7116J0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f7170z;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f7116J0);
                long[] jArr3 = this.f7099A;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f7116J0);
                mo5778P0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo5778P0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract DecoderReuseEvaluation mo5779Q(MediaCodecInfo sVar, Format u0Var, Format u0Var2);

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public abstract void mo5780Q0(DecoderInputBuffer fVar) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public abstract boolean mo5781S0(long j, long j2, MediaCodecAdapter qVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format u0Var) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public void mo6478W0() {
        try {
            MediaCodecAdapter qVar = this.f7119M;
            if (qVar != null) {
                qVar.mo6414a();
                this.f7110G0.f5733b++;
                mo5775L0(this.f7126T.f7087a);
            }
            this.f7119M = null;
            try {
                MediaCrypto mediaCrypto = this.f7111H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f7111H = null;
                m8494c1(null);
                mo6480Z0();
            }
        } catch (Throwable th) {
            this.f7119M = null;
            MediaCrypto mediaCrypto2 = this.f7111H;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.f7111H = null;
            m8494c1(null);
            mo6480Z0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo5782X0() throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public void mo6479Y0() {
        m8491a1();
        m8492b1();
        this.f7139g0 = -9223372036854775807L;
        this.f7161u0 = false;
        this.f7159t0 = false;
        this.f7135c0 = false;
        this.f7136d0 = false;
        this.f7143k0 = false;
        this.f7144l0 = false;
        this.f7164w.clear();
        this.f7165w0 = -9223372036854775807L;
        this.f7167x0 = -9223372036854775807L;
        C2Mp3TimestampTracker pVar = this.f7138f0;
        if (pVar != null) {
            pVar.mo6460b();
        }
        this.f7155r0 = 0;
        this.f7157s0 = 0;
        this.f7153q0 = this.f7151p0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z0 */
    public void mo6480Z0() {
        mo6479Y0();
        this.f7108F0 = null;
        this.f7138f0 = null;
        this.f7124R = null;
        this.f7126T = null;
        this.f7120N = null;
        this.f7121O = null;
        this.f7122P = false;
        this.f7163v0 = false;
        this.f7123Q = -1.0f;
        this.f7127U = 0;
        this.f7128V = false;
        this.f7129W = false;
        this.f7130X = false;
        this.f7131Y = false;
        this.f7132Z = false;
        this.f7133a0 = false;
        this.f7134b0 = false;
        this.f7137e0 = false;
        this.f7151p0 = false;
        this.f7153q0 = 0;
        this.f7113I = false;
    }

    /* renamed from: a */
    public final int mo6481a(Format u0Var) throws ExoPlaybackException {
        try {
            return mo5790j1(this.f7148o, u0Var);
        } catch (C1025c e) {
            throw mo6534y(e, u0Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public abstract void mo5783a0(MediaCodecInfo sVar, MediaCodecAdapter qVar, Format u0Var, MediaCrypto mediaCrypto, float f);

    /* renamed from: b */
    public boolean mo5784b() {
        return this.f7171z0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public MediaCodecDecoderException mo6482b0(Throwable th, MediaCodecInfo sVar) {
        return new MediaCodecDecoderException(th, sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d1 */
    public final void mo6483d1() {
        this.f7102B0 = true;
    }

    /* renamed from: e */
    public boolean mo5786e() {
        return this.f7101B != null && (mo6514E() || m8468A0() || (this.f7139g0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f7139g0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e1 */
    public final void mo6484e1(ExoPlaybackException p0Var) {
        this.f7108F0 = p0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public boolean mo6485h1(MediaCodecInfo sVar) {
        return true;
    }

    /* renamed from: i0 */
    public void mo6486i0(boolean z) {
        this.f7104C0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i1 */
    public boolean mo5789i1(Format u0Var) {
        return false;
    }

    /* renamed from: j0 */
    public void mo6487j0(boolean z) {
        this.f7106D0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public abstract int mo5790j1(MediaCodecSelector uVar, Format u0Var) throws C1025c;

    /* renamed from: k */
    public final int mo6488k() {
        return 8;
    }

    /* renamed from: k0 */
    public void mo6489k0(boolean z) {
        this.f7107E0 = z;
    }

    /* renamed from: l */
    public void mo6490l(long j, long j2) throws ExoPlaybackException {
        if (this.f7102B0) {
            this.f7102B0 = false;
            m8479R0();
        }
        ExoPlaybackException p0Var = this.f7108F0;
        if (p0Var == null) {
            try {
                if (this.f7171z0) {
                    mo5782X0();
                } else if (this.f7101B != null || m8484U0(true)) {
                    mo6475H0();
                    if (this.f7145m0) {
                        TraceUtil.m10216a("bypassRender");
                        while (m8477P(j, j2)) {
                        }
                        TraceUtil.m10218c();
                    } else if (this.f7119M != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        TraceUtil.m10216a("drainAndFeed");
                        while (m8499g0(j, j2) && m8500g1(elapsedRealtime)) {
                        }
                        while (m8503l0() && m8500g1(elapsedRealtime)) {
                        }
                        TraceUtil.m10218c();
                    } else {
                        this.f7110G0.f5735d += mo6516N(j);
                        m8484U0(false);
                    }
                    this.f7110G0.mo5964c();
                }
            } catch (IllegalStateException e) {
                if (m8472E0(e)) {
                    throw mo6534y(mo6482b0(e, mo6495r0()), this.f7101B);
                }
                throw e;
            }
        } else {
            this.f7108F0 = null;
            throw p0Var;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final boolean mo6491n0() throws ExoPlaybackException {
        boolean o0 = mo6493o0();
        if (o0) {
            mo6475H0();
        }
        return o0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public final void mo6492n1(long j) throws ExoPlaybackException {
        boolean z;
        Format u0Var = (Format) this.f7162v.mo7440j(j);
        if (u0Var == null && this.f7122P) {
            u0Var = (Format) this.f7162v.mo7439i();
        }
        if (u0Var != null) {
            this.f7103C = u0Var;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f7122P && this.f7103C != null)) {
            mo5777N0(this.f7103C, this.f7121O);
            this.f7122P = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public boolean mo6493o0() {
        if (this.f7119M == null) {
            return false;
        }
        if (this.f7157s0 == 3 || this.f7129W || ((this.f7130X && !this.f7163v0) || (this.f7131Y && this.f7161u0))) {
            mo6478W0();
            return true;
        }
        m8505m0();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public final MediaCodecAdapter mo6494q0() {
        return this.f7119M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public final MediaCodecInfo mo6495r0() {
        return this.f7126T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public boolean mo6496s0() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public abstract float mo5792t0(float f, Format u0Var, Format[] u0VarArr);

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public final MediaFormat mo6497u0() {
        return this.f7121O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public abstract List<MediaCodecInfo> mo5796v0(MediaCodecSelector uVar, Format u0Var, boolean z) throws C1025c;

    /* renamed from: x */
    public void mo6498x(float f, float f2) throws ExoPlaybackException {
        this.f7117K = f;
        this.f7118L = f2;
        if (this.f7119M != null && this.f7157s0 != 3 && getState() != 0) {
            m8504l1(this.f7120N);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public final long mo6499x0() {
        return this.f7114I0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public float mo6500y0() {
        return this.f7117K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public void mo6501z0(DecoderInputBuffer fVar) throws ExoPlaybackException {
    }
}
