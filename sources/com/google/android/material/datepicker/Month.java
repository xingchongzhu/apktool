package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.android.material.datepicker.l */
final class Month implements Comparable<Month>, Parcelable {
    public static final Creator<Month> CREATOR = new C2014a();

    /* renamed from: a */
    private final Calendar f12924a;

    /* renamed from: b */
    final int f12925b;

    /* renamed from: c */
    final int f12926c;

    /* renamed from: d */
    final int f12927d;

    /* renamed from: e */
    final int f12928e;

    /* renamed from: f */
    final long f12929f;

    /* renamed from: g */
    private String f12930g;

    /* renamed from: com.google.android.material.datepicker.l$a */
    /* compiled from: Month */
    static class C2014a implements Creator<Month> {
        C2014a() {
        }

        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m15880m(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = UtcDates.m15928d(calendar);
        this.f12924a = d;
        this.f12925b = d.get(2);
        this.f12926c = d.get(1);
        this.f12927d = d.getMaximum(7);
        this.f12928e = d.getActualMaximum(5);
        this.f12929f = d.getTimeInMillis();
    }

    /* renamed from: m */
    static Month m15880m(int i, int i2) {
        Calendar k = UtcDates.m15935k();
        k.set(1, i);
        k.set(2, i2);
        return new Month(k);
    }

    /* renamed from: n */
    static Month m15881n(long j) {
        Calendar k = UtcDates.m15935k();
        k.setTimeInMillis(j);
        return new Month(k);
    }

    /* renamed from: o */
    static Month m15882o() {
        return new Month(UtcDates.m15933i());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month lVar = (Month) obj;
        if (!(this.f12925b == lVar.f12925b && this.f12926c == lVar.f12926c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12925b), Integer.valueOf(this.f12926c)});
    }

    /* renamed from: l */
    public int compareTo(Month lVar) {
        return this.f12924a.compareTo(lVar.f12924a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public int mo15658p() {
        int firstDayOfWeek = this.f12924a.get(7) - this.f12924a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f12927d : firstDayOfWeek;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public long mo15659q(int i) {
        Calendar d = UtcDates.m15928d(this.f12924a);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public int mo15660r(long j) {
        Calendar d = UtcDates.m15928d(this.f12924a);
        d.setTimeInMillis(j);
        return d.get(5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public String mo15661s(Context context) {
        if (this.f12930g == null) {
            this.f12930g = DateStrings.m15805c(context, this.f12924a.getTimeInMillis());
        }
        return this.f12930g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public long mo15662t() {
        return this.f12924a.getTimeInMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public Month mo15663u(int i) {
        Calendar d = UtcDates.m15928d(this.f12924a);
        d.add(2, i);
        return new Month(d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public int mo15664v(Month lVar) {
        if (this.f12924a instanceof GregorianCalendar) {
            return ((lVar.f12926c - this.f12926c) * 12) + (lVar.f12925b - this.f12925b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12926c);
        parcel.writeInt(this.f12925b);
    }
}
