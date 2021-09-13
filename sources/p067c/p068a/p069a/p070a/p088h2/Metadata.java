package p067c.p068a.p069a.p070a.p088h2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.a */
public final class Metadata implements Parcelable {
    public static final Creator<Metadata> CREATOR = new C1033a();

    /* renamed from: a */
    private final C1034b[] f7221a;

    /* renamed from: c.a.a.a.h2.a$a */
    /* compiled from: Metadata */
    class C1033a implements Creator<Metadata> {
        C1033a() {
        }

        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        /* renamed from: b */
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    /* renamed from: c.a.a.a.h2.a$b */
    /* compiled from: Metadata */
    public interface C1034b extends Parcelable {
        /* renamed from: f */
        Format mo6559f();

        /* renamed from: i */
        byte[] mo6560i();
    }

    public Metadata(C1034b... bVarArr) {
        this.f7221a = bVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7221a, ((Metadata) obj).f7221a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7221a);
    }

    /* renamed from: l */
    public Metadata mo6549l(C1034b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new Metadata((C1034b[]) Util.m10318u0(this.f7221a, bVarArr));
    }

    /* renamed from: m */
    public Metadata mo6550m(Metadata aVar) {
        return aVar == null ? this : mo6549l(aVar.f7221a);
    }

    /* renamed from: n */
    public C1034b mo6551n(int i) {
        return this.f7221a[i];
    }

    /* renamed from: o */
    public int mo6552o() {
        return this.f7221a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f7221a));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7221a.length);
        for (C1034b writeParcelable : this.f7221a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public Metadata(List<? extends C1034b> list) {
        this.f7221a = (C1034b[]) list.toArray(new C1034b[0]);
    }

    Metadata(Parcel parcel) {
        this.f7221a = new C1034b[parcel.readInt()];
        int i = 0;
        while (true) {
            C1034b[] bVarArr = this.f7221a;
            if (i < bVarArr.length) {
                bVarArr[i] = (C1034b) parcel.readParcelable(C1034b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
