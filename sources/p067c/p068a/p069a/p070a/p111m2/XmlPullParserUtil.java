package p067c.p068a.p069a.p070a.p111m2;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: c.a.a.a.m2.n0 */
public final class XmlPullParserUtil {
    /* renamed from: a */
    public static String m10330a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m10331b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: c */
    public static boolean m10332c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m10331b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: d */
    public static boolean m10333d(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: e */
    public static boolean m10334e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m10333d(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
