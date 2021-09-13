package p067c.p068a.p069a.p070a.p110l2;

import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunk;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunkIterator;
import p067c.p068a.p069a.p070a.p110l2.C1174h.C1175a;
import p067c.p068a.p069a.p070a.p110l2.C1174h.C1176b;
import p067c.p068a.p069a.p070a.p111m2.Clock;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.C1354e0;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableList.C1378a;
import p067c.p068a.p134b.p136b.Iterables;
import p067c.p068a.p134b.p136b.ListMultimap;

/* renamed from: c.a.a.a.l2.d */
public class AdaptiveTrackSelection extends BaseTrackSelection {

    /* renamed from: g */
    private final BandwidthMeter f8142g;

    /* renamed from: h */
    private final long f8143h;

    /* renamed from: i */
    private final long f8144i;

    /* renamed from: j */
    private final long f8145j;

    /* renamed from: k */
    private final float f8146k;

    /* renamed from: l */
    private final float f8147l;

    /* renamed from: m */
    private final ImmutableList<C1163a> f8148m;

    /* renamed from: n */
    private final Clock f8149n;

    /* renamed from: o */
    private float f8150o = 1.0f;

    /* renamed from: p */
    private int f8151p;

    /* renamed from: q */
    private int f8152q = 0;

    /* renamed from: r */
    private long f8153r = -9223372036854775807L;

    /* renamed from: s */
    private MediaChunk f8154s;

    /* renamed from: c.a.a.a.l2.d$a */
    /* compiled from: AdaptiveTrackSelection */
    protected static final class C1163a {

        /* renamed from: a */
        public final long f8155a;

        /* renamed from: b */
        public final long f8156b;

