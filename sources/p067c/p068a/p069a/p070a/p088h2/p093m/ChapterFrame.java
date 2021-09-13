package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.d */
public final class ChapterFrame extends Id3Frame {
    public static final Creator<ChapterFrame> CREATOR = new C1046a();

    /* renamed from: b */
    public final String f7276b;

    /* renamed from: c */
    public final int f7277c;

    /* renamed from: d */
    public final int f7278d;

    /* renamed from: e */
    public final long f7279e;

    /* renamed from: f */
    public final long f7280f;

    /* renamed from: g */
    private final Id3Frame[] f7281g;

    /* renamed from: c.a.a.a.h2.m.d$a */
    /* compiled from: ChapterFrame */
    class C1046a implements Creator<ChapterFrame> {
        C1046a() {
        }

        /* renamed from: a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* renamed from: b */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] iVarArr) {
        super("CHAP");
        this.f7276b = str;
        this.f7277c = i;
        this.f7278d = i2;
        this.f7279e = j;
        this.f7280f = j2;
        this.f7281g = iVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame dVar = (ChapterFrame) obj;
        if (!(this.f7277c == dVar.f7277c && this.f7278d == dVar.f7278d && this.f7279e == dVar.f7279e && this.f7280f == dVar.f7280f && Util.m10279b(this.f7276b, dVar.f7276b) && Arrays.equals(this.f7281g, dVar.f7281g))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (((((((527 + this.f7277c) * 31) + this.f7278d) * 31) + ((int) this.f7279e)) * 31) + ((int) this.f7280f)) * 31;
        String str = this.f7276b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7276b);
        parcel.writeInt(this.f7277c);
        parcel.writeInt(this.f7278d);
        parcel.writeLong(this.f7279e);
        parcel.writeLong(this.f7280f);
        parcel.writeInt(this.f7281g.length);
        for (Id3Frame writeParcelable : this.f7281g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f7276b = (String) Util.m10293i(parcel.readString());
        this.f7277c = parcel.readInt();
        this.f7278d = parcel.readInt();
        this.f7279e = parcel.readLong();
        this.f7280f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7281g = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f7281g[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
