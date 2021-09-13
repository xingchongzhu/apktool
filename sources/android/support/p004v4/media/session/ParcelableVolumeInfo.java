package android.support.p004v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C0014a();

    /* renamed from: a */
    public int f50a;

    /* renamed from: b */
    public int f51b;

    /* renamed from: c */
    public int f52c;

    /* renamed from: d */
    public int f53d;

    /* renamed from: e */
    public int f54e;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    class C0014a implements Creator<ParcelableVolumeInfo> {
        C0014a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f50a = parcel.readInt();
        this.f52c = parcel.readInt();
        this.f53d = parcel.readInt();
        this.f54e = parcel.readInt();
        this.f51b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50a);
        parcel.writeInt(this.f52c);
        parcel.writeInt(this.f53d);
        parcel.writeInt(this.f54e);
        parcel.writeInt(this.f51b);
    }
}
