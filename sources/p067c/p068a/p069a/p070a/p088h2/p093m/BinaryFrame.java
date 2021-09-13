package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.c */
public final class BinaryFrame extends Id3Frame {
    public static final Creator<BinaryFrame> CREATOR = new C1045a();

    /* renamed from: b */
    public final byte[] f7275b;

    /* renamed from: c.a.a.a.h2.m.c$a */
    /* compiled from: BinaryFrame */
    class C1045a implements Creator<BinaryFrame> {
        C1045a() {
        }

        /* renamed from: a */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        /* renamed from: b */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f7275b = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame cVar = (BinaryFrame) obj;
        if (!this.f7299a.equals(cVar.f7299a) || !Arrays.equals(this.f7275b, cVar.f7275b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.f7299a.hashCode()) * 31) + Arrays.hashCode(this.f7275b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7299a);
        parcel.writeByteArray(this.f7275b);
    }

    BinaryFrame(Parcel parcel) {
        super((String) Util.m10293i(parcel.readString()));
        this.f7275b = (byte[]) Util.m10293i(parcel.createByteArray());
    }
}
