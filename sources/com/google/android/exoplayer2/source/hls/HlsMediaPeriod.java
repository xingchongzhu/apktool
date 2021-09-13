package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.C1830b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist.C1839a;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistTracker.C1850b;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.SeekParameters;
import p067c.p068a.p069a.p070a.p075e2.C0900y;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p097j2.CompositeSequenceableLoaderFactory;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod.C1076a;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;
import p067c.p068a.p069a.p070a.p097j2.SampleStream;
import p067c.p068a.p069a.p070a.p097j2.SequenceableLoader;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.C1174h;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p137c.Ints;

/* renamed from: com.google.android.exoplayer2.source.hls.o */
public final class HlsMediaPeriod implements MediaPeriod, C1830b, C1850b {

    /* renamed from: a */
    private final HlsExtractorFactory f11637a;

    /* renamed from: b */
    private final HlsPlaylistTracker f11638b;

    /* renamed from: c */
    private final HlsDataSourceFactory f11639c;

    /* renamed from: d */
    private final TransferListener f11640d;

    /* renamed from: e */
    private final C0900y f11641e;

    /* renamed from: f */
    private final C0898a f11642f;

    /* renamed from: g */
    private final LoadErrorHandlingPolicy f11643g;

    /* renamed from: h */
    private final C1084a f11644h;

    /* renamed from: i */
    private final Allocator f11645i;

    /* renamed from: j */
    private final IdentityHashMap<SampleStream, Integer> f11646j = new IdentityHashMap<>();

    /* renamed from: k */
    private final TimestampAdjusterProvider f11647k = new TimestampAdjusterProvider();

    /* renamed from: l */
    private final CompositeSequenceableLoaderFactory f11648l;

    /* renamed from: m */
    private final boolean f11649m;

    /* renamed from: n */
    private final int f11650n;

    /* renamed from: o */
    private final boolean f11651o;

    /* renamed from: p */
    private C1076a f11652p;

    /* renamed from: q */
    private int f11653q;

    /* renamed from: r */
    private TrackGroupArray f11654r;

    /* renamed from: s */
    private HlsSampleStreamWrapper[] f11655s = new HlsSampleStreamWrapper[0];

    /* renamed from: t */
    private HlsSampleStreamWrapper[] f11656t = new HlsSampleStreamWrapper[0];

    /* renamed from: u */
    private int[][] f11657u = new int[0][];

    /* renamed from: v */
    private int f11658v;

    /* renamed from: w */
    private SequenceableLoader f11659w;

    public HlsMediaPeriod(HlsExtractorFactory kVar, HlsPlaylistTracker kVar2, HlsDataSourceFactory jVar, TransferListener e0Var, C0900y yVar, C0898a aVar, LoadErrorHandlingPolicy a0Var, C1084a aVar2, Allocator eVar, CompositeSequenceableLoaderFactory qVar, boolean z, int i, boolean z2) {
        this.f11637a = kVar;
        this.f11638b = kVar2;
        this.f11639c = jVar;
        this.f11640d = e0Var;
        this.f11641e = yVar;
        this.f11642f = aVar;
        this.f11643g = a0Var;
        this.f11644h = aVar2;
        this.f11645i = eVar;
        this.f11648l = qVar;
        this.f11649m = z;
        this.f11650n = i;
        this.f11651o = z2;
        this.f11659w = qVar.mo6984a(new SequenceableLoader[0]);
    }

