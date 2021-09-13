package p067c.p068a.p069a.p070a.p110l2;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Locale;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ImmutableList;

/* renamed from: c.a.a.a.l2.m */
public class TrackSelectionParameters implements Parcelable {
    public static final Creator<TrackSelectionParameters> CREATOR = new C1178a();

    /* renamed from: a */
    public static final TrackSelectionParameters f8287a;
    @Deprecated

    /* renamed from: b */
    public static final TrackSelectionParameters f8288b;

    /* renamed from: c */
    public final ImmutableList<String> f8289c;

    /* renamed from: d */
    public final int f8290d;

    /* renamed from: e */
    public final ImmutableList<String> f8291e;

    /* renamed from: f */
    public final int f8292f;

    /* renamed from: g */
    public final boolean f8293g;

    /* renamed from: h */
    public final int f8294h;

    /* renamed from: c.a.a.a.l2.m$a */
    /* compiled from: TrackSelectionParameters */
    class C1178a implements Creator<TrackSelectionParameters> {
        C1178a() {
        }

        /* renamed from: a */
        public TrackSelectionParameters createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        /* renamed from: b */
        public TrackSelectionParameters[] newArray(int i) {
            return new TrackSelectionParameters[i];
        }
    }

    /* renamed from: c.a.a.a.l2.m$b */
    /* compiled from: TrackSelectionParameters */
    public static class C1179b {

        /* renamed from: a */
        ImmutableList<String> f8295a;

        /* renamed from: b */
        int f8296b;

        /* renamed from: c */
        ImmutableList<String> f8297c;

        /* renamed from: d */
        int f8298d;

        /* renamed from: e */
        boolean f8299e;

        /* renamed from: f */
        int f8300f;

        public C1179b(Context context) {
            this();
            mo7295b(context);
        }

        /* renamed from: c */
        private void m10043c(Context context) {
            if (Util.f8398a >= 23 || Looper.myLooper() != null) {
                CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
                if (captioningManager != null && captioningManager.isEnabled()) {
                    this.f8298d = 1088;
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        this.f8297c = ImmutableList.m11918q(Util.m10266P(locale));
                    }
                }
            }
        }

        /* renamed from: a */
        public TrackSelectionParameters mo7294a() {
            TrackSelectionParameters mVar = new TrackSelectionParameters(this.f8295a, this.f8296b, this.f8297c, this.f8298d, this.f8299e, this.f8300f);
            return mVar;
        }

        /* renamed from: b */
        public C1179b mo7295b(Context context) {
            if (Util.f8398a >= 19) {
                m10043c(context);
            }
            return this;
        }

        @Deprecated
        public C1179b() {
            this.f8295a = ImmutableList.m11917p();
            this.f8296b = 0;
            this.f8297c = ImmutableList.m11917p();
            this.f8298d = 0;
            this.f8299e = false;
            this.f8300f = 0;
        }
    }

    static {
        TrackSelectionParameters a = new C1179b().mo7294a();
        f8287a = a;
        f8288b = a;
    }

    TrackSelectionParameters(ImmutableList<String> rVar, int i, ImmutableList<String> rVar2, int i2, boolean z, int i3) {
        this.f8289c = rVar;
        this.f8290d = i;
        this.f8291e = rVar2;
        this.f8292f = i2;
        this.f8293g = z;
        this.f8294h = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters mVar = (TrackSelectionParameters) obj;
        if (!(this.f8289c.equals(mVar.f8289c) && this.f8290d == mVar.f8290d && this.f8291e.equals(mVar.f8291e) && this.f8292f == mVar.f8292f && this.f8293g == mVar.f8293g && this.f8294h == mVar.f8294h)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((this.f8289c.hashCode() + 31) * 31) + this.f8290d) * 31) + this.f8291e.hashCode()) * 31) + this.f8292f) * 31) + (this.f8293g ? 1 : 0)) * 31) + this.f8294h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f8289c);
        parcel.writeInt(this.f8290d);
        parcel.writeList(this.f8291e);
        parcel.writeInt(this.f8292f);
        Util.m10264N0(parcel, this.f8293g);
        parcel.writeInt(this.f8294h);
    }

    TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f8289c = ImmutableList.m11916m(arrayList);
        this.f8290d = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f8291e = ImmutableList.m11916m(arrayList2);
        this.f8292f = parcel.readInt();
        this.f8293g = Util.m10328z0(parcel);
        this.f8294h = parcel.readInt();
    }
}
