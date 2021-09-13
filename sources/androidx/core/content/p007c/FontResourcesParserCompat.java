package androidx.core.content.p007c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.fasterxml.jackson.core.JsonLocation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p034g.C0577c;
import p010b.p034g.p040h.FontRequest;

/* renamed from: androidx.core.content.c.c */
public class FontResourcesParserCompat {

    /* renamed from: androidx.core.content.c.c$a */
    /* compiled from: FontResourcesParserCompat */
    public interface C0252a {
    }

    /* renamed from: androidx.core.content.c.c$b */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0253b implements C0252a {

        /* renamed from: a */
        private final C0254c[] f1994a;

        public C0253b(C0254c[] cVarArr) {
            this.f1994a = cVarArr;
        }

        /* renamed from: a */
        public C0254c[] mo2168a() {
            return this.f1994a;
        }
    }

    /* renamed from: androidx.core.content.c.c$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0254c {

        /* renamed from: a */
        private final String f1995a;

        /* renamed from: b */
        private int f1996b;

        /* renamed from: c */
        private boolean f1997c;

        /* renamed from: d */
        private String f1998d;

        /* renamed from: e */
        private int f1999e;

        /* renamed from: f */
        private int f2000f;

        public C0254c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1995a = str;
            this.f1996b = i;
            this.f1997c = z;
            this.f1998d = str2;
            this.f1999e = i2;
            this.f2000f = i3;
        }

        /* renamed from: a */
        public String mo2169a() {
            return this.f1995a;
        }

        /* renamed from: b */
        public int mo2170b() {
            return this.f2000f;
        }

        /* renamed from: c */
        public int mo2171c() {
            return this.f1999e;
        }

        /* renamed from: d */
        public String mo2172d() {
            return this.f1998d;
        }

        /* renamed from: e */
        public int mo2173e() {
            return this.f1996b;
        }

        /* renamed from: f */
        public boolean mo2174f() {
            return this.f1997c;
        }
    }

    /* renamed from: androidx.core.content.c.c$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0255d implements C0252a {

        /* renamed from: a */
        private final FontRequest f2001a;

        /* renamed from: b */
        private final int f2002b;

        /* renamed from: c */
        private final int f2003c;

        /* renamed from: d */
        private final String f2004d;

        public C0255d(FontRequest dVar, int i, int i2, String str) {
            this.f2001a = dVar;
            this.f2003c = i;
            this.f2002b = i2;
            this.f2004d = str;
        }

        /* renamed from: a */
        public int mo2175a() {
            return this.f2003c;
        }

        /* renamed from: b */
        public FontRequest mo2176b() {
            return this.f2001a;
        }

        /* renamed from: c */
        public String mo2177c() {
            return this.f2004d;
        }

        /* renamed from: d */
        public int mo2178d() {
            return this.f2002b;
        }
    }

    /* renamed from: a */
    private static int m1785a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static C0252a m1786b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1788d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m1787c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m1785a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1792h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1792h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C0252a m1788d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        String str = "font-family";
        xmlPullParser.require(2, null, str);
        if (xmlPullParser.getName().equals(str)) {
            return m1789e(xmlPullParser, resources);
        }
        m1791g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C0252a m1789e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0577c.f4432e);
        String string = obtainAttributes.getString(C0577c.f4433f);
        String string2 = obtainAttributes.getString(C0577c.f4437j);
        String string3 = obtainAttributes.getString(C0577c.f4438k);
        int resourceId = obtainAttributes.getResourceId(C0577c.f4434g, 0);
        int integer = obtainAttributes.getInteger(C0577c.f4435h, 1);
        int integer2 = obtainAttributes.getInteger(C0577c.f4436i, JsonLocation.MAX_CONTENT_SNIPPET);
        String string4 = obtainAttributes.getString(C0577c.f4439l);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1790f(xmlPullParser, resources));
                    } else {
                        m1791g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0253b((C0254c[]) arrayList.toArray(new C0254c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1791g(xmlPullParser);
        }
        return new C0255d(new FontRequest(string, string2, string3, m1787c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C0254c m1790f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0577c.f4440m);
        int i = C0577c.f4449v;
        if (!obtainAttributes.hasValue(i)) {
            i = C0577c.f4442o;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C0577c.f4447t;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C0577c.f4443p;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C0577c.f4450w;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C0577c.f4444q;
        }
        int i5 = C0577c.f4448u;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C0577c.f4445r;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C0577c.f4446s;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C0577c.f4441n;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1791g(xmlPullParser);
        }
        C0254c cVar = new C0254c(string2, i2, z, string, i6, resourceId);
        return cVar;
    }

    /* renamed from: g */
    private static void m1791g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m1792h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
