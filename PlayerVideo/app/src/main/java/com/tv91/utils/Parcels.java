package com.tv91.utils;

import android.os.Parcel;
import java.util.Date;

/* renamed from: com.tv91.utils.e */
public final class Parcels {
    /* renamed from: a */
    public static boolean m20569a(Parcel parcel) {
        return parcel.readByte() == 1;
    }

    /* renamed from: b */
    public static Date m20570b(Parcel parcel) {
        long readLong = parcel.readLong();
        if (readLong != -1) {
            return new Date(readLong);
        }
        return null;
    }

    /* renamed from: c */
    public static void m20571c(Parcel parcel, boolean z) {
        parcel.writeByte(z ? (byte) 1 : 0);
    }

    /* renamed from: d */
    public static void m20572d(Parcel parcel, Date date) {
        parcel.writeLong(date == null ? -1 : date.getTime());
    }
}
