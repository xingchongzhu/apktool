package p067c.p068a.p069a.p070a.p075e2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.e2.t */
public final class DrmInitData implements Comparator<C0894b>, Parcelable {
    public static final Creator<DrmInitData> CREATOR = new C0893a();

    /* renamed from: a */
    private final C0894b[] f5918a;

    /* renamed from: b */
    private int f5919b;

    /* renamed from: c */
    public final String f5920c;

    /* renamed from: d */
    public final int f5921d;

    /* renamed from: c.a.a.a.e2.t$a */
    /* compiled from: DrmInitData */
    class C0893a implements Creator<DrmInitData> {
        C0893a() {
        }

        /* renamed from: a */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        /* renamed from: b */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    /* renamed from: c.a.a.a.e2.t$b */
    /* compiled from: DrmInitData */
    public static final class C0894b implements Parcelable {
        public static final Creator<C0894b> CREATOR = new C0895a();

        /* renamed from: a */
        private int f5922a;

        /* renamed from: b */
        public final UUID f5923b;

        /* renamed from: c */
        public final String f5924c;

        /* renamed from: d */
        public final String f5925d;

        /* renamed from: e */
        public final byte[] f5926e;

        /* renamed from: c.a.a.a.e2.t$b$a */
        /* compiled from: DrmInitData */
        class C0895a implements Creator<C0894b> {
            C0895a() {
            }

            /* renamed from: a */
            public C0894b createFromParcel(Parcel parcel) {
                return new C0894b(parcel);
            }

            /* renamed from: b */
            public C0894b[] newArray(int i) {
                return new C0894b[i];
            }
        }

        public C0894b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C0894b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C0894b bVar = (C0894b) obj;
            if (Util.m10279b(this.f5924c, bVar.f5924c) && Util.m10279b(this.f5925d, bVar.f5925d) && Util.m10279b(this.f5923b, bVar.f5923b) && Arrays.equals(this.f5926e, bVar.f5926e)) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            if (this.f5922a == 0) {
                int hashCode = this.f5923b.hashCode() * 31;
                String str = this.f5924c;
                this.f5922a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f5925d.hashCode()) * 31) + Arrays.hashCode(this.f5926e);
            }
            return this.f5922a;
        }

        /* renamed from: l */
        public C0894b mo6111l(byte[] bArr) {
            return new C0894b(this.f5923b, this.f5924c, this.f5925d, bArr);
        }

        /* renamed from: m */
        public boolean mo6112m() {
            return this.f5926e != null;
        }

        /* renamed from: n */
        public boolean mo6113n(UUID uuid) {
            return C.f7370a.equals(this.f5923b) || uuid.equals(this.f5923b);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f5923b.getMostSignificantBits());
            parcel.writeLong(this.f5923b.getLeastSignificantBits());
            parcel.writeString(this.f5924c);
            parcel.writeString(this.f5925d);
            parcel.writeByteArray(this.f5926e);
        }

        public C0894b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f5923b = (UUID) Assertions.m10153e(uuid);
            this.f5924c = str;
            this.f5925d = (String) Assertions.m10153e(str2);
            this.f5926e = bArr;
        }

        C0894b(Parcel parcel) {
            this.f5923b = new UUID(parcel.readLong(), parcel.readLong());
            this.f5924c = parcel.readString();
            this.f5925d = (String) Util.m10293i(parcel.readString());
            this.f5926e = parcel.createByteArray();
        }
    }

    public DrmInitData(List<C0894b> list) {
        this(null, false, (C0894b[]) list.toArray(new C0894b[0]));
    }

    /* renamed from: m */
    private static boolean m7154m(ArrayList<C0894b> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0894b) arrayList.get(i2)).f5923b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static DrmInitData m7155o(DrmInitData tVar, DrmInitData tVar2) {
        String str;
        C0894b[] bVarArr;
        C0894b[] bVarArr2;
        ArrayList arrayList = new ArrayList();
        if (tVar != null) {
            str = tVar.f5920c;
            for (C0894b bVar : tVar.f5918a) {
                if (bVar.mo6112m()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (tVar2 != null) {
            if (str == null) {
                str = tVar2.f5920c;
            }
            int size = arrayList.size();
            for (C0894b bVar2 : tVar2.f5918a) {
                if (bVar2.mo6112m() && !m7154m(arrayList, size, bVar2.f5923b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, (List<C0894b>) arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData tVar = (DrmInitData) obj;
        if (!Util.m10279b(this.f5920c, tVar.f5920c) || !Arrays.equals(this.f5918a, tVar.f5918a)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f5919b == 0) {
            String str = this.f5920c;
            this.f5919b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f5918a);
        }
        return this.f5919b;
    }

    /* renamed from: l */
    public int compare(C0894b bVar, C0894b bVar2) {
        UUID uuid = C.f7370a;
        if (uuid.equals(bVar.f5923b)) {
            return uuid.equals(bVar2.f5923b) ? 0 : 1;
        }
        return bVar.f5923b.compareTo(bVar2.f5923b);
    }

    /* renamed from: n */
    public DrmInitData mo6100n(String str) {
        if (Util.m10279b(this.f5920c, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f5918a);
    }

    /* renamed from: p */
    public C0894b mo6101p(int i) {
        return this.f5918a[i];
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p067c.p068a.p069a.p070a.p075e2.DrmInitData mo6102q(p067c.p068a.p069a.p070a.p075e2.DrmInitData r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f5920c
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r3.f5920c
            if (r1 == 0) goto L_0x0011
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r0)
            java.lang.String r0 = r2.f5920c
            if (r0 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = r3.f5920c
        L_0x001c:
            c.a.a.a.e2.t$b[] r1 = r2.f5918a
            c.a.a.a.e2.t$b[] r3 = r3.f5918a
            java.lang.Object[] r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10318u0(r1, r3)
            c.a.a.a.e2.t$b[] r3 = (p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b[]) r3
            c.a.a.a.e2.t r1 = new c.a.a.a.e2.t
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p075e2.DrmInitData.mo6102q(c.a.a.a.e2.t):c.a.a.a.e2.t");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5920c);
        parcel.writeTypedArray(this.f5918a, 0);
    }

    public DrmInitData(String str, List<C0894b> list) {
        this(str, false, (C0894b[]) list.toArray(new C0894b[0]));
    }

    public DrmInitData(C0894b... bVarArr) {
        this((String) null, bVarArr);
    }

    public DrmInitData(String str, C0894b... bVarArr) {
        this(str, true, bVarArr);
    }

    private DrmInitData(String str, boolean z, C0894b... bVarArr) {
        this.f5920c = str;
        if (z) {
            bVarArr = (C0894b[]) bVarArr.clone();
        }
        this.f5918a = bVarArr;
        this.f5921d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.f5920c = parcel.readString();
        C0894b[] bVarArr = (C0894b[]) Util.m10293i((C0894b[]) parcel.createTypedArray(C0894b.CREATOR));
        this.f5918a = bVarArr;
        this.f5921d = bVarArr.length;
    }
}
