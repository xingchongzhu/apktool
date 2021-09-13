package p067c.p068a.p069a.p070a.p088h2.p095o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.o.a */
public final class PrivateCommand extends SpliceCommand {
    public static final Creator<PrivateCommand> CREATOR = new C1064a();

    /* renamed from: a */
    public final long f7331a;

    /* renamed from: b */
    public final long f7332b;

    /* renamed from: c */
    public final byte[] f7333c;

    /* renamed from: c.a.a.a.h2.o.a$a */
    /* compiled from: PrivateCommand */
    class C1064a implements Creator<PrivateCommand> {
        C1064a() {
        }

        /* renamed from: a */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        /* renamed from: b */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    /* synthetic */ PrivateCommand(Parcel parcel, C1064a aVar) {
        this(parcel);
    }

    /* renamed from: l */
    static PrivateCommand m8827l(ParsableByteArray a0Var, int i, long j) {
        long F = a0Var.mo7364F();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        a0Var.mo7385j(bArr, 0, i2);
        PrivateCommand aVar = new PrivateCommand(F, bArr, j);
        return aVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7331a);
        parcel.writeLong(this.f7332b);
        parcel.writeByteArray(this.f7333c);
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.f7331a = j2;
        this.f7332b = j;
        this.f7333c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f7331a = parcel.readLong();
        this.f7332b = parcel.readLong();
        this.f7333c = (byte[]) Util.m10293i(parcel.createByteArray());
    }
}
