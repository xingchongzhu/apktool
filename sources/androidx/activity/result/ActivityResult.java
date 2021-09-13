package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
public final class ActivityResult implements Parcelable {
    public static final Creator<ActivityResult> CREATOR = new C0038a();

    /* renamed from: a */
    private final int f146a;

    /* renamed from: b */
    private final Intent f147b;

    /* renamed from: androidx.activity.result.a$a */
    /* compiled from: ActivityResult */
    class C0038a implements Creator<ActivityResult> {
        C0038a() {
        }

        /* renamed from: a */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        /* renamed from: b */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f146a = i;
        this.f147b = intent;
    }

    /* renamed from: n */
    public static String m146n(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public Intent mo185l() {
        return this.f147b;
    }

    /* renamed from: m */
    public int mo186m() {
        return this.f146a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        sb.append(m146n(this.f146a));
        sb.append(", data=");
        sb.append(this.f147b);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f146a);
        parcel.writeInt(this.f147b == null ? 0 : 1);
        Intent intent = this.f147b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f146a = parcel.readInt();
        this.f147b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
