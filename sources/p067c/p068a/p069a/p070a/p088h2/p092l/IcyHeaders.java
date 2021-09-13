package p067c.p068a.p069a.p070a.p088h2.p092l;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.l.b */
public final class IcyHeaders implements C1034b {
    public static final Creator<IcyHeaders> CREATOR = new C1041a();

    /* renamed from: a */
    public final int f7261a;

    /* renamed from: b */
    public final String f7262b;

    /* renamed from: c */
    public final String f7263c;

    /* renamed from: d */
    public final String f7264d;

    /* renamed from: e */
    public final boolean f7265e;

    /* renamed from: f */
    public final int f7266f;

    /* renamed from: c.a.a.a.h2.l.b$a */
    /* compiled from: IcyHeaders */
    class C1041a implements Creator<IcyHeaders> {
        C1041a() {
        }

        /* renamed from: a */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        /* renamed from: b */
        public IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        Assertions.m10149a(i2 == -1 || i2 > 0);
        this.f7261a = i;
        this.f7262b = str;
        this.f7263c = str2;
        this.f7264d = str3;
        this.f7265e = z;
        this.f7266f = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p067c.p068a.p069a.p070a.p088h2.p092l.IcyHeaders m8743l(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0039 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = 1
            goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x003a }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x003a }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x003a }
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r2, r7)     // Catch:{ NumberFormatException -> 0x003a }
            r1 = 0
            r6 = -1
        L_0x0037:
            r7 = r6
            goto L_0x0053
        L_0x0039:
            r6 = -1
        L_0x003a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r2, r1)
            r7 = r6
            r1 = 0
            goto L_0x0053
        L_0x0051:
            r1 = 0
            r7 = -1
        L_0x0053:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0067
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r9 = r8
        L_0x0068:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x007b
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r10 = r8
        L_0x007c:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008f
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x0090
        L_0x008f:
            r11 = r8
        L_0x0090:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a9
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto L_0x00aa
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00ea
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d8 }
            if (r5 <= 0) goto L_0x00c2
            r3 = r5
            goto L_0x00d5
        L_0x00c2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.append(r13)     // Catch:{ NumberFormatException -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d7 }
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r2, r4)     // Catch:{ NumberFormatException -> 0x00d7 }
            r4 = r1
        L_0x00d5:
            r1 = r4
            goto L_0x00ea
        L_0x00d7:
            r3 = r5
        L_0x00d8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r2, r13)
        L_0x00ea:
            if (r1 == 0) goto L_0x00f8
            c.a.a.a.h2.l.b r13 = new c.a.a.a.h2.l.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00f8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p088h2.p092l.IcyHeaders.m8743l(java.util.Map):c.a.a.a.h2.l.b");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders bVar = (IcyHeaders) obj;
        if (this.f7261a != bVar.f7261a || !Util.m10279b(this.f7262b, bVar.f7262b) || !Util.m10279b(this.f7263c, bVar.f7263c) || !Util.m10279b(this.f7264d, bVar.f7264d) || this.f7265e != bVar.f7265e || this.f7266f != bVar.f7266f) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        int i = (527 + this.f7261a) * 31;
        String str = this.f7262b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7263c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7264d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f7265e ? 1 : 0)) * 31) + this.f7266f;
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IcyHeaders: name=\"");
        sb.append(this.f7263c);
        sb.append("\", genre=\"");
        sb.append(this.f7262b);
        sb.append("\", bitrate=");
        sb.append(this.f7261a);
        sb.append(", metadataInterval=");
        sb.append(this.f7266f);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7261a);
        parcel.writeString(this.f7262b);
        parcel.writeString(this.f7263c);
        parcel.writeString(this.f7264d);
        Util.m10264N0(parcel, this.f7265e);
        parcel.writeInt(this.f7266f);
    }

    IcyHeaders(Parcel parcel) {
        this.f7261a = parcel.readInt();
        this.f7262b = parcel.readString();
        this.f7263c = parcel.readString();
        this.f7264d = parcel.readString();
        this.f7265e = Util.m10328z0(parcel);
        this.f7266f = parcel.readInt();
    }
}
