package androidx.core.content.p007c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.c.g */
public class TypedArrayUtils {
    /* renamed from: a */
    public static boolean m1825a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m1834j(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m1826b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1834j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m1827c(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i) {
        if (!m1834j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve attribute at index ");
            sb.append(i);
            sb.append(": ");
            sb.append(typedValue);
            throw new UnsupportedOperationException(sb.toString());
        } else if (i2 < 28 || i2 > 31) {
            return ColorStateListInflaterCompat.m1769c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m1828d(typedValue);
        }
    }

    /* renamed from: d */
    private static ColorStateList m1828d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static ComplexColorCompat m1829e(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        if (m1834j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return ComplexColorCompat.m1774b(typedValue.data);
            }
            ComplexColorCompat g = ComplexColorCompat.m1777g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return ComplexColorCompat.m1774b(i2);
    }

    /* renamed from: f */
    public static float m1830f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m1834j(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m1831g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1834j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m1832h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1834j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m1833i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1834j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m1834j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m1835k(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m1836l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1834j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
