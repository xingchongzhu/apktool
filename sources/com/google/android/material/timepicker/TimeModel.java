package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: com.google.android.material.timepicker.c */
class TimeModel implements Parcelable {
    public static final Creator<TimeModel> CREATOR = new C2132a();

    /* renamed from: a */
    private final MaxInputValidator f13565a;

    /* renamed from: b */
    private final MaxInputValidator f13566b;

    /* renamed from: c */
    final int f13567c;

    /* renamed from: d */
    int f13568d;

    /* renamed from: e */
    int f13569e;

    /* renamed from: f */
    int f13570f;

    /* renamed from: g */
    int f13571g;

    /* renamed from: com.google.android.material.timepicker.c$a */
    /* compiled from: TimeModel */
    static class C2132a implements Creator<TimeModel> {
        C2132a() {
        }

        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: l */
    public static String m16633l(Resources resources, CharSequence charSequence) {
        return m16634m(resources, charSequence, "%02d");
    }

    /* renamed from: m */
    public static String m16634m(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: n */
    private static int m16635n(int i) {
        return i >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel cVar = (TimeModel) obj;
        if (!(this.f13568d == cVar.f13568d && this.f13569e == cVar.f13569e && this.f13567c == cVar.f13567c && this.f13570f == cVar.f13570f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13567c), Integer.valueOf(this.f13568d), Integer.valueOf(this.f13569e), Integer.valueOf(this.f13570f)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13568d);
        parcel.writeInt(this.f13569e);
        parcel.writeInt(this.f13570f);
        parcel.writeInt(this.f13567c);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f13568d = i;
        this.f13569e = i2;
        this.f13570f = i3;
        this.f13567c = i4;
        this.f13571g = m16635n(i);
        this.f13565a = new MaxInputValidator(59);
        this.f13566b = new MaxInputValidator(i4 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
