package p067c.p068a.p069a.p070a.p088h2.p094n;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p135a.Objects;

/* renamed from: c.a.a.a.h2.n.d */
public final class SlowMotionData implements C1034b {
    public static final Creator<SlowMotionData> CREATOR = new C1060a();

    /* renamed from: a */
    public final List<C1061b> f7324a;

    /* renamed from: c.a.a.a.h2.n.d$a */
    /* compiled from: SlowMotionData */
    class C1060a implements Creator<SlowMotionData> {
        C1060a() {
        }

        /* renamed from: a */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C1061b.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        /* renamed from: b */
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    /* renamed from: c.a.a.a.h2.n.d$b */
    /* compiled from: SlowMotionData */
    public static final class C1061b implements Parcelable {
        public static final Creator<C1061b> CREATOR = new C1062a();

        /* renamed from: a */
        public static final Comparator<C1061b> f7325a = C1057a.f7314a;

        /* renamed from: b */
        public final long f7326b;

        /* renamed from: c */
        public final long f7327c;

        /* renamed from: d */
        public final int f7328d;

        /* renamed from: c.a.a.a.h2.n.d$b$a */
        /* compiled from: SlowMotionData */
        class C1062a implements Creator<C1061b> {
            C1062a() {
            }

            /* renamed from: a */
            public C1061b createFromParcel(Parcel parcel) {
                C1061b bVar = new C1061b(parcel.readLong(), parcel.readLong(), parcel.readInt());
                return bVar;
            }

            /* renamed from: b */
            public C1061b[] newArray(int i) {
                return new C1061b[i];
            }
        }

        public C1061b(long j, long j2, int i) {
            Assertions.m10149a(j < j2);
            this.f7326b = j;
            this.f7327c = j2;
            this.f7328d = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1061b.class != obj.getClass()) {
                return false;
            }
            C1061b bVar = (C1061b) obj;
            if (!(this.f7326b == bVar.f7326b && this.f7327c == bVar.f7327c && this.f7328d == bVar.f7328d)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return Objects.m11641b(Long.valueOf(this.f7326b), Long.valueOf(this.f7327c), Integer.valueOf(this.f7328d));
        }

        public String toString() {
            return Util.m10237A("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f7326b), Long.valueOf(this.f7327c), Integer.valueOf(this.f7328d));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7326b);
            parcel.writeLong(this.f7327c);
            parcel.writeInt(this.f7328d);
        }
    }

    public SlowMotionData(List<C1061b> list) {
        this.f7324a = list;
        Assertions.m10149a(!m8815l(list));
    }

    /* renamed from: l */
    private static boolean m8815l(List<C1061b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = ((C1061b) list.get(0)).f7327c;
        for (int i = 1; i < list.size(); i++) {
            if (((C1061b) list.get(i)).f7326b < j) {
                return true;
            }
            j = ((C1061b) list.get(i)).f7327c;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f7324a.equals(((SlowMotionData) obj).f7324a);
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        return this.f7324a.hashCode();
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SlowMotion: segments=");
        sb.append(this.f7324a);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f7324a);
    }
}
