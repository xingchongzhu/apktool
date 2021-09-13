package p067c.p068a.p069a.p070a.p110l2;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.RendererCapabilities;
import p067c.p068a.p069a.p070a.RendererConfiguration;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.AdaptiveTrackSelection.C1164b;
import p067c.p068a.p069a.p070a.p110l2.C1174h.C1175a;
import p067c.p068a.p069a.p070a.p110l2.C1174h.C1176b;
import p067c.p068a.p069a.p070a.p110l2.MappingTrackSelector.C1177a;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionParameters.C1179b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ComparisonChain;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.Ordering;
import p067c.p068a.p134b.p137c.Ints;

/* renamed from: c.a.a.a.l2.f */
public class DefaultTrackSelector extends MappingTrackSelector {

    /* renamed from: d */
    private static final int[] f8169d = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Ordering<Integer> f8170e = Ordering.m11794a(C1162c.f8141a);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Ordering<Integer> f8171f = Ordering.m11794a(C1161b.f8140a);

    /* renamed from: g */
    private final C1176b f8172g;

    /* renamed from: h */
    private final AtomicReference<C1167c> f8173h;

    /* renamed from: c.a.a.a.l2.f$a */
    /* compiled from: DefaultTrackSelector */
    protected static final class C1165a implements Comparable<C1165a> {

        /* renamed from: a */
        public final boolean f8174a;

        /* renamed from: b */
        private final String f8175b;

        /* renamed from: c */
        private final C1167c f8176c;

        /* renamed from: d */
        private final boolean f8177d;

        /* renamed from: e */
        private final int f8178e;

        /* renamed from: f */
        private final int f8179f;

        /* renamed from: g */
        private final int f8180g;

        /* renamed from: h */
        private final int f8181h;

        /* renamed from: i */
        private final int f8182i;

        /* renamed from: j */
        private final boolean f8183j;

        /* renamed from: k */
        private final int f8184k;

        /* renamed from: l */
        private final int f8185l;

        /* renamed from: m */
        private final int f8186m;

        /* renamed from: n */
        private final int f8187n;

