package p067c.p068a.p069a.p070a.p088h2.p095o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.h2.o.f */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Creator<SpliceScheduleCommand> CREATOR = new C1068a();

    /* renamed from: a */
    public final List<C1070c> f7353a;

    /* renamed from: c.a.a.a.h2.o.f$a */
    /* compiled from: SpliceScheduleCommand */
    class C1068a implements Creator<SpliceScheduleCommand> {
        C1068a() {
        }

        /* renamed from: a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        /* renamed from: b */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: c.a.a.a.h2.o.f$b */
    /* compiled from: SpliceScheduleCommand */
    public static final class C1069b {

        /* renamed from: a */
        public final int f7354a;

        /* renamed from: b */
        public final long f7355b;

        /* synthetic */ C1069b(int i, long j, C1068a aVar) {
            this(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static C1069b m8845c(Parcel parcel) {
            return new C1069b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m8846d(Parcel parcel) {
            parcel.writeInt(this.f7354a);
            parcel.writeLong(this.f7355b);
        }

        private C1069b(int i, long j) {
            this.f7354a = i;
            this.f7355b = j;
        }
    }

    /* renamed from: c.a.a.a.h2.o.f$c */
    /* compiled from: SpliceScheduleCommand */
    public static final class C1070c {

        /* renamed from: a */
        public final long f7356a;

        /* renamed from: b */
        public final boolean f7357b;

        /* renamed from: c */
        public final boolean f7358c;

        /* renamed from: d */
        public final boolean f7359d;

        /* renamed from: e */
        public final long f7360e;

        /* renamed from: f */
        public final List<C1069b> f7361f;

        /* renamed from: g */
        public final boolean f7362g;

        /* renamed from: h */
        public final long f7363h;

        /* renamed from: i */
        public final int f7364i;

        /* renamed from: j */
        public final int f7365j;

        /* renamed from: k */
        public final int f7366k;

        private C1070c(long j, boolean z, boolean z2, boolean z3, List<C1069b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f7356a = j;
            this.f7357b = z;
            this.f7358c = z2;
            this.f7359d = z3;
            this.f7361f = Collections.unmodifiableList(list);
            this.f7360e = j2;
            this.f7362g = z4;
            this.f7363h = j3;
            this.f7364i = i;
            this.f7365j = i2;
            this.f7366k = i3;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static C1070c m8850d(Parcel parcel) {
            return new C1070c(parcel);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static C1070c m8851e(ParsableByteArray a0Var) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long F = a0Var.mo7364F();
            boolean z5 = (a0Var.mo7362D() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int D = a0Var.mo7362D();
                boolean z6 = (D & 128) != 0;
                boolean z7 = (D & 64) != 0;
                boolean z8 = (D & 32) != 0;
                long F2 = z7 ? a0Var.mo7364F() : -9223372036854775807L;
                if (!z7) {
                    int D2 = a0Var.mo7362D();
                    ArrayList arrayList3 = new ArrayList(D2);
                    for (int i4 = 0; i4 < D2; i4++) {
                        arrayList3.add(new C1069b(a0Var.mo7362D(), a0Var.mo7364F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long D3 = (long) a0Var.mo7362D();
                    j3 = ((((D3 & 1) << 32) | a0Var.mo7364F()) * 1000) / 90;
                    z4 = (128 & D3) != 0;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int J = a0Var.mo7368J();
                int D4 = a0Var.mo7362D();
                z = z7;
                i = a0Var.mo7362D();
                j = j3;
                arrayList = arrayList2;
                long j4 = F2;
                i3 = J;
                i2 = D4;
                j2 = j4;
                boolean z9 = z6;
                z2 = z4;
                z3 = z9;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            C1070c cVar = new C1070c(F, z5, z3, z, arrayList, j2, z2, j, i3, i2, i);
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m8852f(Parcel parcel) {
            parcel.writeLong(this.f7356a);
            parcel.writeByte(this.f7357b ? (byte) 1 : 0);
            parcel.writeByte(this.f7358c ? (byte) 1 : 0);
            parcel.writeByte(this.f7359d ? (byte) 1 : 0);
            int size = this.f7361f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((C1069b) this.f7361f.get(i)).m8846d(parcel);
            }
            parcel.writeLong(this.f7360e);
            parcel.writeByte(this.f7362g ? (byte) 1 : 0);
            parcel.writeLong(this.f7363h);
            parcel.writeInt(this.f7364i);
            parcel.writeInt(this.f7365j);
            parcel.writeInt(this.f7366k);
        }

        private C1070c(Parcel parcel) {
            this.f7356a = parcel.readLong();
            boolean z = false;
            this.f7357b = parcel.readByte() == 1;
            this.f7358c = parcel.readByte() == 1;
            this.f7359d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C1069b.m8845c(parcel));
            }
            this.f7361f = Collections.unmodifiableList(arrayList);
            this.f7360e = parcel.readLong();
            if (parcel.readByte() == 1) {
                z = true;
            }
            this.f7362g = z;
            this.f7363h = parcel.readLong();
            this.f7364i = parcel.readInt();
            this.f7365j = parcel.readInt();
            this.f7366k = parcel.readInt();
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, C1068a aVar) {
        this(parcel);
    }

    /* renamed from: l */
    static SpliceScheduleCommand m8840l(ParsableByteArray a0Var) {
        int D = a0Var.mo7362D();
        ArrayList arrayList = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            arrayList.add(C1070c.m8851e(a0Var));
        }
        return new SpliceScheduleCommand((List<C1070c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f7353a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C1070c) this.f7353a.get(i2)).m8852f(parcel);
        }
    }

    private SpliceScheduleCommand(List<C1070c> list) {
        this.f7353a = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C1070c.m8850d(parcel));
        }
        this.f7353a = Collections.unmodifiableList(arrayList);
    }
}