        public C1163a(long j, long j2) {
            this.f8155a = j;
            this.f8156b = j2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1163a)) {
                return false;
            }
            C1163a aVar = (C1163a) obj;
            if (!(this.f8155a == aVar.f8155a && this.f8156b == aVar.f8156b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((int) this.f8155a) * 31) + ((int) this.f8156b);
        }
    }

    /* renamed from: c.a.a.a.l2.d$b */
    /* compiled from: AdaptiveTrackSelection */
    public static class C1164b implements C1176b {

        /* renamed from: a */
        private final int f8157a;

        /* renamed from: b */
        private final int f8158b;

        /* renamed from: c */
        private final int f8159c;

        /* renamed from: d */
        private final float f8160d;

        /* renamed from: e */
        private final float f8161e;

        /* renamed from: f */
        private final Clock f8162f;

        public C1164b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, Clock.f8368a);
        }

        /* renamed from: a */
        public final C1174h[] mo7255a(C1175a[] aVarArr, BandwidthMeter gVar, C1081a aVar, Timeline x1Var) {
            C1174h hVar;
            ImmutableList w = AdaptiveTrackSelection.m9911A(aVarArr);
            C1174h[] hVarArr = new C1174h[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                C1175a aVar2 = aVarArr[i];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f8271b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            hVar = new FixedTrackSelection(aVar2.f8270a, iArr[0], aVar2.f8272c, aVar2.f8273d);
                        } else {
                            hVar = mo7256b(aVar2.f8270a, gVar, iArr, (ImmutableList) w.get(i));
                        }
                        hVarArr[i] = hVar;
                    }
                }
            }
            return hVarArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public AdaptiveTrackSelection mo7256b(TrackGroup p0Var, BandwidthMeter gVar, int[] iArr, ImmutableList<C1163a> rVar) {
            AdaptiveTrackSelection dVar = new AdaptiveTrackSelection(p0Var, iArr, gVar, (long) this.f8157a, (long) this.f8158b, (long) this.f8159c, this.f8160d, this.f8161e, rVar, this.f8162f);
            return dVar;
        }

        public C1164b(int i, int i2, int i3, float f, float f2, Clock gVar) {
            this.f8157a = i;
            this.f8158b = i2;
            this.f8159c = i3;
            this.f8160d = f;
            this.f8161e = f2;
            this.f8162f = gVar;
        }
    }

    protected AdaptiveTrackSelection(TrackGroup p0Var, int[] iArr, BandwidthMeter gVar, long j, long j2, long j3, float f, float f2, List<C1163a> list, Clock gVar2) {
        super(p0Var, iArr);
        this.f8142g = gVar;
        this.f8143h = j * 1000;
        this.f8144i = j2 * 1000;
        this.f8145j = j3 * 1000;
        this.f8146k = f;
        this.f8147l = f2;
        this.f8148m = ImmutableList.m11916m(list);
        this.f8149n = gVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static ImmutableList<ImmutableList<C1163a>> m9911A(C1175a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVarArr.length; i++) {
            if (aVarArr[i] == null || aVarArr[i].f8271b.length <= 1) {
                arrayList.add(null);
            } else {
                C1378a k = ImmutableList.m11914k();
                k.mo8440d(new C1163a(0, 0));
                arrayList.add(k);
            }
        }
        long[][] D = m9913D(aVarArr);
        int[] iArr = new int[D.length];
        long[] jArr = new long[D.length];
        for (int i2 = 0; i2 < D.length; i2++) {
            jArr[i2] = D[i2].length == 0 ? 0 : D[i2][0];
        }
        m9917x(arrayList, jArr);
        ImmutableList E = m9914E(D);
        for (int i3 = 0; i3 < E.size(); i3++) {
            int intValue = ((Integer) E.get(i3)).intValue();
            int i4 = iArr[intValue] + 1;
            iArr[intValue] = i4;
            jArr[intValue] = D[intValue][i4];
            m9917x(arrayList, jArr);
        }
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] * 2;
            }
        }
        m9917x(arrayList, jArr);
        C1378a k2 = ImmutableList.m11914k();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            C1378a aVar = (C1378a) arrayList.get(i6);
            k2.mo8440d(aVar == null ? ImmutableList.m11917p() : aVar.mo8441e());
        }
        return k2.mo8441e();
    }

    /* renamed from: B */
    private long m9912B() {
        long c = (long) (((float) this.f8142g.mo14929c()) * this.f8146k);
        if (this.f8148m.isEmpty()) {
            return c;
        }
        int i = 1;
        while (i < this.f8148m.size() - 1 && ((C1163a) this.f8148m.get(i)).f8155a < c) {
            i++;
        }
        C1163a aVar = (C1163a) this.f8148m.get(i - 1);
        C1163a aVar2 = (C1163a) this.f8148m.get(i);
        long j = aVar.f8155a;
        float f = ((float) (c - j)) / ((float) (aVar2.f8155a - j));
        long j2 = aVar.f8156b;
        return j2 + ((long) (f * ((float) (aVar2.f8156b - j2))));
    }

    /* renamed from: D */
    private static long[][] m9913D(C1175a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            C1175a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.f8271b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.f8271b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    jArr[i][i2] = (long) aVar.f8270a.mo6977l(iArr[i2]).f8810h;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    /* renamed from: E */
    private static ImmutableList<Integer> m9914E(long[][] jArr) {
        double d;
        long[][] jArr2 = jArr;
        ListMultimap c = C1354e0.m11759a().mo8304a().mo8303c();
        for (int i = 0; i < jArr2.length; i++) {
            if (jArr2[i].length > 1) {
                int length = jArr2[i].length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    double d2 = 0.0d;
                    if (i2 >= jArr2[i].length) {
                        break;
                    }
                    if (jArr2[i][i2] != -1) {
                        d2 = Math.log((double) jArr2[i][i2]);
                    }
                    dArr[i2] = d2;
                    i2++;
                }
                int i3 = length - 1;
                double d3 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d4 = dArr[i4];
                    i4++;
                    double d5 = (d4 + dArr[i4]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    c.put(Double.valueOf(d), Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.m11916m(c.values());
    }

    /* renamed from: F */
    private long m9915F(long j) {
        if (j != -9223372036854775807L && j <= this.f8143h) {
            return (long) (((float) j) * this.f8147l);
        }
        return this.f8143h;
    }

    /* renamed from: x */
    private static void m9917x(List<C1378a<C1163a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            C1378a aVar = (C1378a) list.get(i);
            if (aVar != null) {
                aVar.mo8440d(new C1163a(j, jArr[i]));
            }
        }
    }

    /* renamed from: z */
    private int m9918z(long j) {
        long B = m9912B();
        int i = 0;
        for (int i2 = 0; i2 < this.f8164b; i2++) {
            if (j == Long.MIN_VALUE || !mo7272u(i2, j)) {
                Format e = mo7260e(i2);
                if (mo7252y(e, e.f8810h, this.f8150o, B)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public long mo7242C() {
        return this.f8145j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo7243G(long j, List<? extends MediaChunk> list) {
        long j2 = this.f8153r;
        return j2 == -9223372036854775807L || j - j2 >= 1000 || (!list.isEmpty() && !((MediaChunk) Iterables.m12008c(list)).equals(this.f8154s));
    }

    /* renamed from: d */
    public void mo7244d() {
        this.f8154s = null;
    }

    /* renamed from: f */
    public void mo7245f() {
        this.f8153r = -9223372036854775807L;
        this.f8154s = null;
    }

    /* renamed from: h */
    public int mo7246h(long j, List<? extends MediaChunk> list) {
        long c = this.f8149n.mo7425c();
        if (!mo7243G(c, list)) {
            return list.size();
        }
        this.f8153r = c;
        this.f8154s = list.isEmpty() ? null : (MediaChunk) Iterables.m12008c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long Y = Util.m10275Y(((MediaChunk) list.get(size - 1)).f7645g - j, this.f8150o);
        long C = mo7242C();
        if (Y < C) {
            return size;
        }
        Format e = mo7260e(m9918z(c));
        for (int i = 0; i < size; i++) {
            MediaChunk dVar = (MediaChunk) list.get(i);
            Format u0Var = dVar.f7642d;
            if (Util.m10275Y(dVar.f7645g - j, this.f8150o) >= C && u0Var.f8810h < e.f8810h) {
                int i2 = u0Var.f8820r;
                if (i2 != -1 && i2 < 720) {
                    int i3 = u0Var.f8819q;
                    if (i3 != -1 && i3 < 1280 && i2 < e.f8820r) {
                        return i;
                    }
                }
            }
        }
        return size;
    }

    /* renamed from: i */
    public void mo7247i(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] eVarArr) {
        long c = this.f8149n.mo7425c();
        int i = this.f8152q;
        if (i == 0) {
            this.f8152q = 1;
            this.f8151p = m9918z(c);
            return;
        }
        int i2 = this.f8151p;
        int t = list.isEmpty() ? -1 : mo7271t(((MediaChunk) Iterables.m12008c(list)).f7642d);
        if (t != -1) {
            i = ((MediaChunk) Iterables.m12008c(list)).f7643e;
            i2 = t;
        }
        int z = m9918z(c);
        if (!mo7272u(i2, c)) {
            Format e = mo7260e(i2);
            Format e2 = mo7260e(z);
            if ((e2.f8810h > e.f8810h && j2 < m9915F(j3)) || (e2.f8810h < e.f8810h && j2 >= this.f8144i)) {
                z = i2;
            }
        }
        if (z != i2) {
            i = 3;
        }
        this.f8152q = i;
        this.f8151p = z;
    }

    /* renamed from: m */
    public int mo7248m() {
        return this.f8152q;
    }

    /* renamed from: n */
    public int mo7249n() {
        return this.f8151p;
    }

    /* renamed from: o */
    public void mo7250o(float f) {
        this.f8150o = f;
    }

    /* renamed from: p */
    public Object mo7251p() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo7252y(Format u0Var, int i, float f, long j) {
        return ((long) Math.round(((float) i) * f)) <= j;
    }
}
