package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new C0486a();

    /* renamed from: a */
    private final VersionedParcelable f3170a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0486a implements Creator<ParcelImpl> {
        C0486a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f3170a = new VersionedParcelParcel(parcel).mo3976u();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public <T extends VersionedParcelable> T mo3940l() {
        return this.f3170a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new VersionedParcelParcel(parcel).mo3957L(this.f3170a);
    }
}
