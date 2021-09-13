package p067c.p068a.p069a.p070a.p111m2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p072b2.AacUtil;

/* renamed from: c.a.a.a.m2.w */
public final class MimeTypes {

    /* renamed from: a */
    private static final ArrayList<C1198a> f8434a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f8435b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: c.a.a.a.m2.w$a */
    /* compiled from: MimeTypes */
    private static final class C1198a {

        /* renamed from: a */
        public final String f8436a;

        /* renamed from: b */
        public final String f8437b;

        /* renamed from: c */
        public final int f8438c;
    }

    /* renamed from: c.a.a.a.m2.w$b */
    /* compiled from: MimeTypes */
    static final class C1199b {

        /* renamed from: a */
        public final int f8439a;

        /* renamed from: b */
        public final int f8440b;

        public C1199b(int i, int i2) {
            this.f8439a = i;
            this.f8440b = i2;
        }
    }

    /* renamed from: a */
    public static boolean m10395a(String str, String str2) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null) {
                    return false;
                }
                C1199b i = m10403i(str2);
                if (i == null) {
                    return false;
                }
                int c2 = AacUtil.m6620c(i.f8440b);
                if (!(c2 == 0 || c2 == 16)) {
                    z = true;
                }
                return z;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m10396b(String str, String str2) {
        return m10398d(str, str2) != null;
    }

    /* renamed from: c */
    public static String m10397c(String str) {
        if (str == null) {
            return null;
        }
        for (String g : Util.m10248F0(str)) {
            String g2 = m10401g(g);
            if (g2 != null && m10409o(g2)) {
                return g2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m10398d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] F0 = Util.m10248F0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : F0) {
            if (str2.equals(m10401g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: e */
    private static String m10399e(String str) {
        int size = f8434a.size();
        for (int i = 0; i < size; i++) {
            C1198a aVar = (C1198a) f8434a.get(i);
            if (str.startsWith(aVar.f8437b)) {
                return aVar.f8436a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m10400f(String str, String str2) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null) {
                    return 0;
                }
                C1199b i = m10403i(str2);
                if (i == null) {
                    return 0;
                }
                return AacUtil.m6620c(i.f8440b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: g */
    public static String m10401g(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String J0 = Util.m10256J0(str.trim());
        if (J0.startsWith("avc1") || J0.startsWith("avc3")) {
            return "video/avc";
        }
        if (J0.startsWith("hev1") || J0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (J0.startsWith("dvav") || J0.startsWith("dva1") || J0.startsWith("dvhe") || J0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (J0.startsWith("av01")) {
            return "video/av01";
        }
        if (J0.startsWith("vp9") || J0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (J0.startsWith("vp8") || J0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (J0.startsWith("mp4a")) {
            if (J0.startsWith("mp4a.")) {
                C1199b i = m10403i(J0);
                if (i != null) {
                    str2 = m10402h(i.f8439a);
                }
            }
            if (str2 == null) {
                str2 = "audio/mp4a-latm";
            }
            return str2;
        } else if (J0.startsWith("ac-3") || J0.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (J0.startsWith("ec-3") || J0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (J0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (J0.startsWith("ac-4") || J0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (J0.startsWith("dtsc") || J0.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (J0.startsWith("dtsh") || J0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (J0.startsWith("opus")) {
                return "audio/opus";
            }
            if (J0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (J0.startsWith("flac")) {
                return "audio/flac";
            }
            if (J0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (J0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (J0.contains("cea708")) {
                return "application/cea-708";
            }
            return (J0.contains("eia608") || J0.contains("cea608")) ? "application/cea-608" : m10399e(J0);
        }
    }

    /* renamed from: h */
    public static String m10402h(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i != 64) {
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return "audio/mp4a-latm";
    }

    /* renamed from: i */
    static C1199b m10403i(String str) {
        Matcher matcher = f8435b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) Assertions.m10153e(matcher.group(1));
        String group = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            }
            return new C1199b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static String m10404j(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: k */
    public static int m10405k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m10409o(str)) {
            return 1;
        }
        if (m10411q(str)) {
            return 2;
        }
        if (m10410p(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m10406l(str);
    }

    /* renamed from: l */
    private static int m10406l(String str) {
        int size = f8434a.size();
        for (int i = 0; i < size; i++) {
            C1198a aVar = (C1198a) f8434a.get(i);
            if (str.equals(aVar.f8436a)) {
                return aVar.f8438c;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static int m10407m(String str) {
        return m10405k(m10401g(str));
    }

    /* renamed from: n */
    public static String m10408n(String str) {
        if (str == null) {
            return null;
        }
        for (String g : Util.m10248F0(str)) {
            String g2 = m10401g(g);
            if (g2 != null && m10411q(g2)) {
                return g2;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m10409o(String str) {
        return "audio".equals(m10404j(str));
    }

    /* renamed from: p */
    public static boolean m10410p(String str) {
        return "text".equals(m10404j(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: q */
    public static boolean m10411q(String str) {
        return "video".equals(m10404j(str));
    }

    /* renamed from: r */
    public static String m10412r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