    /* renamed from: q */
    private void m14447q(long j, List<C1839a> list, List<HlsSampleStreamWrapper> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        List<C1839a> list4 = list;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = ((C1839a) list4.get(i)).f11787d;
            if (!hashSet.add(str)) {
                List<HlsSampleStreamWrapper> list5 = list2;
                List<int[]> list6 = list3;
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (Util.m10279b(str, ((C1839a) list4.get(i2)).f11787d)) {
                        C1839a aVar = (C1839a) list4.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.f11784a);
                        arrayList2.add(aVar.f11785b);
                        z &= Util.m10247F(aVar.f11785b.f8811i, 1) == 1;
                    }
                }
                HlsSampleStreamWrapper w = m14450w(1, (Uri[]) arrayList.toArray((Uri[]) Util.m10295j(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), map, j);
                list3.add(Ints.m12042i(arrayList3));
                list2.add(w);
                if (this.f11649m && z) {
                    w.mo14618c0(new TrackGroup[]{new TrackGroup((Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[ADDED_TO_REGION] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14448r(com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist r20, long r21, java.util.List<com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper> r23, java.util.List<int[]> r24, java.util.Map<java.lang.String, p067c.p068a.p069a.p070a.p075e2.DrmInitData> r25) {
        /*
            r19 = this;
            r0 = r20
            java.util.List<com.google.android.exoplayer2.source.hls.v.f$b> r1 = r0.f11775f
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000e:
            java.util.List<com.google.android.exoplayer2.source.hls.v.f$b> r7 = r0.f11775f
            int r7 = r7.size()
            r8 = 2
            r9 = 1
            if (r4 >= r7) goto L_0x0047
            java.util.List<com.google.android.exoplayer2.source.hls.v.f$b> r7 = r0.f11775f
            java.lang.Object r7 = r7.get(r4)
            com.google.android.exoplayer2.source.hls.v.f$b r7 = (com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist.C1840b) r7
            c.a.a.a.u0 r7 = r7.f11789b
            int r10 = r7.f8820r
            if (r10 > 0) goto L_0x0040
            java.lang.String r10 = r7.f8811i
            java.lang.String r10 = p067c.p068a.p069a.p070a.p111m2.Util.m10249G(r10, r8)
            if (r10 == 0) goto L_0x002f
            goto L_0x0040
        L_0x002f:
            java.lang.String r7 = r7.f8811i
            java.lang.String r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10249G(r7, r9)
            if (r7 == 0) goto L_0x003c
            r2[r4] = r9
            int r6 = r6 + 1
            goto L_0x0044
        L_0x003c:
            r7 = -1
            r2[r4] = r7
            goto L_0x0044
        L_0x0040:
            r2[r4] = r8
            int r5 = r5 + 1
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0047:
            if (r5 <= 0) goto L_0x004c
            r1 = r5
            r4 = 1
            goto L_0x0053
        L_0x004c:
            if (r6 >= r1) goto L_0x0052
            int r1 = r1 - r6
            r4 = 0
            r5 = 1
            goto L_0x0054
        L_0x0052:
            r4 = 0
        L_0x0053:
            r5 = 0
        L_0x0054:
            android.net.Uri[] r12 = new android.net.Uri[r1]
            c.a.a.a.u0[] r6 = new p067c.p068a.p069a.p070a.Format[r1]
            int[] r7 = new int[r1]
            r10 = 0
            r11 = 0
        L_0x005c:
            java.util.List<com.google.android.exoplayer2.source.hls.v.f$b> r13 = r0.f11775f
            int r13 = r13.size()
            if (r10 >= r13) goto L_0x0088
            if (r4 == 0) goto L_0x006a
            r13 = r2[r10]
            if (r13 != r8) goto L_0x0085
        L_0x006a:
            if (r5 == 0) goto L_0x0070
            r13 = r2[r10]
            if (r13 == r9) goto L_0x0085
        L_0x0070:
            java.util.List<com.google.android.exoplayer2.source.hls.v.f$b> r13 = r0.f11775f
            java.lang.Object r13 = r13.get(r10)
            com.google.android.exoplayer2.source.hls.v.f$b r13 = (com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist.C1840b) r13
            android.net.Uri r14 = r13.f11788a
            r12[r11] = r14
            c.a.a.a.u0 r13 = r13.f11789b
            r6[r11] = r13
            int r13 = r11 + 1
            r7[r11] = r10
            r11 = r13
        L_0x0085:
            int r10 = r10 + 1
            goto L_0x005c
        L_0x0088:
            r2 = r6[r3]
            java.lang.String r2 = r2.f8811i
            int r4 = p067c.p068a.p069a.p070a.p111m2.Util.m10247F(r2, r8)
            int r2 = p067c.p068a.p069a.p070a.p111m2.Util.m10247F(r2, r9)
            if (r2 > r9) goto L_0x009e
            if (r4 > r9) goto L_0x009e
            int r5 = r2 + r4
            if (r5 <= 0) goto L_0x009e
            r5 = 1
            goto L_0x009f
        L_0x009e:
            r5 = 0
        L_0x009f:
            r11 = 0
            c.a.a.a.u0 r14 = r0.f11780k
            java.util.List<c.a.a.a.u0> r15 = r0.f11781l
            r10 = r19
            r13 = r6
            r16 = r25
            r17 = r21
            com.google.android.exoplayer2.source.hls.q r8 = r10.m14450w(r11, r12, r13, r14, r15, r16, r17)
            r10 = r23
            r10.add(r8)
            r10 = r24
            r10.add(r7)
            r7 = r19
            boolean r10 = r7.f11649m
            if (r10 == 0) goto L_0x0170
            if (r5 == 0) goto L_0x0170
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r4 <= 0) goto L_0x0122
            c.a.a.a.u0[] r4 = new p067c.p068a.p069a.p070a.Format[r1]
            r10 = 0
        L_0x00cb:
            if (r10 >= r1) goto L_0x00d8
            r11 = r6[r10]
            c.a.a.a.u0 r11 = m14453z(r11)
            r4[r10] = r11
            int r10 = r10 + 1
            goto L_0x00cb
        L_0x00d8:
            c.a.a.a.j2.p0 r1 = new c.a.a.a.j2.p0
            r1.<init>(r4)
            r5.add(r1)
            if (r2 <= 0) goto L_0x0102
            c.a.a.a.u0 r1 = r0.f11780k
            if (r1 != 0) goto L_0x00ee
            java.util.List<com.google.android.exoplayer2.source.hls.v.f$a> r1 = r0.f11777h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0102
        L_0x00ee:
            c.a.a.a.j2.p0 r1 = new c.a.a.a.j2.p0
            c.a.a.a.u0[] r2 = new p067c.p068a.p069a.p070a.Format[r9]
            r4 = r6[r3]
            c.a.a.a.u0 r6 = r0.f11780k
            c.a.a.a.u0 r4 = m14451x(r4, r6, r3)
            r2[r3] = r4
            r1.<init>(r2)
            r5.add(r1)
        L_0x0102:
            java.util.List<c.a.a.a.u0> r0 = r0.f11781l
            if (r0 == 0) goto L_0x013c
            r1 = 0
        L_0x0107:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x013c
            c.a.a.a.j2.p0 r2 = new c.a.a.a.j2.p0
            c.a.a.a.u0[] r4 = new p067c.p068a.p069a.p070a.Format[r9]
            java.lang.Object r6 = r0.get(r1)
            c.a.a.a.u0 r6 = (p067c.p068a.p069a.p070a.Format) r6
            r4[r3] = r6
            r2.<init>(r4)
            r5.add(r2)
            int r1 = r1 + 1
            goto L_0x0107
        L_0x0122:
            c.a.a.a.u0[] r2 = new p067c.p068a.p069a.p070a.Format[r1]
            r4 = 0
        L_0x0125:
            if (r4 >= r1) goto L_0x0134
            r10 = r6[r4]
            c.a.a.a.u0 r11 = r0.f11780k
            c.a.a.a.u0 r10 = m14451x(r10, r11, r9)
            r2[r4] = r10
            int r4 = r4 + 1
            goto L_0x0125
        L_0x0134:
            c.a.a.a.j2.p0 r0 = new c.a.a.a.j2.p0
            r0.<init>(r2)
            r5.add(r0)
        L_0x013c:
            c.a.a.a.j2.p0 r0 = new c.a.a.a.j2.p0
            c.a.a.a.u0[] r1 = new p067c.p068a.p069a.p070a.Format[r9]
            c.a.a.a.u0$b r2 = new c.a.a.a.u0$b
            r2.<init>()
            java.lang.String r4 = "ID3"
            c.a.a.a.u0$b r2 = r2.mo7693S(r4)
            java.lang.String r4 = "application/id3"
            c.a.a.a.u0$b r2 = r2.mo7705e0(r4)
            c.a.a.a.u0 r2 = r2.mo7679E()
            r1[r3] = r2
            r0.<init>(r1)
            r5.add(r0)
            c.a.a.a.j2.p0[] r1 = new p067c.p068a.p069a.p070a.p097j2.TrackGroup[r3]
            java.lang.Object[] r1 = r5.toArray(r1)
            c.a.a.a.j2.p0[] r1 = (p067c.p068a.p069a.p070a.p097j2.TrackGroup[]) r1
            int[] r2 = new int[r9]
            int r0 = r5.indexOf(r0)
            r2[r3] = r0
            r8.mo14618c0(r1, r3, r2)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaPeriod.m14448r(com.google.android.exoplayer2.source.hls.v.f, long, java.util.List, java.util.List, java.util.Map):void");
    }

    /* renamed from: v */
    private void m14449v(long j) {
        Map map;
        HlsMasterPlaylist fVar = (HlsMasterPlaylist) Assertions.m10153e(this.f11638b.mo14662b());
        if (this.f11651o) {
            map = m14452y(fVar.f11783n);
        } else {
            map = Collections.emptyMap();
        }
        Map map2 = map;
        boolean z = !fVar.f11775f.isEmpty();
        List<C1839a> list = fVar.f11777h;
        List<C1839a> list2 = fVar.f11778i;
        this.f11653q = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            m14448r(fVar, j, arrayList, arrayList2, map2);
        }
        m14447q(j, list, arrayList, arrayList2, map2);
        this.f11658v = arrayList.size();
        int i = 0;
        while (i < list2.size()) {
            C1839a aVar = (C1839a) list2.get(i);
            int i2 = i;
            C1839a aVar2 = aVar;
            HlsSampleStreamWrapper w = m14450w(3, new Uri[]{aVar.f11784a}, new Format[]{aVar.f11785b}, null, Collections.emptyList(), map2, j);
            arrayList2.add(new int[]{i2});
            arrayList.add(w);
            w.mo14618c0(new TrackGroup[]{new TrackGroup(aVar2.f11785b)}, 0, new int[0]);
            i = i2 + 1;
        }
        this.f11655s = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[0]);
        this.f11657u = (int[][]) arrayList2.toArray(new int[0][]);
        HlsSampleStreamWrapper[] qVarArr = this.f11655s;
        this.f11653q = qVarArr.length;
        qVarArr[0].mo14624l0(true);
        for (HlsSampleStreamWrapper z2 : this.f11655s) {
            z2.mo14632z();
        }
        this.f11656t = this.f11655s;
    }

    /* renamed from: w */
    private HlsSampleStreamWrapper m14450w(int i, Uri[] uriArr, Format[] u0VarArr, Format u0Var, List<Format> list, Map<String, DrmInitData> map, long j) {
        HlsChunkSource iVar = new HlsChunkSource(this.f11637a, this.f11638b, uriArr, u0VarArr, this.f11639c, this.f11640d, this.f11647k, list);
        HlsSampleStreamWrapper qVar = new HlsSampleStreamWrapper(i, this, iVar, map, this.f11645i, j, u0Var, this.f11641e, this.f11642f, this.f11643g, this.f11644h, this.f11650n);
        return qVar;
    }

    /* renamed from: x */
    private static Format m14451x(Format u0Var, Format u0Var2, boolean z) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        Metadata aVar;
        String str3;
        int i4 = -1;
        if (u0Var2 != null) {
            str3 = u0Var2.f8811i;
            aVar = u0Var2.f8812j;
            int i5 = u0Var2.f8827y;
            i2 = u0Var2.f8806d;
            int i6 = u0Var2.f8807e;
            String str4 = u0Var2.f8805c;
            str = u0Var2.f8804b;
            String str5 = str4;
            i = i5;
            i3 = i6;
            str2 = str5;
        } else {
            String G = Util.m10249G(u0Var.f8811i, 1);
            Metadata aVar2 = u0Var.f8812j;
            if (z) {
                int i7 = u0Var.f8827y;
                int i8 = u0Var.f8806d;
                int i9 = u0Var.f8807e;
                str2 = u0Var.f8805c;
                int i10 = i7;
                str3 = G;
                str = u0Var.f8804b;
                i = i10;
                int i11 = i9;
                i2 = i8;
                aVar = aVar2;
                i3 = i11;
            } else {
                str2 = null;
                aVar = aVar2;
                i3 = 0;
                i2 = 0;
                i = -1;
                str3 = G;
                str = null;
            }
        }
        String g = MimeTypes.m10401g(str3);
        int i12 = z ? u0Var.f8808f : -1;
        if (z) {
            i4 = u0Var.f8809g;
        }
        return new C1245b().mo7693S(u0Var.f8803a).mo7695U(str).mo7685K(u0Var.f8813k).mo7705e0(g).mo7683I(str3).mo7698X(aVar).mo7681G(i12).mo7700Z(i4).mo7682H(i).mo7707g0(i2).mo7703c0(i3).mo7696V(str2).mo7679E();
    }

    /* renamed from: y */
    private static Map<String, DrmInitData> m14452y(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData tVar = (DrmInitData) list.get(i);
            String str = tVar.f5920c;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData tVar2 = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(tVar2.f5920c, str)) {
                    tVar = tVar.mo6102q(tVar2);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, tVar);
        }
        return hashMap;
    }

    /* renamed from: z */
    private static Format m14453z(Format u0Var) {
        String G = Util.m10249G(u0Var.f8811i, 2);
        return new C1245b().mo7693S(u0Var.f8803a).mo7695U(u0Var.f8804b).mo7685K(u0Var.f8813k).mo7705e0(MimeTypes.m10401g(G)).mo7683I(G).mo7698X(u0Var.f8812j).mo7681G(u0Var.f8808f).mo7700Z(u0Var.f8809g).mo7710j0(u0Var.f8819q).mo7691Q(u0Var.f8820r).mo7690P(u0Var.f8821s).mo7707g0(u0Var.f8806d).mo7703c0(u0Var.f8807e).mo7679E();
    }

    /* renamed from: A */
    public void mo6954p(HlsSampleStreamWrapper qVar) {
        this.f11652p.mo6954p(this);
    }

    /* renamed from: B */
    public void mo14602B() {
        this.f11638b.mo14666f(this);
        for (HlsSampleStreamWrapper e0 : this.f11655s) {
            e0.mo14620e0();
        }
        this.f11652p = null;
    }

    /* renamed from: a */
    public boolean mo6806a() {
        return this.f11659w.mo6806a();
    }

    /* renamed from: b */
    public long mo6807b() {
        return this.f11659w.mo6807b();
    }

    /* renamed from: c */
    public long mo6808c() {
        return this.f11659w.mo6808c();
    }

    /* renamed from: d */
    public boolean mo6809d(long j) {
        if (this.f11654r != null) {
            return this.f11659w.mo6809d(j);
        }
        for (HlsSampleStreamWrapper z : this.f11655s) {
            z.mo14632z();
        }
        return false;
    }

    /* renamed from: e */
    public void mo6810e(long j) {
        this.f11659w.mo6810e(j);
    }

    /* renamed from: f */
    public void mo14603f() {
        HlsSampleStreamWrapper[] qVarArr;
        int i = this.f11653q - 1;
        this.f11653q = i;
        if (i <= 0) {
            int i2 = 0;
            for (HlsSampleStreamWrapper o : this.f11655s) {
                i2 += o.mo14627o().f7610b;
            }
            TrackGroup[] p0VarArr = new TrackGroup[i2];
            int i3 = 0;
            for (HlsSampleStreamWrapper qVar : this.f11655s) {
                int i4 = qVar.mo14627o().f7610b;
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = i3 + 1;
                    p0VarArr[i3] = qVar.mo14627o().mo6988l(i5);
                    i5++;
                    i3 = i6;
                }
            }
            this.f11654r = new TrackGroupArray(p0VarArr);
            this.f11652p.mo6819m(this);
        }
    }

    /* renamed from: g */
    public long mo6811g(long j, SeekParameters u1Var) {
        return j;
    }

    /* renamed from: h */
    public void mo14604h() {
        for (HlsSampleStreamWrapper a0 : this.f11655s) {
            a0.mo14617a0();
        }
        this.f11652p.mo6954p(this);
    }

    /* renamed from: i */
    public boolean mo14605i(Uri uri, long j) {
        boolean z = true;
        for (HlsSampleStreamWrapper Z : this.f11655s) {
            z &= Z.mo14616Z(uri, j);
        }
        this.f11652p.mo6954p(this);
        return z;
    }

    /* renamed from: j */
    public void mo14606j(Uri uri) {
        this.f11638b.mo14668h(uri);
    }

    /* renamed from: k */
    public long mo6812k() {
        return -9223372036854775807L;
    }

    /* renamed from: l */
    public void mo6813l(C1076a aVar, long j) {
        this.f11652p = aVar;
        this.f11638b.mo14669i(this);
        m14449v(j);
    }

    /* renamed from: n */
    public long mo6814n(C1174h[] hVarArr, boolean[] zArr, SampleStream[] l0VarArr, boolean[] zArr2, long j) {
        boolean z;
        int i;
        C1174h[] hVarArr2 = hVarArr;
        SampleStream[] l0VarArr2 = l0VarArr;
        int[] iArr = new int[hVarArr2.length];
        int[] iArr2 = new int[hVarArr2.length];
        for (int i2 = 0; i2 < hVarArr2.length; i2++) {
            if (l0VarArr2[i2] == null) {
                i = -1;
            } else {
                i = ((Integer) this.f11646j.get(l0VarArr2[i2])).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (hVarArr2[i2] != null) {
                TrackGroup k = hVarArr2[i2].mo7265k();
                int i3 = 0;
                while (true) {
                    HlsSampleStreamWrapper[] qVarArr = this.f11655s;
                    if (i3 >= qVarArr.length) {
                        break;
                    } else if (qVarArr[i3].mo14627o().mo6989m(k) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f11646j.clear();
        int length = hVarArr2.length;
        SampleStream[] l0VarArr3 = new SampleStream[length];
        SampleStream[] l0VarArr4 = new SampleStream[hVarArr2.length];
        C1174h[] hVarArr3 = new C1174h[hVarArr2.length];
        HlsSampleStreamWrapper[] qVarArr2 = new HlsSampleStreamWrapper[this.f11655s.length];
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (i5 < this.f11655s.length) {
            int i6 = 0;
            while (i6 < hVarArr2.length) {
                C1174h hVar = null;
                l0VarArr4[i6] = iArr[i6] == i5 ? l0VarArr2[i6] : null;
                if (iArr2[i6] == i5) {
                    hVar = hVarArr2[i6];
                }
                hVarArr3[i6] = hVar;
                i6++;
            }
            HlsSampleStreamWrapper qVar = this.f11655s[i5];
            HlsSampleStreamWrapper qVar2 = qVar;
            int i7 = length;
            int i8 = i5;
            int i9 = i4;
            C1174h[] hVarArr4 = hVarArr3;
            HlsSampleStreamWrapper[] qVarArr3 = qVarArr2;
            boolean i0 = qVar.mo14622i0(hVarArr3, zArr, l0VarArr4, zArr2, j, z2);
            int i10 = 0;
            boolean z3 = false;
            while (true) {
                z = true;
                if (i10 >= hVarArr2.length) {
                    break;
                }
                SampleStream l0Var = l0VarArr4[i10];
                if (iArr2[i10] == i8) {
                    Assertions.m10153e(l0Var);
                    l0VarArr3[i10] = l0Var;
                    this.f11646j.put(l0Var, Integer.valueOf(i8));
                    z3 = true;
                } else if (iArr[i10] == i8) {
                    if (l0Var != null) {
                        z = false;
                    }
                    Assertions.m10154f(z);
                }
                i10++;
            }
            if (z3) {
                qVarArr3[i9] = qVar2;
                i4 = i9 + 1;
                if (i9 == 0) {
                    qVar2.mo14624l0(true);
                    if (!i0) {
                        HlsSampleStreamWrapper[] qVarArr4 = this.f11656t;
                        if (qVarArr4.length != 0 && qVar2 == qVarArr4[0]) {
                        }
                    }
                    this.f11647k.mo14653b();
                    z2 = true;
                } else {
                    if (i8 >= this.f11658v) {
                        z = false;
                    }
                    qVar2.mo14624l0(z);
                }
            } else {
                i4 = i9;
            }
            i5 = i8 + 1;
            qVarArr2 = qVarArr3;
            length = i7;
            hVarArr3 = hVarArr4;
            l0VarArr2 = l0VarArr;
        }
        SampleStream[] l0VarArr5 = l0VarArr2;
        HlsSampleStreamWrapper[] qVarArr5 = qVarArr2;
        System.arraycopy(l0VarArr3, 0, l0VarArr5, 0, length);
        HlsSampleStreamWrapper[] qVarArr6 = (HlsSampleStreamWrapper[]) Util.m10320v0(qVarArr5, i4);
        this.f11656t = qVarArr6;
        this.f11659w = this.f11648l.mo6984a(qVarArr6);
        return j;
    }

    /* renamed from: o */
    public TrackGroupArray mo6815o() {
        return (TrackGroupArray) Assertions.m10153e(this.f11654r);
    }

    /* renamed from: s */
    public void mo6816s() throws IOException {
        for (HlsSampleStreamWrapper s : this.f11655s) {
            s.mo14629s();
        }
    }

    /* renamed from: t */
    public void mo6817t(long j, boolean z) {
        for (HlsSampleStreamWrapper t : this.f11656t) {
            t.mo14630t(j, z);
        }
    }

    /* renamed from: u */
    public long mo6818u(long j) {
        HlsSampleStreamWrapper[] qVarArr = this.f11656t;
        if (qVarArr.length > 0) {
            boolean h0 = qVarArr[0].mo14621h0(j, false);
            int i = 1;
            while (true) {
                HlsSampleStreamWrapper[] qVarArr2 = this.f11656t;
                if (i >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i].mo14621h0(j, h0);
                i++;
            }
            if (h0) {
                this.f11647k.mo14653b();
            }
        }
        return j;
    }
}
