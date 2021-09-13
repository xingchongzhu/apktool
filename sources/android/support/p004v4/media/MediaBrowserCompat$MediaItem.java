package android.support.p004v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0005a();

    /* renamed from: a */
    private final int f10a;

    /* renamed from: b */
    private final MediaDescriptionCompat f11b;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    class C0005a implements Creator<MediaBrowserCompat$MediaItem> {
        C0005a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f10a = parcel.readInt();
        this.f11b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaItem{");
        sb.append("mFlags=");
        sb.append(this.f10a);
        sb.append(", mDescription=");
        sb.append(this.f11b);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10a);
        this.f11b.writeToParcel(parcel, i);
    }
}
