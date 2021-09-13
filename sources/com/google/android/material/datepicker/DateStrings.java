package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.e */
class DateStrings {
    /* renamed from: a */
    static String m15803a(long j) {
        return m15804b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m15804b(long j, Locale locale) {
        if (VERSION.SDK_INT >= 24) {
            return UtcDates.m15926b(locale).format(new Date(j));
        }
        return UtcDates.m15930f(locale).format(new Date(j));
    }

    /* renamed from: c */
    static String m15805c(Context context, long j) {
        return DateUtils.formatDateTime(context, j - ((long) TimeZone.getDefault().getOffset(j)), 36);
    }

    /* renamed from: d */
    static String m15806d(long j) {
        return m15807e(j, Locale.getDefault());
    }

    /* renamed from: e */
    static String m15807e(long j, Locale locale) {
        if (VERSION.SDK_INT >= 24) {
            return UtcDates.m15937m(locale).format(new Date(j));
        }
        return UtcDates.m15930f(locale).format(new Date(j));
    }
}
