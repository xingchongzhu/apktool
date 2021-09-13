package p067c.p068a.p069a.p070a.p112n2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.n2.k */
public final class ColorInfo implements Parcelable {
    public static final Creator<ColorInfo> CREATOR = new C1215a();

    /* renamed from: a */
    public final int f8530a;

    /* renamed from: b */
    public final int f8531b;

    /* renamed from: c */
    public final int f8532c;

    /* renamed from: d */
    public final byte[] f8533d;

    /* renamed from: e */
    private int f8534e;

    /* renamed from: c.a.a.a.n2.k$a */
    /* compiled from: ColorInfo */
    class C1215a implements Creator<ColorInfo> {
        C1215a() {
        }

        /* renamed from: a */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        /* renamed from: b */
        public ColorInfo[] newArray(int i) {
            return new ColorInfo[i];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f8530a = i;
        this.f8531b = i2;
        this.f8532c = i3;
        this.f8533d = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo kVar = (ColorInfo) obj;
        if (!(this.f8530a == kVar.f8530a && this.f8531b == kVar.f8531b && this.f8532c == kVar.f8532c && Arrays.equals(this.f8533d, kVar.f8533d))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f8534e == 0) {
            this.f8534e = ((((((527 + this.f8530a) * 31) + this.f8531b) * 31) + this.f8532c) * 31) + Arrays.hashCode(this.f8533d);
        }
        return this.f8534e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f8530a);
        String str = ", ";
        sb.append(str);
        sb.append(this.f8531b);
        sb.append(str);
        sb.append(this.f8532c);
        sb.append(str);
        sb.append(this.f8533d != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8530a);
        parcel.writeInt(this.f8531b);
        parcel.writeInt(this.f8532c);
        Util.m10264N0(parcel, this.f8533d != null);
        byte[] bArr = this.f8533d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    ColorInfo(Parcel parcel) {
        this.f8530a = parcel.readInt();
        this.f8531b = parcel.readInt();
        this.f8532c = parcel.readInt();
        this.f8533d = Util.m10328z0(parcel) ? parcel.createByteArray() : null;
    }
}
