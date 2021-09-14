package com.tv91.utils;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: com.tv91.utils.g */
/* compiled from: Strings */
public final class FragmentUtils {

    /* renamed from: a */
    private static final DecimalFormat f16074a = new DecimalFormat("###,###");

    /* renamed from: a */
    public static byte[] m20580a(String str) {
        return Base64.decode(str, 0);
    }

    /* renamed from: b */
    public static boolean m20581b(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (!(charSequence == null || charSequence2 == null)) {
            int length = charSequence.length();
            if (length == charSequence2.length()) {
                if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
                    return charSequence.equals(charSequence2);
                }
                for (int i = 0; i < length; i++) {
                    if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static String m20582c(String str, Object... objArr) {
        if (m20586g(str)) {
            return "";
        }
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* renamed from: d */
    public static String m20583d(Number number) {
        return m20584e(number, "###,###");
    }

    /* renamed from: e */
    public static String m20584e(Number number, String str) {
        if (!m20581b(str, "###,###")) {
            f16074a.applyPattern(str);
        }
        return f16074a.format(number);
    }

    /* renamed from: f */
    public static String m20585f(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: g */
    public static boolean m20586g(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: h */
    public static boolean m20587h(String str) {
        int length = str.length();
        int indexOf = str.indexOf("@");
        int indexOf2 = str.indexOf(".");
        if (!(indexOf == -1 || indexOf == 0)) {
            int i = length - 1;
            if (!(indexOf == i || indexOf2 == -1 || indexOf2 == 0 || indexOf2 == i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static String m20588i(CharSequence charSequence) {
        try {
            return URLDecoder.decode(charSequence.toString(), Charset.defaultCharset().name());
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException(String.format("Fail to encode data with UTF-8: %s", new Object[]{charSequence}));
        }
    }

    /* renamed from: j */
    public static String m20589j(CharSequence charSequence) {
        try {
            return URLEncoder.encode(charSequence.toString(), Charset.defaultCharset().name());
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException(String.format("Fail to encode data with UTF-8: %s", new Object[]{charSequence}));
        }
    }
}
