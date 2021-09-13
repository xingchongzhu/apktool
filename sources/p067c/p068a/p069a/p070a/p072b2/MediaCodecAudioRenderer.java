package p067c.p068a.p069a.p070a.p072b2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.C1227p1.C1228a;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.PlaybackParameters;
import p067c.p068a.p069a.p070a.RendererCapabilities;
import p067c.p068a.p069a.p070a.p072b2.AudioRendererEventListener.C0833a;
import p067c.p068a.p069a.p070a.p072b2.AudioSink.C0834a;
import p067c.p068a.p069a.p070a.p072b2.AudioSink.C0835b;
import p067c.p068a.p069a.p070a.p072b2.AudioSink.C0836c;
import p067c.p068a.p069a.p070a.p072b2.AudioSink.C0837d;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1020a;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecRenderer;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecSelector;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.C1025c;
import p067c.p068a.p069a.p070a.p087g2.MediaFormatUtil;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.MediaClock;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.b0 */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {

    /* renamed from: K0 */
    private final Context f5416K0;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public final C0833a f5417L0;

    /* renamed from: M0 */
    private final AudioSink f5418M0;

    /* renamed from: N0 */
    private int f5419N0;

    /* renamed from: O0 */
    private boolean f5420O0;

    /* renamed from: P0 */
    private Format f5421P0;

    /* renamed from: Q0 */
    private long f5422Q0;

    /* renamed from: R0 */
    private boolean f5423R0;

    /* renamed from: S0 */
    private boolean f5424S0;

    /* renamed from: T0 */
    private boolean f5425T0;

    /* renamed from: U0 */
    private boolean f5426U0;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public C1228a f5427V0;

    /* renamed from: c.a.a.a.b2.b0$b */
    /* compiled from: MediaCodecAudioRenderer */
    private final class C0813b implements C0836c {
        private C0813b() {
        }

        /* renamed from: a */
        public void mo5799a(boolean z) {
            MediaCodecAudioRenderer.this.f5417L0.mo5866z(z);
        }

        /* renamed from: b */
        public void mo5800b(long j) {
            MediaCodecAudioRenderer.this.f5417L0.mo5865y(j);
        }

        /* renamed from: c */
        public void mo5801c(long j) {
            if (MediaCodecAudioRenderer.this.f5427V0 != null) {
                MediaCodecAudioRenderer.this.f5427V0.mo7631a(j);
            }
        }

        /* renamed from: d */
        public void mo5802d(Exception exc) {
            MediaCodecAudioRenderer.this.f5417L0.mo5850a(exc);
        }

        /* renamed from: e */
        public void mo5803e() {
            MediaCodecAudioRenderer.this.mo5797v1();
        }

        /* renamed from: f */
        public void mo5804f(int i, long j, long j2) {
            MediaCodecAudioRenderer.this.f5417L0.mo5849A(i, j, j2);
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector uVar, boolean z, Handler handler, AudioRendererEventListener rVar, AudioSink sVar) {
        this(context, C1020a.f7084a, uVar, z, handler, rVar, sVar);
    }

    /* renamed from: q1 */
    private static boolean m6497q1(String str) {
        if (Util.f8398a < 24 && "OMX.SEC.aac.dec".equals(str)) {
            if ("samsung".equals(Util.f8400c)) {
                String str2 = Util.f8399b;
                if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r1 */
    private static boolean m6498r1() {
        if (Util.f8398a == 23) {
            String str = Util.f8401d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s1 */
    private int m6499s1(MediaCodecInfo sVar, Format u0Var) {
        if ("OMX.google.raw.decoder".equals(sVar.f7087a)) {
            int i = Util.f8398a;
            if (i < 24 && (i != 23 || !Util.m10302m0(this.f5416K0))) {
                return -1;
            }
        }
        return u0Var.f8815m;
    }

    /* renamed from: w1 */
    private void m6500w1() {
        long m = this.f5418M0.mo5879m(mo5784b());
        if (m != Long.MIN_VALUE) {
            if (!this.f5424S0) {
                m = Math.max(this.f5422Q0, m);
            }
            this.f5422Q0 = m;
            this.f5424S0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo5768F() {
        this.f5425T0 = true;
        try {
            this.f5418M0.flush();
            try {
                super.mo5768F();
            } finally {
                this.f5417L0.mo5853d(this.f7110G0);
            }
        } catch (Throwable th) {
            super.mo5768F();
            throw th;
        } finally {
            this.f5417L0.mo5853d(this.f7110G0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo5769G(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo5769G(z, z2);
        this.f5417L0.mo5854e(this.f7110G0);
        if (mo6510A().f8792b) {
            this.f5418M0.mo5873g();
        } else {
            this.f5418M0.mo5880n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo5770H(long j, boolean z) throws ExoPlaybackException {
        super.mo5770H(j, z);
        if (this.f5426U0) {
            this.f5418M0.mo5886s();
        } else {
            this.f5418M0.flush();
        }
        this.f5422Q0 = j;
        this.f5423R0 = true;
        this.f5424S0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo5771I() {
        try {
            super.mo5771I();
        } finally {
            if (this.f5425T0) {
                this.f5425T0 = false;
                this.f5418M0.reset();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo5772J() {
        super.mo5772J();
        this.f5418M0.mo5877k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo5773K() {
        m6500w1();
        this.f5418M0.mo5870d();
        super.mo5773K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo5774K0(String str, long j, long j2) {
        this.f5417L0.mo5851b(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public void mo5775L0(String str) {
        this.f5417L0.mo5852c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public DecoderReuseEvaluation mo5776M0(FormatHolder v0Var) throws ExoPlaybackException {
        DecoderReuseEvaluation M0 = super.mo5776M0(v0Var);
        this.f5417L0.mo5855f(v0Var.f8869b, M0);
        return M0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo5777N0(Format u0Var, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i;
        Format u0Var2 = this.f5421P0;
        int[] iArr = null;
        if (u0Var2 != null) {
            u0Var = u0Var2;
        } else if (mo6494q0() != null) {
            String str = "audio/raw";
            if (str.equals(u0Var.f8814l)) {
                i = u0Var.f8797A;
            } else {
                if (Util.f8398a >= 24) {
                    String str2 = "pcm-encoding";
                    if (mediaFormat.containsKey(str2)) {
                        i = mediaFormat.getInteger(str2);
                    }
                }
                String str3 = "v-bits-per-sample";
                i = mediaFormat.containsKey(str3) ? Util.m10272V(mediaFormat.getInteger(str3)) : str.equals(u0Var.f8814l) ? u0Var.f8797A : 2;
            }
            Format E = new C1245b().mo7705e0(str).mo7699Y(i).mo7687M(u0Var.f8798B).mo7688N(u0Var.f8799C).mo7682H(mediaFormat.getInteger("channel-count")).mo7706f0(mediaFormat.getInteger("sample-rate")).mo7679E();
            if (this.f5420O0 && E.f8827y == 6) {
                int i2 = u0Var.f8827y;
                if (i2 < 6) {
                    iArr = new int[i2];
                    for (int i3 = 0; i3 < u0Var.f8827y; i3++) {
                        iArr[i3] = i3;
                    }
                }
            }
            u0Var = E;
        }
        try {
            this.f5418M0.mo5884r(u0Var, 0, iArr);
        } catch (C0834a e) {
            throw mo6534y(e, e.f5564a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo5778P0() {
        super.mo5778P0();
        this.f5418M0.mo5889v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public DecoderReuseEvaluation mo5779Q(MediaCodecInfo sVar, Format u0Var, Format u0Var2) {
        int i;
        DecoderReuseEvaluation e = sVar.mo6464e(u0Var, u0Var2);
        int i2 = e.f5756e;
        if (m6499s1(sVar, u0Var2) > this.f5419N0) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = sVar.f7087a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = e.f5755d;
        }
        DecoderReuseEvaluation gVar = new DecoderReuseEvaluation(str, u0Var, u0Var2, i, i3);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public void mo5780Q0(DecoderInputBuffer fVar) {
        if (this.f5423R0 && !fVar.mo5951j()) {
            if (Math.abs(fVar.f5746e - this.f5422Q0) > 500000) {
                this.f5422Q0 = fVar.f5746e;
            }
            this.f5423R0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public boolean mo5781S0(long j, long j2, MediaCodecAdapter qVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format u0Var) throws ExoPlaybackException {
        Assertions.m10153e(byteBuffer);
        if (this.f5421P0 != null && (i2 & 2) != 0) {
            ((MediaCodecAdapter) Assertions.m10153e(qVar)).mo6418e(i, false);
            return true;
        } else if (z) {
            if (qVar != null) {
                qVar.mo6418e(i, false);
            }
            this.f7110G0.f5737f += i3;
            this.f5418M0.mo5889v();
            return true;
        } else {
            try {
                if (!this.f5418M0.mo5878l(byteBuffer, j3, i3)) {
                    return false;
                }
                if (qVar != null) {
                    qVar.mo6418e(i, false);
                }
                this.f7110G0.f5736e += i3;
                return true;
            } catch (C0835b e) {
                throw mo6535z(e, e.f5567c, e.f5566b);
            } catch (C0837d e2) {
                throw mo6535z(e2, u0Var, e2.f5569b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo5782X0() throws ExoPlaybackException {
        try {
            this.f5418M0.mo5874h();
        } catch (C0837d e) {
            throw mo6535z(e, e.f5570c, e.f5569b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo5783a0(MediaCodecInfo sVar, MediaCodecAdapter qVar, Format u0Var, MediaCrypto mediaCrypto, float f) {
        this.f5419N0 = mo5793t1(sVar, u0Var, mo6513D());
        this.f5420O0 = m6497q1(sVar.f7087a);
        boolean z = false;
        qVar.mo6416c(mo5795u1(u0Var, sVar.f7089c, this.f5419N0, f), null, mediaCrypto, 0);
        String str = "audio/raw";
        if (str.equals(sVar.f7088b) && !str.equals(u0Var.f8814l)) {
            z = true;
        }
        if (!z) {
            u0Var = null;
        }
        this.f5421P0 = u0Var;
    }

    /* renamed from: b */
    public boolean mo5784b() {
        return super.mo5784b() && this.f5418M0.mo5868b();
    }

    /* renamed from: c */
    public PlaybackParameters mo5785c() {
        return this.f5418M0.mo5869c();
    }

    /* renamed from: e */
    public boolean mo5786e() {
        return this.f5418M0.mo5875i() || super.mo5786e();
    }

    /* renamed from: f */
    public void mo5787f(PlaybackParameters i1Var) {
        this.f5418M0.mo5871f(i1Var);
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i1 */
    public boolean mo5789i1(Format u0Var) {
        return this.f5418M0.mo5867a(u0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public int mo5790j1(MediaCodecSelector uVar, Format u0Var) throws C1025c {
        if (!MimeTypes.m10409o(u0Var.f8814l)) {
            return RendererCapabilities.m10784a(0);
        }
        int i = Util.f8398a >= 21 ? 32 : 0;
        boolean z = u0Var.f8801G != null;
        boolean k1 = MediaCodecRenderer.m8502k1(u0Var);
        int i2 = 8;
        int i3 = 4;
        if (k1 && this.f5418M0.mo5867a(u0Var) && (!z || MediaCodecUtil.m8593q() != null)) {
            return RendererCapabilities.m10785b(4, 8, i);
        }
        if ("audio/raw".equals(u0Var.f8814l) && !this.f5418M0.mo5867a(u0Var)) {
            return RendererCapabilities.m10784a(1);
        }
        if (!this.f5418M0.mo5867a(Util.m10273W(2, u0Var.f8827y, u0Var.f8828z))) {
            return RendererCapabilities.m10784a(1);
        }
        List v0 = mo5796v0(uVar, u0Var, false);
        if (v0.isEmpty()) {
            return RendererCapabilities.m10784a(1);
        }
        if (!k1) {
            return RendererCapabilities.m10784a(2);
        }
        MediaCodecInfo sVar = (MediaCodecInfo) v0.get(0);
        boolean m = sVar.mo6469m(u0Var);
        if (m && sVar.mo6471o(u0Var)) {
            i2 = 16;
        }
        if (!m) {
            i3 = 3;
        }
        return RendererCapabilities.m10785b(i3, i2, i);
    }

    /* renamed from: m */
    public void mo5791m(int i, Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f5418M0.mo5890w(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f5418M0.mo5882p((AudioAttributes) obj);
        } else if (i != 5) {
            switch (i) {
                case 101:
                    this.f5418M0.mo5887t(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.f5418M0.mo5876j(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f5427V0 = (C1228a) obj;
                    return;
                default:
                    super.mo5791m(i, obj);
                    return;
            }
        } else {
            this.f5418M0.mo5888u((AuxEffectInfo) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public float mo5792t0(float f, Format u0Var, Format[] u0VarArr) {
        int i = -1;
        for (Format u0Var2 : u0VarArr) {
            int i2 = u0Var2.f8828z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public int mo5793t1(MediaCodecInfo sVar, Format u0Var, Format[] u0VarArr) {
        int s1 = m6499s1(sVar, u0Var);
        if (u0VarArr.length == 1) {
            return s1;
        }
        for (Format u0Var2 : u0VarArr) {
            if (sVar.mo6464e(u0Var, u0Var2).f5755d != 0) {
                s1 = Math.max(s1, m6499s1(sVar, u0Var2));
            }
        }
        return s1;
    }

    /* renamed from: u */
    public MediaClock mo5794u() {
        return this;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    /* renamed from: u1 */
    public MediaFormat mo5795u1(Format u0Var, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", u0Var.f8827y);
        mediaFormat.setInteger("sample-rate", u0Var.f8828z);
        MediaFormatUtil.m8624e(mediaFormat, u0Var.f8816n);
        MediaFormatUtil.m8623d(mediaFormat, "max-input-size", i);
        int i2 = Util.f8398a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m6498r1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28) {
            if ("audio/ac4".equals(u0Var.f8814l)) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (i2 >= 24 && this.f5418M0.mo5883q(Util.m10273W(4, u0Var.f8827y, u0Var.f8828z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public List<MediaCodecInfo> mo5796v0(MediaCodecSelector uVar, Format u0Var, boolean z) throws C1025c {
        String str = u0Var.f8814l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f5418M0.mo5867a(u0Var)) {
            MediaCodecInfo q = MediaCodecUtil.m8593q();
            if (q != null) {
                return Collections.singletonList(q);
            }
        }
        List p = MediaCodecUtil.m8592p(uVar.mo6413a(str, z, false), u0Var);
        if ("audio/eac3-joc".equals(str)) {
            List arrayList = new ArrayList(p);
            arrayList.addAll(uVar.mo6413a("audio/eac3", z, false));
            p = arrayList;
        }
        return Collections.unmodifiableList(p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo5797v1() {
        this.f5424S0 = true;
    }

    /* renamed from: w */
    public long mo5798w() {
        if (getState() == 2) {
            m6500w1();
        }
        return this.f5422Q0;
    }

    public MediaCodecAudioRenderer(Context context, C1020a aVar, MediaCodecSelector uVar, boolean z, Handler handler, AudioRendererEventListener rVar, AudioSink sVar) {
        super(1, aVar, uVar, z, 44100.0f);
        this.f5416K0 = context.getApplicationContext();
        this.f5418M0 = sVar;
        this.f5417L0 = new C0833a(handler, rVar);
        sVar.mo5881o(new C0813b());
    }
}
