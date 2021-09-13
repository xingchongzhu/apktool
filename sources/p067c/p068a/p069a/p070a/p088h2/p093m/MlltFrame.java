package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.k */
public final class MlltFrame extends Id3Frame {
    public static final Creator<MlltFrame> CREATOR = new C1053a();

    /* renamed from: b */
    public final int f7303b;

    /* renamed from: c */
    public final int f7304c;

    /* renamed from: d */
    public final int f7305d;

    /* renamed from: e */
    public final int[] f7306e;

    /* renamed from: f */
    public final int[] f7307f;

    /* renamed from: c.a.a.a.h2.m.k$a */
    /* compiled from: MlltFrame */
    class C1053a implements Creator<MlltFrame> {
        C1053a() {
        }

        /* renamed from: a */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        /* renamed from: b */
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f7303b = i;
        this.f7304c = i2;
        this.f7305d = i3;
        this.f7306e = iArr;
        this.f7307f = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame kVar = (MlltFrame) obj;
        if (!(this.f7303b == kVar.f7303b && this.f7304c == kVar.f7304c && this.f7305d == kVar.f7305d && Arrays.equals(this.f7306e, kVar.f7306e) && Arrays.equals(this.f7307f, kVar.f7307f))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + this.f7303b) * 31) + this.f7304c) * 31) + this.f7305d) * 31) + Arrays.hashCode(this.f7306e)) * 31) + Arrays.hashCode(this.f7307f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7303b);
        parcel.writeInt(this.f7304c);
        parcel.writeInt(this.f7305d);
        parcel.writeIntArray(this.f7306e);
        parcel.writeIntArray(this.f7307f);
    }

    MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f7303b = parcel.readInt();
        this.f7304c = parcel.readInt();
        this.f7305d = parcel.readInt();
        this.f7306e = (int[]) Util.m10293i(parcel.createIntArray());
        this.f7307f = (int[]) Util.m10293i(parcel.createIntArray());
    }
}
