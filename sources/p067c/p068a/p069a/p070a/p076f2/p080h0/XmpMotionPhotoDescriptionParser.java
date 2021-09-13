package p067c.p068a.p069a.p070a.p076f2.p080h0;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.p080h0.MotionPhotoDescription.C0930a;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.XmlPullParserUtil;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableList.C1378a;

/* renamed from: c.a.a.a.f2.h0.e */
final class XmpMotionPhotoDescriptionParser {

    /* renamed from: a */
    private static final String[] f6150a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f6151b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f6152c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static MotionPhotoDescription m7493a(String str) throws IOException {
        try {
            return m7494b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.m10386h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static MotionPhotoDescription m7494b(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        String str2 = "x:xmpmeta";
        if (XmlPullParserUtil.m10334e(newPullParser, str2)) {
            long j = -9223372036854775807L;
            ImmutableList p = ImmutableList.m11917p();
            do {
                newPullParser.next();
                if (XmlPullParserUtil.m10334e(newPullParser, "rdf:Description")) {
                    if (!m7496d(newPullParser)) {
                        return null;
                    }
                    j = m7497e(newPullParser);
                    p = m7495c(newPullParser);
                } else if (XmlPullParserUtil.m10334e(newPullParser, "Container:Directory")) {
                    p = m7498f(newPullParser, "Container", "Item");
                } else if (XmlPullParserUtil.m10334e(newPullParser, "GContainer:Directory")) {
                    p = m7498f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!XmlPullParserUtil.m10332c(newPullParser, str2));
            if (p.isEmpty()) {
                return null;
            }
            return new MotionPhotoDescription(j, p);
        }
        throw new ParserException("Couldn't find xmp metadata");
    }

    /* renamed from: c */
    private static ImmutableList<C0930a> m7495c(XmlPullParser xmlPullParser) {
        for (String a : f6152c) {
            String a2 = XmlPullParserUtil.m10330a(xmlPullParser, a);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                C0930a aVar = new C0930a("image/jpeg", "Primary", 0, 0);
                C0930a aVar2 = new C0930a("video/mp4", "MotionPhoto", parseLong, 0);
                return ImmutableList.m11919r(aVar, aVar2);
            }
        }
        return ImmutableList.m11917p();
    }

    /* renamed from: d */
    private static boolean m7496d(XmlPullParser xmlPullParser) {
        boolean z = false;
        for (String a : f6150a) {
            String a2 = XmlPullParserUtil.m10330a(xmlPullParser, a);
            if (a2 != null) {
                if (Integer.parseInt(a2) == 1) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static long m7497e(XmlPullParser xmlPullParser) {
        String[] strArr = f6151b;
        int length = strArr.length;
        int i = 0;
        while (true) {
            long j = -9223372036854775807L;
            if (i >= length) {
                return -9223372036854775807L;
            }
            String a = XmlPullParserUtil.m10330a(xmlPullParser, strArr[i]);
            if (a != null) {
                long parseLong = Long.parseLong(a);
                if (parseLong != -1) {
                    j = parseLong;
                }
                return j;
            }
            i++;
        }
    }

    /* renamed from: f */
    private static ImmutableList<C0930a> m7498f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C1378a k = ImmutableList.m11914k();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":Item");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(":Directory");
        String sb4 = sb3.toString();
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.m10334e(xmlPullParser, sb2)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(":Mime");
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                sb7.append(":Semantic");
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(":Length");
                String sb10 = sb9.toString();
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str2);
                sb11.append(":Padding");
                String sb12 = sb11.toString();
                String a = XmlPullParserUtil.m10330a(xmlPullParser, sb6);
                String a2 = XmlPullParserUtil.m10330a(xmlPullParser, sb8);
                String a3 = XmlPullParserUtil.m10330a(xmlPullParser, sb10);
                String a4 = XmlPullParserUtil.m10330a(xmlPullParser, sb12);
                if (a == null || a2 == null) {
                    return ImmutableList.m11917p();
                }
                C0930a aVar = new C0930a(a, a2, a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0);
                k.mo8440d(aVar);
            }
        } while (!XmlPullParserUtil.m10332c(xmlPullParser, sb4));
        return k.mo8441e();
    }
}
