package p067c.p068a.p069a.p070a.p088h2.p095o;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: c.a.a.a.h2.o.e */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Creator<SpliceNullCommand> CREATOR = new C1067a();

    /* renamed from: c.a.a.a.h2.o.e$a */
    /* compiled from: SpliceNullCommand */
    class C1067a implements Creator<SpliceNullCommand> {
        C1067a() {
        }

        /* renamed from: a */
        public SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        /* renamed from: b */
        public SpliceNullCommand[] newArray(int i) {
            return new SpliceNullCommand[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
