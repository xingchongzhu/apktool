package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.r */
class TimeSource {

    /* renamed from: a */
    private static final TimeSource f12948a = new TimeSource(null, null);

    /* renamed from: b */
    private final Long f12949b;

    /* renamed from: c */
    private final TimeZone f12950c;

    private TimeSource(Long l, TimeZone timeZone) {
        this.f12949b = l;
        this.f12950c = timeZone;
    }

    /* renamed from: c */
    static TimeSource m15922c() {
        return f12948a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Calendar mo15692a() {
        return mo15693b(this.f12950c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Calendar mo15693b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f12949b;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
