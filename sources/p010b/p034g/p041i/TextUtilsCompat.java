package p010b.p034g.p041i;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: b.g.i.f */
public final class TextUtilsCompat {

    /* renamed from: a */
    private static final Locale f4586a;

    static {
        String str = "";
        f4586a = new Locale(str, str);
    }

    /* renamed from: a */
    private static int m5171a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m5172b(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f4586a)) {
            String c = ICUCompat.m5148c(locale);
            if (c == null) {
                return m5171a(locale);
            }
            if (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
