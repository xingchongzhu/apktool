package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.p */
final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new C0348a();

    /* renamed from: a */
    ArrayList<FragmentState> f2461a;

    /* renamed from: b */
    ArrayList<String> f2462b;

    /* renamed from: c */
    BackStackState[] f2463c;

    /* renamed from: d */
    int f2464d;

    /* renamed from: e */
    String f2465e = null;

    /* renamed from: f */
    ArrayList<String> f2466f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<Bundle> f2467g = new ArrayList<>();

    /* renamed from: h */
    ArrayList<C0342m> f2468h;

    /* renamed from: androidx.fragment.app.p$a */
    /* compiled from: FragmentManagerState */
    class C0348a implements Creator<FragmentManagerState> {
        C0348a() {
        }

        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2461a);
        parcel.writeStringList(this.f2462b);
        parcel.writeTypedArray(this.f2463c, i);
        parcel.writeInt(this.f2464d);
        parcel.writeString(this.f2465e);
        parcel.writeStringList(this.f2466f);
        parcel.writeTypedList(this.f2467g);
        parcel.writeTypedList(this.f2468h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2461a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f2462b = parcel.createStringArrayList();
        this.f2463c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f2464d = parcel.readInt();
        this.f2465e = parcel.readString();
        this.f2466f = parcel.createStringArrayList();
        this.f2467g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2468h = parcel.createTypedArrayList(C0342m.CREATOR);
    }
}
