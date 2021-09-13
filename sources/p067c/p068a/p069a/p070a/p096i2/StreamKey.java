package p067c.p068a.p069a.p070a.p096i2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: c.a.a.a.i2.c */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Creator<StreamKey> CREATOR = new C1073a();

    /* renamed from: a */
    public final int f7381a;

    /* renamed from: b */
    public final int f7382b;

    /* renamed from: c */
    public final int f7383c;

    /* renamed from: c.a.a.a.i2.c$a */
    /* compiled from: StreamKey */
    class C1073a implements Creator<StreamKey> {
        C1073a() {
        }

        /* renamed from: a */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* renamed from: b */
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    StreamKey(Parcel parcel) {
        this.f7381a = parcel.readInt();
        this.f7382b = parcel.readInt();
        this.f7383c = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey cVar = (StreamKey) obj;
        if (!(this.f7381a == cVar.f7381a && this.f7382b == cVar.f7382b && this.f7383c == cVar.f7383c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((this.f7381a * 31) + this.f7382b) * 31) + this.f7383c;
    }

    /* renamed from: l */
    public int compareTo(StreamKey cVar) {
        int i = this.f7381a - cVar.f7381a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f7382b - cVar.f7382b;
        return i2 == 0 ? this.f7383c - cVar.f7383c : i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7381a);
        String str = ".";
        sb.append(str);
        sb.append(this.f7382b);
        sb.append(str);
        sb.append(this.f7383c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7381a);
        parcel.writeInt(this.f7382b);
        parcel.writeInt(this.f7383c);
    }
}
