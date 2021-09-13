package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p010b.p025d.ArrayMap;

/* renamed from: androidx.versionedparcelable.c */
class VersionedParcelParcel extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f3174d;

    /* renamed from: e */
    private final Parcel f3175e;

    /* renamed from: f */
    private final int f3176f;

    /* renamed from: g */
    private final int f3177g;

    /* renamed from: h */
    private final String f3178h;

    /* renamed from: i */
    private int f3179i;

    /* renamed from: j */
    private int f3180j;

    /* renamed from: k */
    private int f3181k;

    VersionedParcelParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        this(parcel2, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    /* renamed from: A */
    public void mo3946A(byte[] bArr) {
        if (bArr != null) {
            this.f3175e.writeInt(bArr.length);
            this.f3175e.writeByteArray(bArr);
            return;
        }
        this.f3175e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo3948C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3175e, 0);
    }

    /* renamed from: E */
    public void mo3950E(int i) {
        this.f3175e.writeInt(i);
    }

    /* renamed from: G */
    public void mo3952G(Parcelable parcelable) {
        this.f3175e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo3954I(String str) {
        this.f3175e.writeString(str);
    }

    /* renamed from: a */
    public void mo3959a() {
        int i = this.f3179i;
        if (i >= 0) {
            int i2 = this.f3174d.get(i);
            int dataPosition = this.f3175e.dataPosition();
            int i3 = dataPosition - i2;
            this.f3175e.setDataPosition(i2);
            this.f3175e.writeInt(i3);
            this.f3175e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public VersionedParcel mo3960b() {
        Parcel parcel = this.f3175e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3180j;
        if (i == this.f3176f) {
            i = this.f3177g;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3178h);
        sb.append("  ");
        VersionedParcelParcel cVar = new VersionedParcelParcel(parcel, dataPosition, i2, sb.toString(), this.f3171a, this.f3172b, this.f3173c);
        return cVar;
    }

    /* renamed from: g */
    public boolean mo3962g() {
        return this.f3175e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo3964i() {
        int readInt = this.f3175e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3175e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo3966k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3175e);
    }

    /* renamed from: m */
    public boolean mo3968m(int i) {
        while (true) {
            boolean z = true;
            if (this.f3180j < this.f3177g) {
                int i2 = this.f3181k;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                this.f3175e.setDataPosition(this.f3180j);
                int readInt = this.f3175e.readInt();
                this.f3181k = this.f3175e.readInt();
                this.f3180j += readInt;
            } else {
                if (this.f3181k != i) {
                    z = false;
                }
                return z;
            }
        }
    }

    /* renamed from: o */
    public int mo3970o() {
        return this.f3175e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo3972q() {
        return this.f3175e.readParcelable(VersionedParcelParcel.class.getClassLoader());
    }

    /* renamed from: s */
    public String mo3974s() {
        return this.f3175e.readString();
    }

    /* renamed from: w */
    public void mo3978w(int i) {
        mo3959a();
        this.f3179i = i;
        this.f3174d.put(i, this.f3175e.dataPosition());
        mo3950E(0);
        mo3950E(i);
    }

    /* renamed from: y */
    public void mo3980y(boolean z) {
        this.f3175e.writeInt(z ? 1 : 0);
    }

    private VersionedParcelParcel(Parcel parcel, int i, int i2, String str, ArrayMap<String, Method> aVar, ArrayMap<String, Method> aVar2, ArrayMap<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3174d = new SparseIntArray();
        this.f3179i = -1;
        this.f3180j = 0;
        this.f3181k = -1;
        this.f3175e = parcel;
        this.f3176f = i;
        this.f3177g = i2;
        this.f3180j = i;
        this.f3178h = str;
    }
}
