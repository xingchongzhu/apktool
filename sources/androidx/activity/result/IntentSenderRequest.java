package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.e */
public final class IntentSenderRequest implements Parcelable {
    public static final Creator<IntentSenderRequest> CREATOR = new C0039a();

    /* renamed from: a */
    private final IntentSender f148a;

    /* renamed from: b */
    private final Intent f149b;

    /* renamed from: c */
    private final int f150c;

    /* renamed from: d */
    private final int f151d;

    /* renamed from: androidx.activity.result.e$a */
    /* compiled from: IntentSenderRequest */
    class C0039a implements Creator<IntentSenderRequest> {
        C0039a() {
        }

        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* renamed from: androidx.activity.result.e$b */
    /* compiled from: IntentSenderRequest */
    public static final class C0040b {

        /* renamed from: a */
        private IntentSender f152a;

        /* renamed from: b */
        private Intent f153b;

        /* renamed from: c */
        private int f154c;

        /* renamed from: d */
        private int f155d;

        public C0040b(IntentSender intentSender) {
            this.f152a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest mo205a() {
            return new IntentSenderRequest(this.f152a, this.f153b, this.f154c, this.f155d);
        }

        /* renamed from: b */
        public C0040b mo206b(Intent intent) {
            this.f153b = intent;
            return this;
        }

        /* renamed from: c */
        public C0040b mo207c(int i, int i2) {
            this.f155d = i;
            this.f154c = i2;
            return this;
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f148a = intentSender;
        this.f149b = intent;
        this.f150c = i;
        this.f151d = i2;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public Intent mo196l() {
        return this.f149b;
    }

    /* renamed from: m */
    public int mo197m() {
        return this.f150c;
    }

    /* renamed from: n */
    public int mo198n() {
        return this.f151d;
    }

    /* renamed from: o */
    public IntentSender mo199o() {
        return this.f148a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f148a, i);
        parcel.writeParcelable(this.f149b, i);
        parcel.writeInt(this.f150c);
        parcel.writeInt(this.f151d);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f148a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f149b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f150c = parcel.readInt();
        this.f151d = parcel.readInt();
    }
}
