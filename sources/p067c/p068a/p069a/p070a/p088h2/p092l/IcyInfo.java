package p067c.p068a.p069a.p070a.p088h2.p092l;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.h2.l.c */
public final class IcyInfo implements C1034b {
    public static final Creator<IcyInfo> CREATOR = new C1042a();

    /* renamed from: a */
    public final byte[] f7267a;

    /* renamed from: b */
    public final String f7268b;

    /* renamed from: c */
    public final String f7269c;

    /* renamed from: c.a.a.a.h2.l.c$a */
    /* compiled from: IcyInfo */
    class C1042a implements Creator<IcyInfo> {
        C1042a() {
        }

        /* renamed from: a */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        /* renamed from: b */
        public IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f7267a = bArr;
        this.f7268b = str;
        this.f7269c = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7267a, ((IcyInfo) obj).f7267a);
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7267a);
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f7268b, this.f7269c, Integer.valueOf(this.f7267a.length)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f7267a);
        parcel.writeString(this.f7268b);
        parcel.writeString(this.f7269c);
    }

    IcyInfo(Parcel parcel) {
        this.f7267a = (byte[]) Assertions.m10153e(parcel.createByteArray());
        this.f7268b = parcel.readString();
        this.f7269c = parcel.readString();
    }
}
