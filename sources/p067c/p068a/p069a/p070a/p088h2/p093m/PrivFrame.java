package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.l */
public final class PrivFrame extends Id3Frame {
    public static final Creator<PrivFrame> CREATOR = new C1054a();

    /* renamed from: b */
    public final String f7308b;

    /* renamed from: c */
    public final byte[] f7309c;

    /* renamed from: c.a.a.a.h2.m.l$a */
    /* compiled from: PrivFrame */
    class C1054a implements Creator<PrivFrame> {
        C1054a() {
        }

        /* renamed from: a */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* renamed from: b */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f7308b = str;
        this.f7309c = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame lVar = (PrivFrame) obj;
        if (!Util.m10279b(this.f7308b, lVar.f7308b) || !Arrays.equals(this.f7309c, lVar.f7309c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f7308b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7309c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7299a);
        sb.append(": owner=");
        sb.append(this.f7308b);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7308b);
        parcel.writeByteArray(this.f7309c);
    }

    PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f7308b = (String) Util.m10293i(parcel.readString());
        this.f7309c = (byte[]) Util.m10293i(parcel.createByteArray());
    }
}
