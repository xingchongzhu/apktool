package com.tv91.features.movie.play;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist.C1840b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1842b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1843c;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1844d;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1846f;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistParser.C1847a;
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
import p067c.google.android.exoplayer2.C;
import p067c.google.android.exoplayer2.ParserException;
import p067c.google.android.exoplayer2.drm.DrmInitData;
import p067c.google.android.exoplayer2.drm.DrmInitData.C0894b;
import p067c.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import p067c.google.android.exoplayer2.p097j2.UnrecognizedInputFormatException;
import p067c.google.android.exoplayer2.p111m2.Assertions;
import p067c.google.android.exoplayer2.p111m2.UriUtil;
import p067c.google.android.exoplayer2.p111m2.Util;
import p067c.google.p134b.p136b.Iterables;

/* renamed from: com.tv91.features.movie.play.b */
public class M3U8Parser implements C1908a<HlsPlaylist> {

    /* renamed from: A */
    private static final Pattern f13903A = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: B */
    private static final Pattern f13904B = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: C */
    private static final Pattern f13905C = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: D */
    private static final Pattern f13906D = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: E */
    private static final Pattern f13907E = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: F */
    private static final Pattern f13908F = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: G */
    private static final Pattern f13909G = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: H */
    private static final Pattern f13910H = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: I */
    private static final Pattern f13911I = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f13912J = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: K */
    private static final Pattern f13913K = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: L */
    private static final Pattern f13914L = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: M */
    private static final Pattern f13915M = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: N */
    private static final Pattern f13916N = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: O */
    private static final Pattern f13917O = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f13918P = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: Q */
    private static final Pattern f13919Q = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: R */
    private static final Pattern f13920R = m17279c("AUTOSELECT");

    /* renamed from: S */
    private static final Pattern f13921S = m17279c("DEFAULT");

    /* renamed from: T */
    private static final Pattern f13922T = m17279c("FORCED");

    /* renamed from: U */
    private static final Pattern f13923U = m17279c("INDEPENDENT");

    /* renamed from: V */
    private static final Pattern f13924V = m17279c("GAP");

    /* renamed from: W */
    private static final Pattern f13925W = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: X */
    private static final Pattern f13926X = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: Y */
    private static final Pattern f13927Y = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: a */
    private static final Pattern f13928a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    private static final Pattern f13929b = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: c */
    private static final Pattern f13930c = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: d */
    private static final Pattern f13931d = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f13932e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f13933f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: g */
    private static final Pattern f13934g = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f13935h = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: i */
    private static final Pattern f13936i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: j */
    private static final Pattern f13937j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: k */
    private static final Pattern f13938k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: l */
    private static final Pattern f13939l = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f13940m = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: n */
    private static final Pattern f13941n = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: o */
    private static final Pattern f13942o = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: p */
    private static final Pattern f13943p = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: q */
    private static final Pattern f13944q = m17279c("CAN-SKIP-DATERANGES");

    /* renamed from: r */
    private static final Pattern f13945r = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: s */
    private static final Pattern f13946s = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: t */
    private static final Pattern f13947t = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: u */
    private static final Pattern f13948u = m17279c("CAN-BLOCK-RELOAD");

    /* renamed from: v */
    private static final Pattern f13949v = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: w */
    private static final Pattern f13950w = Pattern.compile("#EXTINF:(-?[\\d\\.]+)\\b");

    /* renamed from: x */
    private static final Pattern f13951x = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: y */
    private static final Pattern f13952y = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: z */
    private static final Pattern f13953z = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: Z */
    private final HlsMasterPlaylist f13954Z;

    /* renamed from: a0 */
    private final HlsMediaPlaylist f13955a0;

    /* renamed from: com.tv91.features.movie.play.b$a */
    /* compiled from: M3U8Parser */
    private static class C2292a {

        /* renamed from: a */
        private final BufferedReader f13956a;

        /* renamed from: b */
        private final Queue<String> f13957b;

        /* renamed from: c */
        private String f13958c;

        public C2292a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f13957b = queue;
            this.f13956a = bufferedReader;
        }

