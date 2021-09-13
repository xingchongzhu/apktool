package p067c.p068a.p069a.p070a.p088h2.p090j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.j.a */
public final class EventMessage implements C1034b {
    public static final Creator<EventMessage> CREATOR = new C1038a();

    /* renamed from: a */
    private static final Format f7238a = new C1245b().mo7705e0("application/id3").mo7679E();

    /* renamed from: b */
    private static final Format f7239b = new C1245b().mo7705e0("application/x-scte35").mo7679E();

    /* renamed from: c */
    public final String f7240c;

    /* renamed from: d */
    public final String f7241d;

    /* renamed from: e */
    public final long f7242e;

    /* renamed from: f */
    public final long f7243f;

    /* renamed from: g */
    public final byte[] f7244g;

    /* renamed from: h */
    private int f7245h;

    /* renamed from: c.a.a.a.h2.j.a$a */
    /* compiled from: EventMessage */
    class C1038a implements Creator<EventMessage> {
        C1038a() {
        }

        /* renamed from: a */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* renamed from: b */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f7240c = str;
        this.f7241d = str2;
        this.f7242e = j;
        this.f7243f = j2;
        this.f7244g = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage aVar = (EventMessage) obj;
        if (this.f7242e != aVar.f7242e || this.f7243f != aVar.f7243f || !Util.m10279b(this.f7240c, aVar.f7240c) || !Util.m10279b(this.f7241d, aVar.f7241d) || !Arrays.equals(this.f7244g, aVar.f7244g)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public Format mo6559f() {
        String str = this.f7240c;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f7239b;
            case 1:
            case 2:
                return f7238a;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f7245h == 0) {
            String str = this.f7240c;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f7241d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            long j = this.f7242e;
            int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f7243f;
            this.f7245h = ((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f7244g);
        }
        return this.f7245h;
    }

    /* renamed from: i */
    public byte[] mo6560i() {
        if (mo6559f() != null) {
            return this.f7244g;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EMSG: scheme=");
        sb.append(this.f7240c);
        sb.append(", id=");
        sb.append(this.f7243f);
        sb.append(", durationMs=");
        sb.append(this.f7242e);
        sb.append(", value=");
        sb.append(this.f7241d);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7240c);
        parcel.writeString(this.f7241d);
        parcel.writeLong(this.f7242e);
        parcel.writeLong(this.f7243f);
        parcel.writeByteArray(this.f7244g);
    }

    EventMessage(Parcel parcel) {
        this.f7240c = (String) Util.m10293i(parcel.readString());
        this.f7241d = (String) Util.m10293i(parcel.readString());
        this.f7242e = parcel.readLong();
        this.f7243f = parcel.readLong();
        this.f7244g = (byte[]) Util.m10293i(parcel.createByteArray());
    }
}