        public C1165a(Format u0Var, C1167c cVar, int i) {
            int i2;
            int i3;
            int i4;
            this.f8176c = cVar;
            this.f8175b = DefaultTrackSelector.m9966x(u0Var.f8805c);
            int i5 = 0;
            this.f8177d = DefaultTrackSelector.m9960r(i, false);
            int i6 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i6 >= cVar.f8289c.size()) {
                    i6 = Integer.MAX_VALUE;
                    i3 = 0;
                    break;
                }
                i3 = DefaultTrackSelector.m9957o(u0Var, (String) cVar.f8289c.get(i6), false);
                if (i3 > 0) {
                    break;
                }
                i6++;
            }
            this.f8179f = i6;
            this.f8178e = i3;
            this.f8180g = Integer.bitCount(u0Var.f8807e & cVar.f8290d);
            boolean z = true;
            this.f8183j = (u0Var.f8806d & 1) != 0;
            int i7 = u0Var.f8827y;
            this.f8184k = i7;
            this.f8185l = u0Var.f8828z;
            int i8 = u0Var.f8810h;
            this.f8186m = i8;
            if ((i8 != -1 && i8 > cVar.f8219z) || (i7 != -1 && i7 > cVar.f8218y)) {
                z = false;
            }
            this.f8174a = z;
            String[] b0 = Util.m10280b0();
            int i9 = 0;
            while (true) {
                if (i9 >= b0.length) {
                    i9 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                }
                i4 = DefaultTrackSelector.m9957o(u0Var, b0[i9], false);
                if (i4 > 0) {
                    break;
                }
                i9++;
            }
            this.f8181h = i9;
            this.f8182i = i4;
            while (true) {
                if (i5 >= cVar.f8195G.size()) {
                    break;
                }
                String str = u0Var.f8814l;
                if (str != null && str.equals(cVar.f8195G.get(i5))) {
                    i2 = i5;
                    break;
                }
                i5++;
            }
            this.f8187n = i2;
        }

        /* renamed from: a */
        public int compareTo(C1165a aVar) {
            Ordering j0Var;
            if (!this.f8174a || !this.f8177d) {
                j0Var = DefaultTrackSelector.f8170e.mo8322f();
            } else {
                j0Var = DefaultTrackSelector.f8170e;
            }
            ComparisonChain f = ComparisonChain.m11847j().mo8385g(this.f8177d, aVar.f8177d).mo8384f(Integer.valueOf(this.f8179f), Integer.valueOf(aVar.f8179f), Ordering.m11795c().mo8322f()).mo8382d(this.f8178e, aVar.f8178e).mo8382d(this.f8180g, aVar.f8180g).mo8385g(this.f8174a, aVar.f8174a).mo8384f(Integer.valueOf(this.f8187n), Integer.valueOf(aVar.f8187n), Ordering.m11795c().mo8322f()).mo8384f(Integer.valueOf(this.f8186m), Integer.valueOf(aVar.f8186m), this.f8176c.f8196H ? DefaultTrackSelector.f8170e.mo8322f() : DefaultTrackSelector.f8171f).mo8385g(this.f8183j, aVar.f8183j).mo8384f(Integer.valueOf(this.f8181h), Integer.valueOf(aVar.f8181h), Ordering.m11795c().mo8322f()).mo8382d(this.f8182i, aVar.f8182i).mo8384f(Integer.valueOf(this.f8184k), Integer.valueOf(aVar.f8184k), j0Var).mo8384f(Integer.valueOf(this.f8185l), Integer.valueOf(aVar.f8185l), j0Var);
            Integer valueOf = Integer.valueOf(this.f8186m);
            Integer valueOf2 = Integer.valueOf(aVar.f8186m);
            if (!Util.m10279b(this.f8175b, aVar.f8175b)) {
                j0Var = DefaultTrackSelector.f8171f;
            }
            return f.mo8384f(valueOf, valueOf2, j0Var).mo8387i();
        }
    }

    /* renamed from: c.a.a.a.l2.f$b */
    /* compiled from: DefaultTrackSelector */
    protected static final class C1166b implements Comparable<C1166b> {

        /* renamed from: a */
        private final boolean f8188a;

        /* renamed from: b */
        private final boolean f8189b;

        public C1166b(Format u0Var, int i) {
            boolean z = true;
            if ((u0Var.f8806d & 1) == 0) {
                z = false;
            }
            this.f8188a = z;
            this.f8189b = DefaultTrackSelector.m9960r(i, false);
        }

        /* renamed from: a */
        public int compareTo(C1166b bVar) {
            return ComparisonChain.m11847j().mo8385g(this.f8189b, bVar.f8189b).mo8385g(this.f8188a, bVar.f8188a).mo8387i();
        }
    }

    /* renamed from: c.a.a.a.l2.f$c */
    /* compiled from: DefaultTrackSelector */
    public static final class C1167c extends TrackSelectionParameters {
        public static final Creator<C1167c> CREATOR = new C1168a();

        /* renamed from: i */
        public static final C1167c f8190i = new C1169d().mo7294a();

        /* renamed from: A */
        public final boolean f8191A;

        /* renamed from: B */
        public final boolean f8192B;

        /* renamed from: C */
        public final boolean f8193C;

        /* renamed from: D */
        public final boolean f8194D;

        /* renamed from: G */
        public final ImmutableList<String> f8195G;

        /* renamed from: H */
        public final boolean f8196H;

        /* renamed from: I */
        public final boolean f8197I;

        /* renamed from: J */
        public final boolean f8198J;

        /* renamed from: K */
        public final boolean f8199K;

        /* renamed from: L */
        public final boolean f8200L;

        /* renamed from: M */
        private final SparseArray<Map<TrackGroupArray, C1170e>> f8201M;

        /* renamed from: N */
        private final SparseBooleanArray f8202N;

        /* renamed from: j */
        public final int f8203j;

        /* renamed from: k */
        public final int f8204k;

        /* renamed from: l */
        public final int f8205l;

        /* renamed from: m */
        public final int f8206m;

        /* renamed from: n */
        public final int f8207n;

        /* renamed from: o */
        public final int f8208o;

        /* renamed from: p */
        public final int f8209p;

        /* renamed from: q */
        public final int f8210q;

        /* renamed from: r */
        public final boolean f8211r;

        /* renamed from: s */
        public final boolean f8212s;

        /* renamed from: t */
        public final boolean f8213t;

        /* renamed from: u */
        public final int f8214u;

        /* renamed from: v */
        public final int f8215v;

        /* renamed from: w */
        public final boolean f8216w;

        /* renamed from: x */
        public final ImmutableList<String> f8217x;

        /* renamed from: y */
        public final int f8218y;

        /* renamed from: z */
        public final int f8219z;

        /* renamed from: c.a.a.a.l2.f$c$a */
        /* compiled from: DefaultTrackSelector */
        class C1168a implements Creator<C1167c> {
            C1168a() {
            }

            /* renamed from: a */
            public C1167c createFromParcel(Parcel parcel) {
                return new C1167c(parcel);
            }

            /* renamed from: b */
            public C1167c[] newArray(int i) {
                return new C1167c[i];
            }
        }

        C1167c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, int i9, int i10, boolean z4, ImmutableList<String> rVar, ImmutableList<String> rVar2, int i11, int i12, int i13, boolean z5, boolean z6, boolean z7, boolean z8, ImmutableList<String> rVar3, ImmutableList<String> rVar4, int i14, boolean z9, int i15, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SparseArray<Map<TrackGroupArray, C1170e>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(rVar2, i11, rVar4, i14, z9, i15);
            this.f8203j = i;
            this.f8204k = i2;
            this.f8205l = i3;
            this.f8206m = i4;
            this.f8207n = i5;
            this.f8208o = i6;
            this.f8209p = i7;
            this.f8210q = i8;
            this.f8211r = z;
            this.f8212s = z2;
            this.f8213t = z3;
            this.f8214u = i9;
            this.f8215v = i10;
            this.f8216w = z4;
            this.f8217x = rVar;
            this.f8218y = i12;
            this.f8219z = i13;
            this.f8191A = z5;
            this.f8192B = z6;
            this.f8193C = z7;
            this.f8194D = z8;
            this.f8195G = rVar3;
            this.f8196H = z10;
            this.f8197I = z11;
            this.f8198J = z12;
            this.f8199K = z13;
            this.f8200L = z14;
            this.f8201M = sparseArray;
            this.f8202N = sparseBooleanArray;
        }

        /* renamed from: l */
        private static boolean m9977l(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: m */
        private static boolean m9978m(SparseArray<Map<TrackGroupArray, C1170e>> sparseArray, SparseArray<Map<TrackGroupArray, C1170e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m9979n((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: n */
        private static boolean m9979n(Map<TrackGroupArray, C1170e> map, Map<TrackGroupArray, C1170e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Entry entry : map.entrySet()) {
                TrackGroupArray q0Var = (TrackGroupArray) entry.getKey();
                if (map2.containsKey(q0Var)) {
                    if (!Util.m10279b(entry.getValue(), map2.get(q0Var))) {
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: o */
        public static C1167c m9980o(Context context) {
            return new C1169d(context).mo7294a();
        }

        /* renamed from: s */
        private static SparseArray<Map<TrackGroupArray, C1170e>> m9981s(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, C1170e>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((TrackGroupArray) Assertions.m10153e((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader())), (C1170e) parcel.readParcelable(C1170e.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        /* renamed from: t */
        private static void m9982t(Parcel parcel, SparseArray<Map<TrackGroupArray, C1170e>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map map = (Map) sparseArray.valueAt(i);
                int size2 = map.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Entry entry : map.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1167c.class != obj.getClass()) {
                return false;
            }
            C1167c cVar = (C1167c) obj;
            if (!(super.equals(obj) && this.f8203j == cVar.f8203j && this.f8204k == cVar.f8204k && this.f8205l == cVar.f8205l && this.f8206m == cVar.f8206m && this.f8207n == cVar.f8207n && this.f8208o == cVar.f8208o && this.f8209p == cVar.f8209p && this.f8210q == cVar.f8210q && this.f8211r == cVar.f8211r && this.f8212s == cVar.f8212s && this.f8213t == cVar.f8213t && this.f8216w == cVar.f8216w && this.f8214u == cVar.f8214u && this.f8215v == cVar.f8215v && this.f8217x.equals(cVar.f8217x) && this.f8218y == cVar.f8218y && this.f8219z == cVar.f8219z && this.f8191A == cVar.f8191A && this.f8192B == cVar.f8192B && this.f8193C == cVar.f8193C && this.f8194D == cVar.f8194D && this.f8195G.equals(cVar.f8195G) && this.f8196H == cVar.f8196H && this.f8197I == cVar.f8197I && this.f8198J == cVar.f8198J && this.f8199K == cVar.f8199K && this.f8200L == cVar.f8200L && m9977l(this.f8202N, cVar.f8202N) && m9978m(this.f8201M, cVar.f8201M))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f8203j) * 31) + this.f8204k) * 31) + this.f8205l) * 31) + this.f8206m) * 31) + this.f8207n) * 31) + this.f8208o) * 31) + this.f8209p) * 31) + this.f8210q) * 31) + (this.f8211r ? 1 : 0)) * 31) + (this.f8212s ? 1 : 0)) * 31) + (this.f8213t ? 1 : 0)) * 31) + (this.f8216w ? 1 : 0)) * 31) + this.f8214u) * 31) + this.f8215v) * 31) + this.f8217x.hashCode()) * 31) + this.f8218y) * 31) + this.f8219z) * 31) + (this.f8191A ? 1 : 0)) * 31) + (this.f8192B ? 1 : 0)) * 31) + (this.f8193C ? 1 : 0)) * 31) + (this.f8194D ? 1 : 0)) * 31) + this.f8195G.hashCode()) * 31) + (this.f8196H ? 1 : 0)) * 31) + (this.f8197I ? 1 : 0)) * 31) + (this.f8198J ? 1 : 0)) * 31) + (this.f8199K ? 1 : 0)) * 31) + (this.f8200L ? 1 : 0);
        }

        /* renamed from: p */
        public final boolean mo7286p(int i) {
            return this.f8202N.get(i);
        }

        /* renamed from: q */
        public final C1170e mo7287q(int i, TrackGroupArray q0Var) {
            Map map = (Map) this.f8201M.get(i);
            if (map != null) {
                return (C1170e) map.get(q0Var);
            }
            return null;
        }

        /* renamed from: r */
        public final boolean mo7288r(int i, TrackGroupArray q0Var) {
            Map map = (Map) this.f8201M.get(i);
            return map != null && map.containsKey(q0Var);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8203j);
            parcel.writeInt(this.f8204k);
            parcel.writeInt(this.f8205l);
            parcel.writeInt(this.f8206m);
            parcel.writeInt(this.f8207n);
            parcel.writeInt(this.f8208o);
            parcel.writeInt(this.f8209p);
            parcel.writeInt(this.f8210q);
            Util.m10264N0(parcel, this.f8211r);
            Util.m10264N0(parcel, this.f8212s);
            Util.m10264N0(parcel, this.f8213t);
            parcel.writeInt(this.f8214u);
            parcel.writeInt(this.f8215v);
            Util.m10264N0(parcel, this.f8216w);
            parcel.writeList(this.f8217x);
            parcel.writeInt(this.f8218y);
            parcel.writeInt(this.f8219z);
            Util.m10264N0(parcel, this.f8191A);
            Util.m10264N0(parcel, this.f8192B);
            Util.m10264N0(parcel, this.f8193C);
            Util.m10264N0(parcel, this.f8194D);
            parcel.writeList(this.f8195G);
            Util.m10264N0(parcel, this.f8196H);
            Util.m10264N0(parcel, this.f8197I);
            Util.m10264N0(parcel, this.f8198J);
            Util.m10264N0(parcel, this.f8199K);
            Util.m10264N0(parcel, this.f8200L);
            m9982t(parcel, this.f8201M);
            parcel.writeSparseBooleanArray(this.f8202N);
        }

        C1167c(Parcel parcel) {
            super(parcel);
            this.f8203j = parcel.readInt();
            this.f8204k = parcel.readInt();
            this.f8205l = parcel.readInt();
            this.f8206m = parcel.readInt();
            this.f8207n = parcel.readInt();
            this.f8208o = parcel.readInt();
            this.f8209p = parcel.readInt();
            this.f8210q = parcel.readInt();
            this.f8211r = Util.m10328z0(parcel);
            this.f8212s = Util.m10328z0(parcel);
            this.f8213t = Util.m10328z0(parcel);
            this.f8214u = parcel.readInt();
            this.f8215v = parcel.readInt();
            this.f8216w = Util.m10328z0(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, null);
            this.f8217x = ImmutableList.m11916m(arrayList);
            this.f8218y = parcel.readInt();
            this.f8219z = parcel.readInt();
            this.f8191A = Util.m10328z0(parcel);
            this.f8192B = Util.m10328z0(parcel);
            this.f8193C = Util.m10328z0(parcel);
            this.f8194D = Util.m10328z0(parcel);
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, null);
            this.f8195G = ImmutableList.m11916m(arrayList2);
            this.f8196H = Util.m10328z0(parcel);
            this.f8197I = Util.m10328z0(parcel);
            this.f8198J = Util.m10328z0(parcel);
            this.f8199K = Util.m10328z0(parcel);
            this.f8200L = Util.m10328z0(parcel);
            this.f8201M = m9981s(parcel);
            this.f8202N = (SparseBooleanArray) Util.m10293i(parcel.readSparseBooleanArray());
        }
    }

    /* renamed from: c.a.a.a.l2.f$d */
    /* compiled from: DefaultTrackSelector */
    public static final class C1169d extends C1179b {

        /* renamed from: A */
        private boolean f8220A;

        /* renamed from: B */
        private ImmutableList<String> f8221B;

        /* renamed from: C */
        private boolean f8222C;

        /* renamed from: D */
        private boolean f8223D;

        /* renamed from: E */
        private boolean f8224E;

        /* renamed from: F */
        private boolean f8225F;

        /* renamed from: G */
        private boolean f8226G;

        /* renamed from: H */
        private final SparseArray<Map<TrackGroupArray, C1170e>> f8227H = new SparseArray<>();

        /* renamed from: I */
        private final SparseBooleanArray f8228I = new SparseBooleanArray();

        /* renamed from: g */
        private int f8229g;

        /* renamed from: h */
        private int f8230h;

        /* renamed from: i */
        private int f8231i;

        /* renamed from: j */
        private int f8232j;

        /* renamed from: k */
        private int f8233k;

        /* renamed from: l */
        private int f8234l;

        /* renamed from: m */
        private int f8235m;

        /* renamed from: n */
        private int f8236n;

        /* renamed from: o */
        private boolean f8237o;

        /* renamed from: p */
        private boolean f8238p;

        /* renamed from: q */
        private boolean f8239q;

        /* renamed from: r */
        private int f8240r;

        /* renamed from: s */
        private int f8241s;

        /* renamed from: t */
        private boolean f8242t;

        /* renamed from: u */
        private ImmutableList<String> f8243u;

        /* renamed from: v */
        private int f8244v;

        /* renamed from: w */
        private int f8245w;

        /* renamed from: x */
        private boolean f8246x;

        /* renamed from: y */
        private boolean f8247y;

        /* renamed from: z */
        private boolean f8248z;

        @Deprecated
        public C1169d() {
            m9988e();
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioMimeTypes"})
        /* renamed from: e */
        private void m9988e() {
            this.f8229g = Integer.MAX_VALUE;
            this.f8230h = Integer.MAX_VALUE;
            this.f8231i = Integer.MAX_VALUE;
            this.f8232j = Integer.MAX_VALUE;
            this.f8237o = true;
            this.f8238p = false;
            this.f8239q = true;
            this.f8240r = Integer.MAX_VALUE;
            this.f8241s = Integer.MAX_VALUE;
            this.f8242t = true;
            this.f8243u = ImmutableList.m11917p();
            this.f8244v = Integer.MAX_VALUE;
            this.f8245w = Integer.MAX_VALUE;
            this.f8246x = true;
            this.f8247y = false;
            this.f8248z = false;
            this.f8220A = false;
            this.f8221B = ImmutableList.m11917p();
            this.f8222C = false;
            this.f8223D = false;
            this.f8224E = true;
            this.f8225F = false;
            this.f8226G = true;
        }

        /* renamed from: d */
        public C1167c mo7294a() {
            C1167c cVar = new C1167c(this.f8229g, this.f8230h, this.f8231i, this.f8232j, this.f8233k, this.f8234l, this.f8235m, this.f8236n, this.f8237o, this.f8238p, this.f8239q, this.f8240r, this.f8241s, this.f8242t, this.f8243u, this.f8295a, this.f8296b, this.f8244v, this.f8245w, this.f8246x, this.f8247y, this.f8248z, this.f8220A, this.f8221B, this.f8297c, this.f8298d, this.f8299e, this.f8300f, this.f8222C, this.f8223D, this.f8224E, this.f8225F, this.f8226G, this.f8227H, this.f8228I);
            return cVar;
        }

        /* renamed from: f */
        public C1169d mo7295b(Context context) {
            super.mo7295b(context);
            return this;
        }

        /* renamed from: g */
        public C1169d mo7298g(int i, int i2, boolean z) {
            this.f8240r = i;
            this.f8241s = i2;
            this.f8242t = z;
            return this;
        }

        /* renamed from: h */
        public C1169d mo7299h(Context context, boolean z) {
            Point J = Util.m10255J(context);
            return mo7298g(J.x, J.y, z);
        }

        public C1169d(Context context) {
            super(context);
            m9988e();
            mo7299h(context, true);
        }
    }

    /* renamed from: c.a.a.a.l2.f$e */
    /* compiled from: DefaultTrackSelector */
    public static final class C1170e implements Parcelable {
        public static final Creator<C1170e> CREATOR = new C1171a();

        /* renamed from: a */
        public final int f8249a;

        /* renamed from: b */
        public final int[] f8250b;

        /* renamed from: c */
        public final int f8251c;

        /* renamed from: d */
        public final int f8252d;

        /* renamed from: e */
        public final int f8253e;

        /* renamed from: c.a.a.a.l2.f$e$a */
        /* compiled from: DefaultTrackSelector */
        class C1171a implements Creator<C1170e> {
            C1171a() {
            }

            /* renamed from: a */
            public C1170e createFromParcel(Parcel parcel) {
                return new C1170e(parcel);
            }

            /* renamed from: b */
            public C1170e[] newArray(int i) {
                return new C1170e[i];
            }
        }

        public C1170e(int i, int... iArr) {
            this(i, iArr, 2, 0);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1170e.class != obj.getClass()) {
                return false;
            }
            C1170e eVar = (C1170e) obj;
            if (!(this.f8249a == eVar.f8249a && Arrays.equals(this.f8250b, eVar.f8250b) && this.f8252d == eVar.f8252d && this.f8253e == eVar.f8253e)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f8249a * 31) + Arrays.hashCode(this.f8250b)) * 31) + this.f8252d) * 31) + this.f8253e;
        }

        /* renamed from: l */
        public boolean mo7303l(int i) {
            for (int i2 : this.f8250b) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8249a);
            parcel.writeInt(this.f8250b.length);
            parcel.writeIntArray(this.f8250b);
            parcel.writeInt(this.f8252d);
            parcel.writeInt(this.f8253e);
        }

        public C1170e(int i, int[] iArr, int i2, int i3) {
            this.f8249a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8250b = copyOf;
            this.f8251c = iArr.length;
            this.f8252d = i2;
            this.f8253e = i3;
            Arrays.sort(copyOf);
        }

        C1170e(Parcel parcel) {
            this.f8249a = parcel.readInt();
            byte readByte = parcel.readByte();
            this.f8251c = readByte;
            int[] iArr = new int[readByte];
            this.f8250b = iArr;
            parcel.readIntArray(iArr);
            this.f8252d = parcel.readInt();
            this.f8253e = parcel.readInt();
        }
    }

    /* renamed from: c.a.a.a.l2.f$f */
    /* compiled from: DefaultTrackSelector */
    protected static final class C1172f implements Comparable<C1172f> {

        /* renamed from: a */
        public final boolean f8254a;

        /* renamed from: b */
        private final boolean f8255b;

        /* renamed from: c */
        private final boolean f8256c;

        /* renamed from: d */
        private final boolean f8257d;

        /* renamed from: e */
        private final int f8258e;

        /* renamed from: f */
        private final int f8259f;

        /* renamed from: g */
        private final int f8260g;

        /* renamed from: h */
        private final int f8261h;

        /* renamed from: i */
        private final boolean f8262i;

        public C1172f(Format u0Var, C1167c cVar, int i, String str) {
            ImmutableList<String> rVar;
            int i2;
            boolean z = false;
            this.f8255b = DefaultTrackSelector.m9960r(i, false);
            int i3 = u0Var.f8806d & (cVar.f8294h ^ -1);
            this.f8256c = (i3 & 1) != 0;
            this.f8257d = (i3 & 2) != 0;
            int i4 = Integer.MAX_VALUE;
            if (cVar.f8291e.isEmpty()) {
                rVar = ImmutableList.m11918q("");
            } else {
                rVar = cVar.f8291e;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= rVar.size()) {
                    i2 = 0;
                    break;
                }
                i2 = DefaultTrackSelector.m9957o(u0Var, (String) rVar.get(i5), cVar.f8293g);
                if (i2 > 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            this.f8258e = i4;
            this.f8259f = i2;
            int bitCount = Integer.bitCount(u0Var.f8807e & cVar.f8292f);
            this.f8260g = bitCount;
            this.f8262i = (u0Var.f8807e & 1088) != 0;
            int o = DefaultTrackSelector.m9957o(u0Var, str, DefaultTrackSelector.m9966x(str) == null);
            this.f8261h = o;
            if (i2 > 0 || ((cVar.f8291e.isEmpty() && bitCount > 0) || this.f8256c || (this.f8257d && o > 0))) {
                z = true;
            }
            this.f8254a = z;
        }

        /* renamed from: a */
        public int compareTo(C1172f fVar) {
            ComparisonChain d = ComparisonChain.m11847j().mo8385g(this.f8255b, fVar.f8255b).mo8384f(Integer.valueOf(this.f8258e), Integer.valueOf(fVar.f8258e), Ordering.m11795c().mo8322f()).mo8382d(this.f8259f, fVar.f8259f).mo8382d(this.f8260g, fVar.f8260g).mo8385g(this.f8256c, fVar.f8256c).mo8384f(Boolean.valueOf(this.f8257d), Boolean.valueOf(fVar.f8257d), this.f8259f == 0 ? Ordering.m11795c() : Ordering.m11795c().mo8322f()).mo8382d(this.f8261h, fVar.f8261h);
            if (this.f8260g == 0) {
                d = d.mo8386h(this.f8262i, fVar.f8262i);
            }
            return d.mo8387i();
        }
    }

    /* renamed from: c.a.a.a.l2.f$g */
    /* compiled from: DefaultTrackSelector */
    protected static final class C1173g implements Comparable<C1173g> {

        /* renamed from: a */
        public final boolean f8263a;

        /* renamed from: b */
        private final C1167c f8264b;

        /* renamed from: c */
        private final boolean f8265c;

        /* renamed from: d */
        private final boolean f8266d;

        /* renamed from: e */
        private final int f8267e;

        /* renamed from: f */
        private final int f8268f;

        /* renamed from: g */
        private final int f8269g;

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
            if (r10 < r8.f8210q) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0091 A[EDGE_INSN: B:50:0x0091->B:48:0x0091 ?: BREAK  
EDGE_INSN: B:50:0x0091->B:48:0x0091 ?: BREAK  
EDGE_INSN: B:50:0x0091->B:48:0x0091 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0091 A[EDGE_INSN: B:50:0x0091->B:48:0x0091 ?: BREAK  
EDGE_INSN: B:50:0x0091->B:48:0x0091 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1173g(p067c.p068a.p069a.p070a.Format r7, p067c.p068a.p069a.p070a.p110l2.DefaultTrackSelector.C1167c r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f8264b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L_0x0033
                int r4 = r7.f8819q
                if (r4 == r3) goto L_0x0014
                int r5 = r8.f8203j
                if (r4 > r5) goto L_0x0033
            L_0x0014:
                int r4 = r7.f8820r
                if (r4 == r3) goto L_0x001c
                int r5 = r8.f8204k
                if (r4 > r5) goto L_0x0033
            L_0x001c:
                float r4 = r7.f8821s
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L_0x0029
                int r5 = r8.f8205l
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L_0x0033
            L_0x0029:
                int r4 = r7.f8810h
                if (r4 == r3) goto L_0x0031
                int r5 = r8.f8206m
                if (r4 > r5) goto L_0x0033
            L_0x0031:
                r4 = 1
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                r6.f8263a = r4
                if (r10 == 0) goto L_0x005e
                int r10 = r7.f8819q
                if (r10 == r3) goto L_0x0040
                int r4 = r8.f8207n
                if (r10 < r4) goto L_0x005e
            L_0x0040:
                int r10 = r7.f8820r
                if (r10 == r3) goto L_0x0048
                int r4 = r8.f8208o
                if (r10 < r4) goto L_0x005e
            L_0x0048:
                float r10 = r7.f8821s
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0055
                int r0 = r8.f8209p
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L_0x005e
            L_0x0055:
                int r10 = r7.f8810h
                if (r10 == r3) goto L_0x005f
                int r0 = r8.f8210q
                if (r10 < r0) goto L_0x005e
                goto L_0x005f
            L_0x005e:
                r1 = 0
            L_0x005f:
                r6.f8265c = r1
                boolean r9 = p067c.p068a.p069a.p070a.p110l2.DefaultTrackSelector.m9960r(r9, r2)
                r6.f8266d = r9
                int r9 = r7.f8810h
                r6.f8267e = r9
                int r9 = r7.mo7670n()
                r6.f8268f = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L_0x0074:
                c.a.b.b.r<java.lang.String> r10 = r8.f8217x
                int r10 = r10.size()
                if (r2 >= r10) goto L_0x0091
                java.lang.String r10 = r7.f8814l
                if (r10 == 0) goto L_0x008e
                c.a.b.b.r<java.lang.String> r0 = r8.f8217x
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L_0x008e
                r9 = r2
                goto L_0x0091
            L_0x008e:
                int r2 = r2 + 1
                goto L_0x0074
            L_0x0091:
                r6.f8269g = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p110l2.DefaultTrackSelector.C1173g.<init>(c.a.a.a.u0, c.a.a.a.l2.f$c, int, boolean):void");
        }

        /* renamed from: a */
        public int compareTo(C1173g gVar) {
            Ordering j0Var;
            if (!this.f8263a || !this.f8266d) {
                j0Var = DefaultTrackSelector.f8170e.mo8322f();
            } else {
                j0Var = DefaultTrackSelector.f8170e;
            }
            return ComparisonChain.m11847j().mo8385g(this.f8266d, gVar.f8266d).mo8385g(this.f8263a, gVar.f8263a).mo8385g(this.f8265c, gVar.f8265c).mo8384f(Integer.valueOf(this.f8269g), Integer.valueOf(gVar.f8269g), Ordering.m11795c().mo8322f()).mo8384f(Integer.valueOf(this.f8267e), Integer.valueOf(gVar.f8267e), this.f8264b.f8196H ? DefaultTrackSelector.f8170e.mo8322f() : DefaultTrackSelector.f8171f).mo8384f(Integer.valueOf(this.f8268f), Integer.valueOf(gVar.f8268f), j0Var).mo8384f(Integer.valueOf(this.f8267e), Integer.valueOf(gVar.f8267e), j0Var).mo8387i();
        }
    }

    public DefaultTrackSelector(Context context) {
        this(context, (C1176b) new C1164b());
    }

    /* renamed from: C */
    private static C1175a m9950C(TrackGroupArray q0Var, int[][] iArr, C1167c cVar) {
        TrackGroupArray q0Var2 = q0Var;
        C1167c cVar2 = cVar;
        int i = -1;
        TrackGroup p0Var = null;
        C1173g gVar = null;
        for (int i2 = 0; i2 < q0Var2.f7610b; i2++) {
            TrackGroup l = q0Var2.mo6988l(i2);
            List q = m9959q(l, cVar2.f8214u, cVar2.f8215v, cVar2.f8216w);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < l.f7606a; i3++) {
                Format l2 = l.mo6977l(i3);
                if ((l2.f8807e & 16384) == 0 && m9960r(iArr2[i3], cVar2.f8198J)) {
                    C1173g gVar2 = new C1173g(l2, cVar2, iArr2[i3], q.contains(Integer.valueOf(i3)));
                    if ((gVar2.f8263a || cVar2.f8211r) && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        p0Var = l;
                        i = i3;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (p0Var == null) {
            return null;
        }
        return new C1175a(p0Var, i);
    }

    /* renamed from: k */
    private static void m9953k(TrackGroup p0Var, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            if (!m9962t(p0Var.mo6977l(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list2.remove(size);
            }
        }
    }

    /* renamed from: l */
    private static int[] m9954l(TrackGroup p0Var, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        TrackGroup p0Var2 = p0Var;
        int i3 = i;
        Format l = p0Var.mo6977l(i);
        int[] iArr2 = new int[p0Var2.f7606a];
        int i4 = 0;
        for (int i5 = 0; i5 < p0Var2.f7606a; i5++) {
            if (i5 == i3 || m9961s(p0Var.mo6977l(i5), iArr[i5], l, i2, z, z2, z3)) {
                int i6 = i4 + 1;
                iArr2[i4] = i5;
                i4 = i6;
            }
        }
        return Arrays.copyOf(iArr2, i4);
    }

    /* renamed from: m */
    private static int m9955m(TrackGroup p0Var, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue = ((Integer) list.get(i11)).intValue();
            if (m9962t(p0Var.mo6977l(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: n */
    private static int[] m9956n(TrackGroup p0Var, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        HashSet hashSet;
        int i12;
        int i13;
        TrackGroup p0Var2 = p0Var;
        if (p0Var2.f7606a < 2) {
            return f8169d;
        }
        List q = m9959q(p0Var2, i10, i11, z2);
        if (q.size() < 2) {
            return f8169d;
        }
        if (!z) {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < q.size()) {
                String str3 = p0Var2.mo6977l(((Integer) q.get(i15)).intValue()).f8814l;
                if (hashSet2.add(str3)) {
                    String str4 = str3;
                    i13 = i14;
                    i12 = i15;
                    hashSet = hashSet2;
                    int m = m9955m(p0Var, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, q);
                    if (m > i13) {
                        i14 = m;
                        str2 = str4;
                        i15 = i12 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i13 = i14;
                    i12 = i15;
                    hashSet = hashSet2;
                }
                i14 = i13;
                i15 = i12 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        } else {
            str = null;
        }
        m9953k(p0Var, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, q);
        return q.size() < 2 ? f8169d : Ints.m12042i(q);
    }

    /* renamed from: o */
    protected static int m9957o(Format u0Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(u0Var.f8805c)) {
            return 4;
        }
        String x = m9966x(str);
        String x2 = m9966x(u0Var.f8805c);
        int i = 0;
        if (x2 == null || x == null) {
            if (z && x2 == null) {
                i = 1;
            }
            return i;
        } else if (x2.startsWith(x) || x.startsWith(x2)) {
            return 3;
        } else {
            String str2 = "-";
            if (Util.m10246E0(x2, str2)[0].equals(Util.m10246E0(x, str2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point m9958p(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p067c.p068a.p069a.p070a.p111m2.Util.m10297k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10297k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p110l2.DefaultTrackSelector.m9958p(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: q */
    private static List<Integer> m9959q(TrackGroup p0Var, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(p0Var.f7606a);
        for (int i3 = 0; i3 < p0Var.f7606a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < p0Var.f7606a; i5++) {
                Format l = p0Var.mo6977l(i5);
                int i6 = l.f8819q;
                if (i6 > 0) {
                    int i7 = l.f8820r;
                    if (i7 > 0) {
                        Point p = m9958p(z, i, i2, i6, i7);
                        int i8 = l.f8819q;
                        int i9 = l.f8820r;
                        int i10 = i8 * i9;
                        if (i8 >= ((int) (((float) p.x) * 0.98f)) && i9 >= ((int) (((float) p.y) * 0.98f)) && i10 < i4) {
                            i4 = i10;
                        }
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int n = p0Var.mo6977l(((Integer) arrayList.get(size)).intValue()).mo7670n();
                    if (n == -1 || n > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    protected static boolean m9960r(int i, boolean z) {
        int d = RendererCapabilities.m10787d(i);
        return d == 4 || (z && d == 3);
    }

    /* renamed from: s */
    private static boolean m9961s(Format u0Var, int i, Format u0Var2, int i2, boolean z, boolean z2, boolean z3) {
        if (!m9960r(i, false)) {
            return false;
        }
        int i3 = u0Var.f8810h;
        if (i3 == -1 || i3 > i2) {
            return false;
        }
        if (!z3) {
            int i4 = u0Var.f8827y;
            if (i4 == -1 || i4 != u0Var2.f8827y) {
                return false;
            }
        }
        if (!z) {
            String str = u0Var.f8814l;
            if (str == null || !TextUtils.equals(str, u0Var2.f8814l)) {
                return false;
            }
        }
        if (!z2) {
            int i5 = u0Var.f8828z;
            if (i5 == -1 || i5 != u0Var2.f8828z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    private static boolean m9962t(Format u0Var, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean z = false;
        if ((u0Var.f8807e & 16384) != 0) {
            return false;
        }
        if (m9960r(i, false) && (i & i2) != 0 && (str == null || Util.m10279b(u0Var.f8814l, str))) {
            int i11 = u0Var.f8819q;
            if (i11 == -1 || (i7 <= i11 && i11 <= i3)) {
                int i12 = u0Var.f8820r;
                if (i12 == -1 || (i8 <= i12 && i12 <= i4)) {
                    float f = u0Var.f8821s;
                    if (f == -1.0f || (((float) i9) <= f && f <= ((float) i5))) {
                        int i13 = u0Var.f8810h;
                        if (i13 == -1 || (i10 <= i13 && i13 <= i6)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: u */
    static /* synthetic */ int m9963u(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* renamed from: v */
    static /* synthetic */ int m9964v(Integer num, Integer num2) {
        return 0;
    }

    /* renamed from: w */
    private static void m9965w(C1177a aVar, int[][][] iArr, RendererConfiguration[] s1VarArr, C1174h[] hVarArr) {
        boolean z;
        boolean z2 = false;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (i >= aVar.mo7317c()) {
                z = true;
                break;
            }
            int d = aVar.mo7318d(i);
            C1174h hVar = hVarArr[i];
            if ((d == 1 || d == 2) && hVar != null && m9967y(iArr[i], aVar.mo7319e(i), hVar)) {
                if (d == 1) {
                    if (i3 != -1) {
                        break;
                    }
                    i3 = i;
                } else if (i2 != -1) {
                    break;
                } else {
                    i2 = i;
                }
            }
            i++;
        }
        z = false;
        if (!(i3 == -1 || i2 == -1)) {
            z2 = true;
        }
        if (z && z2) {
            RendererConfiguration s1Var = new RendererConfiguration(true);
            s1VarArr[i3] = s1Var;
            s1VarArr[i2] = s1Var;
        }
    }

    /* renamed from: x */
    protected static String m9966x(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: y */
    private static boolean m9967y(int[][] iArr, TrackGroupArray q0Var, C1174h hVar) {
        if (hVar == null) {
            return false;
        }
        int m = q0Var.mo6989m(hVar.mo7265k());
        for (int i = 0; i < hVar.length(); i++) {
            if (RendererCapabilities.m10788e(iArr[m][hVar.mo7262g(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    private static C1175a m9968z(TrackGroupArray q0Var, int[][] iArr, int i, C1167c cVar) {
        TrackGroupArray q0Var2 = q0Var;
        C1167c cVar2 = cVar;
        int i2 = cVar2.f8213t ? 24 : 16;
        boolean z = cVar2.f8212s && (i & i2) != 0;
        int i3 = 0;
        while (i3 < q0Var2.f7610b) {
            TrackGroup l = q0Var2.mo6988l(i3);
            int[] iArr2 = iArr[i3];
            int i4 = cVar2.f8203j;
            int i5 = cVar2.f8204k;
            int i6 = cVar2.f8205l;
            int i7 = cVar2.f8206m;
            int i8 = cVar2.f8207n;
            int i9 = cVar2.f8208o;
            int i10 = cVar2.f8209p;
            int i11 = cVar2.f8210q;
            int i12 = cVar2.f8214u;
            int i13 = cVar2.f8215v;
            boolean z2 = cVar2.f8216w;
            TrackGroup p0Var = l;
            int i14 = i3;
            int[] n = m9956n(l, iArr2, z, i2, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, z2);
            if (n.length > 0) {
                return new C1175a(p0Var, n);
            }
            i3 = i14 + 1;
            q0Var2 = q0Var;
            cVar2 = cVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C1175a[] mo7273A(C1177a aVar, int[][][] iArr, int[] iArr2, C1167c cVar) throws ExoPlaybackException {
        int i;
        String str;
        int i2;
        String str2;
        C1165a aVar2;
        int i3;
        C1177a aVar3 = aVar;
        C1167c cVar2 = cVar;
        int c = aVar.mo7317c();
        C1175a[] aVarArr = new C1175a[c];
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 1;
            if (i5 >= c) {
                break;
            }
            if (2 == aVar3.mo7318d(i5)) {
                if (!z) {
                    aVarArr[i5] = mo7277F(aVar3.mo7319e(i5), iArr[i5], iArr2[i5], cVar, true);
                    z = aVarArr[i5] != null;
                }
                if (aVar3.mo7319e(i5).f7610b <= 0) {
                    i = 0;
                }
                i6 |= i;
            }
            i5++;
        }
        C1165a aVar4 = null;
        String str3 = null;
        int i7 = -1;
        int i8 = 0;
        while (i8 < c) {
            if (i == aVar3.mo7318d(i8)) {
                i3 = i7;
                aVar2 = aVar4;
                str2 = str3;
                i2 = i8;
                Pair B = mo7274B(aVar3.mo7319e(i8), iArr[i8], iArr2[i8], cVar, cVar2.f8200L || i6 == 0);
                if (B != null && (aVar2 == null || ((C1165a) B.second).compareTo(aVar2) > 0)) {
                    if (i3 != -1) {
                        aVarArr[i3] = null;
                    }
                    C1175a aVar5 = (C1175a) B.first;
                    aVarArr[i2] = aVar5;
                    str3 = aVar5.f8270a.mo6977l(aVar5.f8271b[0]).f8805c;
                    aVar4 = (C1165a) B.second;
                    i7 = i2;
                    i8 = i2 + 1;
                    i = 1;
                }
            } else {
                i3 = i7;
                aVar2 = aVar4;
                str2 = str3;
                i2 = i8;
            }
            i7 = i3;
            aVar4 = aVar2;
            str3 = str2;
            i8 = i2 + 1;
            i = 1;
        }
        String str4 = str3;
        C1172f fVar = null;
        int i9 = -1;
        while (i4 < c) {
            int d = aVar3.mo7318d(i4);
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        aVarArr[i4] = mo7275D(d, aVar3.mo7319e(i4), iArr[i4], cVar2);
                    } else {
                        str = str4;
                        Pair E = mo7276E(aVar3.mo7319e(i4), iArr[i4], cVar2, str);
                        if (E != null && (fVar == null || ((C1172f) E.second).compareTo(fVar) > 0)) {
                            if (i9 != -1) {
                                aVarArr[i9] = null;
                            }
                            aVarArr[i4] = (C1175a) E.first;
                            fVar = (C1172f) E.second;
                            i9 = i4;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i4++;
            str4 = str;
        }
        return aVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Pair<C1175a, C1165a> mo7274B(TrackGroupArray q0Var, int[][] iArr, int i, C1167c cVar, boolean z) throws ExoPlaybackException {
        TrackGroupArray q0Var2 = q0Var;
        C1167c cVar2 = cVar;
        C1175a aVar = null;
        C1165a aVar2 = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < q0Var2.f7610b; i4++) {
            TrackGroup l = q0Var2.mo6988l(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < l.f7606a; i5++) {
                if (m9960r(iArr2[i5], cVar2.f8198J)) {
                    C1165a aVar3 = new C1165a(l.mo6977l(i5), cVar2, iArr2[i5]);
                    if ((aVar3.f8174a || cVar2.f8191A) && (aVar2 == null || aVar3.compareTo(aVar2) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        aVar2 = aVar3;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup l2 = q0Var2.mo6988l(i2);
        if (!cVar2.f8197I && !cVar2.f8196H && z) {
            int[] l3 = m9954l(l2, iArr[i2], i3, cVar2.f8219z, cVar2.f8192B, cVar2.f8193C, cVar2.f8194D);
            if (l3.length > 1) {
                aVar = new C1175a(l2, l3);
            }
        }
        if (aVar == null) {
            aVar = new C1175a(l2, i3);
        }
        return Pair.create(aVar, (C1165a) Assertions.m10153e(aVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C1175a mo7275D(int i, TrackGroupArray q0Var, int[][] iArr, C1167c cVar) throws ExoPlaybackException {
        TrackGroup p0Var = null;
        C1166b bVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < q0Var.f7610b; i3++) {
            TrackGroup l = q0Var.mo6988l(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < l.f7606a; i4++) {
                if (m9960r(iArr2[i4], cVar.f8198J)) {
                    C1166b bVar2 = new C1166b(l.mo6977l(i4), iArr2[i4]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        p0Var = l;
                        i2 = i4;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (p0Var == null) {
            return null;
        }
        return new C1175a(p0Var, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Pair<C1175a, C1172f> mo7276E(TrackGroupArray q0Var, int[][] iArr, C1167c cVar, String str) throws ExoPlaybackException {
        TrackGroupArray q0Var2 = q0Var;
        C1167c cVar2 = cVar;
        int i = -1;
        TrackGroup p0Var = null;
        C1172f fVar = null;
        for (int i2 = 0; i2 < q0Var2.f7610b; i2++) {
            TrackGroup l = q0Var2.mo6988l(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < l.f7606a; i3++) {
                if (m9960r(iArr2[i3], cVar2.f8198J)) {
                    C1172f fVar2 = new C1172f(l.mo6977l(i3), cVar2, iArr2[i3], str);
                    if (fVar2.f8254a && (fVar == null || fVar2.compareTo(fVar) > 0)) {
                        p0Var = l;
                        i = i3;
                        fVar = fVar2;
                    }
                } else {
                    String str2 = str;
                }
            }
            String str3 = str;
        }
        if (p0Var == null) {
            return null;
        }
        return Pair.create(new C1175a(p0Var, i), (C1172f) Assertions.m10153e(fVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public C1175a mo7277F(TrackGroupArray q0Var, int[][] iArr, int i, C1167c cVar, boolean z) throws ExoPlaybackException {
        C1175a z2 = (cVar.f8197I || cVar.f8196H || !z) ? null : m9968z(q0Var, iArr, i, cVar);
        return z2 == null ? m9950C(q0Var, iArr, cVar) : z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Pair<RendererConfiguration[], C1174h[]> mo7278h(C1177a aVar, int[][][] iArr, int[] iArr2, C1081a aVar2, Timeline x1Var) throws ExoPlaybackException {
        C1167c cVar = (C1167c) this.f8173h.get();
        int c = aVar.mo7317c();
        C1175a[] A = mo7273A(aVar, iArr, iArr2, cVar);
        int i = 0;
        while (true) {
            C1175a aVar3 = null;
            if (i >= c) {
                break;
            }
            if (cVar.mo7286p(i)) {
                A[i] = null;
            } else {
                TrackGroupArray e = aVar.mo7319e(i);
                if (cVar.mo7288r(i, e)) {
                    C1170e q = cVar.mo7287q(i, e);
                    if (q != null) {
                        aVar3 = new C1175a(e.mo6988l(q.f8249a), q.f8250b, q.f8252d, Integer.valueOf(q.f8253e));
                    }
                    A[i] = aVar3;
                }
            }
            i++;
        }
        C1174h[] a = this.f8172g.mo7255a(A, mo7328a(), aVar2, x1Var);
        RendererConfiguration[] s1VarArr = new RendererConfiguration[c];
        for (int i2 = 0; i2 < c; i2++) {
            s1VarArr[i2] = !cVar.mo7286p(i2) && (aVar.mo7318d(i2) == 7 || a[i2] != null) ? RendererConfiguration.f8791a : null;
        }
        if (cVar.f8199K) {
            m9965w(aVar, iArr, s1VarArr, a);
        }
        return Pair.create(s1VarArr, a);
    }

    public DefaultTrackSelector(Context context, C1176b bVar) {
        this(C1167c.m9980o(context), bVar);
    }

    public DefaultTrackSelector(C1167c cVar, C1176b bVar) {
        this.f8172g = bVar;
        this.f8173h = new AtomicReference<>(cVar);
    }
}
