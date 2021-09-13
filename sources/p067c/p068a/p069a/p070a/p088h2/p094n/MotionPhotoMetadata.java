package p067c.p068a.p069a.p070a.p088h2.p094n;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p134b.p137c.Longs;

/* renamed from: c.a.a.a.h2.n.c */
public final class MotionPhotoMetadata implements C1034b {
    public static final Creator<MotionPhotoMetadata> CREATOR = new C1059a();

    /* renamed from: a */
    public final long f7319a;

    /* renamed from: b */
    public final long f7320b;

    /* renamed from: c */
    public final long f7321c;

    /* renamed from: d */
    public final long f7322d;

    /* renamed from: e */
    public final long f7323e;

    /* renamed from: c.a.a.a.h2.n.c$a */
    /* compiled from: MotionPhotoMetadata */
    class C1059a implements Creator<MotionPhotoMetadata> {
        C1059a() {
        }

        /* renamed from: a */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        /* renamed from: b */
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    }

    /* synthetic */ MotionPhotoMetadata(Parcel parcel, C1059a aVar) {
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
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata cVar = (MotionPhotoMetadata) obj;
        if (!(this.f7319a == cVar.f7319a && this.f7320b == cVar.f7320b && this.f7321c == cVar.f7321c && this.f7322d == cVar.f7322d && this.f7323e == cVar.f7323e)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        return ((((((((527 + Longs.m12047b(this.f7319a)) * 31) + Longs.m12047b(this.f7320b)) * 31) + Longs.m12047b(this.f7321c)) * 31) + Longs.m12047b(this.f7322d)) * 31) + Longs.m12047b(this.f7323e);
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(this.f7319a);
        sb.append(", photoSize=");
        sb.append(this.f7320b);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(this.f7321c);
        sb.append(", videoStartPosition=");
        sb.append(this.f7322d);
        sb.append(", videoSize=");
        sb.append(this.f7323e);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7319a);
        parcel.writeLong(this.f7320b);
        parcel.writeLong(this.f7321c);
        parcel.writeLong(this.f7322d);
        parcel.writeLong(this.f7323e);
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f7319a = j;
        this.f7320b = j2;
        this.f7321c = j3;
        this.f7322d = j4;
        this.f7323e = j5;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f7319a = parcel.readLong();
        this.f7320b = parcel.readLong();
        this.f7321c = parcel.readLong();
        this.f7322d = parcel.readLong();
        this.f7323e = parcel.readLong();
    }
}
