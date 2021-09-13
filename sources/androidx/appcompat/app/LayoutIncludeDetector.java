package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.app.i */
class LayoutIncludeDetector {

    /* renamed from: a */
    private final Deque<WeakReference<XmlPullParser>> f392a = new ArrayDeque();

    LayoutIncludeDetector() {
    }

    /* renamed from: b */
    private static boolean m449b(XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() == 3 || xmlPullParser.getEventType() == 1) {
                return true;
            }
            return false;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    /* renamed from: c */
    private static XmlPullParser m450c(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = (XmlPullParser) ((WeakReference) deque.peek()).get();
            if (!m449b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m451d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (!(xmlPullParser2 == null || xmlPullParser == xmlPullParser2)) {
            try {
                if (xmlPullParser2.getEventType() == 2) {
                    return "include".equals(xmlPullParser2.getName());
                }
            } catch (XmlPullParserException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo450a(AttributeSet attributeSet) {
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            if (xmlPullParser.getDepth() == 1) {
                XmlPullParser c = m450c(this.f392a);
                this.f392a.push(new WeakReference(xmlPullParser));
                if (m451d(xmlPullParser, c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
