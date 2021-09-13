package p067c.p068a.p069a.p070a.p112n2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.p259uc.crashsdk.export.LogType;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.RendererCapabilities;
import p067c.p068a.p069a.p070a.p073c2.DecoderCounters;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1020a;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecAdapter.C1021b;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecDecoderException;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecRenderer;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecSelector;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.C1025c;
import p067c.p068a.p069a.p070a.p087g2.MediaFormatUtil;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.TraceUtil;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p069a.p070a.p112n2.VideoRendererEventListener.C1224a;

/* renamed from: c.a.a.a.n2.q */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {

    /* renamed from: K0 */
    private static final int[] f8567K0 = {1920, 1600, 1440, LogType.UNEXP_ANR, 960, 854, 640, 540, 480};

    /* renamed from: L0 */
    private static boolean f8568L0;

    /* renamed from: M0 */
    private static boolean f8569M0;

    /* renamed from: N0 */
    private final Context f8570N0;

    /* renamed from: O0 */
    private final VideoFrameReleaseHelper f8571O0;

    /* renamed from: P0 */
    private final C1224a f8572P0;

    /* renamed from: Q0 */
    private final long f8573Q0;

    /* renamed from: R0 */
    private final int f8574R0;

    /* renamed from: S0 */
    private final boolean f8575S0;

    /* renamed from: T0 */
    private C1219a f8576T0;

    /* renamed from: U0 */
    private boolean f8577U0;

    /* renamed from: V0 */
    private boolean f8578V0;

    /* renamed from: W0 */
    private Surface f8579W0;

    /* renamed from: X0 */
    private Surface f8580X0;

    /* renamed from: Y0 */
    private boolean f8581Y0;

    /* renamed from: Z0 */
    private int f8582Z0;

    /* renamed from: a1 */
    private boolean f8583a1;

    /* renamed from: b1 */
    private boolean f8584b1;

    /* renamed from: c1 */
    private boolean f8585c1;

    /* renamed from: d1 */
    private long f8586d1;

    /* renamed from: e1 */
    private long f8587e1;

    /* renamed from: f1 */
    private long f8588f1;

    /* renamed from: g1 */
    private int f8589g1;

    /* renamed from: h1 */
    private int f8590h1;

    /* renamed from: i1 */
    private int f8591i1;

    /* renamed from: j1 */
    private long f8592j1;

    /* renamed from: k1 */
    private long f8593k1;

    /* renamed from: l1 */
    private long f8594l1;

    /* renamed from: m1 */
    private int f8595m1;

    /* renamed from: n1 */
    private int f8596n1;

    /* renamed from: o1 */
    private int f8597o1;

    /* renamed from: p1 */
    private int f8598p1;

    /* renamed from: q1 */
    private float f8599q1;

    /* renamed from: r1 */
    private int f8600r1;

    /* renamed from: s1 */
    private int f8601s1;

    /* renamed from: t1 */
    private int f8602t1;

    /* renamed from: u1 */
    private float f8603u1;

    /* renamed from: v1 */
    private boolean f8604v1;

    /* renamed from: w1 */
    private int f8605w1;

    /* renamed from: x1 */
    C1220b f8606x1;

    /* renamed from: y1 */
    private VideoFrameMetadataListener f8607y1;

    /* renamed from: c.a.a.a.n2.q$a */
    /* compiled from: MediaCodecVideoRenderer */
    protected static final class C1219a {

        /* renamed from: a */
        public final int f8608a;

        /* renamed from: b */
        public final int f8609b;

        /* renamed from: c */
        public final int f8610c;

        public C1219a(int i, int i2, int i3) {
            this.f8608a = i;
            this.f8609b = i2;
            this.f8610c = i3;
        }
    }

    /* renamed from: c.a.a.a.n2.q$b */
    /* compiled from: MediaCodecVideoRenderer */
    private final class C1220b implements C1021b, Callback {

        /* renamed from: a */
        private final Handler f8611a;

        public C1220b(MediaCodecAdapter qVar) {
            Handler w = Util.m10321w(this);
            this.f8611a = w;
            qVar.mo6417d(this, w);
        }

        /* renamed from: b */
        private void m10594b(long j) {
            MediaCodecVideoRenderer qVar = MediaCodecVideoRenderer.this;
            if (this == qVar.f8606x1) {
                if (j == Long.MAX_VALUE) {
                    qVar.m10537O1();
                } else {
                    try {
                        qVar.mo7561N1(j);
                    } catch (ExoPlaybackException e) {
                        MediaCodecVideoRenderer.this.mo6484e1(e);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo6462a(MediaCodecAdapter qVar, long j, long j2) {
            if (Util.f8398a < 30) {
                this.f8611a.sendMessageAtFrontOfQueue(Message.obtain(this.f8611a, 0, (int) (j >> 32), (int) j));
                return;
            }
            m10594b(j);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m10594b(Util.m10254I0(message.arg1, message.arg2));
            return true;
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector uVar, long j, boolean z, Handler handler, VideoRendererEventListener zVar, int i) {
        this(context, C1020a.f7084a, uVar, j, z, handler, zVar, i);
    }

    /* renamed from: A1 */
    private static List<MediaCodecInfo> m10527A1(MediaCodecSelector uVar, Format u0Var, boolean z, boolean z2) throws C1025c {
        String str = u0Var.f8814l;
        if (str == null) {
            return Collections.emptyList();
        }
        List p = MediaCodecUtil.m8592p(uVar.mo6413a(str, z, z2), u0Var);
        if ("video/dolby-vision".equals(str)) {
            Pair l = MediaCodecUtil.m8588l(u0Var);
            if (l != null) {
                int intValue = ((Integer) l.first).intValue();
                if (intValue == 16 || intValue == 256) {
                    p.addAll(uVar.mo6413a("video/hevc", z, z2));
                } else if (intValue == 512) {
                    p.addAll(uVar.mo6413a("video/avc", z, z2));
                }
            }
        }
        return Collections.unmodifiableList(p);
    }

    /* renamed from: B1 */
    protected static int m10528B1(MediaCodecInfo sVar, Format u0Var) {
        if (u0Var.f8815m == -1) {
            return m10549x1(sVar, u0Var.f8814l, u0Var.f8819q, u0Var.f8820r);
        }
        int i = 0;
        for (int i2 = 0; i2 < u0Var.f8816n.size(); i2++) {
            i += ((byte[]) u0Var.f8816n.get(i2)).length;
        }
        return u0Var.f8815m + i;
    }

    /* renamed from: D1 */
    private static boolean m10529D1(long j) {
        return j < -30000;
    }

    /* renamed from: E1 */
    private static boolean m10530E1(long j) {
        return j < -500000;
    }

    /* renamed from: G1 */
    private void m10531G1() {
        if (this.f8589g1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f8572P0.mo7606d(this.f8589g1, elapsedRealtime - this.f8588f1);
            this.f8589g1 = 0;
            this.f8588f1 = elapsedRealtime;
        }
    }

    /* renamed from: I1 */
    private void m10532I1() {
        int i = this.f8595m1;
        if (i != 0) {
            this.f8572P0.mo7619z(this.f8594l1, i);
            this.f8594l1 = 0;
            this.f8595m1 = 0;
        }
    }

    /* renamed from: J1 */
    private void m10533J1() {
        int i = this.f8596n1;
        if (i != -1 || this.f8597o1 != -1) {
            if (this.f8600r1 != i || this.f8601s1 != this.f8597o1 || this.f8602t1 != this.f8598p1 || this.f8603u1 != this.f8599q1) {
                this.f8572P0.mo7602A(i, this.f8597o1, this.f8598p1, this.f8599q1);
                this.f8600r1 = this.f8596n1;
                this.f8601s1 = this.f8597o1;
                this.f8602t1 = this.f8598p1;
                this.f8603u1 = this.f8599q1;
            }
        }
    }

    /* renamed from: K1 */
    private void m10534K1() {
        if (this.f8581Y0) {
            this.f8572P0.mo7618y(this.f8579W0);
        }
    }

    /* renamed from: L1 */
    private void m10535L1() {
        int i = this.f8600r1;
        if (i != -1 || this.f8601s1 != -1) {
            this.f8572P0.mo7602A(i, this.f8601s1, this.f8602t1, this.f8603u1);
        }
    }

    /* renamed from: M1 */
    private void m10536M1(long j, long j2, Format u0Var) {
        VideoFrameMetadataListener vVar = this.f8607y1;
        if (vVar != null) {
            vVar.mo7579c(j, j2, u0Var, mo6497u0());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public void m10537O1() {
        mo6483d1();
    }

    /* renamed from: R1 */
    private static void m10538R1(MediaCodecAdapter qVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        qVar.mo6426l(bundle);
    }

    /* renamed from: S1 */
    private void m10539S1() {
        this.f8587e1 = this.f8573Q0 > 0 ? SystemClock.elapsedRealtime() + this.f8573Q0 : -9223372036854775807L;
    }

    /* renamed from: U1 */
    private void m10540U1(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            Surface surface2 = this.f8580X0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                MediaCodecInfo r0 = mo6495r0();
                if (r0 != null && m10541Y1(r0)) {
                    surface = DummySurface.m10507n(this.f8570N0, r0.f7093g);
                    this.f8580X0 = surface;
                }
            }
        }
        if (this.f8579W0 != surface) {
            this.f8579W0 = surface;
            this.f8571O0.mo7589o(surface);
            this.f8581Y0 = false;
            int state = getState();
            MediaCodecAdapter q0 = mo6494q0();
            if (q0 != null) {
                if (Util.f8398a < 23 || surface == null || this.f8577U0) {
                    mo6478W0();
                    mo6475H0();
                } else {
                    mo7564T1(q0, surface);
                }
            }
            if (surface == null || surface == this.f8580X0) {
                m10545r1();
                m10544q1();
                return;
            }
            m10535L1();
            m10544q1();
            if (state == 2) {
                m10539S1();
            }
        } else if (surface != null && surface != this.f8580X0) {
            m10535L1();
            m10534K1();
        }
    }

    /* renamed from: Y1 */
    private boolean m10541Y1(MediaCodecInfo sVar) {
        return Util.f8398a >= 23 && !this.f8604v1 && !mo7571s1(sVar.f7087a) && (!sVar.f7093g || DummySurface.m10506m(this.f8570N0));
    }

    /* renamed from: q1 */
    private void m10544q1() {
        this.f8583a1 = false;
        if (Util.f8398a >= 23 && this.f8604v1) {
            MediaCodecAdapter q0 = mo6494q0();
            if (q0 != null) {
                this.f8606x1 = new C1220b(q0);
            }
        }
    }

    /* renamed from: r1 */
    private void m10545r1() {
        this.f8600r1 = -1;
        this.f8601s1 = -1;
        this.f8603u1 = -1.0f;
        this.f8602t1 = -1;
    }

    /* renamed from: t1 */
    private static void m10546t1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: u1 */
    private static boolean m10547u1() {
        return "NVIDIA".equals(Util.f8400c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07cf, code lost:
        if (r0.equals("NX573J") == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0831, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0829;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x084d, code lost:
        return true;
     */
    /* renamed from: w1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m10548w1() {
        /*
            int r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 28
            r6 = 2
            r7 = -1
            r8 = 0
            r9 = 1
            if (r0 > r5) goto L_0x006d
            java.lang.String r10 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            r10.hashCode()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1339091551: goto L_0x005e;
                case -1220081023: goto L_0x0053;
                case -1220066608: goto L_0x0048;
                case -1012436106: goto L_0x003d;
                case -64886864: goto L_0x0032;
                case 3415681: goto L_0x0027;
                case 825323514: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            r10 = -1
            goto L_0x0068
        L_0x001c:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0025
            goto L_0x001a
        L_0x0025:
            r10 = 6
            goto L_0x0068
        L_0x0027:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0030
            goto L_0x001a
        L_0x0030:
            r10 = 5
            goto L_0x0068
        L_0x0032:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x003b
            goto L_0x001a
        L_0x003b:
            r10 = 4
            goto L_0x0068
        L_0x003d:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0046
            goto L_0x001a
        L_0x0046:
            r10 = 3
            goto L_0x0068
        L_0x0048:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0051
            goto L_0x001a
        L_0x0051:
            r10 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x005c
            goto L_0x001a
        L_0x005c:
            r10 = 1
            goto L_0x0068
        L_0x005e:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0067
            goto L_0x001a
        L_0x0067:
            r10 = 0
        L_0x0068:
            switch(r10) {
                case 0: goto L_0x006c;
                case 1: goto L_0x006c;
                case 2: goto L_0x006c;
                case 3: goto L_0x006c;
                case 4: goto L_0x006c;
                case 5: goto L_0x006c;
                case 6: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x006d
        L_0x006c:
            return r9
        L_0x006d:
            r10 = 27
            if (r0 > r10) goto L_0x007c
            java.lang.String r11 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            java.lang.String r12 = "HWEML"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x007c
            return r9
        L_0x007c:
            r11 = 26
            if (r0 > r11) goto L_0x084e
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            r0.hashCode()
            int r12 = r0.hashCode()
            switch(r12) {
                case -2144781245: goto L_0x080f;
                case -2144781185: goto L_0x0803;
                case -2144781160: goto L_0x07f7;
                case -2097309513: goto L_0x07eb;
                case -2022874474: goto L_0x07df;
                case -1978993182: goto L_0x07d3;
                case -1978990237: goto L_0x07c9;
                case -1936688988: goto L_0x07bd;
                case -1936688066: goto L_0x07b0;
                case -1936688065: goto L_0x07a2;
                case -1931988508: goto L_0x0794;
                case -1885099851: goto L_0x0786;
                case -1696512866: goto L_0x0778;
                case -1680025915: goto L_0x076a;
                case -1615810839: goto L_0x075c;
                case -1600724499: goto L_0x074e;
                case -1554255044: goto L_0x0740;
                case -1481772737: goto L_0x0732;
                case -1481772730: goto L_0x0724;
                case -1481772729: goto L_0x0716;
                case -1320080169: goto L_0x0708;
                case -1217592143: goto L_0x06fa;
                case -1180384755: goto L_0x06ec;
                case -1139198265: goto L_0x06de;
                case -1052835013: goto L_0x06d0;
                case -993250464: goto L_0x06c2;
                case -993250458: goto L_0x06b4;
                case -965403638: goto L_0x06a6;
                case -958336948: goto L_0x0698;
                case -879245230: goto L_0x068a;
                case -842500323: goto L_0x067c;
                case -821392978: goto L_0x066e;
                case -797483286: goto L_0x0660;
                case -794946968: goto L_0x0652;
                case -788334647: goto L_0x0644;
                case -782144577: goto L_0x0636;
                case -575125681: goto L_0x0628;
                case -521118391: goto L_0x061a;
                case -430914369: goto L_0x060c;
                case -290434366: goto L_0x05fe;
                case -282781963: goto L_0x05f0;
                case -277133239: goto L_0x05e2;
                case -173639913: goto L_0x05d4;
                case -56598463: goto L_0x05c6;
                case 2126: goto L_0x05b8;
                case 2564: goto L_0x05aa;
                case 2715: goto L_0x059c;
                case 2719: goto L_0x058e;
                case 3091: goto L_0x0580;
                case 3483: goto L_0x0572;
                case 73405: goto L_0x0564;
                case 75537: goto L_0x0556;
                case 75739: goto L_0x0548;
                case 76779: goto L_0x053a;
                case 78669: goto L_0x052c;
                case 79305: goto L_0x051e;
                case 80618: goto L_0x0510;
                case 88274: goto L_0x0502;
                case 98846: goto L_0x04f4;
                case 98848: goto L_0x04e6;
                case 99329: goto L_0x04d8;
                case 101481: goto L_0x04ca;
                case 1513190: goto L_0x04bc;
                case 1514184: goto L_0x04ae;
                case 1514185: goto L_0x04a0;
                case 2133089: goto L_0x0492;
                case 2133091: goto L_0x0484;
                case 2133120: goto L_0x0476;
                case 2133151: goto L_0x0468;
                case 2133182: goto L_0x045a;
                case 2133184: goto L_0x044c;
                case 2436959: goto L_0x043e;
                case 2463773: goto L_0x0430;
                case 2464648: goto L_0x0422;
                case 2689555: goto L_0x0414;
                case 3154429: goto L_0x0406;
                case 3284551: goto L_0x03f8;
                case 3351335: goto L_0x03ea;
                case 3386211: goto L_0x03dc;
                case 41325051: goto L_0x03ce;
                case 51349633: goto L_0x03c0;
                case 51350594: goto L_0x03b2;
                case 55178625: goto L_0x03a4;
                case 61542055: goto L_0x0396;
                case 65355429: goto L_0x0388;
                case 66214468: goto L_0x037a;
                case 66214470: goto L_0x036c;
                case 66214473: goto L_0x035e;
                case 66215429: goto L_0x0350;
                case 66215431: goto L_0x0342;
                case 66215433: goto L_0x0334;
                case 66216390: goto L_0x0326;
                case 76402249: goto L_0x0318;
                case 76404105: goto L_0x030a;
                case 76404911: goto L_0x02fc;
                case 80963634: goto L_0x02ee;
                case 82882791: goto L_0x02e0;
                case 98715550: goto L_0x02d2;
                case 101370885: goto L_0x02c4;
                case 102844228: goto L_0x02b6;
                case 165221241: goto L_0x02a8;
                case 182191441: goto L_0x029a;
                case 245388979: goto L_0x028c;
                case 287431619: goto L_0x027e;
                case 307593612: goto L_0x0270;
                case 308517133: goto L_0x0262;
                case 316215098: goto L_0x0254;
                case 316215116: goto L_0x0246;
                case 316246811: goto L_0x0238;
                case 316246818: goto L_0x022a;
                case 407160593: goto L_0x021c;
                case 507412548: goto L_0x020e;
                case 793982701: goto L_0x0200;
                case 794038622: goto L_0x01f2;
                case 794040393: goto L_0x01e4;
                case 835649806: goto L_0x01d6;
                case 917340916: goto L_0x01c8;
                case 958008161: goto L_0x01ba;
                case 1060579533: goto L_0x01ac;
                case 1150207623: goto L_0x019e;
                case 1176899427: goto L_0x0190;
                case 1280332038: goto L_0x0182;
                case 1306947716: goto L_0x0174;
                case 1349174697: goto L_0x0166;
                case 1522194893: goto L_0x0158;
                case 1691543273: goto L_0x014a;
                case 1691544261: goto L_0x013c;
                case 1709443163: goto L_0x012e;
                case 1865889110: goto L_0x0120;
                case 1906253259: goto L_0x0112;
                case 1977196784: goto L_0x0104;
                case 2006372676: goto L_0x00f7;
                case 2019281702: goto L_0x00ea;
                case 2029784656: goto L_0x00dd;
                case 2030379515: goto L_0x00d0;
                case 2033393791: goto L_0x00c3;
                case 2047190025: goto L_0x00b6;
                case 2047252157: goto L_0x00a9;
                case 2048319463: goto L_0x009c;
                case 2048855701: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r1 = -1
            goto L_0x081a
        L_0x008f:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0098
            goto L_0x008c
        L_0x0098:
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x081a
        L_0x009c:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x008c
        L_0x00a5:
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x081a
        L_0x00a9:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b2
            goto L_0x008c
        L_0x00b2:
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x081a
        L_0x00b6:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bf
            goto L_0x008c
        L_0x00bf:
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x081a
        L_0x00c3:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cc
            goto L_0x008c
        L_0x00cc:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x081a
        L_0x00d0:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d9
            goto L_0x008c
        L_0x00d9:
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x081a
        L_0x00dd:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e6
            goto L_0x008c
        L_0x00e6:
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x081a
        L_0x00ea:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f3
            goto L_0x008c
        L_0x00f3:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x081a
        L_0x00f7:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0100
            goto L_0x008c
        L_0x0100:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x081a
        L_0x0104:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010e
            goto L_0x008c
        L_0x010e:
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x081a
        L_0x0112:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011c
            goto L_0x008c
        L_0x011c:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x081a
        L_0x0120:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012a
            goto L_0x008c
        L_0x012a:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x081a
        L_0x012e:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0138
            goto L_0x008c
        L_0x0138:
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x081a
        L_0x013c:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0146
            goto L_0x008c
        L_0x0146:
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x081a
        L_0x014a:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0154
            goto L_0x008c
        L_0x0154:
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x081a
        L_0x0158:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0162
            goto L_0x008c
        L_0x0162:
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x081a
        L_0x0166:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0170
            goto L_0x008c
        L_0x0170:
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x081a
        L_0x0174:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017e
            goto L_0x008c
        L_0x017e:
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x081a
        L_0x0182:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018c
            goto L_0x008c
        L_0x018c:
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x081a
        L_0x0190:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019a
            goto L_0x008c
        L_0x019a:
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x081a
        L_0x019e:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a8
            goto L_0x008c
        L_0x01a8:
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x081a
        L_0x01ac:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b6
            goto L_0x008c
        L_0x01b6:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x081a
        L_0x01ba:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c4
            goto L_0x008c
        L_0x01c4:
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x081a
        L_0x01c8:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d2
            goto L_0x008c
        L_0x01d2:
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x081a
        L_0x01d6:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01e0
            goto L_0x008c
        L_0x01e0:
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x081a
        L_0x01e4:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ee
            goto L_0x008c
        L_0x01ee:
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x081a
        L_0x01f2:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01fc
            goto L_0x008c
        L_0x01fc:
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x081a
        L_0x0200:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x020a
            goto L_0x008c
        L_0x020a:
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x081a
        L_0x020e:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0218
            goto L_0x008c
        L_0x0218:
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x081a
        L_0x021c:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0226
            goto L_0x008c
        L_0x0226:
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x081a
        L_0x022a:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0234
            goto L_0x008c
        L_0x0234:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x081a
        L_0x0238:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0242
            goto L_0x008c
        L_0x0242:
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x081a
        L_0x0246:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0250
            goto L_0x008c
        L_0x0250:
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x081a
        L_0x0254:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025e
            goto L_0x008c
        L_0x025e:
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x081a
        L_0x0262:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x026c
            goto L_0x008c
        L_0x026c:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x081a
        L_0x0270:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x027a
            goto L_0x008c
        L_0x027a:
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x081a
        L_0x027e:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0288
            goto L_0x008c
        L_0x0288:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x081a
        L_0x028c:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0296
            goto L_0x008c
        L_0x0296:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x081a
        L_0x029a:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a4
            goto L_0x008c
        L_0x02a4:
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x081a
        L_0x02a8:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b2
            goto L_0x008c
        L_0x02b2:
            r1 = 100
            goto L_0x081a
        L_0x02b6:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02c0
            goto L_0x008c
        L_0x02c0:
            r1 = 99
            goto L_0x081a
        L_0x02c4:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ce
            goto L_0x008c
        L_0x02ce:
            r1 = 98
            goto L_0x081a
        L_0x02d2:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02dc
            goto L_0x008c
        L_0x02dc:
            r1 = 97
            goto L_0x081a
        L_0x02e0:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ea
            goto L_0x008c
        L_0x02ea:
            r1 = 96
            goto L_0x081a
        L_0x02ee:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f8
            goto L_0x008c
        L_0x02f8:
            r1 = 95
            goto L_0x081a
        L_0x02fc:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0306
            goto L_0x008c
        L_0x0306:
            r1 = 94
            goto L_0x081a
        L_0x030a:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0314
            goto L_0x008c
        L_0x0314:
            r1 = 93
            goto L_0x081a
        L_0x0318:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0322
            goto L_0x008c
        L_0x0322:
            r1 = 92
            goto L_0x081a
        L_0x0326:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0330
            goto L_0x008c
        L_0x0330:
            r1 = 91
            goto L_0x081a
        L_0x0334:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x033e
            goto L_0x008c
        L_0x033e:
            r1 = 90
            goto L_0x081a
        L_0x0342:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034c
            goto L_0x008c
        L_0x034c:
            r1 = 89
            goto L_0x081a
        L_0x0350:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x035a
            goto L_0x008c
        L_0x035a:
            r1 = 88
            goto L_0x081a
        L_0x035e:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0368
            goto L_0x008c
        L_0x0368:
            r1 = 87
            goto L_0x081a
        L_0x036c:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0376
            goto L_0x008c
        L_0x0376:
            r1 = 86
            goto L_0x081a
        L_0x037a:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0384
            goto L_0x008c
        L_0x0384:
            r1 = 85
            goto L_0x081a
        L_0x0388:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0392
            goto L_0x008c
        L_0x0392:
            r1 = 84
            goto L_0x081a
        L_0x0396:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a0
            goto L_0x008c
        L_0x03a0:
            r1 = 83
            goto L_0x081a
        L_0x03a4:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ae
            goto L_0x008c
        L_0x03ae:
            r1 = 82
            goto L_0x081a
        L_0x03b2:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03bc
            goto L_0x008c
        L_0x03bc:
            r1 = 81
            goto L_0x081a
        L_0x03c0:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ca
            goto L_0x008c
        L_0x03ca:
            r1 = 80
            goto L_0x081a
        L_0x03ce:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d8
            goto L_0x008c
        L_0x03d8:
            r1 = 79
            goto L_0x081a
        L_0x03dc:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03e6
            goto L_0x008c
        L_0x03e6:
            r1 = 78
            goto L_0x081a
        L_0x03ea:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03f4
            goto L_0x008c
        L_0x03f4:
            r1 = 77
            goto L_0x081a
        L_0x03f8:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0402
            goto L_0x008c
        L_0x0402:
            r1 = 76
            goto L_0x081a
        L_0x0406:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0410
            goto L_0x008c
        L_0x0410:
            r1 = 75
            goto L_0x081a
        L_0x0414:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x041e
            goto L_0x008c
        L_0x041e:
            r1 = 74
            goto L_0x081a
        L_0x0422:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x042c
            goto L_0x008c
        L_0x042c:
            r1 = 73
            goto L_0x081a
        L_0x0430:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x043a
            goto L_0x008c
        L_0x043a:
            r1 = 72
            goto L_0x081a
        L_0x043e:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0448
            goto L_0x008c
        L_0x0448:
            r1 = 71
            goto L_0x081a
        L_0x044c:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0456
            goto L_0x008c
        L_0x0456:
            r1 = 70
            goto L_0x081a
        L_0x045a:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0464
            goto L_0x008c
        L_0x0464:
            r1 = 69
            goto L_0x081a
        L_0x0468:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0472
            goto L_0x008c
        L_0x0472:
            r1 = 68
            goto L_0x081a
        L_0x0476:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0480
            goto L_0x008c
        L_0x0480:
            r1 = 67
            goto L_0x081a
        L_0x0484:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048e
            goto L_0x008c
        L_0x048e:
            r1 = 66
            goto L_0x081a
        L_0x0492:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x049c
            goto L_0x008c
        L_0x049c:
            r1 = 65
            goto L_0x081a
        L_0x04a0:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04aa
            goto L_0x008c
        L_0x04aa:
            r1 = 64
            goto L_0x081a
        L_0x04ae:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b8
            goto L_0x008c
        L_0x04b8:
            r1 = 63
            goto L_0x081a
        L_0x04bc:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04c6
            goto L_0x008c
        L_0x04c6:
            r1 = 62
            goto L_0x081a
        L_0x04ca:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d4
            goto L_0x008c
        L_0x04d4:
            r1 = 61
            goto L_0x081a
        L_0x04d8:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e2
            goto L_0x008c
        L_0x04e2:
            r1 = 60
            goto L_0x081a
        L_0x04e6:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f0
            goto L_0x008c
        L_0x04f0:
            r1 = 59
            goto L_0x081a
        L_0x04f4:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04fe
            goto L_0x008c
        L_0x04fe:
            r1 = 58
            goto L_0x081a
        L_0x0502:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x050c
            goto L_0x008c
        L_0x050c:
            r1 = 57
            goto L_0x081a
        L_0x0510:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x051a
            goto L_0x008c
        L_0x051a:
            r1 = 56
            goto L_0x081a
        L_0x051e:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0528
            goto L_0x008c
        L_0x0528:
            r1 = 55
            goto L_0x081a
        L_0x052c:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0536
            goto L_0x008c
        L_0x0536:
            r1 = 54
            goto L_0x081a
        L_0x053a:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0544
            goto L_0x008c
        L_0x0544:
            r1 = 53
            goto L_0x081a
        L_0x0548:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0552
            goto L_0x008c
        L_0x0552:
            r1 = 52
            goto L_0x081a
        L_0x0556:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0560
            goto L_0x008c
        L_0x0560:
            r1 = 51
            goto L_0x081a
        L_0x0564:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x056e
            goto L_0x008c
        L_0x056e:
            r1 = 50
            goto L_0x081a
        L_0x0572:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057c
            goto L_0x008c
        L_0x057c:
            r1 = 49
            goto L_0x081a
        L_0x0580:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058a
            goto L_0x008c
        L_0x058a:
            r1 = 48
            goto L_0x081a
        L_0x058e:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0598
            goto L_0x008c
        L_0x0598:
            r1 = 47
            goto L_0x081a
        L_0x059c:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05a6
            goto L_0x008c
        L_0x05a6:
            r1 = 46
            goto L_0x081a
        L_0x05aa:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05b4
            goto L_0x008c
        L_0x05b4:
            r1 = 45
            goto L_0x081a
        L_0x05b8:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c2
            goto L_0x008c
        L_0x05c2:
            r1 = 44
            goto L_0x081a
        L_0x05c6:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05d0
            goto L_0x008c
        L_0x05d0:
            r1 = 43
            goto L_0x081a
        L_0x05d4:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05de
            goto L_0x008c
        L_0x05de:
            r1 = 42
            goto L_0x081a
        L_0x05e2:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05ec
            goto L_0x008c
        L_0x05ec:
            r1 = 41
            goto L_0x081a
        L_0x05f0:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05fa
            goto L_0x008c
        L_0x05fa:
            r1 = 40
            goto L_0x081a
        L_0x05fe:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0608
            goto L_0x008c
        L_0x0608:
            r1 = 39
            goto L_0x081a
        L_0x060c:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0616
            goto L_0x008c
        L_0x0616:
            r1 = 38
            goto L_0x081a
        L_0x061a:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0624
            goto L_0x008c
        L_0x0624:
            r1 = 37
            goto L_0x081a
        L_0x0628:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0632
            goto L_0x008c
        L_0x0632:
            r1 = 36
            goto L_0x081a
        L_0x0636:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0640
            goto L_0x008c
        L_0x0640:
            r1 = 35
            goto L_0x081a
        L_0x0644:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x064e
            goto L_0x008c
        L_0x064e:
            r1 = 34
            goto L_0x081a
        L_0x0652:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x065c
            goto L_0x008c
        L_0x065c:
            r1 = 33
            goto L_0x081a
        L_0x0660:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x066a
            goto L_0x008c
        L_0x066a:
            r1 = 32
            goto L_0x081a
        L_0x066e:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0678
            goto L_0x008c
        L_0x0678:
            r1 = 31
            goto L_0x081a
        L_0x067c:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0686
            goto L_0x008c
        L_0x0686:
            r1 = 30
            goto L_0x081a
        L_0x068a:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0694
            goto L_0x008c
        L_0x0694:
            r1 = 29
            goto L_0x081a
        L_0x0698:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06a2
            goto L_0x008c
        L_0x06a2:
            r1 = 28
            goto L_0x081a
        L_0x06a6:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06b0
            goto L_0x008c
        L_0x06b0:
            r1 = 27
            goto L_0x081a
        L_0x06b4:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06be
            goto L_0x008c
        L_0x06be:
            r1 = 26
            goto L_0x081a
        L_0x06c2:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06cc
            goto L_0x008c
        L_0x06cc:
            r1 = 25
            goto L_0x081a
        L_0x06d0:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06da
            goto L_0x008c
        L_0x06da:
            r1 = 24
            goto L_0x081a
        L_0x06de:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06e8
            goto L_0x008c
        L_0x06e8:
            r1 = 23
            goto L_0x081a
        L_0x06ec:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06f6
            goto L_0x008c
        L_0x06f6:
            r1 = 22
            goto L_0x081a
        L_0x06fa:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0704
            goto L_0x008c
        L_0x0704:
            r1 = 21
            goto L_0x081a
        L_0x0708:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0712
            goto L_0x008c
        L_0x0712:
            r1 = 20
            goto L_0x081a
        L_0x0716:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0720
            goto L_0x008c
        L_0x0720:
            r1 = 19
            goto L_0x081a
        L_0x0724:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x072e
            goto L_0x008c
        L_0x072e:
            r1 = 18
            goto L_0x081a
        L_0x0732:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x073c
            goto L_0x008c
        L_0x073c:
            r1 = 17
            goto L_0x081a
        L_0x0740:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x074a
            goto L_0x008c
        L_0x074a:
            r1 = 16
            goto L_0x081a
        L_0x074e:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0758
            goto L_0x008c
        L_0x0758:
            r1 = 15
            goto L_0x081a
        L_0x075c:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0766
            goto L_0x008c
        L_0x0766:
            r1 = 14
            goto L_0x081a
        L_0x076a:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0774
            goto L_0x008c
        L_0x0774:
            r1 = 13
            goto L_0x081a
        L_0x0778:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0782
            goto L_0x008c
        L_0x0782:
            r1 = 12
            goto L_0x081a
        L_0x0786:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0790
            goto L_0x008c
        L_0x0790:
            r1 = 11
            goto L_0x081a
        L_0x0794:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x079e
            goto L_0x008c
        L_0x079e:
            r1 = 10
            goto L_0x081a
        L_0x07a2:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ac
            goto L_0x008c
        L_0x07ac:
            r1 = 9
            goto L_0x081a
        L_0x07b0:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ba
            goto L_0x008c
        L_0x07ba:
            r1 = 8
            goto L_0x081a
        L_0x07bd:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07c7
            goto L_0x008c
        L_0x07c7:
            r1 = 7
            goto L_0x081a
        L_0x07c9:
            java.lang.String r2 = "NX573J"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x081a
            goto L_0x008c
        L_0x07d3:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07dd
            goto L_0x008c
        L_0x07dd:
            r1 = 5
            goto L_0x081a
        L_0x07df:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07e9
            goto L_0x008c
        L_0x07e9:
            r1 = 4
            goto L_0x081a
        L_0x07eb:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07f5
            goto L_0x008c
        L_0x07f5:
            r1 = 3
            goto L_0x081a
        L_0x07f7:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0801
            goto L_0x008c
        L_0x0801:
            r1 = 2
            goto L_0x081a
        L_0x0803:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x080d
            goto L_0x008c
        L_0x080d:
            r1 = 1
            goto L_0x081a
        L_0x080f:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0819
            goto L_0x008c
        L_0x0819:
            r1 = 0
        L_0x081a:
            switch(r1) {
                case 0: goto L_0x084d;
                case 1: goto L_0x084d;
                case 2: goto L_0x084d;
                case 3: goto L_0x084d;
                case 4: goto L_0x084d;
                case 5: goto L_0x084d;
                case 6: goto L_0x084d;
                case 7: goto L_0x084d;
                case 8: goto L_0x084d;
                case 9: goto L_0x084d;
                case 10: goto L_0x084d;
                case 11: goto L_0x084d;
                case 12: goto L_0x084d;
                case 13: goto L_0x084d;
                case 14: goto L_0x084d;
                case 15: goto L_0x084d;
                case 16: goto L_0x084d;
                case 17: goto L_0x084d;
                case 18: goto L_0x084d;
                case 19: goto L_0x084d;
                case 20: goto L_0x084d;
                case 21: goto L_0x084d;
                case 22: goto L_0x084d;
                case 23: goto L_0x084d;
                case 24: goto L_0x084d;
                case 25: goto L_0x084d;
                case 26: goto L_0x084d;
                case 27: goto L_0x084d;
                case 28: goto L_0x084d;
                case 29: goto L_0x084d;
                case 30: goto L_0x084d;
                case 31: goto L_0x084d;
                case 32: goto L_0x084d;
                case 33: goto L_0x084d;
                case 34: goto L_0x084d;
                case 35: goto L_0x084d;
                case 36: goto L_0x084d;
                case 37: goto L_0x084d;
                case 38: goto L_0x084d;
                case 39: goto L_0x084d;
                case 40: goto L_0x084d;
                case 41: goto L_0x084d;
                case 42: goto L_0x084d;
                case 43: goto L_0x084d;
                case 44: goto L_0x084d;
                case 45: goto L_0x084d;
                case 46: goto L_0x084d;
                case 47: goto L_0x084d;
                case 48: goto L_0x084d;
                case 49: goto L_0x084d;
                case 50: goto L_0x084d;
                case 51: goto L_0x084d;
                case 52: goto L_0x084d;
                case 53: goto L_0x084d;
                case 54: goto L_0x084d;
                case 55: goto L_0x084d;
                case 56: goto L_0x084d;
                case 57: goto L_0x084d;
                case 58: goto L_0x084d;
                case 59: goto L_0x084d;
                case 60: goto L_0x084d;
                case 61: goto L_0x084d;
                case 62: goto L_0x084d;
                case 63: goto L_0x084d;
                case 64: goto L_0x084d;
                case 65: goto L_0x084d;
                case 66: goto L_0x084d;
                case 67: goto L_0x084d;
                case 68: goto L_0x084d;
                case 69: goto L_0x084d;
                case 70: goto L_0x084d;
                case 71: goto L_0x084d;
                case 72: goto L_0x084d;
                case 73: goto L_0x084d;
                case 74: goto L_0x084d;
                case 75: goto L_0x084d;
                case 76: goto L_0x084d;
                case 77: goto L_0x084d;
                case 78: goto L_0x084d;
                case 79: goto L_0x084d;
                case 80: goto L_0x084d;
                case 81: goto L_0x084d;
                case 82: goto L_0x084d;
                case 83: goto L_0x084d;
                case 84: goto L_0x084d;
                case 85: goto L_0x084d;
                case 86: goto L_0x084d;
                case 87: goto L_0x084d;
                case 88: goto L_0x084d;
                case 89: goto L_0x084d;
                case 90: goto L_0x084d;
                case 91: goto L_0x084d;
                case 92: goto L_0x084d;
                case 93: goto L_0x084d;
                case 94: goto L_0x084d;
                case 95: goto L_0x084d;
                case 96: goto L_0x084d;
                case 97: goto L_0x084d;
                case 98: goto L_0x084d;
                case 99: goto L_0x084d;
                case 100: goto L_0x084d;
                case 101: goto L_0x084d;
                case 102: goto L_0x084d;
                case 103: goto L_0x084d;
                case 104: goto L_0x084d;
                case 105: goto L_0x084d;
                case 106: goto L_0x084d;
                case 107: goto L_0x084d;
                case 108: goto L_0x084d;
                case 109: goto L_0x084d;
                case 110: goto L_0x084d;
                case 111: goto L_0x084d;
                case 112: goto L_0x084d;
                case 113: goto L_0x084d;
                case 114: goto L_0x084d;
                case 115: goto L_0x084d;
                case 116: goto L_0x084d;
                case 117: goto L_0x084d;
                case 118: goto L_0x084d;
                case 119: goto L_0x084d;
                case 120: goto L_0x084d;
                case 121: goto L_0x084d;
                case 122: goto L_0x084d;
                case 123: goto L_0x084d;
                case 124: goto L_0x084d;
                case 125: goto L_0x084d;
                case 126: goto L_0x084d;
                case 127: goto L_0x084d;
                case 128: goto L_0x084d;
                case 129: goto L_0x084d;
                case 130: goto L_0x084d;
                case 131: goto L_0x084d;
                case 132: goto L_0x084d;
                case 133: goto L_0x084d;
                case 134: goto L_0x084d;
                case 135: goto L_0x084d;
                case 136: goto L_0x084d;
                case 137: goto L_0x084d;
                case 138: goto L_0x084d;
                case 139: goto L_0x084d;
                default: goto L_0x081d;
            }
        L_0x081d:
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8401d
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x083f;
                case 2006354: goto L_0x0834;
                case 2006367: goto L_0x082b;
                default: goto L_0x0829;
            }
        L_0x0829:
            r6 = -1
            goto L_0x0849
        L_0x082b:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0849
            goto L_0x0829
        L_0x0834:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x083d
            goto L_0x0829
        L_0x083d:
            r6 = 1
            goto L_0x0849
        L_0x083f:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0848
            goto L_0x0829
        L_0x0848:
            r6 = 0
        L_0x0849:
            switch(r6) {
                case 0: goto L_0x084d;
                case 1: goto L_0x084d;
                case 2: goto L_0x084d;
                default: goto L_0x084c;
            }
        L_0x084c:
            goto L_0x084e
        L_0x084d:
            return r9
        L_0x084e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p112n2.MediaCodecVideoRenderer.m10548w1():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        return (r7 * 3) / (r2 * 2);
     */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m10549x1(p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto L_0x00ad
            if (r8 != r0) goto L_0x0007
            goto L_0x00ad
        L_0x0007:
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1851077871: goto L_0x0058;
                case -1664118616: goto L_0x004d;
                case -1662541442: goto L_0x0042;
                case 1187890754: goto L_0x0037;
                case 1331836730: goto L_0x002c;
                case 1599127256: goto L_0x0021;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = -1
            goto L_0x0062
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r6 = 6
            goto L_0x0062
        L_0x0021:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x002a
            goto L_0x0014
        L_0x002a:
            r6 = 5
            goto L_0x0062
        L_0x002c:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r6 = 4
            goto L_0x0062
        L_0x0037:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0040
            goto L_0x0014
        L_0x0040:
            r6 = 3
            goto L_0x0062
        L_0x0042:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004b
            goto L_0x0014
        L_0x004b:
            r6 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            r6 = 1
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = "video/dolby-vision"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0061
            goto L_0x0014
        L_0x0061:
            r6 = 0
        L_0x0062:
            switch(r6) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0069;
                case 2: goto L_0x0066;
                case 3: goto L_0x0069;
                case 4: goto L_0x006d;
                case 5: goto L_0x0069;
                case 6: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            return r0
        L_0x0066:
            int r7 = r7 * r8
            goto L_0x00a7
        L_0x0069:
            int r7 = r7 * r8
        L_0x006b:
            r2 = 2
            goto L_0x00a7
        L_0x006d:
            java.lang.String r6 = p067c.p068a.p069a.p070a.p111m2.Util.f8401d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = p067c.p068a.p069a.p070a.p111m2.Util.f8400c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "AFTS"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0096
            boolean r5 = r5.f7093g
            if (r5 == 0) goto L_0x0096
            goto L_0x00ad
        L_0x0096:
            r5 = 16
            int r6 = p067c.p068a.p069a.p070a.p111m2.Util.m10297k(r7, r5)
            int r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10297k(r8, r5)
            int r6 = r6 * r7
            int r6 = r6 * 16
            int r7 = r6 * 16
            goto L_0x006b
        L_0x00a7:
            int r7 = r7 * 3
            int r2 = r2 * 2
            int r7 = r7 / r2
            return r7
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p112n2.MediaCodecVideoRenderer.m10549x1(c.a.a.a.g2.s, java.lang.String, int, int):int");
    }

    /* renamed from: y1 */
    private static Point m10550y1(MediaCodecInfo sVar, Format u0Var) {
        int[] iArr;
        int i = u0Var.f8820r;
        int i2 = u0Var.f8819q;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = ((float) i) / ((float) i3);
        for (int i4 : f8567K0) {
            int i5 = (int) (((float) i4) * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (Util.f8398a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point b = sVar.mo6463b(i6, i4);
                if (sVar.mo6472t(b.x, b.y, (double) u0Var.f8821s)) {
                    return b;
                }
            } else {
                try {
                    int k = Util.m10297k(i4, 16) * 16;
                    int k2 = Util.m10297k(i5, 16) * 16;
                    if (k * k2 <= MediaCodecUtil.m8572I()) {
                        int i7 = z ? k2 : k;
                        if (!z) {
                            k = k2;
                        }
                        return new Point(i7, k);
                    }
                } catch (C1025c unused) {
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* renamed from: C1 */
    public MediaFormat mo7558C1(Format u0Var, String str, C1219a aVar, float f, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", u0Var.f8819q);
        mediaFormat.setInteger("height", u0Var.f8820r);
        MediaFormatUtil.m8624e(mediaFormat, u0Var.f8816n);
        MediaFormatUtil.m8622c(mediaFormat, "frame-rate", u0Var.f8821s);
        MediaFormatUtil.m8623d(mediaFormat, "rotation-degrees", u0Var.f8822t);
        MediaFormatUtil.m8621b(mediaFormat, u0Var.f8826x);
        if ("video/dolby-vision".equals(u0Var.f8814l)) {
            Pair l = MediaCodecUtil.m8588l(u0Var);
            if (l != null) {
                MediaFormatUtil.m8623d(mediaFormat, "profile", ((Integer) l.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", aVar.f8608a);
        mediaFormat.setInteger("max-height", aVar.f8609b);
        MediaFormatUtil.m8623d(mediaFormat, "max-input-size", aVar.f8610c);
        if (Util.f8398a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m10546t1(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo5768F() {
        m10545r1();
        m10544q1();
        this.f8581Y0 = false;
        this.f8571O0.mo7581g();
        this.f8606x1 = null;
        try {
            super.mo5768F();
        } finally {
            this.f8572P0.mo7605c(this.f7110G0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F1 */
    public boolean mo7559F1(long j, boolean z) throws ExoPlaybackException {
        int N = mo6516N(j);
        if (N == 0) {
            return false;
        }
        DecoderCounters dVar = this.f7110G0;
        dVar.f5740i++;
        int i = this.f8591i1 + N;
        if (z) {
            dVar.f5737f += i;
        } else {
            mo7569a2(i);
        }
        mo6491n0();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo5769G(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo5769G(z, z2);
        boolean z3 = mo6510A().f8792b;
        Assertions.m10154f(!z3 || this.f8605w1 != 0);
        if (this.f8604v1 != z3) {
            this.f8604v1 = z3;
            mo6478W0();
        }
        this.f8572P0.mo7607e(this.f7110G0);
        this.f8571O0.mo7582h();
        this.f8584b1 = z2;
        this.f8585c1 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo5770H(long j, boolean z) throws ExoPlaybackException {
        super.mo5770H(j, z);
        m10544q1();
        this.f8571O0.mo7586l();
        this.f8592j1 = -9223372036854775807L;
        this.f8586d1 = -9223372036854775807L;
        this.f8590h1 = 0;
        if (z) {
            m10539S1();
        } else {
            this.f8587e1 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H1 */
    public void mo7560H1() {
        this.f8585c1 = true;
        if (!this.f8583a1) {
            this.f8583a1 = true;
            this.f8572P0.mo7618y(this.f8579W0);
            this.f8581Y0 = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo5771I() {
        try {
            super.mo5771I();
            Surface surface = this.f8580X0;
            if (surface != null) {
                if (this.f8579W0 == surface) {
                    this.f8579W0 = null;
                }
                surface.release();
                this.f8580X0 = null;
            }
        } catch (Throwable th) {
            if (this.f8580X0 != null) {
                Surface surface2 = this.f8579W0;
                Surface surface3 = this.f8580X0;
                if (surface2 == surface3) {
                    this.f8579W0 = null;
                }
                surface3.release();
                this.f8580X0 = null;
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo5772J() {
        super.mo5772J();
        this.f8589g1 = 0;
        this.f8588f1 = SystemClock.elapsedRealtime();
        this.f8593k1 = SystemClock.elapsedRealtime() * 1000;
        this.f8594l1 = 0;
        this.f8595m1 = 0;
        this.f8571O0.mo7587m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo5773K() {
        this.f8587e1 = -9223372036854775807L;
        m10531G1();
        m10532I1();
        this.f8571O0.mo7588n();
        super.mo5773K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo5774K0(String str, long j, long j2) {
        this.f8572P0.mo7603a(str, j, j2);
        this.f8577U0 = mo7571s1(str);
        this.f8578V0 = ((MediaCodecInfo) Assertions.m10153e(mo6495r0())).mo6470n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public void mo5775L0(String str) {
        this.f8572P0.mo7604b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public DecoderReuseEvaluation mo5776M0(FormatHolder v0Var) throws ExoPlaybackException {
        DecoderReuseEvaluation M0 = super.mo5776M0(v0Var);
        this.f8572P0.mo7608f(v0Var.f8869b, M0);
        return M0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo5777N0(Format u0Var, MediaFormat mediaFormat) {
        int i;
        int i2;
        MediaCodecAdapter q0 = mo6494q0();
        if (q0 != null) {
            q0.mo6421g(this.f8582Z0);
        }
        if (this.f8604v1) {
            this.f8596n1 = u0Var.f8819q;
            this.f8597o1 = u0Var.f8820r;
        } else {
            Assertions.m10153e(mediaFormat);
            String str = "crop-right";
            String str2 = "crop-top";
            String str3 = "crop-bottom";
            String str4 = "crop-left";
            boolean z = mediaFormat.containsKey(str) && mediaFormat.containsKey(str4) && mediaFormat.containsKey(str3) && mediaFormat.containsKey(str2);
            if (z) {
                i = (mediaFormat.getInteger(str) - mediaFormat.getInteger(str4)) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.f8596n1 = i;
            if (z) {
                i2 = (mediaFormat.getInteger(str3) - mediaFormat.getInteger(str2)) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.f8597o1 = i2;
        }
        float f = u0Var.f8823u;
        this.f8599q1 = f;
        if (Util.f8398a >= 21) {
            int i3 = u0Var.f8822t;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f8596n1;
                this.f8596n1 = this.f8597o1;
                this.f8597o1 = i4;
                this.f8599q1 = 1.0f / f;
            }
        } else {
            this.f8598p1 = u0Var.f8822t;
        }
        this.f8571O0.mo7583i(u0Var.f8821s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N1 */
    public void mo7561N1(long j) throws ExoPlaybackException {
        mo6492n1(j);
        m10533J1();
        this.f7110G0.f5736e++;
        mo7560H1();
        mo6477O0(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo6477O0(long j) {
        super.mo6477O0(j);
        if (!this.f8604v1) {
            this.f8591i1--;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo5778P0() {
        super.mo5778P0();
        m10544q1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public void mo7562P1(MediaCodecAdapter qVar, int i, long j) {
        m10533J1();
        TraceUtil.m10216a("releaseOutputBuffer");
        qVar.mo6418e(i, true);
        TraceUtil.m10218c();
        this.f8593k1 = SystemClock.elapsedRealtime() * 1000;
        this.f7110G0.f5736e++;
        this.f8590h1 = 0;
        mo7560H1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public DecoderReuseEvaluation mo5779Q(MediaCodecInfo sVar, Format u0Var, Format u0Var2) {
        int i;
        DecoderReuseEvaluation e = sVar.mo6464e(u0Var, u0Var2);
        int i2 = e.f5756e;
        int i3 = u0Var2.f8819q;
        C1219a aVar = this.f8576T0;
        if (i3 > aVar.f8608a || u0Var2.f8820r > aVar.f8609b) {
            i2 |= LogType.UNEXP;
        }
        if (m10528B1(sVar, u0Var2) > this.f8576T0.f8610c) {
            i2 |= 64;
        }
        int i4 = i2;
        String str = sVar.f7087a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = e.f5755d;
        }
        DecoderReuseEvaluation gVar = new DecoderReuseEvaluation(str, u0Var, u0Var2, i, i4);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public void mo5780Q0(DecoderInputBuffer fVar) throws ExoPlaybackException {
        boolean z = this.f8604v1;
        if (!z) {
            this.f8591i1++;
        }
        if (Util.f8398a < 23 && z) {
            mo7561N1(fVar.f5746e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public void mo7563Q1(MediaCodecAdapter qVar, int i, long j, long j2) {
        m10533J1();
        TraceUtil.m10216a("releaseOutputBuffer");
        qVar.mo6428n(i, j2);
        TraceUtil.m10218c();
        this.f8593k1 = SystemClock.elapsedRealtime() * 1000;
        this.f7110G0.f5736e++;
        this.f8590h1 = 0;
        mo7560H1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public boolean mo5781S0(long j, long j2, MediaCodecAdapter qVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format u0Var) throws ExoPlaybackException {
        long j4;
        boolean z3;
        long j5 = j;
        MediaCodecAdapter qVar2 = qVar;
        int i4 = i;
        long j6 = j3;
        Assertions.m10153e(qVar);
        if (this.f8586d1 == -9223372036854775807L) {
            this.f8586d1 = j5;
        }
        if (j6 != this.f8592j1) {
            this.f8571O0.mo7584j(j6);
            this.f8592j1 = j6;
        }
        long x0 = mo6499x0();
        long j7 = j6 - x0;
        if (!z || z2) {
            double y0 = (double) mo6500y0();
            boolean z4 = getState() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            double d = (double) (j6 - j5);
            Double.isNaN(d);
            Double.isNaN(y0);
            long j8 = (long) (d / y0);
            if (z4) {
                j8 -= elapsedRealtime - j2;
            }
            if (this.f8579W0 != this.f8580X0) {
                long j9 = elapsedRealtime - this.f8593k1;
                if (this.f8585c1 ? this.f8583a1 : !z4 && !this.f8584b1) {
                    j4 = j9;
                    z3 = false;
                } else {
                    j4 = j9;
                    z3 = true;
                }
                if (this.f8587e1 == -9223372036854775807L && j5 >= x0 && (z3 || (z4 && mo7567X1(j8, j4)))) {
                    long nanoTime = System.nanoTime();
                    m10536M1(j7, nanoTime, u0Var);
                    if (Util.f8398a >= 21) {
                        mo7563Q1(qVar, i, j7, nanoTime);
                    } else {
                        mo7562P1(qVar2, i4, j7);
                    }
                    mo7570b2(j8);
                } else {
                    if (z4 && j5 != this.f8586d1) {
                        long nanoTime2 = System.nanoTime();
                        long b = this.f8571O0.mo7580b((j8 * 1000) + nanoTime2);
                        long j10 = (b - nanoTime2) / 1000;
                        long j11 = j10;
                        boolean z5 = this.f8587e1 != -9223372036854775807L;
                        if (mo7565V1(j10, j2, z2) && mo7559F1(j5, z5)) {
                            return false;
                        }
                        if (mo7566W1(j11, j2, z2)) {
                            if (z5) {
                                mo7568Z1(qVar2, i4, j7);
                            } else {
                                mo7572v1(qVar2, i4, j7);
                            }
                            mo7570b2(j11);
                        } else {
                            long j12 = j11;
                            if (Util.f8398a >= 21) {
                                if (j12 < 50000) {
                                    m10536M1(j7, b, u0Var);
                                    mo7563Q1(qVar, i, j7, b);
                                    mo7570b2(j12);
                                }
                            } else if (j12 < 30000) {
                                if (j12 > 11000) {
                                    try {
                                        Thread.sleep((j12 - 10000) / 1000);
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                        return false;
                                    }
                                }
                                m10536M1(j7, b, u0Var);
                                mo7562P1(qVar2, i4, j7);
                                mo7570b2(j12);
                            }
                        }
                    }
                    return false;
                }
                return true;
            } else if (!m10529D1(j8)) {
                return false;
            } else {
                mo7568Z1(qVar2, i4, j7);
                mo7570b2(j8);
                return true;
            }
        } else {
            mo7568Z1(qVar2, i4, j7);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T1 */
    public void mo7564T1(MediaCodecAdapter qVar, Surface surface) {
        qVar.mo6424j(surface);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V1 */
    public boolean mo7565V1(long j, long j2, boolean z) {
        return m10530E1(j) && !z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public boolean mo7566W1(long j, long j2, boolean z) {
        return m10529D1(j) && !z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X1 */
    public boolean mo7567X1(long j, long j2) {
        return m10529D1(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public void mo6479Y0() {
        super.mo6479Y0();
        this.f8591i1 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public void mo7568Z1(MediaCodecAdapter qVar, int i, long j) {
        TraceUtil.m10216a("skipVideoBuffer");
        qVar.mo6418e(i, false);
        TraceUtil.m10218c();
        this.f7110G0.f5737f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo5783a0(MediaCodecInfo sVar, MediaCodecAdapter qVar, Format u0Var, MediaCrypto mediaCrypto, float f) {
        String str = sVar.f7089c;
        C1219a z1 = mo7573z1(sVar, u0Var, mo6513D());
        this.f8576T0 = z1;
        MediaFormat C1 = mo7558C1(u0Var, str, z1, f, this.f8575S0, this.f8604v1 ? this.f8605w1 : 0);
        if (this.f8579W0 == null) {
            if (m10541Y1(sVar)) {
                if (this.f8580X0 == null) {
                    this.f8580X0 = DummySurface.m10507n(this.f8570N0, sVar.f7093g);
                }
                this.f8579W0 = this.f8580X0;
            } else {
                throw new IllegalStateException();
            }
        }
        qVar.mo6416c(C1, this.f8579W0, mediaCrypto, 0);
        if (Util.f8398a >= 23 && this.f8604v1) {
            this.f8606x1 = new C1220b(qVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a2 */
    public void mo7569a2(int i) {
        DecoderCounters dVar = this.f7110G0;
        dVar.f5738g += i;
        this.f8589g1 += i;
        int i2 = this.f8590h1 + i;
        this.f8590h1 = i2;
        dVar.f5739h = Math.max(i2, dVar.f5739h);
        int i3 = this.f8574R0;
        if (i3 > 0 && this.f8589g1 >= i3) {
            m10531G1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public MediaCodecDecoderException mo6482b0(Throwable th, MediaCodecInfo sVar) {
        return new MediaCodecVideoDecoderException(th, sVar, this.f8579W0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public void mo7570b2(long j) {
        this.f7110G0.mo5963a(j);
        this.f8594l1 += j;
        this.f8595m1++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r9.f8604v1 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9.f8579W0 == r0) goto L_0x0022;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5786e() {
        /*
            r9 = this;
            boolean r0 = super.mo5786e()
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0025
            boolean r0 = r9.f8583a1
            if (r0 != 0) goto L_0x0022
            android.view.Surface r0 = r9.f8580X0
            if (r0 == 0) goto L_0x0018
            android.view.Surface r4 = r9.f8579W0
            if (r4 == r0) goto L_0x0022
        L_0x0018:
            c.a.a.a.g2.q r0 = r9.mo6494q0()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r9.f8604v1
            if (r0 == 0) goto L_0x0025
        L_0x0022:
            r9.f8587e1 = r2
            return r1
        L_0x0025:
            long r4 = r9.f8587e1
            r0 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x002d
            return r0
        L_0x002d:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r9.f8587e1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0038
            return r1
        L_0x0038:
            r9.f8587e1 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p112n2.MediaCodecVideoRenderer.mo5786e():boolean");
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public boolean mo6485h1(MediaCodecInfo sVar) {
        return this.f8579W0 != null || m10541Y1(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public int mo5790j1(MediaCodecSelector uVar, Format u0Var) throws C1025c {
        int i = 0;
        if (!MimeTypes.m10411q(u0Var.f8814l)) {
            return RendererCapabilities.m10784a(0);
        }
        boolean z = u0Var.f8817o != null;
        List A1 = m10527A1(uVar, u0Var, z, false);
        if (z && A1.isEmpty()) {
            A1 = m10527A1(uVar, u0Var, false, false);
        }
        if (A1.isEmpty()) {
            return RendererCapabilities.m10784a(1);
        }
        if (!MediaCodecRenderer.m8502k1(u0Var)) {
            return RendererCapabilities.m10784a(2);
        }
        MediaCodecInfo sVar = (MediaCodecInfo) A1.get(0);
        boolean m = sVar.mo6469m(u0Var);
        int i2 = sVar.mo6471o(u0Var) ? 16 : 8;
        if (m) {
            List A12 = m10527A1(uVar, u0Var, z, true);
            if (!A12.isEmpty()) {
                MediaCodecInfo sVar2 = (MediaCodecInfo) A12.get(0);
                if (sVar2.mo6469m(u0Var) && sVar2.mo6471o(u0Var)) {
                    i = 32;
                }
            }
        }
        return RendererCapabilities.m10785b(m ? 4 : 3, i2, i);
    }

    /* renamed from: m */
    public void mo5791m(int i, Object obj) throws ExoPlaybackException {
        if (i == 1) {
            m10540U1((Surface) obj);
        } else if (i == 4) {
            this.f8582Z0 = ((Integer) obj).intValue();
            MediaCodecAdapter q0 = mo6494q0();
            if (q0 != null) {
                q0.mo6421g(this.f8582Z0);
            }
        } else if (i == 6) {
            this.f8607y1 = (VideoFrameMetadataListener) obj;
        } else if (i != 102) {
            super.mo5791m(i, obj);
        } else {
            int intValue = ((Integer) obj).intValue();
            if (this.f8605w1 != intValue) {
                this.f8605w1 = intValue;
                if (this.f8604v1) {
                    mo6478W0();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public boolean mo6496s0() {
        return this.f8604v1 && Util.f8398a < 23;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public boolean mo7571s1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            if (!f8568L0) {
                f8569M0 = m10548w1();
                f8568L0 = true;
            }
        }
        return f8569M0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public float mo5792t0(float f, Format u0Var, Format[] u0VarArr) {
        float f2 = -1.0f;
        for (Format u0Var2 : u0VarArr) {
            float f3 = u0Var2.f8821s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public List<MediaCodecInfo> mo5796v0(MediaCodecSelector uVar, Format u0Var, boolean z) throws C1025c {
        return m10527A1(uVar, u0Var, z, this.f8604v1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo7572v1(MediaCodecAdapter qVar, int i, long j) {
        TraceUtil.m10216a("dropVideoBuffer");
        qVar.mo6418e(i, false);
        TraceUtil.m10218c();
        mo7569a2(1);
    }

    /* renamed from: x */
    public void mo6498x(float f, float f2) throws ExoPlaybackException {
        super.mo6498x(f, f2);
        this.f8571O0.mo7585k(f);
    }

    /* access modifiers changed from: protected */
    @TargetApi(29)
    /* renamed from: z0 */
    public void mo6501z0(DecoderInputBuffer fVar) throws ExoPlaybackException {
        if (this.f8578V0) {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.m10153e(fVar.f5747f);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    m10538R1(mo6494q0(), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z1 */
    public C1219a mo7573z1(MediaCodecInfo sVar, Format u0Var, Format[] u0VarArr) {
        int i = u0Var.f8819q;
        int i2 = u0Var.f8820r;
        int B1 = m10528B1(sVar, u0Var);
        if (u0VarArr.length == 1) {
            if (B1 != -1) {
                int x1 = m10549x1(sVar, u0Var.f8814l, u0Var.f8819q, u0Var.f8820r);
                if (x1 != -1) {
                    B1 = Math.min((int) (((float) B1) * 1.5f), x1);
                }
            }
            return new C1219a(i, i2, B1);
        }
        int length = u0VarArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            Format u0Var2 = u0VarArr[i3];
            if (u0Var.f8826x != null && u0Var2.f8826x == null) {
                u0Var2 = u0Var2.mo7668l().mo7684J(u0Var.f8826x).mo7679E();
            }
            if (sVar.mo6464e(u0Var, u0Var2).f5755d != 0) {
                int i4 = u0Var2.f8819q;
                z |= i4 == -1 || u0Var2.f8820r == -1;
                i = Math.max(i, i4);
                i2 = Math.max(i2, u0Var2.f8820r);
                B1 = Math.max(B1, m10528B1(sVar, u0Var2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(i);
            String str = "x";
            sb.append(str);
            sb.append(i2);
            String str2 = "MediaCodecVideoRenderer";
            Log.m10386h(str2, sb.toString());
            Point y1 = m10550y1(sVar, u0Var);
            if (y1 != null) {
                i = Math.max(i, y1.x);
                i2 = Math.max(i2, y1.y);
                B1 = Math.max(B1, m10549x1(sVar, u0Var.f8814l, i, i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(i);
                sb2.append(str);
                sb2.append(i2);
                Log.m10386h(str2, sb2.toString());
            }
        }
        return new C1219a(i, i2, B1);
    }

    public MediaCodecVideoRenderer(Context context, C1020a aVar, MediaCodecSelector uVar, long j, boolean z, Handler handler, VideoRendererEventListener zVar, int i) {
        super(2, aVar, uVar, z, 30.0f);
        this.f8573Q0 = j;
        this.f8574R0 = i;
        Context applicationContext = context.getApplicationContext();
        this.f8570N0 = applicationContext;
        this.f8571O0 = new VideoFrameReleaseHelper(applicationContext);
        this.f8572P0 = new C1224a(handler, zVar);
        this.f8575S0 = m10547u1();
        this.f8587e1 = -9223372036854775807L;
        this.f8596n1 = -1;
        this.f8597o1 = -1;
        this.f8599q1 = -1.0f;
        this.f8582Z0 = 1;
        this.f8605w1 = 0;
        m10545r1();
    }
}
