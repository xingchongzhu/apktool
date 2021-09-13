package androidx.core.content.p007c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p034g.C0575a;
import p010b.p034g.C0577c;

/* renamed from: androidx.core.content.c.a */
public final class ColorStateListInflaterCompat {
    /* renamed from: a */
    public static ColorStateList m1767a(Resources resources, XmlPullParser xmlPullParser, Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1768b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m1768b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m1770d(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: c */
    public static ColorStateList m1769c(Resources resources, int i, Theme theme) {
        try {
            return m1767a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* renamed from: d */
    private static ColorStateList m1770d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        AttributeSet attributeSet2 = attributeSet;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next != 2 || depth2 > depth || !xmlPullParser.getName().equals("item")) {
                Resources resources2 = resources;
                Theme theme2 = theme;
            } else {
                TypedArray f = m1772f(resources, theme, attributeSet2, C0577c.f4428a);
                int color = f.getColor(C0577c.f4429b, -65281);
                float f2 = 1.0f;
                int i3 = C0577c.f4430c;
                if (f.hasValue(i3)) {
                    f2 = f.getFloat(i3, 1.0f);
                } else {
                    int i4 = C0577c.f4431d;
                    if (f.hasValue(i4)) {
                        f2 = f.getFloat(i4, 1.0f);
                    }
                }
                f.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i5 = 0;
                for (int i6 = 0; i6 < attributeCount; i6++) {
                    int attributeNameResource = attributeSet2.getAttributeNameResource(i6);
                    if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0575a.f4373a)) {
                        int i7 = i5 + 1;
                        if (!attributeSet2.getAttributeBooleanValue(i6, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i5] = attributeNameResource;
                        i5 = i7;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i5);
                iArr2 = GrowingArrayUtils.m1808a(iArr2, i2, m1771e(color, f2));
                iArr = (int[][]) GrowingArrayUtils.m1809b(iArr, i2, trimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr4 = new int[i2];
        int[][] iArr5 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr4, 0, i2);
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        return new ColorStateList(iArr5, iArr4);
    }

    /* renamed from: e */
    private static int m1771e(int i, float f) {
        return (i & 16777215) | (Math.round(((float) Color.alpha(i)) * f) << 24);
    }

    /* renamed from: f */
    private static TypedArray m1772f(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
