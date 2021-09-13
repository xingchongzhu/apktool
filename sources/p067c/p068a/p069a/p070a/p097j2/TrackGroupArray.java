package p067c.p068a.p069a.p070a.p097j2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: c.a.a.a.j2.q0 */
public final class TrackGroupArray implements Parcelable {
    public static final Creator<TrackGroupArray> CREATOR = new C1107a();

    /* renamed from: a */
    public static final TrackGroupArray f7609a = new TrackGroupArray(new TrackGroup[0]);

    /* renamed from: b */
    public final int f7610b;

    /* renamed from: c */
    private final TrackGroup[] f7611c;

    /* renamed from: d */
    private int f7612d;

    /* renamed from: c.a.a.a.j2.q0$a */
    /* compiled from: TrackGroupArray */
    class C1107a implements Creator<TrackGroupArray> {
        C1107a() {
        }

        /* renamed from: a */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        /* renamed from: b */
        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(TrackGroup... p0VarArr) {
        this.f7611c = p0VarArr;
        this.f7610b = p0VarArr.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray q0Var = (TrackGroupArray) obj;
        if (this.f7610b != q0Var.f7610b || !Arrays.equals(this.f7611c, q0Var.f7611c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f7612d == 0) {
            this.f7612d = Arrays.hashCode(this.f7611c);
        }
        return this.f7612d;
    }

    /* renamed from: l */
    public TrackGroup mo6988l(int i) {
        return this.f7611c[i];
    }

    /* renamed from: m */
    public int mo6989m(TrackGroup p0Var) {
        for (int i = 0; i < this.f7610b; i++) {
            if (this.f7611c[i] == p0Var) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public boolean mo6990n() {
        return this.f7610b == 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7610b);
        for (int i2 = 0; i2 < this.f7610b; i2++) {
            parcel.writeParcelable(this.f7611c[i2], 0);
        }
    }

    TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f7610b = readInt;
        this.f7611c = new TrackGroup[readInt];
        for (int i = 0; i < this.f7610b; i++) {
            this.f7611c[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
