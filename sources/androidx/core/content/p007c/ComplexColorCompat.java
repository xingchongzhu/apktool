package androidx.core.content.p007c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.c.b */
public final class ComplexColorCompat {

    /* renamed from: a */
    private final Shader f1991a;

    /* renamed from: b */
    private final ColorStateList f1992b;

    /* renamed from: c */
    private int f1993c;

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i) {
        this.f1991a = shader;
        this.f1992b = colorStateList;
        this.f1993c = i;
    }

    /* renamed from: a */
    private static ComplexColorCompat m1773a(Resources resources, int i, Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return m1776d(GradientColorInflaterCompat.m1805b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m1775c(ColorStateListInflaterCompat.m1768b(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    static ComplexColorCompat m1774b(int i) {
        return new ComplexColorCompat(null, null, i);
    }

    /* renamed from: c */
    static ComplexColorCompat m1775c(ColorStateList colorStateList) {
        return new ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static ComplexColorCompat m1776d(Shader shader) {
        return new ComplexColorCompat(shader, null, 0);
    }

    /* renamed from: g */
    public static ComplexColorCompat m1777g(Resources resources, int i, Theme theme) {
        try {
            return m1773a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo2161e() {
        return this.f1993c;
    }

    /* renamed from: f */
    public Shader mo2162f() {
        return this.f1991a;
    }

    /* renamed from: h */
    public boolean mo2163h() {
        return this.f1991a != null;
    }

    /* renamed from: i */
    public boolean mo2164i() {
        if (this.f1991a == null) {
            ColorStateList colorStateList = this.f1992b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo2165j(int[] iArr) {
        if (mo2164i()) {
            ColorStateList colorStateList = this.f1992b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1993c) {
                this.f1993c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo2166k(int i) {
        this.f1993c = i;
    }

    /* renamed from: l */
    public boolean mo2167l() {
        return mo2163h() || this.f1993c != 0;
    }
}
