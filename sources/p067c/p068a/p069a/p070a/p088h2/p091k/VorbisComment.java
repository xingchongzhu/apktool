package p067c.p068a.p069a.p070a.p088h2.p091k;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.k.b */
public final class VorbisComment implements C1034b {
    public static final Creator<VorbisComment> CREATOR = new C1040a();

    /* renamed from: a */
    public final String f7256a;

    /* renamed from: b */
    public final String f7257b;

    /* renamed from: c.a.a.a.h2.k.b$a */
    /* compiled from: VorbisComment */
    class C1040a implements Creator<VorbisComment> {
        C1040a() {
        }

        /* renamed from: a */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        /* renamed from: b */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f7256a = str;
        this.f7257b = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment bVar = (VorbisComment) obj;
        if (!this.f7256a.equals(bVar.f7256a) || !this.f7257b.equals(bVar.f7257b)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        return ((527 + this.f7256a.hashCode()) * 31) + this.f7257b.hashCode();
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VC: ");
        sb.append(this.f7256a);
        sb.append("=");
        sb.append(this.f7257b);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7256a);
        parcel.writeString(this.f7257b);
    }

    VorbisComment(Parcel parcel) {
        this.f7256a = (String) Util.m10293i(parcel.readString());
        this.f7257b = (String) Util.m10293i(parcel.readString());
    }
}
