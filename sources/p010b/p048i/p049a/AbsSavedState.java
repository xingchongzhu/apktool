package p010b.p048i.p049a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: b.i.a.a */
public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new C0672b();

    /* renamed from: a */
    public static final AbsSavedState f4776a = new C0671a();

    /* renamed from: b */
    private final Parcelable f4777b;

    /* renamed from: b.i.a.a$a */
    /* compiled from: AbsSavedState */
    static class C0671a extends AbsSavedState {
        C0671a() {
            super((C0671a) null);
        }
    }

    /* renamed from: b.i.a.a$b */
    /* compiled from: AbsSavedState */
    static class C0672b implements ClassLoaderCreator<AbsSavedState> {
        C0672b() {
        }

        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f4776a;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    /* synthetic */ AbsSavedState(C0671a aVar) {
        this();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public final Parcelable mo5193l() {
        return this.f4777b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f4777b, i);
    }

    private AbsSavedState() {
        this.f4777b = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f4776a) {
                parcelable = null;
            }
            this.f4777b = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f4776a;
        }
        this.f4777b = readParcelable;
    }
}
