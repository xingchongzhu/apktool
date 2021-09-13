package p067c.p068a.p069a.p070a.p100k2.p107t;

import com.umeng.analytics.pro.UMCommonContent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p067c.p068a.p069a.p070a.p100k2.SimpleSubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p069a.p070a.p111m2.XmlPullParserUtil;

/* renamed from: c.a.a.a.k2.t.c */
public final class TtmlDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private static final Pattern f7983o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p */
    private static final Pattern f7984p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q */
    private static final Pattern f7985q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r */
    static final Pattern f7986r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    static final Pattern f7987s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    private static final Pattern f7988t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: u */
    private static final Pattern f7989u = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: v */
    private static final C1143b f7990v = new C1143b(30.0f, 1, 1);

    /* renamed from: w */
    private static final C1142a f7991w = new C1142a(32, 15);

    /* renamed from: x */
    private final XmlPullParserFactory f7992x;

    /* renamed from: c.a.a.a.k2.t.c$a */
    /* compiled from: TtmlDecoder */
    private static final class C1142a {

        /* renamed from: a */
        final int f7993a;

        /* renamed from: b */
        final int f7994b;

        C1142a(int i, int i2) {
            this.f7993a = i;
            this.f7994b = i2;
        }
    }

    /* renamed from: c.a.a.a.k2.t.c$b */
    /* compiled from: TtmlDecoder */
    private static final class C1143b {

        /* renamed from: a */
        final float f7995a;

        /* renamed from: b */
        final int f7996b;

        /* renamed from: c */
        final int f7997c;

        C1143b(float f, int i, int i2) {
            this.f7995a = f;
            this.f7996b = i;
            this.f7997c = i2;
        }
    }

    /* renamed from: c.a.a.a.k2.t.c$c */
    /* compiled from: TtmlDecoder */
    private static final class C1144c {

        /* renamed from: a */
        final int f7998a;

        /* renamed from: b */
        final int f7999b;

        C1144c(int i, int i2) {
            this.f7998a = i;
            this.f7999b = i2;
        }
    }

    public TtmlDecoder() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f7992x = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: C */
    private static TtmlStyle m9644C(TtmlStyle gVar) {
        return gVar == null ? new TtmlStyle() : gVar;
    }

    /* renamed from: D */
    private static boolean m9645D(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(UMCommonContent.f16624av) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: E */
    private static C1142a m9646E(XmlPullParser xmlPullParser, C1142a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f7989u.matcher(attributeValue);
        String str = "Ignoring malformed cell resolution: ";
        String str2 = "TtmlDecoder";
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(attributeValue);
            Log.m10386h(str2, sb.toString());
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) Assertions.m10153e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) Assertions.m10153e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new C1142a(parseInt, parseInt2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new SubtitleDecoderException(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(attributeValue);
            Log.m10386h(str2, sb3.toString());
            return aVar;
        }
    }

    /* renamed from: F */
    private static void m9647F(String str, TtmlStyle gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] D0 = Util.m10244D0(str, "\\s+");
        if (D0.length == 1) {
            matcher = f7985q.matcher(str);
        } else if (D0.length == 2) {
            matcher = f7985q.matcher(D0[1]);
            Log.m10386h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(D0.length);
            sb.append(".");
            throw new SubtitleDecoderException(sb.toString());
        }
        String str2 = "'.";
        if (matcher.matches()) {
            String str3 = (String) Assertions.m10153e(matcher.group(3));
            str3.hashCode();
            char c = 65535;
            switch (str3.hashCode()) {
                case 37:
                    if (str3.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str3.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str3.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    gVar.mo7151y(3);
                    break;
                case 1:
                    gVar.mo7151y(2);
                    break;
                case 2:
                    gVar.mo7151y(1);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid unit for fontSize: '");
                    sb2.append(str3);
                    sb2.append(str2);
                    throw new SubtitleDecoderException(sb2.toString());
            }
            gVar.mo7150x(Float.parseFloat((String) Assertions.m10153e(matcher.group(1))));
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append(str2);
        throw new SubtitleDecoderException(sb3.toString());
    }

    /* renamed from: G */
    private static C1143b m9648G(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String str = "http://www.w3.org/ns/ttml#parameter";
        String attributeValue = xmlPullParser.getAttributeValue(str, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] D0 = Util.m10244D0(attributeValue2, " ");
            if (D0.length == 2) {
                f = ((float) Integer.parseInt(D0[0])) / ((float) Integer.parseInt(D0[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C1143b bVar = f7990v;
        int i = bVar.f7996b;
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = bVar.f7997c;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C1143b(((float) parseInt) * f, i, i2);
    }

    /* renamed from: H */
    private static Map<String, TtmlStyle> m9649H(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, C1142a aVar, C1144c cVar, Map<String, TtmlRegion> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            String str = "style";
            if (XmlPullParserUtil.m10334e(xmlPullParser, str)) {
                String a = XmlPullParserUtil.m10330a(xmlPullParser, str);
                TtmlStyle M = m9654M(xmlPullParser, new TtmlStyle());
                if (a != null) {
                    for (String str2 : m9655N(a)) {
                        M.mo7128a((TtmlStyle) map.get(str2));
                    }
                }
                String g = M.mo7134g();
                if (g != null) {
                    map.put(g, M);
                }
            } else if (XmlPullParserUtil.m10334e(xmlPullParser, "region")) {
                TtmlRegion K = m9652K(xmlPullParser, aVar, cVar);
                if (K != null) {
                    map2.put(K.f8013a, K);
                }
            } else if (XmlPullParserUtil.m10334e(xmlPullParser, "metadata")) {
                m9650I(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.m10332c(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: I */
    private static void m9650I(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.m10334e(xmlPullParser, "image")) {
                String a = XmlPullParserUtil.m10330a(xmlPullParser, "id");
                if (a != null) {
                    map.put(a, xmlPullParser.nextText());
                }
            }
        } while (!XmlPullParserUtil.m10332c(xmlPullParser, "metadata"));
    }

    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.p100k2.p107t.TtmlNode m9651J(org.xmlpull.v1.XmlPullParser r19, p067c.p068a.p069a.p070a.p100k2.p107t.TtmlNode r20, java.util.Map<java.lang.String, p067c.p068a.p069a.p070a.p100k2.p107t.TtmlRegion> r21, p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder.C1143b r22) throws p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException {
        /*
            r0 = r19
            r9 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            c.a.a.a.k2.t.g r5 = m9654M(r0, r3)
            java.lang.String r8 = ""
            r11 = r3
            r10 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r11
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00b4
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            r4.hashCode()
            int r18 = r4.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0071;
                case 99841: goto L_0x0066;
                case 100571: goto L_0x005b;
                case 93616297: goto L_0x0050;
                case 109780401: goto L_0x0045;
                case 1292595405: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            r7 = -1
            goto L_0x007b
        L_0x003a:
            java.lang.String r7 = "backgroundImage"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0043
            goto L_0x0038
        L_0x0043:
            r7 = 5
            goto L_0x007b
        L_0x0045:
            java.lang.String r7 = "style"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x004e
            goto L_0x0038
        L_0x004e:
            r7 = 4
            goto L_0x007b
        L_0x0050:
            java.lang.String r7 = "begin"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0059
            goto L_0x0038
        L_0x0059:
            r7 = 3
            goto L_0x007b
        L_0x005b:
            java.lang.String r7 = "end"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0064
            goto L_0x0038
        L_0x0064:
            r7 = 2
            goto L_0x007b
        L_0x0066:
            java.lang.String r7 = "dur"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x006f
            goto L_0x0038
        L_0x006f:
            r7 = 1
            goto L_0x007b
        L_0x0071:
            java.lang.String r7 = "region"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x007a
            goto L_0x0038
        L_0x007a:
            r7 = 0
        L_0x007b:
            switch(r7) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00a2;
                case 2: goto L_0x009d;
                case 3: goto L_0x0096;
                case 4: goto L_0x008d;
                case 5: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x009a
        L_0x007f:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x009a
            r4 = 1
            java.lang.String r11 = r6.substring(r4)
            goto L_0x009a
        L_0x008d:
            java.lang.String[] r4 = m9655N(r6)
            int r6 = r4.length
            if (r6 <= 0) goto L_0x009a
            r8 = r4
            goto L_0x009a
        L_0x0096:
            long r12 = m9656O(r6, r1)
        L_0x009a:
            r4 = r21
            goto L_0x00b0
        L_0x009d:
            long r14 = m9656O(r6, r1)
            goto L_0x009a
        L_0x00a2:
            long r16 = m9656O(r6, r1)
            goto L_0x009a
        L_0x00a7:
            r4 = r21
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x00b0
            r10 = r6
        L_0x00b0:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00b4:
            if (r9 == 0) goto L_0x00cc
            long r1 = r9.f8003d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d1
            int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00c6
            long r12 = r12 + r1
        L_0x00c6:
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d1
            long r14 = r14 + r1
            goto L_0x00d1
        L_0x00cc:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00d1:
            r1 = r12
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00e9
            int r6 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00df
            long r16 = r1 + r16
            r3 = r16
            goto L_0x00ea
        L_0x00df:
            if (r9 == 0) goto L_0x00e9
            long r6 = r9.f8004e
            int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00e9
            r3 = r6
            goto L_0x00ea
        L_0x00e9:
            r3 = r14
        L_0x00ea:
            java.lang.String r0 = r19.getName()
            r6 = r8
            r7 = r10
            r8 = r11
            r9 = r20
            c.a.a.a.k2.t.d r0 = p067c.p068a.p069a.p070a.p100k2.p107t.TtmlNode.m9660c(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder.m9651J(org.xmlpull.v1.XmlPullParser, c.a.a.a.k2.t.d, java.util.Map, c.a.a.a.k2.t.c$b):c.a.a.a.k2.t.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a7, code lost:
        if (r0.equals("tb") == false) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.p100k2.p107t.TtmlRegion m9652K(org.xmlpull.v1.XmlPullParser r17, p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder.C1142a r18, p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder.C1144c r19) {
        /*
            r0 = r17
            r1 = r19
            java.lang.String r2 = "id"
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.XmlPullParserUtil.m10330a(r0, r2)
            r2 = 0
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r3 = "origin"
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.XmlPullParserUtil.m10330a(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L_0x0216
            java.util.regex.Pattern r6 = f7987s
            java.util.regex.Matcher r7 = r6.matcher(r3)
            java.util.regex.Pattern r8 = f7988t
            java.util.regex.Matcher r9 = r8.matcher(r3)
            boolean r10 = r7.matches()
            java.lang.String r11 = "Ignoring region with malformed origin: "
            java.lang.String r12 = "Ignoring region with missing tts:extent: "
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 2
            r15 = 1
            if (r10 == 0) goto L_0x0069
            java.lang.String r9 = r7.group(r15)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r9 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r9)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x0056 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0056 }
            float r9 = r9 / r13
            java.lang.String r7 = r7.group(r14)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r7 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = r7 / r13
            r16 = r9
            r9 = r7
            r7 = r16
            goto L_0x00aa
        L_0x0056:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x0069:
            boolean r7 = r9.matches()
            if (r7 == 0) goto L_0x0201
            if (r1 != 0) goto L_0x0084
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x0084:
            java.lang.String r7 = r9.group(r15)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.Object r7 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r7)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x01ee }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.String r9 = r9.group(r14)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.Object r9 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r9)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01ee }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01ee }
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x01ee }
            int r10 = r1.f7998a     // Catch:{ NumberFormatException -> 0x01ee }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01ee }
            float r7 = r7 / r10
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01ee }
            int r10 = r1.f7999b     // Catch:{ NumberFormatException -> 0x01ee }
            float r10 = (float) r10
            float r9 = r9 / r10
        L_0x00aa:
            java.lang.String r10 = "extent"
            java.lang.String r10 = p067c.p068a.p069a.p070a.p111m2.XmlPullParserUtil.m10330a(r0, r10)
            if (r10 == 0) goto L_0x01e8
            java.util.regex.Matcher r6 = r6.matcher(r10)
            java.util.regex.Matcher r8 = r8.matcher(r10)
            boolean r10 = r6.matches()
            java.lang.String r11 = "Ignoring region with malformed extent: "
            if (r10 == 0) goto L_0x00f5
            java.lang.String r1 = r6.group(r15)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00e2 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00e2 }
            float r1 = r1 / r13
            java.lang.String r6 = r6.group(r14)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.Object r6 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r6)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x00e2 }
            float r2 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x00e2 }
            float r2 = r2 / r13
            r10 = r2
            goto L_0x0138
        L_0x00e2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x00f5:
            boolean r6 = r8.matches()
            if (r6 == 0) goto L_0x01d3
            if (r1 != 0) goto L_0x0110
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x0110:
            java.lang.String r6 = r8.group(r15)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.Object r6 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r6)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x01c0 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.String r8 = r8.group(r14)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.Object r8 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r8)     // Catch:{ NumberFormatException -> 0x01c0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01c0 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01c0 }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x01c0 }
            int r10 = r1.f7998a     // Catch:{ NumberFormatException -> 0x01c0 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01c0 }
            float r6 = r6 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01c0 }
            int r1 = r1.f7999b     // Catch:{ NumberFormatException -> 0x01c0 }
            float r1 = (float) r1
            float r8 = r8 / r1
            r1 = r6
            r10 = r8
        L_0x0138:
            java.lang.String r2 = "displayAlign"
            java.lang.String r2 = p067c.p068a.p069a.p070a.p111m2.XmlPullParserUtil.m10330a(r0, r2)
            r3 = 0
            if (r2 == 0) goto L_0x0165
            java.lang.String r2 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r2)
            r2.hashCode()
            java.lang.String r5 = "center"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x015d
            java.lang.String r5 = "after"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0159
            goto L_0x0165
        L_0x0159:
            float r9 = r9 + r10
            r6 = r9
            r8 = 2
            goto L_0x0167
        L_0x015d:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r2
            float r9 = r9 + r2
            r6 = r9
            r8 = 1
            goto L_0x0167
        L_0x0165:
            r6 = r9
            r8 = 0
        L_0x0167:
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = r18
            int r5 = r5.f7994b
            float r5 = (float) r5
            float r12 = r2 / r5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r5 = "writingMode"
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.XmlPullParserUtil.m10330a(r0, r5)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r0)
            r0.hashCode()
            r5 = -1
            int r9 = r0.hashCode()
            switch(r9) {
                case 3694: goto L_0x01a1;
                case 3553396: goto L_0x0196;
                case 3553576: goto L_0x018b;
                default: goto L_0x0189;
            }
        L_0x0189:
            r3 = -1
            goto L_0x01aa
        L_0x018b:
            java.lang.String r3 = "tbrl"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0194
            goto L_0x0189
        L_0x0194:
            r3 = 2
            goto L_0x01aa
        L_0x0196:
            java.lang.String r3 = "tblr"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x019f
            goto L_0x0189
        L_0x019f:
            r3 = 1
            goto L_0x01aa
        L_0x01a1:
            java.lang.String r9 = "tb"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01aa
            goto L_0x0189
        L_0x01aa:
            switch(r3) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x01b0;
                case 2: goto L_0x01ae;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            goto L_0x01b2
        L_0x01ae:
            r13 = 1
            goto L_0x01b4
        L_0x01b0:
            r13 = 2
            goto L_0x01b4
        L_0x01b2:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01b4:
            c.a.a.a.k2.t.e r0 = new c.a.a.a.k2.t.e
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r7
            r7 = r2
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x01c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x01d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x01e8:
            java.lang.String r0 = "Ignoring region without an extent"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x01ee:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x0201:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        L_0x0216:
            java.lang.String r0 = "Ignoring region without an origin"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder.m9652K(org.xmlpull.v1.XmlPullParser, c.a.a.a.k2.t.c$a, c.a.a.a.k2.t.c$c):c.a.a.a.k2.t.e");
    }

    /* renamed from: L */
    private static float m9653L(String str) {
        Matcher matcher = f7986r.matcher(str);
        String str2 = "TtmlDecoder";
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid value for shear: ");
            sb.append(str);
            Log.m10386h(str2, sb.toString());
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.m10153e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to parse shear: ");
            sb2.append(str);
            Log.m10387i(str2, sb2.toString(), e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d1, code lost:
        if (r3.equals("start") == false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c8, code lost:
        if (r3.equals("text") == false) goto L_0x01c0;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.p100k2.p107t.TtmlStyle m9654M(org.xmlpull.v1.XmlPullParser r12, p067c.p068a.p069a.p070a.p100k2.p107t.TtmlStyle r13) {
        /*
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x033f
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            r4.hashCode()
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1550943582: goto L_0x00c1;
                case -1224696685: goto L_0x00b5;
                case -1065511464: goto L_0x00a9;
                case -879295043: goto L_0x009d;
                case -734428249: goto L_0x0092;
                case 3355: goto L_0x0087;
                case 3511770: goto L_0x007c;
                case 94842723: goto L_0x0071;
                case 109403361: goto L_0x0064;
                case 110138194: goto L_0x0057;
                case 365601008: goto L_0x004a;
                case 921125321: goto L_0x003d;
                case 1115953443: goto L_0x0030;
                case 1287124693: goto L_0x0023;
                default: goto L_0x0020;
            }
        L_0x0020:
            r4 = -1
            goto L_0x00cc
        L_0x0023:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002c
            goto L_0x0020
        L_0x002c:
            r4 = 13
            goto L_0x00cc
        L_0x0030:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0039
            goto L_0x0020
        L_0x0039:
            r4 = 12
            goto L_0x00cc
        L_0x003d:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0046
            goto L_0x0020
        L_0x0046:
            r4 = 11
            goto L_0x00cc
        L_0x004a:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0053
            goto L_0x0020
        L_0x0053:
            r4 = 10
            goto L_0x00cc
        L_0x0057:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0060
            goto L_0x0020
        L_0x0060:
            r4 = 9
            goto L_0x00cc
        L_0x0064:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006d
            goto L_0x0020
        L_0x006d:
            r4 = 8
            goto L_0x00cc
        L_0x0071:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007a
            goto L_0x0020
        L_0x007a:
            r4 = 7
            goto L_0x00cc
        L_0x007c:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0085
            goto L_0x0020
        L_0x0085:
            r4 = 6
            goto L_0x00cc
        L_0x0087:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0090
            goto L_0x0020
        L_0x0090:
            r4 = 5
            goto L_0x00cc
        L_0x0092:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x009b
            goto L_0x0020
        L_0x009b:
            r4 = 4
            goto L_0x00cc
        L_0x009d:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00a7
            goto L_0x0020
        L_0x00a7:
            r4 = 3
            goto L_0x00cc
        L_0x00a9:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00b3
            goto L_0x0020
        L_0x00b3:
            r4 = 2
            goto L_0x00cc
        L_0x00b5:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00bf
            goto L_0x0020
        L_0x00bf:
            r4 = 1
            goto L_0x00cc
        L_0x00c1:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00cb
            goto L_0x0020
        L_0x00cb:
            r4 = 0
        L_0x00cc:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x032d;
                case 1: goto L_0x0324;
                case 2: goto L_0x02bb;
                case 3: goto L_0x0254;
                case 4: goto L_0x0244;
                case 5: goto L_0x022e;
                case 6: goto L_0x01b2;
                case 7: goto L_0x018f;
                case 8: goto L_0x0181;
                case 9: goto L_0x0154;
                case 10: goto L_0x0135;
                case 11: goto L_0x0123;
                case 12: goto L_0x00f6;
                case 13: goto L_0x00d3;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x033b
        L_0x00d3:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            int r4 = p067c.p068a.p069a.p070a.p111m2.ColorParser.m10188c(r3)     // Catch:{ IllegalArgumentException -> 0x00e0 }
            r13.mo7146t(r4)     // Catch:{ IllegalArgumentException -> 0x00e0 }
            goto L_0x033b
        L_0x00e0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r3)
            goto L_0x033b
        L_0x00f6:
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r3)
            r3.hashCode()
            java.lang.String r4 = "before"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0119
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x010f
            goto L_0x033b
        L_0x010f:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7121C(r10)
            goto L_0x033b
        L_0x0119:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7121C(r11)
            goto L_0x033b
        L_0x0123:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r3)
            c.a.a.a.k2.t.b r3 = p067c.p068a.p069a.p070a.p100k2.p107t.TextEmphasis.m9642a(r3)
            c.a.a.a.k2.t.g r13 = r13.mo7126H(r3)
            goto L_0x033b
        L_0x0135:
            c.a.a.a.k2.t.g r13 = m9644C(r13)     // Catch:{ h -> 0x013e }
            m9647F(r3, r13)     // Catch:{ h -> 0x013e }
            goto L_0x033b
        L_0x013e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r3)
            goto L_0x033b
        L_0x0154:
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r3)
            r3.hashCode()
            java.lang.String r4 = "all"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0177
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x016d
            goto L_0x033b
        L_0x016d:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7125G(r1)
            goto L_0x033b
        L_0x0177:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7125G(r11)
            goto L_0x033b
        L_0x0181:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            float r3 = m9653L(r3)
            c.a.a.a.k2.t.g r13 = r13.mo7123E(r3)
            goto L_0x033b
        L_0x018f:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            int r4 = p067c.p068a.p069a.p070a.p111m2.ColorParser.m10188c(r3)     // Catch:{ IllegalArgumentException -> 0x019c }
            r13.mo7148v(r4)     // Catch:{ IllegalArgumentException -> 0x019c }
            goto L_0x033b
        L_0x019c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r3)
            goto L_0x033b
        L_0x01b2:
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L_0x01f7;
                case -410956671: goto L_0x01ec;
                case -250518009: goto L_0x01e1;
                case -136074796: goto L_0x01d6;
                case 3016401: goto L_0x01cb;
                case 3556653: goto L_0x01c2;
                default: goto L_0x01c0;
            }
        L_0x01c0:
            r6 = -1
            goto L_0x0201
        L_0x01c2:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0201
            goto L_0x01c0
        L_0x01cb:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01d4
            goto L_0x01c0
        L_0x01d4:
            r6 = 4
            goto L_0x0201
        L_0x01d6:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01df
            goto L_0x01c0
        L_0x01df:
            r6 = 3
            goto L_0x0201
        L_0x01e1:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01ea
            goto L_0x01c0
        L_0x01ea:
            r6 = 2
            goto L_0x0201
        L_0x01ec:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01f5
            goto L_0x01c0
        L_0x01f5:
            r6 = 1
            goto L_0x0201
        L_0x01f7:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0200
            goto L_0x01c0
        L_0x0200:
            r6 = 0
        L_0x0201:
            switch(r6) {
                case 0: goto L_0x0224;
                case 1: goto L_0x021a;
                case 2: goto L_0x0210;
                case 3: goto L_0x0206;
                case 4: goto L_0x0224;
                case 5: goto L_0x0206;
                default: goto L_0x0204;
            }
        L_0x0204:
            goto L_0x033b
        L_0x0206:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7122D(r9)
            goto L_0x033b
        L_0x0210:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7122D(r7)
            goto L_0x033b
        L_0x021a:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7122D(r11)
            goto L_0x033b
        L_0x0224:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7122D(r10)
            goto L_0x033b
        L_0x022e:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x033b
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7152z(r3)
            goto L_0x033b
        L_0x0244:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            c.a.a.a.k2.t.g r13 = r13.mo7147u(r3)
            goto L_0x033b
        L_0x0254:
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x0284;
                case -1026963764: goto L_0x0279;
                case 913457136: goto L_0x026e;
                case 1679736913: goto L_0x0263;
                default: goto L_0x0262;
            }
        L_0x0262:
            goto L_0x028e
        L_0x0263:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x026c
            goto L_0x028e
        L_0x026c:
            r8 = 3
            goto L_0x028e
        L_0x026e:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0277
            goto L_0x028e
        L_0x0277:
            r8 = 2
            goto L_0x028e
        L_0x0279:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0282
            goto L_0x028e
        L_0x0282:
            r8 = 1
            goto L_0x028e
        L_0x0284:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x028d
            goto L_0x028e
        L_0x028d:
            r8 = 0
        L_0x028e:
            switch(r8) {
                case 0: goto L_0x02b1;
                case 1: goto L_0x02a7;
                case 2: goto L_0x029d;
                case 3: goto L_0x0293;
                default: goto L_0x0291;
            }
        L_0x0291:
            goto L_0x033b
        L_0x0293:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7120B(r11)
            goto L_0x033b
        L_0x029d:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7120B(r1)
            goto L_0x033b
        L_0x02a7:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7127I(r11)
            goto L_0x033b
        L_0x02b1:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7127I(r1)
            goto L_0x033b
        L_0x02bb:
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10256J0(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x02f5;
                case 100571: goto L_0x02ea;
                case 3317767: goto L_0x02df;
                case 108511772: goto L_0x02d4;
                case 109757538: goto L_0x02cb;
                default: goto L_0x02c9;
            }
        L_0x02c9:
            r7 = -1
            goto L_0x02ff
        L_0x02cb:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02ff
            goto L_0x02c9
        L_0x02d4:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02dd
            goto L_0x02c9
        L_0x02dd:
            r7 = 3
            goto L_0x02ff
        L_0x02df:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02e8
            goto L_0x02c9
        L_0x02e8:
            r7 = 2
            goto L_0x02ff
        L_0x02ea:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02f3
            goto L_0x02c9
        L_0x02f3:
            r7 = 1
            goto L_0x02ff
        L_0x02f5:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02fe
            goto L_0x02c9
        L_0x02fe:
            r7 = 0
        L_0x02ff:
            switch(r7) {
                case 0: goto L_0x0319;
                case 1: goto L_0x030e;
                case 2: goto L_0x0303;
                case 3: goto L_0x030e;
                case 4: goto L_0x0303;
                default: goto L_0x0302;
            }
        L_0x0302:
            goto L_0x033b
        L_0x0303:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            c.a.a.a.k2.t.g r13 = r13.mo7124F(r3)
            goto L_0x033b
        L_0x030e:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            c.a.a.a.k2.t.g r13 = r13.mo7124F(r3)
            goto L_0x033b
        L_0x0319:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            c.a.a.a.k2.t.g r13 = r13.mo7124F(r3)
            goto L_0x033b
        L_0x0324:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            c.a.a.a.k2.t.g r13 = r13.mo7149w(r3)
            goto L_0x033b
        L_0x032d:
            c.a.a.a.k2.t.g r13 = m9644C(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            c.a.a.a.k2.t.g r13 = r13.mo7119A(r3)
        L_0x033b:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x033f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder.m9654M(org.xmlpull.v1.XmlPullParser, c.a.a.a.k2.t.g):c.a.a.a.k2.t.g");
    }

    /* renamed from: N */
    private static String[] m9655N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : Util.m10244D0(trim, "\\s+");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d1, code lost:
        if (r13.equals("ms") == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0108, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        r8 = r8 * r13;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m9656O(java.lang.String r13, p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder.C1143b r14) throws p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException {
        /*
            java.util.regex.Pattern r0 = f7983o
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x009a
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r9)
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            java.lang.Object r13 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x0062
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0063
        L_0x0062:
            r9 = r4
        L_0x0063:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0075
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f7995a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x0076
        L_0x0075:
            r9 = r4
        L_0x0076:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0095
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f7996b
            double r4 = (double) r13
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            float r13 = r14.f7995a
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r4 = r0 / r13
        L_0x0095:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x009a:
            java.util.regex.Pattern r0 = f7984p
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0127
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r13)
            java.lang.String r13 = (java.lang.String) r13
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r13)
            java.lang.String r13 = (java.lang.String) r13
            r13.hashCode()
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto L_0x00f5;
                case 104: goto L_0x00ea;
                case 109: goto L_0x00df;
                case 116: goto L_0x00d4;
                case 3494: goto L_0x00cb;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            r4 = -1
            goto L_0x00ff
        L_0x00cb:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00ff
            goto L_0x00c9
        L_0x00d4:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00dd
            goto L_0x00c9
        L_0x00dd:
            r4 = 3
            goto L_0x00ff
        L_0x00df:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00e8
            goto L_0x00c9
        L_0x00e8:
            r4 = 2
            goto L_0x00ff
        L_0x00ea:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00f3
            goto L_0x00c9
        L_0x00f3:
            r4 = 1
            goto L_0x00ff
        L_0x00f5:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00fe
            goto L_0x00c9
        L_0x00fe:
            r4 = 0
        L_0x00ff:
            switch(r4) {
                case 0: goto L_0x011c;
                case 1: goto L_0x0114;
                case 2: goto L_0x0111;
                case 3: goto L_0x010a;
                case 4: goto L_0x0103;
                default: goto L_0x0102;
            }
        L_0x0102:
            goto L_0x0123
        L_0x0103:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x0108:
            double r8 = r8 / r13
            goto L_0x0123
        L_0x010a:
            int r13 = r14.f7997c
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            goto L_0x0108
        L_0x0111:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0119
        L_0x0114:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0119:
            double r8 = r8 * r13
            goto L_0x0123
        L_0x011c:
            float r13 = r14.f7995a
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            goto L_0x0108
        L_0x0123:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x0127:
            c.a.a.a.k2.h r14 = new c.a.a.a.k2.h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            goto L_0x013f
        L_0x013e:
            throw r14
        L_0x013f:
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder.m9656O(java.lang.String, c.a.a.a.k2.t.c$b):long");
    }

    /* renamed from: P */
    private static C1144c m9657P(XmlPullParser xmlPullParser) {
        String a = XmlPullParserUtil.m10330a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = f7988t.matcher(a);
        String str = "TtmlDecoder";
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring non-pixel tts extent: ");
            sb.append(a);
            Log.m10386h(str, sb.toString());
            return null;
        }
        try {
            return new C1144c(Integer.parseInt((String) Assertions.m10153e(matcher.group(1))), Integer.parseInt((String) Assertions.m10153e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring malformed tts extent: ");
            sb2.append(a);
            Log.m10386h(str, sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Subtitle mo7059z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        C1143b bVar;
        String str = "";
        try {
            XmlPullParser newPullParser = this.f7992x.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(str, new TtmlRegion(str));
            C1144c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C1143b bVar2 = f7990v;
            C1142a aVar = f7991w;
            Subtitle fVar = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode dVar = (TtmlNode) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    String str2 = "tt";
                    if (eventType == 2) {
                        if (str2.equals(name)) {
                            bVar2 = m9648G(newPullParser);
                            aVar = m9646E(newPullParser, f7991w);
                            cVar = m9657P(newPullParser);
                        }
                        C1144c cVar2 = cVar;
                        C1143b bVar3 = bVar2;
                        C1142a aVar2 = aVar;
                        String str3 = "TtmlDecoder";
                        if (!m9645D(name)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring unsupported tag: ");
                            sb.append(newPullParser.getName());
                            Log.m10384f(str3, sb.toString());
                            i2++;
                            bVar2 = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                m9649H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    TtmlNode J = m9651J(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(J);
                                    if (dVar != null) {
                                        dVar.mo7112a(J);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.m10387i(str3, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.m10153e(dVar)).mo7112a(TtmlNode.m9661d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(str2)) {
                            fVar = new TtmlSubtitle((TtmlNode) Assertions.m10153e((TtmlNode) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (fVar != null) {
                return fVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
