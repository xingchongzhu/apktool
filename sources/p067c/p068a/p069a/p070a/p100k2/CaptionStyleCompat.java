package p067c.p068a.p069a.p070a.p100k2;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.b */
public final class CaptionStyleCompat {

    /* renamed from: a */
    public static final CaptionStyleCompat f7700a;

    /* renamed from: b */
    public final int f7701b;

    /* renamed from: c */
    public final int f7702c;

    /* renamed from: d */
    public final int f7703d;

    /* renamed from: e */
    public final int f7704e;

    /* renamed from: f */
    public final int f7705f;

    /* renamed from: g */
    public final Typeface f7706g;

    static {
        CaptionStyleCompat bVar = new CaptionStyleCompat(-1, -16777216, 0, 0, -1, null);
        f7700a = bVar;
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f7701b = i;
        this.f7702c = i2;
        this.f7703d = i3;
        this.f7704e = i4;
        this.f7705f = i5;
        this.f7706g = typeface;
    }

    /* renamed from: a */
    public static CaptionStyleCompat m9374a(CaptionStyle captionStyle) {
        if (Util.f8398a >= 21) {
            return m9376c(captionStyle);
        }
        return m9375b(captionStyle);
    }

    /* renamed from: b */
    private static CaptionStyleCompat m9375b(CaptionStyle captionStyle) {
        CaptionStyleCompat bVar = new CaptionStyleCompat(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
        return bVar;
    }

    /* renamed from: c */
    private static CaptionStyleCompat m9376c(CaptionStyle captionStyle) {
        CaptionStyleCompat bVar = new CaptionStyleCompat(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f7700a.f7701b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f7700a.f7702c, captionStyle.hasWindowColor() ? captionStyle.windowColor : f7700a.f7703d, captionStyle.hasEdgeType() ? captionStyle.edgeType : f7700a.f7704e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f7700a.f7705f, captionStyle.getTypeface());
        return bVar;
    }
}
