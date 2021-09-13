package p067c.p068a.p069a.p070a.p087g2;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;

@SuppressLint({"InlinedApi"})
/* renamed from: c.a.a.a.g2.v */
public final class MediaCodecUtil {

    /* renamed from: a */
    private static final Pattern f7178a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<C1024b, List<MediaCodecInfo>> f7179b = new HashMap<>();

    /* renamed from: c */
    private static int f7180c = -1;

    /* renamed from: c.a.a.a.g2.v$b */
    /* compiled from: MediaCodecUtil */
    private static final class C1024b {

        /* renamed from: a */
        public final String f7181a;

        /* renamed from: b */
        public final boolean f7182b;

        /* renamed from: c */
        public final boolean f7183c;

        public C1024b(String str, boolean z, boolean z2) {
            this.f7181a = str;
            this.f7182b = z;
            this.f7183c = z2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C1024b.class) {
                return false;
            }
            C1024b bVar = (C1024b) obj;
            if (!(TextUtils.equals(this.f7181a, bVar.f7181a) && this.f7182b == bVar.f7182b && this.f7183c == bVar.f7183c)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = (((this.f7181a.hashCode() + 31) * 31) + (this.f7182b ? 1231 : 1237)) * 31;
            if (!this.f7183c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    /* renamed from: c.a.a.a.g2.v$c */
    /* compiled from: MediaCodecUtil */
    public static class C1025c extends Exception {
        private C1025c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: c.a.a.a.g2.v$d */
    /* compiled from: MediaCodecUtil */
    private interface C1026d {
        /* renamed from: a */
        MediaCodecInfo mo6504a(int i);

        /* renamed from: b */
        boolean mo6505b(String str, String str2, CodecCapabilities codecCapabilities);

        /* renamed from: c */
        int mo6506c();

        /* renamed from: d */
        boolean mo6507d(String str, String str2, CodecCapabilities codecCapabilities);

        /* renamed from: e */
        boolean mo6508e();
    }

    /* renamed from: c.a.a.a.g2.v$e */
    /* compiled from: MediaCodecUtil */
    private static final class C1027e implements C1026d {
        private C1027e() {
        }

        /* renamed from: a */
        public MediaCodecInfo mo6504a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: b */
        public boolean mo6505b(String str, String str2, CodecCapabilities codecCapabilities) {
            return false;
        }

        /* renamed from: c */
        public int mo6506c() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: d */
        public boolean mo6507d(String str, String str2, CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        /* renamed from: e */
        public boolean mo6508e() {
            return false;
        }
    }

    /* renamed from: c.a.a.a.g2.v$f */
    /* compiled from: MediaCodecUtil */
    private static final class C1028f implements C1026d {

        /* renamed from: a */
        private final int f7184a;

        /* renamed from: b */
        private MediaCodecInfo[] f7185b;

        public C1028f(boolean z, boolean z2) {
            this.f7184a = (z || z2) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        /* renamed from: f */
        private void m8613f() {
            if (this.f7185b == null) {
                this.f7185b = new MediaCodecList(this.f7184a).getCodecInfos();
            }
        }

        /* renamed from: a */
        public MediaCodecInfo mo6504a(int i) {
            m8613f();
            return this.f7185b[i];
        }

        /* renamed from: b */
        public boolean mo6505b(String str, String str2, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        /* renamed from: c */
        public int mo6506c() {
            m8613f();
            return this.f7185b.length;
        }

        /* renamed from: d */
        public boolean mo6507d(String str, String str2, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        /* renamed from: e */
        public boolean mo6508e() {
            return true;
        }
    }

    /* renamed from: c.a.a.a.g2.v$g */
    /* compiled from: MediaCodecUtil */
    private interface C1029g<T> {
        /* renamed from: a */
        int mo6409a(T t);
    }

    /* renamed from: A */
    private static boolean m8564A(MediaCodecInfo mediaCodecInfo) {
        if (Util.f8398a >= 29) {
            return m8565B(mediaCodecInfo);
        }
        String J0 = Util.m10256J0(mediaCodecInfo.getName());
        boolean z = false;
        if (J0.startsWith("arc.")) {
            return false;
        }
        if (J0.startsWith("omx.google.") || J0.startsWith("omx.ffmpeg.") || ((J0.startsWith("omx.sec.") && J0.contains(".sw.")) || J0.equals("omx.qcom.video.decoder.hevcswvdec") || J0.startsWith("c2.android.") || J0.startsWith("c2.google.") || (!J0.startsWith("omx.") && !J0.startsWith("c2.")))) {
            z = true;
        }
        return z;
    }

    /* renamed from: B */
    private static boolean m8565B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* renamed from: C */
    private static boolean m8566C(MediaCodecInfo mediaCodecInfo) {
        if (Util.f8398a >= 29) {
            return m8567D(mediaCodecInfo);
        }
        String J0 = Util.m10256J0(mediaCodecInfo.getName());
        return !J0.startsWith("omx.google.") && !J0.startsWith("c2.android.") && !J0.startsWith("c2.google.");
    }

    /* renamed from: D */
    private static boolean m8567D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* renamed from: E */
    static /* synthetic */ int m8568E(MediaCodecInfo sVar) {
        String str = sVar.f7087a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.f8398a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* renamed from: F */
    static /* synthetic */ int m8569F(MediaCodecInfo sVar) {
        return sVar.f7087a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: G */
    static /* synthetic */ int m8570G(Format u0Var, MediaCodecInfo sVar) {
        try {
            return sVar.mo6469m(u0Var) ? 1 : 0;
        } catch (C1025c unused) {
            return -1;
        }
    }

    /* renamed from: H */
    static /* synthetic */ int m8571H(C1029g gVar, Object obj, Object obj2) {
        return gVar.mo6409a(obj2) - gVar.mo6409a(obj);
    }

    /* renamed from: I */
    public static int m8572I() throws C1025c {
        if (f7180c == -1) {
            int i = 0;
            MediaCodecInfo m = m8589m("video/avc", false, false);
            if (m != null) {
                CodecProfileLevel[] g = m.mo6465g();
                int length = g.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m8580d(g[i].level), i2);
                    i++;
                }
                i = Math.max(i2, Util.f8398a >= 21 ? 345600 : 172800);
            }
            f7180c = i;
        }
        return f7180c;
    }

    /* renamed from: J */
    private static int m8573J(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: K */
    private static <T> void m8574K(List<T> list, C1029g<T> gVar) {
        Collections.sort(list, new C1012h(gVar));
    }

    /* renamed from: L */
    private static int m8575L(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return LogType.UNEXP;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    /* renamed from: M */
    private static int m8576M(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: a */
    private static void m8577a(String str, List<MediaCodecInfo> list) {
        if ("audio/raw".equals(str)) {
            if (Util.f8398a < 26 && Util.f8399b.equals("R9") && list.size() == 1 && ((MediaCodecInfo) list.get(0)).f7087a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.m8441A("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m8574K(list, C1009e.f7031a);
        }
        int i = Util.f8398a;
        if (i < 21 && list.size() > 1) {
            String str2 = ((MediaCodecInfo) list.get(0)).f7087a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m8574K(list, C1010f.f7032a);
            }
        }
        if (i < 30 && list.size() > 1) {
            if ("OMX.qti.audio.decoder.flac".equals(((MediaCodecInfo) list.get(0)).f7087a)) {
                list.add((MediaCodecInfo) list.remove(0));
            }
        }
    }

    /* renamed from: b */
    private static int m8578b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return LogType.UNEXP;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return LogType.ANR;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: c */
    private static int m8579c(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return LogType.UNEXP;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: d */
    private static int m8580d(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case LogType.UNEXP /*256*/:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* renamed from: e */
    private static int m8581e(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    /* renamed from: f */
    private static Integer m8582f(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 8;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = 9;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c = 10;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Integer.valueOf(1);
            case 1:
                return Integer.valueOf(2);
            case 2:
                return Integer.valueOf(4);
            case 3:
                return Integer.valueOf(8);
            case 4:
                return Integer.valueOf(16);
            case 5:
                return Integer.valueOf(32);
            case 6:
                return Integer.valueOf(64);
            case 7:
                return Integer.valueOf(128);
            case 8:
                return Integer.valueOf(LogType.UNEXP);
            case 9:
                return Integer.valueOf(512);
            case 10:
                return Integer.valueOf(1024);
            case 11:
                return Integer.valueOf(2048);
            case 12:
                return Integer.valueOf(4096);
            default:
                return null;
        }
    }

    /* renamed from: g */
    private static Integer m8583g(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Integer.valueOf(1);
            case 1:
                return Integer.valueOf(2);
            case 2:
                return Integer.valueOf(4);
            case 3:
                return Integer.valueOf(8);
            case 4:
                return Integer.valueOf(16);
            case 5:
                return Integer.valueOf(32);
            case 6:
                return Integer.valueOf(64);
            case 7:
                return Integer.valueOf(128);
            case 8:
                return Integer.valueOf(LogType.UNEXP);
            case 9:
                return Integer.valueOf(512);
            default:
                return null;
        }
    }

    /* renamed from: h */
    private static Pair<Integer, Integer> m8584h(String str, String[] strArr) {
        String str2 = "Ignoring malformed MP4A codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length != 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Log.m10386h(str3, sb.toString());
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(MimeTypes.m10402h(Integer.parseInt(strArr[1], 16)))) {
                int J = m8573J(Integer.parseInt(strArr[2]));
                if (J != -1) {
                    return new Pair<>(Integer.valueOf(J), Integer.valueOf(0));
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            Log.m10386h(str3, sb2.toString());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r8 != 6) goto L_0x007e;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> m8585i(java.lang.String r8, java.lang.String[] r9, p067c.p068a.p069a.p070a.p112n2.ColorInfo r10) {
        /*
            int r0 = r9.length
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 4
            if (r0 >= r4) goto L_0x001c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r8)
            return r2
        L_0x001c:
            r0 = 1
            r4 = r9[r0]     // Catch:{ NumberFormatException -> 0x00a9 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00a9 }
            r5 = 2
            r6 = r9[r5]     // Catch:{ NumberFormatException -> 0x00a9 }
            r7 = 0
            java.lang.String r6 = r6.substring(r7, r5)     // Catch:{ NumberFormatException -> 0x00a9 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00a9 }
            r7 = 3
            r9 = r9[r7]     // Catch:{ NumberFormatException -> 0x00a9 }
            int r8 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x00a9 }
            if (r4 == 0) goto L_0x004d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown AV1 profile: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r8)
            return r2
        L_0x004d:
            r9 = 8
            if (r8 == r9) goto L_0x006a
            r1 = 10
            if (r8 == r1) goto L_0x006a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unknown AV1 bit depth: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r8)
            return r2
        L_0x006a:
            if (r8 != r9) goto L_0x006d
            goto L_0x007f
        L_0x006d:
            if (r10 == 0) goto L_0x007e
            byte[] r8 = r10.f8533d
            if (r8 != 0) goto L_0x007b
            int r8 = r10.f8532c
            r9 = 7
            if (r8 == r9) goto L_0x007b
            r9 = 6
            if (r8 != r9) goto L_0x007e
        L_0x007b:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x007f
        L_0x007e:
            r0 = 2
        L_0x007f:
            int r8 = m8578b(r6)
            r9 = -1
            if (r8 != r9) goto L_0x009b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown AV1 level: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r8)
            return r2
        L_0x009b:
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.<init>(r10, r8)
            return r9
        L_0x00a9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.m8585i(java.lang.String, java.lang.String[], c.a.a.a.n2.k):android.util.Pair");
    }

    /* renamed from: j */
    private static Pair<Integer, Integer> m8586j(String str, String[] strArr) {
        int i;
        int i2;
        String str2 = "Ignoring malformed AVC codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Log.m10386h(str3, sb.toString());
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = parseInt;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                Log.m10386h(str3, sb2.toString());
                return null;
            }
            int e = m8581e(i2);
            if (e == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown AVC profile: ");
                sb3.append(i2);
                Log.m10386h(str3, sb3.toString());
                return null;
            }
            int c = m8579c(i);
            if (c != -1) {
                return new Pair<>(Integer.valueOf(e), Integer.valueOf(c));
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown AVC level: ");
            sb4.append(i);
            Log.m10386h(str3, sb4.toString());
            return null;
        } catch (NumberFormatException unused) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(str);
            Log.m10386h(str3, sb5.toString());
            return null;
        }
    }

    /* renamed from: k */
    private static String m8587k(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r3.equals("av01") == false) goto L_0x002b;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m8588l(p067c.p068a.p069a.p070a.Format r6) {
        /*
            java.lang.String r0 = r6.f8811i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f8814l
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001d
            java.lang.String r6 = r6.f8811i
            android.util.Pair r6 = m8594r(r6, r0)
            return r6
        L_0x001d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x006f;
                case 3006243: goto L_0x0064;
                case 3006244: goto L_0x0059;
                case 3199032: goto L_0x004e;
                case 3214780: goto L_0x0043;
                case 3356560: goto L_0x0038;
                case 3624515: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r2 = -1
            goto L_0x0078
        L_0x002d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r2 = 6
            goto L_0x0078
        L_0x0038:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r2 = 5
            goto L_0x0078
        L_0x0043:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r2 = 4
            goto L_0x0078
        L_0x004e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r2 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            r2 = 2
            goto L_0x0078
        L_0x0064:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x006d
            goto L_0x002b
        L_0x006d:
            r2 = 1
            goto L_0x0078
        L_0x006f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0091;
                case 2: goto L_0x0091;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x0083;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return r1
        L_0x007c:
            java.lang.String r6 = r6.f8811i
            android.util.Pair r6 = m8596t(r6, r0)
            return r6
        L_0x0083:
            java.lang.String r6 = r6.f8811i
            android.util.Pair r6 = m8584h(r6, r0)
            return r6
        L_0x008a:
            java.lang.String r6 = r6.f8811i
            android.util.Pair r6 = m8595s(r6, r0)
            return r6
        L_0x0091:
            java.lang.String r6 = r6.f8811i
            android.util.Pair r6 = m8586j(r6, r0)
            return r6
        L_0x0098:
            java.lang.String r1 = r6.f8811i
            c.a.a.a.n2.k r6 = r6.f8826x
            android.util.Pair r6 = m8585i(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.m8588l(c.a.a.a.u0):android.util.Pair");
    }

    /* renamed from: m */
    public static MediaCodecInfo m8589m(String str, boolean z, boolean z2) throws C1025c {
        List n = m8590n(str, z, z2);
        if (n.isEmpty()) {
            return null;
        }
        return (MediaCodecInfo) n.get(0);
    }

    /* renamed from: n */
    public static synchronized List<MediaCodecInfo> m8590n(String str, boolean z, boolean z2) throws C1025c {
        C1026d dVar;
        synchronized (MediaCodecUtil.class) {
            C1024b bVar = new C1024b(str, z, z2);
            HashMap<C1024b, List<MediaCodecInfo>> hashMap = f7179b;
            List<MediaCodecInfo> list = (List) hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = Util.f8398a;
            if (i >= 21) {
                dVar = new C1028f(z, z2);
            } else {
                dVar = new C1027e();
            }
            ArrayList o = m8591o(bVar, dVar);
            if (z && o.isEmpty() && 21 <= i && i <= 23) {
                o = m8591o(bVar, new C1027e());
                if (!o.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(((MediaCodecInfo) o.get(0)).f7087a);
                    Log.m10386h("MediaCodecUtil", sb.toString());
                }
            }
            m8577a(str, o);
            List<MediaCodecInfo> unmodifiableList = Collections.unmodifiableList(o);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r1.f7182b == false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101 A[SYNTHETIC, Splitter:B:60:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012a A[SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo> m8591o(p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.C1024b r24, p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.C1026d r25) throws p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.C1025c {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x014f }
            r5.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r15 = r1.f7181a     // Catch:{ Exception -> 0x014f }
            int r14 = r25.mo6506c()     // Catch:{ Exception -> 0x014f }
            boolean r13 = r25.mo6508e()     // Catch:{ Exception -> 0x014f }
            r0 = 0
            r12 = 0
        L_0x0019:
            if (r12 >= r14) goto L_0x014e
            android.media.MediaCodecInfo r0 = r2.mo6504a(r12)     // Catch:{ Exception -> 0x014f }
            boolean r6 = m8598v(r0)     // Catch:{ Exception -> 0x014f }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x0120
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x014f }
            boolean r6 = m8600x(r0, r11, r13, r15)     // Catch:{ Exception -> 0x014f }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = m8587k(r0, r11, r15)     // Catch:{ Exception -> 0x014f }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00ef }
            boolean r6 = r2.mo6507d(r4, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r7 = r2.mo6505b(r4, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r8 = r1.f7183c     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            if (r8 == 0) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0025
        L_0x0056:
            boolean r6 = r2.mo6507d(r3, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r7 = r2.mo6505b(r3, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r8 = r1.f7182b     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x0064
            if (r7 != 0) goto L_0x0025
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0069
            goto L_0x0025
        L_0x0069:
            boolean r16 = m8601y(r0)     // Catch:{ Exception -> 0x00ef }
            boolean r17 = m8564A(r0)     // Catch:{ Exception -> 0x00ef }
            boolean r0 = m8566C(r0)     // Catch:{ Exception -> 0x00ef }
            if (r13 == 0) goto L_0x007b
            boolean r7 = r1.f7182b     // Catch:{ Exception -> 0x00ef }
            if (r7 == r6) goto L_0x0081
        L_0x007b:
            if (r13 != 0) goto L_0x00b3
            boolean r7 = r1.f7182b     // Catch:{ Exception -> 0x00a8 }
            if (r7 != 0) goto L_0x00b3
        L_0x0081:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            c.a.a.a.g2.s r0 = p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo.m8441A(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a4 }
            r5.add(r0)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0120
        L_0x00a4:
            r0 = move-exception
            r1 = r21
            goto L_0x00f9
        L_0x00a8:
            r0 = move-exception
            r20 = r10
            r22 = r12
            r23 = r13
            r18 = r14
            r1 = r11
            goto L_0x00f9
        L_0x00b3:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            if (r23 != 0) goto L_0x0120
            if (r6 == 0) goto L_0x0120
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r6.<init>()     // Catch:{ Exception -> 0x00a4 }
            r14 = r21
            r6.append(r14)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00ec }
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            c.a.a.a.g2.s r0 = p067c.p068a.p069a.p070a.p087g2.MediaCodecInfo.m8441A(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00ea }
            r5.add(r0)     // Catch:{ Exception -> 0x00ea }
            return r5
        L_0x00ea:
            r0 = move-exception
            goto L_0x00f9
        L_0x00ec:
            r0 = move-exception
            r1 = r14
            goto L_0x00f9
        L_0x00ef:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
        L_0x00f9:
            int r6 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a     // Catch:{ Exception -> 0x014f }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x012a
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x014f }
            if (r6 != 0) goto L_0x012a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r0.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x014f }
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014f }
            p067c.p068a.p069a.p070a.p111m2.Log.m10381c(r8, r0)     // Catch:{ Exception -> 0x014f }
        L_0x0120:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x012a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r2.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x014f }
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x014f }
            p067c.p068a.p069a.p070a.p111m2.Log.m10381c(r8, r1)     // Catch:{ Exception -> 0x014f }
            throw r0     // Catch:{ Exception -> 0x014f }
        L_0x014e:
            return r5
        L_0x014f:
            r0 = move-exception
            c.a.a.a.g2.v$c r1 = new c.a.a.a.g2.v$c
            r2 = 0
            r1.<init>(r0)
            goto L_0x0158
        L_0x0157:
            throw r1
        L_0x0158:
            goto L_0x0157
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.m8591o(c.a.a.a.g2.v$b, c.a.a.a.g2.v$d):java.util.ArrayList");
    }

    /* renamed from: p */
    public static List<MediaCodecInfo> m8592p(List<MediaCodecInfo> list, Format u0Var) {
        ArrayList arrayList = new ArrayList(list);
        m8574K(arrayList, new C1011g(u0Var));
        return arrayList;
    }

    /* renamed from: q */
    public static MediaCodecInfo m8593q() throws C1025c {
        return m8589m("audio/raw", false, false);
    }

    /* renamed from: r */
    private static Pair<Integer, Integer> m8594r(String str, String[] strArr) {
        String str2 = "Ignoring malformed Dolby Vision codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Log.m10386h(str3, sb.toString());
            return null;
        }
        Matcher matcher = f7178a.matcher(strArr[1]);
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            Log.m10386h(str3, sb2.toString());
            return null;
        }
        String group = matcher.group(1);
        Integer g = m8583g(group);
        if (g == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown Dolby Vision profile string: ");
            sb3.append(group);
            Log.m10386h(str3, sb3.toString());
            return null;
        }
        String str4 = strArr[2];
        Integer f = m8582f(str4);
        if (f != null) {
            return new Pair<>(g, f);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown Dolby Vision level string: ");
        sb4.append(str4);
        Log.m10386h(str3, sb4.toString());
        return null;
    }

    /* renamed from: s */
    private static Pair<Integer, Integer> m8595s(String str, String[] strArr) {
        String str2 = "Ignoring malformed HEVC codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Log.m10386h(str3, sb.toString());
            return null;
        }
        int i = 1;
        Matcher matcher = f7178a.matcher(strArr[1]);
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            Log.m10386h(str3, sb2.toString());
            return null;
        }
        String group = matcher.group(1);
        if (!SdkVersion.MINI_VERSION.equals(group)) {
            if ("2".equals(group)) {
                i = 2;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown HEVC profile string: ");
                sb3.append(group);
                Log.m10386h(str3, sb3.toString());
                return null;
            }
        }
        String str4 = strArr[3];
        Integer u = m8597u(str4);
        if (u != null) {
            return new Pair<>(Integer.valueOf(i), u);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown HEVC level string: ");
        sb4.append(str4);
        Log.m10386h(str3, sb4.toString());
        return null;
    }

    /* renamed from: t */
    private static Pair<Integer, Integer> m8596t(String str, String[] strArr) {
        String str2 = "Ignoring malformed VP9 codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Log.m10386h(str3, sb.toString());
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int M = m8576M(parseInt);
            if (M == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown VP9 profile: ");
                sb2.append(parseInt);
                Log.m10386h(str3, sb2.toString());
                return null;
            }
            int L = m8575L(parseInt2);
            if (L != -1) {
                return new Pair<>(Integer.valueOf(M), Integer.valueOf(L));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown VP9 level: ");
            sb3.append(parseInt2);
            Log.m10386h(str3, sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(str);
            Log.m10386h(str3, sb4.toString());
            return null;
        }
    }

    /* renamed from: u */
    private static Integer m8597u(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = 8;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = 9;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = 10;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = 12;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = 13;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Integer.valueOf(2);
            case 1:
                return Integer.valueOf(8);
            case 2:
                return Integer.valueOf(32);
            case 3:
                return Integer.valueOf(128);
            case 4:
                return Integer.valueOf(512);
            case 5:
                return Integer.valueOf(1);
            case 6:
                return Integer.valueOf(4);
            case 7:
                return Integer.valueOf(16);
            case 8:
                return Integer.valueOf(64);
            case 9:
                return Integer.valueOf(LogType.UNEXP);
            case 10:
                return Integer.valueOf(2048);
            case 11:
                return Integer.valueOf(8192);
            case 12:
                return Integer.valueOf(32768);
            case 13:
                return Integer.valueOf(131072);
            case 14:
                return Integer.valueOf(524288);
            case 15:
                return Integer.valueOf(2097152);
            case 16:
                return Integer.valueOf(8388608);
            case 17:
                return Integer.valueOf(33554432);
            case 18:
                return Integer.valueOf(1024);
            case 19:
                return Integer.valueOf(4096);
            case 20:
                return Integer.valueOf(16384);
            case 21:
                return Integer.valueOf(65536);
            case 22:
                return Integer.valueOf(262144);
            case 23:
                return Integer.valueOf(LogType.ANR);
            case 24:
                return Integer.valueOf(4194304);
            case 25:
                return Integer.valueOf(16777216);
            default:
                return null;
        }
    }

    /* renamed from: v */
    private static boolean m8598v(MediaCodecInfo mediaCodecInfo) {
        return Util.f8398a >= 29 && m8599w(mediaCodecInfo);
    }

    /* renamed from: w */
    private static boolean m8599w(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r6.startsWith("HM") != false) goto L_0x0072;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m8600x(android.media.MediaCodecInfo r4, java.lang.String r5, boolean r6, java.lang.String r7) {
        /*
            boolean r4 = r4.isEncoder()
            r0 = 0
            if (r4 != 0) goto L_0x01d5
            if (r6 != 0) goto L_0x0013
            java.lang.String r4 = ".secure"
            boolean r4 = r5.endsWith(r4)
            if (r4 == 0) goto L_0x0013
            goto L_0x01d5
        L_0x0013:
            int r4 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r6 = 21
            if (r4 >= r6) goto L_0x004a
            java.lang.String r6 = "CIPAACDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0049
            java.lang.String r6 = "CIPMP3Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0049
            java.lang.String r6 = "CIPVorbisDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0049
            java.lang.String r6 = "CIPAMRNBDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0049
            java.lang.String r6 = "AACDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0049
            java.lang.String r6 = "MP3Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            return r0
        L_0x004a:
            r6 = 18
            if (r4 >= r6) goto L_0x0073
            java.lang.String r6 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0073
            java.lang.String r6 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            java.lang.String r1 = "a70"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0072
            java.lang.String r1 = p067c.p068a.p069a.p070a.p111m2.Util.f8400c
            java.lang.String r2 = "Xiaomi"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = "HM"
            boolean r6 = r6.startsWith(r1)
            if (r6 == 0) goto L_0x0073
        L_0x0072:
            return r0
        L_0x0073:
            r6 = 16
            if (r4 != r6) goto L_0x00e2
            java.lang.String r1 = "OMX.qcom.audio.decoder.mp3"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00e2
            java.lang.String r1 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            java.lang.String r2 = "dlxu"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "protou"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "ville"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "villeplus"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "villec2"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "gee"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "C6602"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "C6603"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "C6606"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "C6616"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "L36h"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "SO-02E"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00e2
        L_0x00e1:
            return r0
        L_0x00e2:
            if (r4 != r6) goto L_0x010f
            java.lang.String r6 = "OMX.qcom.audio.decoder.aac"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x010f
            java.lang.String r6 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            java.lang.String r1 = "C1504"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x010e
            java.lang.String r1 = "C1505"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x010e
            java.lang.String r1 = "C1604"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x010e
            java.lang.String r1 = "C1605"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x010f
        L_0x010e:
            return r0
        L_0x010f:
            r6 = 24
            java.lang.String r1 = "samsung"
            if (r4 >= r6) goto L_0x0170
            java.lang.String r6 = "OMX.SEC.aac.dec"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0125
            java.lang.String r6 = "OMX.Exynos.AAC.Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0170
        L_0x0125:
            java.lang.String r6 = p067c.p068a.p069a.p070a.p111m2.Util.f8400c
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0170
            java.lang.String r6 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            java.lang.String r2 = "zeroflte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "zerolte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "zenlte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "SC-05G"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "marinelteatt"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "404SC"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "SC-04G"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "SCV31"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0170
        L_0x016f:
            return r0
        L_0x0170:
            java.lang.String r6 = "jflte"
            r2 = 19
            if (r4 > r2) goto L_0x01af
            java.lang.String r3 = "OMX.SEC.vp8.dec"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x01af
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.f8400c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01af
            java.lang.String r1 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            java.lang.String r3 = "d2"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x01ae
            java.lang.String r3 = "serrano"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x01ae
            boolean r3 = r1.startsWith(r6)
            if (r3 != 0) goto L_0x01ae
            java.lang.String r3 = "santos"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x01ae
            java.lang.String r3 = "t0"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L_0x01af
        L_0x01ae:
            return r0
        L_0x01af:
            if (r4 > r2) goto L_0x01c2
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.Util.f8399b
            boolean r4 = r4.startsWith(r6)
            if (r4 == 0) goto L_0x01c2
            java.lang.String r4 = "OMX.qcom.video.decoder.vp8"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01c2
            return r0
        L_0x01c2:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x01d3
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01d3
            return r0
        L_0x01d3:
            r4 = 1
            return r4
        L_0x01d5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.MediaCodecUtil.m8600x(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }

    /* renamed from: y */
    private static boolean m8601y(MediaCodecInfo mediaCodecInfo) {
        if (Util.f8398a >= 29) {
            return m8602z(mediaCodecInfo);
        }
        return !m8564A(mediaCodecInfo);
    }

    /* renamed from: z */
    private static boolean m8602z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }
}
