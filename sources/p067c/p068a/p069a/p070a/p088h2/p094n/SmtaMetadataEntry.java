package p067c.p068a.p069a.p070a.p088h2.p094n;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p134b.p137c.Floats;

/* renamed from: c.a.a.a.h2.n.e */
public final class SmtaMetadataEntry implements C1034b {
    public static final Creator<SmtaMetadataEntry> CREATOR = new C1063a();

    /* renamed from: a */
    public final float f7329a;

    /* renamed from: b */
    public final int f7330b;

    /* renamed from: c.a.a.a.h2.n.e$a */
    /* compiled from: SmtaMetadataEntry */
    class C1063a implements Creator<SmtaMetadataEntry> {
        C1063a() {
        }

        /* renamed from: a */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (C1063a) null);
        }

        /* renamed from: b */
        public SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    /* synthetic */ SmtaMetadataEntry(Parcel parcel, C1063a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry eVar = (SmtaMetadataEntry) obj;
        if (!(this.f7329a == eVar.f7329a && this.f7330b == eVar.f7330b)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        return ((527 + Floats.m12033a(this.f7329a)) * 31) + this.f7330b;
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("smta: captureFrameRate=");
        sb.append(this.f7329a);
        sb.append(", svcTemporalLayerCount=");
        sb.append(this.f7330b);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f7329a);
        parcel.writeInt(this.f7330b);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.f7329a = f;
        this.f7330b = i;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f7329a = parcel.readFloat();
        this.f7330b = parcel.readInt();
    }
}
