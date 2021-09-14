package com.tv91.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.tv91.utils.a */
public final class Dates {
    /* renamed from: a */
    public static String m20556a(Date date) {
        return m20557b(date, "yyyy/MM/dd HH:mm:ss");
    }

    /* renamed from: b */
    public static String m20557b(Date date, String str) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(date);
    }

    /* renamed from: c */
    public static Date m20558c(String str) {
        return m20559d(str, "yyyy/MM/dd HH:mm:ss");
    }

    /* renamed from: d */
    public static Date m20559d(String str, String str2) {
        if (FragmentUtils.m20586g(str)) {
            return null;
        }
        try {
            return new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }
}
