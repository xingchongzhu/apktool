package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.j */
public final class InternalFrame extends Id3Frame {
    public static final Creator<InternalFrame> CREATOR = new C1052a();

    /* renamed from: b */
    public final String f7300b;

    /* renamed from: c */
    public final String f7301c;

    /* renamed from: d */
    public final String f7302d;

    /* renamed from: c.a.a.a.h2.m.j$a */
    /* compiled from: InternalFrame */
    class C1052a implements Creator<InternalFrame> {
        C1052a() {
        }

        /* renamed from: a */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        /* renamed from: b */
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f7300b = str;
        this.f7301c = str2;
        this.f7302d = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame jVar = (InternalFrame) obj;
        if (!Util.m10279b(this.f7301c, jVar.f7301c) || !Util.m10279b(this.f7300b, jVar.f7300b) || !Util.m10279b(this.f7302d, jVar.f7302d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f7300b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7301c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7302d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7299a);
        sb.append(": domain=");
        sb.append(this.f7300b);
        sb.append(", description=");
        sb.append(this.f7301c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7299a);
        parcel.writeString(this.f7300b);
        parcel.writeString(this.f7302d);
    }

    InternalFrame(Parcel parcel) {
        super("----");
        this.f7300b = (String) Util.m10293i(parcel.readString());
        this.f7301c = (String) Util.m10293i(parcel.readString());
        this.f7302d = (String) Util.m10293i(parcel.readString());
    }
}
