package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.g */
public final class GeobFrame extends Id3Frame {
    public static final Creator<GeobFrame> CREATOR = new C1049a();

    /* renamed from: b */
    public final String f7290b;

    /* renamed from: c */
    public final String f7291c;

    /* renamed from: d */
    public final String f7292d;

    /* renamed from: e */
    public final byte[] f7293e;

    /* renamed from: c.a.a.a.h2.m.g$a */
    /* compiled from: GeobFrame */
    class C1049a implements Creator<GeobFrame> {
        C1049a() {
        }

        /* renamed from: a */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        /* renamed from: b */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f7290b = str;
        this.f7291c = str2;
        this.f7292d = str3;
        this.f7293e = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame gVar = (GeobFrame) obj;
        if (!Util.m10279b(this.f7290b, gVar.f7290b) || !Util.m10279b(this.f7291c, gVar.f7291c) || !Util.m10279b(this.f7292d, gVar.f7292d) || !Arrays.equals(this.f7293e, gVar.f7293e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f7290b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7291c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7292d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f7293e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7299a);
        sb.append(": mimeType=");
        sb.append(this.f7290b);
        sb.append(", filename=");
        sb.append(this.f7291c);
        sb.append(", description=");
        sb.append(this.f7292d);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7290b);
        parcel.writeString(this.f7291c);
        parcel.writeString(this.f7292d);
        parcel.writeByteArray(this.f7293e);
    }

    GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f7290b = (String) Util.m10293i(parcel.readString());
        this.f7291c = (String) Util.m10293i(parcel.readString());
        this.f7292d = (String) Util.m10293i(parcel.readString());
        this.f7293e = (byte[]) Util.m10293i(parcel.createByteArray());
    }
}
