package p067c.p068a.p069a.p070a.p088h2.p091k;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.k.a */
public final class PictureFrame implements C1034b {
    public static final Creator<PictureFrame> CREATOR = new C1039a();

    /* renamed from: a */
    public final int f7248a;

    /* renamed from: b */
    public final String f7249b;

    /* renamed from: c */
    public final String f7250c;

    /* renamed from: d */
    public final int f7251d;

    /* renamed from: e */
    public final int f7252e;

    /* renamed from: f */
    public final int f7253f;

    /* renamed from: g */
    public final int f7254g;

    /* renamed from: h */
    public final byte[] f7255h;

    /* renamed from: c.a.a.a.h2.k.a$a */
    /* compiled from: PictureFrame */
    class C1039a implements Creator<PictureFrame> {
        C1039a() {
        }

        /* renamed from: a */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        /* renamed from: b */
        public PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f7248a = i;
        this.f7249b = str;
        this.f7250c = str2;
        this.f7251d = i2;
        this.f7252e = i3;
        this.f7253f = i4;
        this.f7254g = i5;
        this.f7255h = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame aVar = (PictureFrame) obj;
        if (!(this.f7248a == aVar.f7248a && this.f7249b.equals(aVar.f7249b) && this.f7250c.equals(aVar.f7250c) && this.f7251d == aVar.f7251d && this.f7252e == aVar.f7252e && this.f7253f == aVar.f7253f && this.f7254g == aVar.f7254g && Arrays.equals(this.f7255h, aVar.f7255h))) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f7248a) * 31) + this.f7249b.hashCode()) * 31) + this.f7250c.hashCode()) * 31) + this.f7251d) * 31) + this.f7252e) * 31) + this.f7253f) * 31) + this.f7254g) * 31) + Arrays.hashCode(this.f7255h);
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Picture: mimeType=");
        sb.append(this.f7249b);
        sb.append(", description=");
        sb.append(this.f7250c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7248a);
        parcel.writeString(this.f7249b);
        parcel.writeString(this.f7250c);
        parcel.writeInt(this.f7251d);
        parcel.writeInt(this.f7252e);
        parcel.writeInt(this.f7253f);
        parcel.writeInt(this.f7254g);
        parcel.writeByteArray(this.f7255h);
    }

    PictureFrame(Parcel parcel) {
        this.f7248a = parcel.readInt();
        this.f7249b = (String) Util.m10293i(parcel.readString());
        this.f7250c = (String) Util.m10293i(parcel.readString());
        this.f7251d = parcel.readInt();
        this.f7252e = parcel.readInt();
        this.f7253f = parcel.readInt();
        this.f7254g = parcel.readInt();
        this.f7255h = (byte[]) Util.m10293i(parcel.createByteArray());
    }
}
