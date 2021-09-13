package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p010b.p034g.p042j.ObjectsCompat;

/* renamed from: com.google.android.material.datepicker.a */
public final class CalendarConstraints implements Parcelable {
    public static final Creator<CalendarConstraints> CREATOR = new C1993a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Month f12830a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Month f12831b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1995c f12832c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Month f12833d;

    /* renamed from: e */
    private final int f12834e;

    /* renamed from: f */
    private final int f12835f;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* compiled from: CalendarConstraints */
    static class C1993a implements Creator<CalendarConstraints> {
        C1993a() {
        }

        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            CalendarConstraints aVar = new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (C1995c) parcel.readParcelable(C1995c.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
            return aVar;
        }

        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* compiled from: CalendarConstraints */
    public static final class C1994b {

        /* renamed from: a */
        static final long f12836a = UtcDates.m15925a(Month.m15880m(1900, 0).f12929f);

        /* renamed from: b */
        static final long f12837b = UtcDates.m15925a(Month.m15880m(2100, 11).f12929f);

        /* renamed from: c */
        private long f12838c = f12836a;

        /* renamed from: d */
        private long f12839d = f12837b;

        /* renamed from: e */
        private Long f12840e;

        /* renamed from: f */
        private C1995c f12841f = DateValidatorPointForward.m15808l(Long.MIN_VALUE);

        C1994b(CalendarConstraints aVar) {
            this.f12838c = aVar.f12830a.f12929f;
            this.f12839d = aVar.f12831b.f12929f;
            this.f12840e = Long.valueOf(aVar.f12833d.f12929f);
            this.f12841f = aVar.f12832c;
        }

        /* renamed from: a */
        public CalendarConstraints mo15605a() {
            Month lVar;
            Bundle bundle = new Bundle();
            String str = "DEEP_COPY_VALIDATOR_KEY";
            bundle.putParcelable(str, this.f12841f);
            Month n = Month.m15881n(this.f12838c);
            Month n2 = Month.m15881n(this.f12839d);
            C1995c cVar = (C1995c) bundle.getParcelable(str);
            Long l = this.f12840e;
            if (l == null) {
                lVar = null;
            } else {
                lVar = Month.m15881n(l.longValue());
            }
            CalendarConstraints aVar = new CalendarConstraints(n, n2, cVar, lVar, null);
            return aVar;
        }

        /* renamed from: b */
        public C1994b mo15606b(long j) {
            this.f12840e = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    /* compiled from: CalendarConstraints */
    public interface C1995c extends Parcelable {
        /* renamed from: d */
        boolean mo15607d(long j);
    }

    /* synthetic */ CalendarConstraints(Month lVar, Month lVar2, C1995c cVar, Month lVar3, C1993a aVar) {
        this(lVar, lVar2, cVar, lVar3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints aVar = (CalendarConstraints) obj;
        if (!this.f12830a.equals(aVar.f12830a) || !this.f12831b.equals(aVar.f12831b) || !ObjectsCompat.m5175a(this.f12833d, aVar.f12833d) || !this.f12832c.equals(aVar.f12832c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12830a, this.f12831b, this.f12833d, this.f12832c});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public Month mo15593p(Month lVar) {
        if (lVar.compareTo(this.f12830a) < 0) {
            return this.f12830a;
        }
        if (lVar.compareTo(this.f12831b) > 0) {
            lVar = this.f12831b;
        }
        return lVar;
    }

    /* renamed from: q */
    public C1995c mo15594q() {
        return this.f12832c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public Month mo15595r() {
        return this.f12831b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public int mo15596s() {
        return this.f12835f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public Month mo15597t() {
        return this.f12833d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public Month mo15598u() {
        return this.f12830a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public int mo15599v() {
        return this.f12834e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f12830a, 0);
        parcel.writeParcelable(this.f12831b, 0);
        parcel.writeParcelable(this.f12833d, 0);
        parcel.writeParcelable(this.f12832c, 0);
    }

    private CalendarConstraints(Month lVar, Month lVar2, C1995c cVar, Month lVar3) {
        this.f12830a = lVar;
        this.f12831b = lVar2;
        this.f12833d = lVar3;
        this.f12832c = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (lVar3 == null || lVar3.compareTo(lVar2) <= 0) {
            this.f12835f = lVar.mo15664v(lVar2) + 1;
            this.f12834e = (lVar2.f12926c - lVar.f12926c) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
