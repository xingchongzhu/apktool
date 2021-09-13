package p067c.p068a.p069a.p070a.p088h2.p093m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.m.e */
public final class ChapterTocFrame extends Id3Frame {
    public static final Creator<ChapterTocFrame> CREATOR = new C1047a();

    /* renamed from: b */
    public final String f7282b;

    /* renamed from: c */
    public final boolean f7283c;

    /* renamed from: d */
    public final boolean f7284d;

    /* renamed from: e */
    public final String[] f7285e;

    /* renamed from: f */
    private final Id3Frame[] f7286f;

    /* renamed from: c.a.a.a.h2.m.e$a */
    /* compiled from: ChapterTocFrame */
    class C1047a implements Creator<ChapterTocFrame> {
        C1047a() {
        }

        /* renamed from: a */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        /* renamed from: b */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] iVarArr) {
        super("CTOC");
        this.f7282b = str;
        this.f7283c = z;
        this.f7284d = z2;
        this.f7285e = strArr;
        this.f7286f = iVarArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame eVar = (ChapterTocFrame) obj;
        if (this.f7283c != eVar.f7283c || this.f7284d != eVar.f7284d || !Util.m10279b(this.f7282b, eVar.f7282b) || !Arrays.equals(this.f7285e, eVar.f7285e) || !Arrays.equals(this.f7286f, eVar.f7286f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (((true + (this.f7283c ? 1 : 0)) * 31) + (this.f7284d ? 1 : 0)) * 31;
        String str = this.f7282b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7282b);
        parcel.writeByte(this.f7283c ? (byte) 1 : 0);
        parcel.writeByte(this.f7284d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f7285e);
        parcel.writeInt(this.f7286f.length);
        for (Id3Frame writeParcelable : this.f7286f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f7282b = (String) Util.m10293i(parcel.readString());
        boolean z = true;
        this.f7283c = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f7284d = z;
        this.f7285e = (String[]) Util.m10293i(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f7286f = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f7286f[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