        /* renamed from: a */
        public boolean mo16803a() throws IOException {
            String trim;
            if (this.f13958c != null) {
                return true;
            }
            if (!this.f13957b.isEmpty()) {
                this.f13958c = (String) Assertions.m10153e(this.f13957b.poll());
                return true;
            }
            do {
                String readLine = this.f13956a.readLine();
                this.f13958c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f13958c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String mo16804b() throws IOException {
            if (mo16803a()) {
                String str = this.f13958c;
                this.f13958c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public M3U8Parser() {
        this(HlsMasterPlaylist.f11773d, null);
    }

    /* renamed from: A */
    private static String m17276A(String str, Map<String, String> map) {
        Matcher matcher = f13927Y.matcher(str);
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
    private static int m17277B(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.m10298k0(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: b */
    private static boolean m17278b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int B = m17277B(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (B != "#EXTM3U".charAt(i)) {
                return false;
            }
            B = bufferedReader.read();
        }
        return Util.m10298k0(m17277B(bufferedReader, false, B));
    }

    /* renamed from: c */
    private static Pattern m17279c(String str) {
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
    private static DrmInitData m17280d(String str, C0894b[] bVarArr) {
        C0894b[] bVarArr2 = new C0894b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = bVarArr[i].mo6111l(null);
        }
        return new DrmInitData(str, bVarArr2);
    }

    /* renamed from: e */
    private static String m17281e(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* renamed from: f */
    private static C1840b m17282f(ArrayList<C1840b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1840b bVar = (C1840b) arrayList.get(i);
            if (str.equals(bVar.f11791d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static C1840b m17283g(ArrayList<C1840b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1840b bVar = (C1840b) arrayList.get(i);
            if (str.equals(bVar.f11792e)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    private static C1840b m17284h(ArrayList<C1840b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1840b bVar = (C1840b) arrayList.get(i);
            if (str.equals(bVar.f11790c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    private static double m17285j(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(m17301z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    private static C0894b m17286k(String str, String str2, Map<String, String> map) throws ParserException {
        Pattern pattern = f13910H;
        String str3 = SdkVersion.MINI_VERSION;
        String u = m17296u(str, pattern, str3, map);
        String str4 = "video/mp4";
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z = m17301z(str, f13911I, map);
            return new C0894b(C.f7373d, str4, Base64.decode(z.substring(z.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new C0894b(C.f7373d, "hls", Util.m10290g0(str));
        } else if (!"com.microsoft.playready".equals(str2) || !str3.equals(u)) {
            return null;
        } else {
            String z2 = m17301z(str, f13911I, map);
            byte[] decode = Base64.decode(z2.substring(z2.indexOf(44)), 0);
            UUID uuid = C.f7374e;
            return new C0894b(uuid, str4, PsshAtomUtil.m7822a(uuid, decode));
        }
    }

    /* renamed from: l */
    private static String m17287l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: m */
    private static int m17288m(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(m17301z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    private static long m17289n(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(m17301z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0456, code lost:
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x049e, code lost:
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
    private static com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist m17290o(C2292a r36, String r37) throws IOException {
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
            boolean r14 = r36.mo16803a()
            java.lang.String r15 = "application/x-mpegURL"
            if (r14 == 0) goto L_0x021f
            java.lang.String r14 = r36.mo16804b()
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
            java.util.regex.Pattern r9 = f13916N
            java.lang.String r9 = m17301z(r14, r9, r11)
            java.util.regex.Pattern r10 = f13925W
            java.lang.String r10 = m17301z(r14, r10, r11)
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
            java.util.regex.Pattern r9 = f13909G
            java.lang.String r10 = "identity"
            java.lang.String r9 = m17296u(r14, r9, r10, r11)
            c.a.a.a.e2.t$b r9 = m17286k(r14, r9, r11)
            if (r9 == 0) goto L_0x00ce
            java.util.regex.Pattern r10 = f13908F
            java.lang.String r10 = m17301z(r14, r10, r11)
            java.lang.String r10 = m17287l(r10)
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
            java.util.regex.Pattern r13 = f13933f
            int r13 = m17288m(r14, r13)
            r28 = r12
            java.util.regex.Pattern r12 = f13928a
            r29 = r7
            r7 = -1
            int r12 = m17294s(r14, r12, r7)
            java.util.regex.Pattern r7 = f13935h
            java.lang.String r7 = m17297v(r14, r7, r11)
            r30 = r8
            java.util.regex.Pattern r8 = f13936i
            java.lang.String r8 = m17297v(r14, r8, r11)
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
            java.util.regex.Pattern r5 = f13937j
            java.lang.String r5 = m17297v(r14, r5, r11)
            if (r5 == 0) goto L_0x0152
            float r17 = java.lang.Float.parseFloat(r5)
            r33 = r4
            r5 = r17
            goto L_0x0156
        L_0x0152:
            r33 = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0156:
            java.util.regex.Pattern r4 = f13929b
            java.lang.String r4 = m17297v(r14, r4, r11)
            r34 = r3
            java.util.regex.Pattern r3 = f13930c
            java.lang.String r3 = m17297v(r14, r3, r11)
            r35 = r0
            java.util.regex.Pattern r0 = f13931d
            java.lang.String r0 = m17297v(r14, r0, r11)
            r17 = r0
            java.util.regex.Pattern r0 = f13932e
            java.lang.String r0 = m17297v(r14, r0, r11)
            if (r9 == 0) goto L_0x0181
            java.util.regex.Pattern r9 = f13911I
            java.lang.String r9 = m17301z(r14, r9, r11)
            android.net.Uri r9 = p067c.p068a.p069a.p070a.p111m2.UriUtil.m10226d(r1, r9)
            goto L_0x0193
        L_0x0181:
            boolean r9 = r36.mo16803a()
            if (r9 == 0) goto L_0x0217
            java.lang.String r9 = r36.mo16804b()
            java.lang.String r9 = m17276A(r9, r11)
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
            if (r4 >= r5) goto L_0x0290
            java.lang.Object r5 = r2.get(r4)
            com.google.android.exoplayer2.source.hls.v.f$b r5 = (com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist.C1840b) r5
            android.net.Uri r7 = r5.f11788a
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L_0x028d
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
        L_0x028d:
            int r4 = r4 + 1
            goto L_0x023b
        L_0x0290:
            r1 = r6
            r8 = r1
            r0 = 0
        L_0x0293:
            int r4 = r34.size()
            if (r0 >= r4) goto L_0x04ad
            r4 = r34
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r7 = f13917O
            java.lang.String r7 = m17301z(r5, r7, r11)
            java.util.regex.Pattern r9 = f13916N
            java.lang.String r9 = m17301z(r5, r9, r11)
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
            int r12 = m17299x(r5)
            c.a.a.a.u0$b r10 = r10.mo7707g0(r12)
            int r12 = m17298w(r5, r11)
            c.a.a.a.u0$b r10 = r10.mo7703c0(r12)
            java.util.regex.Pattern r12 = f13915M
            java.lang.String r12 = m17297v(r5, r12, r11)
            c.a.a.a.u0$b r10 = r10.mo7696V(r12)
            java.util.regex.Pattern r12 = f13911I
            java.lang.String r12 = m17297v(r5, r12, r11)
            r14 = r37
            if (r12 != 0) goto L_0x02f8
            r12 = r6
            goto L_0x02fc
        L_0x02f8:
            android.net.Uri r12 = p067c.p068a.p069a.p070a.p111m2.UriUtil.m10226d(r14, r12)
        L_0x02fc:
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
            java.util.regex.Pattern r4 = f13913K
            java.lang.String r4 = m17301z(r5, r4, r11)
            r4.hashCode()
            int r14 = r4.hashCode()
            r15 = 2
            switch(r14) {
                case -959297733: goto L_0x0348;
                case -333210994: goto L_0x033d;
                case 62628790: goto L_0x0332;
                case 81665115: goto L_0x0327;
                default: goto L_0x0325;
            }
        L_0x0325:
            r4 = -1
            goto L_0x0352
        L_0x0327:
            java.lang.String r14 = "VIDEO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0330
            goto L_0x0325
        L_0x0330:
            r4 = 3
            goto L_0x0352
        L_0x0332:
            java.lang.String r14 = "AUDIO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x033b
            goto L_0x0325
        L_0x033b:
            r4 = 2
            goto L_0x0352
        L_0x033d:
            java.lang.String r14 = "CLOSED-CAPTIONS"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0346
            goto L_0x0325
        L_0x0346:
            r4 = 1
            goto L_0x0352
        L_0x0348:
            java.lang.String r14 = "SUBTITLES"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0351
            goto L_0x0325
        L_0x0351:
            r4 = 0
        L_0x0352:
            switch(r4) {
                case 0: goto L_0x0459;
                case 1: goto L_0x0415;
                case 2: goto L_0x03a7;
                case 3: goto L_0x0361;
                default: goto L_0x0355;
            }
        L_0x0355:
            r22 = r8
            r6 = r31
            r8 = r32
            r14 = r33
        L_0x035d:
            r16 = 0
            goto L_0x049e
        L_0x0361:
            com.google.android.exoplayer2.source.hls.v.f$b r4 = m17284h(r2, r7)
            if (r4 == 0) goto L_0x038c
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
        L_0x038c:
            if (r12 != 0) goto L_0x038f
            goto L_0x0355
        L_0x038f:
            r10.mo7698X(r6)
            com.google.android.exoplayer2.source.hls.v.f$a r4 = new com.google.android.exoplayer2.source.hls.v.f$a
            c.a.a.a.u0 r5 = r10.mo7679E()
            r4.<init>(r12, r5, r7, r9)
            r14 = r33
            r14.add(r4)
            r22 = r8
            r6 = r31
            r8 = r32
            goto L_0x035d
        L_0x03a7:
            r14 = r33
            com.google.android.exoplayer2.source.hls.v.f$b r4 = m17282f(r2, r7)
            if (r4 == 0) goto L_0x03c2
            c.a.a.a.u0 r15 = r4.f11789b
            java.lang.String r15 = r15.f8811i
            r22 = r8
            r8 = 1
            java.lang.String r15 = p067c.p068a.p069a.p070a.p111m2.Util.m10249G(r15, r8)
            r10.mo7683I(r15)
            java.lang.String r15 = p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10401g(r15)
            goto L_0x03c5
        L_0x03c2:
            r22 = r8
            r15 = 0
        L_0x03c5:
            java.util.regex.Pattern r8 = f13934g
            java.lang.String r5 = m17297v(r5, r8, r11)
            if (r5 == 0) goto L_0x03f1
            java.lang.String r8 = "/"
            java.lang.String[] r8 = p067c.p068a.p069a.p070a.p111m2.Util.m10246E0(r5, r8)
            r16 = 0
            r8 = r8[r16]
            int r8 = java.lang.Integer.parseInt(r8)
            r10.mo7682H(r8)
            java.lang.String r8 = "audio/eac3"
            boolean r8 = r8.equals(r15)
            if (r8 == 0) goto L_0x03f3
            java.lang.String r8 = "/JOC"
            boolean r5 = r5.endsWith(r8)
            if (r5 == 0) goto L_0x03f3
            java.lang.String r15 = "audio/eac3-joc"
            goto L_0x03f3
        L_0x03f1:
            r16 = 0
        L_0x03f3:
            r10.mo7705e0(r15)
            if (r12 == 0) goto L_0x040a
            r10.mo7698X(r6)
            com.google.android.exoplayer2.source.hls.v.f$a r4 = new com.google.android.exoplayer2.source.hls.v.f$a
            c.a.a.a.u0 r5 = r10.mo7679E()
            r4.<init>(r12, r5, r7, r9)
            r8 = r32
            r8.add(r4)
            goto L_0x0456
        L_0x040a:
            r8 = r32
            if (r4 == 0) goto L_0x0456
            c.a.a.a.u0 r4 = r10.mo7679E()
            r22 = r4
            goto L_0x0456
        L_0x0415:
            r22 = r8
            r8 = r32
            r14 = r33
            r16 = 0
            java.util.regex.Pattern r4 = f13919Q
            java.lang.String r4 = m17301z(r5, r4, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0436
            java.lang.String r4 = r4.substring(r15)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-608"
            goto L_0x0441
        L_0x0436:
            r5 = 7
            java.lang.String r4 = r4.substring(r5)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-708"
        L_0x0441:
            if (r1 != 0) goto L_0x0448
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0448:
            c.a.a.a.u0$b r5 = r10.mo7705e0(r5)
            r5.mo7680F(r4)
            c.a.a.a.u0 r4 = r10.mo7679E()
            r1.add(r4)
        L_0x0456:
            r6 = r31
            goto L_0x049e
        L_0x0459:
            r22 = r8
            r8 = r32
            r14 = r33
            r16 = 0
            com.google.android.exoplayer2.source.hls.v.f$b r4 = m17283g(r2, r7)
            if (r4 == 0) goto L_0x0478
            c.a.a.a.u0 r4 = r4.f11789b
            java.lang.String r4 = r4.f8811i
            r5 = 3
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.Util.m10249G(r4, r5)
            r10.mo7683I(r4)
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10401g(r4)
            goto L_0x0479
        L_0x0478:
            r4 = 0
        L_0x0479:
            if (r4 != 0) goto L_0x047d
            java.lang.String r4 = "text/vtt"
        L_0x047d:
            c.a.a.a.u0$b r4 = r10.mo7705e0(r4)
            r4.mo7698X(r6)
            if (r12 == 0) goto L_0x0495
            com.google.android.exoplayer2.source.hls.v.f$a r4 = new com.google.android.exoplayer2.source.hls.v.f$a
            c.a.a.a.u0 r5 = r10.mo7679E()
            r4.<init>(r12, r5, r7, r9)
            r6 = r31
            r6.add(r4)
            goto L_0x049e
        L_0x0495:
            r6 = r31
            java.lang.String r4 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r4, r5)
        L_0x049e:
            int r0 = r0 + 1
            r31 = r6
            r32 = r8
            r33 = r14
            r15 = r20
            r8 = r22
            r6 = 0
            goto L_0x0293
        L_0x04ad:
            r22 = r8
            r6 = r31
            r8 = r32
            r14 = r33
            if (r13 == 0) goto L_0x04bd
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x04be
        L_0x04bd:
            r9 = r1
        L_0x04be:
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
        throw new UnsupportedOperationException("Method not decompiled: com.tv91.features.movie.play.M3U8Parser.m17290o(com.tv91.features.movie.play.b$a, java.lang.String):com.google.android.exoplayer2.source.hls.v.f");
    }

    /* renamed from: p */
    private static HlsMediaPlaylist m17291p(HlsMasterPlaylist fVar, HlsMediaPlaylist gVar, C2292a aVar, String str) throws IOException {
        List list;
        String str2;
        HashMap hashMap;
        String str3;
        String str4;
        boolean z;
        String str5;
        int i;
        ArrayList arrayList;
        long j;
        String str6;
        String str7;
        HashMap hashMap2;
        long j2;
        long j3;
        DrmInitData tVar;
        String str8;
        long j4;
        String str9;
        String str10;
        long j5;
        long j6;
        HlsMasterPlaylist fVar2 = fVar;
        HlsMediaPlaylist gVar2 = gVar;
        boolean z2 = fVar2.f11836c;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        C1846f fVar3 = new C1846f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str11 = "";
        boolean z3 = z2;
        C1846f fVar4 = fVar3;
        String str12 = str11;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        boolean z4 = false;
        int i2 = 0;
        String str13 = null;
        String str14 = null;
        long j15 = -9223372036854775807L;
        int i3 = 0;
        int i4 = 1;
        long j16 = -9223372036854775807L;
        long j17 = -9223372036854775807L;
        boolean z5 = false;
        DrmInitData tVar2 = null;
        DrmInitData tVar3 = null;
        boolean z6 = false;
        C1842b bVar = null;
        long j18 = -1;
        String str15 = null;
        int i5 = 0;
        boolean z7 = false;
        C1844d dVar = null;
        while (aVar.mo16803a()) {
            String b = aVar.mo16804b();
            if (b.startsWith("#EXT")) {
                arrayList4.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z8 = m17301z(b, f13942o, hashMap3);
                if ("VOD".equals(z8)) {
                    i2 = 1;
                } else if ("EVENT".equals(z8)) {
                    i2 = 2;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else if (b.startsWith("#EXT-X-START")) {
                j15 = (long) (m17285j(b, f13903A) * 1000000.0d);
            } else if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar4 = m17300y(b);
            } else if (b.startsWith("#EXT-X-PART-INF")) {
                j17 = (long) (m17285j(b, f13940m) * 1000000.0d);
            } else {
                boolean z9 = z4;
                String str16 = "@";
                if (b.startsWith("#EXT-X-MAP")) {
                    String z10 = m17301z(b, f13911I, hashMap3);
                    String v = m17297v(b, f13905C, hashMap3);
                    if (v != null) {
                        String[] D0 = Util.m10244D0(v, str16);
                        long parseLong = Long.parseLong(D0[0]);
                        if (D0.length > 1) {
                            j5 = parseLong;
                            j6 = Long.parseLong(D0[1]);
                        } else {
                            j5 = parseLong;
                            j6 = j9;
                        }
                    } else {
                        j6 = j9;
                        j5 = j18;
                    }
                    if (str13 == null || str14 != null) {
                        dVar = new C1844d(z10, j6, j5, str13, str14);
                        j9 = 0;
                        z4 = z9;
                        j18 = -1;
                    } else {
                        throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                } else {
                    if (b.startsWith("#EXT-X-TARGETDURATION")) {
                        j16 = 1000000 * ((long) m17288m(b, f13938k));
                    } else if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j12 = m17289n(b, f13949v);
                        j8 = j12;
                    } else if (b.startsWith("#EXT-X-VERSION")) {
                        i4 = m17288m(b, f13941n);
                    } else {
                        if (b.startsWith("#EXT-X-DEFINE")) {
                            String v2 = m17297v(b, f13926X, hashMap3);
                            if (v2 != null) {
                                String str17 = (String) fVar2.f11782m.get(v2);
                                if (str17 != null) {
                                    hashMap3.put(v2, str17);
                                }
                            } else {
                                hashMap3.put(m17301z(b, f13916N, hashMap3), m17301z(b, f13925W, hashMap3));
                            }
                            str2 = str11;
                            str3 = str13;
                            str4 = str14;
                            hashMap2 = hashMap5;
                            str6 = str15;
                            j = j12;
                            i = i2;
                            arrayList = arrayList4;
                        } else {
                            if (b.startsWith("#EXTINF")) {
                                str3 = str13;
                                String str18 = str14;
                                long j19 = (long) (m17285j(b, f13950w) * 1000000.0d);
                                str12 = m17296u(b, f13951x, str11, hashMap3);
                                j13 = j19;
                                z4 = z9;
                                str8 = str18;
                            } else {
                                str3 = str13;
                                String str19 = str14;
                                if (b.startsWith("#EXT-X-SKIP")) {
                                    int m = m17288m(b, f13945r);
                                    Assertions.m10154f(gVar2 != null && arrayList2.isEmpty());
                                    int i6 = (int) (j8 - ((HlsMediaPlaylist) Util.m10293i(gVar)).f11799i);
                                    int i7 = m + i6;
                                    if (i6 < 0 || i7 > gVar2.f11806p.size()) {
                                        throw new C1847a();
                                    }
                                    str2 = str11;
                                    String str20 = str3;
                                    long j20 = j11;
                                    str14 = str19;
                                    while (i6 < i7) {
                                        C1844d dVar2 = (C1844d) gVar2.f11806p.get(i6);
                                        String str21 = str14;
                                        HashMap hashMap6 = hashMap5;
                                        if (j8 != gVar2.f11799i) {
                                            dVar2 = dVar2.mo14690b(j20, (gVar2.f11798h - i3) + dVar2.f11821d);
                                        }
                                        arrayList2.add(dVar2);
                                        j20 += dVar2.f11820c;
                                        long j21 = dVar2.f11827j;
                                        if (j21 != -1) {
                                            j9 = dVar2.f11826i + j21;
                                        }
                                        int i8 = dVar2.f11821d;
                                        C1844d dVar3 = dVar2.f11819b;
                                        DrmInitData tVar4 = dVar2.f11823f;
                                        String str22 = dVar2.f11824g;
                                        int i9 = i8;
                                        String str23 = dVar2.f11825h;
                                        C1844d dVar4 = dVar3;
                                        if (str23 == null || !str23.equals(Long.toHexString(j12))) {
                                            str10 = dVar2.f11825h;
                                        } else {
                                            str10 = str21;
                                        }
                                        j12++;
                                        i6++;
                                        gVar2 = gVar;
                                        j10 = j20;
                                        str20 = str22;
                                        i5 = i9;
                                        dVar = dVar4;
                                        hashMap5 = hashMap6;
                                        tVar3 = tVar4;
                                        str14 = str10;
                                        HlsMasterPlaylist fVar5 = fVar;
                                    }
                                    String str24 = str14;
                                    fVar2 = fVar;
                                    gVar2 = gVar;
                                    j11 = j20;
                                    str5 = str20;
                                    z = z9;
                                    str11 = str2;
                                } else {
                                    str2 = str11;
                                    hashMap2 = hashMap5;
                                    if (b.startsWith("#EXT-X-KEY")) {
                                        String z11 = m17301z(b, f13908F, hashMap3);
                                        String str25 = "identity";
                                        String u = m17296u(b, f13909G, str25, hashMap3);
                                        if ("NONE".equals(z11)) {
                                            treeMap.clear();
                                            str13 = null;
                                            str9 = null;
                                        } else {
                                            String v3 = m17297v(b, f13912J, hashMap3);
                                            if (!str25.equals(u)) {
                                                String str26 = str15;
                                                str15 = str26 == null ? m17287l(z11) : str26;
                                                C0894b k = m17286k(b, u, hashMap3);
                                                if (k != null) {
                                                    treeMap.put(u, k);
                                                    str9 = v3;
                                                    str13 = null;
                                                }
                                            } else if ("AES-128".equals(z11)) {
                                                str13 = m17301z(b, f13911I, hashMap3);
                                                str9 = v3;
                                                fVar2 = fVar;
                                                gVar2 = gVar;
                                                z4 = z9;
                                                str11 = str2;
                                                hashMap5 = hashMap2;
                                            }
                                            str9 = v3;
                                            str13 = null;
                                            fVar2 = fVar;
                                            gVar2 = gVar;
                                            z4 = z9;
                                            str11 = str2;
                                            hashMap5 = hashMap2;
                                        }
                                        tVar3 = null;
                                        fVar2 = fVar;
                                        gVar2 = gVar;
                                        z4 = z9;
                                        str11 = str2;
                                        hashMap5 = hashMap2;
                                    } else {
                                        str6 = str15;
                                        if (b.startsWith("#EXT-X-BYTERANGE")) {
                                            String[] D02 = Util.m10244D0(m17301z(b, f13904B, hashMap3), str16);
                                            j18 = Long.parseLong(D02[0]);
                                            if (D02.length > 1) {
                                                j9 = Long.parseLong(D02[1]);
                                            }
                                        } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i3 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                            fVar2 = fVar;
                                            gVar2 = gVar;
                                            str15 = str6;
                                            str8 = str19;
                                            str11 = str2;
                                            hashMap5 = hashMap2;
                                            z4 = true;
                                        } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                            i5++;
                                        } else {
                                            if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j7 == 0) {
                                                    j7 = C.m8860c(Util.m10324x0(b.substring(b.indexOf(58) + 1))) - j11;
                                                }
                                            } else if (b.equals("#EXT-X-GAP")) {
                                                fVar2 = fVar;
                                                gVar2 = gVar;
                                                str15 = str6;
                                                z4 = z9;
                                                str8 = str19;
                                                str11 = str2;
                                                hashMap5 = hashMap2;
                                                z6 = true;
                                            } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                fVar2 = fVar;
                                                gVar2 = gVar;
                                                str15 = str6;
                                                z4 = z9;
                                                str8 = str19;
                                                str11 = str2;
                                                hashMap5 = hashMap2;
                                                z3 = true;
                                            } else if (b.equals("#EXT-X-ENDLIST")) {
                                                fVar2 = fVar;
                                                gVar2 = gVar;
                                                str15 = str6;
                                                z4 = z9;
                                                str8 = str19;
                                                str11 = str2;
                                                hashMap5 = hashMap2;
                                                z5 = true;
                                            } else if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long t = m17295t(b, f13952y, (j8 + ((long) arrayList2.size())) - (arrayList3.isEmpty() ? 1 : 0));
                                                int s = m17294s(b, f13953z, j17 != -9223372036854775807L ? (arrayList3.isEmpty() ? ((C1844d) Iterables.m12008c(arrayList2)).f11817m : arrayList3).size() - 1 : -1);
                                                Uri parse = Uri.parse(UriUtil.m10225c(str, m17301z(b, f13911I, hashMap3)));
                                                hashMap2.put(parse, new C1843c(parse, t, s));
                                            } else {
                                                HashMap hashMap7 = hashMap2;
                                                if (b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    C1842b bVar2 = bVar;
                                                    if (bVar2 == null) {
                                                        if ("PART".equals(m17301z(b, f13914L, hashMap3))) {
                                                            String z12 = m17301z(b, f13911I, hashMap3);
                                                            long t2 = m17295t(b, f13906D, -1);
                                                            long t3 = m17295t(b, f13907E, -1);
                                                            long j22 = j12;
                                                            str4 = str19;
                                                            String e = m17281e(j22, str3, str4);
                                                            if (tVar3 != null || treeMap.isEmpty()) {
                                                                hashMap = hashMap7;
                                                            } else {
                                                                hashMap = hashMap7;
                                                                C0894b[] bVarArr = (C0894b[]) treeMap.values().toArray(new C0894b[0]);
                                                                DrmInitData tVar5 = new DrmInitData(str6, bVarArr);
                                                                if (tVar2 == null) {
                                                                    tVar2 = m17280d(str6, bVarArr);
                                                                }
                                                                tVar3 = tVar5;
                                                            }
                                                            if (t2 == -1 || t3 != -1) {
                                                                bVar = new C1842b(z12, dVar, 0, i5, j10, tVar3, str3, e, t2 != -1 ? t2 : 0, t3, false, false, true);
                                                            } else {
                                                                bVar = bVar2;
                                                            }
                                                            fVar2 = fVar;
                                                            gVar2 = gVar;
                                                            str7 = str6;
                                                            j12 = j22;
                                                            z = z9;
                                                            hashMap5 = hashMap;
                                                            str14 = str4;
                                                            str5 = str3;
                                                            str11 = str2;
                                                        }
                                                    }
                                                    hashMap2 = hashMap7;
                                                    bVar = bVar2;
                                                } else {
                                                    hashMap2 = hashMap7;
                                                    C1842b bVar3 = bVar;
                                                    j = j12;
                                                    str4 = str19;
                                                    if (b.startsWith("#EXT-X-PART")) {
                                                        String e2 = m17281e(j, str3, str4);
                                                        String z13 = m17301z(b, f13911I, hashMap3);
                                                        bVar = bVar3;
                                                        long j23 = (long) (m17285j(b, f13939l) * 1000000.0d);
                                                        arrayList = arrayList4;
                                                        i = i2;
                                                        boolean q = m17292q(b, f13923U, false) | (z3 && arrayList3.isEmpty());
                                                        boolean q2 = m17292q(b, f13924V, false);
                                                        String v4 = m17297v(b, f13905C, hashMap3);
                                                        if (v4 != null) {
                                                            String[] D03 = Util.m10244D0(v4, str16);
                                                            j4 = Long.parseLong(D03[0]);
                                                            if (D03.length > 1) {
                                                                j14 = Long.parseLong(D03[1]);
                                                            }
                                                        } else {
                                                            j4 = -1;
                                                        }
                                                        if (j4 == -1) {
                                                            j14 = 0;
                                                        }
                                                        if (tVar3 == null && !treeMap.isEmpty()) {
                                                            C0894b[] bVarArr2 = (C0894b[]) treeMap.values().toArray(new C0894b[0]);
                                                            DrmInitData tVar6 = new DrmInitData(str6, bVarArr2);
                                                            if (tVar2 == null) {
                                                                tVar2 = m17280d(str6, bVarArr2);
                                                            }
                                                            tVar3 = tVar6;
                                                        }
                                                        C1842b bVar4 = new C1842b(z13, dVar, j23, i5, j10, tVar3, str3, e2, j14, j4, q2, q, false);
                                                        arrayList3.add(bVar4);
                                                        j10 += j23;
                                                        if (j4 != -1) {
                                                            j14 += j4;
                                                        }
                                                    } else {
                                                        bVar = bVar3;
                                                        i = i2;
                                                        arrayList = arrayList4;
                                                        if (!b.startsWith("#")) {
                                                            String e3 = m17281e(j, str3, str4);
                                                            long j24 = j + 1;
                                                            String A = m17276A(b, hashMap3);
                                                            C1844d dVar5 = (C1844d) hashMap4.get(A);
                                                            if (j18 == -1) {
                                                                j2 = 0;
                                                            } else {
                                                                if (z7 && dVar == null && dVar5 == null) {
                                                                    dVar5 = new C1844d(A, 0, j9, null, null);
                                                                    hashMap4.put(A, dVar5);
                                                                }
                                                                j2 = j9;
                                                            }
                                                            if (tVar3 != null || treeMap.isEmpty()) {
                                                                j3 = j24;
                                                                tVar = tVar3;
                                                            } else {
                                                                j3 = j24;
                                                                C0894b[] bVarArr3 = (C0894b[]) treeMap.values().toArray(new C0894b[0]);
                                                                tVar = new DrmInitData(str6, bVarArr3);
                                                                if (tVar2 == null) {
                                                                    tVar2 = m17280d(str6, bVarArr3);
                                                                }
                                                            }
                                                            C1844d dVar6 = new C1844d(A, dVar != null ? dVar : dVar5, str12, j13, i5, j11, tVar, str3, e3, j2, j18, z6, arrayList3);
                                                            arrayList2.add(dVar6);
                                                            j10 = j11 + j13;
                                                            arrayList3 = new ArrayList();
                                                            if (j18 != -1) {
                                                                j2 += j18;
                                                            }
                                                            j9 = j2;
                                                            fVar2 = fVar;
                                                            gVar2 = gVar;
                                                            tVar3 = tVar;
                                                            str8 = str4;
                                                            j13 = 0;
                                                            j18 = -1;
                                                            j11 = j10;
                                                            arrayList4 = arrayList;
                                                            i2 = i;
                                                            z4 = z9;
                                                            str11 = str2;
                                                            str12 = str11;
                                                            hashMap5 = hashMap2;
                                                            z6 = false;
                                                            str15 = str6;
                                                            j12 = j3;
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList = arrayList4;
                                            j = j12;
                                            str4 = str19;
                                            i = i2;
                                        }
                                        fVar2 = fVar;
                                        gVar2 = gVar;
                                        str15 = str6;
                                        z4 = z9;
                                        str8 = str19;
                                        str11 = str2;
                                        hashMap5 = hashMap2;
                                    }
                                }
                            }
                            str13 = str3;
                        }
                        fVar2 = fVar;
                        gVar2 = gVar;
                        arrayList4 = arrayList;
                        i2 = i;
                        z = z9;
                        str7 = str6;
                        j12 = j;
                        hashMap5 = hashMap;
                        str14 = str4;
                        str5 = str3;
                        str11 = str2;
                    }
                    z4 = z9;
                }
            }
        }
        boolean z14 = z4;
        int i10 = i2;
        ArrayList arrayList5 = arrayList4;
        HashMap hashMap8 = hashMap5;
        boolean z15 = false;
        if (bVar != null) {
            arrayList3.add(bVar);
        }
        if (j7 != 0) {
            list = arrayList3;
            z15 = true;
        } else {
            list = arrayList3;
        }
        HlsMediaPlaylist gVar3 = new HlsMediaPlaylist(i10, str, arrayList5, j15, j7, z14, i3, j8, i4, j16, j17, z3, z5, z15, tVar2, arrayList2, list, fVar4, hashMap8);
        return gVar3;
    }

    /* renamed from: q */
    private static boolean m17292q(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return z;
        }
        return "YES".equals(matcher.group(1));
    }

    /* renamed from: r */
    private static double m17293r(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.m10153e(matcher.group(1))) : d;
    }

    /* renamed from: s */
    private static int m17294s(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.m10153e(matcher.group(1))) : i;
    }

    /* renamed from: t */
    private static long m17295t(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.m10153e(matcher.group(1))) : j;
    }

    /* renamed from: u */
    private static String m17296u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.m10153e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : m17276A(str2, map);
    }

    /* renamed from: v */
    private static String m17297v(String str, Pattern pattern, Map<String, String> map) {
        return m17296u(str, pattern, null, map);
    }

    /* renamed from: w */
    private static int m17298w(String str, Map<String, String> map) {
        String v = m17297v(str, f13918P, map);
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
    private static int m17299x(String str) {
        int i = m17292q(str, f13921S, false) ? 1 : 0;
        if (m17292q(str, f13922T, false)) {
            i |= 2;
        }
        return m17292q(str, f13920R, false) ? i | 4 : i;
    }

    /* renamed from: y */
    private static C1846f m17300y(String str) {
        String str2 = str;
        double r = m17293r(str2, f13943p, -9.223372036854776E18d);
        long j = -9223372036854775807L;
        long j2 = r == -9.223372036854776E18d ? -9223372036854775807L : (long) (r * 1000000.0d);
        boolean q = m17292q(str2, f13944q, false);
        double r2 = m17293r(str2, f13946s, -9.223372036854776E18d);
        long j3 = r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r2 * 1000000.0d);
        double r3 = m17293r(str2, f13947t, -9.223372036854776E18d);
        if (r3 != -9.223372036854776E18d) {
            j = (long) (r3 * 1000000.0d);
        }
        C1846f fVar = new C1846f(j2, q, j3, j, m17292q(str2, f13948u, false));
        return fVar;
    }

    /* renamed from: z */
    private static String m17301z(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String v = m17297v(str, pattern, map);
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
            if (m17278b(bufferedReader)) {
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
                                HlsMasterPlaylist o = m17290o(new C2292a(arrayDeque, bufferedReader), uri.toString());
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
                return m17291p(this.f13954Z, this.f13955a0, new C2292a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
        } finally {
            Util.m10301m(bufferedReader);
        }
    }

    public M3U8Parser(HlsMasterPlaylist fVar, HlsMediaPlaylist gVar) {
        this.f13954Z = fVar;
        this.f13955a0 = gVar;
    }
}
