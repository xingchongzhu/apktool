package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.m */
public final class TextInformationFrame extends Id3Frame {
    public static final Creator<TextInformationFrame> CREATOR = new C1055a();

    /* renamed from: b */
    public final String f7310b;

    /* renamed from: c */
    public final String f7311c;

    /* renamed from: c.a.a.a.h2.m.m$a */
    /* compiled from: TextInformationFrame */
    class C1055a implements Creator<TextInformationFrame> {
        C1055a() {
        }

        /* renamed from: a */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* renamed from: b */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f7310b = str2;
        this.f7311c = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame mVar = (TextInformationFrame) obj;
        if (!this.f7299a.equals(mVar.f7299a) || !Util.m10279b(this.f7310b, mVar.f7310b) || !Util.m10279b(this.f7311c, mVar.f7311c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (527 + this.f7299a.hashCode()) * 31;
        String str = this.f7310b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7311c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7299a);
        sb.append(": description=");
        sb.append(this.f7310b);
        sb.append(": value=");
        sb.append(this.f7311c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7299a);
        parcel.writeString(this.f7310b);
        parcel.writeString(this.f7311c);
    }

    TextInformationFrame(Parcel parcel) {
        super((String) Util.m10293i(parcel.readString()));
        this.f7310b = parcel.readString();
        this.f7311c = (String) Util.m10293i(parcel.readString());
    }
}
