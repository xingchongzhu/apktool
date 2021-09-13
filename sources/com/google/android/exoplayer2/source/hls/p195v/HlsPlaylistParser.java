package com.google.android.exoplayer2.source.hls.p195v;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist.C1840b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1842b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1843c;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1844d;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1846f;
import com.google.android.exoplayer2.upstream.ParsingLoadable.C1908a;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b;
import p067c.p068a.p069a.p070a.p076f2.p083k0.PsshAtomUtil;
import p067c.p068a.p069a.p070a.p097j2.UnrecognizedInputFormatException;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.UriUtil;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.Iterables;

/* renamed from: com.google.android.exoplayer2.source.hls.v.i */
public final class HlsPlaylistParser implements C1908a<HlsPlaylist> {

    /* renamed from: A */
    private static final Pattern f11837A = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: B */
    private static final Pattern f11838B = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: C */
    private static final Pattern f11839C = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: D */
    private static final Pattern f11840D = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: E */
    private static final Pattern f11841E = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: F */
    private static final Pattern f11842F = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: G */
    private static final Pattern f11843G = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: H */
    private static final Pattern f11844H = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: I */
    private static final Pattern f11845I = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f11846J = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: K */
    private static final Pattern f11847K = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: L */
    private static final Pattern f11848L = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: M */
    private static final Pattern f11849M = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: N */
    private static final Pattern f11850N = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: O */
    private static final Pattern f11851O = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f11852P = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: Q */
    private static final Pattern f11853Q = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: R */
    private static final Pattern f11854R = m14662c("AUTOSELECT");

    /* renamed from: S */
    private static final Pattern f11855S = m14662c("DEFAULT");

    /* renamed from: T */
    private static final Pattern f11856T = m14662c("FORCED");

    /* renamed from: U */
    private static final Pattern f11857U = m14662c("INDEPENDENT");

    /* renamed from: V */
    private static final Pattern f11858V = m14662c("GAP");

    /* renamed from: W */
    private static final Pattern f11859W = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: X */
    private static final Pattern f11860X = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: Y */
    private static final Pattern f11861Y = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: a */
    private static final Pattern f11862a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    private static final Pattern f11863b = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: c */
    private static final Pattern f11864c = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: d */
    private static final Pattern f11865d = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f11866e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f11867f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: g */
    private static final Pattern f11868g = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f11869h = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: i */
    private static final Pattern f11870i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: j */
    private static final Pattern f11871j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: k */
    private static final Pattern f11872k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: l */
    private static final Pattern f11873l = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f11874m = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: n */
    private static final Pattern f11875n = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: o */
    private static final Pattern f11876o = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: p */
    private static final Pattern f11877p = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: q */
    private static final Pattern f11878q = m14662c("CAN-SKIP-DATERANGES");

    /* renamed from: r */
    private static final Pattern f11879r = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: s */
    private static final Pattern f11880s = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: t */
    private static final Pattern f11881t = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: u */
    private static final Pattern f11882u = m14662c("CAN-BLOCK-RELOAD");

    /* renamed from: v */
    private static final Pattern f11883v = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: w */
    private static final Pattern f11884w = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: x */
    private static final Pattern f11885x = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: y */
    private static final Pattern f11886y = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: z */
    private static final Pattern f11887z = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: Z */
    private final HlsMasterPlaylist f11888Z;

    /* renamed from: a0 */
    private final HlsMediaPlaylist f11889a0;

    /* renamed from: com.google.android.exoplayer2.source.hls.v.i$a */
    /* compiled from: HlsPlaylistParser */
    public static final class C1847a extends IOException {
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.i$b */
    /* compiled from: HlsPlaylistParser */
    private static class C1848b {

        /* renamed from: a */
        private final BufferedReader f11890a;

        /* renamed from: b */
        private final Queue<String> f11891b;

        /* renamed from: c */
        private String f11892c;

