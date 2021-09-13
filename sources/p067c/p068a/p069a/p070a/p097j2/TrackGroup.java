package p067c.p068a.p069a.p070a.p097j2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.j2.p0 */
public final class TrackGroup implements Parcelable {
    public static final Creator<TrackGroup> CREATOR = new C1106a();

    /* renamed from: a */
    public final int f7606a;

    /* renamed from: b */
    private final Format[] f7607b;

    /* renamed from: c */
    private int f7608c;

    /* renamed from: c.a.a.a.j2.p0$a */
    /* compiled from: TrackGroup */
    class C1106a implements Creator<TrackGroup> {
        C1106a() {
        }

        /* renamed from: a */
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        /* renamed from: b */
        public TrackGroup[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... u0VarArr) {
        Assertions.m10154f(u0VarArr.length > 0);
        this.f7607b = u0VarArr;
        this.f7606a = u0VarArr.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup p0Var = (TrackGroup) obj;
        if (this.f7606a != p0Var.f7606a || !Arrays.equals(this.f7607b, p0Var.f7607b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f7608c == 0) {
            this.f7608c = 527 + Arrays.hashCode(this.f7607b);
        }
        return this.f7608c;
    }

    /* renamed from: l */
    public Format mo6977l(int i) {
        return this.f7607b[i];
    }

    /* renamed from: m */
    public int mo6978m(Format u0Var) {
        int i = 0;
        while (true) {
            Format[] u0VarArr = this.f7607b;
            if (i >= u0VarArr.length) {
                return -1;
            }
            if (u0Var == u0VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7606a);
        for (int i2 = 0; i2 < this.f7606a; i2++) {
            parcel.writeParcelable(this.f7607b[i2], 0);
        }
    }

    TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f7606a = readInt;
        this.f7607b = new Format[readInt];
        for (int i = 0; i < this.f7606a; i++) {
            this.f7607b[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
