package p067c.p068a.p069a.p070a.p087g2;

import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.g2.s */
public final class MediaCodecInfo {

    /* renamed from: a */
    public final String f7087a;

    /* renamed from: b */
    public final String f7088b;

    /* renamed from: c */
    public final String f7089c;

    /* renamed from: d */
    public final CodecCapabilities f7090d;

    /* renamed from: e */
    public final boolean f7091e;

    /* renamed from: f */
    public final boolean f7092f;

    /* renamed from: g */
    public final boolean f7093g;

    /* renamed from: h */
    public final boolean f7094h;

    /* renamed from: i */
    public final boolean f7095i;

    /* renamed from: j */
    public final boolean f7096j;

    /* renamed from: k */
    private final boolean f7097k;

    MediaCodecInfo(String str, String str2, String str3, CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f7087a = (String) Assertions.m10153e(str);
        this.f7088b = str2;
        this.f7089c = str3;
        this.f7090d = codecCapabilities;
        this.f7094h = z;
        this.f7095i = z2;
        this.f7096j = z3;
        this.f7091e = z4;
        this.f7092f = z5;
        this.f7093g = z6;
        this.f7097k = MimeTypes.m10411q(str2);
    }

    /* renamed from: A */
    public static MediaCodecInfo m8441A(String str, String str2, String str3, CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        MediaCodecInfo sVar = new MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, !z4 && codecCapabilities != null && m8446h(codecCapabilities) && !m8456y(str), codecCapabilities != null && m8450r(codecCapabilities), z5 || (codecCapabilities != null && m8448p(codecCapabilities)));
        return sVar;
    }

    /* renamed from: a */
    private static int m8442a(String str, String str2, int i) {
        if (i > 1 || ((Util.f8398a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append("]");
        Log.m10386h("MediaCodecInfo", sb.toString());
        return i2;
    }

    /* renamed from: c */
    private static Point m8443c(VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.m10297k(i, widthAlignment) * widthAlignment, Util.m10297k(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: d */
    private static boolean m8444d(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point c = m8443c(videoCapabilities, i, i2);
        int i3 = c.x;
        int i4 = c.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.media.MediaCodecInfo.CodecProfileLevel[] m8445f(android.media.MediaCodecInfo.CodecCapabilities r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0018
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x0018
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            r1 = 180000000(0xaba9500, float:1.7967196E-32)
            r2 = 1
            if (r3 < r1) goto L_0x0022
            r3 = 1024(0x400, float:1.435E-42)
            goto L_0x0069
        L_0x0022:
            r1 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r1) goto L_0x002a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x0069
        L_0x002a:
            r1 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r1) goto L_0x0032
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0032:
            r1 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r1) goto L_0x003a
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0069
        L_0x003a:
            r1 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r1) goto L_0x0042
            r3 = 64
            goto L_0x0069
        L_0x0042:
            r1 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r1) goto L_0x004a
            r3 = 32
            goto L_0x0069
        L_0x004a:
            r1 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r1) goto L_0x0052
            r3 = 16
            goto L_0x0069
        L_0x0052:
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r1) goto L_0x005a
            r3 = 8
            goto L_0x0069
        L_0x005a:
            r1 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r1) goto L_0x0061
            r3 = 4
            goto L_0x0069
        L_0x0061:
            r1 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r1) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel r1 = new android.media.MediaCodecInfo$CodecProfileLevel
            r1.<init>()
            r1.profile = r2
            r1.level = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
            r3[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo.m8445f(android.media.MediaCodecInfo$CodecCapabilities):android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    /* renamed from: h */
    private static boolean m8446h(CodecCapabilities codecCapabilities) {
        return Util.f8398a >= 19 && m8447i(codecCapabilities);
    }

    /* renamed from: i */
    private static boolean m8447i(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: p */
    private static boolean m8448p(CodecCapabilities codecCapabilities) {
        return Util.f8398a >= 21 && m8449q(codecCapabilities);
    }

    /* renamed from: q */
    private static boolean m8449q(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: r */
    private static boolean m8450r(CodecCapabilities codecCapabilities) {
        return Util.f8398a >= 21 && m8451s(codecCapabilities);
    }

    /* renamed from: s */
    private static boolean m8451s(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: u */
    private void m8452u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedSupport [");
        sb.append(str);
        String str2 = "] [";
        sb.append(str2);
        sb.append(this.f7087a);
        sb.append(", ");
        sb.append(this.f7088b);
        sb.append(str2);
        sb.append(Util.f8402e);
        sb.append("]");
        Log.m10380b("MediaCodecInfo", sb.toString());
    }

    /* renamed from: v */
    private void m8453v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        String str2 = "] [";
        sb.append(str2);
        sb.append(this.f7087a);
        sb.append(", ");
        sb.append(this.f7088b);
        sb.append(str2);
        sb.append(Util.f8402e);
        sb.append("]");
        Log.m10380b("MediaCodecInfo", sb.toString());
    }

    /* renamed from: w */
    private static boolean m8454w(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: x */
    private static boolean m8455x(String str) {
        return Util.f8401d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: y */
    private static boolean m8456y(String str) {
        if (Util.f8398a <= 22) {
            String str2 = Util.f8401d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private static final boolean m8457z(String str) {
        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
            if ("mcv5a".equals(Util.f8399b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public Point mo6463b(int i, int i2) {
        CodecCapabilities codecCapabilities = this.f7090d;
        if (codecCapabilities == null) {
            return null;
        }
        VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            return null;
        }
        return m8443c(videoCapabilities, i, i2);
    }

    /* renamed from: e */
    public DecoderReuseEvaluation mo6464e(Format u0Var, Format u0Var2) {
        int i = !Util.m10279b(u0Var.f8814l, u0Var2.f8814l) ? 8 : 0;
        if (this.f7097k) {
            if (u0Var.f8822t != u0Var2.f8822t) {
                i |= 1024;
            }
            if (!this.f7091e && !(u0Var.f8819q == u0Var2.f8819q && u0Var.f8820r == u0Var2.f8820r)) {
                i |= 512;
            }
            if (!Util.m10279b(u0Var.f8826x, u0Var2.f8826x)) {
                i |= 2048;
            }
            if (m8455x(this.f7087a) && !u0Var.mo7671o(u0Var2)) {
                i |= 2;
            }
            if (i == 0) {
                DecoderReuseEvaluation gVar = new DecoderReuseEvaluation(this.f7087a, u0Var, u0Var2, u0Var.mo7671o(u0Var2) ? 3 : 2, 0);
                return gVar;
            }
        } else {
            if (u0Var.f8827y != u0Var2.f8827y) {
                i |= 4096;
            }
            if (u0Var.f8828z != u0Var2.f8828z) {
                i |= 8192;
            }
            if (u0Var.f8797A != u0Var2.f8797A) {
                i |= 16384;
            }
            if (i == 0) {
                if ("audio/mp4a-latm".equals(this.f7088b)) {
                    Pair l = MediaCodecUtil.m8588l(u0Var);
                    Pair l2 = MediaCodecUtil.m8588l(u0Var2);
                    if (!(l == null || l2 == null)) {
                        int intValue = ((Integer) l.first).intValue();
                        int intValue2 = ((Integer) l2.first).intValue();
                        if (intValue == 42 && intValue2 == 42) {
                            DecoderReuseEvaluation gVar2 = new DecoderReuseEvaluation(this.f7087a, u0Var, u0Var2, 3, 0);
                            return gVar2;
                        }
                    }
                }
            }
            if (!u0Var.mo7671o(u0Var2)) {
                i |= 32;
            }
            if (m8454w(this.f7088b)) {
                i |= 2;
            }
            if (i == 0) {
                DecoderReuseEvaluation gVar3 = new DecoderReuseEvaluation(this.f7087a, u0Var, u0Var2, 1, 0);
                return gVar3;
            }
        }
        DecoderReuseEvaluation gVar4 = new DecoderReuseEvaluation(this.f7087a, u0Var, u0Var2, 0, i);
        return gVar4;
    }

    /* renamed from: g */
    public CodecProfileLevel[] mo6465g() {
        CodecCapabilities codecCapabilities = this.f7090d;
        if (codecCapabilities != null) {
            CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
            if (codecProfileLevelArr != null) {
                return codecProfileLevelArr;
            }
        }
        return new CodecProfileLevel[0];
    }

    /* renamed from: j */
    public boolean mo6466j(int i) {
        CodecCapabilities codecCapabilities = this.f7090d;
        if (codecCapabilities == null) {
            m8453v("channelCount.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m8453v("channelCount.aCaps");
            return false;
        } else if (m8442a(this.f7087a, this.f7088b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("channelCount.support, ");
            sb.append(i);
            m8453v(sb.toString());
            return false;
        }
    }

    /* renamed from: k */
    public boolean mo6467k(int i) {
        CodecCapabilities codecCapabilities = this.f7090d;
        if (codecCapabilities == null) {
            m8453v("sampleRate.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m8453v("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("sampleRate.support, ");
            sb.append(i);
            m8453v(sb.toString());
            return false;
        }
    }

    /* renamed from: l */
    public boolean mo6468l(Format u0Var) {
        String str = u0Var.f8811i;
        if (str == null || this.f7088b == null) {
            return true;
        }
        String g = MimeTypes.m10401g(str);
        if (g == null) {
            return true;
        }
        String str2 = ", ";
        if (!this.f7088b.equals(g)) {
            StringBuilder sb = new StringBuilder();
            sb.append("codec.mime ");
            sb.append(u0Var.f8811i);
            sb.append(str2);
            sb.append(g);
            m8453v(sb.toString());
            return false;
        }
        Pair l = MediaCodecUtil.m8588l(u0Var);
        if (l == null) {
            return true;
        }
        int intValue = ((Integer) l.first).intValue();
        int intValue2 = ((Integer) l.second).intValue();
        if (!this.f7097k && intValue != 42) {
            return true;
        }
        CodecProfileLevel[] g2 = mo6465g();
        if (Util.f8398a <= 23) {
            if ("video/x-vnd.on2.vp9".equals(this.f7088b) && g2.length == 0) {
                g2 = m8445f(this.f7090d);
            }
        }
        for (CodecProfileLevel codecProfileLevel : g2) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("codec.profileLevel, ");
        sb2.append(u0Var.f8811i);
        sb2.append(str2);
        sb2.append(g);
        m8453v(sb2.toString());
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (mo6466j(r7) == false) goto L_0x006b;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6469m(p067c.p068a.p069a.p070a.Format r7) throws p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.C1025c {
        /*
            r6 = this;
            boolean r0 = r6.mo6468l(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r6.f7097k
            r2 = 21
            r3 = 1
            if (r0 == 0) goto L_0x0051
            int r0 = r7.f8819q
            if (r0 <= 0) goto L_0x0050
            int r4 = r7.f8820r
            if (r4 > 0) goto L_0x0018
            goto L_0x0050
        L_0x0018:
            int r5 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            if (r5 < r2) goto L_0x0024
            float r7 = r7.f8821s
            double r1 = (double) r7
            boolean r7 = r6.mo6472t(r0, r4, r1)
            return r7
        L_0x0024:
            int r0 = r0 * r4
            int r2 = p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.m8572I()
            if (r0 > r2) goto L_0x002d
            r1 = 1
        L_0x002d:
            if (r1 != 0) goto L_0x004f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "legacyFrameSize, "
            r0.append(r2)
            int r2 = r7.f8819q
            r0.append(r2)
            java.lang.String r2 = "x"
            r0.append(r2)
            int r7 = r7.f8820r
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.m8453v(r7)
        L_0x004f:
            return r1
        L_0x0050:
            return r3
        L_0x0051:
            int r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            if (r0 < r2) goto L_0x006a
            int r0 = r7.f8828z
            r2 = -1
            if (r0 == r2) goto L_0x0060
            boolean r0 = r6.mo6467k(r0)
            if (r0 == 0) goto L_0x006b
        L_0x0060:
            int r7 = r7.f8827y
            if (r7 == r2) goto L_0x006a
            boolean r7 = r6.mo6466j(r7)
            if (r7 == 0) goto L_0x006b
        L_0x006a:
            r1 = 1
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo.mo6469m(c.a.a.a.u0):boolean");
    }

    /* renamed from: n */
    public boolean mo6470n() {
        if (Util.f8398a >= 29) {
            if ("video/x-vnd.on2.vp9".equals(this.f7088b)) {
                for (CodecProfileLevel codecProfileLevel : mo6465g()) {
                    if (codecProfileLevel.profile == 16384) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean mo6471o(Format u0Var) {
        if (this.f7097k) {
            return this.f7091e;
        }
        Pair l = MediaCodecUtil.m8588l(u0Var);
        return l != null && ((Integer) l.first).intValue() == 42;
    }

    /* renamed from: t */
    public boolean mo6472t(int i, int i2, double d) {
        CodecCapabilities codecCapabilities = this.f7090d;
        if (codecCapabilities == null) {
            m8453v("sizeAndRate.caps");
            return false;
        }
        VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m8453v("sizeAndRate.vCaps");
            return false;
        }
        if (!m8444d(videoCapabilities, i, i2, d)) {
            String str = "x";
            if (i >= i2 || !m8457z(this.f7087a) || !m8444d(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder();
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append(str);
                sb.append(i2);
                sb.append(str);
                sb.append(d);
                m8453v(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append(str);
            sb2.append(i2);
            sb2.append(str);
            sb2.append(d);
            m8452u(sb2.toString());
        }
        return true;
    }

    public String toString() {
        return this.f7087a;
    }
}
