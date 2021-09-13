package p067c.p068a.p069a.p070a.p088h2.p095o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: c.a.a.a.h2.o.g */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Creator<TimeSignalCommand> CREATOR = new C1071a();

    /* renamed from: a */
    public final long f7367a;

    /* renamed from: b */
    public final long f7368b;

    /* renamed from: c.a.a.a.h2.o.g$a */
    /* compiled from: TimeSignalCommand */
    class C1071a implements Creator<TimeSignalCommand> {
        C1071a() {
        }

        /* renamed from: a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            TimeSignalCommand gVar = new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
            return gVar;
        }

        /* renamed from: b */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    /* synthetic */ TimeSignalCommand(long j, long j2, C1071a aVar) {
        this(j, j2);
    }

    /* renamed from: l */
    static TimeSignalCommand m8853l(ParsableByteArray a0Var, long j, TimestampAdjuster j0Var) {
        long m = m8854m(a0Var, j);
        return new TimeSignalCommand(m, j0Var.mo7447b(m));
    }

    /* renamed from: m */
    static long m8854m(ParsableByteArray a0Var, long j) {
        long D = (long) a0Var.mo7362D();
        if ((128 & D) != 0) {
            return 8589934591L & ((((D & 1) << 32) | a0Var.mo7364F()) + j);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7367a);
        parcel.writeLong(this.f7368b);
    }

    private TimeSignalCommand(long j, long j2) {
        this.f7367a = j;
        this.f7368b = j2;
    }
}
