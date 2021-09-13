package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;

/* renamed from: com.google.android.exoplayer2.source.hls.r */
public final class HlsTrackMetadataEntry implements C1034b {
    public static final Creator<HlsTrackMetadataEntry> CREATOR = new C1833a();

    /* renamed from: a */
    public final String f11723a;

    /* renamed from: b */
    public final String f11724b;

    /* renamed from: c */
    public final List<C1834b> f11725c;

    /* renamed from: com.google.android.exoplayer2.source.hls.r$a */
    /* compiled from: HlsTrackMetadataEntry */
    class C1833a implements Creator<HlsTrackMetadataEntry> {
        C1833a() {
        }

        /* renamed from: a */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        /* renamed from: b */
        public HlsTrackMetadataEntry[] newArray(int i) {
            return new HlsTrackMetadataEntry[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.r$b */
    /* compiled from: HlsTrackMetadataEntry */
    public static final class C1834b implements Parcelable {
        public static final Creator<C1834b> CREATOR = new C1835a();

        /* renamed from: a */
        public final int f11726a;

        /* renamed from: b */
        public final int f11727b;

        /* renamed from: c */
        public final String f11728c;

        /* renamed from: d */
        public final String f11729d;

        /* renamed from: e */
        public final String f11730e;

        /* renamed from: f */
        public final String f11731f;

        /* renamed from: com.google.android.exoplayer2.source.hls.r$b$a */
        /* compiled from: HlsTrackMetadataEntry */
        class C1835a implements Creator<C1834b> {
            C1835a() {
            }

            /* renamed from: a */
            public C1834b createFromParcel(Parcel parcel) {
                return new C1834b(parcel);
            }

            /* renamed from: b */
            public C1834b[] newArray(int i) {
                return new C1834b[i];
            }
        }

        public C1834b(int i, int i2, String str, String str2, String str3, String str4) {
            this.f11726a = i;
            this.f11727b = i2;
            this.f11728c = str;
            this.f11729d = str2;
            this.f11730e = str3;
            this.f11731f = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1834b.class != obj.getClass()) {
                return false;
            }
            C1834b bVar = (C1834b) obj;
            if (this.f11726a != bVar.f11726a || this.f11727b != bVar.f11727b || !TextUtils.equals(this.f11728c, bVar.f11728c) || !TextUtils.equals(this.f11729d, bVar.f11729d) || !TextUtils.equals(this.f11730e, bVar.f11730e) || !TextUtils.equals(this.f11731f, bVar.f11731f)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int i = ((this.f11726a * 31) + this.f11727b) * 31;
            String str = this.f11728c;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f11729d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f11730e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f11731f;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11726a);
            parcel.writeInt(this.f11727b);
            parcel.writeString(this.f11728c);
            parcel.writeString(this.f11729d);
            parcel.writeString(this.f11730e);
            parcel.writeString(this.f11731f);
        }

        C1834b(Parcel parcel) {
            this.f11726a = parcel.readInt();
            this.f11727b = parcel.readInt();
            this.f11728c = parcel.readString();
            this.f11729d = parcel.readString();
            this.f11730e = parcel.readString();
            this.f11731f = parcel.readString();
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List<C1834b> list) {
        this.f11723a = str;
        this.f11724b = str2;
        this.f11725c = Collections.unmodifiableList(new ArrayList(list));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry rVar = (HlsTrackMetadataEntry) obj;
        if (!TextUtils.equals(this.f11723a, rVar.f11723a) || !TextUtils.equals(this.f11724b, rVar.f11724b) || !this.f11725c.equals(rVar.f11725c)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    public int hashCode() {
        String str = this.f11723a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11724b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f11725c.hashCode();
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f11723a != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" [");
            sb2.append(this.f11723a);
            sb2.append(", ");
            sb2.append(this.f11724b);
            sb2.append("]");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11723a);
        parcel.writeString(this.f11724b);
        int size = this.f11725c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) this.f11725c.get(i2), 0);
        }
    }

    HlsTrackMetadataEntry(Parcel parcel) {
        this.f11723a = parcel.readString();
        this.f11724b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((C1834b) parcel.readParcelable(C1834b.class.getClassLoader()));
        }
        this.f11725c = Collections.unmodifiableList(arrayList);
    }
}
