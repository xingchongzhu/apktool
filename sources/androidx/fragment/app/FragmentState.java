package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.t */
final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new C0350a();

    /* renamed from: a */
    final String f2477a;

    /* renamed from: b */
    final String f2478b;

    /* renamed from: c */
    final boolean f2479c;

    /* renamed from: d */
    final int f2480d;

    /* renamed from: e */
    final int f2481e;

    /* renamed from: f */
    final String f2482f;

    /* renamed from: g */
    final boolean f2483g;

    /* renamed from: h */
    final boolean f2484h;

    /* renamed from: i */
    final boolean f2485i;

    /* renamed from: j */
    final Bundle f2486j;

    /* renamed from: k */
    final boolean f2487k;

    /* renamed from: l */
    final int f2488l;

    /* renamed from: m */
    Bundle f2489m;

    /* renamed from: androidx.fragment.app.t$a */
    /* compiled from: FragmentState */
    class C0350a implements Creator<FragmentState> {
        C0350a() {
        }

        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Fragment fragment) {
        this.f2477a = fragment.getClass().getName();
        this.f2478b = fragment.f2159g;
        this.f2479c = fragment.f2167o;
        this.f2480d = fragment.f2176x;
        this.f2481e = fragment.f2177y;
        this.f2482f = fragment.f2178z;
        this.f2483g = fragment.f2129C;
        this.f2484h = fragment.f2166n;
        this.f2485i = fragment.f2128B;
        this.f2486j = fragment.f2160h;
        this.f2487k = fragment.f2127A;
        this.f2488l = fragment.f2145U.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2477a);
        sb.append(" (");
        sb.append(this.f2478b);
        sb.append(")}:");
        if (this.f2479c) {
            sb.append(" fromLayout");
        }
        if (this.f2481e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2481e));
        }
        String str = this.f2482f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2482f);
        }
        if (this.f2483g) {
            sb.append(" retainInstance");
        }
        if (this.f2484h) {
            sb.append(" removing");
        }
        if (this.f2485i) {
            sb.append(" detached");
        }
        if (this.f2487k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2477a);
        parcel.writeString(this.f2478b);
        parcel.writeInt(this.f2479c ? 1 : 0);
        parcel.writeInt(this.f2480d);
        parcel.writeInt(this.f2481e);
        parcel.writeString(this.f2482f);
        parcel.writeInt(this.f2483g ? 1 : 0);
        parcel.writeInt(this.f2484h ? 1 : 0);
        parcel.writeInt(this.f2485i ? 1 : 0);
        parcel.writeBundle(this.f2486j);
        parcel.writeInt(this.f2487k ? 1 : 0);
        parcel.writeBundle(this.f2489m);
        parcel.writeInt(this.f2488l);
    }

    FragmentState(Parcel parcel) {
        this.f2477a = parcel.readString();
        this.f2478b = parcel.readString();
        boolean z = true;
        this.f2479c = parcel.readInt() != 0;
        this.f2480d = parcel.readInt();
        this.f2481e = parcel.readInt();
        this.f2482f = parcel.readString();
        this.f2483g = parcel.readInt() != 0;
        this.f2484h = parcel.readInt() != 0;
        this.f2485i = parcel.readInt() != 0;
        this.f2486j = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f2487k = z;
        this.f2489m = parcel.readBundle();
        this.f2488l = parcel.readInt();
    }
}
