package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.material.datepicker.CalendarConstraints.C1995c;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.f */
public class DateValidatorPointForward implements C1995c {
    public static final Creator<DateValidatorPointForward> CREATOR = new C1996a();

    /* renamed from: a */
    private final long f12856a;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* compiled from: DateValidatorPointForward */
    static class C1996a implements Creator<DateValidatorPointForward> {
        C1996a() {
        }

        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j, C1996a aVar) {
        this(j);
    }

    /* renamed from: l */
    public static DateValidatorPointForward m15808l(long j) {
        return new DateValidatorPointForward(j);
    }

    /* renamed from: d */
    public boolean mo15607d(long j) {
        return j >= this.f12856a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        if (this.f12856a != ((DateValidatorPointForward) obj).f12856a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f12856a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12856a);
    }

    private DateValidatorPointForward(long j) {
        this.f12856a = j;
    }
}
