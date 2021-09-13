package p067c.p068a.p069a.p070a.p088h2.p095o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: c.a.a.a.h2.o.d */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Creator<SpliceInsertCommand> CREATOR = new C1065a();

    /* renamed from: a */
    public final long f7337a;

    /* renamed from: b */
    public final boolean f7338b;

    /* renamed from: c */
    public final boolean f7339c;

    /* renamed from: d */
    public final boolean f7340d;

    /* renamed from: e */
    public final boolean f7341e;

    /* renamed from: f */
    public final long f7342f;

    /* renamed from: g */
    public final long f7343g;

    /* renamed from: h */
    public final List<C1066b> f7344h;

    /* renamed from: i */
    public final boolean f7345i;

    /* renamed from: j */
    public final long f7346j;

    /* renamed from: k */
    public final int f7347k;

    /* renamed from: l */
    public final int f7348l;

    /* renamed from: m */
    public final int f7349m;

    /* renamed from: c.a.a.a.h2.o.d$a */
    /* compiled from: SpliceInsertCommand */
    class C1065a implements Creator<SpliceInsertCommand> {
        C1065a() {
        }

        /* renamed from: a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        /* renamed from: b */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: c.a.a.a.h2.o.d$b */
    /* compiled from: SpliceInsertCommand */
    public static final class C1066b {

        /* renamed from: a */
        public final int f7350a;

        /* renamed from: b */
        public final long f7351b;

        /* renamed from: c */
        public final long f7352c;

        /* synthetic */ C1066b(int i, long j, long j2, C1065a aVar) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C1066b m8836a(Parcel parcel) {
            C1066b bVar = new C1066b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            return bVar;
        }

        /* renamed from: b */
        public void mo6759b(Parcel parcel) {
            parcel.writeInt(this.f7350a);
            parcel.writeLong(this.f7351b);
            parcel.writeLong(this.f7352c);
        }

        private C1066b(int i, long j, long j2) {
            this.f7350a = i;
            this.f7351b = j;
            this.f7352c = j2;
        }
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, C1065a aVar) {
        this(parcel);
    }

    /* renamed from: l */
    static SpliceInsertCommand m8833l(ParsableByteArray a0Var, long j, TimestampAdjuster j0Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        TimestampAdjuster j0Var2 = j0Var;
        long F = a0Var.mo7364F();
        boolean z6 = (a0Var.mo7362D() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int D = a0Var.mo7362D();
            boolean z7 = (D & 128) != 0;
            boolean z8 = (D & 64) != 0;
            boolean z9 = (D & 32) != 0;
            boolean z10 = (D & 16) != 0;
            long m = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m8854m(a0Var, j);
            if (!z8) {
                int D2 = a0Var.mo7362D();
                List arrayList = new ArrayList(D2);
                for (int i4 = 0; i4 < D2; i4++) {
                    int D3 = a0Var.mo7362D();
                    long m2 = !z10 ? TimeSignalCommand.m8854m(a0Var, j) : -9223372036854775807L;
                    C1066b bVar = new C1066b(D3, m2, j0Var2.mo7447b(m2), null);
                    arrayList.add(bVar);
                }
                emptyList = arrayList;
            }
            if (z9) {
                long D4 = (long) a0Var.mo7362D();
                j4 = ((((D4 & 1) << 32) | a0Var.mo7364F()) * 1000) / 90;
                z5 = (128 & D4) != 0;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = a0Var.mo7368J();
            z = z8;
            i2 = a0Var.mo7362D();
            i = a0Var.mo7362D();
            list = emptyList;
            long j5 = m;
            z2 = z5;
            j2 = j4;
            z3 = z10;
            z4 = z7;
            j3 = j5;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        SpliceInsertCommand dVar = new SpliceInsertCommand(F, z6, z4, z, z3, j3, j0Var2.mo7447b(j3), list, z2, j2, i3, i2, i);
        return dVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7337a);
        parcel.writeByte(this.f7338b ? (byte) 1 : 0);
        parcel.writeByte(this.f7339c ? (byte) 1 : 0);
        parcel.writeByte(this.f7340d ? (byte) 1 : 0);
        parcel.writeByte(this.f7341e ? (byte) 1 : 0);
        parcel.writeLong(this.f7342f);
        parcel.writeLong(this.f7343g);
        int size = this.f7344h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C1066b) this.f7344h.get(i2)).mo6759b(parcel);
        }
        parcel.writeByte(this.f7345i ? (byte) 1 : 0);
        parcel.writeLong(this.f7346j);
        parcel.writeInt(this.f7347k);
        parcel.writeInt(this.f7348l);
        parcel.writeInt(this.f7349m);
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C1066b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f7337a = j;
        this.f7338b = z;
        this.f7339c = z2;
        this.f7340d = z3;
        this.f7341e = z4;
        this.f7342f = j2;
        this.f7343g = j3;
        this.f7344h = Collections.unmodifiableList(list);
        this.f7345i = z5;
        this.f7346j = j4;
        this.f7347k = i;
        this.f7348l = i2;
        this.f7349m = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f7337a = parcel.readLong();
        boolean z = false;
        this.f7338b = parcel.readByte() == 1;
        this.f7339c = parcel.readByte() == 1;
        this.f7340d = parcel.readByte() == 1;
        this.f7341e = parcel.readByte() == 1;
        this.f7342f = parcel.readLong();
        this.f7343g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C1066b.m8836a(parcel));
        }
        this.f7344h = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.f7345i = z;
        this.f7346j = parcel.readLong();
        this.f7347k = parcel.readInt();
        this.f7348l = parcel.readInt();
        this.f7349m = parcel.readInt();
    }
}
