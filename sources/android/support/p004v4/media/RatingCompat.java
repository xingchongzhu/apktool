package android.support.p004v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new C0009a();

    /* renamed from: a */
    private final int f35a;

    /* renamed from: b */
    private final float f36b;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    class C0009a implements Creator<RatingCompat> {
        C0009a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f35a = i;
        this.f36b = f;
    }

    public int describeContents() {
        return this.f35a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f35a);
        sb.append(" rating=");
        float f = this.f36b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35a);
        parcel.writeFloat(this.f36b);
    }
}
