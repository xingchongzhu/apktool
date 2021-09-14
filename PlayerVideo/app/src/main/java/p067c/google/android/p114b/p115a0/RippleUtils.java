package p067c.google.android.p114b.p115a0;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.StateSet;
import p010b.p034g.p035d.ColorUtils;

/* renamed from: c.a.a.b.a0.b */
public class RippleUtils {

    /* renamed from: a */
    public static final boolean f9053a = (VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f9054b = {16842919};

    /* renamed from: c */
    private static final int[] f9055c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f9056d = {16842908};

    /* renamed from: e */
    private static final int[] f9057e = {16843623};

    /* renamed from: f */
    private static final int[] f9058f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f9059g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f9060h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f9061i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f9062j = {16842913};

    /* renamed from: k */
    private static final int[] f9063k = {16842910, 16842919};

    /* renamed from: l */
    static final String f9064l = RippleUtils.class.getSimpleName();

    private RippleUtils() {
    }

    /* renamed from: a */
    public static ColorStateList m11250a(ColorStateList colorStateList) {
        if (f9053a) {
            return new ColorStateList(new int[][]{f9062j, StateSet.NOTHING}, new int[]{m11252c(colorStateList, f9058f), m11252c(colorStateList, f9054b)});
        }
        int[] iArr = f9058f;
        int[] iArr2 = f9059g;
        int[] iArr3 = f9060h;
        int[] iArr4 = f9061i;
        int[] iArr5 = f9054b;
        int[] iArr6 = f9055c;
        int[] iArr7 = f9056d;
        int[] iArr8 = f9057e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f9062j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m11252c(colorStateList, iArr), m11252c(colorStateList, iArr2), m11252c(colorStateList, iArr3), m11252c(colorStateList, iArr4), 0, m11252c(colorStateList, iArr5), m11252c(colorStateList, iArr6), m11252c(colorStateList, iArr7), m11252c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m11251b(int i) {
        return ColorUtils.m4970d(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: c */
    private static int m11252c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f9053a ? m11251b(colorForState) : colorForState;
    }

    /* renamed from: d */
    public static ColorStateList m11253d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f9063k, 0)) != 0) {
            Log.w(f9064l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m11254e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
