package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.b */
public final class ApicFrame extends Id3Frame {
    public static final Creator<ApicFrame> CREATOR = new C1044a();

    /* renamed from: b */
    public final String f7271b;

    /* renamed from: c */
    public final String f7272c;

    /* renamed from: d */
    public final int f7273d;

    /* renamed from: e */
    public final byte[] f7274e;

    /* renamed from: c.a.a.a.h2.m.b$a */
    /* compiled from: ApicFrame */
    class C1044a implements Creator<ApicFrame> {
        C1044a() {
        }

        /* renamed from: a */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        /* renamed from: b */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f7271b = str;
        this.f7272c = str2;
        this.f7273d = i;
        this.f7274e = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame bVar = (ApicFrame) obj;
        if (this.f7273d != bVar.f7273d || !Util.m10279b(this.f7271b, bVar.f7271b) || !Util.m10279b(this.f7272c, bVar.f7272c) || !Arrays.equals(this.f7274e, bVar.f7274e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (527 + this.f7273d) * 31;
        String str = this.f7271b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7272c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f7274e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7299a);
        sb.append(": mimeType=");
        sb.append(this.f7271b);
        sb.append(", description=");
        sb.append(this.f7272c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7271b);
        parcel.writeString(this.f7272c);
        parcel.writeInt(this.f7273d);
        parcel.writeByteArray(this.f7274e);
    }

    ApicFrame(Parcel parcel) {
        super("APIC");
        this.f7271b = (String) Util.m10293i(parcel.readString());
        this.f7272c = parcel.readString();
        this.f7273d = parcel.readInt();
        this.f7274e = (byte[]) Util.m10293i(parcel.createByteArray());
    }
}
