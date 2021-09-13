package p067c.p068a.p069a.p070a.p088h2.p089i;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.h2.i.a */
public final class AppInfoTable implements C1034b {
    public static final Creator<AppInfoTable> CREATOR = new C1037a();

    /* renamed from: a */
    public final int f7236a;

    /* renamed from: b */
    public final String f7237b;

    /* renamed from: c.a.a.a.h2.i.a$a */
    /* compiled from: AppInfoTable */
    class C1037a implements Creator<AppInfoTable> {
        C1037a() {
        }

        /* renamed from: a */
        public AppInfoTable createFromParcel(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) Assertions.m10153e(parcel.readString()));
        }

        /* renamed from: b */
        public AppInfoTable[] newArray(int i) {
            return new AppInfoTable[i];
        }
    }

    public AppInfoTable(int i, String str) {
        this.f7236a = i;
        this.f7237b = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ait(controlCode=");
        sb.append(this.f7236a);
        sb.append(",url=");
        sb.append(this.f7237b);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7237b);
        parcel.writeInt(this.f7236a);
    }
}
