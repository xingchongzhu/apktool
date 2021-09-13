package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.s */
class UtcDates {

    /* renamed from: a */
    static AtomicReference<TimeSource> f12951a = new AtomicReference<>();

    /* renamed from: a */
    static long m15925a(long j) {
        Calendar k = m15935k();
        k.setTimeInMillis(j);
        return m15928d(k).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    static DateFormat m15926b(Locale locale) {
        return m15927c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m15927c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m15934j());
        return instanceForSkeleton;
    }

    /* renamed from: d */
    static Calendar m15928d(Calendar calendar) {
        Calendar l = m15936l(calendar);
        Calendar k = m15935k();
        k.set(l.get(1), l.get(2), l.get(5));
        return k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m15929e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m15932h());
        return dateInstance;
    }

    /* renamed from: f */
    static java.text.DateFormat m15930f(Locale locale) {
        return m15929e(0, locale);
    }

    /* renamed from: g */
    static TimeSource m15931g() {
        TimeSource rVar = (TimeSource) f12951a.get();
        return rVar == null ? TimeSource.m15922c() : rVar;
    }

    /* renamed from: h */
    private static TimeZone m15932h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: i */
    static Calendar m15933i() {
        Calendar a = m15931g().mo15692a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m15932h());
        return a;
    }

    @TargetApi(24)
    /* renamed from: j */
    private static android.icu.util.TimeZone m15934j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: k */
    static Calendar m15935k() {
        return m15936l(null);
    }

    /* renamed from: l */
    static Calendar m15936l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m15932h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: m */
    static DateFormat m15937m(Locale locale) {
        return m15927c("yMMMEd", locale);
    }
}
