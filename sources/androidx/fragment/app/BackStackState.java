package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle.C0378c;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new C0291a();

    /* renamed from: a */
    final int[] f2239a;

    /* renamed from: b */
    final ArrayList<String> f2240b;

    /* renamed from: c */
    final int[] f2241c;

    /* renamed from: d */
    final int[] f2242d;

    /* renamed from: e */
    final int f2243e;

    /* renamed from: f */
    final String f2244f;

    /* renamed from: g */
    final int f2245g;

    /* renamed from: h */
    final int f2246h;

    /* renamed from: i */
    final CharSequence f2247i;

    /* renamed from: j */
    final int f2248j;

    /* renamed from: k */
    final CharSequence f2249k;

    /* renamed from: l */
    final ArrayList<String> f2250l;

    /* renamed from: m */
    final ArrayList<String> f2251m;

    /* renamed from: n */
    final boolean f2252n;

    /* renamed from: androidx.fragment.app.b$a */
    /* compiled from: BackStackState */
    class C0291a implements Creator<BackStackState> {
        C0291a() {
        }

        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(BackStackRecord aVar) {
        int size = aVar.f2510c.size();
        this.f2239a = new int[(size * 5)];
        if (aVar.f2516i) {
            this.f2240b = new ArrayList<>(size);
            this.f2241c = new int[size];
            this.f2242d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0353a aVar2 = (C0353a) aVar.f2510c.get(i);
                int i3 = i2 + 1;
                this.f2239a[i2] = aVar2.f2527a;
                ArrayList<String> arrayList = this.f2240b;
                Fragment fragment = aVar2.f2528b;
                arrayList.add(fragment != null ? fragment.f2159g : null);
                int[] iArr = this.f2239a;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f2529c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f2530d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2531e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f2532f;
                this.f2241c[i] = aVar2.f2533g.ordinal();
                this.f2242d[i] = aVar2.f2534h.ordinal();
                i++;
                i2 = i7;
            }
            this.f2243e = aVar.f2515h;
            this.f2244f = aVar.f2518k;
            this.f2245g = aVar.f2226v;
            this.f2246h = aVar.f2519l;
            this.f2247i = aVar.f2520m;
            this.f2248j = aVar.f2521n;
            this.f2249k = aVar.f2522o;
            this.f2250l = aVar.f2523p;
            this.f2251m = aVar.f2524q;
            this.f2252n = aVar.f2525r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public BackStackRecord mo2558l(FragmentManager nVar) {
        BackStackRecord aVar = new BackStackRecord(nVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f2239a.length) {
            C0353a aVar2 = new C0353a();
            int i3 = i + 1;
            aVar2.f2527a = this.f2239a[i];
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f2239a[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            String str = (String) this.f2240b.get(i2);
            if (str != null) {
                aVar2.f2528b = nVar.mo2794g0(str);
            } else {
                aVar2.f2528b = null;
            }
            aVar2.f2533g = C0378c.values()[this.f2241c[i2]];
            aVar2.f2534h = C0378c.values()[this.f2242d[i2]];
            int[] iArr = this.f2239a;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f2529c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f2530d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f2531e = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            aVar2.f2532f = i11;
            aVar.f2511d = i5;
            aVar.f2512e = i7;
            aVar.f2513f = i9;
            aVar.f2514g = i11;
            aVar.mo2939f(aVar2);
            i2++;
            i = i10;
        }
        aVar.f2515h = this.f2243e;
        aVar.f2518k = this.f2244f;
        aVar.f2226v = this.f2245g;
        aVar.f2516i = true;
        aVar.f2519l = this.f2246h;
        aVar.f2520m = this.f2247i;
        aVar.f2521n = this.f2248j;
        aVar.f2522o = this.f2249k;
        aVar.f2523p = this.f2250l;
        aVar.f2524q = this.f2251m;
        aVar.f2525r = this.f2252n;
        aVar.mo2525v(1);
        return aVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2239a);
        parcel.writeStringList(this.f2240b);
        parcel.writeIntArray(this.f2241c);
        parcel.writeIntArray(this.f2242d);
        parcel.writeInt(this.f2243e);
        parcel.writeString(this.f2244f);
        parcel.writeInt(this.f2245g);
        parcel.writeInt(this.f2246h);
        TextUtils.writeToParcel(this.f2247i, parcel, 0);
        parcel.writeInt(this.f2248j);
        TextUtils.writeToParcel(this.f2249k, parcel, 0);
        parcel.writeStringList(this.f2250l);
        parcel.writeStringList(this.f2251m);
        parcel.writeInt(this.f2252n ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f2239a = parcel.createIntArray();
        this.f2240b = parcel.createStringArrayList();
        this.f2241c = parcel.createIntArray();
        this.f2242d = parcel.createIntArray();
        this.f2243e = parcel.readInt();
        this.f2244f = parcel.readString();
        this.f2245g = parcel.readInt();
        this.f2246h = parcel.readInt();
        this.f2247i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2248j = parcel.readInt();
        this.f2249k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2250l = parcel.createStringArrayList();
        this.f2251m = parcel.createStringArrayList();
        this.f2252n = parcel.readInt() != 0;
    }
}
