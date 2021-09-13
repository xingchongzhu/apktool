package androidx.core.content.p007c;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p034g.C0577c;

/* renamed from: androidx.core.content.c.d */
final class GradientColorInflaterCompat {

    /* renamed from: androidx.core.content.c.d$a */
    /* compiled from: GradientColorInflaterCompat */
    static final class C0256a {

        /* renamed from: a */
        final int[] f2005a;

        /* renamed from: b */
        final float[] f2006b;

        C0256a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2005a = new int[size];
            this.f2006b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2005a[i] = ((Integer) list.get(i)).intValue();
                this.f2006b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        C0256a(int i, int i2) {
            this.f2005a = new int[]{i, i2};
            this.f2006b = new float[]{0.0f, 1.0f};
        }

        C0256a(int i, int i2, int i3) {
            this.f2005a = new int[]{i, i2, i3};
            this.f2006b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    /* renamed from: a */
    private static C0256a m1804a(C0256a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C0256a(i, i3, i2);
        }
        return new C0256a(i, i2);
    }

    /* renamed from: b */
    static Shader m1805b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Theme theme2 = theme;
            TypedArray k = TypedArrayUtils.m1835k(resources, theme2, attributeSet, C0577c.f4451x);
            float f = TypedArrayUtils.m1830f(k, xmlPullParser2, "startX", C0577c.f4421G, 0.0f);
            float f2 = TypedArrayUtils.m1830f(k, xmlPullParser2, "startY", C0577c.f4422H, 0.0f);
            float f3 = TypedArrayUtils.m1830f(k, xmlPullParser2, "endX", C0577c.f4423I, 0.0f);
            float f4 = TypedArrayUtils.m1830f(k, xmlPullParser2, "endY", C0577c.f4424J, 0.0f);
            float f5 = TypedArrayUtils.m1830f(k, xmlPullParser2, "centerX", C0577c.f4416B, 0.0f);
            float f6 = TypedArrayUtils.m1830f(k, xmlPullParser2, "centerY", C0577c.f4417C, 0.0f);
            int g = TypedArrayUtils.m1831g(k, xmlPullParser2, "type", C0577c.f4415A, 0);
            int b = TypedArrayUtils.m1826b(k, xmlPullParser2, "startColor", C0577c.f4452y, 0);
            String str = "centerColor";
            boolean j = TypedArrayUtils.m1834j(xmlPullParser2, str);
            int b2 = TypedArrayUtils.m1826b(k, xmlPullParser2, str, C0577c.f4420F, 0);
            int b3 = TypedArrayUtils.m1826b(k, xmlPullParser2, "endColor", C0577c.f4453z, 0);
            int g2 = TypedArrayUtils.m1831g(k, xmlPullParser2, "tileMode", C0577c.f4419E, 0);
            float f7 = f5;
            float f8 = TypedArrayUtils.m1830f(k, xmlPullParser2, "gradientRadius", C0577c.f4418D, 0.0f);
            k.recycle();
            C0256a a = m1804a(m1806c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g == 1) {
                float f9 = f7;
                if (f8 > 0.0f) {
                    int[] iArr = a.f2005a;
                    RadialGradient radialGradient = new RadialGradient(f9, f6, f8, iArr, a.f2006b, m1807d(g2));
                    return radialGradient;
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g != 2) {
                LinearGradient linearGradient = new LinearGradient(f, f2, f3, f4, a.f2005a, a.f2006b, m1807d(g2));
                return linearGradient;
            } else {
                return new SweepGradient(f7, f6, a.f2005a, a.f2006b);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r11.toString());
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.p007c.GradientColorInflaterCompat.C0256a m1806c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p010b.p034g.C0577c.f4425K
            android.content.res.TypedArray r3 = androidx.core.content.p007c.TypedArrayUtils.m1835k(r9, r12, r11, r3)
            int r5 = p010b.p034g.C0577c.f4426L
            boolean r6 = r3.hasValue(r5)
            int r7 = p010b.p034g.C0577c.f4427M
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.c.d$a r9 = new androidx.core.content.c.d$a
            r9.<init>(r4, r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p007c.GradientColorInflaterCompat.m1806c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.c.d$a");
    }

    /* renamed from: d */
    private static TileMode m1807d(int i) {
        if (i == 1) {
            return TileMode.REPEAT;
        }
        if (i != 2) {
            return TileMode.CLAMP;
        }
        return TileMode.MIRROR;
    }
}
