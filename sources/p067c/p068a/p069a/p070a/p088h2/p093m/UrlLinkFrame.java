package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.n */
public final class UrlLinkFrame extends Id3Frame {
    public static final Creator<UrlLinkFrame> CREATOR = new C1056a();

    /* renamed from: b */
    public final String f7312b;

    /* renamed from: c */
    public final String f7313c;

    /* renamed from: c.a.a.a.h2.m.n$a */
    /* compiled from: UrlLinkFrame */
    class C1056a implements Creator<UrlLinkFrame> {
        C1056a() {
        }

        /* renamed from: a */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        /* renamed from: b */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f7312b = str2;
        this.f7313c = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame nVar = (UrlLinkFrame) obj;
        if (!this.f7299a.equals(nVar.f7299a) || !Util.m10279b(this.f7312b, nVar.f7312b) || !Util.m10279b(this.f7313c, nVar.f7313c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (527 + this.f7299a.hashCode()) * 31;
        String str = this.f7312b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7313c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7299a);
        sb.append(": url=");
        sb.append(this.f7313c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7299a);
        parcel.writeString(this.f7312b);
        parcel.writeString(this.f7313c);
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) Util.m10293i(parcel.readString()));
        this.f7312b = parcel.readString();
        this.f7313c = (String) Util.m10293i(parcel.readString());
    }
}
