package p067c.p068a.p069a.p070a.p088h2.p094n;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.n.b */
public final class MdtaMetadataEntry implements C1034b {
    public static final Creator<MdtaMetadataEntry> CREATOR = new C1058a();

    /* renamed from: a */
    public final String f7315a;

    /* renamed from: b */
    public final byte[] f7316b;

    /* renamed from: c */
    public final int f7317c;

    /* renamed from: d */
    public final int f7318d;

    /* renamed from: c.a.a.a.h2.n.b$a */
    /* compiled from: MdtaMetadataEntry */
    class C1058a implements Creator<MdtaMetadataEntry> {
        C1058a() {
        }

        /* renamed from: a */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        /* renamed from: b */
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    /* synthetic */ MdtaMetadataEntry(Parcel parcel, C1058a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry bVar = (MdtaMetadataEntry) obj;
        if (!this.f7315a.equals(bVar.f7315a) || !Arrays.equals(this.f7316b, bVar.f7316b) || this.f7317c != bVar.f7317c || this.f7318d != bVar.f7318d) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        return ((((((527 + this.f7315a.hashCode()) * 31) + Arrays.hashCode(this.f7316b)) * 31) + this.f7317c) * 31) + this.f7318d;
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("mdta: key=");
        sb.append(this.f7315a);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7315a);
        parcel.writeByteArray(this.f7316b);
        parcel.writeInt(this.f7317c);
        parcel.writeInt(this.f7318d);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f7315a = str;
        this.f7316b = bArr;
        this.f7317c = i;
        this.f7318d = i2;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f7315a = (String) Util.m10293i(parcel.readString());
        this.f7316b = (byte[]) Util.m10293i(parcel.createByteArray());
        this.f7317c = parcel.readInt();
        this.f7318d = parcel.readInt();
    }
}