        public C1848b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f11891b = queue;
            this.f11890a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* renamed from: a */
        public boolean mo14694a() throws IOException {
            String trim;
            if (this.f11892c != null) {
                return true;
            }
            if (!this.f11891b.isEmpty()) {
                this.f11892c = (String) Assertions.m10153e((String) this.f11891b.poll());
                return true;
            }
            do {
                String readLine = this.f11890a.readLine();
                this.f11892c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f11892c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String mo14695b() throws IOException {
            if (mo14694a()) {
                String str = this.f11892c;
                this.f11892c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public HlsPlaylistParser() {
        this(HlsMasterPlaylist.f11773d, null);
    }

    /* renamed from: A */
    private static String m14659A(String str, Map<String, String> map) {
        Matcher matcher = f11861Y.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: B */
    private static int m14660B(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.m10298k0(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: b */
    private static boolean m14661b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int B = m14660B(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (B != "#EXTM3U".charAt(i)) {
                return false;
            }
            B = bufferedReader.read();
        }
        return Util.m10298k0(m14660B(bufferedReader, false, B));
    }

    /* renamed from: c */
    private static Pattern m14662c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=(");
        sb.append("NO");
        sb.append("|");
        sb.append("YES");
        sb.append(")");
        return Pattern.compile(sb.toString());
    }

    /* renamed from: d */
    private static DrmInitData m14663d(String str, C0894b[] bVarArr) {
        C0894b[] bVarArr2 = new C0894b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = bVarArr[i].mo6111l(null);
        }
        return new DrmInitData(str, bVarArr2);
    }

    /* renamed from: e */
    private static String m14664e(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* renamed from: f */
    private static C1840b m14665f(ArrayList<C1840b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1840b bVar = (C1840b) arrayList.get(i);
            if (str.equals(bVar.f11791d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static C1840b m14666g(ArrayList<C1840b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1840b bVar = (C1840b) arrayList.get(i);
            if (str.equals(bVar.f11792e)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    private static C1840b m14667h(ArrayList<C1840b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1840b bVar = (C1840b) arrayList.get(i);
            if (str.equals(bVar.f11790c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    private static double m14668j(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(m14684z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    private static C0894b m14669k(String str, String str2, Map<String, String> map) throws ParserException {
        Pattern pattern = f11844H;
        String str3 = SdkVersion.MINI_VERSION;
        String u = m14679u(str, pattern, str3, map);
        String str4 = "video/mp4";
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z = m14684z(str, f11845I, map);
            return new C0894b(C.f7373d, str4, Base64.decode(z.substring(z.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new C0894b(C.f7373d, "hls", Util.m10290g0(str));
        } else if (!"com.microsoft.playready".equals(str2) || !str3.equals(u)) {
            return null;
        } else {
            String z2 = m14684z(str, f11845I, map);
            byte[] decode = Base64.decode(z2.substring(z2.indexOf(44)), 0);
            UUID uuid = C.f7374e;
            return new C0894b(uuid, str4, PsshAtomUtil.m7822a(uuid, decode));
        }
    }

    /* renamed from: l */
    private static String m14670l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: m */
    private static int m14671m(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(m14684z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    private static long m14672n(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(m14684z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0458, code lost:
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x04a0, code lost:
        r0 = r0 + 1;
        r31 = r6;
        r32 = r8;
        r33 = r14;
        r15 = r20;
        r8 = r22;
        r6 = null;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist m14673o(com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistParser.C1848b r36, java.lang.String r37) throws java.io.IOException {
        /*
            r1 = r37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
            r13 = 0
        L_0x0036:
            boolean r14 = r36.mo14694a()
            java.lang.String r15 = "application/x-mpegURL"
            if (r14 == 0) goto L_0x021f
            java.lang.String r14 = r36.mo14695b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r14.startsWith(r9)
            if (r9 == 0) goto L_0x004d
            r8.add(r14)
        L_0x004d:
            java.lang.String r9 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r9 = r14.startsWith(r9)
            r19 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x006d
            java.util.regex.Pattern r9 = f11850N
            java.lang.String r9 = m14684z(r14, r9, r11)
            java.util.regex.Pattern r10 = f11859W
            java.lang.String r10 = m14684z(r14, r10, r11)
            r11.put(r9, r10)
            goto L_0x00ce
        L_0x006d:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x0087
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = 1
            goto L_0x0204
        L_0x0087:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x0093
            r3.add(r14)
            goto L_0x00ce
        L_0x0093:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x00c3
            java.util.regex.Pattern r9 = f11843G
            java.lang.String r10 = "identity"
            java.lang.String r9 = m14679u(r14, r9, r10, r11)
            c.a.a.a.e2.t$b r9 = m14669k(r14, r9, r11)
            if (r9 == 0) goto L_0x00ce
            java.util.regex.Pattern r10 = f11842F
            java.lang.String r10 = m14684z(r14, r10, r11)
            java.lang.String r10 = m14670l(r10)
            c.a.a.a.e2.t r14 = new c.a.a.a.e2.t
            r15 = 1
            c.a.a.a.e2.t$b[] r15 = new p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b[r15]
            r16 = 0
            r15[r16] = r9
            r14.<init>(r10, r15)
            r12.add(r14)
            goto L_0x00ce
        L_0x00c3:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r14.startsWith(r10)
            if (r10 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00ce
            goto L_0x00e1
        L_0x00ce:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = r19
            goto L_0x0204
        L_0x00e1:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r14.contains(r10)
            r13 = r13 | r10
            if (r9 == 0) goto L_0x00ef
            r10 = 16384(0x4000, float:2.2959E-41)
            r20 = r13
            goto L_0x00f2
        L_0x00ef:
            r20 = r13
            r10 = 0
        L_0x00f2:
            java.util.regex.Pattern r13 = f11867f
            int r13 = m14671m(r14, r13)
            r28 = r12
            java.util.regex.Pattern r12 = f11862a
            r29 = r7
            r7 = -1
            int r12 = m14677s(r14, r12, r7)
            java.util.regex.Pattern r7 = f11869h
            java.lang.String r7 = m14680v(r14, r7, r11)
            r30 = r8
            java.util.regex.Pattern r8 = f11870i
            java.lang.String r8 = m14680v(r14, r8, r11)
            if (r8 == 0) goto L_0x0139
            r31 = r6
            java.lang.String r6 = "x"
            java.lang.String[] r6 = p067c.p068a.p069a.p070a.p111m2.Util.m10244D0(r8, r6)
            r8 = 0
            r21 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r21)
            r18 = 1
            r6 = r6[r18]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r8 <= 0) goto L_0x0132
            if (r6 > 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r17 = r8
            goto L_0x0135
        L_0x0132:
            r6 = -1
            r17 = -1
        L_0x0135:
            r8 = r6
            r6 = r17
            goto L_0x013d
        L_0x0139:
            r31 = r6
            r6 = -1
            r8 = -1
        L_0x013d:
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            r32 = r5
            java.util.regex.Pattern r5 = f11871j
            java.lang.String r5 = m14680v(r14, r5, r11)
            if (r5 == 0) goto L_0x0152
            float r17 = java.lang.Float.parseFloat(r5)
            r33 = r4
            r5 = r17
            goto L_0x0156
        L_0x0152:
            r33 = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0156:
            java.util.regex.Pattern r4 = f11863b
            java.lang.String r4 = m14680v(r14, r4, r11)
            r34 = r3
            java.util.regex.Pattern r3 = f11864c
            java.lang.String r3 = m14680v(r14, r3, r11)
            r35 = r0
            java.util.regex.Pattern r0 = f11865d
            java.lang.String r0 = m14680v(r14, r0, r11)
            r17 = r0
            java.util.regex.Pattern r0 = f11866e
            java.lang.String r0 = m14680v(r14, r0, r11)
            if (r9 == 0) goto L_0x0181
            java.util.regex.Pattern r9 = f11845I
            java.lang.String r9 = m14684z(r14, r9, r11)
            android.net.Uri r9 = p067c.p068a.p069a.p070a.p111m2.UriUtil.m10226d(r1, r9)
            goto L_0x0193
        L_0x0181:
            boolean r9 = r36.mo14694a()
            if (r9 == 0) goto L_0x0217
            java.lang.String r9 = r36.mo14695b()
            java.lang.String r9 = m14659A(r9, r11)
            android.net.Uri r9 = p067c.p068a.p069a.p070a.p111m2.UriUtil.m10226d(r1, r9)
        L_0x0193:
            c.a.a.a.u0$b r14 = new c.a.a.a.u0$b
            r14.<init>()
            int r1 = r2.size()
            c.a.a.a.u0$b r1 = r14.mo7692R(r1)
            c.a.a.a.u0$b r1 = r1.mo7685K(r15)
            c.a.a.a.u0$b r1 = r1.mo7683I(r7)
            c.a.a.a.u0$b r1 = r1.mo7681G(r12)
            c.a.a.a.u0$b r1 = r1.mo7700Z(r13)
            c.a.a.a.u0$b r1 = r1.mo7710j0(r6)
            c.a.a.a.u0$b r1 = r1.mo7691Q(r8)
            c.a.a.a.u0$b r1 = r1.mo7690P(r5)
            c.a.a.a.u0$b r1 = r1.mo7703c0(r10)
            c.a.a.a.u0 r23 = r1.mo7679E()
            com.google.android.exoplayer2.source.hls.v.f$b r1 = new com.google.android.exoplayer2.source.hls.v.f$b
            r21 = r1
            r22 = r9
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            r1 = r35
            java.lang.Object r5 = r1.get(r9)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x01ea
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r9, r5)
        L_0x01ea:
            com.google.android.exoplayer2.source.hls.r$b r6 = new com.google.android.exoplayer2.source.hls.r$b
            r21 = r6
            r22 = r12
            r23 = r13
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r6)
            r10 = r19
            r13 = r20
        L_0x0204:
            r0 = r1
            r12 = r28
            r7 = r29
            r8 = r30
            r6 = r31
            r5 = r32
            r4 = r33
            r3 = r34
            r1 = r37
            goto L_0x0036
        L_0x0217:
            c.a.a.a.g1 r0 = new c.a.a.a.g1
            java.lang.String r1 = "#EXT-X-STREAM-INF must be followed by another line"
            r0.<init>(r1)
            throw r0
        L_0x021f:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r19 = r10
            r28 = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L_0x023b:
            int r5 = r2.size()
            r6 = 0
            if (r4 >= r5) goto L_0x0292
            java.lang.Object r5 = r2.get(r4)
            com.google.android.exoplayer2.source.hls.v.f$b r5 = (com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist.C1840b) r5
            android.net.Uri r7 = r5.f11788a
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L_0x028f
            c.a.a.a.u0 r7 = r5.f11789b
            c.a.a.a.h2.a r7 = r7.f8812j
            if (r7 != 0) goto L_0x0258
            r7 = 1
            goto L_0x0259
        L_0x0258:
            r7 = 0
        L_0x0259:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r7)
            com.google.android.exoplayer2.source.hls.r r7 = new com.google.android.exoplayer2.source.hls.r
            android.net.Uri r8 = r5.f11788a
            java.lang.Object r8 = r1.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r8)
            java.util.List r8 = (java.util.List) r8
            r7.<init>(r6, r6, r8)
            c.a.a.a.h2.a r6 = new c.a.a.a.h2.a
            r8 = 1
            c.a.a.a.h2.a$b[] r9 = new p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b[r8]
            r8 = 0
            r9[r8] = r7
            r6.<init>(r9)
            c.a.a.a.u0 r7 = r5.f11789b
            c.a.a.a.u0$b r7 = r7.mo7668l()
            c.a.a.a.u0$b r6 = r7.mo7698X(r6)
            c.a.a.a.u0 r6 = r6.mo7679E()
            com.google.android.exoplayer2.source.hls.v.f$b r5 = r5.mo14683a(r6)
            r3.add(r5)
        L_0x028f:
            int r4 = r4 + 1
            goto L_0x023b
        L_0x0292:
            r1 = r6
            r8 = r1
            r0 = 0
        L_0x0295:
            int r4 = r34.size()
            if (r0 >= r4) goto L_0x04af
            r4 = r34
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r7 = f11851O
            java.lang.String r7 = m14684z(r5, r7, r11)
            java.util.regex.Pattern r9 = f11850N
            java.lang.String r9 = m14684z(r5, r9, r11)
            c.a.a.a.u0$b r10 = new c.a.a.a.u0$b
            r10.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            java.lang.String r14 = ":"
            r12.append(r14)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            c.a.a.a.u0$b r10 = r10.mo7693S(r12)
            c.a.a.a.u0$b r10 = r10.mo7695U(r9)
            c.a.a.a.u0$b r10 = r10.mo7685K(r15)
            int r12 = m14682x(r5)
            c.a.a.a.u0$b r10 = r10.mo7707g0(r12)
            int r12 = m14681w(r5, r11)
            c.a.a.a.u0$b r10 = r10.mo7703c0(r12)
            java.util.regex.Pattern r12 = f11849M
            java.lang.String r12 = m14680v(r5, r12, r11)
            c.a.a.a.u0$b r10 = r10.mo7696V(r12)
            java.util.regex.Pattern r12 = f11845I
            java.lang.String r12 = m14680v(r5, r12, r11)
            r14 = r37
            if (r12 != 0) goto L_0x02fa
            r12 = r6
            goto L_0x02fe
        L_0x02fa:
            android.net.Uri r12 = p067c.p068a.p069a.p070a.p111m2.UriUtil.m10226d(r14, r12)
        L_0x02fe:
            c.a.a.a.h2.a r6 = new c.a.a.a.h2.a
            r34 = r4
            r4 = 1
            c.a.a.a.h2.a$b[] r14 = new p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b[r4]
            com.google.android.exoplayer2.source.hls.r r4 = new com.google.android.exoplayer2.source.hls.r
            r20 = r15
            java.util.List r15 = java.util.Collections.emptyList()
            r4.<init>(r7, r9, r15)
            r15 = 0
            r14[r15] = r4
            r6.<init>(r14)
            java.util.regex.Pattern r4 = f11847K
            java.lang.String r4 = m14684z(r5, r4, r11)
            r4.hashCode()
            int r14 = r4.hashCode()
            r15 = 2
            switch(r14) {
                case -959297733: goto L_0x034a;
                case -333210994: goto L_0x033f;
                case 62628790: goto L_0x0334;
                case 81665115: goto L_0x0329;
                default: goto L_0x0327;
            }
        L_0x0327:
            r4 = -1
            goto L_0x0354
        L_0x0329:
            java.lang.String r14 = "VIDEO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0332
            goto L_0x0327
        L_0x0332:
            r4 = 3
            goto L_0x0354
        L_0x0334:
            java.lang.String r14 = "AUDIO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x033d
            goto L_0x0327
        L_0x033d:
            r4 = 2
            goto L_0x0354
        L_0x033f:
            java.lang.String r14 = "CLOSED-CAPTIONS"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0348
            goto L_0x0327
        L_0x0348:
            r4 = 1
            goto L_0x0354
        L_0x034a:
            java.lang.String r14 = "SUBTITLES"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0353
            goto L_0x0327
        L_0x0353:
            r4 = 0
        L_0x0354:
            switch(r4) {
                case 0: goto L_0x045b;
                case 1: goto L_0x0417;
                case 2: goto L_0x03a9;
                case 3: goto L_0x0363;
                default: goto L_0x0357;
            }
        L_0x0357:
            r22 = r8
            r6 = r31
            r8 = r32
            r14 = r33
        L_0x035f:
            r16 = 0
            goto L_0x04a0
        L_0x0363:
            com.google.android.exoplayer2.source.hls.v.f$b r4 = m14667h(r2, r7)
            if (r4 == 0) goto L_0x038e
            c.a.a.a.u0 r4 = r4.f11789b
            java.lang.String r5 = r4.f8811i
            java.lang.String r5 = p067c.p068a.p069a.p070a.p111m2.Util.m10249G(r5, r15)
            c.a.a.a.u0$b r14 = r10.mo7683I(r5)
            java.lang.String r5 = p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10401g(r5)
            c.a.a.a.u0$b r5 = r14.mo7705e0(r5)
            int r14 = r4.f8819q
            c.a.a.a.u0$b r5 = r5.mo7710j0(r14)
            int r14 = r4.f8820r
            c.a.a.a.u0$b r5 = r5.mo7691Q(r14)
            float r4 = r4.f8821s
            r5.mo7690P(r4)
        L_0x038e:
            if (r12 != 0) goto L_0x0391
            goto L_0x0357
        L_0x0391:
            r10.mo7698X(r6)
            com.google.android.exoplayer2.source.hls.v.f$a r4 = new com.google.android.exoplayer2.source.hls.v.f$a
            c.a.a.a.u0 r5 = r10.mo7679E()
            r4.<init>(r12, r5, r7, r9)
            r14 = r33
            r14.add(r4)
            r22 = r8
            r6 = r31
            r8 = r32
            goto L_0x035f
        L_0x03a9:
            r14 = r33
            com.google.android.exoplayer2.source.hls.v.f$b r4 = m14665f(r2, r7)
            if (r4 == 0) goto L_0x03c4
            c.a.a.a.u0 r15 = r4.f11789b
            java.lang.String r15 = r15.f8811i
            r22 = r8
            r8 = 1
            java.lang.String r15 = p067c.p068a.p069a.p070a.p111m2.Util.m10249G(r15, r8)
            r10.mo7683I(r15)
            java.lang.String r15 = p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10401g(r15)
            goto L_0x03c7
        L_0x03c4:
            r22 = r8
            r15 = 0
        L_0x03c7:
            java.util.regex.Pattern r8 = f11868g
            java.lang.String r5 = m14680v(r5, r8, r11)
            if (r5 == 0) goto L_0x03f3
            java.lang.String r8 = "/"
            java.lang.String[] r8 = p067c.p068a.p069a.p070a.p111m2.Util.m10246E0(r5, r8)
            r16 = 0
            r8 = r8[r16]
            int r8 = java.lang.Integer.parseInt(r8)
            r10.mo7682H(r8)
            java.lang.String r8 = "audio/eac3"
            boolean r8 = r8.equals(r15)
            if (r8 == 0) goto L_0x03f5
            java.lang.String r8 = "/JOC"
            boolean r5 = r5.endsWith(r8)
            if (r5 == 0) goto L_0x03f5
            java.lang.String r15 = "audio/eac3-joc"
            goto L_0x03f5
        L_0x03f3:
            r16 = 0
        L_0x03f5:
            r10.mo7705e0(r15)
            if (r12 == 0) goto L_0x040c
            r10.mo7698X(r6)
            com.google.android.exoplayer2.source.hls.v.f$a r4 = new com.google.android.exoplayer2.source.hls.v.f$a
            c.a.a.a.u0 r5 = r10.mo7679E()
            r4.<init>(r12, r5, r7, r9)
            r8 = r32
            r8.add(r4)
            goto L_0x0458
        L_0x040c:
            r8 = r32
            if (r4 == 0) goto L_0x0458
            c.a.a.a.u0 r4 = r10.mo7679E()
            r22 = r4
            goto L_0x0458
        L_0x0417:
            r22 = r8
            r8 = r32
            r14 = r33
            r16 = 0
            java.util.regex.Pattern r4 = f11853Q
            java.lang.String r4 = m14684z(r5, r4, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0438
            java.lang.String r4 = r4.substring(r15)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-608"
            goto L_0x0443
        L_0x0438:
            r5 = 7
            java.lang.String r4 = r4.substring(r5)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-708"
        L_0x0443:
            if (r1 != 0) goto L_0x044a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x044a:
            c.a.a.a.u0$b r5 = r10.mo7705e0(r5)
            r5.mo7680F(r4)
            c.a.a.a.u0 r4 = r10.mo7679E()
            r1.add(r4)
        L_0x0458:
            r6 = r31
            goto L_0x04a0
        L_0x045b:
            r22 = r8
            r8 = r32
            r14 = r33
            r16 = 0
            com.google.android.exoplayer2.source.hls.v.f$b r4 = m14666g(r2, r7)
            if (r4 == 0) goto L_0x047a
            c.a.a.a.u0 r4 = r4.f11789b
            java.lang.String r4 = r4.f8811i
            r5 = 3
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.Util.m10249G(r4, r5)
            r10.mo7683I(r4)
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10401g(r4)
            goto L_0x047b
        L_0x047a:
            r4 = 0
        L_0x047b:
            if (r4 != 0) goto L_0x047f
            java.lang.String r4 = "text/vtt"
        L_0x047f:
            c.a.a.a.u0$b r4 = r10.mo7705e0(r4)
            r4.mo7698X(r6)
            if (r12 == 0) goto L_0x0497
            com.google.android.exoplayer2.source.hls.v.f$a r4 = new com.google.android.exoplayer2.source.hls.v.f$a
            c.a.a.a.u0 r5 = r10.mo7679E()
            r4.<init>(r12, r5, r7, r9)
            r6 = r31
            r6.add(r4)
            goto L_0x04a0
        L_0x0497:
            r6 = r31
            java.lang.String r4 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r4, r5)
        L_0x04a0:
            int r0 = r0 + 1
            r31 = r6
            r32 = r8
            r33 = r14
            r15 = r20
            r8 = r22
            r6 = 0
            goto L_0x0295
        L_0x04af:
            r22 = r8
            r6 = r31
            r8 = r32
            r14 = r33
            if (r13 == 0) goto L_0x04bf
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x04c0
        L_0x04bf:
            r9 = r1
        L_0x04c0:
            com.google.android.exoplayer2.source.hls.v.f r13 = new com.google.android.exoplayer2.source.hls.v.f
            r0 = r13
            r1 = r37
            r2 = r30
            r4 = r14
            r5 = r8
            r7 = r29
            r8 = r22
            r10 = r19
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistParser.m14673o(com.google.android.exoplayer2.source.hls.v.i$b, java.lang.String):com.google.android.exoplayer2.source.hls.v.f");
    }

    /* renamed from: p */
    private static HlsMediaPlaylist m14674p(HlsMasterPlaylist fVar, HlsMediaPlaylist gVar, C1848b bVar, String str) throws IOException {
        HashMap hashMap;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList;
        boolean z;
        long j;
        long j2;
        C1844d dVar;
        DrmInitData tVar;
        long j3;
        ArrayList arrayList2;
        boolean z2;
        String str8;
        String str9;
        HlsMasterPlaylist fVar2 = fVar;
        HlsMediaPlaylist gVar2 = gVar;
        boolean z3 = fVar2.f11836c;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        List arrayList4 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        C1846f fVar3 = new C1846f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str10 = "";
        char c = 0;
        boolean z4 = z3;
        C1846f fVar4 = fVar3;
        String str11 = str10;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        boolean z5 = false;
        int i = 0;
        long j12 = -9223372036854775807L;
        int i2 = 0;
        int i3 = 1;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        boolean z6 = false;
        DrmInitData tVar2 = null;
        DrmInitData tVar3 = null;
        boolean z7 = false;
        C1842b bVar2 = null;
        String str12 = null;
        long j15 = -1;
        String str13 = null;
        String str14 = null;
        int i4 = 0;
        boolean z8 = false;
        C1844d dVar2 = null;
        while (bVar.mo14694a()) {
            String b = bVar.mo14695b();
            if (b.startsWith("#EXT")) {
                arrayList5.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z9 = m14684z(b, f11876o, hashMap2);
                if ("VOD".equals(z9)) {
                    i = 1;
                } else if ("EVENT".equals(z9)) {
                    i = 2;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z8 = true;
            } else if (b.startsWith("#EXT-X-START")) {
                j12 = (long) (m14668j(b, f11837A) * 1000000.0d);
            } else if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar4 = m14683y(b);
            } else if (b.startsWith("#EXT-X-PART-INF")) {
                j14 = (long) (m14668j(b, f11874m) * 1000000.0d);
            } else {
                String str15 = "@";
                if (b.startsWith("#EXT-X-MAP")) {
                    String z10 = m14684z(b, f11845I, hashMap2);
                    String v = m14680v(b, f11839C, hashMap2);
                    if (v != null) {
                        String[] D0 = Util.m10244D0(v, str15);
                        j15 = Long.parseLong(D0[c]);
                        if (D0.length > 1) {
                            j6 = Long.parseLong(D0[1]);
                        }
                    }
                    if (j15 == -1) {
                        j6 = 0;
                    }
                    String str16 = str12;
                    String str17 = str13;
                    if (str16 == null || str17 != null) {
                        dVar2 = new C1844d(z10, j6, j15, str16, str17);
                        if (j15 != -1) {
                            j6 += j15;
                        }
                        str13 = str17;
                        str12 = str16;
                        j15 = -1;
                    } else {
                        throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                } else {
                    String str18 = str12;
                    String str19 = str13;
                    if (b.startsWith("#EXT-X-TARGETDURATION")) {
                        j13 = 1000000 * ((long) m14671m(b, f11872k));
                    } else if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j9 = m14672n(b, f11883v);
                        str12 = str18;
                        j5 = j9;
                        str8 = str19;
                        c = 0;
                    } else if (b.startsWith("#EXT-X-VERSION")) {
                        i3 = m14671m(b, f11875n);
                    } else {
                        if (b.startsWith("#EXT-X-DEFINE")) {
                            String v2 = m14680v(b, f11860X, hashMap2);
                            if (v2 != null) {
                                String str20 = (String) fVar2.f11782m.get(v2);
                                if (str20 != null) {
                                    hashMap2.put(v2, str20);
                                }
                            } else {
                                hashMap2.put(m14684z(b, f11850N, hashMap2), m14684z(b, f11859W, hashMap2));
                            }
                            z = z5;
                            str2 = str10;
                            hashMap = hashMap4;
                            str5 = str14;
                            j = j9;
                            str4 = str19;
                            arrayList = arrayList5;
                        } else if (b.startsWith("#EXTINF")) {
                            long j16 = (long) (m14668j(b, f11884w) * 1000000.0d);
                            str11 = m14679u(b, f11885x, str10, hashMap2);
                            fVar2 = fVar;
                            j10 = j16;
                        } else {
                            if (b.startsWith("#EXT-X-SKIP")) {
                                int m = m14671m(b, f11879r);
                                Assertions.m10154f(gVar2 != null && arrayList3.isEmpty());
                                int i5 = (int) (j5 - ((HlsMediaPlaylist) Util.m10293i(gVar)).f11799i);
                                int i6 = m + i5;
                                if (i5 < 0 || i6 > gVar2.f11806p.size()) {
                                    throw new C1847a();
                                }
                                String str21 = str10;
                                long j17 = j8;
                                str8 = str19;
                                while (i5 < i6) {
                                    C1844d dVar3 = (C1844d) gVar2.f11806p.get(i5);
                                    HashMap hashMap5 = hashMap4;
                                    if (j5 != gVar2.f11799i) {
                                        dVar3 = dVar3.mo14690b(j17, (gVar2.f11798h - i2) + dVar3.f11821d);
                                    }
                                    arrayList3.add(dVar3);
                                    j17 += dVar3.f11820c;
                                    long j18 = dVar3.f11827j;
                                    int i7 = i6;
                                    if (j18 != -1) {
                                        j6 = dVar3.f11826i + j18;
                                    }
                                    int i8 = dVar3.f11821d;
                                    C1844d dVar4 = dVar3.f11819b;
                                    DrmInitData tVar4 = dVar3.f11823f;
                                    String str22 = dVar3.f11824g;
                                    int i9 = i8;
                                    String str23 = dVar3.f11825h;
                                    C1844d dVar5 = dVar4;
                                    if (str23 == null || !str23.equals(Long.toHexString(j9))) {
                                        str8 = dVar3.f11825h;
                                    }
                                    j9++;
                                    i5++;
                                    gVar2 = gVar;
                                    j7 = j17;
                                    i4 = i9;
                                    i6 = i7;
                                    dVar2 = dVar5;
                                    tVar3 = tVar4;
                                    str18 = str22;
                                    hashMap4 = hashMap5;
                                }
                                fVar2 = fVar;
                                gVar2 = gVar;
                                j8 = j17;
                                str12 = str18;
                                str10 = str21;
                            } else {
                                str2 = str10;
                                hashMap = hashMap4;
                                if (b.startsWith("#EXT-X-KEY")) {
                                    String z11 = m14684z(b, f11842F, hashMap2);
                                    String str24 = "identity";
                                    String u = m14679u(b, f11843G, str24, hashMap2);
                                    if ("NONE".equals(z11)) {
                                        treeMap.clear();
                                        str9 = null;
                                        tVar3 = null;
                                        str13 = null;
                                    } else {
                                        String v3 = m14680v(b, f11846J, hashMap2);
                                        if (!str24.equals(u)) {
                                            String str25 = str14;
                                            str14 = str25 == null ? m14670l(z11) : str25;
                                            C0894b k = m14669k(b, u, hashMap2);
                                            if (k != null) {
                                                treeMap.put(u, k);
                                                str13 = v3;
                                                str9 = null;
                                                tVar3 = null;
                                            }
                                        } else if ("AES-128".equals(z11)) {
                                            str9 = m14684z(b, f11845I, hashMap2);
                                            str13 = v3;
                                        }
                                        str13 = v3;
                                        str9 = null;
                                    }
                                    gVar2 = gVar;
                                    str12 = str9;
                                    str10 = str2;
                                    hashMap4 = hashMap;
                                    c = 0;
                                    fVar2 = fVar;
                                } else {
                                    str5 = str14;
                                    if (b.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] D02 = Util.m10244D0(m14684z(b, f11838B, hashMap2), str15);
                                        j15 = Long.parseLong(D02[0]);
                                        if (D02.length > 1) {
                                            j6 = Long.parseLong(D02[1]);
                                        }
                                    } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i2 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                        fVar2 = fVar;
                                        gVar2 = gVar;
                                        str14 = str5;
                                        str12 = str18;
                                        str8 = str19;
                                        str10 = str2;
                                        hashMap4 = hashMap;
                                        z5 = true;
                                    } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                        i4++;
                                    } else if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (j4 == 0) {
                                            j4 = C.m8860c(Util.m10324x0(b.substring(b.indexOf(58) + 1))) - j8;
                                        } else {
                                            z = z5;
                                            arrayList = arrayList5;
                                            j = j9;
                                            str4 = str19;
                                        }
                                    } else if (b.equals("#EXT-X-GAP")) {
                                        fVar2 = fVar;
                                        gVar2 = gVar;
                                        str14 = str5;
                                        str12 = str18;
                                        str13 = str19;
                                        str10 = str2;
                                        hashMap4 = hashMap;
                                        c = 0;
                                        z7 = true;
                                    } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        fVar2 = fVar;
                                        gVar2 = gVar;
                                        str14 = str5;
                                        str12 = str18;
                                        str13 = str19;
                                        str10 = str2;
                                        hashMap4 = hashMap;
                                        c = 0;
                                        z4 = true;
                                    } else if (b.equals("#EXT-X-ENDLIST")) {
                                        fVar2 = fVar;
                                        gVar2 = gVar;
                                        str14 = str5;
                                        str12 = str18;
                                        str13 = str19;
                                        str10 = str2;
                                        hashMap4 = hashMap;
                                        c = 0;
                                        z6 = true;
                                    } else {
                                        if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long t = m14678t(b, f11886y, (j5 + ((long) arrayList3.size())) - (arrayList4.isEmpty() ? 1 : 0));
                                            int s = m14677s(b, f11887z, j14 != -9223372036854775807L ? (arrayList4.isEmpty() ? ((C1844d) Iterables.m12008c(arrayList3)).f11817m : arrayList4).size() - 1 : -1);
                                            Uri parse = Uri.parse(UriUtil.m10225c(str, m14684z(b, f11845I, hashMap2)));
                                            hashMap.put(parse, new C1843c(parse, t, s));
                                        } else {
                                            String str26 = str;
                                            HashMap hashMap6 = hashMap;
                                            if (b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                C1842b bVar3 = bVar2;
                                                if (bVar3 == null) {
                                                    if ("PART".equals(m14684z(b, f11848L, hashMap2))) {
                                                        String z12 = m14684z(b, f11845I, hashMap2);
                                                        hashMap = hashMap6;
                                                        bVar2 = bVar3;
                                                        long t2 = m14678t(b, f11840D, -1);
                                                        long t3 = m14678t(b, f11841E, -1);
                                                        long j19 = j9;
                                                        str4 = str19;
                                                        String e = m14664e(j19, str18, str4);
                                                        if (tVar3 != null || treeMap.isEmpty()) {
                                                            z2 = z5;
                                                            arrayList2 = arrayList5;
                                                        } else {
                                                            z2 = z5;
                                                            arrayList2 = arrayList5;
                                                            C0894b[] bVarArr = (C0894b[]) treeMap.values().toArray(new C0894b[0]);
                                                            DrmInitData tVar5 = new DrmInitData(str5, bVarArr);
                                                            if (tVar2 == null) {
                                                                tVar2 = m14663d(str5, bVarArr);
                                                            }
                                                            tVar3 = tVar5;
                                                        }
                                                        if (t2 == -1 || t3 != -1) {
                                                            bVar2 = new C1842b(z12, dVar2, 0, i4, j7, tVar3, str18, e, t2 != -1 ? t2 : 0, t3, false, false, true);
                                                        }
                                                        j9 = j19;
                                                        str3 = str18;
                                                        z5 = z2;
                                                        arrayList5 = arrayList2;
                                                        c = 0;
                                                        fVar2 = fVar;
                                                        gVar2 = gVar;
                                                        str6 = str5;
                                                        str7 = str4;
                                                        str10 = str2;
                                                        hashMap4 = hashMap;
                                                    }
                                                }
                                                hashMap = hashMap6;
                                                bVar2 = bVar3;
                                            } else {
                                                hashMap = hashMap6;
                                                z = z5;
                                                arrayList = arrayList5;
                                                long j20 = j9;
                                                str4 = str19;
                                                if (b.startsWith("#EXT-X-PART")) {
                                                    String e2 = m14664e(j20, str18, str4);
                                                    String z13 = m14684z(b, f11845I, hashMap2);
                                                    long j21 = j20;
                                                    long j22 = (long) (m14668j(b, f11873l) * 1000000.0d);
                                                    boolean q = m14675q(b, f11857U, false) | (z4 && arrayList4.isEmpty());
                                                    boolean q2 = m14675q(b, f11858V, false);
                                                    String v4 = m14680v(b, f11839C, hashMap2);
                                                    if (v4 != null) {
                                                        String[] D03 = Util.m10244D0(v4, str15);
                                                        j3 = Long.parseLong(D03[0]);
                                                        if (D03.length > 1) {
                                                            j11 = Long.parseLong(D03[1]);
                                                        }
                                                    } else {
                                                        j3 = -1;
                                                    }
                                                    if (j3 == -1) {
                                                        j11 = 0;
                                                    }
                                                    if (tVar3 == null && !treeMap.isEmpty()) {
                                                        C0894b[] bVarArr2 = (C0894b[]) treeMap.values().toArray(new C0894b[0]);
                                                        DrmInitData tVar6 = new DrmInitData(str5, bVarArr2);
                                                        if (tVar2 == null) {
                                                            tVar2 = m14663d(str5, bVarArr2);
                                                        }
                                                        tVar3 = tVar6;
                                                    }
                                                    C1842b bVar4 = new C1842b(z13, dVar2, j22, i4, j7, tVar3, str18, e2, j11, j3, q2, q, false);
                                                    arrayList4.add(bVar4);
                                                    j7 += j22;
                                                    if (j3 != -1) {
                                                        j11 += j3;
                                                    }
                                                    fVar2 = fVar;
                                                    gVar2 = gVar;
                                                    str3 = str18;
                                                    j9 = j21;
                                                    z5 = z;
                                                    arrayList5 = arrayList;
                                                    c = 0;
                                                    str6 = str5;
                                                    str7 = str4;
                                                    str10 = str2;
                                                    hashMap4 = hashMap;
                                                } else {
                                                    long j23 = j20;
                                                    if (!b.startsWith("#")) {
                                                        long j24 = j23;
                                                        String e3 = m14664e(j24, str18, str4);
                                                        j9 = j24 + 1;
                                                        String A = m14659A(b, hashMap2);
                                                        C1844d dVar6 = (C1844d) hashMap3.get(A);
                                                        if (j15 == -1) {
                                                            j2 = 0;
                                                        } else {
                                                            if (z8 && dVar2 == null && dVar6 == null) {
                                                                dVar6 = new C1844d(A, 0, j6, null, null);
                                                                hashMap3.put(A, dVar6);
                                                            }
                                                            j2 = j6;
                                                        }
                                                        if (tVar3 != null || treeMap.isEmpty()) {
                                                            dVar = dVar6;
                                                            tVar = tVar3;
                                                        } else {
                                                            dVar = dVar6;
                                                            C0894b[] bVarArr3 = (C0894b[]) treeMap.values().toArray(new C0894b[0]);
                                                            tVar = new DrmInitData(str5, bVarArr3);
                                                            if (tVar2 == null) {
                                                                tVar2 = m14663d(str5, bVarArr3);
                                                            }
                                                        }
                                                        C1844d dVar7 = new C1844d(A, dVar2 != null ? dVar2 : dVar, str11, j10, i4, j8, tVar, str18, e3, j2, j15, z7, arrayList4);
                                                        arrayList3.add(dVar7);
                                                        j7 = j8 + j10;
                                                        arrayList4 = new ArrayList();
                                                        if (j15 != -1) {
                                                            j2 += j15;
                                                        }
                                                        j6 = j2;
                                                        fVar2 = fVar;
                                                        gVar2 = gVar;
                                                        tVar3 = tVar;
                                                        str3 = str18;
                                                        j10 = 0;
                                                        j15 = -1;
                                                        j8 = j7;
                                                        z5 = z;
                                                        arrayList5 = arrayList;
                                                        str11 = str2;
                                                        c = 0;
                                                        z7 = false;
                                                        str6 = str5;
                                                        str7 = str4;
                                                        str10 = str11;
                                                        hashMap4 = hashMap;
                                                    } else {
                                                        j = j23;
                                                    }
                                                }
                                            }
                                        }
                                        z = z5;
                                        arrayList = arrayList5;
                                        j = j9;
                                        str4 = str19;
                                    }
                                    fVar2 = fVar;
                                    gVar2 = gVar;
                                    str14 = str5;
                                    str12 = str18;
                                    str8 = str19;
                                    str10 = str2;
                                    hashMap4 = hashMap;
                                }
                            }
                            c = 0;
                        }
                        fVar2 = fVar;
                        j9 = j;
                        str3 = str18;
                        z5 = z;
                        arrayList5 = arrayList;
                        c = 0;
                        gVar2 = gVar;
                        str6 = str5;
                        str7 = str4;
                        str10 = str2;
                        hashMap4 = hashMap;
                    }
                    str12 = str18;
                    str8 = str19;
                    c = 0;
                }
            }
        }
        boolean z14 = z5;
        ArrayList arrayList6 = arrayList5;
        HashMap hashMap7 = hashMap4;
        if (bVar2 != null) {
            arrayList4.add(bVar2);
        }
        HlsMediaPlaylist gVar3 = new HlsMediaPlaylist(i, str, arrayList6, j12, j4, z14, i2, j5, i3, j13, j14, z4, z6, j4 != 0, tVar2, arrayList3, arrayList4, fVar4, hashMap7);
        return gVar3;
    }

    /* renamed from: q */
    private static boolean m14675q(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return z;
        }
        return "YES".equals(matcher.group(1));
    }

    /* renamed from: r */
    private static double m14676r(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.m10153e(matcher.group(1))) : d;
    }

    /* renamed from: s */
    private static int m14677s(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.m10153e(matcher.group(1))) : i;
    }

    /* renamed from: t */
    private static long m14678t(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.m10153e(matcher.group(1))) : j;
    }

    /* renamed from: u */
    private static String m14679u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.m10153e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : m14659A(str2, map);
    }

    /* renamed from: v */
    private static String m14680v(String str, Pattern pattern, Map<String, String> map) {
        return m14679u(str, pattern, null, map);
    }

    /* renamed from: w */
    private static int m14681w(String str, Map<String, String> map) {
        String v = m14680v(str, f11852P, map);
        int i = 0;
        if (TextUtils.isEmpty(v)) {
            return 0;
        }
        String[] D0 = Util.m10244D0(v, ",");
        if (Util.m10311r(D0, "public.accessibility.describes-video")) {
            i = 512;
        }
        if (Util.m10311r(D0, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.m10311r(D0, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        if (Util.m10311r(D0, "public.easy-to-read")) {
            i |= 8192;
        }
        return i;
    }

    /* renamed from: x */
    private static int m14682x(String str) {
        int i = m14675q(str, f11855S, false) ? 1 : 0;
        if (m14675q(str, f11856T, false)) {
            i |= 2;
        }
        return m14675q(str, f11854R, false) ? i | 4 : i;
    }

    /* renamed from: y */
    private static C1846f m14683y(String str) {
        String str2 = str;
        double r = m14676r(str2, f11877p, -9.223372036854776E18d);
        long j = -9223372036854775807L;
        long j2 = r == -9.223372036854776E18d ? -9223372036854775807L : (long) (r * 1000000.0d);
        boolean q = m14675q(str2, f11878q, false);
        double r2 = m14676r(str2, f11880s, -9.223372036854776E18d);
        long j3 = r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r2 * 1000000.0d);
        double r3 = m14676r(str2, f11881t, -9.223372036854776E18d);
        if (r3 != -9.223372036854776E18d) {
            j = (long) (r3 * 1000000.0d);
        }
        C1846f fVar = new C1846f(j2, q, j3, j, m14675q(str2, f11882u, false));
        return fVar;
    }

    /* renamed from: z */
    private static String m14684z(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String v = m14680v(str, pattern, map);
        if (v != null) {
            return v;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Couldn't match ");
        sb.append(pattern.pattern());
        sb.append(" in ");
        sb.append(str);
        throw new ParserException(sb.toString());
    }

    /* renamed from: i */
    public HlsPlaylist mo6781a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (m14661b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                HlsMasterPlaylist o = m14673o(new C1848b(arrayDeque, bufferedReader), uri.toString());
                                Util.m10301m(bufferedReader);
                                return o;
                            }
                        }
                    } else {
                        Util.m10301m(bufferedReader);
                        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return m14674p(this.f11888Z, this.f11889a0, new C1848b(arrayDeque, bufferedReader), uri.toString());
            }
            throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
        } finally {
            Util.m10301m(bufferedReader);
        }
    }

    public HlsPlaylistParser(HlsMasterPlaylist fVar, HlsMediaPlaylist gVar) {
        this.f11888Z = fVar;
        this.f11889a0 = gVar;
    }
}
