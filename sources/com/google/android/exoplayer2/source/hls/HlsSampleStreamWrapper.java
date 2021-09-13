package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.hls.HlsChunkSource.C1825b;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.C1898b0;
import com.google.android.exoplayer2.upstream.C1898b0.C1900b;
import com.google.android.exoplayer2.upstream.C1898b0.C1901c;
import com.google.android.exoplayer2.upstream.C1898b0.C1904f;
import com.google.android.exoplayer2.upstream.C1926y.C1931e;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.C1896a;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p075e2.C0900y;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0916b0.C0917a;
import p067c.p068a.p069a.p070a.p076f2.DummyTrackOutput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.TrackOutput;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p090j.EventMessage;
import p067c.p068a.p069a.p070a.p088h2.p090j.EventMessageDecoder;
import p067c.p068a.p069a.p070a.p088h2.p093m.PrivFrame;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p097j2.MediaLoadData;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;
import p067c.p068a.p069a.p070a.p097j2.SampleQueue;
import p067c.p068a.p069a.p070a.p097j2.SampleQueue.C1100b;
import p067c.p068a.p069a.p070a.p097j2.SampleStream;
import p067c.p068a.p069a.p070a.p097j2.SequenceableLoader;
import p067c.p068a.p069a.p070a.p097j2.SequenceableLoader.C1101a;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p097j2.p099t0.Chunk;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableList.C1378a;
import p067c.p068a.p134b.p136b.Iterables;

/* renamed from: com.google.android.exoplayer2.source.hls.q */
final class HlsSampleStreamWrapper implements C1900b<Chunk>, C1904f, SequenceableLoader, ExtractorOutput, C1100b {

