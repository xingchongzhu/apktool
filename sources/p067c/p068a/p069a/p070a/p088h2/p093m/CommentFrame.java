package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.f */
public final class CommentFrame extends Id3Frame {
    public static final Creator<CommentFrame> CREATOR = new C1048a();

    /* renamed from: b */
    public final String f7287b;

    /* renamed from: c */
    public final String f7288c;

    /* renamed from: d */
    public final String f7289d;

    /* renamed from: c.a.a.a.h2.m.f$a */
    /* compiled from: CommentFrame */
    class C1048a implements Creator<CommentFrame> {
        C1048a() {
        }

        /* renamed from: a */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        /* renamed from: b */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f7287b = str;
        this.f7288c = str2;
        this.f7289d = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame fVar = (CommentFrame) obj;
        if (!Util.m10279b(this.f7288c, fVar.f7288c) || !Util.m10279b(this.f7287b, fVar.f7287b) || !Util.m10279b(this.f7289d, fVar.f7289d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f7287b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7288c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7289d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7299a);
        sb.append(": language=");
        sb.append(this.f7287b);
        sb.append(", description=");
        sb.append(this.f7288c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7299a);
        parcel.writeString(this.f7287b);
        parcel.writeString(this.f7289d);
    }

    CommentFrame(Parcel parcel) {
        super("COMM");
        this.f7287b = (String) Util.m10293i(parcel.readString());
        this.f7288c = (String) Util.m10293i(parcel.readString());
        this.f7289d = (String) Util.m10293i(parcel.readString());
    }
}
