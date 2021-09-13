package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2015b = bVar.mo3971p(iconCompat.f2015b, 1);
        iconCompat.f2017d = bVar.mo3965j(iconCompat.f2017d, 2);
        iconCompat.f2018e = bVar.mo3973r(iconCompat.f2018e, 3);
        iconCompat.f2019f = bVar.mo3971p(iconCompat.f2019f, 4);
        iconCompat.f2020g = bVar.mo3971p(iconCompat.f2020g, 5);
        iconCompat.f2021h = (ColorStateList) bVar.mo3973r(iconCompat.f2021h, 6);
        iconCompat.f2023j = bVar.mo3975t(iconCompat.f2023j, 7);
        iconCompat.f2024k = bVar.mo3975t(iconCompat.f2024k, 8);
        iconCompat.mo2184c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel bVar) {
        bVar.mo3979x(true, true);
        iconCompat.mo2185d(bVar.mo3961f());
        int i = iconCompat.f2015b;
        if (-1 != i) {
            bVar.mo3951F(i, 1);
        }
        byte[] bArr = iconCompat.f2017d;
        if (bArr != null) {
            bVar.mo3947B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2018e;
        if (parcelable != null) {
            bVar.mo3953H(parcelable, 3);
        }
        int i2 = iconCompat.f2019f;
        if (i2 != 0) {
            bVar.mo3951F(i2, 4);
        }
        int i3 = iconCompat.f2020g;
        if (i3 != 0) {
            bVar.mo3951F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2021h;
        if (colorStateList != null) {
            bVar.mo3953H(colorStateList, 6);
        }
        String str = iconCompat.f2023j;
        if (str != null) {
            bVar.mo3955J(str, 7);
        }
        String str2 = iconCompat.f2024k;
        if (str2 != null) {
            bVar.mo3955J(str2, 8);
        }
    }
}