    /* renamed from: a */
    private static final Set<Integer> f11663a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(5)})));

    /* renamed from: A */
    private int f11664A;

    /* renamed from: B */
    private int f11665B;

    /* renamed from: C */
    private boolean f11666C;

    /* renamed from: D */
    private boolean f11667D;

    /* renamed from: G */
    private int f11668G;

    /* renamed from: H */
    private Format f11669H;

    /* renamed from: I */
    private Format f11670I;

    /* renamed from: J */
    private boolean f11671J;

    /* renamed from: K */
    private TrackGroupArray f11672K;

    /* renamed from: L */
    private Set<TrackGroup> f11673L;

    /* renamed from: M */
    private int[] f11674M;

    /* renamed from: N */
    private int f11675N;

    /* renamed from: O */
    private boolean f11676O;

    /* renamed from: P */
    private boolean[] f11677P;

    /* renamed from: Q */
    private boolean[] f11678Q;

    /* renamed from: R */
    private long f11679R;

    /* renamed from: S */
    private long f11680S;

    /* renamed from: T */
    private boolean f11681T;

    /* renamed from: U */
    private boolean f11682U;

    /* renamed from: V */
    private boolean f11683V;

    /* renamed from: W */
    private boolean f11684W;

    /* renamed from: X */
    private long f11685X;

    /* renamed from: Y */
    private DrmInitData f11686Y;

    /* renamed from: Z */
    private HlsMediaChunk f11687Z;

    /* renamed from: b */
    private final int f11688b;

    /* renamed from: c */
    private final C1830b f11689c;

    /* renamed from: d */
    private final HlsChunkSource f11690d;

    /* renamed from: e */
    private final Allocator f11691e;

    /* renamed from: f */
    private final Format f11692f;

    /* renamed from: g */
    private final C0900y f11693g;

    /* renamed from: h */
    private final C0898a f11694h;

    /* renamed from: i */
    private final LoadErrorHandlingPolicy f11695i;

    /* renamed from: j */
    private final C1898b0 f11696j = new C1898b0("Loader:HlsSampleStreamWrapper");

    /* renamed from: k */
    private final C1084a f11697k;

    /* renamed from: l */
    private final int f11698l;

    /* renamed from: m */
    private final C1825b f11699m = new C1825b();

    /* renamed from: n */
    private final ArrayList<HlsMediaChunk> f11700n;

    /* renamed from: o */
    private final List<HlsMediaChunk> f11701o;

    /* renamed from: p */
    private final Runnable f11702p;

    /* renamed from: q */
    private final Runnable f11703q;

    /* renamed from: r */
    private final Handler f11704r;

    /* renamed from: s */
    private final ArrayList<HlsSampleStream> f11705s;

    /* renamed from: t */
    private final Map<String, DrmInitData> f11706t;

    /* renamed from: u */
    private Chunk f11707u;

    /* renamed from: v */
    private C1832d[] f11708v;

    /* renamed from: w */
    private int[] f11709w = new int[0];

    /* renamed from: x */
    private Set<Integer> f11710x;

    /* renamed from: y */
    private SparseIntArray f11711y;

    /* renamed from: z */
    private C0916b0 f11712z;

    /* renamed from: com.google.android.exoplayer2.source.hls.q$b */
    /* compiled from: HlsSampleStreamWrapper */
    public interface C1830b extends C1101a<HlsSampleStreamWrapper> {
        /* renamed from: f */
        void mo14603f();

        /* renamed from: j */
        void mo14606j(Uri uri);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.q$c */
    /* compiled from: HlsSampleStreamWrapper */
    private static class C1831c implements C0916b0 {

        /* renamed from: a */
        private static final Format f11713a = new C1245b().mo7705e0("application/id3").mo7679E();

        /* renamed from: b */
        private static final Format f11714b = new C1245b().mo7705e0("application/x-emsg").mo7679E();

        /* renamed from: c */
        private final EventMessageDecoder f11715c = new EventMessageDecoder();

        /* renamed from: d */
        private final C0916b0 f11716d;

        /* renamed from: e */
        private final Format f11717e;

        /* renamed from: f */
        private Format f11718f;

        /* renamed from: g */
        private byte[] f11719g;

        /* renamed from: h */
        private int f11720h;

        public C1831c(C0916b0 b0Var, int i) {
            this.f11716d = b0Var;
            if (i == 1) {
                this.f11717e = f11713a;
            } else if (i == 3) {
                this.f11717e = f11714b;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown metadataType: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f11719g = new byte[0];
            this.f11720h = 0;
        }

        /* renamed from: g */
        private boolean m14546g(EventMessage aVar) {
            Format f = aVar.mo6559f();
            return f != null && Util.m10279b(this.f11717e.f8814l, f.f8814l);
        }

        /* renamed from: h */
        private void m14547h(int i) {
            byte[] bArr = this.f11719g;
            if (bArr.length < i) {
                this.f11719g = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        /* renamed from: i */
        private ParsableByteArray m14548i(int i, int i2) {
            int i3 = this.f11720h - i2;
            ParsableByteArray a0Var = new ParsableByteArray(Arrays.copyOfRange(this.f11719g, i3 - i, i3));
            byte[] bArr = this.f11719g;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f11720h = i2;
            return a0Var;
        }

        /* renamed from: a */
        public /* synthetic */ void mo6174a(ParsableByteArray a0Var, int i) {
            TrackOutput.m7284b(this, a0Var, i);
        }

        /* renamed from: b */
        public int mo6175b(DataReader jVar, int i, boolean z, int i2) throws IOException {
            m14547h(this.f11720h + i);
            int b = jVar.mo6195b(this.f11719g, this.f11720h, i);
            if (b != -1) {
                this.f11720h += b;
                return b;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        /* renamed from: c */
        public void mo6176c(long j, int i, int i2, int i3, C0917a aVar) {
            Assertions.m10153e(this.f11718f);
            ParsableByteArray i4 = m14548i(i2, i3);
            if (!Util.m10279b(this.f11718f.f8814l, this.f11717e.f8814l)) {
                String str = "EmsgUnwrappingTrackOutput";
                if ("application/x-emsg".equals(this.f11718f.f8814l)) {
                    EventMessage c = this.f11715c.mo6583c(i4);
                    if (!m14546g(c)) {
                        Log.m10386h(str, String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f11717e.f8814l, c.mo6559f()}));
                        return;
                    }
                    i4 = new ParsableByteArray((byte[]) Assertions.m10153e(c.mo6560i()));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring sample for unsupported format: ");
                    sb.append(this.f11718f.f8814l);
                    Log.m10386h(str, sb.toString());
                    return;
                }
            }
            int a = i4.mo7376a();
            this.f11716d.mo6174a(i4, a);
            this.f11716d.mo6176c(j, i, a, i3, aVar);
        }

        /* renamed from: d */
        public void mo6177d(Format u0Var) {
            this.f11718f = u0Var;
            this.f11716d.mo6177d(this.f11717e);
        }

        /* renamed from: e */
        public void mo6178e(ParsableByteArray a0Var, int i, int i2) {
            m14547h(this.f11720h + i);
            a0Var.mo7385j(this.f11719g, this.f11720h, i);
            this.f11720h += i;
        }

        /* renamed from: f */
        public /* synthetic */ int mo6179f(DataReader jVar, int i, boolean z) {
            return TrackOutput.m7283a(this, jVar, i, z);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.q$d */
    /* compiled from: HlsSampleStreamWrapper */
    private static final class C1832d extends SampleQueue {

        /* renamed from: J */
        private final Map<String, DrmInitData> f11721J;

        /* renamed from: K */
        private DrmInitData f11722K;

        /* renamed from: Z */
        private Metadata m14555Z(Metadata aVar) {
            if (aVar == null) {
                return null;
            }
            int o = aVar.mo6552o();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= o) {
                    i2 = -1;
                    break;
                }
                C1034b n = aVar.mo6551n(i2);
                if (n instanceof PrivFrame) {
                    if ("com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) n).f7308b)) {
                        break;
                    }
                }
                i2++;
            }
            if (i2 == -1) {
                return aVar;
            }
            if (o == 1) {
                return null;
            }
            C1034b[] bVarArr = new C1034b[(o - 1)];
            while (i < o) {
                if (i != i2) {
                    bVarArr[i < i2 ? i : i - 1] = aVar.mo6551n(i);
                }
                i++;
            }
            return new Metadata(bVarArr);
        }

        /* renamed from: a0 */
        public void mo14633a0(DrmInitData tVar) {
            this.f11722K = tVar;
            mo6928C();
        }

        /* renamed from: b0 */
        public void mo14634b0(HlsMediaChunk mVar) {
            mo6943X(mVar.f11622l);
        }

        /* renamed from: c */
        public void mo6176c(long j, int i, int i2, int i3, C0917a aVar) {
            super.mo6176c(j, i, i2, i3, aVar);
        }

        /* renamed from: s */
        public Format mo6948s(Format u0Var) {
            DrmInitData tVar = this.f11722K;
            if (tVar == null) {
                tVar = u0Var.f8817o;
            }
            if (tVar != null) {
                DrmInitData tVar2 = (DrmInitData) this.f11721J.get(tVar.f5920c);
                if (tVar2 != null) {
                    tVar = tVar2;
                }
            }
            Metadata Z = m14555Z(u0Var.f8812j);
            if (!(tVar == u0Var.f8817o && Z == u0Var.f8812j)) {
                u0Var = u0Var.mo7668l().mo7686L(tVar).mo7698X(Z).mo7679E();
            }
            return super.mo6948s(u0Var);
        }

        private C1832d(Allocator eVar, Looper looper, C0900y yVar, C0898a aVar, Map<String, DrmInitData> map) {
            super(eVar, looper, yVar, aVar);
            this.f11721J = map;
        }
    }

    public HlsSampleStreamWrapper(int i, C1830b bVar, HlsChunkSource iVar, Map<String, DrmInitData> map, Allocator eVar, long j, Format u0Var, C0900y yVar, C0898a aVar, LoadErrorHandlingPolicy a0Var, C1084a aVar2, int i2) {
        this.f11688b = i;
        this.f11689c = bVar;
        this.f11690d = iVar;
        this.f11706t = map;
        this.f11691e = eVar;
        this.f11692f = u0Var;
        this.f11693g = yVar;
        this.f11694h = aVar;
        this.f11695i = a0Var;
        this.f11697k = aVar2;
        this.f11698l = i2;
        Set<Integer> set = f11663a;
        this.f11710x = new HashSet(set.size());
        this.f11711y = new SparseIntArray(set.size());
        this.f11708v = new C1832d[0];
        this.f11678Q = new boolean[0];
        this.f11677P = new boolean[0];
        ArrayList<HlsMediaChunk> arrayList = new ArrayList<>();
        this.f11700n = arrayList;
        this.f11701o = Collections.unmodifiableList(arrayList);
        this.f11705s = new ArrayList<>();
        this.f11702p = new C1821b(this);
        this.f11703q = new C1820a(this);
        this.f11704r = Util.m10319v();
        this.f11679R = j;
        this.f11680S = j;
    }

    /* renamed from: A */
    private static DummyTrackOutput m14481A(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        Log.m10386h("HlsSampleStreamWrapper", sb.toString());
        return new DummyTrackOutput();
    }

    /* renamed from: B */
    private SampleQueue m14482B(int i, int i2) {
        int length = this.f11708v.length;
        boolean z = true;
        if (!(i2 == 1 || i2 == 2)) {
            z = false;
        }
        C1832d dVar = new C1832d(this.f11691e, this.f11704r.getLooper(), this.f11693g, this.f11694h, this.f11706t);
        dVar.mo6940T(this.f11679R);
        if (z) {
            dVar.mo14633a0(this.f11686Y);
        }
        dVar.mo6939S(this.f11685X);
        HlsMediaChunk mVar = this.f11687Z;
        if (mVar != null) {
            dVar.mo14634b0(mVar);
        }
        dVar.mo6941V(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f11709w, i3);
        this.f11709w = copyOf;
        copyOf[length] = i;
        this.f11708v = (C1832d[]) Util.m10316t0(this.f11708v, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f11678Q, i3);
        this.f11678Q = copyOf2;
        copyOf2[length] = z;
        this.f11676O = copyOf2[length] | this.f11676O;
        this.f11710x.add(Integer.valueOf(i2));
        this.f11711y.append(i2, length);
        if (m14491K(i2) > m14491K(this.f11664A)) {
            this.f11665B = length;
            this.f11664A = i2;
        }
        this.f11677P = Arrays.copyOf(this.f11677P, i3);
        return dVar;
    }

    /* renamed from: C */
    private TrackGroupArray m14483C(TrackGroup[] p0VarArr) {
        for (int i = 0; i < p0VarArr.length; i++) {
            TrackGroup p0Var = p0VarArr[i];
            Format[] u0VarArr = new Format[p0Var.f7606a];
            for (int i2 = 0; i2 < p0Var.f7606a; i2++) {
                Format l = p0Var.mo6977l(i2);
                u0VarArr[i2] = l.mo7669m(this.f11693g.mo6085c(l));
            }
            p0VarArr[i] = new TrackGroup(u0VarArr);
        }
        return new TrackGroupArray(p0VarArr);
    }

    /* renamed from: D */
    private static Format m14484D(Format u0Var, Format u0Var2, boolean z) {
        String str;
        String str2;
        if (u0Var == null) {
            return u0Var2;
        }
        int k = MimeTypes.m10405k(u0Var2.f8814l);
        if (Util.m10247F(u0Var.f8811i, k) == 1) {
            str2 = Util.m10249G(u0Var.f8811i, k);
            str = MimeTypes.m10401g(str2);
        } else {
            str2 = MimeTypes.m10398d(u0Var.f8811i, u0Var2.f8814l);
            str = u0Var2.f8814l;
        }
        C1245b Q = u0Var2.mo7668l().mo7693S(u0Var.f8803a).mo7695U(u0Var.f8804b).mo7696V(u0Var.f8805c).mo7707g0(u0Var.f8806d).mo7703c0(u0Var.f8807e).mo7681G(z ? u0Var.f8808f : -1).mo7700Z(z ? u0Var.f8809g : -1).mo7683I(str2).mo7710j0(u0Var.f8819q).mo7691Q(u0Var.f8820r);
        if (str != null) {
            Q.mo7705e0(str);
        }
        int i = u0Var.f8827y;
        if (i != -1) {
            Q.mo7682H(i);
        }
        Metadata aVar = u0Var.f8812j;
        if (aVar != null) {
            Metadata aVar2 = u0Var2.f8812j;
            if (aVar2 != null) {
                aVar = aVar2.mo6550m(aVar);
            }
            Q.mo7698X(aVar);
        }
        return Q.mo7679E();
    }

    /* renamed from: E */
    private void m14485E(int i) {
        Assertions.m10154f(!this.f11696j.mo14897i());
        while (true) {
            if (i >= this.f11700n.size()) {
                i = -1;
                break;
            } else if (m14506y(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            long j = m14489I().f7646h;
            HlsMediaChunk F = m14486F(i);
            if (this.f11700n.isEmpty()) {
                this.f11680S = this.f11679R;
            } else {
                ((HlsMediaChunk) Iterables.m12008c(this.f11700n)).mo14597n();
            }
            this.f11683V = false;
            this.f11697k.mo6845D(this.f11664A, F.f7645g, j);
        }
    }

    /* renamed from: F */
    private HlsMediaChunk m14486F(int i) {
        HlsMediaChunk mVar = (HlsMediaChunk) this.f11700n.get(i);
        ArrayList<HlsMediaChunk> arrayList = this.f11700n;
        Util.m10238A0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.f11708v.length; i2++) {
            this.f11708v[i2].mo6947q(mVar.mo14595l(i2));
        }
        return mVar;
    }

    /* renamed from: G */
    private boolean m14487G(HlsMediaChunk mVar) {
        int i = mVar.f11622l;
        int length = this.f11708v.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f11677P[i2] && this.f11708v[i2].mo6932J() == i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private static boolean m14488H(Format u0Var, Format u0Var2) {
        String str = u0Var.f8814l;
        String str2 = u0Var2.f8814l;
        int k = MimeTypes.m10405k(str);
        boolean z = true;
        if (k != 3) {
            if (k != MimeTypes.m10405k(str2)) {
                z = false;
            }
            return z;
        } else if (!Util.m10279b(str, str2)) {
            return false;
        } else {
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                return true;
            }
            if (u0Var.f8800D != u0Var2.f8800D) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: I */
    private HlsMediaChunk m14489I() {
        ArrayList<HlsMediaChunk> arrayList = this.f11700n;
        return (HlsMediaChunk) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: J */
    private C0916b0 m14490J(int i, int i2) {
        C0916b0 b0Var;
        Assertions.m10149a(f11663a.contains(Integer.valueOf(i2)));
        int i3 = this.f11711y.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.f11710x.add(Integer.valueOf(i2))) {
            this.f11709w[i3] = i;
        }
        if (this.f11709w[i3] == i) {
            b0Var = this.f11708v[i3];
        } else {
            b0Var = m14481A(i, i2);
        }
        return b0Var;
    }

    /* renamed from: K */
    private static int m14491K(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: L */
    private void m14492L(HlsMediaChunk mVar) {
        C1832d[] dVarArr;
        this.f11687Z = mVar;
        this.f11669H = mVar.f7642d;
        this.f11680S = -9223372036854775807L;
        this.f11700n.add(mVar);
        C1378a k = ImmutableList.m11914k();
        for (C1832d A : this.f11708v) {
            k.mo8440d(Integer.valueOf(A.mo6927A()));
        }
        mVar.mo14596m(this, k.mo8441e());
        for (C1832d dVar : this.f11708v) {
            dVar.mo14634b0(mVar);
            if (mVar.f11625o) {
                dVar.mo6944Y();
            }
        }
    }

    /* renamed from: M */
    private static boolean m14493M(Chunk bVar) {
        return bVar instanceof HlsMediaChunk;
    }

    /* renamed from: N */
    private boolean m14494N() {
        return this.f11680S != -9223372036854775807L;
    }

    @RequiresNonNull({"trackGroups"})
    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    /* renamed from: R */
    private void m14497R() {
        int i = this.f11672K.f7610b;
        int[] iArr = new int[i];
        this.f11674M = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C1832d[] dVarArr = this.f11708v;
                if (i3 >= dVarArr.length) {
                    break;
                } else if (m14488H((Format) Assertions.m10156h(dVarArr[i3].mo6953z()), this.f11672K.mo6988l(i2).mo6977l(0))) {
                    this.f11674M[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator it = this.f11705s.iterator();
        while (it.hasNext()) {
            ((HlsSampleStream) it.next()).mo14607d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m14498S() {
        if (!this.f11671J && this.f11674M == null && this.f11666C) {
            C1832d[] dVarArr = this.f11708v;
            int length = dVarArr.length;
            int i = 0;
            while (i < length) {
                if (dVarArr[i].mo6953z() != null) {
                    i++;
                } else {
                    return;
                }
            }
            if (this.f11672K != null) {
                m14497R();
            } else {
                m14505x();
                m14502k0();
                this.f11689c.mo14603f();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m14499b0() {
        this.f11666C = true;
        m14498S();
    }

    /* renamed from: f0 */
    private void m14500f0() {
        for (C1832d P : this.f11708v) {
            P.mo6937P(this.f11681T);
        }
        this.f11681T = false;
    }

    /* renamed from: g0 */
    private boolean m14501g0(long j) {
        int length = this.f11708v.length;
        for (int i = 0; i < length; i++) {
            if (!this.f11708v[i].mo6938R(j, false) && (this.f11678Q[i] || !this.f11676O)) {
                return false;
            }
        }
        return true;
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: k0 */
    private void m14502k0() {
        this.f11667D = true;
    }

    /* renamed from: p0 */
    private void m14503p0(SampleStream[] l0VarArr) {
        this.f11705s.clear();
        for (HlsSampleStream pVar : l0VarArr) {
            if (pVar != null) {
                this.f11705s.add(pVar);
            }
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: v */
    private void m14504v() {
        Assertions.m10154f(this.f11667D);
        Assertions.m10153e(this.f11672K);
        Assertions.m10153e(this.f11673L);
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    /* renamed from: x */
    private void m14505x() {
        int length = this.f11708v.length;
        boolean z = false;
        int i = 0;
        int i2 = 7;
        int i3 = -1;
        while (true) {
            int i4 = 2;
            if (i >= length) {
                break;
            }
            String str = ((Format) Assertions.m10156h(this.f11708v[i].mo6953z())).f8814l;
            if (!MimeTypes.m10411q(str)) {
                i4 = MimeTypes.m10409o(str) ? 1 : MimeTypes.m10410p(str) ? 3 : 7;
            }
            if (m14491K(i4) > m14491K(i2)) {
                i3 = i;
                i2 = i4;
            } else if (i4 == i2 && i3 != -1) {
                i3 = -1;
            }
            i++;
        }
        TrackGroup i5 = this.f11690d.mo14583i();
        int i6 = i5.f7606a;
        this.f11675N = -1;
        this.f11674M = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            this.f11674M[i7] = i7;
        }
        TrackGroup[] p0VarArr = new TrackGroup[length];
        for (int i8 = 0; i8 < length; i8++) {
            Format u0Var = (Format) Assertions.m10156h(this.f11708v[i8].mo6953z());
            if (i8 == i3) {
                Format[] u0VarArr = new Format[i6];
                if (i6 == 1) {
                    u0VarArr[0] = u0Var.mo7672p(i5.mo6977l(0));
                } else {
                    for (int i9 = 0; i9 < i6; i9++) {
                        u0VarArr[i9] = m14484D(i5.mo6977l(i9), u0Var, true);
                    }
                }
                p0VarArr[i8] = new TrackGroup(u0VarArr);
                this.f11675N = i8;
            } else {
                p0VarArr[i8] = new TrackGroup(m14484D((i2 != 2 || !MimeTypes.m10409o(u0Var.f8814l)) ? null : this.f11692f, u0Var, false));
            }
        }
        this.f11672K = m14483C(p0VarArr);
        if (this.f11673L == null) {
            z = true;
        }
        Assertions.m10154f(z);
        this.f11673L = Collections.emptySet();
    }

    /* renamed from: y */
    private boolean m14506y(int i) {
        for (int i2 = i; i2 < this.f11700n.size(); i2++) {
            if (((HlsMediaChunk) this.f11700n.get(i2)).f11625o) {
                return false;
            }
        }
        HlsMediaChunk mVar = (HlsMediaChunk) this.f11700n.get(i);
        for (int i3 = 0; i3 < this.f11708v.length; i3++) {
            if (this.f11708v[i3].mo6951w() > mVar.mo14595l(i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O */
    public boolean mo14609O(int i) {
        return !m14494N() && this.f11708v[i].mo6930E(this.f11683V);
    }

    /* renamed from: T */
    public void mo14610T() throws IOException {
        this.f11696j.mo14898j();
        this.f11690d.mo14586m();
    }

    /* renamed from: U */
    public void mo14611U(int i) throws IOException {
        mo14610T();
        this.f11708v[i].mo6931G();
    }

    /* renamed from: V */
    public void mo6889j(Chunk bVar, long j, long j2, boolean z) {
        Chunk bVar2 = bVar;
        this.f11707u = null;
        LoadEventInfo wVar = new LoadEventInfo(bVar2.f7639a, bVar2.f7640b, bVar.mo7010f(), bVar.mo7009e(), j, j2, bVar.mo7007b());
        this.f11695i.mo14889a(bVar2.f7639a);
        this.f11697k.mo6858r(wVar, bVar2.f7641c, this.f11688b, bVar2.f7642d, bVar2.f7643e, bVar2.f7644f, bVar2.f7645g, bVar2.f7646h);
        if (!z) {
            if (m14494N() || this.f11668G == 0) {
                m14500f0();
            }
            if (this.f11668G > 0) {
                this.f11689c.mo6954p(this);
            }
        }
    }

    /* renamed from: W */
    public void mo6892r(Chunk bVar, long j, long j2) {
        Chunk bVar2 = bVar;
        this.f11707u = null;
        this.f11690d.mo14587n(bVar2);
        LoadEventInfo wVar = new LoadEventInfo(bVar2.f7639a, bVar2.f7640b, bVar.mo7010f(), bVar.mo7009e(), j, j2, bVar.mo7007b());
        this.f11695i.mo14889a(bVar2.f7639a);
        this.f11697k.mo6861u(wVar, bVar2.f7641c, this.f11688b, bVar2.f7642d, bVar2.f7643e, bVar2.f7644f, bVar2.f7645g, bVar2.f7646h);
        if (!this.f11667D) {
            mo6809d(this.f11679R);
        } else {
            this.f11689c.mo6954p(this);
        }
    }

    /* renamed from: X */
    public C1901c mo6891p(Chunk bVar, long j, long j2, IOException iOException, int i) {
        C1901c cVar;
        Chunk bVar2 = bVar;
        IOException iOException2 = iOException;
        boolean M = m14493M(bVar);
        if (M && !((HlsMediaChunk) bVar2).mo14599q() && (iOException2 instanceof C1931e)) {
            int i2 = ((C1931e) iOException2).f12452c;
            if (i2 == 410 || i2 == 404) {
                return C1898b0.f12272a;
            }
        }
        long b = bVar.mo7007b();
        LoadEventInfo wVar = new LoadEventInfo(bVar2.f7639a, bVar2.f7640b, bVar.mo7010f(), bVar.mo7009e(), j, j2, b);
        MediaLoadData zVar = new MediaLoadData(bVar2.f7641c, this.f11688b, bVar2.f7642d, bVar2.f7643e, bVar2.f7644f, C.m8861d(bVar2.f7645g), C.m8861d(bVar2.f7646h));
        C1896a aVar = new C1896a(wVar, zVar, iOException2, i);
        long c = this.f11695i.mo14891c(aVar);
        boolean z = false;
        boolean l = c != -9223372036854775807L ? this.f11690d.mo14585l(bVar2, c) : false;
        if (l) {
            if (M && b == 0) {
                ArrayList<HlsMediaChunk> arrayList = this.f11700n;
                if (((HlsMediaChunk) arrayList.remove(arrayList.size() - 1)) == bVar2) {
                    z = true;
                }
                Assertions.m10154f(z);
                if (this.f11700n.isEmpty()) {
                    this.f11680S = this.f11679R;
                } else {
                    ((HlsMediaChunk) Iterables.m12008c(this.f11700n)).mo14597n();
                }
            }
            cVar = C1898b0.f12274c;
        } else {
            long b2 = this.f11695i.mo14890b(aVar);
            if (b2 != -9223372036854775807L) {
                cVar = C1898b0.m14995g(false, b2);
            } else {
                cVar = C1898b0.f12275d;
            }
        }
        C1901c cVar2 = cVar;
        boolean z2 = !cVar2.mo14903c();
        this.f11697k.mo6863w(wVar, bVar2.f7641c, this.f11688b, bVar2.f7642d, bVar2.f7643e, bVar2.f7644f, bVar2.f7645g, bVar2.f7646h, iOException, z2);
        if (z2) {
            this.f11707u = null;
            this.f11695i.mo14889a(bVar2.f7639a);
        }
        if (l) {
            if (!this.f11667D) {
                mo6809d(this.f11679R);
            } else {
                this.f11689c.mo6954p(this);
            }
        }
        return cVar2;
    }

    /* renamed from: Y */
    public void mo14615Y() {
        this.f11710x.clear();
    }

    /* renamed from: Z */
    public boolean mo14616Z(Uri uri, long j) {
        return this.f11690d.mo14588o(uri, j);
    }

    /* renamed from: a */
    public boolean mo6806a() {
        return this.f11696j.mo14897i();
    }

    /* renamed from: a0 */
    public void mo14617a0() {
        if (!this.f11700n.isEmpty()) {
            HlsMediaChunk mVar = (HlsMediaChunk) Iterables.m12008c(this.f11700n);
            int b = this.f11690d.mo14580b(mVar);
            if (b == 1) {
                mVar.mo14600v();
            } else if (b == 2 && !this.f11683V && this.f11696j.mo14897i()) {
                this.f11696j.mo14894e();
            }
        }
    }

    /* renamed from: b */
    public long mo6807b() {
        if (m14494N()) {
            return this.f11680S;
        }
        return this.f11683V ? Long.MIN_VALUE : m14489I().f7646h;
    }

    /* renamed from: c */
    public long mo6808c() {
        if (this.f11683V) {
            return Long.MIN_VALUE;
        }
        if (m14494N()) {
            return this.f11680S;
        }
        long j = this.f11679R;
        HlsMediaChunk I = m14489I();
        if (!I.mo14598p()) {
            if (this.f11700n.size() > 1) {
                ArrayList<HlsMediaChunk> arrayList = this.f11700n;
                I = (HlsMediaChunk) arrayList.get(arrayList.size() - 2);
            } else {
                I = null;
            }
        }
        if (I != null) {
            j = Math.max(j, I.f7646h);
        }
        if (this.f11666C) {
            for (C1832d t : this.f11708v) {
                j = Math.max(j, t.mo6949t());
            }
        }
        return j;
    }

    /* renamed from: c0 */
    public void mo14618c0(TrackGroup[] p0VarArr, int i, int... iArr) {
        this.f11672K = m14483C(p0VarArr);
        this.f11673L = new HashSet();
        for (int l : iArr) {
            this.f11673L.add(this.f11672K.mo6988l(l));
        }
        this.f11675N = i;
        Handler handler = this.f11704r;
        C1830b bVar = this.f11689c;
        Objects.requireNonNull(bVar);
        handler.post(new C1822c(bVar));
        m14502k0();
    }

    /* renamed from: d */
    public boolean mo6809d(long j) {
        long j2;
        List<HlsMediaChunk> list;
        if (this.f11683V || this.f11696j.mo14897i() || this.f11696j.mo14896h()) {
            return false;
        }
        if (m14494N()) {
            list = Collections.emptyList();
            j2 = this.f11680S;
            for (C1832d T : this.f11708v) {
                T.mo6940T(this.f11680S);
            }
        } else {
            list = this.f11701o;
            HlsMediaChunk I = m14489I();
            if (I.mo14598p()) {
                j2 = I.f7646h;
            } else {
                j2 = Math.max(this.f11679R, I.f7645g);
            }
        }
        List list2 = list;
        this.f11690d.mo14581d(j, j2, list2, this.f11667D || !list2.isEmpty(), this.f11699m);
        C1825b bVar = this.f11699m;
        boolean z = bVar.f11596b;
        Chunk bVar2 = bVar.f11595a;
        Uri uri = bVar.f11597c;
        bVar.mo14594a();
        if (z) {
            this.f11680S = -9223372036854775807L;
            this.f11683V = true;
            return true;
        } else if (bVar2 == null) {
            if (uri != null) {
                this.f11689c.mo14606j(uri);
            }
            return false;
        } else {
            if (m14493M(bVar2)) {
                m14492L((HlsMediaChunk) bVar2);
            }
            this.f11707u = bVar2;
            long n = this.f11696j.mo14902n(bVar2, this, this.f11695i.mo14892d(bVar2.f7641c));
            C1084a aVar = this.f11697k;
            LoadEventInfo wVar = new LoadEventInfo(bVar2.f7639a, bVar2.f7640b, n);
            aVar.mo6842A(wVar, bVar2.f7641c, this.f11688b, bVar2.f7642d, bVar2.f7643e, bVar2.f7644f, bVar2.f7645g, bVar2.f7646h);
            return true;
        }
    }

    /* renamed from: d0 */
    public int mo14619d0(int i, FormatHolder v0Var, DecoderInputBuffer fVar, boolean z) {
        Format u0Var;
        if (m14494N()) {
            return -3;
        }
        int i2 = 0;
        if (!this.f11700n.isEmpty()) {
            int i3 = 0;
            while (i3 < this.f11700n.size() - 1 && m14487G((HlsMediaChunk) this.f11700n.get(i3))) {
                i3++;
            }
            Util.m10238A0(this.f11700n, 0, i3);
            HlsMediaChunk mVar = (HlsMediaChunk) this.f11700n.get(0);
            Format u0Var2 = mVar.f7642d;
            if (!u0Var2.equals(this.f11670I)) {
                this.f11697k.mo6849c(this.f11688b, u0Var2, mVar.f7643e, mVar.f7644f, mVar.f7645g);
            }
            this.f11670I = u0Var2;
        }
        if (!this.f11700n.isEmpty() && !((HlsMediaChunk) this.f11700n.get(0)).mo14599q()) {
            return -3;
        }
        int L = this.f11708v[i].mo6934L(v0Var, fVar, z, this.f11683V);
        if (L == -5) {
            Format u0Var3 = (Format) Assertions.m10153e(v0Var.f8869b);
            if (i == this.f11665B) {
                int J = this.f11708v[i].mo6932J();
                while (i2 < this.f11700n.size() && ((HlsMediaChunk) this.f11700n.get(i2)).f11622l != J) {
                    i2++;
                }
                if (i2 < this.f11700n.size()) {
                    u0Var = ((HlsMediaChunk) this.f11700n.get(i2)).f7642d;
                } else {
                    u0Var = (Format) Assertions.m10153e(this.f11669H);
                }
                u0Var3 = u0Var3.mo7672p(u0Var);
            }
            v0Var.f8869b = u0Var3;
        }
        return L;
    }

    /* renamed from: e */
    public void mo6810e(long j) {
        if (!this.f11696j.mo14896h() && !m14494N()) {
            if (this.f11696j.mo14897i()) {
                Assertions.m10153e(this.f11707u);
                if (this.f11690d.mo14592t(j, this.f11707u, this.f11701o)) {
                    this.f11696j.mo14894e();
                }
                return;
            }
            int size = this.f11701o.size();
            while (size > 0 && this.f11690d.mo14580b((HlsMediaChunk) this.f11701o.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.f11701o.size()) {
                m14485E(size);
            }
            int g = this.f11690d.mo14582g(j, this.f11701o);
            if (g < this.f11700n.size()) {
                m14485E(g);
            }
        }
    }

    /* renamed from: e0 */
    public void mo14620e0() {
        if (this.f11667D) {
            for (C1832d K : this.f11708v) {
                K.mo6933K();
            }
        }
        this.f11696j.mo14901m(this);
        this.f11704r.removeCallbacksAndMessages(null);
        this.f11671J = true;
        this.f11705s.clear();
    }

    /* renamed from: f */
    public void mo6216f(SeekMap yVar) {
    }

    /* renamed from: h */
    public void mo6217h() {
        this.f11684W = true;
        this.f11704r.post(this.f11703q);
    }

    /* renamed from: h0 */
    public boolean mo14621h0(long j, boolean z) {
        this.f11679R = j;
        if (m14494N()) {
            this.f11680S = j;
            return true;
        }
        if (this.f11666C && !z && m14501g0(j)) {
            return false;
        }
        this.f11680S = j;
        this.f11683V = false;
        this.f11700n.clear();
        if (this.f11696j.mo14897i()) {
            if (this.f11666C) {
                for (C1832d o : this.f11708v) {
                    o.mo6946o();
                }
            }
            this.f11696j.mo14894e();
        } else {
            this.f11696j.mo14895f();
            m14500f0();
        }
        return true;
    }

    /* renamed from: i */
    public void mo6888i() {
        for (C1832d M : this.f11708v) {
            M.mo6935M();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0131  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14622i0(p067c.p068a.p069a.p070a.p110l2.C1174h[] r20, boolean[] r21, p067c.p068a.p069a.p070a.p097j2.SampleStream[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            r19.m14504v()
            int r3 = r0.f11668G
            r14 = 0
            r4 = 0
        L_0x000f:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x002f
            r5 = r2[r4]
            com.google.android.exoplayer2.source.hls.p r5 = (com.google.android.exoplayer2.source.hls.HlsSampleStream) r5
            if (r5 == 0) goto L_0x002c
            r7 = r1[r4]
            if (r7 == 0) goto L_0x0022
            boolean r7 = r21[r4]
            if (r7 != 0) goto L_0x002c
        L_0x0022:
            int r7 = r0.f11668G
            int r7 = r7 - r15
            r0.f11668G = r7
            r5.mo14608g()
            r2[r4] = r6
        L_0x002c:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002f:
            if (r26 != 0) goto L_0x0041
            boolean r4 = r0.f11682U
            if (r4 == 0) goto L_0x0038
            if (r3 != 0) goto L_0x003f
            goto L_0x0041
        L_0x0038:
            long r3 = r0.f11679R
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = 0
            goto L_0x0042
        L_0x0041:
            r3 = 1
        L_0x0042:
            com.google.android.exoplayer2.source.hls.i r4 = r0.f11690d
            c.a.a.a.l2.h r4 = r4.mo14584j()
            r16 = r3
            r11 = r4
            r3 = 0
        L_0x004c:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x00a3
            r5 = r1[r3]
            if (r5 != 0) goto L_0x0054
            goto L_0x00a0
        L_0x0054:
            c.a.a.a.j2.q0 r7 = r0.f11672K
            c.a.a.a.j2.p0 r8 = r5.mo7265k()
            int r7 = r7.mo6989m(r8)
            int r8 = r0.f11675N
            if (r7 != r8) goto L_0x0068
            com.google.android.exoplayer2.source.hls.i r8 = r0.f11690d
            r8.mo14591s(r5)
            r11 = r5
        L_0x0068:
            r5 = r2[r3]
            if (r5 != 0) goto L_0x00a0
            int r5 = r0.f11668G
            int r5 = r5 + r15
            r0.f11668G = r5
            com.google.android.exoplayer2.source.hls.p r5 = new com.google.android.exoplayer2.source.hls.p
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r5 = r0.f11674M
            if (r5 == 0) goto L_0x00a0
            r5 = r2[r3]
            com.google.android.exoplayer2.source.hls.p r5 = (com.google.android.exoplayer2.source.hls.HlsSampleStream) r5
            r5.mo14607d()
            if (r16 != 0) goto L_0x00a0
            com.google.android.exoplayer2.source.hls.q$d[] r5 = r0.f11708v
            int[] r8 = r0.f11674M
            r7 = r8[r7]
            r5 = r5[r7]
            boolean r7 = r5.mo6938R(r12, r15)
            if (r7 != 0) goto L_0x009d
            int r5 = r5.mo6951w()
            if (r5 == 0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            r16 = r5
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x00a3:
            int r1 = r0.f11668G
            if (r1 != 0) goto L_0x00da
            com.google.android.exoplayer2.source.hls.i r1 = r0.f11690d
            r1.mo14589p()
            r0.f11670I = r6
            r0.f11681T = r15
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.m> r1 = r0.f11700n
            r1.clear()
            com.google.android.exoplayer2.upstream.b0 r1 = r0.f11696j
            boolean r1 = r1.mo14897i()
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r0.f11666C
            if (r1 == 0) goto L_0x00ce
            com.google.android.exoplayer2.source.hls.q$d[] r1 = r0.f11708v
            int r3 = r1.length
        L_0x00c4:
            if (r14 >= r3) goto L_0x00ce
            r4 = r1[r14]
            r4.mo6946o()
            int r14 = r14 + 1
            goto L_0x00c4
        L_0x00ce:
            com.google.android.exoplayer2.upstream.b0 r1 = r0.f11696j
            r1.mo14894e()
            goto L_0x0140
        L_0x00d5:
            r19.m14500f0()
            goto L_0x0140
        L_0x00da:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.m> r1 = r0.f11700n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x012d
            boolean r1 = p067c.p068a.p069a.p070a.p111m2.Util.m10279b(r11, r4)
            if (r1 != 0) goto L_0x012d
            boolean r1 = r0.f11682U
            if (r1 != 0) goto L_0x0124
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f3
            long r3 = -r12
        L_0x00f3:
            r6 = r3
            com.google.android.exoplayer2.source.hls.m r1 = r19.m14489I()
            com.google.android.exoplayer2.source.hls.i r3 = r0.f11690d
            c.a.a.a.j2.t0.e[] r17 = r3.mo14579a(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.exoplayer2.source.hls.m> r10 = r0.f11701o
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.mo7247i(r4, r6, r8, r10, r11)
            com.google.android.exoplayer2.source.hls.i r3 = r0.f11690d
            c.a.a.a.j2.p0 r3 = r3.mo14583i()
            c.a.a.a.u0 r1 = r1.f7642d
            int r1 = r3.mo6978m(r1)
            int r3 = r18.mo7264j()
            if (r3 == r1) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r1 = 0
            goto L_0x0125
        L_0x0124:
            r1 = 1
        L_0x0125:
            if (r1 == 0) goto L_0x012d
            r0.f11681T = r15
            r1 = 1
            r16 = 1
            goto L_0x012f
        L_0x012d:
            r1 = r26
        L_0x012f:
            if (r16 == 0) goto L_0x0140
            r0.mo14621h0(r12, r1)
        L_0x0134:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x0140
            r1 = r2[r14]
            if (r1 == 0) goto L_0x013d
            r23[r14] = r15
        L_0x013d:
            int r14 = r14 + 1
            goto L_0x0134
        L_0x0140:
            r0.m14503p0(r2)
            r0.f11682U = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.mo14622i0(c.a.a.a.l2.h[], boolean[], c.a.a.a.j2.l0[], boolean[], long, boolean):boolean");
    }

    /* renamed from: j0 */
    public void mo14623j0(DrmInitData tVar) {
        if (!Util.m10279b(this.f11686Y, tVar)) {
            this.f11686Y = tVar;
            int i = 0;
            while (true) {
                C1832d[] dVarArr = this.f11708v;
                if (i < dVarArr.length) {
                    if (this.f11678Q[i]) {
                        dVarArr[i].mo14633a0(tVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l0 */
    public void mo14624l0(boolean z) {
        this.f11690d.mo14590r(z);
    }

    /* renamed from: m */
    public void mo6890m(Format u0Var) {
        this.f11704r.post(this.f11702p);
    }

    /* renamed from: m0 */
    public void mo14625m0(long j) {
        if (this.f11685X != j) {
            this.f11685X = j;
            for (C1832d S : this.f11708v) {
                S.mo6939S(j);
            }
        }
    }

    /* renamed from: n0 */
    public int mo14626n0(int i, long j) {
        int i2 = 0;
        if (m14494N()) {
            return 0;
        }
        C1832d dVar = this.f11708v[i];
        int y = dVar.mo6952y(j, this.f11683V);
        int w = dVar.mo6951w();
        while (true) {
            if (i2 >= this.f11700n.size()) {
                break;
            }
            HlsMediaChunk mVar = (HlsMediaChunk) this.f11700n.get(i2);
            int l = ((HlsMediaChunk) this.f11700n.get(i2)).mo14595l(i);
            if (w + y <= l) {
                break;
            } else if (!mVar.mo14599q()) {
                y = l - w;
                break;
            } else {
                i2++;
            }
        }
        dVar.mo6942W(y);
        return y;
    }

    /* renamed from: o */
    public TrackGroupArray mo14627o() {
        m14504v();
        return this.f11672K;
    }

    /* renamed from: o0 */
    public void mo14628o0(int i) {
        m14504v();
        Assertions.m10153e(this.f11674M);
        int i2 = this.f11674M[i];
        Assertions.m10154f(this.f11677P[i2]);
        this.f11677P[i2] = false;
    }

    /* renamed from: q */
    public C0916b0 mo6218q(int i, int i2) {
        C0916b0 b0Var;
        if (!f11663a.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                C0916b0[] b0VarArr = this.f11708v;
                if (i3 >= b0VarArr.length) {
                    b0Var = null;
                    break;
                } else if (this.f11709w[i3] == i) {
                    b0Var = b0VarArr[i3];
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            b0Var = m14490J(i, i2);
        }
        if (b0Var == null) {
            if (this.f11684W) {
                return m14481A(i, i2);
            }
            b0Var = m14482B(i, i2);
        }
        if (i2 != 5) {
            return b0Var;
        }
        if (this.f11712z == null) {
            this.f11712z = new C1831c(b0Var, this.f11698l);
        }
        return this.f11712z;
    }

    /* renamed from: s */
    public void mo14629s() throws IOException {
        mo14610T();
        if (this.f11683V && !this.f11667D) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: t */
    public void mo14630t(long j, boolean z) {
        if (this.f11666C && !m14494N()) {
            int length = this.f11708v.length;
            for (int i = 0; i < length; i++) {
                this.f11708v[i].mo6945n(j, z, this.f11677P[i]);
            }
        }
    }

    /* renamed from: w */
    public int mo14631w(int i) {
        m14504v();
        Assertions.m10153e(this.f11674M);
        int i2 = this.f11674M[i];
        int i3 = -2;
        if (i2 == -1) {
            if (this.f11673L.contains(this.f11672K.mo6988l(i))) {
                i3 = -3;
            }
            return i3;
        }
        boolean[] zArr = this.f11677P;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    /* renamed from: z */
    public void mo14632z() {
        if (!this.f11667D) {
            mo6809d(this.f11679R);
        }
    }
}
